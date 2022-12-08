# slack::AppsEventAuthorizationsApi

All URIs are relative to *https://slack.com/api*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**apps_event_authorizations_list**](AppsEventAuthorizationsApi.md#apps_event_authorizations_list) | **GET** /apps.event.authorizations.list |  |


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

api_instance = slack::AppsEventAuthorizationsApi.new
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
  puts "Error when calling AppsEventAuthorizationsApi->apps_event_authorizations_list: #{e}"
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
  puts "Error when calling AppsEventAuthorizationsApi->apps_event_authorizations_list_with_http_info: #{e}"
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

