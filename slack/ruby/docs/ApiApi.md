# slack::ApiApi

All URIs are relative to *https://slack.com/api*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**api_test**](ApiApi.md#api_test) | **GET** /api.test |  |


## api_test

> <ApiTestSuccessSchema> api_test(opts)



Checks API calling code.

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::ApiApi.new
opts = {
  error: 'error_example', # String | Error response to return
  foo: 'foo_example' # String | example property to return
}

begin
  
  result = api_instance.api_test(opts)
  p result
rescue slack::ApiError => e
  puts "Error when calling ApiApi->api_test: #{e}"
end
```

#### Using the api_test_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<ApiTestSuccessSchema>, Integer, Hash)> api_test_with_http_info(opts)

```ruby
begin
  
  data, status_code, headers = api_instance.api_test_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <ApiTestSuccessSchema>
rescue slack::ApiError => e
  puts "Error when calling ApiApi->api_test_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **error** | **String** | Error response to return | [optional] |
| **foo** | **String** | example property to return | [optional] |

### Return type

[**ApiTestSuccessSchema**](ApiTestSuccessSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

