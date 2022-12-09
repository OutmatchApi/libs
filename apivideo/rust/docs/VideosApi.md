# \VideosApi

All URIs are relative to *https://ws.api.video*

Method | HTTP request | Description
------------- | ------------- | -------------
[**d_elete_video**](VideosApi.md#d_elete_video) | **DELETE** /videos/{videoId} | Delete a video
[**g_et_video**](VideosApi.md#g_et_video) | **GET** /videos/{videoId} | Show a video
[**g_et_video_status**](VideosApi.md#g_et_video_status) | **GET** /videos/{videoId}/status | Show video status
[**l_ist_videos**](VideosApi.md#l_ist_videos) | **GET** /videos | List all videos
[**p_atch_video**](VideosApi.md#p_atch_video) | **PATCH** /videos/{videoId} | Update a video
[**p_atch_videos_video_id_thumbnail**](VideosApi.md#p_atch_videos_video_id_thumbnail) | **PATCH** /videos/{videoId}/thumbnail | Pick a thumbnail
[**p_ost_video**](VideosApi.md#p_ost_video) | **POST** /videos | Create a video
[**p_ost_videos_video_id_source**](VideosApi.md#p_ost_videos_video_id_source) | **POST** /videos/{videoId}/source | Upload a video
[**p_ost_videos_video_id_thumbnail**](VideosApi.md#p_ost_videos_video_id_thumbnail) | **POST** /videos/{videoId}/thumbnail | Upload a thumbnail



## d_elete_video

> d_elete_video(video_id)
Delete a video

If you do not need a video any longer, you can send a request to delete it. All you need is the videoId. Tutorials using [video deletion](https://api.video/blog/endpoints/video-delete).

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**video_id** | **String** | The video ID for the video you want to delete. | [required] |

### Return type

 (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## g_et_video

> crate::models::Video g_et_video(video_id)
Show a video

This call provides the same JSON information provided on video creation. For private videos, it will generate a unique token url. Use this to retrieve any details you need about a video, or set up a private viewing URL. Tutorials using [video GET](https://api.video/blog/endpoints/video-get).

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**video_id** | **String** | The unique identifier for the video you want details about. | [required] |

### Return type

[**crate::models::Video**](video.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## g_et_video_status

> crate::models::Videostatus g_et_video_status(video_id)
Show video status

This API provides upload status & encoding status to determine when the video is uploaded or ready to playback. Once encoding is completed, the response also lists the available stream qualities. Tutorials using [video status](https://api.video/blog/endpoints/video-status).

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**video_id** | **String** | The unique identifier for the video you want the status for. | [required] |

### Return type

[**crate::models::Videostatus**](videostatus.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## l_ist_videos

> crate::models::VideosListResponse l_ist_videos(title, tags, metadata, description, live_stream_id, sort_by, sort_order, current_page, page_size)
List all videos

Requests to this endpoint return a list of your videos (with all their details). With no parameters added to this query, the API returns all videos. You can filter what videos the API returns using the parameters described below.  We have [several tutorials](https://api.video/blog/endpoints/video-list) that demonstrate this endpoint.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**title** | Option<**String**> | The title of a specific video you want to find. The search will match exactly to what term you provide and return any videos that contain the same term as part of their titles. |  |
**tags** | Option<[**Vec<String>**](String.md)> | A tag is a category you create and apply to videos. You can search for videos with particular tags by listing one or more here. Only videos that have all the tags you list will be returned. |  |
**metadata** | Option<[**Vec<String>**](String.md)> | Videos can be tagged with metadata tags in key:value pairs. You can search for videos with specific key value pairs using this parameter. [Dynamic Metadata](https://api.video/blog/endpoints/dynamic-metadata) allows you to define a key that allows any value pair. |  |
**description** | Option<**String**> | If you described a video with a term or sentence, you can add it here to return videos containing this string. |  |
**live_stream_id** | Option<**String**> | If you know the ID for a live stream, you can retrieve the stream by adding the ID for it here. |  |
**sort_by** | Option<**String**> | Allowed: publishedAt, title. You can search by the time videos were published at, or by title. |  |
**sort_order** | Option<**String**> | Allowed: asc, desc. asc is ascending and sorts from A to Z. desc is descending and sorts from Z to A. |  |
**current_page** | Option<**i32**> | Choose the number of search results to return per page. Minimum value: 1 |  |[default to 1]
**page_size** | Option<**i32**> | Results per page. Allowed values 1-100, default is 25. |  |[default to 25]

### Return type

[**crate::models::VideosListResponse**](videos-list-response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## p_atch_video

> crate::models::Video p_atch_video(video_id, video_update_payload)
Update a video

Use this endpoint to update the parameters associated with your video. The video you are updating is determined by the video ID you provide in the path. For each parameter you want to update, include the update in the request body. NOTE: If you are updating an array, you must provide the entire array as what you provide here overwrites what is in the system rather than appending to it. Tutorials using [video update](https://api.video/blog/endpoints/video-update).

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**video_id** | **String** | The video ID for the video you want to delete. | [required] |
**video_update_payload** | Option<[**VideoUpdatePayload**](VideoUpdatePayload.md)> |  |  |

### Return type

[**crate::models::Video**](video.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## p_atch_videos_video_id_thumbnail

> crate::models::Video p_atch_videos_video_id_thumbnail(video_id, video_thumbnail_pick_payload)
Pick a thumbnail

Pick a thumbnail from the given time code. If you'd like to upload an image for your thumbnail, use the [Upload a Thumbnail](https://docs.api.video/reference#post_videos-videoid-thumbnail) endpoint. There may be a short delay for the thumbnail to update. Tutorials using [Thumbnail picking](https://api.video/blog/endpoints/video-pick-a-thumbnail).

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**video_id** | **String** | Unique identifier of the video you want to add a thumbnail to, where you use a section of your video as the thumbnail. | [required] |
**video_thumbnail_pick_payload** | Option<[**VideoThumbnailPickPayload**](VideoThumbnailPickPayload.md)> |  |  |

### Return type

[**crate::models::Video**](video.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## p_ost_video

> crate::models::Video p_ost_video(video_create_payload)
Create a video

To create a video, you create its container&parameters first, before adding the video file (exception - when using an existing HTTP source). * Videos are public by default. [Learn about Private videos](https://api.video/blog/tutorials/tutorial-private-videos) * Up to 6 responsive video streams will be created (from 240p to 4k) * Mp4 encoded versions are created at the highest quality (max 1080p) by default. * Panoramic videos are for videos recorded in 360 degrees.  You can toggle this after your 360 video upload. * Searchable parameters: title, description, tags and metadata   ```shell $ curl https://ws.api.video/videos \\ -H 'Authorization: Bearer {access_token} \\ -d '{\"title\":\"My video\",       \"description\":\"so many details\",      \"mp4Support\":true }' ```    ## add an URL to upload on creation You can also create a video directly from a video hosted on a third-party server by giving its URI in `source` parameter: ```shell $ curl https://ws.api.video/videos \\ -H 'Authorization: Bearer {access_token} \\ -d '{\"source\":\"http://uri/to/video.mp4\", \"title\":\"My video\"}' ```  In this case, the service will respond `202 Accepted` and ingest the video asynchronously. ## Track users with Dynamic Metadata Metadata values can be a key:value where the values are predefined, but Dynamic metadata allows you to enter *any* value for a defined key.  To defined a dynamic metadata pair use: ``` \"metadata\":[{\"dynamicKey\": \"__dynamicKey__\"}] ```  The double underscore on both sides of the value allows any variable to be added for a given video session. Added the the url you might have: ``` <iframe type=\"text/html\" src=\"https://embed.api.video/vod/vi6QvU9dhYCzW3BpPvPsZUa8?metadata[classUserName]=Doug\" width=\"960\" height=\"320\" frameborder=\"0\" scrollling=\"no\"></iframe> ```   This video session will be tagged as watched by Doug - allowing for in-depth analysis on how each viewer interacts with the videos. ### We have tutorials on: * [Creating and uploading videos](https://api.video/blog/tutorials/video-upload-tutorial) * [Uploading large videos](https://api.video/blog/tutorials/video-upload-tutorial-large-videos)   * [Using tags with videos](https://api.video/blog/tutorials/video-tagging-best-practices) * [Private videos](https://api.video/blog/tutorials/tutorial-private-videos) * [Using Dynamic Metadata](https://api.video/blog/tutorials/dynamic-metadata)  * Full list of [tutorials](https://api.video/blog/endpoints/video-create) that demonstrate this endpoint. 

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**video_create_payload** | Option<[**VideoCreatePayload**](VideoCreatePayload.md)> | video to create |  |

### Return type

[**crate::models::Video**](video.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## p_ost_videos_video_id_source

> crate::models::Video p_ost_videos_video_id_source(video_id, file, content_range)
Upload a video

To upload a video to the videoId you created. Replace {videoId} with the id you'd like to use, {access_token} with your token, and /path/to/video.mp4 with the path to the video you'd like to upload. You can only upload your video to the videoId once. ```bash curl https://ws.api.video/videos/{videoId}/source \\   -H 'Authorization: Bearer {access_token}' \\   -F file=@/path/to/video.mp4    ``` Tutorials using [video upload](https://api.video/blog/endpoints/video-upload).

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**video_id** | **String** | Enter the videoId you want to use to upload your video. | [required] |
**file** | **std::path::PathBuf** | The path to the video you would like to upload. The path must be local. If you want to use a video from an online source, you must use the \\\"/videos\\\" endpoint and add the \\\"source\\\" parameter when you create a new video. | [required] |
**content_range** | Option<**String**> | Content-Range represents the range of bytes that will be returned as a result of the request. Byte ranges are inclusive, meaning that bytes 0-999 represents the first 1000 bytes in a file or object. |  |

### Return type

[**crate::models::Video**](video.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## p_ost_videos_video_id_thumbnail

> crate::models::Video p_ost_videos_video_id_thumbnail(video_id, file)
Upload a thumbnail

The thumbnail is the poster that appears in the player window before video playback begins. This endpoint allows you to upload an image for the thumbnail. To select a still frame from the video using a time stamp, use [Pick a Thumbnail](https://docs.api.video/reference#patch_videos-videoid-thumbnail) to pick a time in the video.  Note: There may be a short delay before the new thumbnail is delivered to our CDN. Tutorials using [Thumbnail upload](https://api.video/blog/endpoints/videos-upload-a-thumbnail).

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**video_id** | **String** | Unique identifier of the chosen video  | [required] |
**file** | **std::path::PathBuf** | The image to be added as a thumbnail. | [required] |

### Return type

[**crate::models::Video**](video.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

