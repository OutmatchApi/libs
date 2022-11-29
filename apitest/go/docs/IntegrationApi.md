# \IntegrationApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CreateIntegrationApiV1AppAppIdIntegrationPost**](IntegrationApi.md#CreateIntegrationApiV1AppAppIdIntegrationPost) | **Post** /api/v1/app/{app_id}/integration/ | Create Integration
[**DeleteIntegrationApiV1AppAppIdIntegrationIntegIdDelete**](IntegrationApi.md#DeleteIntegrationApiV1AppAppIdIntegrationIntegIdDelete) | **Delete** /api/v1/app/{app_id}/integration/{integ_id}/ | Delete Integration
[**GetIntegrationApiV1AppAppIdIntegrationIntegIdGet**](IntegrationApi.md#GetIntegrationApiV1AppAppIdIntegrationIntegIdGet) | **Get** /api/v1/app/{app_id}/integration/{integ_id}/ | Get Integration
[**GetIntegrationKeyApiV1AppAppIdIntegrationIntegIdKeyGet**](IntegrationApi.md#GetIntegrationKeyApiV1AppAppIdIntegrationIntegIdKeyGet) | **Get** /api/v1/app/{app_id}/integration/{integ_id}/key/ | Get Integration Key
[**ListIntegrationsApiV1AppAppIdIntegrationGet**](IntegrationApi.md#ListIntegrationsApiV1AppAppIdIntegrationGet) | **Get** /api/v1/app/{app_id}/integration/ | List Integrations
[**RotateIntegrationKeyApiV1AppAppIdIntegrationIntegIdKeyRotatePost**](IntegrationApi.md#RotateIntegrationKeyApiV1AppAppIdIntegrationIntegIdKeyRotatePost) | **Post** /api/v1/app/{app_id}/integration/{integ_id}/key/rotate/ | Rotate Integration Key
[**UpdateIntegrationApiV1AppAppIdIntegrationIntegIdPut**](IntegrationApi.md#UpdateIntegrationApiV1AppAppIdIntegrationIntegIdPut) | **Put** /api/v1/app/{app_id}/integration/{integ_id}/ | Update Integration



## CreateIntegrationApiV1AppAppIdIntegrationPost

> IntegrationOut CreateIntegrationApiV1AppAppIdIntegrationPost(ctx, appId).IntegrationIn(integrationIn).IdempotencyKey(idempotencyKey).Execute()

Create Integration



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
    integrationIn := *openapiclient.NewIntegrationIn("Example Integration") // IntegrationIn | 
    idempotencyKey := "idempotencyKey_example" // string | The request's idempotency key (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.IntegrationApi.CreateIntegrationApiV1AppAppIdIntegrationPost(context.Background(), appId).IntegrationIn(integrationIn).IdempotencyKey(idempotencyKey).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `IntegrationApi.CreateIntegrationApiV1AppAppIdIntegrationPost``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `CreateIntegrationApiV1AppAppIdIntegrationPost`: IntegrationOut
    fmt.Fprintf(os.Stdout, "Response from `IntegrationApi.CreateIntegrationApiV1AppAppIdIntegrationPost`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**appId** | **string** |  | 

### Other Parameters

Other parameters are passed through a pointer to a apiCreateIntegrationApiV1AppAppIdIntegrationPostRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **integrationIn** | [**IntegrationIn**](IntegrationIn.md) |  | 
 **idempotencyKey** | **string** | The request&#39;s idempotency key | 

### Return type

[**IntegrationOut**](IntegrationOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## DeleteIntegrationApiV1AppAppIdIntegrationIntegIdDelete

> DeleteIntegrationApiV1AppAppIdIntegrationIntegIdDelete(ctx, integId, appId).IdempotencyKey(idempotencyKey).Execute()

Delete Integration



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
    integId := "integ_1srOrx2ZWZBpBUvZwXKQmoEYga2" // string | 
    appId := "app_1srOrx2ZWZBpBUvZwXKQmoEYga2" // string | 
    idempotencyKey := "idempotencyKey_example" // string | The request's idempotency key (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.IntegrationApi.DeleteIntegrationApiV1AppAppIdIntegrationIntegIdDelete(context.Background(), integId, appId).IdempotencyKey(idempotencyKey).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `IntegrationApi.DeleteIntegrationApiV1AppAppIdIntegrationIntegIdDelete``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**integId** | **string** |  | 
**appId** | **string** |  | 

### Other Parameters

Other parameters are passed through a pointer to a apiDeleteIntegrationApiV1AppAppIdIntegrationIntegIdDeleteRequest struct via the builder pattern


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


## GetIntegrationApiV1AppAppIdIntegrationIntegIdGet

> IntegrationOut GetIntegrationApiV1AppAppIdIntegrationIntegIdGet(ctx, integId, appId).IdempotencyKey(idempotencyKey).Execute()

Get Integration



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
    integId := "integ_1srOrx2ZWZBpBUvZwXKQmoEYga2" // string | 
    appId := "app_1srOrx2ZWZBpBUvZwXKQmoEYga2" // string | 
    idempotencyKey := "idempotencyKey_example" // string | The request's idempotency key (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.IntegrationApi.GetIntegrationApiV1AppAppIdIntegrationIntegIdGet(context.Background(), integId, appId).IdempotencyKey(idempotencyKey).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `IntegrationApi.GetIntegrationApiV1AppAppIdIntegrationIntegIdGet``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetIntegrationApiV1AppAppIdIntegrationIntegIdGet`: IntegrationOut
    fmt.Fprintf(os.Stdout, "Response from `IntegrationApi.GetIntegrationApiV1AppAppIdIntegrationIntegIdGet`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**integId** | **string** |  | 
**appId** | **string** |  | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetIntegrationApiV1AppAppIdIntegrationIntegIdGetRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **idempotencyKey** | **string** | The request&#39;s idempotency key | 

### Return type

[**IntegrationOut**](IntegrationOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetIntegrationKeyApiV1AppAppIdIntegrationIntegIdKeyGet

> IntegrationKeyOut GetIntegrationKeyApiV1AppAppIdIntegrationIntegIdKeyGet(ctx, integId, appId).IdempotencyKey(idempotencyKey).Execute()

Get Integration Key



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
    integId := "integ_1srOrx2ZWZBpBUvZwXKQmoEYga2" // string | 
    appId := "app_1srOrx2ZWZBpBUvZwXKQmoEYga2" // string | 
    idempotencyKey := "idempotencyKey_example" // string | The request's idempotency key (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.IntegrationApi.GetIntegrationKeyApiV1AppAppIdIntegrationIntegIdKeyGet(context.Background(), integId, appId).IdempotencyKey(idempotencyKey).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `IntegrationApi.GetIntegrationKeyApiV1AppAppIdIntegrationIntegIdKeyGet``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetIntegrationKeyApiV1AppAppIdIntegrationIntegIdKeyGet`: IntegrationKeyOut
    fmt.Fprintf(os.Stdout, "Response from `IntegrationApi.GetIntegrationKeyApiV1AppAppIdIntegrationIntegIdKeyGet`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**integId** | **string** |  | 
**appId** | **string** |  | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetIntegrationKeyApiV1AppAppIdIntegrationIntegIdKeyGetRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **idempotencyKey** | **string** | The request&#39;s idempotency key | 

### Return type

[**IntegrationKeyOut**](IntegrationKeyOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ListIntegrationsApiV1AppAppIdIntegrationGet

> ListResponseIntegrationOut ListIntegrationsApiV1AppAppIdIntegrationGet(ctx, appId).Iterator(iterator).Limit(limit).IdempotencyKey(idempotencyKey).Execute()

List Integrations



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
    iterator := "integ_1srOrx2ZWZBpBUvZwXKQmoEYga2" // string |  (optional)
    limit := int32(56) // int32 |  (optional) (default to 50)
    idempotencyKey := "idempotencyKey_example" // string | The request's idempotency key (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.IntegrationApi.ListIntegrationsApiV1AppAppIdIntegrationGet(context.Background(), appId).Iterator(iterator).Limit(limit).IdempotencyKey(idempotencyKey).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `IntegrationApi.ListIntegrationsApiV1AppAppIdIntegrationGet``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `ListIntegrationsApiV1AppAppIdIntegrationGet`: ListResponseIntegrationOut
    fmt.Fprintf(os.Stdout, "Response from `IntegrationApi.ListIntegrationsApiV1AppAppIdIntegrationGet`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**appId** | **string** |  | 

### Other Parameters

Other parameters are passed through a pointer to a apiListIntegrationsApiV1AppAppIdIntegrationGetRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **iterator** | **string** |  | 
 **limit** | **int32** |  | [default to 50]
 **idempotencyKey** | **string** | The request&#39;s idempotency key | 

### Return type

[**ListResponseIntegrationOut**](ListResponseIntegrationOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## RotateIntegrationKeyApiV1AppAppIdIntegrationIntegIdKeyRotatePost

> IntegrationKeyOut RotateIntegrationKeyApiV1AppAppIdIntegrationIntegIdKeyRotatePost(ctx, integId, appId).IdempotencyKey(idempotencyKey).Execute()

Rotate Integration Key



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
    integId := "integ_1srOrx2ZWZBpBUvZwXKQmoEYga2" // string | 
    appId := "app_1srOrx2ZWZBpBUvZwXKQmoEYga2" // string | 
    idempotencyKey := "idempotencyKey_example" // string | The request's idempotency key (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.IntegrationApi.RotateIntegrationKeyApiV1AppAppIdIntegrationIntegIdKeyRotatePost(context.Background(), integId, appId).IdempotencyKey(idempotencyKey).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `IntegrationApi.RotateIntegrationKeyApiV1AppAppIdIntegrationIntegIdKeyRotatePost``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `RotateIntegrationKeyApiV1AppAppIdIntegrationIntegIdKeyRotatePost`: IntegrationKeyOut
    fmt.Fprintf(os.Stdout, "Response from `IntegrationApi.RotateIntegrationKeyApiV1AppAppIdIntegrationIntegIdKeyRotatePost`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**integId** | **string** |  | 
**appId** | **string** |  | 

### Other Parameters

Other parameters are passed through a pointer to a apiRotateIntegrationKeyApiV1AppAppIdIntegrationIntegIdKeyRotatePostRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **idempotencyKey** | **string** | The request&#39;s idempotency key | 

### Return type

[**IntegrationKeyOut**](IntegrationKeyOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## UpdateIntegrationApiV1AppAppIdIntegrationIntegIdPut

> IntegrationOut UpdateIntegrationApiV1AppAppIdIntegrationIntegIdPut(ctx, integId, appId).IntegrationUpdate(integrationUpdate).IdempotencyKey(idempotencyKey).Execute()

Update Integration



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
    integId := "integ_1srOrx2ZWZBpBUvZwXKQmoEYga2" // string | 
    appId := "app_1srOrx2ZWZBpBUvZwXKQmoEYga2" // string | 
    integrationUpdate := *openapiclient.NewIntegrationUpdate("Example Integration") // IntegrationUpdate | 
    idempotencyKey := "idempotencyKey_example" // string | The request's idempotency key (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.IntegrationApi.UpdateIntegrationApiV1AppAppIdIntegrationIntegIdPut(context.Background(), integId, appId).IntegrationUpdate(integrationUpdate).IdempotencyKey(idempotencyKey).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `IntegrationApi.UpdateIntegrationApiV1AppAppIdIntegrationIntegIdPut``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `UpdateIntegrationApiV1AppAppIdIntegrationIntegIdPut`: IntegrationOut
    fmt.Fprintf(os.Stdout, "Response from `IntegrationApi.UpdateIntegrationApiV1AppAppIdIntegrationIntegIdPut`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**integId** | **string** |  | 
**appId** | **string** |  | 

### Other Parameters

Other parameters are passed through a pointer to a apiUpdateIntegrationApiV1AppAppIdIntegrationIntegIdPutRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **integrationUpdate** | [**IntegrationUpdate**](IntegrationUpdate.md) |  | 
 **idempotencyKey** | **string** | The request&#39;s idempotency key | 

### Return type

[**IntegrationOut**](IntegrationOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

