# \AdminInviteRequestsDeniedApi

All URIs are relative to *https://slack.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AdminInviteRequestsDeniedList**](AdminInviteRequestsDeniedApi.md#AdminInviteRequestsDeniedList) | **Get** /admin.inviteRequests.denied.list | 



## AdminInviteRequestsDeniedList

> DefaultSuccessTemplate AdminInviteRequestsDeniedList(ctx).Token(token).TeamId(teamId).Cursor(cursor).Limit(limit).Execute()





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
    token := "token_example" // string | Authentication token. Requires scope: `admin.invites:read`
    teamId := "teamId_example" // string | ID for the workspace where the invite requests were made. (optional)
    cursor := "cursor_example" // string | Value of the `next_cursor` field sent as part of the previous api response (optional)
    limit := int32(56) // int32 | The number of results that will be returned by the API on each invocation. Must be between 1 - 1000 both inclusive (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.AdminInviteRequestsDeniedApi.AdminInviteRequestsDeniedList(context.Background()).Token(token).TeamId(teamId).Cursor(cursor).Limit(limit).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `AdminInviteRequestsDeniedApi.AdminInviteRequestsDeniedList``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `AdminInviteRequestsDeniedList`: DefaultSuccessTemplate
    fmt.Fprintf(os.Stdout, "Response from `AdminInviteRequestsDeniedApi.AdminInviteRequestsDeniedList`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiAdminInviteRequestsDeniedListRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;admin.invites:read&#x60; | 
 **teamId** | **string** | ID for the workspace where the invite requests were made. | 
 **cursor** | **string** | Value of the &#x60;next_cursor&#x60; field sent as part of the previous api response | 
 **limit** | **int32** | The number of results that will be returned by the API on each invocation. Must be between 1 - 1000 both inclusive | 

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

