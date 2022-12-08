# slack::AdminConversationsApi

All URIs are relative to *https://slack.com/api*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**admin_conversations_archive**](AdminConversationsApi.md#admin_conversations_archive) | **POST** /admin.conversations.archive |  |
| [**admin_conversations_convert_to_private**](AdminConversationsApi.md#admin_conversations_convert_to_private) | **POST** /admin.conversations.convertToPrivate |  |
| [**admin_conversations_create**](AdminConversationsApi.md#admin_conversations_create) | **POST** /admin.conversations.create |  |
| [**admin_conversations_delete**](AdminConversationsApi.md#admin_conversations_delete) | **POST** /admin.conversations.delete |  |
| [**admin_conversations_disconnect_shared**](AdminConversationsApi.md#admin_conversations_disconnect_shared) | **POST** /admin.conversations.disconnectShared |  |
| [**admin_conversations_get_conversation_prefs**](AdminConversationsApi.md#admin_conversations_get_conversation_prefs) | **GET** /admin.conversations.getConversationPrefs |  |
| [**admin_conversations_get_teams**](AdminConversationsApi.md#admin_conversations_get_teams) | **GET** /admin.conversations.getTeams |  |
| [**admin_conversations_invite**](AdminConversationsApi.md#admin_conversations_invite) | **POST** /admin.conversations.invite |  |
| [**admin_conversations_rename**](AdminConversationsApi.md#admin_conversations_rename) | **POST** /admin.conversations.rename |  |
| [**admin_conversations_search**](AdminConversationsApi.md#admin_conversations_search) | **GET** /admin.conversations.search |  |
| [**admin_conversations_set_conversation_prefs**](AdminConversationsApi.md#admin_conversations_set_conversation_prefs) | **POST** /admin.conversations.setConversationPrefs |  |
| [**admin_conversations_set_teams**](AdminConversationsApi.md#admin_conversations_set_teams) | **POST** /admin.conversations.setTeams |  |
| [**admin_conversations_unarchive**](AdminConversationsApi.md#admin_conversations_unarchive) | **POST** /admin.conversations.unarchive |  |


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

api_instance = slack::AdminConversationsApi.new
token = 'token_example' # String | Authentication token. Requires scope: `admin.conversations:write`
channel_id = 'channel_id_example' # String | The channel to archive.

begin
  
  result = api_instance.admin_conversations_archive(token, channel_id)
  p result
rescue slack::ApiError => e
  puts "Error when calling AdminConversationsApi->admin_conversations_archive: #{e}"
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
  puts "Error when calling AdminConversationsApi->admin_conversations_archive_with_http_info: #{e}"
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

api_instance = slack::AdminConversationsApi.new
token = 'token_example' # String | Authentication token. Requires scope: `admin.conversations:write`
channel_id = 'channel_id_example' # String | The channel to convert to private.

begin
  
  result = api_instance.admin_conversations_convert_to_private(token, channel_id)
  p result
rescue slack::ApiError => e
  puts "Error when calling AdminConversationsApi->admin_conversations_convert_to_private: #{e}"
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
  puts "Error when calling AdminConversationsApi->admin_conversations_convert_to_private_with_http_info: #{e}"
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

api_instance = slack::AdminConversationsApi.new
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
  puts "Error when calling AdminConversationsApi->admin_conversations_create: #{e}"
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
  puts "Error when calling AdminConversationsApi->admin_conversations_create_with_http_info: #{e}"
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

api_instance = slack::AdminConversationsApi.new
token = 'token_example' # String | Authentication token. Requires scope: `admin.conversations:write`
channel_id = 'channel_id_example' # String | The channel to delete.

begin
  
  result = api_instance.admin_conversations_delete(token, channel_id)
  p result
rescue slack::ApiError => e
  puts "Error when calling AdminConversationsApi->admin_conversations_delete: #{e}"
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
  puts "Error when calling AdminConversationsApi->admin_conversations_delete_with_http_info: #{e}"
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

api_instance = slack::AdminConversationsApi.new
token = 'token_example' # String | Authentication token. Requires scope: `admin.conversations:write`
channel_id = 'channel_id_example' # String | The channel to be disconnected from some workspaces.
opts = {
  leaving_team_ids: 'leaving_team_ids_example' # String | The team to be removed from the channel. Currently only a single team id can be specified.
}

begin
  
  result = api_instance.admin_conversations_disconnect_shared(token, channel_id, opts)
  p result
rescue slack::ApiError => e
  puts "Error when calling AdminConversationsApi->admin_conversations_disconnect_shared: #{e}"
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
  puts "Error when calling AdminConversationsApi->admin_conversations_disconnect_shared_with_http_info: #{e}"
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

api_instance = slack::AdminConversationsApi.new
token = 'token_example' # String | Authentication token. Requires scope: `admin.conversations:read`
channel_id = 'channel_id_example' # String | The channel to get preferences for.

begin
  
  result = api_instance.admin_conversations_get_conversation_prefs(token, channel_id)
  p result
rescue slack::ApiError => e
  puts "Error when calling AdminConversationsApi->admin_conversations_get_conversation_prefs: #{e}"
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
  puts "Error when calling AdminConversationsApi->admin_conversations_get_conversation_prefs_with_http_info: #{e}"
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

api_instance = slack::AdminConversationsApi.new
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
  puts "Error when calling AdminConversationsApi->admin_conversations_get_teams: #{e}"
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
  puts "Error when calling AdminConversationsApi->admin_conversations_get_teams_with_http_info: #{e}"
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

api_instance = slack::AdminConversationsApi.new
token = 'token_example' # String | Authentication token. Requires scope: `admin.conversations:write`
channel_id = 'channel_id_example' # String | The channel that the users will be invited to.
user_ids = 'user_ids_example' # String | The users to invite.

begin
  
  result = api_instance.admin_conversations_invite(token, channel_id, user_ids)
  p result
rescue slack::ApiError => e
  puts "Error when calling AdminConversationsApi->admin_conversations_invite: #{e}"
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
  puts "Error when calling AdminConversationsApi->admin_conversations_invite_with_http_info: #{e}"
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

api_instance = slack::AdminConversationsApi.new
token = 'token_example' # String | Authentication token. Requires scope: `admin.conversations:write`
channel_id = 'channel_id_example' # String | The channel to rename.
name = 'name_example' # String | 

begin
  
  result = api_instance.admin_conversations_rename(token, channel_id, name)
  p result
rescue slack::ApiError => e
  puts "Error when calling AdminConversationsApi->admin_conversations_rename: #{e}"
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
  puts "Error when calling AdminConversationsApi->admin_conversations_rename_with_http_info: #{e}"
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

api_instance = slack::AdminConversationsApi.new
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
  puts "Error when calling AdminConversationsApi->admin_conversations_search: #{e}"
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
  puts "Error when calling AdminConversationsApi->admin_conversations_search_with_http_info: #{e}"
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

api_instance = slack::AdminConversationsApi.new
token = 'token_example' # String | Authentication token. Requires scope: `admin.conversations:write`
channel_id = 'channel_id_example' # String | The channel to set the prefs for
prefs = 'prefs_example' # String | The prefs for this channel in a stringified JSON format.

begin
  
  result = api_instance.admin_conversations_set_conversation_prefs(token, channel_id, prefs)
  p result
rescue slack::ApiError => e
  puts "Error when calling AdminConversationsApi->admin_conversations_set_conversation_prefs: #{e}"
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
  puts "Error when calling AdminConversationsApi->admin_conversations_set_conversation_prefs_with_http_info: #{e}"
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

api_instance = slack::AdminConversationsApi.new
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
  puts "Error when calling AdminConversationsApi->admin_conversations_set_teams: #{e}"
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
  puts "Error when calling AdminConversationsApi->admin_conversations_set_teams_with_http_info: #{e}"
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

api_instance = slack::AdminConversationsApi.new
token = 'token_example' # String | Authentication token. Requires scope: `admin.conversations:write`
channel_id = 'channel_id_example' # String | The channel to unarchive.

begin
  
  result = api_instance.admin_conversations_unarchive(token, channel_id)
  p result
rescue slack::ApiError => e
  puts "Error when calling AdminConversationsApi->admin_conversations_unarchive: #{e}"
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
  puts "Error when calling AdminConversationsApi->admin_conversations_unarchive_with_http_info: #{e}"
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

