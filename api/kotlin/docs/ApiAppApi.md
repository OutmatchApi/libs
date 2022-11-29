# ApiAppApi

All URIs are relative to *https://api.outmatchapi.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createApiApp**](ApiAppApi.md#createApiApp) | **POST** /apiApp | Create api app
[**createApiAppRelease**](ApiAppApi.md#createApiAppRelease) | **POST** /apiApp/{app_id}/release | Create api app release
[**createApiAppReleaseSdks**](ApiAppApi.md#createApiAppReleaseSdks) | **POST** /apiApp/{app_id}/release/{release_version}/sdk | Generate sdks for a relase


<a name="createApiApp"></a>
# **createApiApp**
> ApiApp createApiApp(createApiAppRequest)

Create api app

Create an api app for the authenticated user

### Example
```kotlin
// Import classes:
//import api.infrastructure.*
//import com.outmatchapi.api.*

val apiInstance = ApiAppApi()
val createApiAppRequest : CreateApiAppRequest =  // CreateApiAppRequest | 
try {
    val result : ApiApp = apiInstance.createApiApp(createApiAppRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ApiAppApi#createApiApp")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ApiAppApi#createApiApp")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createApiAppRequest** | [**CreateApiAppRequest**](CreateApiAppRequest.md)|  | [optional]

### Return type

[**ApiApp**](ApiApp.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createApiAppRelease"></a>
# **createApiAppRelease**
> Release createApiAppRelease(appId, body)

Create api app release

Create an api app release

### Example
```kotlin
// Import classes:
//import api.infrastructure.*
//import com.outmatchapi.api.*

val apiInstance = ApiAppApi()
val appId : kotlin.String = appId_example // kotlin.String | app id to associate the release with
val body : kotlin.String = body_example // kotlin.String | Created release object
try {
    val result : Release = apiInstance.createApiAppRelease(appId, body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ApiAppApi#createApiAppRelease")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ApiAppApi#createApiAppRelease")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **kotlin.String**| app id to associate the release with |
 **body** | **kotlin.String**| Created release object | [optional]

### Return type

[**Release**](Release.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createApiAppReleaseSdks"></a>
# **createApiAppReleaseSdks**
> kotlin.collections.List&lt;Sdk&gt; createApiAppReleaseSdks(appId, releaseVersion, createApiAppReleaseSdksRequest)

Generate sdks for a relase

Generate sdks for a relase

### Example
```kotlin
// Import classes:
//import api.infrastructure.*
//import com.outmatchapi.api.*

val apiInstance = ApiAppApi()
val appId : kotlin.String = appId_example // kotlin.String | app id
val releaseVersion : kotlin.String = 1.0.0 // kotlin.String | release id
val createApiAppReleaseSdksRequest : CreateApiAppReleaseSdksRequest =  // CreateApiAppReleaseSdksRequest | 
try {
    val result : kotlin.collections.List<Sdk> = apiInstance.createApiAppReleaseSdks(appId, releaseVersion, createApiAppReleaseSdksRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ApiAppApi#createApiAppReleaseSdks")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ApiAppApi#createApiAppReleaseSdks")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **kotlin.String**| app id |
 **releaseVersion** | **kotlin.String**| release id |
 **createApiAppReleaseSdksRequest** | [**CreateApiAppReleaseSdksRequest**](CreateApiAppReleaseSdksRequest.md)|  | [optional]

### Return type

[**kotlin.collections.List&lt;Sdk&gt;**](Sdk.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

