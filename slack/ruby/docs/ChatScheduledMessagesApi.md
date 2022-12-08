# slack::ChatScheduledMessagesApi

All URIs are relative to *https://slack.com/api*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**chat_scheduled_messages_list**](ChatScheduledMessagesApi.md#chat_scheduled_messages_list) | **GET** /chat.scheduledMessages.list |  |


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

api_instance = slack::ChatScheduledMessagesApi.new
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
  puts "Error when calling ChatScheduledMessagesApi->chat_scheduled_messages_list: #{e}"
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
  puts "Error when calling ChatScheduledMessagesApi->chat_scheduled_messages_list_with_http_info: #{e}"
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

