# slack::AuthApi

All URIs are relative to *https://slack.com/api*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**auth_revoke**](AuthApi.md#auth_revoke) | **GET** /auth.revoke |  |
| [**auth_test**](AuthApi.md#auth_test) | **GET** /auth.test |  |


## auth_revoke

> <AuthRevokeSchema> auth_revoke(token, opts)



Revokes a token.

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::AuthApi.new
token = 'token_example' # String | Authentication token. Requires scope: `none`
opts = {
  test: true # Boolean | Setting this parameter to `1` triggers a _testing mode_ where the specified token will not actually be revoked.
}

begin
  
  result = api_instance.auth_revoke(token, opts)
  p result
rescue slack::ApiError => e
  puts "Error when calling AuthApi->auth_revoke: #{e}"
end
```

#### Using the auth_revoke_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<AuthRevokeSchema>, Integer, Hash)> auth_revoke_with_http_info(token, opts)

```ruby
begin
  
  data, status_code, headers = api_instance.auth_revoke_with_http_info(token, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <AuthRevokeSchema>
rescue slack::ApiError => e
  puts "Error when calling AuthApi->auth_revoke_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;none&#x60; |  |
| **test** | **Boolean** | Setting this parameter to &#x60;1&#x60; triggers a _testing mode_ where the specified token will not actually be revoked. | [optional] |

### Return type

[**AuthRevokeSchema**](AuthRevokeSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## auth_test

> <AuthTestSuccessSchema> auth_test(token)



Checks authentication & identity.

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::AuthApi.new
token = 'token_example' # String | Authentication token. Requires scope: `none`

begin
  
  result = api_instance.auth_test(token)
  p result
rescue slack::ApiError => e
  puts "Error when calling AuthApi->auth_test: #{e}"
end
```

#### Using the auth_test_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<AuthTestSuccessSchema>, Integer, Hash)> auth_test_with_http_info(token)

```ruby
begin
  
  data, status_code, headers = api_instance.auth_test_with_http_info(token)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <AuthTestSuccessSchema>
rescue slack::ApiError => e
  puts "Error when calling AuthApi->auth_test_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;none&#x60; |  |

### Return type

[**AuthTestSuccessSchema**](AuthTestSuccessSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

