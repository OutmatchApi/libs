# \RemindersApi

All URIs are relative to *https://slack.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**RemindersAdd**](RemindersApi.md#RemindersAdd) | **Post** /reminders.add | 
[**RemindersComplete**](RemindersApi.md#RemindersComplete) | **Post** /reminders.complete | 
[**RemindersDelete**](RemindersApi.md#RemindersDelete) | **Post** /reminders.delete | 
[**RemindersInfo**](RemindersApi.md#RemindersInfo) | **Get** /reminders.info | 
[**RemindersList**](RemindersApi.md#RemindersList) | **Get** /reminders.list | 



## RemindersAdd

> RemindersAddSchema RemindersAdd(ctx).Token(token).Text(text).Time(time).User(user).Execute()





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
    token := "token_example" // string | Authentication token. Requires scope: `reminders:write`
    text := "text_example" // string | The content of the reminder
    time := "time_example" // string | When this reminder should happen: the Unix timestamp (up to five years from now), the number of seconds until the reminder (if within 24 hours), or a natural language description (Ex. \\\"in 15 minutes,\\\" or \\\"every Thursday\\\")
    user := "user_example" // string | The user who will receive the reminder. If no user is specified, the reminder will go to user who created it. (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.RemindersApi.RemindersAdd(context.Background()).Token(token).Text(text).Time(time).User(user).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `RemindersApi.RemindersAdd``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `RemindersAdd`: RemindersAddSchema
    fmt.Fprintf(os.Stdout, "Response from `RemindersApi.RemindersAdd`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiRemindersAddRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;reminders:write&#x60; | 
 **text** | **string** | The content of the reminder | 
 **time** | **string** | When this reminder should happen: the Unix timestamp (up to five years from now), the number of seconds until the reminder (if within 24 hours), or a natural language description (Ex. \\\&quot;in 15 minutes,\\\&quot; or \\\&quot;every Thursday\\\&quot;) | 
 **user** | **string** | The user who will receive the reminder. If no user is specified, the reminder will go to user who created it. | 

### Return type

[**RemindersAddSchema**](RemindersAddSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## RemindersComplete

> RemindersCompleteSchema RemindersComplete(ctx).Token(token).Reminder(reminder).Execute()





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
    token := "token_example" // string | Authentication token. Requires scope: `reminders:write` (optional)
    reminder := "reminder_example" // string | The ID of the reminder to be marked as complete (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.RemindersApi.RemindersComplete(context.Background()).Token(token).Reminder(reminder).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `RemindersApi.RemindersComplete``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `RemindersComplete`: RemindersCompleteSchema
    fmt.Fprintf(os.Stdout, "Response from `RemindersApi.RemindersComplete`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiRemindersCompleteRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;reminders:write&#x60; | 
 **reminder** | **string** | The ID of the reminder to be marked as complete | 

### Return type

[**RemindersCompleteSchema**](RemindersCompleteSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## RemindersDelete

> RemindersDeleteSchema RemindersDelete(ctx).Token(token).Reminder(reminder).Execute()





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
    token := "token_example" // string | Authentication token. Requires scope: `reminders:write` (optional)
    reminder := "reminder_example" // string | The ID of the reminder (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.RemindersApi.RemindersDelete(context.Background()).Token(token).Reminder(reminder).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `RemindersApi.RemindersDelete``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `RemindersDelete`: RemindersDeleteSchema
    fmt.Fprintf(os.Stdout, "Response from `RemindersApi.RemindersDelete`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiRemindersDeleteRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;reminders:write&#x60; | 
 **reminder** | **string** | The ID of the reminder | 

### Return type

[**RemindersDeleteSchema**](RemindersDeleteSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## RemindersInfo

> RemindersInfoSchema RemindersInfo(ctx).Token(token).Reminder(reminder).Execute()





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
    token := "token_example" // string | Authentication token. Requires scope: `reminders:read` (optional)
    reminder := "reminder_example" // string | The ID of the reminder (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.RemindersApi.RemindersInfo(context.Background()).Token(token).Reminder(reminder).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `RemindersApi.RemindersInfo``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `RemindersInfo`: RemindersInfoSchema
    fmt.Fprintf(os.Stdout, "Response from `RemindersApi.RemindersInfo`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiRemindersInfoRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;reminders:read&#x60; | 
 **reminder** | **string** | The ID of the reminder | 

### Return type

[**RemindersInfoSchema**](RemindersInfoSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## RemindersList

> RemindersListSchema RemindersList(ctx).Token(token).Execute()





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
    token := "token_example" // string | Authentication token. Requires scope: `reminders:read` (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.RemindersApi.RemindersList(context.Background()).Token(token).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `RemindersApi.RemindersList``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `RemindersList`: RemindersListSchema
    fmt.Fprintf(os.Stdout, "Response from `RemindersApi.RemindersList`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiRemindersListRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;reminders:read&#x60; | 

### Return type

[**RemindersListSchema**](RemindersListSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

