# OpenAPI\Client\UsersApi

All URIs are relative to https://slack.com/api, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**usersConversations()**](UsersApi.md#usersConversations) | **GET** /users.conversations |  |
| [**usersDeletePhoto()**](UsersApi.md#usersDeletePhoto) | **POST** /users.deletePhoto |  |
| [**usersGetPresence()**](UsersApi.md#usersGetPresence) | **GET** /users.getPresence |  |
| [**usersIdentity()**](UsersApi.md#usersIdentity) | **GET** /users.identity |  |
| [**usersInfo()**](UsersApi.md#usersInfo) | **GET** /users.info |  |
| [**usersList()**](UsersApi.md#usersList) | **GET** /users.list |  |
| [**usersLookupByEmail()**](UsersApi.md#usersLookupByEmail) | **GET** /users.lookupByEmail |  |
| [**usersProfileGet()**](UsersApi.md#usersProfileGet) | **GET** /users.profile.get |  |
| [**usersProfileSet()**](UsersApi.md#usersProfileSet) | **POST** /users.profile.set |  |
| [**usersSetActive()**](UsersApi.md#usersSetActive) | **POST** /users.setActive |  |
| [**usersSetPhoto()**](UsersApi.md#usersSetPhoto) | **POST** /users.setPhoto |  |
| [**usersSetPresence()**](UsersApi.md#usersSetPresence) | **POST** /users.setPresence |  |


## `usersConversations()`

```php
usersConversations($token, $user, $types, $exclude_archived, $limit, $cursor): \OpenAPI\Client\Model\UsersConversationsSuccessSchema
```



List conversations the calling user may access.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\UsersApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `conversations:read`
$user = 'user_example'; // string | Browse conversations by a specific user ID's membership. Non-public channels are restricted to those where the calling user shares membership.
$types = 'types_example'; // string | Mix and match channel types by providing a comma-separated list of any combination of `public_channel`, `private_channel`, `mpim`, `im`
$exclude_archived = True; // bool | Set to `true` to exclude archived channels from the list
$limit = 56; // int | The maximum number of items to return. Fewer than the requested number of items may be returned, even if the end of the list hasn't been reached. Must be an integer no larger than 1000.
$cursor = 'cursor_example'; // string | Paginate through collections of data by setting the `cursor` parameter to a `next_cursor` attribute returned by a previous request's `response_metadata`. Default value fetches the first \"page\" of the collection. See [pagination](/docs/pagination) for more detail.

try {
    $result = $apiInstance->usersConversations($token, $user, $types, $exclude_archived, $limit, $cursor);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling UsersApi->usersConversations: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;conversations:read&#x60; | [optional] |
| **user** | **string**| Browse conversations by a specific user ID&#39;s membership. Non-public channels are restricted to those where the calling user shares membership. | [optional] |
| **types** | **string**| Mix and match channel types by providing a comma-separated list of any combination of &#x60;public_channel&#x60;, &#x60;private_channel&#x60;, &#x60;mpim&#x60;, &#x60;im&#x60; | [optional] |
| **exclude_archived** | **bool**| Set to &#x60;true&#x60; to exclude archived channels from the list | [optional] |
| **limit** | **int**| The maximum number of items to return. Fewer than the requested number of items may be returned, even if the end of the list hasn&#39;t been reached. Must be an integer no larger than 1000. | [optional] |
| **cursor** | **string**| Paginate through collections of data by setting the &#x60;cursor&#x60; parameter to a &#x60;next_cursor&#x60; attribute returned by a previous request&#39;s &#x60;response_metadata&#x60;. Default value fetches the first \&quot;page\&quot; of the collection. See [pagination](/docs/pagination) for more detail. | [optional] |

### Return type

[**\OpenAPI\Client\Model\UsersConversationsSuccessSchema**](../Model/UsersConversationsSuccessSchema.md)

### Authorization

[slackAuth](../../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `usersDeletePhoto()`

```php
usersDeletePhoto($token): \OpenAPI\Client\Model\UsersDeletePhotoSchema
```



Delete the user profile photo

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\UsersApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `users.profile:write`

try {
    $result = $apiInstance->usersDeletePhoto($token);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling UsersApi->usersDeletePhoto: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;users.profile:write&#x60; | |

### Return type

[**\OpenAPI\Client\Model\UsersDeletePhotoSchema**](../Model/UsersDeletePhotoSchema.md)

### Authorization

[slackAuth](../../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: `application/x-www-form-urlencoded`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `usersGetPresence()`

```php
usersGetPresence($token, $user): \OpenAPI\Client\Model\APIMethodUsersGetPresence
```



Gets user presence information.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\UsersApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `users:read`
$user = 'user_example'; // string | User to get presence info on. Defaults to the authed user.

try {
    $result = $apiInstance->usersGetPresence($token, $user);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling UsersApi->usersGetPresence: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;users:read&#x60; | |
| **user** | **string**| User to get presence info on. Defaults to the authed user. | [optional] |

### Return type

[**\OpenAPI\Client\Model\APIMethodUsersGetPresence**](../Model/APIMethodUsersGetPresence.md)

### Authorization

[slackAuth](../../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `usersIdentity()`

```php
usersIdentity($token): \OpenAPI\Client\Model\UsersIdentitySchemaInner[]
```



Get a user's identity.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\UsersApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `identity.basic`

try {
    $result = $apiInstance->usersIdentity($token);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling UsersApi->usersIdentity: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;identity.basic&#x60; | [optional] |

### Return type

[**\OpenAPI\Client\Model\UsersIdentitySchemaInner[]**](../Model/UsersIdentitySchemaInner.md)

### Authorization

[slackAuth](../../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `usersInfo()`

```php
usersInfo($token, $include_locale, $user): \OpenAPI\Client\Model\UsersInfoSuccessSchema
```



Gets information about a user.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\UsersApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `users:read`
$include_locale = True; // bool | Set this to `true` to receive the locale for this user. Defaults to `false`
$user = 'user_example'; // string | User to get info on

try {
    $result = $apiInstance->usersInfo($token, $include_locale, $user);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling UsersApi->usersInfo: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;users:read&#x60; | |
| **include_locale** | **bool**| Set this to &#x60;true&#x60; to receive the locale for this user. Defaults to &#x60;false&#x60; | [optional] |
| **user** | **string**| User to get info on | [optional] |

### Return type

[**\OpenAPI\Client\Model\UsersInfoSuccessSchema**](../Model/UsersInfoSuccessSchema.md)

### Authorization

[slackAuth](../../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `usersList()`

```php
usersList($token, $limit, $cursor, $include_locale): \OpenAPI\Client\Model\UsersListSchema
```



Lists all users in a Slack team.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\UsersApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `users:read`
$limit = 56; // int | The maximum number of items to return. Fewer than the requested number of items may be returned, even if the end of the users list hasn't been reached. Providing no `limit` value will result in Slack attempting to deliver you the entire result set. If the collection is too large you may experience `limit_required` or HTTP 500 errors.
$cursor = 'cursor_example'; // string | Paginate through collections of data by setting the `cursor` parameter to a `next_cursor` attribute returned by a previous request's `response_metadata`. Default value fetches the first \"page\" of the collection. See [pagination](/docs/pagination) for more detail.
$include_locale = True; // bool | Set this to `true` to receive the locale for users. Defaults to `false`

try {
    $result = $apiInstance->usersList($token, $limit, $cursor, $include_locale);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling UsersApi->usersList: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;users:read&#x60; | [optional] |
| **limit** | **int**| The maximum number of items to return. Fewer than the requested number of items may be returned, even if the end of the users list hasn&#39;t been reached. Providing no &#x60;limit&#x60; value will result in Slack attempting to deliver you the entire result set. If the collection is too large you may experience &#x60;limit_required&#x60; or HTTP 500 errors. | [optional] |
| **cursor** | **string**| Paginate through collections of data by setting the &#x60;cursor&#x60; parameter to a &#x60;next_cursor&#x60; attribute returned by a previous request&#39;s &#x60;response_metadata&#x60;. Default value fetches the first \&quot;page\&quot; of the collection. See [pagination](/docs/pagination) for more detail. | [optional] |
| **include_locale** | **bool**| Set this to &#x60;true&#x60; to receive the locale for users. Defaults to &#x60;false&#x60; | [optional] |

### Return type

[**\OpenAPI\Client\Model\UsersListSchema**](../Model/UsersListSchema.md)

### Authorization

[slackAuth](../../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `usersLookupByEmail()`

```php
usersLookupByEmail($token, $email): \OpenAPI\Client\Model\UsersLookupByEmailSuccessSchema
```



Find a user with an email address.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\UsersApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `users:read.email`
$email = 'email_example'; // string | An email address belonging to a user in the workspace

try {
    $result = $apiInstance->usersLookupByEmail($token, $email);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling UsersApi->usersLookupByEmail: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;users:read.email&#x60; | |
| **email** | **string**| An email address belonging to a user in the workspace | |

### Return type

[**\OpenAPI\Client\Model\UsersLookupByEmailSuccessSchema**](../Model/UsersLookupByEmailSuccessSchema.md)

### Authorization

[slackAuth](../../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `usersProfileGet()`

```php
usersProfileGet($token, $include_labels, $user): \OpenAPI\Client\Model\UsersProfileGetSchema
```



Retrieves a user's profile information.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\UsersApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `users.profile:read`
$include_labels = True; // bool | Include labels for each ID in custom profile fields
$user = 'user_example'; // string | User to retrieve profile info for

try {
    $result = $apiInstance->usersProfileGet($token, $include_labels, $user);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling UsersApi->usersProfileGet: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;users.profile:read&#x60; | |
| **include_labels** | **bool**| Include labels for each ID in custom profile fields | [optional] |
| **user** | **string**| User to retrieve profile info for | [optional] |

### Return type

[**\OpenAPI\Client\Model\UsersProfileGetSchema**](../Model/UsersProfileGetSchema.md)

### Authorization

[slackAuth](../../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `usersProfileSet()`

```php
usersProfileSet($token, $name, $profile, $user, $value): \OpenAPI\Client\Model\UsersProfileSetSchema
```



Set the profile information for a user.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\UsersApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `users.profile:write`
$name = 'name_example'; // string | Name of a single key to set. Usable only if `profile` is not passed.
$profile = 'profile_example'; // string | Collection of key:value pairs presented as a URL-encoded JSON hash. At most 50 fields may be set. Each field name is limited to 255 characters.
$user = 'user_example'; // string | ID of user to change. This argument may only be specified by team admins on paid teams.
$value = 'value_example'; // string | Value to set a single key to. Usable only if `profile` is not passed.

try {
    $result = $apiInstance->usersProfileSet($token, $name, $profile, $user, $value);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling UsersApi->usersProfileSet: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;users.profile:write&#x60; | |
| **name** | **string**| Name of a single key to set. Usable only if &#x60;profile&#x60; is not passed. | [optional] |
| **profile** | **string**| Collection of key:value pairs presented as a URL-encoded JSON hash. At most 50 fields may be set. Each field name is limited to 255 characters. | [optional] |
| **user** | **string**| ID of user to change. This argument may only be specified by team admins on paid teams. | [optional] |
| **value** | **string**| Value to set a single key to. Usable only if &#x60;profile&#x60; is not passed. | [optional] |

### Return type

[**\OpenAPI\Client\Model\UsersProfileSetSchema**](../Model/UsersProfileSetSchema.md)

### Authorization

[slackAuth](../../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: `application/x-www-form-urlencoded`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `usersSetActive()`

```php
usersSetActive($token): \OpenAPI\Client\Model\UsersSetActiveSchema
```



Marked a user as active. Deprecated and non-functional.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\UsersApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `users:write`

try {
    $result = $apiInstance->usersSetActive($token);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling UsersApi->usersSetActive: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;users:write&#x60; | |

### Return type

[**\OpenAPI\Client\Model\UsersSetActiveSchema**](../Model/UsersSetActiveSchema.md)

### Authorization

[slackAuth](../../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `usersSetPhoto()`

```php
usersSetPhoto($token, $crop_w, $crop_x, $crop_y, $image): \OpenAPI\Client\Model\UsersSetPhotoSchema
```



Set the user profile photo

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\UsersApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `users.profile:write`
$crop_w = 'crop_w_example'; // string | Width/height of crop box (always square)
$crop_x = 'crop_x_example'; // string | X coordinate of top-left corner of crop box
$crop_y = 'crop_y_example'; // string | Y coordinate of top-left corner of crop box
$image = 'image_example'; // string | File contents via `multipart/form-data`.

try {
    $result = $apiInstance->usersSetPhoto($token, $crop_w, $crop_x, $crop_y, $image);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling UsersApi->usersSetPhoto: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;users.profile:write&#x60; | |
| **crop_w** | **string**| Width/height of crop box (always square) | [optional] |
| **crop_x** | **string**| X coordinate of top-left corner of crop box | [optional] |
| **crop_y** | **string**| Y coordinate of top-left corner of crop box | [optional] |
| **image** | **string**| File contents via &#x60;multipart/form-data&#x60;. | [optional] |

### Return type

[**\OpenAPI\Client\Model\UsersSetPhotoSchema**](../Model/UsersSetPhotoSchema.md)

### Authorization

[slackAuth](../../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: `application/x-www-form-urlencoded`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `usersSetPresence()`

```php
usersSetPresence($token, $presence): \OpenAPI\Client\Model\UsersSetPresenceSchema
```



Manually sets user presence.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\UsersApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `users:write`
$presence = 'presence_example'; // string | Either `auto` or `away`

try {
    $result = $apiInstance->usersSetPresence($token, $presence);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling UsersApi->usersSetPresence: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;users:write&#x60; | |
| **presence** | **string**| Either &#x60;auto&#x60; or &#x60;away&#x60; | |

### Return type

[**\OpenAPI\Client\Model\UsersSetPresenceSchema**](../Model/UsersSetPresenceSchema.md)

### Authorization

[slackAuth](../../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: `application/x-www-form-urlencoded`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
