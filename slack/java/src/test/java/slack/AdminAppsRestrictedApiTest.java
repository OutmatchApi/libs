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
 * API tests for AdminAppsRestrictedApi
 */
@Disabled
public class AdminAppsRestrictedApiTest {

    private final AdminAppsRestrictedApi api = new AdminAppsRestrictedApi();

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

}
