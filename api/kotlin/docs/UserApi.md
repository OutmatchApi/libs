# UserApi

All URIs are relative to *https://api.outmatchapi.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createUser**](UserApi.md#createUser) | **POST** /user | Create user
[**updateUser**](UserApi.md#updateUser) | **PUT** /user | Update user


<a name="createUser"></a>
# **createUser**
> User createUser(createUserRequest)

Create user

This can only be done by the logged in user.

### Example
```kotlin
// Import classes:
//import api.infrastructure.*
//import com.outmatchapi.api.*

val apiInstance = UserApi()
val createUserRequest : CreateUserRequest =  // CreateUserRequest | 
try {
    val result : User = apiInstance.createUser(createUserRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserApi#createUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserApi#createUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createUserRequest** | [**CreateUserRequest**](CreateUserRequest.md)|  | [optional]

### Return type

[**User**](User.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateUser"></a>
# **updateUser**
> updateUser(updateUserRequest)

Update user

This can only be done by the logged in user.

### Example
```kotlin
// Import classes:
//import api.infrastructure.*
//import com.outmatchapi.api.*

val apiInstance = UserApi()
val updateUserRequest : UpdateUserRequest =  // UpdateUserRequest | 
try {
    apiInstance.updateUser(updateUserRequest)
} catch (e: ClientException) {
    println("4xx response calling UserApi#updateUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserApi#updateUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **updateUserRequest** | [**UpdateUserRequest**](UpdateUserRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

