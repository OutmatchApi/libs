# AppsPermissionsUsersApi

All URIs are relative to *https://slack.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**appsPermissionsUsersList**](AppsPermissionsUsersApi.md#appsPermissionsUsersList) | **GET** /apps.permissions.users.list | 
[**appsPermissionsUsersRequest**](AppsPermissionsUsersApi.md#appsPermissionsUsersRequest) | **GET** /apps.permissions.users.request | 


<a name="appsPermissionsUsersList"></a>
# **appsPermissionsUsersList**
> DefaultSuccessTemplate appsPermissionsUsersList(token, cursor, limit)



Returns list of user grants and corresponding scopes this app has on a team.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = AppsPermissionsUsersApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `none`
val cursor : kotlin.String = cursor_example // kotlin.String | Paginate through collections of data by setting the `cursor` parameter to a `next_cursor` attribute returned by a previous request's `response_metadata`. Default value fetches the first \"page\" of the collection. See [pagination](/docs/pagination) for more detail.
val limit : kotlin.Int = 56 // kotlin.Int | The maximum number of items to return.
try {
    val result : DefaultSuccessTemplate = apiInstance.appsPermissionsUsersList(token, cursor, limit)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AppsPermissionsUsersApi#appsPermissionsUsersList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AppsPermissionsUsersApi#appsPermissionsUsersList")
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

val apiInstance = AppsPermissionsUsersApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `none`
val scopes : kotlin.String = scopes_example // kotlin.String | A comma separated list of user scopes to request for
val triggerId : kotlin.String = triggerId_example // kotlin.String | Token used to trigger the request
val user : kotlin.String = user_example // kotlin.String | The user this scope is being requested for
try {
    val result : DefaultSuccessTemplate = apiInstance.appsPermissionsUsersRequest(token, scopes, triggerId, user)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AppsPermissionsUsersApi#appsPermissionsUsersRequest")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AppsPermissionsUsersApi#appsPermissionsUsersRequest")
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

