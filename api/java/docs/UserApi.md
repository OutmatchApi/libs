# UserApi

All URIs are relative to *https://api.outmatchapi.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createUser**](UserApi.md#createUser) | **POST** /user | Create user |
| [**updateUser**](UserApi.md#updateUser) | **PUT** /user | Update user |


<a name="createUser"></a>
# **createUser**
> User createUser(createUserRequest)

Create user

This can only be done by the logged in user.

### Example
```java
// Import classes:
import invalidPackageName.ApiClient;
import invalidPackageName.ApiException;
import invalidPackageName.Configuration;
import invalidPackageName.auth.*;
import invalidPackageName.models.*;
import api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.outmatchapi.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    UserApi apiInstance = new UserApi(defaultClient);
    CreateUserRequest createUserRequest = new CreateUserRequest(); // CreateUserRequest | 
    try {
      User result = apiInstance.createUser(createUserRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#createUser");
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
| **createUserRequest** | [**CreateUserRequest**](CreateUserRequest.md)|  | [optional] |

### Return type

[**User**](User.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | user created |  -  |
| **4XX** | Client Error |  -  |

<a name="updateUser"></a>
# **updateUser**
> updateUser(updateUserRequest)

Update user

This can only be done by the logged in user.

### Example
```java
// Import classes:
import invalidPackageName.ApiClient;
import invalidPackageName.ApiException;
import invalidPackageName.Configuration;
import invalidPackageName.auth.*;
import invalidPackageName.models.*;
import api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.outmatchapi.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    UserApi apiInstance = new UserApi(defaultClient);
    UpdateUserRequest updateUserRequest = new UpdateUserRequest(); // UpdateUserRequest | 
    try {
      apiInstance.updateUser(updateUserRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#updateUser");
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
| **updateUserRequest** | [**UpdateUserRequest**](UpdateUserRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | successful operation |  -  |

