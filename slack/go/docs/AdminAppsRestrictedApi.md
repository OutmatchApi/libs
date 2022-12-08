# \AdminAppsRestrictedApi

All URIs are relative to *https://slack.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AdminAppsRestrictedList**](AdminAppsRestrictedApi.md#AdminAppsRestrictedList) | **Get** /admin.apps.restricted.list | 



## AdminAppsRestrictedList

> DefaultSuccessTemplate AdminAppsRestrictedList(ctx).Token(token).Limit(limit).Cursor(cursor).TeamId(teamId).EnterpriseId(enterpriseId).Execute()





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
    enterpriseId := "enterpriseId_example" // string |  (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.AdminAppsRestrictedApi.AdminAppsRestrictedList(context.Background()).Token(token).Limit(limit).Cursor(cursor).TeamId(teamId).EnterpriseId(enterpriseId).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `AdminAppsRestrictedApi.AdminAppsRestrictedList``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `AdminAppsRestrictedList`: DefaultSuccessTemplate
    fmt.Fprintf(os.Stdout, "Response from `AdminAppsRestrictedApi.AdminAppsRestrictedList`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiAdminAppsRestrictedListRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;admin.apps:read&#x60; | 
 **limit** | **int32** | The maximum number of items to return. Must be between 1 - 1000 both inclusive. | 
 **cursor** | **string** | Set &#x60;cursor&#x60; to &#x60;next_cursor&#x60; returned by the previous call to list items in the next page | 
 **teamId** | **string** |  | 
 **enterpriseId** | **string** |  | 

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

