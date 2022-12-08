<a name="__pageTop"></a>
# slack.apis.tags.files_remote_api.FilesRemoteApi

All URIs are relative to *https://slack.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**files_remote_add**](#files_remote_add) | **post** /files.remote.add | 
[**files_remote_info**](#files_remote_info) | **get** /files.remote.info | 
[**files_remote_list**](#files_remote_list) | **get** /files.remote.list | 
[**files_remote_remove**](#files_remote_remove) | **post** /files.remote.remove | 
[**files_remote_share**](#files_remote_share) | **get** /files.remote.share | 
[**files_remote_update**](#files_remote_update) | **post** /files.remote.update | 

# **files_remote_add**
<a name="files_remote_add"></a>
> {str: (bool, date, datetime, dict, float, int, list, str, none_type)} files_remote_add()



Adds a file from a remote service

### Example

* OAuth Authentication (slackAuth):
```python
import slack
from slack.apis.tags import files_remote_api
from slack.model.defs_ok_false import DefsOkFalse
from slack.model.defs_ok_true import DefsOkTrue
from pprint import pprint
# Defining the host is optional and defaults to https://slack.com/api
# See configuration.py for a list of all supported configuration parameters.
configuration = slack.Configuration(
    host = "https://slack.com/api"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure OAuth2 access token for authorization: slackAuth
configuration = slack.Configuration(
    host = "https://slack.com/api"
)
configuration.access_token = 'YOUR_ACCESS_TOKEN'
# Enter a context with an instance of the API client
with slack.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = files_remote_api.FilesRemoteApi(api_client)

    # example passing only optional values
    body = dict(
        external_id="external_id_example",
        external_url="external_url_example",
        filetype="filetype_example",
        indexable_file_contents="indexable_file_contents_example",
        preview_image="preview_image_example",
        title="title_example",
        token="token_example",
    )
    try:
        api_response = api_instance.files_remote_add(
            body=body,
        )
        pprint(api_response)
    except slack.ApiException as e:
        print("Exception when calling FilesRemoteApi->files_remote_add: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
body | typing.Union[SchemaForRequestBodyApplicationXWwwFormUrlencoded, Unset] | optional, default is unset |
content_type | str | optional, default is 'application/x-www-form-urlencoded' | Selects the schema and serialization of the request body
accept_content_types | typing.Tuple[str] | default is ('application/json', ) | Tells the server the content type(s) that are accepted by the client
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### body

# SchemaForRequestBodyApplicationXWwwFormUrlencoded

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**external_id** | str,  | str,  | Creator defined GUID for the file. | [optional] 
**external_url** | str,  | str,  | URL of the remote file. | [optional] 
**filetype** | str,  | str,  | type of file | [optional] 
**indexable_file_contents** | str,  | str,  | A text file (txt, pdf, doc, etc.) containing textual search terms that are used to improve discovery of the remote file. | [optional] 
**preview_image** | str,  | str,  | Preview of the document via &#x60;multipart/form-data&#x60;. | [optional] 
**title** | str,  | str,  | Title of the file being shared. | [optional] 
**token** | str,  | str,  | Authentication token. Requires scope: &#x60;remote_files:write&#x60; | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#files_remote_add.ApiResponseFor200) | Typical success response
default | [ApiResponseForDefault](#files_remote_add.ApiResponseForDefault) | Typical error response

#### files_remote_add.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson

This method either only returns a brief _OK_ response or a verbose schema is not available for this method.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | This method either only returns a brief _OK_ response or a verbose schema is not available for this method. | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**ok** | [**DefsOkTrue**]({{complexTypePrefix}}DefsOkTrue.md) | [**DefsOkTrue**]({{complexTypePrefix}}DefsOkTrue.md) |  | 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

#### files_remote_add.ApiResponseForDefault
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor0ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor0ResponseBodyApplicationJson

This method either only returns a brief _not OK_ response or a verbose schema is not available for this method.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | This method either only returns a brief _not OK_ response or a verbose schema is not available for this method. | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**ok** | [**DefsOkFalse**]({{complexTypePrefix}}DefsOkFalse.md) | [**DefsOkFalse**]({{complexTypePrefix}}DefsOkFalse.md) |  | 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

### Authorization

[slackAuth](../../../README.md#slackAuth)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **files_remote_info**
<a name="files_remote_info"></a>
> {str: (bool, date, datetime, dict, float, int, list, str, none_type)} files_remote_info()



Retrieve information about a remote file added to Slack

### Example

* OAuth Authentication (slackAuth):
```python
import slack
from slack.apis.tags import files_remote_api
from slack.model.defs_ok_false import DefsOkFalse
from slack.model.defs_ok_true import DefsOkTrue
from pprint import pprint
# Defining the host is optional and defaults to https://slack.com/api
# See configuration.py for a list of all supported configuration parameters.
configuration = slack.Configuration(
    host = "https://slack.com/api"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure OAuth2 access token for authorization: slackAuth
configuration = slack.Configuration(
    host = "https://slack.com/api"
)
configuration.access_token = 'YOUR_ACCESS_TOKEN'
# Enter a context with an instance of the API client
with slack.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = files_remote_api.FilesRemoteApi(api_client)

    # example passing only optional values
    query_params = {
        'token': "token_example",
        'file': "file_example",
        'external_id': "external_id_example",
    }
    try:
        api_response = api_instance.files_remote_info(
            query_params=query_params,
        )
        pprint(api_response)
    except slack.ApiException as e:
        print("Exception when calling FilesRemoteApi->files_remote_info: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
query_params | RequestQueryParams | |
accept_content_types | typing.Tuple[str] | default is ('application/json', ) | Tells the server the content type(s) that are accepted by the client
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### query_params
#### RequestQueryParams

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
token | TokenSchema | | optional
file | FileSchema | | optional
external_id | ExternalIdSchema | | optional


# TokenSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# FileSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# ExternalIdSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#files_remote_info.ApiResponseFor200) | Typical success response
default | [ApiResponseForDefault](#files_remote_info.ApiResponseForDefault) | Typical error response

#### files_remote_info.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson

This method either only returns a brief _OK_ response or a verbose schema is not available for this method.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | This method either only returns a brief _OK_ response or a verbose schema is not available for this method. | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**ok** | [**DefsOkTrue**]({{complexTypePrefix}}DefsOkTrue.md) | [**DefsOkTrue**]({{complexTypePrefix}}DefsOkTrue.md) |  | 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

#### files_remote_info.ApiResponseForDefault
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor0ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor0ResponseBodyApplicationJson

This method either only returns a brief _not OK_ response or a verbose schema is not available for this method.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | This method either only returns a brief _not OK_ response or a verbose schema is not available for this method. | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**ok** | [**DefsOkFalse**]({{complexTypePrefix}}DefsOkFalse.md) | [**DefsOkFalse**]({{complexTypePrefix}}DefsOkFalse.md) |  | 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

### Authorization

[slackAuth](../../../README.md#slackAuth)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **files_remote_list**
<a name="files_remote_list"></a>
> {str: (bool, date, datetime, dict, float, int, list, str, none_type)} files_remote_list()



Retrieve information about a remote file added to Slack

### Example

* OAuth Authentication (slackAuth):
```python
import slack
from slack.apis.tags import files_remote_api
from slack.model.defs_ok_false import DefsOkFalse
from slack.model.defs_ok_true import DefsOkTrue
from pprint import pprint
# Defining the host is optional and defaults to https://slack.com/api
# See configuration.py for a list of all supported configuration parameters.
configuration = slack.Configuration(
    host = "https://slack.com/api"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure OAuth2 access token for authorization: slackAuth
configuration = slack.Configuration(
    host = "https://slack.com/api"
)
configuration.access_token = 'YOUR_ACCESS_TOKEN'
# Enter a context with an instance of the API client
with slack.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = files_remote_api.FilesRemoteApi(api_client)

    # example passing only optional values
    query_params = {
        'token': "token_example",
        'channel': "channel_example",
        'ts_from': 3.14,
        'ts_to': 3.14,
        'limit': 1,
        'cursor': "cursor_example",
    }
    try:
        api_response = api_instance.files_remote_list(
            query_params=query_params,
        )
        pprint(api_response)
    except slack.ApiException as e:
        print("Exception when calling FilesRemoteApi->files_remote_list: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
query_params | RequestQueryParams | |
accept_content_types | typing.Tuple[str] | default is ('application/json', ) | Tells the server the content type(s) that are accepted by the client
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### query_params
#### RequestQueryParams

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
token | TokenSchema | | optional
channel | ChannelSchema | | optional
ts_from | TsFromSchema | | optional
ts_to | TsToSchema | | optional
limit | LimitSchema | | optional
cursor | CursorSchema | | optional


# TokenSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# ChannelSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# TsFromSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
decimal.Decimal, int, float,  | decimal.Decimal,  |  | 

# TsToSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
decimal.Decimal, int, float,  | decimal.Decimal,  |  | 

# LimitSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
decimal.Decimal, int,  | decimal.Decimal,  |  | 

# CursorSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#files_remote_list.ApiResponseFor200) | Typical success response
default | [ApiResponseForDefault](#files_remote_list.ApiResponseForDefault) | Typical error response

#### files_remote_list.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson

This method either only returns a brief _OK_ response or a verbose schema is not available for this method.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | This method either only returns a brief _OK_ response or a verbose schema is not available for this method. | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**ok** | [**DefsOkTrue**]({{complexTypePrefix}}DefsOkTrue.md) | [**DefsOkTrue**]({{complexTypePrefix}}DefsOkTrue.md) |  | 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

#### files_remote_list.ApiResponseForDefault
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor0ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor0ResponseBodyApplicationJson

This method either only returns a brief _not OK_ response or a verbose schema is not available for this method.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | This method either only returns a brief _not OK_ response or a verbose schema is not available for this method. | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**ok** | [**DefsOkFalse**]({{complexTypePrefix}}DefsOkFalse.md) | [**DefsOkFalse**]({{complexTypePrefix}}DefsOkFalse.md) |  | 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

### Authorization

[slackAuth](../../../README.md#slackAuth)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **files_remote_remove**
<a name="files_remote_remove"></a>
> {str: (bool, date, datetime, dict, float, int, list, str, none_type)} files_remote_remove()



Remove a remote file.

### Example

* OAuth Authentication (slackAuth):
```python
import slack
from slack.apis.tags import files_remote_api
from slack.model.defs_ok_false import DefsOkFalse
from slack.model.defs_ok_true import DefsOkTrue
from pprint import pprint
# Defining the host is optional and defaults to https://slack.com/api
# See configuration.py for a list of all supported configuration parameters.
configuration = slack.Configuration(
    host = "https://slack.com/api"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure OAuth2 access token for authorization: slackAuth
configuration = slack.Configuration(
    host = "https://slack.com/api"
)
configuration.access_token = 'YOUR_ACCESS_TOKEN'
# Enter a context with an instance of the API client
with slack.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = files_remote_api.FilesRemoteApi(api_client)

    # example passing only optional values
    body = dict(
        external_id="external_id_example",
        file="file_example",
        token="token_example",
    )
    try:
        api_response = api_instance.files_remote_remove(
            body=body,
        )
        pprint(api_response)
    except slack.ApiException as e:
        print("Exception when calling FilesRemoteApi->files_remote_remove: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
body | typing.Union[SchemaForRequestBodyApplicationXWwwFormUrlencoded, Unset] | optional, default is unset |
content_type | str | optional, default is 'application/x-www-form-urlencoded' | Selects the schema and serialization of the request body
accept_content_types | typing.Tuple[str] | default is ('application/json', ) | Tells the server the content type(s) that are accepted by the client
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### body

# SchemaForRequestBodyApplicationXWwwFormUrlencoded

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**external_id** | str,  | str,  | Creator defined GUID for the file. | [optional] 
**file** | str,  | str,  | Specify a file by providing its ID. | [optional] 
**token** | str,  | str,  | Authentication token. Requires scope: &#x60;remote_files:write&#x60; | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#files_remote_remove.ApiResponseFor200) | Typical success response
default | [ApiResponseForDefault](#files_remote_remove.ApiResponseForDefault) | Typical error response

#### files_remote_remove.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson

This method either only returns a brief _OK_ response or a verbose schema is not available for this method.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | This method either only returns a brief _OK_ response or a verbose schema is not available for this method. | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**ok** | [**DefsOkTrue**]({{complexTypePrefix}}DefsOkTrue.md) | [**DefsOkTrue**]({{complexTypePrefix}}DefsOkTrue.md) |  | 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

#### files_remote_remove.ApiResponseForDefault
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor0ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor0ResponseBodyApplicationJson

This method either only returns a brief _not OK_ response or a verbose schema is not available for this method.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | This method either only returns a brief _not OK_ response or a verbose schema is not available for this method. | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**ok** | [**DefsOkFalse**]({{complexTypePrefix}}DefsOkFalse.md) | [**DefsOkFalse**]({{complexTypePrefix}}DefsOkFalse.md) |  | 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

### Authorization

[slackAuth](../../../README.md#slackAuth)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **files_remote_share**
<a name="files_remote_share"></a>
> {str: (bool, date, datetime, dict, float, int, list, str, none_type)} files_remote_share()



Share a remote file into a channel.

### Example

* OAuth Authentication (slackAuth):
```python
import slack
from slack.apis.tags import files_remote_api
from slack.model.defs_ok_false import DefsOkFalse
from slack.model.defs_ok_true import DefsOkTrue
from pprint import pprint
# Defining the host is optional and defaults to https://slack.com/api
# See configuration.py for a list of all supported configuration parameters.
configuration = slack.Configuration(
    host = "https://slack.com/api"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure OAuth2 access token for authorization: slackAuth
configuration = slack.Configuration(
    host = "https://slack.com/api"
)
configuration.access_token = 'YOUR_ACCESS_TOKEN'
# Enter a context with an instance of the API client
with slack.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = files_remote_api.FilesRemoteApi(api_client)

    # example passing only optional values
    query_params = {
        'token': "token_example",
        'file': "file_example",
        'external_id': "external_id_example",
        'channels': "channels_example",
    }
    try:
        api_response = api_instance.files_remote_share(
            query_params=query_params,
        )
        pprint(api_response)
    except slack.ApiException as e:
        print("Exception when calling FilesRemoteApi->files_remote_share: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
query_params | RequestQueryParams | |
accept_content_types | typing.Tuple[str] | default is ('application/json', ) | Tells the server the content type(s) that are accepted by the client
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### query_params
#### RequestQueryParams

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
token | TokenSchema | | optional
file | FileSchema | | optional
external_id | ExternalIdSchema | | optional
channels | ChannelsSchema | | optional


# TokenSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# FileSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# ExternalIdSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# ChannelsSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#files_remote_share.ApiResponseFor200) | Typical success response
default | [ApiResponseForDefault](#files_remote_share.ApiResponseForDefault) | Typical error response

#### files_remote_share.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson

This method either only returns a brief _OK_ response or a verbose schema is not available for this method.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | This method either only returns a brief _OK_ response or a verbose schema is not available for this method. | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**ok** | [**DefsOkTrue**]({{complexTypePrefix}}DefsOkTrue.md) | [**DefsOkTrue**]({{complexTypePrefix}}DefsOkTrue.md) |  | 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

#### files_remote_share.ApiResponseForDefault
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor0ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor0ResponseBodyApplicationJson

This method either only returns a brief _not OK_ response or a verbose schema is not available for this method.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | This method either only returns a brief _not OK_ response or a verbose schema is not available for this method. | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**ok** | [**DefsOkFalse**]({{complexTypePrefix}}DefsOkFalse.md) | [**DefsOkFalse**]({{complexTypePrefix}}DefsOkFalse.md) |  | 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

### Authorization

[slackAuth](../../../README.md#slackAuth)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **files_remote_update**
<a name="files_remote_update"></a>
> {str: (bool, date, datetime, dict, float, int, list, str, none_type)} files_remote_update()



Updates an existing remote file.

### Example

* OAuth Authentication (slackAuth):
```python
import slack
from slack.apis.tags import files_remote_api
from slack.model.defs_ok_false import DefsOkFalse
from slack.model.defs_ok_true import DefsOkTrue
from pprint import pprint
# Defining the host is optional and defaults to https://slack.com/api
# See configuration.py for a list of all supported configuration parameters.
configuration = slack.Configuration(
    host = "https://slack.com/api"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure OAuth2 access token for authorization: slackAuth
configuration = slack.Configuration(
    host = "https://slack.com/api"
)
configuration.access_token = 'YOUR_ACCESS_TOKEN'
# Enter a context with an instance of the API client
with slack.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = files_remote_api.FilesRemoteApi(api_client)

    # example passing only optional values
    body = dict(
        external_id="external_id_example",
        external_url="external_url_example",
        file="file_example",
        filetype="filetype_example",
        indexable_file_contents="indexable_file_contents_example",
        preview_image="preview_image_example",
        title="title_example",
        token="token_example",
    )
    try:
        api_response = api_instance.files_remote_update(
            body=body,
        )
        pprint(api_response)
    except slack.ApiException as e:
        print("Exception when calling FilesRemoteApi->files_remote_update: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
body | typing.Union[SchemaForRequestBodyApplicationXWwwFormUrlencoded, Unset] | optional, default is unset |
content_type | str | optional, default is 'application/x-www-form-urlencoded' | Selects the schema and serialization of the request body
accept_content_types | typing.Tuple[str] | default is ('application/json', ) | Tells the server the content type(s) that are accepted by the client
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### body

# SchemaForRequestBodyApplicationXWwwFormUrlencoded

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**external_id** | str,  | str,  | Creator defined GUID for the file. | [optional] 
**external_url** | str,  | str,  | URL of the remote file. | [optional] 
**file** | str,  | str,  | Specify a file by providing its ID. | [optional] 
**filetype** | str,  | str,  | type of file | [optional] 
**indexable_file_contents** | str,  | str,  | File containing contents that can be used to improve searchability for the remote file. | [optional] 
**preview_image** | str,  | str,  | Preview of the document via &#x60;multipart/form-data&#x60;. | [optional] 
**title** | str,  | str,  | Title of the file being shared. | [optional] 
**token** | str,  | str,  | Authentication token. Requires scope: &#x60;remote_files:write&#x60; | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#files_remote_update.ApiResponseFor200) | Typical success response
default | [ApiResponseForDefault](#files_remote_update.ApiResponseForDefault) | Typical error response

#### files_remote_update.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson

This method either only returns a brief _OK_ response or a verbose schema is not available for this method.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | This method either only returns a brief _OK_ response or a verbose schema is not available for this method. | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**ok** | [**DefsOkTrue**]({{complexTypePrefix}}DefsOkTrue.md) | [**DefsOkTrue**]({{complexTypePrefix}}DefsOkTrue.md) |  | 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

#### files_remote_update.ApiResponseForDefault
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor0ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor0ResponseBodyApplicationJson

This method either only returns a brief _not OK_ response or a verbose schema is not available for this method.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | This method either only returns a brief _not OK_ response or a verbose schema is not available for this method. | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**ok** | [**DefsOkFalse**]({{complexTypePrefix}}DefsOkFalse.md) | [**DefsOkFalse**]({{complexTypePrefix}}DefsOkFalse.md) |  | 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

### Authorization

[slackAuth](../../../README.md#slackAuth)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

