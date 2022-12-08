# \ViewsApi

All URIs are relative to *https://slack.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ViewsOpen**](ViewsApi.md#ViewsOpen) | **Get** /views.open | 
[**ViewsPublish**](ViewsApi.md#ViewsPublish) | **Get** /views.publish | 
[**ViewsPush**](ViewsApi.md#ViewsPush) | **Get** /views.push | 
[**ViewsUpdate**](ViewsApi.md#ViewsUpdate) | **Get** /views.update | 



## ViewsOpen

> DefaultSuccessTemplate ViewsOpen(ctx).Token(token).TriggerId(triggerId).View(view).Execute()





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
    token := "token_example" // string | Authentication token. Requires scope: `none`
    triggerId := "triggerId_example" // string | Exchange a trigger to post to the user.
    view := "view_example" // string | A [view payload](/reference/surfaces/views). This must be a JSON-encoded string.

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.ViewsApi.ViewsOpen(context.Background()).Token(token).TriggerId(triggerId).View(view).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `ViewsApi.ViewsOpen``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `ViewsOpen`: DefaultSuccessTemplate
    fmt.Fprintf(os.Stdout, "Response from `ViewsApi.ViewsOpen`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiViewsOpenRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;none&#x60; | 
 **triggerId** | **string** | Exchange a trigger to post to the user. | 
 **view** | **string** | A [view payload](/reference/surfaces/views). This must be a JSON-encoded string. | 

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ViewsPublish

> DefaultSuccessTemplate ViewsPublish(ctx).Token(token).UserId(userId).View(view).Hash(hash).Execute()





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
    token := "token_example" // string | Authentication token. Requires scope: `none`
    userId := "userId_example" // string | `id` of the user you want publish a view to.
    view := "view_example" // string | A [view payload](/reference/surfaces/views). This must be a JSON-encoded string.
    hash := "hash_example" // string | A string that represents view state to protect against possible race conditions. (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.ViewsApi.ViewsPublish(context.Background()).Token(token).UserId(userId).View(view).Hash(hash).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `ViewsApi.ViewsPublish``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `ViewsPublish`: DefaultSuccessTemplate
    fmt.Fprintf(os.Stdout, "Response from `ViewsApi.ViewsPublish`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiViewsPublishRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;none&#x60; | 
 **userId** | **string** | &#x60;id&#x60; of the user you want publish a view to. | 
 **view** | **string** | A [view payload](/reference/surfaces/views). This must be a JSON-encoded string. | 
 **hash** | **string** | A string that represents view state to protect against possible race conditions. | 

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ViewsPush

> DefaultSuccessTemplate ViewsPush(ctx).Token(token).TriggerId(triggerId).View(view).Execute()





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
    token := "token_example" // string | Authentication token. Requires scope: `none`
    triggerId := "triggerId_example" // string | Exchange a trigger to post to the user.
    view := "view_example" // string | A [view payload](/reference/surfaces/views). This must be a JSON-encoded string.

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.ViewsApi.ViewsPush(context.Background()).Token(token).TriggerId(triggerId).View(view).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `ViewsApi.ViewsPush``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `ViewsPush`: DefaultSuccessTemplate
    fmt.Fprintf(os.Stdout, "Response from `ViewsApi.ViewsPush`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiViewsPushRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;none&#x60; | 
 **triggerId** | **string** | Exchange a trigger to post to the user. | 
 **view** | **string** | A [view payload](/reference/surfaces/views). This must be a JSON-encoded string. | 

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ViewsUpdate

> DefaultSuccessTemplate ViewsUpdate(ctx).Token(token).ViewId(viewId).ExternalId(externalId).View(view).Hash(hash).Execute()





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
    token := "token_example" // string | Authentication token. Requires scope: `none`
    viewId := "viewId_example" // string | A unique identifier of the view to be updated. Either `view_id` or `external_id` is required. (optional)
    externalId := "externalId_example" // string | A unique identifier of the view set by the developer. Must be unique for all views on a team. Max length of 255 characters. Either `view_id` or `external_id` is required. (optional)
    view := "view_example" // string | A [view object](/reference/surfaces/views). This must be a JSON-encoded string. (optional)
    hash := "hash_example" // string | A string that represents view state to protect against possible race conditions. (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.ViewsApi.ViewsUpdate(context.Background()).Token(token).ViewId(viewId).ExternalId(externalId).View(view).Hash(hash).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `ViewsApi.ViewsUpdate``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `ViewsUpdate`: DefaultSuccessTemplate
    fmt.Fprintf(os.Stdout, "Response from `ViewsApi.ViewsUpdate`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiViewsUpdateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;none&#x60; | 
 **viewId** | **string** | A unique identifier of the view to be updated. Either &#x60;view_id&#x60; or &#x60;external_id&#x60; is required. | 
 **externalId** | **string** | A unique identifier of the view set by the developer. Must be unique for all views on a team. Max length of 255 characters. Either &#x60;view_id&#x60; or &#x60;external_id&#x60; is required. | 
 **view** | **string** | A [view object](/reference/surfaces/views). This must be a JSON-encoded string. | 
 **hash** | **string** | A string that represents view state to protect against possible race conditions. | 

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

