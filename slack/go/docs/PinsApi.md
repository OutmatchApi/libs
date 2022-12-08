# \PinsApi

All URIs are relative to *https://slack.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**PinsAdd**](PinsApi.md#PinsAdd) | **Post** /pins.add | 
[**PinsList**](PinsApi.md#PinsList) | **Get** /pins.list | 
[**PinsRemove**](PinsApi.md#PinsRemove) | **Post** /pins.remove | 



## PinsAdd

> PinsAddSchema PinsAdd(ctx).Token(token).Channel(channel).Timestamp(timestamp).Execute()





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
    token := "token_example" // string | Authentication token. Requires scope: `pins:write`
    channel := "channel_example" // string | Channel to pin the item in.
    timestamp := "timestamp_example" // string | Timestamp of the message to pin. (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.PinsApi.PinsAdd(context.Background()).Token(token).Channel(channel).Timestamp(timestamp).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `PinsApi.PinsAdd``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `PinsAdd`: PinsAddSchema
    fmt.Fprintf(os.Stdout, "Response from `PinsApi.PinsAdd`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiPinsAddRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;pins:write&#x60; | 
 **channel** | **string** | Channel to pin the item in. | 
 **timestamp** | **string** | Timestamp of the message to pin. | 

### Return type

[**PinsAddSchema**](PinsAddSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## PinsList

> []PinsListSuccessSchemaInner PinsList(ctx).Token(token).Channel(channel).Execute()





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
    token := "token_example" // string | Authentication token. Requires scope: `pins:read`
    channel := "channel_example" // string | Channel to get pinned items for.

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.PinsApi.PinsList(context.Background()).Token(token).Channel(channel).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `PinsApi.PinsList``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `PinsList`: []PinsListSuccessSchemaInner
    fmt.Fprintf(os.Stdout, "Response from `PinsApi.PinsList`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiPinsListRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;pins:read&#x60; | 
 **channel** | **string** | Channel to get pinned items for. | 

### Return type

[**[]PinsListSuccessSchemaInner**](PinsListSuccessSchemaInner.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## PinsRemove

> PinsRemoveSchema PinsRemove(ctx).Token(token).Channel(channel).Timestamp(timestamp).Execute()





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
    token := "token_example" // string | Authentication token. Requires scope: `pins:write`
    channel := "channel_example" // string | Channel where the item is pinned to.
    timestamp := "timestamp_example" // string | Timestamp of the message to un-pin. (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.PinsApi.PinsRemove(context.Background()).Token(token).Channel(channel).Timestamp(timestamp).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `PinsApi.PinsRemove``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `PinsRemove`: PinsRemoveSchema
    fmt.Fprintf(os.Stdout, "Response from `PinsApi.PinsRemove`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiPinsRemoveRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;pins:write&#x60; | 
 **channel** | **string** | Channel where the item is pinned to. | 
 **timestamp** | **string** | Timestamp of the message to un-pin. | 

### Return type

[**PinsRemoveSchema**](PinsRemoveSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

