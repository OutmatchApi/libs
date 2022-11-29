# \IntegrationApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_integration_api_v1_app_app_id_integration_post**](IntegrationApi.md#create_integration_api_v1_app_app_id_integration_post) | **POST** /api/v1/app/{app_id}/integration/ | Create Integration
[**delete_integration_api_v1_app_app_id_integration_integ_id_delete**](IntegrationApi.md#delete_integration_api_v1_app_app_id_integration_integ_id_delete) | **DELETE** /api/v1/app/{app_id}/integration/{integ_id}/ | Delete Integration
[**get_integration_api_v1_app_app_id_integration_integ_id_get**](IntegrationApi.md#get_integration_api_v1_app_app_id_integration_integ_id_get) | **GET** /api/v1/app/{app_id}/integration/{integ_id}/ | Get Integration
[**get_integration_key_api_v1_app_app_id_integration_integ_id_key_get**](IntegrationApi.md#get_integration_key_api_v1_app_app_id_integration_integ_id_key_get) | **GET** /api/v1/app/{app_id}/integration/{integ_id}/key/ | Get Integration Key
[**list_integrations_api_v1_app_app_id_integration_get**](IntegrationApi.md#list_integrations_api_v1_app_app_id_integration_get) | **GET** /api/v1/app/{app_id}/integration/ | List Integrations
[**rotate_integration_key_api_v1_app_app_id_integration_integ_id_key_rotate_post**](IntegrationApi.md#rotate_integration_key_api_v1_app_app_id_integration_integ_id_key_rotate_post) | **POST** /api/v1/app/{app_id}/integration/{integ_id}/key/rotate/ | Rotate Integration Key
[**update_integration_api_v1_app_app_id_integration_integ_id_put**](IntegrationApi.md#update_integration_api_v1_app_app_id_integration_integ_id_put) | **PUT** /api/v1/app/{app_id}/integration/{integ_id}/ | Update Integration



## create_integration_api_v1_app_app_id_integration_post

> crate::models::IntegrationOut create_integration_api_v1_app_app_id_integration_post(app_id, integration_in, idempotency_key)
Create Integration

Create an integration.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**app_id** | **String** |  | [required] |
**integration_in** | [**IntegrationIn**](IntegrationIn.md) |  | [required] |
**idempotency_key** | Option<**String**> | The request's idempotency key |  |

### Return type

[**crate::models::IntegrationOut**](IntegrationOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## delete_integration_api_v1_app_app_id_integration_integ_id_delete

> delete_integration_api_v1_app_app_id_integration_integ_id_delete(integ_id, app_id, idempotency_key)
Delete Integration

Delete an integration and revoke it's key.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**integ_id** | **String** |  | [required] |
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


## get_integration_api_v1_app_app_id_integration_integ_id_get

> crate::models::IntegrationOut get_integration_api_v1_app_app_id_integration_integ_id_get(integ_id, app_id, idempotency_key)
Get Integration

Get an integration.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**integ_id** | **String** |  | [required] |
**app_id** | **String** |  | [required] |
**idempotency_key** | Option<**String**> | The request's idempotency key |  |

### Return type

[**crate::models::IntegrationOut**](IntegrationOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## get_integration_key_api_v1_app_app_id_integration_integ_id_key_get

> crate::models::IntegrationKeyOut get_integration_key_api_v1_app_app_id_integration_integ_id_key_get(integ_id, app_id, idempotency_key)
Get Integration Key

Get an integration's key.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**integ_id** | **String** |  | [required] |
**app_id** | **String** |  | [required] |
**idempotency_key** | Option<**String**> | The request's idempotency key |  |

### Return type

[**crate::models::IntegrationKeyOut**](IntegrationKeyOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## list_integrations_api_v1_app_app_id_integration_get

> crate::models::ListResponseIntegrationOut list_integrations_api_v1_app_app_id_integration_get(app_id, iterator, limit, idempotency_key)
List Integrations

List the application's integrations.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**app_id** | **String** |  | [required] |
**iterator** | Option<**String**> |  |  |
**limit** | Option<**i32**> |  |  |[default to 50]
**idempotency_key** | Option<**String**> | The request's idempotency key |  |

### Return type

[**crate::models::ListResponseIntegrationOut**](ListResponse_IntegrationOut_.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## rotate_integration_key_api_v1_app_app_id_integration_integ_id_key_rotate_post

> crate::models::IntegrationKeyOut rotate_integration_key_api_v1_app_app_id_integration_integ_id_key_rotate_post(integ_id, app_id, idempotency_key)
Rotate Integration Key

Rotate the integration's key. The previous key will be immediately revoked.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**integ_id** | **String** |  | [required] |
**app_id** | **String** |  | [required] |
**idempotency_key** | Option<**String**> | The request's idempotency key |  |

### Return type

[**crate::models::IntegrationKeyOut**](IntegrationKeyOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## update_integration_api_v1_app_app_id_integration_integ_id_put

> crate::models::IntegrationOut update_integration_api_v1_app_app_id_integration_integ_id_put(integ_id, app_id, integration_update, idempotency_key)
Update Integration

Update an integration.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**integ_id** | **String** |  | [required] |
**app_id** | **String** |  | [required] |
**integration_update** | [**IntegrationUpdate**](IntegrationUpdate.md) |  | [required] |
**idempotency_key** | Option<**String**> | The request's idempotency key |  |

### Return type

[**crate::models::IntegrationOut**](IntegrationOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

