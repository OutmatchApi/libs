# OpenAPI\Client\ApplicationApi

All URIs are relative to http://localhost, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createApplicationApiV1AppPost()**](ApplicationApi.md#createApplicationApiV1AppPost) | **POST** /api/v1/app/ | Create Application |
| [**deleteApplicationApiV1AppAppIdDelete()**](ApplicationApi.md#deleteApplicationApiV1AppAppIdDelete) | **DELETE** /api/v1/app/{app_id}/ | Delete Application |
| [**getApplicationApiV1AppAppIdGet()**](ApplicationApi.md#getApplicationApiV1AppAppIdGet) | **GET** /api/v1/app/{app_id}/ | Get Application |
| [**listApplicationsApiV1AppGet()**](ApplicationApi.md#listApplicationsApiV1AppGet) | **GET** /api/v1/app/ | List Applications |
| [**updateApplicationApiV1AppAppIdPut()**](ApplicationApi.md#updateApplicationApiV1AppAppIdPut) | **PUT** /api/v1/app/{app_id}/ | Update Application |


## `createApplicationApiV1AppPost()`

```php
createApplicationApiV1AppPost($application_in, $get_if_exists, $idempotency_key): \OpenAPI\Client\Model\ApplicationOut
```

Create Application

Create a new application.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: HTTPBearer
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\ApplicationApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$application_in = new \OpenAPI\Client\Model\ApplicationIn(); // \OpenAPI\Client\Model\ApplicationIn
$get_if_exists = false; // bool | Get an existing application, or create a new one if doesn't exist. It's two separate functions in the libs.
$idempotency_key = 'idempotency_key_example'; // string | The request's idempotency key

try {
    $result = $apiInstance->createApplicationApiV1AppPost($application_in, $get_if_exists, $idempotency_key);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ApplicationApi->createApplicationApiV1AppPost: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **application_in** | [**\OpenAPI\Client\Model\ApplicationIn**](../Model/ApplicationIn.md)|  | |
| **get_if_exists** | **bool**| Get an existing application, or create a new one if doesn&#39;t exist. It&#39;s two separate functions in the libs. | [optional] [default to false] |
| **idempotency_key** | **string**| The request&#39;s idempotency key | [optional] |

### Return type

[**\OpenAPI\Client\Model\ApplicationOut**](../Model/ApplicationOut.md)

### Authorization

[HTTPBearer](../../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `deleteApplicationApiV1AppAppIdDelete()`

```php
deleteApplicationApiV1AppAppIdDelete($app_id, $idempotency_key)
```

Delete Application

Delete an application.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: HTTPBearer
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\ApplicationApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$app_id = app_1srOrx2ZWZBpBUvZwXKQmoEYga2; // string
$idempotency_key = 'idempotency_key_example'; // string | The request's idempotency key

try {
    $apiInstance->deleteApplicationApiV1AppAppIdDelete($app_id, $idempotency_key);
} catch (Exception $e) {
    echo 'Exception when calling ApplicationApi->deleteApplicationApiV1AppAppIdDelete: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
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

## `getApplicationApiV1AppAppIdGet()`

```php
getApplicationApiV1AppAppIdGet($app_id, $idempotency_key): \OpenAPI\Client\Model\ApplicationOut
```

Get Application

Get an application.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: HTTPBearer
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\ApplicationApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$app_id = app_1srOrx2ZWZBpBUvZwXKQmoEYga2; // string
$idempotency_key = 'idempotency_key_example'; // string | The request's idempotency key

try {
    $result = $apiInstance->getApplicationApiV1AppAppIdGet($app_id, $idempotency_key);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ApplicationApi->getApplicationApiV1AppAppIdGet: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **app_id** | **string**|  | |
| **idempotency_key** | **string**| The request&#39;s idempotency key | [optional] |

### Return type

[**\OpenAPI\Client\Model\ApplicationOut**](../Model/ApplicationOut.md)

### Authorization

[HTTPBearer](../../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `listApplicationsApiV1AppGet()`

```php
listApplicationsApiV1AppGet($iterator, $limit, $idempotency_key): \OpenAPI\Client\Model\ListResponseApplicationOut
```

List Applications

List of all the organization's applications.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: HTTPBearer
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\ApplicationApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$iterator = app_1srOrx2ZWZBpBUvZwXKQmoEYga2; // string
$limit = 50; // int
$idempotency_key = 'idempotency_key_example'; // string | The request's idempotency key

try {
    $result = $apiInstance->listApplicationsApiV1AppGet($iterator, $limit, $idempotency_key);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ApplicationApi->listApplicationsApiV1AppGet: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **iterator** | **string**|  | [optional] |
| **limit** | **int**|  | [optional] [default to 50] |
| **idempotency_key** | **string**| The request&#39;s idempotency key | [optional] |

### Return type

[**\OpenAPI\Client\Model\ListResponseApplicationOut**](../Model/ListResponseApplicationOut.md)

### Authorization

[HTTPBearer](../../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `updateApplicationApiV1AppAppIdPut()`

```php
updateApplicationApiV1AppAppIdPut($app_id, $application_in, $idempotency_key): \OpenAPI\Client\Model\ApplicationOut
```

Update Application

Update an application.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: HTTPBearer
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\ApplicationApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$app_id = app_1srOrx2ZWZBpBUvZwXKQmoEYga2; // string
$application_in = new \OpenAPI\Client\Model\ApplicationIn(); // \OpenAPI\Client\Model\ApplicationIn
$idempotency_key = 'idempotency_key_example'; // string | The request's idempotency key

try {
    $result = $apiInstance->updateApplicationApiV1AppAppIdPut($app_id, $application_in, $idempotency_key);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ApplicationApi->updateApplicationApiV1AppAppIdPut: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **app_id** | **string**|  | |
| **application_in** | [**\OpenAPI\Client\Model\ApplicationIn**](../Model/ApplicationIn.md)|  | |
| **idempotency_key** | **string**| The request&#39;s idempotency key | [optional] |

### Return type

[**\OpenAPI\Client\Model\ApplicationOut**](../Model/ApplicationOut.md)

### Authorization

[HTTPBearer](../../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
