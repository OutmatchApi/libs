# BotsApi

All URIs are relative to *https://slack.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**botsInfo**](BotsApi.md#botsInfo) | **GET** /bots.info | 


<a name="botsInfo"></a>
# **botsInfo**
> BotsInfoSchema botsInfo(token, bot)



Gets information about a bot user.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = BotsApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `users:read`
val bot : kotlin.String = bot_example // kotlin.String | Bot user to get info on
try {
    val result : BotsInfoSchema = apiInstance.botsInfo(token, bot)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BotsApi#botsInfo")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BotsApi#botsInfo")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;users:read&#x60; |
 **bot** | **kotlin.String**| Bot user to get info on | [optional]

### Return type

[**BotsInfoSchema**](BotsInfoSchema.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

