# slack::AdminTeamsApi

All URIs are relative to *https://slack.com/api*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**admin_teams_create**](AdminTeamsApi.md#admin_teams_create) | **POST** /admin.teams.create |  |
| [**admin_teams_list**](AdminTeamsApi.md#admin_teams_list) | **GET** /admin.teams.list |  |


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

api_instance = slack::AdminTeamsApi.new
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
  puts "Error when calling AdminTeamsApi->admin_teams_create: #{e}"
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
  puts "Error when calling AdminTeamsApi->admin_teams_create_with_http_info: #{e}"
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

api_instance = slack::AdminTeamsApi.new
token = 'token_example' # String | Authentication token. Requires scope: `admin.teams:read`
opts = {
  limit: 56, # Integer | The maximum number of items to return. Must be between 1 - 100 both inclusive.
  cursor: 'cursor_example' # String | Set `cursor` to `next_cursor` returned by the previous call to list items in the next page.
}

begin
  
  result = api_instance.admin_teams_list(token, opts)
  p result
rescue slack::ApiError => e
  puts "Error when calling AdminTeamsApi->admin_teams_list: #{e}"
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
  puts "Error when calling AdminTeamsApi->admin_teams_list_with_http_info: #{e}"
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

