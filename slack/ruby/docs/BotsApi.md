# slack::BotsApi

All URIs are relative to *https://slack.com/api*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**bots_info**](BotsApi.md#bots_info) | **GET** /bots.info |  |


## bots_info

> <BotsInfoSchema> bots_info(token, opts)



Gets information about a bot user.

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::BotsApi.new
token = 'token_example' # String | Authentication token. Requires scope: `users:read`
opts = {
  bot: 'bot_example' # String | Bot user to get info on
}

begin
  
  result = api_instance.bots_info(token, opts)
  p result
rescue slack::ApiError => e
  puts "Error when calling BotsApi->bots_info: #{e}"
end
```

#### Using the bots_info_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<BotsInfoSchema>, Integer, Hash)> bots_info_with_http_info(token, opts)

```ruby
begin
  
  data, status_code, headers = api_instance.bots_info_with_http_info(token, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <BotsInfoSchema>
rescue slack::ApiError => e
  puts "Error when calling BotsApi->bots_info_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;users:read&#x60; |  |
| **bot** | **String** | Bot user to get info on | [optional] |

### Return type

[**BotsInfoSchema**](BotsInfoSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

