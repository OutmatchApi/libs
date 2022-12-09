# OpenAPI\Client\VideosApi

All URIs are relative to https://ws.api.video, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**dELETEVideo()**](VideosApi.md#dELETEVideo) | **DELETE** /videos/{videoId} | Delete a video |
| [**gETVideo()**](VideosApi.md#gETVideo) | **GET** /videos/{videoId} | Show a video |
| [**gETVideoStatus()**](VideosApi.md#gETVideoStatus) | **GET** /videos/{videoId}/status | Show video status |
| [**lISTVideos()**](VideosApi.md#lISTVideos) | **GET** /videos | List all videos |
| [**pATCHVideo()**](VideosApi.md#pATCHVideo) | **PATCH** /videos/{videoId} | Update a video |
| [**pATCHVideosVideoIdThumbnail()**](VideosApi.md#pATCHVideosVideoIdThumbnail) | **PATCH** /videos/{videoId}/thumbnail | Pick a thumbnail |
| [**pOSTVideo()**](VideosApi.md#pOSTVideo) | **POST** /videos | Create a video |
| [**pOSTVideosVideoIdSource()**](VideosApi.md#pOSTVideosVideoIdSource) | **POST** /videos/{videoId}/source | Upload a video |
| [**pOSTVideosVideoIdThumbnail()**](VideosApi.md#pOSTVideosVideoIdThumbnail) | **POST** /videos/{videoId}/thumbnail | Upload a thumbnail |


## `dELETEVideo()`

```php
dELETEVideo($video_id)
```

Delete a video

If you do not need a video any longer, you can send a request to delete it. All you need is the videoId. Tutorials using [video deletion](https://api.video/blog/endpoints/video-delete).

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: bearerAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\VideosApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$video_id = vi4k0jvEUuaTdRAEjQ4Jfrgz; // string | The video ID for the video you want to delete.

try {
    $apiInstance->dELETEVideo($video_id);
} catch (Exception $e) {
    echo 'Exception when calling VideosApi->dELETEVideo: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **video_id** | **string**| The video ID for the video you want to delete. | |

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

## `gETVideo()`

```php
gETVideo($video_id): \OpenAPI\Client\Model\Video
```

Show a video

This call provides the same JSON information provided on video creation. For private videos, it will generate a unique token url. Use this to retrieve any details you need about a video, or set up a private viewing URL. Tutorials using [video GET](https://api.video/blog/endpoints/video-get).

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: bearerAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\VideosApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$video_id = 'video_id_example'; // string | The unique identifier for the video you want details about.

try {
    $result = $apiInstance->gETVideo($video_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling VideosApi->gETVideo: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **video_id** | **string**| The unique identifier for the video you want details about. | |

### Return type

[**\OpenAPI\Client\Model\Video**](../Model/Video.md)

### Authorization

[bearerAuth](../../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `gETVideoStatus()`

```php
gETVideoStatus($video_id): \OpenAPI\Client\Model\Videostatus
```

Show video status

This API provides upload status & encoding status to determine when the video is uploaded or ready to playback. Once encoding is completed, the response also lists the available stream qualities. Tutorials using [video status](https://api.video/blog/endpoints/video-status).

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: bearerAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\VideosApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$video_id = vi4k0jvEUuaTdRAEjQ4Jfrgz; // string | The unique identifier for the video you want the status for.

try {
    $result = $apiInstance->gETVideoStatus($video_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling VideosApi->gETVideoStatus: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **video_id** | **string**| The unique identifier for the video you want the status for. | |

### Return type

[**\OpenAPI\Client\Model\Videostatus**](../Model/Videostatus.md)

### Authorization

[bearerAuth](../../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `lISTVideos()`

```php
lISTVideos($title, $tags, $metadata, $description, $live_stream_id, $sort_by, $sort_order, $current_page, $page_size): \OpenAPI\Client\Model\VideosListResponse
```

List all videos

Requests to this endpoint return a list of your videos (with all their details). With no parameters added to this query, the API returns all videos. You can filter what videos the API returns using the parameters described below.  We have [several tutorials](https://api.video/blog/endpoints/video-list) that demonstrate this endpoint.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: bearerAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\VideosApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);

$associative_array = [
    'title' => My Video.mp4, // string | The title of a specific video you want to find. The search will match exactly to what term you provide and return any videos that contain the same term as part of their titles.
    'tags' => "tags": ["captions", "dialogue"], // string[] | A tag is a category you create and apply to videos. You can search for videos with particular tags by listing one or more here. Only videos that have all the tags you list will be returned.
    'metadata' => [{"key":"Author", "value":"John Doe"}, {"key":"Format", "value":"Tutorial"}], // string[] | Videos can be tagged with metadata tags in key:value pairs. You can search for videos with specific key value pairs using this parameter. [Dynamic Metadata](https://api.video/blog/endpoints/dynamic-metadata) allows you to define a key that allows any value pair.
    'description' => New Zealand, // string | If you described a video with a term or sentence, you can add it here to return videos containing this string.
    'live_stream_id' => li400mYKSgQ6xs7taUeSaEKr, // string | If you know the ID for a live stream, you can retrieve the stream by adding the ID for it here.
    'sort_by' => publishedAt, // string | Allowed: publishedAt, title. You can search by the time videos were published at, or by title.
    'sort_order' => asc, // string | Allowed: asc, desc. asc is ascending and sorts from A to Z. desc is descending and sorts from Z to A.
    'current_page' => 2, // int | Choose the number of search results to return per page. Minimum value: 1
    'page_size' => 30, // int | Results per page. Allowed values 1-100, default is 25.
];

try {
    $result = $apiInstance->lISTVideos($associate_array);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling VideosApi->lISTVideos: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

Note: the input parameter is an associative array with the keys listed as the parameter names below.

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **title** | **string**| The title of a specific video you want to find. The search will match exactly to what term you provide and return any videos that contain the same term as part of their titles. | [optional] |
| **tags** | [**string[]**](../Model/string.md)| A tag is a category you create and apply to videos. You can search for videos with particular tags by listing one or more here. Only videos that have all the tags you list will be returned. | [optional] |
| **metadata** | [**string[]**](../Model/string.md)| Videos can be tagged with metadata tags in key:value pairs. You can search for videos with specific key value pairs using this parameter. [Dynamic Metadata](https://api.video/blog/endpoints/dynamic-metadata) allows you to define a key that allows any value pair. | [optional] |
| **description** | **string**| If you described a video with a term or sentence, you can add it here to return videos containing this string. | [optional] |
| **live_stream_id** | **string**| If you know the ID for a live stream, you can retrieve the stream by adding the ID for it here. | [optional] |
| **sort_by** | **string**| Allowed: publishedAt, title. You can search by the time videos were published at, or by title. | [optional] |
| **sort_order** | **string**| Allowed: asc, desc. asc is ascending and sorts from A to Z. desc is descending and sorts from Z to A. | [optional] |
| **current_page** | **int**| Choose the number of search results to return per page. Minimum value: 1 | [optional] [default to 1] |
| **page_size** | **int**| Results per page. Allowed values 1-100, default is 25. | [optional] [default to 25] |

### Return type

[**\OpenAPI\Client\Model\VideosListResponse**](../Model/VideosListResponse.md)

### Authorization

[bearerAuth](../../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `pATCHVideo()`

```php
pATCHVideo($video_id, $video_update_payload): \OpenAPI\Client\Model\Video
```

Update a video

Use this endpoint to update the parameters associated with your video. The video you are updating is determined by the video ID you provide in the path. For each parameter you want to update, include the update in the request body. NOTE: If you are updating an array, you must provide the entire array as what you provide here overwrites what is in the system rather than appending to it. Tutorials using [video update](https://api.video/blog/endpoints/video-update).

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: bearerAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\VideosApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$video_id = vi4k0jvEUuaTdRAEjQ4Jfrgz; // string | The video ID for the video you want to delete.
$video_update_payload = new \OpenAPI\Client\Model\VideoUpdatePayload(); // \OpenAPI\Client\Model\VideoUpdatePayload

try {
    $result = $apiInstance->pATCHVideo($video_id, $video_update_payload);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling VideosApi->pATCHVideo: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **video_id** | **string**| The video ID for the video you want to delete. | |
| **video_update_payload** | [**\OpenAPI\Client\Model\VideoUpdatePayload**](../Model/VideoUpdatePayload.md)|  | [optional] |

### Return type

[**\OpenAPI\Client\Model\Video**](../Model/Video.md)

### Authorization

[bearerAuth](../../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `pATCHVideosVideoIdThumbnail()`

```php
pATCHVideosVideoIdThumbnail($video_id, $video_thumbnail_pick_payload): \OpenAPI\Client\Model\Video
```

Pick a thumbnail

Pick a thumbnail from the given time code. If you'd like to upload an image for your thumbnail, use the [Upload a Thumbnail](https://docs.api.video/reference#post_videos-videoid-thumbnail) endpoint. There may be a short delay for the thumbnail to update. Tutorials using [Thumbnail picking](https://api.video/blog/endpoints/video-pick-a-thumbnail).

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: bearerAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\VideosApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$video_id = vi4k0jvEUuaTdRAEjQ4Jfrgz; // string | Unique identifier of the video you want to add a thumbnail to, where you use a section of your video as the thumbnail.
$video_thumbnail_pick_payload = new \OpenAPI\Client\Model\VideoThumbnailPickPayload(); // \OpenAPI\Client\Model\VideoThumbnailPickPayload

try {
    $result = $apiInstance->pATCHVideosVideoIdThumbnail($video_id, $video_thumbnail_pick_payload);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling VideosApi->pATCHVideosVideoIdThumbnail: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **video_id** | **string**| Unique identifier of the video you want to add a thumbnail to, where you use a section of your video as the thumbnail. | |
| **video_thumbnail_pick_payload** | [**\OpenAPI\Client\Model\VideoThumbnailPickPayload**](../Model/VideoThumbnailPickPayload.md)|  | [optional] |

### Return type

[**\OpenAPI\Client\Model\Video**](../Model/Video.md)

### Authorization

[bearerAuth](../../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `pOSTVideo()`

```php
pOSTVideo($video_create_payload): \OpenAPI\Client\Model\Video
```

Create a video

To create a video, you create its container&parameters first, before adding the video file (exception - when using an existing HTTP source). * Videos are public by default. [Learn about Private videos](https://api.video/blog/tutorials/tutorial-private-videos) * Up to 6 responsive video streams will be created (from 240p to 4k) * Mp4 encoded versions are created at the highest quality (max 1080p) by default. * Panoramic videos are for videos recorded in 360 degrees.  You can toggle this after your 360 video upload. * Searchable parameters: title, description, tags and metadata   ```shell $ curl https://ws.api.video/videos \\ -H 'Authorization: Bearer {access_token} \\ -d '{\"title\":\"My video\",       \"description\":\"so many details\",      \"mp4Support\":true }' ```    ## add an URL to upload on creation You can also create a video directly from a video hosted on a third-party server by giving its URI in `source` parameter: ```shell $ curl https://ws.api.video/videos \\ -H 'Authorization: Bearer {access_token} \\ -d '{\"source\":\"http://uri/to/video.mp4\", \"title\":\"My video\"}' ```  In this case, the service will respond `202 Accepted` and ingest the video asynchronously. ## Track users with Dynamic Metadata Metadata values can be a key:value where the values are predefined, but Dynamic metadata allows you to enter *any* value for a defined key.  To defined a dynamic metadata pair use: ``` \"metadata\":[{\"dynamicKey\": \"__dynamicKey__\"}] ```  The double underscore on both sides of the value allows any variable to be added for a given video session. Added the the url you might have: ``` <iframe type=\"text/html\" src=\"https://embed.api.video/vod/vi6QvU9dhYCzW3BpPvPsZUa8?metadata[classUserName]=Doug\" width=\"960\" height=\"320\" frameborder=\"0\" scrollling=\"no\"></iframe> ```   This video session will be tagged as watched by Doug - allowing for in-depth analysis on how each viewer interacts with the videos. ### We have tutorials on: * [Creating and uploading videos](https://api.video/blog/tutorials/video-upload-tutorial) * [Uploading large videos](https://api.video/blog/tutorials/video-upload-tutorial-large-videos)   * [Using tags with videos](https://api.video/blog/tutorials/video-tagging-best-practices) * [Private videos](https://api.video/blog/tutorials/tutorial-private-videos) * [Using Dynamic Metadata](https://api.video/blog/tutorials/dynamic-metadata)  * Full list of [tutorials](https://api.video/blog/endpoints/video-create) that demonstrate this endpoint.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: bearerAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\VideosApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$video_create_payload = new \OpenAPI\Client\Model\VideoCreatePayload(); // \OpenAPI\Client\Model\VideoCreatePayload | video to create

try {
    $result = $apiInstance->pOSTVideo($video_create_payload);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling VideosApi->pOSTVideo: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **video_create_payload** | [**\OpenAPI\Client\Model\VideoCreatePayload**](../Model/VideoCreatePayload.md)| video to create | [optional] |

### Return type

[**\OpenAPI\Client\Model\Video**](../Model/Video.md)

### Authorization

[bearerAuth](../../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `pOSTVideosVideoIdSource()`

```php
pOSTVideosVideoIdSource($video_id, $file, $content_range): \OpenAPI\Client\Model\Video
```

Upload a video

To upload a video to the videoId you created. Replace {videoId} with the id you'd like to use, {access_token} with your token, and /path/to/video.mp4 with the path to the video you'd like to upload. You can only upload your video to the videoId once. ```bash curl https://ws.api.video/videos/{videoId}/source \\   -H 'Authorization: Bearer {access_token}' \\   -F file=@/path/to/video.mp4    ``` Tutorials using [video upload](https://api.video/blog/endpoints/video-upload).

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: bearerAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\VideosApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$video_id = vi4k0jvEUuaTdRAEjQ4Jfrgz; // string | Enter the videoId you want to use to upload your video.
$file = "/path/to/file.txt"; // \SplFileObject | The path to the video you would like to upload. The path must be local. If you want to use a video from an online source, you must use the \\\"/videos\\\" endpoint and add the \\\"source\\\" parameter when you create a new video.
$content_range = Content-Range: bytes 200-100/5000; // string | Content-Range represents the range of bytes that will be returned as a result of the request. Byte ranges are inclusive, meaning that bytes 0-999 represents the first 1000 bytes in a file or object.

try {
    $result = $apiInstance->pOSTVideosVideoIdSource($video_id, $file, $content_range);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling VideosApi->pOSTVideosVideoIdSource: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **video_id** | **string**| Enter the videoId you want to use to upload your video. | |
| **file** | **\SplFileObject****\SplFileObject**| The path to the video you would like to upload. The path must be local. If you want to use a video from an online source, you must use the \\\&quot;/videos\\\&quot; endpoint and add the \\\&quot;source\\\&quot; parameter when you create a new video. | |
| **content_range** | **string**| Content-Range represents the range of bytes that will be returned as a result of the request. Byte ranges are inclusive, meaning that bytes 0-999 represents the first 1000 bytes in a file or object. | [optional] |

### Return type

[**\OpenAPI\Client\Model\Video**](../Model/Video.md)

### Authorization

[bearerAuth](../../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: `multipart/form-data`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `pOSTVideosVideoIdThumbnail()`

```php
pOSTVideosVideoIdThumbnail($video_id, $file): \OpenAPI\Client\Model\Video
```

Upload a thumbnail

The thumbnail is the poster that appears in the player window before video playback begins. This endpoint allows you to upload an image for the thumbnail. To select a still frame from the video using a time stamp, use [Pick a Thumbnail](https://docs.api.video/reference#patch_videos-videoid-thumbnail) to pick a time in the video.  Note: There may be a short delay before the new thumbnail is delivered to our CDN. Tutorials using [Thumbnail upload](https://api.video/blog/endpoints/videos-upload-a-thumbnail).

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: bearerAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\VideosApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$video_id = 'video_id_example'; // string | Unique identifier of the chosen video
$file = "/path/to/file.txt"; // \SplFileObject | The image to be added as a thumbnail.

try {
    $result = $apiInstance->pOSTVideosVideoIdThumbnail($video_id, $file);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling VideosApi->pOSTVideosVideoIdThumbnail: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **video_id** | **string**| Unique identifier of the chosen video | |
| **file** | **\SplFileObject****\SplFileObject**| The image to be added as a thumbnail. | |

### Return type

[**\OpenAPI\Client\Model\Video**](../Model/Video.md)

### Authorization

[bearerAuth](../../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: `multipart/form-data`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
