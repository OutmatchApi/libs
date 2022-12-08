# OpenAPI\Client\UsergroupsApi

All URIs are relative to https://slack.com/api, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**usergroupsCreate()**](UsergroupsApi.md#usergroupsCreate) | **POST** /usergroups.create |  |
| [**usergroupsDisable()**](UsergroupsApi.md#usergroupsDisable) | **POST** /usergroups.disable |  |
| [**usergroupsEnable()**](UsergroupsApi.md#usergroupsEnable) | **POST** /usergroups.enable |  |
| [**usergroupsList()**](UsergroupsApi.md#usergroupsList) | **GET** /usergroups.list |  |
| [**usergroupsUpdate()**](UsergroupsApi.md#usergroupsUpdate) | **POST** /usergroups.update |  |
| [**usergroupsUsersList()**](UsergroupsApi.md#usergroupsUsersList) | **GET** /usergroups.users.list |  |
| [**usergroupsUsersUpdate()**](UsergroupsApi.md#usergroupsUsersUpdate) | **POST** /usergroups.users.update |  |


## `usergroupsCreate()`

```php
usergroupsCreate($token, $name, $channels, $description, $handle, $include_count): \OpenAPI\Client\Model\UsergroupsCreateSchema
```



Create a User Group

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\UsergroupsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `usergroups:write`
$name = 'name_example'; // string | A name for the User Group. Must be unique among User Groups.
$channels = 'channels_example'; // string | A comma separated string of encoded channel IDs for which the User Group uses as a default.
$description = 'description_example'; // string | A short description of the User Group.
$handle = 'handle_example'; // string | A mention handle. Must be unique among channels, users and User Groups.
$include_count = True; // bool | Include the number of users in each User Group.

try {
    $result = $apiInstance->usergroupsCreate($token, $name, $channels, $description, $handle, $include_count);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling UsergroupsApi->usergroupsCreate: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;usergroups:write&#x60; | |
| **name** | **string**| A name for the User Group. Must be unique among User Groups. | |
| **channels** | **string**| A comma separated string of encoded channel IDs for which the User Group uses as a default. | [optional] |
| **description** | **string**| A short description of the User Group. | [optional] |
| **handle** | **string**| A mention handle. Must be unique among channels, users and User Groups. | [optional] |
| **include_count** | **bool**| Include the number of users in each User Group. | [optional] |

### Return type

[**\OpenAPI\Client\Model\UsergroupsCreateSchema**](../Model/UsergroupsCreateSchema.md)

### Authorization

[slackAuth](../../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: `application/x-www-form-urlencoded`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `usergroupsDisable()`

```php
usergroupsDisable($token, $usergroup, $include_count): \OpenAPI\Client\Model\UsergroupsDisableSchema
```



Disable an existing User Group

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\UsergroupsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `usergroups:write`
$usergroup = 'usergroup_example'; // string | The encoded ID of the User Group to disable.
$include_count = True; // bool | Include the number of users in the User Group.

try {
    $result = $apiInstance->usergroupsDisable($token, $usergroup, $include_count);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling UsergroupsApi->usergroupsDisable: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;usergroups:write&#x60; | |
| **usergroup** | **string**| The encoded ID of the User Group to disable. | |
| **include_count** | **bool**| Include the number of users in the User Group. | [optional] |

### Return type

[**\OpenAPI\Client\Model\UsergroupsDisableSchema**](../Model/UsergroupsDisableSchema.md)

### Authorization

[slackAuth](../../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: `application/x-www-form-urlencoded`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `usergroupsEnable()`

```php
usergroupsEnable($token, $usergroup, $include_count): \OpenAPI\Client\Model\UsergroupsEnableSchema
```



Enable a User Group

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\UsergroupsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `usergroups:write`
$usergroup = 'usergroup_example'; // string | The encoded ID of the User Group to enable.
$include_count = True; // bool | Include the number of users in the User Group.

try {
    $result = $apiInstance->usergroupsEnable($token, $usergroup, $include_count);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling UsergroupsApi->usergroupsEnable: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;usergroups:write&#x60; | |
| **usergroup** | **string**| The encoded ID of the User Group to enable. | |
| **include_count** | **bool**| Include the number of users in the User Group. | [optional] |

### Return type

[**\OpenAPI\Client\Model\UsergroupsEnableSchema**](../Model/UsergroupsEnableSchema.md)

### Authorization

[slackAuth](../../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: `application/x-www-form-urlencoded`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `usergroupsList()`

```php
usergroupsList($token, $include_users, $include_count, $include_disabled): \OpenAPI\Client\Model\UsergroupsListSchema
```



List all User Groups for a team

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\UsergroupsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `usergroups:read`
$include_users = True; // bool | Include the list of users for each User Group.
$include_count = True; // bool | Include the number of users in each User Group.
$include_disabled = True; // bool | Include disabled User Groups.

try {
    $result = $apiInstance->usergroupsList($token, $include_users, $include_count, $include_disabled);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling UsergroupsApi->usergroupsList: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;usergroups:read&#x60; | |
| **include_users** | **bool**| Include the list of users for each User Group. | [optional] |
| **include_count** | **bool**| Include the number of users in each User Group. | [optional] |
| **include_disabled** | **bool**| Include disabled User Groups. | [optional] |

### Return type

[**\OpenAPI\Client\Model\UsergroupsListSchema**](../Model/UsergroupsListSchema.md)

### Authorization

[slackAuth](../../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `usergroupsUpdate()`

```php
usergroupsUpdate($token, $usergroup, $channels, $description, $handle, $include_count, $name): \OpenAPI\Client\Model\UsergroupsUpdateSchema
```



Update an existing User Group

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\UsergroupsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `usergroups:write`
$usergroup = 'usergroup_example'; // string | The encoded ID of the User Group to update.
$channels = 'channels_example'; // string | A comma separated string of encoded channel IDs for which the User Group uses as a default.
$description = 'description_example'; // string | A short description of the User Group.
$handle = 'handle_example'; // string | A mention handle. Must be unique among channels, users and User Groups.
$include_count = True; // bool | Include the number of users in the User Group.
$name = 'name_example'; // string | A name for the User Group. Must be unique among User Groups.

try {
    $result = $apiInstance->usergroupsUpdate($token, $usergroup, $channels, $description, $handle, $include_count, $name);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling UsergroupsApi->usergroupsUpdate: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;usergroups:write&#x60; | |
| **usergroup** | **string**| The encoded ID of the User Group to update. | |
| **channels** | **string**| A comma separated string of encoded channel IDs for which the User Group uses as a default. | [optional] |
| **description** | **string**| A short description of the User Group. | [optional] |
| **handle** | **string**| A mention handle. Must be unique among channels, users and User Groups. | [optional] |
| **include_count** | **bool**| Include the number of users in the User Group. | [optional] |
| **name** | **string**| A name for the User Group. Must be unique among User Groups. | [optional] |

### Return type

[**\OpenAPI\Client\Model\UsergroupsUpdateSchema**](../Model/UsergroupsUpdateSchema.md)

### Authorization

[slackAuth](../../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: `application/x-www-form-urlencoded`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

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


$apiInstance = new OpenAPI\Client\Api\UsergroupsApi(
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
    echo 'Exception when calling UsergroupsApi->usergroupsUsersList: ', $e->getMessage(), PHP_EOL;
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


$apiInstance = new OpenAPI\Client\Api\UsergroupsApi(
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
    echo 'Exception when calling UsergroupsApi->usergroupsUsersUpdate: ', $e->getMessage(), PHP_EOL;
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
