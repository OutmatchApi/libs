# OpenAPI\Client\StarsApi

All URIs are relative to https://slack.com/api, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**starsAdd()**](StarsApi.md#starsAdd) | **POST** /stars.add |  |
| [**starsList()**](StarsApi.md#starsList) | **GET** /stars.list |  |
| [**starsRemove()**](StarsApi.md#starsRemove) | **POST** /stars.remove |  |


## `starsAdd()`

```php
starsAdd($token, $channel, $file, $file_comment, $timestamp): \OpenAPI\Client\Model\StarsAddSchema
```



Adds a star to an item.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\StarsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `stars:write`
$channel = 'channel_example'; // string | Channel to add star to, or channel where the message to add star to was posted (used with `timestamp`).
$file = 'file_example'; // string | File to add star to.
$file_comment = 'file_comment_example'; // string | File comment to add star to.
$timestamp = 'timestamp_example'; // string | Timestamp of the message to add star to.

try {
    $result = $apiInstance->starsAdd($token, $channel, $file, $file_comment, $timestamp);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling StarsApi->starsAdd: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;stars:write&#x60; | |
| **channel** | **string**| Channel to add star to, or channel where the message to add star to was posted (used with &#x60;timestamp&#x60;). | [optional] |
| **file** | **string**| File to add star to. | [optional] |
| **file_comment** | **string**| File comment to add star to. | [optional] |
| **timestamp** | **string**| Timestamp of the message to add star to. | [optional] |

### Return type

[**\OpenAPI\Client\Model\StarsAddSchema**](../Model/StarsAddSchema.md)

### Authorization

[slackAuth](../../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: `application/x-www-form-urlencoded`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `starsList()`

```php
starsList($token, $count, $page, $cursor, $limit): \OpenAPI\Client\Model\StarsListSchema
```



Lists stars for a user.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\StarsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `stars:read`
$count = 'count_example'; // string
$page = 'page_example'; // string
$cursor = 'cursor_example'; // string | Parameter for pagination. Set `cursor` equal to the `next_cursor` attribute returned by the previous request's `response_metadata`. This parameter is optional, but pagination is mandatory: the default value simply fetches the first \"page\" of the collection. See [pagination](/docs/pagination) for more details.
$limit = 56; // int | The maximum number of items to return. Fewer than the requested number of items may be returned, even if the end of the list hasn't been reached.

try {
    $result = $apiInstance->starsList($token, $count, $page, $cursor, $limit);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling StarsApi->starsList: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;stars:read&#x60; | [optional] |
| **count** | **string**|  | [optional] |
| **page** | **string**|  | [optional] |
| **cursor** | **string**| Parameter for pagination. Set &#x60;cursor&#x60; equal to the &#x60;next_cursor&#x60; attribute returned by the previous request&#39;s &#x60;response_metadata&#x60;. This parameter is optional, but pagination is mandatory: the default value simply fetches the first \&quot;page\&quot; of the collection. See [pagination](/docs/pagination) for more details. | [optional] |
| **limit** | **int**| The maximum number of items to return. Fewer than the requested number of items may be returned, even if the end of the list hasn&#39;t been reached. | [optional] |

### Return type

[**\OpenAPI\Client\Model\StarsListSchema**](../Model/StarsListSchema.md)

### Authorization

[slackAuth](../../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `starsRemove()`

```php
starsRemove($token, $channel, $file, $file_comment, $timestamp): \OpenAPI\Client\Model\StarsRemoveSchema
```



Removes a star from an item.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\StarsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `stars:write`
$channel = 'channel_example'; // string | Channel to remove star from, or channel where the message to remove star from was posted (used with `timestamp`).
$file = 'file_example'; // string | File to remove star from.
$file_comment = 'file_comment_example'; // string | File comment to remove star from.
$timestamp = 'timestamp_example'; // string | Timestamp of the message to remove star from.

try {
    $result = $apiInstance->starsRemove($token, $channel, $file, $file_comment, $timestamp);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling StarsApi->starsRemove: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;stars:write&#x60; | |
| **channel** | **string**| Channel to remove star from, or channel where the message to remove star from was posted (used with &#x60;timestamp&#x60;). | [optional] |
| **file** | **string**| File to remove star from. | [optional] |
| **file_comment** | **string**| File comment to remove star from. | [optional] |
| **timestamp** | **string**| Timestamp of the message to remove star from. | [optional] |

### Return type

[**\OpenAPI\Client\Model\StarsRemoveSchema**](../Model/StarsRemoveSchema.md)

### Authorization

[slackAuth](../../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: `application/x-www-form-urlencoded`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
