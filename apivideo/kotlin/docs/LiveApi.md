# LiveApi

All URIs are relative to *https://ws.api.video*

Method | HTTP request | Description
------------- | ------------- | -------------
[**dELETELiveStreamsLiveStreamId**](LiveApi.md#dELETELiveStreamsLiveStreamId) | **DELETE** /live-streams/{liveStreamId} | Delete a live stream
[**dELETELiveStreamsLiveStreamIdThumbnail**](LiveApi.md#dELETELiveStreamsLiveStreamIdThumbnail) | **DELETE** /live-streams/{liveStreamId}/thumbnail | Delete a thumbnail
[**gETLiveStreams**](LiveApi.md#gETLiveStreams) | **GET** /live-streams | List all live streams
[**gETLiveStreamsLiveStreamId**](LiveApi.md#gETLiveStreamsLiveStreamId) | **GET** /live-streams/{liveStreamId} | Show live stream
[**pATCHLiveStreamsLiveStreamId**](LiveApi.md#pATCHLiveStreamsLiveStreamId) | **PATCH** /live-streams/{liveStreamId} | Update a live stream
[**pOSTLiveStreams**](LiveApi.md#pOSTLiveStreams) | **POST** /live-streams | Create live stream
[**pOSTLiveStreamsLiveStreamIdThumbnail**](LiveApi.md#pOSTLiveStreamsLiveStreamIdThumbnail) | **POST** /live-streams/{liveStreamId}/thumbnail | Upload a thumbnail


<a name="dELETELiveStreamsLiveStreamId"></a>
# **dELETELiveStreamsLiveStreamId**
> dELETELiveStreamsLiveStreamId(liveStreamId)

Delete a live stream

### Example
```kotlin
// Import classes:
//import apivideo.infrastructure.*
//import com.outmatchapi.apivideo.*

val apiInstance = LiveApi()
val liveStreamId : kotlin.String = li400mYKSgQ6xs7taUeSaEKr // kotlin.String | The unique ID for the live stream that you want to remove.
try {
    apiInstance.dELETELiveStreamsLiveStreamId(liveStreamId)
} catch (e: ClientException) {
    println("4xx response calling LiveApi#dELETELiveStreamsLiveStreamId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LiveApi#dELETELiveStreamsLiveStreamId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **liveStreamId** | **kotlin.String**| The unique ID for the live stream that you want to remove. |

### Return type

null (empty response body)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="dELETELiveStreamsLiveStreamIdThumbnail"></a>
# **dELETELiveStreamsLiveStreamIdThumbnail**
> LiveMinusStream dELETELiveStreamsLiveStreamIdThumbnail(liveStreamId)

Delete a thumbnail

Send the unique identifier for a live stream to delete it from the system.

### Example
```kotlin
// Import classes:
//import apivideo.infrastructure.*
//import com.outmatchapi.apivideo.*

val apiInstance = LiveApi()
val liveStreamId : kotlin.String = li400mYKSgQ6xs7taUeSaEKr // kotlin.String | The unique identifier for the live stream you want to delete. 
try {
    val result : LiveMinusStream = apiInstance.dELETELiveStreamsLiveStreamIdThumbnail(liveStreamId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LiveApi#dELETELiveStreamsLiveStreamIdThumbnail")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LiveApi#dELETELiveStreamsLiveStreamIdThumbnail")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **liveStreamId** | **kotlin.String**| The unique identifier for the live stream you want to delete.  |

### Return type

[**LiveMinusStream**](LiveMinusStream.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETLiveStreams"></a>
# **gETLiveStreams**
> LiveMinusStreamMinusListMinusResponse gETLiveStreams(streamKey, name, sortBy, sortOrder, currentPage, pageSize)

List all live streams

With no parameters added to the url, this will return all livestreams. Query by name or key to limit the list.

### Example
```kotlin
// Import classes:
//import apivideo.infrastructure.*
//import com.outmatchapi.apivideo.*

val apiInstance = LiveApi()
val streamKey : kotlin.String = 30087931-229e-42cf-b5f9-e91bcc1f7332 // kotlin.String | The unique stream key that allows you to stream videos.
val name : kotlin.String = My Video // kotlin.String | You can filter live streams by their name or a part of their name.
val sortBy : kotlin.String = createdAt // kotlin.String | Allowed: createdAt, publishedAt, name. createdAt - the time a livestream was created using the specified streamKey. publishedAt - the time a livestream was published using the specified streamKey. name - the name of the livestream. If you choose one of the time based options, the time is presented in ISO-8601 format.
val sortOrder : kotlin.String = desc // kotlin.String | Allowed: asc, desc. Ascending for date and time means that earlier values precede later ones. Descending means that later values preced earlier ones. For title, it is 0-9 and A-Z ascending and Z-A, 9-0 descending.
val currentPage : kotlin.Int = 2 // kotlin.Int | Choose the number of search results to return per page. Minimum value: 1
val pageSize : kotlin.Int = 30 // kotlin.Int | Results per page. Allowed values 1-100, default is 25.
try {
    val result : LiveMinusStreamMinusListMinusResponse = apiInstance.gETLiveStreams(streamKey, name, sortBy, sortOrder, currentPage, pageSize)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LiveApi#gETLiveStreams")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LiveApi#gETLiveStreams")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **streamKey** | **kotlin.String**| The unique stream key that allows you to stream videos. | [optional]
 **name** | **kotlin.String**| You can filter live streams by their name or a part of their name. | [optional]
 **sortBy** | **kotlin.String**| Allowed: createdAt, publishedAt, name. createdAt - the time a livestream was created using the specified streamKey. publishedAt - the time a livestream was published using the specified streamKey. name - the name of the livestream. If you choose one of the time based options, the time is presented in ISO-8601 format. | [optional]
 **sortOrder** | **kotlin.String**| Allowed: asc, desc. Ascending for date and time means that earlier values precede later ones. Descending means that later values preced earlier ones. For title, it is 0-9 and A-Z ascending and Z-A, 9-0 descending. | [optional] [enum: asc, desc]
 **currentPage** | **kotlin.Int**| Choose the number of search results to return per page. Minimum value: 1 | [optional] [default to 1]
 **pageSize** | **kotlin.Int**| Results per page. Allowed values 1-100, default is 25. | [optional] [default to 25]

### Return type

[**LiveMinusStreamMinusListMinusResponse**](LiveMinusStreamMinusListMinusResponse.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETLiveStreamsLiveStreamId"></a>
# **gETLiveStreamsLiveStreamId**
> LiveMinusStream gETLiveStreamsLiveStreamId(liveStreamId)

Show live stream

Supply a LivestreamId, and you&#39;ll get all the details for streaming into, and watching the livestream. Tutorials that use the [show livestream endpoint](https://api.video/blog/endpoints/live-stream-status).

### Example
```kotlin
// Import classes:
//import apivideo.infrastructure.*
//import com.outmatchapi.apivideo.*

val apiInstance = LiveApi()
val liveStreamId : kotlin.String = li400mYKSgQ6xs7taUeSaEKr // kotlin.String | The unique ID for the live stream you want to watch.
try {
    val result : LiveMinusStream = apiInstance.gETLiveStreamsLiveStreamId(liveStreamId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LiveApi#gETLiveStreamsLiveStreamId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LiveApi#gETLiveStreamsLiveStreamId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **liveStreamId** | **kotlin.String**| The unique ID for the live stream you want to watch. |

### Return type

[**LiveMinusStream**](LiveMinusStream.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="pATCHLiveStreamsLiveStreamId"></a>
# **pATCHLiveStreamsLiveStreamId**
> LiveMinusStream pATCHLiveStreamsLiveStreamId(liveStreamId, liveMinusStreamMinusUpdateMinusPayload)

Update a live stream

Use this endpoint to update the player, or to turn recording on/off (saving a copy of the livestream). NOTE: If the livestream is actively streaming, changing the recording status will only affect the NEXT stream.    The public&#x3D;false &#39;private livestream&#39; is available as a BETA feature, and should be limited to livestreams of 3,000 viewers or fewer.

### Example
```kotlin
// Import classes:
//import apivideo.infrastructure.*
//import com.outmatchapi.apivideo.*

val apiInstance = LiveApi()
val liveStreamId : kotlin.String = li400mYKSgQ6xs7taUeSaEKr // kotlin.String | The unique ID for the live stream that you want to update information for such as player details, or whether you want the recording on or off.
val liveMinusStreamMinusUpdateMinusPayload : LiveMinusStreamMinusUpdateMinusPayload =  // LiveMinusStreamMinusUpdateMinusPayload | 
try {
    val result : LiveMinusStream = apiInstance.pATCHLiveStreamsLiveStreamId(liveStreamId, liveMinusStreamMinusUpdateMinusPayload)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LiveApi#pATCHLiveStreamsLiveStreamId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LiveApi#pATCHLiveStreamsLiveStreamId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **liveStreamId** | **kotlin.String**| The unique ID for the live stream that you want to update information for such as player details, or whether you want the recording on or off. |
 **liveMinusStreamMinusUpdateMinusPayload** | [**LiveMinusStreamMinusUpdateMinusPayload**](LiveMinusStreamMinusUpdateMinusPayload.md)|  | [optional]

### Return type

[**LiveMinusStream**](LiveMinusStream.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="pOSTLiveStreams"></a>
# **pOSTLiveStreams**
> LiveMinusStream pOSTLiveStreams(liveMinusStreamMinusCreateMinusPayload)

Create live stream

A live stream will give you the &#39;connection point&#39; to RTMP your video stream to api.video. It will also give you the details for viewers to watch the same livestream.  The public&#x3D;false &#39;private livestream&#39; is available as a BETA feature, and should be limited to livestreams of 3,000 viewers or fewer. See our [Live Stream Tutorial](https://api.video/blog/tutorials/live-stream-tutorial) for a walkthrough of this API with OBS. Your RTMP endpoint for the livestream is rtmp://broadcast.api.video/s/{streamKey} Tutorials that [create live streams](https://api.video/blog/endpoints/live-create).

### Example
```kotlin
// Import classes:
//import apivideo.infrastructure.*
//import com.outmatchapi.apivideo.*

val apiInstance = LiveApi()
val liveMinusStreamMinusCreateMinusPayload : LiveMinusStreamMinusCreateMinusPayload =  // LiveMinusStreamMinusCreateMinusPayload | 
try {
    val result : LiveMinusStream = apiInstance.pOSTLiveStreams(liveMinusStreamMinusCreateMinusPayload)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LiveApi#pOSTLiveStreams")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LiveApi#pOSTLiveStreams")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **liveMinusStreamMinusCreateMinusPayload** | [**LiveMinusStreamMinusCreateMinusPayload**](LiveMinusStreamMinusCreateMinusPayload.md)|  | [optional]

### Return type

[**LiveMinusStream**](LiveMinusStream.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="pOSTLiveStreamsLiveStreamIdThumbnail"></a>
# **pOSTLiveStreamsLiveStreamIdThumbnail**
> LiveMinusStream pOSTLiveStreamsLiveStreamIdThumbnail(liveStreamId, file)

Upload a thumbnail

Upload an image to use as a backdrop for your livestream. Tutorials that [update live stream thumbnails](https://api.video/blog/endpoints/live-upload-a-thumbnail).

### Example
```kotlin
// Import classes:
//import apivideo.infrastructure.*
//import com.outmatchapi.apivideo.*

val apiInstance = LiveApi()
val liveStreamId : kotlin.String = vi4k0jvEUuaTdRAEjQ4Jfrgz // kotlin.String | The unique ID for the live stream you want to upload.
val file : java.io.File = BINARY_DATA_HERE // java.io.File | The image to be added as a thumbnail.
try {
    val result : LiveMinusStream = apiInstance.pOSTLiveStreamsLiveStreamIdThumbnail(liveStreamId, file)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LiveApi#pOSTLiveStreamsLiveStreamIdThumbnail")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LiveApi#pOSTLiveStreamsLiveStreamIdThumbnail")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **liveStreamId** | **kotlin.String**| The unique ID for the live stream you want to upload. |
 **file** | **java.io.File**| The image to be added as a thumbnail. |

### Return type

[**LiveMinusStream**](LiveMinusStream.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

