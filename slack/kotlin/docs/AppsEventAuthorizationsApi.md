# AppsEventAuthorizationsApi

All URIs are relative to *https://slack.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**appsEventAuthorizationsList**](AppsEventAuthorizationsApi.md#appsEventAuthorizationsList) | **GET** /apps.event.authorizations.list | 


<a name="appsEventAuthorizationsList"></a>
# **appsEventAuthorizationsList**
> DefaultSuccessTemplate appsEventAuthorizationsList(token, eventContext, cursor, limit)



Get a list of authorizations for the given event context. Each authorization represents an app installation that the event is visible to.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = AppsEventAuthorizationsApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `authorizations:read`
val eventContext : kotlin.String = eventContext_example // kotlin.String | 
val cursor : kotlin.String = cursor_example // kotlin.String | 
val limit : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : DefaultSuccessTemplate = apiInstance.appsEventAuthorizationsList(token, eventContext, cursor, limit)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AppsEventAuthorizationsApi#appsEventAuthorizationsList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AppsEventAuthorizationsApi#appsEventAuthorizationsList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;authorizations:read&#x60; |
 **eventContext** | **kotlin.String**|  |
 **cursor** | **kotlin.String**|  | [optional]
 **limit** | **kotlin.Int**|  | [optional]

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

