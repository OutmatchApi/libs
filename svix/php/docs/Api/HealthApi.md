# OpenAPI\Client\HealthApi

All URIs are relative to http://localhost, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**healthApiV1HealthGet()**](HealthApi.md#healthApiV1HealthGet) | **GET** /api/v1/health/ | Health |


## `healthApiV1HealthGet()`

```php
healthApiV1HealthGet($idempotency_key)
```

Health

Verify the API server is up and running.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\HealthApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$idempotency_key = 'idempotency_key_example'; // string | The request's idempotency key

try {
    $apiInstance->healthApiV1HealthGet($idempotency_key);
} catch (Exception $e) {
    echo 'Exception when calling HealthApi->healthApiV1HealthGet: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **idempotency_key** | **string**| The request&#39;s idempotency key | [optional] |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
