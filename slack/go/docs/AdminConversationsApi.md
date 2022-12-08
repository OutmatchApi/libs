# \AdminConversationsApi

All URIs are relative to *https://slack.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AdminConversationsArchive**](AdminConversationsApi.md#AdminConversationsArchive) | **Post** /admin.conversations.archive | 
[**AdminConversationsConvertToPrivate**](AdminConversationsApi.md#AdminConversationsConvertToPrivate) | **Post** /admin.conversations.convertToPrivate | 
[**AdminConversationsCreate**](AdminConversationsApi.md#AdminConversationsCreate) | **Post** /admin.conversations.create | 
[**AdminConversationsDelete**](AdminConversationsApi.md#AdminConversationsDelete) | **Post** /admin.conversations.delete | 
[**AdminConversationsDisconnectShared**](AdminConversationsApi.md#AdminConversationsDisconnectShared) | **Post** /admin.conversations.disconnectShared | 
[**AdminConversationsGetConversationPrefs**](AdminConversationsApi.md#AdminConversationsGetConversationPrefs) | **Get** /admin.conversations.getConversationPrefs | 
[**AdminConversationsGetTeams**](AdminConversationsApi.md#AdminConversationsGetTeams) | **Get** /admin.conversations.getTeams | 
[**AdminConversationsInvite**](AdminConversationsApi.md#AdminConversationsInvite) | **Post** /admin.conversations.invite | 
[**AdminConversationsRename**](AdminConversationsApi.md#AdminConversationsRename) | **Post** /admin.conversations.rename | 
[**AdminConversationsSearch**](AdminConversationsApi.md#AdminConversationsSearch) | **Get** /admin.conversations.search | 
[**AdminConversationsSetConversationPrefs**](AdminConversationsApi.md#AdminConversationsSetConversationPrefs) | **Post** /admin.conversations.setConversationPrefs | 
[**AdminConversationsSetTeams**](AdminConversationsApi.md#AdminConversationsSetTeams) | **Post** /admin.conversations.setTeams | 
[**AdminConversationsUnarchive**](AdminConversationsApi.md#AdminConversationsUnarchive) | **Post** /admin.conversations.unarchive | 



## AdminConversationsArchive

> AdminConversationsArchiveSchema AdminConversationsArchive(ctx).Token(token).ChannelId(channelId).Execute()





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
    token := "token_example" // string | Authentication token. Requires scope: `admin.conversations:write`
    channelId := "channelId_example" // string | The channel to archive.

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.AdminConversationsApi.AdminConversationsArchive(context.Background()).Token(token).ChannelId(channelId).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `AdminConversationsApi.AdminConversationsArchive``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `AdminConversationsArchive`: AdminConversationsArchiveSchema
    fmt.Fprintf(os.Stdout, "Response from `AdminConversationsApi.AdminConversationsArchive`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiAdminConversationsArchiveRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;admin.conversations:write&#x60; | 
 **channelId** | **string** | The channel to archive. | 

### Return type

[**AdminConversationsArchiveSchema**](AdminConversationsArchiveSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## AdminConversationsConvertToPrivate

> AdminConversationsConvertToPrivateSchema AdminConversationsConvertToPrivate(ctx).Token(token).ChannelId(channelId).Execute()





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
    token := "token_example" // string | Authentication token. Requires scope: `admin.conversations:write`
    channelId := "channelId_example" // string | The channel to convert to private.

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.AdminConversationsApi.AdminConversationsConvertToPrivate(context.Background()).Token(token).ChannelId(channelId).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `AdminConversationsApi.AdminConversationsConvertToPrivate``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `AdminConversationsConvertToPrivate`: AdminConversationsConvertToPrivateSchema
    fmt.Fprintf(os.Stdout, "Response from `AdminConversationsApi.AdminConversationsConvertToPrivate`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiAdminConversationsConvertToPrivateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;admin.conversations:write&#x60; | 
 **channelId** | **string** | The channel to convert to private. | 

### Return type

[**AdminConversationsConvertToPrivateSchema**](AdminConversationsConvertToPrivateSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## AdminConversationsCreate

> AdminConversationsCreateSchema AdminConversationsCreate(ctx).Token(token).IsPrivate(isPrivate).Name(name).Description(description).OrgWide(orgWide).TeamId(teamId).Execute()





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
    token := "token_example" // string | Authentication token. Requires scope: `admin.conversations:write`
    isPrivate := true // bool | When `true`, creates a private channel instead of a public channel
    name := "name_example" // string | Name of the public or private channel to create.
    description := "description_example" // string | Description of the public or private channel to create. (optional)
    orgWide := true // bool | When `true`, the channel will be available org-wide. Note: if the channel is not `org_wide=true`, you must specify a `team_id` for this channel (optional)
    teamId := "teamId_example" // string | The workspace to create the channel in. Note: this argument is required unless you set `org_wide=true`. (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.AdminConversationsApi.AdminConversationsCreate(context.Background()).Token(token).IsPrivate(isPrivate).Name(name).Description(description).OrgWide(orgWide).TeamId(teamId).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `AdminConversationsApi.AdminConversationsCreate``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `AdminConversationsCreate`: AdminConversationsCreateSchema
    fmt.Fprintf(os.Stdout, "Response from `AdminConversationsApi.AdminConversationsCreate`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiAdminConversationsCreateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;admin.conversations:write&#x60; | 
 **isPrivate** | **bool** | When &#x60;true&#x60;, creates a private channel instead of a public channel | 
 **name** | **string** | Name of the public or private channel to create. | 
 **description** | **string** | Description of the public or private channel to create. | 
 **orgWide** | **bool** | When &#x60;true&#x60;, the channel will be available org-wide. Note: if the channel is not &#x60;org_wide&#x3D;true&#x60;, you must specify a &#x60;team_id&#x60; for this channel | 
 **teamId** | **string** | The workspace to create the channel in. Note: this argument is required unless you set &#x60;org_wide&#x3D;true&#x60;. | 

### Return type

[**AdminConversationsCreateSchema**](AdminConversationsCreateSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## AdminConversationsDelete

> AdminConversationsDeleteSchema AdminConversationsDelete(ctx).Token(token).ChannelId(channelId).Execute()





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
    token := "token_example" // string | Authentication token. Requires scope: `admin.conversations:write`
    channelId := "channelId_example" // string | The channel to delete.

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.AdminConversationsApi.AdminConversationsDelete(context.Background()).Token(token).ChannelId(channelId).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `AdminConversationsApi.AdminConversationsDelete``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `AdminConversationsDelete`: AdminConversationsDeleteSchema
    fmt.Fprintf(os.Stdout, "Response from `AdminConversationsApi.AdminConversationsDelete`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiAdminConversationsDeleteRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;admin.conversations:write&#x60; | 
 **channelId** | **string** | The channel to delete. | 

### Return type

[**AdminConversationsDeleteSchema**](AdminConversationsDeleteSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## AdminConversationsDisconnectShared

> AdminConversationsRenameSchema AdminConversationsDisconnectShared(ctx).Token(token).ChannelId(channelId).LeavingTeamIds(leavingTeamIds).Execute()





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
    token := "token_example" // string | Authentication token. Requires scope: `admin.conversations:write`
    channelId := "channelId_example" // string | The channel to be disconnected from some workspaces.
    leavingTeamIds := "leavingTeamIds_example" // string | The team to be removed from the channel. Currently only a single team id can be specified. (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.AdminConversationsApi.AdminConversationsDisconnectShared(context.Background()).Token(token).ChannelId(channelId).LeavingTeamIds(leavingTeamIds).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `AdminConversationsApi.AdminConversationsDisconnectShared``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `AdminConversationsDisconnectShared`: AdminConversationsRenameSchema
    fmt.Fprintf(os.Stdout, "Response from `AdminConversationsApi.AdminConversationsDisconnectShared`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiAdminConversationsDisconnectSharedRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;admin.conversations:write&#x60; | 
 **channelId** | **string** | The channel to be disconnected from some workspaces. | 
 **leavingTeamIds** | **string** | The team to be removed from the channel. Currently only a single team id can be specified. | 

### Return type

[**AdminConversationsRenameSchema**](AdminConversationsRenameSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## AdminConversationsGetConversationPrefs

> AdminConversationsGetConversationPrefsSchema AdminConversationsGetConversationPrefs(ctx).Token(token).ChannelId(channelId).Execute()





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
    channelId := "channelId_example" // string | The channel to get preferences for.

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.AdminConversationsApi.AdminConversationsGetConversationPrefs(context.Background()).Token(token).ChannelId(channelId).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `AdminConversationsApi.AdminConversationsGetConversationPrefs``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `AdminConversationsGetConversationPrefs`: AdminConversationsGetConversationPrefsSchema
    fmt.Fprintf(os.Stdout, "Response from `AdminConversationsApi.AdminConversationsGetConversationPrefs`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiAdminConversationsGetConversationPrefsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;admin.conversations:read&#x60; | 
 **channelId** | **string** | The channel to get preferences for. | 

### Return type

[**AdminConversationsGetConversationPrefsSchema**](AdminConversationsGetConversationPrefsSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## AdminConversationsGetTeams

> AdminConversationsGetTeamsSchema AdminConversationsGetTeams(ctx).Token(token).ChannelId(channelId).Cursor(cursor).Limit(limit).Execute()





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
    channelId := "channelId_example" // string | The channel to determine connected workspaces within the organization for.
    cursor := "cursor_example" // string | Set `cursor` to `next_cursor` returned by the previous call to list items in the next page (optional)
    limit := int32(56) // int32 | The maximum number of items to return. Must be between 1 - 1000 both inclusive. (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.AdminConversationsApi.AdminConversationsGetTeams(context.Background()).Token(token).ChannelId(channelId).Cursor(cursor).Limit(limit).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `AdminConversationsApi.AdminConversationsGetTeams``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `AdminConversationsGetTeams`: AdminConversationsGetTeamsSchema
    fmt.Fprintf(os.Stdout, "Response from `AdminConversationsApi.AdminConversationsGetTeams`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiAdminConversationsGetTeamsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;admin.conversations:read&#x60; | 
 **channelId** | **string** | The channel to determine connected workspaces within the organization for. | 
 **cursor** | **string** | Set &#x60;cursor&#x60; to &#x60;next_cursor&#x60; returned by the previous call to list items in the next page | 
 **limit** | **int32** | The maximum number of items to return. Must be between 1 - 1000 both inclusive. | 

### Return type

[**AdminConversationsGetTeamsSchema**](AdminConversationsGetTeamsSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## AdminConversationsInvite

> AdminConversationsInviteSchema AdminConversationsInvite(ctx).Token(token).ChannelId(channelId).UserIds(userIds).Execute()





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
    token := "token_example" // string | Authentication token. Requires scope: `admin.conversations:write`
    channelId := "channelId_example" // string | The channel that the users will be invited to.
    userIds := "userIds_example" // string | The users to invite.

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.AdminConversationsApi.AdminConversationsInvite(context.Background()).Token(token).ChannelId(channelId).UserIds(userIds).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `AdminConversationsApi.AdminConversationsInvite``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `AdminConversationsInvite`: AdminConversationsInviteSchema
    fmt.Fprintf(os.Stdout, "Response from `AdminConversationsApi.AdminConversationsInvite`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiAdminConversationsInviteRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;admin.conversations:write&#x60; | 
 **channelId** | **string** | The channel that the users will be invited to. | 
 **userIds** | **string** | The users to invite. | 

### Return type

[**AdminConversationsInviteSchema**](AdminConversationsInviteSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## AdminConversationsRename

> AdminConversationsRenameSchema1 AdminConversationsRename(ctx).Token(token).ChannelId(channelId).Name(name).Execute()





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
    token := "token_example" // string | Authentication token. Requires scope: `admin.conversations:write`
    channelId := "channelId_example" // string | The channel to rename.
    name := "name_example" // string | 

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.AdminConversationsApi.AdminConversationsRename(context.Background()).Token(token).ChannelId(channelId).Name(name).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `AdminConversationsApi.AdminConversationsRename``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `AdminConversationsRename`: AdminConversationsRenameSchema1
    fmt.Fprintf(os.Stdout, "Response from `AdminConversationsApi.AdminConversationsRename`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiAdminConversationsRenameRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;admin.conversations:write&#x60; | 
 **channelId** | **string** | The channel to rename. | 
 **name** | **string** |  | 

### Return type

[**AdminConversationsRenameSchema1**](AdminConversationsRenameSchema1.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## AdminConversationsSearch

> AdminConversationsSearchSchema AdminConversationsSearch(ctx).Token(token).TeamIds(teamIds).Query(query).Limit(limit).Cursor(cursor).SearchChannelTypes(searchChannelTypes).Sort(sort).SortDir(sortDir).Execute()





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
    teamIds := "teamIds_example" // string | Comma separated string of team IDs, signifying the workspaces to search through. (optional)
    query := "query_example" // string | Name of the the channel to query by. (optional)
    limit := int32(56) // int32 | Maximum number of items to be returned. Must be between 1 - 20 both inclusive. Default is 10. (optional)
    cursor := "cursor_example" // string | Set `cursor` to `next_cursor` returned by the previous call to list items in the next page. (optional)
    searchChannelTypes := "searchChannelTypes_example" // string | The type of channel to include or exclude in the search. For example `private` will search private channels, while `private_exclude` will exclude them. For a full list of types, check the [Types section](#types). (optional)
    sort := "sort_example" // string | Possible values are `relevant` (search ranking based on what we think is closest), `name` (alphabetical), `member_count` (number of users in the channel), and `created` (date channel was created). You can optionally pair this with the `sort_dir` arg to change how it is sorted  (optional)
    sortDir := "sortDir_example" // string | Sort direction. Possible values are `asc` for ascending order like (1, 2, 3) or (a, b, c), and `desc` for descending order like (3, 2, 1) or (c, b, a) (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.AdminConversationsApi.AdminConversationsSearch(context.Background()).Token(token).TeamIds(teamIds).Query(query).Limit(limit).Cursor(cursor).SearchChannelTypes(searchChannelTypes).Sort(sort).SortDir(sortDir).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `AdminConversationsApi.AdminConversationsSearch``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `AdminConversationsSearch`: AdminConversationsSearchSchema
    fmt.Fprintf(os.Stdout, "Response from `AdminConversationsApi.AdminConversationsSearch`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiAdminConversationsSearchRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;admin.conversations:read&#x60; | 
 **teamIds** | **string** | Comma separated string of team IDs, signifying the workspaces to search through. | 
 **query** | **string** | Name of the the channel to query by. | 
 **limit** | **int32** | Maximum number of items to be returned. Must be between 1 - 20 both inclusive. Default is 10. | 
 **cursor** | **string** | Set &#x60;cursor&#x60; to &#x60;next_cursor&#x60; returned by the previous call to list items in the next page. | 
 **searchChannelTypes** | **string** | The type of channel to include or exclude in the search. For example &#x60;private&#x60; will search private channels, while &#x60;private_exclude&#x60; will exclude them. For a full list of types, check the [Types section](#types). | 
 **sort** | **string** | Possible values are &#x60;relevant&#x60; (search ranking based on what we think is closest), &#x60;name&#x60; (alphabetical), &#x60;member_count&#x60; (number of users in the channel), and &#x60;created&#x60; (date channel was created). You can optionally pair this with the &#x60;sort_dir&#x60; arg to change how it is sorted  | 
 **sortDir** | **string** | Sort direction. Possible values are &#x60;asc&#x60; for ascending order like (1, 2, 3) or (a, b, c), and &#x60;desc&#x60; for descending order like (3, 2, 1) or (c, b, a) | 

### Return type

[**AdminConversationsSearchSchema**](AdminConversationsSearchSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## AdminConversationsSetConversationPrefs

> AdminConversationsSetConversationPrefsSchema AdminConversationsSetConversationPrefs(ctx).Token(token).ChannelId(channelId).Prefs(prefs).Execute()





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
    token := "token_example" // string | Authentication token. Requires scope: `admin.conversations:write`
    channelId := "channelId_example" // string | The channel to set the prefs for
    prefs := "prefs_example" // string | The prefs for this channel in a stringified JSON format.

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.AdminConversationsApi.AdminConversationsSetConversationPrefs(context.Background()).Token(token).ChannelId(channelId).Prefs(prefs).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `AdminConversationsApi.AdminConversationsSetConversationPrefs``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `AdminConversationsSetConversationPrefs`: AdminConversationsSetConversationPrefsSchema
    fmt.Fprintf(os.Stdout, "Response from `AdminConversationsApi.AdminConversationsSetConversationPrefs`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiAdminConversationsSetConversationPrefsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;admin.conversations:write&#x60; | 
 **channelId** | **string** | The channel to set the prefs for | 
 **prefs** | **string** | The prefs for this channel in a stringified JSON format. | 

### Return type

[**AdminConversationsSetConversationPrefsSchema**](AdminConversationsSetConversationPrefsSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## AdminConversationsSetTeams

> DefaultSuccessTemplate AdminConversationsSetTeams(ctx).Token(token).ChannelId(channelId).OrgChannel(orgChannel).TargetTeamIds(targetTeamIds).TeamId(teamId).Execute()





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
    token := "token_example" // string | Authentication token. Requires scope: `admin.conversations:write`
    channelId := "channelId_example" // string | The encoded `channel_id` to add or remove to workspaces.
    orgChannel := true // bool | True if channel has to be converted to an org channel (optional)
    targetTeamIds := "targetTeamIds_example" // string | A comma-separated list of workspaces to which the channel should be shared. Not required if the channel is being shared org-wide. (optional)
    teamId := "teamId_example" // string | The workspace to which the channel belongs. Omit this argument if the channel is a cross-workspace shared channel. (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.AdminConversationsApi.AdminConversationsSetTeams(context.Background()).Token(token).ChannelId(channelId).OrgChannel(orgChannel).TargetTeamIds(targetTeamIds).TeamId(teamId).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `AdminConversationsApi.AdminConversationsSetTeams``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `AdminConversationsSetTeams`: DefaultSuccessTemplate
    fmt.Fprintf(os.Stdout, "Response from `AdminConversationsApi.AdminConversationsSetTeams`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiAdminConversationsSetTeamsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;admin.conversations:write&#x60; | 
 **channelId** | **string** | The encoded &#x60;channel_id&#x60; to add or remove to workspaces. | 
 **orgChannel** | **bool** | True if channel has to be converted to an org channel | 
 **targetTeamIds** | **string** | A comma-separated list of workspaces to which the channel should be shared. Not required if the channel is being shared org-wide. | 
 **teamId** | **string** | The workspace to which the channel belongs. Omit this argument if the channel is a cross-workspace shared channel. | 

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


## AdminConversationsUnarchive

> AdminConversationsUnarchiveSchema AdminConversationsUnarchive(ctx).Token(token).ChannelId(channelId).Execute()





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
    token := "token_example" // string | Authentication token. Requires scope: `admin.conversations:write`
    channelId := "channelId_example" // string | The channel to unarchive.

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.AdminConversationsApi.AdminConversationsUnarchive(context.Background()).Token(token).ChannelId(channelId).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `AdminConversationsApi.AdminConversationsUnarchive``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `AdminConversationsUnarchive`: AdminConversationsUnarchiveSchema
    fmt.Fprintf(os.Stdout, "Response from `AdminConversationsApi.AdminConversationsUnarchive`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiAdminConversationsUnarchiveRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;admin.conversations:write&#x60; | 
 **channelId** | **string** | The channel to unarchive. | 

### Return type

[**AdminConversationsUnarchiveSchema**](AdminConversationsUnarchiveSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

