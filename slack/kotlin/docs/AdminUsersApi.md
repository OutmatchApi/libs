# AdminUsersApi

All URIs are relative to *https://slack.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adminUsersAssign**](AdminUsersApi.md#adminUsersAssign) | **POST** /admin.users.assign | 
[**adminUsersInvite**](AdminUsersApi.md#adminUsersInvite) | **POST** /admin.users.invite | 
[**adminUsersList**](AdminUsersApi.md#adminUsersList) | **GET** /admin.users.list | 
[**adminUsersRemove**](AdminUsersApi.md#adminUsersRemove) | **POST** /admin.users.remove | 
[**adminUsersSetAdmin**](AdminUsersApi.md#adminUsersSetAdmin) | **POST** /admin.users.setAdmin | 
[**adminUsersSetExpiration**](AdminUsersApi.md#adminUsersSetExpiration) | **POST** /admin.users.setExpiration | 
[**adminUsersSetOwner**](AdminUsersApi.md#adminUsersSetOwner) | **POST** /admin.users.setOwner | 
[**adminUsersSetRegular**](AdminUsersApi.md#adminUsersSetRegular) | **POST** /admin.users.setRegular | 


<a name="adminUsersAssign"></a>
# **adminUsersAssign**
> DefaultSuccessTemplate adminUsersAssign(token, teamId, userId, channelIds, isRestricted, isUltraRestricted)



Add an Enterprise user to a workspace.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = AdminUsersApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `admin.users:write`
val teamId : kotlin.String = teamId_example // kotlin.String | The ID (`T1234`) of the workspace.
val userId : kotlin.String = userId_example // kotlin.String | The ID of the user to add to the workspace.
val channelIds : kotlin.String = channelIds_example // kotlin.String | Comma separated values of channel IDs to add user in the new workspace.
val isRestricted : kotlin.Boolean = true // kotlin.Boolean | True if user should be added to the workspace as a guest.
val isUltraRestricted : kotlin.Boolean = true // kotlin.Boolean | True if user should be added to the workspace as a single-channel guest.
try {
    val result : DefaultSuccessTemplate = apiInstance.adminUsersAssign(token, teamId, userId, channelIds, isRestricted, isUltraRestricted)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdminUsersApi#adminUsersAssign")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdminUsersApi#adminUsersAssign")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;admin.users:write&#x60; |
 **teamId** | **kotlin.String**| The ID (&#x60;T1234&#x60;) of the workspace. |
 **userId** | **kotlin.String**| The ID of the user to add to the workspace. |
 **channelIds** | **kotlin.String**| Comma separated values of channel IDs to add user in the new workspace. | [optional]
 **isRestricted** | **kotlin.Boolean**| True if user should be added to the workspace as a guest. | [optional]
 **isUltraRestricted** | **kotlin.Boolean**| True if user should be added to the workspace as a single-channel guest. | [optional]

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="adminUsersInvite"></a>
# **adminUsersInvite**
> DefaultSuccessTemplate adminUsersInvite(token, channelIds, email, teamId, customMessage, guestExpirationTs, isRestricted, isUltraRestricted, realName, resend)



Invite a user to a workspace.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = AdminUsersApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `admin.users:write`
val channelIds : kotlin.String = channelIds_example // kotlin.String | A comma-separated list of `channel_id`s for this user to join. At least one channel is required.
val email : kotlin.String = email_example // kotlin.String | The email address of the person to invite.
val teamId : kotlin.String = teamId_example // kotlin.String | The ID (`T1234`) of the workspace.
val customMessage : kotlin.String = customMessage_example // kotlin.String | An optional message to send to the user in the invite email.
val guestExpirationTs : kotlin.String = guestExpirationTs_example // kotlin.String | Timestamp when guest account should be disabled. Only include this timestamp if you are inviting a guest user and you want their account to expire on a certain date.
val isRestricted : kotlin.Boolean = true // kotlin.Boolean | Is this user a multi-channel guest user? (default: false)
val isUltraRestricted : kotlin.Boolean = true // kotlin.Boolean | Is this user a single channel guest user? (default: false)
val realName : kotlin.String = realName_example // kotlin.String | Full name of the user.
val resend : kotlin.Boolean = true // kotlin.Boolean | Allow this invite to be resent in the future if a user has not signed up yet. (default: false)
try {
    val result : DefaultSuccessTemplate = apiInstance.adminUsersInvite(token, channelIds, email, teamId, customMessage, guestExpirationTs, isRestricted, isUltraRestricted, realName, resend)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdminUsersApi#adminUsersInvite")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdminUsersApi#adminUsersInvite")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;admin.users:write&#x60; |
 **channelIds** | **kotlin.String**| A comma-separated list of &#x60;channel_id&#x60;s for this user to join. At least one channel is required. |
 **email** | **kotlin.String**| The email address of the person to invite. |
 **teamId** | **kotlin.String**| The ID (&#x60;T1234&#x60;) of the workspace. |
 **customMessage** | **kotlin.String**| An optional message to send to the user in the invite email. | [optional]
 **guestExpirationTs** | **kotlin.String**| Timestamp when guest account should be disabled. Only include this timestamp if you are inviting a guest user and you want their account to expire on a certain date. | [optional]
 **isRestricted** | **kotlin.Boolean**| Is this user a multi-channel guest user? (default: false) | [optional]
 **isUltraRestricted** | **kotlin.Boolean**| Is this user a single channel guest user? (default: false) | [optional]
 **realName** | **kotlin.String**| Full name of the user. | [optional]
 **resend** | **kotlin.Boolean**| Allow this invite to be resent in the future if a user has not signed up yet. (default: false) | [optional]

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="adminUsersList"></a>
# **adminUsersList**
> DefaultSuccessTemplate adminUsersList(token, teamId, cursor, limit)



List users on a workspace

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = AdminUsersApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `admin.users:read`
val teamId : kotlin.String = teamId_example // kotlin.String | The ID (`T1234`) of the workspace.
val cursor : kotlin.String = cursor_example // kotlin.String | Set `cursor` to `next_cursor` returned by the previous call to list items in the next page.
val limit : kotlin.Int = 56 // kotlin.Int | Limit for how many users to be retrieved per page
try {
    val result : DefaultSuccessTemplate = apiInstance.adminUsersList(token, teamId, cursor, limit)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdminUsersApi#adminUsersList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdminUsersApi#adminUsersList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;admin.users:read&#x60; |
 **teamId** | **kotlin.String**| The ID (&#x60;T1234&#x60;) of the workspace. |
 **cursor** | **kotlin.String**| Set &#x60;cursor&#x60; to &#x60;next_cursor&#x60; returned by the previous call to list items in the next page. | [optional]
 **limit** | **kotlin.Int**| Limit for how many users to be retrieved per page | [optional]

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="adminUsersRemove"></a>
# **adminUsersRemove**
> DefaultSuccessTemplate adminUsersRemove(token, teamId, userId)



Remove a user from a workspace.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = AdminUsersApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `admin.users:write`
val teamId : kotlin.String = teamId_example // kotlin.String | The ID (`T1234`) of the workspace.
val userId : kotlin.String = userId_example // kotlin.String | The ID of the user to remove.
try {
    val result : DefaultSuccessTemplate = apiInstance.adminUsersRemove(token, teamId, userId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdminUsersApi#adminUsersRemove")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdminUsersApi#adminUsersRemove")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;admin.users:write&#x60; |
 **teamId** | **kotlin.String**| The ID (&#x60;T1234&#x60;) of the workspace. |
 **userId** | **kotlin.String**| The ID of the user to remove. |

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="adminUsersSetAdmin"></a>
# **adminUsersSetAdmin**
> DefaultSuccessTemplate adminUsersSetAdmin(token, teamId, userId)



Set an existing guest, regular user, or owner to be an admin user.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = AdminUsersApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `admin.users:write`
val teamId : kotlin.String = teamId_example // kotlin.String | The ID (`T1234`) of the workspace.
val userId : kotlin.String = userId_example // kotlin.String | The ID of the user to designate as an admin.
try {
    val result : DefaultSuccessTemplate = apiInstance.adminUsersSetAdmin(token, teamId, userId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdminUsersApi#adminUsersSetAdmin")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdminUsersApi#adminUsersSetAdmin")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;admin.users:write&#x60; |
 **teamId** | **kotlin.String**| The ID (&#x60;T1234&#x60;) of the workspace. |
 **userId** | **kotlin.String**| The ID of the user to designate as an admin. |

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="adminUsersSetExpiration"></a>
# **adminUsersSetExpiration**
> DefaultSuccessTemplate adminUsersSetExpiration(token, expirationTs, teamId, userId)



Set an expiration for a guest user

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = AdminUsersApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `admin.users:write`
val expirationTs : kotlin.Int = 56 // kotlin.Int | Timestamp when guest account should be disabled.
val teamId : kotlin.String = teamId_example // kotlin.String | The ID (`T1234`) of the workspace.
val userId : kotlin.String = userId_example // kotlin.String | The ID of the user to set an expiration for.
try {
    val result : DefaultSuccessTemplate = apiInstance.adminUsersSetExpiration(token, expirationTs, teamId, userId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdminUsersApi#adminUsersSetExpiration")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdminUsersApi#adminUsersSetExpiration")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;admin.users:write&#x60; |
 **expirationTs** | **kotlin.Int**| Timestamp when guest account should be disabled. |
 **teamId** | **kotlin.String**| The ID (&#x60;T1234&#x60;) of the workspace. |
 **userId** | **kotlin.String**| The ID of the user to set an expiration for. |

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="adminUsersSetOwner"></a>
# **adminUsersSetOwner**
> DefaultSuccessTemplate adminUsersSetOwner(token, teamId, userId)



Set an existing guest, regular user, or admin user to be a workspace owner.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = AdminUsersApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `admin.users:write`
val teamId : kotlin.String = teamId_example // kotlin.String | The ID (`T1234`) of the workspace.
val userId : kotlin.String = userId_example // kotlin.String | Id of the user to promote to owner.
try {
    val result : DefaultSuccessTemplate = apiInstance.adminUsersSetOwner(token, teamId, userId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdminUsersApi#adminUsersSetOwner")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdminUsersApi#adminUsersSetOwner")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;admin.users:write&#x60; |
 **teamId** | **kotlin.String**| The ID (&#x60;T1234&#x60;) of the workspace. |
 **userId** | **kotlin.String**| Id of the user to promote to owner. |

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="adminUsersSetRegular"></a>
# **adminUsersSetRegular**
> DefaultSuccessTemplate adminUsersSetRegular(token, teamId, userId)



Set an existing guest user, admin user, or owner to be a regular user.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = AdminUsersApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `admin.users:write`
val teamId : kotlin.String = teamId_example // kotlin.String | The ID (`T1234`) of the workspace.
val userId : kotlin.String = userId_example // kotlin.String | The ID of the user to designate as a regular user.
try {
    val result : DefaultSuccessTemplate = apiInstance.adminUsersSetRegular(token, teamId, userId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdminUsersApi#adminUsersSetRegular")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdminUsersApi#adminUsersSetRegular")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;admin.users:write&#x60; |
 **teamId** | **kotlin.String**| The ID (&#x60;T1234&#x60;) of the workspace. |
 **userId** | **kotlin.String**| The ID of the user to designate as a regular user. |

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

