<a name="__pageTop"></a>
# svix.apis.tags.application_api.ApplicationApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_application_api_v1_app_post**](#create_application_api_v1_app_post) | **post** /api/v1/app/ | Create Application
[**delete_application_api_v1_app_app_id_delete**](#delete_application_api_v1_app_app_id_delete) | **delete** /api/v1/app/{app_id}/ | Delete Application
[**get_application_api_v1_app_app_id_get**](#get_application_api_v1_app_app_id_get) | **get** /api/v1/app/{app_id}/ | Get Application
[**list_applications_api_v1_app_get**](#list_applications_api_v1_app_get) | **get** /api/v1/app/ | List Applications
[**update_application_api_v1_app_app_id_put**](#update_application_api_v1_app_app_id_put) | **put** /api/v1/app/{app_id}/ | Update Application

# **create_application_api_v1_app_post**
<a name="create_application_api_v1_app_post"></a>
> ApplicationOut create_application_api_v1_app_post(application_in)

Create Application

Create a new application.

### Example

* Bearer Authentication (HTTPBearer):
```python
import svix
from svix.apis.tags import application_api
from svix.model.http_validation_error import HTTPValidationError
from svix.model.http_error_out import HttpErrorOut
from svix.model.application_out import ApplicationOut
from svix.model.application_in import ApplicationIn
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
    api_instance = application_api.ApplicationApi(api_client)

    # example passing only required values which don't have defaults set
    query_params = {
    }
    header_params = {
    }
    body = ApplicationIn(
        uid="unique-app-identifier",
        name="My first application",
        rate_limit=1000,
        metadata=dict(
            "key": "key_example",
        ),
    )
    try:
        # Create Application
        api_response = api_instance.create_application_api_v1_app_post(
            query_params=query_params,
            header_params=header_params,
            body=body,
        )
        pprint(api_response)
    except svix.ApiException as e:
        print("Exception when calling ApplicationApi->create_application_api_v1_app_post: %s\n" % e)

    # example passing only optional values
    query_params = {
        'get_if_exists': False,
    }
    header_params = {
        'idempotency-key': "idempotency-key_example",
    }
    body = ApplicationIn(
        uid="unique-app-identifier",
        name="My first application",
        rate_limit=1000,
        metadata=dict(
            "key": "key_example",
        ),
    )
    try:
        # Create Application
        api_response = api_instance.create_application_api_v1_app_post(
            query_params=query_params,
            header_params=header_params,
            body=body,
        )
        pprint(api_response)
    except svix.ApiException as e:
        print("Exception when calling ApplicationApi->create_application_api_v1_app_post: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
body | typing.Union[SchemaForRequestBodyApplicationJson] | required |
query_params | RequestQueryParams | |
header_params | RequestHeaderParams | |
content_type | str | optional, default is 'application/json' | Selects the schema and serialization of the request body
accept_content_types | typing.Tuple[str] | default is ('application/json', ) | Tells the server the content type(s) that are accepted by the client
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### body

# SchemaForRequestBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**ApplicationIn**](../../models/ApplicationIn.md) |  | 


### query_params
#### RequestQueryParams

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
get_if_exists | GetIfExistsSchema | | optional


# GetIfExistsSchema

Get an existing application, or create a new one if doesn't exist. It's two separate functions in the libs.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
bool,  | BoolClass,  | Get an existing application, or create a new one if doesn&#x27;t exist. It&#x27;s two separate functions in the libs. | if omitted the server will use the default value of False

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
200 | [ApiResponseFor200](#create_application_api_v1_app_post.ApiResponseFor200) | OK
201 | [ApiResponseFor201](#create_application_api_v1_app_post.ApiResponseFor201) | Successful Response
401 | [ApiResponseFor401](#create_application_api_v1_app_post.ApiResponseFor401) | Unauthorized
403 | [ApiResponseFor403](#create_application_api_v1_app_post.ApiResponseFor403) | Forbidden
404 | [ApiResponseFor404](#create_application_api_v1_app_post.ApiResponseFor404) | Not Found
409 | [ApiResponseFor409](#create_application_api_v1_app_post.ApiResponseFor409) | Conflict
422 | [ApiResponseFor422](#create_application_api_v1_app_post.ApiResponseFor422) | Validation Error
429 | [ApiResponseFor429](#create_application_api_v1_app_post.ApiResponseFor429) | Too Many Requests

#### create_application_api_v1_app_post.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**ApplicationOut**](../../models/ApplicationOut.md) |  | 


#### create_application_api_v1_app_post.ApiResponseFor201
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor201ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor201ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**ApplicationOut**](../../models/ApplicationOut.md) |  | 


#### create_application_api_v1_app_post.ApiResponseFor401
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor401ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor401ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### create_application_api_v1_app_post.ApiResponseFor403
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor403ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor403ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### create_application_api_v1_app_post.ApiResponseFor404
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor404ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor404ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### create_application_api_v1_app_post.ApiResponseFor409
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor409ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor409ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### create_application_api_v1_app_post.ApiResponseFor422
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor422ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor422ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HTTPValidationError**](../../models/HTTPValidationError.md) |  | 


#### create_application_api_v1_app_post.ApiResponseFor429
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

# **delete_application_api_v1_app_app_id_delete**
<a name="delete_application_api_v1_app_app_id_delete"></a>
> delete_application_api_v1_app_app_id_delete(app_id)

Delete Application

Delete an application.

### Example

* Bearer Authentication (HTTPBearer):
```python
import svix
from svix.apis.tags import application_api
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
    api_instance = application_api.ApplicationApi(api_client)

    # example passing only required values which don't have defaults set
    path_params = {
        'app_id': "app_1srOrx2ZWZBpBUvZwXKQmoEYga2",
    }
    header_params = {
    }
    try:
        # Delete Application
        api_response = api_instance.delete_application_api_v1_app_app_id_delete(
            path_params=path_params,
            header_params=header_params,
        )
    except svix.ApiException as e:
        print("Exception when calling ApplicationApi->delete_application_api_v1_app_app_id_delete: %s\n" % e)

    # example passing only optional values
    path_params = {
        'app_id': "app_1srOrx2ZWZBpBUvZwXKQmoEYga2",
    }
    header_params = {
        'idempotency-key': "idempotency-key_example",
    }
    try:
        # Delete Application
        api_response = api_instance.delete_application_api_v1_app_app_id_delete(
            path_params=path_params,
            header_params=header_params,
        )
    except svix.ApiException as e:
        print("Exception when calling ApplicationApi->delete_application_api_v1_app_app_id_delete: %s\n" % e)
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
204 | [ApiResponseFor204](#delete_application_api_v1_app_app_id_delete.ApiResponseFor204) | Successful Response
401 | [ApiResponseFor401](#delete_application_api_v1_app_app_id_delete.ApiResponseFor401) | Unauthorized
403 | [ApiResponseFor403](#delete_application_api_v1_app_app_id_delete.ApiResponseFor403) | Forbidden
404 | [ApiResponseFor404](#delete_application_api_v1_app_app_id_delete.ApiResponseFor404) | Not Found
409 | [ApiResponseFor409](#delete_application_api_v1_app_app_id_delete.ApiResponseFor409) | Conflict
422 | [ApiResponseFor422](#delete_application_api_v1_app_app_id_delete.ApiResponseFor422) | Validation Error
429 | [ApiResponseFor429](#delete_application_api_v1_app_app_id_delete.ApiResponseFor429) | Too Many Requests

#### delete_application_api_v1_app_app_id_delete.ApiResponseFor204
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | Unset | body was not defined |
headers | Unset | headers were not defined |

#### delete_application_api_v1_app_app_id_delete.ApiResponseFor401
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor401ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor401ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### delete_application_api_v1_app_app_id_delete.ApiResponseFor403
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor403ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor403ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### delete_application_api_v1_app_app_id_delete.ApiResponseFor404
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor404ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor404ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### delete_application_api_v1_app_app_id_delete.ApiResponseFor409
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor409ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor409ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### delete_application_api_v1_app_app_id_delete.ApiResponseFor422
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor422ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor422ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HTTPValidationError**](../../models/HTTPValidationError.md) |  | 


#### delete_application_api_v1_app_app_id_delete.ApiResponseFor429
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

# **get_application_api_v1_app_app_id_get**
<a name="get_application_api_v1_app_app_id_get"></a>
> ApplicationOut get_application_api_v1_app_app_id_get(app_id)

Get Application

Get an application.

### Example

* Bearer Authentication (HTTPBearer):
```python
import svix
from svix.apis.tags import application_api
from svix.model.http_validation_error import HTTPValidationError
from svix.model.http_error_out import HttpErrorOut
from svix.model.application_out import ApplicationOut
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
    api_instance = application_api.ApplicationApi(api_client)

    # example passing only required values which don't have defaults set
    path_params = {
        'app_id': "app_1srOrx2ZWZBpBUvZwXKQmoEYga2",
    }
    header_params = {
    }
    try:
        # Get Application
        api_response = api_instance.get_application_api_v1_app_app_id_get(
            path_params=path_params,
            header_params=header_params,
        )
        pprint(api_response)
    except svix.ApiException as e:
        print("Exception when calling ApplicationApi->get_application_api_v1_app_app_id_get: %s\n" % e)

    # example passing only optional values
    path_params = {
        'app_id': "app_1srOrx2ZWZBpBUvZwXKQmoEYga2",
    }
    header_params = {
        'idempotency-key': "idempotency-key_example",
    }
    try:
        # Get Application
        api_response = api_instance.get_application_api_v1_app_app_id_get(
            path_params=path_params,
            header_params=header_params,
        )
        pprint(api_response)
    except svix.ApiException as e:
        print("Exception when calling ApplicationApi->get_application_api_v1_app_app_id_get: %s\n" % e)
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
200 | [ApiResponseFor200](#get_application_api_v1_app_app_id_get.ApiResponseFor200) | Successful Response
401 | [ApiResponseFor401](#get_application_api_v1_app_app_id_get.ApiResponseFor401) | Unauthorized
403 | [ApiResponseFor403](#get_application_api_v1_app_app_id_get.ApiResponseFor403) | Forbidden
404 | [ApiResponseFor404](#get_application_api_v1_app_app_id_get.ApiResponseFor404) | Not Found
409 | [ApiResponseFor409](#get_application_api_v1_app_app_id_get.ApiResponseFor409) | Conflict
422 | [ApiResponseFor422](#get_application_api_v1_app_app_id_get.ApiResponseFor422) | Validation Error
429 | [ApiResponseFor429](#get_application_api_v1_app_app_id_get.ApiResponseFor429) | Too Many Requests

#### get_application_api_v1_app_app_id_get.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**ApplicationOut**](../../models/ApplicationOut.md) |  | 


#### get_application_api_v1_app_app_id_get.ApiResponseFor401
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor401ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor401ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### get_application_api_v1_app_app_id_get.ApiResponseFor403
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor403ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor403ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### get_application_api_v1_app_app_id_get.ApiResponseFor404
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor404ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor404ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### get_application_api_v1_app_app_id_get.ApiResponseFor409
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor409ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor409ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### get_application_api_v1_app_app_id_get.ApiResponseFor422
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor422ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor422ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HTTPValidationError**](../../models/HTTPValidationError.md) |  | 


#### get_application_api_v1_app_app_id_get.ApiResponseFor429
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

# **list_applications_api_v1_app_get**
<a name="list_applications_api_v1_app_get"></a>
> ListResponseApplicationOut list_applications_api_v1_app_get()

List Applications

List of all the organization's applications.

### Example

* Bearer Authentication (HTTPBearer):
```python
import svix
from svix.apis.tags import application_api
from svix.model.http_validation_error import HTTPValidationError
from svix.model.http_error_out import HttpErrorOut
from svix.model.list_response_application_out import ListResponseApplicationOut
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
    api_instance = application_api.ApplicationApi(api_client)

    # example passing only optional values
    query_params = {
        'iterator': "app_1srOrx2ZWZBpBUvZwXKQmoEYga2",
        'limit': 50,
    }
    header_params = {
        'idempotency-key': "idempotency-key_example",
    }
    try:
        # List Applications
        api_response = api_instance.list_applications_api_v1_app_get(
            query_params=query_params,
            header_params=header_params,
        )
        pprint(api_response)
    except svix.ApiException as e:
        print("Exception when calling ApplicationApi->list_applications_api_v1_app_get: %s\n" % e)
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

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#list_applications_api_v1_app_get.ApiResponseFor200) | Successful Response
401 | [ApiResponseFor401](#list_applications_api_v1_app_get.ApiResponseFor401) | Unauthorized
403 | [ApiResponseFor403](#list_applications_api_v1_app_get.ApiResponseFor403) | Forbidden
404 | [ApiResponseFor404](#list_applications_api_v1_app_get.ApiResponseFor404) | Not Found
409 | [ApiResponseFor409](#list_applications_api_v1_app_get.ApiResponseFor409) | Conflict
422 | [ApiResponseFor422](#list_applications_api_v1_app_get.ApiResponseFor422) | Validation Error
429 | [ApiResponseFor429](#list_applications_api_v1_app_get.ApiResponseFor429) | Too Many Requests

#### list_applications_api_v1_app_get.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**ListResponseApplicationOut**](../../models/ListResponseApplicationOut.md) |  | 


#### list_applications_api_v1_app_get.ApiResponseFor401
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor401ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor401ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### list_applications_api_v1_app_get.ApiResponseFor403
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor403ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor403ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### list_applications_api_v1_app_get.ApiResponseFor404
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor404ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor404ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### list_applications_api_v1_app_get.ApiResponseFor409
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor409ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor409ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### list_applications_api_v1_app_get.ApiResponseFor422
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor422ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor422ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HTTPValidationError**](../../models/HTTPValidationError.md) |  | 


#### list_applications_api_v1_app_get.ApiResponseFor429
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

# **update_application_api_v1_app_app_id_put**
<a name="update_application_api_v1_app_app_id_put"></a>
> ApplicationOut update_application_api_v1_app_app_id_put(app_idapplication_in)

Update Application

Update an application.

### Example

* Bearer Authentication (HTTPBearer):
```python
import svix
from svix.apis.tags import application_api
from svix.model.http_validation_error import HTTPValidationError
from svix.model.http_error_out import HttpErrorOut
from svix.model.application_out import ApplicationOut
from svix.model.application_in import ApplicationIn
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
    api_instance = application_api.ApplicationApi(api_client)

    # example passing only required values which don't have defaults set
    path_params = {
        'app_id': "app_1srOrx2ZWZBpBUvZwXKQmoEYga2",
    }
    header_params = {
    }
    body = ApplicationIn(
        uid="unique-app-identifier",
        name="My first application",
        rate_limit=1000,
        metadata=dict(
            "key": "key_example",
        ),
    )
    try:
        # Update Application
        api_response = api_instance.update_application_api_v1_app_app_id_put(
            path_params=path_params,
            header_params=header_params,
            body=body,
        )
        pprint(api_response)
    except svix.ApiException as e:
        print("Exception when calling ApplicationApi->update_application_api_v1_app_app_id_put: %s\n" % e)

    # example passing only optional values
    path_params = {
        'app_id': "app_1srOrx2ZWZBpBUvZwXKQmoEYga2",
    }
    header_params = {
        'idempotency-key': "idempotency-key_example",
    }
    body = ApplicationIn(
        uid="unique-app-identifier",
        name="My first application",
        rate_limit=1000,
        metadata=dict(
            "key": "key_example",
        ),
    )
    try:
        # Update Application
        api_response = api_instance.update_application_api_v1_app_app_id_put(
            path_params=path_params,
            header_params=header_params,
            body=body,
        )
        pprint(api_response)
    except svix.ApiException as e:
        print("Exception when calling ApplicationApi->update_application_api_v1_app_app_id_put: %s\n" % e)
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
[**ApplicationIn**](../../models/ApplicationIn.md) |  | 


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
200 | [ApiResponseFor200](#update_application_api_v1_app_app_id_put.ApiResponseFor200) | Successful Response
201 | [ApiResponseFor201](#update_application_api_v1_app_app_id_put.ApiResponseFor201) | Created
401 | [ApiResponseFor401](#update_application_api_v1_app_app_id_put.ApiResponseFor401) | Unauthorized
403 | [ApiResponseFor403](#update_application_api_v1_app_app_id_put.ApiResponseFor403) | Forbidden
404 | [ApiResponseFor404](#update_application_api_v1_app_app_id_put.ApiResponseFor404) | Not Found
409 | [ApiResponseFor409](#update_application_api_v1_app_app_id_put.ApiResponseFor409) | Conflict
422 | [ApiResponseFor422](#update_application_api_v1_app_app_id_put.ApiResponseFor422) | Validation Error
429 | [ApiResponseFor429](#update_application_api_v1_app_app_id_put.ApiResponseFor429) | Too Many Requests

#### update_application_api_v1_app_app_id_put.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**ApplicationOut**](../../models/ApplicationOut.md) |  | 


#### update_application_api_v1_app_app_id_put.ApiResponseFor201
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor201ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor201ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**ApplicationOut**](../../models/ApplicationOut.md) |  | 


#### update_application_api_v1_app_app_id_put.ApiResponseFor401
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor401ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor401ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### update_application_api_v1_app_app_id_put.ApiResponseFor403
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor403ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor403ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### update_application_api_v1_app_app_id_put.ApiResponseFor404
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor404ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor404ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### update_application_api_v1_app_app_id_put.ApiResponseFor409
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor409ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor409ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### update_application_api_v1_app_app_id_put.ApiResponseFor422
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor422ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor422ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HTTPValidationError**](../../models/HTTPValidationError.md) |  | 


#### update_application_api_v1_app_app_id_put.ApiResponseFor429
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

