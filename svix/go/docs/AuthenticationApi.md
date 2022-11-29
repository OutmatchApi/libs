# \AuthenticationApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ExpireAllApiV1AuthAppAppIdExpireAllPost**](AuthenticationApi.md#ExpireAllApiV1AuthAppAppIdExpireAllPost) | **Post** /api/v1/auth/app/{app_id}/expire-all/ | Expire All
[**GetDashboardAccessApiV1AuthDashboardAccessAppIdPost**](AuthenticationApi.md#GetDashboardAccessApiV1AuthDashboardAccessAppIdPost) | **Post** /api/v1/auth/dashboard-access/{app_id}/ | Get Consumer App Portal Access
[**LogoutApiV1AuthLogoutPost**](AuthenticationApi.md#LogoutApiV1AuthLogoutPost) | **Post** /api/v1/auth/logout/ | Logout



## ExpireAllApiV1AuthAppAppIdExpireAllPost

> ExpireAllApiV1AuthAppAppIdExpireAllPost(ctx, appId).ApplicationTokenExpireIn(applicationTokenExpireIn).IdempotencyKey(idempotencyKey).Execute()

Expire All



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
    applicationTokenExpireIn := *openapiclient.NewApplicationTokenExpireIn() // ApplicationTokenExpireIn | 
    idempotencyKey := "idempotencyKey_example" // string | The request's idempotency key (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.AuthenticationApi.ExpireAllApiV1AuthAppAppIdExpireAllPost(context.Background(), appId).ApplicationTokenExpireIn(applicationTokenExpireIn).IdempotencyKey(idempotencyKey).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `AuthenticationApi.ExpireAllApiV1AuthAppAppIdExpireAllPost``: %v\n", err)
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

Other parameters are passed through a pointer to a apiExpireAllApiV1AuthAppAppIdExpireAllPostRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **applicationTokenExpireIn** | [**ApplicationTokenExpireIn**](ApplicationTokenExpireIn.md) |  | 
 **idempotencyKey** | **string** | The request&#39;s idempotency key | 

### Return type

 (empty response body)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetDashboardAccessApiV1AuthDashboardAccessAppIdPost

> DashboardAccessOut GetDashboardAccessApiV1AuthDashboardAccessAppIdPost(ctx, appId).IdempotencyKey(idempotencyKey).Execute()

Get Consumer App Portal Access



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
    resp, r, err := apiClient.AuthenticationApi.GetDashboardAccessApiV1AuthDashboardAccessAppIdPost(context.Background(), appId).IdempotencyKey(idempotencyKey).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `AuthenticationApi.GetDashboardAccessApiV1AuthDashboardAccessAppIdPost``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetDashboardAccessApiV1AuthDashboardAccessAppIdPost`: DashboardAccessOut
    fmt.Fprintf(os.Stdout, "Response from `AuthenticationApi.GetDashboardAccessApiV1AuthDashboardAccessAppIdPost`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**appId** | **string** |  | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetDashboardAccessApiV1AuthDashboardAccessAppIdPostRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **idempotencyKey** | **string** | The request&#39;s idempotency key | 

### Return type

[**DashboardAccessOut**](DashboardAccessOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## LogoutApiV1AuthLogoutPost

> LogoutApiV1AuthLogoutPost(ctx).IdempotencyKey(idempotencyKey).Execute()

Logout



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
    idempotencyKey := "idempotencyKey_example" // string | The request's idempotency key (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.AuthenticationApi.LogoutApiV1AuthLogoutPost(context.Background()).IdempotencyKey(idempotencyKey).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `AuthenticationApi.LogoutApiV1AuthLogoutPost``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiLogoutApiV1AuthLogoutPostRequest struct via the builder pattern


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

