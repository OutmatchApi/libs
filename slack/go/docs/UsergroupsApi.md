# \UsergroupsApi

All URIs are relative to *https://slack.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**UsergroupsCreate**](UsergroupsApi.md#UsergroupsCreate) | **Post** /usergroups.create | 
[**UsergroupsDisable**](UsergroupsApi.md#UsergroupsDisable) | **Post** /usergroups.disable | 
[**UsergroupsEnable**](UsergroupsApi.md#UsergroupsEnable) | **Post** /usergroups.enable | 
[**UsergroupsList**](UsergroupsApi.md#UsergroupsList) | **Get** /usergroups.list | 
[**UsergroupsUpdate**](UsergroupsApi.md#UsergroupsUpdate) | **Post** /usergroups.update | 
[**UsergroupsUsersList**](UsergroupsApi.md#UsergroupsUsersList) | **Get** /usergroups.users.list | 
[**UsergroupsUsersUpdate**](UsergroupsApi.md#UsergroupsUsersUpdate) | **Post** /usergroups.users.update | 



## UsergroupsCreate

> UsergroupsCreateSchema UsergroupsCreate(ctx).Token(token).Name(name).Channels(channels).Description(description).Handle(handle).IncludeCount(includeCount).Execute()





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
    token := "token_example" // string | Authentication token. Requires scope: `usergroups:write`
    name := "name_example" // string | A name for the User Group. Must be unique among User Groups.
    channels := "channels_example" // string | A comma separated string of encoded channel IDs for which the User Group uses as a default. (optional)
    description := "description_example" // string | A short description of the User Group. (optional)
    handle := "handle_example" // string | A mention handle. Must be unique among channels, users and User Groups. (optional)
    includeCount := true // bool | Include the number of users in each User Group. (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.UsergroupsApi.UsergroupsCreate(context.Background()).Token(token).Name(name).Channels(channels).Description(description).Handle(handle).IncludeCount(includeCount).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `UsergroupsApi.UsergroupsCreate``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `UsergroupsCreate`: UsergroupsCreateSchema
    fmt.Fprintf(os.Stdout, "Response from `UsergroupsApi.UsergroupsCreate`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiUsergroupsCreateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;usergroups:write&#x60; | 
 **name** | **string** | A name for the User Group. Must be unique among User Groups. | 
 **channels** | **string** | A comma separated string of encoded channel IDs for which the User Group uses as a default. | 
 **description** | **string** | A short description of the User Group. | 
 **handle** | **string** | A mention handle. Must be unique among channels, users and User Groups. | 
 **includeCount** | **bool** | Include the number of users in each User Group. | 

### Return type

[**UsergroupsCreateSchema**](UsergroupsCreateSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## UsergroupsDisable

> UsergroupsDisableSchema UsergroupsDisable(ctx).Token(token).Usergroup(usergroup).IncludeCount(includeCount).Execute()





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
    token := "token_example" // string | Authentication token. Requires scope: `usergroups:write`
    usergroup := "usergroup_example" // string | The encoded ID of the User Group to disable.
    includeCount := true // bool | Include the number of users in the User Group. (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.UsergroupsApi.UsergroupsDisable(context.Background()).Token(token).Usergroup(usergroup).IncludeCount(includeCount).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `UsergroupsApi.UsergroupsDisable``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `UsergroupsDisable`: UsergroupsDisableSchema
    fmt.Fprintf(os.Stdout, "Response from `UsergroupsApi.UsergroupsDisable`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiUsergroupsDisableRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;usergroups:write&#x60; | 
 **usergroup** | **string** | The encoded ID of the User Group to disable. | 
 **includeCount** | **bool** | Include the number of users in the User Group. | 

### Return type

[**UsergroupsDisableSchema**](UsergroupsDisableSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## UsergroupsEnable

> UsergroupsEnableSchema UsergroupsEnable(ctx).Token(token).Usergroup(usergroup).IncludeCount(includeCount).Execute()





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
    token := "token_example" // string | Authentication token. Requires scope: `usergroups:write`
    usergroup := "usergroup_example" // string | The encoded ID of the User Group to enable.
    includeCount := true // bool | Include the number of users in the User Group. (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.UsergroupsApi.UsergroupsEnable(context.Background()).Token(token).Usergroup(usergroup).IncludeCount(includeCount).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `UsergroupsApi.UsergroupsEnable``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `UsergroupsEnable`: UsergroupsEnableSchema
    fmt.Fprintf(os.Stdout, "Response from `UsergroupsApi.UsergroupsEnable`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiUsergroupsEnableRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;usergroups:write&#x60; | 
 **usergroup** | **string** | The encoded ID of the User Group to enable. | 
 **includeCount** | **bool** | Include the number of users in the User Group. | 

### Return type

[**UsergroupsEnableSchema**](UsergroupsEnableSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## UsergroupsList

> UsergroupsListSchema UsergroupsList(ctx).Token(token).IncludeUsers(includeUsers).IncludeCount(includeCount).IncludeDisabled(includeDisabled).Execute()





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
    token := "token_example" // string | Authentication token. Requires scope: `usergroups:read`
    includeUsers := true // bool | Include the list of users for each User Group. (optional)
    includeCount := true // bool | Include the number of users in each User Group. (optional)
    includeDisabled := true // bool | Include disabled User Groups. (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.UsergroupsApi.UsergroupsList(context.Background()).Token(token).IncludeUsers(includeUsers).IncludeCount(includeCount).IncludeDisabled(includeDisabled).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `UsergroupsApi.UsergroupsList``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `UsergroupsList`: UsergroupsListSchema
    fmt.Fprintf(os.Stdout, "Response from `UsergroupsApi.UsergroupsList`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiUsergroupsListRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;usergroups:read&#x60; | 
 **includeUsers** | **bool** | Include the list of users for each User Group. | 
 **includeCount** | **bool** | Include the number of users in each User Group. | 
 **includeDisabled** | **bool** | Include disabled User Groups. | 

### Return type

[**UsergroupsListSchema**](UsergroupsListSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## UsergroupsUpdate

> UsergroupsUpdateSchema UsergroupsUpdate(ctx).Token(token).Usergroup(usergroup).Channels(channels).Description(description).Handle(handle).IncludeCount(includeCount).Name(name).Execute()





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
    token := "token_example" // string | Authentication token. Requires scope: `usergroups:write`
    usergroup := "usergroup_example" // string | The encoded ID of the User Group to update.
    channels := "channels_example" // string | A comma separated string of encoded channel IDs for which the User Group uses as a default. (optional)
    description := "description_example" // string | A short description of the User Group. (optional)
    handle := "handle_example" // string | A mention handle. Must be unique among channels, users and User Groups. (optional)
    includeCount := true // bool | Include the number of users in the User Group. (optional)
    name := "name_example" // string | A name for the User Group. Must be unique among User Groups. (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.UsergroupsApi.UsergroupsUpdate(context.Background()).Token(token).Usergroup(usergroup).Channels(channels).Description(description).Handle(handle).IncludeCount(includeCount).Name(name).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `UsergroupsApi.UsergroupsUpdate``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `UsergroupsUpdate`: UsergroupsUpdateSchema
    fmt.Fprintf(os.Stdout, "Response from `UsergroupsApi.UsergroupsUpdate`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiUsergroupsUpdateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;usergroups:write&#x60; | 
 **usergroup** | **string** | The encoded ID of the User Group to update. | 
 **channels** | **string** | A comma separated string of encoded channel IDs for which the User Group uses as a default. | 
 **description** | **string** | A short description of the User Group. | 
 **handle** | **string** | A mention handle. Must be unique among channels, users and User Groups. | 
 **includeCount** | **bool** | Include the number of users in the User Group. | 
 **name** | **string** | A name for the User Group. Must be unique among User Groups. | 

### Return type

[**UsergroupsUpdateSchema**](UsergroupsUpdateSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## UsergroupsUsersList

> UsergroupsUsersListSchema UsergroupsUsersList(ctx).Token(token).Usergroup(usergroup).IncludeDisabled(includeDisabled).Execute()





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
    token := "token_example" // string | Authentication token. Requires scope: `usergroups:read`
    usergroup := "usergroup_example" // string | The encoded ID of the User Group to update.
    includeDisabled := true // bool | Allow results that involve disabled User Groups. (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.UsergroupsApi.UsergroupsUsersList(context.Background()).Token(token).Usergroup(usergroup).IncludeDisabled(includeDisabled).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `UsergroupsApi.UsergroupsUsersList``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `UsergroupsUsersList`: UsergroupsUsersListSchema
    fmt.Fprintf(os.Stdout, "Response from `UsergroupsApi.UsergroupsUsersList`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiUsergroupsUsersListRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;usergroups:read&#x60; | 
 **usergroup** | **string** | The encoded ID of the User Group to update. | 
 **includeDisabled** | **bool** | Allow results that involve disabled User Groups. | 

### Return type

[**UsergroupsUsersListSchema**](UsergroupsUsersListSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## UsergroupsUsersUpdate

> UsergroupsUsersUpdateSchema UsergroupsUsersUpdate(ctx).Token(token).Usergroup(usergroup).Users(users).IncludeCount(includeCount).Execute()





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
    token := "token_example" // string | Authentication token. Requires scope: `usergroups:write`
    usergroup := "usergroup_example" // string | The encoded ID of the User Group to update.
    users := "users_example" // string | A comma separated string of encoded user IDs that represent the entire list of users for the User Group.
    includeCount := true // bool | Include the number of users in the User Group. (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.UsergroupsApi.UsergroupsUsersUpdate(context.Background()).Token(token).Usergroup(usergroup).Users(users).IncludeCount(includeCount).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `UsergroupsApi.UsergroupsUsersUpdate``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `UsergroupsUsersUpdate`: UsergroupsUsersUpdateSchema
    fmt.Fprintf(os.Stdout, "Response from `UsergroupsApi.UsergroupsUsersUpdate`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiUsergroupsUsersUpdateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;usergroups:write&#x60; | 
 **usergroup** | **string** | The encoded ID of the User Group to update. | 
 **users** | **string** | A comma separated string of encoded user IDs that represent the entire list of users for the User Group. | 
 **includeCount** | **bool** | Include the number of users in the User Group. | 

### Return type

[**UsergroupsUsersUpdateSchema**](UsergroupsUsersUpdateSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

