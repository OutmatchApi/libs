# \AdminConversationsEkmApi

All URIs are relative to *https://slack.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AdminConversationsEkmListOriginalConnectedChannelInfo**](AdminConversationsEkmApi.md#AdminConversationsEkmListOriginalConnectedChannelInfo) | **Get** /admin.conversations.ekm.listOriginalConnectedChannelInfo | 



## AdminConversationsEkmListOriginalConnectedChannelInfo

> DefaultSuccessTemplate AdminConversationsEkmListOriginalConnectedChannelInfo(ctx).Token(token).ChannelIds(channelIds).TeamIds(teamIds).Limit(limit).Cursor(cursor).Execute()





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
    channelIds := "channelIds_example" // string | A comma-separated list of channels to filter to. (optional)
    teamIds := "teamIds_example" // string | A comma-separated list of the workspaces to which the channels you would like returned belong. (optional)
    limit := int32(56) // int32 | The maximum number of items to return. Must be between 1 - 1000 both inclusive. (optional)
    cursor := "cursor_example" // string | Set `cursor` to `next_cursor` returned by the previous call to list items in the next page. (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.AdminConversationsEkmApi.AdminConversationsEkmListOriginalConnectedChannelInfo(context.Background()).Token(token).ChannelIds(channelIds).TeamIds(teamIds).Limit(limit).Cursor(cursor).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `AdminConversationsEkmApi.AdminConversationsEkmListOriginalConnectedChannelInfo``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `AdminConversationsEkmListOriginalConnectedChannelInfo`: DefaultSuccessTemplate
    fmt.Fprintf(os.Stdout, "Response from `AdminConversationsEkmApi.AdminConversationsEkmListOriginalConnectedChannelInfo`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiAdminConversationsEkmListOriginalConnectedChannelInfoRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;admin.conversations:read&#x60; | 
 **channelIds** | **string** | A comma-separated list of channels to filter to. | 
 **teamIds** | **string** | A comma-separated list of the workspaces to which the channels you would like returned belong. | 
 **limit** | **int32** | The maximum number of items to return. Must be between 1 - 1000 both inclusive. | 
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

