# \AuthenticationApi

All URIs are relative to *https://ws.api.video*

Method | HTTP request | Description
------------- | ------------- | -------------
[**p_ost_auth_api_key**](AuthenticationApi.md#p_ost_auth_api_key) | **POST** /auth/api-key | Authenticate
[**p_ost_auth_refresh**](AuthenticationApi.md#p_ost_auth_refresh) | **POST** /auth/refresh | Refresh token



## p_ost_auth_api_key

> crate::models::AccessToken p_ost_auth_api_key(authenticate_payload)
Authenticate

To get started, submit your API key in the body of your request. api.video returns an access token that is valid for one hour (3600 seconds). A refresh token is also returned. View a [tutorial](https://api.video/blog/tutorials/authentication-tutorial) on authentication. All tutorials using the [authentication endpoint](https://api.video/blog/endpoints/authenticate)

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**authenticate_payload** | Option<[**AuthenticatePayload**](AuthenticatePayload.md)> |  |  |

### Return type

[**crate::models::AccessToken**](access-token.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## p_ost_auth_refresh

> crate::models::AccessToken p_ost_auth_refresh(refresh_token_payload)
Refresh token

Use the refresh endpoint with the refresh token you received when you first authenticated using the api-key endpoint. Send the refresh token in the body of your request. The api.video API returns a new access token that is valid for one hour (3600 seconds) and a new refresh token.  

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**refresh_token_payload** | Option<[**RefreshTokenPayload**](RefreshTokenPayload.md)> |  |  |

### Return type

[**crate::models::AccessToken**](access-token.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

