# SearchApi

All URIs are relative to *https://slack.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**searchMessages**](SearchApi.md#searchMessages) | **GET** /search.messages | 


<a name="searchMessages"></a>
# **searchMessages**
> DefaultSuccessTemplate searchMessages(token, query, count, highlight, page, sort, sortDir)



Searches for messages matching a query.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = SearchApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `search:read`
val query : kotlin.String = query_example // kotlin.String | Search query.
val count : kotlin.Int = 56 // kotlin.Int | Pass the number of results you want per \"page\". Maximum of `100`.
val highlight : kotlin.Boolean = true // kotlin.Boolean | Pass a value of `true` to enable query highlight markers (see below).
val page : kotlin.Int = 56 // kotlin.Int | 
val sort : kotlin.String = sort_example // kotlin.String | Return matches sorted by either `score` or `timestamp`.
val sortDir : kotlin.String = sortDir_example // kotlin.String | Change sort direction to ascending (`asc`) or descending (`desc`).
try {
    val result : DefaultSuccessTemplate = apiInstance.searchMessages(token, query, count, highlight, page, sort, sortDir)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SearchApi#searchMessages")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SearchApi#searchMessages")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;search:read&#x60; |
 **query** | **kotlin.String**| Search query. |
 **count** | **kotlin.Int**| Pass the number of results you want per \&quot;page\&quot;. Maximum of &#x60;100&#x60;. | [optional]
 **highlight** | **kotlin.Boolean**| Pass a value of &#x60;true&#x60; to enable query highlight markers (see below). | [optional]
 **page** | **kotlin.Int**|  | [optional]
 **sort** | **kotlin.String**| Return matches sorted by either &#x60;score&#x60; or &#x60;timestamp&#x60;. | [optional]
 **sortDir** | **kotlin.String**| Change sort direction to ascending (&#x60;asc&#x60;) or descending (&#x60;desc&#x60;). | [optional]

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

