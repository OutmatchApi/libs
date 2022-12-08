# OpenAPI\Client\ReactionsApi

All URIs are relative to https://slack.com/api, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**reactionsAdd()**](ReactionsApi.md#reactionsAdd) | **POST** /reactions.add |  |
| [**reactionsGet()**](ReactionsApi.md#reactionsGet) | **GET** /reactions.get |  |
| [**reactionsList()**](ReactionsApi.md#reactionsList) | **GET** /reactions.list |  |
| [**reactionsRemove()**](ReactionsApi.md#reactionsRemove) | **POST** /reactions.remove |  |


## `reactionsAdd()`

```php
reactionsAdd($token, $channel, $name, $timestamp): \OpenAPI\Client\Model\ReactionsAddSchema
```



Adds a reaction to an item.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\ReactionsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `reactions:write`
$channel = 'channel_example'; // string | Channel where the message to add reaction to was posted.
$name = 'name_example'; // string | Reaction (emoji) name.
$timestamp = 'timestamp_example'; // string | Timestamp of the message to add reaction to.

try {
    $result = $apiInstance->reactionsAdd($token, $channel, $name, $timestamp);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ReactionsApi->reactionsAdd: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;reactions:write&#x60; | |
| **channel** | **string**| Channel where the message to add reaction to was posted. | |
| **name** | **string**| Reaction (emoji) name. | |
| **timestamp** | **string**| Timestamp of the message to add reaction to. | |

### Return type

[**\OpenAPI\Client\Model\ReactionsAddSchema**](../Model/ReactionsAddSchema.md)

### Authorization

[slackAuth](../../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: `application/x-www-form-urlencoded`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `reactionsGet()`

```php
reactionsGet($token, $channel, $file, $file_comment, $full, $timestamp): \OpenAPI\Client\Model\ReactionsGetSuccessSchemaInner[]
```



Gets reactions for an item.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\ReactionsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `reactions:read`
$channel = 'channel_example'; // string | Channel where the message to get reactions for was posted.
$file = 'file_example'; // string | File to get reactions for.
$file_comment = 'file_comment_example'; // string | File comment to get reactions for.
$full = True; // bool | If true always return the complete reaction list.
$timestamp = 'timestamp_example'; // string | Timestamp of the message to get reactions for.

try {
    $result = $apiInstance->reactionsGet($token, $channel, $file, $file_comment, $full, $timestamp);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ReactionsApi->reactionsGet: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;reactions:read&#x60; | |
| **channel** | **string**| Channel where the message to get reactions for was posted. | [optional] |
| **file** | **string**| File to get reactions for. | [optional] |
| **file_comment** | **string**| File comment to get reactions for. | [optional] |
| **full** | **bool**| If true always return the complete reaction list. | [optional] |
| **timestamp** | **string**| Timestamp of the message to get reactions for. | [optional] |

### Return type

[**\OpenAPI\Client\Model\ReactionsGetSuccessSchemaInner[]**](../Model/ReactionsGetSuccessSchemaInner.md)

### Authorization

[slackAuth](../../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `reactionsList()`

```php
reactionsList($token, $user, $full, $count, $page, $cursor, $limit): \OpenAPI\Client\Model\ReactionsListSchema
```



Lists reactions made by a user.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\ReactionsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `reactions:read`
$user = 'user_example'; // string | Show reactions made by this user. Defaults to the authed user.
$full = True; // bool | If true always return the complete reaction list.
$count = 56; // int
$page = 56; // int
$cursor = 'cursor_example'; // string | Parameter for pagination. Set `cursor` equal to the `next_cursor` attribute returned by the previous request's `response_metadata`. This parameter is optional, but pagination is mandatory: the default value simply fetches the first \"page\" of the collection. See [pagination](/docs/pagination) for more details.
$limit = 56; // int | The maximum number of items to return. Fewer than the requested number of items may be returned, even if the end of the list hasn't been reached.

try {
    $result = $apiInstance->reactionsList($token, $user, $full, $count, $page, $cursor, $limit);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ReactionsApi->reactionsList: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;reactions:read&#x60; | |
| **user** | **string**| Show reactions made by this user. Defaults to the authed user. | [optional] |
| **full** | **bool**| If true always return the complete reaction list. | [optional] |
| **count** | **int**|  | [optional] |
| **page** | **int**|  | [optional] |
| **cursor** | **string**| Parameter for pagination. Set &#x60;cursor&#x60; equal to the &#x60;next_cursor&#x60; attribute returned by the previous request&#39;s &#x60;response_metadata&#x60;. This parameter is optional, but pagination is mandatory: the default value simply fetches the first \&quot;page\&quot; of the collection. See [pagination](/docs/pagination) for more details. | [optional] |
| **limit** | **int**| The maximum number of items to return. Fewer than the requested number of items may be returned, even if the end of the list hasn&#39;t been reached. | [optional] |

### Return type

[**\OpenAPI\Client\Model\ReactionsListSchema**](../Model/ReactionsListSchema.md)

### Authorization

[slackAuth](../../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `reactionsRemove()`

```php
reactionsRemove($token, $name, $channel, $file, $file_comment, $timestamp): \OpenAPI\Client\Model\ReactionsRemoveSchema
```



Removes a reaction from an item.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\ReactionsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `reactions:write`
$name = 'name_example'; // string | Reaction (emoji) name.
$channel = 'channel_example'; // string | Channel where the message to remove reaction from was posted.
$file = 'file_example'; // string | File to remove reaction from.
$file_comment = 'file_comment_example'; // string | File comment to remove reaction from.
$timestamp = 'timestamp_example'; // string | Timestamp of the message to remove reaction from.

try {
    $result = $apiInstance->reactionsRemove($token, $name, $channel, $file, $file_comment, $timestamp);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ReactionsApi->reactionsRemove: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;reactions:write&#x60; | |
| **name** | **string**| Reaction (emoji) name. | |
| **channel** | **string**| Channel where the message to remove reaction from was posted. | [optional] |
| **file** | **string**| File to remove reaction from. | [optional] |
| **file_comment** | **string**| File comment to remove reaction from. | [optional] |
| **timestamp** | **string**| Timestamp of the message to remove reaction from. | [optional] |

### Return type

[**\OpenAPI\Client\Model\ReactionsRemoveSchema**](../Model/ReactionsRemoveSchema.md)

### Authorization

[slackAuth](../../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: `application/x-www-form-urlencoded`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
