# AuthenticationApi

All URIs are relative to *https://ws.api.video*

Method | HTTP request | Description
------------- | ------------- | -------------
[**pOSTAuthApiKey**](AuthenticationApi.md#pOSTAuthApiKey) | **POST** /auth/api-key | Authenticate
[**pOSTAuthRefresh**](AuthenticationApi.md#pOSTAuthRefresh) | **POST** /auth/refresh | Refresh token


<a name="pOSTAuthApiKey"></a>
# **pOSTAuthApiKey**
> AccessMinusToken pOSTAuthApiKey(authenticateMinusPayload)

Authenticate

To get started, submit your API key in the body of your request. api.video returns an access token that is valid for one hour (3600 seconds). A refresh token is also returned. View a [tutorial](https://api.video/blog/tutorials/authentication-tutorial) on authentication. All tutorials using the [authentication endpoint](https://api.video/blog/endpoints/authenticate)

### Example
```kotlin
// Import classes:
//import apivideo.infrastructure.*
//import com.outmatchapi.apivideo.*

val apiInstance = AuthenticationApi()
val authenticateMinusPayload : AuthenticateMinusPayload =  // AuthenticateMinusPayload | 
try {
    val result : AccessMinusToken = apiInstance.pOSTAuthApiKey(authenticateMinusPayload)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AuthenticationApi#pOSTAuthApiKey")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AuthenticationApi#pOSTAuthApiKey")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authenticateMinusPayload** | [**AuthenticateMinusPayload**](AuthenticateMinusPayload.md)|  | [optional]

### Return type

[**AccessMinusToken**](AccessMinusToken.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="pOSTAuthRefresh"></a>
# **pOSTAuthRefresh**
> AccessMinusToken pOSTAuthRefresh(refreshMinusTokenMinusPayload)

Refresh token

Use the refresh endpoint with the refresh token you received when you first authenticated using the api-key endpoint. Send the refresh token in the body of your request. The api.video API returns a new access token that is valid for one hour (3600 seconds) and a new refresh token.  

### Example
```kotlin
// Import classes:
//import apivideo.infrastructure.*
//import com.outmatchapi.apivideo.*

val apiInstance = AuthenticationApi()
val refreshMinusTokenMinusPayload : RefreshMinusTokenMinusPayload =  // RefreshMinusTokenMinusPayload | 
try {
    val result : AccessMinusToken = apiInstance.pOSTAuthRefresh(refreshMinusTokenMinusPayload)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AuthenticationApi#pOSTAuthRefresh")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AuthenticationApi#pOSTAuthRefresh")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **refreshMinusTokenMinusPayload** | [**RefreshMinusTokenMinusPayload**](RefreshMinusTokenMinusPayload.md)|  | [optional]

### Return type

[**AccessMinusToken**](AccessMinusToken.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

