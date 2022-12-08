# \AdminConversationsRestrictAccessApi

All URIs are relative to *https://slack.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AdminConversationsRestrictAccessAddGroup**](AdminConversationsRestrictAccessApi.md#AdminConversationsRestrictAccessAddGroup) | **Post** /admin.conversations.restrictAccess.addGroup | 
[**AdminConversationsRestrictAccessListGroups**](AdminConversationsRestrictAccessApi.md#AdminConversationsRestrictAccessListGroups) | **Get** /admin.conversations.restrictAccess.listGroups | 
[**AdminConversationsRestrictAccessRemoveGroup**](AdminConversationsRestrictAccessApi.md#AdminConversationsRestrictAccessRemoveGroup) | **Post** /admin.conversations.restrictAccess.removeGroup | 



## AdminConversationsRestrictAccessAddGroup

> DefaultSuccessTemplate AdminConversationsRestrictAccessAddGroup(ctx).ChannelId(channelId).GroupId(groupId).Token(token).TeamId(teamId).Execute()





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
    channelId := "channelId_example" // string | The channel to link this group to.
    groupId := "groupId_example" // string | The [IDP Group](https://slack.com/help/articles/115001435788-Connect-identity-provider-groups-to-your-Enterprise-Grid-org) ID to be an allowlist for the private channel.
    token := "token_example" // string | Authentication token. Requires scope: `admin.conversations:write`
    teamId := "teamId_example" // string | The workspace where the channel exists. This argument is required for channels only tied to one workspace, and optional for channels that are shared across an organization. (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.AdminConversationsRestrictAccessApi.AdminConversationsRestrictAccessAddGroup(context.Background()).ChannelId(channelId).GroupId(groupId).Token(token).TeamId(teamId).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `AdminConversationsRestrictAccessApi.AdminConversationsRestrictAccessAddGroup``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `AdminConversationsRestrictAccessAddGroup`: DefaultSuccessTemplate
    fmt.Fprintf(os.Stdout, "Response from `AdminConversationsRestrictAccessApi.AdminConversationsRestrictAccessAddGroup`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiAdminConversationsRestrictAccessAddGroupRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelId** | **string** | The channel to link this group to. | 
 **groupId** | **string** | The [IDP Group](https://slack.com/help/articles/115001435788-Connect-identity-provider-groups-to-your-Enterprise-Grid-org) ID to be an allowlist for the private channel. | 
 **token** | **string** | Authentication token. Requires scope: &#x60;admin.conversations:write&#x60; | 
 **teamId** | **string** | The workspace where the channel exists. This argument is required for channels only tied to one workspace, and optional for channels that are shared across an organization. | 

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


## AdminConversationsRestrictAccessListGroups

> DefaultSuccessTemplate AdminConversationsRestrictAccessListGroups(ctx).Token(token).ChannelId(channelId).TeamId(teamId).Execute()





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
    token := "token_example" // string | Authentication token. Requires scope: `admin.conversations:read`
    channelId := "channelId_example" // string | 
    teamId := "teamId_example" // string | The workspace where the channel exists. This argument is required for channels only tied to one workspace, and optional for channels that are shared across an organization. (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.AdminConversationsRestrictAccessApi.AdminConversationsRestrictAccessListGroups(context.Background()).Token(token).ChannelId(channelId).TeamId(teamId).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `AdminConversationsRestrictAccessApi.AdminConversationsRestrictAccessListGroups``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `AdminConversationsRestrictAccessListGroups`: DefaultSuccessTemplate
    fmt.Fprintf(os.Stdout, "Response from `AdminConversationsRestrictAccessApi.AdminConversationsRestrictAccessListGroups`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiAdminConversationsRestrictAccessListGroupsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;admin.conversations:read&#x60; | 
 **channelId** | **string** |  | 
 **teamId** | **string** | The workspace where the channel exists. This argument is required for channels only tied to one workspace, and optional for channels that are shared across an organization. | 

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


## AdminConversationsRestrictAccessRemoveGroup

> DefaultSuccessTemplate AdminConversationsRestrictAccessRemoveGroup(ctx).ChannelId(channelId).GroupId(groupId).TeamId(teamId).Token(token).Execute()





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
    channelId := "channelId_example" // string | The channel to remove the linked group from.
    groupId := "groupId_example" // string | The [IDP Group](https://slack.com/help/articles/115001435788-Connect-identity-provider-groups-to-your-Enterprise-Grid-org) ID to remove from the private channel.
    teamId := "teamId_example" // string | The workspace where the channel exists. This argument is required for channels only tied to one workspace, and optional for channels that are shared across an organization.
    token := "token_example" // string | Authentication token. Requires scope: `admin.conversations:write`

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.AdminConversationsRestrictAccessApi.AdminConversationsRestrictAccessRemoveGroup(context.Background()).ChannelId(channelId).GroupId(groupId).TeamId(teamId).Token(token).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `AdminConversationsRestrictAccessApi.AdminConversationsRestrictAccessRemoveGroup``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `AdminConversationsRestrictAccessRemoveGroup`: DefaultSuccessTemplate
    fmt.Fprintf(os.Stdout, "Response from `AdminConversationsRestrictAccessApi.AdminConversationsRestrictAccessRemoveGroup`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiAdminConversationsRestrictAccessRemoveGroupRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelId** | **string** | The channel to remove the linked group from. | 
 **groupId** | **string** | The [IDP Group](https://slack.com/help/articles/115001435788-Connect-identity-provider-groups-to-your-Enterprise-Grid-org) ID to remove from the private channel. | 
 **teamId** | **string** | The workspace where the channel exists. This argument is required for channels only tied to one workspace, and optional for channels that are shared across an organization. | 
 **token** | **string** | Authentication token. Requires scope: &#x60;admin.conversations:write&#x60; | 

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

