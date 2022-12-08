# \AdminUsersSessionApi

All URIs are relative to *https://slack.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AdminUsersSessionInvalidate**](AdminUsersSessionApi.md#AdminUsersSessionInvalidate) | **Post** /admin.users.session.invalidate | 
[**AdminUsersSessionReset**](AdminUsersSessionApi.md#AdminUsersSessionReset) | **Post** /admin.users.session.reset | 



## AdminUsersSessionInvalidate

> DefaultSuccessTemplate AdminUsersSessionInvalidate(ctx).Token(token).SessionId(sessionId).TeamId(teamId).Execute()





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
    token := "token_example" // string | Authentication token. Requires scope: `admin.users:write`
    sessionId := int32(56) // int32 | 
    teamId := "teamId_example" // string | ID of the team that the session belongs to

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.AdminUsersSessionApi.AdminUsersSessionInvalidate(context.Background()).Token(token).SessionId(sessionId).TeamId(teamId).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `AdminUsersSessionApi.AdminUsersSessionInvalidate``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `AdminUsersSessionInvalidate`: DefaultSuccessTemplate
    fmt.Fprintf(os.Stdout, "Response from `AdminUsersSessionApi.AdminUsersSessionInvalidate`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiAdminUsersSessionInvalidateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;admin.users:write&#x60; | 
 **sessionId** | **int32** |  | 
 **teamId** | **string** | ID of the team that the session belongs to | 

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## AdminUsersSessionReset

> DefaultSuccessTemplate AdminUsersSessionReset(ctx).Token(token).UserId(userId).MobileOnly(mobileOnly).WebOnly(webOnly).Execute()





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
    token := "token_example" // string | Authentication token. Requires scope: `admin.users:write`
    userId := "userId_example" // string | The ID of the user to wipe sessions for
    mobileOnly := true // bool | Only expire mobile sessions (default: false) (optional)
    webOnly := true // bool | Only expire web sessions (default: false) (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.AdminUsersSessionApi.AdminUsersSessionReset(context.Background()).Token(token).UserId(userId).MobileOnly(mobileOnly).WebOnly(webOnly).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `AdminUsersSessionApi.AdminUsersSessionReset``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `AdminUsersSessionReset`: DefaultSuccessTemplate
    fmt.Fprintf(os.Stdout, "Response from `AdminUsersSessionApi.AdminUsersSessionReset`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiAdminUsersSessionResetRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;admin.users:write&#x60; | 
 **userId** | **string** | The ID of the user to wipe sessions for | 
 **mobileOnly** | **bool** | Only expire mobile sessions (default: false) | 
 **webOnly** | **bool** | Only expire web sessions (default: false) | 

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

