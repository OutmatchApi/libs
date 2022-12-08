# AdminTeamsAdminsApi

All URIs are relative to *https://slack.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adminTeamsAdminsList**](AdminTeamsAdminsApi.md#adminTeamsAdminsList) | **GET** /admin.teams.admins.list | 


<a name="adminTeamsAdminsList"></a>
# **adminTeamsAdminsList**
> DefaultSuccessTemplate adminTeamsAdminsList(token, teamId, limit, cursor)



List all of the admins on a given workspace.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = AdminTeamsAdminsApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `admin.teams:read`
val teamId : kotlin.String = teamId_example // kotlin.String | 
val limit : kotlin.Int = 56 // kotlin.Int | The maximum number of items to return.
val cursor : kotlin.String = cursor_example // kotlin.String | Set `cursor` to `next_cursor` returned by the previous call to list items in the next page.
try {
    val result : DefaultSuccessTemplate = apiInstance.adminTeamsAdminsList(token, teamId, limit, cursor)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdminTeamsAdminsApi#adminTeamsAdminsList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdminTeamsAdminsApi#adminTeamsAdminsList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;admin.teams:read&#x60; |
 **teamId** | **kotlin.String**|  |
 **limit** | **kotlin.Int**| The maximum number of items to return. | [optional]
 **cursor** | **kotlin.String**| Set &#x60;cursor&#x60; to &#x60;next_cursor&#x60; returned by the previous call to list items in the next page. | [optional]

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

