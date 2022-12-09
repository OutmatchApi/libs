# video-api::AnalyticsApi

All URIs are relative to *https://ws.api.video*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**g_et_analytics_live_streams_live_stream_id**](AnalyticsApi.md#g_et_analytics_live_streams_live_stream_id) | **GET** /analytics/live-streams/{liveStreamId} | List live stream player sessions |
| [**g_et_analytics_sessions_session_id_events**](AnalyticsApi.md#g_et_analytics_sessions_session_id_events) | **GET** /analytics/sessions/{sessionId}/events | List player session events |
| [**g_et_analytics_videos_video_id**](AnalyticsApi.md#g_et_analytics_videos_video_id) | **GET** /analytics/videos/{videoId} | List video player sessions |


## g_et_analytics_live_streams_live_stream_id

> <RawStatisticsListLiveStreamAnalyticsResponse> g_et_analytics_live_streams_live_stream_id(opts)

List live stream player sessions

### Examples

```ruby
require 'time'
require 'video-api'
# setup authorization
video-api.configure do |config|
  # Configure Bearer authorization: bearerAuth
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = video-api::AnalyticsApi.new
opts = {
    live_stream_id: 'vi4k0jvEUuaTdRAEjQ4Jfrgz', # String | The unique identifier for the live stream you want to retrieve analytics for. (required)
    period: '2019-01-01T00:00:00.000Z', # String | Period must have one of the following formats:  - For a day : \"2018-01-01\", - For a week: \"2018-W01\",  - For a month: \"2018-01\" - For a year: \"2018\" For a range period:  -  Date range: \"2018-01-01/2018-01-15\" 
    current_page: 2, # Integer | Choose the number of search results to return per page. Minimum value: 1
    page_size: 30, # Integer | Results per page. Allowed values 1-100, default is 25.
}

begin
  # List live stream player sessions
  result = api_instance.g_et_analytics_live_streams_live_stream_id(opts)
  p result
rescue video-api::ApiError => e
  puts "Error when calling AnalyticsApi->g_et_analytics_live_streams_live_stream_id: #{e}"
end
```

#### Using the g_et_analytics_live_streams_live_stream_id_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<RawStatisticsListLiveStreamAnalyticsResponse>, Integer, Hash)> g_et_analytics_live_streams_live_stream_id_with_http_info(opts)

```ruby
begin
  # List live stream player sessions
  data, status_code, headers = api_instance.g_et_analytics_live_streams_live_stream_id_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <RawStatisticsListLiveStreamAnalyticsResponse>
rescue video-api::ApiError => e
  puts "Error when calling AnalyticsApi->g_et_analytics_live_streams_live_stream_id_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **live_stream_id** | **String** | The unique identifier for the live stream you want to retrieve analytics for. |  |
| **period** | **String** | Period must have one of the following formats:  - For a day : \&quot;2018-01-01\&quot;, - For a week: \&quot;2018-W01\&quot;,  - For a month: \&quot;2018-01\&quot; - For a year: \&quot;2018\&quot; For a range period:  -  Date range: \&quot;2018-01-01/2018-01-15\&quot;  | [optional] |
| **current_page** | **Integer** | Choose the number of search results to return per page. Minimum value: 1 | [optional][default to 1] |
| **page_size** | **Integer** | Results per page. Allowed values 1-100, default is 25. | [optional][default to 25] |

### Return type

[**RawStatisticsListLiveStreamAnalyticsResponse**](RawStatisticsListLiveStreamAnalyticsResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## g_et_analytics_sessions_session_id_events

> <RawStatisticsListPlayerSessionEventsResponse> g_et_analytics_sessions_session_id_events(opts)

List player session events

Useful to track and measure video's engagement.

### Examples

```ruby
require 'time'
require 'video-api'
# setup authorization
video-api.configure do |config|
  # Configure Bearer authorization: bearerAuth
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = video-api::AnalyticsApi.new
opts = {
    session_id: 'psEmFwGQUAXR2lFHj5nDOpy', # String | A unique identifier you can use to reference and track a session with. (required)
    current_page: 2, # Integer | Choose the number of search results to return per page. Minimum value: 1
    page_size: 30, # Integer | Results per page. Allowed values 1-100, default is 25.
}

begin
  # List player session events
  result = api_instance.g_et_analytics_sessions_session_id_events(opts)
  p result
rescue video-api::ApiError => e
  puts "Error when calling AnalyticsApi->g_et_analytics_sessions_session_id_events: #{e}"
end
```

#### Using the g_et_analytics_sessions_session_id_events_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<RawStatisticsListPlayerSessionEventsResponse>, Integer, Hash)> g_et_analytics_sessions_session_id_events_with_http_info(opts)

```ruby
begin
  # List player session events
  data, status_code, headers = api_instance.g_et_analytics_sessions_session_id_events_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <RawStatisticsListPlayerSessionEventsResponse>
rescue video-api::ApiError => e
  puts "Error when calling AnalyticsApi->g_et_analytics_sessions_session_id_events_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **session_id** | **String** | A unique identifier you can use to reference and track a session with. |  |
| **current_page** | **Integer** | Choose the number of search results to return per page. Minimum value: 1 | [optional][default to 1] |
| **page_size** | **Integer** | Results per page. Allowed values 1-100, default is 25. | [optional][default to 25] |

### Return type

[**RawStatisticsListPlayerSessionEventsResponse**](RawStatisticsListPlayerSessionEventsResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## g_et_analytics_videos_video_id

> <RawStatisticsListSessionsResponse> g_et_analytics_videos_video_id(opts)

List video player sessions

Retrieve all available user sessions for a specific video. Tutorials that use the [analytics endpoint](https://api.video/blog/endpoints/analytics).

### Examples

```ruby
require 'time'
require 'video-api'
# setup authorization
video-api.configure do |config|
  # Configure Bearer authorization: bearerAuth
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = video-api::AnalyticsApi.new
opts = {
    video_id: 'vi4k0jvEUuaTdRAEjQ4Prklg', # String | The unique identifier for the video you want to retrieve session information for. (required)
    period: 'period_example', # String | Period must have one of the following formats:  - For a day : 2018-01-01, - For a week: 2018-W01,  - For a month: 2018-01 - For a year: 2018 For a range period:  -  Date range: 2018-01-01/2018-01-15 
    metadata: ['inner_example'], # Array<String> | Metadata and [Dynamic Metadata](https://api.video/blog/endpoints/dynamic-metadata) filter. Send an array of key value pairs you want to filter sessios with.
    current_page: 2, # Integer | Choose the number of search results to return per page. Minimum value: 1
    page_size: 30, # Integer | Results per page. Allowed values 1-100, default is 25.
}

begin
  # List video player sessions
  result = api_instance.g_et_analytics_videos_video_id(opts)
  p result
rescue video-api::ApiError => e
  puts "Error when calling AnalyticsApi->g_et_analytics_videos_video_id: #{e}"
end
```

#### Using the g_et_analytics_videos_video_id_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<RawStatisticsListSessionsResponse>, Integer, Hash)> g_et_analytics_videos_video_id_with_http_info(opts)

```ruby
begin
  # List video player sessions
  data, status_code, headers = api_instance.g_et_analytics_videos_video_id_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <RawStatisticsListSessionsResponse>
rescue video-api::ApiError => e
  puts "Error when calling AnalyticsApi->g_et_analytics_videos_video_id_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **video_id** | **String** | The unique identifier for the video you want to retrieve session information for. |  |
| **period** | **String** | Period must have one of the following formats:  - For a day : 2018-01-01, - For a week: 2018-W01,  - For a month: 2018-01 - For a year: 2018 For a range period:  -  Date range: 2018-01-01/2018-01-15  | [optional] |
| **metadata** | [**Array&lt;String&gt;**](String.md) | Metadata and [Dynamic Metadata](https://api.video/blog/endpoints/dynamic-metadata) filter. Send an array of key value pairs you want to filter sessios with. | [optional] |
| **current_page** | **Integer** | Choose the number of search results to return per page. Minimum value: 1 | [optional][default to 1] |
| **page_size** | **Integer** | Results per page. Allowed values 1-100, default is 25. | [optional][default to 25] |

### Return type

[**RawStatisticsListSessionsResponse**](RawStatisticsListSessionsResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

