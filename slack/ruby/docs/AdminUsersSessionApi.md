# slack::AdminUsersSessionApi

All URIs are relative to *https://slack.com/api*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**admin_users_session_invalidate**](AdminUsersSessionApi.md#admin_users_session_invalidate) | **POST** /admin.users.session.invalidate |  |
| [**admin_users_session_reset**](AdminUsersSessionApi.md#admin_users_session_reset) | **POST** /admin.users.session.reset |  |


## admin_users_session_invalidate

> <DefaultSuccessTemplate> admin_users_session_invalidate(token, session_id, team_id)



Invalidate a single session for a user by session_id

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::AdminUsersSessionApi.new
token = 'token_example' # String | Authentication token. Requires scope: `admin.users:write`
session_id = 56 # Integer | 
team_id = 'team_id_example' # String | ID of the team that the session belongs to

begin
  
  result = api_instance.admin_users_session_invalidate(token, session_id, team_id)
  p result
rescue slack::ApiError => e
  puts "Error when calling AdminUsersSessionApi->admin_users_session_invalidate: #{e}"
end
```

#### Using the admin_users_session_invalidate_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<DefaultSuccessTemplate>, Integer, Hash)> admin_users_session_invalidate_with_http_info(token, session_id, team_id)

```ruby
begin
  
  data, status_code, headers = api_instance.admin_users_session_invalidate_with_http_info(token, session_id, team_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <DefaultSuccessTemplate>
rescue slack::ApiError => e
  puts "Error when calling AdminUsersSessionApi->admin_users_session_invalidate_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;admin.users:write&#x60; |  |
| **session_id** | **Integer** |  |  |
| **team_id** | **String** | ID of the team that the session belongs to |  |

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json


## admin_users_session_reset

> <DefaultSuccessTemplate> admin_users_session_reset(token, user_id, opts)



Wipes all valid sessions on all devices for a given user

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::AdminUsersSessionApi.new
token = 'token_example' # String | Authentication token. Requires scope: `admin.users:write`
user_id = 'user_id_example' # String | The ID of the user to wipe sessions for
opts = {
  mobile_only: true, # Boolean | Only expire mobile sessions (default: false)
  web_only: true # Boolean | Only expire web sessions (default: false)
}

begin
  
  result = api_instance.admin_users_session_reset(token, user_id, opts)
  p result
rescue slack::ApiError => e
  puts "Error when calling AdminUsersSessionApi->admin_users_session_reset: #{e}"
end
```

#### Using the admin_users_session_reset_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<DefaultSuccessTemplate>, Integer, Hash)> admin_users_session_reset_with_http_info(token, user_id, opts)

```ruby
begin
  
  data, status_code, headers = api_instance.admin_users_session_reset_with_http_info(token, user_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <DefaultSuccessTemplate>
rescue slack::ApiError => e
  puts "Error when calling AdminUsersSessionApi->admin_users_session_reset_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;admin.users:write&#x60; |  |
| **user_id** | **String** | The ID of the user to wipe sessions for |  |
| **mobile_only** | **Boolean** | Only expire mobile sessions (default: false) | [optional] |
| **web_only** | **Boolean** | Only expire web sessions (default: false) | [optional] |

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json

