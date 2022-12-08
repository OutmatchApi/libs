# \AdminAppsRequestsApi

All URIs are relative to *https://slack.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AdminAppsRequestsList**](AdminAppsRequestsApi.md#AdminAppsRequestsList) | **Get** /admin.apps.requests.list | 



## AdminAppsRequestsList

> DefaultSuccessTemplate AdminAppsRequestsList(ctx).Token(token).Limit(limit).Cursor(cursor).TeamId(teamId).Execute()





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
    token := "token_example" // string | Authentication token. Requires scope: `admin.apps:read`
    limit := int32(56) // int32 | The maximum number of items to return. Must be between 1 - 1000 both inclusive. (optional)
    cursor := "cursor_example" // string | Set `cursor` to `next_cursor` returned by the previous call to list items in the next page (optional)
    teamId := "teamId_example" // string |  (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.AdminAppsRequestsApi.AdminAppsRequestsList(context.Background()).Token(token).Limit(limit).Cursor(cursor).TeamId(teamId).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `AdminAppsRequestsApi.AdminAppsRequestsList``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `AdminAppsRequestsList`: DefaultSuccessTemplate
    fmt.Fprintf(os.Stdout, "Response from `AdminAppsRequestsApi.AdminAppsRequestsList`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiAdminAppsRequestsListRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;admin.apps:read&#x60; | 
 **limit** | **int32** | The maximum number of items to return. Must be between 1 - 1000 both inclusive. | 
 **cursor** | **string** | Set &#x60;cursor&#x60; to &#x60;next_cursor&#x60; returned by the previous call to list items in the next page | 
 **teamId** | **string** |  | 

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

