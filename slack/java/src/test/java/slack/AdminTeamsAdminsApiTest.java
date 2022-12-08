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
 * API tests for AdminTeamsAdminsApi
 */
@Disabled
public class AdminTeamsAdminsApiTest {

    private final AdminTeamsAdminsApi api = new AdminTeamsAdminsApi();

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

}