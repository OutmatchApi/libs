# RtmApi

All URIs are relative to *https://slack.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**rtmConnect**](RtmApi.md#rtmConnect) | **GET** /rtm.connect | 


<a name="rtmConnect"></a>
# **rtmConnect**
> RtmConnectSchema rtmConnect(token, batchPresenceAware, presenceSub)



Starts a Real Time Messaging session.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = RtmApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `rtm:stream`
val batchPresenceAware : kotlin.Boolean = true // kotlin.Boolean | Batch presence deliveries via subscription. Enabling changes the shape of `presence_change` events. See [batch presence](/docs/presence-and-status#batching).
val presenceSub : kotlin.Boolean = true // kotlin.Boolean | Only deliver presence events when requested by subscription. See [presence subscriptions](/docs/presence-and-status#subscriptions).
try {
    val result : RtmConnectSchema = apiInstance.rtmConnect(token, batchPresenceAware, presenceSub)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RtmApi#rtmConnect")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RtmApi#rtmConnect")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;rtm:stream&#x60; |
 **batchPresenceAware** | **kotlin.Boolean**| Batch presence deliveries via subscription. Enabling changes the shape of &#x60;presence_change&#x60; events. See [batch presence](/docs/presence-and-status#batching). | [optional]
 **presenceSub** | **kotlin.Boolean**| Only deliver presence events when requested by subscription. See [presence subscriptions](/docs/presence-and-status#subscriptions). | [optional]

### Return type

[**RtmConnectSchema**](RtmConnectSchema.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

