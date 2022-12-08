<a name="__pageTop"></a>
# slack.apis.tags.dnd_api.DndApi

All URIs are relative to *https://slack.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**dnd_end_dnd**](#dnd_end_dnd) | **post** /dnd.endDnd | 
[**dnd_end_snooze**](#dnd_end_snooze) | **post** /dnd.endSnooze | 
[**dnd_info**](#dnd_info) | **get** /dnd.info | 
[**dnd_set_snooze**](#dnd_set_snooze) | **post** /dnd.setSnooze | 
[**dnd_team_info**](#dnd_team_info) | **get** /dnd.teamInfo | 

# **dnd_end_dnd**
<a name="dnd_end_dnd"></a>
> {str: typing.Any} dnd_end_dnd(token)



Ends the current user's Do Not Disturb session immediately.

### Example

* OAuth Authentication (slackAuth):
```python
import slack
from slack.apis.tags import dnd_api
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
    api_instance = dnd_api.DndApi(api_client)

    # example passing only required values which don't have defaults set
    header_params = {
        'token': "token_example",
    }
    try:
        api_response = api_instance.dnd_end_dnd(
            header_params=header_params,
        )
        pprint(api_response)
    except slack.ApiException as e:
        print("Exception when calling DndApi->dnd_end_dnd: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
header_params | RequestHeaderParams | |
accept_content_types | typing.Tuple[str] | default is ('application/json', ) | Tells the server the content type(s) that are accepted by the client
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

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
200 | [ApiResponseFor200](#dnd_end_dnd.ApiResponseFor200) | Typical success response
default | [ApiResponseForDefault](#dnd_end_dnd.ApiResponseForDefault) | Typical error response

#### dnd_end_dnd.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson

Schema for successful response from dnd.endDnd method

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | Schema for successful response from dnd.endDnd method | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**ok** | [**DefsOkTrue**]({{complexTypePrefix}}DefsOkTrue.md) | [**DefsOkTrue**]({{complexTypePrefix}}DefsOkTrue.md) |  | 

#### dnd_end_dnd.ApiResponseForDefault
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor0ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor0ResponseBodyApplicationJson

Schema for error response from dnd.endDnd method

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | Schema for error response from dnd.endDnd method | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**error** | str,  | str,  |  | must be one of ["unknown_error", "not_authed", "invalid_auth", "account_inactive", "token_revoked", "no_permission", "org_login_required", "user_is_bot", "invalid_arg_name", "invalid_array_arg", "invalid_charset", "invalid_form_data", "invalid_post_type", "missing_post_type", "team_added_to_org", "invalid_json", "json_not_object", "request_timeout", "upgrade_required", "fatal_error", ] 
**ok** | [**DefsOkFalse**]({{complexTypePrefix}}DefsOkFalse.md) | [**DefsOkFalse**]({{complexTypePrefix}}DefsOkFalse.md) |  | 
**callstack** | str,  | str,  | Note: PHP callstack is only visible in dev/qa | [optional] 

### Authorization

[slackAuth](../../../README.md#slackAuth)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **dnd_end_snooze**
<a name="dnd_end_snooze"></a>
> {str: typing.Any} dnd_end_snooze(token)



Ends the current user's snooze mode immediately.

### Example

* OAuth Authentication (slackAuth):
```python
import slack
from slack.apis.tags import dnd_api
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
    api_instance = dnd_api.DndApi(api_client)

    # example passing only required values which don't have defaults set
    header_params = {
        'token': "token_example",
    }
    try:
        api_response = api_instance.dnd_end_snooze(
            header_params=header_params,
        )
        pprint(api_response)
    except slack.ApiException as e:
        print("Exception when calling DndApi->dnd_end_snooze: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
header_params | RequestHeaderParams | |
accept_content_types | typing.Tuple[str] | default is ('application/json', ) | Tells the server the content type(s) that are accepted by the client
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

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
200 | [ApiResponseFor200](#dnd_end_snooze.ApiResponseFor200) | Typical success response
default | [ApiResponseForDefault](#dnd_end_snooze.ApiResponseForDefault) | Typical error response

#### dnd_end_snooze.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson

Schema for successful response from dnd.endSnooze method

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | Schema for successful response from dnd.endSnooze method | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**next_dnd_end_ts** | decimal.Decimal, int,  | decimal.Decimal,  |  | 
**dnd_enabled** | bool,  | BoolClass,  |  | 
**next_dnd_start_ts** | decimal.Decimal, int,  | decimal.Decimal,  |  | 
**snooze_enabled** | bool,  | BoolClass,  |  | 
**ok** | [**DefsOkTrue**]({{complexTypePrefix}}DefsOkTrue.md) | [**DefsOkTrue**]({{complexTypePrefix}}DefsOkTrue.md) |  | 

#### dnd_end_snooze.ApiResponseForDefault
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor0ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor0ResponseBodyApplicationJson

Schema for error response from dnd.endSnooze method

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | Schema for error response from dnd.endSnooze method | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**error** | str,  | str,  |  | must be one of ["snooze_not_active", "snooze_end_failed", "not_authed", "invalid_auth", "account_inactive", "token_revoked", "no_permission", "org_login_required", "user_is_bot", "invalid_arg_name", "invalid_array_arg", "invalid_charset", "invalid_form_data", "invalid_post_type", "missing_post_type", "team_added_to_org", "invalid_json", "json_not_object", "request_timeout", "upgrade_required", "fatal_error", ] 
**ok** | [**DefsOkFalse**]({{complexTypePrefix}}DefsOkFalse.md) | [**DefsOkFalse**]({{complexTypePrefix}}DefsOkFalse.md) |  | 
**callstack** | str,  | str,  | Note: PHP callstack is only visible in dev/qa | [optional] 

### Authorization

[slackAuth](../../../README.md#slackAuth)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **dnd_info**
<a name="dnd_info"></a>
> {str: typing.Any} dnd_info()



Retrieves a user's current Do Not Disturb status.

### Example

* OAuth Authentication (slackAuth):
```python
import slack
from slack.apis.tags import dnd_api
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
    api_instance = dnd_api.DndApi(api_client)

    # example passing only optional values
    query_params = {
        'token': "token_example",
        'user': "user_example",
    }
    try:
        api_response = api_instance.dnd_info(
            query_params=query_params,
        )
        pprint(api_response)
    except slack.ApiException as e:
        print("Exception when calling DndApi->dnd_info: %s\n" % e)
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
user | UserSchema | | optional


# TokenSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# UserSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#dnd_info.ApiResponseFor200) | Typical success response
default | [ApiResponseForDefault](#dnd_info.ApiResponseForDefault) | Typical error response

#### dnd_info.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson

Schema for successful response from dnd.info method

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | Schema for successful response from dnd.info method | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**next_dnd_end_ts** | decimal.Decimal, int,  | decimal.Decimal,  |  | 
**dnd_enabled** | bool,  | BoolClass,  |  | 
**next_dnd_start_ts** | decimal.Decimal, int,  | decimal.Decimal,  |  | 
**ok** | [**DefsOkTrue**]({{complexTypePrefix}}DefsOkTrue.md) | [**DefsOkTrue**]({{complexTypePrefix}}DefsOkTrue.md) |  | 
**snooze_enabled** | bool,  | BoolClass,  |  | [optional] 
**snooze_endtime** | decimal.Decimal, int,  | decimal.Decimal,  |  | [optional] 
**snooze_remaining** | decimal.Decimal, int,  | decimal.Decimal,  |  | [optional] 

#### dnd_info.ApiResponseForDefault
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor0ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor0ResponseBodyApplicationJson

Schema for error response from dnd.info method

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | Schema for error response from dnd.info method | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**error** | str,  | str,  |  | must be one of ["user_not_found", "not_authed", "invalid_auth", "account_inactive", "token_revoked", "no_permission", "org_login_required", "invalid_arg_name", "invalid_array_arg", "invalid_charset", "invalid_form_data", "invalid_post_type", "missing_post_type", "team_added_to_org", "invalid_json", "json_not_object", "request_timeout", "upgrade_required", "fatal_error", ] 
**ok** | [**DefsOkFalse**]({{complexTypePrefix}}DefsOkFalse.md) | [**DefsOkFalse**]({{complexTypePrefix}}DefsOkFalse.md) |  | 
**callstack** | str,  | str,  | Note: PHP callstack is only visible in dev/qa | [optional] 

### Authorization

[slackAuth](../../../README.md#slackAuth)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **dnd_set_snooze**
<a name="dnd_set_snooze"></a>
> {str: typing.Any} dnd_set_snooze()



Turns on Do Not Disturb mode for the current user, or changes its duration.

### Example

* OAuth Authentication (slackAuth):
```python
import slack
from slack.apis.tags import dnd_api
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
    api_instance = dnd_api.DndApi(api_client)

    # example passing only optional values
    body = dict(
        num_minutes="num_minutes_example",
        token="token_example",
    )
    try:
        api_response = api_instance.dnd_set_snooze(
            body=body,
        )
        pprint(api_response)
    except slack.ApiException as e:
        print("Exception when calling DndApi->dnd_set_snooze: %s\n" % e)
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
**num_minutes** | str,  | str,  | Number of minutes, from now, to snooze until. | 
**token** | str,  | str,  | Authentication token. Requires scope: &#x60;dnd:write&#x60; | 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#dnd_set_snooze.ApiResponseFor200) | Typical success response
default | [ApiResponseForDefault](#dnd_set_snooze.ApiResponseForDefault) | Typical error response

#### dnd_set_snooze.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson

Schema for successful response from dnd.setSnooze method

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | Schema for successful response from dnd.setSnooze method | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**snooze_endtime** | decimal.Decimal, int,  | decimal.Decimal,  |  | 
**snooze_enabled** | bool,  | BoolClass,  |  | 
**snooze_remaining** | decimal.Decimal, int,  | decimal.Decimal,  |  | 
**ok** | [**DefsOkTrue**]({{complexTypePrefix}}DefsOkTrue.md) | [**DefsOkTrue**]({{complexTypePrefix}}DefsOkTrue.md) |  | 

#### dnd_set_snooze.ApiResponseForDefault
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor0ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor0ResponseBodyApplicationJson

Schema for error response from dnd.setSnooze method

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | Schema for error response from dnd.setSnooze method | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**error** | str,  | str,  |  | must be one of ["missing_duration", "snooze_failed", "not_authed", "invalid_auth", "account_inactive", "token_revoked", "no_permission", "org_login_required", "user_is_bot", "invalid_arg_name", "invalid_array_arg", "invalid_charset", "invalid_form_data", "invalid_post_type", "missing_post_type", "team_added_to_org", "invalid_json", "json_not_object", "request_timeout", "upgrade_required", "too_long", "fatal_error", ] 
**ok** | [**DefsOkFalse**]({{complexTypePrefix}}DefsOkFalse.md) | [**DefsOkFalse**]({{complexTypePrefix}}DefsOkFalse.md) |  | 
**callstack** | str,  | str,  | Note: PHP callstack is only visible in dev/qa | [optional] 

### Authorization

[slackAuth](../../../README.md#slackAuth)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **dnd_team_info**
<a name="dnd_team_info"></a>
> {str: (bool, date, datetime, dict, float, int, list, str, none_type)} dnd_team_info()



Retrieves the Do Not Disturb status for up to 50 users on a team.

### Example

* OAuth Authentication (slackAuth):
```python
import slack
from slack.apis.tags import dnd_api
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
    api_instance = dnd_api.DndApi(api_client)

    # example passing only optional values
    query_params = {
        'token': "token_example",
        'users': "users_example",
    }
    try:
        api_response = api_instance.dnd_team_info(
            query_params=query_params,
        )
        pprint(api_response)
    except slack.ApiException as e:
        print("Exception when calling DndApi->dnd_team_info: %s\n" % e)
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
users | UsersSchema | | optional


# TokenSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# UsersSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#dnd_team_info.ApiResponseFor200) | Typical success response
default | [ApiResponseForDefault](#dnd_team_info.ApiResponseForDefault) | Typical error response

#### dnd_team_info.ApiResponseFor200
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

#### dnd_team_info.ApiResponseForDefault
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

