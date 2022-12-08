# AppsPermissionsScopesApi

All URIs are relative to *https://slack.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**appsPermissionsScopesList**](AppsPermissionsScopesApi.md#appsPermissionsScopesList) | **GET** /apps.permissions.scopes.list | 


<a name="appsPermissionsScopesList"></a>
# **appsPermissionsScopesList**
> ApiPermissionsScopesListSuccessSchema appsPermissionsScopesList(token)



Returns list of scopes this app has on a team.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = AppsPermissionsScopesApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `none`
try {
    val result : ApiPermissionsScopesListSuccessSchema = apiInstance.appsPermissionsScopesList(token)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AppsPermissionsScopesApi#appsPermissionsScopesList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AppsPermissionsScopesApi#appsPermissionsScopesList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;none&#x60; |

### Return type

[**ApiPermissionsScopesListSuccessSchema**](ApiPermissionsScopesListSuccessSchema.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

