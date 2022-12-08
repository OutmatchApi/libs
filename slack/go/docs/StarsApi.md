# \StarsApi

All URIs are relative to *https://slack.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**StarsAdd**](StarsApi.md#StarsAdd) | **Post** /stars.add | 
[**StarsList**](StarsApi.md#StarsList) | **Get** /stars.list | 
[**StarsRemove**](StarsApi.md#StarsRemove) | **Post** /stars.remove | 



## StarsAdd

> StarsAddSchema StarsAdd(ctx).Token(token).Channel(channel).File(file).FileComment(fileComment).Timestamp(timestamp).Execute()





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
    token := "token_example" // string | Authentication token. Requires scope: `stars:write`
    channel := "channel_example" // string | Channel to add star to, or channel where the message to add star to was posted (used with `timestamp`). (optional)
    file := "file_example" // string | File to add star to. (optional)
    fileComment := "fileComment_example" // string | File comment to add star to. (optional)
    timestamp := "timestamp_example" // string | Timestamp of the message to add star to. (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.StarsApi.StarsAdd(context.Background()).Token(token).Channel(channel).File(file).FileComment(fileComment).Timestamp(timestamp).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `StarsApi.StarsAdd``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `StarsAdd`: StarsAddSchema
    fmt.Fprintf(os.Stdout, "Response from `StarsApi.StarsAdd`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiStarsAddRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;stars:write&#x60; | 
 **channel** | **string** | Channel to add star to, or channel where the message to add star to was posted (used with &#x60;timestamp&#x60;). | 
 **file** | **string** | File to add star to. | 
 **fileComment** | **string** | File comment to add star to. | 
 **timestamp** | **string** | Timestamp of the message to add star to. | 

### Return type

[**StarsAddSchema**](StarsAddSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## StarsList

> StarsListSchema StarsList(ctx).Token(token).Count(count).Page(page).Cursor(cursor).Limit(limit).Execute()





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
    token := "token_example" // string | Authentication token. Requires scope: `stars:read` (optional)
    count := "count_example" // string |  (optional)
    page := "page_example" // string |  (optional)
    cursor := "cursor_example" // string | Parameter for pagination. Set `cursor` equal to the `next_cursor` attribute returned by the previous request's `response_metadata`. This parameter is optional, but pagination is mandatory: the default value simply fetches the first \"page\" of the collection. See [pagination](/docs/pagination) for more details. (optional)
    limit := int32(56) // int32 | The maximum number of items to return. Fewer than the requested number of items may be returned, even if the end of the list hasn't been reached. (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.StarsApi.StarsList(context.Background()).Token(token).Count(count).Page(page).Cursor(cursor).Limit(limit).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `StarsApi.StarsList``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `StarsList`: StarsListSchema
    fmt.Fprintf(os.Stdout, "Response from `StarsApi.StarsList`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiStarsListRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;stars:read&#x60; | 
 **count** | **string** |  | 
 **page** | **string** |  | 
 **cursor** | **string** | Parameter for pagination. Set &#x60;cursor&#x60; equal to the &#x60;next_cursor&#x60; attribute returned by the previous request&#39;s &#x60;response_metadata&#x60;. This parameter is optional, but pagination is mandatory: the default value simply fetches the first \&quot;page\&quot; of the collection. See [pagination](/docs/pagination) for more details. | 
 **limit** | **int32** | The maximum number of items to return. Fewer than the requested number of items may be returned, even if the end of the list hasn&#39;t been reached. | 

### Return type

[**StarsListSchema**](StarsListSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## StarsRemove

> StarsRemoveSchema StarsRemove(ctx).Token(token).Channel(channel).File(file).FileComment(fileComment).Timestamp(timestamp).Execute()





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
    token := "token_example" // string | Authentication token. Requires scope: `stars:write`
    channel := "channel_example" // string | Channel to remove star from, or channel where the message to remove star from was posted (used with `timestamp`). (optional)
    file := "file_example" // string | File to remove star from. (optional)
    fileComment := "fileComment_example" // string | File comment to remove star from. (optional)
    timestamp := "timestamp_example" // string | Timestamp of the message to remove star from. (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.StarsApi.StarsRemove(context.Background()).Token(token).Channel(channel).File(file).FileComment(fileComment).Timestamp(timestamp).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `StarsApi.StarsRemove``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `StarsRemove`: StarsRemoveSchema
    fmt.Fprintf(os.Stdout, "Response from `StarsApi.StarsRemove`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiStarsRemoveRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;stars:write&#x60; | 
 **channel** | **string** | Channel to remove star from, or channel where the message to remove star from was posted (used with &#x60;timestamp&#x60;). | 
 **file** | **string** | File to remove star from. | 
 **fileComment** | **string** | File comment to remove star from. | 
 **timestamp** | **string** | Timestamp of the message to remove star from. | 

### Return type

[**StarsRemoveSchema**](StarsRemoveSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

