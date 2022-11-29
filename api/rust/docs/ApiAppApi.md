# \ApiAppApi

All URIs are relative to *https://api.outmatchapi.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_api_app**](ApiAppApi.md#create_api_app) | **POST** /apiApp | Create api app
[**create_api_app_release**](ApiAppApi.md#create_api_app_release) | **POST** /apiApp/{app_id}/release | Create api app release
[**create_api_app_release_sdks**](ApiAppApi.md#create_api_app_release_sdks) | **POST** /apiApp/{app_id}/release/{release_version}/sdk | Generate sdks for a relase



## create_api_app

> crate::models::ApiApp create_api_app(create_api_app_request)
Create api app

Create an api app for the authenticated user

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**create_api_app_request** | Option<[**CreateApiAppRequest**](CreateApiAppRequest.md)> |  |  |

### Return type

[**crate::models::ApiApp**](ApiApp.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## create_api_app_release

> crate::models::Release create_api_app_release(app_id, body)
Create api app release

Create an api app release

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**app_id** | **String** | app id to associate the release with | [required] |
**body** | Option<**String**> | Created release object |  |

### Return type

[**crate::models::Release**](Release.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: text/plain
- **Accept**: application/json, application/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## create_api_app_release_sdks

> Vec<crate::models::Sdk> create_api_app_release_sdks(app_id, release_version, create_api_app_release_sdks_request)
Generate sdks for a relase

Generate sdks for a relase

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**app_id** | **String** | app id | [required] |
**release_version** | **String** | release id | [required] |
**create_api_app_release_sdks_request** | Option<[**CreateApiAppReleaseSdksRequest**](CreateApiAppReleaseSdksRequest.md)> |  |  |

### Return type

[**Vec<crate::models::Sdk>**](Sdk.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

