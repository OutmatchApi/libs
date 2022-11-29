# \ApplicationApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CreateApplicationApiV1AppPost**](ApplicationApi.md#CreateApplicationApiV1AppPost) | **Post** /api/v1/app/ | Create Application
[**DeleteApplicationApiV1AppAppIdDelete**](ApplicationApi.md#DeleteApplicationApiV1AppAppIdDelete) | **Delete** /api/v1/app/{app_id}/ | Delete Application
[**GetApplicationApiV1AppAppIdGet**](ApplicationApi.md#GetApplicationApiV1AppAppIdGet) | **Get** /api/v1/app/{app_id}/ | Get Application
[**ListApplicationsApiV1AppGet**](ApplicationApi.md#ListApplicationsApiV1AppGet) | **Get** /api/v1/app/ | List Applications
[**UpdateApplicationApiV1AppAppIdPut**](ApplicationApi.md#UpdateApplicationApiV1AppAppIdPut) | **Put** /api/v1/app/{app_id}/ | Update Application



## CreateApplicationApiV1AppPost

> ApplicationOut CreateApplicationApiV1AppPost(ctx).ApplicationIn(applicationIn).GetIfExists(getIfExists).IdempotencyKey(idempotencyKey).Execute()

Create Application



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
    applicationIn := *openapiclient.NewApplicationIn("My first application") // ApplicationIn | 
    getIfExists := true // bool | Get an existing application, or create a new one if doesn't exist. It's two separate functions in the libs. (optional) (default to false)
    idempotencyKey := "idempotencyKey_example" // string | The request's idempotency key (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.ApplicationApi.CreateApplicationApiV1AppPost(context.Background()).ApplicationIn(applicationIn).GetIfExists(getIfExists).IdempotencyKey(idempotencyKey).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `ApplicationApi.CreateApplicationApiV1AppPost``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `CreateApplicationApiV1AppPost`: ApplicationOut
    fmt.Fprintf(os.Stdout, "Response from `ApplicationApi.CreateApplicationApiV1AppPost`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCreateApplicationApiV1AppPostRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicationIn** | [**ApplicationIn**](ApplicationIn.md) |  | 
 **getIfExists** | **bool** | Get an existing application, or create a new one if doesn&#39;t exist. It&#39;s two separate functions in the libs. | [default to false]
 **idempotencyKey** | **string** | The request&#39;s idempotency key | 

### Return type

[**ApplicationOut**](ApplicationOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## DeleteApplicationApiV1AppAppIdDelete

> DeleteApplicationApiV1AppAppIdDelete(ctx, appId).IdempotencyKey(idempotencyKey).Execute()

Delete Application



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
    appId := "app_1srOrx2ZWZBpBUvZwXKQmoEYga2" // string | 
    idempotencyKey := "idempotencyKey_example" // string | The request's idempotency key (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.ApplicationApi.DeleteApplicationApiV1AppAppIdDelete(context.Background(), appId).IdempotencyKey(idempotencyKey).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `ApplicationApi.DeleteApplicationApiV1AppAppIdDelete``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**appId** | **string** |  | 

### Other Parameters

Other parameters are passed through a pointer to a apiDeleteApplicationApiV1AppAppIdDeleteRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **idempotencyKey** | **string** | The request&#39;s idempotency key | 

### Return type

 (empty response body)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetApplicationApiV1AppAppIdGet

> ApplicationOut GetApplicationApiV1AppAppIdGet(ctx, appId).IdempotencyKey(idempotencyKey).Execute()

Get Application



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
    appId := "app_1srOrx2ZWZBpBUvZwXKQmoEYga2" // string | 
    idempotencyKey := "idempotencyKey_example" // string | The request's idempotency key (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.ApplicationApi.GetApplicationApiV1AppAppIdGet(context.Background(), appId).IdempotencyKey(idempotencyKey).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `ApplicationApi.GetApplicationApiV1AppAppIdGet``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetApplicationApiV1AppAppIdGet`: ApplicationOut
    fmt.Fprintf(os.Stdout, "Response from `ApplicationApi.GetApplicationApiV1AppAppIdGet`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**appId** | **string** |  | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetApplicationApiV1AppAppIdGetRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **idempotencyKey** | **string** | The request&#39;s idempotency key | 

### Return type

[**ApplicationOut**](ApplicationOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ListApplicationsApiV1AppGet

> ListResponseApplicationOut ListApplicationsApiV1AppGet(ctx).Iterator(iterator).Limit(limit).IdempotencyKey(idempotencyKey).Execute()

List Applications



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
    iterator := "app_1srOrx2ZWZBpBUvZwXKQmoEYga2" // string |  (optional)
    limit := int32(56) // int32 |  (optional) (default to 50)
    idempotencyKey := "idempotencyKey_example" // string | The request's idempotency key (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.ApplicationApi.ListApplicationsApiV1AppGet(context.Background()).Iterator(iterator).Limit(limit).IdempotencyKey(idempotencyKey).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `ApplicationApi.ListApplicationsApiV1AppGet``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `ListApplicationsApiV1AppGet`: ListResponseApplicationOut
    fmt.Fprintf(os.Stdout, "Response from `ApplicationApi.ListApplicationsApiV1AppGet`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiListApplicationsApiV1AppGetRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **iterator** | **string** |  | 
 **limit** | **int32** |  | [default to 50]
 **idempotencyKey** | **string** | The request&#39;s idempotency key | 

### Return type

[**ListResponseApplicationOut**](ListResponseApplicationOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## UpdateApplicationApiV1AppAppIdPut

> ApplicationOut UpdateApplicationApiV1AppAppIdPut(ctx, appId).ApplicationIn(applicationIn).IdempotencyKey(idempotencyKey).Execute()

Update Application



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
    appId := "app_1srOrx2ZWZBpBUvZwXKQmoEYga2" // string | 
    applicationIn := *openapiclient.NewApplicationIn("My first application") // ApplicationIn | 
    idempotencyKey := "idempotencyKey_example" // string | The request's idempotency key (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.ApplicationApi.UpdateApplicationApiV1AppAppIdPut(context.Background(), appId).ApplicationIn(applicationIn).IdempotencyKey(idempotencyKey).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `ApplicationApi.UpdateApplicationApiV1AppAppIdPut``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `UpdateApplicationApiV1AppAppIdPut`: ApplicationOut
    fmt.Fprintf(os.Stdout, "Response from `ApplicationApi.UpdateApplicationApiV1AppAppIdPut`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**appId** | **string** |  | 

### Other Parameters

Other parameters are passed through a pointer to a apiUpdateApplicationApiV1AppAppIdPutRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **applicationIn** | [**ApplicationIn**](ApplicationIn.md) |  | 
 **idempotencyKey** | **string** | The request&#39;s idempotency key | 

### Return type

[**ApplicationOut**](ApplicationOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

