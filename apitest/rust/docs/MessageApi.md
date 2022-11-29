# \MessageApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_message_api_v1_app_app_id_msg_post**](MessageApi.md#create_message_api_v1_app_app_id_msg_post) | **POST** /api/v1/app/{app_id}/msg/ | Create Message
[**get_message_api_v1_app_app_id_msg_msg_id_get**](MessageApi.md#get_message_api_v1_app_app_id_msg_msg_id_get) | **GET** /api/v1/app/{app_id}/msg/{msg_id}/ | Get Message
[**list_messages_api_v1_app_app_id_msg_get**](MessageApi.md#list_messages_api_v1_app_app_id_msg_get) | **GET** /api/v1/app/{app_id}/msg/ | List Messages



## create_message_api_v1_app_app_id_msg_post

> crate::models::MessageOut create_message_api_v1_app_app_id_msg_post(app_id, message_in, with_content, idempotency_key)
Create Message

Creates a new message and dispatches it to all of the application's endpoints.  The `eventId` is an optional custom unique ID. It's verified to be unique only up to a day, after that no verification will be made. If a message with the same `eventId` already exists for any application in your environment, a 409 conflict error will be returned.  The `eventType` indicates the type and schema of the event. All messages of a certain `eventType` are expected to have the same schema. Endpoints can choose to only listen to specific event types. Messages can also have `channels`, which similar to event types let endpoints filter by them. Unlike event types, messages can have multiple channels, and channels don't imply a specific message content or schema.  The `payload' property is the webhook's body (the actual webhook message).

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**app_id** | **String** |  | [required] |
**message_in** | [**MessageIn**](MessageIn.md) |  | [required] |
**with_content** | Option<**bool**> |  |  |[default to true]
**idempotency_key** | Option<**String**> | The request's idempotency key |  |

### Return type

[**crate::models::MessageOut**](MessageOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## get_message_api_v1_app_app_id_msg_msg_id_get

> crate::models::MessageOut get_message_api_v1_app_app_id_msg_msg_id_get(msg_id, app_id, idempotency_key)
Get Message

Get a message by its ID or eventID.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**msg_id** | **String** |  | [required] |
**app_id** | **String** |  | [required] |
**idempotency_key** | Option<**String**> | The request's idempotency key |  |

### Return type

[**crate::models::MessageOut**](MessageOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## list_messages_api_v1_app_app_id_msg_get

> crate::models::ListResponseMessageOut list_messages_api_v1_app_app_id_msg_get(app_id, iterator, limit, event_types, channel, before, after, idempotency_key)
List Messages

List all of the application's messages.  The `before` parameter lets you filter all items created before a certain date and is ignored if an iterator is passed. The `after` parameter lets you filter all items created after a certain date and is ignored if an iterator is passed. `before` and `after` cannot be used simultaneously.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**app_id** | **String** |  | [required] |
**iterator** | Option<**String**> |  |  |
**limit** | Option<**i32**> |  |  |[default to 50]
**event_types** | Option<[**Vec<String>**](String.md)> |  |  |
**channel** | Option<**String**> |  |  |
**before** | Option<**String**> |  |  |
**after** | Option<**String**> |  |  |
**idempotency_key** | Option<**String**> | The request's idempotency key |  |

### Return type

[**crate::models::ListResponseMessageOut**](ListResponse_MessageOut_.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

