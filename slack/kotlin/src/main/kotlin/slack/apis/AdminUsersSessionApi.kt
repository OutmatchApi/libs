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

class AdminUsersSessionApi(basePath: kotlin.String = defaultBasePath, client: OkHttpClient = ApiClient.defaultClient) : ApiClient(basePath, client) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "https://slack.com/api")
        }
    }

    /**
     * 
     * Invalidate a single session for a user by session_id
     * @param token Authentication token. Requires scope: &#x60;admin.users:write&#x60;
     * @param sessionId 
     * @param teamId ID of the team that the session belongs to
     * @return DefaultSuccessTemplate
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    suspend fun adminUsersSessionInvalidate(token: kotlin.String, sessionId: kotlin.Int, teamId: kotlin.String) : DefaultSuccessTemplate = withContext(Dispatchers.IO) {
        val localVarResponse = adminUsersSessionInvalidateWithHttpInfo(token = token, sessionId = sessionId, teamId = teamId)

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
     * Invalidate a single session for a user by session_id
     * @param token Authentication token. Requires scope: &#x60;admin.users:write&#x60;
     * @param sessionId 
     * @param teamId ID of the team that the session belongs to
     * @return ApiResponse<DefaultSuccessTemplate?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    suspend fun adminUsersSessionInvalidateWithHttpInfo(token: kotlin.String, sessionId: kotlin.Int, teamId: kotlin.String) : ApiResponse<DefaultSuccessTemplate?> = withContext(Dispatchers.IO) {
        val localVariableConfig = adminUsersSessionInvalidateRequestConfig(token = token, sessionId = sessionId, teamId = teamId)

        return@withContext request<Map<String, PartConfig<*>>, DefaultSuccessTemplate>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation adminUsersSessionInvalidate
     *
     * @param token Authentication token. Requires scope: &#x60;admin.users:write&#x60;
     * @param sessionId 
     * @param teamId ID of the team that the session belongs to
     * @return RequestConfig
     */
    fun adminUsersSessionInvalidateRequestConfig(token: kotlin.String, sessionId: kotlin.Int, teamId: kotlin.String) : RequestConfig<Map<String, PartConfig<*>>> {
        val localVariableBody = mapOf(
            "session_id" to PartConfig(body = sessionId, headers = mutableMapOf()),
            "team_id" to PartConfig(body = teamId, headers = mutableMapOf()),)
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf("Content-Type" to "application/x-www-form-urlencoded")
        token.apply { localVariableHeaders["token"] = this.toString() }
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/admin.users.session.invalidate",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
     * 
     * Wipes all valid sessions on all devices for a given user
     * @param token Authentication token. Requires scope: &#x60;admin.users:write&#x60;
     * @param userId The ID of the user to wipe sessions for
     * @param mobileOnly Only expire mobile sessions (default: false) (optional)
     * @param webOnly Only expire web sessions (default: false) (optional)
     * @return DefaultSuccessTemplate
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    suspend fun adminUsersSessionReset(token: kotlin.String, userId: kotlin.String, mobileOnly: kotlin.Boolean? = null, webOnly: kotlin.Boolean? = null) : DefaultSuccessTemplate = withContext(Dispatchers.IO) {
        val localVarResponse = adminUsersSessionResetWithHttpInfo(token = token, userId = userId, mobileOnly = mobileOnly, webOnly = webOnly)

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
     * Wipes all valid sessions on all devices for a given user
     * @param token Authentication token. Requires scope: &#x60;admin.users:write&#x60;
     * @param userId The ID of the user to wipe sessions for
     * @param mobileOnly Only expire mobile sessions (default: false) (optional)
     * @param webOnly Only expire web sessions (default: false) (optional)
     * @return ApiResponse<DefaultSuccessTemplate?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    suspend fun adminUsersSessionResetWithHttpInfo(token: kotlin.String, userId: kotlin.String, mobileOnly: kotlin.Boolean?, webOnly: kotlin.Boolean?) : ApiResponse<DefaultSuccessTemplate?> = withContext(Dispatchers.IO) {
        val localVariableConfig = adminUsersSessionResetRequestConfig(token = token, userId = userId, mobileOnly = mobileOnly, webOnly = webOnly)

        return@withContext request<Map<String, PartConfig<*>>, DefaultSuccessTemplate>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation adminUsersSessionReset
     *
     * @param token Authentication token. Requires scope: &#x60;admin.users:write&#x60;
     * @param userId The ID of the user to wipe sessions for
     * @param mobileOnly Only expire mobile sessions (default: false) (optional)
     * @param webOnly Only expire web sessions (default: false) (optional)
     * @return RequestConfig
     */
    fun adminUsersSessionResetRequestConfig(token: kotlin.String, userId: kotlin.String, mobileOnly: kotlin.Boolean?, webOnly: kotlin.Boolean?) : RequestConfig<Map<String, PartConfig<*>>> {
        val localVariableBody = mapOf(
            "mobile_only" to PartConfig(body = mobileOnly, headers = mutableMapOf()),
            "user_id" to PartConfig(body = userId, headers = mutableMapOf()),
            "web_only" to PartConfig(body = webOnly, headers = mutableMapOf()),)
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf("Content-Type" to "application/x-www-form-urlencoded")
        token.apply { localVariableHeaders["token"] = this.toString() }
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/admin.users.session.reset",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }


    private fun encodeURIComponent(uriComponent: kotlin.String): kotlin.String =
        HttpUrl.Builder().scheme("http").host("localhost").addPathSegment(uriComponent).build().encodedPathSegments[0]
}