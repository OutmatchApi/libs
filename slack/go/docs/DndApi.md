# \DndApi

All URIs are relative to *https://slack.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**DndEndDnd**](DndApi.md#DndEndDnd) | **Post** /dnd.endDnd | 
[**DndEndSnooze**](DndApi.md#DndEndSnooze) | **Post** /dnd.endSnooze | 
[**DndInfo**](DndApi.md#DndInfo) | **Get** /dnd.info | 
[**DndSetSnooze**](DndApi.md#DndSetSnooze) | **Post** /dnd.setSnooze | 
[**DndTeamInfo**](DndApi.md#DndTeamInfo) | **Get** /dnd.teamInfo | 



## DndEndDnd

> DndEndDndSchema DndEndDnd(ctx).Token(token).Execute()





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
    token := "token_example" // string | Authentication token. Requires scope: `dnd:write`

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.DndApi.DndEndDnd(context.Background()).Token(token).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `DndApi.DndEndDnd``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `DndEndDnd`: DndEndDndSchema
    fmt.Fprintf(os.Stdout, "Response from `DndApi.DndEndDnd`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiDndEndDndRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;dnd:write&#x60; | 

### Return type

[**DndEndDndSchema**](DndEndDndSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## DndEndSnooze

> DndEndSnoozeSchema DndEndSnooze(ctx).Token(token).Execute()





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
    token := "token_example" // string | Authentication token. Requires scope: `dnd:write`

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.DndApi.DndEndSnooze(context.Background()).Token(token).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `DndApi.DndEndSnooze``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `DndEndSnooze`: DndEndSnoozeSchema
    fmt.Fprintf(os.Stdout, "Response from `DndApi.DndEndSnooze`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiDndEndSnoozeRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;dnd:write&#x60; | 

### Return type

[**DndEndSnoozeSchema**](DndEndSnoozeSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## DndInfo

> DndInfoSchema DndInfo(ctx).Token(token).User(user).Execute()





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
    token := "token_example" // string | Authentication token. Requires scope: `dnd:read` (optional)
    user := "user_example" // string | User to fetch status for (defaults to current user) (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.DndApi.DndInfo(context.Background()).Token(token).User(user).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `DndApi.DndInfo``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `DndInfo`: DndInfoSchema
    fmt.Fprintf(os.Stdout, "Response from `DndApi.DndInfo`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiDndInfoRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;dnd:read&#x60; | 
 **user** | **string** | User to fetch status for (defaults to current user) | 

### Return type

[**DndInfoSchema**](DndInfoSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## DndSetSnooze

> DndSetSnoozeSchema DndSetSnooze(ctx).NumMinutes(numMinutes).Token(token).Execute()





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
    numMinutes := "numMinutes_example" // string | Number of minutes, from now, to snooze until.
    token := "token_example" // string | Authentication token. Requires scope: `dnd:write`

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.DndApi.DndSetSnooze(context.Background()).NumMinutes(numMinutes).Token(token).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `DndApi.DndSetSnooze``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `DndSetSnooze`: DndSetSnoozeSchema
    fmt.Fprintf(os.Stdout, "Response from `DndApi.DndSetSnooze`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiDndSetSnoozeRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **numMinutes** | **string** | Number of minutes, from now, to snooze until. | 
 **token** | **string** | Authentication token. Requires scope: &#x60;dnd:write&#x60; | 

### Return type

[**DndSetSnoozeSchema**](DndSetSnoozeSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## DndTeamInfo

> DefaultSuccessTemplate DndTeamInfo(ctx).Token(token).Users(users).Execute()





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
    token := "token_example" // string | Authentication token. Requires scope: `dnd:read` (optional)
    users := "users_example" // string | Comma-separated list of users to fetch Do Not Disturb status for (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.DndApi.DndTeamInfo(context.Background()).Token(token).Users(users).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `DndApi.DndTeamInfo``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `DndTeamInfo`: DefaultSuccessTemplate
    fmt.Fprintf(os.Stdout, "Response from `DndApi.DndTeamInfo`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiDndTeamInfoRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;dnd:read&#x60; | 
 **users** | **string** | Comma-separated list of users to fetch Do Not Disturb status for | 

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

