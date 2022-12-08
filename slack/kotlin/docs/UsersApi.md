# UsersApi

All URIs are relative to *https://slack.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**usersConversations**](UsersApi.md#usersConversations) | **GET** /users.conversations | 
[**usersDeletePhoto**](UsersApi.md#usersDeletePhoto) | **POST** /users.deletePhoto | 
[**usersGetPresence**](UsersApi.md#usersGetPresence) | **GET** /users.getPresence | 
[**usersIdentity**](UsersApi.md#usersIdentity) | **GET** /users.identity | 
[**usersInfo**](UsersApi.md#usersInfo) | **GET** /users.info | 
[**usersList**](UsersApi.md#usersList) | **GET** /users.list | 
[**usersLookupByEmail**](UsersApi.md#usersLookupByEmail) | **GET** /users.lookupByEmail | 
[**usersProfileGet**](UsersApi.md#usersProfileGet) | **GET** /users.profile.get | 
[**usersProfileSet**](UsersApi.md#usersProfileSet) | **POST** /users.profile.set | 
[**usersSetActive**](UsersApi.md#usersSetActive) | **POST** /users.setActive | 
[**usersSetPhoto**](UsersApi.md#usersSetPhoto) | **POST** /users.setPhoto | 
[**usersSetPresence**](UsersApi.md#usersSetPresence) | **POST** /users.setPresence | 


<a name="usersConversations"></a>
# **usersConversations**
> UsersConversationsSuccessSchema usersConversations(token, user, types, excludeArchived, limit, cursor)



List conversations the calling user may access.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = UsersApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `conversations:read`
val user : kotlin.String = user_example // kotlin.String | Browse conversations by a specific user ID's membership. Non-public channels are restricted to those where the calling user shares membership.
val types : kotlin.String = types_example // kotlin.String | Mix and match channel types by providing a comma-separated list of any combination of `public_channel`, `private_channel`, `mpim`, `im`
val excludeArchived : kotlin.Boolean = true // kotlin.Boolean | Set to `true` to exclude archived channels from the list
val limit : kotlin.Int = 56 // kotlin.Int | The maximum number of items to return. Fewer than the requested number of items may be returned, even if the end of the list hasn't been reached. Must be an integer no larger than 1000.
val cursor : kotlin.String = cursor_example // kotlin.String | Paginate through collections of data by setting the `cursor` parameter to a `next_cursor` attribute returned by a previous request's `response_metadata`. Default value fetches the first \"page\" of the collection. See [pagination](/docs/pagination) for more detail.
try {
    val result : UsersConversationsSuccessSchema = apiInstance.usersConversations(token, user, types, excludeArchived, limit, cursor)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#usersConversations")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#usersConversations")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;conversations:read&#x60; | [optional]
 **user** | **kotlin.String**| Browse conversations by a specific user ID&#39;s membership. Non-public channels are restricted to those where the calling user shares membership. | [optional]
 **types** | **kotlin.String**| Mix and match channel types by providing a comma-separated list of any combination of &#x60;public_channel&#x60;, &#x60;private_channel&#x60;, &#x60;mpim&#x60;, &#x60;im&#x60; | [optional]
 **excludeArchived** | **kotlin.Boolean**| Set to &#x60;true&#x60; to exclude archived channels from the list | [optional]
 **limit** | **kotlin.Int**| The maximum number of items to return. Fewer than the requested number of items may be returned, even if the end of the list hasn&#39;t been reached. Must be an integer no larger than 1000. | [optional]
 **cursor** | **kotlin.String**| Paginate through collections of data by setting the &#x60;cursor&#x60; parameter to a &#x60;next_cursor&#x60; attribute returned by a previous request&#39;s &#x60;response_metadata&#x60;. Default value fetches the first \&quot;page\&quot; of the collection. See [pagination](/docs/pagination) for more detail. | [optional]

### Return type

[**UsersConversationsSuccessSchema**](UsersConversationsSuccessSchema.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="usersDeletePhoto"></a>
# **usersDeletePhoto**
> UsersDeletePhotoSchema usersDeletePhoto(token)



Delete the user profile photo

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = UsersApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `users.profile:write`
try {
    val result : UsersDeletePhotoSchema = apiInstance.usersDeletePhoto(token)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#usersDeletePhoto")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#usersDeletePhoto")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;users.profile:write&#x60; |

### Return type

[**UsersDeletePhotoSchema**](UsersDeletePhotoSchema.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="usersGetPresence"></a>
# **usersGetPresence**
> APIMethodUsersGetPresence usersGetPresence(token, user)



Gets user presence information.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = UsersApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `users:read`
val user : kotlin.String = user_example // kotlin.String | User to get presence info on. Defaults to the authed user.
try {
    val result : APIMethodUsersGetPresence = apiInstance.usersGetPresence(token, user)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#usersGetPresence")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#usersGetPresence")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;users:read&#x60; |
 **user** | **kotlin.String**| User to get presence info on. Defaults to the authed user. | [optional]

### Return type

[**APIMethodUsersGetPresence**](APIMethodUsersGetPresence.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="usersIdentity"></a>
# **usersIdentity**
> kotlin.collections.List&lt;UsersIdentitySchemaInner&gt; usersIdentity(token)



Get a user&#39;s identity.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = UsersApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `identity.basic`
try {
    val result : kotlin.collections.List<UsersIdentitySchemaInner> = apiInstance.usersIdentity(token)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#usersIdentity")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#usersIdentity")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;identity.basic&#x60; | [optional]

### Return type

[**kotlin.collections.List&lt;UsersIdentitySchemaInner&gt;**](UsersIdentitySchemaInner.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="usersInfo"></a>
# **usersInfo**
> UsersInfoSuccessSchema usersInfo(token, includeLocale, user)



Gets information about a user.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = UsersApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `users:read`
val includeLocale : kotlin.Boolean = true // kotlin.Boolean | Set this to `true` to receive the locale for this user. Defaults to `false`
val user : kotlin.String = user_example // kotlin.String | User to get info on
try {
    val result : UsersInfoSuccessSchema = apiInstance.usersInfo(token, includeLocale, user)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#usersInfo")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#usersInfo")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;users:read&#x60; |
 **includeLocale** | **kotlin.Boolean**| Set this to &#x60;true&#x60; to receive the locale for this user. Defaults to &#x60;false&#x60; | [optional]
 **user** | **kotlin.String**| User to get info on | [optional]

### Return type

[**UsersInfoSuccessSchema**](UsersInfoSuccessSchema.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="usersList"></a>
# **usersList**
> UsersListSchema usersList(token, limit, cursor, includeLocale)



Lists all users in a Slack team.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = UsersApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `users:read`
val limit : kotlin.Int = 56 // kotlin.Int | The maximum number of items to return. Fewer than the requested number of items may be returned, even if the end of the users list hasn't been reached. Providing no `limit` value will result in Slack attempting to deliver you the entire result set. If the collection is too large you may experience `limit_required` or HTTP 500 errors.
val cursor : kotlin.String = cursor_example // kotlin.String | Paginate through collections of data by setting the `cursor` parameter to a `next_cursor` attribute returned by a previous request's `response_metadata`. Default value fetches the first \"page\" of the collection. See [pagination](/docs/pagination) for more detail.
val includeLocale : kotlin.Boolean = true // kotlin.Boolean | Set this to `true` to receive the locale for users. Defaults to `false`
try {
    val result : UsersListSchema = apiInstance.usersList(token, limit, cursor, includeLocale)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#usersList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#usersList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;users:read&#x60; | [optional]
 **limit** | **kotlin.Int**| The maximum number of items to return. Fewer than the requested number of items may be returned, even if the end of the users list hasn&#39;t been reached. Providing no &#x60;limit&#x60; value will result in Slack attempting to deliver you the entire result set. If the collection is too large you may experience &#x60;limit_required&#x60; or HTTP 500 errors. | [optional]
 **cursor** | **kotlin.String**| Paginate through collections of data by setting the &#x60;cursor&#x60; parameter to a &#x60;next_cursor&#x60; attribute returned by a previous request&#39;s &#x60;response_metadata&#x60;. Default value fetches the first \&quot;page\&quot; of the collection. See [pagination](/docs/pagination) for more detail. | [optional]
 **includeLocale** | **kotlin.Boolean**| Set this to &#x60;true&#x60; to receive the locale for users. Defaults to &#x60;false&#x60; | [optional]

### Return type

[**UsersListSchema**](UsersListSchema.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="usersLookupByEmail"></a>
# **usersLookupByEmail**
> UsersLookupByEmailSuccessSchema usersLookupByEmail(token, email)



Find a user with an email address.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = UsersApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `users:read.email`
val email : kotlin.String = email_example // kotlin.String | An email address belonging to a user in the workspace
try {
    val result : UsersLookupByEmailSuccessSchema = apiInstance.usersLookupByEmail(token, email)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#usersLookupByEmail")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#usersLookupByEmail")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;users:read.email&#x60; |
 **email** | **kotlin.String**| An email address belonging to a user in the workspace |

### Return type

[**UsersLookupByEmailSuccessSchema**](UsersLookupByEmailSuccessSchema.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="usersProfileGet"></a>
# **usersProfileGet**
> UsersProfileGetSchema usersProfileGet(token, includeLabels, user)



Retrieves a user&#39;s profile information.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = UsersApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `users.profile:read`
val includeLabels : kotlin.Boolean = true // kotlin.Boolean | Include labels for each ID in custom profile fields
val user : kotlin.String = user_example // kotlin.String | User to retrieve profile info for
try {
    val result : UsersProfileGetSchema = apiInstance.usersProfileGet(token, includeLabels, user)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#usersProfileGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#usersProfileGet")
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

val apiInstance = UsersApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `users.profile:write`
val name : kotlin.String = name_example // kotlin.String | Name of a single key to set. Usable only if `profile` is not passed.
val profile : kotlin.String = profile_example // kotlin.String | Collection of key:value pairs presented as a URL-encoded JSON hash. At most 50 fields may be set. Each field name is limited to 255 characters.
val user : kotlin.String = user_example // kotlin.String | ID of user to change. This argument may only be specified by team admins on paid teams.
val `value` : kotlin.String = `value`_example // kotlin.String | Value to set a single key to. Usable only if `profile` is not passed.
try {
    val result : UsersProfileSetSchema = apiInstance.usersProfileSet(token, name, profile, user, `value`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#usersProfileSet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#usersProfileSet")
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

<a name="usersSetActive"></a>
# **usersSetActive**
> UsersSetActiveSchema usersSetActive(token)



Marked a user as active. Deprecated and non-functional.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = UsersApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `users:write`
try {
    val result : UsersSetActiveSchema = apiInstance.usersSetActive(token)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#usersSetActive")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#usersSetActive")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;users:write&#x60; |

### Return type

[**UsersSetActiveSchema**](UsersSetActiveSchema.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="usersSetPhoto"></a>
# **usersSetPhoto**
> UsersSetPhotoSchema usersSetPhoto(token, cropW, cropX, cropY, image)



Set the user profile photo

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = UsersApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `users.profile:write`
val cropW : kotlin.String = cropW_example // kotlin.String | Width/height of crop box (always square)
val cropX : kotlin.String = cropX_example // kotlin.String | X coordinate of top-left corner of crop box
val cropY : kotlin.String = cropY_example // kotlin.String | Y coordinate of top-left corner of crop box
val image : kotlin.String = image_example // kotlin.String | File contents via `multipart/form-data`.
try {
    val result : UsersSetPhotoSchema = apiInstance.usersSetPhoto(token, cropW, cropX, cropY, image)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#usersSetPhoto")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#usersSetPhoto")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;users.profile:write&#x60; |
 **cropW** | **kotlin.String**| Width/height of crop box (always square) | [optional]
 **cropX** | **kotlin.String**| X coordinate of top-left corner of crop box | [optional]
 **cropY** | **kotlin.String**| Y coordinate of top-left corner of crop box | [optional]
 **image** | **kotlin.String**| File contents via &#x60;multipart/form-data&#x60;. | [optional]

### Return type

[**UsersSetPhotoSchema**](UsersSetPhotoSchema.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="usersSetPresence"></a>
# **usersSetPresence**
> UsersSetPresenceSchema usersSetPresence(token, presence)



Manually sets user presence.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = UsersApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `users:write`
val presence : kotlin.String = presence_example // kotlin.String | Either `auto` or `away`
try {
    val result : UsersSetPresenceSchema = apiInstance.usersSetPresence(token, presence)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#usersSetPresence")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#usersSetPresence")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;users:write&#x60; |
 **presence** | **kotlin.String**| Either &#x60;auto&#x60; or &#x60;away&#x60; |

### Return type

[**UsersSetPresenceSchema**](UsersSetPresenceSchema.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

