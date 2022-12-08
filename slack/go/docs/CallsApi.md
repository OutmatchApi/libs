# \CallsApi

All URIs are relative to *https://slack.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CallsAdd**](CallsApi.md#CallsAdd) | **Post** /calls.add | 
[**CallsEnd**](CallsApi.md#CallsEnd) | **Post** /calls.end | 
[**CallsInfo**](CallsApi.md#CallsInfo) | **Get** /calls.info | 
[**CallsParticipantsAdd**](CallsApi.md#CallsParticipantsAdd) | **Post** /calls.participants.add | 
[**CallsParticipantsRemove**](CallsApi.md#CallsParticipantsRemove) | **Post** /calls.participants.remove | 
[**CallsUpdate**](CallsApi.md#CallsUpdate) | **Post** /calls.update | 



## CallsAdd

> DefaultSuccessTemplate CallsAdd(ctx).Token(token).ExternalUniqueId(externalUniqueId).JoinUrl(joinUrl).CreatedBy(createdBy).DateStart(dateStart).DesktopAppJoinUrl(desktopAppJoinUrl).ExternalDisplayId(externalDisplayId).Title(title).Users(users).Execute()





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
    token := "token_example" // string | Authentication token. Requires scope: `calls:write`
    externalUniqueId := "externalUniqueId_example" // string | An ID supplied by the 3rd-party Call provider. It must be unique across all Calls from that service.
    joinUrl := "joinUrl_example" // string | The URL required for a client to join the Call.
    createdBy := "createdBy_example" // string | The valid Slack user ID of the user who created this Call. When this method is called with a user token, the `created_by` field is optional and defaults to the authed user of the token. Otherwise, the field is required. (optional)
    dateStart := int32(56) // int32 | Call start time in UTC UNIX timestamp format (optional)
    desktopAppJoinUrl := "desktopAppJoinUrl_example" // string | When supplied, available Slack clients will attempt to directly launch the 3rd-party Call with this URL. (optional)
    externalDisplayId := "externalDisplayId_example" // string | An optional, human-readable ID supplied by the 3rd-party Call provider. If supplied, this ID will be displayed in the Call object. (optional)
    title := "title_example" // string | The name of the Call. (optional)
    users := "users_example" // string | The list of users to register as participants in the Call. [Read more on how to specify users here](/apis/calls#users). (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.CallsApi.CallsAdd(context.Background()).Token(token).ExternalUniqueId(externalUniqueId).JoinUrl(joinUrl).CreatedBy(createdBy).DateStart(dateStart).DesktopAppJoinUrl(desktopAppJoinUrl).ExternalDisplayId(externalDisplayId).Title(title).Users(users).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `CallsApi.CallsAdd``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `CallsAdd`: DefaultSuccessTemplate
    fmt.Fprintf(os.Stdout, "Response from `CallsApi.CallsAdd`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCallsAddRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;calls:write&#x60; | 
 **externalUniqueId** | **string** | An ID supplied by the 3rd-party Call provider. It must be unique across all Calls from that service. | 
 **joinUrl** | **string** | The URL required for a client to join the Call. | 
 **createdBy** | **string** | The valid Slack user ID of the user who created this Call. When this method is called with a user token, the &#x60;created_by&#x60; field is optional and defaults to the authed user of the token. Otherwise, the field is required. | 
 **dateStart** | **int32** | Call start time in UTC UNIX timestamp format | 
 **desktopAppJoinUrl** | **string** | When supplied, available Slack clients will attempt to directly launch the 3rd-party Call with this URL. | 
 **externalDisplayId** | **string** | An optional, human-readable ID supplied by the 3rd-party Call provider. If supplied, this ID will be displayed in the Call object. | 
 **title** | **string** | The name of the Call. | 
 **users** | **string** | The list of users to register as participants in the Call. [Read more on how to specify users here](/apis/calls#users). | 

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


## CallsEnd

> DefaultSuccessTemplate CallsEnd(ctx).Token(token).Id(id).Duration(duration).Execute()





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
    token := "token_example" // string | Authentication token. Requires scope: `calls:write`
    id := "id_example" // string | `id` returned when registering the call using the [`calls.add`](/methods/calls.add) method.
    duration := int32(56) // int32 | Call duration in seconds (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.CallsApi.CallsEnd(context.Background()).Token(token).Id(id).Duration(duration).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `CallsApi.CallsEnd``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `CallsEnd`: DefaultSuccessTemplate
    fmt.Fprintf(os.Stdout, "Response from `CallsApi.CallsEnd`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCallsEndRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;calls:write&#x60; | 
 **id** | **string** | &#x60;id&#x60; returned when registering the call using the [&#x60;calls.add&#x60;](/methods/calls.add) method. | 
 **duration** | **int32** | Call duration in seconds | 

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


## CallsInfo

> DefaultSuccessTemplate CallsInfo(ctx).Token(token).Id(id).Execute()





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
    token := "token_example" // string | Authentication token. Requires scope: `calls:read`
    id := "id_example" // string | `id` of the Call returned by the [`calls.add`](/methods/calls.add) method.

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.CallsApi.CallsInfo(context.Background()).Token(token).Id(id).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `CallsApi.CallsInfo``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `CallsInfo`: DefaultSuccessTemplate
    fmt.Fprintf(os.Stdout, "Response from `CallsApi.CallsInfo`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCallsInfoRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;calls:read&#x60; | 
 **id** | **string** | &#x60;id&#x60; of the Call returned by the [&#x60;calls.add&#x60;](/methods/calls.add) method. | 

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


## CallsParticipantsAdd

> DefaultSuccessTemplate CallsParticipantsAdd(ctx).Token(token).Id(id).Users(users).Execute()





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
    token := "token_example" // string | Authentication token. Requires scope: `calls:write`
    id := "id_example" // string | `id` returned by the [`calls.add`](/methods/calls.add) method.
    users := "users_example" // string | The list of users to add as participants in the Call. [Read more on how to specify users here](/apis/calls#users).

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.CallsApi.CallsParticipantsAdd(context.Background()).Token(token).Id(id).Users(users).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `CallsApi.CallsParticipantsAdd``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `CallsParticipantsAdd`: DefaultSuccessTemplate
    fmt.Fprintf(os.Stdout, "Response from `CallsApi.CallsParticipantsAdd`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCallsParticipantsAddRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;calls:write&#x60; | 
 **id** | **string** | &#x60;id&#x60; returned by the [&#x60;calls.add&#x60;](/methods/calls.add) method. | 
 **users** | **string** | The list of users to add as participants in the Call. [Read more on how to specify users here](/apis/calls#users). | 

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


## CallsParticipantsRemove

> DefaultSuccessTemplate CallsParticipantsRemove(ctx).Token(token).Id(id).Users(users).Execute()





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
    token := "token_example" // string | Authentication token. Requires scope: `calls:write`
    id := "id_example" // string | `id` returned by the [`calls.add`](/methods/calls.add) method.
    users := "users_example" // string | The list of users to remove as participants in the Call. [Read more on how to specify users here](/apis/calls#users).

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.CallsApi.CallsParticipantsRemove(context.Background()).Token(token).Id(id).Users(users).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `CallsApi.CallsParticipantsRemove``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `CallsParticipantsRemove`: DefaultSuccessTemplate
    fmt.Fprintf(os.Stdout, "Response from `CallsApi.CallsParticipantsRemove`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCallsParticipantsRemoveRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;calls:write&#x60; | 
 **id** | **string** | &#x60;id&#x60; returned by the [&#x60;calls.add&#x60;](/methods/calls.add) method. | 
 **users** | **string** | The list of users to remove as participants in the Call. [Read more on how to specify users here](/apis/calls#users). | 

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


## CallsUpdate

> DefaultSuccessTemplate CallsUpdate(ctx).Token(token).Id(id).DesktopAppJoinUrl(desktopAppJoinUrl).JoinUrl(joinUrl).Title(title).Execute()





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
    token := "token_example" // string | Authentication token. Requires scope: `calls:write`
    id := "id_example" // string | `id` returned by the [`calls.add`](/methods/calls.add) method.
    desktopAppJoinUrl := "desktopAppJoinUrl_example" // string | When supplied, available Slack clients will attempt to directly launch the 3rd-party Call with this URL. (optional)
    joinUrl := "joinUrl_example" // string | The URL required for a client to join the Call. (optional)
    title := "title_example" // string | The name of the Call. (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.CallsApi.CallsUpdate(context.Background()).Token(token).Id(id).DesktopAppJoinUrl(desktopAppJoinUrl).JoinUrl(joinUrl).Title(title).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `CallsApi.CallsUpdate``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `CallsUpdate`: DefaultSuccessTemplate
    fmt.Fprintf(os.Stdout, "Response from `CallsApi.CallsUpdate`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCallsUpdateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;calls:write&#x60; | 
 **id** | **string** | &#x60;id&#x60; returned by the [&#x60;calls.add&#x60;](/methods/calls.add) method. | 
 **desktopAppJoinUrl** | **string** | When supplied, available Slack clients will attempt to directly launch the 3rd-party Call with this URL. | 
 **joinUrl** | **string** | The URL required for a client to join the Call. | 
 **title** | **string** | The name of the Call. | 

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

