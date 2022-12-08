# slack::AdminUsersApi

All URIs are relative to *https://slack.com/api*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**admin_users_assign**](AdminUsersApi.md#admin_users_assign) | **POST** /admin.users.assign |  |
| [**admin_users_invite**](AdminUsersApi.md#admin_users_invite) | **POST** /admin.users.invite |  |
| [**admin_users_list**](AdminUsersApi.md#admin_users_list) | **GET** /admin.users.list |  |
| [**admin_users_remove**](AdminUsersApi.md#admin_users_remove) | **POST** /admin.users.remove |  |
| [**admin_users_set_admin**](AdminUsersApi.md#admin_users_set_admin) | **POST** /admin.users.setAdmin |  |
| [**admin_users_set_expiration**](AdminUsersApi.md#admin_users_set_expiration) | **POST** /admin.users.setExpiration |  |
| [**admin_users_set_owner**](AdminUsersApi.md#admin_users_set_owner) | **POST** /admin.users.setOwner |  |
| [**admin_users_set_regular**](AdminUsersApi.md#admin_users_set_regular) | **POST** /admin.users.setRegular |  |


## admin_users_assign

> <DefaultSuccessTemplate> admin_users_assign(token, team_id, user_id, opts)



Add an Enterprise user to a workspace.

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::AdminUsersApi.new
token = 'token_example' # String | Authentication token. Requires scope: `admin.users:write`
team_id = 'team_id_example' # String | The ID (`T1234`) of the workspace.
user_id = 'user_id_example' # String | The ID of the user to add to the workspace.
opts = {
  channel_ids: 'channel_ids_example', # String | Comma separated values of channel IDs to add user in the new workspace.
  is_restricted: true, # Boolean | True if user should be added to the workspace as a guest.
  is_ultra_restricted: true # Boolean | True if user should be added to the workspace as a single-channel guest.
}

begin
  
  result = api_instance.admin_users_assign(token, team_id, user_id, opts)
  p result
rescue slack::ApiError => e
  puts "Error when calling AdminUsersApi->admin_users_assign: #{e}"
end
```

#### Using the admin_users_assign_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<DefaultSuccessTemplate>, Integer, Hash)> admin_users_assign_with_http_info(token, team_id, user_id, opts)

```ruby
begin
  
  data, status_code, headers = api_instance.admin_users_assign_with_http_info(token, team_id, user_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <DefaultSuccessTemplate>
rescue slack::ApiError => e
  puts "Error when calling AdminUsersApi->admin_users_assign_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;admin.users:write&#x60; |  |
| **team_id** | **String** | The ID (&#x60;T1234&#x60;) of the workspace. |  |
| **user_id** | **String** | The ID of the user to add to the workspace. |  |
| **channel_ids** | **String** | Comma separated values of channel IDs to add user in the new workspace. | [optional] |
| **is_restricted** | **Boolean** | True if user should be added to the workspace as a guest. | [optional] |
| **is_ultra_restricted** | **Boolean** | True if user should be added to the workspace as a single-channel guest. | [optional] |

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json


## admin_users_invite

> <DefaultSuccessTemplate> admin_users_invite(token, channel_ids, email, team_id, opts)



Invite a user to a workspace.

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::AdminUsersApi.new
token = 'token_example' # String | Authentication token. Requires scope: `admin.users:write`
channel_ids = 'channel_ids_example' # String | A comma-separated list of `channel_id`s for this user to join. At least one channel is required.
email = 'email_example' # String | The email address of the person to invite.
team_id = 'team_id_example' # String | The ID (`T1234`) of the workspace.
opts = {
  custom_message: 'custom_message_example', # String | An optional message to send to the user in the invite email.
  guest_expiration_ts: 'guest_expiration_ts_example', # String | Timestamp when guest account should be disabled. Only include this timestamp if you are inviting a guest user and you want their account to expire on a certain date.
  is_restricted: true, # Boolean | Is this user a multi-channel guest user? (default: false)
  is_ultra_restricted: true, # Boolean | Is this user a single channel guest user? (default: false)
  real_name: 'real_name_example', # String | Full name of the user.
  resend: true # Boolean | Allow this invite to be resent in the future if a user has not signed up yet. (default: false)
}

begin
  
  result = api_instance.admin_users_invite(token, channel_ids, email, team_id, opts)
  p result
rescue slack::ApiError => e
  puts "Error when calling AdminUsersApi->admin_users_invite: #{e}"
end
```

#### Using the admin_users_invite_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<DefaultSuccessTemplate>, Integer, Hash)> admin_users_invite_with_http_info(token, channel_ids, email, team_id, opts)

```ruby
begin
  
  data, status_code, headers = api_instance.admin_users_invite_with_http_info(token, channel_ids, email, team_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <DefaultSuccessTemplate>
rescue slack::ApiError => e
  puts "Error when calling AdminUsersApi->admin_users_invite_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;admin.users:write&#x60; |  |
| **channel_ids** | **String** | A comma-separated list of &#x60;channel_id&#x60;s for this user to join. At least one channel is required. |  |
| **email** | **String** | The email address of the person to invite. |  |
| **team_id** | **String** | The ID (&#x60;T1234&#x60;) of the workspace. |  |
| **custom_message** | **String** | An optional message to send to the user in the invite email. | [optional] |
| **guest_expiration_ts** | **String** | Timestamp when guest account should be disabled. Only include this timestamp if you are inviting a guest user and you want their account to expire on a certain date. | [optional] |
| **is_restricted** | **Boolean** | Is this user a multi-channel guest user? (default: false) | [optional] |
| **is_ultra_restricted** | **Boolean** | Is this user a single channel guest user? (default: false) | [optional] |
| **real_name** | **String** | Full name of the user. | [optional] |
| **resend** | **Boolean** | Allow this invite to be resent in the future if a user has not signed up yet. (default: false) | [optional] |

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json


## admin_users_list

> <DefaultSuccessTemplate> admin_users_list(token, team_id, opts)



List users on a workspace

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::AdminUsersApi.new
token = 'token_example' # String | Authentication token. Requires scope: `admin.users:read`
team_id = 'team_id_example' # String | The ID (`T1234`) of the workspace.
opts = {
  cursor: 'cursor_example', # String | Set `cursor` to `next_cursor` returned by the previous call to list items in the next page.
  limit: 56 # Integer | Limit for how many users to be retrieved per page
}

begin
  
  result = api_instance.admin_users_list(token, team_id, opts)
  p result
rescue slack::ApiError => e
  puts "Error when calling AdminUsersApi->admin_users_list: #{e}"
end
```

#### Using the admin_users_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<DefaultSuccessTemplate>, Integer, Hash)> admin_users_list_with_http_info(token, team_id, opts)

```ruby
begin
  
  data, status_code, headers = api_instance.admin_users_list_with_http_info(token, team_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <DefaultSuccessTemplate>
rescue slack::ApiError => e
  puts "Error when calling AdminUsersApi->admin_users_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;admin.users:read&#x60; |  |
| **team_id** | **String** | The ID (&#x60;T1234&#x60;) of the workspace. |  |
| **cursor** | **String** | Set &#x60;cursor&#x60; to &#x60;next_cursor&#x60; returned by the previous call to list items in the next page. | [optional] |
| **limit** | **Integer** | Limit for how many users to be retrieved per page | [optional] |

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## admin_users_remove

> <DefaultSuccessTemplate> admin_users_remove(token, team_id, user_id)



Remove a user from a workspace.

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::AdminUsersApi.new
token = 'token_example' # String | Authentication token. Requires scope: `admin.users:write`
team_id = 'team_id_example' # String | The ID (`T1234`) of the workspace.
user_id = 'user_id_example' # String | The ID of the user to remove.

begin
  
  result = api_instance.admin_users_remove(token, team_id, user_id)
  p result
rescue slack::ApiError => e
  puts "Error when calling AdminUsersApi->admin_users_remove: #{e}"
end
```

#### Using the admin_users_remove_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<DefaultSuccessTemplate>, Integer, Hash)> admin_users_remove_with_http_info(token, team_id, user_id)

```ruby
begin
  
  data, status_code, headers = api_instance.admin_users_remove_with_http_info(token, team_id, user_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <DefaultSuccessTemplate>
rescue slack::ApiError => e
  puts "Error when calling AdminUsersApi->admin_users_remove_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;admin.users:write&#x60; |  |
| **team_id** | **String** | The ID (&#x60;T1234&#x60;) of the workspace. |  |
| **user_id** | **String** | The ID of the user to remove. |  |

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json


## admin_users_set_admin

> <DefaultSuccessTemplate> admin_users_set_admin(token, team_id, user_id)



Set an existing guest, regular user, or owner to be an admin user.

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::AdminUsersApi.new
token = 'token_example' # String | Authentication token. Requires scope: `admin.users:write`
team_id = 'team_id_example' # String | The ID (`T1234`) of the workspace.
user_id = 'user_id_example' # String | The ID of the user to designate as an admin.

begin
  
  result = api_instance.admin_users_set_admin(token, team_id, user_id)
  p result
rescue slack::ApiError => e
  puts "Error when calling AdminUsersApi->admin_users_set_admin: #{e}"
end
```

#### Using the admin_users_set_admin_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<DefaultSuccessTemplate>, Integer, Hash)> admin_users_set_admin_with_http_info(token, team_id, user_id)

```ruby
begin
  
  data, status_code, headers = api_instance.admin_users_set_admin_with_http_info(token, team_id, user_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <DefaultSuccessTemplate>
rescue slack::ApiError => e
  puts "Error when calling AdminUsersApi->admin_users_set_admin_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;admin.users:write&#x60; |  |
| **team_id** | **String** | The ID (&#x60;T1234&#x60;) of the workspace. |  |
| **user_id** | **String** | The ID of the user to designate as an admin. |  |

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json


## admin_users_set_expiration

> <DefaultSuccessTemplate> admin_users_set_expiration(token, expiration_ts, team_id, user_id)



Set an expiration for a guest user

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::AdminUsersApi.new
token = 'token_example' # String | Authentication token. Requires scope: `admin.users:write`
expiration_ts = 56 # Integer | Timestamp when guest account should be disabled.
team_id = 'team_id_example' # String | The ID (`T1234`) of the workspace.
user_id = 'user_id_example' # String | The ID of the user to set an expiration for.

begin
  
  result = api_instance.admin_users_set_expiration(token, expiration_ts, team_id, user_id)
  p result
rescue slack::ApiError => e
  puts "Error when calling AdminUsersApi->admin_users_set_expiration: #{e}"
end
```

#### Using the admin_users_set_expiration_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<DefaultSuccessTemplate>, Integer, Hash)> admin_users_set_expiration_with_http_info(token, expiration_ts, team_id, user_id)

```ruby
begin
  
  data, status_code, headers = api_instance.admin_users_set_expiration_with_http_info(token, expiration_ts, team_id, user_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <DefaultSuccessTemplate>
rescue slack::ApiError => e
  puts "Error when calling AdminUsersApi->admin_users_set_expiration_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;admin.users:write&#x60; |  |
| **expiration_ts** | **Integer** | Timestamp when guest account should be disabled. |  |
| **team_id** | **String** | The ID (&#x60;T1234&#x60;) of the workspace. |  |
| **user_id** | **String** | The ID of the user to set an expiration for. |  |

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json


## admin_users_set_owner

> <DefaultSuccessTemplate> admin_users_set_owner(token, team_id, user_id)



Set an existing guest, regular user, or admin user to be a workspace owner.

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::AdminUsersApi.new
token = 'token_example' # String | Authentication token. Requires scope: `admin.users:write`
team_id = 'team_id_example' # String | The ID (`T1234`) of the workspace.
user_id = 'user_id_example' # String | Id of the user to promote to owner.

begin
  
  result = api_instance.admin_users_set_owner(token, team_id, user_id)
  p result
rescue slack::ApiError => e
  puts "Error when calling AdminUsersApi->admin_users_set_owner: #{e}"
end
```

#### Using the admin_users_set_owner_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<DefaultSuccessTemplate>, Integer, Hash)> admin_users_set_owner_with_http_info(token, team_id, user_id)

```ruby
begin
  
  data, status_code, headers = api_instance.admin_users_set_owner_with_http_info(token, team_id, user_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <DefaultSuccessTemplate>
rescue slack::ApiError => e
  puts "Error when calling AdminUsersApi->admin_users_set_owner_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;admin.users:write&#x60; |  |
| **team_id** | **String** | The ID (&#x60;T1234&#x60;) of the workspace. |  |
| **user_id** | **String** | Id of the user to promote to owner. |  |

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json


## admin_users_set_regular

> <DefaultSuccessTemplate> admin_users_set_regular(token, team_id, user_id)



Set an existing guest user, admin user, or owner to be a regular user.

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::AdminUsersApi.new
token = 'token_example' # String | Authentication token. Requires scope: `admin.users:write`
team_id = 'team_id_example' # String | The ID (`T1234`) of the workspace.
user_id = 'user_id_example' # String | The ID of the user to designate as a regular user.

begin
  
  result = api_instance.admin_users_set_regular(token, team_id, user_id)
  p result
rescue slack::ApiError => e
  puts "Error when calling AdminUsersApi->admin_users_set_regular: #{e}"
end
```

#### Using the admin_users_set_regular_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<DefaultSuccessTemplate>, Integer, Hash)> admin_users_set_regular_with_http_info(token, team_id, user_id)

```ruby
begin
  
  data, status_code, headers = api_instance.admin_users_set_regular_with_http_info(token, team_id, user_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <DefaultSuccessTemplate>
rescue slack::ApiError => e
  puts "Error when calling AdminUsersApi->admin_users_set_regular_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;admin.users:write&#x60; |  |
| **team_id** | **String** | The ID (&#x60;T1234&#x60;) of the workspace. |  |
| **user_id** | **String** | The ID of the user to designate as a regular user. |  |

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json

