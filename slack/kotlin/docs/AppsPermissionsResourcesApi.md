# AppsPermissionsResourcesApi

All URIs are relative to *https://slack.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**appsPermissionsResourcesList**](AppsPermissionsResourcesApi.md#appsPermissionsResourcesList) | **GET** /apps.permissions.resources.list | 


<a name="appsPermissionsResourcesList"></a>
# **appsPermissionsResourcesList**
> AppsPermissionsResourcesListSuccessSchema appsPermissionsResourcesList(token, cursor, limit)



Returns list of resource grants this app has on a team.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = AppsPermissionsResourcesApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `none`
val cursor : kotlin.String = cursor_example // kotlin.String | Paginate through collections of data by setting the `cursor` parameter to a `next_cursor` attribute returned by a previous request's `response_metadata`. Default value fetches the first \"page\" of the collection. See [pagination](/docs/pagination) for more detail.
val limit : kotlin.Int = 56 // kotlin.Int | The maximum number of items to return.
try {
    val result : AppsPermissionsResourcesListSuccessSchema = apiInstance.appsPermissionsResourcesList(token, cursor, limit)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AppsPermissionsResourcesApi#appsPermissionsResourcesList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AppsPermissionsResourcesApi#appsPermissionsResourcesList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;none&#x60; |
 **cursor** | **kotlin.String**| Paginate through collections of data by setting the &#x60;cursor&#x60; parameter to a &#x60;next_cursor&#x60; attribute returned by a previous request&#39;s &#x60;response_metadata&#x60;. Default value fetches the first \&quot;page\&quot; of the collection. See [pagination](/docs/pagination) for more detail. | [optional]
 **limit** | **kotlin.Int**| The maximum number of items to return. | [optional]

### Return type

[**AppsPermissionsResourcesListSuccessSchema**](AppsPermissionsResourcesListSuccessSchema.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

