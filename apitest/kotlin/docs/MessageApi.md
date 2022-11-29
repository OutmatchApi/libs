# MessageApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createMessageApiV1AppAppIdMsgPost**](MessageApi.md#createMessageApiV1AppAppIdMsgPost) | **POST** /api/v1/app/{app_id}/msg/ | Create Message
[**getMessageApiV1AppAppIdMsgMsgIdGet**](MessageApi.md#getMessageApiV1AppAppIdMsgMsgIdGet) | **GET** /api/v1/app/{app_id}/msg/{msg_id}/ | Get Message
[**listMessagesApiV1AppAppIdMsgGet**](MessageApi.md#listMessagesApiV1AppAppIdMsgGet) | **GET** /api/v1/app/{app_id}/msg/ | List Messages


<a name="createMessageApiV1AppAppIdMsgPost"></a>
# **createMessageApiV1AppAppIdMsgPost**
> MessageOut createMessageApiV1AppAppIdMsgPost(appId, messageIn, withContent, idempotencyKey)

Create Message

Creates a new message and dispatches it to all of the application&#39;s endpoints.  The &#x60;eventId&#x60; is an optional custom unique ID. It&#39;s verified to be unique only up to a day, after that no verification will be made. If a message with the same &#x60;eventId&#x60; already exists for any application in your environment, a 409 conflict error will be returned.  The &#x60;eventType&#x60; indicates the type and schema of the event. All messages of a certain &#x60;eventType&#x60; are expected to have the same schema. Endpoints can choose to only listen to specific event types. Messages can also have &#x60;channels&#x60;, which similar to event types let endpoints filter by them. Unlike event types, messages can have multiple channels, and channels don&#39;t imply a specific message content or schema.  The &#x60;payload&#39; property is the webhook&#39;s body (the actual webhook message).

### Example
```kotlin
// Import classes:
//import apitest.infrastructure.*
//import com.outmatchapi.apitest.*

val apiInstance = MessageApi()
val appId : kotlin.String = app_1srOrx2ZWZBpBUvZwXKQmoEYga2 // kotlin.String | 
val messageIn : MessageIn =  // MessageIn | 
val withContent : kotlin.Boolean = true // kotlin.Boolean | 
val idempotencyKey : kotlin.String = idempotencyKey_example // kotlin.String | The request's idempotency key
try {
    val result : MessageOut = apiInstance.createMessageApiV1AppAppIdMsgPost(appId, messageIn, withContent, idempotencyKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MessageApi#createMessageApiV1AppAppIdMsgPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MessageApi#createMessageApiV1AppAppIdMsgPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **kotlin.String**|  |
 **messageIn** | [**MessageIn**](MessageIn.md)|  |
 **withContent** | **kotlin.Boolean**|  | [optional] [default to true]
 **idempotencyKey** | **kotlin.String**| The request&#39;s idempotency key | [optional]

### Return type

[**MessageOut**](MessageOut.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getMessageApiV1AppAppIdMsgMsgIdGet"></a>
# **getMessageApiV1AppAppIdMsgMsgIdGet**
> MessageOut getMessageApiV1AppAppIdMsgMsgIdGet(msgId, appId, idempotencyKey)

Get Message

Get a message by its ID or eventID.

### Example
```kotlin
// Import classes:
//import apitest.infrastructure.*
//import com.outmatchapi.apitest.*

val apiInstance = MessageApi()
val msgId : kotlin.String = msg_1srOrx2ZWZBpBUvZwXKQmoEYga2 // kotlin.String | 
val appId : kotlin.String = app_1srOrx2ZWZBpBUvZwXKQmoEYga2 // kotlin.String | 
val idempotencyKey : kotlin.String = idempotencyKey_example // kotlin.String | The request's idempotency key
try {
    val result : MessageOut = apiInstance.getMessageApiV1AppAppIdMsgMsgIdGet(msgId, appId, idempotencyKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MessageApi#getMessageApiV1AppAppIdMsgMsgIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MessageApi#getMessageApiV1AppAppIdMsgMsgIdGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **msgId** | **kotlin.String**|  |
 **appId** | **kotlin.String**|  |
 **idempotencyKey** | **kotlin.String**| The request&#39;s idempotency key | [optional]

### Return type

[**MessageOut**](MessageOut.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listMessagesApiV1AppAppIdMsgGet"></a>
# **listMessagesApiV1AppAppIdMsgGet**
> ListResponseMessageOut listMessagesApiV1AppAppIdMsgGet(appId, iterator, limit, eventTypes, channel, before, after, idempotencyKey)

List Messages

List all of the application&#39;s messages.  The &#x60;before&#x60; parameter lets you filter all items created before a certain date and is ignored if an iterator is passed. The &#x60;after&#x60; parameter lets you filter all items created after a certain date and is ignored if an iterator is passed. &#x60;before&#x60; and &#x60;after&#x60; cannot be used simultaneously.

### Example
```kotlin
// Import classes:
//import apitest.infrastructure.*
//import com.outmatchapi.apitest.*

val apiInstance = MessageApi()
val appId : kotlin.String = app_1srOrx2ZWZBpBUvZwXKQmoEYga2 // kotlin.String | 
val iterator : kotlin.String = msg_1srOrx2ZWZBpBUvZwXKQmoEYga2 // kotlin.String | 
val limit : kotlin.Int = 56 // kotlin.Int | 
val eventTypes : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | 
val channel : kotlin.String = project_1337 // kotlin.String | 
val before : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | 
val after : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | 
val idempotencyKey : kotlin.String = idempotencyKey_example // kotlin.String | The request's idempotency key
try {
    val result : ListResponseMessageOut = apiInstance.listMessagesApiV1AppAppIdMsgGet(appId, iterator, limit, eventTypes, channel, before, after, idempotencyKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MessageApi#listMessagesApiV1AppAppIdMsgGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MessageApi#listMessagesApiV1AppAppIdMsgGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **kotlin.String**|  |
 **iterator** | **kotlin.String**|  | [optional]
 **limit** | **kotlin.Int**|  | [optional] [default to 50]
 **eventTypes** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)|  | [optional]
 **channel** | **kotlin.String**|  | [optional]
 **before** | **java.time.OffsetDateTime**|  | [optional]
 **after** | **java.time.OffsetDateTime**|  | [optional]
 **idempotencyKey** | **kotlin.String**| The request&#39;s idempotency key | [optional]

### Return type

[**ListResponseMessageOut**](ListResponseMessageOut.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

