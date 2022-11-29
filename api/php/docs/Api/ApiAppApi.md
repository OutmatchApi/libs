# OpenAPI\Client\ApiAppApi

All URIs are relative to https://api.outmatchapi.com, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createApiApp()**](ApiAppApi.md#createApiApp) | **POST** /apiApp | Create api app |
| [**createApiAppRelease()**](ApiAppApi.md#createApiAppRelease) | **POST** /apiApp/{app_id}/release | Create api app release |
| [**createApiAppReleaseSdks()**](ApiAppApi.md#createApiAppReleaseSdks) | **POST** /apiApp/{app_id}/release/{release_version}/sdk | Generate sdks for a relase |


## `createApiApp()`

```php
createApiApp($create_api_app_request): \OpenAPI\Client\Model\ApiApp
```

Create api app

Create an api app for the authenticated user

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer (JWT) authorization: bearerAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\ApiAppApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$create_api_app_request = new \OpenAPI\Client\Model\CreateApiAppRequest(); // \OpenAPI\Client\Model\CreateApiAppRequest

try {
    $result = $apiInstance->createApiApp($create_api_app_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ApiAppApi->createApiApp: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **create_api_app_request** | [**\OpenAPI\Client\Model\CreateApiAppRequest**](../Model/CreateApiAppRequest.md)|  | [optional] |

### Return type

[**\OpenAPI\Client\Model\ApiApp**](../Model/ApiApp.md)

### Authorization

[bearerAuth](../../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`, `application/xml`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `createApiAppRelease()`

```php
createApiAppRelease($app_id, $body): \OpenAPI\Client\Model\Release
```

Create api app release

Create an api app release

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer (JWT) authorization: bearerAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\ApiAppApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$app_id = 'app_id_example'; // string | app id to associate the release with
$body = 'body_example'; // string | Created release object

try {
    $result = $apiInstance->createApiAppRelease($app_id, $body);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ApiAppApi->createApiAppRelease: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **app_id** | **string**| app id to associate the release with | |
| **body** | **string**| Created release object | [optional] |

### Return type

[**\OpenAPI\Client\Model\Release**](../Model/Release.md)

### Authorization

[bearerAuth](../../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: `text/plain`
- **Accept**: `application/json`, `application/xml`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `createApiAppReleaseSdks()`

```php
createApiAppReleaseSdks($app_id, $release_version, $create_api_app_release_sdks_request): \OpenAPI\Client\Model\Sdk[]
```

Generate sdks for a relase

Generate sdks for a relase

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer (JWT) authorization: bearerAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\ApiAppApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$app_id = 'app_id_example'; // string | app id
$release_version = 1.0.0; // string | release id
$create_api_app_release_sdks_request = new \OpenAPI\Client\Model\CreateApiAppReleaseSdksRequest(); // \OpenAPI\Client\Model\CreateApiAppReleaseSdksRequest

try {
    $result = $apiInstance->createApiAppReleaseSdks($app_id, $release_version, $create_api_app_release_sdks_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ApiAppApi->createApiAppReleaseSdks: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **app_id** | **string**| app id | |
| **release_version** | **string**| release id | |
| **create_api_app_release_sdks_request** | [**\OpenAPI\Client\Model\CreateApiAppReleaseSdksRequest**](../Model/CreateApiAppReleaseSdksRequest.md)|  | [optional] |

### Return type

[**\OpenAPI\Client\Model\Sdk[]**](../Model/Sdk.md)

### Authorization

[bearerAuth](../../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
