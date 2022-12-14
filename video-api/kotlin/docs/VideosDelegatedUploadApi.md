# VideosDelegatedUploadApi

All URIs are relative to *https://ws.api.video*

Method | HTTP request | Description
------------- | ------------- | -------------
[**dELETEUploadTokensUploadToken**](VideosDelegatedUploadApi.md#dELETEUploadTokensUploadToken) | **DELETE** /upload-tokens/{uploadToken} | Delete an upload token
[**gETUploadTokens**](VideosDelegatedUploadApi.md#gETUploadTokens) | **GET** /upload-tokens | List all active upload tokens.
[**gETUploadTokensUploadToken**](VideosDelegatedUploadApi.md#gETUploadTokensUploadToken) | **GET** /upload-tokens/{uploadToken} | Show upload token
[**pOSTUpload**](VideosDelegatedUploadApi.md#pOSTUpload) | **POST** /upload | Upload with an upload token
[**pOSTUploadTokens**](VideosDelegatedUploadApi.md#pOSTUploadTokens) | **POST** /upload-tokens | Generate an upload token


<a name="dELETEUploadTokensUploadToken"></a>
# **dELETEUploadTokensUploadToken**
> dELETEUploadTokensUploadToken(uploadToken)

Delete an upload token

Delete an existing upload token. This is especially useful for tokens you may have created that do not expire.

### Example
```kotlin
// Import classes:
//import video-api.infrastructure.*
//import com.outmatchapi.video-api.*

val apiInstance = VideosDelegatedUploadApi()
val uploadToken : kotlin.String = to1tcmSFHeYY5KzyhOqVKMKb // kotlin.String | The unique identifier for the upload token you want to delete. Deleting a token will make it so the token can no longer be used for authentication.
try {
    apiInstance.dELETEUploadTokensUploadToken(uploadToken)
} catch (e: ClientException) {
    println("4xx response calling VideosDelegatedUploadApi#dELETEUploadTokensUploadToken")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VideosDelegatedUploadApi#dELETEUploadTokensUploadToken")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uploadToken** | **kotlin.String**| The unique identifier for the upload token you want to delete. Deleting a token will make it so the token can no longer be used for authentication. |

### Return type

null (empty response body)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETUploadTokens"></a>
# **gETUploadTokens**
> TokenMinusListMinusResponse gETUploadTokens(sortBy, sortOrder, currentPage, pageSize)

List all active upload tokens.

A delegated token is used to allow secure uploads without exposing your API key. Use this endpoint to retrieve a list of all currently active delegated tokens. Tutorials using [delegated upload](https://api.video/blog/endpoints/delegated-upload).

### Example
```kotlin
// Import classes:
//import video-api.infrastructure.*
//import com.outmatchapi.video-api.*

val apiInstance = VideosDelegatedUploadApi()
val sortBy : kotlin.String = ttl // kotlin.String | Allowed: createdAt, ttl. You can use these to sort by when a token was created, or how much longer the token will be active (ttl - time to live). Date and time is presented in ISO-8601 format.
val sortOrder : kotlin.String = asc // kotlin.String | Allowed: asc, desc. Ascending is 0-9 or A-Z. Descending is 9-0 or Z-A.
val currentPage : kotlin.Int = 2 // kotlin.Int | Choose the number of search results to return per page. Minimum value: 1
val pageSize : kotlin.Int = 30 // kotlin.Int | Results per page. Allowed values 1-100, default is 25.
try {
    val result : TokenMinusListMinusResponse = apiInstance.gETUploadTokens(sortBy, sortOrder, currentPage, pageSize)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VideosDelegatedUploadApi#gETUploadTokens")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VideosDelegatedUploadApi#gETUploadTokens")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sortBy** | **kotlin.String**| Allowed: createdAt, ttl. You can use these to sort by when a token was created, or how much longer the token will be active (ttl - time to live). Date and time is presented in ISO-8601 format. | [optional] [enum: createdAt, ttl]
 **sortOrder** | **kotlin.String**| Allowed: asc, desc. Ascending is 0-9 or A-Z. Descending is 9-0 or Z-A. | [optional] [enum: asc, desc]
 **currentPage** | **kotlin.Int**| Choose the number of search results to return per page. Minimum value: 1 | [optional] [default to 1]
 **pageSize** | **kotlin.Int**| Results per page. Allowed values 1-100, default is 25. | [optional] [default to 25]

### Return type

[**TokenMinusListMinusResponse**](TokenMinusListMinusResponse.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETUploadTokensUploadToken"></a>
# **gETUploadTokensUploadToken**
> UploadMinusToken gETUploadTokensUploadToken(uploadToken)

Show upload token

You can retrieve details about a specific upload token if you have the unique identifier for the upload token. Add it in the path of the endpoint. Details include time-to-live (ttl), when the token was created, and when it will expire.

### Example
```kotlin
// Import classes:
//import video-api.infrastructure.*
//import com.outmatchapi.video-api.*

val apiInstance = VideosDelegatedUploadApi()
val uploadToken : kotlin.String = to1tcmSFHeYY5KzyhOqVKMKb // kotlin.String | The unique identifier for the token you want information about.
try {
    val result : UploadMinusToken = apiInstance.gETUploadTokensUploadToken(uploadToken)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VideosDelegatedUploadApi#gETUploadTokensUploadToken")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VideosDelegatedUploadApi#gETUploadTokensUploadToken")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uploadToken** | **kotlin.String**| The unique identifier for the token you want information about. |

### Return type

[**UploadMinusToken**](UploadMinusToken.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="pOSTUpload"></a>
# **pOSTUpload**
> Video pOSTUpload(token, file, contentRange, videoId)

Upload with an upload token

When given a token, anyone can upload a file to the URI &#x60;https://ws.api.video/upload?token&#x3D;&lt;tokenId&gt;&#x60;.  Example with cURL:  &#x60;&#x60;&#x60;curl $ curl  --request POST --url &#39;https://ws.api.video/upload?token&#x3D;toXXX&#39;  --header &#39;content-type: multipart/form-data&#39;  -F file&#x3D;@video.mp4 &#x60;&#x60;&#x60;  Or in an HTML form, with a little JavaScript to convert the form into JSON: &#x60;&#x60;&#x60;html &lt;!--form for user interaction--&gt; &lt;form name&#x3D;\&quot;videoUploadForm\&quot; &gt;   &lt;label for&#x3D;video&gt;Video:&lt;/label&gt;   &lt;input type&#x3D;file name&#x3D;source/&gt;&lt;br/&gt;   &lt;input value&#x3D;\&quot;Submit\&quot; type&#x3D;\&quot;submit\&quot;&gt; &lt;/form&gt; &lt;div&gt;&lt;/div&gt; &lt;!--JS takes the form data      uses FormData to turn the response into JSON.     then uses POST to upload the video file.     Update the token parameter in the url to your upload token.     --&gt; &lt;script&gt;    var form &#x3D; document.forms.namedItem(\&quot;videoUploadForm\&quot;);     form.addEventListener(&#39;submit&#39;, function(ev) {   ev.preventDefault();      var oOutput &#x3D; document.querySelector(\&quot;div\&quot;),          oData &#x3D; new FormData(form);      var oReq &#x3D; new XMLHttpRequest();         oReq.open(\&quot;POST\&quot;, \&quot;https://ws.api.video/upload?token&#x3D;toXXX\&quot;, true);      oReq.send(oData);   oReq.onload &#x3D; function(oEvent) {        if (oReq.status &#x3D;&#x3D;201) {          oOutput.innerHTML &#x3D; \&quot;Your video is uploaded!&lt;br/&gt;\&quot;  + oReq.response;        } else {          oOutput.innerHTML &#x3D; \&quot;Error \&quot; + oReq.status + \&quot; occurred when trying to upload your file.&lt;br /&gt;\&quot;;        }      };    }, false);  &lt;/script&gt; &#x60;&#x60;&#x60;   ### Dealing with large files  We have created a &lt;a href&#x3D;&#39;https://api.video/blog/tutorials/uploading-large-files-with-javascript&#39;&gt;tutorial&lt;/a&gt; to walk through the steps required.

### Example
```kotlin
// Import classes:
//import video-api.infrastructure.*
//import com.outmatchapi.video-api.*

val apiInstance = VideosDelegatedUploadApi()
val token : kotlin.String = to1tcmSFHeYY5KzyhOqVKMKb // kotlin.String | The unique identifier for the token you want to use to upload a video.
val file : java.io.File = BINARY_DATA_HERE // java.io.File | The path to the video you want to upload.
val contentRange : kotlin.String = Content-Range: bytes 200-100/5000 // kotlin.String | Content-Range represents the range of bytes that will be returned as a result of the request. Byte ranges are inclusive, meaning that bytes 0-999 represents the first 1000 bytes in a file or object.
val videoId : kotlin.String = videoId_example // kotlin.String | The video id returned by the first call to this endpoint in a large video upload scenario.
try {
    val result : Video = apiInstance.pOSTUpload(token, file, contentRange, videoId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VideosDelegatedUploadApi#pOSTUpload")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VideosDelegatedUploadApi#pOSTUpload")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| The unique identifier for the token you want to use to upload a video. |
 **file** | **java.io.File**| The path to the video you want to upload. |
 **contentRange** | **kotlin.String**| Content-Range represents the range of bytes that will be returned as a result of the request. Byte ranges are inclusive, meaning that bytes 0-999 represents the first 1000 bytes in a file or object. | [optional]
 **videoId** | **kotlin.String**| The video id returned by the first call to this endpoint in a large video upload scenario. | [optional]

### Return type

[**Video**](Video.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="pOSTUploadTokens"></a>
# **pOSTUploadTokens**
> UploadMinusToken pOSTUploadTokens(tokenMinusCreateMinusPayload)

Generate an upload token

Use this endpoint to generate an upload token. You can use this token to authenticate video uploads while keeping your API key safe. Tutorials using [delegated upload](https://api.video/blog/endpoints/delegated-upload).

### Example
```kotlin
// Import classes:
//import video-api.infrastructure.*
//import com.outmatchapi.video-api.*

val apiInstance = VideosDelegatedUploadApi()
val tokenMinusCreateMinusPayload : TokenMinusCreateMinusPayload =  // TokenMinusCreateMinusPayload | 
try {
    val result : UploadMinusToken = apiInstance.pOSTUploadTokens(tokenMinusCreateMinusPayload)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VideosDelegatedUploadApi#pOSTUploadTokens")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VideosDelegatedUploadApi#pOSTUploadTokens")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tokenMinusCreateMinusPayload** | [**TokenMinusCreateMinusPayload**](TokenMinusCreateMinusPayload.md)|  | [optional]

### Return type

[**UploadMinusToken**](UploadMinusToken.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

