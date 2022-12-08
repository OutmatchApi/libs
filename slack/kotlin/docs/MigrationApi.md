# MigrationApi

All URIs are relative to *https://slack.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**migrationExchange**](MigrationApi.md#migrationExchange) | **GET** /migration.exchange | 


<a name="migrationExchange"></a>
# **migrationExchange**
> MigrationExchangeSuccessSchema migrationExchange(token, users, teamId, toOld)



For Enterprise Grid workspaces, map local user IDs to global user IDs

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = MigrationApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `tokens.basic`
val users : kotlin.String = users_example // kotlin.String | A comma-separated list of user ids, up to 400 per request
val teamId : kotlin.String = teamId_example // kotlin.String | Specify team_id starts with `T` in case of Org Token
val toOld : kotlin.Boolean = true // kotlin.Boolean | Specify `true` to convert `W` global user IDs to workspace-specific `U` IDs. Defaults to `false`.
try {
    val result : MigrationExchangeSuccessSchema = apiInstance.migrationExchange(token, users, teamId, toOld)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MigrationApi#migrationExchange")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MigrationApi#migrationExchange")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;tokens.basic&#x60; |
 **users** | **kotlin.String**| A comma-separated list of user ids, up to 400 per request |
 **teamId** | **kotlin.String**| Specify team_id starts with &#x60;T&#x60; in case of Org Token | [optional]
 **toOld** | **kotlin.Boolean**| Specify &#x60;true&#x60; to convert &#x60;W&#x60; global user IDs to workspace-specific &#x60;U&#x60; IDs. Defaults to &#x60;false&#x60;. | [optional]

### Return type

[**MigrationExchangeSuccessSchema**](MigrationExchangeSuccessSchema.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

