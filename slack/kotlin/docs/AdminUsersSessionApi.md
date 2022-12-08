# AdminUsersSessionApi

All URIs are relative to *https://slack.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adminUsersSessionInvalidate**](AdminUsersSessionApi.md#adminUsersSessionInvalidate) | **POST** /admin.users.session.invalidate | 
[**adminUsersSessionReset**](AdminUsersSessionApi.md#adminUsersSessionReset) | **POST** /admin.users.session.reset | 


<a name="adminUsersSessionInvalidate"></a>
# **adminUsersSessionInvalidate**
> DefaultSuccessTemplate adminUsersSessionInvalidate(token, sessionId, teamId)



Invalidate a single session for a user by session_id

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = AdminUsersSessionApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `admin.users:write`
val sessionId : kotlin.Int = 56 // kotlin.Int | 
val teamId : kotlin.String = teamId_example // kotlin.String | ID of the team that the session belongs to
try {
    val result : DefaultSuccessTemplate = apiInstance.adminUsersSessionInvalidate(token, sessionId, teamId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdminUsersSessionApi#adminUsersSessionInvalidate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdminUsersSessionApi#adminUsersSessionInvalidate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;admin.users:write&#x60; |
 **sessionId** | **kotlin.Int**|  |
 **teamId** | **kotlin.String**| ID of the team that the session belongs to |

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="adminUsersSessionReset"></a>
# **adminUsersSessionReset**
> DefaultSuccessTemplate adminUsersSessionReset(token, userId, mobileOnly, webOnly)



Wipes all valid sessions on all devices for a given user

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = AdminUsersSessionApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `admin.users:write`
val userId : kotlin.String = userId_example // kotlin.String | The ID of the user to wipe sessions for
val mobileOnly : kotlin.Boolean = true // kotlin.Boolean | Only expire mobile sessions (default: false)
val webOnly : kotlin.Boolean = true // kotlin.Boolean | Only expire web sessions (default: false)
try {
    val result : DefaultSuccessTemplate = apiInstance.adminUsersSessionReset(token, userId, mobileOnly, webOnly)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdminUsersSessionApi#adminUsersSessionReset")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdminUsersSessionApi#adminUsersSessionReset")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;admin.users:write&#x60; |
 **userId** | **kotlin.String**| The ID of the user to wipe sessions for |
 **mobileOnly** | **kotlin.Boolean**| Only expire mobile sessions (default: false) | [optional]
 **webOnly** | **kotlin.Boolean**| Only expire web sessions (default: false) | [optional]

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

