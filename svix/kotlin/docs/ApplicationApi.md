# ApplicationApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createApplicationApiV1AppPost**](ApplicationApi.md#createApplicationApiV1AppPost) | **POST** /api/v1/app/ | Create Application
[**deleteApplicationApiV1AppAppIdDelete**](ApplicationApi.md#deleteApplicationApiV1AppAppIdDelete) | **DELETE** /api/v1/app/{app_id}/ | Delete Application
[**getApplicationApiV1AppAppIdGet**](ApplicationApi.md#getApplicationApiV1AppAppIdGet) | **GET** /api/v1/app/{app_id}/ | Get Application
[**listApplicationsApiV1AppGet**](ApplicationApi.md#listApplicationsApiV1AppGet) | **GET** /api/v1/app/ | List Applications
[**updateApplicationApiV1AppAppIdPut**](ApplicationApi.md#updateApplicationApiV1AppAppIdPut) | **PUT** /api/v1/app/{app_id}/ | Update Application


<a name="createApplicationApiV1AppPost"></a>
# **createApplicationApiV1AppPost**
> ApplicationOut createApplicationApiV1AppPost(applicationIn, getIfExists, idempotencyKey)

Create Application

Create a new application.

### Example
```kotlin
// Import classes:
//import svix.infrastructure.*
//import com.outmatchapi.svix.*

val apiInstance = ApplicationApi()
val applicationIn : ApplicationIn =  // ApplicationIn | 
val getIfExists : kotlin.Boolean = true // kotlin.Boolean | Get an existing application, or create a new one if doesn't exist. It's two separate functions in the libs.
val idempotencyKey : kotlin.String = idempotencyKey_example // kotlin.String | The request's idempotency key
try {
    val result : ApplicationOut = apiInstance.createApplicationApiV1AppPost(applicationIn, getIfExists, idempotencyKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ApplicationApi#createApplicationApiV1AppPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ApplicationApi#createApplicationApiV1AppPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicationIn** | [**ApplicationIn**](ApplicationIn.md)|  |
 **getIfExists** | **kotlin.Boolean**| Get an existing application, or create a new one if doesn&#39;t exist. It&#39;s two separate functions in the libs. | [optional] [default to false]
 **idempotencyKey** | **kotlin.String**| The request&#39;s idempotency key | [optional]

### Return type

[**ApplicationOut**](ApplicationOut.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteApplicationApiV1AppAppIdDelete"></a>
# **deleteApplicationApiV1AppAppIdDelete**
> deleteApplicationApiV1AppAppIdDelete(appId, idempotencyKey)

Delete Application

Delete an application.

### Example
```kotlin
// Import classes:
//import svix.infrastructure.*
//import com.outmatchapi.svix.*

val apiInstance = ApplicationApi()
val appId : kotlin.String = app_1srOrx2ZWZBpBUvZwXKQmoEYga2 // kotlin.String | 
val idempotencyKey : kotlin.String = idempotencyKey_example // kotlin.String | The request's idempotency key
try {
    apiInstance.deleteApplicationApiV1AppAppIdDelete(appId, idempotencyKey)
} catch (e: ClientException) {
    println("4xx response calling ApplicationApi#deleteApplicationApiV1AppAppIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ApplicationApi#deleteApplicationApiV1AppAppIdDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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

<a name="getApplicationApiV1AppAppIdGet"></a>
# **getApplicationApiV1AppAppIdGet**
> ApplicationOut getApplicationApiV1AppAppIdGet(appId, idempotencyKey)

Get Application

Get an application.

### Example
```kotlin
// Import classes:
//import svix.infrastructure.*
//import com.outmatchapi.svix.*

val apiInstance = ApplicationApi()
val appId : kotlin.String = app_1srOrx2ZWZBpBUvZwXKQmoEYga2 // kotlin.String | 
val idempotencyKey : kotlin.String = idempotencyKey_example // kotlin.String | The request's idempotency key
try {
    val result : ApplicationOut = apiInstance.getApplicationApiV1AppAppIdGet(appId, idempotencyKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ApplicationApi#getApplicationApiV1AppAppIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ApplicationApi#getApplicationApiV1AppAppIdGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **kotlin.String**|  |
 **idempotencyKey** | **kotlin.String**| The request&#39;s idempotency key | [optional]

### Return type

[**ApplicationOut**](ApplicationOut.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listApplicationsApiV1AppGet"></a>
# **listApplicationsApiV1AppGet**
> ListResponseApplicationOut listApplicationsApiV1AppGet(iterator, limit, idempotencyKey)

List Applications

List of all the organization&#39;s applications.

### Example
```kotlin
// Import classes:
//import svix.infrastructure.*
//import com.outmatchapi.svix.*

val apiInstance = ApplicationApi()
val iterator : kotlin.String = app_1srOrx2ZWZBpBUvZwXKQmoEYga2 // kotlin.String | 
val limit : kotlin.Int = 56 // kotlin.Int | 
val idempotencyKey : kotlin.String = idempotencyKey_example // kotlin.String | The request's idempotency key
try {
    val result : ListResponseApplicationOut = apiInstance.listApplicationsApiV1AppGet(iterator, limit, idempotencyKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ApplicationApi#listApplicationsApiV1AppGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ApplicationApi#listApplicationsApiV1AppGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **iterator** | **kotlin.String**|  | [optional]
 **limit** | **kotlin.Int**|  | [optional] [default to 50]
 **idempotencyKey** | **kotlin.String**| The request&#39;s idempotency key | [optional]

### Return type

[**ListResponseApplicationOut**](ListResponseApplicationOut.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateApplicationApiV1AppAppIdPut"></a>
# **updateApplicationApiV1AppAppIdPut**
> ApplicationOut updateApplicationApiV1AppAppIdPut(appId, applicationIn, idempotencyKey)

Update Application

Update an application.

### Example
```kotlin
// Import classes:
//import svix.infrastructure.*
//import com.outmatchapi.svix.*

val apiInstance = ApplicationApi()
val appId : kotlin.String = app_1srOrx2ZWZBpBUvZwXKQmoEYga2 // kotlin.String | 
val applicationIn : ApplicationIn =  // ApplicationIn | 
val idempotencyKey : kotlin.String = idempotencyKey_example // kotlin.String | The request's idempotency key
try {
    val result : ApplicationOut = apiInstance.updateApplicationApiV1AppAppIdPut(appId, applicationIn, idempotencyKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ApplicationApi#updateApplicationApiV1AppAppIdPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ApplicationApi#updateApplicationApiV1AppAppIdPut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **kotlin.String**|  |
 **applicationIn** | [**ApplicationIn**](ApplicationIn.md)|  |
 **idempotencyKey** | **kotlin.String**| The request&#39;s idempotency key | [optional]

### Return type

[**ApplicationOut**](ApplicationOut.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

