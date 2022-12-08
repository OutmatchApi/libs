# \UsersProfileApi

All URIs are relative to *https://slack.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**UsersProfileGet**](UsersProfileApi.md#UsersProfileGet) | **Get** /users.profile.get | 
[**UsersProfileSet**](UsersProfileApi.md#UsersProfileSet) | **Post** /users.profile.set | 



## UsersProfileGet

> UsersProfileGetSchema UsersProfileGet(ctx).Token(token).IncludeLabels(includeLabels).User(user).Execute()





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
    token := "token_example" // string | Authentication token. Requires scope: `users.profile:read`
    includeLabels := true // bool | Include labels for each ID in custom profile fields (optional)
    user := "user_example" // string | User to retrieve profile info for (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.UsersProfileApi.UsersProfileGet(context.Background()).Token(token).IncludeLabels(includeLabels).User(user).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `UsersProfileApi.UsersProfileGet``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `UsersProfileGet`: UsersProfileGetSchema
    fmt.Fprintf(os.Stdout, "Response from `UsersProfileApi.UsersProfileGet`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiUsersProfileGetRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;users.profile:read&#x60; | 
 **includeLabels** | **bool** | Include labels for each ID in custom profile fields | 
 **user** | **string** | User to retrieve profile info for | 

### Return type

[**UsersProfileGetSchema**](UsersProfileGetSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## UsersProfileSet

> UsersProfileSetSchema UsersProfileSet(ctx).Token(token).Name(name).Profile(profile).User(user).Value(value).Execute()





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
    token := "token_example" // string | Authentication token. Requires scope: `users.profile:write`
    name := "name_example" // string | Name of a single key to set. Usable only if `profile` is not passed. (optional)
    profile := "profile_example" // string | Collection of key:value pairs presented as a URL-encoded JSON hash. At most 50 fields may be set. Each field name is limited to 255 characters. (optional)
    user := "user_example" // string | ID of user to change. This argument may only be specified by team admins on paid teams. (optional)
    value := "value_example" // string | Value to set a single key to. Usable only if `profile` is not passed. (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.UsersProfileApi.UsersProfileSet(context.Background()).Token(token).Name(name).Profile(profile).User(user).Value(value).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `UsersProfileApi.UsersProfileSet``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `UsersProfileSet`: UsersProfileSetSchema
    fmt.Fprintf(os.Stdout, "Response from `UsersProfileApi.UsersProfileSet`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiUsersProfileSetRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;users.profile:write&#x60; | 
 **name** | **string** | Name of a single key to set. Usable only if &#x60;profile&#x60; is not passed. | 
 **profile** | **string** | Collection of key:value pairs presented as a URL-encoded JSON hash. At most 50 fields may be set. Each field name is limited to 255 characters. | 
 **user** | **string** | ID of user to change. This argument may only be specified by team admins on paid teams. | 
 **value** | **string** | Value to set a single key to. Usable only if &#x60;profile&#x60; is not passed. | 

### Return type

[**UsersProfileSetSchema**](UsersProfileSetSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

