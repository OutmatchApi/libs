# \ApiApi

All URIs are relative to *https://slack.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**api_test**](ApiApi.md#api_test) | **GET** /api.test | 



## api_test

> crate::models::ApiTestSuccessSchema api_test(error, foo)


Checks API calling code.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**error** | Option<**String**> | Error response to return |  |
**foo** | Option<**String**> | example property to return |  |

### Return type

[**crate::models::ApiTestSuccessSchema**](api_test_success_schema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

