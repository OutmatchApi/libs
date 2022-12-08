# OpenAPI\Client\BotsApi

All URIs are relative to https://slack.com/api, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**botsInfo()**](BotsApi.md#botsInfo) | **GET** /bots.info |  |


## `botsInfo()`

```php
botsInfo($token, $bot): \OpenAPI\Client\Model\BotsInfoSchema
```



Gets information about a bot user.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\BotsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `users:read`
$bot = 'bot_example'; // string | Bot user to get info on

try {
    $result = $apiInstance->botsInfo($token, $bot);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BotsApi->botsInfo: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;users:read&#x60; | |
| **bot** | **string**| Bot user to get info on | [optional] |

### Return type

[**\OpenAPI\Client\Model\BotsInfoSchema**](../Model/BotsInfoSchema.md)

### Authorization

[slackAuth](../../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
