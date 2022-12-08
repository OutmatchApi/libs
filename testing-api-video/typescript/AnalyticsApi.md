# .AnalyticsApi

All URIs are relative to *https://ws.api.video*

Method | HTTP request | Description
------------- | ------------- | -------------
[**gETAnalyticsLiveStreamsLiveStreamId**](AnalyticsApi.md#gETAnalyticsLiveStreamsLiveStreamId) | **GET** /analytics/live-streams/{liveStreamId} | List live stream player sessions
[**gETAnalyticsSessionsSessionIdEvents**](AnalyticsApi.md#gETAnalyticsSessionsSessionIdEvents) | **GET** /analytics/sessions/{sessionId}/events | List player session events
[**gETAnalyticsVideosVideoId**](AnalyticsApi.md#gETAnalyticsVideosVideoId) | **GET** /analytics/videos/{videoId} | List video player sessions


# **gETAnalyticsLiveStreamsLiveStreamId**
> RawStatisticsListLiveStreamAnalyticsResponse gETAnalyticsLiveStreamsLiveStreamId()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .AnalyticsApi(configuration);

let body:.AnalyticsApiGETAnalyticsLiveStreamsLiveStreamIdRequest = {
  // string | The unique identifier for the live stream you want to retrieve analytics for.
  liveStreamId: "vi4k0jvEUuaTdRAEjQ4Jfrgz",
  // string | Period must have one of the following formats:  - For a day : \"2018-01-01\", - For a week: \"2018-W01\",  - For a month: \"2018-01\" - For a year: \"2018\" For a range period:  -  Date range: \"2018-01-01/2018-01-15\"  (optional)
  period: "2019-01-01T00:00:00.000Z",
  // number | Choose the number of search results to return per page. Minimum value: 1 (optional)
  currentPage: 2,
  // number | Results per page. Allowed values 1-100, default is 25. (optional)
  pageSize: 30,
};

apiInstance.gETAnalyticsLiveStreamsLiveStreamId(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **liveStreamId** | [**string**] | The unique identifier for the live stream you want to retrieve analytics for. | defaults to undefined
 **period** | [**string**] | Period must have one of the following formats:  - For a day : \&quot;2018-01-01\&quot;, - For a week: \&quot;2018-W01\&quot;,  - For a month: \&quot;2018-01\&quot; - For a year: \&quot;2018\&quot; For a range period:  -  Date range: \&quot;2018-01-01/2018-01-15\&quot;  | (optional) defaults to undefined
 **currentPage** | [**number**] | Choose the number of search results to return per page. Minimum value: 1 | (optional) defaults to 1
 **pageSize** | [**number**] | Results per page. Allowed values 1-100, default is 25. | (optional) defaults to 25


### Return type

**RawStatisticsListLiveStreamAnalyticsResponse**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**404** | Not Found |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **gETAnalyticsSessionsSessionIdEvents**
> RawStatisticsListPlayerSessionEventsResponse gETAnalyticsSessionsSessionIdEvents()

Useful to track and measure video's engagement.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .AnalyticsApi(configuration);

let body:.AnalyticsApiGETAnalyticsSessionsSessionIdEventsRequest = {
  // string | A unique identifier you can use to reference and track a session with.
  sessionId: "psEmFwGQUAXR2lFHj5nDOpy",
  // number | Choose the number of search results to return per page. Minimum value: 1 (optional)
  currentPage: 2,
  // number | Results per page. Allowed values 1-100, default is 25. (optional)
  pageSize: 30,
};

apiInstance.gETAnalyticsSessionsSessionIdEvents(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionId** | [**string**] | A unique identifier you can use to reference and track a session with. | defaults to undefined
 **currentPage** | [**number**] | Choose the number of search results to return per page. Minimum value: 1 | (optional) defaults to 1
 **pageSize** | [**number**] | Results per page. Allowed values 1-100, default is 25. | (optional) defaults to 25


### Return type

**RawStatisticsListPlayerSessionEventsResponse**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**404** | Not Found |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **gETAnalyticsVideosVideoId**
> RawStatisticsListSessionsResponse gETAnalyticsVideosVideoId()

Retrieve all available user sessions for a specific video. Tutorials that use the [analytics endpoint](https://api.video/blog/endpoints/analytics).

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .AnalyticsApi(configuration);

let body:.AnalyticsApiGETAnalyticsVideosVideoIdRequest = {
  // string | The unique identifier for the video you want to retrieve session information for.
  videoId: "vi4k0jvEUuaTdRAEjQ4Prklg",
  // string | Period must have one of the following formats:  - For a day : 2018-01-01, - For a week: 2018-W01,  - For a month: 2018-01 - For a year: 2018 For a range period:  -  Date range: 2018-01-01/2018-01-15  (optional)
  period: "period_example",
  // Array<string> | Metadata and [Dynamic Metadata](https://api.video/blog/endpoints/dynamic-metadata) filter. Send an array of key value pairs you want to filter sessios with. (optional)
  metadata: [
    "[{"key": "Author", "value": "John Doe"}, {"key": "Format", "value": "Tutorial"}]",
  ],
  // number | Choose the number of search results to return per page. Minimum value: 1 (optional)
  currentPage: 2,
  // number | Results per page. Allowed values 1-100, default is 25. (optional)
  pageSize: 30,
};

apiInstance.gETAnalyticsVideosVideoId(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **videoId** | [**string**] | The unique identifier for the video you want to retrieve session information for. | defaults to undefined
 **period** | [**string**] | Period must have one of the following formats:  - For a day : 2018-01-01, - For a week: 2018-W01,  - For a month: 2018-01 - For a year: 2018 For a range period:  -  Date range: 2018-01-01/2018-01-15  | (optional) defaults to undefined
 **metadata** | **Array&lt;string&gt;** | Metadata and [Dynamic Metadata](https://api.video/blog/endpoints/dynamic-metadata) filter. Send an array of key value pairs you want to filter sessios with. | (optional) defaults to undefined
 **currentPage** | [**number**] | Choose the number of search results to return per page. Minimum value: 1 | (optional) defaults to 1
 **pageSize** | [**number**] | Results per page. Allowed values 1-100, default is 25. | (optional) defaults to 25


### Return type

**RawStatisticsListSessionsResponse**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**404** | Not Found |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)


