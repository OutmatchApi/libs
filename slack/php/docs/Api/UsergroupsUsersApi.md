# OpenAPI\Client\UsergroupsUsersApi

All URIs are relative to https://slack.com/api, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**usergroupsUsersList()**](UsergroupsUsersApi.md#usergroupsUsersList) | **GET** /usergroups.users.list |  |
| [**usergroupsUsersUpdate()**](UsergroupsUsersApi.md#usergroupsUsersUpdate) | **POST** /usergroups.users.update |  |


## `usergroupsUsersList()`

```php
usergroupsUsersList($token, $usergroup, $include_disabled): \OpenAPI\Client\Model\UsergroupsUsersListSchema
```



List all users in a User Group

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\UsergroupsUsersApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `usergroups:read`
$usergroup = 'usergroup_example'; // string | The encoded ID of the User Group to update.
$include_disabled = True; // bool | Allow results that involve disabled User Groups.

try {
    $result = $apiInstance->usergroupsUsersList($token, $usergroup, $include_disabled);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling UsergroupsUsersApi->usergroupsUsersList: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;usergroups:read&#x60; | |
| **usergroup** | **string**| The encoded ID of the User Group to update. | |
| **include_disabled** | **bool**| Allow results that involve disabled User Groups. | [optional] |

### Return type

[**\OpenAPI\Client\Model\UsergroupsUsersListSchema**](../Model/UsergroupsUsersListSchema.md)

### Authorization

[slackAuth](../../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `usergroupsUsersUpdate()`

```php
usergroupsUsersUpdate($token, $usergroup, $users, $include_count): \OpenAPI\Client\Model\UsergroupsUsersUpdateSchema
```



Update the list of users for a User Group

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\UsergroupsUsersApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `usergroups:write`
$usergroup = 'usergroup_example'; // string | The encoded ID of the User Group to update.
$users = 'users_example'; // string | A comma separated string of encoded user IDs that represent the entire list of users for the User Group.
$include_count = True; // bool | Include the number of users in the User Group.

try {
    $result = $apiInstance->usergroupsUsersUpdate($token, $usergroup, $users, $include_count);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling UsergroupsUsersApi->usergroupsUsersUpdate: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;usergroups:write&#x60; | |
| **usergroup** | **string**| The encoded ID of the User Group to update. | |
| **users** | **string**| A comma separated string of encoded user IDs that represent the entire list of users for the User Group. | |
| **include_count** | **bool**| Include the number of users in the User Group. | [optional] |

### Return type

[**\OpenAPI\Client\Model\UsergroupsUsersUpdateSchema**](../Model/UsergroupsUsersUpdateSchema.md)

### Authorization

[slackAuth](../../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: `application/x-www-form-urlencoded`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
