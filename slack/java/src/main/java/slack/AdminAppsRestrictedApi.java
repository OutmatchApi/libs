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

public class AdminAppsRestrictedApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AdminAppsRestrictedApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AdminAppsRestrictedApi(ApiClient apiClient) {
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
     * Build call for adminAppsRestrictedList
     * @param token Authentication token. Requires scope: &#x60;admin.apps:read&#x60; (required)
     * @param limit The maximum number of items to return. Must be between 1 - 1000 both inclusive. (optional)
     * @param cursor Set &#x60;cursor&#x60; to &#x60;next_cursor&#x60; returned by the previous call to list items in the next page (optional)
     * @param teamId  (optional)
     * @param enterpriseId  (optional)
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
     * @see <a href="https://api.slack.com/methods/admin.apps.restricted.list"> Documentation</a>
     */
    public okhttp3.Call adminAppsRestrictedListCall(String token, Integer limit, String cursor, String teamId, String enterpriseId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/admin.apps.restricted.list";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (token != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("token", token));
        }

        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
        }

        if (cursor != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("cursor", cursor));
        }

        if (teamId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("team_id", teamId));
        }

        if (enterpriseId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("enterprise_id", enterpriseId));
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
    private okhttp3.Call adminAppsRestrictedListValidateBeforeCall(String token, Integer limit, String cursor, String teamId, String enterpriseId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'token' is set
        if (token == null) {
            throw new ApiException("Missing the required parameter 'token' when calling adminAppsRestrictedList(Async)");
        }

        return adminAppsRestrictedListCall(token, limit, cursor, teamId, enterpriseId, _callback);

    }

    /**
     * 
     * List restricted apps for an org or workspace.
     * @param token Authentication token. Requires scope: &#x60;admin.apps:read&#x60; (required)
     * @param limit The maximum number of items to return. Must be between 1 - 1000 both inclusive. (optional)
     * @param cursor Set &#x60;cursor&#x60; to &#x60;next_cursor&#x60; returned by the previous call to list items in the next page (optional)
     * @param teamId  (optional)
     * @param enterpriseId  (optional)
     * @return DefaultSuccessTemplate
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Typical success response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Typical error response </td><td>  -  </td></tr>
     </table>
     * API method documentation
     * @see <a href="https://api.slack.com/methods/admin.apps.restricted.list"> Documentation</a>
     */
    public DefaultSuccessTemplate adminAppsRestrictedList(String token, Integer limit, String cursor, String teamId, String enterpriseId) throws ApiException {
        ApiResponse<DefaultSuccessTemplate> localVarResp = adminAppsRestrictedListWithHttpInfo(token, limit, cursor, teamId, enterpriseId);
        return localVarResp.getData();
    }

    /**
     * 
     * List restricted apps for an org or workspace.
     * @param token Authentication token. Requires scope: &#x60;admin.apps:read&#x60; (required)
     * @param limit The maximum number of items to return. Must be between 1 - 1000 both inclusive. (optional)
     * @param cursor Set &#x60;cursor&#x60; to &#x60;next_cursor&#x60; returned by the previous call to list items in the next page (optional)
     * @param teamId  (optional)
     * @param enterpriseId  (optional)
     * @return ApiResponse&lt;DefaultSuccessTemplate&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Typical success response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Typical error response </td><td>  -  </td></tr>
     </table>
     * API method documentation
     * @see <a href="https://api.slack.com/methods/admin.apps.restricted.list"> Documentation</a>
     */
    public ApiResponse<DefaultSuccessTemplate> adminAppsRestrictedListWithHttpInfo(String token, Integer limit, String cursor, String teamId, String enterpriseId) throws ApiException {
        okhttp3.Call localVarCall = adminAppsRestrictedListValidateBeforeCall(token, limit, cursor, teamId, enterpriseId, null);
        Type localVarReturnType = new TypeToken<DefaultSuccessTemplate>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * List restricted apps for an org or workspace.
     * @param token Authentication token. Requires scope: &#x60;admin.apps:read&#x60; (required)
     * @param limit The maximum number of items to return. Must be between 1 - 1000 both inclusive. (optional)
     * @param cursor Set &#x60;cursor&#x60; to &#x60;next_cursor&#x60; returned by the previous call to list items in the next page (optional)
     * @param teamId  (optional)
     * @param enterpriseId  (optional)
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
     * @see <a href="https://api.slack.com/methods/admin.apps.restricted.list"> Documentation</a>
     */
    public okhttp3.Call adminAppsRestrictedListAsync(String token, Integer limit, String cursor, String teamId, String enterpriseId, final ApiCallback<DefaultSuccessTemplate> _callback) throws ApiException {

        okhttp3.Call localVarCall = adminAppsRestrictedListValidateBeforeCall(token, limit, cursor, teamId, enterpriseId, _callback);
        Type localVarReturnType = new TypeToken<DefaultSuccessTemplate>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
