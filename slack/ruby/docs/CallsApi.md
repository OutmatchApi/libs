# slack::CallsApi

All URIs are relative to *https://slack.com/api*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**calls_add**](CallsApi.md#calls_add) | **POST** /calls.add |  |
| [**calls_end**](CallsApi.md#calls_end) | **POST** /calls.end |  |
| [**calls_info**](CallsApi.md#calls_info) | **GET** /calls.info |  |
| [**calls_participants_add**](CallsApi.md#calls_participants_add) | **POST** /calls.participants.add |  |
| [**calls_participants_remove**](CallsApi.md#calls_participants_remove) | **POST** /calls.participants.remove |  |
| [**calls_update**](CallsApi.md#calls_update) | **POST** /calls.update |  |


## calls_add

> <DefaultSuccessTemplate> calls_add(token, external_unique_id, join_url, opts)



Registers a new Call.

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::CallsApi.new
token = 'token_example' # String | Authentication token. Requires scope: `calls:write`
external_unique_id = 'external_unique_id_example' # String | An ID supplied by the 3rd-party Call provider. It must be unique across all Calls from that service.
join_url = 'join_url_example' # String | The URL required for a client to join the Call.
opts = {
  created_by: 'created_by_example', # String | The valid Slack user ID of the user who created this Call. When this method is called with a user token, the `created_by` field is optional and defaults to the authed user of the token. Otherwise, the field is required.
  date_start: 56, # Integer | Call start time in UTC UNIX timestamp format
  desktop_app_join_url: 'desktop_app_join_url_example', # String | When supplied, available Slack clients will attempt to directly launch the 3rd-party Call with this URL.
  external_display_id: 'external_display_id_example', # String | An optional, human-readable ID supplied by the 3rd-party Call provider. If supplied, this ID will be displayed in the Call object.
  title: 'title_example', # String | The name of the Call.
  users: 'users_example' # String | The list of users to register as participants in the Call. [Read more on how to specify users here](/apis/calls#users).
}

begin
  
  result = api_instance.calls_add(token, external_unique_id, join_url, opts)
  p result
rescue slack::ApiError => e
  puts "Error when calling CallsApi->calls_add: #{e}"
end
```

#### Using the calls_add_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<DefaultSuccessTemplate>, Integer, Hash)> calls_add_with_http_info(token, external_unique_id, join_url, opts)

```ruby
begin
  
  data, status_code, headers = api_instance.calls_add_with_http_info(token, external_unique_id, join_url, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <DefaultSuccessTemplate>
rescue slack::ApiError => e
  puts "Error when calling CallsApi->calls_add_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;calls:write&#x60; |  |
| **external_unique_id** | **String** | An ID supplied by the 3rd-party Call provider. It must be unique across all Calls from that service. |  |
| **join_url** | **String** | The URL required for a client to join the Call. |  |
| **created_by** | **String** | The valid Slack user ID of the user who created this Call. When this method is called with a user token, the &#x60;created_by&#x60; field is optional and defaults to the authed user of the token. Otherwise, the field is required. | [optional] |
| **date_start** | **Integer** | Call start time in UTC UNIX timestamp format | [optional] |
| **desktop_app_join_url** | **String** | When supplied, available Slack clients will attempt to directly launch the 3rd-party Call with this URL. | [optional] |
| **external_display_id** | **String** | An optional, human-readable ID supplied by the 3rd-party Call provider. If supplied, this ID will be displayed in the Call object. | [optional] |
| **title** | **String** | The name of the Call. | [optional] |
| **users** | **String** | The list of users to register as participants in the Call. [Read more on how to specify users here](/apis/calls#users). | [optional] |

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json


## calls_end

> <DefaultSuccessTemplate> calls_end(token, id, opts)



Ends a Call.

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::CallsApi.new
token = 'token_example' # String | Authentication token. Requires scope: `calls:write`
id = 'id_example' # String | `id` returned when registering the call using the [`calls.add`](/methods/calls.add) method.
opts = {
  duration: 56 # Integer | Call duration in seconds
}

begin
  
  result = api_instance.calls_end(token, id, opts)
  p result
rescue slack::ApiError => e
  puts "Error when calling CallsApi->calls_end: #{e}"
end
```

#### Using the calls_end_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<DefaultSuccessTemplate>, Integer, Hash)> calls_end_with_http_info(token, id, opts)

```ruby
begin
  
  data, status_code, headers = api_instance.calls_end_with_http_info(token, id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <DefaultSuccessTemplate>
rescue slack::ApiError => e
  puts "Error when calling CallsApi->calls_end_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;calls:write&#x60; |  |
| **id** | **String** | &#x60;id&#x60; returned when registering the call using the [&#x60;calls.add&#x60;](/methods/calls.add) method. |  |
| **duration** | **Integer** | Call duration in seconds | [optional] |

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json


## calls_info

> <DefaultSuccessTemplate> calls_info(token, id)



Returns information about a Call.

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::CallsApi.new
token = 'token_example' # String | Authentication token. Requires scope: `calls:read`
id = 'id_example' # String | `id` of the Call returned by the [`calls.add`](/methods/calls.add) method.

begin
  
  result = api_instance.calls_info(token, id)
  p result
rescue slack::ApiError => e
  puts "Error when calling CallsApi->calls_info: #{e}"
end
```

#### Using the calls_info_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<DefaultSuccessTemplate>, Integer, Hash)> calls_info_with_http_info(token, id)

```ruby
begin
  
  data, status_code, headers = api_instance.calls_info_with_http_info(token, id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <DefaultSuccessTemplate>
rescue slack::ApiError => e
  puts "Error when calling CallsApi->calls_info_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;calls:read&#x60; |  |
| **id** | **String** | &#x60;id&#x60; of the Call returned by the [&#x60;calls.add&#x60;](/methods/calls.add) method. |  |

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## calls_participants_add

> <DefaultSuccessTemplate> calls_participants_add(token, id, users)



Registers new participants added to a Call.

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::CallsApi.new
token = 'token_example' # String | Authentication token. Requires scope: `calls:write`
id = 'id_example' # String | `id` returned by the [`calls.add`](/methods/calls.add) method.
users = 'users_example' # String | The list of users to add as participants in the Call. [Read more on how to specify users here](/apis/calls#users).

begin
  
  result = api_instance.calls_participants_add(token, id, users)
  p result
rescue slack::ApiError => e
  puts "Error when calling CallsApi->calls_participants_add: #{e}"
end
```

#### Using the calls_participants_add_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<DefaultSuccessTemplate>, Integer, Hash)> calls_participants_add_with_http_info(token, id, users)

```ruby
begin
  
  data, status_code, headers = api_instance.calls_participants_add_with_http_info(token, id, users)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <DefaultSuccessTemplate>
rescue slack::ApiError => e
  puts "Error when calling CallsApi->calls_participants_add_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;calls:write&#x60; |  |
| **id** | **String** | &#x60;id&#x60; returned by the [&#x60;calls.add&#x60;](/methods/calls.add) method. |  |
| **users** | **String** | The list of users to add as participants in the Call. [Read more on how to specify users here](/apis/calls#users). |  |

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json


## calls_participants_remove

> <DefaultSuccessTemplate> calls_participants_remove(token, id, users)



Registers participants removed from a Call.

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::CallsApi.new
token = 'token_example' # String | Authentication token. Requires scope: `calls:write`
id = 'id_example' # String | `id` returned by the [`calls.add`](/methods/calls.add) method.
users = 'users_example' # String | The list of users to remove as participants in the Call. [Read more on how to specify users here](/apis/calls#users).

begin
  
  result = api_instance.calls_participants_remove(token, id, users)
  p result
rescue slack::ApiError => e
  puts "Error when calling CallsApi->calls_participants_remove: #{e}"
end
```

#### Using the calls_participants_remove_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<DefaultSuccessTemplate>, Integer, Hash)> calls_participants_remove_with_http_info(token, id, users)

```ruby
begin
  
  data, status_code, headers = api_instance.calls_participants_remove_with_http_info(token, id, users)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <DefaultSuccessTemplate>
rescue slack::ApiError => e
  puts "Error when calling CallsApi->calls_participants_remove_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;calls:write&#x60; |  |
| **id** | **String** | &#x60;id&#x60; returned by the [&#x60;calls.add&#x60;](/methods/calls.add) method. |  |
| **users** | **String** | The list of users to remove as participants in the Call. [Read more on how to specify users here](/apis/calls#users). |  |

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json


## calls_update

> <DefaultSuccessTemplate> calls_update(token, id, opts)



Updates information about a Call.

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::CallsApi.new
token = 'token_example' # String | Authentication token. Requires scope: `calls:write`
id = 'id_example' # String | `id` returned by the [`calls.add`](/methods/calls.add) method.
opts = {
  desktop_app_join_url: 'desktop_app_join_url_example', # String | When supplied, available Slack clients will attempt to directly launch the 3rd-party Call with this URL.
  join_url: 'join_url_example', # String | The URL required for a client to join the Call.
  title: 'title_example' # String | The name of the Call.
}

begin
  
  result = api_instance.calls_update(token, id, opts)
  p result
rescue slack::ApiError => e
  puts "Error when calling CallsApi->calls_update: #{e}"
end
```

#### Using the calls_update_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<DefaultSuccessTemplate>, Integer, Hash)> calls_update_with_http_info(token, id, opts)

```ruby
begin
  
  data, status_code, headers = api_instance.calls_update_with_http_info(token, id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <DefaultSuccessTemplate>
rescue slack::ApiError => e
  puts "Error when calling CallsApi->calls_update_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;calls:write&#x60; |  |
| **id** | **String** | &#x60;id&#x60; returned by the [&#x60;calls.add&#x60;](/methods/calls.add) method. |  |
| **desktop_app_join_url** | **String** | When supplied, available Slack clients will attempt to directly launch the 3rd-party Call with this URL. | [optional] |
| **join_url** | **String** | The URL required for a client to join the Call. | [optional] |
| **title** | **String** | The name of the Call. | [optional] |

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json

