# testing-api-video::VideosApi

All URIs are relative to *https://ws.api.video*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**d_elete_video**](VideosApi.md#d_elete_video) | **DELETE** /videos/{videoId} | Delete a video |
| [**g_et_video**](VideosApi.md#g_et_video) | **GET** /videos/{videoId} | Show a video |
| [**g_et_video_status**](VideosApi.md#g_et_video_status) | **GET** /videos/{videoId}/status | Show video status |
| [**l_ist_videos**](VideosApi.md#l_ist_videos) | **GET** /videos | List all videos |
| [**p_atch_video**](VideosApi.md#p_atch_video) | **PATCH** /videos/{videoId} | Update a video |
| [**p_atch_videos_video_id_thumbnail**](VideosApi.md#p_atch_videos_video_id_thumbnail) | **PATCH** /videos/{videoId}/thumbnail | Pick a thumbnail |
| [**p_ost_video**](VideosApi.md#p_ost_video) | **POST** /videos | Create a video |
| [**p_ost_videos_video_id_source**](VideosApi.md#p_ost_videos_video_id_source) | **POST** /videos/{videoId}/source | Upload a video |
| [**p_ost_videos_video_id_thumbnail**](VideosApi.md#p_ost_videos_video_id_thumbnail) | **POST** /videos/{videoId}/thumbnail | Upload a thumbnail |


## d_elete_video

> d_elete_video(video_id)

Delete a video

If you do not need a video any longer, you can send a request to delete it. All you need is the videoId. Tutorials using [video deletion](https://api.video/blog/endpoints/video-delete).

### Examples

```ruby
require 'time'
require 'testing-api-video'
# setup authorization
testing-api-video.configure do |config|
  # Configure Bearer authorization: bearerAuth
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = testing-api-video::VideosApi.new
video_id = 'vi4k0jvEUuaTdRAEjQ4Jfrgz' # String | The video ID for the video you want to delete.

begin
  # Delete a video
  api_instance.d_elete_video(video_id)
rescue testing-api-video::ApiError => e
  puts "Error when calling VideosApi->d_elete_video: #{e}"
end
```

#### Using the d_elete_video_with_http_info variant

This returns an Array which contains the response data (`nil` in this case), status code and headers.

> <Array(nil, Integer, Hash)> d_elete_video_with_http_info(video_id)

```ruby
begin
  # Delete a video
  data, status_code, headers = api_instance.d_elete_video_with_http_info(video_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => nil
rescue testing-api-video::ApiError => e
  puts "Error when calling VideosApi->d_elete_video_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **video_id** | **String** | The video ID for the video you want to delete. |  |

### Return type

nil (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## g_et_video

> <Video> g_et_video(video_id)

Show a video

This call provides the same JSON information provided on video creation. For private videos, it will generate a unique token url. Use this to retrieve any details you need about a video, or set up a private viewing URL. Tutorials using [video GET](https://api.video/blog/endpoints/video-get).

### Examples

```ruby
require 'time'
require 'testing-api-video'
# setup authorization
testing-api-video.configure do |config|
  # Configure Bearer authorization: bearerAuth
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = testing-api-video::VideosApi.new
video_id = 'video_id_example' # String | The unique identifier for the video you want details about.

begin
  # Show a video
  result = api_instance.g_et_video(video_id)
  p result
rescue testing-api-video::ApiError => e
  puts "Error when calling VideosApi->g_et_video: #{e}"
end
```

#### Using the g_et_video_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Video>, Integer, Hash)> g_et_video_with_http_info(video_id)

```ruby
begin
  # Show a video
  data, status_code, headers = api_instance.g_et_video_with_http_info(video_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Video>
rescue testing-api-video::ApiError => e
  puts "Error when calling VideosApi->g_et_video_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **video_id** | **String** | The unique identifier for the video you want details about. |  |

### Return type

[**Video**](Video.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## g_et_video_status

> <Videostatus> g_et_video_status(video_id)

Show video status

This API provides upload status & encoding status to determine when the video is uploaded or ready to playback. Once encoding is completed, the response also lists the available stream qualities. Tutorials using [video status](https://api.video/blog/endpoints/video-status).

### Examples

```ruby
require 'time'
require 'testing-api-video'
# setup authorization
testing-api-video.configure do |config|
  # Configure Bearer authorization: bearerAuth
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = testing-api-video::VideosApi.new
video_id = 'vi4k0jvEUuaTdRAEjQ4Jfrgz' # String | The unique identifier for the video you want the status for.

begin
  # Show video status
  result = api_instance.g_et_video_status(video_id)
  p result
rescue testing-api-video::ApiError => e
  puts "Error when calling VideosApi->g_et_video_status: #{e}"
end
```

#### Using the g_et_video_status_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Videostatus>, Integer, Hash)> g_et_video_status_with_http_info(video_id)

```ruby
begin
  # Show video status
  data, status_code, headers = api_instance.g_et_video_status_with_http_info(video_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Videostatus>
rescue testing-api-video::ApiError => e
  puts "Error when calling VideosApi->g_et_video_status_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **video_id** | **String** | The unique identifier for the video you want the status for. |  |

### Return type

[**Videostatus**](Videostatus.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## l_ist_videos

> <VideosListResponse> l_ist_videos(opts)

List all videos

Requests to this endpoint return a list of your videos (with all their details). With no parameters added to this query, the API returns all videos. You can filter what videos the API returns using the parameters described below.  We have [several tutorials](https://api.video/blog/endpoints/video-list) that demonstrate this endpoint.

### Examples

```ruby
require 'time'
require 'testing-api-video'
# setup authorization
testing-api-video.configure do |config|
  # Configure Bearer authorization: bearerAuth
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = testing-api-video::VideosApi.new
opts = {
    title: 'My Video.mp4', # String | The title of a specific video you want to find. The search will match exactly to what term you provide and return any videos that contain the same term as part of their titles.
    tags: ['inner_example'], # Array<String> | A tag is a category you create and apply to videos. You can search for videos with particular tags by listing one or more here. Only videos that have all the tags you list will be returned.
    metadata: ['inner_example'], # Array<String> | Videos can be tagged with metadata tags in key:value pairs. You can search for videos with specific key value pairs using this parameter. [Dynamic Metadata](https://api.video/blog/endpoints/dynamic-metadata) allows you to define a key that allows any value pair.
    description: 'New Zealand', # String | If you described a video with a term or sentence, you can add it here to return videos containing this string.
    live_stream_id: 'li400mYKSgQ6xs7taUeSaEKr', # String | If you know the ID for a live stream, you can retrieve the stream by adding the ID for it here.
    sort_by: 'publishedAt', # String | Allowed: publishedAt, title. You can search by the time videos were published at, or by title.
    sort_order: 'asc', # String | Allowed: asc, desc. asc is ascending and sorts from A to Z. desc is descending and sorts from Z to A.
    current_page: 2, # Integer | Choose the number of search results to return per page. Minimum value: 1
    page_size: 30, # Integer | Results per page. Allowed values 1-100, default is 25.
}

begin
  # List all videos
  result = api_instance.l_ist_videos(opts)
  p result
rescue testing-api-video::ApiError => e
  puts "Error when calling VideosApi->l_ist_videos: #{e}"
end
```

#### Using the l_ist_videos_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<VideosListResponse>, Integer, Hash)> l_ist_videos_with_http_info(opts)

```ruby
begin
  # List all videos
  data, status_code, headers = api_instance.l_ist_videos_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <VideosListResponse>
rescue testing-api-video::ApiError => e
  puts "Error when calling VideosApi->l_ist_videos_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **title** | **String** | The title of a specific video you want to find. The search will match exactly to what term you provide and return any videos that contain the same term as part of their titles. | [optional] |
| **tags** | [**Array&lt;String&gt;**](String.md) | A tag is a category you create and apply to videos. You can search for videos with particular tags by listing one or more here. Only videos that have all the tags you list will be returned. | [optional] |
| **metadata** | [**Array&lt;String&gt;**](String.md) | Videos can be tagged with metadata tags in key:value pairs. You can search for videos with specific key value pairs using this parameter. [Dynamic Metadata](https://api.video/blog/endpoints/dynamic-metadata) allows you to define a key that allows any value pair. | [optional] |
| **description** | **String** | If you described a video with a term or sentence, you can add it here to return videos containing this string. | [optional] |
| **live_stream_id** | **String** | If you know the ID for a live stream, you can retrieve the stream by adding the ID for it here. | [optional] |
| **sort_by** | **String** | Allowed: publishedAt, title. You can search by the time videos were published at, or by title. | [optional] |
| **sort_order** | **String** | Allowed: asc, desc. asc is ascending and sorts from A to Z. desc is descending and sorts from Z to A. | [optional] |
| **current_page** | **Integer** | Choose the number of search results to return per page. Minimum value: 1 | [optional][default to 1] |
| **page_size** | **Integer** | Results per page. Allowed values 1-100, default is 25. | [optional][default to 25] |

### Return type

[**VideosListResponse**](VideosListResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## p_atch_video

> <Video> p_atch_video(video_id, opts)

Update a video

Use this endpoint to update the parameters associated with your video. The video you are updating is determined by the video ID you provide in the path. For each parameter you want to update, include the update in the request body. NOTE: If you are updating an array, you must provide the entire array as what you provide here overwrites what is in the system rather than appending to it. Tutorials using [video update](https://api.video/blog/endpoints/video-update).

### Examples

```ruby
require 'time'
require 'testing-api-video'
# setup authorization
testing-api-video.configure do |config|
  # Configure Bearer authorization: bearerAuth
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = testing-api-video::VideosApi.new
video_id = 'vi4k0jvEUuaTdRAEjQ4Jfrgz' # String | The video ID for the video you want to delete.
opts = {
  video_update_payload: testing-api-video::VideoUpdatePayload.new # VideoUpdatePayload | 
}

begin
  # Update a video
  result = api_instance.p_atch_video(video_id, opts)
  p result
rescue testing-api-video::ApiError => e
  puts "Error when calling VideosApi->p_atch_video: #{e}"
end
```

#### Using the p_atch_video_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Video>, Integer, Hash)> p_atch_video_with_http_info(video_id, opts)

```ruby
begin
  # Update a video
  data, status_code, headers = api_instance.p_atch_video_with_http_info(video_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Video>
rescue testing-api-video::ApiError => e
  puts "Error when calling VideosApi->p_atch_video_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **video_id** | **String** | The video ID for the video you want to delete. |  |
| **video_update_payload** | [**VideoUpdatePayload**](VideoUpdatePayload.md) |  | [optional] |

### Return type

[**Video**](Video.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## p_atch_videos_video_id_thumbnail

> <Video> p_atch_videos_video_id_thumbnail(video_id, opts)

Pick a thumbnail

Pick a thumbnail from the given time code. If you'd like to upload an image for your thumbnail, use the [Upload a Thumbnail](https://docs.api.video/reference#post_videos-videoid-thumbnail) endpoint. There may be a short delay for the thumbnail to update. Tutorials using [Thumbnail picking](https://api.video/blog/endpoints/video-pick-a-thumbnail).

### Examples

```ruby
require 'time'
require 'testing-api-video'
# setup authorization
testing-api-video.configure do |config|
  # Configure Bearer authorization: bearerAuth
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = testing-api-video::VideosApi.new
video_id = 'vi4k0jvEUuaTdRAEjQ4Jfrgz' # String | Unique identifier of the video you want to add a thumbnail to, where you use a section of your video as the thumbnail.
opts = {
  video_thumbnail_pick_payload: testing-api-video::VideoThumbnailPickPayload.new({timecode: 'timecode_example'}) # VideoThumbnailPickPayload | 
}

begin
  # Pick a thumbnail
  result = api_instance.p_atch_videos_video_id_thumbnail(video_id, opts)
  p result
rescue testing-api-video::ApiError => e
  puts "Error when calling VideosApi->p_atch_videos_video_id_thumbnail: #{e}"
end
```

#### Using the p_atch_videos_video_id_thumbnail_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Video>, Integer, Hash)> p_atch_videos_video_id_thumbnail_with_http_info(video_id, opts)

```ruby
begin
  # Pick a thumbnail
  data, status_code, headers = api_instance.p_atch_videos_video_id_thumbnail_with_http_info(video_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Video>
rescue testing-api-video::ApiError => e
  puts "Error when calling VideosApi->p_atch_videos_video_id_thumbnail_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **video_id** | **String** | Unique identifier of the video you want to add a thumbnail to, where you use a section of your video as the thumbnail. |  |
| **video_thumbnail_pick_payload** | [**VideoThumbnailPickPayload**](VideoThumbnailPickPayload.md) |  | [optional] |

### Return type

[**Video**](Video.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## p_ost_video

> <Video> p_ost_video(opts)

Create a video

To create a video, you create its container&parameters first, before adding the video file (exception - when using an existing HTTP source). * Videos are public by default. [Learn about Private videos](https://api.video/blog/tutorials/tutorial-private-videos) * Up to 6 responsive video streams will be created (from 240p to 4k) * Mp4 encoded versions are created at the highest quality (max 1080p) by default. * Panoramic videos are for videos recorded in 360 degrees.  You can toggle this after your 360 video upload. * Searchable parameters: title, description, tags and metadata   ```shell $ curl https://ws.api.video/videos \\ -H 'Authorization: Bearer {access_token} \\ -d '{\"title\":\"My video\",       \"description\":\"so many details\",      \"mp4Support\":true }' ```    ## add an URL to upload on creation You can also create a video directly from a video hosted on a third-party server by giving its URI in `source` parameter: ```shell $ curl https://ws.api.video/videos \\ -H 'Authorization: Bearer {access_token} \\ -d '{\"source\":\"http://uri/to/video.mp4\", \"title\":\"My video\"}' ```  In this case, the service will respond `202 Accepted` and ingest the video asynchronously. ## Track users with Dynamic Metadata Metadata values can be a key:value where the values are predefined, but Dynamic metadata allows you to enter *any* value for a defined key.  To defined a dynamic metadata pair use: ``` \"metadata\":[{\"dynamicKey\": \"__dynamicKey__\"}] ```  The double underscore on both sides of the value allows any variable to be added for a given video session. Added the the url you might have: ``` <iframe type=\"text/html\" src=\"https://embed.api.video/vod/vi6QvU9dhYCzW3BpPvPsZUa8?metadata[classUserName]=Doug\" width=\"960\" height=\"320\" frameborder=\"0\" scrollling=\"no\"></iframe> ```   This video session will be tagged as watched by Doug - allowing for in-depth analysis on how each viewer interacts with the videos. ### We have tutorials on: * [Creating and uploading videos](https://api.video/blog/tutorials/video-upload-tutorial) * [Uploading large videos](https://api.video/blog/tutorials/video-upload-tutorial-large-videos)   * [Using tags with videos](https://api.video/blog/tutorials/video-tagging-best-practices) * [Private videos](https://api.video/blog/tutorials/tutorial-private-videos) * [Using Dynamic Metadata](https://api.video/blog/tutorials/dynamic-metadata)  * Full list of [tutorials](https://api.video/blog/endpoints/video-create) that demonstrate this endpoint. 

### Examples

```ruby
require 'time'
require 'testing-api-video'
# setup authorization
testing-api-video.configure do |config|
  # Configure Bearer authorization: bearerAuth
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = testing-api-video::VideosApi.new
opts = {
  video_create_payload: testing-api-video::VideoCreatePayload.new({title: 'Maths video'}) # VideoCreatePayload | video to create
}

begin
  # Create a video
  result = api_instance.p_ost_video(opts)
  p result
rescue testing-api-video::ApiError => e
  puts "Error when calling VideosApi->p_ost_video: #{e}"
end
```

#### Using the p_ost_video_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Video>, Integer, Hash)> p_ost_video_with_http_info(opts)

```ruby
begin
  # Create a video
  data, status_code, headers = api_instance.p_ost_video_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Video>
rescue testing-api-video::ApiError => e
  puts "Error when calling VideosApi->p_ost_video_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **video_create_payload** | [**VideoCreatePayload**](VideoCreatePayload.md) | video to create | [optional] |

### Return type

[**Video**](Video.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## p_ost_videos_video_id_source

> <Video> p_ost_videos_video_id_source(video_id, file, opts)

Upload a video

To upload a video to the videoId you created. Replace {videoId} with the id you'd like to use, {access_token} with your token, and /path/to/video.mp4 with the path to the video you'd like to upload. You can only upload your video to the videoId once. ```bash curl https://ws.api.video/videos/{videoId}/source \\   -H 'Authorization: Bearer {access_token}' \\   -F file=@/path/to/video.mp4    ``` Tutorials using [video upload](https://api.video/blog/endpoints/video-upload).

### Examples

```ruby
require 'time'
require 'testing-api-video'
# setup authorization
testing-api-video.configure do |config|
  # Configure Bearer authorization: bearerAuth
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = testing-api-video::VideosApi.new
video_id = 'vi4k0jvEUuaTdRAEjQ4Jfrgz' # String | Enter the videoId you want to use to upload your video.
file = File.new('/path/to/some/file') # File | The path to the video you would like to upload. The path must be local. If you want to use a video from an online source, you must use the \\\"/videos\\\" endpoint and add the \\\"source\\\" parameter when you create a new video.
opts = {
  content_range: 'Content-Range: bytes 200-100/5000' # String | Content-Range represents the range of bytes that will be returned as a result of the request. Byte ranges are inclusive, meaning that bytes 0-999 represents the first 1000 bytes in a file or object.
}

begin
  # Upload a video
  result = api_instance.p_ost_videos_video_id_source(video_id, file, opts)
  p result
rescue testing-api-video::ApiError => e
  puts "Error when calling VideosApi->p_ost_videos_video_id_source: #{e}"
end
```

#### Using the p_ost_videos_video_id_source_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Video>, Integer, Hash)> p_ost_videos_video_id_source_with_http_info(video_id, file, opts)

```ruby
begin
  # Upload a video
  data, status_code, headers = api_instance.p_ost_videos_video_id_source_with_http_info(video_id, file, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Video>
rescue testing-api-video::ApiError => e
  puts "Error when calling VideosApi->p_ost_videos_video_id_source_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **video_id** | **String** | Enter the videoId you want to use to upload your video. |  |
| **file** | **File** | The path to the video you would like to upload. The path must be local. If you want to use a video from an online source, you must use the \\\&quot;/videos\\\&quot; endpoint and add the \\\&quot;source\\\&quot; parameter when you create a new video. |  |
| **content_range** | **String** | Content-Range represents the range of bytes that will be returned as a result of the request. Byte ranges are inclusive, meaning that bytes 0-999 represents the first 1000 bytes in a file or object. | [optional] |

### Return type

[**Video**](Video.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json


## p_ost_videos_video_id_thumbnail

> <Video> p_ost_videos_video_id_thumbnail(video_id, file)

Upload a thumbnail

The thumbnail is the poster that appears in the player window before video playback begins. This endpoint allows you to upload an image for the thumbnail. To select a still frame from the video using a time stamp, use [Pick a Thumbnail](https://docs.api.video/reference#patch_videos-videoid-thumbnail) to pick a time in the video.  Note: There may be a short delay before the new thumbnail is delivered to our CDN. Tutorials using [Thumbnail upload](https://api.video/blog/endpoints/videos-upload-a-thumbnail).

### Examples

```ruby
require 'time'
require 'testing-api-video'
# setup authorization
testing-api-video.configure do |config|
  # Configure Bearer authorization: bearerAuth
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = testing-api-video::VideosApi.new
video_id = 'video_id_example' # String | Unique identifier of the chosen video 
file = File.new('/path/to/some/file') # File | The image to be added as a thumbnail.

begin
  # Upload a thumbnail
  result = api_instance.p_ost_videos_video_id_thumbnail(video_id, file)
  p result
rescue testing-api-video::ApiError => e
  puts "Error when calling VideosApi->p_ost_videos_video_id_thumbnail: #{e}"
end
```

#### Using the p_ost_videos_video_id_thumbnail_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Video>, Integer, Hash)> p_ost_videos_video_id_thumbnail_with_http_info(video_id, file)

```ruby
begin
  # Upload a thumbnail
  data, status_code, headers = api_instance.p_ost_videos_video_id_thumbnail_with_http_info(video_id, file)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Video>
rescue testing-api-video::ApiError => e
  puts "Error when calling VideosApi->p_ost_videos_video_id_thumbnail_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **video_id** | **String** | Unique identifier of the chosen video  |  |
| **file** | **File** | The image to be added as a thumbnail. |  |

### Return type

[**Video**](Video.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json

