# \AppsEventAuthorizationsApi

All URIs are relative to *https://slack.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AppsEventAuthorizationsList**](AppsEventAuthorizationsApi.md#AppsEventAuthorizationsList) | **Get** /apps.event.authorizations.list | 



## AppsEventAuthorizationsList

> DefaultSuccessTemplate AppsEventAuthorizationsList(ctx).Token(token).EventContext(eventContext).Cursor(cursor).Limit(limit).Execute()





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
    token := "token_example" // string | Authentication token. Requires scope: `authorizations:read`
    eventContext := "eventContext_example" // string | 
    cursor := "cursor_example" // string |  (optional)
    limit := int32(56) // int32 |  (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.AppsEventAuthorizationsApi.AppsEventAuthorizationsList(context.Background()).Token(token).EventContext(eventContext).Cursor(cursor).Limit(limit).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `AppsEventAuthorizationsApi.AppsEventAuthorizationsList``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `AppsEventAuthorizationsList`: DefaultSuccessTemplate
    fmt.Fprintf(os.Stdout, "Response from `AppsEventAuthorizationsApi.AppsEventAuthorizationsList`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiAppsEventAuthorizationsListRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;authorizations:read&#x60; | 
 **eventContext** | **string** |  | 
 **cursor** | **string** |  | 
 **limit** | **int32** |  | 

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

