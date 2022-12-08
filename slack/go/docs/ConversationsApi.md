# \ConversationsApi

All URIs are relative to *https://slack.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ConversationsArchive**](ConversationsApi.md#ConversationsArchive) | **Post** /conversations.archive | 
[**ConversationsClose**](ConversationsApi.md#ConversationsClose) | **Post** /conversations.close | 
[**ConversationsCreate**](ConversationsApi.md#ConversationsCreate) | **Post** /conversations.create | 
[**ConversationsHistory**](ConversationsApi.md#ConversationsHistory) | **Get** /conversations.history | 
[**ConversationsInfo**](ConversationsApi.md#ConversationsInfo) | **Get** /conversations.info | 
[**ConversationsInvite**](ConversationsApi.md#ConversationsInvite) | **Post** /conversations.invite | 
[**ConversationsJoin**](ConversationsApi.md#ConversationsJoin) | **Post** /conversations.join | 
[**ConversationsKick**](ConversationsApi.md#ConversationsKick) | **Post** /conversations.kick | 
[**ConversationsLeave**](ConversationsApi.md#ConversationsLeave) | **Post** /conversations.leave | 
[**ConversationsList**](ConversationsApi.md#ConversationsList) | **Get** /conversations.list | 
[**ConversationsMark**](ConversationsApi.md#ConversationsMark) | **Post** /conversations.mark | 
[**ConversationsMembers**](ConversationsApi.md#ConversationsMembers) | **Get** /conversations.members | 
[**ConversationsOpen**](ConversationsApi.md#ConversationsOpen) | **Post** /conversations.open | 
[**ConversationsRename**](ConversationsApi.md#ConversationsRename) | **Post** /conversations.rename | 
[**ConversationsReplies**](ConversationsApi.md#ConversationsReplies) | **Get** /conversations.replies | 
[**ConversationsSetPurpose**](ConversationsApi.md#ConversationsSetPurpose) | **Post** /conversations.setPurpose | 
[**ConversationsSetTopic**](ConversationsApi.md#ConversationsSetTopic) | **Post** /conversations.setTopic | 
[**ConversationsUnarchive**](ConversationsApi.md#ConversationsUnarchive) | **Post** /conversations.unarchive | 



## ConversationsArchive

> ConversationsArchiveSuccessSchema ConversationsArchive(ctx).Token(token).Channel(channel).Execute()





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
    token := "token_example" // string | Authentication token. Requires scope: `conversations:write` (optional)
    channel := "channel_example" // string | ID of conversation to archive (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.ConversationsApi.ConversationsArchive(context.Background()).Token(token).Channel(channel).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `ConversationsApi.ConversationsArchive``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `ConversationsArchive`: ConversationsArchiveSuccessSchema
    fmt.Fprintf(os.Stdout, "Response from `ConversationsApi.ConversationsArchive`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiConversationsArchiveRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;conversations:write&#x60; | 
 **channel** | **string** | ID of conversation to archive | 

### Return type

[**ConversationsArchiveSuccessSchema**](ConversationsArchiveSuccessSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ConversationsClose

> ConversationsCloseSuccessSchema ConversationsClose(ctx).Token(token).Channel(channel).Execute()





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
    token := "token_example" // string | Authentication token. Requires scope: `conversations:write` (optional)
    channel := "channel_example" // string | Conversation to close. (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.ConversationsApi.ConversationsClose(context.Background()).Token(token).Channel(channel).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `ConversationsApi.ConversationsClose``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `ConversationsClose`: ConversationsCloseSuccessSchema
    fmt.Fprintf(os.Stdout, "Response from `ConversationsApi.ConversationsClose`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiConversationsCloseRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;conversations:write&#x60; | 
 **channel** | **string** | Conversation to close. | 

### Return type

[**ConversationsCloseSuccessSchema**](ConversationsCloseSuccessSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ConversationsCreate

> ConversationsCreateSuccessSchema ConversationsCreate(ctx).Token(token).IsPrivate(isPrivate).Name(name).Execute()





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
    token := "token_example" // string | Authentication token. Requires scope: `conversations:write` (optional)
    isPrivate := true // bool | Create a private channel instead of a public one (optional)
    name := "name_example" // string | Name of the public or private channel to create (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.ConversationsApi.ConversationsCreate(context.Background()).Token(token).IsPrivate(isPrivate).Name(name).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `ConversationsApi.ConversationsCreate``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `ConversationsCreate`: ConversationsCreateSuccessSchema
    fmt.Fprintf(os.Stdout, "Response from `ConversationsApi.ConversationsCreate`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiConversationsCreateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;conversations:write&#x60; | 
 **isPrivate** | **bool** | Create a private channel instead of a public one | 
 **name** | **string** | Name of the public or private channel to create | 

### Return type

[**ConversationsCreateSuccessSchema**](ConversationsCreateSuccessSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ConversationsHistory

> ConversationsHistorySuccessSchema ConversationsHistory(ctx).Token(token).Channel(channel).Latest(latest).Oldest(oldest).Inclusive(inclusive).Limit(limit).Cursor(cursor).Execute()





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
    token := "token_example" // string | Authentication token. Requires scope: `conversations:history` (optional)
    channel := "channel_example" // string | Conversation ID to fetch history for. (optional)
    latest := float32(8.14) // float32 | End of time range of messages to include in results. (optional)
    oldest := float32(8.14) // float32 | Start of time range of messages to include in results. (optional)
    inclusive := true // bool | Include messages with latest or oldest timestamp in results only when either timestamp is specified. (optional)
    limit := int32(56) // int32 | The maximum number of items to return. Fewer than the requested number of items may be returned, even if the end of the users list hasn't been reached. (optional)
    cursor := "cursor_example" // string | Paginate through collections of data by setting the `cursor` parameter to a `next_cursor` attribute returned by a previous request's `response_metadata`. Default value fetches the first \"page\" of the collection. See [pagination](/docs/pagination) for more detail. (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.ConversationsApi.ConversationsHistory(context.Background()).Token(token).Channel(channel).Latest(latest).Oldest(oldest).Inclusive(inclusive).Limit(limit).Cursor(cursor).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `ConversationsApi.ConversationsHistory``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `ConversationsHistory`: ConversationsHistorySuccessSchema
    fmt.Fprintf(os.Stdout, "Response from `ConversationsApi.ConversationsHistory`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiConversationsHistoryRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;conversations:history&#x60; | 
 **channel** | **string** | Conversation ID to fetch history for. | 
 **latest** | **float32** | End of time range of messages to include in results. | 
 **oldest** | **float32** | Start of time range of messages to include in results. | 
 **inclusive** | **bool** | Include messages with latest or oldest timestamp in results only when either timestamp is specified. | 
 **limit** | **int32** | The maximum number of items to return. Fewer than the requested number of items may be returned, even if the end of the users list hasn&#39;t been reached. | 
 **cursor** | **string** | Paginate through collections of data by setting the &#x60;cursor&#x60; parameter to a &#x60;next_cursor&#x60; attribute returned by a previous request&#39;s &#x60;response_metadata&#x60;. Default value fetches the first \&quot;page\&quot; of the collection. See [pagination](/docs/pagination) for more detail. | 

### Return type

[**ConversationsHistorySuccessSchema**](ConversationsHistorySuccessSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ConversationsInfo

> ConversationsInfoSuccessSchema ConversationsInfo(ctx).Token(token).Channel(channel).IncludeLocale(includeLocale).IncludeNumMembers(includeNumMembers).Execute()





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
    token := "token_example" // string | Authentication token. Requires scope: `conversations:read` (optional)
    channel := "channel_example" // string | Conversation ID to learn more about (optional)
    includeLocale := true // bool | Set this to `true` to receive the locale for this conversation. Defaults to `false` (optional)
    includeNumMembers := true // bool | Set to `true` to include the member count for the specified conversation. Defaults to `false` (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.ConversationsApi.ConversationsInfo(context.Background()).Token(token).Channel(channel).IncludeLocale(includeLocale).IncludeNumMembers(includeNumMembers).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `ConversationsApi.ConversationsInfo``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `ConversationsInfo`: ConversationsInfoSuccessSchema
    fmt.Fprintf(os.Stdout, "Response from `ConversationsApi.ConversationsInfo`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiConversationsInfoRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;conversations:read&#x60; | 
 **channel** | **string** | Conversation ID to learn more about | 
 **includeLocale** | **bool** | Set this to &#x60;true&#x60; to receive the locale for this conversation. Defaults to &#x60;false&#x60; | 
 **includeNumMembers** | **bool** | Set to &#x60;true&#x60; to include the member count for the specified conversation. Defaults to &#x60;false&#x60; | 

### Return type

[**ConversationsInfoSuccessSchema**](ConversationsInfoSuccessSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ConversationsInvite

> ConversationsInviteErrorSchema ConversationsInvite(ctx).Token(token).Channel(channel).Users(users).Execute()





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
    token := "token_example" // string | Authentication token. Requires scope: `conversations:write` (optional)
    channel := "channel_example" // string | The ID of the public or private channel to invite user(s) to. (optional)
    users := "users_example" // string | A comma separated list of user IDs. Up to 1000 users may be listed. (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.ConversationsApi.ConversationsInvite(context.Background()).Token(token).Channel(channel).Users(users).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `ConversationsApi.ConversationsInvite``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `ConversationsInvite`: ConversationsInviteErrorSchema
    fmt.Fprintf(os.Stdout, "Response from `ConversationsApi.ConversationsInvite`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiConversationsInviteRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;conversations:write&#x60; | 
 **channel** | **string** | The ID of the public or private channel to invite user(s) to. | 
 **users** | **string** | A comma separated list of user IDs. Up to 1000 users may be listed. | 

### Return type

[**ConversationsInviteErrorSchema**](ConversationsInviteErrorSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ConversationsJoin

> ConversationsJoinSuccessSchema ConversationsJoin(ctx).Token(token).Channel(channel).Execute()





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
    token := "token_example" // string | Authentication token. Requires scope: `channels:write` (optional)
    channel := "channel_example" // string | ID of conversation to join (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.ConversationsApi.ConversationsJoin(context.Background()).Token(token).Channel(channel).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `ConversationsApi.ConversationsJoin``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `ConversationsJoin`: ConversationsJoinSuccessSchema
    fmt.Fprintf(os.Stdout, "Response from `ConversationsApi.ConversationsJoin`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiConversationsJoinRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;channels:write&#x60; | 
 **channel** | **string** | ID of conversation to join | 

### Return type

[**ConversationsJoinSuccessSchema**](ConversationsJoinSuccessSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ConversationsKick

> ConversationsKickSuccessSchema ConversationsKick(ctx).Token(token).Channel(channel).User(user).Execute()





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
    token := "token_example" // string | Authentication token. Requires scope: `conversations:write` (optional)
    channel := "channel_example" // string | ID of conversation to remove user from. (optional)
    user := "user_example" // string | User ID to be removed. (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.ConversationsApi.ConversationsKick(context.Background()).Token(token).Channel(channel).User(user).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `ConversationsApi.ConversationsKick``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `ConversationsKick`: ConversationsKickSuccessSchema
    fmt.Fprintf(os.Stdout, "Response from `ConversationsApi.ConversationsKick`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiConversationsKickRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;conversations:write&#x60; | 
 **channel** | **string** | ID of conversation to remove user from. | 
 **user** | **string** | User ID to be removed. | 

### Return type

[**ConversationsKickSuccessSchema**](ConversationsKickSuccessSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ConversationsLeave

> ConversationsLeaveSuccessSchema ConversationsLeave(ctx).Token(token).Channel(channel).Execute()





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
    token := "token_example" // string | Authentication token. Requires scope: `conversations:write` (optional)
    channel := "channel_example" // string | Conversation to leave (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.ConversationsApi.ConversationsLeave(context.Background()).Token(token).Channel(channel).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `ConversationsApi.ConversationsLeave``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `ConversationsLeave`: ConversationsLeaveSuccessSchema
    fmt.Fprintf(os.Stdout, "Response from `ConversationsApi.ConversationsLeave`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiConversationsLeaveRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;conversations:write&#x60; | 
 **channel** | **string** | Conversation to leave | 

### Return type

[**ConversationsLeaveSuccessSchema**](ConversationsLeaveSuccessSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ConversationsList

> ConversationsListSuccessSchema ConversationsList(ctx).Token(token).ExcludeArchived(excludeArchived).Types(types).Limit(limit).Cursor(cursor).Execute()





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
    token := "token_example" // string | Authentication token. Requires scope: `conversations:read` (optional)
    excludeArchived := true // bool | Set to `true` to exclude archived channels from the list (optional)
    types := "types_example" // string | Mix and match channel types by providing a comma-separated list of any combination of `public_channel`, `private_channel`, `mpim`, `im` (optional)
    limit := int32(56) // int32 | The maximum number of items to return. Fewer than the requested number of items may be returned, even if the end of the list hasn't been reached. Must be an integer no larger than 1000. (optional)
    cursor := "cursor_example" // string | Paginate through collections of data by setting the `cursor` parameter to a `next_cursor` attribute returned by a previous request's `response_metadata`. Default value fetches the first \"page\" of the collection. See [pagination](/docs/pagination) for more detail. (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.ConversationsApi.ConversationsList(context.Background()).Token(token).ExcludeArchived(excludeArchived).Types(types).Limit(limit).Cursor(cursor).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `ConversationsApi.ConversationsList``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `ConversationsList`: ConversationsListSuccessSchema
    fmt.Fprintf(os.Stdout, "Response from `ConversationsApi.ConversationsList`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiConversationsListRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;conversations:read&#x60; | 
 **excludeArchived** | **bool** | Set to &#x60;true&#x60; to exclude archived channels from the list | 
 **types** | **string** | Mix and match channel types by providing a comma-separated list of any combination of &#x60;public_channel&#x60;, &#x60;private_channel&#x60;, &#x60;mpim&#x60;, &#x60;im&#x60; | 
 **limit** | **int32** | The maximum number of items to return. Fewer than the requested number of items may be returned, even if the end of the list hasn&#39;t been reached. Must be an integer no larger than 1000. | 
 **cursor** | **string** | Paginate through collections of data by setting the &#x60;cursor&#x60; parameter to a &#x60;next_cursor&#x60; attribute returned by a previous request&#39;s &#x60;response_metadata&#x60;. Default value fetches the first \&quot;page\&quot; of the collection. See [pagination](/docs/pagination) for more detail. | 

### Return type

[**ConversationsListSuccessSchema**](ConversationsListSuccessSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ConversationsMark

> ConversationsMarkSuccessSchema ConversationsMark(ctx).Token(token).Channel(channel).Ts(ts).Execute()





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
    token := "token_example" // string | Authentication token. Requires scope: `conversations:write` (optional)
    channel := "channel_example" // string | Channel or conversation to set the read cursor for. (optional)
    ts := float32(8.14) // float32 | Unique identifier of message you want marked as most recently seen in this conversation. (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.ConversationsApi.ConversationsMark(context.Background()).Token(token).Channel(channel).Ts(ts).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `ConversationsApi.ConversationsMark``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `ConversationsMark`: ConversationsMarkSuccessSchema
    fmt.Fprintf(os.Stdout, "Response from `ConversationsApi.ConversationsMark`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiConversationsMarkRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;conversations:write&#x60; | 
 **channel** | **string** | Channel or conversation to set the read cursor for. | 
 **ts** | **float32** | Unique identifier of message you want marked as most recently seen in this conversation. | 

### Return type

[**ConversationsMarkSuccessSchema**](ConversationsMarkSuccessSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ConversationsMembers

> ConversationsMembersSuccessSchema ConversationsMembers(ctx).Token(token).Channel(channel).Limit(limit).Cursor(cursor).Execute()





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
    token := "token_example" // string | Authentication token. Requires scope: `conversations:read` (optional)
    channel := "channel_example" // string | ID of the conversation to retrieve members for (optional)
    limit := int32(56) // int32 | The maximum number of items to return. Fewer than the requested number of items may be returned, even if the end of the users list hasn't been reached. (optional)
    cursor := "cursor_example" // string | Paginate through collections of data by setting the `cursor` parameter to a `next_cursor` attribute returned by a previous request's `response_metadata`. Default value fetches the first \"page\" of the collection. See [pagination](/docs/pagination) for more detail. (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.ConversationsApi.ConversationsMembers(context.Background()).Token(token).Channel(channel).Limit(limit).Cursor(cursor).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `ConversationsApi.ConversationsMembers``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `ConversationsMembers`: ConversationsMembersSuccessSchema
    fmt.Fprintf(os.Stdout, "Response from `ConversationsApi.ConversationsMembers`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiConversationsMembersRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;conversations:read&#x60; | 
 **channel** | **string** | ID of the conversation to retrieve members for | 
 **limit** | **int32** | The maximum number of items to return. Fewer than the requested number of items may be returned, even if the end of the users list hasn&#39;t been reached. | 
 **cursor** | **string** | Paginate through collections of data by setting the &#x60;cursor&#x60; parameter to a &#x60;next_cursor&#x60; attribute returned by a previous request&#39;s &#x60;response_metadata&#x60;. Default value fetches the first \&quot;page\&quot; of the collection. See [pagination](/docs/pagination) for more detail. | 

### Return type

[**ConversationsMembersSuccessSchema**](ConversationsMembersSuccessSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ConversationsOpen

> ConversationsOpenSuccessSchema ConversationsOpen(ctx).Token(token).Channel(channel).ReturnIm(returnIm).Users(users).Execute()





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
    token := "token_example" // string | Authentication token. Requires scope: `conversations:write` (optional)
    channel := "channel_example" // string | Resume a conversation by supplying an `im` or `mpim`'s ID. Or provide the `users` field instead. (optional)
    returnIm := true // bool | Boolean, indicates you want the full IM channel definition in the response. (optional)
    users := "users_example" // string | Comma separated lists of users. If only one user is included, this creates a 1:1 DM.  The ordering of the users is preserved whenever a multi-person direct message is returned. Supply a `channel` when not supplying `users`. (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.ConversationsApi.ConversationsOpen(context.Background()).Token(token).Channel(channel).ReturnIm(returnIm).Users(users).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `ConversationsApi.ConversationsOpen``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `ConversationsOpen`: ConversationsOpenSuccessSchema
    fmt.Fprintf(os.Stdout, "Response from `ConversationsApi.ConversationsOpen`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiConversationsOpenRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;conversations:write&#x60; | 
 **channel** | **string** | Resume a conversation by supplying an &#x60;im&#x60; or &#x60;mpim&#x60;&#39;s ID. Or provide the &#x60;users&#x60; field instead. | 
 **returnIm** | **bool** | Boolean, indicates you want the full IM channel definition in the response. | 
 **users** | **string** | Comma separated lists of users. If only one user is included, this creates a 1:1 DM.  The ordering of the users is preserved whenever a multi-person direct message is returned. Supply a &#x60;channel&#x60; when not supplying &#x60;users&#x60;. | 

### Return type

[**ConversationsOpenSuccessSchema**](ConversationsOpenSuccessSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ConversationsRename

> ConversationsRenameSuccessSchema ConversationsRename(ctx).Token(token).Channel(channel).Name(name).Execute()





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
    token := "token_example" // string | Authentication token. Requires scope: `conversations:write` (optional)
    channel := "channel_example" // string | ID of conversation to rename (optional)
    name := "name_example" // string | New name for conversation. (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.ConversationsApi.ConversationsRename(context.Background()).Token(token).Channel(channel).Name(name).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `ConversationsApi.ConversationsRename``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `ConversationsRename`: ConversationsRenameSuccessSchema
    fmt.Fprintf(os.Stdout, "Response from `ConversationsApi.ConversationsRename`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiConversationsRenameRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;conversations:write&#x60; | 
 **channel** | **string** | ID of conversation to rename | 
 **name** | **string** | New name for conversation. | 

### Return type

[**ConversationsRenameSuccessSchema**](ConversationsRenameSuccessSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ConversationsReplies

> ConversationsRepliesSuccessSchema ConversationsReplies(ctx).Token(token).Channel(channel).Ts(ts).Latest(latest).Oldest(oldest).Inclusive(inclusive).Limit(limit).Cursor(cursor).Execute()





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
    token := "token_example" // string | Authentication token. Requires scope: `conversations:history` (optional)
    channel := "channel_example" // string | Conversation ID to fetch thread from. (optional)
    ts := float32(8.14) // float32 | Unique identifier of a thread's parent message. `ts` must be the timestamp of an existing message with 0 or more replies. If there are no replies then just the single message referenced by `ts` will return - it is just an ordinary, unthreaded message. (optional)
    latest := float32(8.14) // float32 | End of time range of messages to include in results. (optional)
    oldest := float32(8.14) // float32 | Start of time range of messages to include in results. (optional)
    inclusive := true // bool | Include messages with latest or oldest timestamp in results only when either timestamp is specified. (optional)
    limit := int32(56) // int32 | The maximum number of items to return. Fewer than the requested number of items may be returned, even if the end of the users list hasn't been reached. (optional)
    cursor := "cursor_example" // string | Paginate through collections of data by setting the `cursor` parameter to a `next_cursor` attribute returned by a previous request's `response_metadata`. Default value fetches the first \"page\" of the collection. See [pagination](/docs/pagination) for more detail. (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.ConversationsApi.ConversationsReplies(context.Background()).Token(token).Channel(channel).Ts(ts).Latest(latest).Oldest(oldest).Inclusive(inclusive).Limit(limit).Cursor(cursor).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `ConversationsApi.ConversationsReplies``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `ConversationsReplies`: ConversationsRepliesSuccessSchema
    fmt.Fprintf(os.Stdout, "Response from `ConversationsApi.ConversationsReplies`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiConversationsRepliesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;conversations:history&#x60; | 
 **channel** | **string** | Conversation ID to fetch thread from. | 
 **ts** | **float32** | Unique identifier of a thread&#39;s parent message. &#x60;ts&#x60; must be the timestamp of an existing message with 0 or more replies. If there are no replies then just the single message referenced by &#x60;ts&#x60; will return - it is just an ordinary, unthreaded message. | 
 **latest** | **float32** | End of time range of messages to include in results. | 
 **oldest** | **float32** | Start of time range of messages to include in results. | 
 **inclusive** | **bool** | Include messages with latest or oldest timestamp in results only when either timestamp is specified. | 
 **limit** | **int32** | The maximum number of items to return. Fewer than the requested number of items may be returned, even if the end of the users list hasn&#39;t been reached. | 
 **cursor** | **string** | Paginate through collections of data by setting the &#x60;cursor&#x60; parameter to a &#x60;next_cursor&#x60; attribute returned by a previous request&#39;s &#x60;response_metadata&#x60;. Default value fetches the first \&quot;page\&quot; of the collection. See [pagination](/docs/pagination) for more detail. | 

### Return type

[**ConversationsRepliesSuccessSchema**](ConversationsRepliesSuccessSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ConversationsSetPurpose

> ConversationsSetPurposeSuccessSchema ConversationsSetPurpose(ctx).Token(token).Channel(channel).Purpose(purpose).Execute()





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
    token := "token_example" // string | Authentication token. Requires scope: `conversations:write` (optional)
    channel := "channel_example" // string | Conversation to set the purpose of (optional)
    purpose := "purpose_example" // string | A new, specialer purpose (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.ConversationsApi.ConversationsSetPurpose(context.Background()).Token(token).Channel(channel).Purpose(purpose).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `ConversationsApi.ConversationsSetPurpose``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `ConversationsSetPurpose`: ConversationsSetPurposeSuccessSchema
    fmt.Fprintf(os.Stdout, "Response from `ConversationsApi.ConversationsSetPurpose`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiConversationsSetPurposeRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;conversations:write&#x60; | 
 **channel** | **string** | Conversation to set the purpose of | 
 **purpose** | **string** | A new, specialer purpose | 

### Return type

[**ConversationsSetPurposeSuccessSchema**](ConversationsSetPurposeSuccessSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ConversationsSetTopic

> ConversationsSetTopicSuccessSchema ConversationsSetTopic(ctx).Token(token).Channel(channel).Topic(topic).Execute()





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
    token := "token_example" // string | Authentication token. Requires scope: `conversations:write` (optional)
    channel := "channel_example" // string | Conversation to set the topic of (optional)
    topic := "topic_example" // string | The new topic string. Does not support formatting or linkification. (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.ConversationsApi.ConversationsSetTopic(context.Background()).Token(token).Channel(channel).Topic(topic).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `ConversationsApi.ConversationsSetTopic``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `ConversationsSetTopic`: ConversationsSetTopicSuccessSchema
    fmt.Fprintf(os.Stdout, "Response from `ConversationsApi.ConversationsSetTopic`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiConversationsSetTopicRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;conversations:write&#x60; | 
 **channel** | **string** | Conversation to set the topic of | 
 **topic** | **string** | The new topic string. Does not support formatting or linkification. | 

### Return type

[**ConversationsSetTopicSuccessSchema**](ConversationsSetTopicSuccessSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ConversationsUnarchive

> ConversationsUnarchiveSuccessSchema ConversationsUnarchive(ctx).Token(token).Channel(channel).Execute()





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
    token := "token_example" // string | Authentication token. Requires scope: `conversations:write` (optional)
    channel := "channel_example" // string | ID of conversation to unarchive (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.ConversationsApi.ConversationsUnarchive(context.Background()).Token(token).Channel(channel).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `ConversationsApi.ConversationsUnarchive``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `ConversationsUnarchive`: ConversationsUnarchiveSuccessSchema
    fmt.Fprintf(os.Stdout, "Response from `ConversationsApi.ConversationsUnarchive`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiConversationsUnarchiveRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;conversations:write&#x60; | 
 **channel** | **string** | ID of conversation to unarchive | 

### Return type

[**ConversationsUnarchiveSuccessSchema**](ConversationsUnarchiveSuccessSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

