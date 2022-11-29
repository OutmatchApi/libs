# svix::MessageAttemptApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**get_attempt_api_v1_app_app_id_msg_msg_id_attempt_attempt_id_get**](MessageAttemptApi.md#get_attempt_api_v1_app_app_id_msg_msg_id_attempt_attempt_id_get) | **GET** /api/v1/app/{app_id}/msg/{msg_id}/attempt/{attempt_id}/ | Get Attempt |
| [**list_attempted_destinations_api_v1_app_app_id_msg_msg_id_endpoint_get**](MessageAttemptApi.md#list_attempted_destinations_api_v1_app_app_id_msg_msg_id_endpoint_get) | **GET** /api/v1/app/{app_id}/msg/{msg_id}/endpoint/ | List Attempted Destinations |
| [**list_attempted_messages_api_v1_app_app_id_endpoint_endpoint_id_msg_get**](MessageAttemptApi.md#list_attempted_messages_api_v1_app_app_id_endpoint_endpoint_id_msg_get) | **GET** /api/v1/app/{app_id}/endpoint/{endpoint_id}/msg/ | List Attempted Messages |
| [**list_attempts_api_v1_app_app_id_msg_msg_id_attempt_get**](MessageAttemptApi.md#list_attempts_api_v1_app_app_id_msg_msg_id_attempt_get) | **GET** /api/v1/app/{app_id}/msg/{msg_id}/attempt/ | List Attempts |
| [**list_attempts_by_endpoint_api_v1_app_app_id_attempt_endpoint_endpoint_id_get**](MessageAttemptApi.md#list_attempts_by_endpoint_api_v1_app_app_id_attempt_endpoint_endpoint_id_get) | **GET** /api/v1/app/{app_id}/attempt/endpoint/{endpoint_id}/ | List Attempts By Endpoint |
| [**list_attempts_by_msg_api_v1_app_app_id_attempt_msg_msg_id_get**](MessageAttemptApi.md#list_attempts_by_msg_api_v1_app_app_id_attempt_msg_msg_id_get) | **GET** /api/v1/app/{app_id}/attempt/msg/{msg_id}/ | List Attempts By Msg |
| [**list_attempts_for_endpoint_api_v1_app_app_id_msg_msg_id_endpoint_endpoint_id_attempt_get**](MessageAttemptApi.md#list_attempts_for_endpoint_api_v1_app_app_id_msg_msg_id_endpoint_endpoint_id_attempt_get) | **GET** /api/v1/app/{app_id}/msg/{msg_id}/endpoint/{endpoint_id}/attempt/ | List Attempts For Endpoint |
| [**resend_webhook_api_v1_app_app_id_msg_msg_id_endpoint_endpoint_id_resend_post**](MessageAttemptApi.md#resend_webhook_api_v1_app_app_id_msg_msg_id_endpoint_endpoint_id_resend_post) | **POST** /api/v1/app/{app_id}/msg/{msg_id}/endpoint/{endpoint_id}/resend/ | Resend Webhook |


## get_attempt_api_v1_app_app_id_msg_msg_id_attempt_attempt_id_get

> <MessageAttemptOut> get_attempt_api_v1_app_app_id_msg_msg_id_attempt_attempt_id_get(attempt_id, msg_id, app_id, opts)

Get Attempt

`msg_id`: Use a message id or a message `eventId`

### Examples

```ruby
require 'time'
require 'svix'
# setup authorization
svix.configure do |config|
  # Configure Bearer authorization: HTTPBearer
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = svix::MessageAttemptApi.new
attempt_id = 'atmpt_1srOrx2ZWZBpBUvZwXKQmoEYga2' # String | 
msg_id = 'msg_1srOrx2ZWZBpBUvZwXKQmoEYga2' # String | 
app_id = 'app_1srOrx2ZWZBpBUvZwXKQmoEYga2' # String | 
opts = {
  idempotency_key: 'idempotency_key_example' # String | The request's idempotency key
}

begin
  # Get Attempt
  result = api_instance.get_attempt_api_v1_app_app_id_msg_msg_id_attempt_attempt_id_get(attempt_id, msg_id, app_id, opts)
  p result
rescue svix::ApiError => e
  puts "Error when calling MessageAttemptApi->get_attempt_api_v1_app_app_id_msg_msg_id_attempt_attempt_id_get: #{e}"
end
```

#### Using the get_attempt_api_v1_app_app_id_msg_msg_id_attempt_attempt_id_get_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<MessageAttemptOut>, Integer, Hash)> get_attempt_api_v1_app_app_id_msg_msg_id_attempt_attempt_id_get_with_http_info(attempt_id, msg_id, app_id, opts)

```ruby
begin
  # Get Attempt
  data, status_code, headers = api_instance.get_attempt_api_v1_app_app_id_msg_msg_id_attempt_attempt_id_get_with_http_info(attempt_id, msg_id, app_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <MessageAttemptOut>
rescue svix::ApiError => e
  puts "Error when calling MessageAttemptApi->get_attempt_api_v1_app_app_id_msg_msg_id_attempt_attempt_id_get_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **attempt_id** | **String** |  |  |
| **msg_id** | **String** |  |  |
| **app_id** | **String** |  |  |
| **idempotency_key** | **String** | The request&#39;s idempotency key | [optional] |

### Return type

[**MessageAttemptOut**](MessageAttemptOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## list_attempted_destinations_api_v1_app_app_id_msg_msg_id_endpoint_get

> <ListResponseMessageEndpointOut> list_attempted_destinations_api_v1_app_app_id_msg_msg_id_endpoint_get(msg_id, app_id, opts)

List Attempted Destinations

`msg_id`: Use a message id or a message `eventId`

### Examples

```ruby
require 'time'
require 'svix'
# setup authorization
svix.configure do |config|
  # Configure Bearer authorization: HTTPBearer
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = svix::MessageAttemptApi.new
msg_id = 'msg_1srOrx2ZWZBpBUvZwXKQmoEYga2' # String | 
app_id = 'app_1srOrx2ZWZBpBUvZwXKQmoEYga2' # String | 
opts = {
  iterator: 'msgep_1srOrx2ZWZBpBUvZwXKQmoEYga2', # String | 
  limit: 56, # Integer | 
  idempotency_key: 'idempotency_key_example' # String | The request's idempotency key
}

begin
  # List Attempted Destinations
  result = api_instance.list_attempted_destinations_api_v1_app_app_id_msg_msg_id_endpoint_get(msg_id, app_id, opts)
  p result
rescue svix::ApiError => e
  puts "Error when calling MessageAttemptApi->list_attempted_destinations_api_v1_app_app_id_msg_msg_id_endpoint_get: #{e}"
end
```

#### Using the list_attempted_destinations_api_v1_app_app_id_msg_msg_id_endpoint_get_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<ListResponseMessageEndpointOut>, Integer, Hash)> list_attempted_destinations_api_v1_app_app_id_msg_msg_id_endpoint_get_with_http_info(msg_id, app_id, opts)

```ruby
begin
  # List Attempted Destinations
  data, status_code, headers = api_instance.list_attempted_destinations_api_v1_app_app_id_msg_msg_id_endpoint_get_with_http_info(msg_id, app_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <ListResponseMessageEndpointOut>
rescue svix::ApiError => e
  puts "Error when calling MessageAttemptApi->list_attempted_destinations_api_v1_app_app_id_msg_msg_id_endpoint_get_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **msg_id** | **String** |  |  |
| **app_id** | **String** |  |  |
| **iterator** | **String** |  | [optional] |
| **limit** | **Integer** |  | [optional][default to 50] |
| **idempotency_key** | **String** | The request&#39;s idempotency key | [optional] |

### Return type

[**ListResponseMessageEndpointOut**](ListResponseMessageEndpointOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## list_attempted_messages_api_v1_app_app_id_endpoint_endpoint_id_msg_get

> <ListResponseEndpointMessageOut> list_attempted_messages_api_v1_app_app_id_endpoint_endpoint_id_msg_get(endpoint_id, app_id, opts)

List Attempted Messages

List messages for a particular endpoint. Additionally includes metadata about the latest message attempt.  The `before` parameter lets you filter all items created before a certain date and is ignored if an iterator is passed.

### Examples

```ruby
require 'time'
require 'svix'
# setup authorization
svix.configure do |config|
  # Configure Bearer authorization: HTTPBearer
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = svix::MessageAttemptApi.new
endpoint_id = 'ep_1srOrx2ZWZBpBUvZwXKQmoEYga2' # String | 
app_id = 'app_1srOrx2ZWZBpBUvZwXKQmoEYga2' # String | 
opts = {
  iterator: 'msg_1srOrx2ZWZBpBUvZwXKQmoEYga2', # String | 
  limit: 56, # Integer | 
  channel: 'project_1337', # String | 
  status: svix::MessageStatus::Success, # MessageStatus | 
  before: Time.parse('2013-10-20T19:20:30+01:00'), # Time | 
  after: Time.parse('2013-10-20T19:20:30+01:00'), # Time | 
  idempotency_key: 'idempotency_key_example' # String | The request's idempotency key
}

begin
  # List Attempted Messages
  result = api_instance.list_attempted_messages_api_v1_app_app_id_endpoint_endpoint_id_msg_get(endpoint_id, app_id, opts)
  p result
rescue svix::ApiError => e
  puts "Error when calling MessageAttemptApi->list_attempted_messages_api_v1_app_app_id_endpoint_endpoint_id_msg_get: #{e}"
end
```

#### Using the list_attempted_messages_api_v1_app_app_id_endpoint_endpoint_id_msg_get_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<ListResponseEndpointMessageOut>, Integer, Hash)> list_attempted_messages_api_v1_app_app_id_endpoint_endpoint_id_msg_get_with_http_info(endpoint_id, app_id, opts)

```ruby
begin
  # List Attempted Messages
  data, status_code, headers = api_instance.list_attempted_messages_api_v1_app_app_id_endpoint_endpoint_id_msg_get_with_http_info(endpoint_id, app_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <ListResponseEndpointMessageOut>
rescue svix::ApiError => e
  puts "Error when calling MessageAttemptApi->list_attempted_messages_api_v1_app_app_id_endpoint_endpoint_id_msg_get_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **endpoint_id** | **String** |  |  |
| **app_id** | **String** |  |  |
| **iterator** | **String** |  | [optional] |
| **limit** | **Integer** |  | [optional][default to 50] |
| **channel** | **String** |  | [optional] |
| **status** | [**MessageStatus**](.md) |  | [optional] |
| **before** | **Time** |  | [optional] |
| **after** | **Time** |  | [optional] |
| **idempotency_key** | **String** | The request&#39;s idempotency key | [optional] |

### Return type

[**ListResponseEndpointMessageOut**](ListResponseEndpointMessageOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## list_attempts_api_v1_app_app_id_msg_msg_id_attempt_get

> <ListResponseMessageAttemptOut> list_attempts_api_v1_app_app_id_msg_msg_id_attempt_get(app_id, msg_id, opts)

List Attempts

Deprecated: Please use \"List Attempts by Endpoint\" and \"List Attempts by Msg\" instead.  `msg_id`: Use a message id or a message `eventId`

### Examples

```ruby
require 'time'
require 'svix'
# setup authorization
svix.configure do |config|
  # Configure Bearer authorization: HTTPBearer
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = svix::MessageAttemptApi.new
app_id = 'app_1srOrx2ZWZBpBUvZwXKQmoEYga2' # String | 
msg_id = 'msg_1srOrx2ZWZBpBUvZwXKQmoEYga2' # String | 
opts = {
  iterator: 'atmpt_1srOrx2ZWZBpBUvZwXKQmoEYga2', # String | 
  limit: 56, # Integer | 
  endpoint_id: 'ep_1srOrx2ZWZBpBUvZwXKQmoEYga2', # String | 
  event_types: ['user.signup'], # Array<String> | 
  channel: 'project_1337', # String | 
  status: svix::MessageStatus::Success, # MessageStatus | 
  before: Time.parse('2013-10-20T19:20:30+01:00'), # Time | 
  after: Time.parse('2013-10-20T19:20:30+01:00'), # Time | 
  idempotency_key: 'idempotency_key_example' # String | The request's idempotency key
}

begin
  # List Attempts
  result = api_instance.list_attempts_api_v1_app_app_id_msg_msg_id_attempt_get(app_id, msg_id, opts)
  p result
rescue svix::ApiError => e
  puts "Error when calling MessageAttemptApi->list_attempts_api_v1_app_app_id_msg_msg_id_attempt_get: #{e}"
end
```

#### Using the list_attempts_api_v1_app_app_id_msg_msg_id_attempt_get_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<ListResponseMessageAttemptOut>, Integer, Hash)> list_attempts_api_v1_app_app_id_msg_msg_id_attempt_get_with_http_info(app_id, msg_id, opts)

```ruby
begin
  # List Attempts
  data, status_code, headers = api_instance.list_attempts_api_v1_app_app_id_msg_msg_id_attempt_get_with_http_info(app_id, msg_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <ListResponseMessageAttemptOut>
rescue svix::ApiError => e
  puts "Error when calling MessageAttemptApi->list_attempts_api_v1_app_app_id_msg_msg_id_attempt_get_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **app_id** | **String** |  |  |
| **msg_id** | **String** |  |  |
| **iterator** | **String** |  | [optional] |
| **limit** | **Integer** |  | [optional][default to 50] |
| **endpoint_id** | **String** |  | [optional] |
| **event_types** | [**Array&lt;String&gt;**](String.md) |  | [optional] |
| **channel** | **String** |  | [optional] |
| **status** | [**MessageStatus**](.md) |  | [optional] |
| **before** | **Time** |  | [optional] |
| **after** | **Time** |  | [optional] |
| **idempotency_key** | **String** | The request&#39;s idempotency key | [optional] |

### Return type

[**ListResponseMessageAttemptOut**](ListResponseMessageAttemptOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## list_attempts_by_endpoint_api_v1_app_app_id_attempt_endpoint_endpoint_id_get

> <ListResponseMessageAttemptOut> list_attempts_by_endpoint_api_v1_app_app_id_attempt_endpoint_endpoint_id_get(app_id, endpoint_id, opts)

List Attempts By Endpoint

List attempts by endpoint id

### Examples

```ruby
require 'time'
require 'svix'
# setup authorization
svix.configure do |config|
  # Configure Bearer authorization: HTTPBearer
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = svix::MessageAttemptApi.new
app_id = 'app_1srOrx2ZWZBpBUvZwXKQmoEYga2' # String | 
endpoint_id = 'ep_1srOrx2ZWZBpBUvZwXKQmoEYga2' # String | 
opts = {
  iterator: 'atmpt_1srOrx2ZWZBpBUvZwXKQmoEYga2', # String | 
  limit: 56, # Integer | 
  status: svix::MessageStatus::Success, # MessageStatus | 
  status_code_class: svix::StatusCodeClass::CodeNone, # StatusCodeClass | 
  event_types: ['user.signup'], # Array<String> | 
  channel: 'project_1337', # String | 
  before: Time.parse('2013-10-20T19:20:30+01:00'), # Time | 
  after: Time.parse('2013-10-20T19:20:30+01:00'), # Time | 
  idempotency_key: 'idempotency_key_example' # String | The request's idempotency key
}

begin
  # List Attempts By Endpoint
  result = api_instance.list_attempts_by_endpoint_api_v1_app_app_id_attempt_endpoint_endpoint_id_get(app_id, endpoint_id, opts)
  p result
rescue svix::ApiError => e
  puts "Error when calling MessageAttemptApi->list_attempts_by_endpoint_api_v1_app_app_id_attempt_endpoint_endpoint_id_get: #{e}"
end
```

#### Using the list_attempts_by_endpoint_api_v1_app_app_id_attempt_endpoint_endpoint_id_get_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<ListResponseMessageAttemptOut>, Integer, Hash)> list_attempts_by_endpoint_api_v1_app_app_id_attempt_endpoint_endpoint_id_get_with_http_info(app_id, endpoint_id, opts)

```ruby
begin
  # List Attempts By Endpoint
  data, status_code, headers = api_instance.list_attempts_by_endpoint_api_v1_app_app_id_attempt_endpoint_endpoint_id_get_with_http_info(app_id, endpoint_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <ListResponseMessageAttemptOut>
rescue svix::ApiError => e
  puts "Error when calling MessageAttemptApi->list_attempts_by_endpoint_api_v1_app_app_id_attempt_endpoint_endpoint_id_get_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **app_id** | **String** |  |  |
| **endpoint_id** | **String** |  |  |
| **iterator** | **String** |  | [optional] |
| **limit** | **Integer** |  | [optional][default to 50] |
| **status** | [**MessageStatus**](.md) |  | [optional] |
| **status_code_class** | [**StatusCodeClass**](.md) |  | [optional] |
| **event_types** | [**Array&lt;String&gt;**](String.md) |  | [optional] |
| **channel** | **String** |  | [optional] |
| **before** | **Time** |  | [optional] |
| **after** | **Time** |  | [optional] |
| **idempotency_key** | **String** | The request&#39;s idempotency key | [optional] |

### Return type

[**ListResponseMessageAttemptOut**](ListResponseMessageAttemptOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## list_attempts_by_msg_api_v1_app_app_id_attempt_msg_msg_id_get

> <ListResponseMessageAttemptOut> list_attempts_by_msg_api_v1_app_app_id_attempt_msg_msg_id_get(app_id, msg_id, opts)

List Attempts By Msg

List attempts by message id

### Examples

```ruby
require 'time'
require 'svix'
# setup authorization
svix.configure do |config|
  # Configure Bearer authorization: HTTPBearer
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = svix::MessageAttemptApi.new
app_id = 'app_1srOrx2ZWZBpBUvZwXKQmoEYga2' # String | 
msg_id = 'msg_1srOrx2ZWZBpBUvZwXKQmoEYga2' # String | 
opts = {
  endpoint_id: 'ep_1srOrx2ZWZBpBUvZwXKQmoEYga2', # String | 
  iterator: 'atmpt_1srOrx2ZWZBpBUvZwXKQmoEYga2', # String | 
  limit: 56, # Integer | 
  status: svix::MessageStatus::Success, # MessageStatus | 
  status_code_class: svix::StatusCodeClass::CodeNone, # StatusCodeClass | 
  event_types: ['user.signup'], # Array<String> | 
  channel: 'project_1337', # String | 
  before: Time.parse('2013-10-20T19:20:30+01:00'), # Time | 
  after: Time.parse('2013-10-20T19:20:30+01:00'), # Time | 
  idempotency_key: 'idempotency_key_example' # String | The request's idempotency key
}

begin
  # List Attempts By Msg
  result = api_instance.list_attempts_by_msg_api_v1_app_app_id_attempt_msg_msg_id_get(app_id, msg_id, opts)
  p result
rescue svix::ApiError => e
  puts "Error when calling MessageAttemptApi->list_attempts_by_msg_api_v1_app_app_id_attempt_msg_msg_id_get: #{e}"
end
```

#### Using the list_attempts_by_msg_api_v1_app_app_id_attempt_msg_msg_id_get_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<ListResponseMessageAttemptOut>, Integer, Hash)> list_attempts_by_msg_api_v1_app_app_id_attempt_msg_msg_id_get_with_http_info(app_id, msg_id, opts)

```ruby
begin
  # List Attempts By Msg
  data, status_code, headers = api_instance.list_attempts_by_msg_api_v1_app_app_id_attempt_msg_msg_id_get_with_http_info(app_id, msg_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <ListResponseMessageAttemptOut>
rescue svix::ApiError => e
  puts "Error when calling MessageAttemptApi->list_attempts_by_msg_api_v1_app_app_id_attempt_msg_msg_id_get_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **app_id** | **String** |  |  |
| **msg_id** | **String** |  |  |
| **endpoint_id** | **String** |  | [optional] |
| **iterator** | **String** |  | [optional] |
| **limit** | **Integer** |  | [optional][default to 50] |
| **status** | [**MessageStatus**](.md) |  | [optional] |
| **status_code_class** | [**StatusCodeClass**](.md) |  | [optional] |
| **event_types** | [**Array&lt;String&gt;**](String.md) |  | [optional] |
| **channel** | **String** |  | [optional] |
| **before** | **Time** |  | [optional] |
| **after** | **Time** |  | [optional] |
| **idempotency_key** | **String** | The request&#39;s idempotency key | [optional] |

### Return type

[**ListResponseMessageAttemptOut**](ListResponseMessageAttemptOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## list_attempts_for_endpoint_api_v1_app_app_id_msg_msg_id_endpoint_endpoint_id_attempt_get

> <ListResponseMessageAttemptEndpointOut> list_attempts_for_endpoint_api_v1_app_app_id_msg_msg_id_endpoint_endpoint_id_attempt_get(msg_id, app_id, endpoint_id, opts)

List Attempts For Endpoint

DEPRECATED: please use list_attempts with endpoint_id as a query parameter instead.  List the message attempts for a particular endpoint.  Returning the endpoint.  The `before` parameter lets you filter all items created before a certain date and is ignored if an iterator is passed.

### Examples

```ruby
require 'time'
require 'svix'
# setup authorization
svix.configure do |config|
  # Configure Bearer authorization: HTTPBearer
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = svix::MessageAttemptApi.new
msg_id = 'msg_1srOrx2ZWZBpBUvZwXKQmoEYga2' # String | 
app_id = 'app_1srOrx2ZWZBpBUvZwXKQmoEYga2' # String | 
endpoint_id = 'ep_1srOrx2ZWZBpBUvZwXKQmoEYga2' # String | 
opts = {
  iterator: 'atmpt_1srOrx2ZWZBpBUvZwXKQmoEYga2', # String | 
  limit: 56, # Integer | 
  event_types: ['user.signup'], # Array<String> | 
  channel: 'project_1337', # String | 
  status: svix::MessageStatus::Success, # MessageStatus | 
  before: Time.parse('2013-10-20T19:20:30+01:00'), # Time | 
  after: Time.parse('2013-10-20T19:20:30+01:00'), # Time | 
  idempotency_key: 'idempotency_key_example' # String | The request's idempotency key
}

begin
  # List Attempts For Endpoint
  result = api_instance.list_attempts_for_endpoint_api_v1_app_app_id_msg_msg_id_endpoint_endpoint_id_attempt_get(msg_id, app_id, endpoint_id, opts)
  p result
rescue svix::ApiError => e
  puts "Error when calling MessageAttemptApi->list_attempts_for_endpoint_api_v1_app_app_id_msg_msg_id_endpoint_endpoint_id_attempt_get: #{e}"
end
```

#### Using the list_attempts_for_endpoint_api_v1_app_app_id_msg_msg_id_endpoint_endpoint_id_attempt_get_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<ListResponseMessageAttemptEndpointOut>, Integer, Hash)> list_attempts_for_endpoint_api_v1_app_app_id_msg_msg_id_endpoint_endpoint_id_attempt_get_with_http_info(msg_id, app_id, endpoint_id, opts)

```ruby
begin
  # List Attempts For Endpoint
  data, status_code, headers = api_instance.list_attempts_for_endpoint_api_v1_app_app_id_msg_msg_id_endpoint_endpoint_id_attempt_get_with_http_info(msg_id, app_id, endpoint_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <ListResponseMessageAttemptEndpointOut>
rescue svix::ApiError => e
  puts "Error when calling MessageAttemptApi->list_attempts_for_endpoint_api_v1_app_app_id_msg_msg_id_endpoint_endpoint_id_attempt_get_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **msg_id** | **String** |  |  |
| **app_id** | **String** |  |  |
| **endpoint_id** | **String** |  |  |
| **iterator** | **String** |  | [optional] |
| **limit** | **Integer** |  | [optional][default to 50] |
| **event_types** | [**Array&lt;String&gt;**](String.md) |  | [optional] |
| **channel** | **String** |  | [optional] |
| **status** | [**MessageStatus**](.md) |  | [optional] |
| **before** | **Time** |  | [optional] |
| **after** | **Time** |  | [optional] |
| **idempotency_key** | **String** | The request&#39;s idempotency key | [optional] |

### Return type

[**ListResponseMessageAttemptEndpointOut**](ListResponseMessageAttemptEndpointOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## resend_webhook_api_v1_app_app_id_msg_msg_id_endpoint_endpoint_id_resend_post

> resend_webhook_api_v1_app_app_id_msg_msg_id_endpoint_endpoint_id_resend_post(endpoint_id, msg_id, app_id, opts)

Resend Webhook

Resend a message to the specified endpoint.

### Examples

```ruby
require 'time'
require 'svix'
# setup authorization
svix.configure do |config|
  # Configure Bearer authorization: HTTPBearer
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = svix::MessageAttemptApi.new
endpoint_id = 'ep_1srOrx2ZWZBpBUvZwXKQmoEYga2' # String | 
msg_id = 'msg_1srOrx2ZWZBpBUvZwXKQmoEYga2' # String | 
app_id = 'app_1srOrx2ZWZBpBUvZwXKQmoEYga2' # String | 
opts = {
  idempotency_key: 'idempotency_key_example' # String | The request's idempotency key
}

begin
  # Resend Webhook
  api_instance.resend_webhook_api_v1_app_app_id_msg_msg_id_endpoint_endpoint_id_resend_post(endpoint_id, msg_id, app_id, opts)
rescue svix::ApiError => e
  puts "Error when calling MessageAttemptApi->resend_webhook_api_v1_app_app_id_msg_msg_id_endpoint_endpoint_id_resend_post: #{e}"
end
```

#### Using the resend_webhook_api_v1_app_app_id_msg_msg_id_endpoint_endpoint_id_resend_post_with_http_info variant

This returns an Array which contains the response data (`nil` in this case), status code and headers.

> <Array(nil, Integer, Hash)> resend_webhook_api_v1_app_app_id_msg_msg_id_endpoint_endpoint_id_resend_post_with_http_info(endpoint_id, msg_id, app_id, opts)

```ruby
begin
  # Resend Webhook
  data, status_code, headers = api_instance.resend_webhook_api_v1_app_app_id_msg_msg_id_endpoint_endpoint_id_resend_post_with_http_info(endpoint_id, msg_id, app_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => nil
rescue svix::ApiError => e
  puts "Error when calling MessageAttemptApi->resend_webhook_api_v1_app_app_id_msg_msg_id_endpoint_endpoint_id_resend_post_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **endpoint_id** | **String** |  |  |
| **msg_id** | **String** |  |  |
| **app_id** | **String** |  |  |
| **idempotency_key** | **String** | The request&#39;s idempotency key | [optional] |

### Return type

nil (empty response body)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

