# CaptionsApi

All URIs are relative to *https://ws.api.video*

Method | HTTP request | Description
------------- | ------------- | -------------
[**dELETEVideosVideoIdCaptionsLanguage**](CaptionsApi.md#dELETEVideosVideoIdCaptionsLanguage) | **DELETE** /videos/{videoId}/captions/{language} | Delete a caption
[**gETVideosVideoIdCaptions**](CaptionsApi.md#gETVideosVideoIdCaptions) | **GET** /videos/{videoId}/captions | List video captions
[**gETVideosVideoIdCaptionsLanguage**](CaptionsApi.md#gETVideosVideoIdCaptionsLanguage) | **GET** /videos/{videoId}/captions/{language} | Show a caption
[**pATCHVideosVideoIdCaptionsLanguage**](CaptionsApi.md#pATCHVideosVideoIdCaptionsLanguage) | **PATCH** /videos/{videoId}/captions/{language} | Update caption
[**pOSTVideosVideoIdCaptionsLanguage**](CaptionsApi.md#pOSTVideosVideoIdCaptionsLanguage) | **POST** /videos/{videoId}/captions/{language} | Upload a caption


<a name="dELETEVideosVideoIdCaptionsLanguage"></a>
# **dELETEVideosVideoIdCaptionsLanguage**
> dELETEVideosVideoIdCaptionsLanguage(videoId, language)

Delete a caption

Delete a caption in a specific language by providing the video ID for the video you want to delete the caption from and the language the caption is in.

### Example
```kotlin
// Import classes:
//import video-api.infrastructure.*
//import com.outmatchapi.video-api.*

val apiInstance = CaptionsApi()
val videoId : kotlin.String = vi4k0jvEUuaTdRAEjQ4Prklgc // kotlin.String | The unique identifier for the video you want to delete a caption from.
val language : kotlin.String = en // kotlin.String | A valid [BCP 47](https://github.com/libyal/libfwnt/wiki/Language-Code-identifiers) language representation.
try {
    apiInstance.dELETEVideosVideoIdCaptionsLanguage(videoId, language)
} catch (e: ClientException) {
    println("4xx response calling CaptionsApi#dELETEVideosVideoIdCaptionsLanguage")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CaptionsApi#dELETEVideosVideoIdCaptionsLanguage")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **videoId** | **kotlin.String**| The unique identifier for the video you want to delete a caption from. |
 **language** | **kotlin.String**| A valid [BCP 47](https://github.com/libyal/libfwnt/wiki/Language-Code-identifiers) language representation. |

### Return type

null (empty response body)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETVideosVideoIdCaptions"></a>
# **gETVideosVideoIdCaptions**
> CaptionsMinusListMinusResponse gETVideosVideoIdCaptions(videoId, currentPage, pageSize)

List video captions

Retrieve a list of available captions for the videoId you provide.

### Example
```kotlin
// Import classes:
//import video-api.infrastructure.*
//import com.outmatchapi.video-api.*

val apiInstance = CaptionsApi()
val videoId : kotlin.String = vi4k0jvEUuaTdRAEjQ4Prklg // kotlin.String | The unique identifier for the video you want to retrieve a list of captions for.
val currentPage : kotlin.Int = 2 // kotlin.Int | Choose the number of search results to return per page. Minimum value: 1
val pageSize : kotlin.Int = 30 // kotlin.Int | Results per page. Allowed values 1-100, default is 25.
try {
    val result : CaptionsMinusListMinusResponse = apiInstance.gETVideosVideoIdCaptions(videoId, currentPage, pageSize)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CaptionsApi#gETVideosVideoIdCaptions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CaptionsApi#gETVideosVideoIdCaptions")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **videoId** | **kotlin.String**| The unique identifier for the video you want to retrieve a list of captions for. |
 **currentPage** | **kotlin.Int**| Choose the number of search results to return per page. Minimum value: 1 | [optional] [default to 1]
 **pageSize** | **kotlin.Int**| Results per page. Allowed values 1-100, default is 25. | [optional] [default to 25]

### Return type

[**CaptionsMinusListMinusResponse**](CaptionsMinusListMinusResponse.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETVideosVideoIdCaptionsLanguage"></a>
# **gETVideosVideoIdCaptionsLanguage**
> Subtitle gETVideosVideoIdCaptionsLanguage(videoId, language)

Show a caption

Display a caption for a video in a specific language. If the language is available, the caption is returned. Otherwise, you will get a response indicating the caption was not found. Tutorials that use the [captions endpoint](https://api.video/blog/endpoints/captions).

### Example
```kotlin
// Import classes:
//import video-api.infrastructure.*
//import com.outmatchapi.video-api.*

val apiInstance = CaptionsApi()
val videoId : kotlin.String = vi4k0jvEUuaTdRAEjQ4Prklg // kotlin.String | The unique identifier for the video you want captions for.
val language : kotlin.String = en // kotlin.String | A valid [BCP 47](https://github.com/libyal/libfwnt/wiki/Language-Code-identifiers) language representation
try {
    val result : Subtitle = apiInstance.gETVideosVideoIdCaptionsLanguage(videoId, language)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CaptionsApi#gETVideosVideoIdCaptionsLanguage")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CaptionsApi#gETVideosVideoIdCaptionsLanguage")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **videoId** | **kotlin.String**| The unique identifier for the video you want captions for. |
 **language** | **kotlin.String**| A valid [BCP 47](https://github.com/libyal/libfwnt/wiki/Language-Code-identifiers) language representation |

### Return type

[**Subtitle**](Subtitle.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="pATCHVideosVideoIdCaptionsLanguage"></a>
# **pATCHVideosVideoIdCaptionsLanguage**
> Subtitle pATCHVideosVideoIdCaptionsLanguage(videoId, language, captionsMinusUpdateMinusPayload)

Update caption

To have the captions on automatically, use this PATCH to set default: true.

### Example
```kotlin
// Import classes:
//import video-api.infrastructure.*
//import com.outmatchapi.video-api.*

val apiInstance = CaptionsApi()
val videoId : kotlin.String = vi4k0jvEUuaTdRAEjQ4Prklg // kotlin.String | The unique identifier for the video you want to have automatic captions for. 
val language : kotlin.String = en // kotlin.String | A valid [BCP 47](https://github.com/libyal/libfwnt/wiki/Language-Code-identifiers) language representation.
val captionsMinusUpdateMinusPayload : CaptionsMinusUpdateMinusPayload =  // CaptionsMinusUpdateMinusPayload | 
try {
    val result : Subtitle = apiInstance.pATCHVideosVideoIdCaptionsLanguage(videoId, language, captionsMinusUpdateMinusPayload)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CaptionsApi#pATCHVideosVideoIdCaptionsLanguage")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CaptionsApi#pATCHVideosVideoIdCaptionsLanguage")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **videoId** | **kotlin.String**| The unique identifier for the video you want to have automatic captions for.  |
 **language** | **kotlin.String**| A valid [BCP 47](https://github.com/libyal/libfwnt/wiki/Language-Code-identifiers) language representation. |
 **captionsMinusUpdateMinusPayload** | [**CaptionsMinusUpdateMinusPayload**](CaptionsMinusUpdateMinusPayload.md)|  | [optional]

### Return type

[**Subtitle**](Subtitle.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="pOSTVideosVideoIdCaptionsLanguage"></a>
# **pOSTVideosVideoIdCaptionsLanguage**
> Subtitle pOSTVideosVideoIdCaptionsLanguage(videoId, language, file)

Upload a caption

Upload a VTT file to add captions to your video.  Read our [captioning tutorial](https://api.video/blog/tutorials/adding-captions) for more details.

### Example
```kotlin
// Import classes:
//import video-api.infrastructure.*
//import com.outmatchapi.video-api.*

val apiInstance = CaptionsApi()
val videoId : kotlin.String = vi4k0jvEUuaTdRAEjQ4Prklg // kotlin.String | The unique identifier for the video you want to add a caption to.
val language : kotlin.String = en // kotlin.String | A valid BCP 47 language representation.
val file : java.io.File = BINARY_DATA_HERE // java.io.File | The video text track (VTT) you want to upload.
try {
    val result : Subtitle = apiInstance.pOSTVideosVideoIdCaptionsLanguage(videoId, language, file)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CaptionsApi#pOSTVideosVideoIdCaptionsLanguage")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CaptionsApi#pOSTVideosVideoIdCaptionsLanguage")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **videoId** | **kotlin.String**| The unique identifier for the video you want to add a caption to. |
 **language** | **kotlin.String**| A valid BCP 47 language representation. |
 **file** | **java.io.File**| The video text track (VTT) you want to upload. |

### Return type

[**Subtitle**](Subtitle.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

