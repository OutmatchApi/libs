# \ApplicationApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_application_api_v1_app_post**](ApplicationApi.md#create_application_api_v1_app_post) | **POST** /api/v1/app/ | Create Application
[**delete_application_api_v1_app_app_id_delete**](ApplicationApi.md#delete_application_api_v1_app_app_id_delete) | **DELETE** /api/v1/app/{app_id}/ | Delete Application
[**get_application_api_v1_app_app_id_get**](ApplicationApi.md#get_application_api_v1_app_app_id_get) | **GET** /api/v1/app/{app_id}/ | Get Application
[**list_applications_api_v1_app_get**](ApplicationApi.md#list_applications_api_v1_app_get) | **GET** /api/v1/app/ | List Applications
[**update_application_api_v1_app_app_id_put**](ApplicationApi.md#update_application_api_v1_app_app_id_put) | **PUT** /api/v1/app/{app_id}/ | Update Application



## create_application_api_v1_app_post

> crate::models::ApplicationOut create_application_api_v1_app_post(application_in, get_if_exists, idempotency_key)
Create Application

Create a new application.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**application_in** | [**ApplicationIn**](ApplicationIn.md) |  | [required] |
**get_if_exists** | Option<**bool**> | Get an existing application, or create a new one if doesn't exist. It's two separate functions in the libs. |  |[default to false]
**idempotency_key** | Option<**String**> | The request's idempotency key |  |

### Return type

[**crate::models::ApplicationOut**](ApplicationOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## delete_application_api_v1_app_app_id_delete

> delete_application_api_v1_app_app_id_delete(app_id, idempotency_key)
Delete Application

Delete an application.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
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


## get_application_api_v1_app_app_id_get

> crate::models::ApplicationOut get_application_api_v1_app_app_id_get(app_id, idempotency_key)
Get Application

Get an application.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**app_id** | **String** |  | [required] |
**idempotency_key** | Option<**String**> | The request's idempotency key |  |

### Return type

[**crate::models::ApplicationOut**](ApplicationOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## list_applications_api_v1_app_get

> crate::models::ListResponseApplicationOut list_applications_api_v1_app_get(iterator, limit, idempotency_key)
List Applications

List of all the organization's applications.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**iterator** | Option<**String**> |  |  |
**limit** | Option<**i32**> |  |  |[default to 50]
**idempotency_key** | Option<**String**> | The request's idempotency key |  |

### Return type

[**crate::models::ListResponseApplicationOut**](ListResponse_ApplicationOut_.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## update_application_api_v1_app_app_id_put

> crate::models::ApplicationOut update_application_api_v1_app_app_id_put(app_id, application_in, idempotency_key)
Update Application

Update an application.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**app_id** | **String** |  | [required] |
**application_in** | [**ApplicationIn**](ApplicationIn.md) |  | [required] |
**idempotency_key** | Option<**String**> | The request's idempotency key |  |

### Return type

[**crate::models::ApplicationOut**](ApplicationOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

