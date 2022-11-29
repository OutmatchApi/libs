# OpenAPI\Client\MessageApi

All URIs are relative to http://localhost, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createMessageApiV1AppAppIdMsgPost()**](MessageApi.md#createMessageApiV1AppAppIdMsgPost) | **POST** /api/v1/app/{app_id}/msg/ | Create Message |
| [**getMessageApiV1AppAppIdMsgMsgIdGet()**](MessageApi.md#getMessageApiV1AppAppIdMsgMsgIdGet) | **GET** /api/v1/app/{app_id}/msg/{msg_id}/ | Get Message |
| [**listMessagesApiV1AppAppIdMsgGet()**](MessageApi.md#listMessagesApiV1AppAppIdMsgGet) | **GET** /api/v1/app/{app_id}/msg/ | List Messages |


## `createMessageApiV1AppAppIdMsgPost()`

```php
createMessageApiV1AppAppIdMsgPost($app_id, $message_in, $with_content, $idempotency_key): \OpenAPI\Client\Model\MessageOut
```

Create Message

Creates a new message and dispatches it to all of the application's endpoints.  The `eventId` is an optional custom unique ID. It's verified to be unique only up to a day, after that no verification will be made. If a message with the same `eventId` already exists for any application in your environment, a 409 conflict error will be returned.  The `eventType` indicates the type and schema of the event. All messages of a certain `eventType` are expected to have the same schema. Endpoints can choose to only listen to specific event types. Messages can also have `channels`, which similar to event types let endpoints filter by them. Unlike event types, messages can have multiple channels, and channels don't imply a specific message content or schema.  The `payload` property is the webhook's body (the actual webhook message). Svix supports payload sizes of up to ~350kb, though it's generally a good idea to keep webhook payloads small, probably no larger than 40kb.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: HTTPBearer
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\MessageApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$app_id = app_1srOrx2ZWZBpBUvZwXKQmoEYga2; // string
$message_in = new \OpenAPI\Client\Model\MessageIn(); // \OpenAPI\Client\Model\MessageIn
$with_content = true; // bool
$idempotency_key = 'idempotency_key_example'; // string | The request's idempotency key

try {
    $result = $apiInstance->createMessageApiV1AppAppIdMsgPost($app_id, $message_in, $with_content, $idempotency_key);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MessageApi->createMessageApiV1AppAppIdMsgPost: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **app_id** | **string**|  | |
| **message_in** | [**\OpenAPI\Client\Model\MessageIn**](../Model/MessageIn.md)|  | |
| **with_content** | **bool**|  | [optional] [default to true] |
| **idempotency_key** | **string**| The request&#39;s idempotency key | [optional] |

### Return type

[**\OpenAPI\Client\Model\MessageOut**](../Model/MessageOut.md)

### Authorization

[HTTPBearer](../../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `getMessageApiV1AppAppIdMsgMsgIdGet()`

```php
getMessageApiV1AppAppIdMsgMsgIdGet($msg_id, $app_id, $idempotency_key): \OpenAPI\Client\Model\MessageOut
```

Get Message

Get a message by its ID or eventID.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: HTTPBearer
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\MessageApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$msg_id = msg_1srOrx2ZWZBpBUvZwXKQmoEYga2; // string
$app_id = app_1srOrx2ZWZBpBUvZwXKQmoEYga2; // string
$idempotency_key = 'idempotency_key_example'; // string | The request's idempotency key

try {
    $result = $apiInstance->getMessageApiV1AppAppIdMsgMsgIdGet($msg_id, $app_id, $idempotency_key);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MessageApi->getMessageApiV1AppAppIdMsgMsgIdGet: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **msg_id** | **string**|  | |
| **app_id** | **string**|  | |
| **idempotency_key** | **string**| The request&#39;s idempotency key | [optional] |

### Return type

[**\OpenAPI\Client\Model\MessageOut**](../Model/MessageOut.md)

### Authorization

[HTTPBearer](../../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `listMessagesApiV1AppAppIdMsgGet()`

```php
listMessagesApiV1AppAppIdMsgGet($app_id, $iterator, $limit, $event_types, $channel, $before, $after, $idempotency_key): \OpenAPI\Client\Model\ListResponseMessageOut
```

List Messages

List all of the application's messages.  The `before` parameter lets you filter all items created before a certain date and is ignored if an iterator is passed. The `after` parameter lets you filter all items created after a certain date and is ignored if an iterator is passed. `before` and `after` cannot be used simultaneously.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: HTTPBearer
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\MessageApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$app_id = app_1srOrx2ZWZBpBUvZwXKQmoEYga2; // string
$iterator = msg_1srOrx2ZWZBpBUvZwXKQmoEYga2; // string
$limit = 50; // int
$event_types = array('event_types_example'); // string[]
$channel = project_1337; // string
$before = new \DateTime("2013-10-20T19:20:30+01:00"); // \DateTime
$after = new \DateTime("2013-10-20T19:20:30+01:00"); // \DateTime
$idempotency_key = 'idempotency_key_example'; // string | The request's idempotency key

try {
    $result = $apiInstance->listMessagesApiV1AppAppIdMsgGet($app_id, $iterator, $limit, $event_types, $channel, $before, $after, $idempotency_key);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MessageApi->listMessagesApiV1AppAppIdMsgGet: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **app_id** | **string**|  | |
| **iterator** | **string**|  | [optional] |
| **limit** | **int**|  | [optional] [default to 50] |
| **event_types** | [**string[]**](../Model/string.md)|  | [optional] |
| **channel** | **string**|  | [optional] |
| **before** | **\DateTime**|  | [optional] |
| **after** | **\DateTime**|  | [optional] |
| **idempotency_key** | **string**| The request&#39;s idempotency key | [optional] |

### Return type

[**\OpenAPI\Client\Model\ListResponseMessageOut**](../Model/ListResponseMessageOut.md)

### Authorization

[HTTPBearer](../../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
