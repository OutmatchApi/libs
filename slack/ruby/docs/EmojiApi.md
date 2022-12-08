# slack::EmojiApi

All URIs are relative to *https://slack.com/api*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**emoji_list**](EmojiApi.md#emoji_list) | **GET** /emoji.list |  |


## emoji_list

> <DefaultSuccessTemplate> emoji_list(token)



Lists custom emoji for a team.

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::EmojiApi.new
token = 'token_example' # String | Authentication token. Requires scope: `emoji:read`

begin
  
  result = api_instance.emoji_list(token)
  p result
rescue slack::ApiError => e
  puts "Error when calling EmojiApi->emoji_list: #{e}"
end
```

#### Using the emoji_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<DefaultSuccessTemplate>, Integer, Hash)> emoji_list_with_http_info(token)

```ruby
begin
  
  data, status_code, headers = api_instance.emoji_list_with_http_info(token)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <DefaultSuccessTemplate>
rescue slack::ApiError => e
  puts "Error when calling EmojiApi->emoji_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;emoji:read&#x60; |  |

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

