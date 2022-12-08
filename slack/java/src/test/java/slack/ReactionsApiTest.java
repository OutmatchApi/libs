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
import com.outmatchapi.slack.ReactionsAddErrorSchema;
import com.outmatchapi.slack.ReactionsAddSchema;
import com.outmatchapi.slack.ReactionsGetErrorSchema;
import com.outmatchapi.slack.ReactionsGetSuccessSchemaInner;
import com.outmatchapi.slack.ReactionsListErrorSchema;
import com.outmatchapi.slack.ReactionsListSchema;
import com.outmatchapi.slack.ReactionsRemoveErrorSchema;
import com.outmatchapi.slack.ReactionsRemoveSchema;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ReactionsApi
 */
@Disabled
public class ReactionsApiTest {

    private final ReactionsApi api = new ReactionsApi();

    /**
     * Adds a reaction to an item.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void reactionsAddTest() throws ApiException {
        String token = null;
        String channel = null;
        String name = null;
        String timestamp = null;
        ReactionsAddSchema response = api.reactionsAdd(token, channel, name, timestamp);
        // TODO: test validations
    }

    /**
     * Gets reactions for an item.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void reactionsGetTest() throws ApiException {
        String token = null;
        String channel = null;
        String _file = null;
        String fileComment = null;
        Boolean full = null;
        String timestamp = null;
        List<ReactionsGetSuccessSchemaInner> response = api.reactionsGet(token, channel, _file, fileComment, full, timestamp);
        // TODO: test validations
    }

    /**
     * Lists reactions made by a user.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void reactionsListTest() throws ApiException {
        String token = null;
        String user = null;
        Boolean full = null;
        Integer count = null;
        Integer page = null;
        String cursor = null;
        Integer limit = null;
        ReactionsListSchema response = api.reactionsList(token, user, full, count, page, cursor, limit);
        // TODO: test validations
    }

    /**
     * Removes a reaction from an item.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void reactionsRemoveTest() throws ApiException {
        String token = null;
        String name = null;
        String channel = null;
        String _file = null;
        String fileComment = null;
        String timestamp = null;
        ReactionsRemoveSchema response = api.reactionsRemove(token, name, channel, _file, fileComment, timestamp);
        // TODO: test validations
    }

}
