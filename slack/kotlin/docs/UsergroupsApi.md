# UsergroupsApi

All URIs are relative to *https://slack.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**usergroupsCreate**](UsergroupsApi.md#usergroupsCreate) | **POST** /usergroups.create | 
[**usergroupsDisable**](UsergroupsApi.md#usergroupsDisable) | **POST** /usergroups.disable | 
[**usergroupsEnable**](UsergroupsApi.md#usergroupsEnable) | **POST** /usergroups.enable | 
[**usergroupsList**](UsergroupsApi.md#usergroupsList) | **GET** /usergroups.list | 
[**usergroupsUpdate**](UsergroupsApi.md#usergroupsUpdate) | **POST** /usergroups.update | 
[**usergroupsUsersList**](UsergroupsApi.md#usergroupsUsersList) | **GET** /usergroups.users.list | 
[**usergroupsUsersUpdate**](UsergroupsApi.md#usergroupsUsersUpdate) | **POST** /usergroups.users.update | 


<a name="usergroupsCreate"></a>
# **usergroupsCreate**
> UsergroupsCreateSchema usergroupsCreate(token, name, channels, description, handle, includeCount)



Create a User Group

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = UsergroupsApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `usergroups:write`
val name : kotlin.String = name_example // kotlin.String | A name for the User Group. Must be unique among User Groups.
val channels : kotlin.String = channels_example // kotlin.String | A comma separated string of encoded channel IDs for which the User Group uses as a default.
val description : kotlin.String = description_example // kotlin.String | A short description of the User Group.
val handle : kotlin.String = handle_example // kotlin.String | A mention handle. Must be unique among channels, users and User Groups.
val includeCount : kotlin.Boolean = true // kotlin.Boolean | Include the number of users in each User Group.
try {
    val result : UsergroupsCreateSchema = apiInstance.usergroupsCreate(token, name, channels, description, handle, includeCount)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsergroupsApi#usergroupsCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsergroupsApi#usergroupsCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;usergroups:write&#x60; |
 **name** | **kotlin.String**| A name for the User Group. Must be unique among User Groups. |
 **channels** | **kotlin.String**| A comma separated string of encoded channel IDs for which the User Group uses as a default. | [optional]
 **description** | **kotlin.String**| A short description of the User Group. | [optional]
 **handle** | **kotlin.String**| A mention handle. Must be unique among channels, users and User Groups. | [optional]
 **includeCount** | **kotlin.Boolean**| Include the number of users in each User Group. | [optional]

### Return type

[**UsergroupsCreateSchema**](UsergroupsCreateSchema.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="usergroupsDisable"></a>
# **usergroupsDisable**
> UsergroupsDisableSchema usergroupsDisable(token, usergroup, includeCount)



Disable an existing User Group

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = UsergroupsApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `usergroups:write`
val usergroup : kotlin.String = usergroup_example // kotlin.String | The encoded ID of the User Group to disable.
val includeCount : kotlin.Boolean = true // kotlin.Boolean | Include the number of users in the User Group.
try {
    val result : UsergroupsDisableSchema = apiInstance.usergroupsDisable(token, usergroup, includeCount)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsergroupsApi#usergroupsDisable")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsergroupsApi#usergroupsDisable")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;usergroups:write&#x60; |
 **usergroup** | **kotlin.String**| The encoded ID of the User Group to disable. |
 **includeCount** | **kotlin.Boolean**| Include the number of users in the User Group. | [optional]

### Return type

[**UsergroupsDisableSchema**](UsergroupsDisableSchema.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="usergroupsEnable"></a>
# **usergroupsEnable**
> UsergroupsEnableSchema usergroupsEnable(token, usergroup, includeCount)



Enable a User Group

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = UsergroupsApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `usergroups:write`
val usergroup : kotlin.String = usergroup_example // kotlin.String | The encoded ID of the User Group to enable.
val includeCount : kotlin.Boolean = true // kotlin.Boolean | Include the number of users in the User Group.
try {
    val result : UsergroupsEnableSchema = apiInstance.usergroupsEnable(token, usergroup, includeCount)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsergroupsApi#usergroupsEnable")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsergroupsApi#usergroupsEnable")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;usergroups:write&#x60; |
 **usergroup** | **kotlin.String**| The encoded ID of the User Group to enable. |
 **includeCount** | **kotlin.Boolean**| Include the number of users in the User Group. | [optional]

### Return type

[**UsergroupsEnableSchema**](UsergroupsEnableSchema.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="usergroupsList"></a>
# **usergroupsList**
> UsergroupsListSchema usergroupsList(token, includeUsers, includeCount, includeDisabled)



List all User Groups for a team

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = UsergroupsApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `usergroups:read`
val includeUsers : kotlin.Boolean = true // kotlin.Boolean | Include the list of users for each User Group.
val includeCount : kotlin.Boolean = true // kotlin.Boolean | Include the number of users in each User Group.
val includeDisabled : kotlin.Boolean = true // kotlin.Boolean | Include disabled User Groups.
try {
    val result : UsergroupsListSchema = apiInstance.usergroupsList(token, includeUsers, includeCount, includeDisabled)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsergroupsApi#usergroupsList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsergroupsApi#usergroupsList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;usergroups:read&#x60; |
 **includeUsers** | **kotlin.Boolean**| Include the list of users for each User Group. | [optional]
 **includeCount** | **kotlin.Boolean**| Include the number of users in each User Group. | [optional]
 **includeDisabled** | **kotlin.Boolean**| Include disabled User Groups. | [optional]

### Return type

[**UsergroupsListSchema**](UsergroupsListSchema.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="usergroupsUpdate"></a>
# **usergroupsUpdate**
> UsergroupsUpdateSchema usergroupsUpdate(token, usergroup, channels, description, handle, includeCount, name)



Update an existing User Group

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = UsergroupsApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `usergroups:write`
val usergroup : kotlin.String = usergroup_example // kotlin.String | The encoded ID of the User Group to update.
val channels : kotlin.String = channels_example // kotlin.String | A comma separated string of encoded channel IDs for which the User Group uses as a default.
val description : kotlin.String = description_example // kotlin.String | A short description of the User Group.
val handle : kotlin.String = handle_example // kotlin.String | A mention handle. Must be unique among channels, users and User Groups.
val includeCount : kotlin.Boolean = true // kotlin.Boolean | Include the number of users in the User Group.
val name : kotlin.String = name_example // kotlin.String | A name for the User Group. Must be unique among User Groups.
try {
    val result : UsergroupsUpdateSchema = apiInstance.usergroupsUpdate(token, usergroup, channels, description, handle, includeCount, name)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsergroupsApi#usergroupsUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsergroupsApi#usergroupsUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Authentication token. Requires scope: &#x60;usergroups:write&#x60; |
 **usergroup** | **kotlin.String**| The encoded ID of the User Group to update. |
 **channels** | **kotlin.String**| A comma separated string of encoded channel IDs for which the User Group uses as a default. | [optional]
 **description** | **kotlin.String**| A short description of the User Group. | [optional]
 **handle** | **kotlin.String**| A mention handle. Must be unique among channels, users and User Groups. | [optional]
 **includeCount** | **kotlin.Boolean**| Include the number of users in the User Group. | [optional]
 **name** | **kotlin.String**| A name for the User Group. Must be unique among User Groups. | [optional]

### Return type

[**UsergroupsUpdateSchema**](UsergroupsUpdateSchema.md)

### Authorization


Configure slackAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="usergroupsUsersList"></a>
# **usergroupsUsersList**
> UsergroupsUsersListSchema usergroupsUsersList(token, usergroup, includeDisabled)



List all users in a User Group

### Example
```kotlin
// Import classes:
//import slack.infrastructure.*
//import com.outmatchapi.slack.*

val apiInstance = UsergroupsApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `usergroups:read`
val usergroup : kotlin.String = usergroup_example // kotlin.String | The encoded ID of the User Group to update.
val includeDisabled : kotlin.Boolean = true // kotlin.Boolean | Allow results that involve disabled User Groups.
try {
    val result : UsergroupsUsersListSchema = apiInstance.usergroupsUsersList(token, usergroup, includeDisabled)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsergroupsApi#usergroupsUsersList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsergroupsApi#usergroupsUsersList")
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

val apiInstance = UsergroupsApi()
val token : kotlin.String = token_example // kotlin.String | Authentication token. Requires scope: `usergroups:write`
val usergroup : kotlin.String = usergroup_example // kotlin.String | The encoded ID of the User Group to update.
val users : kotlin.String = users_example // kotlin.String | A comma separated string of encoded user IDs that represent the entire list of users for the User Group.
val includeCount : kotlin.Boolean = true // kotlin.Boolean | Include the number of users in the User Group.
try {
    val result : UsergroupsUsersUpdateSchema = apiInstance.usergroupsUsersUpdate(token, usergroup, users, includeCount)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsergroupsApi#usergroupsUsersUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsergroupsApi#usergroupsUsersUpdate")
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

