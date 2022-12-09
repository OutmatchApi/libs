# ChaptersApi

All URIs are relative to *https://ws.api.video*

Method | HTTP request | Description
------------- | ------------- | -------------
[**dELETEVideosVideoIdChaptersLanguage**](ChaptersApi.md#dELETEVideosVideoIdChaptersLanguage) | **DELETE** /videos/{videoId}/chapters/{language} | Delete a chapter
[**gETVideosVideoIdChapters**](ChaptersApi.md#gETVideosVideoIdChapters) | **GET** /videos/{videoId}/chapters | List video chapters
[**gETVideosVideoIdChaptersLanguage**](ChaptersApi.md#gETVideosVideoIdChaptersLanguage) | **GET** /videos/{videoId}/chapters/{language} | Show a chapter
[**pOSTVideosVideoIdChaptersLanguage**](ChaptersApi.md#pOSTVideosVideoIdChaptersLanguage) | **POST** /videos/{videoId}/chapters/{language} | Upload a chapter


<a name="dELETEVideosVideoIdChaptersLanguage"></a>
# **dELETEVideosVideoIdChaptersLanguage**
> dELETEVideosVideoIdChaptersLanguage(videoId, language)

Delete a chapter

### Example
```kotlin
// Import classes:
//import apivideo.infrastructure.*
//import com.outmatchapi.apivideo.*

val apiInstance = ChaptersApi()
val videoId : kotlin.String = vi4k0jvEUuaTdRAEjQ4Jfrgz // kotlin.String | The unique identifier for the video you want to delete a chapter from. 
val language : kotlin.String = en // kotlin.String | A valid [BCP 47](https://github.com/libyal/libfwnt/wiki/Language-Code-identifiers) language representation.
try {
    apiInstance.dELETEVideosVideoIdChaptersLanguage(videoId, language)
} catch (e: ClientException) {
    println("4xx response calling ChaptersApi#dELETEVideosVideoIdChaptersLanguage")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ChaptersApi#dELETEVideosVideoIdChaptersLanguage")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **videoId** | **kotlin.String**| The unique identifier for the video you want to delete a chapter from.  |
 **language** | **kotlin.String**| A valid [BCP 47](https://github.com/libyal/libfwnt/wiki/Language-Code-identifiers) language representation. |

### Return type

null (empty response body)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETVideosVideoIdChapters"></a>
# **gETVideosVideoIdChapters**
> ChaptersMinusListMinusResponse gETVideosVideoIdChapters(videoId, currentPage, pageSize)

List video chapters

Retrieve a list of all chapters for a specified video.

### Example
```kotlin
// Import classes:
//import apivideo.infrastructure.*
//import com.outmatchapi.apivideo.*

val apiInstance = ChaptersApi()
val videoId : kotlin.String = vi4k0jvEUuaTdRAEjQ4Jfrgz // kotlin.String | The unique identifier for the video you want to retrieve a list of chapters for.
val currentPage : kotlin.Int = 2 // kotlin.Int | Choose the number of search results to return per page. Minimum value: 1
val pageSize : kotlin.Int = 30 // kotlin.Int | Results per page. Allowed values 1-100, default is 25.
try {
    val result : ChaptersMinusListMinusResponse = apiInstance.gETVideosVideoIdChapters(videoId, currentPage, pageSize)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ChaptersApi#gETVideosVideoIdChapters")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ChaptersApi#gETVideosVideoIdChapters")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **videoId** | **kotlin.String**| The unique identifier for the video you want to retrieve a list of chapters for. |
 **currentPage** | **kotlin.Int**| Choose the number of search results to return per page. Minimum value: 1 | [optional] [default to 1]
 **pageSize** | **kotlin.Int**| Results per page. Allowed values 1-100, default is 25. | [optional] [default to 25]

### Return type

[**ChaptersMinusListMinusResponse**](ChaptersMinusListMinusResponse.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETVideosVideoIdChaptersLanguage"></a>
# **gETVideosVideoIdChaptersLanguage**
> Chapter gETVideosVideoIdChaptersLanguage(videoId, language)

Show a chapter

Chapters help your viewers find the sections of the video they are most interested in viewing. Tutorials that use the [chapters endpoint](https://api.video/blog/endpoints/chapters).

### Example
```kotlin
// Import classes:
//import apivideo.infrastructure.*
//import com.outmatchapi.apivideo.*

val apiInstance = ChaptersApi()
val videoId : kotlin.String = vi4k0jvEUuaTdRAEjQ4Jfrgz // kotlin.String | The unique identifier for the video you want to show a chapter for.
val language : kotlin.String = en // kotlin.String | A valid [BCP 47](https://github.com/libyal/libfwnt/wiki/Language-Code-identifiers) language representation.
try {
    val result : Chapter = apiInstance.gETVideosVideoIdChaptersLanguage(videoId, language)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ChaptersApi#gETVideosVideoIdChaptersLanguage")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ChaptersApi#gETVideosVideoIdChaptersLanguage")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **videoId** | **kotlin.String**| The unique identifier for the video you want to show a chapter for. |
 **language** | **kotlin.String**| A valid [BCP 47](https://github.com/libyal/libfwnt/wiki/Language-Code-identifiers) language representation. |

### Return type

[**Chapter**](Chapter.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="pOSTVideosVideoIdChaptersLanguage"></a>
# **pOSTVideosVideoIdChaptersLanguage**
> Chapter pOSTVideosVideoIdChaptersLanguage(videoId, language, file)

Upload a chapter

Chapters help break the video into sections. Read our [tutorial](https://api.video/blog/tutorials/adding-chapters-to-your-videos) for more details.

### Example
```kotlin
// Import classes:
//import apivideo.infrastructure.*
//import com.outmatchapi.apivideo.*

val apiInstance = ChaptersApi()
val videoId : kotlin.String = vi4k0jvEUuaTdRAEjQ4Jfrgz // kotlin.String | The unique identifier for the video you want to upload a chapter for.
val language : kotlin.String = en // kotlin.String | A valid [BCP 47](https://github.com/libyal/libfwnt/wiki/Language-Code-identifiers) language representation.
val file : java.io.File = BINARY_DATA_HERE // java.io.File | The VTT file describing the chapters you want to upload.
try {
    val result : Chapter = apiInstance.pOSTVideosVideoIdChaptersLanguage(videoId, language, file)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ChaptersApi#pOSTVideosVideoIdChaptersLanguage")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ChaptersApi#pOSTVideosVideoIdChaptersLanguage")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **videoId** | **kotlin.String**| The unique identifier for the video you want to upload a chapter for. |
 **language** | **kotlin.String**| A valid [BCP 47](https://github.com/libyal/libfwnt/wiki/Language-Code-identifiers) language representation. |
 **file** | **java.io.File**| The VTT file describing the chapters you want to upload. |

### Return type

[**Chapter**](Chapter.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

