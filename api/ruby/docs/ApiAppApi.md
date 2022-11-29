# api::ApiAppApi

All URIs are relative to *https://api.outmatchapi.com*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**create_api_app**](ApiAppApi.md#create_api_app) | **POST** /apiApp | Create api app |
| [**create_api_app_release**](ApiAppApi.md#create_api_app_release) | **POST** /apiApp/{app_id}/release | Create api app release |
| [**create_api_app_release_sdks**](ApiAppApi.md#create_api_app_release_sdks) | **POST** /apiApp/{app_id}/release/{release_version}/sdk | Generate sdks for a relase |


## create_api_app

> <ApiApp> create_api_app(opts)

Create api app

Create an api app for the authenticated user

### Examples

```ruby
require 'time'
require 'api'
# setup authorization
api.configure do |config|
  # Configure Bearer authorization (JWT): bearerAuth
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = api::ApiAppApi.new
opts = {
  create_api_app_request: api::CreateApiAppRequest.new({name: 'My Api'}) # CreateApiAppRequest | 
}

begin
  # Create api app
  result = api_instance.create_api_app(opts)
  p result
rescue api::ApiError => e
  puts "Error when calling ApiAppApi->create_api_app: #{e}"
end
```

#### Using the create_api_app_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<ApiApp>, Integer, Hash)> create_api_app_with_http_info(opts)

```ruby
begin
  # Create api app
  data, status_code, headers = api_instance.create_api_app_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <ApiApp>
rescue api::ApiError => e
  puts "Error when calling ApiAppApi->create_api_app_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **create_api_app_request** | [**CreateApiAppRequest**](CreateApiAppRequest.md) |  | [optional] |

### Return type

[**ApiApp**](ApiApp.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/xml


## create_api_app_release

> <Release> create_api_app_release(app_id, opts)

Create api app release

Create an api app release

### Examples

```ruby
require 'time'
require 'api'
# setup authorization
api.configure do |config|
  # Configure Bearer authorization (JWT): bearerAuth
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = api::ApiAppApi.new
app_id = 'app_id_example' # String | app id to associate the release with
opts = {
  body: 'body_example' # String | Created release object
}

begin
  # Create api app release
  result = api_instance.create_api_app_release(app_id, opts)
  p result
rescue api::ApiError => e
  puts "Error when calling ApiAppApi->create_api_app_release: #{e}"
end
```

#### Using the create_api_app_release_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Release>, Integer, Hash)> create_api_app_release_with_http_info(app_id, opts)

```ruby
begin
  # Create api app release
  data, status_code, headers = api_instance.create_api_app_release_with_http_info(app_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Release>
rescue api::ApiError => e
  puts "Error when calling ApiAppApi->create_api_app_release_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **app_id** | **String** | app id to associate the release with |  |
| **body** | **String** | Created release object | [optional] |

### Return type

[**Release**](Release.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: text/plain
- **Accept**: application/json, application/xml


## create_api_app_release_sdks

> <Array<Sdk>> create_api_app_release_sdks(app_id, release_version, opts)

Generate sdks for a relase

Generate sdks for a relase

### Examples

```ruby
require 'time'
require 'api'
# setup authorization
api.configure do |config|
  # Configure Bearer authorization (JWT): bearerAuth
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = api::ApiAppApi.new
app_id = 'app_id_example' # String | app id
release_version = '1.0.0' # String | release id
opts = {
  create_api_app_release_sdks_request: api::CreateApiAppReleaseSdksRequest.new({languages: [api::Language::GO]}) # CreateApiAppReleaseSdksRequest | 
}

begin
  # Generate sdks for a relase
  result = api_instance.create_api_app_release_sdks(app_id, release_version, opts)
  p result
rescue api::ApiError => e
  puts "Error when calling ApiAppApi->create_api_app_release_sdks: #{e}"
end
```

#### Using the create_api_app_release_sdks_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Array<Sdk>>, Integer, Hash)> create_api_app_release_sdks_with_http_info(app_id, release_version, opts)

```ruby
begin
  # Generate sdks for a relase
  data, status_code, headers = api_instance.create_api_app_release_sdks_with_http_info(app_id, release_version, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Array<Sdk>>
rescue api::ApiError => e
  puts "Error when calling ApiAppApi->create_api_app_release_sdks_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **app_id** | **String** | app id |  |
| **release_version** | **String** | release id |  |
| **create_api_app_release_sdks_request** | [**CreateApiAppReleaseSdksRequest**](CreateApiAppReleaseSdksRequest.md) |  | [optional] |

### Return type

[**Array&lt;Sdk&gt;**](Sdk.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

