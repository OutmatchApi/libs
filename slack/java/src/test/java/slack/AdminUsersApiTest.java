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
import com.outmatchapi.slack.DefaultErrorTemplate;
import com.outmatchapi.slack.DefaultSuccessTemplate;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AdminUsersApi
 */
@Disabled
public class AdminUsersApiTest {

    private final AdminUsersApi api = new AdminUsersApi();

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
