# \AdminTeamsAdminsApi

All URIs are relative to *https://slack.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AdminTeamsAdminsList**](AdminTeamsAdminsApi.md#AdminTeamsAdminsList) | **Get** /admin.teams.admins.list | 



## AdminTeamsAdminsList

> DefaultSuccessTemplate AdminTeamsAdminsList(ctx).Token(token).TeamId(teamId).Limit(limit).Cursor(cursor).Execute()





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
    token := "token_example" // string | Authentication token. Requires scope: `admin.teams:read`
    teamId := "teamId_example" // string | 
    limit := int32(56) // int32 | The maximum number of items to return. (optional)
    cursor := "cursor_example" // string | Set `cursor` to `next_cursor` returned by the previous call to list items in the next page. (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.AdminTeamsAdminsApi.AdminTeamsAdminsList(context.Background()).Token(token).TeamId(teamId).Limit(limit).Cursor(cursor).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `AdminTeamsAdminsApi.AdminTeamsAdminsList``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `AdminTeamsAdminsList`: DefaultSuccessTemplate
    fmt.Fprintf(os.Stdout, "Response from `AdminTeamsAdminsApi.AdminTeamsAdminsList`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiAdminTeamsAdminsListRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;admin.teams:read&#x60; | 
 **teamId** | **string** |  | 
 **limit** | **int32** | The maximum number of items to return. | 
 **cursor** | **string** | Set &#x60;cursor&#x60; to &#x60;next_cursor&#x60; returned by the previous call to list items in the next page. | 

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

