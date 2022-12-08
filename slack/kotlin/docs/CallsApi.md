# CallsApi

All URIs are relative to *https://slack.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**callsAdd**](CallsApi.md#callsAdd) | **POST** /calls.add | 
[**callsEnd**](CallsApi.md#callsEnd) | **POST** /calls.end | 
[**callsInfo**](CallsApi.md#callsInfo) | **GET** /calls.info | 
[**callsParticipantsAdd**](CallsApi.md#callsParticipantsAdd) | **POST** /calls.participants.add | 
[**callsParticipantsRemove**](CallsApi.md#callsParticipantsRemove) | **POST** /calls.participants.remove | 
[**callsUpdate**](CallsApi.md#callsUpdate) | **POST** /calls.update | 


<a name="callsAdd"></a>
# **callsAdd**
> DefaultSuccessTemplate callsAdd(token, externalUniqueId, joinUrl, createdBy, dateStart, desktopAppJoinUrl, externalDisplayId, title, users)



Registers a new Call.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = CallsApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `calls:write`
val externalUniqueId : kotlin.String = externalUniqueId_example // kotlin.String | An ID supplied by the 3rd-party Call provider. It must be unique across all Calls from that service.
val joinUrl : kotlin.String = joinUrl_example // kotlin.String | The URL required for a client to join the Call.
val createdBy : kotlin.String = createdBy_example // kotlin.String | The valid Slack user ID of the user who created this Call. When this method is called with a user token, the `created_by` field is optional and defaults to the authed user of the token. Otherwise, the field is required.
val dateStart : kotlin.Int = 56 // kotlin.Int | Call start time in UTC UNIX timestamp format
val desktopAppJoinUrl : kotlin.String = desktopAppJoinUrl_example // kotlin.String | When supplied, available Slack clients will attempt to directly launch the 3rd-party Call with this URL.
val externalDisplayId : kotlin.String = externalDisplayId_example // kotlin.String | An optional, human-readable ID supplied by the 3rd-party Call provider. If supplied, this ID will be displayed in the Call object.
val title : kotlin.String = title_example // kotlin.String | The name of the Call.
val users : kotlin.String = users_example // kotlin.String | The list of users to register as participants in the Call. [Read more on how to specify users here](/apis/calls#users).
try {
    val result : DefaultSuccessTemplate = apiInstance.callsAdd(token, externalUniqueId, joinUrl, createdBy, dateStart, desktopAppJoinUrl, externalDisplayId, title, users)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CallsApi#callsAdd")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CallsApi#callsAdd")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;calls:write&#x60; |
 **externalUniqueId** | **kotlin.String**| An ID supplied by the 3rd-party Call provider. It must be unique across all Calls from that service. |
 **joinUrl** | **kotlin.String**| The URL required for a client to join the Call. |
 **createdBy** | **kotlin.String**| The valid Slack user ID of the user who created this Call. When this method is called with a user token, the &#x60;created_by&#x60; field is optional and defaults to the authed user of the token. Otherwise, the field is required. | [optional]
 **dateStart** | **kotlin.Int**| Call start time in UTC UNIX timestamp format | [optional]
 **desktopAppJoinUrl** | **kotlin.String**| When supplied, available Slack clients will attempt to directly launch the 3rd-party Call with this URL. | [optional]
 **externalDisplayId** | **kotlin.String**| An optional, human-readable ID supplied by the 3rd-party Call provider. If supplied, this ID will be displayed in the Call object. | [optional]
 **title** | **kotlin.String**| The name of the Call. | [optional]
 **users** | **kotlin.String**| The list of users to register as participants in the Call. [Read more on how to specify users here](/apis/calls#users). | [optional]

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="callsEnd"></a>
# **callsEnd**
> DefaultSuccessTemplate callsEnd(token, id, duration)



Ends a Call.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = CallsApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `calls:write`
val id : kotlin.String = id_example // kotlin.String | `id` returned when registering the call using the [`calls.add`](/methods/calls.add) method.
val duration : kotlin.Int = 56 // kotlin.Int | Call duration in seconds
try {
    val result : DefaultSuccessTemplate = apiInstance.callsEnd(token, id, duration)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CallsApi#callsEnd")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CallsApi#callsEnd")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;calls:write&#x60; |
 **id** | **kotlin.String**| &#x60;id&#x60; returned when registering the call using the [&#x60;calls.add&#x60;](/methods/calls.add) method. |
 **duration** | **kotlin.Int**| Call duration in seconds | [optional]

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="callsInfo"></a>
# **callsInfo**
> DefaultSuccessTemplate callsInfo(token, id)



Returns information about a Call.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = CallsApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `calls:read`
val id : kotlin.String = id_example // kotlin.String | `id` of the Call returned by the [`calls.add`](/methods/calls.add) method.
try {
    val result : DefaultSuccessTemplate = apiInstance.callsInfo(token, id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CallsApi#callsInfo")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CallsApi#callsInfo")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;calls:read&#x60; |
 **id** | **kotlin.String**| &#x60;id&#x60; of the Call returned by the [&#x60;calls.add&#x60;](/methods/calls.add) method. |

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="callsParticipantsAdd"></a>
# **callsParticipantsAdd**
> DefaultSuccessTemplate callsParticipantsAdd(token, id, users)



Registers new participants added to a Call.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = CallsApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `calls:write`
val id : kotlin.String = id_example // kotlin.String | `id` returned by the [`calls.add`](/methods/calls.add) method.
val users : kotlin.String = users_example // kotlin.String | The list of users to add as participants in the Call. [Read more on how to specify users here](/apis/calls#users).
try {
    val result : DefaultSuccessTemplate = apiInstance.callsParticipantsAdd(token, id, users)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CallsApi#callsParticipantsAdd")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CallsApi#callsParticipantsAdd")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;calls:write&#x60; |
 **id** | **kotlin.String**| &#x60;id&#x60; returned by the [&#x60;calls.add&#x60;](/methods/calls.add) method. |
 **users** | **kotlin.String**| The list of users to add as participants in the Call. [Read more on how to specify users here](/apis/calls#users). |

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="callsParticipantsRemove"></a>
# **callsParticipantsRemove**
> DefaultSuccessTemplate callsParticipantsRemove(token, id, users)



Registers participants removed from a Call.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = CallsApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `calls:write`
val id : kotlin.String = id_example // kotlin.String | `id` returned by the [`calls.add`](/methods/calls.add) method.
val users : kotlin.String = users_example // kotlin.String | The list of users to remove as participants in the Call. [Read more on how to specify users here](/apis/calls#users).
try {
    val result : DefaultSuccessTemplate = apiInstance.callsParticipantsRemove(token, id, users)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CallsApi#callsParticipantsRemove")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CallsApi#callsParticipantsRemove")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;calls:write&#x60; |
 **id** | **kotlin.String**| &#x60;id&#x60; returned by the [&#x60;calls.add&#x60;](/methods/calls.add) method. |
 **users** | **kotlin.String**| The list of users to remove as participants in the Call. [Read more on how to specify users here](/apis/calls#users). |

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="callsUpdate"></a>
# **callsUpdate**
> DefaultSuccessTemplate callsUpdate(token, id, desktopAppJoinUrl, joinUrl, title)



Updates information about a Call.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = CallsApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `calls:write`
val id : kotlin.String = id_example // kotlin.String | `id` returned by the [`calls.add`](/methods/calls.add) method.
val desktopAppJoinUrl : kotlin.String = desktopAppJoinUrl_example // kotlin.String | When supplied, available Slack clients will attempt to directly launch the 3rd-party Call with this URL.
val joinUrl : kotlin.String = joinUrl_example // kotlin.String | The URL required for a client to join the Call.
val title : kotlin.String = title_example // kotlin.String | The name of the Call.
try {
    val result : DefaultSuccessTemplate = apiInstance.callsUpdate(token, id, desktopAppJoinUrl, joinUrl, title)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CallsApi#callsUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CallsApi#callsUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;calls:write&#x60; |
 **id** | **kotlin.String**| &#x60;id&#x60; returned by the [&#x60;calls.add&#x60;](/methods/calls.add) method. |
 **desktopAppJoinUrl** | **kotlin.String**| When supplied, available Slack clients will attempt to directly launch the 3rd-party Call with this URL. | [optional]
 **joinUrl** | **kotlin.String**| The URL required for a client to join the Call. | [optional]
 **title** | **kotlin.String**| The name of the Call. | [optional]

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

