# OpenAPI\Client\ChatScheduledMessagesApi

All URIs are relative to https://slack.com/api, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**chatScheduledMessagesList()**](ChatScheduledMessagesApi.md#chatScheduledMessagesList) | **GET** /chat.scheduledMessages.list |  |


## `chatScheduledMessagesList()`

```php
chatScheduledMessagesList($token, $channel, $latest, $oldest, $limit, $cursor): \OpenAPI\Client\Model\ChatScheduledMessagesListSchema
```



Returns a list of scheduled messages.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\ChatScheduledMessagesApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `none`
$channel = 'channel_example'; // string | The channel of the scheduled messages
$latest = 3.4; // float | A UNIX timestamp of the latest value in the time range
$oldest = 3.4; // float | A UNIX timestamp of the oldest value in the time range
$limit = 56; // int | Maximum number of original entries to return.
$cursor = 'cursor_example'; // string | For pagination purposes, this is the `cursor` value returned from a previous call to `chat.scheduledmessages.list` indicating where you want to start this call from.

try {
    $result = $apiInstance->chatScheduledMessagesList($token, $channel, $latest, $oldest, $limit, $cursor);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ChatScheduledMessagesApi->chatScheduledMessagesList: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;none&#x60; | [optional] |
| **channel** | **string**| The channel of the scheduled messages | [optional] |
| **latest** | **float**| A UNIX timestamp of the latest value in the time range | [optional] |
| **oldest** | **float**| A UNIX timestamp of the oldest value in the time range | [optional] |
| **limit** | **int**| Maximum number of original entries to return. | [optional] |
| **cursor** | **string**| For pagination purposes, this is the &#x60;cursor&#x60; value returned from a previous call to &#x60;chat.scheduledmessages.list&#x60; indicating where you want to start this call from. | [optional] |

### Return type

[**\OpenAPI\Client\Model\ChatScheduledMessagesListSchema**](../Model/ChatScheduledMessagesListSchema.md)

### Authorization

[slackAuth](../../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
