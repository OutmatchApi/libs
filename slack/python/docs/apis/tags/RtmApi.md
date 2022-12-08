<a name="__pageTop"></a>
# slack.apis.tags.rtm_api.RtmApi

All URIs are relative to *https://slack.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**rtm_connect**](#rtm_connect) | **get** /rtm.connect | 

# **rtm_connect**
<a name="rtm_connect"></a>
> {str: typing.Any} rtm_connect(token)



Starts a Real Time Messaging session.

### Example

* OAuth Authentication (slackAuth):
```python
import slack
from slack.apis.tags import rtm_api
from slack.model.defs_team import DefsTeam
from slack.model.defs_ok_false import DefsOkFalse
from slack.model.defs_ok_true import DefsOkTrue
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
    api_instance = rtm_api.RtmApi(api_client)

    # example passing only required values which don't have defaults set
    query_params = {
        'token': "token_example",
    }
    try:
        api_response = api_instance.rtm_connect(
            query_params=query_params,
        )
        pprint(api_response)
    except slack.ApiException as e:
        print("Exception when calling RtmApi->rtm_connect: %s\n" % e)

    # example passing only optional values
    query_params = {
        'token': "token_example",
        'batch_presence_aware': True,
        'presence_sub': True,
    }
    try:
        api_response = api_instance.rtm_connect(
            query_params=query_params,
        )
        pprint(api_response)
    except slack.ApiException as e:
        print("Exception when calling RtmApi->rtm_connect: %s\n" % e)
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
batch_presence_aware | BatchPresenceAwareSchema | | optional
presence_sub | PresenceSubSchema | | optional


# TokenSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# BatchPresenceAwareSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
bool,  | BoolClass,  |  | 

# PresenceSubSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
bool,  | BoolClass,  |  | 

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#rtm_connect.ApiResponseFor200) | Typical success response
default | [ApiResponseForDefault](#rtm_connect.ApiResponseForDefault) | Typical error response

#### rtm_connect.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson

Schema for successful response from rtm.connect method

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | Schema for successful response from rtm.connect method | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**[self](#self)** | dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 
**[team](#team)** | dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 
**ok** | [**DefsOkTrue**]({{complexTypePrefix}}DefsOkTrue.md) | [**DefsOkTrue**]({{complexTypePrefix}}DefsOkTrue.md) |  | 
**url** | str,  | str,  |  | 

# self

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**name** | str,  | str,  |  | 
**id** | [**DefsUserId**]({{complexTypePrefix}}DefsUserId.md) | [**DefsUserId**]({{complexTypePrefix}}DefsUserId.md) |  | 

# team

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**domain** | str,  | str,  |  | 
**name** | str,  | str,  |  | 
**id** | [**DefsTeam**]({{complexTypePrefix}}DefsTeam.md) | [**DefsTeam**]({{complexTypePrefix}}DefsTeam.md) |  | 

#### rtm_connect.ApiResponseForDefault
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor0ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor0ResponseBodyApplicationJson

Schema for error response from rtm.connect method

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | Schema for error response from rtm.connect method | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**error** | str,  | str,  |  | must be one of ["not_authed", "invalid_auth", "account_inactive", "token_revoked", "no_permission", "invalid_arg_name", "invalid_array_arg", "invalid_charset", "invalid_form_data", "invalid_post_type", "missing_post_type", "team_added_to_org", "invalid_json", "json_not_object", "request_timeout", "upgrade_required", "fatal_error", ] 
**ok** | [**DefsOkFalse**]({{complexTypePrefix}}DefsOkFalse.md) | [**DefsOkFalse**]({{complexTypePrefix}}DefsOkFalse.md) |  | 
**callstack** | str,  | str,  | Note: PHP callstack is only visible in dev/qa | [optional] 

### Authorization

[slackAuth](../../../README.md#slackAuth)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

