# AdminConversationsEkmApi

All URIs are relative to *https://slack.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adminConversationsEkmListOriginalConnectedChannelInfo**](AdminConversationsEkmApi.md#adminConversationsEkmListOriginalConnectedChannelInfo) | **GET** /admin.conversations.ekm.listOriginalConnectedChannelInfo | 


<a name="adminConversationsEkmListOriginalConnectedChannelInfo"></a>
# **adminConversationsEkmListOriginalConnectedChannelInfo**
> DefaultSuccessTemplate adminConversationsEkmListOriginalConnectedChannelInfo(token, channelIds, teamIds, limit, cursor)



List all disconnected channelsâ€”i.e., channels that were once connected to other workspaces and then disconnectedâ€”and the corresponding original channel IDs for key revocation with EKM.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = AdminConversationsEkmApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `admin.conversations:read`
val channelIds : kotlin.String = channelIds_example // kotlin.String | A comma-separated list of channels to filter to.
val teamIds : kotlin.String = teamIds_example // kotlin.String | A comma-separated list of the workspaces to which the channels you would like returned belong.
val limit : kotlin.Int = 56 // kotlin.Int | The maximum number of items to return. Must be between 1 - 1000 both inclusive.
val cursor : kotlin.String = cursor_example // kotlin.String | Set `cursor` to `next_cursor` returned by the previous call to list items in the next page.
try {
    val result : DefaultSuccessTemplate = apiInstance.adminConversationsEkmListOriginalConnectedChannelInfo(token, channelIds, teamIds, limit, cursor)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdminConversationsEkmApi#adminConversationsEkmListOriginalConnectedChannelInfo")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdminConversationsEkmApi#adminConversationsEkmListOriginalConnectedChannelInfo")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;admin.conversations:read&#x60; |
 **channelIds** | **kotlin.String**| A comma-separated list of channels to filter to. | [optional]
 **teamIds** | **kotlin.String**| A comma-separated list of the workspaces to which the channels you would like returned belong. | [optional]
 **limit** | **kotlin.Int**| The maximum number of items to return. Must be between 1 - 1000 both inclusive. | [optional]
 **cursor** | **kotlin.String**| Set &#x60;cursor&#x60; to &#x60;next_cursor&#x60; returned by the previous call to list items in the next page. | [optional]

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

