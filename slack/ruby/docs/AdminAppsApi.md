# slack::AdminAppsApi

All URIs are relative to *https://slack.com/api*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**admin_apps_approve**](AdminAppsApi.md#admin_apps_approve) | **POST** /admin.apps.approve |  |
| [**admin_apps_restrict**](AdminAppsApi.md#admin_apps_restrict) | **POST** /admin.apps.restrict |  |


## admin_apps_approve

> <DefaultSuccessTemplate> admin_apps_approve(token, opts)



Approve an app for installation on a workspace.

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::AdminAppsApi.new
token = 'token_example' # String | Authentication token. Requires scope: `admin.apps:write`
opts = {
  app_id: 'app_id_example', # String | The id of the app to approve.
  request_id: 'request_id_example', # String | The id of the request to approve.
  team_id: 'team_id_example' # String | 
}

begin
  
  result = api_instance.admin_apps_approve(token, opts)
  p result
rescue slack::ApiError => e
  puts "Error when calling AdminAppsApi->admin_apps_approve: #{e}"
end
```

#### Using the admin_apps_approve_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<DefaultSuccessTemplate>, Integer, Hash)> admin_apps_approve_with_http_info(token, opts)

```ruby
begin
  
  data, status_code, headers = api_instance.admin_apps_approve_with_http_info(token, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <DefaultSuccessTemplate>
rescue slack::ApiError => e
  puts "Error when calling AdminAppsApi->admin_apps_approve_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;admin.apps:write&#x60; |  |
| **app_id** | **String** | The id of the app to approve. | [optional] |
| **request_id** | **String** | The id of the request to approve. | [optional] |
| **team_id** | **String** |  | [optional] |

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json


## admin_apps_restrict

> <DefaultSuccessTemplate> admin_apps_restrict(token, opts)



Restrict an app for installation on a workspace.

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::AdminAppsApi.new
token = 'token_example' # String | Authentication token. Requires scope: `admin.apps:write`
opts = {
  app_id: 'app_id_example', # String | The id of the app to restrict.
  request_id: 'request_id_example', # String | The id of the request to restrict.
  team_id: 'team_id_example' # String | 
}

begin
  
  result = api_instance.admin_apps_restrict(token, opts)
  p result
rescue slack::ApiError => e
  puts "Error when calling AdminAppsApi->admin_apps_restrict: #{e}"
end
```

#### Using the admin_apps_restrict_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<DefaultSuccessTemplate>, Integer, Hash)> admin_apps_restrict_with_http_info(token, opts)

```ruby
begin
  
  data, status_code, headers = api_instance.admin_apps_restrict_with_http_info(token, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <DefaultSuccessTemplate>
rescue slack::ApiError => e
  puts "Error when calling AdminAppsApi->admin_apps_restrict_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;admin.apps:write&#x60; |  |
| **app_id** | **String** | The id of the app to restrict. | [optional] |
| **request_id** | **String** | The id of the request to restrict. | [optional] |
| **team_id** | **String** |  | [optional] |

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json

