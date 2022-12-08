# TeamApi

All URIs are relative to *https://slack.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**teamAccessLogs**](TeamApi.md#teamAccessLogs) | **GET** /team.accessLogs | 
[**teamBillableInfo**](TeamApi.md#teamBillableInfo) | **GET** /team.billableInfo | 
[**teamInfo**](TeamApi.md#teamInfo) | **GET** /team.info | 
[**teamIntegrationLogs**](TeamApi.md#teamIntegrationLogs) | **GET** /team.integrationLogs | 
[**teamProfileGet**](TeamApi.md#teamProfileGet) | **GET** /team.profile.get | 


<a name="teamAccessLogs"></a>
# **teamAccessLogs**
> TeamAccessLogsSchema teamAccessLogs(token, before, count, page)



Gets the access logs for the current team.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = TeamApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `admin`
val before : kotlin.String = before_example // kotlin.String | End of time range of logs to include in results (inclusive).
val count : kotlin.String = count_example // kotlin.String | 
val page : kotlin.String = page_example // kotlin.String | 
try {
    val result : TeamAccessLogsSchema = apiInstance.teamAccessLogs(token, before, count, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamApi#teamAccessLogs")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamApi#teamAccessLogs")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;admin&#x60; |
 **before** | **kotlin.String**| End of time range of logs to include in results (inclusive). | [optional]
 **count** | **kotlin.String**|  | [optional]
 **page** | **kotlin.String**|  | [optional]

### Return type

[**TeamAccessLogsSchema**](TeamAccessLogsSchema.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="teamBillableInfo"></a>
# **teamBillableInfo**
> DefaultSuccessTemplate teamBillableInfo(token, user)



Gets billable users information for the current team.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = TeamApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `admin`
val user : kotlin.String = user_example // kotlin.String | A user to retrieve the billable information for. Defaults to all users.
try {
    val result : DefaultSuccessTemplate = apiInstance.teamBillableInfo(token, user)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamApi#teamBillableInfo")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamApi#teamBillableInfo")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;admin&#x60; |
 **user** | **kotlin.String**| A user to retrieve the billable information for. Defaults to all users. | [optional]

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="teamInfo"></a>
# **teamInfo**
> TeamInfoSchema teamInfo(token, team)



Gets information about the current team.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = TeamApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `team:read`
val team : kotlin.String = team_example // kotlin.String | Team to get info on, if omitted, will return information about the current team. Will only return team that the authenticated token is allowed to see through external shared channels
try {
    val result : TeamInfoSchema = apiInstance.teamInfo(token, team)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamApi#teamInfo")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamApi#teamInfo")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;team:read&#x60; |
 **team** | **kotlin.String**| Team to get info on, if omitted, will return information about the current team. Will only return team that the authenticated token is allowed to see through external shared channels | [optional]

### Return type

[**TeamInfoSchema**](TeamInfoSchema.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="teamIntegrationLogs"></a>
# **teamIntegrationLogs**
> TeamIntegrationLogsSchema teamIntegrationLogs(token, appId, changeType, count, page, serviceId, user)



Gets the integration logs for the current team.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = TeamApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `admin`
val appId : kotlin.String = appId_example // kotlin.String | Filter logs to this Slack app. Defaults to all logs.
val changeType : kotlin.String = changeType_example // kotlin.String | Filter logs with this change type. Defaults to all logs.
val count : kotlin.String = count_example // kotlin.String | 
val page : kotlin.String = page_example // kotlin.String | 
val serviceId : kotlin.String = serviceId_example // kotlin.String | Filter logs to this service. Defaults to all logs.
val user : kotlin.String = user_example // kotlin.String | Filter logs generated by this userâ€™s actions. Defaults to all logs.
try {
    val result : TeamIntegrationLogsSchema = apiInstance.teamIntegrationLogs(token, appId, changeType, count, page, serviceId, user)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamApi#teamIntegrationLogs")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamApi#teamIntegrationLogs")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;admin&#x60; |
 **appId** | **kotlin.String**| Filter logs to this Slack app. Defaults to all logs. | [optional]
 **changeType** | **kotlin.String**| Filter logs with this change type. Defaults to all logs. | [optional]
 **count** | **kotlin.String**|  | [optional]
 **page** | **kotlin.String**|  | [optional]
 **serviceId** | **kotlin.String**| Filter logs to this service. Defaults to all logs. | [optional]
 **user** | **kotlin.String**| Filter logs generated by this userâ€™s actions. Defaults to all logs. | [optional]

### Return type

[**TeamIntegrationLogsSchema**](TeamIntegrationLogsSchema.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="teamProfileGet"></a>
# **teamProfileGet**
> TeamProfileGetSuccessSchema teamProfileGet(token, visibility)



Retrieve a team&#39;s profile.

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = TeamApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `users.profile:read`
val visibility : kotlin.String = visibility_example // kotlin.String | Filter by visibility.
try {
    val result : TeamProfileGetSuccessSchema = apiInstance.teamProfileGet(token, visibility)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamApi#teamProfileGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamApi#teamProfileGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;users.profile:read&#x60; |
 **visibility** | **kotlin.String**| Filter by visibility. | [optional]

### Return type

[**TeamProfileGetSuccessSchema**](TeamProfileGetSuccessSchema.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

