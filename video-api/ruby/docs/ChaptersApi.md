# video-api::ChaptersApi

All URIs are relative to *https://ws.api.video*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**d_elete_videos_video_id_chapters_language**](ChaptersApi.md#d_elete_videos_video_id_chapters_language) | **DELETE** /videos/{videoId}/chapters/{language} | Delete a chapter |
| [**g_et_videos_video_id_chapters**](ChaptersApi.md#g_et_videos_video_id_chapters) | **GET** /videos/{videoId}/chapters | List video chapters |
| [**g_et_videos_video_id_chapters_language**](ChaptersApi.md#g_et_videos_video_id_chapters_language) | **GET** /videos/{videoId}/chapters/{language} | Show a chapter |
| [**p_ost_videos_video_id_chapters_language**](ChaptersApi.md#p_ost_videos_video_id_chapters_language) | **POST** /videos/{videoId}/chapters/{language} | Upload a chapter |


## d_elete_videos_video_id_chapters_language

> d_elete_videos_video_id_chapters_language(video_id, language)

Delete a chapter

### Examples

```ruby
require 'time'
require 'video-api'
# setup authorization
video-api.configure do |config|
  # Configure Bearer authorization: bearerAuth
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = video-api::ChaptersApi.new
video_id = 'vi4k0jvEUuaTdRAEjQ4Jfrgz' # String | The unique identifier for the video you want to delete a chapter from. 
language = 'en' # String | A valid [BCP 47](https://github.com/libyal/libfwnt/wiki/Language-Code-identifiers) language representation.

begin
  # Delete a chapter
  api_instance.d_elete_videos_video_id_chapters_language(video_id, language)
rescue video-api::ApiError => e
  puts "Error when calling ChaptersApi->d_elete_videos_video_id_chapters_language: #{e}"
end
```

#### Using the d_elete_videos_video_id_chapters_language_with_http_info variant

This returns an Array which contains the response data (`nil` in this case), status code and headers.

> <Array(nil, Integer, Hash)> d_elete_videos_video_id_chapters_language_with_http_info(video_id, language)

```ruby
begin
  # Delete a chapter
  data, status_code, headers = api_instance.d_elete_videos_video_id_chapters_language_with_http_info(video_id, language)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => nil
rescue video-api::ApiError => e
  puts "Error when calling ChaptersApi->d_elete_videos_video_id_chapters_language_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **video_id** | **String** | The unique identifier for the video you want to delete a chapter from.  |  |
| **language** | **String** | A valid [BCP 47](https://github.com/libyal/libfwnt/wiki/Language-Code-identifiers) language representation. |  |

### Return type

nil (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## g_et_videos_video_id_chapters

> <ChaptersListResponse> g_et_videos_video_id_chapters(opts)

List video chapters

Retrieve a list of all chapters for a specified video.

### Examples

```ruby
require 'time'
require 'video-api'
# setup authorization
video-api.configure do |config|
  # Configure Bearer authorization: bearerAuth
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = video-api::ChaptersApi.new
opts = {
    video_id: 'vi4k0jvEUuaTdRAEjQ4Jfrgz', # String | The unique identifier for the video you want to retrieve a list of chapters for. (required)
    current_page: 2, # Integer | Choose the number of search results to return per page. Minimum value: 1
    page_size: 30, # Integer | Results per page. Allowed values 1-100, default is 25.
}

begin
  # List video chapters
  result = api_instance.g_et_videos_video_id_chapters(opts)
  p result
rescue video-api::ApiError => e
  puts "Error when calling ChaptersApi->g_et_videos_video_id_chapters: #{e}"
end
```

#### Using the g_et_videos_video_id_chapters_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<ChaptersListResponse>, Integer, Hash)> g_et_videos_video_id_chapters_with_http_info(opts)

```ruby
begin
  # List video chapters
  data, status_code, headers = api_instance.g_et_videos_video_id_chapters_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <ChaptersListResponse>
rescue video-api::ApiError => e
  puts "Error when calling ChaptersApi->g_et_videos_video_id_chapters_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **video_id** | **String** | The unique identifier for the video you want to retrieve a list of chapters for. |  |
| **current_page** | **Integer** | Choose the number of search results to return per page. Minimum value: 1 | [optional][default to 1] |
| **page_size** | **Integer** | Results per page. Allowed values 1-100, default is 25. | [optional][default to 25] |

### Return type

[**ChaptersListResponse**](ChaptersListResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## g_et_videos_video_id_chapters_language

> <Chapter> g_et_videos_video_id_chapters_language(video_id, language)

Show a chapter

Chapters help your viewers find the sections of the video they are most interested in viewing. Tutorials that use the [chapters endpoint](https://api.video/blog/endpoints/chapters).

### Examples

```ruby
require 'time'
require 'video-api'
# setup authorization
video-api.configure do |config|
  # Configure Bearer authorization: bearerAuth
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = video-api::ChaptersApi.new
video_id = 'vi4k0jvEUuaTdRAEjQ4Jfrgz' # String | The unique identifier for the video you want to show a chapter for.
language = 'en' # String | A valid [BCP 47](https://github.com/libyal/libfwnt/wiki/Language-Code-identifiers) language representation.

begin
  # Show a chapter
  result = api_instance.g_et_videos_video_id_chapters_language(video_id, language)
  p result
rescue video-api::ApiError => e
  puts "Error when calling ChaptersApi->g_et_videos_video_id_chapters_language: #{e}"
end
```

#### Using the g_et_videos_video_id_chapters_language_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Chapter>, Integer, Hash)> g_et_videos_video_id_chapters_language_with_http_info(video_id, language)

```ruby
begin
  # Show a chapter
  data, status_code, headers = api_instance.g_et_videos_video_id_chapters_language_with_http_info(video_id, language)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Chapter>
rescue video-api::ApiError => e
  puts "Error when calling ChaptersApi->g_et_videos_video_id_chapters_language_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **video_id** | **String** | The unique identifier for the video you want to show a chapter for. |  |
| **language** | **String** | A valid [BCP 47](https://github.com/libyal/libfwnt/wiki/Language-Code-identifiers) language representation. |  |

### Return type

[**Chapter**](Chapter.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## p_ost_videos_video_id_chapters_language

> <Chapter> p_ost_videos_video_id_chapters_language(video_id, language, file)

Upload a chapter

Chapters help break the video into sections. Read our [tutorial](https://api.video/blog/tutorials/adding-chapters-to-your-videos) for more details.

### Examples

```ruby
require 'time'
require 'video-api'
# setup authorization
video-api.configure do |config|
  # Configure Bearer authorization: bearerAuth
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = video-api::ChaptersApi.new
video_id = 'vi4k0jvEUuaTdRAEjQ4Jfrgz' # String | The unique identifier for the video you want to upload a chapter for.
language = 'en' # String | A valid [BCP 47](https://github.com/libyal/libfwnt/wiki/Language-Code-identifiers) language representation.
file = File.new('/path/to/some/file') # File | The VTT file describing the chapters you want to upload.

begin
  # Upload a chapter
  result = api_instance.p_ost_videos_video_id_chapters_language(video_id, language, file)
  p result
rescue video-api::ApiError => e
  puts "Error when calling ChaptersApi->p_ost_videos_video_id_chapters_language: #{e}"
end
```

#### Using the p_ost_videos_video_id_chapters_language_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Chapter>, Integer, Hash)> p_ost_videos_video_id_chapters_language_with_http_info(video_id, language, file)

```ruby
begin
  # Upload a chapter
  data, status_code, headers = api_instance.p_ost_videos_video_id_chapters_language_with_http_info(video_id, language, file)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Chapter>
rescue video-api::ApiError => e
  puts "Error when calling ChaptersApi->p_ost_videos_video_id_chapters_language_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **video_id** | **String** | The unique identifier for the video you want to upload a chapter for. |  |
| **language** | **String** | A valid [BCP 47](https://github.com/libyal/libfwnt/wiki/Language-Code-identifiers) language representation. |  |
| **file** | **File** | The VTT file describing the chapters you want to upload. |  |

### Return type

[**Chapter**](Chapter.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json

