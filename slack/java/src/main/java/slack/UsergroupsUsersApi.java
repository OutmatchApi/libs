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


import com.outmatchapi.slack.UsergroupsUsersListErrorSchema;
import com.outmatchapi.slack.UsergroupsUsersListSchema;
import com.outmatchapi.slack.UsergroupsUsersUpdateErrorSchema;
import com.outmatchapi.slack.UsergroupsUsersUpdateSchema;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class UsergroupsUsersApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public UsergroupsUsersApi() {
        this(Configuration.getDefaultApiClient());
    }

    public UsergroupsUsersApi(ApiClient apiClient) {
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
     * Build call for usergroupsUsersList
     * @param token Authentication token. Requires scope: &#x60;usergroups:read&#x60; (required)
     * @param usergroup The encoded ID of the User Group to update. (required)
     * @param includeDisabled Allow results that involve disabled User Groups. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Standard success response when used with a user token </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Standard failure response when used with an invalid token </td><td>  -  </td></tr>
     </table>
     * API method documentation
     * @see <a href="https://api.slack.com/methods/usergroups.users.list"> Documentation</a>
     */
    public okhttp3.Call usergroupsUsersListCall(String token, String usergroup, Boolean includeDisabled, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/usergroups.users.list";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (token != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("token", token));
        }

        if (includeDisabled != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("include_disabled", includeDisabled));
        }

        if (usergroup != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("usergroup", usergroup));
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
    private okhttp3.Call usergroupsUsersListValidateBeforeCall(String token, String usergroup, Boolean includeDisabled, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'token' is set
        if (token == null) {
            throw new ApiException("Missing the required parameter 'token' when calling usergroupsUsersList(Async)");
        }

        // verify the required parameter 'usergroup' is set
        if (usergroup == null) {
            throw new ApiException("Missing the required parameter 'usergroup' when calling usergroupsUsersList(Async)");
        }

        return usergroupsUsersListCall(token, usergroup, includeDisabled, _callback);

    }

    /**
     * 
     * List all users in a User Group
     * @param token Authentication token. Requires scope: &#x60;usergroups:read&#x60; (required)
     * @param usergroup The encoded ID of the User Group to update. (required)
     * @param includeDisabled Allow results that involve disabled User Groups. (optional)
     * @return UsergroupsUsersListSchema
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Standard success response when used with a user token </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Standard failure response when used with an invalid token </td><td>  -  </td></tr>
     </table>
     * API method documentation
     * @see <a href="https://api.slack.com/methods/usergroups.users.list"> Documentation</a>
     */
    public UsergroupsUsersListSchema usergroupsUsersList(String token, String usergroup, Boolean includeDisabled) throws ApiException {
        ApiResponse<UsergroupsUsersListSchema> localVarResp = usergroupsUsersListWithHttpInfo(token, usergroup, includeDisabled);
        return localVarResp.getData();
    }

    /**
     * 
     * List all users in a User Group
     * @param token Authentication token. Requires scope: &#x60;usergroups:read&#x60; (required)
     * @param usergroup The encoded ID of the User Group to update. (required)
     * @param includeDisabled Allow results that involve disabled User Groups. (optional)
     * @return ApiResponse&lt;UsergroupsUsersListSchema&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Standard success response when used with a user token </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Standard failure response when used with an invalid token </td><td>  -  </td></tr>
     </table>
     * API method documentation
     * @see <a href="https://api.slack.com/methods/usergroups.users.list"> Documentation</a>
     */
    public ApiResponse<UsergroupsUsersListSchema> usergroupsUsersListWithHttpInfo(String token, String usergroup, Boolean includeDisabled) throws ApiException {
        okhttp3.Call localVarCall = usergroupsUsersListValidateBeforeCall(token, usergroup, includeDisabled, null);
        Type localVarReturnType = new TypeToken<UsergroupsUsersListSchema>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * List all users in a User Group
     * @param token Authentication token. Requires scope: &#x60;usergroups:read&#x60; (required)
     * @param usergroup The encoded ID of the User Group to update. (required)
     * @param includeDisabled Allow results that involve disabled User Groups. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Standard success response when used with a user token </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Standard failure response when used with an invalid token </td><td>  -  </td></tr>
     </table>
     * API method documentation
     * @see <a href="https://api.slack.com/methods/usergroups.users.list"> Documentation</a>
     */
    public okhttp3.Call usergroupsUsersListAsync(String token, String usergroup, Boolean includeDisabled, final ApiCallback<UsergroupsUsersListSchema> _callback) throws ApiException {

        okhttp3.Call localVarCall = usergroupsUsersListValidateBeforeCall(token, usergroup, includeDisabled, _callback);
        Type localVarReturnType = new TypeToken<UsergroupsUsersListSchema>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for usergroupsUsersUpdate
     * @param token Authentication token. Requires scope: &#x60;usergroups:write&#x60; (required)
     * @param usergroup The encoded ID of the User Group to update. (required)
     * @param users A comma separated string of encoded user IDs that represent the entire list of users for the User Group. (required)
     * @param includeCount Include the number of users in the User Group. (optional)
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
     * @see <a href="https://api.slack.com/methods/usergroups.users.update"> Documentation</a>
     */
    public okhttp3.Call usergroupsUsersUpdateCall(String token, String usergroup, String users, Boolean includeCount, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/usergroups.users.update";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (includeCount != null) {
            localVarFormParams.put("include_count", includeCount);
        }

        if (usergroup != null) {
            localVarFormParams.put("usergroup", usergroup);
        }

        if (users != null) {
            localVarFormParams.put("users", users);
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
    private okhttp3.Call usergroupsUsersUpdateValidateBeforeCall(String token, String usergroup, String users, Boolean includeCount, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'token' is set
        if (token == null) {
            throw new ApiException("Missing the required parameter 'token' when calling usergroupsUsersUpdate(Async)");
        }

        // verify the required parameter 'usergroup' is set
        if (usergroup == null) {
            throw new ApiException("Missing the required parameter 'usergroup' when calling usergroupsUsersUpdate(Async)");
        }

        // verify the required parameter 'users' is set
        if (users == null) {
            throw new ApiException("Missing the required parameter 'users' when calling usergroupsUsersUpdate(Async)");
        }

        return usergroupsUsersUpdateCall(token, usergroup, users, includeCount, _callback);

    }

    /**
     * 
     * Update the list of users for a User Group
     * @param token Authentication token. Requires scope: &#x60;usergroups:write&#x60; (required)
     * @param usergroup The encoded ID of the User Group to update. (required)
     * @param users A comma separated string of encoded user IDs that represent the entire list of users for the User Group. (required)
     * @param includeCount Include the number of users in the User Group. (optional)
     * @return UsergroupsUsersUpdateSchema
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Typical success response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Typical error response </td><td>  -  </td></tr>
     </table>
     * API method documentation
     * @see <a href="https://api.slack.com/methods/usergroups.users.update"> Documentation</a>
     */
    public UsergroupsUsersUpdateSchema usergroupsUsersUpdate(String token, String usergroup, String users, Boolean includeCount) throws ApiException {
        ApiResponse<UsergroupsUsersUpdateSchema> localVarResp = usergroupsUsersUpdateWithHttpInfo(token, usergroup, users, includeCount);
        return localVarResp.getData();
    }

    /**
     * 
     * Update the list of users for a User Group
     * @param token Authentication token. Requires scope: &#x60;usergroups:write&#x60; (required)
     * @param usergroup The encoded ID of the User Group to update. (required)
     * @param users A comma separated string of encoded user IDs that represent the entire list of users for the User Group. (required)
     * @param includeCount Include the number of users in the User Group. (optional)
     * @return ApiResponse&lt;UsergroupsUsersUpdateSchema&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Typical success response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Typical error response </td><td>  -  </td></tr>
     </table>
     * API method documentation
     * @see <a href="https://api.slack.com/methods/usergroups.users.update"> Documentation</a>
     */
    public ApiResponse<UsergroupsUsersUpdateSchema> usergroupsUsersUpdateWithHttpInfo(String token, String usergroup, String users, Boolean includeCount) throws ApiException {
        okhttp3.Call localVarCall = usergroupsUsersUpdateValidateBeforeCall(token, usergroup, users, includeCount, null);
        Type localVarReturnType = new TypeToken<UsergroupsUsersUpdateSchema>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Update the list of users for a User Group
     * @param token Authentication token. Requires scope: &#x60;usergroups:write&#x60; (required)
     * @param usergroup The encoded ID of the User Group to update. (required)
     * @param users A comma separated string of encoded user IDs that represent the entire list of users for the User Group. (required)
     * @param includeCount Include the number of users in the User Group. (optional)
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
     * @see <a href="https://api.slack.com/methods/usergroups.users.update"> Documentation</a>
     */
    public okhttp3.Call usergroupsUsersUpdateAsync(String token, String usergroup, String users, Boolean includeCount, final ApiCallback<UsergroupsUsersUpdateSchema> _callback) throws ApiException {

        okhttp3.Call localVarCall = usergroupsUsersUpdateValidateBeforeCall(token, usergroup, users, includeCount, _callback);
        Type localVarReturnType = new TypeToken<UsergroupsUsersUpdateSchema>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
