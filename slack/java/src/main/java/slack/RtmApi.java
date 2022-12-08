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


import com.outmatchapi.slack.RtmConnectErrorSchema;
import com.outmatchapi.slack.RtmConnectSchema;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class RtmApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public RtmApi() {
        this(Configuration.getDefaultApiClient());
    }

    public RtmApi(ApiClient apiClient) {
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
     * Build call for rtmConnect
     * @param token Authentication token. Requires scope: &#x60;rtm:stream&#x60; (required)
     * @param batchPresenceAware Batch presence deliveries via subscription. Enabling changes the shape of &#x60;presence_change&#x60; events. See [batch presence](/docs/presence-and-status#batching). (optional)
     * @param presenceSub Only deliver presence events when requested by subscription. See [presence subscriptions](/docs/presence-and-status#subscriptions). (optional)
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
     * @see <a href="https://api.slack.com/methods/rtm.connect"> Documentation</a>
     */
    public okhttp3.Call rtmConnectCall(String token, Boolean batchPresenceAware, Boolean presenceSub, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/rtm.connect";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (token != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("token", token));
        }

        if (batchPresenceAware != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("batch_presence_aware", batchPresenceAware));
        }

        if (presenceSub != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("presence_sub", presenceSub));
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
    private okhttp3.Call rtmConnectValidateBeforeCall(String token, Boolean batchPresenceAware, Boolean presenceSub, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'token' is set
        if (token == null) {
            throw new ApiException("Missing the required parameter 'token' when calling rtmConnect(Async)");
        }

        return rtmConnectCall(token, batchPresenceAware, presenceSub, _callback);

    }

    /**
     * 
     * Starts a Real Time Messaging session.
     * @param token Authentication token. Requires scope: &#x60;rtm:stream&#x60; (required)
     * @param batchPresenceAware Batch presence deliveries via subscription. Enabling changes the shape of &#x60;presence_change&#x60; events. See [batch presence](/docs/presence-and-status#batching). (optional)
     * @param presenceSub Only deliver presence events when requested by subscription. See [presence subscriptions](/docs/presence-and-status#subscriptions). (optional)
     * @return RtmConnectSchema
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Typical success response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Typical error response </td><td>  -  </td></tr>
     </table>
     * API method documentation
     * @see <a href="https://api.slack.com/methods/rtm.connect"> Documentation</a>
     */
    public RtmConnectSchema rtmConnect(String token, Boolean batchPresenceAware, Boolean presenceSub) throws ApiException {
        ApiResponse<RtmConnectSchema> localVarResp = rtmConnectWithHttpInfo(token, batchPresenceAware, presenceSub);
        return localVarResp.getData();
    }

    /**
     * 
     * Starts a Real Time Messaging session.
     * @param token Authentication token. Requires scope: &#x60;rtm:stream&#x60; (required)
     * @param batchPresenceAware Batch presence deliveries via subscription. Enabling changes the shape of &#x60;presence_change&#x60; events. See [batch presence](/docs/presence-and-status#batching). (optional)
     * @param presenceSub Only deliver presence events when requested by subscription. See [presence subscriptions](/docs/presence-and-status#subscriptions). (optional)
     * @return ApiResponse&lt;RtmConnectSchema&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Typical success response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Typical error response </td><td>  -  </td></tr>
     </table>
     * API method documentation
     * @see <a href="https://api.slack.com/methods/rtm.connect"> Documentation</a>
     */
    public ApiResponse<RtmConnectSchema> rtmConnectWithHttpInfo(String token, Boolean batchPresenceAware, Boolean presenceSub) throws ApiException {
        okhttp3.Call localVarCall = rtmConnectValidateBeforeCall(token, batchPresenceAware, presenceSub, null);
        Type localVarReturnType = new TypeToken<RtmConnectSchema>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Starts a Real Time Messaging session.
     * @param token Authentication token. Requires scope: &#x60;rtm:stream&#x60; (required)
     * @param batchPresenceAware Batch presence deliveries via subscription. Enabling changes the shape of &#x60;presence_change&#x60; events. See [batch presence](/docs/presence-and-status#batching). (optional)
     * @param presenceSub Only deliver presence events when requested by subscription. See [presence subscriptions](/docs/presence-and-status#subscriptions). (optional)
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
     * @see <a href="https://api.slack.com/methods/rtm.connect"> Documentation</a>
     */
    public okhttp3.Call rtmConnectAsync(String token, Boolean batchPresenceAware, Boolean presenceSub, final ApiCallback<RtmConnectSchema> _callback) throws ApiException {

        okhttp3.Call localVarCall = rtmConnectValidateBeforeCall(token, batchPresenceAware, presenceSub, _callback);
        Type localVarReturnType = new TypeToken<RtmConnectSchema>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
