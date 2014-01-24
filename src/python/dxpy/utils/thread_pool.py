# Copyright (C) 2013-2014 DNAnexus, Inc.
#
# This file is part of dx-toolkit (DNAnexus platform client libraries).
#
#   Licensed under the Apache License, Version 2.0 (the "License"); you may not
#   use this file except in compliance with the License. You may obtain a copy
#   of the License at
#
#       http://www.apache.org/licenses/LICENSE-2.0
#
#   Unless required by applicable law or agreed to in writing, software
#   distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
#   WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
#   License for the specific language governing permissions and limitations
#   under the License.

import collections
import concurrent.futures
import threading


# Monkeypatch ThreadPoolExecutor with relevant logic from the patch for
# Python issue 16284. See:
#
#   <http://bugs.python.org/issue16284>
#   <http://hg.python.org/cpython/rev/70cef0a160cf/>
#
# We may need to apply the relevant parts of the patches to
# ProcessPoolExecutor and multiprocessing.Queue if we ever start using
# those, too.
def _non_leaky_worker(executor_reference, work_queue):
    try:
        while True:
            try:
                work_item = work_queue.get(block=True, timeout=0.1)
            except concurrent.futures.thread.queue.Empty:
                executor = executor_reference()
                # Exit if:
                #   - The interpreter is shutting down OR
                #   - The executor that owns the worker has been collected OR
                #   - The executor that owns the worker has been shutdown.
                if concurrent.futures.thread._shutdown or executor is None or executor._shutdown:
                    return
                del executor
            else:
                work_item.run()
                del work_item # <= free this item before the next
                              #    work_queue.get call runs, rather than
                              #    after
    except BaseException:
        concurrent.futures.thread._base.LOGGER.critical('Exception in worker', exc_info=True)

concurrent.futures.thread._worker = _non_leaky_worker


class WrappedFuture(object):
    def __init__(self, callable_, args, kwargs):
        self._inner_future = None
        self._callable = callable_
        self._args = args
        self._kwargs = kwargs
        self._binding = threading.Lock()
        self._binding.acquire()
    def get_args(self):
        return self._callable, self._args, self._kwargs
    def bind(self, future):
        self._inner_future = future
        self._binding.release()
    def done(self):
        return self._inner_future is not None and self._inner_future.done()
    def result(self, timeout=None):
        # TODO: respect timeout. This means accepting a timeout in
        # waiting to acquire _binding, and then decreasing the timeout
        # for _inner_future according to the amount of time that has
        # elapsed while waiting
        self._binding.acquire() # Wait until the real future is bound
        self._binding.release()
        return self._inner_future.result(timeout=timeout)
    def exception(self, timeout=None):
        self._binding.acquire() # Wait until the real future is bound
        self._binding.release()
        return self._inner_future.exception(timeout=timeout)

def _run_callable_with_postamble(postamble, callable_, *args, **kwargs):
    """Returns a callable of no args that invokes callable_ (with the
    specified args and kwargs) and then invokes postamble (with no
    args).

    """
    def fn():
        try:
            return callable_(*args, **kwargs)
        finally:
            postamble()
    return fn

class PrioritizingThreadPool(object):
    """Presents an abstraction similar to that of
    concurrent.futures.Executor except that multiple clients may write
    their tasks to separate queues (which may be distinguished by any
    hashable object).

    When a worker is available, the queues are served in a round-robin
    manner.

    """

    def __init__(self, max_workers):
        self._pool = concurrent.futures.ThreadPoolExecutor(max_workers=max_workers)
        self._tasks = threading.Semaphore(max_workers)
        self._queue_lock = threading.Lock()
        # Counter to help us serve the queues fairly.
        self._num_tasks_submitted = 0
        # Mapping of queue_id to a NONEMPTY list of WrappedFutures
        # representing items in that queue.
        self._queues = {}

    def _submit_one(self, callable_, *args, **kwargs):
        """Starts the next task (which, if successful, will, in turn, start one
        more task when finished, which will, in turn, etc.). Returns a
        future object corresponding to the newly started task.

        Thread safety note: assumes that the caller has already reserved
        a worker using self._tasks.

        """
        def postamble():
            self._tasks.release()
            self._maybe_schedule_task()
        return self._pool.submit(_run_callable_with_postamble(postamble, callable_, *args, **kwargs))

    def _maybe_schedule_task(self):
        """Starts a task if there is an available worker to serve it.

        Thread safe.

        """
        if self._tasks.acquire(blocking=False):
            # Atomically remove the item from the queue and feed it to
            # the ThreadPoolExecutor.
            self._queue_lock.acquire()
            try:
                future = self._next()
            except StopIteration:
                # Oops, there is in fact no task to be served, so we
                # won't be tying up a worker after all.
                self._tasks.release()
            else:
                callable_, args, kwargs = future.get_args()
                future.bind(self._submit_one(callable_, *args, **kwargs))
            finally:
                self._queue_lock.release()

    def _next(self):
        """Pops the highest priority task.

        Returns the WrappedFuture corresponding to that task (and
        removes it from the queue of items to be scheduled).

        Thread safety note: assumes the caller is holding
        self._queue_lock (the caller will probably also want to hold the
        same lock while scheduling the result of this method, so as to
        make the pop+schedule operation atomic).

        """
        queue_ids = list(self._queues.keys())
        if not queue_ids:
            raise StopIteration()
        # Select the next queue to serve using a simple incrementing
        # counter. Some weirdness may be possible here when serving the
        # last task from a queue causes that queue's key to be removed,
        # but that's probably inconsequential in the long run.
        #
        # TODO: what is ideal here is probably to serve the tasks in
        # increasing order of prefetch depth
        queue_id = queue_ids[self._num_tasks_submitted % len(queue_ids)]
        self._num_tasks_submitted += 1
        future = self._queues[queue_id].popleft()
        if len(self._queues[queue_id]) == 0:
            del self._queues[queue_id]
        return future

    def submit(self, callable_, *args, **kwargs):
        return self.submit_to_queue(None, callable_, *args, **kwargs)

    def submit_to_queue(self, queue_id, callable_, *args, **kwargs):
        # The task may or may not get picked up by a worker immediately.
        # Create a wrapper for the future so we can return a handle
        # immediately to the caller in either case. When the task is
        # actually started, we'll 'bind' this object so that it presents
        # a view of the real future returned by the ThreadPoolExecutor.
        f = WrappedFuture(callable_, args, kwargs)
        if queue_id not in self._queues:
            self._queues[queue_id] = collections.deque()
        self._queues[queue_id].append(f)

        # Start the task now if there is a worker that can serve it.
        self._maybe_schedule_task()

        return f
