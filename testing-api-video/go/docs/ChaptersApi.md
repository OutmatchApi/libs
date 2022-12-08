# \ChaptersApi

All URIs are relative to *https://ws.api.video*

Method | HTTP request | Description
------------- | ------------- | -------------
[**DELETEVideosVideoIdChaptersLanguage**](ChaptersApi.md#DELETEVideosVideoIdChaptersLanguage) | **Delete** /videos/{videoId}/chapters/{language} | Delete a chapter
[**GETVideosVideoIdChapters**](ChaptersApi.md#GETVideosVideoIdChapters) | **Get** /videos/{videoId}/chapters | List video chapters
[**GETVideosVideoIdChaptersLanguage**](ChaptersApi.md#GETVideosVideoIdChaptersLanguage) | **Get** /videos/{videoId}/chapters/{language} | Show a chapter
[**POSTVideosVideoIdChaptersLanguage**](ChaptersApi.md#POSTVideosVideoIdChaptersLanguage) | **Post** /videos/{videoId}/chapters/{language} | Upload a chapter



## DELETEVideosVideoIdChaptersLanguage

> DELETEVideosVideoIdChaptersLanguage(ctx, videoId, language).Execute()

Delete a chapter

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
    videoId := "vi4k0jvEUuaTdRAEjQ4Jfrgz" // string | The unique identifier for the video you want to delete a chapter from. 
    language := "en" // string | A valid [BCP 47](https://github.com/libyal/libfwnt/wiki/Language-Code-identifiers) language representation.

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.ChaptersApi.DELETEVideosVideoIdChaptersLanguage(context.Background(), videoId, language).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `ChaptersApi.DELETEVideosVideoIdChaptersLanguage``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**videoId** | **string** | The unique identifier for the video you want to delete a chapter from.  | 
**language** | **string** | A valid [BCP 47](https://github.com/libyal/libfwnt/wiki/Language-Code-identifiers) language representation. | 

### Other Parameters

Other parameters are passed through a pointer to a apiDELETEVideosVideoIdChaptersLanguageRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------



### Return type

 (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GETVideosVideoIdChapters

> ChaptersListResponse GETVideosVideoIdChapters(ctx, videoId).CurrentPage(currentPage).PageSize(pageSize).Execute()

List video chapters



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
    videoId := "vi4k0jvEUuaTdRAEjQ4Jfrgz" // string | The unique identifier for the video you want to retrieve a list of chapters for.
    currentPage := int32(2) // int32 | Choose the number of search results to return per page. Minimum value: 1 (optional) (default to 1)
    pageSize := int32(30) // int32 | Results per page. Allowed values 1-100, default is 25. (optional) (default to 25)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.ChaptersApi.GETVideosVideoIdChapters(context.Background(), videoId).CurrentPage(currentPage).PageSize(pageSize).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `ChaptersApi.GETVideosVideoIdChapters``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GETVideosVideoIdChapters`: ChaptersListResponse
    fmt.Fprintf(os.Stdout, "Response from `ChaptersApi.GETVideosVideoIdChapters`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**videoId** | **string** | The unique identifier for the video you want to retrieve a list of chapters for. | 

### Other Parameters

Other parameters are passed through a pointer to a apiGETVideosVideoIdChaptersRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **currentPage** | **int32** | Choose the number of search results to return per page. Minimum value: 1 | [default to 1]
 **pageSize** | **int32** | Results per page. Allowed values 1-100, default is 25. | [default to 25]

### Return type

[**ChaptersListResponse**](ChaptersListResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GETVideosVideoIdChaptersLanguage

> Chapter GETVideosVideoIdChaptersLanguage(ctx, videoId, language).Execute()

Show a chapter



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
    videoId := "vi4k0jvEUuaTdRAEjQ4Jfrgz" // string | The unique identifier for the video you want to show a chapter for.
    language := "en" // string | A valid [BCP 47](https://github.com/libyal/libfwnt/wiki/Language-Code-identifiers) language representation.

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.ChaptersApi.GETVideosVideoIdChaptersLanguage(context.Background(), videoId, language).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `ChaptersApi.GETVideosVideoIdChaptersLanguage``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GETVideosVideoIdChaptersLanguage`: Chapter
    fmt.Fprintf(os.Stdout, "Response from `ChaptersApi.GETVideosVideoIdChaptersLanguage`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**videoId** | **string** | The unique identifier for the video you want to show a chapter for. | 
**language** | **string** | A valid [BCP 47](https://github.com/libyal/libfwnt/wiki/Language-Code-identifiers) language representation. | 

### Other Parameters

Other parameters are passed through a pointer to a apiGETVideosVideoIdChaptersLanguageRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------



### Return type

[**Chapter**](Chapter.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## POSTVideosVideoIdChaptersLanguage

> Chapter POSTVideosVideoIdChaptersLanguage(ctx, videoId, language).File(file).Execute()

Upload a chapter



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
    videoId := "vi4k0jvEUuaTdRAEjQ4Jfrgz" // string | The unique identifier for the video you want to upload a chapter for.
    language := "en" // string | A valid [BCP 47](https://github.com/libyal/libfwnt/wiki/Language-Code-identifiers) language representation.
    file := os.NewFile(1234, "some_file") // *os.File | The VTT file describing the chapters you want to upload.

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.ChaptersApi.POSTVideosVideoIdChaptersLanguage(context.Background(), videoId, language).File(file).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `ChaptersApi.POSTVideosVideoIdChaptersLanguage``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `POSTVideosVideoIdChaptersLanguage`: Chapter
    fmt.Fprintf(os.Stdout, "Response from `ChaptersApi.POSTVideosVideoIdChaptersLanguage`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**videoId** | **string** | The unique identifier for the video you want to upload a chapter for. | 
**language** | **string** | A valid [BCP 47](https://github.com/libyal/libfwnt/wiki/Language-Code-identifiers) language representation. | 

### Other Parameters

Other parameters are passed through a pointer to a apiPOSTVideosVideoIdChaptersLanguageRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **file** | ***os.File** | The VTT file describing the chapters you want to upload. | 

### Return type

[**Chapter**](Chapter.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

