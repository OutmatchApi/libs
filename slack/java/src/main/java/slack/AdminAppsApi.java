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

public class AdminAppsApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AdminAppsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AdminAppsApi(ApiClient apiClient) {
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
     * Build call for adminAppsApprove
     * @param token Authentication token. Requires scope: &#x60;admin.apps:write&#x60; (required)
     * @param appId The id of the app to approve. (optional)
     * @param requestId The id of the request to approve. (optional)
     * @param teamId  (optional)
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
     * @see <a href="https://api.slack.com/methods/admin.apps.approve"> Documentation</a>
     */
    public okhttp3.Call adminAppsApproveCall(String token, String appId, String requestId, String teamId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/admin.apps.approve";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (appId != null) {
            localVarFormParams.put("app_id", appId);
        }

        if (requestId != null) {
            localVarFormParams.put("request_id", requestId);
        }

        if (teamId != null) {
            localVarFormParams.put("team_id", teamId);
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
            "application/x-www-form-urlencoded"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "slackAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call adminAppsApproveValidateBeforeCall(String token, String appId, String requestId, String teamId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'token' is set
        if (token == null) {
            throw new ApiException("Missing the required parameter 'token' when calling adminAppsApprove(Async)");
        }

        return adminAppsApproveCall(token, appId, requestId, teamId, _callback);

    }

    /**
     * 
     * Approve an app for installation on a workspace.
     * @param token Authentication token. Requires scope: &#x60;admin.apps:write&#x60; (required)
     * @param appId The id of the app to approve. (optional)
     * @param requestId The id of the request to approve. (optional)
     * @param teamId  (optional)
     * @return DefaultSuccessTemplate
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Typical success response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Typical error response </td><td>  -  </td></tr>
     </table>
     * API method documentation
     * @see <a href="https://api.slack.com/methods/admin.apps.approve"> Documentation</a>
     */
    public DefaultSuccessTemplate adminAppsApprove(String token, String appId, String requestId, String teamId) throws ApiException {
        ApiResponse<DefaultSuccessTemplate> localVarResp = adminAppsApproveWithHttpInfo(token, appId, requestId, teamId);
        return localVarResp.getData();
    }

    /**
     * 
     * Approve an app for installation on a workspace.
     * @param token Authentication token. Requires scope: &#x60;admin.apps:write&#x60; (required)
     * @param appId The id of the app to approve. (optional)
     * @param requestId The id of the request to approve. (optional)
     * @param teamId  (optional)
     * @return ApiResponse&lt;DefaultSuccessTemplate&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Typical success response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Typical error response </td><td>  -  </td></tr>
     </table>
     * API method documentation
     * @see <a href="https://api.slack.com/methods/admin.apps.approve"> Documentation</a>
     */
    public ApiResponse<DefaultSuccessTemplate> adminAppsApproveWithHttpInfo(String token, String appId, String requestId, String teamId) throws ApiException {
        okhttp3.Call localVarCall = adminAppsApproveValidateBeforeCall(token, appId, requestId, teamId, null);
        Type localVarReturnType = new TypeToken<DefaultSuccessTemplate>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Approve an app for installation on a workspace.
     * @param token Authentication token. Requires scope: &#x60;admin.apps:write&#x60; (required)
     * @param appId The id of the app to approve. (optional)
     * @param requestId The id of the request to approve. (optional)
     * @param teamId  (optional)
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
     * @see <a href="https://api.slack.com/methods/admin.apps.approve"> Documentation</a>
     */
    public okhttp3.Call adminAppsApproveAsync(String token, String appId, String requestId, String teamId, final ApiCallback<DefaultSuccessTemplate> _callback) throws ApiException {

        okhttp3.Call localVarCall = adminAppsApproveValidateBeforeCall(token, appId, requestId, teamId, _callback);
        Type localVarReturnType = new TypeToken<DefaultSuccessTemplate>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for adminAppsRestrict
     * @param token Authentication token. Requires scope: &#x60;admin.apps:write&#x60; (required)
     * @param appId The id of the app to restrict. (optional)
     * @param requestId The id of the request to restrict. (optional)
     * @param teamId  (optional)
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
     * @see <a href="https://api.slack.com/methods/admin.apps.restrict"> Documentation</a>
     */
    public okhttp3.Call adminAppsRestrictCall(String token, String appId, String requestId, String teamId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/admin.apps.restrict";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (appId != null) {
            localVarFormParams.put("app_id", appId);
        }

        if (requestId != null) {
            localVarFormParams.put("request_id", requestId);
        }

        if (teamId != null) {
            localVarFormParams.put("team_id", teamId);
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
            "application/x-www-form-urlencoded"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "slackAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call adminAppsRestrictValidateBeforeCall(String token, String appId, String requestId, String teamId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'token' is set
        if (token == null) {
            throw new ApiException("Missing the required parameter 'token' when calling adminAppsRestrict(Async)");
        }

        return adminAppsRestrictCall(token, appId, requestId, teamId, _callback);

    }

    /**
     * 
     * Restrict an app for installation on a workspace.
     * @param token Authentication token. Requires scope: &#x60;admin.apps:write&#x60; (required)
     * @param appId The id of the app to restrict. (optional)
     * @param requestId The id of the request to restrict. (optional)
     * @param teamId  (optional)
     * @return DefaultSuccessTemplate
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Typical success response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Typical error response </td><td>  -  </td></tr>
     </table>
     * API method documentation
     * @see <a href="https://api.slack.com/methods/admin.apps.restrict"> Documentation</a>
     */
    public DefaultSuccessTemplate adminAppsRestrict(String token, String appId, String requestId, String teamId) throws ApiException {
        ApiResponse<DefaultSuccessTemplate> localVarResp = adminAppsRestrictWithHttpInfo(token, appId, requestId, teamId);
        return localVarResp.getData();
    }

    /**
     * 
     * Restrict an app for installation on a workspace.
     * @param token Authentication token. Requires scope: &#x60;admin.apps:write&#x60; (required)
     * @param appId The id of the app to restrict. (optional)
     * @param requestId The id of the request to restrict. (optional)
     * @param teamId  (optional)
     * @return ApiResponse&lt;DefaultSuccessTemplate&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Typical success response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Typical error response </td><td>  -  </td></tr>
     </table>
     * API method documentation
     * @see <a href="https://api.slack.com/methods/admin.apps.restrict"> Documentation</a>
     */
    public ApiResponse<DefaultSuccessTemplate> adminAppsRestrictWithHttpInfo(String token, String appId, String requestId, String teamId) throws ApiException {
        okhttp3.Call localVarCall = adminAppsRestrictValidateBeforeCall(token, appId, requestId, teamId, null);
        Type localVarReturnType = new TypeToken<DefaultSuccessTemplate>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Restrict an app for installation on a workspace.
     * @param token Authentication token. Requires scope: &#x60;admin.apps:write&#x60; (required)
     * @param appId The id of the app to restrict. (optional)
     * @param requestId The id of the request to restrict. (optional)
     * @param teamId  (optional)
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
     * @see <a href="https://api.slack.com/methods/admin.apps.restrict"> Documentation</a>
     */
    public okhttp3.Call adminAppsRestrictAsync(String token, String appId, String requestId, String teamId, final ApiCallback<DefaultSuccessTemplate> _callback) throws ApiException {

        okhttp3.Call localVarCall = adminAppsRestrictValidateBeforeCall(token, appId, requestId, teamId, _callback);
        Type localVarReturnType = new TypeToken<DefaultSuccessTemplate>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
