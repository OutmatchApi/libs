<a name="__pageTop"></a>
# apitest.apis.tags.authentication_api.AuthenticationApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_dashboard_access_api_v1_auth_dashboard_access_app_id_post**](#get_dashboard_access_api_v1_auth_dashboard_access_app_id_post) | **post** /api/v1/auth/dashboard-access/{app_id}/ | Get Consumer App Portal Access
[**logout_api_v1_auth_logout_post**](#logout_api_v1_auth_logout_post) | **post** /api/v1/auth/logout/ | Logout

# **get_dashboard_access_api_v1_auth_dashboard_access_app_id_post**
<a name="get_dashboard_access_api_v1_auth_dashboard_access_app_id_post"></a>
> DashboardAccessOut get_dashboard_access_api_v1_auth_dashboard_access_app_id_post(app_id)

Get Consumer App Portal Access

Use this function to get magic links (and authentication codes) for connecting your users to the Consumer Application Portal.

### Example

* Bearer Authentication (HTTPBearer):
```python
import apitest
from apitest.apis.tags import authentication_api
from apitest.model.http_error_out import HttpErrorOut
from apitest.model.dashboard_access_out import DashboardAccessOut
from apitest.model.http_validation_error import HTTPValidationError
from pprint import pprint
# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = apitest.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure Bearer authorization: HTTPBearer
configuration = apitest.Configuration(
    access_token = 'YOUR_BEARER_TOKEN'
)
# Enter a context with an instance of the API client
with apitest.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = authentication_api.AuthenticationApi(api_client)

    # example passing only required values which don't have defaults set
    path_params = {
        'app_id': "app_1srOrx2ZWZBpBUvZwXKQmoEYga2",
    }
    header_params = {
    }
    try:
        # Get Consumer App Portal Access
        api_response = api_instance.get_dashboard_access_api_v1_auth_dashboard_access_app_id_post(
            path_params=path_params,
            header_params=header_params,
        )
        pprint(api_response)
    except apitest.ApiException as e:
        print("Exception when calling AuthenticationApi->get_dashboard_access_api_v1_auth_dashboard_access_app_id_post: %s\n" % e)

    # example passing only optional values
    path_params = {
        'app_id': "app_1srOrx2ZWZBpBUvZwXKQmoEYga2",
    }
    header_params = {
        'idempotency-key': "idempotency-key_example",
    }
    try:
        # Get Consumer App Portal Access
        api_response = api_instance.get_dashboard_access_api_v1_auth_dashboard_access_app_id_post(
            path_params=path_params,
            header_params=header_params,
        )
        pprint(api_response)
    except apitest.ApiException as e:
        print("Exception when calling AuthenticationApi->get_dashboard_access_api_v1_auth_dashboard_access_app_id_post: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
header_params | RequestHeaderParams | |
path_params | RequestPathParams | |
accept_content_types | typing.Tuple[str] | default is ('application/json', ) | Tells the server the content type(s) that are accepted by the client
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### header_params
#### RequestHeaderParams

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
idempotency-key | IdempotencyKeySchema | | optional

# IdempotencyKeySchema

The request's idempotency key

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
None, str,  | NoneClass, str,  | The request&#x27;s idempotency key | 

### path_params
#### RequestPathParams

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
app_id | AppIdSchema | | 

# AppIdSchema

The application's ID or UID

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  | The application&#x27;s ID or UID | 

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#get_dashboard_access_api_v1_auth_dashboard_access_app_id_post.ApiResponseFor200) | Successful Response
401 | [ApiResponseFor401](#get_dashboard_access_api_v1_auth_dashboard_access_app_id_post.ApiResponseFor401) | Unauthorized
403 | [ApiResponseFor403](#get_dashboard_access_api_v1_auth_dashboard_access_app_id_post.ApiResponseFor403) | Forbidden
404 | [ApiResponseFor404](#get_dashboard_access_api_v1_auth_dashboard_access_app_id_post.ApiResponseFor404) | Not Found
409 | [ApiResponseFor409](#get_dashboard_access_api_v1_auth_dashboard_access_app_id_post.ApiResponseFor409) | Conflict
422 | [ApiResponseFor422](#get_dashboard_access_api_v1_auth_dashboard_access_app_id_post.ApiResponseFor422) | Validation Error
429 | [ApiResponseFor429](#get_dashboard_access_api_v1_auth_dashboard_access_app_id_post.ApiResponseFor429) | Too Many Requests

#### get_dashboard_access_api_v1_auth_dashboard_access_app_id_post.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**DashboardAccessOut**](../../models/DashboardAccessOut.md) |  | 


#### get_dashboard_access_api_v1_auth_dashboard_access_app_id_post.ApiResponseFor401
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor401ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor401ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### get_dashboard_access_api_v1_auth_dashboard_access_app_id_post.ApiResponseFor403
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor403ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor403ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### get_dashboard_access_api_v1_auth_dashboard_access_app_id_post.ApiResponseFor404
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor404ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor404ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### get_dashboard_access_api_v1_auth_dashboard_access_app_id_post.ApiResponseFor409
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor409ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor409ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### get_dashboard_access_api_v1_auth_dashboard_access_app_id_post.ApiResponseFor422
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor422ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor422ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HTTPValidationError**](../../models/HTTPValidationError.md) |  | 


#### get_dashboard_access_api_v1_auth_dashboard_access_app_id_post.ApiResponseFor429
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor429ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor429ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


### Authorization

[HTTPBearer](../../../README.md#HTTPBearer)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **logout_api_v1_auth_logout_post**
<a name="logout_api_v1_auth_logout_post"></a>
> logout_api_v1_auth_logout_post()

Logout

Logout an app token.  Trying to log out other tokens will fail.

### Example

* Bearer Authentication (HTTPBearer):
```python
import apitest
from apitest.apis.tags import authentication_api
from apitest.model.http_error_out import HttpErrorOut
from apitest.model.http_validation_error import HTTPValidationError
from pprint import pprint
# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = apitest.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure Bearer authorization: HTTPBearer
configuration = apitest.Configuration(
    access_token = 'YOUR_BEARER_TOKEN'
)
# Enter a context with an instance of the API client
with apitest.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = authentication_api.AuthenticationApi(api_client)

    # example passing only optional values
    header_params = {
        'idempotency-key': "idempotency-key_example",
    }
    try:
        # Logout
        api_response = api_instance.logout_api_v1_auth_logout_post(
            header_params=header_params,
        )
    except apitest.ApiException as e:
        print("Exception when calling AuthenticationApi->logout_api_v1_auth_logout_post: %s\n" % e)
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
idempotency-key | IdempotencyKeySchema | | optional

# IdempotencyKeySchema

The request's idempotency key

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
None, str,  | NoneClass, str,  | The request&#x27;s idempotency key | 

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
204 | [ApiResponseFor204](#logout_api_v1_auth_logout_post.ApiResponseFor204) | Successful Response
401 | [ApiResponseFor401](#logout_api_v1_auth_logout_post.ApiResponseFor401) | Unauthorized
403 | [ApiResponseFor403](#logout_api_v1_auth_logout_post.ApiResponseFor403) | Forbidden
404 | [ApiResponseFor404](#logout_api_v1_auth_logout_post.ApiResponseFor404) | Not Found
409 | [ApiResponseFor409](#logout_api_v1_auth_logout_post.ApiResponseFor409) | Conflict
422 | [ApiResponseFor422](#logout_api_v1_auth_logout_post.ApiResponseFor422) | Validation Error
429 | [ApiResponseFor429](#logout_api_v1_auth_logout_post.ApiResponseFor429) | Too Many Requests

#### logout_api_v1_auth_logout_post.ApiResponseFor204
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | Unset | body was not defined |
headers | Unset | headers were not defined |

#### logout_api_v1_auth_logout_post.ApiResponseFor401
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor401ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor401ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### logout_api_v1_auth_logout_post.ApiResponseFor403
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor403ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor403ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### logout_api_v1_auth_logout_post.ApiResponseFor404
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor404ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor404ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### logout_api_v1_auth_logout_post.ApiResponseFor409
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor409ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor409ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### logout_api_v1_auth_logout_post.ApiResponseFor422
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor422ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor422ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HTTPValidationError**](../../models/HTTPValidationError.md) |  | 


#### logout_api_v1_auth_logout_post.ApiResponseFor429
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor429ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor429ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


### Authorization

[HTTPBearer](../../../README.md#HTTPBearer)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

