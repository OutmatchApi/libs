# EmojiApi

All URIs are relative to *https://slack.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**emojiList**](EmojiApi.md#emojiList) | **GET** /emoji.list | 


<a name="emojiList"></a>
# **emojiList**
> DefaultSuccessTemplate emojiList(token)



Lists custom emoji for a team.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = EmojiApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `emoji:read`
try {
    val result : DefaultSuccessTemplate = apiInstance.emojiList(token)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EmojiApi#emojiList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EmojiApi#emojiList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;emoji:read&#x60; |

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

