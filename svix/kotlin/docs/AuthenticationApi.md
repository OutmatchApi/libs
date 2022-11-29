# AuthenticationApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**expireAllApiV1AuthAppAppIdExpireAllPost**](AuthenticationApi.md#expireAllApiV1AuthAppAppIdExpireAllPost) | **POST** /api/v1/auth/app/{app_id}/expire-all/ | Expire All
[**getDashboardAccessApiV1AuthDashboardAccessAppIdPost**](AuthenticationApi.md#getDashboardAccessApiV1AuthDashboardAccessAppIdPost) | **POST** /api/v1/auth/dashboard-access/{app_id}/ | Get Consumer App Portal Access
[**logoutApiV1AuthLogoutPost**](AuthenticationApi.md#logoutApiV1AuthLogoutPost) | **POST** /api/v1/auth/logout/ | Logout


<a name="expireAllApiV1AuthAppAppIdExpireAllPost"></a>
# **expireAllApiV1AuthAppAppIdExpireAllPost**
> expireAllApiV1AuthAppAppIdExpireAllPost(appId, applicationTokenExpireIn, idempotencyKey)

Expire All

Expire all of the tokens associated with a specific Application

### Example
```kotlin
// Import classes:
//import svix.infrastructure.*
//import com.outmatchapi.svix.*

val apiInstance = AuthenticationApi()
val appId : kotlin.String = app_1srOrx2ZWZBpBUvZwXKQmoEYga2 // kotlin.String | 
val applicationTokenExpireIn : ApplicationTokenExpireIn =  // ApplicationTokenExpireIn | 
val idempotencyKey : kotlin.String = idempotencyKey_example // kotlin.String | The request's idempotency key
try {
    apiInstance.expireAllApiV1AuthAppAppIdExpireAllPost(appId, applicationTokenExpireIn, idempotencyKey)
} catch (e: ClientException) {
    println("4xx response calling AuthenticationApi#expireAllApiV1AuthAppAppIdExpireAllPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AuthenticationApi#expireAllApiV1AuthAppAppIdExpireAllPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **kotlin.String**|  |
 **applicationTokenExpireIn** | [**ApplicationTokenExpireIn**](ApplicationTokenExpireIn.md)|  |
 **idempotencyKey** | **kotlin.String**| The request&#39;s idempotency key | [optional]

### Return type

null (empty response body)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDashboardAccessApiV1AuthDashboardAccessAppIdPost"></a>
# **getDashboardAccessApiV1AuthDashboardAccessAppIdPost**
> DashboardAccessOut getDashboardAccessApiV1AuthDashboardAccessAppIdPost(appId, idempotencyKey)

Get Consumer App Portal Access

Use this function to get magic links (and authentication codes) for connecting your users to the Consumer Application Portal.

### Example
```kotlin
// Import classes:
//import svix.infrastructure.*
//import com.outmatchapi.svix.*

val apiInstance = AuthenticationApi()
val appId : kotlin.String = app_1srOrx2ZWZBpBUvZwXKQmoEYga2 // kotlin.String | 
val idempotencyKey : kotlin.String = idempotencyKey_example // kotlin.String | The request's idempotency key
try {
    val result : DashboardAccessOut = apiInstance.getDashboardAccessApiV1AuthDashboardAccessAppIdPost(appId, idempotencyKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AuthenticationApi#getDashboardAccessApiV1AuthDashboardAccessAppIdPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AuthenticationApi#getDashboardAccessApiV1AuthDashboardAccessAppIdPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **kotlin.String**|  |
 **idempotencyKey** | **kotlin.String**| The request&#39;s idempotency key | [optional]

### Return type

[**DashboardAccessOut**](DashboardAccessOut.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="logoutApiV1AuthLogoutPost"></a>
# **logoutApiV1AuthLogoutPost**
> logoutApiV1AuthLogoutPost(idempotencyKey)

Logout

Logout an app token.  Trying to log out other tokens will fail.

### Example
```kotlin
// Import classes:
//import svix.infrastructure.*
//import com.outmatchapi.svix.*

val apiInstance = AuthenticationApi()
val idempotencyKey : kotlin.String = idempotencyKey_example // kotlin.String | The request's idempotency key
try {
    apiInstance.logoutApiV1AuthLogoutPost(idempotencyKey)
} catch (e: ClientException) {
    println("4xx response calling AuthenticationApi#logoutApiV1AuthLogoutPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AuthenticationApi#logoutApiV1AuthLogoutPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idempotencyKey** | **kotlin.String**| The request&#39;s idempotency key | [optional]

### Return type

null (empty response body)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

