# ApiApi

All URIs are relative to *https://slack.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiTest**](ApiApi.md#apiTest) | **GET** /api.test | 


<a name="apiTest"></a>
# **apiTest**
> ApiTestSuccessSchema apiTest(error, foo)



Checks API calling code.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = ApiApi()
val error : kotlin.String = error_example // kotlin.String | Error response to return
val foo : kotlin.String = foo_example // kotlin.String | example property to return
try {
    val result : ApiTestSuccessSchema = apiInstance.apiTest(error, foo)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ApiApi#apiTest")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ApiApi#apiTest")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **error** | **kotlin.String**| Error response to return | [optional]
 **foo** | **kotlin.String**| example property to return | [optional]

### Return type

[**ApiTestSuccessSchema**](ApiTestSuccessSchema.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

