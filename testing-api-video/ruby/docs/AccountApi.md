# testing-api-video::AccountApi

All URIs are relative to *https://ws.api.video*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**g_et_account**](AccountApi.md#g_et_account) | **GET** /account | Show account |


## g_et_account

> <Account> g_et_account

Show account

Deprecated. Authenticate and get a token, then you can use the bearer token here to retrieve details about your account.

### Examples

```ruby
require 'time'
require 'testing-api-video'
# setup authorization
testing-api-video.configure do |config|
  # Configure Bearer authorization: bearerAuth
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = testing-api-video::AccountApi.new

begin
  # Show account
  result = api_instance.g_et_account
  p result
rescue testing-api-video::ApiError => e
  puts "Error when calling AccountApi->g_et_account: #{e}"
end
```

#### Using the g_et_account_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Account>, Integer, Hash)> g_et_account_with_http_info

```ruby
begin
  # Show account
  data, status_code, headers = api_instance.g_et_account_with_http_info
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Account>
rescue testing-api-video::ApiError => e
  puts "Error when calling AccountApi->g_et_account_with_http_info: #{e}"
end
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**Account**](Account.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

