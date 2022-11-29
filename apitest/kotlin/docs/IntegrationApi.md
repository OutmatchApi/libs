# IntegrationApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createIntegrationApiV1AppAppIdIntegrationPost**](IntegrationApi.md#createIntegrationApiV1AppAppIdIntegrationPost) | **POST** /api/v1/app/{app_id}/integration/ | Create Integration
[**deleteIntegrationApiV1AppAppIdIntegrationIntegIdDelete**](IntegrationApi.md#deleteIntegrationApiV1AppAppIdIntegrationIntegIdDelete) | **DELETE** /api/v1/app/{app_id}/integration/{integ_id}/ | Delete Integration
[**getIntegrationApiV1AppAppIdIntegrationIntegIdGet**](IntegrationApi.md#getIntegrationApiV1AppAppIdIntegrationIntegIdGet) | **GET** /api/v1/app/{app_id}/integration/{integ_id}/ | Get Integration
[**getIntegrationKeyApiV1AppAppIdIntegrationIntegIdKeyGet**](IntegrationApi.md#getIntegrationKeyApiV1AppAppIdIntegrationIntegIdKeyGet) | **GET** /api/v1/app/{app_id}/integration/{integ_id}/key/ | Get Integration Key
[**listIntegrationsApiV1AppAppIdIntegrationGet**](IntegrationApi.md#listIntegrationsApiV1AppAppIdIntegrationGet) | **GET** /api/v1/app/{app_id}/integration/ | List Integrations
[**rotateIntegrationKeyApiV1AppAppIdIntegrationIntegIdKeyRotatePost**](IntegrationApi.md#rotateIntegrationKeyApiV1AppAppIdIntegrationIntegIdKeyRotatePost) | **POST** /api/v1/app/{app_id}/integration/{integ_id}/key/rotate/ | Rotate Integration Key
[**updateIntegrationApiV1AppAppIdIntegrationIntegIdPut**](IntegrationApi.md#updateIntegrationApiV1AppAppIdIntegrationIntegIdPut) | **PUT** /api/v1/app/{app_id}/integration/{integ_id}/ | Update Integration


<a name="createIntegrationApiV1AppAppIdIntegrationPost"></a>
# **createIntegrationApiV1AppAppIdIntegrationPost**
> IntegrationOut createIntegrationApiV1AppAppIdIntegrationPost(appId, integrationIn, idempotencyKey)

Create Integration

Create an integration.

### Example
```kotlin
// Import classes:
//import apitest.infrastructure.*
//import com.outmatchapi.apitest.*

val apiInstance = IntegrationApi()
val appId : kotlin.String = app_1srOrx2ZWZBpBUvZwXKQmoEYga2 // kotlin.String | 
val integrationIn : IntegrationIn =  // IntegrationIn | 
val idempotencyKey : kotlin.String = idempotencyKey_example // kotlin.String | The request's idempotency key
try {
    val result : IntegrationOut = apiInstance.createIntegrationApiV1AppAppIdIntegrationPost(appId, integrationIn, idempotencyKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IntegrationApi#createIntegrationApiV1AppAppIdIntegrationPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IntegrationApi#createIntegrationApiV1AppAppIdIntegrationPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **kotlin.String**|  |
 **integrationIn** | [**IntegrationIn**](IntegrationIn.md)|  |
 **idempotencyKey** | **kotlin.String**| The request&#39;s idempotency key | [optional]

### Return type

[**IntegrationOut**](IntegrationOut.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteIntegrationApiV1AppAppIdIntegrationIntegIdDelete"></a>
# **deleteIntegrationApiV1AppAppIdIntegrationIntegIdDelete**
> deleteIntegrationApiV1AppAppIdIntegrationIntegIdDelete(integId, appId, idempotencyKey)

Delete Integration

Delete an integration and revoke it&#39;s key.

### Example
```kotlin
// Import classes:
//import apitest.infrastructure.*
//import com.outmatchapi.apitest.*

val apiInstance = IntegrationApi()
val integId : kotlin.String = integ_1srOrx2ZWZBpBUvZwXKQmoEYga2 // kotlin.String | 
val appId : kotlin.String = app_1srOrx2ZWZBpBUvZwXKQmoEYga2 // kotlin.String | 
val idempotencyKey : kotlin.String = idempotencyKey_example // kotlin.String | The request's idempotency key
try {
    apiInstance.deleteIntegrationApiV1AppAppIdIntegrationIntegIdDelete(integId, appId, idempotencyKey)
} catch (e: ClientException) {
    println("4xx response calling IntegrationApi#deleteIntegrationApiV1AppAppIdIntegrationIntegIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IntegrationApi#deleteIntegrationApiV1AppAppIdIntegrationIntegIdDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **integId** | **kotlin.String**|  |
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

<a name="getIntegrationApiV1AppAppIdIntegrationIntegIdGet"></a>
# **getIntegrationApiV1AppAppIdIntegrationIntegIdGet**
> IntegrationOut getIntegrationApiV1AppAppIdIntegrationIntegIdGet(integId, appId, idempotencyKey)

Get Integration

Get an integration.

### Example
```kotlin
// Import classes:
//import apitest.infrastructure.*
//import com.outmatchapi.apitest.*

val apiInstance = IntegrationApi()
val integId : kotlin.String = integ_1srOrx2ZWZBpBUvZwXKQmoEYga2 // kotlin.String | 
val appId : kotlin.String = app_1srOrx2ZWZBpBUvZwXKQmoEYga2 // kotlin.String | 
val idempotencyKey : kotlin.String = idempotencyKey_example // kotlin.String | The request's idempotency key
try {
    val result : IntegrationOut = apiInstance.getIntegrationApiV1AppAppIdIntegrationIntegIdGet(integId, appId, idempotencyKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IntegrationApi#getIntegrationApiV1AppAppIdIntegrationIntegIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IntegrationApi#getIntegrationApiV1AppAppIdIntegrationIntegIdGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **integId** | **kotlin.String**|  |
 **appId** | **kotlin.String**|  |
 **idempotencyKey** | **kotlin.String**| The request&#39;s idempotency key | [optional]

### Return type

[**IntegrationOut**](IntegrationOut.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getIntegrationKeyApiV1AppAppIdIntegrationIntegIdKeyGet"></a>
# **getIntegrationKeyApiV1AppAppIdIntegrationIntegIdKeyGet**
> IntegrationKeyOut getIntegrationKeyApiV1AppAppIdIntegrationIntegIdKeyGet(integId, appId, idempotencyKey)

Get Integration Key

Get an integration&#39;s key.

### Example
```kotlin
// Import classes:
//import apitest.infrastructure.*
//import com.outmatchapi.apitest.*

val apiInstance = IntegrationApi()
val integId : kotlin.String = integ_1srOrx2ZWZBpBUvZwXKQmoEYga2 // kotlin.String | 
val appId : kotlin.String = app_1srOrx2ZWZBpBUvZwXKQmoEYga2 // kotlin.String | 
val idempotencyKey : kotlin.String = idempotencyKey_example // kotlin.String | The request's idempotency key
try {
    val result : IntegrationKeyOut = apiInstance.getIntegrationKeyApiV1AppAppIdIntegrationIntegIdKeyGet(integId, appId, idempotencyKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IntegrationApi#getIntegrationKeyApiV1AppAppIdIntegrationIntegIdKeyGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IntegrationApi#getIntegrationKeyApiV1AppAppIdIntegrationIntegIdKeyGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **integId** | **kotlin.String**|  |
 **appId** | **kotlin.String**|  |
 **idempotencyKey** | **kotlin.String**| The request&#39;s idempotency key | [optional]

### Return type

[**IntegrationKeyOut**](IntegrationKeyOut.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listIntegrationsApiV1AppAppIdIntegrationGet"></a>
# **listIntegrationsApiV1AppAppIdIntegrationGet**
> ListResponseIntegrationOut listIntegrationsApiV1AppAppIdIntegrationGet(appId, iterator, limit, idempotencyKey)

List Integrations

List the application&#39;s integrations.

### Example
```kotlin
// Import classes:
//import apitest.infrastructure.*
//import com.outmatchapi.apitest.*

val apiInstance = IntegrationApi()
val appId : kotlin.String = app_1srOrx2ZWZBpBUvZwXKQmoEYga2 // kotlin.String | 
val iterator : kotlin.String = integ_1srOrx2ZWZBpBUvZwXKQmoEYga2 // kotlin.String | 
val limit : kotlin.Int = 56 // kotlin.Int | 
val idempotencyKey : kotlin.String = idempotencyKey_example // kotlin.String | The request's idempotency key
try {
    val result : ListResponseIntegrationOut = apiInstance.listIntegrationsApiV1AppAppIdIntegrationGet(appId, iterator, limit, idempotencyKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IntegrationApi#listIntegrationsApiV1AppAppIdIntegrationGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IntegrationApi#listIntegrationsApiV1AppAppIdIntegrationGet")
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

[**ListResponseIntegrationOut**](ListResponseIntegrationOut.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="rotateIntegrationKeyApiV1AppAppIdIntegrationIntegIdKeyRotatePost"></a>
# **rotateIntegrationKeyApiV1AppAppIdIntegrationIntegIdKeyRotatePost**
> IntegrationKeyOut rotateIntegrationKeyApiV1AppAppIdIntegrationIntegIdKeyRotatePost(integId, appId, idempotencyKey)

Rotate Integration Key

Rotate the integration&#39;s key. The previous key will be immediately revoked.

### Example
```kotlin
// Import classes:
//import apitest.infrastructure.*
//import com.outmatchapi.apitest.*

val apiInstance = IntegrationApi()
val integId : kotlin.String = integ_1srOrx2ZWZBpBUvZwXKQmoEYga2 // kotlin.String | 
val appId : kotlin.String = app_1srOrx2ZWZBpBUvZwXKQmoEYga2 // kotlin.String | 
val idempotencyKey : kotlin.String = idempotencyKey_example // kotlin.String | The request's idempotency key
try {
    val result : IntegrationKeyOut = apiInstance.rotateIntegrationKeyApiV1AppAppIdIntegrationIntegIdKeyRotatePost(integId, appId, idempotencyKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IntegrationApi#rotateIntegrationKeyApiV1AppAppIdIntegrationIntegIdKeyRotatePost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IntegrationApi#rotateIntegrationKeyApiV1AppAppIdIntegrationIntegIdKeyRotatePost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **integId** | **kotlin.String**|  |
 **appId** | **kotlin.String**|  |
 **idempotencyKey** | **kotlin.String**| The request&#39;s idempotency key | [optional]

### Return type

[**IntegrationKeyOut**](IntegrationKeyOut.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateIntegrationApiV1AppAppIdIntegrationIntegIdPut"></a>
# **updateIntegrationApiV1AppAppIdIntegrationIntegIdPut**
> IntegrationOut updateIntegrationApiV1AppAppIdIntegrationIntegIdPut(integId, appId, integrationUpdate, idempotencyKey)

Update Integration

Update an integration.

### Example
```kotlin
// Import classes:
//import apitest.infrastructure.*
//import com.outmatchapi.apitest.*

val apiInstance = IntegrationApi()
val integId : kotlin.String = integ_1srOrx2ZWZBpBUvZwXKQmoEYga2 // kotlin.String | 
val appId : kotlin.String = app_1srOrx2ZWZBpBUvZwXKQmoEYga2 // kotlin.String | 
val integrationUpdate : IntegrationUpdate =  // IntegrationUpdate | 
val idempotencyKey : kotlin.String = idempotencyKey_example // kotlin.String | The request's idempotency key
try {
    val result : IntegrationOut = apiInstance.updateIntegrationApiV1AppAppIdIntegrationIntegIdPut(integId, appId, integrationUpdate, idempotencyKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IntegrationApi#updateIntegrationApiV1AppAppIdIntegrationIntegIdPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IntegrationApi#updateIntegrationApiV1AppAppIdIntegrationIntegIdPut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **integId** | **kotlin.String**|  |
 **appId** | **kotlin.String**|  |
 **integrationUpdate** | [**IntegrationUpdate**](IntegrationUpdate.md)|  |
 **idempotencyKey** | **kotlin.String**| The request&#39;s idempotency key | [optional]

### Return type

[**IntegrationOut**](IntegrationOut.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

