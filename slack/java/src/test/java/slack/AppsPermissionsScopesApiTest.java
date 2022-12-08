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
import com.outmatchapi.slack.ApiPermissionsScopesListSuccessSchema;
import com.outmatchapi.slack.AppsPermissionsScopesListErrorSchema;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AppsPermissionsScopesApi
 */
@Disabled
public class AppsPermissionsScopesApiTest {

    private final AppsPermissionsScopesApi api = new AppsPermissionsScopesApi();

    /**
     * Returns list of scopes this app has on a team.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void appsPermissionsScopesListTest() throws ApiException {
        String token = null;
        ApiPermissionsScopesListSuccessSchema response = api.appsPermissionsScopesList(token);
        // TODO: test validations
    }

}
