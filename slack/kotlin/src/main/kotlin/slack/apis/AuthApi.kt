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

import com.outmatchapi.slack.AuthRevokeErrorSchema
import com.outmatchapi.slack.AuthRevokeSchema
import com.outmatchapi.slack.AuthTestErrorSchema
import com.outmatchapi.slack.AuthTestSuccessSchema

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

class AuthApi(basePath: kotlin.String = defaultBasePath, client: OkHttpClient = ApiClient.defaultClient) : ApiClient(basePath, client) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "https://slack.com/api")
        }
    }

    /**
     * 
     * Revokes a token.
     * @param token Authentication token. Requires scope: &#x60;none&#x60;
     * @param test Setting this parameter to &#x60;1&#x60; triggers a _testing mode_ where the specified token will not actually be revoked. (optional)
     * @return AuthRevokeSchema
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    suspend fun authRevoke(token: kotlin.String, test: kotlin.Boolean? = null) : AuthRevokeSchema = withContext(Dispatchers.IO) {
        val localVarResponse = authRevokeWithHttpInfo(token = token, test = test)

        return@withContext when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as AuthRevokeSchema
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
     * Revokes a token.
     * @param token Authentication token. Requires scope: &#x60;none&#x60;
     * @param test Setting this parameter to &#x60;1&#x60; triggers a _testing mode_ where the specified token will not actually be revoked. (optional)
     * @return ApiResponse<AuthRevokeSchema?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    suspend fun authRevokeWithHttpInfo(token: kotlin.String, test: kotlin.Boolean?) : ApiResponse<AuthRevokeSchema?> = withContext(Dispatchers.IO) {
        val localVariableConfig = authRevokeRequestConfig(token = token, test = test)

        return@withContext request<Unit, AuthRevokeSchema>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation authRevoke
     *
     * @param token Authentication token. Requires scope: &#x60;none&#x60;
     * @param test Setting this parameter to &#x60;1&#x60; triggers a _testing mode_ where the specified token will not actually be revoked. (optional)
     * @return RequestConfig
     */
    fun authRevokeRequestConfig(token: kotlin.String, test: kotlin.Boolean?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, kotlin.collections.List<kotlin.String>>()
            .apply {
                put("token", listOf(token.toString()))
                if (test != null) {
                    put("test", listOf(test.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/auth.revoke",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
     * 
     * Checks authentication &amp; identity.
     * @param token Authentication token. Requires scope: &#x60;none&#x60;
     * @return AuthTestSuccessSchema
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    suspend fun authTest(token: kotlin.String) : AuthTestSuccessSchema = withContext(Dispatchers.IO) {
        val localVarResponse = authTestWithHttpInfo(token = token)

        return@withContext when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as AuthTestSuccessSchema
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
     * Checks authentication &amp; identity.
     * @param token Authentication token. Requires scope: &#x60;none&#x60;
     * @return ApiResponse<AuthTestSuccessSchema?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    suspend fun authTestWithHttpInfo(token: kotlin.String) : ApiResponse<AuthTestSuccessSchema?> = withContext(Dispatchers.IO) {
        val localVariableConfig = authTestRequestConfig(token = token)

        return@withContext request<Unit, AuthTestSuccessSchema>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation authTest
     *
     * @param token Authentication token. Requires scope: &#x60;none&#x60;
     * @return RequestConfig
     */
    fun authTestRequestConfig(token: kotlin.String) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        token.apply { localVariableHeaders["token"] = this.toString() }
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/auth.test",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }


    private fun encodeURIComponent(uriComponent: kotlin.String): kotlin.String =
        HttpUrl.Builder().scheme("http").host("localhost").addPathSegment(uriComponent).build().encodedPathSegments[0]
}