# \AuthenticationApi

All URIs are relative to *https://ws.api.video*

Method | HTTP request | Description
------------- | ------------- | -------------
[**POSTAuthApiKey**](AuthenticationApi.md#POSTAuthApiKey) | **Post** /auth/api-key | Authenticate
[**POSTAuthRefresh**](AuthenticationApi.md#POSTAuthRefresh) | **Post** /auth/refresh | Refresh token



## POSTAuthApiKey

> AccessToken POSTAuthApiKey(ctx).AuthenticatePayload(authenticatePayload).Execute()

Authenticate



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
    authenticatePayload := *openapiclient.NewAuthenticatePayload("ApiKey_example") // AuthenticatePayload |  (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.AuthenticationApi.POSTAuthApiKey(context.Background()).AuthenticatePayload(authenticatePayload).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `AuthenticationApi.POSTAuthApiKey``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `POSTAuthApiKey`: AccessToken
    fmt.Fprintf(os.Stdout, "Response from `AuthenticationApi.POSTAuthApiKey`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiPOSTAuthApiKeyRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authenticatePayload** | [**AuthenticatePayload**](AuthenticatePayload.md) |  | 

### Return type

[**AccessToken**](AccessToken.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## POSTAuthRefresh

> AccessToken POSTAuthRefresh(ctx).RefreshTokenPayload(refreshTokenPayload).Execute()

Refresh token



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
    refreshTokenPayload := *openapiclient.NewRefreshTokenPayload("RefreshToken_example") // RefreshTokenPayload |  (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.AuthenticationApi.POSTAuthRefresh(context.Background()).RefreshTokenPayload(refreshTokenPayload).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `AuthenticationApi.POSTAuthRefresh``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `POSTAuthRefresh`: AccessToken
    fmt.Fprintf(os.Stdout, "Response from `AuthenticationApi.POSTAuthRefresh`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiPOSTAuthRefreshRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **refreshTokenPayload** | [**RefreshTokenPayload**](RefreshTokenPayload.md) |  | 

### Return type

[**AccessToken**](AccessToken.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

