<a name="__pageTop"></a>
# apivideo.apis.tags.captions_api.CaptionsApi

All URIs are relative to *https://ws.api.video*

Method | HTTP request | Description
------------- | ------------- | -------------
[**d_elete_videos_video_id_captions_language**](#d_elete_videos_video_id_captions_language) | **delete** /videos/{videoId}/captions/{language} | Delete a caption
[**g_et_videos_video_id_captions**](#g_et_videos_video_id_captions) | **get** /videos/{videoId}/captions | List video captions
[**g_et_videos_video_id_captions_language**](#g_et_videos_video_id_captions_language) | **get** /videos/{videoId}/captions/{language} | Show a caption
[**p_atch_videos_video_id_captions_language**](#p_atch_videos_video_id_captions_language) | **patch** /videos/{videoId}/captions/{language} | Update caption
[**p_ost_videos_video_id_captions_language**](#p_ost_videos_video_id_captions_language) | **post** /videos/{videoId}/captions/{language} | Upload a caption

# **d_elete_videos_video_id_captions_language**
<a name="d_elete_videos_video_id_captions_language"></a>
> d_elete_videos_video_id_captions_language(video_idlanguage)

Delete a caption

Delete a caption in a specific language by providing the video ID for the video you want to delete the caption from and the language the caption is in.

### Example

* Bearer Authentication (bearerAuth):
```python
import apivideo
from apivideo.apis.tags import captions_api
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
    api_instance = captions_api.CaptionsApi(api_client)

    # example passing only required values which don't have defaults set
    path_params = {
        'videoId': "vi4k0jvEUuaTdRAEjQ4Prklgc",
        'language': "en",
    }
    try:
        # Delete a caption
        api_response = api_instance.d_elete_videos_video_id_captions_language(
            path_params=path_params,
        )
    except apivideo.ApiException as e:
        print("Exception when calling CaptionsApi->d_elete_videos_video_id_captions_language: %s\n" % e)
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
204 | [ApiResponseFor204](#d_elete_videos_video_id_captions_language.ApiResponseFor204) | No Content
404 | [ApiResponseFor404](#d_elete_videos_video_id_captions_language.ApiResponseFor404) | Not Found

#### d_elete_videos_video_id_captions_language.ApiResponseFor204
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | Unset | body was not defined |
headers | Unset | headers were not defined |

#### d_elete_videos_video_id_captions_language.ApiResponseFor404
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

# **g_et_videos_video_id_captions**
<a name="g_et_videos_video_id_captions"></a>
> CaptionsListResponse g_et_videos_video_id_captions(video_id)

List video captions

Retrieve a list of available captions for the videoId you provide.

### Example

* Bearer Authentication (bearerAuth):
```python
import apivideo
from apivideo.apis.tags import captions_api
from apivideo.model.not_found import NotFound
from apivideo.model.captions_list_response import CaptionsListResponse
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
    api_instance = captions_api.CaptionsApi(api_client)

    # example passing only required values which don't have defaults set
    path_params = {
        'videoId': "vi4k0jvEUuaTdRAEjQ4Prklg",
    }
    query_params = {
    }
    try:
        # List video captions
        api_response = api_instance.g_et_videos_video_id_captions(
            path_params=path_params,
            query_params=query_params,
        )
        pprint(api_response)
    except apivideo.ApiException as e:
        print("Exception when calling CaptionsApi->g_et_videos_video_id_captions: %s\n" % e)

    # example passing only optional values
    path_params = {
        'videoId': "vi4k0jvEUuaTdRAEjQ4Prklg",
    }
    query_params = {
        'currentPage': 2,
        'pageSize': 30,
    }
    try:
        # List video captions
        api_response = api_instance.g_et_videos_video_id_captions(
            path_params=path_params,
            query_params=query_params,
        )
        pprint(api_response)
    except apivideo.ApiException as e:
        print("Exception when calling CaptionsApi->g_et_videos_video_id_captions: %s\n" % e)
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
200 | [ApiResponseFor200](#g_et_videos_video_id_captions.ApiResponseFor200) | Success
404 | [ApiResponseFor404](#g_et_videos_video_id_captions.ApiResponseFor404) | Not Found

#### g_et_videos_video_id_captions.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**CaptionsListResponse**](../../models/CaptionsListResponse.md) |  | 


#### g_et_videos_video_id_captions.ApiResponseFor404
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

# **g_et_videos_video_id_captions_language**
<a name="g_et_videos_video_id_captions_language"></a>
> Subtitle g_et_videos_video_id_captions_language(video_idlanguage)

Show a caption

Display a caption for a video in a specific language. If the language is available, the caption is returned. Otherwise, you will get a response indicating the caption was not found. Tutorials that use the [captions endpoint](https://api.video/blog/endpoints/captions).

### Example

* Bearer Authentication (bearerAuth):
```python
import apivideo
from apivideo.apis.tags import captions_api
from apivideo.model.subtitle import Subtitle
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
    api_instance = captions_api.CaptionsApi(api_client)

    # example passing only required values which don't have defaults set
    path_params = {
        'videoId': "vi4k0jvEUuaTdRAEjQ4Prklg",
        'language': "en",
    }
    try:
        # Show a caption
        api_response = api_instance.g_et_videos_video_id_captions_language(
            path_params=path_params,
        )
        pprint(api_response)
    except apivideo.ApiException as e:
        print("Exception when calling CaptionsApi->g_et_videos_video_id_captions_language: %s\n" % e)
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
200 | [ApiResponseFor200](#g_et_videos_video_id_captions_language.ApiResponseFor200) | Success
404 | [ApiResponseFor404](#g_et_videos_video_id_captions_language.ApiResponseFor404) | Not Found

#### g_et_videos_video_id_captions_language.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**Subtitle**](../../models/Subtitle.md) |  | 


#### g_et_videos_video_id_captions_language.ApiResponseFor404
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

# **p_atch_videos_video_id_captions_language**
<a name="p_atch_videos_video_id_captions_language"></a>
> Subtitle p_atch_videos_video_id_captions_language(video_idlanguage)

Update caption

To have the captions on automatically, use this PATCH to set default: true.

### Example

* Bearer Authentication (bearerAuth):
```python
import apivideo
from apivideo.apis.tags import captions_api
from apivideo.model.subtitle import Subtitle
from apivideo.model.bad_request import BadRequest
from apivideo.model.captions_update_payload import CaptionsUpdatePayload
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
    api_instance = captions_api.CaptionsApi(api_client)

    # example passing only required values which don't have defaults set
    path_params = {
        'videoId': "vi4k0jvEUuaTdRAEjQ4Prklg",
        'language': "en",
    }
    try:
        # Update caption
        api_response = api_instance.p_atch_videos_video_id_captions_language(
            path_params=path_params,
        )
        pprint(api_response)
    except apivideo.ApiException as e:
        print("Exception when calling CaptionsApi->p_atch_videos_video_id_captions_language: %s\n" % e)

    # example passing only optional values
    path_params = {
        'videoId': "vi4k0jvEUuaTdRAEjQ4Prklg",
        'language': "en",
    }
    body = CaptionsUpdatePayload(
        default=True,
    )
    try:
        # Update caption
        api_response = api_instance.p_atch_videos_video_id_captions_language(
            path_params=path_params,
            body=body,
        )
        pprint(api_response)
    except apivideo.ApiException as e:
        print("Exception when calling CaptionsApi->p_atch_videos_video_id_captions_language: %s\n" % e)
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
[**CaptionsUpdatePayload**](../../models/CaptionsUpdatePayload.md) |  | 


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
200 | [ApiResponseFor200](#p_atch_videos_video_id_captions_language.ApiResponseFor200) | Success
400 | [ApiResponseFor400](#p_atch_videos_video_id_captions_language.ApiResponseFor400) | Bad Request
404 | [ApiResponseFor404](#p_atch_videos_video_id_captions_language.ApiResponseFor404) | Not Found

#### p_atch_videos_video_id_captions_language.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**Subtitle**](../../models/Subtitle.md) |  | 


#### p_atch_videos_video_id_captions_language.ApiResponseFor400
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor400ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor400ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**BadRequest**](../../models/BadRequest.md) |  | 


#### p_atch_videos_video_id_captions_language.ApiResponseFor404
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

# **p_ost_videos_video_id_captions_language**
<a name="p_ost_videos_video_id_captions_language"></a>
> Subtitle p_ost_videos_video_id_captions_language(video_idlanguage)

Upload a caption

Upload a VTT file to add captions to your video.  Read our [captioning tutorial](https://api.video/blog/tutorials/adding-captions) for more details.

### Example

* Bearer Authentication (bearerAuth):
```python
import apivideo
from apivideo.apis.tags import captions_api
from apivideo.model.subtitle import Subtitle
from apivideo.model.bad_request import BadRequest
from apivideo.model.not_found import NotFound
from apivideo.model.captions_upload_payload import CaptionsUploadPayload
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
    api_instance = captions_api.CaptionsApi(api_client)

    # example passing only required values which don't have defaults set
    path_params = {
        'videoId': "vi4k0jvEUuaTdRAEjQ4Prklg",
        'language': "en",
    }
    try:
        # Upload a caption
        api_response = api_instance.p_ost_videos_video_id_captions_language(
            path_params=path_params,
        )
        pprint(api_response)
    except apivideo.ApiException as e:
        print("Exception when calling CaptionsApi->p_ost_videos_video_id_captions_language: %s\n" % e)

    # example passing only optional values
    path_params = {
        'videoId': "vi4k0jvEUuaTdRAEjQ4Prklg",
        'language': "en",
    }
    body = dict(
        file="[B@742aa00a",
    )
    try:
        # Upload a caption
        api_response = api_instance.p_ost_videos_video_id_captions_language(
            path_params=path_params,
            body=body,
        )
        pprint(api_response)
    except apivideo.ApiException as e:
        print("Exception when calling CaptionsApi->p_ost_videos_video_id_captions_language: %s\n" % e)
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
[**CaptionsUploadPayload**](../../models/CaptionsUploadPayload.md) |  | 


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
200 | [ApiResponseFor200](#p_ost_videos_video_id_captions_language.ApiResponseFor200) | Success
400 | [ApiResponseFor400](#p_ost_videos_video_id_captions_language.ApiResponseFor400) | Bad Request
404 | [ApiResponseFor404](#p_ost_videos_video_id_captions_language.ApiResponseFor404) | Not Found

#### p_ost_videos_video_id_captions_language.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**Subtitle**](../../models/Subtitle.md) |  | 


#### p_ost_videos_video_id_captions_language.ApiResponseFor400
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor400ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor400ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**BadRequest**](../../models/BadRequest.md) |  | 


#### p_ost_videos_video_id_captions_language.ApiResponseFor404
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

