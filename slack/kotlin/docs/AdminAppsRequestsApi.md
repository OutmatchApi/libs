# AdminAppsRequestsApi

All URIs are relative to *https://slack.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adminAppsRequestsList**](AdminAppsRequestsApi.md#adminAppsRequestsList) | **GET** /admin.apps.requests.list | 


<a name="adminAppsRequestsList"></a>
# **adminAppsRequestsList**
> DefaultSuccessTemplate adminAppsRequestsList(token, limit, cursor, teamId)



List app requests for a team/workspace.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = AdminAppsRequestsApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `admin.apps:read`
val limit : kotlin.Int = 56 // kotlin.Int | The maximum number of items to return. Must be between 1 - 1000 both inclusive.
val cursor : kotlin.String = cursor_example // kotlin.String | Set `cursor` to `next_cursor` returned by the previous call to list items in the next page
val teamId : kotlin.String = teamId_example // kotlin.String | 
try {
    val result : DefaultSuccessTemplate = apiInstance.adminAppsRequestsList(token, limit, cursor, teamId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdminAppsRequestsApi#adminAppsRequestsList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdminAppsRequestsApi#adminAppsRequestsList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;admin.apps:read&#x60; |
 **limit** | **kotlin.Int**| The maximum number of items to return. Must be between 1 - 1000 both inclusive. | [optional]
 **cursor** | **kotlin.String**| Set &#x60;cursor&#x60; to &#x60;next_cursor&#x60; returned by the previous call to list items in the next page | [optional]
 **teamId** | **kotlin.String**|  | [optional]

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

