# \EventTypeApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CreateEventTypeApiV1EventTypePost**](EventTypeApi.md#CreateEventTypeApiV1EventTypePost) | **Post** /api/v1/event-type/ | Create Event Type
[**DeleteEventTypeApiV1EventTypeEventTypeNameDelete**](EventTypeApi.md#DeleteEventTypeApiV1EventTypeEventTypeNameDelete) | **Delete** /api/v1/event-type/{event_type_name}/ | Archive Event Type
[**GetEventTypeApiV1EventTypeEventTypeNameGet**](EventTypeApi.md#GetEventTypeApiV1EventTypeEventTypeNameGet) | **Get** /api/v1/event-type/{event_type_name}/ | Get Event Type
[**ListEventTypesApiV1EventTypeGet**](EventTypeApi.md#ListEventTypesApiV1EventTypeGet) | **Get** /api/v1/event-type/ | List Event Types
[**UpdateEventTypeApiV1EventTypeEventTypeNamePut**](EventTypeApi.md#UpdateEventTypeApiV1EventTypeEventTypeNamePut) | **Put** /api/v1/event-type/{event_type_name}/ | Update Event Type



## CreateEventTypeApiV1EventTypePost

> EventTypeOut CreateEventTypeApiV1EventTypePost(ctx).EventTypeIn(eventTypeIn).IdempotencyKey(idempotencyKey).Execute()

Create Event Type



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
    eventTypeIn := *openapiclient.NewEventTypeIn("A user has signed up", "user.signup") // EventTypeIn | 
    idempotencyKey := "idempotencyKey_example" // string | The request's idempotency key (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.EventTypeApi.CreateEventTypeApiV1EventTypePost(context.Background()).EventTypeIn(eventTypeIn).IdempotencyKey(idempotencyKey).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `EventTypeApi.CreateEventTypeApiV1EventTypePost``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `CreateEventTypeApiV1EventTypePost`: EventTypeOut
    fmt.Fprintf(os.Stdout, "Response from `EventTypeApi.CreateEventTypeApiV1EventTypePost`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCreateEventTypeApiV1EventTypePostRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventTypeIn** | [**EventTypeIn**](EventTypeIn.md) |  | 
 **idempotencyKey** | **string** | The request&#39;s idempotency key | 

### Return type

[**EventTypeOut**](EventTypeOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## DeleteEventTypeApiV1EventTypeEventTypeNameDelete

> DeleteEventTypeApiV1EventTypeEventTypeNameDelete(ctx, eventTypeName).IdempotencyKey(idempotencyKey).Execute()

Archive Event Type



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
    eventTypeName := "user.signup" // string | 
    idempotencyKey := "idempotencyKey_example" // string | The request's idempotency key (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.EventTypeApi.DeleteEventTypeApiV1EventTypeEventTypeNameDelete(context.Background(), eventTypeName).IdempotencyKey(idempotencyKey).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `EventTypeApi.DeleteEventTypeApiV1EventTypeEventTypeNameDelete``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**eventTypeName** | **string** |  | 

### Other Parameters

Other parameters are passed through a pointer to a apiDeleteEventTypeApiV1EventTypeEventTypeNameDeleteRequest struct via the builder pattern


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


## GetEventTypeApiV1EventTypeEventTypeNameGet

> EventTypeOut GetEventTypeApiV1EventTypeEventTypeNameGet(ctx, eventTypeName).IdempotencyKey(idempotencyKey).Execute()

Get Event Type



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
    eventTypeName := "user.signup" // string | 
    idempotencyKey := "idempotencyKey_example" // string | The request's idempotency key (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.EventTypeApi.GetEventTypeApiV1EventTypeEventTypeNameGet(context.Background(), eventTypeName).IdempotencyKey(idempotencyKey).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `EventTypeApi.GetEventTypeApiV1EventTypeEventTypeNameGet``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetEventTypeApiV1EventTypeEventTypeNameGet`: EventTypeOut
    fmt.Fprintf(os.Stdout, "Response from `EventTypeApi.GetEventTypeApiV1EventTypeEventTypeNameGet`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**eventTypeName** | **string** |  | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetEventTypeApiV1EventTypeEventTypeNameGetRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **idempotencyKey** | **string** | The request&#39;s idempotency key | 

### Return type

[**EventTypeOut**](EventTypeOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ListEventTypesApiV1EventTypeGet

> ListResponseEventTypeOut ListEventTypesApiV1EventTypeGet(ctx).Iterator(iterator).Limit(limit).WithContent(withContent).IncludeArchived(includeArchived).IdempotencyKey(idempotencyKey).Execute()

List Event Types



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
    iterator := "user.signup" // string |  (optional)
    limit := int32(56) // int32 |  (optional) (default to 50)
    withContent := true // bool |  (optional) (default to false)
    includeArchived := true // bool |  (optional) (default to false)
    idempotencyKey := "idempotencyKey_example" // string | The request's idempotency key (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.EventTypeApi.ListEventTypesApiV1EventTypeGet(context.Background()).Iterator(iterator).Limit(limit).WithContent(withContent).IncludeArchived(includeArchived).IdempotencyKey(idempotencyKey).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `EventTypeApi.ListEventTypesApiV1EventTypeGet``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `ListEventTypesApiV1EventTypeGet`: ListResponseEventTypeOut
    fmt.Fprintf(os.Stdout, "Response from `EventTypeApi.ListEventTypesApiV1EventTypeGet`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiListEventTypesApiV1EventTypeGetRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **iterator** | **string** |  | 
 **limit** | **int32** |  | [default to 50]
 **withContent** | **bool** |  | [default to false]
 **includeArchived** | **bool** |  | [default to false]
 **idempotencyKey** | **string** | The request&#39;s idempotency key | 

### Return type

[**ListResponseEventTypeOut**](ListResponseEventTypeOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## UpdateEventTypeApiV1EventTypeEventTypeNamePut

> EventTypeOut UpdateEventTypeApiV1EventTypeEventTypeNamePut(ctx, eventTypeName).EventTypeUpdate(eventTypeUpdate).IdempotencyKey(idempotencyKey).Execute()

Update Event Type



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
    eventTypeName := "user.signup" // string | 
    eventTypeUpdate := *openapiclient.NewEventTypeUpdate("A user has signed up") // EventTypeUpdate | 
    idempotencyKey := "idempotencyKey_example" // string | The request's idempotency key (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.EventTypeApi.UpdateEventTypeApiV1EventTypeEventTypeNamePut(context.Background(), eventTypeName).EventTypeUpdate(eventTypeUpdate).IdempotencyKey(idempotencyKey).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `EventTypeApi.UpdateEventTypeApiV1EventTypeEventTypeNamePut``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `UpdateEventTypeApiV1EventTypeEventTypeNamePut`: EventTypeOut
    fmt.Fprintf(os.Stdout, "Response from `EventTypeApi.UpdateEventTypeApiV1EventTypeEventTypeNamePut`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**eventTypeName** | **string** |  | 

### Other Parameters

Other parameters are passed through a pointer to a apiUpdateEventTypeApiV1EventTypeEventTypeNamePutRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **eventTypeUpdate** | [**EventTypeUpdate**](EventTypeUpdate.md) |  | 
 **idempotencyKey** | **string** | The request&#39;s idempotency key | 

### Return type

[**EventTypeOut**](EventTypeOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

