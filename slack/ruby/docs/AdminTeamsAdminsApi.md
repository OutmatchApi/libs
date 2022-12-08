# slack::AdminTeamsAdminsApi

All URIs are relative to *https://slack.com/api*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**admin_teams_admins_list**](AdminTeamsAdminsApi.md#admin_teams_admins_list) | **GET** /admin.teams.admins.list |  |


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

api_instance = slack::AdminTeamsAdminsApi.new
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
  puts "Error when calling AdminTeamsAdminsApi->admin_teams_admins_list: #{e}"
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
  puts "Error when calling AdminTeamsAdminsApi->admin_teams_admins_list_with_http_info: #{e}"
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

