# slack::AdminApi

All URIs are relative to *https://slack.com/api*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**admin_apps_approve**](AdminApi.md#admin_apps_approve) | **POST** /admin.apps.approve |  |
| [**admin_apps_approved_list**](AdminApi.md#admin_apps_approved_list) | **GET** /admin.apps.approved.list |  |
| [**admin_apps_requests_list**](AdminApi.md#admin_apps_requests_list) | **GET** /admin.apps.requests.list |  |
| [**admin_apps_restrict**](AdminApi.md#admin_apps_restrict) | **POST** /admin.apps.restrict |  |
| [**admin_apps_restricted_list**](AdminApi.md#admin_apps_restricted_list) | **GET** /admin.apps.restricted.list |  |
| [**admin_conversations_archive**](AdminApi.md#admin_conversations_archive) | **POST** /admin.conversations.archive |  |
| [**admin_conversations_convert_to_private**](AdminApi.md#admin_conversations_convert_to_private) | **POST** /admin.conversations.convertToPrivate |  |
| [**admin_conversations_create**](AdminApi.md#admin_conversations_create) | **POST** /admin.conversations.create |  |
| [**admin_conversations_delete**](AdminApi.md#admin_conversations_delete) | **POST** /admin.conversations.delete |  |
| [**admin_conversations_disconnect_shared**](AdminApi.md#admin_conversations_disconnect_shared) | **POST** /admin.conversations.disconnectShared |  |
| [**admin_conversations_ekm_list_original_connected_channel_info**](AdminApi.md#admin_conversations_ekm_list_original_connected_channel_info) | **GET** /admin.conversations.ekm.listOriginalConnectedChannelInfo |  |
| [**admin_conversations_get_conversation_prefs**](AdminApi.md#admin_conversations_get_conversation_prefs) | **GET** /admin.conversations.getConversationPrefs |  |
| [**admin_conversations_get_teams**](AdminApi.md#admin_conversations_get_teams) | **GET** /admin.conversations.getTeams |  |
| [**admin_conversations_invite**](AdminApi.md#admin_conversations_invite) | **POST** /admin.conversations.invite |  |
| [**admin_conversations_rename**](AdminApi.md#admin_conversations_rename) | **POST** /admin.conversations.rename |  |
| [**admin_conversations_restrict_access_add_group**](AdminApi.md#admin_conversations_restrict_access_add_group) | **POST** /admin.conversations.restrictAccess.addGroup |  |
| [**admin_conversations_restrict_access_list_groups**](AdminApi.md#admin_conversations_restrict_access_list_groups) | **GET** /admin.conversations.restrictAccess.listGroups |  |
| [**admin_conversations_restrict_access_remove_group**](AdminApi.md#admin_conversations_restrict_access_remove_group) | **POST** /admin.conversations.restrictAccess.removeGroup |  |
| [**admin_conversations_search**](AdminApi.md#admin_conversations_search) | **GET** /admin.conversations.search |  |
| [**admin_conversations_set_conversation_prefs**](AdminApi.md#admin_conversations_set_conversation_prefs) | **POST** /admin.conversations.setConversationPrefs |  |
| [**admin_conversations_set_teams**](AdminApi.md#admin_conversations_set_teams) | **POST** /admin.conversations.setTeams |  |
| [**admin_conversations_unarchive**](AdminApi.md#admin_conversations_unarchive) | **POST** /admin.conversations.unarchive |  |
| [**admin_emoji_add**](AdminApi.md#admin_emoji_add) | **POST** /admin.emoji.add |  |
| [**admin_emoji_add_alias**](AdminApi.md#admin_emoji_add_alias) | **POST** /admin.emoji.addAlias |  |
| [**admin_emoji_list**](AdminApi.md#admin_emoji_list) | **GET** /admin.emoji.list |  |
| [**admin_emoji_remove**](AdminApi.md#admin_emoji_remove) | **POST** /admin.emoji.remove |  |
| [**admin_emoji_rename**](AdminApi.md#admin_emoji_rename) | **POST** /admin.emoji.rename |  |
| [**admin_invite_requests_approve**](AdminApi.md#admin_invite_requests_approve) | **POST** /admin.inviteRequests.approve |  |
| [**admin_invite_requests_approved_list**](AdminApi.md#admin_invite_requests_approved_list) | **GET** /admin.inviteRequests.approved.list |  |
| [**admin_invite_requests_denied_list**](AdminApi.md#admin_invite_requests_denied_list) | **GET** /admin.inviteRequests.denied.list |  |
| [**admin_invite_requests_deny**](AdminApi.md#admin_invite_requests_deny) | **POST** /admin.inviteRequests.deny |  |
| [**admin_invite_requests_list**](AdminApi.md#admin_invite_requests_list) | **GET** /admin.inviteRequests.list |  |
| [**admin_teams_admins_list**](AdminApi.md#admin_teams_admins_list) | **GET** /admin.teams.admins.list |  |
| [**admin_teams_create**](AdminApi.md#admin_teams_create) | **POST** /admin.teams.create |  |
| [**admin_teams_list**](AdminApi.md#admin_teams_list) | **GET** /admin.teams.list |  |
| [**admin_teams_owners_list**](AdminApi.md#admin_teams_owners_list) | **GET** /admin.teams.owners.list |  |
| [**admin_teams_settings_info**](AdminApi.md#admin_teams_settings_info) | **GET** /admin.teams.settings.info |  |
| [**admin_teams_settings_set_default_channels**](AdminApi.md#admin_teams_settings_set_default_channels) | **POST** /admin.teams.settings.setDefaultChannels |  |
| [**admin_teams_settings_set_description**](AdminApi.md#admin_teams_settings_set_description) | **POST** /admin.teams.settings.setDescription |  |
| [**admin_teams_settings_set_discoverability**](AdminApi.md#admin_teams_settings_set_discoverability) | **POST** /admin.teams.settings.setDiscoverability |  |
| [**admin_teams_settings_set_icon**](AdminApi.md#admin_teams_settings_set_icon) | **POST** /admin.teams.settings.setIcon |  |
| [**admin_teams_settings_set_name**](AdminApi.md#admin_teams_settings_set_name) | **POST** /admin.teams.settings.setName |  |
| [**admin_usergroups_add_channels**](AdminApi.md#admin_usergroups_add_channels) | **POST** /admin.usergroups.addChannels |  |
| [**admin_usergroups_add_teams**](AdminApi.md#admin_usergroups_add_teams) | **POST** /admin.usergroups.addTeams |  |
| [**admin_usergroups_list_channels**](AdminApi.md#admin_usergroups_list_channels) | **GET** /admin.usergroups.listChannels |  |
| [**admin_usergroups_remove_channels**](AdminApi.md#admin_usergroups_remove_channels) | **POST** /admin.usergroups.removeChannels |  |
| [**admin_users_assign**](AdminApi.md#admin_users_assign) | **POST** /admin.users.assign |  |
| [**admin_users_invite**](AdminApi.md#admin_users_invite) | **POST** /admin.users.invite |  |
| [**admin_users_list**](AdminApi.md#admin_users_list) | **GET** /admin.users.list |  |
| [**admin_users_remove**](AdminApi.md#admin_users_remove) | **POST** /admin.users.remove |  |
| [**admin_users_session_invalidate**](AdminApi.md#admin_users_session_invalidate) | **POST** /admin.users.session.invalidate |  |
| [**admin_users_session_reset**](AdminApi.md#admin_users_session_reset) | **POST** /admin.users.session.reset |  |
| [**admin_users_set_admin**](AdminApi.md#admin_users_set_admin) | **POST** /admin.users.setAdmin |  |
| [**admin_users_set_expiration**](AdminApi.md#admin_users_set_expiration) | **POST** /admin.users.setExpiration |  |
| [**admin_users_set_owner**](AdminApi.md#admin_users_set_owner) | **POST** /admin.users.setOwner |  |
| [**admin_users_set_regular**](AdminApi.md#admin_users_set_regular) | **POST** /admin.users.setRegular |  |


## admin_apps_approve

> <DefaultSuccessTemplate> admin_apps_approve(token, opts)



Approve an app for installation on a workspace.

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::AdminApi.new
token = 'token_example' # String | Authentication token. Requires scope: `admin.apps:write`
opts = {
  app_id: 'app_id_example', # String | The id of the app to approve.
  request_id: 'request_id_example', # String | The id of the request to approve.
  team_id: 'team_id_example' # String | 
}

begin
  
  result = api_instance.admin_apps_approve(token, opts)
  p result
rescue slack::ApiError => e
  puts "Error when calling AdminApi->admin_apps_approve: #{e}"
end
```

#### Using the admin_apps_approve_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<DefaultSuccessTemplate>, Integer, Hash)> admin_apps_approve_with_http_info(token, opts)

```ruby
begin
  
  data, status_code, headers = api_instance.admin_apps_approve_with_http_info(token, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <DefaultSuccessTemplate>
rescue slack::ApiError => e
  puts "Error when calling AdminApi->admin_apps_approve_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;admin.apps:write&#x60; |  |
| **app_id** | **String** | The id of the app to approve. | [optional] |
| **request_id** | **String** | The id of the request to approve. | [optional] |
| **team_id** | **String** |  | [optional] |

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json


## admin_apps_approved_list

> <DefaultSuccessTemplate> admin_apps_approved_list(token, opts)



List approved apps for an org or workspace.

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::AdminApi.new
token = 'token_example' # String | Authentication token. Requires scope: `admin.apps:read`
opts = {
  limit: 56, # Integer | The maximum number of items to return. Must be between 1 - 1000 both inclusive.
  cursor: 'cursor_example', # String | Set `cursor` to `next_cursor` returned by the previous call to list items in the next page
  team_id: 'team_id_example', # String | 
  enterprise_id: 'enterprise_id_example' # String | 
}

begin
  
  result = api_instance.admin_apps_approved_list(token, opts)
  p result
rescue slack::ApiError => e
  puts "Error when calling AdminApi->admin_apps_approved_list: #{e}"
end
```

#### Using the admin_apps_approved_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<DefaultSuccessTemplate>, Integer, Hash)> admin_apps_approved_list_with_http_info(token, opts)

```ruby
begin
  
  data, status_code, headers = api_instance.admin_apps_approved_list_with_http_info(token, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <DefaultSuccessTemplate>
rescue slack::ApiError => e
  puts "Error when calling AdminApi->admin_apps_approved_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;admin.apps:read&#x60; |  |
| **limit** | **Integer** | The maximum number of items to return. Must be between 1 - 1000 both inclusive. | [optional] |
| **cursor** | **String** | Set &#x60;cursor&#x60; to &#x60;next_cursor&#x60; returned by the previous call to list items in the next page | [optional] |
| **team_id** | **String** |  | [optional] |
| **enterprise_id** | **String** |  | [optional] |

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## admin_apps_requests_list

> <DefaultSuccessTemplate> admin_apps_requests_list(token, opts)



List app requests for a team/workspace.

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::AdminApi.new
token = 'token_example' # String | Authentication token. Requires scope: `admin.apps:read`
opts = {
  limit: 56, # Integer | The maximum number of items to return. Must be between 1 - 1000 both inclusive.
  cursor: 'cursor_example', # String | Set `cursor` to `next_cursor` returned by the previous call to list items in the next page
  team_id: 'team_id_example' # String | 
}

begin
  
  result = api_instance.admin_apps_requests_list(token, opts)
  p result
rescue slack::ApiError => e
  puts "Error when calling AdminApi->admin_apps_requests_list: #{e}"
end
```

#### Using the admin_apps_requests_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<DefaultSuccessTemplate>, Integer, Hash)> admin_apps_requests_list_with_http_info(token, opts)

```ruby
begin
  
  data, status_code, headers = api_instance.admin_apps_requests_list_with_http_info(token, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <DefaultSuccessTemplate>
rescue slack::ApiError => e
  puts "Error when calling AdminApi->admin_apps_requests_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;admin.apps:read&#x60; |  |
| **limit** | **Integer** | The maximum number of items to return. Must be between 1 - 1000 both inclusive. | [optional] |
| **cursor** | **String** | Set &#x60;cursor&#x60; to &#x60;next_cursor&#x60; returned by the previous call to list items in the next page | [optional] |
| **team_id** | **String** |  | [optional] |

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## admin_apps_restrict

> <DefaultSuccessTemplate> admin_apps_restrict(token, opts)



Restrict an app for installation on a workspace.

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::AdminApi.new
token = 'token_example' # String | Authentication token. Requires scope: `admin.apps:write`
opts = {
  app_id: 'app_id_example', # String | The id of the app to restrict.
  request_id: 'request_id_example', # String | The id of the request to restrict.
  team_id: 'team_id_example' # String | 
}

begin
  
  result = api_instance.admin_apps_restrict(token, opts)
  p result
rescue slack::ApiError => e
  puts "Error when calling AdminApi->admin_apps_restrict: #{e}"
end
```

#### Using the admin_apps_restrict_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<DefaultSuccessTemplate>, Integer, Hash)> admin_apps_restrict_with_http_info(token, opts)

```ruby
begin
  
  data, status_code, headers = api_instance.admin_apps_restrict_with_http_info(token, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <DefaultSuccessTemplate>
rescue slack::ApiError => e
  puts "Error when calling AdminApi->admin_apps_restrict_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;admin.apps:write&#x60; |  |
| **app_id** | **String** | The id of the app to restrict. | [optional] |
| **request_id** | **String** | The id of the request to restrict. | [optional] |
| **team_id** | **String** |  | [optional] |

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json


## admin_apps_restricted_list

> <DefaultSuccessTemplate> admin_apps_restricted_list(token, opts)



List restricted apps for an org or workspace.

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::AdminApi.new
token = 'token_example' # String | Authentication token. Requires scope: `admin.apps:read`
opts = {
  limit: 56, # Integer | The maximum number of items to return. Must be between 1 - 1000 both inclusive.
  cursor: 'cursor_example', # String | Set `cursor` to `next_cursor` returned by the previous call to list items in the next page
  team_id: 'team_id_example', # String | 
  enterprise_id: 'enterprise_id_example' # String | 
}

begin
  
  result = api_instance.admin_apps_restricted_list(token, opts)
  p result
rescue slack::ApiError => e
  puts "Error when calling AdminApi->admin_apps_restricted_list: #{e}"
end
```

#### Using the admin_apps_restricted_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<DefaultSuccessTemplate>, Integer, Hash)> admin_apps_restricted_list_with_http_info(token, opts)

```ruby
begin
  
  data, status_code, headers = api_instance.admin_apps_restricted_list_with_http_info(token, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <DefaultSuccessTemplate>
rescue slack::ApiError => e
  puts "Error when calling AdminApi->admin_apps_restricted_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;admin.apps:read&#x60; |  |
| **limit** | **Integer** | The maximum number of items to return. Must be between 1 - 1000 both inclusive. | [optional] |
| **cursor** | **String** | Set &#x60;cursor&#x60; to &#x60;next_cursor&#x60; returned by the previous call to list items in the next page | [optional] |
| **team_id** | **String** |  | [optional] |
| **enterprise_id** | **String** |  | [optional] |

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## admin_conversations_archive

> <AdminConversationsArchiveSchema> admin_conversations_archive(token, channel_id)



Archive a public or private channel.

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::AdminApi.new
token = 'token_example' # String | Authentication token. Requires scope: `admin.conversations:write`
channel_id = 'channel_id_example' # String | The channel to archive.

begin
  
  result = api_instance.admin_conversations_archive(token, channel_id)
  p result
rescue slack::ApiError => e
  puts "Error when calling AdminApi->admin_conversations_archive: #{e}"
end
```

#### Using the admin_conversations_archive_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<AdminConversationsArchiveSchema>, Integer, Hash)> admin_conversations_archive_with_http_info(token, channel_id)

```ruby
begin
  
  data, status_code, headers = api_instance.admin_conversations_archive_with_http_info(token, channel_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <AdminConversationsArchiveSchema>
rescue slack::ApiError => e
  puts "Error when calling AdminApi->admin_conversations_archive_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;admin.conversations:write&#x60; |  |
| **channel_id** | **String** | The channel to archive. |  |

### Return type

[**AdminConversationsArchiveSchema**](AdminConversationsArchiveSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json


## admin_conversations_convert_to_private

> <AdminConversationsConvertToPrivateSchema> admin_conversations_convert_to_private(token, channel_id)



Convert a public channel to a private channel.

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::AdminApi.new
token = 'token_example' # String | Authentication token. Requires scope: `admin.conversations:write`
channel_id = 'channel_id_example' # String | The channel to convert to private.

begin
  
  result = api_instance.admin_conversations_convert_to_private(token, channel_id)
  p result
rescue slack::ApiError => e
  puts "Error when calling AdminApi->admin_conversations_convert_to_private: #{e}"
end
```

#### Using the admin_conversations_convert_to_private_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<AdminConversationsConvertToPrivateSchema>, Integer, Hash)> admin_conversations_convert_to_private_with_http_info(token, channel_id)

```ruby
begin
  
  data, status_code, headers = api_instance.admin_conversations_convert_to_private_with_http_info(token, channel_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <AdminConversationsConvertToPrivateSchema>
rescue slack::ApiError => e
  puts "Error when calling AdminApi->admin_conversations_convert_to_private_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;admin.conversations:write&#x60; |  |
| **channel_id** | **String** | The channel to convert to private. |  |

### Return type

[**AdminConversationsConvertToPrivateSchema**](AdminConversationsConvertToPrivateSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json


## admin_conversations_create

> <AdminConversationsCreateSchema> admin_conversations_create(token, is_private, name, opts)



Create a public or private channel-based conversation.

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::AdminApi.new
token = 'token_example' # String | Authentication token. Requires scope: `admin.conversations:write`
is_private = true # Boolean | When `true`, creates a private channel instead of a public channel
name = 'name_example' # String | Name of the public or private channel to create.
opts = {
  description: 'description_example', # String | Description of the public or private channel to create.
  org_wide: true, # Boolean | When `true`, the channel will be available org-wide. Note: if the channel is not `org_wide=true`, you must specify a `team_id` for this channel
  team_id: 'team_id_example' # String | The workspace to create the channel in. Note: this argument is required unless you set `org_wide=true`.
}

begin
  
  result = api_instance.admin_conversations_create(token, is_private, name, opts)
  p result
rescue slack::ApiError => e
  puts "Error when calling AdminApi->admin_conversations_create: #{e}"
end
```

#### Using the admin_conversations_create_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<AdminConversationsCreateSchema>, Integer, Hash)> admin_conversations_create_with_http_info(token, is_private, name, opts)

```ruby
begin
  
  data, status_code, headers = api_instance.admin_conversations_create_with_http_info(token, is_private, name, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <AdminConversationsCreateSchema>
rescue slack::ApiError => e
  puts "Error when calling AdminApi->admin_conversations_create_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;admin.conversations:write&#x60; |  |
| **is_private** | **Boolean** | When &#x60;true&#x60;, creates a private channel instead of a public channel |  |
| **name** | **String** | Name of the public or private channel to create. |  |
| **description** | **String** | Description of the public or private channel to create. | [optional] |
| **org_wide** | **Boolean** | When &#x60;true&#x60;, the channel will be available org-wide. Note: if the channel is not &#x60;org_wide&#x3D;true&#x60;, you must specify a &#x60;team_id&#x60; for this channel | [optional] |
| **team_id** | **String** | The workspace to create the channel in. Note: this argument is required unless you set &#x60;org_wide&#x3D;true&#x60;. | [optional] |

### Return type

[**AdminConversationsCreateSchema**](AdminConversationsCreateSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json


## admin_conversations_delete

> <AdminConversationsDeleteSchema> admin_conversations_delete(token, channel_id)



Delete a public or private channel.

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::AdminApi.new
token = 'token_example' # String | Authentication token. Requires scope: `admin.conversations:write`
channel_id = 'channel_id_example' # String | The channel to delete.

begin
  
  result = api_instance.admin_conversations_delete(token, channel_id)
  p result
rescue slack::ApiError => e
  puts "Error when calling AdminApi->admin_conversations_delete: #{e}"
end
```

#### Using the admin_conversations_delete_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<AdminConversationsDeleteSchema>, Integer, Hash)> admin_conversations_delete_with_http_info(token, channel_id)

```ruby
begin
  
  data, status_code, headers = api_instance.admin_conversations_delete_with_http_info(token, channel_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <AdminConversationsDeleteSchema>
rescue slack::ApiError => e
  puts "Error when calling AdminApi->admin_conversations_delete_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;admin.conversations:write&#x60; |  |
| **channel_id** | **String** | The channel to delete. |  |

### Return type

[**AdminConversationsDeleteSchema**](AdminConversationsDeleteSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json


## admin_conversations_disconnect_shared

> <AdminConversationsRenameSchema> admin_conversations_disconnect_shared(token, channel_id, opts)



Disconnect a connected channel from one or more workspaces.

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::AdminApi.new
token = 'token_example' # String | Authentication token. Requires scope: `admin.conversations:write`
channel_id = 'channel_id_example' # String | The channel to be disconnected from some workspaces.
opts = {
  leaving_team_ids: 'leaving_team_ids_example' # String | The team to be removed from the channel. Currently only a single team id can be specified.
}

begin
  
  result = api_instance.admin_conversations_disconnect_shared(token, channel_id, opts)
  p result
rescue slack::ApiError => e
  puts "Error when calling AdminApi->admin_conversations_disconnect_shared: #{e}"
end
```

#### Using the admin_conversations_disconnect_shared_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<AdminConversationsRenameSchema>, Integer, Hash)> admin_conversations_disconnect_shared_with_http_info(token, channel_id, opts)

```ruby
begin
  
  data, status_code, headers = api_instance.admin_conversations_disconnect_shared_with_http_info(token, channel_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <AdminConversationsRenameSchema>
rescue slack::ApiError => e
  puts "Error when calling AdminApi->admin_conversations_disconnect_shared_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;admin.conversations:write&#x60; |  |
| **channel_id** | **String** | The channel to be disconnected from some workspaces. |  |
| **leaving_team_ids** | **String** | The team to be removed from the channel. Currently only a single team id can be specified. | [optional] |

### Return type

[**AdminConversationsRenameSchema**](AdminConversationsRenameSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json


## admin_conversations_ekm_list_original_connected_channel_info

> <DefaultSuccessTemplate> admin_conversations_ekm_list_original_connected_channel_info(token, opts)



List all disconnected channelsâ€”i.e., channels that were once connected to other workspaces and then disconnectedâ€”and the corresponding original channel IDs for key revocation with EKM.

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::AdminApi.new
token = 'token_example' # String | Authentication token. Requires scope: `admin.conversations:read`
opts = {
  channel_ids: 'channel_ids_example', # String | A comma-separated list of channels to filter to.
  team_ids: 'team_ids_example', # String | A comma-separated list of the workspaces to which the channels you would like returned belong.
  limit: 56, # Integer | The maximum number of items to return. Must be between 1 - 1000 both inclusive.
  cursor: 'cursor_example' # String | Set `cursor` to `next_cursor` returned by the previous call to list items in the next page.
}

begin
  
  result = api_instance.admin_conversations_ekm_list_original_connected_channel_info(token, opts)
  p result
rescue slack::ApiError => e
  puts "Error when calling AdminApi->admin_conversations_ekm_list_original_connected_channel_info: #{e}"
end
```

#### Using the admin_conversations_ekm_list_original_connected_channel_info_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<DefaultSuccessTemplate>, Integer, Hash)> admin_conversations_ekm_list_original_connected_channel_info_with_http_info(token, opts)

```ruby
begin
  
  data, status_code, headers = api_instance.admin_conversations_ekm_list_original_connected_channel_info_with_http_info(token, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <DefaultSuccessTemplate>
rescue slack::ApiError => e
  puts "Error when calling AdminApi->admin_conversations_ekm_list_original_connected_channel_info_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;admin.conversations:read&#x60; |  |
| **channel_ids** | **String** | A comma-separated list of channels to filter to. | [optional] |
| **team_ids** | **String** | A comma-separated list of the workspaces to which the channels you would like returned belong. | [optional] |
| **limit** | **Integer** | The maximum number of items to return. Must be between 1 - 1000 both inclusive. | [optional] |
| **cursor** | **String** | Set &#x60;cursor&#x60; to &#x60;next_cursor&#x60; returned by the previous call to list items in the next page. | [optional] |

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## admin_conversations_get_conversation_prefs

> <AdminConversationsGetConversationPrefsSchema> admin_conversations_get_conversation_prefs(token, channel_id)



Get conversation preferences for a public or private channel.

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::AdminApi.new
token = 'token_example' # String | Authentication token. Requires scope: `admin.conversations:read`
channel_id = 'channel_id_example' # String | The channel to get preferences for.

begin
  
  result = api_instance.admin_conversations_get_conversation_prefs(token, channel_id)
  p result
rescue slack::ApiError => e
  puts "Error when calling AdminApi->admin_conversations_get_conversation_prefs: #{e}"
end
```

#### Using the admin_conversations_get_conversation_prefs_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<AdminConversationsGetConversationPrefsSchema>, Integer, Hash)> admin_conversations_get_conversation_prefs_with_http_info(token, channel_id)

```ruby
begin
  
  data, status_code, headers = api_instance.admin_conversations_get_conversation_prefs_with_http_info(token, channel_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <AdminConversationsGetConversationPrefsSchema>
rescue slack::ApiError => e
  puts "Error when calling AdminApi->admin_conversations_get_conversation_prefs_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;admin.conversations:read&#x60; |  |
| **channel_id** | **String** | The channel to get preferences for. |  |

### Return type

[**AdminConversationsGetConversationPrefsSchema**](AdminConversationsGetConversationPrefsSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## admin_conversations_get_teams

> <AdminConversationsGetTeamsSchema> admin_conversations_get_teams(token, channel_id, opts)



Get all the workspaces a given public or private channel is connected to within this Enterprise org.

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::AdminApi.new
token = 'token_example' # String | Authentication token. Requires scope: `admin.conversations:read`
channel_id = 'channel_id_example' # String | The channel to determine connected workspaces within the organization for.
opts = {
  cursor: 'cursor_example', # String | Set `cursor` to `next_cursor` returned by the previous call to list items in the next page
  limit: 56 # Integer | The maximum number of items to return. Must be between 1 - 1000 both inclusive.
}

begin
  
  result = api_instance.admin_conversations_get_teams(token, channel_id, opts)
  p result
rescue slack::ApiError => e
  puts "Error when calling AdminApi->admin_conversations_get_teams: #{e}"
end
```

#### Using the admin_conversations_get_teams_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<AdminConversationsGetTeamsSchema>, Integer, Hash)> admin_conversations_get_teams_with_http_info(token, channel_id, opts)

```ruby
begin
  
  data, status_code, headers = api_instance.admin_conversations_get_teams_with_http_info(token, channel_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <AdminConversationsGetTeamsSchema>
rescue slack::ApiError => e
  puts "Error when calling AdminApi->admin_conversations_get_teams_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;admin.conversations:read&#x60; |  |
| **channel_id** | **String** | The channel to determine connected workspaces within the organization for. |  |
| **cursor** | **String** | Set &#x60;cursor&#x60; to &#x60;next_cursor&#x60; returned by the previous call to list items in the next page | [optional] |
| **limit** | **Integer** | The maximum number of items to return. Must be between 1 - 1000 both inclusive. | [optional] |

### Return type

[**AdminConversationsGetTeamsSchema**](AdminConversationsGetTeamsSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## admin_conversations_invite

> <AdminConversationsInviteSchema> admin_conversations_invite(token, channel_id, user_ids)



Invite a user to a public or private channel.

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::AdminApi.new
token = 'token_example' # String | Authentication token. Requires scope: `admin.conversations:write`
channel_id = 'channel_id_example' # String | The channel that the users will be invited to.
user_ids = 'user_ids_example' # String | The users to invite.

begin
  
  result = api_instance.admin_conversations_invite(token, channel_id, user_ids)
  p result
rescue slack::ApiError => e
  puts "Error when calling AdminApi->admin_conversations_invite: #{e}"
end
```

#### Using the admin_conversations_invite_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<AdminConversationsInviteSchema>, Integer, Hash)> admin_conversations_invite_with_http_info(token, channel_id, user_ids)

```ruby
begin
  
  data, status_code, headers = api_instance.admin_conversations_invite_with_http_info(token, channel_id, user_ids)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <AdminConversationsInviteSchema>
rescue slack::ApiError => e
  puts "Error when calling AdminApi->admin_conversations_invite_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;admin.conversations:write&#x60; |  |
| **channel_id** | **String** | The channel that the users will be invited to. |  |
| **user_ids** | **String** | The users to invite. |  |

### Return type

[**AdminConversationsInviteSchema**](AdminConversationsInviteSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json


## admin_conversations_rename

> <AdminConversationsRenameSchema1> admin_conversations_rename(token, channel_id, name)



Rename a public or private channel.

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::AdminApi.new
token = 'token_example' # String | Authentication token. Requires scope: `admin.conversations:write`
channel_id = 'channel_id_example' # String | The channel to rename.
name = 'name_example' # String | 

begin
  
  result = api_instance.admin_conversations_rename(token, channel_id, name)
  p result
rescue slack::ApiError => e
  puts "Error when calling AdminApi->admin_conversations_rename: #{e}"
end
```

#### Using the admin_conversations_rename_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<AdminConversationsRenameSchema1>, Integer, Hash)> admin_conversations_rename_with_http_info(token, channel_id, name)

```ruby
begin
  
  data, status_code, headers = api_instance.admin_conversations_rename_with_http_info(token, channel_id, name)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <AdminConversationsRenameSchema1>
rescue slack::ApiError => e
  puts "Error when calling AdminApi->admin_conversations_rename_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;admin.conversations:write&#x60; |  |
| **channel_id** | **String** | The channel to rename. |  |
| **name** | **String** |  |  |

### Return type

[**AdminConversationsRenameSchema1**](AdminConversationsRenameSchema1.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json


## admin_conversations_restrict_access_add_group

> <DefaultSuccessTemplate> admin_conversations_restrict_access_add_group(channel_id, group_id, token, opts)



Add an allowlist of IDP groups for accessing a channel

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::AdminApi.new
channel_id = 'channel_id_example' # String | The channel to link this group to.
group_id = 'group_id_example' # String | The [IDP Group](https://slack.com/help/articles/115001435788-Connect-identity-provider-groups-to-your-Enterprise-Grid-org) ID to be an allowlist for the private channel.
token = 'token_example' # String | Authentication token. Requires scope: `admin.conversations:write`
opts = {
  team_id: 'team_id_example' # String | The workspace where the channel exists. This argument is required for channels only tied to one workspace, and optional for channels that are shared across an organization.
}

begin
  
  result = api_instance.admin_conversations_restrict_access_add_group(channel_id, group_id, token, opts)
  p result
rescue slack::ApiError => e
  puts "Error when calling AdminApi->admin_conversations_restrict_access_add_group: #{e}"
end
```

#### Using the admin_conversations_restrict_access_add_group_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<DefaultSuccessTemplate>, Integer, Hash)> admin_conversations_restrict_access_add_group_with_http_info(channel_id, group_id, token, opts)

```ruby
begin
  
  data, status_code, headers = api_instance.admin_conversations_restrict_access_add_group_with_http_info(channel_id, group_id, token, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <DefaultSuccessTemplate>
rescue slack::ApiError => e
  puts "Error when calling AdminApi->admin_conversations_restrict_access_add_group_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **channel_id** | **String** | The channel to link this group to. |  |
| **group_id** | **String** | The [IDP Group](https://slack.com/help/articles/115001435788-Connect-identity-provider-groups-to-your-Enterprise-Grid-org) ID to be an allowlist for the private channel. |  |
| **token** | **String** | Authentication token. Requires scope: &#x60;admin.conversations:write&#x60; |  |
| **team_id** | **String** | The workspace where the channel exists. This argument is required for channels only tied to one workspace, and optional for channels that are shared across an organization. | [optional] |

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json


## admin_conversations_restrict_access_list_groups

> <DefaultSuccessTemplate> admin_conversations_restrict_access_list_groups(token, channel_id, opts)



List all IDP Groups linked to a channel

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::AdminApi.new
token = 'token_example' # String | Authentication token. Requires scope: `admin.conversations:read`
channel_id = 'channel_id_example' # String | 
opts = {
  team_id: 'team_id_example' # String | The workspace where the channel exists. This argument is required for channels only tied to one workspace, and optional for channels that are shared across an organization.
}

begin
  
  result = api_instance.admin_conversations_restrict_access_list_groups(token, channel_id, opts)
  p result
rescue slack::ApiError => e
  puts "Error when calling AdminApi->admin_conversations_restrict_access_list_groups: #{e}"
end
```

#### Using the admin_conversations_restrict_access_list_groups_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<DefaultSuccessTemplate>, Integer, Hash)> admin_conversations_restrict_access_list_groups_with_http_info(token, channel_id, opts)

```ruby
begin
  
  data, status_code, headers = api_instance.admin_conversations_restrict_access_list_groups_with_http_info(token, channel_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <DefaultSuccessTemplate>
rescue slack::ApiError => e
  puts "Error when calling AdminApi->admin_conversations_restrict_access_list_groups_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;admin.conversations:read&#x60; |  |
| **channel_id** | **String** |  |  |
| **team_id** | **String** | The workspace where the channel exists. This argument is required for channels only tied to one workspace, and optional for channels that are shared across an organization. | [optional] |

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## admin_conversations_restrict_access_remove_group

> <DefaultSuccessTemplate> admin_conversations_restrict_access_remove_group(channel_id, group_id, team_id, token)



Remove a linked IDP group linked from a private channel

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::AdminApi.new
channel_id = 'channel_id_example' # String | The channel to remove the linked group from.
group_id = 'group_id_example' # String | The [IDP Group](https://slack.com/help/articles/115001435788-Connect-identity-provider-groups-to-your-Enterprise-Grid-org) ID to remove from the private channel.
team_id = 'team_id_example' # String | The workspace where the channel exists. This argument is required for channels only tied to one workspace, and optional for channels that are shared across an organization.
token = 'token_example' # String | Authentication token. Requires scope: `admin.conversations:write`

begin
  
  result = api_instance.admin_conversations_restrict_access_remove_group(channel_id, group_id, team_id, token)
  p result
rescue slack::ApiError => e
  puts "Error when calling AdminApi->admin_conversations_restrict_access_remove_group: #{e}"
end
```

#### Using the admin_conversations_restrict_access_remove_group_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<DefaultSuccessTemplate>, Integer, Hash)> admin_conversations_restrict_access_remove_group_with_http_info(channel_id, group_id, team_id, token)

```ruby
begin
  
  data, status_code, headers = api_instance.admin_conversations_restrict_access_remove_group_with_http_info(channel_id, group_id, team_id, token)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <DefaultSuccessTemplate>
rescue slack::ApiError => e
  puts "Error when calling AdminApi->admin_conversations_restrict_access_remove_group_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **channel_id** | **String** | The channel to remove the linked group from. |  |
| **group_id** | **String** | The [IDP Group](https://slack.com/help/articles/115001435788-Connect-identity-provider-groups-to-your-Enterprise-Grid-org) ID to remove from the private channel. |  |
| **team_id** | **String** | The workspace where the channel exists. This argument is required for channels only tied to one workspace, and optional for channels that are shared across an organization. |  |
| **token** | **String** | Authentication token. Requires scope: &#x60;admin.conversations:write&#x60; |  |

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json


## admin_conversations_search

> <AdminConversationsSearchSchema> admin_conversations_search(token, opts)



Search for public or private channels in an Enterprise organization.

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::AdminApi.new
token = 'token_example' # String | Authentication token. Requires scope: `admin.conversations:read`
opts = {
  team_ids: 'team_ids_example', # String | Comma separated string of team IDs, signifying the workspaces to search through.
  query: 'query_example', # String | Name of the the channel to query by.
  limit: 56, # Integer | Maximum number of items to be returned. Must be between 1 - 20 both inclusive. Default is 10.
  cursor: 'cursor_example', # String | Set `cursor` to `next_cursor` returned by the previous call to list items in the next page.
  search_channel_types: 'search_channel_types_example', # String | The type of channel to include or exclude in the search. For example `private` will search private channels, while `private_exclude` will exclude them. For a full list of types, check the [Types section](#types).
  sort: 'sort_example', # String | Possible values are `relevant` (search ranking based on what we think is closest), `name` (alphabetical), `member_count` (number of users in the channel), and `created` (date channel was created). You can optionally pair this with the `sort_dir` arg to change how it is sorted 
  sort_dir: 'sort_dir_example' # String | Sort direction. Possible values are `asc` for ascending order like (1, 2, 3) or (a, b, c), and `desc` for descending order like (3, 2, 1) or (c, b, a)
}

begin
  
  result = api_instance.admin_conversations_search(token, opts)
  p result
rescue slack::ApiError => e
  puts "Error when calling AdminApi->admin_conversations_search: #{e}"
end
```

#### Using the admin_conversations_search_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<AdminConversationsSearchSchema>, Integer, Hash)> admin_conversations_search_with_http_info(token, opts)

```ruby
begin
  
  data, status_code, headers = api_instance.admin_conversations_search_with_http_info(token, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <AdminConversationsSearchSchema>
rescue slack::ApiError => e
  puts "Error when calling AdminApi->admin_conversations_search_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;admin.conversations:read&#x60; |  |
| **team_ids** | **String** | Comma separated string of team IDs, signifying the workspaces to search through. | [optional] |
| **query** | **String** | Name of the the channel to query by. | [optional] |
| **limit** | **Integer** | Maximum number of items to be returned. Must be between 1 - 20 both inclusive. Default is 10. | [optional] |
| **cursor** | **String** | Set &#x60;cursor&#x60; to &#x60;next_cursor&#x60; returned by the previous call to list items in the next page. | [optional] |
| **search_channel_types** | **String** | The type of channel to include or exclude in the search. For example &#x60;private&#x60; will search private channels, while &#x60;private_exclude&#x60; will exclude them. For a full list of types, check the [Types section](#types). | [optional] |
| **sort** | **String** | Possible values are &#x60;relevant&#x60; (search ranking based on what we think is closest), &#x60;name&#x60; (alphabetical), &#x60;member_count&#x60; (number of users in the channel), and &#x60;created&#x60; (date channel was created). You can optionally pair this with the &#x60;sort_dir&#x60; arg to change how it is sorted  | [optional] |
| **sort_dir** | **String** | Sort direction. Possible values are &#x60;asc&#x60; for ascending order like (1, 2, 3) or (a, b, c), and &#x60;desc&#x60; for descending order like (3, 2, 1) or (c, b, a) | [optional] |

### Return type

[**AdminConversationsSearchSchema**](AdminConversationsSearchSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## admin_conversations_set_conversation_prefs

> <AdminConversationsSetConversationPrefsSchema> admin_conversations_set_conversation_prefs(token, channel_id, prefs)



Set the posting permissions for a public or private channel.

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::AdminApi.new
token = 'token_example' # String | Authentication token. Requires scope: `admin.conversations:write`
channel_id = 'channel_id_example' # String | The channel to set the prefs for
prefs = 'prefs_example' # String | The prefs for this channel in a stringified JSON format.

begin
  
  result = api_instance.admin_conversations_set_conversation_prefs(token, channel_id, prefs)
  p result
rescue slack::ApiError => e
  puts "Error when calling AdminApi->admin_conversations_set_conversation_prefs: #{e}"
end
```

#### Using the admin_conversations_set_conversation_prefs_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<AdminConversationsSetConversationPrefsSchema>, Integer, Hash)> admin_conversations_set_conversation_prefs_with_http_info(token, channel_id, prefs)

```ruby
begin
  
  data, status_code, headers = api_instance.admin_conversations_set_conversation_prefs_with_http_info(token, channel_id, prefs)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <AdminConversationsSetConversationPrefsSchema>
rescue slack::ApiError => e
  puts "Error when calling AdminApi->admin_conversations_set_conversation_prefs_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;admin.conversations:write&#x60; |  |
| **channel_id** | **String** | The channel to set the prefs for |  |
| **prefs** | **String** | The prefs for this channel in a stringified JSON format. |  |

### Return type

[**AdminConversationsSetConversationPrefsSchema**](AdminConversationsSetConversationPrefsSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json


## admin_conversations_set_teams

> <DefaultSuccessTemplate> admin_conversations_set_teams(token, channel_id, opts)



Set the workspaces in an Enterprise grid org that connect to a public or private channel.

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::AdminApi.new
token = 'token_example' # String | Authentication token. Requires scope: `admin.conversations:write`
channel_id = 'channel_id_example' # String | The encoded `channel_id` to add or remove to workspaces.
opts = {
  org_channel: true, # Boolean | True if channel has to be converted to an org channel
  target_team_ids: 'target_team_ids_example', # String | A comma-separated list of workspaces to which the channel should be shared. Not required if the channel is being shared org-wide.
  team_id: 'team_id_example' # String | The workspace to which the channel belongs. Omit this argument if the channel is a cross-workspace shared channel.
}

begin
  
  result = api_instance.admin_conversations_set_teams(token, channel_id, opts)
  p result
rescue slack::ApiError => e
  puts "Error when calling AdminApi->admin_conversations_set_teams: #{e}"
end
```

#### Using the admin_conversations_set_teams_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<DefaultSuccessTemplate>, Integer, Hash)> admin_conversations_set_teams_with_http_info(token, channel_id, opts)

```ruby
begin
  
  data, status_code, headers = api_instance.admin_conversations_set_teams_with_http_info(token, channel_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <DefaultSuccessTemplate>
rescue slack::ApiError => e
  puts "Error when calling AdminApi->admin_conversations_set_teams_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;admin.conversations:write&#x60; |  |
| **channel_id** | **String** | The encoded &#x60;channel_id&#x60; to add or remove to workspaces. |  |
| **org_channel** | **Boolean** | True if channel has to be converted to an org channel | [optional] |
| **target_team_ids** | **String** | A comma-separated list of workspaces to which the channel should be shared. Not required if the channel is being shared org-wide. | [optional] |
| **team_id** | **String** | The workspace to which the channel belongs. Omit this argument if the channel is a cross-workspace shared channel. | [optional] |

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json


## admin_conversations_unarchive

> <AdminConversationsUnarchiveSchema> admin_conversations_unarchive(token, channel_id)



Unarchive a public or private channel.

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::AdminApi.new
token = 'token_example' # String | Authentication token. Requires scope: `admin.conversations:write`
channel_id = 'channel_id_example' # String | The channel to unarchive.

begin
  
  result = api_instance.admin_conversations_unarchive(token, channel_id)
  p result
rescue slack::ApiError => e
  puts "Error when calling AdminApi->admin_conversations_unarchive: #{e}"
end
```

#### Using the admin_conversations_unarchive_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<AdminConversationsUnarchiveSchema>, Integer, Hash)> admin_conversations_unarchive_with_http_info(token, channel_id)

```ruby
begin
  
  data, status_code, headers = api_instance.admin_conversations_unarchive_with_http_info(token, channel_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <AdminConversationsUnarchiveSchema>
rescue slack::ApiError => e
  puts "Error when calling AdminApi->admin_conversations_unarchive_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;admin.conversations:write&#x60; |  |
| **channel_id** | **String** | The channel to unarchive. |  |

### Return type

[**AdminConversationsUnarchiveSchema**](AdminConversationsUnarchiveSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json


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

api_instance = slack::AdminApi.new
name = 'name_example' # String | The name of the emoji to be removed. Colons (`:myemoji:`) around the value are not required, although they may be included.
token = 'token_example' # String | Authentication token. Requires scope: `admin.teams:write`
url = 'url_example' # String | The URL of a file to use as an image for the emoji. Square images under 128KB and with transparent backgrounds work best.

begin
  
  result = api_instance.admin_emoji_add(name, token, url)
  p result
rescue slack::ApiError => e
  puts "Error when calling AdminApi->admin_emoji_add: #{e}"
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
  puts "Error when calling AdminApi->admin_emoji_add_with_http_info: #{e}"
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

api_instance = slack::AdminApi.new
alias_for = 'alias_for_example' # String | The alias of the emoji.
name = 'name_example' # String | The name of the emoji to be aliased. Colons (`:myemoji:`) around the value are not required, although they may be included.
token = 'token_example' # String | Authentication token. Requires scope: `admin.teams:write`

begin
  
  result = api_instance.admin_emoji_add_alias(alias_for, name, token)
  p result
rescue slack::ApiError => e
  puts "Error when calling AdminApi->admin_emoji_add_alias: #{e}"
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
  puts "Error when calling AdminApi->admin_emoji_add_alias_with_http_info: #{e}"
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

api_instance = slack::AdminApi.new
token = 'token_example' # String | Authentication token. Requires scope: `admin.teams:read`
opts = {
  cursor: 'cursor_example', # String | Set `cursor` to `next_cursor` returned by the previous call to list items in the next page
  limit: 56 # Integer | The maximum number of items to return. Must be between 1 - 1000 both inclusive.
}

begin
  
  result = api_instance.admin_emoji_list(token, opts)
  p result
rescue slack::ApiError => e
  puts "Error when calling AdminApi->admin_emoji_list: #{e}"
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
  puts "Error when calling AdminApi->admin_emoji_list_with_http_info: #{e}"
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

api_instance = slack::AdminApi.new
name = 'name_example' # String | The name of the emoji to be removed. Colons (`:myemoji:`) around the value are not required, although they may be included.
token = 'token_example' # String | Authentication token. Requires scope: `admin.teams:write`

begin
  
  result = api_instance.admin_emoji_remove(name, token)
  p result
rescue slack::ApiError => e
  puts "Error when calling AdminApi->admin_emoji_remove: #{e}"
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
  puts "Error when calling AdminApi->admin_emoji_remove_with_http_info: #{e}"
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

api_instance = slack::AdminApi.new
name = 'name_example' # String | The name of the emoji to be renamed. Colons (`:myemoji:`) around the value are not required, although they may be included.
new_name = 'new_name_example' # String | The new name of the emoji.
token = 'token_example' # String | Authentication token. Requires scope: `admin.teams:write`

begin
  
  result = api_instance.admin_emoji_rename(name, new_name, token)
  p result
rescue slack::ApiError => e
  puts "Error when calling AdminApi->admin_emoji_rename: #{e}"
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
  puts "Error when calling AdminApi->admin_emoji_rename_with_http_info: #{e}"
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


## admin_invite_requests_approve

> <DefaultSuccessTemplate> admin_invite_requests_approve(token, opts)



Approve a workspace invite request.

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::AdminApi.new
token = 'token_example' # String | Authentication token. Requires scope: `admin.invites:write`
opts = {
  admin_invite_requests_approve_request: TODO # AdminInviteRequestsApproveRequest | 
}

begin
  
  result = api_instance.admin_invite_requests_approve(token, opts)
  p result
rescue slack::ApiError => e
  puts "Error when calling AdminApi->admin_invite_requests_approve: #{e}"
end
```

#### Using the admin_invite_requests_approve_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<DefaultSuccessTemplate>, Integer, Hash)> admin_invite_requests_approve_with_http_info(token, opts)

```ruby
begin
  
  data, status_code, headers = api_instance.admin_invite_requests_approve_with_http_info(token, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <DefaultSuccessTemplate>
rescue slack::ApiError => e
  puts "Error when calling AdminApi->admin_invite_requests_approve_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;admin.invites:write&#x60; |  |
| **admin_invite_requests_approve_request** | [**AdminInviteRequestsApproveRequest**](AdminInviteRequestsApproveRequest.md) |  | [optional] |

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json


## admin_invite_requests_approved_list

> <DefaultSuccessTemplate> admin_invite_requests_approved_list(token, opts)



List all approved workspace invite requests.

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::AdminApi.new
token = 'token_example' # String | Authentication token. Requires scope: `admin.invites:read`
opts = {
  team_id: 'team_id_example', # String | ID for the workspace where the invite requests were made.
  cursor: 'cursor_example', # String | Value of the `next_cursor` field sent as part of the previous API response
  limit: 56 # Integer | The number of results that will be returned by the API on each invocation. Must be between 1 - 1000, both inclusive
}

begin
  
  result = api_instance.admin_invite_requests_approved_list(token, opts)
  p result
rescue slack::ApiError => e
  puts "Error when calling AdminApi->admin_invite_requests_approved_list: #{e}"
end
```

#### Using the admin_invite_requests_approved_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<DefaultSuccessTemplate>, Integer, Hash)> admin_invite_requests_approved_list_with_http_info(token, opts)

```ruby
begin
  
  data, status_code, headers = api_instance.admin_invite_requests_approved_list_with_http_info(token, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <DefaultSuccessTemplate>
rescue slack::ApiError => e
  puts "Error when calling AdminApi->admin_invite_requests_approved_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;admin.invites:read&#x60; |  |
| **team_id** | **String** | ID for the workspace where the invite requests were made. | [optional] |
| **cursor** | **String** | Value of the &#x60;next_cursor&#x60; field sent as part of the previous API response | [optional] |
| **limit** | **Integer** | The number of results that will be returned by the API on each invocation. Must be between 1 - 1000, both inclusive | [optional] |

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## admin_invite_requests_denied_list

> <DefaultSuccessTemplate> admin_invite_requests_denied_list(token, opts)



List all denied workspace invite requests.

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::AdminApi.new
token = 'token_example' # String | Authentication token. Requires scope: `admin.invites:read`
opts = {
  team_id: 'team_id_example', # String | ID for the workspace where the invite requests were made.
  cursor: 'cursor_example', # String | Value of the `next_cursor` field sent as part of the previous api response
  limit: 56 # Integer | The number of results that will be returned by the API on each invocation. Must be between 1 - 1000 both inclusive
}

begin
  
  result = api_instance.admin_invite_requests_denied_list(token, opts)
  p result
rescue slack::ApiError => e
  puts "Error when calling AdminApi->admin_invite_requests_denied_list: #{e}"
end
```

#### Using the admin_invite_requests_denied_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<DefaultSuccessTemplate>, Integer, Hash)> admin_invite_requests_denied_list_with_http_info(token, opts)

```ruby
begin
  
  data, status_code, headers = api_instance.admin_invite_requests_denied_list_with_http_info(token, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <DefaultSuccessTemplate>
rescue slack::ApiError => e
  puts "Error when calling AdminApi->admin_invite_requests_denied_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;admin.invites:read&#x60; |  |
| **team_id** | **String** | ID for the workspace where the invite requests were made. | [optional] |
| **cursor** | **String** | Value of the &#x60;next_cursor&#x60; field sent as part of the previous api response | [optional] |
| **limit** | **Integer** | The number of results that will be returned by the API on each invocation. Must be between 1 - 1000 both inclusive | [optional] |

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## admin_invite_requests_deny

> <DefaultSuccessTemplate> admin_invite_requests_deny(token, opts)



Deny a workspace invite request.

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::AdminApi.new
token = 'token_example' # String | Authentication token. Requires scope: `admin.invites:write`
opts = {
  admin_invite_requests_approve_request: TODO # AdminInviteRequestsApproveRequest | 
}

begin
  
  result = api_instance.admin_invite_requests_deny(token, opts)
  p result
rescue slack::ApiError => e
  puts "Error when calling AdminApi->admin_invite_requests_deny: #{e}"
end
```

#### Using the admin_invite_requests_deny_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<DefaultSuccessTemplate>, Integer, Hash)> admin_invite_requests_deny_with_http_info(token, opts)

```ruby
begin
  
  data, status_code, headers = api_instance.admin_invite_requests_deny_with_http_info(token, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <DefaultSuccessTemplate>
rescue slack::ApiError => e
  puts "Error when calling AdminApi->admin_invite_requests_deny_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;admin.invites:write&#x60; |  |
| **admin_invite_requests_approve_request** | [**AdminInviteRequestsApproveRequest**](AdminInviteRequestsApproveRequest.md) |  | [optional] |

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json


## admin_invite_requests_list

> <DefaultSuccessTemplate> admin_invite_requests_list(token, opts)



List all pending workspace invite requests.

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::AdminApi.new
token = 'token_example' # String | Authentication token. Requires scope: `admin.invites:read`
opts = {
  team_id: 'team_id_example', # String | ID for the workspace where the invite requests were made.
  cursor: 'cursor_example', # String | Value of the `next_cursor` field sent as part of the previous API response
  limit: 56 # Integer | The number of results that will be returned by the API on each invocation. Must be between 1 - 1000, both inclusive
}

begin
  
  result = api_instance.admin_invite_requests_list(token, opts)
  p result
rescue slack::ApiError => e
  puts "Error when calling AdminApi->admin_invite_requests_list: #{e}"
end
```

#### Using the admin_invite_requests_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<DefaultSuccessTemplate>, Integer, Hash)> admin_invite_requests_list_with_http_info(token, opts)

```ruby
begin
  
  data, status_code, headers = api_instance.admin_invite_requests_list_with_http_info(token, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <DefaultSuccessTemplate>
rescue slack::ApiError => e
  puts "Error when calling AdminApi->admin_invite_requests_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;admin.invites:read&#x60; |  |
| **team_id** | **String** | ID for the workspace where the invite requests were made. | [optional] |
| **cursor** | **String** | Value of the &#x60;next_cursor&#x60; field sent as part of the previous API response | [optional] |
| **limit** | **Integer** | The number of results that will be returned by the API on each invocation. Must be between 1 - 1000, both inclusive | [optional] |

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## admin_teams_admins_list

> <DefaultSuccessTemplate> admin_teams_admins_list(token, team_id, opts)



List all of the admins on a given workspace.

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::AdminApi.new
token = 'token_example' # String | Authentication token. Requires scope: `admin.teams:read`
team_id = 'team_id_example' # String | 
opts = {
  limit: 56, # Integer | The maximum number of items to return.
  cursor: 'cursor_example' # String | Set `cursor` to `next_cursor` returned by the previous call to list items in the next page.
}

begin
  
  result = api_instance.admin_teams_admins_list(token, team_id, opts)
  p result
rescue slack::ApiError => e
  puts "Error when calling AdminApi->admin_teams_admins_list: #{e}"
end
```

#### Using the admin_teams_admins_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<DefaultSuccessTemplate>, Integer, Hash)> admin_teams_admins_list_with_http_info(token, team_id, opts)

```ruby
begin
  
  data, status_code, headers = api_instance.admin_teams_admins_list_with_http_info(token, team_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <DefaultSuccessTemplate>
rescue slack::ApiError => e
  puts "Error when calling AdminApi->admin_teams_admins_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;admin.teams:read&#x60; |  |
| **team_id** | **String** |  |  |
| **limit** | **Integer** | The maximum number of items to return. | [optional] |
| **cursor** | **String** | Set &#x60;cursor&#x60; to &#x60;next_cursor&#x60; returned by the previous call to list items in the next page. | [optional] |

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## admin_teams_create

> <DefaultSuccessTemplate> admin_teams_create(token, team_domain, team_name, opts)



Create an Enterprise team.

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::AdminApi.new
token = 'token_example' # String | Authentication token. Requires scope: `admin.teams:write`
team_domain = 'team_domain_example' # String | Team domain (for example, slacksoftballteam).
team_name = 'team_name_example' # String | Team name (for example, Slack Softball Team).
opts = {
  team_description: 'team_description_example', # String | Description for the team.
  team_discoverability: 'team_discoverability_example' # String | Who can join the team. A team's discoverability can be `open`, `closed`, `invite_only`, or `unlisted`.
}

begin
  
  result = api_instance.admin_teams_create(token, team_domain, team_name, opts)
  p result
rescue slack::ApiError => e
  puts "Error when calling AdminApi->admin_teams_create: #{e}"
end
```

#### Using the admin_teams_create_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<DefaultSuccessTemplate>, Integer, Hash)> admin_teams_create_with_http_info(token, team_domain, team_name, opts)

```ruby
begin
  
  data, status_code, headers = api_instance.admin_teams_create_with_http_info(token, team_domain, team_name, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <DefaultSuccessTemplate>
rescue slack::ApiError => e
  puts "Error when calling AdminApi->admin_teams_create_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;admin.teams:write&#x60; |  |
| **team_domain** | **String** | Team domain (for example, slacksoftballteam). |  |
| **team_name** | **String** | Team name (for example, Slack Softball Team). |  |
| **team_description** | **String** | Description for the team. | [optional] |
| **team_discoverability** | **String** | Who can join the team. A team&#39;s discoverability can be &#x60;open&#x60;, &#x60;closed&#x60;, &#x60;invite_only&#x60;, or &#x60;unlisted&#x60;. | [optional] |

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json


## admin_teams_list

> <DefaultSuccessTemplate> admin_teams_list(token, opts)



List all teams on an Enterprise organization

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::AdminApi.new
token = 'token_example' # String | Authentication token. Requires scope: `admin.teams:read`
opts = {
  limit: 56, # Integer | The maximum number of items to return. Must be between 1 - 100 both inclusive.
  cursor: 'cursor_example' # String | Set `cursor` to `next_cursor` returned by the previous call to list items in the next page.
}

begin
  
  result = api_instance.admin_teams_list(token, opts)
  p result
rescue slack::ApiError => e
  puts "Error when calling AdminApi->admin_teams_list: #{e}"
end
```

#### Using the admin_teams_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<DefaultSuccessTemplate>, Integer, Hash)> admin_teams_list_with_http_info(token, opts)

```ruby
begin
  
  data, status_code, headers = api_instance.admin_teams_list_with_http_info(token, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <DefaultSuccessTemplate>
rescue slack::ApiError => e
  puts "Error when calling AdminApi->admin_teams_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;admin.teams:read&#x60; |  |
| **limit** | **Integer** | The maximum number of items to return. Must be between 1 - 100 both inclusive. | [optional] |
| **cursor** | **String** | Set &#x60;cursor&#x60; to &#x60;next_cursor&#x60; returned by the previous call to list items in the next page. | [optional] |

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## admin_teams_owners_list

> <DefaultSuccessTemplate> admin_teams_owners_list(token, team_id, opts)



List all of the owners on a given workspace.

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::AdminApi.new
token = 'token_example' # String | Authentication token. Requires scope: `admin.teams:read`
team_id = 'team_id_example' # String | 
opts = {
  limit: 56, # Integer | The maximum number of items to return. Must be between 1 - 1000 both inclusive.
  cursor: 'cursor_example' # String | Set `cursor` to `next_cursor` returned by the previous call to list items in the next page.
}

begin
  
  result = api_instance.admin_teams_owners_list(token, team_id, opts)
  p result
rescue slack::ApiError => e
  puts "Error when calling AdminApi->admin_teams_owners_list: #{e}"
end
```

#### Using the admin_teams_owners_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<DefaultSuccessTemplate>, Integer, Hash)> admin_teams_owners_list_with_http_info(token, team_id, opts)

```ruby
begin
  
  data, status_code, headers = api_instance.admin_teams_owners_list_with_http_info(token, team_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <DefaultSuccessTemplate>
rescue slack::ApiError => e
  puts "Error when calling AdminApi->admin_teams_owners_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;admin.teams:read&#x60; |  |
| **team_id** | **String** |  |  |
| **limit** | **Integer** | The maximum number of items to return. Must be between 1 - 1000 both inclusive. | [optional] |
| **cursor** | **String** | Set &#x60;cursor&#x60; to &#x60;next_cursor&#x60; returned by the previous call to list items in the next page. | [optional] |

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## admin_teams_settings_info

> <DefaultSuccessTemplate> admin_teams_settings_info(token, team_id)



Fetch information about settings in a workspace

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::AdminApi.new
token = 'token_example' # String | Authentication token. Requires scope: `admin.teams:read`
team_id = 'team_id_example' # String | 

begin
  
  result = api_instance.admin_teams_settings_info(token, team_id)
  p result
rescue slack::ApiError => e
  puts "Error when calling AdminApi->admin_teams_settings_info: #{e}"
end
```

#### Using the admin_teams_settings_info_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<DefaultSuccessTemplate>, Integer, Hash)> admin_teams_settings_info_with_http_info(token, team_id)

```ruby
begin
  
  data, status_code, headers = api_instance.admin_teams_settings_info_with_http_info(token, team_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <DefaultSuccessTemplate>
rescue slack::ApiError => e
  puts "Error when calling AdminApi->admin_teams_settings_info_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;admin.teams:read&#x60; |  |
| **team_id** | **String** |  |  |

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## admin_teams_settings_set_default_channels

> <DefaultSuccessTemplate> admin_teams_settings_set_default_channels(channel_ids, team_id, token)



Set the default channels of a workspace.

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::AdminApi.new
channel_ids = 'channel_ids_example' # String | An array of channel IDs.
team_id = 'team_id_example' # String | ID for the workspace to set the default channel for.
token = 'token_example' # String | Authentication token. Requires scope: `admin.teams:write`

begin
  
  result = api_instance.admin_teams_settings_set_default_channels(channel_ids, team_id, token)
  p result
rescue slack::ApiError => e
  puts "Error when calling AdminApi->admin_teams_settings_set_default_channels: #{e}"
end
```

#### Using the admin_teams_settings_set_default_channels_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<DefaultSuccessTemplate>, Integer, Hash)> admin_teams_settings_set_default_channels_with_http_info(channel_ids, team_id, token)

```ruby
begin
  
  data, status_code, headers = api_instance.admin_teams_settings_set_default_channels_with_http_info(channel_ids, team_id, token)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <DefaultSuccessTemplate>
rescue slack::ApiError => e
  puts "Error when calling AdminApi->admin_teams_settings_set_default_channels_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **channel_ids** | **String** | An array of channel IDs. |  |
| **team_id** | **String** | ID for the workspace to set the default channel for. |  |
| **token** | **String** | Authentication token. Requires scope: &#x60;admin.teams:write&#x60; |  |

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json


## admin_teams_settings_set_description

> <DefaultSuccessTemplate> admin_teams_settings_set_description(token, description, team_id)



Set the description of a given workspace.

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::AdminApi.new
token = 'token_example' # String | Authentication token. Requires scope: `admin.teams:write`
description = 'description_example' # String | The new description for the workspace.
team_id = 'team_id_example' # String | ID for the workspace to set the description for.

begin
  
  result = api_instance.admin_teams_settings_set_description(token, description, team_id)
  p result
rescue slack::ApiError => e
  puts "Error when calling AdminApi->admin_teams_settings_set_description: #{e}"
end
```

#### Using the admin_teams_settings_set_description_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<DefaultSuccessTemplate>, Integer, Hash)> admin_teams_settings_set_description_with_http_info(token, description, team_id)

```ruby
begin
  
  data, status_code, headers = api_instance.admin_teams_settings_set_description_with_http_info(token, description, team_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <DefaultSuccessTemplate>
rescue slack::ApiError => e
  puts "Error when calling AdminApi->admin_teams_settings_set_description_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;admin.teams:write&#x60; |  |
| **description** | **String** | The new description for the workspace. |  |
| **team_id** | **String** | ID for the workspace to set the description for. |  |

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json


## admin_teams_settings_set_discoverability

> <DefaultSuccessTemplate> admin_teams_settings_set_discoverability(token, discoverability, team_id)



An API method that allows admins to set the discoverability of a given workspace

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::AdminApi.new
token = 'token_example' # String | Authentication token. Requires scope: `admin.teams:write`
discoverability = 'discoverability_example' # String | This workspace's discovery setting. It must be set to one of `open`, `invite_only`, `closed`, or `unlisted`.
team_id = 'team_id_example' # String | The ID of the workspace to set discoverability on.

begin
  
  result = api_instance.admin_teams_settings_set_discoverability(token, discoverability, team_id)
  p result
rescue slack::ApiError => e
  puts "Error when calling AdminApi->admin_teams_settings_set_discoverability: #{e}"
end
```

#### Using the admin_teams_settings_set_discoverability_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<DefaultSuccessTemplate>, Integer, Hash)> admin_teams_settings_set_discoverability_with_http_info(token, discoverability, team_id)

```ruby
begin
  
  data, status_code, headers = api_instance.admin_teams_settings_set_discoverability_with_http_info(token, discoverability, team_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <DefaultSuccessTemplate>
rescue slack::ApiError => e
  puts "Error when calling AdminApi->admin_teams_settings_set_discoverability_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;admin.teams:write&#x60; |  |
| **discoverability** | **String** | This workspace&#39;s discovery setting. It must be set to one of &#x60;open&#x60;, &#x60;invite_only&#x60;, &#x60;closed&#x60;, or &#x60;unlisted&#x60;. |  |
| **team_id** | **String** | The ID of the workspace to set discoverability on. |  |

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json


## admin_teams_settings_set_icon

> <DefaultSuccessTemplate> admin_teams_settings_set_icon(image_url, team_id, token)



Sets the icon of a workspace.

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::AdminApi.new
image_url = 'image_url_example' # String | Image URL for the icon
team_id = 'team_id_example' # String | ID for the workspace to set the icon for.
token = 'token_example' # String | Authentication token. Requires scope: `admin.teams:write`

begin
  
  result = api_instance.admin_teams_settings_set_icon(image_url, team_id, token)
  p result
rescue slack::ApiError => e
  puts "Error when calling AdminApi->admin_teams_settings_set_icon: #{e}"
end
```

#### Using the admin_teams_settings_set_icon_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<DefaultSuccessTemplate>, Integer, Hash)> admin_teams_settings_set_icon_with_http_info(image_url, team_id, token)

```ruby
begin
  
  data, status_code, headers = api_instance.admin_teams_settings_set_icon_with_http_info(image_url, team_id, token)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <DefaultSuccessTemplate>
rescue slack::ApiError => e
  puts "Error when calling AdminApi->admin_teams_settings_set_icon_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **image_url** | **String** | Image URL for the icon |  |
| **team_id** | **String** | ID for the workspace to set the icon for. |  |
| **token** | **String** | Authentication token. Requires scope: &#x60;admin.teams:write&#x60; |  |

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json


## admin_teams_settings_set_name

> <DefaultSuccessTemplate> admin_teams_settings_set_name(token, name, team_id)



Set the name of a given workspace.

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::AdminApi.new
token = 'token_example' # String | Authentication token. Requires scope: `admin.teams:write`
name = 'name_example' # String | The new name of the workspace.
team_id = 'team_id_example' # String | ID for the workspace to set the name for.

begin
  
  result = api_instance.admin_teams_settings_set_name(token, name, team_id)
  p result
rescue slack::ApiError => e
  puts "Error when calling AdminApi->admin_teams_settings_set_name: #{e}"
end
```

#### Using the admin_teams_settings_set_name_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<DefaultSuccessTemplate>, Integer, Hash)> admin_teams_settings_set_name_with_http_info(token, name, team_id)

```ruby
begin
  
  data, status_code, headers = api_instance.admin_teams_settings_set_name_with_http_info(token, name, team_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <DefaultSuccessTemplate>
rescue slack::ApiError => e
  puts "Error when calling AdminApi->admin_teams_settings_set_name_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;admin.teams:write&#x60; |  |
| **name** | **String** | The new name of the workspace. |  |
| **team_id** | **String** | ID for the workspace to set the name for. |  |

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json


## admin_usergroups_add_channels

> <DefaultSuccessTemplate> admin_usergroups_add_channels(token, channel_ids, usergroup_id, opts)



Add one or more default channels to an IDP group.

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::AdminApi.new
token = 'token_example' # String | Authentication token. Requires scope: `admin.usergroups:write`
channel_ids = 'channel_ids_example' # String | Comma separated string of channel IDs.
usergroup_id = 'usergroup_id_example' # String | ID of the IDP group to add default channels for.
opts = {
  team_id: 'team_id_example' # String | The workspace to add default channels in.
}

begin
  
  result = api_instance.admin_usergroups_add_channels(token, channel_ids, usergroup_id, opts)
  p result
rescue slack::ApiError => e
  puts "Error when calling AdminApi->admin_usergroups_add_channels: #{e}"
end
```

#### Using the admin_usergroups_add_channels_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<DefaultSuccessTemplate>, Integer, Hash)> admin_usergroups_add_channels_with_http_info(token, channel_ids, usergroup_id, opts)

```ruby
begin
  
  data, status_code, headers = api_instance.admin_usergroups_add_channels_with_http_info(token, channel_ids, usergroup_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <DefaultSuccessTemplate>
rescue slack::ApiError => e
  puts "Error when calling AdminApi->admin_usergroups_add_channels_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;admin.usergroups:write&#x60; |  |
| **channel_ids** | **String** | Comma separated string of channel IDs. |  |
| **usergroup_id** | **String** | ID of the IDP group to add default channels for. |  |
| **team_id** | **String** | The workspace to add default channels in. | [optional] |

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json


## admin_usergroups_add_teams

> <DefaultSuccessTemplate> admin_usergroups_add_teams(token, team_ids, usergroup_id, opts)



Associate one or more default workspaces with an organization-wide IDP group.

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::AdminApi.new
token = 'token_example' # String | Authentication token. Requires scope: `admin.teams:write`
team_ids = 'team_ids_example' # String | A comma separated list of encoded team (workspace) IDs. Each workspace *MUST* belong to the organization associated with the token.
usergroup_id = 'usergroup_id_example' # String | An encoded usergroup (IDP Group) ID.
opts = {
  auto_provision: true # Boolean | When `true`, this method automatically creates new workspace accounts for the IDP group members.
}

begin
  
  result = api_instance.admin_usergroups_add_teams(token, team_ids, usergroup_id, opts)
  p result
rescue slack::ApiError => e
  puts "Error when calling AdminApi->admin_usergroups_add_teams: #{e}"
end
```

#### Using the admin_usergroups_add_teams_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<DefaultSuccessTemplate>, Integer, Hash)> admin_usergroups_add_teams_with_http_info(token, team_ids, usergroup_id, opts)

```ruby
begin
  
  data, status_code, headers = api_instance.admin_usergroups_add_teams_with_http_info(token, team_ids, usergroup_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <DefaultSuccessTemplate>
rescue slack::ApiError => e
  puts "Error when calling AdminApi->admin_usergroups_add_teams_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;admin.teams:write&#x60; |  |
| **team_ids** | **String** | A comma separated list of encoded team (workspace) IDs. Each workspace *MUST* belong to the organization associated with the token. |  |
| **usergroup_id** | **String** | An encoded usergroup (IDP Group) ID. |  |
| **auto_provision** | **Boolean** | When &#x60;true&#x60;, this method automatically creates new workspace accounts for the IDP group members. | [optional] |

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json


## admin_usergroups_list_channels

> <DefaultSuccessTemplate> admin_usergroups_list_channels(token, usergroup_id, opts)



List the channels linked to an org-level IDP group (user group).

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::AdminApi.new
token = 'token_example' # String | Authentication token. Requires scope: `admin.usergroups:read`
usergroup_id = 'usergroup_id_example' # String | ID of the IDP group to list default channels for.
opts = {
  team_id: 'team_id_example', # String | ID of the the workspace.
  include_num_members: true # Boolean | Flag to include or exclude the count of members per channel.
}

begin
  
  result = api_instance.admin_usergroups_list_channels(token, usergroup_id, opts)
  p result
rescue slack::ApiError => e
  puts "Error when calling AdminApi->admin_usergroups_list_channels: #{e}"
end
```

#### Using the admin_usergroups_list_channels_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<DefaultSuccessTemplate>, Integer, Hash)> admin_usergroups_list_channels_with_http_info(token, usergroup_id, opts)

```ruby
begin
  
  data, status_code, headers = api_instance.admin_usergroups_list_channels_with_http_info(token, usergroup_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <DefaultSuccessTemplate>
rescue slack::ApiError => e
  puts "Error when calling AdminApi->admin_usergroups_list_channels_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;admin.usergroups:read&#x60; |  |
| **usergroup_id** | **String** | ID of the IDP group to list default channels for. |  |
| **team_id** | **String** | ID of the the workspace. | [optional] |
| **include_num_members** | **Boolean** | Flag to include or exclude the count of members per channel. | [optional] |

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## admin_usergroups_remove_channels

> <DefaultSuccessTemplate> admin_usergroups_remove_channels(token, channel_ids, usergroup_id)



Remove one or more default channels from an org-level IDP group (user group).

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::AdminApi.new
token = 'token_example' # String | Authentication token. Requires scope: `admin.usergroups:write`
channel_ids = 'channel_ids_example' # String | Comma-separated string of channel IDs
usergroup_id = 'usergroup_id_example' # String | ID of the IDP Group

begin
  
  result = api_instance.admin_usergroups_remove_channels(token, channel_ids, usergroup_id)
  p result
rescue slack::ApiError => e
  puts "Error when calling AdminApi->admin_usergroups_remove_channels: #{e}"
end
```

#### Using the admin_usergroups_remove_channels_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<DefaultSuccessTemplate>, Integer, Hash)> admin_usergroups_remove_channels_with_http_info(token, channel_ids, usergroup_id)

```ruby
begin
  
  data, status_code, headers = api_instance.admin_usergroups_remove_channels_with_http_info(token, channel_ids, usergroup_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <DefaultSuccessTemplate>
rescue slack::ApiError => e
  puts "Error when calling AdminApi->admin_usergroups_remove_channels_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;admin.usergroups:write&#x60; |  |
| **channel_ids** | **String** | Comma-separated string of channel IDs |  |
| **usergroup_id** | **String** | ID of the IDP Group |  |

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json


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

api_instance = slack::AdminApi.new
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
  puts "Error when calling AdminApi->admin_users_assign: #{e}"
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
  puts "Error when calling AdminApi->admin_users_assign_with_http_info: #{e}"
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

api_instance = slack::AdminApi.new
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
  puts "Error when calling AdminApi->admin_users_invite: #{e}"
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
  puts "Error when calling AdminApi->admin_users_invite_with_http_info: #{e}"
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

api_instance = slack::AdminApi.new
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
  puts "Error when calling AdminApi->admin_users_list: #{e}"
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
  puts "Error when calling AdminApi->admin_users_list_with_http_info: #{e}"
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

api_instance = slack::AdminApi.new
token = 'token_example' # String | Authentication token. Requires scope: `admin.users:write`
team_id = 'team_id_example' # String | The ID (`T1234`) of the workspace.
user_id = 'user_id_example' # String | The ID of the user to remove.

begin
  
  result = api_instance.admin_users_remove(token, team_id, user_id)
  p result
rescue slack::ApiError => e
  puts "Error when calling AdminApi->admin_users_remove: #{e}"
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
  puts "Error when calling AdminApi->admin_users_remove_with_http_info: #{e}"
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

api_instance = slack::AdminApi.new
token = 'token_example' # String | Authentication token. Requires scope: `admin.users:write`
session_id = 56 # Integer | 
team_id = 'team_id_example' # String | ID of the team that the session belongs to

begin
  
  result = api_instance.admin_users_session_invalidate(token, session_id, team_id)
  p result
rescue slack::ApiError => e
  puts "Error when calling AdminApi->admin_users_session_invalidate: #{e}"
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
  puts "Error when calling AdminApi->admin_users_session_invalidate_with_http_info: #{e}"
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

api_instance = slack::AdminApi.new
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
  puts "Error when calling AdminApi->admin_users_session_reset: #{e}"
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
  puts "Error when calling AdminApi->admin_users_session_reset_with_http_info: #{e}"
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

api_instance = slack::AdminApi.new
token = 'token_example' # String | Authentication token. Requires scope: `admin.users:write`
team_id = 'team_id_example' # String | The ID (`T1234`) of the workspace.
user_id = 'user_id_example' # String | The ID of the user to designate as an admin.

begin
  
  result = api_instance.admin_users_set_admin(token, team_id, user_id)
  p result
rescue slack::ApiError => e
  puts "Error when calling AdminApi->admin_users_set_admin: #{e}"
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
  puts "Error when calling AdminApi->admin_users_set_admin_with_http_info: #{e}"
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

api_instance = slack::AdminApi.new
token = 'token_example' # String | Authentication token. Requires scope: `admin.users:write`
expiration_ts = 56 # Integer | Timestamp when guest account should be disabled.
team_id = 'team_id_example' # String | The ID (`T1234`) of the workspace.
user_id = 'user_id_example' # String | The ID of the user to set an expiration for.

begin
  
  result = api_instance.admin_users_set_expiration(token, expiration_ts, team_id, user_id)
  p result
rescue slack::ApiError => e
  puts "Error when calling AdminApi->admin_users_set_expiration: #{e}"
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
  puts "Error when calling AdminApi->admin_users_set_expiration_with_http_info: #{e}"
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

api_instance = slack::AdminApi.new
token = 'token_example' # String | Authentication token. Requires scope: `admin.users:write`
team_id = 'team_id_example' # String | The ID (`T1234`) of the workspace.
user_id = 'user_id_example' # String | Id of the user to promote to owner.

begin
  
  result = api_instance.admin_users_set_owner(token, team_id, user_id)
  p result
rescue slack::ApiError => e
  puts "Error when calling AdminApi->admin_users_set_owner: #{e}"
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
  puts "Error when calling AdminApi->admin_users_set_owner_with_http_info: #{e}"
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

api_instance = slack::AdminApi.new
token = 'token_example' # String | Authentication token. Requires scope: `admin.users:write`
team_id = 'team_id_example' # String | The ID (`T1234`) of the workspace.
user_id = 'user_id_example' # String | The ID of the user to designate as a regular user.

begin
  
  result = api_instance.admin_users_set_regular(token, team_id, user_id)
  p result
rescue slack::ApiError => e
  puts "Error when calling AdminApi->admin_users_set_regular: #{e}"
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
  puts "Error when calling AdminApi->admin_users_set_regular_with_http_info: #{e}"
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

