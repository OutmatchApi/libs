# testing-api-video::CaptionsApi

All URIs are relative to *https://ws.api.video*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**d_elete_videos_video_id_captions_language**](CaptionsApi.md#d_elete_videos_video_id_captions_language) | **DELETE** /videos/{videoId}/captions/{language} | Delete a caption |
| [**g_et_videos_video_id_captions**](CaptionsApi.md#g_et_videos_video_id_captions) | **GET** /videos/{videoId}/captions | List video captions |
| [**g_et_videos_video_id_captions_language**](CaptionsApi.md#g_et_videos_video_id_captions_language) | **GET** /videos/{videoId}/captions/{language} | Show a caption |
| [**p_atch_videos_video_id_captions_language**](CaptionsApi.md#p_atch_videos_video_id_captions_language) | **PATCH** /videos/{videoId}/captions/{language} | Update caption |
| [**p_ost_videos_video_id_captions_language**](CaptionsApi.md#p_ost_videos_video_id_captions_language) | **POST** /videos/{videoId}/captions/{language} | Upload a caption |


## d_elete_videos_video_id_captions_language

> d_elete_videos_video_id_captions_language(video_id, language)

Delete a caption

Delete a caption in a specific language by providing the video ID for the video you want to delete the caption from and the language the caption is in.

### Examples

```ruby
require 'time'
require 'testing-api-video'
# setup authorization
testing-api-video.configure do |config|
  # Configure Bearer authorization: bearerAuth
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = testing-api-video::CaptionsApi.new
video_id = 'vi4k0jvEUuaTdRAEjQ4Prklgc' # String | The unique identifier for the video you want to delete a caption from.
language = 'en' # String | A valid [BCP 47](https://github.com/libyal/libfwnt/wiki/Language-Code-identifiers) language representation.

begin
  # Delete a caption
  api_instance.d_elete_videos_video_id_captions_language(video_id, language)
rescue testing-api-video::ApiError => e
  puts "Error when calling CaptionsApi->d_elete_videos_video_id_captions_language: #{e}"
end
```

#### Using the d_elete_videos_video_id_captions_language_with_http_info variant

This returns an Array which contains the response data (`nil` in this case), status code and headers.

> <Array(nil, Integer, Hash)> d_elete_videos_video_id_captions_language_with_http_info(video_id, language)

```ruby
begin
  # Delete a caption
  data, status_code, headers = api_instance.d_elete_videos_video_id_captions_language_with_http_info(video_id, language)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => nil
rescue testing-api-video::ApiError => e
  puts "Error when calling CaptionsApi->d_elete_videos_video_id_captions_language_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **video_id** | **String** | The unique identifier for the video you want to delete a caption from. |  |
| **language** | **String** | A valid [BCP 47](https://github.com/libyal/libfwnt/wiki/Language-Code-identifiers) language representation. |  |

### Return type

nil (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## g_et_videos_video_id_captions

> <CaptionsListResponse> g_et_videos_video_id_captions(opts)

List video captions

Retrieve a list of available captions for the videoId you provide.

### Examples

```ruby
require 'time'
require 'testing-api-video'
# setup authorization
testing-api-video.configure do |config|
  # Configure Bearer authorization: bearerAuth
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = testing-api-video::CaptionsApi.new
opts = {
    video_id: 'vi4k0jvEUuaTdRAEjQ4Prklg', # String | The unique identifier for the video you want to retrieve a list of captions for. (required)
    current_page: 2, # Integer | Choose the number of search results to return per page. Minimum value: 1
    page_size: 30, # Integer | Results per page. Allowed values 1-100, default is 25.
}

begin
  # List video captions
  result = api_instance.g_et_videos_video_id_captions(opts)
  p result
rescue testing-api-video::ApiError => e
  puts "Error when calling CaptionsApi->g_et_videos_video_id_captions: #{e}"
end
```

#### Using the g_et_videos_video_id_captions_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<CaptionsListResponse>, Integer, Hash)> g_et_videos_video_id_captions_with_http_info(opts)

```ruby
begin
  # List video captions
  data, status_code, headers = api_instance.g_et_videos_video_id_captions_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <CaptionsListResponse>
rescue testing-api-video::ApiError => e
  puts "Error when calling CaptionsApi->g_et_videos_video_id_captions_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **video_id** | **String** | The unique identifier for the video you want to retrieve a list of captions for. |  |
| **current_page** | **Integer** | Choose the number of search results to return per page. Minimum value: 1 | [optional][default to 1] |
| **page_size** | **Integer** | Results per page. Allowed values 1-100, default is 25. | [optional][default to 25] |

### Return type

[**CaptionsListResponse**](CaptionsListResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## g_et_videos_video_id_captions_language

> <Subtitle> g_et_videos_video_id_captions_language(video_id, language)

Show a caption

Display a caption for a video in a specific language. If the language is available, the caption is returned. Otherwise, you will get a response indicating the caption was not found. Tutorials that use the [captions endpoint](https://api.video/blog/endpoints/captions).

### Examples

```ruby
require 'time'
require 'testing-api-video'
# setup authorization
testing-api-video.configure do |config|
  # Configure Bearer authorization: bearerAuth
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = testing-api-video::CaptionsApi.new
video_id = 'vi4k0jvEUuaTdRAEjQ4Prklg' # String | The unique identifier for the video you want captions for.
language = 'en' # String | A valid [BCP 47](https://github.com/libyal/libfwnt/wiki/Language-Code-identifiers) language representation

begin
  # Show a caption
  result = api_instance.g_et_videos_video_id_captions_language(video_id, language)
  p result
rescue testing-api-video::ApiError => e
  puts "Error when calling CaptionsApi->g_et_videos_video_id_captions_language: #{e}"
end
```

#### Using the g_et_videos_video_id_captions_language_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Subtitle>, Integer, Hash)> g_et_videos_video_id_captions_language_with_http_info(video_id, language)

```ruby
begin
  # Show a caption
  data, status_code, headers = api_instance.g_et_videos_video_id_captions_language_with_http_info(video_id, language)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Subtitle>
rescue testing-api-video::ApiError => e
  puts "Error when calling CaptionsApi->g_et_videos_video_id_captions_language_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **video_id** | **String** | The unique identifier for the video you want captions for. |  |
| **language** | **String** | A valid [BCP 47](https://github.com/libyal/libfwnt/wiki/Language-Code-identifiers) language representation |  |

### Return type

[**Subtitle**](Subtitle.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## p_atch_videos_video_id_captions_language

> <Subtitle> p_atch_videos_video_id_captions_language(video_id, language, opts)

Update caption

To have the captions on automatically, use this PATCH to set default: true.

### Examples

```ruby
require 'time'
require 'testing-api-video'
# setup authorization
testing-api-video.configure do |config|
  # Configure Bearer authorization: bearerAuth
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = testing-api-video::CaptionsApi.new
video_id = 'vi4k0jvEUuaTdRAEjQ4Prklg' # String | The unique identifier for the video you want to have automatic captions for. 
language = 'en' # String | A valid [BCP 47](https://github.com/libyal/libfwnt/wiki/Language-Code-identifiers) language representation.
opts = {
  captions_update_payload: testing-api-video::CaptionsUpdatePayload.new # CaptionsUpdatePayload | 
}

begin
  # Update caption
  result = api_instance.p_atch_videos_video_id_captions_language(video_id, language, opts)
  p result
rescue testing-api-video::ApiError => e
  puts "Error when calling CaptionsApi->p_atch_videos_video_id_captions_language: #{e}"
end
```

#### Using the p_atch_videos_video_id_captions_language_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Subtitle>, Integer, Hash)> p_atch_videos_video_id_captions_language_with_http_info(video_id, language, opts)

```ruby
begin
  # Update caption
  data, status_code, headers = api_instance.p_atch_videos_video_id_captions_language_with_http_info(video_id, language, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Subtitle>
rescue testing-api-video::ApiError => e
  puts "Error when calling CaptionsApi->p_atch_videos_video_id_captions_language_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **video_id** | **String** | The unique identifier for the video you want to have automatic captions for.  |  |
| **language** | **String** | A valid [BCP 47](https://github.com/libyal/libfwnt/wiki/Language-Code-identifiers) language representation. |  |
| **captions_update_payload** | [**CaptionsUpdatePayload**](CaptionsUpdatePayload.md) |  | [optional] |

### Return type

[**Subtitle**](Subtitle.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## p_ost_videos_video_id_captions_language

> <Subtitle> p_ost_videos_video_id_captions_language(video_id, language, file)

Upload a caption

Upload a VTT file to add captions to your video.  Read our [captioning tutorial](https://api.video/blog/tutorials/adding-captions) for more details.

### Examples

```ruby
require 'time'
require 'testing-api-video'
# setup authorization
testing-api-video.configure do |config|
  # Configure Bearer authorization: bearerAuth
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = testing-api-video::CaptionsApi.new
video_id = 'vi4k0jvEUuaTdRAEjQ4Prklg' # String | The unique identifier for the video you want to add a caption to.
language = 'en' # String | A valid BCP 47 language representation.
file = File.new('/path/to/some/file') # File | The video text track (VTT) you want to upload.

begin
  # Upload a caption
  result = api_instance.p_ost_videos_video_id_captions_language(video_id, language, file)
  p result
rescue testing-api-video::ApiError => e
  puts "Error when calling CaptionsApi->p_ost_videos_video_id_captions_language: #{e}"
end
```

#### Using the p_ost_videos_video_id_captions_language_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Subtitle>, Integer, Hash)> p_ost_videos_video_id_captions_language_with_http_info(video_id, language, file)

```ruby
begin
  # Upload a caption
  data, status_code, headers = api_instance.p_ost_videos_video_id_captions_language_with_http_info(video_id, language, file)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Subtitle>
rescue testing-api-video::ApiError => e
  puts "Error when calling CaptionsApi->p_ost_videos_video_id_captions_language_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **video_id** | **String** | The unique identifier for the video you want to add a caption to. |  |
| **language** | **String** | A valid BCP 47 language representation. |  |
| **file** | **File** | The video text track (VTT) you want to upload. |  |

### Return type

[**Subtitle**](Subtitle.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json

