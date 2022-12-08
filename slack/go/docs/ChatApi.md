# \ChatApi

All URIs are relative to *https://slack.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ChatDelete**](ChatApi.md#ChatDelete) | **Post** /chat.delete | 
[**ChatDeleteScheduledMessage**](ChatApi.md#ChatDeleteScheduledMessage) | **Post** /chat.deleteScheduledMessage | 
[**ChatGetPermalink**](ChatApi.md#ChatGetPermalink) | **Get** /chat.getPermalink | 
[**ChatMeMessage**](ChatApi.md#ChatMeMessage) | **Post** /chat.meMessage | 
[**ChatPostEphemeral**](ChatApi.md#ChatPostEphemeral) | **Post** /chat.postEphemeral | 
[**ChatPostMessage**](ChatApi.md#ChatPostMessage) | **Post** /chat.postMessage | 
[**ChatScheduleMessage**](ChatApi.md#ChatScheduleMessage) | **Post** /chat.scheduleMessage | 
[**ChatScheduledMessagesList**](ChatApi.md#ChatScheduledMessagesList) | **Get** /chat.scheduledMessages.list | 
[**ChatUnfurl**](ChatApi.md#ChatUnfurl) | **Post** /chat.unfurl | 
[**ChatUpdate**](ChatApi.md#ChatUpdate) | **Post** /chat.update | 



## ChatDelete

> ChatDeleteSuccessSchema ChatDelete(ctx).Token(token).AsUser(asUser).Channel(channel).Ts(ts).Execute()





### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    openapiclient "./openapi"
)

func main() {
    token := "token_example" // string | Authentication token. Requires scope: `chat:write` (optional)
    asUser := true // bool | Pass true to delete the message as the authed user with `chat:write:user` scope. [Bot users](/bot-users) in this context are considered authed users. If unused or false, the message will be deleted with `chat:write:bot` scope. (optional)
    channel := "channel_example" // string | Channel containing the message to be deleted. (optional)
    ts := float32(8.14) // float32 | Timestamp of the message to be deleted. (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.ChatApi.ChatDelete(context.Background()).Token(token).AsUser(asUser).Channel(channel).Ts(ts).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `ChatApi.ChatDelete``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `ChatDelete`: ChatDeleteSuccessSchema
    fmt.Fprintf(os.Stdout, "Response from `ChatApi.ChatDelete`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiChatDeleteRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;chat:write&#x60; | 
 **asUser** | **bool** | Pass true to delete the message as the authed user with &#x60;chat:write:user&#x60; scope. [Bot users](/bot-users) in this context are considered authed users. If unused or false, the message will be deleted with &#x60;chat:write:bot&#x60; scope. | 
 **channel** | **string** | Channel containing the message to be deleted. | 
 **ts** | **float32** | Timestamp of the message to be deleted. | 

### Return type

[**ChatDeleteSuccessSchema**](ChatDeleteSuccessSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ChatDeleteScheduledMessage

> ChatDeleteScheduledMessageSchema ChatDeleteScheduledMessage(ctx).Token(token).Channel(channel).ScheduledMessageId(scheduledMessageId).AsUser(asUser).Execute()





### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    openapiclient "./openapi"
)

func main() {
    token := "token_example" // string | Authentication token. Requires scope: `chat:write`
    channel := "channel_example" // string | The channel the scheduled_message is posting to
    scheduledMessageId := "scheduledMessageId_example" // string | `scheduled_message_id` returned from call to chat.scheduleMessage
    asUser := true // bool | Pass true to delete the message as the authed user with `chat:write:user` scope. [Bot users](/bot-users) in this context are considered authed users. If unused or false, the message will be deleted with `chat:write:bot` scope. (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.ChatApi.ChatDeleteScheduledMessage(context.Background()).Token(token).Channel(channel).ScheduledMessageId(scheduledMessageId).AsUser(asUser).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `ChatApi.ChatDeleteScheduledMessage``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `ChatDeleteScheduledMessage`: ChatDeleteScheduledMessageSchema
    fmt.Fprintf(os.Stdout, "Response from `ChatApi.ChatDeleteScheduledMessage`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiChatDeleteScheduledMessageRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;chat:write&#x60; | 
 **channel** | **string** | The channel the scheduled_message is posting to | 
 **scheduledMessageId** | **string** | &#x60;scheduled_message_id&#x60; returned from call to chat.scheduleMessage | 
 **asUser** | **bool** | Pass true to delete the message as the authed user with &#x60;chat:write:user&#x60; scope. [Bot users](/bot-users) in this context are considered authed users. If unused or false, the message will be deleted with &#x60;chat:write:bot&#x60; scope. | 

### Return type

[**ChatDeleteScheduledMessageSchema**](ChatDeleteScheduledMessageSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ChatGetPermalink

> ChatGetPermalinkSuccessSchema ChatGetPermalink(ctx).Token(token).Channel(channel).MessageTs(messageTs).Execute()





### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    openapiclient "./openapi"
)

func main() {
    token := "token_example" // string | Authentication token. Requires scope: `none`
    channel := "channel_example" // string | The ID of the conversation or channel containing the message
    messageTs := "messageTs_example" // string | A message's `ts` value, uniquely identifying it within a channel

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.ChatApi.ChatGetPermalink(context.Background()).Token(token).Channel(channel).MessageTs(messageTs).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `ChatApi.ChatGetPermalink``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `ChatGetPermalink`: ChatGetPermalinkSuccessSchema
    fmt.Fprintf(os.Stdout, "Response from `ChatApi.ChatGetPermalink`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiChatGetPermalinkRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;none&#x60; | 
 **channel** | **string** | The ID of the conversation or channel containing the message | 
 **messageTs** | **string** | A message&#39;s &#x60;ts&#x60; value, uniquely identifying it within a channel | 

### Return type

[**ChatGetPermalinkSuccessSchema**](ChatGetPermalinkSuccessSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ChatMeMessage

> ChatMeMessageSchema ChatMeMessage(ctx).Token(token).Channel(channel).Text(text).Execute()





### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    openapiclient "./openapi"
)

func main() {
    token := "token_example" // string | Authentication token. Requires scope: `chat:write` (optional)
    channel := "channel_example" // string | Channel to send message to. Can be a public channel, private group or IM channel. Can be an encoded ID, or a name. (optional)
    text := "text_example" // string | Text of the message to send. (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.ChatApi.ChatMeMessage(context.Background()).Token(token).Channel(channel).Text(text).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `ChatApi.ChatMeMessage``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `ChatMeMessage`: ChatMeMessageSchema
    fmt.Fprintf(os.Stdout, "Response from `ChatApi.ChatMeMessage`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiChatMeMessageRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;chat:write&#x60; | 
 **channel** | **string** | Channel to send message to. Can be a public channel, private group or IM channel. Can be an encoded ID, or a name. | 
 **text** | **string** | Text of the message to send. | 

### Return type

[**ChatMeMessageSchema**](ChatMeMessageSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ChatPostEphemeral

> ChatPostEphemeralSuccessSchema ChatPostEphemeral(ctx).Token(token).Channel(channel).User(user).AsUser(asUser).Attachments(attachments).Blocks(blocks).IconEmoji(iconEmoji).IconUrl(iconUrl).LinkNames(linkNames).Parse(parse).Text(text).ThreadTs(threadTs).Username(username).Execute()





### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    openapiclient "./openapi"
)

func main() {
    token := "token_example" // string | Authentication token. Requires scope: `chat:write`
    channel := "channel_example" // string | Channel, private group, or IM channel to send message to. Can be an encoded ID, or a name.
    user := "user_example" // string | `id` of the user who will receive the ephemeral message. The user should be in the channel specified by the `channel` argument.
    asUser := true // bool | Pass true to post the message as the authed user. Defaults to true if the chat:write:bot scope is not included. Otherwise, defaults to false. (optional)
    attachments := "attachments_example" // string | A JSON-based array of structured attachments, presented as a URL-encoded string. (optional)
    blocks := "blocks_example" // string | A JSON-based array of structured blocks, presented as a URL-encoded string. (optional)
    iconEmoji := "iconEmoji_example" // string | Emoji to use as the icon for this message. Overrides `icon_url`. Must be used in conjunction with `as_user` set to `false`, otherwise ignored. See [authorship](#authorship) below. (optional)
    iconUrl := "iconUrl_example" // string | URL to an image to use as the icon for this message. Must be used in conjunction with `as_user` set to false, otherwise ignored. See [authorship](#authorship) below. (optional)
    linkNames := true // bool | Find and link channel names and usernames. (optional)
    parse := "parse_example" // string | Change how messages are treated. Defaults to `none`. See [below](#formatting). (optional)
    text := "text_example" // string | How this field works and whether it is required depends on other fields you use in your API call. [See below](#text_usage) for more detail. (optional)
    threadTs := "threadTs_example" // string | Provide another message's `ts` value to post this message in a thread. Avoid using a reply's `ts` value; use its parent's value instead. Ephemeral messages in threads are only shown if there is already an active thread. (optional)
    username := "username_example" // string | Set your bot's user name. Must be used in conjunction with `as_user` set to false, otherwise ignored. See [authorship](#authorship) below. (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.ChatApi.ChatPostEphemeral(context.Background()).Token(token).Channel(channel).User(user).AsUser(asUser).Attachments(attachments).Blocks(blocks).IconEmoji(iconEmoji).IconUrl(iconUrl).LinkNames(linkNames).Parse(parse).Text(text).ThreadTs(threadTs).Username(username).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `ChatApi.ChatPostEphemeral``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `ChatPostEphemeral`: ChatPostEphemeralSuccessSchema
    fmt.Fprintf(os.Stdout, "Response from `ChatApi.ChatPostEphemeral`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiChatPostEphemeralRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;chat:write&#x60; | 
 **channel** | **string** | Channel, private group, or IM channel to send message to. Can be an encoded ID, or a name. | 
 **user** | **string** | &#x60;id&#x60; of the user who will receive the ephemeral message. The user should be in the channel specified by the &#x60;channel&#x60; argument. | 
 **asUser** | **bool** | Pass true to post the message as the authed user. Defaults to true if the chat:write:bot scope is not included. Otherwise, defaults to false. | 
 **attachments** | **string** | A JSON-based array of structured attachments, presented as a URL-encoded string. | 
 **blocks** | **string** | A JSON-based array of structured blocks, presented as a URL-encoded string. | 
 **iconEmoji** | **string** | Emoji to use as the icon for this message. Overrides &#x60;icon_url&#x60;. Must be used in conjunction with &#x60;as_user&#x60; set to &#x60;false&#x60;, otherwise ignored. See [authorship](#authorship) below. | 
 **iconUrl** | **string** | URL to an image to use as the icon for this message. Must be used in conjunction with &#x60;as_user&#x60; set to false, otherwise ignored. See [authorship](#authorship) below. | 
 **linkNames** | **bool** | Find and link channel names and usernames. | 
 **parse** | **string** | Change how messages are treated. Defaults to &#x60;none&#x60;. See [below](#formatting). | 
 **text** | **string** | How this field works and whether it is required depends on other fields you use in your API call. [See below](#text_usage) for more detail. | 
 **threadTs** | **string** | Provide another message&#39;s &#x60;ts&#x60; value to post this message in a thread. Avoid using a reply&#39;s &#x60;ts&#x60; value; use its parent&#39;s value instead. Ephemeral messages in threads are only shown if there is already an active thread. | 
 **username** | **string** | Set your bot&#39;s user name. Must be used in conjunction with &#x60;as_user&#x60; set to false, otherwise ignored. See [authorship](#authorship) below. | 

### Return type

[**ChatPostEphemeralSuccessSchema**](ChatPostEphemeralSuccessSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ChatPostMessage

> ChatPostMessageSuccessSchema ChatPostMessage(ctx).Token(token).Channel(channel).AsUser(asUser).Attachments(attachments).Blocks(blocks).IconEmoji(iconEmoji).IconUrl(iconUrl).LinkNames(linkNames).Mrkdwn(mrkdwn).Parse(parse).ReplyBroadcast(replyBroadcast).Text(text).ThreadTs(threadTs).UnfurlLinks(unfurlLinks).UnfurlMedia(unfurlMedia).Username(username).Execute()





### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    openapiclient "./openapi"
)

func main() {
    token := "token_example" // string | Authentication token. Requires scope: `chat:write`
    channel := "channel_example" // string | Channel, private group, or IM channel to send message to. Can be an encoded ID, or a name. See [below](#channels) for more details.
    asUser := "asUser_example" // string | Pass true to post the message as the authed user, instead of as a bot. Defaults to false. See [authorship](#authorship) below. (optional)
    attachments := "attachments_example" // string | A JSON-based array of structured attachments, presented as a URL-encoded string. (optional)
    blocks := "blocks_example" // string | A JSON-based array of structured blocks, presented as a URL-encoded string. (optional)
    iconEmoji := "iconEmoji_example" // string | Emoji to use as the icon for this message. Overrides `icon_url`. Must be used in conjunction with `as_user` set to `false`, otherwise ignored. See [authorship](#authorship) below. (optional)
    iconUrl := "iconUrl_example" // string | URL to an image to use as the icon for this message. Must be used in conjunction with `as_user` set to false, otherwise ignored. See [authorship](#authorship) below. (optional)
    linkNames := true // bool | Find and link channel names and usernames. (optional)
    mrkdwn := true // bool | Disable Slack markup parsing by setting to `false`. Enabled by default. (optional)
    parse := "parse_example" // string | Change how messages are treated. Defaults to `none`. See [below](#formatting). (optional)
    replyBroadcast := true // bool | Used in conjunction with `thread_ts` and indicates whether reply should be made visible to everyone in the channel or conversation. Defaults to `false`. (optional)
    text := "text_example" // string | How this field works and whether it is required depends on other fields you use in your API call. [See below](#text_usage) for more detail. (optional)
    threadTs := "threadTs_example" // string | Provide another message's `ts` value to make this message a reply. Avoid using a reply's `ts` value; use its parent instead. (optional)
    unfurlLinks := true // bool | Pass true to enable unfurling of primarily text-based content. (optional)
    unfurlMedia := true // bool | Pass false to disable unfurling of media content. (optional)
    username := "username_example" // string | Set your bot's user name. Must be used in conjunction with `as_user` set to false, otherwise ignored. See [authorship](#authorship) below. (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.ChatApi.ChatPostMessage(context.Background()).Token(token).Channel(channel).AsUser(asUser).Attachments(attachments).Blocks(blocks).IconEmoji(iconEmoji).IconUrl(iconUrl).LinkNames(linkNames).Mrkdwn(mrkdwn).Parse(parse).ReplyBroadcast(replyBroadcast).Text(text).ThreadTs(threadTs).UnfurlLinks(unfurlLinks).UnfurlMedia(unfurlMedia).Username(username).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `ChatApi.ChatPostMessage``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `ChatPostMessage`: ChatPostMessageSuccessSchema
    fmt.Fprintf(os.Stdout, "Response from `ChatApi.ChatPostMessage`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiChatPostMessageRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;chat:write&#x60; | 
 **channel** | **string** | Channel, private group, or IM channel to send message to. Can be an encoded ID, or a name. See [below](#channels) for more details. | 
 **asUser** | **string** | Pass true to post the message as the authed user, instead of as a bot. Defaults to false. See [authorship](#authorship) below. | 
 **attachments** | **string** | A JSON-based array of structured attachments, presented as a URL-encoded string. | 
 **blocks** | **string** | A JSON-based array of structured blocks, presented as a URL-encoded string. | 
 **iconEmoji** | **string** | Emoji to use as the icon for this message. Overrides &#x60;icon_url&#x60;. Must be used in conjunction with &#x60;as_user&#x60; set to &#x60;false&#x60;, otherwise ignored. See [authorship](#authorship) below. | 
 **iconUrl** | **string** | URL to an image to use as the icon for this message. Must be used in conjunction with &#x60;as_user&#x60; set to false, otherwise ignored. See [authorship](#authorship) below. | 
 **linkNames** | **bool** | Find and link channel names and usernames. | 
 **mrkdwn** | **bool** | Disable Slack markup parsing by setting to &#x60;false&#x60;. Enabled by default. | 
 **parse** | **string** | Change how messages are treated. Defaults to &#x60;none&#x60;. See [below](#formatting). | 
 **replyBroadcast** | **bool** | Used in conjunction with &#x60;thread_ts&#x60; and indicates whether reply should be made visible to everyone in the channel or conversation. Defaults to &#x60;false&#x60;. | 
 **text** | **string** | How this field works and whether it is required depends on other fields you use in your API call. [See below](#text_usage) for more detail. | 
 **threadTs** | **string** | Provide another message&#39;s &#x60;ts&#x60; value to make this message a reply. Avoid using a reply&#39;s &#x60;ts&#x60; value; use its parent instead. | 
 **unfurlLinks** | **bool** | Pass true to enable unfurling of primarily text-based content. | 
 **unfurlMedia** | **bool** | Pass false to disable unfurling of media content. | 
 **username** | **string** | Set your bot&#39;s user name. Must be used in conjunction with &#x60;as_user&#x60; set to false, otherwise ignored. See [authorship](#authorship) below. | 

### Return type

[**ChatPostMessageSuccessSchema**](ChatPostMessageSuccessSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ChatScheduleMessage

> ChatScheduleMessageSuccessSchema ChatScheduleMessage(ctx).Token(token).AsUser(asUser).Attachments(attachments).Blocks(blocks).Channel(channel).LinkNames(linkNames).Parse(parse).PostAt(postAt).ReplyBroadcast(replyBroadcast).Text(text).ThreadTs(threadTs).UnfurlLinks(unfurlLinks).UnfurlMedia(unfurlMedia).Execute()





### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    openapiclient "./openapi"
)

func main() {
    token := "token_example" // string | Authentication token. Requires scope: `chat:write` (optional)
    asUser := true // bool | Pass true to post the message as the authed user, instead of as a bot. Defaults to false. See [chat.postMessage](chat.postMessage#authorship). (optional)
    attachments := "attachments_example" // string | A JSON-based array of structured attachments, presented as a URL-encoded string. (optional)
    blocks := "blocks_example" // string | A JSON-based array of structured blocks, presented as a URL-encoded string. (optional)
    channel := "channel_example" // string | Channel, private group, or DM channel to send message to. Can be an encoded ID, or a name. See [below](#channels) for more details. (optional)
    linkNames := true // bool | Find and link channel names and usernames. (optional)
    parse := "parse_example" // string | Change how messages are treated. Defaults to `none`. See [chat.postMessage](chat.postMessage#formatting). (optional)
    postAt := "postAt_example" // string | Unix EPOCH timestamp of time in future to send the message. (optional)
    replyBroadcast := true // bool | Used in conjunction with `thread_ts` and indicates whether reply should be made visible to everyone in the channel or conversation. Defaults to `false`. (optional)
    text := "text_example" // string | How this field works and whether it is required depends on other fields you use in your API call. [See below](#text_usage) for more detail. (optional)
    threadTs := float32(8.14) // float32 | Provide another message's `ts` value to make this message a reply. Avoid using a reply's `ts` value; use its parent instead. (optional)
    unfurlLinks := true // bool | Pass true to enable unfurling of primarily text-based content. (optional)
    unfurlMedia := true // bool | Pass false to disable unfurling of media content. (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.ChatApi.ChatScheduleMessage(context.Background()).Token(token).AsUser(asUser).Attachments(attachments).Blocks(blocks).Channel(channel).LinkNames(linkNames).Parse(parse).PostAt(postAt).ReplyBroadcast(replyBroadcast).Text(text).ThreadTs(threadTs).UnfurlLinks(unfurlLinks).UnfurlMedia(unfurlMedia).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `ChatApi.ChatScheduleMessage``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `ChatScheduleMessage`: ChatScheduleMessageSuccessSchema
    fmt.Fprintf(os.Stdout, "Response from `ChatApi.ChatScheduleMessage`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiChatScheduleMessageRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;chat:write&#x60; | 
 **asUser** | **bool** | Pass true to post the message as the authed user, instead of as a bot. Defaults to false. See [chat.postMessage](chat.postMessage#authorship). | 
 **attachments** | **string** | A JSON-based array of structured attachments, presented as a URL-encoded string. | 
 **blocks** | **string** | A JSON-based array of structured blocks, presented as a URL-encoded string. | 
 **channel** | **string** | Channel, private group, or DM channel to send message to. Can be an encoded ID, or a name. See [below](#channels) for more details. | 
 **linkNames** | **bool** | Find and link channel names and usernames. | 
 **parse** | **string** | Change how messages are treated. Defaults to &#x60;none&#x60;. See [chat.postMessage](chat.postMessage#formatting). | 
 **postAt** | **string** | Unix EPOCH timestamp of time in future to send the message. | 
 **replyBroadcast** | **bool** | Used in conjunction with &#x60;thread_ts&#x60; and indicates whether reply should be made visible to everyone in the channel or conversation. Defaults to &#x60;false&#x60;. | 
 **text** | **string** | How this field works and whether it is required depends on other fields you use in your API call. [See below](#text_usage) for more detail. | 
 **threadTs** | **float32** | Provide another message&#39;s &#x60;ts&#x60; value to make this message a reply. Avoid using a reply&#39;s &#x60;ts&#x60; value; use its parent instead. | 
 **unfurlLinks** | **bool** | Pass true to enable unfurling of primarily text-based content. | 
 **unfurlMedia** | **bool** | Pass false to disable unfurling of media content. | 

### Return type

[**ChatScheduleMessageSuccessSchema**](ChatScheduleMessageSuccessSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ChatScheduledMessagesList

> ChatScheduledMessagesListSchema ChatScheduledMessagesList(ctx).Token(token).Channel(channel).Latest(latest).Oldest(oldest).Limit(limit).Cursor(cursor).Execute()





### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    openapiclient "./openapi"
)

func main() {
    token := "token_example" // string | Authentication token. Requires scope: `none` (optional)
    channel := "channel_example" // string | The channel of the scheduled messages (optional)
    latest := float32(8.14) // float32 | A UNIX timestamp of the latest value in the time range (optional)
    oldest := float32(8.14) // float32 | A UNIX timestamp of the oldest value in the time range (optional)
    limit := int32(56) // int32 | Maximum number of original entries to return. (optional)
    cursor := "cursor_example" // string | For pagination purposes, this is the `cursor` value returned from a previous call to `chat.scheduledmessages.list` indicating where you want to start this call from. (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.ChatApi.ChatScheduledMessagesList(context.Background()).Token(token).Channel(channel).Latest(latest).Oldest(oldest).Limit(limit).Cursor(cursor).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `ChatApi.ChatScheduledMessagesList``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `ChatScheduledMessagesList`: ChatScheduledMessagesListSchema
    fmt.Fprintf(os.Stdout, "Response from `ChatApi.ChatScheduledMessagesList`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiChatScheduledMessagesListRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;none&#x60; | 
 **channel** | **string** | The channel of the scheduled messages | 
 **latest** | **float32** | A UNIX timestamp of the latest value in the time range | 
 **oldest** | **float32** | A UNIX timestamp of the oldest value in the time range | 
 **limit** | **int32** | Maximum number of original entries to return. | 
 **cursor** | **string** | For pagination purposes, this is the &#x60;cursor&#x60; value returned from a previous call to &#x60;chat.scheduledmessages.list&#x60; indicating where you want to start this call from. | 

### Return type

[**ChatScheduledMessagesListSchema**](ChatScheduledMessagesListSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ChatUnfurl

> ChatUnfurlSuccessSchema ChatUnfurl(ctx).Token(token).Channel(channel).Ts(ts).Unfurls(unfurls).UserAuthMessage(userAuthMessage).UserAuthRequired(userAuthRequired).UserAuthUrl(userAuthUrl).Execute()





### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    openapiclient "./openapi"
)

func main() {
    token := "token_example" // string | Authentication token. Requires scope: `links:write`
    channel := "channel_example" // string | Channel ID of the message
    ts := "ts_example" // string | Timestamp of the message to add unfurl behavior to.
    unfurls := "unfurls_example" // string | URL-encoded JSON map with keys set to URLs featured in the the message, pointing to their unfurl blocks or message attachments. (optional)
    userAuthMessage := "userAuthMessage_example" // string | Provide a simply-formatted string to send as an ephemeral message to the user as invitation to authenticate further and enable full unfurling behavior (optional)
    userAuthRequired := true // bool | Set to `true` or `1` to indicate the user must install your Slack app to trigger unfurls for this domain (optional)
    userAuthUrl := "userAuthUrl_example" // string | Send users to this custom URL where they will complete authentication in your app to fully trigger unfurling. Value should be properly URL-encoded. (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.ChatApi.ChatUnfurl(context.Background()).Token(token).Channel(channel).Ts(ts).Unfurls(unfurls).UserAuthMessage(userAuthMessage).UserAuthRequired(userAuthRequired).UserAuthUrl(userAuthUrl).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `ChatApi.ChatUnfurl``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `ChatUnfurl`: ChatUnfurlSuccessSchema
    fmt.Fprintf(os.Stdout, "Response from `ChatApi.ChatUnfurl`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiChatUnfurlRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;links:write&#x60; | 
 **channel** | **string** | Channel ID of the message | 
 **ts** | **string** | Timestamp of the message to add unfurl behavior to. | 
 **unfurls** | **string** | URL-encoded JSON map with keys set to URLs featured in the the message, pointing to their unfurl blocks or message attachments. | 
 **userAuthMessage** | **string** | Provide a simply-formatted string to send as an ephemeral message to the user as invitation to authenticate further and enable full unfurling behavior | 
 **userAuthRequired** | **bool** | Set to &#x60;true&#x60; or &#x60;1&#x60; to indicate the user must install your Slack app to trigger unfurls for this domain | 
 **userAuthUrl** | **string** | Send users to this custom URL where they will complete authentication in your app to fully trigger unfurling. Value should be properly URL-encoded. | 

### Return type

[**ChatUnfurlSuccessSchema**](ChatUnfurlSuccessSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ChatUpdate

> ChatUpdateSuccessSchema ChatUpdate(ctx).Token(token).Channel(channel).Ts(ts).AsUser(asUser).Attachments(attachments).Blocks(blocks).LinkNames(linkNames).Parse(parse).Text(text).Execute()





### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    openapiclient "./openapi"
)

func main() {
    token := "token_example" // string | Authentication token. Requires scope: `chat:write`
    channel := "channel_example" // string | Channel containing the message to be updated.
    ts := "ts_example" // string | Timestamp of the message to be updated.
    asUser := "asUser_example" // string | Pass true to update the message as the authed user. [Bot users](/bot-users) in this context are considered authed users. (optional)
    attachments := "attachments_example" // string | A JSON-based array of structured attachments, presented as a URL-encoded string. This field is required when not presenting `text`. If you don't include this field, the message's previous `attachments` will be retained. To remove previous `attachments`, include an empty array for this field. (optional)
    blocks := "blocks_example" // string | A JSON-based array of [structured blocks](/block-kit/building), presented as a URL-encoded string. If you don't include this field, the message's previous `blocks` will be retained. To remove previous `blocks`, include an empty array for this field. (optional)
    linkNames := "linkNames_example" // string | Find and link channel names and usernames. Defaults to `none`. If you do not specify a value for this field, the original value set for the message will be overwritten with the default, `none`. (optional)
    parse := "parse_example" // string | Change how messages are treated. Defaults to `client`, unlike `chat.postMessage`. Accepts either `none` or `full`. If you do not specify a value for this field, the original value set for the message will be overwritten with the default, `client`. (optional)
    text := "text_example" // string | New text for the message, using the [default formatting rules](/reference/surfaces/formatting). It's not required when presenting `blocks` or `attachments`. (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.ChatApi.ChatUpdate(context.Background()).Token(token).Channel(channel).Ts(ts).AsUser(asUser).Attachments(attachments).Blocks(blocks).LinkNames(linkNames).Parse(parse).Text(text).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `ChatApi.ChatUpdate``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `ChatUpdate`: ChatUpdateSuccessSchema
    fmt.Fprintf(os.Stdout, "Response from `ChatApi.ChatUpdate`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiChatUpdateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;chat:write&#x60; | 
 **channel** | **string** | Channel containing the message to be updated. | 
 **ts** | **string** | Timestamp of the message to be updated. | 
 **asUser** | **string** | Pass true to update the message as the authed user. [Bot users](/bot-users) in this context are considered authed users. | 
 **attachments** | **string** | A JSON-based array of structured attachments, presented as a URL-encoded string. This field is required when not presenting &#x60;text&#x60;. If you don&#39;t include this field, the message&#39;s previous &#x60;attachments&#x60; will be retained. To remove previous &#x60;attachments&#x60;, include an empty array for this field. | 
 **blocks** | **string** | A JSON-based array of [structured blocks](/block-kit/building), presented as a URL-encoded string. If you don&#39;t include this field, the message&#39;s previous &#x60;blocks&#x60; will be retained. To remove previous &#x60;blocks&#x60;, include an empty array for this field. | 
 **linkNames** | **string** | Find and link channel names and usernames. Defaults to &#x60;none&#x60;. If you do not specify a value for this field, the original value set for the message will be overwritten with the default, &#x60;none&#x60;. | 
 **parse** | **string** | Change how messages are treated. Defaults to &#x60;client&#x60;, unlike &#x60;chat.postMessage&#x60;. Accepts either &#x60;none&#x60; or &#x60;full&#x60;. If you do not specify a value for this field, the original value set for the message will be overwritten with the default, &#x60;client&#x60;. | 
 **text** | **string** | New text for the message, using the [default formatting rules](/reference/surfaces/formatting). It&#39;s not required when presenting &#x60;blocks&#x60; or &#x60;attachments&#x60;. | 

### Return type

[**ChatUpdateSuccessSchema**](ChatUpdateSuccessSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

