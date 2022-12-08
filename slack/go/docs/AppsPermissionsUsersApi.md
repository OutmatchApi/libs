# \AppsPermissionsUsersApi

All URIs are relative to *https://slack.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AppsPermissionsUsersList**](AppsPermissionsUsersApi.md#AppsPermissionsUsersList) | **Get** /apps.permissions.users.list | 
[**AppsPermissionsUsersRequest**](AppsPermissionsUsersApi.md#AppsPermissionsUsersRequest) | **Get** /apps.permissions.users.request | 



## AppsPermissionsUsersList

> DefaultSuccessTemplate AppsPermissionsUsersList(ctx).Token(token).Cursor(cursor).Limit(limit).Execute()





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
    cursor := "cursor_example" // string | Paginate through collections of data by setting the `cursor` parameter to a `next_cursor` attribute returned by a previous request's `response_metadata`. Default value fetches the first \"page\" of the collection. See [pagination](/docs/pagination) for more detail. (optional)
    limit := int32(56) // int32 | The maximum number of items to return. (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.AppsPermissionsUsersApi.AppsPermissionsUsersList(context.Background()).Token(token).Cursor(cursor).Limit(limit).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `AppsPermissionsUsersApi.AppsPermissionsUsersList``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `AppsPermissionsUsersList`: DefaultSuccessTemplate
    fmt.Fprintf(os.Stdout, "Response from `AppsPermissionsUsersApi.AppsPermissionsUsersList`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiAppsPermissionsUsersListRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;none&#x60; | 
 **cursor** | **string** | Paginate through collections of data by setting the &#x60;cursor&#x60; parameter to a &#x60;next_cursor&#x60; attribute returned by a previous request&#39;s &#x60;response_metadata&#x60;. Default value fetches the first \&quot;page\&quot; of the collection. See [pagination](/docs/pagination) for more detail. | 
 **limit** | **int32** | The maximum number of items to return. | 

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


## AppsPermissionsUsersRequest

> DefaultSuccessTemplate AppsPermissionsUsersRequest(ctx).Token(token).Scopes(scopes).TriggerId(triggerId).User(user).Execute()





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
    scopes := "scopes_example" // string | A comma separated list of user scopes to request for
    triggerId := "triggerId_example" // string | Token used to trigger the request
    user := "user_example" // string | The user this scope is being requested for

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.AppsPermissionsUsersApi.AppsPermissionsUsersRequest(context.Background()).Token(token).Scopes(scopes).TriggerId(triggerId).User(user).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `AppsPermissionsUsersApi.AppsPermissionsUsersRequest``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `AppsPermissionsUsersRequest`: DefaultSuccessTemplate
    fmt.Fprintf(os.Stdout, "Response from `AppsPermissionsUsersApi.AppsPermissionsUsersRequest`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiAppsPermissionsUsersRequestRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;none&#x60; | 
 **scopes** | **string** | A comma separated list of user scopes to request for | 
 **triggerId** | **string** | Token used to trigger the request | 
 **user** | **string** | The user this scope is being requested for | 

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

