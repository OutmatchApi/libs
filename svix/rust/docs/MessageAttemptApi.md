# \MessageAttemptApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_attempt_api_v1_app_app_id_msg_msg_id_attempt_attempt_id_get**](MessageAttemptApi.md#get_attempt_api_v1_app_app_id_msg_msg_id_attempt_attempt_id_get) | **GET** /api/v1/app/{app_id}/msg/{msg_id}/attempt/{attempt_id}/ | Get Attempt
[**list_attempted_destinations_api_v1_app_app_id_msg_msg_id_endpoint_get**](MessageAttemptApi.md#list_attempted_destinations_api_v1_app_app_id_msg_msg_id_endpoint_get) | **GET** /api/v1/app/{app_id}/msg/{msg_id}/endpoint/ | List Attempted Destinations
[**list_attempted_messages_api_v1_app_app_id_endpoint_endpoint_id_msg_get**](MessageAttemptApi.md#list_attempted_messages_api_v1_app_app_id_endpoint_endpoint_id_msg_get) | **GET** /api/v1/app/{app_id}/endpoint/{endpoint_id}/msg/ | List Attempted Messages
[**list_attempts_api_v1_app_app_id_msg_msg_id_attempt_get**](MessageAttemptApi.md#list_attempts_api_v1_app_app_id_msg_msg_id_attempt_get) | **GET** /api/v1/app/{app_id}/msg/{msg_id}/attempt/ | List Attempts
[**list_attempts_by_endpoint_api_v1_app_app_id_attempt_endpoint_endpoint_id_get**](MessageAttemptApi.md#list_attempts_by_endpoint_api_v1_app_app_id_attempt_endpoint_endpoint_id_get) | **GET** /api/v1/app/{app_id}/attempt/endpoint/{endpoint_id}/ | List Attempts By Endpoint
[**list_attempts_by_msg_api_v1_app_app_id_attempt_msg_msg_id_get**](MessageAttemptApi.md#list_attempts_by_msg_api_v1_app_app_id_attempt_msg_msg_id_get) | **GET** /api/v1/app/{app_id}/attempt/msg/{msg_id}/ | List Attempts By Msg
[**list_attempts_for_endpoint_api_v1_app_app_id_msg_msg_id_endpoint_endpoint_id_attempt_get**](MessageAttemptApi.md#list_attempts_for_endpoint_api_v1_app_app_id_msg_msg_id_endpoint_endpoint_id_attempt_get) | **GET** /api/v1/app/{app_id}/msg/{msg_id}/endpoint/{endpoint_id}/attempt/ | List Attempts For Endpoint
[**resend_webhook_api_v1_app_app_id_msg_msg_id_endpoint_endpoint_id_resend_post**](MessageAttemptApi.md#resend_webhook_api_v1_app_app_id_msg_msg_id_endpoint_endpoint_id_resend_post) | **POST** /api/v1/app/{app_id}/msg/{msg_id}/endpoint/{endpoint_id}/resend/ | Resend Webhook



## get_attempt_api_v1_app_app_id_msg_msg_id_attempt_attempt_id_get

> crate::models::MessageAttemptOut get_attempt_api_v1_app_app_id_msg_msg_id_attempt_attempt_id_get(attempt_id, msg_id, app_id, idempotency_key)
Get Attempt

`msg_id`: Use a message id or a message `eventId`

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**attempt_id** | **String** |  | [required] |
**msg_id** | **String** |  | [required] |
**app_id** | **String** |  | [required] |
**idempotency_key** | Option<**String**> | The request's idempotency key |  |

### Return type

[**crate::models::MessageAttemptOut**](MessageAttemptOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## list_attempted_destinations_api_v1_app_app_id_msg_msg_id_endpoint_get

> crate::models::ListResponseMessageEndpointOut list_attempted_destinations_api_v1_app_app_id_msg_msg_id_endpoint_get(msg_id, app_id, iterator, limit, idempotency_key)
List Attempted Destinations

`msg_id`: Use a message id or a message `eventId`

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**msg_id** | **String** |  | [required] |
**app_id** | **String** |  | [required] |
**iterator** | Option<**String**> |  |  |
**limit** | Option<**i32**> |  |  |[default to 50]
**idempotency_key** | Option<**String**> | The request's idempotency key |  |

### Return type

[**crate::models::ListResponseMessageEndpointOut**](ListResponse_MessageEndpointOut_.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## list_attempted_messages_api_v1_app_app_id_endpoint_endpoint_id_msg_get

> crate::models::ListResponseEndpointMessageOut list_attempted_messages_api_v1_app_app_id_endpoint_endpoint_id_msg_get(endpoint_id, app_id, iterator, limit, channel, status, before, after, idempotency_key)
List Attempted Messages

List messages for a particular endpoint. Additionally includes metadata about the latest message attempt.  The `before` parameter lets you filter all items created before a certain date and is ignored if an iterator is passed.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**endpoint_id** | **String** |  | [required] |
**app_id** | **String** |  | [required] |
**iterator** | Option<**String**> |  |  |
**limit** | Option<**i32**> |  |  |[default to 50]
**channel** | Option<**String**> |  |  |
**status** | Option<[**MessageStatus**](.md)> |  |  |
**before** | Option<**String**> |  |  |
**after** | Option<**String**> |  |  |
**idempotency_key** | Option<**String**> | The request's idempotency key |  |

### Return type

[**crate::models::ListResponseEndpointMessageOut**](ListResponse_EndpointMessageOut_.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## list_attempts_api_v1_app_app_id_msg_msg_id_attempt_get

> crate::models::ListResponseMessageAttemptOut list_attempts_api_v1_app_app_id_msg_msg_id_attempt_get(app_id, msg_id, iterator, limit, endpoint_id, event_types, channel, status, before, after, idempotency_key)
List Attempts

Deprecated: Please use \"List Attempts by Endpoint\" and \"List Attempts by Msg\" instead.  `msg_id`: Use a message id or a message `eventId`

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**app_id** | **String** |  | [required] |
**msg_id** | **String** |  | [required] |
**iterator** | Option<**String**> |  |  |
**limit** | Option<**i32**> |  |  |[default to 50]
**endpoint_id** | Option<**String**> |  |  |
**event_types** | Option<[**Vec<String>**](String.md)> |  |  |
**channel** | Option<**String**> |  |  |
**status** | Option<[**MessageStatus**](.md)> |  |  |
**before** | Option<**String**> |  |  |
**after** | Option<**String**> |  |  |
**idempotency_key** | Option<**String**> | The request's idempotency key |  |

### Return type

[**crate::models::ListResponseMessageAttemptOut**](ListResponse_MessageAttemptOut_.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## list_attempts_by_endpoint_api_v1_app_app_id_attempt_endpoint_endpoint_id_get

> crate::models::ListResponseMessageAttemptOut list_attempts_by_endpoint_api_v1_app_app_id_attempt_endpoint_endpoint_id_get(app_id, endpoint_id, iterator, limit, status, status_code_class, event_types, channel, before, after, idempotency_key)
List Attempts By Endpoint

List attempts by endpoint id

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**app_id** | **String** |  | [required] |
**endpoint_id** | **String** |  | [required] |
**iterator** | Option<**String**> |  |  |
**limit** | Option<**i32**> |  |  |[default to 50]
**status** | Option<[**MessageStatus**](.md)> |  |  |
**status_code_class** | Option<[**StatusCodeClass**](.md)> |  |  |
**event_types** | Option<[**Vec<String>**](String.md)> |  |  |
**channel** | Option<**String**> |  |  |
**before** | Option<**String**> |  |  |
**after** | Option<**String**> |  |  |
**idempotency_key** | Option<**String**> | The request's idempotency key |  |

### Return type

[**crate::models::ListResponseMessageAttemptOut**](ListResponse_MessageAttemptOut_.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## list_attempts_by_msg_api_v1_app_app_id_attempt_msg_msg_id_get

> crate::models::ListResponseMessageAttemptOut list_attempts_by_msg_api_v1_app_app_id_attempt_msg_msg_id_get(app_id, msg_id, endpoint_id, iterator, limit, status, status_code_class, event_types, channel, before, after, idempotency_key)
List Attempts By Msg

List attempts by message id

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**app_id** | **String** |  | [required] |
**msg_id** | **String** |  | [required] |
**endpoint_id** | Option<**String**> |  |  |
**iterator** | Option<**String**> |  |  |
**limit** | Option<**i32**> |  |  |[default to 50]
**status** | Option<[**MessageStatus**](.md)> |  |  |
**status_code_class** | Option<[**StatusCodeClass**](.md)> |  |  |
**event_types** | Option<[**Vec<String>**](String.md)> |  |  |
**channel** | Option<**String**> |  |  |
**before** | Option<**String**> |  |  |
**after** | Option<**String**> |  |  |
**idempotency_key** | Option<**String**> | The request's idempotency key |  |

### Return type

[**crate::models::ListResponseMessageAttemptOut**](ListResponse_MessageAttemptOut_.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## list_attempts_for_endpoint_api_v1_app_app_id_msg_msg_id_endpoint_endpoint_id_attempt_get

> crate::models::ListResponseMessageAttemptEndpointOut list_attempts_for_endpoint_api_v1_app_app_id_msg_msg_id_endpoint_endpoint_id_attempt_get(msg_id, app_id, endpoint_id, iterator, limit, event_types, channel, status, before, after, idempotency_key)
List Attempts For Endpoint

DEPRECATED: please use list_attempts with endpoint_id as a query parameter instead.  List the message attempts for a particular endpoint.  Returning the endpoint.  The `before` parameter lets you filter all items created before a certain date and is ignored if an iterator is passed.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**msg_id** | **String** |  | [required] |
**app_id** | **String** |  | [required] |
**endpoint_id** | **String** |  | [required] |
**iterator** | Option<**String**> |  |  |
**limit** | Option<**i32**> |  |  |[default to 50]
**event_types** | Option<[**Vec<String>**](String.md)> |  |  |
**channel** | Option<**String**> |  |  |
**status** | Option<[**MessageStatus**](.md)> |  |  |
**before** | Option<**String**> |  |  |
**after** | Option<**String**> |  |  |
**idempotency_key** | Option<**String**> | The request's idempotency key |  |

### Return type

[**crate::models::ListResponseMessageAttemptEndpointOut**](ListResponse_MessageAttemptEndpointOut_.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## resend_webhook_api_v1_app_app_id_msg_msg_id_endpoint_endpoint_id_resend_post

> resend_webhook_api_v1_app_app_id_msg_msg_id_endpoint_endpoint_id_resend_post(endpoint_id, msg_id, app_id, idempotency_key)
Resend Webhook

Resend a message to the specified endpoint.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**endpoint_id** | **String** |  | [required] |
**msg_id** | **String** |  | [required] |
**app_id** | **String** |  | [required] |
**idempotency_key** | Option<**String**> | The request's idempotency key |  |

### Return type

 (empty response body)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

