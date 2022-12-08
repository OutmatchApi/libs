# \BotsApi

All URIs are relative to *https://slack.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**BotsInfo**](BotsApi.md#BotsInfo) | **Get** /bots.info | 



## BotsInfo

> BotsInfoSchema BotsInfo(ctx).Token(token).Bot(bot).Execute()





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
    bot := "bot_example" // string | Bot user to get info on (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.BotsApi.BotsInfo(context.Background()).Token(token).Bot(bot).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `BotsApi.BotsInfo``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `BotsInfo`: BotsInfoSchema
    fmt.Fprintf(os.Stdout, "Response from `BotsApi.BotsInfo`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiBotsInfoRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;users:read&#x60; | 
 **bot** | **string** | Bot user to get info on | 

### Return type

[**BotsInfoSchema**](BotsInfoSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

