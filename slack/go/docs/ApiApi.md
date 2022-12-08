# \ApiApi

All URIs are relative to *https://slack.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ApiTest**](ApiApi.md#ApiTest) | **Get** /api.test | 



## ApiTest

> ApiTestSuccessSchema ApiTest(ctx).Error_(error_).Foo(foo).Execute()





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
    error_ := "error__example" // string | Error response to return (optional)
    foo := "foo_example" // string | example property to return (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.ApiApi.ApiTest(context.Background()).Error_(error_).Foo(foo).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `ApiApi.ApiTest``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `ApiTest`: ApiTestSuccessSchema
    fmt.Fprintf(os.Stdout, "Response from `ApiApi.ApiTest`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiApiTestRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **error_** | **string** | Error response to return | 
 **foo** | **string** | example property to return | 

### Return type

[**ApiTestSuccessSchema**](ApiTestSuccessSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

