# OpenAPI\Client\WebhooksApi

All URIs are relative to https://ws.api.video, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**dELETEWebhook()**](WebhooksApi.md#dELETEWebhook) | **DELETE** /webhooks/{webhookId} | Delete a Webhook |
| [**gETWebhook()**](WebhooksApi.md#gETWebhook) | **GET** /webhooks/{webhookId} | Show Webhook details |
| [**lISTWebhooks()**](WebhooksApi.md#lISTWebhooks) | **GET** /webhooks | List all webhooks |
| [**pOSTWebhooks()**](WebhooksApi.md#pOSTWebhooks) | **POST** /webhooks | Create Webhook |


## `dELETEWebhook()`

```php
dELETEWebhook($webhook_id)
```

Delete a Webhook

This endpoint will delete the indicated webhook.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: bearerAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\WebhooksApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$webhook_id = 'webhook_id_example'; // string | The webhook you wish to delete.

try {
    $apiInstance->dELETEWebhook($webhook_id);
} catch (Exception $e) {
    echo 'Exception when calling WebhooksApi->dELETEWebhook: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **webhook_id** | **string**| The webhook you wish to delete. | |

### Return type

void (empty response body)

### Authorization

[bearerAuth](../../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `gETWebhook()`

```php
gETWebhook($webhook_id): \OpenAPI\Client\Model\Webhook
```

Show Webhook details

This call provides the same JSON information provided on Webjhook creation.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: bearerAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\WebhooksApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$webhook_id = 'webhook_id_example'; // string | The unique webhook you wish to retreive details on.

try {
    $result = $apiInstance->gETWebhook($webhook_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling WebhooksApi->gETWebhook: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **webhook_id** | **string**| The unique webhook you wish to retreive details on. | |

### Return type

[**\OpenAPI\Client\Model\Webhook**](../Model/Webhook.md)

### Authorization

[bearerAuth](../../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `lISTWebhooks()`

```php
lISTWebhooks($events, $current_page, $page_size): \OpenAPI\Client\Model\WebhooksListResponse
```

List all webhooks

Requests to this endpoint return a list of your webhooks (with all their details). You can filter what the webhook list that the API returns using the parameters described below.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: bearerAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\WebhooksApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);

$associative_array = [
    'events' => video.encoding.quality.completed, // string | The webhook event that you wish to filter on.
    'current_page' => 2, // int | Choose the number of search results to return per page. Minimum value: 1
    'page_size' => 30, // int | Results per page. Allowed values 1-100, default is 25.
];

try {
    $result = $apiInstance->lISTWebhooks($associate_array);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling WebhooksApi->lISTWebhooks: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

Note: the input parameter is an associative array with the keys listed as the parameter names below.

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **events** | **string**| The webhook event that you wish to filter on. | [optional] |
| **current_page** | **int**| Choose the number of search results to return per page. Minimum value: 1 | [optional] [default to 1] |
| **page_size** | **int**| Results per page. Allowed values 1-100, default is 25. | [optional] [default to 25] |

### Return type

[**\OpenAPI\Client\Model\WebhooksListResponse**](../Model/WebhooksListResponse.md)

### Authorization

[bearerAuth](../../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `pOSTWebhooks()`

```php
pOSTWebhooks($webhooks_create_payload): \OpenAPI\Client\Model\Webhook
```

Create Webhook

Webhooks can push notifications to your server, rather than polling api.video for changes. We currently offer four events:  * ```video.encoding.quality.completed```  When a new video is uploaded into your account, it will be encoded into several different HLS sizes/bitrates.  When each version is encoded, your webhook will get a notification.  It will look like ```{ \\\"type\\\": \\\"video.encoding.quality.completed\\\", \\\"emittedAt\\\": \\\"2021-01-29T16:46:25.217+01:00\\\", \\\"videoId\\\": \\\"viXXXXXXXX\\\", \\\"encoding\\\": \\\"hls\\\", \\\"quality\\\": \\\"720p\\\"} ```. This request says that the 720p HLS encoding was completed. * ```live-stream.broadcast.started```  When a livestream begins broadcasting, the broadcasting parameter changes from false to true, and this webhook fires. * ```live-stream.broadcast.ended```  This event fores when the livestream has finished broadcasting, and the broadcasting parameter flips from false to true. * ```video.source.recorded```  This event is similar to ```video.encoding.quality.completed```, but tells you if a livestream has been recorded as a VOD.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: bearerAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\WebhooksApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$webhooks_create_payload = new \OpenAPI\Client\Model\WebhooksCreatePayload(); // \OpenAPI\Client\Model\WebhooksCreatePayload

try {
    $result = $apiInstance->pOSTWebhooks($webhooks_create_payload);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling WebhooksApi->pOSTWebhooks: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **webhooks_create_payload** | [**\OpenAPI\Client\Model\WebhooksCreatePayload**](../Model/WebhooksCreatePayload.md)|  | [optional] |

### Return type

[**\OpenAPI\Client\Model\Webhook**](../Model/Webhook.md)

### Authorization

[bearerAuth](../../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
