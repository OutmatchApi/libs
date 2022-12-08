# \CaptionsApi

All URIs are relative to *https://ws.api.video*

Method | HTTP request | Description
------------- | ------------- | -------------
[**DELETEVideosVideoIdCaptionsLanguage**](CaptionsApi.md#DELETEVideosVideoIdCaptionsLanguage) | **Delete** /videos/{videoId}/captions/{language} | Delete a caption
[**GETVideosVideoIdCaptions**](CaptionsApi.md#GETVideosVideoIdCaptions) | **Get** /videos/{videoId}/captions | List video captions
[**GETVideosVideoIdCaptionsLanguage**](CaptionsApi.md#GETVideosVideoIdCaptionsLanguage) | **Get** /videos/{videoId}/captions/{language} | Show a caption
[**PATCHVideosVideoIdCaptionsLanguage**](CaptionsApi.md#PATCHVideosVideoIdCaptionsLanguage) | **Patch** /videos/{videoId}/captions/{language} | Update caption
[**POSTVideosVideoIdCaptionsLanguage**](CaptionsApi.md#POSTVideosVideoIdCaptionsLanguage) | **Post** /videos/{videoId}/captions/{language} | Upload a caption



## DELETEVideosVideoIdCaptionsLanguage

> DELETEVideosVideoIdCaptionsLanguage(ctx, videoId, language).Execute()

Delete a caption



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
    videoId := "vi4k0jvEUuaTdRAEjQ4Prklgc" // string | The unique identifier for the video you want to delete a caption from.
    language := "en" // string | A valid [BCP 47](https://github.com/libyal/libfwnt/wiki/Language-Code-identifiers) language representation.

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.CaptionsApi.DELETEVideosVideoIdCaptionsLanguage(context.Background(), videoId, language).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `CaptionsApi.DELETEVideosVideoIdCaptionsLanguage``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**videoId** | **string** | The unique identifier for the video you want to delete a caption from. | 
**language** | **string** | A valid [BCP 47](https://github.com/libyal/libfwnt/wiki/Language-Code-identifiers) language representation. | 

### Other Parameters

Other parameters are passed through a pointer to a apiDELETEVideosVideoIdCaptionsLanguageRequest struct via the builder pattern


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


## GETVideosVideoIdCaptions

> CaptionsListResponse GETVideosVideoIdCaptions(ctx, videoId).CurrentPage(currentPage).PageSize(pageSize).Execute()

List video captions



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
    videoId := "vi4k0jvEUuaTdRAEjQ4Prklg" // string | The unique identifier for the video you want to retrieve a list of captions for.
    currentPage := int32(2) // int32 | Choose the number of search results to return per page. Minimum value: 1 (optional) (default to 1)
    pageSize := int32(30) // int32 | Results per page. Allowed values 1-100, default is 25. (optional) (default to 25)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.CaptionsApi.GETVideosVideoIdCaptions(context.Background(), videoId).CurrentPage(currentPage).PageSize(pageSize).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `CaptionsApi.GETVideosVideoIdCaptions``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GETVideosVideoIdCaptions`: CaptionsListResponse
    fmt.Fprintf(os.Stdout, "Response from `CaptionsApi.GETVideosVideoIdCaptions`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**videoId** | **string** | The unique identifier for the video you want to retrieve a list of captions for. | 

### Other Parameters

Other parameters are passed through a pointer to a apiGETVideosVideoIdCaptionsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **currentPage** | **int32** | Choose the number of search results to return per page. Minimum value: 1 | [default to 1]
 **pageSize** | **int32** | Results per page. Allowed values 1-100, default is 25. | [default to 25]

### Return type

[**CaptionsListResponse**](CaptionsListResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GETVideosVideoIdCaptionsLanguage

> Subtitle GETVideosVideoIdCaptionsLanguage(ctx, videoId, language).Execute()

Show a caption



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
    videoId := "vi4k0jvEUuaTdRAEjQ4Prklg" // string | The unique identifier for the video you want captions for.
    language := "en" // string | A valid [BCP 47](https://github.com/libyal/libfwnt/wiki/Language-Code-identifiers) language representation

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.CaptionsApi.GETVideosVideoIdCaptionsLanguage(context.Background(), videoId, language).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `CaptionsApi.GETVideosVideoIdCaptionsLanguage``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GETVideosVideoIdCaptionsLanguage`: Subtitle
    fmt.Fprintf(os.Stdout, "Response from `CaptionsApi.GETVideosVideoIdCaptionsLanguage`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**videoId** | **string** | The unique identifier for the video you want captions for. | 
**language** | **string** | A valid [BCP 47](https://github.com/libyal/libfwnt/wiki/Language-Code-identifiers) language representation | 

### Other Parameters

Other parameters are passed through a pointer to a apiGETVideosVideoIdCaptionsLanguageRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------



### Return type

[**Subtitle**](Subtitle.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## PATCHVideosVideoIdCaptionsLanguage

> Subtitle PATCHVideosVideoIdCaptionsLanguage(ctx, videoId, language).CaptionsUpdatePayload(captionsUpdatePayload).Execute()

Update caption



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
    videoId := "vi4k0jvEUuaTdRAEjQ4Prklg" // string | The unique identifier for the video you want to have automatic captions for. 
    language := "en" // string | A valid [BCP 47](https://github.com/libyal/libfwnt/wiki/Language-Code-identifiers) language representation.
    captionsUpdatePayload := *openapiclient.NewCaptionsUpdatePayload() // CaptionsUpdatePayload |  (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.CaptionsApi.PATCHVideosVideoIdCaptionsLanguage(context.Background(), videoId, language).CaptionsUpdatePayload(captionsUpdatePayload).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `CaptionsApi.PATCHVideosVideoIdCaptionsLanguage``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `PATCHVideosVideoIdCaptionsLanguage`: Subtitle
    fmt.Fprintf(os.Stdout, "Response from `CaptionsApi.PATCHVideosVideoIdCaptionsLanguage`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**videoId** | **string** | The unique identifier for the video you want to have automatic captions for.  | 
**language** | **string** | A valid [BCP 47](https://github.com/libyal/libfwnt/wiki/Language-Code-identifiers) language representation. | 

### Other Parameters

Other parameters are passed through a pointer to a apiPATCHVideosVideoIdCaptionsLanguageRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **captionsUpdatePayload** | [**CaptionsUpdatePayload**](CaptionsUpdatePayload.md) |  | 

### Return type

[**Subtitle**](Subtitle.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## POSTVideosVideoIdCaptionsLanguage

> Subtitle POSTVideosVideoIdCaptionsLanguage(ctx, videoId, language).File(file).Execute()

Upload a caption



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
    videoId := "vi4k0jvEUuaTdRAEjQ4Prklg" // string | The unique identifier for the video you want to add a caption to.
    language := "en" // string | A valid BCP 47 language representation.
    file := os.NewFile(1234, "some_file") // *os.File | The video text track (VTT) you want to upload.

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.CaptionsApi.POSTVideosVideoIdCaptionsLanguage(context.Background(), videoId, language).File(file).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `CaptionsApi.POSTVideosVideoIdCaptionsLanguage``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `POSTVideosVideoIdCaptionsLanguage`: Subtitle
    fmt.Fprintf(os.Stdout, "Response from `CaptionsApi.POSTVideosVideoIdCaptionsLanguage`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**videoId** | **string** | The unique identifier for the video you want to add a caption to. | 
**language** | **string** | A valid BCP 47 language representation. | 

### Other Parameters

Other parameters are passed through a pointer to a apiPOSTVideosVideoIdCaptionsLanguageRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **file** | ***os.File** | The video text track (VTT) you want to upload. | 

### Return type

[**Subtitle**](Subtitle.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

