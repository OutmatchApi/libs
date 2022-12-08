# slack::AppsPermissionsResourcesApi

All URIs are relative to *https://slack.com/api*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**apps_permissions_resources_list**](AppsPermissionsResourcesApi.md#apps_permissions_resources_list) | **GET** /apps.permissions.resources.list |  |


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

api_instance = slack::AppsPermissionsResourcesApi.new
token = 'token_example' # String | Authentication token. Requires scope: `none`
opts = {
  cursor: 'cursor_example', # String | Paginate through collections of data by setting the `cursor` parameter to a `next_cursor` attribute returned by a previous request's `response_metadata`. Default value fetches the first \"page\" of the collection. See [pagination](/docs/pagination) for more detail.
  limit: 56 # Integer | The maximum number of items to return.
}

begin
  
  result = api_instance.apps_permissions_resources_list(token, opts)
  p result
rescue slack::ApiError => e
  puts "Error when calling AppsPermissionsResourcesApi->apps_permissions_resources_list: #{e}"
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
  puts "Error when calling AppsPermissionsResourcesApi->apps_permissions_resources_list_with_http_info: #{e}"
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

