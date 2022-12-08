# AdminUsergroupsApi

All URIs are relative to *https://slack.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adminUsergroupsAddChannels**](AdminUsergroupsApi.md#adminUsergroupsAddChannels) | **POST** /admin.usergroups.addChannels | 
[**adminUsergroupsAddTeams**](AdminUsergroupsApi.md#adminUsergroupsAddTeams) | **POST** /admin.usergroups.addTeams | 
[**adminUsergroupsListChannels**](AdminUsergroupsApi.md#adminUsergroupsListChannels) | **GET** /admin.usergroups.listChannels | 
[**adminUsergroupsRemoveChannels**](AdminUsergroupsApi.md#adminUsergroupsRemoveChannels) | **POST** /admin.usergroups.removeChannels | 


<a name="adminUsergroupsAddChannels"></a>
# **adminUsergroupsAddChannels**
> DefaultSuccessTemplate adminUsergroupsAddChannels(token, channelIds, usergroupId, teamId)



Add one or more default channels to an IDP group.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = AdminUsergroupsApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `admin.usergroups:write`
val channelIds : kotlin.String = channelIds_example // kotlin.String | Comma separated string of channel IDs.
val usergroupId : kotlin.String = usergroupId_example // kotlin.String | ID of the IDP group to add default channels for.
val teamId : kotlin.String = teamId_example // kotlin.String | The workspace to add default channels in.
try {
    val result : DefaultSuccessTemplate = apiInstance.adminUsergroupsAddChannels(token, channelIds, usergroupId, teamId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdminUsergroupsApi#adminUsergroupsAddChannels")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdminUsergroupsApi#adminUsergroupsAddChannels")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;admin.usergroups:write&#x60; |
 **channelIds** | **kotlin.String**| Comma separated string of channel IDs. |
 **usergroupId** | **kotlin.String**| ID of the IDP group to add default channels for. |
 **teamId** | **kotlin.String**| The workspace to add default channels in. | [optional]

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="adminUsergroupsAddTeams"></a>
# **adminUsergroupsAddTeams**
> DefaultSuccessTemplate adminUsergroupsAddTeams(token, teamIds, usergroupId, autoProvision)



Associate one or more default workspaces with an organization-wide IDP group.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = AdminUsergroupsApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `admin.teams:write`
val teamIds : kotlin.String = teamIds_example // kotlin.String | A comma separated list of encoded team (workspace) IDs. Each workspace *MUST* belong to the organization associated with the token.
val usergroupId : kotlin.String = usergroupId_example // kotlin.String | An encoded usergroup (IDP Group) ID.
val autoProvision : kotlin.Boolean = true // kotlin.Boolean | When `true`, this method automatically creates new workspace accounts for the IDP group members.
try {
    val result : DefaultSuccessTemplate = apiInstance.adminUsergroupsAddTeams(token, teamIds, usergroupId, autoProvision)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdminUsergroupsApi#adminUsergroupsAddTeams")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdminUsergroupsApi#adminUsergroupsAddTeams")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;admin.teams:write&#x60; |
 **teamIds** | **kotlin.String**| A comma separated list of encoded team (workspace) IDs. Each workspace *MUST* belong to the organization associated with the token. |
 **usergroupId** | **kotlin.String**| An encoded usergroup (IDP Group) ID. |
 **autoProvision** | **kotlin.Boolean**| When &#x60;true&#x60;, this method automatically creates new workspace accounts for the IDP group members. | [optional]

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="adminUsergroupsListChannels"></a>
# **adminUsergroupsListChannels**
> DefaultSuccessTemplate adminUsergroupsListChannels(token, usergroupId, teamId, includeNumMembers)



List the channels linked to an org-level IDP group (user group).

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = AdminUsergroupsApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `admin.usergroups:read`
val usergroupId : kotlin.String = usergroupId_example // kotlin.String | ID of the IDP group to list default channels for.
val teamId : kotlin.String = teamId_example // kotlin.String | ID of the the workspace.
val includeNumMembers : kotlin.Boolean = true // kotlin.Boolean | Flag to include or exclude the count of members per channel.
try {
    val result : DefaultSuccessTemplate = apiInstance.adminUsergroupsListChannels(token, usergroupId, teamId, includeNumMembers)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdminUsergroupsApi#adminUsergroupsListChannels")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdminUsergroupsApi#adminUsergroupsListChannels")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;admin.usergroups:read&#x60; |
 **usergroupId** | **kotlin.String**| ID of the IDP group to list default channels for. |
 **teamId** | **kotlin.String**| ID of the the workspace. | [optional]
 **includeNumMembers** | **kotlin.Boolean**| Flag to include or exclude the count of members per channel. | [optional]

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="adminUsergroupsRemoveChannels"></a>
# **adminUsergroupsRemoveChannels**
> DefaultSuccessTemplate adminUsergroupsRemoveChannels(token, channelIds, usergroupId)



Remove one or more default channels from an org-level IDP group (user group).

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = AdminUsergroupsApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `admin.usergroups:write`
val channelIds : kotlin.String = channelIds_example // kotlin.String | Comma-separated string of channel IDs
val usergroupId : kotlin.String = usergroupId_example // kotlin.String | ID of the IDP Group
try {
    val result : DefaultSuccessTemplate = apiInstance.adminUsergroupsRemoveChannels(token, channelIds, usergroupId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdminUsergroupsApi#adminUsergroupsRemoveChannels")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdminUsergroupsApi#adminUsergroupsRemoveChannels")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;admin.usergroups:write&#x60; |
 **channelIds** | **kotlin.String**| Comma-separated string of channel IDs |
 **usergroupId** | **kotlin.String**| ID of the IDP Group |

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

