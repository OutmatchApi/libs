<a name="__pageTop"></a>
# testing-api-video.apis.tags.chapters_api.ChaptersApi

All URIs are relative to *https://ws.api.video*

Method | HTTP request | Description
------------- | ------------- | -------------
[**d_elete_videos_video_id_chapters_language**](#d_elete_videos_video_id_chapters_language) | **delete** /videos/{videoId}/chapters/{language} | Delete a chapter
[**g_et_videos_video_id_chapters**](#g_et_videos_video_id_chapters) | **get** /videos/{videoId}/chapters | List video chapters
[**g_et_videos_video_id_chapters_language**](#g_et_videos_video_id_chapters_language) | **get** /videos/{videoId}/chapters/{language} | Show a chapter
[**p_ost_videos_video_id_chapters_language**](#p_ost_videos_video_id_chapters_language) | **post** /videos/{videoId}/chapters/{language} | Upload a chapter

# **d_elete_videos_video_id_chapters_language**
<a name="d_elete_videos_video_id_chapters_language"></a>
> d_elete_videos_video_id_chapters_language(video_idlanguage)

Delete a chapter

### Example

* Bearer Authentication (bearerAuth):
```python
import testing-api-video
from testing-api-video.apis.tags import chapters_api
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
    api_instance = chapters_api.ChaptersApi(api_client)

    # example passing only required values which don't have defaults set
    path_params = {
        'videoId': "vi4k0jvEUuaTdRAEjQ4Jfrgz",
        'language': "en",
    }
    try:
        # Delete a chapter
        api_response = api_instance.d_elete_videos_video_id_chapters_language(
            path_params=path_params,
        )
    except testing-api-video.ApiException as e:
        print("Exception when calling ChaptersApi->d_elete_videos_video_id_chapters_language: %s\n" % e)
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
language | LanguageSchema | | 

# VideoIdSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# LanguageSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
204 | [ApiResponseFor204](#d_elete_videos_video_id_chapters_language.ApiResponseFor204) | No Content
404 | [ApiResponseFor404](#d_elete_videos_video_id_chapters_language.ApiResponseFor404) | Not Found

#### d_elete_videos_video_id_chapters_language.ApiResponseFor204
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | Unset | body was not defined |
headers | Unset | headers were not defined |

#### d_elete_videos_video_id_chapters_language.ApiResponseFor404
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

# **g_et_videos_video_id_chapters**
<a name="g_et_videos_video_id_chapters"></a>
> ChaptersListResponse g_et_videos_video_id_chapters(video_id)

List video chapters

Retrieve a list of all chapters for a specified video.

### Example

* Bearer Authentication (bearerAuth):
```python
import testing-api-video
from testing-api-video.apis.tags import chapters_api
from testing-api-video.model.chapters_list_response import ChaptersListResponse
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
    api_instance = chapters_api.ChaptersApi(api_client)

    # example passing only required values which don't have defaults set
    path_params = {
        'videoId': "vi4k0jvEUuaTdRAEjQ4Jfrgz",
    }
    query_params = {
    }
    try:
        # List video chapters
        api_response = api_instance.g_et_videos_video_id_chapters(
            path_params=path_params,
            query_params=query_params,
        )
        pprint(api_response)
    except testing-api-video.ApiException as e:
        print("Exception when calling ChaptersApi->g_et_videos_video_id_chapters: %s\n" % e)

    # example passing only optional values
    path_params = {
        'videoId': "vi4k0jvEUuaTdRAEjQ4Jfrgz",
    }
    query_params = {
        'currentPage': 2,
        'pageSize': 30,
    }
    try:
        # List video chapters
        api_response = api_instance.g_et_videos_video_id_chapters(
            path_params=path_params,
            query_params=query_params,
        )
        pprint(api_response)
    except testing-api-video.ApiException as e:
        print("Exception when calling ChaptersApi->g_et_videos_video_id_chapters: %s\n" % e)
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
200 | [ApiResponseFor200](#g_et_videos_video_id_chapters.ApiResponseFor200) | Success
404 | [ApiResponseFor404](#g_et_videos_video_id_chapters.ApiResponseFor404) | Not Found

#### g_et_videos_video_id_chapters.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**ChaptersListResponse**](../../models/ChaptersListResponse.md) |  | 


#### g_et_videos_video_id_chapters.ApiResponseFor404
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

# **g_et_videos_video_id_chapters_language**
<a name="g_et_videos_video_id_chapters_language"></a>
> Chapter g_et_videos_video_id_chapters_language(video_idlanguage)

Show a chapter

Chapters help your viewers find the sections of the video they are most interested in viewing. Tutorials that use the [chapters endpoint](https://api.video/blog/endpoints/chapters).

### Example

* Bearer Authentication (bearerAuth):
```python
import testing-api-video
from testing-api-video.apis.tags import chapters_api
from testing-api-video.model.chapter import Chapter
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
    api_instance = chapters_api.ChaptersApi(api_client)

    # example passing only required values which don't have defaults set
    path_params = {
        'videoId': "vi4k0jvEUuaTdRAEjQ4Jfrgz",
        'language': "en",
    }
    try:
        # Show a chapter
        api_response = api_instance.g_et_videos_video_id_chapters_language(
            path_params=path_params,
        )
        pprint(api_response)
    except testing-api-video.ApiException as e:
        print("Exception when calling ChaptersApi->g_et_videos_video_id_chapters_language: %s\n" % e)
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
language | LanguageSchema | | 

# VideoIdSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# LanguageSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#g_et_videos_video_id_chapters_language.ApiResponseFor200) | Success
404 | [ApiResponseFor404](#g_et_videos_video_id_chapters_language.ApiResponseFor404) | Not Found

#### g_et_videos_video_id_chapters_language.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**Chapter**](../../models/Chapter.md) |  | 


#### g_et_videos_video_id_chapters_language.ApiResponseFor404
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

# **p_ost_videos_video_id_chapters_language**
<a name="p_ost_videos_video_id_chapters_language"></a>
> Chapter p_ost_videos_video_id_chapters_language(video_idlanguage)

Upload a chapter

Chapters help break the video into sections. Read our [tutorial](https://api.video/blog/tutorials/adding-chapters-to-your-videos) for more details.

### Example

* Bearer Authentication (bearerAuth):
```python
import testing-api-video
from testing-api-video.apis.tags import chapters_api
from testing-api-video.model.chapter import Chapter
from testing-api-video.model.bad_request import BadRequest
from testing-api-video.model.chapters_update_payload import ChaptersUpdatePayload
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
    api_instance = chapters_api.ChaptersApi(api_client)

    # example passing only required values which don't have defaults set
    path_params = {
        'videoId': "vi4k0jvEUuaTdRAEjQ4Jfrgz",
        'language': "en",
    }
    try:
        # Upload a chapter
        api_response = api_instance.p_ost_videos_video_id_chapters_language(
            path_params=path_params,
        )
        pprint(api_response)
    except testing-api-video.ApiException as e:
        print("Exception when calling ChaptersApi->p_ost_videos_video_id_chapters_language: %s\n" % e)

    # example passing only optional values
    path_params = {
        'videoId': "vi4k0jvEUuaTdRAEjQ4Jfrgz",
        'language': "en",
    }
    body = dict(
        file=open('/path/to/file', 'rb'),
    )
    try:
        # Upload a chapter
        api_response = api_instance.p_ost_videos_video_id_chapters_language(
            path_params=path_params,
            body=body,
        )
        pprint(api_response)
    except testing-api-video.ApiException as e:
        print("Exception when calling ChaptersApi->p_ost_videos_video_id_chapters_language: %s\n" % e)
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
[**ChaptersUpdatePayload**](../../models/ChaptersUpdatePayload.md) |  | 


### path_params
#### RequestPathParams

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
videoId | VideoIdSchema | | 
language | LanguageSchema | | 

# VideoIdSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# LanguageSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#p_ost_videos_video_id_chapters_language.ApiResponseFor200) | Success
400 | [ApiResponseFor400](#p_ost_videos_video_id_chapters_language.ApiResponseFor400) | Bad Request
404 | [ApiResponseFor404](#p_ost_videos_video_id_chapters_language.ApiResponseFor404) | Not Found

#### p_ost_videos_video_id_chapters_language.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**Chapter**](../../models/Chapter.md) |  | 


#### p_ost_videos_video_id_chapters_language.ApiResponseFor400
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor400ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor400ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**BadRequest**](../../models/BadRequest.md) |  | 


#### p_ost_videos_video_id_chapters_language.ApiResponseFor404
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

