# OpenAPI\Client\ChaptersApi

All URIs are relative to https://ws.api.video, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**dELETEVideosVideoIdChaptersLanguage()**](ChaptersApi.md#dELETEVideosVideoIdChaptersLanguage) | **DELETE** /videos/{videoId}/chapters/{language} | Delete a chapter |
| [**gETVideosVideoIdChapters()**](ChaptersApi.md#gETVideosVideoIdChapters) | **GET** /videos/{videoId}/chapters | List video chapters |
| [**gETVideosVideoIdChaptersLanguage()**](ChaptersApi.md#gETVideosVideoIdChaptersLanguage) | **GET** /videos/{videoId}/chapters/{language} | Show a chapter |
| [**pOSTVideosVideoIdChaptersLanguage()**](ChaptersApi.md#pOSTVideosVideoIdChaptersLanguage) | **POST** /videos/{videoId}/chapters/{language} | Upload a chapter |


## `dELETEVideosVideoIdChaptersLanguage()`

```php
dELETEVideosVideoIdChaptersLanguage($video_id, $language)
```

Delete a chapter

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: bearerAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\ChaptersApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$video_id = vi4k0jvEUuaTdRAEjQ4Jfrgz; // string | The unique identifier for the video you want to delete a chapter from.
$language = en; // string | A valid [BCP 47](https://github.com/libyal/libfwnt/wiki/Language-Code-identifiers) language representation.

try {
    $apiInstance->dELETEVideosVideoIdChaptersLanguage($video_id, $language);
} catch (Exception $e) {
    echo 'Exception when calling ChaptersApi->dELETEVideosVideoIdChaptersLanguage: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **video_id** | **string**| The unique identifier for the video you want to delete a chapter from. | |
| **language** | **string**| A valid [BCP 47](https://github.com/libyal/libfwnt/wiki/Language-Code-identifiers) language representation. | |

### Return type

void (empty response body)

### Authorization

[bearerAuth](../../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `gETVideosVideoIdChapters()`

```php
gETVideosVideoIdChapters($video_id, $current_page, $page_size): \OpenAPI\Client\Model\ChaptersListResponse
```

List video chapters

Retrieve a list of all chapters for a specified video.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: bearerAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\ChaptersApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);

$associative_array = [
    'video_id' => vi4k0jvEUuaTdRAEjQ4Jfrgz, // string | The unique identifier for the video you want to retrieve a list of chapters for.
    'current_page' => 2, // int | Choose the number of search results to return per page. Minimum value: 1
    'page_size' => 30, // int | Results per page. Allowed values 1-100, default is 25.
];

try {
    $result = $apiInstance->gETVideosVideoIdChapters($associate_array);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ChaptersApi->gETVideosVideoIdChapters: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

Note: the input parameter is an associative array with the keys listed as the parameter names below.

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **video_id** | **string**| The unique identifier for the video you want to retrieve a list of chapters for. | |
| **current_page** | **int**| Choose the number of search results to return per page. Minimum value: 1 | [optional] [default to 1] |
| **page_size** | **int**| Results per page. Allowed values 1-100, default is 25. | [optional] [default to 25] |

### Return type

[**\OpenAPI\Client\Model\ChaptersListResponse**](../Model/ChaptersListResponse.md)

### Authorization

[bearerAuth](../../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `gETVideosVideoIdChaptersLanguage()`

```php
gETVideosVideoIdChaptersLanguage($video_id, $language): \OpenAPI\Client\Model\Chapter
```

Show a chapter

Chapters help your viewers find the sections of the video they are most interested in viewing. Tutorials that use the [chapters endpoint](https://api.video/blog/endpoints/chapters).

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: bearerAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\ChaptersApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$video_id = vi4k0jvEUuaTdRAEjQ4Jfrgz; // string | The unique identifier for the video you want to show a chapter for.
$language = en; // string | A valid [BCP 47](https://github.com/libyal/libfwnt/wiki/Language-Code-identifiers) language representation.

try {
    $result = $apiInstance->gETVideosVideoIdChaptersLanguage($video_id, $language);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ChaptersApi->gETVideosVideoIdChaptersLanguage: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **video_id** | **string**| The unique identifier for the video you want to show a chapter for. | |
| **language** | **string**| A valid [BCP 47](https://github.com/libyal/libfwnt/wiki/Language-Code-identifiers) language representation. | |

### Return type

[**\OpenAPI\Client\Model\Chapter**](../Model/Chapter.md)

### Authorization

[bearerAuth](../../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `pOSTVideosVideoIdChaptersLanguage()`

```php
pOSTVideosVideoIdChaptersLanguage($video_id, $language, $file): \OpenAPI\Client\Model\Chapter
```

Upload a chapter

Chapters help break the video into sections. Read our [tutorial](https://api.video/blog/tutorials/adding-chapters-to-your-videos) for more details.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: bearerAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\ChaptersApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$video_id = vi4k0jvEUuaTdRAEjQ4Jfrgz; // string | The unique identifier for the video you want to upload a chapter for.
$language = en; // string | A valid [BCP 47](https://github.com/libyal/libfwnt/wiki/Language-Code-identifiers) language representation.
$file = "/path/to/file.txt"; // \SplFileObject | The VTT file describing the chapters you want to upload.

try {
    $result = $apiInstance->pOSTVideosVideoIdChaptersLanguage($video_id, $language, $file);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ChaptersApi->pOSTVideosVideoIdChaptersLanguage: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **video_id** | **string**| The unique identifier for the video you want to upload a chapter for. | |
| **language** | **string**| A valid [BCP 47](https://github.com/libyal/libfwnt/wiki/Language-Code-identifiers) language representation. | |
| **file** | **\SplFileObject****\SplFileObject**| The VTT file describing the chapters you want to upload. | |

### Return type

[**\OpenAPI\Client\Model\Chapter**](../Model/Chapter.md)

### Authorization

[bearerAuth](../../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: `multipart/form-data`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
