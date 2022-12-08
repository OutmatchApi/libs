# slack::AdminInviteRequestsDeniedApi

All URIs are relative to *https://slack.com/api*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**admin_invite_requests_denied_list**](AdminInviteRequestsDeniedApi.md#admin_invite_requests_denied_list) | **GET** /admin.inviteRequests.denied.list |  |


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

api_instance = slack::AdminInviteRequestsDeniedApi.new
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
  puts "Error when calling AdminInviteRequestsDeniedApi->admin_invite_requests_denied_list: #{e}"
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
  puts "Error when calling AdminInviteRequestsDeniedApi->admin_invite_requests_denied_list_with_http_info: #{e}"
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

