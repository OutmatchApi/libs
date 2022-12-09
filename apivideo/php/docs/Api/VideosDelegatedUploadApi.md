# OpenAPI\Client\VideosDelegatedUploadApi

All URIs are relative to https://ws.api.video, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**dELETEUploadTokensUploadToken()**](VideosDelegatedUploadApi.md#dELETEUploadTokensUploadToken) | **DELETE** /upload-tokens/{uploadToken} | Delete an upload token |
| [**gETUploadTokens()**](VideosDelegatedUploadApi.md#gETUploadTokens) | **GET** /upload-tokens | List all active upload tokens. |
| [**gETUploadTokensUploadToken()**](VideosDelegatedUploadApi.md#gETUploadTokensUploadToken) | **GET** /upload-tokens/{uploadToken} | Show upload token |
| [**pOSTUpload()**](VideosDelegatedUploadApi.md#pOSTUpload) | **POST** /upload | Upload with an upload token |
| [**pOSTUploadTokens()**](VideosDelegatedUploadApi.md#pOSTUploadTokens) | **POST** /upload-tokens | Generate an upload token |


## `dELETEUploadTokensUploadToken()`

```php
dELETEUploadTokensUploadToken($upload_token)
```

Delete an upload token

Delete an existing upload token. This is especially useful for tokens you may have created that do not expire.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: bearerAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\VideosDelegatedUploadApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$upload_token = to1tcmSFHeYY5KzyhOqVKMKb; // string | The unique identifier for the upload token you want to delete. Deleting a token will make it so the token can no longer be used for authentication.

try {
    $apiInstance->dELETEUploadTokensUploadToken($upload_token);
} catch (Exception $e) {
    echo 'Exception when calling VideosDelegatedUploadApi->dELETEUploadTokensUploadToken: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **upload_token** | **string**| The unique identifier for the upload token you want to delete. Deleting a token will make it so the token can no longer be used for authentication. | |

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

## `gETUploadTokens()`

```php
gETUploadTokens($sort_by, $sort_order, $current_page, $page_size): \OpenAPI\Client\Model\TokenListResponse
```

List all active upload tokens.

A delegated token is used to allow secure uploads without exposing your API key. Use this endpoint to retrieve a list of all currently active delegated tokens. Tutorials using [delegated upload](https://api.video/blog/endpoints/delegated-upload).

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: bearerAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\VideosDelegatedUploadApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);

$associative_array = [
    'sort_by' => ttl, // string | Allowed: createdAt, ttl. You can use these to sort by when a token was created, or how much longer the token will be active (ttl - time to live). Date and time is presented in ISO-8601 format.
    'sort_order' => asc, // string | Allowed: asc, desc. Ascending is 0-9 or A-Z. Descending is 9-0 or Z-A.
    'current_page' => 2, // int | Choose the number of search results to return per page. Minimum value: 1
    'page_size' => 30, // int | Results per page. Allowed values 1-100, default is 25.
];

try {
    $result = $apiInstance->gETUploadTokens($associate_array);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling VideosDelegatedUploadApi->gETUploadTokens: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

Note: the input parameter is an associative array with the keys listed as the parameter names below.

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sort_by** | **string**| Allowed: createdAt, ttl. You can use these to sort by when a token was created, or how much longer the token will be active (ttl - time to live). Date and time is presented in ISO-8601 format. | [optional] |
| **sort_order** | **string**| Allowed: asc, desc. Ascending is 0-9 or A-Z. Descending is 9-0 or Z-A. | [optional] |
| **current_page** | **int**| Choose the number of search results to return per page. Minimum value: 1 | [optional] [default to 1] |
| **page_size** | **int**| Results per page. Allowed values 1-100, default is 25. | [optional] [default to 25] |

### Return type

[**\OpenAPI\Client\Model\TokenListResponse**](../Model/TokenListResponse.md)

### Authorization

[bearerAuth](../../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `gETUploadTokensUploadToken()`

```php
gETUploadTokensUploadToken($upload_token): \OpenAPI\Client\Model\UploadToken
```

Show upload token

You can retrieve details about a specific upload token if you have the unique identifier for the upload token. Add it in the path of the endpoint. Details include time-to-live (ttl), when the token was created, and when it will expire.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: bearerAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\VideosDelegatedUploadApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$upload_token = to1tcmSFHeYY5KzyhOqVKMKb; // string | The unique identifier for the token you want information about.

try {
    $result = $apiInstance->gETUploadTokensUploadToken($upload_token);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling VideosDelegatedUploadApi->gETUploadTokensUploadToken: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **upload_token** | **string**| The unique identifier for the token you want information about. | |

### Return type

[**\OpenAPI\Client\Model\UploadToken**](../Model/UploadToken.md)

### Authorization

[bearerAuth](../../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `pOSTUpload()`

```php
pOSTUpload($token, $file, $content_range, $video_id): \OpenAPI\Client\Model\Video
```

Upload with an upload token

When given a token, anyone can upload a file to the URI `https://ws.api.video/upload?token=<tokenId>`.  Example with cURL:  ```curl $ curl  --request POST --url 'https://ws.api.video/upload?token=toXXX'  --header 'content-type: multipart/form-data'  -F file=@video.mp4 ```  Or in an HTML form, with a little JavaScript to convert the form into JSON: ```html <!--form for user interaction--> <form name=\"videoUploadForm\" >   <label for=video>Video:</label>   <input type=file name=source/><br/>   <input value=\"Submit\" type=\"submit\"> </form> <div></div> <!--JS takes the form data      uses FormData to turn the response into JSON.     then uses POST to upload the video file.     Update the token parameter in the url to your upload token.     --> <script>    var form = document.forms.namedItem(\"videoUploadForm\");     form.addEventListener('submit', function(ev) {   ev.preventDefault();      var oOutput = document.querySelector(\"div\"),          oData = new FormData(form);      var oReq = new XMLHttpRequest();         oReq.open(\"POST\", \"https://ws.api.video/upload?token=toXXX\", true);      oReq.send(oData);   oReq.onload = function(oEvent) {        if (oReq.status ==201) {          oOutput.innerHTML = \"Your video is uploaded!<br/>\"  + oReq.response;        } else {          oOutput.innerHTML = \"Error \" + oReq.status + \" occurred when trying to upload your file.<br />\";        }      };    }, false);  </script> ```   ### Dealing with large files  We have created a <a href='https://api.video/blog/tutorials/uploading-large-files-with-javascript'>tutorial</a> to walk through the steps required.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\VideosDelegatedUploadApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$token = to1tcmSFHeYY5KzyhOqVKMKb; // string | The unique identifier for the token you want to use to upload a video.
$file = "/path/to/file.txt"; // \SplFileObject | The path to the video you want to upload.
$content_range = Content-Range: bytes 200-100/5000; // string | Content-Range represents the range of bytes that will be returned as a result of the request. Byte ranges are inclusive, meaning that bytes 0-999 represents the first 1000 bytes in a file or object.
$video_id = 'video_id_example'; // string | The video id returned by the first call to this endpoint in a large video upload scenario.

try {
    $result = $apiInstance->pOSTUpload($token, $file, $content_range, $video_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling VideosDelegatedUploadApi->pOSTUpload: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| The unique identifier for the token you want to use to upload a video. | |
| **file** | **\SplFileObject****\SplFileObject**| The path to the video you want to upload. | |
| **content_range** | **string**| Content-Range represents the range of bytes that will be returned as a result of the request. Byte ranges are inclusive, meaning that bytes 0-999 represents the first 1000 bytes in a file or object. | [optional] |
| **video_id** | **string**| The video id returned by the first call to this endpoint in a large video upload scenario. | [optional] |

### Return type

[**\OpenAPI\Client\Model\Video**](../Model/Video.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: `multipart/form-data`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `pOSTUploadTokens()`

```php
pOSTUploadTokens($token_create_payload): \OpenAPI\Client\Model\UploadToken
```

Generate an upload token

Use this endpoint to generate an upload token. You can use this token to authenticate video uploads while keeping your API key safe. Tutorials using [delegated upload](https://api.video/blog/endpoints/delegated-upload).

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: bearerAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\VideosDelegatedUploadApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token_create_payload = new \OpenAPI\Client\Model\TokenCreatePayload(); // \OpenAPI\Client\Model\TokenCreatePayload

try {
    $result = $apiInstance->pOSTUploadTokens($token_create_payload);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling VideosDelegatedUploadApi->pOSTUploadTokens: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token_create_payload** | [**\OpenAPI\Client\Model\TokenCreatePayload**](../Model/TokenCreatePayload.md)|  | [optional] |

### Return type

[**\OpenAPI\Client\Model\UploadToken**](../Model/UploadToken.md)

### Authorization

[bearerAuth](../../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
