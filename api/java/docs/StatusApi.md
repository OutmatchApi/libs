# StatusApi

All URIs are relative to *https://api.outmatchapi.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getStatus**](StatusApi.md#getStatus) | **GET** /status |  |


<a name="getStatus"></a>
# **getStatus**
> getStatus()



Check the API status

### Example
```java
// Import classes:
import invalidPackageName.ApiClient;
import invalidPackageName.ApiException;
import invalidPackageName.Configuration;
import invalidPackageName.models.*;
import api.StatusApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.outmatchapi.com");

    StatusApi apiInstance = new StatusApi(defaultClient);
    try {
      apiInstance.getStatus();
    } catch (ApiException e) {
      System.err.println("Exception when calling StatusApi#getStatus");
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

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Good response |  -  |

