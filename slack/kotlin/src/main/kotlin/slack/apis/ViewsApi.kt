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

class ViewsApi(basePath: kotlin.String = defaultBasePath, client: OkHttpClient = ApiClient.defaultClient) : ApiClient(basePath, client) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "https://slack.com/api")
        }
    }

    /**
     * 
     * Open a view for a user.
     * @param token Authentication token. Requires scope: &#x60;none&#x60;
     * @param triggerId Exchange a trigger to post to the user.
     * @param view A [view payload](/reference/surfaces/views). This must be a JSON-encoded string.
     * @return DefaultSuccessTemplate
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    suspend fun viewsOpen(token: kotlin.String, triggerId: kotlin.String, view: kotlin.String) : DefaultSuccessTemplate = withContext(Dispatchers.IO) {
        val localVarResponse = viewsOpenWithHttpInfo(token = token, triggerId = triggerId, view = view)

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
     * Open a view for a user.
     * @param token Authentication token. Requires scope: &#x60;none&#x60;
     * @param triggerId Exchange a trigger to post to the user.
     * @param view A [view payload](/reference/surfaces/views). This must be a JSON-encoded string.
     * @return ApiResponse<DefaultSuccessTemplate?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    suspend fun viewsOpenWithHttpInfo(token: kotlin.String, triggerId: kotlin.String, view: kotlin.String) : ApiResponse<DefaultSuccessTemplate?> = withContext(Dispatchers.IO) {
        val localVariableConfig = viewsOpenRequestConfig(token = token, triggerId = triggerId, view = view)

        return@withContext request<Unit, DefaultSuccessTemplate>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation viewsOpen
     *
     * @param token Authentication token. Requires scope: &#x60;none&#x60;
     * @param triggerId Exchange a trigger to post to the user.
     * @param view A [view payload](/reference/surfaces/views). This must be a JSON-encoded string.
     * @return RequestConfig
     */
    fun viewsOpenRequestConfig(token: kotlin.String, triggerId: kotlin.String, view: kotlin.String) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, kotlin.collections.List<kotlin.String>>()
            .apply {
                put("trigger_id", listOf(triggerId.toString()))
                put("view", listOf(view.toString()))
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        token.apply { localVariableHeaders["token"] = this.toString() }
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/views.open",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
     * 
     * Publish a static view for a User.
     * @param token Authentication token. Requires scope: &#x60;none&#x60;
     * @param userId &#x60;id&#x60; of the user you want publish a view to.
     * @param view A [view payload](/reference/surfaces/views). This must be a JSON-encoded string.
     * @param hash A string that represents view state to protect against possible race conditions. (optional)
     * @return DefaultSuccessTemplate
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    suspend fun viewsPublish(token: kotlin.String, userId: kotlin.String, view: kotlin.String, hash: kotlin.String? = null) : DefaultSuccessTemplate = withContext(Dispatchers.IO) {
        val localVarResponse = viewsPublishWithHttpInfo(token = token, userId = userId, view = view, hash = hash)

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
     * Publish a static view for a User.
     * @param token Authentication token. Requires scope: &#x60;none&#x60;
     * @param userId &#x60;id&#x60; of the user you want publish a view to.
     * @param view A [view payload](/reference/surfaces/views). This must be a JSON-encoded string.
     * @param hash A string that represents view state to protect against possible race conditions. (optional)
     * @return ApiResponse<DefaultSuccessTemplate?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    suspend fun viewsPublishWithHttpInfo(token: kotlin.String, userId: kotlin.String, view: kotlin.String, hash: kotlin.String?) : ApiResponse<DefaultSuccessTemplate?> = withContext(Dispatchers.IO) {
        val localVariableConfig = viewsPublishRequestConfig(token = token, userId = userId, view = view, hash = hash)

        return@withContext request<Unit, DefaultSuccessTemplate>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation viewsPublish
     *
     * @param token Authentication token. Requires scope: &#x60;none&#x60;
     * @param userId &#x60;id&#x60; of the user you want publish a view to.
     * @param view A [view payload](/reference/surfaces/views). This must be a JSON-encoded string.
     * @param hash A string that represents view state to protect against possible race conditions. (optional)
     * @return RequestConfig
     */
    fun viewsPublishRequestConfig(token: kotlin.String, userId: kotlin.String, view: kotlin.String, hash: kotlin.String?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, kotlin.collections.List<kotlin.String>>()
            .apply {
                put("user_id", listOf(userId.toString()))
                put("view", listOf(view.toString()))
                if (hash != null) {
                    put("hash", listOf(hash.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        token.apply { localVariableHeaders["token"] = this.toString() }
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/views.publish",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
     * 
     * Push a view onto the stack of a root view.
     * @param token Authentication token. Requires scope: &#x60;none&#x60;
     * @param triggerId Exchange a trigger to post to the user.
     * @param view A [view payload](/reference/surfaces/views). This must be a JSON-encoded string.
     * @return DefaultSuccessTemplate
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    suspend fun viewsPush(token: kotlin.String, triggerId: kotlin.String, view: kotlin.String) : DefaultSuccessTemplate = withContext(Dispatchers.IO) {
        val localVarResponse = viewsPushWithHttpInfo(token = token, triggerId = triggerId, view = view)

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
     * Push a view onto the stack of a root view.
     * @param token Authentication token. Requires scope: &#x60;none&#x60;
     * @param triggerId Exchange a trigger to post to the user.
     * @param view A [view payload](/reference/surfaces/views). This must be a JSON-encoded string.
     * @return ApiResponse<DefaultSuccessTemplate?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    suspend fun viewsPushWithHttpInfo(token: kotlin.String, triggerId: kotlin.String, view: kotlin.String) : ApiResponse<DefaultSuccessTemplate?> = withContext(Dispatchers.IO) {
        val localVariableConfig = viewsPushRequestConfig(token = token, triggerId = triggerId, view = view)

        return@withContext request<Unit, DefaultSuccessTemplate>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation viewsPush
     *
     * @param token Authentication token. Requires scope: &#x60;none&#x60;
     * @param triggerId Exchange a trigger to post to the user.
     * @param view A [view payload](/reference/surfaces/views). This must be a JSON-encoded string.
     * @return RequestConfig
     */
    fun viewsPushRequestConfig(token: kotlin.String, triggerId: kotlin.String, view: kotlin.String) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, kotlin.collections.List<kotlin.String>>()
            .apply {
                put("trigger_id", listOf(triggerId.toString()))
                put("view", listOf(view.toString()))
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        token.apply { localVariableHeaders["token"] = this.toString() }
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/views.push",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
     * 
     * Update an existing view.
     * @param token Authentication token. Requires scope: &#x60;none&#x60;
     * @param viewId A unique identifier of the view to be updated. Either &#x60;view_id&#x60; or &#x60;external_id&#x60; is required. (optional)
     * @param externalId A unique identifier of the view set by the developer. Must be unique for all views on a team. Max length of 255 characters. Either &#x60;view_id&#x60; or &#x60;external_id&#x60; is required. (optional)
     * @param view A [view object](/reference/surfaces/views). This must be a JSON-encoded string. (optional)
     * @param hash A string that represents view state to protect against possible race conditions. (optional)
     * @return DefaultSuccessTemplate
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    suspend fun viewsUpdate(token: kotlin.String, viewId: kotlin.String? = null, externalId: kotlin.String? = null, view: kotlin.String? = null, hash: kotlin.String? = null) : DefaultSuccessTemplate = withContext(Dispatchers.IO) {
        val localVarResponse = viewsUpdateWithHttpInfo(token = token, viewId = viewId, externalId = externalId, view = view, hash = hash)

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
     * Update an existing view.
     * @param token Authentication token. Requires scope: &#x60;none&#x60;
     * @param viewId A unique identifier of the view to be updated. Either &#x60;view_id&#x60; or &#x60;external_id&#x60; is required. (optional)
     * @param externalId A unique identifier of the view set by the developer. Must be unique for all views on a team. Max length of 255 characters. Either &#x60;view_id&#x60; or &#x60;external_id&#x60; is required. (optional)
     * @param view A [view object](/reference/surfaces/views). This must be a JSON-encoded string. (optional)
     * @param hash A string that represents view state to protect against possible race conditions. (optional)
     * @return ApiResponse<DefaultSuccessTemplate?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    suspend fun viewsUpdateWithHttpInfo(token: kotlin.String, viewId: kotlin.String?, externalId: kotlin.String?, view: kotlin.String?, hash: kotlin.String?) : ApiResponse<DefaultSuccessTemplate?> = withContext(Dispatchers.IO) {
        val localVariableConfig = viewsUpdateRequestConfig(token = token, viewId = viewId, externalId = externalId, view = view, hash = hash)

        return@withContext request<Unit, DefaultSuccessTemplate>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation viewsUpdate
     *
     * @param token Authentication token. Requires scope: &#x60;none&#x60;
     * @param viewId A unique identifier of the view to be updated. Either &#x60;view_id&#x60; or &#x60;external_id&#x60; is required. (optional)
     * @param externalId A unique identifier of the view set by the developer. Must be unique for all views on a team. Max length of 255 characters. Either &#x60;view_id&#x60; or &#x60;external_id&#x60; is required. (optional)
     * @param view A [view object](/reference/surfaces/views). This must be a JSON-encoded string. (optional)
     * @param hash A string that represents view state to protect against possible race conditions. (optional)
     * @return RequestConfig
     */
    fun viewsUpdateRequestConfig(token: kotlin.String, viewId: kotlin.String?, externalId: kotlin.String?, view: kotlin.String?, hash: kotlin.String?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, kotlin.collections.List<kotlin.String>>()
            .apply {
                if (viewId != null) {
                    put("view_id", listOf(viewId.toString()))
                }
                if (externalId != null) {
                    put("external_id", listOf(externalId.toString()))
                }
                if (view != null) {
                    put("view", listOf(view.toString()))
                }
                if (hash != null) {
                    put("hash", listOf(hash.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        token.apply { localVariableHeaders["token"] = this.toString() }
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/views.update",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }


    private fun encodeURIComponent(uriComponent: kotlin.String): kotlin.String =
        HttpUrl.Builder().scheme("http").host("localhost").addPathSegment(uriComponent).build().encodedPathSegments[0]
}
