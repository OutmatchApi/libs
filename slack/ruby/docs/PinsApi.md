# slack::PinsApi

All URIs are relative to *https://slack.com/api*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**pins_add**](PinsApi.md#pins_add) | **POST** /pins.add |  |
| [**pins_list**](PinsApi.md#pins_list) | **GET** /pins.list |  |
| [**pins_remove**](PinsApi.md#pins_remove) | **POST** /pins.remove |  |


## pins_add

> <PinsAddSchema> pins_add(token, channel, opts)



Pins an item to a channel.

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::PinsApi.new
token = 'token_example' # String | Authentication token. Requires scope: `pins:write`
channel = 'channel_example' # String | Channel to pin the item in.
opts = {
  timestamp: 'timestamp_example' # String | Timestamp of the message to pin.
}

begin
  
  result = api_instance.pins_add(token, channel, opts)
  p result
rescue slack::ApiError => e
  puts "Error when calling PinsApi->pins_add: #{e}"
end
```

#### Using the pins_add_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<PinsAddSchema>, Integer, Hash)> pins_add_with_http_info(token, channel, opts)

```ruby
begin
  
  data, status_code, headers = api_instance.pins_add_with_http_info(token, channel, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <PinsAddSchema>
rescue slack::ApiError => e
  puts "Error when calling PinsApi->pins_add_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;pins:write&#x60; |  |
| **channel** | **String** | Channel to pin the item in. |  |
| **timestamp** | **String** | Timestamp of the message to pin. | [optional] |

### Return type

[**PinsAddSchema**](PinsAddSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json


## pins_list

> <Array<PinsListSuccessSchemaInner>> pins_list(token, channel)



Lists items pinned to a channel.

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::PinsApi.new
token = 'token_example' # String | Authentication token. Requires scope: `pins:read`
channel = 'channel_example' # String | Channel to get pinned items for.

begin
  
  result = api_instance.pins_list(token, channel)
  p result
rescue slack::ApiError => e
  puts "Error when calling PinsApi->pins_list: #{e}"
end
```

#### Using the pins_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Array<PinsListSuccessSchemaInner>>, Integer, Hash)> pins_list_with_http_info(token, channel)

```ruby
begin
  
  data, status_code, headers = api_instance.pins_list_with_http_info(token, channel)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Array<PinsListSuccessSchemaInner>>
rescue slack::ApiError => e
  puts "Error when calling PinsApi->pins_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;pins:read&#x60; |  |
| **channel** | **String** | Channel to get pinned items for. |  |

### Return type

[**Array&lt;PinsListSuccessSchemaInner&gt;**](PinsListSuccessSchemaInner.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## pins_remove

> <PinsRemoveSchema> pins_remove(token, channel, opts)



Un-pins an item from a channel.

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::PinsApi.new
token = 'token_example' # String | Authentication token. Requires scope: `pins:write`
channel = 'channel_example' # String | Channel where the item is pinned to.
opts = {
  timestamp: 'timestamp_example' # String | Timestamp of the message to un-pin.
}

begin
  
  result = api_instance.pins_remove(token, channel, opts)
  p result
rescue slack::ApiError => e
  puts "Error when calling PinsApi->pins_remove: #{e}"
end
```

#### Using the pins_remove_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<PinsRemoveSchema>, Integer, Hash)> pins_remove_with_http_info(token, channel, opts)

```ruby
begin
  
  data, status_code, headers = api_instance.pins_remove_with_http_info(token, channel, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <PinsRemoveSchema>
rescue slack::ApiError => e
  puts "Error when calling PinsApi->pins_remove_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;pins:write&#x60; |  |
| **channel** | **String** | Channel where the item is pinned to. |  |
| **timestamp** | **String** | Timestamp of the message to un-pin. | [optional] |

### Return type

[**PinsRemoveSchema**](PinsRemoveSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json

