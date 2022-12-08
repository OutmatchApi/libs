# \AnalyticsApi

All URIs are relative to *https://ws.api.video*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GETAnalyticsLiveStreamsLiveStreamId**](AnalyticsApi.md#GETAnalyticsLiveStreamsLiveStreamId) | **Get** /analytics/live-streams/{liveStreamId} | List live stream player sessions
[**GETAnalyticsSessionsSessionIdEvents**](AnalyticsApi.md#GETAnalyticsSessionsSessionIdEvents) | **Get** /analytics/sessions/{sessionId}/events | List player session events
[**GETAnalyticsVideosVideoId**](AnalyticsApi.md#GETAnalyticsVideosVideoId) | **Get** /analytics/videos/{videoId} | List video player sessions



## GETAnalyticsLiveStreamsLiveStreamId

> RawStatisticsListLiveStreamAnalyticsResponse GETAnalyticsLiveStreamsLiveStreamId(ctx, liveStreamId).Period(period).CurrentPage(currentPage).PageSize(pageSize).Execute()

List live stream player sessions

### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    openapiclient "./openapi"
)

func main() {
    liveStreamId := "vi4k0jvEUuaTdRAEjQ4Jfrgz" // string | The unique identifier for the live stream you want to retrieve analytics for.
    period := "2019-01-01T00:00:00.000Z" // string | Period must have one of the following formats:  - For a day : \"2018-01-01\", - For a week: \"2018-W01\",  - For a month: \"2018-01\" - For a year: \"2018\" For a range period:  -  Date range: \"2018-01-01/2018-01-15\"  (optional)
    currentPage := int32(2) // int32 | Choose the number of search results to return per page. Minimum value: 1 (optional) (default to 1)
    pageSize := int32(30) // int32 | Results per page. Allowed values 1-100, default is 25. (optional) (default to 25)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.AnalyticsApi.GETAnalyticsLiveStreamsLiveStreamId(context.Background(), liveStreamId).Period(period).CurrentPage(currentPage).PageSize(pageSize).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `AnalyticsApi.GETAnalyticsLiveStreamsLiveStreamId``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GETAnalyticsLiveStreamsLiveStreamId`: RawStatisticsListLiveStreamAnalyticsResponse
    fmt.Fprintf(os.Stdout, "Response from `AnalyticsApi.GETAnalyticsLiveStreamsLiveStreamId`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**liveStreamId** | **string** | The unique identifier for the live stream you want to retrieve analytics for. | 

### Other Parameters

Other parameters are passed through a pointer to a apiGETAnalyticsLiveStreamsLiveStreamIdRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **period** | **string** | Period must have one of the following formats:  - For a day : \&quot;2018-01-01\&quot;, - For a week: \&quot;2018-W01\&quot;,  - For a month: \&quot;2018-01\&quot; - For a year: \&quot;2018\&quot; For a range period:  -  Date range: \&quot;2018-01-01/2018-01-15\&quot;  | 
 **currentPage** | **int32** | Choose the number of search results to return per page. Minimum value: 1 | [default to 1]
 **pageSize** | **int32** | Results per page. Allowed values 1-100, default is 25. | [default to 25]

### Return type

[**RawStatisticsListLiveStreamAnalyticsResponse**](RawStatisticsListLiveStreamAnalyticsResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GETAnalyticsSessionsSessionIdEvents

> RawStatisticsListPlayerSessionEventsResponse GETAnalyticsSessionsSessionIdEvents(ctx, sessionId).CurrentPage(currentPage).PageSize(pageSize).Execute()

List player session events



### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    openapiclient "./openapi"
)

func main() {
    sessionId := "psEmFwGQUAXR2lFHj5nDOpy" // string | A unique identifier you can use to reference and track a session with.
    currentPage := int32(2) // int32 | Choose the number of search results to return per page. Minimum value: 1 (optional) (default to 1)
    pageSize := int32(30) // int32 | Results per page. Allowed values 1-100, default is 25. (optional) (default to 25)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.AnalyticsApi.GETAnalyticsSessionsSessionIdEvents(context.Background(), sessionId).CurrentPage(currentPage).PageSize(pageSize).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `AnalyticsApi.GETAnalyticsSessionsSessionIdEvents``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GETAnalyticsSessionsSessionIdEvents`: RawStatisticsListPlayerSessionEventsResponse
    fmt.Fprintf(os.Stdout, "Response from `AnalyticsApi.GETAnalyticsSessionsSessionIdEvents`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**sessionId** | **string** | A unique identifier you can use to reference and track a session with. | 

### Other Parameters

Other parameters are passed through a pointer to a apiGETAnalyticsSessionsSessionIdEventsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **currentPage** | **int32** | Choose the number of search results to return per page. Minimum value: 1 | [default to 1]
 **pageSize** | **int32** | Results per page. Allowed values 1-100, default is 25. | [default to 25]

### Return type

[**RawStatisticsListPlayerSessionEventsResponse**](RawStatisticsListPlayerSessionEventsResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GETAnalyticsVideosVideoId

> RawStatisticsListSessionsResponse GETAnalyticsVideosVideoId(ctx, videoId).Period(period).Metadata(metadata).CurrentPage(currentPage).PageSize(pageSize).Execute()

List video player sessions



### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    openapiclient "./openapi"
)

func main() {
    videoId := "vi4k0jvEUuaTdRAEjQ4Prklg" // string | The unique identifier for the video you want to retrieve session information for.
    period := "period_example" // string | Period must have one of the following formats:  - For a day : 2018-01-01, - For a week: 2018-W01,  - For a month: 2018-01 - For a year: 2018 For a range period:  -  Date range: 2018-01-01/2018-01-15  (optional)
    metadata := []string{"Inner_example"} // []string | Metadata and [Dynamic Metadata](https://api.video/blog/endpoints/dynamic-metadata) filter. Send an array of key value pairs you want to filter sessios with. (optional)
    currentPage := int32(2) // int32 | Choose the number of search results to return per page. Minimum value: 1 (optional) (default to 1)
    pageSize := int32(30) // int32 | Results per page. Allowed values 1-100, default is 25. (optional) (default to 25)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.AnalyticsApi.GETAnalyticsVideosVideoId(context.Background(), videoId).Period(period).Metadata(metadata).CurrentPage(currentPage).PageSize(pageSize).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `AnalyticsApi.GETAnalyticsVideosVideoId``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GETAnalyticsVideosVideoId`: RawStatisticsListSessionsResponse
    fmt.Fprintf(os.Stdout, "Response from `AnalyticsApi.GETAnalyticsVideosVideoId`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**videoId** | **string** | The unique identifier for the video you want to retrieve session information for. | 

### Other Parameters

Other parameters are passed through a pointer to a apiGETAnalyticsVideosVideoIdRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **period** | **string** | Period must have one of the following formats:  - For a day : 2018-01-01, - For a week: 2018-W01,  - For a month: 2018-01 - For a year: 2018 For a range period:  -  Date range: 2018-01-01/2018-01-15  | 
 **metadata** | **[]string** | Metadata and [Dynamic Metadata](https://api.video/blog/endpoints/dynamic-metadata) filter. Send an array of key value pairs you want to filter sessios with. | 
 **currentPage** | **int32** | Choose the number of search results to return per page. Minimum value: 1 | [default to 1]
 **pageSize** | **int32** | Results per page. Allowed values 1-100, default is 25. | [default to 25]

### Return type

[**RawStatisticsListSessionsResponse**](RawStatisticsListSessionsResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

