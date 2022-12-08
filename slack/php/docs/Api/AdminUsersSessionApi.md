# OpenAPI\Client\AdminUsersSessionApi

All URIs are relative to https://slack.com/api, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**adminUsersSessionInvalidate()**](AdminUsersSessionApi.md#adminUsersSessionInvalidate) | **POST** /admin.users.session.invalidate |  |
| [**adminUsersSessionReset()**](AdminUsersSessionApi.md#adminUsersSessionReset) | **POST** /admin.users.session.reset |  |


## `adminUsersSessionInvalidate()`

```php
adminUsersSessionInvalidate($token, $session_id, $team_id): \OpenAPI\Client\Model\DefaultSuccessTemplate
```



Invalidate a single session for a user by session_id

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AdminUsersSessionApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `admin.users:write`
$session_id = 56; // int
$team_id = 'team_id_example'; // string | ID of the team that the session belongs to

try {
    $result = $apiInstance->adminUsersSessionInvalidate($token, $session_id, $team_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AdminUsersSessionApi->adminUsersSessionInvalidate: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;admin.users:write&#x60; | |
| **session_id** | **int**|  | |
| **team_id** | **string**| ID of the team that the session belongs to | |

### Return type

[**\OpenAPI\Client\Model\DefaultSuccessTemplate**](../Model/DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: `application/x-www-form-urlencoded`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `adminUsersSessionReset()`

```php
adminUsersSessionReset($token, $user_id, $mobile_only, $web_only): \OpenAPI\Client\Model\DefaultSuccessTemplate
```



Wipes all valid sessions on all devices for a given user

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AdminUsersSessionApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `admin.users:write`
$user_id = 'user_id_example'; // string | The ID of the user to wipe sessions for
$mobile_only = True; // bool | Only expire mobile sessions (default: false)
$web_only = True; // bool | Only expire web sessions (default: false)

try {
    $result = $apiInstance->adminUsersSessionReset($token, $user_id, $mobile_only, $web_only);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AdminUsersSessionApi->adminUsersSessionReset: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;admin.users:write&#x60; | |
| **user_id** | **string**| The ID of the user to wipe sessions for | |
| **mobile_only** | **bool**| Only expire mobile sessions (default: false) | [optional] |
| **web_only** | **bool**| Only expire web sessions (default: false) | [optional] |

### Return type

[**\OpenAPI\Client\Model\DefaultSuccessTemplate**](../Model/DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: `application/x-www-form-urlencoded`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
