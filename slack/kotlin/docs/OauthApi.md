# OauthApi

All URIs are relative to *https://slack.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**oauthAccess**](OauthApi.md#oauthAccess) | **GET** /oauth.access | 
[**oauthToken**](OauthApi.md#oauthToken) | **GET** /oauth.token | 
[**oauthV2Access**](OauthApi.md#oauthV2Access) | **GET** /oauth.v2.access | 


<a name="oauthAccess"></a>
# **oauthAccess**
> DefaultSuccessTemplate oauthAccess(clientId, clientSecret, code, redirectUri, singleChannel)



Exchanges a temporary OAuth verifier code for an access token.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = OauthApi()
val clientId : kotlin.String = clientId_example // kotlin.String | Issued when you created your application.
val clientSecret : kotlin.String = clientSecret_example // kotlin.String | Issued when you created your application.
val code : kotlin.String = code_example // kotlin.String | The `code` param returned via the OAuth callback.
val redirectUri : kotlin.String = redirectUri_example // kotlin.String | This must match the originally submitted URI (if one was sent).
val singleChannel : kotlin.Boolean = true // kotlin.Boolean | Request the user to add your app only to a single channel. Only valid with a [legacy workspace app](https://api.slack.com/legacy-workspace-apps).
try {
    val result : DefaultSuccessTemplate = apiInstance.oauthAccess(clientId, clientSecret, code, redirectUri, singleChannel)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OauthApi#oauthAccess")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OauthApi#oauthAccess")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **kotlin.String**| Issued when you created your application. | [optional]
 **clientSecret** | **kotlin.String**| Issued when you created your application. | [optional]
 **code** | **kotlin.String**| The &#x60;code&#x60; param returned via the OAuth callback. | [optional]
 **redirectUri** | **kotlin.String**| This must match the originally submitted URI (if one was sent). | [optional]
 **singleChannel** | **kotlin.Boolean**| Request the user to add your app only to a single channel. Only valid with a [legacy workspace app](https://api.slack.com/legacy-workspace-apps). | [optional]

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="oauthToken"></a>
# **oauthToken**
> DefaultSuccessTemplate oauthToken(clientId, clientSecret, code, redirectUri, singleChannel)



Exchanges a temporary OAuth verifier code for a workspace token.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = OauthApi()
val clientId : kotlin.String = clientId_example // kotlin.String | Issued when you created your application.
val clientSecret : kotlin.String = clientSecret_example // kotlin.String | Issued when you created your application.
val code : kotlin.String = code_example // kotlin.String | The `code` param returned via the OAuth callback.
val redirectUri : kotlin.String = redirectUri_example // kotlin.String | This must match the originally submitted URI (if one was sent).
val singleChannel : kotlin.Boolean = true // kotlin.Boolean | Request the user to add your app only to a single channel.
try {
    val result : DefaultSuccessTemplate = apiInstance.oauthToken(clientId, clientSecret, code, redirectUri, singleChannel)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OauthApi#oauthToken")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OauthApi#oauthToken")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **kotlin.String**| Issued when you created your application. | [optional]
 **clientSecret** | **kotlin.String**| Issued when you created your application. | [optional]
 **code** | **kotlin.String**| The &#x60;code&#x60; param returned via the OAuth callback. | [optional]
 **redirectUri** | **kotlin.String**| This must match the originally submitted URI (if one was sent). | [optional]
 **singleChannel** | **kotlin.Boolean**| Request the user to add your app only to a single channel. | [optional]

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="oauthV2Access"></a>
# **oauthV2Access**
> DefaultSuccessTemplate oauthV2Access(code, clientId, clientSecret, redirectUri)



Exchanges a temporary OAuth verifier code for an access token.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = OauthApi()
val code : kotlin.String = code_example // kotlin.String | The `code` param returned via the OAuth callback.
val clientId : kotlin.String = clientId_example // kotlin.String | Issued when you created your application.
val clientSecret : kotlin.String = clientSecret_example // kotlin.String | Issued when you created your application.
val redirectUri : kotlin.String = redirectUri_example // kotlin.String | This must match the originally submitted URI (if one was sent).
try {
    val result : DefaultSuccessTemplate = apiInstance.oauthV2Access(code, clientId, clientSecret, redirectUri)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OauthApi#oauthV2Access")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OauthApi#oauthV2Access")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **kotlin.String**| The &#x60;code&#x60; param returned via the OAuth callback. |
 **clientId** | **kotlin.String**| Issued when you created your application. | [optional]
 **clientSecret** | **kotlin.String**| Issued when you created your application. | [optional]
 **redirectUri** | **kotlin.String**| This must match the originally submitted URI (if one was sent). | [optional]

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

