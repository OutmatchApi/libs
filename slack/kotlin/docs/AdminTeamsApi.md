# AdminTeamsApi

All URIs are relative to *https://slack.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adminTeamsCreate**](AdminTeamsApi.md#adminTeamsCreate) | **POST** /admin.teams.create | 
[**adminTeamsList**](AdminTeamsApi.md#adminTeamsList) | **GET** /admin.teams.list | 


<a name="adminTeamsCreate"></a>
# **adminTeamsCreate**
> DefaultSuccessTemplate adminTeamsCreate(token, teamDomain, teamName, teamDescription, teamDiscoverability)



Create an Enterprise team.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = AdminTeamsApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `admin.teams:write`
val teamDomain : kotlin.String = teamDomain_example // kotlin.String | Team domain (for example, slacksoftballteam).
val teamName : kotlin.String = teamName_example // kotlin.String | Team name (for example, Slack Softball Team).
val teamDescription : kotlin.String = teamDescription_example // kotlin.String | Description for the team.
val teamDiscoverability : kotlin.String = teamDiscoverability_example // kotlin.String | Who can join the team. A team's discoverability can be `open`, `closed`, `invite_only`, or `unlisted`.
try {
    val result : DefaultSuccessTemplate = apiInstance.adminTeamsCreate(token, teamDomain, teamName, teamDescription, teamDiscoverability)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdminTeamsApi#adminTeamsCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdminTeamsApi#adminTeamsCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;admin.teams:write&#x60; |
 **teamDomain** | **kotlin.String**| Team domain (for example, slacksoftballteam). |
 **teamName** | **kotlin.String**| Team name (for example, Slack Softball Team). |
 **teamDescription** | **kotlin.String**| Description for the team. | [optional]
 **teamDiscoverability** | **kotlin.String**| Who can join the team. A team&#39;s discoverability can be &#x60;open&#x60;, &#x60;closed&#x60;, &#x60;invite_only&#x60;, or &#x60;unlisted&#x60;. | [optional]

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="adminTeamsList"></a>
# **adminTeamsList**
> DefaultSuccessTemplate adminTeamsList(token, limit, cursor)



List all teams on an Enterprise organization

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = AdminTeamsApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `admin.teams:read`
val limit : kotlin.Int = 56 // kotlin.Int | The maximum number of items to return. Must be between 1 - 100 both inclusive.
val cursor : kotlin.String = cursor_example // kotlin.String | Set `cursor` to `next_cursor` returned by the previous call to list items in the next page.
try {
    val result : DefaultSuccessTemplate = apiInstance.adminTeamsList(token, limit, cursor)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdminTeamsApi#adminTeamsList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdminTeamsApi#adminTeamsList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;admin.teams:read&#x60; |
 **limit** | **kotlin.Int**| The maximum number of items to return. Must be between 1 - 100 both inclusive. | [optional]
 **cursor** | **kotlin.String**| Set &#x60;cursor&#x60; to &#x60;next_cursor&#x60; returned by the previous call to list items in the next page. | [optional]

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

