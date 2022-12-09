# apivideo::WebhooksApi

All URIs are relative to *https://ws.api.video*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**d_elete_webhook**](WebhooksApi.md#d_elete_webhook) | **DELETE** /webhooks/{webhookId} | Delete a Webhook |
| [**g_et_webhook**](WebhooksApi.md#g_et_webhook) | **GET** /webhooks/{webhookId} | Show Webhook details |
| [**l_ist_webhooks**](WebhooksApi.md#l_ist_webhooks) | **GET** /webhooks | List all webhooks |
| [**p_ost_webhooks**](WebhooksApi.md#p_ost_webhooks) | **POST** /webhooks | Create Webhook |


## d_elete_webhook

> d_elete_webhook(webhook_id)

Delete a Webhook

This endpoint will delete the indicated webhook.

### Examples

```ruby
require 'time'
require 'apivideo'
# setup authorization
apivideo.configure do |config|
  # Configure Bearer authorization: bearerAuth
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = apivideo::WebhooksApi.new
webhook_id = 'webhook_id_example' # String | The webhook you wish to delete.

begin
  # Delete a Webhook
  api_instance.d_elete_webhook(webhook_id)
rescue apivideo::ApiError => e
  puts "Error when calling WebhooksApi->d_elete_webhook: #{e}"
end
```

#### Using the d_elete_webhook_with_http_info variant

This returns an Array which contains the response data (`nil` in this case), status code and headers.

> <Array(nil, Integer, Hash)> d_elete_webhook_with_http_info(webhook_id)

```ruby
begin
  # Delete a Webhook
  data, status_code, headers = api_instance.d_elete_webhook_with_http_info(webhook_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => nil
rescue apivideo::ApiError => e
  puts "Error when calling WebhooksApi->d_elete_webhook_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **webhook_id** | **String** | The webhook you wish to delete. |  |

### Return type

nil (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## g_et_webhook

> <Webhook> g_et_webhook(webhook_id)

Show Webhook details

This call provides the same JSON information provided on Webjhook creation.

### Examples

```ruby
require 'time'
require 'apivideo'
# setup authorization
apivideo.configure do |config|
  # Configure Bearer authorization: bearerAuth
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = apivideo::WebhooksApi.new
webhook_id = 'webhook_id_example' # String | The unique webhook you wish to retreive details on.

begin
  # Show Webhook details
  result = api_instance.g_et_webhook(webhook_id)
  p result
rescue apivideo::ApiError => e
  puts "Error when calling WebhooksApi->g_et_webhook: #{e}"
end
```

#### Using the g_et_webhook_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Webhook>, Integer, Hash)> g_et_webhook_with_http_info(webhook_id)

```ruby
begin
  # Show Webhook details
  data, status_code, headers = api_instance.g_et_webhook_with_http_info(webhook_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Webhook>
rescue apivideo::ApiError => e
  puts "Error when calling WebhooksApi->g_et_webhook_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **webhook_id** | **String** | The unique webhook you wish to retreive details on. |  |

### Return type

[**Webhook**](Webhook.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## l_ist_webhooks

> <WebhooksListResponse> l_ist_webhooks(opts)

List all webhooks

Requests to this endpoint return a list of your webhooks (with all their details). You can filter what the webhook list that the API returns using the parameters described below.

### Examples

```ruby
require 'time'
require 'apivideo'
# setup authorization
apivideo.configure do |config|
  # Configure Bearer authorization: bearerAuth
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = apivideo::WebhooksApi.new
opts = {
    events: 'video.encoding.quality.completed', # String | The webhook event that you wish to filter on.
    current_page: 2, # Integer | Choose the number of search results to return per page. Minimum value: 1
    page_size: 30, # Integer | Results per page. Allowed values 1-100, default is 25.
}

begin
  # List all webhooks
  result = api_instance.l_ist_webhooks(opts)
  p result
rescue apivideo::ApiError => e
  puts "Error when calling WebhooksApi->l_ist_webhooks: #{e}"
end
```

#### Using the l_ist_webhooks_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<WebhooksListResponse>, Integer, Hash)> l_ist_webhooks_with_http_info(opts)

```ruby
begin
  # List all webhooks
  data, status_code, headers = api_instance.l_ist_webhooks_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <WebhooksListResponse>
rescue apivideo::ApiError => e
  puts "Error when calling WebhooksApi->l_ist_webhooks_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **events** | **String** | The webhook event that you wish to filter on. | [optional] |
| **current_page** | **Integer** | Choose the number of search results to return per page. Minimum value: 1 | [optional][default to 1] |
| **page_size** | **Integer** | Results per page. Allowed values 1-100, default is 25. | [optional][default to 25] |

### Return type

[**WebhooksListResponse**](WebhooksListResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## p_ost_webhooks

> <Webhook> p_ost_webhooks(opts)

Create Webhook

Webhooks can push notifications to your server, rather than polling api.video for changes. We currently offer four events:  * ```video.encoding.quality.completed```  When a new video is uploaded into your account, it will be encoded into several different HLS sizes/bitrates.  When each version is encoded, your webhook will get a notification.  It will look like ```{ \\\"type\\\": \\\"video.encoding.quality.completed\\\", \\\"emittedAt\\\": \\\"2021-01-29T16:46:25.217+01:00\\\", \\\"videoId\\\": \\\"viXXXXXXXX\\\", \\\"encoding\\\": \\\"hls\\\", \\\"quality\\\": \\\"720p\\\"} ```. This request says that the 720p HLS encoding was completed. * ```live-stream.broadcast.started```  When a livestream begins broadcasting, the broadcasting parameter changes from false to true, and this webhook fires. * ```live-stream.broadcast.ended```  This event fores when the livestream has finished broadcasting, and the broadcasting parameter flips from false to true. * ```video.source.recorded```  This event is similar to ```video.encoding.quality.completed```, but tells you if a livestream has been recorded as a VOD.

### Examples

```ruby
require 'time'
require 'apivideo'
# setup authorization
apivideo.configure do |config|
  # Configure Bearer authorization: bearerAuth
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = apivideo::WebhooksApi.new
opts = {
  webhooks_create_payload: apivideo::WebhooksCreatePayload.new({events: video.encoding.quality.completed, url: 'https://example.com/webhooks'}) # WebhooksCreatePayload | 
}

begin
  # Create Webhook
  result = api_instance.p_ost_webhooks(opts)
  p result
rescue apivideo::ApiError => e
  puts "Error when calling WebhooksApi->p_ost_webhooks: #{e}"
end
```

#### Using the p_ost_webhooks_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Webhook>, Integer, Hash)> p_ost_webhooks_with_http_info(opts)

```ruby
begin
  # Create Webhook
  data, status_code, headers = api_instance.p_ost_webhooks_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Webhook>
rescue apivideo::ApiError => e
  puts "Error when calling WebhooksApi->p_ost_webhooks_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **webhooks_create_payload** | [**WebhooksCreatePayload**](WebhooksCreatePayload.md) |  | [optional] |

### Return type

[**Webhook**](Webhook.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

