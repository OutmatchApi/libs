# UsergroupsUsersApi

All URIs are relative to *https://slack.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**usergroupsUsersList**](UsergroupsUsersApi.md#usergroupsUsersList) | **GET** /usergroups.users.list | 
[**usergroupsUsersUpdate**](UsergroupsUsersApi.md#usergroupsUsersUpdate) | **POST** /usergroups.users.update | 


<a name="usergroupsUsersList"></a>
# **usergroupsUsersList**
> UsergroupsUsersListSchema usergroupsUsersList(token, usergroup, includeDisabled)



List all users in a User Group

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = UsergroupsUsersApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `usergroups:read`
val usergroup : kotlin.String = usergroup_example // kotlin.String | The encoded ID of the User Group to update.
val includeDisabled : kotlin.Boolean = true // kotlin.Boolean | Allow results that involve disabled User Groups.
try {
    val result : UsergroupsUsersListSchema = apiInstance.usergroupsUsersList(token, usergroup, includeDisabled)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsergroupsUsersApi#usergroupsUsersList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsergroupsUsersApi#usergroupsUsersList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;usergroups:read&#x60; |
 **usergroup** | **kotlin.String**| The encoded ID of the User Group to update. |
 **includeDisabled** | **kotlin.Boolean**| Allow results that involve disabled User Groups. | [optional]

### Return type

[**UsergroupsUsersListSchema**](UsergroupsUsersListSchema.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="usergroupsUsersUpdate"></a>
# **usergroupsUsersUpdate**
> UsergroupsUsersUpdateSchema usergroupsUsersUpdate(token, usergroup, users, includeCount)



Update the list of users for a User Group

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = UsergroupsUsersApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `usergroups:write`
val usergroup : kotlin.String = usergroup_example // kotlin.String | The encoded ID of the User Group to update.
val users : kotlin.String = users_example // kotlin.String | A comma separated string of encoded user IDs that represent the entire list of users for the User Group.
val includeCount : kotlin.Boolean = true // kotlin.Boolean | Include the number of users in the User Group.
try {
    val result : UsergroupsUsersUpdateSchema = apiInstance.usergroupsUsersUpdate(token, usergroup, users, includeCount)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsergroupsUsersApi#usergroupsUsersUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsergroupsUsersApi#usergroupsUsersUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;usergroups:write&#x60; |
 **usergroup** | **kotlin.String**| The encoded ID of the User Group to update. |
 **users** | **kotlin.String**| A comma separated string of encoded user IDs that represent the entire list of users for the User Group. |
 **includeCount** | **kotlin.Boolean**| Include the number of users in the User Group. | [optional]

### Return type

[**UsergroupsUsersUpdateSchema**](UsergroupsUsersUpdateSchema.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

