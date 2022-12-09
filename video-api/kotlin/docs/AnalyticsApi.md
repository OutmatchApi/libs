# AnalyticsApi

All URIs are relative to *https://ws.api.video*

Method | HTTP request | Description
------------- | ------------- | -------------
[**gETAnalyticsLiveStreamsLiveStreamId**](AnalyticsApi.md#gETAnalyticsLiveStreamsLiveStreamId) | **GET** /analytics/live-streams/{liveStreamId} | List live stream player sessions
[**gETAnalyticsSessionsSessionIdEvents**](AnalyticsApi.md#gETAnalyticsSessionsSessionIdEvents) | **GET** /analytics/sessions/{sessionId}/events | List player session events
[**gETAnalyticsVideosVideoId**](AnalyticsApi.md#gETAnalyticsVideosVideoId) | **GET** /analytics/videos/{videoId} | List video player sessions


<a name="gETAnalyticsLiveStreamsLiveStreamId"></a>
# **gETAnalyticsLiveStreamsLiveStreamId**
> RawMinusStatisticsMinusListMinusLiveMinusStreamMinusAnalyticsMinusResponse gETAnalyticsLiveStreamsLiveStreamId(liveStreamId, period, currentPage, pageSize)

List live stream player sessions

### Example
```kotlin
// Import classes:
//import video-api.infrastructure.*
//import com.outmatchapi.video-api.*

val apiInstance = AnalyticsApi()
val liveStreamId : kotlin.String = vi4k0jvEUuaTdRAEjQ4Jfrgz // kotlin.String | The unique identifier for the live stream you want to retrieve analytics for.
val period : kotlin.String = 2019-01-01T00:00:00.000Z // kotlin.String | Period must have one of the following formats:  - For a day : \"2018-01-01\", - For a week: \"2018-W01\",  - For a month: \"2018-01\" - For a year: \"2018\" For a range period:  -  Date range: \"2018-01-01/2018-01-15\" 
val currentPage : kotlin.Int = 2 // kotlin.Int | Choose the number of search results to return per page. Minimum value: 1
val pageSize : kotlin.Int = 30 // kotlin.Int | Results per page. Allowed values 1-100, default is 25.
try {
    val result : RawMinusStatisticsMinusListMinusLiveMinusStreamMinusAnalyticsMinusResponse = apiInstance.gETAnalyticsLiveStreamsLiveStreamId(liveStreamId, period, currentPage, pageSize)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AnalyticsApi#gETAnalyticsLiveStreamsLiveStreamId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AnalyticsApi#gETAnalyticsLiveStreamsLiveStreamId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **liveStreamId** | **kotlin.String**| The unique identifier for the live stream you want to retrieve analytics for. |
 **period** | **kotlin.String**| Period must have one of the following formats:  - For a day : \&quot;2018-01-01\&quot;, - For a week: \&quot;2018-W01\&quot;,  - For a month: \&quot;2018-01\&quot; - For a year: \&quot;2018\&quot; For a range period:  -  Date range: \&quot;2018-01-01/2018-01-15\&quot;  | [optional]
 **currentPage** | **kotlin.Int**| Choose the number of search results to return per page. Minimum value: 1 | [optional] [default to 1]
 **pageSize** | **kotlin.Int**| Results per page. Allowed values 1-100, default is 25. | [optional] [default to 25]

### Return type

[**RawMinusStatisticsMinusListMinusLiveMinusStreamMinusAnalyticsMinusResponse**](RawMinusStatisticsMinusListMinusLiveMinusStreamMinusAnalyticsMinusResponse.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETAnalyticsSessionsSessionIdEvents"></a>
# **gETAnalyticsSessionsSessionIdEvents**
> RawMinusStatisticsMinusListMinusPlayerMinusSessionMinusEventsMinusResponse gETAnalyticsSessionsSessionIdEvents(sessionId, currentPage, pageSize)

List player session events

Useful to track and measure video&#39;s engagement.

### Example
```kotlin
// Import classes:
//import video-api.infrastructure.*
//import com.outmatchapi.video-api.*

val apiInstance = AnalyticsApi()
val sessionId : kotlin.String = psEmFwGQUAXR2lFHj5nDOpy // kotlin.String | A unique identifier you can use to reference and track a session with.
val currentPage : kotlin.Int = 2 // kotlin.Int | Choose the number of search results to return per page. Minimum value: 1
val pageSize : kotlin.Int = 30 // kotlin.Int | Results per page. Allowed values 1-100, default is 25.
try {
    val result : RawMinusStatisticsMinusListMinusPlayerMinusSessionMinusEventsMinusResponse = apiInstance.gETAnalyticsSessionsSessionIdEvents(sessionId, currentPage, pageSize)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AnalyticsApi#gETAnalyticsSessionsSessionIdEvents")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AnalyticsApi#gETAnalyticsSessionsSessionIdEvents")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionId** | **kotlin.String**| A unique identifier you can use to reference and track a session with. |
 **currentPage** | **kotlin.Int**| Choose the number of search results to return per page. Minimum value: 1 | [optional] [default to 1]
 **pageSize** | **kotlin.Int**| Results per page. Allowed values 1-100, default is 25. | [optional] [default to 25]

### Return type

[**RawMinusStatisticsMinusListMinusPlayerMinusSessionMinusEventsMinusResponse**](RawMinusStatisticsMinusListMinusPlayerMinusSessionMinusEventsMinusResponse.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETAnalyticsVideosVideoId"></a>
# **gETAnalyticsVideosVideoId**
> RawMinusStatisticsMinusListMinusSessionsMinusResponse gETAnalyticsVideosVideoId(videoId, period, metadata, currentPage, pageSize)

List video player sessions

Retrieve all available user sessions for a specific video. Tutorials that use the [analytics endpoint](https://api.video/blog/endpoints/analytics).

### Example
```kotlin
// Import classes:
//import video-api.infrastructure.*
//import com.outmatchapi.video-api.*

val apiInstance = AnalyticsApi()
val videoId : kotlin.String = vi4k0jvEUuaTdRAEjQ4Prklg // kotlin.String | The unique identifier for the video you want to retrieve session information for.
val period : kotlin.String = period_example // kotlin.String | Period must have one of the following formats:  - For a day : 2018-01-01, - For a week: 2018-W01,  - For a month: 2018-01 - For a year: 2018 For a range period:  -  Date range: 2018-01-01/2018-01-15 
val metadata : kotlin.collections.List<kotlin.String> = [{"key": "Author", "value": "John Doe"}, {"key": "Format", "value": "Tutorial"}] // kotlin.collections.List<kotlin.String> | Metadata and [Dynamic Metadata](https://api.video/blog/endpoints/dynamic-metadata) filter. Send an array of key value pairs you want to filter sessios with.
val currentPage : kotlin.Int = 2 // kotlin.Int | Choose the number of search results to return per page. Minimum value: 1
val pageSize : kotlin.Int = 30 // kotlin.Int | Results per page. Allowed values 1-100, default is 25.
try {
    val result : RawMinusStatisticsMinusListMinusSessionsMinusResponse = apiInstance.gETAnalyticsVideosVideoId(videoId, period, metadata, currentPage, pageSize)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AnalyticsApi#gETAnalyticsVideosVideoId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AnalyticsApi#gETAnalyticsVideosVideoId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **videoId** | **kotlin.String**| The unique identifier for the video you want to retrieve session information for. |
 **period** | **kotlin.String**| Period must have one of the following formats:  - For a day : 2018-01-01, - For a week: 2018-W01,  - For a month: 2018-01 - For a year: 2018 For a range period:  -  Date range: 2018-01-01/2018-01-15  | [optional]
 **metadata** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| Metadata and [Dynamic Metadata](https://api.video/blog/endpoints/dynamic-metadata) filter. Send an array of key value pairs you want to filter sessios with. | [optional]
 **currentPage** | **kotlin.Int**| Choose the number of search results to return per page. Minimum value: 1 | [optional] [default to 1]
 **pageSize** | **kotlin.Int**| Results per page. Allowed values 1-100, default is 25. | [optional] [default to 25]

### Return type

[**RawMinusStatisticsMinusListMinusSessionsMinusResponse**](RawMinusStatisticsMinusListMinusSessionsMinusResponse.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

