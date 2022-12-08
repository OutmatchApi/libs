# \FilesApi

All URIs are relative to *https://slack.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**FilesCommentsDelete**](FilesApi.md#FilesCommentsDelete) | **Post** /files.comments.delete | 
[**FilesDelete**](FilesApi.md#FilesDelete) | **Post** /files.delete | 
[**FilesInfo**](FilesApi.md#FilesInfo) | **Get** /files.info | 
[**FilesList**](FilesApi.md#FilesList) | **Get** /files.list | 
[**FilesRemoteAdd**](FilesApi.md#FilesRemoteAdd) | **Post** /files.remote.add | 
[**FilesRemoteInfo**](FilesApi.md#FilesRemoteInfo) | **Get** /files.remote.info | 
[**FilesRemoteList**](FilesApi.md#FilesRemoteList) | **Get** /files.remote.list | 
[**FilesRemoteRemove**](FilesApi.md#FilesRemoteRemove) | **Post** /files.remote.remove | 
[**FilesRemoteShare**](FilesApi.md#FilesRemoteShare) | **Get** /files.remote.share | 
[**FilesRemoteUpdate**](FilesApi.md#FilesRemoteUpdate) | **Post** /files.remote.update | 
[**FilesRevokePublicURL**](FilesApi.md#FilesRevokePublicURL) | **Post** /files.revokePublicURL | 
[**FilesSharedPublicURL**](FilesApi.md#FilesSharedPublicURL) | **Post** /files.sharedPublicURL | 
[**FilesUpload**](FilesApi.md#FilesUpload) | **Post** /files.upload | 



## FilesCommentsDelete

> FilesCommentsDeleteSchema FilesCommentsDelete(ctx).Token(token).File(file).Id(id).Execute()





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
    token := "token_example" // string | Authentication token. Requires scope: `files:write:user` (optional)
    file := "file_example" // string | File to delete a comment from. (optional)
    id := "id_example" // string | The comment to delete. (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.FilesApi.FilesCommentsDelete(context.Background()).Token(token).File(file).Id(id).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `FilesApi.FilesCommentsDelete``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `FilesCommentsDelete`: FilesCommentsDeleteSchema
    fmt.Fprintf(os.Stdout, "Response from `FilesApi.FilesCommentsDelete`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiFilesCommentsDeleteRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;files:write:user&#x60; | 
 **file** | **string** | File to delete a comment from. | 
 **id** | **string** | The comment to delete. | 

### Return type

[**FilesCommentsDeleteSchema**](FilesCommentsDeleteSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## FilesDelete

> FilesDeleteSchema FilesDelete(ctx).Token(token).File(file).Execute()





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
    token := "token_example" // string | Authentication token. Requires scope: `files:write:user` (optional)
    file := "file_example" // string | ID of file to delete. (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.FilesApi.FilesDelete(context.Background()).Token(token).File(file).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `FilesApi.FilesDelete``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `FilesDelete`: FilesDeleteSchema
    fmt.Fprintf(os.Stdout, "Response from `FilesApi.FilesDelete`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiFilesDeleteRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;files:write:user&#x60; | 
 **file** | **string** | ID of file to delete. | 

### Return type

[**FilesDeleteSchema**](FilesDeleteSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## FilesInfo

> FilesInfoSchema FilesInfo(ctx).Token(token).File(file).Count(count).Page(page).Limit(limit).Cursor(cursor).Execute()





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
    token := "token_example" // string | Authentication token. Requires scope: `files:read` (optional)
    file := "file_example" // string | Specify a file by providing its ID. (optional)
    count := "count_example" // string |  (optional)
    page := "page_example" // string |  (optional)
    limit := int32(56) // int32 | The maximum number of items to return. Fewer than the requested number of items may be returned, even if the end of the list hasn't been reached. (optional)
    cursor := "cursor_example" // string | Parameter for pagination. File comments are paginated for a single file. Set `cursor` equal to the `next_cursor` attribute returned by the previous request's `response_metadata`. This parameter is optional, but pagination is mandatory: the default value simply fetches the first \"page\" of the collection of comments. See [pagination](/docs/pagination) for more details. (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.FilesApi.FilesInfo(context.Background()).Token(token).File(file).Count(count).Page(page).Limit(limit).Cursor(cursor).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `FilesApi.FilesInfo``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `FilesInfo`: FilesInfoSchema
    fmt.Fprintf(os.Stdout, "Response from `FilesApi.FilesInfo`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiFilesInfoRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;files:read&#x60; | 
 **file** | **string** | Specify a file by providing its ID. | 
 **count** | **string** |  | 
 **page** | **string** |  | 
 **limit** | **int32** | The maximum number of items to return. Fewer than the requested number of items may be returned, even if the end of the list hasn&#39;t been reached. | 
 **cursor** | **string** | Parameter for pagination. File comments are paginated for a single file. Set &#x60;cursor&#x60; equal to the &#x60;next_cursor&#x60; attribute returned by the previous request&#39;s &#x60;response_metadata&#x60;. This parameter is optional, but pagination is mandatory: the default value simply fetches the first \&quot;page\&quot; of the collection of comments. See [pagination](/docs/pagination) for more details. | 

### Return type

[**FilesInfoSchema**](FilesInfoSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## FilesList

> FilesListSchema FilesList(ctx).Token(token).User(user).Channel(channel).TsFrom(tsFrom).TsTo(tsTo).Types(types).Count(count).Page(page).ShowFilesHiddenByLimit(showFilesHiddenByLimit).Execute()





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
    token := "token_example" // string | Authentication token. Requires scope: `files:read` (optional)
    user := "user_example" // string | Filter files created by a single user. (optional)
    channel := "channel_example" // string | Filter files appearing in a specific channel, indicated by its ID. (optional)
    tsFrom := float32(8.14) // float32 | Filter files created after this timestamp (inclusive). (optional)
    tsTo := float32(8.14) // float32 | Filter files created before this timestamp (inclusive). (optional)
    types := "types_example" // string | Filter files by type ([see below](#file_types)). You can pass multiple values in the types argument, like `types=spaces,snippets`.The default value is `all`, which does not filter the list. (optional)
    count := "count_example" // string |  (optional)
    page := "page_example" // string |  (optional)
    showFilesHiddenByLimit := true // bool | Show truncated file info for files hidden due to being too old, and the team who owns the file being over the file limit. (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.FilesApi.FilesList(context.Background()).Token(token).User(user).Channel(channel).TsFrom(tsFrom).TsTo(tsTo).Types(types).Count(count).Page(page).ShowFilesHiddenByLimit(showFilesHiddenByLimit).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `FilesApi.FilesList``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `FilesList`: FilesListSchema
    fmt.Fprintf(os.Stdout, "Response from `FilesApi.FilesList`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiFilesListRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;files:read&#x60; | 
 **user** | **string** | Filter files created by a single user. | 
 **channel** | **string** | Filter files appearing in a specific channel, indicated by its ID. | 
 **tsFrom** | **float32** | Filter files created after this timestamp (inclusive). | 
 **tsTo** | **float32** | Filter files created before this timestamp (inclusive). | 
 **types** | **string** | Filter files by type ([see below](#file_types)). You can pass multiple values in the types argument, like &#x60;types&#x3D;spaces,snippets&#x60;.The default value is &#x60;all&#x60;, which does not filter the list. | 
 **count** | **string** |  | 
 **page** | **string** |  | 
 **showFilesHiddenByLimit** | **bool** | Show truncated file info for files hidden due to being too old, and the team who owns the file being over the file limit. | 

### Return type

[**FilesListSchema**](FilesListSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


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
    resp, r, err := apiClient.FilesApi.FilesRemoteAdd(context.Background()).ExternalId(externalId).ExternalUrl(externalUrl).Filetype(filetype).IndexableFileContents(indexableFileContents).PreviewImage(previewImage).Title(title).Token(token).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `FilesApi.FilesRemoteAdd``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `FilesRemoteAdd`: DefaultSuccessTemplate
    fmt.Fprintf(os.Stdout, "Response from `FilesApi.FilesRemoteAdd`: %v\n", resp)
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
    resp, r, err := apiClient.FilesApi.FilesRemoteInfo(context.Background()).Token(token).File(file).ExternalId(externalId).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `FilesApi.FilesRemoteInfo``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `FilesRemoteInfo`: DefaultSuccessTemplate
    fmt.Fprintf(os.Stdout, "Response from `FilesApi.FilesRemoteInfo`: %v\n", resp)
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
    resp, r, err := apiClient.FilesApi.FilesRemoteList(context.Background()).Token(token).Channel(channel).TsFrom(tsFrom).TsTo(tsTo).Limit(limit).Cursor(cursor).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `FilesApi.FilesRemoteList``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `FilesRemoteList`: DefaultSuccessTemplate
    fmt.Fprintf(os.Stdout, "Response from `FilesApi.FilesRemoteList`: %v\n", resp)
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
    resp, r, err := apiClient.FilesApi.FilesRemoteRemove(context.Background()).ExternalId(externalId).File(file).Token(token).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `FilesApi.FilesRemoteRemove``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `FilesRemoteRemove`: DefaultSuccessTemplate
    fmt.Fprintf(os.Stdout, "Response from `FilesApi.FilesRemoteRemove`: %v\n", resp)
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
    resp, r, err := apiClient.FilesApi.FilesRemoteShare(context.Background()).Token(token).File(file).ExternalId(externalId).Channels(channels).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `FilesApi.FilesRemoteShare``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `FilesRemoteShare`: DefaultSuccessTemplate
    fmt.Fprintf(os.Stdout, "Response from `FilesApi.FilesRemoteShare`: %v\n", resp)
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
    resp, r, err := apiClient.FilesApi.FilesRemoteUpdate(context.Background()).ExternalId(externalId).ExternalUrl(externalUrl).File(file).Filetype(filetype).IndexableFileContents(indexableFileContents).PreviewImage(previewImage).Title(title).Token(token).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `FilesApi.FilesRemoteUpdate``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `FilesRemoteUpdate`: DefaultSuccessTemplate
    fmt.Fprintf(os.Stdout, "Response from `FilesApi.FilesRemoteUpdate`: %v\n", resp)
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


## FilesRevokePublicURL

> FilesRevokePublicURLSchema FilesRevokePublicURL(ctx).Token(token).File(file).Execute()





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
    token := "token_example" // string | Authentication token. Requires scope: `files:write:user` (optional)
    file := "file_example" // string | File to revoke (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.FilesApi.FilesRevokePublicURL(context.Background()).Token(token).File(file).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `FilesApi.FilesRevokePublicURL``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `FilesRevokePublicURL`: FilesRevokePublicURLSchema
    fmt.Fprintf(os.Stdout, "Response from `FilesApi.FilesRevokePublicURL`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiFilesRevokePublicURLRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;files:write:user&#x60; | 
 **file** | **string** | File to revoke | 

### Return type

[**FilesRevokePublicURLSchema**](FilesRevokePublicURLSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## FilesSharedPublicURL

> FilesSharedPublicURLSchema FilesSharedPublicURL(ctx).Token(token).File(file).Execute()





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
    token := "token_example" // string | Authentication token. Requires scope: `files:write:user` (optional)
    file := "file_example" // string | File to share (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.FilesApi.FilesSharedPublicURL(context.Background()).Token(token).File(file).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `FilesApi.FilesSharedPublicURL``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `FilesSharedPublicURL`: FilesSharedPublicURLSchema
    fmt.Fprintf(os.Stdout, "Response from `FilesApi.FilesSharedPublicURL`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiFilesSharedPublicURLRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;files:write:user&#x60; | 
 **file** | **string** | File to share | 

### Return type

[**FilesSharedPublicURLSchema**](FilesSharedPublicURLSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## FilesUpload

> FilesUploadSchema FilesUpload(ctx).Channels(channels).Content(content).File(file).Filename(filename).Filetype(filetype).InitialComment(initialComment).ThreadTs(threadTs).Title(title).Token(token).Execute()





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
    channels := "channels_example" // string | Comma-separated list of channel names or IDs where the file will be shared. (optional)
    content := "content_example" // string | File contents via a POST variable. If omitting this parameter, you must provide a `file`. (optional)
    file := "file_example" // string | File contents via `multipart/form-data`. If omitting this parameter, you must submit `content`. (optional)
    filename := "filename_example" // string | Filename of file. (optional)
    filetype := "filetype_example" // string | A [file type](/types/file#file_types) identifier. (optional)
    initialComment := "initialComment_example" // string | The message text introducing the file in specified `channels`. (optional)
    threadTs := float32(8.14) // float32 | Provide another message's `ts` value to upload this file as a reply. Never use a reply's `ts` value; use its parent instead. (optional)
    title := "title_example" // string | Title of file. (optional)
    token := "token_example" // string | Authentication token. Requires scope: `files:write:user` (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.FilesApi.FilesUpload(context.Background()).Channels(channels).Content(content).File(file).Filename(filename).Filetype(filetype).InitialComment(initialComment).ThreadTs(threadTs).Title(title).Token(token).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `FilesApi.FilesUpload``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `FilesUpload`: FilesUploadSchema
    fmt.Fprintf(os.Stdout, "Response from `FilesApi.FilesUpload`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiFilesUploadRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channels** | **string** | Comma-separated list of channel names or IDs where the file will be shared. | 
 **content** | **string** | File contents via a POST variable. If omitting this parameter, you must provide a &#x60;file&#x60;. | 
 **file** | **string** | File contents via &#x60;multipart/form-data&#x60;. If omitting this parameter, you must submit &#x60;content&#x60;. | 
 **filename** | **string** | Filename of file. | 
 **filetype** | **string** | A [file type](/types/file#file_types) identifier. | 
 **initialComment** | **string** | The message text introducing the file in specified &#x60;channels&#x60;. | 
 **threadTs** | **float32** | Provide another message&#39;s &#x60;ts&#x60; value to upload this file as a reply. Never use a reply&#39;s &#x60;ts&#x60; value; use its parent instead. | 
 **title** | **string** | Title of file. | 
 **token** | **string** | Authentication token. Requires scope: &#x60;files:write:user&#x60; | 

### Return type

[**FilesUploadSchema**](FilesUploadSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

