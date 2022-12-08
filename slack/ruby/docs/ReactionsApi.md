# slack::ReactionsApi

All URIs are relative to *https://slack.com/api*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**reactions_add**](ReactionsApi.md#reactions_add) | **POST** /reactions.add |  |
| [**reactions_get**](ReactionsApi.md#reactions_get) | **GET** /reactions.get |  |
| [**reactions_list**](ReactionsApi.md#reactions_list) | **GET** /reactions.list |  |
| [**reactions_remove**](ReactionsApi.md#reactions_remove) | **POST** /reactions.remove |  |


## reactions_add

> <ReactionsAddSchema> reactions_add(token, channel, name, timestamp)



Adds a reaction to an item.

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::ReactionsApi.new
token = 'token_example' # String | Authentication token. Requires scope: `reactions:write`
channel = 'channel_example' # String | Channel where the message to add reaction to was posted.
name = 'name_example' # String | Reaction (emoji) name.
timestamp = 'timestamp_example' # String | Timestamp of the message to add reaction to.

begin
  
  result = api_instance.reactions_add(token, channel, name, timestamp)
  p result
rescue slack::ApiError => e
  puts "Error when calling ReactionsApi->reactions_add: #{e}"
end
```

#### Using the reactions_add_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<ReactionsAddSchema>, Integer, Hash)> reactions_add_with_http_info(token, channel, name, timestamp)

```ruby
begin
  
  data, status_code, headers = api_instance.reactions_add_with_http_info(token, channel, name, timestamp)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <ReactionsAddSchema>
rescue slack::ApiError => e
  puts "Error when calling ReactionsApi->reactions_add_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;reactions:write&#x60; |  |
| **channel** | **String** | Channel where the message to add reaction to was posted. |  |
| **name** | **String** | Reaction (emoji) name. |  |
| **timestamp** | **String** | Timestamp of the message to add reaction to. |  |

### Return type

[**ReactionsAddSchema**](ReactionsAddSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json


## reactions_get

> <Array<ReactionsGetSuccessSchemaInner>> reactions_get(token, opts)



Gets reactions for an item.

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::ReactionsApi.new
token = 'token_example' # String | Authentication token. Requires scope: `reactions:read`
opts = {
  channel: 'channel_example', # String | Channel where the message to get reactions for was posted.
  file: 'file_example', # String | File to get reactions for.
  file_comment: 'file_comment_example', # String | File comment to get reactions for.
  full: true, # Boolean | If true always return the complete reaction list.
  timestamp: 'timestamp_example' # String | Timestamp of the message to get reactions for.
}

begin
  
  result = api_instance.reactions_get(token, opts)
  p result
rescue slack::ApiError => e
  puts "Error when calling ReactionsApi->reactions_get: #{e}"
end
```

#### Using the reactions_get_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Array<ReactionsGetSuccessSchemaInner>>, Integer, Hash)> reactions_get_with_http_info(token, opts)

```ruby
begin
  
  data, status_code, headers = api_instance.reactions_get_with_http_info(token, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Array<ReactionsGetSuccessSchemaInner>>
rescue slack::ApiError => e
  puts "Error when calling ReactionsApi->reactions_get_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;reactions:read&#x60; |  |
| **channel** | **String** | Channel where the message to get reactions for was posted. | [optional] |
| **file** | **String** | File to get reactions for. | [optional] |
| **file_comment** | **String** | File comment to get reactions for. | [optional] |
| **full** | **Boolean** | If true always return the complete reaction list. | [optional] |
| **timestamp** | **String** | Timestamp of the message to get reactions for. | [optional] |

### Return type

[**Array&lt;ReactionsGetSuccessSchemaInner&gt;**](ReactionsGetSuccessSchemaInner.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## reactions_list

> <ReactionsListSchema> reactions_list(token, opts)



Lists reactions made by a user.

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::ReactionsApi.new
token = 'token_example' # String | Authentication token. Requires scope: `reactions:read`
opts = {
  user: 'user_example', # String | Show reactions made by this user. Defaults to the authed user.
  full: true, # Boolean | If true always return the complete reaction list.
  count: 56, # Integer | 
  page: 56, # Integer | 
  cursor: 'cursor_example', # String | Parameter for pagination. Set `cursor` equal to the `next_cursor` attribute returned by the previous request's `response_metadata`. This parameter is optional, but pagination is mandatory: the default value simply fetches the first \"page\" of the collection. See [pagination](/docs/pagination) for more details.
  limit: 56 # Integer | The maximum number of items to return. Fewer than the requested number of items may be returned, even if the end of the list hasn't been reached.
}

begin
  
  result = api_instance.reactions_list(token, opts)
  p result
rescue slack::ApiError => e
  puts "Error when calling ReactionsApi->reactions_list: #{e}"
end
```

#### Using the reactions_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<ReactionsListSchema>, Integer, Hash)> reactions_list_with_http_info(token, opts)

```ruby
begin
  
  data, status_code, headers = api_instance.reactions_list_with_http_info(token, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <ReactionsListSchema>
rescue slack::ApiError => e
  puts "Error when calling ReactionsApi->reactions_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;reactions:read&#x60; |  |
| **user** | **String** | Show reactions made by this user. Defaults to the authed user. | [optional] |
| **full** | **Boolean** | If true always return the complete reaction list. | [optional] |
| **count** | **Integer** |  | [optional] |
| **page** | **Integer** |  | [optional] |
| **cursor** | **String** | Parameter for pagination. Set &#x60;cursor&#x60; equal to the &#x60;next_cursor&#x60; attribute returned by the previous request&#39;s &#x60;response_metadata&#x60;. This parameter is optional, but pagination is mandatory: the default value simply fetches the first \&quot;page\&quot; of the collection. See [pagination](/docs/pagination) for more details. | [optional] |
| **limit** | **Integer** | The maximum number of items to return. Fewer than the requested number of items may be returned, even if the end of the list hasn&#39;t been reached. | [optional] |

### Return type

[**ReactionsListSchema**](ReactionsListSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## reactions_remove

> <ReactionsRemoveSchema> reactions_remove(token, name, opts)



Removes a reaction from an item.

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::ReactionsApi.new
token = 'token_example' # String | Authentication token. Requires scope: `reactions:write`
name = 'name_example' # String | Reaction (emoji) name.
opts = {
  channel: 'channel_example', # String | Channel where the message to remove reaction from was posted.
  file: 'file_example', # String | File to remove reaction from.
  file_comment: 'file_comment_example', # String | File comment to remove reaction from.
  timestamp: 'timestamp_example' # String | Timestamp of the message to remove reaction from.
}

begin
  
  result = api_instance.reactions_remove(token, name, opts)
  p result
rescue slack::ApiError => e
  puts "Error when calling ReactionsApi->reactions_remove: #{e}"
end
```

#### Using the reactions_remove_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<ReactionsRemoveSchema>, Integer, Hash)> reactions_remove_with_http_info(token, name, opts)

```ruby
begin
  
  data, status_code, headers = api_instance.reactions_remove_with_http_info(token, name, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <ReactionsRemoveSchema>
rescue slack::ApiError => e
  puts "Error when calling ReactionsApi->reactions_remove_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;reactions:write&#x60; |  |
| **name** | **String** | Reaction (emoji) name. |  |
| **channel** | **String** | Channel where the message to remove reaction from was posted. | [optional] |
| **file** | **String** | File to remove reaction from. | [optional] |
| **file_comment** | **String** | File comment to remove reaction from. | [optional] |
| **timestamp** | **String** | Timestamp of the message to remove reaction from. | [optional] |

### Return type

[**ReactionsRemoveSchema**](ReactionsRemoveSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json

