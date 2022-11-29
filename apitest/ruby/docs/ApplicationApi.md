# apitest::ApplicationApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**create_application_api_v1_app_post**](ApplicationApi.md#create_application_api_v1_app_post) | **POST** /api/v1/app/ | Create Application |
| [**delete_application_api_v1_app_app_id_delete**](ApplicationApi.md#delete_application_api_v1_app_app_id_delete) | **DELETE** /api/v1/app/{app_id}/ | Delete Application |
| [**get_application_api_v1_app_app_id_get**](ApplicationApi.md#get_application_api_v1_app_app_id_get) | **GET** /api/v1/app/{app_id}/ | Get Application |
| [**list_applications_api_v1_app_get**](ApplicationApi.md#list_applications_api_v1_app_get) | **GET** /api/v1/app/ | List Applications |
| [**update_application_api_v1_app_app_id_put**](ApplicationApi.md#update_application_api_v1_app_app_id_put) | **PUT** /api/v1/app/{app_id}/ | Update Application |


## create_application_api_v1_app_post

> <ApplicationOut> create_application_api_v1_app_post(application_in, opts)

Create Application

Create a new application.

### Examples

```ruby
require 'time'
require 'apitest'
# setup authorization
apitest.configure do |config|
  # Configure Bearer authorization: HTTPBearer
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = apitest::ApplicationApi.new
application_in = apitest::ApplicationIn.new({name: 'My first application'}) # ApplicationIn | 
opts = {
  get_if_exists: true, # Boolean | Get an existing application, or create a new one if doesn't exist. It's two separate functions in the libs.
  idempotency_key: 'idempotency_key_example' # String | The request's idempotency key
}

begin
  # Create Application
  result = api_instance.create_application_api_v1_app_post(application_in, opts)
  p result
rescue apitest::ApiError => e
  puts "Error when calling ApplicationApi->create_application_api_v1_app_post: #{e}"
end
```

#### Using the create_application_api_v1_app_post_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<ApplicationOut>, Integer, Hash)> create_application_api_v1_app_post_with_http_info(application_in, opts)

```ruby
begin
  # Create Application
  data, status_code, headers = api_instance.create_application_api_v1_app_post_with_http_info(application_in, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <ApplicationOut>
rescue apitest::ApiError => e
  puts "Error when calling ApplicationApi->create_application_api_v1_app_post_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **application_in** | [**ApplicationIn**](ApplicationIn.md) |  |  |
| **get_if_exists** | **Boolean** | Get an existing application, or create a new one if doesn&#39;t exist. It&#39;s two separate functions in the libs. | [optional][default to false] |
| **idempotency_key** | **String** | The request&#39;s idempotency key | [optional] |

### Return type

[**ApplicationOut**](ApplicationOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## delete_application_api_v1_app_app_id_delete

> delete_application_api_v1_app_app_id_delete(app_id, opts)

Delete Application

Delete an application.

### Examples

```ruby
require 'time'
require 'apitest'
# setup authorization
apitest.configure do |config|
  # Configure Bearer authorization: HTTPBearer
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = apitest::ApplicationApi.new
app_id = 'app_1srOrx2ZWZBpBUvZwXKQmoEYga2' # String | 
opts = {
  idempotency_key: 'idempotency_key_example' # String | The request's idempotency key
}

begin
  # Delete Application
  api_instance.delete_application_api_v1_app_app_id_delete(app_id, opts)
rescue apitest::ApiError => e
  puts "Error when calling ApplicationApi->delete_application_api_v1_app_app_id_delete: #{e}"
end
```

#### Using the delete_application_api_v1_app_app_id_delete_with_http_info variant

This returns an Array which contains the response data (`nil` in this case), status code and headers.

> <Array(nil, Integer, Hash)> delete_application_api_v1_app_app_id_delete_with_http_info(app_id, opts)

```ruby
begin
  # Delete Application
  data, status_code, headers = api_instance.delete_application_api_v1_app_app_id_delete_with_http_info(app_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => nil
rescue apitest::ApiError => e
  puts "Error when calling ApplicationApi->delete_application_api_v1_app_app_id_delete_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **app_id** | **String** |  |  |
| **idempotency_key** | **String** | The request&#39;s idempotency key | [optional] |

### Return type

nil (empty response body)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## get_application_api_v1_app_app_id_get

> <ApplicationOut> get_application_api_v1_app_app_id_get(app_id, opts)

Get Application

Get an application.

### Examples

```ruby
require 'time'
require 'apitest'
# setup authorization
apitest.configure do |config|
  # Configure Bearer authorization: HTTPBearer
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = apitest::ApplicationApi.new
app_id = 'app_1srOrx2ZWZBpBUvZwXKQmoEYga2' # String | 
opts = {
  idempotency_key: 'idempotency_key_example' # String | The request's idempotency key
}

begin
  # Get Application
  result = api_instance.get_application_api_v1_app_app_id_get(app_id, opts)
  p result
rescue apitest::ApiError => e
  puts "Error when calling ApplicationApi->get_application_api_v1_app_app_id_get: #{e}"
end
```

#### Using the get_application_api_v1_app_app_id_get_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<ApplicationOut>, Integer, Hash)> get_application_api_v1_app_app_id_get_with_http_info(app_id, opts)

```ruby
begin
  # Get Application
  data, status_code, headers = api_instance.get_application_api_v1_app_app_id_get_with_http_info(app_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <ApplicationOut>
rescue apitest::ApiError => e
  puts "Error when calling ApplicationApi->get_application_api_v1_app_app_id_get_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **app_id** | **String** |  |  |
| **idempotency_key** | **String** | The request&#39;s idempotency key | [optional] |

### Return type

[**ApplicationOut**](ApplicationOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## list_applications_api_v1_app_get

> <ListResponseApplicationOut> list_applications_api_v1_app_get(opts)

List Applications

List of all the organization's applications.

### Examples

```ruby
require 'time'
require 'apitest'
# setup authorization
apitest.configure do |config|
  # Configure Bearer authorization: HTTPBearer
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = apitest::ApplicationApi.new
opts = {
  iterator: 'app_1srOrx2ZWZBpBUvZwXKQmoEYga2', # String | 
  limit: 56, # Integer | 
  idempotency_key: 'idempotency_key_example' # String | The request's idempotency key
}

begin
  # List Applications
  result = api_instance.list_applications_api_v1_app_get(opts)
  p result
rescue apitest::ApiError => e
  puts "Error when calling ApplicationApi->list_applications_api_v1_app_get: #{e}"
end
```

#### Using the list_applications_api_v1_app_get_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<ListResponseApplicationOut>, Integer, Hash)> list_applications_api_v1_app_get_with_http_info(opts)

```ruby
begin
  # List Applications
  data, status_code, headers = api_instance.list_applications_api_v1_app_get_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <ListResponseApplicationOut>
rescue apitest::ApiError => e
  puts "Error when calling ApplicationApi->list_applications_api_v1_app_get_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **iterator** | **String** |  | [optional] |
| **limit** | **Integer** |  | [optional][default to 50] |
| **idempotency_key** | **String** | The request&#39;s idempotency key | [optional] |

### Return type

[**ListResponseApplicationOut**](ListResponseApplicationOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## update_application_api_v1_app_app_id_put

> <ApplicationOut> update_application_api_v1_app_app_id_put(app_id, application_in, opts)

Update Application

Update an application.

### Examples

```ruby
require 'time'
require 'apitest'
# setup authorization
apitest.configure do |config|
  # Configure Bearer authorization: HTTPBearer
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = apitest::ApplicationApi.new
app_id = 'app_1srOrx2ZWZBpBUvZwXKQmoEYga2' # String | 
application_in = apitest::ApplicationIn.new({name: 'My first application'}) # ApplicationIn | 
opts = {
  idempotency_key: 'idempotency_key_example' # String | The request's idempotency key
}

begin
  # Update Application
  result = api_instance.update_application_api_v1_app_app_id_put(app_id, application_in, opts)
  p result
rescue apitest::ApiError => e
  puts "Error when calling ApplicationApi->update_application_api_v1_app_app_id_put: #{e}"
end
```

#### Using the update_application_api_v1_app_app_id_put_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<ApplicationOut>, Integer, Hash)> update_application_api_v1_app_app_id_put_with_http_info(app_id, application_in, opts)

```ruby
begin
  # Update Application
  data, status_code, headers = api_instance.update_application_api_v1_app_app_id_put_with_http_info(app_id, application_in, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <ApplicationOut>
rescue apitest::ApiError => e
  puts "Error when calling ApplicationApi->update_application_api_v1_app_app_id_put_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **app_id** | **String** |  |  |
| **application_in** | [**ApplicationIn**](ApplicationIn.md) |  |  |
| **idempotency_key** | **String** | The request&#39;s idempotency key | [optional] |

### Return type

[**ApplicationOut**](ApplicationOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

