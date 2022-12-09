# \LiveApi

All URIs are relative to *https://ws.api.video*

Method | HTTP request | Description
------------- | ------------- | -------------
[**DELETELiveStreamsLiveStreamId**](LiveApi.md#DELETELiveStreamsLiveStreamId) | **Delete** /live-streams/{liveStreamId} | Delete a live stream
[**DELETELiveStreamsLiveStreamIdThumbnail**](LiveApi.md#DELETELiveStreamsLiveStreamIdThumbnail) | **Delete** /live-streams/{liveStreamId}/thumbnail | Delete a thumbnail
[**GETLiveStreams**](LiveApi.md#GETLiveStreams) | **Get** /live-streams | List all live streams
[**GETLiveStreamsLiveStreamId**](LiveApi.md#GETLiveStreamsLiveStreamId) | **Get** /live-streams/{liveStreamId} | Show live stream
[**PATCHLiveStreamsLiveStreamId**](LiveApi.md#PATCHLiveStreamsLiveStreamId) | **Patch** /live-streams/{liveStreamId} | Update a live stream
[**POSTLiveStreams**](LiveApi.md#POSTLiveStreams) | **Post** /live-streams | Create live stream
[**POSTLiveStreamsLiveStreamIdThumbnail**](LiveApi.md#POSTLiveStreamsLiveStreamIdThumbnail) | **Post** /live-streams/{liveStreamId}/thumbnail | Upload a thumbnail



## DELETELiveStreamsLiveStreamId

> DELETELiveStreamsLiveStreamId(ctx, liveStreamId).Execute()

Delete a live stream

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
    liveStreamId := "li400mYKSgQ6xs7taUeSaEKr" // string | The unique ID for the live stream that you want to remove.

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.LiveApi.DELETELiveStreamsLiveStreamId(context.Background(), liveStreamId).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `LiveApi.DELETELiveStreamsLiveStreamId``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**liveStreamId** | **string** | The unique ID for the live stream that you want to remove. | 

### Other Parameters

Other parameters are passed through a pointer to a apiDELETELiveStreamsLiveStreamIdRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

 (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## DELETELiveStreamsLiveStreamIdThumbnail

> LiveStream DELETELiveStreamsLiveStreamIdThumbnail(ctx, liveStreamId).Execute()

Delete a thumbnail



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
    liveStreamId := "li400mYKSgQ6xs7taUeSaEKr" // string | The unique identifier for the live stream you want to delete. 

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.LiveApi.DELETELiveStreamsLiveStreamIdThumbnail(context.Background(), liveStreamId).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `LiveApi.DELETELiveStreamsLiveStreamIdThumbnail``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `DELETELiveStreamsLiveStreamIdThumbnail`: LiveStream
    fmt.Fprintf(os.Stdout, "Response from `LiveApi.DELETELiveStreamsLiveStreamIdThumbnail`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**liveStreamId** | **string** | The unique identifier for the live stream you want to delete.  | 

### Other Parameters

Other parameters are passed through a pointer to a apiDELETELiveStreamsLiveStreamIdThumbnailRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**LiveStream**](LiveStream.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GETLiveStreams

> LiveStreamListResponse GETLiveStreams(ctx).StreamKey(streamKey).Name(name).SortBy(sortBy).SortOrder(sortOrder).CurrentPage(currentPage).PageSize(pageSize).Execute()

List all live streams



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
    streamKey := "30087931-229e-42cf-b5f9-e91bcc1f7332" // string | The unique stream key that allows you to stream videos. (optional)
    name := "My Video" // string | You can filter live streams by their name or a part of their name. (optional)
    sortBy := "createdAt" // string | Allowed: createdAt, publishedAt, name. createdAt - the time a livestream was created using the specified streamKey. publishedAt - the time a livestream was published using the specified streamKey. name - the name of the livestream. If you choose one of the time based options, the time is presented in ISO-8601 format. (optional)
    sortOrder := "desc" // string | Allowed: asc, desc. Ascending for date and time means that earlier values precede later ones. Descending means that later values preced earlier ones. For title, it is 0-9 and A-Z ascending and Z-A, 9-0 descending. (optional)
    currentPage := int32(2) // int32 | Choose the number of search results to return per page. Minimum value: 1 (optional) (default to 1)
    pageSize := int32(30) // int32 | Results per page. Allowed values 1-100, default is 25. (optional) (default to 25)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.LiveApi.GETLiveStreams(context.Background()).StreamKey(streamKey).Name(name).SortBy(sortBy).SortOrder(sortOrder).CurrentPage(currentPage).PageSize(pageSize).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `LiveApi.GETLiveStreams``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GETLiveStreams`: LiveStreamListResponse
    fmt.Fprintf(os.Stdout, "Response from `LiveApi.GETLiveStreams`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGETLiveStreamsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **streamKey** | **string** | The unique stream key that allows you to stream videos. | 
 **name** | **string** | You can filter live streams by their name or a part of their name. | 
 **sortBy** | **string** | Allowed: createdAt, publishedAt, name. createdAt - the time a livestream was created using the specified streamKey. publishedAt - the time a livestream was published using the specified streamKey. name - the name of the livestream. If you choose one of the time based options, the time is presented in ISO-8601 format. | 
 **sortOrder** | **string** | Allowed: asc, desc. Ascending for date and time means that earlier values precede later ones. Descending means that later values preced earlier ones. For title, it is 0-9 and A-Z ascending and Z-A, 9-0 descending. | 
 **currentPage** | **int32** | Choose the number of search results to return per page. Minimum value: 1 | [default to 1]
 **pageSize** | **int32** | Results per page. Allowed values 1-100, default is 25. | [default to 25]

### Return type

[**LiveStreamListResponse**](LiveStreamListResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GETLiveStreamsLiveStreamId

> LiveStream GETLiveStreamsLiveStreamId(ctx, liveStreamId).Execute()

Show live stream



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
    liveStreamId := "li400mYKSgQ6xs7taUeSaEKr" // string | The unique ID for the live stream you want to watch.

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.LiveApi.GETLiveStreamsLiveStreamId(context.Background(), liveStreamId).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `LiveApi.GETLiveStreamsLiveStreamId``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GETLiveStreamsLiveStreamId`: LiveStream
    fmt.Fprintf(os.Stdout, "Response from `LiveApi.GETLiveStreamsLiveStreamId`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**liveStreamId** | **string** | The unique ID for the live stream you want to watch. | 

### Other Parameters

Other parameters are passed through a pointer to a apiGETLiveStreamsLiveStreamIdRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**LiveStream**](LiveStream.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## PATCHLiveStreamsLiveStreamId

> LiveStream PATCHLiveStreamsLiveStreamId(ctx, liveStreamId).LiveStreamUpdatePayload(liveStreamUpdatePayload).Execute()

Update a live stream



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
    liveStreamId := "li400mYKSgQ6xs7taUeSaEKr" // string | The unique ID for the live stream that you want to update information for such as player details, or whether you want the recording on or off.
    liveStreamUpdatePayload := *openapiclient.NewLiveStreamUpdatePayload() // LiveStreamUpdatePayload |  (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.LiveApi.PATCHLiveStreamsLiveStreamId(context.Background(), liveStreamId).LiveStreamUpdatePayload(liveStreamUpdatePayload).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `LiveApi.PATCHLiveStreamsLiveStreamId``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `PATCHLiveStreamsLiveStreamId`: LiveStream
    fmt.Fprintf(os.Stdout, "Response from `LiveApi.PATCHLiveStreamsLiveStreamId`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**liveStreamId** | **string** | The unique ID for the live stream that you want to update information for such as player details, or whether you want the recording on or off. | 

### Other Parameters

Other parameters are passed through a pointer to a apiPATCHLiveStreamsLiveStreamIdRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **liveStreamUpdatePayload** | [**LiveStreamUpdatePayload**](LiveStreamUpdatePayload.md) |  | 

### Return type

[**LiveStream**](LiveStream.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## POSTLiveStreams

> LiveStream POSTLiveStreams(ctx).LiveStreamCreatePayload(liveStreamCreatePayload).Execute()

Create live stream



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
    liveStreamCreatePayload := *openapiclient.NewLiveStreamCreatePayload("My Live Stream Video") // LiveStreamCreatePayload |  (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.LiveApi.POSTLiveStreams(context.Background()).LiveStreamCreatePayload(liveStreamCreatePayload).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `LiveApi.POSTLiveStreams``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `POSTLiveStreams`: LiveStream
    fmt.Fprintf(os.Stdout, "Response from `LiveApi.POSTLiveStreams`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiPOSTLiveStreamsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **liveStreamCreatePayload** | [**LiveStreamCreatePayload**](LiveStreamCreatePayload.md) |  | 

### Return type

[**LiveStream**](LiveStream.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## POSTLiveStreamsLiveStreamIdThumbnail

> LiveStream POSTLiveStreamsLiveStreamIdThumbnail(ctx, liveStreamId).File(file).Execute()

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
    liveStreamId := "vi4k0jvEUuaTdRAEjQ4Jfrgz" // string | The unique ID for the live stream you want to upload.
    file := os.NewFile(1234, "some_file") // *os.File | The image to be added as a thumbnail.

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.LiveApi.POSTLiveStreamsLiveStreamIdThumbnail(context.Background(), liveStreamId).File(file).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `LiveApi.POSTLiveStreamsLiveStreamIdThumbnail``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `POSTLiveStreamsLiveStreamIdThumbnail`: LiveStream
    fmt.Fprintf(os.Stdout, "Response from `LiveApi.POSTLiveStreamsLiveStreamIdThumbnail`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**liveStreamId** | **string** | The unique ID for the live stream you want to upload. | 

### Other Parameters

Other parameters are passed through a pointer to a apiPOSTLiveStreamsLiveStreamIdThumbnailRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **file** | ***os.File** | The image to be added as a thumbnail. | 

### Return type

[**LiveStream**](LiveStream.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

