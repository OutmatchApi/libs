# svix::IntegrationApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**create_integration_api_v1_app_app_id_integration_post**](IntegrationApi.md#create_integration_api_v1_app_app_id_integration_post) | **POST** /api/v1/app/{app_id}/integration/ | Create Integration |
| [**delete_integration_api_v1_app_app_id_integration_integ_id_delete**](IntegrationApi.md#delete_integration_api_v1_app_app_id_integration_integ_id_delete) | **DELETE** /api/v1/app/{app_id}/integration/{integ_id}/ | Delete Integration |
| [**get_integration_api_v1_app_app_id_integration_integ_id_get**](IntegrationApi.md#get_integration_api_v1_app_app_id_integration_integ_id_get) | **GET** /api/v1/app/{app_id}/integration/{integ_id}/ | Get Integration |
| [**get_integration_key_api_v1_app_app_id_integration_integ_id_key_get**](IntegrationApi.md#get_integration_key_api_v1_app_app_id_integration_integ_id_key_get) | **GET** /api/v1/app/{app_id}/integration/{integ_id}/key/ | Get Integration Key |
| [**list_integrations_api_v1_app_app_id_integration_get**](IntegrationApi.md#list_integrations_api_v1_app_app_id_integration_get) | **GET** /api/v1/app/{app_id}/integration/ | List Integrations |
| [**rotate_integration_key_api_v1_app_app_id_integration_integ_id_key_rotate_post**](IntegrationApi.md#rotate_integration_key_api_v1_app_app_id_integration_integ_id_key_rotate_post) | **POST** /api/v1/app/{app_id}/integration/{integ_id}/key/rotate/ | Rotate Integration Key |
| [**update_integration_api_v1_app_app_id_integration_integ_id_put**](IntegrationApi.md#update_integration_api_v1_app_app_id_integration_integ_id_put) | **PUT** /api/v1/app/{app_id}/integration/{integ_id}/ | Update Integration |


## create_integration_api_v1_app_app_id_integration_post

> <IntegrationOut> create_integration_api_v1_app_app_id_integration_post(app_id, integration_in, opts)

Create Integration

Create an integration.

### Examples

```ruby
require 'time'
require 'svix'
# setup authorization
svix.configure do |config|
  # Configure Bearer authorization: HTTPBearer
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = svix::IntegrationApi.new
app_id = 'app_1srOrx2ZWZBpBUvZwXKQmoEYga2' # String | 
integration_in = svix::IntegrationIn.new({name: 'Example Integration'}) # IntegrationIn | 
opts = {
  idempotency_key: 'idempotency_key_example' # String | The request's idempotency key
}

begin
  # Create Integration
  result = api_instance.create_integration_api_v1_app_app_id_integration_post(app_id, integration_in, opts)
  p result
rescue svix::ApiError => e
  puts "Error when calling IntegrationApi->create_integration_api_v1_app_app_id_integration_post: #{e}"
end
```

#### Using the create_integration_api_v1_app_app_id_integration_post_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<IntegrationOut>, Integer, Hash)> create_integration_api_v1_app_app_id_integration_post_with_http_info(app_id, integration_in, opts)

```ruby
begin
  # Create Integration
  data, status_code, headers = api_instance.create_integration_api_v1_app_app_id_integration_post_with_http_info(app_id, integration_in, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <IntegrationOut>
rescue svix::ApiError => e
  puts "Error when calling IntegrationApi->create_integration_api_v1_app_app_id_integration_post_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **app_id** | **String** |  |  |
| **integration_in** | [**IntegrationIn**](IntegrationIn.md) |  |  |
| **idempotency_key** | **String** | The request&#39;s idempotency key | [optional] |

### Return type

[**IntegrationOut**](IntegrationOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## delete_integration_api_v1_app_app_id_integration_integ_id_delete

> delete_integration_api_v1_app_app_id_integration_integ_id_delete(integ_id, app_id, opts)

Delete Integration

Delete an integration and revoke it's key.

### Examples

```ruby
require 'time'
require 'svix'
# setup authorization
svix.configure do |config|
  # Configure Bearer authorization: HTTPBearer
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = svix::IntegrationApi.new
integ_id = 'integ_1srOrx2ZWZBpBUvZwXKQmoEYga2' # String | 
app_id = 'app_1srOrx2ZWZBpBUvZwXKQmoEYga2' # String | 
opts = {
  idempotency_key: 'idempotency_key_example' # String | The request's idempotency key
}

begin
  # Delete Integration
  api_instance.delete_integration_api_v1_app_app_id_integration_integ_id_delete(integ_id, app_id, opts)
rescue svix::ApiError => e
  puts "Error when calling IntegrationApi->delete_integration_api_v1_app_app_id_integration_integ_id_delete: #{e}"
end
```

#### Using the delete_integration_api_v1_app_app_id_integration_integ_id_delete_with_http_info variant

This returns an Array which contains the response data (`nil` in this case), status code and headers.

> <Array(nil, Integer, Hash)> delete_integration_api_v1_app_app_id_integration_integ_id_delete_with_http_info(integ_id, app_id, opts)

```ruby
begin
  # Delete Integration
  data, status_code, headers = api_instance.delete_integration_api_v1_app_app_id_integration_integ_id_delete_with_http_info(integ_id, app_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => nil
rescue svix::ApiError => e
  puts "Error when calling IntegrationApi->delete_integration_api_v1_app_app_id_integration_integ_id_delete_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **integ_id** | **String** |  |  |
| **app_id** | **String** |  |  |
| **idempotency_key** | **String** | The request&#39;s idempotency key | [optional] |

### Return type

nil (empty response body)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## get_integration_api_v1_app_app_id_integration_integ_id_get

> <IntegrationOut> get_integration_api_v1_app_app_id_integration_integ_id_get(integ_id, app_id, opts)

Get Integration

Get an integration.

### Examples

```ruby
require 'time'
require 'svix'
# setup authorization
svix.configure do |config|
  # Configure Bearer authorization: HTTPBearer
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = svix::IntegrationApi.new
integ_id = 'integ_1srOrx2ZWZBpBUvZwXKQmoEYga2' # String | 
app_id = 'app_1srOrx2ZWZBpBUvZwXKQmoEYga2' # String | 
opts = {
  idempotency_key: 'idempotency_key_example' # String | The request's idempotency key
}

begin
  # Get Integration
  result = api_instance.get_integration_api_v1_app_app_id_integration_integ_id_get(integ_id, app_id, opts)
  p result
rescue svix::ApiError => e
  puts "Error when calling IntegrationApi->get_integration_api_v1_app_app_id_integration_integ_id_get: #{e}"
end
```

#### Using the get_integration_api_v1_app_app_id_integration_integ_id_get_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<IntegrationOut>, Integer, Hash)> get_integration_api_v1_app_app_id_integration_integ_id_get_with_http_info(integ_id, app_id, opts)

```ruby
begin
  # Get Integration
  data, status_code, headers = api_instance.get_integration_api_v1_app_app_id_integration_integ_id_get_with_http_info(integ_id, app_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <IntegrationOut>
rescue svix::ApiError => e
  puts "Error when calling IntegrationApi->get_integration_api_v1_app_app_id_integration_integ_id_get_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **integ_id** | **String** |  |  |
| **app_id** | **String** |  |  |
| **idempotency_key** | **String** | The request&#39;s idempotency key | [optional] |

### Return type

[**IntegrationOut**](IntegrationOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## get_integration_key_api_v1_app_app_id_integration_integ_id_key_get

> <IntegrationKeyOut> get_integration_key_api_v1_app_app_id_integration_integ_id_key_get(integ_id, app_id, opts)

Get Integration Key

Get an integration's key.

### Examples

```ruby
require 'time'
require 'svix'
# setup authorization
svix.configure do |config|
  # Configure Bearer authorization: HTTPBearer
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = svix::IntegrationApi.new
integ_id = 'integ_1srOrx2ZWZBpBUvZwXKQmoEYga2' # String | 
app_id = 'app_1srOrx2ZWZBpBUvZwXKQmoEYga2' # String | 
opts = {
  idempotency_key: 'idempotency_key_example' # String | The request's idempotency key
}

begin
  # Get Integration Key
  result = api_instance.get_integration_key_api_v1_app_app_id_integration_integ_id_key_get(integ_id, app_id, opts)
  p result
rescue svix::ApiError => e
  puts "Error when calling IntegrationApi->get_integration_key_api_v1_app_app_id_integration_integ_id_key_get: #{e}"
end
```

#### Using the get_integration_key_api_v1_app_app_id_integration_integ_id_key_get_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<IntegrationKeyOut>, Integer, Hash)> get_integration_key_api_v1_app_app_id_integration_integ_id_key_get_with_http_info(integ_id, app_id, opts)

```ruby
begin
  # Get Integration Key
  data, status_code, headers = api_instance.get_integration_key_api_v1_app_app_id_integration_integ_id_key_get_with_http_info(integ_id, app_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <IntegrationKeyOut>
rescue svix::ApiError => e
  puts "Error when calling IntegrationApi->get_integration_key_api_v1_app_app_id_integration_integ_id_key_get_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **integ_id** | **String** |  |  |
| **app_id** | **String** |  |  |
| **idempotency_key** | **String** | The request&#39;s idempotency key | [optional] |

### Return type

[**IntegrationKeyOut**](IntegrationKeyOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## list_integrations_api_v1_app_app_id_integration_get

> <ListResponseIntegrationOut> list_integrations_api_v1_app_app_id_integration_get(app_id, opts)

List Integrations

List the application's integrations.

### Examples

```ruby
require 'time'
require 'svix'
# setup authorization
svix.configure do |config|
  # Configure Bearer authorization: HTTPBearer
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = svix::IntegrationApi.new
app_id = 'app_1srOrx2ZWZBpBUvZwXKQmoEYga2' # String | 
opts = {
  iterator: 'integ_1srOrx2ZWZBpBUvZwXKQmoEYga2', # String | 
  limit: 56, # Integer | 
  idempotency_key: 'idempotency_key_example' # String | The request's idempotency key
}

begin
  # List Integrations
  result = api_instance.list_integrations_api_v1_app_app_id_integration_get(app_id, opts)
  p result
rescue svix::ApiError => e
  puts "Error when calling IntegrationApi->list_integrations_api_v1_app_app_id_integration_get: #{e}"
end
```

#### Using the list_integrations_api_v1_app_app_id_integration_get_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<ListResponseIntegrationOut>, Integer, Hash)> list_integrations_api_v1_app_app_id_integration_get_with_http_info(app_id, opts)

```ruby
begin
  # List Integrations
  data, status_code, headers = api_instance.list_integrations_api_v1_app_app_id_integration_get_with_http_info(app_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <ListResponseIntegrationOut>
rescue svix::ApiError => e
  puts "Error when calling IntegrationApi->list_integrations_api_v1_app_app_id_integration_get_with_http_info: #{e}"
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

[**ListResponseIntegrationOut**](ListResponseIntegrationOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## rotate_integration_key_api_v1_app_app_id_integration_integ_id_key_rotate_post

> <IntegrationKeyOut> rotate_integration_key_api_v1_app_app_id_integration_integ_id_key_rotate_post(integ_id, app_id, opts)

Rotate Integration Key

Rotate the integration's key. The previous key will be immediately revoked.

### Examples

```ruby
require 'time'
require 'svix'
# setup authorization
svix.configure do |config|
  # Configure Bearer authorization: HTTPBearer
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = svix::IntegrationApi.new
integ_id = 'integ_1srOrx2ZWZBpBUvZwXKQmoEYga2' # String | 
app_id = 'app_1srOrx2ZWZBpBUvZwXKQmoEYga2' # String | 
opts = {
  idempotency_key: 'idempotency_key_example' # String | The request's idempotency key
}

begin
  # Rotate Integration Key
  result = api_instance.rotate_integration_key_api_v1_app_app_id_integration_integ_id_key_rotate_post(integ_id, app_id, opts)
  p result
rescue svix::ApiError => e
  puts "Error when calling IntegrationApi->rotate_integration_key_api_v1_app_app_id_integration_integ_id_key_rotate_post: #{e}"
end
```

#### Using the rotate_integration_key_api_v1_app_app_id_integration_integ_id_key_rotate_post_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<IntegrationKeyOut>, Integer, Hash)> rotate_integration_key_api_v1_app_app_id_integration_integ_id_key_rotate_post_with_http_info(integ_id, app_id, opts)

```ruby
begin
  # Rotate Integration Key
  data, status_code, headers = api_instance.rotate_integration_key_api_v1_app_app_id_integration_integ_id_key_rotate_post_with_http_info(integ_id, app_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <IntegrationKeyOut>
rescue svix::ApiError => e
  puts "Error when calling IntegrationApi->rotate_integration_key_api_v1_app_app_id_integration_integ_id_key_rotate_post_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **integ_id** | **String** |  |  |
| **app_id** | **String** |  |  |
| **idempotency_key** | **String** | The request&#39;s idempotency key | [optional] |

### Return type

[**IntegrationKeyOut**](IntegrationKeyOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## update_integration_api_v1_app_app_id_integration_integ_id_put

> <IntegrationOut> update_integration_api_v1_app_app_id_integration_integ_id_put(integ_id, app_id, integration_update, opts)

Update Integration

Update an integration.

### Examples

```ruby
require 'time'
require 'svix'
# setup authorization
svix.configure do |config|
  # Configure Bearer authorization: HTTPBearer
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = svix::IntegrationApi.new
integ_id = 'integ_1srOrx2ZWZBpBUvZwXKQmoEYga2' # String | 
app_id = 'app_1srOrx2ZWZBpBUvZwXKQmoEYga2' # String | 
integration_update = svix::IntegrationUpdate.new({name: 'Example Integration'}) # IntegrationUpdate | 
opts = {
  idempotency_key: 'idempotency_key_example' # String | The request's idempotency key
}

begin
  # Update Integration
  result = api_instance.update_integration_api_v1_app_app_id_integration_integ_id_put(integ_id, app_id, integration_update, opts)
  p result
rescue svix::ApiError => e
  puts "Error when calling IntegrationApi->update_integration_api_v1_app_app_id_integration_integ_id_put: #{e}"
end
```

#### Using the update_integration_api_v1_app_app_id_integration_integ_id_put_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<IntegrationOut>, Integer, Hash)> update_integration_api_v1_app_app_id_integration_integ_id_put_with_http_info(integ_id, app_id, integration_update, opts)

```ruby
begin
  # Update Integration
  data, status_code, headers = api_instance.update_integration_api_v1_app_app_id_integration_integ_id_put_with_http_info(integ_id, app_id, integration_update, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <IntegrationOut>
rescue svix::ApiError => e
  puts "Error when calling IntegrationApi->update_integration_api_v1_app_app_id_integration_integ_id_put_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **integ_id** | **String** |  |  |
| **app_id** | **String** |  |  |
| **integration_update** | [**IntegrationUpdate**](IntegrationUpdate.md) |  |  |
| **idempotency_key** | **String** | The request&#39;s idempotency key | [optional] |

### Return type

[**IntegrationOut**](IntegrationOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

