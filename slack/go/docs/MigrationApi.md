# \MigrationApi

All URIs are relative to *https://slack.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**MigrationExchange**](MigrationApi.md#MigrationExchange) | **Get** /migration.exchange | 



## MigrationExchange

> MigrationExchangeSuccessSchema MigrationExchange(ctx).Token(token).Users(users).TeamId(teamId).ToOld(toOld).Execute()





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
    token := "token_example" // string | Authentication token. Requires scope: `tokens.basic`
    users := "users_example" // string | A comma-separated list of user ids, up to 400 per request
    teamId := "teamId_example" // string | Specify team_id starts with `T` in case of Org Token (optional)
    toOld := true // bool | Specify `true` to convert `W` global user IDs to workspace-specific `U` IDs. Defaults to `false`. (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.MigrationApi.MigrationExchange(context.Background()).Token(token).Users(users).TeamId(teamId).ToOld(toOld).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `MigrationApi.MigrationExchange``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `MigrationExchange`: MigrationExchangeSuccessSchema
    fmt.Fprintf(os.Stdout, "Response from `MigrationApi.MigrationExchange`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiMigrationExchangeRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;tokens.basic&#x60; | 
 **users** | **string** | A comma-separated list of user ids, up to 400 per request | 
 **teamId** | **string** | Specify team_id starts with &#x60;T&#x60; in case of Org Token | 
 **toOld** | **bool** | Specify &#x60;true&#x60; to convert &#x60;W&#x60; global user IDs to workspace-specific &#x60;U&#x60; IDs. Defaults to &#x60;false&#x60;. | 

### Return type

[**MigrationExchangeSuccessSchema**](MigrationExchangeSuccessSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

