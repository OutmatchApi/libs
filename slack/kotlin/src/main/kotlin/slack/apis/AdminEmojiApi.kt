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

class AdminEmojiApi(basePath: kotlin.String = defaultBasePath, client: OkHttpClient = ApiClient.defaultClient) : ApiClient(basePath, client) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "https://slack.com/api")
        }
    }

    /**
     * 
     * Add an emoji.
     * @param name The name of the emoji to be removed. Colons (&#x60;:myemoji:&#x60;) around the value are not required, although they may be included.
     * @param token Authentication token. Requires scope: &#x60;admin.teams:write&#x60;
     * @param url The URL of a file to use as an image for the emoji. Square images under 128KB and with transparent backgrounds work best.
     * @return DefaultSuccessTemplate
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    suspend fun adminEmojiAdd(name: kotlin.String, token: kotlin.String, url: kotlin.String) : DefaultSuccessTemplate = withContext(Dispatchers.IO) {
        val localVarResponse = adminEmojiAddWithHttpInfo(name = name, token = token, url = url)

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
     * Add an emoji.
     * @param name The name of the emoji to be removed. Colons (&#x60;:myemoji:&#x60;) around the value are not required, although they may be included.
     * @param token Authentication token. Requires scope: &#x60;admin.teams:write&#x60;
     * @param url The URL of a file to use as an image for the emoji. Square images under 128KB and with transparent backgrounds work best.
     * @return ApiResponse<DefaultSuccessTemplate?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    suspend fun adminEmojiAddWithHttpInfo(name: kotlin.String, token: kotlin.String, url: kotlin.String) : ApiResponse<DefaultSuccessTemplate?> = withContext(Dispatchers.IO) {
        val localVariableConfig = adminEmojiAddRequestConfig(name = name, token = token, url = url)

        return@withContext request<Map<String, PartConfig<*>>, DefaultSuccessTemplate>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation adminEmojiAdd
     *
     * @param name The name of the emoji to be removed. Colons (&#x60;:myemoji:&#x60;) around the value are not required, although they may be included.
     * @param token Authentication token. Requires scope: &#x60;admin.teams:write&#x60;
     * @param url The URL of a file to use as an image for the emoji. Square images under 128KB and with transparent backgrounds work best.
     * @return RequestConfig
     */
    fun adminEmojiAddRequestConfig(name: kotlin.String, token: kotlin.String, url: kotlin.String) : RequestConfig<Map<String, PartConfig<*>>> {
        val localVariableBody = mapOf(
            "name" to PartConfig(body = name, headers = mutableMapOf()),
            "token" to PartConfig(body = token, headers = mutableMapOf()),
            "url" to PartConfig(body = url, headers = mutableMapOf()),)
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf("Content-Type" to "application/x-www-form-urlencoded")
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/admin.emoji.add",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
     * 
     * Add an emoji alias.
     * @param aliasFor The alias of the emoji.
     * @param name The name of the emoji to be aliased. Colons (&#x60;:myemoji:&#x60;) around the value are not required, although they may be included.
     * @param token Authentication token. Requires scope: &#x60;admin.teams:write&#x60;
     * @return DefaultSuccessTemplate
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    suspend fun adminEmojiAddAlias(aliasFor: kotlin.String, name: kotlin.String, token: kotlin.String) : DefaultSuccessTemplate = withContext(Dispatchers.IO) {
        val localVarResponse = adminEmojiAddAliasWithHttpInfo(aliasFor = aliasFor, name = name, token = token)

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
     * Add an emoji alias.
     * @param aliasFor The alias of the emoji.
     * @param name The name of the emoji to be aliased. Colons (&#x60;:myemoji:&#x60;) around the value are not required, although they may be included.
     * @param token Authentication token. Requires scope: &#x60;admin.teams:write&#x60;
     * @return ApiResponse<DefaultSuccessTemplate?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    suspend fun adminEmojiAddAliasWithHttpInfo(aliasFor: kotlin.String, name: kotlin.String, token: kotlin.String) : ApiResponse<DefaultSuccessTemplate?> = withContext(Dispatchers.IO) {
        val localVariableConfig = adminEmojiAddAliasRequestConfig(aliasFor = aliasFor, name = name, token = token)

        return@withContext request<Map<String, PartConfig<*>>, DefaultSuccessTemplate>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation adminEmojiAddAlias
     *
     * @param aliasFor The alias of the emoji.
     * @param name The name of the emoji to be aliased. Colons (&#x60;:myemoji:&#x60;) around the value are not required, although they may be included.
     * @param token Authentication token. Requires scope: &#x60;admin.teams:write&#x60;
     * @return RequestConfig
     */
    fun adminEmojiAddAliasRequestConfig(aliasFor: kotlin.String, name: kotlin.String, token: kotlin.String) : RequestConfig<Map<String, PartConfig<*>>> {
        val localVariableBody = mapOf(
            "alias_for" to PartConfig(body = aliasFor, headers = mutableMapOf()),
            "name" to PartConfig(body = name, headers = mutableMapOf()),
            "token" to PartConfig(body = token, headers = mutableMapOf()),)
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf("Content-Type" to "application/x-www-form-urlencoded")
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/admin.emoji.addAlias",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
     * 
     * List emoji for an Enterprise Grid organization.
     * @param token Authentication token. Requires scope: &#x60;admin.teams:read&#x60;
     * @param cursor Set &#x60;cursor&#x60; to &#x60;next_cursor&#x60; returned by the previous call to list items in the next page (optional)
     * @param limit The maximum number of items to return. Must be between 1 - 1000 both inclusive. (optional)
     * @return DefaultSuccessTemplate
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    suspend fun adminEmojiList(token: kotlin.String, cursor: kotlin.String? = null, limit: kotlin.Int? = null) : DefaultSuccessTemplate = withContext(Dispatchers.IO) {
        val localVarResponse = adminEmojiListWithHttpInfo(token = token, cursor = cursor, limit = limit)

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
     * List emoji for an Enterprise Grid organization.
     * @param token Authentication token. Requires scope: &#x60;admin.teams:read&#x60;
     * @param cursor Set &#x60;cursor&#x60; to &#x60;next_cursor&#x60; returned by the previous call to list items in the next page (optional)
     * @param limit The maximum number of items to return. Must be between 1 - 1000 both inclusive. (optional)
     * @return ApiResponse<DefaultSuccessTemplate?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    suspend fun adminEmojiListWithHttpInfo(token: kotlin.String, cursor: kotlin.String?, limit: kotlin.Int?) : ApiResponse<DefaultSuccessTemplate?> = withContext(Dispatchers.IO) {
        val localVariableConfig = adminEmojiListRequestConfig(token = token, cursor = cursor, limit = limit)

        return@withContext request<Unit, DefaultSuccessTemplate>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation adminEmojiList
     *
     * @param token Authentication token. Requires scope: &#x60;admin.teams:read&#x60;
     * @param cursor Set &#x60;cursor&#x60; to &#x60;next_cursor&#x60; returned by the previous call to list items in the next page (optional)
     * @param limit The maximum number of items to return. Must be between 1 - 1000 both inclusive. (optional)
     * @return RequestConfig
     */
    fun adminEmojiListRequestConfig(token: kotlin.String, cursor: kotlin.String?, limit: kotlin.Int?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, kotlin.collections.List<kotlin.String>>()
            .apply {
                put("token", listOf(token.toString()))
                if (cursor != null) {
                    put("cursor", listOf(cursor.toString()))
                }
                if (limit != null) {
                    put("limit", listOf(limit.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/admin.emoji.list",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
     * 
     * Remove an emoji across an Enterprise Grid organization
     * @param name The name of the emoji to be removed. Colons (&#x60;:myemoji:&#x60;) around the value are not required, although they may be included.
     * @param token Authentication token. Requires scope: &#x60;admin.teams:write&#x60;
     * @return DefaultSuccessTemplate
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    suspend fun adminEmojiRemove(name: kotlin.String, token: kotlin.String) : DefaultSuccessTemplate = withContext(Dispatchers.IO) {
        val localVarResponse = adminEmojiRemoveWithHttpInfo(name = name, token = token)

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
     * Remove an emoji across an Enterprise Grid organization
     * @param name The name of the emoji to be removed. Colons (&#x60;:myemoji:&#x60;) around the value are not required, although they may be included.
     * @param token Authentication token. Requires scope: &#x60;admin.teams:write&#x60;
     * @return ApiResponse<DefaultSuccessTemplate?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    suspend fun adminEmojiRemoveWithHttpInfo(name: kotlin.String, token: kotlin.String) : ApiResponse<DefaultSuccessTemplate?> = withContext(Dispatchers.IO) {
        val localVariableConfig = adminEmojiRemoveRequestConfig(name = name, token = token)

        return@withContext request<Map<String, PartConfig<*>>, DefaultSuccessTemplate>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation adminEmojiRemove
     *
     * @param name The name of the emoji to be removed. Colons (&#x60;:myemoji:&#x60;) around the value are not required, although they may be included.
     * @param token Authentication token. Requires scope: &#x60;admin.teams:write&#x60;
     * @return RequestConfig
     */
    fun adminEmojiRemoveRequestConfig(name: kotlin.String, token: kotlin.String) : RequestConfig<Map<String, PartConfig<*>>> {
        val localVariableBody = mapOf(
            "name" to PartConfig(body = name, headers = mutableMapOf()),
            "token" to PartConfig(body = token, headers = mutableMapOf()),)
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf("Content-Type" to "application/x-www-form-urlencoded")
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/admin.emoji.remove",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
     * 
     * Rename an emoji.
     * @param name The name of the emoji to be renamed. Colons (&#x60;:myemoji:&#x60;) around the value are not required, although they may be included.
     * @param newName The new name of the emoji.
     * @param token Authentication token. Requires scope: &#x60;admin.teams:write&#x60;
     * @return DefaultSuccessTemplate
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    suspend fun adminEmojiRename(name: kotlin.String, newName: kotlin.String, token: kotlin.String) : DefaultSuccessTemplate = withContext(Dispatchers.IO) {
        val localVarResponse = adminEmojiRenameWithHttpInfo(name = name, newName = newName, token = token)

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
     * Rename an emoji.
     * @param name The name of the emoji to be renamed. Colons (&#x60;:myemoji:&#x60;) around the value are not required, although they may be included.
     * @param newName The new name of the emoji.
     * @param token Authentication token. Requires scope: &#x60;admin.teams:write&#x60;
     * @return ApiResponse<DefaultSuccessTemplate?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    suspend fun adminEmojiRenameWithHttpInfo(name: kotlin.String, newName: kotlin.String, token: kotlin.String) : ApiResponse<DefaultSuccessTemplate?> = withContext(Dispatchers.IO) {
        val localVariableConfig = adminEmojiRenameRequestConfig(name = name, newName = newName, token = token)

        return@withContext request<Map<String, PartConfig<*>>, DefaultSuccessTemplate>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation adminEmojiRename
     *
     * @param name The name of the emoji to be renamed. Colons (&#x60;:myemoji:&#x60;) around the value are not required, although they may be included.
     * @param newName The new name of the emoji.
     * @param token Authentication token. Requires scope: &#x60;admin.teams:write&#x60;
     * @return RequestConfig
     */
    fun adminEmojiRenameRequestConfig(name: kotlin.String, newName: kotlin.String, token: kotlin.String) : RequestConfig<Map<String, PartConfig<*>>> {
        val localVariableBody = mapOf(
            "name" to PartConfig(body = name, headers = mutableMapOf()),
            "new_name" to PartConfig(body = newName, headers = mutableMapOf()),
            "token" to PartConfig(body = token, headers = mutableMapOf()),)
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf("Content-Type" to "application/x-www-form-urlencoded")
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/admin.emoji.rename",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }


    private fun encodeURIComponent(uriComponent: kotlin.String): kotlin.String =
        HttpUrl.Builder().scheme("http").host("localhost").addPathSegment(uriComponent).build().encodedPathSegments[0]
}
