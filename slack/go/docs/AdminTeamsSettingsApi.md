# \AdminTeamsSettingsApi

All URIs are relative to *https://slack.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AdminTeamsSettingsInfo**](AdminTeamsSettingsApi.md#AdminTeamsSettingsInfo) | **Get** /admin.teams.settings.info | 
[**AdminTeamsSettingsSetDefaultChannels**](AdminTeamsSettingsApi.md#AdminTeamsSettingsSetDefaultChannels) | **Post** /admin.teams.settings.setDefaultChannels | 
[**AdminTeamsSettingsSetDescription**](AdminTeamsSettingsApi.md#AdminTeamsSettingsSetDescription) | **Post** /admin.teams.settings.setDescription | 
[**AdminTeamsSettingsSetDiscoverability**](AdminTeamsSettingsApi.md#AdminTeamsSettingsSetDiscoverability) | **Post** /admin.teams.settings.setDiscoverability | 
[**AdminTeamsSettingsSetIcon**](AdminTeamsSettingsApi.md#AdminTeamsSettingsSetIcon) | **Post** /admin.teams.settings.setIcon | 
[**AdminTeamsSettingsSetName**](AdminTeamsSettingsApi.md#AdminTeamsSettingsSetName) | **Post** /admin.teams.settings.setName | 



## AdminTeamsSettingsInfo

> DefaultSuccessTemplate AdminTeamsSettingsInfo(ctx).Token(token).TeamId(teamId).Execute()





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

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.AdminTeamsSettingsApi.AdminTeamsSettingsInfo(context.Background()).Token(token).TeamId(teamId).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `AdminTeamsSettingsApi.AdminTeamsSettingsInfo``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `AdminTeamsSettingsInfo`: DefaultSuccessTemplate
    fmt.Fprintf(os.Stdout, "Response from `AdminTeamsSettingsApi.AdminTeamsSettingsInfo`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiAdminTeamsSettingsInfoRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;admin.teams:read&#x60; | 
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


## AdminTeamsSettingsSetDefaultChannels

> DefaultSuccessTemplate AdminTeamsSettingsSetDefaultChannels(ctx).ChannelIds(channelIds).TeamId(teamId).Token(token).Execute()





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
    channelIds := "channelIds_example" // string | An array of channel IDs.
    teamId := "teamId_example" // string | ID for the workspace to set the default channel for.
    token := "token_example" // string | Authentication token. Requires scope: `admin.teams:write`

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.AdminTeamsSettingsApi.AdminTeamsSettingsSetDefaultChannels(context.Background()).ChannelIds(channelIds).TeamId(teamId).Token(token).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `AdminTeamsSettingsApi.AdminTeamsSettingsSetDefaultChannels``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `AdminTeamsSettingsSetDefaultChannels`: DefaultSuccessTemplate
    fmt.Fprintf(os.Stdout, "Response from `AdminTeamsSettingsApi.AdminTeamsSettingsSetDefaultChannels`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiAdminTeamsSettingsSetDefaultChannelsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelIds** | **string** | An array of channel IDs. | 
 **teamId** | **string** | ID for the workspace to set the default channel for. | 
 **token** | **string** | Authentication token. Requires scope: &#x60;admin.teams:write&#x60; | 

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


## AdminTeamsSettingsSetDescription

> DefaultSuccessTemplate AdminTeamsSettingsSetDescription(ctx).Token(token).Description(description).TeamId(teamId).Execute()





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
    description := "description_example" // string | The new description for the workspace.
    teamId := "teamId_example" // string | ID for the workspace to set the description for.

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.AdminTeamsSettingsApi.AdminTeamsSettingsSetDescription(context.Background()).Token(token).Description(description).TeamId(teamId).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `AdminTeamsSettingsApi.AdminTeamsSettingsSetDescription``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `AdminTeamsSettingsSetDescription`: DefaultSuccessTemplate
    fmt.Fprintf(os.Stdout, "Response from `AdminTeamsSettingsApi.AdminTeamsSettingsSetDescription`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiAdminTeamsSettingsSetDescriptionRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;admin.teams:write&#x60; | 
 **description** | **string** | The new description for the workspace. | 
 **teamId** | **string** | ID for the workspace to set the description for. | 

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


## AdminTeamsSettingsSetDiscoverability

> DefaultSuccessTemplate AdminTeamsSettingsSetDiscoverability(ctx).Token(token).Discoverability(discoverability).TeamId(teamId).Execute()





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
    discoverability := "discoverability_example" // string | This workspace's discovery setting. It must be set to one of `open`, `invite_only`, `closed`, or `unlisted`.
    teamId := "teamId_example" // string | The ID of the workspace to set discoverability on.

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.AdminTeamsSettingsApi.AdminTeamsSettingsSetDiscoverability(context.Background()).Token(token).Discoverability(discoverability).TeamId(teamId).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `AdminTeamsSettingsApi.AdminTeamsSettingsSetDiscoverability``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `AdminTeamsSettingsSetDiscoverability`: DefaultSuccessTemplate
    fmt.Fprintf(os.Stdout, "Response from `AdminTeamsSettingsApi.AdminTeamsSettingsSetDiscoverability`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiAdminTeamsSettingsSetDiscoverabilityRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;admin.teams:write&#x60; | 
 **discoverability** | **string** | This workspace&#39;s discovery setting. It must be set to one of &#x60;open&#x60;, &#x60;invite_only&#x60;, &#x60;closed&#x60;, or &#x60;unlisted&#x60;. | 
 **teamId** | **string** | The ID of the workspace to set discoverability on. | 

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


## AdminTeamsSettingsSetIcon

> DefaultSuccessTemplate AdminTeamsSettingsSetIcon(ctx).ImageUrl(imageUrl).TeamId(teamId).Token(token).Execute()





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
    imageUrl := "imageUrl_example" // string | Image URL for the icon
    teamId := "teamId_example" // string | ID for the workspace to set the icon for.
    token := "token_example" // string | Authentication token. Requires scope: `admin.teams:write`

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.AdminTeamsSettingsApi.AdminTeamsSettingsSetIcon(context.Background()).ImageUrl(imageUrl).TeamId(teamId).Token(token).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `AdminTeamsSettingsApi.AdminTeamsSettingsSetIcon``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `AdminTeamsSettingsSetIcon`: DefaultSuccessTemplate
    fmt.Fprintf(os.Stdout, "Response from `AdminTeamsSettingsApi.AdminTeamsSettingsSetIcon`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiAdminTeamsSettingsSetIconRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **imageUrl** | **string** | Image URL for the icon | 
 **teamId** | **string** | ID for the workspace to set the icon for. | 
 **token** | **string** | Authentication token. Requires scope: &#x60;admin.teams:write&#x60; | 

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


## AdminTeamsSettingsSetName

> DefaultSuccessTemplate AdminTeamsSettingsSetName(ctx).Token(token).Name(name).TeamId(teamId).Execute()





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
    name := "name_example" // string | The new name of the workspace.
    teamId := "teamId_example" // string | ID for the workspace to set the name for.

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.AdminTeamsSettingsApi.AdminTeamsSettingsSetName(context.Background()).Token(token).Name(name).TeamId(teamId).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `AdminTeamsSettingsApi.AdminTeamsSettingsSetName``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `AdminTeamsSettingsSetName`: DefaultSuccessTemplate
    fmt.Fprintf(os.Stdout, "Response from `AdminTeamsSettingsApi.AdminTeamsSettingsSetName`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiAdminTeamsSettingsSetNameRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;admin.teams:write&#x60; | 
 **name** | **string** | The new name of the workspace. | 
 **teamId** | **string** | ID for the workspace to set the name for. | 

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

