# slack::AppsPermissionsUsersApi

All URIs are relative to *https://slack.com/api*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**apps_permissions_users_list**](AppsPermissionsUsersApi.md#apps_permissions_users_list) | **GET** /apps.permissions.users.list |  |
| [**apps_permissions_users_request**](AppsPermissionsUsersApi.md#apps_permissions_users_request) | **GET** /apps.permissions.users.request |  |


## apps_permissions_users_list

> <DefaultSuccessTemplate> apps_permissions_users_list(token, opts)



Returns list of user grants and corresponding scopes this app has on a team.

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::AppsPermissionsUsersApi.new
token = 'token_example' # String | Authentication token. Requires scope: `none`
opts = {
  cursor: 'cursor_example', # String | Paginate through collections of data by setting the `cursor` parameter to a `next_cursor` attribute returned by a previous request's `response_metadata`. Default value fetches the first \"page\" of the collection. See [pagination](/docs/pagination) for more detail.
  limit: 56 # Integer | The maximum number of items to return.
}

begin
  
  result = api_instance.apps_permissions_users_list(token, opts)
  p result
rescue slack::ApiError => e
  puts "Error when calling AppsPermissionsUsersApi->apps_permissions_users_list: #{e}"
end
```

#### Using the apps_permissions_users_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<DefaultSuccessTemplate>, Integer, Hash)> apps_permissions_users_list_with_http_info(token, opts)

```ruby
begin
  
  data, status_code, headers = api_instance.apps_permissions_users_list_with_http_info(token, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <DefaultSuccessTemplate>
rescue slack::ApiError => e
  puts "Error when calling AppsPermissionsUsersApi->apps_permissions_users_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;none&#x60; |  |
| **cursor** | **String** | Paginate through collections of data by setting the &#x60;cursor&#x60; parameter to a &#x60;next_cursor&#x60; attribute returned by a previous request&#39;s &#x60;response_metadata&#x60;. Default value fetches the first \&quot;page\&quot; of the collection. See [pagination](/docs/pagination) for more detail. | [optional] |
| **limit** | **Integer** | The maximum number of items to return. | [optional] |

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## apps_permissions_users_request

> <DefaultSuccessTemplate> apps_permissions_users_request(token, scopes, trigger_id, user)



Enables an app to trigger a permissions modal to grant an app access to a user access scope.

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::AppsPermissionsUsersApi.new
token = 'token_example' # String | Authentication token. Requires scope: `none`
scopes = 'scopes_example' # String | A comma separated list of user scopes to request for
trigger_id = 'trigger_id_example' # String | Token used to trigger the request
user = 'user_example' # String | The user this scope is being requested for

begin
  
  result = api_instance.apps_permissions_users_request(token, scopes, trigger_id, user)
  p result
rescue slack::ApiError => e
  puts "Error when calling AppsPermissionsUsersApi->apps_permissions_users_request: #{e}"
end
```

#### Using the apps_permissions_users_request_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<DefaultSuccessTemplate>, Integer, Hash)> apps_permissions_users_request_with_http_info(token, scopes, trigger_id, user)

```ruby
begin
  
  data, status_code, headers = api_instance.apps_permissions_users_request_with_http_info(token, scopes, trigger_id, user)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <DefaultSuccessTemplate>
rescue slack::ApiError => e
  puts "Error when calling AppsPermissionsUsersApi->apps_permissions_users_request_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;none&#x60; |  |
| **scopes** | **String** | A comma separated list of user scopes to request for |  |
| **trigger_id** | **String** | Token used to trigger the request |  |
| **user** | **String** | The user this scope is being requested for |  |

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

