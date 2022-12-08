# DialogApi

All URIs are relative to *https://slack.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**dialogOpen**](DialogApi.md#dialogOpen) | **GET** /dialog.open | 


<a name="dialogOpen"></a>
# **dialogOpen**
> DialogOpenSchema dialogOpen(token, dialog, triggerId)



Open a dialog with a user

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = DialogApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `none`
val dialog : kotlin.String = dialog_example // kotlin.String | The dialog definition. This must be a JSON-encoded string.
val triggerId : kotlin.String = triggerId_example // kotlin.String | Exchange a trigger to post to the user.
try {
    val result : DialogOpenSchema = apiInstance.dialogOpen(token, dialog, triggerId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DialogApi#dialogOpen")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DialogApi#dialogOpen")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;none&#x60; |
 **dialog** | **kotlin.String**| The dialog definition. This must be a JSON-encoded string. |
 **triggerId** | **kotlin.String**| Exchange a trigger to post to the user. |

### Return type

[**DialogOpenSchema**](DialogOpenSchema.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

