# apitest::HealthApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**health_api_v1_health_get**](HealthApi.md#health_api_v1_health_get) | **GET** /api/v1/health/ | Health |


## health_api_v1_health_get

> health_api_v1_health_get(opts)

Health

Verify the API server is up and running.

### Examples

```ruby
require 'time'
require 'apitest'

api_instance = apitest::HealthApi.new
opts = {
  idempotency_key: 'idempotency_key_example' # String | The request's idempotency key
}

begin
  # Health
  api_instance.health_api_v1_health_get(opts)
rescue apitest::ApiError => e
  puts "Error when calling HealthApi->health_api_v1_health_get: #{e}"
end
```

#### Using the health_api_v1_health_get_with_http_info variant

This returns an Array which contains the response data (`nil` in this case), status code and headers.

> <Array(nil, Integer, Hash)> health_api_v1_health_get_with_http_info(opts)

```ruby
begin
  # Health
  data, status_code, headers = api_instance.health_api_v1_health_get_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => nil
rescue apitest::ApiError => e
  puts "Error when calling HealthApi->health_api_v1_health_get_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **idempotency_key** | **String** | The request&#39;s idempotency key | [optional] |

### Return type

nil (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

