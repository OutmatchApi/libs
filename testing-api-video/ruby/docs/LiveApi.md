# testing-api-video::LiveApi

All URIs are relative to *https://ws.api.video*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**d_elete_live_streams_live_stream_id**](LiveApi.md#d_elete_live_streams_live_stream_id) | **DELETE** /live-streams/{liveStreamId} | Delete a live stream |
| [**d_elete_live_streams_live_stream_id_thumbnail**](LiveApi.md#d_elete_live_streams_live_stream_id_thumbnail) | **DELETE** /live-streams/{liveStreamId}/thumbnail | Delete a thumbnail |
| [**g_et_live_streams**](LiveApi.md#g_et_live_streams) | **GET** /live-streams | List all live streams |
| [**g_et_live_streams_live_stream_id**](LiveApi.md#g_et_live_streams_live_stream_id) | **GET** /live-streams/{liveStreamId} | Show live stream |
| [**p_atch_live_streams_live_stream_id**](LiveApi.md#p_atch_live_streams_live_stream_id) | **PATCH** /live-streams/{liveStreamId} | Update a live stream |
| [**p_ost_live_streams**](LiveApi.md#p_ost_live_streams) | **POST** /live-streams | Create live stream |
| [**p_ost_live_streams_live_stream_id_thumbnail**](LiveApi.md#p_ost_live_streams_live_stream_id_thumbnail) | **POST** /live-streams/{liveStreamId}/thumbnail | Upload a thumbnail |


## d_elete_live_streams_live_stream_id

> d_elete_live_streams_live_stream_id(live_stream_id)

Delete a live stream

### Examples

```ruby
require 'time'
require 'testing-api-video'
# setup authorization
testing-api-video.configure do |config|
  # Configure Bearer authorization: bearerAuth
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = testing-api-video::LiveApi.new
live_stream_id = 'li400mYKSgQ6xs7taUeSaEKr' # String | The unique ID for the live stream that you want to remove.

begin
  # Delete a live stream
  api_instance.d_elete_live_streams_live_stream_id(live_stream_id)
rescue testing-api-video::ApiError => e
  puts "Error when calling LiveApi->d_elete_live_streams_live_stream_id: #{e}"
end
```

#### Using the d_elete_live_streams_live_stream_id_with_http_info variant

This returns an Array which contains the response data (`nil` in this case), status code and headers.

> <Array(nil, Integer, Hash)> d_elete_live_streams_live_stream_id_with_http_info(live_stream_id)

```ruby
begin
  # Delete a live stream
  data, status_code, headers = api_instance.d_elete_live_streams_live_stream_id_with_http_info(live_stream_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => nil
rescue testing-api-video::ApiError => e
  puts "Error when calling LiveApi->d_elete_live_streams_live_stream_id_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **live_stream_id** | **String** | The unique ID for the live stream that you want to remove. |  |

### Return type

nil (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## d_elete_live_streams_live_stream_id_thumbnail

> <LiveStream> d_elete_live_streams_live_stream_id_thumbnail(live_stream_id)

Delete a thumbnail

Send the unique identifier for a live stream to delete it from the system.

### Examples

```ruby
require 'time'
require 'testing-api-video'
# setup authorization
testing-api-video.configure do |config|
  # Configure Bearer authorization: bearerAuth
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = testing-api-video::LiveApi.new
live_stream_id = 'li400mYKSgQ6xs7taUeSaEKr' # String | The unique identifier for the live stream you want to delete. 

begin
  # Delete a thumbnail
  result = api_instance.d_elete_live_streams_live_stream_id_thumbnail(live_stream_id)
  p result
rescue testing-api-video::ApiError => e
  puts "Error when calling LiveApi->d_elete_live_streams_live_stream_id_thumbnail: #{e}"
end
```

#### Using the d_elete_live_streams_live_stream_id_thumbnail_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<LiveStream>, Integer, Hash)> d_elete_live_streams_live_stream_id_thumbnail_with_http_info(live_stream_id)

```ruby
begin
  # Delete a thumbnail
  data, status_code, headers = api_instance.d_elete_live_streams_live_stream_id_thumbnail_with_http_info(live_stream_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <LiveStream>
rescue testing-api-video::ApiError => e
  puts "Error when calling LiveApi->d_elete_live_streams_live_stream_id_thumbnail_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **live_stream_id** | **String** | The unique identifier for the live stream you want to delete.  |  |

### Return type

[**LiveStream**](LiveStream.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## g_et_live_streams

> <LiveStreamListResponse> g_et_live_streams(opts)

List all live streams

With no parameters added to the url, this will return all livestreams. Query by name or key to limit the list.

### Examples

```ruby
require 'time'
require 'testing-api-video'
# setup authorization
testing-api-video.configure do |config|
  # Configure Bearer authorization: bearerAuth
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = testing-api-video::LiveApi.new
opts = {
    stream_key: '30087931-229e-42cf-b5f9-e91bcc1f7332', # String | The unique stream key that allows you to stream videos.
    name: 'My Video', # String | You can filter live streams by their name or a part of their name.
    sort_by: 'createdAt', # String | Allowed: createdAt, publishedAt, name. createdAt - the time a livestream was created using the specified streamKey. publishedAt - the time a livestream was published using the specified streamKey. name - the name of the livestream. If you choose one of the time based options, the time is presented in ISO-8601 format.
    sort_order: 'asc', # String | Allowed: asc, desc. Ascending for date and time means that earlier values precede later ones. Descending means that later values preced earlier ones. For title, it is 0-9 and A-Z ascending and Z-A, 9-0 descending.
    current_page: 2, # Integer | Choose the number of search results to return per page. Minimum value: 1
    page_size: 30, # Integer | Results per page. Allowed values 1-100, default is 25.
}

begin
  # List all live streams
  result = api_instance.g_et_live_streams(opts)
  p result
rescue testing-api-video::ApiError => e
  puts "Error when calling LiveApi->g_et_live_streams: #{e}"
end
```

#### Using the g_et_live_streams_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<LiveStreamListResponse>, Integer, Hash)> g_et_live_streams_with_http_info(opts)

```ruby
begin
  # List all live streams
  data, status_code, headers = api_instance.g_et_live_streams_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <LiveStreamListResponse>
rescue testing-api-video::ApiError => e
  puts "Error when calling LiveApi->g_et_live_streams_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **stream_key** | **String** | The unique stream key that allows you to stream videos. | [optional] |
| **name** | **String** | You can filter live streams by their name or a part of their name. | [optional] |
| **sort_by** | **String** | Allowed: createdAt, publishedAt, name. createdAt - the time a livestream was created using the specified streamKey. publishedAt - the time a livestream was published using the specified streamKey. name - the name of the livestream. If you choose one of the time based options, the time is presented in ISO-8601 format. | [optional] |
| **sort_order** | **String** | Allowed: asc, desc. Ascending for date and time means that earlier values precede later ones. Descending means that later values preced earlier ones. For title, it is 0-9 and A-Z ascending and Z-A, 9-0 descending. | [optional] |
| **current_page** | **Integer** | Choose the number of search results to return per page. Minimum value: 1 | [optional][default to 1] |
| **page_size** | **Integer** | Results per page. Allowed values 1-100, default is 25. | [optional][default to 25] |

### Return type

[**LiveStreamListResponse**](LiveStreamListResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## g_et_live_streams_live_stream_id

> <LiveStream> g_et_live_streams_live_stream_id(live_stream_id)

Show live stream

Supply a LivestreamId, and you'll get all the details for streaming into, and watching the livestream. Tutorials that use the [show livestream endpoint](https://api.video/blog/endpoints/live-stream-status).

### Examples

```ruby
require 'time'
require 'testing-api-video'
# setup authorization
testing-api-video.configure do |config|
  # Configure Bearer authorization: bearerAuth
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = testing-api-video::LiveApi.new
live_stream_id = 'li400mYKSgQ6xs7taUeSaEKr' # String | The unique ID for the live stream you want to watch.

begin
  # Show live stream
  result = api_instance.g_et_live_streams_live_stream_id(live_stream_id)
  p result
rescue testing-api-video::ApiError => e
  puts "Error when calling LiveApi->g_et_live_streams_live_stream_id: #{e}"
end
```

#### Using the g_et_live_streams_live_stream_id_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<LiveStream>, Integer, Hash)> g_et_live_streams_live_stream_id_with_http_info(live_stream_id)

```ruby
begin
  # Show live stream
  data, status_code, headers = api_instance.g_et_live_streams_live_stream_id_with_http_info(live_stream_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <LiveStream>
rescue testing-api-video::ApiError => e
  puts "Error when calling LiveApi->g_et_live_streams_live_stream_id_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **live_stream_id** | **String** | The unique ID for the live stream you want to watch. |  |

### Return type

[**LiveStream**](LiveStream.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## p_atch_live_streams_live_stream_id

> <LiveStream> p_atch_live_streams_live_stream_id(live_stream_id, opts)

Update a live stream

Use this endpoint to update the player, or to turn recording on/off (saving a copy of the livestream). NOTE: If the livestream is actively streaming, changing the recording status will only affect the NEXT stream.    The public=false 'private livestream' is available as a BETA feature, and should be limited to livestreams of 3,000 viewers or fewer.

### Examples

```ruby
require 'time'
require 'testing-api-video'
# setup authorization
testing-api-video.configure do |config|
  # Configure Bearer authorization: bearerAuth
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = testing-api-video::LiveApi.new
live_stream_id = 'li400mYKSgQ6xs7taUeSaEKr' # String | The unique ID for the live stream that you want to update information for such as player details, or whether you want the recording on or off.
opts = {
  live_stream_update_payload: testing-api-video::LiveStreamUpdatePayload.new # LiveStreamUpdatePayload | 
}

begin
  # Update a live stream
  result = api_instance.p_atch_live_streams_live_stream_id(live_stream_id, opts)
  p result
rescue testing-api-video::ApiError => e
  puts "Error when calling LiveApi->p_atch_live_streams_live_stream_id: #{e}"
end
```

#### Using the p_atch_live_streams_live_stream_id_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<LiveStream>, Integer, Hash)> p_atch_live_streams_live_stream_id_with_http_info(live_stream_id, opts)

```ruby
begin
  # Update a live stream
  data, status_code, headers = api_instance.p_atch_live_streams_live_stream_id_with_http_info(live_stream_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <LiveStream>
rescue testing-api-video::ApiError => e
  puts "Error when calling LiveApi->p_atch_live_streams_live_stream_id_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **live_stream_id** | **String** | The unique ID for the live stream that you want to update information for such as player details, or whether you want the recording on or off. |  |
| **live_stream_update_payload** | [**LiveStreamUpdatePayload**](LiveStreamUpdatePayload.md) |  | [optional] |

### Return type

[**LiveStream**](LiveStream.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## p_ost_live_streams

> <LiveStream> p_ost_live_streams(opts)

Create live stream

A live stream will give you the 'connection point' to RTMP your video stream to api.video. It will also give you the details for viewers to watch the same livestream.  The public=false 'private livestream' is available as a BETA feature, and should be limited to livestreams of 3,000 viewers or fewer. See our [Live Stream Tutorial](https://api.video/blog/tutorials/live-stream-tutorial) for a walkthrough of this API with OBS. Your RTMP endpoint for the livestream is rtmp://broadcast.api.video/s/{streamKey} Tutorials that [create live streams](https://api.video/blog/endpoints/live-create).

### Examples

```ruby
require 'time'
require 'testing-api-video'
# setup authorization
testing-api-video.configure do |config|
  # Configure Bearer authorization: bearerAuth
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = testing-api-video::LiveApi.new
opts = {
  live_stream_create_payload: testing-api-video::LiveStreamCreatePayload.new({name: 'My Live Stream Video'}) # LiveStreamCreatePayload | 
}

begin
  # Create live stream
  result = api_instance.p_ost_live_streams(opts)
  p result
rescue testing-api-video::ApiError => e
  puts "Error when calling LiveApi->p_ost_live_streams: #{e}"
end
```

#### Using the p_ost_live_streams_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<LiveStream>, Integer, Hash)> p_ost_live_streams_with_http_info(opts)

```ruby
begin
  # Create live stream
  data, status_code, headers = api_instance.p_ost_live_streams_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <LiveStream>
rescue testing-api-video::ApiError => e
  puts "Error when calling LiveApi->p_ost_live_streams_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **live_stream_create_payload** | [**LiveStreamCreatePayload**](LiveStreamCreatePayload.md) |  | [optional] |

### Return type

[**LiveStream**](LiveStream.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## p_ost_live_streams_live_stream_id_thumbnail

> <LiveStream> p_ost_live_streams_live_stream_id_thumbnail(live_stream_id, file)

Upload a thumbnail

Upload an image to use as a backdrop for your livestream. Tutorials that [update live stream thumbnails](https://api.video/blog/endpoints/live-upload-a-thumbnail).

### Examples

```ruby
require 'time'
require 'testing-api-video'
# setup authorization
testing-api-video.configure do |config|
  # Configure Bearer authorization: bearerAuth
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = testing-api-video::LiveApi.new
live_stream_id = 'vi4k0jvEUuaTdRAEjQ4Jfrgz' # String | The unique ID for the live stream you want to upload.
file = File.new('/path/to/some/file') # File | The image to be added as a thumbnail.

begin
  # Upload a thumbnail
  result = api_instance.p_ost_live_streams_live_stream_id_thumbnail(live_stream_id, file)
  p result
rescue testing-api-video::ApiError => e
  puts "Error when calling LiveApi->p_ost_live_streams_live_stream_id_thumbnail: #{e}"
end
```

#### Using the p_ost_live_streams_live_stream_id_thumbnail_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<LiveStream>, Integer, Hash)> p_ost_live_streams_live_stream_id_thumbnail_with_http_info(live_stream_id, file)

```ruby
begin
  # Upload a thumbnail
  data, status_code, headers = api_instance.p_ost_live_streams_live_stream_id_thumbnail_with_http_info(live_stream_id, file)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <LiveStream>
rescue testing-api-video::ApiError => e
  puts "Error when calling LiveApi->p_ost_live_streams_live_stream_id_thumbnail_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **live_stream_id** | **String** | The unique ID for the live stream you want to upload. |  |
| **file** | **File** | The image to be added as a thumbnail. |  |

### Return type

[**LiveStream**](LiveStream.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json

