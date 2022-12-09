# \AnalyticsApi

All URIs are relative to *https://ws.api.video*

Method | HTTP request | Description
------------- | ------------- | -------------
[**g_et_analytics_live_streams_live_stream_id**](AnalyticsApi.md#g_et_analytics_live_streams_live_stream_id) | **GET** /analytics/live-streams/{liveStreamId} | List live stream player sessions
[**g_et_analytics_sessions_session_id_events**](AnalyticsApi.md#g_et_analytics_sessions_session_id_events) | **GET** /analytics/sessions/{sessionId}/events | List player session events
[**g_et_analytics_videos_video_id**](AnalyticsApi.md#g_et_analytics_videos_video_id) | **GET** /analytics/videos/{videoId} | List video player sessions



## g_et_analytics_live_streams_live_stream_id

> crate::models::RawStatisticsListLiveStreamAnalyticsResponse g_et_analytics_live_streams_live_stream_id(live_stream_id, period, current_page, page_size)
List live stream player sessions

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**live_stream_id** | **String** | The unique identifier for the live stream you want to retrieve analytics for. | [required] |
**period** | Option<**String**> | Period must have one of the following formats:  - For a day : \"2018-01-01\", - For a week: \"2018-W01\",  - For a month: \"2018-01\" - For a year: \"2018\" For a range period:  -  Date range: \"2018-01-01/2018-01-15\"  |  |
**current_page** | Option<**i32**> | Choose the number of search results to return per page. Minimum value: 1 |  |[default to 1]
**page_size** | Option<**i32**> | Results per page. Allowed values 1-100, default is 25. |  |[default to 25]

### Return type

[**crate::models::RawStatisticsListLiveStreamAnalyticsResponse**](raw-statistics-list-live-stream-analytics-response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## g_et_analytics_sessions_session_id_events

> crate::models::RawStatisticsListPlayerSessionEventsResponse g_et_analytics_sessions_session_id_events(session_id, current_page, page_size)
List player session events

Useful to track and measure video's engagement.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**session_id** | **String** | A unique identifier you can use to reference and track a session with. | [required] |
**current_page** | Option<**i32**> | Choose the number of search results to return per page. Minimum value: 1 |  |[default to 1]
**page_size** | Option<**i32**> | Results per page. Allowed values 1-100, default is 25. |  |[default to 25]

### Return type

[**crate::models::RawStatisticsListPlayerSessionEventsResponse**](raw-statistics-list-player-session-events-response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## g_et_analytics_videos_video_id

> crate::models::RawStatisticsListSessionsResponse g_et_analytics_videos_video_id(video_id, period, metadata, current_page, page_size)
List video player sessions

Retrieve all available user sessions for a specific video. Tutorials that use the [analytics endpoint](https://api.video/blog/endpoints/analytics).

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**video_id** | **String** | The unique identifier for the video you want to retrieve session information for. | [required] |
**period** | Option<**String**> | Period must have one of the following formats:  - For a day : 2018-01-01, - For a week: 2018-W01,  - For a month: 2018-01 - For a year: 2018 For a range period:  -  Date range: 2018-01-01/2018-01-15  |  |
**metadata** | Option<[**Vec<String>**](String.md)> | Metadata and [Dynamic Metadata](https://api.video/blog/endpoints/dynamic-metadata) filter. Send an array of key value pairs you want to filter sessios with. |  |
**current_page** | Option<**i32**> | Choose the number of search results to return per page. Minimum value: 1 |  |[default to 1]
**page_size** | Option<**i32**> | Results per page. Allowed values 1-100, default is 25. |  |[default to 25]

### Return type

[**crate::models::RawStatisticsListSessionsResponse**](raw-statistics-list-sessions-response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

