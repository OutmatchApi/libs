# \ReactionsApi

All URIs are relative to *https://slack.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ReactionsAdd**](ReactionsApi.md#ReactionsAdd) | **Post** /reactions.add | 
[**ReactionsGet**](ReactionsApi.md#ReactionsGet) | **Get** /reactions.get | 
[**ReactionsList**](ReactionsApi.md#ReactionsList) | **Get** /reactions.list | 
[**ReactionsRemove**](ReactionsApi.md#ReactionsRemove) | **Post** /reactions.remove | 



## ReactionsAdd

> ReactionsAddSchema ReactionsAdd(ctx).Token(token).Channel(channel).Name(name).Timestamp(timestamp).Execute()





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
    token := "token_example" // string | Authentication token. Requires scope: `reactions:write`
    channel := "channel_example" // string | Channel where the message to add reaction to was posted.
    name := "name_example" // string | Reaction (emoji) name.
    timestamp := "timestamp_example" // string | Timestamp of the message to add reaction to.

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.ReactionsApi.ReactionsAdd(context.Background()).Token(token).Channel(channel).Name(name).Timestamp(timestamp).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `ReactionsApi.ReactionsAdd``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `ReactionsAdd`: ReactionsAddSchema
    fmt.Fprintf(os.Stdout, "Response from `ReactionsApi.ReactionsAdd`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiReactionsAddRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;reactions:write&#x60; | 
 **channel** | **string** | Channel where the message to add reaction to was posted. | 
 **name** | **string** | Reaction (emoji) name. | 
 **timestamp** | **string** | Timestamp of the message to add reaction to. | 

### Return type

[**ReactionsAddSchema**](ReactionsAddSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ReactionsGet

> []ReactionsGetSuccessSchemaInner ReactionsGet(ctx).Token(token).Channel(channel).File(file).FileComment(fileComment).Full(full).Timestamp(timestamp).Execute()





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
    token := "token_example" // string | Authentication token. Requires scope: `reactions:read`
    channel := "channel_example" // string | Channel where the message to get reactions for was posted. (optional)
    file := "file_example" // string | File to get reactions for. (optional)
    fileComment := "fileComment_example" // string | File comment to get reactions for. (optional)
    full := true // bool | If true always return the complete reaction list. (optional)
    timestamp := "timestamp_example" // string | Timestamp of the message to get reactions for. (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.ReactionsApi.ReactionsGet(context.Background()).Token(token).Channel(channel).File(file).FileComment(fileComment).Full(full).Timestamp(timestamp).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `ReactionsApi.ReactionsGet``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `ReactionsGet`: []ReactionsGetSuccessSchemaInner
    fmt.Fprintf(os.Stdout, "Response from `ReactionsApi.ReactionsGet`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiReactionsGetRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;reactions:read&#x60; | 
 **channel** | **string** | Channel where the message to get reactions for was posted. | 
 **file** | **string** | File to get reactions for. | 
 **fileComment** | **string** | File comment to get reactions for. | 
 **full** | **bool** | If true always return the complete reaction list. | 
 **timestamp** | **string** | Timestamp of the message to get reactions for. | 

### Return type

[**[]ReactionsGetSuccessSchemaInner**](ReactionsGetSuccessSchemaInner.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ReactionsList

> ReactionsListSchema ReactionsList(ctx).Token(token).User(user).Full(full).Count(count).Page(page).Cursor(cursor).Limit(limit).Execute()





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
    token := "token_example" // string | Authentication token. Requires scope: `reactions:read`
    user := "user_example" // string | Show reactions made by this user. Defaults to the authed user. (optional)
    full := true // bool | If true always return the complete reaction list. (optional)
    count := int32(56) // int32 |  (optional)
    page := int32(56) // int32 |  (optional)
    cursor := "cursor_example" // string | Parameter for pagination. Set `cursor` equal to the `next_cursor` attribute returned by the previous request's `response_metadata`. This parameter is optional, but pagination is mandatory: the default value simply fetches the first \"page\" of the collection. See [pagination](/docs/pagination) for more details. (optional)
    limit := int32(56) // int32 | The maximum number of items to return. Fewer than the requested number of items may be returned, even if the end of the list hasn't been reached. (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.ReactionsApi.ReactionsList(context.Background()).Token(token).User(user).Full(full).Count(count).Page(page).Cursor(cursor).Limit(limit).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `ReactionsApi.ReactionsList``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `ReactionsList`: ReactionsListSchema
    fmt.Fprintf(os.Stdout, "Response from `ReactionsApi.ReactionsList`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiReactionsListRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;reactions:read&#x60; | 
 **user** | **string** | Show reactions made by this user. Defaults to the authed user. | 
 **full** | **bool** | If true always return the complete reaction list. | 
 **count** | **int32** |  | 
 **page** | **int32** |  | 
 **cursor** | **string** | Parameter for pagination. Set &#x60;cursor&#x60; equal to the &#x60;next_cursor&#x60; attribute returned by the previous request&#39;s &#x60;response_metadata&#x60;. This parameter is optional, but pagination is mandatory: the default value simply fetches the first \&quot;page\&quot; of the collection. See [pagination](/docs/pagination) for more details. | 
 **limit** | **int32** | The maximum number of items to return. Fewer than the requested number of items may be returned, even if the end of the list hasn&#39;t been reached. | 

### Return type

[**ReactionsListSchema**](ReactionsListSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ReactionsRemove

> ReactionsRemoveSchema ReactionsRemove(ctx).Token(token).Name(name).Channel(channel).File(file).FileComment(fileComment).Timestamp(timestamp).Execute()





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
    token := "token_example" // string | Authentication token. Requires scope: `reactions:write`
    name := "name_example" // string | Reaction (emoji) name.
    channel := "channel_example" // string | Channel where the message to remove reaction from was posted. (optional)
    file := "file_example" // string | File to remove reaction from. (optional)
    fileComment := "fileComment_example" // string | File comment to remove reaction from. (optional)
    timestamp := "timestamp_example" // string | Timestamp of the message to remove reaction from. (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.ReactionsApi.ReactionsRemove(context.Background()).Token(token).Name(name).Channel(channel).File(file).FileComment(fileComment).Timestamp(timestamp).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `ReactionsApi.ReactionsRemove``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `ReactionsRemove`: ReactionsRemoveSchema
    fmt.Fprintf(os.Stdout, "Response from `ReactionsApi.ReactionsRemove`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiReactionsRemoveRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;reactions:write&#x60; | 
 **name** | **string** | Reaction (emoji) name. | 
 **channel** | **string** | Channel where the message to remove reaction from was posted. | 
 **file** | **string** | File to remove reaction from. | 
 **fileComment** | **string** | File comment to remove reaction from. | 
 **timestamp** | **string** | Timestamp of the message to remove reaction from. | 

### Return type

[**ReactionsRemoveSchema**](ReactionsRemoveSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

