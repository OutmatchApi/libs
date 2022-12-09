# video-api::AuthenticationApi

All URIs are relative to *https://ws.api.video*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**p_ost_auth_api_key**](AuthenticationApi.md#p_ost_auth_api_key) | **POST** /auth/api-key | Authenticate |
| [**p_ost_auth_refresh**](AuthenticationApi.md#p_ost_auth_refresh) | **POST** /auth/refresh | Refresh token |


## p_ost_auth_api_key

> <AccessToken> p_ost_auth_api_key(opts)

Authenticate

To get started, submit your API key in the body of your request. api.video returns an access token that is valid for one hour (3600 seconds). A refresh token is also returned. View a [tutorial](https://api.video/blog/tutorials/authentication-tutorial) on authentication. All tutorials using the [authentication endpoint](https://api.video/blog/endpoints/authenticate)

### Examples

```ruby
require 'time'
require 'video-api'

api_instance = video-api::AuthenticationApi.new
opts = {
  authenticate_payload: video-api::AuthenticatePayload.new({api_key: 'api_key_example'}) # AuthenticatePayload | 
}

begin
  # Authenticate
  result = api_instance.p_ost_auth_api_key(opts)
  p result
rescue video-api::ApiError => e
  puts "Error when calling AuthenticationApi->p_ost_auth_api_key: #{e}"
end
```

#### Using the p_ost_auth_api_key_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<AccessToken>, Integer, Hash)> p_ost_auth_api_key_with_http_info(opts)

```ruby
begin
  # Authenticate
  data, status_code, headers = api_instance.p_ost_auth_api_key_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <AccessToken>
rescue video-api::ApiError => e
  puts "Error when calling AuthenticationApi->p_ost_auth_api_key_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **authenticate_payload** | [**AuthenticatePayload**](AuthenticatePayload.md) |  | [optional] |

### Return type

[**AccessToken**](AccessToken.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## p_ost_auth_refresh

> <AccessToken> p_ost_auth_refresh(opts)

Refresh token

Use the refresh endpoint with the refresh token you received when you first authenticated using the api-key endpoint. Send the refresh token in the body of your request. The api.video API returns a new access token that is valid for one hour (3600 seconds) and a new refresh token.  

### Examples

```ruby
require 'time'
require 'video-api'

api_instance = video-api::AuthenticationApi.new
opts = {
  refresh_token_payload: video-api::RefreshTokenPayload.new({refresh_token: 'refresh_token_example'}) # RefreshTokenPayload | 
}

begin
  # Refresh token
  result = api_instance.p_ost_auth_refresh(opts)
  p result
rescue video-api::ApiError => e
  puts "Error when calling AuthenticationApi->p_ost_auth_refresh: #{e}"
end
```

#### Using the p_ost_auth_refresh_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<AccessToken>, Integer, Hash)> p_ost_auth_refresh_with_http_info(opts)

```ruby
begin
  # Refresh token
  data, status_code, headers = api_instance.p_ost_auth_refresh_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <AccessToken>
rescue video-api::ApiError => e
  puts "Error when calling AuthenticationApi->p_ost_auth_refresh_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **refresh_token_payload** | [**RefreshTokenPayload**](RefreshTokenPayload.md) |  | [optional] |

### Return type

[**AccessToken**](AccessToken.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

