# \VideosApi

All URIs are relative to *https://ws.api.video*

Method | HTTP request | Description
------------- | ------------- | -------------
[**DELETEVideo**](VideosApi.md#DELETEVideo) | **Delete** /videos/{videoId} | Delete a video
[**GETVideo**](VideosApi.md#GETVideo) | **Get** /videos/{videoId} | Show a video
[**GETVideoStatus**](VideosApi.md#GETVideoStatus) | **Get** /videos/{videoId}/status | Show video status
[**LISTVideos**](VideosApi.md#LISTVideos) | **Get** /videos | List all videos
[**PATCHVideo**](VideosApi.md#PATCHVideo) | **Patch** /videos/{videoId} | Update a video
[**PATCHVideosVideoIdThumbnail**](VideosApi.md#PATCHVideosVideoIdThumbnail) | **Patch** /videos/{videoId}/thumbnail | Pick a thumbnail
[**POSTVideo**](VideosApi.md#POSTVideo) | **Post** /videos | Create a video
[**POSTVideosVideoIdSource**](VideosApi.md#POSTVideosVideoIdSource) | **Post** /videos/{videoId}/source | Upload a video
[**POSTVideosVideoIdThumbnail**](VideosApi.md#POSTVideosVideoIdThumbnail) | **Post** /videos/{videoId}/thumbnail | Upload a thumbnail



## DELETEVideo

> DELETEVideo(ctx, videoId).Execute()

Delete a video



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
    videoId := "vi4k0jvEUuaTdRAEjQ4Jfrgz" // string | The video ID for the video you want to delete.

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.VideosApi.DELETEVideo(context.Background(), videoId).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `VideosApi.DELETEVideo``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**videoId** | **string** | The video ID for the video you want to delete. | 

### Other Parameters

Other parameters are passed through a pointer to a apiDELETEVideoRequest struct via the builder pattern


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


## GETVideo

> Video GETVideo(ctx, videoId).Execute()

Show a video



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
    videoId := "videoId_example" // string | The unique identifier for the video you want details about.

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.VideosApi.GETVideo(context.Background(), videoId).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `VideosApi.GETVideo``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GETVideo`: Video
    fmt.Fprintf(os.Stdout, "Response from `VideosApi.GETVideo`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**videoId** | **string** | The unique identifier for the video you want details about. | 

### Other Parameters

Other parameters are passed through a pointer to a apiGETVideoRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**Video**](Video.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GETVideoStatus

> Videostatus GETVideoStatus(ctx, videoId).Execute()

Show video status



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
    videoId := "vi4k0jvEUuaTdRAEjQ4Jfrgz" // string | The unique identifier for the video you want the status for.

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.VideosApi.GETVideoStatus(context.Background(), videoId).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `VideosApi.GETVideoStatus``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GETVideoStatus`: Videostatus
    fmt.Fprintf(os.Stdout, "Response from `VideosApi.GETVideoStatus`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**videoId** | **string** | The unique identifier for the video you want the status for. | 

### Other Parameters

Other parameters are passed through a pointer to a apiGETVideoStatusRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**Videostatus**](Videostatus.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## LISTVideos

> VideosListResponse LISTVideos(ctx).Title(title).Tags(tags).Metadata(metadata).Description(description).LiveStreamId(liveStreamId).SortBy(sortBy).SortOrder(sortOrder).CurrentPage(currentPage).PageSize(pageSize).Execute()

List all videos



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
    title := "My Video.mp4" // string | The title of a specific video you want to find. The search will match exactly to what term you provide and return any videos that contain the same term as part of their titles. (optional)
    tags := []string{"Inner_example"} // []string | A tag is a category you create and apply to videos. You can search for videos with particular tags by listing one or more here. Only videos that have all the tags you list will be returned. (optional)
    metadata := []string{"Inner_example"} // []string | Videos can be tagged with metadata tags in key:value pairs. You can search for videos with specific key value pairs using this parameter. [Dynamic Metadata](https://api.video/blog/endpoints/dynamic-metadata) allows you to define a key that allows any value pair. (optional)
    description := "New Zealand" // string | If you described a video with a term or sentence, you can add it here to return videos containing this string. (optional)
    liveStreamId := "li400mYKSgQ6xs7taUeSaEKr" // string | If you know the ID for a live stream, you can retrieve the stream by adding the ID for it here. (optional)
    sortBy := "publishedAt" // string | Allowed: publishedAt, title. You can search by the time videos were published at, or by title. (optional)
    sortOrder := "asc" // string | Allowed: asc, desc. asc is ascending and sorts from A to Z. desc is descending and sorts from Z to A. (optional)
    currentPage := int32(2) // int32 | Choose the number of search results to return per page. Minimum value: 1 (optional) (default to 1)
    pageSize := int32(30) // int32 | Results per page. Allowed values 1-100, default is 25. (optional) (default to 25)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.VideosApi.LISTVideos(context.Background()).Title(title).Tags(tags).Metadata(metadata).Description(description).LiveStreamId(liveStreamId).SortBy(sortBy).SortOrder(sortOrder).CurrentPage(currentPage).PageSize(pageSize).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `VideosApi.LISTVideos``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `LISTVideos`: VideosListResponse
    fmt.Fprintf(os.Stdout, "Response from `VideosApi.LISTVideos`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiLISTVideosRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **title** | **string** | The title of a specific video you want to find. The search will match exactly to what term you provide and return any videos that contain the same term as part of their titles. | 
 **tags** | **[]string** | A tag is a category you create and apply to videos. You can search for videos with particular tags by listing one or more here. Only videos that have all the tags you list will be returned. | 
 **metadata** | **[]string** | Videos can be tagged with metadata tags in key:value pairs. You can search for videos with specific key value pairs using this parameter. [Dynamic Metadata](https://api.video/blog/endpoints/dynamic-metadata) allows you to define a key that allows any value pair. | 
 **description** | **string** | If you described a video with a term or sentence, you can add it here to return videos containing this string. | 
 **liveStreamId** | **string** | If you know the ID for a live stream, you can retrieve the stream by adding the ID for it here. | 
 **sortBy** | **string** | Allowed: publishedAt, title. You can search by the time videos were published at, or by title. | 
 **sortOrder** | **string** | Allowed: asc, desc. asc is ascending and sorts from A to Z. desc is descending and sorts from Z to A. | 
 **currentPage** | **int32** | Choose the number of search results to return per page. Minimum value: 1 | [default to 1]
 **pageSize** | **int32** | Results per page. Allowed values 1-100, default is 25. | [default to 25]

### Return type

[**VideosListResponse**](VideosListResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## PATCHVideo

> Video PATCHVideo(ctx, videoId).VideoUpdatePayload(videoUpdatePayload).Execute()

Update a video



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
    videoId := "vi4k0jvEUuaTdRAEjQ4Jfrgz" // string | The video ID for the video you want to delete.
    videoUpdatePayload := *openapiclient.NewVideoUpdatePayload() // VideoUpdatePayload |  (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.VideosApi.PATCHVideo(context.Background(), videoId).VideoUpdatePayload(videoUpdatePayload).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `VideosApi.PATCHVideo``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `PATCHVideo`: Video
    fmt.Fprintf(os.Stdout, "Response from `VideosApi.PATCHVideo`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**videoId** | **string** | The video ID for the video you want to delete. | 

### Other Parameters

Other parameters are passed through a pointer to a apiPATCHVideoRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **videoUpdatePayload** | [**VideoUpdatePayload**](VideoUpdatePayload.md) |  | 

### Return type

[**Video**](Video.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## PATCHVideosVideoIdThumbnail

> Video PATCHVideosVideoIdThumbnail(ctx, videoId).VideoThumbnailPickPayload(videoThumbnailPickPayload).Execute()

Pick a thumbnail



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
    videoId := "vi4k0jvEUuaTdRAEjQ4Jfrgz" // string | Unique identifier of the video you want to add a thumbnail to, where you use a section of your video as the thumbnail.
    videoThumbnailPickPayload := *openapiclient.NewVideoThumbnailPickPayload("Timecode_example") // VideoThumbnailPickPayload |  (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.VideosApi.PATCHVideosVideoIdThumbnail(context.Background(), videoId).VideoThumbnailPickPayload(videoThumbnailPickPayload).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `VideosApi.PATCHVideosVideoIdThumbnail``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `PATCHVideosVideoIdThumbnail`: Video
    fmt.Fprintf(os.Stdout, "Response from `VideosApi.PATCHVideosVideoIdThumbnail`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**videoId** | **string** | Unique identifier of the video you want to add a thumbnail to, where you use a section of your video as the thumbnail. | 

### Other Parameters

Other parameters are passed through a pointer to a apiPATCHVideosVideoIdThumbnailRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **videoThumbnailPickPayload** | [**VideoThumbnailPickPayload**](VideoThumbnailPickPayload.md) |  | 

### Return type

[**Video**](Video.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## POSTVideo

> Video POSTVideo(ctx).VideoCreatePayload(videoCreatePayload).Execute()

Create a video



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
    videoCreatePayload := *openapiclient.NewVideoCreatePayload("Maths video") // VideoCreatePayload | video to create (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.VideosApi.POSTVideo(context.Background()).VideoCreatePayload(videoCreatePayload).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `VideosApi.POSTVideo``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `POSTVideo`: Video
    fmt.Fprintf(os.Stdout, "Response from `VideosApi.POSTVideo`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiPOSTVideoRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **videoCreatePayload** | [**VideoCreatePayload**](VideoCreatePayload.md) | video to create | 

### Return type

[**Video**](Video.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## POSTVideosVideoIdSource

> Video POSTVideosVideoIdSource(ctx, videoId).File(file).ContentRange(contentRange).Execute()

Upload a video



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
    videoId := "vi4k0jvEUuaTdRAEjQ4Jfrgz" // string | Enter the videoId you want to use to upload your video.
    file := os.NewFile(1234, "some_file") // *os.File | The path to the video you would like to upload. The path must be local. If you want to use a video from an online source, you must use the \\\"/videos\\\" endpoint and add the \\\"source\\\" parameter when you create a new video.
    contentRange := "Content-Range: bytes 200-100/5000" // string | Content-Range represents the range of bytes that will be returned as a result of the request. Byte ranges are inclusive, meaning that bytes 0-999 represents the first 1000 bytes in a file or object. (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.VideosApi.POSTVideosVideoIdSource(context.Background(), videoId).File(file).ContentRange(contentRange).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `VideosApi.POSTVideosVideoIdSource``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `POSTVideosVideoIdSource`: Video
    fmt.Fprintf(os.Stdout, "Response from `VideosApi.POSTVideosVideoIdSource`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**videoId** | **string** | Enter the videoId you want to use to upload your video. | 

### Other Parameters

Other parameters are passed through a pointer to a apiPOSTVideosVideoIdSourceRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **file** | ***os.File** | The path to the video you would like to upload. The path must be local. If you want to use a video from an online source, you must use the \\\&quot;/videos\\\&quot; endpoint and add the \\\&quot;source\\\&quot; parameter when you create a new video. | 
 **contentRange** | **string** | Content-Range represents the range of bytes that will be returned as a result of the request. Byte ranges are inclusive, meaning that bytes 0-999 represents the first 1000 bytes in a file or object. | 

### Return type

[**Video**](Video.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## POSTVideosVideoIdThumbnail

> Video POSTVideosVideoIdThumbnail(ctx, videoId).File(file).Execute()

Upload a thumbnail



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
    videoId := "videoId_example" // string | Unique identifier of the chosen video 
    file := os.NewFile(1234, "some_file") // *os.File | The image to be added as a thumbnail.

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.VideosApi.POSTVideosVideoIdThumbnail(context.Background(), videoId).File(file).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `VideosApi.POSTVideosVideoIdThumbnail``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `POSTVideosVideoIdThumbnail`: Video
    fmt.Fprintf(os.Stdout, "Response from `VideosApi.POSTVideosVideoIdThumbnail`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**videoId** | **string** | Unique identifier of the chosen video  | 

### Other Parameters

Other parameters are passed through a pointer to a apiPOSTVideosVideoIdThumbnailRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **file** | ***os.File** | The image to be added as a thumbnail. | 

### Return type

[**Video**](Video.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

