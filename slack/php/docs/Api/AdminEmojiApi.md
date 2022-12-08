# OpenAPI\Client\AdminEmojiApi

All URIs are relative to https://slack.com/api, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**adminEmojiAdd()**](AdminEmojiApi.md#adminEmojiAdd) | **POST** /admin.emoji.add |  |
| [**adminEmojiAddAlias()**](AdminEmojiApi.md#adminEmojiAddAlias) | **POST** /admin.emoji.addAlias |  |
| [**adminEmojiList()**](AdminEmojiApi.md#adminEmojiList) | **GET** /admin.emoji.list |  |
| [**adminEmojiRemove()**](AdminEmojiApi.md#adminEmojiRemove) | **POST** /admin.emoji.remove |  |
| [**adminEmojiRename()**](AdminEmojiApi.md#adminEmojiRename) | **POST** /admin.emoji.rename |  |


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


$apiInstance = new OpenAPI\Client\Api\AdminEmojiApi(
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
    echo 'Exception when calling AdminEmojiApi->adminEmojiAdd: ', $e->getMessage(), PHP_EOL;
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


$apiInstance = new OpenAPI\Client\Api\AdminEmojiApi(
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
    echo 'Exception when calling AdminEmojiApi->adminEmojiAddAlias: ', $e->getMessage(), PHP_EOL;
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


$apiInstance = new OpenAPI\Client\Api\AdminEmojiApi(
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
    echo 'Exception when calling AdminEmojiApi->adminEmojiList: ', $e->getMessage(), PHP_EOL;
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


$apiInstance = new OpenAPI\Client\Api\AdminEmojiApi(
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
    echo 'Exception when calling AdminEmojiApi->adminEmojiRemove: ', $e->getMessage(), PHP_EOL;
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


$apiInstance = new OpenAPI\Client\Api\AdminEmojiApi(
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
    echo 'Exception when calling AdminEmojiApi->adminEmojiRename: ', $e->getMessage(), PHP_EOL;
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
