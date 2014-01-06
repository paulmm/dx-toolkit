DNAnexus Virtual Filesystem (DXFS)
==================================

The DNAnexus Virtual Filesystem lets you mount DNAnexus Platform projects as
directories in your computer's filesystem. See [the Virtual Filesystem page on
the wiki](https://wiki.dnanexus.com/Virtual-Filesystem) for more information
about how to get started.

Debugging
---------

Run dxfs as follows to make debug messages show up on the console:

    dx-mount --debug --foreground path/to/mountpoint
