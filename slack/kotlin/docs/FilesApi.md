# FilesApi

All URIs are relative to *https://slack.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**filesCommentsDelete**](FilesApi.md#filesCommentsDelete) | **POST** /files.comments.delete | 
[**filesDelete**](FilesApi.md#filesDelete) | **POST** /files.delete | 
[**filesInfo**](FilesApi.md#filesInfo) | **GET** /files.info | 
[**filesList**](FilesApi.md#filesList) | **GET** /files.list | 
[**filesRemoteAdd**](FilesApi.md#filesRemoteAdd) | **POST** /files.remote.add | 
[**filesRemoteInfo**](FilesApi.md#filesRemoteInfo) | **GET** /files.remote.info | 
[**filesRemoteList**](FilesApi.md#filesRemoteList) | **GET** /files.remote.list | 
[**filesRemoteRemove**](FilesApi.md#filesRemoteRemove) | **POST** /files.remote.remove | 
[**filesRemoteShare**](FilesApi.md#filesRemoteShare) | **GET** /files.remote.share | 
[**filesRemoteUpdate**](FilesApi.md#filesRemoteUpdate) | **POST** /files.remote.update | 
[**filesRevokePublicURL**](FilesApi.md#filesRevokePublicURL) | **POST** /files.revokePublicURL | 
[**filesSharedPublicURL**](FilesApi.md#filesSharedPublicURL) | **POST** /files.sharedPublicURL | 
[**filesUpload**](FilesApi.md#filesUpload) | **POST** /files.upload | 


<a name="filesCommentsDelete"></a>
# **filesCommentsDelete**
> FilesCommentsDeleteSchema filesCommentsDelete(token, file, id)



Deletes an existing comment on a file.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = FilesApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `files:write:user`
val file : kotlin.String = file_example // kotlin.String | File to delete a comment from.
val id : kotlin.String = id_example // kotlin.String | The comment to delete.
try {
    val result : FilesCommentsDeleteSchema = apiInstance.filesCommentsDelete(token, file, id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FilesApi#filesCommentsDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FilesApi#filesCommentsDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;files:write:user&#x60; | [optional]
 **file** | **kotlin.String**| File to delete a comment from. | [optional]
 **id** | **kotlin.String**| The comment to delete. | [optional]

### Return type

[**FilesCommentsDeleteSchema**](FilesCommentsDeleteSchema.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="filesDelete"></a>
# **filesDelete**
> FilesDeleteSchema filesDelete(token, file)



Deletes a file.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = FilesApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `files:write:user`
val file : kotlin.String = file_example // kotlin.String | ID of file to delete.
try {
    val result : FilesDeleteSchema = apiInstance.filesDelete(token, file)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FilesApi#filesDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FilesApi#filesDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;files:write:user&#x60; | [optional]
 **file** | **kotlin.String**| ID of file to delete. | [optional]

### Return type

[**FilesDeleteSchema**](FilesDeleteSchema.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="filesInfo"></a>
# **filesInfo**
> FilesInfoSchema filesInfo(token, file, count, page, limit, cursor)



Gets information about a file.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = FilesApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `files:read`
val file : kotlin.String = file_example // kotlin.String | Specify a file by providing its ID.
val count : kotlin.String = count_example // kotlin.String | 
val page : kotlin.String = page_example // kotlin.String | 
val limit : kotlin.Int = 56 // kotlin.Int | The maximum number of items to return. Fewer than the requested number of items may be returned, even if the end of the list hasn't been reached.
val cursor : kotlin.String = cursor_example // kotlin.String | Parameter for pagination. File comments are paginated for a single file. Set `cursor` equal to the `next_cursor` attribute returned by the previous request's `response_metadata`. This parameter is optional, but pagination is mandatory: the default value simply fetches the first \"page\" of the collection of comments. See [pagination](/docs/pagination) for more details.
try {
    val result : FilesInfoSchema = apiInstance.filesInfo(token, file, count, page, limit, cursor)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FilesApi#filesInfo")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FilesApi#filesInfo")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;files:read&#x60; | [optional]
 **file** | **kotlin.String**| Specify a file by providing its ID. | [optional]
 **count** | **kotlin.String**|  | [optional]
 **page** | **kotlin.String**|  | [optional]
 **limit** | **kotlin.Int**| The maximum number of items to return. Fewer than the requested number of items may be returned, even if the end of the list hasn&#39;t been reached. | [optional]
 **cursor** | **kotlin.String**| Parameter for pagination. File comments are paginated for a single file. Set &#x60;cursor&#x60; equal to the &#x60;next_cursor&#x60; attribute returned by the previous request&#39;s &#x60;response_metadata&#x60;. This parameter is optional, but pagination is mandatory: the default value simply fetches the first \&quot;page\&quot; of the collection of comments. See [pagination](/docs/pagination) for more details. | [optional]

### Return type

[**FilesInfoSchema**](FilesInfoSchema.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="filesList"></a>
# **filesList**
> FilesListSchema filesList(token, user, channel, tsFrom, tsTo, types, count, page, showFilesHiddenByLimit)



List for a team, in a channel, or from a user with applied filters.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = FilesApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `files:read`
val user : kotlin.String = user_example // kotlin.String | Filter files created by a single user.
val channel : kotlin.String = channel_example // kotlin.String | Filter files appearing in a specific channel, indicated by its ID.
val tsFrom : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Filter files created after this timestamp (inclusive).
val tsTo : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Filter files created before this timestamp (inclusive).
val types : kotlin.String = types_example // kotlin.String | Filter files by type ([see below](#file_types)). You can pass multiple values in the types argument, like `types=spaces,snippets`.The default value is `all`, which does not filter the list.
val count : kotlin.String = count_example // kotlin.String | 
val page : kotlin.String = page_example // kotlin.String | 
val showFilesHiddenByLimit : kotlin.Boolean = true // kotlin.Boolean | Show truncated file info for files hidden due to being too old, and the team who owns the file being over the file limit.
try {
    val result : FilesListSchema = apiInstance.filesList(token, user, channel, tsFrom, tsTo, types, count, page, showFilesHiddenByLimit)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FilesApi#filesList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FilesApi#filesList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;files:read&#x60; | [optional]
 **user** | **kotlin.String**| Filter files created by a single user. | [optional]
 **channel** | **kotlin.String**| Filter files appearing in a specific channel, indicated by its ID. | [optional]
 **tsFrom** | **java.math.BigDecimal**| Filter files created after this timestamp (inclusive). | [optional]
 **tsTo** | **java.math.BigDecimal**| Filter files created before this timestamp (inclusive). | [optional]
 **types** | **kotlin.String**| Filter files by type ([see below](#file_types)). You can pass multiple values in the types argument, like &#x60;types&#x3D;spaces,snippets&#x60;.The default value is &#x60;all&#x60;, which does not filter the list. | [optional]
 **count** | **kotlin.String**|  | [optional]
 **page** | **kotlin.String**|  | [optional]
 **showFilesHiddenByLimit** | **kotlin.Boolean**| Show truncated file info for files hidden due to being too old, and the team who owns the file being over the file limit. | [optional]

### Return type

[**FilesListSchema**](FilesListSchema.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="filesRemoteAdd"></a>
# **filesRemoteAdd**
> DefaultSuccessTemplate filesRemoteAdd(externalId, externalUrl, filetype, indexableFileContents, previewImage, title, token)



Adds a file from a remote service

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = FilesApi()
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
    println("4xx response calling FilesApi#filesRemoteAdd")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FilesApi#filesRemoteAdd")
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

val apiInstance = FilesApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `remote_files:read`
val file : kotlin.String = file_example // kotlin.String | Specify a file by providing its ID.
val externalId : kotlin.String = externalId_example // kotlin.String | Creator defined GUID for the file.
try {
    val result : DefaultSuccessTemplate = apiInstance.filesRemoteInfo(token, file, externalId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FilesApi#filesRemoteInfo")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FilesApi#filesRemoteInfo")
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

val apiInstance = FilesApi()
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
    println("4xx response calling FilesApi#filesRemoteList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FilesApi#filesRemoteList")
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

val apiInstance = FilesApi()
val externalId : kotlin.String = externalId_example // kotlin.String | Creator defined GUID for the file.
val file : kotlin.String = file_example // kotlin.String | Specify a file by providing its ID.
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `remote_files:write`
try {
    val result : DefaultSuccessTemplate = apiInstance.filesRemoteRemove(externalId, file, token)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FilesApi#filesRemoteRemove")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FilesApi#filesRemoteRemove")
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

val apiInstance = FilesApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `remote_files:share`
val file : kotlin.String = file_example // kotlin.String | Specify a file registered with Slack by providing its ID. Either this field or `external_id` or both are required.
val externalId : kotlin.String = externalId_example // kotlin.String | The globally unique identifier (GUID) for the file, as set by the app registering the file with Slack.  Either this field or `file` or both are required.
val channels : kotlin.String = channels_example // kotlin.String | Comma-separated list of channel IDs where the file will be shared.
try {
    val result : DefaultSuccessTemplate = apiInstance.filesRemoteShare(token, file, externalId, channels)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FilesApi#filesRemoteShare")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FilesApi#filesRemoteShare")
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

val apiInstance = FilesApi()
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
    println("4xx response calling FilesApi#filesRemoteUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FilesApi#filesRemoteUpdate")
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

<a name="filesRevokePublicURL"></a>
# **filesRevokePublicURL**
> FilesRevokePublicURLSchema filesRevokePublicURL(token, file)



Revokes public/external sharing access for a file

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = FilesApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `files:write:user`
val file : kotlin.String = file_example // kotlin.String | File to revoke
try {
    val result : FilesRevokePublicURLSchema = apiInstance.filesRevokePublicURL(token, file)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FilesApi#filesRevokePublicURL")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FilesApi#filesRevokePublicURL")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;files:write:user&#x60; | [optional]
 **file** | **kotlin.String**| File to revoke | [optional]

### Return type

[**FilesRevokePublicURLSchema**](FilesRevokePublicURLSchema.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="filesSharedPublicURL"></a>
# **filesSharedPublicURL**
> FilesSharedPublicURLSchema filesSharedPublicURL(token, file)



Enables a file for public/external sharing.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = FilesApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `files:write:user`
val file : kotlin.String = file_example // kotlin.String | File to share
try {
    val result : FilesSharedPublicURLSchema = apiInstance.filesSharedPublicURL(token, file)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FilesApi#filesSharedPublicURL")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FilesApi#filesSharedPublicURL")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;files:write:user&#x60; | [optional]
 **file** | **kotlin.String**| File to share | [optional]

### Return type

[**FilesSharedPublicURLSchema**](FilesSharedPublicURLSchema.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="filesUpload"></a>
# **filesUpload**
> FilesUploadSchema filesUpload(channels, content, file, filename, filetype, initialComment, threadTs, title, token)



Uploads or creates a file.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = FilesApi()
val channels : kotlin.String = channels_example // kotlin.String | Comma-separated list of channel names or IDs where the file will be shared.
val content : kotlin.String = content_example // kotlin.String | File contents via a POST variable. If omitting this parameter, you must provide a `file`.
val file : kotlin.String = file_example // kotlin.String | File contents via `multipart/form-data`. If omitting this parameter, you must submit `content`.
val filename : kotlin.String = filename_example // kotlin.String | Filename of file.
val filetype : kotlin.String = filetype_example // kotlin.String | A [file type](/types/file#file_types) identifier.
val initialComment : kotlin.String = initialComment_example // kotlin.String | The message text introducing the file in specified `channels`.
val threadTs : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Provide another message's `ts` value to upload this file as a reply. Never use a reply's `ts` value; use its parent instead.
val title : kotlin.String = title_example // kotlin.String | Title of file.
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `files:write:user`
try {
    val result : FilesUploadSchema = apiInstance.filesUpload(channels, content, file, filename, filetype, initialComment, threadTs, title, token)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FilesApi#filesUpload")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FilesApi#filesUpload")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channels** | **kotlin.String**| Comma-separated list of channel names or IDs where the file will be shared. | [optional]
 **content** | **kotlin.String**| File contents via a POST variable. If omitting this parameter, you must provide a &#x60;file&#x60;. | [optional]
 **file** | **kotlin.String**| File contents via &#x60;multipart/form-data&#x60;. If omitting this parameter, you must submit &#x60;content&#x60;. | [optional]
 **filename** | **kotlin.String**| Filename of file. | [optional]
 **filetype** | **kotlin.String**| A [file type](/types/file#file_types) identifier. | [optional]
 **initialComment** | **kotlin.String**| The message text introducing the file in specified &#x60;channels&#x60;. | [optional]
 **threadTs** | **java.math.BigDecimal**| Provide another message&#39;s &#x60;ts&#x60; value to upload this file as a reply. Never use a reply&#39;s &#x60;ts&#x60; value; use its parent instead. | [optional]
 **title** | **kotlin.String**| Title of file. | [optional]
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;files:write:user&#x60; | [optional]

### Return type

[**FilesUploadSchema**](FilesUploadSchema.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

