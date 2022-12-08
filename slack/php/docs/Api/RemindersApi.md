# OpenAPI\Client\RemindersApi

All URIs are relative to https://slack.com/api, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**remindersAdd()**](RemindersApi.md#remindersAdd) | **POST** /reminders.add |  |
| [**remindersComplete()**](RemindersApi.md#remindersComplete) | **POST** /reminders.complete |  |
| [**remindersDelete()**](RemindersApi.md#remindersDelete) | **POST** /reminders.delete |  |
| [**remindersInfo()**](RemindersApi.md#remindersInfo) | **GET** /reminders.info |  |
| [**remindersList()**](RemindersApi.md#remindersList) | **GET** /reminders.list |  |


## `remindersAdd()`

```php
remindersAdd($token, $text, $time, $user): \OpenAPI\Client\Model\RemindersAddSchema
```



Creates a reminder.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\RemindersApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `reminders:write`
$text = 'text_example'; // string | The content of the reminder
$time = 'time_example'; // string | When this reminder should happen: the Unix timestamp (up to five years from now), the number of seconds until the reminder (if within 24 hours), or a natural language description (Ex. \\\"in 15 minutes,\\\" or \\\"every Thursday\\\")
$user = 'user_example'; // string | The user who will receive the reminder. If no user is specified, the reminder will go to user who created it.

try {
    $result = $apiInstance->remindersAdd($token, $text, $time, $user);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling RemindersApi->remindersAdd: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;reminders:write&#x60; | |
| **text** | **string**| The content of the reminder | |
| **time** | **string**| When this reminder should happen: the Unix timestamp (up to five years from now), the number of seconds until the reminder (if within 24 hours), or a natural language description (Ex. \\\&quot;in 15 minutes,\\\&quot; or \\\&quot;every Thursday\\\&quot;) | |
| **user** | **string**| The user who will receive the reminder. If no user is specified, the reminder will go to user who created it. | [optional] |

### Return type

[**\OpenAPI\Client\Model\RemindersAddSchema**](../Model/RemindersAddSchema.md)

### Authorization

[slackAuth](../../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: `application/x-www-form-urlencoded`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `remindersComplete()`

```php
remindersComplete($token, $reminder): \OpenAPI\Client\Model\RemindersCompleteSchema
```



Marks a reminder as complete.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\RemindersApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `reminders:write`
$reminder = 'reminder_example'; // string | The ID of the reminder to be marked as complete

try {
    $result = $apiInstance->remindersComplete($token, $reminder);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling RemindersApi->remindersComplete: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;reminders:write&#x60; | [optional] |
| **reminder** | **string**| The ID of the reminder to be marked as complete | [optional] |

### Return type

[**\OpenAPI\Client\Model\RemindersCompleteSchema**](../Model/RemindersCompleteSchema.md)

### Authorization

[slackAuth](../../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: `application/x-www-form-urlencoded`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `remindersDelete()`

```php
remindersDelete($token, $reminder): \OpenAPI\Client\Model\RemindersDeleteSchema
```



Deletes a reminder.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\RemindersApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `reminders:write`
$reminder = 'reminder_example'; // string | The ID of the reminder

try {
    $result = $apiInstance->remindersDelete($token, $reminder);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling RemindersApi->remindersDelete: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;reminders:write&#x60; | [optional] |
| **reminder** | **string**| The ID of the reminder | [optional] |

### Return type

[**\OpenAPI\Client\Model\RemindersDeleteSchema**](../Model/RemindersDeleteSchema.md)

### Authorization

[slackAuth](../../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: `application/x-www-form-urlencoded`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `remindersInfo()`

```php
remindersInfo($token, $reminder): \OpenAPI\Client\Model\RemindersInfoSchema
```



Gets information about a reminder.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\RemindersApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `reminders:read`
$reminder = 'reminder_example'; // string | The ID of the reminder

try {
    $result = $apiInstance->remindersInfo($token, $reminder);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling RemindersApi->remindersInfo: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;reminders:read&#x60; | [optional] |
| **reminder** | **string**| The ID of the reminder | [optional] |

### Return type

[**\OpenAPI\Client\Model\RemindersInfoSchema**](../Model/RemindersInfoSchema.md)

### Authorization

[slackAuth](../../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `remindersList()`

```php
remindersList($token): \OpenAPI\Client\Model\RemindersListSchema
```



Lists all reminders created by or for a given user.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\RemindersApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `reminders:read`

try {
    $result = $apiInstance->remindersList($token);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling RemindersApi->remindersList: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;reminders:read&#x60; | [optional] |

### Return type

[**\OpenAPI\Client\Model\RemindersListSchema**](../Model/RemindersListSchema.md)

### Authorization

[slackAuth](../../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
