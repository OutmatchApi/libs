# AppsApi

All URIs are relative to *https://slack.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**appsEventAuthorizationsList**](AppsApi.md#appsEventAuthorizationsList) | **GET** /apps.event.authorizations.list |  |
| [**appsPermissionsInfo**](AppsApi.md#appsPermissionsInfo) | **GET** /apps.permissions.info |  |
| [**appsPermissionsRequest**](AppsApi.md#appsPermissionsRequest) | **GET** /apps.permissions.request |  |
| [**appsPermissionsResourcesList**](AppsApi.md#appsPermissionsResourcesList) | **GET** /apps.permissions.resources.list |  |
| [**appsPermissionsScopesList**](AppsApi.md#appsPermissionsScopesList) | **GET** /apps.permissions.scopes.list |  |
| [**appsPermissionsUsersList**](AppsApi.md#appsPermissionsUsersList) | **GET** /apps.permissions.users.list |  |
| [**appsPermissionsUsersRequest**](AppsApi.md#appsPermissionsUsersRequest) | **GET** /apps.permissions.users.request |  |
| [**appsUninstall**](AppsApi.md#appsUninstall) | **GET** /apps.uninstall |  |


<a name="appsEventAuthorizationsList"></a>
# **appsEventAuthorizationsList**
> DefaultSuccessTemplate appsEventAuthorizationsList(token, eventContext, cursor, limit)



Get a list of authorizations for the given event context. Each authorization represents an app installation that the event is visible to.

### Example
```java
// Import classes:
import invalidPackageName.ApiClient;
import invalidPackageName.ApiException;
import invalidPackageName.Configuration;
import invalidPackageName.auth.*;
import invalidPackageName.models.*;
import slack.AppsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://slack.com/api");
    
    // Configure OAuth2 access token for authorization: slackAuth
    OAuth slackAuth = (OAuth) defaultClient.getAuthentication("slackAuth");
    slackAuth.setAccessToken("YOUR ACCESS TOKEN");

    AppsApi apiInstance = new AppsApi(defaultClient);
    String token = "token_example"; // String | Authentication token. Requires scope: `authorizations:read`
    String eventContext = "eventContext_example"; // String | 
    String cursor = "cursor_example"; // String | 
    Integer limit = 56; // Integer | 
    try {
      DefaultSuccessTemplate result = apiInstance.appsEventAuthorizationsList(token, eventContext, cursor, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppsApi#appsEventAuthorizationsList");
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
| **token** | **String**| Authentication token. Requires scope: &#x60;authorizations:read&#x60; | |
| **eventContext** | **String**|  | |
| **cursor** | **String**|  | [optional] |
| **limit** | **Integer**|  | [optional] |

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
import slack.AppsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://slack.com/api");
    
    // Configure OAuth2 access token for authorization: slackAuth
    OAuth slackAuth = (OAuth) defaultClient.getAuthentication("slackAuth");
    slackAuth.setAccessToken("YOUR ACCESS TOKEN");

    AppsApi apiInstance = new AppsApi(defaultClient);
    String token = "token_example"; // String | Authentication token. Requires scope: `none`
    try {
      AppsPermissionsInfoSchema result = apiInstance.appsPermissionsInfo(token);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppsApi#appsPermissionsInfo");
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
import slack.AppsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://slack.com/api");
    
    // Configure OAuth2 access token for authorization: slackAuth
    OAuth slackAuth = (OAuth) defaultClient.getAuthentication("slackAuth");
    slackAuth.setAccessToken("YOUR ACCESS TOKEN");

    AppsApi apiInstance = new AppsApi(defaultClient);
    String token = "token_example"; // String | Authentication token. Requires scope: `none`
    String scopes = "scopes_example"; // String | A comma separated list of scopes to request for
    String triggerId = "triggerId_example"; // String | Token used to trigger the permissions API
    try {
      AppsPermissionsRequestSchema result = apiInstance.appsPermissionsRequest(token, scopes, triggerId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppsApi#appsPermissionsRequest");
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

<a name="appsPermissionsResourcesList"></a>
# **appsPermissionsResourcesList**
> AppsPermissionsResourcesListSuccessSchema appsPermissionsResourcesList(token, cursor, limit)



Returns list of resource grants this app has on a team.

### Example
```java
// Import classes:
import invalidPackageName.ApiClient;
import invalidPackageName.ApiException;
import invalidPackageName.Configuration;
import invalidPackageName.auth.*;
import invalidPackageName.models.*;
import slack.AppsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://slack.com/api");
    
    // Configure OAuth2 access token for authorization: slackAuth
    OAuth slackAuth = (OAuth) defaultClient.getAuthentication("slackAuth");
    slackAuth.setAccessToken("YOUR ACCESS TOKEN");

    AppsApi apiInstance = new AppsApi(defaultClient);
    String token = "token_example"; // String | Authentication token. Requires scope: `none`
    String cursor = "cursor_example"; // String | Paginate through collections of data by setting the `cursor` parameter to a `next_cursor` attribute returned by a previous request's `response_metadata`. Default value fetches the first \"page\" of the collection. See [pagination](/docs/pagination) for more detail.
    Integer limit = 56; // Integer | The maximum number of items to return.
    try {
      AppsPermissionsResourcesListSuccessSchema result = apiInstance.appsPermissionsResourcesList(token, cursor, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppsApi#appsPermissionsResourcesList");
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
| **cursor** | **String**| Paginate through collections of data by setting the &#x60;cursor&#x60; parameter to a &#x60;next_cursor&#x60; attribute returned by a previous request&#39;s &#x60;response_metadata&#x60;. Default value fetches the first \&quot;page\&quot; of the collection. See [pagination](/docs/pagination) for more detail. | [optional] |
| **limit** | **Integer**| The maximum number of items to return. | [optional] |

### Return type

[**AppsPermissionsResourcesListSuccessSchema**](AppsPermissionsResourcesListSuccessSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Typical successful paginated response |  -  |
| **0** | Typical error response |  -  |

<a name="appsPermissionsScopesList"></a>
# **appsPermissionsScopesList**
> ApiPermissionsScopesListSuccessSchema appsPermissionsScopesList(token)



Returns list of scopes this app has on a team.

### Example
```java
// Import classes:
import invalidPackageName.ApiClient;
import invalidPackageName.ApiException;
import invalidPackageName.Configuration;
import invalidPackageName.auth.*;
import invalidPackageName.models.*;
import slack.AppsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://slack.com/api");
    
    // Configure OAuth2 access token for authorization: slackAuth
    OAuth slackAuth = (OAuth) defaultClient.getAuthentication("slackAuth");
    slackAuth.setAccessToken("YOUR ACCESS TOKEN");

    AppsApi apiInstance = new AppsApi(defaultClient);
    String token = "token_example"; // String | Authentication token. Requires scope: `none`
    try {
      ApiPermissionsScopesListSuccessSchema result = apiInstance.appsPermissionsScopesList(token);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppsApi#appsPermissionsScopesList");
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

### Return type

[**ApiPermissionsScopesListSuccessSchema**](ApiPermissionsScopesListSuccessSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Typical successful paginated response |  -  |
| **0** | Typical error response |  -  |

<a name="appsPermissionsUsersList"></a>
# **appsPermissionsUsersList**
> DefaultSuccessTemplate appsPermissionsUsersList(token, cursor, limit)



Returns list of user grants and corresponding scopes this app has on a team.

### Example
```java
// Import classes:
import invalidPackageName.ApiClient;
import invalidPackageName.ApiException;
import invalidPackageName.Configuration;
import invalidPackageName.auth.*;
import invalidPackageName.models.*;
import slack.AppsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://slack.com/api");
    
    // Configure OAuth2 access token for authorization: slackAuth
    OAuth slackAuth = (OAuth) defaultClient.getAuthentication("slackAuth");
    slackAuth.setAccessToken("YOUR ACCESS TOKEN");

    AppsApi apiInstance = new AppsApi(defaultClient);
    String token = "token_example"; // String | Authentication token. Requires scope: `none`
    String cursor = "cursor_example"; // String | Paginate through collections of data by setting the `cursor` parameter to a `next_cursor` attribute returned by a previous request's `response_metadata`. Default value fetches the first \"page\" of the collection. See [pagination](/docs/pagination) for more detail.
    Integer limit = 56; // Integer | The maximum number of items to return.
    try {
      DefaultSuccessTemplate result = apiInstance.appsPermissionsUsersList(token, cursor, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppsApi#appsPermissionsUsersList");
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
| **cursor** | **String**| Paginate through collections of data by setting the &#x60;cursor&#x60; parameter to a &#x60;next_cursor&#x60; attribute returned by a previous request&#39;s &#x60;response_metadata&#x60;. Default value fetches the first \&quot;page\&quot; of the collection. See [pagination](/docs/pagination) for more detail. | [optional] |
| **limit** | **Integer**| The maximum number of items to return. | [optional] |

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
| **200** | Typical successful paginated response |  -  |
| **0** | Typical error response |  -  |

<a name="appsPermissionsUsersRequest"></a>
# **appsPermissionsUsersRequest**
> DefaultSuccessTemplate appsPermissionsUsersRequest(token, scopes, triggerId, user)



Enables an app to trigger a permissions modal to grant an app access to a user access scope.

### Example
```java
// Import classes:
import invalidPackageName.ApiClient;
import invalidPackageName.ApiException;
import invalidPackageName.Configuration;
import invalidPackageName.auth.*;
import invalidPackageName.models.*;
import slack.AppsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://slack.com/api");
    
    // Configure OAuth2 access token for authorization: slackAuth
    OAuth slackAuth = (OAuth) defaultClient.getAuthentication("slackAuth");
    slackAuth.setAccessToken("YOUR ACCESS TOKEN");

    AppsApi apiInstance = new AppsApi(defaultClient);
    String token = "token_example"; // String | Authentication token. Requires scope: `none`
    String scopes = "scopes_example"; // String | A comma separated list of user scopes to request for
    String triggerId = "triggerId_example"; // String | Token used to trigger the request
    String user = "user_example"; // String | The user this scope is being requested for
    try {
      DefaultSuccessTemplate result = apiInstance.appsPermissionsUsersRequest(token, scopes, triggerId, user);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppsApi#appsPermissionsUsersRequest");
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
| **scopes** | **String**| A comma separated list of user scopes to request for | |
| **triggerId** | **String**| Token used to trigger the request | |
| **user** | **String**| The user this scope is being requested for | |

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
| **200** | Standard success response when used with a user token |  -  |
| **0** | Standard failure response when trigger_id is invalid |  -  |

<a name="appsUninstall"></a>
# **appsUninstall**
> AppsUninstallSchema appsUninstall(token, clientId, clientSecret)



Uninstalls your app from a workspace.

### Example
```java
// Import classes:
import invalidPackageName.ApiClient;
import invalidPackageName.ApiException;
import invalidPackageName.Configuration;
import invalidPackageName.auth.*;
import invalidPackageName.models.*;
import slack.AppsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://slack.com/api");
    
    // Configure OAuth2 access token for authorization: slackAuth
    OAuth slackAuth = (OAuth) defaultClient.getAuthentication("slackAuth");
    slackAuth.setAccessToken("YOUR ACCESS TOKEN");

    AppsApi apiInstance = new AppsApi(defaultClient);
    String token = "token_example"; // String | Authentication token. Requires scope: `none`
    String clientId = "clientId_example"; // String | Issued when you created your application.
    String clientSecret = "clientSecret_example"; // String | Issued when you created your application.
    try {
      AppsUninstallSchema result = apiInstance.appsUninstall(token, clientId, clientSecret);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppsApi#appsUninstall");
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
| **clientId** | **String**| Issued when you created your application. | [optional] |
| **clientSecret** | **String**| Issued when you created your application. | [optional] |

### Return type

[**AppsUninstallSchema**](AppsUninstallSchema.md)

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

