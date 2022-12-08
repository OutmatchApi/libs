# AdminEmojiApi

All URIs are relative to *https://slack.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adminEmojiAdd**](AdminEmojiApi.md#adminEmojiAdd) | **POST** /admin.emoji.add | 
[**adminEmojiAddAlias**](AdminEmojiApi.md#adminEmojiAddAlias) | **POST** /admin.emoji.addAlias | 
[**adminEmojiList**](AdminEmojiApi.md#adminEmojiList) | **GET** /admin.emoji.list | 
[**adminEmojiRemove**](AdminEmojiApi.md#adminEmojiRemove) | **POST** /admin.emoji.remove | 
[**adminEmojiRename**](AdminEmojiApi.md#adminEmojiRename) | **POST** /admin.emoji.rename | 


<a name="adminEmojiAdd"></a>
# **adminEmojiAdd**
> DefaultSuccessTemplate adminEmojiAdd(name, token, url)



Add an emoji.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = AdminEmojiApi()
val name : kotlin.String = name_example // kotlin.String | The name of the emoji to be removed. Colons (`:myemoji:`) around the value are not required, although they may be included.
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `admin.teams:write`
val url : kotlin.String = url_example // kotlin.String | The URL of a file to use as an image for the emoji. Square images under 128KB and with transparent backgrounds work best.
try {
    val result : DefaultSuccessTemplate = apiInstance.adminEmojiAdd(name, token, url)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdminEmojiApi#adminEmojiAdd")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdminEmojiApi#adminEmojiAdd")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **kotlin.String**| The name of the emoji to be removed. Colons (&#x60;:myemoji:&#x60;) around the value are not required, although they may be included. |
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;admin.teams:write&#x60; |
 **url** | **kotlin.String**| The URL of a file to use as an image for the emoji. Square images under 128KB and with transparent backgrounds work best. |

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="adminEmojiAddAlias"></a>
# **adminEmojiAddAlias**
> DefaultSuccessTemplate adminEmojiAddAlias(aliasFor, name, token)



Add an emoji alias.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = AdminEmojiApi()
val aliasFor : kotlin.String = aliasFor_example // kotlin.String | The alias of the emoji.
val name : kotlin.String = name_example // kotlin.String | The name of the emoji to be aliased. Colons (`:myemoji:`) around the value are not required, although they may be included.
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `admin.teams:write`
try {
    val result : DefaultSuccessTemplate = apiInstance.adminEmojiAddAlias(aliasFor, name, token)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdminEmojiApi#adminEmojiAddAlias")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdminEmojiApi#adminEmojiAddAlias")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aliasFor** | **kotlin.String**| The alias of the emoji. |
 **name** | **kotlin.String**| The name of the emoji to be aliased. Colons (&#x60;:myemoji:&#x60;) around the value are not required, although they may be included. |
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;admin.teams:write&#x60; |

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="adminEmojiList"></a>
# **adminEmojiList**
> DefaultSuccessTemplate adminEmojiList(token, cursor, limit)



List emoji for an Enterprise Grid organization.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = AdminEmojiApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `admin.teams:read`
val cursor : kotlin.String = cursor_example // kotlin.String | Set `cursor` to `next_cursor` returned by the previous call to list items in the next page
val limit : kotlin.Int = 56 // kotlin.Int | The maximum number of items to return. Must be between 1 - 1000 both inclusive.
try {
    val result : DefaultSuccessTemplate = apiInstance.adminEmojiList(token, cursor, limit)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdminEmojiApi#adminEmojiList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdminEmojiApi#adminEmojiList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;admin.teams:read&#x60; |
 **cursor** | **kotlin.String**| Set &#x60;cursor&#x60; to &#x60;next_cursor&#x60; returned by the previous call to list items in the next page | [optional]
 **limit** | **kotlin.Int**| The maximum number of items to return. Must be between 1 - 1000 both inclusive. | [optional]

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="adminEmojiRemove"></a>
# **adminEmojiRemove**
> DefaultSuccessTemplate adminEmojiRemove(name, token)



Remove an emoji across an Enterprise Grid organization

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = AdminEmojiApi()
val name : kotlin.String = name_example // kotlin.String | The name of the emoji to be removed. Colons (`:myemoji:`) around the value are not required, although they may be included.
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `admin.teams:write`
try {
    val result : DefaultSuccessTemplate = apiInstance.adminEmojiRemove(name, token)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdminEmojiApi#adminEmojiRemove")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdminEmojiApi#adminEmojiRemove")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **kotlin.String**| The name of the emoji to be removed. Colons (&#x60;:myemoji:&#x60;) around the value are not required, although they may be included. |
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;admin.teams:write&#x60; |

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="adminEmojiRename"></a>
# **adminEmojiRename**
> DefaultSuccessTemplate adminEmojiRename(name, newName, token)



Rename an emoji.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = AdminEmojiApi()
val name : kotlin.String = name_example // kotlin.String | The name of the emoji to be renamed. Colons (`:myemoji:`) around the value are not required, although they may be included.
val newName : kotlin.String = newName_example // kotlin.String | The new name of the emoji.
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `admin.teams:write`
try {
    val result : DefaultSuccessTemplate = apiInstance.adminEmojiRename(name, newName, token)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdminEmojiApi#adminEmojiRename")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdminEmojiApi#adminEmojiRename")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **kotlin.String**| The name of the emoji to be renamed. Colons (&#x60;:myemoji:&#x60;) around the value are not required, although they may be included. |
 **newName** | **kotlin.String**| The new name of the emoji. |
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;admin.teams:write&#x60; |

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

