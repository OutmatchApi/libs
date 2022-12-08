# OpenAPI\Client\FilesCommentsApi

All URIs are relative to https://slack.com/api, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**filesCommentsDelete()**](FilesCommentsApi.md#filesCommentsDelete) | **POST** /files.comments.delete |  |


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


$apiInstance = new OpenAPI\Client\Api\FilesCommentsApi(
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
    echo 'Exception when calling FilesCommentsApi->filesCommentsDelete: ', $e->getMessage(), PHP_EOL;
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
