<a name="__pageTop"></a>
# testing-api-video.apis.tags.analytics_api.AnalyticsApi

All URIs are relative to *https://ws.api.video*

Method | HTTP request | Description
------------- | ------------- | -------------
[**g_et_analytics_live_streams_live_stream_id**](#g_et_analytics_live_streams_live_stream_id) | **get** /analytics/live-streams/{liveStreamId} | List live stream player sessions
[**g_et_analytics_sessions_session_id_events**](#g_et_analytics_sessions_session_id_events) | **get** /analytics/sessions/{sessionId}/events | List player session events
[**g_et_analytics_videos_video_id**](#g_et_analytics_videos_video_id) | **get** /analytics/videos/{videoId} | List video player sessions

# **g_et_analytics_live_streams_live_stream_id**
<a name="g_et_analytics_live_streams_live_stream_id"></a>
> RawStatisticsListLiveStreamAnalyticsResponse g_et_analytics_live_streams_live_stream_id(live_stream_id)

List live stream player sessions

### Example

* Bearer Authentication (bearerAuth):
```python
import testing-api-video
from testing-api-video.apis.tags import analytics_api
from testing-api-video.model.raw_statistics_list_live_stream_analytics_response import RawStatisticsListLiveStreamAnalyticsResponse
from testing-api-video.model.not_found import NotFound
from pprint import pprint
# Defining the host is optional and defaults to https://ws.api.video
# See configuration.py for a list of all supported configuration parameters.
configuration = testing-api-video.Configuration(
    host = "https://ws.api.video"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure Bearer authorization: bearerAuth
configuration = testing-api-video.Configuration(
    access_token = 'YOUR_BEARER_TOKEN'
)
# Enter a context with an instance of the API client
with testing-api-video.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = analytics_api.AnalyticsApi(api_client)

    # example passing only required values which don't have defaults set
    path_params = {
        'liveStreamId': "vi4k0jvEUuaTdRAEjQ4Jfrgz",
    }
    query_params = {
    }
    try:
        # List live stream player sessions
        api_response = api_instance.g_et_analytics_live_streams_live_stream_id(
            path_params=path_params,
            query_params=query_params,
        )
        pprint(api_response)
    except testing-api-video.ApiException as e:
        print("Exception when calling AnalyticsApi->g_et_analytics_live_streams_live_stream_id: %s\n" % e)

    # example passing only optional values
    path_params = {
        'liveStreamId': "vi4k0jvEUuaTdRAEjQ4Jfrgz",
    }
    query_params = {
        'period': "2019-01-01T00:00:00.000Z",
        'currentPage': 2,
        'pageSize': 30,
    }
    try:
        # List live stream player sessions
        api_response = api_instance.g_et_analytics_live_streams_live_stream_id(
            path_params=path_params,
            query_params=query_params,
        )
        pprint(api_response)
    except testing-api-video.ApiException as e:
        print("Exception when calling AnalyticsApi->g_et_analytics_live_streams_live_stream_id: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
query_params | RequestQueryParams | |
path_params | RequestPathParams | |
accept_content_types | typing.Tuple[str] | default is ('application/json', ) | Tells the server the content type(s) that are accepted by the client
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### query_params
#### RequestQueryParams

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
period | PeriodSchema | | optional
currentPage | CurrentPageSchema | | optional
pageSize | PageSizeSchema | | optional


# PeriodSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# CurrentPageSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
decimal.Decimal, int,  | decimal.Decimal,  |  | if omitted the server will use the default value of 1

# PageSizeSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
decimal.Decimal, int,  | decimal.Decimal,  |  | if omitted the server will use the default value of 25

### path_params
#### RequestPathParams

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
liveStreamId | LiveStreamIdSchema | | 

# LiveStreamIdSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#g_et_analytics_live_streams_live_stream_id.ApiResponseFor200) | Success
404 | [ApiResponseFor404](#g_et_analytics_live_streams_live_stream_id.ApiResponseFor404) | Not Found

#### g_et_analytics_live_streams_live_stream_id.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**RawStatisticsListLiveStreamAnalyticsResponse**](../../models/RawStatisticsListLiveStreamAnalyticsResponse.md) |  | 


#### g_et_analytics_live_streams_live_stream_id.ApiResponseFor404
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor404ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor404ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**NotFound**](../../models/NotFound.md) |  | 


### Authorization

[bearerAuth](../../../README.md#bearerAuth)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **g_et_analytics_sessions_session_id_events**
<a name="g_et_analytics_sessions_session_id_events"></a>
> RawStatisticsListPlayerSessionEventsResponse g_et_analytics_sessions_session_id_events(session_id)

List player session events

Useful to track and measure video's engagement.

### Example

* Bearer Authentication (bearerAuth):
```python
import testing-api-video
from testing-api-video.apis.tags import analytics_api
from testing-api-video.model.raw_statistics_list_player_session_events_response import RawStatisticsListPlayerSessionEventsResponse
from testing-api-video.model.not_found import NotFound
from pprint import pprint
# Defining the host is optional and defaults to https://ws.api.video
# See configuration.py for a list of all supported configuration parameters.
configuration = testing-api-video.Configuration(
    host = "https://ws.api.video"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure Bearer authorization: bearerAuth
configuration = testing-api-video.Configuration(
    access_token = 'YOUR_BEARER_TOKEN'
)
# Enter a context with an instance of the API client
with testing-api-video.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = analytics_api.AnalyticsApi(api_client)

    # example passing only required values which don't have defaults set
    path_params = {
        'sessionId': "psEmFwGQUAXR2lFHj5nDOpy",
    }
    query_params = {
    }
    try:
        # List player session events
        api_response = api_instance.g_et_analytics_sessions_session_id_events(
            path_params=path_params,
            query_params=query_params,
        )
        pprint(api_response)
    except testing-api-video.ApiException as e:
        print("Exception when calling AnalyticsApi->g_et_analytics_sessions_session_id_events: %s\n" % e)

    # example passing only optional values
    path_params = {
        'sessionId': "psEmFwGQUAXR2lFHj5nDOpy",
    }
    query_params = {
        'currentPage': 2,
        'pageSize': 30,
    }
    try:
        # List player session events
        api_response = api_instance.g_et_analytics_sessions_session_id_events(
            path_params=path_params,
            query_params=query_params,
        )
        pprint(api_response)
    except testing-api-video.ApiException as e:
        print("Exception when calling AnalyticsApi->g_et_analytics_sessions_session_id_events: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
query_params | RequestQueryParams | |
path_params | RequestPathParams | |
accept_content_types | typing.Tuple[str] | default is ('application/json', ) | Tells the server the content type(s) that are accepted by the client
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### query_params
#### RequestQueryParams

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
currentPage | CurrentPageSchema | | optional
pageSize | PageSizeSchema | | optional


# CurrentPageSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
decimal.Decimal, int,  | decimal.Decimal,  |  | if omitted the server will use the default value of 1

# PageSizeSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
decimal.Decimal, int,  | decimal.Decimal,  |  | if omitted the server will use the default value of 25

### path_params
#### RequestPathParams

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
sessionId | SessionIdSchema | | 

# SessionIdSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#g_et_analytics_sessions_session_id_events.ApiResponseFor200) | Success
404 | [ApiResponseFor404](#g_et_analytics_sessions_session_id_events.ApiResponseFor404) | Not Found

#### g_et_analytics_sessions_session_id_events.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**RawStatisticsListPlayerSessionEventsResponse**](../../models/RawStatisticsListPlayerSessionEventsResponse.md) |  | 


#### g_et_analytics_sessions_session_id_events.ApiResponseFor404
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor404ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor404ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**NotFound**](../../models/NotFound.md) |  | 


### Authorization

[bearerAuth](../../../README.md#bearerAuth)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **g_et_analytics_videos_video_id**
<a name="g_et_analytics_videos_video_id"></a>
> RawStatisticsListSessionsResponse g_et_analytics_videos_video_id(video_id)

List video player sessions

Retrieve all available user sessions for a specific video. Tutorials that use the [analytics endpoint](https://api.video/blog/endpoints/analytics).

### Example

* Bearer Authentication (bearerAuth):
```python
import testing-api-video
from testing-api-video.apis.tags import analytics_api
from testing-api-video.model.raw_statistics_list_sessions_response import RawStatisticsListSessionsResponse
from testing-api-video.model.not_found import NotFound
from pprint import pprint
# Defining the host is optional and defaults to https://ws.api.video
# See configuration.py for a list of all supported configuration parameters.
configuration = testing-api-video.Configuration(
    host = "https://ws.api.video"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure Bearer authorization: bearerAuth
configuration = testing-api-video.Configuration(
    access_token = 'YOUR_BEARER_TOKEN'
)
# Enter a context with an instance of the API client
with testing-api-video.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = analytics_api.AnalyticsApi(api_client)

    # example passing only required values which don't have defaults set
    path_params = {
        'videoId': "vi4k0jvEUuaTdRAEjQ4Prklg",
    }
    query_params = {
    }
    try:
        # List video player sessions
        api_response = api_instance.g_et_analytics_videos_video_id(
            path_params=path_params,
            query_params=query_params,
        )
        pprint(api_response)
    except testing-api-video.ApiException as e:
        print("Exception when calling AnalyticsApi->g_et_analytics_videos_video_id: %s\n" % e)

    # example passing only optional values
    path_params = {
        'videoId': "vi4k0jvEUuaTdRAEjQ4Prklg",
    }
    query_params = {
        'period': "period_example",
        'metadata': [
        "[{\"key\": \"Author\", \"value\": \"John Doe\"}, {\"key\": \"Format\", \"value\": \"Tutorial\"}]"
    ],
        'currentPage': 2,
        'pageSize': 30,
    }
    try:
        # List video player sessions
        api_response = api_instance.g_et_analytics_videos_video_id(
            path_params=path_params,
            query_params=query_params,
        )
        pprint(api_response)
    except testing-api-video.ApiException as e:
        print("Exception when calling AnalyticsApi->g_et_analytics_videos_video_id: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
query_params | RequestQueryParams | |
path_params | RequestPathParams | |
accept_content_types | typing.Tuple[str] | default is ('application/json', ) | Tells the server the content type(s) that are accepted by the client
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### query_params
#### RequestQueryParams

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
period | PeriodSchema | | optional
metadata | MetadataSchema | | optional
currentPage | CurrentPageSchema | | optional
pageSize | PageSizeSchema | | optional


# PeriodSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# MetadataSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  |  | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
items | str,  | str,  |  | 

# CurrentPageSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
decimal.Decimal, int,  | decimal.Decimal,  |  | if omitted the server will use the default value of 1

# PageSizeSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
decimal.Decimal, int,  | decimal.Decimal,  |  | if omitted the server will use the default value of 25

### path_params
#### RequestPathParams

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
videoId | VideoIdSchema | | 

# VideoIdSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#g_et_analytics_videos_video_id.ApiResponseFor200) | Success
404 | [ApiResponseFor404](#g_et_analytics_videos_video_id.ApiResponseFor404) | Not Found

#### g_et_analytics_videos_video_id.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**RawStatisticsListSessionsResponse**](../../models/RawStatisticsListSessionsResponse.md) |  | 


#### g_et_analytics_videos_video_id.ApiResponseFor404
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor404ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor404ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**NotFound**](../../models/NotFound.md) |  | 


### Authorization

[bearerAuth](../../../README.md#bearerAuth)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

