# \ApiAppApi

All URIs are relative to *https://api.outmatchapi.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CreateApiApp**](ApiAppApi.md#CreateApiApp) | **Post** /apiApp | Create api app
[**CreateApiAppRelease**](ApiAppApi.md#CreateApiAppRelease) | **Post** /apiApp/{app_id}/release | Create api app release
[**CreateApiAppReleaseSdks**](ApiAppApi.md#CreateApiAppReleaseSdks) | **Post** /apiApp/{app_id}/release/{release_version}/sdk | Generate sdks for a relase



## CreateApiApp

> ApiApp CreateApiApp(ctx).CreateApiAppRequest(createApiAppRequest).Execute()

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
    createApiAppRequest := *openapiclient.NewCreateApiAppRequest("My Api") // CreateApiAppRequest |  (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.ApiAppApi.CreateApiApp(context.Background()).CreateApiAppRequest(createApiAppRequest).Execute()
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
 **createApiAppRequest** | [**CreateApiAppRequest**](CreateApiAppRequest.md) |  | 

### Return type

[**ApiApp**](ApiApp.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CreateApiAppRelease

> Release CreateApiAppRelease(ctx, appId).Body(body).Execute()

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
    appId := "appId_example" // string | app id to associate the release with
    body := "body_example" // string | Created release object (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.ApiAppApi.CreateApiAppRelease(context.Background(), appId).Body(body).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `ApiAppApi.CreateApiAppRelease``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `CreateApiAppRelease`: Release
    fmt.Fprintf(os.Stdout, "Response from `ApiAppApi.CreateApiAppRelease`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**appId** | **string** | app id to associate the release with | 

### Other Parameters

Other parameters are passed through a pointer to a apiCreateApiAppReleaseRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **body** | **string** | Created release object | 

### Return type

[**Release**](Release.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: text/plain
- **Accept**: application/json, application/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CreateApiAppReleaseSdks

> []Sdk CreateApiAppReleaseSdks(ctx, appId, releaseVersion).CreateApiAppReleaseSdksRequest(createApiAppReleaseSdksRequest).Execute()

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
    appId := "appId_example" // string | app id
    releaseVersion := "1.0.0" // string | release id
    createApiAppReleaseSdksRequest := *openapiclient.NewCreateApiAppReleaseSdksRequest([]openapiclient.Language{openapiclient.Language("go")}) // CreateApiAppReleaseSdksRequest |  (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.ApiAppApi.CreateApiAppReleaseSdks(context.Background(), appId, releaseVersion).CreateApiAppReleaseSdksRequest(createApiAppReleaseSdksRequest).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `ApiAppApi.CreateApiAppReleaseSdks``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `CreateApiAppReleaseSdks`: []Sdk
    fmt.Fprintf(os.Stdout, "Response from `ApiAppApi.CreateApiAppReleaseSdks`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**appId** | **string** | app id | 
**releaseVersion** | **string** | release id | 

### Other Parameters

Other parameters are passed through a pointer to a apiCreateApiAppReleaseSdksRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **createApiAppReleaseSdksRequest** | [**CreateApiAppReleaseSdksRequest**](CreateApiAppReleaseSdksRequest.md) |  | 

### Return type

[**[]Sdk**](Sdk.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

