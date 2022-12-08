# AdminTeamsSettingsApi

All URIs are relative to *https://slack.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adminTeamsSettingsInfo**](AdminTeamsSettingsApi.md#adminTeamsSettingsInfo) | **GET** /admin.teams.settings.info | 
[**adminTeamsSettingsSetDefaultChannels**](AdminTeamsSettingsApi.md#adminTeamsSettingsSetDefaultChannels) | **POST** /admin.teams.settings.setDefaultChannels | 
[**adminTeamsSettingsSetDescription**](AdminTeamsSettingsApi.md#adminTeamsSettingsSetDescription) | **POST** /admin.teams.settings.setDescription | 
[**adminTeamsSettingsSetDiscoverability**](AdminTeamsSettingsApi.md#adminTeamsSettingsSetDiscoverability) | **POST** /admin.teams.settings.setDiscoverability | 
[**adminTeamsSettingsSetIcon**](AdminTeamsSettingsApi.md#adminTeamsSettingsSetIcon) | **POST** /admin.teams.settings.setIcon | 
[**adminTeamsSettingsSetName**](AdminTeamsSettingsApi.md#adminTeamsSettingsSetName) | **POST** /admin.teams.settings.setName | 


<a name="adminTeamsSettingsInfo"></a>
# **adminTeamsSettingsInfo**
> DefaultSuccessTemplate adminTeamsSettingsInfo(token, teamId)



Fetch information about settings in a workspace

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = AdminTeamsSettingsApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `admin.teams:read`
val teamId : kotlin.String = teamId_example // kotlin.String | 
try {
    val result : DefaultSuccessTemplate = apiInstance.adminTeamsSettingsInfo(token, teamId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdminTeamsSettingsApi#adminTeamsSettingsInfo")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdminTeamsSettingsApi#adminTeamsSettingsInfo")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;admin.teams:read&#x60; |
 **teamId** | **kotlin.String**|  |

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="adminTeamsSettingsSetDefaultChannels"></a>
# **adminTeamsSettingsSetDefaultChannels**
> DefaultSuccessTemplate adminTeamsSettingsSetDefaultChannels(channelIds, teamId, token)



Set the default channels of a workspace.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = AdminTeamsSettingsApi()
val channelIds : kotlin.String = channelIds_example // kotlin.String | An array of channel IDs.
val teamId : kotlin.String = teamId_example // kotlin.String | ID for the workspace to set the default channel for.
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `admin.teams:write`
try {
    val result : DefaultSuccessTemplate = apiInstance.adminTeamsSettingsSetDefaultChannels(channelIds, teamId, token)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdminTeamsSettingsApi#adminTeamsSettingsSetDefaultChannels")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdminTeamsSettingsApi#adminTeamsSettingsSetDefaultChannels")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelIds** | **kotlin.String**| An array of channel IDs. |
 **teamId** | **kotlin.String**| ID for the workspace to set the default channel for. |
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;admin.teams:write&#x60; |

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="adminTeamsSettingsSetDescription"></a>
# **adminTeamsSettingsSetDescription**
> DefaultSuccessTemplate adminTeamsSettingsSetDescription(token, description, teamId)



Set the description of a given workspace.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = AdminTeamsSettingsApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `admin.teams:write`
val description : kotlin.String = description_example // kotlin.String | The new description for the workspace.
val teamId : kotlin.String = teamId_example // kotlin.String | ID for the workspace to set the description for.
try {
    val result : DefaultSuccessTemplate = apiInstance.adminTeamsSettingsSetDescription(token, description, teamId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdminTeamsSettingsApi#adminTeamsSettingsSetDescription")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdminTeamsSettingsApi#adminTeamsSettingsSetDescription")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;admin.teams:write&#x60; |
 **description** | **kotlin.String**| The new description for the workspace. |
 **teamId** | **kotlin.String**| ID for the workspace to set the description for. |

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="adminTeamsSettingsSetDiscoverability"></a>
# **adminTeamsSettingsSetDiscoverability**
> DefaultSuccessTemplate adminTeamsSettingsSetDiscoverability(token, discoverability, teamId)



An API method that allows admins to set the discoverability of a given workspace

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = AdminTeamsSettingsApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `admin.teams:write`
val discoverability : kotlin.String = discoverability_example // kotlin.String | This workspace's discovery setting. It must be set to one of `open`, `invite_only`, `closed`, or `unlisted`.
val teamId : kotlin.String = teamId_example // kotlin.String | The ID of the workspace to set discoverability on.
try {
    val result : DefaultSuccessTemplate = apiInstance.adminTeamsSettingsSetDiscoverability(token, discoverability, teamId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdminTeamsSettingsApi#adminTeamsSettingsSetDiscoverability")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdminTeamsSettingsApi#adminTeamsSettingsSetDiscoverability")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;admin.teams:write&#x60; |
 **discoverability** | **kotlin.String**| This workspace&#39;s discovery setting. It must be set to one of &#x60;open&#x60;, &#x60;invite_only&#x60;, &#x60;closed&#x60;, or &#x60;unlisted&#x60;. |
 **teamId** | **kotlin.String**| The ID of the workspace to set discoverability on. |

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="adminTeamsSettingsSetIcon"></a>
# **adminTeamsSettingsSetIcon**
> DefaultSuccessTemplate adminTeamsSettingsSetIcon(imageUrl, teamId, token)



Sets the icon of a workspace.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = AdminTeamsSettingsApi()
val imageUrl : kotlin.String = imageUrl_example // kotlin.String | Image URL for the icon
val teamId : kotlin.String = teamId_example // kotlin.String | ID for the workspace to set the icon for.
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `admin.teams:write`
try {
    val result : DefaultSuccessTemplate = apiInstance.adminTeamsSettingsSetIcon(imageUrl, teamId, token)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdminTeamsSettingsApi#adminTeamsSettingsSetIcon")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdminTeamsSettingsApi#adminTeamsSettingsSetIcon")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **imageUrl** | **kotlin.String**| Image URL for the icon |
 **teamId** | **kotlin.String**| ID for the workspace to set the icon for. |
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;admin.teams:write&#x60; |

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="adminTeamsSettingsSetName"></a>
# **adminTeamsSettingsSetName**
> DefaultSuccessTemplate adminTeamsSettingsSetName(token, name, teamId)



Set the name of a given workspace.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = AdminTeamsSettingsApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `admin.teams:write`
val name : kotlin.String = name_example // kotlin.String | The new name of the workspace.
val teamId : kotlin.String = teamId_example // kotlin.String | ID for the workspace to set the name for.
try {
    val result : DefaultSuccessTemplate = apiInstance.adminTeamsSettingsSetName(token, name, teamId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdminTeamsSettingsApi#adminTeamsSettingsSetName")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdminTeamsSettingsApi#adminTeamsSettingsSetName")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;admin.teams:write&#x60; |
 **name** | **kotlin.String**| The new name of the workspace. |
 **teamId** | **kotlin.String**| ID for the workspace to set the name for. |

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

