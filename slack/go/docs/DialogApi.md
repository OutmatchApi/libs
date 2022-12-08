# \DialogApi

All URIs are relative to *https://slack.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**DialogOpen**](DialogApi.md#DialogOpen) | **Get** /dialog.open | 



## DialogOpen

> DialogOpenSchema DialogOpen(ctx).Token(token).Dialog(dialog).TriggerId(triggerId).Execute()





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
    dialog := "dialog_example" // string | The dialog definition. This must be a JSON-encoded string.
    triggerId := "triggerId_example" // string | Exchange a trigger to post to the user.

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.DialogApi.DialogOpen(context.Background()).Token(token).Dialog(dialog).TriggerId(triggerId).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `DialogApi.DialogOpen``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `DialogOpen`: DialogOpenSchema
    fmt.Fprintf(os.Stdout, "Response from `DialogApi.DialogOpen`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiDialogOpenRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;none&#x60; | 
 **dialog** | **string** | The dialog definition. This must be a JSON-encoded string. | 
 **triggerId** | **string** | Exchange a trigger to post to the user. | 

### Return type

[**DialogOpenSchema**](DialogOpenSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

