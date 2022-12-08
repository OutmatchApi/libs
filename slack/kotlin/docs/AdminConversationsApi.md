# AdminConversationsApi

All URIs are relative to *https://slack.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adminConversationsArchive**](AdminConversationsApi.md#adminConversationsArchive) | **POST** /admin.conversations.archive | 
[**adminConversationsConvertToPrivate**](AdminConversationsApi.md#adminConversationsConvertToPrivate) | **POST** /admin.conversations.convertToPrivate | 
[**adminConversationsCreate**](AdminConversationsApi.md#adminConversationsCreate) | **POST** /admin.conversations.create | 
[**adminConversationsDelete**](AdminConversationsApi.md#adminConversationsDelete) | **POST** /admin.conversations.delete | 
[**adminConversationsDisconnectShared**](AdminConversationsApi.md#adminConversationsDisconnectShared) | **POST** /admin.conversations.disconnectShared | 
[**adminConversationsGetConversationPrefs**](AdminConversationsApi.md#adminConversationsGetConversationPrefs) | **GET** /admin.conversations.getConversationPrefs | 
[**adminConversationsGetTeams**](AdminConversationsApi.md#adminConversationsGetTeams) | **GET** /admin.conversations.getTeams | 
[**adminConversationsInvite**](AdminConversationsApi.md#adminConversationsInvite) | **POST** /admin.conversations.invite | 
[**adminConversationsRename**](AdminConversationsApi.md#adminConversationsRename) | **POST** /admin.conversations.rename | 
[**adminConversationsSearch**](AdminConversationsApi.md#adminConversationsSearch) | **GET** /admin.conversations.search | 
[**adminConversationsSetConversationPrefs**](AdminConversationsApi.md#adminConversationsSetConversationPrefs) | **POST** /admin.conversations.setConversationPrefs | 
[**adminConversationsSetTeams**](AdminConversationsApi.md#adminConversationsSetTeams) | **POST** /admin.conversations.setTeams | 
[**adminConversationsUnarchive**](AdminConversationsApi.md#adminConversationsUnarchive) | **POST** /admin.conversations.unarchive | 


<a name="adminConversationsArchive"></a>
# **adminConversationsArchive**
> AdminConversationsArchiveSchema adminConversationsArchive(token, channelId)



Archive a public or private channel.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = AdminConversationsApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `admin.conversations:write`
val channelId : kotlin.String = channelId_example // kotlin.String | The channel to archive.
try {
    val result : AdminConversationsArchiveSchema = apiInstance.adminConversationsArchive(token, channelId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdminConversationsApi#adminConversationsArchive")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdminConversationsApi#adminConversationsArchive")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;admin.conversations:write&#x60; |
 **channelId** | **kotlin.String**| The channel to archive. |

### Return type

[**AdminConversationsArchiveSchema**](AdminConversationsArchiveSchema.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="adminConversationsConvertToPrivate"></a>
# **adminConversationsConvertToPrivate**
> AdminConversationsConvertToPrivateSchema adminConversationsConvertToPrivate(token, channelId)



Convert a public channel to a private channel.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = AdminConversationsApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `admin.conversations:write`
val channelId : kotlin.String = channelId_example // kotlin.String | The channel to convert to private.
try {
    val result : AdminConversationsConvertToPrivateSchema = apiInstance.adminConversationsConvertToPrivate(token, channelId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdminConversationsApi#adminConversationsConvertToPrivate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdminConversationsApi#adminConversationsConvertToPrivate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;admin.conversations:write&#x60; |
 **channelId** | **kotlin.String**| The channel to convert to private. |

### Return type

[**AdminConversationsConvertToPrivateSchema**](AdminConversationsConvertToPrivateSchema.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="adminConversationsCreate"></a>
# **adminConversationsCreate**
> AdminConversationsCreateSchema adminConversationsCreate(token, isPrivate, name, description, orgWide, teamId)



Create a public or private channel-based conversation.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = AdminConversationsApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `admin.conversations:write`
val isPrivate : kotlin.Boolean = true // kotlin.Boolean | When `true`, creates a private channel instead of a public channel
val name : kotlin.String = name_example // kotlin.String | Name of the public or private channel to create.
val description : kotlin.String = description_example // kotlin.String | Description of the public or private channel to create.
val orgWide : kotlin.Boolean = true // kotlin.Boolean | When `true`, the channel will be available org-wide. Note: if the channel is not `org_wide=true`, you must specify a `team_id` for this channel
val teamId : kotlin.String = teamId_example // kotlin.String | The workspace to create the channel in. Note: this argument is required unless you set `org_wide=true`.
try {
    val result : AdminConversationsCreateSchema = apiInstance.adminConversationsCreate(token, isPrivate, name, description, orgWide, teamId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdminConversationsApi#adminConversationsCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdminConversationsApi#adminConversationsCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;admin.conversations:write&#x60; |
 **isPrivate** | **kotlin.Boolean**| When &#x60;true&#x60;, creates a private channel instead of a public channel |
 **name** | **kotlin.String**| Name of the public or private channel to create. |
 **description** | **kotlin.String**| Description of the public or private channel to create. | [optional]
 **orgWide** | **kotlin.Boolean**| When &#x60;true&#x60;, the channel will be available org-wide. Note: if the channel is not &#x60;org_wide&#x3D;true&#x60;, you must specify a &#x60;team_id&#x60; for this channel | [optional]
 **teamId** | **kotlin.String**| The workspace to create the channel in. Note: this argument is required unless you set &#x60;org_wide&#x3D;true&#x60;. | [optional]

### Return type

[**AdminConversationsCreateSchema**](AdminConversationsCreateSchema.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="adminConversationsDelete"></a>
# **adminConversationsDelete**
> AdminConversationsDeleteSchema adminConversationsDelete(token, channelId)



Delete a public or private channel.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = AdminConversationsApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `admin.conversations:write`
val channelId : kotlin.String = channelId_example // kotlin.String | The channel to delete.
try {
    val result : AdminConversationsDeleteSchema = apiInstance.adminConversationsDelete(token, channelId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdminConversationsApi#adminConversationsDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdminConversationsApi#adminConversationsDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;admin.conversations:write&#x60; |
 **channelId** | **kotlin.String**| The channel to delete. |

### Return type

[**AdminConversationsDeleteSchema**](AdminConversationsDeleteSchema.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="adminConversationsDisconnectShared"></a>
# **adminConversationsDisconnectShared**
> AdminConversationsRenameSchema adminConversationsDisconnectShared(token, channelId, leavingTeamIds)



Disconnect a connected channel from one or more workspaces.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = AdminConversationsApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `admin.conversations:write`
val channelId : kotlin.String = channelId_example // kotlin.String | The channel to be disconnected from some workspaces.
val leavingTeamIds : kotlin.String = leavingTeamIds_example // kotlin.String | The team to be removed from the channel. Currently only a single team id can be specified.
try {
    val result : AdminConversationsRenameSchema = apiInstance.adminConversationsDisconnectShared(token, channelId, leavingTeamIds)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdminConversationsApi#adminConversationsDisconnectShared")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdminConversationsApi#adminConversationsDisconnectShared")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;admin.conversations:write&#x60; |
 **channelId** | **kotlin.String**| The channel to be disconnected from some workspaces. |
 **leavingTeamIds** | **kotlin.String**| The team to be removed from the channel. Currently only a single team id can be specified. | [optional]

### Return type

[**AdminConversationsRenameSchema**](AdminConversationsRenameSchema.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="adminConversationsGetConversationPrefs"></a>
# **adminConversationsGetConversationPrefs**
> AdminConversationsGetConversationPrefsSchema adminConversationsGetConversationPrefs(token, channelId)



Get conversation preferences for a public or private channel.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = AdminConversationsApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `admin.conversations:read`
val channelId : kotlin.String = channelId_example // kotlin.String | The channel to get preferences for.
try {
    val result : AdminConversationsGetConversationPrefsSchema = apiInstance.adminConversationsGetConversationPrefs(token, channelId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdminConversationsApi#adminConversationsGetConversationPrefs")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdminConversationsApi#adminConversationsGetConversationPrefs")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;admin.conversations:read&#x60; |
 **channelId** | **kotlin.String**| The channel to get preferences for. |

### Return type

[**AdminConversationsGetConversationPrefsSchema**](AdminConversationsGetConversationPrefsSchema.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="adminConversationsGetTeams"></a>
# **adminConversationsGetTeams**
> AdminConversationsGetTeamsSchema adminConversationsGetTeams(token, channelId, cursor, limit)



Get all the workspaces a given public or private channel is connected to within this Enterprise org.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = AdminConversationsApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `admin.conversations:read`
val channelId : kotlin.String = channelId_example // kotlin.String | The channel to determine connected workspaces within the organization for.
val cursor : kotlin.String = cursor_example // kotlin.String | Set `cursor` to `next_cursor` returned by the previous call to list items in the next page
val limit : kotlin.Int = 56 // kotlin.Int | The maximum number of items to return. Must be between 1 - 1000 both inclusive.
try {
    val result : AdminConversationsGetTeamsSchema = apiInstance.adminConversationsGetTeams(token, channelId, cursor, limit)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdminConversationsApi#adminConversationsGetTeams")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdminConversationsApi#adminConversationsGetTeams")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;admin.conversations:read&#x60; |
 **channelId** | **kotlin.String**| The channel to determine connected workspaces within the organization for. |
 **cursor** | **kotlin.String**| Set &#x60;cursor&#x60; to &#x60;next_cursor&#x60; returned by the previous call to list items in the next page | [optional]
 **limit** | **kotlin.Int**| The maximum number of items to return. Must be between 1 - 1000 both inclusive. | [optional]

### Return type

[**AdminConversationsGetTeamsSchema**](AdminConversationsGetTeamsSchema.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="adminConversationsInvite"></a>
# **adminConversationsInvite**
> AdminConversationsInviteSchema adminConversationsInvite(token, channelId, userIds)



Invite a user to a public or private channel.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = AdminConversationsApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `admin.conversations:write`
val channelId : kotlin.String = channelId_example // kotlin.String | The channel that the users will be invited to.
val userIds : kotlin.String = userIds_example // kotlin.String | The users to invite.
try {
    val result : AdminConversationsInviteSchema = apiInstance.adminConversationsInvite(token, channelId, userIds)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdminConversationsApi#adminConversationsInvite")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdminConversationsApi#adminConversationsInvite")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;admin.conversations:write&#x60; |
 **channelId** | **kotlin.String**| The channel that the users will be invited to. |
 **userIds** | **kotlin.String**| The users to invite. |

### Return type

[**AdminConversationsInviteSchema**](AdminConversationsInviteSchema.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="adminConversationsRename"></a>
# **adminConversationsRename**
> AdminConversationsRenameSchema1 adminConversationsRename(token, channelId, name)



Rename a public or private channel.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = AdminConversationsApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `admin.conversations:write`
val channelId : kotlin.String = channelId_example // kotlin.String | The channel to rename.
val name : kotlin.String = name_example // kotlin.String | 
try {
    val result : AdminConversationsRenameSchema1 = apiInstance.adminConversationsRename(token, channelId, name)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdminConversationsApi#adminConversationsRename")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdminConversationsApi#adminConversationsRename")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;admin.conversations:write&#x60; |
 **channelId** | **kotlin.String**| The channel to rename. |
 **name** | **kotlin.String**|  |

### Return type

[**AdminConversationsRenameSchema1**](AdminConversationsRenameSchema1.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="adminConversationsSearch"></a>
# **adminConversationsSearch**
> AdminConversationsSearchSchema adminConversationsSearch(token, teamIds, query, limit, cursor, searchChannelTypes, sort, sortDir)



Search for public or private channels in an Enterprise organization.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = AdminConversationsApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `admin.conversations:read`
val teamIds : kotlin.String = teamIds_example // kotlin.String | Comma separated string of team IDs, signifying the workspaces to search through.
val query : kotlin.String = query_example // kotlin.String | Name of the the channel to query by.
val limit : kotlin.Int = 56 // kotlin.Int | Maximum number of items to be returned. Must be between 1 - 20 both inclusive. Default is 10.
val cursor : kotlin.String = cursor_example // kotlin.String | Set `cursor` to `next_cursor` returned by the previous call to list items in the next page.
val searchChannelTypes : kotlin.String = searchChannelTypes_example // kotlin.String | The type of channel to include or exclude in the search. For example `private` will search private channels, while `private_exclude` will exclude them. For a full list of types, check the [Types section](#types).
val sort : kotlin.String = sort_example // kotlin.String | Possible values are `relevant` (search ranking based on what we think is closest), `name` (alphabetical), `member_count` (number of users in the channel), and `created` (date channel was created). You can optionally pair this with the `sort_dir` arg to change how it is sorted 
val sortDir : kotlin.String = sortDir_example // kotlin.String | Sort direction. Possible values are `asc` for ascending order like (1, 2, 3) or (a, b, c), and `desc` for descending order like (3, 2, 1) or (c, b, a)
try {
    val result : AdminConversationsSearchSchema = apiInstance.adminConversationsSearch(token, teamIds, query, limit, cursor, searchChannelTypes, sort, sortDir)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdminConversationsApi#adminConversationsSearch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdminConversationsApi#adminConversationsSearch")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;admin.conversations:read&#x60; |
 **teamIds** | **kotlin.String**| Comma separated string of team IDs, signifying the workspaces to search through. | [optional]
 **query** | **kotlin.String**| Name of the the channel to query by. | [optional]
 **limit** | **kotlin.Int**| Maximum number of items to be returned. Must be between 1 - 20 both inclusive. Default is 10. | [optional]
 **cursor** | **kotlin.String**| Set &#x60;cursor&#x60; to &#x60;next_cursor&#x60; returned by the previous call to list items in the next page. | [optional]
 **searchChannelTypes** | **kotlin.String**| The type of channel to include or exclude in the search. For example &#x60;private&#x60; will search private channels, while &#x60;private_exclude&#x60; will exclude them. For a full list of types, check the [Types section](#types). | [optional]
 **sort** | **kotlin.String**| Possible values are &#x60;relevant&#x60; (search ranking based on what we think is closest), &#x60;name&#x60; (alphabetical), &#x60;member_count&#x60; (number of users in the channel), and &#x60;created&#x60; (date channel was created). You can optionally pair this with the &#x60;sort_dir&#x60; arg to change how it is sorted  | [optional]
 **sortDir** | **kotlin.String**| Sort direction. Possible values are &#x60;asc&#x60; for ascending order like (1, 2, 3) or (a, b, c), and &#x60;desc&#x60; for descending order like (3, 2, 1) or (c, b, a) | [optional]

### Return type

[**AdminConversationsSearchSchema**](AdminConversationsSearchSchema.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="adminConversationsSetConversationPrefs"></a>
# **adminConversationsSetConversationPrefs**
> AdminConversationsSetConversationPrefsSchema adminConversationsSetConversationPrefs(token, channelId, prefs)



Set the posting permissions for a public or private channel.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = AdminConversationsApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `admin.conversations:write`
val channelId : kotlin.String = channelId_example // kotlin.String | The channel to set the prefs for
val prefs : kotlin.String = prefs_example // kotlin.String | The prefs for this channel in a stringified JSON format.
try {
    val result : AdminConversationsSetConversationPrefsSchema = apiInstance.adminConversationsSetConversationPrefs(token, channelId, prefs)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdminConversationsApi#adminConversationsSetConversationPrefs")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdminConversationsApi#adminConversationsSetConversationPrefs")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;admin.conversations:write&#x60; |
 **channelId** | **kotlin.String**| The channel to set the prefs for |
 **prefs** | **kotlin.String**| The prefs for this channel in a stringified JSON format. |

### Return type

[**AdminConversationsSetConversationPrefsSchema**](AdminConversationsSetConversationPrefsSchema.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="adminConversationsSetTeams"></a>
# **adminConversationsSetTeams**
> DefaultSuccessTemplate adminConversationsSetTeams(token, channelId, orgChannel, targetTeamIds, teamId)



Set the workspaces in an Enterprise grid org that connect to a public or private channel.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = AdminConversationsApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `admin.conversations:write`
val channelId : kotlin.String = channelId_example // kotlin.String | The encoded `channel_id` to add or remove to workspaces.
val orgChannel : kotlin.Boolean = true // kotlin.Boolean | True if channel has to be converted to an org channel
val targetTeamIds : kotlin.String = targetTeamIds_example // kotlin.String | A comma-separated list of workspaces to which the channel should be shared. Not required if the channel is being shared org-wide.
val teamId : kotlin.String = teamId_example // kotlin.String | The workspace to which the channel belongs. Omit this argument if the channel is a cross-workspace shared channel.
try {
    val result : DefaultSuccessTemplate = apiInstance.adminConversationsSetTeams(token, channelId, orgChannel, targetTeamIds, teamId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdminConversationsApi#adminConversationsSetTeams")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdminConversationsApi#adminConversationsSetTeams")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;admin.conversations:write&#x60; |
 **channelId** | **kotlin.String**| The encoded &#x60;channel_id&#x60; to add or remove to workspaces. |
 **orgChannel** | **kotlin.Boolean**| True if channel has to be converted to an org channel | [optional]
 **targetTeamIds** | **kotlin.String**| A comma-separated list of workspaces to which the channel should be shared. Not required if the channel is being shared org-wide. | [optional]
 **teamId** | **kotlin.String**| The workspace to which the channel belongs. Omit this argument if the channel is a cross-workspace shared channel. | [optional]

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="adminConversationsUnarchive"></a>
# **adminConversationsUnarchive**
> AdminConversationsUnarchiveSchema adminConversationsUnarchive(token, channelId)



Unarchive a public or private channel.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = AdminConversationsApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `admin.conversations:write`
val channelId : kotlin.String = channelId_example // kotlin.String | The channel to unarchive.
try {
    val result : AdminConversationsUnarchiveSchema = apiInstance.adminConversationsUnarchive(token, channelId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdminConversationsApi#adminConversationsUnarchive")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdminConversationsApi#adminConversationsUnarchive")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;admin.conversations:write&#x60; |
 **channelId** | **kotlin.String**| The channel to unarchive. |

### Return type

[**AdminConversationsUnarchiveSchema**](AdminConversationsUnarchiveSchema.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

