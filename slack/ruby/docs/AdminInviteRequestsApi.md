# slack::AdminInviteRequestsApi

All URIs are relative to *https://slack.com/api*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**admin_invite_requests_approve**](AdminInviteRequestsApi.md#admin_invite_requests_approve) | **POST** /admin.inviteRequests.approve |  |
| [**admin_invite_requests_deny**](AdminInviteRequestsApi.md#admin_invite_requests_deny) | **POST** /admin.inviteRequests.deny |  |
| [**admin_invite_requests_list**](AdminInviteRequestsApi.md#admin_invite_requests_list) | **GET** /admin.inviteRequests.list |  |


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

api_instance = slack::AdminInviteRequestsApi.new
token = 'token_example' # String | Authentication token. Requires scope: `admin.invites:write`
opts = {
  admin_invite_requests_approve_request: TODO # AdminInviteRequestsApproveRequest | 
}

begin
  
  result = api_instance.admin_invite_requests_approve(token, opts)
  p result
rescue slack::ApiError => e
  puts "Error when calling AdminInviteRequestsApi->admin_invite_requests_approve: #{e}"
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
  puts "Error when calling AdminInviteRequestsApi->admin_invite_requests_approve_with_http_info: #{e}"
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

api_instance = slack::AdminInviteRequestsApi.new
token = 'token_example' # String | Authentication token. Requires scope: `admin.invites:write`
opts = {
  admin_invite_requests_approve_request: TODO # AdminInviteRequestsApproveRequest | 
}

begin
  
  result = api_instance.admin_invite_requests_deny(token, opts)
  p result
rescue slack::ApiError => e
  puts "Error when calling AdminInviteRequestsApi->admin_invite_requests_deny: #{e}"
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
  puts "Error when calling AdminInviteRequestsApi->admin_invite_requests_deny_with_http_info: #{e}"
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

api_instance = slack::AdminInviteRequestsApi.new
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
  puts "Error when calling AdminInviteRequestsApi->admin_invite_requests_list: #{e}"
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
  puts "Error when calling AdminInviteRequestsApi->admin_invite_requests_list_with_http_info: #{e}"
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

