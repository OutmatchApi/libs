# CallsParticipantsApi

All URIs are relative to *https://slack.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**callsParticipantsAdd**](CallsParticipantsApi.md#callsParticipantsAdd) | **POST** /calls.participants.add | 
[**callsParticipantsRemove**](CallsParticipantsApi.md#callsParticipantsRemove) | **POST** /calls.participants.remove | 


<a name="callsParticipantsAdd"></a>
# **callsParticipantsAdd**
> DefaultSuccessTemplate callsParticipantsAdd(token, id, users)



Registers new participants added to a Call.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = CallsParticipantsApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `calls:write`
val id : kotlin.String = id_example // kotlin.String | `id` returned by the [`calls.add`](/methods/calls.add) method.
val users : kotlin.String = users_example // kotlin.String | The list of users to add as participants in the Call. [Read more on how to specify users here](/apis/calls#users).
try {
    val result : DefaultSuccessTemplate = apiInstance.callsParticipantsAdd(token, id, users)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CallsParticipantsApi#callsParticipantsAdd")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CallsParticipantsApi#callsParticipantsAdd")
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

val apiInstance = CallsParticipantsApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `calls:write`
val id : kotlin.String = id_example // kotlin.String | `id` returned by the [`calls.add`](/methods/calls.add) method.
val users : kotlin.String = users_example // kotlin.String | The list of users to remove as participants in the Call. [Read more on how to specify users here](/apis/calls#users).
try {
    val result : DefaultSuccessTemplate = apiInstance.callsParticipantsRemove(token, id, users)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CallsParticipantsApi#callsParticipantsRemove")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CallsParticipantsApi#callsParticipantsRemove")
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

