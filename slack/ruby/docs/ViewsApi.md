# slack::ViewsApi

All URIs are relative to *https://slack.com/api*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**views_open**](ViewsApi.md#views_open) | **GET** /views.open |  |
| [**views_publish**](ViewsApi.md#views_publish) | **GET** /views.publish |  |
| [**views_push**](ViewsApi.md#views_push) | **GET** /views.push |  |
| [**views_update**](ViewsApi.md#views_update) | **GET** /views.update |  |


## views_open

> <DefaultSuccessTemplate> views_open(token, trigger_id, view)



Open a view for a user.

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::ViewsApi.new
token = 'token_example' # String | Authentication token. Requires scope: `none`
trigger_id = 'trigger_id_example' # String | Exchange a trigger to post to the user.
view = 'view_example' # String | A [view payload](/reference/surfaces/views). This must be a JSON-encoded string.

begin
  
  result = api_instance.views_open(token, trigger_id, view)
  p result
rescue slack::ApiError => e
  puts "Error when calling ViewsApi->views_open: #{e}"
end
```

#### Using the views_open_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<DefaultSuccessTemplate>, Integer, Hash)> views_open_with_http_info(token, trigger_id, view)

```ruby
begin
  
  data, status_code, headers = api_instance.views_open_with_http_info(token, trigger_id, view)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <DefaultSuccessTemplate>
rescue slack::ApiError => e
  puts "Error when calling ViewsApi->views_open_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;none&#x60; |  |
| **trigger_id** | **String** | Exchange a trigger to post to the user. |  |
| **view** | **String** | A [view payload](/reference/surfaces/views). This must be a JSON-encoded string. |  |

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## views_publish

> <DefaultSuccessTemplate> views_publish(token, user_id, view, opts)



Publish a static view for a User.

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::ViewsApi.new
token = 'token_example' # String | Authentication token. Requires scope: `none`
user_id = 'user_id_example' # String | `id` of the user you want publish a view to.
view = 'view_example' # String | A [view payload](/reference/surfaces/views). This must be a JSON-encoded string.
opts = {
  hash: 'hash_example' # String | A string that represents view state to protect against possible race conditions.
}

begin
  
  result = api_instance.views_publish(token, user_id, view, opts)
  p result
rescue slack::ApiError => e
  puts "Error when calling ViewsApi->views_publish: #{e}"
end
```

#### Using the views_publish_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<DefaultSuccessTemplate>, Integer, Hash)> views_publish_with_http_info(token, user_id, view, opts)

```ruby
begin
  
  data, status_code, headers = api_instance.views_publish_with_http_info(token, user_id, view, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <DefaultSuccessTemplate>
rescue slack::ApiError => e
  puts "Error when calling ViewsApi->views_publish_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;none&#x60; |  |
| **user_id** | **String** | &#x60;id&#x60; of the user you want publish a view to. |  |
| **view** | **String** | A [view payload](/reference/surfaces/views). This must be a JSON-encoded string. |  |
| **hash** | **String** | A string that represents view state to protect against possible race conditions. | [optional] |

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## views_push

> <DefaultSuccessTemplate> views_push(token, trigger_id, view)



Push a view onto the stack of a root view.

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::ViewsApi.new
token = 'token_example' # String | Authentication token. Requires scope: `none`
trigger_id = 'trigger_id_example' # String | Exchange a trigger to post to the user.
view = 'view_example' # String | A [view payload](/reference/surfaces/views). This must be a JSON-encoded string.

begin
  
  result = api_instance.views_push(token, trigger_id, view)
  p result
rescue slack::ApiError => e
  puts "Error when calling ViewsApi->views_push: #{e}"
end
```

#### Using the views_push_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<DefaultSuccessTemplate>, Integer, Hash)> views_push_with_http_info(token, trigger_id, view)

```ruby
begin
  
  data, status_code, headers = api_instance.views_push_with_http_info(token, trigger_id, view)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <DefaultSuccessTemplate>
rescue slack::ApiError => e
  puts "Error when calling ViewsApi->views_push_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;none&#x60; |  |
| **trigger_id** | **String** | Exchange a trigger to post to the user. |  |
| **view** | **String** | A [view payload](/reference/surfaces/views). This must be a JSON-encoded string. |  |

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## views_update

> <DefaultSuccessTemplate> views_update(token, opts)



Update an existing view.

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::ViewsApi.new
token = 'token_example' # String | Authentication token. Requires scope: `none`
opts = {
  view_id: 'view_id_example', # String | A unique identifier of the view to be updated. Either `view_id` or `external_id` is required.
  external_id: 'external_id_example', # String | A unique identifier of the view set by the developer. Must be unique for all views on a team. Max length of 255 characters. Either `view_id` or `external_id` is required.
  view: 'view_example', # String | A [view object](/reference/surfaces/views). This must be a JSON-encoded string.
  hash: 'hash_example' # String | A string that represents view state to protect against possible race conditions.
}

begin
  
  result = api_instance.views_update(token, opts)
  p result
rescue slack::ApiError => e
  puts "Error when calling ViewsApi->views_update: #{e}"
end
```

#### Using the views_update_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<DefaultSuccessTemplate>, Integer, Hash)> views_update_with_http_info(token, opts)

```ruby
begin
  
  data, status_code, headers = api_instance.views_update_with_http_info(token, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <DefaultSuccessTemplate>
rescue slack::ApiError => e
  puts "Error when calling ViewsApi->views_update_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;none&#x60; |  |
| **view_id** | **String** | A unique identifier of the view to be updated. Either &#x60;view_id&#x60; or &#x60;external_id&#x60; is required. | [optional] |
| **external_id** | **String** | A unique identifier of the view set by the developer. Must be unique for all views on a team. Max length of 255 characters. Either &#x60;view_id&#x60; or &#x60;external_id&#x60; is required. | [optional] |
| **view** | **String** | A [view object](/reference/surfaces/views). This must be a JSON-encoded string. | [optional] |
| **hash** | **String** | A string that represents view state to protect against possible race conditions. | [optional] |

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

