<a name="__pageTop"></a>
# svix.apis.tags.event_type_api.EventTypeApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_event_type_api_v1_event_type_post**](#create_event_type_api_v1_event_type_post) | **post** /api/v1/event-type/ | Create Event Type
[**delete_event_type_api_v1_event_type_event_type_name_delete**](#delete_event_type_api_v1_event_type_event_type_name_delete) | **delete** /api/v1/event-type/{event_type_name}/ | Archive Event Type
[**get_event_type_api_v1_event_type_event_type_name_get**](#get_event_type_api_v1_event_type_event_type_name_get) | **get** /api/v1/event-type/{event_type_name}/ | Get Event Type
[**list_event_types_api_v1_event_type_get**](#list_event_types_api_v1_event_type_get) | **get** /api/v1/event-type/ | List Event Types
[**update_event_type_api_v1_event_type_event_type_name_put**](#update_event_type_api_v1_event_type_event_type_name_put) | **put** /api/v1/event-type/{event_type_name}/ | Update Event Type

# **create_event_type_api_v1_event_type_post**
<a name="create_event_type_api_v1_event_type_post"></a>
> EventTypeOut create_event_type_api_v1_event_type_post(event_type_in)

Create Event Type

Create new or unarchive existing event type.  Unarchiving an event type will allow endpoints to filter on it and messages to be sent with it. Endpoints filtering on the event type before archival will continue to filter on it. This operation does not preserve the description and schemas.

### Example

* Bearer Authentication (HTTPBearer):
```python
import svix
from svix.apis.tags import event_type_api
from svix.model.http_validation_error import HTTPValidationError
from svix.model.event_type_in import EventTypeIn
from svix.model.http_error_out import HttpErrorOut
from svix.model.event_type_out import EventTypeOut
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
    api_instance = event_type_api.EventTypeApi(api_client)

    # example passing only required values which don't have defaults set
    header_params = {
    }
    body = EventTypeIn(
        description="A user has signed up",
        schemas=dict(
            "key": dict(),
        ),
        archived=False,
        name="user.signup",
    )
    try:
        # Create Event Type
        api_response = api_instance.create_event_type_api_v1_event_type_post(
            header_params=header_params,
            body=body,
        )
        pprint(api_response)
    except svix.ApiException as e:
        print("Exception when calling EventTypeApi->create_event_type_api_v1_event_type_post: %s\n" % e)

    # example passing only optional values
    header_params = {
        'idempotency-key': "idempotency-key_example",
    }
    body = EventTypeIn(
        description="A user has signed up",
        schemas=dict(
            "key": dict(),
        ),
        archived=False,
        name="user.signup",
    )
    try:
        # Create Event Type
        api_response = api_instance.create_event_type_api_v1_event_type_post(
            header_params=header_params,
            body=body,
        )
        pprint(api_response)
    except svix.ApiException as e:
        print("Exception when calling EventTypeApi->create_event_type_api_v1_event_type_post: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
body | typing.Union[SchemaForRequestBodyApplicationJson] | required |
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
[**EventTypeIn**](../../models/EventTypeIn.md) |  | 


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
201 | [ApiResponseFor201](#create_event_type_api_v1_event_type_post.ApiResponseFor201) | Successful Response
401 | [ApiResponseFor401](#create_event_type_api_v1_event_type_post.ApiResponseFor401) | Unauthorized
403 | [ApiResponseFor403](#create_event_type_api_v1_event_type_post.ApiResponseFor403) | Forbidden
404 | [ApiResponseFor404](#create_event_type_api_v1_event_type_post.ApiResponseFor404) | Not Found
409 | [ApiResponseFor409](#create_event_type_api_v1_event_type_post.ApiResponseFor409) | Conflict
422 | [ApiResponseFor422](#create_event_type_api_v1_event_type_post.ApiResponseFor422) | Validation Error
429 | [ApiResponseFor429](#create_event_type_api_v1_event_type_post.ApiResponseFor429) | Too Many Requests

#### create_event_type_api_v1_event_type_post.ApiResponseFor201
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor201ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor201ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**EventTypeOut**](../../models/EventTypeOut.md) |  | 


#### create_event_type_api_v1_event_type_post.ApiResponseFor401
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor401ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor401ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### create_event_type_api_v1_event_type_post.ApiResponseFor403
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor403ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor403ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### create_event_type_api_v1_event_type_post.ApiResponseFor404
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor404ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor404ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### create_event_type_api_v1_event_type_post.ApiResponseFor409
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor409ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor409ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### create_event_type_api_v1_event_type_post.ApiResponseFor422
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor422ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor422ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HTTPValidationError**](../../models/HTTPValidationError.md) |  | 


#### create_event_type_api_v1_event_type_post.ApiResponseFor429
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

# **delete_event_type_api_v1_event_type_event_type_name_delete**
<a name="delete_event_type_api_v1_event_type_event_type_name_delete"></a>
> delete_event_type_api_v1_event_type_event_type_name_delete(event_type_name)

Archive Event Type

Archive an event type.  Endpoints already configured to filter on an event type will continue to do so after archival. However, new messages can not be sent with it and endpoints can not filter on it. An event type can be unarchived with the [create operation](#operation/create_event_type_api_v1_event_type__post).

### Example

* Bearer Authentication (HTTPBearer):
```python
import svix
from svix.apis.tags import event_type_api
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
    api_instance = event_type_api.EventTypeApi(api_client)

    # example passing only required values which don't have defaults set
    path_params = {
        'event_type_name': "user.signup",
    }
    header_params = {
    }
    try:
        # Archive Event Type
        api_response = api_instance.delete_event_type_api_v1_event_type_event_type_name_delete(
            path_params=path_params,
            header_params=header_params,
        )
    except svix.ApiException as e:
        print("Exception when calling EventTypeApi->delete_event_type_api_v1_event_type_event_type_name_delete: %s\n" % e)

    # example passing only optional values
    path_params = {
        'event_type_name': "user.signup",
    }
    header_params = {
        'idempotency-key': "idempotency-key_example",
    }
    try:
        # Archive Event Type
        api_response = api_instance.delete_event_type_api_v1_event_type_event_type_name_delete(
            path_params=path_params,
            header_params=header_params,
        )
    except svix.ApiException as e:
        print("Exception when calling EventTypeApi->delete_event_type_api_v1_event_type_event_type_name_delete: %s\n" % e)
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
event_type_name | EventTypeNameSchema | | 

# EventTypeNameSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
204 | [ApiResponseFor204](#delete_event_type_api_v1_event_type_event_type_name_delete.ApiResponseFor204) | Successful Response
401 | [ApiResponseFor401](#delete_event_type_api_v1_event_type_event_type_name_delete.ApiResponseFor401) | Unauthorized
403 | [ApiResponseFor403](#delete_event_type_api_v1_event_type_event_type_name_delete.ApiResponseFor403) | Forbidden
404 | [ApiResponseFor404](#delete_event_type_api_v1_event_type_event_type_name_delete.ApiResponseFor404) | Not Found
409 | [ApiResponseFor409](#delete_event_type_api_v1_event_type_event_type_name_delete.ApiResponseFor409) | Conflict
422 | [ApiResponseFor422](#delete_event_type_api_v1_event_type_event_type_name_delete.ApiResponseFor422) | Validation Error
429 | [ApiResponseFor429](#delete_event_type_api_v1_event_type_event_type_name_delete.ApiResponseFor429) | Too Many Requests

#### delete_event_type_api_v1_event_type_event_type_name_delete.ApiResponseFor204
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | Unset | body was not defined |
headers | Unset | headers were not defined |

#### delete_event_type_api_v1_event_type_event_type_name_delete.ApiResponseFor401
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor401ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor401ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### delete_event_type_api_v1_event_type_event_type_name_delete.ApiResponseFor403
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor403ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor403ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### delete_event_type_api_v1_event_type_event_type_name_delete.ApiResponseFor404
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor404ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor404ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### delete_event_type_api_v1_event_type_event_type_name_delete.ApiResponseFor409
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor409ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor409ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### delete_event_type_api_v1_event_type_event_type_name_delete.ApiResponseFor422
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor422ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor422ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HTTPValidationError**](../../models/HTTPValidationError.md) |  | 


#### delete_event_type_api_v1_event_type_event_type_name_delete.ApiResponseFor429
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

# **get_event_type_api_v1_event_type_event_type_name_get**
<a name="get_event_type_api_v1_event_type_event_type_name_get"></a>
> EventTypeOut get_event_type_api_v1_event_type_event_type_name_get(event_type_name)

Get Event Type

Get an event type.

### Example

* Bearer Authentication (HTTPBearer):
```python
import svix
from svix.apis.tags import event_type_api
from svix.model.http_validation_error import HTTPValidationError
from svix.model.http_error_out import HttpErrorOut
from svix.model.event_type_out import EventTypeOut
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
    api_instance = event_type_api.EventTypeApi(api_client)

    # example passing only required values which don't have defaults set
    path_params = {
        'event_type_name': "user.signup",
    }
    header_params = {
    }
    try:
        # Get Event Type
        api_response = api_instance.get_event_type_api_v1_event_type_event_type_name_get(
            path_params=path_params,
            header_params=header_params,
        )
        pprint(api_response)
    except svix.ApiException as e:
        print("Exception when calling EventTypeApi->get_event_type_api_v1_event_type_event_type_name_get: %s\n" % e)

    # example passing only optional values
    path_params = {
        'event_type_name': "user.signup",
    }
    header_params = {
        'idempotency-key': "idempotency-key_example",
    }
    try:
        # Get Event Type
        api_response = api_instance.get_event_type_api_v1_event_type_event_type_name_get(
            path_params=path_params,
            header_params=header_params,
        )
        pprint(api_response)
    except svix.ApiException as e:
        print("Exception when calling EventTypeApi->get_event_type_api_v1_event_type_event_type_name_get: %s\n" % e)
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
event_type_name | EventTypeNameSchema | | 

# EventTypeNameSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#get_event_type_api_v1_event_type_event_type_name_get.ApiResponseFor200) | Successful Response
401 | [ApiResponseFor401](#get_event_type_api_v1_event_type_event_type_name_get.ApiResponseFor401) | Unauthorized
403 | [ApiResponseFor403](#get_event_type_api_v1_event_type_event_type_name_get.ApiResponseFor403) | Forbidden
404 | [ApiResponseFor404](#get_event_type_api_v1_event_type_event_type_name_get.ApiResponseFor404) | Not Found
409 | [ApiResponseFor409](#get_event_type_api_v1_event_type_event_type_name_get.ApiResponseFor409) | Conflict
422 | [ApiResponseFor422](#get_event_type_api_v1_event_type_event_type_name_get.ApiResponseFor422) | Validation Error
429 | [ApiResponseFor429](#get_event_type_api_v1_event_type_event_type_name_get.ApiResponseFor429) | Too Many Requests

#### get_event_type_api_v1_event_type_event_type_name_get.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**EventTypeOut**](../../models/EventTypeOut.md) |  | 


#### get_event_type_api_v1_event_type_event_type_name_get.ApiResponseFor401
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor401ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor401ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### get_event_type_api_v1_event_type_event_type_name_get.ApiResponseFor403
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor403ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor403ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### get_event_type_api_v1_event_type_event_type_name_get.ApiResponseFor404
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor404ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor404ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### get_event_type_api_v1_event_type_event_type_name_get.ApiResponseFor409
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor409ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor409ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### get_event_type_api_v1_event_type_event_type_name_get.ApiResponseFor422
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor422ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor422ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HTTPValidationError**](../../models/HTTPValidationError.md) |  | 


#### get_event_type_api_v1_event_type_event_type_name_get.ApiResponseFor429
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

# **list_event_types_api_v1_event_type_get**
<a name="list_event_types_api_v1_event_type_get"></a>
> ListResponseEventTypeOut list_event_types_api_v1_event_type_get()

List Event Types

Return the list of event types.

### Example

* Bearer Authentication (HTTPBearer):
```python
import svix
from svix.apis.tags import event_type_api
from svix.model.http_validation_error import HTTPValidationError
from svix.model.list_response_event_type_out import ListResponseEventTypeOut
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
    api_instance = event_type_api.EventTypeApi(api_client)

    # example passing only optional values
    query_params = {
        'iterator': "user.signup",
        'limit': 50,
        'with_content': False,
        'include_archived': False,
    }
    header_params = {
        'idempotency-key': "idempotency-key_example",
    }
    try:
        # List Event Types
        api_response = api_instance.list_event_types_api_v1_event_type_get(
            query_params=query_params,
            header_params=header_params,
        )
        pprint(api_response)
    except svix.ApiException as e:
        print("Exception when calling EventTypeApi->list_event_types_api_v1_event_type_get: %s\n" % e)
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
with_content | WithContentSchema | | optional
include_archived | IncludeArchivedSchema | | optional


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

# WithContentSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
bool,  | BoolClass,  |  | if omitted the server will use the default value of False

# IncludeArchivedSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
bool,  | BoolClass,  |  | if omitted the server will use the default value of False

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
200 | [ApiResponseFor200](#list_event_types_api_v1_event_type_get.ApiResponseFor200) | Successful Response
401 | [ApiResponseFor401](#list_event_types_api_v1_event_type_get.ApiResponseFor401) | Unauthorized
403 | [ApiResponseFor403](#list_event_types_api_v1_event_type_get.ApiResponseFor403) | Forbidden
404 | [ApiResponseFor404](#list_event_types_api_v1_event_type_get.ApiResponseFor404) | Not Found
409 | [ApiResponseFor409](#list_event_types_api_v1_event_type_get.ApiResponseFor409) | Conflict
422 | [ApiResponseFor422](#list_event_types_api_v1_event_type_get.ApiResponseFor422) | Validation Error
429 | [ApiResponseFor429](#list_event_types_api_v1_event_type_get.ApiResponseFor429) | Too Many Requests

#### list_event_types_api_v1_event_type_get.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**ListResponseEventTypeOut**](../../models/ListResponseEventTypeOut.md) |  | 


#### list_event_types_api_v1_event_type_get.ApiResponseFor401
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor401ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor401ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### list_event_types_api_v1_event_type_get.ApiResponseFor403
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor403ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor403ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### list_event_types_api_v1_event_type_get.ApiResponseFor404
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor404ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor404ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### list_event_types_api_v1_event_type_get.ApiResponseFor409
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor409ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor409ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### list_event_types_api_v1_event_type_get.ApiResponseFor422
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor422ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor422ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HTTPValidationError**](../../models/HTTPValidationError.md) |  | 


#### list_event_types_api_v1_event_type_get.ApiResponseFor429
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

# **update_event_type_api_v1_event_type_event_type_name_put**
<a name="update_event_type_api_v1_event_type_event_type_name_put"></a>
> EventTypeOut update_event_type_api_v1_event_type_event_type_name_put(event_type_nameevent_type_update)

Update Event Type

Update an event type.

### Example

* Bearer Authentication (HTTPBearer):
```python
import svix
from svix.apis.tags import event_type_api
from svix.model.event_type_update import EventTypeUpdate
from svix.model.http_validation_error import HTTPValidationError
from svix.model.http_error_out import HttpErrorOut
from svix.model.event_type_out import EventTypeOut
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
    api_instance = event_type_api.EventTypeApi(api_client)

    # example passing only required values which don't have defaults set
    path_params = {
        'event_type_name': "user.signup",
    }
    header_params = {
    }
    body = EventTypeUpdate(
        description="A user has signed up",
        schemas=dict(
            "key": dict(),
        ),
        archived=False,
    )
    try:
        # Update Event Type
        api_response = api_instance.update_event_type_api_v1_event_type_event_type_name_put(
            path_params=path_params,
            header_params=header_params,
            body=body,
        )
        pprint(api_response)
    except svix.ApiException as e:
        print("Exception when calling EventTypeApi->update_event_type_api_v1_event_type_event_type_name_put: %s\n" % e)

    # example passing only optional values
    path_params = {
        'event_type_name': "user.signup",
    }
    header_params = {
        'idempotency-key': "idempotency-key_example",
    }
    body = EventTypeUpdate(
        description="A user has signed up",
        schemas=dict(
            "key": dict(),
        ),
        archived=False,
    )
    try:
        # Update Event Type
        api_response = api_instance.update_event_type_api_v1_event_type_event_type_name_put(
            path_params=path_params,
            header_params=header_params,
            body=body,
        )
        pprint(api_response)
    except svix.ApiException as e:
        print("Exception when calling EventTypeApi->update_event_type_api_v1_event_type_event_type_name_put: %s\n" % e)
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
[**EventTypeUpdate**](../../models/EventTypeUpdate.md) |  | 


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
event_type_name | EventTypeNameSchema | | 

# EventTypeNameSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#update_event_type_api_v1_event_type_event_type_name_put.ApiResponseFor200) | Successful Response
201 | [ApiResponseFor201](#update_event_type_api_v1_event_type_event_type_name_put.ApiResponseFor201) | Created
401 | [ApiResponseFor401](#update_event_type_api_v1_event_type_event_type_name_put.ApiResponseFor401) | Unauthorized
403 | [ApiResponseFor403](#update_event_type_api_v1_event_type_event_type_name_put.ApiResponseFor403) | Forbidden
404 | [ApiResponseFor404](#update_event_type_api_v1_event_type_event_type_name_put.ApiResponseFor404) | Not Found
409 | [ApiResponseFor409](#update_event_type_api_v1_event_type_event_type_name_put.ApiResponseFor409) | Conflict
422 | [ApiResponseFor422](#update_event_type_api_v1_event_type_event_type_name_put.ApiResponseFor422) | Validation Error
429 | [ApiResponseFor429](#update_event_type_api_v1_event_type_event_type_name_put.ApiResponseFor429) | Too Many Requests

#### update_event_type_api_v1_event_type_event_type_name_put.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**EventTypeOut**](../../models/EventTypeOut.md) |  | 


#### update_event_type_api_v1_event_type_event_type_name_put.ApiResponseFor201
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor201ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor201ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**EventTypeOut**](../../models/EventTypeOut.md) |  | 


#### update_event_type_api_v1_event_type_event_type_name_put.ApiResponseFor401
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor401ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor401ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### update_event_type_api_v1_event_type_event_type_name_put.ApiResponseFor403
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor403ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor403ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### update_event_type_api_v1_event_type_event_type_name_put.ApiResponseFor404
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor404ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor404ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### update_event_type_api_v1_event_type_event_type_name_put.ApiResponseFor409
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor409ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor409ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### update_event_type_api_v1_event_type_event_type_name_put.ApiResponseFor422
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor422ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor422ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HTTPValidationError**](../../models/HTTPValidationError.md) |  | 


#### update_event_type_api_v1_event_type_event_type_name_put.ApiResponseFor429
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

