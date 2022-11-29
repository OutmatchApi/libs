# EndpointApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createEndpointApiV1AppAppIdEndpointPost**](EndpointApi.md#createEndpointApiV1AppAppIdEndpointPost) | **POST** /api/v1/app/{app_id}/endpoint/ | Create Endpoint
[**deleteEndpointApiV1AppAppIdEndpointEndpointIdDelete**](EndpointApi.md#deleteEndpointApiV1AppAppIdEndpointEndpointIdDelete) | **DELETE** /api/v1/app/{app_id}/endpoint/{endpoint_id}/ | Delete Endpoint
[**getEndpointApiV1AppAppIdEndpointEndpointIdGet**](EndpointApi.md#getEndpointApiV1AppAppIdEndpointEndpointIdGet) | **GET** /api/v1/app/{app_id}/endpoint/{endpoint_id}/ | Get Endpoint
[**getEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersGet**](EndpointApi.md#getEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersGet) | **GET** /api/v1/app/{app_id}/endpoint/{endpoint_id}/headers/ | Get Endpoint Headers
[**getEndpointSecretApiV1AppAppIdEndpointEndpointIdSecretGet**](EndpointApi.md#getEndpointSecretApiV1AppAppIdEndpointEndpointIdSecretGet) | **GET** /api/v1/app/{app_id}/endpoint/{endpoint_id}/secret/ | Get Endpoint Secret
[**getEndpointStatsApiV1AppAppIdEndpointEndpointIdStatsGet**](EndpointApi.md#getEndpointStatsApiV1AppAppIdEndpointEndpointIdStatsGet) | **GET** /api/v1/app/{app_id}/endpoint/{endpoint_id}/stats/ | Get Endpoint Stats
[**listEndpointsApiV1AppAppIdEndpointGet**](EndpointApi.md#listEndpointsApiV1AppAppIdEndpointGet) | **GET** /api/v1/app/{app_id}/endpoint/ | List Endpoints
[**patchEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersPatch**](EndpointApi.md#patchEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersPatch) | **PATCH** /api/v1/app/{app_id}/endpoint/{endpoint_id}/headers/ | Patch Endpoint Headers
[**recoverFailedWebhooksApiV1AppAppIdEndpointEndpointIdRecoverPost**](EndpointApi.md#recoverFailedWebhooksApiV1AppAppIdEndpointEndpointIdRecoverPost) | **POST** /api/v1/app/{app_id}/endpoint/{endpoint_id}/recover/ | Recover Failed Webhooks
[**replayMissingWebhooksApiV1AppAppIdEndpointEndpointIdReplayMissingPost**](EndpointApi.md#replayMissingWebhooksApiV1AppAppIdEndpointEndpointIdReplayMissingPost) | **POST** /api/v1/app/{app_id}/endpoint/{endpoint_id}/replay-missing/ | Replay Missing Webhooks
[**rotateEndpointSecretApiV1AppAppIdEndpointEndpointIdSecretRotatePost**](EndpointApi.md#rotateEndpointSecretApiV1AppAppIdEndpointEndpointIdSecretRotatePost) | **POST** /api/v1/app/{app_id}/endpoint/{endpoint_id}/secret/rotate/ | Rotate Endpoint Secret
[**updateEndpointApiV1AppAppIdEndpointEndpointIdPut**](EndpointApi.md#updateEndpointApiV1AppAppIdEndpointEndpointIdPut) | **PUT** /api/v1/app/{app_id}/endpoint/{endpoint_id}/ | Update Endpoint
[**updateEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersPut**](EndpointApi.md#updateEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersPut) | **PUT** /api/v1/app/{app_id}/endpoint/{endpoint_id}/headers/ | Update Endpoint Headers


<a name="createEndpointApiV1AppAppIdEndpointPost"></a>
# **createEndpointApiV1AppAppIdEndpointPost**
> EndpointOut createEndpointApiV1AppAppIdEndpointPost(appId, endpointIn, idempotencyKey)

Create Endpoint

Create a new endpoint for the application.  When &#x60;secret&#x60; is &#x60;null&#x60; the secret is automatically generated (recommended)

### Example
```kotlin
// Import classes:
//import apitest.infrastructure.*
//import com.outmatchapi.apitest.*

val apiInstance = EndpointApi()
val appId : kotlin.String = app_1srOrx2ZWZBpBUvZwXKQmoEYga2 // kotlin.String | 
val endpointIn : EndpointIn =  // EndpointIn | 
val idempotencyKey : kotlin.String = idempotencyKey_example // kotlin.String | The request's idempotency key
try {
    val result : EndpointOut = apiInstance.createEndpointApiV1AppAppIdEndpointPost(appId, endpointIn, idempotencyKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EndpointApi#createEndpointApiV1AppAppIdEndpointPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EndpointApi#createEndpointApiV1AppAppIdEndpointPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **kotlin.String**|  |
 **endpointIn** | [**EndpointIn**](EndpointIn.md)|  |
 **idempotencyKey** | **kotlin.String**| The request&#39;s idempotency key | [optional]

### Return type

[**EndpointOut**](EndpointOut.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteEndpointApiV1AppAppIdEndpointEndpointIdDelete"></a>
# **deleteEndpointApiV1AppAppIdEndpointEndpointIdDelete**
> deleteEndpointApiV1AppAppIdEndpointEndpointIdDelete(endpointId, appId, idempotencyKey)

Delete Endpoint

Delete an endpoint.

### Example
```kotlin
// Import classes:
//import apitest.infrastructure.*
//import com.outmatchapi.apitest.*

val apiInstance = EndpointApi()
val endpointId : kotlin.String = ep_1srOrx2ZWZBpBUvZwXKQmoEYga2 // kotlin.String | 
val appId : kotlin.String = app_1srOrx2ZWZBpBUvZwXKQmoEYga2 // kotlin.String | 
val idempotencyKey : kotlin.String = idempotencyKey_example // kotlin.String | The request's idempotency key
try {
    apiInstance.deleteEndpointApiV1AppAppIdEndpointEndpointIdDelete(endpointId, appId, idempotencyKey)
} catch (e: ClientException) {
    println("4xx response calling EndpointApi#deleteEndpointApiV1AppAppIdEndpointEndpointIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EndpointApi#deleteEndpointApiV1AppAppIdEndpointEndpointIdDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **endpointId** | **kotlin.String**|  |
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

<a name="getEndpointApiV1AppAppIdEndpointEndpointIdGet"></a>
# **getEndpointApiV1AppAppIdEndpointEndpointIdGet**
> EndpointOut getEndpointApiV1AppAppIdEndpointEndpointIdGet(endpointId, appId, idempotencyKey)

Get Endpoint

Get an application.

### Example
```kotlin
// Import classes:
//import apitest.infrastructure.*
//import com.outmatchapi.apitest.*

val apiInstance = EndpointApi()
val endpointId : kotlin.String = ep_1srOrx2ZWZBpBUvZwXKQmoEYga2 // kotlin.String | 
val appId : kotlin.String = app_1srOrx2ZWZBpBUvZwXKQmoEYga2 // kotlin.String | 
val idempotencyKey : kotlin.String = idempotencyKey_example // kotlin.String | The request's idempotency key
try {
    val result : EndpointOut = apiInstance.getEndpointApiV1AppAppIdEndpointEndpointIdGet(endpointId, appId, idempotencyKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EndpointApi#getEndpointApiV1AppAppIdEndpointEndpointIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EndpointApi#getEndpointApiV1AppAppIdEndpointEndpointIdGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **endpointId** | **kotlin.String**|  |
 **appId** | **kotlin.String**|  |
 **idempotencyKey** | **kotlin.String**| The request&#39;s idempotency key | [optional]

### Return type

[**EndpointOut**](EndpointOut.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersGet"></a>
# **getEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersGet**
> EndpointHeadersOut getEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersGet(endpointId, appId, idempotencyKey)

Get Endpoint Headers

Get the additional headers to be sent with the webhook

### Example
```kotlin
// Import classes:
//import apitest.infrastructure.*
//import com.outmatchapi.apitest.*

val apiInstance = EndpointApi()
val endpointId : kotlin.String = ep_1srOrx2ZWZBpBUvZwXKQmoEYga2 // kotlin.String | 
val appId : kotlin.String = app_1srOrx2ZWZBpBUvZwXKQmoEYga2 // kotlin.String | 
val idempotencyKey : kotlin.String = idempotencyKey_example // kotlin.String | The request's idempotency key
try {
    val result : EndpointHeadersOut = apiInstance.getEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersGet(endpointId, appId, idempotencyKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EndpointApi#getEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EndpointApi#getEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **endpointId** | **kotlin.String**|  |
 **appId** | **kotlin.String**|  |
 **idempotencyKey** | **kotlin.String**| The request&#39;s idempotency key | [optional]

### Return type

[**EndpointHeadersOut**](EndpointHeadersOut.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getEndpointSecretApiV1AppAppIdEndpointEndpointIdSecretGet"></a>
# **getEndpointSecretApiV1AppAppIdEndpointEndpointIdSecretGet**
> EndpointSecretOut getEndpointSecretApiV1AppAppIdEndpointEndpointIdSecretGet(endpointId, appId, idempotencyKey)

Get Endpoint Secret

Get the endpoint&#39;s signing secret.  This is used to verify the authenticity of the webhook. For more information please refer to [the consuming webhooks docs](https://docs.svix.com/consuming-webhooks/).

### Example
```kotlin
// Import classes:
//import apitest.infrastructure.*
//import com.outmatchapi.apitest.*

val apiInstance = EndpointApi()
val endpointId : kotlin.String = ep_1srOrx2ZWZBpBUvZwXKQmoEYga2 // kotlin.String | 
val appId : kotlin.String = app_1srOrx2ZWZBpBUvZwXKQmoEYga2 // kotlin.String | 
val idempotencyKey : kotlin.String = idempotencyKey_example // kotlin.String | The request's idempotency key
try {
    val result : EndpointSecretOut = apiInstance.getEndpointSecretApiV1AppAppIdEndpointEndpointIdSecretGet(endpointId, appId, idempotencyKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EndpointApi#getEndpointSecretApiV1AppAppIdEndpointEndpointIdSecretGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EndpointApi#getEndpointSecretApiV1AppAppIdEndpointEndpointIdSecretGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **endpointId** | **kotlin.String**|  |
 **appId** | **kotlin.String**|  |
 **idempotencyKey** | **kotlin.String**| The request&#39;s idempotency key | [optional]

### Return type

[**EndpointSecretOut**](EndpointSecretOut.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getEndpointStatsApiV1AppAppIdEndpointEndpointIdStatsGet"></a>
# **getEndpointStatsApiV1AppAppIdEndpointEndpointIdStatsGet**
> EndpointStats getEndpointStatsApiV1AppAppIdEndpointEndpointIdStatsGet(endpointId, appId, idempotencyKey)

Get Endpoint Stats

Get basic statistics for the endpoint.

### Example
```kotlin
// Import classes:
//import apitest.infrastructure.*
//import com.outmatchapi.apitest.*

val apiInstance = EndpointApi()
val endpointId : kotlin.String = ep_1srOrx2ZWZBpBUvZwXKQmoEYga2 // kotlin.String | 
val appId : kotlin.String = app_1srOrx2ZWZBpBUvZwXKQmoEYga2 // kotlin.String | 
val idempotencyKey : kotlin.String = idempotencyKey_example // kotlin.String | The request's idempotency key
try {
    val result : EndpointStats = apiInstance.getEndpointStatsApiV1AppAppIdEndpointEndpointIdStatsGet(endpointId, appId, idempotencyKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EndpointApi#getEndpointStatsApiV1AppAppIdEndpointEndpointIdStatsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EndpointApi#getEndpointStatsApiV1AppAppIdEndpointEndpointIdStatsGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **endpointId** | **kotlin.String**|  |
 **appId** | **kotlin.String**|  |
 **idempotencyKey** | **kotlin.String**| The request&#39;s idempotency key | [optional]

### Return type

[**EndpointStats**](EndpointStats.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listEndpointsApiV1AppAppIdEndpointGet"></a>
# **listEndpointsApiV1AppAppIdEndpointGet**
> ListResponseEndpointOut listEndpointsApiV1AppAppIdEndpointGet(appId, iterator, limit, idempotencyKey)

List Endpoints

List the application&#39;s endpoints.

### Example
```kotlin
// Import classes:
//import apitest.infrastructure.*
//import com.outmatchapi.apitest.*

val apiInstance = EndpointApi()
val appId : kotlin.String = app_1srOrx2ZWZBpBUvZwXKQmoEYga2 // kotlin.String | 
val iterator : kotlin.String = ep_1srOrx2ZWZBpBUvZwXKQmoEYga2 // kotlin.String | 
val limit : kotlin.Int = 56 // kotlin.Int | 
val idempotencyKey : kotlin.String = idempotencyKey_example // kotlin.String | The request's idempotency key
try {
    val result : ListResponseEndpointOut = apiInstance.listEndpointsApiV1AppAppIdEndpointGet(appId, iterator, limit, idempotencyKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EndpointApi#listEndpointsApiV1AppAppIdEndpointGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EndpointApi#listEndpointsApiV1AppAppIdEndpointGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **kotlin.String**|  |
 **iterator** | **kotlin.String**|  | [optional]
 **limit** | **kotlin.Int**|  | [optional] [default to 50]
 **idempotencyKey** | **kotlin.String**| The request&#39;s idempotency key | [optional]

### Return type

[**ListResponseEndpointOut**](ListResponseEndpointOut.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="patchEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersPatch"></a>
# **patchEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersPatch**
> patchEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersPatch(appId, endpointId, endpointHeadersPatchIn, idempotencyKey)

Patch Endpoint Headers

Partially set the additional headers to be sent with the webhook

### Example
```kotlin
// Import classes:
//import apitest.infrastructure.*
//import com.outmatchapi.apitest.*

val apiInstance = EndpointApi()
val appId : kotlin.String = app_1srOrx2ZWZBpBUvZwXKQmoEYga2 // kotlin.String | 
val endpointId : kotlin.String = ep_1srOrx2ZWZBpBUvZwXKQmoEYga2 // kotlin.String | 
val endpointHeadersPatchIn : EndpointHeadersPatchIn =  // EndpointHeadersPatchIn | 
val idempotencyKey : kotlin.String = idempotencyKey_example // kotlin.String | The request's idempotency key
try {
    apiInstance.patchEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersPatch(appId, endpointId, endpointHeadersPatchIn, idempotencyKey)
} catch (e: ClientException) {
    println("4xx response calling EndpointApi#patchEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersPatch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EndpointApi#patchEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersPatch")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **kotlin.String**|  |
 **endpointId** | **kotlin.String**|  |
 **endpointHeadersPatchIn** | [**EndpointHeadersPatchIn**](EndpointHeadersPatchIn.md)|  |
 **idempotencyKey** | **kotlin.String**| The request&#39;s idempotency key | [optional]

### Return type

null (empty response body)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="recoverFailedWebhooksApiV1AppAppIdEndpointEndpointIdRecoverPost"></a>
# **recoverFailedWebhooksApiV1AppAppIdEndpointEndpointIdRecoverPost**
> kotlin.Any recoverFailedWebhooksApiV1AppAppIdEndpointEndpointIdRecoverPost(appId, endpointId, recoverIn, idempotencyKey)

Recover Failed Webhooks

Resend all failed messages since a given time.

### Example
```kotlin
// Import classes:
//import apitest.infrastructure.*
//import com.outmatchapi.apitest.*

val apiInstance = EndpointApi()
val appId : kotlin.String = app_1srOrx2ZWZBpBUvZwXKQmoEYga2 // kotlin.String | 
val endpointId : kotlin.String = ep_1srOrx2ZWZBpBUvZwXKQmoEYga2 // kotlin.String | 
val recoverIn : RecoverIn =  // RecoverIn | 
val idempotencyKey : kotlin.String = idempotencyKey_example // kotlin.String | The request's idempotency key
try {
    val result : kotlin.Any = apiInstance.recoverFailedWebhooksApiV1AppAppIdEndpointEndpointIdRecoverPost(appId, endpointId, recoverIn, idempotencyKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EndpointApi#recoverFailedWebhooksApiV1AppAppIdEndpointEndpointIdRecoverPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EndpointApi#recoverFailedWebhooksApiV1AppAppIdEndpointEndpointIdRecoverPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **kotlin.String**|  |
 **endpointId** | **kotlin.String**|  |
 **recoverIn** | [**RecoverIn**](RecoverIn.md)|  |
 **idempotencyKey** | **kotlin.String**| The request&#39;s idempotency key | [optional]

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="replayMissingWebhooksApiV1AppAppIdEndpointEndpointIdReplayMissingPost"></a>
# **replayMissingWebhooksApiV1AppAppIdEndpointEndpointIdReplayMissingPost**
> kotlin.Any replayMissingWebhooksApiV1AppAppIdEndpointEndpointIdReplayMissingPost(appId, endpointId, replayIn, idempotencyKey)

Replay Missing Webhooks

Replays messages to the endpoint. Only messages that were created after &#x60;since&#x60; will be sent. Messages that were previously sent to the endpoint are not resent.

### Example
```kotlin
// Import classes:
//import apitest.infrastructure.*
//import com.outmatchapi.apitest.*

val apiInstance = EndpointApi()
val appId : kotlin.String = app_1srOrx2ZWZBpBUvZwXKQmoEYga2 // kotlin.String | 
val endpointId : kotlin.String = ep_1srOrx2ZWZBpBUvZwXKQmoEYga2 // kotlin.String | 
val replayIn : ReplayIn =  // ReplayIn | 
val idempotencyKey : kotlin.String = idempotencyKey_example // kotlin.String | The request's idempotency key
try {
    val result : kotlin.Any = apiInstance.replayMissingWebhooksApiV1AppAppIdEndpointEndpointIdReplayMissingPost(appId, endpointId, replayIn, idempotencyKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EndpointApi#replayMissingWebhooksApiV1AppAppIdEndpointEndpointIdReplayMissingPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EndpointApi#replayMissingWebhooksApiV1AppAppIdEndpointEndpointIdReplayMissingPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **kotlin.String**|  |
 **endpointId** | **kotlin.String**|  |
 **replayIn** | [**ReplayIn**](ReplayIn.md)|  |
 **idempotencyKey** | **kotlin.String**| The request&#39;s idempotency key | [optional]

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="rotateEndpointSecretApiV1AppAppIdEndpointEndpointIdSecretRotatePost"></a>
# **rotateEndpointSecretApiV1AppAppIdEndpointEndpointIdSecretRotatePost**
> rotateEndpointSecretApiV1AppAppIdEndpointEndpointIdSecretRotatePost(endpointId, appId, endpointSecretRotateIn, idempotencyKey)

Rotate Endpoint Secret

Rotates the endpoint&#39;s signing secret.  The previous secret will be valid for the next 24 hours.

### Example
```kotlin
// Import classes:
//import apitest.infrastructure.*
//import com.outmatchapi.apitest.*

val apiInstance = EndpointApi()
val endpointId : kotlin.String = ep_1srOrx2ZWZBpBUvZwXKQmoEYga2 // kotlin.String | 
val appId : kotlin.String = app_1srOrx2ZWZBpBUvZwXKQmoEYga2 // kotlin.String | 
val endpointSecretRotateIn : EndpointSecretRotateIn =  // EndpointSecretRotateIn | 
val idempotencyKey : kotlin.String = idempotencyKey_example // kotlin.String | The request's idempotency key
try {
    apiInstance.rotateEndpointSecretApiV1AppAppIdEndpointEndpointIdSecretRotatePost(endpointId, appId, endpointSecretRotateIn, idempotencyKey)
} catch (e: ClientException) {
    println("4xx response calling EndpointApi#rotateEndpointSecretApiV1AppAppIdEndpointEndpointIdSecretRotatePost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EndpointApi#rotateEndpointSecretApiV1AppAppIdEndpointEndpointIdSecretRotatePost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **endpointId** | **kotlin.String**|  |
 **appId** | **kotlin.String**|  |
 **endpointSecretRotateIn** | [**EndpointSecretRotateIn**](EndpointSecretRotateIn.md)|  |
 **idempotencyKey** | **kotlin.String**| The request&#39;s idempotency key | [optional]

### Return type

null (empty response body)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateEndpointApiV1AppAppIdEndpointEndpointIdPut"></a>
# **updateEndpointApiV1AppAppIdEndpointEndpointIdPut**
> EndpointOut updateEndpointApiV1AppAppIdEndpointEndpointIdPut(endpointId, appId, endpointUpdate, idempotencyKey)

Update Endpoint

Update an endpoint.

### Example
```kotlin
// Import classes:
//import apitest.infrastructure.*
//import com.outmatchapi.apitest.*

val apiInstance = EndpointApi()
val endpointId : kotlin.String = ep_1srOrx2ZWZBpBUvZwXKQmoEYga2 // kotlin.String | 
val appId : kotlin.String = app_1srOrx2ZWZBpBUvZwXKQmoEYga2 // kotlin.String | 
val endpointUpdate : EndpointUpdate =  // EndpointUpdate | 
val idempotencyKey : kotlin.String = idempotencyKey_example // kotlin.String | The request's idempotency key
try {
    val result : EndpointOut = apiInstance.updateEndpointApiV1AppAppIdEndpointEndpointIdPut(endpointId, appId, endpointUpdate, idempotencyKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EndpointApi#updateEndpointApiV1AppAppIdEndpointEndpointIdPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EndpointApi#updateEndpointApiV1AppAppIdEndpointEndpointIdPut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **endpointId** | **kotlin.String**|  |
 **appId** | **kotlin.String**|  |
 **endpointUpdate** | [**EndpointUpdate**](EndpointUpdate.md)|  |
 **idempotencyKey** | **kotlin.String**| The request&#39;s idempotency key | [optional]

### Return type

[**EndpointOut**](EndpointOut.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersPut"></a>
# **updateEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersPut**
> updateEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersPut(appId, endpointId, endpointHeadersIn, idempotencyKey)

Update Endpoint Headers

Set the additional headers to be sent with the webhook

### Example
```kotlin
// Import classes:
//import apitest.infrastructure.*
//import com.outmatchapi.apitest.*

val apiInstance = EndpointApi()
val appId : kotlin.String = app_1srOrx2ZWZBpBUvZwXKQmoEYga2 // kotlin.String | 
val endpointId : kotlin.String = ep_1srOrx2ZWZBpBUvZwXKQmoEYga2 // kotlin.String | 
val endpointHeadersIn : EndpointHeadersIn =  // EndpointHeadersIn | 
val idempotencyKey : kotlin.String = idempotencyKey_example // kotlin.String | The request's idempotency key
try {
    apiInstance.updateEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersPut(appId, endpointId, endpointHeadersIn, idempotencyKey)
} catch (e: ClientException) {
    println("4xx response calling EndpointApi#updateEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EndpointApi#updateEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersPut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **kotlin.String**|  |
 **endpointId** | **kotlin.String**|  |
 **endpointHeadersIn** | [**EndpointHeadersIn**](EndpointHeadersIn.md)|  |
 **idempotencyKey** | **kotlin.String**| The request&#39;s idempotency key | [optional]

### Return type

null (empty response body)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

