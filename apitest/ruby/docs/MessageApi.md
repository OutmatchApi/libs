# apitest::MessageApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**create_message_api_v1_app_app_id_msg_post**](MessageApi.md#create_message_api_v1_app_app_id_msg_post) | **POST** /api/v1/app/{app_id}/msg/ | Create Message |
| [**get_message_api_v1_app_app_id_msg_msg_id_get**](MessageApi.md#get_message_api_v1_app_app_id_msg_msg_id_get) | **GET** /api/v1/app/{app_id}/msg/{msg_id}/ | Get Message |
| [**list_messages_api_v1_app_app_id_msg_get**](MessageApi.md#list_messages_api_v1_app_app_id_msg_get) | **GET** /api/v1/app/{app_id}/msg/ | List Messages |


## create_message_api_v1_app_app_id_msg_post

> <MessageOut> create_message_api_v1_app_app_id_msg_post(app_id, message_in, opts)

Create Message

Creates a new message and dispatches it to all of the application's endpoints.  The `eventId` is an optional custom unique ID. It's verified to be unique only up to a day, after that no verification will be made. If a message with the same `eventId` already exists for any application in your environment, a 409 conflict error will be returned.  The `eventType` indicates the type and schema of the event. All messages of a certain `eventType` are expected to have the same schema. Endpoints can choose to only listen to specific event types. Messages can also have `channels`, which similar to event types let endpoints filter by them. Unlike event types, messages can have multiple channels, and channels don't imply a specific message content or schema.  The `payload' property is the webhook's body (the actual webhook message).

### Examples

```ruby
require 'time'
require 'apitest'
# setup authorization
apitest.configure do |config|
  # Configure Bearer authorization: HTTPBearer
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = apitest::MessageApi.new
app_id = 'app_1srOrx2ZWZBpBUvZwXKQmoEYga2' # String | 
message_in = apitest::MessageIn.new({event_type: 'user.signup', payload: {"username":"test_user","email":"test@example.com"}}) # MessageIn | 
opts = {
  with_content: true, # Boolean | 
  idempotency_key: 'idempotency_key_example' # String | The request's idempotency key
}

begin
  # Create Message
  result = api_instance.create_message_api_v1_app_app_id_msg_post(app_id, message_in, opts)
  p result
rescue apitest::ApiError => e
  puts "Error when calling MessageApi->create_message_api_v1_app_app_id_msg_post: #{e}"
end
```

#### Using the create_message_api_v1_app_app_id_msg_post_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<MessageOut>, Integer, Hash)> create_message_api_v1_app_app_id_msg_post_with_http_info(app_id, message_in, opts)

```ruby
begin
  # Create Message
  data, status_code, headers = api_instance.create_message_api_v1_app_app_id_msg_post_with_http_info(app_id, message_in, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <MessageOut>
rescue apitest::ApiError => e
  puts "Error when calling MessageApi->create_message_api_v1_app_app_id_msg_post_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **app_id** | **String** |  |  |
| **message_in** | [**MessageIn**](MessageIn.md) |  |  |
| **with_content** | **Boolean** |  | [optional][default to true] |
| **idempotency_key** | **String** | The request&#39;s idempotency key | [optional] |

### Return type

[**MessageOut**](MessageOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## get_message_api_v1_app_app_id_msg_msg_id_get

> <MessageOut> get_message_api_v1_app_app_id_msg_msg_id_get(msg_id, app_id, opts)

Get Message

Get a message by its ID or eventID.

### Examples

```ruby
require 'time'
require 'apitest'
# setup authorization
apitest.configure do |config|
  # Configure Bearer authorization: HTTPBearer
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = apitest::MessageApi.new
msg_id = 'msg_1srOrx2ZWZBpBUvZwXKQmoEYga2' # String | 
app_id = 'app_1srOrx2ZWZBpBUvZwXKQmoEYga2' # String | 
opts = {
  idempotency_key: 'idempotency_key_example' # String | The request's idempotency key
}

begin
  # Get Message
  result = api_instance.get_message_api_v1_app_app_id_msg_msg_id_get(msg_id, app_id, opts)
  p result
rescue apitest::ApiError => e
  puts "Error when calling MessageApi->get_message_api_v1_app_app_id_msg_msg_id_get: #{e}"
end
```

#### Using the get_message_api_v1_app_app_id_msg_msg_id_get_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<MessageOut>, Integer, Hash)> get_message_api_v1_app_app_id_msg_msg_id_get_with_http_info(msg_id, app_id, opts)

```ruby
begin
  # Get Message
  data, status_code, headers = api_instance.get_message_api_v1_app_app_id_msg_msg_id_get_with_http_info(msg_id, app_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <MessageOut>
rescue apitest::ApiError => e
  puts "Error when calling MessageApi->get_message_api_v1_app_app_id_msg_msg_id_get_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **msg_id** | **String** |  |  |
| **app_id** | **String** |  |  |
| **idempotency_key** | **String** | The request&#39;s idempotency key | [optional] |

### Return type

[**MessageOut**](MessageOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## list_messages_api_v1_app_app_id_msg_get

> <ListResponseMessageOut> list_messages_api_v1_app_app_id_msg_get(app_id, opts)

List Messages

List all of the application's messages.  The `before` parameter lets you filter all items created before a certain date and is ignored if an iterator is passed. The `after` parameter lets you filter all items created after a certain date and is ignored if an iterator is passed. `before` and `after` cannot be used simultaneously.

### Examples

```ruby
require 'time'
require 'apitest'
# setup authorization
apitest.configure do |config|
  # Configure Bearer authorization: HTTPBearer
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = apitest::MessageApi.new
app_id = 'app_1srOrx2ZWZBpBUvZwXKQmoEYga2' # String | 
opts = {
  iterator: 'msg_1srOrx2ZWZBpBUvZwXKQmoEYga2', # String | 
  limit: 56, # Integer | 
  event_types: ['user.signup'], # Array<String> | 
  channel: 'project_1337', # String | 
  before: Time.parse('2013-10-20T19:20:30+01:00'), # Time | 
  after: Time.parse('2013-10-20T19:20:30+01:00'), # Time | 
  idempotency_key: 'idempotency_key_example' # String | The request's idempotency key
}

begin
  # List Messages
  result = api_instance.list_messages_api_v1_app_app_id_msg_get(app_id, opts)
  p result
rescue apitest::ApiError => e
  puts "Error when calling MessageApi->list_messages_api_v1_app_app_id_msg_get: #{e}"
end
```

#### Using the list_messages_api_v1_app_app_id_msg_get_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<ListResponseMessageOut>, Integer, Hash)> list_messages_api_v1_app_app_id_msg_get_with_http_info(app_id, opts)

```ruby
begin
  # List Messages
  data, status_code, headers = api_instance.list_messages_api_v1_app_app_id_msg_get_with_http_info(app_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <ListResponseMessageOut>
rescue apitest::ApiError => e
  puts "Error when calling MessageApi->list_messages_api_v1_app_app_id_msg_get_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **app_id** | **String** |  |  |
| **iterator** | **String** |  | [optional] |
| **limit** | **Integer** |  | [optional][default to 50] |
| **event_types** | [**Array&lt;String&gt;**](String.md) |  | [optional] |
| **channel** | **String** |  | [optional] |
| **before** | **Time** |  | [optional] |
| **after** | **Time** |  | [optional] |
| **idempotency_key** | **String** | The request&#39;s idempotency key | [optional] |

### Return type

[**ListResponseMessageOut**](ListResponseMessageOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

