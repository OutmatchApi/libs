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
 * API tests for AdminEmojiApi
 */
@Disabled
public class AdminEmojiApiTest {

    private final AdminEmojiApi api = new AdminEmojiApi();

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

}