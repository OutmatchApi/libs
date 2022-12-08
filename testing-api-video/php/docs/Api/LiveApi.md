# OpenAPI\Client\LiveApi

All URIs are relative to https://ws.api.video, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**dELETELiveStreamsLiveStreamId()**](LiveApi.md#dELETELiveStreamsLiveStreamId) | **DELETE** /live-streams/{liveStreamId} | Delete a live stream |
| [**dELETELiveStreamsLiveStreamIdThumbnail()**](LiveApi.md#dELETELiveStreamsLiveStreamIdThumbnail) | **DELETE** /live-streams/{liveStreamId}/thumbnail | Delete a thumbnail |
| [**gETLiveStreams()**](LiveApi.md#gETLiveStreams) | **GET** /live-streams | List all live streams |
| [**gETLiveStreamsLiveStreamId()**](LiveApi.md#gETLiveStreamsLiveStreamId) | **GET** /live-streams/{liveStreamId} | Show live stream |
| [**pATCHLiveStreamsLiveStreamId()**](LiveApi.md#pATCHLiveStreamsLiveStreamId) | **PATCH** /live-streams/{liveStreamId} | Update a live stream |
| [**pOSTLiveStreams()**](LiveApi.md#pOSTLiveStreams) | **POST** /live-streams | Create live stream |
| [**pOSTLiveStreamsLiveStreamIdThumbnail()**](LiveApi.md#pOSTLiveStreamsLiveStreamIdThumbnail) | **POST** /live-streams/{liveStreamId}/thumbnail | Upload a thumbnail |


## `dELETELiveStreamsLiveStreamId()`

```php
dELETELiveStreamsLiveStreamId($live_stream_id)
```

Delete a live stream

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: bearerAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\LiveApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$live_stream_id = li400mYKSgQ6xs7taUeSaEKr; // string | The unique ID for the live stream that you want to remove.

try {
    $apiInstance->dELETELiveStreamsLiveStreamId($live_stream_id);
} catch (Exception $e) {
    echo 'Exception when calling LiveApi->dELETELiveStreamsLiveStreamId: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **live_stream_id** | **string**| The unique ID for the live stream that you want to remove. | |

### Return type

void (empty response body)

### Authorization

[bearerAuth](../../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `dELETELiveStreamsLiveStreamIdThumbnail()`

```php
dELETELiveStreamsLiveStreamIdThumbnail($live_stream_id): \OpenAPI\Client\Model\LiveStream
```

Delete a thumbnail

Send the unique identifier for a live stream to delete it from the system.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: bearerAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\LiveApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$live_stream_id = li400mYKSgQ6xs7taUeSaEKr; // string | The unique identifier for the live stream you want to delete.

try {
    $result = $apiInstance->dELETELiveStreamsLiveStreamIdThumbnail($live_stream_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling LiveApi->dELETELiveStreamsLiveStreamIdThumbnail: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **live_stream_id** | **string**| The unique identifier for the live stream you want to delete. | |

### Return type

[**\OpenAPI\Client\Model\LiveStream**](../Model/LiveStream.md)

### Authorization

[bearerAuth](../../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `gETLiveStreams()`

```php
gETLiveStreams($stream_key, $name, $sort_by, $sort_order, $current_page, $page_size): \OpenAPI\Client\Model\LiveStreamListResponse
```

List all live streams

With no parameters added to the url, this will return all livestreams. Query by name or key to limit the list.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: bearerAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\LiveApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);

$associative_array = [
    'stream_key' => 30087931-229e-42cf-b5f9-e91bcc1f7332, // string | The unique stream key that allows you to stream videos.
    'name' => My Video, // string | You can filter live streams by their name or a part of their name.
    'sort_by' => createdAt, // string | Allowed: createdAt, publishedAt, name. createdAt - the time a livestream was created using the specified streamKey. publishedAt - the time a livestream was published using the specified streamKey. name - the name of the livestream. If you choose one of the time based options, the time is presented in ISO-8601 format.
    'sort_order' => desc, // string | Allowed: asc, desc. Ascending for date and time means that earlier values precede later ones. Descending means that later values preced earlier ones. For title, it is 0-9 and A-Z ascending and Z-A, 9-0 descending.
    'current_page' => 2, // int | Choose the number of search results to return per page. Minimum value: 1
    'page_size' => 30, // int | Results per page. Allowed values 1-100, default is 25.
];

try {
    $result = $apiInstance->gETLiveStreams($associate_array);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling LiveApi->gETLiveStreams: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

Note: the input parameter is an associative array with the keys listed as the parameter names below.

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **stream_key** | **string**| The unique stream key that allows you to stream videos. | [optional] |
| **name** | **string**| You can filter live streams by their name or a part of their name. | [optional] |
| **sort_by** | **string**| Allowed: createdAt, publishedAt, name. createdAt - the time a livestream was created using the specified streamKey. publishedAt - the time a livestream was published using the specified streamKey. name - the name of the livestream. If you choose one of the time based options, the time is presented in ISO-8601 format. | [optional] |
| **sort_order** | **string**| Allowed: asc, desc. Ascending for date and time means that earlier values precede later ones. Descending means that later values preced earlier ones. For title, it is 0-9 and A-Z ascending and Z-A, 9-0 descending. | [optional] |
| **current_page** | **int**| Choose the number of search results to return per page. Minimum value: 1 | [optional] [default to 1] |
| **page_size** | **int**| Results per page. Allowed values 1-100, default is 25. | [optional] [default to 25] |

### Return type

[**\OpenAPI\Client\Model\LiveStreamListResponse**](../Model/LiveStreamListResponse.md)

### Authorization

[bearerAuth](../../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `gETLiveStreamsLiveStreamId()`

```php
gETLiveStreamsLiveStreamId($live_stream_id): \OpenAPI\Client\Model\LiveStream
```

Show live stream

Supply a LivestreamId, and you'll get all the details for streaming into, and watching the livestream. Tutorials that use the [show livestream endpoint](https://api.video/blog/endpoints/live-stream-status).

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: bearerAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\LiveApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$live_stream_id = li400mYKSgQ6xs7taUeSaEKr; // string | The unique ID for the live stream you want to watch.

try {
    $result = $apiInstance->gETLiveStreamsLiveStreamId($live_stream_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling LiveApi->gETLiveStreamsLiveStreamId: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **live_stream_id** | **string**| The unique ID for the live stream you want to watch. | |

### Return type

[**\OpenAPI\Client\Model\LiveStream**](../Model/LiveStream.md)

### Authorization

[bearerAuth](../../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `pATCHLiveStreamsLiveStreamId()`

```php
pATCHLiveStreamsLiveStreamId($live_stream_id, $live_stream_update_payload): \OpenAPI\Client\Model\LiveStream
```

Update a live stream

Use this endpoint to update the player, or to turn recording on/off (saving a copy of the livestream). NOTE: If the livestream is actively streaming, changing the recording status will only affect the NEXT stream.    The public=false 'private livestream' is available as a BETA feature, and should be limited to livestreams of 3,000 viewers or fewer.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: bearerAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\LiveApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$live_stream_id = li400mYKSgQ6xs7taUeSaEKr; // string | The unique ID for the live stream that you want to update information for such as player details, or whether you want the recording on or off.
$live_stream_update_payload = new \OpenAPI\Client\Model\LiveStreamUpdatePayload(); // \OpenAPI\Client\Model\LiveStreamUpdatePayload

try {
    $result = $apiInstance->pATCHLiveStreamsLiveStreamId($live_stream_id, $live_stream_update_payload);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling LiveApi->pATCHLiveStreamsLiveStreamId: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **live_stream_id** | **string**| The unique ID for the live stream that you want to update information for such as player details, or whether you want the recording on or off. | |
| **live_stream_update_payload** | [**\OpenAPI\Client\Model\LiveStreamUpdatePayload**](../Model/LiveStreamUpdatePayload.md)|  | [optional] |

### Return type

[**\OpenAPI\Client\Model\LiveStream**](../Model/LiveStream.md)

### Authorization

[bearerAuth](../../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `pOSTLiveStreams()`

```php
pOSTLiveStreams($live_stream_create_payload): \OpenAPI\Client\Model\LiveStream
```

Create live stream

A live stream will give you the 'connection point' to RTMP your video stream to api.video. It will also give you the details for viewers to watch the same livestream.  The public=false 'private livestream' is available as a BETA feature, and should be limited to livestreams of 3,000 viewers or fewer. See our [Live Stream Tutorial](https://api.video/blog/tutorials/live-stream-tutorial) for a walkthrough of this API with OBS. Your RTMP endpoint for the livestream is rtmp://broadcast.api.video/s/{streamKey} Tutorials that [create live streams](https://api.video/blog/endpoints/live-create).

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: bearerAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\LiveApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$live_stream_create_payload = new \OpenAPI\Client\Model\LiveStreamCreatePayload(); // \OpenAPI\Client\Model\LiveStreamCreatePayload

try {
    $result = $apiInstance->pOSTLiveStreams($live_stream_create_payload);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling LiveApi->pOSTLiveStreams: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **live_stream_create_payload** | [**\OpenAPI\Client\Model\LiveStreamCreatePayload**](../Model/LiveStreamCreatePayload.md)|  | [optional] |

### Return type

[**\OpenAPI\Client\Model\LiveStream**](../Model/LiveStream.md)

### Authorization

[bearerAuth](../../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `pOSTLiveStreamsLiveStreamIdThumbnail()`

```php
pOSTLiveStreamsLiveStreamIdThumbnail($live_stream_id, $file): \OpenAPI\Client\Model\LiveStream
```

Upload a thumbnail

Upload an image to use as a backdrop for your livestream. Tutorials that [update live stream thumbnails](https://api.video/blog/endpoints/live-upload-a-thumbnail).

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: bearerAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\LiveApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$live_stream_id = vi4k0jvEUuaTdRAEjQ4Jfrgz; // string | The unique ID for the live stream you want to upload.
$file = "/path/to/file.txt"; // \SplFileObject | The image to be added as a thumbnail.

try {
    $result = $apiInstance->pOSTLiveStreamsLiveStreamIdThumbnail($live_stream_id, $file);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling LiveApi->pOSTLiveStreamsLiveStreamIdThumbnail: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **live_stream_id** | **string**| The unique ID for the live stream you want to upload. | |
| **file** | **\SplFileObject****\SplFileObject**| The image to be added as a thumbnail. | |

### Return type

[**\OpenAPI\Client\Model\LiveStream**](../Model/LiveStream.md)

### Authorization

[bearerAuth](../../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: `multipart/form-data`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
