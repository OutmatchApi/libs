# OpenAPI\Client\FilesApi

All URIs are relative to https://slack.com/api, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**filesCommentsDelete()**](FilesApi.md#filesCommentsDelete) | **POST** /files.comments.delete |  |
| [**filesDelete()**](FilesApi.md#filesDelete) | **POST** /files.delete |  |
| [**filesInfo()**](FilesApi.md#filesInfo) | **GET** /files.info |  |
| [**filesList()**](FilesApi.md#filesList) | **GET** /files.list |  |
| [**filesRemoteAdd()**](FilesApi.md#filesRemoteAdd) | **POST** /files.remote.add |  |
| [**filesRemoteInfo()**](FilesApi.md#filesRemoteInfo) | **GET** /files.remote.info |  |
| [**filesRemoteList()**](FilesApi.md#filesRemoteList) | **GET** /files.remote.list |  |
| [**filesRemoteRemove()**](FilesApi.md#filesRemoteRemove) | **POST** /files.remote.remove |  |
| [**filesRemoteShare()**](FilesApi.md#filesRemoteShare) | **GET** /files.remote.share |  |
| [**filesRemoteUpdate()**](FilesApi.md#filesRemoteUpdate) | **POST** /files.remote.update |  |
| [**filesRevokePublicURL()**](FilesApi.md#filesRevokePublicURL) | **POST** /files.revokePublicURL |  |
| [**filesSharedPublicURL()**](FilesApi.md#filesSharedPublicURL) | **POST** /files.sharedPublicURL |  |
| [**filesUpload()**](FilesApi.md#filesUpload) | **POST** /files.upload |  |


## `filesCommentsDelete()`

```php
filesCommentsDelete($token, $file, $id): \OpenAPI\Client\Model\FilesCommentsDeleteSchema
```



Deletes an existing comment on a file.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\FilesApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `files:write:user`
$file = 'file_example'; // string | File to delete a comment from.
$id = 'id_example'; // string | The comment to delete.

try {
    $result = $apiInstance->filesCommentsDelete($token, $file, $id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling FilesApi->filesCommentsDelete: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;files:write:user&#x60; | [optional] |
| **file** | **string**| File to delete a comment from. | [optional] |
| **id** | **string**| The comment to delete. | [optional] |

### Return type

[**\OpenAPI\Client\Model\FilesCommentsDeleteSchema**](../Model/FilesCommentsDeleteSchema.md)

### Authorization

[slackAuth](../../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: `application/x-www-form-urlencoded`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `filesDelete()`

```php
filesDelete($token, $file): \OpenAPI\Client\Model\FilesDeleteSchema
```



Deletes a file.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\FilesApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `files:write:user`
$file = 'file_example'; // string | ID of file to delete.

try {
    $result = $apiInstance->filesDelete($token, $file);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling FilesApi->filesDelete: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;files:write:user&#x60; | [optional] |
| **file** | **string**| ID of file to delete. | [optional] |

### Return type

[**\OpenAPI\Client\Model\FilesDeleteSchema**](../Model/FilesDeleteSchema.md)

### Authorization

[slackAuth](../../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: `application/x-www-form-urlencoded`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `filesInfo()`

```php
filesInfo($token, $file, $count, $page, $limit, $cursor): \OpenAPI\Client\Model\FilesInfoSchema
```



Gets information about a file.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\FilesApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `files:read`
$file = 'file_example'; // string | Specify a file by providing its ID.
$count = 'count_example'; // string
$page = 'page_example'; // string
$limit = 56; // int | The maximum number of items to return. Fewer than the requested number of items may be returned, even if the end of the list hasn't been reached.
$cursor = 'cursor_example'; // string | Parameter for pagination. File comments are paginated for a single file. Set `cursor` equal to the `next_cursor` attribute returned by the previous request's `response_metadata`. This parameter is optional, but pagination is mandatory: the default value simply fetches the first \"page\" of the collection of comments. See [pagination](/docs/pagination) for more details.

try {
    $result = $apiInstance->filesInfo($token, $file, $count, $page, $limit, $cursor);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling FilesApi->filesInfo: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;files:read&#x60; | [optional] |
| **file** | **string**| Specify a file by providing its ID. | [optional] |
| **count** | **string**|  | [optional] |
| **page** | **string**|  | [optional] |
| **limit** | **int**| The maximum number of items to return. Fewer than the requested number of items may be returned, even if the end of the list hasn&#39;t been reached. | [optional] |
| **cursor** | **string**| Parameter for pagination. File comments are paginated for a single file. Set &#x60;cursor&#x60; equal to the &#x60;next_cursor&#x60; attribute returned by the previous request&#39;s &#x60;response_metadata&#x60;. This parameter is optional, but pagination is mandatory: the default value simply fetches the first \&quot;page\&quot; of the collection of comments. See [pagination](/docs/pagination) for more details. | [optional] |

### Return type

[**\OpenAPI\Client\Model\FilesInfoSchema**](../Model/FilesInfoSchema.md)

### Authorization

[slackAuth](../../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `filesList()`

```php
filesList($token, $user, $channel, $ts_from, $ts_to, $types, $count, $page, $show_files_hidden_by_limit): \OpenAPI\Client\Model\FilesListSchema
```



List for a team, in a channel, or from a user with applied filters.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\FilesApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `files:read`
$user = 'user_example'; // string | Filter files created by a single user.
$channel = 'channel_example'; // string | Filter files appearing in a specific channel, indicated by its ID.
$ts_from = 3.4; // float | Filter files created after this timestamp (inclusive).
$ts_to = 3.4; // float | Filter files created before this timestamp (inclusive).
$types = 'types_example'; // string | Filter files by type ([see below](#file_types)). You can pass multiple values in the types argument, like `types=spaces,snippets`.The default value is `all`, which does not filter the list.
$count = 'count_example'; // string
$page = 'page_example'; // string
$show_files_hidden_by_limit = True; // bool | Show truncated file info for files hidden due to being too old, and the team who owns the file being over the file limit.

try {
    $result = $apiInstance->filesList($token, $user, $channel, $ts_from, $ts_to, $types, $count, $page, $show_files_hidden_by_limit);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling FilesApi->filesList: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;files:read&#x60; | [optional] |
| **user** | **string**| Filter files created by a single user. | [optional] |
| **channel** | **string**| Filter files appearing in a specific channel, indicated by its ID. | [optional] |
| **ts_from** | **float**| Filter files created after this timestamp (inclusive). | [optional] |
| **ts_to** | **float**| Filter files created before this timestamp (inclusive). | [optional] |
| **types** | **string**| Filter files by type ([see below](#file_types)). You can pass multiple values in the types argument, like &#x60;types&#x3D;spaces,snippets&#x60;.The default value is &#x60;all&#x60;, which does not filter the list. | [optional] |
| **count** | **string**|  | [optional] |
| **page** | **string**|  | [optional] |
| **show_files_hidden_by_limit** | **bool**| Show truncated file info for files hidden due to being too old, and the team who owns the file being over the file limit. | [optional] |

### Return type

[**\OpenAPI\Client\Model\FilesListSchema**](../Model/FilesListSchema.md)

### Authorization

[slackAuth](../../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

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


$apiInstance = new OpenAPI\Client\Api\FilesApi(
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
    echo 'Exception when calling FilesApi->filesRemoteAdd: ', $e->getMessage(), PHP_EOL;
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


$apiInstance = new OpenAPI\Client\Api\FilesApi(
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
    echo 'Exception when calling FilesApi->filesRemoteInfo: ', $e->getMessage(), PHP_EOL;
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


$apiInstance = new OpenAPI\Client\Api\FilesApi(
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
    echo 'Exception when calling FilesApi->filesRemoteList: ', $e->getMessage(), PHP_EOL;
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


$apiInstance = new OpenAPI\Client\Api\FilesApi(
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
    echo 'Exception when calling FilesApi->filesRemoteRemove: ', $e->getMessage(), PHP_EOL;
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


$apiInstance = new OpenAPI\Client\Api\FilesApi(
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
    echo 'Exception when calling FilesApi->filesRemoteShare: ', $e->getMessage(), PHP_EOL;
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


$apiInstance = new OpenAPI\Client\Api\FilesApi(
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
    echo 'Exception when calling FilesApi->filesRemoteUpdate: ', $e->getMessage(), PHP_EOL;
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

## `filesRevokePublicURL()`

```php
filesRevokePublicURL($token, $file): \OpenAPI\Client\Model\FilesRevokePublicURLSchema
```



Revokes public/external sharing access for a file

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\FilesApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `files:write:user`
$file = 'file_example'; // string | File to revoke

try {
    $result = $apiInstance->filesRevokePublicURL($token, $file);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling FilesApi->filesRevokePublicURL: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;files:write:user&#x60; | [optional] |
| **file** | **string**| File to revoke | [optional] |

### Return type

[**\OpenAPI\Client\Model\FilesRevokePublicURLSchema**](../Model/FilesRevokePublicURLSchema.md)

### Authorization

[slackAuth](../../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: `application/x-www-form-urlencoded`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `filesSharedPublicURL()`

```php
filesSharedPublicURL($token, $file): \OpenAPI\Client\Model\FilesSharedPublicURLSchema
```



Enables a file for public/external sharing.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\FilesApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `files:write:user`
$file = 'file_example'; // string | File to share

try {
    $result = $apiInstance->filesSharedPublicURL($token, $file);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling FilesApi->filesSharedPublicURL: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;files:write:user&#x60; | [optional] |
| **file** | **string**| File to share | [optional] |

### Return type

[**\OpenAPI\Client\Model\FilesSharedPublicURLSchema**](../Model/FilesSharedPublicURLSchema.md)

### Authorization

[slackAuth](../../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: `application/x-www-form-urlencoded`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `filesUpload()`

```php
filesUpload($channels, $content, $file, $filename, $filetype, $initial_comment, $thread_ts, $title, $token): \OpenAPI\Client\Model\FilesUploadSchema
```



Uploads or creates a file.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\FilesApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$channels = 'channels_example'; // string | Comma-separated list of channel names or IDs where the file will be shared.
$content = 'content_example'; // string | File contents via a POST variable. If omitting this parameter, you must provide a `file`.
$file = 'file_example'; // string | File contents via `multipart/form-data`. If omitting this parameter, you must submit `content`.
$filename = 'filename_example'; // string | Filename of file.
$filetype = 'filetype_example'; // string | A [file type](/types/file#file_types) identifier.
$initial_comment = 'initial_comment_example'; // string | The message text introducing the file in specified `channels`.
$thread_ts = 3.4; // float | Provide another message's `ts` value to upload this file as a reply. Never use a reply's `ts` value; use its parent instead.
$title = 'title_example'; // string | Title of file.
$token = 'token_example'; // string | Authentication token. Requires scope: `files:write:user`

try {
    $result = $apiInstance->filesUpload($channels, $content, $file, $filename, $filetype, $initial_comment, $thread_ts, $title, $token);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling FilesApi->filesUpload: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **channels** | **string**| Comma-separated list of channel names or IDs where the file will be shared. | [optional] |
| **content** | **string**| File contents via a POST variable. If omitting this parameter, you must provide a &#x60;file&#x60;. | [optional] |
| **file** | **string**| File contents via &#x60;multipart/form-data&#x60;. If omitting this parameter, you must submit &#x60;content&#x60;. | [optional] |
| **filename** | **string**| Filename of file. | [optional] |
| **filetype** | **string**| A [file type](/types/file#file_types) identifier. | [optional] |
| **initial_comment** | **string**| The message text introducing the file in specified &#x60;channels&#x60;. | [optional] |
| **thread_ts** | **float**| Provide another message&#39;s &#x60;ts&#x60; value to upload this file as a reply. Never use a reply&#39;s &#x60;ts&#x60; value; use its parent instead. | [optional] |
| **title** | **string**| Title of file. | [optional] |
| **token** | **string**| Authentication token. Requires scope: &#x60;files:write:user&#x60; | [optional] |

### Return type

[**\OpenAPI\Client\Model\FilesUploadSchema**](../Model/FilesUploadSchema.md)

### Authorization

[slackAuth](../../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: `application/x-www-form-urlencoded`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
