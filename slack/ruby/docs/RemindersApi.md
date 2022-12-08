# slack::RemindersApi

All URIs are relative to *https://slack.com/api*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**reminders_add**](RemindersApi.md#reminders_add) | **POST** /reminders.add |  |
| [**reminders_complete**](RemindersApi.md#reminders_complete) | **POST** /reminders.complete |  |
| [**reminders_delete**](RemindersApi.md#reminders_delete) | **POST** /reminders.delete |  |
| [**reminders_info**](RemindersApi.md#reminders_info) | **GET** /reminders.info |  |
| [**reminders_list**](RemindersApi.md#reminders_list) | **GET** /reminders.list |  |


## reminders_add

> <RemindersAddSchema> reminders_add(token, text, time, opts)



Creates a reminder.

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::RemindersApi.new
token = 'token_example' # String | Authentication token. Requires scope: `reminders:write`
text = 'text_example' # String | The content of the reminder
time = 'time_example' # String | When this reminder should happen: the Unix timestamp (up to five years from now), the number of seconds until the reminder (if within 24 hours), or a natural language description (Ex. \\\"in 15 minutes,\\\" or \\\"every Thursday\\\")
opts = {
  user: 'user_example' # String | The user who will receive the reminder. If no user is specified, the reminder will go to user who created it.
}

begin
  
  result = api_instance.reminders_add(token, text, time, opts)
  p result
rescue slack::ApiError => e
  puts "Error when calling RemindersApi->reminders_add: #{e}"
end
```

#### Using the reminders_add_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<RemindersAddSchema>, Integer, Hash)> reminders_add_with_http_info(token, text, time, opts)

```ruby
begin
  
  data, status_code, headers = api_instance.reminders_add_with_http_info(token, text, time, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <RemindersAddSchema>
rescue slack::ApiError => e
  puts "Error when calling RemindersApi->reminders_add_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;reminders:write&#x60; |  |
| **text** | **String** | The content of the reminder |  |
| **time** | **String** | When this reminder should happen: the Unix timestamp (up to five years from now), the number of seconds until the reminder (if within 24 hours), or a natural language description (Ex. \\\&quot;in 15 minutes,\\\&quot; or \\\&quot;every Thursday\\\&quot;) |  |
| **user** | **String** | The user who will receive the reminder. If no user is specified, the reminder will go to user who created it. | [optional] |

### Return type

[**RemindersAddSchema**](RemindersAddSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json


## reminders_complete

> <RemindersCompleteSchema> reminders_complete(opts)



Marks a reminder as complete.

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::RemindersApi.new
opts = {
  token: 'token_example', # String | Authentication token. Requires scope: `reminders:write`
  reminder: 'reminder_example' # String | The ID of the reminder to be marked as complete
}

begin
  
  result = api_instance.reminders_complete(opts)
  p result
rescue slack::ApiError => e
  puts "Error when calling RemindersApi->reminders_complete: #{e}"
end
```

#### Using the reminders_complete_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<RemindersCompleteSchema>, Integer, Hash)> reminders_complete_with_http_info(opts)

```ruby
begin
  
  data, status_code, headers = api_instance.reminders_complete_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <RemindersCompleteSchema>
rescue slack::ApiError => e
  puts "Error when calling RemindersApi->reminders_complete_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;reminders:write&#x60; | [optional] |
| **reminder** | **String** | The ID of the reminder to be marked as complete | [optional] |

### Return type

[**RemindersCompleteSchema**](RemindersCompleteSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json


## reminders_delete

> <RemindersDeleteSchema> reminders_delete(opts)



Deletes a reminder.

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::RemindersApi.new
opts = {
  token: 'token_example', # String | Authentication token. Requires scope: `reminders:write`
  reminder: 'reminder_example' # String | The ID of the reminder
}

begin
  
  result = api_instance.reminders_delete(opts)
  p result
rescue slack::ApiError => e
  puts "Error when calling RemindersApi->reminders_delete: #{e}"
end
```

#### Using the reminders_delete_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<RemindersDeleteSchema>, Integer, Hash)> reminders_delete_with_http_info(opts)

```ruby
begin
  
  data, status_code, headers = api_instance.reminders_delete_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <RemindersDeleteSchema>
rescue slack::ApiError => e
  puts "Error when calling RemindersApi->reminders_delete_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;reminders:write&#x60; | [optional] |
| **reminder** | **String** | The ID of the reminder | [optional] |

### Return type

[**RemindersDeleteSchema**](RemindersDeleteSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json


## reminders_info

> <RemindersInfoSchema> reminders_info(opts)



Gets information about a reminder.

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::RemindersApi.new
opts = {
  token: 'token_example', # String | Authentication token. Requires scope: `reminders:read`
  reminder: 'reminder_example' # String | The ID of the reminder
}

begin
  
  result = api_instance.reminders_info(opts)
  p result
rescue slack::ApiError => e
  puts "Error when calling RemindersApi->reminders_info: #{e}"
end
```

#### Using the reminders_info_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<RemindersInfoSchema>, Integer, Hash)> reminders_info_with_http_info(opts)

```ruby
begin
  
  data, status_code, headers = api_instance.reminders_info_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <RemindersInfoSchema>
rescue slack::ApiError => e
  puts "Error when calling RemindersApi->reminders_info_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;reminders:read&#x60; | [optional] |
| **reminder** | **String** | The ID of the reminder | [optional] |

### Return type

[**RemindersInfoSchema**](RemindersInfoSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## reminders_list

> <RemindersListSchema> reminders_list(opts)



Lists all reminders created by or for a given user.

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::RemindersApi.new
opts = {
  token: 'token_example' # String | Authentication token. Requires scope: `reminders:read`
}

begin
  
  result = api_instance.reminders_list(opts)
  p result
rescue slack::ApiError => e
  puts "Error when calling RemindersApi->reminders_list: #{e}"
end
```

#### Using the reminders_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<RemindersListSchema>, Integer, Hash)> reminders_list_with_http_info(opts)

```ruby
begin
  
  data, status_code, headers = api_instance.reminders_list_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <RemindersListSchema>
rescue slack::ApiError => e
  puts "Error when calling RemindersApi->reminders_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;reminders:read&#x60; | [optional] |

### Return type

[**RemindersListSchema**](RemindersListSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

