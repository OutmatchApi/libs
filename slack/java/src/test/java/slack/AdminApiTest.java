/*
 * Slack Web API
 * One way to interact with the Slack platform is its HTTP RPC-based Web API, a collection of methods requiring OAuth 2.0-based user, bot, or workspace tokens blessed with related OAuth scopes.
 *
 * The version of the OpenAPI document: 1.7.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package slack;

import invalidPackageName.ApiException;
import com.outmatchapi.slack.AdminConversationsArchiveErrorSchema;
import com.outmatchapi.slack.AdminConversationsArchiveSchema;
import com.outmatchapi.slack.AdminConversationsConvertToPrivateErrorSchema;
import com.outmatchapi.slack.AdminConversationsConvertToPrivateSchema;
import com.outmatchapi.slack.AdminConversationsCreateErrorSchema;
import com.outmatchapi.slack.AdminConversationsCreateSchema;
import com.outmatchapi.slack.AdminConversationsDeleteErrorSchema;
import com.outmatchapi.slack.AdminConversationsDeleteSchema;
import com.outmatchapi.slack.AdminConversationsDisconnectSharedErrorSchema;
import com.outmatchapi.slack.AdminConversationsGetConversationPrefsSchema;
import com.outmatchapi.slack.AdminConversationsGetTeamsErrorSchema;
import com.outmatchapi.slack.AdminConversationsGetTeamsSchema;
import com.outmatchapi.slack.AdminConversationsInviteErrorSchema;
import com.outmatchapi.slack.AdminConversationsInviteSchema;
import com.outmatchapi.slack.AdminConversationsRenameSchema;
import com.outmatchapi.slack.AdminConversationsRenameSchema1;
import com.outmatchapi.slack.AdminConversationsSearchErrorSchema;
import com.outmatchapi.slack.AdminConversationsSearchSchema;
import com.outmatchapi.slack.AdminConversationsSetConversationPrefsErrorSchema;
import com.outmatchapi.slack.AdminConversationsSetConversationPrefsSchema;
import com.outmatchapi.slack.AdminConversationsUnarchiveErrorSchema;
import com.outmatchapi.slack.AdminConversationsUnarchiveErrorSchema1;
import com.outmatchapi.slack.AdminConversationsUnarchiveErrorSchema2;
import com.outmatchapi.slack.AdminConversationsUnarchiveSchema;
import com.outmatchapi.slack.AdminInviteRequestsApproveRequest;
import com.outmatchapi.slack.DefaultErrorTemplate;
import com.outmatchapi.slack.DefaultSuccessTemplate;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AdminApi
 */
@Disabled
public class AdminApiTest {

    private final AdminApi api = new AdminApi();

