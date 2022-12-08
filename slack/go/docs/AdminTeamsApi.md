# \AdminTeamsApi

All URIs are relative to *https://slack.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AdminTeamsCreate**](AdminTeamsApi.md#AdminTeamsCreate) | **Post** /admin.teams.create | 
[**AdminTeamsList**](AdminTeamsApi.md#AdminTeamsList) | **Get** /admin.teams.list | 



## AdminTeamsCreate

> DefaultSuccessTemplate AdminTeamsCreate(ctx).Token(token).TeamDomain(teamDomain).TeamName(teamName).TeamDescription(teamDescription).TeamDiscoverability(teamDiscoverability).Execute()





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
    teamDomain := "teamDomain_example" // string | Team domain (for example, slacksoftballteam).
    teamName := "teamName_example" // string | Team name (for example, Slack Softball Team).
    teamDescription := "teamDescription_example" // string | Description for the team. (optional)
    teamDiscoverability := "teamDiscoverability_example" // string | Who can join the team. A team's discoverability can be `open`, `closed`, `invite_only`, or `unlisted`. (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.AdminTeamsApi.AdminTeamsCreate(context.Background()).Token(token).TeamDomain(teamDomain).TeamName(teamName).TeamDescription(teamDescription).TeamDiscoverability(teamDiscoverability).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `AdminTeamsApi.AdminTeamsCreate``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `AdminTeamsCreate`: DefaultSuccessTemplate
    fmt.Fprintf(os.Stdout, "Response from `AdminTeamsApi.AdminTeamsCreate`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiAdminTeamsCreateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;admin.teams:write&#x60; | 
 **teamDomain** | **string** | Team domain (for example, slacksoftballteam). | 
 **teamName** | **string** | Team name (for example, Slack Softball Team). | 
 **teamDescription** | **string** | Description for the team. | 
 **teamDiscoverability** | **string** | Who can join the team. A team&#39;s discoverability can be &#x60;open&#x60;, &#x60;closed&#x60;, &#x60;invite_only&#x60;, or &#x60;unlisted&#x60;. | 

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


## AdminTeamsList

> DefaultSuccessTemplate AdminTeamsList(ctx).Token(token).Limit(limit).Cursor(cursor).Execute()





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
    limit := int32(56) // int32 | The maximum number of items to return. Must be between 1 - 100 both inclusive. (optional)
    cursor := "cursor_example" // string | Set `cursor` to `next_cursor` returned by the previous call to list items in the next page. (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.AdminTeamsApi.AdminTeamsList(context.Background()).Token(token).Limit(limit).Cursor(cursor).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `AdminTeamsApi.AdminTeamsList``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `AdminTeamsList`: DefaultSuccessTemplate
    fmt.Fprintf(os.Stdout, "Response from `AdminTeamsApi.AdminTeamsList`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiAdminTeamsListRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;admin.teams:read&#x60; | 
 **limit** | **int32** | The maximum number of items to return. Must be between 1 - 100 both inclusive. | 
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

