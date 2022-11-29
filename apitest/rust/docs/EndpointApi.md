# \EndpointApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_endpoint_api_v1_app_app_id_endpoint_post**](EndpointApi.md#create_endpoint_api_v1_app_app_id_endpoint_post) | **POST** /api/v1/app/{app_id}/endpoint/ | Create Endpoint
[**delete_endpoint_api_v1_app_app_id_endpoint_endpoint_id_delete**](EndpointApi.md#delete_endpoint_api_v1_app_app_id_endpoint_endpoint_id_delete) | **DELETE** /api/v1/app/{app_id}/endpoint/{endpoint_id}/ | Delete Endpoint
[**get_endpoint_api_v1_app_app_id_endpoint_endpoint_id_get**](EndpointApi.md#get_endpoint_api_v1_app_app_id_endpoint_endpoint_id_get) | **GET** /api/v1/app/{app_id}/endpoint/{endpoint_id}/ | Get Endpoint
[**get_endpoint_headers_api_v1_app_app_id_endpoint_endpoint_id_headers_get**](EndpointApi.md#get_endpoint_headers_api_v1_app_app_id_endpoint_endpoint_id_headers_get) | **GET** /api/v1/app/{app_id}/endpoint/{endpoint_id}/headers/ | Get Endpoint Headers
[**get_endpoint_secret_api_v1_app_app_id_endpoint_endpoint_id_secret_get**](EndpointApi.md#get_endpoint_secret_api_v1_app_app_id_endpoint_endpoint_id_secret_get) | **GET** /api/v1/app/{app_id}/endpoint/{endpoint_id}/secret/ | Get Endpoint Secret
[**get_endpoint_stats_api_v1_app_app_id_endpoint_endpoint_id_stats_get**](EndpointApi.md#get_endpoint_stats_api_v1_app_app_id_endpoint_endpoint_id_stats_get) | **GET** /api/v1/app/{app_id}/endpoint/{endpoint_id}/stats/ | Get Endpoint Stats
[**list_endpoints_api_v1_app_app_id_endpoint_get**](EndpointApi.md#list_endpoints_api_v1_app_app_id_endpoint_get) | **GET** /api/v1/app/{app_id}/endpoint/ | List Endpoints
[**patch_endpoint_headers_api_v1_app_app_id_endpoint_endpoint_id_headers_patch**](EndpointApi.md#patch_endpoint_headers_api_v1_app_app_id_endpoint_endpoint_id_headers_patch) | **PATCH** /api/v1/app/{app_id}/endpoint/{endpoint_id}/headers/ | Patch Endpoint Headers
[**recover_failed_webhooks_api_v1_app_app_id_endpoint_endpoint_id_recover_post**](EndpointApi.md#recover_failed_webhooks_api_v1_app_app_id_endpoint_endpoint_id_recover_post) | **POST** /api/v1/app/{app_id}/endpoint/{endpoint_id}/recover/ | Recover Failed Webhooks
[**replay_missing_webhooks_api_v1_app_app_id_endpoint_endpoint_id_replay_missing_post**](EndpointApi.md#replay_missing_webhooks_api_v1_app_app_id_endpoint_endpoint_id_replay_missing_post) | **POST** /api/v1/app/{app_id}/endpoint/{endpoint_id}/replay-missing/ | Replay Missing Webhooks
[**rotate_endpoint_secret_api_v1_app_app_id_endpoint_endpoint_id_secret_rotate_post**](EndpointApi.md#rotate_endpoint_secret_api_v1_app_app_id_endpoint_endpoint_id_secret_rotate_post) | **POST** /api/v1/app/{app_id}/endpoint/{endpoint_id}/secret/rotate/ | Rotate Endpoint Secret
[**update_endpoint_api_v1_app_app_id_endpoint_endpoint_id_put**](EndpointApi.md#update_endpoint_api_v1_app_app_id_endpoint_endpoint_id_put) | **PUT** /api/v1/app/{app_id}/endpoint/{endpoint_id}/ | Update Endpoint
[**update_endpoint_headers_api_v1_app_app_id_endpoint_endpoint_id_headers_put**](EndpointApi.md#update_endpoint_headers_api_v1_app_app_id_endpoint_endpoint_id_headers_put) | **PUT** /api/v1/app/{app_id}/endpoint/{endpoint_id}/headers/ | Update Endpoint Headers



## create_endpoint_api_v1_app_app_id_endpoint_post

> crate::models::EndpointOut create_endpoint_api_v1_app_app_id_endpoint_post(app_id, endpoint_in, idempotency_key)
Create Endpoint

Create a new endpoint for the application.  When `secret` is `null` the secret is automatically generated (recommended)

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**app_id** | **String** |  | [required] |
**endpoint_in** | [**EndpointIn**](EndpointIn.md) |  | [required] |
**idempotency_key** | Option<**String**> | The request's idempotency key |  |

### Return type

[**crate::models::EndpointOut**](EndpointOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## delete_endpoint_api_v1_app_app_id_endpoint_endpoint_id_delete

> delete_endpoint_api_v1_app_app_id_endpoint_endpoint_id_delete(endpoint_id, app_id, idempotency_key)
Delete Endpoint

Delete an endpoint.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**endpoint_id** | **String** |  | [required] |
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


## get_endpoint_api_v1_app_app_id_endpoint_endpoint_id_get

> crate::models::EndpointOut get_endpoint_api_v1_app_app_id_endpoint_endpoint_id_get(endpoint_id, app_id, idempotency_key)
Get Endpoint

Get an application.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**endpoint_id** | **String** |  | [required] |
**app_id** | **String** |  | [required] |
**idempotency_key** | Option<**String**> | The request's idempotency key |  |

### Return type

[**crate::models::EndpointOut**](EndpointOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## get_endpoint_headers_api_v1_app_app_id_endpoint_endpoint_id_headers_get

> crate::models::EndpointHeadersOut get_endpoint_headers_api_v1_app_app_id_endpoint_endpoint_id_headers_get(endpoint_id, app_id, idempotency_key)
Get Endpoint Headers

Get the additional headers to be sent with the webhook

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**endpoint_id** | **String** |  | [required] |
**app_id** | **String** |  | [required] |
**idempotency_key** | Option<**String**> | The request's idempotency key |  |

### Return type

[**crate::models::EndpointHeadersOut**](EndpointHeadersOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## get_endpoint_secret_api_v1_app_app_id_endpoint_endpoint_id_secret_get

> crate::models::EndpointSecretOut get_endpoint_secret_api_v1_app_app_id_endpoint_endpoint_id_secret_get(endpoint_id, app_id, idempotency_key)
Get Endpoint Secret

Get the endpoint's signing secret.  This is used to verify the authenticity of the webhook. For more information please refer to [the consuming webhooks docs](https://docs.svix.com/consuming-webhooks/).

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**endpoint_id** | **String** |  | [required] |
**app_id** | **String** |  | [required] |
**idempotency_key** | Option<**String**> | The request's idempotency key |  |

### Return type

[**crate::models::EndpointSecretOut**](EndpointSecretOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## get_endpoint_stats_api_v1_app_app_id_endpoint_endpoint_id_stats_get

> crate::models::EndpointStats get_endpoint_stats_api_v1_app_app_id_endpoint_endpoint_id_stats_get(endpoint_id, app_id, idempotency_key)
Get Endpoint Stats

Get basic statistics for the endpoint.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**endpoint_id** | **String** |  | [required] |
**app_id** | **String** |  | [required] |
**idempotency_key** | Option<**String**> | The request's idempotency key |  |

### Return type

[**crate::models::EndpointStats**](EndpointStats.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## list_endpoints_api_v1_app_app_id_endpoint_get

> crate::models::ListResponseEndpointOut list_endpoints_api_v1_app_app_id_endpoint_get(app_id, iterator, limit, idempotency_key)
List Endpoints

List the application's endpoints.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**app_id** | **String** |  | [required] |
**iterator** | Option<**String**> |  |  |
**limit** | Option<**i32**> |  |  |[default to 50]
**idempotency_key** | Option<**String**> | The request's idempotency key |  |

### Return type

[**crate::models::ListResponseEndpointOut**](ListResponse_EndpointOut_.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## patch_endpoint_headers_api_v1_app_app_id_endpoint_endpoint_id_headers_patch

> patch_endpoint_headers_api_v1_app_app_id_endpoint_endpoint_id_headers_patch(app_id, endpoint_id, endpoint_headers_patch_in, idempotency_key)
Patch Endpoint Headers

Partially set the additional headers to be sent with the webhook

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**app_id** | **String** |  | [required] |
**endpoint_id** | **String** |  | [required] |
**endpoint_headers_patch_in** | [**EndpointHeadersPatchIn**](EndpointHeadersPatchIn.md) |  | [required] |
**idempotency_key** | Option<**String**> | The request's idempotency key |  |

### Return type

 (empty response body)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## recover_failed_webhooks_api_v1_app_app_id_endpoint_endpoint_id_recover_post

> serde_json::Value recover_failed_webhooks_api_v1_app_app_id_endpoint_endpoint_id_recover_post(app_id, endpoint_id, recover_in, idempotency_key)
Recover Failed Webhooks

Resend all failed messages since a given time.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**app_id** | **String** |  | [required] |
**endpoint_id** | **String** |  | [required] |
**recover_in** | [**RecoverIn**](RecoverIn.md) |  | [required] |
**idempotency_key** | Option<**String**> | The request's idempotency key |  |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## replay_missing_webhooks_api_v1_app_app_id_endpoint_endpoint_id_replay_missing_post

> serde_json::Value replay_missing_webhooks_api_v1_app_app_id_endpoint_endpoint_id_replay_missing_post(app_id, endpoint_id, replay_in, idempotency_key)
Replay Missing Webhooks

Replays messages to the endpoint. Only messages that were created after `since` will be sent. Messages that were previously sent to the endpoint are not resent.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**app_id** | **String** |  | [required] |
**endpoint_id** | **String** |  | [required] |
**replay_in** | [**ReplayIn**](ReplayIn.md) |  | [required] |
**idempotency_key** | Option<**String**> | The request's idempotency key |  |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## rotate_endpoint_secret_api_v1_app_app_id_endpoint_endpoint_id_secret_rotate_post

> rotate_endpoint_secret_api_v1_app_app_id_endpoint_endpoint_id_secret_rotate_post(endpoint_id, app_id, endpoint_secret_rotate_in, idempotency_key)
Rotate Endpoint Secret

Rotates the endpoint's signing secret.  The previous secret will be valid for the next 24 hours.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**endpoint_id** | **String** |  | [required] |
**app_id** | **String** |  | [required] |
**endpoint_secret_rotate_in** | [**EndpointSecretRotateIn**](EndpointSecretRotateIn.md) |  | [required] |
**idempotency_key** | Option<**String**> | The request's idempotency key |  |

### Return type

 (empty response body)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## update_endpoint_api_v1_app_app_id_endpoint_endpoint_id_put

> crate::models::EndpointOut update_endpoint_api_v1_app_app_id_endpoint_endpoint_id_put(endpoint_id, app_id, endpoint_update, idempotency_key)
Update Endpoint

Update an endpoint.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**endpoint_id** | **String** |  | [required] |
**app_id** | **String** |  | [required] |
**endpoint_update** | [**EndpointUpdate**](EndpointUpdate.md) |  | [required] |
**idempotency_key** | Option<**String**> | The request's idempotency key |  |

### Return type

[**crate::models::EndpointOut**](EndpointOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## update_endpoint_headers_api_v1_app_app_id_endpoint_endpoint_id_headers_put

> update_endpoint_headers_api_v1_app_app_id_endpoint_endpoint_id_headers_put(app_id, endpoint_id, endpoint_headers_in, idempotency_key)
Update Endpoint Headers

Set the additional headers to be sent with the webhook

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**app_id** | **String** |  | [required] |
**endpoint_id** | **String** |  | [required] |
**endpoint_headers_in** | [**EndpointHeadersIn**](EndpointHeadersIn.md) |  | [required] |
**idempotency_key** | Option<**String**> | The request's idempotency key |  |

### Return type

 (empty response body)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

