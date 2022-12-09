# .VideosApi

All URIs are relative to *https://ws.api.video*

Method | HTTP request | Description
------------- | ------------- | -------------
[**dELETEVideo**](VideosApi.md#dELETEVideo) | **DELETE** /videos/{videoId} | Delete a video
[**gETVideo**](VideosApi.md#gETVideo) | **GET** /videos/{videoId} | Show a video
[**gETVideoStatus**](VideosApi.md#gETVideoStatus) | **GET** /videos/{videoId}/status | Show video status
[**lISTVideos**](VideosApi.md#lISTVideos) | **GET** /videos | List all videos
[**pATCHVideo**](VideosApi.md#pATCHVideo) | **PATCH** /videos/{videoId} | Update a video
[**pATCHVideosVideoIdThumbnail**](VideosApi.md#pATCHVideosVideoIdThumbnail) | **PATCH** /videos/{videoId}/thumbnail | Pick a thumbnail
[**pOSTVideo**](VideosApi.md#pOSTVideo) | **POST** /videos | Create a video
[**pOSTVideosVideoIdSource**](VideosApi.md#pOSTVideosVideoIdSource) | **POST** /videos/{videoId}/source | Upload a video
[**pOSTVideosVideoIdThumbnail**](VideosApi.md#pOSTVideosVideoIdThumbnail) | **POST** /videos/{videoId}/thumbnail | Upload a thumbnail


# **dELETEVideo**
> void dELETEVideo()

If you do not need a video any longer, you can send a request to delete it. All you need is the videoId. Tutorials using [video deletion](https://api.video/blog/endpoints/video-delete).

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .VideosApi(configuration);

let body:.VideosApiDELETEVideoRequest = {
  // string | The video ID for the video you want to delete.
  videoId: "vi4k0jvEUuaTdRAEjQ4Jfrgz",
};

apiInstance.dELETEVideo(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **videoId** | [**string**] | The video ID for the video you want to delete. | defaults to undefined


### Return type

**void**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | No Content |  -  |
**404** | Not Found |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **gETVideo**
> Video gETVideo()

This call provides the same JSON information provided on video creation. For private videos, it will generate a unique token url. Use this to retrieve any details you need about a video, or set up a private viewing URL. Tutorials using [video GET](https://api.video/blog/endpoints/video-get).

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .VideosApi(configuration);

let body:.VideosApiGETVideoRequest = {
  // string | The unique identifier for the video you want details about.
  videoId: "videoId_example",
};

apiInstance.gETVideo(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **videoId** | [**string**] | The unique identifier for the video you want details about. | defaults to undefined


### Return type

**Video**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**404** | Not Found |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **gETVideoStatus**
> Videostatus gETVideoStatus()

This API provides upload status & encoding status to determine when the video is uploaded or ready to playback. Once encoding is completed, the response also lists the available stream qualities. Tutorials using [video status](https://api.video/blog/endpoints/video-status).

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .VideosApi(configuration);

let body:.VideosApiGETVideoStatusRequest = {
  // string | The unique identifier for the video you want the status for.
  videoId: "vi4k0jvEUuaTdRAEjQ4Jfrgz",
};

apiInstance.gETVideoStatus(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **videoId** | [**string**] | The unique identifier for the video you want the status for. | defaults to undefined


### Return type

**Videostatus**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**404** | Not Found |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **lISTVideos**
> VideosListResponse lISTVideos()

Requests to this endpoint return a list of your videos (with all their details). With no parameters added to this query, the API returns all videos. You can filter what videos the API returns using the parameters described below.  We have [several tutorials](https://api.video/blog/endpoints/video-list) that demonstrate this endpoint.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .VideosApi(configuration);

let body:.VideosApiLISTVideosRequest = {
  // string | The title of a specific video you want to find. The search will match exactly to what term you provide and return any videos that contain the same term as part of their titles. (optional)
  title: "My Video.mp4",
  // Array<string> | A tag is a category you create and apply to videos. You can search for videos with particular tags by listing one or more here. Only videos that have all the tags you list will be returned. (optional)
  tags: [
    ""tags": ["captions", "dialogue"]",
  ],
  // Array<string> | Videos can be tagged with metadata tags in key:value pairs. You can search for videos with specific key value pairs using this parameter. [Dynamic Metadata](https://api.video/blog/endpoints/dynamic-metadata) allows you to define a key that allows any value pair. (optional)
  metadata: [
    "[{"key":"Author", "value":"John Doe"}, {"key":"Format", "value":"Tutorial"}]",
  ],
  // string | If you described a video with a term or sentence, you can add it here to return videos containing this string. (optional)
  description: "New Zealand",
  // string | If you know the ID for a live stream, you can retrieve the stream by adding the ID for it here. (optional)
  liveStreamId: "li400mYKSgQ6xs7taUeSaEKr",
  // string | Allowed: publishedAt, title. You can search by the time videos were published at, or by title. (optional)
  sortBy: "publishedAt",
  // string | Allowed: asc, desc. asc is ascending and sorts from A to Z. desc is descending and sorts from Z to A. (optional)
  sortOrder: "asc",
  // number | Choose the number of search results to return per page. Minimum value: 1 (optional)
  currentPage: 2,
  // number | Results per page. Allowed values 1-100, default is 25. (optional)
  pageSize: 30,
};

apiInstance.lISTVideos(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **title** | [**string**] | The title of a specific video you want to find. The search will match exactly to what term you provide and return any videos that contain the same term as part of their titles. | (optional) defaults to undefined
 **tags** | **Array&lt;string&gt;** | A tag is a category you create and apply to videos. You can search for videos with particular tags by listing one or more here. Only videos that have all the tags you list will be returned. | (optional) defaults to undefined
 **metadata** | **Array&lt;string&gt;** | Videos can be tagged with metadata tags in key:value pairs. You can search for videos with specific key value pairs using this parameter. [Dynamic Metadata](https://api.video/blog/endpoints/dynamic-metadata) allows you to define a key that allows any value pair. | (optional) defaults to undefined
 **description** | [**string**] | If you described a video with a term or sentence, you can add it here to return videos containing this string. | (optional) defaults to undefined
 **liveStreamId** | [**string**] | If you know the ID for a live stream, you can retrieve the stream by adding the ID for it here. | (optional) defaults to undefined
 **sortBy** | [**string**] | Allowed: publishedAt, title. You can search by the time videos were published at, or by title. | (optional) defaults to undefined
 **sortOrder** | [**string**] | Allowed: asc, desc. asc is ascending and sorts from A to Z. desc is descending and sorts from Z to A. | (optional) defaults to undefined
 **currentPage** | [**number**] | Choose the number of search results to return per page. Minimum value: 1 | (optional) defaults to 1
 **pageSize** | [**number**] | Results per page. Allowed values 1-100, default is 25. | (optional) defaults to 25


### Return type

**VideosListResponse**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Bad Request |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **pATCHVideo**
> Video pATCHVideo()

Use this endpoint to update the parameters associated with your video. The video you are updating is determined by the video ID you provide in the path. For each parameter you want to update, include the update in the request body. NOTE: If you are updating an array, you must provide the entire array as what you provide here overwrites what is in the system rather than appending to it. Tutorials using [video update](https://api.video/blog/endpoints/video-update).

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .VideosApi(configuration);

let body:.VideosApiPATCHVideoRequest = {
  // string | The video ID for the video you want to delete.
  videoId: "vi4k0jvEUuaTdRAEjQ4Jfrgz",
  // VideoUpdatePayload (optional)
  videoUpdatePayload: {
    description: "A film about good books.",
    metadata: [
      {
        key: "Color",
        value: "Green",
      },
    ],
    mp4Support: true,
    panoramic: false,
    playerId: "pl4k0jvEUuaTdRAEjQ4Jfrgz",
    _public: true,
    tags: [
      "["maths", "string theory", "video"]",
    ],
    title: "title_example",
  },
};

apiInstance.pATCHVideo(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **videoUpdatePayload** | **VideoUpdatePayload**|  |
 **videoId** | [**string**] | The video ID for the video you want to delete. | defaults to undefined


### Return type

**Video**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Bad Request |  -  |
**404** | Not Found |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **pATCHVideosVideoIdThumbnail**
> Video pATCHVideosVideoIdThumbnail()

Pick a thumbnail from the given time code. If you'd like to upload an image for your thumbnail, use the [Upload a Thumbnail](https://docs.api.video/reference#post_videos-videoid-thumbnail) endpoint. There may be a short delay for the thumbnail to update. Tutorials using [Thumbnail picking](https://api.video/blog/endpoints/video-pick-a-thumbnail).

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .VideosApi(configuration);

let body:.VideosApiPATCHVideosVideoIdThumbnailRequest = {
  // string | Unique identifier of the video you want to add a thumbnail to, where you use a section of your video as the thumbnail.
  videoId: "vi4k0jvEUuaTdRAEjQ4Jfrgz",
  // VideoThumbnailPickPayload (optional)
  videoThumbnailPickPayload: {
    timecode: "00:00:00/0",
  },
};

apiInstance.pATCHVideosVideoIdThumbnail(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **videoThumbnailPickPayload** | **VideoThumbnailPickPayload**|  |
 **videoId** | [**string**] | Unique identifier of the video you want to add a thumbnail to, where you use a section of your video as the thumbnail. | defaults to undefined


### Return type

**Video**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**404** | Not Found |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **pOSTVideo**
> Video pOSTVideo()

To create a video, you create its container&parameters first, before adding the video file (exception - when using an existing HTTP source). * Videos are public by default. [Learn about Private videos](https://api.video/blog/tutorials/tutorial-private-videos) * Up to 6 responsive video streams will be created (from 240p to 4k) * Mp4 encoded versions are created at the highest quality (max 1080p) by default. * Panoramic videos are for videos recorded in 360 degrees.  You can toggle this after your 360 video upload. * Searchable parameters: title, description, tags and metadata   ```shell $ curl https://ws.api.video/videos \\ -H 'Authorization: Bearer {access_token} \\ -d '{\"title\":\"My video\",       \"description\":\"so many details\",      \"mp4Support\":true }' ```    ## add an URL to upload on creation You can also create a video directly from a video hosted on a third-party server by giving its URI in `source` parameter: ```shell $ curl https://ws.api.video/videos \\ -H 'Authorization: Bearer {access_token} \\ -d '{\"source\":\"http://uri/to/video.mp4\", \"title\":\"My video\"}' ```  In this case, the service will respond `202 Accepted` and ingest the video asynchronously. ## Track users with Dynamic Metadata Metadata values can be a key:value where the values are predefined, but Dynamic metadata allows you to enter *any* value for a defined key.  To defined a dynamic metadata pair use: ``` \"metadata\":[{\"dynamicKey\": \"__dynamicKey__\"}] ```  The double underscore on both sides of the value allows any variable to be added for a given video session. Added the the url you might have: ``` <iframe type=\"text/html\" src=\"https://embed.api.video/vod/vi6QvU9dhYCzW3BpPvPsZUa8?metadata[classUserName]=Doug\" width=\"960\" height=\"320\" frameborder=\"0\" scrollling=\"no\"></iframe> ```   This video session will be tagged as watched by Doug - allowing for in-depth analysis on how each viewer interacts with the videos. ### We have tutorials on: * [Creating and uploading videos](https://api.video/blog/tutorials/video-upload-tutorial) * [Uploading large videos](https://api.video/blog/tutorials/video-upload-tutorial-large-videos)   * [Using tags with videos](https://api.video/blog/tutorials/video-tagging-best-practices) * [Private videos](https://api.video/blog/tutorials/tutorial-private-videos) * [Using Dynamic Metadata](https://api.video/blog/tutorials/dynamic-metadata)  * Full list of [tutorials](https://api.video/blog/endpoints/video-create) that demonstrate this endpoint. 

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .VideosApi(configuration);

let body:.VideosApiPOSTVideoRequest = {
  // VideoCreatePayload | video to create (optional)
  videoCreatePayload: {
    description: "A video about string theory.",
    metadata: [
      {
        key: "Color",
        value: "Green",
      },
    ],
    mp4Support: true,
    panoramic: false,
    playerId: "pl45KFKdlddgk654dspkze",
    _public: true,
    publishedAt: new Date('2020-07-14T23:36:18.598Z'),
    source: "https://www.myvideo.url.com/video.mp4",
    tags: [
      "["maths", "string theory", "video"]",
    ],
    title: "Maths video",
  },
};

apiInstance.pOSTVideo(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **videoCreatePayload** | **VideoCreatePayload**| video to create |


### Return type

**Video**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Created |  -  |
**202** | Accepted |  -  |
**400** | Bad Request |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **pOSTVideosVideoIdSource**
> Video pOSTVideosVideoIdSource()

To upload a video to the videoId you created. Replace {videoId} with the id you'd like to use, {access_token} with your token, and /path/to/video.mp4 with the path to the video you'd like to upload. You can only upload your video to the videoId once. ```bash curl https://ws.api.video/videos/{videoId}/source \\   -H 'Authorization: Bearer {access_token}' \\   -F file=@/path/to/video.mp4    ``` Tutorials using [video upload](https://api.video/blog/endpoints/video-upload).

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .VideosApi(configuration);

let body:.VideosApiPOSTVideosVideoIdSourceRequest = {
  // string | Enter the videoId you want to use to upload your video.
  videoId: "vi4k0jvEUuaTdRAEjQ4Jfrgz",
  // HttpFile | The path to the video you would like to upload. The path must be local. If you want to use a video from an online source, you must use the \\\"/videos\\\" endpoint and add the \\\"source\\\" parameter when you create a new video.
  file: { data: Buffer.from(fs.readFileSync('[B@73b0ed03', 'utf-8')), name: '[B@73b0ed03' },
  // string | Content-Range represents the range of bytes that will be returned as a result of the request. Byte ranges are inclusive, meaning that bytes 0-999 represents the first 1000 bytes in a file or object. (optional)
  contentRange: "Content-Range: bytes 200-100/5000",
};

apiInstance.pOSTVideosVideoIdSource(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **videoId** | [**string**] | Enter the videoId you want to use to upload your video. | defaults to undefined
 **file** | [**HttpFile**] | The path to the video you would like to upload. The path must be local. If you want to use a video from an online source, you must use the \\\&quot;/videos\\\&quot; endpoint and add the \\\&quot;source\\\&quot; parameter when you create a new video. | defaults to undefined
 **contentRange** | [**string**] | Content-Range represents the range of bytes that will be returned as a result of the request. Byte ranges are inclusive, meaning that bytes 0-999 represents the first 1000 bytes in a file or object. | (optional) defaults to undefined


### Return type

**Video**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Created |  -  |
**400** | Bad Request |  -  |
**404** | Not Found |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **pOSTVideosVideoIdThumbnail**
> Video pOSTVideosVideoIdThumbnail()

The thumbnail is the poster that appears in the player window before video playback begins. This endpoint allows you to upload an image for the thumbnail. To select a still frame from the video using a time stamp, use [Pick a Thumbnail](https://docs.api.video/reference#patch_videos-videoid-thumbnail) to pick a time in the video.  Note: There may be a short delay before the new thumbnail is delivered to our CDN. Tutorials using [Thumbnail upload](https://api.video/blog/endpoints/videos-upload-a-thumbnail).

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .VideosApi(configuration);

let body:.VideosApiPOSTVideosVideoIdThumbnailRequest = {
  // string | Unique identifier of the chosen video 
  videoId: "videoId_example",
  // HttpFile | The image to be added as a thumbnail.
  file: { data: Buffer.from(fs.readFileSync('/path/to/file', 'utf-8')), name: '/path/to/file' },
};

apiInstance.pOSTVideosVideoIdThumbnail(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **videoId** | [**string**] | Unique identifier of the chosen video  | defaults to undefined
 **file** | [**HttpFile**] | The image to be added as a thumbnail. | defaults to undefined


### Return type

**Video**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Bad Request |  -  |
**404** | Not Found |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)


