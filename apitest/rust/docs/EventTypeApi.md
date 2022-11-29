# \EventTypeApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_event_type_api_v1_event_type_post**](EventTypeApi.md#create_event_type_api_v1_event_type_post) | **POST** /api/v1/event-type/ | Create Event Type
[**delete_event_type_api_v1_event_type_event_type_name_delete**](EventTypeApi.md#delete_event_type_api_v1_event_type_event_type_name_delete) | **DELETE** /api/v1/event-type/{event_type_name}/ | Archive Event Type
[**get_event_type_api_v1_event_type_event_type_name_get**](EventTypeApi.md#get_event_type_api_v1_event_type_event_type_name_get) | **GET** /api/v1/event-type/{event_type_name}/ | Get Event Type
[**list_event_types_api_v1_event_type_get**](EventTypeApi.md#list_event_types_api_v1_event_type_get) | **GET** /api/v1/event-type/ | List Event Types
[**update_event_type_api_v1_event_type_event_type_name_put**](EventTypeApi.md#update_event_type_api_v1_event_type_event_type_name_put) | **PUT** /api/v1/event-type/{event_type_name}/ | Update Event Type



## create_event_type_api_v1_event_type_post

> crate::models::EventTypeOut create_event_type_api_v1_event_type_post(event_type_in, idempotency_key)
Create Event Type

Create new or unarchive existing event type.  Unarchiving an event type will allow endpoints to filter on it and messages to be sent with it. Endpoints filtering on the event type before archival will continue to filter on it. This operation does not preserve the description and schemas.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**event_type_in** | [**EventTypeIn**](EventTypeIn.md) |  | [required] |
**idempotency_key** | Option<**String**> | The request's idempotency key |  |

### Return type

[**crate::models::EventTypeOut**](EventTypeOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## delete_event_type_api_v1_event_type_event_type_name_delete

> delete_event_type_api_v1_event_type_event_type_name_delete(event_type_name, idempotency_key)
Archive Event Type

Archive an event type.  Endpoints already configured to filter on an event type will continue to do so after archival. However, new messages can not be sent with it and endpoints can not filter on it. An event type can be unarchived with the [create operation](#operation/create_event_type_api_v1_event_type__post).

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**event_type_name** | **String** |  | [required] |
**idempotency_key** | Option<**String**> | The request's idempotency key |  |

### Return type

 (empty response body)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## get_event_type_api_v1_event_type_event_type_name_get

> crate::models::EventTypeOut get_event_type_api_v1_event_type_event_type_name_get(event_type_name, idempotency_key)
Get Event Type

Get an event type.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**event_type_name** | **String** |  | [required] |
**idempotency_key** | Option<**String**> | The request's idempotency key |  |

### Return type

[**crate::models::EventTypeOut**](EventTypeOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## list_event_types_api_v1_event_type_get

> crate::models::ListResponseEventTypeOut list_event_types_api_v1_event_type_get(iterator, limit, with_content, include_archived, idempotency_key)
List Event Types

Return the list of event types.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**iterator** | Option<**String**> |  |  |
**limit** | Option<**i32**> |  |  |[default to 50]
**with_content** | Option<**bool**> |  |  |[default to false]
**include_archived** | Option<**bool**> |  |  |[default to false]
**idempotency_key** | Option<**String**> | The request's idempotency key |  |

### Return type

[**crate::models::ListResponseEventTypeOut**](ListResponse_EventTypeOut_.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## update_event_type_api_v1_event_type_event_type_name_put

> crate::models::EventTypeOut update_event_type_api_v1_event_type_event_type_name_put(event_type_name, event_type_update, idempotency_key)
Update Event Type

Update an event type.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**event_type_name** | **String** |  | [required] |
**event_type_update** | [**EventTypeUpdate**](EventTypeUpdate.md) |  | [required] |
**idempotency_key** | Option<**String**> | The request's idempotency key |  |

### Return type

[**crate::models::EventTypeOut**](EventTypeOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

