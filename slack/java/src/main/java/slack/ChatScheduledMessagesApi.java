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


import java.math.BigDecimal;
import com.outmatchapi.slack.ChatScheduledMessagesListErrorSchema;
import com.outmatchapi.slack.ChatScheduledMessagesListSchema;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class ChatScheduledMessagesApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ChatScheduledMessagesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ChatScheduledMessagesApi(ApiClient apiClient) {
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
     * Build call for chatScheduledMessagesList
     * @param token Authentication token. Requires scope: &#x60;none&#x60; (optional)
     * @param channel The channel of the scheduled messages (optional)
     * @param latest A UNIX timestamp of the latest value in the time range (optional)
     * @param oldest A UNIX timestamp of the oldest value in the time range (optional)
     * @param limit Maximum number of original entries to return. (optional)
     * @param cursor For pagination purposes, this is the &#x60;cursor&#x60; value returned from a previous call to &#x60;chat.scheduledmessages.list&#x60; indicating where you want to start this call from. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Typical success response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Typical error response if the channel passed is invalid </td><td>  -  </td></tr>
     </table>
     * API method documentation
     * @see <a href="https://api.slack.com/methods/chat.scheduledMessages.list"> Documentation</a>
     */
    public okhttp3.Call chatScheduledMessagesListCall(String token, String channel, BigDecimal latest, BigDecimal oldest, Integer limit, String cursor, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/chat.scheduledMessages.list";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (channel != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("channel", channel));
        }

        if (latest != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("latest", latest));
        }

        if (oldest != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("oldest", oldest));
        }

        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
        }

        if (cursor != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("cursor", cursor));
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
    private okhttp3.Call chatScheduledMessagesListValidateBeforeCall(String token, String channel, BigDecimal latest, BigDecimal oldest, Integer limit, String cursor, final ApiCallback _callback) throws ApiException {
        return chatScheduledMessagesListCall(token, channel, latest, oldest, limit, cursor, _callback);

    }

    /**
     * 
     * Returns a list of scheduled messages.
     * @param token Authentication token. Requires scope: &#x60;none&#x60; (optional)
     * @param channel The channel of the scheduled messages (optional)
     * @param latest A UNIX timestamp of the latest value in the time range (optional)
     * @param oldest A UNIX timestamp of the oldest value in the time range (optional)
     * @param limit Maximum number of original entries to return. (optional)
     * @param cursor For pagination purposes, this is the &#x60;cursor&#x60; value returned from a previous call to &#x60;chat.scheduledmessages.list&#x60; indicating where you want to start this call from. (optional)
     * @return ChatScheduledMessagesListSchema
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Typical success response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Typical error response if the channel passed is invalid </td><td>  -  </td></tr>
     </table>
     * API method documentation
     * @see <a href="https://api.slack.com/methods/chat.scheduledMessages.list"> Documentation</a>
     */
    public ChatScheduledMessagesListSchema chatScheduledMessagesList(String token, String channel, BigDecimal latest, BigDecimal oldest, Integer limit, String cursor) throws ApiException {
        ApiResponse<ChatScheduledMessagesListSchema> localVarResp = chatScheduledMessagesListWithHttpInfo(token, channel, latest, oldest, limit, cursor);
        return localVarResp.getData();
    }

    /**
     * 
     * Returns a list of scheduled messages.
     * @param token Authentication token. Requires scope: &#x60;none&#x60; (optional)
     * @param channel The channel of the scheduled messages (optional)
     * @param latest A UNIX timestamp of the latest value in the time range (optional)
     * @param oldest A UNIX timestamp of the oldest value in the time range (optional)
     * @param limit Maximum number of original entries to return. (optional)
     * @param cursor For pagination purposes, this is the &#x60;cursor&#x60; value returned from a previous call to &#x60;chat.scheduledmessages.list&#x60; indicating where you want to start this call from. (optional)
     * @return ApiResponse&lt;ChatScheduledMessagesListSchema&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Typical success response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Typical error response if the channel passed is invalid </td><td>  -  </td></tr>
     </table>
     * API method documentation
     * @see <a href="https://api.slack.com/methods/chat.scheduledMessages.list"> Documentation</a>
     */
    public ApiResponse<ChatScheduledMessagesListSchema> chatScheduledMessagesListWithHttpInfo(String token, String channel, BigDecimal latest, BigDecimal oldest, Integer limit, String cursor) throws ApiException {
        okhttp3.Call localVarCall = chatScheduledMessagesListValidateBeforeCall(token, channel, latest, oldest, limit, cursor, null);
        Type localVarReturnType = new TypeToken<ChatScheduledMessagesListSchema>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Returns a list of scheduled messages.
     * @param token Authentication token. Requires scope: &#x60;none&#x60; (optional)
     * @param channel The channel of the scheduled messages (optional)
     * @param latest A UNIX timestamp of the latest value in the time range (optional)
     * @param oldest A UNIX timestamp of the oldest value in the time range (optional)
     * @param limit Maximum number of original entries to return. (optional)
     * @param cursor For pagination purposes, this is the &#x60;cursor&#x60; value returned from a previous call to &#x60;chat.scheduledmessages.list&#x60; indicating where you want to start this call from. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Typical success response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Typical error response if the channel passed is invalid </td><td>  -  </td></tr>
     </table>
     * API method documentation
     * @see <a href="https://api.slack.com/methods/chat.scheduledMessages.list"> Documentation</a>
     */
    public okhttp3.Call chatScheduledMessagesListAsync(String token, String channel, BigDecimal latest, BigDecimal oldest, Integer limit, String cursor, final ApiCallback<ChatScheduledMessagesListSchema> _callback) throws ApiException {

        okhttp3.Call localVarCall = chatScheduledMessagesListValidateBeforeCall(token, channel, latest, oldest, limit, cursor, _callback);
        Type localVarReturnType = new TypeToken<ChatScheduledMessagesListSchema>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}