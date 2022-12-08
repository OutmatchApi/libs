# UsersProfileApi

All URIs are relative to *https://slack.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**usersProfileGet**](UsersProfileApi.md#usersProfileGet) | **GET** /users.profile.get | 
[**usersProfileSet**](UsersProfileApi.md#usersProfileSet) | **POST** /users.profile.set | 


<a name="usersProfileGet"></a>
# **usersProfileGet**
> UsersProfileGetSchema usersProfileGet(token, includeLabels, user)



Retrieves a user&#39;s profile information.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = UsersProfileApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `users.profile:read`
val includeLabels : kotlin.Boolean = true // kotlin.Boolean | Include labels for each ID in custom profile fields
val user : kotlin.String = user_example // kotlin.String | User to retrieve profile info for
try {
    val result : UsersProfileGetSchema = apiInstance.usersProfileGet(token, includeLabels, user)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersProfileApi#usersProfileGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersProfileApi#usersProfileGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;users.profile:read&#x60; |
 **includeLabels** | **kotlin.Boolean**| Include labels for each ID in custom profile fields | [optional]
 **user** | **kotlin.String**| User to retrieve profile info for | [optional]

### Return type

[**UsersProfileGetSchema**](UsersProfileGetSchema.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="usersProfileSet"></a>
# **usersProfileSet**
> UsersProfileSetSchema usersProfileSet(token, name, profile, user, `value`)



Set the profile information for a user.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = UsersProfileApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `users.profile:write`
val name : kotlin.String = name_example // kotlin.String | Name of a single key to set. Usable only if `profile` is not passed.
val profile : kotlin.String = profile_example // kotlin.String | Collection of key:value pairs presented as a URL-encoded JSON hash. At most 50 fields may be set. Each field name is limited to 255 characters.
val user : kotlin.String = user_example // kotlin.String | ID of user to change. This argument may only be specified by team admins on paid teams.
val `value` : kotlin.String = `value`_example // kotlin.String | Value to set a single key to. Usable only if `profile` is not passed.
try {
    val result : UsersProfileSetSchema = apiInstance.usersProfileSet(token, name, profile, user, `value`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersProfileApi#usersProfileSet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersProfileApi#usersProfileSet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;users.profile:write&#x60; |
 **name** | **kotlin.String**| Name of a single key to set. Usable only if &#x60;profile&#x60; is not passed. | [optional]
 **profile** | **kotlin.String**| Collection of key:value pairs presented as a URL-encoded JSON hash. At most 50 fields may be set. Each field name is limited to 255 characters. | [optional]
 **user** | **kotlin.String**| ID of user to change. This argument may only be specified by team admins on paid teams. | [optional]
 **&#x60;value&#x60;** | **kotlin.String**| Value to set a single key to. Usable only if &#x60;profile&#x60; is not passed. | [optional]

### Return type

[**UsersProfileSetSchema**](UsersProfileSetSchema.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

