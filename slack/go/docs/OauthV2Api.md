# \OauthV2Api

All URIs are relative to *https://slack.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**OauthV2Access**](OauthV2Api.md#OauthV2Access) | **Get** /oauth.v2.access | 



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
    resp, r, err := apiClient.OauthV2Api.OauthV2Access(context.Background()).Code(code).ClientId(clientId).ClientSecret(clientSecret).RedirectUri(redirectUri).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `OauthV2Api.OauthV2Access``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `OauthV2Access`: DefaultSuccessTemplate
    fmt.Fprintf(os.Stdout, "Response from `OauthV2Api.OauthV2Access`: %v\n", resp)
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

