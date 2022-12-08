# ConversationsApi

All URIs are relative to *https://slack.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**conversationsArchive**](ConversationsApi.md#conversationsArchive) | **POST** /conversations.archive | 
[**conversationsClose**](ConversationsApi.md#conversationsClose) | **POST** /conversations.close | 
[**conversationsCreate**](ConversationsApi.md#conversationsCreate) | **POST** /conversations.create | 
[**conversationsHistory**](ConversationsApi.md#conversationsHistory) | **GET** /conversations.history | 
[**conversationsInfo**](ConversationsApi.md#conversationsInfo) | **GET** /conversations.info | 
[**conversationsInvite**](ConversationsApi.md#conversationsInvite) | **POST** /conversations.invite | 
[**conversationsJoin**](ConversationsApi.md#conversationsJoin) | **POST** /conversations.join | 
[**conversationsKick**](ConversationsApi.md#conversationsKick) | **POST** /conversations.kick | 
[**conversationsLeave**](ConversationsApi.md#conversationsLeave) | **POST** /conversations.leave | 
[**conversationsList**](ConversationsApi.md#conversationsList) | **GET** /conversations.list | 
[**conversationsMark**](ConversationsApi.md#conversationsMark) | **POST** /conversations.mark | 
[**conversationsMembers**](ConversationsApi.md#conversationsMembers) | **GET** /conversations.members | 
[**conversationsOpen**](ConversationsApi.md#conversationsOpen) | **POST** /conversations.open | 
[**conversationsRename**](ConversationsApi.md#conversationsRename) | **POST** /conversations.rename | 
[**conversationsReplies**](ConversationsApi.md#conversationsReplies) | **GET** /conversations.replies | 
[**conversationsSetPurpose**](ConversationsApi.md#conversationsSetPurpose) | **POST** /conversations.setPurpose | 
[**conversationsSetTopic**](ConversationsApi.md#conversationsSetTopic) | **POST** /conversations.setTopic | 
[**conversationsUnarchive**](ConversationsApi.md#conversationsUnarchive) | **POST** /conversations.unarchive | 


<a name="conversationsArchive"></a>
# **conversationsArchive**
> ConversationsArchiveSuccessSchema conversationsArchive(token, channel)



Archives a conversation.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = ConversationsApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `conversations:write`
val channel : kotlin.String = channel_example // kotlin.String | ID of conversation to archive
try {
    val result : ConversationsArchiveSuccessSchema = apiInstance.conversationsArchive(token, channel)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ConversationsApi#conversationsArchive")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ConversationsApi#conversationsArchive")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;conversations:write&#x60; | [optional]
 **channel** | **kotlin.String**| ID of conversation to archive | [optional]

### Return type

[**ConversationsArchiveSuccessSchema**](ConversationsArchiveSuccessSchema.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="conversationsClose"></a>
# **conversationsClose**
> ConversationsCloseSuccessSchema conversationsClose(token, channel)



Closes a direct message or multi-person direct message.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = ConversationsApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `conversations:write`
val channel : kotlin.String = channel_example // kotlin.String | Conversation to close.
try {
    val result : ConversationsCloseSuccessSchema = apiInstance.conversationsClose(token, channel)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ConversationsApi#conversationsClose")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ConversationsApi#conversationsClose")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;conversations:write&#x60; | [optional]
 **channel** | **kotlin.String**| Conversation to close. | [optional]

### Return type

[**ConversationsCloseSuccessSchema**](ConversationsCloseSuccessSchema.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="conversationsCreate"></a>
# **conversationsCreate**
> ConversationsCreateSuccessSchema conversationsCreate(token, isPrivate, name)



Initiates a public or private channel-based conversation

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = ConversationsApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `conversations:write`
val isPrivate : kotlin.Boolean = true // kotlin.Boolean | Create a private channel instead of a public one
val name : kotlin.String = name_example // kotlin.String | Name of the public or private channel to create
try {
    val result : ConversationsCreateSuccessSchema = apiInstance.conversationsCreate(token, isPrivate, name)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ConversationsApi#conversationsCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ConversationsApi#conversationsCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;conversations:write&#x60; | [optional]
 **isPrivate** | **kotlin.Boolean**| Create a private channel instead of a public one | [optional]
 **name** | **kotlin.String**| Name of the public or private channel to create | [optional]

### Return type

[**ConversationsCreateSuccessSchema**](ConversationsCreateSuccessSchema.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="conversationsHistory"></a>
# **conversationsHistory**
> ConversationsHistorySuccessSchema conversationsHistory(token, channel, latest, oldest, inclusive, limit, cursor)



Fetches a conversation&#39;s history of messages and events.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = ConversationsApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `conversations:history`
val channel : kotlin.String = channel_example // kotlin.String | Conversation ID to fetch history for.
val latest : java.math.BigDecimal = 8.14 // java.math.BigDecimal | End of time range of messages to include in results.
val oldest : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Start of time range of messages to include in results.
val inclusive : kotlin.Boolean = true // kotlin.Boolean | Include messages with latest or oldest timestamp in results only when either timestamp is specified.
val limit : kotlin.Int = 56 // kotlin.Int | The maximum number of items to return. Fewer than the requested number of items may be returned, even if the end of the users list hasn't been reached.
val cursor : kotlin.String = cursor_example // kotlin.String | Paginate through collections of data by setting the `cursor` parameter to a `next_cursor` attribute returned by a previous request's `response_metadata`. Default value fetches the first \"page\" of the collection. See [pagination](/docs/pagination) for more detail.
try {
    val result : ConversationsHistorySuccessSchema = apiInstance.conversationsHistory(token, channel, latest, oldest, inclusive, limit, cursor)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ConversationsApi#conversationsHistory")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ConversationsApi#conversationsHistory")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;conversations:history&#x60; | [optional]
 **channel** | **kotlin.String**| Conversation ID to fetch history for. | [optional]
 **latest** | **java.math.BigDecimal**| End of time range of messages to include in results. | [optional]
 **oldest** | **java.math.BigDecimal**| Start of time range of messages to include in results. | [optional]
 **inclusive** | **kotlin.Boolean**| Include messages with latest or oldest timestamp in results only when either timestamp is specified. | [optional]
 **limit** | **kotlin.Int**| The maximum number of items to return. Fewer than the requested number of items may be returned, even if the end of the users list hasn&#39;t been reached. | [optional]
 **cursor** | **kotlin.String**| Paginate through collections of data by setting the &#x60;cursor&#x60; parameter to a &#x60;next_cursor&#x60; attribute returned by a previous request&#39;s &#x60;response_metadata&#x60;. Default value fetches the first \&quot;page\&quot; of the collection. See [pagination](/docs/pagination) for more detail. | [optional]

### Return type

[**ConversationsHistorySuccessSchema**](ConversationsHistorySuccessSchema.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="conversationsInfo"></a>
# **conversationsInfo**
> ConversationsInfoSuccessSchema conversationsInfo(token, channel, includeLocale, includeNumMembers)



Retrieve information about a conversation.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = ConversationsApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `conversations:read`
val channel : kotlin.String = channel_example // kotlin.String | Conversation ID to learn more about
val includeLocale : kotlin.Boolean = true // kotlin.Boolean | Set this to `true` to receive the locale for this conversation. Defaults to `false`
val includeNumMembers : kotlin.Boolean = true // kotlin.Boolean | Set to `true` to include the member count for the specified conversation. Defaults to `false`
try {
    val result : ConversationsInfoSuccessSchema = apiInstance.conversationsInfo(token, channel, includeLocale, includeNumMembers)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ConversationsApi#conversationsInfo")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ConversationsApi#conversationsInfo")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;conversations:read&#x60; | [optional]
 **channel** | **kotlin.String**| Conversation ID to learn more about | [optional]
 **includeLocale** | **kotlin.Boolean**| Set this to &#x60;true&#x60; to receive the locale for this conversation. Defaults to &#x60;false&#x60; | [optional]
 **includeNumMembers** | **kotlin.Boolean**| Set to &#x60;true&#x60; to include the member count for the specified conversation. Defaults to &#x60;false&#x60; | [optional]

### Return type

[**ConversationsInfoSuccessSchema**](ConversationsInfoSuccessSchema.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="conversationsInvite"></a>
# **conversationsInvite**
> ConversationsInviteErrorSchema conversationsInvite(token, channel, users)



Invites users to a channel.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = ConversationsApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `conversations:write`
val channel : kotlin.String = channel_example // kotlin.String | The ID of the public or private channel to invite user(s) to.
val users : kotlin.String = users_example // kotlin.String | A comma separated list of user IDs. Up to 1000 users may be listed.
try {
    val result : ConversationsInviteErrorSchema = apiInstance.conversationsInvite(token, channel, users)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ConversationsApi#conversationsInvite")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ConversationsApi#conversationsInvite")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;conversations:write&#x60; | [optional]
 **channel** | **kotlin.String**| The ID of the public or private channel to invite user(s) to. | [optional]
 **users** | **kotlin.String**| A comma separated list of user IDs. Up to 1000 users may be listed. | [optional]

### Return type

[**ConversationsInviteErrorSchema**](ConversationsInviteErrorSchema.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="conversationsJoin"></a>
# **conversationsJoin**
> ConversationsJoinSuccessSchema conversationsJoin(token, channel)



Joins an existing conversation.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = ConversationsApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `channels:write`
val channel : kotlin.String = channel_example // kotlin.String | ID of conversation to join
try {
    val result : ConversationsJoinSuccessSchema = apiInstance.conversationsJoin(token, channel)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ConversationsApi#conversationsJoin")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ConversationsApi#conversationsJoin")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;channels:write&#x60; | [optional]
 **channel** | **kotlin.String**| ID of conversation to join | [optional]

### Return type

[**ConversationsJoinSuccessSchema**](ConversationsJoinSuccessSchema.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="conversationsKick"></a>
# **conversationsKick**
> ConversationsKickSuccessSchema conversationsKick(token, channel, user)



Removes a user from a conversation.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = ConversationsApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `conversations:write`
val channel : kotlin.String = channel_example // kotlin.String | ID of conversation to remove user from.
val user : kotlin.String = user_example // kotlin.String | User ID to be removed.
try {
    val result : ConversationsKickSuccessSchema = apiInstance.conversationsKick(token, channel, user)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ConversationsApi#conversationsKick")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ConversationsApi#conversationsKick")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;conversations:write&#x60; | [optional]
 **channel** | **kotlin.String**| ID of conversation to remove user from. | [optional]
 **user** | **kotlin.String**| User ID to be removed. | [optional]

### Return type

[**ConversationsKickSuccessSchema**](ConversationsKickSuccessSchema.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="conversationsLeave"></a>
# **conversationsLeave**
> ConversationsLeaveSuccessSchema conversationsLeave(token, channel)



Leaves a conversation.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = ConversationsApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `conversations:write`
val channel : kotlin.String = channel_example // kotlin.String | Conversation to leave
try {
    val result : ConversationsLeaveSuccessSchema = apiInstance.conversationsLeave(token, channel)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ConversationsApi#conversationsLeave")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ConversationsApi#conversationsLeave")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;conversations:write&#x60; | [optional]
 **channel** | **kotlin.String**| Conversation to leave | [optional]

### Return type

[**ConversationsLeaveSuccessSchema**](ConversationsLeaveSuccessSchema.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="conversationsList"></a>
# **conversationsList**
> ConversationsListSuccessSchema conversationsList(token, excludeArchived, types, limit, cursor)



Lists all channels in a Slack team.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = ConversationsApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `conversations:read`
val excludeArchived : kotlin.Boolean = true // kotlin.Boolean | Set to `true` to exclude archived channels from the list
val types : kotlin.String = types_example // kotlin.String | Mix and match channel types by providing a comma-separated list of any combination of `public_channel`, `private_channel`, `mpim`, `im`
val limit : kotlin.Int = 56 // kotlin.Int | The maximum number of items to return. Fewer than the requested number of items may be returned, even if the end of the list hasn't been reached. Must be an integer no larger than 1000.
val cursor : kotlin.String = cursor_example // kotlin.String | Paginate through collections of data by setting the `cursor` parameter to a `next_cursor` attribute returned by a previous request's `response_metadata`. Default value fetches the first \"page\" of the collection. See [pagination](/docs/pagination) for more detail.
try {
    val result : ConversationsListSuccessSchema = apiInstance.conversationsList(token, excludeArchived, types, limit, cursor)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ConversationsApi#conversationsList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ConversationsApi#conversationsList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;conversations:read&#x60; | [optional]
 **excludeArchived** | **kotlin.Boolean**| Set to &#x60;true&#x60; to exclude archived channels from the list | [optional]
 **types** | **kotlin.String**| Mix and match channel types by providing a comma-separated list of any combination of &#x60;public_channel&#x60;, &#x60;private_channel&#x60;, &#x60;mpim&#x60;, &#x60;im&#x60; | [optional]
 **limit** | **kotlin.Int**| The maximum number of items to return. Fewer than the requested number of items may be returned, even if the end of the list hasn&#39;t been reached. Must be an integer no larger than 1000. | [optional]
 **cursor** | **kotlin.String**| Paginate through collections of data by setting the &#x60;cursor&#x60; parameter to a &#x60;next_cursor&#x60; attribute returned by a previous request&#39;s &#x60;response_metadata&#x60;. Default value fetches the first \&quot;page\&quot; of the collection. See [pagination](/docs/pagination) for more detail. | [optional]

### Return type

[**ConversationsListSuccessSchema**](ConversationsListSuccessSchema.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="conversationsMark"></a>
# **conversationsMark**
> ConversationsMarkSuccessSchema conversationsMark(token, channel, ts)



Sets the read cursor in a channel.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = ConversationsApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `conversations:write`
val channel : kotlin.String = channel_example // kotlin.String | Channel or conversation to set the read cursor for.
val ts : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Unique identifier of message you want marked as most recently seen in this conversation.
try {
    val result : ConversationsMarkSuccessSchema = apiInstance.conversationsMark(token, channel, ts)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ConversationsApi#conversationsMark")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ConversationsApi#conversationsMark")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;conversations:write&#x60; | [optional]
 **channel** | **kotlin.String**| Channel or conversation to set the read cursor for. | [optional]
 **ts** | **java.math.BigDecimal**| Unique identifier of message you want marked as most recently seen in this conversation. | [optional]

### Return type

[**ConversationsMarkSuccessSchema**](ConversationsMarkSuccessSchema.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="conversationsMembers"></a>
# **conversationsMembers**
> ConversationsMembersSuccessSchema conversationsMembers(token, channel, limit, cursor)



Retrieve members of a conversation.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = ConversationsApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `conversations:read`
val channel : kotlin.String = channel_example // kotlin.String | ID of the conversation to retrieve members for
val limit : kotlin.Int = 56 // kotlin.Int | The maximum number of items to return. Fewer than the requested number of items may be returned, even if the end of the users list hasn't been reached.
val cursor : kotlin.String = cursor_example // kotlin.String | Paginate through collections of data by setting the `cursor` parameter to a `next_cursor` attribute returned by a previous request's `response_metadata`. Default value fetches the first \"page\" of the collection. See [pagination](/docs/pagination) for more detail.
try {
    val result : ConversationsMembersSuccessSchema = apiInstance.conversationsMembers(token, channel, limit, cursor)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ConversationsApi#conversationsMembers")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ConversationsApi#conversationsMembers")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;conversations:read&#x60; | [optional]
 **channel** | **kotlin.String**| ID of the conversation to retrieve members for | [optional]
 **limit** | **kotlin.Int**| The maximum number of items to return. Fewer than the requested number of items may be returned, even if the end of the users list hasn&#39;t been reached. | [optional]
 **cursor** | **kotlin.String**| Paginate through collections of data by setting the &#x60;cursor&#x60; parameter to a &#x60;next_cursor&#x60; attribute returned by a previous request&#39;s &#x60;response_metadata&#x60;. Default value fetches the first \&quot;page\&quot; of the collection. See [pagination](/docs/pagination) for more detail. | [optional]

### Return type

[**ConversationsMembersSuccessSchema**](ConversationsMembersSuccessSchema.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="conversationsOpen"></a>
# **conversationsOpen**
> ConversationsOpenSuccessSchema conversationsOpen(token, channel, returnIm, users)



Opens or resumes a direct message or multi-person direct message.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = ConversationsApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `conversations:write`
val channel : kotlin.String = channel_example // kotlin.String | Resume a conversation by supplying an `im` or `mpim`'s ID. Or provide the `users` field instead.
val returnIm : kotlin.Boolean = true // kotlin.Boolean | Boolean, indicates you want the full IM channel definition in the response.
val users : kotlin.String = users_example // kotlin.String | Comma separated lists of users. If only one user is included, this creates a 1:1 DM.  The ordering of the users is preserved whenever a multi-person direct message is returned. Supply a `channel` when not supplying `users`.
try {
    val result : ConversationsOpenSuccessSchema = apiInstance.conversationsOpen(token, channel, returnIm, users)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ConversationsApi#conversationsOpen")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ConversationsApi#conversationsOpen")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;conversations:write&#x60; | [optional]
 **channel** | **kotlin.String**| Resume a conversation by supplying an &#x60;im&#x60; or &#x60;mpim&#x60;&#39;s ID. Or provide the &#x60;users&#x60; field instead. | [optional]
 **returnIm** | **kotlin.Boolean**| Boolean, indicates you want the full IM channel definition in the response. | [optional]
 **users** | **kotlin.String**| Comma separated lists of users. If only one user is included, this creates a 1:1 DM.  The ordering of the users is preserved whenever a multi-person direct message is returned. Supply a &#x60;channel&#x60; when not supplying &#x60;users&#x60;. | [optional]

### Return type

[**ConversationsOpenSuccessSchema**](ConversationsOpenSuccessSchema.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="conversationsRename"></a>
# **conversationsRename**
> ConversationsRenameSuccessSchema conversationsRename(token, channel, name)



Renames a conversation.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = ConversationsApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `conversations:write`
val channel : kotlin.String = channel_example // kotlin.String | ID of conversation to rename
val name : kotlin.String = name_example // kotlin.String | New name for conversation.
try {
    val result : ConversationsRenameSuccessSchema = apiInstance.conversationsRename(token, channel, name)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ConversationsApi#conversationsRename")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ConversationsApi#conversationsRename")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;conversations:write&#x60; | [optional]
 **channel** | **kotlin.String**| ID of conversation to rename | [optional]
 **name** | **kotlin.String**| New name for conversation. | [optional]

### Return type

[**ConversationsRenameSuccessSchema**](ConversationsRenameSuccessSchema.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="conversationsReplies"></a>
# **conversationsReplies**
> ConversationsRepliesSuccessSchema conversationsReplies(token, channel, ts, latest, oldest, inclusive, limit, cursor)



Retrieve a thread of messages posted to a conversation

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = ConversationsApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `conversations:history`
val channel : kotlin.String = channel_example // kotlin.String | Conversation ID to fetch thread from.
val ts : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Unique identifier of a thread's parent message. `ts` must be the timestamp of an existing message with 0 or more replies. If there are no replies then just the single message referenced by `ts` will return - it is just an ordinary, unthreaded message.
val latest : java.math.BigDecimal = 8.14 // java.math.BigDecimal | End of time range of messages to include in results.
val oldest : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Start of time range of messages to include in results.
val inclusive : kotlin.Boolean = true // kotlin.Boolean | Include messages with latest or oldest timestamp in results only when either timestamp is specified.
val limit : kotlin.Int = 56 // kotlin.Int | The maximum number of items to return. Fewer than the requested number of items may be returned, even if the end of the users list hasn't been reached.
val cursor : kotlin.String = cursor_example // kotlin.String | Paginate through collections of data by setting the `cursor` parameter to a `next_cursor` attribute returned by a previous request's `response_metadata`. Default value fetches the first \"page\" of the collection. See [pagination](/docs/pagination) for more detail.
try {
    val result : ConversationsRepliesSuccessSchema = apiInstance.conversationsReplies(token, channel, ts, latest, oldest, inclusive, limit, cursor)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ConversationsApi#conversationsReplies")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ConversationsApi#conversationsReplies")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;conversations:history&#x60; | [optional]
 **channel** | **kotlin.String**| Conversation ID to fetch thread from. | [optional]
 **ts** | **java.math.BigDecimal**| Unique identifier of a thread&#39;s parent message. &#x60;ts&#x60; must be the timestamp of an existing message with 0 or more replies. If there are no replies then just the single message referenced by &#x60;ts&#x60; will return - it is just an ordinary, unthreaded message. | [optional]
 **latest** | **java.math.BigDecimal**| End of time range of messages to include in results. | [optional]
 **oldest** | **java.math.BigDecimal**| Start of time range of messages to include in results. | [optional]
 **inclusive** | **kotlin.Boolean**| Include messages with latest or oldest timestamp in results only when either timestamp is specified. | [optional]
 **limit** | **kotlin.Int**| The maximum number of items to return. Fewer than the requested number of items may be returned, even if the end of the users list hasn&#39;t been reached. | [optional]
 **cursor** | **kotlin.String**| Paginate through collections of data by setting the &#x60;cursor&#x60; parameter to a &#x60;next_cursor&#x60; attribute returned by a previous request&#39;s &#x60;response_metadata&#x60;. Default value fetches the first \&quot;page\&quot; of the collection. See [pagination](/docs/pagination) for more detail. | [optional]

### Return type

[**ConversationsRepliesSuccessSchema**](ConversationsRepliesSuccessSchema.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="conversationsSetPurpose"></a>
# **conversationsSetPurpose**
> ConversationsSetPurposeSuccessSchema conversationsSetPurpose(token, channel, purpose)



Sets the purpose for a conversation.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = ConversationsApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `conversations:write`
val channel : kotlin.String = channel_example // kotlin.String | Conversation to set the purpose of
val purpose : kotlin.String = purpose_example // kotlin.String | A new, specialer purpose
try {
    val result : ConversationsSetPurposeSuccessSchema = apiInstance.conversationsSetPurpose(token, channel, purpose)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ConversationsApi#conversationsSetPurpose")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ConversationsApi#conversationsSetPurpose")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;conversations:write&#x60; | [optional]
 **channel** | **kotlin.String**| Conversation to set the purpose of | [optional]
 **purpose** | **kotlin.String**| A new, specialer purpose | [optional]

### Return type

[**ConversationsSetPurposeSuccessSchema**](ConversationsSetPurposeSuccessSchema.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="conversationsSetTopic"></a>
# **conversationsSetTopic**
> ConversationsSetTopicSuccessSchema conversationsSetTopic(token, channel, topic)



Sets the topic for a conversation.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = ConversationsApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `conversations:write`
val channel : kotlin.String = channel_example // kotlin.String | Conversation to set the topic of
val topic : kotlin.String = topic_example // kotlin.String | The new topic string. Does not support formatting or linkification.
try {
    val result : ConversationsSetTopicSuccessSchema = apiInstance.conversationsSetTopic(token, channel, topic)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ConversationsApi#conversationsSetTopic")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ConversationsApi#conversationsSetTopic")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;conversations:write&#x60; | [optional]
 **channel** | **kotlin.String**| Conversation to set the topic of | [optional]
 **topic** | **kotlin.String**| The new topic string. Does not support formatting or linkification. | [optional]

### Return type

[**ConversationsSetTopicSuccessSchema**](ConversationsSetTopicSuccessSchema.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="conversationsUnarchive"></a>
# **conversationsUnarchive**
> ConversationsUnarchiveSuccessSchema conversationsUnarchive(token, channel)



Reverses conversation archival.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = ConversationsApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `conversations:write`
val channel : kotlin.String = channel_example // kotlin.String | ID of conversation to unarchive
try {
    val result : ConversationsUnarchiveSuccessSchema = apiInstance.conversationsUnarchive(token, channel)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ConversationsApi#conversationsUnarchive")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ConversationsApi#conversationsUnarchive")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;conversations:write&#x60; | [optional]
 **channel** | **kotlin.String**| ID of conversation to unarchive | [optional]

### Return type

[**ConversationsUnarchiveSuccessSchema**](ConversationsUnarchiveSuccessSchema.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

