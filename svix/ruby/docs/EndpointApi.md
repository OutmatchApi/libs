# svix::EndpointApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**create_endpoint_api_v1_app_app_id_endpoint_post**](EndpointApi.md#create_endpoint_api_v1_app_app_id_endpoint_post) | **POST** /api/v1/app/{app_id}/endpoint/ | Create Endpoint |
| [**delete_endpoint_api_v1_app_app_id_endpoint_endpoint_id_delete**](EndpointApi.md#delete_endpoint_api_v1_app_app_id_endpoint_endpoint_id_delete) | **DELETE** /api/v1/app/{app_id}/endpoint/{endpoint_id}/ | Delete Endpoint |
| [**get_endpoint_api_v1_app_app_id_endpoint_endpoint_id_get**](EndpointApi.md#get_endpoint_api_v1_app_app_id_endpoint_endpoint_id_get) | **GET** /api/v1/app/{app_id}/endpoint/{endpoint_id}/ | Get Endpoint |
| [**get_endpoint_headers_api_v1_app_app_id_endpoint_endpoint_id_headers_get**](EndpointApi.md#get_endpoint_headers_api_v1_app_app_id_endpoint_endpoint_id_headers_get) | **GET** /api/v1/app/{app_id}/endpoint/{endpoint_id}/headers/ | Get Endpoint Headers |
| [**get_endpoint_secret_api_v1_app_app_id_endpoint_endpoint_id_secret_get**](EndpointApi.md#get_endpoint_secret_api_v1_app_app_id_endpoint_endpoint_id_secret_get) | **GET** /api/v1/app/{app_id}/endpoint/{endpoint_id}/secret/ | Get Endpoint Secret |
| [**get_endpoint_stats_api_v1_app_app_id_endpoint_endpoint_id_stats_get**](EndpointApi.md#get_endpoint_stats_api_v1_app_app_id_endpoint_endpoint_id_stats_get) | **GET** /api/v1/app/{app_id}/endpoint/{endpoint_id}/stats/ | Get Endpoint Stats |
| [**list_endpoints_api_v1_app_app_id_endpoint_get**](EndpointApi.md#list_endpoints_api_v1_app_app_id_endpoint_get) | **GET** /api/v1/app/{app_id}/endpoint/ | List Endpoints |
| [**patch_endpoint_headers_api_v1_app_app_id_endpoint_endpoint_id_headers_patch**](EndpointApi.md#patch_endpoint_headers_api_v1_app_app_id_endpoint_endpoint_id_headers_patch) | **PATCH** /api/v1/app/{app_id}/endpoint/{endpoint_id}/headers/ | Patch Endpoint Headers |
| [**recover_failed_webhooks_api_v1_app_app_id_endpoint_endpoint_id_recover_post**](EndpointApi.md#recover_failed_webhooks_api_v1_app_app_id_endpoint_endpoint_id_recover_post) | **POST** /api/v1/app/{app_id}/endpoint/{endpoint_id}/recover/ | Recover Failed Webhooks |
| [**replay_missing_webhooks_api_v1_app_app_id_endpoint_endpoint_id_replay_missing_post**](EndpointApi.md#replay_missing_webhooks_api_v1_app_app_id_endpoint_endpoint_id_replay_missing_post) | **POST** /api/v1/app/{app_id}/endpoint/{endpoint_id}/replay-missing/ | Replay Missing Webhooks |
| [**rotate_endpoint_secret_api_v1_app_app_id_endpoint_endpoint_id_secret_rotate_post**](EndpointApi.md#rotate_endpoint_secret_api_v1_app_app_id_endpoint_endpoint_id_secret_rotate_post) | **POST** /api/v1/app/{app_id}/endpoint/{endpoint_id}/secret/rotate/ | Rotate Endpoint Secret |
| [**update_endpoint_api_v1_app_app_id_endpoint_endpoint_id_put**](EndpointApi.md#update_endpoint_api_v1_app_app_id_endpoint_endpoint_id_put) | **PUT** /api/v1/app/{app_id}/endpoint/{endpoint_id}/ | Update Endpoint |
| [**update_endpoint_headers_api_v1_app_app_id_endpoint_endpoint_id_headers_put**](EndpointApi.md#update_endpoint_headers_api_v1_app_app_id_endpoint_endpoint_id_headers_put) | **PUT** /api/v1/app/{app_id}/endpoint/{endpoint_id}/headers/ | Update Endpoint Headers |


## create_endpoint_api_v1_app_app_id_endpoint_post

> <EndpointOut> create_endpoint_api_v1_app_app_id_endpoint_post(app_id, endpoint_in, opts)

Create Endpoint

Create a new endpoint for the application.  When `secret` is `null` the secret is automatically generated (recommended)

### Examples

```ruby
require 'time'
require 'svix'
# setup authorization
svix.configure do |config|
  # Configure Bearer authorization: HTTPBearer
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = svix::EndpointApi.new
app_id = 'app_1srOrx2ZWZBpBUvZwXKQmoEYga2' # String | 
endpoint_in = svix::EndpointIn.new({url: 'https://example.com/webhook/', version: 1}) # EndpointIn | 
opts = {
  idempotency_key: 'idempotency_key_example' # String | The request's idempotency key
}

begin
  # Create Endpoint
  result = api_instance.create_endpoint_api_v1_app_app_id_endpoint_post(app_id, endpoint_in, opts)
  p result
rescue svix::ApiError => e
  puts "Error when calling EndpointApi->create_endpoint_api_v1_app_app_id_endpoint_post: #{e}"
end
```

#### Using the create_endpoint_api_v1_app_app_id_endpoint_post_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<EndpointOut>, Integer, Hash)> create_endpoint_api_v1_app_app_id_endpoint_post_with_http_info(app_id, endpoint_in, opts)

```ruby
begin
  # Create Endpoint
  data, status_code, headers = api_instance.create_endpoint_api_v1_app_app_id_endpoint_post_with_http_info(app_id, endpoint_in, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <EndpointOut>
rescue svix::ApiError => e
  puts "Error when calling EndpointApi->create_endpoint_api_v1_app_app_id_endpoint_post_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **app_id** | **String** |  |  |
| **endpoint_in** | [**EndpointIn**](EndpointIn.md) |  |  |
| **idempotency_key** | **String** | The request&#39;s idempotency key | [optional] |

### Return type

[**EndpointOut**](EndpointOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## delete_endpoint_api_v1_app_app_id_endpoint_endpoint_id_delete

> delete_endpoint_api_v1_app_app_id_endpoint_endpoint_id_delete(endpoint_id, app_id, opts)

Delete Endpoint

Delete an endpoint.

### Examples

```ruby
require 'time'
require 'svix'
# setup authorization
svix.configure do |config|
  # Configure Bearer authorization: HTTPBearer
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = svix::EndpointApi.new
endpoint_id = 'ep_1srOrx2ZWZBpBUvZwXKQmoEYga2' # String | 
app_id = 'app_1srOrx2ZWZBpBUvZwXKQmoEYga2' # String | 
opts = {
  idempotency_key: 'idempotency_key_example' # String | The request's idempotency key
}

begin
  # Delete Endpoint
  api_instance.delete_endpoint_api_v1_app_app_id_endpoint_endpoint_id_delete(endpoint_id, app_id, opts)
rescue svix::ApiError => e
  puts "Error when calling EndpointApi->delete_endpoint_api_v1_app_app_id_endpoint_endpoint_id_delete: #{e}"
end
```

#### Using the delete_endpoint_api_v1_app_app_id_endpoint_endpoint_id_delete_with_http_info variant

This returns an Array which contains the response data (`nil` in this case), status code and headers.

> <Array(nil, Integer, Hash)> delete_endpoint_api_v1_app_app_id_endpoint_endpoint_id_delete_with_http_info(endpoint_id, app_id, opts)

```ruby
begin
  # Delete Endpoint
  data, status_code, headers = api_instance.delete_endpoint_api_v1_app_app_id_endpoint_endpoint_id_delete_with_http_info(endpoint_id, app_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => nil
rescue svix::ApiError => e
  puts "Error when calling EndpointApi->delete_endpoint_api_v1_app_app_id_endpoint_endpoint_id_delete_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **endpoint_id** | **String** |  |  |
| **app_id** | **String** |  |  |
| **idempotency_key** | **String** | The request&#39;s idempotency key | [optional] |

### Return type

nil (empty response body)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## get_endpoint_api_v1_app_app_id_endpoint_endpoint_id_get

> <EndpointOut> get_endpoint_api_v1_app_app_id_endpoint_endpoint_id_get(endpoint_id, app_id, opts)

Get Endpoint

Get an application.

### Examples

```ruby
require 'time'
require 'svix'
# setup authorization
svix.configure do |config|
  # Configure Bearer authorization: HTTPBearer
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = svix::EndpointApi.new
endpoint_id = 'ep_1srOrx2ZWZBpBUvZwXKQmoEYga2' # String | 
app_id = 'app_1srOrx2ZWZBpBUvZwXKQmoEYga2' # String | 
opts = {
  idempotency_key: 'idempotency_key_example' # String | The request's idempotency key
}

begin
  # Get Endpoint
  result = api_instance.get_endpoint_api_v1_app_app_id_endpoint_endpoint_id_get(endpoint_id, app_id, opts)
  p result
rescue svix::ApiError => e
  puts "Error when calling EndpointApi->get_endpoint_api_v1_app_app_id_endpoint_endpoint_id_get: #{e}"
end
```

#### Using the get_endpoint_api_v1_app_app_id_endpoint_endpoint_id_get_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<EndpointOut>, Integer, Hash)> get_endpoint_api_v1_app_app_id_endpoint_endpoint_id_get_with_http_info(endpoint_id, app_id, opts)

```ruby
begin
  # Get Endpoint
  data, status_code, headers = api_instance.get_endpoint_api_v1_app_app_id_endpoint_endpoint_id_get_with_http_info(endpoint_id, app_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <EndpointOut>
rescue svix::ApiError => e
  puts "Error when calling EndpointApi->get_endpoint_api_v1_app_app_id_endpoint_endpoint_id_get_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **endpoint_id** | **String** |  |  |
| **app_id** | **String** |  |  |
| **idempotency_key** | **String** | The request&#39;s idempotency key | [optional] |

### Return type

[**EndpointOut**](EndpointOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## get_endpoint_headers_api_v1_app_app_id_endpoint_endpoint_id_headers_get

> <EndpointHeadersOut> get_endpoint_headers_api_v1_app_app_id_endpoint_endpoint_id_headers_get(endpoint_id, app_id, opts)

Get Endpoint Headers

Get the additional headers to be sent with the webhook

### Examples

```ruby
require 'time'
require 'svix'
# setup authorization
svix.configure do |config|
  # Configure Bearer authorization: HTTPBearer
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = svix::EndpointApi.new
endpoint_id = 'ep_1srOrx2ZWZBpBUvZwXKQmoEYga2' # String | 
app_id = 'app_1srOrx2ZWZBpBUvZwXKQmoEYga2' # String | 
opts = {
  idempotency_key: 'idempotency_key_example' # String | The request's idempotency key
}

begin
  # Get Endpoint Headers
  result = api_instance.get_endpoint_headers_api_v1_app_app_id_endpoint_endpoint_id_headers_get(endpoint_id, app_id, opts)
  p result
rescue svix::ApiError => e
  puts "Error when calling EndpointApi->get_endpoint_headers_api_v1_app_app_id_endpoint_endpoint_id_headers_get: #{e}"
end
```

#### Using the get_endpoint_headers_api_v1_app_app_id_endpoint_endpoint_id_headers_get_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<EndpointHeadersOut>, Integer, Hash)> get_endpoint_headers_api_v1_app_app_id_endpoint_endpoint_id_headers_get_with_http_info(endpoint_id, app_id, opts)

```ruby
begin
  # Get Endpoint Headers
  data, status_code, headers = api_instance.get_endpoint_headers_api_v1_app_app_id_endpoint_endpoint_id_headers_get_with_http_info(endpoint_id, app_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <EndpointHeadersOut>
rescue svix::ApiError => e
  puts "Error when calling EndpointApi->get_endpoint_headers_api_v1_app_app_id_endpoint_endpoint_id_headers_get_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **endpoint_id** | **String** |  |  |
| **app_id** | **String** |  |  |
| **idempotency_key** | **String** | The request&#39;s idempotency key | [optional] |

### Return type

[**EndpointHeadersOut**](EndpointHeadersOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## get_endpoint_secret_api_v1_app_app_id_endpoint_endpoint_id_secret_get

> <EndpointSecretOut> get_endpoint_secret_api_v1_app_app_id_endpoint_endpoint_id_secret_get(endpoint_id, app_id, opts)

Get Endpoint Secret

Get the endpoint's signing secret.  This is used to verify the authenticity of the webhook. For more information please refer to [the consuming webhooks docs](https://docs.svix.com/consuming-webhooks/).

### Examples

```ruby
require 'time'
require 'svix'
# setup authorization
svix.configure do |config|
  # Configure Bearer authorization: HTTPBearer
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = svix::EndpointApi.new
endpoint_id = 'ep_1srOrx2ZWZBpBUvZwXKQmoEYga2' # String | 
app_id = 'app_1srOrx2ZWZBpBUvZwXKQmoEYga2' # String | 
opts = {
  idempotency_key: 'idempotency_key_example' # String | The request's idempotency key
}

begin
  # Get Endpoint Secret
  result = api_instance.get_endpoint_secret_api_v1_app_app_id_endpoint_endpoint_id_secret_get(endpoint_id, app_id, opts)
  p result
rescue svix::ApiError => e
  puts "Error when calling EndpointApi->get_endpoint_secret_api_v1_app_app_id_endpoint_endpoint_id_secret_get: #{e}"
end
```

#### Using the get_endpoint_secret_api_v1_app_app_id_endpoint_endpoint_id_secret_get_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<EndpointSecretOut>, Integer, Hash)> get_endpoint_secret_api_v1_app_app_id_endpoint_endpoint_id_secret_get_with_http_info(endpoint_id, app_id, opts)

```ruby
begin
  # Get Endpoint Secret
  data, status_code, headers = api_instance.get_endpoint_secret_api_v1_app_app_id_endpoint_endpoint_id_secret_get_with_http_info(endpoint_id, app_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <EndpointSecretOut>
rescue svix::ApiError => e
  puts "Error when calling EndpointApi->get_endpoint_secret_api_v1_app_app_id_endpoint_endpoint_id_secret_get_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **endpoint_id** | **String** |  |  |
| **app_id** | **String** |  |  |
| **idempotency_key** | **String** | The request&#39;s idempotency key | [optional] |

### Return type

[**EndpointSecretOut**](EndpointSecretOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## get_endpoint_stats_api_v1_app_app_id_endpoint_endpoint_id_stats_get

> <EndpointStats> get_endpoint_stats_api_v1_app_app_id_endpoint_endpoint_id_stats_get(endpoint_id, app_id, opts)

Get Endpoint Stats

Get basic statistics for the endpoint.

### Examples

```ruby
require 'time'
require 'svix'
# setup authorization
svix.configure do |config|
  # Configure Bearer authorization: HTTPBearer
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = svix::EndpointApi.new
endpoint_id = 'ep_1srOrx2ZWZBpBUvZwXKQmoEYga2' # String | 
app_id = 'app_1srOrx2ZWZBpBUvZwXKQmoEYga2' # String | 
opts = {
  idempotency_key: 'idempotency_key_example' # String | The request's idempotency key
}

begin
  # Get Endpoint Stats
  result = api_instance.get_endpoint_stats_api_v1_app_app_id_endpoint_endpoint_id_stats_get(endpoint_id, app_id, opts)
  p result
rescue svix::ApiError => e
  puts "Error when calling EndpointApi->get_endpoint_stats_api_v1_app_app_id_endpoint_endpoint_id_stats_get: #{e}"
end
```

#### Using the get_endpoint_stats_api_v1_app_app_id_endpoint_endpoint_id_stats_get_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<EndpointStats>, Integer, Hash)> get_endpoint_stats_api_v1_app_app_id_endpoint_endpoint_id_stats_get_with_http_info(endpoint_id, app_id, opts)

```ruby
begin
  # Get Endpoint Stats
  data, status_code, headers = api_instance.get_endpoint_stats_api_v1_app_app_id_endpoint_endpoint_id_stats_get_with_http_info(endpoint_id, app_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <EndpointStats>
rescue svix::ApiError => e
  puts "Error when calling EndpointApi->get_endpoint_stats_api_v1_app_app_id_endpoint_endpoint_id_stats_get_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **endpoint_id** | **String** |  |  |
| **app_id** | **String** |  |  |
| **idempotency_key** | **String** | The request&#39;s idempotency key | [optional] |

### Return type

[**EndpointStats**](EndpointStats.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## list_endpoints_api_v1_app_app_id_endpoint_get

> <ListResponseEndpointOut> list_endpoints_api_v1_app_app_id_endpoint_get(app_id, opts)

List Endpoints

List the application's endpoints.

### Examples

```ruby
require 'time'
require 'svix'
# setup authorization
svix.configure do |config|
  # Configure Bearer authorization: HTTPBearer
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = svix::EndpointApi.new
app_id = 'app_1srOrx2ZWZBpBUvZwXKQmoEYga2' # String | 
opts = {
  iterator: 'ep_1srOrx2ZWZBpBUvZwXKQmoEYga2', # String | 
  limit: 56, # Integer | 
  idempotency_key: 'idempotency_key_example' # String | The request's idempotency key
}

begin
  # List Endpoints
  result = api_instance.list_endpoints_api_v1_app_app_id_endpoint_get(app_id, opts)
  p result
rescue svix::ApiError => e
  puts "Error when calling EndpointApi->list_endpoints_api_v1_app_app_id_endpoint_get: #{e}"
end
```

#### Using the list_endpoints_api_v1_app_app_id_endpoint_get_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<ListResponseEndpointOut>, Integer, Hash)> list_endpoints_api_v1_app_app_id_endpoint_get_with_http_info(app_id, opts)

```ruby
begin
  # List Endpoints
  data, status_code, headers = api_instance.list_endpoints_api_v1_app_app_id_endpoint_get_with_http_info(app_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <ListResponseEndpointOut>
rescue svix::ApiError => e
  puts "Error when calling EndpointApi->list_endpoints_api_v1_app_app_id_endpoint_get_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **app_id** | **String** |  |  |
| **iterator** | **String** |  | [optional] |
| **limit** | **Integer** |  | [optional][default to 50] |
| **idempotency_key** | **String** | The request&#39;s idempotency key | [optional] |

### Return type

[**ListResponseEndpointOut**](ListResponseEndpointOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## patch_endpoint_headers_api_v1_app_app_id_endpoint_endpoint_id_headers_patch

> patch_endpoint_headers_api_v1_app_app_id_endpoint_endpoint_id_headers_patch(app_id, endpoint_id, endpoint_headers_patch_in, opts)

Patch Endpoint Headers

Partially set the additional headers to be sent with the webhook

### Examples

```ruby
require 'time'
require 'svix'
# setup authorization
svix.configure do |config|
  # Configure Bearer authorization: HTTPBearer
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = svix::EndpointApi.new
app_id = 'app_1srOrx2ZWZBpBUvZwXKQmoEYga2' # String | 
endpoint_id = 'ep_1srOrx2ZWZBpBUvZwXKQmoEYga2' # String | 
endpoint_headers_patch_in = svix::EndpointHeadersPatchIn.new({headers: { key: 'inner_example'}}) # EndpointHeadersPatchIn | 
opts = {
  idempotency_key: 'idempotency_key_example' # String | The request's idempotency key
}

begin
  # Patch Endpoint Headers
  api_instance.patch_endpoint_headers_api_v1_app_app_id_endpoint_endpoint_id_headers_patch(app_id, endpoint_id, endpoint_headers_patch_in, opts)
rescue svix::ApiError => e
  puts "Error when calling EndpointApi->patch_endpoint_headers_api_v1_app_app_id_endpoint_endpoint_id_headers_patch: #{e}"
end
```

#### Using the patch_endpoint_headers_api_v1_app_app_id_endpoint_endpoint_id_headers_patch_with_http_info variant

This returns an Array which contains the response data (`nil` in this case), status code and headers.

> <Array(nil, Integer, Hash)> patch_endpoint_headers_api_v1_app_app_id_endpoint_endpoint_id_headers_patch_with_http_info(app_id, endpoint_id, endpoint_headers_patch_in, opts)

```ruby
begin
  # Patch Endpoint Headers
  data, status_code, headers = api_instance.patch_endpoint_headers_api_v1_app_app_id_endpoint_endpoint_id_headers_patch_with_http_info(app_id, endpoint_id, endpoint_headers_patch_in, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => nil
rescue svix::ApiError => e
  puts "Error when calling EndpointApi->patch_endpoint_headers_api_v1_app_app_id_endpoint_endpoint_id_headers_patch_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **app_id** | **String** |  |  |
| **endpoint_id** | **String** |  |  |
| **endpoint_headers_patch_in** | [**EndpointHeadersPatchIn**](EndpointHeadersPatchIn.md) |  |  |
| **idempotency_key** | **String** | The request&#39;s idempotency key | [optional] |

### Return type

nil (empty response body)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## recover_failed_webhooks_api_v1_app_app_id_endpoint_endpoint_id_recover_post

> Object recover_failed_webhooks_api_v1_app_app_id_endpoint_endpoint_id_recover_post(app_id, endpoint_id, recover_in, opts)

Recover Failed Webhooks

Resend all failed messages since a given time.

### Examples

```ruby
require 'time'
require 'svix'
# setup authorization
svix.configure do |config|
  # Configure Bearer authorization: HTTPBearer
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = svix::EndpointApi.new
app_id = 'app_1srOrx2ZWZBpBUvZwXKQmoEYga2' # String | 
endpoint_id = 'ep_1srOrx2ZWZBpBUvZwXKQmoEYga2' # String | 
recover_in = svix::RecoverIn.new({since: Time.now}) # RecoverIn | 
opts = {
  idempotency_key: 'idempotency_key_example' # String | The request's idempotency key
}

begin
  # Recover Failed Webhooks
  result = api_instance.recover_failed_webhooks_api_v1_app_app_id_endpoint_endpoint_id_recover_post(app_id, endpoint_id, recover_in, opts)
  p result
rescue svix::ApiError => e
  puts "Error when calling EndpointApi->recover_failed_webhooks_api_v1_app_app_id_endpoint_endpoint_id_recover_post: #{e}"
end
```

#### Using the recover_failed_webhooks_api_v1_app_app_id_endpoint_endpoint_id_recover_post_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(Object, Integer, Hash)> recover_failed_webhooks_api_v1_app_app_id_endpoint_endpoint_id_recover_post_with_http_info(app_id, endpoint_id, recover_in, opts)

```ruby
begin
  # Recover Failed Webhooks
  data, status_code, headers = api_instance.recover_failed_webhooks_api_v1_app_app_id_endpoint_endpoint_id_recover_post_with_http_info(app_id, endpoint_id, recover_in, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => Object
rescue svix::ApiError => e
  puts "Error when calling EndpointApi->recover_failed_webhooks_api_v1_app_app_id_endpoint_endpoint_id_recover_post_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **app_id** | **String** |  |  |
| **endpoint_id** | **String** |  |  |
| **recover_in** | [**RecoverIn**](RecoverIn.md) |  |  |
| **idempotency_key** | **String** | The request&#39;s idempotency key | [optional] |

### Return type

**Object**

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## replay_missing_webhooks_api_v1_app_app_id_endpoint_endpoint_id_replay_missing_post

> Object replay_missing_webhooks_api_v1_app_app_id_endpoint_endpoint_id_replay_missing_post(app_id, endpoint_id, replay_in, opts)

Replay Missing Webhooks

Replays messages to the endpoint. Only messages that were created after `since` will be sent. Messages that were previously sent to the endpoint are not resent.

### Examples

```ruby
require 'time'
require 'svix'
# setup authorization
svix.configure do |config|
  # Configure Bearer authorization: HTTPBearer
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = svix::EndpointApi.new
app_id = 'app_1srOrx2ZWZBpBUvZwXKQmoEYga2' # String | 
endpoint_id = 'ep_1srOrx2ZWZBpBUvZwXKQmoEYga2' # String | 
replay_in = svix::ReplayIn.new({since: Time.now}) # ReplayIn | 
opts = {
  idempotency_key: 'idempotency_key_example' # String | The request's idempotency key
}

begin
  # Replay Missing Webhooks
  result = api_instance.replay_missing_webhooks_api_v1_app_app_id_endpoint_endpoint_id_replay_missing_post(app_id, endpoint_id, replay_in, opts)
  p result
rescue svix::ApiError => e
  puts "Error when calling EndpointApi->replay_missing_webhooks_api_v1_app_app_id_endpoint_endpoint_id_replay_missing_post: #{e}"
end
```

#### Using the replay_missing_webhooks_api_v1_app_app_id_endpoint_endpoint_id_replay_missing_post_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(Object, Integer, Hash)> replay_missing_webhooks_api_v1_app_app_id_endpoint_endpoint_id_replay_missing_post_with_http_info(app_id, endpoint_id, replay_in, opts)

```ruby
begin
  # Replay Missing Webhooks
  data, status_code, headers = api_instance.replay_missing_webhooks_api_v1_app_app_id_endpoint_endpoint_id_replay_missing_post_with_http_info(app_id, endpoint_id, replay_in, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => Object
rescue svix::ApiError => e
  puts "Error when calling EndpointApi->replay_missing_webhooks_api_v1_app_app_id_endpoint_endpoint_id_replay_missing_post_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **app_id** | **String** |  |  |
| **endpoint_id** | **String** |  |  |
| **replay_in** | [**ReplayIn**](ReplayIn.md) |  |  |
| **idempotency_key** | **String** | The request&#39;s idempotency key | [optional] |

### Return type

**Object**

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## rotate_endpoint_secret_api_v1_app_app_id_endpoint_endpoint_id_secret_rotate_post

> rotate_endpoint_secret_api_v1_app_app_id_endpoint_endpoint_id_secret_rotate_post(endpoint_id, app_id, endpoint_secret_rotate_in, opts)

Rotate Endpoint Secret

Rotates the endpoint's signing secret.  The previous secret will be valid for the next 24 hours.

### Examples

```ruby
require 'time'
require 'svix'
# setup authorization
svix.configure do |config|
  # Configure Bearer authorization: HTTPBearer
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = svix::EndpointApi.new
endpoint_id = 'ep_1srOrx2ZWZBpBUvZwXKQmoEYga2' # String | 
app_id = 'app_1srOrx2ZWZBpBUvZwXKQmoEYga2' # String | 
endpoint_secret_rotate_in = svix::EndpointSecretRotateIn.new # EndpointSecretRotateIn | 
opts = {
  idempotency_key: 'idempotency_key_example' # String | The request's idempotency key
}

begin
  # Rotate Endpoint Secret
  api_instance.rotate_endpoint_secret_api_v1_app_app_id_endpoint_endpoint_id_secret_rotate_post(endpoint_id, app_id, endpoint_secret_rotate_in, opts)
rescue svix::ApiError => e
  puts "Error when calling EndpointApi->rotate_endpoint_secret_api_v1_app_app_id_endpoint_endpoint_id_secret_rotate_post: #{e}"
end
```

#### Using the rotate_endpoint_secret_api_v1_app_app_id_endpoint_endpoint_id_secret_rotate_post_with_http_info variant

This returns an Array which contains the response data (`nil` in this case), status code and headers.

> <Array(nil, Integer, Hash)> rotate_endpoint_secret_api_v1_app_app_id_endpoint_endpoint_id_secret_rotate_post_with_http_info(endpoint_id, app_id, endpoint_secret_rotate_in, opts)

```ruby
begin
  # Rotate Endpoint Secret
  data, status_code, headers = api_instance.rotate_endpoint_secret_api_v1_app_app_id_endpoint_endpoint_id_secret_rotate_post_with_http_info(endpoint_id, app_id, endpoint_secret_rotate_in, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => nil
rescue svix::ApiError => e
  puts "Error when calling EndpointApi->rotate_endpoint_secret_api_v1_app_app_id_endpoint_endpoint_id_secret_rotate_post_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **endpoint_id** | **String** |  |  |
| **app_id** | **String** |  |  |
| **endpoint_secret_rotate_in** | [**EndpointSecretRotateIn**](EndpointSecretRotateIn.md) |  |  |
| **idempotency_key** | **String** | The request&#39;s idempotency key | [optional] |

### Return type

nil (empty response body)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## update_endpoint_api_v1_app_app_id_endpoint_endpoint_id_put

> <EndpointOut> update_endpoint_api_v1_app_app_id_endpoint_endpoint_id_put(endpoint_id, app_id, endpoint_update, opts)

Update Endpoint

Update an endpoint.

### Examples

```ruby
require 'time'
require 'svix'
# setup authorization
svix.configure do |config|
  # Configure Bearer authorization: HTTPBearer
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = svix::EndpointApi.new
endpoint_id = 'ep_1srOrx2ZWZBpBUvZwXKQmoEYga2' # String | 
app_id = 'app_1srOrx2ZWZBpBUvZwXKQmoEYga2' # String | 
endpoint_update = svix::EndpointUpdate.new({url: 'https://example.com/webhook/', version: 1}) # EndpointUpdate | 
opts = {
  idempotency_key: 'idempotency_key_example' # String | The request's idempotency key
}

begin
  # Update Endpoint
  result = api_instance.update_endpoint_api_v1_app_app_id_endpoint_endpoint_id_put(endpoint_id, app_id, endpoint_update, opts)
  p result
rescue svix::ApiError => e
  puts "Error when calling EndpointApi->update_endpoint_api_v1_app_app_id_endpoint_endpoint_id_put: #{e}"
end
```

#### Using the update_endpoint_api_v1_app_app_id_endpoint_endpoint_id_put_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<EndpointOut>, Integer, Hash)> update_endpoint_api_v1_app_app_id_endpoint_endpoint_id_put_with_http_info(endpoint_id, app_id, endpoint_update, opts)

```ruby
begin
  # Update Endpoint
  data, status_code, headers = api_instance.update_endpoint_api_v1_app_app_id_endpoint_endpoint_id_put_with_http_info(endpoint_id, app_id, endpoint_update, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <EndpointOut>
rescue svix::ApiError => e
  puts "Error when calling EndpointApi->update_endpoint_api_v1_app_app_id_endpoint_endpoint_id_put_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **endpoint_id** | **String** |  |  |
| **app_id** | **String** |  |  |
| **endpoint_update** | [**EndpointUpdate**](EndpointUpdate.md) |  |  |
| **idempotency_key** | **String** | The request&#39;s idempotency key | [optional] |

### Return type

[**EndpointOut**](EndpointOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## update_endpoint_headers_api_v1_app_app_id_endpoint_endpoint_id_headers_put

> update_endpoint_headers_api_v1_app_app_id_endpoint_endpoint_id_headers_put(app_id, endpoint_id, endpoint_headers_in, opts)

Update Endpoint Headers

Set the additional headers to be sent with the webhook

### Examples

```ruby
require 'time'
require 'svix'
# setup authorization
svix.configure do |config|
  # Configure Bearer authorization: HTTPBearer
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = svix::EndpointApi.new
app_id = 'app_1srOrx2ZWZBpBUvZwXKQmoEYga2' # String | 
endpoint_id = 'ep_1srOrx2ZWZBpBUvZwXKQmoEYga2' # String | 
endpoint_headers_in = svix::EndpointHeadersIn.new({headers: { key: 'inner_example'}}) # EndpointHeadersIn | 
opts = {
  idempotency_key: 'idempotency_key_example' # String | The request's idempotency key
}

begin
  # Update Endpoint Headers
  api_instance.update_endpoint_headers_api_v1_app_app_id_endpoint_endpoint_id_headers_put(app_id, endpoint_id, endpoint_headers_in, opts)
rescue svix::ApiError => e
  puts "Error when calling EndpointApi->update_endpoint_headers_api_v1_app_app_id_endpoint_endpoint_id_headers_put: #{e}"
end
```

#### Using the update_endpoint_headers_api_v1_app_app_id_endpoint_endpoint_id_headers_put_with_http_info variant

This returns an Array which contains the response data (`nil` in this case), status code and headers.

> <Array(nil, Integer, Hash)> update_endpoint_headers_api_v1_app_app_id_endpoint_endpoint_id_headers_put_with_http_info(app_id, endpoint_id, endpoint_headers_in, opts)

```ruby
begin
  # Update Endpoint Headers
  data, status_code, headers = api_instance.update_endpoint_headers_api_v1_app_app_id_endpoint_endpoint_id_headers_put_with_http_info(app_id, endpoint_id, endpoint_headers_in, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => nil
rescue svix::ApiError => e
  puts "Error when calling EndpointApi->update_endpoint_headers_api_v1_app_app_id_endpoint_endpoint_id_headers_put_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **app_id** | **String** |  |  |
| **endpoint_id** | **String** |  |  |
| **endpoint_headers_in** | [**EndpointHeadersIn**](EndpointHeadersIn.md) |  |  |
| **idempotency_key** | **String** | The request&#39;s idempotency key | [optional] |

### Return type

nil (empty response body)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

