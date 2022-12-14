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

public class SearchApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public SearchApi() {
        this(Configuration.getDefaultApiClient());
    }

    public SearchApi(ApiClient apiClient) {
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
     * Build call for searchMessages
     * @param token Authentication token. Requires scope: &#x60;search:read&#x60; (required)
     * @param query Search query. (required)
     * @param count Pass the number of results you want per \&quot;page\&quot;. Maximum of &#x60;100&#x60;. (optional)
     * @param highlight Pass a value of &#x60;true&#x60; to enable query highlight markers (see below). (optional)
     * @param page  (optional)
     * @param sort Return matches sorted by either &#x60;score&#x60; or &#x60;timestamp&#x60;. (optional)
     * @param sortDir Change sort direction to ascending (&#x60;asc&#x60;) or descending (&#x60;desc&#x60;). (optional)
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
     * @see <a href="https://api.slack.com/methods/search.messages"> Documentation</a>
     */
    public okhttp3.Call searchMessagesCall(String token, String query, Integer count, Boolean highlight, Integer page, String sort, String sortDir, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/search.messages";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (token != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("token", token));
        }

        if (count != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("count", count));
        }

        if (highlight != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("highlight", highlight));
        }

        if (page != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page", page));
        }

        if (query != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("query", query));
        }

        if (sort != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("sort", sort));
        }

        if (sortDir != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("sort_dir", sortDir));
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
    private okhttp3.Call searchMessagesValidateBeforeCall(String token, String query, Integer count, Boolean highlight, Integer page, String sort, String sortDir, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'token' is set
        if (token == null) {
            throw new ApiException("Missing the required parameter 'token' when calling searchMessages(Async)");
        }

        // verify the required parameter 'query' is set
        if (query == null) {
            throw new ApiException("Missing the required parameter 'query' when calling searchMessages(Async)");
        }

        return searchMessagesCall(token, query, count, highlight, page, sort, sortDir, _callback);

    }

    /**
     * 
     * Searches for messages matching a query.
     * @param token Authentication token. Requires scope: &#x60;search:read&#x60; (required)
     * @param query Search query. (required)
     * @param count Pass the number of results you want per \&quot;page\&quot;. Maximum of &#x60;100&#x60;. (optional)
     * @param highlight Pass a value of &#x60;true&#x60; to enable query highlight markers (see below). (optional)
     * @param page  (optional)
     * @param sort Return matches sorted by either &#x60;score&#x60; or &#x60;timestamp&#x60;. (optional)
     * @param sortDir Change sort direction to ascending (&#x60;asc&#x60;) or descending (&#x60;desc&#x60;). (optional)
     * @return DefaultSuccessTemplate
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Typical success response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Typical error response </td><td>  -  </td></tr>
     </table>
     * API method documentation
     * @see <a href="https://api.slack.com/methods/search.messages"> Documentation</a>
     */
    public DefaultSuccessTemplate searchMessages(String token, String query, Integer count, Boolean highlight, Integer page, String sort, String sortDir) throws ApiException {
        ApiResponse<DefaultSuccessTemplate> localVarResp = searchMessagesWithHttpInfo(token, query, count, highlight, page, sort, sortDir);
        return localVarResp.getData();
    }

    /**
     * 
     * Searches for messages matching a query.
     * @param token Authentication token. Requires scope: &#x60;search:read&#x60; (required)
     * @param query Search query. (required)
     * @param count Pass the number of results you want per \&quot;page\&quot;. Maximum of &#x60;100&#x60;. (optional)
     * @param highlight Pass a value of &#x60;true&#x60; to enable query highlight markers (see below). (optional)
     * @param page  (optional)
     * @param sort Return matches sorted by either &#x60;score&#x60; or &#x60;timestamp&#x60;. (optional)
     * @param sortDir Change sort direction to ascending (&#x60;asc&#x60;) or descending (&#x60;desc&#x60;). (optional)
     * @return ApiResponse&lt;DefaultSuccessTemplate&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Typical success response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Typical error response </td><td>  -  </td></tr>
     </table>
     * API method documentation
     * @see <a href="https://api.slack.com/methods/search.messages"> Documentation</a>
     */
    public ApiResponse<DefaultSuccessTemplate> searchMessagesWithHttpInfo(String token, String query, Integer count, Boolean highlight, Integer page, String sort, String sortDir) throws ApiException {
        okhttp3.Call localVarCall = searchMessagesValidateBeforeCall(token, query, count, highlight, page, sort, sortDir, null);
        Type localVarReturnType = new TypeToken<DefaultSuccessTemplate>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Searches for messages matching a query.
     * @param token Authentication token. Requires scope: &#x60;search:read&#x60; (required)
     * @param query Search query. (required)
     * @param count Pass the number of results you want per \&quot;page\&quot;. Maximum of &#x60;100&#x60;. (optional)
     * @param highlight Pass a value of &#x60;true&#x60; to enable query highlight markers (see below). (optional)
     * @param page  (optional)
     * @param sort Return matches sorted by either &#x60;score&#x60; or &#x60;timestamp&#x60;. (optional)
     * @param sortDir Change sort direction to ascending (&#x60;asc&#x60;) or descending (&#x60;desc&#x60;). (optional)
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
     * @see <a href="https://api.slack.com/methods/search.messages"> Documentation</a>
     */
    public okhttp3.Call searchMessagesAsync(String token, String query, Integer count, Boolean highlight, Integer page, String sort, String sortDir, final ApiCallback<DefaultSuccessTemplate> _callback) throws ApiException {

        okhttp3.Call localVarCall = searchMessagesValidateBeforeCall(token, query, count, highlight, page, sort, sortDir, _callback);
        Type localVarReturnType = new TypeToken<DefaultSuccessTemplate>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
