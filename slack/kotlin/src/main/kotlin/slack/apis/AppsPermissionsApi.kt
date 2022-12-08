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

import com.outmatchapi.slack.AppsPermissionsInfoErrorSchema
import com.outmatchapi.slack.AppsPermissionsInfoSchema
import com.outmatchapi.slack.AppsPermissionsRequestErrorSchema
import com.outmatchapi.slack.AppsPermissionsRequestSchema

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

class AppsPermissionsApi(basePath: kotlin.String = defaultBasePath, client: OkHttpClient = ApiClient.defaultClient) : ApiClient(basePath, client) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "https://slack.com/api")
        }
    }

    /**
     * 
     * Returns list of permissions this app has on a team.
     * @param token Authentication token. Requires scope: &#x60;none&#x60; (optional)
     * @return AppsPermissionsInfoSchema
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    suspend fun appsPermissionsInfo(token: kotlin.String? = null) : AppsPermissionsInfoSchema = withContext(Dispatchers.IO) {
        val localVarResponse = appsPermissionsInfoWithHttpInfo(token = token)

        return@withContext when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as AppsPermissionsInfoSchema
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
     * Returns list of permissions this app has on a team.
     * @param token Authentication token. Requires scope: &#x60;none&#x60; (optional)
     * @return ApiResponse<AppsPermissionsInfoSchema?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    suspend fun appsPermissionsInfoWithHttpInfo(token: kotlin.String?) : ApiResponse<AppsPermissionsInfoSchema?> = withContext(Dispatchers.IO) {
        val localVariableConfig = appsPermissionsInfoRequestConfig(token = token)

        return@withContext request<Unit, AppsPermissionsInfoSchema>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation appsPermissionsInfo
     *
     * @param token Authentication token. Requires scope: &#x60;none&#x60; (optional)
     * @return RequestConfig
     */
    fun appsPermissionsInfoRequestConfig(token: kotlin.String?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, kotlin.collections.List<kotlin.String>>()
            .apply {
                if (token != null) {
                    put("token", listOf(token.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/apps.permissions.info",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
     * 
     * Allows an app to request additional scopes
     * @param token Authentication token. Requires scope: &#x60;none&#x60;
     * @param scopes A comma separated list of scopes to request for
     * @param triggerId Token used to trigger the permissions API
     * @return AppsPermissionsRequestSchema
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    suspend fun appsPermissionsRequest(token: kotlin.String, scopes: kotlin.String, triggerId: kotlin.String) : AppsPermissionsRequestSchema = withContext(Dispatchers.IO) {
        val localVarResponse = appsPermissionsRequestWithHttpInfo(token = token, scopes = scopes, triggerId = triggerId)

        return@withContext when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as AppsPermissionsRequestSchema
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
     * Allows an app to request additional scopes
     * @param token Authentication token. Requires scope: &#x60;none&#x60;
     * @param scopes A comma separated list of scopes to request for
     * @param triggerId Token used to trigger the permissions API
     * @return ApiResponse<AppsPermissionsRequestSchema?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    suspend fun appsPermissionsRequestWithHttpInfo(token: kotlin.String, scopes: kotlin.String, triggerId: kotlin.String) : ApiResponse<AppsPermissionsRequestSchema?> = withContext(Dispatchers.IO) {
        val localVariableConfig = appsPermissionsRequestRequestConfig(token = token, scopes = scopes, triggerId = triggerId)

        return@withContext request<Unit, AppsPermissionsRequestSchema>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation appsPermissionsRequest
     *
     * @param token Authentication token. Requires scope: &#x60;none&#x60;
     * @param scopes A comma separated list of scopes to request for
     * @param triggerId Token used to trigger the permissions API
     * @return RequestConfig
     */
    fun appsPermissionsRequestRequestConfig(token: kotlin.String, scopes: kotlin.String, triggerId: kotlin.String) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, kotlin.collections.List<kotlin.String>>()
            .apply {
                put("token", listOf(token.toString()))
                put("scopes", listOf(scopes.toString()))
                put("trigger_id", listOf(triggerId.toString()))
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/apps.permissions.request",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }


    private fun encodeURIComponent(uriComponent: kotlin.String): kotlin.String =
        HttpUrl.Builder().scheme("http").host("localhost").addPathSegment(uriComponent).build().encodedPathSegments[0]
}