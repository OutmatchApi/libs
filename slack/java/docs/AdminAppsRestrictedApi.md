# AdminAppsRestrictedApi

All URIs are relative to *https://slack.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**adminAppsRestrictedList**](AdminAppsRestrictedApi.md#adminAppsRestrictedList) | **GET** /admin.apps.restricted.list |  |


<a name="adminAppsRestrictedList"></a>
# **adminAppsRestrictedList**
> DefaultSuccessTemplate adminAppsRestrictedList(token, limit, cursor, teamId, enterpriseId)



List restricted apps for an org or workspace.

### Example
```java
// Import classes:
import invalidPackageName.ApiClient;
import invalidPackageName.ApiException;
import invalidPackageName.Configuration;
import invalidPackageName.auth.*;
import invalidPackageName.models.*;
import slack.AdminAppsRestrictedApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://slack.com/api");
    
    // Configure OAuth2 access token for authorization: slackAuth
    OAuth slackAuth = (OAuth) defaultClient.getAuthentication("slackAuth");
    slackAuth.setAccessToken("YOUR ACCESS TOKEN");

    AdminAppsRestrictedApi apiInstance = new AdminAppsRestrictedApi(defaultClient);
    String token = "token_example"; // String | Authentication token. Requires scope: `admin.apps:read`
    Integer limit = 56; // Integer | The maximum number of items to return. Must be between 1 - 1000 both inclusive.
    String cursor = "cursor_example"; // String | Set `cursor` to `next_cursor` returned by the previous call to list items in the next page
    String teamId = "teamId_example"; // String | 
    String enterpriseId = "enterpriseId_example"; // String | 
    try {
      DefaultSuccessTemplate result = apiInstance.adminAppsRestrictedList(token, limit, cursor, teamId, enterpriseId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminAppsRestrictedApi#adminAppsRestrictedList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **token** | **String**| Authentication token. Requires scope: &#x60;admin.apps:read&#x60; | |
| **limit** | **Integer**| The maximum number of items to return. Must be between 1 - 1000 both inclusive. | [optional] |
| **cursor** | **String**| Set &#x60;cursor&#x60; to &#x60;next_cursor&#x60; returned by the previous call to list items in the next page | [optional] |
| **teamId** | **String**|  | [optional] |
| **enterpriseId** | **String**|  | [optional] |

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Typical success response |  -  |
| **0** | Typical error response |  -  |

