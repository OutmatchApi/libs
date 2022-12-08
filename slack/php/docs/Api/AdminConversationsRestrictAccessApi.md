# OpenAPI\Client\AdminConversationsRestrictAccessApi

All URIs are relative to https://slack.com/api, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**adminConversationsRestrictAccessAddGroup()**](AdminConversationsRestrictAccessApi.md#adminConversationsRestrictAccessAddGroup) | **POST** /admin.conversations.restrictAccess.addGroup |  |
| [**adminConversationsRestrictAccessListGroups()**](AdminConversationsRestrictAccessApi.md#adminConversationsRestrictAccessListGroups) | **GET** /admin.conversations.restrictAccess.listGroups |  |
| [**adminConversationsRestrictAccessRemoveGroup()**](AdminConversationsRestrictAccessApi.md#adminConversationsRestrictAccessRemoveGroup) | **POST** /admin.conversations.restrictAccess.removeGroup |  |


## `adminConversationsRestrictAccessAddGroup()`

```php
adminConversationsRestrictAccessAddGroup($channel_id, $group_id, $token, $team_id): \OpenAPI\Client\Model\DefaultSuccessTemplate
```



Add an allowlist of IDP groups for accessing a channel

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AdminConversationsRestrictAccessApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$channel_id = 'channel_id_example'; // string | The channel to link this group to.
$group_id = 'group_id_example'; // string | The [IDP Group](https://slack.com/help/articles/115001435788-Connect-identity-provider-groups-to-your-Enterprise-Grid-org) ID to be an allowlist for the private channel.
$token = 'token_example'; // string | Authentication token. Requires scope: `admin.conversations:write`
$team_id = 'team_id_example'; // string | The workspace where the channel exists. This argument is required for channels only tied to one workspace, and optional for channels that are shared across an organization.

try {
    $result = $apiInstance->adminConversationsRestrictAccessAddGroup($channel_id, $group_id, $token, $team_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AdminConversationsRestrictAccessApi->adminConversationsRestrictAccessAddGroup: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **channel_id** | **string**| The channel to link this group to. | |
| **group_id** | **string**| The [IDP Group](https://slack.com/help/articles/115001435788-Connect-identity-provider-groups-to-your-Enterprise-Grid-org) ID to be an allowlist for the private channel. | |
| **token** | **string**| Authentication token. Requires scope: &#x60;admin.conversations:write&#x60; | |
| **team_id** | **string**| The workspace where the channel exists. This argument is required for channels only tied to one workspace, and optional for channels that are shared across an organization. | [optional] |

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

## `adminConversationsRestrictAccessListGroups()`

```php
adminConversationsRestrictAccessListGroups($token, $channel_id, $team_id): \OpenAPI\Client\Model\DefaultSuccessTemplate
```



List all IDP Groups linked to a channel

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AdminConversationsRestrictAccessApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `admin.conversations:read`
$channel_id = 'channel_id_example'; // string
$team_id = 'team_id_example'; // string | The workspace where the channel exists. This argument is required for channels only tied to one workspace, and optional for channels that are shared across an organization.

try {
    $result = $apiInstance->adminConversationsRestrictAccessListGroups($token, $channel_id, $team_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AdminConversationsRestrictAccessApi->adminConversationsRestrictAccessListGroups: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;admin.conversations:read&#x60; | |
| **channel_id** | **string**|  | |
| **team_id** | **string**| The workspace where the channel exists. This argument is required for channels only tied to one workspace, and optional for channels that are shared across an organization. | [optional] |

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

## `adminConversationsRestrictAccessRemoveGroup()`

```php
adminConversationsRestrictAccessRemoveGroup($channel_id, $group_id, $team_id, $token): \OpenAPI\Client\Model\DefaultSuccessTemplate
```



Remove a linked IDP group linked from a private channel

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AdminConversationsRestrictAccessApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$channel_id = 'channel_id_example'; // string | The channel to remove the linked group from.
$group_id = 'group_id_example'; // string | The [IDP Group](https://slack.com/help/articles/115001435788-Connect-identity-provider-groups-to-your-Enterprise-Grid-org) ID to remove from the private channel.
$team_id = 'team_id_example'; // string | The workspace where the channel exists. This argument is required for channels only tied to one workspace, and optional for channels that are shared across an organization.
$token = 'token_example'; // string | Authentication token. Requires scope: `admin.conversations:write`

try {
    $result = $apiInstance->adminConversationsRestrictAccessRemoveGroup($channel_id, $group_id, $team_id, $token);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AdminConversationsRestrictAccessApi->adminConversationsRestrictAccessRemoveGroup: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **channel_id** | **string**| The channel to remove the linked group from. | |
| **group_id** | **string**| The [IDP Group](https://slack.com/help/articles/115001435788-Connect-identity-provider-groups-to-your-Enterprise-Grid-org) ID to remove from the private channel. | |
| **team_id** | **string**| The workspace where the channel exists. This argument is required for channels only tied to one workspace, and optional for channels that are shared across an organization. | |
| **token** | **string**| Authentication token. Requires scope: &#x60;admin.conversations:write&#x60; | |

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
