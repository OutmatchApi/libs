# AdminAppsApi

All URIs are relative to *https://slack.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adminAppsApprove**](AdminAppsApi.md#adminAppsApprove) | **POST** /admin.apps.approve | 
[**adminAppsRestrict**](AdminAppsApi.md#adminAppsRestrict) | **POST** /admin.apps.restrict | 


<a name="adminAppsApprove"></a>
# **adminAppsApprove**
> DefaultSuccessTemplate adminAppsApprove(token, appId, requestId, teamId)



Approve an app for installation on a workspace.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = AdminAppsApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `admin.apps:write`
val appId : kotlin.String = appId_example // kotlin.String | The id of the app to approve.
val requestId : kotlin.String = requestId_example // kotlin.String | The id of the request to approve.
val teamId : kotlin.String = teamId_example // kotlin.String | 
try {
    val result : DefaultSuccessTemplate = apiInstance.adminAppsApprove(token, appId, requestId, teamId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdminAppsApi#adminAppsApprove")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdminAppsApi#adminAppsApprove")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;admin.apps:write&#x60; |
 **appId** | **kotlin.String**| The id of the app to approve. | [optional]
 **requestId** | **kotlin.String**| The id of the request to approve. | [optional]
 **teamId** | **kotlin.String**|  | [optional]

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="adminAppsRestrict"></a>
# **adminAppsRestrict**
> DefaultSuccessTemplate adminAppsRestrict(token, appId, requestId, teamId)



Restrict an app for installation on a workspace.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = AdminAppsApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `admin.apps:write`
val appId : kotlin.String = appId_example // kotlin.String | The id of the app to restrict.
val requestId : kotlin.String = requestId_example // kotlin.String | The id of the request to restrict.
val teamId : kotlin.String = teamId_example // kotlin.String | 
try {
    val result : DefaultSuccessTemplate = apiInstance.adminAppsRestrict(token, appId, requestId, teamId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdminAppsApi#adminAppsRestrict")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdminAppsApi#adminAppsRestrict")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;admin.apps:write&#x60; |
 **appId** | **kotlin.String**| The id of the app to restrict. | [optional]
 **requestId** | **kotlin.String**| The id of the request to restrict. | [optional]
 **teamId** | **kotlin.String**|  | [optional]

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

