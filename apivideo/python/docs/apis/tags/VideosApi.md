<a name="__pageTop"></a>
# apivideo.apis.tags.videos_api.VideosApi

All URIs are relative to *https://ws.api.video*

Method | HTTP request | Description
------------- | ------------- | -------------
[**d_elete_video**](#d_elete_video) | **delete** /videos/{videoId} | Delete a video
[**g_et_video**](#g_et_video) | **get** /videos/{videoId} | Show a video
[**g_et_video_status**](#g_et_video_status) | **get** /videos/{videoId}/status | Show video status
[**l_ist_videos**](#l_ist_videos) | **get** /videos | List all videos
[**p_atch_video**](#p_atch_video) | **patch** /videos/{videoId} | Update a video
[**p_atch_videos_video_id_thumbnail**](#p_atch_videos_video_id_thumbnail) | **patch** /videos/{videoId}/thumbnail | Pick a thumbnail
[**p_ost_video**](#p_ost_video) | **post** /videos | Create a video
[**p_ost_videos_video_id_source**](#p_ost_videos_video_id_source) | **post** /videos/{videoId}/source | Upload a video
[**p_ost_videos_video_id_thumbnail**](#p_ost_videos_video_id_thumbnail) | **post** /videos/{videoId}/thumbnail | Upload a thumbnail

# **d_elete_video**
<a name="d_elete_video"></a>
> d_elete_video(video_id)

Delete a video

If you do not need a video any longer, you can send a request to delete it. All you need is the videoId. Tutorials using [video deletion](https://api.video/blog/endpoints/video-delete).

### Example

* Bearer Authentication (bearerAuth):
```python
import apivideo
from apivideo.apis.tags import videos_api
from apivideo.model.not_found import NotFound
from pprint import pprint
# Defining the host is optional and defaults to https://ws.api.video
# See configuration.py for a list of all supported configuration parameters.
configuration = apivideo.Configuration(
    host = "https://ws.api.video"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure Bearer authorization: bearerAuth
configuration = apivideo.Configuration(
    access_token = 'YOUR_BEARER_TOKEN'
)
# Enter a context with an instance of the API client
with apivideo.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = videos_api.VideosApi(api_client)

    # example passing only required values which don't have defaults set
    path_params = {
        'videoId': "vi4k0jvEUuaTdRAEjQ4Jfrgz",
    }
    try:
        # Delete a video
        api_response = api_instance.d_elete_video(
            path_params=path_params,
        )
    except apivideo.ApiException as e:
        print("Exception when calling VideosApi->d_elete_video: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
path_params | RequestPathParams | |
accept_content_types | typing.Tuple[str] | default is ('application/json', ) | Tells the server the content type(s) that are accepted by the client
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

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
204 | [ApiResponseFor204](#d_elete_video.ApiResponseFor204) | No Content
404 | [ApiResponseFor404](#d_elete_video.ApiResponseFor404) | Not Found

#### d_elete_video.ApiResponseFor204
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | Unset | body was not defined |
headers | Unset | headers were not defined |

#### d_elete_video.ApiResponseFor404
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

# **g_et_video**
<a name="g_et_video"></a>
> Video g_et_video(video_id)

Show a video

This call provides the same JSON information provided on video creation. For private videos, it will generate a unique token url. Use this to retrieve any details you need about a video, or set up a private viewing URL. Tutorials using [video GET](https://api.video/blog/endpoints/video-get).

### Example

* Bearer Authentication (bearerAuth):
```python
import apivideo
from apivideo.apis.tags import videos_api
from apivideo.model.not_found import NotFound
from pprint import pprint
# Defining the host is optional and defaults to https://ws.api.video
# See configuration.py for a list of all supported configuration parameters.
configuration = apivideo.Configuration(
    host = "https://ws.api.video"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure Bearer authorization: bearerAuth
configuration = apivideo.Configuration(
    access_token = 'YOUR_BEARER_TOKEN'
)
# Enter a context with an instance of the API client
with apivideo.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = videos_api.VideosApi(api_client)

    # example passing only required values which don't have defaults set
    path_params = {
        'videoId': "videoId_example",
    }
    try:
        # Show a video
        api_response = api_instance.g_et_video(
            path_params=path_params,
        )
        pprint(api_response)
    except apivideo.ApiException as e:
        print("Exception when calling VideosApi->g_et_video: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
path_params | RequestPathParams | |
accept_content_types | typing.Tuple[str] | default is ('application/json', ) | Tells the server the content type(s) that are accepted by the client
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

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
200 | [ApiResponseFor200](#g_et_video.ApiResponseFor200) | Success
404 | [ApiResponseFor404](#g_et_video.ApiResponseFor404) | Not Found

#### g_et_video.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

#### g_et_video.ApiResponseFor404
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

# **g_et_video_status**
<a name="g_et_video_status"></a>
> Videostatus g_et_video_status(video_id)

Show video status

This API provides upload status & encoding status to determine when the video is uploaded or ready to playback. Once encoding is completed, the response also lists the available stream qualities. Tutorials using [video status](https://api.video/blog/endpoints/video-status).

### Example

* Bearer Authentication (bearerAuth):
```python
import apivideo
from apivideo.apis.tags import videos_api
from apivideo.model.videostatus import Videostatus
from apivideo.model.not_found import NotFound
from pprint import pprint
# Defining the host is optional and defaults to https://ws.api.video
# See configuration.py for a list of all supported configuration parameters.
configuration = apivideo.Configuration(
    host = "https://ws.api.video"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure Bearer authorization: bearerAuth
configuration = apivideo.Configuration(
    access_token = 'YOUR_BEARER_TOKEN'
)
# Enter a context with an instance of the API client
with apivideo.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = videos_api.VideosApi(api_client)

    # example passing only required values which don't have defaults set
    path_params = {
        'videoId': "vi4k0jvEUuaTdRAEjQ4Jfrgz",
    }
    try:
        # Show video status
        api_response = api_instance.g_et_video_status(
            path_params=path_params,
        )
        pprint(api_response)
    except apivideo.ApiException as e:
        print("Exception when calling VideosApi->g_et_video_status: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
path_params | RequestPathParams | |
accept_content_types | typing.Tuple[str] | default is ('application/json', ) | Tells the server the content type(s) that are accepted by the client
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

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
200 | [ApiResponseFor200](#g_et_video_status.ApiResponseFor200) | Success
404 | [ApiResponseFor404](#g_et_video_status.ApiResponseFor404) | Not Found

#### g_et_video_status.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**Videostatus**](../../models/Videostatus.md) |  | 


#### g_et_video_status.ApiResponseFor404
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

# **l_ist_videos**
<a name="l_ist_videos"></a>
> VideosListResponse l_ist_videos()

List all videos

Requests to this endpoint return a list of your videos (with all their details). With no parameters added to this query, the API returns all videos. You can filter what videos the API returns using the parameters described below.  We have [several tutorials](https://api.video/blog/endpoints/video-list) that demonstrate this endpoint.

### Example

* Bearer Authentication (bearerAuth):
```python
import apivideo
from apivideo.apis.tags import videos_api
from apivideo.model.videos_list_response import VideosListResponse
from apivideo.model.bad_request import BadRequest
from pprint import pprint
# Defining the host is optional and defaults to https://ws.api.video
# See configuration.py for a list of all supported configuration parameters.
configuration = apivideo.Configuration(
    host = "https://ws.api.video"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure Bearer authorization: bearerAuth
configuration = apivideo.Configuration(
    access_token = 'YOUR_BEARER_TOKEN'
)
# Enter a context with an instance of the API client
with apivideo.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = videos_api.VideosApi(api_client)

    # example passing only optional values
    query_params = {
        'title': "My Video.mp4",
        'tags': [
        "\"tags\": [\"captions\", \"dialogue\"]"
    ],
        'metadata': [
        "[{\"key\":\"Author\", \"value\":\"John Doe\"}, {\"key\":\"Format\", \"value\":\"Tutorial\"}]"
    ],
        'description': "New Zealand",
        'liveStreamId': "li400mYKSgQ6xs7taUeSaEKr",
        'sortBy': "publishedAt",
        'sortOrder': "asc",
        'currentPage': 2,
        'pageSize': 30,
    }
    try:
        # List all videos
        api_response = api_instance.l_ist_videos(
            query_params=query_params,
        )
        pprint(api_response)
    except apivideo.ApiException as e:
        print("Exception when calling VideosApi->l_ist_videos: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
query_params | RequestQueryParams | |
accept_content_types | typing.Tuple[str] | default is ('application/json', ) | Tells the server the content type(s) that are accepted by the client
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### query_params
#### RequestQueryParams

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
title | TitleSchema | | optional
tags | TagsSchema | | optional
metadata | MetadataSchema | | optional
description | DescriptionSchema | | optional
liveStreamId | LiveStreamIdSchema | | optional
sortBy | SortBySchema | | optional
sortOrder | SortOrderSchema | | optional
currentPage | CurrentPageSchema | | optional
pageSize | PageSizeSchema | | optional


# TitleSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# TagsSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  |  | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
items | str,  | str,  |  | 

# MetadataSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  |  | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
items | str,  | str,  |  | 

# DescriptionSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# LiveStreamIdSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# SortBySchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# SortOrderSchema

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

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#l_ist_videos.ApiResponseFor200) | Success
400 | [ApiResponseFor400](#l_ist_videos.ApiResponseFor400) | Bad Request

#### l_ist_videos.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**VideosListResponse**](../../models/VideosListResponse.md) |  | 


#### l_ist_videos.ApiResponseFor400
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor400ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor400ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**BadRequest**](../../models/BadRequest.md) |  | 


### Authorization

[bearerAuth](../../../README.md#bearerAuth)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **p_atch_video**
<a name="p_atch_video"></a>
> Video p_atch_video(video_id)

Update a video

Use this endpoint to update the parameters associated with your video. The video you are updating is determined by the video ID you provide in the path. For each parameter you want to update, include the update in the request body. NOTE: If you are updating an array, you must provide the entire array as what you provide here overwrites what is in the system rather than appending to it. Tutorials using [video update](https://api.video/blog/endpoints/video-update).

### Example

* Bearer Authentication (bearerAuth):
```python
import apivideo
from apivideo.apis.tags import videos_api
from apivideo.model.video_update_payload import VideoUpdatePayload
from apivideo.model.bad_request import BadRequest
from apivideo.model.not_found import NotFound
from apivideo.model.video import Video
from pprint import pprint
# Defining the host is optional and defaults to https://ws.api.video
# See configuration.py for a list of all supported configuration parameters.
configuration = apivideo.Configuration(
    host = "https://ws.api.video"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure Bearer authorization: bearerAuth
configuration = apivideo.Configuration(
    access_token = 'YOUR_BEARER_TOKEN'
)
# Enter a context with an instance of the API client
with apivideo.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = videos_api.VideosApi(api_client)

    # example passing only required values which don't have defaults set
    path_params = {
        'videoId': "vi4k0jvEUuaTdRAEjQ4Jfrgz",
    }
    try:
        # Update a video
        api_response = api_instance.p_atch_video(
            path_params=path_params,
        )
        pprint(api_response)
    except apivideo.ApiException as e:
        print("Exception when calling VideosApi->p_atch_video: %s\n" % e)

    # example passing only optional values
    path_params = {
        'videoId': "vi4k0jvEUuaTdRAEjQ4Jfrgz",
    }
    body = VideoUpdatePayload(
        description="A film about good books.",
        metadata=[
            Metadata(
                key="Color",
                value="Green",
            )
        ],
        mp4_support=True,
        panoramic=False,
        player_id="pl4k0jvEUuaTdRAEjQ4Jfrgz",
        public=True,
        tags=[
            "[\"maths\", \"string theory\", \"video\"]"
        ],
        title="title_example",
    )
    try:
        # Update a video
        api_response = api_instance.p_atch_video(
            path_params=path_params,
            body=body,
        )
        pprint(api_response)
    except apivideo.ApiException as e:
        print("Exception when calling VideosApi->p_atch_video: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
body | typing.Union[SchemaForRequestBodyApplicationJson, Unset] | optional, default is unset |
path_params | RequestPathParams | |
content_type | str | optional, default is 'application/json' | Selects the schema and serialization of the request body
accept_content_types | typing.Tuple[str] | default is ('application/json', ) | Tells the server the content type(s) that are accepted by the client
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### body

# SchemaForRequestBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**VideoUpdatePayload**](../../models/VideoUpdatePayload.md) |  | 


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
200 | [ApiResponseFor200](#p_atch_video.ApiResponseFor200) | Success
400 | [ApiResponseFor400](#p_atch_video.ApiResponseFor400) | Bad Request
404 | [ApiResponseFor404](#p_atch_video.ApiResponseFor404) | Not Found

#### p_atch_video.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**Video**](../../models/Video.md) |  | 


#### p_atch_video.ApiResponseFor400
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor400ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor400ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**BadRequest**](../../models/BadRequest.md) |  | 


#### p_atch_video.ApiResponseFor404
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

# **p_atch_videos_video_id_thumbnail**
<a name="p_atch_videos_video_id_thumbnail"></a>
> Video p_atch_videos_video_id_thumbnail(video_id)

Pick a thumbnail

Pick a thumbnail from the given time code. If you'd like to upload an image for your thumbnail, use the [Upload a Thumbnail](https://docs.api.video/reference#post_videos-videoid-thumbnail) endpoint. There may be a short delay for the thumbnail to update. Tutorials using [Thumbnail picking](https://api.video/blog/endpoints/video-pick-a-thumbnail).

### Example

* Bearer Authentication (bearerAuth):
```python
import apivideo
from apivideo.apis.tags import videos_api
from apivideo.model.video_thumbnail_pick_payload import VideoThumbnailPickPayload
from apivideo.model.not_found import NotFound
from apivideo.model.video import Video
from pprint import pprint
# Defining the host is optional and defaults to https://ws.api.video
# See configuration.py for a list of all supported configuration parameters.
configuration = apivideo.Configuration(
    host = "https://ws.api.video"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure Bearer authorization: bearerAuth
configuration = apivideo.Configuration(
    access_token = 'YOUR_BEARER_TOKEN'
)
# Enter a context with an instance of the API client
with apivideo.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = videos_api.VideosApi(api_client)

    # example passing only required values which don't have defaults set
    path_params = {
        'videoId': "vi4k0jvEUuaTdRAEjQ4Jfrgz",
    }
    try:
        # Pick a thumbnail
        api_response = api_instance.p_atch_videos_video_id_thumbnail(
            path_params=path_params,
        )
        pprint(api_response)
    except apivideo.ApiException as e:
        print("Exception when calling VideosApi->p_atch_videos_video_id_thumbnail: %s\n" % e)

    # example passing only optional values
    path_params = {
        'videoId': "vi4k0jvEUuaTdRAEjQ4Jfrgz",
    }
    body = VideoThumbnailPickPayload(
        timecode="00:00:00/00",
    )
    try:
        # Pick a thumbnail
        api_response = api_instance.p_atch_videos_video_id_thumbnail(
            path_params=path_params,
            body=body,
        )
        pprint(api_response)
    except apivideo.ApiException as e:
        print("Exception when calling VideosApi->p_atch_videos_video_id_thumbnail: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
body | typing.Union[SchemaForRequestBodyApplicationJson, Unset] | optional, default is unset |
path_params | RequestPathParams | |
content_type | str | optional, default is 'application/json' | Selects the schema and serialization of the request body
accept_content_types | typing.Tuple[str] | default is ('application/json', ) | Tells the server the content type(s) that are accepted by the client
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### body

# SchemaForRequestBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**VideoThumbnailPickPayload**](../../models/VideoThumbnailPickPayload.md) |  | 


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
200 | [ApiResponseFor200](#p_atch_videos_video_id_thumbnail.ApiResponseFor200) | Success
404 | [ApiResponseFor404](#p_atch_videos_video_id_thumbnail.ApiResponseFor404) | Not Found

#### p_atch_videos_video_id_thumbnail.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**Video**](../../models/Video.md) |  | 


#### p_atch_videos_video_id_thumbnail.ApiResponseFor404
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

# **p_ost_video**
<a name="p_ost_video"></a>
> Video p_ost_video()

Create a video

To create a video, you create its container&parameters first, before adding the video file (exception - when using an existing HTTP source). * Videos are public by default. [Learn about Private videos](https://api.video/blog/tutorials/tutorial-private-videos) * Up to 6 responsive video streams will be created (from 240p to 4k) * Mp4 encoded versions are created at the highest quality (max 1080p) by default. * Panoramic videos are for videos recorded in 360 degrees.  You can toggle this after your 360 video upload. * Searchable parameters: title, description, tags and metadata   ```shell $ curl https://ws.api.video/videos \\ -H 'Authorization: Bearer {access_token} \\ -d '{\"title\":\"My video\",       \"description\":\"so many details\",      \"mp4Support\":true }' ```    ## add an URL to upload on creation You can also create a video directly from a video hosted on a third-party server by giving its URI in `source` parameter: ```shell $ curl https://ws.api.video/videos \\ -H 'Authorization: Bearer {access_token} \\ -d '{\"source\":\"http://uri/to/video.mp4\", \"title\":\"My video\"}' ```  In this case, the service will respond `202 Accepted` and ingest the video asynchronously. ## Track users with Dynamic Metadata Metadata values can be a key:value where the values are predefined, but Dynamic metadata allows you to enter *any* value for a defined key.  To defined a dynamic metadata pair use: ``` \"metadata\":[{\"dynamicKey\": \"__dynamicKey__\"}] ```  The double underscore on both sides of the value allows any variable to be added for a given video session. Added the the url you might have: ``` <iframe type=\"text/html\" src=\"https://embed.api.video/vod/vi6QvU9dhYCzW3BpPvPsZUa8?metadata[classUserName]=Doug\" width=\"960\" height=\"320\" frameborder=\"0\" scrollling=\"no\"></iframe> ```   This video session will be tagged as watched by Doug - allowing for in-depth analysis on how each viewer interacts with the videos. ### We have tutorials on: * [Creating and uploading videos](https://api.video/blog/tutorials/video-upload-tutorial) * [Uploading large videos](https://api.video/blog/tutorials/video-upload-tutorial-large-videos)   * [Using tags with videos](https://api.video/blog/tutorials/video-tagging-best-practices) * [Private videos](https://api.video/blog/tutorials/tutorial-private-videos) * [Using Dynamic Metadata](https://api.video/blog/tutorials/dynamic-metadata)  * Full list of [tutorials](https://api.video/blog/endpoints/video-create) that demonstrate this endpoint. 

### Example

* Bearer Authentication (bearerAuth):
```python
import apivideo
from apivideo.apis.tags import videos_api
from apivideo.model.bad_request import BadRequest
from apivideo.model.video_create_payload import VideoCreatePayload
from apivideo.model.video import Video
from pprint import pprint
# Defining the host is optional and defaults to https://ws.api.video
# See configuration.py for a list of all supported configuration parameters.
configuration = apivideo.Configuration(
    host = "https://ws.api.video"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure Bearer authorization: bearerAuth
configuration = apivideo.Configuration(
    access_token = 'YOUR_BEARER_TOKEN'
)
# Enter a context with an instance of the API client
with apivideo.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = videos_api.VideosApi(api_client)

    # example passing only optional values
    body = VideoCreatePayload(
        description="A video about string theory.",
        metadata=[
            Metadata(
                key="Color",
                value="Green",
            )
        ],
        mp4_support=True,
        panoramic=False,
        player_id="pl45KFKdlddgk654dspkze",
        public=True,
        published_at="2020-07-14T23:36:18.598Z",
        source="https://www.myvideo.url.com/video.mp4",
        tags=[
            "[\"maths\", \"string theory\", \"video\"]"
        ],
        title="Maths video",
    )
    try:
        # Create a video
        api_response = api_instance.p_ost_video(
            body=body,
        )
        pprint(api_response)
    except apivideo.ApiException as e:
        print("Exception when calling VideosApi->p_ost_video: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
body | typing.Union[SchemaForRequestBodyApplicationJson, Unset] | optional, default is unset |
content_type | str | optional, default is 'application/json' | Selects the schema and serialization of the request body
accept_content_types | typing.Tuple[str] | default is ('application/json', ) | Tells the server the content type(s) that are accepted by the client
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### body

# SchemaForRequestBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**VideoCreatePayload**](../../models/VideoCreatePayload.md) |  | 


### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
201 | [ApiResponseFor201](#p_ost_video.ApiResponseFor201) | Created
202 | [ApiResponseFor202](#p_ost_video.ApiResponseFor202) | Accepted
400 | [ApiResponseFor400](#p_ost_video.ApiResponseFor400) | Bad Request

#### p_ost_video.ApiResponseFor201
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor201ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor201ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**Video**](../../models/Video.md) |  | 


#### p_ost_video.ApiResponseFor202
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor202ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor202ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**Video**](../../models/Video.md) |  | 


#### p_ost_video.ApiResponseFor400
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor400ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor400ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**BadRequest**](../../models/BadRequest.md) |  | 


### Authorization

[bearerAuth](../../../README.md#bearerAuth)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **p_ost_videos_video_id_source**
<a name="p_ost_videos_video_id_source"></a>
> Video p_ost_videos_video_id_source(video_id)

Upload a video

To upload a video to the videoId you created. Replace {videoId} with the id you'd like to use, {access_token} with your token, and /path/to/video.mp4 with the path to the video you'd like to upload. You can only upload your video to the videoId once. ```bash curl https://ws.api.video/videos/{videoId}/source \\   -H 'Authorization: Bearer {access_token}' \\   -F file=@/path/to/video.mp4    ``` Tutorials using [video upload](https://api.video/blog/endpoints/video-upload).

### Example

* Bearer Authentication (bearerAuth):
```python
import apivideo
from apivideo.apis.tags import videos_api
from apivideo.model.bad_request import BadRequest
from apivideo.model.video_upload_payload import VideoUploadPayload
from apivideo.model.not_found import NotFound
from pprint import pprint
# Defining the host is optional and defaults to https://ws.api.video
# See configuration.py for a list of all supported configuration parameters.
configuration = apivideo.Configuration(
    host = "https://ws.api.video"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure Bearer authorization: bearerAuth
configuration = apivideo.Configuration(
    access_token = 'YOUR_BEARER_TOKEN'
)
# Enter a context with an instance of the API client
with apivideo.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = videos_api.VideosApi(api_client)

    # example passing only required values which don't have defaults set
    path_params = {
        'videoId': "vi4k0jvEUuaTdRAEjQ4Jfrgz",
    }
    header_params = {
    }
    try:
        # Upload a video
        api_response = api_instance.p_ost_videos_video_id_source(
            path_params=path_params,
            header_params=header_params,
        )
        pprint(api_response)
    except apivideo.ApiException as e:
        print("Exception when calling VideosApi->p_ost_videos_video_id_source: %s\n" % e)

    # example passing only optional values
    path_params = {
        'videoId': "vi4k0jvEUuaTdRAEjQ4Jfrgz",
    }
    header_params = {
        'Content-Range': "Content-Range: bytes 200-100/5000",
    }
    body = dict(
        file="[B@36570936",
    )
    try:
        # Upload a video
        api_response = api_instance.p_ost_videos_video_id_source(
            path_params=path_params,
            header_params=header_params,
            body=body,
        )
        pprint(api_response)
    except apivideo.ApiException as e:
        print("Exception when calling VideosApi->p_ost_videos_video_id_source: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
body | typing.Union[SchemaForRequestBodyMultipartFormData, Unset] | optional, default is unset |
header_params | RequestHeaderParams | |
path_params | RequestPathParams | |
content_type | str | optional, default is 'multipart/form-data' | Selects the schema and serialization of the request body
accept_content_types | typing.Tuple[str] | default is ('application/json', ) | Tells the server the content type(s) that are accepted by the client
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### body

# SchemaForRequestBodyMultipartFormData
Type | Description  | Notes
------------- | ------------- | -------------
[**VideoUploadPayload**](../../models/VideoUploadPayload.md) |  | 


### header_params
#### RequestHeaderParams

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
Content-Range | ContentRangeSchema | | optional

# ContentRangeSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

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
201 | [ApiResponseFor201](#p_ost_videos_video_id_source.ApiResponseFor201) | Created
400 | [ApiResponseFor400](#p_ost_videos_video_id_source.ApiResponseFor400) | Bad Request
404 | [ApiResponseFor404](#p_ost_videos_video_id_source.ApiResponseFor404) | Not Found

#### p_ost_videos_video_id_source.ApiResponseFor201
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor201ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor201ResponseBodyApplicationJson

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

#### p_ost_videos_video_id_source.ApiResponseFor400
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor400ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor400ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**BadRequest**](../../models/BadRequest.md) |  | 


#### p_ost_videos_video_id_source.ApiResponseFor404
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

# **p_ost_videos_video_id_thumbnail**
<a name="p_ost_videos_video_id_thumbnail"></a>
> Video p_ost_videos_video_id_thumbnail(video_id)

Upload a thumbnail

The thumbnail is the poster that appears in the player window before video playback begins. This endpoint allows you to upload an image for the thumbnail. To select a still frame from the video using a time stamp, use [Pick a Thumbnail](https://docs.api.video/reference#patch_videos-videoid-thumbnail) to pick a time in the video.  Note: There may be a short delay before the new thumbnail is delivered to our CDN. Tutorials using [Thumbnail upload](https://api.video/blog/endpoints/videos-upload-a-thumbnail).

### Example

* Bearer Authentication (bearerAuth):
```python
import apivideo
from apivideo.apis.tags import videos_api
from apivideo.model.bad_request import BadRequest
from apivideo.model.not_found import NotFound
from apivideo.model.video_thumbnail_upload_payload import VideoThumbnailUploadPayload
from apivideo.model.video import Video
from pprint import pprint
# Defining the host is optional and defaults to https://ws.api.video
# See configuration.py for a list of all supported configuration parameters.
configuration = apivideo.Configuration(
    host = "https://ws.api.video"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure Bearer authorization: bearerAuth
configuration = apivideo.Configuration(
    access_token = 'YOUR_BEARER_TOKEN'
)
# Enter a context with an instance of the API client
with apivideo.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = videos_api.VideosApi(api_client)

    # example passing only required values which don't have defaults set
    path_params = {
        'videoId': "videoId_example",
    }
    try:
        # Upload a thumbnail
        api_response = api_instance.p_ost_videos_video_id_thumbnail(
            path_params=path_params,
        )
        pprint(api_response)
    except apivideo.ApiException as e:
        print("Exception when calling VideosApi->p_ost_videos_video_id_thumbnail: %s\n" % e)

    # example passing only optional values
    path_params = {
        'videoId': "videoId_example",
    }
    body = dict(
        file=open('/path/to/file', 'rb'),
    )
    try:
        # Upload a thumbnail
        api_response = api_instance.p_ost_videos_video_id_thumbnail(
            path_params=path_params,
            body=body,
        )
        pprint(api_response)
    except apivideo.ApiException as e:
        print("Exception when calling VideosApi->p_ost_videos_video_id_thumbnail: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
body | typing.Union[SchemaForRequestBodyMultipartFormData, Unset] | optional, default is unset |
path_params | RequestPathParams | |
content_type | str | optional, default is 'multipart/form-data' | Selects the schema and serialization of the request body
accept_content_types | typing.Tuple[str] | default is ('application/json', ) | Tells the server the content type(s) that are accepted by the client
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### body

# SchemaForRequestBodyMultipartFormData
Type | Description  | Notes
------------- | ------------- | -------------
[**VideoThumbnailUploadPayload**](../../models/VideoThumbnailUploadPayload.md) |  | 


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
200 | [ApiResponseFor200](#p_ost_videos_video_id_thumbnail.ApiResponseFor200) | Success
400 | [ApiResponseFor400](#p_ost_videos_video_id_thumbnail.ApiResponseFor400) | Bad Request
404 | [ApiResponseFor404](#p_ost_videos_video_id_thumbnail.ApiResponseFor404) | Not Found

#### p_ost_videos_video_id_thumbnail.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**Video**](../../models/Video.md) |  | 


#### p_ost_videos_video_id_thumbnail.ApiResponseFor400
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor400ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor400ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**BadRequest**](../../models/BadRequest.md) |  | 


#### p_ost_videos_video_id_thumbnail.ApiResponseFor404
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

