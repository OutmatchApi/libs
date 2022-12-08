# AuthApi

All URIs are relative to *https://slack.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**authRevoke**](AuthApi.md#authRevoke) | **GET** /auth.revoke | 
[**authTest**](AuthApi.md#authTest) | **GET** /auth.test | 


<a name="authRevoke"></a>
# **authRevoke**
> AuthRevokeSchema authRevoke(token, test)



Revokes a token.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = AuthApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `none`
val test : kotlin.Boolean = true // kotlin.Boolean | Setting this parameter to `1` triggers a _testing mode_ where the specified token will not actually be revoked.
try {
    val result : AuthRevokeSchema = apiInstance.authRevoke(token, test)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AuthApi#authRevoke")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AuthApi#authRevoke")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;none&#x60; |
 **test** | **kotlin.Boolean**| Setting this parameter to &#x60;1&#x60; triggers a _testing mode_ where the specified token will not actually be revoked. | [optional]

### Return type

[**AuthRevokeSchema**](AuthRevokeSchema.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="authTest"></a>
# **authTest**
> AuthTestSuccessSchema authTest(token)



Checks authentication &amp; identity.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = AuthApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `none`
try {
    val result : AuthTestSuccessSchema = apiInstance.authTest(token)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AuthApi#authTest")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AuthApi#authTest")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;none&#x60; |

### Return type

[**AuthTestSuccessSchema**](AuthTestSuccessSchema.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

