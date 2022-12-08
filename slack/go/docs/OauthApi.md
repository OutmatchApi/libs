# \OauthApi

All URIs are relative to *https://slack.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**OauthAccess**](OauthApi.md#OauthAccess) | **Get** /oauth.access | 
[**OauthToken**](OauthApi.md#OauthToken) | **Get** /oauth.token | 
[**OauthV2Access**](OauthApi.md#OauthV2Access) | **Get** /oauth.v2.access | 



## OauthAccess

> DefaultSuccessTemplate OauthAccess(ctx).ClientId(clientId).ClientSecret(clientSecret).Code(code).RedirectUri(redirectUri).SingleChannel(singleChannel).Execute()





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
    clientId := "clientId_example" // string | Issued when you created your application. (optional)
    clientSecret := "clientSecret_example" // string | Issued when you created your application. (optional)
    code := "code_example" // string | The `code` param returned via the OAuth callback. (optional)
    redirectUri := "redirectUri_example" // string | This must match the originally submitted URI (if one was sent). (optional)
    singleChannel := true // bool | Request the user to add your app only to a single channel. Only valid with a [legacy workspace app](https://api.slack.com/legacy-workspace-apps). (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.OauthApi.OauthAccess(context.Background()).ClientId(clientId).ClientSecret(clientSecret).Code(code).RedirectUri(redirectUri).SingleChannel(singleChannel).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `OauthApi.OauthAccess``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `OauthAccess`: DefaultSuccessTemplate
    fmt.Fprintf(os.Stdout, "Response from `OauthApi.OauthAccess`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiOauthAccessRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **string** | Issued when you created your application. | 
 **clientSecret** | **string** | Issued when you created your application. | 
 **code** | **string** | The &#x60;code&#x60; param returned via the OAuth callback. | 
 **redirectUri** | **string** | This must match the originally submitted URI (if one was sent). | 
 **singleChannel** | **bool** | Request the user to add your app only to a single channel. Only valid with a [legacy workspace app](https://api.slack.com/legacy-workspace-apps). | 

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


## OauthToken

> DefaultSuccessTemplate OauthToken(ctx).ClientId(clientId).ClientSecret(clientSecret).Code(code).RedirectUri(redirectUri).SingleChannel(singleChannel).Execute()





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
    clientId := "clientId_example" // string | Issued when you created your application. (optional)
    clientSecret := "clientSecret_example" // string | Issued when you created your application. (optional)
    code := "code_example" // string | The `code` param returned via the OAuth callback. (optional)
    redirectUri := "redirectUri_example" // string | This must match the originally submitted URI (if one was sent). (optional)
    singleChannel := true // bool | Request the user to add your app only to a single channel. (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.OauthApi.OauthToken(context.Background()).ClientId(clientId).ClientSecret(clientSecret).Code(code).RedirectUri(redirectUri).SingleChannel(singleChannel).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `OauthApi.OauthToken``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `OauthToken`: DefaultSuccessTemplate
    fmt.Fprintf(os.Stdout, "Response from `OauthApi.OauthToken`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiOauthTokenRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **string** | Issued when you created your application. | 
 **clientSecret** | **string** | Issued when you created your application. | 
 **code** | **string** | The &#x60;code&#x60; param returned via the OAuth callback. | 
 **redirectUri** | **string** | This must match the originally submitted URI (if one was sent). | 
 **singleChannel** | **bool** | Request the user to add your app only to a single channel. | 

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


## OauthV2Access

> DefaultSuccessTemplate OauthV2Access(ctx).Code(code).ClientId(clientId).ClientSecret(clientSecret).RedirectUri(redirectUri).Execute()





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
    code := "code_example" // string | The `code` param returned via the OAuth callback.
    clientId := "clientId_example" // string | Issued when you created your application. (optional)
    clientSecret := "clientSecret_example" // string | Issued when you created your application. (optional)
    redirectUri := "redirectUri_example" // string | This must match the originally submitted URI (if one was sent). (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.OauthApi.OauthV2Access(context.Background()).Code(code).ClientId(clientId).ClientSecret(clientSecret).RedirectUri(redirectUri).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `OauthApi.OauthV2Access``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `OauthV2Access`: DefaultSuccessTemplate
    fmt.Fprintf(os.Stdout, "Response from `OauthApi.OauthV2Access`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiOauthV2AccessRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **string** | The &#x60;code&#x60; param returned via the OAuth callback. | 
 **clientId** | **string** | Issued when you created your application. | 
 **clientSecret** | **string** | Issued when you created your application. | 
 **redirectUri** | **string** | This must match the originally submitted URI (if one was sent). | 

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

