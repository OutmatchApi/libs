# ReactionsApi

All URIs are relative to *https://slack.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**reactionsAdd**](ReactionsApi.md#reactionsAdd) | **POST** /reactions.add | 
[**reactionsGet**](ReactionsApi.md#reactionsGet) | **GET** /reactions.get | 
[**reactionsList**](ReactionsApi.md#reactionsList) | **GET** /reactions.list | 
[**reactionsRemove**](ReactionsApi.md#reactionsRemove) | **POST** /reactions.remove | 


<a name="reactionsAdd"></a>
# **reactionsAdd**
> ReactionsAddSchema reactionsAdd(token, channel, name, timestamp)



Adds a reaction to an item.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = ReactionsApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `reactions:write`
val channel : kotlin.String = channel_example // kotlin.String | Channel where the message to add reaction to was posted.
val name : kotlin.String = name_example // kotlin.String | Reaction (emoji) name.
val timestamp : kotlin.String = timestamp_example // kotlin.String | Timestamp of the message to add reaction to.
try {
    val result : ReactionsAddSchema = apiInstance.reactionsAdd(token, channel, name, timestamp)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReactionsApi#reactionsAdd")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReactionsApi#reactionsAdd")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;reactions:write&#x60; |
 **channel** | **kotlin.String**| Channel where the message to add reaction to was posted. |
 **name** | **kotlin.String**| Reaction (emoji) name. |
 **timestamp** | **kotlin.String**| Timestamp of the message to add reaction to. |

### Return type

[**ReactionsAddSchema**](ReactionsAddSchema.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="reactionsGet"></a>
# **reactionsGet**
> kotlin.collections.List&lt;ReactionsGetSuccessSchemaInner&gt; reactionsGet(token, channel, file, fileComment, full, timestamp)



Gets reactions for an item.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = ReactionsApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `reactions:read`
val channel : kotlin.String = channel_example // kotlin.String | Channel where the message to get reactions for was posted.
val file : kotlin.String = file_example // kotlin.String | File to get reactions for.
val fileComment : kotlin.String = fileComment_example // kotlin.String | File comment to get reactions for.
val full : kotlin.Boolean = true // kotlin.Boolean | If true always return the complete reaction list.
val timestamp : kotlin.String = timestamp_example // kotlin.String | Timestamp of the message to get reactions for.
try {
    val result : kotlin.collections.List<ReactionsGetSuccessSchemaInner> = apiInstance.reactionsGet(token, channel, file, fileComment, full, timestamp)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReactionsApi#reactionsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReactionsApi#reactionsGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;reactions:read&#x60; |
 **channel** | **kotlin.String**| Channel where the message to get reactions for was posted. | [optional]
 **file** | **kotlin.String**| File to get reactions for. | [optional]
 **fileComment** | **kotlin.String**| File comment to get reactions for. | [optional]
 **full** | **kotlin.Boolean**| If true always return the complete reaction list. | [optional]
 **timestamp** | **kotlin.String**| Timestamp of the message to get reactions for. | [optional]

### Return type

[**kotlin.collections.List&lt;ReactionsGetSuccessSchemaInner&gt;**](ReactionsGetSuccessSchemaInner.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="reactionsList"></a>
# **reactionsList**
> ReactionsListSchema reactionsList(token, user, full, count, page, cursor, limit)



Lists reactions made by a user.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = ReactionsApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `reactions:read`
val user : kotlin.String = user_example // kotlin.String | Show reactions made by this user. Defaults to the authed user.
val full : kotlin.Boolean = true // kotlin.Boolean | If true always return the complete reaction list.
val count : kotlin.Int = 56 // kotlin.Int | 
val page : kotlin.Int = 56 // kotlin.Int | 
val cursor : kotlin.String = cursor_example // kotlin.String | Parameter for pagination. Set `cursor` equal to the `next_cursor` attribute returned by the previous request's `response_metadata`. This parameter is optional, but pagination is mandatory: the default value simply fetches the first \"page\" of the collection. See [pagination](/docs/pagination) for more details.
val limit : kotlin.Int = 56 // kotlin.Int | The maximum number of items to return. Fewer than the requested number of items may be returned, even if the end of the list hasn't been reached.
try {
    val result : ReactionsListSchema = apiInstance.reactionsList(token, user, full, count, page, cursor, limit)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReactionsApi#reactionsList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReactionsApi#reactionsList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;reactions:read&#x60; |
 **user** | **kotlin.String**| Show reactions made by this user. Defaults to the authed user. | [optional]
 **full** | **kotlin.Boolean**| If true always return the complete reaction list. | [optional]
 **count** | **kotlin.Int**|  | [optional]
 **page** | **kotlin.Int**|  | [optional]
 **cursor** | **kotlin.String**| Parameter for pagination. Set &#x60;cursor&#x60; equal to the &#x60;next_cursor&#x60; attribute returned by the previous request&#39;s &#x60;response_metadata&#x60;. This parameter is optional, but pagination is mandatory: the default value simply fetches the first \&quot;page\&quot; of the collection. See [pagination](/docs/pagination) for more details. | [optional]
 **limit** | **kotlin.Int**| The maximum number of items to return. Fewer than the requested number of items may be returned, even if the end of the list hasn&#39;t been reached. | [optional]

### Return type

[**ReactionsListSchema**](ReactionsListSchema.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="reactionsRemove"></a>
# **reactionsRemove**
> ReactionsRemoveSchema reactionsRemove(token, name, channel, file, fileComment, timestamp)



Removes a reaction from an item.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = ReactionsApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `reactions:write`
val name : kotlin.String = name_example // kotlin.String | Reaction (emoji) name.
val channel : kotlin.String = channel_example // kotlin.String | Channel where the message to remove reaction from was posted.
val file : kotlin.String = file_example // kotlin.String | File to remove reaction from.
val fileComment : kotlin.String = fileComment_example // kotlin.String | File comment to remove reaction from.
val timestamp : kotlin.String = timestamp_example // kotlin.String | Timestamp of the message to remove reaction from.
try {
    val result : ReactionsRemoveSchema = apiInstance.reactionsRemove(token, name, channel, file, fileComment, timestamp)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReactionsApi#reactionsRemove")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReactionsApi#reactionsRemove")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;reactions:write&#x60; |
 **name** | **kotlin.String**| Reaction (emoji) name. |
 **channel** | **kotlin.String**| Channel where the message to remove reaction from was posted. | [optional]
 **file** | **kotlin.String**| File to remove reaction from. | [optional]
 **fileComment** | **kotlin.String**| File comment to remove reaction from. | [optional]
 **timestamp** | **kotlin.String**| Timestamp of the message to remove reaction from. | [optional]

### Return type

[**ReactionsRemoveSchema**](ReactionsRemoveSchema.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

