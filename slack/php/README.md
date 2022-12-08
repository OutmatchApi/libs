# OpenAPIClient-php

One way to interact with the Slack platform is its HTTP RPC-based Web API, a collection of methods requiring OAuth 2.0-based user, bot, or workspace tokens blessed with related OAuth scopes.

For more information, please visit [https://api.slack.com/support](https://api.slack.com/support).

## Installation & Usage

### Requirements

PHP 7.4 and later.
Should also work with PHP 8.0.

### Composer

To install the bindings via [Composer](https://getcomposer.org/), add the following to `composer.json`:

```json
{
  "repositories": [
    {
      "type": "vcs",
      "url": "https://github.com/GIT_USER_ID/GIT_REPO_ID.git"
    }
  ],
  "require": {
    "GIT_USER_ID/GIT_REPO_ID": "*@dev"
  }
}
```

Then run `composer install`

### Manual Installation

Download the files and include `autoload.php`:

```php
<?php
require_once('/path/to/OpenAPIClient-php/vendor/autoload.php');
```

## Getting Started

Please follow the [installation procedure](#installation--usage) and then run the following:

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AdminApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `admin.apps:write`
$app_id = 'app_id_example'; // string | The id of the app to approve.
$request_id = 'request_id_example'; // string | The id of the request to approve.
$team_id = 'team_id_example'; // string

try {
    $result = $apiInstance->adminAppsApprove($token, $app_id, $request_id, $team_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AdminApi->adminAppsApprove: ', $e->getMessage(), PHP_EOL;
}

```

## API Endpoints

All URIs are relative to *https://slack.com/api*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AdminApi* | [**adminAppsApprove**](docs/Api/AdminApi.md#adminappsapprove) | **POST** /admin.apps.approve | 
*AdminApi* | [**adminAppsApprovedList**](docs/Api/AdminApi.md#adminappsapprovedlist) | **GET** /admin.apps.approved.list | 
*AdminApi* | [**adminAppsRequestsList**](docs/Api/AdminApi.md#adminappsrequestslist) | **GET** /admin.apps.requests.list | 
*AdminApi* | [**adminAppsRestrict**](docs/Api/AdminApi.md#adminappsrestrict) | **POST** /admin.apps.restrict | 
*AdminApi* | [**adminAppsRestrictedList**](docs/Api/AdminApi.md#adminappsrestrictedlist) | **GET** /admin.apps.restricted.list | 
*AdminApi* | [**adminConversationsArchive**](docs/Api/AdminApi.md#adminconversationsarchive) | **POST** /admin.conversations.archive | 
*AdminApi* | [**adminConversationsConvertToPrivate**](docs/Api/AdminApi.md#adminconversationsconverttoprivate) | **POST** /admin.conversations.convertToPrivate | 
*AdminApi* | [**adminConversationsCreate**](docs/Api/AdminApi.md#adminconversationscreate) | **POST** /admin.conversations.create | 
*AdminApi* | [**adminConversationsDelete**](docs/Api/AdminApi.md#adminconversationsdelete) | **POST** /admin.conversations.delete | 
*AdminApi* | [**adminConversationsDisconnectShared**](docs/Api/AdminApi.md#adminconversationsdisconnectshared) | **POST** /admin.conversations.disconnectShared | 
*AdminApi* | [**adminConversationsEkmListOriginalConnectedChannelInfo**](docs/Api/AdminApi.md#adminconversationsekmlistoriginalconnectedchannelinfo) | **GET** /admin.conversations.ekm.listOriginalConnectedChannelInfo | 
*AdminApi* | [**adminConversationsGetConversationPrefs**](docs/Api/AdminApi.md#adminconversationsgetconversationprefs) | **GET** /admin.conversations.getConversationPrefs | 
*AdminApi* | [**adminConversationsGetTeams**](docs/Api/AdminApi.md#adminconversationsgetteams) | **GET** /admin.conversations.getTeams | 
*AdminApi* | [**adminConversationsInvite**](docs/Api/AdminApi.md#adminconversationsinvite) | **POST** /admin.conversations.invite | 
*AdminApi* | [**adminConversationsRename**](docs/Api/AdminApi.md#adminconversationsrename) | **POST** /admin.conversations.rename | 
*AdminApi* | [**adminConversationsRestrictAccessAddGroup**](docs/Api/AdminApi.md#adminconversationsrestrictaccessaddgroup) | **POST** /admin.conversations.restrictAccess.addGroup | 
*AdminApi* | [**adminConversationsRestrictAccessListGroups**](docs/Api/AdminApi.md#adminconversationsrestrictaccesslistgroups) | **GET** /admin.conversations.restrictAccess.listGroups | 
*AdminApi* | [**adminConversationsRestrictAccessRemoveGroup**](docs/Api/AdminApi.md#adminconversationsrestrictaccessremovegroup) | **POST** /admin.conversations.restrictAccess.removeGroup | 
*AdminApi* | [**adminConversationsSearch**](docs/Api/AdminApi.md#adminconversationssearch) | **GET** /admin.conversations.search | 
*AdminApi* | [**adminConversationsSetConversationPrefs**](docs/Api/AdminApi.md#adminconversationssetconversationprefs) | **POST** /admin.conversations.setConversationPrefs | 
*AdminApi* | [**adminConversationsSetTeams**](docs/Api/AdminApi.md#adminconversationssetteams) | **POST** /admin.conversations.setTeams | 
*AdminApi* | [**adminConversationsUnarchive**](docs/Api/AdminApi.md#adminconversationsunarchive) | **POST** /admin.conversations.unarchive | 
*AdminApi* | [**adminEmojiAdd**](docs/Api/AdminApi.md#adminemojiadd) | **POST** /admin.emoji.add | 
*AdminApi* | [**adminEmojiAddAlias**](docs/Api/AdminApi.md#adminemojiaddalias) | **POST** /admin.emoji.addAlias | 
*AdminApi* | [**adminEmojiList**](docs/Api/AdminApi.md#adminemojilist) | **GET** /admin.emoji.list | 
*AdminApi* | [**adminEmojiRemove**](docs/Api/AdminApi.md#adminemojiremove) | **POST** /admin.emoji.remove | 
*AdminApi* | [**adminEmojiRename**](docs/Api/AdminApi.md#adminemojirename) | **POST** /admin.emoji.rename | 
*AdminApi* | [**adminInviteRequestsApprove**](docs/Api/AdminApi.md#admininviterequestsapprove) | **POST** /admin.inviteRequests.approve | 
*AdminApi* | [**adminInviteRequestsApprovedList**](docs/Api/AdminApi.md#admininviterequestsapprovedlist) | **GET** /admin.inviteRequests.approved.list | 
*AdminApi* | [**adminInviteRequestsDeniedList**](docs/Api/AdminApi.md#admininviterequestsdeniedlist) | **GET** /admin.inviteRequests.denied.list | 
*AdminApi* | [**adminInviteRequestsDeny**](docs/Api/AdminApi.md#admininviterequestsdeny) | **POST** /admin.inviteRequests.deny | 
*AdminApi* | [**adminInviteRequestsList**](docs/Api/AdminApi.md#admininviterequestslist) | **GET** /admin.inviteRequests.list | 
*AdminApi* | [**adminTeamsAdminsList**](docs/Api/AdminApi.md#adminteamsadminslist) | **GET** /admin.teams.admins.list | 
*AdminApi* | [**adminTeamsCreate**](docs/Api/AdminApi.md#adminteamscreate) | **POST** /admin.teams.create | 
*AdminApi* | [**adminTeamsList**](docs/Api/AdminApi.md#adminteamslist) | **GET** /admin.teams.list | 
*AdminApi* | [**adminTeamsOwnersList**](docs/Api/AdminApi.md#adminteamsownerslist) | **GET** /admin.teams.owners.list | 
*AdminApi* | [**adminTeamsSettingsInfo**](docs/Api/AdminApi.md#adminteamssettingsinfo) | **GET** /admin.teams.settings.info | 
*AdminApi* | [**adminTeamsSettingsSetDefaultChannels**](docs/Api/AdminApi.md#adminteamssettingssetdefaultchannels) | **POST** /admin.teams.settings.setDefaultChannels | 
*AdminApi* | [**adminTeamsSettingsSetDescription**](docs/Api/AdminApi.md#adminteamssettingssetdescription) | **POST** /admin.teams.settings.setDescription | 
*AdminApi* | [**adminTeamsSettingsSetDiscoverability**](docs/Api/AdminApi.md#adminteamssettingssetdiscoverability) | **POST** /admin.teams.settings.setDiscoverability | 
*AdminApi* | [**adminTeamsSettingsSetIcon**](docs/Api/AdminApi.md#adminteamssettingsseticon) | **POST** /admin.teams.settings.setIcon | 
*AdminApi* | [**adminTeamsSettingsSetName**](docs/Api/AdminApi.md#adminteamssettingssetname) | **POST** /admin.teams.settings.setName | 
*AdminApi* | [**adminUsergroupsAddChannels**](docs/Api/AdminApi.md#adminusergroupsaddchannels) | **POST** /admin.usergroups.addChannels | 
*AdminApi* | [**adminUsergroupsAddTeams**](docs/Api/AdminApi.md#adminusergroupsaddteams) | **POST** /admin.usergroups.addTeams | 
*AdminApi* | [**adminUsergroupsListChannels**](docs/Api/AdminApi.md#adminusergroupslistchannels) | **GET** /admin.usergroups.listChannels | 
*AdminApi* | [**adminUsergroupsRemoveChannels**](docs/Api/AdminApi.md#adminusergroupsremovechannels) | **POST** /admin.usergroups.removeChannels | 
*AdminApi* | [**adminUsersAssign**](docs/Api/AdminApi.md#adminusersassign) | **POST** /admin.users.assign | 
*AdminApi* | [**adminUsersInvite**](docs/Api/AdminApi.md#adminusersinvite) | **POST** /admin.users.invite | 
*AdminApi* | [**adminUsersList**](docs/Api/AdminApi.md#adminuserslist) | **GET** /admin.users.list | 
*AdminApi* | [**adminUsersRemove**](docs/Api/AdminApi.md#adminusersremove) | **POST** /admin.users.remove | 
*AdminApi* | [**adminUsersSessionInvalidate**](docs/Api/AdminApi.md#adminuserssessioninvalidate) | **POST** /admin.users.session.invalidate | 
*AdminApi* | [**adminUsersSessionReset**](docs/Api/AdminApi.md#adminuserssessionreset) | **POST** /admin.users.session.reset | 
*AdminApi* | [**adminUsersSetAdmin**](docs/Api/AdminApi.md#adminuserssetadmin) | **POST** /admin.users.setAdmin | 
*AdminApi* | [**adminUsersSetExpiration**](docs/Api/AdminApi.md#adminuserssetexpiration) | **POST** /admin.users.setExpiration | 
*AdminApi* | [**adminUsersSetOwner**](docs/Api/AdminApi.md#adminuserssetowner) | **POST** /admin.users.setOwner | 
*AdminApi* | [**adminUsersSetRegular**](docs/Api/AdminApi.md#adminuserssetregular) | **POST** /admin.users.setRegular | 
*AdminAppsApi* | [**adminAppsApprove**](docs/Api/AdminAppsApi.md#adminappsapprove) | **POST** /admin.apps.approve | 
*AdminAppsApi* | [**adminAppsRestrict**](docs/Api/AdminAppsApi.md#adminappsrestrict) | **POST** /admin.apps.restrict | 
*AdminAppsApprovedApi* | [**adminAppsApprovedList**](docs/Api/AdminAppsApprovedApi.md#adminappsapprovedlist) | **GET** /admin.apps.approved.list | 
*AdminAppsRequestsApi* | [**adminAppsRequestsList**](docs/Api/AdminAppsRequestsApi.md#adminappsrequestslist) | **GET** /admin.apps.requests.list | 
*AdminAppsRestrictedApi* | [**adminAppsRestrictedList**](docs/Api/AdminAppsRestrictedApi.md#adminappsrestrictedlist) | **GET** /admin.apps.restricted.list | 
*AdminConversationsApi* | [**adminConversationsArchive**](docs/Api/AdminConversationsApi.md#adminconversationsarchive) | **POST** /admin.conversations.archive | 
*AdminConversationsApi* | [**adminConversationsConvertToPrivate**](docs/Api/AdminConversationsApi.md#adminconversationsconverttoprivate) | **POST** /admin.conversations.convertToPrivate | 
*AdminConversationsApi* | [**adminConversationsCreate**](docs/Api/AdminConversationsApi.md#adminconversationscreate) | **POST** /admin.conversations.create | 
*AdminConversationsApi* | [**adminConversationsDelete**](docs/Api/AdminConversationsApi.md#adminconversationsdelete) | **POST** /admin.conversations.delete | 
*AdminConversationsApi* | [**adminConversationsDisconnectShared**](docs/Api/AdminConversationsApi.md#adminconversationsdisconnectshared) | **POST** /admin.conversations.disconnectShared | 
*AdminConversationsApi* | [**adminConversationsGetConversationPrefs**](docs/Api/AdminConversationsApi.md#adminconversationsgetconversationprefs) | **GET** /admin.conversations.getConversationPrefs | 
*AdminConversationsApi* | [**adminConversationsGetTeams**](docs/Api/AdminConversationsApi.md#adminconversationsgetteams) | **GET** /admin.conversations.getTeams | 
*AdminConversationsApi* | [**adminConversationsInvite**](docs/Api/AdminConversationsApi.md#adminconversationsinvite) | **POST** /admin.conversations.invite | 
*AdminConversationsApi* | [**adminConversationsRename**](docs/Api/AdminConversationsApi.md#adminconversationsrename) | **POST** /admin.conversations.rename | 
*AdminConversationsApi* | [**adminConversationsSearch**](docs/Api/AdminConversationsApi.md#adminconversationssearch) | **GET** /admin.conversations.search | 
*AdminConversationsApi* | [**adminConversationsSetConversationPrefs**](docs/Api/AdminConversationsApi.md#adminconversationssetconversationprefs) | **POST** /admin.conversations.setConversationPrefs | 
*AdminConversationsApi* | [**adminConversationsSetTeams**](docs/Api/AdminConversationsApi.md#adminconversationssetteams) | **POST** /admin.conversations.setTeams | 
*AdminConversationsApi* | [**adminConversationsUnarchive**](docs/Api/AdminConversationsApi.md#adminconversationsunarchive) | **POST** /admin.conversations.unarchive | 
*AdminConversationsEkmApi* | [**adminConversationsEkmListOriginalConnectedChannelInfo**](docs/Api/AdminConversationsEkmApi.md#adminconversationsekmlistoriginalconnectedchannelinfo) | **GET** /admin.conversations.ekm.listOriginalConnectedChannelInfo | 
*AdminConversationsRestrictAccessApi* | [**adminConversationsRestrictAccessAddGroup**](docs/Api/AdminConversationsRestrictAccessApi.md#adminconversationsrestrictaccessaddgroup) | **POST** /admin.conversations.restrictAccess.addGroup | 
*AdminConversationsRestrictAccessApi* | [**adminConversationsRestrictAccessListGroups**](docs/Api/AdminConversationsRestrictAccessApi.md#adminconversationsrestrictaccesslistgroups) | **GET** /admin.conversations.restrictAccess.listGroups | 
*AdminConversationsRestrictAccessApi* | [**adminConversationsRestrictAccessRemoveGroup**](docs/Api/AdminConversationsRestrictAccessApi.md#adminconversationsrestrictaccessremovegroup) | **POST** /admin.conversations.restrictAccess.removeGroup | 
*AdminEmojiApi* | [**adminEmojiAdd**](docs/Api/AdminEmojiApi.md#adminemojiadd) | **POST** /admin.emoji.add | 
*AdminEmojiApi* | [**adminEmojiAddAlias**](docs/Api/AdminEmojiApi.md#adminemojiaddalias) | **POST** /admin.emoji.addAlias | 
*AdminEmojiApi* | [**adminEmojiList**](docs/Api/AdminEmojiApi.md#adminemojilist) | **GET** /admin.emoji.list | 
*AdminEmojiApi* | [**adminEmojiRemove**](docs/Api/AdminEmojiApi.md#adminemojiremove) | **POST** /admin.emoji.remove | 
*AdminEmojiApi* | [**adminEmojiRename**](docs/Api/AdminEmojiApi.md#adminemojirename) | **POST** /admin.emoji.rename | 
*AdminInviteRequestsApi* | [**adminInviteRequestsApprove**](docs/Api/AdminInviteRequestsApi.md#admininviterequestsapprove) | **POST** /admin.inviteRequests.approve | 
*AdminInviteRequestsApi* | [**adminInviteRequestsDeny**](docs/Api/AdminInviteRequestsApi.md#admininviterequestsdeny) | **POST** /admin.inviteRequests.deny | 
*AdminInviteRequestsApi* | [**adminInviteRequestsList**](docs/Api/AdminInviteRequestsApi.md#admininviterequestslist) | **GET** /admin.inviteRequests.list | 
*AdminInviteRequestsApprovedApi* | [**adminInviteRequestsApprovedList**](docs/Api/AdminInviteRequestsApprovedApi.md#admininviterequestsapprovedlist) | **GET** /admin.inviteRequests.approved.list | 
*AdminInviteRequestsDeniedApi* | [**adminInviteRequestsDeniedList**](docs/Api/AdminInviteRequestsDeniedApi.md#admininviterequestsdeniedlist) | **GET** /admin.inviteRequests.denied.list | 
*AdminTeamsApi* | [**adminTeamsCreate**](docs/Api/AdminTeamsApi.md#adminteamscreate) | **POST** /admin.teams.create | 
*AdminTeamsApi* | [**adminTeamsList**](docs/Api/AdminTeamsApi.md#adminteamslist) | **GET** /admin.teams.list | 
*AdminTeamsAdminsApi* | [**adminTeamsAdminsList**](docs/Api/AdminTeamsAdminsApi.md#adminteamsadminslist) | **GET** /admin.teams.admins.list | 
*AdminTeamsOwnersApi* | [**adminTeamsOwnersList**](docs/Api/AdminTeamsOwnersApi.md#adminteamsownerslist) | **GET** /admin.teams.owners.list | 
*AdminTeamsSettingsApi* | [**adminTeamsSettingsInfo**](docs/Api/AdminTeamsSettingsApi.md#adminteamssettingsinfo) | **GET** /admin.teams.settings.info | 
*AdminTeamsSettingsApi* | [**adminTeamsSettingsSetDefaultChannels**](docs/Api/AdminTeamsSettingsApi.md#adminteamssettingssetdefaultchannels) | **POST** /admin.teams.settings.setDefaultChannels | 
*AdminTeamsSettingsApi* | [**adminTeamsSettingsSetDescription**](docs/Api/AdminTeamsSettingsApi.md#adminteamssettingssetdescription) | **POST** /admin.teams.settings.setDescription | 
*AdminTeamsSettingsApi* | [**adminTeamsSettingsSetDiscoverability**](docs/Api/AdminTeamsSettingsApi.md#adminteamssettingssetdiscoverability) | **POST** /admin.teams.settings.setDiscoverability | 
*AdminTeamsSettingsApi* | [**adminTeamsSettingsSetIcon**](docs/Api/AdminTeamsSettingsApi.md#adminteamssettingsseticon) | **POST** /admin.teams.settings.setIcon | 
*AdminTeamsSettingsApi* | [**adminTeamsSettingsSetName**](docs/Api/AdminTeamsSettingsApi.md#adminteamssettingssetname) | **POST** /admin.teams.settings.setName | 
*AdminUsergroupsApi* | [**adminUsergroupsAddChannels**](docs/Api/AdminUsergroupsApi.md#adminusergroupsaddchannels) | **POST** /admin.usergroups.addChannels | 
*AdminUsergroupsApi* | [**adminUsergroupsAddTeams**](docs/Api/AdminUsergroupsApi.md#adminusergroupsaddteams) | **POST** /admin.usergroups.addTeams | 
*AdminUsergroupsApi* | [**adminUsergroupsListChannels**](docs/Api/AdminUsergroupsApi.md#adminusergroupslistchannels) | **GET** /admin.usergroups.listChannels | 
*AdminUsergroupsApi* | [**adminUsergroupsRemoveChannels**](docs/Api/AdminUsergroupsApi.md#adminusergroupsremovechannels) | **POST** /admin.usergroups.removeChannels | 
*AdminUsersApi* | [**adminUsersAssign**](docs/Api/AdminUsersApi.md#adminusersassign) | **POST** /admin.users.assign | 
*AdminUsersApi* | [**adminUsersInvite**](docs/Api/AdminUsersApi.md#adminusersinvite) | **POST** /admin.users.invite | 
*AdminUsersApi* | [**adminUsersList**](docs/Api/AdminUsersApi.md#adminuserslist) | **GET** /admin.users.list | 
*AdminUsersApi* | [**adminUsersRemove**](docs/Api/AdminUsersApi.md#adminusersremove) | **POST** /admin.users.remove | 
*AdminUsersApi* | [**adminUsersSetAdmin**](docs/Api/AdminUsersApi.md#adminuserssetadmin) | **POST** /admin.users.setAdmin | 
*AdminUsersApi* | [**adminUsersSetExpiration**](docs/Api/AdminUsersApi.md#adminuserssetexpiration) | **POST** /admin.users.setExpiration | 
*AdminUsersApi* | [**adminUsersSetOwner**](docs/Api/AdminUsersApi.md#adminuserssetowner) | **POST** /admin.users.setOwner | 
*AdminUsersApi* | [**adminUsersSetRegular**](docs/Api/AdminUsersApi.md#adminuserssetregular) | **POST** /admin.users.setRegular | 
*AdminUsersSessionApi* | [**adminUsersSessionInvalidate**](docs/Api/AdminUsersSessionApi.md#adminuserssessioninvalidate) | **POST** /admin.users.session.invalidate | 
*AdminUsersSessionApi* | [**adminUsersSessionReset**](docs/Api/AdminUsersSessionApi.md#adminuserssessionreset) | **POST** /admin.users.session.reset | 
*ApiApi* | [**apiTest**](docs/Api/ApiApi.md#apitest) | **GET** /api.test | 
*AppsApi* | [**appsEventAuthorizationsList**](docs/Api/AppsApi.md#appseventauthorizationslist) | **GET** /apps.event.authorizations.list | 
*AppsApi* | [**appsPermissionsInfo**](docs/Api/AppsApi.md#appspermissionsinfo) | **GET** /apps.permissions.info | 
*AppsApi* | [**appsPermissionsRequest**](docs/Api/AppsApi.md#appspermissionsrequest) | **GET** /apps.permissions.request | 
*AppsApi* | [**appsPermissionsResourcesList**](docs/Api/AppsApi.md#appspermissionsresourceslist) | **GET** /apps.permissions.resources.list | 
*AppsApi* | [**appsPermissionsScopesList**](docs/Api/AppsApi.md#appspermissionsscopeslist) | **GET** /apps.permissions.scopes.list | 
*AppsApi* | [**appsPermissionsUsersList**](docs/Api/AppsApi.md#appspermissionsuserslist) | **GET** /apps.permissions.users.list | 
*AppsApi* | [**appsPermissionsUsersRequest**](docs/Api/AppsApi.md#appspermissionsusersrequest) | **GET** /apps.permissions.users.request | 
*AppsApi* | [**appsUninstall**](docs/Api/AppsApi.md#appsuninstall) | **GET** /apps.uninstall | 
*AppsEventAuthorizationsApi* | [**appsEventAuthorizationsList**](docs/Api/AppsEventAuthorizationsApi.md#appseventauthorizationslist) | **GET** /apps.event.authorizations.list | 
*AppsPermissionsApi* | [**appsPermissionsInfo**](docs/Api/AppsPermissionsApi.md#appspermissionsinfo) | **GET** /apps.permissions.info | 
*AppsPermissionsApi* | [**appsPermissionsRequest**](docs/Api/AppsPermissionsApi.md#appspermissionsrequest) | **GET** /apps.permissions.request | 
*AppsPermissionsResourcesApi* | [**appsPermissionsResourcesList**](docs/Api/AppsPermissionsResourcesApi.md#appspermissionsresourceslist) | **GET** /apps.permissions.resources.list | 
*AppsPermissionsScopesApi* | [**appsPermissionsScopesList**](docs/Api/AppsPermissionsScopesApi.md#appspermissionsscopeslist) | **GET** /apps.permissions.scopes.list | 
*AppsPermissionsUsersApi* | [**appsPermissionsUsersList**](docs/Api/AppsPermissionsUsersApi.md#appspermissionsuserslist) | **GET** /apps.permissions.users.list | 
*AppsPermissionsUsersApi* | [**appsPermissionsUsersRequest**](docs/Api/AppsPermissionsUsersApi.md#appspermissionsusersrequest) | **GET** /apps.permissions.users.request | 
*AuthApi* | [**authRevoke**](docs/Api/AuthApi.md#authrevoke) | **GET** /auth.revoke | 
*AuthApi* | [**authTest**](docs/Api/AuthApi.md#authtest) | **GET** /auth.test | 
*BotsApi* | [**botsInfo**](docs/Api/BotsApi.md#botsinfo) | **GET** /bots.info | 
*CallsApi* | [**callsAdd**](docs/Api/CallsApi.md#callsadd) | **POST** /calls.add | 
*CallsApi* | [**callsEnd**](docs/Api/CallsApi.md#callsend) | **POST** /calls.end | 
*CallsApi* | [**callsInfo**](docs/Api/CallsApi.md#callsinfo) | **GET** /calls.info | 
*CallsApi* | [**callsParticipantsAdd**](docs/Api/CallsApi.md#callsparticipantsadd) | **POST** /calls.participants.add | 
*CallsApi* | [**callsParticipantsRemove**](docs/Api/CallsApi.md#callsparticipantsremove) | **POST** /calls.participants.remove | 
*CallsApi* | [**callsUpdate**](docs/Api/CallsApi.md#callsupdate) | **POST** /calls.update | 
*CallsParticipantsApi* | [**callsParticipantsAdd**](docs/Api/CallsParticipantsApi.md#callsparticipantsadd) | **POST** /calls.participants.add | 
*CallsParticipantsApi* | [**callsParticipantsRemove**](docs/Api/CallsParticipantsApi.md#callsparticipantsremove) | **POST** /calls.participants.remove | 
*ChatApi* | [**chatDelete**](docs/Api/ChatApi.md#chatdelete) | **POST** /chat.delete | 
*ChatApi* | [**chatDeleteScheduledMessage**](docs/Api/ChatApi.md#chatdeletescheduledmessage) | **POST** /chat.deleteScheduledMessage | 
*ChatApi* | [**chatGetPermalink**](docs/Api/ChatApi.md#chatgetpermalink) | **GET** /chat.getPermalink | 
*ChatApi* | [**chatMeMessage**](docs/Api/ChatApi.md#chatmemessage) | **POST** /chat.meMessage | 
*ChatApi* | [**chatPostEphemeral**](docs/Api/ChatApi.md#chatpostephemeral) | **POST** /chat.postEphemeral | 
*ChatApi* | [**chatPostMessage**](docs/Api/ChatApi.md#chatpostmessage) | **POST** /chat.postMessage | 
*ChatApi* | [**chatScheduleMessage**](docs/Api/ChatApi.md#chatschedulemessage) | **POST** /chat.scheduleMessage | 
*ChatApi* | [**chatScheduledMessagesList**](docs/Api/ChatApi.md#chatscheduledmessageslist) | **GET** /chat.scheduledMessages.list | 
*ChatApi* | [**chatUnfurl**](docs/Api/ChatApi.md#chatunfurl) | **POST** /chat.unfurl | 
*ChatApi* | [**chatUpdate**](docs/Api/ChatApi.md#chatupdate) | **POST** /chat.update | 
*ChatScheduledMessagesApi* | [**chatScheduledMessagesList**](docs/Api/ChatScheduledMessagesApi.md#chatscheduledmessageslist) | **GET** /chat.scheduledMessages.list | 
*ConversationsApi* | [**conversationsArchive**](docs/Api/ConversationsApi.md#conversationsarchive) | **POST** /conversations.archive | 
*ConversationsApi* | [**conversationsClose**](docs/Api/ConversationsApi.md#conversationsclose) | **POST** /conversations.close | 
*ConversationsApi* | [**conversationsCreate**](docs/Api/ConversationsApi.md#conversationscreate) | **POST** /conversations.create | 
*ConversationsApi* | [**conversationsHistory**](docs/Api/ConversationsApi.md#conversationshistory) | **GET** /conversations.history | 
*ConversationsApi* | [**conversationsInfo**](docs/Api/ConversationsApi.md#conversationsinfo) | **GET** /conversations.info | 
*ConversationsApi* | [**conversationsInvite**](docs/Api/ConversationsApi.md#conversationsinvite) | **POST** /conversations.invite | 
*ConversationsApi* | [**conversationsJoin**](docs/Api/ConversationsApi.md#conversationsjoin) | **POST** /conversations.join | 
*ConversationsApi* | [**conversationsKick**](docs/Api/ConversationsApi.md#conversationskick) | **POST** /conversations.kick | 
*ConversationsApi* | [**conversationsLeave**](docs/Api/ConversationsApi.md#conversationsleave) | **POST** /conversations.leave | 
*ConversationsApi* | [**conversationsList**](docs/Api/ConversationsApi.md#conversationslist) | **GET** /conversations.list | 
*ConversationsApi* | [**conversationsMark**](docs/Api/ConversationsApi.md#conversationsmark) | **POST** /conversations.mark | 
*ConversationsApi* | [**conversationsMembers**](docs/Api/ConversationsApi.md#conversationsmembers) | **GET** /conversations.members | 
*ConversationsApi* | [**conversationsOpen**](docs/Api/ConversationsApi.md#conversationsopen) | **POST** /conversations.open | 
*ConversationsApi* | [**conversationsRename**](docs/Api/ConversationsApi.md#conversationsrename) | **POST** /conversations.rename | 
*ConversationsApi* | [**conversationsReplies**](docs/Api/ConversationsApi.md#conversationsreplies) | **GET** /conversations.replies | 
*ConversationsApi* | [**conversationsSetPurpose**](docs/Api/ConversationsApi.md#conversationssetpurpose) | **POST** /conversations.setPurpose | 
*ConversationsApi* | [**conversationsSetTopic**](docs/Api/ConversationsApi.md#conversationssettopic) | **POST** /conversations.setTopic | 
*ConversationsApi* | [**conversationsUnarchive**](docs/Api/ConversationsApi.md#conversationsunarchive) | **POST** /conversations.unarchive | 
*DialogApi* | [**dialogOpen**](docs/Api/DialogApi.md#dialogopen) | **GET** /dialog.open | 
*DndApi* | [**dndEndDnd**](docs/Api/DndApi.md#dndenddnd) | **POST** /dnd.endDnd | 
*DndApi* | [**dndEndSnooze**](docs/Api/DndApi.md#dndendsnooze) | **POST** /dnd.endSnooze | 
*DndApi* | [**dndInfo**](docs/Api/DndApi.md#dndinfo) | **GET** /dnd.info | 
*DndApi* | [**dndSetSnooze**](docs/Api/DndApi.md#dndsetsnooze) | **POST** /dnd.setSnooze | 
*DndApi* | [**dndTeamInfo**](docs/Api/DndApi.md#dndteaminfo) | **GET** /dnd.teamInfo | 
*EmojiApi* | [**emojiList**](docs/Api/EmojiApi.md#emojilist) | **GET** /emoji.list | 
*FilesApi* | [**filesCommentsDelete**](docs/Api/FilesApi.md#filescommentsdelete) | **POST** /files.comments.delete | 
*FilesApi* | [**filesDelete**](docs/Api/FilesApi.md#filesdelete) | **POST** /files.delete | 
*FilesApi* | [**filesInfo**](docs/Api/FilesApi.md#filesinfo) | **GET** /files.info | 
*FilesApi* | [**filesList**](docs/Api/FilesApi.md#fileslist) | **GET** /files.list | 
*FilesApi* | [**filesRemoteAdd**](docs/Api/FilesApi.md#filesremoteadd) | **POST** /files.remote.add | 
*FilesApi* | [**filesRemoteInfo**](docs/Api/FilesApi.md#filesremoteinfo) | **GET** /files.remote.info | 
*FilesApi* | [**filesRemoteList**](docs/Api/FilesApi.md#filesremotelist) | **GET** /files.remote.list | 
*FilesApi* | [**filesRemoteRemove**](docs/Api/FilesApi.md#filesremoteremove) | **POST** /files.remote.remove | 
*FilesApi* | [**filesRemoteShare**](docs/Api/FilesApi.md#filesremoteshare) | **GET** /files.remote.share | 
*FilesApi* | [**filesRemoteUpdate**](docs/Api/FilesApi.md#filesremoteupdate) | **POST** /files.remote.update | 
*FilesApi* | [**filesRevokePublicURL**](docs/Api/FilesApi.md#filesrevokepublicurl) | **POST** /files.revokePublicURL | 
*FilesApi* | [**filesSharedPublicURL**](docs/Api/FilesApi.md#filessharedpublicurl) | **POST** /files.sharedPublicURL | 
*FilesApi* | [**filesUpload**](docs/Api/FilesApi.md#filesupload) | **POST** /files.upload | 
*FilesCommentsApi* | [**filesCommentsDelete**](docs/Api/FilesCommentsApi.md#filescommentsdelete) | **POST** /files.comments.delete | 
*FilesRemoteApi* | [**filesRemoteAdd**](docs/Api/FilesRemoteApi.md#filesremoteadd) | **POST** /files.remote.add | 
*FilesRemoteApi* | [**filesRemoteInfo**](docs/Api/FilesRemoteApi.md#filesremoteinfo) | **GET** /files.remote.info | 
*FilesRemoteApi* | [**filesRemoteList**](docs/Api/FilesRemoteApi.md#filesremotelist) | **GET** /files.remote.list | 
*FilesRemoteApi* | [**filesRemoteRemove**](docs/Api/FilesRemoteApi.md#filesremoteremove) | **POST** /files.remote.remove | 
*FilesRemoteApi* | [**filesRemoteShare**](docs/Api/FilesRemoteApi.md#filesremoteshare) | **GET** /files.remote.share | 
*FilesRemoteApi* | [**filesRemoteUpdate**](docs/Api/FilesRemoteApi.md#filesremoteupdate) | **POST** /files.remote.update | 
*MigrationApi* | [**migrationExchange**](docs/Api/MigrationApi.md#migrationexchange) | **GET** /migration.exchange | 
*OauthApi* | [**oauthAccess**](docs/Api/OauthApi.md#oauthaccess) | **GET** /oauth.access | 
*OauthApi* | [**oauthToken**](docs/Api/OauthApi.md#oauthtoken) | **GET** /oauth.token | 
*OauthApi* | [**oauthV2Access**](docs/Api/OauthApi.md#oauthv2access) | **GET** /oauth.v2.access | 
*OauthV2Api* | [**oauthV2Access**](docs/Api/OauthV2Api.md#oauthv2access) | **GET** /oauth.v2.access | 
*PinsApi* | [**pinsAdd**](docs/Api/PinsApi.md#pinsadd) | **POST** /pins.add | 
*PinsApi* | [**pinsList**](docs/Api/PinsApi.md#pinslist) | **GET** /pins.list | 
*PinsApi* | [**pinsRemove**](docs/Api/PinsApi.md#pinsremove) | **POST** /pins.remove | 
*ReactionsApi* | [**reactionsAdd**](docs/Api/ReactionsApi.md#reactionsadd) | **POST** /reactions.add | 
*ReactionsApi* | [**reactionsGet**](docs/Api/ReactionsApi.md#reactionsget) | **GET** /reactions.get | 
*ReactionsApi* | [**reactionsList**](docs/Api/ReactionsApi.md#reactionslist) | **GET** /reactions.list | 
*ReactionsApi* | [**reactionsRemove**](docs/Api/ReactionsApi.md#reactionsremove) | **POST** /reactions.remove | 
*RemindersApi* | [**remindersAdd**](docs/Api/RemindersApi.md#remindersadd) | **POST** /reminders.add | 
*RemindersApi* | [**remindersComplete**](docs/Api/RemindersApi.md#reminderscomplete) | **POST** /reminders.complete | 
*RemindersApi* | [**remindersDelete**](docs/Api/RemindersApi.md#remindersdelete) | **POST** /reminders.delete | 
*RemindersApi* | [**remindersInfo**](docs/Api/RemindersApi.md#remindersinfo) | **GET** /reminders.info | 
*RemindersApi* | [**remindersList**](docs/Api/RemindersApi.md#reminderslist) | **GET** /reminders.list | 
*RtmApi* | [**rtmConnect**](docs/Api/RtmApi.md#rtmconnect) | **GET** /rtm.connect | 
*SearchApi* | [**searchMessages**](docs/Api/SearchApi.md#searchmessages) | **GET** /search.messages | 
*StarsApi* | [**starsAdd**](docs/Api/StarsApi.md#starsadd) | **POST** /stars.add | 
*StarsApi* | [**starsList**](docs/Api/StarsApi.md#starslist) | **GET** /stars.list | 
*StarsApi* | [**starsRemove**](docs/Api/StarsApi.md#starsremove) | **POST** /stars.remove | 
*TeamApi* | [**teamAccessLogs**](docs/Api/TeamApi.md#teamaccesslogs) | **GET** /team.accessLogs | 
*TeamApi* | [**teamBillableInfo**](docs/Api/TeamApi.md#teambillableinfo) | **GET** /team.billableInfo | 
*TeamApi* | [**teamInfo**](docs/Api/TeamApi.md#teaminfo) | **GET** /team.info | 
*TeamApi* | [**teamIntegrationLogs**](docs/Api/TeamApi.md#teamintegrationlogs) | **GET** /team.integrationLogs | 
*TeamApi* | [**teamProfileGet**](docs/Api/TeamApi.md#teamprofileget) | **GET** /team.profile.get | 
*TeamProfileApi* | [**teamProfileGet**](docs/Api/TeamProfileApi.md#teamprofileget) | **GET** /team.profile.get | 
*UsergroupsApi* | [**usergroupsCreate**](docs/Api/UsergroupsApi.md#usergroupscreate) | **POST** /usergroups.create | 
*UsergroupsApi* | [**usergroupsDisable**](docs/Api/UsergroupsApi.md#usergroupsdisable) | **POST** /usergroups.disable | 
*UsergroupsApi* | [**usergroupsEnable**](docs/Api/UsergroupsApi.md#usergroupsenable) | **POST** /usergroups.enable | 
*UsergroupsApi* | [**usergroupsList**](docs/Api/UsergroupsApi.md#usergroupslist) | **GET** /usergroups.list | 
*UsergroupsApi* | [**usergroupsUpdate**](docs/Api/UsergroupsApi.md#usergroupsupdate) | **POST** /usergroups.update | 
*UsergroupsApi* | [**usergroupsUsersList**](docs/Api/UsergroupsApi.md#usergroupsuserslist) | **GET** /usergroups.users.list | 
*UsergroupsApi* | [**usergroupsUsersUpdate**](docs/Api/UsergroupsApi.md#usergroupsusersupdate) | **POST** /usergroups.users.update | 
*UsergroupsUsersApi* | [**usergroupsUsersList**](docs/Api/UsergroupsUsersApi.md#usergroupsuserslist) | **GET** /usergroups.users.list | 
*UsergroupsUsersApi* | [**usergroupsUsersUpdate**](docs/Api/UsergroupsUsersApi.md#usergroupsusersupdate) | **POST** /usergroups.users.update | 
*UsersApi* | [**usersConversations**](docs/Api/UsersApi.md#usersconversations) | **GET** /users.conversations | 
*UsersApi* | [**usersDeletePhoto**](docs/Api/UsersApi.md#usersdeletephoto) | **POST** /users.deletePhoto | 
*UsersApi* | [**usersGetPresence**](docs/Api/UsersApi.md#usersgetpresence) | **GET** /users.getPresence | 
*UsersApi* | [**usersIdentity**](docs/Api/UsersApi.md#usersidentity) | **GET** /users.identity | 
*UsersApi* | [**usersInfo**](docs/Api/UsersApi.md#usersinfo) | **GET** /users.info | 
*UsersApi* | [**usersList**](docs/Api/UsersApi.md#userslist) | **GET** /users.list | 
*UsersApi* | [**usersLookupByEmail**](docs/Api/UsersApi.md#userslookupbyemail) | **GET** /users.lookupByEmail | 
*UsersApi* | [**usersProfileGet**](docs/Api/UsersApi.md#usersprofileget) | **GET** /users.profile.get | 
*UsersApi* | [**usersProfileSet**](docs/Api/UsersApi.md#usersprofileset) | **POST** /users.profile.set | 
*UsersApi* | [**usersSetActive**](docs/Api/UsersApi.md#userssetactive) | **POST** /users.setActive | 
*UsersApi* | [**usersSetPhoto**](docs/Api/UsersApi.md#userssetphoto) | **POST** /users.setPhoto | 
*UsersApi* | [**usersSetPresence**](docs/Api/UsersApi.md#userssetpresence) | **POST** /users.setPresence | 
*UsersProfileApi* | [**usersProfileGet**](docs/Api/UsersProfileApi.md#usersprofileget) | **GET** /users.profile.get | 
*UsersProfileApi* | [**usersProfileSet**](docs/Api/UsersProfileApi.md#usersprofileset) | **POST** /users.profile.set | 
*ViewsApi* | [**viewsOpen**](docs/Api/ViewsApi.md#viewsopen) | **GET** /views.open | 
*ViewsApi* | [**viewsPublish**](docs/Api/ViewsApi.md#viewspublish) | **GET** /views.publish | 
*ViewsApi* | [**viewsPush**](docs/Api/ViewsApi.md#viewspush) | **GET** /views.push | 
*ViewsApi* | [**viewsUpdate**](docs/Api/ViewsApi.md#viewsupdate) | **GET** /views.update | 
*WorkflowsApi* | [**workflowsStepCompleted**](docs/Api/WorkflowsApi.md#workflowsstepcompleted) | **GET** /workflows.stepCompleted | 
*WorkflowsApi* | [**workflowsStepFailed**](docs/Api/WorkflowsApi.md#workflowsstepfailed) | **GET** /workflows.stepFailed | 
*WorkflowsApi* | [**workflowsUpdateStep**](docs/Api/WorkflowsApi.md#workflowsupdatestep) | **GET** /workflows.updateStep | 

## Models

- [APIMethodUsersGetPresence](docs/Model/APIMethodUsersGetPresence.md)
- [AdminConversationsArchiveErrorSchema](docs/Model/AdminConversationsArchiveErrorSchema.md)
- [AdminConversationsArchiveSchema](docs/Model/AdminConversationsArchiveSchema.md)
- [AdminConversationsConvertToPrivateErrorSchema](docs/Model/AdminConversationsConvertToPrivateErrorSchema.md)
- [AdminConversationsConvertToPrivateSchema](docs/Model/AdminConversationsConvertToPrivateSchema.md)
- [AdminConversationsCreateErrorSchema](docs/Model/AdminConversationsCreateErrorSchema.md)
- [AdminConversationsCreateSchema](docs/Model/AdminConversationsCreateSchema.md)
- [AdminConversationsDeleteErrorSchema](docs/Model/AdminConversationsDeleteErrorSchema.md)
- [AdminConversationsDeleteSchema](docs/Model/AdminConversationsDeleteSchema.md)
- [AdminConversationsDisconnectSharedErrorSchema](docs/Model/AdminConversationsDisconnectSharedErrorSchema.md)
- [AdminConversationsGetConversationPrefsSchema](docs/Model/AdminConversationsGetConversationPrefsSchema.md)
- [AdminConversationsGetConversationPrefsSchemaPrefs](docs/Model/AdminConversationsGetConversationPrefsSchemaPrefs.md)
- [AdminConversationsGetConversationPrefsSchemaPrefsCanThread](docs/Model/AdminConversationsGetConversationPrefsSchemaPrefsCanThread.md)
- [AdminConversationsGetTeamsErrorSchema](docs/Model/AdminConversationsGetTeamsErrorSchema.md)
- [AdminConversationsGetTeamsSchema](docs/Model/AdminConversationsGetTeamsSchema.md)
- [AdminConversationsGetTeamsSchemaResponseMetadata](docs/Model/AdminConversationsGetTeamsSchemaResponseMetadata.md)
- [AdminConversationsInviteErrorSchema](docs/Model/AdminConversationsInviteErrorSchema.md)
- [AdminConversationsInviteSchema](docs/Model/AdminConversationsInviteSchema.md)
- [AdminConversationsRenameSchema](docs/Model/AdminConversationsRenameSchema.md)
- [AdminConversationsRenameSchema1](docs/Model/AdminConversationsRenameSchema1.md)
- [AdminConversationsSearchErrorSchema](docs/Model/AdminConversationsSearchErrorSchema.md)
- [AdminConversationsSearchSchema](docs/Model/AdminConversationsSearchSchema.md)
- [AdminConversationsSetConversationPrefsErrorSchema](docs/Model/AdminConversationsSetConversationPrefsErrorSchema.md)
- [AdminConversationsSetConversationPrefsSchema](docs/Model/AdminConversationsSetConversationPrefsSchema.md)
- [AdminConversationsUnarchiveErrorSchema](docs/Model/AdminConversationsUnarchiveErrorSchema.md)
- [AdminConversationsUnarchiveErrorSchema1](docs/Model/AdminConversationsUnarchiveErrorSchema1.md)
- [AdminConversationsUnarchiveErrorSchema2](docs/Model/AdminConversationsUnarchiveErrorSchema2.md)
- [AdminConversationsUnarchiveSchema](docs/Model/AdminConversationsUnarchiveSchema.md)
- [ApiPermissionsScopesListSuccessSchema](docs/Model/ApiPermissionsScopesListSuccessSchema.md)
- [ApiPermissionsScopesListSuccessSchemaScopes](docs/Model/ApiPermissionsScopesListSuccessSchemaScopes.md)
- [ApiTestErrorSchema](docs/Model/ApiTestErrorSchema.md)
- [ApiTestSuccessSchema](docs/Model/ApiTestSuccessSchema.md)
- [AppsPermissionsInfoErrorSchema](docs/Model/AppsPermissionsInfoErrorSchema.md)
- [AppsPermissionsInfoSchema](docs/Model/AppsPermissionsInfoSchema.md)
- [AppsPermissionsInfoSchemaInfo](docs/Model/AppsPermissionsInfoSchemaInfo.md)
- [AppsPermissionsInfoSchemaInfoAppHome](docs/Model/AppsPermissionsInfoSchemaInfoAppHome.md)
- [AppsPermissionsInfoSchemaInfoTeam](docs/Model/AppsPermissionsInfoSchemaInfoTeam.md)
- [AppsPermissionsRequestErrorSchema](docs/Model/AppsPermissionsRequestErrorSchema.md)
- [AppsPermissionsRequestSchema](docs/Model/AppsPermissionsRequestSchema.md)
- [AppsPermissionsResourcesListErrorSchema](docs/Model/AppsPermissionsResourcesListErrorSchema.md)
- [AppsPermissionsResourcesListSuccessSchema](docs/Model/AppsPermissionsResourcesListSuccessSchema.md)
- [AppsPermissionsResourcesListSuccessSchemaResourcesInner](docs/Model/AppsPermissionsResourcesListSuccessSchemaResourcesInner.md)
- [AppsPermissionsResourcesListSuccessSchemaResponseMetadata](docs/Model/AppsPermissionsResourcesListSuccessSchemaResponseMetadata.md)
- [AppsPermissionsScopesListErrorSchema](docs/Model/AppsPermissionsScopesListErrorSchema.md)
- [AppsUninstallErrorSchema](docs/Model/AppsUninstallErrorSchema.md)
- [AppsUninstallSchema](docs/Model/AppsUninstallSchema.md)
- [AuthRevokeErrorSchema](docs/Model/AuthRevokeErrorSchema.md)
- [AuthRevokeSchema](docs/Model/AuthRevokeSchema.md)
- [AuthTestErrorSchema](docs/Model/AuthTestErrorSchema.md)
- [AuthTestSuccessSchema](docs/Model/AuthTestSuccessSchema.md)
- [BlocksInner](docs/Model/BlocksInner.md)
- [BotsInfoErrorSchema](docs/Model/BotsInfoErrorSchema.md)
- [BotsInfoSchema](docs/Model/BotsInfoSchema.md)
- [BotsInfoSchemaBot](docs/Model/BotsInfoSchemaBot.md)
- [BotsInfoSchemaBotIcons](docs/Model/BotsInfoSchemaBotIcons.md)
- [ChatDeleteErrorSchema](docs/Model/ChatDeleteErrorSchema.md)
- [ChatDeleteScheduledMessageErrorSchema](docs/Model/ChatDeleteScheduledMessageErrorSchema.md)
- [ChatDeleteScheduledMessageSchema](docs/Model/ChatDeleteScheduledMessageSchema.md)
- [ChatDeleteSuccessSchema](docs/Model/ChatDeleteSuccessSchema.md)
- [ChatGetPermalinkErrorSchema](docs/Model/ChatGetPermalinkErrorSchema.md)
- [ChatGetPermalinkSuccessSchema](docs/Model/ChatGetPermalinkSuccessSchema.md)
- [ChatMeMessageErrorSchema](docs/Model/ChatMeMessageErrorSchema.md)
- [ChatMeMessageSchema](docs/Model/ChatMeMessageSchema.md)
- [ChatPostEphemeralErrorSchema](docs/Model/ChatPostEphemeralErrorSchema.md)
- [ChatPostEphemeralSuccessSchema](docs/Model/ChatPostEphemeralSuccessSchema.md)
- [ChatPostMessageErrorSchema](docs/Model/ChatPostMessageErrorSchema.md)
- [ChatPostMessageSuccessSchema](docs/Model/ChatPostMessageSuccessSchema.md)
- [ChatScheduleMessageErrorSchema](docs/Model/ChatScheduleMessageErrorSchema.md)
- [ChatScheduleMessageSuccessSchema](docs/Model/ChatScheduleMessageSuccessSchema.md)
- [ChatScheduleMessageSuccessSchemaMessage](docs/Model/ChatScheduleMessageSuccessSchemaMessage.md)
- [ChatScheduledMessagesListErrorSchema](docs/Model/ChatScheduledMessagesListErrorSchema.md)
- [ChatScheduledMessagesListSchema](docs/Model/ChatScheduledMessagesListSchema.md)
- [ChatScheduledMessagesListSchemaScheduledMessagesInner](docs/Model/ChatScheduledMessagesListSchemaScheduledMessagesInner.md)
- [ChatUnfurlErrorSchema](docs/Model/ChatUnfurlErrorSchema.md)
- [ChatUnfurlSuccessSchema](docs/Model/ChatUnfurlSuccessSchema.md)
- [ChatUpdateErrorSchema](docs/Model/ChatUpdateErrorSchema.md)
- [ChatUpdateSuccessSchema](docs/Model/ChatUpdateSuccessSchema.md)
- [ConversationIMChannelObjectFromConversationsMethods](docs/Model/ConversationIMChannelObjectFromConversationsMethods.md)
- [ConversationIMChannelObjectFromConversationsMethodsSharesInner](docs/Model/ConversationIMChannelObjectFromConversationsMethodsSharesInner.md)
- [ConversationMPIMObject](docs/Model/ConversationMPIMObject.md)
- [ConversationObject](docs/Model/ConversationObject.md)
- [ConversationObjectDisplayCounts](docs/Model/ConversationObjectDisplayCounts.md)
- [ConversationObjectParentConversationInner](docs/Model/ConversationObjectParentConversationInner.md)
- [ConversationObjectSharesInner](docs/Model/ConversationObjectSharesInner.md)
- [ConversationsArchiveErrorSchema](docs/Model/ConversationsArchiveErrorSchema.md)
- [ConversationsArchiveSuccessSchema](docs/Model/ConversationsArchiveSuccessSchema.md)
- [ConversationsCloseErrorSchema](docs/Model/ConversationsCloseErrorSchema.md)
- [ConversationsCloseSuccessSchema](docs/Model/ConversationsCloseSuccessSchema.md)
- [ConversationsCreateErrorSchema](docs/Model/ConversationsCreateErrorSchema.md)
- [ConversationsCreateSuccessSchema](docs/Model/ConversationsCreateSuccessSchema.md)
- [ConversationsHistoryErrorSchema](docs/Model/ConversationsHistoryErrorSchema.md)
- [ConversationsHistorySuccessSchema](docs/Model/ConversationsHistorySuccessSchema.md)
- [ConversationsHistorySuccessSchemaChannelActionsTsInner](docs/Model/ConversationsHistorySuccessSchemaChannelActionsTsInner.md)
- [ConversationsInfoErrorSchema](docs/Model/ConversationsInfoErrorSchema.md)
- [ConversationsInfoSuccessSchema](docs/Model/ConversationsInfoSuccessSchema.md)
- [ConversationsInviteErrorSchema](docs/Model/ConversationsInviteErrorSchema.md)
- [ConversationsInviteErrorSchema1](docs/Model/ConversationsInviteErrorSchema1.md)
- [ConversationsJoinErrorSchema](docs/Model/ConversationsJoinErrorSchema.md)
- [ConversationsJoinSuccessSchema](docs/Model/ConversationsJoinSuccessSchema.md)
- [ConversationsKickErrorSchema](docs/Model/ConversationsKickErrorSchema.md)
- [ConversationsKickSuccessSchema](docs/Model/ConversationsKickSuccessSchema.md)
- [ConversationsLeaveErrorSchema](docs/Model/ConversationsLeaveErrorSchema.md)
- [ConversationsLeaveSuccessSchema](docs/Model/ConversationsLeaveSuccessSchema.md)
- [ConversationsListErrorSchema](docs/Model/ConversationsListErrorSchema.md)
- [ConversationsListSuccessSchema](docs/Model/ConversationsListSuccessSchema.md)
- [ConversationsMarkErrorSchema](docs/Model/ConversationsMarkErrorSchema.md)
- [ConversationsMarkSuccessSchema](docs/Model/ConversationsMarkSuccessSchema.md)
- [ConversationsMembersErrorSchema](docs/Model/ConversationsMembersErrorSchema.md)
- [ConversationsMembersSuccessSchema](docs/Model/ConversationsMembersSuccessSchema.md)
- [ConversationsOpenErrorSchema](docs/Model/ConversationsOpenErrorSchema.md)
- [ConversationsOpenSuccessSchema](docs/Model/ConversationsOpenSuccessSchema.md)
- [ConversationsOpenSuccessSchemaChannelInner](docs/Model/ConversationsOpenSuccessSchemaChannelInner.md)
- [ConversationsOpenSuccessSchemaChannelInnerAnyOf](docs/Model/ConversationsOpenSuccessSchemaChannelInnerAnyOf.md)
- [ConversationsRenameErrorSchema](docs/Model/ConversationsRenameErrorSchema.md)
- [ConversationsRenameSuccessSchema](docs/Model/ConversationsRenameSuccessSchema.md)
- [ConversationsRepliesErrorSchema](docs/Model/ConversationsRepliesErrorSchema.md)
- [ConversationsRepliesSuccessSchema](docs/Model/ConversationsRepliesSuccessSchema.md)
- [ConversationsRepliesSuccessSchemaMessagesInnerInner](docs/Model/ConversationsRepliesSuccessSchemaMessagesInnerInner.md)
- [ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf](docs/Model/ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf.md)
- [ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf1](docs/Model/ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf1.md)
- [ConversationsSetPurposeErrorSchema](docs/Model/ConversationsSetPurposeErrorSchema.md)
- [ConversationsSetPurposeSuccessSchema](docs/Model/ConversationsSetPurposeSuccessSchema.md)
- [ConversationsSetTopicErrorSchema](docs/Model/ConversationsSetTopicErrorSchema.md)
- [ConversationsSetTopicSuccessSchema](docs/Model/ConversationsSetTopicSuccessSchema.md)
- [ConversationsUnarchiveErrorSchema](docs/Model/ConversationsUnarchiveErrorSchema.md)
- [ConversationsUnarchiveSuccessSchema](docs/Model/ConversationsUnarchiveSuccessSchema.md)
- [DefaultErrorTemplate](docs/Model/DefaultErrorTemplate.md)
- [DefaultSuccessTemplate](docs/Model/DefaultSuccessTemplate.md)
- [DefsOkFalse](docs/Model/DefsOkFalse.md)
- [DefsOkTrue](docs/Model/DefsOkTrue.md)
- [DeprecationWarning](docs/Model/DeprecationWarning.md)
- [DeprecationWarningAndPagingStyleTogether](docs/Model/DeprecationWarningAndPagingStyleTogether.md)
- [DialogOpenErrorSchema](docs/Model/DialogOpenErrorSchema.md)
- [DialogOpenSchema](docs/Model/DialogOpenSchema.md)
- [DndEndDndErrorSchema](docs/Model/DndEndDndErrorSchema.md)
- [DndEndDndSchema](docs/Model/DndEndDndSchema.md)
- [DndEndSnoozeErrorSchema](docs/Model/DndEndSnoozeErrorSchema.md)
- [DndEndSnoozeSchema](docs/Model/DndEndSnoozeSchema.md)
- [DndInfoErrorSchema](docs/Model/DndInfoErrorSchema.md)
- [DndInfoSchema](docs/Model/DndInfoSchema.md)
- [DndSetSnoozeErrorSchema](docs/Model/DndSetSnoozeErrorSchema.md)
- [DndSetSnoozeSchema](docs/Model/DndSetSnoozeSchema.md)
- [ErrorsIsReturnedWhenAnErrorAssociatesAnUserInner](docs/Model/ErrorsIsReturnedWhenAnErrorAssociatesAnUserInner.md)
- [FilePin](docs/Model/FilePin.md)
- [FilesCommentsDeleteErrorSchema](docs/Model/FilesCommentsDeleteErrorSchema.md)
- [FilesCommentsDeleteSchema](docs/Model/FilesCommentsDeleteSchema.md)
- [FilesDeleteErrorSchema](docs/Model/FilesDeleteErrorSchema.md)
- [FilesDeleteSchema](docs/Model/FilesDeleteSchema.md)
- [FilesInfoErrorSchema](docs/Model/FilesInfoErrorSchema.md)
- [FilesInfoSchema](docs/Model/FilesInfoSchema.md)
- [FilesListErrorSchema](docs/Model/FilesListErrorSchema.md)
- [FilesListSchema](docs/Model/FilesListSchema.md)
- [FilesRevokePublicURLErrorSchema](docs/Model/FilesRevokePublicURLErrorSchema.md)
- [FilesRevokePublicURLSchema](docs/Model/FilesRevokePublicURLSchema.md)
- [FilesSharedPublicURLErrorSchema](docs/Model/FilesSharedPublicURLErrorSchema.md)
- [FilesSharedPublicURLSchema](docs/Model/FilesSharedPublicURLSchema.md)
- [FilesUploadErrorSchema](docs/Model/FilesUploadErrorSchema.md)
- [FilesUploadSchema](docs/Model/FilesUploadSchema.md)
- [MessageObject](docs/Model/MessageObject.md)
- [MessagePin](docs/Model/MessagePin.md)
- [MigrationExchangeErrorSchema](docs/Model/MigrationExchangeErrorSchema.md)
- [MigrationExchangeSuccessSchema](docs/Model/MigrationExchangeSuccessSchema.md)
- [NewPagingStyle](docs/Model/NewPagingStyle.md)
- [ObjsBotProfile](docs/Model/ObjsBotProfile.md)
- [ObjsChannel](docs/Model/ObjsChannel.md)
- [ObjsChannelLatestInner](docs/Model/ObjsChannelLatestInner.md)
- [ObjsChannelPurpose](docs/Model/ObjsChannelPurpose.md)
- [ObjsComment](docs/Model/ObjsComment.md)
- [ObjsConversationInner](docs/Model/ObjsConversationInner.md)
- [ObjsEnterpriseUser](docs/Model/ObjsEnterpriseUser.md)
- [ObjsExternalOrgMigrations](docs/Model/ObjsExternalOrgMigrations.md)
- [ObjsExternalOrgMigrationsCurrentInner](docs/Model/ObjsExternalOrgMigrationsCurrentInner.md)
- [ObjsFile](docs/Model/ObjsFile.md)
- [ObjsFileShares](docs/Model/ObjsFileShares.md)
- [ObjsIcon](docs/Model/ObjsIcon.md)
- [ObjsMessage](docs/Model/ObjsMessage.md)
- [ObjsMessageAttachmentsInner](docs/Model/ObjsMessageAttachmentsInner.md)
- [ObjsMessageBotIdInner](docs/Model/ObjsMessageBotIdInner.md)
- [ObjsMessageIcons](docs/Model/ObjsMessageIcons.md)
- [ObjsPaging](docs/Model/ObjsPaging.md)
- [ObjsPrimaryOwner](docs/Model/ObjsPrimaryOwner.md)
- [ObjsReaction](docs/Model/ObjsReaction.md)
- [ObjsReminder](docs/Model/ObjsReminder.md)
- [ObjsResources](docs/Model/ObjsResources.md)
- [ObjsResourcesExcludedIdsInnerInner](docs/Model/ObjsResourcesExcludedIdsInnerInner.md)
- [ObjsResponseMetadataInner](docs/Model/ObjsResponseMetadataInner.md)
- [ObjsSubteam](docs/Model/ObjsSubteam.md)
- [ObjsSubteamAutoTypeInner](docs/Model/ObjsSubteamAutoTypeInner.md)
- [ObjsSubteamDeletedByInner](docs/Model/ObjsSubteamDeletedByInner.md)
- [ObjsSubteamPrefs](docs/Model/ObjsSubteamPrefs.md)
- [ObjsTeam](docs/Model/ObjsTeam.md)
- [ObjsTeamDiscoverableInner](docs/Model/ObjsTeamDiscoverableInner.md)
- [ObjsTeamProfileField](docs/Model/ObjsTeamProfileField.md)
- [ObjsTeamProfileFieldOption](docs/Model/ObjsTeamProfileFieldOption.md)
- [ObjsTeamProfileFieldOptionsInner](docs/Model/ObjsTeamProfileFieldOptionsInner.md)
- [ObjsTeamSsoProvider](docs/Model/ObjsTeamSsoProvider.md)
- [ObjsUserInner](docs/Model/ObjsUserInner.md)
- [ObjsUserInnerAnyOf](docs/Model/ObjsUserInnerAnyOf.md)
- [ObjsUserInnerAnyOf1](docs/Model/ObjsUserInnerAnyOf1.md)
- [ObjsUserInnerAnyOfTeamProfile](docs/Model/ObjsUserInnerAnyOfTeamProfile.md)
- [ObjsUserProfile](docs/Model/ObjsUserProfile.md)
- [ObjsUserProfileShort](docs/Model/ObjsUserProfileShort.md)
- [PinsAddErrorSchema](docs/Model/PinsAddErrorSchema.md)
- [PinsAddSchema](docs/Model/PinsAddSchema.md)
- [PinsListErrorSchema](docs/Model/PinsListErrorSchema.md)
- [PinsListSuccessSchemaInner](docs/Model/PinsListSuccessSchemaInner.md)
- [PinsListSuccessSchemaInnerAnyOf](docs/Model/PinsListSuccessSchemaInnerAnyOf.md)
- [PinsListSuccessSchemaInnerAnyOf1](docs/Model/PinsListSuccessSchemaInnerAnyOf1.md)
- [PinsListSuccessSchemaInnerAnyOfItemsInner](docs/Model/PinsListSuccessSchemaInnerAnyOfItemsInner.md)
- [PinsRemoveErrorSchema](docs/Model/PinsRemoveErrorSchema.md)
- [PinsRemoveSchema](docs/Model/PinsRemoveSchema.md)
- [ReactionsAddErrorSchema](docs/Model/ReactionsAddErrorSchema.md)
- [ReactionsAddSchema](docs/Model/ReactionsAddSchema.md)
- [ReactionsGetErrorSchema](docs/Model/ReactionsGetErrorSchema.md)
- [ReactionsGetSuccessSchemaInner](docs/Model/ReactionsGetSuccessSchemaInner.md)
- [ReactionsGetSuccessSchemaInnerAnyOf](docs/Model/ReactionsGetSuccessSchemaInnerAnyOf.md)
- [ReactionsGetSuccessSchemaInnerAnyOf1](docs/Model/ReactionsGetSuccessSchemaInnerAnyOf1.md)
- [ReactionsGetSuccessSchemaInnerAnyOf2](docs/Model/ReactionsGetSuccessSchemaInnerAnyOf2.md)
- [ReactionsListErrorSchema](docs/Model/ReactionsListErrorSchema.md)
- [ReactionsListSchema](docs/Model/ReactionsListSchema.md)
- [ReactionsListSchemaItemsInnerInner](docs/Model/ReactionsListSchemaItemsInnerInner.md)
- [ReactionsListSchemaItemsInnerInnerAnyOf](docs/Model/ReactionsListSchemaItemsInnerInnerAnyOf.md)
- [ReactionsListSchemaItemsInnerInnerAnyOf1](docs/Model/ReactionsListSchemaItemsInnerInnerAnyOf1.md)
- [ReactionsListSchemaItemsInnerInnerAnyOf2](docs/Model/ReactionsListSchemaItemsInnerInnerAnyOf2.md)
- [ReactionsRemoveErrorSchema](docs/Model/ReactionsRemoveErrorSchema.md)
- [ReactionsRemoveSchema](docs/Model/ReactionsRemoveSchema.md)
- [RemindersAddErrorSchema](docs/Model/RemindersAddErrorSchema.md)
- [RemindersAddSchema](docs/Model/RemindersAddSchema.md)
- [RemindersCompleteErrorSchema](docs/Model/RemindersCompleteErrorSchema.md)
- [RemindersCompleteSchema](docs/Model/RemindersCompleteSchema.md)
- [RemindersDeleteErrorSchema](docs/Model/RemindersDeleteErrorSchema.md)
- [RemindersDeleteSchema](docs/Model/RemindersDeleteSchema.md)
- [RemindersInfoErrorSchema](docs/Model/RemindersInfoErrorSchema.md)
- [RemindersInfoSchema](docs/Model/RemindersInfoSchema.md)
- [RemindersListErrorSchema](docs/Model/RemindersListErrorSchema.md)
- [RemindersListSchema](docs/Model/RemindersListSchema.md)
- [ResponseMetadata](docs/Model/ResponseMetadata.md)
- [RtmConnectErrorSchema](docs/Model/RtmConnectErrorSchema.md)
- [RtmConnectSchema](docs/Model/RtmConnectSchema.md)
- [RtmConnectSchemaSelf](docs/Model/RtmConnectSchemaSelf.md)
- [RtmConnectSchemaTeam](docs/Model/RtmConnectSchemaTeam.md)
- [StarsAddErrorSchema](docs/Model/StarsAddErrorSchema.md)
- [StarsAddSchema](docs/Model/StarsAddSchema.md)
- [StarsListErrorSchema](docs/Model/StarsListErrorSchema.md)
- [StarsListSchema](docs/Model/StarsListSchema.md)
- [StarsListSchemaItemsInnerInner](docs/Model/StarsListSchemaItemsInnerInner.md)
- [StarsListSchemaItemsInnerInnerAnyOf](docs/Model/StarsListSchemaItemsInnerInnerAnyOf.md)
- [StarsListSchemaItemsInnerInnerAnyOf1](docs/Model/StarsListSchemaItemsInnerInnerAnyOf1.md)
- [StarsListSchemaItemsInnerInnerAnyOf2](docs/Model/StarsListSchemaItemsInnerInnerAnyOf2.md)
- [StarsListSchemaItemsInnerInnerAnyOf3](docs/Model/StarsListSchemaItemsInnerInnerAnyOf3.md)
- [StarsListSchemaItemsInnerInnerAnyOf4](docs/Model/StarsListSchemaItemsInnerInnerAnyOf4.md)
- [StarsListSchemaItemsInnerInnerAnyOf5](docs/Model/StarsListSchemaItemsInnerInnerAnyOf5.md)
- [StarsRemoveErrorSchema](docs/Model/StarsRemoveErrorSchema.md)
- [StarsRemoveSchema](docs/Model/StarsRemoveSchema.md)
- [TeamAccessLogsErrorSchema](docs/Model/TeamAccessLogsErrorSchema.md)
- [TeamAccessLogsSchema](docs/Model/TeamAccessLogsSchema.md)
- [TeamAccessLogsSchemaLoginsInner](docs/Model/TeamAccessLogsSchemaLoginsInner.md)
- [TeamInfoErrorSchema](docs/Model/TeamInfoErrorSchema.md)
- [TeamInfoSchema](docs/Model/TeamInfoSchema.md)
- [TeamIntegrationLogsErrorSchema](docs/Model/TeamIntegrationLogsErrorSchema.md)
- [TeamIntegrationLogsSchema](docs/Model/TeamIntegrationLogsSchema.md)
- [TeamIntegrationLogsSchemaLogsInner](docs/Model/TeamIntegrationLogsSchemaLogsInner.md)
- [TeamProfileGetErrorSchema](docs/Model/TeamProfileGetErrorSchema.md)
- [TeamProfileGetSuccessSchema](docs/Model/TeamProfileGetSuccessSchema.md)
- [TeamProfileGetSuccessSchemaProfile](docs/Model/TeamProfileGetSuccessSchemaProfile.md)
- [UsergroupsCreateErrorSchema](docs/Model/UsergroupsCreateErrorSchema.md)
- [UsergroupsCreateSchema](docs/Model/UsergroupsCreateSchema.md)
- [UsergroupsDisableErrorSchema](docs/Model/UsergroupsDisableErrorSchema.md)
- [UsergroupsDisableSchema](docs/Model/UsergroupsDisableSchema.md)
- [UsergroupsEnableErrorSchema](docs/Model/UsergroupsEnableErrorSchema.md)
- [UsergroupsEnableSchema](docs/Model/UsergroupsEnableSchema.md)
- [UsergroupsListErrorSchema](docs/Model/UsergroupsListErrorSchema.md)
- [UsergroupsListSchema](docs/Model/UsergroupsListSchema.md)
- [UsergroupsUpdateErrorSchema](docs/Model/UsergroupsUpdateErrorSchema.md)
- [UsergroupsUpdateSchema](docs/Model/UsergroupsUpdateSchema.md)
- [UsergroupsUsersListErrorSchema](docs/Model/UsergroupsUsersListErrorSchema.md)
- [UsergroupsUsersListSchema](docs/Model/UsergroupsUsersListSchema.md)
- [UsergroupsUsersUpdateErrorSchema](docs/Model/UsergroupsUsersUpdateErrorSchema.md)
- [UsergroupsUsersUpdateSchema](docs/Model/UsergroupsUsersUpdateSchema.md)
- [UsersConversationsErrorSchema](docs/Model/UsersConversationsErrorSchema.md)
- [UsersConversationsSuccessSchema](docs/Model/UsersConversationsSuccessSchema.md)
- [UsersCountsErrorSchema](docs/Model/UsersCountsErrorSchema.md)
- [UsersDeletePhotoErrorSchema](docs/Model/UsersDeletePhotoErrorSchema.md)
- [UsersDeletePhotoSchema](docs/Model/UsersDeletePhotoSchema.md)
- [UsersIdentityErrorSchema](docs/Model/UsersIdentityErrorSchema.md)
- [UsersIdentitySchemaInner](docs/Model/UsersIdentitySchemaInner.md)
- [UsersIdentitySchemaInnerAnyOf](docs/Model/UsersIdentitySchemaInnerAnyOf.md)
- [UsersIdentitySchemaInnerAnyOf1](docs/Model/UsersIdentitySchemaInnerAnyOf1.md)
- [UsersIdentitySchemaInnerAnyOf1User](docs/Model/UsersIdentitySchemaInnerAnyOf1User.md)
- [UsersIdentitySchemaInnerAnyOf2](docs/Model/UsersIdentitySchemaInnerAnyOf2.md)
- [UsersIdentitySchemaInnerAnyOf2User](docs/Model/UsersIdentitySchemaInnerAnyOf2User.md)
- [UsersIdentitySchemaInnerAnyOf3](docs/Model/UsersIdentitySchemaInnerAnyOf3.md)
- [UsersIdentitySchemaInnerAnyOf3Team](docs/Model/UsersIdentitySchemaInnerAnyOf3Team.md)
- [UsersIdentitySchemaInnerAnyOfTeam](docs/Model/UsersIdentitySchemaInnerAnyOfTeam.md)
- [UsersInfoErrorSchema](docs/Model/UsersInfoErrorSchema.md)
- [UsersInfoSuccessSchema](docs/Model/UsersInfoSuccessSchema.md)
- [UsersListErrorSchema](docs/Model/UsersListErrorSchema.md)
- [UsersListSchema](docs/Model/UsersListSchema.md)
- [UsersLookupByEmailErrorSchema](docs/Model/UsersLookupByEmailErrorSchema.md)
- [UsersLookupByEmailSuccessSchema](docs/Model/UsersLookupByEmailSuccessSchema.md)
- [UsersProfileGetErrorSchema](docs/Model/UsersProfileGetErrorSchema.md)
- [UsersProfileGetSchema](docs/Model/UsersProfileGetSchema.md)
- [UsersProfileSetErrorSchema](docs/Model/UsersProfileSetErrorSchema.md)
- [UsersProfileSetSchema](docs/Model/UsersProfileSetSchema.md)
- [UsersSetActiveErrorSchema](docs/Model/UsersSetActiveErrorSchema.md)
- [UsersSetActiveSchema](docs/Model/UsersSetActiveSchema.md)
- [UsersSetPhotoErrorSchema](docs/Model/UsersSetPhotoErrorSchema.md)
- [UsersSetPhotoSchema](docs/Model/UsersSetPhotoSchema.md)
- [UsersSetPhotoSchemaProfile](docs/Model/UsersSetPhotoSchemaProfile.md)
- [UsersSetPresenceErrorSchema](docs/Model/UsersSetPresenceErrorSchema.md)
- [UsersSetPresenceSchema](docs/Model/UsersSetPresenceSchema.md)

## Authorization

### slackAuth

- **Type**: `OAuth`
- **Flow**: `accessCode`
- **Authorization URL**: `https://slack.com/oauth/authorize`
- **Scopes**: 
    - **admin**: admin
    - **admin.apps:read**: admin.apps:read
    - **admin.apps:write**: admin.apps:write
    - **admin.conversations:read**: admin.conversations:read
    - **admin.conversations:write**: admin.conversations:write
    - **admin.invites:read**: admin.invites:read
    - **admin.invites:write**: admin.invites:write
    - **admin.teams:read**: admin.teams:read
    - **admin.teams:write**: admin.teams:write
    - **admin.usergroups:read**: admin.usergroups:read
    - **admin.usergroups:write**: admin.usergroups:write
    - **admin.users:read**: admin.users:read
    - **admin.users:write**: admin.users:write
    - **authorizations:read**: authorizations:read
    - **bot**: Bot user scope
    - **calls:read**: calls:read
    - **calls:write**: calls:write
    - **channels:history**: channels:history
    - **channels:manage**: channels:manage
    - **channels:read**: channels:read
    - **channels:write**: channels:write
    - **chat:write**: chat:write
    - **chat:write:bot**: Author messages as a bot
    - **chat:write:user**: Author messages as a user
    - **conversations:history**: conversations:history
    - **conversations:read**: conversations:read
    - **conversations:write**: conversations:write
    - **dnd:read**: dnd:read
    - **dnd:write**: dnd:write
    - **emoji:read**: emoji:read
    - **files:read**: files:read
    - **files:write:user**: files:write:user
    - **groups:history**: groups:history
    - **groups:read**: groups:read
    - **groups:write**: groups:write
    - **identity.basic**: identity.basic
    - **im:history**: im:history
    - **im:read**: im:read
    - **im:write**: im:write
    - **links:write**: links:write
    - **mpim:history**: mpim:history
    - **mpim:read**: mpim:read
    - **mpim:write**: mpim:write
    - **none**: No scope required
    - **pins:read**: pins:read
    - **pins:write**: pins:write
    - **reactions:read**: reactions:read
    - **reactions:write**: reactions:write
    - **reminders:read**: reminders:read
    - **reminders:write**: reminders:write
    - **remote_files:read**: remote_files:read
    - **remote_files:share**: remote_files:share
    - **remote_files:write**: remote_files:write
    - **rtm:stream**: rtm:stream
    - **search:read**: search:read
    - **stars:read**: stars:read
    - **stars:write**: stars:write
    - **team:read**: team:read
    - **tokens.basic**: tokens.basic
    - **usergroups:read**: usergroups:read
    - **usergroups:write**: usergroups:write
    - **users.profile:read**: users.profile:read
    - **users.profile:write**: users.profile:write
    - **users:read**: users:read
    - **users:read.email**: users:read.email
    - **users:write**: users:write
    - **workflow.steps:execute**: workflow.steps:execute

## Tests

To run the tests, use:

```bash
composer install
vendor/bin/phpunit
```

## Author



## About this package

This PHP package is automatically generated by the [OpenAPI Generator](https://openapi-generator.tech) project:

- API version: `1.7.0`
    - Package version: `1.7.0`
- Build package: `org.openapitools.codegen.languages.PhpClientCodegen`
