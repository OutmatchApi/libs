# AppsPermissionsApi

All URIs are relative to *https://slack.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**appsPermissionsInfo**](AppsPermissionsApi.md#appsPermissionsInfo) | **GET** /apps.permissions.info |  |
| [**appsPermissionsRequest**](AppsPermissionsApi.md#appsPermissionsRequest) | **GET** /apps.permissions.request |  |


<a name="appsPermissionsInfo"></a>
# **appsPermissionsInfo**
> AppsPermissionsInfoSchema appsPermissionsInfo(token)



Returns list of permissions this app has on a team.

### Example
```java
// Import classes:
import invalidPackageName.ApiClient;
import invalidPackageName.ApiException;
import invalidPackageName.Configuration;
import invalidPackageName.auth.*;
import invalidPackageName.models.*;
import slack.AppsPermissionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://slack.com/api");
    
    // Configure OAuth2 access token for authorization: slackAuth
    OAuth slackAuth = (OAuth) defaultClient.getAuthentication("slackAuth");
    slackAuth.setAccessToken("YOUR ACCESS TOKEN");

    AppsPermissionsApi apiInstance = new AppsPermissionsApi(defaultClient);
    String token = "token_example"; // String | Authentication token. Requires scope: `none`
    try {
      AppsPermissionsInfoSchema result = apiInstance.appsPermissionsInfo(token);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppsPermissionsApi#appsPermissionsInfo");
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
| **token** | **String**| Authentication token. Requires scope: &#x60;none&#x60; | [optional] |

### Return type

[**AppsPermissionsInfoSchema**](AppsPermissionsInfoSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Standard success response when used with a user token |  -  |
| **0** | Standard failure response when used with an invalid token |  -  |

<a name="appsPermissionsRequest"></a>
# **appsPermissionsRequest**
> AppsPermissionsRequestSchema appsPermissionsRequest(token, scopes, triggerId)



Allows an app to request additional scopes

### Example
```java
// Import classes:
import invalidPackageName.ApiClient;
import invalidPackageName.ApiException;
import invalidPackageName.Configuration;
import invalidPackageName.auth.*;
import invalidPackageName.models.*;
import slack.AppsPermissionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://slack.com/api");
    
    // Configure OAuth2 access token for authorization: slackAuth
    OAuth slackAuth = (OAuth) defaultClient.getAuthentication("slackAuth");
    slackAuth.setAccessToken("YOUR ACCESS TOKEN");

    AppsPermissionsApi apiInstance = new AppsPermissionsApi(defaultClient);
    String token = "token_example"; // String | Authentication token. Requires scope: `none`
    String scopes = "scopes_example"; // String | A comma separated list of scopes to request for
    String triggerId = "triggerId_example"; // String | Token used to trigger the permissions API
    try {
      AppsPermissionsRequestSchema result = apiInstance.appsPermissionsRequest(token, scopes, triggerId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppsPermissionsApi#appsPermissionsRequest");
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
| **token** | **String**| Authentication token. Requires scope: &#x60;none&#x60; | |
| **scopes** | **String**| A comma separated list of scopes to request for | |
| **triggerId** | **String**| Token used to trigger the permissions API | |

### Return type

[**AppsPermissionsRequestSchema**](AppsPermissionsRequestSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Standard success response when used with a user token |  -  |
| **0** | Standard failure response when trigger_id is invalid |  -  |

