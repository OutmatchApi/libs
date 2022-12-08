# slack::AppsPermissionsApi

All URIs are relative to *https://slack.com/api*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**apps_permissions_info**](AppsPermissionsApi.md#apps_permissions_info) | **GET** /apps.permissions.info |  |
| [**apps_permissions_request**](AppsPermissionsApi.md#apps_permissions_request) | **GET** /apps.permissions.request |  |


## apps_permissions_info

> <AppsPermissionsInfoSchema> apps_permissions_info(opts)



Returns list of permissions this app has on a team.

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::AppsPermissionsApi.new
opts = {
  token: 'token_example' # String | Authentication token. Requires scope: `none`
}

begin
  
  result = api_instance.apps_permissions_info(opts)
  p result
rescue slack::ApiError => e
  puts "Error when calling AppsPermissionsApi->apps_permissions_info: #{e}"
end
```

#### Using the apps_permissions_info_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<AppsPermissionsInfoSchema>, Integer, Hash)> apps_permissions_info_with_http_info(opts)

```ruby
begin
  
  data, status_code, headers = api_instance.apps_permissions_info_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <AppsPermissionsInfoSchema>
rescue slack::ApiError => e
  puts "Error when calling AppsPermissionsApi->apps_permissions_info_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;none&#x60; | [optional] |

### Return type

[**AppsPermissionsInfoSchema**](AppsPermissionsInfoSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## apps_permissions_request

> <AppsPermissionsRequestSchema> apps_permissions_request(token, scopes, trigger_id)



Allows an app to request additional scopes

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::AppsPermissionsApi.new
token = 'token_example' # String | Authentication token. Requires scope: `none`
scopes = 'scopes_example' # String | A comma separated list of scopes to request for
trigger_id = 'trigger_id_example' # String | Token used to trigger the permissions API

begin
  
  result = api_instance.apps_permissions_request(token, scopes, trigger_id)
  p result
rescue slack::ApiError => e
  puts "Error when calling AppsPermissionsApi->apps_permissions_request: #{e}"
end
```

#### Using the apps_permissions_request_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<AppsPermissionsRequestSchema>, Integer, Hash)> apps_permissions_request_with_http_info(token, scopes, trigger_id)

```ruby
begin
  
  data, status_code, headers = api_instance.apps_permissions_request_with_http_info(token, scopes, trigger_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <AppsPermissionsRequestSchema>
rescue slack::ApiError => e
  puts "Error when calling AppsPermissionsApi->apps_permissions_request_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;none&#x60; |  |
| **scopes** | **String** | A comma separated list of scopes to request for |  |
| **trigger_id** | **String** | Token used to trigger the permissions API |  |

### Return type

[**AppsPermissionsRequestSchema**](AppsPermissionsRequestSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

