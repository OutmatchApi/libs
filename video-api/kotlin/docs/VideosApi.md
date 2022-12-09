# VideosApi

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


<a name="dELETEVideo"></a>
# **dELETEVideo**
> dELETEVideo(videoId)

Delete a video

If you do not need a video any longer, you can send a request to delete it. All you need is the videoId. Tutorials using [video deletion](https://api.video/blog/endpoints/video-delete).

### Example
```kotlin
// Import classes:
//import video-api.infrastructure.*
//import com.outmatchapi.video-api.*

val apiInstance = VideosApi()
val videoId : kotlin.String = vi4k0jvEUuaTdRAEjQ4Jfrgz // kotlin.String | The video ID for the video you want to delete.
try {
    apiInstance.dELETEVideo(videoId)
} catch (e: ClientException) {
    println("4xx response calling VideosApi#dELETEVideo")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VideosApi#dELETEVideo")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **videoId** | **kotlin.String**| The video ID for the video you want to delete. |

### Return type

null (empty response body)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETVideo"></a>
# **gETVideo**
> Video gETVideo(videoId)

Show a video

This call provides the same JSON information provided on video creation. For private videos, it will generate a unique token url. Use this to retrieve any details you need about a video, or set up a private viewing URL. Tutorials using [video GET](https://api.video/blog/endpoints/video-get).

### Example
```kotlin
// Import classes:
//import video-api.infrastructure.*
//import com.outmatchapi.video-api.*

val apiInstance = VideosApi()
val videoId : kotlin.String = videoId_example // kotlin.String | The unique identifier for the video you want details about.
try {
    val result : Video = apiInstance.gETVideo(videoId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VideosApi#gETVideo")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VideosApi#gETVideo")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **videoId** | **kotlin.String**| The unique identifier for the video you want details about. |

### Return type

[**Video**](Video.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETVideoStatus"></a>
# **gETVideoStatus**
> Videostatus gETVideoStatus(videoId)

Show video status

This API provides upload status &amp; encoding status to determine when the video is uploaded or ready to playback. Once encoding is completed, the response also lists the available stream qualities. Tutorials using [video status](https://api.video/blog/endpoints/video-status).

### Example
```kotlin
// Import classes:
//import video-api.infrastructure.*
//import com.outmatchapi.video-api.*

val apiInstance = VideosApi()
val videoId : kotlin.String = vi4k0jvEUuaTdRAEjQ4Jfrgz // kotlin.String | The unique identifier for the video you want the status for.
try {
    val result : Videostatus = apiInstance.gETVideoStatus(videoId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VideosApi#gETVideoStatus")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VideosApi#gETVideoStatus")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **videoId** | **kotlin.String**| The unique identifier for the video you want the status for. |

### Return type

[**Videostatus**](Videostatus.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="lISTVideos"></a>
# **lISTVideos**
> VideosMinusListMinusResponse lISTVideos(title, tags, metadata, description, liveStreamId, sortBy, sortOrder, currentPage, pageSize)

List all videos

Requests to this endpoint return a list of your videos (with all their details). With no parameters added to this query, the API returns all videos. You can filter what videos the API returns using the parameters described below.  We have [several tutorials](https://api.video/blog/endpoints/video-list) that demonstrate this endpoint.

### Example
```kotlin
// Import classes:
//import video-api.infrastructure.*
//import com.outmatchapi.video-api.*

val apiInstance = VideosApi()
val title : kotlin.String = My Video.mp4 // kotlin.String | The title of a specific video you want to find. The search will match exactly to what term you provide and return any videos that contain the same term as part of their titles.
val tags : kotlin.collections.List<kotlin.String> = "tags": ["captions", "dialogue"] // kotlin.collections.List<kotlin.String> | A tag is a category you create and apply to videos. You can search for videos with particular tags by listing one or more here. Only videos that have all the tags you list will be returned.
val metadata : kotlin.collections.List<kotlin.String> = [{"key":"Author", "value":"John Doe"}, {"key":"Format", "value":"Tutorial"}] // kotlin.collections.List<kotlin.String> | Videos can be tagged with metadata tags in key:value pairs. You can search for videos with specific key value pairs using this parameter. [Dynamic Metadata](https://api.video/blog/endpoints/dynamic-metadata) allows you to define a key that allows any value pair.
val description : kotlin.String = New Zealand // kotlin.String | If you described a video with a term or sentence, you can add it here to return videos containing this string.
val liveStreamId : kotlin.String = li400mYKSgQ6xs7taUeSaEKr // kotlin.String | If you know the ID for a live stream, you can retrieve the stream by adding the ID for it here.
val sortBy : kotlin.String = publishedAt // kotlin.String | Allowed: publishedAt, title. You can search by the time videos were published at, or by title.
val sortOrder : kotlin.String = asc // kotlin.String | Allowed: asc, desc. asc is ascending and sorts from A to Z. desc is descending and sorts from Z to A.
val currentPage : kotlin.Int = 2 // kotlin.Int | Choose the number of search results to return per page. Minimum value: 1
val pageSize : kotlin.Int = 30 // kotlin.Int | Results per page. Allowed values 1-100, default is 25.
try {
    val result : VideosMinusListMinusResponse = apiInstance.lISTVideos(title, tags, metadata, description, liveStreamId, sortBy, sortOrder, currentPage, pageSize)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VideosApi#lISTVideos")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VideosApi#lISTVideos")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **title** | **kotlin.String**| The title of a specific video you want to find. The search will match exactly to what term you provide and return any videos that contain the same term as part of their titles. | [optional]
 **tags** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| A tag is a category you create and apply to videos. You can search for videos with particular tags by listing one or more here. Only videos that have all the tags you list will be returned. | [optional]
 **metadata** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| Videos can be tagged with metadata tags in key:value pairs. You can search for videos with specific key value pairs using this parameter. [Dynamic Metadata](https://api.video/blog/endpoints/dynamic-metadata) allows you to define a key that allows any value pair. | [optional]
 **description** | **kotlin.String**| If you described a video with a term or sentence, you can add it here to return videos containing this string. | [optional]
 **liveStreamId** | **kotlin.String**| If you know the ID for a live stream, you can retrieve the stream by adding the ID for it here. | [optional]
 **sortBy** | **kotlin.String**| Allowed: publishedAt, title. You can search by the time videos were published at, or by title. | [optional]
 **sortOrder** | **kotlin.String**| Allowed: asc, desc. asc is ascending and sorts from A to Z. desc is descending and sorts from Z to A. | [optional]
 **currentPage** | **kotlin.Int**| Choose the number of search results to return per page. Minimum value: 1 | [optional] [default to 1]
 **pageSize** | **kotlin.Int**| Results per page. Allowed values 1-100, default is 25. | [optional] [default to 25]

### Return type

[**VideosMinusListMinusResponse**](VideosMinusListMinusResponse.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="pATCHVideo"></a>
# **pATCHVideo**
> Video pATCHVideo(videoId, videoMinusUpdateMinusPayload)

Update a video

Use this endpoint to update the parameters associated with your video. The video you are updating is determined by the video ID you provide in the path. For each parameter you want to update, include the update in the request body. NOTE: If you are updating an array, you must provide the entire array as what you provide here overwrites what is in the system rather than appending to it. Tutorials using [video update](https://api.video/blog/endpoints/video-update).

### Example
```kotlin
// Import classes:
//import video-api.infrastructure.*
//import com.outmatchapi.video-api.*

val apiInstance = VideosApi()
val videoId : kotlin.String = vi4k0jvEUuaTdRAEjQ4Jfrgz // kotlin.String | The video ID for the video you want to delete.
val videoMinusUpdateMinusPayload : VideoMinusUpdateMinusPayload =  // VideoMinusUpdateMinusPayload | 
try {
    val result : Video = apiInstance.pATCHVideo(videoId, videoMinusUpdateMinusPayload)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VideosApi#pATCHVideo")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VideosApi#pATCHVideo")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **videoId** | **kotlin.String**| The video ID for the video you want to delete. |
 **videoMinusUpdateMinusPayload** | [**VideoMinusUpdateMinusPayload**](VideoMinusUpdateMinusPayload.md)|  | [optional]

### Return type

[**Video**](Video.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="pATCHVideosVideoIdThumbnail"></a>
# **pATCHVideosVideoIdThumbnail**
> Video pATCHVideosVideoIdThumbnail(videoId, videoMinusThumbnailMinusPickMinusPayload)

Pick a thumbnail

Pick a thumbnail from the given time code. If you&#39;d like to upload an image for your thumbnail, use the [Upload a Thumbnail](https://docs.api.video/reference#post_videos-videoid-thumbnail) endpoint. There may be a short delay for the thumbnail to update. Tutorials using [Thumbnail picking](https://api.video/blog/endpoints/video-pick-a-thumbnail).

### Example
```kotlin
// Import classes:
//import video-api.infrastructure.*
//import com.outmatchapi.video-api.*

val apiInstance = VideosApi()
val videoId : kotlin.String = vi4k0jvEUuaTdRAEjQ4Jfrgz // kotlin.String | Unique identifier of the video you want to add a thumbnail to, where you use a section of your video as the thumbnail.
val videoMinusThumbnailMinusPickMinusPayload : VideoMinusThumbnailMinusPickMinusPayload =  // VideoMinusThumbnailMinusPickMinusPayload | 
try {
    val result : Video = apiInstance.pATCHVideosVideoIdThumbnail(videoId, videoMinusThumbnailMinusPickMinusPayload)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VideosApi#pATCHVideosVideoIdThumbnail")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VideosApi#pATCHVideosVideoIdThumbnail")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **videoId** | **kotlin.String**| Unique identifier of the video you want to add a thumbnail to, where you use a section of your video as the thumbnail. |
 **videoMinusThumbnailMinusPickMinusPayload** | [**VideoMinusThumbnailMinusPickMinusPayload**](VideoMinusThumbnailMinusPickMinusPayload.md)|  | [optional]

### Return type

[**Video**](Video.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="pOSTVideo"></a>
# **pOSTVideo**
> Video pOSTVideo(videoMinusCreateMinusPayload)

Create a video

To create a video, you create its container&amp;parameters first, before adding the video file (exception - when using an existing HTTP source). * Videos are public by default. [Learn about Private videos](https://api.video/blog/tutorials/tutorial-private-videos) * Up to 6 responsive video streams will be created (from 240p to 4k) * Mp4 encoded versions are created at the highest quality (max 1080p) by default. * Panoramic videos are for videos recorded in 360 degrees.  You can toggle this after your 360 video upload. * Searchable parameters: title, description, tags and metadata   &#x60;&#x60;&#x60;shell $ curl https://ws.api.video/videos \\ -H &#39;Authorization: Bearer {access_token} \\ -d &#39;{\&quot;title\&quot;:\&quot;My video\&quot;,       \&quot;description\&quot;:\&quot;so many details\&quot;,      \&quot;mp4Support\&quot;:true }&#39; &#x60;&#x60;&#x60;    ## add an URL to upload on creation You can also create a video directly from a video hosted on a third-party server by giving its URI in &#x60;source&#x60; parameter: &#x60;&#x60;&#x60;shell $ curl https://ws.api.video/videos \\ -H &#39;Authorization: Bearer {access_token} \\ -d &#39;{\&quot;source\&quot;:\&quot;http://uri/to/video.mp4\&quot;, \&quot;title\&quot;:\&quot;My video\&quot;}&#39; &#x60;&#x60;&#x60;  In this case, the service will respond &#x60;202 Accepted&#x60; and ingest the video asynchronously. ## Track users with Dynamic Metadata Metadata values can be a key:value where the values are predefined, but Dynamic metadata allows you to enter *any* value for a defined key.  To defined a dynamic metadata pair use: &#x60;&#x60;&#x60; \&quot;metadata\&quot;:[{\&quot;dynamicKey\&quot;: \&quot;__dynamicKey__\&quot;}] &#x60;&#x60;&#x60;  The double underscore on both sides of the value allows any variable to be added for a given video session. Added the the url you might have: &#x60;&#x60;&#x60; &lt;iframe type&#x3D;\&quot;text/html\&quot; src&#x3D;\&quot;https://embed.api.video/vod/vi6QvU9dhYCzW3BpPvPsZUa8?metadata[classUserName]&#x3D;Doug\&quot; width&#x3D;\&quot;960\&quot; height&#x3D;\&quot;320\&quot; frameborder&#x3D;\&quot;0\&quot; scrollling&#x3D;\&quot;no\&quot;&gt;&lt;/iframe&gt; &#x60;&#x60;&#x60;   This video session will be tagged as watched by Doug - allowing for in-depth analysis on how each viewer interacts with the videos. ### We have tutorials on: * [Creating and uploading videos](https://api.video/blog/tutorials/video-upload-tutorial) * [Uploading large videos](https://api.video/blog/tutorials/video-upload-tutorial-large-videos)   * [Using tags with videos](https://api.video/blog/tutorials/video-tagging-best-practices) * [Private videos](https://api.video/blog/tutorials/tutorial-private-videos) * [Using Dynamic Metadata](https://api.video/blog/tutorials/dynamic-metadata)  * Full list of [tutorials](https://api.video/blog/endpoints/video-create) that demonstrate this endpoint. 

### Example
```kotlin
// Import classes:
//import video-api.infrastructure.*
//import com.outmatchapi.video-api.*

val apiInstance = VideosApi()
val videoMinusCreateMinusPayload : VideoMinusCreateMinusPayload =  // VideoMinusCreateMinusPayload | video to create
try {
    val result : Video = apiInstance.pOSTVideo(videoMinusCreateMinusPayload)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VideosApi#pOSTVideo")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VideosApi#pOSTVideo")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **videoMinusCreateMinusPayload** | [**VideoMinusCreateMinusPayload**](VideoMinusCreateMinusPayload.md)| video to create | [optional]

### Return type

[**Video**](Video.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="pOSTVideosVideoIdSource"></a>
# **pOSTVideosVideoIdSource**
> Video pOSTVideosVideoIdSource(videoId, file, contentRange)

Upload a video

To upload a video to the videoId you created. Replace {videoId} with the id you&#39;d like to use, {access_token} with your token, and /path/to/video.mp4 with the path to the video you&#39;d like to upload. You can only upload your video to the videoId once. &#x60;&#x60;&#x60;bash curl https://ws.api.video/videos/{videoId}/source \\   -H &#39;Authorization: Bearer {access_token}&#39; \\   -F file&#x3D;@/path/to/video.mp4    &#x60;&#x60;&#x60; Tutorials using [video upload](https://api.video/blog/endpoints/video-upload).

### Example
```kotlin
// Import classes:
//import video-api.infrastructure.*
//import com.outmatchapi.video-api.*

val apiInstance = VideosApi()
val videoId : kotlin.String = vi4k0jvEUuaTdRAEjQ4Jfrgz // kotlin.String | Enter the videoId you want to use to upload your video.
val file : java.io.File = BINARY_DATA_HERE // java.io.File | The path to the video you would like to upload. The path must be local. If you want to use a video from an online source, you must use the \\\"/videos\\\" endpoint and add the \\\"source\\\" parameter when you create a new video.
val contentRange : kotlin.String = Content-Range: bytes 200-100/5000 // kotlin.String | Content-Range represents the range of bytes that will be returned as a result of the request. Byte ranges are inclusive, meaning that bytes 0-999 represents the first 1000 bytes in a file or object.
try {
    val result : Video = apiInstance.pOSTVideosVideoIdSource(videoId, file, contentRange)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VideosApi#pOSTVideosVideoIdSource")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VideosApi#pOSTVideosVideoIdSource")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **videoId** | **kotlin.String**| Enter the videoId you want to use to upload your video. |
 **file** | **java.io.File**| The path to the video you would like to upload. The path must be local. If you want to use a video from an online source, you must use the \\\&quot;/videos\\\&quot; endpoint and add the \\\&quot;source\\\&quot; parameter when you create a new video. |
 **contentRange** | **kotlin.String**| Content-Range represents the range of bytes that will be returned as a result of the request. Byte ranges are inclusive, meaning that bytes 0-999 represents the first 1000 bytes in a file or object. | [optional]

### Return type

[**Video**](Video.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="pOSTVideosVideoIdThumbnail"></a>
# **pOSTVideosVideoIdThumbnail**
> Video pOSTVideosVideoIdThumbnail(videoId, file)

Upload a thumbnail

The thumbnail is the poster that appears in the player window before video playback begins. This endpoint allows you to upload an image for the thumbnail. To select a still frame from the video using a time stamp, use [Pick a Thumbnail](https://docs.api.video/reference#patch_videos-videoid-thumbnail) to pick a time in the video.  Note: There may be a short delay before the new thumbnail is delivered to our CDN. Tutorials using [Thumbnail upload](https://api.video/blog/endpoints/videos-upload-a-thumbnail).

### Example
```kotlin
// Import classes:
//import video-api.infrastructure.*
//import com.outmatchapi.video-api.*

val apiInstance = VideosApi()
val videoId : kotlin.String = videoId_example // kotlin.String | Unique identifier of the chosen video 
val file : java.io.File = BINARY_DATA_HERE // java.io.File | The image to be added as a thumbnail.
try {
    val result : Video = apiInstance.pOSTVideosVideoIdThumbnail(videoId, file)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VideosApi#pOSTVideosVideoIdThumbnail")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VideosApi#pOSTVideosVideoIdThumbnail")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **videoId** | **kotlin.String**| Unique identifier of the chosen video  |
 **file** | **java.io.File**| The image to be added as a thumbnail. |

### Return type

[**Video**](Video.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

