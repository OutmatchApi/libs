# TeamProfileApi

All URIs are relative to *https://slack.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**teamProfileGet**](TeamProfileApi.md#teamProfileGet) | **GET** /team.profile.get | 


<a name="teamProfileGet"></a>
# **teamProfileGet**
> TeamProfileGetSuccessSchema teamProfileGet(token, visibility)



Retrieve a team&#39;s profile.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = TeamProfileApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `users.profile:read`
val visibility : kotlin.String = visibility_example // kotlin.String | Filter by visibility.
try {
    val result : TeamProfileGetSuccessSchema = apiInstance.teamProfileGet(token, visibility)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamProfileApi#teamProfileGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamProfileApi#teamProfileGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;users.profile:read&#x60; |
 **visibility** | **kotlin.String**| Filter by visibility. | [optional]

### Return type

[**TeamProfileGetSuccessSchema**](TeamProfileGetSuccessSchema.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

