# slack::ChatApi

All URIs are relative to *https://slack.com/api*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**chat_delete**](ChatApi.md#chat_delete) | **POST** /chat.delete |  |
| [**chat_delete_scheduled_message**](ChatApi.md#chat_delete_scheduled_message) | **POST** /chat.deleteScheduledMessage |  |
| [**chat_get_permalink**](ChatApi.md#chat_get_permalink) | **GET** /chat.getPermalink |  |
| [**chat_me_message**](ChatApi.md#chat_me_message) | **POST** /chat.meMessage |  |
| [**chat_post_ephemeral**](ChatApi.md#chat_post_ephemeral) | **POST** /chat.postEphemeral |  |
| [**chat_post_message**](ChatApi.md#chat_post_message) | **POST** /chat.postMessage |  |
| [**chat_schedule_message**](ChatApi.md#chat_schedule_message) | **POST** /chat.scheduleMessage |  |
| [**chat_scheduled_messages_list**](ChatApi.md#chat_scheduled_messages_list) | **GET** /chat.scheduledMessages.list |  |
| [**chat_unfurl**](ChatApi.md#chat_unfurl) | **POST** /chat.unfurl |  |
| [**chat_update**](ChatApi.md#chat_update) | **POST** /chat.update |  |


## chat_delete

> <ChatDeleteSuccessSchema> chat_delete(opts)



Deletes a message.

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::ChatApi.new
opts = {
  token: 'token_example', # String | Authentication token. Requires scope: `chat:write`
  as_user: true, # Boolean | Pass true to delete the message as the authed user with `chat:write:user` scope. [Bot users](/bot-users) in this context are considered authed users. If unused or false, the message will be deleted with `chat:write:bot` scope.
  channel: 'channel_example', # String | Channel containing the message to be deleted.
  ts: 8.14 # Float | Timestamp of the message to be deleted.
}

begin
  
  result = api_instance.chat_delete(opts)
  p result
rescue slack::ApiError => e
  puts "Error when calling ChatApi->chat_delete: #{e}"
end
```

#### Using the chat_delete_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<ChatDeleteSuccessSchema>, Integer, Hash)> chat_delete_with_http_info(opts)

```ruby
begin
  
  data, status_code, headers = api_instance.chat_delete_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <ChatDeleteSuccessSchema>
rescue slack::ApiError => e
  puts "Error when calling ChatApi->chat_delete_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;chat:write&#x60; | [optional] |
| **as_user** | **Boolean** | Pass true to delete the message as the authed user with &#x60;chat:write:user&#x60; scope. [Bot users](/bot-users) in this context are considered authed users. If unused or false, the message will be deleted with &#x60;chat:write:bot&#x60; scope. | [optional] |
| **channel** | **String** | Channel containing the message to be deleted. | [optional] |
| **ts** | **Float** | Timestamp of the message to be deleted. | [optional] |

### Return type

[**ChatDeleteSuccessSchema**](ChatDeleteSuccessSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json


## chat_delete_scheduled_message

> <ChatDeleteScheduledMessageSchema> chat_delete_scheduled_message(token, channel, scheduled_message_id, opts)



Deletes a pending scheduled message from the queue.

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::ChatApi.new
token = 'token_example' # String | Authentication token. Requires scope: `chat:write`
channel = 'channel_example' # String | The channel the scheduled_message is posting to
scheduled_message_id = 'scheduled_message_id_example' # String | `scheduled_message_id` returned from call to chat.scheduleMessage
opts = {
  as_user: true # Boolean | Pass true to delete the message as the authed user with `chat:write:user` scope. [Bot users](/bot-users) in this context are considered authed users. If unused or false, the message will be deleted with `chat:write:bot` scope.
}

begin
  
  result = api_instance.chat_delete_scheduled_message(token, channel, scheduled_message_id, opts)
  p result
rescue slack::ApiError => e
  puts "Error when calling ChatApi->chat_delete_scheduled_message: #{e}"
end
```

#### Using the chat_delete_scheduled_message_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<ChatDeleteScheduledMessageSchema>, Integer, Hash)> chat_delete_scheduled_message_with_http_info(token, channel, scheduled_message_id, opts)

```ruby
begin
  
  data, status_code, headers = api_instance.chat_delete_scheduled_message_with_http_info(token, channel, scheduled_message_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <ChatDeleteScheduledMessageSchema>
rescue slack::ApiError => e
  puts "Error when calling ChatApi->chat_delete_scheduled_message_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;chat:write&#x60; |  |
| **channel** | **String** | The channel the scheduled_message is posting to |  |
| **scheduled_message_id** | **String** | &#x60;scheduled_message_id&#x60; returned from call to chat.scheduleMessage |  |
| **as_user** | **Boolean** | Pass true to delete the message as the authed user with &#x60;chat:write:user&#x60; scope. [Bot users](/bot-users) in this context are considered authed users. If unused or false, the message will be deleted with &#x60;chat:write:bot&#x60; scope. | [optional] |

### Return type

[**ChatDeleteScheduledMessageSchema**](ChatDeleteScheduledMessageSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json


## chat_get_permalink

> <ChatGetPermalinkSuccessSchema> chat_get_permalink(token, channel, message_ts)



Retrieve a permalink URL for a specific extant message

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::ChatApi.new
token = 'token_example' # String | Authentication token. Requires scope: `none`
channel = 'channel_example' # String | The ID of the conversation or channel containing the message
message_ts = 'message_ts_example' # String | A message's `ts` value, uniquely identifying it within a channel

begin
  
  result = api_instance.chat_get_permalink(token, channel, message_ts)
  p result
rescue slack::ApiError => e
  puts "Error when calling ChatApi->chat_get_permalink: #{e}"
end
```

#### Using the chat_get_permalink_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<ChatGetPermalinkSuccessSchema>, Integer, Hash)> chat_get_permalink_with_http_info(token, channel, message_ts)

```ruby
begin
  
  data, status_code, headers = api_instance.chat_get_permalink_with_http_info(token, channel, message_ts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <ChatGetPermalinkSuccessSchema>
rescue slack::ApiError => e
  puts "Error when calling ChatApi->chat_get_permalink_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;none&#x60; |  |
| **channel** | **String** | The ID of the conversation or channel containing the message |  |
| **message_ts** | **String** | A message&#39;s &#x60;ts&#x60; value, uniquely identifying it within a channel |  |

### Return type

[**ChatGetPermalinkSuccessSchema**](ChatGetPermalinkSuccessSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## chat_me_message

> <ChatMeMessageSchema> chat_me_message(opts)



Share a me message into a channel.

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::ChatApi.new
opts = {
  token: 'token_example', # String | Authentication token. Requires scope: `chat:write`
  channel: 'channel_example', # String | Channel to send message to. Can be a public channel, private group or IM channel. Can be an encoded ID, or a name.
  text: 'text_example' # String | Text of the message to send.
}

begin
  
  result = api_instance.chat_me_message(opts)
  p result
rescue slack::ApiError => e
  puts "Error when calling ChatApi->chat_me_message: #{e}"
end
```

#### Using the chat_me_message_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<ChatMeMessageSchema>, Integer, Hash)> chat_me_message_with_http_info(opts)

```ruby
begin
  
  data, status_code, headers = api_instance.chat_me_message_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <ChatMeMessageSchema>
rescue slack::ApiError => e
  puts "Error when calling ChatApi->chat_me_message_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;chat:write&#x60; | [optional] |
| **channel** | **String** | Channel to send message to. Can be a public channel, private group or IM channel. Can be an encoded ID, or a name. | [optional] |
| **text** | **String** | Text of the message to send. | [optional] |

### Return type

[**ChatMeMessageSchema**](ChatMeMessageSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json


## chat_post_ephemeral

> <ChatPostEphemeralSuccessSchema> chat_post_ephemeral(token, channel, user, opts)



Sends an ephemeral message to a user in a channel.

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::ChatApi.new
token = 'token_example' # String | Authentication token. Requires scope: `chat:write`
channel = 'channel_example' # String | Channel, private group, or IM channel to send message to. Can be an encoded ID, or a name.
user = 'user_example' # String | `id` of the user who will receive the ephemeral message. The user should be in the channel specified by the `channel` argument.
opts = {
  as_user: true, # Boolean | Pass true to post the message as the authed user. Defaults to true if the chat:write:bot scope is not included. Otherwise, defaults to false.
  attachments: 'attachments_example', # String | A JSON-based array of structured attachments, presented as a URL-encoded string.
  blocks: 'blocks_example', # String | A JSON-based array of structured blocks, presented as a URL-encoded string.
  icon_emoji: 'icon_emoji_example', # String | Emoji to use as the icon for this message. Overrides `icon_url`. Must be used in conjunction with `as_user` set to `false`, otherwise ignored. See [authorship](#authorship) below.
  icon_url: 'icon_url_example', # String | URL to an image to use as the icon for this message. Must be used in conjunction with `as_user` set to false, otherwise ignored. See [authorship](#authorship) below.
  link_names: true, # Boolean | Find and link channel names and usernames.
  parse: 'parse_example', # String | Change how messages are treated. Defaults to `none`. See [below](#formatting).
  text: 'text_example', # String | How this field works and whether it is required depends on other fields you use in your API call. [See below](#text_usage) for more detail.
  thread_ts: 'thread_ts_example', # String | Provide another message's `ts` value to post this message in a thread. Avoid using a reply's `ts` value; use its parent's value instead. Ephemeral messages in threads are only shown if there is already an active thread.
  username: 'username_example' # String | Set your bot's user name. Must be used in conjunction with `as_user` set to false, otherwise ignored. See [authorship](#authorship) below.
}

begin
  
  result = api_instance.chat_post_ephemeral(token, channel, user, opts)
  p result
rescue slack::ApiError => e
  puts "Error when calling ChatApi->chat_post_ephemeral: #{e}"
end
```

#### Using the chat_post_ephemeral_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<ChatPostEphemeralSuccessSchema>, Integer, Hash)> chat_post_ephemeral_with_http_info(token, channel, user, opts)

```ruby
begin
  
  data, status_code, headers = api_instance.chat_post_ephemeral_with_http_info(token, channel, user, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <ChatPostEphemeralSuccessSchema>
rescue slack::ApiError => e
  puts "Error when calling ChatApi->chat_post_ephemeral_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;chat:write&#x60; |  |
| **channel** | **String** | Channel, private group, or IM channel to send message to. Can be an encoded ID, or a name. |  |
| **user** | **String** | &#x60;id&#x60; of the user who will receive the ephemeral message. The user should be in the channel specified by the &#x60;channel&#x60; argument. |  |
| **as_user** | **Boolean** | Pass true to post the message as the authed user. Defaults to true if the chat:write:bot scope is not included. Otherwise, defaults to false. | [optional] |
| **attachments** | **String** | A JSON-based array of structured attachments, presented as a URL-encoded string. | [optional] |
| **blocks** | **String** | A JSON-based array of structured blocks, presented as a URL-encoded string. | [optional] |
| **icon_emoji** | **String** | Emoji to use as the icon for this message. Overrides &#x60;icon_url&#x60;. Must be used in conjunction with &#x60;as_user&#x60; set to &#x60;false&#x60;, otherwise ignored. See [authorship](#authorship) below. | [optional] |
| **icon_url** | **String** | URL to an image to use as the icon for this message. Must be used in conjunction with &#x60;as_user&#x60; set to false, otherwise ignored. See [authorship](#authorship) below. | [optional] |
| **link_names** | **Boolean** | Find and link channel names and usernames. | [optional] |
| **parse** | **String** | Change how messages are treated. Defaults to &#x60;none&#x60;. See [below](#formatting). | [optional] |
| **text** | **String** | How this field works and whether it is required depends on other fields you use in your API call. [See below](#text_usage) for more detail. | [optional] |
| **thread_ts** | **String** | Provide another message&#39;s &#x60;ts&#x60; value to post this message in a thread. Avoid using a reply&#39;s &#x60;ts&#x60; value; use its parent&#39;s value instead. Ephemeral messages in threads are only shown if there is already an active thread. | [optional] |
| **username** | **String** | Set your bot&#39;s user name. Must be used in conjunction with &#x60;as_user&#x60; set to false, otherwise ignored. See [authorship](#authorship) below. | [optional] |

### Return type

[**ChatPostEphemeralSuccessSchema**](ChatPostEphemeralSuccessSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json


## chat_post_message

> <ChatPostMessageSuccessSchema> chat_post_message(token, channel, opts)



Sends a message to a channel.

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::ChatApi.new
token = 'token_example' # String | Authentication token. Requires scope: `chat:write`
channel = 'channel_example' # String | Channel, private group, or IM channel to send message to. Can be an encoded ID, or a name. See [below](#channels) for more details.
opts = {
  as_user: 'as_user_example', # String | Pass true to post the message as the authed user, instead of as a bot. Defaults to false. See [authorship](#authorship) below.
  attachments: 'attachments_example', # String | A JSON-based array of structured attachments, presented as a URL-encoded string.
  blocks: 'blocks_example', # String | A JSON-based array of structured blocks, presented as a URL-encoded string.
  icon_emoji: 'icon_emoji_example', # String | Emoji to use as the icon for this message. Overrides `icon_url`. Must be used in conjunction with `as_user` set to `false`, otherwise ignored. See [authorship](#authorship) below.
  icon_url: 'icon_url_example', # String | URL to an image to use as the icon for this message. Must be used in conjunction with `as_user` set to false, otherwise ignored. See [authorship](#authorship) below.
  link_names: true, # Boolean | Find and link channel names and usernames.
  mrkdwn: true, # Boolean | Disable Slack markup parsing by setting to `false`. Enabled by default.
  parse: 'parse_example', # String | Change how messages are treated. Defaults to `none`. See [below](#formatting).
  reply_broadcast: true, # Boolean | Used in conjunction with `thread_ts` and indicates whether reply should be made visible to everyone in the channel or conversation. Defaults to `false`.
  text: 'text_example', # String | How this field works and whether it is required depends on other fields you use in your API call. [See below](#text_usage) for more detail.
  thread_ts: 'thread_ts_example', # String | Provide another message's `ts` value to make this message a reply. Avoid using a reply's `ts` value; use its parent instead.
  unfurl_links: true, # Boolean | Pass true to enable unfurling of primarily text-based content.
  unfurl_media: true, # Boolean | Pass false to disable unfurling of media content.
  username: 'username_example' # String | Set your bot's user name. Must be used in conjunction with `as_user` set to false, otherwise ignored. See [authorship](#authorship) below.
}

begin
  
  result = api_instance.chat_post_message(token, channel, opts)
  p result
rescue slack::ApiError => e
  puts "Error when calling ChatApi->chat_post_message: #{e}"
end
```

#### Using the chat_post_message_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<ChatPostMessageSuccessSchema>, Integer, Hash)> chat_post_message_with_http_info(token, channel, opts)

```ruby
begin
  
  data, status_code, headers = api_instance.chat_post_message_with_http_info(token, channel, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <ChatPostMessageSuccessSchema>
rescue slack::ApiError => e
  puts "Error when calling ChatApi->chat_post_message_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;chat:write&#x60; |  |
| **channel** | **String** | Channel, private group, or IM channel to send message to. Can be an encoded ID, or a name. See [below](#channels) for more details. |  |
| **as_user** | **String** | Pass true to post the message as the authed user, instead of as a bot. Defaults to false. See [authorship](#authorship) below. | [optional] |
| **attachments** | **String** | A JSON-based array of structured attachments, presented as a URL-encoded string. | [optional] |
| **blocks** | **String** | A JSON-based array of structured blocks, presented as a URL-encoded string. | [optional] |
| **icon_emoji** | **String** | Emoji to use as the icon for this message. Overrides &#x60;icon_url&#x60;. Must be used in conjunction with &#x60;as_user&#x60; set to &#x60;false&#x60;, otherwise ignored. See [authorship](#authorship) below. | [optional] |
| **icon_url** | **String** | URL to an image to use as the icon for this message. Must be used in conjunction with &#x60;as_user&#x60; set to false, otherwise ignored. See [authorship](#authorship) below. | [optional] |
| **link_names** | **Boolean** | Find and link channel names and usernames. | [optional] |
| **mrkdwn** | **Boolean** | Disable Slack markup parsing by setting to &#x60;false&#x60;. Enabled by default. | [optional] |
| **parse** | **String** | Change how messages are treated. Defaults to &#x60;none&#x60;. See [below](#formatting). | [optional] |
| **reply_broadcast** | **Boolean** | Used in conjunction with &#x60;thread_ts&#x60; and indicates whether reply should be made visible to everyone in the channel or conversation. Defaults to &#x60;false&#x60;. | [optional] |
| **text** | **String** | How this field works and whether it is required depends on other fields you use in your API call. [See below](#text_usage) for more detail. | [optional] |
| **thread_ts** | **String** | Provide another message&#39;s &#x60;ts&#x60; value to make this message a reply. Avoid using a reply&#39;s &#x60;ts&#x60; value; use its parent instead. | [optional] |
| **unfurl_links** | **Boolean** | Pass true to enable unfurling of primarily text-based content. | [optional] |
| **unfurl_media** | **Boolean** | Pass false to disable unfurling of media content. | [optional] |
| **username** | **String** | Set your bot&#39;s user name. Must be used in conjunction with &#x60;as_user&#x60; set to false, otherwise ignored. See [authorship](#authorship) below. | [optional] |

### Return type

[**ChatPostMessageSuccessSchema**](ChatPostMessageSuccessSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json


## chat_schedule_message

> <ChatScheduleMessageSuccessSchema> chat_schedule_message(opts)



Schedules a message to be sent to a channel.

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::ChatApi.new
opts = {
  token: 'token_example', # String | Authentication token. Requires scope: `chat:write`
  as_user: true, # Boolean | Pass true to post the message as the authed user, instead of as a bot. Defaults to false. See [chat.postMessage](chat.postMessage#authorship).
  attachments: 'attachments_example', # String | A JSON-based array of structured attachments, presented as a URL-encoded string.
  blocks: 'blocks_example', # String | A JSON-based array of structured blocks, presented as a URL-encoded string.
  channel: 'channel_example', # String | Channel, private group, or DM channel to send message to. Can be an encoded ID, or a name. See [below](#channels) for more details.
  link_names: true, # Boolean | Find and link channel names and usernames.
  parse: 'parse_example', # String | Change how messages are treated. Defaults to `none`. See [chat.postMessage](chat.postMessage#formatting).
  post_at: 'post_at_example', # String | Unix EPOCH timestamp of time in future to send the message.
  reply_broadcast: true, # Boolean | Used in conjunction with `thread_ts` and indicates whether reply should be made visible to everyone in the channel or conversation. Defaults to `false`.
  text: 'text_example', # String | How this field works and whether it is required depends on other fields you use in your API call. [See below](#text_usage) for more detail.
  thread_ts: 8.14, # Float | Provide another message's `ts` value to make this message a reply. Avoid using a reply's `ts` value; use its parent instead.
  unfurl_links: true, # Boolean | Pass true to enable unfurling of primarily text-based content.
  unfurl_media: true # Boolean | Pass false to disable unfurling of media content.
}

begin
  
  result = api_instance.chat_schedule_message(opts)
  p result
rescue slack::ApiError => e
  puts "Error when calling ChatApi->chat_schedule_message: #{e}"
end
```

#### Using the chat_schedule_message_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<ChatScheduleMessageSuccessSchema>, Integer, Hash)> chat_schedule_message_with_http_info(opts)

```ruby
begin
  
  data, status_code, headers = api_instance.chat_schedule_message_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <ChatScheduleMessageSuccessSchema>
rescue slack::ApiError => e
  puts "Error when calling ChatApi->chat_schedule_message_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;chat:write&#x60; | [optional] |
| **as_user** | **Boolean** | Pass true to post the message as the authed user, instead of as a bot. Defaults to false. See [chat.postMessage](chat.postMessage#authorship). | [optional] |
| **attachments** | **String** | A JSON-based array of structured attachments, presented as a URL-encoded string. | [optional] |
| **blocks** | **String** | A JSON-based array of structured blocks, presented as a URL-encoded string. | [optional] |
| **channel** | **String** | Channel, private group, or DM channel to send message to. Can be an encoded ID, or a name. See [below](#channels) for more details. | [optional] |
| **link_names** | **Boolean** | Find and link channel names and usernames. | [optional] |
| **parse** | **String** | Change how messages are treated. Defaults to &#x60;none&#x60;. See [chat.postMessage](chat.postMessage#formatting). | [optional] |
| **post_at** | **String** | Unix EPOCH timestamp of time in future to send the message. | [optional] |
| **reply_broadcast** | **Boolean** | Used in conjunction with &#x60;thread_ts&#x60; and indicates whether reply should be made visible to everyone in the channel or conversation. Defaults to &#x60;false&#x60;. | [optional] |
| **text** | **String** | How this field works and whether it is required depends on other fields you use in your API call. [See below](#text_usage) for more detail. | [optional] |
| **thread_ts** | **Float** | Provide another message&#39;s &#x60;ts&#x60; value to make this message a reply. Avoid using a reply&#39;s &#x60;ts&#x60; value; use its parent instead. | [optional] |
| **unfurl_links** | **Boolean** | Pass true to enable unfurling of primarily text-based content. | [optional] |
| **unfurl_media** | **Boolean** | Pass false to disable unfurling of media content. | [optional] |

### Return type

[**ChatScheduleMessageSuccessSchema**](ChatScheduleMessageSuccessSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json


## chat_scheduled_messages_list

> <ChatScheduledMessagesListSchema> chat_scheduled_messages_list(opts)



Returns a list of scheduled messages.

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::ChatApi.new
opts = {
  token: 'token_example', # String | Authentication token. Requires scope: `none`
  channel: 'channel_example', # String | The channel of the scheduled messages
  latest: 8.14, # Float | A UNIX timestamp of the latest value in the time range
  oldest: 8.14, # Float | A UNIX timestamp of the oldest value in the time range
  limit: 56, # Integer | Maximum number of original entries to return.
  cursor: 'cursor_example' # String | For pagination purposes, this is the `cursor` value returned from a previous call to `chat.scheduledmessages.list` indicating where you want to start this call from.
}

begin
  
  result = api_instance.chat_scheduled_messages_list(opts)
  p result
rescue slack::ApiError => e
  puts "Error when calling ChatApi->chat_scheduled_messages_list: #{e}"
end
```

#### Using the chat_scheduled_messages_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<ChatScheduledMessagesListSchema>, Integer, Hash)> chat_scheduled_messages_list_with_http_info(opts)

```ruby
begin
  
  data, status_code, headers = api_instance.chat_scheduled_messages_list_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <ChatScheduledMessagesListSchema>
rescue slack::ApiError => e
  puts "Error when calling ChatApi->chat_scheduled_messages_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;none&#x60; | [optional] |
| **channel** | **String** | The channel of the scheduled messages | [optional] |
| **latest** | **Float** | A UNIX timestamp of the latest value in the time range | [optional] |
| **oldest** | **Float** | A UNIX timestamp of the oldest value in the time range | [optional] |
| **limit** | **Integer** | Maximum number of original entries to return. | [optional] |
| **cursor** | **String** | For pagination purposes, this is the &#x60;cursor&#x60; value returned from a previous call to &#x60;chat.scheduledmessages.list&#x60; indicating where you want to start this call from. | [optional] |

### Return type

[**ChatScheduledMessagesListSchema**](ChatScheduledMessagesListSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## chat_unfurl

> <ChatUnfurlSuccessSchema> chat_unfurl(token, channel, ts, opts)



Provide custom unfurl behavior for user-posted URLs

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::ChatApi.new
token = 'token_example' # String | Authentication token. Requires scope: `links:write`
channel = 'channel_example' # String | Channel ID of the message
ts = 'ts_example' # String | Timestamp of the message to add unfurl behavior to.
opts = {
  unfurls: 'unfurls_example', # String | URL-encoded JSON map with keys set to URLs featured in the the message, pointing to their unfurl blocks or message attachments.
  user_auth_message: 'user_auth_message_example', # String | Provide a simply-formatted string to send as an ephemeral message to the user as invitation to authenticate further and enable full unfurling behavior
  user_auth_required: true, # Boolean | Set to `true` or `1` to indicate the user must install your Slack app to trigger unfurls for this domain
  user_auth_url: 'user_auth_url_example' # String | Send users to this custom URL where they will complete authentication in your app to fully trigger unfurling. Value should be properly URL-encoded.
}

begin
  
  result = api_instance.chat_unfurl(token, channel, ts, opts)
  p result
rescue slack::ApiError => e
  puts "Error when calling ChatApi->chat_unfurl: #{e}"
end
```

#### Using the chat_unfurl_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<ChatUnfurlSuccessSchema>, Integer, Hash)> chat_unfurl_with_http_info(token, channel, ts, opts)

```ruby
begin
  
  data, status_code, headers = api_instance.chat_unfurl_with_http_info(token, channel, ts, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <ChatUnfurlSuccessSchema>
rescue slack::ApiError => e
  puts "Error when calling ChatApi->chat_unfurl_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;links:write&#x60; |  |
| **channel** | **String** | Channel ID of the message |  |
| **ts** | **String** | Timestamp of the message to add unfurl behavior to. |  |
| **unfurls** | **String** | URL-encoded JSON map with keys set to URLs featured in the the message, pointing to their unfurl blocks or message attachments. | [optional] |
| **user_auth_message** | **String** | Provide a simply-formatted string to send as an ephemeral message to the user as invitation to authenticate further and enable full unfurling behavior | [optional] |
| **user_auth_required** | **Boolean** | Set to &#x60;true&#x60; or &#x60;1&#x60; to indicate the user must install your Slack app to trigger unfurls for this domain | [optional] |
| **user_auth_url** | **String** | Send users to this custom URL where they will complete authentication in your app to fully trigger unfurling. Value should be properly URL-encoded. | [optional] |

### Return type

[**ChatUnfurlSuccessSchema**](ChatUnfurlSuccessSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json


## chat_update

> <ChatUpdateSuccessSchema> chat_update(token, channel, ts, opts)



Updates a message.

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::ChatApi.new
token = 'token_example' # String | Authentication token. Requires scope: `chat:write`
channel = 'channel_example' # String | Channel containing the message to be updated.
ts = 'ts_example' # String | Timestamp of the message to be updated.
opts = {
  as_user: 'as_user_example', # String | Pass true to update the message as the authed user. [Bot users](/bot-users) in this context are considered authed users.
  attachments: 'attachments_example', # String | A JSON-based array of structured attachments, presented as a URL-encoded string. This field is required when not presenting `text`. If you don't include this field, the message's previous `attachments` will be retained. To remove previous `attachments`, include an empty array for this field.
  blocks: 'blocks_example', # String | A JSON-based array of [structured blocks](/block-kit/building), presented as a URL-encoded string. If you don't include this field, the message's previous `blocks` will be retained. To remove previous `blocks`, include an empty array for this field.
  link_names: 'link_names_example', # String | Find and link channel names and usernames. Defaults to `none`. If you do not specify a value for this field, the original value set for the message will be overwritten with the default, `none`.
  parse: 'parse_example', # String | Change how messages are treated. Defaults to `client`, unlike `chat.postMessage`. Accepts either `none` or `full`. If you do not specify a value for this field, the original value set for the message will be overwritten with the default, `client`.
  text: 'text_example' # String | New text for the message, using the [default formatting rules](/reference/surfaces/formatting). It's not required when presenting `blocks` or `attachments`.
}

begin
  
  result = api_instance.chat_update(token, channel, ts, opts)
  p result
rescue slack::ApiError => e
  puts "Error when calling ChatApi->chat_update: #{e}"
end
```

#### Using the chat_update_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<ChatUpdateSuccessSchema>, Integer, Hash)> chat_update_with_http_info(token, channel, ts, opts)

```ruby
begin
  
  data, status_code, headers = api_instance.chat_update_with_http_info(token, channel, ts, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <ChatUpdateSuccessSchema>
rescue slack::ApiError => e
  puts "Error when calling ChatApi->chat_update_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;chat:write&#x60; |  |
| **channel** | **String** | Channel containing the message to be updated. |  |
| **ts** | **String** | Timestamp of the message to be updated. |  |
| **as_user** | **String** | Pass true to update the message as the authed user. [Bot users](/bot-users) in this context are considered authed users. | [optional] |
| **attachments** | **String** | A JSON-based array of structured attachments, presented as a URL-encoded string. This field is required when not presenting &#x60;text&#x60;. If you don&#39;t include this field, the message&#39;s previous &#x60;attachments&#x60; will be retained. To remove previous &#x60;attachments&#x60;, include an empty array for this field. | [optional] |
| **blocks** | **String** | A JSON-based array of [structured blocks](/block-kit/building), presented as a URL-encoded string. If you don&#39;t include this field, the message&#39;s previous &#x60;blocks&#x60; will be retained. To remove previous &#x60;blocks&#x60;, include an empty array for this field. | [optional] |
| **link_names** | **String** | Find and link channel names and usernames. Defaults to &#x60;none&#x60;. If you do not specify a value for this field, the original value set for the message will be overwritten with the default, &#x60;none&#x60;. | [optional] |
| **parse** | **String** | Change how messages are treated. Defaults to &#x60;client&#x60;, unlike &#x60;chat.postMessage&#x60;. Accepts either &#x60;none&#x60; or &#x60;full&#x60;. If you do not specify a value for this field, the original value set for the message will be overwritten with the default, &#x60;client&#x60;. | [optional] |
| **text** | **String** | New text for the message, using the [default formatting rules](/reference/surfaces/formatting). It&#39;s not required when presenting &#x60;blocks&#x60; or &#x60;attachments&#x60;. | [optional] |

### Return type

[**ChatUpdateSuccessSchema**](ChatUpdateSuccessSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json

