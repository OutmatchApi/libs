# \FilesRemoteApi

All URIs are relative to *https://slack.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**FilesRemoteAdd**](FilesRemoteApi.md#FilesRemoteAdd) | **Post** /files.remote.add | 
[**FilesRemoteInfo**](FilesRemoteApi.md#FilesRemoteInfo) | **Get** /files.remote.info | 
[**FilesRemoteList**](FilesRemoteApi.md#FilesRemoteList) | **Get** /files.remote.list | 
[**FilesRemoteRemove**](FilesRemoteApi.md#FilesRemoteRemove) | **Post** /files.remote.remove | 
[**FilesRemoteShare**](FilesRemoteApi.md#FilesRemoteShare) | **Get** /files.remote.share | 
[**FilesRemoteUpdate**](FilesRemoteApi.md#FilesRemoteUpdate) | **Post** /files.remote.update | 



## FilesRemoteAdd

> DefaultSuccessTemplate FilesRemoteAdd(ctx).ExternalId(externalId).ExternalUrl(externalUrl).Filetype(filetype).IndexableFileContents(indexableFileContents).PreviewImage(previewImage).Title(title).Token(token).Execute()





### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    openapiclient "./openapi"
)

func main() {
    externalId := "externalId_example" // string | Creator defined GUID for the file. (optional)
    externalUrl := "externalUrl_example" // string | URL of the remote file. (optional)
    filetype := "filetype_example" // string | type of file (optional)
    indexableFileContents := "indexableFileContents_example" // string | A text file (txt, pdf, doc, etc.) containing textual search terms that are used to improve discovery of the remote file. (optional)
    previewImage := "previewImage_example" // string | Preview of the document via `multipart/form-data`. (optional)
    title := "title_example" // string | Title of the file being shared. (optional)
    token := "token_example" // string | Authentication token. Requires scope: `remote_files:write` (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.FilesRemoteApi.FilesRemoteAdd(context.Background()).ExternalId(externalId).ExternalUrl(externalUrl).Filetype(filetype).IndexableFileContents(indexableFileContents).PreviewImage(previewImage).Title(title).Token(token).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `FilesRemoteApi.FilesRemoteAdd``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `FilesRemoteAdd`: DefaultSuccessTemplate
    fmt.Fprintf(os.Stdout, "Response from `FilesRemoteApi.FilesRemoteAdd`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiFilesRemoteAddRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **externalId** | **string** | Creator defined GUID for the file. | 
 **externalUrl** | **string** | URL of the remote file. | 
 **filetype** | **string** | type of file | 
 **indexableFileContents** | **string** | A text file (txt, pdf, doc, etc.) containing textual search terms that are used to improve discovery of the remote file. | 
 **previewImage** | **string** | Preview of the document via &#x60;multipart/form-data&#x60;. | 
 **title** | **string** | Title of the file being shared. | 
 **token** | **string** | Authentication token. Requires scope: &#x60;remote_files:write&#x60; | 

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## FilesRemoteInfo

> DefaultSuccessTemplate FilesRemoteInfo(ctx).Token(token).File(file).ExternalId(externalId).Execute()





### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    openapiclient "./openapi"
)

func main() {
    token := "token_example" // string | Authentication token. Requires scope: `remote_files:read` (optional)
    file := "file_example" // string | Specify a file by providing its ID. (optional)
    externalId := "externalId_example" // string | Creator defined GUID for the file. (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.FilesRemoteApi.FilesRemoteInfo(context.Background()).Token(token).File(file).ExternalId(externalId).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `FilesRemoteApi.FilesRemoteInfo``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `FilesRemoteInfo`: DefaultSuccessTemplate
    fmt.Fprintf(os.Stdout, "Response from `FilesRemoteApi.FilesRemoteInfo`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiFilesRemoteInfoRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;remote_files:read&#x60; | 
 **file** | **string** | Specify a file by providing its ID. | 
 **externalId** | **string** | Creator defined GUID for the file. | 

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## FilesRemoteList

> DefaultSuccessTemplate FilesRemoteList(ctx).Token(token).Channel(channel).TsFrom(tsFrom).TsTo(tsTo).Limit(limit).Cursor(cursor).Execute()





### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    openapiclient "./openapi"
)

func main() {
    token := "token_example" // string | Authentication token. Requires scope: `remote_files:read` (optional)
    channel := "channel_example" // string | Filter files appearing in a specific channel, indicated by its ID. (optional)
    tsFrom := float32(8.14) // float32 | Filter files created after this timestamp (inclusive). (optional)
    tsTo := float32(8.14) // float32 | Filter files created before this timestamp (inclusive). (optional)
    limit := int32(56) // int32 | The maximum number of items to return. (optional)
    cursor := "cursor_example" // string | Paginate through collections of data by setting the `cursor` parameter to a `next_cursor` attribute returned by a previous request's `response_metadata`. Default value fetches the first \"page\" of the collection. See [pagination](/docs/pagination) for more detail. (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.FilesRemoteApi.FilesRemoteList(context.Background()).Token(token).Channel(channel).TsFrom(tsFrom).TsTo(tsTo).Limit(limit).Cursor(cursor).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `FilesRemoteApi.FilesRemoteList``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `FilesRemoteList`: DefaultSuccessTemplate
    fmt.Fprintf(os.Stdout, "Response from `FilesRemoteApi.FilesRemoteList`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiFilesRemoteListRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;remote_files:read&#x60; | 
 **channel** | **string** | Filter files appearing in a specific channel, indicated by its ID. | 
 **tsFrom** | **float32** | Filter files created after this timestamp (inclusive). | 
 **tsTo** | **float32** | Filter files created before this timestamp (inclusive). | 
 **limit** | **int32** | The maximum number of items to return. | 
 **cursor** | **string** | Paginate through collections of data by setting the &#x60;cursor&#x60; parameter to a &#x60;next_cursor&#x60; attribute returned by a previous request&#39;s &#x60;response_metadata&#x60;. Default value fetches the first \&quot;page\&quot; of the collection. See [pagination](/docs/pagination) for more detail. | 

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## FilesRemoteRemove

> DefaultSuccessTemplate FilesRemoteRemove(ctx).ExternalId(externalId).File(file).Token(token).Execute()





### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    openapiclient "./openapi"
)

func main() {
    externalId := "externalId_example" // string | Creator defined GUID for the file. (optional)
    file := "file_example" // string | Specify a file by providing its ID. (optional)
    token := "token_example" // string | Authentication token. Requires scope: `remote_files:write` (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.FilesRemoteApi.FilesRemoteRemove(context.Background()).ExternalId(externalId).File(file).Token(token).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `FilesRemoteApi.FilesRemoteRemove``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `FilesRemoteRemove`: DefaultSuccessTemplate
    fmt.Fprintf(os.Stdout, "Response from `FilesRemoteApi.FilesRemoteRemove`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiFilesRemoteRemoveRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **externalId** | **string** | Creator defined GUID for the file. | 
 **file** | **string** | Specify a file by providing its ID. | 
 **token** | **string** | Authentication token. Requires scope: &#x60;remote_files:write&#x60; | 

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## FilesRemoteShare

> DefaultSuccessTemplate FilesRemoteShare(ctx).Token(token).File(file).ExternalId(externalId).Channels(channels).Execute()





### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    openapiclient "./openapi"
)

func main() {
    token := "token_example" // string | Authentication token. Requires scope: `remote_files:share` (optional)
    file := "file_example" // string | Specify a file registered with Slack by providing its ID. Either this field or `external_id` or both are required. (optional)
    externalId := "externalId_example" // string | The globally unique identifier (GUID) for the file, as set by the app registering the file with Slack.  Either this field or `file` or both are required. (optional)
    channels := "channels_example" // string | Comma-separated list of channel IDs where the file will be shared. (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.FilesRemoteApi.FilesRemoteShare(context.Background()).Token(token).File(file).ExternalId(externalId).Channels(channels).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `FilesRemoteApi.FilesRemoteShare``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `FilesRemoteShare`: DefaultSuccessTemplate
    fmt.Fprintf(os.Stdout, "Response from `FilesRemoteApi.FilesRemoteShare`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiFilesRemoteShareRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;remote_files:share&#x60; | 
 **file** | **string** | Specify a file registered with Slack by providing its ID. Either this field or &#x60;external_id&#x60; or both are required. | 
 **externalId** | **string** | The globally unique identifier (GUID) for the file, as set by the app registering the file with Slack.  Either this field or &#x60;file&#x60; or both are required. | 
 **channels** | **string** | Comma-separated list of channel IDs where the file will be shared. | 

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## FilesRemoteUpdate

> DefaultSuccessTemplate FilesRemoteUpdate(ctx).ExternalId(externalId).ExternalUrl(externalUrl).File(file).Filetype(filetype).IndexableFileContents(indexableFileContents).PreviewImage(previewImage).Title(title).Token(token).Execute()





### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    openapiclient "./openapi"
)

func main() {
    externalId := "externalId_example" // string | Creator defined GUID for the file. (optional)
    externalUrl := "externalUrl_example" // string | URL of the remote file. (optional)
    file := "file_example" // string | Specify a file by providing its ID. (optional)
    filetype := "filetype_example" // string | type of file (optional)
    indexableFileContents := "indexableFileContents_example" // string | File containing contents that can be used to improve searchability for the remote file. (optional)
    previewImage := "previewImage_example" // string | Preview of the document via `multipart/form-data`. (optional)
    title := "title_example" // string | Title of the file being shared. (optional)
    token := "token_example" // string | Authentication token. Requires scope: `remote_files:write` (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.FilesRemoteApi.FilesRemoteUpdate(context.Background()).ExternalId(externalId).ExternalUrl(externalUrl).File(file).Filetype(filetype).IndexableFileContents(indexableFileContents).PreviewImage(previewImage).Title(title).Token(token).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `FilesRemoteApi.FilesRemoteUpdate``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `FilesRemoteUpdate`: DefaultSuccessTemplate
    fmt.Fprintf(os.Stdout, "Response from `FilesRemoteApi.FilesRemoteUpdate`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiFilesRemoteUpdateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **externalId** | **string** | Creator defined GUID for the file. | 
 **externalUrl** | **string** | URL of the remote file. | 
 **file** | **string** | Specify a file by providing its ID. | 
 **filetype** | **string** | type of file | 
 **indexableFileContents** | **string** | File containing contents that can be used to improve searchability for the remote file. | 
 **previewImage** | **string** | Preview of the document via &#x60;multipart/form-data&#x60;. | 
 **title** | **string** | Title of the file being shared. | 
 **token** | **string** | Authentication token. Requires scope: &#x60;remote_files:write&#x60; | 

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

