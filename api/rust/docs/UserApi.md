# \UserApi

All URIs are relative to *https://api.outmatchapi.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_user**](UserApi.md#create_user) | **POST** /user | Create user
[**update_user**](UserApi.md#update_user) | **PUT** /user | Update user



## create_user

> crate::models::User create_user(create_user_request)
Create user

This can only be done by the logged in user.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**create_user_request** | Option<[**CreateUserRequest**](CreateUserRequest.md)> |  |  |

### Return type

[**crate::models::User**](User.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## update_user

> update_user(update_user_request)
Update user

This can only be done by the logged in user.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**update_user_request** | Option<[**UpdateUserRequest**](UpdateUserRequest.md)> |  |  |

### Return type

 (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

