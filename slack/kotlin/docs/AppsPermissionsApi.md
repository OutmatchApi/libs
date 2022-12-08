# AppsPermissionsApi

All URIs are relative to *https://slack.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**appsPermissionsInfo**](AppsPermissionsApi.md#appsPermissionsInfo) | **GET** /apps.permissions.info | 
[**appsPermissionsRequest**](AppsPermissionsApi.md#appsPermissionsRequest) | **GET** /apps.permissions.request | 


<a name="appsPermissionsInfo"></a>
# **appsPermissionsInfo**
> AppsPermissionsInfoSchema appsPermissionsInfo(token)



Returns list of permissions this app has on a team.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = AppsPermissionsApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `none`
try {
    val result : AppsPermissionsInfoSchema = apiInstance.appsPermissionsInfo(token)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AppsPermissionsApi#appsPermissionsInfo")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AppsPermissionsApi#appsPermissionsInfo")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;none&#x60; | [optional]

### Return type

[**AppsPermissionsInfoSchema**](AppsPermissionsInfoSchema.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="appsPermissionsRequest"></a>
# **appsPermissionsRequest**
> AppsPermissionsRequestSchema appsPermissionsRequest(token, scopes, triggerId)



Allows an app to request additional scopes

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = AppsPermissionsApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `none`
val scopes : kotlin.String = scopes_example // kotlin.String | A comma separated list of scopes to request for
val triggerId : kotlin.String = triggerId_example // kotlin.String | Token used to trigger the permissions API
try {
    val result : AppsPermissionsRequestSchema = apiInstance.appsPermissionsRequest(token, scopes, triggerId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AppsPermissionsApi#appsPermissionsRequest")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AppsPermissionsApi#appsPermissionsRequest")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;none&#x60; |
 **scopes** | **kotlin.String**| A comma separated list of scopes to request for |
 **triggerId** | **kotlin.String**| Token used to trigger the permissions API |

### Return type

[**AppsPermissionsRequestSchema**](AppsPermissionsRequestSchema.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

