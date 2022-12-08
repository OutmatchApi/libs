# \FilesCommentsApi

All URIs are relative to *https://slack.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**FilesCommentsDelete**](FilesCommentsApi.md#FilesCommentsDelete) | **Post** /files.comments.delete | 



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
    resp, r, err := apiClient.FilesCommentsApi.FilesCommentsDelete(context.Background()).Token(token).File(file).Id(id).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `FilesCommentsApi.FilesCommentsDelete``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `FilesCommentsDelete`: FilesCommentsDeleteSchema
    fmt.Fprintf(os.Stdout, "Response from `FilesCommentsApi.FilesCommentsDelete`: %v\n", resp)
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

