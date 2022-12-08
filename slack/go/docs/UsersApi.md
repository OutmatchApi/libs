# \UsersApi

All URIs are relative to *https://slack.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**UsersConversations**](UsersApi.md#UsersConversations) | **Get** /users.conversations | 
[**UsersDeletePhoto**](UsersApi.md#UsersDeletePhoto) | **Post** /users.deletePhoto | 
[**UsersGetPresence**](UsersApi.md#UsersGetPresence) | **Get** /users.getPresence | 
[**UsersIdentity**](UsersApi.md#UsersIdentity) | **Get** /users.identity | 
[**UsersInfo**](UsersApi.md#UsersInfo) | **Get** /users.info | 
[**UsersList**](UsersApi.md#UsersList) | **Get** /users.list | 
[**UsersLookupByEmail**](UsersApi.md#UsersLookupByEmail) | **Get** /users.lookupByEmail | 
[**UsersProfileGet**](UsersApi.md#UsersProfileGet) | **Get** /users.profile.get | 
[**UsersProfileSet**](UsersApi.md#UsersProfileSet) | **Post** /users.profile.set | 
[**UsersSetActive**](UsersApi.md#UsersSetActive) | **Post** /users.setActive | 
[**UsersSetPhoto**](UsersApi.md#UsersSetPhoto) | **Post** /users.setPhoto | 
[**UsersSetPresence**](UsersApi.md#UsersSetPresence) | **Post** /users.setPresence | 



## UsersConversations

> UsersConversationsSuccessSchema UsersConversations(ctx).Token(token).User(user).Types(types).ExcludeArchived(excludeArchived).Limit(limit).Cursor(cursor).Execute()





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
    user := "user_example" // string | Browse conversations by a specific user ID's membership. Non-public channels are restricted to those where the calling user shares membership. (optional)
    types := "types_example" // string | Mix and match channel types by providing a comma-separated list of any combination of `public_channel`, `private_channel`, `mpim`, `im` (optional)
    excludeArchived := true // bool | Set to `true` to exclude archived channels from the list (optional)
    limit := int32(56) // int32 | The maximum number of items to return. Fewer than the requested number of items may be returned, even if the end of the list hasn't been reached. Must be an integer no larger than 1000. (optional)
    cursor := "cursor_example" // string | Paginate through collections of data by setting the `cursor` parameter to a `next_cursor` attribute returned by a previous request's `response_metadata`. Default value fetches the first \"page\" of the collection. See [pagination](/docs/pagination) for more detail. (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.UsersApi.UsersConversations(context.Background()).Token(token).User(user).Types(types).ExcludeArchived(excludeArchived).Limit(limit).Cursor(cursor).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `UsersApi.UsersConversations``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `UsersConversations`: UsersConversationsSuccessSchema
    fmt.Fprintf(os.Stdout, "Response from `UsersApi.UsersConversations`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiUsersConversationsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;conversations:read&#x60; | 
 **user** | **string** | Browse conversations by a specific user ID&#39;s membership. Non-public channels are restricted to those where the calling user shares membership. | 
 **types** | **string** | Mix and match channel types by providing a comma-separated list of any combination of &#x60;public_channel&#x60;, &#x60;private_channel&#x60;, &#x60;mpim&#x60;, &#x60;im&#x60; | 
 **excludeArchived** | **bool** | Set to &#x60;true&#x60; to exclude archived channels from the list | 
 **limit** | **int32** | The maximum number of items to return. Fewer than the requested number of items may be returned, even if the end of the list hasn&#39;t been reached. Must be an integer no larger than 1000. | 
 **cursor** | **string** | Paginate through collections of data by setting the &#x60;cursor&#x60; parameter to a &#x60;next_cursor&#x60; attribute returned by a previous request&#39;s &#x60;response_metadata&#x60;. Default value fetches the first \&quot;page\&quot; of the collection. See [pagination](/docs/pagination) for more detail. | 

### Return type

[**UsersConversationsSuccessSchema**](UsersConversationsSuccessSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## UsersDeletePhoto

> UsersDeletePhotoSchema UsersDeletePhoto(ctx).Token(token).Execute()





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

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.UsersApi.UsersDeletePhoto(context.Background()).Token(token).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `UsersApi.UsersDeletePhoto``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `UsersDeletePhoto`: UsersDeletePhotoSchema
    fmt.Fprintf(os.Stdout, "Response from `UsersApi.UsersDeletePhoto`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiUsersDeletePhotoRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;users.profile:write&#x60; | 

### Return type

[**UsersDeletePhotoSchema**](UsersDeletePhotoSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## UsersGetPresence

> APIMethodUsersGetPresence UsersGetPresence(ctx).Token(token).User(user).Execute()





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
    token := "token_example" // string | Authentication token. Requires scope: `users:read`
    user := "user_example" // string | User to get presence info on. Defaults to the authed user. (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.UsersApi.UsersGetPresence(context.Background()).Token(token).User(user).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `UsersApi.UsersGetPresence``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `UsersGetPresence`: APIMethodUsersGetPresence
    fmt.Fprintf(os.Stdout, "Response from `UsersApi.UsersGetPresence`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiUsersGetPresenceRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;users:read&#x60; | 
 **user** | **string** | User to get presence info on. Defaults to the authed user. | 

### Return type

[**APIMethodUsersGetPresence**](APIMethodUsersGetPresence.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## UsersIdentity

> []UsersIdentitySchemaInner UsersIdentity(ctx).Token(token).Execute()





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
    token := "token_example" // string | Authentication token. Requires scope: `identity.basic` (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.UsersApi.UsersIdentity(context.Background()).Token(token).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `UsersApi.UsersIdentity``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `UsersIdentity`: []UsersIdentitySchemaInner
    fmt.Fprintf(os.Stdout, "Response from `UsersApi.UsersIdentity`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiUsersIdentityRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;identity.basic&#x60; | 

### Return type

[**[]UsersIdentitySchemaInner**](UsersIdentitySchemaInner.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## UsersInfo

> UsersInfoSuccessSchema UsersInfo(ctx).Token(token).IncludeLocale(includeLocale).User(user).Execute()





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
    token := "token_example" // string | Authentication token. Requires scope: `users:read`
    includeLocale := true // bool | Set this to `true` to receive the locale for this user. Defaults to `false` (optional)
    user := "user_example" // string | User to get info on (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.UsersApi.UsersInfo(context.Background()).Token(token).IncludeLocale(includeLocale).User(user).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `UsersApi.UsersInfo``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `UsersInfo`: UsersInfoSuccessSchema
    fmt.Fprintf(os.Stdout, "Response from `UsersApi.UsersInfo`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiUsersInfoRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;users:read&#x60; | 
 **includeLocale** | **bool** | Set this to &#x60;true&#x60; to receive the locale for this user. Defaults to &#x60;false&#x60; | 
 **user** | **string** | User to get info on | 

### Return type

[**UsersInfoSuccessSchema**](UsersInfoSuccessSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## UsersList

> UsersListSchema UsersList(ctx).Token(token).Limit(limit).Cursor(cursor).IncludeLocale(includeLocale).Execute()





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
    token := "token_example" // string | Authentication token. Requires scope: `users:read` (optional)
    limit := int32(56) // int32 | The maximum number of items to return. Fewer than the requested number of items may be returned, even if the end of the users list hasn't been reached. Providing no `limit` value will result in Slack attempting to deliver you the entire result set. If the collection is too large you may experience `limit_required` or HTTP 500 errors. (optional)
    cursor := "cursor_example" // string | Paginate through collections of data by setting the `cursor` parameter to a `next_cursor` attribute returned by a previous request's `response_metadata`. Default value fetches the first \"page\" of the collection. See [pagination](/docs/pagination) for more detail. (optional)
    includeLocale := true // bool | Set this to `true` to receive the locale for users. Defaults to `false` (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.UsersApi.UsersList(context.Background()).Token(token).Limit(limit).Cursor(cursor).IncludeLocale(includeLocale).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `UsersApi.UsersList``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `UsersList`: UsersListSchema
    fmt.Fprintf(os.Stdout, "Response from `UsersApi.UsersList`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiUsersListRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;users:read&#x60; | 
 **limit** | **int32** | The maximum number of items to return. Fewer than the requested number of items may be returned, even if the end of the users list hasn&#39;t been reached. Providing no &#x60;limit&#x60; value will result in Slack attempting to deliver you the entire result set. If the collection is too large you may experience &#x60;limit_required&#x60; or HTTP 500 errors. | 
 **cursor** | **string** | Paginate through collections of data by setting the &#x60;cursor&#x60; parameter to a &#x60;next_cursor&#x60; attribute returned by a previous request&#39;s &#x60;response_metadata&#x60;. Default value fetches the first \&quot;page\&quot; of the collection. See [pagination](/docs/pagination) for more detail. | 
 **includeLocale** | **bool** | Set this to &#x60;true&#x60; to receive the locale for users. Defaults to &#x60;false&#x60; | 

### Return type

[**UsersListSchema**](UsersListSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## UsersLookupByEmail

> UsersLookupByEmailSuccessSchema UsersLookupByEmail(ctx).Token(token).Email(email).Execute()





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
    token := "token_example" // string | Authentication token. Requires scope: `users:read.email`
    email := "email_example" // string | An email address belonging to a user in the workspace

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.UsersApi.UsersLookupByEmail(context.Background()).Token(token).Email(email).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `UsersApi.UsersLookupByEmail``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `UsersLookupByEmail`: UsersLookupByEmailSuccessSchema
    fmt.Fprintf(os.Stdout, "Response from `UsersApi.UsersLookupByEmail`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiUsersLookupByEmailRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;users:read.email&#x60; | 
 **email** | **string** | An email address belonging to a user in the workspace | 

### Return type

[**UsersLookupByEmailSuccessSchema**](UsersLookupByEmailSuccessSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


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
    resp, r, err := apiClient.UsersApi.UsersProfileGet(context.Background()).Token(token).IncludeLabels(includeLabels).User(user).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `UsersApi.UsersProfileGet``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `UsersProfileGet`: UsersProfileGetSchema
    fmt.Fprintf(os.Stdout, "Response from `UsersApi.UsersProfileGet`: %v\n", resp)
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
    resp, r, err := apiClient.UsersApi.UsersProfileSet(context.Background()).Token(token).Name(name).Profile(profile).User(user).Value(value).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `UsersApi.UsersProfileSet``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `UsersProfileSet`: UsersProfileSetSchema
    fmt.Fprintf(os.Stdout, "Response from `UsersApi.UsersProfileSet`: %v\n", resp)
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


## UsersSetActive

> UsersSetActiveSchema UsersSetActive(ctx).Token(token).Execute()





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
    token := "token_example" // string | Authentication token. Requires scope: `users:write`

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.UsersApi.UsersSetActive(context.Background()).Token(token).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `UsersApi.UsersSetActive``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `UsersSetActive`: UsersSetActiveSchema
    fmt.Fprintf(os.Stdout, "Response from `UsersApi.UsersSetActive`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiUsersSetActiveRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;users:write&#x60; | 

### Return type

[**UsersSetActiveSchema**](UsersSetActiveSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## UsersSetPhoto

> UsersSetPhotoSchema UsersSetPhoto(ctx).Token(token).CropW(cropW).CropX(cropX).CropY(cropY).Image(image).Execute()





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
    cropW := "cropW_example" // string | Width/height of crop box (always square) (optional)
    cropX := "cropX_example" // string | X coordinate of top-left corner of crop box (optional)
    cropY := "cropY_example" // string | Y coordinate of top-left corner of crop box (optional)
    image := "image_example" // string | File contents via `multipart/form-data`. (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.UsersApi.UsersSetPhoto(context.Background()).Token(token).CropW(cropW).CropX(cropX).CropY(cropY).Image(image).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `UsersApi.UsersSetPhoto``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `UsersSetPhoto`: UsersSetPhotoSchema
    fmt.Fprintf(os.Stdout, "Response from `UsersApi.UsersSetPhoto`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiUsersSetPhotoRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;users.profile:write&#x60; | 
 **cropW** | **string** | Width/height of crop box (always square) | 
 **cropX** | **string** | X coordinate of top-left corner of crop box | 
 **cropY** | **string** | Y coordinate of top-left corner of crop box | 
 **image** | **string** | File contents via &#x60;multipart/form-data&#x60;. | 

### Return type

[**UsersSetPhotoSchema**](UsersSetPhotoSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## UsersSetPresence

> UsersSetPresenceSchema UsersSetPresence(ctx).Token(token).Presence(presence).Execute()





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
    token := "token_example" // string | Authentication token. Requires scope: `users:write`
    presence := "presence_example" // string | Either `auto` or `away`

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.UsersApi.UsersSetPresence(context.Background()).Token(token).Presence(presence).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `UsersApi.UsersSetPresence``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `UsersSetPresence`: UsersSetPresenceSchema
    fmt.Fprintf(os.Stdout, "Response from `UsersApi.UsersSetPresence`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiUsersSetPresenceRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;users:write&#x60; | 
 **presence** | **string** | Either &#x60;auto&#x60; or &#x60;away&#x60; | 

### Return type

[**UsersSetPresenceSchema**](UsersSetPresenceSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

