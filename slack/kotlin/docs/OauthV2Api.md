# OauthV2Api

All URIs are relative to *https://slack.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**oauthV2Access**](OauthV2Api.md#oauthV2Access) | **GET** /oauth.v2.access | 


<a name="oauthV2Access"></a>
# **oauthV2Access**
> DefaultSuccessTemplate oauthV2Access(code, clientId, clientSecret, redirectUri)



Exchanges a temporary OAuth verifier code for an access token.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = OauthV2Api()
val code : kotlin.String = code_example // kotlin.String | The `code` param returned via the OAuth callback.
val clientId : kotlin.String = clientId_example // kotlin.String | Issued when you created your application.
val clientSecret : kotlin.String = clientSecret_example // kotlin.String | Issued when you created your application.
val redirectUri : kotlin.String = redirectUri_example // kotlin.String | This must match the originally submitted URI (if one was sent).
try {
    val result : DefaultSuccessTemplate = apiInstance.oauthV2Access(code, clientId, clientSecret, redirectUri)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OauthV2Api#oauthV2Access")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OauthV2Api#oauthV2Access")
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

