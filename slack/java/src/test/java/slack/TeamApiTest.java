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
import com.outmatchapi.slack.TeamAccessLogsErrorSchema;
import com.outmatchapi.slack.TeamAccessLogsSchema;
import com.outmatchapi.slack.TeamInfoErrorSchema;
import com.outmatchapi.slack.TeamInfoSchema;
import com.outmatchapi.slack.TeamIntegrationLogsErrorSchema;
import com.outmatchapi.slack.TeamIntegrationLogsSchema;
import com.outmatchapi.slack.TeamProfileGetErrorSchema;
import com.outmatchapi.slack.TeamProfileGetSuccessSchema;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TeamApi
 */
@Disabled
public class TeamApiTest {

    private final TeamApi api = new TeamApi();

    /**
     * Gets the access logs for the current team.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void teamAccessLogsTest() throws ApiException {
        String token = null;
        String before = null;
        String count = null;
        String page = null;
        TeamAccessLogsSchema response = api.teamAccessLogs(token, before, count, page);
        // TODO: test validations
    }

    /**
     * Gets billable users information for the current team.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void teamBillableInfoTest() throws ApiException {
        String token = null;
        String user = null;
        DefaultSuccessTemplate response = api.teamBillableInfo(token, user);
        // TODO: test validations
    }

    /**
     * Gets information about the current team.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void teamInfoTest() throws ApiException {
        String token = null;
        String team = null;
        TeamInfoSchema response = api.teamInfo(token, team);
        // TODO: test validations
    }

    /**
     * Gets the integration logs for the current team.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void teamIntegrationLogsTest() throws ApiException {
        String token = null;
        String appId = null;
        String changeType = null;
        String count = null;
        String page = null;
        String serviceId = null;
        String user = null;
        TeamIntegrationLogsSchema response = api.teamIntegrationLogs(token, appId, changeType, count, page, serviceId, user);
        // TODO: test validations
    }

    /**
     * Retrieve a team&#39;s profile.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void teamProfileGetTest() throws ApiException {
        String token = null;
        String visibility = null;
        TeamProfileGetSuccessSchema response = api.teamProfileGet(token, visibility);
        // TODO: test validations
    }

}
