# slack::CallsParticipantsApi

All URIs are relative to *https://slack.com/api*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**calls_participants_add**](CallsParticipantsApi.md#calls_participants_add) | **POST** /calls.participants.add |  |
| [**calls_participants_remove**](CallsParticipantsApi.md#calls_participants_remove) | **POST** /calls.participants.remove |  |


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

api_instance = slack::CallsParticipantsApi.new
token = 'token_example' # String | Authentication token. Requires scope: `calls:write`
id = 'id_example' # String | `id` returned by the [`calls.add`](/methods/calls.add) method.
users = 'users_example' # String | The list of users to add as participants in the Call. [Read more on how to specify users here](/apis/calls#users).

begin
  
  result = api_instance.calls_participants_add(token, id, users)
  p result
rescue slack::ApiError => e
  puts "Error when calling CallsParticipantsApi->calls_participants_add: #{e}"
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
  puts "Error when calling CallsParticipantsApi->calls_participants_add_with_http_info: #{e}"
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

api_instance = slack::CallsParticipantsApi.new
token = 'token_example' # String | Authentication token. Requires scope: `calls:write`
id = 'id_example' # String | `id` returned by the [`calls.add`](/methods/calls.add) method.
users = 'users_example' # String | The list of users to remove as participants in the Call. [Read more on how to specify users here](/apis/calls#users).

begin
  
  result = api_instance.calls_participants_remove(token, id, users)
  p result
rescue slack::ApiError => e
  puts "Error when calling CallsParticipantsApi->calls_participants_remove: #{e}"
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
  puts "Error when calling CallsParticipantsApi->calls_participants_remove_with_http_info: #{e}"
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

