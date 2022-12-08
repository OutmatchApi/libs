# OpenAPI\Client\RtmApi

All URIs are relative to https://slack.com/api, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**rtmConnect()**](RtmApi.md#rtmConnect) | **GET** /rtm.connect |  |


## `rtmConnect()`

```php
rtmConnect($token, $batch_presence_aware, $presence_sub): \OpenAPI\Client\Model\RtmConnectSchema
```



Starts a Real Time Messaging session.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\RtmApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `rtm:stream`
$batch_presence_aware = True; // bool | Batch presence deliveries via subscription. Enabling changes the shape of `presence_change` events. See [batch presence](/docs/presence-and-status#batching).
$presence_sub = True; // bool | Only deliver presence events when requested by subscription. See [presence subscriptions](/docs/presence-and-status#subscriptions).

try {
    $result = $apiInstance->rtmConnect($token, $batch_presence_aware, $presence_sub);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling RtmApi->rtmConnect: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;rtm:stream&#x60; | |
| **batch_presence_aware** | **bool**| Batch presence deliveries via subscription. Enabling changes the shape of &#x60;presence_change&#x60; events. See [batch presence](/docs/presence-and-status#batching). | [optional] |
| **presence_sub** | **bool**| Only deliver presence events when requested by subscription. See [presence subscriptions](/docs/presence-and-status#subscriptions). | [optional] |

### Return type

[**\OpenAPI\Client\Model\RtmConnectSchema**](../Model/RtmConnectSchema.md)

### Authorization

[slackAuth](../../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
