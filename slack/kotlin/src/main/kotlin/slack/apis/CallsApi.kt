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

class CallsApi(basePath: kotlin.String = defaultBasePath, client: OkHttpClient = ApiClient.defaultClient) : ApiClient(basePath, client) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "https://slack.com/api")
        }
    }

    /**
     * 
     * Registers a new Call.
     * @param token Authentication token. Requires scope: &#x60;calls:write&#x60;
     * @param externalUniqueId An ID supplied by the 3rd-party Call provider. It must be unique across all Calls from that service.
     * @param joinUrl The URL required for a client to join the Call.
     * @param createdBy The valid Slack user ID of the user who created this Call. When this method is called with a user token, the &#x60;created_by&#x60; field is optional and defaults to the authed user of the token. Otherwise, the field is required. (optional)
     * @param dateStart Call start time in UTC UNIX timestamp format (optional)
     * @param desktopAppJoinUrl When supplied, available Slack clients will attempt to directly launch the 3rd-party Call with this URL. (optional)
     * @param externalDisplayId An optional, human-readable ID supplied by the 3rd-party Call provider. If supplied, this ID will be displayed in the Call object. (optional)
     * @param title The name of the Call. (optional)
     * @param users The list of users to register as participants in the Call. [Read more on how to specify users here](/apis/calls#users). (optional)
     * @return DefaultSuccessTemplate
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    suspend fun callsAdd(token: kotlin.String, externalUniqueId: kotlin.String, joinUrl: kotlin.String, createdBy: kotlin.String? = null, dateStart: kotlin.Int? = null, desktopAppJoinUrl: kotlin.String? = null, externalDisplayId: kotlin.String? = null, title: kotlin.String? = null, users: kotlin.String? = null) : DefaultSuccessTemplate = withContext(Dispatchers.IO) {
        val localVarResponse = callsAddWithHttpInfo(token = token, externalUniqueId = externalUniqueId, joinUrl = joinUrl, createdBy = createdBy, dateStart = dateStart, desktopAppJoinUrl = desktopAppJoinUrl, externalDisplayId = externalDisplayId, title = title, users = users)

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
     * Registers a new Call.
     * @param token Authentication token. Requires scope: &#x60;calls:write&#x60;
     * @param externalUniqueId An ID supplied by the 3rd-party Call provider. It must be unique across all Calls from that service.
     * @param joinUrl The URL required for a client to join the Call.
     * @param createdBy The valid Slack user ID of the user who created this Call. When this method is called with a user token, the &#x60;created_by&#x60; field is optional and defaults to the authed user of the token. Otherwise, the field is required. (optional)
     * @param dateStart Call start time in UTC UNIX timestamp format (optional)
     * @param desktopAppJoinUrl When supplied, available Slack clients will attempt to directly launch the 3rd-party Call with this URL. (optional)
     * @param externalDisplayId An optional, human-readable ID supplied by the 3rd-party Call provider. If supplied, this ID will be displayed in the Call object. (optional)
     * @param title The name of the Call. (optional)
     * @param users The list of users to register as participants in the Call. [Read more on how to specify users here](/apis/calls#users). (optional)
     * @return ApiResponse<DefaultSuccessTemplate?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    suspend fun callsAddWithHttpInfo(token: kotlin.String, externalUniqueId: kotlin.String, joinUrl: kotlin.String, createdBy: kotlin.String?, dateStart: kotlin.Int?, desktopAppJoinUrl: kotlin.String?, externalDisplayId: kotlin.String?, title: kotlin.String?, users: kotlin.String?) : ApiResponse<DefaultSuccessTemplate?> = withContext(Dispatchers.IO) {
        val localVariableConfig = callsAddRequestConfig(token = token, externalUniqueId = externalUniqueId, joinUrl = joinUrl, createdBy = createdBy, dateStart = dateStart, desktopAppJoinUrl = desktopAppJoinUrl, externalDisplayId = externalDisplayId, title = title, users = users)

        return@withContext request<Map<String, PartConfig<*>>, DefaultSuccessTemplate>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation callsAdd
     *
     * @param token Authentication token. Requires scope: &#x60;calls:write&#x60;
     * @param externalUniqueId An ID supplied by the 3rd-party Call provider. It must be unique across all Calls from that service.
     * @param joinUrl The URL required for a client to join the Call.
     * @param createdBy The valid Slack user ID of the user who created this Call. When this method is called with a user token, the &#x60;created_by&#x60; field is optional and defaults to the authed user of the token. Otherwise, the field is required. (optional)
     * @param dateStart Call start time in UTC UNIX timestamp format (optional)
     * @param desktopAppJoinUrl When supplied, available Slack clients will attempt to directly launch the 3rd-party Call with this URL. (optional)
     * @param externalDisplayId An optional, human-readable ID supplied by the 3rd-party Call provider. If supplied, this ID will be displayed in the Call object. (optional)
     * @param title The name of the Call. (optional)
     * @param users The list of users to register as participants in the Call. [Read more on how to specify users here](/apis/calls#users). (optional)
     * @return RequestConfig
     */
    fun callsAddRequestConfig(token: kotlin.String, externalUniqueId: kotlin.String, joinUrl: kotlin.String, createdBy: kotlin.String?, dateStart: kotlin.Int?, desktopAppJoinUrl: kotlin.String?, externalDisplayId: kotlin.String?, title: kotlin.String?, users: kotlin.String?) : RequestConfig<Map<String, PartConfig<*>>> {
        val localVariableBody = mapOf(
            "created_by" to PartConfig(body = createdBy, headers = mutableMapOf()),
            "date_start" to PartConfig(body = dateStart, headers = mutableMapOf()),
            "desktop_app_join_url" to PartConfig(body = desktopAppJoinUrl, headers = mutableMapOf()),
            "external_display_id" to PartConfig(body = externalDisplayId, headers = mutableMapOf()),
            "external_unique_id" to PartConfig(body = externalUniqueId, headers = mutableMapOf()),
            "join_url" to PartConfig(body = joinUrl, headers = mutableMapOf()),
            "title" to PartConfig(body = title, headers = mutableMapOf()),
            "users" to PartConfig(body = users, headers = mutableMapOf()),)
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf("Content-Type" to "application/x-www-form-urlencoded")
        token.apply { localVariableHeaders["token"] = this.toString() }
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/calls.add",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
     * 
     * Ends a Call.
     * @param token Authentication token. Requires scope: &#x60;calls:write&#x60;
     * @param id &#x60;id&#x60; returned when registering the call using the [&#x60;calls.add&#x60;](/methods/calls.add) method.
     * @param duration Call duration in seconds (optional)
     * @return DefaultSuccessTemplate
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    suspend fun callsEnd(token: kotlin.String, id: kotlin.String, duration: kotlin.Int? = null) : DefaultSuccessTemplate = withContext(Dispatchers.IO) {
        val localVarResponse = callsEndWithHttpInfo(token = token, id = id, duration = duration)

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
     * Ends a Call.
     * @param token Authentication token. Requires scope: &#x60;calls:write&#x60;
     * @param id &#x60;id&#x60; returned when registering the call using the [&#x60;calls.add&#x60;](/methods/calls.add) method.
     * @param duration Call duration in seconds (optional)
     * @return ApiResponse<DefaultSuccessTemplate?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    suspend fun callsEndWithHttpInfo(token: kotlin.String, id: kotlin.String, duration: kotlin.Int?) : ApiResponse<DefaultSuccessTemplate?> = withContext(Dispatchers.IO) {
        val localVariableConfig = callsEndRequestConfig(token = token, id = id, duration = duration)

        return@withContext request<Map<String, PartConfig<*>>, DefaultSuccessTemplate>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation callsEnd
     *
     * @param token Authentication token. Requires scope: &#x60;calls:write&#x60;
     * @param id &#x60;id&#x60; returned when registering the call using the [&#x60;calls.add&#x60;](/methods/calls.add) method.
     * @param duration Call duration in seconds (optional)
     * @return RequestConfig
     */
    fun callsEndRequestConfig(token: kotlin.String, id: kotlin.String, duration: kotlin.Int?) : RequestConfig<Map<String, PartConfig<*>>> {
        val localVariableBody = mapOf(
            "duration" to PartConfig(body = duration, headers = mutableMapOf()),
            "id" to PartConfig(body = id, headers = mutableMapOf()),)
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf("Content-Type" to "application/x-www-form-urlencoded")
        token.apply { localVariableHeaders["token"] = this.toString() }
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/calls.end",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
     * 
     * Returns information about a Call.
     * @param token Authentication token. Requires scope: &#x60;calls:read&#x60;
     * @param id &#x60;id&#x60; of the Call returned by the [&#x60;calls.add&#x60;](/methods/calls.add) method.
     * @return DefaultSuccessTemplate
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    suspend fun callsInfo(token: kotlin.String, id: kotlin.String) : DefaultSuccessTemplate = withContext(Dispatchers.IO) {
        val localVarResponse = callsInfoWithHttpInfo(token = token, id = id)

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
     * Returns information about a Call.
     * @param token Authentication token. Requires scope: &#x60;calls:read&#x60;
     * @param id &#x60;id&#x60; of the Call returned by the [&#x60;calls.add&#x60;](/methods/calls.add) method.
     * @return ApiResponse<DefaultSuccessTemplate?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    suspend fun callsInfoWithHttpInfo(token: kotlin.String, id: kotlin.String) : ApiResponse<DefaultSuccessTemplate?> = withContext(Dispatchers.IO) {
        val localVariableConfig = callsInfoRequestConfig(token = token, id = id)

        return@withContext request<Unit, DefaultSuccessTemplate>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation callsInfo
     *
     * @param token Authentication token. Requires scope: &#x60;calls:read&#x60;
     * @param id &#x60;id&#x60; of the Call returned by the [&#x60;calls.add&#x60;](/methods/calls.add) method.
     * @return RequestConfig
     */
    fun callsInfoRequestConfig(token: kotlin.String, id: kotlin.String) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, kotlin.collections.List<kotlin.String>>()
            .apply {
                put("id", listOf(id.toString()))
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        token.apply { localVariableHeaders["token"] = this.toString() }
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/calls.info",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
     * 
     * Registers new participants added to a Call.
     * @param token Authentication token. Requires scope: &#x60;calls:write&#x60;
     * @param id &#x60;id&#x60; returned by the [&#x60;calls.add&#x60;](/methods/calls.add) method.
     * @param users The list of users to add as participants in the Call. [Read more on how to specify users here](/apis/calls#users).
     * @return DefaultSuccessTemplate
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    suspend fun callsParticipantsAdd(token: kotlin.String, id: kotlin.String, users: kotlin.String) : DefaultSuccessTemplate = withContext(Dispatchers.IO) {
        val localVarResponse = callsParticipantsAddWithHttpInfo(token = token, id = id, users = users)

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
     * Registers new participants added to a Call.
     * @param token Authentication token. Requires scope: &#x60;calls:write&#x60;
     * @param id &#x60;id&#x60; returned by the [&#x60;calls.add&#x60;](/methods/calls.add) method.
     * @param users The list of users to add as participants in the Call. [Read more on how to specify users here](/apis/calls#users).
     * @return ApiResponse<DefaultSuccessTemplate?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    suspend fun callsParticipantsAddWithHttpInfo(token: kotlin.String, id: kotlin.String, users: kotlin.String) : ApiResponse<DefaultSuccessTemplate?> = withContext(Dispatchers.IO) {
        val localVariableConfig = callsParticipantsAddRequestConfig(token = token, id = id, users = users)

        return@withContext request<Map<String, PartConfig<*>>, DefaultSuccessTemplate>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation callsParticipantsAdd
     *
     * @param token Authentication token. Requires scope: &#x60;calls:write&#x60;
     * @param id &#x60;id&#x60; returned by the [&#x60;calls.add&#x60;](/methods/calls.add) method.
     * @param users The list of users to add as participants in the Call. [Read more on how to specify users here](/apis/calls#users).
     * @return RequestConfig
     */
    fun callsParticipantsAddRequestConfig(token: kotlin.String, id: kotlin.String, users: kotlin.String) : RequestConfig<Map<String, PartConfig<*>>> {
        val localVariableBody = mapOf(
            "id" to PartConfig(body = id, headers = mutableMapOf()),
            "users" to PartConfig(body = users, headers = mutableMapOf()),)
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf("Content-Type" to "application/x-www-form-urlencoded")
        token.apply { localVariableHeaders["token"] = this.toString() }
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/calls.participants.add",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
     * 
     * Registers participants removed from a Call.
     * @param token Authentication token. Requires scope: &#x60;calls:write&#x60;
     * @param id &#x60;id&#x60; returned by the [&#x60;calls.add&#x60;](/methods/calls.add) method.
     * @param users The list of users to remove as participants in the Call. [Read more on how to specify users here](/apis/calls#users).
     * @return DefaultSuccessTemplate
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    suspend fun callsParticipantsRemove(token: kotlin.String, id: kotlin.String, users: kotlin.String) : DefaultSuccessTemplate = withContext(Dispatchers.IO) {
        val localVarResponse = callsParticipantsRemoveWithHttpInfo(token = token, id = id, users = users)

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
     * Registers participants removed from a Call.
     * @param token Authentication token. Requires scope: &#x60;calls:write&#x60;
     * @param id &#x60;id&#x60; returned by the [&#x60;calls.add&#x60;](/methods/calls.add) method.
     * @param users The list of users to remove as participants in the Call. [Read more on how to specify users here](/apis/calls#users).
     * @return ApiResponse<DefaultSuccessTemplate?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    suspend fun callsParticipantsRemoveWithHttpInfo(token: kotlin.String, id: kotlin.String, users: kotlin.String) : ApiResponse<DefaultSuccessTemplate?> = withContext(Dispatchers.IO) {
        val localVariableConfig = callsParticipantsRemoveRequestConfig(token = token, id = id, users = users)

        return@withContext request<Map<String, PartConfig<*>>, DefaultSuccessTemplate>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation callsParticipantsRemove
     *
     * @param token Authentication token. Requires scope: &#x60;calls:write&#x60;
     * @param id &#x60;id&#x60; returned by the [&#x60;calls.add&#x60;](/methods/calls.add) method.
     * @param users The list of users to remove as participants in the Call. [Read more on how to specify users here](/apis/calls#users).
     * @return RequestConfig
     */
    fun callsParticipantsRemoveRequestConfig(token: kotlin.String, id: kotlin.String, users: kotlin.String) : RequestConfig<Map<String, PartConfig<*>>> {
        val localVariableBody = mapOf(
            "id" to PartConfig(body = id, headers = mutableMapOf()),
            "users" to PartConfig(body = users, headers = mutableMapOf()),)
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf("Content-Type" to "application/x-www-form-urlencoded")
        token.apply { localVariableHeaders["token"] = this.toString() }
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/calls.participants.remove",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
     * 
     * Updates information about a Call.
     * @param token Authentication token. Requires scope: &#x60;calls:write&#x60;
     * @param id &#x60;id&#x60; returned by the [&#x60;calls.add&#x60;](/methods/calls.add) method.
     * @param desktopAppJoinUrl When supplied, available Slack clients will attempt to directly launch the 3rd-party Call with this URL. (optional)
     * @param joinUrl The URL required for a client to join the Call. (optional)
     * @param title The name of the Call. (optional)
     * @return DefaultSuccessTemplate
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    suspend fun callsUpdate(token: kotlin.String, id: kotlin.String, desktopAppJoinUrl: kotlin.String? = null, joinUrl: kotlin.String? = null, title: kotlin.String? = null) : DefaultSuccessTemplate = withContext(Dispatchers.IO) {
        val localVarResponse = callsUpdateWithHttpInfo(token = token, id = id, desktopAppJoinUrl = desktopAppJoinUrl, joinUrl = joinUrl, title = title)

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
     * Updates information about a Call.
     * @param token Authentication token. Requires scope: &#x60;calls:write&#x60;
     * @param id &#x60;id&#x60; returned by the [&#x60;calls.add&#x60;](/methods/calls.add) method.
     * @param desktopAppJoinUrl When supplied, available Slack clients will attempt to directly launch the 3rd-party Call with this URL. (optional)
     * @param joinUrl The URL required for a client to join the Call. (optional)
     * @param title The name of the Call. (optional)
     * @return ApiResponse<DefaultSuccessTemplate?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    suspend fun callsUpdateWithHttpInfo(token: kotlin.String, id: kotlin.String, desktopAppJoinUrl: kotlin.String?, joinUrl: kotlin.String?, title: kotlin.String?) : ApiResponse<DefaultSuccessTemplate?> = withContext(Dispatchers.IO) {
        val localVariableConfig = callsUpdateRequestConfig(token = token, id = id, desktopAppJoinUrl = desktopAppJoinUrl, joinUrl = joinUrl, title = title)

        return@withContext request<Map<String, PartConfig<*>>, DefaultSuccessTemplate>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation callsUpdate
     *
     * @param token Authentication token. Requires scope: &#x60;calls:write&#x60;
     * @param id &#x60;id&#x60; returned by the [&#x60;calls.add&#x60;](/methods/calls.add) method.
     * @param desktopAppJoinUrl When supplied, available Slack clients will attempt to directly launch the 3rd-party Call with this URL. (optional)
     * @param joinUrl The URL required for a client to join the Call. (optional)
     * @param title The name of the Call. (optional)
     * @return RequestConfig
     */
    fun callsUpdateRequestConfig(token: kotlin.String, id: kotlin.String, desktopAppJoinUrl: kotlin.String?, joinUrl: kotlin.String?, title: kotlin.String?) : RequestConfig<Map<String, PartConfig<*>>> {
        val localVariableBody = mapOf(
            "desktop_app_join_url" to PartConfig(body = desktopAppJoinUrl, headers = mutableMapOf()),
            "id" to PartConfig(body = id, headers = mutableMapOf()),
            "join_url" to PartConfig(body = joinUrl, headers = mutableMapOf()),
            "title" to PartConfig(body = title, headers = mutableMapOf()),)
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf("Content-Type" to "application/x-www-form-urlencoded")
        token.apply { localVariableHeaders["token"] = this.toString() }
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/calls.update",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }


    private fun encodeURIComponent(uriComponent: kotlin.String): kotlin.String =
        HttpUrl.Builder().scheme("http").host("localhost").addPathSegment(uriComponent).build().encodedPathSegments[0]
}
