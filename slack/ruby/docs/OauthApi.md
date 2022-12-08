# slack::OauthApi

All URIs are relative to *https://slack.com/api*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**oauth_access**](OauthApi.md#oauth_access) | **GET** /oauth.access |  |
| [**oauth_token**](OauthApi.md#oauth_token) | **GET** /oauth.token |  |
| [**oauth_v2_access**](OauthApi.md#oauth_v2_access) | **GET** /oauth.v2.access |  |


## oauth_access

> <DefaultSuccessTemplate> oauth_access(opts)



Exchanges a temporary OAuth verifier code for an access token.

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::OauthApi.new
opts = {
  client_id: 'client_id_example', # String | Issued when you created your application.
  client_secret: 'client_secret_example', # String | Issued when you created your application.
  code: 'code_example', # String | The `code` param returned via the OAuth callback.
  redirect_uri: 'redirect_uri_example', # String | This must match the originally submitted URI (if one was sent).
  single_channel: true # Boolean | Request the user to add your app only to a single channel. Only valid with a [legacy workspace app](https://api.slack.com/legacy-workspace-apps).
}

begin
  
  result = api_instance.oauth_access(opts)
  p result
rescue slack::ApiError => e
  puts "Error when calling OauthApi->oauth_access: #{e}"
end
```

#### Using the oauth_access_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<DefaultSuccessTemplate>, Integer, Hash)> oauth_access_with_http_info(opts)

```ruby
begin
  
  data, status_code, headers = api_instance.oauth_access_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <DefaultSuccessTemplate>
rescue slack::ApiError => e
  puts "Error when calling OauthApi->oauth_access_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **client_id** | **String** | Issued when you created your application. | [optional] |
| **client_secret** | **String** | Issued when you created your application. | [optional] |
| **code** | **String** | The &#x60;code&#x60; param returned via the OAuth callback. | [optional] |
| **redirect_uri** | **String** | This must match the originally submitted URI (if one was sent). | [optional] |
| **single_channel** | **Boolean** | Request the user to add your app only to a single channel. Only valid with a [legacy workspace app](https://api.slack.com/legacy-workspace-apps). | [optional] |

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## oauth_token

> <DefaultSuccessTemplate> oauth_token(opts)



Exchanges a temporary OAuth verifier code for a workspace token.

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::OauthApi.new
opts = {
  client_id: 'client_id_example', # String | Issued when you created your application.
  client_secret: 'client_secret_example', # String | Issued when you created your application.
  code: 'code_example', # String | The `code` param returned via the OAuth callback.
  redirect_uri: 'redirect_uri_example', # String | This must match the originally submitted URI (if one was sent).
  single_channel: true # Boolean | Request the user to add your app only to a single channel.
}

begin
  
  result = api_instance.oauth_token(opts)
  p result
rescue slack::ApiError => e
  puts "Error when calling OauthApi->oauth_token: #{e}"
end
```

#### Using the oauth_token_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<DefaultSuccessTemplate>, Integer, Hash)> oauth_token_with_http_info(opts)

```ruby
begin
  
  data, status_code, headers = api_instance.oauth_token_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <DefaultSuccessTemplate>
rescue slack::ApiError => e
  puts "Error when calling OauthApi->oauth_token_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **client_id** | **String** | Issued when you created your application. | [optional] |
| **client_secret** | **String** | Issued when you created your application. | [optional] |
| **code** | **String** | The &#x60;code&#x60; param returned via the OAuth callback. | [optional] |
| **redirect_uri** | **String** | This must match the originally submitted URI (if one was sent). | [optional] |
| **single_channel** | **Boolean** | Request the user to add your app only to a single channel. | [optional] |

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## oauth_v2_access

> <DefaultSuccessTemplate> oauth_v2_access(code, opts)



Exchanges a temporary OAuth verifier code for an access token.

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::OauthApi.new
code = 'code_example' # String | The `code` param returned via the OAuth callback.
opts = {
  client_id: 'client_id_example', # String | Issued when you created your application.
  client_secret: 'client_secret_example', # String | Issued when you created your application.
  redirect_uri: 'redirect_uri_example' # String | This must match the originally submitted URI (if one was sent).
}

begin
  
  result = api_instance.oauth_v2_access(code, opts)
  p result
rescue slack::ApiError => e
  puts "Error when calling OauthApi->oauth_v2_access: #{e}"
end
```

#### Using the oauth_v2_access_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<DefaultSuccessTemplate>, Integer, Hash)> oauth_v2_access_with_http_info(code, opts)

```ruby
begin
  
  data, status_code, headers = api_instance.oauth_v2_access_with_http_info(code, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <DefaultSuccessTemplate>
rescue slack::ApiError => e
  puts "Error when calling OauthApi->oauth_v2_access_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **code** | **String** | The &#x60;code&#x60; param returned via the OAuth callback. |  |
| **client_id** | **String** | Issued when you created your application. | [optional] |
| **client_secret** | **String** | Issued when you created your application. | [optional] |
| **redirect_uri** | **String** | This must match the originally submitted URI (if one was sent). | [optional] |

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

