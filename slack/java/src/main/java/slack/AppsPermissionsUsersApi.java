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

public class AppsPermissionsUsersApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AppsPermissionsUsersApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AppsPermissionsUsersApi(ApiClient apiClient) {
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
     * Build call for appsPermissionsUsersList
     * @param token Authentication token. Requires scope: &#x60;none&#x60; (required)
     * @param cursor Paginate through collections of data by setting the &#x60;cursor&#x60; parameter to a &#x60;next_cursor&#x60; attribute returned by a previous request&#39;s &#x60;response_metadata&#x60;. Default value fetches the first \&quot;page\&quot; of the collection. See [pagination](/docs/pagination) for more detail. (optional)
     * @param limit The maximum number of items to return. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Typical successful paginated response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Typical error response </td><td>  -  </td></tr>
     </table>
     * API method documentation
     * @see <a href="https://api.slack.com/methods/apps.permissions.users.list"> Documentation</a>
     */
    public okhttp3.Call appsPermissionsUsersListCall(String token, String cursor, Integer limit, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/apps.permissions.users.list";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (token != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("token", token));
        }

        if (cursor != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("cursor", cursor));
        }

        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
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
    private okhttp3.Call appsPermissionsUsersListValidateBeforeCall(String token, String cursor, Integer limit, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'token' is set
        if (token == null) {
            throw new ApiException("Missing the required parameter 'token' when calling appsPermissionsUsersList(Async)");
        }

        return appsPermissionsUsersListCall(token, cursor, limit, _callback);

    }

    /**
     * 
     * Returns list of user grants and corresponding scopes this app has on a team.
     * @param token Authentication token. Requires scope: &#x60;none&#x60; (required)
     * @param cursor Paginate through collections of data by setting the &#x60;cursor&#x60; parameter to a &#x60;next_cursor&#x60; attribute returned by a previous request&#39;s &#x60;response_metadata&#x60;. Default value fetches the first \&quot;page\&quot; of the collection. See [pagination](/docs/pagination) for more detail. (optional)
     * @param limit The maximum number of items to return. (optional)
     * @return DefaultSuccessTemplate
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Typical successful paginated response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Typical error response </td><td>  -  </td></tr>
     </table>
     * API method documentation
     * @see <a href="https://api.slack.com/methods/apps.permissions.users.list"> Documentation</a>
     */
    public DefaultSuccessTemplate appsPermissionsUsersList(String token, String cursor, Integer limit) throws ApiException {
        ApiResponse<DefaultSuccessTemplate> localVarResp = appsPermissionsUsersListWithHttpInfo(token, cursor, limit);
        return localVarResp.getData();
    }

    /**
     * 
     * Returns list of user grants and corresponding scopes this app has on a team.
     * @param token Authentication token. Requires scope: &#x60;none&#x60; (required)
     * @param cursor Paginate through collections of data by setting the &#x60;cursor&#x60; parameter to a &#x60;next_cursor&#x60; attribute returned by a previous request&#39;s &#x60;response_metadata&#x60;. Default value fetches the first \&quot;page\&quot; of the collection. See [pagination](/docs/pagination) for more detail. (optional)
     * @param limit The maximum number of items to return. (optional)
     * @return ApiResponse&lt;DefaultSuccessTemplate&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Typical successful paginated response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Typical error response </td><td>  -  </td></tr>
     </table>
     * API method documentation
     * @see <a href="https://api.slack.com/methods/apps.permissions.users.list"> Documentation</a>
     */
    public ApiResponse<DefaultSuccessTemplate> appsPermissionsUsersListWithHttpInfo(String token, String cursor, Integer limit) throws ApiException {
        okhttp3.Call localVarCall = appsPermissionsUsersListValidateBeforeCall(token, cursor, limit, null);
        Type localVarReturnType = new TypeToken<DefaultSuccessTemplate>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Returns list of user grants and corresponding scopes this app has on a team.
     * @param token Authentication token. Requires scope: &#x60;none&#x60; (required)
     * @param cursor Paginate through collections of data by setting the &#x60;cursor&#x60; parameter to a &#x60;next_cursor&#x60; attribute returned by a previous request&#39;s &#x60;response_metadata&#x60;. Default value fetches the first \&quot;page\&quot; of the collection. See [pagination](/docs/pagination) for more detail. (optional)
     * @param limit The maximum number of items to return. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Typical successful paginated response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Typical error response </td><td>  -  </td></tr>
     </table>
     * API method documentation
     * @see <a href="https://api.slack.com/methods/apps.permissions.users.list"> Documentation</a>
     */
    public okhttp3.Call appsPermissionsUsersListAsync(String token, String cursor, Integer limit, final ApiCallback<DefaultSuccessTemplate> _callback) throws ApiException {

        okhttp3.Call localVarCall = appsPermissionsUsersListValidateBeforeCall(token, cursor, limit, _callback);
        Type localVarReturnType = new TypeToken<DefaultSuccessTemplate>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for appsPermissionsUsersRequest
     * @param token Authentication token. Requires scope: &#x60;none&#x60; (required)
     * @param scopes A comma separated list of user scopes to request for (required)
     * @param triggerId Token used to trigger the request (required)
     * @param user The user this scope is being requested for (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Standard success response when used with a user token </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Standard failure response when trigger_id is invalid </td><td>  -  </td></tr>
     </table>
     * API method documentation
     * @see <a href="https://api.slack.com/methods/apps.permissions.users.request"> Documentation</a>
     */
    public okhttp3.Call appsPermissionsUsersRequestCall(String token, String scopes, String triggerId, String user, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/apps.permissions.users.request";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (token != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("token", token));
        }

        if (scopes != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("scopes", scopes));
        }

        if (triggerId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("trigger_id", triggerId));
        }

        if (user != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("user", user));
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
    private okhttp3.Call appsPermissionsUsersRequestValidateBeforeCall(String token, String scopes, String triggerId, String user, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'token' is set
        if (token == null) {
            throw new ApiException("Missing the required parameter 'token' when calling appsPermissionsUsersRequest(Async)");
        }

        // verify the required parameter 'scopes' is set
        if (scopes == null) {
            throw new ApiException("Missing the required parameter 'scopes' when calling appsPermissionsUsersRequest(Async)");
        }

        // verify the required parameter 'triggerId' is set
        if (triggerId == null) {
            throw new ApiException("Missing the required parameter 'triggerId' when calling appsPermissionsUsersRequest(Async)");
        }

        // verify the required parameter 'user' is set
        if (user == null) {
            throw new ApiException("Missing the required parameter 'user' when calling appsPermissionsUsersRequest(Async)");
        }

        return appsPermissionsUsersRequestCall(token, scopes, triggerId, user, _callback);

    }

    /**
     * 
     * Enables an app to trigger a permissions modal to grant an app access to a user access scope.
     * @param token Authentication token. Requires scope: &#x60;none&#x60; (required)
     * @param scopes A comma separated list of user scopes to request for (required)
     * @param triggerId Token used to trigger the request (required)
     * @param user The user this scope is being requested for (required)
     * @return DefaultSuccessTemplate
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Standard success response when used with a user token </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Standard failure response when trigger_id is invalid </td><td>  -  </td></tr>
     </table>
     * API method documentation
     * @see <a href="https://api.slack.com/methods/apps.permissions.users.request"> Documentation</a>
     */
    public DefaultSuccessTemplate appsPermissionsUsersRequest(String token, String scopes, String triggerId, String user) throws ApiException {
        ApiResponse<DefaultSuccessTemplate> localVarResp = appsPermissionsUsersRequestWithHttpInfo(token, scopes, triggerId, user);
        return localVarResp.getData();
    }

    /**
     * 
     * Enables an app to trigger a permissions modal to grant an app access to a user access scope.
     * @param token Authentication token. Requires scope: &#x60;none&#x60; (required)
     * @param scopes A comma separated list of user scopes to request for (required)
     * @param triggerId Token used to trigger the request (required)
     * @param user The user this scope is being requested for (required)
     * @return ApiResponse&lt;DefaultSuccessTemplate&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Standard success response when used with a user token </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Standard failure response when trigger_id is invalid </td><td>  -  </td></tr>
     </table>
     * API method documentation
     * @see <a href="https://api.slack.com/methods/apps.permissions.users.request"> Documentation</a>
     */
    public ApiResponse<DefaultSuccessTemplate> appsPermissionsUsersRequestWithHttpInfo(String token, String scopes, String triggerId, String user) throws ApiException {
        okhttp3.Call localVarCall = appsPermissionsUsersRequestValidateBeforeCall(token, scopes, triggerId, user, null);
        Type localVarReturnType = new TypeToken<DefaultSuccessTemplate>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Enables an app to trigger a permissions modal to grant an app access to a user access scope.
     * @param token Authentication token. Requires scope: &#x60;none&#x60; (required)
     * @param scopes A comma separated list of user scopes to request for (required)
     * @param triggerId Token used to trigger the request (required)
     * @param user The user this scope is being requested for (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Standard success response when used with a user token </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Standard failure response when trigger_id is invalid </td><td>  -  </td></tr>
     </table>
     * API method documentation
     * @see <a href="https://api.slack.com/methods/apps.permissions.users.request"> Documentation</a>
     */
    public okhttp3.Call appsPermissionsUsersRequestAsync(String token, String scopes, String triggerId, String user, final ApiCallback<DefaultSuccessTemplate> _callback) throws ApiException {

        okhttp3.Call localVarCall = appsPermissionsUsersRequestValidateBeforeCall(token, scopes, triggerId, user, _callback);
        Type localVarReturnType = new TypeToken<DefaultSuccessTemplate>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
