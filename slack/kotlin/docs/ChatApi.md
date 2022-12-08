# ChatApi

All URIs are relative to *https://slack.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**chatDelete**](ChatApi.md#chatDelete) | **POST** /chat.delete | 
[**chatDeleteScheduledMessage**](ChatApi.md#chatDeleteScheduledMessage) | **POST** /chat.deleteScheduledMessage | 
[**chatGetPermalink**](ChatApi.md#chatGetPermalink) | **GET** /chat.getPermalink | 
[**chatMeMessage**](ChatApi.md#chatMeMessage) | **POST** /chat.meMessage | 
[**chatPostEphemeral**](ChatApi.md#chatPostEphemeral) | **POST** /chat.postEphemeral | 
[**chatPostMessage**](ChatApi.md#chatPostMessage) | **POST** /chat.postMessage | 
[**chatScheduleMessage**](ChatApi.md#chatScheduleMessage) | **POST** /chat.scheduleMessage | 
[**chatScheduledMessagesList**](ChatApi.md#chatScheduledMessagesList) | **GET** /chat.scheduledMessages.list | 
[**chatUnfurl**](ChatApi.md#chatUnfurl) | **POST** /chat.unfurl | 
[**chatUpdate**](ChatApi.md#chatUpdate) | **POST** /chat.update | 


<a name="chatDelete"></a>
# **chatDelete**
> ChatDeleteSuccessSchema chatDelete(token, asUser, channel, ts)



Deletes a message.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = ChatApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `chat:write`
val asUser : kotlin.Boolean = true // kotlin.Boolean | Pass true to delete the message as the authed user with `chat:write:user` scope. [Bot users](/bot-users) in this context are considered authed users. If unused or false, the message will be deleted with `chat:write:bot` scope.
val channel : kotlin.String = channel_example // kotlin.String | Channel containing the message to be deleted.
val ts : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Timestamp of the message to be deleted.
try {
    val result : ChatDeleteSuccessSchema = apiInstance.chatDelete(token, asUser, channel, ts)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ChatApi#chatDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ChatApi#chatDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;chat:write&#x60; | [optional]
 **asUser** | **kotlin.Boolean**| Pass true to delete the message as the authed user with &#x60;chat:write:user&#x60; scope. [Bot users](/bot-users) in this context are considered authed users. If unused or false, the message will be deleted with &#x60;chat:write:bot&#x60; scope. | [optional]
 **channel** | **kotlin.String**| Channel containing the message to be deleted. | [optional]
 **ts** | **java.math.BigDecimal**| Timestamp of the message to be deleted. | [optional]

### Return type

[**ChatDeleteSuccessSchema**](ChatDeleteSuccessSchema.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="chatDeleteScheduledMessage"></a>
# **chatDeleteScheduledMessage**
> ChatDeleteScheduledMessageSchema chatDeleteScheduledMessage(token, channel, scheduledMessageId, asUser)



Deletes a pending scheduled message from the queue.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = ChatApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `chat:write`
val channel : kotlin.String = channel_example // kotlin.String | The channel the scheduled_message is posting to
val scheduledMessageId : kotlin.String = scheduledMessageId_example // kotlin.String | `scheduled_message_id` returned from call to chat.scheduleMessage
val asUser : kotlin.Boolean = true // kotlin.Boolean | Pass true to delete the message as the authed user with `chat:write:user` scope. [Bot users](/bot-users) in this context are considered authed users. If unused or false, the message will be deleted with `chat:write:bot` scope.
try {
    val result : ChatDeleteScheduledMessageSchema = apiInstance.chatDeleteScheduledMessage(token, channel, scheduledMessageId, asUser)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ChatApi#chatDeleteScheduledMessage")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ChatApi#chatDeleteScheduledMessage")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;chat:write&#x60; |
 **channel** | **kotlin.String**| The channel the scheduled_message is posting to |
 **scheduledMessageId** | **kotlin.String**| &#x60;scheduled_message_id&#x60; returned from call to chat.scheduleMessage |
 **asUser** | **kotlin.Boolean**| Pass true to delete the message as the authed user with &#x60;chat:write:user&#x60; scope. [Bot users](/bot-users) in this context are considered authed users. If unused or false, the message will be deleted with &#x60;chat:write:bot&#x60; scope. | [optional]

### Return type

[**ChatDeleteScheduledMessageSchema**](ChatDeleteScheduledMessageSchema.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="chatGetPermalink"></a>
# **chatGetPermalink**
> ChatGetPermalinkSuccessSchema chatGetPermalink(token, channel, messageTs)



Retrieve a permalink URL for a specific extant message

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = ChatApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `none`
val channel : kotlin.String = channel_example // kotlin.String | The ID of the conversation or channel containing the message
val messageTs : kotlin.String = messageTs_example // kotlin.String | A message's `ts` value, uniquely identifying it within a channel
try {
    val result : ChatGetPermalinkSuccessSchema = apiInstance.chatGetPermalink(token, channel, messageTs)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ChatApi#chatGetPermalink")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ChatApi#chatGetPermalink")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;none&#x60; |
 **channel** | **kotlin.String**| The ID of the conversation or channel containing the message |
 **messageTs** | **kotlin.String**| A message&#39;s &#x60;ts&#x60; value, uniquely identifying it within a channel |

### Return type

[**ChatGetPermalinkSuccessSchema**](ChatGetPermalinkSuccessSchema.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="chatMeMessage"></a>
# **chatMeMessage**
> ChatMeMessageSchema chatMeMessage(token, channel, text)



Share a me message into a channel.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = ChatApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `chat:write`
val channel : kotlin.String = channel_example // kotlin.String | Channel to send message to. Can be a public channel, private group or IM channel. Can be an encoded ID, or a name.
val text : kotlin.String = text_example // kotlin.String | Text of the message to send.
try {
    val result : ChatMeMessageSchema = apiInstance.chatMeMessage(token, channel, text)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ChatApi#chatMeMessage")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ChatApi#chatMeMessage")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;chat:write&#x60; | [optional]
 **channel** | **kotlin.String**| Channel to send message to. Can be a public channel, private group or IM channel. Can be an encoded ID, or a name. | [optional]
 **text** | **kotlin.String**| Text of the message to send. | [optional]

### Return type

[**ChatMeMessageSchema**](ChatMeMessageSchema.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="chatPostEphemeral"></a>
# **chatPostEphemeral**
> ChatPostEphemeralSuccessSchema chatPostEphemeral(token, channel, user, asUser, attachments, blocks, iconEmoji, iconUrl, linkNames, parse, text, threadTs, username)



Sends an ephemeral message to a user in a channel.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = ChatApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `chat:write`
val channel : kotlin.String = channel_example // kotlin.String | Channel, private group, or IM channel to send message to. Can be an encoded ID, or a name.
val user : kotlin.String = user_example // kotlin.String | `id` of the user who will receive the ephemeral message. The user should be in the channel specified by the `channel` argument.
val asUser : kotlin.Boolean = true // kotlin.Boolean | Pass true to post the message as the authed user. Defaults to true if the chat:write:bot scope is not included. Otherwise, defaults to false.
val attachments : kotlin.String = attachments_example // kotlin.String | A JSON-based array of structured attachments, presented as a URL-encoded string.
val blocks : kotlin.String = blocks_example // kotlin.String | A JSON-based array of structured blocks, presented as a URL-encoded string.
val iconEmoji : kotlin.String = iconEmoji_example // kotlin.String | Emoji to use as the icon for this message. Overrides `icon_url`. Must be used in conjunction with `as_user` set to `false`, otherwise ignored. See [authorship](#authorship) below.
val iconUrl : kotlin.String = iconUrl_example // kotlin.String | URL to an image to use as the icon for this message. Must be used in conjunction with `as_user` set to false, otherwise ignored. See [authorship](#authorship) below.
val linkNames : kotlin.Boolean = true // kotlin.Boolean | Find and link channel names and usernames.
val parse : kotlin.String = parse_example // kotlin.String | Change how messages are treated. Defaults to `none`. See [below](#formatting).
val text : kotlin.String = text_example // kotlin.String | How this field works and whether it is required depends on other fields you use in your API call. [See below](#text_usage) for more detail.
val threadTs : kotlin.String = threadTs_example // kotlin.String | Provide another message's `ts` value to post this message in a thread. Avoid using a reply's `ts` value; use its parent's value instead. Ephemeral messages in threads are only shown if there is already an active thread.
val username : kotlin.String = username_example // kotlin.String | Set your bot's user name. Must be used in conjunction with `as_user` set to false, otherwise ignored. See [authorship](#authorship) below.
try {
    val result : ChatPostEphemeralSuccessSchema = apiInstance.chatPostEphemeral(token, channel, user, asUser, attachments, blocks, iconEmoji, iconUrl, linkNames, parse, text, threadTs, username)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ChatApi#chatPostEphemeral")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ChatApi#chatPostEphemeral")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;chat:write&#x60; |
 **channel** | **kotlin.String**| Channel, private group, or IM channel to send message to. Can be an encoded ID, or a name. |
 **user** | **kotlin.String**| &#x60;id&#x60; of the user who will receive the ephemeral message. The user should be in the channel specified by the &#x60;channel&#x60; argument. |
 **asUser** | **kotlin.Boolean**| Pass true to post the message as the authed user. Defaults to true if the chat:write:bot scope is not included. Otherwise, defaults to false. | [optional]
 **attachments** | **kotlin.String**| A JSON-based array of structured attachments, presented as a URL-encoded string. | [optional]
 **blocks** | **kotlin.String**| A JSON-based array of structured blocks, presented as a URL-encoded string. | [optional]
 **iconEmoji** | **kotlin.String**| Emoji to use as the icon for this message. Overrides &#x60;icon_url&#x60;. Must be used in conjunction with &#x60;as_user&#x60; set to &#x60;false&#x60;, otherwise ignored. See [authorship](#authorship) below. | [optional]
 **iconUrl** | **kotlin.String**| URL to an image to use as the icon for this message. Must be used in conjunction with &#x60;as_user&#x60; set to false, otherwise ignored. See [authorship](#authorship) below. | [optional]
 **linkNames** | **kotlin.Boolean**| Find and link channel names and usernames. | [optional]
 **parse** | **kotlin.String**| Change how messages are treated. Defaults to &#x60;none&#x60;. See [below](#formatting). | [optional]
 **text** | **kotlin.String**| How this field works and whether it is required depends on other fields you use in your API call. [See below](#text_usage) for more detail. | [optional]
 **threadTs** | **kotlin.String**| Provide another message&#39;s &#x60;ts&#x60; value to post this message in a thread. Avoid using a reply&#39;s &#x60;ts&#x60; value; use its parent&#39;s value instead. Ephemeral messages in threads are only shown if there is already an active thread. | [optional]
 **username** | **kotlin.String**| Set your bot&#39;s user name. Must be used in conjunction with &#x60;as_user&#x60; set to false, otherwise ignored. See [authorship](#authorship) below. | [optional]

### Return type

[**ChatPostEphemeralSuccessSchema**](ChatPostEphemeralSuccessSchema.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="chatPostMessage"></a>
# **chatPostMessage**
> ChatPostMessageSuccessSchema chatPostMessage(token, channel, asUser, attachments, blocks, iconEmoji, iconUrl, linkNames, mrkdwn, parse, replyBroadcast, text, threadTs, unfurlLinks, unfurlMedia, username)



Sends a message to a channel.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = ChatApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `chat:write`
val channel : kotlin.String = channel_example // kotlin.String | Channel, private group, or IM channel to send message to. Can be an encoded ID, or a name. See [below](#channels) for more details.
val asUser : kotlin.String = asUser_example // kotlin.String | Pass true to post the message as the authed user, instead of as a bot. Defaults to false. See [authorship](#authorship) below.
val attachments : kotlin.String = attachments_example // kotlin.String | A JSON-based array of structured attachments, presented as a URL-encoded string.
val blocks : kotlin.String = blocks_example // kotlin.String | A JSON-based array of structured blocks, presented as a URL-encoded string.
val iconEmoji : kotlin.String = iconEmoji_example // kotlin.String | Emoji to use as the icon for this message. Overrides `icon_url`. Must be used in conjunction with `as_user` set to `false`, otherwise ignored. See [authorship](#authorship) below.
val iconUrl : kotlin.String = iconUrl_example // kotlin.String | URL to an image to use as the icon for this message. Must be used in conjunction with `as_user` set to false, otherwise ignored. See [authorship](#authorship) below.
val linkNames : kotlin.Boolean = true // kotlin.Boolean | Find and link channel names and usernames.
val mrkdwn : kotlin.Boolean = true // kotlin.Boolean | Disable Slack markup parsing by setting to `false`. Enabled by default.
val parse : kotlin.String = parse_example // kotlin.String | Change how messages are treated. Defaults to `none`. See [below](#formatting).
val replyBroadcast : kotlin.Boolean = true // kotlin.Boolean | Used in conjunction with `thread_ts` and indicates whether reply should be made visible to everyone in the channel or conversation. Defaults to `false`.
val text : kotlin.String = text_example // kotlin.String | How this field works and whether it is required depends on other fields you use in your API call. [See below](#text_usage) for more detail.
val threadTs : kotlin.String = threadTs_example // kotlin.String | Provide another message's `ts` value to make this message a reply. Avoid using a reply's `ts` value; use its parent instead.
val unfurlLinks : kotlin.Boolean = true // kotlin.Boolean | Pass true to enable unfurling of primarily text-based content.
val unfurlMedia : kotlin.Boolean = true // kotlin.Boolean | Pass false to disable unfurling of media content.
val username : kotlin.String = username_example // kotlin.String | Set your bot's user name. Must be used in conjunction with `as_user` set to false, otherwise ignored. See [authorship](#authorship) below.
try {
    val result : ChatPostMessageSuccessSchema = apiInstance.chatPostMessage(token, channel, asUser, attachments, blocks, iconEmoji, iconUrl, linkNames, mrkdwn, parse, replyBroadcast, text, threadTs, unfurlLinks, unfurlMedia, username)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ChatApi#chatPostMessage")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ChatApi#chatPostMessage")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;chat:write&#x60; |
 **channel** | **kotlin.String**| Channel, private group, or IM channel to send message to. Can be an encoded ID, or a name. See [below](#channels) for more details. |
 **asUser** | **kotlin.String**| Pass true to post the message as the authed user, instead of as a bot. Defaults to false. See [authorship](#authorship) below. | [optional]
 **attachments** | **kotlin.String**| A JSON-based array of structured attachments, presented as a URL-encoded string. | [optional]
 **blocks** | **kotlin.String**| A JSON-based array of structured blocks, presented as a URL-encoded string. | [optional]
 **iconEmoji** | **kotlin.String**| Emoji to use as the icon for this message. Overrides &#x60;icon_url&#x60;. Must be used in conjunction with &#x60;as_user&#x60; set to &#x60;false&#x60;, otherwise ignored. See [authorship](#authorship) below. | [optional]
 **iconUrl** | **kotlin.String**| URL to an image to use as the icon for this message. Must be used in conjunction with &#x60;as_user&#x60; set to false, otherwise ignored. See [authorship](#authorship) below. | [optional]
 **linkNames** | **kotlin.Boolean**| Find and link channel names and usernames. | [optional]
 **mrkdwn** | **kotlin.Boolean**| Disable Slack markup parsing by setting to &#x60;false&#x60;. Enabled by default. | [optional]
 **parse** | **kotlin.String**| Change how messages are treated. Defaults to &#x60;none&#x60;. See [below](#formatting). | [optional]
 **replyBroadcast** | **kotlin.Boolean**| Used in conjunction with &#x60;thread_ts&#x60; and indicates whether reply should be made visible to everyone in the channel or conversation. Defaults to &#x60;false&#x60;. | [optional]
 **text** | **kotlin.String**| How this field works and whether it is required depends on other fields you use in your API call. [See below](#text_usage) for more detail. | [optional]
 **threadTs** | **kotlin.String**| Provide another message&#39;s &#x60;ts&#x60; value to make this message a reply. Avoid using a reply&#39;s &#x60;ts&#x60; value; use its parent instead. | [optional]
 **unfurlLinks** | **kotlin.Boolean**| Pass true to enable unfurling of primarily text-based content. | [optional]
 **unfurlMedia** | **kotlin.Boolean**| Pass false to disable unfurling of media content. | [optional]
 **username** | **kotlin.String**| Set your bot&#39;s user name. Must be used in conjunction with &#x60;as_user&#x60; set to false, otherwise ignored. See [authorship](#authorship) below. | [optional]

### Return type

[**ChatPostMessageSuccessSchema**](ChatPostMessageSuccessSchema.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="chatScheduleMessage"></a>
# **chatScheduleMessage**
> ChatScheduleMessageSuccessSchema chatScheduleMessage(token, asUser, attachments, blocks, channel, linkNames, parse, postAt, replyBroadcast, text, threadTs, unfurlLinks, unfurlMedia)



Schedules a message to be sent to a channel.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = ChatApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `chat:write`
val asUser : kotlin.Boolean = true // kotlin.Boolean | Pass true to post the message as the authed user, instead of as a bot. Defaults to false. See [chat.postMessage](chat.postMessage#authorship).
val attachments : kotlin.String = attachments_example // kotlin.String | A JSON-based array of structured attachments, presented as a URL-encoded string.
val blocks : kotlin.String = blocks_example // kotlin.String | A JSON-based array of structured blocks, presented as a URL-encoded string.
val channel : kotlin.String = channel_example // kotlin.String | Channel, private group, or DM channel to send message to. Can be an encoded ID, or a name. See [below](#channels) for more details.
val linkNames : kotlin.Boolean = true // kotlin.Boolean | Find and link channel names and usernames.
val parse : kotlin.String = parse_example // kotlin.String | Change how messages are treated. Defaults to `none`. See [chat.postMessage](chat.postMessage#formatting).
val postAt : kotlin.String = postAt_example // kotlin.String | Unix EPOCH timestamp of time in future to send the message.
val replyBroadcast : kotlin.Boolean = true // kotlin.Boolean | Used in conjunction with `thread_ts` and indicates whether reply should be made visible to everyone in the channel or conversation. Defaults to `false`.
val text : kotlin.String = text_example // kotlin.String | How this field works and whether it is required depends on other fields you use in your API call. [See below](#text_usage) for more detail.
val threadTs : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Provide another message's `ts` value to make this message a reply. Avoid using a reply's `ts` value; use its parent instead.
val unfurlLinks : kotlin.Boolean = true // kotlin.Boolean | Pass true to enable unfurling of primarily text-based content.
val unfurlMedia : kotlin.Boolean = true // kotlin.Boolean | Pass false to disable unfurling of media content.
try {
    val result : ChatScheduleMessageSuccessSchema = apiInstance.chatScheduleMessage(token, asUser, attachments, blocks, channel, linkNames, parse, postAt, replyBroadcast, text, threadTs, unfurlLinks, unfurlMedia)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ChatApi#chatScheduleMessage")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ChatApi#chatScheduleMessage")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;chat:write&#x60; | [optional]
 **asUser** | **kotlin.Boolean**| Pass true to post the message as the authed user, instead of as a bot. Defaults to false. See [chat.postMessage](chat.postMessage#authorship). | [optional]
 **attachments** | **kotlin.String**| A JSON-based array of structured attachments, presented as a URL-encoded string. | [optional]
 **blocks** | **kotlin.String**| A JSON-based array of structured blocks, presented as a URL-encoded string. | [optional]
 **channel** | **kotlin.String**| Channel, private group, or DM channel to send message to. Can be an encoded ID, or a name. See [below](#channels) for more details. | [optional]
 **linkNames** | **kotlin.Boolean**| Find and link channel names and usernames. | [optional]
 **parse** | **kotlin.String**| Change how messages are treated. Defaults to &#x60;none&#x60;. See [chat.postMessage](chat.postMessage#formatting). | [optional]
 **postAt** | **kotlin.String**| Unix EPOCH timestamp of time in future to send the message. | [optional]
 **replyBroadcast** | **kotlin.Boolean**| Used in conjunction with &#x60;thread_ts&#x60; and indicates whether reply should be made visible to everyone in the channel or conversation. Defaults to &#x60;false&#x60;. | [optional]
 **text** | **kotlin.String**| How this field works and whether it is required depends on other fields you use in your API call. [See below](#text_usage) for more detail. | [optional]
 **threadTs** | **java.math.BigDecimal**| Provide another message&#39;s &#x60;ts&#x60; value to make this message a reply. Avoid using a reply&#39;s &#x60;ts&#x60; value; use its parent instead. | [optional]
 **unfurlLinks** | **kotlin.Boolean**| Pass true to enable unfurling of primarily text-based content. | [optional]
 **unfurlMedia** | **kotlin.Boolean**| Pass false to disable unfurling of media content. | [optional]

### Return type

[**ChatScheduleMessageSuccessSchema**](ChatScheduleMessageSuccessSchema.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="chatScheduledMessagesList"></a>
# **chatScheduledMessagesList**
> ChatScheduledMessagesListSchema chatScheduledMessagesList(token, channel, latest, oldest, limit, cursor)



Returns a list of scheduled messages.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = ChatApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `none`
val channel : kotlin.String = channel_example // kotlin.String | The channel of the scheduled messages
val latest : java.math.BigDecimal = 8.14 // java.math.BigDecimal | A UNIX timestamp of the latest value in the time range
val oldest : java.math.BigDecimal = 8.14 // java.math.BigDecimal | A UNIX timestamp of the oldest value in the time range
val limit : kotlin.Int = 56 // kotlin.Int | Maximum number of original entries to return.
val cursor : kotlin.String = cursor_example // kotlin.String | For pagination purposes, this is the `cursor` value returned from a previous call to `chat.scheduledmessages.list` indicating where you want to start this call from.
try {
    val result : ChatScheduledMessagesListSchema = apiInstance.chatScheduledMessagesList(token, channel, latest, oldest, limit, cursor)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ChatApi#chatScheduledMessagesList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ChatApi#chatScheduledMessagesList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;none&#x60; | [optional]
 **channel** | **kotlin.String**| The channel of the scheduled messages | [optional]
 **latest** | **java.math.BigDecimal**| A UNIX timestamp of the latest value in the time range | [optional]
 **oldest** | **java.math.BigDecimal**| A UNIX timestamp of the oldest value in the time range | [optional]
 **limit** | **kotlin.Int**| Maximum number of original entries to return. | [optional]
 **cursor** | **kotlin.String**| For pagination purposes, this is the &#x60;cursor&#x60; value returned from a previous call to &#x60;chat.scheduledmessages.list&#x60; indicating where you want to start this call from. | [optional]

### Return type

[**ChatScheduledMessagesListSchema**](ChatScheduledMessagesListSchema.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="chatUnfurl"></a>
# **chatUnfurl**
> ChatUnfurlSuccessSchema chatUnfurl(token, channel, ts, unfurls, userAuthMessage, userAuthRequired, userAuthUrl)



Provide custom unfurl behavior for user-posted URLs

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = ChatApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `links:write`
val channel : kotlin.String = channel_example // kotlin.String | Channel ID of the message
val ts : kotlin.String = ts_example // kotlin.String | Timestamp of the message to add unfurl behavior to.
val unfurls : kotlin.String = unfurls_example // kotlin.String | URL-encoded JSON map with keys set to URLs featured in the the message, pointing to their unfurl blocks or message attachments.
val userAuthMessage : kotlin.String = userAuthMessage_example // kotlin.String | Provide a simply-formatted string to send as an ephemeral message to the user as invitation to authenticate further and enable full unfurling behavior
val userAuthRequired : kotlin.Boolean = true // kotlin.Boolean | Set to `true` or `1` to indicate the user must install your Slack app to trigger unfurls for this domain
val userAuthUrl : kotlin.String = userAuthUrl_example // kotlin.String | Send users to this custom URL where they will complete authentication in your app to fully trigger unfurling. Value should be properly URL-encoded.
try {
    val result : ChatUnfurlSuccessSchema = apiInstance.chatUnfurl(token, channel, ts, unfurls, userAuthMessage, userAuthRequired, userAuthUrl)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ChatApi#chatUnfurl")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ChatApi#chatUnfurl")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;links:write&#x60; |
 **channel** | **kotlin.String**| Channel ID of the message |
 **ts** | **kotlin.String**| Timestamp of the message to add unfurl behavior to. |
 **unfurls** | **kotlin.String**| URL-encoded JSON map with keys set to URLs featured in the the message, pointing to their unfurl blocks or message attachments. | [optional]
 **userAuthMessage** | **kotlin.String**| Provide a simply-formatted string to send as an ephemeral message to the user as invitation to authenticate further and enable full unfurling behavior | [optional]
 **userAuthRequired** | **kotlin.Boolean**| Set to &#x60;true&#x60; or &#x60;1&#x60; to indicate the user must install your Slack app to trigger unfurls for this domain | [optional]
 **userAuthUrl** | **kotlin.String**| Send users to this custom URL where they will complete authentication in your app to fully trigger unfurling. Value should be properly URL-encoded. | [optional]

### Return type

[**ChatUnfurlSuccessSchema**](ChatUnfurlSuccessSchema.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="chatUpdate"></a>
# **chatUpdate**
> ChatUpdateSuccessSchema chatUpdate(token, channel, ts, asUser, attachments, blocks, linkNames, parse, text)



Updates a message.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = ChatApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `chat:write`
val channel : kotlin.String = channel_example // kotlin.String | Channel containing the message to be updated.
val ts : kotlin.String = ts_example // kotlin.String | Timestamp of the message to be updated.
val asUser : kotlin.String = asUser_example // kotlin.String | Pass true to update the message as the authed user. [Bot users](/bot-users) in this context are considered authed users.
val attachments : kotlin.String = attachments_example // kotlin.String | A JSON-based array of structured attachments, presented as a URL-encoded string. This field is required when not presenting `text`. If you don't include this field, the message's previous `attachments` will be retained. To remove previous `attachments`, include an empty array for this field.
val blocks : kotlin.String = blocks_example // kotlin.String | A JSON-based array of [structured blocks](/block-kit/building), presented as a URL-encoded string. If you don't include this field, the message's previous `blocks` will be retained. To remove previous `blocks`, include an empty array for this field.
val linkNames : kotlin.String = linkNames_example // kotlin.String | Find and link channel names and usernames. Defaults to `none`. If you do not specify a value for this field, the original value set for the message will be overwritten with the default, `none`.
val parse : kotlin.String = parse_example // kotlin.String | Change how messages are treated. Defaults to `client`, unlike `chat.postMessage`. Accepts either `none` or `full`. If you do not specify a value for this field, the original value set for the message will be overwritten with the default, `client`.
val text : kotlin.String = text_example // kotlin.String | New text for the message, using the [default formatting rules](/reference/surfaces/formatting). It's not required when presenting `blocks` or `attachments`.
try {
    val result : ChatUpdateSuccessSchema = apiInstance.chatUpdate(token, channel, ts, asUser, attachments, blocks, linkNames, parse, text)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ChatApi#chatUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ChatApi#chatUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;chat:write&#x60; |
 **channel** | **kotlin.String**| Channel containing the message to be updated. |
 **ts** | **kotlin.String**| Timestamp of the message to be updated. |
 **asUser** | **kotlin.String**| Pass true to update the message as the authed user. [Bot users](/bot-users) in this context are considered authed users. | [optional]
 **attachments** | **kotlin.String**| A JSON-based array of structured attachments, presented as a URL-encoded string. This field is required when not presenting &#x60;text&#x60;. If you don&#39;t include this field, the message&#39;s previous &#x60;attachments&#x60; will be retained. To remove previous &#x60;attachments&#x60;, include an empty array for this field. | [optional]
 **blocks** | **kotlin.String**| A JSON-based array of [structured blocks](/block-kit/building), presented as a URL-encoded string. If you don&#39;t include this field, the message&#39;s previous &#x60;blocks&#x60; will be retained. To remove previous &#x60;blocks&#x60;, include an empty array for this field. | [optional]
 **linkNames** | **kotlin.String**| Find and link channel names and usernames. Defaults to &#x60;none&#x60;. If you do not specify a value for this field, the original value set for the message will be overwritten with the default, &#x60;none&#x60;. | [optional]
 **parse** | **kotlin.String**| Change how messages are treated. Defaults to &#x60;client&#x60;, unlike &#x60;chat.postMessage&#x60;. Accepts either &#x60;none&#x60; or &#x60;full&#x60;. If you do not specify a value for this field, the original value set for the message will be overwritten with the default, &#x60;client&#x60;. | [optional]
 **text** | **kotlin.String**| New text for the message, using the [default formatting rules](/reference/surfaces/formatting). It&#39;s not required when presenting &#x60;blocks&#x60; or &#x60;attachments&#x60;. | [optional]

### Return type

[**ChatUpdateSuccessSchema**](ChatUpdateSuccessSchema.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

