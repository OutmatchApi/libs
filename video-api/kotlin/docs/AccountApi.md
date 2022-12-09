# AccountApi

All URIs are relative to *https://ws.api.video*

Method | HTTP request | Description
------------- | ------------- | -------------
[**gETAccount**](AccountApi.md#gETAccount) | **GET** /account | Show account


<a name="gETAccount"></a>
# **gETAccount**
> Account gETAccount()

Show account

Deprecated. Authenticate and get a token, then you can use the bearer token here to retrieve details about your account.

### Example
```kotlin
// Import classes:
//import video-api.infrastructure.*
//import com.outmatchapi.video-api.*

val apiInstance = AccountApi()
try {
    val result : Account = apiInstance.gETAccount()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountApi#gETAccount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountApi#gETAccount")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Account**](Account.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

