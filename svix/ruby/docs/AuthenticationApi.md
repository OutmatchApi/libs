# svix::AuthenticationApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**expire_all_api_v1_auth_app_app_id_expire_all_post**](AuthenticationApi.md#expire_all_api_v1_auth_app_app_id_expire_all_post) | **POST** /api/v1/auth/app/{app_id}/expire-all/ | Expire All |
| [**get_dashboard_access_api_v1_auth_dashboard_access_app_id_post**](AuthenticationApi.md#get_dashboard_access_api_v1_auth_dashboard_access_app_id_post) | **POST** /api/v1/auth/dashboard-access/{app_id}/ | Get Consumer App Portal Access |
| [**logout_api_v1_auth_logout_post**](AuthenticationApi.md#logout_api_v1_auth_logout_post) | **POST** /api/v1/auth/logout/ | Logout |


## expire_all_api_v1_auth_app_app_id_expire_all_post

> expire_all_api_v1_auth_app_app_id_expire_all_post(app_id, application_token_expire_in, opts)

Expire All

Expire all of the tokens associated with a specific Application

### Examples

```ruby
require 'time'
require 'svix'
# setup authorization
svix.configure do |config|
  # Configure Bearer authorization: HTTPBearer
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = svix::AuthenticationApi.new
app_id = 'app_1srOrx2ZWZBpBUvZwXKQmoEYga2' # String | 
application_token_expire_in = svix::ApplicationTokenExpireIn.new # ApplicationTokenExpireIn | 
opts = {
  idempotency_key: 'idempotency_key_example' # String | The request's idempotency key
}

begin
  # Expire All
  api_instance.expire_all_api_v1_auth_app_app_id_expire_all_post(app_id, application_token_expire_in, opts)
rescue svix::ApiError => e
  puts "Error when calling AuthenticationApi->expire_all_api_v1_auth_app_app_id_expire_all_post: #{e}"
end
```

#### Using the expire_all_api_v1_auth_app_app_id_expire_all_post_with_http_info variant

This returns an Array which contains the response data (`nil` in this case), status code and headers.

> <Array(nil, Integer, Hash)> expire_all_api_v1_auth_app_app_id_expire_all_post_with_http_info(app_id, application_token_expire_in, opts)

```ruby
begin
  # Expire All
  data, status_code, headers = api_instance.expire_all_api_v1_auth_app_app_id_expire_all_post_with_http_info(app_id, application_token_expire_in, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => nil
rescue svix::ApiError => e
  puts "Error when calling AuthenticationApi->expire_all_api_v1_auth_app_app_id_expire_all_post_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **app_id** | **String** |  |  |
| **application_token_expire_in** | [**ApplicationTokenExpireIn**](ApplicationTokenExpireIn.md) |  |  |
| **idempotency_key** | **String** | The request&#39;s idempotency key | [optional] |

### Return type

nil (empty response body)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## get_dashboard_access_api_v1_auth_dashboard_access_app_id_post

> <DashboardAccessOut> get_dashboard_access_api_v1_auth_dashboard_access_app_id_post(app_id, opts)

Get Consumer App Portal Access

Use this function to get magic links (and authentication codes) for connecting your users to the Consumer Application Portal.

### Examples

```ruby
require 'time'
require 'svix'
# setup authorization
svix.configure do |config|
  # Configure Bearer authorization: HTTPBearer
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = svix::AuthenticationApi.new
app_id = 'app_1srOrx2ZWZBpBUvZwXKQmoEYga2' # String | 
opts = {
  idempotency_key: 'idempotency_key_example' # String | The request's idempotency key
}

begin
  # Get Consumer App Portal Access
  result = api_instance.get_dashboard_access_api_v1_auth_dashboard_access_app_id_post(app_id, opts)
  p result
rescue svix::ApiError => e
  puts "Error when calling AuthenticationApi->get_dashboard_access_api_v1_auth_dashboard_access_app_id_post: #{e}"
end
```

#### Using the get_dashboard_access_api_v1_auth_dashboard_access_app_id_post_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<DashboardAccessOut>, Integer, Hash)> get_dashboard_access_api_v1_auth_dashboard_access_app_id_post_with_http_info(app_id, opts)

```ruby
begin
  # Get Consumer App Portal Access
  data, status_code, headers = api_instance.get_dashboard_access_api_v1_auth_dashboard_access_app_id_post_with_http_info(app_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <DashboardAccessOut>
rescue svix::ApiError => e
  puts "Error when calling AuthenticationApi->get_dashboard_access_api_v1_auth_dashboard_access_app_id_post_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **app_id** | **String** |  |  |
| **idempotency_key** | **String** | The request&#39;s idempotency key | [optional] |

### Return type

[**DashboardAccessOut**](DashboardAccessOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## logout_api_v1_auth_logout_post

> logout_api_v1_auth_logout_post(opts)

Logout

Logout an app token.  Trying to log out other tokens will fail.

### Examples

```ruby
require 'time'
require 'svix'
# setup authorization
svix.configure do |config|
  # Configure Bearer authorization: HTTPBearer
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = svix::AuthenticationApi.new
opts = {
  idempotency_key: 'idempotency_key_example' # String | The request's idempotency key
}

begin
  # Logout
  api_instance.logout_api_v1_auth_logout_post(opts)
rescue svix::ApiError => e
  puts "Error when calling AuthenticationApi->logout_api_v1_auth_logout_post: #{e}"
end
```

#### Using the logout_api_v1_auth_logout_post_with_http_info variant

This returns an Array which contains the response data (`nil` in this case), status code and headers.

> <Array(nil, Integer, Hash)> logout_api_v1_auth_logout_post_with_http_info(opts)

```ruby
begin
  # Logout
  data, status_code, headers = api_instance.logout_api_v1_auth_logout_post_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => nil
rescue svix::ApiError => e
  puts "Error when calling AuthenticationApi->logout_api_v1_auth_logout_post_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **idempotency_key** | **String** | The request&#39;s idempotency key | [optional] |

### Return type

nil (empty response body)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

