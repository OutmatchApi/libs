# StatusApi

All URIs are relative to *https://api.outmatchapi.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getStatus**](StatusApi.md#getStatus) | **GET** /status | 


<a name="getStatus"></a>
# **getStatus**
> getStatus()



Check the API status

### Example
```kotlin
// Import classes:
//import api.infrastructure.*
//import com.outmatchapi.api.*

val apiInstance = StatusApi()
try {
    apiInstance.getStatus()
} catch (e: ClientException) {
    println("4xx response calling StatusApi#getStatus")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StatusApi#getStatus")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

