# AdminInviteRequestsApi

All URIs are relative to *https://slack.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adminInviteRequestsApprove**](AdminInviteRequestsApi.md#adminInviteRequestsApprove) | **POST** /admin.inviteRequests.approve | 
[**adminInviteRequestsDeny**](AdminInviteRequestsApi.md#adminInviteRequestsDeny) | **POST** /admin.inviteRequests.deny | 
[**adminInviteRequestsList**](AdminInviteRequestsApi.md#adminInviteRequestsList) | **GET** /admin.inviteRequests.list | 


<a name="adminInviteRequestsApprove"></a>
# **adminInviteRequestsApprove**
> DefaultSuccessTemplate adminInviteRequestsApprove(token, adminInviteRequestsApproveRequest)



Approve a workspace invite request.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = AdminInviteRequestsApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `admin.invites:write`
val adminInviteRequestsApproveRequest : AdminInviteRequestsApproveRequest =  // AdminInviteRequestsApproveRequest | 
try {
    val result : DefaultSuccessTemplate = apiInstance.adminInviteRequestsApprove(token, adminInviteRequestsApproveRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdminInviteRequestsApi#adminInviteRequestsApprove")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdminInviteRequestsApi#adminInviteRequestsApprove")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;admin.invites:write&#x60; |
 **adminInviteRequestsApproveRequest** | [**AdminInviteRequestsApproveRequest**](AdminInviteRequestsApproveRequest.md)|  | [optional]

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="adminInviteRequestsDeny"></a>
# **adminInviteRequestsDeny**
> DefaultSuccessTemplate adminInviteRequestsDeny(token, adminInviteRequestsApproveRequest)



Deny a workspace invite request.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = AdminInviteRequestsApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `admin.invites:write`
val adminInviteRequestsApproveRequest : AdminInviteRequestsApproveRequest =  // AdminInviteRequestsApproveRequest | 
try {
    val result : DefaultSuccessTemplate = apiInstance.adminInviteRequestsDeny(token, adminInviteRequestsApproveRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdminInviteRequestsApi#adminInviteRequestsDeny")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdminInviteRequestsApi#adminInviteRequestsDeny")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;admin.invites:write&#x60; |
 **adminInviteRequestsApproveRequest** | [**AdminInviteRequestsApproveRequest**](AdminInviteRequestsApproveRequest.md)|  | [optional]

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="adminInviteRequestsList"></a>
# **adminInviteRequestsList**
> DefaultSuccessTemplate adminInviteRequestsList(token, teamId, cursor, limit)



List all pending workspace invite requests.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = AdminInviteRequestsApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `admin.invites:read`
val teamId : kotlin.String = teamId_example // kotlin.String | ID for the workspace where the invite requests were made.
val cursor : kotlin.String = cursor_example // kotlin.String | Value of the `next_cursor` field sent as part of the previous API response
val limit : kotlin.Int = 56 // kotlin.Int | The number of results that will be returned by the API on each invocation. Must be between 1 - 1000, both inclusive
try {
    val result : DefaultSuccessTemplate = apiInstance.adminInviteRequestsList(token, teamId, cursor, limit)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdminInviteRequestsApi#adminInviteRequestsList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdminInviteRequestsApi#adminInviteRequestsList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;admin.invites:read&#x60; |
 **teamId** | **kotlin.String**| ID for the workspace where the invite requests were made. | [optional]
 **cursor** | **kotlin.String**| Value of the &#x60;next_cursor&#x60; field sent as part of the previous API response | [optional]
 **limit** | **kotlin.Int**| The number of results that will be returned by the API on each invocation. Must be between 1 - 1000, both inclusive | [optional]

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

