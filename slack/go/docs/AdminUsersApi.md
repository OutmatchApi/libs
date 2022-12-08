# \AdminUsersApi

All URIs are relative to *https://slack.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AdminUsersAssign**](AdminUsersApi.md#AdminUsersAssign) | **Post** /admin.users.assign | 
[**AdminUsersInvite**](AdminUsersApi.md#AdminUsersInvite) | **Post** /admin.users.invite | 
[**AdminUsersList**](AdminUsersApi.md#AdminUsersList) | **Get** /admin.users.list | 
[**AdminUsersRemove**](AdminUsersApi.md#AdminUsersRemove) | **Post** /admin.users.remove | 
[**AdminUsersSetAdmin**](AdminUsersApi.md#AdminUsersSetAdmin) | **Post** /admin.users.setAdmin | 
[**AdminUsersSetExpiration**](AdminUsersApi.md#AdminUsersSetExpiration) | **Post** /admin.users.setExpiration | 
[**AdminUsersSetOwner**](AdminUsersApi.md#AdminUsersSetOwner) | **Post** /admin.users.setOwner | 
[**AdminUsersSetRegular**](AdminUsersApi.md#AdminUsersSetRegular) | **Post** /admin.users.setRegular | 



## AdminUsersAssign

> DefaultSuccessTemplate AdminUsersAssign(ctx).Token(token).TeamId(teamId).UserId(userId).ChannelIds(channelIds).IsRestricted(isRestricted).IsUltraRestricted(isUltraRestricted).Execute()





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
    teamId := "teamId_example" // string | The ID (`T1234`) of the workspace.
    userId := "userId_example" // string | The ID of the user to add to the workspace.
    channelIds := "channelIds_example" // string | Comma separated values of channel IDs to add user in the new workspace. (optional)
    isRestricted := true // bool | True if user should be added to the workspace as a guest. (optional)
    isUltraRestricted := true // bool | True if user should be added to the workspace as a single-channel guest. (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.AdminUsersApi.AdminUsersAssign(context.Background()).Token(token).TeamId(teamId).UserId(userId).ChannelIds(channelIds).IsRestricted(isRestricted).IsUltraRestricted(isUltraRestricted).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `AdminUsersApi.AdminUsersAssign``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `AdminUsersAssign`: DefaultSuccessTemplate
    fmt.Fprintf(os.Stdout, "Response from `AdminUsersApi.AdminUsersAssign`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiAdminUsersAssignRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;admin.users:write&#x60; | 
 **teamId** | **string** | The ID (&#x60;T1234&#x60;) of the workspace. | 
 **userId** | **string** | The ID of the user to add to the workspace. | 
 **channelIds** | **string** | Comma separated values of channel IDs to add user in the new workspace. | 
 **isRestricted** | **bool** | True if user should be added to the workspace as a guest. | 
 **isUltraRestricted** | **bool** | True if user should be added to the workspace as a single-channel guest. | 

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


## AdminUsersInvite

> DefaultSuccessTemplate AdminUsersInvite(ctx).Token(token).ChannelIds(channelIds).Email(email).TeamId(teamId).CustomMessage(customMessage).GuestExpirationTs(guestExpirationTs).IsRestricted(isRestricted).IsUltraRestricted(isUltraRestricted).RealName(realName).Resend(resend).Execute()





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
    channelIds := "channelIds_example" // string | A comma-separated list of `channel_id`s for this user to join. At least one channel is required.
    email := "email_example" // string | The email address of the person to invite.
    teamId := "teamId_example" // string | The ID (`T1234`) of the workspace.
    customMessage := "customMessage_example" // string | An optional message to send to the user in the invite email. (optional)
    guestExpirationTs := "guestExpirationTs_example" // string | Timestamp when guest account should be disabled. Only include this timestamp if you are inviting a guest user and you want their account to expire on a certain date. (optional)
    isRestricted := true // bool | Is this user a multi-channel guest user? (default: false) (optional)
    isUltraRestricted := true // bool | Is this user a single channel guest user? (default: false) (optional)
    realName := "realName_example" // string | Full name of the user. (optional)
    resend := true // bool | Allow this invite to be resent in the future if a user has not signed up yet. (default: false) (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.AdminUsersApi.AdminUsersInvite(context.Background()).Token(token).ChannelIds(channelIds).Email(email).TeamId(teamId).CustomMessage(customMessage).GuestExpirationTs(guestExpirationTs).IsRestricted(isRestricted).IsUltraRestricted(isUltraRestricted).RealName(realName).Resend(resend).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `AdminUsersApi.AdminUsersInvite``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `AdminUsersInvite`: DefaultSuccessTemplate
    fmt.Fprintf(os.Stdout, "Response from `AdminUsersApi.AdminUsersInvite`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiAdminUsersInviteRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;admin.users:write&#x60; | 
 **channelIds** | **string** | A comma-separated list of &#x60;channel_id&#x60;s for this user to join. At least one channel is required. | 
 **email** | **string** | The email address of the person to invite. | 
 **teamId** | **string** | The ID (&#x60;T1234&#x60;) of the workspace. | 
 **customMessage** | **string** | An optional message to send to the user in the invite email. | 
 **guestExpirationTs** | **string** | Timestamp when guest account should be disabled. Only include this timestamp if you are inviting a guest user and you want their account to expire on a certain date. | 
 **isRestricted** | **bool** | Is this user a multi-channel guest user? (default: false) | 
 **isUltraRestricted** | **bool** | Is this user a single channel guest user? (default: false) | 
 **realName** | **string** | Full name of the user. | 
 **resend** | **bool** | Allow this invite to be resent in the future if a user has not signed up yet. (default: false) | 

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


## AdminUsersList

> DefaultSuccessTemplate AdminUsersList(ctx).Token(token).TeamId(teamId).Cursor(cursor).Limit(limit).Execute()





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
    token := "token_example" // string | Authentication token. Requires scope: `admin.users:read`
    teamId := "teamId_example" // string | The ID (`T1234`) of the workspace.
    cursor := "cursor_example" // string | Set `cursor` to `next_cursor` returned by the previous call to list items in the next page. (optional)
    limit := int32(56) // int32 | Limit for how many users to be retrieved per page (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.AdminUsersApi.AdminUsersList(context.Background()).Token(token).TeamId(teamId).Cursor(cursor).Limit(limit).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `AdminUsersApi.AdminUsersList``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `AdminUsersList`: DefaultSuccessTemplate
    fmt.Fprintf(os.Stdout, "Response from `AdminUsersApi.AdminUsersList`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiAdminUsersListRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;admin.users:read&#x60; | 
 **teamId** | **string** | The ID (&#x60;T1234&#x60;) of the workspace. | 
 **cursor** | **string** | Set &#x60;cursor&#x60; to &#x60;next_cursor&#x60; returned by the previous call to list items in the next page. | 
 **limit** | **int32** | Limit for how many users to be retrieved per page | 

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


## AdminUsersRemove

> DefaultSuccessTemplate AdminUsersRemove(ctx).Token(token).TeamId(teamId).UserId(userId).Execute()





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
    teamId := "teamId_example" // string | The ID (`T1234`) of the workspace.
    userId := "userId_example" // string | The ID of the user to remove.

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.AdminUsersApi.AdminUsersRemove(context.Background()).Token(token).TeamId(teamId).UserId(userId).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `AdminUsersApi.AdminUsersRemove``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `AdminUsersRemove`: DefaultSuccessTemplate
    fmt.Fprintf(os.Stdout, "Response from `AdminUsersApi.AdminUsersRemove`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiAdminUsersRemoveRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;admin.users:write&#x60; | 
 **teamId** | **string** | The ID (&#x60;T1234&#x60;) of the workspace. | 
 **userId** | **string** | The ID of the user to remove. | 

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


## AdminUsersSetAdmin

> DefaultSuccessTemplate AdminUsersSetAdmin(ctx).Token(token).TeamId(teamId).UserId(userId).Execute()





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
    teamId := "teamId_example" // string | The ID (`T1234`) of the workspace.
    userId := "userId_example" // string | The ID of the user to designate as an admin.

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.AdminUsersApi.AdminUsersSetAdmin(context.Background()).Token(token).TeamId(teamId).UserId(userId).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `AdminUsersApi.AdminUsersSetAdmin``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `AdminUsersSetAdmin`: DefaultSuccessTemplate
    fmt.Fprintf(os.Stdout, "Response from `AdminUsersApi.AdminUsersSetAdmin`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiAdminUsersSetAdminRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;admin.users:write&#x60; | 
 **teamId** | **string** | The ID (&#x60;T1234&#x60;) of the workspace. | 
 **userId** | **string** | The ID of the user to designate as an admin. | 

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


## AdminUsersSetExpiration

> DefaultSuccessTemplate AdminUsersSetExpiration(ctx).Token(token).ExpirationTs(expirationTs).TeamId(teamId).UserId(userId).Execute()





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
    expirationTs := int32(56) // int32 | Timestamp when guest account should be disabled.
    teamId := "teamId_example" // string | The ID (`T1234`) of the workspace.
    userId := "userId_example" // string | The ID of the user to set an expiration for.

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.AdminUsersApi.AdminUsersSetExpiration(context.Background()).Token(token).ExpirationTs(expirationTs).TeamId(teamId).UserId(userId).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `AdminUsersApi.AdminUsersSetExpiration``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `AdminUsersSetExpiration`: DefaultSuccessTemplate
    fmt.Fprintf(os.Stdout, "Response from `AdminUsersApi.AdminUsersSetExpiration`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiAdminUsersSetExpirationRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;admin.users:write&#x60; | 
 **expirationTs** | **int32** | Timestamp when guest account should be disabled. | 
 **teamId** | **string** | The ID (&#x60;T1234&#x60;) of the workspace. | 
 **userId** | **string** | The ID of the user to set an expiration for. | 

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


## AdminUsersSetOwner

> DefaultSuccessTemplate AdminUsersSetOwner(ctx).Token(token).TeamId(teamId).UserId(userId).Execute()





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
    teamId := "teamId_example" // string | The ID (`T1234`) of the workspace.
    userId := "userId_example" // string | Id of the user to promote to owner.

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.AdminUsersApi.AdminUsersSetOwner(context.Background()).Token(token).TeamId(teamId).UserId(userId).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `AdminUsersApi.AdminUsersSetOwner``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `AdminUsersSetOwner`: DefaultSuccessTemplate
    fmt.Fprintf(os.Stdout, "Response from `AdminUsersApi.AdminUsersSetOwner`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiAdminUsersSetOwnerRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;admin.users:write&#x60; | 
 **teamId** | **string** | The ID (&#x60;T1234&#x60;) of the workspace. | 
 **userId** | **string** | Id of the user to promote to owner. | 

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


## AdminUsersSetRegular

> DefaultSuccessTemplate AdminUsersSetRegular(ctx).Token(token).TeamId(teamId).UserId(userId).Execute()





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
    teamId := "teamId_example" // string | The ID (`T1234`) of the workspace.
    userId := "userId_example" // string | The ID of the user to designate as a regular user.

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.AdminUsersApi.AdminUsersSetRegular(context.Background()).Token(token).TeamId(teamId).UserId(userId).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `AdminUsersApi.AdminUsersSetRegular``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `AdminUsersSetRegular`: DefaultSuccessTemplate
    fmt.Fprintf(os.Stdout, "Response from `AdminUsersApi.AdminUsersSetRegular`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiAdminUsersSetRegularRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;admin.users:write&#x60; | 
 **teamId** | **string** | The ID (&#x60;T1234&#x60;) of the workspace. | 
 **userId** | **string** | The ID of the user to designate as a regular user. | 

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

