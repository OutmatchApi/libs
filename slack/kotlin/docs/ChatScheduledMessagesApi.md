# ChatScheduledMessagesApi

All URIs are relative to *https://slack.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**chatScheduledMessagesList**](ChatScheduledMessagesApi.md#chatScheduledMessagesList) | **GET** /chat.scheduledMessages.list | 


<a name="chatScheduledMessagesList"></a>
# **chatScheduledMessagesList**
> ChatScheduledMessagesListSchema chatScheduledMessagesList(token, channel, latest, oldest, limit, cursor)



Returns a list of scheduled messages.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = ChatScheduledMessagesApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `none`
val channel : kotlin.String = channel_example // kotlin.String | The channel of the scheduled messages
val latest : java.math.BigDecimal = 8.14 // java.math.BigDecimal | A UNIX timestamp of the latest value in the time range
val oldest : java.math.BigDecimal = 8.14 // java.math.BigDecimal | A UNIX timestamp of the oldest value in the time range
val limit : kotlin.Int = 56 // kotlin.Int | Maximum number of original entries to return.
val cursor : kotlin.String = cursor_example // kotlin.String | For pagination purposes, this is the `cursor` value returned from a previous call to `chat.scheduledmessages.list` indicating where you want to start this call from.
try {
    val result : ChatScheduledMessagesListSchema = apiInstance.chatScheduledMessagesList(token, channel, latest, oldest, limit, cursor)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ChatScheduledMessagesApi#chatScheduledMessagesList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ChatScheduledMessagesApi#chatScheduledMessagesList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;none&#x60; | [optional]
 **channel** | **kotlin.String**| The channel of the scheduled messages | [optional]
 **latest** | **java.math.BigDecimal**| A UNIX timestamp of the latest value in the time range | [optional]
 **oldest** | **java.math.BigDecimal**| A UNIX timestamp of the oldest value in the time range | [optional]
 **limit** | **kotlin.Int**| Maximum number of original entries to return. | [optional]
 **cursor** | **kotlin.String**| For pagination purposes, this is the &#x60;cursor&#x60; value returned from a previous call to &#x60;chat.scheduledmessages.list&#x60; indicating where you want to start this call from. | [optional]

### Return type

[**ChatScheduledMessagesListSchema**](ChatScheduledMessagesListSchema.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

