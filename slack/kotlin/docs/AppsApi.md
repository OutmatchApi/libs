# AppsApi

All URIs are relative to *https://slack.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**appsEventAuthorizationsList**](AppsApi.md#appsEventAuthorizationsList) | **GET** /apps.event.authorizations.list | 
[**appsPermissionsInfo**](AppsApi.md#appsPermissionsInfo) | **GET** /apps.permissions.info | 
[**appsPermissionsRequest**](AppsApi.md#appsPermissionsRequest) | **GET** /apps.permissions.request | 
[**appsPermissionsResourcesList**](AppsApi.md#appsPermissionsResourcesList) | **GET** /apps.permissions.resources.list | 
[**appsPermissionsScopesList**](AppsApi.md#appsPermissionsScopesList) | **GET** /apps.permissions.scopes.list | 
[**appsPermissionsUsersList**](AppsApi.md#appsPermissionsUsersList) | **GET** /apps.permissions.users.list | 
[**appsPermissionsUsersRequest**](AppsApi.md#appsPermissionsUsersRequest) | **GET** /apps.permissions.users.request | 
[**appsUninstall**](AppsApi.md#appsUninstall) | **GET** /apps.uninstall | 


<a name="appsEventAuthorizationsList"></a>
# **appsEventAuthorizationsList**
> DefaultSuccessTemplate appsEventAuthorizationsList(token, eventContext, cursor, limit)



Get a list of authorizations for the given event context. Each authorization represents an app installation that the event is visible to.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = AppsApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `authorizations:read`
val eventContext : kotlin.String = eventContext_example // kotlin.String | 
val cursor : kotlin.String = cursor_example // kotlin.String | 
val limit : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : DefaultSuccessTemplate = apiInstance.appsEventAuthorizationsList(token, eventContext, cursor, limit)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AppsApi#appsEventAuthorizationsList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AppsApi#appsEventAuthorizationsList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;authorizations:read&#x60; |
 **eventContext** | **kotlin.String**|  |
 **cursor** | **kotlin.String**|  | [optional]
 **limit** | **kotlin.Int**|  | [optional]

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="appsPermissionsInfo"></a>
# **appsPermissionsInfo**
> AppsPermissionsInfoSchema appsPermissionsInfo(token)



Returns list of permissions this app has on a team.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = AppsApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `none`
try {
    val result : AppsPermissionsInfoSchema = apiInstance.appsPermissionsInfo(token)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AppsApi#appsPermissionsInfo")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AppsApi#appsPermissionsInfo")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;none&#x60; | [optional]

### Return type

[**AppsPermissionsInfoSchema**](AppsPermissionsInfoSchema.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="appsPermissionsRequest"></a>
# **appsPermissionsRequest**
> AppsPermissionsRequestSchema appsPermissionsRequest(token, scopes, triggerId)



Allows an app to request additional scopes

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = AppsApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `none`
val scopes : kotlin.String = scopes_example // kotlin.String | A comma separated list of scopes to request for
val triggerId : kotlin.String = triggerId_example // kotlin.String | Token used to trigger the permissions API
try {
    val result : AppsPermissionsRequestSchema = apiInstance.appsPermissionsRequest(token, scopes, triggerId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AppsApi#appsPermissionsRequest")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AppsApi#appsPermissionsRequest")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;none&#x60; |
 **scopes** | **kotlin.String**| A comma separated list of scopes to request for |
 **triggerId** | **kotlin.String**| Token used to trigger the permissions API |

### Return type

[**AppsPermissionsRequestSchema**](AppsPermissionsRequestSchema.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="appsPermissionsResourcesList"></a>
# **appsPermissionsResourcesList**
> AppsPermissionsResourcesListSuccessSchema appsPermissionsResourcesList(token, cursor, limit)



Returns list of resource grants this app has on a team.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = AppsApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `none`
val cursor : kotlin.String = cursor_example // kotlin.String | Paginate through collections of data by setting the `cursor` parameter to a `next_cursor` attribute returned by a previous request's `response_metadata`. Default value fetches the first \"page\" of the collection. See [pagination](/docs/pagination) for more detail.
val limit : kotlin.Int = 56 // kotlin.Int | The maximum number of items to return.
try {
    val result : AppsPermissionsResourcesListSuccessSchema = apiInstance.appsPermissionsResourcesList(token, cursor, limit)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AppsApi#appsPermissionsResourcesList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AppsApi#appsPermissionsResourcesList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;none&#x60; |
 **cursor** | **kotlin.String**| Paginate through collections of data by setting the &#x60;cursor&#x60; parameter to a &#x60;next_cursor&#x60; attribute returned by a previous request&#39;s &#x60;response_metadata&#x60;. Default value fetches the first \&quot;page\&quot; of the collection. See [pagination](/docs/pagination) for more detail. | [optional]
 **limit** | **kotlin.Int**| The maximum number of items to return. | [optional]

### Return type

[**AppsPermissionsResourcesListSuccessSchema**](AppsPermissionsResourcesListSuccessSchema.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="appsPermissionsScopesList"></a>
# **appsPermissionsScopesList**
> ApiPermissionsScopesListSuccessSchema appsPermissionsScopesList(token)



Returns list of scopes this app has on a team.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = AppsApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `none`
try {
    val result : ApiPermissionsScopesListSuccessSchema = apiInstance.appsPermissionsScopesList(token)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AppsApi#appsPermissionsScopesList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AppsApi#appsPermissionsScopesList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;none&#x60; |

### Return type

[**ApiPermissionsScopesListSuccessSchema**](ApiPermissionsScopesListSuccessSchema.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="appsPermissionsUsersList"></a>
# **appsPermissionsUsersList**
> DefaultSuccessTemplate appsPermissionsUsersList(token, cursor, limit)



Returns list of user grants and corresponding scopes this app has on a team.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = AppsApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `none`
val cursor : kotlin.String = cursor_example // kotlin.String | Paginate through collections of data by setting the `cursor` parameter to a `next_cursor` attribute returned by a previous request's `response_metadata`. Default value fetches the first \"page\" of the collection. See [pagination](/docs/pagination) for more detail.
val limit : kotlin.Int = 56 // kotlin.Int | The maximum number of items to return.
try {
    val result : DefaultSuccessTemplate = apiInstance.appsPermissionsUsersList(token, cursor, limit)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AppsApi#appsPermissionsUsersList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AppsApi#appsPermissionsUsersList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;none&#x60; |
 **cursor** | **kotlin.String**| Paginate through collections of data by setting the &#x60;cursor&#x60; parameter to a &#x60;next_cursor&#x60; attribute returned by a previous request&#39;s &#x60;response_metadata&#x60;. Default value fetches the first \&quot;page\&quot; of the collection. See [pagination](/docs/pagination) for more detail. | [optional]
 **limit** | **kotlin.Int**| The maximum number of items to return. | [optional]

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="appsPermissionsUsersRequest"></a>
# **appsPermissionsUsersRequest**
> DefaultSuccessTemplate appsPermissionsUsersRequest(token, scopes, triggerId, user)



Enables an app to trigger a permissions modal to grant an app access to a user access scope.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = AppsApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `none`
val scopes : kotlin.String = scopes_example // kotlin.String | A comma separated list of user scopes to request for
val triggerId : kotlin.String = triggerId_example // kotlin.String | Token used to trigger the request
val user : kotlin.String = user_example // kotlin.String | The user this scope is being requested for
try {
    val result : DefaultSuccessTemplate = apiInstance.appsPermissionsUsersRequest(token, scopes, triggerId, user)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AppsApi#appsPermissionsUsersRequest")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AppsApi#appsPermissionsUsersRequest")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;none&#x60; |
 **scopes** | **kotlin.String**| A comma separated list of user scopes to request for |
 **triggerId** | **kotlin.String**| Token used to trigger the request |
 **user** | **kotlin.String**| The user this scope is being requested for |

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="appsUninstall"></a>
# **appsUninstall**
> AppsUninstallSchema appsUninstall(token, clientId, clientSecret)



Uninstalls your app from a workspace.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = AppsApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `none`
val clientId : kotlin.String = clientId_example // kotlin.String | Issued when you created your application.
val clientSecret : kotlin.String = clientSecret_example // kotlin.String | Issued when you created your application.
try {
    val result : AppsUninstallSchema = apiInstance.appsUninstall(token, clientId, clientSecret)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AppsApi#appsUninstall")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AppsApi#appsUninstall")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;none&#x60; | [optional]
 **clientId** | **kotlin.String**| Issued when you created your application. | [optional]
 **clientSecret** | **kotlin.String**| Issued when you created your application. | [optional]

### Return type

[**AppsUninstallSchema**](AppsUninstallSchema.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

