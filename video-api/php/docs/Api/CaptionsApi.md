# OpenAPI\Client\CaptionsApi

All URIs are relative to https://ws.api.video, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**dELETEVideosVideoIdCaptionsLanguage()**](CaptionsApi.md#dELETEVideosVideoIdCaptionsLanguage) | **DELETE** /videos/{videoId}/captions/{language} | Delete a caption |
| [**gETVideosVideoIdCaptions()**](CaptionsApi.md#gETVideosVideoIdCaptions) | **GET** /videos/{videoId}/captions | List video captions |
| [**gETVideosVideoIdCaptionsLanguage()**](CaptionsApi.md#gETVideosVideoIdCaptionsLanguage) | **GET** /videos/{videoId}/captions/{language} | Show a caption |
| [**pATCHVideosVideoIdCaptionsLanguage()**](CaptionsApi.md#pATCHVideosVideoIdCaptionsLanguage) | **PATCH** /videos/{videoId}/captions/{language} | Update caption |
| [**pOSTVideosVideoIdCaptionsLanguage()**](CaptionsApi.md#pOSTVideosVideoIdCaptionsLanguage) | **POST** /videos/{videoId}/captions/{language} | Upload a caption |


## `dELETEVideosVideoIdCaptionsLanguage()`

```php
dELETEVideosVideoIdCaptionsLanguage($video_id, $language)
```

Delete a caption

Delete a caption in a specific language by providing the video ID for the video you want to delete the caption from and the language the caption is in.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: bearerAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\CaptionsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$video_id = vi4k0jvEUuaTdRAEjQ4Prklgc; // string | The unique identifier for the video you want to delete a caption from.
$language = en; // string | A valid [BCP 47](https://github.com/libyal/libfwnt/wiki/Language-Code-identifiers) language representation.

try {
    $apiInstance->dELETEVideosVideoIdCaptionsLanguage($video_id, $language);
} catch (Exception $e) {
    echo 'Exception when calling CaptionsApi->dELETEVideosVideoIdCaptionsLanguage: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **video_id** | **string**| The unique identifier for the video you want to delete a caption from. | |
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

## `gETVideosVideoIdCaptions()`

```php
gETVideosVideoIdCaptions($video_id, $current_page, $page_size): \OpenAPI\Client\Model\CaptionsListResponse
```

List video captions

Retrieve a list of available captions for the videoId you provide.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: bearerAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\CaptionsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);

$associative_array = [
    'video_id' => vi4k0jvEUuaTdRAEjQ4Prklg, // string | The unique identifier for the video you want to retrieve a list of captions for.
    'current_page' => 2, // int | Choose the number of search results to return per page. Minimum value: 1
    'page_size' => 30, // int | Results per page. Allowed values 1-100, default is 25.
];

try {
    $result = $apiInstance->gETVideosVideoIdCaptions($associate_array);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CaptionsApi->gETVideosVideoIdCaptions: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

Note: the input parameter is an associative array with the keys listed as the parameter names below.

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **video_id** | **string**| The unique identifier for the video you want to retrieve a list of captions for. | |
| **current_page** | **int**| Choose the number of search results to return per page. Minimum value: 1 | [optional] [default to 1] |
| **page_size** | **int**| Results per page. Allowed values 1-100, default is 25. | [optional] [default to 25] |

### Return type

[**\OpenAPI\Client\Model\CaptionsListResponse**](../Model/CaptionsListResponse.md)

### Authorization

[bearerAuth](../../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `gETVideosVideoIdCaptionsLanguage()`

```php
gETVideosVideoIdCaptionsLanguage($video_id, $language): \OpenAPI\Client\Model\Subtitle
```

Show a caption

Display a caption for a video in a specific language. If the language is available, the caption is returned. Otherwise, you will get a response indicating the caption was not found. Tutorials that use the [captions endpoint](https://api.video/blog/endpoints/captions).

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: bearerAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\CaptionsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$video_id = vi4k0jvEUuaTdRAEjQ4Prklg; // string | The unique identifier for the video you want captions for.
$language = en; // string | A valid [BCP 47](https://github.com/libyal/libfwnt/wiki/Language-Code-identifiers) language representation

try {
    $result = $apiInstance->gETVideosVideoIdCaptionsLanguage($video_id, $language);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CaptionsApi->gETVideosVideoIdCaptionsLanguage: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **video_id** | **string**| The unique identifier for the video you want captions for. | |
| **language** | **string**| A valid [BCP 47](https://github.com/libyal/libfwnt/wiki/Language-Code-identifiers) language representation | |

### Return type

[**\OpenAPI\Client\Model\Subtitle**](../Model/Subtitle.md)

### Authorization

[bearerAuth](../../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `pATCHVideosVideoIdCaptionsLanguage()`

```php
pATCHVideosVideoIdCaptionsLanguage($video_id, $language, $captions_update_payload): \OpenAPI\Client\Model\Subtitle
```

Update caption

To have the captions on automatically, use this PATCH to set default: true.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: bearerAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\CaptionsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$video_id = vi4k0jvEUuaTdRAEjQ4Prklg; // string | The unique identifier for the video you want to have automatic captions for.
$language = en; // string | A valid [BCP 47](https://github.com/libyal/libfwnt/wiki/Language-Code-identifiers) language representation.
$captions_update_payload = new \OpenAPI\Client\Model\CaptionsUpdatePayload(); // \OpenAPI\Client\Model\CaptionsUpdatePayload

try {
    $result = $apiInstance->pATCHVideosVideoIdCaptionsLanguage($video_id, $language, $captions_update_payload);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CaptionsApi->pATCHVideosVideoIdCaptionsLanguage: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **video_id** | **string**| The unique identifier for the video you want to have automatic captions for. | |
| **language** | **string**| A valid [BCP 47](https://github.com/libyal/libfwnt/wiki/Language-Code-identifiers) language representation. | |
| **captions_update_payload** | [**\OpenAPI\Client\Model\CaptionsUpdatePayload**](../Model/CaptionsUpdatePayload.md)|  | [optional] |

### Return type

[**\OpenAPI\Client\Model\Subtitle**](../Model/Subtitle.md)

### Authorization

[bearerAuth](../../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `pOSTVideosVideoIdCaptionsLanguage()`

```php
pOSTVideosVideoIdCaptionsLanguage($video_id, $language, $file): \OpenAPI\Client\Model\Subtitle
```

Upload a caption

Upload a VTT file to add captions to your video.  Read our [captioning tutorial](https://api.video/blog/tutorials/adding-captions) for more details.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: bearerAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\CaptionsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$video_id = vi4k0jvEUuaTdRAEjQ4Prklg; // string | The unique identifier for the video you want to add a caption to.
$language = en; // string | A valid BCP 47 language representation.
$file = "/path/to/file.txt"; // \SplFileObject | The video text track (VTT) you want to upload.

try {
    $result = $apiInstance->pOSTVideosVideoIdCaptionsLanguage($video_id, $language, $file);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CaptionsApi->pOSTVideosVideoIdCaptionsLanguage: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **video_id** | **string**| The unique identifier for the video you want to add a caption to. | |
| **language** | **string**| A valid BCP 47 language representation. | |
| **file** | **\SplFileObject****\SplFileObject**| The video text track (VTT) you want to upload. | |

### Return type

[**\OpenAPI\Client\Model\Subtitle**](../Model/Subtitle.md)

### Authorization

[bearerAuth](../../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: `multipart/form-data`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
