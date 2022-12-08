# RemindersApi

All URIs are relative to *https://slack.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**remindersAdd**](RemindersApi.md#remindersAdd) | **POST** /reminders.add | 
[**remindersComplete**](RemindersApi.md#remindersComplete) | **POST** /reminders.complete | 
[**remindersDelete**](RemindersApi.md#remindersDelete) | **POST** /reminders.delete | 
[**remindersInfo**](RemindersApi.md#remindersInfo) | **GET** /reminders.info | 
[**remindersList**](RemindersApi.md#remindersList) | **GET** /reminders.list | 


<a name="remindersAdd"></a>
# **remindersAdd**
> RemindersAddSchema remindersAdd(token, text, time, user)



Creates a reminder.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = RemindersApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `reminders:write`
val text : kotlin.String = text_example // kotlin.String | The content of the reminder
val time : kotlin.String = time_example // kotlin.String | When this reminder should happen: the Unix timestamp (up to five years from now), the number of seconds until the reminder (if within 24 hours), or a natural language description (Ex. \\\"in 15 minutes,\\\" or \\\"every Thursday\\\")
val user : kotlin.String = user_example // kotlin.String | The user who will receive the reminder. If no user is specified, the reminder will go to user who created it.
try {
    val result : RemindersAddSchema = apiInstance.remindersAdd(token, text, time, user)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RemindersApi#remindersAdd")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RemindersApi#remindersAdd")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;reminders:write&#x60; |
 **text** | **kotlin.String**| The content of the reminder |
 **time** | **kotlin.String**| When this reminder should happen: the Unix timestamp (up to five years from now), the number of seconds until the reminder (if within 24 hours), or a natural language description (Ex. \\\&quot;in 15 minutes,\\\&quot; or \\\&quot;every Thursday\\\&quot;) |
 **user** | **kotlin.String**| The user who will receive the reminder. If no user is specified, the reminder will go to user who created it. | [optional]

### Return type

[**RemindersAddSchema**](RemindersAddSchema.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="remindersComplete"></a>
# **remindersComplete**
> RemindersCompleteSchema remindersComplete(token, reminder)



Marks a reminder as complete.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = RemindersApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `reminders:write`
val reminder : kotlin.String = reminder_example // kotlin.String | The ID of the reminder to be marked as complete
try {
    val result : RemindersCompleteSchema = apiInstance.remindersComplete(token, reminder)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RemindersApi#remindersComplete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RemindersApi#remindersComplete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;reminders:write&#x60; | [optional]
 **reminder** | **kotlin.String**| The ID of the reminder to be marked as complete | [optional]

### Return type

[**RemindersCompleteSchema**](RemindersCompleteSchema.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="remindersDelete"></a>
# **remindersDelete**
> RemindersDeleteSchema remindersDelete(token, reminder)



Deletes a reminder.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = RemindersApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `reminders:write`
val reminder : kotlin.String = reminder_example // kotlin.String | The ID of the reminder
try {
    val result : RemindersDeleteSchema = apiInstance.remindersDelete(token, reminder)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RemindersApi#remindersDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RemindersApi#remindersDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;reminders:write&#x60; | [optional]
 **reminder** | **kotlin.String**| The ID of the reminder | [optional]

### Return type

[**RemindersDeleteSchema**](RemindersDeleteSchema.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="remindersInfo"></a>
# **remindersInfo**
> RemindersInfoSchema remindersInfo(token, reminder)



Gets information about a reminder.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = RemindersApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `reminders:read`
val reminder : kotlin.String = reminder_example // kotlin.String | The ID of the reminder
try {
    val result : RemindersInfoSchema = apiInstance.remindersInfo(token, reminder)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RemindersApi#remindersInfo")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RemindersApi#remindersInfo")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;reminders:read&#x60; | [optional]
 **reminder** | **kotlin.String**| The ID of the reminder | [optional]

### Return type

[**RemindersInfoSchema**](RemindersInfoSchema.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="remindersList"></a>
# **remindersList**
> RemindersListSchema remindersList(token)



Lists all reminders created by or for a given user.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = RemindersApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `reminders:read`
try {
    val result : RemindersListSchema = apiInstance.remindersList(token)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RemindersApi#remindersList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RemindersApi#remindersList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;reminders:read&#x60; | [optional]

### Return type

[**RemindersListSchema**](RemindersListSchema.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

