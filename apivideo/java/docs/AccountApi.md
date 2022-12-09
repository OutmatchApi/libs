# AccountApi

All URIs are relative to *https://ws.api.video*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**gETAccount**](AccountApi.md#gETAccount) | **GET** /account | Show account |


<a name="gETAccount"></a>
# **gETAccount**
> Account gETAccount()

Show account

Deprecated. Authenticate and get a token, then you can use the bearer token here to retrieve details about your account.

### Example
```java
// Import classes:
import invalidPackageName.ApiClient;
import invalidPackageName.ApiException;
import invalidPackageName.Configuration;
import invalidPackageName.auth.*;
import invalidPackageName.models.*;
import apivideo.AccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://ws.api.video");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AccountApi apiInstance = new AccountApi(defaultClient);
    try {
      Account result = apiInstance.gETAccount();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#gETAccount");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Account**](Account.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **404** | Not Found |  -  |

