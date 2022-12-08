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

import com.outmatchapi.slack.FilesCommentsDeleteErrorSchema
import com.outmatchapi.slack.FilesCommentsDeleteSchema

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

class FilesCommentsApi(basePath: kotlin.String = defaultBasePath, client: OkHttpClient = ApiClient.defaultClient) : ApiClient(basePath, client) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "https://slack.com/api")
        }
    }

    /**
     * 
     * Deletes an existing comment on a file.
     * @param token Authentication token. Requires scope: &#x60;files:write:user&#x60; (optional)
     * @param file File to delete a comment from. (optional)
     * @param id The comment to delete. (optional)
     * @return FilesCommentsDeleteSchema
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    suspend fun filesCommentsDelete(token: kotlin.String? = null, file: kotlin.String? = null, id: kotlin.String? = null) : FilesCommentsDeleteSchema = withContext(Dispatchers.IO) {
        val localVarResponse = filesCommentsDeleteWithHttpInfo(token = token, file = file, id = id)

        return@withContext when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as FilesCommentsDeleteSchema
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
     * Deletes an existing comment on a file.
     * @param token Authentication token. Requires scope: &#x60;files:write:user&#x60; (optional)
     * @param file File to delete a comment from. (optional)
     * @param id The comment to delete. (optional)
     * @return ApiResponse<FilesCommentsDeleteSchema?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    suspend fun filesCommentsDeleteWithHttpInfo(token: kotlin.String?, file: kotlin.String?, id: kotlin.String?) : ApiResponse<FilesCommentsDeleteSchema?> = withContext(Dispatchers.IO) {
        val localVariableConfig = filesCommentsDeleteRequestConfig(token = token, file = file, id = id)

        return@withContext request<Map<String, PartConfig<*>>, FilesCommentsDeleteSchema>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation filesCommentsDelete
     *
     * @param token Authentication token. Requires scope: &#x60;files:write:user&#x60; (optional)
     * @param file File to delete a comment from. (optional)
     * @param id The comment to delete. (optional)
     * @return RequestConfig
     */
    fun filesCommentsDeleteRequestConfig(token: kotlin.String?, file: kotlin.String?, id: kotlin.String?) : RequestConfig<Map<String, PartConfig<*>>> {
        val localVariableBody = mapOf(
            "file" to PartConfig(body = file, headers = mutableMapOf()),
            "id" to PartConfig(body = id, headers = mutableMapOf()),)
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf("Content-Type" to "application/x-www-form-urlencoded")
        token?.apply { localVariableHeaders["token"] = this.toString() }
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/files.comments.delete",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }


    private fun encodeURIComponent(uriComponent: kotlin.String): kotlin.String =
        HttpUrl.Builder().scheme("http").host("localhost").addPathSegment(uriComponent).build().encodedPathSegments[0]
}
