# AdminConversationsRestrictAccessApi

All URIs are relative to *https://slack.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adminConversationsRestrictAccessAddGroup**](AdminConversationsRestrictAccessApi.md#adminConversationsRestrictAccessAddGroup) | **POST** /admin.conversations.restrictAccess.addGroup | 
[**adminConversationsRestrictAccessListGroups**](AdminConversationsRestrictAccessApi.md#adminConversationsRestrictAccessListGroups) | **GET** /admin.conversations.restrictAccess.listGroups | 
[**adminConversationsRestrictAccessRemoveGroup**](AdminConversationsRestrictAccessApi.md#adminConversationsRestrictAccessRemoveGroup) | **POST** /admin.conversations.restrictAccess.removeGroup | 


<a name="adminConversationsRestrictAccessAddGroup"></a>
# **adminConversationsRestrictAccessAddGroup**
> DefaultSuccessTemplate adminConversationsRestrictAccessAddGroup(channelId, groupId, token, teamId)



Add an allowlist of IDP groups for accessing a channel

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = AdminConversationsRestrictAccessApi()
val channelId : kotlin.String = channelId_example // kotlin.String | The channel to link this group to.
val groupId : kotlin.String = groupId_example // kotlin.String | The [IDP Group](https://slack.com/help/articles/115001435788-Connect-identity-provider-groups-to-your-Enterprise-Grid-org) ID to be an allowlist for the private channel.
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `admin.conversations:write`
val teamId : kotlin.String = teamId_example // kotlin.String | The workspace where the channel exists. This argument is required for channels only tied to one workspace, and optional for channels that are shared across an organization.
try {
    val result : DefaultSuccessTemplate = apiInstance.adminConversationsRestrictAccessAddGroup(channelId, groupId, token, teamId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdminConversationsRestrictAccessApi#adminConversationsRestrictAccessAddGroup")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdminConversationsRestrictAccessApi#adminConversationsRestrictAccessAddGroup")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelId** | **kotlin.String**| The channel to link this group to. |
 **groupId** | **kotlin.String**| The [IDP Group](https://slack.com/help/articles/115001435788-Connect-identity-provider-groups-to-your-Enterprise-Grid-org) ID to be an allowlist for the private channel. |
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;admin.conversations:write&#x60; |
 **teamId** | **kotlin.String**| The workspace where the channel exists. This argument is required for channels only tied to one workspace, and optional for channels that are shared across an organization. | [optional]

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="adminConversationsRestrictAccessListGroups"></a>
# **adminConversationsRestrictAccessListGroups**
> DefaultSuccessTemplate adminConversationsRestrictAccessListGroups(token, channelId, teamId)



List all IDP Groups linked to a channel

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = AdminConversationsRestrictAccessApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `admin.conversations:read`
val channelId : kotlin.String = channelId_example // kotlin.String | 
val teamId : kotlin.String = teamId_example // kotlin.String | The workspace where the channel exists. This argument is required for channels only tied to one workspace, and optional for channels that are shared across an organization.
try {
    val result : DefaultSuccessTemplate = apiInstance.adminConversationsRestrictAccessListGroups(token, channelId, teamId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdminConversationsRestrictAccessApi#adminConversationsRestrictAccessListGroups")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdminConversationsRestrictAccessApi#adminConversationsRestrictAccessListGroups")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;admin.conversations:read&#x60; |
 **channelId** | **kotlin.String**|  |
 **teamId** | **kotlin.String**| The workspace where the channel exists. This argument is required for channels only tied to one workspace, and optional for channels that are shared across an organization. | [optional]

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="adminConversationsRestrictAccessRemoveGroup"></a>
# **adminConversationsRestrictAccessRemoveGroup**
> DefaultSuccessTemplate adminConversationsRestrictAccessRemoveGroup(channelId, groupId, teamId, token)



Remove a linked IDP group linked from a private channel

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = AdminConversationsRestrictAccessApi()
val channelId : kotlin.String = channelId_example // kotlin.String | The channel to remove the linked group from.
val groupId : kotlin.String = groupId_example // kotlin.String | The [IDP Group](https://slack.com/help/articles/115001435788-Connect-identity-provider-groups-to-your-Enterprise-Grid-org) ID to remove from the private channel.
val teamId : kotlin.String = teamId_example // kotlin.String | The workspace where the channel exists. This argument is required for channels only tied to one workspace, and optional for channels that are shared across an organization.
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `admin.conversations:write`
try {
    val result : DefaultSuccessTemplate = apiInstance.adminConversationsRestrictAccessRemoveGroup(channelId, groupId, teamId, token)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdminConversationsRestrictAccessApi#adminConversationsRestrictAccessRemoveGroup")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdminConversationsRestrictAccessApi#adminConversationsRestrictAccessRemoveGroup")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelId** | **kotlin.String**| The channel to remove the linked group from. |
 **groupId** | **kotlin.String**| The [IDP Group](https://slack.com/help/articles/115001435788-Connect-identity-provider-groups-to-your-Enterprise-Grid-org) ID to remove from the private channel. |
 **teamId** | **kotlin.String**| The workspace where the channel exists. This argument is required for channels only tied to one workspace, and optional for channels that are shared across an organization. |
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;admin.conversations:write&#x60; |

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

