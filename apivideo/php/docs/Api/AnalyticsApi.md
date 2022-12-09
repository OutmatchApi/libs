# OpenAPI\Client\AnalyticsApi

All URIs are relative to https://ws.api.video, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**gETAnalyticsLiveStreamsLiveStreamId()**](AnalyticsApi.md#gETAnalyticsLiveStreamsLiveStreamId) | **GET** /analytics/live-streams/{liveStreamId} | List live stream player sessions |
| [**gETAnalyticsSessionsSessionIdEvents()**](AnalyticsApi.md#gETAnalyticsSessionsSessionIdEvents) | **GET** /analytics/sessions/{sessionId}/events | List player session events |
| [**gETAnalyticsVideosVideoId()**](AnalyticsApi.md#gETAnalyticsVideosVideoId) | **GET** /analytics/videos/{videoId} | List video player sessions |


## `gETAnalyticsLiveStreamsLiveStreamId()`

```php
gETAnalyticsLiveStreamsLiveStreamId($live_stream_id, $period, $current_page, $page_size): \OpenAPI\Client\Model\RawStatisticsListLiveStreamAnalyticsResponse
```

List live stream player sessions

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: bearerAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AnalyticsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);

$associative_array = [
    'live_stream_id' => vi4k0jvEUuaTdRAEjQ4Jfrgz, // string | The unique identifier for the live stream you want to retrieve analytics for.
    'period' => 2019-01-01T00:00:00.000Z, // string | Period must have one of the following formats:  - For a day : \"2018-01-01\", - For a week: \"2018-W01\",  - For a month: \"2018-01\" - For a year: \"2018\" For a range period:  -  Date range: \"2018-01-01/2018-01-15\"
    'current_page' => 2, // int | Choose the number of search results to return per page. Minimum value: 1
    'page_size' => 30, // int | Results per page. Allowed values 1-100, default is 25.
];

try {
    $result = $apiInstance->gETAnalyticsLiveStreamsLiveStreamId($associate_array);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AnalyticsApi->gETAnalyticsLiveStreamsLiveStreamId: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

Note: the input parameter is an associative array with the keys listed as the parameter names below.

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **live_stream_id** | **string**| The unique identifier for the live stream you want to retrieve analytics for. | |
| **period** | **string**| Period must have one of the following formats:  - For a day : \&quot;2018-01-01\&quot;, - For a week: \&quot;2018-W01\&quot;,  - For a month: \&quot;2018-01\&quot; - For a year: \&quot;2018\&quot; For a range period:  -  Date range: \&quot;2018-01-01/2018-01-15\&quot; | [optional] |
| **current_page** | **int**| Choose the number of search results to return per page. Minimum value: 1 | [optional] [default to 1] |
| **page_size** | **int**| Results per page. Allowed values 1-100, default is 25. | [optional] [default to 25] |

### Return type

[**\OpenAPI\Client\Model\RawStatisticsListLiveStreamAnalyticsResponse**](../Model/RawStatisticsListLiveStreamAnalyticsResponse.md)

### Authorization

[bearerAuth](../../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `gETAnalyticsSessionsSessionIdEvents()`

```php
gETAnalyticsSessionsSessionIdEvents($session_id, $current_page, $page_size): \OpenAPI\Client\Model\RawStatisticsListPlayerSessionEventsResponse
```

List player session events

Useful to track and measure video's engagement.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: bearerAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AnalyticsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);

$associative_array = [
    'session_id' => psEmFwGQUAXR2lFHj5nDOpy, // string | A unique identifier you can use to reference and track a session with.
    'current_page' => 2, // int | Choose the number of search results to return per page. Minimum value: 1
    'page_size' => 30, // int | Results per page. Allowed values 1-100, default is 25.
];

try {
    $result = $apiInstance->gETAnalyticsSessionsSessionIdEvents($associate_array);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AnalyticsApi->gETAnalyticsSessionsSessionIdEvents: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

Note: the input parameter is an associative array with the keys listed as the parameter names below.

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **session_id** | **string**| A unique identifier you can use to reference and track a session with. | |
| **current_page** | **int**| Choose the number of search results to return per page. Minimum value: 1 | [optional] [default to 1] |
| **page_size** | **int**| Results per page. Allowed values 1-100, default is 25. | [optional] [default to 25] |

### Return type

[**\OpenAPI\Client\Model\RawStatisticsListPlayerSessionEventsResponse**](../Model/RawStatisticsListPlayerSessionEventsResponse.md)

### Authorization

[bearerAuth](../../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `gETAnalyticsVideosVideoId()`

```php
gETAnalyticsVideosVideoId($video_id, $period, $metadata, $current_page, $page_size): \OpenAPI\Client\Model\RawStatisticsListSessionsResponse
```

List video player sessions

Retrieve all available user sessions for a specific video. Tutorials that use the [analytics endpoint](https://api.video/blog/endpoints/analytics).

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: bearerAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AnalyticsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);

$associative_array = [
    'video_id' => vi4k0jvEUuaTdRAEjQ4Prklg, // string | The unique identifier for the video you want to retrieve session information for.
    'period' => 'period_example', // string | Period must have one of the following formats:  - For a day : 2018-01-01, - For a week: 2018-W01,  - For a month: 2018-01 - For a year: 2018 For a range period:  -  Date range: 2018-01-01/2018-01-15
    'metadata' => [{"key": "Author", "value": "John Doe"}, {"key": "Format", "value": "Tutorial"}], // string[] | Metadata and [Dynamic Metadata](https://api.video/blog/endpoints/dynamic-metadata) filter. Send an array of key value pairs you want to filter sessios with.
    'current_page' => 2, // int | Choose the number of search results to return per page. Minimum value: 1
    'page_size' => 30, // int | Results per page. Allowed values 1-100, default is 25.
];

try {
    $result = $apiInstance->gETAnalyticsVideosVideoId($associate_array);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AnalyticsApi->gETAnalyticsVideosVideoId: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

Note: the input parameter is an associative array with the keys listed as the parameter names below.

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **video_id** | **string**| The unique identifier for the video you want to retrieve session information for. | |
| **period** | **string**| Period must have one of the following formats:  - For a day : 2018-01-01, - For a week: 2018-W01,  - For a month: 2018-01 - For a year: 2018 For a range period:  -  Date range: 2018-01-01/2018-01-15 | [optional] |
| **metadata** | [**string[]**](../Model/string.md)| Metadata and [Dynamic Metadata](https://api.video/blog/endpoints/dynamic-metadata) filter. Send an array of key value pairs you want to filter sessios with. | [optional] |
| **current_page** | **int**| Choose the number of search results to return per page. Minimum value: 1 | [optional] [default to 1] |
| **page_size** | **int**| Results per page. Allowed values 1-100, default is 25. | [optional] [default to 25] |

### Return type

[**\OpenAPI\Client\Model\RawStatisticsListSessionsResponse**](../Model/RawStatisticsListSessionsResponse.md)

### Authorization

[bearerAuth](../../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
