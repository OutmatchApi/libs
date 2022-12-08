# AdminApi

All URIs are relative to *https://slack.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**adminAppsApprove**](AdminApi.md#adminAppsApprove) | **POST** /admin.apps.approve |  |
| [**adminAppsApprovedList**](AdminApi.md#adminAppsApprovedList) | **GET** /admin.apps.approved.list |  |
| [**adminAppsRequestsList**](AdminApi.md#adminAppsRequestsList) | **GET** /admin.apps.requests.list |  |
| [**adminAppsRestrict**](AdminApi.md#adminAppsRestrict) | **POST** /admin.apps.restrict |  |
| [**adminAppsRestrictedList**](AdminApi.md#adminAppsRestrictedList) | **GET** /admin.apps.restricted.list |  |
| [**adminConversationsArchive**](AdminApi.md#adminConversationsArchive) | **POST** /admin.conversations.archive |  |
| [**adminConversationsConvertToPrivate**](AdminApi.md#adminConversationsConvertToPrivate) | **POST** /admin.conversations.convertToPrivate |  |
| [**adminConversationsCreate**](AdminApi.md#adminConversationsCreate) | **POST** /admin.conversations.create |  |
| [**adminConversationsDelete**](AdminApi.md#adminConversationsDelete) | **POST** /admin.conversations.delete |  |
| [**adminConversationsDisconnectShared**](AdminApi.md#adminConversationsDisconnectShared) | **POST** /admin.conversations.disconnectShared |  |
| [**adminConversationsEkmListOriginalConnectedChannelInfo**](AdminApi.md#adminConversationsEkmListOriginalConnectedChannelInfo) | **GET** /admin.conversations.ekm.listOriginalConnectedChannelInfo |  |
| [**adminConversationsGetConversationPrefs**](AdminApi.md#adminConversationsGetConversationPrefs) | **GET** /admin.conversations.getConversationPrefs |  |
| [**adminConversationsGetTeams**](AdminApi.md#adminConversationsGetTeams) | **GET** /admin.conversations.getTeams |  |
| [**adminConversationsInvite**](AdminApi.md#adminConversationsInvite) | **POST** /admin.conversations.invite |  |
| [**adminConversationsRename**](AdminApi.md#adminConversationsRename) | **POST** /admin.conversations.rename |  |
| [**adminConversationsRestrictAccessAddGroup**](AdminApi.md#adminConversationsRestrictAccessAddGroup) | **POST** /admin.conversations.restrictAccess.addGroup |  |
| [**adminConversationsRestrictAccessListGroups**](AdminApi.md#adminConversationsRestrictAccessListGroups) | **GET** /admin.conversations.restrictAccess.listGroups |  |
| [**adminConversationsRestrictAccessRemoveGroup**](AdminApi.md#adminConversationsRestrictAccessRemoveGroup) | **POST** /admin.conversations.restrictAccess.removeGroup |  |
| [**adminConversationsSearch**](AdminApi.md#adminConversationsSearch) | **GET** /admin.conversations.search |  |
| [**adminConversationsSetConversationPrefs**](AdminApi.md#adminConversationsSetConversationPrefs) | **POST** /admin.conversations.setConversationPrefs |  |
| [**adminConversationsSetTeams**](AdminApi.md#adminConversationsSetTeams) | **POST** /admin.conversations.setTeams |  |
| [**adminConversationsUnarchive**](AdminApi.md#adminConversationsUnarchive) | **POST** /admin.conversations.unarchive |  |
| [**adminEmojiAdd**](AdminApi.md#adminEmojiAdd) | **POST** /admin.emoji.add |  |
| [**adminEmojiAddAlias**](AdminApi.md#adminEmojiAddAlias) | **POST** /admin.emoji.addAlias |  |
| [**adminEmojiList**](AdminApi.md#adminEmojiList) | **GET** /admin.emoji.list |  |
| [**adminEmojiRemove**](AdminApi.md#adminEmojiRemove) | **POST** /admin.emoji.remove |  |
| [**adminEmojiRename**](AdminApi.md#adminEmojiRename) | **POST** /admin.emoji.rename |  |
| [**adminInviteRequestsApprove**](AdminApi.md#adminInviteRequestsApprove) | **POST** /admin.inviteRequests.approve |  |
| [**adminInviteRequestsApprovedList**](AdminApi.md#adminInviteRequestsApprovedList) | **GET** /admin.inviteRequests.approved.list |  |
| [**adminInviteRequestsDeniedList**](AdminApi.md#adminInviteRequestsDeniedList) | **GET** /admin.inviteRequests.denied.list |  |
| [**adminInviteRequestsDeny**](AdminApi.md#adminInviteRequestsDeny) | **POST** /admin.inviteRequests.deny |  |
| [**adminInviteRequestsList**](AdminApi.md#adminInviteRequestsList) | **GET** /admin.inviteRequests.list |  |
| [**adminTeamsAdminsList**](AdminApi.md#adminTeamsAdminsList) | **GET** /admin.teams.admins.list |  |
| [**adminTeamsCreate**](AdminApi.md#adminTeamsCreate) | **POST** /admin.teams.create |  |
| [**adminTeamsList**](AdminApi.md#adminTeamsList) | **GET** /admin.teams.list |  |
| [**adminTeamsOwnersList**](AdminApi.md#adminTeamsOwnersList) | **GET** /admin.teams.owners.list |  |
| [**adminTeamsSettingsInfo**](AdminApi.md#adminTeamsSettingsInfo) | **GET** /admin.teams.settings.info |  |
| [**adminTeamsSettingsSetDefaultChannels**](AdminApi.md#adminTeamsSettingsSetDefaultChannels) | **POST** /admin.teams.settings.setDefaultChannels |  |
| [**adminTeamsSettingsSetDescription**](AdminApi.md#adminTeamsSettingsSetDescription) | **POST** /admin.teams.settings.setDescription |  |
| [**adminTeamsSettingsSetDiscoverability**](AdminApi.md#adminTeamsSettingsSetDiscoverability) | **POST** /admin.teams.settings.setDiscoverability |  |
| [**adminTeamsSettingsSetIcon**](AdminApi.md#adminTeamsSettingsSetIcon) | **POST** /admin.teams.settings.setIcon |  |
| [**adminTeamsSettingsSetName**](AdminApi.md#adminTeamsSettingsSetName) | **POST** /admin.teams.settings.setName |  |
| [**adminUsergroupsAddChannels**](AdminApi.md#adminUsergroupsAddChannels) | **POST** /admin.usergroups.addChannels |  |
| [**adminUsergroupsAddTeams**](AdminApi.md#adminUsergroupsAddTeams) | **POST** /admin.usergroups.addTeams |  |
| [**adminUsergroupsListChannels**](AdminApi.md#adminUsergroupsListChannels) | **GET** /admin.usergroups.listChannels |  |
| [**adminUsergroupsRemoveChannels**](AdminApi.md#adminUsergroupsRemoveChannels) | **POST** /admin.usergroups.removeChannels |  |
| [**adminUsersAssign**](AdminApi.md#adminUsersAssign) | **POST** /admin.users.assign |  |
| [**adminUsersInvite**](AdminApi.md#adminUsersInvite) | **POST** /admin.users.invite |  |
| [**adminUsersList**](AdminApi.md#adminUsersList) | **GET** /admin.users.list |  |
| [**adminUsersRemove**](AdminApi.md#adminUsersRemove) | **POST** /admin.users.remove |  |
| [**adminUsersSessionInvalidate**](AdminApi.md#adminUsersSessionInvalidate) | **POST** /admin.users.session.invalidate |  |
| [**adminUsersSessionReset**](AdminApi.md#adminUsersSessionReset) | **POST** /admin.users.session.reset |  |
| [**adminUsersSetAdmin**](AdminApi.md#adminUsersSetAdmin) | **POST** /admin.users.setAdmin |  |
| [**adminUsersSetExpiration**](AdminApi.md#adminUsersSetExpiration) | **POST** /admin.users.setExpiration |  |
| [**adminUsersSetOwner**](AdminApi.md#adminUsersSetOwner) | **POST** /admin.users.setOwner |  |
| [**adminUsersSetRegular**](AdminApi.md#adminUsersSetRegular) | **POST** /admin.users.setRegular |  |


<a name="adminAppsApprove"></a>
# **adminAppsApprove**
> DefaultSuccessTemplate adminAppsApprove(token, appId, requestId, teamId)



Approve an app for installation on a workspace.

### Example
```java
// Import classes:
import invalidPackageName.ApiClient;
import invalidPackageName.ApiException;
import invalidPackageName.Configuration;
import invalidPackageName.auth.*;
import invalidPackageName.models.*;
import slack.AdminApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://slack.com/api");
    
    // Configure OAuth2 access token for authorization: slackAuth
    OAuth slackAuth = (OAuth) defaultClient.getAuthentication("slackAuth");
    slackAuth.setAccessToken("YOUR ACCESS TOKEN");

    AdminApi apiInstance = new AdminApi(defaultClient);
    String token = "token_example"; // String | Authentication token. Requires scope: `admin.apps:write`
    String appId = "appId_example"; // String | The id of the app to approve.
    String requestId = "requestId_example"; // String | The id of the request to approve.
    String teamId = "teamId_example"; // String | 
    try {
      DefaultSuccessTemplate result = apiInstance.adminAppsApprove(token, appId, requestId, teamId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#adminAppsApprove");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **token** | **String**| Authentication token. Requires scope: &#x60;admin.apps:write&#x60; | |
| **appId** | **String**| The id of the app to approve. | [optional] |
| **requestId** | **String**| The id of the request to approve. | [optional] |
| **teamId** | **String**|  | [optional] |

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Typical success response |  -  |
| **0** | Typical error response |  -  |

<a name="adminAppsApprovedList"></a>
# **adminAppsApprovedList**
> DefaultSuccessTemplate adminAppsApprovedList(token, limit, cursor, teamId, enterpriseId)



List approved apps for an org or workspace.

### Example
```java
// Import classes:
import invalidPackageName.ApiClient;
import invalidPackageName.ApiException;
import invalidPackageName.Configuration;
import invalidPackageName.auth.*;
import invalidPackageName.models.*;
import slack.AdminApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://slack.com/api");
    
    // Configure OAuth2 access token for authorization: slackAuth
    OAuth slackAuth = (OAuth) defaultClient.getAuthentication("slackAuth");
    slackAuth.setAccessToken("YOUR ACCESS TOKEN");

    AdminApi apiInstance = new AdminApi(defaultClient);
    String token = "token_example"; // String | Authentication token. Requires scope: `admin.apps:read`
    Integer limit = 56; // Integer | The maximum number of items to return. Must be between 1 - 1000 both inclusive.
    String cursor = "cursor_example"; // String | Set `cursor` to `next_cursor` returned by the previous call to list items in the next page
    String teamId = "teamId_example"; // String | 
    String enterpriseId = "enterpriseId_example"; // String | 
    try {
      DefaultSuccessTemplate result = apiInstance.adminAppsApprovedList(token, limit, cursor, teamId, enterpriseId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#adminAppsApprovedList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **token** | **String**| Authentication token. Requires scope: &#x60;admin.apps:read&#x60; | |
| **limit** | **Integer**| The maximum number of items to return. Must be between 1 - 1000 both inclusive. | [optional] |
| **cursor** | **String**| Set &#x60;cursor&#x60; to &#x60;next_cursor&#x60; returned by the previous call to list items in the next page | [optional] |
| **teamId** | **String**|  | [optional] |
| **enterpriseId** | **String**|  | [optional] |

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Typical success response |  -  |
| **0** | Typical error response |  -  |

<a name="adminAppsRequestsList"></a>
# **adminAppsRequestsList**
> DefaultSuccessTemplate adminAppsRequestsList(token, limit, cursor, teamId)



List app requests for a team/workspace.

### Example
```java
// Import classes:
import invalidPackageName.ApiClient;
import invalidPackageName.ApiException;
import invalidPackageName.Configuration;
import invalidPackageName.auth.*;
import invalidPackageName.models.*;
import slack.AdminApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://slack.com/api");
    
    // Configure OAuth2 access token for authorization: slackAuth
    OAuth slackAuth = (OAuth) defaultClient.getAuthentication("slackAuth");
    slackAuth.setAccessToken("YOUR ACCESS TOKEN");

    AdminApi apiInstance = new AdminApi(defaultClient);
    String token = "token_example"; // String | Authentication token. Requires scope: `admin.apps:read`
    Integer limit = 56; // Integer | The maximum number of items to return. Must be between 1 - 1000 both inclusive.
    String cursor = "cursor_example"; // String | Set `cursor` to `next_cursor` returned by the previous call to list items in the next page
    String teamId = "teamId_example"; // String | 
    try {
      DefaultSuccessTemplate result = apiInstance.adminAppsRequestsList(token, limit, cursor, teamId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#adminAppsRequestsList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **token** | **String**| Authentication token. Requires scope: &#x60;admin.apps:read&#x60; | |
| **limit** | **Integer**| The maximum number of items to return. Must be between 1 - 1000 both inclusive. | [optional] |
| **cursor** | **String**| Set &#x60;cursor&#x60; to &#x60;next_cursor&#x60; returned by the previous call to list items in the next page | [optional] |
| **teamId** | **String**|  | [optional] |

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Typical success response |  -  |
| **0** | Typical error response |  -  |

<a name="adminAppsRestrict"></a>
# **adminAppsRestrict**
> DefaultSuccessTemplate adminAppsRestrict(token, appId, requestId, teamId)



Restrict an app for installation on a workspace.

### Example
```java
// Import classes:
import invalidPackageName.ApiClient;
import invalidPackageName.ApiException;
import invalidPackageName.Configuration;
import invalidPackageName.auth.*;
import invalidPackageName.models.*;
import slack.AdminApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://slack.com/api");
    
    // Configure OAuth2 access token for authorization: slackAuth
    OAuth slackAuth = (OAuth) defaultClient.getAuthentication("slackAuth");
    slackAuth.setAccessToken("YOUR ACCESS TOKEN");

    AdminApi apiInstance = new AdminApi(defaultClient);
    String token = "token_example"; // String | Authentication token. Requires scope: `admin.apps:write`
    String appId = "appId_example"; // String | The id of the app to restrict.
    String requestId = "requestId_example"; // String | The id of the request to restrict.
    String teamId = "teamId_example"; // String | 
    try {
      DefaultSuccessTemplate result = apiInstance.adminAppsRestrict(token, appId, requestId, teamId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#adminAppsRestrict");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **token** | **String**| Authentication token. Requires scope: &#x60;admin.apps:write&#x60; | |
| **appId** | **String**| The id of the app to restrict. | [optional] |
| **requestId** | **String**| The id of the request to restrict. | [optional] |
| **teamId** | **String**|  | [optional] |

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Typical success response |  -  |
| **0** | Typical error response |  -  |

<a name="adminAppsRestrictedList"></a>
# **adminAppsRestrictedList**
> DefaultSuccessTemplate adminAppsRestrictedList(token, limit, cursor, teamId, enterpriseId)



List restricted apps for an org or workspace.

### Example
```java
// Import classes:
import invalidPackageName.ApiClient;
import invalidPackageName.ApiException;
import invalidPackageName.Configuration;
import invalidPackageName.auth.*;
import invalidPackageName.models.*;
import slack.AdminApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://slack.com/api");
    
    // Configure OAuth2 access token for authorization: slackAuth
    OAuth slackAuth = (OAuth) defaultClient.getAuthentication("slackAuth");
    slackAuth.setAccessToken("YOUR ACCESS TOKEN");

    AdminApi apiInstance = new AdminApi(defaultClient);
    String token = "token_example"; // String | Authentication token. Requires scope: `admin.apps:read`
    Integer limit = 56; // Integer | The maximum number of items to return. Must be between 1 - 1000 both inclusive.
    String cursor = "cursor_example"; // String | Set `cursor` to `next_cursor` returned by the previous call to list items in the next page
    String teamId = "teamId_example"; // String | 
    String enterpriseId = "enterpriseId_example"; // String | 
    try {
      DefaultSuccessTemplate result = apiInstance.adminAppsRestrictedList(token, limit, cursor, teamId, enterpriseId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#adminAppsRestrictedList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **token** | **String**| Authentication token. Requires scope: &#x60;admin.apps:read&#x60; | |
| **limit** | **Integer**| The maximum number of items to return. Must be between 1 - 1000 both inclusive. | [optional] |
| **cursor** | **String**| Set &#x60;cursor&#x60; to &#x60;next_cursor&#x60; returned by the previous call to list items in the next page | [optional] |
| **teamId** | **String**|  | [optional] |
| **enterpriseId** | **String**|  | [optional] |

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Typical success response |  -  |
| **0** | Typical error response |  -  |

<a name="adminConversationsArchive"></a>
# **adminConversationsArchive**
> AdminConversationsArchiveSchema adminConversationsArchive(token, channelId)



Archive a public or private channel.

### Example
```java
// Import classes:
import invalidPackageName.ApiClient;
import invalidPackageName.ApiException;
import invalidPackageName.Configuration;
import invalidPackageName.auth.*;
import invalidPackageName.models.*;
import slack.AdminApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://slack.com/api");
    
    // Configure OAuth2 access token for authorization: slackAuth
    OAuth slackAuth = (OAuth) defaultClient.getAuthentication("slackAuth");
    slackAuth.setAccessToken("YOUR ACCESS TOKEN");

    AdminApi apiInstance = new AdminApi(defaultClient);
    String token = "token_example"; // String | Authentication token. Requires scope: `admin.conversations:write`
    String channelId = "channelId_example"; // String | The channel to archive.
    try {
      AdminConversationsArchiveSchema result = apiInstance.adminConversationsArchive(token, channelId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#adminConversationsArchive");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **token** | **String**| Authentication token. Requires scope: &#x60;admin.conversations:write&#x60; | |
| **channelId** | **String**| The channel to archive. | |

### Return type

[**AdminConversationsArchiveSchema**](AdminConversationsArchiveSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Typical success response |  -  |
| **0** | Typical error response |  -  |

<a name="adminConversationsConvertToPrivate"></a>
# **adminConversationsConvertToPrivate**
> AdminConversationsConvertToPrivateSchema adminConversationsConvertToPrivate(token, channelId)



Convert a public channel to a private channel.

### Example
```java
// Import classes:
import invalidPackageName.ApiClient;
import invalidPackageName.ApiException;
import invalidPackageName.Configuration;
import invalidPackageName.auth.*;
import invalidPackageName.models.*;
import slack.AdminApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://slack.com/api");
    
    // Configure OAuth2 access token for authorization: slackAuth
    OAuth slackAuth = (OAuth) defaultClient.getAuthentication("slackAuth");
    slackAuth.setAccessToken("YOUR ACCESS TOKEN");

    AdminApi apiInstance = new AdminApi(defaultClient);
    String token = "token_example"; // String | Authentication token. Requires scope: `admin.conversations:write`
    String channelId = "channelId_example"; // String | The channel to convert to private.
    try {
      AdminConversationsConvertToPrivateSchema result = apiInstance.adminConversationsConvertToPrivate(token, channelId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#adminConversationsConvertToPrivate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **token** | **String**| Authentication token. Requires scope: &#x60;admin.conversations:write&#x60; | |
| **channelId** | **String**| The channel to convert to private. | |

### Return type

[**AdminConversationsConvertToPrivateSchema**](AdminConversationsConvertToPrivateSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Typical success response |  -  |
| **0** | Typical error response |  -  |

<a name="adminConversationsCreate"></a>
# **adminConversationsCreate**
> AdminConversationsCreateSchema adminConversationsCreate(token, isPrivate, name, description, orgWide, teamId)



Create a public or private channel-based conversation.

### Example
```java
// Import classes:
import invalidPackageName.ApiClient;
import invalidPackageName.ApiException;
import invalidPackageName.Configuration;
import invalidPackageName.auth.*;
import invalidPackageName.models.*;
import slack.AdminApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://slack.com/api");
    
    // Configure OAuth2 access token for authorization: slackAuth
    OAuth slackAuth = (OAuth) defaultClient.getAuthentication("slackAuth");
    slackAuth.setAccessToken("YOUR ACCESS TOKEN");

    AdminApi apiInstance = new AdminApi(defaultClient);
    String token = "token_example"; // String | Authentication token. Requires scope: `admin.conversations:write`
    Boolean isPrivate = true; // Boolean | When `true`, creates a private channel instead of a public channel
    String name = "name_example"; // String | Name of the public or private channel to create.
    String description = "description_example"; // String | Description of the public or private channel to create.
    Boolean orgWide = true; // Boolean | When `true`, the channel will be available org-wide. Note: if the channel is not `org_wide=true`, you must specify a `team_id` for this channel
    String teamId = "teamId_example"; // String | The workspace to create the channel in. Note: this argument is required unless you set `org_wide=true`.
    try {
      AdminConversationsCreateSchema result = apiInstance.adminConversationsCreate(token, isPrivate, name, description, orgWide, teamId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#adminConversationsCreate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **token** | **String**| Authentication token. Requires scope: &#x60;admin.conversations:write&#x60; | |
| **isPrivate** | **Boolean**| When &#x60;true&#x60;, creates a private channel instead of a public channel | |
| **name** | **String**| Name of the public or private channel to create. | |
| **description** | **String**| Description of the public or private channel to create. | [optional] |
| **orgWide** | **Boolean**| When &#x60;true&#x60;, the channel will be available org-wide. Note: if the channel is not &#x60;org_wide&#x3D;true&#x60;, you must specify a &#x60;team_id&#x60; for this channel | [optional] |
| **teamId** | **String**| The workspace to create the channel in. Note: this argument is required unless you set &#x60;org_wide&#x3D;true&#x60;. | [optional] |

### Return type

[**AdminConversationsCreateSchema**](AdminConversationsCreateSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Typical success response |  -  |
| **0** | Typical error response |  -  |

<a name="adminConversationsDelete"></a>
# **adminConversationsDelete**
> AdminConversationsDeleteSchema adminConversationsDelete(token, channelId)



Delete a public or private channel.

### Example
```java
// Import classes:
import invalidPackageName.ApiClient;
import invalidPackageName.ApiException;
import invalidPackageName.Configuration;
import invalidPackageName.auth.*;
import invalidPackageName.models.*;
import slack.AdminApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://slack.com/api");
    
    // Configure OAuth2 access token for authorization: slackAuth
    OAuth slackAuth = (OAuth) defaultClient.getAuthentication("slackAuth");
    slackAuth.setAccessToken("YOUR ACCESS TOKEN");

    AdminApi apiInstance = new AdminApi(defaultClient);
    String token = "token_example"; // String | Authentication token. Requires scope: `admin.conversations:write`
    String channelId = "channelId_example"; // String | The channel to delete.
    try {
      AdminConversationsDeleteSchema result = apiInstance.adminConversationsDelete(token, channelId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#adminConversationsDelete");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **token** | **String**| Authentication token. Requires scope: &#x60;admin.conversations:write&#x60; | |
| **channelId** | **String**| The channel to delete. | |

### Return type

[**AdminConversationsDeleteSchema**](AdminConversationsDeleteSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Typical success response |  -  |
| **0** | Typical error response |  -  |

<a name="adminConversationsDisconnectShared"></a>
# **adminConversationsDisconnectShared**
> AdminConversationsRenameSchema adminConversationsDisconnectShared(token, channelId, leavingTeamIds)



Disconnect a connected channel from one or more workspaces.

### Example
```java
// Import classes:
import invalidPackageName.ApiClient;
import invalidPackageName.ApiException;
import invalidPackageName.Configuration;
import invalidPackageName.auth.*;
import invalidPackageName.models.*;
import slack.AdminApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://slack.com/api");
    
    // Configure OAuth2 access token for authorization: slackAuth
    OAuth slackAuth = (OAuth) defaultClient.getAuthentication("slackAuth");
    slackAuth.setAccessToken("YOUR ACCESS TOKEN");

    AdminApi apiInstance = new AdminApi(defaultClient);
    String token = "token_example"; // String | Authentication token. Requires scope: `admin.conversations:write`
    String channelId = "channelId_example"; // String | The channel to be disconnected from some workspaces.
    String leavingTeamIds = "leavingTeamIds_example"; // String | The team to be removed from the channel. Currently only a single team id can be specified.
    try {
      AdminConversationsRenameSchema result = apiInstance.adminConversationsDisconnectShared(token, channelId, leavingTeamIds);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#adminConversationsDisconnectShared");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **token** | **String**| Authentication token. Requires scope: &#x60;admin.conversations:write&#x60; | |
| **channelId** | **String**| The channel to be disconnected from some workspaces. | |
| **leavingTeamIds** | **String**| The team to be removed from the channel. Currently only a single team id can be specified. | [optional] |

### Return type

[**AdminConversationsRenameSchema**](AdminConversationsRenameSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Typical success response |  -  |
| **0** | Typical error response |  -  |

<a name="adminConversationsEkmListOriginalConnectedChannelInfo"></a>
# **adminConversationsEkmListOriginalConnectedChannelInfo**
> DefaultSuccessTemplate adminConversationsEkmListOriginalConnectedChannelInfo(token, channelIds, teamIds, limit, cursor)



List all disconnected channelsâ€”i.e., channels that were once connected to other workspaces and then disconnectedâ€”and the corresponding original channel IDs for key revocation with EKM.

### Example
```java
// Import classes:
import invalidPackageName.ApiClient;
import invalidPackageName.ApiException;
import invalidPackageName.Configuration;
import invalidPackageName.auth.*;
import invalidPackageName.models.*;
import slack.AdminApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://slack.com/api");
    
    // Configure OAuth2 access token for authorization: slackAuth
    OAuth slackAuth = (OAuth) defaultClient.getAuthentication("slackAuth");
    slackAuth.setAccessToken("YOUR ACCESS TOKEN");

    AdminApi apiInstance = new AdminApi(defaultClient);
    String token = "token_example"; // String | Authentication token. Requires scope: `admin.conversations:read`
    String channelIds = "channelIds_example"; // String | A comma-separated list of channels to filter to.
    String teamIds = "teamIds_example"; // String | A comma-separated list of the workspaces to which the channels you would like returned belong.
    Integer limit = 56; // Integer | The maximum number of items to return. Must be between 1 - 1000 both inclusive.
    String cursor = "cursor_example"; // String | Set `cursor` to `next_cursor` returned by the previous call to list items in the next page.
    try {
      DefaultSuccessTemplate result = apiInstance.adminConversationsEkmListOriginalConnectedChannelInfo(token, channelIds, teamIds, limit, cursor);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#adminConversationsEkmListOriginalConnectedChannelInfo");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **token** | **String**| Authentication token. Requires scope: &#x60;admin.conversations:read&#x60; | |
| **channelIds** | **String**| A comma-separated list of channels to filter to. | [optional] |
| **teamIds** | **String**| A comma-separated list of the workspaces to which the channels you would like returned belong. | [optional] |
| **limit** | **Integer**| The maximum number of items to return. Must be between 1 - 1000 both inclusive. | [optional] |
| **cursor** | **String**| Set &#x60;cursor&#x60; to &#x60;next_cursor&#x60; returned by the previous call to list items in the next page. | [optional] |

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Typical success response |  -  |
| **0** | Typical error response |  -  |

<a name="adminConversationsGetConversationPrefs"></a>
# **adminConversationsGetConversationPrefs**
> AdminConversationsGetConversationPrefsSchema adminConversationsGetConversationPrefs(token, channelId)



Get conversation preferences for a public or private channel.

### Example
```java
// Import classes:
import invalidPackageName.ApiClient;
import invalidPackageName.ApiException;
import invalidPackageName.Configuration;
import invalidPackageName.auth.*;
import invalidPackageName.models.*;
import slack.AdminApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://slack.com/api");
    
    // Configure OAuth2 access token for authorization: slackAuth
    OAuth slackAuth = (OAuth) defaultClient.getAuthentication("slackAuth");
    slackAuth.setAccessToken("YOUR ACCESS TOKEN");

    AdminApi apiInstance = new AdminApi(defaultClient);
    String token = "token_example"; // String | Authentication token. Requires scope: `admin.conversations:read`
    String channelId = "channelId_example"; // String | The channel to get preferences for.
    try {
      AdminConversationsGetConversationPrefsSchema result = apiInstance.adminConversationsGetConversationPrefs(token, channelId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#adminConversationsGetConversationPrefs");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **token** | **String**| Authentication token. Requires scope: &#x60;admin.conversations:read&#x60; | |
| **channelId** | **String**| The channel to get preferences for. | |

### Return type

[**AdminConversationsGetConversationPrefsSchema**](AdminConversationsGetConversationPrefsSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Typical success response |  -  |
| **0** | Typical error response |  -  |

<a name="adminConversationsGetTeams"></a>
# **adminConversationsGetTeams**
> AdminConversationsGetTeamsSchema adminConversationsGetTeams(token, channelId, cursor, limit)



Get all the workspaces a given public or private channel is connected to within this Enterprise org.

### Example
```java
// Import classes:
import invalidPackageName.ApiClient;
import invalidPackageName.ApiException;
import invalidPackageName.Configuration;
import invalidPackageName.auth.*;
import invalidPackageName.models.*;
import slack.AdminApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://slack.com/api");
    
    // Configure OAuth2 access token for authorization: slackAuth
    OAuth slackAuth = (OAuth) defaultClient.getAuthentication("slackAuth");
    slackAuth.setAccessToken("YOUR ACCESS TOKEN");

    AdminApi apiInstance = new AdminApi(defaultClient);
    String token = "token_example"; // String | Authentication token. Requires scope: `admin.conversations:read`
    String channelId = "channelId_example"; // String | The channel to determine connected workspaces within the organization for.
    String cursor = "cursor_example"; // String | Set `cursor` to `next_cursor` returned by the previous call to list items in the next page
    Integer limit = 56; // Integer | The maximum number of items to return. Must be between 1 - 1000 both inclusive.
    try {
      AdminConversationsGetTeamsSchema result = apiInstance.adminConversationsGetTeams(token, channelId, cursor, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#adminConversationsGetTeams");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **token** | **String**| Authentication token. Requires scope: &#x60;admin.conversations:read&#x60; | |
| **channelId** | **String**| The channel to determine connected workspaces within the organization for. | |
| **cursor** | **String**| Set &#x60;cursor&#x60; to &#x60;next_cursor&#x60; returned by the previous call to list items in the next page | [optional] |
| **limit** | **Integer**| The maximum number of items to return. Must be between 1 - 1000 both inclusive. | [optional] |

### Return type

[**AdminConversationsGetTeamsSchema**](AdminConversationsGetTeamsSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Typical success response |  -  |
| **0** | Typical error response |  -  |

<a name="adminConversationsInvite"></a>
# **adminConversationsInvite**
> AdminConversationsInviteSchema adminConversationsInvite(token, channelId, userIds)



Invite a user to a public or private channel.

### Example
```java
// Import classes:
import invalidPackageName.ApiClient;
import invalidPackageName.ApiException;
import invalidPackageName.Configuration;
import invalidPackageName.auth.*;
import invalidPackageName.models.*;
import slack.AdminApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://slack.com/api");
    
    // Configure OAuth2 access token for authorization: slackAuth
    OAuth slackAuth = (OAuth) defaultClient.getAuthentication("slackAuth");
    slackAuth.setAccessToken("YOUR ACCESS TOKEN");

    AdminApi apiInstance = new AdminApi(defaultClient);
    String token = "token_example"; // String | Authentication token. Requires scope: `admin.conversations:write`
    String channelId = "channelId_example"; // String | The channel that the users will be invited to.
    String userIds = "userIds_example"; // String | The users to invite.
    try {
      AdminConversationsInviteSchema result = apiInstance.adminConversationsInvite(token, channelId, userIds);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#adminConversationsInvite");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **token** | **String**| Authentication token. Requires scope: &#x60;admin.conversations:write&#x60; | |
| **channelId** | **String**| The channel that the users will be invited to. | |
| **userIds** | **String**| The users to invite. | |

### Return type

[**AdminConversationsInviteSchema**](AdminConversationsInviteSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Typical success response |  -  |
| **0** | Typical error response |  -  |

<a name="adminConversationsRename"></a>
# **adminConversationsRename**
> AdminConversationsRenameSchema1 adminConversationsRename(token, channelId, name)



Rename a public or private channel.

### Example
```java
// Import classes:
import invalidPackageName.ApiClient;
import invalidPackageName.ApiException;
import invalidPackageName.Configuration;
import invalidPackageName.auth.*;
import invalidPackageName.models.*;
import slack.AdminApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://slack.com/api");
    
    // Configure OAuth2 access token for authorization: slackAuth
    OAuth slackAuth = (OAuth) defaultClient.getAuthentication("slackAuth");
    slackAuth.setAccessToken("YOUR ACCESS TOKEN");

    AdminApi apiInstance = new AdminApi(defaultClient);
    String token = "token_example"; // String | Authentication token. Requires scope: `admin.conversations:write`
    String channelId = "channelId_example"; // String | The channel to rename.
    String name = "name_example"; // String | 
    try {
      AdminConversationsRenameSchema1 result = apiInstance.adminConversationsRename(token, channelId, name);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#adminConversationsRename");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **token** | **String**| Authentication token. Requires scope: &#x60;admin.conversations:write&#x60; | |
| **channelId** | **String**| The channel to rename. | |
| **name** | **String**|  | |

### Return type

[**AdminConversationsRenameSchema1**](AdminConversationsRenameSchema1.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Typical success response |  -  |
| **0** | Typical error response |  -  |

<a name="adminConversationsRestrictAccessAddGroup"></a>
# **adminConversationsRestrictAccessAddGroup**
> DefaultSuccessTemplate adminConversationsRestrictAccessAddGroup(channelId, groupId, token, teamId)



Add an allowlist of IDP groups for accessing a channel

### Example
```java
// Import classes:
import invalidPackageName.ApiClient;
import invalidPackageName.ApiException;
import invalidPackageName.Configuration;
import invalidPackageName.auth.*;
import invalidPackageName.models.*;
import slack.AdminApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://slack.com/api");
    
    // Configure OAuth2 access token for authorization: slackAuth
    OAuth slackAuth = (OAuth) defaultClient.getAuthentication("slackAuth");
    slackAuth.setAccessToken("YOUR ACCESS TOKEN");

    AdminApi apiInstance = new AdminApi(defaultClient);
    String channelId = "channelId_example"; // String | The channel to link this group to.
    String groupId = "groupId_example"; // String | The [IDP Group](https://slack.com/help/articles/115001435788-Connect-identity-provider-groups-to-your-Enterprise-Grid-org) ID to be an allowlist for the private channel.
    String token = "token_example"; // String | Authentication token. Requires scope: `admin.conversations:write`
    String teamId = "teamId_example"; // String | The workspace where the channel exists. This argument is required for channels only tied to one workspace, and optional for channels that are shared across an organization.
    try {
      DefaultSuccessTemplate result = apiInstance.adminConversationsRestrictAccessAddGroup(channelId, groupId, token, teamId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#adminConversationsRestrictAccessAddGroup");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **channelId** | **String**| The channel to link this group to. | |
| **groupId** | **String**| The [IDP Group](https://slack.com/help/articles/115001435788-Connect-identity-provider-groups-to-your-Enterprise-Grid-org) ID to be an allowlist for the private channel. | |
| **token** | **String**| Authentication token. Requires scope: &#x60;admin.conversations:write&#x60; | |
| **teamId** | **String**| The workspace where the channel exists. This argument is required for channels only tied to one workspace, and optional for channels that are shared across an organization. | [optional] |

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Typical success response |  -  |
| **0** | Typical error response |  -  |

<a name="adminConversationsRestrictAccessListGroups"></a>
# **adminConversationsRestrictAccessListGroups**
> DefaultSuccessTemplate adminConversationsRestrictAccessListGroups(token, channelId, teamId)



List all IDP Groups linked to a channel

### Example
```java
// Import classes:
import invalidPackageName.ApiClient;
import invalidPackageName.ApiException;
import invalidPackageName.Configuration;
import invalidPackageName.auth.*;
import invalidPackageName.models.*;
import slack.AdminApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://slack.com/api");
    
    // Configure OAuth2 access token for authorization: slackAuth
    OAuth slackAuth = (OAuth) defaultClient.getAuthentication("slackAuth");
    slackAuth.setAccessToken("YOUR ACCESS TOKEN");

    AdminApi apiInstance = new AdminApi(defaultClient);
    String token = "token_example"; // String | Authentication token. Requires scope: `admin.conversations:read`
    String channelId = "channelId_example"; // String | 
    String teamId = "teamId_example"; // String | The workspace where the channel exists. This argument is required for channels only tied to one workspace, and optional for channels that are shared across an organization.
    try {
      DefaultSuccessTemplate result = apiInstance.adminConversationsRestrictAccessListGroups(token, channelId, teamId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#adminConversationsRestrictAccessListGroups");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **token** | **String**| Authentication token. Requires scope: &#x60;admin.conversations:read&#x60; | |
| **channelId** | **String**|  | |
| **teamId** | **String**| The workspace where the channel exists. This argument is required for channels only tied to one workspace, and optional for channels that are shared across an organization. | [optional] |

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Typical success response |  -  |
| **0** | Typical error response |  -  |

<a name="adminConversationsRestrictAccessRemoveGroup"></a>
# **adminConversationsRestrictAccessRemoveGroup**
> DefaultSuccessTemplate adminConversationsRestrictAccessRemoveGroup(channelId, groupId, teamId, token)



Remove a linked IDP group linked from a private channel

### Example
```java
// Import classes:
import invalidPackageName.ApiClient;
import invalidPackageName.ApiException;
import invalidPackageName.Configuration;
import invalidPackageName.auth.*;
import invalidPackageName.models.*;
import slack.AdminApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://slack.com/api");
    
    // Configure OAuth2 access token for authorization: slackAuth
    OAuth slackAuth = (OAuth) defaultClient.getAuthentication("slackAuth");
    slackAuth.setAccessToken("YOUR ACCESS TOKEN");

    AdminApi apiInstance = new AdminApi(defaultClient);
    String channelId = "channelId_example"; // String | The channel to remove the linked group from.
    String groupId = "groupId_example"; // String | The [IDP Group](https://slack.com/help/articles/115001435788-Connect-identity-provider-groups-to-your-Enterprise-Grid-org) ID to remove from the private channel.
    String teamId = "teamId_example"; // String | The workspace where the channel exists. This argument is required for channels only tied to one workspace, and optional for channels that are shared across an organization.
    String token = "token_example"; // String | Authentication token. Requires scope: `admin.conversations:write`
    try {
      DefaultSuccessTemplate result = apiInstance.adminConversationsRestrictAccessRemoveGroup(channelId, groupId, teamId, token);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#adminConversationsRestrictAccessRemoveGroup");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **channelId** | **String**| The channel to remove the linked group from. | |
| **groupId** | **String**| The [IDP Group](https://slack.com/help/articles/115001435788-Connect-identity-provider-groups-to-your-Enterprise-Grid-org) ID to remove from the private channel. | |
| **teamId** | **String**| The workspace where the channel exists. This argument is required for channels only tied to one workspace, and optional for channels that are shared across an organization. | |
| **token** | **String**| Authentication token. Requires scope: &#x60;admin.conversations:write&#x60; | |

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Typical success response |  -  |
| **0** | Typical error response |  -  |

<a name="adminConversationsSearch"></a>
# **adminConversationsSearch**
> AdminConversationsSearchSchema adminConversationsSearch(token, teamIds, query, limit, cursor, searchChannelTypes, sort, sortDir)



Search for public or private channels in an Enterprise organization.

### Example
```java
// Import classes:
import invalidPackageName.ApiClient;
import invalidPackageName.ApiException;
import invalidPackageName.Configuration;
import invalidPackageName.auth.*;
import invalidPackageName.models.*;
import slack.AdminApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://slack.com/api");
    
    // Configure OAuth2 access token for authorization: slackAuth
    OAuth slackAuth = (OAuth) defaultClient.getAuthentication("slackAuth");
    slackAuth.setAccessToken("YOUR ACCESS TOKEN");

    AdminApi apiInstance = new AdminApi(defaultClient);
    String token = "token_example"; // String | Authentication token. Requires scope: `admin.conversations:read`
    String teamIds = "teamIds_example"; // String | Comma separated string of team IDs, signifying the workspaces to search through.
    String query = "query_example"; // String | Name of the the channel to query by.
    Integer limit = 56; // Integer | Maximum number of items to be returned. Must be between 1 - 20 both inclusive. Default is 10.
    String cursor = "cursor_example"; // String | Set `cursor` to `next_cursor` returned by the previous call to list items in the next page.
    String searchChannelTypes = "searchChannelTypes_example"; // String | The type of channel to include or exclude in the search. For example `private` will search private channels, while `private_exclude` will exclude them. For a full list of types, check the [Types section](#types).
    String sort = "sort_example"; // String | Possible values are `relevant` (search ranking based on what we think is closest), `name` (alphabetical), `member_count` (number of users in the channel), and `created` (date channel was created). You can optionally pair this with the `sort_dir` arg to change how it is sorted 
    String sortDir = "sortDir_example"; // String | Sort direction. Possible values are `asc` for ascending order like (1, 2, 3) or (a, b, c), and `desc` for descending order like (3, 2, 1) or (c, b, a)
    try {
      AdminConversationsSearchSchema result = apiInstance.adminConversationsSearch(token, teamIds, query, limit, cursor, searchChannelTypes, sort, sortDir);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#adminConversationsSearch");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **token** | **String**| Authentication token. Requires scope: &#x60;admin.conversations:read&#x60; | |
| **teamIds** | **String**| Comma separated string of team IDs, signifying the workspaces to search through. | [optional] |
| **query** | **String**| Name of the the channel to query by. | [optional] |
| **limit** | **Integer**| Maximum number of items to be returned. Must be between 1 - 20 both inclusive. Default is 10. | [optional] |
| **cursor** | **String**| Set &#x60;cursor&#x60; to &#x60;next_cursor&#x60; returned by the previous call to list items in the next page. | [optional] |
| **searchChannelTypes** | **String**| The type of channel to include or exclude in the search. For example &#x60;private&#x60; will search private channels, while &#x60;private_exclude&#x60; will exclude them. For a full list of types, check the [Types section](#types). | [optional] |
| **sort** | **String**| Possible values are &#x60;relevant&#x60; (search ranking based on what we think is closest), &#x60;name&#x60; (alphabetical), &#x60;member_count&#x60; (number of users in the channel), and &#x60;created&#x60; (date channel was created). You can optionally pair this with the &#x60;sort_dir&#x60; arg to change how it is sorted  | [optional] |
| **sortDir** | **String**| Sort direction. Possible values are &#x60;asc&#x60; for ascending order like (1, 2, 3) or (a, b, c), and &#x60;desc&#x60; for descending order like (3, 2, 1) or (c, b, a) | [optional] |

### Return type

[**AdminConversationsSearchSchema**](AdminConversationsSearchSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Typical success response |  -  |
| **0** | Typical error response |  -  |

<a name="adminConversationsSetConversationPrefs"></a>
# **adminConversationsSetConversationPrefs**
> AdminConversationsSetConversationPrefsSchema adminConversationsSetConversationPrefs(token, channelId, prefs)



Set the posting permissions for a public or private channel.

### Example
```java
// Import classes:
import invalidPackageName.ApiClient;
import invalidPackageName.ApiException;
import invalidPackageName.Configuration;
import invalidPackageName.auth.*;
import invalidPackageName.models.*;
import slack.AdminApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://slack.com/api");
    
    // Configure OAuth2 access token for authorization: slackAuth
    OAuth slackAuth = (OAuth) defaultClient.getAuthentication("slackAuth");
    slackAuth.setAccessToken("YOUR ACCESS TOKEN");

    AdminApi apiInstance = new AdminApi(defaultClient);
    String token = "token_example"; // String | Authentication token. Requires scope: `admin.conversations:write`
    String channelId = "channelId_example"; // String | The channel to set the prefs for
    String prefs = "prefs_example"; // String | The prefs for this channel in a stringified JSON format.
    try {
      AdminConversationsSetConversationPrefsSchema result = apiInstance.adminConversationsSetConversationPrefs(token, channelId, prefs);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#adminConversationsSetConversationPrefs");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **token** | **String**| Authentication token. Requires scope: &#x60;admin.conversations:write&#x60; | |
| **channelId** | **String**| The channel to set the prefs for | |
| **prefs** | **String**| The prefs for this channel in a stringified JSON format. | |

### Return type

[**AdminConversationsSetConversationPrefsSchema**](AdminConversationsSetConversationPrefsSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Typical success response |  -  |
| **0** | Typical error response |  -  |

<a name="adminConversationsSetTeams"></a>
# **adminConversationsSetTeams**
> DefaultSuccessTemplate adminConversationsSetTeams(token, channelId, orgChannel, targetTeamIds, teamId)



Set the workspaces in an Enterprise grid org that connect to a public or private channel.

### Example
```java
// Import classes:
import invalidPackageName.ApiClient;
import invalidPackageName.ApiException;
import invalidPackageName.Configuration;
import invalidPackageName.auth.*;
import invalidPackageName.models.*;
import slack.AdminApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://slack.com/api");
    
    // Configure OAuth2 access token for authorization: slackAuth
    OAuth slackAuth = (OAuth) defaultClient.getAuthentication("slackAuth");
    slackAuth.setAccessToken("YOUR ACCESS TOKEN");

    AdminApi apiInstance = new AdminApi(defaultClient);
    String token = "token_example"; // String | Authentication token. Requires scope: `admin.conversations:write`
    String channelId = "channelId_example"; // String | The encoded `channel_id` to add or remove to workspaces.
    Boolean orgChannel = true; // Boolean | True if channel has to be converted to an org channel
    String targetTeamIds = "targetTeamIds_example"; // String | A comma-separated list of workspaces to which the channel should be shared. Not required if the channel is being shared org-wide.
    String teamId = "teamId_example"; // String | The workspace to which the channel belongs. Omit this argument if the channel is a cross-workspace shared channel.
    try {
      DefaultSuccessTemplate result = apiInstance.adminConversationsSetTeams(token, channelId, orgChannel, targetTeamIds, teamId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#adminConversationsSetTeams");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **token** | **String**| Authentication token. Requires scope: &#x60;admin.conversations:write&#x60; | |
| **channelId** | **String**| The encoded &#x60;channel_id&#x60; to add or remove to workspaces. | |
| **orgChannel** | **Boolean**| True if channel has to be converted to an org channel | [optional] |
| **targetTeamIds** | **String**| A comma-separated list of workspaces to which the channel should be shared. Not required if the channel is being shared org-wide. | [optional] |
| **teamId** | **String**| The workspace to which the channel belongs. Omit this argument if the channel is a cross-workspace shared channel. | [optional] |

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Typical success response |  -  |
| **0** | Typical error response |  -  |

<a name="adminConversationsUnarchive"></a>
# **adminConversationsUnarchive**
> AdminConversationsUnarchiveSchema adminConversationsUnarchive(token, channelId)



Unarchive a public or private channel.

### Example
```java
// Import classes:
import invalidPackageName.ApiClient;
import invalidPackageName.ApiException;
import invalidPackageName.Configuration;
import invalidPackageName.auth.*;
import invalidPackageName.models.*;
import slack.AdminApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://slack.com/api");
    
    // Configure OAuth2 access token for authorization: slackAuth
    OAuth slackAuth = (OAuth) defaultClient.getAuthentication("slackAuth");
    slackAuth.setAccessToken("YOUR ACCESS TOKEN");

    AdminApi apiInstance = new AdminApi(defaultClient);
    String token = "token_example"; // String | Authentication token. Requires scope: `admin.conversations:write`
    String channelId = "channelId_example"; // String | The channel to unarchive.
    try {
      AdminConversationsUnarchiveSchema result = apiInstance.adminConversationsUnarchive(token, channelId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#adminConversationsUnarchive");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **token** | **String**| Authentication token. Requires scope: &#x60;admin.conversations:write&#x60; | |
| **channelId** | **String**| The channel to unarchive. | |

### Return type

[**AdminConversationsUnarchiveSchema**](AdminConversationsUnarchiveSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Typical success response |  -  |
| **0** | Typical error response |  -  |

<a name="adminEmojiAdd"></a>
# **adminEmojiAdd**
> DefaultSuccessTemplate adminEmojiAdd(name, token, url)



Add an emoji.

### Example
```java
// Import classes:
import invalidPackageName.ApiClient;
import invalidPackageName.ApiException;
import invalidPackageName.Configuration;
import invalidPackageName.auth.*;
import invalidPackageName.models.*;
import slack.AdminApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://slack.com/api");
    
    // Configure OAuth2 access token for authorization: slackAuth
    OAuth slackAuth = (OAuth) defaultClient.getAuthentication("slackAuth");
    slackAuth.setAccessToken("YOUR ACCESS TOKEN");

    AdminApi apiInstance = new AdminApi(defaultClient);
    String name = "name_example"; // String | The name of the emoji to be removed. Colons (`:myemoji:`) around the value are not required, although they may be included.
    String token = "token_example"; // String | Authentication token. Requires scope: `admin.teams:write`
    String url = "url_example"; // String | The URL of a file to use as an image for the emoji. Square images under 128KB and with transparent backgrounds work best.
    try {
      DefaultSuccessTemplate result = apiInstance.adminEmojiAdd(name, token, url);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#adminEmojiAdd");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**| The name of the emoji to be removed. Colons (&#x60;:myemoji:&#x60;) around the value are not required, although they may be included. | |
| **token** | **String**| Authentication token. Requires scope: &#x60;admin.teams:write&#x60; | |
| **url** | **String**| The URL of a file to use as an image for the emoji. Square images under 128KB and with transparent backgrounds work best. | |

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Typical success response |  -  |
| **0** | Typical error response |  -  |

<a name="adminEmojiAddAlias"></a>
# **adminEmojiAddAlias**
> DefaultSuccessTemplate adminEmojiAddAlias(aliasFor, name, token)



Add an emoji alias.

### Example
```java
// Import classes:
import invalidPackageName.ApiClient;
import invalidPackageName.ApiException;
import invalidPackageName.Configuration;
import invalidPackageName.auth.*;
import invalidPackageName.models.*;
import slack.AdminApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://slack.com/api");
    
    // Configure OAuth2 access token for authorization: slackAuth
    OAuth slackAuth = (OAuth) defaultClient.getAuthentication("slackAuth");
    slackAuth.setAccessToken("YOUR ACCESS TOKEN");

    AdminApi apiInstance = new AdminApi(defaultClient);
    String aliasFor = "aliasFor_example"; // String | The alias of the emoji.
    String name = "name_example"; // String | The name of the emoji to be aliased. Colons (`:myemoji:`) around the value are not required, although they may be included.
    String token = "token_example"; // String | Authentication token. Requires scope: `admin.teams:write`
    try {
      DefaultSuccessTemplate result = apiInstance.adminEmojiAddAlias(aliasFor, name, token);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#adminEmojiAddAlias");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **aliasFor** | **String**| The alias of the emoji. | |
| **name** | **String**| The name of the emoji to be aliased. Colons (&#x60;:myemoji:&#x60;) around the value are not required, although they may be included. | |
| **token** | **String**| Authentication token. Requires scope: &#x60;admin.teams:write&#x60; | |

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Typical success response |  -  |
| **0** | Typical error response |  -  |

<a name="adminEmojiList"></a>
# **adminEmojiList**
> DefaultSuccessTemplate adminEmojiList(token, cursor, limit)



List emoji for an Enterprise Grid organization.

### Example
```java
// Import classes:
import invalidPackageName.ApiClient;
import invalidPackageName.ApiException;
import invalidPackageName.Configuration;
import invalidPackageName.auth.*;
import invalidPackageName.models.*;
import slack.AdminApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://slack.com/api");
    
    // Configure OAuth2 access token for authorization: slackAuth
    OAuth slackAuth = (OAuth) defaultClient.getAuthentication("slackAuth");
    slackAuth.setAccessToken("YOUR ACCESS TOKEN");

    AdminApi apiInstance = new AdminApi(defaultClient);
    String token = "token_example"; // String | Authentication token. Requires scope: `admin.teams:read`
    String cursor = "cursor_example"; // String | Set `cursor` to `next_cursor` returned by the previous call to list items in the next page
    Integer limit = 56; // Integer | The maximum number of items to return. Must be between 1 - 1000 both inclusive.
    try {
      DefaultSuccessTemplate result = apiInstance.adminEmojiList(token, cursor, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#adminEmojiList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **token** | **String**| Authentication token. Requires scope: &#x60;admin.teams:read&#x60; | |
| **cursor** | **String**| Set &#x60;cursor&#x60; to &#x60;next_cursor&#x60; returned by the previous call to list items in the next page | [optional] |
| **limit** | **Integer**| The maximum number of items to return. Must be between 1 - 1000 both inclusive. | [optional] |

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Typical success response |  -  |
| **0** | Typical error response |  -  |

<a name="adminEmojiRemove"></a>
# **adminEmojiRemove**
> DefaultSuccessTemplate adminEmojiRemove(name, token)



Remove an emoji across an Enterprise Grid organization

### Example
```java
// Import classes:
import invalidPackageName.ApiClient;
import invalidPackageName.ApiException;
import invalidPackageName.Configuration;
import invalidPackageName.auth.*;
import invalidPackageName.models.*;
import slack.AdminApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://slack.com/api");
    
    // Configure OAuth2 access token for authorization: slackAuth
    OAuth slackAuth = (OAuth) defaultClient.getAuthentication("slackAuth");
    slackAuth.setAccessToken("YOUR ACCESS TOKEN");

    AdminApi apiInstance = new AdminApi(defaultClient);
    String name = "name_example"; // String | The name of the emoji to be removed. Colons (`:myemoji:`) around the value are not required, although they may be included.
    String token = "token_example"; // String | Authentication token. Requires scope: `admin.teams:write`
    try {
      DefaultSuccessTemplate result = apiInstance.adminEmojiRemove(name, token);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#adminEmojiRemove");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**| The name of the emoji to be removed. Colons (&#x60;:myemoji:&#x60;) around the value are not required, although they may be included. | |
| **token** | **String**| Authentication token. Requires scope: &#x60;admin.teams:write&#x60; | |

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Typical success response |  -  |
| **0** | Typical error response |  -  |

<a name="adminEmojiRename"></a>
# **adminEmojiRename**
> DefaultSuccessTemplate adminEmojiRename(name, newName, token)



Rename an emoji.

### Example
```java
// Import classes:
import invalidPackageName.ApiClient;
import invalidPackageName.ApiException;
import invalidPackageName.Configuration;
import invalidPackageName.auth.*;
import invalidPackageName.models.*;
import slack.AdminApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://slack.com/api");
    
    // Configure OAuth2 access token for authorization: slackAuth
    OAuth slackAuth = (OAuth) defaultClient.getAuthentication("slackAuth");
    slackAuth.setAccessToken("YOUR ACCESS TOKEN");

    AdminApi apiInstance = new AdminApi(defaultClient);
    String name = "name_example"; // String | The name of the emoji to be renamed. Colons (`:myemoji:`) around the value are not required, although they may be included.
    String newName = "newName_example"; // String | The new name of the emoji.
    String token = "token_example"; // String | Authentication token. Requires scope: `admin.teams:write`
    try {
      DefaultSuccessTemplate result = apiInstance.adminEmojiRename(name, newName, token);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#adminEmojiRename");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**| The name of the emoji to be renamed. Colons (&#x60;:myemoji:&#x60;) around the value are not required, although they may be included. | |
| **newName** | **String**| The new name of the emoji. | |
| **token** | **String**| Authentication token. Requires scope: &#x60;admin.teams:write&#x60; | |

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Typical success response |  -  |
| **0** | Typical error response |  -  |

<a name="adminInviteRequestsApprove"></a>
# **adminInviteRequestsApprove**
> DefaultSuccessTemplate adminInviteRequestsApprove(token, adminInviteRequestsApproveRequest)



Approve a workspace invite request.

### Example
```java
// Import classes:
import invalidPackageName.ApiClient;
import invalidPackageName.ApiException;
import invalidPackageName.Configuration;
import invalidPackageName.auth.*;
import invalidPackageName.models.*;
import slack.AdminApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://slack.com/api");
    
    // Configure OAuth2 access token for authorization: slackAuth
    OAuth slackAuth = (OAuth) defaultClient.getAuthentication("slackAuth");
    slackAuth.setAccessToken("YOUR ACCESS TOKEN");

    AdminApi apiInstance = new AdminApi(defaultClient);
    String token = "token_example"; // String | Authentication token. Requires scope: `admin.invites:write`
    AdminInviteRequestsApproveRequest adminInviteRequestsApproveRequest = new AdminInviteRequestsApproveRequest(); // AdminInviteRequestsApproveRequest | 
    try {
      DefaultSuccessTemplate result = apiInstance.adminInviteRequestsApprove(token, adminInviteRequestsApproveRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#adminInviteRequestsApprove");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **token** | **String**| Authentication token. Requires scope: &#x60;admin.invites:write&#x60; | |
| **adminInviteRequestsApproveRequest** | [**AdminInviteRequestsApproveRequest**](AdminInviteRequestsApproveRequest.md)|  | [optional] |

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Typical success response |  -  |
| **0** | Typical error response |  -  |

<a name="adminInviteRequestsApprovedList"></a>
# **adminInviteRequestsApprovedList**
> DefaultSuccessTemplate adminInviteRequestsApprovedList(token, teamId, cursor, limit)



List all approved workspace invite requests.

### Example
```java
// Import classes:
import invalidPackageName.ApiClient;
import invalidPackageName.ApiException;
import invalidPackageName.Configuration;
import invalidPackageName.auth.*;
import invalidPackageName.models.*;
import slack.AdminApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://slack.com/api");
    
    // Configure OAuth2 access token for authorization: slackAuth
    OAuth slackAuth = (OAuth) defaultClient.getAuthentication("slackAuth");
    slackAuth.setAccessToken("YOUR ACCESS TOKEN");

    AdminApi apiInstance = new AdminApi(defaultClient);
    String token = "token_example"; // String | Authentication token. Requires scope: `admin.invites:read`
    String teamId = "teamId_example"; // String | ID for the workspace where the invite requests were made.
    String cursor = "cursor_example"; // String | Value of the `next_cursor` field sent as part of the previous API response
    Integer limit = 56; // Integer | The number of results that will be returned by the API on each invocation. Must be between 1 - 1000, both inclusive
    try {
      DefaultSuccessTemplate result = apiInstance.adminInviteRequestsApprovedList(token, teamId, cursor, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#adminInviteRequestsApprovedList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **token** | **String**| Authentication token. Requires scope: &#x60;admin.invites:read&#x60; | |
| **teamId** | **String**| ID for the workspace where the invite requests were made. | [optional] |
| **cursor** | **String**| Value of the &#x60;next_cursor&#x60; field sent as part of the previous API response | [optional] |
| **limit** | **Integer**| The number of results that will be returned by the API on each invocation. Must be between 1 - 1000, both inclusive | [optional] |

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Typical success response |  -  |
| **0** | Typical error response |  -  |

<a name="adminInviteRequestsDeniedList"></a>
# **adminInviteRequestsDeniedList**
> DefaultSuccessTemplate adminInviteRequestsDeniedList(token, teamId, cursor, limit)



List all denied workspace invite requests.

### Example
```java
// Import classes:
import invalidPackageName.ApiClient;
import invalidPackageName.ApiException;
import invalidPackageName.Configuration;
import invalidPackageName.auth.*;
import invalidPackageName.models.*;
import slack.AdminApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://slack.com/api");
    
    // Configure OAuth2 access token for authorization: slackAuth
    OAuth slackAuth = (OAuth) defaultClient.getAuthentication("slackAuth");
    slackAuth.setAccessToken("YOUR ACCESS TOKEN");

    AdminApi apiInstance = new AdminApi(defaultClient);
    String token = "token_example"; // String | Authentication token. Requires scope: `admin.invites:read`
    String teamId = "teamId_example"; // String | ID for the workspace where the invite requests were made.
    String cursor = "cursor_example"; // String | Value of the `next_cursor` field sent as part of the previous api response
    Integer limit = 56; // Integer | The number of results that will be returned by the API on each invocation. Must be between 1 - 1000 both inclusive
    try {
      DefaultSuccessTemplate result = apiInstance.adminInviteRequestsDeniedList(token, teamId, cursor, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#adminInviteRequestsDeniedList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **token** | **String**| Authentication token. Requires scope: &#x60;admin.invites:read&#x60; | |
| **teamId** | **String**| ID for the workspace where the invite requests were made. | [optional] |
| **cursor** | **String**| Value of the &#x60;next_cursor&#x60; field sent as part of the previous api response | [optional] |
| **limit** | **Integer**| The number of results that will be returned by the API on each invocation. Must be between 1 - 1000 both inclusive | [optional] |

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Typical success response |  -  |
| **0** | Typical error response |  -  |

<a name="adminInviteRequestsDeny"></a>
# **adminInviteRequestsDeny**
> DefaultSuccessTemplate adminInviteRequestsDeny(token, adminInviteRequestsApproveRequest)



Deny a workspace invite request.

### Example
```java
// Import classes:
import invalidPackageName.ApiClient;
import invalidPackageName.ApiException;
import invalidPackageName.Configuration;
import invalidPackageName.auth.*;
import invalidPackageName.models.*;
import slack.AdminApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://slack.com/api");
    
    // Configure OAuth2 access token for authorization: slackAuth
    OAuth slackAuth = (OAuth) defaultClient.getAuthentication("slackAuth");
    slackAuth.setAccessToken("YOUR ACCESS TOKEN");

    AdminApi apiInstance = new AdminApi(defaultClient);
    String token = "token_example"; // String | Authentication token. Requires scope: `admin.invites:write`
    AdminInviteRequestsApproveRequest adminInviteRequestsApproveRequest = new AdminInviteRequestsApproveRequest(); // AdminInviteRequestsApproveRequest | 
    try {
      DefaultSuccessTemplate result = apiInstance.adminInviteRequestsDeny(token, adminInviteRequestsApproveRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#adminInviteRequestsDeny");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **token** | **String**| Authentication token. Requires scope: &#x60;admin.invites:write&#x60; | |
| **adminInviteRequestsApproveRequest** | [**AdminInviteRequestsApproveRequest**](AdminInviteRequestsApproveRequest.md)|  | [optional] |

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Typical success response |  -  |
| **0** | Typical error response |  -  |

<a name="adminInviteRequestsList"></a>
# **adminInviteRequestsList**
> DefaultSuccessTemplate adminInviteRequestsList(token, teamId, cursor, limit)



List all pending workspace invite requests.

### Example
```java
// Import classes:
import invalidPackageName.ApiClient;
import invalidPackageName.ApiException;
import invalidPackageName.Configuration;
import invalidPackageName.auth.*;
import invalidPackageName.models.*;
import slack.AdminApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://slack.com/api");
    
    // Configure OAuth2 access token for authorization: slackAuth
    OAuth slackAuth = (OAuth) defaultClient.getAuthentication("slackAuth");
    slackAuth.setAccessToken("YOUR ACCESS TOKEN");

    AdminApi apiInstance = new AdminApi(defaultClient);
    String token = "token_example"; // String | Authentication token. Requires scope: `admin.invites:read`
    String teamId = "teamId_example"; // String | ID for the workspace where the invite requests were made.
    String cursor = "cursor_example"; // String | Value of the `next_cursor` field sent as part of the previous API response
    Integer limit = 56; // Integer | The number of results that will be returned by the API on each invocation. Must be between 1 - 1000, both inclusive
    try {
      DefaultSuccessTemplate result = apiInstance.adminInviteRequestsList(token, teamId, cursor, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#adminInviteRequestsList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **token** | **String**| Authentication token. Requires scope: &#x60;admin.invites:read&#x60; | |
| **teamId** | **String**| ID for the workspace where the invite requests were made. | [optional] |
| **cursor** | **String**| Value of the &#x60;next_cursor&#x60; field sent as part of the previous API response | [optional] |
| **limit** | **Integer**| The number of results that will be returned by the API on each invocation. Must be between 1 - 1000, both inclusive | [optional] |

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Typical success response |  -  |
| **0** | Typical error response |  -  |

<a name="adminTeamsAdminsList"></a>
# **adminTeamsAdminsList**
> DefaultSuccessTemplate adminTeamsAdminsList(token, teamId, limit, cursor)



List all of the admins on a given workspace.

### Example
```java
// Import classes:
import invalidPackageName.ApiClient;
import invalidPackageName.ApiException;
import invalidPackageName.Configuration;
import invalidPackageName.auth.*;
import invalidPackageName.models.*;
import slack.AdminApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://slack.com/api");
    
    // Configure OAuth2 access token for authorization: slackAuth
    OAuth slackAuth = (OAuth) defaultClient.getAuthentication("slackAuth");
    slackAuth.setAccessToken("YOUR ACCESS TOKEN");

    AdminApi apiInstance = new AdminApi(defaultClient);
    String token = "token_example"; // String | Authentication token. Requires scope: `admin.teams:read`
    String teamId = "teamId_example"; // String | 
    Integer limit = 56; // Integer | The maximum number of items to return.
    String cursor = "cursor_example"; // String | Set `cursor` to `next_cursor` returned by the previous call to list items in the next page.
    try {
      DefaultSuccessTemplate result = apiInstance.adminTeamsAdminsList(token, teamId, limit, cursor);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#adminTeamsAdminsList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **token** | **String**| Authentication token. Requires scope: &#x60;admin.teams:read&#x60; | |
| **teamId** | **String**|  | |
| **limit** | **Integer**| The maximum number of items to return. | [optional] |
| **cursor** | **String**| Set &#x60;cursor&#x60; to &#x60;next_cursor&#x60; returned by the previous call to list items in the next page. | [optional] |

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Typical success response |  -  |
| **0** | Typical error response |  -  |

<a name="adminTeamsCreate"></a>
# **adminTeamsCreate**
> DefaultSuccessTemplate adminTeamsCreate(token, teamDomain, teamName, teamDescription, teamDiscoverability)



Create an Enterprise team.

### Example
```java
// Import classes:
import invalidPackageName.ApiClient;
import invalidPackageName.ApiException;
import invalidPackageName.Configuration;
import invalidPackageName.auth.*;
import invalidPackageName.models.*;
import slack.AdminApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://slack.com/api");
    
    // Configure OAuth2 access token for authorization: slackAuth
    OAuth slackAuth = (OAuth) defaultClient.getAuthentication("slackAuth");
    slackAuth.setAccessToken("YOUR ACCESS TOKEN");

    AdminApi apiInstance = new AdminApi(defaultClient);
    String token = "token_example"; // String | Authentication token. Requires scope: `admin.teams:write`
    String teamDomain = "teamDomain_example"; // String | Team domain (for example, slacksoftballteam).
    String teamName = "teamName_example"; // String | Team name (for example, Slack Softball Team).
    String teamDescription = "teamDescription_example"; // String | Description for the team.
    String teamDiscoverability = "teamDiscoverability_example"; // String | Who can join the team. A team's discoverability can be `open`, `closed`, `invite_only`, or `unlisted`.
    try {
      DefaultSuccessTemplate result = apiInstance.adminTeamsCreate(token, teamDomain, teamName, teamDescription, teamDiscoverability);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#adminTeamsCreate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **token** | **String**| Authentication token. Requires scope: &#x60;admin.teams:write&#x60; | |
| **teamDomain** | **String**| Team domain (for example, slacksoftballteam). | |
| **teamName** | **String**| Team name (for example, Slack Softball Team). | |
| **teamDescription** | **String**| Description for the team. | [optional] |
| **teamDiscoverability** | **String**| Who can join the team. A team&#39;s discoverability can be &#x60;open&#x60;, &#x60;closed&#x60;, &#x60;invite_only&#x60;, or &#x60;unlisted&#x60;. | [optional] |

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Typical success response |  -  |
| **0** | Typical error response |  -  |

<a name="adminTeamsList"></a>
# **adminTeamsList**
> DefaultSuccessTemplate adminTeamsList(token, limit, cursor)



List all teams on an Enterprise organization

### Example
```java
// Import classes:
import invalidPackageName.ApiClient;
import invalidPackageName.ApiException;
import invalidPackageName.Configuration;
import invalidPackageName.auth.*;
import invalidPackageName.models.*;
import slack.AdminApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://slack.com/api");
    
    // Configure OAuth2 access token for authorization: slackAuth
    OAuth slackAuth = (OAuth) defaultClient.getAuthentication("slackAuth");
    slackAuth.setAccessToken("YOUR ACCESS TOKEN");

    AdminApi apiInstance = new AdminApi(defaultClient);
    String token = "token_example"; // String | Authentication token. Requires scope: `admin.teams:read`
    Integer limit = 56; // Integer | The maximum number of items to return. Must be between 1 - 100 both inclusive.
    String cursor = "cursor_example"; // String | Set `cursor` to `next_cursor` returned by the previous call to list items in the next page.
    try {
      DefaultSuccessTemplate result = apiInstance.adminTeamsList(token, limit, cursor);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#adminTeamsList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **token** | **String**| Authentication token. Requires scope: &#x60;admin.teams:read&#x60; | |
| **limit** | **Integer**| The maximum number of items to return. Must be between 1 - 100 both inclusive. | [optional] |
| **cursor** | **String**| Set &#x60;cursor&#x60; to &#x60;next_cursor&#x60; returned by the previous call to list items in the next page. | [optional] |

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Typical success response |  -  |
| **0** | Typical error response |  -  |

<a name="adminTeamsOwnersList"></a>
# **adminTeamsOwnersList**
> DefaultSuccessTemplate adminTeamsOwnersList(token, teamId, limit, cursor)



List all of the owners on a given workspace.

### Example
```java
// Import classes:
import invalidPackageName.ApiClient;
import invalidPackageName.ApiException;
import invalidPackageName.Configuration;
import invalidPackageName.auth.*;
import invalidPackageName.models.*;
import slack.AdminApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://slack.com/api");
    
    // Configure OAuth2 access token for authorization: slackAuth
    OAuth slackAuth = (OAuth) defaultClient.getAuthentication("slackAuth");
    slackAuth.setAccessToken("YOUR ACCESS TOKEN");

    AdminApi apiInstance = new AdminApi(defaultClient);
    String token = "token_example"; // String | Authentication token. Requires scope: `admin.teams:read`
    String teamId = "teamId_example"; // String | 
    Integer limit = 56; // Integer | The maximum number of items to return. Must be between 1 - 1000 both inclusive.
    String cursor = "cursor_example"; // String | Set `cursor` to `next_cursor` returned by the previous call to list items in the next page.
    try {
      DefaultSuccessTemplate result = apiInstance.adminTeamsOwnersList(token, teamId, limit, cursor);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#adminTeamsOwnersList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **token** | **String**| Authentication token. Requires scope: &#x60;admin.teams:read&#x60; | |
| **teamId** | **String**|  | |
| **limit** | **Integer**| The maximum number of items to return. Must be between 1 - 1000 both inclusive. | [optional] |
| **cursor** | **String**| Set &#x60;cursor&#x60; to &#x60;next_cursor&#x60; returned by the previous call to list items in the next page. | [optional] |

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Typical success response |  -  |
| **0** | Typical error response |  -  |

<a name="adminTeamsSettingsInfo"></a>
# **adminTeamsSettingsInfo**
> DefaultSuccessTemplate adminTeamsSettingsInfo(token, teamId)



Fetch information about settings in a workspace

### Example
```java
// Import classes:
import invalidPackageName.ApiClient;
import invalidPackageName.ApiException;
import invalidPackageName.Configuration;
import invalidPackageName.auth.*;
import invalidPackageName.models.*;
import slack.AdminApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://slack.com/api");
    
    // Configure OAuth2 access token for authorization: slackAuth
    OAuth slackAuth = (OAuth) defaultClient.getAuthentication("slackAuth");
    slackAuth.setAccessToken("YOUR ACCESS TOKEN");

    AdminApi apiInstance = new AdminApi(defaultClient);
    String token = "token_example"; // String | Authentication token. Requires scope: `admin.teams:read`
    String teamId = "teamId_example"; // String | 
    try {
      DefaultSuccessTemplate result = apiInstance.adminTeamsSettingsInfo(token, teamId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#adminTeamsSettingsInfo");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **token** | **String**| Authentication token. Requires scope: &#x60;admin.teams:read&#x60; | |
| **teamId** | **String**|  | |

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Typical success response |  -  |
| **0** | Typical error response |  -  |

<a name="adminTeamsSettingsSetDefaultChannels"></a>
# **adminTeamsSettingsSetDefaultChannels**
> DefaultSuccessTemplate adminTeamsSettingsSetDefaultChannels(channelIds, teamId, token)



Set the default channels of a workspace.

### Example
```java
// Import classes:
import invalidPackageName.ApiClient;
import invalidPackageName.ApiException;
import invalidPackageName.Configuration;
import invalidPackageName.auth.*;
import invalidPackageName.models.*;
import slack.AdminApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://slack.com/api");
    
    // Configure OAuth2 access token for authorization: slackAuth
    OAuth slackAuth = (OAuth) defaultClient.getAuthentication("slackAuth");
    slackAuth.setAccessToken("YOUR ACCESS TOKEN");

    AdminApi apiInstance = new AdminApi(defaultClient);
    String channelIds = "channelIds_example"; // String | An array of channel IDs.
    String teamId = "teamId_example"; // String | ID for the workspace to set the default channel for.
    String token = "token_example"; // String | Authentication token. Requires scope: `admin.teams:write`
    try {
      DefaultSuccessTemplate result = apiInstance.adminTeamsSettingsSetDefaultChannels(channelIds, teamId, token);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#adminTeamsSettingsSetDefaultChannels");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **channelIds** | **String**| An array of channel IDs. | |
| **teamId** | **String**| ID for the workspace to set the default channel for. | |
| **token** | **String**| Authentication token. Requires scope: &#x60;admin.teams:write&#x60; | |

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Typical success response |  -  |
| **0** | Typical error response |  -  |

<a name="adminTeamsSettingsSetDescription"></a>
# **adminTeamsSettingsSetDescription**
> DefaultSuccessTemplate adminTeamsSettingsSetDescription(token, description, teamId)



Set the description of a given workspace.

### Example
```java
// Import classes:
import invalidPackageName.ApiClient;
import invalidPackageName.ApiException;
import invalidPackageName.Configuration;
import invalidPackageName.auth.*;
import invalidPackageName.models.*;
import slack.AdminApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://slack.com/api");
    
    // Configure OAuth2 access token for authorization: slackAuth
    OAuth slackAuth = (OAuth) defaultClient.getAuthentication("slackAuth");
    slackAuth.setAccessToken("YOUR ACCESS TOKEN");

    AdminApi apiInstance = new AdminApi(defaultClient);
    String token = "token_example"; // String | Authentication token. Requires scope: `admin.teams:write`
    String description = "description_example"; // String | The new description for the workspace.
    String teamId = "teamId_example"; // String | ID for the workspace to set the description for.
    try {
      DefaultSuccessTemplate result = apiInstance.adminTeamsSettingsSetDescription(token, description, teamId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#adminTeamsSettingsSetDescription");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **token** | **String**| Authentication token. Requires scope: &#x60;admin.teams:write&#x60; | |
| **description** | **String**| The new description for the workspace. | |
| **teamId** | **String**| ID for the workspace to set the description for. | |

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Typical success response |  -  |
| **0** | Typical error response |  -  |

<a name="adminTeamsSettingsSetDiscoverability"></a>
# **adminTeamsSettingsSetDiscoverability**
> DefaultSuccessTemplate adminTeamsSettingsSetDiscoverability(token, discoverability, teamId)



An API method that allows admins to set the discoverability of a given workspace

### Example
```java
// Import classes:
import invalidPackageName.ApiClient;
import invalidPackageName.ApiException;
import invalidPackageName.Configuration;
import invalidPackageName.auth.*;
import invalidPackageName.models.*;
import slack.AdminApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://slack.com/api");
    
    // Configure OAuth2 access token for authorization: slackAuth
    OAuth slackAuth = (OAuth) defaultClient.getAuthentication("slackAuth");
    slackAuth.setAccessToken("YOUR ACCESS TOKEN");

    AdminApi apiInstance = new AdminApi(defaultClient);
    String token = "token_example"; // String | Authentication token. Requires scope: `admin.teams:write`
    String discoverability = "discoverability_example"; // String | This workspace's discovery setting. It must be set to one of `open`, `invite_only`, `closed`, or `unlisted`.
    String teamId = "teamId_example"; // String | The ID of the workspace to set discoverability on.
    try {
      DefaultSuccessTemplate result = apiInstance.adminTeamsSettingsSetDiscoverability(token, discoverability, teamId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#adminTeamsSettingsSetDiscoverability");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **token** | **String**| Authentication token. Requires scope: &#x60;admin.teams:write&#x60; | |
| **discoverability** | **String**| This workspace&#39;s discovery setting. It must be set to one of &#x60;open&#x60;, &#x60;invite_only&#x60;, &#x60;closed&#x60;, or &#x60;unlisted&#x60;. | |
| **teamId** | **String**| The ID of the workspace to set discoverability on. | |

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Typical success response |  -  |
| **0** | Typical error response |  -  |

<a name="adminTeamsSettingsSetIcon"></a>
# **adminTeamsSettingsSetIcon**
> DefaultSuccessTemplate adminTeamsSettingsSetIcon(imageUrl, teamId, token)



Sets the icon of a workspace.

### Example
```java
// Import classes:
import invalidPackageName.ApiClient;
import invalidPackageName.ApiException;
import invalidPackageName.Configuration;
import invalidPackageName.auth.*;
import invalidPackageName.models.*;
import slack.AdminApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://slack.com/api");
    
    // Configure OAuth2 access token for authorization: slackAuth
    OAuth slackAuth = (OAuth) defaultClient.getAuthentication("slackAuth");
    slackAuth.setAccessToken("YOUR ACCESS TOKEN");

    AdminApi apiInstance = new AdminApi(defaultClient);
    String imageUrl = "imageUrl_example"; // String | Image URL for the icon
    String teamId = "teamId_example"; // String | ID for the workspace to set the icon for.
    String token = "token_example"; // String | Authentication token. Requires scope: `admin.teams:write`
    try {
      DefaultSuccessTemplate result = apiInstance.adminTeamsSettingsSetIcon(imageUrl, teamId, token);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#adminTeamsSettingsSetIcon");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **imageUrl** | **String**| Image URL for the icon | |
| **teamId** | **String**| ID for the workspace to set the icon for. | |
| **token** | **String**| Authentication token. Requires scope: &#x60;admin.teams:write&#x60; | |

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Typical success response |  -  |
| **0** | Typical error response |  -  |

<a name="adminTeamsSettingsSetName"></a>
# **adminTeamsSettingsSetName**
> DefaultSuccessTemplate adminTeamsSettingsSetName(token, name, teamId)



Set the name of a given workspace.

### Example
```java
// Import classes:
import invalidPackageName.ApiClient;
import invalidPackageName.ApiException;
import invalidPackageName.Configuration;
import invalidPackageName.auth.*;
import invalidPackageName.models.*;
import slack.AdminApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://slack.com/api");
    
    // Configure OAuth2 access token for authorization: slackAuth
    OAuth slackAuth = (OAuth) defaultClient.getAuthentication("slackAuth");
    slackAuth.setAccessToken("YOUR ACCESS TOKEN");

    AdminApi apiInstance = new AdminApi(defaultClient);
    String token = "token_example"; // String | Authentication token. Requires scope: `admin.teams:write`
    String name = "name_example"; // String | The new name of the workspace.
    String teamId = "teamId_example"; // String | ID for the workspace to set the name for.
    try {
      DefaultSuccessTemplate result = apiInstance.adminTeamsSettingsSetName(token, name, teamId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#adminTeamsSettingsSetName");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **token** | **String**| Authentication token. Requires scope: &#x60;admin.teams:write&#x60; | |
| **name** | **String**| The new name of the workspace. | |
| **teamId** | **String**| ID for the workspace to set the name for. | |

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Typical success response |  -  |
| **0** | Typical error response |  -  |

<a name="adminUsergroupsAddChannels"></a>
# **adminUsergroupsAddChannels**
> DefaultSuccessTemplate adminUsergroupsAddChannels(token, channelIds, usergroupId, teamId)



Add one or more default channels to an IDP group.

### Example
```java
// Import classes:
import invalidPackageName.ApiClient;
import invalidPackageName.ApiException;
import invalidPackageName.Configuration;
import invalidPackageName.auth.*;
import invalidPackageName.models.*;
import slack.AdminApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://slack.com/api");
    
    // Configure OAuth2 access token for authorization: slackAuth
    OAuth slackAuth = (OAuth) defaultClient.getAuthentication("slackAuth");
    slackAuth.setAccessToken("YOUR ACCESS TOKEN");

    AdminApi apiInstance = new AdminApi(defaultClient);
    String token = "token_example"; // String | Authentication token. Requires scope: `admin.usergroups:write`
    String channelIds = "channelIds_example"; // String | Comma separated string of channel IDs.
    String usergroupId = "usergroupId_example"; // String | ID of the IDP group to add default channels for.
    String teamId = "teamId_example"; // String | The workspace to add default channels in.
    try {
      DefaultSuccessTemplate result = apiInstance.adminUsergroupsAddChannels(token, channelIds, usergroupId, teamId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#adminUsergroupsAddChannels");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **token** | **String**| Authentication token. Requires scope: &#x60;admin.usergroups:write&#x60; | |
| **channelIds** | **String**| Comma separated string of channel IDs. | |
| **usergroupId** | **String**| ID of the IDP group to add default channels for. | |
| **teamId** | **String**| The workspace to add default channels in. | [optional] |

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Typical success response |  -  |
| **0** | Typical error response if the token provided is not associated with an Org Admin or Owner |  -  |

<a name="adminUsergroupsAddTeams"></a>
# **adminUsergroupsAddTeams**
> DefaultSuccessTemplate adminUsergroupsAddTeams(token, teamIds, usergroupId, autoProvision)



Associate one or more default workspaces with an organization-wide IDP group.

### Example
```java
// Import classes:
import invalidPackageName.ApiClient;
import invalidPackageName.ApiException;
import invalidPackageName.Configuration;
import invalidPackageName.auth.*;
import invalidPackageName.models.*;
import slack.AdminApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://slack.com/api");
    
    // Configure OAuth2 access token for authorization: slackAuth
    OAuth slackAuth = (OAuth) defaultClient.getAuthentication("slackAuth");
    slackAuth.setAccessToken("YOUR ACCESS TOKEN");

    AdminApi apiInstance = new AdminApi(defaultClient);
    String token = "token_example"; // String | Authentication token. Requires scope: `admin.teams:write`
    String teamIds = "teamIds_example"; // String | A comma separated list of encoded team (workspace) IDs. Each workspace *MUST* belong to the organization associated with the token.
    String usergroupId = "usergroupId_example"; // String | An encoded usergroup (IDP Group) ID.
    Boolean autoProvision = true; // Boolean | When `true`, this method automatically creates new workspace accounts for the IDP group members.
    try {
      DefaultSuccessTemplate result = apiInstance.adminUsergroupsAddTeams(token, teamIds, usergroupId, autoProvision);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#adminUsergroupsAddTeams");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **token** | **String**| Authentication token. Requires scope: &#x60;admin.teams:write&#x60; | |
| **teamIds** | **String**| A comma separated list of encoded team (workspace) IDs. Each workspace *MUST* belong to the organization associated with the token. | |
| **usergroupId** | **String**| An encoded usergroup (IDP Group) ID. | |
| **autoProvision** | **Boolean**| When &#x60;true&#x60;, this method automatically creates new workspace accounts for the IDP group members. | [optional] |

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Typical success response |  -  |
| **0** | Typical error response |  -  |

<a name="adminUsergroupsListChannels"></a>
# **adminUsergroupsListChannels**
> DefaultSuccessTemplate adminUsergroupsListChannels(token, usergroupId, teamId, includeNumMembers)



List the channels linked to an org-level IDP group (user group).

### Example
```java
// Import classes:
import invalidPackageName.ApiClient;
import invalidPackageName.ApiException;
import invalidPackageName.Configuration;
import invalidPackageName.auth.*;
import invalidPackageName.models.*;
import slack.AdminApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://slack.com/api");
    
    // Configure OAuth2 access token for authorization: slackAuth
    OAuth slackAuth = (OAuth) defaultClient.getAuthentication("slackAuth");
    slackAuth.setAccessToken("YOUR ACCESS TOKEN");

    AdminApi apiInstance = new AdminApi(defaultClient);
    String token = "token_example"; // String | Authentication token. Requires scope: `admin.usergroups:read`
    String usergroupId = "usergroupId_example"; // String | ID of the IDP group to list default channels for.
    String teamId = "teamId_example"; // String | ID of the the workspace.
    Boolean includeNumMembers = true; // Boolean | Flag to include or exclude the count of members per channel.
    try {
      DefaultSuccessTemplate result = apiInstance.adminUsergroupsListChannels(token, usergroupId, teamId, includeNumMembers);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#adminUsergroupsListChannels");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **token** | **String**| Authentication token. Requires scope: &#x60;admin.usergroups:read&#x60; | |
| **usergroupId** | **String**| ID of the IDP group to list default channels for. | |
| **teamId** | **String**| ID of the the workspace. | [optional] |
| **includeNumMembers** | **Boolean**| Flag to include or exclude the count of members per channel. | [optional] |

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Typical success response |  -  |
| **0** | Typical error response if the token provided is not associated with an Org Admin or Owner |  -  |

<a name="adminUsergroupsRemoveChannels"></a>
# **adminUsergroupsRemoveChannels**
> DefaultSuccessTemplate adminUsergroupsRemoveChannels(token, channelIds, usergroupId)



Remove one or more default channels from an org-level IDP group (user group).

### Example
```java
// Import classes:
import invalidPackageName.ApiClient;
import invalidPackageName.ApiException;
import invalidPackageName.Configuration;
import invalidPackageName.auth.*;
import invalidPackageName.models.*;
import slack.AdminApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://slack.com/api");
    
    // Configure OAuth2 access token for authorization: slackAuth
    OAuth slackAuth = (OAuth) defaultClient.getAuthentication("slackAuth");
    slackAuth.setAccessToken("YOUR ACCESS TOKEN");

    AdminApi apiInstance = new AdminApi(defaultClient);
    String token = "token_example"; // String | Authentication token. Requires scope: `admin.usergroups:write`
    String channelIds = "channelIds_example"; // String | Comma-separated string of channel IDs
    String usergroupId = "usergroupId_example"; // String | ID of the IDP Group
    try {
      DefaultSuccessTemplate result = apiInstance.adminUsergroupsRemoveChannels(token, channelIds, usergroupId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#adminUsergroupsRemoveChannels");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **token** | **String**| Authentication token. Requires scope: &#x60;admin.usergroups:write&#x60; | |
| **channelIds** | **String**| Comma-separated string of channel IDs | |
| **usergroupId** | **String**| ID of the IDP Group | |

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Typical success response |  -  |
| **0** | Typical error response if the token provided is not associated with an Org Admin or Owner |  -  |

<a name="adminUsersAssign"></a>
# **adminUsersAssign**
> DefaultSuccessTemplate adminUsersAssign(token, teamId, userId, channelIds, isRestricted, isUltraRestricted)



Add an Enterprise user to a workspace.

### Example
```java
// Import classes:
import invalidPackageName.ApiClient;
import invalidPackageName.ApiException;
import invalidPackageName.Configuration;
import invalidPackageName.auth.*;
import invalidPackageName.models.*;
import slack.AdminApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://slack.com/api");
    
    // Configure OAuth2 access token for authorization: slackAuth
    OAuth slackAuth = (OAuth) defaultClient.getAuthentication("slackAuth");
    slackAuth.setAccessToken("YOUR ACCESS TOKEN");

    AdminApi apiInstance = new AdminApi(defaultClient);
    String token = "token_example"; // String | Authentication token. Requires scope: `admin.users:write`
    String teamId = "teamId_example"; // String | The ID (`T1234`) of the workspace.
    String userId = "userId_example"; // String | The ID of the user to add to the workspace.
    String channelIds = "channelIds_example"; // String | Comma separated values of channel IDs to add user in the new workspace.
    Boolean isRestricted = true; // Boolean | True if user should be added to the workspace as a guest.
    Boolean isUltraRestricted = true; // Boolean | True if user should be added to the workspace as a single-channel guest.
    try {
      DefaultSuccessTemplate result = apiInstance.adminUsersAssign(token, teamId, userId, channelIds, isRestricted, isUltraRestricted);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#adminUsersAssign");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **token** | **String**| Authentication token. Requires scope: &#x60;admin.users:write&#x60; | |
| **teamId** | **String**| The ID (&#x60;T1234&#x60;) of the workspace. | |
| **userId** | **String**| The ID of the user to add to the workspace. | |
| **channelIds** | **String**| Comma separated values of channel IDs to add user in the new workspace. | [optional] |
| **isRestricted** | **Boolean**| True if user should be added to the workspace as a guest. | [optional] |
| **isUltraRestricted** | **Boolean**| True if user should be added to the workspace as a single-channel guest. | [optional] |

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Typical success response |  -  |
| **0** | Typical error response |  -  |

<a name="adminUsersInvite"></a>
# **adminUsersInvite**
> DefaultSuccessTemplate adminUsersInvite(token, channelIds, email, teamId, customMessage, guestExpirationTs, isRestricted, isUltraRestricted, realName, resend)



Invite a user to a workspace.

### Example
```java
// Import classes:
import invalidPackageName.ApiClient;
import invalidPackageName.ApiException;
import invalidPackageName.Configuration;
import invalidPackageName.auth.*;
import invalidPackageName.models.*;
import slack.AdminApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://slack.com/api");
    
    // Configure OAuth2 access token for authorization: slackAuth
    OAuth slackAuth = (OAuth) defaultClient.getAuthentication("slackAuth");
    slackAuth.setAccessToken("YOUR ACCESS TOKEN");

    AdminApi apiInstance = new AdminApi(defaultClient);
    String token = "token_example"; // String | Authentication token. Requires scope: `admin.users:write`
    String channelIds = "channelIds_example"; // String | A comma-separated list of `channel_id`s for this user to join. At least one channel is required.
    String email = "email_example"; // String | The email address of the person to invite.
    String teamId = "teamId_example"; // String | The ID (`T1234`) of the workspace.
    String customMessage = "customMessage_example"; // String | An optional message to send to the user in the invite email.
    String guestExpirationTs = "guestExpirationTs_example"; // String | Timestamp when guest account should be disabled. Only include this timestamp if you are inviting a guest user and you want their account to expire on a certain date.
    Boolean isRestricted = true; // Boolean | Is this user a multi-channel guest user? (default: false)
    Boolean isUltraRestricted = true; // Boolean | Is this user a single channel guest user? (default: false)
    String realName = "realName_example"; // String | Full name of the user.
    Boolean resend = true; // Boolean | Allow this invite to be resent in the future if a user has not signed up yet. (default: false)
    try {
      DefaultSuccessTemplate result = apiInstance.adminUsersInvite(token, channelIds, email, teamId, customMessage, guestExpirationTs, isRestricted, isUltraRestricted, realName, resend);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#adminUsersInvite");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **token** | **String**| Authentication token. Requires scope: &#x60;admin.users:write&#x60; | |
| **channelIds** | **String**| A comma-separated list of &#x60;channel_id&#x60;s for this user to join. At least one channel is required. | |
| **email** | **String**| The email address of the person to invite. | |
| **teamId** | **String**| The ID (&#x60;T1234&#x60;) of the workspace. | |
| **customMessage** | **String**| An optional message to send to the user in the invite email. | [optional] |
| **guestExpirationTs** | **String**| Timestamp when guest account should be disabled. Only include this timestamp if you are inviting a guest user and you want their account to expire on a certain date. | [optional] |
| **isRestricted** | **Boolean**| Is this user a multi-channel guest user? (default: false) | [optional] |
| **isUltraRestricted** | **Boolean**| Is this user a single channel guest user? (default: false) | [optional] |
| **realName** | **String**| Full name of the user. | [optional] |
| **resend** | **Boolean**| Allow this invite to be resent in the future if a user has not signed up yet. (default: false) | [optional] |

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Typical success response |  -  |
| **0** | Typical error response |  -  |

<a name="adminUsersList"></a>
# **adminUsersList**
> DefaultSuccessTemplate adminUsersList(token, teamId, cursor, limit)



List users on a workspace

### Example
```java
// Import classes:
import invalidPackageName.ApiClient;
import invalidPackageName.ApiException;
import invalidPackageName.Configuration;
import invalidPackageName.auth.*;
import invalidPackageName.models.*;
import slack.AdminApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://slack.com/api");
    
    // Configure OAuth2 access token for authorization: slackAuth
    OAuth slackAuth = (OAuth) defaultClient.getAuthentication("slackAuth");
    slackAuth.setAccessToken("YOUR ACCESS TOKEN");

    AdminApi apiInstance = new AdminApi(defaultClient);
    String token = "token_example"; // String | Authentication token. Requires scope: `admin.users:read`
    String teamId = "teamId_example"; // String | The ID (`T1234`) of the workspace.
    String cursor = "cursor_example"; // String | Set `cursor` to `next_cursor` returned by the previous call to list items in the next page.
    Integer limit = 56; // Integer | Limit for how many users to be retrieved per page
    try {
      DefaultSuccessTemplate result = apiInstance.adminUsersList(token, teamId, cursor, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#adminUsersList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **token** | **String**| Authentication token. Requires scope: &#x60;admin.users:read&#x60; | |
| **teamId** | **String**| The ID (&#x60;T1234&#x60;) of the workspace. | |
| **cursor** | **String**| Set &#x60;cursor&#x60; to &#x60;next_cursor&#x60; returned by the previous call to list items in the next page. | [optional] |
| **limit** | **Integer**| Limit for how many users to be retrieved per page | [optional] |

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Typical success response |  -  |
| **0** | Typical error response |  -  |

<a name="adminUsersRemove"></a>
# **adminUsersRemove**
> DefaultSuccessTemplate adminUsersRemove(token, teamId, userId)



Remove a user from a workspace.

### Example
```java
// Import classes:
import invalidPackageName.ApiClient;
import invalidPackageName.ApiException;
import invalidPackageName.Configuration;
import invalidPackageName.auth.*;
import invalidPackageName.models.*;
import slack.AdminApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://slack.com/api");
    
    // Configure OAuth2 access token for authorization: slackAuth
    OAuth slackAuth = (OAuth) defaultClient.getAuthentication("slackAuth");
    slackAuth.setAccessToken("YOUR ACCESS TOKEN");

    AdminApi apiInstance = new AdminApi(defaultClient);
    String token = "token_example"; // String | Authentication token. Requires scope: `admin.users:write`
    String teamId = "teamId_example"; // String | The ID (`T1234`) of the workspace.
    String userId = "userId_example"; // String | The ID of the user to remove.
    try {
      DefaultSuccessTemplate result = apiInstance.adminUsersRemove(token, teamId, userId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#adminUsersRemove");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **token** | **String**| Authentication token. Requires scope: &#x60;admin.users:write&#x60; | |
| **teamId** | **String**| The ID (&#x60;T1234&#x60;) of the workspace. | |
| **userId** | **String**| The ID of the user to remove. | |

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Typical success response |  -  |
| **0** | Typical error response |  -  |

<a name="adminUsersSessionInvalidate"></a>
# **adminUsersSessionInvalidate**
> DefaultSuccessTemplate adminUsersSessionInvalidate(token, sessionId, teamId)



Invalidate a single session for a user by session_id

### Example
```java
// Import classes:
import invalidPackageName.ApiClient;
import invalidPackageName.ApiException;
import invalidPackageName.Configuration;
import invalidPackageName.auth.*;
import invalidPackageName.models.*;
import slack.AdminApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://slack.com/api");
    
    // Configure OAuth2 access token for authorization: slackAuth
    OAuth slackAuth = (OAuth) defaultClient.getAuthentication("slackAuth");
    slackAuth.setAccessToken("YOUR ACCESS TOKEN");

    AdminApi apiInstance = new AdminApi(defaultClient);
    String token = "token_example"; // String | Authentication token. Requires scope: `admin.users:write`
    Integer sessionId = 56; // Integer | 
    String teamId = "teamId_example"; // String | ID of the team that the session belongs to
    try {
      DefaultSuccessTemplate result = apiInstance.adminUsersSessionInvalidate(token, sessionId, teamId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#adminUsersSessionInvalidate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **token** | **String**| Authentication token. Requires scope: &#x60;admin.users:write&#x60; | |
| **sessionId** | **Integer**|  | |
| **teamId** | **String**| ID of the team that the session belongs to | |

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Typical success response |  -  |
| **0** | Typical error response |  -  |

<a name="adminUsersSessionReset"></a>
# **adminUsersSessionReset**
> DefaultSuccessTemplate adminUsersSessionReset(token, userId, mobileOnly, webOnly)



Wipes all valid sessions on all devices for a given user

### Example
```java
// Import classes:
import invalidPackageName.ApiClient;
import invalidPackageName.ApiException;
import invalidPackageName.Configuration;
import invalidPackageName.auth.*;
import invalidPackageName.models.*;
import slack.AdminApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://slack.com/api");
    
    // Configure OAuth2 access token for authorization: slackAuth
    OAuth slackAuth = (OAuth) defaultClient.getAuthentication("slackAuth");
    slackAuth.setAccessToken("YOUR ACCESS TOKEN");

    AdminApi apiInstance = new AdminApi(defaultClient);
    String token = "token_example"; // String | Authentication token. Requires scope: `admin.users:write`
    String userId = "userId_example"; // String | The ID of the user to wipe sessions for
    Boolean mobileOnly = true; // Boolean | Only expire mobile sessions (default: false)
    Boolean webOnly = true; // Boolean | Only expire web sessions (default: false)
    try {
      DefaultSuccessTemplate result = apiInstance.adminUsersSessionReset(token, userId, mobileOnly, webOnly);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#adminUsersSessionReset");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **token** | **String**| Authentication token. Requires scope: &#x60;admin.users:write&#x60; | |
| **userId** | **String**| The ID of the user to wipe sessions for | |
| **mobileOnly** | **Boolean**| Only expire mobile sessions (default: false) | [optional] |
| **webOnly** | **Boolean**| Only expire web sessions (default: false) | [optional] |

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Typical success response |  -  |
| **0** | Typical error response |  -  |

<a name="adminUsersSetAdmin"></a>
# **adminUsersSetAdmin**
> DefaultSuccessTemplate adminUsersSetAdmin(token, teamId, userId)



Set an existing guest, regular user, or owner to be an admin user.

### Example
```java
// Import classes:
import invalidPackageName.ApiClient;
import invalidPackageName.ApiException;
import invalidPackageName.Configuration;
import invalidPackageName.auth.*;
import invalidPackageName.models.*;
import slack.AdminApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://slack.com/api");
    
    // Configure OAuth2 access token for authorization: slackAuth
    OAuth slackAuth = (OAuth) defaultClient.getAuthentication("slackAuth");
    slackAuth.setAccessToken("YOUR ACCESS TOKEN");

    AdminApi apiInstance = new AdminApi(defaultClient);
    String token = "token_example"; // String | Authentication token. Requires scope: `admin.users:write`
    String teamId = "teamId_example"; // String | The ID (`T1234`) of the workspace.
    String userId = "userId_example"; // String | The ID of the user to designate as an admin.
    try {
      DefaultSuccessTemplate result = apiInstance.adminUsersSetAdmin(token, teamId, userId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#adminUsersSetAdmin");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **token** | **String**| Authentication token. Requires scope: &#x60;admin.users:write&#x60; | |
| **teamId** | **String**| The ID (&#x60;T1234&#x60;) of the workspace. | |
| **userId** | **String**| The ID of the user to designate as an admin. | |

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Typical success response |  -  |
| **0** | Typical error response |  -  |

<a name="adminUsersSetExpiration"></a>
# **adminUsersSetExpiration**
> DefaultSuccessTemplate adminUsersSetExpiration(token, expirationTs, teamId, userId)



Set an expiration for a guest user

### Example
```java
// Import classes:
import invalidPackageName.ApiClient;
import invalidPackageName.ApiException;
import invalidPackageName.Configuration;
import invalidPackageName.auth.*;
import invalidPackageName.models.*;
import slack.AdminApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://slack.com/api");
    
    // Configure OAuth2 access token for authorization: slackAuth
    OAuth slackAuth = (OAuth) defaultClient.getAuthentication("slackAuth");
    slackAuth.setAccessToken("YOUR ACCESS TOKEN");

    AdminApi apiInstance = new AdminApi(defaultClient);
    String token = "token_example"; // String | Authentication token. Requires scope: `admin.users:write`
    Integer expirationTs = 56; // Integer | Timestamp when guest account should be disabled.
    String teamId = "teamId_example"; // String | The ID (`T1234`) of the workspace.
    String userId = "userId_example"; // String | The ID of the user to set an expiration for.
    try {
      DefaultSuccessTemplate result = apiInstance.adminUsersSetExpiration(token, expirationTs, teamId, userId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#adminUsersSetExpiration");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **token** | **String**| Authentication token. Requires scope: &#x60;admin.users:write&#x60; | |
| **expirationTs** | **Integer**| Timestamp when guest account should be disabled. | |
| **teamId** | **String**| The ID (&#x60;T1234&#x60;) of the workspace. | |
| **userId** | **String**| The ID of the user to set an expiration for. | |

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Typical success response |  -  |
| **0** | Typical error response |  -  |

<a name="adminUsersSetOwner"></a>
# **adminUsersSetOwner**
> DefaultSuccessTemplate adminUsersSetOwner(token, teamId, userId)



Set an existing guest, regular user, or admin user to be a workspace owner.

### Example
```java
// Import classes:
import invalidPackageName.ApiClient;
import invalidPackageName.ApiException;
import invalidPackageName.Configuration;
import invalidPackageName.auth.*;
import invalidPackageName.models.*;
import slack.AdminApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://slack.com/api");
    
    // Configure OAuth2 access token for authorization: slackAuth
    OAuth slackAuth = (OAuth) defaultClient.getAuthentication("slackAuth");
    slackAuth.setAccessToken("YOUR ACCESS TOKEN");

    AdminApi apiInstance = new AdminApi(defaultClient);
    String token = "token_example"; // String | Authentication token. Requires scope: `admin.users:write`
    String teamId = "teamId_example"; // String | The ID (`T1234`) of the workspace.
    String userId = "userId_example"; // String | Id of the user to promote to owner.
    try {
      DefaultSuccessTemplate result = apiInstance.adminUsersSetOwner(token, teamId, userId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#adminUsersSetOwner");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **token** | **String**| Authentication token. Requires scope: &#x60;admin.users:write&#x60; | |
| **teamId** | **String**| The ID (&#x60;T1234&#x60;) of the workspace. | |
| **userId** | **String**| Id of the user to promote to owner. | |

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Typical success response |  -  |
| **0** | Typical error response |  -  |

<a name="adminUsersSetRegular"></a>
# **adminUsersSetRegular**
> DefaultSuccessTemplate adminUsersSetRegular(token, teamId, userId)



Set an existing guest user, admin user, or owner to be a regular user.

### Example
```java
// Import classes:
import invalidPackageName.ApiClient;
import invalidPackageName.ApiException;
import invalidPackageName.Configuration;
import invalidPackageName.auth.*;
import invalidPackageName.models.*;
import slack.AdminApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://slack.com/api");
    
    // Configure OAuth2 access token for authorization: slackAuth
    OAuth slackAuth = (OAuth) defaultClient.getAuthentication("slackAuth");
    slackAuth.setAccessToken("YOUR ACCESS TOKEN");

    AdminApi apiInstance = new AdminApi(defaultClient);
    String token = "token_example"; // String | Authentication token. Requires scope: `admin.users:write`
    String teamId = "teamId_example"; // String | The ID (`T1234`) of the workspace.
    String userId = "userId_example"; // String | The ID of the user to designate as a regular user.
    try {
      DefaultSuccessTemplate result = apiInstance.adminUsersSetRegular(token, teamId, userId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#adminUsersSetRegular");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **token** | **String**| Authentication token. Requires scope: &#x60;admin.users:write&#x60; | |
| **teamId** | **String**| The ID (&#x60;T1234&#x60;) of the workspace. | |
| **userId** | **String**| The ID of the user to designate as a regular user. | |

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Typical success response |  -  |
| **0** | Typical error response |  -  |

