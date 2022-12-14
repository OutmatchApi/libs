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
import com.outmatchapi.slack.StarsAddErrorSchema;
import com.outmatchapi.slack.StarsAddSchema;
import com.outmatchapi.slack.StarsListErrorSchema;
import com.outmatchapi.slack.StarsListSchema;
import com.outmatchapi.slack.StarsRemoveErrorSchema;
import com.outmatchapi.slack.StarsRemoveSchema;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for StarsApi
 */
@Disabled
public class StarsApiTest {

    private final StarsApi api = new StarsApi();

    /**
     * Adds a star to an item.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void starsAddTest() throws ApiException {
        String token = null;
        String channel = null;
        String _file = null;
        String fileComment = null;
        String timestamp = null;
        StarsAddSchema response = api.starsAdd(token, channel, _file, fileComment, timestamp);
        // TODO: test validations
    }

    /**
     * Lists stars for a user.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void starsListTest() throws ApiException {
        String token = null;
        String count = null;
        String page = null;
        String cursor = null;
        Integer limit = null;
        StarsListSchema response = api.starsList(token, count, page, cursor, limit);
        // TODO: test validations
    }

    /**
     * Removes a star from an item.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void starsRemoveTest() throws ApiException {
        String token = null;
        String channel = null;
        String _file = null;
        String fileComment = null;
        String timestamp = null;
        StarsRemoveSchema response = api.starsRemove(token, channel, _file, fileComment, timestamp);
        // TODO: test validations
    }

}
