/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package slack.apis

import java.io.IOException
import okhttp3.OkHttpClient
import okhttp3.HttpUrl

import com.outmatchapi.slack.DefaultErrorTemplate
import com.outmatchapi.slack.DefaultSuccessTemplate

import com.squareup.moshi.Json

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import slack.infrastructure.ApiClient
import slack.infrastructure.ApiResponse
import slack.infrastructure.ClientException
import slack.infrastructure.ClientError
import slack.infrastructure.ServerException
import slack.infrastructure.ServerError
import slack.infrastructure.MultiValueMap
import slack.infrastructure.PartConfig
import slack.infrastructure.RequestConfig
import slack.infrastructure.RequestMethod
import slack.infrastructure.ResponseType
import slack.infrastructure.Success
import slack.infrastructure.toMultiValue

class AdminConversationsEkmApi(basePath: kotlin.String = defaultBasePath, client: OkHttpClient = ApiClient.defaultClient) : ApiClient(basePath, client) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "https://slack.com/api")
        }
    }

    /**
     * 
     * List all disconnected channelsâ€”i.e., channels that were once connected to other workspaces and then disconnectedâ€”and the corresponding original channel IDs for key revocation with EKM.
     * @param token Authentication token. Requires scope: &#x60;admin.conversations:read&#x60;
     * @param channelIds A comma-separated list of channels to filter to. (optional)
     * @param teamIds A comma-separated list of the workspaces to which the channels you would like returned belong. (optional)
     * @param limit The maximum number of items to return. Must be between 1 - 1000 both inclusive. (optional)
     * @param cursor Set &#x60;cursor&#x60; to &#x60;next_cursor&#x60; returned by the previous call to list items in the next page. (optional)
     * @return DefaultSuccessTemplate
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    suspend fun adminConversationsEkmListOriginalConnectedChannelInfo(token: kotlin.String, channelIds: kotlin.String? = null, teamIds: kotlin.String? = null, limit: kotlin.Int? = null, cursor: kotlin.String? = null) : DefaultSuccessTemplate = withContext(Dispatchers.IO) {
        val localVarResponse = adminConversationsEkmListOriginalConnectedChannelInfoWithHttpInfo(token = token, channelIds = channelIds, teamIds = teamIds, limit = limit, cursor = cursor)

        return@withContext when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as DefaultSuccessTemplate
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
     * 
     * List all disconnected channelsâ€”i.e., channels that were once connected to other workspaces and then disconnectedâ€”and the corresponding original channel IDs for key revocation with EKM.
     * @param token Authentication token. Requires scope: &#x60;admin.conversations:read&#x60;
     * @param channelIds A comma-separated list of channels to filter to. (optional)
     * @param teamIds A comma-separated list of the workspaces to which the channels you would like returned belong. (optional)
     * @param limit The maximum number of items to return. Must be between 1 - 1000 both inclusive. (optional)
     * @param cursor Set &#x60;cursor&#x60; to &#x60;next_cursor&#x60; returned by the previous call to list items in the next page. (optional)
     * @return ApiResponse<DefaultSuccessTemplate?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    suspend fun adminConversationsEkmListOriginalConnectedChannelInfoWithHttpInfo(token: kotlin.String, channelIds: kotlin.String?, teamIds: kotlin.String?, limit: kotlin.Int?, cursor: kotlin.String?) : ApiResponse<DefaultSuccessTemplate?> = withContext(Dispatchers.IO) {
        val localVariableConfig = adminConversationsEkmListOriginalConnectedChannelInfoRequestConfig(token = token, channelIds = channelIds, teamIds = teamIds, limit = limit, cursor = cursor)

        return@withContext request<Unit, DefaultSuccessTemplate>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation adminConversationsEkmListOriginalConnectedChannelInfo
     *
     * @param token Authentication token. Requires scope: &#x60;admin.conversations:read&#x60;
     * @param channelIds A comma-separated list of channels to filter to. (optional)
     * @param teamIds A comma-separated list of the workspaces to which the channels you would like returned belong. (optional)
     * @param limit The maximum number of items to return. Must be between 1 - 1000 both inclusive. (optional)
     * @param cursor Set &#x60;cursor&#x60; to &#x60;next_cursor&#x60; returned by the previous call to list items in the next page. (optional)
     * @return RequestConfig
     */
    fun adminConversationsEkmListOriginalConnectedChannelInfoRequestConfig(token: kotlin.String, channelIds: kotlin.String?, teamIds: kotlin.String?, limit: kotlin.Int?, cursor: kotlin.String?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, kotlin.collections.List<kotlin.String>>()
            .apply {
                put("token", listOf(token.toString()))
                if (channelIds != null) {
                    put("channel_ids", listOf(channelIds.toString()))
                }
                if (teamIds != null) {
                    put("team_ids", listOf(teamIds.toString()))
                }
                if (limit != null) {
                    put("limit", listOf(limit.toString()))
                }
                if (cursor != null) {
                    put("cursor", listOf(cursor.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/admin.conversations.ekm.listOriginalConnectedChannelInfo",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }


    private fun encodeURIComponent(uriComponent: kotlin.String): kotlin.String =
        HttpUrl.Builder().scheme("http").host("localhost").addPathSegment(uriComponent).build().encodedPathSegments[0]
}
