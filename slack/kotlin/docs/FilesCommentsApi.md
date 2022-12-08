# FilesCommentsApi

All URIs are relative to *https://slack.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**filesCommentsDelete**](FilesCommentsApi.md#filesCommentsDelete) | **POST** /files.comments.delete | 


<a name="filesCommentsDelete"></a>
# **filesCommentsDelete**
> FilesCommentsDeleteSchema filesCommentsDelete(token, file, id)



Deletes an existing comment on a file.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = FilesCommentsApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `files:write:user`
val file : kotlin.String = file_example // kotlin.String | File to delete a comment from.
val id : kotlin.String = id_example // kotlin.String | The comment to delete.
try {
    val result : FilesCommentsDeleteSchema = apiInstance.filesCommentsDelete(token, file, id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FilesCommentsApi#filesCommentsDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FilesCommentsApi#filesCommentsDelete")
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

