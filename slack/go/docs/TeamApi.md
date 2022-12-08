# \TeamApi

All URIs are relative to *https://slack.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**TeamAccessLogs**](TeamApi.md#TeamAccessLogs) | **Get** /team.accessLogs | 
[**TeamBillableInfo**](TeamApi.md#TeamBillableInfo) | **Get** /team.billableInfo | 
[**TeamInfo**](TeamApi.md#TeamInfo) | **Get** /team.info | 
[**TeamIntegrationLogs**](TeamApi.md#TeamIntegrationLogs) | **Get** /team.integrationLogs | 
[**TeamProfileGet**](TeamApi.md#TeamProfileGet) | **Get** /team.profile.get | 



## TeamAccessLogs

> TeamAccessLogsSchema TeamAccessLogs(ctx).Token(token).Before(before).Count(count).Page(page).Execute()





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
    token := "token_example" // string | Authentication token. Requires scope: `admin`
    before := "before_example" // string | End of time range of logs to include in results (inclusive). (optional)
    count := "count_example" // string |  (optional)
    page := "page_example" // string |  (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.TeamApi.TeamAccessLogs(context.Background()).Token(token).Before(before).Count(count).Page(page).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `TeamApi.TeamAccessLogs``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `TeamAccessLogs`: TeamAccessLogsSchema
    fmt.Fprintf(os.Stdout, "Response from `TeamApi.TeamAccessLogs`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiTeamAccessLogsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;admin&#x60; | 
 **before** | **string** | End of time range of logs to include in results (inclusive). | 
 **count** | **string** |  | 
 **page** | **string** |  | 

### Return type

[**TeamAccessLogsSchema**](TeamAccessLogsSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## TeamBillableInfo

> DefaultSuccessTemplate TeamBillableInfo(ctx).Token(token).User(user).Execute()





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
    token := "token_example" // string | Authentication token. Requires scope: `admin`
    user := "user_example" // string | A user to retrieve the billable information for. Defaults to all users. (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.TeamApi.TeamBillableInfo(context.Background()).Token(token).User(user).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `TeamApi.TeamBillableInfo``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `TeamBillableInfo`: DefaultSuccessTemplate
    fmt.Fprintf(os.Stdout, "Response from `TeamApi.TeamBillableInfo`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiTeamBillableInfoRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;admin&#x60; | 
 **user** | **string** | A user to retrieve the billable information for. Defaults to all users. | 

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


## TeamInfo

> TeamInfoSchema TeamInfo(ctx).Token(token).Team(team).Execute()





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
    token := "token_example" // string | Authentication token. Requires scope: `team:read`
    team := "team_example" // string | Team to get info on, if omitted, will return information about the current team. Will only return team that the authenticated token is allowed to see through external shared channels (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.TeamApi.TeamInfo(context.Background()).Token(token).Team(team).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `TeamApi.TeamInfo``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `TeamInfo`: TeamInfoSchema
    fmt.Fprintf(os.Stdout, "Response from `TeamApi.TeamInfo`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiTeamInfoRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;team:read&#x60; | 
 **team** | **string** | Team to get info on, if omitted, will return information about the current team. Will only return team that the authenticated token is allowed to see through external shared channels | 

### Return type

[**TeamInfoSchema**](TeamInfoSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## TeamIntegrationLogs

> TeamIntegrationLogsSchema TeamIntegrationLogs(ctx).Token(token).AppId(appId).ChangeType(changeType).Count(count).Page(page).ServiceId(serviceId).User(user).Execute()





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
    token := "token_example" // string | Authentication token. Requires scope: `admin`
    appId := "appId_example" // string | Filter logs to this Slack app. Defaults to all logs. (optional)
    changeType := "changeType_example" // string | Filter logs with this change type. Defaults to all logs. (optional)
    count := "count_example" // string |  (optional)
    page := "page_example" // string |  (optional)
    serviceId := "serviceId_example" // string | Filter logs to this service. Defaults to all logs. (optional)
    user := "user_example" // string | Filter logs generated by this userâ€™s actions. Defaults to all logs. (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.TeamApi.TeamIntegrationLogs(context.Background()).Token(token).AppId(appId).ChangeType(changeType).Count(count).Page(page).ServiceId(serviceId).User(user).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `TeamApi.TeamIntegrationLogs``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `TeamIntegrationLogs`: TeamIntegrationLogsSchema
    fmt.Fprintf(os.Stdout, "Response from `TeamApi.TeamIntegrationLogs`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiTeamIntegrationLogsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;admin&#x60; | 
 **appId** | **string** | Filter logs to this Slack app. Defaults to all logs. | 
 **changeType** | **string** | Filter logs with this change type. Defaults to all logs. | 
 **count** | **string** |  | 
 **page** | **string** |  | 
 **serviceId** | **string** | Filter logs to this service. Defaults to all logs. | 
 **user** | **string** | Filter logs generated by this userâ€™s actions. Defaults to all logs. | 

### Return type

[**TeamIntegrationLogsSchema**](TeamIntegrationLogsSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## TeamProfileGet

> TeamProfileGetSuccessSchema TeamProfileGet(ctx).Token(token).Visibility(visibility).Execute()





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
    token := "token_example" // string | Authentication token. Requires scope: `users.profile:read`
    visibility := "visibility_example" // string | Filter by visibility. (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.TeamApi.TeamProfileGet(context.Background()).Token(token).Visibility(visibility).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `TeamApi.TeamProfileGet``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `TeamProfileGet`: TeamProfileGetSuccessSchema
    fmt.Fprintf(os.Stdout, "Response from `TeamApi.TeamProfileGet`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiTeamProfileGetRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;users.profile:read&#x60; | 
 **visibility** | **string** | Filter by visibility. | 

### Return type

[**TeamProfileGetSuccessSchema**](TeamProfileGetSuccessSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

