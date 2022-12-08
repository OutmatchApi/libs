# ViewsApi

All URIs are relative to *https://slack.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**viewsOpen**](ViewsApi.md#viewsOpen) | **GET** /views.open | 
[**viewsPublish**](ViewsApi.md#viewsPublish) | **GET** /views.publish | 
[**viewsPush**](ViewsApi.md#viewsPush) | **GET** /views.push | 
[**viewsUpdate**](ViewsApi.md#viewsUpdate) | **GET** /views.update | 


<a name="viewsOpen"></a>
# **viewsOpen**
> DefaultSuccessTemplate viewsOpen(token, triggerId, view)



Open a view for a user.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = ViewsApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `none`
val triggerId : kotlin.String = triggerId_example // kotlin.String | Exchange a trigger to post to the user.
val view : kotlin.String = view_example // kotlin.String | A [view payload](/reference/surfaces/views). This must be a JSON-encoded string.
try {
    val result : DefaultSuccessTemplate = apiInstance.viewsOpen(token, triggerId, view)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ViewsApi#viewsOpen")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ViewsApi#viewsOpen")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;none&#x60; |
 **triggerId** | **kotlin.String**| Exchange a trigger to post to the user. |
 **view** | **kotlin.String**| A [view payload](/reference/surfaces/views). This must be a JSON-encoded string. |

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="viewsPublish"></a>
# **viewsPublish**
> DefaultSuccessTemplate viewsPublish(token, userId, view, hash)



Publish a static view for a User.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = ViewsApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `none`
val userId : kotlin.String = userId_example // kotlin.String | `id` of the user you want publish a view to.
val view : kotlin.String = view_example // kotlin.String | A [view payload](/reference/surfaces/views). This must be a JSON-encoded string.
val hash : kotlin.String = hash_example // kotlin.String | A string that represents view state to protect against possible race conditions.
try {
    val result : DefaultSuccessTemplate = apiInstance.viewsPublish(token, userId, view, hash)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ViewsApi#viewsPublish")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ViewsApi#viewsPublish")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;none&#x60; |
 **userId** | **kotlin.String**| &#x60;id&#x60; of the user you want publish a view to. |
 **view** | **kotlin.String**| A [view payload](/reference/surfaces/views). This must be a JSON-encoded string. |
 **hash** | **kotlin.String**| A string that represents view state to protect against possible race conditions. | [optional]

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="viewsPush"></a>
# **viewsPush**
> DefaultSuccessTemplate viewsPush(token, triggerId, view)



Push a view onto the stack of a root view.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = ViewsApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `none`
val triggerId : kotlin.String = triggerId_example // kotlin.String | Exchange a trigger to post to the user.
val view : kotlin.String = view_example // kotlin.String | A [view payload](/reference/surfaces/views). This must be a JSON-encoded string.
try {
    val result : DefaultSuccessTemplate = apiInstance.viewsPush(token, triggerId, view)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ViewsApi#viewsPush")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ViewsApi#viewsPush")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;none&#x60; |
 **triggerId** | **kotlin.String**| Exchange a trigger to post to the user. |
 **view** | **kotlin.String**| A [view payload](/reference/surfaces/views). This must be a JSON-encoded string. |

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="viewsUpdate"></a>
# **viewsUpdate**
> DefaultSuccessTemplate viewsUpdate(token, viewId, externalId, view, hash)



Update an existing view.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = ViewsApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `none`
val viewId : kotlin.String = viewId_example // kotlin.String | A unique identifier of the view to be updated. Either `view_id` or `external_id` is required.
val externalId : kotlin.String = externalId_example // kotlin.String | A unique identifier of the view set by the developer. Must be unique for all views on a team. Max length of 255 characters. Either `view_id` or `external_id` is required.
val view : kotlin.String = view_example // kotlin.String | A [view object](/reference/surfaces/views). This must be a JSON-encoded string.
val hash : kotlin.String = hash_example // kotlin.String | A string that represents view state to protect against possible race conditions.
try {
    val result : DefaultSuccessTemplate = apiInstance.viewsUpdate(token, viewId, externalId, view, hash)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ViewsApi#viewsUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ViewsApi#viewsUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;none&#x60; |
 **viewId** | **kotlin.String**| A unique identifier of the view to be updated. Either &#x60;view_id&#x60; or &#x60;external_id&#x60; is required. | [optional]
 **externalId** | **kotlin.String**| A unique identifier of the view set by the developer. Must be unique for all views on a team. Max length of 255 characters. Either &#x60;view_id&#x60; or &#x60;external_id&#x60; is required. | [optional]
 **view** | **kotlin.String**| A [view object](/reference/surfaces/views). This must be a JSON-encoded string. | [optional]
 **hash** | **kotlin.String**| A string that represents view state to protect against possible race conditions. | [optional]

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

