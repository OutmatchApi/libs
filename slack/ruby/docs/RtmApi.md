# slack::RtmApi

All URIs are relative to *https://slack.com/api*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**rtm_connect**](RtmApi.md#rtm_connect) | **GET** /rtm.connect |  |


## rtm_connect

> <RtmConnectSchema> rtm_connect(token, opts)



Starts a Real Time Messaging session.

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::RtmApi.new
token = 'token_example' # String | Authentication token. Requires scope: `rtm:stream`
opts = {
  batch_presence_aware: true, # Boolean | Batch presence deliveries via subscription. Enabling changes the shape of `presence_change` events. See [batch presence](/docs/presence-and-status#batching).
  presence_sub: true # Boolean | Only deliver presence events when requested by subscription. See [presence subscriptions](/docs/presence-and-status#subscriptions).
}

begin
  
  result = api_instance.rtm_connect(token, opts)
  p result
rescue slack::ApiError => e
  puts "Error when calling RtmApi->rtm_connect: #{e}"
end
```

#### Using the rtm_connect_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<RtmConnectSchema>, Integer, Hash)> rtm_connect_with_http_info(token, opts)

```ruby
begin
  
  data, status_code, headers = api_instance.rtm_connect_with_http_info(token, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <RtmConnectSchema>
rescue slack::ApiError => e
  puts "Error when calling RtmApi->rtm_connect_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;rtm:stream&#x60; |  |
| **batch_presence_aware** | **Boolean** | Batch presence deliveries via subscription. Enabling changes the shape of &#x60;presence_change&#x60; events. See [batch presence](/docs/presence-and-status#batching). | [optional] |
| **presence_sub** | **Boolean** | Only deliver presence events when requested by subscription. See [presence subscriptions](/docs/presence-and-status#subscriptions). | [optional] |

### Return type

[**RtmConnectSchema**](RtmConnectSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

