# OpenAPI\Client\AuthenticationApi

All URIs are relative to http://localhost, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**expireAllApiV1AuthAppAppIdExpireAllPost()**](AuthenticationApi.md#expireAllApiV1AuthAppAppIdExpireAllPost) | **POST** /api/v1/auth/app/{app_id}/expire-all/ | Expire All |
| [**getDashboardAccessApiV1AuthDashboardAccessAppIdPost()**](AuthenticationApi.md#getDashboardAccessApiV1AuthDashboardAccessAppIdPost) | **POST** /api/v1/auth/dashboard-access/{app_id}/ | Get Consumer App Portal Access |
| [**logoutApiV1AuthLogoutPost()**](AuthenticationApi.md#logoutApiV1AuthLogoutPost) | **POST** /api/v1/auth/logout/ | Logout |


## `expireAllApiV1AuthAppAppIdExpireAllPost()`

```php
expireAllApiV1AuthAppAppIdExpireAllPost($app_id, $application_token_expire_in, $idempotency_key)
```

Expire All

Expire all of the tokens associated with a specific Application

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: HTTPBearer
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AuthenticationApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$app_id = app_1srOrx2ZWZBpBUvZwXKQmoEYga2; // string
$application_token_expire_in = new \OpenAPI\Client\Model\ApplicationTokenExpireIn(); // \OpenAPI\Client\Model\ApplicationTokenExpireIn
$idempotency_key = 'idempotency_key_example'; // string | The request's idempotency key

try {
    $apiInstance->expireAllApiV1AuthAppAppIdExpireAllPost($app_id, $application_token_expire_in, $idempotency_key);
} catch (Exception $e) {
    echo 'Exception when calling AuthenticationApi->expireAllApiV1AuthAppAppIdExpireAllPost: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **app_id** | **string**|  | |
| **application_token_expire_in** | [**\OpenAPI\Client\Model\ApplicationTokenExpireIn**](../Model/ApplicationTokenExpireIn.md)|  | |
| **idempotency_key** | **string**| The request&#39;s idempotency key | [optional] |

### Return type

void (empty response body)

### Authorization

[HTTPBearer](../../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `getDashboardAccessApiV1AuthDashboardAccessAppIdPost()`

```php
getDashboardAccessApiV1AuthDashboardAccessAppIdPost($app_id, $idempotency_key): \OpenAPI\Client\Model\DashboardAccessOut
```

Get Consumer App Portal Access

Use this function to get magic links (and authentication codes) for connecting your users to the Consumer Application Portal.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: HTTPBearer
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AuthenticationApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$app_id = app_1srOrx2ZWZBpBUvZwXKQmoEYga2; // string
$idempotency_key = 'idempotency_key_example'; // string | The request's idempotency key

try {
    $result = $apiInstance->getDashboardAccessApiV1AuthDashboardAccessAppIdPost($app_id, $idempotency_key);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AuthenticationApi->getDashboardAccessApiV1AuthDashboardAccessAppIdPost: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **app_id** | **string**|  | |
| **idempotency_key** | **string**| The request&#39;s idempotency key | [optional] |

### Return type

[**\OpenAPI\Client\Model\DashboardAccessOut**](../Model/DashboardAccessOut.md)

### Authorization

[HTTPBearer](../../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `logoutApiV1AuthLogoutPost()`

```php
logoutApiV1AuthLogoutPost($idempotency_key)
```

Logout

Logout an app token.  Trying to log out other tokens will fail.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: HTTPBearer
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AuthenticationApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$idempotency_key = 'idempotency_key_example'; // string | The request's idempotency key

try {
    $apiInstance->logoutApiV1AuthLogoutPost($idempotency_key);
} catch (Exception $e) {
    echo 'Exception when calling AuthenticationApi->logoutApiV1AuthLogoutPost: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
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
