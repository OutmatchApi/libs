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
 * API tests for CallsParticipantsApi
 */
@Disabled
public class CallsParticipantsApiTest {

    private final CallsParticipantsApi api = new CallsParticipantsApi();

    /**
     * Registers new participants added to a Call.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void callsParticipantsAddTest() throws ApiException {
        String token = null;
        String id = null;
        String users = null;
        DefaultSuccessTemplate response = api.callsParticipantsAdd(token, id, users);
        // TODO: test validations
    }

    /**
     * Registers participants removed from a Call.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void callsParticipantsRemoveTest() throws ApiException {
        String token = null;
        String id = null;
        String users = null;
        DefaultSuccessTemplate response = api.callsParticipantsRemove(token, id, users);
        // TODO: test validations
    }

}