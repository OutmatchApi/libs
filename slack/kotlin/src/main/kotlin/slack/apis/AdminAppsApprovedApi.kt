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

class AdminAppsApprovedApi(basePath: kotlin.String = defaultBasePath, client: OkHttpClient = ApiClient.defaultClient) : ApiClient(basePath, client) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "https://slack.com/api")
        }
    }

    /**
     * 
     * List approved apps for an org or workspace.
     * @param token Authentication token. Requires scope: &#x60;admin.apps:read&#x60;
     * @param limit The maximum number of items to return. Must be between 1 - 1000 both inclusive. (optional)
     * @param cursor Set &#x60;cursor&#x60; to &#x60;next_cursor&#x60; returned by the previous call to list items in the next page (optional)
     * @param teamId  (optional)
     * @param enterpriseId  (optional)
     * @return DefaultSuccessTemplate
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    suspend fun adminAppsApprovedList(token: kotlin.String, limit: kotlin.Int? = null, cursor: kotlin.String? = null, teamId: kotlin.String? = null, enterpriseId: kotlin.String? = null) : DefaultSuccessTemplate = withContext(Dispatchers.IO) {
        val localVarResponse = adminAppsApprovedListWithHttpInfo(token = token, limit = limit, cursor = cursor, teamId = teamId, enterpriseId = enterpriseId)

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
     * List approved apps for an org or workspace.
     * @param token Authentication token. Requires scope: &#x60;admin.apps:read&#x60;
     * @param limit The maximum number of items to return. Must be between 1 - 1000 both inclusive. (optional)
     * @param cursor Set &#x60;cursor&#x60; to &#x60;next_cursor&#x60; returned by the previous call to list items in the next page (optional)
     * @param teamId  (optional)
     * @param enterpriseId  (optional)
     * @return ApiResponse<DefaultSuccessTemplate?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    suspend fun adminAppsApprovedListWithHttpInfo(token: kotlin.String, limit: kotlin.Int?, cursor: kotlin.String?, teamId: kotlin.String?, enterpriseId: kotlin.String?) : ApiResponse<DefaultSuccessTemplate?> = withContext(Dispatchers.IO) {
        val localVariableConfig = adminAppsApprovedListRequestConfig(token = token, limit = limit, cursor = cursor, teamId = teamId, enterpriseId = enterpriseId)

        return@withContext request<Unit, DefaultSuccessTemplate>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation adminAppsApprovedList
     *
     * @param token Authentication token. Requires scope: &#x60;admin.apps:read&#x60;
     * @param limit The maximum number of items to return. Must be between 1 - 1000 both inclusive. (optional)
     * @param cursor Set &#x60;cursor&#x60; to &#x60;next_cursor&#x60; returned by the previous call to list items in the next page (optional)
     * @param teamId  (optional)
     * @param enterpriseId  (optional)
     * @return RequestConfig
     */
    fun adminAppsApprovedListRequestConfig(token: kotlin.String, limit: kotlin.Int?, cursor: kotlin.String?, teamId: kotlin.String?, enterpriseId: kotlin.String?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, kotlin.collections.List<kotlin.String>>()
            .apply {
                put("token", listOf(token.toString()))
                if (limit != null) {
                    put("limit", listOf(limit.toString()))
                }
                if (cursor != null) {
                    put("cursor", listOf(cursor.toString()))
                }
                if (teamId != null) {
                    put("team_id", listOf(teamId.toString()))
                }
                if (enterpriseId != null) {
                    put("enterprise_id", listOf(enterpriseId.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/admin.apps.approved.list",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }


    private fun encodeURIComponent(uriComponent: kotlin.String): kotlin.String =
        HttpUrl.Builder().scheme("http").host("localhost").addPathSegment(uriComponent).build().encodedPathSegments[0]
}