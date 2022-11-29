# HealthApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**healthApiV1HealthGet**](HealthApi.md#healthApiV1HealthGet) | **GET** /api/v1/health/ | Health


<a name="healthApiV1HealthGet"></a>
# **healthApiV1HealthGet**
> healthApiV1HealthGet(idempotencyKey)

Health

Verify the API server is up and running.

### Example
```kotlin
// Import classes:
//import apitest.infrastructure.*
//import com.outmatchapi.apitest.*

val apiInstance = HealthApi()
val idempotencyKey : kotlin.String = idempotencyKey_example // kotlin.String | The request's idempotency key
try {
    apiInstance.healthApiV1HealthGet(idempotencyKey)
} catch (e: ClientException) {
    println("4xx response calling HealthApi#healthApiV1HealthGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling HealthApi#healthApiV1HealthGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idempotencyKey** | **kotlin.String**| The request&#39;s idempotency key | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

