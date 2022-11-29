<a name="__pageTop"></a>
# apitest.apis.tags.message_attempt_api.MessageAttemptApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_attempt_api_v1_app_app_id_msg_msg_id_attempt_attempt_id_get**](#get_attempt_api_v1_app_app_id_msg_msg_id_attempt_attempt_id_get) | **get** /api/v1/app/{app_id}/msg/{msg_id}/attempt/{attempt_id}/ | Get Attempt
[**list_attempted_destinations_api_v1_app_app_id_msg_msg_id_endpoint_get**](#list_attempted_destinations_api_v1_app_app_id_msg_msg_id_endpoint_get) | **get** /api/v1/app/{app_id}/msg/{msg_id}/endpoint/ | List Attempted Destinations
[**list_attempted_messages_api_v1_app_app_id_endpoint_endpoint_id_msg_get**](#list_attempted_messages_api_v1_app_app_id_endpoint_endpoint_id_msg_get) | **get** /api/v1/app/{app_id}/endpoint/{endpoint_id}/msg/ | List Attempted Messages
[**list_attempts_api_v1_app_app_id_msg_msg_id_attempt_get**](#list_attempts_api_v1_app_app_id_msg_msg_id_attempt_get) | **get** /api/v1/app/{app_id}/msg/{msg_id}/attempt/ | List Attempts
[**list_attempts_by_endpoint_api_v1_app_app_id_attempt_endpoint_endpoint_id_get**](#list_attempts_by_endpoint_api_v1_app_app_id_attempt_endpoint_endpoint_id_get) | **get** /api/v1/app/{app_id}/attempt/endpoint/{endpoint_id}/ | List Attempts By Endpoint
[**list_attempts_by_msg_api_v1_app_app_id_attempt_msg_msg_id_get**](#list_attempts_by_msg_api_v1_app_app_id_attempt_msg_msg_id_get) | **get** /api/v1/app/{app_id}/attempt/msg/{msg_id}/ | List Attempts By Msg
[**list_attempts_for_endpoint_api_v1_app_app_id_msg_msg_id_endpoint_endpoint_id_attempt_get**](#list_attempts_for_endpoint_api_v1_app_app_id_msg_msg_id_endpoint_endpoint_id_attempt_get) | **get** /api/v1/app/{app_id}/msg/{msg_id}/endpoint/{endpoint_id}/attempt/ | List Attempts For Endpoint
[**resend_webhook_api_v1_app_app_id_msg_msg_id_endpoint_endpoint_id_resend_post**](#resend_webhook_api_v1_app_app_id_msg_msg_id_endpoint_endpoint_id_resend_post) | **post** /api/v1/app/{app_id}/msg/{msg_id}/endpoint/{endpoint_id}/resend/ | Resend Webhook

# **get_attempt_api_v1_app_app_id_msg_msg_id_attempt_attempt_id_get**
<a name="get_attempt_api_v1_app_app_id_msg_msg_id_attempt_attempt_id_get"></a>
> MessageAttemptOut get_attempt_api_v1_app_app_id_msg_msg_id_attempt_attempt_id_get(attempt_idmsg_idapp_id)

Get Attempt

`msg_id`: Use a message id or a message `eventId`

### Example

* Bearer Authentication (HTTPBearer):
```python
import apitest
from apitest.apis.tags import message_attempt_api
from apitest.model.http_error_out import HttpErrorOut
from apitest.model.message_attempt_out import MessageAttemptOut
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
    api_instance = message_attempt_api.MessageAttemptApi(api_client)

    # example passing only required values which don't have defaults set
    path_params = {
        'attempt_id': "atmpt_1srOrx2ZWZBpBUvZwXKQmoEYga2",
        'msg_id': "msg_1srOrx2ZWZBpBUvZwXKQmoEYga2",
        'app_id': "app_1srOrx2ZWZBpBUvZwXKQmoEYga2",
    }
    header_params = {
    }
    try:
        # Get Attempt
        api_response = api_instance.get_attempt_api_v1_app_app_id_msg_msg_id_attempt_attempt_id_get(
            path_params=path_params,
            header_params=header_params,
        )
        pprint(api_response)
    except apitest.ApiException as e:
        print("Exception when calling MessageAttemptApi->get_attempt_api_v1_app_app_id_msg_msg_id_attempt_attempt_id_get: %s\n" % e)

    # example passing only optional values
    path_params = {
        'attempt_id': "atmpt_1srOrx2ZWZBpBUvZwXKQmoEYga2",
        'msg_id': "msg_1srOrx2ZWZBpBUvZwXKQmoEYga2",
        'app_id': "app_1srOrx2ZWZBpBUvZwXKQmoEYga2",
    }
    header_params = {
        'idempotency-key': "idempotency-key_example",
    }
    try:
        # Get Attempt
        api_response = api_instance.get_attempt_api_v1_app_app_id_msg_msg_id_attempt_attempt_id_get(
            path_params=path_params,
            header_params=header_params,
        )
        pprint(api_response)
    except apitest.ApiException as e:
        print("Exception when calling MessageAttemptApi->get_attempt_api_v1_app_app_id_msg_msg_id_attempt_attempt_id_get: %s\n" % e)
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
attempt_id | AttemptIdSchema | | 
msg_id | MsgIdSchema | | 
app_id | AppIdSchema | | 

# AttemptIdSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

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
200 | [ApiResponseFor200](#get_attempt_api_v1_app_app_id_msg_msg_id_attempt_attempt_id_get.ApiResponseFor200) | Successful Response
401 | [ApiResponseFor401](#get_attempt_api_v1_app_app_id_msg_msg_id_attempt_attempt_id_get.ApiResponseFor401) | Unauthorized
403 | [ApiResponseFor403](#get_attempt_api_v1_app_app_id_msg_msg_id_attempt_attempt_id_get.ApiResponseFor403) | Forbidden
404 | [ApiResponseFor404](#get_attempt_api_v1_app_app_id_msg_msg_id_attempt_attempt_id_get.ApiResponseFor404) | Not Found
409 | [ApiResponseFor409](#get_attempt_api_v1_app_app_id_msg_msg_id_attempt_attempt_id_get.ApiResponseFor409) | Conflict
422 | [ApiResponseFor422](#get_attempt_api_v1_app_app_id_msg_msg_id_attempt_attempt_id_get.ApiResponseFor422) | Validation Error
429 | [ApiResponseFor429](#get_attempt_api_v1_app_app_id_msg_msg_id_attempt_attempt_id_get.ApiResponseFor429) | Too Many Requests

#### get_attempt_api_v1_app_app_id_msg_msg_id_attempt_attempt_id_get.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**MessageAttemptOut**](../../models/MessageAttemptOut.md) |  | 


#### get_attempt_api_v1_app_app_id_msg_msg_id_attempt_attempt_id_get.ApiResponseFor401
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor401ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor401ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### get_attempt_api_v1_app_app_id_msg_msg_id_attempt_attempt_id_get.ApiResponseFor403
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor403ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor403ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### get_attempt_api_v1_app_app_id_msg_msg_id_attempt_attempt_id_get.ApiResponseFor404
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor404ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor404ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### get_attempt_api_v1_app_app_id_msg_msg_id_attempt_attempt_id_get.ApiResponseFor409
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor409ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor409ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### get_attempt_api_v1_app_app_id_msg_msg_id_attempt_attempt_id_get.ApiResponseFor422
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor422ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor422ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HTTPValidationError**](../../models/HTTPValidationError.md) |  | 


#### get_attempt_api_v1_app_app_id_msg_msg_id_attempt_attempt_id_get.ApiResponseFor429
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

# **list_attempted_destinations_api_v1_app_app_id_msg_msg_id_endpoint_get**
<a name="list_attempted_destinations_api_v1_app_app_id_msg_msg_id_endpoint_get"></a>
> ListResponseMessageEndpointOut list_attempted_destinations_api_v1_app_app_id_msg_msg_id_endpoint_get(msg_idapp_id)

List Attempted Destinations

`msg_id`: Use a message id or a message `eventId`

### Example

* Bearer Authentication (HTTPBearer):
```python
import apitest
from apitest.apis.tags import message_attempt_api
from apitest.model.list_response_message_endpoint_out import ListResponseMessageEndpointOut
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
    api_instance = message_attempt_api.MessageAttemptApi(api_client)

    # example passing only required values which don't have defaults set
    path_params = {
        'msg_id': "msg_1srOrx2ZWZBpBUvZwXKQmoEYga2",
        'app_id': "app_1srOrx2ZWZBpBUvZwXKQmoEYga2",
    }
    query_params = {
    }
    header_params = {
    }
    try:
        # List Attempted Destinations
        api_response = api_instance.list_attempted_destinations_api_v1_app_app_id_msg_msg_id_endpoint_get(
            path_params=path_params,
            query_params=query_params,
            header_params=header_params,
        )
        pprint(api_response)
    except apitest.ApiException as e:
        print("Exception when calling MessageAttemptApi->list_attempted_destinations_api_v1_app_app_id_msg_msg_id_endpoint_get: %s\n" % e)

    # example passing only optional values
    path_params = {
        'msg_id': "msg_1srOrx2ZWZBpBUvZwXKQmoEYga2",
        'app_id': "app_1srOrx2ZWZBpBUvZwXKQmoEYga2",
    }
    query_params = {
        'iterator': "msgep_1srOrx2ZWZBpBUvZwXKQmoEYga2",
        'limit': 50,
    }
    header_params = {
        'idempotency-key': "idempotency-key_example",
    }
    try:
        # List Attempted Destinations
        api_response = api_instance.list_attempted_destinations_api_v1_app_app_id_msg_msg_id_endpoint_get(
            path_params=path_params,
            query_params=query_params,
            header_params=header_params,
        )
        pprint(api_response)
    except apitest.ApiException as e:
        print("Exception when calling MessageAttemptApi->list_attempted_destinations_api_v1_app_app_id_msg_msg_id_endpoint_get: %s\n" % e)
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
200 | [ApiResponseFor200](#list_attempted_destinations_api_v1_app_app_id_msg_msg_id_endpoint_get.ApiResponseFor200) | Successful Response
401 | [ApiResponseFor401](#list_attempted_destinations_api_v1_app_app_id_msg_msg_id_endpoint_get.ApiResponseFor401) | Unauthorized
403 | [ApiResponseFor403](#list_attempted_destinations_api_v1_app_app_id_msg_msg_id_endpoint_get.ApiResponseFor403) | Forbidden
404 | [ApiResponseFor404](#list_attempted_destinations_api_v1_app_app_id_msg_msg_id_endpoint_get.ApiResponseFor404) | Not Found
409 | [ApiResponseFor409](#list_attempted_destinations_api_v1_app_app_id_msg_msg_id_endpoint_get.ApiResponseFor409) | Conflict
422 | [ApiResponseFor422](#list_attempted_destinations_api_v1_app_app_id_msg_msg_id_endpoint_get.ApiResponseFor422) | Validation Error
429 | [ApiResponseFor429](#list_attempted_destinations_api_v1_app_app_id_msg_msg_id_endpoint_get.ApiResponseFor429) | Too Many Requests

#### list_attempted_destinations_api_v1_app_app_id_msg_msg_id_endpoint_get.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**ListResponseMessageEndpointOut**](../../models/ListResponseMessageEndpointOut.md) |  | 


#### list_attempted_destinations_api_v1_app_app_id_msg_msg_id_endpoint_get.ApiResponseFor401
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor401ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor401ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### list_attempted_destinations_api_v1_app_app_id_msg_msg_id_endpoint_get.ApiResponseFor403
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor403ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor403ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### list_attempted_destinations_api_v1_app_app_id_msg_msg_id_endpoint_get.ApiResponseFor404
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor404ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor404ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### list_attempted_destinations_api_v1_app_app_id_msg_msg_id_endpoint_get.ApiResponseFor409
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor409ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor409ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### list_attempted_destinations_api_v1_app_app_id_msg_msg_id_endpoint_get.ApiResponseFor422
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor422ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor422ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HTTPValidationError**](../../models/HTTPValidationError.md) |  | 


#### list_attempted_destinations_api_v1_app_app_id_msg_msg_id_endpoint_get.ApiResponseFor429
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

# **list_attempted_messages_api_v1_app_app_id_endpoint_endpoint_id_msg_get**
<a name="list_attempted_messages_api_v1_app_app_id_endpoint_endpoint_id_msg_get"></a>
> ListResponseEndpointMessageOut list_attempted_messages_api_v1_app_app_id_endpoint_endpoint_id_msg_get(endpoint_idapp_id)

List Attempted Messages

List messages for a particular endpoint. Additionally includes metadata about the latest message attempt.  The `before` parameter lets you filter all items created before a certain date and is ignored if an iterator is passed.

### Example

* Bearer Authentication (HTTPBearer):
```python
import apitest
from apitest.apis.tags import message_attempt_api
from apitest.model.list_response_endpoint_message_out import ListResponseEndpointMessageOut
from apitest.model.message_status import MessageStatus
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
    api_instance = message_attempt_api.MessageAttemptApi(api_client)

    # example passing only required values which don't have defaults set
    path_params = {
        'endpoint_id': "ep_1srOrx2ZWZBpBUvZwXKQmoEYga2",
        'app_id': "app_1srOrx2ZWZBpBUvZwXKQmoEYga2",
    }
    query_params = {
    }
    header_params = {
    }
    try:
        # List Attempted Messages
        api_response = api_instance.list_attempted_messages_api_v1_app_app_id_endpoint_endpoint_id_msg_get(
            path_params=path_params,
            query_params=query_params,
            header_params=header_params,
        )
        pprint(api_response)
    except apitest.ApiException as e:
        print("Exception when calling MessageAttemptApi->list_attempted_messages_api_v1_app_app_id_endpoint_endpoint_id_msg_get: %s\n" % e)

    # example passing only optional values
    path_params = {
        'endpoint_id': "ep_1srOrx2ZWZBpBUvZwXKQmoEYga2",
        'app_id': "app_1srOrx2ZWZBpBUvZwXKQmoEYga2",
    }
    query_params = {
        'iterator': "msg_1srOrx2ZWZBpBUvZwXKQmoEYga2",
        'limit': 50,
        'channel': "project_1337",
        'status': MessageStatus(0),
        'before': "1970-01-01T00:00:00.00Z",
        'after': "1970-01-01T00:00:00.00Z",
    }
    header_params = {
        'idempotency-key': "idempotency-key_example",
    }
    try:
        # List Attempted Messages
        api_response = api_instance.list_attempted_messages_api_v1_app_app_id_endpoint_endpoint_id_msg_get(
            path_params=path_params,
            query_params=query_params,
            header_params=header_params,
        )
        pprint(api_response)
    except apitest.ApiException as e:
        print("Exception when calling MessageAttemptApi->list_attempted_messages_api_v1_app_app_id_endpoint_endpoint_id_msg_get: %s\n" % e)
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
channel | ChannelSchema | | optional
status | StatusSchema | | optional
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

# ChannelSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
None, str,  | NoneClass, str,  |  | 

# StatusSchema
Type | Description  | Notes
------------- | ------------- | -------------
[**MessageStatus**](../../models/MessageStatus.md) |  | 


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
200 | [ApiResponseFor200](#list_attempted_messages_api_v1_app_app_id_endpoint_endpoint_id_msg_get.ApiResponseFor200) | Successful Response
401 | [ApiResponseFor401](#list_attempted_messages_api_v1_app_app_id_endpoint_endpoint_id_msg_get.ApiResponseFor401) | Unauthorized
403 | [ApiResponseFor403](#list_attempted_messages_api_v1_app_app_id_endpoint_endpoint_id_msg_get.ApiResponseFor403) | Forbidden
404 | [ApiResponseFor404](#list_attempted_messages_api_v1_app_app_id_endpoint_endpoint_id_msg_get.ApiResponseFor404) | Not Found
409 | [ApiResponseFor409](#list_attempted_messages_api_v1_app_app_id_endpoint_endpoint_id_msg_get.ApiResponseFor409) | Conflict
422 | [ApiResponseFor422](#list_attempted_messages_api_v1_app_app_id_endpoint_endpoint_id_msg_get.ApiResponseFor422) | Validation Error
429 | [ApiResponseFor429](#list_attempted_messages_api_v1_app_app_id_endpoint_endpoint_id_msg_get.ApiResponseFor429) | Too Many Requests

#### list_attempted_messages_api_v1_app_app_id_endpoint_endpoint_id_msg_get.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**ListResponseEndpointMessageOut**](../../models/ListResponseEndpointMessageOut.md) |  | 


#### list_attempted_messages_api_v1_app_app_id_endpoint_endpoint_id_msg_get.ApiResponseFor401
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor401ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor401ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### list_attempted_messages_api_v1_app_app_id_endpoint_endpoint_id_msg_get.ApiResponseFor403
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor403ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor403ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### list_attempted_messages_api_v1_app_app_id_endpoint_endpoint_id_msg_get.ApiResponseFor404
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor404ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor404ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### list_attempted_messages_api_v1_app_app_id_endpoint_endpoint_id_msg_get.ApiResponseFor409
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor409ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor409ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### list_attempted_messages_api_v1_app_app_id_endpoint_endpoint_id_msg_get.ApiResponseFor422
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor422ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor422ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HTTPValidationError**](../../models/HTTPValidationError.md) |  | 


#### list_attempted_messages_api_v1_app_app_id_endpoint_endpoint_id_msg_get.ApiResponseFor429
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

# **list_attempts_api_v1_app_app_id_msg_msg_id_attempt_get**
<a name="list_attempts_api_v1_app_app_id_msg_msg_id_attempt_get"></a>
> ListResponseMessageAttemptOut list_attempts_api_v1_app_app_id_msg_msg_id_attempt_get(app_idmsg_id)

List Attempts

Deprecated: Please use \"List Attempts by Endpoint\" and \"List Attempts by Msg\" instead.  `msg_id`: Use a message id or a message `eventId`

### Example

* Bearer Authentication (HTTPBearer):
```python
import apitest
from apitest.apis.tags import message_attempt_api
from apitest.model.list_response_message_attempt_out import ListResponseMessageAttemptOut
from apitest.model.message_status import MessageStatus
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
    api_instance = message_attempt_api.MessageAttemptApi(api_client)

    # example passing only required values which don't have defaults set
    path_params = {
        'app_id': "app_1srOrx2ZWZBpBUvZwXKQmoEYga2",
        'msg_id': "msg_1srOrx2ZWZBpBUvZwXKQmoEYga2",
    }
    query_params = {
    }
    header_params = {
    }
    try:
        # List Attempts
        api_response = api_instance.list_attempts_api_v1_app_app_id_msg_msg_id_attempt_get(
            path_params=path_params,
            query_params=query_params,
            header_params=header_params,
        )
        pprint(api_response)
    except apitest.ApiException as e:
        print("Exception when calling MessageAttemptApi->list_attempts_api_v1_app_app_id_msg_msg_id_attempt_get: %s\n" % e)

    # example passing only optional values
    path_params = {
        'app_id': "app_1srOrx2ZWZBpBUvZwXKQmoEYga2",
        'msg_id': "msg_1srOrx2ZWZBpBUvZwXKQmoEYga2",
    }
    query_params = {
        'iterator': "atmpt_1srOrx2ZWZBpBUvZwXKQmoEYga2",
        'limit': 50,
        'endpoint_id': "ep_1srOrx2ZWZBpBUvZwXKQmoEYga2",
        'event_types': [
        "user.signup"
    ],
        'channel': "project_1337",
        'status': MessageStatus(0),
        'before': "1970-01-01T00:00:00.00Z",
        'after': "1970-01-01T00:00:00.00Z",
    }
    header_params = {
        'idempotency-key': "idempotency-key_example",
    }
    try:
        # List Attempts
        api_response = api_instance.list_attempts_api_v1_app_app_id_msg_msg_id_attempt_get(
            path_params=path_params,
            query_params=query_params,
            header_params=header_params,
        )
        pprint(api_response)
    except apitest.ApiException as e:
        print("Exception when calling MessageAttemptApi->list_attempts_api_v1_app_app_id_msg_msg_id_attempt_get: %s\n" % e)
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
endpoint_id | EndpointIdSchema | | optional
event_types | EventTypesSchema | | optional
channel | ChannelSchema | | optional
status | StatusSchema | | optional
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

# EndpointIdSchema

The endpoint's ID or UID

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
None, str,  | NoneClass, str,  | The endpoint&#x27;s ID or UID | 

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

# StatusSchema
Type | Description  | Notes
------------- | ------------- | -------------
[**MessageStatus**](../../models/MessageStatus.md) |  | 


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
msg_id | MsgIdSchema | | 

# AppIdSchema

The application's ID or UID

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  | The application&#x27;s ID or UID | 

# MsgIdSchema

The message's ID or eventID

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  | The message&#x27;s ID or eventID | 

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#list_attempts_api_v1_app_app_id_msg_msg_id_attempt_get.ApiResponseFor200) | Successful Response
401 | [ApiResponseFor401](#list_attempts_api_v1_app_app_id_msg_msg_id_attempt_get.ApiResponseFor401) | Unauthorized
403 | [ApiResponseFor403](#list_attempts_api_v1_app_app_id_msg_msg_id_attempt_get.ApiResponseFor403) | Forbidden
404 | [ApiResponseFor404](#list_attempts_api_v1_app_app_id_msg_msg_id_attempt_get.ApiResponseFor404) | Not Found
409 | [ApiResponseFor409](#list_attempts_api_v1_app_app_id_msg_msg_id_attempt_get.ApiResponseFor409) | Conflict
422 | [ApiResponseFor422](#list_attempts_api_v1_app_app_id_msg_msg_id_attempt_get.ApiResponseFor422) | Validation Error
429 | [ApiResponseFor429](#list_attempts_api_v1_app_app_id_msg_msg_id_attempt_get.ApiResponseFor429) | Too Many Requests

#### list_attempts_api_v1_app_app_id_msg_msg_id_attempt_get.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**ListResponseMessageAttemptOut**](../../models/ListResponseMessageAttemptOut.md) |  | 


#### list_attempts_api_v1_app_app_id_msg_msg_id_attempt_get.ApiResponseFor401
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor401ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor401ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### list_attempts_api_v1_app_app_id_msg_msg_id_attempt_get.ApiResponseFor403
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor403ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor403ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### list_attempts_api_v1_app_app_id_msg_msg_id_attempt_get.ApiResponseFor404
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor404ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor404ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### list_attempts_api_v1_app_app_id_msg_msg_id_attempt_get.ApiResponseFor409
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor409ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor409ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### list_attempts_api_v1_app_app_id_msg_msg_id_attempt_get.ApiResponseFor422
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor422ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor422ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HTTPValidationError**](../../models/HTTPValidationError.md) |  | 


#### list_attempts_api_v1_app_app_id_msg_msg_id_attempt_get.ApiResponseFor429
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

# **list_attempts_by_endpoint_api_v1_app_app_id_attempt_endpoint_endpoint_id_get**
<a name="list_attempts_by_endpoint_api_v1_app_app_id_attempt_endpoint_endpoint_id_get"></a>
> ListResponseMessageAttemptOut list_attempts_by_endpoint_api_v1_app_app_id_attempt_endpoint_endpoint_id_get(app_idendpoint_id)

List Attempts By Endpoint

List attempts by endpoint id

### Example

* Bearer Authentication (HTTPBearer):
```python
import apitest
from apitest.apis.tags import message_attempt_api
from apitest.model.list_response_message_attempt_out import ListResponseMessageAttemptOut
from apitest.model.message_status import MessageStatus
from apitest.model.status_code_class import StatusCodeClass
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
    api_instance = message_attempt_api.MessageAttemptApi(api_client)

    # example passing only required values which don't have defaults set
    path_params = {
        'app_id': "app_1srOrx2ZWZBpBUvZwXKQmoEYga2",
        'endpoint_id': "ep_1srOrx2ZWZBpBUvZwXKQmoEYga2",
    }
    query_params = {
    }
    header_params = {
    }
    try:
        # List Attempts By Endpoint
        api_response = api_instance.list_attempts_by_endpoint_api_v1_app_app_id_attempt_endpoint_endpoint_id_get(
            path_params=path_params,
            query_params=query_params,
            header_params=header_params,
        )
        pprint(api_response)
    except apitest.ApiException as e:
        print("Exception when calling MessageAttemptApi->list_attempts_by_endpoint_api_v1_app_app_id_attempt_endpoint_endpoint_id_get: %s\n" % e)

    # example passing only optional values
    path_params = {
        'app_id': "app_1srOrx2ZWZBpBUvZwXKQmoEYga2",
        'endpoint_id': "ep_1srOrx2ZWZBpBUvZwXKQmoEYga2",
    }
    query_params = {
        'iterator': "atmpt_1srOrx2ZWZBpBUvZwXKQmoEYga2",
        'limit': 50,
        'status': MessageStatus(0),
        'status_code_class': StatusCodeClass(0),
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
        # List Attempts By Endpoint
        api_response = api_instance.list_attempts_by_endpoint_api_v1_app_app_id_attempt_endpoint_endpoint_id_get(
            path_params=path_params,
            query_params=query_params,
            header_params=header_params,
        )
        pprint(api_response)
    except apitest.ApiException as e:
        print("Exception when calling MessageAttemptApi->list_attempts_by_endpoint_api_v1_app_app_id_attempt_endpoint_endpoint_id_get: %s\n" % e)
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
status | StatusSchema | | optional
status_code_class | StatusCodeClassSchema | | optional
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

# StatusSchema
Type | Description  | Notes
------------- | ------------- | -------------
[**MessageStatus**](../../models/MessageStatus.md) |  | 


# StatusCodeClassSchema
Type | Description  | Notes
------------- | ------------- | -------------
[**StatusCodeClass**](../../models/StatusCodeClass.md) |  | 


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
200 | [ApiResponseFor200](#list_attempts_by_endpoint_api_v1_app_app_id_attempt_endpoint_endpoint_id_get.ApiResponseFor200) | Successful Response
401 | [ApiResponseFor401](#list_attempts_by_endpoint_api_v1_app_app_id_attempt_endpoint_endpoint_id_get.ApiResponseFor401) | Unauthorized
403 | [ApiResponseFor403](#list_attempts_by_endpoint_api_v1_app_app_id_attempt_endpoint_endpoint_id_get.ApiResponseFor403) | Forbidden
404 | [ApiResponseFor404](#list_attempts_by_endpoint_api_v1_app_app_id_attempt_endpoint_endpoint_id_get.ApiResponseFor404) | Not Found
409 | [ApiResponseFor409](#list_attempts_by_endpoint_api_v1_app_app_id_attempt_endpoint_endpoint_id_get.ApiResponseFor409) | Conflict
422 | [ApiResponseFor422](#list_attempts_by_endpoint_api_v1_app_app_id_attempt_endpoint_endpoint_id_get.ApiResponseFor422) | Validation Error
429 | [ApiResponseFor429](#list_attempts_by_endpoint_api_v1_app_app_id_attempt_endpoint_endpoint_id_get.ApiResponseFor429) | Too Many Requests

#### list_attempts_by_endpoint_api_v1_app_app_id_attempt_endpoint_endpoint_id_get.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**ListResponseMessageAttemptOut**](../../models/ListResponseMessageAttemptOut.md) |  | 


#### list_attempts_by_endpoint_api_v1_app_app_id_attempt_endpoint_endpoint_id_get.ApiResponseFor401
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor401ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor401ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### list_attempts_by_endpoint_api_v1_app_app_id_attempt_endpoint_endpoint_id_get.ApiResponseFor403
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor403ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor403ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### list_attempts_by_endpoint_api_v1_app_app_id_attempt_endpoint_endpoint_id_get.ApiResponseFor404
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor404ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor404ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### list_attempts_by_endpoint_api_v1_app_app_id_attempt_endpoint_endpoint_id_get.ApiResponseFor409
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor409ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor409ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### list_attempts_by_endpoint_api_v1_app_app_id_attempt_endpoint_endpoint_id_get.ApiResponseFor422
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor422ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor422ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HTTPValidationError**](../../models/HTTPValidationError.md) |  | 


#### list_attempts_by_endpoint_api_v1_app_app_id_attempt_endpoint_endpoint_id_get.ApiResponseFor429
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

# **list_attempts_by_msg_api_v1_app_app_id_attempt_msg_msg_id_get**
<a name="list_attempts_by_msg_api_v1_app_app_id_attempt_msg_msg_id_get"></a>
> ListResponseMessageAttemptOut list_attempts_by_msg_api_v1_app_app_id_attempt_msg_msg_id_get(app_idmsg_id)

List Attempts By Msg

List attempts by message id

### Example

* Bearer Authentication (HTTPBearer):
```python
import apitest
from apitest.apis.tags import message_attempt_api
from apitest.model.list_response_message_attempt_out import ListResponseMessageAttemptOut
from apitest.model.message_status import MessageStatus
from apitest.model.status_code_class import StatusCodeClass
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
    api_instance = message_attempt_api.MessageAttemptApi(api_client)

    # example passing only required values which don't have defaults set
    path_params = {
        'app_id': "app_1srOrx2ZWZBpBUvZwXKQmoEYga2",
        'msg_id': "msg_1srOrx2ZWZBpBUvZwXKQmoEYga2",
    }
    query_params = {
    }
    header_params = {
    }
    try:
        # List Attempts By Msg
        api_response = api_instance.list_attempts_by_msg_api_v1_app_app_id_attempt_msg_msg_id_get(
            path_params=path_params,
            query_params=query_params,
            header_params=header_params,
        )
        pprint(api_response)
    except apitest.ApiException as e:
        print("Exception when calling MessageAttemptApi->list_attempts_by_msg_api_v1_app_app_id_attempt_msg_msg_id_get: %s\n" % e)

    # example passing only optional values
    path_params = {
        'app_id': "app_1srOrx2ZWZBpBUvZwXKQmoEYga2",
        'msg_id': "msg_1srOrx2ZWZBpBUvZwXKQmoEYga2",
    }
    query_params = {
        'endpoint_id': "ep_1srOrx2ZWZBpBUvZwXKQmoEYga2",
        'iterator': "atmpt_1srOrx2ZWZBpBUvZwXKQmoEYga2",
        'limit': 50,
        'status': MessageStatus(0),
        'status_code_class': StatusCodeClass(0),
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
        # List Attempts By Msg
        api_response = api_instance.list_attempts_by_msg_api_v1_app_app_id_attempt_msg_msg_id_get(
            path_params=path_params,
            query_params=query_params,
            header_params=header_params,
        )
        pprint(api_response)
    except apitest.ApiException as e:
        print("Exception when calling MessageAttemptApi->list_attempts_by_msg_api_v1_app_app_id_attempt_msg_msg_id_get: %s\n" % e)
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
endpoint_id | EndpointIdSchema | | optional
iterator | IteratorSchema | | optional
limit | LimitSchema | | optional
status | StatusSchema | | optional
status_code_class | StatusCodeClassSchema | | optional
event_types | EventTypesSchema | | optional
channel | ChannelSchema | | optional
before | BeforeSchema | | optional
after | AfterSchema | | optional


# EndpointIdSchema

The endpoint's ID or UID

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
None, str,  | NoneClass, str,  | The endpoint&#x27;s ID or UID | 

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

# StatusSchema
Type | Description  | Notes
------------- | ------------- | -------------
[**MessageStatus**](../../models/MessageStatus.md) |  | 


# StatusCodeClassSchema
Type | Description  | Notes
------------- | ------------- | -------------
[**StatusCodeClass**](../../models/StatusCodeClass.md) |  | 


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
msg_id | MsgIdSchema | | 

# AppIdSchema

The application's ID or UID

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  | The application&#x27;s ID or UID | 

# MsgIdSchema

The message's ID or eventID

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  | The message&#x27;s ID or eventID | 

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#list_attempts_by_msg_api_v1_app_app_id_attempt_msg_msg_id_get.ApiResponseFor200) | Successful Response
401 | [ApiResponseFor401](#list_attempts_by_msg_api_v1_app_app_id_attempt_msg_msg_id_get.ApiResponseFor401) | Unauthorized
403 | [ApiResponseFor403](#list_attempts_by_msg_api_v1_app_app_id_attempt_msg_msg_id_get.ApiResponseFor403) | Forbidden
404 | [ApiResponseFor404](#list_attempts_by_msg_api_v1_app_app_id_attempt_msg_msg_id_get.ApiResponseFor404) | Not Found
409 | [ApiResponseFor409](#list_attempts_by_msg_api_v1_app_app_id_attempt_msg_msg_id_get.ApiResponseFor409) | Conflict
422 | [ApiResponseFor422](#list_attempts_by_msg_api_v1_app_app_id_attempt_msg_msg_id_get.ApiResponseFor422) | Validation Error
429 | [ApiResponseFor429](#list_attempts_by_msg_api_v1_app_app_id_attempt_msg_msg_id_get.ApiResponseFor429) | Too Many Requests

#### list_attempts_by_msg_api_v1_app_app_id_attempt_msg_msg_id_get.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**ListResponseMessageAttemptOut**](../../models/ListResponseMessageAttemptOut.md) |  | 


#### list_attempts_by_msg_api_v1_app_app_id_attempt_msg_msg_id_get.ApiResponseFor401
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor401ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor401ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### list_attempts_by_msg_api_v1_app_app_id_attempt_msg_msg_id_get.ApiResponseFor403
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor403ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor403ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### list_attempts_by_msg_api_v1_app_app_id_attempt_msg_msg_id_get.ApiResponseFor404
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor404ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor404ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### list_attempts_by_msg_api_v1_app_app_id_attempt_msg_msg_id_get.ApiResponseFor409
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor409ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor409ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### list_attempts_by_msg_api_v1_app_app_id_attempt_msg_msg_id_get.ApiResponseFor422
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor422ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor422ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HTTPValidationError**](../../models/HTTPValidationError.md) |  | 


#### list_attempts_by_msg_api_v1_app_app_id_attempt_msg_msg_id_get.ApiResponseFor429
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

# **list_attempts_for_endpoint_api_v1_app_app_id_msg_msg_id_endpoint_endpoint_id_attempt_get**
<a name="list_attempts_for_endpoint_api_v1_app_app_id_msg_msg_id_endpoint_endpoint_id_attempt_get"></a>
> ListResponseMessageAttemptEndpointOut list_attempts_for_endpoint_api_v1_app_app_id_msg_msg_id_endpoint_endpoint_id_attempt_get(msg_idapp_idendpoint_id)

List Attempts For Endpoint

DEPRECATED: please use list_attempts with endpoint_id as a query parameter instead.  List the message attempts for a particular endpoint.  Returning the endpoint.  The `before` parameter lets you filter all items created before a certain date and is ignored if an iterator is passed.

### Example

* Bearer Authentication (HTTPBearer):
```python
import apitest
from apitest.apis.tags import message_attempt_api
from apitest.model.list_response_message_attempt_endpoint_out import ListResponseMessageAttemptEndpointOut
from apitest.model.message_status import MessageStatus
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
    api_instance = message_attempt_api.MessageAttemptApi(api_client)

    # example passing only required values which don't have defaults set
    path_params = {
        'msg_id': "msg_1srOrx2ZWZBpBUvZwXKQmoEYga2",
        'app_id': "app_1srOrx2ZWZBpBUvZwXKQmoEYga2",
        'endpoint_id': "ep_1srOrx2ZWZBpBUvZwXKQmoEYga2",
    }
    query_params = {
    }
    header_params = {
    }
    try:
        # List Attempts For Endpoint
        api_response = api_instance.list_attempts_for_endpoint_api_v1_app_app_id_msg_msg_id_endpoint_endpoint_id_attempt_get(
            path_params=path_params,
            query_params=query_params,
            header_params=header_params,
        )
        pprint(api_response)
    except apitest.ApiException as e:
        print("Exception when calling MessageAttemptApi->list_attempts_for_endpoint_api_v1_app_app_id_msg_msg_id_endpoint_endpoint_id_attempt_get: %s\n" % e)

    # example passing only optional values
    path_params = {
        'msg_id': "msg_1srOrx2ZWZBpBUvZwXKQmoEYga2",
        'app_id': "app_1srOrx2ZWZBpBUvZwXKQmoEYga2",
        'endpoint_id': "ep_1srOrx2ZWZBpBUvZwXKQmoEYga2",
    }
    query_params = {
        'iterator': "atmpt_1srOrx2ZWZBpBUvZwXKQmoEYga2",
        'limit': 50,
        'event_types': [
        "user.signup"
    ],
        'channel': "project_1337",
        'status': MessageStatus(0),
        'before': "1970-01-01T00:00:00.00Z",
        'after': "1970-01-01T00:00:00.00Z",
    }
    header_params = {
        'idempotency-key': "idempotency-key_example",
    }
    try:
        # List Attempts For Endpoint
        api_response = api_instance.list_attempts_for_endpoint_api_v1_app_app_id_msg_msg_id_endpoint_endpoint_id_attempt_get(
            path_params=path_params,
            query_params=query_params,
            header_params=header_params,
        )
        pprint(api_response)
    except apitest.ApiException as e:
        print("Exception when calling MessageAttemptApi->list_attempts_for_endpoint_api_v1_app_app_id_msg_msg_id_endpoint_endpoint_id_attempt_get: %s\n" % e)
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
status | StatusSchema | | optional
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

# StatusSchema
Type | Description  | Notes
------------- | ------------- | -------------
[**MessageStatus**](../../models/MessageStatus.md) |  | 


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
msg_id | MsgIdSchema | | 
app_id | AppIdSchema | | 
endpoint_id | EndpointIdSchema | | 

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
200 | [ApiResponseFor200](#list_attempts_for_endpoint_api_v1_app_app_id_msg_msg_id_endpoint_endpoint_id_attempt_get.ApiResponseFor200) | Successful Response
401 | [ApiResponseFor401](#list_attempts_for_endpoint_api_v1_app_app_id_msg_msg_id_endpoint_endpoint_id_attempt_get.ApiResponseFor401) | Unauthorized
403 | [ApiResponseFor403](#list_attempts_for_endpoint_api_v1_app_app_id_msg_msg_id_endpoint_endpoint_id_attempt_get.ApiResponseFor403) | Forbidden
404 | [ApiResponseFor404](#list_attempts_for_endpoint_api_v1_app_app_id_msg_msg_id_endpoint_endpoint_id_attempt_get.ApiResponseFor404) | Not Found
409 | [ApiResponseFor409](#list_attempts_for_endpoint_api_v1_app_app_id_msg_msg_id_endpoint_endpoint_id_attempt_get.ApiResponseFor409) | Conflict
422 | [ApiResponseFor422](#list_attempts_for_endpoint_api_v1_app_app_id_msg_msg_id_endpoint_endpoint_id_attempt_get.ApiResponseFor422) | Validation Error
429 | [ApiResponseFor429](#list_attempts_for_endpoint_api_v1_app_app_id_msg_msg_id_endpoint_endpoint_id_attempt_get.ApiResponseFor429) | Too Many Requests

#### list_attempts_for_endpoint_api_v1_app_app_id_msg_msg_id_endpoint_endpoint_id_attempt_get.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**ListResponseMessageAttemptEndpointOut**](../../models/ListResponseMessageAttemptEndpointOut.md) |  | 


#### list_attempts_for_endpoint_api_v1_app_app_id_msg_msg_id_endpoint_endpoint_id_attempt_get.ApiResponseFor401
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor401ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor401ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### list_attempts_for_endpoint_api_v1_app_app_id_msg_msg_id_endpoint_endpoint_id_attempt_get.ApiResponseFor403
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor403ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor403ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### list_attempts_for_endpoint_api_v1_app_app_id_msg_msg_id_endpoint_endpoint_id_attempt_get.ApiResponseFor404
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor404ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor404ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### list_attempts_for_endpoint_api_v1_app_app_id_msg_msg_id_endpoint_endpoint_id_attempt_get.ApiResponseFor409
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor409ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor409ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### list_attempts_for_endpoint_api_v1_app_app_id_msg_msg_id_endpoint_endpoint_id_attempt_get.ApiResponseFor422
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor422ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor422ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HTTPValidationError**](../../models/HTTPValidationError.md) |  | 


#### list_attempts_for_endpoint_api_v1_app_app_id_msg_msg_id_endpoint_endpoint_id_attempt_get.ApiResponseFor429
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

# **resend_webhook_api_v1_app_app_id_msg_msg_id_endpoint_endpoint_id_resend_post**
<a name="resend_webhook_api_v1_app_app_id_msg_msg_id_endpoint_endpoint_id_resend_post"></a>
> resend_webhook_api_v1_app_app_id_msg_msg_id_endpoint_endpoint_id_resend_post(endpoint_idmsg_idapp_id)

Resend Webhook

Resend a message to the specified endpoint.

### Example

* Bearer Authentication (HTTPBearer):
```python
import apitest
from apitest.apis.tags import message_attempt_api
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
    api_instance = message_attempt_api.MessageAttemptApi(api_client)

    # example passing only required values which don't have defaults set
    path_params = {
        'endpoint_id': "ep_1srOrx2ZWZBpBUvZwXKQmoEYga2",
        'msg_id': "msg_1srOrx2ZWZBpBUvZwXKQmoEYga2",
        'app_id': "app_1srOrx2ZWZBpBUvZwXKQmoEYga2",
    }
    header_params = {
    }
    try:
        # Resend Webhook
        api_response = api_instance.resend_webhook_api_v1_app_app_id_msg_msg_id_endpoint_endpoint_id_resend_post(
            path_params=path_params,
            header_params=header_params,
        )
    except apitest.ApiException as e:
        print("Exception when calling MessageAttemptApi->resend_webhook_api_v1_app_app_id_msg_msg_id_endpoint_endpoint_id_resend_post: %s\n" % e)

    # example passing only optional values
    path_params = {
        'endpoint_id': "ep_1srOrx2ZWZBpBUvZwXKQmoEYga2",
        'msg_id': "msg_1srOrx2ZWZBpBUvZwXKQmoEYga2",
        'app_id': "app_1srOrx2ZWZBpBUvZwXKQmoEYga2",
    }
    header_params = {
        'idempotency-key': "idempotency-key_example",
    }
    try:
        # Resend Webhook
        api_response = api_instance.resend_webhook_api_v1_app_app_id_msg_msg_id_endpoint_endpoint_id_resend_post(
            path_params=path_params,
            header_params=header_params,
        )
    except apitest.ApiException as e:
        print("Exception when calling MessageAttemptApi->resend_webhook_api_v1_app_app_id_msg_msg_id_endpoint_endpoint_id_resend_post: %s\n" % e)
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
msg_id | MsgIdSchema | | 
app_id | AppIdSchema | | 

# EndpointIdSchema

The endpoint's ID or UID

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  | The endpoint&#x27;s ID or UID | 

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
202 | [ApiResponseFor202](#resend_webhook_api_v1_app_app_id_msg_msg_id_endpoint_endpoint_id_resend_post.ApiResponseFor202) | Successful Response
400 | [ApiResponseFor400](#resend_webhook_api_v1_app_app_id_msg_msg_id_endpoint_endpoint_id_resend_post.ApiResponseFor400) | Bad Request
401 | [ApiResponseFor401](#resend_webhook_api_v1_app_app_id_msg_msg_id_endpoint_endpoint_id_resend_post.ApiResponseFor401) | Unauthorized
403 | [ApiResponseFor403](#resend_webhook_api_v1_app_app_id_msg_msg_id_endpoint_endpoint_id_resend_post.ApiResponseFor403) | Forbidden
404 | [ApiResponseFor404](#resend_webhook_api_v1_app_app_id_msg_msg_id_endpoint_endpoint_id_resend_post.ApiResponseFor404) | Not Found
409 | [ApiResponseFor409](#resend_webhook_api_v1_app_app_id_msg_msg_id_endpoint_endpoint_id_resend_post.ApiResponseFor409) | Conflict
422 | [ApiResponseFor422](#resend_webhook_api_v1_app_app_id_msg_msg_id_endpoint_endpoint_id_resend_post.ApiResponseFor422) | Validation Error
429 | [ApiResponseFor429](#resend_webhook_api_v1_app_app_id_msg_msg_id_endpoint_endpoint_id_resend_post.ApiResponseFor429) | Too Many Requests

#### resend_webhook_api_v1_app_app_id_msg_msg_id_endpoint_endpoint_id_resend_post.ApiResponseFor202
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | Unset | body was not defined |
headers | Unset | headers were not defined |

#### resend_webhook_api_v1_app_app_id_msg_msg_id_endpoint_endpoint_id_resend_post.ApiResponseFor400
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor400ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor400ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### resend_webhook_api_v1_app_app_id_msg_msg_id_endpoint_endpoint_id_resend_post.ApiResponseFor401
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor401ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor401ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### resend_webhook_api_v1_app_app_id_msg_msg_id_endpoint_endpoint_id_resend_post.ApiResponseFor403
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor403ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor403ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### resend_webhook_api_v1_app_app_id_msg_msg_id_endpoint_endpoint_id_resend_post.ApiResponseFor404
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor404ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor404ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### resend_webhook_api_v1_app_app_id_msg_msg_id_endpoint_endpoint_id_resend_post.ApiResponseFor409
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor409ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor409ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HttpErrorOut**](../../models/HttpErrorOut.md) |  | 


#### resend_webhook_api_v1_app_app_id_msg_msg_id_endpoint_endpoint_id_resend_post.ApiResponseFor422
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor422ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor422ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HTTPValidationError**](../../models/HTTPValidationError.md) |  | 


#### resend_webhook_api_v1_app_app_id_msg_msg_id_endpoint_endpoint_id_resend_post.ApiResponseFor429
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

