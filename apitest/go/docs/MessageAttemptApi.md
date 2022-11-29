# \MessageAttemptApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetAttemptApiV1AppAppIdMsgMsgIdAttemptAttemptIdGet**](MessageAttemptApi.md#GetAttemptApiV1AppAppIdMsgMsgIdAttemptAttemptIdGet) | **Get** /api/v1/app/{app_id}/msg/{msg_id}/attempt/{attempt_id}/ | Get Attempt
[**ListAttemptedDestinationsApiV1AppAppIdMsgMsgIdEndpointGet**](MessageAttemptApi.md#ListAttemptedDestinationsApiV1AppAppIdMsgMsgIdEndpointGet) | **Get** /api/v1/app/{app_id}/msg/{msg_id}/endpoint/ | List Attempted Destinations
[**ListAttemptedMessagesApiV1AppAppIdEndpointEndpointIdMsgGet**](MessageAttemptApi.md#ListAttemptedMessagesApiV1AppAppIdEndpointEndpointIdMsgGet) | **Get** /api/v1/app/{app_id}/endpoint/{endpoint_id}/msg/ | List Attempted Messages
[**ListAttemptsApiV1AppAppIdMsgMsgIdAttemptGet**](MessageAttemptApi.md#ListAttemptsApiV1AppAppIdMsgMsgIdAttemptGet) | **Get** /api/v1/app/{app_id}/msg/{msg_id}/attempt/ | List Attempts
[**ListAttemptsByEndpointApiV1AppAppIdAttemptEndpointEndpointIdGet**](MessageAttemptApi.md#ListAttemptsByEndpointApiV1AppAppIdAttemptEndpointEndpointIdGet) | **Get** /api/v1/app/{app_id}/attempt/endpoint/{endpoint_id}/ | List Attempts By Endpoint
[**ListAttemptsByMsgApiV1AppAppIdAttemptMsgMsgIdGet**](MessageAttemptApi.md#ListAttemptsByMsgApiV1AppAppIdAttemptMsgMsgIdGet) | **Get** /api/v1/app/{app_id}/attempt/msg/{msg_id}/ | List Attempts By Msg
[**ListAttemptsForEndpointApiV1AppAppIdMsgMsgIdEndpointEndpointIdAttemptGet**](MessageAttemptApi.md#ListAttemptsForEndpointApiV1AppAppIdMsgMsgIdEndpointEndpointIdAttemptGet) | **Get** /api/v1/app/{app_id}/msg/{msg_id}/endpoint/{endpoint_id}/attempt/ | List Attempts For Endpoint
[**ResendWebhookApiV1AppAppIdMsgMsgIdEndpointEndpointIdResendPost**](MessageAttemptApi.md#ResendWebhookApiV1AppAppIdMsgMsgIdEndpointEndpointIdResendPost) | **Post** /api/v1/app/{app_id}/msg/{msg_id}/endpoint/{endpoint_id}/resend/ | Resend Webhook



## GetAttemptApiV1AppAppIdMsgMsgIdAttemptAttemptIdGet

> MessageAttemptOut GetAttemptApiV1AppAppIdMsgMsgIdAttemptAttemptIdGet(ctx, attemptId, msgId, appId).IdempotencyKey(idempotencyKey).Execute()

Get Attempt



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
    attemptId := "atmpt_1srOrx2ZWZBpBUvZwXKQmoEYga2" // string | 
    msgId := "msg_1srOrx2ZWZBpBUvZwXKQmoEYga2" // string | 
    appId := "app_1srOrx2ZWZBpBUvZwXKQmoEYga2" // string | 
    idempotencyKey := "idempotencyKey_example" // string | The request's idempotency key (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.MessageAttemptApi.GetAttemptApiV1AppAppIdMsgMsgIdAttemptAttemptIdGet(context.Background(), attemptId, msgId, appId).IdempotencyKey(idempotencyKey).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `MessageAttemptApi.GetAttemptApiV1AppAppIdMsgMsgIdAttemptAttemptIdGet``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetAttemptApiV1AppAppIdMsgMsgIdAttemptAttemptIdGet`: MessageAttemptOut
    fmt.Fprintf(os.Stdout, "Response from `MessageAttemptApi.GetAttemptApiV1AppAppIdMsgMsgIdAttemptAttemptIdGet`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**attemptId** | **string** |  | 
**msgId** | **string** |  | 
**appId** | **string** |  | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetAttemptApiV1AppAppIdMsgMsgIdAttemptAttemptIdGetRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------



 **idempotencyKey** | **string** | The request&#39;s idempotency key | 

### Return type

[**MessageAttemptOut**](MessageAttemptOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ListAttemptedDestinationsApiV1AppAppIdMsgMsgIdEndpointGet

> ListResponseMessageEndpointOut ListAttemptedDestinationsApiV1AppAppIdMsgMsgIdEndpointGet(ctx, msgId, appId).Iterator(iterator).Limit(limit).IdempotencyKey(idempotencyKey).Execute()

List Attempted Destinations



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
    msgId := "msg_1srOrx2ZWZBpBUvZwXKQmoEYga2" // string | 
    appId := "app_1srOrx2ZWZBpBUvZwXKQmoEYga2" // string | 
    iterator := "msgep_1srOrx2ZWZBpBUvZwXKQmoEYga2" // string |  (optional)
    limit := int32(56) // int32 |  (optional) (default to 50)
    idempotencyKey := "idempotencyKey_example" // string | The request's idempotency key (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.MessageAttemptApi.ListAttemptedDestinationsApiV1AppAppIdMsgMsgIdEndpointGet(context.Background(), msgId, appId).Iterator(iterator).Limit(limit).IdempotencyKey(idempotencyKey).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `MessageAttemptApi.ListAttemptedDestinationsApiV1AppAppIdMsgMsgIdEndpointGet``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `ListAttemptedDestinationsApiV1AppAppIdMsgMsgIdEndpointGet`: ListResponseMessageEndpointOut
    fmt.Fprintf(os.Stdout, "Response from `MessageAttemptApi.ListAttemptedDestinationsApiV1AppAppIdMsgMsgIdEndpointGet`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**msgId** | **string** |  | 
**appId** | **string** |  | 

### Other Parameters

Other parameters are passed through a pointer to a apiListAttemptedDestinationsApiV1AppAppIdMsgMsgIdEndpointGetRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **iterator** | **string** |  | 
 **limit** | **int32** |  | [default to 50]
 **idempotencyKey** | **string** | The request&#39;s idempotency key | 

### Return type

[**ListResponseMessageEndpointOut**](ListResponseMessageEndpointOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ListAttemptedMessagesApiV1AppAppIdEndpointEndpointIdMsgGet

> ListResponseEndpointMessageOut ListAttemptedMessagesApiV1AppAppIdEndpointEndpointIdMsgGet(ctx, endpointId, appId).Iterator(iterator).Limit(limit).Channel(channel).Status(status).Before(before).After(after).IdempotencyKey(idempotencyKey).Execute()

List Attempted Messages



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
    endpointId := "ep_1srOrx2ZWZBpBUvZwXKQmoEYga2" // string | 
    appId := "app_1srOrx2ZWZBpBUvZwXKQmoEYga2" // string | 
    iterator := "msg_1srOrx2ZWZBpBUvZwXKQmoEYga2" // string |  (optional)
    limit := int32(56) // int32 |  (optional) (default to 50)
    channel := "project_1337" // string |  (optional)
    status := openapiclient.MessageStatus(0) // MessageStatus |  (optional)
    before := time.Now() // time.Time |  (optional)
    after := time.Now() // time.Time |  (optional)
    idempotencyKey := "idempotencyKey_example" // string | The request's idempotency key (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.MessageAttemptApi.ListAttemptedMessagesApiV1AppAppIdEndpointEndpointIdMsgGet(context.Background(), endpointId, appId).Iterator(iterator).Limit(limit).Channel(channel).Status(status).Before(before).After(after).IdempotencyKey(idempotencyKey).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `MessageAttemptApi.ListAttemptedMessagesApiV1AppAppIdEndpointEndpointIdMsgGet``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `ListAttemptedMessagesApiV1AppAppIdEndpointEndpointIdMsgGet`: ListResponseEndpointMessageOut
    fmt.Fprintf(os.Stdout, "Response from `MessageAttemptApi.ListAttemptedMessagesApiV1AppAppIdEndpointEndpointIdMsgGet`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**endpointId** | **string** |  | 
**appId** | **string** |  | 

### Other Parameters

Other parameters are passed through a pointer to a apiListAttemptedMessagesApiV1AppAppIdEndpointEndpointIdMsgGetRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **iterator** | **string** |  | 
 **limit** | **int32** |  | [default to 50]
 **channel** | **string** |  | 
 **status** | [**MessageStatus**](MessageStatus.md) |  | 
 **before** | **time.Time** |  | 
 **after** | **time.Time** |  | 
 **idempotencyKey** | **string** | The request&#39;s idempotency key | 

### Return type

[**ListResponseEndpointMessageOut**](ListResponseEndpointMessageOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ListAttemptsApiV1AppAppIdMsgMsgIdAttemptGet

> ListResponseMessageAttemptOut ListAttemptsApiV1AppAppIdMsgMsgIdAttemptGet(ctx, appId, msgId).Iterator(iterator).Limit(limit).EndpointId(endpointId).EventTypes(eventTypes).Channel(channel).Status(status).Before(before).After(after).IdempotencyKey(idempotencyKey).Execute()

List Attempts



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
    msgId := "msg_1srOrx2ZWZBpBUvZwXKQmoEYga2" // string | 
    iterator := "atmpt_1srOrx2ZWZBpBUvZwXKQmoEYga2" // string |  (optional)
    limit := int32(56) // int32 |  (optional) (default to 50)
    endpointId := "ep_1srOrx2ZWZBpBUvZwXKQmoEYga2" // string |  (optional)
    eventTypes := []string{"user.signup"} // []string |  (optional)
    channel := "project_1337" // string |  (optional)
    status := openapiclient.MessageStatus(0) // MessageStatus |  (optional)
    before := time.Now() // time.Time |  (optional)
    after := time.Now() // time.Time |  (optional)
    idempotencyKey := "idempotencyKey_example" // string | The request's idempotency key (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.MessageAttemptApi.ListAttemptsApiV1AppAppIdMsgMsgIdAttemptGet(context.Background(), appId, msgId).Iterator(iterator).Limit(limit).EndpointId(endpointId).EventTypes(eventTypes).Channel(channel).Status(status).Before(before).After(after).IdempotencyKey(idempotencyKey).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `MessageAttemptApi.ListAttemptsApiV1AppAppIdMsgMsgIdAttemptGet``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `ListAttemptsApiV1AppAppIdMsgMsgIdAttemptGet`: ListResponseMessageAttemptOut
    fmt.Fprintf(os.Stdout, "Response from `MessageAttemptApi.ListAttemptsApiV1AppAppIdMsgMsgIdAttemptGet`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**appId** | **string** |  | 
**msgId** | **string** |  | 

### Other Parameters

Other parameters are passed through a pointer to a apiListAttemptsApiV1AppAppIdMsgMsgIdAttemptGetRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **iterator** | **string** |  | 
 **limit** | **int32** |  | [default to 50]
 **endpointId** | **string** |  | 
 **eventTypes** | **[]string** |  | 
 **channel** | **string** |  | 
 **status** | [**MessageStatus**](MessageStatus.md) |  | 
 **before** | **time.Time** |  | 
 **after** | **time.Time** |  | 
 **idempotencyKey** | **string** | The request&#39;s idempotency key | 

### Return type

[**ListResponseMessageAttemptOut**](ListResponseMessageAttemptOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ListAttemptsByEndpointApiV1AppAppIdAttemptEndpointEndpointIdGet

> ListResponseMessageAttemptOut ListAttemptsByEndpointApiV1AppAppIdAttemptEndpointEndpointIdGet(ctx, appId, endpointId).Iterator(iterator).Limit(limit).Status(status).StatusCodeClass(statusCodeClass).EventTypes(eventTypes).Channel(channel).Before(before).After(after).IdempotencyKey(idempotencyKey).Execute()

List Attempts By Endpoint



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
    iterator := "atmpt_1srOrx2ZWZBpBUvZwXKQmoEYga2" // string |  (optional)
    limit := int32(56) // int32 |  (optional) (default to 50)
    status := openapiclient.MessageStatus(0) // MessageStatus |  (optional)
    statusCodeClass := openapiclient.StatusCodeClass(0) // StatusCodeClass |  (optional)
    eventTypes := []string{"user.signup"} // []string |  (optional)
    channel := "project_1337" // string |  (optional)
    before := time.Now() // time.Time |  (optional)
    after := time.Now() // time.Time |  (optional)
    idempotencyKey := "idempotencyKey_example" // string | The request's idempotency key (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.MessageAttemptApi.ListAttemptsByEndpointApiV1AppAppIdAttemptEndpointEndpointIdGet(context.Background(), appId, endpointId).Iterator(iterator).Limit(limit).Status(status).StatusCodeClass(statusCodeClass).EventTypes(eventTypes).Channel(channel).Before(before).After(after).IdempotencyKey(idempotencyKey).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `MessageAttemptApi.ListAttemptsByEndpointApiV1AppAppIdAttemptEndpointEndpointIdGet``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `ListAttemptsByEndpointApiV1AppAppIdAttemptEndpointEndpointIdGet`: ListResponseMessageAttemptOut
    fmt.Fprintf(os.Stdout, "Response from `MessageAttemptApi.ListAttemptsByEndpointApiV1AppAppIdAttemptEndpointEndpointIdGet`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**appId** | **string** |  | 
**endpointId** | **string** |  | 

### Other Parameters

Other parameters are passed through a pointer to a apiListAttemptsByEndpointApiV1AppAppIdAttemptEndpointEndpointIdGetRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **iterator** | **string** |  | 
 **limit** | **int32** |  | [default to 50]
 **status** | [**MessageStatus**](MessageStatus.md) |  | 
 **statusCodeClass** | [**StatusCodeClass**](StatusCodeClass.md) |  | 
 **eventTypes** | **[]string** |  | 
 **channel** | **string** |  | 
 **before** | **time.Time** |  | 
 **after** | **time.Time** |  | 
 **idempotencyKey** | **string** | The request&#39;s idempotency key | 

### Return type

[**ListResponseMessageAttemptOut**](ListResponseMessageAttemptOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ListAttemptsByMsgApiV1AppAppIdAttemptMsgMsgIdGet

> ListResponseMessageAttemptOut ListAttemptsByMsgApiV1AppAppIdAttemptMsgMsgIdGet(ctx, appId, msgId).EndpointId(endpointId).Iterator(iterator).Limit(limit).Status(status).StatusCodeClass(statusCodeClass).EventTypes(eventTypes).Channel(channel).Before(before).After(after).IdempotencyKey(idempotencyKey).Execute()

List Attempts By Msg



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
    msgId := "msg_1srOrx2ZWZBpBUvZwXKQmoEYga2" // string | 
    endpointId := "ep_1srOrx2ZWZBpBUvZwXKQmoEYga2" // string |  (optional)
    iterator := "atmpt_1srOrx2ZWZBpBUvZwXKQmoEYga2" // string |  (optional)
    limit := int32(56) // int32 |  (optional) (default to 50)
    status := openapiclient.MessageStatus(0) // MessageStatus |  (optional)
    statusCodeClass := openapiclient.StatusCodeClass(0) // StatusCodeClass |  (optional)
    eventTypes := []string{"user.signup"} // []string |  (optional)
    channel := "project_1337" // string |  (optional)
    before := time.Now() // time.Time |  (optional)
    after := time.Now() // time.Time |  (optional)
    idempotencyKey := "idempotencyKey_example" // string | The request's idempotency key (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.MessageAttemptApi.ListAttemptsByMsgApiV1AppAppIdAttemptMsgMsgIdGet(context.Background(), appId, msgId).EndpointId(endpointId).Iterator(iterator).Limit(limit).Status(status).StatusCodeClass(statusCodeClass).EventTypes(eventTypes).Channel(channel).Before(before).After(after).IdempotencyKey(idempotencyKey).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `MessageAttemptApi.ListAttemptsByMsgApiV1AppAppIdAttemptMsgMsgIdGet``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `ListAttemptsByMsgApiV1AppAppIdAttemptMsgMsgIdGet`: ListResponseMessageAttemptOut
    fmt.Fprintf(os.Stdout, "Response from `MessageAttemptApi.ListAttemptsByMsgApiV1AppAppIdAttemptMsgMsgIdGet`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**appId** | **string** |  | 
**msgId** | **string** |  | 

### Other Parameters

Other parameters are passed through a pointer to a apiListAttemptsByMsgApiV1AppAppIdAttemptMsgMsgIdGetRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **endpointId** | **string** |  | 
 **iterator** | **string** |  | 
 **limit** | **int32** |  | [default to 50]
 **status** | [**MessageStatus**](MessageStatus.md) |  | 
 **statusCodeClass** | [**StatusCodeClass**](StatusCodeClass.md) |  | 
 **eventTypes** | **[]string** |  | 
 **channel** | **string** |  | 
 **before** | **time.Time** |  | 
 **after** | **time.Time** |  | 
 **idempotencyKey** | **string** | The request&#39;s idempotency key | 

### Return type

[**ListResponseMessageAttemptOut**](ListResponseMessageAttemptOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ListAttemptsForEndpointApiV1AppAppIdMsgMsgIdEndpointEndpointIdAttemptGet

> ListResponseMessageAttemptEndpointOut ListAttemptsForEndpointApiV1AppAppIdMsgMsgIdEndpointEndpointIdAttemptGet(ctx, msgId, appId, endpointId).Iterator(iterator).Limit(limit).EventTypes(eventTypes).Channel(channel).Status(status).Before(before).After(after).IdempotencyKey(idempotencyKey).Execute()

List Attempts For Endpoint



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
    msgId := "msg_1srOrx2ZWZBpBUvZwXKQmoEYga2" // string | 
    appId := "app_1srOrx2ZWZBpBUvZwXKQmoEYga2" // string | 
    endpointId := "ep_1srOrx2ZWZBpBUvZwXKQmoEYga2" // string | 
    iterator := "atmpt_1srOrx2ZWZBpBUvZwXKQmoEYga2" // string |  (optional)
    limit := int32(56) // int32 |  (optional) (default to 50)
    eventTypes := []string{"user.signup"} // []string |  (optional)
    channel := "project_1337" // string |  (optional)
    status := openapiclient.MessageStatus(0) // MessageStatus |  (optional)
    before := time.Now() // time.Time |  (optional)
    after := time.Now() // time.Time |  (optional)
    idempotencyKey := "idempotencyKey_example" // string | The request's idempotency key (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.MessageAttemptApi.ListAttemptsForEndpointApiV1AppAppIdMsgMsgIdEndpointEndpointIdAttemptGet(context.Background(), msgId, appId, endpointId).Iterator(iterator).Limit(limit).EventTypes(eventTypes).Channel(channel).Status(status).Before(before).After(after).IdempotencyKey(idempotencyKey).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `MessageAttemptApi.ListAttemptsForEndpointApiV1AppAppIdMsgMsgIdEndpointEndpointIdAttemptGet``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `ListAttemptsForEndpointApiV1AppAppIdMsgMsgIdEndpointEndpointIdAttemptGet`: ListResponseMessageAttemptEndpointOut
    fmt.Fprintf(os.Stdout, "Response from `MessageAttemptApi.ListAttemptsForEndpointApiV1AppAppIdMsgMsgIdEndpointEndpointIdAttemptGet`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**msgId** | **string** |  | 
**appId** | **string** |  | 
**endpointId** | **string** |  | 

### Other Parameters

Other parameters are passed through a pointer to a apiListAttemptsForEndpointApiV1AppAppIdMsgMsgIdEndpointEndpointIdAttemptGetRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------



 **iterator** | **string** |  | 
 **limit** | **int32** |  | [default to 50]
 **eventTypes** | **[]string** |  | 
 **channel** | **string** |  | 
 **status** | [**MessageStatus**](MessageStatus.md) |  | 
 **before** | **time.Time** |  | 
 **after** | **time.Time** |  | 
 **idempotencyKey** | **string** | The request&#39;s idempotency key | 

### Return type

[**ListResponseMessageAttemptEndpointOut**](ListResponseMessageAttemptEndpointOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ResendWebhookApiV1AppAppIdMsgMsgIdEndpointEndpointIdResendPost

> ResendWebhookApiV1AppAppIdMsgMsgIdEndpointEndpointIdResendPost(ctx, endpointId, msgId, appId).IdempotencyKey(idempotencyKey).Execute()

Resend Webhook



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
    msgId := "msg_1srOrx2ZWZBpBUvZwXKQmoEYga2" // string | 
    appId := "app_1srOrx2ZWZBpBUvZwXKQmoEYga2" // string | 
    idempotencyKey := "idempotencyKey_example" // string | The request's idempotency key (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.MessageAttemptApi.ResendWebhookApiV1AppAppIdMsgMsgIdEndpointEndpointIdResendPost(context.Background(), endpointId, msgId, appId).IdempotencyKey(idempotencyKey).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `MessageAttemptApi.ResendWebhookApiV1AppAppIdMsgMsgIdEndpointEndpointIdResendPost``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**endpointId** | **string** |  | 
**msgId** | **string** |  | 
**appId** | **string** |  | 

### Other Parameters

Other parameters are passed through a pointer to a apiResendWebhookApiV1AppAppIdMsgMsgIdEndpointEndpointIdResendPostRequest struct via the builder pattern


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

