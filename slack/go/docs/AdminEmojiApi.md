# \AdminEmojiApi

All URIs are relative to *https://slack.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AdminEmojiAdd**](AdminEmojiApi.md#AdminEmojiAdd) | **Post** /admin.emoji.add | 
[**AdminEmojiAddAlias**](AdminEmojiApi.md#AdminEmojiAddAlias) | **Post** /admin.emoji.addAlias | 
[**AdminEmojiList**](AdminEmojiApi.md#AdminEmojiList) | **Get** /admin.emoji.list | 
[**AdminEmojiRemove**](AdminEmojiApi.md#AdminEmojiRemove) | **Post** /admin.emoji.remove | 
[**AdminEmojiRename**](AdminEmojiApi.md#AdminEmojiRename) | **Post** /admin.emoji.rename | 



## AdminEmojiAdd

> DefaultSuccessTemplate AdminEmojiAdd(ctx).Name(name).Token(token).Url(url).Execute()





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
    name := "name_example" // string | The name of the emoji to be removed. Colons (`:myemoji:`) around the value are not required, although they may be included.
    token := "token_example" // string | Authentication token. Requires scope: `admin.teams:write`
    url := "url_example" // string | The URL of a file to use as an image for the emoji. Square images under 128KB and with transparent backgrounds work best.

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.AdminEmojiApi.AdminEmojiAdd(context.Background()).Name(name).Token(token).Url(url).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `AdminEmojiApi.AdminEmojiAdd``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `AdminEmojiAdd`: DefaultSuccessTemplate
    fmt.Fprintf(os.Stdout, "Response from `AdminEmojiApi.AdminEmojiAdd`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiAdminEmojiAddRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **string** | The name of the emoji to be removed. Colons (&#x60;:myemoji:&#x60;) around the value are not required, although they may be included. | 
 **token** | **string** | Authentication token. Requires scope: &#x60;admin.teams:write&#x60; | 
 **url** | **string** | The URL of a file to use as an image for the emoji. Square images under 128KB and with transparent backgrounds work best. | 

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


## AdminEmojiAddAlias

> DefaultSuccessTemplate AdminEmojiAddAlias(ctx).AliasFor(aliasFor).Name(name).Token(token).Execute()





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
    aliasFor := "aliasFor_example" // string | The alias of the emoji.
    name := "name_example" // string | The name of the emoji to be aliased. Colons (`:myemoji:`) around the value are not required, although they may be included.
    token := "token_example" // string | Authentication token. Requires scope: `admin.teams:write`

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.AdminEmojiApi.AdminEmojiAddAlias(context.Background()).AliasFor(aliasFor).Name(name).Token(token).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `AdminEmojiApi.AdminEmojiAddAlias``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `AdminEmojiAddAlias`: DefaultSuccessTemplate
    fmt.Fprintf(os.Stdout, "Response from `AdminEmojiApi.AdminEmojiAddAlias`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiAdminEmojiAddAliasRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aliasFor** | **string** | The alias of the emoji. | 
 **name** | **string** | The name of the emoji to be aliased. Colons (&#x60;:myemoji:&#x60;) around the value are not required, although they may be included. | 
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


## AdminEmojiList

> DefaultSuccessTemplate AdminEmojiList(ctx).Token(token).Cursor(cursor).Limit(limit).Execute()





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
    cursor := "cursor_example" // string | Set `cursor` to `next_cursor` returned by the previous call to list items in the next page (optional)
    limit := int32(56) // int32 | The maximum number of items to return. Must be between 1 - 1000 both inclusive. (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.AdminEmojiApi.AdminEmojiList(context.Background()).Token(token).Cursor(cursor).Limit(limit).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `AdminEmojiApi.AdminEmojiList``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `AdminEmojiList`: DefaultSuccessTemplate
    fmt.Fprintf(os.Stdout, "Response from `AdminEmojiApi.AdminEmojiList`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiAdminEmojiListRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;admin.teams:read&#x60; | 
 **cursor** | **string** | Set &#x60;cursor&#x60; to &#x60;next_cursor&#x60; returned by the previous call to list items in the next page | 
 **limit** | **int32** | The maximum number of items to return. Must be between 1 - 1000 both inclusive. | 

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


## AdminEmojiRemove

> DefaultSuccessTemplate AdminEmojiRemove(ctx).Name(name).Token(token).Execute()





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
    name := "name_example" // string | The name of the emoji to be removed. Colons (`:myemoji:`) around the value are not required, although they may be included.
    token := "token_example" // string | Authentication token. Requires scope: `admin.teams:write`

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.AdminEmojiApi.AdminEmojiRemove(context.Background()).Name(name).Token(token).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `AdminEmojiApi.AdminEmojiRemove``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `AdminEmojiRemove`: DefaultSuccessTemplate
    fmt.Fprintf(os.Stdout, "Response from `AdminEmojiApi.AdminEmojiRemove`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiAdminEmojiRemoveRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **string** | The name of the emoji to be removed. Colons (&#x60;:myemoji:&#x60;) around the value are not required, although they may be included. | 
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


## AdminEmojiRename

> DefaultSuccessTemplate AdminEmojiRename(ctx).Name(name).NewName(newName).Token(token).Execute()





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
    name := "name_example" // string | The name of the emoji to be renamed. Colons (`:myemoji:`) around the value are not required, although they may be included.
    newName := "newName_example" // string | The new name of the emoji.
    token := "token_example" // string | Authentication token. Requires scope: `admin.teams:write`

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.AdminEmojiApi.AdminEmojiRename(context.Background()).Name(name).NewName(newName).Token(token).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `AdminEmojiApi.AdminEmojiRename``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `AdminEmojiRename`: DefaultSuccessTemplate
    fmt.Fprintf(os.Stdout, "Response from `AdminEmojiApi.AdminEmojiRename`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiAdminEmojiRenameRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **string** | The name of the emoji to be renamed. Colons (&#x60;:myemoji:&#x60;) around the value are not required, although they may be included. | 
 **newName** | **string** | The new name of the emoji. | 
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

