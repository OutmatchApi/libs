# OpenAPI\Client\FilesRemoteApi

All URIs are relative to https://slack.com/api, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**filesRemoteAdd()**](FilesRemoteApi.md#filesRemoteAdd) | **POST** /files.remote.add |  |
| [**filesRemoteInfo()**](FilesRemoteApi.md#filesRemoteInfo) | **GET** /files.remote.info |  |
| [**filesRemoteList()**](FilesRemoteApi.md#filesRemoteList) | **GET** /files.remote.list |  |
| [**filesRemoteRemove()**](FilesRemoteApi.md#filesRemoteRemove) | **POST** /files.remote.remove |  |
| [**filesRemoteShare()**](FilesRemoteApi.md#filesRemoteShare) | **GET** /files.remote.share |  |
| [**filesRemoteUpdate()**](FilesRemoteApi.md#filesRemoteUpdate) | **POST** /files.remote.update |  |


## `filesRemoteAdd()`

```php
filesRemoteAdd($external_id, $external_url, $filetype, $indexable_file_contents, $preview_image, $title, $token): \OpenAPI\Client\Model\DefaultSuccessTemplate
```



Adds a file from a remote service

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\FilesRemoteApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$external_id = 'external_id_example'; // string | Creator defined GUID for the file.
$external_url = 'external_url_example'; // string | URL of the remote file.
$filetype = 'filetype_example'; // string | type of file
$indexable_file_contents = 'indexable_file_contents_example'; // string | A text file (txt, pdf, doc, etc.) containing textual search terms that are used to improve discovery of the remote file.
$preview_image = 'preview_image_example'; // string | Preview of the document via `multipart/form-data`.
$title = 'title_example'; // string | Title of the file being shared.
$token = 'token_example'; // string | Authentication token. Requires scope: `remote_files:write`

try {
    $result = $apiInstance->filesRemoteAdd($external_id, $external_url, $filetype, $indexable_file_contents, $preview_image, $title, $token);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling FilesRemoteApi->filesRemoteAdd: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **external_id** | **string**| Creator defined GUID for the file. | [optional] |
| **external_url** | **string**| URL of the remote file. | [optional] |
| **filetype** | **string**| type of file | [optional] |
| **indexable_file_contents** | **string**| A text file (txt, pdf, doc, etc.) containing textual search terms that are used to improve discovery of the remote file. | [optional] |
| **preview_image** | **string**| Preview of the document via &#x60;multipart/form-data&#x60;. | [optional] |
| **title** | **string**| Title of the file being shared. | [optional] |
| **token** | **string**| Authentication token. Requires scope: &#x60;remote_files:write&#x60; | [optional] |

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

## `filesRemoteInfo()`

```php
filesRemoteInfo($token, $file, $external_id): \OpenAPI\Client\Model\DefaultSuccessTemplate
```



Retrieve information about a remote file added to Slack

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\FilesRemoteApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `remote_files:read`
$file = 'file_example'; // string | Specify a file by providing its ID.
$external_id = 'external_id_example'; // string | Creator defined GUID for the file.

try {
    $result = $apiInstance->filesRemoteInfo($token, $file, $external_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling FilesRemoteApi->filesRemoteInfo: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;remote_files:read&#x60; | [optional] |
| **file** | **string**| Specify a file by providing its ID. | [optional] |
| **external_id** | **string**| Creator defined GUID for the file. | [optional] |

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

## `filesRemoteList()`

```php
filesRemoteList($token, $channel, $ts_from, $ts_to, $limit, $cursor): \OpenAPI\Client\Model\DefaultSuccessTemplate
```



Retrieve information about a remote file added to Slack

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\FilesRemoteApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `remote_files:read`
$channel = 'channel_example'; // string | Filter files appearing in a specific channel, indicated by its ID.
$ts_from = 3.4; // float | Filter files created after this timestamp (inclusive).
$ts_to = 3.4; // float | Filter files created before this timestamp (inclusive).
$limit = 56; // int | The maximum number of items to return.
$cursor = 'cursor_example'; // string | Paginate through collections of data by setting the `cursor` parameter to a `next_cursor` attribute returned by a previous request's `response_metadata`. Default value fetches the first \"page\" of the collection. See [pagination](/docs/pagination) for more detail.

try {
    $result = $apiInstance->filesRemoteList($token, $channel, $ts_from, $ts_to, $limit, $cursor);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling FilesRemoteApi->filesRemoteList: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;remote_files:read&#x60; | [optional] |
| **channel** | **string**| Filter files appearing in a specific channel, indicated by its ID. | [optional] |
| **ts_from** | **float**| Filter files created after this timestamp (inclusive). | [optional] |
| **ts_to** | **float**| Filter files created before this timestamp (inclusive). | [optional] |
| **limit** | **int**| The maximum number of items to return. | [optional] |
| **cursor** | **string**| Paginate through collections of data by setting the &#x60;cursor&#x60; parameter to a &#x60;next_cursor&#x60; attribute returned by a previous request&#39;s &#x60;response_metadata&#x60;. Default value fetches the first \&quot;page\&quot; of the collection. See [pagination](/docs/pagination) for more detail. | [optional] |

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

## `filesRemoteRemove()`

```php
filesRemoteRemove($external_id, $file, $token): \OpenAPI\Client\Model\DefaultSuccessTemplate
```



Remove a remote file.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\FilesRemoteApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$external_id = 'external_id_example'; // string | Creator defined GUID for the file.
$file = 'file_example'; // string | Specify a file by providing its ID.
$token = 'token_example'; // string | Authentication token. Requires scope: `remote_files:write`

try {
    $result = $apiInstance->filesRemoteRemove($external_id, $file, $token);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling FilesRemoteApi->filesRemoteRemove: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **external_id** | **string**| Creator defined GUID for the file. | [optional] |
| **file** | **string**| Specify a file by providing its ID. | [optional] |
| **token** | **string**| Authentication token. Requires scope: &#x60;remote_files:write&#x60; | [optional] |

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

## `filesRemoteShare()`

```php
filesRemoteShare($token, $file, $external_id, $channels): \OpenAPI\Client\Model\DefaultSuccessTemplate
```



Share a remote file into a channel.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\FilesRemoteApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `remote_files:share`
$file = 'file_example'; // string | Specify a file registered with Slack by providing its ID. Either this field or `external_id` or both are required.
$external_id = 'external_id_example'; // string | The globally unique identifier (GUID) for the file, as set by the app registering the file with Slack.  Either this field or `file` or both are required.
$channels = 'channels_example'; // string | Comma-separated list of channel IDs where the file will be shared.

try {
    $result = $apiInstance->filesRemoteShare($token, $file, $external_id, $channels);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling FilesRemoteApi->filesRemoteShare: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;remote_files:share&#x60; | [optional] |
| **file** | **string**| Specify a file registered with Slack by providing its ID. Either this field or &#x60;external_id&#x60; or both are required. | [optional] |
| **external_id** | **string**| The globally unique identifier (GUID) for the file, as set by the app registering the file with Slack.  Either this field or &#x60;file&#x60; or both are required. | [optional] |
| **channels** | **string**| Comma-separated list of channel IDs where the file will be shared. | [optional] |

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

## `filesRemoteUpdate()`

```php
filesRemoteUpdate($external_id, $external_url, $file, $filetype, $indexable_file_contents, $preview_image, $title, $token): \OpenAPI\Client\Model\DefaultSuccessTemplate
```



Updates an existing remote file.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\FilesRemoteApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$external_id = 'external_id_example'; // string | Creator defined GUID for the file.
$external_url = 'external_url_example'; // string | URL of the remote file.
$file = 'file_example'; // string | Specify a file by providing its ID.
$filetype = 'filetype_example'; // string | type of file
$indexable_file_contents = 'indexable_file_contents_example'; // string | File containing contents that can be used to improve searchability for the remote file.
$preview_image = 'preview_image_example'; // string | Preview of the document via `multipart/form-data`.
$title = 'title_example'; // string | Title of the file being shared.
$token = 'token_example'; // string | Authentication token. Requires scope: `remote_files:write`

try {
    $result = $apiInstance->filesRemoteUpdate($external_id, $external_url, $file, $filetype, $indexable_file_contents, $preview_image, $title, $token);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling FilesRemoteApi->filesRemoteUpdate: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **external_id** | **string**| Creator defined GUID for the file. | [optional] |
| **external_url** | **string**| URL of the remote file. | [optional] |
| **file** | **string**| Specify a file by providing its ID. | [optional] |
| **filetype** | **string**| type of file | [optional] |
| **indexable_file_contents** | **string**| File containing contents that can be used to improve searchability for the remote file. | [optional] |
| **preview_image** | **string**| Preview of the document via &#x60;multipart/form-data&#x60;. | [optional] |
| **title** | **string**| Title of the file being shared. | [optional] |
| **token** | **string**| Authentication token. Requires scope: &#x60;remote_files:write&#x60; | [optional] |

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
