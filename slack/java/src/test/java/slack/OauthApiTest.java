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
 * API tests for OauthApi
 */
@Disabled
public class OauthApiTest {

    private final OauthApi api = new OauthApi();

    /**
     * Exchanges a temporary OAuth verifier code for an access token.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void oauthAccessTest() throws ApiException {
        String clientId = null;
        String clientSecret = null;
        String code = null;
        String redirectUri = null;
        Boolean singleChannel = null;
        DefaultSuccessTemplate response = api.oauthAccess(clientId, clientSecret, code, redirectUri, singleChannel);
        // TODO: test validations
    }

    /**
     * Exchanges a temporary OAuth verifier code for a workspace token.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void oauthTokenTest() throws ApiException {
        String clientId = null;
        String clientSecret = null;
        String code = null;
        String redirectUri = null;
        Boolean singleChannel = null;
        DefaultSuccessTemplate response = api.oauthToken(clientId, clientSecret, code, redirectUri, singleChannel);
        // TODO: test validations
    }

    /**
     * Exchanges a temporary OAuth verifier code for an access token.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void oauthV2AccessTest() throws ApiException {
        String code = null;
        String clientId = null;
        String clientSecret = null;
        String redirectUri = null;
        DefaultSuccessTemplate response = api.oauthV2Access(code, clientId, clientSecret, redirectUri);
        // TODO: test validations
    }

}