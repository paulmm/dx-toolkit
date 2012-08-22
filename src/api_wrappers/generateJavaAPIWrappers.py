#!/usr/bin/env python

import os, sys, json, re

preamble = '''/* Do not modify this file by hand.
 *
 * It is automatically generated by src/api_wrappers/generateJavaAPIWrappers.py.
 * (Run make api_wrappers to update it.)
 */

package com.dnanexus;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.dnanexus.DXHTTPRequest;

public class DXAPI {'''

postscript = '''}
'''

class_method_template = '''
    public JsonNode {method_name}(JsonNode inputParams) throws Exception {{
        return new DXHTTPRequest().request("{route}", inputParams);
    }}'''

object_method_template = '''
    public JsonNode {method_name}(String objectId, JsonNode inputParams) throws Exception {{
        return new DXHTTPRequest().request("/" + objectId + "/" + "{method_route}", inputParams);
    }}'''

#app_object_method_template = '''
#def {method_name}(app_name_or_id, alias=None, input_params={{}}, **kwargs):
#    fully_qualified_version = app_name_or_id + (('/' + alias) if alias else '')
#    return DXHTTPRequest('/%s/{method_route}' % fully_qualified_version, input_params, **kwargs)
#'''
app_object_method_template = object_method_template

print preamble

for method in json.loads(sys.stdin.read()):
    route, signature, opts = method
    method_name = signature.split("(")[0]
    if (opts['objectMethod']):
        root, oid_route, method_route = route.split("/")
        if oid_route == 'app-xxxx':
            print app_object_method_template.format(method_name=method_name, method_route=method_route)
        else:
            print object_method_template.format(method_name=method_name, method_route=method_route)
    else:
        print class_method_template.format(method_name=method_name, route=route)

print postscript