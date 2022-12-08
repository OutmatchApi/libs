# AdminInviteRequestsDeniedApi

All URIs are relative to *https://slack.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adminInviteRequestsDeniedList**](AdminInviteRequestsDeniedApi.md#adminInviteRequestsDeniedList) | **GET** /admin.inviteRequests.denied.list | 


<a name="adminInviteRequestsDeniedList"></a>
# **adminInviteRequestsDeniedList**
> DefaultSuccessTemplate adminInviteRequestsDeniedList(token, teamId, cursor, limit)



List all denied workspace invite requests.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = AdminInviteRequestsDeniedApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `admin.invites:read`
val teamId : kotlin.String = teamId_example // kotlin.String | ID for the workspace where the invite requests were made.
val cursor : kotlin.String = cursor_example // kotlin.String | Value of the `next_cursor` field sent as part of the previous api response
val limit : kotlin.Int = 56 // kotlin.Int | The number of results that will be returned by the API on each invocation. Must be between 1 - 1000 both inclusive
try {
    val result : DefaultSuccessTemplate = apiInstance.adminInviteRequestsDeniedList(token, teamId, cursor, limit)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdminInviteRequestsDeniedApi#adminInviteRequestsDeniedList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdminInviteRequestsDeniedApi#adminInviteRequestsDeniedList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;admin.invites:read&#x60; |
 **teamId** | **kotlin.String**| ID for the workspace where the invite requests were made. | [optional]
 **cursor** | **kotlin.String**| Value of the &#x60;next_cursor&#x60; field sent as part of the previous api response | [optional]
 **limit** | **kotlin.Int**| The number of results that will be returned by the API on each invocation. Must be between 1 - 1000 both inclusive | [optional]

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

