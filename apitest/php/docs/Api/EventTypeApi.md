# OpenAPI\Client\EventTypeApi

All URIs are relative to http://localhost, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createEventTypeApiV1EventTypePost()**](EventTypeApi.md#createEventTypeApiV1EventTypePost) | **POST** /api/v1/event-type/ | Create Event Type |
| [**deleteEventTypeApiV1EventTypeEventTypeNameDelete()**](EventTypeApi.md#deleteEventTypeApiV1EventTypeEventTypeNameDelete) | **DELETE** /api/v1/event-type/{event_type_name}/ | Archive Event Type |
| [**getEventTypeApiV1EventTypeEventTypeNameGet()**](EventTypeApi.md#getEventTypeApiV1EventTypeEventTypeNameGet) | **GET** /api/v1/event-type/{event_type_name}/ | Get Event Type |
| [**listEventTypesApiV1EventTypeGet()**](EventTypeApi.md#listEventTypesApiV1EventTypeGet) | **GET** /api/v1/event-type/ | List Event Types |
| [**updateEventTypeApiV1EventTypeEventTypeNamePut()**](EventTypeApi.md#updateEventTypeApiV1EventTypeEventTypeNamePut) | **PUT** /api/v1/event-type/{event_type_name}/ | Update Event Type |


## `createEventTypeApiV1EventTypePost()`

```php
createEventTypeApiV1EventTypePost($event_type_in, $idempotency_key): \OpenAPI\Client\Model\EventTypeOut
```

Create Event Type

Create new or unarchive existing event type.  Unarchiving an event type will allow endpoints to filter on it and messages to be sent with it. Endpoints filtering on the event type before archival will continue to filter on it. This operation does not preserve the description and schemas.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: HTTPBearer
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\EventTypeApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$event_type_in = new \OpenAPI\Client\Model\EventTypeIn(); // \OpenAPI\Client\Model\EventTypeIn
$idempotency_key = 'idempotency_key_example'; // string | The request's idempotency key

try {
    $result = $apiInstance->createEventTypeApiV1EventTypePost($event_type_in, $idempotency_key);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling EventTypeApi->createEventTypeApiV1EventTypePost: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **event_type_in** | [**\OpenAPI\Client\Model\EventTypeIn**](../Model/EventTypeIn.md)|  | |
| **idempotency_key** | **string**| The request&#39;s idempotency key | [optional] |

### Return type

[**\OpenAPI\Client\Model\EventTypeOut**](../Model/EventTypeOut.md)

### Authorization

[HTTPBearer](../../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `deleteEventTypeApiV1EventTypeEventTypeNameDelete()`

```php
deleteEventTypeApiV1EventTypeEventTypeNameDelete($event_type_name, $idempotency_key)
```

Archive Event Type

Archive an event type.  Endpoints already configured to filter on an event type will continue to do so after archival. However, new messages can not be sent with it and endpoints can not filter on it. An event type can be unarchived with the [create operation](#operation/create_event_type_api_v1_event_type__post).

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: HTTPBearer
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\EventTypeApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$event_type_name = user.signup; // string
$idempotency_key = 'idempotency_key_example'; // string | The request's idempotency key

try {
    $apiInstance->deleteEventTypeApiV1EventTypeEventTypeNameDelete($event_type_name, $idempotency_key);
} catch (Exception $e) {
    echo 'Exception when calling EventTypeApi->deleteEventTypeApiV1EventTypeEventTypeNameDelete: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **event_type_name** | **string**|  | |
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

## `getEventTypeApiV1EventTypeEventTypeNameGet()`

```php
getEventTypeApiV1EventTypeEventTypeNameGet($event_type_name, $idempotency_key): \OpenAPI\Client\Model\EventTypeOut
```

Get Event Type

Get an event type.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: HTTPBearer
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\EventTypeApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$event_type_name = user.signup; // string
$idempotency_key = 'idempotency_key_example'; // string | The request's idempotency key

try {
    $result = $apiInstance->getEventTypeApiV1EventTypeEventTypeNameGet($event_type_name, $idempotency_key);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling EventTypeApi->getEventTypeApiV1EventTypeEventTypeNameGet: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **event_type_name** | **string**|  | |
| **idempotency_key** | **string**| The request&#39;s idempotency key | [optional] |

### Return type

[**\OpenAPI\Client\Model\EventTypeOut**](../Model/EventTypeOut.md)

### Authorization

[HTTPBearer](../../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `listEventTypesApiV1EventTypeGet()`

```php
listEventTypesApiV1EventTypeGet($iterator, $limit, $with_content, $include_archived, $idempotency_key): \OpenAPI\Client\Model\ListResponseEventTypeOut
```

List Event Types

Return the list of event types.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: HTTPBearer
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\EventTypeApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$iterator = user.signup; // string
$limit = 50; // int
$with_content = false; // bool
$include_archived = false; // bool
$idempotency_key = 'idempotency_key_example'; // string | The request's idempotency key

try {
    $result = $apiInstance->listEventTypesApiV1EventTypeGet($iterator, $limit, $with_content, $include_archived, $idempotency_key);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling EventTypeApi->listEventTypesApiV1EventTypeGet: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **iterator** | **string**|  | [optional] |
| **limit** | **int**|  | [optional] [default to 50] |
| **with_content** | **bool**|  | [optional] [default to false] |
| **include_archived** | **bool**|  | [optional] [default to false] |
| **idempotency_key** | **string**| The request&#39;s idempotency key | [optional] |

### Return type

[**\OpenAPI\Client\Model\ListResponseEventTypeOut**](../Model/ListResponseEventTypeOut.md)

### Authorization

[HTTPBearer](../../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `updateEventTypeApiV1EventTypeEventTypeNamePut()`

```php
updateEventTypeApiV1EventTypeEventTypeNamePut($event_type_name, $event_type_update, $idempotency_key): \OpenAPI\Client\Model\EventTypeOut
```

Update Event Type

Update an event type.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: HTTPBearer
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\EventTypeApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$event_type_name = user.signup; // string
$event_type_update = new \OpenAPI\Client\Model\EventTypeUpdate(); // \OpenAPI\Client\Model\EventTypeUpdate
$idempotency_key = 'idempotency_key_example'; // string | The request's idempotency key

try {
    $result = $apiInstance->updateEventTypeApiV1EventTypeEventTypeNamePut($event_type_name, $event_type_update, $idempotency_key);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling EventTypeApi->updateEventTypeApiV1EventTypeEventTypeNamePut: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **event_type_name** | **string**|  | |
| **event_type_update** | [**\OpenAPI\Client\Model\EventTypeUpdate**](../Model/EventTypeUpdate.md)|  | |
| **idempotency_key** | **string**| The request&#39;s idempotency key | [optional] |

### Return type

[**\OpenAPI\Client\Model\EventTypeOut**](../Model/EventTypeOut.md)

### Authorization

[HTTPBearer](../../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
