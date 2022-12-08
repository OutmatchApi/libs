# OpenAPI\Client\AdminTeamsSettingsApi

All URIs are relative to https://slack.com/api, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**adminTeamsSettingsInfo()**](AdminTeamsSettingsApi.md#adminTeamsSettingsInfo) | **GET** /admin.teams.settings.info |  |
| [**adminTeamsSettingsSetDefaultChannels()**](AdminTeamsSettingsApi.md#adminTeamsSettingsSetDefaultChannels) | **POST** /admin.teams.settings.setDefaultChannels |  |
| [**adminTeamsSettingsSetDescription()**](AdminTeamsSettingsApi.md#adminTeamsSettingsSetDescription) | **POST** /admin.teams.settings.setDescription |  |
| [**adminTeamsSettingsSetDiscoverability()**](AdminTeamsSettingsApi.md#adminTeamsSettingsSetDiscoverability) | **POST** /admin.teams.settings.setDiscoverability |  |
| [**adminTeamsSettingsSetIcon()**](AdminTeamsSettingsApi.md#adminTeamsSettingsSetIcon) | **POST** /admin.teams.settings.setIcon |  |
| [**adminTeamsSettingsSetName()**](AdminTeamsSettingsApi.md#adminTeamsSettingsSetName) | **POST** /admin.teams.settings.setName |  |


## `adminTeamsSettingsInfo()`

```php
adminTeamsSettingsInfo($token, $team_id): \OpenAPI\Client\Model\DefaultSuccessTemplate
```



Fetch information about settings in a workspace

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AdminTeamsSettingsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `admin.teams:read`
$team_id = 'team_id_example'; // string

try {
    $result = $apiInstance->adminTeamsSettingsInfo($token, $team_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AdminTeamsSettingsApi->adminTeamsSettingsInfo: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;admin.teams:read&#x60; | |
| **team_id** | **string**|  | |

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

## `adminTeamsSettingsSetDefaultChannels()`

```php
adminTeamsSettingsSetDefaultChannels($channel_ids, $team_id, $token): \OpenAPI\Client\Model\DefaultSuccessTemplate
```



Set the default channels of a workspace.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AdminTeamsSettingsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$channel_ids = 'channel_ids_example'; // string | An array of channel IDs.
$team_id = 'team_id_example'; // string | ID for the workspace to set the default channel for.
$token = 'token_example'; // string | Authentication token. Requires scope: `admin.teams:write`

try {
    $result = $apiInstance->adminTeamsSettingsSetDefaultChannels($channel_ids, $team_id, $token);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AdminTeamsSettingsApi->adminTeamsSettingsSetDefaultChannels: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **channel_ids** | **string**| An array of channel IDs. | |
| **team_id** | **string**| ID for the workspace to set the default channel for. | |
| **token** | **string**| Authentication token. Requires scope: &#x60;admin.teams:write&#x60; | |

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

## `adminTeamsSettingsSetDescription()`

```php
adminTeamsSettingsSetDescription($token, $description, $team_id): \OpenAPI\Client\Model\DefaultSuccessTemplate
```



Set the description of a given workspace.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AdminTeamsSettingsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `admin.teams:write`
$description = 'description_example'; // string | The new description for the workspace.
$team_id = 'team_id_example'; // string | ID for the workspace to set the description for.

try {
    $result = $apiInstance->adminTeamsSettingsSetDescription($token, $description, $team_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AdminTeamsSettingsApi->adminTeamsSettingsSetDescription: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;admin.teams:write&#x60; | |
| **description** | **string**| The new description for the workspace. | |
| **team_id** | **string**| ID for the workspace to set the description for. | |

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

## `adminTeamsSettingsSetDiscoverability()`

```php
adminTeamsSettingsSetDiscoverability($token, $discoverability, $team_id): \OpenAPI\Client\Model\DefaultSuccessTemplate
```



An API method that allows admins to set the discoverability of a given workspace

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AdminTeamsSettingsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `admin.teams:write`
$discoverability = 'discoverability_example'; // string | This workspace's discovery setting. It must be set to one of `open`, `invite_only`, `closed`, or `unlisted`.
$team_id = 'team_id_example'; // string | The ID of the workspace to set discoverability on.

try {
    $result = $apiInstance->adminTeamsSettingsSetDiscoverability($token, $discoverability, $team_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AdminTeamsSettingsApi->adminTeamsSettingsSetDiscoverability: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;admin.teams:write&#x60; | |
| **discoverability** | **string**| This workspace&#39;s discovery setting. It must be set to one of &#x60;open&#x60;, &#x60;invite_only&#x60;, &#x60;closed&#x60;, or &#x60;unlisted&#x60;. | |
| **team_id** | **string**| The ID of the workspace to set discoverability on. | |

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

## `adminTeamsSettingsSetIcon()`

```php
adminTeamsSettingsSetIcon($image_url, $team_id, $token): \OpenAPI\Client\Model\DefaultSuccessTemplate
```



Sets the icon of a workspace.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AdminTeamsSettingsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$image_url = 'image_url_example'; // string | Image URL for the icon
$team_id = 'team_id_example'; // string | ID for the workspace to set the icon for.
$token = 'token_example'; // string | Authentication token. Requires scope: `admin.teams:write`

try {
    $result = $apiInstance->adminTeamsSettingsSetIcon($image_url, $team_id, $token);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AdminTeamsSettingsApi->adminTeamsSettingsSetIcon: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **image_url** | **string**| Image URL for the icon | |
| **team_id** | **string**| ID for the workspace to set the icon for. | |
| **token** | **string**| Authentication token. Requires scope: &#x60;admin.teams:write&#x60; | |

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

## `adminTeamsSettingsSetName()`

```php
adminTeamsSettingsSetName($token, $name, $team_id): \OpenAPI\Client\Model\DefaultSuccessTemplate
```



Set the name of a given workspace.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AdminTeamsSettingsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `admin.teams:write`
$name = 'name_example'; // string | The new name of the workspace.
$team_id = 'team_id_example'; // string | ID for the workspace to set the name for.

try {
    $result = $apiInstance->adminTeamsSettingsSetName($token, $name, $team_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AdminTeamsSettingsApi->adminTeamsSettingsSetName: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;admin.teams:write&#x60; | |
| **name** | **string**| The new name of the workspace. | |
| **team_id** | **string**| ID for the workspace to set the name for. | |

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
