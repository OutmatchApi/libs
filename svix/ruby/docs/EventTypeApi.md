# svix::EventTypeApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**create_event_type_api_v1_event_type_post**](EventTypeApi.md#create_event_type_api_v1_event_type_post) | **POST** /api/v1/event-type/ | Create Event Type |
| [**delete_event_type_api_v1_event_type_event_type_name_delete**](EventTypeApi.md#delete_event_type_api_v1_event_type_event_type_name_delete) | **DELETE** /api/v1/event-type/{event_type_name}/ | Archive Event Type |
| [**get_event_type_api_v1_event_type_event_type_name_get**](EventTypeApi.md#get_event_type_api_v1_event_type_event_type_name_get) | **GET** /api/v1/event-type/{event_type_name}/ | Get Event Type |
| [**list_event_types_api_v1_event_type_get**](EventTypeApi.md#list_event_types_api_v1_event_type_get) | **GET** /api/v1/event-type/ | List Event Types |
| [**update_event_type_api_v1_event_type_event_type_name_put**](EventTypeApi.md#update_event_type_api_v1_event_type_event_type_name_put) | **PUT** /api/v1/event-type/{event_type_name}/ | Update Event Type |


## create_event_type_api_v1_event_type_post

> <EventTypeOut> create_event_type_api_v1_event_type_post(event_type_in, opts)

Create Event Type

Create new or unarchive existing event type.  Unarchiving an event type will allow endpoints to filter on it and messages to be sent with it. Endpoints filtering on the event type before archival will continue to filter on it. This operation does not preserve the description and schemas.

### Examples

```ruby
require 'time'
require 'svix'
# setup authorization
svix.configure do |config|
  # Configure Bearer authorization: HTTPBearer
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = svix::EventTypeApi.new
event_type_in = svix::EventTypeIn.new({description: 'A user has signed up', name: 'user.signup'}) # EventTypeIn | 
opts = {
  idempotency_key: 'idempotency_key_example' # String | The request's idempotency key
}

begin
  # Create Event Type
  result = api_instance.create_event_type_api_v1_event_type_post(event_type_in, opts)
  p result
rescue svix::ApiError => e
  puts "Error when calling EventTypeApi->create_event_type_api_v1_event_type_post: #{e}"
end
```

#### Using the create_event_type_api_v1_event_type_post_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<EventTypeOut>, Integer, Hash)> create_event_type_api_v1_event_type_post_with_http_info(event_type_in, opts)

```ruby
begin
  # Create Event Type
  data, status_code, headers = api_instance.create_event_type_api_v1_event_type_post_with_http_info(event_type_in, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <EventTypeOut>
rescue svix::ApiError => e
  puts "Error when calling EventTypeApi->create_event_type_api_v1_event_type_post_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **event_type_in** | [**EventTypeIn**](EventTypeIn.md) |  |  |
| **idempotency_key** | **String** | The request&#39;s idempotency key | [optional] |

### Return type

[**EventTypeOut**](EventTypeOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## delete_event_type_api_v1_event_type_event_type_name_delete

> delete_event_type_api_v1_event_type_event_type_name_delete(event_type_name, opts)

Archive Event Type

Archive an event type.  Endpoints already configured to filter on an event type will continue to do so after archival. However, new messages can not be sent with it and endpoints can not filter on it. An event type can be unarchived with the [create operation](#operation/create_event_type_api_v1_event_type__post).

### Examples

```ruby
require 'time'
require 'svix'
# setup authorization
svix.configure do |config|
  # Configure Bearer authorization: HTTPBearer
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = svix::EventTypeApi.new
event_type_name = 'user.signup' # String | 
opts = {
  idempotency_key: 'idempotency_key_example' # String | The request's idempotency key
}

begin
  # Archive Event Type
  api_instance.delete_event_type_api_v1_event_type_event_type_name_delete(event_type_name, opts)
rescue svix::ApiError => e
  puts "Error when calling EventTypeApi->delete_event_type_api_v1_event_type_event_type_name_delete: #{e}"
end
```

#### Using the delete_event_type_api_v1_event_type_event_type_name_delete_with_http_info variant

This returns an Array which contains the response data (`nil` in this case), status code and headers.

> <Array(nil, Integer, Hash)> delete_event_type_api_v1_event_type_event_type_name_delete_with_http_info(event_type_name, opts)

```ruby
begin
  # Archive Event Type
  data, status_code, headers = api_instance.delete_event_type_api_v1_event_type_event_type_name_delete_with_http_info(event_type_name, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => nil
rescue svix::ApiError => e
  puts "Error when calling EventTypeApi->delete_event_type_api_v1_event_type_event_type_name_delete_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **event_type_name** | **String** |  |  |
| **idempotency_key** | **String** | The request&#39;s idempotency key | [optional] |

### Return type

nil (empty response body)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## get_event_type_api_v1_event_type_event_type_name_get

> <EventTypeOut> get_event_type_api_v1_event_type_event_type_name_get(event_type_name, opts)

Get Event Type

Get an event type.

### Examples

```ruby
require 'time'
require 'svix'
# setup authorization
svix.configure do |config|
  # Configure Bearer authorization: HTTPBearer
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = svix::EventTypeApi.new
event_type_name = 'user.signup' # String | 
opts = {
  idempotency_key: 'idempotency_key_example' # String | The request's idempotency key
}

begin
  # Get Event Type
  result = api_instance.get_event_type_api_v1_event_type_event_type_name_get(event_type_name, opts)
  p result
rescue svix::ApiError => e
  puts "Error when calling EventTypeApi->get_event_type_api_v1_event_type_event_type_name_get: #{e}"
end
```

#### Using the get_event_type_api_v1_event_type_event_type_name_get_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<EventTypeOut>, Integer, Hash)> get_event_type_api_v1_event_type_event_type_name_get_with_http_info(event_type_name, opts)

```ruby
begin
  # Get Event Type
  data, status_code, headers = api_instance.get_event_type_api_v1_event_type_event_type_name_get_with_http_info(event_type_name, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <EventTypeOut>
rescue svix::ApiError => e
  puts "Error when calling EventTypeApi->get_event_type_api_v1_event_type_event_type_name_get_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **event_type_name** | **String** |  |  |
| **idempotency_key** | **String** | The request&#39;s idempotency key | [optional] |

### Return type

[**EventTypeOut**](EventTypeOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## list_event_types_api_v1_event_type_get

> <ListResponseEventTypeOut> list_event_types_api_v1_event_type_get(opts)

List Event Types

Return the list of event types.

### Examples

```ruby
require 'time'
require 'svix'
# setup authorization
svix.configure do |config|
  # Configure Bearer authorization: HTTPBearer
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = svix::EventTypeApi.new
opts = {
  iterator: 'user.signup', # String | 
  limit: 56, # Integer | 
  with_content: true, # Boolean | 
  include_archived: true, # Boolean | 
  idempotency_key: 'idempotency_key_example' # String | The request's idempotency key
}

begin
  # List Event Types
  result = api_instance.list_event_types_api_v1_event_type_get(opts)
  p result
rescue svix::ApiError => e
  puts "Error when calling EventTypeApi->list_event_types_api_v1_event_type_get: #{e}"
end
```

#### Using the list_event_types_api_v1_event_type_get_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<ListResponseEventTypeOut>, Integer, Hash)> list_event_types_api_v1_event_type_get_with_http_info(opts)

```ruby
begin
  # List Event Types
  data, status_code, headers = api_instance.list_event_types_api_v1_event_type_get_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <ListResponseEventTypeOut>
rescue svix::ApiError => e
  puts "Error when calling EventTypeApi->list_event_types_api_v1_event_type_get_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **iterator** | **String** |  | [optional] |
| **limit** | **Integer** |  | [optional][default to 50] |
| **with_content** | **Boolean** |  | [optional][default to false] |
| **include_archived** | **Boolean** |  | [optional][default to false] |
| **idempotency_key** | **String** | The request&#39;s idempotency key | [optional] |

### Return type

[**ListResponseEventTypeOut**](ListResponseEventTypeOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## update_event_type_api_v1_event_type_event_type_name_put

> <EventTypeOut> update_event_type_api_v1_event_type_event_type_name_put(event_type_name, event_type_update, opts)

Update Event Type

Update an event type.

### Examples

```ruby
require 'time'
require 'svix'
# setup authorization
svix.configure do |config|
  # Configure Bearer authorization: HTTPBearer
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = svix::EventTypeApi.new
event_type_name = 'user.signup' # String | 
event_type_update = svix::EventTypeUpdate.new({description: 'A user has signed up'}) # EventTypeUpdate | 
opts = {
  idempotency_key: 'idempotency_key_example' # String | The request's idempotency key
}

begin
  # Update Event Type
  result = api_instance.update_event_type_api_v1_event_type_event_type_name_put(event_type_name, event_type_update, opts)
  p result
rescue svix::ApiError => e
  puts "Error when calling EventTypeApi->update_event_type_api_v1_event_type_event_type_name_put: #{e}"
end
```

#### Using the update_event_type_api_v1_event_type_event_type_name_put_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<EventTypeOut>, Integer, Hash)> update_event_type_api_v1_event_type_event_type_name_put_with_http_info(event_type_name, event_type_update, opts)

```ruby
begin
  # Update Event Type
  data, status_code, headers = api_instance.update_event_type_api_v1_event_type_event_type_name_put_with_http_info(event_type_name, event_type_update, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <EventTypeOut>
rescue svix::ApiError => e
  puts "Error when calling EventTypeApi->update_event_type_api_v1_event_type_event_type_name_put_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **event_type_name** | **String** |  |  |
| **event_type_update** | [**EventTypeUpdate**](EventTypeUpdate.md) |  |  |
| **idempotency_key** | **String** | The request&#39;s idempotency key | [optional] |

### Return type

[**EventTypeOut**](EventTypeOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

