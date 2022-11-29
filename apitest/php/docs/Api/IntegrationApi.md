# OpenAPI\Client\IntegrationApi

All URIs are relative to http://localhost, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createIntegrationApiV1AppAppIdIntegrationPost()**](IntegrationApi.md#createIntegrationApiV1AppAppIdIntegrationPost) | **POST** /api/v1/app/{app_id}/integration/ | Create Integration |
| [**deleteIntegrationApiV1AppAppIdIntegrationIntegIdDelete()**](IntegrationApi.md#deleteIntegrationApiV1AppAppIdIntegrationIntegIdDelete) | **DELETE** /api/v1/app/{app_id}/integration/{integ_id}/ | Delete Integration |
| [**getIntegrationApiV1AppAppIdIntegrationIntegIdGet()**](IntegrationApi.md#getIntegrationApiV1AppAppIdIntegrationIntegIdGet) | **GET** /api/v1/app/{app_id}/integration/{integ_id}/ | Get Integration |
| [**getIntegrationKeyApiV1AppAppIdIntegrationIntegIdKeyGet()**](IntegrationApi.md#getIntegrationKeyApiV1AppAppIdIntegrationIntegIdKeyGet) | **GET** /api/v1/app/{app_id}/integration/{integ_id}/key/ | Get Integration Key |
| [**listIntegrationsApiV1AppAppIdIntegrationGet()**](IntegrationApi.md#listIntegrationsApiV1AppAppIdIntegrationGet) | **GET** /api/v1/app/{app_id}/integration/ | List Integrations |
| [**rotateIntegrationKeyApiV1AppAppIdIntegrationIntegIdKeyRotatePost()**](IntegrationApi.md#rotateIntegrationKeyApiV1AppAppIdIntegrationIntegIdKeyRotatePost) | **POST** /api/v1/app/{app_id}/integration/{integ_id}/key/rotate/ | Rotate Integration Key |
| [**updateIntegrationApiV1AppAppIdIntegrationIntegIdPut()**](IntegrationApi.md#updateIntegrationApiV1AppAppIdIntegrationIntegIdPut) | **PUT** /api/v1/app/{app_id}/integration/{integ_id}/ | Update Integration |


## `createIntegrationApiV1AppAppIdIntegrationPost()`

```php
createIntegrationApiV1AppAppIdIntegrationPost($app_id, $integration_in, $idempotency_key): \OpenAPI\Client\Model\IntegrationOut
```

Create Integration

Create an integration.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: HTTPBearer
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\IntegrationApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$app_id = app_1srOrx2ZWZBpBUvZwXKQmoEYga2; // string
$integration_in = new \OpenAPI\Client\Model\IntegrationIn(); // \OpenAPI\Client\Model\IntegrationIn
$idempotency_key = 'idempotency_key_example'; // string | The request's idempotency key

try {
    $result = $apiInstance->createIntegrationApiV1AppAppIdIntegrationPost($app_id, $integration_in, $idempotency_key);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling IntegrationApi->createIntegrationApiV1AppAppIdIntegrationPost: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **app_id** | **string**|  | |
| **integration_in** | [**\OpenAPI\Client\Model\IntegrationIn**](../Model/IntegrationIn.md)|  | |
| **idempotency_key** | **string**| The request&#39;s idempotency key | [optional] |

### Return type

[**\OpenAPI\Client\Model\IntegrationOut**](../Model/IntegrationOut.md)

### Authorization

[HTTPBearer](../../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `deleteIntegrationApiV1AppAppIdIntegrationIntegIdDelete()`

```php
deleteIntegrationApiV1AppAppIdIntegrationIntegIdDelete($integ_id, $app_id, $idempotency_key)
```

Delete Integration

Delete an integration and revoke it's key.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: HTTPBearer
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\IntegrationApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$integ_id = integ_1srOrx2ZWZBpBUvZwXKQmoEYga2; // string
$app_id = app_1srOrx2ZWZBpBUvZwXKQmoEYga2; // string
$idempotency_key = 'idempotency_key_example'; // string | The request's idempotency key

try {
    $apiInstance->deleteIntegrationApiV1AppAppIdIntegrationIntegIdDelete($integ_id, $app_id, $idempotency_key);
} catch (Exception $e) {
    echo 'Exception when calling IntegrationApi->deleteIntegrationApiV1AppAppIdIntegrationIntegIdDelete: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **integ_id** | **string**|  | |
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

## `getIntegrationApiV1AppAppIdIntegrationIntegIdGet()`

```php
getIntegrationApiV1AppAppIdIntegrationIntegIdGet($integ_id, $app_id, $idempotency_key): \OpenAPI\Client\Model\IntegrationOut
```

Get Integration

Get an integration.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: HTTPBearer
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\IntegrationApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$integ_id = integ_1srOrx2ZWZBpBUvZwXKQmoEYga2; // string
$app_id = app_1srOrx2ZWZBpBUvZwXKQmoEYga2; // string
$idempotency_key = 'idempotency_key_example'; // string | The request's idempotency key

try {
    $result = $apiInstance->getIntegrationApiV1AppAppIdIntegrationIntegIdGet($integ_id, $app_id, $idempotency_key);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling IntegrationApi->getIntegrationApiV1AppAppIdIntegrationIntegIdGet: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **integ_id** | **string**|  | |
| **app_id** | **string**|  | |
| **idempotency_key** | **string**| The request&#39;s idempotency key | [optional] |

### Return type

[**\OpenAPI\Client\Model\IntegrationOut**](../Model/IntegrationOut.md)

### Authorization

[HTTPBearer](../../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `getIntegrationKeyApiV1AppAppIdIntegrationIntegIdKeyGet()`

```php
getIntegrationKeyApiV1AppAppIdIntegrationIntegIdKeyGet($integ_id, $app_id, $idempotency_key): \OpenAPI\Client\Model\IntegrationKeyOut
```

Get Integration Key

Get an integration's key.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: HTTPBearer
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\IntegrationApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$integ_id = integ_1srOrx2ZWZBpBUvZwXKQmoEYga2; // string
$app_id = app_1srOrx2ZWZBpBUvZwXKQmoEYga2; // string
$idempotency_key = 'idempotency_key_example'; // string | The request's idempotency key

try {
    $result = $apiInstance->getIntegrationKeyApiV1AppAppIdIntegrationIntegIdKeyGet($integ_id, $app_id, $idempotency_key);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling IntegrationApi->getIntegrationKeyApiV1AppAppIdIntegrationIntegIdKeyGet: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **integ_id** | **string**|  | |
| **app_id** | **string**|  | |
| **idempotency_key** | **string**| The request&#39;s idempotency key | [optional] |

### Return type

[**\OpenAPI\Client\Model\IntegrationKeyOut**](../Model/IntegrationKeyOut.md)

### Authorization

[HTTPBearer](../../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `listIntegrationsApiV1AppAppIdIntegrationGet()`

```php
listIntegrationsApiV1AppAppIdIntegrationGet($app_id, $iterator, $limit, $idempotency_key): \OpenAPI\Client\Model\ListResponseIntegrationOut
```

List Integrations

List the application's integrations.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: HTTPBearer
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\IntegrationApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$app_id = app_1srOrx2ZWZBpBUvZwXKQmoEYga2; // string
$iterator = integ_1srOrx2ZWZBpBUvZwXKQmoEYga2; // string
$limit = 50; // int
$idempotency_key = 'idempotency_key_example'; // string | The request's idempotency key

try {
    $result = $apiInstance->listIntegrationsApiV1AppAppIdIntegrationGet($app_id, $iterator, $limit, $idempotency_key);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling IntegrationApi->listIntegrationsApiV1AppAppIdIntegrationGet: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **app_id** | **string**|  | |
| **iterator** | **string**|  | [optional] |
| **limit** | **int**|  | [optional] [default to 50] |
| **idempotency_key** | **string**| The request&#39;s idempotency key | [optional] |

### Return type

[**\OpenAPI\Client\Model\ListResponseIntegrationOut**](../Model/ListResponseIntegrationOut.md)

### Authorization

[HTTPBearer](../../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `rotateIntegrationKeyApiV1AppAppIdIntegrationIntegIdKeyRotatePost()`

```php
rotateIntegrationKeyApiV1AppAppIdIntegrationIntegIdKeyRotatePost($integ_id, $app_id, $idempotency_key): \OpenAPI\Client\Model\IntegrationKeyOut
```

Rotate Integration Key

Rotate the integration's key. The previous key will be immediately revoked.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: HTTPBearer
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\IntegrationApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$integ_id = integ_1srOrx2ZWZBpBUvZwXKQmoEYga2; // string
$app_id = app_1srOrx2ZWZBpBUvZwXKQmoEYga2; // string
$idempotency_key = 'idempotency_key_example'; // string | The request's idempotency key

try {
    $result = $apiInstance->rotateIntegrationKeyApiV1AppAppIdIntegrationIntegIdKeyRotatePost($integ_id, $app_id, $idempotency_key);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling IntegrationApi->rotateIntegrationKeyApiV1AppAppIdIntegrationIntegIdKeyRotatePost: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **integ_id** | **string**|  | |
| **app_id** | **string**|  | |
| **idempotency_key** | **string**| The request&#39;s idempotency key | [optional] |

### Return type

[**\OpenAPI\Client\Model\IntegrationKeyOut**](../Model/IntegrationKeyOut.md)

### Authorization

[HTTPBearer](../../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `updateIntegrationApiV1AppAppIdIntegrationIntegIdPut()`

```php
updateIntegrationApiV1AppAppIdIntegrationIntegIdPut($integ_id, $app_id, $integration_update, $idempotency_key): \OpenAPI\Client\Model\IntegrationOut
```

Update Integration

Update an integration.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: HTTPBearer
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\IntegrationApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$integ_id = integ_1srOrx2ZWZBpBUvZwXKQmoEYga2; // string
$app_id = app_1srOrx2ZWZBpBUvZwXKQmoEYga2; // string
$integration_update = new \OpenAPI\Client\Model\IntegrationUpdate(); // \OpenAPI\Client\Model\IntegrationUpdate
$idempotency_key = 'idempotency_key_example'; // string | The request's idempotency key

try {
    $result = $apiInstance->updateIntegrationApiV1AppAppIdIntegrationIntegIdPut($integ_id, $app_id, $integration_update, $idempotency_key);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling IntegrationApi->updateIntegrationApiV1AppAppIdIntegrationIntegIdPut: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **integ_id** | **string**|  | |
| **app_id** | **string**|  | |
| **integration_update** | [**\OpenAPI\Client\Model\IntegrationUpdate**](../Model/IntegrationUpdate.md)|  | |
| **idempotency_key** | **string**| The request&#39;s idempotency key | [optional] |

### Return type

[**\OpenAPI\Client\Model\IntegrationOut**](../Model/IntegrationOut.md)

### Authorization

[HTTPBearer](../../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
