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

import invalidPackageName.ApiCallback;
import invalidPackageName.ApiClient;
import invalidPackageName.ApiException;
import invalidPackageName.ApiResponse;
import invalidPackageName.Configuration;
import invalidPackageName.Pair;
import invalidPackageName.ProgressRequestBody;
import invalidPackageName.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.outmatchapi.slack.DefaultErrorTemplate;
import com.outmatchapi.slack.DefaultSuccessTemplate;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class AdminInviteRequestsApprovedApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AdminInviteRequestsApprovedApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AdminInviteRequestsApprovedApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for adminInviteRequestsApprovedList
     * @param token Authentication token. Requires scope: &#x60;admin.invites:read&#x60; (required)
     * @param teamId ID for the workspace where the invite requests were made. (optional)
     * @param cursor Value of the &#x60;next_cursor&#x60; field sent as part of the previous API response (optional)
     * @param limit The number of results that will be returned by the API on each invocation. Must be between 1 - 1000, both inclusive (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Typical success response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Typical error response </td><td>  -  </td></tr>
     </table>
     * API method documentation
     * @see <a href="https://api.slack.com/methods/admin.inviteRequests.approved.list"> Documentation</a>
     */
    public okhttp3.Call adminInviteRequestsApprovedListCall(String token, String teamId, String cursor, Integer limit, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/admin.inviteRequests.approved.list";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (teamId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("team_id", teamId));
        }

        if (cursor != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("cursor", cursor));
        }

        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
        }

        if (token != null) {
            localVarHeaderParams.put("token", localVarApiClient.parameterToString(token));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "slackAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call adminInviteRequestsApprovedListValidateBeforeCall(String token, String teamId, String cursor, Integer limit, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'token' is set
        if (token == null) {
            throw new ApiException("Missing the required parameter 'token' when calling adminInviteRequestsApprovedList(Async)");
        }

        return adminInviteRequestsApprovedListCall(token, teamId, cursor, limit, _callback);

    }

    /**
     * 
     * List all approved workspace invite requests.
     * @param token Authentication token. Requires scope: &#x60;admin.invites:read&#x60; (required)
     * @param teamId ID for the workspace where the invite requests were made. (optional)
     * @param cursor Value of the &#x60;next_cursor&#x60; field sent as part of the previous API response (optional)
     * @param limit The number of results that will be returned by the API on each invocation. Must be between 1 - 1000, both inclusive (optional)
     * @return DefaultSuccessTemplate
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Typical success response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Typical error response </td><td>  -  </td></tr>
     </table>
     * API method documentation
     * @see <a href="https://api.slack.com/methods/admin.inviteRequests.approved.list"> Documentation</a>
     */
    public DefaultSuccessTemplate adminInviteRequestsApprovedList(String token, String teamId, String cursor, Integer limit) throws ApiException {
        ApiResponse<DefaultSuccessTemplate> localVarResp = adminInviteRequestsApprovedListWithHttpInfo(token, teamId, cursor, limit);
        return localVarResp.getData();
    }

    /**
     * 
     * List all approved workspace invite requests.
     * @param token Authentication token. Requires scope: &#x60;admin.invites:read&#x60; (required)
     * @param teamId ID for the workspace where the invite requests were made. (optional)
     * @param cursor Value of the &#x60;next_cursor&#x60; field sent as part of the previous API response (optional)
     * @param limit The number of results that will be returned by the API on each invocation. Must be between 1 - 1000, both inclusive (optional)
     * @return ApiResponse&lt;DefaultSuccessTemplate&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Typical success response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Typical error response </td><td>  -  </td></tr>
     </table>
     * API method documentation
     * @see <a href="https://api.slack.com/methods/admin.inviteRequests.approved.list"> Documentation</a>
     */
    public ApiResponse<DefaultSuccessTemplate> adminInviteRequestsApprovedListWithHttpInfo(String token, String teamId, String cursor, Integer limit) throws ApiException {
        okhttp3.Call localVarCall = adminInviteRequestsApprovedListValidateBeforeCall(token, teamId, cursor, limit, null);
        Type localVarReturnType = new TypeToken<DefaultSuccessTemplate>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * List all approved workspace invite requests.
     * @param token Authentication token. Requires scope: &#x60;admin.invites:read&#x60; (required)
     * @param teamId ID for the workspace where the invite requests were made. (optional)
     * @param cursor Value of the &#x60;next_cursor&#x60; field sent as part of the previous API response (optional)
     * @param limit The number of results that will be returned by the API on each invocation. Must be between 1 - 1000, both inclusive (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Typical success response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Typical error response </td><td>  -  </td></tr>
     </table>
     * API method documentation
     * @see <a href="https://api.slack.com/methods/admin.inviteRequests.approved.list"> Documentation</a>
     */
    public okhttp3.Call adminInviteRequestsApprovedListAsync(String token, String teamId, String cursor, Integer limit, final ApiCallback<DefaultSuccessTemplate> _callback) throws ApiException {

        okhttp3.Call localVarCall = adminInviteRequestsApprovedListValidateBeforeCall(token, teamId, cursor, limit, _callback);
        Type localVarReturnType = new TypeToken<DefaultSuccessTemplate>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
