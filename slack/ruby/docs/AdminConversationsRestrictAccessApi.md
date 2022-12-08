# slack::AdminConversationsRestrictAccessApi

All URIs are relative to *https://slack.com/api*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**admin_conversations_restrict_access_add_group**](AdminConversationsRestrictAccessApi.md#admin_conversations_restrict_access_add_group) | **POST** /admin.conversations.restrictAccess.addGroup |  |
| [**admin_conversations_restrict_access_list_groups**](AdminConversationsRestrictAccessApi.md#admin_conversations_restrict_access_list_groups) | **GET** /admin.conversations.restrictAccess.listGroups |  |
| [**admin_conversations_restrict_access_remove_group**](AdminConversationsRestrictAccessApi.md#admin_conversations_restrict_access_remove_group) | **POST** /admin.conversations.restrictAccess.removeGroup |  |


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

api_instance = slack::AdminConversationsRestrictAccessApi.new
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
  puts "Error when calling AdminConversationsRestrictAccessApi->admin_conversations_restrict_access_add_group: #{e}"
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
  puts "Error when calling AdminConversationsRestrictAccessApi->admin_conversations_restrict_access_add_group_with_http_info: #{e}"
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

api_instance = slack::AdminConversationsRestrictAccessApi.new
token = 'token_example' # String | Authentication token. Requires scope: `admin.conversations:read`
channel_id = 'channel_id_example' # String | 
opts = {
  team_id: 'team_id_example' # String | The workspace where the channel exists. This argument is required for channels only tied to one workspace, and optional for channels that are shared across an organization.
}

begin
  
  result = api_instance.admin_conversations_restrict_access_list_groups(token, channel_id, opts)
  p result
rescue slack::ApiError => e
  puts "Error when calling AdminConversationsRestrictAccessApi->admin_conversations_restrict_access_list_groups: #{e}"
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
  puts "Error when calling AdminConversationsRestrictAccessApi->admin_conversations_restrict_access_list_groups_with_http_info: #{e}"
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

api_instance = slack::AdminConversationsRestrictAccessApi.new
channel_id = 'channel_id_example' # String | The channel to remove the linked group from.
group_id = 'group_id_example' # String | The [IDP Group](https://slack.com/help/articles/115001435788-Connect-identity-provider-groups-to-your-Enterprise-Grid-org) ID to remove from the private channel.
team_id = 'team_id_example' # String | The workspace where the channel exists. This argument is required for channels only tied to one workspace, and optional for channels that are shared across an organization.
token = 'token_example' # String | Authentication token. Requires scope: `admin.conversations:write`

begin
  
  result = api_instance.admin_conversations_restrict_access_remove_group(channel_id, group_id, team_id, token)
  p result
rescue slack::ApiError => e
  puts "Error when calling AdminConversationsRestrictAccessApi->admin_conversations_restrict_access_remove_group: #{e}"
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
  puts "Error when calling AdminConversationsRestrictAccessApi->admin_conversations_restrict_access_remove_group_with_http_info: #{e}"
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

