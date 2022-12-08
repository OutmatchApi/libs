# \AdminUsergroupsApi

All URIs are relative to *https://slack.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AdminUsergroupsAddChannels**](AdminUsergroupsApi.md#AdminUsergroupsAddChannels) | **Post** /admin.usergroups.addChannels | 
[**AdminUsergroupsAddTeams**](AdminUsergroupsApi.md#AdminUsergroupsAddTeams) | **Post** /admin.usergroups.addTeams | 
[**AdminUsergroupsListChannels**](AdminUsergroupsApi.md#AdminUsergroupsListChannels) | **Get** /admin.usergroups.listChannels | 
[**AdminUsergroupsRemoveChannels**](AdminUsergroupsApi.md#AdminUsergroupsRemoveChannels) | **Post** /admin.usergroups.removeChannels | 



## AdminUsergroupsAddChannels

> DefaultSuccessTemplate AdminUsergroupsAddChannels(ctx).Token(token).ChannelIds(channelIds).UsergroupId(usergroupId).TeamId(teamId).Execute()





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
    token := "token_example" // string | Authentication token. Requires scope: `admin.usergroups:write`
    channelIds := "channelIds_example" // string | Comma separated string of channel IDs.
    usergroupId := "usergroupId_example" // string | ID of the IDP group to add default channels for.
    teamId := "teamId_example" // string | The workspace to add default channels in. (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.AdminUsergroupsApi.AdminUsergroupsAddChannels(context.Background()).Token(token).ChannelIds(channelIds).UsergroupId(usergroupId).TeamId(teamId).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `AdminUsergroupsApi.AdminUsergroupsAddChannels``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `AdminUsergroupsAddChannels`: DefaultSuccessTemplate
    fmt.Fprintf(os.Stdout, "Response from `AdminUsergroupsApi.AdminUsergroupsAddChannels`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiAdminUsergroupsAddChannelsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;admin.usergroups:write&#x60; | 
 **channelIds** | **string** | Comma separated string of channel IDs. | 
 **usergroupId** | **string** | ID of the IDP group to add default channels for. | 
 **teamId** | **string** | The workspace to add default channels in. | 

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


## AdminUsergroupsAddTeams

> DefaultSuccessTemplate AdminUsergroupsAddTeams(ctx).Token(token).TeamIds(teamIds).UsergroupId(usergroupId).AutoProvision(autoProvision).Execute()





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
    token := "token_example" // string | Authentication token. Requires scope: `admin.teams:write`
    teamIds := "teamIds_example" // string | A comma separated list of encoded team (workspace) IDs. Each workspace *MUST* belong to the organization associated with the token.
    usergroupId := "usergroupId_example" // string | An encoded usergroup (IDP Group) ID.
    autoProvision := true // bool | When `true`, this method automatically creates new workspace accounts for the IDP group members. (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.AdminUsergroupsApi.AdminUsergroupsAddTeams(context.Background()).Token(token).TeamIds(teamIds).UsergroupId(usergroupId).AutoProvision(autoProvision).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `AdminUsergroupsApi.AdminUsergroupsAddTeams``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `AdminUsergroupsAddTeams`: DefaultSuccessTemplate
    fmt.Fprintf(os.Stdout, "Response from `AdminUsergroupsApi.AdminUsergroupsAddTeams`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiAdminUsergroupsAddTeamsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;admin.teams:write&#x60; | 
 **teamIds** | **string** | A comma separated list of encoded team (workspace) IDs. Each workspace *MUST* belong to the organization associated with the token. | 
 **usergroupId** | **string** | An encoded usergroup (IDP Group) ID. | 
 **autoProvision** | **bool** | When &#x60;true&#x60;, this method automatically creates new workspace accounts for the IDP group members. | 

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


## AdminUsergroupsListChannels

> DefaultSuccessTemplate AdminUsergroupsListChannels(ctx).Token(token).UsergroupId(usergroupId).TeamId(teamId).IncludeNumMembers(includeNumMembers).Execute()





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
    token := "token_example" // string | Authentication token. Requires scope: `admin.usergroups:read`
    usergroupId := "usergroupId_example" // string | ID of the IDP group to list default channels for.
    teamId := "teamId_example" // string | ID of the the workspace. (optional)
    includeNumMembers := true // bool | Flag to include or exclude the count of members per channel. (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.AdminUsergroupsApi.AdminUsergroupsListChannels(context.Background()).Token(token).UsergroupId(usergroupId).TeamId(teamId).IncludeNumMembers(includeNumMembers).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `AdminUsergroupsApi.AdminUsergroupsListChannels``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `AdminUsergroupsListChannels`: DefaultSuccessTemplate
    fmt.Fprintf(os.Stdout, "Response from `AdminUsergroupsApi.AdminUsergroupsListChannels`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiAdminUsergroupsListChannelsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;admin.usergroups:read&#x60; | 
 **usergroupId** | **string** | ID of the IDP group to list default channels for. | 
 **teamId** | **string** | ID of the the workspace. | 
 **includeNumMembers** | **bool** | Flag to include or exclude the count of members per channel. | 

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


## AdminUsergroupsRemoveChannels

> DefaultSuccessTemplate AdminUsergroupsRemoveChannels(ctx).Token(token).ChannelIds(channelIds).UsergroupId(usergroupId).Execute()





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
    token := "token_example" // string | Authentication token. Requires scope: `admin.usergroups:write`
    channelIds := "channelIds_example" // string | Comma-separated string of channel IDs
    usergroupId := "usergroupId_example" // string | ID of the IDP Group

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.AdminUsergroupsApi.AdminUsergroupsRemoveChannels(context.Background()).Token(token).ChannelIds(channelIds).UsergroupId(usergroupId).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `AdminUsergroupsApi.AdminUsergroupsRemoveChannels``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `AdminUsergroupsRemoveChannels`: DefaultSuccessTemplate
    fmt.Fprintf(os.Stdout, "Response from `AdminUsergroupsApi.AdminUsergroupsRemoveChannels`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiAdminUsergroupsRemoveChannelsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;admin.usergroups:write&#x60; | 
 **channelIds** | **string** | Comma-separated string of channel IDs | 
 **usergroupId** | **string** | ID of the IDP Group | 

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