    /**
     * Approve an app for installation on a workspace.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void adminAppsApproveTest() throws ApiException {
        String token = null;
        String appId = null;
        String requestId = null;
        String teamId = null;
        DefaultSuccessTemplate response = api.adminAppsApprove(token, appId, requestId, teamId);
        // TODO: test validations
    }

    /**
     * List approved apps for an org or workspace.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void adminAppsApprovedListTest() throws ApiException {
        String token = null;
        Integer limit = null;
        String cursor = null;
        String teamId = null;
        String enterpriseId = null;
        DefaultSuccessTemplate response = api.adminAppsApprovedList(token, limit, cursor, teamId, enterpriseId);
        // TODO: test validations
    }

    /**
     * List app requests for a team/workspace.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void adminAppsRequestsListTest() throws ApiException {
        String token = null;
        Integer limit = null;
        String cursor = null;
        String teamId = null;
        DefaultSuccessTemplate response = api.adminAppsRequestsList(token, limit, cursor, teamId);
        // TODO: test validations
    }

    /**
     * Restrict an app for installation on a workspace.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void adminAppsRestrictTest() throws ApiException {
        String token = null;
        String appId = null;
        String requestId = null;
        String teamId = null;
        DefaultSuccessTemplate response = api.adminAppsRestrict(token, appId, requestId, teamId);
        // TODO: test validations
    }

    /**
     * List restricted apps for an org or workspace.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void adminAppsRestrictedListTest() throws ApiException {
        String token = null;
        Integer limit = null;
        String cursor = null;
        String teamId = null;
        String enterpriseId = null;
        DefaultSuccessTemplate response = api.adminAppsRestrictedList(token, limit, cursor, teamId, enterpriseId);
        // TODO: test validations
    }

    /**
     * Archive a public or private channel.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void adminConversationsArchiveTest() throws ApiException {
        String token = null;
        String channelId = null;
        AdminConversationsArchiveSchema response = api.adminConversationsArchive(token, channelId);
        // TODO: test validations
    }

    /**
     * Convert a public channel to a private channel.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void adminConversationsConvertToPrivateTest() throws ApiException {
        String token = null;
        String channelId = null;
        AdminConversationsConvertToPrivateSchema response = api.adminConversationsConvertToPrivate(token, channelId);
        // TODO: test validations
    }

    /**
     * Create a public or private channel-based conversation.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void adminConversationsCreateTest() throws ApiException {
        String token = null;
        Boolean isPrivate = null;
        String name = null;
        String description = null;
        Boolean orgWide = null;
        String teamId = null;
        AdminConversationsCreateSchema response = api.adminConversationsCreate(token, isPrivate, name, description, orgWide, teamId);
        // TODO: test validations
    }

    /**
     * Delete a public or private channel.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void adminConversationsDeleteTest() throws ApiException {
        String token = null;
        String channelId = null;
        AdminConversationsDeleteSchema response = api.adminConversationsDelete(token, channelId);
        // TODO: test validations
    }

    /**
     * Disconnect a connected channel from one or more workspaces.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void adminConversationsDisconnectSharedTest() throws ApiException {
        String token = null;
        String channelId = null;
        String leavingTeamIds = null;
        AdminConversationsRenameSchema response = api.adminConversationsDisconnectShared(token, channelId, leavingTeamIds);
        // TODO: test validations
    }

    /**
     * List all disconnected channelsâ€”i.e., channels that were once connected to other workspaces and then disconnectedâ€”and the corresponding original channel IDs for key revocation with EKM.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void adminConversationsEkmListOriginalConnectedChannelInfoTest() throws ApiException {
        String token = null;
        String channelIds = null;
        String teamIds = null;
        Integer limit = null;
        String cursor = null;
        DefaultSuccessTemplate response = api.adminConversationsEkmListOriginalConnectedChannelInfo(token, channelIds, teamIds, limit, cursor);
        // TODO: test validations
    }

    /**
     * Get conversation preferences for a public or private channel.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void adminConversationsGetConversationPrefsTest() throws ApiException {
        String token = null;
        String channelId = null;
        AdminConversationsGetConversationPrefsSchema response = api.adminConversationsGetConversationPrefs(token, channelId);
        // TODO: test validations
    }

    /**
     * Get all the workspaces a given public or private channel is connected to within this Enterprise org.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void adminConversationsGetTeamsTest() throws ApiException {
        String token = null;
        String channelId = null;
        String cursor = null;
        Integer limit = null;
        AdminConversationsGetTeamsSchema response = api.adminConversationsGetTeams(token, channelId, cursor, limit);
        // TODO: test validations
    }

    /**
     * Invite a user to a public or private channel.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void adminConversationsInviteTest() throws ApiException {
        String token = null;
        String channelId = null;
        String userIds = null;
        AdminConversationsInviteSchema response = api.adminConversationsInvite(token, channelId, userIds);
        // TODO: test validations
    }

    /**
     * Rename a public or private channel.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void adminConversationsRenameTest() throws ApiException {
        String token = null;
        String channelId = null;
        String name = null;
        AdminConversationsRenameSchema1 response = api.adminConversationsRename(token, channelId, name);
        // TODO: test validations
    }

    /**
     * Add an allowlist of IDP groups for accessing a channel
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void adminConversationsRestrictAccessAddGroupTest() throws ApiException {
        String channelId = null;
        String groupId = null;
        String token = null;
        String teamId = null;
        DefaultSuccessTemplate response = api.adminConversationsRestrictAccessAddGroup(channelId, groupId, token, teamId);
        // TODO: test validations
    }

    /**
     * List all IDP Groups linked to a channel
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void adminConversationsRestrictAccessListGroupsTest() throws ApiException {
        String token = null;
        String channelId = null;
        String teamId = null;
        DefaultSuccessTemplate response = api.adminConversationsRestrictAccessListGroups(token, channelId, teamId);
        // TODO: test validations
    }

    /**
     * Remove a linked IDP group linked from a private channel
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void adminConversationsRestrictAccessRemoveGroupTest() throws ApiException {
        String channelId = null;
        String groupId = null;
        String teamId = null;
        String token = null;
        DefaultSuccessTemplate response = api.adminConversationsRestrictAccessRemoveGroup(channelId, groupId, teamId, token);
        // TODO: test validations
    }

    /**
     * Search for public or private channels in an Enterprise organization.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void adminConversationsSearchTest() throws ApiException {
        String token = null;
        String teamIds = null;
        String query = null;
        Integer limit = null;
        String cursor = null;
        String searchChannelTypes = null;
        String sort = null;
        String sortDir = null;
        AdminConversationsSearchSchema response = api.adminConversationsSearch(token, teamIds, query, limit, cursor, searchChannelTypes, sort, sortDir);
        // TODO: test validations
    }

    /**
     * Set the posting permissions for a public or private channel.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void adminConversationsSetConversationPrefsTest() throws ApiException {
        String token = null;
        String channelId = null;
        String prefs = null;
        AdminConversationsSetConversationPrefsSchema response = api.adminConversationsSetConversationPrefs(token, channelId, prefs);
        // TODO: test validations
    }

    /**
     * Set the workspaces in an Enterprise grid org that connect to a public or private channel.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void adminConversationsSetTeamsTest() throws ApiException {
        String token = null;
        String channelId = null;
        Boolean orgChannel = null;
        String targetTeamIds = null;
        String teamId = null;
        DefaultSuccessTemplate response = api.adminConversationsSetTeams(token, channelId, orgChannel, targetTeamIds, teamId);
        // TODO: test validations
    }

    /**
     * Unarchive a public or private channel.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void adminConversationsUnarchiveTest() throws ApiException {
        String token = null;
        String channelId = null;
        AdminConversationsUnarchiveSchema response = api.adminConversationsUnarchive(token, channelId);
        // TODO: test validations
    }

    /**
     * Add an emoji.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void adminEmojiAddTest() throws ApiException {
        String name = null;
        String token = null;
        String url = null;
        DefaultSuccessTemplate response = api.adminEmojiAdd(name, token, url);
        // TODO: test validations
    }

    /**
     * Add an emoji alias.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void adminEmojiAddAliasTest() throws ApiException {
        String aliasFor = null;
        String name = null;
        String token = null;
        DefaultSuccessTemplate response = api.adminEmojiAddAlias(aliasFor, name, token);
        // TODO: test validations
    }

    /**
     * List emoji for an Enterprise Grid organization.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void adminEmojiListTest() throws ApiException {
        String token = null;
        String cursor = null;
        Integer limit = null;
        DefaultSuccessTemplate response = api.adminEmojiList(token, cursor, limit);
        // TODO: test validations
    }

    /**
     * Remove an emoji across an Enterprise Grid organization
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void adminEmojiRemoveTest() throws ApiException {
        String name = null;
        String token = null;
        DefaultSuccessTemplate response = api.adminEmojiRemove(name, token);
        // TODO: test validations
    }

    /**
     * Rename an emoji.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void adminEmojiRenameTest() throws ApiException {
        String name = null;
        String newName = null;
        String token = null;
        DefaultSuccessTemplate response = api.adminEmojiRename(name, newName, token);
        // TODO: test validations
    }

    /**
     * Approve a workspace invite request.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void adminInviteRequestsApproveTest() throws ApiException {
        String token = null;
        AdminInviteRequestsApproveRequest adminInviteRequestsApproveRequest = null;
        DefaultSuccessTemplate response = api.adminInviteRequestsApprove(token, adminInviteRequestsApproveRequest);
        // TODO: test validations
    }

    /**
     * List all approved workspace invite requests.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void adminInviteRequestsApprovedListTest() throws ApiException {
        String token = null;
        String teamId = null;
        String cursor = null;
        Integer limit = null;
        DefaultSuccessTemplate response = api.adminInviteRequestsApprovedList(token, teamId, cursor, limit);
        // TODO: test validations
    }

    /**
     * List all denied workspace invite requests.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void adminInviteRequestsDeniedListTest() throws ApiException {
        String token = null;
        String teamId = null;
        String cursor = null;
        Integer limit = null;
        DefaultSuccessTemplate response = api.adminInviteRequestsDeniedList(token, teamId, cursor, limit);
        // TODO: test validations
    }

    /**
     * Deny a workspace invite request.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void adminInviteRequestsDenyTest() throws ApiException {
        String token = null;
        AdminInviteRequestsApproveRequest adminInviteRequestsApproveRequest = null;
        DefaultSuccessTemplate response = api.adminInviteRequestsDeny(token, adminInviteRequestsApproveRequest);
        // TODO: test validations
    }

    /**
     * List all pending workspace invite requests.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void adminInviteRequestsListTest() throws ApiException {
        String token = null;
        String teamId = null;
        String cursor = null;
        Integer limit = null;
        DefaultSuccessTemplate response = api.adminInviteRequestsList(token, teamId, cursor, limit);
        // TODO: test validations
    }

    /**
     * List all of the admins on a given workspace.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void adminTeamsAdminsListTest() throws ApiException {
        String token = null;
        String teamId = null;
        Integer limit = null;
        String cursor = null;
        DefaultSuccessTemplate response = api.adminTeamsAdminsList(token, teamId, limit, cursor);
        // TODO: test validations
    }

    /**
     * Create an Enterprise team.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void adminTeamsCreateTest() throws ApiException {
        String token = null;
        String teamDomain = null;
        String teamName = null;
        String teamDescription = null;
        String teamDiscoverability = null;
        DefaultSuccessTemplate response = api.adminTeamsCreate(token, teamDomain, teamName, teamDescription, teamDiscoverability);
        // TODO: test validations
    }

    /**
     * List all teams on an Enterprise organization
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void adminTeamsListTest() throws ApiException {
        String token = null;
        Integer limit = null;
        String cursor = null;
        DefaultSuccessTemplate response = api.adminTeamsList(token, limit, cursor);
        // TODO: test validations
    }

    /**
     * List all of the owners on a given workspace.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void adminTeamsOwnersListTest() throws ApiException {
        String token = null;
        String teamId = null;
        Integer limit = null;
        String cursor = null;
        DefaultSuccessTemplate response = api.adminTeamsOwnersList(token, teamId, limit, cursor);
        // TODO: test validations
    }

    /**
     * Fetch information about settings in a workspace
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void adminTeamsSettingsInfoTest() throws ApiException {
        String token = null;
        String teamId = null;
        DefaultSuccessTemplate response = api.adminTeamsSettingsInfo(token, teamId);
        // TODO: test validations
    }

    /**
     * Set the default channels of a workspace.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void adminTeamsSettingsSetDefaultChannelsTest() throws ApiException {
        String channelIds = null;
        String teamId = null;
        String token = null;
        DefaultSuccessTemplate response = api.adminTeamsSettingsSetDefaultChannels(channelIds, teamId, token);
        // TODO: test validations
    }

    /**
     * Set the description of a given workspace.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void adminTeamsSettingsSetDescriptionTest() throws ApiException {
        String token = null;
        String description = null;
        String teamId = null;
        DefaultSuccessTemplate response = api.adminTeamsSettingsSetDescription(token, description, teamId);
        // TODO: test validations
    }

    /**
     * An API method that allows admins to set the discoverability of a given workspace
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void adminTeamsSettingsSetDiscoverabilityTest() throws ApiException {
        String token = null;
        String discoverability = null;
        String teamId = null;
        DefaultSuccessTemplate response = api.adminTeamsSettingsSetDiscoverability(token, discoverability, teamId);
        // TODO: test validations
    }

    /**
     * Sets the icon of a workspace.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void adminTeamsSettingsSetIconTest() throws ApiException {
        String imageUrl = null;
        String teamId = null;
        String token = null;
        DefaultSuccessTemplate response = api.adminTeamsSettingsSetIcon(imageUrl, teamId, token);
        // TODO: test validations
    }

    /**
     * Set the name of a given workspace.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void adminTeamsSettingsSetNameTest() throws ApiException {
        String token = null;
        String name = null;
        String teamId = null;
        DefaultSuccessTemplate response = api.adminTeamsSettingsSetName(token, name, teamId);
        // TODO: test validations
    }

    /**
     * Add one or more default channels to an IDP group.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void adminUsergroupsAddChannelsTest() throws ApiException {
        String token = null;
        String channelIds = null;
        String usergroupId = null;
        String teamId = null;
        DefaultSuccessTemplate response = api.adminUsergroupsAddChannels(token, channelIds, usergroupId, teamId);
        // TODO: test validations
    }

    /**
     * Associate one or more default workspaces with an organization-wide IDP group.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void adminUsergroupsAddTeamsTest() throws ApiException {
        String token = null;
        String teamIds = null;
        String usergroupId = null;
        Boolean autoProvision = null;
        DefaultSuccessTemplate response = api.adminUsergroupsAddTeams(token, teamIds, usergroupId, autoProvision);
        // TODO: test validations
    }

    /**
     * List the channels linked to an org-level IDP group (user group).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void adminUsergroupsListChannelsTest() throws ApiException {
        String token = null;
        String usergroupId = null;
        String teamId = null;
        Boolean includeNumMembers = null;
        DefaultSuccessTemplate response = api.adminUsergroupsListChannels(token, usergroupId, teamId, includeNumMembers);
        // TODO: test validations
    }

    /**
     * Remove one or more default channels from an org-level IDP group (user group).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void adminUsergroupsRemoveChannelsTest() throws ApiException {
        String token = null;
        String channelIds = null;
        String usergroupId = null;
        DefaultSuccessTemplate response = api.adminUsergroupsRemoveChannels(token, channelIds, usergroupId);
        // TODO: test validations
    }

    /**
     * Add an Enterprise user to a workspace.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void adminUsersAssignTest() throws ApiException {
        String token = null;
        String teamId = null;
        String userId = null;
        String channelIds = null;
        Boolean isRestricted = null;
        Boolean isUltraRestricted = null;
        DefaultSuccessTemplate response = api.adminUsersAssign(token, teamId, userId, channelIds, isRestricted, isUltraRestricted);
        // TODO: test validations
    }

    /**
     * Invite a user to a workspace.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void adminUsersInviteTest() throws ApiException {
        String token = null;
        String channelIds = null;
        String email = null;
        String teamId = null;
        String customMessage = null;
        String guestExpirationTs = null;
        Boolean isRestricted = null;
        Boolean isUltraRestricted = null;
        String realName = null;
        Boolean resend = null;
        DefaultSuccessTemplate response = api.adminUsersInvite(token, channelIds, email, teamId, customMessage, guestExpirationTs, isRestricted, isUltraRestricted, realName, resend);
        // TODO: test validations
    }

    /**
     * List users on a workspace
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void adminUsersListTest() throws ApiException {
        String token = null;
        String teamId = null;
        String cursor = null;
        Integer limit = null;
        DefaultSuccessTemplate response = api.adminUsersList(token, teamId, cursor, limit);
        // TODO: test validations
    }

    /**
     * Remove a user from a workspace.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void adminUsersRemoveTest() throws ApiException {
        String token = null;
        String teamId = null;
        String userId = null;
        DefaultSuccessTemplate response = api.adminUsersRemove(token, teamId, userId);
        // TODO: test validations
    }

    /**
     * Invalidate a single session for a user by session_id
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void adminUsersSessionInvalidateTest() throws ApiException {
        String token = null;
        Integer sessionId = null;
        String teamId = null;
        DefaultSuccessTemplate response = api.adminUsersSessionInvalidate(token, sessionId, teamId);
        // TODO: test validations
    }

    /**
     * Wipes all valid sessions on all devices for a given user
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void adminUsersSessionResetTest() throws ApiException {
        String token = null;
        String userId = null;
        Boolean mobileOnly = null;
        Boolean webOnly = null;
        DefaultSuccessTemplate response = api.adminUsersSessionReset(token, userId, mobileOnly, webOnly);
        // TODO: test validations
    }

    /**
     * Set an existing guest, regular user, or owner to be an admin user.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void adminUsersSetAdminTest() throws ApiException {
        String token = null;
        String teamId = null;
        String userId = null;
        DefaultSuccessTemplate response = api.adminUsersSetAdmin(token, teamId, userId);
        // TODO: test validations
    }

    /**
     * Set an expiration for a guest user
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void adminUsersSetExpirationTest() throws ApiException {
        String token = null;
        Integer expirationTs = null;
        String teamId = null;
        String userId = null;
        DefaultSuccessTemplate response = api.adminUsersSetExpiration(token, expirationTs, teamId, userId);
        // TODO: test validations
    }

    /**
     * Set an existing guest, regular user, or admin user to be a workspace owner.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void adminUsersSetOwnerTest() throws ApiException {
        String token = null;
        String teamId = null;
        String userId = null;
        DefaultSuccessTemplate response = api.adminUsersSetOwner(token, teamId, userId);
        // TODO: test validations
    }

    /**
     * Set an existing guest user, admin user, or owner to be a regular user.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void adminUsersSetRegularTest() throws ApiException {
        String token = null;
        String teamId = null;
        String userId = null;
        DefaultSuccessTemplate response = api.adminUsersSetRegular(token, teamId, userId);
        // TODO: test validations
    }

}
