# FilesRemoteApi

All URIs are relative to *https://slack.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**filesRemoteAdd**](FilesRemoteApi.md#filesRemoteAdd) | **POST** /files.remote.add | 
[**filesRemoteInfo**](FilesRemoteApi.md#filesRemoteInfo) | **GET** /files.remote.info | 
[**filesRemoteList**](FilesRemoteApi.md#filesRemoteList) | **GET** /files.remote.list | 
[**filesRemoteRemove**](FilesRemoteApi.md#filesRemoteRemove) | **POST** /files.remote.remove | 
[**filesRemoteShare**](FilesRemoteApi.md#filesRemoteShare) | **GET** /files.remote.share | 
[**filesRemoteUpdate**](FilesRemoteApi.md#filesRemoteUpdate) | **POST** /files.remote.update | 


<a name="filesRemoteAdd"></a>
# **filesRemoteAdd**
> DefaultSuccessTemplate filesRemoteAdd(externalId, externalUrl, filetype, indexableFileContents, previewImage, title, token)



Adds a file from a remote service

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = FilesRemoteApi()
val externalId : kotlin.String = externalId_example // kotlin.String | Creator defined GUID for the file.
val externalUrl : kotlin.String = externalUrl_example // kotlin.String | URL of the remote file.
val filetype : kotlin.String = filetype_example // kotlin.String | type of file
val indexableFileContents : kotlin.String = indexableFileContents_example // kotlin.String | A text file (txt, pdf, doc, etc.) containing textual search terms that are used to improve discovery of the remote file.
val previewImage : kotlin.String = previewImage_example // kotlin.String | Preview of the document via `multipart/form-data`.
val title : kotlin.String = title_example // kotlin.String | Title of the file being shared.
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `remote_files:write`
try {
    val result : DefaultSuccessTemplate = apiInstance.filesRemoteAdd(externalId, externalUrl, filetype, indexableFileContents, previewImage, title, token)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FilesRemoteApi#filesRemoteAdd")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FilesRemoteApi#filesRemoteAdd")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **externalId** | **kotlin.String**| Creator defined GUID for the file. | [optional]
 **externalUrl** | **kotlin.String**| URL of the remote file. | [optional]
 **filetype** | **kotlin.String**| type of file | [optional]
 **indexableFileContents** | **kotlin.String**| A text file (txt, pdf, doc, etc.) containing textual search terms that are used to improve discovery of the remote file. | [optional]
 **previewImage** | **kotlin.String**| Preview of the document via &#x60;multipart/form-data&#x60;. | [optional]
 **title** | **kotlin.String**| Title of the file being shared. | [optional]
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;remote_files:write&#x60; | [optional]

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="filesRemoteInfo"></a>
# **filesRemoteInfo**
> DefaultSuccessTemplate filesRemoteInfo(token, file, externalId)



Retrieve information about a remote file added to Slack

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = FilesRemoteApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `remote_files:read`
val file : kotlin.String = file_example // kotlin.String | Specify a file by providing its ID.
val externalId : kotlin.String = externalId_example // kotlin.String | Creator defined GUID for the file.
try {
    val result : DefaultSuccessTemplate = apiInstance.filesRemoteInfo(token, file, externalId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FilesRemoteApi#filesRemoteInfo")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FilesRemoteApi#filesRemoteInfo")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;remote_files:read&#x60; | [optional]
 **file** | **kotlin.String**| Specify a file by providing its ID. | [optional]
 **externalId** | **kotlin.String**| Creator defined GUID for the file. | [optional]

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="filesRemoteList"></a>
# **filesRemoteList**
> DefaultSuccessTemplate filesRemoteList(token, channel, tsFrom, tsTo, limit, cursor)



Retrieve information about a remote file added to Slack

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = FilesRemoteApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `remote_files:read`
val channel : kotlin.String = channel_example // kotlin.String | Filter files appearing in a specific channel, indicated by its ID.
val tsFrom : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Filter files created after this timestamp (inclusive).
val tsTo : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Filter files created before this timestamp (inclusive).
val limit : kotlin.Int = 56 // kotlin.Int | The maximum number of items to return.
val cursor : kotlin.String = cursor_example // kotlin.String | Paginate through collections of data by setting the `cursor` parameter to a `next_cursor` attribute returned by a previous request's `response_metadata`. Default value fetches the first \"page\" of the collection. See [pagination](/docs/pagination) for more detail.
try {
    val result : DefaultSuccessTemplate = apiInstance.filesRemoteList(token, channel, tsFrom, tsTo, limit, cursor)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FilesRemoteApi#filesRemoteList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FilesRemoteApi#filesRemoteList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;remote_files:read&#x60; | [optional]
 **channel** | **kotlin.String**| Filter files appearing in a specific channel, indicated by its ID. | [optional]
 **tsFrom** | **java.math.BigDecimal**| Filter files created after this timestamp (inclusive). | [optional]
 **tsTo** | **java.math.BigDecimal**| Filter files created before this timestamp (inclusive). | [optional]
 **limit** | **kotlin.Int**| The maximum number of items to return. | [optional]
 **cursor** | **kotlin.String**| Paginate through collections of data by setting the &#x60;cursor&#x60; parameter to a &#x60;next_cursor&#x60; attribute returned by a previous request&#39;s &#x60;response_metadata&#x60;. Default value fetches the first \&quot;page\&quot; of the collection. See [pagination](/docs/pagination) for more detail. | [optional]

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="filesRemoteRemove"></a>
# **filesRemoteRemove**
> DefaultSuccessTemplate filesRemoteRemove(externalId, file, token)



Remove a remote file.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = FilesRemoteApi()
val externalId : kotlin.String = externalId_example // kotlin.String | Creator defined GUID for the file.
val file : kotlin.String = file_example // kotlin.String | Specify a file by providing its ID.
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `remote_files:write`
try {
    val result : DefaultSuccessTemplate = apiInstance.filesRemoteRemove(externalId, file, token)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FilesRemoteApi#filesRemoteRemove")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FilesRemoteApi#filesRemoteRemove")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **externalId** | **kotlin.String**| Creator defined GUID for the file. | [optional]
 **file** | **kotlin.String**| Specify a file by providing its ID. | [optional]
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;remote_files:write&#x60; | [optional]

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="filesRemoteShare"></a>
# **filesRemoteShare**
> DefaultSuccessTemplate filesRemoteShare(token, file, externalId, channels)



Share a remote file into a channel.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = FilesRemoteApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `remote_files:share`
val file : kotlin.String = file_example // kotlin.String | Specify a file registered with Slack by providing its ID. Either this field or `external_id` or both are required.
val externalId : kotlin.String = externalId_example // kotlin.String | The globally unique identifier (GUID) for the file, as set by the app registering the file with Slack.  Either this field or `file` or both are required.
val channels : kotlin.String = channels_example // kotlin.String | Comma-separated list of channel IDs where the file will be shared.
try {
    val result : DefaultSuccessTemplate = apiInstance.filesRemoteShare(token, file, externalId, channels)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FilesRemoteApi#filesRemoteShare")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FilesRemoteApi#filesRemoteShare")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;remote_files:share&#x60; | [optional]
 **file** | **kotlin.String**| Specify a file registered with Slack by providing its ID. Either this field or &#x60;external_id&#x60; or both are required. | [optional]
 **externalId** | **kotlin.String**| The globally unique identifier (GUID) for the file, as set by the app registering the file with Slack.  Either this field or &#x60;file&#x60; or both are required. | [optional]
 **channels** | **kotlin.String**| Comma-separated list of channel IDs where the file will be shared. | [optional]

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="filesRemoteUpdate"></a>
# **filesRemoteUpdate**
> DefaultSuccessTemplate filesRemoteUpdate(externalId, externalUrl, file, filetype, indexableFileContents, previewImage, title, token)



Updates an existing remote file.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = FilesRemoteApi()
val externalId : kotlin.String = externalId_example // kotlin.String | Creator defined GUID for the file.
val externalUrl : kotlin.String = externalUrl_example // kotlin.String | URL of the remote file.
val file : kotlin.String = file_example // kotlin.String | Specify a file by providing its ID.
val filetype : kotlin.String = filetype_example // kotlin.String | type of file
val indexableFileContents : kotlin.String = indexableFileContents_example // kotlin.String | File containing contents that can be used to improve searchability for the remote file.
val previewImage : kotlin.String = previewImage_example // kotlin.String | Preview of the document via `multipart/form-data`.
val title : kotlin.String = title_example // kotlin.String | Title of the file being shared.
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `remote_files:write`
try {
    val result : DefaultSuccessTemplate = apiInstance.filesRemoteUpdate(externalId, externalUrl, file, filetype, indexableFileContents, previewImage, title, token)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FilesRemoteApi#filesRemoteUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FilesRemoteApi#filesRemoteUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **externalId** | **kotlin.String**| Creator defined GUID for the file. | [optional]
 **externalUrl** | **kotlin.String**| URL of the remote file. | [optional]
 **file** | **kotlin.String**| Specify a file by providing its ID. | [optional]
 **filetype** | **kotlin.String**| type of file | [optional]
 **indexableFileContents** | **kotlin.String**| File containing contents that can be used to improve searchability for the remote file. | [optional]
 **previewImage** | **kotlin.String**| Preview of the document via &#x60;multipart/form-data&#x60;. | [optional]
 **title** | **kotlin.String**| Title of the file being shared. | [optional]
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;remote_files:write&#x60; | [optional]

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

