# DndApi

All URIs are relative to *https://slack.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**dndEndDnd**](DndApi.md#dndEndDnd) | **POST** /dnd.endDnd | 
[**dndEndSnooze**](DndApi.md#dndEndSnooze) | **POST** /dnd.endSnooze | 
[**dndInfo**](DndApi.md#dndInfo) | **GET** /dnd.info | 
[**dndSetSnooze**](DndApi.md#dndSetSnooze) | **POST** /dnd.setSnooze | 
[**dndTeamInfo**](DndApi.md#dndTeamInfo) | **GET** /dnd.teamInfo | 


<a name="dndEndDnd"></a>
# **dndEndDnd**
> DndEndDndSchema dndEndDnd(token)



Ends the current user&#39;s Do Not Disturb session immediately.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = DndApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `dnd:write`
try {
    val result : DndEndDndSchema = apiInstance.dndEndDnd(token)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DndApi#dndEndDnd")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DndApi#dndEndDnd")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;dnd:write&#x60; |

### Return type

[**DndEndDndSchema**](DndEndDndSchema.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="dndEndSnooze"></a>
# **dndEndSnooze**
> DndEndSnoozeSchema dndEndSnooze(token)



Ends the current user&#39;s snooze mode immediately.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = DndApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `dnd:write`
try {
    val result : DndEndSnoozeSchema = apiInstance.dndEndSnooze(token)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DndApi#dndEndSnooze")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DndApi#dndEndSnooze")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;dnd:write&#x60; |

### Return type

[**DndEndSnoozeSchema**](DndEndSnoozeSchema.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="dndInfo"></a>
# **dndInfo**
> DndInfoSchema dndInfo(token, user)



Retrieves a user&#39;s current Do Not Disturb status.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = DndApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `dnd:read`
val user : kotlin.String = user_example // kotlin.String | User to fetch status for (defaults to current user)
try {
    val result : DndInfoSchema = apiInstance.dndInfo(token, user)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DndApi#dndInfo")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DndApi#dndInfo")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;dnd:read&#x60; | [optional]
 **user** | **kotlin.String**| User to fetch status for (defaults to current user) | [optional]

### Return type

[**DndInfoSchema**](DndInfoSchema.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="dndSetSnooze"></a>
# **dndSetSnooze**
> DndSetSnoozeSchema dndSetSnooze(numMinutes, token)



Turns on Do Not Disturb mode for the current user, or changes its duration.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = DndApi()
val numMinutes : kotlin.String = numMinutes_example // kotlin.String | Number of minutes, from now, to snooze until.
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `dnd:write`
try {
    val result : DndSetSnoozeSchema = apiInstance.dndSetSnooze(numMinutes, token)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DndApi#dndSetSnooze")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DndApi#dndSetSnooze")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **numMinutes** | **kotlin.String**| Number of minutes, from now, to snooze until. |
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;dnd:write&#x60; |

### Return type

[**DndSetSnoozeSchema**](DndSetSnoozeSchema.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="dndTeamInfo"></a>
# **dndTeamInfo**
> DefaultSuccessTemplate dndTeamInfo(token, users)



Retrieves the Do Not Disturb status for up to 50 users on a team.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = DndApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `dnd:read`
val users : kotlin.String = users_example // kotlin.String | Comma-separated list of users to fetch Do Not Disturb status for
try {
    val result : DefaultSuccessTemplate = apiInstance.dndTeamInfo(token, users)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DndApi#dndTeamInfo")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DndApi#dndTeamInfo")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;dnd:read&#x60; | [optional]
 **users** | **kotlin.String**| Comma-separated list of users to fetch Do Not Disturb status for | [optional]

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

