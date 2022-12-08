# OpenAPI\Client\AdminApi

All URIs are relative to https://slack.com/api, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**adminAppsApprove()**](AdminApi.md#adminAppsApprove) | **POST** /admin.apps.approve |  |
| [**adminAppsApprovedList()**](AdminApi.md#adminAppsApprovedList) | **GET** /admin.apps.approved.list |  |
| [**adminAppsRequestsList()**](AdminApi.md#adminAppsRequestsList) | **GET** /admin.apps.requests.list |  |
| [**adminAppsRestrict()**](AdminApi.md#adminAppsRestrict) | **POST** /admin.apps.restrict |  |
| [**adminAppsRestrictedList()**](AdminApi.md#adminAppsRestrictedList) | **GET** /admin.apps.restricted.list |  |
| [**adminConversationsArchive()**](AdminApi.md#adminConversationsArchive) | **POST** /admin.conversations.archive |  |
| [**adminConversationsConvertToPrivate()**](AdminApi.md#adminConversationsConvertToPrivate) | **POST** /admin.conversations.convertToPrivate |  |
| [**adminConversationsCreate()**](AdminApi.md#adminConversationsCreate) | **POST** /admin.conversations.create |  |
| [**adminConversationsDelete()**](AdminApi.md#adminConversationsDelete) | **POST** /admin.conversations.delete |  |
| [**adminConversationsDisconnectShared()**](AdminApi.md#adminConversationsDisconnectShared) | **POST** /admin.conversations.disconnectShared |  |
| [**adminConversationsEkmListOriginalConnectedChannelInfo()**](AdminApi.md#adminConversationsEkmListOriginalConnectedChannelInfo) | **GET** /admin.conversations.ekm.listOriginalConnectedChannelInfo |  |
| [**adminConversationsGetConversationPrefs()**](AdminApi.md#adminConversationsGetConversationPrefs) | **GET** /admin.conversations.getConversationPrefs |  |
| [**adminConversationsGetTeams()**](AdminApi.md#adminConversationsGetTeams) | **GET** /admin.conversations.getTeams |  |
| [**adminConversationsInvite()**](AdminApi.md#adminConversationsInvite) | **POST** /admin.conversations.invite |  |
| [**adminConversationsRename()**](AdminApi.md#adminConversationsRename) | **POST** /admin.conversations.rename |  |
| [**adminConversationsRestrictAccessAddGroup()**](AdminApi.md#adminConversationsRestrictAccessAddGroup) | **POST** /admin.conversations.restrictAccess.addGroup |  |
| [**adminConversationsRestrictAccessListGroups()**](AdminApi.md#adminConversationsRestrictAccessListGroups) | **GET** /admin.conversations.restrictAccess.listGroups |  |
| [**adminConversationsRestrictAccessRemoveGroup()**](AdminApi.md#adminConversationsRestrictAccessRemoveGroup) | **POST** /admin.conversations.restrictAccess.removeGroup |  |
| [**adminConversationsSearch()**](AdminApi.md#adminConversationsSearch) | **GET** /admin.conversations.search |  |
| [**adminConversationsSetConversationPrefs()**](AdminApi.md#adminConversationsSetConversationPrefs) | **POST** /admin.conversations.setConversationPrefs |  |
| [**adminConversationsSetTeams()**](AdminApi.md#adminConversationsSetTeams) | **POST** /admin.conversations.setTeams |  |
| [**adminConversationsUnarchive()**](AdminApi.md#adminConversationsUnarchive) | **POST** /admin.conversations.unarchive |  |
| [**adminEmojiAdd()**](AdminApi.md#adminEmojiAdd) | **POST** /admin.emoji.add |  |
| [**adminEmojiAddAlias()**](AdminApi.md#adminEmojiAddAlias) | **POST** /admin.emoji.addAlias |  |
| [**adminEmojiList()**](AdminApi.md#adminEmojiList) | **GET** /admin.emoji.list |  |
| [**adminEmojiRemove()**](AdminApi.md#adminEmojiRemove) | **POST** /admin.emoji.remove |  |
| [**adminEmojiRename()**](AdminApi.md#adminEmojiRename) | **POST** /admin.emoji.rename |  |
| [**adminInviteRequestsApprove()**](AdminApi.md#adminInviteRequestsApprove) | **POST** /admin.inviteRequests.approve |  |
| [**adminInviteRequestsApprovedList()**](AdminApi.md#adminInviteRequestsApprovedList) | **GET** /admin.inviteRequests.approved.list |  |
| [**adminInviteRequestsDeniedList()**](AdminApi.md#adminInviteRequestsDeniedList) | **GET** /admin.inviteRequests.denied.list |  |
| [**adminInviteRequestsDeny()**](AdminApi.md#adminInviteRequestsDeny) | **POST** /admin.inviteRequests.deny |  |
| [**adminInviteRequestsList()**](AdminApi.md#adminInviteRequestsList) | **GET** /admin.inviteRequests.list |  |
| [**adminTeamsAdminsList()**](AdminApi.md#adminTeamsAdminsList) | **GET** /admin.teams.admins.list |  |
| [**adminTeamsCreate()**](AdminApi.md#adminTeamsCreate) | **POST** /admin.teams.create |  |
| [**adminTeamsList()**](AdminApi.md#adminTeamsList) | **GET** /admin.teams.list |  |
| [**adminTeamsOwnersList()**](AdminApi.md#adminTeamsOwnersList) | **GET** /admin.teams.owners.list |  |
| [**adminTeamsSettingsInfo()**](AdminApi.md#adminTeamsSettingsInfo) | **GET** /admin.teams.settings.info |  |
| [**adminTeamsSettingsSetDefaultChannels()**](AdminApi.md#adminTeamsSettingsSetDefaultChannels) | **POST** /admin.teams.settings.setDefaultChannels |  |
| [**adminTeamsSettingsSetDescription()**](AdminApi.md#adminTeamsSettingsSetDescription) | **POST** /admin.teams.settings.setDescription |  |
| [**adminTeamsSettingsSetDiscoverability()**](AdminApi.md#adminTeamsSettingsSetDiscoverability) | **POST** /admin.teams.settings.setDiscoverability |  |
| [**adminTeamsSettingsSetIcon()**](AdminApi.md#adminTeamsSettingsSetIcon) | **POST** /admin.teams.settings.setIcon |  |
| [**adminTeamsSettingsSetName()**](AdminApi.md#adminTeamsSettingsSetName) | **POST** /admin.teams.settings.setName |  |
| [**adminUsergroupsAddChannels()**](AdminApi.md#adminUsergroupsAddChannels) | **POST** /admin.usergroups.addChannels |  |
| [**adminUsergroupsAddTeams()**](AdminApi.md#adminUsergroupsAddTeams) | **POST** /admin.usergroups.addTeams |  |
| [**adminUsergroupsListChannels()**](AdminApi.md#adminUsergroupsListChannels) | **GET** /admin.usergroups.listChannels |  |
| [**adminUsergroupsRemoveChannels()**](AdminApi.md#adminUsergroupsRemoveChannels) | **POST** /admin.usergroups.removeChannels |  |
| [**adminUsersAssign()**](AdminApi.md#adminUsersAssign) | **POST** /admin.users.assign |  |
| [**adminUsersInvite()**](AdminApi.md#adminUsersInvite) | **POST** /admin.users.invite |  |
| [**adminUsersList()**](AdminApi.md#adminUsersList) | **GET** /admin.users.list |  |
| [**adminUsersRemove()**](AdminApi.md#adminUsersRemove) | **POST** /admin.users.remove |  |
| [**adminUsersSessionInvalidate()**](AdminApi.md#adminUsersSessionInvalidate) | **POST** /admin.users.session.invalidate |  |
| [**adminUsersSessionReset()**](AdminApi.md#adminUsersSessionReset) | **POST** /admin.users.session.reset |  |
| [**adminUsersSetAdmin()**](AdminApi.md#adminUsersSetAdmin) | **POST** /admin.users.setAdmin |  |
| [**adminUsersSetExpiration()**](AdminApi.md#adminUsersSetExpiration) | **POST** /admin.users.setExpiration |  |
| [**adminUsersSetOwner()**](AdminApi.md#adminUsersSetOwner) | **POST** /admin.users.setOwner |  |
| [**adminUsersSetRegular()**](AdminApi.md#adminUsersSetRegular) | **POST** /admin.users.setRegular |  |


## `adminAppsApprove()`

```php
adminAppsApprove($token, $app_id, $request_id, $team_id): \OpenAPI\Client\Model\DefaultSuccessTemplate
```



Approve an app for installation on a workspace.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AdminApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `admin.apps:write`
$app_id = 'app_id_example'; // string | The id of the app to approve.
$request_id = 'request_id_example'; // string | The id of the request to approve.
$team_id = 'team_id_example'; // string

try {
    $result = $apiInstance->adminAppsApprove($token, $app_id, $request_id, $team_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AdminApi->adminAppsApprove: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;admin.apps:write&#x60; | |
| **app_id** | **string**| The id of the app to approve. | [optional] |
| **request_id** | **string**| The id of the request to approve. | [optional] |
| **team_id** | **string**|  | [optional] |

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

## `adminAppsApprovedList()`

```php
adminAppsApprovedList($token, $limit, $cursor, $team_id, $enterprise_id): \OpenAPI\Client\Model\DefaultSuccessTemplate
```



List approved apps for an org or workspace.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AdminApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `admin.apps:read`
$limit = 56; // int | The maximum number of items to return. Must be between 1 - 1000 both inclusive.
$cursor = 'cursor_example'; // string | Set `cursor` to `next_cursor` returned by the previous call to list items in the next page
$team_id = 'team_id_example'; // string
$enterprise_id = 'enterprise_id_example'; // string

try {
    $result = $apiInstance->adminAppsApprovedList($token, $limit, $cursor, $team_id, $enterprise_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AdminApi->adminAppsApprovedList: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;admin.apps:read&#x60; | |
| **limit** | **int**| The maximum number of items to return. Must be between 1 - 1000 both inclusive. | [optional] |
| **cursor** | **string**| Set &#x60;cursor&#x60; to &#x60;next_cursor&#x60; returned by the previous call to list items in the next page | [optional] |
| **team_id** | **string**|  | [optional] |
| **enterprise_id** | **string**|  | [optional] |

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

## `adminAppsRequestsList()`

```php
adminAppsRequestsList($token, $limit, $cursor, $team_id): \OpenAPI\Client\Model\DefaultSuccessTemplate
```



List app requests for a team/workspace.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AdminApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `admin.apps:read`
$limit = 56; // int | The maximum number of items to return. Must be between 1 - 1000 both inclusive.
$cursor = 'cursor_example'; // string | Set `cursor` to `next_cursor` returned by the previous call to list items in the next page
$team_id = 'team_id_example'; // string

try {
    $result = $apiInstance->adminAppsRequestsList($token, $limit, $cursor, $team_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AdminApi->adminAppsRequestsList: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;admin.apps:read&#x60; | |
| **limit** | **int**| The maximum number of items to return. Must be between 1 - 1000 both inclusive. | [optional] |
| **cursor** | **string**| Set &#x60;cursor&#x60; to &#x60;next_cursor&#x60; returned by the previous call to list items in the next page | [optional] |
| **team_id** | **string**|  | [optional] |

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

## `adminAppsRestrict()`

```php
adminAppsRestrict($token, $app_id, $request_id, $team_id): \OpenAPI\Client\Model\DefaultSuccessTemplate
```



Restrict an app for installation on a workspace.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AdminApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `admin.apps:write`
$app_id = 'app_id_example'; // string | The id of the app to restrict.
$request_id = 'request_id_example'; // string | The id of the request to restrict.
$team_id = 'team_id_example'; // string

try {
    $result = $apiInstance->adminAppsRestrict($token, $app_id, $request_id, $team_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AdminApi->adminAppsRestrict: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;admin.apps:write&#x60; | |
| **app_id** | **string**| The id of the app to restrict. | [optional] |
| **request_id** | **string**| The id of the request to restrict. | [optional] |
| **team_id** | **string**|  | [optional] |

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

## `adminAppsRestrictedList()`

```php
adminAppsRestrictedList($token, $limit, $cursor, $team_id, $enterprise_id): \OpenAPI\Client\Model\DefaultSuccessTemplate
```



List restricted apps for an org or workspace.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AdminApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `admin.apps:read`
$limit = 56; // int | The maximum number of items to return. Must be between 1 - 1000 both inclusive.
$cursor = 'cursor_example'; // string | Set `cursor` to `next_cursor` returned by the previous call to list items in the next page
$team_id = 'team_id_example'; // string
$enterprise_id = 'enterprise_id_example'; // string

try {
    $result = $apiInstance->adminAppsRestrictedList($token, $limit, $cursor, $team_id, $enterprise_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AdminApi->adminAppsRestrictedList: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;admin.apps:read&#x60; | |
| **limit** | **int**| The maximum number of items to return. Must be between 1 - 1000 both inclusive. | [optional] |
| **cursor** | **string**| Set &#x60;cursor&#x60; to &#x60;next_cursor&#x60; returned by the previous call to list items in the next page | [optional] |
| **team_id** | **string**|  | [optional] |
| **enterprise_id** | **string**|  | [optional] |

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

## `adminConversationsArchive()`

```php
adminConversationsArchive($token, $channel_id): \OpenAPI\Client\Model\AdminConversationsArchiveSchema
```



Archive a public or private channel.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AdminApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `admin.conversations:write`
$channel_id = 'channel_id_example'; // string | The channel to archive.

try {
    $result = $apiInstance->adminConversationsArchive($token, $channel_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AdminApi->adminConversationsArchive: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;admin.conversations:write&#x60; | |
| **channel_id** | **string**| The channel to archive. | |

### Return type

[**\OpenAPI\Client\Model\AdminConversationsArchiveSchema**](../Model/AdminConversationsArchiveSchema.md)

### Authorization

[slackAuth](../../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: `application/x-www-form-urlencoded`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `adminConversationsConvertToPrivate()`

```php
adminConversationsConvertToPrivate($token, $channel_id): \OpenAPI\Client\Model\AdminConversationsConvertToPrivateSchema
```



Convert a public channel to a private channel.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AdminApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `admin.conversations:write`
$channel_id = 'channel_id_example'; // string | The channel to convert to private.

try {
    $result = $apiInstance->adminConversationsConvertToPrivate($token, $channel_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AdminApi->adminConversationsConvertToPrivate: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;admin.conversations:write&#x60; | |
| **channel_id** | **string**| The channel to convert to private. | |

### Return type

[**\OpenAPI\Client\Model\AdminConversationsConvertToPrivateSchema**](../Model/AdminConversationsConvertToPrivateSchema.md)

### Authorization

[slackAuth](../../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: `application/x-www-form-urlencoded`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `adminConversationsCreate()`

```php
adminConversationsCreate($token, $is_private, $name, $description, $org_wide, $team_id): \OpenAPI\Client\Model\AdminConversationsCreateSchema
```



Create a public or private channel-based conversation.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AdminApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `admin.conversations:write`
$is_private = True; // bool | When `true`, creates a private channel instead of a public channel
$name = 'name_example'; // string | Name of the public or private channel to create.
$description = 'description_example'; // string | Description of the public or private channel to create.
$org_wide = True; // bool | When `true`, the channel will be available org-wide. Note: if the channel is not `org_wide=true`, you must specify a `team_id` for this channel
$team_id = 'team_id_example'; // string | The workspace to create the channel in. Note: this argument is required unless you set `org_wide=true`.

try {
    $result = $apiInstance->adminConversationsCreate($token, $is_private, $name, $description, $org_wide, $team_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AdminApi->adminConversationsCreate: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;admin.conversations:write&#x60; | |
| **is_private** | **bool**| When &#x60;true&#x60;, creates a private channel instead of a public channel | |
| **name** | **string**| Name of the public or private channel to create. | |
| **description** | **string**| Description of the public or private channel to create. | [optional] |
| **org_wide** | **bool**| When &#x60;true&#x60;, the channel will be available org-wide. Note: if the channel is not &#x60;org_wide&#x3D;true&#x60;, you must specify a &#x60;team_id&#x60; for this channel | [optional] |
| **team_id** | **string**| The workspace to create the channel in. Note: this argument is required unless you set &#x60;org_wide&#x3D;true&#x60;. | [optional] |

### Return type

[**\OpenAPI\Client\Model\AdminConversationsCreateSchema**](../Model/AdminConversationsCreateSchema.md)

### Authorization

[slackAuth](../../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: `application/x-www-form-urlencoded`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `adminConversationsDelete()`

```php
adminConversationsDelete($token, $channel_id): \OpenAPI\Client\Model\AdminConversationsDeleteSchema
```



Delete a public or private channel.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AdminApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `admin.conversations:write`
$channel_id = 'channel_id_example'; // string | The channel to delete.

try {
    $result = $apiInstance->adminConversationsDelete($token, $channel_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AdminApi->adminConversationsDelete: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;admin.conversations:write&#x60; | |
| **channel_id** | **string**| The channel to delete. | |

### Return type

[**\OpenAPI\Client\Model\AdminConversationsDeleteSchema**](../Model/AdminConversationsDeleteSchema.md)

### Authorization

[slackAuth](../../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: `application/x-www-form-urlencoded`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `adminConversationsDisconnectShared()`

```php
adminConversationsDisconnectShared($token, $channel_id, $leaving_team_ids): \OpenAPI\Client\Model\AdminConversationsRenameSchema
```



Disconnect a connected channel from one or more workspaces.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AdminApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `admin.conversations:write`
$channel_id = 'channel_id_example'; // string | The channel to be disconnected from some workspaces.
$leaving_team_ids = 'leaving_team_ids_example'; // string | The team to be removed from the channel. Currently only a single team id can be specified.

try {
    $result = $apiInstance->adminConversationsDisconnectShared($token, $channel_id, $leaving_team_ids);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AdminApi->adminConversationsDisconnectShared: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;admin.conversations:write&#x60; | |
| **channel_id** | **string**| The channel to be disconnected from some workspaces. | |
| **leaving_team_ids** | **string**| The team to be removed from the channel. Currently only a single team id can be specified. | [optional] |

### Return type

[**\OpenAPI\Client\Model\AdminConversationsRenameSchema**](../Model/AdminConversationsRenameSchema.md)

### Authorization

[slackAuth](../../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: `application/x-www-form-urlencoded`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `adminConversationsEkmListOriginalConnectedChannelInfo()`

```php
adminConversationsEkmListOriginalConnectedChannelInfo($token, $channel_ids, $team_ids, $limit, $cursor): \OpenAPI\Client\Model\DefaultSuccessTemplate
```



List all disconnected channelsâ€”i.e., channels that were once connected to other workspaces and then disconnectedâ€”and the corresponding original channel IDs for key revocation with EKM.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AdminApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `admin.conversations:read`
$channel_ids = 'channel_ids_example'; // string | A comma-separated list of channels to filter to.
$team_ids = 'team_ids_example'; // string | A comma-separated list of the workspaces to which the channels you would like returned belong.
$limit = 56; // int | The maximum number of items to return. Must be between 1 - 1000 both inclusive.
$cursor = 'cursor_example'; // string | Set `cursor` to `next_cursor` returned by the previous call to list items in the next page.

try {
    $result = $apiInstance->adminConversationsEkmListOriginalConnectedChannelInfo($token, $channel_ids, $team_ids, $limit, $cursor);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AdminApi->adminConversationsEkmListOriginalConnectedChannelInfo: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;admin.conversations:read&#x60; | |
| **channel_ids** | **string**| A comma-separated list of channels to filter to. | [optional] |
| **team_ids** | **string**| A comma-separated list of the workspaces to which the channels you would like returned belong. | [optional] |
| **limit** | **int**| The maximum number of items to return. Must be between 1 - 1000 both inclusive. | [optional] |
| **cursor** | **string**| Set &#x60;cursor&#x60; to &#x60;next_cursor&#x60; returned by the previous call to list items in the next page. | [optional] |

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

## `adminConversationsGetConversationPrefs()`

```php
adminConversationsGetConversationPrefs($token, $channel_id): \OpenAPI\Client\Model\AdminConversationsGetConversationPrefsSchema
```



Get conversation preferences for a public or private channel.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AdminApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `admin.conversations:read`
$channel_id = 'channel_id_example'; // string | The channel to get preferences for.

try {
    $result = $apiInstance->adminConversationsGetConversationPrefs($token, $channel_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AdminApi->adminConversationsGetConversationPrefs: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;admin.conversations:read&#x60; | |
| **channel_id** | **string**| The channel to get preferences for. | |

### Return type

[**\OpenAPI\Client\Model\AdminConversationsGetConversationPrefsSchema**](../Model/AdminConversationsGetConversationPrefsSchema.md)

### Authorization

[slackAuth](../../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `adminConversationsGetTeams()`

```php
adminConversationsGetTeams($token, $channel_id, $cursor, $limit): \OpenAPI\Client\Model\AdminConversationsGetTeamsSchema
```



Get all the workspaces a given public or private channel is connected to within this Enterprise org.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AdminApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `admin.conversations:read`
$channel_id = 'channel_id_example'; // string | The channel to determine connected workspaces within the organization for.
$cursor = 'cursor_example'; // string | Set `cursor` to `next_cursor` returned by the previous call to list items in the next page
$limit = 56; // int | The maximum number of items to return. Must be between 1 - 1000 both inclusive.

try {
    $result = $apiInstance->adminConversationsGetTeams($token, $channel_id, $cursor, $limit);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AdminApi->adminConversationsGetTeams: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;admin.conversations:read&#x60; | |
| **channel_id** | **string**| The channel to determine connected workspaces within the organization for. | |
| **cursor** | **string**| Set &#x60;cursor&#x60; to &#x60;next_cursor&#x60; returned by the previous call to list items in the next page | [optional] |
| **limit** | **int**| The maximum number of items to return. Must be between 1 - 1000 both inclusive. | [optional] |

### Return type

[**\OpenAPI\Client\Model\AdminConversationsGetTeamsSchema**](../Model/AdminConversationsGetTeamsSchema.md)

### Authorization

[slackAuth](../../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `adminConversationsInvite()`

```php
adminConversationsInvite($token, $channel_id, $user_ids): \OpenAPI\Client\Model\AdminConversationsInviteSchema
```



Invite a user to a public or private channel.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AdminApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `admin.conversations:write`
$channel_id = 'channel_id_example'; // string | The channel that the users will be invited to.
$user_ids = 'user_ids_example'; // string | The users to invite.

try {
    $result = $apiInstance->adminConversationsInvite($token, $channel_id, $user_ids);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AdminApi->adminConversationsInvite: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;admin.conversations:write&#x60; | |
| **channel_id** | **string**| The channel that the users will be invited to. | |
| **user_ids** | **string**| The users to invite. | |

### Return type

[**\OpenAPI\Client\Model\AdminConversationsInviteSchema**](../Model/AdminConversationsInviteSchema.md)

### Authorization

[slackAuth](../../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: `application/x-www-form-urlencoded`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `adminConversationsRename()`

```php
adminConversationsRename($token, $channel_id, $name): \OpenAPI\Client\Model\AdminConversationsRenameSchema1
```



Rename a public or private channel.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AdminApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `admin.conversations:write`
$channel_id = 'channel_id_example'; // string | The channel to rename.
$name = 'name_example'; // string

try {
    $result = $apiInstance->adminConversationsRename($token, $channel_id, $name);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AdminApi->adminConversationsRename: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;admin.conversations:write&#x60; | |
| **channel_id** | **string**| The channel to rename. | |
| **name** | **string**|  | |

### Return type

[**\OpenAPI\Client\Model\AdminConversationsRenameSchema1**](../Model/AdminConversationsRenameSchema1.md)

### Authorization

[slackAuth](../../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: `application/x-www-form-urlencoded`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

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


$apiInstance = new OpenAPI\Client\Api\AdminApi(
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
    echo 'Exception when calling AdminApi->adminConversationsRestrictAccessAddGroup: ', $e->getMessage(), PHP_EOL;
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


$apiInstance = new OpenAPI\Client\Api\AdminApi(
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
    echo 'Exception when calling AdminApi->adminConversationsRestrictAccessListGroups: ', $e->getMessage(), PHP_EOL;
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


$apiInstance = new OpenAPI\Client\Api\AdminApi(
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
    echo 'Exception when calling AdminApi->adminConversationsRestrictAccessRemoveGroup: ', $e->getMessage(), PHP_EOL;
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

## `adminConversationsSearch()`

```php
adminConversationsSearch($token, $team_ids, $query, $limit, $cursor, $search_channel_types, $sort, $sort_dir): \OpenAPI\Client\Model\AdminConversationsSearchSchema
```



Search for public or private channels in an Enterprise organization.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AdminApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `admin.conversations:read`
$team_ids = 'team_ids_example'; // string | Comma separated string of team IDs, signifying the workspaces to search through.
$query = 'query_example'; // string | Name of the the channel to query by.
$limit = 56; // int | Maximum number of items to be returned. Must be between 1 - 20 both inclusive. Default is 10.
$cursor = 'cursor_example'; // string | Set `cursor` to `next_cursor` returned by the previous call to list items in the next page.
$search_channel_types = 'search_channel_types_example'; // string | The type of channel to include or exclude in the search. For example `private` will search private channels, while `private_exclude` will exclude them. For a full list of types, check the [Types section](#types).
$sort = 'sort_example'; // string | Possible values are `relevant` (search ranking based on what we think is closest), `name` (alphabetical), `member_count` (number of users in the channel), and `created` (date channel was created). You can optionally pair this with the `sort_dir` arg to change how it is sorted
$sort_dir = 'sort_dir_example'; // string | Sort direction. Possible values are `asc` for ascending order like (1, 2, 3) or (a, b, c), and `desc` for descending order like (3, 2, 1) or (c, b, a)

try {
    $result = $apiInstance->adminConversationsSearch($token, $team_ids, $query, $limit, $cursor, $search_channel_types, $sort, $sort_dir);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AdminApi->adminConversationsSearch: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;admin.conversations:read&#x60; | |
| **team_ids** | **string**| Comma separated string of team IDs, signifying the workspaces to search through. | [optional] |
| **query** | **string**| Name of the the channel to query by. | [optional] |
| **limit** | **int**| Maximum number of items to be returned. Must be between 1 - 20 both inclusive. Default is 10. | [optional] |
| **cursor** | **string**| Set &#x60;cursor&#x60; to &#x60;next_cursor&#x60; returned by the previous call to list items in the next page. | [optional] |
| **search_channel_types** | **string**| The type of channel to include or exclude in the search. For example &#x60;private&#x60; will search private channels, while &#x60;private_exclude&#x60; will exclude them. For a full list of types, check the [Types section](#types). | [optional] |
| **sort** | **string**| Possible values are &#x60;relevant&#x60; (search ranking based on what we think is closest), &#x60;name&#x60; (alphabetical), &#x60;member_count&#x60; (number of users in the channel), and &#x60;created&#x60; (date channel was created). You can optionally pair this with the &#x60;sort_dir&#x60; arg to change how it is sorted | [optional] |
| **sort_dir** | **string**| Sort direction. Possible values are &#x60;asc&#x60; for ascending order like (1, 2, 3) or (a, b, c), and &#x60;desc&#x60; for descending order like (3, 2, 1) or (c, b, a) | [optional] |

### Return type

[**\OpenAPI\Client\Model\AdminConversationsSearchSchema**](../Model/AdminConversationsSearchSchema.md)

### Authorization

[slackAuth](../../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `adminConversationsSetConversationPrefs()`

```php
adminConversationsSetConversationPrefs($token, $channel_id, $prefs): \OpenAPI\Client\Model\AdminConversationsSetConversationPrefsSchema
```



Set the posting permissions for a public or private channel.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AdminApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `admin.conversations:write`
$channel_id = 'channel_id_example'; // string | The channel to set the prefs for
$prefs = 'prefs_example'; // string | The prefs for this channel in a stringified JSON format.

try {
    $result = $apiInstance->adminConversationsSetConversationPrefs($token, $channel_id, $prefs);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AdminApi->adminConversationsSetConversationPrefs: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;admin.conversations:write&#x60; | |
| **channel_id** | **string**| The channel to set the prefs for | |
| **prefs** | **string**| The prefs for this channel in a stringified JSON format. | |

### Return type

[**\OpenAPI\Client\Model\AdminConversationsSetConversationPrefsSchema**](../Model/AdminConversationsSetConversationPrefsSchema.md)

### Authorization

[slackAuth](../../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: `application/x-www-form-urlencoded`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `adminConversationsSetTeams()`

```php
adminConversationsSetTeams($token, $channel_id, $org_channel, $target_team_ids, $team_id): \OpenAPI\Client\Model\DefaultSuccessTemplate
```



Set the workspaces in an Enterprise grid org that connect to a public or private channel.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AdminApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `admin.conversations:write`
$channel_id = 'channel_id_example'; // string | The encoded `channel_id` to add or remove to workspaces.
$org_channel = True; // bool | True if channel has to be converted to an org channel
$target_team_ids = 'target_team_ids_example'; // string | A comma-separated list of workspaces to which the channel should be shared. Not required if the channel is being shared org-wide.
$team_id = 'team_id_example'; // string | The workspace to which the channel belongs. Omit this argument if the channel is a cross-workspace shared channel.

try {
    $result = $apiInstance->adminConversationsSetTeams($token, $channel_id, $org_channel, $target_team_ids, $team_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AdminApi->adminConversationsSetTeams: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;admin.conversations:write&#x60; | |
| **channel_id** | **string**| The encoded &#x60;channel_id&#x60; to add or remove to workspaces. | |
| **org_channel** | **bool**| True if channel has to be converted to an org channel | [optional] |
| **target_team_ids** | **string**| A comma-separated list of workspaces to which the channel should be shared. Not required if the channel is being shared org-wide. | [optional] |
| **team_id** | **string**| The workspace to which the channel belongs. Omit this argument if the channel is a cross-workspace shared channel. | [optional] |

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

## `adminConversationsUnarchive()`

```php
adminConversationsUnarchive($token, $channel_id): \OpenAPI\Client\Model\AdminConversationsUnarchiveSchema
```



Unarchive a public or private channel.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AdminApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `admin.conversations:write`
$channel_id = 'channel_id_example'; // string | The channel to unarchive.

try {
    $result = $apiInstance->adminConversationsUnarchive($token, $channel_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AdminApi->adminConversationsUnarchive: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;admin.conversations:write&#x60; | |
| **channel_id** | **string**| The channel to unarchive. | |

### Return type

[**\OpenAPI\Client\Model\AdminConversationsUnarchiveSchema**](../Model/AdminConversationsUnarchiveSchema.md)

### Authorization

[slackAuth](../../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: `application/x-www-form-urlencoded`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `adminEmojiAdd()`

```php
adminEmojiAdd($name, $token, $url): \OpenAPI\Client\Model\DefaultSuccessTemplate
```



Add an emoji.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AdminApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$name = 'name_example'; // string | The name of the emoji to be removed. Colons (`:myemoji:`) around the value are not required, although they may be included.
$token = 'token_example'; // string | Authentication token. Requires scope: `admin.teams:write`
$url = 'url_example'; // string | The URL of a file to use as an image for the emoji. Square images under 128KB and with transparent backgrounds work best.

try {
    $result = $apiInstance->adminEmojiAdd($name, $token, $url);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AdminApi->adminEmojiAdd: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **name** | **string**| The name of the emoji to be removed. Colons (&#x60;:myemoji:&#x60;) around the value are not required, although they may be included. | |
| **token** | **string**| Authentication token. Requires scope: &#x60;admin.teams:write&#x60; | |
| **url** | **string**| The URL of a file to use as an image for the emoji. Square images under 128KB and with transparent backgrounds work best. | |

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

## `adminEmojiAddAlias()`

```php
adminEmojiAddAlias($alias_for, $name, $token): \OpenAPI\Client\Model\DefaultSuccessTemplate
```



Add an emoji alias.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AdminApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$alias_for = 'alias_for_example'; // string | The alias of the emoji.
$name = 'name_example'; // string | The name of the emoji to be aliased. Colons (`:myemoji:`) around the value are not required, although they may be included.
$token = 'token_example'; // string | Authentication token. Requires scope: `admin.teams:write`

try {
    $result = $apiInstance->adminEmojiAddAlias($alias_for, $name, $token);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AdminApi->adminEmojiAddAlias: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **alias_for** | **string**| The alias of the emoji. | |
| **name** | **string**| The name of the emoji to be aliased. Colons (&#x60;:myemoji:&#x60;) around the value are not required, although they may be included. | |
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

## `adminEmojiList()`

```php
adminEmojiList($token, $cursor, $limit): \OpenAPI\Client\Model\DefaultSuccessTemplate
```



List emoji for an Enterprise Grid organization.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AdminApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `admin.teams:read`
$cursor = 'cursor_example'; // string | Set `cursor` to `next_cursor` returned by the previous call to list items in the next page
$limit = 56; // int | The maximum number of items to return. Must be between 1 - 1000 both inclusive.

try {
    $result = $apiInstance->adminEmojiList($token, $cursor, $limit);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AdminApi->adminEmojiList: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;admin.teams:read&#x60; | |
| **cursor** | **string**| Set &#x60;cursor&#x60; to &#x60;next_cursor&#x60; returned by the previous call to list items in the next page | [optional] |
| **limit** | **int**| The maximum number of items to return. Must be between 1 - 1000 both inclusive. | [optional] |

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

## `adminEmojiRemove()`

```php
adminEmojiRemove($name, $token): \OpenAPI\Client\Model\DefaultSuccessTemplate
```



Remove an emoji across an Enterprise Grid organization

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AdminApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$name = 'name_example'; // string | The name of the emoji to be removed. Colons (`:myemoji:`) around the value are not required, although they may be included.
$token = 'token_example'; // string | Authentication token. Requires scope: `admin.teams:write`

try {
    $result = $apiInstance->adminEmojiRemove($name, $token);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AdminApi->adminEmojiRemove: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **name** | **string**| The name of the emoji to be removed. Colons (&#x60;:myemoji:&#x60;) around the value are not required, although they may be included. | |
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

## `adminEmojiRename()`

```php
adminEmojiRename($name, $new_name, $token): \OpenAPI\Client\Model\DefaultSuccessTemplate
```



Rename an emoji.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AdminApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$name = 'name_example'; // string | The name of the emoji to be renamed. Colons (`:myemoji:`) around the value are not required, although they may be included.
$new_name = 'new_name_example'; // string | The new name of the emoji.
$token = 'token_example'; // string | Authentication token. Requires scope: `admin.teams:write`

try {
    $result = $apiInstance->adminEmojiRename($name, $new_name, $token);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AdminApi->adminEmojiRename: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **name** | **string**| The name of the emoji to be renamed. Colons (&#x60;:myemoji:&#x60;) around the value are not required, although they may be included. | |
| **new_name** | **string**| The new name of the emoji. | |
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

## `adminInviteRequestsApprove()`

```php
adminInviteRequestsApprove($token, $admin_invite_requests_approve_request): \OpenAPI\Client\Model\DefaultSuccessTemplate
```



Approve a workspace invite request.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AdminApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `admin.invites:write`
$admin_invite_requests_approve_request = new \OpenAPI\Client\Model\AdminInviteRequestsApproveRequest(); // \OpenAPI\Client\Model\AdminInviteRequestsApproveRequest

try {
    $result = $apiInstance->adminInviteRequestsApprove($token, $admin_invite_requests_approve_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AdminApi->adminInviteRequestsApprove: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;admin.invites:write&#x60; | |
| **admin_invite_requests_approve_request** | [**\OpenAPI\Client\Model\AdminInviteRequestsApproveRequest**](../Model/AdminInviteRequestsApproveRequest.md)|  | [optional] |

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

## `adminInviteRequestsApprovedList()`

```php
adminInviteRequestsApprovedList($token, $team_id, $cursor, $limit): \OpenAPI\Client\Model\DefaultSuccessTemplate
```



List all approved workspace invite requests.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AdminApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `admin.invites:read`
$team_id = 'team_id_example'; // string | ID for the workspace where the invite requests were made.
$cursor = 'cursor_example'; // string | Value of the `next_cursor` field sent as part of the previous API response
$limit = 56; // int | The number of results that will be returned by the API on each invocation. Must be between 1 - 1000, both inclusive

try {
    $result = $apiInstance->adminInviteRequestsApprovedList($token, $team_id, $cursor, $limit);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AdminApi->adminInviteRequestsApprovedList: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;admin.invites:read&#x60; | |
| **team_id** | **string**| ID for the workspace where the invite requests were made. | [optional] |
| **cursor** | **string**| Value of the &#x60;next_cursor&#x60; field sent as part of the previous API response | [optional] |
| **limit** | **int**| The number of results that will be returned by the API on each invocation. Must be between 1 - 1000, both inclusive | [optional] |

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

## `adminInviteRequestsDeniedList()`

```php
adminInviteRequestsDeniedList($token, $team_id, $cursor, $limit): \OpenAPI\Client\Model\DefaultSuccessTemplate
```



List all denied workspace invite requests.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AdminApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `admin.invites:read`
$team_id = 'team_id_example'; // string | ID for the workspace where the invite requests were made.
$cursor = 'cursor_example'; // string | Value of the `next_cursor` field sent as part of the previous api response
$limit = 56; // int | The number of results that will be returned by the API on each invocation. Must be between 1 - 1000 both inclusive

try {
    $result = $apiInstance->adminInviteRequestsDeniedList($token, $team_id, $cursor, $limit);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AdminApi->adminInviteRequestsDeniedList: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;admin.invites:read&#x60; | |
| **team_id** | **string**| ID for the workspace where the invite requests were made. | [optional] |
| **cursor** | **string**| Value of the &#x60;next_cursor&#x60; field sent as part of the previous api response | [optional] |
| **limit** | **int**| The number of results that will be returned by the API on each invocation. Must be between 1 - 1000 both inclusive | [optional] |

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

## `adminInviteRequestsDeny()`

```php
adminInviteRequestsDeny($token, $admin_invite_requests_approve_request): \OpenAPI\Client\Model\DefaultSuccessTemplate
```



Deny a workspace invite request.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AdminApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `admin.invites:write`
$admin_invite_requests_approve_request = new \OpenAPI\Client\Model\AdminInviteRequestsApproveRequest(); // \OpenAPI\Client\Model\AdminInviteRequestsApproveRequest

try {
    $result = $apiInstance->adminInviteRequestsDeny($token, $admin_invite_requests_approve_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AdminApi->adminInviteRequestsDeny: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;admin.invites:write&#x60; | |
| **admin_invite_requests_approve_request** | [**\OpenAPI\Client\Model\AdminInviteRequestsApproveRequest**](../Model/AdminInviteRequestsApproveRequest.md)|  | [optional] |

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

## `adminInviteRequestsList()`

```php
adminInviteRequestsList($token, $team_id, $cursor, $limit): \OpenAPI\Client\Model\DefaultSuccessTemplate
```



List all pending workspace invite requests.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AdminApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `admin.invites:read`
$team_id = 'team_id_example'; // string | ID for the workspace where the invite requests were made.
$cursor = 'cursor_example'; // string | Value of the `next_cursor` field sent as part of the previous API response
$limit = 56; // int | The number of results that will be returned by the API on each invocation. Must be between 1 - 1000, both inclusive

try {
    $result = $apiInstance->adminInviteRequestsList($token, $team_id, $cursor, $limit);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AdminApi->adminInviteRequestsList: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;admin.invites:read&#x60; | |
| **team_id** | **string**| ID for the workspace where the invite requests were made. | [optional] |
| **cursor** | **string**| Value of the &#x60;next_cursor&#x60; field sent as part of the previous API response | [optional] |
| **limit** | **int**| The number of results that will be returned by the API on each invocation. Must be between 1 - 1000, both inclusive | [optional] |

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

## `adminTeamsAdminsList()`

```php
adminTeamsAdminsList($token, $team_id, $limit, $cursor): \OpenAPI\Client\Model\DefaultSuccessTemplate
```



List all of the admins on a given workspace.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AdminApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `admin.teams:read`
$team_id = 'team_id_example'; // string
$limit = 56; // int | The maximum number of items to return.
$cursor = 'cursor_example'; // string | Set `cursor` to `next_cursor` returned by the previous call to list items in the next page.

try {
    $result = $apiInstance->adminTeamsAdminsList($token, $team_id, $limit, $cursor);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AdminApi->adminTeamsAdminsList: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;admin.teams:read&#x60; | |
| **team_id** | **string**|  | |
| **limit** | **int**| The maximum number of items to return. | [optional] |
| **cursor** | **string**| Set &#x60;cursor&#x60; to &#x60;next_cursor&#x60; returned by the previous call to list items in the next page. | [optional] |

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

## `adminTeamsCreate()`

```php
adminTeamsCreate($token, $team_domain, $team_name, $team_description, $team_discoverability): \OpenAPI\Client\Model\DefaultSuccessTemplate
```



Create an Enterprise team.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AdminApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `admin.teams:write`
$team_domain = 'team_domain_example'; // string | Team domain (for example, slacksoftballteam).
$team_name = 'team_name_example'; // string | Team name (for example, Slack Softball Team).
$team_description = 'team_description_example'; // string | Description for the team.
$team_discoverability = 'team_discoverability_example'; // string | Who can join the team. A team's discoverability can be `open`, `closed`, `invite_only`, or `unlisted`.

try {
    $result = $apiInstance->adminTeamsCreate($token, $team_domain, $team_name, $team_description, $team_discoverability);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AdminApi->adminTeamsCreate: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;admin.teams:write&#x60; | |
| **team_domain** | **string**| Team domain (for example, slacksoftballteam). | |
| **team_name** | **string**| Team name (for example, Slack Softball Team). | |
| **team_description** | **string**| Description for the team. | [optional] |
| **team_discoverability** | **string**| Who can join the team. A team&#39;s discoverability can be &#x60;open&#x60;, &#x60;closed&#x60;, &#x60;invite_only&#x60;, or &#x60;unlisted&#x60;. | [optional] |

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

## `adminTeamsList()`

```php
adminTeamsList($token, $limit, $cursor): \OpenAPI\Client\Model\DefaultSuccessTemplate
```



List all teams on an Enterprise organization

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AdminApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `admin.teams:read`
$limit = 56; // int | The maximum number of items to return. Must be between 1 - 100 both inclusive.
$cursor = 'cursor_example'; // string | Set `cursor` to `next_cursor` returned by the previous call to list items in the next page.

try {
    $result = $apiInstance->adminTeamsList($token, $limit, $cursor);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AdminApi->adminTeamsList: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;admin.teams:read&#x60; | |
| **limit** | **int**| The maximum number of items to return. Must be between 1 - 100 both inclusive. | [optional] |
| **cursor** | **string**| Set &#x60;cursor&#x60; to &#x60;next_cursor&#x60; returned by the previous call to list items in the next page. | [optional] |

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

## `adminTeamsOwnersList()`

```php
adminTeamsOwnersList($token, $team_id, $limit, $cursor): \OpenAPI\Client\Model\DefaultSuccessTemplate
```



List all of the owners on a given workspace.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AdminApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `admin.teams:read`
$team_id = 'team_id_example'; // string
$limit = 56; // int | The maximum number of items to return. Must be between 1 - 1000 both inclusive.
$cursor = 'cursor_example'; // string | Set `cursor` to `next_cursor` returned by the previous call to list items in the next page.

try {
    $result = $apiInstance->adminTeamsOwnersList($token, $team_id, $limit, $cursor);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AdminApi->adminTeamsOwnersList: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;admin.teams:read&#x60; | |
| **team_id** | **string**|  | |
| **limit** | **int**| The maximum number of items to return. Must be between 1 - 1000 both inclusive. | [optional] |
| **cursor** | **string**| Set &#x60;cursor&#x60; to &#x60;next_cursor&#x60; returned by the previous call to list items in the next page. | [optional] |

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


$apiInstance = new OpenAPI\Client\Api\AdminApi(
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
    echo 'Exception when calling AdminApi->adminTeamsSettingsInfo: ', $e->getMessage(), PHP_EOL;
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


$apiInstance = new OpenAPI\Client\Api\AdminApi(
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
    echo 'Exception when calling AdminApi->adminTeamsSettingsSetDefaultChannels: ', $e->getMessage(), PHP_EOL;
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


$apiInstance = new OpenAPI\Client\Api\AdminApi(
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
    echo 'Exception when calling AdminApi->adminTeamsSettingsSetDescription: ', $e->getMessage(), PHP_EOL;
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


$apiInstance = new OpenAPI\Client\Api\AdminApi(
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
    echo 'Exception when calling AdminApi->adminTeamsSettingsSetDiscoverability: ', $e->getMessage(), PHP_EOL;
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


$apiInstance = new OpenAPI\Client\Api\AdminApi(
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
    echo 'Exception when calling AdminApi->adminTeamsSettingsSetIcon: ', $e->getMessage(), PHP_EOL;
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


$apiInstance = new OpenAPI\Client\Api\AdminApi(
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
    echo 'Exception when calling AdminApi->adminTeamsSettingsSetName: ', $e->getMessage(), PHP_EOL;
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


$apiInstance = new OpenAPI\Client\Api\AdminApi(
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
    echo 'Exception when calling AdminApi->adminUsergroupsAddChannels: ', $e->getMessage(), PHP_EOL;
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


$apiInstance = new OpenAPI\Client\Api\AdminApi(
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
    echo 'Exception when calling AdminApi->adminUsergroupsAddTeams: ', $e->getMessage(), PHP_EOL;
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


$apiInstance = new OpenAPI\Client\Api\AdminApi(
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
    echo 'Exception when calling AdminApi->adminUsergroupsListChannels: ', $e->getMessage(), PHP_EOL;
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


$apiInstance = new OpenAPI\Client\Api\AdminApi(
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
    echo 'Exception when calling AdminApi->adminUsergroupsRemoveChannels: ', $e->getMessage(), PHP_EOL;
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


$apiInstance = new OpenAPI\Client\Api\AdminApi(
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
    echo 'Exception when calling AdminApi->adminUsersAssign: ', $e->getMessage(), PHP_EOL;
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


$apiInstance = new OpenAPI\Client\Api\AdminApi(
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
    echo 'Exception when calling AdminApi->adminUsersInvite: ', $e->getMessage(), PHP_EOL;
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


$apiInstance = new OpenAPI\Client\Api\AdminApi(
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
    echo 'Exception when calling AdminApi->adminUsersList: ', $e->getMessage(), PHP_EOL;
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


$apiInstance = new OpenAPI\Client\Api\AdminApi(
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
    echo 'Exception when calling AdminApi->adminUsersRemove: ', $e->getMessage(), PHP_EOL;
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


$apiInstance = new OpenAPI\Client\Api\AdminApi(
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
    echo 'Exception when calling AdminApi->adminUsersSessionInvalidate: ', $e->getMessage(), PHP_EOL;
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


$apiInstance = new OpenAPI\Client\Api\AdminApi(
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
    echo 'Exception when calling AdminApi->adminUsersSessionReset: ', $e->getMessage(), PHP_EOL;
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


$apiInstance = new OpenAPI\Client\Api\AdminApi(
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
    echo 'Exception when calling AdminApi->adminUsersSetAdmin: ', $e->getMessage(), PHP_EOL;
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


$apiInstance = new OpenAPI\Client\Api\AdminApi(
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
    echo 'Exception when calling AdminApi->adminUsersSetExpiration: ', $e->getMessage(), PHP_EOL;
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


$apiInstance = new OpenAPI\Client\Api\AdminApi(
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
    echo 'Exception when calling AdminApi->adminUsersSetOwner: ', $e->getMessage(), PHP_EOL;
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


$apiInstance = new OpenAPI\Client\Api\AdminApi(
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
    echo 'Exception when calling AdminApi->adminUsersSetRegular: ', $e->getMessage(), PHP_EOL;
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
