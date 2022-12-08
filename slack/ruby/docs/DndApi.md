# slack::DndApi

All URIs are relative to *https://slack.com/api*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**dnd_end_dnd**](DndApi.md#dnd_end_dnd) | **POST** /dnd.endDnd |  |
| [**dnd_end_snooze**](DndApi.md#dnd_end_snooze) | **POST** /dnd.endSnooze |  |
| [**dnd_info**](DndApi.md#dnd_info) | **GET** /dnd.info |  |
| [**dnd_set_snooze**](DndApi.md#dnd_set_snooze) | **POST** /dnd.setSnooze |  |
| [**dnd_team_info**](DndApi.md#dnd_team_info) | **GET** /dnd.teamInfo |  |


## dnd_end_dnd

> <DndEndDndSchema> dnd_end_dnd(token)



Ends the current user's Do Not Disturb session immediately.

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::DndApi.new
token = 'token_example' # String | Authentication token. Requires scope: `dnd:write`

begin
  
  result = api_instance.dnd_end_dnd(token)
  p result
rescue slack::ApiError => e
  puts "Error when calling DndApi->dnd_end_dnd: #{e}"
end
```

#### Using the dnd_end_dnd_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<DndEndDndSchema>, Integer, Hash)> dnd_end_dnd_with_http_info(token)

```ruby
begin
  
  data, status_code, headers = api_instance.dnd_end_dnd_with_http_info(token)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <DndEndDndSchema>
rescue slack::ApiError => e
  puts "Error when calling DndApi->dnd_end_dnd_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;dnd:write&#x60; |  |

### Return type

[**DndEndDndSchema**](DndEndDndSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## dnd_end_snooze

> <DndEndSnoozeSchema> dnd_end_snooze(token)



Ends the current user's snooze mode immediately.

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::DndApi.new
token = 'token_example' # String | Authentication token. Requires scope: `dnd:write`

begin
  
  result = api_instance.dnd_end_snooze(token)
  p result
rescue slack::ApiError => e
  puts "Error when calling DndApi->dnd_end_snooze: #{e}"
end
```

#### Using the dnd_end_snooze_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<DndEndSnoozeSchema>, Integer, Hash)> dnd_end_snooze_with_http_info(token)

```ruby
begin
  
  data, status_code, headers = api_instance.dnd_end_snooze_with_http_info(token)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <DndEndSnoozeSchema>
rescue slack::ApiError => e
  puts "Error when calling DndApi->dnd_end_snooze_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;dnd:write&#x60; |  |

### Return type

[**DndEndSnoozeSchema**](DndEndSnoozeSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## dnd_info

> <DndInfoSchema> dnd_info(opts)



Retrieves a user's current Do Not Disturb status.

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::DndApi.new
opts = {
  token: 'token_example', # String | Authentication token. Requires scope: `dnd:read`
  user: 'user_example' # String | User to fetch status for (defaults to current user)
}

begin
  
  result = api_instance.dnd_info(opts)
  p result
rescue slack::ApiError => e
  puts "Error when calling DndApi->dnd_info: #{e}"
end
```

#### Using the dnd_info_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<DndInfoSchema>, Integer, Hash)> dnd_info_with_http_info(opts)

```ruby
begin
  
  data, status_code, headers = api_instance.dnd_info_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <DndInfoSchema>
rescue slack::ApiError => e
  puts "Error when calling DndApi->dnd_info_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;dnd:read&#x60; | [optional] |
| **user** | **String** | User to fetch status for (defaults to current user) | [optional] |

### Return type

[**DndInfoSchema**](DndInfoSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## dnd_set_snooze

> <DndSetSnoozeSchema> dnd_set_snooze(num_minutes, token)



Turns on Do Not Disturb mode for the current user, or changes its duration.

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::DndApi.new
num_minutes = 'num_minutes_example' # String | Number of minutes, from now, to snooze until.
token = 'token_example' # String | Authentication token. Requires scope: `dnd:write`

begin
  
  result = api_instance.dnd_set_snooze(num_minutes, token)
  p result
rescue slack::ApiError => e
  puts "Error when calling DndApi->dnd_set_snooze: #{e}"
end
```

#### Using the dnd_set_snooze_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<DndSetSnoozeSchema>, Integer, Hash)> dnd_set_snooze_with_http_info(num_minutes, token)

```ruby
begin
  
  data, status_code, headers = api_instance.dnd_set_snooze_with_http_info(num_minutes, token)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <DndSetSnoozeSchema>
rescue slack::ApiError => e
  puts "Error when calling DndApi->dnd_set_snooze_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **num_minutes** | **String** | Number of minutes, from now, to snooze until. |  |
| **token** | **String** | Authentication token. Requires scope: &#x60;dnd:write&#x60; |  |

### Return type

[**DndSetSnoozeSchema**](DndSetSnoozeSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json


## dnd_team_info

> <DefaultSuccessTemplate> dnd_team_info(opts)



Retrieves the Do Not Disturb status for up to 50 users on a team.

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::DndApi.new
opts = {
  token: 'token_example', # String | Authentication token. Requires scope: `dnd:read`
  users: 'users_example' # String | Comma-separated list of users to fetch Do Not Disturb status for
}

begin
  
  result = api_instance.dnd_team_info(opts)
  p result
rescue slack::ApiError => e
  puts "Error when calling DndApi->dnd_team_info: #{e}"
end
```

#### Using the dnd_team_info_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<DefaultSuccessTemplate>, Integer, Hash)> dnd_team_info_with_http_info(opts)

```ruby
begin
  
  data, status_code, headers = api_instance.dnd_team_info_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <DefaultSuccessTemplate>
rescue slack::ApiError => e
  puts "Error when calling DndApi->dnd_team_info_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;dnd:read&#x60; | [optional] |
| **users** | **String** | Comma-separated list of users to fetch Do Not Disturb status for | [optional] |

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

