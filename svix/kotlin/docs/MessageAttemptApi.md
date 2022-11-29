# MessageAttemptApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAttemptApiV1AppAppIdMsgMsgIdAttemptAttemptIdGet**](MessageAttemptApi.md#getAttemptApiV1AppAppIdMsgMsgIdAttemptAttemptIdGet) | **GET** /api/v1/app/{app_id}/msg/{msg_id}/attempt/{attempt_id}/ | Get Attempt
[**listAttemptedDestinationsApiV1AppAppIdMsgMsgIdEndpointGet**](MessageAttemptApi.md#listAttemptedDestinationsApiV1AppAppIdMsgMsgIdEndpointGet) | **GET** /api/v1/app/{app_id}/msg/{msg_id}/endpoint/ | List Attempted Destinations
[**listAttemptedMessagesApiV1AppAppIdEndpointEndpointIdMsgGet**](MessageAttemptApi.md#listAttemptedMessagesApiV1AppAppIdEndpointEndpointIdMsgGet) | **GET** /api/v1/app/{app_id}/endpoint/{endpoint_id}/msg/ | List Attempted Messages
[**listAttemptsApiV1AppAppIdMsgMsgIdAttemptGet**](MessageAttemptApi.md#listAttemptsApiV1AppAppIdMsgMsgIdAttemptGet) | **GET** /api/v1/app/{app_id}/msg/{msg_id}/attempt/ | List Attempts
[**listAttemptsByEndpointApiV1AppAppIdAttemptEndpointEndpointIdGet**](MessageAttemptApi.md#listAttemptsByEndpointApiV1AppAppIdAttemptEndpointEndpointIdGet) | **GET** /api/v1/app/{app_id}/attempt/endpoint/{endpoint_id}/ | List Attempts By Endpoint
[**listAttemptsByMsgApiV1AppAppIdAttemptMsgMsgIdGet**](MessageAttemptApi.md#listAttemptsByMsgApiV1AppAppIdAttemptMsgMsgIdGet) | **GET** /api/v1/app/{app_id}/attempt/msg/{msg_id}/ | List Attempts By Msg
[**listAttemptsForEndpointApiV1AppAppIdMsgMsgIdEndpointEndpointIdAttemptGet**](MessageAttemptApi.md#listAttemptsForEndpointApiV1AppAppIdMsgMsgIdEndpointEndpointIdAttemptGet) | **GET** /api/v1/app/{app_id}/msg/{msg_id}/endpoint/{endpoint_id}/attempt/ | List Attempts For Endpoint
[**resendWebhookApiV1AppAppIdMsgMsgIdEndpointEndpointIdResendPost**](MessageAttemptApi.md#resendWebhookApiV1AppAppIdMsgMsgIdEndpointEndpointIdResendPost) | **POST** /api/v1/app/{app_id}/msg/{msg_id}/endpoint/{endpoint_id}/resend/ | Resend Webhook


<a name="getAttemptApiV1AppAppIdMsgMsgIdAttemptAttemptIdGet"></a>
# **getAttemptApiV1AppAppIdMsgMsgIdAttemptAttemptIdGet**
> MessageAttemptOut getAttemptApiV1AppAppIdMsgMsgIdAttemptAttemptIdGet(attemptId, msgId, appId, idempotencyKey)

Get Attempt

&#x60;msg_id&#x60;: Use a message id or a message &#x60;eventId&#x60;

### Example
```kotlin
// Import classes:
//import svix.infrastructure.*
//import com.outmatchapi.svix.*

val apiInstance = MessageAttemptApi()
val attemptId : kotlin.String = atmpt_1srOrx2ZWZBpBUvZwXKQmoEYga2 // kotlin.String | 
val msgId : kotlin.String = msg_1srOrx2ZWZBpBUvZwXKQmoEYga2 // kotlin.String | 
val appId : kotlin.String = app_1srOrx2ZWZBpBUvZwXKQmoEYga2 // kotlin.String | 
val idempotencyKey : kotlin.String = idempotencyKey_example // kotlin.String | The request's idempotency key
try {
    val result : MessageAttemptOut = apiInstance.getAttemptApiV1AppAppIdMsgMsgIdAttemptAttemptIdGet(attemptId, msgId, appId, idempotencyKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MessageAttemptApi#getAttemptApiV1AppAppIdMsgMsgIdAttemptAttemptIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MessageAttemptApi#getAttemptApiV1AppAppIdMsgMsgIdAttemptAttemptIdGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **attemptId** | **kotlin.String**|  |
 **msgId** | **kotlin.String**|  |
 **appId** | **kotlin.String**|  |
 **idempotencyKey** | **kotlin.String**| The request&#39;s idempotency key | [optional]

### Return type

[**MessageAttemptOut**](MessageAttemptOut.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listAttemptedDestinationsApiV1AppAppIdMsgMsgIdEndpointGet"></a>
# **listAttemptedDestinationsApiV1AppAppIdMsgMsgIdEndpointGet**
> ListResponseMessageEndpointOut listAttemptedDestinationsApiV1AppAppIdMsgMsgIdEndpointGet(msgId, appId, iterator, limit, idempotencyKey)

List Attempted Destinations

&#x60;msg_id&#x60;: Use a message id or a message &#x60;eventId&#x60;

### Example
```kotlin
// Import classes:
//import svix.infrastructure.*
//import com.outmatchapi.svix.*

val apiInstance = MessageAttemptApi()
val msgId : kotlin.String = msg_1srOrx2ZWZBpBUvZwXKQmoEYga2 // kotlin.String | 
val appId : kotlin.String = app_1srOrx2ZWZBpBUvZwXKQmoEYga2 // kotlin.String | 
val iterator : kotlin.String = msgep_1srOrx2ZWZBpBUvZwXKQmoEYga2 // kotlin.String | 
val limit : kotlin.Int = 56 // kotlin.Int | 
val idempotencyKey : kotlin.String = idempotencyKey_example // kotlin.String | The request's idempotency key
try {
    val result : ListResponseMessageEndpointOut = apiInstance.listAttemptedDestinationsApiV1AppAppIdMsgMsgIdEndpointGet(msgId, appId, iterator, limit, idempotencyKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MessageAttemptApi#listAttemptedDestinationsApiV1AppAppIdMsgMsgIdEndpointGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MessageAttemptApi#listAttemptedDestinationsApiV1AppAppIdMsgMsgIdEndpointGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **msgId** | **kotlin.String**|  |
 **appId** | **kotlin.String**|  |
 **iterator** | **kotlin.String**|  | [optional]
 **limit** | **kotlin.Int**|  | [optional] [default to 50]
 **idempotencyKey** | **kotlin.String**| The request&#39;s idempotency key | [optional]

### Return type

[**ListResponseMessageEndpointOut**](ListResponseMessageEndpointOut.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listAttemptedMessagesApiV1AppAppIdEndpointEndpointIdMsgGet"></a>
# **listAttemptedMessagesApiV1AppAppIdEndpointEndpointIdMsgGet**
> ListResponseEndpointMessageOut listAttemptedMessagesApiV1AppAppIdEndpointEndpointIdMsgGet(endpointId, appId, iterator, limit, channel, status, before, after, idempotencyKey)

List Attempted Messages

List messages for a particular endpoint. Additionally includes metadata about the latest message attempt.  The &#x60;before&#x60; parameter lets you filter all items created before a certain date and is ignored if an iterator is passed.

### Example
```kotlin
// Import classes:
//import svix.infrastructure.*
//import com.outmatchapi.svix.*

val apiInstance = MessageAttemptApi()
val endpointId : kotlin.String = ep_1srOrx2ZWZBpBUvZwXKQmoEYga2 // kotlin.String | 
val appId : kotlin.String = app_1srOrx2ZWZBpBUvZwXKQmoEYga2 // kotlin.String | 
val iterator : kotlin.String = msg_1srOrx2ZWZBpBUvZwXKQmoEYga2 // kotlin.String | 
val limit : kotlin.Int = 56 // kotlin.Int | 
val channel : kotlin.String = project_1337 // kotlin.String | 
val status : MessageStatus =  // MessageStatus | 
val before : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | 
val after : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | 
val idempotencyKey : kotlin.String = idempotencyKey_example // kotlin.String | The request's idempotency key
try {
    val result : ListResponseEndpointMessageOut = apiInstance.listAttemptedMessagesApiV1AppAppIdEndpointEndpointIdMsgGet(endpointId, appId, iterator, limit, channel, status, before, after, idempotencyKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MessageAttemptApi#listAttemptedMessagesApiV1AppAppIdEndpointEndpointIdMsgGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MessageAttemptApi#listAttemptedMessagesApiV1AppAppIdEndpointEndpointIdMsgGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **endpointId** | **kotlin.String**|  |
 **appId** | **kotlin.String**|  |
 **iterator** | **kotlin.String**|  | [optional]
 **limit** | **kotlin.Int**|  | [optional] [default to 50]
 **channel** | **kotlin.String**|  | [optional]
 **status** | [**MessageStatus**](.md)|  | [optional] [enum: 0, 1, 2, 3]
 **before** | **java.time.OffsetDateTime**|  | [optional]
 **after** | **java.time.OffsetDateTime**|  | [optional]
 **idempotencyKey** | **kotlin.String**| The request&#39;s idempotency key | [optional]

### Return type

[**ListResponseEndpointMessageOut**](ListResponseEndpointMessageOut.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listAttemptsApiV1AppAppIdMsgMsgIdAttemptGet"></a>
# **listAttemptsApiV1AppAppIdMsgMsgIdAttemptGet**
> ListResponseMessageAttemptOut listAttemptsApiV1AppAppIdMsgMsgIdAttemptGet(appId, msgId, iterator, limit, endpointId, eventTypes, channel, status, before, after, idempotencyKey)

List Attempts

Deprecated: Please use \&quot;List Attempts by Endpoint\&quot; and \&quot;List Attempts by Msg\&quot; instead.  &#x60;msg_id&#x60;: Use a message id or a message &#x60;eventId&#x60;

### Example
```kotlin
// Import classes:
//import svix.infrastructure.*
//import com.outmatchapi.svix.*

val apiInstance = MessageAttemptApi()
val appId : kotlin.String = app_1srOrx2ZWZBpBUvZwXKQmoEYga2 // kotlin.String | 
val msgId : kotlin.String = msg_1srOrx2ZWZBpBUvZwXKQmoEYga2 // kotlin.String | 
val iterator : kotlin.String = atmpt_1srOrx2ZWZBpBUvZwXKQmoEYga2 // kotlin.String | 
val limit : kotlin.Int = 56 // kotlin.Int | 
val endpointId : kotlin.String = ep_1srOrx2ZWZBpBUvZwXKQmoEYga2 // kotlin.String | 
val eventTypes : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | 
val channel : kotlin.String = project_1337 // kotlin.String | 
val status : MessageStatus =  // MessageStatus | 
val before : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | 
val after : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | 
val idempotencyKey : kotlin.String = idempotencyKey_example // kotlin.String | The request's idempotency key
try {
    val result : ListResponseMessageAttemptOut = apiInstance.listAttemptsApiV1AppAppIdMsgMsgIdAttemptGet(appId, msgId, iterator, limit, endpointId, eventTypes, channel, status, before, after, idempotencyKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MessageAttemptApi#listAttemptsApiV1AppAppIdMsgMsgIdAttemptGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MessageAttemptApi#listAttemptsApiV1AppAppIdMsgMsgIdAttemptGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **kotlin.String**|  |
 **msgId** | **kotlin.String**|  |
 **iterator** | **kotlin.String**|  | [optional]
 **limit** | **kotlin.Int**|  | [optional] [default to 50]
 **endpointId** | **kotlin.String**|  | [optional]
 **eventTypes** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)|  | [optional]
 **channel** | **kotlin.String**|  | [optional]
 **status** | [**MessageStatus**](.md)|  | [optional] [enum: 0, 1, 2, 3]
 **before** | **java.time.OffsetDateTime**|  | [optional]
 **after** | **java.time.OffsetDateTime**|  | [optional]
 **idempotencyKey** | **kotlin.String**| The request&#39;s idempotency key | [optional]

### Return type

[**ListResponseMessageAttemptOut**](ListResponseMessageAttemptOut.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listAttemptsByEndpointApiV1AppAppIdAttemptEndpointEndpointIdGet"></a>
# **listAttemptsByEndpointApiV1AppAppIdAttemptEndpointEndpointIdGet**
> ListResponseMessageAttemptOut listAttemptsByEndpointApiV1AppAppIdAttemptEndpointEndpointIdGet(appId, endpointId, iterator, limit, status, statusCodeClass, eventTypes, channel, before, after, idempotencyKey)

List Attempts By Endpoint

List attempts by endpoint id

### Example
```kotlin
// Import classes:
//import svix.infrastructure.*
//import com.outmatchapi.svix.*

val apiInstance = MessageAttemptApi()
val appId : kotlin.String = app_1srOrx2ZWZBpBUvZwXKQmoEYga2 // kotlin.String | 
val endpointId : kotlin.String = ep_1srOrx2ZWZBpBUvZwXKQmoEYga2 // kotlin.String | 
val iterator : kotlin.String = atmpt_1srOrx2ZWZBpBUvZwXKQmoEYga2 // kotlin.String | 
val limit : kotlin.Int = 56 // kotlin.Int | 
val status : MessageStatus =  // MessageStatus | 
val statusCodeClass : StatusCodeClass =  // StatusCodeClass | 
val eventTypes : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | 
val channel : kotlin.String = project_1337 // kotlin.String | 
val before : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | 
val after : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | 
val idempotencyKey : kotlin.String = idempotencyKey_example // kotlin.String | The request's idempotency key
try {
    val result : ListResponseMessageAttemptOut = apiInstance.listAttemptsByEndpointApiV1AppAppIdAttemptEndpointEndpointIdGet(appId, endpointId, iterator, limit, status, statusCodeClass, eventTypes, channel, before, after, idempotencyKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MessageAttemptApi#listAttemptsByEndpointApiV1AppAppIdAttemptEndpointEndpointIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MessageAttemptApi#listAttemptsByEndpointApiV1AppAppIdAttemptEndpointEndpointIdGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **kotlin.String**|  |
 **endpointId** | **kotlin.String**|  |
 **iterator** | **kotlin.String**|  | [optional]
 **limit** | **kotlin.Int**|  | [optional] [default to 50]
 **status** | [**MessageStatus**](.md)|  | [optional] [enum: 0, 1, 2, 3]
 **statusCodeClass** | [**StatusCodeClass**](.md)|  | [optional] [enum: 0, 100, 200, 300, 400, 500]
 **eventTypes** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)|  | [optional]
 **channel** | **kotlin.String**|  | [optional]
 **before** | **java.time.OffsetDateTime**|  | [optional]
 **after** | **java.time.OffsetDateTime**|  | [optional]
 **idempotencyKey** | **kotlin.String**| The request&#39;s idempotency key | [optional]

### Return type

[**ListResponseMessageAttemptOut**](ListResponseMessageAttemptOut.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listAttemptsByMsgApiV1AppAppIdAttemptMsgMsgIdGet"></a>
# **listAttemptsByMsgApiV1AppAppIdAttemptMsgMsgIdGet**
> ListResponseMessageAttemptOut listAttemptsByMsgApiV1AppAppIdAttemptMsgMsgIdGet(appId, msgId, endpointId, iterator, limit, status, statusCodeClass, eventTypes, channel, before, after, idempotencyKey)

List Attempts By Msg

List attempts by message id

### Example
```kotlin
// Import classes:
//import svix.infrastructure.*
//import com.outmatchapi.svix.*

val apiInstance = MessageAttemptApi()
val appId : kotlin.String = app_1srOrx2ZWZBpBUvZwXKQmoEYga2 // kotlin.String | 
val msgId : kotlin.String = msg_1srOrx2ZWZBpBUvZwXKQmoEYga2 // kotlin.String | 
val endpointId : kotlin.String = ep_1srOrx2ZWZBpBUvZwXKQmoEYga2 // kotlin.String | 
val iterator : kotlin.String = atmpt_1srOrx2ZWZBpBUvZwXKQmoEYga2 // kotlin.String | 
val limit : kotlin.Int = 56 // kotlin.Int | 
val status : MessageStatus =  // MessageStatus | 
val statusCodeClass : StatusCodeClass =  // StatusCodeClass | 
val eventTypes : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | 
val channel : kotlin.String = project_1337 // kotlin.String | 
val before : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | 
val after : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | 
val idempotencyKey : kotlin.String = idempotencyKey_example // kotlin.String | The request's idempotency key
try {
    val result : ListResponseMessageAttemptOut = apiInstance.listAttemptsByMsgApiV1AppAppIdAttemptMsgMsgIdGet(appId, msgId, endpointId, iterator, limit, status, statusCodeClass, eventTypes, channel, before, after, idempotencyKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MessageAttemptApi#listAttemptsByMsgApiV1AppAppIdAttemptMsgMsgIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MessageAttemptApi#listAttemptsByMsgApiV1AppAppIdAttemptMsgMsgIdGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **kotlin.String**|  |
 **msgId** | **kotlin.String**|  |
 **endpointId** | **kotlin.String**|  | [optional]
 **iterator** | **kotlin.String**|  | [optional]
 **limit** | **kotlin.Int**|  | [optional] [default to 50]
 **status** | [**MessageStatus**](.md)|  | [optional] [enum: 0, 1, 2, 3]
 **statusCodeClass** | [**StatusCodeClass**](.md)|  | [optional] [enum: 0, 100, 200, 300, 400, 500]
 **eventTypes** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)|  | [optional]
 **channel** | **kotlin.String**|  | [optional]
 **before** | **java.time.OffsetDateTime**|  | [optional]
 **after** | **java.time.OffsetDateTime**|  | [optional]
 **idempotencyKey** | **kotlin.String**| The request&#39;s idempotency key | [optional]

### Return type

[**ListResponseMessageAttemptOut**](ListResponseMessageAttemptOut.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listAttemptsForEndpointApiV1AppAppIdMsgMsgIdEndpointEndpointIdAttemptGet"></a>
# **listAttemptsForEndpointApiV1AppAppIdMsgMsgIdEndpointEndpointIdAttemptGet**
> ListResponseMessageAttemptEndpointOut listAttemptsForEndpointApiV1AppAppIdMsgMsgIdEndpointEndpointIdAttemptGet(msgId, appId, endpointId, iterator, limit, eventTypes, channel, status, before, after, idempotencyKey)

List Attempts For Endpoint

DEPRECATED: please use list_attempts with endpoint_id as a query parameter instead.  List the message attempts for a particular endpoint.  Returning the endpoint.  The &#x60;before&#x60; parameter lets you filter all items created before a certain date and is ignored if an iterator is passed.

### Example
```kotlin
// Import classes:
//import svix.infrastructure.*
//import com.outmatchapi.svix.*

val apiInstance = MessageAttemptApi()
val msgId : kotlin.String = msg_1srOrx2ZWZBpBUvZwXKQmoEYga2 // kotlin.String | 
val appId : kotlin.String = app_1srOrx2ZWZBpBUvZwXKQmoEYga2 // kotlin.String | 
val endpointId : kotlin.String = ep_1srOrx2ZWZBpBUvZwXKQmoEYga2 // kotlin.String | 
val iterator : kotlin.String = atmpt_1srOrx2ZWZBpBUvZwXKQmoEYga2 // kotlin.String | 
val limit : kotlin.Int = 56 // kotlin.Int | 
val eventTypes : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | 
val channel : kotlin.String = project_1337 // kotlin.String | 
val status : MessageStatus =  // MessageStatus | 
val before : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | 
val after : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | 
val idempotencyKey : kotlin.String = idempotencyKey_example // kotlin.String | The request's idempotency key
try {
    val result : ListResponseMessageAttemptEndpointOut = apiInstance.listAttemptsForEndpointApiV1AppAppIdMsgMsgIdEndpointEndpointIdAttemptGet(msgId, appId, endpointId, iterator, limit, eventTypes, channel, status, before, after, idempotencyKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MessageAttemptApi#listAttemptsForEndpointApiV1AppAppIdMsgMsgIdEndpointEndpointIdAttemptGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MessageAttemptApi#listAttemptsForEndpointApiV1AppAppIdMsgMsgIdEndpointEndpointIdAttemptGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **msgId** | **kotlin.String**|  |
 **appId** | **kotlin.String**|  |
 **endpointId** | **kotlin.String**|  |
 **iterator** | **kotlin.String**|  | [optional]
 **limit** | **kotlin.Int**|  | [optional] [default to 50]
 **eventTypes** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)|  | [optional]
 **channel** | **kotlin.String**|  | [optional]
 **status** | [**MessageStatus**](.md)|  | [optional] [enum: 0, 1, 2, 3]
 **before** | **java.time.OffsetDateTime**|  | [optional]
 **after** | **java.time.OffsetDateTime**|  | [optional]
 **idempotencyKey** | **kotlin.String**| The request&#39;s idempotency key | [optional]

### Return type

[**ListResponseMessageAttemptEndpointOut**](ListResponseMessageAttemptEndpointOut.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="resendWebhookApiV1AppAppIdMsgMsgIdEndpointEndpointIdResendPost"></a>
# **resendWebhookApiV1AppAppIdMsgMsgIdEndpointEndpointIdResendPost**
> resendWebhookApiV1AppAppIdMsgMsgIdEndpointEndpointIdResendPost(endpointId, msgId, appId, idempotencyKey)

Resend Webhook

Resend a message to the specified endpoint.

### Example
```kotlin
// Import classes:
//import svix.infrastructure.*
//import com.outmatchapi.svix.*

val apiInstance = MessageAttemptApi()
val endpointId : kotlin.String = ep_1srOrx2ZWZBpBUvZwXKQmoEYga2 // kotlin.String | 
val msgId : kotlin.String = msg_1srOrx2ZWZBpBUvZwXKQmoEYga2 // kotlin.String | 
val appId : kotlin.String = app_1srOrx2ZWZBpBUvZwXKQmoEYga2 // kotlin.String | 
val idempotencyKey : kotlin.String = idempotencyKey_example // kotlin.String | The request's idempotency key
try {
    apiInstance.resendWebhookApiV1AppAppIdMsgMsgIdEndpointEndpointIdResendPost(endpointId, msgId, appId, idempotencyKey)
} catch (e: ClientException) {
    println("4xx response calling MessageAttemptApi#resendWebhookApiV1AppAppIdMsgMsgIdEndpointEndpointIdResendPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MessageAttemptApi#resendWebhookApiV1AppAppIdMsgMsgIdEndpointEndpointIdResendPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **endpointId** | **kotlin.String**|  |
 **msgId** | **kotlin.String**|  |
 **appId** | **kotlin.String**|  |
 **idempotencyKey** | **kotlin.String**| The request&#39;s idempotency key | [optional]

### Return type

null (empty response body)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

