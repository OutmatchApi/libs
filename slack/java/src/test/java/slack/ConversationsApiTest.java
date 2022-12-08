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
import java.math.BigDecimal;
import com.outmatchapi.slack.ConversationsArchiveErrorSchema;
import com.outmatchapi.slack.ConversationsArchiveSuccessSchema;
import com.outmatchapi.slack.ConversationsCloseErrorSchema;
import com.outmatchapi.slack.ConversationsCloseSuccessSchema;
import com.outmatchapi.slack.ConversationsCreateErrorSchema;
import com.outmatchapi.slack.ConversationsCreateSuccessSchema;
import com.outmatchapi.slack.ConversationsHistoryErrorSchema;
import com.outmatchapi.slack.ConversationsHistorySuccessSchema;
import com.outmatchapi.slack.ConversationsInfoErrorSchema;
import com.outmatchapi.slack.ConversationsInfoSuccessSchema;
import com.outmatchapi.slack.ConversationsInviteErrorSchema;
import com.outmatchapi.slack.ConversationsInviteErrorSchema1;
import com.outmatchapi.slack.ConversationsJoinErrorSchema;
import com.outmatchapi.slack.ConversationsJoinSuccessSchema;
import com.outmatchapi.slack.ConversationsKickErrorSchema;
import com.outmatchapi.slack.ConversationsKickSuccessSchema;
import com.outmatchapi.slack.ConversationsLeaveErrorSchema;
import com.outmatchapi.slack.ConversationsLeaveSuccessSchema;
import com.outmatchapi.slack.ConversationsListErrorSchema;
import com.outmatchapi.slack.ConversationsListSuccessSchema;
import com.outmatchapi.slack.ConversationsMarkErrorSchema;
import com.outmatchapi.slack.ConversationsMarkSuccessSchema;
import com.outmatchapi.slack.ConversationsMembersErrorSchema;
import com.outmatchapi.slack.ConversationsMembersSuccessSchema;
import com.outmatchapi.slack.ConversationsOpenErrorSchema;
import com.outmatchapi.slack.ConversationsOpenSuccessSchema;
import com.outmatchapi.slack.ConversationsRenameErrorSchema;
import com.outmatchapi.slack.ConversationsRenameSuccessSchema;
import com.outmatchapi.slack.ConversationsRepliesErrorSchema;
import com.outmatchapi.slack.ConversationsRepliesSuccessSchema;
import com.outmatchapi.slack.ConversationsSetPurposeErrorSchema;
import com.outmatchapi.slack.ConversationsSetPurposeSuccessSchema;
import com.outmatchapi.slack.ConversationsSetTopicErrorSchema;
import com.outmatchapi.slack.ConversationsSetTopicSuccessSchema;
import com.outmatchapi.slack.ConversationsUnarchiveErrorSchema;
import com.outmatchapi.slack.ConversationsUnarchiveSuccessSchema;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ConversationsApi
 */
@Disabled
public class ConversationsApiTest {

    private final ConversationsApi api = new ConversationsApi();

