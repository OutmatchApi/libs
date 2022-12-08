# slack::AppsApi

All URIs are relative to *https://slack.com/api*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**apps_event_authorizations_list**](AppsApi.md#apps_event_authorizations_list) | **GET** /apps.event.authorizations.list |  |
| [**apps_permissions_info**](AppsApi.md#apps_permissions_info) | **GET** /apps.permissions.info |  |
| [**apps_permissions_request**](AppsApi.md#apps_permissions_request) | **GET** /apps.permissions.request |  |
| [**apps_permissions_resources_list**](AppsApi.md#apps_permissions_resources_list) | **GET** /apps.permissions.resources.list |  |
| [**apps_permissions_scopes_list**](AppsApi.md#apps_permissions_scopes_list) | **GET** /apps.permissions.scopes.list |  |
| [**apps_permissions_users_list**](AppsApi.md#apps_permissions_users_list) | **GET** /apps.permissions.users.list |  |
| [**apps_permissions_users_request**](AppsApi.md#apps_permissions_users_request) | **GET** /apps.permissions.users.request |  |
| [**apps_uninstall**](AppsApi.md#apps_uninstall) | **GET** /apps.uninstall |  |


## apps_event_authorizations_list

> <DefaultSuccessTemplate> apps_event_authorizations_list(token, event_context, opts)



Get a list of authorizations for the given event context. Each authorization represents an app installation that the event is visible to.

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::AppsApi.new
token = 'token_example' # String | Authentication token. Requires scope: `authorizations:read`
event_context = 'event_context_example' # String | 
opts = {
  cursor: 'cursor_example', # String | 
  limit: 56 # Integer | 
}

begin
  
  result = api_instance.apps_event_authorizations_list(token, event_context, opts)
  p result
rescue slack::ApiError => e
  puts "Error when calling AppsApi->apps_event_authorizations_list: #{e}"
end
```

#### Using the apps_event_authorizations_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<DefaultSuccessTemplate>, Integer, Hash)> apps_event_authorizations_list_with_http_info(token, event_context, opts)

```ruby
begin
  
  data, status_code, headers = api_instance.apps_event_authorizations_list_with_http_info(token, event_context, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <DefaultSuccessTemplate>
rescue slack::ApiError => e
  puts "Error when calling AppsApi->apps_event_authorizations_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;authorizations:read&#x60; |  |
| **event_context** | **String** |  |  |
| **cursor** | **String** |  | [optional] |
| **limit** | **Integer** |  | [optional] |

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


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

api_instance = slack::AppsApi.new
opts = {
  token: 'token_example' # String | Authentication token. Requires scope: `none`
}

begin
  
  result = api_instance.apps_permissions_info(opts)
  p result
rescue slack::ApiError => e
  puts "Error when calling AppsApi->apps_permissions_info: #{e}"
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
  puts "Error when calling AppsApi->apps_permissions_info_with_http_info: #{e}"
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

api_instance = slack::AppsApi.new
token = 'token_example' # String | Authentication token. Requires scope: `none`
scopes = 'scopes_example' # String | A comma separated list of scopes to request for
trigger_id = 'trigger_id_example' # String | Token used to trigger the permissions API

begin
  
  result = api_instance.apps_permissions_request(token, scopes, trigger_id)
  p result
rescue slack::ApiError => e
  puts "Error when calling AppsApi->apps_permissions_request: #{e}"
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
  puts "Error when calling AppsApi->apps_permissions_request_with_http_info: #{e}"
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


## apps_permissions_resources_list

> <AppsPermissionsResourcesListSuccessSchema> apps_permissions_resources_list(token, opts)



Returns list of resource grants this app has on a team.

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::AppsApi.new
token = 'token_example' # String | Authentication token. Requires scope: `none`
opts = {
  cursor: 'cursor_example', # String | Paginate through collections of data by setting the `cursor` parameter to a `next_cursor` attribute returned by a previous request's `response_metadata`. Default value fetches the first \"page\" of the collection. See [pagination](/docs/pagination) for more detail.
  limit: 56 # Integer | The maximum number of items to return.
}

begin
  
  result = api_instance.apps_permissions_resources_list(token, opts)
  p result
rescue slack::ApiError => e
  puts "Error when calling AppsApi->apps_permissions_resources_list: #{e}"
end
```

#### Using the apps_permissions_resources_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<AppsPermissionsResourcesListSuccessSchema>, Integer, Hash)> apps_permissions_resources_list_with_http_info(token, opts)

```ruby
begin
  
  data, status_code, headers = api_instance.apps_permissions_resources_list_with_http_info(token, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <AppsPermissionsResourcesListSuccessSchema>
rescue slack::ApiError => e
  puts "Error when calling AppsApi->apps_permissions_resources_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;none&#x60; |  |
| **cursor** | **String** | Paginate through collections of data by setting the &#x60;cursor&#x60; parameter to a &#x60;next_cursor&#x60; attribute returned by a previous request&#39;s &#x60;response_metadata&#x60;. Default value fetches the first \&quot;page\&quot; of the collection. See [pagination](/docs/pagination) for more detail. | [optional] |
| **limit** | **Integer** | The maximum number of items to return. | [optional] |

### Return type

[**AppsPermissionsResourcesListSuccessSchema**](AppsPermissionsResourcesListSuccessSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


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

api_instance = slack::AppsApi.new
token = 'token_example' # String | Authentication token. Requires scope: `none`

begin
  
  result = api_instance.apps_permissions_scopes_list(token)
  p result
rescue slack::ApiError => e
  puts "Error when calling AppsApi->apps_permissions_scopes_list: #{e}"
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
  puts "Error when calling AppsApi->apps_permissions_scopes_list_with_http_info: #{e}"
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

api_instance = slack::AppsApi.new
token = 'token_example' # String | Authentication token. Requires scope: `none`
opts = {
  cursor: 'cursor_example', # String | Paginate through collections of data by setting the `cursor` parameter to a `next_cursor` attribute returned by a previous request's `response_metadata`. Default value fetches the first \"page\" of the collection. See [pagination](/docs/pagination) for more detail.
  limit: 56 # Integer | The maximum number of items to return.
}

begin
  
  result = api_instance.apps_permissions_users_list(token, opts)
  p result
rescue slack::ApiError => e
  puts "Error when calling AppsApi->apps_permissions_users_list: #{e}"
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
  puts "Error when calling AppsApi->apps_permissions_users_list_with_http_info: #{e}"
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

api_instance = slack::AppsApi.new
token = 'token_example' # String | Authentication token. Requires scope: `none`
scopes = 'scopes_example' # String | A comma separated list of user scopes to request for
trigger_id = 'trigger_id_example' # String | Token used to trigger the request
user = 'user_example' # String | The user this scope is being requested for

begin
  
  result = api_instance.apps_permissions_users_request(token, scopes, trigger_id, user)
  p result
rescue slack::ApiError => e
  puts "Error when calling AppsApi->apps_permissions_users_request: #{e}"
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
  puts "Error when calling AppsApi->apps_permissions_users_request_with_http_info: #{e}"
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


## apps_uninstall

> <AppsUninstallSchema> apps_uninstall(opts)



Uninstalls your app from a workspace.

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::AppsApi.new
opts = {
  token: 'token_example', # String | Authentication token. Requires scope: `none`
  client_id: 'client_id_example', # String | Issued when you created your application.
  client_secret: 'client_secret_example' # String | Issued when you created your application.
}

begin
  
  result = api_instance.apps_uninstall(opts)
  p result
rescue slack::ApiError => e
  puts "Error when calling AppsApi->apps_uninstall: #{e}"
end
```

#### Using the apps_uninstall_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<AppsUninstallSchema>, Integer, Hash)> apps_uninstall_with_http_info(opts)

```ruby
begin
  
  data, status_code, headers = api_instance.apps_uninstall_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <AppsUninstallSchema>
rescue slack::ApiError => e
  puts "Error when calling AppsApi->apps_uninstall_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;none&#x60; | [optional] |
| **client_id** | **String** | Issued when you created your application. | [optional] |
| **client_secret** | **String** | Issued when you created your application. | [optional] |

### Return type

[**AppsUninstallSchema**](AppsUninstallSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

