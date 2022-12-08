# slack::AdminUsergroupsApi

All URIs are relative to *https://slack.com/api*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**admin_usergroups_add_channels**](AdminUsergroupsApi.md#admin_usergroups_add_channels) | **POST** /admin.usergroups.addChannels |  |
| [**admin_usergroups_add_teams**](AdminUsergroupsApi.md#admin_usergroups_add_teams) | **POST** /admin.usergroups.addTeams |  |
| [**admin_usergroups_list_channels**](AdminUsergroupsApi.md#admin_usergroups_list_channels) | **GET** /admin.usergroups.listChannels |  |
| [**admin_usergroups_remove_channels**](AdminUsergroupsApi.md#admin_usergroups_remove_channels) | **POST** /admin.usergroups.removeChannels |  |


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

api_instance = slack::AdminUsergroupsApi.new
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
  puts "Error when calling AdminUsergroupsApi->admin_usergroups_add_channels: #{e}"
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
  puts "Error when calling AdminUsergroupsApi->admin_usergroups_add_channels_with_http_info: #{e}"
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

api_instance = slack::AdminUsergroupsApi.new
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
  puts "Error when calling AdminUsergroupsApi->admin_usergroups_add_teams: #{e}"
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
  puts "Error when calling AdminUsergroupsApi->admin_usergroups_add_teams_with_http_info: #{e}"
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

api_instance = slack::AdminUsergroupsApi.new
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
  puts "Error when calling AdminUsergroupsApi->admin_usergroups_list_channels: #{e}"
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
  puts "Error when calling AdminUsergroupsApi->admin_usergroups_list_channels_with_http_info: #{e}"
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

api_instance = slack::AdminUsergroupsApi.new
token = 'token_example' # String | Authentication token. Requires scope: `admin.usergroups:write`
channel_ids = 'channel_ids_example' # String | Comma-separated string of channel IDs
usergroup_id = 'usergroup_id_example' # String | ID of the IDP Group

begin
  
  result = api_instance.admin_usergroups_remove_channels(token, channel_ids, usergroup_id)
  p result
rescue slack::ApiError => e
  puts "Error when calling AdminUsergroupsApi->admin_usergroups_remove_channels: #{e}"
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
  puts "Error when calling AdminUsergroupsApi->admin_usergroups_remove_channels_with_http_info: #{e}"
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

