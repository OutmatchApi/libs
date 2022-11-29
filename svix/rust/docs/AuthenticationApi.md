# \AuthenticationApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**expire_all_api_v1_auth_app_app_id_expire_all_post**](AuthenticationApi.md#expire_all_api_v1_auth_app_app_id_expire_all_post) | **POST** /api/v1/auth/app/{app_id}/expire-all/ | Expire All
[**get_dashboard_access_api_v1_auth_dashboard_access_app_id_post**](AuthenticationApi.md#get_dashboard_access_api_v1_auth_dashboard_access_app_id_post) | **POST** /api/v1/auth/dashboard-access/{app_id}/ | Get Consumer App Portal Access
[**logout_api_v1_auth_logout_post**](AuthenticationApi.md#logout_api_v1_auth_logout_post) | **POST** /api/v1/auth/logout/ | Logout



## expire_all_api_v1_auth_app_app_id_expire_all_post

> expire_all_api_v1_auth_app_app_id_expire_all_post(app_id, application_token_expire_in, idempotency_key)
Expire All

Expire all of the tokens associated with a specific Application

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**app_id** | **String** |  | [required] |
**application_token_expire_in** | [**ApplicationTokenExpireIn**](ApplicationTokenExpireIn.md) |  | [required] |
**idempotency_key** | Option<**String**> | The request's idempotency key |  |

### Return type

 (empty response body)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## get_dashboard_access_api_v1_auth_dashboard_access_app_id_post

> crate::models::DashboardAccessOut get_dashboard_access_api_v1_auth_dashboard_access_app_id_post(app_id, idempotency_key)
Get Consumer App Portal Access

Use this function to get magic links (and authentication codes) for connecting your users to the Consumer Application Portal.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**app_id** | **String** |  | [required] |
**idempotency_key** | Option<**String**> | The request's idempotency key |  |

### Return type

[**crate::models::DashboardAccessOut**](DashboardAccessOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## logout_api_v1_auth_logout_post

> logout_api_v1_auth_logout_post(idempotency_key)
Logout

Logout an app token.  Trying to log out other tokens will fail.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**idempotency_key** | Option<**String**> | The request's idempotency key |  |

### Return type

 (empty response body)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

