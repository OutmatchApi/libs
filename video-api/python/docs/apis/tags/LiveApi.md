<a name="__pageTop"></a>
# video-api.apis.tags.live_api.LiveApi

All URIs are relative to *https://ws.api.video*

Method | HTTP request | Description
------------- | ------------- | -------------
[**d_elete_live_streams_live_stream_id**](#d_elete_live_streams_live_stream_id) | **delete** /live-streams/{liveStreamId} | Delete a live stream
[**d_elete_live_streams_live_stream_id_thumbnail**](#d_elete_live_streams_live_stream_id_thumbnail) | **delete** /live-streams/{liveStreamId}/thumbnail | Delete a thumbnail
[**g_et_live_streams**](#g_et_live_streams) | **get** /live-streams | List all live streams
[**g_et_live_streams_live_stream_id**](#g_et_live_streams_live_stream_id) | **get** /live-streams/{liveStreamId} | Show live stream
[**p_atch_live_streams_live_stream_id**](#p_atch_live_streams_live_stream_id) | **patch** /live-streams/{liveStreamId} | Update a live stream
[**p_ost_live_streams**](#p_ost_live_streams) | **post** /live-streams | Create live stream
[**p_ost_live_streams_live_stream_id_thumbnail**](#p_ost_live_streams_live_stream_id_thumbnail) | **post** /live-streams/{liveStreamId}/thumbnail | Upload a thumbnail

# **d_elete_live_streams_live_stream_id**
<a name="d_elete_live_streams_live_stream_id"></a>
> d_elete_live_streams_live_stream_id(live_stream_id)

Delete a live stream

### Example

* Bearer Authentication (bearerAuth):
```python
import video-api
from video-api.apis.tags import live_api
from pprint import pprint
# Defining the host is optional and defaults to https://ws.api.video
# See configuration.py for a list of all supported configuration parameters.
configuration = video-api.Configuration(
    host = "https://ws.api.video"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure Bearer authorization: bearerAuth
configuration = video-api.Configuration(
    access_token = 'YOUR_BEARER_TOKEN'
)
# Enter a context with an instance of the API client
with video-api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = live_api.LiveApi(api_client)

    # example passing only required values which don't have defaults set
    path_params = {
        'liveStreamId': "li400mYKSgQ6xs7taUeSaEKr",
    }
    try:
        # Delete a live stream
        api_response = api_instance.d_elete_live_streams_live_stream_id(
            path_params=path_params,
        )
    except video-api.ApiException as e:
        print("Exception when calling LiveApi->d_elete_live_streams_live_stream_id: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
path_params | RequestPathParams | |
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

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
204 | [ApiResponseFor204](#d_elete_live_streams_live_stream_id.ApiResponseFor204) | No Content

#### d_elete_live_streams_live_stream_id.ApiResponseFor204
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | Unset | body was not defined |
headers | Unset | headers were not defined |

### Authorization

[bearerAuth](../../../README.md#bearerAuth)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **d_elete_live_streams_live_stream_id_thumbnail**
<a name="d_elete_live_streams_live_stream_id_thumbnail"></a>
> LiveStream d_elete_live_streams_live_stream_id_thumbnail(live_stream_id)

Delete a thumbnail

Send the unique identifier for a live stream to delete it from the system.

### Example

* Bearer Authentication (bearerAuth):
```python
import video-api
from video-api.apis.tags import live_api
from video-api.model.live_stream import LiveStream
from video-api.model.not_found import NotFound
from pprint import pprint
# Defining the host is optional and defaults to https://ws.api.video
# See configuration.py for a list of all supported configuration parameters.
configuration = video-api.Configuration(
    host = "https://ws.api.video"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure Bearer authorization: bearerAuth
configuration = video-api.Configuration(
    access_token = 'YOUR_BEARER_TOKEN'
)
# Enter a context with an instance of the API client
with video-api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = live_api.LiveApi(api_client)

    # example passing only required values which don't have defaults set
    path_params = {
        'liveStreamId': "li400mYKSgQ6xs7taUeSaEKr",
    }
    try:
        # Delete a thumbnail
        api_response = api_instance.d_elete_live_streams_live_stream_id_thumbnail(
            path_params=path_params,
        )
        pprint(api_response)
    except video-api.ApiException as e:
        print("Exception when calling LiveApi->d_elete_live_streams_live_stream_id_thumbnail: %s\n" % e)
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
200 | [ApiResponseFor200](#d_elete_live_streams_live_stream_id_thumbnail.ApiResponseFor200) | Success
404 | [ApiResponseFor404](#d_elete_live_streams_live_stream_id_thumbnail.ApiResponseFor404) | Not Found

#### d_elete_live_streams_live_stream_id_thumbnail.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**LiveStream**](../../models/LiveStream.md) |  | 


#### d_elete_live_streams_live_stream_id_thumbnail.ApiResponseFor404
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

# **g_et_live_streams**
<a name="g_et_live_streams"></a>
> LiveStreamListResponse g_et_live_streams()

List all live streams

With no parameters added to the url, this will return all livestreams. Query by name or key to limit the list.

### Example

* Bearer Authentication (bearerAuth):
```python
import video-api
from video-api.apis.tags import live_api
from video-api.model.live_stream_list_response import LiveStreamListResponse
from pprint import pprint
# Defining the host is optional and defaults to https://ws.api.video
# See configuration.py for a list of all supported configuration parameters.
configuration = video-api.Configuration(
    host = "https://ws.api.video"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure Bearer authorization: bearerAuth
configuration = video-api.Configuration(
    access_token = 'YOUR_BEARER_TOKEN'
)
# Enter a context with an instance of the API client
with video-api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = live_api.LiveApi(api_client)

    # example passing only optional values
    query_params = {
        'streamKey': "30087931-229e-42cf-b5f9-e91bcc1f7332",
        'name': "My Video",
        'sortBy': "createdAt",
        'sortOrder': "desc",
        'currentPage': 2,
        'pageSize': 30,
    }
    try:
        # List all live streams
        api_response = api_instance.g_et_live_streams(
            query_params=query_params,
        )
        pprint(api_response)
    except video-api.ApiException as e:
        print("Exception when calling LiveApi->g_et_live_streams: %s\n" % e)
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
streamKey | StreamKeySchema | | optional
name | NameSchema | | optional
sortBy | SortBySchema | | optional
sortOrder | SortOrderSchema | | optional
currentPage | CurrentPageSchema | | optional
pageSize | PageSizeSchema | | optional


# StreamKeySchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# NameSchema

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
str,  | str,  |  | must be one of ["asc", "desc", ] 

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
200 | [ApiResponseFor200](#g_et_live_streams.ApiResponseFor200) | Success

#### g_et_live_streams.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**LiveStreamListResponse**](../../models/LiveStreamListResponse.md) |  | 


### Authorization

[bearerAuth](../../../README.md#bearerAuth)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **g_et_live_streams_live_stream_id**
<a name="g_et_live_streams_live_stream_id"></a>
> LiveStream g_et_live_streams_live_stream_id(live_stream_id)

Show live stream

Supply a LivestreamId, and you'll get all the details for streaming into, and watching the livestream. Tutorials that use the [show livestream endpoint](https://api.video/blog/endpoints/live-stream-status).

### Example

* Bearer Authentication (bearerAuth):
```python
import video-api
from video-api.apis.tags import live_api
from video-api.model.live_stream import LiveStream
from pprint import pprint
# Defining the host is optional and defaults to https://ws.api.video
# See configuration.py for a list of all supported configuration parameters.
configuration = video-api.Configuration(
    host = "https://ws.api.video"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure Bearer authorization: bearerAuth
configuration = video-api.Configuration(
    access_token = 'YOUR_BEARER_TOKEN'
)
# Enter a context with an instance of the API client
with video-api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = live_api.LiveApi(api_client)

    # example passing only required values which don't have defaults set
    path_params = {
        'liveStreamId': "li400mYKSgQ6xs7taUeSaEKr",
    }
    try:
        # Show live stream
        api_response = api_instance.g_et_live_streams_live_stream_id(
            path_params=path_params,
        )
        pprint(api_response)
    except video-api.ApiException as e:
        print("Exception when calling LiveApi->g_et_live_streams_live_stream_id: %s\n" % e)
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
200 | [ApiResponseFor200](#g_et_live_streams_live_stream_id.ApiResponseFor200) | Success

#### g_et_live_streams_live_stream_id.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**LiveStream**](../../models/LiveStream.md) |  | 


### Authorization

[bearerAuth](../../../README.md#bearerAuth)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **p_atch_live_streams_live_stream_id**
<a name="p_atch_live_streams_live_stream_id"></a>
> LiveStream p_atch_live_streams_live_stream_id(live_stream_id)

Update a live stream

Use this endpoint to update the player, or to turn recording on/off (saving a copy of the livestream). NOTE: If the livestream is actively streaming, changing the recording status will only affect the NEXT stream.    The public=false 'private livestream' is available as a BETA feature, and should be limited to livestreams of 3,000 viewers or fewer.

### Example

* Bearer Authentication (bearerAuth):
```python
import video-api
from video-api.apis.tags import live_api
from video-api.model.live_stream import LiveStream
from video-api.model.live_stream_update_payload import LiveStreamUpdatePayload
from video-api.model.bad_request import BadRequest
from pprint import pprint
# Defining the host is optional and defaults to https://ws.api.video
# See configuration.py for a list of all supported configuration parameters.
configuration = video-api.Configuration(
    host = "https://ws.api.video"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure Bearer authorization: bearerAuth
configuration = video-api.Configuration(
    access_token = 'YOUR_BEARER_TOKEN'
)
# Enter a context with an instance of the API client
with video-api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = live_api.LiveApi(api_client)

    # example passing only required values which don't have defaults set
    path_params = {
        'liveStreamId': "li400mYKSgQ6xs7taUeSaEKr",
    }
    try:
        # Update a live stream
        api_response = api_instance.p_atch_live_streams_live_stream_id(
            path_params=path_params,
        )
        pprint(api_response)
    except video-api.ApiException as e:
        print("Exception when calling LiveApi->p_atch_live_streams_live_stream_id: %s\n" % e)

    # example passing only optional values
    path_params = {
        'liveStreamId': "li400mYKSgQ6xs7taUeSaEKr",
    }
    body = LiveStreamUpdatePayload(
        name="My Live Stream Video",
        player_id="pl45KFKdlddgk654dspkze",
        public=True,
        record=True,
    )
    try:
        # Update a live stream
        api_response = api_instance.p_atch_live_streams_live_stream_id(
            path_params=path_params,
            body=body,
        )
        pprint(api_response)
    except video-api.ApiException as e:
        print("Exception when calling LiveApi->p_atch_live_streams_live_stream_id: %s\n" % e)
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
[**LiveStreamUpdatePayload**](../../models/LiveStreamUpdatePayload.md) |  | 


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
200 | [ApiResponseFor200](#p_atch_live_streams_live_stream_id.ApiResponseFor200) | Success
400 | [ApiResponseFor400](#p_atch_live_streams_live_stream_id.ApiResponseFor400) | Bad Request

#### p_atch_live_streams_live_stream_id.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**LiveStream**](../../models/LiveStream.md) |  | 


#### p_atch_live_streams_live_stream_id.ApiResponseFor400
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

# **p_ost_live_streams**
<a name="p_ost_live_streams"></a>
> LiveStream p_ost_live_streams()

Create live stream

A live stream will give you the 'connection point' to RTMP your video stream to api.video. It will also give you the details for viewers to watch the same livestream.  The public=false 'private livestream' is available as a BETA feature, and should be limited to livestreams of 3,000 viewers or fewer. See our [Live Stream Tutorial](https://api.video/blog/tutorials/live-stream-tutorial) for a walkthrough of this API with OBS. Your RTMP endpoint for the livestream is rtmp://broadcast.api.video/s/{streamKey} Tutorials that [create live streams](https://api.video/blog/endpoints/live-create).

### Example

* Bearer Authentication (bearerAuth):
```python
import video-api
from video-api.apis.tags import live_api
from video-api.model.live_stream import LiveStream
from video-api.model.bad_request import BadRequest
from video-api.model.live_stream_create_payload import LiveStreamCreatePayload
from pprint import pprint
# Defining the host is optional and defaults to https://ws.api.video
# See configuration.py for a list of all supported configuration parameters.
configuration = video-api.Configuration(
    host = "https://ws.api.video"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure Bearer authorization: bearerAuth
configuration = video-api.Configuration(
    access_token = 'YOUR_BEARER_TOKEN'
)
# Enter a context with an instance of the API client
with video-api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = live_api.LiveApi(api_client)

    # example passing only optional values
    body = LiveStreamCreatePayload(
        name="My Live Stream Video",
        player_id="pl4f4ferf5erfr5zed4fsdd",
        public=True,
        record=True,
    )
    try:
        # Create live stream
        api_response = api_instance.p_ost_live_streams(
            body=body,
        )
        pprint(api_response)
    except video-api.ApiException as e:
        print("Exception when calling LiveApi->p_ost_live_streams: %s\n" % e)
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
[**LiveStreamCreatePayload**](../../models/LiveStreamCreatePayload.md) |  | 


### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#p_ost_live_streams.ApiResponseFor200) | Success
400 | [ApiResponseFor400](#p_ost_live_streams.ApiResponseFor400) | Bad Request

#### p_ost_live_streams.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**LiveStream**](../../models/LiveStream.md) |  | 


#### p_ost_live_streams.ApiResponseFor400
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

# **p_ost_live_streams_live_stream_id_thumbnail**
<a name="p_ost_live_streams_live_stream_id_thumbnail"></a>
> LiveStream p_ost_live_streams_live_stream_id_thumbnail(live_stream_id)

Upload a thumbnail

Upload an image to use as a backdrop for your livestream. Tutorials that [update live stream thumbnails](https://api.video/blog/endpoints/live-upload-a-thumbnail).

### Example

* Bearer Authentication (bearerAuth):
```python
import video-api
from video-api.apis.tags import live_api
from video-api.model.live_stream import LiveStream
from video-api.model.not_found import NotFound
from video-api.model.bad_request import BadRequest
from video-api.model.live_stream_thumbnail_upload_payload import LiveStreamThumbnailUploadPayload
from pprint import pprint
# Defining the host is optional and defaults to https://ws.api.video
# See configuration.py for a list of all supported configuration parameters.
configuration = video-api.Configuration(
    host = "https://ws.api.video"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure Bearer authorization: bearerAuth
configuration = video-api.Configuration(
    access_token = 'YOUR_BEARER_TOKEN'
)
# Enter a context with an instance of the API client
with video-api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = live_api.LiveApi(api_client)

    # example passing only required values which don't have defaults set
    path_params = {
        'liveStreamId': "vi4k0jvEUuaTdRAEjQ4Jfrgz",
    }
    try:
        # Upload a thumbnail
        api_response = api_instance.p_ost_live_streams_live_stream_id_thumbnail(
            path_params=path_params,
        )
        pprint(api_response)
    except video-api.ApiException as e:
        print("Exception when calling LiveApi->p_ost_live_streams_live_stream_id_thumbnail: %s\n" % e)

    # example passing only optional values
    path_params = {
        'liveStreamId': "vi4k0jvEUuaTdRAEjQ4Jfrgz",
    }
    body = dict(
        file=open('/path/to/file', 'rb'),
    )
    try:
        # Upload a thumbnail
        api_response = api_instance.p_ost_live_streams_live_stream_id_thumbnail(
            path_params=path_params,
            body=body,
        )
        pprint(api_response)
    except video-api.ApiException as e:
        print("Exception when calling LiveApi->p_ost_live_streams_live_stream_id_thumbnail: %s\n" % e)
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
[**LiveStreamThumbnailUploadPayload**](../../models/LiveStreamThumbnailUploadPayload.md) |  | 


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
201 | [ApiResponseFor201](#p_ost_live_streams_live_stream_id_thumbnail.ApiResponseFor201) | Created
400 | [ApiResponseFor400](#p_ost_live_streams_live_stream_id_thumbnail.ApiResponseFor400) | Bad Request
404 | [ApiResponseFor404](#p_ost_live_streams_live_stream_id_thumbnail.ApiResponseFor404) | Not Found

#### p_ost_live_streams_live_stream_id_thumbnail.ApiResponseFor201
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor201ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor201ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**LiveStream**](../../models/LiveStream.md) |  | 


#### p_ost_live_streams_live_stream_id_thumbnail.ApiResponseFor400
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor400ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor400ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**BadRequest**](../../models/BadRequest.md) |  | 


#### p_ost_live_streams_live_stream_id_thumbnail.ApiResponseFor404
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

