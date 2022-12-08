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
import com.outmatchapi.slack.DefaultErrorTemplate;
import com.outmatchapi.slack.DefaultSuccessTemplate;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AdminConversationsApi
 */
@Disabled
public class AdminConversationsApiTest {

    private final AdminConversationsApi api = new AdminConversationsApi();

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

}
