# \AdminAppsApi

All URIs are relative to *https://slack.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AdminAppsApprove**](AdminAppsApi.md#AdminAppsApprove) | **Post** /admin.apps.approve | 
[**AdminAppsRestrict**](AdminAppsApi.md#AdminAppsRestrict) | **Post** /admin.apps.restrict | 



## AdminAppsApprove

> DefaultSuccessTemplate AdminAppsApprove(ctx).Token(token).AppId(appId).RequestId(requestId).TeamId(teamId).Execute()





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
    token := "token_example" // string | Authentication token. Requires scope: `admin.apps:write`
    appId := "appId_example" // string | The id of the app to approve. (optional)
    requestId := "requestId_example" // string | The id of the request to approve. (optional)
    teamId := "teamId_example" // string |  (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.AdminAppsApi.AdminAppsApprove(context.Background()).Token(token).AppId(appId).RequestId(requestId).TeamId(teamId).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `AdminAppsApi.AdminAppsApprove``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `AdminAppsApprove`: DefaultSuccessTemplate
    fmt.Fprintf(os.Stdout, "Response from `AdminAppsApi.AdminAppsApprove`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiAdminAppsApproveRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;admin.apps:write&#x60; | 
 **appId** | **string** | The id of the app to approve. | 
 **requestId** | **string** | The id of the request to approve. | 
 **teamId** | **string** |  | 

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


## AdminAppsRestrict

> DefaultSuccessTemplate AdminAppsRestrict(ctx).Token(token).AppId(appId).RequestId(requestId).TeamId(teamId).Execute()





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
    token := "token_example" // string | Authentication token. Requires scope: `admin.apps:write`
    appId := "appId_example" // string | The id of the app to restrict. (optional)
    requestId := "requestId_example" // string | The id of the request to restrict. (optional)
    teamId := "teamId_example" // string |  (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.AdminAppsApi.AdminAppsRestrict(context.Background()).Token(token).AppId(appId).RequestId(requestId).TeamId(teamId).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `AdminAppsApi.AdminAppsRestrict``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `AdminAppsRestrict`: DefaultSuccessTemplate
    fmt.Fprintf(os.Stdout, "Response from `AdminAppsApi.AdminAppsRestrict`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiAdminAppsRestrictRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;admin.apps:write&#x60; | 
 **appId** | **string** | The id of the app to restrict. | 
 **requestId** | **string** | The id of the request to restrict. | 
 **teamId** | **string** |  | 

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

