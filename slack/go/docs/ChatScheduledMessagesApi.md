# \ChatScheduledMessagesApi

All URIs are relative to *https://slack.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ChatScheduledMessagesList**](ChatScheduledMessagesApi.md#ChatScheduledMessagesList) | **Get** /chat.scheduledMessages.list | 



## ChatScheduledMessagesList

> ChatScheduledMessagesListSchema ChatScheduledMessagesList(ctx).Token(token).Channel(channel).Latest(latest).Oldest(oldest).Limit(limit).Cursor(cursor).Execute()





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
    token := "token_example" // string | Authentication token. Requires scope: `none` (optional)
    channel := "channel_example" // string | The channel of the scheduled messages (optional)
    latest := float32(8.14) // float32 | A UNIX timestamp of the latest value in the time range (optional)
    oldest := float32(8.14) // float32 | A UNIX timestamp of the oldest value in the time range (optional)
    limit := int32(56) // int32 | Maximum number of original entries to return. (optional)
    cursor := "cursor_example" // string | For pagination purposes, this is the `cursor` value returned from a previous call to `chat.scheduledmessages.list` indicating where you want to start this call from. (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.ChatScheduledMessagesApi.ChatScheduledMessagesList(context.Background()).Token(token).Channel(channel).Latest(latest).Oldest(oldest).Limit(limit).Cursor(cursor).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `ChatScheduledMessagesApi.ChatScheduledMessagesList``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `ChatScheduledMessagesList`: ChatScheduledMessagesListSchema
    fmt.Fprintf(os.Stdout, "Response from `ChatScheduledMessagesApi.ChatScheduledMessagesList`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiChatScheduledMessagesListRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;none&#x60; | 
 **channel** | **string** | The channel of the scheduled messages | 
 **latest** | **float32** | A UNIX timestamp of the latest value in the time range | 
 **oldest** | **float32** | A UNIX timestamp of the oldest value in the time range | 
 **limit** | **int32** | Maximum number of original entries to return. | 
 **cursor** | **string** | For pagination purposes, this is the &#x60;cursor&#x60; value returned from a previous call to &#x60;chat.scheduledmessages.list&#x60; indicating where you want to start this call from. | 

### Return type

[**ChatScheduledMessagesListSchema**](ChatScheduledMessagesListSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

