# \RtmApi

All URIs are relative to *https://slack.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**RtmConnect**](RtmApi.md#RtmConnect) | **Get** /rtm.connect | 



## RtmConnect

> RtmConnectSchema RtmConnect(ctx).Token(token).BatchPresenceAware(batchPresenceAware).PresenceSub(presenceSub).Execute()





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
    token := "token_example" // string | Authentication token. Requires scope: `rtm:stream`
    batchPresenceAware := true // bool | Batch presence deliveries via subscription. Enabling changes the shape of `presence_change` events. See [batch presence](/docs/presence-and-status#batching). (optional)
    presenceSub := true // bool | Only deliver presence events when requested by subscription. See [presence subscriptions](/docs/presence-and-status#subscriptions). (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.RtmApi.RtmConnect(context.Background()).Token(token).BatchPresenceAware(batchPresenceAware).PresenceSub(presenceSub).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `RtmApi.RtmConnect``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `RtmConnect`: RtmConnectSchema
    fmt.Fprintf(os.Stdout, "Response from `RtmApi.RtmConnect`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiRtmConnectRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Authentication token. Requires scope: &#x60;rtm:stream&#x60; | 
 **batchPresenceAware** | **bool** | Batch presence deliveries via subscription. Enabling changes the shape of &#x60;presence_change&#x60; events. See [batch presence](/docs/presence-and-status#batching). | 
 **presenceSub** | **bool** | Only deliver presence events when requested by subscription. See [presence subscriptions](/docs/presence-and-status#subscriptions). | 

### Return type

[**RtmConnectSchema**](RtmConnectSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

