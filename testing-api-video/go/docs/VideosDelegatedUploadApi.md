# \VideosDelegatedUploadApi

All URIs are relative to *https://ws.api.video*

Method | HTTP request | Description
------------- | ------------- | -------------
[**DELETEUploadTokensUploadToken**](VideosDelegatedUploadApi.md#DELETEUploadTokensUploadToken) | **Delete** /upload-tokens/{uploadToken} | Delete an upload token
[**GETUploadTokens**](VideosDelegatedUploadApi.md#GETUploadTokens) | **Get** /upload-tokens | List all active upload tokens.
[**GETUploadTokensUploadToken**](VideosDelegatedUploadApi.md#GETUploadTokensUploadToken) | **Get** /upload-tokens/{uploadToken} | Show upload token
[**POSTUpload**](VideosDelegatedUploadApi.md#POSTUpload) | **Post** /upload | Upload with an upload token
[**POSTUploadTokens**](VideosDelegatedUploadApi.md#POSTUploadTokens) | **Post** /upload-tokens | Generate an upload token



## DELETEUploadTokensUploadToken

> DELETEUploadTokensUploadToken(ctx, uploadToken).Execute()

Delete an upload token



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
    uploadToken := "to1tcmSFHeYY5KzyhOqVKMKb" // string | The unique identifier for the upload token you want to delete. Deleting a token will make it so the token can no longer be used for authentication.

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.VideosDelegatedUploadApi.DELETEUploadTokensUploadToken(context.Background(), uploadToken).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `VideosDelegatedUploadApi.DELETEUploadTokensUploadToken``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**uploadToken** | **string** | The unique identifier for the upload token you want to delete. Deleting a token will make it so the token can no longer be used for authentication. | 

### Other Parameters

Other parameters are passed through a pointer to a apiDELETEUploadTokensUploadTokenRequest struct via the builder pattern


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


## GETUploadTokens

> TokenListResponse GETUploadTokens(ctx).SortBy(sortBy).SortOrder(sortOrder).CurrentPage(currentPage).PageSize(pageSize).Execute()

List all active upload tokens.



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
    sortBy := "ttl" // string | Allowed: createdAt, ttl. You can use these to sort by when a token was created, or how much longer the token will be active (ttl - time to live). Date and time is presented in ISO-8601 format. (optional)
    sortOrder := "asc" // string | Allowed: asc, desc. Ascending is 0-9 or A-Z. Descending is 9-0 or Z-A. (optional)
    currentPage := int32(2) // int32 | Choose the number of search results to return per page. Minimum value: 1 (optional) (default to 1)
    pageSize := int32(30) // int32 | Results per page. Allowed values 1-100, default is 25. (optional) (default to 25)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.VideosDelegatedUploadApi.GETUploadTokens(context.Background()).SortBy(sortBy).SortOrder(sortOrder).CurrentPage(currentPage).PageSize(pageSize).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `VideosDelegatedUploadApi.GETUploadTokens``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GETUploadTokens`: TokenListResponse
    fmt.Fprintf(os.Stdout, "Response from `VideosDelegatedUploadApi.GETUploadTokens`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGETUploadTokensRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sortBy** | **string** | Allowed: createdAt, ttl. You can use these to sort by when a token was created, or how much longer the token will be active (ttl - time to live). Date and time is presented in ISO-8601 format. | 
 **sortOrder** | **string** | Allowed: asc, desc. Ascending is 0-9 or A-Z. Descending is 9-0 or Z-A. | 
 **currentPage** | **int32** | Choose the number of search results to return per page. Minimum value: 1 | [default to 1]
 **pageSize** | **int32** | Results per page. Allowed values 1-100, default is 25. | [default to 25]

### Return type

[**TokenListResponse**](TokenListResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GETUploadTokensUploadToken

> UploadToken GETUploadTokensUploadToken(ctx, uploadToken).Execute()

Show upload token



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
    uploadToken := "to1tcmSFHeYY5KzyhOqVKMKb" // string | The unique identifier for the token you want information about.

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.VideosDelegatedUploadApi.GETUploadTokensUploadToken(context.Background(), uploadToken).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `VideosDelegatedUploadApi.GETUploadTokensUploadToken``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GETUploadTokensUploadToken`: UploadToken
    fmt.Fprintf(os.Stdout, "Response from `VideosDelegatedUploadApi.GETUploadTokensUploadToken`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**uploadToken** | **string** | The unique identifier for the token you want information about. | 

### Other Parameters

Other parameters are passed through a pointer to a apiGETUploadTokensUploadTokenRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**UploadToken**](UploadToken.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## POSTUpload

> Video POSTUpload(ctx).Token(token).File(file).ContentRange(contentRange).VideoId(videoId).Execute()

Upload with an upload token



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
    token := "to1tcmSFHeYY5KzyhOqVKMKb" // string | The unique identifier for the token you want to use to upload a video.
    file := os.NewFile(1234, "some_file") // *os.File | The path to the video you want to upload.
    contentRange := "Content-Range: bytes 200-100/5000" // string | Content-Range represents the range of bytes that will be returned as a result of the request. Byte ranges are inclusive, meaning that bytes 0-999 represents the first 1000 bytes in a file or object. (optional)
    videoId := "videoId_example" // string | The video id returned by the first call to this endpoint in a large video upload scenario. (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.VideosDelegatedUploadApi.POSTUpload(context.Background()).Token(token).File(file).ContentRange(contentRange).VideoId(videoId).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `VideosDelegatedUploadApi.POSTUpload``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `POSTUpload`: Video
    fmt.Fprintf(os.Stdout, "Response from `VideosDelegatedUploadApi.POSTUpload`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiPOSTUploadRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | The unique identifier for the token you want to use to upload a video. | 
 **file** | ***os.File** | The path to the video you want to upload. | 
 **contentRange** | **string** | Content-Range represents the range of bytes that will be returned as a result of the request. Byte ranges are inclusive, meaning that bytes 0-999 represents the first 1000 bytes in a file or object. | 
 **videoId** | **string** | The video id returned by the first call to this endpoint in a large video upload scenario. | 

### Return type

[**Video**](Video.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## POSTUploadTokens

> UploadToken POSTUploadTokens(ctx).TokenCreatePayload(tokenCreatePayload).Execute()

Generate an upload token



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
    tokenCreatePayload := *openapiclient.NewTokenCreatePayload() // TokenCreatePayload |  (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.VideosDelegatedUploadApi.POSTUploadTokens(context.Background()).TokenCreatePayload(tokenCreatePayload).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `VideosDelegatedUploadApi.POSTUploadTokens``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `POSTUploadTokens`: UploadToken
    fmt.Fprintf(os.Stdout, "Response from `VideosDelegatedUploadApi.POSTUploadTokens`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiPOSTUploadTokensRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tokenCreatePayload** | [**TokenCreatePayload**](TokenCreatePayload.md) |  | 

### Return type

[**UploadToken**](UploadToken.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

