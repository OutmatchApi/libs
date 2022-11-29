<a name="__pageTop"></a>
# apitest.apis.tags.endpoint_api.EndpointApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_endpoint_api_v1_app_app_id_endpoint_post**](#create_endpoint_api_v1_app_app_id_endpoint_post) | **post** /api/v1/app/{app_id}/endpoint/ | Create Endpoint
[**delete_endpoint_api_v1_app_app_id_endpoint_endpoint_id_delete**](#delete_endpoint_api_v1_app_app_id_endpoint_endpoint_id_delete) | **delete** /api/v1/app/{app_id}/endpoint/{endpoint_id}/ | Delete Endpoint
[**get_endpoint_api_v1_app_app_id_endpoint_endpoint_id_get**](#get_endpoint_api_v1_app_app_id_endpoint_endpoint_id_get) | **get** /api/v1/app/{app_id}/endpoint/{endpoint_id}/ | Get Endpoint
[**get_endpoint_headers_api_v1_app_app_id_endpoint_endpoint_id_headers_get**](#get_endpoint_headers_api_v1_app_app_id_endpoint_endpoint_id_headers_get) | **get** /api/v1/app/{app_id}/endpoint/{endpoint_id}/headers/ | Get Endpoint Headers
[**get_endpoint_secret_api_v1_app_app_id_endpoint_endpoint_id_secret_get**](#get_endpoint_secret_api_v1_app_app_id_endpoint_endpoint_id_secret_get) | **get** /api/v1/app/{app_id}/endpoint/{endpoint_id}/secret/ | Get Endpoint Secret
[**get_endpoint_stats_api_v1_app_app_id_endpoint_endpoint_id_stats_get**](#get_endpoint_stats_api_v1_app_app_id_endpoint_endpoint_id_stats_get) | **get** /api/v1/app/{app_id}/endpoint/{endpoint_id}/stats/ | Get Endpoint Stats
[**list_endpoints_api_v1_app_app_id_endpoint_get**](#list_endpoints_api_v1_app_app_id_endpoint_get) | **get** /api/v1/app/{app_id}/endpoint/ | List Endpoints
[**patch_endpoint_headers_api_v1_app_app_id_endpoint_endpoint_id_headers_patch**](#patch_endpoint_headers_api_v1_app_app_id_endpoint_endpoint_id_headers_patch) | **patch** /api/v1/app/{app_id}/endpoint/{endpoint_id}/headers/ | Patch Endpoint Headers
[**recover_failed_webhooks_api_v1_app_app_id_endpoint_endpoint_id_recover_post**](#recover_failed_webhooks_api_v1_app_app_id_endpoint_endpoint_id_recover_post) | **post** /api/v1/app/{app_id}/endpoint/{endpoint_id}/recover/ | Recover Failed Webhooks
[**replay_missing_webhooks_api_v1_app_app_id_endpoint_endpoint_id_replay_missing_post**](#replay_missing_webhooks_api_v1_app_app_id_endpoint_endpoint_id_replay_missing_post) | **post** /api/v1/app/{app_id}/endpoint/{endpoint_id}/replay-missing/ | Replay Missing Webhooks
[**rotate_endpoint_secret_api_v1_app_app_id_endpoint_endpoint_id_secret_rotate_post**](#rotate_endpoint_secret_api_v1_app_app_id_endpoint_endpoint_id_secret_rotate_post) | **post** /api/v1/app/{app_id}/endpoint/{endpoint_id}/secret/rotate/ | Rotate Endpoint Secret
[**update_endpoint_api_v1_app_app_id_endpoint_endpoint_id_put**](#update_endpoint_api_v1_app_app_id_endpoint_endpoint_id_put) | **put** /api/v1/app/{app_id}/endpoint/{endpoint_id}/ | Update Endpoint
[**update_endpoint_headers_api_v1_app_app_id_endpoint_endpoint_id_headers_put**](#update_endpoint_headers_api_v1_app_app_id_endpoint_endpoint_id_headers_put) | **put** /api/v1/app/{app_id}/endpoint/{endpoint_id}/headers/ | Update Endpoint Headers

# **create_endpoint_api_v1_app_app_id_endpoint_post**
<a name="create_endpoint_api_v1_app_app_id_endpoint_post"></a>
> EndpointOut create_endpoint_api_v1_app_app_id_endpoint_post(app_idendpoint_in)

Create Endpoint

Create a new endpoint for the application.  When `secret` is `null` the secret is automatically generated (recommended)

### Example

* Bearer Authentication (HTTPBearer):
```python
import apitest
from apitest.apis.tags import endpoint_api
from apitest.model.endpoint_out import EndpointOut
from apitest.model.endpoint_in import EndpointIn
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
    api_instance = endpoint_api.EndpointApi(api_client)

    # example passing only required values which don't have defaults set
    path_params = {
        'app_id': "app_1srOrx2ZWZBpBUvZwXKQmoEYga2",
    }
    header_params = {
    }
    body = EndpointIn(
        uid="unique-endpoint-identifier",
        url="https://example.com/webhook/",
        version=1,
        description="An example endpoint name",
        filter_types=["user.signup","user.deleted"],
        channels=["project_123","group_2"],
        disabled=False,
        rate_limit=1000,
        metadata=dict(
            "key": "key_example",
        ),
        secret="whsec_C2FVsBQIhrscChlQIMV+b5sSYspob7oD",
    )
    try:
        # Create Endpoint
        api_response = api_instance.create_endpoint_api_v1_app_app_id_endpoint_post(
            path_params=path_params,
            header_params=header_params,
            body=body,
        )
        pprint(api_response)
    except apitest.ApiException as e:
        print("Exception when calling EndpointApi->create_endpoint_api_v1_app_app_id_endpoint_post: %s\n" % e)

    # example passing only optional values
    path_params = {
        'app_id': "app_1srOrx2ZWZBpBUvZwXKQmoEYga2",
    }
    header_params = {
        'idempotency-key': "idempotency-key_example",
    }
    body = EndpointIn(
        uid="unique-endpoint-identifier",
        url="https://example.com/webhook/",
        version=1,
        description="An example endpoint name",
        filter_types=["user.signup","user.deleted"],
        channels=["project_123","group_2"],
        disabled=False,
        rate_limit=1000,
        metadata=dict(
            "key": "key_example",
        ),
        secret="whsec_C2FVsBQIhrscChlQIMV+b5sSYspob7oD",
    )
    try:
        # Create Endpoint
        api_response = api_instance.create_endpoint_api_v1_app_app_id_endpoint_post(
            path_params=path_params,
            header_params=header_params,
            body=body,
        )
        pprint(api_response)
    except apitest.ApiException as e:
        print("Exception when calling EndpointApi->create_endpoint_api_v1_app_app_id_endpoint_post: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
body | typing.Union[SchemaForRequestBodyApplicationJson] | required |
header_params | RequestHeaderParams | |
path_params | RequestPathParams | |
content_type | str | optional, default is 'application/json' | Selects the schema and serialization of the request body
accept_content_types | typing.Tuple[str] | default is ('application/json', ) | Tells the server the content type(s) that are accepted by the client
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### body

# SchemaForRequestBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**EndpointIn**](../../models/EndpointIn.md) |  | 


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
201 | [ApiResponseFor201](#create_endpoint_api_v1_app_app_id_endpoint_post.ApiResponseFor201) | Successful Response
401 | [ApiResponseFor401](#create_endpoint_api_v1_app_app_id_endpoint_post.ApiResponseFor401) | Unauthorized
403 | [ApiResponseFor403](#create_endpoint_api_v1_app_app_id_endpoint_post.ApiResponseFor403) | Forbidden
404 | [ApiResponseFor404](#create_endpoint_api_v1_app_app_id_endpoint_post.ApiResponseFor404) | Not Found
409 | [ApiResponseFor409](#create_endpoint_api_v1_app_app_id_endpoint_post.ApiResponseFor409) | Conflict
422 | [ApiResponseFor422](#create_endpoint_api_v1_app_app_id_endpoint_post.ApiResponseFor422) | Validation Error
429 | [ApiResponseFor429](#create_endpoint_api_v1_app_app_id_endpoint_post.ApiResponseFor429) | Too Many Requests

#### create_endpoint_api_v1_app_app_id_endpoint_post.ApiResponseFor201
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor201ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor201ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**EndpointOut**](../../models/EndpointOut.md) |  | 


#### create_endpoint_api_v1_app_app_id_endpoint_post.ApiResponseFor401
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor401ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor401ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### create_endpoint_api_v1_app_app_id_endpoint_post.ApiResponseFor403
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor403ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor403ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### create_endpoint_api_v1_app_app_id_endpoint_post.ApiResponseFor404
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor404ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor404ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### create_endpoint_api_v1_app_app_id_endpoint_post.ApiResponseFor409
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor409ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor409ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### create_endpoint_api_v1_app_app_id_endpoint_post.ApiResponseFor422
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor422ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor422ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HTTPValidationError**](../../models/HTTPValidationError.md) |  | 


#### create_endpoint_api_v1_app_app_id_endpoint_post.ApiResponseFor429
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

# **delete_endpoint_api_v1_app_app_id_endpoint_endpoint_id_delete**
<a name="delete_endpoint_api_v1_app_app_id_endpoint_endpoint_id_delete"></a>
> delete_endpoint_api_v1_app_app_id_endpoint_endpoint_id_delete(endpoint_idapp_id)

Delete Endpoint

Delete an endpoint.

### Example

* Bearer Authentication (HTTPBearer):
```python
import apitest
from apitest.apis.tags import endpoint_api
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
    api_instance = endpoint_api.EndpointApi(api_client)

    # example passing only required values which don't have defaults set
    path_params = {
        'endpoint_id': "ep_1srOrx2ZWZBpBUvZwXKQmoEYga2",
        'app_id': "app_1srOrx2ZWZBpBUvZwXKQmoEYga2",
    }
    header_params = {
    }
    try:
        # Delete Endpoint
        api_response = api_instance.delete_endpoint_api_v1_app_app_id_endpoint_endpoint_id_delete(
            path_params=path_params,
            header_params=header_params,
        )
    except apitest.ApiException as e:
        print("Exception when calling EndpointApi->delete_endpoint_api_v1_app_app_id_endpoint_endpoint_id_delete: %s\n" % e)

    # example passing only optional values
    path_params = {
        'endpoint_id': "ep_1srOrx2ZWZBpBUvZwXKQmoEYga2",
        'app_id': "app_1srOrx2ZWZBpBUvZwXKQmoEYga2",
    }
    header_params = {
        'idempotency-key': "idempotency-key_example",
    }
    try:
        # Delete Endpoint
        api_response = api_instance.delete_endpoint_api_v1_app_app_id_endpoint_endpoint_id_delete(
            path_params=path_params,
            header_params=header_params,
        )
    except apitest.ApiException as e:
        print("Exception when calling EndpointApi->delete_endpoint_api_v1_app_app_id_endpoint_endpoint_id_delete: %s\n" % e)
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
endpoint_id | EndpointIdSchema | | 
app_id | AppIdSchema | | 

# EndpointIdSchema

The endpoint's ID or UID

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  | The endpoint&#x27;s ID or UID | 

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
204 | [ApiResponseFor204](#delete_endpoint_api_v1_app_app_id_endpoint_endpoint_id_delete.ApiResponseFor204) | Successful Response
401 | [ApiResponseFor401](#delete_endpoint_api_v1_app_app_id_endpoint_endpoint_id_delete.ApiResponseFor401) | Unauthorized
403 | [ApiResponseFor403](#delete_endpoint_api_v1_app_app_id_endpoint_endpoint_id_delete.ApiResponseFor403) | Forbidden
404 | [ApiResponseFor404](#delete_endpoint_api_v1_app_app_id_endpoint_endpoint_id_delete.ApiResponseFor404) | Not Found
409 | [ApiResponseFor409](#delete_endpoint_api_v1_app_app_id_endpoint_endpoint_id_delete.ApiResponseFor409) | Conflict
422 | [ApiResponseFor422](#delete_endpoint_api_v1_app_app_id_endpoint_endpoint_id_delete.ApiResponseFor422) | Validation Error
429 | [ApiResponseFor429](#delete_endpoint_api_v1_app_app_id_endpoint_endpoint_id_delete.ApiResponseFor429) | Too Many Requests

#### delete_endpoint_api_v1_app_app_id_endpoint_endpoint_id_delete.ApiResponseFor204
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | Unset | body was not defined |
headers | Unset | headers were not defined |

#### delete_endpoint_api_v1_app_app_id_endpoint_endpoint_id_delete.ApiResponseFor401
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor401ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor401ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### delete_endpoint_api_v1_app_app_id_endpoint_endpoint_id_delete.ApiResponseFor403
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor403ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor403ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### delete_endpoint_api_v1_app_app_id_endpoint_endpoint_id_delete.ApiResponseFor404
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor404ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor404ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### delete_endpoint_api_v1_app_app_id_endpoint_endpoint_id_delete.ApiResponseFor409
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor409ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor409ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### delete_endpoint_api_v1_app_app_id_endpoint_endpoint_id_delete.ApiResponseFor422
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor422ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor422ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HTTPValidationError**](../../models/HTTPValidationError.md) |  | 


#### delete_endpoint_api_v1_app_app_id_endpoint_endpoint_id_delete.ApiResponseFor429
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

# **get_endpoint_api_v1_app_app_id_endpoint_endpoint_id_get**
<a name="get_endpoint_api_v1_app_app_id_endpoint_endpoint_id_get"></a>
> EndpointOut get_endpoint_api_v1_app_app_id_endpoint_endpoint_id_get(endpoint_idapp_id)

Get Endpoint

Get an application.

### Example

* Bearer Authentication (HTTPBearer):
```python
import apitest
from apitest.apis.tags import endpoint_api
from apitest.model.endpoint_out import EndpointOut
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
    api_instance = endpoint_api.EndpointApi(api_client)

    # example passing only required values which don't have defaults set
    path_params = {
        'endpoint_id': "ep_1srOrx2ZWZBpBUvZwXKQmoEYga2",
        'app_id': "app_1srOrx2ZWZBpBUvZwXKQmoEYga2",
    }
    header_params = {
    }
    try:
        # Get Endpoint
        api_response = api_instance.get_endpoint_api_v1_app_app_id_endpoint_endpoint_id_get(
            path_params=path_params,
            header_params=header_params,
        )
        pprint(api_response)
    except apitest.ApiException as e:
        print("Exception when calling EndpointApi->get_endpoint_api_v1_app_app_id_endpoint_endpoint_id_get: %s\n" % e)

    # example passing only optional values
    path_params = {
        'endpoint_id': "ep_1srOrx2ZWZBpBUvZwXKQmoEYga2",
        'app_id': "app_1srOrx2ZWZBpBUvZwXKQmoEYga2",
    }
    header_params = {
        'idempotency-key': "idempotency-key_example",
    }
    try:
        # Get Endpoint
        api_response = api_instance.get_endpoint_api_v1_app_app_id_endpoint_endpoint_id_get(
            path_params=path_params,
            header_params=header_params,
        )
        pprint(api_response)
    except apitest.ApiException as e:
        print("Exception when calling EndpointApi->get_endpoint_api_v1_app_app_id_endpoint_endpoint_id_get: %s\n" % e)
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
endpoint_id | EndpointIdSchema | | 
app_id | AppIdSchema | | 

# EndpointIdSchema

The endpoint's ID or UID

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  | The endpoint&#x27;s ID or UID | 

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
200 | [ApiResponseFor200](#get_endpoint_api_v1_app_app_id_endpoint_endpoint_id_get.ApiResponseFor200) | Successful Response
401 | [ApiResponseFor401](#get_endpoint_api_v1_app_app_id_endpoint_endpoint_id_get.ApiResponseFor401) | Unauthorized
403 | [ApiResponseFor403](#get_endpoint_api_v1_app_app_id_endpoint_endpoint_id_get.ApiResponseFor403) | Forbidden
404 | [ApiResponseFor404](#get_endpoint_api_v1_app_app_id_endpoint_endpoint_id_get.ApiResponseFor404) | Not Found
409 | [ApiResponseFor409](#get_endpoint_api_v1_app_app_id_endpoint_endpoint_id_get.ApiResponseFor409) | Conflict
422 | [ApiResponseFor422](#get_endpoint_api_v1_app_app_id_endpoint_endpoint_id_get.ApiResponseFor422) | Validation Error
429 | [ApiResponseFor429](#get_endpoint_api_v1_app_app_id_endpoint_endpoint_id_get.ApiResponseFor429) | Too Many Requests

#### get_endpoint_api_v1_app_app_id_endpoint_endpoint_id_get.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**EndpointOut**](../../models/EndpointOut.md) |  | 


#### get_endpoint_api_v1_app_app_id_endpoint_endpoint_id_get.ApiResponseFor401
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor401ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor401ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### get_endpoint_api_v1_app_app_id_endpoint_endpoint_id_get.ApiResponseFor403
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor403ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor403ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### get_endpoint_api_v1_app_app_id_endpoint_endpoint_id_get.ApiResponseFor404
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor404ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor404ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### get_endpoint_api_v1_app_app_id_endpoint_endpoint_id_get.ApiResponseFor409
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor409ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor409ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### get_endpoint_api_v1_app_app_id_endpoint_endpoint_id_get.ApiResponseFor422
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor422ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor422ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HTTPValidationError**](../../models/HTTPValidationError.md) |  | 


#### get_endpoint_api_v1_app_app_id_endpoint_endpoint_id_get.ApiResponseFor429
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

# **get_endpoint_headers_api_v1_app_app_id_endpoint_endpoint_id_headers_get**
<a name="get_endpoint_headers_api_v1_app_app_id_endpoint_endpoint_id_headers_get"></a>
> EndpointHeadersOut get_endpoint_headers_api_v1_app_app_id_endpoint_endpoint_id_headers_get(endpoint_idapp_id)

Get Endpoint Headers

Get the additional headers to be sent with the webhook

### Example

* Bearer Authentication (HTTPBearer):
```python
import apitest
from apitest.apis.tags import endpoint_api
from apitest.model.endpoint_headers_out import EndpointHeadersOut
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
    api_instance = endpoint_api.EndpointApi(api_client)

    # example passing only required values which don't have defaults set
    path_params = {
        'endpoint_id': "ep_1srOrx2ZWZBpBUvZwXKQmoEYga2",
        'app_id': "app_1srOrx2ZWZBpBUvZwXKQmoEYga2",
    }
    header_params = {
    }
    try:
        # Get Endpoint Headers
        api_response = api_instance.get_endpoint_headers_api_v1_app_app_id_endpoint_endpoint_id_headers_get(
            path_params=path_params,
            header_params=header_params,
        )
        pprint(api_response)
    except apitest.ApiException as e:
        print("Exception when calling EndpointApi->get_endpoint_headers_api_v1_app_app_id_endpoint_endpoint_id_headers_get: %s\n" % e)

    # example passing only optional values
    path_params = {
        'endpoint_id': "ep_1srOrx2ZWZBpBUvZwXKQmoEYga2",
        'app_id': "app_1srOrx2ZWZBpBUvZwXKQmoEYga2",
    }
    header_params = {
        'idempotency-key': "idempotency-key_example",
    }
    try:
        # Get Endpoint Headers
        api_response = api_instance.get_endpoint_headers_api_v1_app_app_id_endpoint_endpoint_id_headers_get(
            path_params=path_params,
            header_params=header_params,
        )
        pprint(api_response)
    except apitest.ApiException as e:
        print("Exception when calling EndpointApi->get_endpoint_headers_api_v1_app_app_id_endpoint_endpoint_id_headers_get: %s\n" % e)
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
endpoint_id | EndpointIdSchema | | 
app_id | AppIdSchema | | 

# EndpointIdSchema

The endpoint's ID or UID

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  | The endpoint&#x27;s ID or UID | 

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
200 | [ApiResponseFor200](#get_endpoint_headers_api_v1_app_app_id_endpoint_endpoint_id_headers_get.ApiResponseFor200) | Successful Response
401 | [ApiResponseFor401](#get_endpoint_headers_api_v1_app_app_id_endpoint_endpoint_id_headers_get.ApiResponseFor401) | Unauthorized
403 | [ApiResponseFor403](#get_endpoint_headers_api_v1_app_app_id_endpoint_endpoint_id_headers_get.ApiResponseFor403) | Forbidden
404 | [ApiResponseFor404](#get_endpoint_headers_api_v1_app_app_id_endpoint_endpoint_id_headers_get.ApiResponseFor404) | Not Found
409 | [ApiResponseFor409](#get_endpoint_headers_api_v1_app_app_id_endpoint_endpoint_id_headers_get.ApiResponseFor409) | Conflict
422 | [ApiResponseFor422](#get_endpoint_headers_api_v1_app_app_id_endpoint_endpoint_id_headers_get.ApiResponseFor422) | Validation Error
429 | [ApiResponseFor429](#get_endpoint_headers_api_v1_app_app_id_endpoint_endpoint_id_headers_get.ApiResponseFor429) | Too Many Requests

#### get_endpoint_headers_api_v1_app_app_id_endpoint_endpoint_id_headers_get.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**EndpointHeadersOut**](../../models/EndpointHeadersOut.md) |  | 


#### get_endpoint_headers_api_v1_app_app_id_endpoint_endpoint_id_headers_get.ApiResponseFor401
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor401ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor401ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### get_endpoint_headers_api_v1_app_app_id_endpoint_endpoint_id_headers_get.ApiResponseFor403
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor403ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor403ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### get_endpoint_headers_api_v1_app_app_id_endpoint_endpoint_id_headers_get.ApiResponseFor404
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor404ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor404ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### get_endpoint_headers_api_v1_app_app_id_endpoint_endpoint_id_headers_get.ApiResponseFor409
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor409ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor409ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### get_endpoint_headers_api_v1_app_app_id_endpoint_endpoint_id_headers_get.ApiResponseFor422
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor422ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor422ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HTTPValidationError**](../../models/HTTPValidationError.md) |  | 


#### get_endpoint_headers_api_v1_app_app_id_endpoint_endpoint_id_headers_get.ApiResponseFor429
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

# **get_endpoint_secret_api_v1_app_app_id_endpoint_endpoint_id_secret_get**
<a name="get_endpoint_secret_api_v1_app_app_id_endpoint_endpoint_id_secret_get"></a>
> EndpointSecretOut get_endpoint_secret_api_v1_app_app_id_endpoint_endpoint_id_secret_get(endpoint_idapp_id)

Get Endpoint Secret

Get the endpoint's signing secret.  This is used to verify the authenticity of the webhook. For more information please refer to [the consuming webhooks docs](https://docs.svix.com/consuming-webhooks/).

### Example

* Bearer Authentication (HTTPBearer):
```python
import apitest
from apitest.apis.tags import endpoint_api
from apitest.model.endpoint_secret_out import EndpointSecretOut
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
    api_instance = endpoint_api.EndpointApi(api_client)

    # example passing only required values which don't have defaults set
    path_params = {
        'endpoint_id': "ep_1srOrx2ZWZBpBUvZwXKQmoEYga2",
        'app_id': "app_1srOrx2ZWZBpBUvZwXKQmoEYga2",
    }
    header_params = {
    }
    try:
        # Get Endpoint Secret
        api_response = api_instance.get_endpoint_secret_api_v1_app_app_id_endpoint_endpoint_id_secret_get(
            path_params=path_params,
            header_params=header_params,
        )
        pprint(api_response)
    except apitest.ApiException as e:
        print("Exception when calling EndpointApi->get_endpoint_secret_api_v1_app_app_id_endpoint_endpoint_id_secret_get: %s\n" % e)

    # example passing only optional values
    path_params = {
        'endpoint_id': "ep_1srOrx2ZWZBpBUvZwXKQmoEYga2",
        'app_id': "app_1srOrx2ZWZBpBUvZwXKQmoEYga2",
    }
    header_params = {
        'idempotency-key': "idempotency-key_example",
    }
    try:
        # Get Endpoint Secret
        api_response = api_instance.get_endpoint_secret_api_v1_app_app_id_endpoint_endpoint_id_secret_get(
            path_params=path_params,
            header_params=header_params,
        )
        pprint(api_response)
    except apitest.ApiException as e:
        print("Exception when calling EndpointApi->get_endpoint_secret_api_v1_app_app_id_endpoint_endpoint_id_secret_get: %s\n" % e)
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
endpoint_id | EndpointIdSchema | | 
app_id | AppIdSchema | | 

# EndpointIdSchema

The endpoint's ID or UID

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  | The endpoint&#x27;s ID or UID | 

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
200 | [ApiResponseFor200](#get_endpoint_secret_api_v1_app_app_id_endpoint_endpoint_id_secret_get.ApiResponseFor200) | Successful Response
401 | [ApiResponseFor401](#get_endpoint_secret_api_v1_app_app_id_endpoint_endpoint_id_secret_get.ApiResponseFor401) | Unauthorized
403 | [ApiResponseFor403](#get_endpoint_secret_api_v1_app_app_id_endpoint_endpoint_id_secret_get.ApiResponseFor403) | Forbidden
404 | [ApiResponseFor404](#get_endpoint_secret_api_v1_app_app_id_endpoint_endpoint_id_secret_get.ApiResponseFor404) | Not Found
409 | [ApiResponseFor409](#get_endpoint_secret_api_v1_app_app_id_endpoint_endpoint_id_secret_get.ApiResponseFor409) | Conflict
422 | [ApiResponseFor422](#get_endpoint_secret_api_v1_app_app_id_endpoint_endpoint_id_secret_get.ApiResponseFor422) | Validation Error
429 | [ApiResponseFor429](#get_endpoint_secret_api_v1_app_app_id_endpoint_endpoint_id_secret_get.ApiResponseFor429) | Too Many Requests

#### get_endpoint_secret_api_v1_app_app_id_endpoint_endpoint_id_secret_get.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**EndpointSecretOut**](../../models/EndpointSecretOut.md) |  | 


#### get_endpoint_secret_api_v1_app_app_id_endpoint_endpoint_id_secret_get.ApiResponseFor401
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor401ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor401ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### get_endpoint_secret_api_v1_app_app_id_endpoint_endpoint_id_secret_get.ApiResponseFor403
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor403ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor403ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### get_endpoint_secret_api_v1_app_app_id_endpoint_endpoint_id_secret_get.ApiResponseFor404
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor404ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor404ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### get_endpoint_secret_api_v1_app_app_id_endpoint_endpoint_id_secret_get.ApiResponseFor409
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor409ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor409ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### get_endpoint_secret_api_v1_app_app_id_endpoint_endpoint_id_secret_get.ApiResponseFor422
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor422ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor422ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HTTPValidationError**](../../models/HTTPValidationError.md) |  | 


#### get_endpoint_secret_api_v1_app_app_id_endpoint_endpoint_id_secret_get.ApiResponseFor429
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

# **get_endpoint_stats_api_v1_app_app_id_endpoint_endpoint_id_stats_get**
<a name="get_endpoint_stats_api_v1_app_app_id_endpoint_endpoint_id_stats_get"></a>
> EndpointStats get_endpoint_stats_api_v1_app_app_id_endpoint_endpoint_id_stats_get(endpoint_idapp_id)

Get Endpoint Stats

Get basic statistics for the endpoint.

### Example

* Bearer Authentication (HTTPBearer):
```python
import apitest
from apitest.apis.tags import endpoint_api
from apitest.model.endpoint_stats import EndpointStats
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
    api_instance = endpoint_api.EndpointApi(api_client)

    # example passing only required values which don't have defaults set
    path_params = {
        'endpoint_id': "ep_1srOrx2ZWZBpBUvZwXKQmoEYga2",
        'app_id': "app_1srOrx2ZWZBpBUvZwXKQmoEYga2",
    }
    header_params = {
    }
    try:
        # Get Endpoint Stats
        api_response = api_instance.get_endpoint_stats_api_v1_app_app_id_endpoint_endpoint_id_stats_get(
            path_params=path_params,
            header_params=header_params,
        )
        pprint(api_response)
    except apitest.ApiException as e:
        print("Exception when calling EndpointApi->get_endpoint_stats_api_v1_app_app_id_endpoint_endpoint_id_stats_get: %s\n" % e)

    # example passing only optional values
    path_params = {
        'endpoint_id': "ep_1srOrx2ZWZBpBUvZwXKQmoEYga2",
        'app_id': "app_1srOrx2ZWZBpBUvZwXKQmoEYga2",
    }
    header_params = {
        'idempotency-key': "idempotency-key_example",
    }
    try:
        # Get Endpoint Stats
        api_response = api_instance.get_endpoint_stats_api_v1_app_app_id_endpoint_endpoint_id_stats_get(
            path_params=path_params,
            header_params=header_params,
        )
        pprint(api_response)
    except apitest.ApiException as e:
        print("Exception when calling EndpointApi->get_endpoint_stats_api_v1_app_app_id_endpoint_endpoint_id_stats_get: %s\n" % e)
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
endpoint_id | EndpointIdSchema | | 
app_id | AppIdSchema | | 

# EndpointIdSchema

The endpoint's ID or UID

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  | The endpoint&#x27;s ID or UID | 

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
200 | [ApiResponseFor200](#get_endpoint_stats_api_v1_app_app_id_endpoint_endpoint_id_stats_get.ApiResponseFor200) | Successful Response
401 | [ApiResponseFor401](#get_endpoint_stats_api_v1_app_app_id_endpoint_endpoint_id_stats_get.ApiResponseFor401) | Unauthorized
403 | [ApiResponseFor403](#get_endpoint_stats_api_v1_app_app_id_endpoint_endpoint_id_stats_get.ApiResponseFor403) | Forbidden
404 | [ApiResponseFor404](#get_endpoint_stats_api_v1_app_app_id_endpoint_endpoint_id_stats_get.ApiResponseFor404) | Not Found
409 | [ApiResponseFor409](#get_endpoint_stats_api_v1_app_app_id_endpoint_endpoint_id_stats_get.ApiResponseFor409) | Conflict
422 | [ApiResponseFor422](#get_endpoint_stats_api_v1_app_app_id_endpoint_endpoint_id_stats_get.ApiResponseFor422) | Validation Error
429 | [ApiResponseFor429](#get_endpoint_stats_api_v1_app_app_id_endpoint_endpoint_id_stats_get.ApiResponseFor429) | Too Many Requests

#### get_endpoint_stats_api_v1_app_app_id_endpoint_endpoint_id_stats_get.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**EndpointStats**](../../models/EndpointStats.md) |  | 


#### get_endpoint_stats_api_v1_app_app_id_endpoint_endpoint_id_stats_get.ApiResponseFor401
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor401ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor401ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### get_endpoint_stats_api_v1_app_app_id_endpoint_endpoint_id_stats_get.ApiResponseFor403
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor403ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor403ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### get_endpoint_stats_api_v1_app_app_id_endpoint_endpoint_id_stats_get.ApiResponseFor404
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor404ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor404ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### get_endpoint_stats_api_v1_app_app_id_endpoint_endpoint_id_stats_get.ApiResponseFor409
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor409ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor409ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### get_endpoint_stats_api_v1_app_app_id_endpoint_endpoint_id_stats_get.ApiResponseFor422
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor422ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor422ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HTTPValidationError**](../../models/HTTPValidationError.md) |  | 


#### get_endpoint_stats_api_v1_app_app_id_endpoint_endpoint_id_stats_get.ApiResponseFor429
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

# **list_endpoints_api_v1_app_app_id_endpoint_get**
<a name="list_endpoints_api_v1_app_app_id_endpoint_get"></a>
> ListResponseEndpointOut list_endpoints_api_v1_app_app_id_endpoint_get(app_id)

List Endpoints

List the application's endpoints.

### Example

* Bearer Authentication (HTTPBearer):
```python
import apitest
from apitest.apis.tags import endpoint_api
from apitest.model.list_response_endpoint_out import ListResponseEndpointOut
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
    api_instance = endpoint_api.EndpointApi(api_client)

    # example passing only required values which don't have defaults set
    path_params = {
        'app_id': "app_1srOrx2ZWZBpBUvZwXKQmoEYga2",
    }
    query_params = {
    }
    header_params = {
    }
    try:
        # List Endpoints
        api_response = api_instance.list_endpoints_api_v1_app_app_id_endpoint_get(
            path_params=path_params,
            query_params=query_params,
            header_params=header_params,
        )
        pprint(api_response)
    except apitest.ApiException as e:
        print("Exception when calling EndpointApi->list_endpoints_api_v1_app_app_id_endpoint_get: %s\n" % e)

    # example passing only optional values
    path_params = {
        'app_id': "app_1srOrx2ZWZBpBUvZwXKQmoEYga2",
    }
    query_params = {
        'iterator': "ep_1srOrx2ZWZBpBUvZwXKQmoEYga2",
        'limit': 50,
    }
    header_params = {
        'idempotency-key': "idempotency-key_example",
    }
    try:
        # List Endpoints
        api_response = api_instance.list_endpoints_api_v1_app_app_id_endpoint_get(
            path_params=path_params,
            query_params=query_params,
            header_params=header_params,
        )
        pprint(api_response)
    except apitest.ApiException as e:
        print("Exception when calling EndpointApi->list_endpoints_api_v1_app_app_id_endpoint_get: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
query_params | RequestQueryParams | |
header_params | RequestHeaderParams | |
path_params | RequestPathParams | |
accept_content_types | typing.Tuple[str] | default is ('application/json', ) | Tells the server the content type(s) that are accepted by the client
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### query_params
#### RequestQueryParams

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
iterator | IteratorSchema | | optional
limit | LimitSchema | | optional


# IteratorSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
None, str,  | NoneClass, str,  |  | 

# LimitSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
decimal.Decimal, int,  | decimal.Decimal,  |  | if omitted the server will use the default value of 50

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
200 | [ApiResponseFor200](#list_endpoints_api_v1_app_app_id_endpoint_get.ApiResponseFor200) | Successful Response
401 | [ApiResponseFor401](#list_endpoints_api_v1_app_app_id_endpoint_get.ApiResponseFor401) | Unauthorized
403 | [ApiResponseFor403](#list_endpoints_api_v1_app_app_id_endpoint_get.ApiResponseFor403) | Forbidden
404 | [ApiResponseFor404](#list_endpoints_api_v1_app_app_id_endpoint_get.ApiResponseFor404) | Not Found
409 | [ApiResponseFor409](#list_endpoints_api_v1_app_app_id_endpoint_get.ApiResponseFor409) | Conflict
422 | [ApiResponseFor422](#list_endpoints_api_v1_app_app_id_endpoint_get.ApiResponseFor422) | Validation Error
429 | [ApiResponseFor429](#list_endpoints_api_v1_app_app_id_endpoint_get.ApiResponseFor429) | Too Many Requests

#### list_endpoints_api_v1_app_app_id_endpoint_get.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**ListResponseEndpointOut**](../../models/ListResponseEndpointOut.md) |  | 


#### list_endpoints_api_v1_app_app_id_endpoint_get.ApiResponseFor401
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor401ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor401ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### list_endpoints_api_v1_app_app_id_endpoint_get.ApiResponseFor403
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor403ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor403ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### list_endpoints_api_v1_app_app_id_endpoint_get.ApiResponseFor404
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor404ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor404ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### list_endpoints_api_v1_app_app_id_endpoint_get.ApiResponseFor409
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor409ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor409ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### list_endpoints_api_v1_app_app_id_endpoint_get.ApiResponseFor422
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor422ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor422ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HTTPValidationError**](../../models/HTTPValidationError.md) |  | 


#### list_endpoints_api_v1_app_app_id_endpoint_get.ApiResponseFor429
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

# **patch_endpoint_headers_api_v1_app_app_id_endpoint_endpoint_id_headers_patch**
<a name="patch_endpoint_headers_api_v1_app_app_id_endpoint_endpoint_id_headers_patch"></a>
> patch_endpoint_headers_api_v1_app_app_id_endpoint_endpoint_id_headers_patch(app_idendpoint_idendpoint_headers_patch_in)

Patch Endpoint Headers

Partially set the additional headers to be sent with the webhook

### Example

* Bearer Authentication (HTTPBearer):
```python
import apitest
from apitest.apis.tags import endpoint_api
from apitest.model.endpoint_headers_patch_in import EndpointHeadersPatchIn
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
    api_instance = endpoint_api.EndpointApi(api_client)

    # example passing only required values which don't have defaults set
    path_params = {
        'app_id': "app_1srOrx2ZWZBpBUvZwXKQmoEYga2",
        'endpoint_id': "ep_1srOrx2ZWZBpBUvZwXKQmoEYga2",
    }
    header_params = {
    }
    body = EndpointHeadersPatchIn(
        headers=dict(
            "key": "key_example",
        ),
    )
    try:
        # Patch Endpoint Headers
        api_response = api_instance.patch_endpoint_headers_api_v1_app_app_id_endpoint_endpoint_id_headers_patch(
            path_params=path_params,
            header_params=header_params,
            body=body,
        )
    except apitest.ApiException as e:
        print("Exception when calling EndpointApi->patch_endpoint_headers_api_v1_app_app_id_endpoint_endpoint_id_headers_patch: %s\n" % e)

    # example passing only optional values
    path_params = {
        'app_id': "app_1srOrx2ZWZBpBUvZwXKQmoEYga2",
        'endpoint_id': "ep_1srOrx2ZWZBpBUvZwXKQmoEYga2",
    }
    header_params = {
        'idempotency-key': "idempotency-key_example",
    }
    body = EndpointHeadersPatchIn(
        headers=dict(
            "key": "key_example",
        ),
    )
    try:
        # Patch Endpoint Headers
        api_response = api_instance.patch_endpoint_headers_api_v1_app_app_id_endpoint_endpoint_id_headers_patch(
            path_params=path_params,
            header_params=header_params,
            body=body,
        )
    except apitest.ApiException as e:
        print("Exception when calling EndpointApi->patch_endpoint_headers_api_v1_app_app_id_endpoint_endpoint_id_headers_patch: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
body | typing.Union[SchemaForRequestBodyApplicationJson] | required |
header_params | RequestHeaderParams | |
path_params | RequestPathParams | |
content_type | str | optional, default is 'application/json' | Selects the schema and serialization of the request body
accept_content_types | typing.Tuple[str] | default is ('application/json', ) | Tells the server the content type(s) that are accepted by the client
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### body

# SchemaForRequestBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**EndpointHeadersPatchIn**](../../models/EndpointHeadersPatchIn.md) |  | 


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
endpoint_id | EndpointIdSchema | | 

# AppIdSchema

The application's ID or UID

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  | The application&#x27;s ID or UID | 

# EndpointIdSchema

The endpoint's ID or UID

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  | The endpoint&#x27;s ID or UID | 

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
204 | [ApiResponseFor204](#patch_endpoint_headers_api_v1_app_app_id_endpoint_endpoint_id_headers_patch.ApiResponseFor204) | Successful Response
401 | [ApiResponseFor401](#patch_endpoint_headers_api_v1_app_app_id_endpoint_endpoint_id_headers_patch.ApiResponseFor401) | Unauthorized
403 | [ApiResponseFor403](#patch_endpoint_headers_api_v1_app_app_id_endpoint_endpoint_id_headers_patch.ApiResponseFor403) | Forbidden
404 | [ApiResponseFor404](#patch_endpoint_headers_api_v1_app_app_id_endpoint_endpoint_id_headers_patch.ApiResponseFor404) | Not Found
409 | [ApiResponseFor409](#patch_endpoint_headers_api_v1_app_app_id_endpoint_endpoint_id_headers_patch.ApiResponseFor409) | Conflict
422 | [ApiResponseFor422](#patch_endpoint_headers_api_v1_app_app_id_endpoint_endpoint_id_headers_patch.ApiResponseFor422) | Validation Error
429 | [ApiResponseFor429](#patch_endpoint_headers_api_v1_app_app_id_endpoint_endpoint_id_headers_patch.ApiResponseFor429) | Too Many Requests

#### patch_endpoint_headers_api_v1_app_app_id_endpoint_endpoint_id_headers_patch.ApiResponseFor204
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | Unset | body was not defined |
headers | Unset | headers were not defined |

#### patch_endpoint_headers_api_v1_app_app_id_endpoint_endpoint_id_headers_patch.ApiResponseFor401
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor401ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor401ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### patch_endpoint_headers_api_v1_app_app_id_endpoint_endpoint_id_headers_patch.ApiResponseFor403
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor403ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor403ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### patch_endpoint_headers_api_v1_app_app_id_endpoint_endpoint_id_headers_patch.ApiResponseFor404
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor404ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor404ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### patch_endpoint_headers_api_v1_app_app_id_endpoint_endpoint_id_headers_patch.ApiResponseFor409
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor409ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor409ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### patch_endpoint_headers_api_v1_app_app_id_endpoint_endpoint_id_headers_patch.ApiResponseFor422
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor422ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor422ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HTTPValidationError**](../../models/HTTPValidationError.md) |  | 


#### patch_endpoint_headers_api_v1_app_app_id_endpoint_endpoint_id_headers_patch.ApiResponseFor429
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

# **recover_failed_webhooks_api_v1_app_app_id_endpoint_endpoint_id_recover_post**
<a name="recover_failed_webhooks_api_v1_app_app_id_endpoint_endpoint_id_recover_post"></a>
> {str: (bool, date, datetime, dict, float, int, list, str, none_type)} recover_failed_webhooks_api_v1_app_app_id_endpoint_endpoint_id_recover_post(app_idendpoint_idrecover_in)

Recover Failed Webhooks

Resend all failed messages since a given time.

### Example

* Bearer Authentication (HTTPBearer):
```python
import apitest
from apitest.apis.tags import endpoint_api
from apitest.model.recover_in import RecoverIn
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
    api_instance = endpoint_api.EndpointApi(api_client)

    # example passing only required values which don't have defaults set
    path_params = {
        'app_id': "app_1srOrx2ZWZBpBUvZwXKQmoEYga2",
        'endpoint_id': "ep_1srOrx2ZWZBpBUvZwXKQmoEYga2",
    }
    header_params = {
    }
    body = RecoverIn(
        since="1970-01-01T00:00:00.00Z",
        until="1970-01-01T00:00:00.00Z",
    )
    try:
        # Recover Failed Webhooks
        api_response = api_instance.recover_failed_webhooks_api_v1_app_app_id_endpoint_endpoint_id_recover_post(
            path_params=path_params,
            header_params=header_params,
            body=body,
        )
        pprint(api_response)
    except apitest.ApiException as e:
        print("Exception when calling EndpointApi->recover_failed_webhooks_api_v1_app_app_id_endpoint_endpoint_id_recover_post: %s\n" % e)

    # example passing only optional values
    path_params = {
        'app_id': "app_1srOrx2ZWZBpBUvZwXKQmoEYga2",
        'endpoint_id': "ep_1srOrx2ZWZBpBUvZwXKQmoEYga2",
    }
    header_params = {
        'idempotency-key': "idempotency-key_example",
    }
    body = RecoverIn(
        since="1970-01-01T00:00:00.00Z",
        until="1970-01-01T00:00:00.00Z",
    )
    try:
        # Recover Failed Webhooks
        api_response = api_instance.recover_failed_webhooks_api_v1_app_app_id_endpoint_endpoint_id_recover_post(
            path_params=path_params,
            header_params=header_params,
            body=body,
        )
        pprint(api_response)
    except apitest.ApiException as e:
        print("Exception when calling EndpointApi->recover_failed_webhooks_api_v1_app_app_id_endpoint_endpoint_id_recover_post: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
body | typing.Union[SchemaForRequestBodyApplicationJson] | required |
header_params | RequestHeaderParams | |
path_params | RequestPathParams | |
content_type | str | optional, default is 'application/json' | Selects the schema and serialization of the request body
accept_content_types | typing.Tuple[str] | default is ('application/json', ) | Tells the server the content type(s) that are accepted by the client
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### body

# SchemaForRequestBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**RecoverIn**](../../models/RecoverIn.md) |  | 


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
endpoint_id | EndpointIdSchema | | 

# AppIdSchema

The application's ID or UID

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  | The application&#x27;s ID or UID | 

# EndpointIdSchema

The endpoint's ID or UID

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  | The endpoint&#x27;s ID or UID | 

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
202 | [ApiResponseFor202](#recover_failed_webhooks_api_v1_app_app_id_endpoint_endpoint_id_recover_post.ApiResponseFor202) | Successful Response
401 | [ApiResponseFor401](#recover_failed_webhooks_api_v1_app_app_id_endpoint_endpoint_id_recover_post.ApiResponseFor401) | Unauthorized
403 | [ApiResponseFor403](#recover_failed_webhooks_api_v1_app_app_id_endpoint_endpoint_id_recover_post.ApiResponseFor403) | Forbidden
404 | [ApiResponseFor404](#recover_failed_webhooks_api_v1_app_app_id_endpoint_endpoint_id_recover_post.ApiResponseFor404) | Not Found
409 | [ApiResponseFor409](#recover_failed_webhooks_api_v1_app_app_id_endpoint_endpoint_id_recover_post.ApiResponseFor409) | Conflict
422 | [ApiResponseFor422](#recover_failed_webhooks_api_v1_app_app_id_endpoint_endpoint_id_recover_post.ApiResponseFor422) | Validation Error
429 | [ApiResponseFor429](#recover_failed_webhooks_api_v1_app_app_id_endpoint_endpoint_id_recover_post.ApiResponseFor429) | Too Many Requests

#### recover_failed_webhooks_api_v1_app_app_id_endpoint_endpoint_id_recover_post.ApiResponseFor202
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor202ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor202ResponseBodyApplicationJson

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

#### recover_failed_webhooks_api_v1_app_app_id_endpoint_endpoint_id_recover_post.ApiResponseFor401
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor401ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor401ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### recover_failed_webhooks_api_v1_app_app_id_endpoint_endpoint_id_recover_post.ApiResponseFor403
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor403ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor403ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### recover_failed_webhooks_api_v1_app_app_id_endpoint_endpoint_id_recover_post.ApiResponseFor404
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor404ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor404ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### recover_failed_webhooks_api_v1_app_app_id_endpoint_endpoint_id_recover_post.ApiResponseFor409
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor409ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor409ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### recover_failed_webhooks_api_v1_app_app_id_endpoint_endpoint_id_recover_post.ApiResponseFor422
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor422ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor422ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HTTPValidationError**](../../models/HTTPValidationError.md) |  | 


#### recover_failed_webhooks_api_v1_app_app_id_endpoint_endpoint_id_recover_post.ApiResponseFor429
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

# **replay_missing_webhooks_api_v1_app_app_id_endpoint_endpoint_id_replay_missing_post**
<a name="replay_missing_webhooks_api_v1_app_app_id_endpoint_endpoint_id_replay_missing_post"></a>
> {str: (bool, date, datetime, dict, float, int, list, str, none_type)} replay_missing_webhooks_api_v1_app_app_id_endpoint_endpoint_id_replay_missing_post(app_idendpoint_idreplay_in)

Replay Missing Webhooks

Replays messages to the endpoint. Only messages that were created after `since` will be sent. Messages that were previously sent to the endpoint are not resent.

### Example

* Bearer Authentication (HTTPBearer):
```python
import apitest
from apitest.apis.tags import endpoint_api
from apitest.model.replay_in import ReplayIn
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
    api_instance = endpoint_api.EndpointApi(api_client)

    # example passing only required values which don't have defaults set
    path_params = {
        'app_id': "app_1srOrx2ZWZBpBUvZwXKQmoEYga2",
        'endpoint_id': "ep_1srOrx2ZWZBpBUvZwXKQmoEYga2",
    }
    header_params = {
    }
    body = ReplayIn(
        since="1970-01-01T00:00:00.00Z",
        until="1970-01-01T00:00:00.00Z",
    )
    try:
        # Replay Missing Webhooks
        api_response = api_instance.replay_missing_webhooks_api_v1_app_app_id_endpoint_endpoint_id_replay_missing_post(
            path_params=path_params,
            header_params=header_params,
            body=body,
        )
        pprint(api_response)
    except apitest.ApiException as e:
        print("Exception when calling EndpointApi->replay_missing_webhooks_api_v1_app_app_id_endpoint_endpoint_id_replay_missing_post: %s\n" % e)

    # example passing only optional values
    path_params = {
        'app_id': "app_1srOrx2ZWZBpBUvZwXKQmoEYga2",
        'endpoint_id': "ep_1srOrx2ZWZBpBUvZwXKQmoEYga2",
    }
    header_params = {
        'idempotency-key': "idempotency-key_example",
    }
    body = ReplayIn(
        since="1970-01-01T00:00:00.00Z",
        until="1970-01-01T00:00:00.00Z",
    )
    try:
        # Replay Missing Webhooks
        api_response = api_instance.replay_missing_webhooks_api_v1_app_app_id_endpoint_endpoint_id_replay_missing_post(
            path_params=path_params,
            header_params=header_params,
            body=body,
        )
        pprint(api_response)
    except apitest.ApiException as e:
        print("Exception when calling EndpointApi->replay_missing_webhooks_api_v1_app_app_id_endpoint_endpoint_id_replay_missing_post: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
body | typing.Union[SchemaForRequestBodyApplicationJson] | required |
header_params | RequestHeaderParams | |
path_params | RequestPathParams | |
content_type | str | optional, default is 'application/json' | Selects the schema and serialization of the request body
accept_content_types | typing.Tuple[str] | default is ('application/json', ) | Tells the server the content type(s) that are accepted by the client
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### body

# SchemaForRequestBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**ReplayIn**](../../models/ReplayIn.md) |  | 


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
endpoint_id | EndpointIdSchema | | 

# AppIdSchema

The application's ID or UID

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  | The application&#x27;s ID or UID | 

# EndpointIdSchema

The endpoint's ID or UID

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  | The endpoint&#x27;s ID or UID | 

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
202 | [ApiResponseFor202](#replay_missing_webhooks_api_v1_app_app_id_endpoint_endpoint_id_replay_missing_post.ApiResponseFor202) | Successful Response
401 | [ApiResponseFor401](#replay_missing_webhooks_api_v1_app_app_id_endpoint_endpoint_id_replay_missing_post.ApiResponseFor401) | Unauthorized
403 | [ApiResponseFor403](#replay_missing_webhooks_api_v1_app_app_id_endpoint_endpoint_id_replay_missing_post.ApiResponseFor403) | Forbidden
404 | [ApiResponseFor404](#replay_missing_webhooks_api_v1_app_app_id_endpoint_endpoint_id_replay_missing_post.ApiResponseFor404) | Not Found
409 | [ApiResponseFor409](#replay_missing_webhooks_api_v1_app_app_id_endpoint_endpoint_id_replay_missing_post.ApiResponseFor409) | Conflict
422 | [ApiResponseFor422](#replay_missing_webhooks_api_v1_app_app_id_endpoint_endpoint_id_replay_missing_post.ApiResponseFor422) | Validation Error
429 | [ApiResponseFor429](#replay_missing_webhooks_api_v1_app_app_id_endpoint_endpoint_id_replay_missing_post.ApiResponseFor429) | Too Many Requests

#### replay_missing_webhooks_api_v1_app_app_id_endpoint_endpoint_id_replay_missing_post.ApiResponseFor202
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor202ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor202ResponseBodyApplicationJson

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

#### replay_missing_webhooks_api_v1_app_app_id_endpoint_endpoint_id_replay_missing_post.ApiResponseFor401
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor401ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor401ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### replay_missing_webhooks_api_v1_app_app_id_endpoint_endpoint_id_replay_missing_post.ApiResponseFor403
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor403ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor403ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### replay_missing_webhooks_api_v1_app_app_id_endpoint_endpoint_id_replay_missing_post.ApiResponseFor404
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor404ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor404ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### replay_missing_webhooks_api_v1_app_app_id_endpoint_endpoint_id_replay_missing_post.ApiResponseFor409
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor409ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor409ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### replay_missing_webhooks_api_v1_app_app_id_endpoint_endpoint_id_replay_missing_post.ApiResponseFor422
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor422ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor422ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HTTPValidationError**](../../models/HTTPValidationError.md) |  | 


#### replay_missing_webhooks_api_v1_app_app_id_endpoint_endpoint_id_replay_missing_post.ApiResponseFor429
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

# **rotate_endpoint_secret_api_v1_app_app_id_endpoint_endpoint_id_secret_rotate_post**
<a name="rotate_endpoint_secret_api_v1_app_app_id_endpoint_endpoint_id_secret_rotate_post"></a>
> rotate_endpoint_secret_api_v1_app_app_id_endpoint_endpoint_id_secret_rotate_post(endpoint_idapp_idendpoint_secret_rotate_in)

Rotate Endpoint Secret

Rotates the endpoint's signing secret.  The previous secret will be valid for the next 24 hours.

### Example

* Bearer Authentication (HTTPBearer):
```python
import apitest
from apitest.apis.tags import endpoint_api
from apitest.model.endpoint_secret_rotate_in import EndpointSecretRotateIn
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
    api_instance = endpoint_api.EndpointApi(api_client)

    # example passing only required values which don't have defaults set
    path_params = {
        'endpoint_id': "ep_1srOrx2ZWZBpBUvZwXKQmoEYga2",
        'app_id': "app_1srOrx2ZWZBpBUvZwXKQmoEYga2",
    }
    header_params = {
    }
    body = EndpointSecretRotateIn(
        key="whsec_C2FVsBQIhrscChlQIMV+b5sSYspob7oD",
    )
    try:
        # Rotate Endpoint Secret
        api_response = api_instance.rotate_endpoint_secret_api_v1_app_app_id_endpoint_endpoint_id_secret_rotate_post(
            path_params=path_params,
            header_params=header_params,
            body=body,
        )
    except apitest.ApiException as e:
        print("Exception when calling EndpointApi->rotate_endpoint_secret_api_v1_app_app_id_endpoint_endpoint_id_secret_rotate_post: %s\n" % e)

    # example passing only optional values
    path_params = {
        'endpoint_id': "ep_1srOrx2ZWZBpBUvZwXKQmoEYga2",
        'app_id': "app_1srOrx2ZWZBpBUvZwXKQmoEYga2",
    }
    header_params = {
        'idempotency-key': "idempotency-key_example",
    }
    body = EndpointSecretRotateIn(
        key="whsec_C2FVsBQIhrscChlQIMV+b5sSYspob7oD",
    )
    try:
        # Rotate Endpoint Secret
        api_response = api_instance.rotate_endpoint_secret_api_v1_app_app_id_endpoint_endpoint_id_secret_rotate_post(
            path_params=path_params,
            header_params=header_params,
            body=body,
        )
    except apitest.ApiException as e:
        print("Exception when calling EndpointApi->rotate_endpoint_secret_api_v1_app_app_id_endpoint_endpoint_id_secret_rotate_post: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
body | typing.Union[SchemaForRequestBodyApplicationJson] | required |
header_params | RequestHeaderParams | |
path_params | RequestPathParams | |
content_type | str | optional, default is 'application/json' | Selects the schema and serialization of the request body
accept_content_types | typing.Tuple[str] | default is ('application/json', ) | Tells the server the content type(s) that are accepted by the client
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### body

# SchemaForRequestBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**EndpointSecretRotateIn**](../../models/EndpointSecretRotateIn.md) |  | 


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
endpoint_id | EndpointIdSchema | | 
app_id | AppIdSchema | | 

# EndpointIdSchema

The endpoint's ID or UID

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  | The endpoint&#x27;s ID or UID | 

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
204 | [ApiResponseFor204](#rotate_endpoint_secret_api_v1_app_app_id_endpoint_endpoint_id_secret_rotate_post.ApiResponseFor204) | Successful Response
400 | [ApiResponseFor400](#rotate_endpoint_secret_api_v1_app_app_id_endpoint_endpoint_id_secret_rotate_post.ApiResponseFor400) | Bad Request
401 | [ApiResponseFor401](#rotate_endpoint_secret_api_v1_app_app_id_endpoint_endpoint_id_secret_rotate_post.ApiResponseFor401) | Unauthorized
403 | [ApiResponseFor403](#rotate_endpoint_secret_api_v1_app_app_id_endpoint_endpoint_id_secret_rotate_post.ApiResponseFor403) | Forbidden
404 | [ApiResponseFor404](#rotate_endpoint_secret_api_v1_app_app_id_endpoint_endpoint_id_secret_rotate_post.ApiResponseFor404) | Not Found
409 | [ApiResponseFor409](#rotate_endpoint_secret_api_v1_app_app_id_endpoint_endpoint_id_secret_rotate_post.ApiResponseFor409) | Conflict
422 | [ApiResponseFor422](#rotate_endpoint_secret_api_v1_app_app_id_endpoint_endpoint_id_secret_rotate_post.ApiResponseFor422) | Validation Error
429 | [ApiResponseFor429](#rotate_endpoint_secret_api_v1_app_app_id_endpoint_endpoint_id_secret_rotate_post.ApiResponseFor429) | Too Many Requests

#### rotate_endpoint_secret_api_v1_app_app_id_endpoint_endpoint_id_secret_rotate_post.ApiResponseFor204
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | Unset | body was not defined |
headers | Unset | headers were not defined |

#### rotate_endpoint_secret_api_v1_app_app_id_endpoint_endpoint_id_secret_rotate_post.ApiResponseFor400
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor400ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor400ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### rotate_endpoint_secret_api_v1_app_app_id_endpoint_endpoint_id_secret_rotate_post.ApiResponseFor401
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor401ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor401ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### rotate_endpoint_secret_api_v1_app_app_id_endpoint_endpoint_id_secret_rotate_post.ApiResponseFor403
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor403ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor403ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### rotate_endpoint_secret_api_v1_app_app_id_endpoint_endpoint_id_secret_rotate_post.ApiResponseFor404
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor404ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor404ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### rotate_endpoint_secret_api_v1_app_app_id_endpoint_endpoint_id_secret_rotate_post.ApiResponseFor409
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor409ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor409ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### rotate_endpoint_secret_api_v1_app_app_id_endpoint_endpoint_id_secret_rotate_post.ApiResponseFor422
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor422ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor422ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HTTPValidationError**](../../models/HTTPValidationError.md) |  | 


#### rotate_endpoint_secret_api_v1_app_app_id_endpoint_endpoint_id_secret_rotate_post.ApiResponseFor429
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

# **update_endpoint_api_v1_app_app_id_endpoint_endpoint_id_put**
<a name="update_endpoint_api_v1_app_app_id_endpoint_endpoint_id_put"></a>
> EndpointOut update_endpoint_api_v1_app_app_id_endpoint_endpoint_id_put(endpoint_idapp_idendpoint_update)

Update Endpoint

Update an endpoint.

### Example

* Bearer Authentication (HTTPBearer):
```python
import apitest
from apitest.apis.tags import endpoint_api
from apitest.model.endpoint_out import EndpointOut
from apitest.model.endpoint_update import EndpointUpdate
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
    api_instance = endpoint_api.EndpointApi(api_client)

    # example passing only required values which don't have defaults set
    path_params = {
        'endpoint_id': "ep_1srOrx2ZWZBpBUvZwXKQmoEYga2",
        'app_id': "app_1srOrx2ZWZBpBUvZwXKQmoEYga2",
    }
    header_params = {
    }
    body = EndpointUpdate(
        uid="unique-endpoint-identifier",
        url="https://example.com/webhook/",
        version=1,
        description="An example endpoint name",
        filter_types=["user.signup","user.deleted"],
        channels=["project_123","group_2"],
        disabled=False,
        rate_limit=1000,
        metadata=dict(
            "key": "key_example",
        ),
    )
    try:
        # Update Endpoint
        api_response = api_instance.update_endpoint_api_v1_app_app_id_endpoint_endpoint_id_put(
            path_params=path_params,
            header_params=header_params,
            body=body,
        )
        pprint(api_response)
    except apitest.ApiException as e:
        print("Exception when calling EndpointApi->update_endpoint_api_v1_app_app_id_endpoint_endpoint_id_put: %s\n" % e)

    # example passing only optional values
    path_params = {
        'endpoint_id': "ep_1srOrx2ZWZBpBUvZwXKQmoEYga2",
        'app_id': "app_1srOrx2ZWZBpBUvZwXKQmoEYga2",
    }
    header_params = {
        'idempotency-key': "idempotency-key_example",
    }
    body = EndpointUpdate(
        uid="unique-endpoint-identifier",
        url="https://example.com/webhook/",
        version=1,
        description="An example endpoint name",
        filter_types=["user.signup","user.deleted"],
        channels=["project_123","group_2"],
        disabled=False,
        rate_limit=1000,
        metadata=dict(
            "key": "key_example",
        ),
    )
    try:
        # Update Endpoint
        api_response = api_instance.update_endpoint_api_v1_app_app_id_endpoint_endpoint_id_put(
            path_params=path_params,
            header_params=header_params,
            body=body,
        )
        pprint(api_response)
    except apitest.ApiException as e:
        print("Exception when calling EndpointApi->update_endpoint_api_v1_app_app_id_endpoint_endpoint_id_put: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
body | typing.Union[SchemaForRequestBodyApplicationJson] | required |
header_params | RequestHeaderParams | |
path_params | RequestPathParams | |
content_type | str | optional, default is 'application/json' | Selects the schema and serialization of the request body
accept_content_types | typing.Tuple[str] | default is ('application/json', ) | Tells the server the content type(s) that are accepted by the client
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### body

# SchemaForRequestBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**EndpointUpdate**](../../models/EndpointUpdate.md) |  | 


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
endpoint_id | EndpointIdSchema | | 
app_id | AppIdSchema | | 

# EndpointIdSchema

The endpoint's ID or UID

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  | The endpoint&#x27;s ID or UID | 

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
200 | [ApiResponseFor200](#update_endpoint_api_v1_app_app_id_endpoint_endpoint_id_put.ApiResponseFor200) | Successful Response
201 | [ApiResponseFor201](#update_endpoint_api_v1_app_app_id_endpoint_endpoint_id_put.ApiResponseFor201) | Created
401 | [ApiResponseFor401](#update_endpoint_api_v1_app_app_id_endpoint_endpoint_id_put.ApiResponseFor401) | Unauthorized
403 | [ApiResponseFor403](#update_endpoint_api_v1_app_app_id_endpoint_endpoint_id_put.ApiResponseFor403) | Forbidden
404 | [ApiResponseFor404](#update_endpoint_api_v1_app_app_id_endpoint_endpoint_id_put.ApiResponseFor404) | Not Found
409 | [ApiResponseFor409](#update_endpoint_api_v1_app_app_id_endpoint_endpoint_id_put.ApiResponseFor409) | Conflict
422 | [ApiResponseFor422](#update_endpoint_api_v1_app_app_id_endpoint_endpoint_id_put.ApiResponseFor422) | Validation Error
429 | [ApiResponseFor429](#update_endpoint_api_v1_app_app_id_endpoint_endpoint_id_put.ApiResponseFor429) | Too Many Requests

#### update_endpoint_api_v1_app_app_id_endpoint_endpoint_id_put.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**EndpointOut**](../../models/EndpointOut.md) |  | 


#### update_endpoint_api_v1_app_app_id_endpoint_endpoint_id_put.ApiResponseFor201
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor201ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor201ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**EndpointOut**](../../models/EndpointOut.md) |  | 


#### update_endpoint_api_v1_app_app_id_endpoint_endpoint_id_put.ApiResponseFor401
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor401ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor401ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### update_endpoint_api_v1_app_app_id_endpoint_endpoint_id_put.ApiResponseFor403
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor403ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor403ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### update_endpoint_api_v1_app_app_id_endpoint_endpoint_id_put.ApiResponseFor404
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor404ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor404ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### update_endpoint_api_v1_app_app_id_endpoint_endpoint_id_put.ApiResponseFor409
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor409ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor409ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### update_endpoint_api_v1_app_app_id_endpoint_endpoint_id_put.ApiResponseFor422
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor422ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor422ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HTTPValidationError**](../../models/HTTPValidationError.md) |  | 


#### update_endpoint_api_v1_app_app_id_endpoint_endpoint_id_put.ApiResponseFor429
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

# **update_endpoint_headers_api_v1_app_app_id_endpoint_endpoint_id_headers_put**
<a name="update_endpoint_headers_api_v1_app_app_id_endpoint_endpoint_id_headers_put"></a>
> update_endpoint_headers_api_v1_app_app_id_endpoint_endpoint_id_headers_put(app_idendpoint_idendpoint_headers_in)

Update Endpoint Headers

Set the additional headers to be sent with the webhook

### Example

* Bearer Authentication (HTTPBearer):
```python
import apitest
from apitest.apis.tags import endpoint_api
from apitest.model.endpoint_headers_in import EndpointHeadersIn
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
    api_instance = endpoint_api.EndpointApi(api_client)

    # example passing only required values which don't have defaults set
    path_params = {
        'app_id': "app_1srOrx2ZWZBpBUvZwXKQmoEYga2",
        'endpoint_id': "ep_1srOrx2ZWZBpBUvZwXKQmoEYga2",
    }
    header_params = {
    }
    body = EndpointHeadersIn(
        headers=dict(
            "key": "key_example",
        ),
    )
    try:
        # Update Endpoint Headers
        api_response = api_instance.update_endpoint_headers_api_v1_app_app_id_endpoint_endpoint_id_headers_put(
            path_params=path_params,
            header_params=header_params,
            body=body,
        )
    except apitest.ApiException as e:
        print("Exception when calling EndpointApi->update_endpoint_headers_api_v1_app_app_id_endpoint_endpoint_id_headers_put: %s\n" % e)

    # example passing only optional values
    path_params = {
        'app_id': "app_1srOrx2ZWZBpBUvZwXKQmoEYga2",
        'endpoint_id': "ep_1srOrx2ZWZBpBUvZwXKQmoEYga2",
    }
    header_params = {
        'idempotency-key': "idempotency-key_example",
    }
    body = EndpointHeadersIn(
        headers=dict(
            "key": "key_example",
        ),
    )
    try:
        # Update Endpoint Headers
        api_response = api_instance.update_endpoint_headers_api_v1_app_app_id_endpoint_endpoint_id_headers_put(
            path_params=path_params,
            header_params=header_params,
            body=body,
        )
    except apitest.ApiException as e:
        print("Exception when calling EndpointApi->update_endpoint_headers_api_v1_app_app_id_endpoint_endpoint_id_headers_put: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
body | typing.Union[SchemaForRequestBodyApplicationJson] | required |
header_params | RequestHeaderParams | |
path_params | RequestPathParams | |
content_type | str | optional, default is 'application/json' | Selects the schema and serialization of the request body
accept_content_types | typing.Tuple[str] | default is ('application/json', ) | Tells the server the content type(s) that are accepted by the client
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### body

# SchemaForRequestBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**EndpointHeadersIn**](../../models/EndpointHeadersIn.md) |  | 


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
endpoint_id | EndpointIdSchema | | 

# AppIdSchema

The application's ID or UID

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  | The application&#x27;s ID or UID | 

# EndpointIdSchema

The endpoint's ID or UID

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  | The endpoint&#x27;s ID or UID | 

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
204 | [ApiResponseFor204](#update_endpoint_headers_api_v1_app_app_id_endpoint_endpoint_id_headers_put.ApiResponseFor204) | Successful Response
401 | [ApiResponseFor401](#update_endpoint_headers_api_v1_app_app_id_endpoint_endpoint_id_headers_put.ApiResponseFor401) | Unauthorized
403 | [ApiResponseFor403](#update_endpoint_headers_api_v1_app_app_id_endpoint_endpoint_id_headers_put.ApiResponseFor403) | Forbidden
404 | [ApiResponseFor404](#update_endpoint_headers_api_v1_app_app_id_endpoint_endpoint_id_headers_put.ApiResponseFor404) | Not Found
409 | [ApiResponseFor409](#update_endpoint_headers_api_v1_app_app_id_endpoint_endpoint_id_headers_put.ApiResponseFor409) | Conflict
422 | [ApiResponseFor422](#update_endpoint_headers_api_v1_app_app_id_endpoint_endpoint_id_headers_put.ApiResponseFor422) | Validation Error
429 | [ApiResponseFor429](#update_endpoint_headers_api_v1_app_app_id_endpoint_endpoint_id_headers_put.ApiResponseFor429) | Too Many Requests

#### update_endpoint_headers_api_v1_app_app_id_endpoint_endpoint_id_headers_put.ApiResponseFor204
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | Unset | body was not defined |
headers | Unset | headers were not defined |

#### update_endpoint_headers_api_v1_app_app_id_endpoint_endpoint_id_headers_put.ApiResponseFor401
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor401ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor401ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### update_endpoint_headers_api_v1_app_app_id_endpoint_endpoint_id_headers_put.ApiResponseFor403
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor403ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor403ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### update_endpoint_headers_api_v1_app_app_id_endpoint_endpoint_id_headers_put.ApiResponseFor404
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor404ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor404ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### update_endpoint_headers_api_v1_app_app_id_endpoint_endpoint_id_headers_put.ApiResponseFor409
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor409ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor409ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### update_endpoint_headers_api_v1_app_app_id_endpoint_endpoint_id_headers_put.ApiResponseFor422
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor422ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor422ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HTTPValidationError**](../../models/HTTPValidationError.md) |  | 


#### update_endpoint_headers_api_v1_app_app_id_endpoint_endpoint_id_headers_put.ApiResponseFor429
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

