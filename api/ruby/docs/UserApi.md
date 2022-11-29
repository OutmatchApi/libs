# api::UserApi

All URIs are relative to *https://api.outmatchapi.com*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**create_user**](UserApi.md#create_user) | **POST** /user | Create user |
| [**update_user**](UserApi.md#update_user) | **PUT** /user | Update user |


## create_user

> <User> create_user(opts)

Create user

This can only be done by the logged in user.

### Examples

```ruby
require 'time'
require 'api'
# setup authorization
api.configure do |config|
  # Configure Bearer authorization (JWT): bearerAuth
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = api::UserApi.new
opts = {
  create_user_request: api::CreateUserRequest.new({email: 'john@email.com', first_name: 'John', last_name: 'James', company: 'My Company'}) # CreateUserRequest | 
}

begin
  # Create user
  result = api_instance.create_user(opts)
  p result
rescue api::ApiError => e
  puts "Error when calling UserApi->create_user: #{e}"
end
```

#### Using the create_user_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<User>, Integer, Hash)> create_user_with_http_info(opts)

```ruby
begin
  # Create user
  data, status_code, headers = api_instance.create_user_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <User>
rescue api::ApiError => e
  puts "Error when calling UserApi->create_user_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **create_user_request** | [**CreateUserRequest**](CreateUserRequest.md) |  | [optional] |

### Return type

[**User**](User.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## update_user

> update_user(opts)

Update user

This can only be done by the logged in user.

### Examples

```ruby
require 'time'
require 'api'
# setup authorization
api.configure do |config|
  # Configure Bearer authorization (JWT): bearerAuth
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = api::UserApi.new
opts = {
  update_user_request: api::UpdateUserRequest.new({first_name: 'John', last_name: 'James', company: 'My Company'}) # UpdateUserRequest | 
}

begin
  # Update user
  api_instance.update_user(opts)
rescue api::ApiError => e
  puts "Error when calling UserApi->update_user: #{e}"
end
```

#### Using the update_user_with_http_info variant

This returns an Array which contains the response data (`nil` in this case), status code and headers.

> <Array(nil, Integer, Hash)> update_user_with_http_info(opts)

```ruby
begin
  # Update user
  data, status_code, headers = api_instance.update_user_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => nil
rescue api::ApiError => e
  puts "Error when calling UserApi->update_user_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **update_user_request** | [**UpdateUserRequest**](UpdateUserRequest.md) |  | [optional] |

### Return type

nil (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined

