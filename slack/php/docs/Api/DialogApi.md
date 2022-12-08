# OpenAPI\Client\DialogApi

All URIs are relative to https://slack.com/api, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**dialogOpen()**](DialogApi.md#dialogOpen) | **GET** /dialog.open |  |


## `dialogOpen()`

```php
dialogOpen($token, $dialog, $trigger_id): \OpenAPI\Client\Model\DialogOpenSchema
```



Open a dialog with a user

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\DialogApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `none`
$dialog = 'dialog_example'; // string | The dialog definition. This must be a JSON-encoded string.
$trigger_id = 'trigger_id_example'; // string | Exchange a trigger to post to the user.

try {
    $result = $apiInstance->dialogOpen($token, $dialog, $trigger_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DialogApi->dialogOpen: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;none&#x60; | |
| **dialog** | **string**| The dialog definition. This must be a JSON-encoded string. | |
| **trigger_id** | **string**| Exchange a trigger to post to the user. | |

### Return type

[**\OpenAPI\Client\Model\DialogOpenSchema**](../Model/DialogOpenSchema.md)

### Authorization

[slackAuth](../../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
