# OpenAPI\Client\AdminUsergroupsApi

All URIs are relative to https://slack.com/api, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**adminUsergroupsAddChannels()**](AdminUsergroupsApi.md#adminUsergroupsAddChannels) | **POST** /admin.usergroups.addChannels |  |
| [**adminUsergroupsAddTeams()**](AdminUsergroupsApi.md#adminUsergroupsAddTeams) | **POST** /admin.usergroups.addTeams |  |
| [**adminUsergroupsListChannels()**](AdminUsergroupsApi.md#adminUsergroupsListChannels) | **GET** /admin.usergroups.listChannels |  |
| [**adminUsergroupsRemoveChannels()**](AdminUsergroupsApi.md#adminUsergroupsRemoveChannels) | **POST** /admin.usergroups.removeChannels |  |


## `adminUsergroupsAddChannels()`

```php
adminUsergroupsAddChannels($token, $channel_ids, $usergroup_id, $team_id): \OpenAPI\Client\Model\DefaultSuccessTemplate
```



Add one or more default channels to an IDP group.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AdminUsergroupsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `admin.usergroups:write`
$channel_ids = 'channel_ids_example'; // string | Comma separated string of channel IDs.
$usergroup_id = 'usergroup_id_example'; // string | ID of the IDP group to add default channels for.
$team_id = 'team_id_example'; // string | The workspace to add default channels in.

try {
    $result = $apiInstance->adminUsergroupsAddChannels($token, $channel_ids, $usergroup_id, $team_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AdminUsergroupsApi->adminUsergroupsAddChannels: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;admin.usergroups:write&#x60; | |
| **channel_ids** | **string**| Comma separated string of channel IDs. | |
| **usergroup_id** | **string**| ID of the IDP group to add default channels for. | |
| **team_id** | **string**| The workspace to add default channels in. | [optional] |

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

## `adminUsergroupsAddTeams()`

```php
adminUsergroupsAddTeams($token, $team_ids, $usergroup_id, $auto_provision): \OpenAPI\Client\Model\DefaultSuccessTemplate
```



Associate one or more default workspaces with an organization-wide IDP group.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AdminUsergroupsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `admin.teams:write`
$team_ids = 'team_ids_example'; // string | A comma separated list of encoded team (workspace) IDs. Each workspace *MUST* belong to the organization associated with the token.
$usergroup_id = 'usergroup_id_example'; // string | An encoded usergroup (IDP Group) ID.
$auto_provision = True; // bool | When `true`, this method automatically creates new workspace accounts for the IDP group members.

try {
    $result = $apiInstance->adminUsergroupsAddTeams($token, $team_ids, $usergroup_id, $auto_provision);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AdminUsergroupsApi->adminUsergroupsAddTeams: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;admin.teams:write&#x60; | |
| **team_ids** | **string**| A comma separated list of encoded team (workspace) IDs. Each workspace *MUST* belong to the organization associated with the token. | |
| **usergroup_id** | **string**| An encoded usergroup (IDP Group) ID. | |
| **auto_provision** | **bool**| When &#x60;true&#x60;, this method automatically creates new workspace accounts for the IDP group members. | [optional] |

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

## `adminUsergroupsListChannels()`

```php
adminUsergroupsListChannels($token, $usergroup_id, $team_id, $include_num_members): \OpenAPI\Client\Model\DefaultSuccessTemplate
```



List the channels linked to an org-level IDP group (user group).

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AdminUsergroupsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `admin.usergroups:read`
$usergroup_id = 'usergroup_id_example'; // string | ID of the IDP group to list default channels for.
$team_id = 'team_id_example'; // string | ID of the the workspace.
$include_num_members = True; // bool | Flag to include or exclude the count of members per channel.

try {
    $result = $apiInstance->adminUsergroupsListChannels($token, $usergroup_id, $team_id, $include_num_members);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AdminUsergroupsApi->adminUsergroupsListChannels: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;admin.usergroups:read&#x60; | |
| **usergroup_id** | **string**| ID of the IDP group to list default channels for. | |
| **team_id** | **string**| ID of the the workspace. | [optional] |
| **include_num_members** | **bool**| Flag to include or exclude the count of members per channel. | [optional] |

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

## `adminUsergroupsRemoveChannels()`

```php
adminUsergroupsRemoveChannels($token, $channel_ids, $usergroup_id): \OpenAPI\Client\Model\DefaultSuccessTemplate
```



Remove one or more default channels from an org-level IDP group (user group).

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AdminUsergroupsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `admin.usergroups:write`
$channel_ids = 'channel_ids_example'; // string | Comma-separated string of channel IDs
$usergroup_id = 'usergroup_id_example'; // string | ID of the IDP Group

try {
    $result = $apiInstance->adminUsergroupsRemoveChannels($token, $channel_ids, $usergroup_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AdminUsergroupsApi->adminUsergroupsRemoveChannels: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;admin.usergroups:write&#x60; | |
| **channel_ids** | **string**| Comma-separated string of channel IDs | |
| **usergroup_id** | **string**| ID of the IDP Group | |

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
