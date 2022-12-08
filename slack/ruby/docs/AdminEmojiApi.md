# slack::AdminEmojiApi

All URIs are relative to *https://slack.com/api*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**admin_emoji_add**](AdminEmojiApi.md#admin_emoji_add) | **POST** /admin.emoji.add |  |
| [**admin_emoji_add_alias**](AdminEmojiApi.md#admin_emoji_add_alias) | **POST** /admin.emoji.addAlias |  |
| [**admin_emoji_list**](AdminEmojiApi.md#admin_emoji_list) | **GET** /admin.emoji.list |  |
| [**admin_emoji_remove**](AdminEmojiApi.md#admin_emoji_remove) | **POST** /admin.emoji.remove |  |
| [**admin_emoji_rename**](AdminEmojiApi.md#admin_emoji_rename) | **POST** /admin.emoji.rename |  |


## admin_emoji_add

> <DefaultSuccessTemplate> admin_emoji_add(name, token, url)



Add an emoji.

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::AdminEmojiApi.new
name = 'name_example' # String | The name of the emoji to be removed. Colons (`:myemoji:`) around the value are not required, although they may be included.
token = 'token_example' # String | Authentication token. Requires scope: `admin.teams:write`
url = 'url_example' # String | The URL of a file to use as an image for the emoji. Square images under 128KB and with transparent backgrounds work best.

begin
  
  result = api_instance.admin_emoji_add(name, token, url)
  p result
rescue slack::ApiError => e
  puts "Error when calling AdminEmojiApi->admin_emoji_add: #{e}"
end
```

#### Using the admin_emoji_add_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<DefaultSuccessTemplate>, Integer, Hash)> admin_emoji_add_with_http_info(name, token, url)

```ruby
begin
  
  data, status_code, headers = api_instance.admin_emoji_add_with_http_info(name, token, url)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <DefaultSuccessTemplate>
rescue slack::ApiError => e
  puts "Error when calling AdminEmojiApi->admin_emoji_add_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **name** | **String** | The name of the emoji to be removed. Colons (&#x60;:myemoji:&#x60;) around the value are not required, although they may be included. |  |
| **token** | **String** | Authentication token. Requires scope: &#x60;admin.teams:write&#x60; |  |
| **url** | **String** | The URL of a file to use as an image for the emoji. Square images under 128KB and with transparent backgrounds work best. |  |

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json


## admin_emoji_add_alias

> <DefaultSuccessTemplate> admin_emoji_add_alias(alias_for, name, token)



Add an emoji alias.

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::AdminEmojiApi.new
alias_for = 'alias_for_example' # String | The alias of the emoji.
name = 'name_example' # String | The name of the emoji to be aliased. Colons (`:myemoji:`) around the value are not required, although they may be included.
token = 'token_example' # String | Authentication token. Requires scope: `admin.teams:write`

begin
  
  result = api_instance.admin_emoji_add_alias(alias_for, name, token)
  p result
rescue slack::ApiError => e
  puts "Error when calling AdminEmojiApi->admin_emoji_add_alias: #{e}"
end
```

#### Using the admin_emoji_add_alias_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<DefaultSuccessTemplate>, Integer, Hash)> admin_emoji_add_alias_with_http_info(alias_for, name, token)

```ruby
begin
  
  data, status_code, headers = api_instance.admin_emoji_add_alias_with_http_info(alias_for, name, token)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <DefaultSuccessTemplate>
rescue slack::ApiError => e
  puts "Error when calling AdminEmojiApi->admin_emoji_add_alias_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **alias_for** | **String** | The alias of the emoji. |  |
| **name** | **String** | The name of the emoji to be aliased. Colons (&#x60;:myemoji:&#x60;) around the value are not required, although they may be included. |  |
| **token** | **String** | Authentication token. Requires scope: &#x60;admin.teams:write&#x60; |  |

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json


## admin_emoji_list

> <DefaultSuccessTemplate> admin_emoji_list(token, opts)



List emoji for an Enterprise Grid organization.

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::AdminEmojiApi.new
token = 'token_example' # String | Authentication token. Requires scope: `admin.teams:read`
opts = {
  cursor: 'cursor_example', # String | Set `cursor` to `next_cursor` returned by the previous call to list items in the next page
  limit: 56 # Integer | The maximum number of items to return. Must be between 1 - 1000 both inclusive.
}

begin
  
  result = api_instance.admin_emoji_list(token, opts)
  p result
rescue slack::ApiError => e
  puts "Error when calling AdminEmojiApi->admin_emoji_list: #{e}"
end
```

#### Using the admin_emoji_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<DefaultSuccessTemplate>, Integer, Hash)> admin_emoji_list_with_http_info(token, opts)

```ruby
begin
  
  data, status_code, headers = api_instance.admin_emoji_list_with_http_info(token, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <DefaultSuccessTemplate>
rescue slack::ApiError => e
  puts "Error when calling AdminEmojiApi->admin_emoji_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;admin.teams:read&#x60; |  |
| **cursor** | **String** | Set &#x60;cursor&#x60; to &#x60;next_cursor&#x60; returned by the previous call to list items in the next page | [optional] |
| **limit** | **Integer** | The maximum number of items to return. Must be between 1 - 1000 both inclusive. | [optional] |

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## admin_emoji_remove

> <DefaultSuccessTemplate> admin_emoji_remove(name, token)



Remove an emoji across an Enterprise Grid organization

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::AdminEmojiApi.new
name = 'name_example' # String | The name of the emoji to be removed. Colons (`:myemoji:`) around the value are not required, although they may be included.
token = 'token_example' # String | Authentication token. Requires scope: `admin.teams:write`

begin
  
  result = api_instance.admin_emoji_remove(name, token)
  p result
rescue slack::ApiError => e
  puts "Error when calling AdminEmojiApi->admin_emoji_remove: #{e}"
end
```

#### Using the admin_emoji_remove_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<DefaultSuccessTemplate>, Integer, Hash)> admin_emoji_remove_with_http_info(name, token)

```ruby
begin
  
  data, status_code, headers = api_instance.admin_emoji_remove_with_http_info(name, token)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <DefaultSuccessTemplate>
rescue slack::ApiError => e
  puts "Error when calling AdminEmojiApi->admin_emoji_remove_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **name** | **String** | The name of the emoji to be removed. Colons (&#x60;:myemoji:&#x60;) around the value are not required, although they may be included. |  |
| **token** | **String** | Authentication token. Requires scope: &#x60;admin.teams:write&#x60; |  |

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json


## admin_emoji_rename

> <DefaultSuccessTemplate> admin_emoji_rename(name, new_name, token)



Rename an emoji.

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::AdminEmojiApi.new
name = 'name_example' # String | The name of the emoji to be renamed. Colons (`:myemoji:`) around the value are not required, although they may be included.
new_name = 'new_name_example' # String | The new name of the emoji.
token = 'token_example' # String | Authentication token. Requires scope: `admin.teams:write`

begin
  
  result = api_instance.admin_emoji_rename(name, new_name, token)
  p result
rescue slack::ApiError => e
  puts "Error when calling AdminEmojiApi->admin_emoji_rename: #{e}"
end
```

#### Using the admin_emoji_rename_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<DefaultSuccessTemplate>, Integer, Hash)> admin_emoji_rename_with_http_info(name, new_name, token)

```ruby
begin
  
  data, status_code, headers = api_instance.admin_emoji_rename_with_http_info(name, new_name, token)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <DefaultSuccessTemplate>
rescue slack::ApiError => e
  puts "Error when calling AdminEmojiApi->admin_emoji_rename_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **name** | **String** | The name of the emoji to be renamed. Colons (&#x60;:myemoji:&#x60;) around the value are not required, although they may be included. |  |
| **new_name** | **String** | The new name of the emoji. |  |
| **token** | **String** | Authentication token. Requires scope: &#x60;admin.teams:write&#x60; |  |

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json

