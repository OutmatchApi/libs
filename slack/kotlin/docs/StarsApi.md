# StarsApi

All URIs are relative to *https://slack.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**starsAdd**](StarsApi.md#starsAdd) | **POST** /stars.add | 
[**starsList**](StarsApi.md#starsList) | **GET** /stars.list | 
[**starsRemove**](StarsApi.md#starsRemove) | **POST** /stars.remove | 


<a name="starsAdd"></a>
# **starsAdd**
> StarsAddSchema starsAdd(token, channel, file, fileComment, timestamp)



Adds a star to an item.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = StarsApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `stars:write`
val channel : kotlin.String = channel_example // kotlin.String | Channel to add star to, or channel where the message to add star to was posted (used with `timestamp`).
val file : kotlin.String = file_example // kotlin.String | File to add star to.
val fileComment : kotlin.String = fileComment_example // kotlin.String | File comment to add star to.
val timestamp : kotlin.String = timestamp_example // kotlin.String | Timestamp of the message to add star to.
try {
    val result : StarsAddSchema = apiInstance.starsAdd(token, channel, file, fileComment, timestamp)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StarsApi#starsAdd")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StarsApi#starsAdd")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;stars:write&#x60; |
 **channel** | **kotlin.String**| Channel to add star to, or channel where the message to add star to was posted (used with &#x60;timestamp&#x60;). | [optional]
 **file** | **kotlin.String**| File to add star to. | [optional]
 **fileComment** | **kotlin.String**| File comment to add star to. | [optional]
 **timestamp** | **kotlin.String**| Timestamp of the message to add star to. | [optional]

### Return type

[**StarsAddSchema**](StarsAddSchema.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="starsList"></a>
# **starsList**
> StarsListSchema starsList(token, count, page, cursor, limit)



Lists stars for a user.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = StarsApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `stars:read`
val count : kotlin.String = count_example // kotlin.String | 
val page : kotlin.String = page_example // kotlin.String | 
val cursor : kotlin.String = cursor_example // kotlin.String | Parameter for pagination. Set `cursor` equal to the `next_cursor` attribute returned by the previous request's `response_metadata`. This parameter is optional, but pagination is mandatory: the default value simply fetches the first \"page\" of the collection. See [pagination](/docs/pagination) for more details.
val limit : kotlin.Int = 56 // kotlin.Int | The maximum number of items to return. Fewer than the requested number of items may be returned, even if the end of the list hasn't been reached.
try {
    val result : StarsListSchema = apiInstance.starsList(token, count, page, cursor, limit)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StarsApi#starsList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StarsApi#starsList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;stars:read&#x60; | [optional]
 **count** | **kotlin.String**|  | [optional]
 **page** | **kotlin.String**|  | [optional]
 **cursor** | **kotlin.String**| Parameter for pagination. Set &#x60;cursor&#x60; equal to the &#x60;next_cursor&#x60; attribute returned by the previous request&#39;s &#x60;response_metadata&#x60;. This parameter is optional, but pagination is mandatory: the default value simply fetches the first \&quot;page\&quot; of the collection. See [pagination](/docs/pagination) for more details. | [optional]
 **limit** | **kotlin.Int**| The maximum number of items to return. Fewer than the requested number of items may be returned, even if the end of the list hasn&#39;t been reached. | [optional]

### Return type

[**StarsListSchema**](StarsListSchema.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="starsRemove"></a>
# **starsRemove**
> StarsRemoveSchema starsRemove(token, channel, file, fileComment, timestamp)



Removes a star from an item.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = StarsApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `stars:write`
val channel : kotlin.String = channel_example // kotlin.String | Channel to remove star from, or channel where the message to remove star from was posted (used with `timestamp`).
val file : kotlin.String = file_example // kotlin.String | File to remove star from.
val fileComment : kotlin.String = fileComment_example // kotlin.String | File comment to remove star from.
val timestamp : kotlin.String = timestamp_example // kotlin.String | Timestamp of the message to remove star from.
try {
    val result : StarsRemoveSchema = apiInstance.starsRemove(token, channel, file, fileComment, timestamp)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StarsApi#starsRemove")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StarsApi#starsRemove")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;stars:write&#x60; |
 **channel** | **kotlin.String**| Channel to remove star from, or channel where the message to remove star from was posted (used with &#x60;timestamp&#x60;). | [optional]
 **file** | **kotlin.String**| File to remove star from. | [optional]
 **fileComment** | **kotlin.String**| File comment to remove star from. | [optional]
 **timestamp** | **kotlin.String**| Timestamp of the message to remove star from. | [optional]

### Return type

[**StarsRemoveSchema**](StarsRemoveSchema.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

