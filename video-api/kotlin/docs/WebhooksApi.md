# WebhooksApi

All URIs are relative to *https://ws.api.video*

Method | HTTP request | Description
------------- | ------------- | -------------
[**dELETEWebhook**](WebhooksApi.md#dELETEWebhook) | **DELETE** /webhooks/{webhookId} | Delete a Webhook
[**gETWebhook**](WebhooksApi.md#gETWebhook) | **GET** /webhooks/{webhookId} | Show Webhook details
[**lISTWebhooks**](WebhooksApi.md#lISTWebhooks) | **GET** /webhooks | List all webhooks
[**pOSTWebhooks**](WebhooksApi.md#pOSTWebhooks) | **POST** /webhooks | Create Webhook


<a name="dELETEWebhook"></a>
# **dELETEWebhook**
> dELETEWebhook(webhookId)

Delete a Webhook

This endpoint will delete the indicated webhook.

### Example
```kotlin
// Import classes:
//import video-api.infrastructure.*
//import com.outmatchapi.video-api.*

val apiInstance = WebhooksApi()
val webhookId : kotlin.String = webhookId_example // kotlin.String | The webhook you wish to delete.
try {
    apiInstance.dELETEWebhook(webhookId)
} catch (e: ClientException) {
    println("4xx response calling WebhooksApi#dELETEWebhook")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebhooksApi#dELETEWebhook")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookId** | **kotlin.String**| The webhook you wish to delete. |

### Return type

null (empty response body)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETWebhook"></a>
# **gETWebhook**
> Webhook gETWebhook(webhookId)

Show Webhook details

This call provides the same JSON information provided on Webjhook creation.

### Example
```kotlin
// Import classes:
//import video-api.infrastructure.*
//import com.outmatchapi.video-api.*

val apiInstance = WebhooksApi()
val webhookId : kotlin.String = webhookId_example // kotlin.String | The unique webhook you wish to retreive details on.
try {
    val result : Webhook = apiInstance.gETWebhook(webhookId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebhooksApi#gETWebhook")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebhooksApi#gETWebhook")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookId** | **kotlin.String**| The unique webhook you wish to retreive details on. |

### Return type

[**Webhook**](Webhook.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="lISTWebhooks"></a>
# **lISTWebhooks**
> WebhooksMinusListMinusResponse lISTWebhooks(events, currentPage, pageSize)

List all webhooks

Requests to this endpoint return a list of your webhooks (with all their details). You can filter what the webhook list that the API returns using the parameters described below.

### Example
```kotlin
// Import classes:
//import video-api.infrastructure.*
//import com.outmatchapi.video-api.*

val apiInstance = WebhooksApi()
val events : kotlin.String = video.encoding.quality.completed // kotlin.String | The webhook event that you wish to filter on.
val currentPage : kotlin.Int = 2 // kotlin.Int | Choose the number of search results to return per page. Minimum value: 1
val pageSize : kotlin.Int = 30 // kotlin.Int | Results per page. Allowed values 1-100, default is 25.
try {
    val result : WebhooksMinusListMinusResponse = apiInstance.lISTWebhooks(events, currentPage, pageSize)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebhooksApi#lISTWebhooks")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebhooksApi#lISTWebhooks")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **events** | **kotlin.String**| The webhook event that you wish to filter on. | [optional]
 **currentPage** | **kotlin.Int**| Choose the number of search results to return per page. Minimum value: 1 | [optional] [default to 1]
 **pageSize** | **kotlin.Int**| Results per page. Allowed values 1-100, default is 25. | [optional] [default to 25]

### Return type

[**WebhooksMinusListMinusResponse**](WebhooksMinusListMinusResponse.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="pOSTWebhooks"></a>
# **pOSTWebhooks**
> Webhook pOSTWebhooks(webhooksMinusCreateMinusPayload)

Create Webhook

Webhooks can push notifications to your server, rather than polling api.video for changes. We currently offer four events:  * &#x60;&#x60;&#x60;video.encoding.quality.completed&#x60;&#x60;&#x60;  When a new video is uploaded into your account, it will be encoded into several different HLS sizes/bitrates.  When each version is encoded, your webhook will get a notification.  It will look like &#x60;&#x60;&#x60;{ \\\&quot;type\\\&quot;: \\\&quot;video.encoding.quality.completed\\\&quot;, \\\&quot;emittedAt\\\&quot;: \\\&quot;2021-01-29T16:46:25.217+01:00\\\&quot;, \\\&quot;videoId\\\&quot;: \\\&quot;viXXXXXXXX\\\&quot;, \\\&quot;encoding\\\&quot;: \\\&quot;hls\\\&quot;, \\\&quot;quality\\\&quot;: \\\&quot;720p\\\&quot;} &#x60;&#x60;&#x60;. This request says that the 720p HLS encoding was completed. * &#x60;&#x60;&#x60;live-stream.broadcast.started&#x60;&#x60;&#x60;  When a livestream begins broadcasting, the broadcasting parameter changes from false to true, and this webhook fires. * &#x60;&#x60;&#x60;live-stream.broadcast.ended&#x60;&#x60;&#x60;  This event fores when the livestream has finished broadcasting, and the broadcasting parameter flips from false to true. * &#x60;&#x60;&#x60;video.source.recorded&#x60;&#x60;&#x60;  This event is similar to &#x60;&#x60;&#x60;video.encoding.quality.completed&#x60;&#x60;&#x60;, but tells you if a livestream has been recorded as a VOD.

### Example
```kotlin
// Import classes:
//import video-api.infrastructure.*
//import com.outmatchapi.video-api.*

val apiInstance = WebhooksApi()
val webhooksMinusCreateMinusPayload : WebhooksMinusCreateMinusPayload =  // WebhooksMinusCreateMinusPayload | 
try {
    val result : Webhook = apiInstance.pOSTWebhooks(webhooksMinusCreateMinusPayload)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebhooksApi#pOSTWebhooks")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebhooksApi#pOSTWebhooks")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhooksMinusCreateMinusPayload** | [**WebhooksMinusCreateMinusPayload**](WebhooksMinusCreateMinusPayload.md)|  | [optional]

### Return type

[**Webhook**](Webhook.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

