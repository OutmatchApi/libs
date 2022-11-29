# \MessageApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CreateMessageApiV1AppAppIdMsgPost**](MessageApi.md#CreateMessageApiV1AppAppIdMsgPost) | **Post** /api/v1/app/{app_id}/msg/ | Create Message
[**GetMessageApiV1AppAppIdMsgMsgIdGet**](MessageApi.md#GetMessageApiV1AppAppIdMsgMsgIdGet) | **Get** /api/v1/app/{app_id}/msg/{msg_id}/ | Get Message
[**ListMessagesApiV1AppAppIdMsgGet**](MessageApi.md#ListMessagesApiV1AppAppIdMsgGet) | **Get** /api/v1/app/{app_id}/msg/ | List Messages



## CreateMessageApiV1AppAppIdMsgPost

> MessageOut CreateMessageApiV1AppAppIdMsgPost(ctx, appId).MessageIn(messageIn).WithContent(withContent).IdempotencyKey(idempotencyKey).Execute()

Create Message



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
    messageIn := *openapiclient.NewMessageIn("user.signup", map[string]interface{}({"username":"test_user","email":"test@example.com"})) // MessageIn | 
    withContent := true // bool |  (optional) (default to true)
    idempotencyKey := "idempotencyKey_example" // string | The request's idempotency key (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.MessageApi.CreateMessageApiV1AppAppIdMsgPost(context.Background(), appId).MessageIn(messageIn).WithContent(withContent).IdempotencyKey(idempotencyKey).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `MessageApi.CreateMessageApiV1AppAppIdMsgPost``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `CreateMessageApiV1AppAppIdMsgPost`: MessageOut
    fmt.Fprintf(os.Stdout, "Response from `MessageApi.CreateMessageApiV1AppAppIdMsgPost`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**appId** | **string** |  | 

### Other Parameters

Other parameters are passed through a pointer to a apiCreateMessageApiV1AppAppIdMsgPostRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **messageIn** | [**MessageIn**](MessageIn.md) |  | 
 **withContent** | **bool** |  | [default to true]
 **idempotencyKey** | **string** | The request&#39;s idempotency key | 

### Return type

[**MessageOut**](MessageOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetMessageApiV1AppAppIdMsgMsgIdGet

> MessageOut GetMessageApiV1AppAppIdMsgMsgIdGet(ctx, msgId, appId).IdempotencyKey(idempotencyKey).Execute()

Get Message



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
    idempotencyKey := "idempotencyKey_example" // string | The request's idempotency key (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.MessageApi.GetMessageApiV1AppAppIdMsgMsgIdGet(context.Background(), msgId, appId).IdempotencyKey(idempotencyKey).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `MessageApi.GetMessageApiV1AppAppIdMsgMsgIdGet``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetMessageApiV1AppAppIdMsgMsgIdGet`: MessageOut
    fmt.Fprintf(os.Stdout, "Response from `MessageApi.GetMessageApiV1AppAppIdMsgMsgIdGet`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**msgId** | **string** |  | 
**appId** | **string** |  | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetMessageApiV1AppAppIdMsgMsgIdGetRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **idempotencyKey** | **string** | The request&#39;s idempotency key | 

### Return type

[**MessageOut**](MessageOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ListMessagesApiV1AppAppIdMsgGet

> ListResponseMessageOut ListMessagesApiV1AppAppIdMsgGet(ctx, appId).Iterator(iterator).Limit(limit).EventTypes(eventTypes).Channel(channel).Before(before).After(after).IdempotencyKey(idempotencyKey).Execute()

List Messages



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
    iterator := "msg_1srOrx2ZWZBpBUvZwXKQmoEYga2" // string |  (optional)
    limit := int32(56) // int32 |  (optional) (default to 50)
    eventTypes := []string{"user.signup"} // []string |  (optional)
    channel := "project_1337" // string |  (optional)
    before := time.Now() // time.Time |  (optional)
    after := time.Now() // time.Time |  (optional)
    idempotencyKey := "idempotencyKey_example" // string | The request's idempotency key (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.MessageApi.ListMessagesApiV1AppAppIdMsgGet(context.Background(), appId).Iterator(iterator).Limit(limit).EventTypes(eventTypes).Channel(channel).Before(before).After(after).IdempotencyKey(idempotencyKey).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `MessageApi.ListMessagesApiV1AppAppIdMsgGet``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `ListMessagesApiV1AppAppIdMsgGet`: ListResponseMessageOut
    fmt.Fprintf(os.Stdout, "Response from `MessageApi.ListMessagesApiV1AppAppIdMsgGet`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**appId** | **string** |  | 

### Other Parameters

Other parameters are passed through a pointer to a apiListMessagesApiV1AppAppIdMsgGetRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **iterator** | **string** |  | 
 **limit** | **int32** |  | [default to 50]
 **eventTypes** | **[]string** |  | 
 **channel** | **string** |  | 
 **before** | **time.Time** |  | 
 **after** | **time.Time** |  | 
 **idempotencyKey** | **string** | The request&#39;s idempotency key | 

### Return type

[**ListResponseMessageOut**](ListResponseMessageOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

