# OpenAPI\Client\MessageAttemptApi

All URIs are relative to http://localhost, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**getAttemptApiV1AppAppIdMsgMsgIdAttemptAttemptIdGet()**](MessageAttemptApi.md#getAttemptApiV1AppAppIdMsgMsgIdAttemptAttemptIdGet) | **GET** /api/v1/app/{app_id}/msg/{msg_id}/attempt/{attempt_id}/ | Get Attempt |
| [**listAttemptedDestinationsApiV1AppAppIdMsgMsgIdEndpointGet()**](MessageAttemptApi.md#listAttemptedDestinationsApiV1AppAppIdMsgMsgIdEndpointGet) | **GET** /api/v1/app/{app_id}/msg/{msg_id}/endpoint/ | List Attempted Destinations |
| [**listAttemptedMessagesApiV1AppAppIdEndpointEndpointIdMsgGet()**](MessageAttemptApi.md#listAttemptedMessagesApiV1AppAppIdEndpointEndpointIdMsgGet) | **GET** /api/v1/app/{app_id}/endpoint/{endpoint_id}/msg/ | List Attempted Messages |
| [**listAttemptsApiV1AppAppIdMsgMsgIdAttemptGet()**](MessageAttemptApi.md#listAttemptsApiV1AppAppIdMsgMsgIdAttemptGet) | **GET** /api/v1/app/{app_id}/msg/{msg_id}/attempt/ | List Attempts |
| [**listAttemptsByEndpointApiV1AppAppIdAttemptEndpointEndpointIdGet()**](MessageAttemptApi.md#listAttemptsByEndpointApiV1AppAppIdAttemptEndpointEndpointIdGet) | **GET** /api/v1/app/{app_id}/attempt/endpoint/{endpoint_id}/ | List Attempts By Endpoint |
| [**listAttemptsByMsgApiV1AppAppIdAttemptMsgMsgIdGet()**](MessageAttemptApi.md#listAttemptsByMsgApiV1AppAppIdAttemptMsgMsgIdGet) | **GET** /api/v1/app/{app_id}/attempt/msg/{msg_id}/ | List Attempts By Msg |
| [**listAttemptsForEndpointApiV1AppAppIdMsgMsgIdEndpointEndpointIdAttemptGet()**](MessageAttemptApi.md#listAttemptsForEndpointApiV1AppAppIdMsgMsgIdEndpointEndpointIdAttemptGet) | **GET** /api/v1/app/{app_id}/msg/{msg_id}/endpoint/{endpoint_id}/attempt/ | List Attempts For Endpoint |
| [**resendWebhookApiV1AppAppIdMsgMsgIdEndpointEndpointIdResendPost()**](MessageAttemptApi.md#resendWebhookApiV1AppAppIdMsgMsgIdEndpointEndpointIdResendPost) | **POST** /api/v1/app/{app_id}/msg/{msg_id}/endpoint/{endpoint_id}/resend/ | Resend Webhook |


## `getAttemptApiV1AppAppIdMsgMsgIdAttemptAttemptIdGet()`

```php
getAttemptApiV1AppAppIdMsgMsgIdAttemptAttemptIdGet($attempt_id, $msg_id, $app_id, $idempotency_key): \OpenAPI\Client\Model\MessageAttemptOut
```

Get Attempt

`msg_id`: Use a message id or a message `eventId`

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: HTTPBearer
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\MessageAttemptApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$attempt_id = atmpt_1srOrx2ZWZBpBUvZwXKQmoEYga2; // string
$msg_id = msg_1srOrx2ZWZBpBUvZwXKQmoEYga2; // string
$app_id = app_1srOrx2ZWZBpBUvZwXKQmoEYga2; // string
$idempotency_key = 'idempotency_key_example'; // string | The request's idempotency key

try {
    $result = $apiInstance->getAttemptApiV1AppAppIdMsgMsgIdAttemptAttemptIdGet($attempt_id, $msg_id, $app_id, $idempotency_key);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MessageAttemptApi->getAttemptApiV1AppAppIdMsgMsgIdAttemptAttemptIdGet: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **attempt_id** | **string**|  | |
| **msg_id** | **string**|  | |
| **app_id** | **string**|  | |
| **idempotency_key** | **string**| The request&#39;s idempotency key | [optional] |

### Return type

[**\OpenAPI\Client\Model\MessageAttemptOut**](../Model/MessageAttemptOut.md)

### Authorization

[HTTPBearer](../../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `listAttemptedDestinationsApiV1AppAppIdMsgMsgIdEndpointGet()`

```php
listAttemptedDestinationsApiV1AppAppIdMsgMsgIdEndpointGet($msg_id, $app_id, $iterator, $limit, $idempotency_key): \OpenAPI\Client\Model\ListResponseMessageEndpointOut
```

List Attempted Destinations

`msg_id`: Use a message id or a message `eventId`

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: HTTPBearer
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\MessageAttemptApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$msg_id = msg_1srOrx2ZWZBpBUvZwXKQmoEYga2; // string
$app_id = app_1srOrx2ZWZBpBUvZwXKQmoEYga2; // string
$iterator = msgep_1srOrx2ZWZBpBUvZwXKQmoEYga2; // string
$limit = 50; // int
$idempotency_key = 'idempotency_key_example'; // string | The request's idempotency key

try {
    $result = $apiInstance->listAttemptedDestinationsApiV1AppAppIdMsgMsgIdEndpointGet($msg_id, $app_id, $iterator, $limit, $idempotency_key);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MessageAttemptApi->listAttemptedDestinationsApiV1AppAppIdMsgMsgIdEndpointGet: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **msg_id** | **string**|  | |
| **app_id** | **string**|  | |
| **iterator** | **string**|  | [optional] |
| **limit** | **int**|  | [optional] [default to 50] |
| **idempotency_key** | **string**| The request&#39;s idempotency key | [optional] |

### Return type

[**\OpenAPI\Client\Model\ListResponseMessageEndpointOut**](../Model/ListResponseMessageEndpointOut.md)

### Authorization

[HTTPBearer](../../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `listAttemptedMessagesApiV1AppAppIdEndpointEndpointIdMsgGet()`

```php
listAttemptedMessagesApiV1AppAppIdEndpointEndpointIdMsgGet($endpoint_id, $app_id, $iterator, $limit, $channel, $status, $before, $after, $idempotency_key): \OpenAPI\Client\Model\ListResponseEndpointMessageOut
```

List Attempted Messages

List messages for a particular endpoint. Additionally includes metadata about the latest message attempt.  The `before` parameter lets you filter all items created before a certain date and is ignored if an iterator is passed.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: HTTPBearer
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\MessageAttemptApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$endpoint_id = ep_1srOrx2ZWZBpBUvZwXKQmoEYga2; // string
$app_id = app_1srOrx2ZWZBpBUvZwXKQmoEYga2; // string
$iterator = msg_1srOrx2ZWZBpBUvZwXKQmoEYga2; // string
$limit = 50; // int
$channel = project_1337; // string
$status = new \OpenAPI\Client\Model\MessageStatus(); // MessageStatus
$before = new \DateTime("2013-10-20T19:20:30+01:00"); // \DateTime
$after = new \DateTime("2013-10-20T19:20:30+01:00"); // \DateTime
$idempotency_key = 'idempotency_key_example'; // string | The request's idempotency key

try {
    $result = $apiInstance->listAttemptedMessagesApiV1AppAppIdEndpointEndpointIdMsgGet($endpoint_id, $app_id, $iterator, $limit, $channel, $status, $before, $after, $idempotency_key);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MessageAttemptApi->listAttemptedMessagesApiV1AppAppIdEndpointEndpointIdMsgGet: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **endpoint_id** | **string**|  | |
| **app_id** | **string**|  | |
| **iterator** | **string**|  | [optional] |
| **limit** | **int**|  | [optional] [default to 50] |
| **channel** | **string**|  | [optional] |
| **status** | [**MessageStatus**](../Model/.md)|  | [optional] |
| **before** | **\DateTime**|  | [optional] |
| **after** | **\DateTime**|  | [optional] |
| **idempotency_key** | **string**| The request&#39;s idempotency key | [optional] |

### Return type

[**\OpenAPI\Client\Model\ListResponseEndpointMessageOut**](../Model/ListResponseEndpointMessageOut.md)

### Authorization

[HTTPBearer](../../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `listAttemptsApiV1AppAppIdMsgMsgIdAttemptGet()`

```php
listAttemptsApiV1AppAppIdMsgMsgIdAttemptGet($app_id, $msg_id, $iterator, $limit, $endpoint_id, $event_types, $channel, $status, $before, $after, $idempotency_key): \OpenAPI\Client\Model\ListResponseMessageAttemptOut
```

List Attempts

Deprecated: Please use \"List Attempts by Endpoint\" and \"List Attempts by Msg\" instead.  `msg_id`: Use a message id or a message `eventId`

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: HTTPBearer
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\MessageAttemptApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$app_id = app_1srOrx2ZWZBpBUvZwXKQmoEYga2; // string
$msg_id = msg_1srOrx2ZWZBpBUvZwXKQmoEYga2; // string
$iterator = atmpt_1srOrx2ZWZBpBUvZwXKQmoEYga2; // string
$limit = 50; // int
$endpoint_id = ep_1srOrx2ZWZBpBUvZwXKQmoEYga2; // string
$event_types = array('event_types_example'); // string[]
$channel = project_1337; // string
$status = new \OpenAPI\Client\Model\MessageStatus(); // MessageStatus
$before = new \DateTime("2013-10-20T19:20:30+01:00"); // \DateTime
$after = new \DateTime("2013-10-20T19:20:30+01:00"); // \DateTime
$idempotency_key = 'idempotency_key_example'; // string | The request's idempotency key

try {
    $result = $apiInstance->listAttemptsApiV1AppAppIdMsgMsgIdAttemptGet($app_id, $msg_id, $iterator, $limit, $endpoint_id, $event_types, $channel, $status, $before, $after, $idempotency_key);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MessageAttemptApi->listAttemptsApiV1AppAppIdMsgMsgIdAttemptGet: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **app_id** | **string**|  | |
| **msg_id** | **string**|  | |
| **iterator** | **string**|  | [optional] |
| **limit** | **int**|  | [optional] [default to 50] |
| **endpoint_id** | **string**|  | [optional] |
| **event_types** | [**string[]**](../Model/string.md)|  | [optional] |
| **channel** | **string**|  | [optional] |
| **status** | [**MessageStatus**](../Model/.md)|  | [optional] |
| **before** | **\DateTime**|  | [optional] |
| **after** | **\DateTime**|  | [optional] |
| **idempotency_key** | **string**| The request&#39;s idempotency key | [optional] |

### Return type

[**\OpenAPI\Client\Model\ListResponseMessageAttemptOut**](../Model/ListResponseMessageAttemptOut.md)

### Authorization

[HTTPBearer](../../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `listAttemptsByEndpointApiV1AppAppIdAttemptEndpointEndpointIdGet()`

```php
listAttemptsByEndpointApiV1AppAppIdAttemptEndpointEndpointIdGet($app_id, $endpoint_id, $iterator, $limit, $status, $status_code_class, $event_types, $channel, $before, $after, $idempotency_key): \OpenAPI\Client\Model\ListResponseMessageAttemptOut
```

List Attempts By Endpoint

List attempts by endpoint id

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: HTTPBearer
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\MessageAttemptApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$app_id = app_1srOrx2ZWZBpBUvZwXKQmoEYga2; // string
$endpoint_id = ep_1srOrx2ZWZBpBUvZwXKQmoEYga2; // string
$iterator = atmpt_1srOrx2ZWZBpBUvZwXKQmoEYga2; // string
$limit = 50; // int
$status = new \OpenAPI\Client\Model\MessageStatus(); // MessageStatus
$status_code_class = new \OpenAPI\Client\Model\StatusCodeClass(); // StatusCodeClass
$event_types = array('event_types_example'); // string[]
$channel = project_1337; // string
$before = new \DateTime("2013-10-20T19:20:30+01:00"); // \DateTime
$after = new \DateTime("2013-10-20T19:20:30+01:00"); // \DateTime
$idempotency_key = 'idempotency_key_example'; // string | The request's idempotency key

try {
    $result = $apiInstance->listAttemptsByEndpointApiV1AppAppIdAttemptEndpointEndpointIdGet($app_id, $endpoint_id, $iterator, $limit, $status, $status_code_class, $event_types, $channel, $before, $after, $idempotency_key);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MessageAttemptApi->listAttemptsByEndpointApiV1AppAppIdAttemptEndpointEndpointIdGet: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **app_id** | **string**|  | |
| **endpoint_id** | **string**|  | |
| **iterator** | **string**|  | [optional] |
| **limit** | **int**|  | [optional] [default to 50] |
| **status** | [**MessageStatus**](../Model/.md)|  | [optional] |
| **status_code_class** | [**StatusCodeClass**](../Model/.md)|  | [optional] |
| **event_types** | [**string[]**](../Model/string.md)|  | [optional] |
| **channel** | **string**|  | [optional] |
| **before** | **\DateTime**|  | [optional] |
| **after** | **\DateTime**|  | [optional] |
| **idempotency_key** | **string**| The request&#39;s idempotency key | [optional] |

### Return type

[**\OpenAPI\Client\Model\ListResponseMessageAttemptOut**](../Model/ListResponseMessageAttemptOut.md)

### Authorization

[HTTPBearer](../../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `listAttemptsByMsgApiV1AppAppIdAttemptMsgMsgIdGet()`

```php
listAttemptsByMsgApiV1AppAppIdAttemptMsgMsgIdGet($app_id, $msg_id, $endpoint_id, $iterator, $limit, $status, $status_code_class, $event_types, $channel, $before, $after, $idempotency_key): \OpenAPI\Client\Model\ListResponseMessageAttemptOut
```

List Attempts By Msg

List attempts by message id

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: HTTPBearer
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\MessageAttemptApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$app_id = app_1srOrx2ZWZBpBUvZwXKQmoEYga2; // string
$msg_id = msg_1srOrx2ZWZBpBUvZwXKQmoEYga2; // string
$endpoint_id = ep_1srOrx2ZWZBpBUvZwXKQmoEYga2; // string
$iterator = atmpt_1srOrx2ZWZBpBUvZwXKQmoEYga2; // string
$limit = 50; // int
$status = new \OpenAPI\Client\Model\MessageStatus(); // MessageStatus
$status_code_class = new \OpenAPI\Client\Model\StatusCodeClass(); // StatusCodeClass
$event_types = array('event_types_example'); // string[]
$channel = project_1337; // string
$before = new \DateTime("2013-10-20T19:20:30+01:00"); // \DateTime
$after = new \DateTime("2013-10-20T19:20:30+01:00"); // \DateTime
$idempotency_key = 'idempotency_key_example'; // string | The request's idempotency key

try {
    $result = $apiInstance->listAttemptsByMsgApiV1AppAppIdAttemptMsgMsgIdGet($app_id, $msg_id, $endpoint_id, $iterator, $limit, $status, $status_code_class, $event_types, $channel, $before, $after, $idempotency_key);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MessageAttemptApi->listAttemptsByMsgApiV1AppAppIdAttemptMsgMsgIdGet: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **app_id** | **string**|  | |
| **msg_id** | **string**|  | |
| **endpoint_id** | **string**|  | [optional] |
| **iterator** | **string**|  | [optional] |
| **limit** | **int**|  | [optional] [default to 50] |
| **status** | [**MessageStatus**](../Model/.md)|  | [optional] |
| **status_code_class** | [**StatusCodeClass**](../Model/.md)|  | [optional] |
| **event_types** | [**string[]**](../Model/string.md)|  | [optional] |
| **channel** | **string**|  | [optional] |
| **before** | **\DateTime**|  | [optional] |
| **after** | **\DateTime**|  | [optional] |
| **idempotency_key** | **string**| The request&#39;s idempotency key | [optional] |

### Return type

[**\OpenAPI\Client\Model\ListResponseMessageAttemptOut**](../Model/ListResponseMessageAttemptOut.md)

### Authorization

[HTTPBearer](../../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `listAttemptsForEndpointApiV1AppAppIdMsgMsgIdEndpointEndpointIdAttemptGet()`

```php
listAttemptsForEndpointApiV1AppAppIdMsgMsgIdEndpointEndpointIdAttemptGet($msg_id, $app_id, $endpoint_id, $iterator, $limit, $event_types, $channel, $status, $before, $after, $idempotency_key): \OpenAPI\Client\Model\ListResponseMessageAttemptEndpointOut
```

List Attempts For Endpoint

DEPRECATED: please use list_attempts with endpoint_id as a query parameter instead.  List the message attempts for a particular endpoint.  Returning the endpoint.  The `before` parameter lets you filter all items created before a certain date and is ignored if an iterator is passed.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: HTTPBearer
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\MessageAttemptApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$msg_id = msg_1srOrx2ZWZBpBUvZwXKQmoEYga2; // string
$app_id = app_1srOrx2ZWZBpBUvZwXKQmoEYga2; // string
$endpoint_id = ep_1srOrx2ZWZBpBUvZwXKQmoEYga2; // string
$iterator = atmpt_1srOrx2ZWZBpBUvZwXKQmoEYga2; // string
$limit = 50; // int
$event_types = array('event_types_example'); // string[]
$channel = project_1337; // string
$status = new \OpenAPI\Client\Model\MessageStatus(); // MessageStatus
$before = new \DateTime("2013-10-20T19:20:30+01:00"); // \DateTime
$after = new \DateTime("2013-10-20T19:20:30+01:00"); // \DateTime
$idempotency_key = 'idempotency_key_example'; // string | The request's idempotency key

try {
    $result = $apiInstance->listAttemptsForEndpointApiV1AppAppIdMsgMsgIdEndpointEndpointIdAttemptGet($msg_id, $app_id, $endpoint_id, $iterator, $limit, $event_types, $channel, $status, $before, $after, $idempotency_key);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MessageAttemptApi->listAttemptsForEndpointApiV1AppAppIdMsgMsgIdEndpointEndpointIdAttemptGet: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **msg_id** | **string**|  | |
| **app_id** | **string**|  | |
| **endpoint_id** | **string**|  | |
| **iterator** | **string**|  | [optional] |
| **limit** | **int**|  | [optional] [default to 50] |
| **event_types** | [**string[]**](../Model/string.md)|  | [optional] |
| **channel** | **string**|  | [optional] |
| **status** | [**MessageStatus**](../Model/.md)|  | [optional] |
| **before** | **\DateTime**|  | [optional] |
| **after** | **\DateTime**|  | [optional] |
| **idempotency_key** | **string**| The request&#39;s idempotency key | [optional] |

### Return type

[**\OpenAPI\Client\Model\ListResponseMessageAttemptEndpointOut**](../Model/ListResponseMessageAttemptEndpointOut.md)

### Authorization

[HTTPBearer](../../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `resendWebhookApiV1AppAppIdMsgMsgIdEndpointEndpointIdResendPost()`

```php
resendWebhookApiV1AppAppIdMsgMsgIdEndpointEndpointIdResendPost($endpoint_id, $msg_id, $app_id, $idempotency_key)
```

Resend Webhook

Resend a message to the specified endpoint.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: HTTPBearer
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\MessageAttemptApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$endpoint_id = ep_1srOrx2ZWZBpBUvZwXKQmoEYga2; // string
$msg_id = msg_1srOrx2ZWZBpBUvZwXKQmoEYga2; // string
$app_id = app_1srOrx2ZWZBpBUvZwXKQmoEYga2; // string
$idempotency_key = 'idempotency_key_example'; // string | The request's idempotency key

try {
    $apiInstance->resendWebhookApiV1AppAppIdMsgMsgIdEndpointEndpointIdResendPost($endpoint_id, $msg_id, $app_id, $idempotency_key);
} catch (Exception $e) {
    echo 'Exception when calling MessageAttemptApi->resendWebhookApiV1AppAppIdMsgMsgIdEndpointEndpointIdResendPost: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **endpoint_id** | **string**|  | |
| **msg_id** | **string**|  | |
| **app_id** | **string**|  | |
| **idempotency_key** | **string**| The request&#39;s idempotency key | [optional] |

### Return type

void (empty response body)

### Authorization

[HTTPBearer](../../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
