# \ApiAppApi

All URIs are relative to *http://localhost:8000*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CreateApiApp**](ApiAppApi.md#CreateApiApp) | **Post** /apiApp | Create api app
[**CreateApiAppRelease**](ApiAppApi.md#CreateApiAppRelease) | **Post** /apiApp/{id}/release | Create api app release
[**CreateApiAppReleaseSdks**](ApiAppApi.md#CreateApiAppReleaseSdks) | **Post** /apiApp/{id}/release/{id}/sdk | Generate sdks for a relase



## CreateApiApp

> ApiApp CreateApiApp(ctx).ApiAppRequest(apiAppRequest).Execute()

Create api app



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
    apiAppRequest := *openapiclient.NewApiAppRequest() // ApiAppRequest | Created api app object (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.ApiAppApi.CreateApiApp(context.Background()).ApiAppRequest(apiAppRequest).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `ApiAppApi.CreateApiApp``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `CreateApiApp`: ApiApp
    fmt.Fprintf(os.Stdout, "Response from `ApiAppApi.CreateApiApp`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCreateApiAppRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiAppRequest** | [**ApiAppRequest**](ApiAppRequest.md) | Created api app object | 

### Return type

[**ApiApp**](ApiApp.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CreateApiAppRelease

> Release CreateApiAppRelease(ctx).ReleaseRequest(releaseRequest).Execute()

Create api app release



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
    releaseRequest := *openapiclient.NewReleaseRequest() // ReleaseRequest | Created release object (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.ApiAppApi.CreateApiAppRelease(context.Background()).ReleaseRequest(releaseRequest).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `ApiAppApi.CreateApiAppRelease``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `CreateApiAppRelease`: Release
    fmt.Fprintf(os.Stdout, "Response from `ApiAppApi.CreateApiAppRelease`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCreateApiAppReleaseRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **releaseRequest** | [**ReleaseRequest**](ReleaseRequest.md) | Created release object | 

### Return type

[**Release**](Release.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CreateApiAppReleaseSdks

> SdkResponse CreateApiAppReleaseSdks(ctx).SdkRequest(sdkRequest).Execute()

Generate sdks for a relase



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
    sdkRequest := *openapiclient.NewSdkRequest() // SdkRequest | Created sdks objects (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.ApiAppApi.CreateApiAppReleaseSdks(context.Background()).SdkRequest(sdkRequest).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `ApiAppApi.CreateApiAppReleaseSdks``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `CreateApiAppReleaseSdks`: SdkResponse
    fmt.Fprintf(os.Stdout, "Response from `ApiAppApi.CreateApiAppReleaseSdks`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCreateApiAppReleaseSdksRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sdkRequest** | [**SdkRequest**](SdkRequest.md) | Created sdks objects | 

### Return type

[**SdkResponse**](SdkResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

