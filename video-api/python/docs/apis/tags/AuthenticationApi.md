<a name="__pageTop"></a>
# video-api.apis.tags.authentication_api.AuthenticationApi

All URIs are relative to *https://ws.api.video*

Method | HTTP request | Description
------------- | ------------- | -------------
[**p_ost_auth_api_key**](#p_ost_auth_api_key) | **post** /auth/api-key | Authenticate
[**p_ost_auth_refresh**](#p_ost_auth_refresh) | **post** /auth/refresh | Refresh token

# **p_ost_auth_api_key**
<a name="p_ost_auth_api_key"></a>
> AccessToken p_ost_auth_api_key()

Authenticate

To get started, submit your API key in the body of your request. api.video returns an access token that is valid for one hour (3600 seconds). A refresh token is also returned. View a [tutorial](https://api.video/blog/tutorials/authentication-tutorial) on authentication. All tutorials using the [authentication endpoint](https://api.video/blog/endpoints/authenticate)

### Example

```python
import video-api
from video-api.apis.tags import authentication_api
from video-api.model.authenticate_payload import AuthenticatePayload
from video-api.model.bad_request import BadRequest
from video-api.model.access_token import AccessToken
from pprint import pprint
# Defining the host is optional and defaults to https://ws.api.video
# See configuration.py for a list of all supported configuration parameters.
configuration = video-api.Configuration(
    host = "https://ws.api.video"
)

# Enter a context with an instance of the API client
with video-api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = authentication_api.AuthenticationApi(api_client)

    # example passing only optional values
    body = AuthenticatePayload(
        api_key="api_key_example",
    )
    try:
        # Authenticate
        api_response = api_instance.p_ost_auth_api_key(
            body=body,
        )
        pprint(api_response)
    except video-api.ApiException as e:
        print("Exception when calling AuthenticationApi->p_ost_auth_api_key: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
body | typing.Union[SchemaForRequestBodyApplicationJson, Unset] | optional, default is unset |
content_type | str | optional, default is 'application/json' | Selects the schema and serialization of the request body
accept_content_types | typing.Tuple[str] | default is ('application/json', ) | Tells the server the content type(s) that are accepted by the client
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### body

# SchemaForRequestBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**AuthenticatePayload**](../../models/AuthenticatePayload.md) |  | 


### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#p_ost_auth_api_key.ApiResponseFor200) | Success
400 | [ApiResponseFor400](#p_ost_auth_api_key.ApiResponseFor400) | Bad Request

#### p_ost_auth_api_key.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**AccessToken**](../../models/AccessToken.md) |  | 


#### p_ost_auth_api_key.ApiResponseFor400
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor400ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor400ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**BadRequest**](../../models/BadRequest.md) |  | 


### Authorization

No authorization required

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **p_ost_auth_refresh**
<a name="p_ost_auth_refresh"></a>
> AccessToken p_ost_auth_refresh()

Refresh token

Use the refresh endpoint with the refresh token you received when you first authenticated using the api-key endpoint. Send the refresh token in the body of your request. The api.video API returns a new access token that is valid for one hour (3600 seconds) and a new refresh token.  

### Example

```python
import video-api
from video-api.apis.tags import authentication_api
from video-api.model.bad_request import BadRequest
from video-api.model.refresh_token_payload import RefreshTokenPayload
from video-api.model.access_token import AccessToken
from pprint import pprint
# Defining the host is optional and defaults to https://ws.api.video
# See configuration.py for a list of all supported configuration parameters.
configuration = video-api.Configuration(
    host = "https://ws.api.video"
)

# Enter a context with an instance of the API client
with video-api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = authentication_api.AuthenticationApi(api_client)

    # example passing only optional values
    body = RefreshTokenPayload(
        refresh_token="refresh_token_example",
    )
    try:
        # Refresh token
        api_response = api_instance.p_ost_auth_refresh(
            body=body,
        )
        pprint(api_response)
    except video-api.ApiException as e:
        print("Exception when calling AuthenticationApi->p_ost_auth_refresh: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
body | typing.Union[SchemaForRequestBodyApplicationJson, Unset] | optional, default is unset |
content_type | str | optional, default is 'application/json' | Selects the schema and serialization of the request body
accept_content_types | typing.Tuple[str] | default is ('application/json', ) | Tells the server the content type(s) that are accepted by the client
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### body

# SchemaForRequestBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**RefreshTokenPayload**](../../models/RefreshTokenPayload.md) |  | 


### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#p_ost_auth_refresh.ApiResponseFor200) | Success
400 | [ApiResponseFor400](#p_ost_auth_refresh.ApiResponseFor400) | Bad Request

#### p_ost_auth_refresh.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**AccessToken**](../../models/AccessToken.md) |  | 


#### p_ost_auth_refresh.ApiResponseFor400
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor400ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor400ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**BadRequest**](../../models/BadRequest.md) |  | 


### Authorization

No authorization required

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

