# slack::AppsPermissionsScopesApi

All URIs are relative to *https://slack.com/api*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**apps_permissions_scopes_list**](AppsPermissionsScopesApi.md#apps_permissions_scopes_list) | **GET** /apps.permissions.scopes.list |  |


## apps_permissions_scopes_list

> <ApiPermissionsScopesListSuccessSchema> apps_permissions_scopes_list(token)



Returns list of scopes this app has on a team.

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::AppsPermissionsScopesApi.new
token = 'token_example' # String | Authentication token. Requires scope: `none`

begin
  
  result = api_instance.apps_permissions_scopes_list(token)
  p result
rescue slack::ApiError => e
  puts "Error when calling AppsPermissionsScopesApi->apps_permissions_scopes_list: #{e}"
end
```

#### Using the apps_permissions_scopes_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<ApiPermissionsScopesListSuccessSchema>, Integer, Hash)> apps_permissions_scopes_list_with_http_info(token)

```ruby
begin
  
  data, status_code, headers = api_instance.apps_permissions_scopes_list_with_http_info(token)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <ApiPermissionsScopesListSuccessSchema>
rescue slack::ApiError => e
  puts "Error when calling AppsPermissionsScopesApi->apps_permissions_scopes_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;none&#x60; |  |

### Return type

[**ApiPermissionsScopesListSuccessSchema**](ApiPermissionsScopesListSuccessSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

