# slack::AdminAppsRequestsApi

All URIs are relative to *https://slack.com/api*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**admin_apps_requests_list**](AdminAppsRequestsApi.md#admin_apps_requests_list) | **GET** /admin.apps.requests.list |  |


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

api_instance = slack::AdminAppsRequestsApi.new
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
  puts "Error when calling AdminAppsRequestsApi->admin_apps_requests_list: #{e}"
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
  puts "Error when calling AdminAppsRequestsApi->admin_apps_requests_list_with_http_info: #{e}"
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

