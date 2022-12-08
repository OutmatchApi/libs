<a name="__pageTop"></a>
# slack.apis.tags.chat_api.ChatApi

All URIs are relative to *https://slack.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**chat_delete**](#chat_delete) | **post** /chat.delete | 
[**chat_delete_scheduled_message**](#chat_delete_scheduled_message) | **post** /chat.deleteScheduledMessage | 
[**chat_get_permalink**](#chat_get_permalink) | **get** /chat.getPermalink | 
[**chat_me_message**](#chat_me_message) | **post** /chat.meMessage | 
[**chat_post_ephemeral**](#chat_post_ephemeral) | **post** /chat.postEphemeral | 
[**chat_post_message**](#chat_post_message) | **post** /chat.postMessage | 
[**chat_schedule_message**](#chat_schedule_message) | **post** /chat.scheduleMessage | 
[**chat_scheduled_messages_list**](#chat_scheduled_messages_list) | **get** /chat.scheduledMessages.list | 
[**chat_unfurl**](#chat_unfurl) | **post** /chat.unfurl | 
[**chat_update**](#chat_update) | **post** /chat.update | 

# **chat_delete**
<a name="chat_delete"></a>
> {str: typing.Any} chat_delete()



Deletes a message.

### Example

* OAuth Authentication (slackAuth):
```python
import slack
from slack.apis.tags import chat_api
from slack.model.defs_ts import DefsTs
from slack.model.defs_ok_false import DefsOkFalse
from slack.model.defs_ok_true import DefsOkTrue
from slack.model.defs_channel import DefsChannel
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
    api_instance = chat_api.ChatApi(api_client)

    # example passing only optional values
    header_params = {
        'token': "token_example",
    }
    body = dict(
        as_user=True,
        channel="channel_example",
        ts=3.14,
    )
    try:
        api_response = api_instance.chat_delete(
            header_params=header_params,
            body=body,
        )
        pprint(api_response)
    except slack.ApiException as e:
        print("Exception when calling ChatApi->chat_delete: %s\n" % e)
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
**as_user** | bool,  | BoolClass,  | Pass true to delete the message as the authed user with &#x60;chat:write:user&#x60; scope. [Bot users](/bot-users) in this context are considered authed users. If unused or false, the message will be deleted with &#x60;chat:write:bot&#x60; scope. | [optional] 
**channel** | str,  | str,  | Channel containing the message to be deleted. | [optional] 
**ts** | decimal.Decimal, int, float,  | decimal.Decimal,  | Timestamp of the message to be deleted. | [optional] 
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
200 | [ApiResponseFor200](#chat_delete.ApiResponseFor200) | Typical success response
default | [ApiResponseForDefault](#chat_delete.ApiResponseForDefault) | Typical error response

#### chat_delete.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson

Schema for successful response of chat.delete method

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | Schema for successful response of chat.delete method | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**channel** | [**DefsChannel**]({{complexTypePrefix}}DefsChannel.md) | [**DefsChannel**]({{complexTypePrefix}}DefsChannel.md) |  | 
**ok** | [**DefsOkTrue**]({{complexTypePrefix}}DefsOkTrue.md) | [**DefsOkTrue**]({{complexTypePrefix}}DefsOkTrue.md) |  | 
**ts** | [**DefsTs**]({{complexTypePrefix}}DefsTs.md) | [**DefsTs**]({{complexTypePrefix}}DefsTs.md) |  | 

#### chat_delete.ApiResponseForDefault
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor0ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor0ResponseBodyApplicationJson

Schema for error response from chat.delete method

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | Schema for error response from chat.delete method | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**error** | str,  | str,  |  | must be one of ["message_not_found", "channel_not_found", "cant_delete_message", "compliance_exports_prevent_deletion", "not_authed", "invalid_auth", "account_inactive", "token_revoked", "no_permission", "invalid_arg_name", "invalid_array_arg", "invalid_charset", "invalid_form_data", "invalid_post_type", "missing_post_type", "team_added_to_org", "invalid_json", "json_not_object", "request_timeout", "upgrade_required", "fatal_error", ] 
**ok** | [**DefsOkFalse**]({{complexTypePrefix}}DefsOkFalse.md) | [**DefsOkFalse**]({{complexTypePrefix}}DefsOkFalse.md) |  | 
**callstack** | str,  | str,  | Note: PHP callstack is only visible in dev/qa | [optional] 

### Authorization

[slackAuth](../../../README.md#slackAuth)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **chat_delete_scheduled_message**
<a name="chat_delete_scheduled_message"></a>
> {str: typing.Any} chat_delete_scheduled_message(token)



Deletes a pending scheduled message from the queue.

### Example

* OAuth Authentication (slackAuth):
```python
import slack
from slack.apis.tags import chat_api
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
    api_instance = chat_api.ChatApi(api_client)

    # example passing only required values which don't have defaults set
    header_params = {
        'token': "token_example",
    }
    try:
        api_response = api_instance.chat_delete_scheduled_message(
            header_params=header_params,
        )
        pprint(api_response)
    except slack.ApiException as e:
        print("Exception when calling ChatApi->chat_delete_scheduled_message: %s\n" % e)

    # example passing only optional values
    header_params = {
        'token': "token_example",
    }
    body = dict(
        as_user=True,
        channel="channel_example",
        scheduled_message_id="scheduled_message_id_example",
    )
    try:
        api_response = api_instance.chat_delete_scheduled_message(
            header_params=header_params,
            body=body,
        )
        pprint(api_response)
    except slack.ApiException as e:
        print("Exception when calling ChatApi->chat_delete_scheduled_message: %s\n" % e)
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
**scheduled_message_id** | str,  | str,  | &#x60;scheduled_message_id&#x60; returned from call to chat.scheduleMessage | 
**channel** | str,  | str,  | The channel the scheduled_message is posting to | 
**as_user** | bool,  | BoolClass,  | Pass true to delete the message as the authed user with &#x60;chat:write:user&#x60; scope. [Bot users](/bot-users) in this context are considered authed users. If unused or false, the message will be deleted with &#x60;chat:write:bot&#x60; scope. | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

### header_params
#### RequestHeaderParams

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
token | TokenSchema | | 

# TokenSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#chat_delete_scheduled_message.ApiResponseFor200) | Typical success response
default | [ApiResponseForDefault](#chat_delete_scheduled_message.ApiResponseForDefault) | Typical error response if no message is found

#### chat_delete_scheduled_message.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson

Schema for successful response from chat.deleteScheduledMessage method

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | Schema for successful response from chat.deleteScheduledMessage method | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**ok** | [**DefsOkTrue**]({{complexTypePrefix}}DefsOkTrue.md) | [**DefsOkTrue**]({{complexTypePrefix}}DefsOkTrue.md) |  | 

#### chat_delete_scheduled_message.ApiResponseForDefault
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor0ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor0ResponseBodyApplicationJson

Schema for error response from chat.deleteScheduledMessage method

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | Schema for error response from chat.deleteScheduledMessage method | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**error** | str,  | str,  |  | must be one of ["invalid_scheduled_message_id", "channel_not_found", "bad_token", "not_authed", "invalid_auth", "account_inactive", "token_revoked", "no_permission", "org_login_required", "ekm_access_denied", "missing_scope", "invalid_arguments", "invalid_arg_name", "invalid_charset", "invalid_form_data", "invalid_post_type", "missing_post_type", "team_added_to_org", "invalid_json", "json_not_object", "request_timeout", "upgrade_required", "fatal_error", ] 
**ok** | [**DefsOkFalse**]({{complexTypePrefix}}DefsOkFalse.md) | [**DefsOkFalse**]({{complexTypePrefix}}DefsOkFalse.md) |  | 
**callstack** | str,  | str,  | Note: PHP callstack is only visible in dev/qa | [optional] 

### Authorization

[slackAuth](../../../README.md#slackAuth)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **chat_get_permalink**
<a name="chat_get_permalink"></a>
> {str: typing.Any} chat_get_permalink(tokenchannelmessage_ts)



Retrieve a permalink URL for a specific extant message

### Example

* OAuth Authentication (slackAuth):
```python
import slack
from slack.apis.tags import chat_api
from slack.model.defs_ok_false import DefsOkFalse
from slack.model.defs_ok_true import DefsOkTrue
from slack.model.defs_channel import DefsChannel
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
    api_instance = chat_api.ChatApi(api_client)

    # example passing only required values which don't have defaults set
    query_params = {
        'token': "token_example",
        'channel': "channel_example",
        'message_ts': "message_ts_example",
    }
    try:
        api_response = api_instance.chat_get_permalink(
            query_params=query_params,
        )
        pprint(api_response)
    except slack.ApiException as e:
        print("Exception when calling ChatApi->chat_get_permalink: %s\n" % e)
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
token | TokenSchema | | 
channel | ChannelSchema | | 
message_ts | MessageTsSchema | | 


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

# MessageTsSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#chat_get_permalink.ApiResponseFor200) | Standard success response
default | [ApiResponseForDefault](#chat_get_permalink.ApiResponseForDefault) | Error response when channel cannot be found

#### chat_get_permalink.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson

Schema for successful response chat.getPermalink

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | Schema for successful response chat.getPermalink | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**channel** | [**DefsChannel**]({{complexTypePrefix}}DefsChannel.md) | [**DefsChannel**]({{complexTypePrefix}}DefsChannel.md) |  | 
**ok** | [**DefsOkTrue**]({{complexTypePrefix}}DefsOkTrue.md) | [**DefsOkTrue**]({{complexTypePrefix}}DefsOkTrue.md) |  | 
**permalink** | str,  | str,  |  | 

#### chat_get_permalink.ApiResponseForDefault
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor0ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor0ResponseBodyApplicationJson

Schema for error response from chat.getPermalink method

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | Schema for error response from chat.getPermalink method | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**error** | str,  | str,  |  | must be one of ["channel_not_found", "message_not_found", "not_authed", "invalid_auth", "account_inactive", "token_revoked", "no_permission", "org_login_required", "invalid_arg_name", "invalid_array_arg", "invalid_charset", "invalid_form_data", "invalid_post_type", "missing_post_type", "team_added_to_org", "invalid_json", "json_not_object", "request_timeout", "upgrade_required", "fatal_error", ] 
**ok** | [**DefsOkFalse**]({{complexTypePrefix}}DefsOkFalse.md) | [**DefsOkFalse**]({{complexTypePrefix}}DefsOkFalse.md) |  | 
**callstack** | str,  | str,  | Note: PHP callstack is only visible in dev/qa | [optional] 

### Authorization

[slackAuth](../../../README.md#slackAuth)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **chat_me_message**
<a name="chat_me_message"></a>
> {str: typing.Any} chat_me_message()



Share a me message into a channel.

### Example

* OAuth Authentication (slackAuth):
```python
import slack
from slack.apis.tags import chat_api
from slack.model.defs_ts import DefsTs
from slack.model.defs_ok_false import DefsOkFalse
from slack.model.defs_ok_true import DefsOkTrue
from slack.model.defs_channel import DefsChannel
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
    api_instance = chat_api.ChatApi(api_client)

    # example passing only optional values
    header_params = {
        'token': "token_example",
    }
    body = dict(
        channel="channel_example",
        text="text_example",
    )
    try:
        api_response = api_instance.chat_me_message(
            header_params=header_params,
            body=body,
        )
        pprint(api_response)
    except slack.ApiException as e:
        print("Exception when calling ChatApi->chat_me_message: %s\n" % e)
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
**channel** | str,  | str,  | Channel to send message to. Can be a public channel, private group or IM channel. Can be an encoded ID, or a name. | [optional] 
**text** | str,  | str,  | Text of the message to send. | [optional] 
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
200 | [ApiResponseFor200](#chat_me_message.ApiResponseFor200) | Typical success response
default | [ApiResponseForDefault](#chat_me_message.ApiResponseForDefault) | Typical error response

#### chat_me_message.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson

Schema for successful response from chat.meMessage method

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | Schema for successful response from chat.meMessage method | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**ok** | [**DefsOkTrue**]({{complexTypePrefix}}DefsOkTrue.md) | [**DefsOkTrue**]({{complexTypePrefix}}DefsOkTrue.md) |  | 
**channel** | [**DefsChannel**]({{complexTypePrefix}}DefsChannel.md) | [**DefsChannel**]({{complexTypePrefix}}DefsChannel.md) |  | [optional] 
**ts** | [**DefsTs**]({{complexTypePrefix}}DefsTs.md) | [**DefsTs**]({{complexTypePrefix}}DefsTs.md) |  | [optional] 

#### chat_me_message.ApiResponseForDefault
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor0ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor0ResponseBodyApplicationJson

Schema for error response from chat.meMessage method

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | Schema for error response from chat.meMessage method | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**error** | str,  | str,  |  | must be one of ["channel_not_found", "not_in_channel", "is_archived", "msg_too_long", "no_text", "rate_limited", "not_authed", "invalid_auth", "account_inactive", "token_revoked", "no_permission", "org_login_required", "invalid_arg_name", "invalid_array_arg", "invalid_charset", "invalid_form_data", "invalid_post_type", "missing_post_type", "team_added_to_org", "invalid_json", "json_not_object", "request_timeout", "upgrade_required", "fatal_error", ] 
**ok** | [**DefsOkFalse**]({{complexTypePrefix}}DefsOkFalse.md) | [**DefsOkFalse**]({{complexTypePrefix}}DefsOkFalse.md) |  | 
**callstack** | str,  | str,  | Note: PHP callstack is only visible in dev/qa | [optional] 

### Authorization

[slackAuth](../../../README.md#slackAuth)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **chat_post_ephemeral**
<a name="chat_post_ephemeral"></a>
> {str: typing.Any} chat_post_ephemeral(token)



Sends an ephemeral message to a user in a channel.

### Example

* OAuth Authentication (slackAuth):
```python
import slack
from slack.apis.tags import chat_api
from slack.model.defs_ts import DefsTs
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
    api_instance = chat_api.ChatApi(api_client)

    # example passing only required values which don't have defaults set
    header_params = {
        'token': "token_example",
    }
    try:
        api_response = api_instance.chat_post_ephemeral(
            header_params=header_params,
        )
        pprint(api_response)
    except slack.ApiException as e:
        print("Exception when calling ChatApi->chat_post_ephemeral: %s\n" % e)

    # example passing only optional values
    header_params = {
        'token': "token_example",
    }
    body = dict(
        as_user=True,
        attachments="attachments_example",
        blocks="blocks_example",
        channel="channel_example",
        icon_emoji="icon_emoji_example",
        icon_url="icon_url_example",
        link_names=True,
        parse="parse_example",
        text="text_example",
        thread_ts="thread_ts_example",
        user="user_example",
        username="username_example",
    )
    try:
        api_response = api_instance.chat_post_ephemeral(
            header_params=header_params,
            body=body,
        )
        pprint(api_response)
    except slack.ApiException as e:
        print("Exception when calling ChatApi->chat_post_ephemeral: %s\n" % e)
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
**channel** | str,  | str,  | Channel, private group, or IM channel to send message to. Can be an encoded ID, or a name. | 
**user** | str,  | str,  | &#x60;id&#x60; of the user who will receive the ephemeral message. The user should be in the channel specified by the &#x60;channel&#x60; argument. | 
**as_user** | bool,  | BoolClass,  | Pass true to post the message as the authed user. Defaults to true if the chat:write:bot scope is not included. Otherwise, defaults to false. | [optional] 
**attachments** | str,  | str,  | A JSON-based array of structured attachments, presented as a URL-encoded string. | [optional] 
**blocks** | str,  | str,  | A JSON-based array of structured blocks, presented as a URL-encoded string. | [optional] 
**icon_emoji** | str,  | str,  | Emoji to use as the icon for this message. Overrides &#x60;icon_url&#x60;. Must be used in conjunction with &#x60;as_user&#x60; set to &#x60;false&#x60;, otherwise ignored. See [authorship](#authorship) below. | [optional] 
**icon_url** | str,  | str,  | URL to an image to use as the icon for this message. Must be used in conjunction with &#x60;as_user&#x60; set to false, otherwise ignored. See [authorship](#authorship) below. | [optional] 
**link_names** | bool,  | BoolClass,  | Find and link channel names and usernames. | [optional] 
**parse** | str,  | str,  | Change how messages are treated. Defaults to &#x60;none&#x60;. See [below](#formatting). | [optional] 
**text** | str,  | str,  | How this field works and whether it is required depends on other fields you use in your API call. [See below](#text_usage) for more detail. | [optional] 
**thread_ts** | str,  | str,  | Provide another message&#x27;s &#x60;ts&#x60; value to post this message in a thread. Avoid using a reply&#x27;s &#x60;ts&#x60; value; use its parent&#x27;s value instead. Ephemeral messages in threads are only shown if there is already an active thread. | [optional] 
**username** | str,  | str,  | Set your bot&#x27;s user name. Must be used in conjunction with &#x60;as_user&#x60; set to false, otherwise ignored. See [authorship](#authorship) below. | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

### header_params
#### RequestHeaderParams

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
token | TokenSchema | | 

# TokenSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#chat_post_ephemeral.ApiResponseFor200) | Typical success response
default | [ApiResponseForDefault](#chat_post_ephemeral.ApiResponseForDefault) | Typical error response

#### chat_post_ephemeral.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson

Schema for successful response from chat.postEphemeral method

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | Schema for successful response from chat.postEphemeral method | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**ok** | [**DefsOkTrue**]({{complexTypePrefix}}DefsOkTrue.md) | [**DefsOkTrue**]({{complexTypePrefix}}DefsOkTrue.md) |  | 
**message_ts** | [**DefsTs**]({{complexTypePrefix}}DefsTs.md) | [**DefsTs**]({{complexTypePrefix}}DefsTs.md) |  | 

#### chat_post_ephemeral.ApiResponseForDefault
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor0ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor0ResponseBodyApplicationJson

Schema for error response from chat.postEphemeral method

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | Schema for error response from chat.postEphemeral method | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**error** | str,  | str,  |  | must be one of ["channel_not_found", "is_archived", "msg_too_long", "no_text", "restricted_action", "too_many_attachments", "user_not_in_channel", "not_authed", "invalid_auth", "account_inactive", "token_revoked", "no_permission", "org_login_required", "invalid_arg_name", "invalid_array_arg", "invalid_charset", "invalid_form_data", "invalid_post_type", "missing_post_type", "team_added_to_org", "invalid_json", "json_not_object", "request_timeout", "upgrade_required", "fatal_error", ] 
**ok** | [**DefsOkFalse**]({{complexTypePrefix}}DefsOkFalse.md) | [**DefsOkFalse**]({{complexTypePrefix}}DefsOkFalse.md) |  | 
**callstack** | str,  | str,  | Note: PHP callstack is only visible in dev/qa | [optional] 

### Authorization

[slackAuth](../../../README.md#slackAuth)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **chat_post_message**
<a name="chat_post_message"></a>
> {str: typing.Any} chat_post_message(token)



Sends a message to a channel.

### Example

* OAuth Authentication (slackAuth):
```python
import slack
from slack.apis.tags import chat_api
from slack.model.defs_ts import DefsTs
from slack.model.objs_message import ObjsMessage
from slack.model.defs_ok_false import DefsOkFalse
from slack.model.defs_ok_true import DefsOkTrue
from slack.model.defs_channel import DefsChannel
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
    api_instance = chat_api.ChatApi(api_client)

    # example passing only required values which don't have defaults set
    header_params = {
        'token': "token_example",
    }
    try:
        api_response = api_instance.chat_post_message(
            header_params=header_params,
        )
        pprint(api_response)
    except slack.ApiException as e:
        print("Exception when calling ChatApi->chat_post_message: %s\n" % e)

    # example passing only optional values
    header_params = {
        'token': "token_example",
    }
    body = dict(
        as_user="as_user_example",
        attachments="attachments_example",
        blocks="blocks_example",
        channel="channel_example",
        icon_emoji="icon_emoji_example",
        icon_url="icon_url_example",
        link_names=True,
        mrkdwn=True,
        parse="parse_example",
        reply_broadcast=True,
        text="text_example",
        thread_ts="thread_ts_example",
        unfurl_links=True,
        unfurl_media=True,
        username="username_example",
    )
    try:
        api_response = api_instance.chat_post_message(
            header_params=header_params,
            body=body,
        )
        pprint(api_response)
    except slack.ApiException as e:
        print("Exception when calling ChatApi->chat_post_message: %s\n" % e)
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
**channel** | str,  | str,  | Channel, private group, or IM channel to send message to. Can be an encoded ID, or a name. See [below](#channels) for more details. | 
**as_user** | str,  | str,  | Pass true to post the message as the authed user, instead of as a bot. Defaults to false. See [authorship](#authorship) below. | [optional] 
**attachments** | str,  | str,  | A JSON-based array of structured attachments, presented as a URL-encoded string. | [optional] 
**blocks** | str,  | str,  | A JSON-based array of structured blocks, presented as a URL-encoded string. | [optional] 
**icon_emoji** | str,  | str,  | Emoji to use as the icon for this message. Overrides &#x60;icon_url&#x60;. Must be used in conjunction with &#x60;as_user&#x60; set to &#x60;false&#x60;, otherwise ignored. See [authorship](#authorship) below. | [optional] 
**icon_url** | str,  | str,  | URL to an image to use as the icon for this message. Must be used in conjunction with &#x60;as_user&#x60; set to false, otherwise ignored. See [authorship](#authorship) below. | [optional] 
**link_names** | bool,  | BoolClass,  | Find and link channel names and usernames. | [optional] 
**mrkdwn** | bool,  | BoolClass,  | Disable Slack markup parsing by setting to &#x60;false&#x60;. Enabled by default. | [optional] 
**parse** | str,  | str,  | Change how messages are treated. Defaults to &#x60;none&#x60;. See [below](#formatting). | [optional] 
**reply_broadcast** | bool,  | BoolClass,  | Used in conjunction with &#x60;thread_ts&#x60; and indicates whether reply should be made visible to everyone in the channel or conversation. Defaults to &#x60;false&#x60;. | [optional] 
**text** | str,  | str,  | How this field works and whether it is required depends on other fields you use in your API call. [See below](#text_usage) for more detail. | [optional] 
**thread_ts** | str,  | str,  | Provide another message&#x27;s &#x60;ts&#x60; value to make this message a reply. Avoid using a reply&#x27;s &#x60;ts&#x60; value; use its parent instead. | [optional] 
**unfurl_links** | bool,  | BoolClass,  | Pass true to enable unfurling of primarily text-based content. | [optional] 
**unfurl_media** | bool,  | BoolClass,  | Pass false to disable unfurling of media content. | [optional] 
**username** | str,  | str,  | Set your bot&#x27;s user name. Must be used in conjunction with &#x60;as_user&#x60; set to false, otherwise ignored. See [authorship](#authorship) below. | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

### header_params
#### RequestHeaderParams

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
token | TokenSchema | | 

# TokenSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#chat_post_message.ApiResponseFor200) | Typical success response
default | [ApiResponseForDefault](#chat_post_message.ApiResponseForDefault) | Typical error response if too many attachments are included

#### chat_post_message.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson

Schema for successful response of chat.postMessage method

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | Schema for successful response of chat.postMessage method | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**channel** | [**DefsChannel**]({{complexTypePrefix}}DefsChannel.md) | [**DefsChannel**]({{complexTypePrefix}}DefsChannel.md) |  | 
**message** | [**ObjsMessage**]({{complexTypePrefix}}ObjsMessage.md) | [**ObjsMessage**]({{complexTypePrefix}}ObjsMessage.md) |  | 
**ok** | [**DefsOkTrue**]({{complexTypePrefix}}DefsOkTrue.md) | [**DefsOkTrue**]({{complexTypePrefix}}DefsOkTrue.md) |  | 
**ts** | [**DefsTs**]({{complexTypePrefix}}DefsTs.md) | [**DefsTs**]({{complexTypePrefix}}DefsTs.md) |  | 

#### chat_post_message.ApiResponseForDefault
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor0ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor0ResponseBodyApplicationJson

Schema for error response chat.postMessage method

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | Schema for error response chat.postMessage method | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**error** | str,  | str,  |  | must be one of ["channel_not_found", "not_in_channel", "is_archived", "msg_too_long", "no_text", "too_many_attachments", "rate_limited", "not_authed", "invalid_auth", "account_inactive", "invalid_arg_name", "invalid_array_arg", "invalid_charset", "invalid_form_data", "invalid_post_type", "missing_post_type", ] 
**ok** | [**DefsOkFalse**]({{complexTypePrefix}}DefsOkFalse.md) | [**DefsOkFalse**]({{complexTypePrefix}}DefsOkFalse.md) |  | 
**callstack** | str,  | str,  | Note: PHP callstack is only visible in dev/qa | [optional] 

### Authorization

[slackAuth](../../../README.md#slackAuth)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **chat_schedule_message**
<a name="chat_schedule_message"></a>
> {str: typing.Any} chat_schedule_message()



Schedules a message to be sent to a channel.

### Example

* OAuth Authentication (slackAuth):
```python
import slack
from slack.apis.tags import chat_api
from slack.model.objs_bot_profile import ObjsBotProfile
from slack.model.defs_bot_id import DefsBotId
from slack.model.defs_team import DefsTeam
from slack.model.defs_ok_false import DefsOkFalse
from slack.model.defs_ok_true import DefsOkTrue
from slack.model.defs_channel import DefsChannel
from slack.model.defs_user_id import DefsUserId
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
    api_instance = chat_api.ChatApi(api_client)

    # example passing only optional values
    header_params = {
        'token': "token_example",
    }
    body = dict(
        as_user=True,
        attachments="attachments_example",
        blocks="blocks_example",
        channel="channel_example",
        link_names=True,
        parse="parse_example",
        post_at="post_at_example",
        reply_broadcast=True,
        text="text_example",
        thread_ts=3.14,
        unfurl_links=True,
        unfurl_media=True,
    )
    try:
        api_response = api_instance.chat_schedule_message(
            header_params=header_params,
            body=body,
        )
        pprint(api_response)
    except slack.ApiException as e:
        print("Exception when calling ChatApi->chat_schedule_message: %s\n" % e)
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
**as_user** | bool,  | BoolClass,  | Pass true to post the message as the authed user, instead of as a bot. Defaults to false. See [chat.postMessage](chat.postMessage#authorship). | [optional] 
**attachments** | str,  | str,  | A JSON-based array of structured attachments, presented as a URL-encoded string. | [optional] 
**blocks** | str,  | str,  | A JSON-based array of structured blocks, presented as a URL-encoded string. | [optional] 
**channel** | str,  | str,  | Channel, private group, or DM channel to send message to. Can be an encoded ID, or a name. See [below](#channels) for more details. | [optional] 
**link_names** | bool,  | BoolClass,  | Find and link channel names and usernames. | [optional] 
**parse** | str,  | str,  | Change how messages are treated. Defaults to &#x60;none&#x60;. See [chat.postMessage](chat.postMessage#formatting). | [optional] 
**post_at** | str,  | str,  | Unix EPOCH timestamp of time in future to send the message. | [optional] 
**reply_broadcast** | bool,  | BoolClass,  | Used in conjunction with &#x60;thread_ts&#x60; and indicates whether reply should be made visible to everyone in the channel or conversation. Defaults to &#x60;false&#x60;. | [optional] 
**text** | str,  | str,  | How this field works and whether it is required depends on other fields you use in your API call. [See below](#text_usage) for more detail. | [optional] 
**thread_ts** | decimal.Decimal, int, float,  | decimal.Decimal,  | Provide another message&#x27;s &#x60;ts&#x60; value to make this message a reply. Avoid using a reply&#x27;s &#x60;ts&#x60; value; use its parent instead. | [optional] 
**unfurl_links** | bool,  | BoolClass,  | Pass true to enable unfurling of primarily text-based content. | [optional] 
**unfurl_media** | bool,  | BoolClass,  | Pass false to disable unfurling of media content. | [optional] 
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
200 | [ApiResponseFor200](#chat_schedule_message.ApiResponseFor200) | Typical success response
default | [ApiResponseForDefault](#chat_schedule_message.ApiResponseForDefault) | Typical error response if the &#x60;post_at&#x60; is invalid (ex. in the past or too far into the future)

#### chat_schedule_message.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson

Schema for successful response of chat.scheduleMessage method

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | Schema for successful response of chat.scheduleMessage method | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**scheduled_message_id** | str,  | str,  |  | 
**channel** | [**DefsChannel**]({{complexTypePrefix}}DefsChannel.md) | [**DefsChannel**]({{complexTypePrefix}}DefsChannel.md) |  | 
**[message](#message)** | dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 
**ok** | [**DefsOkTrue**]({{complexTypePrefix}}DefsOkTrue.md) | [**DefsOkTrue**]({{complexTypePrefix}}DefsOkTrue.md) |  | 
**post_at** | decimal.Decimal, int,  | decimal.Decimal,  |  | 

# message

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**team** | [**DefsTeam**]({{complexTypePrefix}}DefsTeam.md) | [**DefsTeam**]({{complexTypePrefix}}DefsTeam.md) |  | 
**text** | str,  | str,  |  | 
**type** | str,  | str,  |  | 
**user** | [**DefsUserId**]({{complexTypePrefix}}DefsUserId.md) | [**DefsUserId**]({{complexTypePrefix}}DefsUserId.md) |  | 
**bot_id** | [**DefsBotId**]({{complexTypePrefix}}DefsBotId.md) | [**DefsBotId**]({{complexTypePrefix}}DefsBotId.md) |  | 
**bot_profile** | [**ObjsBotProfile**]({{complexTypePrefix}}ObjsBotProfile.md) | [**ObjsBotProfile**]({{complexTypePrefix}}ObjsBotProfile.md) |  | [optional] 
**username** | str,  | str,  |  | [optional] 

#### chat_schedule_message.ApiResponseForDefault
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor0ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor0ResponseBodyApplicationJson

Schema for error response chat.scheduleMessage method

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | Schema for error response chat.scheduleMessage method | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**error** | str,  | str,  |  | must be one of ["invalid_time", "time_in_past", "time_too_far", "channel_not_found", "not_in_channel", "is_archived", "msg_too_long", "no_text", "restricted_action", "restricted_action_read_only_channel", "restricted_action_thread_only_channel", "restricted_action_non_threadable_channel", "too_many_attachments", "rate_limited", "not_authed", "invalid_auth", "account_inactive", "token_revoked", "no_permission", "org_login_required", "ekm_access_denied", "missing_scope", "invalid_arguments", "invalid_arg_name", "invalid_charset", "invalid_form_data", "invalid_post_type", "missing_post_type", "team_added_to_org", "invalid_json", "json_not_object", "request_timeout", "upgrade_required", "fatal_error", ] 
**ok** | [**DefsOkFalse**]({{complexTypePrefix}}DefsOkFalse.md) | [**DefsOkFalse**]({{complexTypePrefix}}DefsOkFalse.md) |  | 
**callstack** | str,  | str,  | Note: PHP callstack is only visible in dev/qa | [optional] 

### Authorization

[slackAuth](../../../README.md#slackAuth)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **chat_scheduled_messages_list**
<a name="chat_scheduled_messages_list"></a>
> {str: typing.Any} chat_scheduled_messages_list()



Returns a list of scheduled messages.

### Example

* OAuth Authentication (slackAuth):
```python
import slack
from slack.apis.tags import chat_api
from slack.model.defs_channel_id import DefsChannelId
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
    api_instance = chat_api.ChatApi(api_client)

    # example passing only optional values
    query_params = {
        'channel': "channel_example",
        'latest': 3.14,
        'oldest': 3.14,
        'limit': 1,
        'cursor': "cursor_example",
    }
    header_params = {
        'token': "token_example",
    }
    try:
        api_response = api_instance.chat_scheduled_messages_list(
            query_params=query_params,
            header_params=header_params,
        )
        pprint(api_response)
    except slack.ApiException as e:
        print("Exception when calling ChatApi->chat_scheduled_messages_list: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
query_params | RequestQueryParams | |
header_params | RequestHeaderParams | |
accept_content_types | typing.Tuple[str] | default is ('application/json', ) | Tells the server the content type(s) that are accepted by the client
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### query_params
#### RequestQueryParams

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
channel | ChannelSchema | | optional
latest | LatestSchema | | optional
oldest | OldestSchema | | optional
limit | LimitSchema | | optional
cursor | CursorSchema | | optional


# ChannelSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# LatestSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
decimal.Decimal, int, float,  | decimal.Decimal,  |  | 

# OldestSchema

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
200 | [ApiResponseFor200](#chat_scheduled_messages_list.ApiResponseFor200) | Typical success response
default | [ApiResponseForDefault](#chat_scheduled_messages_list.ApiResponseForDefault) | Typical error response if the channel passed is invalid

#### chat_scheduled_messages_list.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson

Schema for successful response from chat.scheduledMessages.list method

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | Schema for successful response from chat.scheduledMessages.list method | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**[scheduled_messages](#scheduled_messages)** | list, tuple,  | tuple,  |  | 
**[response_metadata](#response_metadata)** | dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 
**ok** | [**DefsOkTrue**]({{complexTypePrefix}}DefsOkTrue.md) | [**DefsOkTrue**]({{complexTypePrefix}}DefsOkTrue.md) |  | 

# response_metadata

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**next_cursor** | str,  | str,  |  | 

# scheduled_messages

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  |  | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[items](#items) | dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

# items

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**date_created** | decimal.Decimal, int,  | decimal.Decimal,  |  | 
**id** | str,  | str,  |  | 
**post_at** | decimal.Decimal, int,  | decimal.Decimal,  |  | 
**channel_id** | [**DefsChannelId**]({{complexTypePrefix}}DefsChannelId.md) | [**DefsChannelId**]({{complexTypePrefix}}DefsChannelId.md) |  | 
**text** | str,  | str,  |  | [optional] 

#### chat_scheduled_messages_list.ApiResponseForDefault
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor0ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor0ResponseBodyApplicationJson

Schema for error response from chat.scheduledMessages.list method

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | Schema for error response from chat.scheduledMessages.list method | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**error** | str,  | str,  |  | must be one of ["invalid_channel", "not_authed", "invalid_auth", "account_inactive", "token_revoked", "no_permission", "org_login_required", "ekm_access_denied", "missing_scope", "invalid_arguments", "invalid_arg_name", "invalid_charset", "invalid_form_data", "invalid_post_type", "missing_post_type", "team_added_to_org", "invalid_json", "json_not_object", "request_timeout", "upgrade_required", "fatal_error", ] 
**ok** | [**DefsOkFalse**]({{complexTypePrefix}}DefsOkFalse.md) | [**DefsOkFalse**]({{complexTypePrefix}}DefsOkFalse.md) |  | 
**callstack** | str,  | str,  | Note: PHP callstack is only visible in dev/qa | [optional] 

### Authorization

[slackAuth](../../../README.md#slackAuth)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **chat_unfurl**
<a name="chat_unfurl"></a>
> {str: typing.Any} chat_unfurl(token)



Provide custom unfurl behavior for user-posted URLs

### Example

* OAuth Authentication (slackAuth):
```python
import slack
from slack.apis.tags import chat_api
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
    api_instance = chat_api.ChatApi(api_client)

    # example passing only required values which don't have defaults set
    header_params = {
        'token': "token_example",
    }
    try:
        api_response = api_instance.chat_unfurl(
            header_params=header_params,
        )
        pprint(api_response)
    except slack.ApiException as e:
        print("Exception when calling ChatApi->chat_unfurl: %s\n" % e)

    # example passing only optional values
    header_params = {
        'token': "token_example",
    }
    body = dict(
        channel="channel_example",
        ts="ts_example",
        unfurls="unfurls_example",
        user_auth_message="user_auth_message_example",
        user_auth_required=True,
        user_auth_url="user_auth_url_example",
    )
    try:
        api_response = api_instance.chat_unfurl(
            header_params=header_params,
            body=body,
        )
        pprint(api_response)
    except slack.ApiException as e:
        print("Exception when calling ChatApi->chat_unfurl: %s\n" % e)
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
**channel** | str,  | str,  | Channel ID of the message | 
**ts** | str,  | str,  | Timestamp of the message to add unfurl behavior to. | 
**unfurls** | str,  | str,  | URL-encoded JSON map with keys set to URLs featured in the the message, pointing to their unfurl blocks or message attachments. | [optional] 
**user_auth_message** | str,  | str,  | Provide a simply-formatted string to send as an ephemeral message to the user as invitation to authenticate further and enable full unfurling behavior | [optional] 
**user_auth_required** | bool,  | BoolClass,  | Set to &#x60;true&#x60; or &#x60;1&#x60; to indicate the user must install your Slack app to trigger unfurls for this domain | [optional] 
**user_auth_url** | str,  | str,  | Send users to this custom URL where they will complete authentication in your app to fully trigger unfurling. Value should be properly URL-encoded. | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

### header_params
#### RequestHeaderParams

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
token | TokenSchema | | 

# TokenSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#chat_unfurl.ApiResponseFor200) | Typical, minimal success response
default | [ApiResponseForDefault](#chat_unfurl.ApiResponseForDefault) | Typical error response

#### chat_unfurl.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson

Schema for successful response from chat.unfurl method

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | Schema for successful response from chat.unfurl method | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**ok** | [**DefsOkTrue**]({{complexTypePrefix}}DefsOkTrue.md) | [**DefsOkTrue**]({{complexTypePrefix}}DefsOkTrue.md) |  | 

#### chat_unfurl.ApiResponseForDefault
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor0ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor0ResponseBodyApplicationJson

Schema for error response from chat.unfurl method

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | Schema for error response from chat.unfurl method | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**error** | str,  | str,  |  | must be one of ["cannot_unfurl_url", "cannot_find_service", "missing_unfurls", "cannot_prompt", "not_authed", "invalid_auth", "account_inactive", "token_revoked", "no_permission", "org_login_required", "user_is_bot", "invalid_arg_name", "invalid_array_arg", "invalid_charset", "invalid_form_data", "invalid_post_type", "missing_post_type", "team_added_to_org", "invalid_json", "json_not_object", "request_timeout", "upgrade_required", "fatal_error", ] 
**ok** | [**DefsOkFalse**]({{complexTypePrefix}}DefsOkFalse.md) | [**DefsOkFalse**]({{complexTypePrefix}}DefsOkFalse.md) |  | 
**callstack** | str,  | str,  | Note: PHP callstack is only visible in dev/qa | [optional] 

### Authorization

[slackAuth](../../../README.md#slackAuth)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **chat_update**
<a name="chat_update"></a>
> {str: typing.Any} chat_update(token)



Updates a message.

### Example

* OAuth Authentication (slackAuth):
```python
import slack
from slack.apis.tags import chat_api
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
    api_instance = chat_api.ChatApi(api_client)

    # example passing only required values which don't have defaults set
    header_params = {
        'token': "token_example",
    }
    try:
        api_response = api_instance.chat_update(
            header_params=header_params,
        )
        pprint(api_response)
    except slack.ApiException as e:
        print("Exception when calling ChatApi->chat_update: %s\n" % e)

    # example passing only optional values
    header_params = {
        'token': "token_example",
    }
    body = dict(
        as_user="as_user_example",
        attachments="attachments_example",
        blocks="blocks_example",
        channel="channel_example",
        link_names="link_names_example",
        parse="parse_example",
        text="text_example",
        ts="ts_example",
    )
    try:
        api_response = api_instance.chat_update(
            header_params=header_params,
            body=body,
        )
        pprint(api_response)
    except slack.ApiException as e:
        print("Exception when calling ChatApi->chat_update: %s\n" % e)
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
**channel** | str,  | str,  | Channel containing the message to be updated. | 
**ts** | str,  | str,  | Timestamp of the message to be updated. | 
**as_user** | str,  | str,  | Pass true to update the message as the authed user. [Bot users](/bot-users) in this context are considered authed users. | [optional] 
**attachments** | str,  | str,  | A JSON-based array of structured attachments, presented as a URL-encoded string. This field is required when not presenting &#x60;text&#x60;. If you don&#x27;t include this field, the message&#x27;s previous &#x60;attachments&#x60; will be retained. To remove previous &#x60;attachments&#x60;, include an empty array for this field. | [optional] 
**blocks** | str,  | str,  | A JSON-based array of [structured blocks](/block-kit/building), presented as a URL-encoded string. If you don&#x27;t include this field, the message&#x27;s previous &#x60;blocks&#x60; will be retained. To remove previous &#x60;blocks&#x60;, include an empty array for this field. | [optional] 
**link_names** | str,  | str,  | Find and link channel names and usernames. Defaults to &#x60;none&#x60;. If you do not specify a value for this field, the original value set for the message will be overwritten with the default, &#x60;none&#x60;. | [optional] 
**parse** | str,  | str,  | Change how messages are treated. Defaults to &#x60;client&#x60;, unlike &#x60;chat.postMessage&#x60;. Accepts either &#x60;none&#x60; or &#x60;full&#x60;. If you do not specify a value for this field, the original value set for the message will be overwritten with the default, &#x60;client&#x60;. | [optional] 
**text** | str,  | str,  | New text for the message, using the [default formatting rules](/reference/surfaces/formatting). It&#x27;s not required when presenting &#x60;blocks&#x60; or &#x60;attachments&#x60;. | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

### header_params
#### RequestHeaderParams

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
token | TokenSchema | | 

# TokenSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#chat_update.ApiResponseFor200) | Typical success response
default | [ApiResponseForDefault](#chat_update.ApiResponseForDefault) | Typical error response

#### chat_update.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson

Schema for successful response of chat.update method

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | Schema for successful response of chat.update method | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**channel** | str,  | str,  |  | 
**text** | str,  | str,  |  | 
**[message](#message)** | dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 
**ok** | [**DefsOkTrue**]({{complexTypePrefix}}DefsOkTrue.md) | [**DefsOkTrue**]({{complexTypePrefix}}DefsOkTrue.md) |  | 
**ts** | str,  | str,  |  | 

# message

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**text** | str,  | str,  |  | 
**[attachments](#attachments)** | list, tuple,  | tuple,  |  | [optional] 
**[blocks](#blocks)** | dict, frozendict.frozendict,  | frozendict.frozendict,  |  | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

# attachments

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  |  | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[items](#items) | dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

# items

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

# blocks

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

#### chat_update.ApiResponseForDefault
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor0ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor0ResponseBodyApplicationJson

Schema for error response chat.update method

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | Schema for error response chat.update method | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**error** | str,  | str,  |  | must be one of ["message_not_found", "cant_update_message", "channel_not_found", "edit_window_closed", "msg_too_long", "too_many_attachments", "rate_limited", "no_text", "not_authed", "invalid_auth", "account_inactive", "token_revoked", "no_permission", "invalid_arg_name", "invalid_array_arg", "invalid_charset", "invalid_form_data", "invalid_post_type", "missing_post_type", "request_timeout", "invalid_json", "json_not_object", "upgrade_required", "fatal_error", "is_inactive", ] 
**ok** | [**DefsOkFalse**]({{complexTypePrefix}}DefsOkFalse.md) | [**DefsOkFalse**]({{complexTypePrefix}}DefsOkFalse.md) |  | 
**callstack** | str,  | str,  | Note: PHP callstack is only visible in dev/qa | [optional] 

### Authorization

[slackAuth](../../../README.md#slackAuth)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

