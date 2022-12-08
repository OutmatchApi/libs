# slack::StarsApi

All URIs are relative to *https://slack.com/api*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**stars_add**](StarsApi.md#stars_add) | **POST** /stars.add |  |
| [**stars_list**](StarsApi.md#stars_list) | **GET** /stars.list |  |
| [**stars_remove**](StarsApi.md#stars_remove) | **POST** /stars.remove |  |


## stars_add

> <StarsAddSchema> stars_add(token, opts)



Adds a star to an item.

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::StarsApi.new
token = 'token_example' # String | Authentication token. Requires scope: `stars:write`
opts = {
  channel: 'channel_example', # String | Channel to add star to, or channel where the message to add star to was posted (used with `timestamp`).
  file: 'file_example', # String | File to add star to.
  file_comment: 'file_comment_example', # String | File comment to add star to.
  timestamp: 'timestamp_example' # String | Timestamp of the message to add star to.
}

begin
  
  result = api_instance.stars_add(token, opts)
  p result
rescue slack::ApiError => e
  puts "Error when calling StarsApi->stars_add: #{e}"
end
```

#### Using the stars_add_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<StarsAddSchema>, Integer, Hash)> stars_add_with_http_info(token, opts)

```ruby
begin
  
  data, status_code, headers = api_instance.stars_add_with_http_info(token, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <StarsAddSchema>
rescue slack::ApiError => e
  puts "Error when calling StarsApi->stars_add_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;stars:write&#x60; |  |
| **channel** | **String** | Channel to add star to, or channel where the message to add star to was posted (used with &#x60;timestamp&#x60;). | [optional] |
| **file** | **String** | File to add star to. | [optional] |
| **file_comment** | **String** | File comment to add star to. | [optional] |
| **timestamp** | **String** | Timestamp of the message to add star to. | [optional] |

### Return type

[**StarsAddSchema**](StarsAddSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json


## stars_list

> <StarsListSchema> stars_list(opts)



Lists stars for a user.

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::StarsApi.new
opts = {
  token: 'token_example', # String | Authentication token. Requires scope: `stars:read`
  count: 'count_example', # String | 
  page: 'page_example', # String | 
  cursor: 'cursor_example', # String | Parameter for pagination. Set `cursor` equal to the `next_cursor` attribute returned by the previous request's `response_metadata`. This parameter is optional, but pagination is mandatory: the default value simply fetches the first \"page\" of the collection. See [pagination](/docs/pagination) for more details.
  limit: 56 # Integer | The maximum number of items to return. Fewer than the requested number of items may be returned, even if the end of the list hasn't been reached.
}

begin
  
  result = api_instance.stars_list(opts)
  p result
rescue slack::ApiError => e
  puts "Error when calling StarsApi->stars_list: #{e}"
end
```

#### Using the stars_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<StarsListSchema>, Integer, Hash)> stars_list_with_http_info(opts)

```ruby
begin
  
  data, status_code, headers = api_instance.stars_list_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <StarsListSchema>
rescue slack::ApiError => e
  puts "Error when calling StarsApi->stars_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;stars:read&#x60; | [optional] |
| **count** | **String** |  | [optional] |
| **page** | **String** |  | [optional] |
| **cursor** | **String** | Parameter for pagination. Set &#x60;cursor&#x60; equal to the &#x60;next_cursor&#x60; attribute returned by the previous request&#39;s &#x60;response_metadata&#x60;. This parameter is optional, but pagination is mandatory: the default value simply fetches the first \&quot;page\&quot; of the collection. See [pagination](/docs/pagination) for more details. | [optional] |
| **limit** | **Integer** | The maximum number of items to return. Fewer than the requested number of items may be returned, even if the end of the list hasn&#39;t been reached. | [optional] |

### Return type

[**StarsListSchema**](StarsListSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## stars_remove

> <StarsRemoveSchema> stars_remove(token, opts)



Removes a star from an item.

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::StarsApi.new
token = 'token_example' # String | Authentication token. Requires scope: `stars:write`
opts = {
  channel: 'channel_example', # String | Channel to remove star from, or channel where the message to remove star from was posted (used with `timestamp`).
  file: 'file_example', # String | File to remove star from.
  file_comment: 'file_comment_example', # String | File comment to remove star from.
  timestamp: 'timestamp_example' # String | Timestamp of the message to remove star from.
}

begin
  
  result = api_instance.stars_remove(token, opts)
  p result
rescue slack::ApiError => e
  puts "Error when calling StarsApi->stars_remove: #{e}"
end
```

#### Using the stars_remove_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<StarsRemoveSchema>, Integer, Hash)> stars_remove_with_http_info(token, opts)

```ruby
begin
  
  data, status_code, headers = api_instance.stars_remove_with_http_info(token, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <StarsRemoveSchema>
rescue slack::ApiError => e
  puts "Error when calling StarsApi->stars_remove_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;stars:write&#x60; |  |
| **channel** | **String** | Channel to remove star from, or channel where the message to remove star from was posted (used with &#x60;timestamp&#x60;). | [optional] |
| **file** | **String** | File to remove star from. | [optional] |
| **file_comment** | **String** | File comment to remove star from. | [optional] |
| **timestamp** | **String** | Timestamp of the message to remove star from. | [optional] |

### Return type

[**StarsRemoveSchema**](StarsRemoveSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json

