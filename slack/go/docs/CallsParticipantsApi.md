# \CallsParticipantsApi

All URIs are relative to *https://slack.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CallsParticipantsAdd**](CallsParticipantsApi.md#CallsParticipantsAdd) | **Post** /calls.participants.add | 
[**CallsParticipantsRemove**](CallsParticipantsApi.md#CallsParticipantsRemove) | **Post** /calls.participants.remove | 



## CallsParticipantsAdd

> DefaultSuccessTemplate CallsParticipantsAdd(ctx).Token(token).Id(id).Users(users).Execute()





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
    token := "token_example" // string | Authentication token. Requires scope: `calls:write`
    id := "id_example" // string | `id` returned by the [`calls.add`](/methods/calls.add) method.
    users := "users_example" // string | The list of users to add as participants in the Call. [Read more on how to specify users here](/apis/calls#users).

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.CallsParticipantsApi.CallsParticipantsAdd(context.Background()).Token(token).Id(id).Users(users).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `CallsParticipantsApi.CallsParticipantsAdd``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `CallsParticipantsAdd`: DefaultSuccessTemplate
    fmt.Fprintf(os.Stdout, "Response from `CallsParticipantsApi.CallsParticipantsAdd`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCallsParticipantsAddRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;calls:write&#x60; | 
 **id** | **string** | &#x60;id&#x60; returned by the [&#x60;calls.add&#x60;](/methods/calls.add) method. | 
 **users** | **string** | The list of users to add as participants in the Call. [Read more on how to specify users here](/apis/calls#users). | 

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


## CallsParticipantsRemove

> DefaultSuccessTemplate CallsParticipantsRemove(ctx).Token(token).Id(id).Users(users).Execute()





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
    token := "token_example" // string | Authentication token. Requires scope: `calls:write`
    id := "id_example" // string | `id` returned by the [`calls.add`](/methods/calls.add) method.
    users := "users_example" // string | The list of users to remove as participants in the Call. [Read more on how to specify users here](/apis/calls#users).

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.CallsParticipantsApi.CallsParticipantsRemove(context.Background()).Token(token).Id(id).Users(users).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `CallsParticipantsApi.CallsParticipantsRemove``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `CallsParticipantsRemove`: DefaultSuccessTemplate
    fmt.Fprintf(os.Stdout, "Response from `CallsParticipantsApi.CallsParticipantsRemove`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCallsParticipantsRemoveRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;calls:write&#x60; | 
 **id** | **string** | &#x60;id&#x60; returned by the [&#x60;calls.add&#x60;](/methods/calls.add) method. | 
 **users** | **string** | The list of users to remove as participants in the Call. [Read more on how to specify users here](/apis/calls#users). | 

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

