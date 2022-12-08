# PinsApi

All URIs are relative to *https://slack.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**pinsAdd**](PinsApi.md#pinsAdd) | **POST** /pins.add | 
[**pinsList**](PinsApi.md#pinsList) | **GET** /pins.list | 
[**pinsRemove**](PinsApi.md#pinsRemove) | **POST** /pins.remove | 


<a name="pinsAdd"></a>
# **pinsAdd**
> PinsAddSchema pinsAdd(token, channel, timestamp)



Pins an item to a channel.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = PinsApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `pins:write`
val channel : kotlin.String = channel_example // kotlin.String | Channel to pin the item in.
val timestamp : kotlin.String = timestamp_example // kotlin.String | Timestamp of the message to pin.
try {
    val result : PinsAddSchema = apiInstance.pinsAdd(token, channel, timestamp)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PinsApi#pinsAdd")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PinsApi#pinsAdd")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;pins:write&#x60; |
 **channel** | **kotlin.String**| Channel to pin the item in. |
 **timestamp** | **kotlin.String**| Timestamp of the message to pin. | [optional]

### Return type

[**PinsAddSchema**](PinsAddSchema.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="pinsList"></a>
# **pinsList**
> kotlin.collections.List&lt;PinsListSuccessSchemaInner&gt; pinsList(token, channel)



Lists items pinned to a channel.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = PinsApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `pins:read`
val channel : kotlin.String = channel_example // kotlin.String | Channel to get pinned items for.
try {
    val result : kotlin.collections.List<PinsListSuccessSchemaInner> = apiInstance.pinsList(token, channel)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PinsApi#pinsList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PinsApi#pinsList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;pins:read&#x60; |
 **channel** | **kotlin.String**| Channel to get pinned items for. |

### Return type

[**kotlin.collections.List&lt;PinsListSuccessSchemaInner&gt;**](PinsListSuccessSchemaInner.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="pinsRemove"></a>
# **pinsRemove**
> PinsRemoveSchema pinsRemove(token, channel, timestamp)



Un-pins an item from a channel.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = PinsApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `pins:write`
val channel : kotlin.String = channel_example // kotlin.String | Channel where the item is pinned to.
val timestamp : kotlin.String = timestamp_example // kotlin.String | Timestamp of the message to un-pin.
try {
    val result : PinsRemoveSchema = apiInstance.pinsRemove(token, channel, timestamp)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PinsApi#pinsRemove")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PinsApi#pinsRemove")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;pins:write&#x60; |
 **channel** | **kotlin.String**| Channel where the item is pinned to. |
 **timestamp** | **kotlin.String**| Timestamp of the message to un-pin. | [optional]

### Return type

[**PinsRemoveSchema**](PinsRemoveSchema.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

