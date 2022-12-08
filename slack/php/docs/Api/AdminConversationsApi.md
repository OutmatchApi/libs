# OpenAPI\Client\AdminConversationsApi

All URIs are relative to https://slack.com/api, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**adminConversationsArchive()**](AdminConversationsApi.md#adminConversationsArchive) | **POST** /admin.conversations.archive |  |
| [**adminConversationsConvertToPrivate()**](AdminConversationsApi.md#adminConversationsConvertToPrivate) | **POST** /admin.conversations.convertToPrivate |  |
| [**adminConversationsCreate()**](AdminConversationsApi.md#adminConversationsCreate) | **POST** /admin.conversations.create |  |
| [**adminConversationsDelete()**](AdminConversationsApi.md#adminConversationsDelete) | **POST** /admin.conversations.delete |  |
| [**adminConversationsDisconnectShared()**](AdminConversationsApi.md#adminConversationsDisconnectShared) | **POST** /admin.conversations.disconnectShared |  |
| [**adminConversationsGetConversationPrefs()**](AdminConversationsApi.md#adminConversationsGetConversationPrefs) | **GET** /admin.conversations.getConversationPrefs |  |
| [**adminConversationsGetTeams()**](AdminConversationsApi.md#adminConversationsGetTeams) | **GET** /admin.conversations.getTeams |  |
| [**adminConversationsInvite()**](AdminConversationsApi.md#adminConversationsInvite) | **POST** /admin.conversations.invite |  |
| [**adminConversationsRename()**](AdminConversationsApi.md#adminConversationsRename) | **POST** /admin.conversations.rename |  |
| [**adminConversationsSearch()**](AdminConversationsApi.md#adminConversationsSearch) | **GET** /admin.conversations.search |  |
| [**adminConversationsSetConversationPrefs()**](AdminConversationsApi.md#adminConversationsSetConversationPrefs) | **POST** /admin.conversations.setConversationPrefs |  |
| [**adminConversationsSetTeams()**](AdminConversationsApi.md#adminConversationsSetTeams) | **POST** /admin.conversations.setTeams |  |
| [**adminConversationsUnarchive()**](AdminConversationsApi.md#adminConversationsUnarchive) | **POST** /admin.conversations.unarchive |  |


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


$apiInstance = new OpenAPI\Client\Api\AdminConversationsApi(
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
    echo 'Exception when calling AdminConversationsApi->adminConversationsArchive: ', $e->getMessage(), PHP_EOL;
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


$apiInstance = new OpenAPI\Client\Api\AdminConversationsApi(
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
    echo 'Exception when calling AdminConversationsApi->adminConversationsConvertToPrivate: ', $e->getMessage(), PHP_EOL;
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


$apiInstance = new OpenAPI\Client\Api\AdminConversationsApi(
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
    echo 'Exception when calling AdminConversationsApi->adminConversationsCreate: ', $e->getMessage(), PHP_EOL;
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


$apiInstance = new OpenAPI\Client\Api\AdminConversationsApi(
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
    echo 'Exception when calling AdminConversationsApi->adminConversationsDelete: ', $e->getMessage(), PHP_EOL;
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


$apiInstance = new OpenAPI\Client\Api\AdminConversationsApi(
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
    echo 'Exception when calling AdminConversationsApi->adminConversationsDisconnectShared: ', $e->getMessage(), PHP_EOL;
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


$apiInstance = new OpenAPI\Client\Api\AdminConversationsApi(
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
    echo 'Exception when calling AdminConversationsApi->adminConversationsGetConversationPrefs: ', $e->getMessage(), PHP_EOL;
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


$apiInstance = new OpenAPI\Client\Api\AdminConversationsApi(
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
    echo 'Exception when calling AdminConversationsApi->adminConversationsGetTeams: ', $e->getMessage(), PHP_EOL;
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


$apiInstance = new OpenAPI\Client\Api\AdminConversationsApi(
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
    echo 'Exception when calling AdminConversationsApi->adminConversationsInvite: ', $e->getMessage(), PHP_EOL;
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


$apiInstance = new OpenAPI\Client\Api\AdminConversationsApi(
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
    echo 'Exception when calling AdminConversationsApi->adminConversationsRename: ', $e->getMessage(), PHP_EOL;
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


$apiInstance = new OpenAPI\Client\Api\AdminConversationsApi(
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
    echo 'Exception when calling AdminConversationsApi->adminConversationsSearch: ', $e->getMessage(), PHP_EOL;
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


$apiInstance = new OpenAPI\Client\Api\AdminConversationsApi(
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
    echo 'Exception when calling AdminConversationsApi->adminConversationsSetConversationPrefs: ', $e->getMessage(), PHP_EOL;
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


$apiInstance = new OpenAPI\Client\Api\AdminConversationsApi(
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
    echo 'Exception when calling AdminConversationsApi->adminConversationsSetTeams: ', $e->getMessage(), PHP_EOL;
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


$apiInstance = new OpenAPI\Client\Api\AdminConversationsApi(
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
    echo 'Exception when calling AdminConversationsApi->adminConversationsUnarchive: ', $e->getMessage(), PHP_EOL;
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
