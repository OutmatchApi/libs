<a name="__pageTop"></a>
# svix.apis.tags.integration_api.IntegrationApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_integration_api_v1_app_app_id_integration_post**](#create_integration_api_v1_app_app_id_integration_post) | **post** /api/v1/app/{app_id}/integration/ | Create Integration
[**delete_integration_api_v1_app_app_id_integration_integ_id_delete**](#delete_integration_api_v1_app_app_id_integration_integ_id_delete) | **delete** /api/v1/app/{app_id}/integration/{integ_id}/ | Delete Integration
[**get_integration_api_v1_app_app_id_integration_integ_id_get**](#get_integration_api_v1_app_app_id_integration_integ_id_get) | **get** /api/v1/app/{app_id}/integration/{integ_id}/ | Get Integration
[**get_integration_key_api_v1_app_app_id_integration_integ_id_key_get**](#get_integration_key_api_v1_app_app_id_integration_integ_id_key_get) | **get** /api/v1/app/{app_id}/integration/{integ_id}/key/ | Get Integration Key
[**list_integrations_api_v1_app_app_id_integration_get**](#list_integrations_api_v1_app_app_id_integration_get) | **get** /api/v1/app/{app_id}/integration/ | List Integrations
[**rotate_integration_key_api_v1_app_app_id_integration_integ_id_key_rotate_post**](#rotate_integration_key_api_v1_app_app_id_integration_integ_id_key_rotate_post) | **post** /api/v1/app/{app_id}/integration/{integ_id}/key/rotate/ | Rotate Integration Key
[**update_integration_api_v1_app_app_id_integration_integ_id_put**](#update_integration_api_v1_app_app_id_integration_integ_id_put) | **put** /api/v1/app/{app_id}/integration/{integ_id}/ | Update Integration

# **create_integration_api_v1_app_app_id_integration_post**
<a name="create_integration_api_v1_app_app_id_integration_post"></a>
> IntegrationOut create_integration_api_v1_app_app_id_integration_post(app_idintegration_in)

Create Integration

Create an integration.

### Example

* Bearer Authentication (HTTPBearer):
```python
import svix
from svix.apis.tags import integration_api
from svix.model.integration_in import IntegrationIn
from svix.model.http_validation_error import HTTPValidationError
from svix.model.integration_out import IntegrationOut
from svix.model.http_error_out import HttpErrorOut
from pprint import pprint
# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = svix.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure Bearer authorization: HTTPBearer
configuration = svix.Configuration(
    access_token = 'YOUR_BEARER_TOKEN'
)
# Enter a context with an instance of the API client
with svix.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = integration_api.IntegrationApi(api_client)

    # example passing only required values which don't have defaults set
    path_params = {
        'app_id': "app_1srOrx2ZWZBpBUvZwXKQmoEYga2",
    }
    header_params = {
    }
    body = IntegrationIn(
        name="Example Integration",
    )
    try:
        # Create Integration
        api_response = api_instance.create_integration_api_v1_app_app_id_integration_post(
            path_params=path_params,
            header_params=header_params,
            body=body,
        )
        pprint(api_response)
    except svix.ApiException as e:
        print("Exception when calling IntegrationApi->create_integration_api_v1_app_app_id_integration_post: %s\n" % e)

    # example passing only optional values
    path_params = {
        'app_id': "app_1srOrx2ZWZBpBUvZwXKQmoEYga2",
    }
    header_params = {
        'idempotency-key': "idempotency-key_example",
    }
    body = IntegrationIn(
        name="Example Integration",
    )
    try:
        # Create Integration
        api_response = api_instance.create_integration_api_v1_app_app_id_integration_post(
            path_params=path_params,
            header_params=header_params,
            body=body,
        )
        pprint(api_response)
    except svix.ApiException as e:
        print("Exception when calling IntegrationApi->create_integration_api_v1_app_app_id_integration_post: %s\n" % e)
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
[**IntegrationIn**](../../models/IntegrationIn.md) |  | 


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
201 | [ApiResponseFor201](#create_integration_api_v1_app_app_id_integration_post.ApiResponseFor201) | Successful Response
401 | [ApiResponseFor401](#create_integration_api_v1_app_app_id_integration_post.ApiResponseFor401) | Unauthorized
403 | [ApiResponseFor403](#create_integration_api_v1_app_app_id_integration_post.ApiResponseFor403) | Forbidden
404 | [ApiResponseFor404](#create_integration_api_v1_app_app_id_integration_post.ApiResponseFor404) | Not Found
409 | [ApiResponseFor409](#create_integration_api_v1_app_app_id_integration_post.ApiResponseFor409) | Conflict
422 | [ApiResponseFor422](#create_integration_api_v1_app_app_id_integration_post.ApiResponseFor422) | Validation Error
429 | [ApiResponseFor429](#create_integration_api_v1_app_app_id_integration_post.ApiResponseFor429) | Too Many Requests

#### create_integration_api_v1_app_app_id_integration_post.ApiResponseFor201
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor201ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor201ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**IntegrationOut**](../../models/IntegrationOut.md) |  | 


#### create_integration_api_v1_app_app_id_integration_post.ApiResponseFor401
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor401ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor401ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### create_integration_api_v1_app_app_id_integration_post.ApiResponseFor403
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor403ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor403ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### create_integration_api_v1_app_app_id_integration_post.ApiResponseFor404
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor404ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor404ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### create_integration_api_v1_app_app_id_integration_post.ApiResponseFor409
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor409ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor409ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### create_integration_api_v1_app_app_id_integration_post.ApiResponseFor422
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor422ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor422ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HTTPValidationError**](../../models/HTTPValidationError.md) |  | 


#### create_integration_api_v1_app_app_id_integration_post.ApiResponseFor429
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

# **delete_integration_api_v1_app_app_id_integration_integ_id_delete**
<a name="delete_integration_api_v1_app_app_id_integration_integ_id_delete"></a>
> delete_integration_api_v1_app_app_id_integration_integ_id_delete(integ_idapp_id)

Delete Integration

Delete an integration and revoke it's key.

### Example

* Bearer Authentication (HTTPBearer):
```python
import svix
from svix.apis.tags import integration_api
from svix.model.http_validation_error import HTTPValidationError
from svix.model.http_error_out import HttpErrorOut
from pprint import pprint
# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = svix.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure Bearer authorization: HTTPBearer
configuration = svix.Configuration(
    access_token = 'YOUR_BEARER_TOKEN'
)
# Enter a context with an instance of the API client
with svix.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = integration_api.IntegrationApi(api_client)

    # example passing only required values which don't have defaults set
    path_params = {
        'integ_id': "integ_1srOrx2ZWZBpBUvZwXKQmoEYga2",
        'app_id': "app_1srOrx2ZWZBpBUvZwXKQmoEYga2",
    }
    header_params = {
    }
    try:
        # Delete Integration
        api_response = api_instance.delete_integration_api_v1_app_app_id_integration_integ_id_delete(
            path_params=path_params,
            header_params=header_params,
        )
    except svix.ApiException as e:
        print("Exception when calling IntegrationApi->delete_integration_api_v1_app_app_id_integration_integ_id_delete: %s\n" % e)

    # example passing only optional values
    path_params = {
        'integ_id': "integ_1srOrx2ZWZBpBUvZwXKQmoEYga2",
        'app_id': "app_1srOrx2ZWZBpBUvZwXKQmoEYga2",
    }
    header_params = {
        'idempotency-key': "idempotency-key_example",
    }
    try:
        # Delete Integration
        api_response = api_instance.delete_integration_api_v1_app_app_id_integration_integ_id_delete(
            path_params=path_params,
            header_params=header_params,
        )
    except svix.ApiException as e:
        print("Exception when calling IntegrationApi->delete_integration_api_v1_app_app_id_integration_integ_id_delete: %s\n" % e)
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
integ_id | IntegIdSchema | | 
app_id | AppIdSchema | | 

# IntegIdSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

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
204 | [ApiResponseFor204](#delete_integration_api_v1_app_app_id_integration_integ_id_delete.ApiResponseFor204) | Successful Response
401 | [ApiResponseFor401](#delete_integration_api_v1_app_app_id_integration_integ_id_delete.ApiResponseFor401) | Unauthorized
403 | [ApiResponseFor403](#delete_integration_api_v1_app_app_id_integration_integ_id_delete.ApiResponseFor403) | Forbidden
404 | [ApiResponseFor404](#delete_integration_api_v1_app_app_id_integration_integ_id_delete.ApiResponseFor404) | Not Found
409 | [ApiResponseFor409](#delete_integration_api_v1_app_app_id_integration_integ_id_delete.ApiResponseFor409) | Conflict
422 | [ApiResponseFor422](#delete_integration_api_v1_app_app_id_integration_integ_id_delete.ApiResponseFor422) | Validation Error
429 | [ApiResponseFor429](#delete_integration_api_v1_app_app_id_integration_integ_id_delete.ApiResponseFor429) | Too Many Requests

#### delete_integration_api_v1_app_app_id_integration_integ_id_delete.ApiResponseFor204
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | Unset | body was not defined |
headers | Unset | headers were not defined |

#### delete_integration_api_v1_app_app_id_integration_integ_id_delete.ApiResponseFor401
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor401ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor401ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### delete_integration_api_v1_app_app_id_integration_integ_id_delete.ApiResponseFor403
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor403ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor403ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### delete_integration_api_v1_app_app_id_integration_integ_id_delete.ApiResponseFor404
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor404ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor404ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### delete_integration_api_v1_app_app_id_integration_integ_id_delete.ApiResponseFor409
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor409ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor409ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### delete_integration_api_v1_app_app_id_integration_integ_id_delete.ApiResponseFor422
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor422ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor422ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HTTPValidationError**](../../models/HTTPValidationError.md) |  | 


#### delete_integration_api_v1_app_app_id_integration_integ_id_delete.ApiResponseFor429
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

# **get_integration_api_v1_app_app_id_integration_integ_id_get**
<a name="get_integration_api_v1_app_app_id_integration_integ_id_get"></a>
> IntegrationOut get_integration_api_v1_app_app_id_integration_integ_id_get(integ_idapp_id)

Get Integration

Get an integration.

### Example

* Bearer Authentication (HTTPBearer):
```python
import svix
from svix.apis.tags import integration_api
from svix.model.http_validation_error import HTTPValidationError
from svix.model.integration_out import IntegrationOut
from svix.model.http_error_out import HttpErrorOut
from pprint import pprint
# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = svix.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure Bearer authorization: HTTPBearer
configuration = svix.Configuration(
    access_token = 'YOUR_BEARER_TOKEN'
)
# Enter a context with an instance of the API client
with svix.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = integration_api.IntegrationApi(api_client)

    # example passing only required values which don't have defaults set
    path_params = {
        'integ_id': "integ_1srOrx2ZWZBpBUvZwXKQmoEYga2",
        'app_id': "app_1srOrx2ZWZBpBUvZwXKQmoEYga2",
    }
    header_params = {
    }
    try:
        # Get Integration
        api_response = api_instance.get_integration_api_v1_app_app_id_integration_integ_id_get(
            path_params=path_params,
            header_params=header_params,
        )
        pprint(api_response)
    except svix.ApiException as e:
        print("Exception when calling IntegrationApi->get_integration_api_v1_app_app_id_integration_integ_id_get: %s\n" % e)

    # example passing only optional values
    path_params = {
        'integ_id': "integ_1srOrx2ZWZBpBUvZwXKQmoEYga2",
        'app_id': "app_1srOrx2ZWZBpBUvZwXKQmoEYga2",
    }
    header_params = {
        'idempotency-key': "idempotency-key_example",
    }
    try:
        # Get Integration
        api_response = api_instance.get_integration_api_v1_app_app_id_integration_integ_id_get(
            path_params=path_params,
            header_params=header_params,
        )
        pprint(api_response)
    except svix.ApiException as e:
        print("Exception when calling IntegrationApi->get_integration_api_v1_app_app_id_integration_integ_id_get: %s\n" % e)
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
integ_id | IntegIdSchema | | 
app_id | AppIdSchema | | 

# IntegIdSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

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
200 | [ApiResponseFor200](#get_integration_api_v1_app_app_id_integration_integ_id_get.ApiResponseFor200) | Successful Response
401 | [ApiResponseFor401](#get_integration_api_v1_app_app_id_integration_integ_id_get.ApiResponseFor401) | Unauthorized
403 | [ApiResponseFor403](#get_integration_api_v1_app_app_id_integration_integ_id_get.ApiResponseFor403) | Forbidden
404 | [ApiResponseFor404](#get_integration_api_v1_app_app_id_integration_integ_id_get.ApiResponseFor404) | Not Found
409 | [ApiResponseFor409](#get_integration_api_v1_app_app_id_integration_integ_id_get.ApiResponseFor409) | Conflict
422 | [ApiResponseFor422](#get_integration_api_v1_app_app_id_integration_integ_id_get.ApiResponseFor422) | Validation Error
429 | [ApiResponseFor429](#get_integration_api_v1_app_app_id_integration_integ_id_get.ApiResponseFor429) | Too Many Requests

#### get_integration_api_v1_app_app_id_integration_integ_id_get.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**IntegrationOut**](../../models/IntegrationOut.md) |  | 


#### get_integration_api_v1_app_app_id_integration_integ_id_get.ApiResponseFor401
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor401ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor401ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### get_integration_api_v1_app_app_id_integration_integ_id_get.ApiResponseFor403
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor403ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor403ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### get_integration_api_v1_app_app_id_integration_integ_id_get.ApiResponseFor404
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor404ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor404ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### get_integration_api_v1_app_app_id_integration_integ_id_get.ApiResponseFor409
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor409ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor409ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### get_integration_api_v1_app_app_id_integration_integ_id_get.ApiResponseFor422
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor422ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor422ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HTTPValidationError**](../../models/HTTPValidationError.md) |  | 


#### get_integration_api_v1_app_app_id_integration_integ_id_get.ApiResponseFor429
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

# **get_integration_key_api_v1_app_app_id_integration_integ_id_key_get**
<a name="get_integration_key_api_v1_app_app_id_integration_integ_id_key_get"></a>
> IntegrationKeyOut get_integration_key_api_v1_app_app_id_integration_integ_id_key_get(integ_idapp_id)

Get Integration Key

Get an integration's key.

### Example

* Bearer Authentication (HTTPBearer):
```python
import svix
from svix.apis.tags import integration_api
from svix.model.integration_key_out import IntegrationKeyOut
from svix.model.http_validation_error import HTTPValidationError
from svix.model.http_error_out import HttpErrorOut
from pprint import pprint
# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = svix.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure Bearer authorization: HTTPBearer
configuration = svix.Configuration(
    access_token = 'YOUR_BEARER_TOKEN'
)
# Enter a context with an instance of the API client
with svix.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = integration_api.IntegrationApi(api_client)

    # example passing only required values which don't have defaults set
    path_params = {
        'integ_id': "integ_1srOrx2ZWZBpBUvZwXKQmoEYga2",
        'app_id': "app_1srOrx2ZWZBpBUvZwXKQmoEYga2",
    }
    header_params = {
    }
    try:
        # Get Integration Key
        api_response = api_instance.get_integration_key_api_v1_app_app_id_integration_integ_id_key_get(
            path_params=path_params,
            header_params=header_params,
        )
        pprint(api_response)
    except svix.ApiException as e:
        print("Exception when calling IntegrationApi->get_integration_key_api_v1_app_app_id_integration_integ_id_key_get: %s\n" % e)

    # example passing only optional values
    path_params = {
        'integ_id': "integ_1srOrx2ZWZBpBUvZwXKQmoEYga2",
        'app_id': "app_1srOrx2ZWZBpBUvZwXKQmoEYga2",
    }
    header_params = {
        'idempotency-key': "idempotency-key_example",
    }
    try:
        # Get Integration Key
        api_response = api_instance.get_integration_key_api_v1_app_app_id_integration_integ_id_key_get(
            path_params=path_params,
            header_params=header_params,
        )
        pprint(api_response)
    except svix.ApiException as e:
        print("Exception when calling IntegrationApi->get_integration_key_api_v1_app_app_id_integration_integ_id_key_get: %s\n" % e)
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
integ_id | IntegIdSchema | | 
app_id | AppIdSchema | | 

# IntegIdSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

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
200 | [ApiResponseFor200](#get_integration_key_api_v1_app_app_id_integration_integ_id_key_get.ApiResponseFor200) | Successful Response
401 | [ApiResponseFor401](#get_integration_key_api_v1_app_app_id_integration_integ_id_key_get.ApiResponseFor401) | Unauthorized
403 | [ApiResponseFor403](#get_integration_key_api_v1_app_app_id_integration_integ_id_key_get.ApiResponseFor403) | Forbidden
404 | [ApiResponseFor404](#get_integration_key_api_v1_app_app_id_integration_integ_id_key_get.ApiResponseFor404) | Not Found
409 | [ApiResponseFor409](#get_integration_key_api_v1_app_app_id_integration_integ_id_key_get.ApiResponseFor409) | Conflict
422 | [ApiResponseFor422](#get_integration_key_api_v1_app_app_id_integration_integ_id_key_get.ApiResponseFor422) | Validation Error
429 | [ApiResponseFor429](#get_integration_key_api_v1_app_app_id_integration_integ_id_key_get.ApiResponseFor429) | Too Many Requests

#### get_integration_key_api_v1_app_app_id_integration_integ_id_key_get.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**IntegrationKeyOut**](../../models/IntegrationKeyOut.md) |  | 


#### get_integration_key_api_v1_app_app_id_integration_integ_id_key_get.ApiResponseFor401
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor401ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor401ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### get_integration_key_api_v1_app_app_id_integration_integ_id_key_get.ApiResponseFor403
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor403ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor403ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### get_integration_key_api_v1_app_app_id_integration_integ_id_key_get.ApiResponseFor404
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor404ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor404ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### get_integration_key_api_v1_app_app_id_integration_integ_id_key_get.ApiResponseFor409
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor409ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor409ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### get_integration_key_api_v1_app_app_id_integration_integ_id_key_get.ApiResponseFor422
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor422ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor422ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HTTPValidationError**](../../models/HTTPValidationError.md) |  | 


#### get_integration_key_api_v1_app_app_id_integration_integ_id_key_get.ApiResponseFor429
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

# **list_integrations_api_v1_app_app_id_integration_get**
<a name="list_integrations_api_v1_app_app_id_integration_get"></a>
> ListResponseIntegrationOut list_integrations_api_v1_app_app_id_integration_get(app_id)

List Integrations

List the application's integrations.

### Example

* Bearer Authentication (HTTPBearer):
```python
import svix
from svix.apis.tags import integration_api
from svix.model.http_validation_error import HTTPValidationError
from svix.model.list_response_integration_out import ListResponseIntegrationOut
from svix.model.http_error_out import HttpErrorOut
from pprint import pprint
# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = svix.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure Bearer authorization: HTTPBearer
configuration = svix.Configuration(
    access_token = 'YOUR_BEARER_TOKEN'
)
# Enter a context with an instance of the API client
with svix.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = integration_api.IntegrationApi(api_client)

    # example passing only required values which don't have defaults set
    path_params = {
        'app_id': "app_1srOrx2ZWZBpBUvZwXKQmoEYga2",
    }
    query_params = {
    }
    header_params = {
    }
    try:
        # List Integrations
        api_response = api_instance.list_integrations_api_v1_app_app_id_integration_get(
            path_params=path_params,
            query_params=query_params,
            header_params=header_params,
        )
        pprint(api_response)
    except svix.ApiException as e:
        print("Exception when calling IntegrationApi->list_integrations_api_v1_app_app_id_integration_get: %s\n" % e)

    # example passing only optional values
    path_params = {
        'app_id': "app_1srOrx2ZWZBpBUvZwXKQmoEYga2",
    }
    query_params = {
        'iterator': "integ_1srOrx2ZWZBpBUvZwXKQmoEYga2",
        'limit': 50,
    }
    header_params = {
        'idempotency-key': "idempotency-key_example",
    }
    try:
        # List Integrations
        api_response = api_instance.list_integrations_api_v1_app_app_id_integration_get(
            path_params=path_params,
            query_params=query_params,
            header_params=header_params,
        )
        pprint(api_response)
    except svix.ApiException as e:
        print("Exception when calling IntegrationApi->list_integrations_api_v1_app_app_id_integration_get: %s\n" % e)
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
200 | [ApiResponseFor200](#list_integrations_api_v1_app_app_id_integration_get.ApiResponseFor200) | Successful Response
401 | [ApiResponseFor401](#list_integrations_api_v1_app_app_id_integration_get.ApiResponseFor401) | Unauthorized
403 | [ApiResponseFor403](#list_integrations_api_v1_app_app_id_integration_get.ApiResponseFor403) | Forbidden
404 | [ApiResponseFor404](#list_integrations_api_v1_app_app_id_integration_get.ApiResponseFor404) | Not Found
409 | [ApiResponseFor409](#list_integrations_api_v1_app_app_id_integration_get.ApiResponseFor409) | Conflict
422 | [ApiResponseFor422](#list_integrations_api_v1_app_app_id_integration_get.ApiResponseFor422) | Validation Error
429 | [ApiResponseFor429](#list_integrations_api_v1_app_app_id_integration_get.ApiResponseFor429) | Too Many Requests

#### list_integrations_api_v1_app_app_id_integration_get.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**ListResponseIntegrationOut**](../../models/ListResponseIntegrationOut.md) |  | 


#### list_integrations_api_v1_app_app_id_integration_get.ApiResponseFor401
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor401ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor401ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### list_integrations_api_v1_app_app_id_integration_get.ApiResponseFor403
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor403ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor403ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### list_integrations_api_v1_app_app_id_integration_get.ApiResponseFor404
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor404ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor404ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### list_integrations_api_v1_app_app_id_integration_get.ApiResponseFor409
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor409ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor409ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### list_integrations_api_v1_app_app_id_integration_get.ApiResponseFor422
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor422ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor422ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HTTPValidationError**](../../models/HTTPValidationError.md) |  | 


#### list_integrations_api_v1_app_app_id_integration_get.ApiResponseFor429
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

# **rotate_integration_key_api_v1_app_app_id_integration_integ_id_key_rotate_post**
<a name="rotate_integration_key_api_v1_app_app_id_integration_integ_id_key_rotate_post"></a>
> IntegrationKeyOut rotate_integration_key_api_v1_app_app_id_integration_integ_id_key_rotate_post(integ_idapp_id)

Rotate Integration Key

Rotate the integration's key. The previous key will be immediately revoked.

### Example

* Bearer Authentication (HTTPBearer):
```python
import svix
from svix.apis.tags import integration_api
from svix.model.integration_key_out import IntegrationKeyOut
from svix.model.http_validation_error import HTTPValidationError
from svix.model.http_error_out import HttpErrorOut
from pprint import pprint
# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = svix.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure Bearer authorization: HTTPBearer
configuration = svix.Configuration(
    access_token = 'YOUR_BEARER_TOKEN'
)
# Enter a context with an instance of the API client
with svix.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = integration_api.IntegrationApi(api_client)

    # example passing only required values which don't have defaults set
    path_params = {
        'integ_id': "integ_1srOrx2ZWZBpBUvZwXKQmoEYga2",
        'app_id': "app_1srOrx2ZWZBpBUvZwXKQmoEYga2",
    }
    header_params = {
    }
    try:
        # Rotate Integration Key
        api_response = api_instance.rotate_integration_key_api_v1_app_app_id_integration_integ_id_key_rotate_post(
            path_params=path_params,
            header_params=header_params,
        )
        pprint(api_response)
    except svix.ApiException as e:
        print("Exception when calling IntegrationApi->rotate_integration_key_api_v1_app_app_id_integration_integ_id_key_rotate_post: %s\n" % e)

    # example passing only optional values
    path_params = {
        'integ_id': "integ_1srOrx2ZWZBpBUvZwXKQmoEYga2",
        'app_id': "app_1srOrx2ZWZBpBUvZwXKQmoEYga2",
    }
    header_params = {
        'idempotency-key': "idempotency-key_example",
    }
    try:
        # Rotate Integration Key
        api_response = api_instance.rotate_integration_key_api_v1_app_app_id_integration_integ_id_key_rotate_post(
            path_params=path_params,
            header_params=header_params,
        )
        pprint(api_response)
    except svix.ApiException as e:
        print("Exception when calling IntegrationApi->rotate_integration_key_api_v1_app_app_id_integration_integ_id_key_rotate_post: %s\n" % e)
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
integ_id | IntegIdSchema | | 
app_id | AppIdSchema | | 

# IntegIdSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

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
200 | [ApiResponseFor200](#rotate_integration_key_api_v1_app_app_id_integration_integ_id_key_rotate_post.ApiResponseFor200) | Successful Response
401 | [ApiResponseFor401](#rotate_integration_key_api_v1_app_app_id_integration_integ_id_key_rotate_post.ApiResponseFor401) | Unauthorized
403 | [ApiResponseFor403](#rotate_integration_key_api_v1_app_app_id_integration_integ_id_key_rotate_post.ApiResponseFor403) | Forbidden
404 | [ApiResponseFor404](#rotate_integration_key_api_v1_app_app_id_integration_integ_id_key_rotate_post.ApiResponseFor404) | Not Found
409 | [ApiResponseFor409](#rotate_integration_key_api_v1_app_app_id_integration_integ_id_key_rotate_post.ApiResponseFor409) | Conflict
422 | [ApiResponseFor422](#rotate_integration_key_api_v1_app_app_id_integration_integ_id_key_rotate_post.ApiResponseFor422) | Validation Error
429 | [ApiResponseFor429](#rotate_integration_key_api_v1_app_app_id_integration_integ_id_key_rotate_post.ApiResponseFor429) | Too Many Requests

#### rotate_integration_key_api_v1_app_app_id_integration_integ_id_key_rotate_post.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**IntegrationKeyOut**](../../models/IntegrationKeyOut.md) |  | 


#### rotate_integration_key_api_v1_app_app_id_integration_integ_id_key_rotate_post.ApiResponseFor401
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor401ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor401ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### rotate_integration_key_api_v1_app_app_id_integration_integ_id_key_rotate_post.ApiResponseFor403
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor403ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor403ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### rotate_integration_key_api_v1_app_app_id_integration_integ_id_key_rotate_post.ApiResponseFor404
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor404ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor404ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### rotate_integration_key_api_v1_app_app_id_integration_integ_id_key_rotate_post.ApiResponseFor409
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor409ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor409ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### rotate_integration_key_api_v1_app_app_id_integration_integ_id_key_rotate_post.ApiResponseFor422
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor422ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor422ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HTTPValidationError**](../../models/HTTPValidationError.md) |  | 


#### rotate_integration_key_api_v1_app_app_id_integration_integ_id_key_rotate_post.ApiResponseFor429
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

# **update_integration_api_v1_app_app_id_integration_integ_id_put**
<a name="update_integration_api_v1_app_app_id_integration_integ_id_put"></a>
> IntegrationOut update_integration_api_v1_app_app_id_integration_integ_id_put(integ_idapp_idintegration_update)

Update Integration

Update an integration.

### Example

* Bearer Authentication (HTTPBearer):
```python
import svix
from svix.apis.tags import integration_api
from svix.model.http_validation_error import HTTPValidationError
from svix.model.integration_out import IntegrationOut
from svix.model.http_error_out import HttpErrorOut
from svix.model.integration_update import IntegrationUpdate
from pprint import pprint
# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = svix.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure Bearer authorization: HTTPBearer
configuration = svix.Configuration(
    access_token = 'YOUR_BEARER_TOKEN'
)
# Enter a context with an instance of the API client
with svix.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = integration_api.IntegrationApi(api_client)

    # example passing only required values which don't have defaults set
    path_params = {
        'integ_id': "integ_1srOrx2ZWZBpBUvZwXKQmoEYga2",
        'app_id': "app_1srOrx2ZWZBpBUvZwXKQmoEYga2",
    }
    header_params = {
    }
    body = IntegrationUpdate(
        name="Example Integration",
    )
    try:
        # Update Integration
        api_response = api_instance.update_integration_api_v1_app_app_id_integration_integ_id_put(
            path_params=path_params,
            header_params=header_params,
            body=body,
        )
        pprint(api_response)
    except svix.ApiException as e:
        print("Exception when calling IntegrationApi->update_integration_api_v1_app_app_id_integration_integ_id_put: %s\n" % e)

    # example passing only optional values
    path_params = {
        'integ_id': "integ_1srOrx2ZWZBpBUvZwXKQmoEYga2",
        'app_id': "app_1srOrx2ZWZBpBUvZwXKQmoEYga2",
    }
    header_params = {
        'idempotency-key': "idempotency-key_example",
    }
    body = IntegrationUpdate(
        name="Example Integration",
    )
    try:
        # Update Integration
        api_response = api_instance.update_integration_api_v1_app_app_id_integration_integ_id_put(
            path_params=path_params,
            header_params=header_params,
            body=body,
        )
        pprint(api_response)
    except svix.ApiException as e:
        print("Exception when calling IntegrationApi->update_integration_api_v1_app_app_id_integration_integ_id_put: %s\n" % e)
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
[**IntegrationUpdate**](../../models/IntegrationUpdate.md) |  | 


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
integ_id | IntegIdSchema | | 
app_id | AppIdSchema | | 

# IntegIdSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

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
200 | [ApiResponseFor200](#update_integration_api_v1_app_app_id_integration_integ_id_put.ApiResponseFor200) | Successful Response
401 | [ApiResponseFor401](#update_integration_api_v1_app_app_id_integration_integ_id_put.ApiResponseFor401) | Unauthorized
403 | [ApiResponseFor403](#update_integration_api_v1_app_app_id_integration_integ_id_put.ApiResponseFor403) | Forbidden
404 | [ApiResponseFor404](#update_integration_api_v1_app_app_id_integration_integ_id_put.ApiResponseFor404) | Not Found
409 | [ApiResponseFor409](#update_integration_api_v1_app_app_id_integration_integ_id_put.ApiResponseFor409) | Conflict
422 | [ApiResponseFor422](#update_integration_api_v1_app_app_id_integration_integ_id_put.ApiResponseFor422) | Validation Error
429 | [ApiResponseFor429](#update_integration_api_v1_app_app_id_integration_integ_id_put.ApiResponseFor429) | Too Many Requests

#### update_integration_api_v1_app_app_id_integration_integ_id_put.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**IntegrationOut**](../../models/IntegrationOut.md) |  | 


#### update_integration_api_v1_app_app_id_integration_integ_id_put.ApiResponseFor401
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor401ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor401ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### update_integration_api_v1_app_app_id_integration_integ_id_put.ApiResponseFor403
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor403ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor403ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### update_integration_api_v1_app_app_id_integration_integ_id_put.ApiResponseFor404
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor404ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor404ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### update_integration_api_v1_app_app_id_integration_integ_id_put.ApiResponseFor409
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor409ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor409ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### update_integration_api_v1_app_app_id_integration_integ_id_put.ApiResponseFor422
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor422ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor422ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HTTPValidationError**](../../models/HTTPValidationError.md) |  | 


#### update_integration_api_v1_app_app_id_integration_integ_id_put.ApiResponseFor429
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