    /**
     * Archives a conversation.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void conversationsArchiveTest() throws ApiException {
        String token = null;
        String channel = null;
        ConversationsArchiveSuccessSchema response = api.conversationsArchive(token, channel);
        // TODO: test validations
    }

    /**
     * Closes a direct message or multi-person direct message.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void conversationsCloseTest() throws ApiException {
        String token = null;
        String channel = null;
        ConversationsCloseSuccessSchema response = api.conversationsClose(token, channel);
        // TODO: test validations
    }

    /**
     * Initiates a public or private channel-based conversation
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void conversationsCreateTest() throws ApiException {
        String token = null;
        Boolean isPrivate = null;
        String name = null;
        ConversationsCreateSuccessSchema response = api.conversationsCreate(token, isPrivate, name);
        // TODO: test validations
    }

    /**
     * Fetches a conversation&#39;s history of messages and events.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void conversationsHistoryTest() throws ApiException {
        String token = null;
        String channel = null;
        BigDecimal latest = null;
        BigDecimal oldest = null;
        Boolean inclusive = null;
        Integer limit = null;
        String cursor = null;
        ConversationsHistorySuccessSchema response = api.conversationsHistory(token, channel, latest, oldest, inclusive, limit, cursor);
        // TODO: test validations
    }

    /**
     * Retrieve information about a conversation.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void conversationsInfoTest() throws ApiException {
        String token = null;
        String channel = null;
        Boolean includeLocale = null;
        Boolean includeNumMembers = null;
        ConversationsInfoSuccessSchema response = api.conversationsInfo(token, channel, includeLocale, includeNumMembers);
        // TODO: test validations
    }

    /**
     * Invites users to a channel.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void conversationsInviteTest() throws ApiException {
        String token = null;
        String channel = null;
        String users = null;
        ConversationsInviteErrorSchema response = api.conversationsInvite(token, channel, users);
        // TODO: test validations
    }

    /**
     * Joins an existing conversation.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void conversationsJoinTest() throws ApiException {
        String token = null;
        String channel = null;
        ConversationsJoinSuccessSchema response = api.conversationsJoin(token, channel);
        // TODO: test validations
    }

    /**
     * Removes a user from a conversation.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void conversationsKickTest() throws ApiException {
        String token = null;
        String channel = null;
        String user = null;
        ConversationsKickSuccessSchema response = api.conversationsKick(token, channel, user);
        // TODO: test validations
    }

    /**
     * Leaves a conversation.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void conversationsLeaveTest() throws ApiException {
        String token = null;
        String channel = null;
        ConversationsLeaveSuccessSchema response = api.conversationsLeave(token, channel);
        // TODO: test validations
    }

    /**
     * Lists all channels in a Slack team.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void conversationsListTest() throws ApiException {
        String token = null;
        Boolean excludeArchived = null;
        String types = null;
        Integer limit = null;
        String cursor = null;
        ConversationsListSuccessSchema response = api.conversationsList(token, excludeArchived, types, limit, cursor);
        // TODO: test validations
    }

    /**
     * Sets the read cursor in a channel.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void conversationsMarkTest() throws ApiException {
        String token = null;
        String channel = null;
        BigDecimal ts = null;
        ConversationsMarkSuccessSchema response = api.conversationsMark(token, channel, ts);
        // TODO: test validations
    }

    /**
     * Retrieve members of a conversation.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void conversationsMembersTest() throws ApiException {
        String token = null;
        String channel = null;
        Integer limit = null;
        String cursor = null;
        ConversationsMembersSuccessSchema response = api.conversationsMembers(token, channel, limit, cursor);
        // TODO: test validations
    }

    /**
     * Opens or resumes a direct message or multi-person direct message.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void conversationsOpenTest() throws ApiException {
        String token = null;
        String channel = null;
        Boolean returnIm = null;
        String users = null;
        ConversationsOpenSuccessSchema response = api.conversationsOpen(token, channel, returnIm, users);
        // TODO: test validations
    }

    /**
     * Renames a conversation.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void conversationsRenameTest() throws ApiException {
        String token = null;
        String channel = null;
        String name = null;
        ConversationsRenameSuccessSchema response = api.conversationsRename(token, channel, name);
        // TODO: test validations
    }

    /**
     * Retrieve a thread of messages posted to a conversation
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void conversationsRepliesTest() throws ApiException {
        String token = null;
        String channel = null;
        BigDecimal ts = null;
        BigDecimal latest = null;
        BigDecimal oldest = null;
        Boolean inclusive = null;
        Integer limit = null;
        String cursor = null;
        ConversationsRepliesSuccessSchema response = api.conversationsReplies(token, channel, ts, latest, oldest, inclusive, limit, cursor);
        // TODO: test validations
    }

    /**
     * Sets the purpose for a conversation.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void conversationsSetPurposeTest() throws ApiException {
        String token = null;
        String channel = null;
        String purpose = null;
        ConversationsSetPurposeSuccessSchema response = api.conversationsSetPurpose(token, channel, purpose);
        // TODO: test validations
    }

    /**
     * Sets the topic for a conversation.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void conversationsSetTopicTest() throws ApiException {
        String token = null;
        String channel = null;
        String topic = null;
        ConversationsSetTopicSuccessSchema response = api.conversationsSetTopic(token, channel, topic);
        // TODO: test validations
    }

    /**
     * Reverses conversation archival.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void conversationsUnarchiveTest() throws ApiException {
        String token = null;
        String channel = null;
        ConversationsUnarchiveSuccessSchema response = api.conversationsUnarchive(token, channel);
        // TODO: test validations
    }

}
