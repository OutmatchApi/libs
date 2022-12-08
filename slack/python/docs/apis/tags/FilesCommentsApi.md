<a name="__pageTop"></a>
# slack.apis.tags.files_comments_api.FilesCommentsApi

All URIs are relative to *https://slack.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**files_comments_delete**](#files_comments_delete) | **post** /files.comments.delete | 

# **files_comments_delete**
<a name="files_comments_delete"></a>
> {str: typing.Any} files_comments_delete()



Deletes an existing comment on a file.

### Example

* OAuth Authentication (slackAuth):
```python
import slack
from slack.apis.tags import files_comments_api
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
    api_instance = files_comments_api.FilesCommentsApi(api_client)

    # example passing only optional values
    header_params = {
        'token': "token_example",
    }
    body = dict(
        file="file_example",
        id="id_example",
    )
    try:
        api_response = api_instance.files_comments_delete(
            header_params=header_params,
            body=body,
        )
        pprint(api_response)
    except slack.ApiException as e:
        print("Exception when calling FilesCommentsApi->files_comments_delete: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
body | typing.Union[SchemaForRequestBodyApplicationXWwwFormUrlencoded, Unset] | optional, default is unset |
header_params | RequestHeaderParams | |
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
**file** | str,  | str,  | File to delete a comment from. | [optional] 
**id** | str,  | str,  | The comment to delete. | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

### header_params
#### RequestHeaderParams

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
token | TokenSchema | | optional

# TokenSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#files_comments_delete.ApiResponseFor200) | Standard success response is very simple
default | [ApiResponseForDefault](#files_comments_delete.ApiResponseForDefault) | Standard failure response when used with an invalid token

#### files_comments_delete.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson

Schema for successful response files.comments.delete method

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | Schema for successful response files.comments.delete method | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**ok** | [**DefsOkTrue**]({{complexTypePrefix}}DefsOkTrue.md) | [**DefsOkTrue**]({{complexTypePrefix}}DefsOkTrue.md) |  | 

#### files_comments_delete.ApiResponseForDefault
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor0ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor0ResponseBodyApplicationJson

Schema for error response files.comments.delete method

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | Schema for error response files.comments.delete method | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**error** | str,  | str,  |  | must be one of ["cant_delete", "comment_not_found", "not_authed", "invalid_auth", "account_inactive", "no_permission", "invalid_arg_name", "invalid_array_arg", "invalid_charset", "invalid_form_data", "invalid_post_type", "missing_post_type", "invalid_json", "json_not_object", "request_timeout", "upgrade_required", ] 
**ok** | [**DefsOkFalse**]({{complexTypePrefix}}DefsOkFalse.md) | [**DefsOkFalse**]({{complexTypePrefix}}DefsOkFalse.md) |  | 
**callstack** | str,  | str,  | Note: PHP callstack is only visible in dev/qa | [optional] 

### Authorization

[slackAuth](../../../README.md#slackAuth)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

