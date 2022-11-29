# OpenAPI\Client\EndpointApi

All URIs are relative to http://localhost, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createEndpointApiV1AppAppIdEndpointPost()**](EndpointApi.md#createEndpointApiV1AppAppIdEndpointPost) | **POST** /api/v1/app/{app_id}/endpoint/ | Create Endpoint |
| [**deleteEndpointApiV1AppAppIdEndpointEndpointIdDelete()**](EndpointApi.md#deleteEndpointApiV1AppAppIdEndpointEndpointIdDelete) | **DELETE** /api/v1/app/{app_id}/endpoint/{endpoint_id}/ | Delete Endpoint |
| [**getEndpointApiV1AppAppIdEndpointEndpointIdGet()**](EndpointApi.md#getEndpointApiV1AppAppIdEndpointEndpointIdGet) | **GET** /api/v1/app/{app_id}/endpoint/{endpoint_id}/ | Get Endpoint |
| [**getEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersGet()**](EndpointApi.md#getEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersGet) | **GET** /api/v1/app/{app_id}/endpoint/{endpoint_id}/headers/ | Get Endpoint Headers |
| [**getEndpointSecretApiV1AppAppIdEndpointEndpointIdSecretGet()**](EndpointApi.md#getEndpointSecretApiV1AppAppIdEndpointEndpointIdSecretGet) | **GET** /api/v1/app/{app_id}/endpoint/{endpoint_id}/secret/ | Get Endpoint Secret |
| [**getEndpointStatsApiV1AppAppIdEndpointEndpointIdStatsGet()**](EndpointApi.md#getEndpointStatsApiV1AppAppIdEndpointEndpointIdStatsGet) | **GET** /api/v1/app/{app_id}/endpoint/{endpoint_id}/stats/ | Get Endpoint Stats |
| [**listEndpointsApiV1AppAppIdEndpointGet()**](EndpointApi.md#listEndpointsApiV1AppAppIdEndpointGet) | **GET** /api/v1/app/{app_id}/endpoint/ | List Endpoints |
| [**patchEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersPatch()**](EndpointApi.md#patchEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersPatch) | **PATCH** /api/v1/app/{app_id}/endpoint/{endpoint_id}/headers/ | Patch Endpoint Headers |
| [**recoverFailedWebhooksApiV1AppAppIdEndpointEndpointIdRecoverPost()**](EndpointApi.md#recoverFailedWebhooksApiV1AppAppIdEndpointEndpointIdRecoverPost) | **POST** /api/v1/app/{app_id}/endpoint/{endpoint_id}/recover/ | Recover Failed Webhooks |
| [**replayMissingWebhooksApiV1AppAppIdEndpointEndpointIdReplayMissingPost()**](EndpointApi.md#replayMissingWebhooksApiV1AppAppIdEndpointEndpointIdReplayMissingPost) | **POST** /api/v1/app/{app_id}/endpoint/{endpoint_id}/replay-missing/ | Replay Missing Webhooks |
| [**rotateEndpointSecretApiV1AppAppIdEndpointEndpointIdSecretRotatePost()**](EndpointApi.md#rotateEndpointSecretApiV1AppAppIdEndpointEndpointIdSecretRotatePost) | **POST** /api/v1/app/{app_id}/endpoint/{endpoint_id}/secret/rotate/ | Rotate Endpoint Secret |
| [**updateEndpointApiV1AppAppIdEndpointEndpointIdPut()**](EndpointApi.md#updateEndpointApiV1AppAppIdEndpointEndpointIdPut) | **PUT** /api/v1/app/{app_id}/endpoint/{endpoint_id}/ | Update Endpoint |
| [**updateEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersPut()**](EndpointApi.md#updateEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersPut) | **PUT** /api/v1/app/{app_id}/endpoint/{endpoint_id}/headers/ | Update Endpoint Headers |


## `createEndpointApiV1AppAppIdEndpointPost()`

```php
createEndpointApiV1AppAppIdEndpointPost($app_id, $endpoint_in, $idempotency_key): \OpenAPI\Client\Model\EndpointOut
```

Create Endpoint

Create a new endpoint for the application.  When `secret` is `null` the secret is automatically generated (recommended)

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: HTTPBearer
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\EndpointApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$app_id = app_1srOrx2ZWZBpBUvZwXKQmoEYga2; // string
$endpoint_in = new \OpenAPI\Client\Model\EndpointIn(); // \OpenAPI\Client\Model\EndpointIn
$idempotency_key = 'idempotency_key_example'; // string | The request's idempotency key

try {
    $result = $apiInstance->createEndpointApiV1AppAppIdEndpointPost($app_id, $endpoint_in, $idempotency_key);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling EndpointApi->createEndpointApiV1AppAppIdEndpointPost: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **app_id** | **string**|  | |
| **endpoint_in** | [**\OpenAPI\Client\Model\EndpointIn**](../Model/EndpointIn.md)|  | |
| **idempotency_key** | **string**| The request&#39;s idempotency key | [optional] |

### Return type

[**\OpenAPI\Client\Model\EndpointOut**](../Model/EndpointOut.md)

### Authorization

[HTTPBearer](../../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `deleteEndpointApiV1AppAppIdEndpointEndpointIdDelete()`

```php
deleteEndpointApiV1AppAppIdEndpointEndpointIdDelete($endpoint_id, $app_id, $idempotency_key)
```

Delete Endpoint

Delete an endpoint.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: HTTPBearer
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\EndpointApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$endpoint_id = ep_1srOrx2ZWZBpBUvZwXKQmoEYga2; // string
$app_id = app_1srOrx2ZWZBpBUvZwXKQmoEYga2; // string
$idempotency_key = 'idempotency_key_example'; // string | The request's idempotency key

try {
    $apiInstance->deleteEndpointApiV1AppAppIdEndpointEndpointIdDelete($endpoint_id, $app_id, $idempotency_key);
} catch (Exception $e) {
    echo 'Exception when calling EndpointApi->deleteEndpointApiV1AppAppIdEndpointEndpointIdDelete: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **endpoint_id** | **string**|  | |
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

## `getEndpointApiV1AppAppIdEndpointEndpointIdGet()`

```php
getEndpointApiV1AppAppIdEndpointEndpointIdGet($endpoint_id, $app_id, $idempotency_key): \OpenAPI\Client\Model\EndpointOut
```

Get Endpoint

Get an application.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: HTTPBearer
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\EndpointApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$endpoint_id = ep_1srOrx2ZWZBpBUvZwXKQmoEYga2; // string
$app_id = app_1srOrx2ZWZBpBUvZwXKQmoEYga2; // string
$idempotency_key = 'idempotency_key_example'; // string | The request's idempotency key

try {
    $result = $apiInstance->getEndpointApiV1AppAppIdEndpointEndpointIdGet($endpoint_id, $app_id, $idempotency_key);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling EndpointApi->getEndpointApiV1AppAppIdEndpointEndpointIdGet: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **endpoint_id** | **string**|  | |
| **app_id** | **string**|  | |
| **idempotency_key** | **string**| The request&#39;s idempotency key | [optional] |

### Return type

[**\OpenAPI\Client\Model\EndpointOut**](../Model/EndpointOut.md)

### Authorization

[HTTPBearer](../../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `getEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersGet()`

```php
getEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersGet($endpoint_id, $app_id, $idempotency_key): \OpenAPI\Client\Model\EndpointHeadersOut
```

Get Endpoint Headers

Get the additional headers to be sent with the webhook

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: HTTPBearer
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\EndpointApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$endpoint_id = ep_1srOrx2ZWZBpBUvZwXKQmoEYga2; // string
$app_id = app_1srOrx2ZWZBpBUvZwXKQmoEYga2; // string
$idempotency_key = 'idempotency_key_example'; // string | The request's idempotency key

try {
    $result = $apiInstance->getEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersGet($endpoint_id, $app_id, $idempotency_key);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling EndpointApi->getEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersGet: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **endpoint_id** | **string**|  | |
| **app_id** | **string**|  | |
| **idempotency_key** | **string**| The request&#39;s idempotency key | [optional] |

### Return type

[**\OpenAPI\Client\Model\EndpointHeadersOut**](../Model/EndpointHeadersOut.md)

### Authorization

[HTTPBearer](../../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `getEndpointSecretApiV1AppAppIdEndpointEndpointIdSecretGet()`

```php
getEndpointSecretApiV1AppAppIdEndpointEndpointIdSecretGet($endpoint_id, $app_id, $idempotency_key): \OpenAPI\Client\Model\EndpointSecretOut
```

Get Endpoint Secret

Get the endpoint's signing secret.  This is used to verify the authenticity of the webhook. For more information please refer to [the consuming webhooks docs](https://docs.svix.com/consuming-webhooks/).

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: HTTPBearer
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\EndpointApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$endpoint_id = ep_1srOrx2ZWZBpBUvZwXKQmoEYga2; // string
$app_id = app_1srOrx2ZWZBpBUvZwXKQmoEYga2; // string
$idempotency_key = 'idempotency_key_example'; // string | The request's idempotency key

try {
    $result = $apiInstance->getEndpointSecretApiV1AppAppIdEndpointEndpointIdSecretGet($endpoint_id, $app_id, $idempotency_key);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling EndpointApi->getEndpointSecretApiV1AppAppIdEndpointEndpointIdSecretGet: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **endpoint_id** | **string**|  | |
| **app_id** | **string**|  | |
| **idempotency_key** | **string**| The request&#39;s idempotency key | [optional] |

### Return type

[**\OpenAPI\Client\Model\EndpointSecretOut**](../Model/EndpointSecretOut.md)

### Authorization

[HTTPBearer](../../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `getEndpointStatsApiV1AppAppIdEndpointEndpointIdStatsGet()`

```php
getEndpointStatsApiV1AppAppIdEndpointEndpointIdStatsGet($endpoint_id, $app_id, $idempotency_key): \OpenAPI\Client\Model\EndpointStats
```

Get Endpoint Stats

Get basic statistics for the endpoint.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: HTTPBearer
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\EndpointApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$endpoint_id = ep_1srOrx2ZWZBpBUvZwXKQmoEYga2; // string
$app_id = app_1srOrx2ZWZBpBUvZwXKQmoEYga2; // string
$idempotency_key = 'idempotency_key_example'; // string | The request's idempotency key

try {
    $result = $apiInstance->getEndpointStatsApiV1AppAppIdEndpointEndpointIdStatsGet($endpoint_id, $app_id, $idempotency_key);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling EndpointApi->getEndpointStatsApiV1AppAppIdEndpointEndpointIdStatsGet: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **endpoint_id** | **string**|  | |
| **app_id** | **string**|  | |
| **idempotency_key** | **string**| The request&#39;s idempotency key | [optional] |

### Return type

[**\OpenAPI\Client\Model\EndpointStats**](../Model/EndpointStats.md)

### Authorization

[HTTPBearer](../../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `listEndpointsApiV1AppAppIdEndpointGet()`

```php
listEndpointsApiV1AppAppIdEndpointGet($app_id, $iterator, $limit, $idempotency_key): \OpenAPI\Client\Model\ListResponseEndpointOut
```

List Endpoints

List the application's endpoints.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: HTTPBearer
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\EndpointApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$app_id = app_1srOrx2ZWZBpBUvZwXKQmoEYga2; // string
$iterator = ep_1srOrx2ZWZBpBUvZwXKQmoEYga2; // string
$limit = 50; // int
$idempotency_key = 'idempotency_key_example'; // string | The request's idempotency key

try {
    $result = $apiInstance->listEndpointsApiV1AppAppIdEndpointGet($app_id, $iterator, $limit, $idempotency_key);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling EndpointApi->listEndpointsApiV1AppAppIdEndpointGet: ', $e->getMessage(), PHP_EOL;
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

[**\OpenAPI\Client\Model\ListResponseEndpointOut**](../Model/ListResponseEndpointOut.md)

### Authorization

[HTTPBearer](../../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `patchEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersPatch()`

```php
patchEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersPatch($app_id, $endpoint_id, $endpoint_headers_patch_in, $idempotency_key)
```

Patch Endpoint Headers

Partially set the additional headers to be sent with the webhook

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: HTTPBearer
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\EndpointApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$app_id = app_1srOrx2ZWZBpBUvZwXKQmoEYga2; // string
$endpoint_id = ep_1srOrx2ZWZBpBUvZwXKQmoEYga2; // string
$endpoint_headers_patch_in = new \OpenAPI\Client\Model\EndpointHeadersPatchIn(); // \OpenAPI\Client\Model\EndpointHeadersPatchIn
$idempotency_key = 'idempotency_key_example'; // string | The request's idempotency key

try {
    $apiInstance->patchEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersPatch($app_id, $endpoint_id, $endpoint_headers_patch_in, $idempotency_key);
} catch (Exception $e) {
    echo 'Exception when calling EndpointApi->patchEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersPatch: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **app_id** | **string**|  | |
| **endpoint_id** | **string**|  | |
| **endpoint_headers_patch_in** | [**\OpenAPI\Client\Model\EndpointHeadersPatchIn**](../Model/EndpointHeadersPatchIn.md)|  | |
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

## `recoverFailedWebhooksApiV1AppAppIdEndpointEndpointIdRecoverPost()`

```php
recoverFailedWebhooksApiV1AppAppIdEndpointEndpointIdRecoverPost($app_id, $endpoint_id, $recover_in, $idempotency_key): object
```

Recover Failed Webhooks

Resend all failed messages since a given time.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: HTTPBearer
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\EndpointApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$app_id = app_1srOrx2ZWZBpBUvZwXKQmoEYga2; // string
$endpoint_id = ep_1srOrx2ZWZBpBUvZwXKQmoEYga2; // string
$recover_in = new \OpenAPI\Client\Model\RecoverIn(); // \OpenAPI\Client\Model\RecoverIn
$idempotency_key = 'idempotency_key_example'; // string | The request's idempotency key

try {
    $result = $apiInstance->recoverFailedWebhooksApiV1AppAppIdEndpointEndpointIdRecoverPost($app_id, $endpoint_id, $recover_in, $idempotency_key);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling EndpointApi->recoverFailedWebhooksApiV1AppAppIdEndpointEndpointIdRecoverPost: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **app_id** | **string**|  | |
| **endpoint_id** | **string**|  | |
| **recover_in** | [**\OpenAPI\Client\Model\RecoverIn**](../Model/RecoverIn.md)|  | |
| **idempotency_key** | **string**| The request&#39;s idempotency key | [optional] |

### Return type

**object**

### Authorization

[HTTPBearer](../../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `replayMissingWebhooksApiV1AppAppIdEndpointEndpointIdReplayMissingPost()`

```php
replayMissingWebhooksApiV1AppAppIdEndpointEndpointIdReplayMissingPost($app_id, $endpoint_id, $replay_in, $idempotency_key): object
```

Replay Missing Webhooks

Replays messages to the endpoint. Only messages that were created after `since` will be sent. Messages that were previously sent to the endpoint are not resent.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: HTTPBearer
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\EndpointApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$app_id = app_1srOrx2ZWZBpBUvZwXKQmoEYga2; // string
$endpoint_id = ep_1srOrx2ZWZBpBUvZwXKQmoEYga2; // string
$replay_in = new \OpenAPI\Client\Model\ReplayIn(); // \OpenAPI\Client\Model\ReplayIn
$idempotency_key = 'idempotency_key_example'; // string | The request's idempotency key

try {
    $result = $apiInstance->replayMissingWebhooksApiV1AppAppIdEndpointEndpointIdReplayMissingPost($app_id, $endpoint_id, $replay_in, $idempotency_key);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling EndpointApi->replayMissingWebhooksApiV1AppAppIdEndpointEndpointIdReplayMissingPost: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **app_id** | **string**|  | |
| **endpoint_id** | **string**|  | |
| **replay_in** | [**\OpenAPI\Client\Model\ReplayIn**](../Model/ReplayIn.md)|  | |
| **idempotency_key** | **string**| The request&#39;s idempotency key | [optional] |

### Return type

**object**

### Authorization

[HTTPBearer](../../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `rotateEndpointSecretApiV1AppAppIdEndpointEndpointIdSecretRotatePost()`

```php
rotateEndpointSecretApiV1AppAppIdEndpointEndpointIdSecretRotatePost($endpoint_id, $app_id, $endpoint_secret_rotate_in, $idempotency_key)
```

Rotate Endpoint Secret

Rotates the endpoint's signing secret.  The previous secret will be valid for the next 24 hours.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: HTTPBearer
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\EndpointApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$endpoint_id = ep_1srOrx2ZWZBpBUvZwXKQmoEYga2; // string
$app_id = app_1srOrx2ZWZBpBUvZwXKQmoEYga2; // string
$endpoint_secret_rotate_in = new \OpenAPI\Client\Model\EndpointSecretRotateIn(); // \OpenAPI\Client\Model\EndpointSecretRotateIn
$idempotency_key = 'idempotency_key_example'; // string | The request's idempotency key

try {
    $apiInstance->rotateEndpointSecretApiV1AppAppIdEndpointEndpointIdSecretRotatePost($endpoint_id, $app_id, $endpoint_secret_rotate_in, $idempotency_key);
} catch (Exception $e) {
    echo 'Exception when calling EndpointApi->rotateEndpointSecretApiV1AppAppIdEndpointEndpointIdSecretRotatePost: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **endpoint_id** | **string**|  | |
| **app_id** | **string**|  | |
| **endpoint_secret_rotate_in** | [**\OpenAPI\Client\Model\EndpointSecretRotateIn**](../Model/EndpointSecretRotateIn.md)|  | |
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

## `updateEndpointApiV1AppAppIdEndpointEndpointIdPut()`

```php
updateEndpointApiV1AppAppIdEndpointEndpointIdPut($endpoint_id, $app_id, $endpoint_update, $idempotency_key): \OpenAPI\Client\Model\EndpointOut
```

Update Endpoint

Update an endpoint.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: HTTPBearer
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\EndpointApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$endpoint_id = ep_1srOrx2ZWZBpBUvZwXKQmoEYga2; // string
$app_id = app_1srOrx2ZWZBpBUvZwXKQmoEYga2; // string
$endpoint_update = new \OpenAPI\Client\Model\EndpointUpdate(); // \OpenAPI\Client\Model\EndpointUpdate
$idempotency_key = 'idempotency_key_example'; // string | The request's idempotency key

try {
    $result = $apiInstance->updateEndpointApiV1AppAppIdEndpointEndpointIdPut($endpoint_id, $app_id, $endpoint_update, $idempotency_key);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling EndpointApi->updateEndpointApiV1AppAppIdEndpointEndpointIdPut: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **endpoint_id** | **string**|  | |
| **app_id** | **string**|  | |
| **endpoint_update** | [**\OpenAPI\Client\Model\EndpointUpdate**](../Model/EndpointUpdate.md)|  | |
| **idempotency_key** | **string**| The request&#39;s idempotency key | [optional] |

### Return type

[**\OpenAPI\Client\Model\EndpointOut**](../Model/EndpointOut.md)

### Authorization

[HTTPBearer](../../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `updateEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersPut()`

```php
updateEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersPut($app_id, $endpoint_id, $endpoint_headers_in, $idempotency_key)
```

Update Endpoint Headers

Set the additional headers to be sent with the webhook

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: HTTPBearer
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\EndpointApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$app_id = app_1srOrx2ZWZBpBUvZwXKQmoEYga2; // string
$endpoint_id = ep_1srOrx2ZWZBpBUvZwXKQmoEYga2; // string
$endpoint_headers_in = new \OpenAPI\Client\Model\EndpointHeadersIn(); // \OpenAPI\Client\Model\EndpointHeadersIn
$idempotency_key = 'idempotency_key_example'; // string | The request's idempotency key

try {
    $apiInstance->updateEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersPut($app_id, $endpoint_id, $endpoint_headers_in, $idempotency_key);
} catch (Exception $e) {
    echo 'Exception when calling EndpointApi->updateEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersPut: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **app_id** | **string**|  | |
| **endpoint_id** | **string**|  | |
| **endpoint_headers_in** | [**\OpenAPI\Client\Model\EndpointHeadersIn**](../Model/EndpointHeadersIn.md)|  | |
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
