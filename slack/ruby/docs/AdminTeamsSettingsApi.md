# slack::AdminTeamsSettingsApi

All URIs are relative to *https://slack.com/api*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**admin_teams_settings_info**](AdminTeamsSettingsApi.md#admin_teams_settings_info) | **GET** /admin.teams.settings.info |  |
| [**admin_teams_settings_set_default_channels**](AdminTeamsSettingsApi.md#admin_teams_settings_set_default_channels) | **POST** /admin.teams.settings.setDefaultChannels |  |
| [**admin_teams_settings_set_description**](AdminTeamsSettingsApi.md#admin_teams_settings_set_description) | **POST** /admin.teams.settings.setDescription |  |
| [**admin_teams_settings_set_discoverability**](AdminTeamsSettingsApi.md#admin_teams_settings_set_discoverability) | **POST** /admin.teams.settings.setDiscoverability |  |
| [**admin_teams_settings_set_icon**](AdminTeamsSettingsApi.md#admin_teams_settings_set_icon) | **POST** /admin.teams.settings.setIcon |  |
| [**admin_teams_settings_set_name**](AdminTeamsSettingsApi.md#admin_teams_settings_set_name) | **POST** /admin.teams.settings.setName |  |


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

api_instance = slack::AdminTeamsSettingsApi.new
token = 'token_example' # String | Authentication token. Requires scope: `admin.teams:read`
team_id = 'team_id_example' # String | 

begin
  
  result = api_instance.admin_teams_settings_info(token, team_id)
  p result
rescue slack::ApiError => e
  puts "Error when calling AdminTeamsSettingsApi->admin_teams_settings_info: #{e}"
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
  puts "Error when calling AdminTeamsSettingsApi->admin_teams_settings_info_with_http_info: #{e}"
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

api_instance = slack::AdminTeamsSettingsApi.new
channel_ids = 'channel_ids_example' # String | An array of channel IDs.
team_id = 'team_id_example' # String | ID for the workspace to set the default channel for.
token = 'token_example' # String | Authentication token. Requires scope: `admin.teams:write`

begin
  
  result = api_instance.admin_teams_settings_set_default_channels(channel_ids, team_id, token)
  p result
rescue slack::ApiError => e
  puts "Error when calling AdminTeamsSettingsApi->admin_teams_settings_set_default_channels: #{e}"
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
  puts "Error when calling AdminTeamsSettingsApi->admin_teams_settings_set_default_channels_with_http_info: #{e}"
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

api_instance = slack::AdminTeamsSettingsApi.new
token = 'token_example' # String | Authentication token. Requires scope: `admin.teams:write`
description = 'description_example' # String | The new description for the workspace.
team_id = 'team_id_example' # String | ID for the workspace to set the description for.

begin
  
  result = api_instance.admin_teams_settings_set_description(token, description, team_id)
  p result
rescue slack::ApiError => e
  puts "Error when calling AdminTeamsSettingsApi->admin_teams_settings_set_description: #{e}"
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
  puts "Error when calling AdminTeamsSettingsApi->admin_teams_settings_set_description_with_http_info: #{e}"
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

api_instance = slack::AdminTeamsSettingsApi.new
token = 'token_example' # String | Authentication token. Requires scope: `admin.teams:write`
discoverability = 'discoverability_example' # String | This workspace's discovery setting. It must be set to one of `open`, `invite_only`, `closed`, or `unlisted`.
team_id = 'team_id_example' # String | The ID of the workspace to set discoverability on.

begin
  
  result = api_instance.admin_teams_settings_set_discoverability(token, discoverability, team_id)
  p result
rescue slack::ApiError => e
  puts "Error when calling AdminTeamsSettingsApi->admin_teams_settings_set_discoverability: #{e}"
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
  puts "Error when calling AdminTeamsSettingsApi->admin_teams_settings_set_discoverability_with_http_info: #{e}"
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

api_instance = slack::AdminTeamsSettingsApi.new
image_url = 'image_url_example' # String | Image URL for the icon
team_id = 'team_id_example' # String | ID for the workspace to set the icon for.
token = 'token_example' # String | Authentication token. Requires scope: `admin.teams:write`

begin
  
  result = api_instance.admin_teams_settings_set_icon(image_url, team_id, token)
  p result
rescue slack::ApiError => e
  puts "Error when calling AdminTeamsSettingsApi->admin_teams_settings_set_icon: #{e}"
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
  puts "Error when calling AdminTeamsSettingsApi->admin_teams_settings_set_icon_with_http_info: #{e}"
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

api_instance = slack::AdminTeamsSettingsApi.new
token = 'token_example' # String | Authentication token. Requires scope: `admin.teams:write`
name = 'name_example' # String | The new name of the workspace.
team_id = 'team_id_example' # String | ID for the workspace to set the name for.

begin
  
  result = api_instance.admin_teams_settings_set_name(token, name, team_id)
  p result
rescue slack::ApiError => e
  puts "Error when calling AdminTeamsSettingsApi->admin_teams_settings_set_name: #{e}"
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
  puts "Error when calling AdminTeamsSettingsApi->admin_teams_settings_set_name_with_http_info: #{e}"
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

