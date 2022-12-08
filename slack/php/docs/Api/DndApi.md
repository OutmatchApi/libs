# OpenAPI\Client\DndApi

All URIs are relative to https://slack.com/api, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**dndEndDnd()**](DndApi.md#dndEndDnd) | **POST** /dnd.endDnd |  |
| [**dndEndSnooze()**](DndApi.md#dndEndSnooze) | **POST** /dnd.endSnooze |  |
| [**dndInfo()**](DndApi.md#dndInfo) | **GET** /dnd.info |  |
| [**dndSetSnooze()**](DndApi.md#dndSetSnooze) | **POST** /dnd.setSnooze |  |
| [**dndTeamInfo()**](DndApi.md#dndTeamInfo) | **GET** /dnd.teamInfo |  |


## `dndEndDnd()`

```php
dndEndDnd($token): \OpenAPI\Client\Model\DndEndDndSchema
```



Ends the current user's Do Not Disturb session immediately.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\DndApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `dnd:write`

try {
    $result = $apiInstance->dndEndDnd($token);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DndApi->dndEndDnd: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;dnd:write&#x60; | |

### Return type

[**\OpenAPI\Client\Model\DndEndDndSchema**](../Model/DndEndDndSchema.md)

### Authorization

[slackAuth](../../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `dndEndSnooze()`

```php
dndEndSnooze($token): \OpenAPI\Client\Model\DndEndSnoozeSchema
```



Ends the current user's snooze mode immediately.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\DndApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `dnd:write`

try {
    $result = $apiInstance->dndEndSnooze($token);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DndApi->dndEndSnooze: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;dnd:write&#x60; | |

### Return type

[**\OpenAPI\Client\Model\DndEndSnoozeSchema**](../Model/DndEndSnoozeSchema.md)

### Authorization

[slackAuth](../../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `dndInfo()`

```php
dndInfo($token, $user): \OpenAPI\Client\Model\DndInfoSchema
```



Retrieves a user's current Do Not Disturb status.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\DndApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `dnd:read`
$user = 'user_example'; // string | User to fetch status for (defaults to current user)

try {
    $result = $apiInstance->dndInfo($token, $user);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DndApi->dndInfo: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;dnd:read&#x60; | [optional] |
| **user** | **string**| User to fetch status for (defaults to current user) | [optional] |

### Return type

[**\OpenAPI\Client\Model\DndInfoSchema**](../Model/DndInfoSchema.md)

### Authorization

[slackAuth](../../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `dndSetSnooze()`

```php
dndSetSnooze($num_minutes, $token): \OpenAPI\Client\Model\DndSetSnoozeSchema
```



Turns on Do Not Disturb mode for the current user, or changes its duration.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\DndApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$num_minutes = 'num_minutes_example'; // string | Number of minutes, from now, to snooze until.
$token = 'token_example'; // string | Authentication token. Requires scope: `dnd:write`

try {
    $result = $apiInstance->dndSetSnooze($num_minutes, $token);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DndApi->dndSetSnooze: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **num_minutes** | **string**| Number of minutes, from now, to snooze until. | |
| **token** | **string**| Authentication token. Requires scope: &#x60;dnd:write&#x60; | |

### Return type

[**\OpenAPI\Client\Model\DndSetSnoozeSchema**](../Model/DndSetSnoozeSchema.md)

### Authorization

[slackAuth](../../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: `application/x-www-form-urlencoded`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `dndTeamInfo()`

```php
dndTeamInfo($token, $users): \OpenAPI\Client\Model\DefaultSuccessTemplate
```



Retrieves the Do Not Disturb status for up to 50 users on a team.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\DndApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `dnd:read`
$users = 'users_example'; // string | Comma-separated list of users to fetch Do Not Disturb status for

try {
    $result = $apiInstance->dndTeamInfo($token, $users);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DndApi->dndTeamInfo: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;dnd:read&#x60; | [optional] |
| **users** | **string**| Comma-separated list of users to fetch Do Not Disturb status for | [optional] |

### Return type

[**\OpenAPI\Client\Model\DefaultSuccessTemplate**](../Model/DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
