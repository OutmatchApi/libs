# \UsergroupsUsersApi

All URIs are relative to *https://slack.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**UsergroupsUsersList**](UsergroupsUsersApi.md#UsergroupsUsersList) | **Get** /usergroups.users.list | 
[**UsergroupsUsersUpdate**](UsergroupsUsersApi.md#UsergroupsUsersUpdate) | **Post** /usergroups.users.update | 



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
    resp, r, err := apiClient.UsergroupsUsersApi.UsergroupsUsersList(context.Background()).Token(token).Usergroup(usergroup).IncludeDisabled(includeDisabled).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `UsergroupsUsersApi.UsergroupsUsersList``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `UsergroupsUsersList`: UsergroupsUsersListSchema
    fmt.Fprintf(os.Stdout, "Response from `UsergroupsUsersApi.UsergroupsUsersList`: %v\n", resp)
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
    resp, r, err := apiClient.UsergroupsUsersApi.UsergroupsUsersUpdate(context.Background()).Token(token).Usergroup(usergroup).Users(users).IncludeCount(includeCount).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `UsergroupsUsersApi.UsergroupsUsersUpdate``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `UsergroupsUsersUpdate`: UsergroupsUsersUpdateSchema
    fmt.Fprintf(os.Stdout, "Response from `UsergroupsUsersApi.UsergroupsUsersUpdate`: %v\n", resp)
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

