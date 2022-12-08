# OpenAPI\Client\PinsApi

All URIs are relative to https://slack.com/api, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**pinsAdd()**](PinsApi.md#pinsAdd) | **POST** /pins.add |  |
| [**pinsList()**](PinsApi.md#pinsList) | **GET** /pins.list |  |
| [**pinsRemove()**](PinsApi.md#pinsRemove) | **POST** /pins.remove |  |


## `pinsAdd()`

```php
pinsAdd($token, $channel, $timestamp): \OpenAPI\Client\Model\PinsAddSchema
```



Pins an item to a channel.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\PinsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `pins:write`
$channel = 'channel_example'; // string | Channel to pin the item in.
$timestamp = 'timestamp_example'; // string | Timestamp of the message to pin.

try {
    $result = $apiInstance->pinsAdd($token, $channel, $timestamp);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling PinsApi->pinsAdd: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;pins:write&#x60; | |
| **channel** | **string**| Channel to pin the item in. | |
| **timestamp** | **string**| Timestamp of the message to pin. | [optional] |

### Return type

[**\OpenAPI\Client\Model\PinsAddSchema**](../Model/PinsAddSchema.md)

### Authorization

[slackAuth](../../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: `application/x-www-form-urlencoded`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `pinsList()`

```php
pinsList($token, $channel): \OpenAPI\Client\Model\PinsListSuccessSchemaInner[]
```



Lists items pinned to a channel.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\PinsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `pins:read`
$channel = 'channel_example'; // string | Channel to get pinned items for.

try {
    $result = $apiInstance->pinsList($token, $channel);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling PinsApi->pinsList: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;pins:read&#x60; | |
| **channel** | **string**| Channel to get pinned items for. | |

### Return type

[**\OpenAPI\Client\Model\PinsListSuccessSchemaInner[]**](../Model/PinsListSuccessSchemaInner.md)

### Authorization

[slackAuth](../../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `pinsRemove()`

```php
pinsRemove($token, $channel, $timestamp): \OpenAPI\Client\Model\PinsRemoveSchema
```



Un-pins an item from a channel.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\PinsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `pins:write`
$channel = 'channel_example'; // string | Channel where the item is pinned to.
$timestamp = 'timestamp_example'; // string | Timestamp of the message to un-pin.

try {
    $result = $apiInstance->pinsRemove($token, $channel, $timestamp);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling PinsApi->pinsRemove: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;pins:write&#x60; | |
| **channel** | **string**| Channel where the item is pinned to. | |
| **timestamp** | **string**| Timestamp of the message to un-pin. | [optional] |

### Return type

[**\OpenAPI\Client\Model\PinsRemoveSchema**](../Model/PinsRemoveSchema.md)

### Authorization

[slackAuth](../../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: `application/x-www-form-urlencoded`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
