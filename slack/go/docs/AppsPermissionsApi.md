# \AppsPermissionsApi

All URIs are relative to *https://slack.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AppsPermissionsInfo**](AppsPermissionsApi.md#AppsPermissionsInfo) | **Get** /apps.permissions.info | 
[**AppsPermissionsRequest**](AppsPermissionsApi.md#AppsPermissionsRequest) | **Get** /apps.permissions.request | 



## AppsPermissionsInfo

> AppsPermissionsInfoSchema AppsPermissionsInfo(ctx).Token(token).Execute()





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
    token := "token_example" // string | Authentication token. Requires scope: `none` (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.AppsPermissionsApi.AppsPermissionsInfo(context.Background()).Token(token).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `AppsPermissionsApi.AppsPermissionsInfo``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `AppsPermissionsInfo`: AppsPermissionsInfoSchema
    fmt.Fprintf(os.Stdout, "Response from `AppsPermissionsApi.AppsPermissionsInfo`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiAppsPermissionsInfoRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;none&#x60; | 

### Return type

[**AppsPermissionsInfoSchema**](AppsPermissionsInfoSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## AppsPermissionsRequest

> AppsPermissionsRequestSchema AppsPermissionsRequest(ctx).Token(token).Scopes(scopes).TriggerId(triggerId).Execute()





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
    token := "token_example" // string | Authentication token. Requires scope: `none`
    scopes := "scopes_example" // string | A comma separated list of scopes to request for
    triggerId := "triggerId_example" // string | Token used to trigger the permissions API

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.AppsPermissionsApi.AppsPermissionsRequest(context.Background()).Token(token).Scopes(scopes).TriggerId(triggerId).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `AppsPermissionsApi.AppsPermissionsRequest``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `AppsPermissionsRequest`: AppsPermissionsRequestSchema
    fmt.Fprintf(os.Stdout, "Response from `AppsPermissionsApi.AppsPermissionsRequest`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiAppsPermissionsRequestRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;none&#x60; | 
 **scopes** | **string** | A comma separated list of scopes to request for | 
 **triggerId** | **string** | Token used to trigger the permissions API | 

### Return type

[**AppsPermissionsRequestSchema**](AppsPermissionsRequestSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

