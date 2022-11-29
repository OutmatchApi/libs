# \EndpointApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CreateEndpointApiV1AppAppIdEndpointPost**](EndpointApi.md#CreateEndpointApiV1AppAppIdEndpointPost) | **Post** /api/v1/app/{app_id}/endpoint/ | Create Endpoint
[**DeleteEndpointApiV1AppAppIdEndpointEndpointIdDelete**](EndpointApi.md#DeleteEndpointApiV1AppAppIdEndpointEndpointIdDelete) | **Delete** /api/v1/app/{app_id}/endpoint/{endpoint_id}/ | Delete Endpoint
[**GetEndpointApiV1AppAppIdEndpointEndpointIdGet**](EndpointApi.md#GetEndpointApiV1AppAppIdEndpointEndpointIdGet) | **Get** /api/v1/app/{app_id}/endpoint/{endpoint_id}/ | Get Endpoint
[**GetEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersGet**](EndpointApi.md#GetEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersGet) | **Get** /api/v1/app/{app_id}/endpoint/{endpoint_id}/headers/ | Get Endpoint Headers
[**GetEndpointSecretApiV1AppAppIdEndpointEndpointIdSecretGet**](EndpointApi.md#GetEndpointSecretApiV1AppAppIdEndpointEndpointIdSecretGet) | **Get** /api/v1/app/{app_id}/endpoint/{endpoint_id}/secret/ | Get Endpoint Secret
[**GetEndpointStatsApiV1AppAppIdEndpointEndpointIdStatsGet**](EndpointApi.md#GetEndpointStatsApiV1AppAppIdEndpointEndpointIdStatsGet) | **Get** /api/v1/app/{app_id}/endpoint/{endpoint_id}/stats/ | Get Endpoint Stats
[**ListEndpointsApiV1AppAppIdEndpointGet**](EndpointApi.md#ListEndpointsApiV1AppAppIdEndpointGet) | **Get** /api/v1/app/{app_id}/endpoint/ | List Endpoints
[**PatchEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersPatch**](EndpointApi.md#PatchEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersPatch) | **Patch** /api/v1/app/{app_id}/endpoint/{endpoint_id}/headers/ | Patch Endpoint Headers
[**RecoverFailedWebhooksApiV1AppAppIdEndpointEndpointIdRecoverPost**](EndpointApi.md#RecoverFailedWebhooksApiV1AppAppIdEndpointEndpointIdRecoverPost) | **Post** /api/v1/app/{app_id}/endpoint/{endpoint_id}/recover/ | Recover Failed Webhooks
[**ReplayMissingWebhooksApiV1AppAppIdEndpointEndpointIdReplayMissingPost**](EndpointApi.md#ReplayMissingWebhooksApiV1AppAppIdEndpointEndpointIdReplayMissingPost) | **Post** /api/v1/app/{app_id}/endpoint/{endpoint_id}/replay-missing/ | Replay Missing Webhooks
[**RotateEndpointSecretApiV1AppAppIdEndpointEndpointIdSecretRotatePost**](EndpointApi.md#RotateEndpointSecretApiV1AppAppIdEndpointEndpointIdSecretRotatePost) | **Post** /api/v1/app/{app_id}/endpoint/{endpoint_id}/secret/rotate/ | Rotate Endpoint Secret
[**UpdateEndpointApiV1AppAppIdEndpointEndpointIdPut**](EndpointApi.md#UpdateEndpointApiV1AppAppIdEndpointEndpointIdPut) | **Put** /api/v1/app/{app_id}/endpoint/{endpoint_id}/ | Update Endpoint
[**UpdateEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersPut**](EndpointApi.md#UpdateEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersPut) | **Put** /api/v1/app/{app_id}/endpoint/{endpoint_id}/headers/ | Update Endpoint Headers



## CreateEndpointApiV1AppAppIdEndpointPost

> EndpointOut CreateEndpointApiV1AppAppIdEndpointPost(ctx, appId).EndpointIn(endpointIn).IdempotencyKey(idempotencyKey).Execute()

Create Endpoint



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
    endpointIn := *openapiclient.NewEndpointIn("https://example.com/webhook/", int32(1)) // EndpointIn | 
    idempotencyKey := "idempotencyKey_example" // string | The request's idempotency key (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.EndpointApi.CreateEndpointApiV1AppAppIdEndpointPost(context.Background(), appId).EndpointIn(endpointIn).IdempotencyKey(idempotencyKey).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `EndpointApi.CreateEndpointApiV1AppAppIdEndpointPost``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `CreateEndpointApiV1AppAppIdEndpointPost`: EndpointOut
    fmt.Fprintf(os.Stdout, "Response from `EndpointApi.CreateEndpointApiV1AppAppIdEndpointPost`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**appId** | **string** |  | 

### Other Parameters

Other parameters are passed through a pointer to a apiCreateEndpointApiV1AppAppIdEndpointPostRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **endpointIn** | [**EndpointIn**](EndpointIn.md) |  | 
 **idempotencyKey** | **string** | The request&#39;s idempotency key | 

### Return type

[**EndpointOut**](EndpointOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## DeleteEndpointApiV1AppAppIdEndpointEndpointIdDelete

> DeleteEndpointApiV1AppAppIdEndpointEndpointIdDelete(ctx, endpointId, appId).IdempotencyKey(idempotencyKey).Execute()

Delete Endpoint



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
    endpointId := "ep_1srOrx2ZWZBpBUvZwXKQmoEYga2" // string | 
    appId := "app_1srOrx2ZWZBpBUvZwXKQmoEYga2" // string | 
    idempotencyKey := "idempotencyKey_example" // string | The request's idempotency key (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.EndpointApi.DeleteEndpointApiV1AppAppIdEndpointEndpointIdDelete(context.Background(), endpointId, appId).IdempotencyKey(idempotencyKey).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `EndpointApi.DeleteEndpointApiV1AppAppIdEndpointEndpointIdDelete``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**endpointId** | **string** |  | 
**appId** | **string** |  | 

### Other Parameters

Other parameters are passed through a pointer to a apiDeleteEndpointApiV1AppAppIdEndpointEndpointIdDeleteRequest struct via the builder pattern


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


## GetEndpointApiV1AppAppIdEndpointEndpointIdGet

> EndpointOut GetEndpointApiV1AppAppIdEndpointEndpointIdGet(ctx, endpointId, appId).IdempotencyKey(idempotencyKey).Execute()

Get Endpoint



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
    endpointId := "ep_1srOrx2ZWZBpBUvZwXKQmoEYga2" // string | 
    appId := "app_1srOrx2ZWZBpBUvZwXKQmoEYga2" // string | 
    idempotencyKey := "idempotencyKey_example" // string | The request's idempotency key (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.EndpointApi.GetEndpointApiV1AppAppIdEndpointEndpointIdGet(context.Background(), endpointId, appId).IdempotencyKey(idempotencyKey).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `EndpointApi.GetEndpointApiV1AppAppIdEndpointEndpointIdGet``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetEndpointApiV1AppAppIdEndpointEndpointIdGet`: EndpointOut
    fmt.Fprintf(os.Stdout, "Response from `EndpointApi.GetEndpointApiV1AppAppIdEndpointEndpointIdGet`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**endpointId** | **string** |  | 
**appId** | **string** |  | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetEndpointApiV1AppAppIdEndpointEndpointIdGetRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **idempotencyKey** | **string** | The request&#39;s idempotency key | 

### Return type

[**EndpointOut**](EndpointOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersGet

> EndpointHeadersOut GetEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersGet(ctx, endpointId, appId).IdempotencyKey(idempotencyKey).Execute()

Get Endpoint Headers



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
    endpointId := "ep_1srOrx2ZWZBpBUvZwXKQmoEYga2" // string | 
    appId := "app_1srOrx2ZWZBpBUvZwXKQmoEYga2" // string | 
    idempotencyKey := "idempotencyKey_example" // string | The request's idempotency key (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.EndpointApi.GetEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersGet(context.Background(), endpointId, appId).IdempotencyKey(idempotencyKey).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `EndpointApi.GetEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersGet``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersGet`: EndpointHeadersOut
    fmt.Fprintf(os.Stdout, "Response from `EndpointApi.GetEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersGet`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**endpointId** | **string** |  | 
**appId** | **string** |  | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersGetRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **idempotencyKey** | **string** | The request&#39;s idempotency key | 

### Return type

[**EndpointHeadersOut**](EndpointHeadersOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetEndpointSecretApiV1AppAppIdEndpointEndpointIdSecretGet

> EndpointSecretOut GetEndpointSecretApiV1AppAppIdEndpointEndpointIdSecretGet(ctx, endpointId, appId).IdempotencyKey(idempotencyKey).Execute()

Get Endpoint Secret



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
    endpointId := "ep_1srOrx2ZWZBpBUvZwXKQmoEYga2" // string | 
    appId := "app_1srOrx2ZWZBpBUvZwXKQmoEYga2" // string | 
    idempotencyKey := "idempotencyKey_example" // string | The request's idempotency key (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.EndpointApi.GetEndpointSecretApiV1AppAppIdEndpointEndpointIdSecretGet(context.Background(), endpointId, appId).IdempotencyKey(idempotencyKey).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `EndpointApi.GetEndpointSecretApiV1AppAppIdEndpointEndpointIdSecretGet``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetEndpointSecretApiV1AppAppIdEndpointEndpointIdSecretGet`: EndpointSecretOut
    fmt.Fprintf(os.Stdout, "Response from `EndpointApi.GetEndpointSecretApiV1AppAppIdEndpointEndpointIdSecretGet`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**endpointId** | **string** |  | 
**appId** | **string** |  | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetEndpointSecretApiV1AppAppIdEndpointEndpointIdSecretGetRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **idempotencyKey** | **string** | The request&#39;s idempotency key | 

### Return type

[**EndpointSecretOut**](EndpointSecretOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetEndpointStatsApiV1AppAppIdEndpointEndpointIdStatsGet

> EndpointStats GetEndpointStatsApiV1AppAppIdEndpointEndpointIdStatsGet(ctx, endpointId, appId).IdempotencyKey(idempotencyKey).Execute()

Get Endpoint Stats



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
    endpointId := "ep_1srOrx2ZWZBpBUvZwXKQmoEYga2" // string | 
    appId := "app_1srOrx2ZWZBpBUvZwXKQmoEYga2" // string | 
    idempotencyKey := "idempotencyKey_example" // string | The request's idempotency key (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.EndpointApi.GetEndpointStatsApiV1AppAppIdEndpointEndpointIdStatsGet(context.Background(), endpointId, appId).IdempotencyKey(idempotencyKey).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `EndpointApi.GetEndpointStatsApiV1AppAppIdEndpointEndpointIdStatsGet``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetEndpointStatsApiV1AppAppIdEndpointEndpointIdStatsGet`: EndpointStats
    fmt.Fprintf(os.Stdout, "Response from `EndpointApi.GetEndpointStatsApiV1AppAppIdEndpointEndpointIdStatsGet`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**endpointId** | **string** |  | 
**appId** | **string** |  | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetEndpointStatsApiV1AppAppIdEndpointEndpointIdStatsGetRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **idempotencyKey** | **string** | The request&#39;s idempotency key | 

### Return type

[**EndpointStats**](EndpointStats.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ListEndpointsApiV1AppAppIdEndpointGet

> ListResponseEndpointOut ListEndpointsApiV1AppAppIdEndpointGet(ctx, appId).Iterator(iterator).Limit(limit).IdempotencyKey(idempotencyKey).Execute()

List Endpoints



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
    iterator := "ep_1srOrx2ZWZBpBUvZwXKQmoEYga2" // string |  (optional)
    limit := int32(56) // int32 |  (optional) (default to 50)
    idempotencyKey := "idempotencyKey_example" // string | The request's idempotency key (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.EndpointApi.ListEndpointsApiV1AppAppIdEndpointGet(context.Background(), appId).Iterator(iterator).Limit(limit).IdempotencyKey(idempotencyKey).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `EndpointApi.ListEndpointsApiV1AppAppIdEndpointGet``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `ListEndpointsApiV1AppAppIdEndpointGet`: ListResponseEndpointOut
    fmt.Fprintf(os.Stdout, "Response from `EndpointApi.ListEndpointsApiV1AppAppIdEndpointGet`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**appId** | **string** |  | 

### Other Parameters

Other parameters are passed through a pointer to a apiListEndpointsApiV1AppAppIdEndpointGetRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **iterator** | **string** |  | 
 **limit** | **int32** |  | [default to 50]
 **idempotencyKey** | **string** | The request&#39;s idempotency key | 

### Return type

[**ListResponseEndpointOut**](ListResponseEndpointOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## PatchEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersPatch

> PatchEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersPatch(ctx, appId, endpointId).EndpointHeadersPatchIn(endpointHeadersPatchIn).IdempotencyKey(idempotencyKey).Execute()

Patch Endpoint Headers



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
    endpointId := "ep_1srOrx2ZWZBpBUvZwXKQmoEYga2" // string | 
    endpointHeadersPatchIn := *openapiclient.NewEndpointHeadersPatchIn(map[string]string{"key": "Inner_example"}) // EndpointHeadersPatchIn | 
    idempotencyKey := "idempotencyKey_example" // string | The request's idempotency key (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.EndpointApi.PatchEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersPatch(context.Background(), appId, endpointId).EndpointHeadersPatchIn(endpointHeadersPatchIn).IdempotencyKey(idempotencyKey).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `EndpointApi.PatchEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersPatch``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**appId** | **string** |  | 
**endpointId** | **string** |  | 

### Other Parameters

Other parameters are passed through a pointer to a apiPatchEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersPatchRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **endpointHeadersPatchIn** | [**EndpointHeadersPatchIn**](EndpointHeadersPatchIn.md) |  | 
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


## RecoverFailedWebhooksApiV1AppAppIdEndpointEndpointIdRecoverPost

> map[string]interface{} RecoverFailedWebhooksApiV1AppAppIdEndpointEndpointIdRecoverPost(ctx, appId, endpointId).RecoverIn(recoverIn).IdempotencyKey(idempotencyKey).Execute()

Recover Failed Webhooks



### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    "time"
    openapiclient "./openapi"
)

func main() {
    appId := "app_1srOrx2ZWZBpBUvZwXKQmoEYga2" // string | 
    endpointId := "ep_1srOrx2ZWZBpBUvZwXKQmoEYga2" // string | 
    recoverIn := *openapiclient.NewRecoverIn(time.Now()) // RecoverIn | 
    idempotencyKey := "idempotencyKey_example" // string | The request's idempotency key (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.EndpointApi.RecoverFailedWebhooksApiV1AppAppIdEndpointEndpointIdRecoverPost(context.Background(), appId, endpointId).RecoverIn(recoverIn).IdempotencyKey(idempotencyKey).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `EndpointApi.RecoverFailedWebhooksApiV1AppAppIdEndpointEndpointIdRecoverPost``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `RecoverFailedWebhooksApiV1AppAppIdEndpointEndpointIdRecoverPost`: map[string]interface{}
    fmt.Fprintf(os.Stdout, "Response from `EndpointApi.RecoverFailedWebhooksApiV1AppAppIdEndpointEndpointIdRecoverPost`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**appId** | **string** |  | 
**endpointId** | **string** |  | 

### Other Parameters

Other parameters are passed through a pointer to a apiRecoverFailedWebhooksApiV1AppAppIdEndpointEndpointIdRecoverPostRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **recoverIn** | [**RecoverIn**](RecoverIn.md) |  | 
 **idempotencyKey** | **string** | The request&#39;s idempotency key | 

### Return type

**map[string]interface{}**

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ReplayMissingWebhooksApiV1AppAppIdEndpointEndpointIdReplayMissingPost

> map[string]interface{} ReplayMissingWebhooksApiV1AppAppIdEndpointEndpointIdReplayMissingPost(ctx, appId, endpointId).ReplayIn(replayIn).IdempotencyKey(idempotencyKey).Execute()

Replay Missing Webhooks



### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    "time"
    openapiclient "./openapi"
)

func main() {
    appId := "app_1srOrx2ZWZBpBUvZwXKQmoEYga2" // string | 
    endpointId := "ep_1srOrx2ZWZBpBUvZwXKQmoEYga2" // string | 
    replayIn := *openapiclient.NewReplayIn(time.Now()) // ReplayIn | 
    idempotencyKey := "idempotencyKey_example" // string | The request's idempotency key (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.EndpointApi.ReplayMissingWebhooksApiV1AppAppIdEndpointEndpointIdReplayMissingPost(context.Background(), appId, endpointId).ReplayIn(replayIn).IdempotencyKey(idempotencyKey).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `EndpointApi.ReplayMissingWebhooksApiV1AppAppIdEndpointEndpointIdReplayMissingPost``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `ReplayMissingWebhooksApiV1AppAppIdEndpointEndpointIdReplayMissingPost`: map[string]interface{}
    fmt.Fprintf(os.Stdout, "Response from `EndpointApi.ReplayMissingWebhooksApiV1AppAppIdEndpointEndpointIdReplayMissingPost`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**appId** | **string** |  | 
**endpointId** | **string** |  | 

### Other Parameters

Other parameters are passed through a pointer to a apiReplayMissingWebhooksApiV1AppAppIdEndpointEndpointIdReplayMissingPostRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **replayIn** | [**ReplayIn**](ReplayIn.md) |  | 
 **idempotencyKey** | **string** | The request&#39;s idempotency key | 

### Return type

**map[string]interface{}**

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## RotateEndpointSecretApiV1AppAppIdEndpointEndpointIdSecretRotatePost

> RotateEndpointSecretApiV1AppAppIdEndpointEndpointIdSecretRotatePost(ctx, endpointId, appId).EndpointSecretRotateIn(endpointSecretRotateIn).IdempotencyKey(idempotencyKey).Execute()

Rotate Endpoint Secret



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
    endpointId := "ep_1srOrx2ZWZBpBUvZwXKQmoEYga2" // string | 
    appId := "app_1srOrx2ZWZBpBUvZwXKQmoEYga2" // string | 
    endpointSecretRotateIn := *openapiclient.NewEndpointSecretRotateIn() // EndpointSecretRotateIn | 
    idempotencyKey := "idempotencyKey_example" // string | The request's idempotency key (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.EndpointApi.RotateEndpointSecretApiV1AppAppIdEndpointEndpointIdSecretRotatePost(context.Background(), endpointId, appId).EndpointSecretRotateIn(endpointSecretRotateIn).IdempotencyKey(idempotencyKey).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `EndpointApi.RotateEndpointSecretApiV1AppAppIdEndpointEndpointIdSecretRotatePost``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**endpointId** | **string** |  | 
**appId** | **string** |  | 

### Other Parameters

Other parameters are passed through a pointer to a apiRotateEndpointSecretApiV1AppAppIdEndpointEndpointIdSecretRotatePostRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **endpointSecretRotateIn** | [**EndpointSecretRotateIn**](EndpointSecretRotateIn.md) |  | 
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


## UpdateEndpointApiV1AppAppIdEndpointEndpointIdPut

> EndpointOut UpdateEndpointApiV1AppAppIdEndpointEndpointIdPut(ctx, endpointId, appId).EndpointUpdate(endpointUpdate).IdempotencyKey(idempotencyKey).Execute()

Update Endpoint



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
    endpointId := "ep_1srOrx2ZWZBpBUvZwXKQmoEYga2" // string | 
    appId := "app_1srOrx2ZWZBpBUvZwXKQmoEYga2" // string | 
    endpointUpdate := *openapiclient.NewEndpointUpdate("https://example.com/webhook/", int32(1)) // EndpointUpdate | 
    idempotencyKey := "idempotencyKey_example" // string | The request's idempotency key (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.EndpointApi.UpdateEndpointApiV1AppAppIdEndpointEndpointIdPut(context.Background(), endpointId, appId).EndpointUpdate(endpointUpdate).IdempotencyKey(idempotencyKey).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `EndpointApi.UpdateEndpointApiV1AppAppIdEndpointEndpointIdPut``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `UpdateEndpointApiV1AppAppIdEndpointEndpointIdPut`: EndpointOut
    fmt.Fprintf(os.Stdout, "Response from `EndpointApi.UpdateEndpointApiV1AppAppIdEndpointEndpointIdPut`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**endpointId** | **string** |  | 
**appId** | **string** |  | 

### Other Parameters

Other parameters are passed through a pointer to a apiUpdateEndpointApiV1AppAppIdEndpointEndpointIdPutRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **endpointUpdate** | [**EndpointUpdate**](EndpointUpdate.md) |  | 
 **idempotencyKey** | **string** | The request&#39;s idempotency key | 

### Return type

[**EndpointOut**](EndpointOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## UpdateEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersPut

> UpdateEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersPut(ctx, appId, endpointId).EndpointHeadersIn(endpointHeadersIn).IdempotencyKey(idempotencyKey).Execute()

Update Endpoint Headers



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
    endpointId := "ep_1srOrx2ZWZBpBUvZwXKQmoEYga2" // string | 
    endpointHeadersIn := *openapiclient.NewEndpointHeadersIn(map[string]string{"key": "Inner_example"}) // EndpointHeadersIn | 
    idempotencyKey := "idempotencyKey_example" // string | The request's idempotency key (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.EndpointApi.UpdateEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersPut(context.Background(), appId, endpointId).EndpointHeadersIn(endpointHeadersIn).IdempotencyKey(idempotencyKey).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `EndpointApi.UpdateEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersPut``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**appId** | **string** |  | 
**endpointId** | **string** |  | 

### Other Parameters

Other parameters are passed through a pointer to a apiUpdateEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersPutRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **endpointHeadersIn** | [**EndpointHeadersIn**](EndpointHeadersIn.md) |  | 
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

