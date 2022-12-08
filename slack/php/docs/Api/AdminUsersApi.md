# OpenAPI\Client\AdminUsersApi

All URIs are relative to https://slack.com/api, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**adminUsersAssign()**](AdminUsersApi.md#adminUsersAssign) | **POST** /admin.users.assign |  |
| [**adminUsersInvite()**](AdminUsersApi.md#adminUsersInvite) | **POST** /admin.users.invite |  |
| [**adminUsersList()**](AdminUsersApi.md#adminUsersList) | **GET** /admin.users.list |  |
| [**adminUsersRemove()**](AdminUsersApi.md#adminUsersRemove) | **POST** /admin.users.remove |  |
| [**adminUsersSetAdmin()**](AdminUsersApi.md#adminUsersSetAdmin) | **POST** /admin.users.setAdmin |  |
| [**adminUsersSetExpiration()**](AdminUsersApi.md#adminUsersSetExpiration) | **POST** /admin.users.setExpiration |  |
| [**adminUsersSetOwner()**](AdminUsersApi.md#adminUsersSetOwner) | **POST** /admin.users.setOwner |  |
| [**adminUsersSetRegular()**](AdminUsersApi.md#adminUsersSetRegular) | **POST** /admin.users.setRegular |  |


## `adminUsersAssign()`

```php
adminUsersAssign($token, $team_id, $user_id, $channel_ids, $is_restricted, $is_ultra_restricted): \OpenAPI\Client\Model\DefaultSuccessTemplate
```



Add an Enterprise user to a workspace.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AdminUsersApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `admin.users:write`
$team_id = 'team_id_example'; // string | The ID (`T1234`) of the workspace.
$user_id = 'user_id_example'; // string | The ID of the user to add to the workspace.
$channel_ids = 'channel_ids_example'; // string | Comma separated values of channel IDs to add user in the new workspace.
$is_restricted = True; // bool | True if user should be added to the workspace as a guest.
$is_ultra_restricted = True; // bool | True if user should be added to the workspace as a single-channel guest.

try {
    $result = $apiInstance->adminUsersAssign($token, $team_id, $user_id, $channel_ids, $is_restricted, $is_ultra_restricted);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AdminUsersApi->adminUsersAssign: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;admin.users:write&#x60; | |
| **team_id** | **string**| The ID (&#x60;T1234&#x60;) of the workspace. | |
| **user_id** | **string**| The ID of the user to add to the workspace. | |
| **channel_ids** | **string**| Comma separated values of channel IDs to add user in the new workspace. | [optional] |
| **is_restricted** | **bool**| True if user should be added to the workspace as a guest. | [optional] |
| **is_ultra_restricted** | **bool**| True if user should be added to the workspace as a single-channel guest. | [optional] |

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

## `adminUsersInvite()`

```php
adminUsersInvite($token, $channel_ids, $email, $team_id, $custom_message, $guest_expiration_ts, $is_restricted, $is_ultra_restricted, $real_name, $resend): \OpenAPI\Client\Model\DefaultSuccessTemplate
```



Invite a user to a workspace.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AdminUsersApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `admin.users:write`
$channel_ids = 'channel_ids_example'; // string | A comma-separated list of `channel_id`s for this user to join. At least one channel is required.
$email = 'email_example'; // string | The email address of the person to invite.
$team_id = 'team_id_example'; // string | The ID (`T1234`) of the workspace.
$custom_message = 'custom_message_example'; // string | An optional message to send to the user in the invite email.
$guest_expiration_ts = 'guest_expiration_ts_example'; // string | Timestamp when guest account should be disabled. Only include this timestamp if you are inviting a guest user and you want their account to expire on a certain date.
$is_restricted = True; // bool | Is this user a multi-channel guest user? (default: false)
$is_ultra_restricted = True; // bool | Is this user a single channel guest user? (default: false)
$real_name = 'real_name_example'; // string | Full name of the user.
$resend = True; // bool | Allow this invite to be resent in the future if a user has not signed up yet. (default: false)

try {
    $result = $apiInstance->adminUsersInvite($token, $channel_ids, $email, $team_id, $custom_message, $guest_expiration_ts, $is_restricted, $is_ultra_restricted, $real_name, $resend);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AdminUsersApi->adminUsersInvite: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;admin.users:write&#x60; | |
| **channel_ids** | **string**| A comma-separated list of &#x60;channel_id&#x60;s for this user to join. At least one channel is required. | |
| **email** | **string**| The email address of the person to invite. | |
| **team_id** | **string**| The ID (&#x60;T1234&#x60;) of the workspace. | |
| **custom_message** | **string**| An optional message to send to the user in the invite email. | [optional] |
| **guest_expiration_ts** | **string**| Timestamp when guest account should be disabled. Only include this timestamp if you are inviting a guest user and you want their account to expire on a certain date. | [optional] |
| **is_restricted** | **bool**| Is this user a multi-channel guest user? (default: false) | [optional] |
| **is_ultra_restricted** | **bool**| Is this user a single channel guest user? (default: false) | [optional] |
| **real_name** | **string**| Full name of the user. | [optional] |
| **resend** | **bool**| Allow this invite to be resent in the future if a user has not signed up yet. (default: false) | [optional] |

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

## `adminUsersList()`

```php
adminUsersList($token, $team_id, $cursor, $limit): \OpenAPI\Client\Model\DefaultSuccessTemplate
```



List users on a workspace

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AdminUsersApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `admin.users:read`
$team_id = 'team_id_example'; // string | The ID (`T1234`) of the workspace.
$cursor = 'cursor_example'; // string | Set `cursor` to `next_cursor` returned by the previous call to list items in the next page.
$limit = 56; // int | Limit for how many users to be retrieved per page

try {
    $result = $apiInstance->adminUsersList($token, $team_id, $cursor, $limit);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AdminUsersApi->adminUsersList: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;admin.users:read&#x60; | |
| **team_id** | **string**| The ID (&#x60;T1234&#x60;) of the workspace. | |
| **cursor** | **string**| Set &#x60;cursor&#x60; to &#x60;next_cursor&#x60; returned by the previous call to list items in the next page. | [optional] |
| **limit** | **int**| Limit for how many users to be retrieved per page | [optional] |

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

## `adminUsersRemove()`

```php
adminUsersRemove($token, $team_id, $user_id): \OpenAPI\Client\Model\DefaultSuccessTemplate
```



Remove a user from a workspace.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AdminUsersApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `admin.users:write`
$team_id = 'team_id_example'; // string | The ID (`T1234`) of the workspace.
$user_id = 'user_id_example'; // string | The ID of the user to remove.

try {
    $result = $apiInstance->adminUsersRemove($token, $team_id, $user_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AdminUsersApi->adminUsersRemove: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;admin.users:write&#x60; | |
| **team_id** | **string**| The ID (&#x60;T1234&#x60;) of the workspace. | |
| **user_id** | **string**| The ID of the user to remove. | |

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

## `adminUsersSetAdmin()`

```php
adminUsersSetAdmin($token, $team_id, $user_id): \OpenAPI\Client\Model\DefaultSuccessTemplate
```



Set an existing guest, regular user, or owner to be an admin user.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AdminUsersApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `admin.users:write`
$team_id = 'team_id_example'; // string | The ID (`T1234`) of the workspace.
$user_id = 'user_id_example'; // string | The ID of the user to designate as an admin.

try {
    $result = $apiInstance->adminUsersSetAdmin($token, $team_id, $user_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AdminUsersApi->adminUsersSetAdmin: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;admin.users:write&#x60; | |
| **team_id** | **string**| The ID (&#x60;T1234&#x60;) of the workspace. | |
| **user_id** | **string**| The ID of the user to designate as an admin. | |

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

## `adminUsersSetExpiration()`

```php
adminUsersSetExpiration($token, $expiration_ts, $team_id, $user_id): \OpenAPI\Client\Model\DefaultSuccessTemplate
```



Set an expiration for a guest user

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AdminUsersApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `admin.users:write`
$expiration_ts = 56; // int | Timestamp when guest account should be disabled.
$team_id = 'team_id_example'; // string | The ID (`T1234`) of the workspace.
$user_id = 'user_id_example'; // string | The ID of the user to set an expiration for.

try {
    $result = $apiInstance->adminUsersSetExpiration($token, $expiration_ts, $team_id, $user_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AdminUsersApi->adminUsersSetExpiration: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;admin.users:write&#x60; | |
| **expiration_ts** | **int**| Timestamp when guest account should be disabled. | |
| **team_id** | **string**| The ID (&#x60;T1234&#x60;) of the workspace. | |
| **user_id** | **string**| The ID of the user to set an expiration for. | |

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

## `adminUsersSetOwner()`

```php
adminUsersSetOwner($token, $team_id, $user_id): \OpenAPI\Client\Model\DefaultSuccessTemplate
```



Set an existing guest, regular user, or admin user to be a workspace owner.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AdminUsersApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `admin.users:write`
$team_id = 'team_id_example'; // string | The ID (`T1234`) of the workspace.
$user_id = 'user_id_example'; // string | Id of the user to promote to owner.

try {
    $result = $apiInstance->adminUsersSetOwner($token, $team_id, $user_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AdminUsersApi->adminUsersSetOwner: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;admin.users:write&#x60; | |
| **team_id** | **string**| The ID (&#x60;T1234&#x60;) of the workspace. | |
| **user_id** | **string**| Id of the user to promote to owner. | |

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

## `adminUsersSetRegular()`

```php
adminUsersSetRegular($token, $team_id, $user_id): \OpenAPI\Client\Model\DefaultSuccessTemplate
```



Set an existing guest user, admin user, or owner to be a regular user.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AdminUsersApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `admin.users:write`
$team_id = 'team_id_example'; // string | The ID (`T1234`) of the workspace.
$user_id = 'user_id_example'; // string | The ID of the user to designate as a regular user.

try {
    $result = $apiInstance->adminUsersSetRegular($token, $team_id, $user_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AdminUsersApi->adminUsersSetRegular: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;admin.users:write&#x60; | |
| **team_id** | **string**| The ID (&#x60;T1234&#x60;) of the workspace. | |
| **user_id** | **string**| The ID of the user to designate as a regular user. | |

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
