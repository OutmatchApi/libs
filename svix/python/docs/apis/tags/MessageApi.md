<a name="__pageTop"></a>
# svix.apis.tags.message_api.MessageApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_message_api_v1_app_app_id_msg_post**](#create_message_api_v1_app_app_id_msg_post) | **post** /api/v1/app/{app_id}/msg/ | Create Message
[**get_message_api_v1_app_app_id_msg_msg_id_get**](#get_message_api_v1_app_app_id_msg_msg_id_get) | **get** /api/v1/app/{app_id}/msg/{msg_id}/ | Get Message
[**list_messages_api_v1_app_app_id_msg_get**](#list_messages_api_v1_app_app_id_msg_get) | **get** /api/v1/app/{app_id}/msg/ | List Messages

# **create_message_api_v1_app_app_id_msg_post**
<a name="create_message_api_v1_app_app_id_msg_post"></a>
> MessageOut create_message_api_v1_app_app_id_msg_post(app_idmessage_in)

Create Message

Creates a new message and dispatches it to all of the application's endpoints.  The `eventId` is an optional custom unique ID. It's verified to be unique only up to a day, after that no verification will be made. If a message with the same `eventId` already exists for any application in your environment, a 409 conflict error will be returned.  The `eventType` indicates the type and schema of the event. All messages of a certain `eventType` are expected to have the same schema. Endpoints can choose to only listen to specific event types. Messages can also have `channels`, which similar to event types let endpoints filter by them. Unlike event types, messages can have multiple channels, and channels don't imply a specific message content or schema.  The `payload` property is the webhook's body (the actual webhook message). Svix supports payload sizes of up to ~350kb, though it's generally a good idea to keep webhook payloads small, probably no larger than 40kb.

### Example

* Bearer Authentication (HTTPBearer):
```python
import svix
from svix.apis.tags import message_api
from svix.model.http_validation_error import HTTPValidationError
from svix.model.http_error_out import HttpErrorOut
from svix.model.message_in import MessageIn
from svix.model.message_out import MessageOut
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
    api_instance = message_api.MessageApi(api_client)

    # example passing only required values which don't have defaults set
    path_params = {
        'app_id': "app_1srOrx2ZWZBpBUvZwXKQmoEYga2",
    }
    query_params = {
    }
    header_params = {
    }
    body = MessageIn(
        event_type="user.signup",
        event_id="evt_pNZKtWg8Azow",
        channels=["project_123","group_2"],
        payload=dict(),
        payload_retention_period=90,
    )
    try:
        # Create Message
        api_response = api_instance.create_message_api_v1_app_app_id_msg_post(
            path_params=path_params,
            query_params=query_params,
            header_params=header_params,
            body=body,
        )
        pprint(api_response)
    except svix.ApiException as e:
        print("Exception when calling MessageApi->create_message_api_v1_app_app_id_msg_post: %s\n" % e)

    # example passing only optional values
    path_params = {
        'app_id': "app_1srOrx2ZWZBpBUvZwXKQmoEYga2",
    }
    query_params = {
        'with_content': True,
    }
    header_params = {
        'idempotency-key': "idempotency-key_example",
    }
    body = MessageIn(
        event_type="user.signup",
        event_id="evt_pNZKtWg8Azow",
        channels=["project_123","group_2"],
        payload=dict(),
        payload_retention_period=90,
    )
    try:
        # Create Message
        api_response = api_instance.create_message_api_v1_app_app_id_msg_post(
            path_params=path_params,
            query_params=query_params,
            header_params=header_params,
            body=body,
        )
        pprint(api_response)
    except svix.ApiException as e:
        print("Exception when calling MessageApi->create_message_api_v1_app_app_id_msg_post: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
body | typing.Union[SchemaForRequestBodyApplicationJson] | required |
query_params | RequestQueryParams | |
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
[**MessageIn**](../../models/MessageIn.md) |  | 


### query_params
#### RequestQueryParams

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
with_content | WithContentSchema | | optional


# WithContentSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
bool,  | BoolClass,  |  | if omitted the server will use the default value of True

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
202 | [ApiResponseFor202](#create_message_api_v1_app_app_id_msg_post.ApiResponseFor202) | Successful Response
401 | [ApiResponseFor401](#create_message_api_v1_app_app_id_msg_post.ApiResponseFor401) | Unauthorized
403 | [ApiResponseFor403](#create_message_api_v1_app_app_id_msg_post.ApiResponseFor403) | Forbidden
404 | [ApiResponseFor404](#create_message_api_v1_app_app_id_msg_post.ApiResponseFor404) | Not Found
409 | [ApiResponseFor409](#create_message_api_v1_app_app_id_msg_post.ApiResponseFor409) | Conflict
413 | [ApiResponseFor413](#create_message_api_v1_app_app_id_msg_post.ApiResponseFor413) | Request Entity Too Large
422 | [ApiResponseFor422](#create_message_api_v1_app_app_id_msg_post.ApiResponseFor422) | Validation Error
429 | [ApiResponseFor429](#create_message_api_v1_app_app_id_msg_post.ApiResponseFor429) | Too Many Requests

#### create_message_api_v1_app_app_id_msg_post.ApiResponseFor202
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor202ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor202ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**MessageOut**](../../models/MessageOut.md) |  | 


#### create_message_api_v1_app_app_id_msg_post.ApiResponseFor401
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor401ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor401ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### create_message_api_v1_app_app_id_msg_post.ApiResponseFor403
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor403ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor403ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### create_message_api_v1_app_app_id_msg_post.ApiResponseFor404
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor404ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor404ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### create_message_api_v1_app_app_id_msg_post.ApiResponseFor409
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor409ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor409ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### create_message_api_v1_app_app_id_msg_post.ApiResponseFor413
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor413ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor413ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### create_message_api_v1_app_app_id_msg_post.ApiResponseFor422
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor422ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor422ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HTTPValidationError**](../../models/HTTPValidationError.md) |  | 


#### create_message_api_v1_app_app_id_msg_post.ApiResponseFor429
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

# **get_message_api_v1_app_app_id_msg_msg_id_get**
<a name="get_message_api_v1_app_app_id_msg_msg_id_get"></a>
> MessageOut get_message_api_v1_app_app_id_msg_msg_id_get(msg_idapp_id)

Get Message

Get a message by its ID or eventID.

### Example

* Bearer Authentication (HTTPBearer):
```python
import svix
from svix.apis.tags import message_api
from svix.model.http_validation_error import HTTPValidationError
from svix.model.http_error_out import HttpErrorOut
from svix.model.message_out import MessageOut
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
    api_instance = message_api.MessageApi(api_client)

    # example passing only required values which don't have defaults set
    path_params = {
        'msg_id': "msg_1srOrx2ZWZBpBUvZwXKQmoEYga2",
        'app_id': "app_1srOrx2ZWZBpBUvZwXKQmoEYga2",
    }
    header_params = {
    }
    try:
        # Get Message
        api_response = api_instance.get_message_api_v1_app_app_id_msg_msg_id_get(
            path_params=path_params,
            header_params=header_params,
        )
        pprint(api_response)
    except svix.ApiException as e:
        print("Exception when calling MessageApi->get_message_api_v1_app_app_id_msg_msg_id_get: %s\n" % e)

    # example passing only optional values
    path_params = {
        'msg_id': "msg_1srOrx2ZWZBpBUvZwXKQmoEYga2",
        'app_id': "app_1srOrx2ZWZBpBUvZwXKQmoEYga2",
    }
    header_params = {
        'idempotency-key': "idempotency-key_example",
    }
    try:
        # Get Message
        api_response = api_instance.get_message_api_v1_app_app_id_msg_msg_id_get(
            path_params=path_params,
            header_params=header_params,
        )
        pprint(api_response)
    except svix.ApiException as e:
        print("Exception when calling MessageApi->get_message_api_v1_app_app_id_msg_msg_id_get: %s\n" % e)
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
msg_id | MsgIdSchema | | 
app_id | AppIdSchema | | 

# MsgIdSchema

The message's ID or eventID

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  | The message&#x27;s ID or eventID | 

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
200 | [ApiResponseFor200](#get_message_api_v1_app_app_id_msg_msg_id_get.ApiResponseFor200) | Successful Response
401 | [ApiResponseFor401](#get_message_api_v1_app_app_id_msg_msg_id_get.ApiResponseFor401) | Unauthorized
403 | [ApiResponseFor403](#get_message_api_v1_app_app_id_msg_msg_id_get.ApiResponseFor403) | Forbidden
404 | [ApiResponseFor404](#get_message_api_v1_app_app_id_msg_msg_id_get.ApiResponseFor404) | Not Found
409 | [ApiResponseFor409](#get_message_api_v1_app_app_id_msg_msg_id_get.ApiResponseFor409) | Conflict
422 | [ApiResponseFor422](#get_message_api_v1_app_app_id_msg_msg_id_get.ApiResponseFor422) | Validation Error
429 | [ApiResponseFor429](#get_message_api_v1_app_app_id_msg_msg_id_get.ApiResponseFor429) | Too Many Requests

#### get_message_api_v1_app_app_id_msg_msg_id_get.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**MessageOut**](../../models/MessageOut.md) |  | 


#### get_message_api_v1_app_app_id_msg_msg_id_get.ApiResponseFor401
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor401ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor401ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### get_message_api_v1_app_app_id_msg_msg_id_get.ApiResponseFor403
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor403ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor403ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### get_message_api_v1_app_app_id_msg_msg_id_get.ApiResponseFor404
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor404ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor404ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### get_message_api_v1_app_app_id_msg_msg_id_get.ApiResponseFor409
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor409ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor409ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### get_message_api_v1_app_app_id_msg_msg_id_get.ApiResponseFor422
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor422ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor422ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HTTPValidationError**](../../models/HTTPValidationError.md) |  | 


#### get_message_api_v1_app_app_id_msg_msg_id_get.ApiResponseFor429
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

# **list_messages_api_v1_app_app_id_msg_get**
<a name="list_messages_api_v1_app_app_id_msg_get"></a>
> ListResponseMessageOut list_messages_api_v1_app_app_id_msg_get(app_id)

List Messages

List all of the application's messages.  The `before` parameter lets you filter all items created before a certain date and is ignored if an iterator is passed. The `after` parameter lets you filter all items created after a certain date and is ignored if an iterator is passed. `before` and `after` cannot be used simultaneously.

### Example

* Bearer Authentication (HTTPBearer):
```python
import svix
from svix.apis.tags import message_api
from svix.model.http_validation_error import HTTPValidationError
from svix.model.list_response_message_out import ListResponseMessageOut
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
    api_instance = message_api.MessageApi(api_client)

    # example passing only required values which don't have defaults set
    path_params = {
        'app_id': "app_1srOrx2ZWZBpBUvZwXKQmoEYga2",
    }
    query_params = {
    }
    header_params = {
    }
    try:
        # List Messages
        api_response = api_instance.list_messages_api_v1_app_app_id_msg_get(
            path_params=path_params,
            query_params=query_params,
            header_params=header_params,
        )
        pprint(api_response)
    except svix.ApiException as e:
        print("Exception when calling MessageApi->list_messages_api_v1_app_app_id_msg_get: %s\n" % e)

    # example passing only optional values
    path_params = {
        'app_id': "app_1srOrx2ZWZBpBUvZwXKQmoEYga2",
    }
    query_params = {
        'iterator': "msg_1srOrx2ZWZBpBUvZwXKQmoEYga2",
        'limit': 50,
        'event_types': [
        "user.signup"
    ],
        'channel': "project_1337",
        'before': "1970-01-01T00:00:00.00Z",
        'after': "1970-01-01T00:00:00.00Z",
    }
    header_params = {
        'idempotency-key': "idempotency-key_example",
    }
    try:
        # List Messages
        api_response = api_instance.list_messages_api_v1_app_app_id_msg_get(
            path_params=path_params,
            query_params=query_params,
            header_params=header_params,
        )
        pprint(api_response)
    except svix.ApiException as e:
        print("Exception when calling MessageApi->list_messages_api_v1_app_app_id_msg_get: %s\n" % e)
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
event_types | EventTypesSchema | | optional
channel | ChannelSchema | | optional
before | BeforeSchema | | optional
after | AfterSchema | | optional


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

# EventTypesSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple, None,  | tuple, NoneClass,  |  | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
items | str,  | str,  |  | 

# ChannelSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
None, str,  | NoneClass, str,  |  | 

# BeforeSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
None, str, datetime,  | NoneClass, str,  |  | value must conform to RFC-3339 date-time

# AfterSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
None, str, datetime,  | NoneClass, str,  |  | value must conform to RFC-3339 date-time

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
200 | [ApiResponseFor200](#list_messages_api_v1_app_app_id_msg_get.ApiResponseFor200) | Successful Response
401 | [ApiResponseFor401](#list_messages_api_v1_app_app_id_msg_get.ApiResponseFor401) | Unauthorized
403 | [ApiResponseFor403](#list_messages_api_v1_app_app_id_msg_get.ApiResponseFor403) | Forbidden
404 | [ApiResponseFor404](#list_messages_api_v1_app_app_id_msg_get.ApiResponseFor404) | Not Found
409 | [ApiResponseFor409](#list_messages_api_v1_app_app_id_msg_get.ApiResponseFor409) | Conflict
422 | [ApiResponseFor422](#list_messages_api_v1_app_app_id_msg_get.ApiResponseFor422) | Validation Error
429 | [ApiResponseFor429](#list_messages_api_v1_app_app_id_msg_get.ApiResponseFor429) | Too Many Requests

#### list_messages_api_v1_app_app_id_msg_get.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**ListResponseMessageOut**](../../models/ListResponseMessageOut.md) |  | 


#### list_messages_api_v1_app_app_id_msg_get.ApiResponseFor401
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor401ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor401ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### list_messages_api_v1_app_app_id_msg_get.ApiResponseFor403
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor403ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor403ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### list_messages_api_v1_app_app_id_msg_get.ApiResponseFor404
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor404ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor404ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### list_messages_api_v1_app_app_id_msg_get.ApiResponseFor409
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor409ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor409ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### list_messages_api_v1_app_app_id_msg_get.ApiResponseFor422
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor422ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor422ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HTTPValidationError**](../../models/HTTPValidationError.md) |  | 


#### list_messages_api_v1_app_app_id_msg_get.ApiResponseFor429
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

