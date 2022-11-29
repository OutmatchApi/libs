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

package apitest.apis

import java.io.IOException
import okhttp3.OkHttpClient
import okhttp3.HttpUrl

import com.outmatchapi.apitest.EventTypeIn
import com.outmatchapi.apitest.EventTypeOut
import com.outmatchapi.apitest.EventTypeUpdate
import com.outmatchapi.apitest.HTTPValidationError
import com.outmatchapi.apitest.HttpErrorOut
import com.outmatchapi.apitest.ListResponseEventTypeOut

import com.squareup.moshi.Json

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import apitest.infrastructure.ApiClient
import apitest.infrastructure.ApiResponse
import apitest.infrastructure.ClientException
import apitest.infrastructure.ClientError
import apitest.infrastructure.ServerException
import apitest.infrastructure.ServerError
import apitest.infrastructure.MultiValueMap
import apitest.infrastructure.PartConfig
import apitest.infrastructure.RequestConfig
import apitest.infrastructure.RequestMethod
import apitest.infrastructure.ResponseType
import apitest.infrastructure.Success
import apitest.infrastructure.toMultiValue

class EventTypeApi(basePath: kotlin.String = defaultBasePath, client: OkHttpClient = ApiClient.defaultClient) : ApiClient(basePath, client) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "http://localhost")
        }
    }

    /**
     * Create Event Type
     * Create new or unarchive existing event type.  Unarchiving an event type will allow endpoints to filter on it and messages to be sent with it. Endpoints filtering on the event type before archival will continue to filter on it. This operation does not preserve the description and schemas.
     * @param eventTypeIn 
     * @param idempotencyKey The request&#39;s idempotency key (optional)
     * @return EventTypeOut
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    suspend fun createEventTypeApiV1EventTypePost(eventTypeIn: EventTypeIn, idempotencyKey: kotlin.String? = null) : EventTypeOut = withContext(Dispatchers.IO) {
        val localVarResponse = createEventTypeApiV1EventTypePostWithHttpInfo(eventTypeIn = eventTypeIn, idempotencyKey = idempotencyKey)

        return@withContext when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as EventTypeOut
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
     * Create Event Type
     * Create new or unarchive existing event type.  Unarchiving an event type will allow endpoints to filter on it and messages to be sent with it. Endpoints filtering on the event type before archival will continue to filter on it. This operation does not preserve the description and schemas.
     * @param eventTypeIn 
     * @param idempotencyKey The request&#39;s idempotency key (optional)
     * @return ApiResponse<EventTypeOut?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    suspend fun createEventTypeApiV1EventTypePostWithHttpInfo(eventTypeIn: EventTypeIn, idempotencyKey: kotlin.String?) : ApiResponse<EventTypeOut?> = withContext(Dispatchers.IO) {
        val localVariableConfig = createEventTypeApiV1EventTypePostRequestConfig(eventTypeIn = eventTypeIn, idempotencyKey = idempotencyKey)

        return@withContext request<EventTypeIn, EventTypeOut>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation createEventTypeApiV1EventTypePost
     *
     * @param eventTypeIn 
     * @param idempotencyKey The request&#39;s idempotency key (optional)
     * @return RequestConfig
     */
    fun createEventTypeApiV1EventTypePostRequestConfig(eventTypeIn: EventTypeIn, idempotencyKey: kotlin.String?) : RequestConfig<EventTypeIn> {
        val localVariableBody = eventTypeIn
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        idempotencyKey?.apply { localVariableHeaders["idempotency-key"] = this.toString() }
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/api/v1/event-type/",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
     * Archive Event Type
     * Archive an event type.  Endpoints already configured to filter on an event type will continue to do so after archival. However, new messages can not be sent with it and endpoints can not filter on it. An event type can be unarchived with the [create operation](#operation/create_event_type_api_v1_event_type__post).
     * @param eventTypeName 
     * @param idempotencyKey The request&#39;s idempotency key (optional)
     * @return void
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    suspend fun deleteEventTypeApiV1EventTypeEventTypeNameDelete(eventTypeName: kotlin.String, idempotencyKey: kotlin.String? = null) : Unit = withContext(Dispatchers.IO) {
        val localVarResponse = deleteEventTypeApiV1EventTypeEventTypeNameDeleteWithHttpInfo(eventTypeName = eventTypeName, idempotencyKey = idempotencyKey)

        return@withContext when (localVarResponse.responseType) {
            ResponseType.Success -> Unit
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
     * Archive Event Type
     * Archive an event type.  Endpoints already configured to filter on an event type will continue to do so after archival. However, new messages can not be sent with it and endpoints can not filter on it. An event type can be unarchived with the [create operation](#operation/create_event_type_api_v1_event_type__post).
     * @param eventTypeName 
     * @param idempotencyKey The request&#39;s idempotency key (optional)
     * @return ApiResponse<Unit?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Throws(IllegalStateException::class, IOException::class)
    suspend fun deleteEventTypeApiV1EventTypeEventTypeNameDeleteWithHttpInfo(eventTypeName: kotlin.String, idempotencyKey: kotlin.String?) : ApiResponse<Unit?> = withContext(Dispatchers.IO) {
        val localVariableConfig = deleteEventTypeApiV1EventTypeEventTypeNameDeleteRequestConfig(eventTypeName = eventTypeName, idempotencyKey = idempotencyKey)

        return@withContext request<Unit, Unit>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation deleteEventTypeApiV1EventTypeEventTypeNameDelete
     *
     * @param eventTypeName 
     * @param idempotencyKey The request&#39;s idempotency key (optional)
     * @return RequestConfig
     */
    fun deleteEventTypeApiV1EventTypeEventTypeNameDeleteRequestConfig(eventTypeName: kotlin.String, idempotencyKey: kotlin.String?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        idempotencyKey?.apply { localVariableHeaders["idempotency-key"] = this.toString() }
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.DELETE,
            path = "/api/v1/event-type/{event_type_name}/".replace("{"+"event_type_name"+"}", encodeURIComponent(eventTypeName.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
     * Get Event Type
     * Get an event type.
     * @param eventTypeName 
     * @param idempotencyKey The request&#39;s idempotency key (optional)
     * @return EventTypeOut
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    suspend fun getEventTypeApiV1EventTypeEventTypeNameGet(eventTypeName: kotlin.String, idempotencyKey: kotlin.String? = null) : EventTypeOut = withContext(Dispatchers.IO) {
        val localVarResponse = getEventTypeApiV1EventTypeEventTypeNameGetWithHttpInfo(eventTypeName = eventTypeName, idempotencyKey = idempotencyKey)

        return@withContext when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as EventTypeOut
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
     * Get Event Type
     * Get an event type.
     * @param eventTypeName 
     * @param idempotencyKey The request&#39;s idempotency key (optional)
     * @return ApiResponse<EventTypeOut?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    suspend fun getEventTypeApiV1EventTypeEventTypeNameGetWithHttpInfo(eventTypeName: kotlin.String, idempotencyKey: kotlin.String?) : ApiResponse<EventTypeOut?> = withContext(Dispatchers.IO) {
        val localVariableConfig = getEventTypeApiV1EventTypeEventTypeNameGetRequestConfig(eventTypeName = eventTypeName, idempotencyKey = idempotencyKey)

        return@withContext request<Unit, EventTypeOut>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation getEventTypeApiV1EventTypeEventTypeNameGet
     *
     * @param eventTypeName 
     * @param idempotencyKey The request&#39;s idempotency key (optional)
     * @return RequestConfig
     */
    fun getEventTypeApiV1EventTypeEventTypeNameGetRequestConfig(eventTypeName: kotlin.String, idempotencyKey: kotlin.String?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        idempotencyKey?.apply { localVariableHeaders["idempotency-key"] = this.toString() }
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/api/v1/event-type/{event_type_name}/".replace("{"+"event_type_name"+"}", encodeURIComponent(eventTypeName.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
     * List Event Types
     * Return the list of event types.
     * @param iterator  (optional)
     * @param limit  (optional, default to 50)
     * @param withContent  (optional, default to false)
     * @param includeArchived  (optional, default to false)
     * @param idempotencyKey The request&#39;s idempotency key (optional)
     * @return ListResponseEventTypeOut
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    suspend fun listEventTypesApiV1EventTypeGet(iterator: kotlin.String? = null, limit: kotlin.Int? = 50, withContent: kotlin.Boolean? = false, includeArchived: kotlin.Boolean? = false, idempotencyKey: kotlin.String? = null) : ListResponseEventTypeOut = withContext(Dispatchers.IO) {
        val localVarResponse = listEventTypesApiV1EventTypeGetWithHttpInfo(iterator = iterator, limit = limit, withContent = withContent, includeArchived = includeArchived, idempotencyKey = idempotencyKey)

        return@withContext when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as ListResponseEventTypeOut
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
     * List Event Types
     * Return the list of event types.
     * @param iterator  (optional)
     * @param limit  (optional, default to 50)
     * @param withContent  (optional, default to false)
     * @param includeArchived  (optional, default to false)
     * @param idempotencyKey The request&#39;s idempotency key (optional)
     * @return ApiResponse<ListResponseEventTypeOut?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    suspend fun listEventTypesApiV1EventTypeGetWithHttpInfo(iterator: kotlin.String?, limit: kotlin.Int?, withContent: kotlin.Boolean?, includeArchived: kotlin.Boolean?, idempotencyKey: kotlin.String?) : ApiResponse<ListResponseEventTypeOut?> = withContext(Dispatchers.IO) {
        val localVariableConfig = listEventTypesApiV1EventTypeGetRequestConfig(iterator = iterator, limit = limit, withContent = withContent, includeArchived = includeArchived, idempotencyKey = idempotencyKey)

        return@withContext request<Unit, ListResponseEventTypeOut>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation listEventTypesApiV1EventTypeGet
     *
     * @param iterator  (optional)
     * @param limit  (optional, default to 50)
     * @param withContent  (optional, default to false)
     * @param includeArchived  (optional, default to false)
     * @param idempotencyKey The request&#39;s idempotency key (optional)
     * @return RequestConfig
     */
    fun listEventTypesApiV1EventTypeGetRequestConfig(iterator: kotlin.String?, limit: kotlin.Int?, withContent: kotlin.Boolean?, includeArchived: kotlin.Boolean?, idempotencyKey: kotlin.String?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, kotlin.collections.List<kotlin.String>>()
            .apply {
                if (iterator != null) {
                    put("iterator", listOf(iterator.toString()))
                }
                if (limit != null) {
                    put("limit", listOf(limit.toString()))
                }
                if (withContent != null) {
                    put("with_content", listOf(withContent.toString()))
                }
                if (includeArchived != null) {
                    put("include_archived", listOf(includeArchived.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        idempotencyKey?.apply { localVariableHeaders["idempotency-key"] = this.toString() }
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/api/v1/event-type/",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
     * Update Event Type
     * Update an event type.
     * @param eventTypeName 
     * @param eventTypeUpdate 
     * @param idempotencyKey The request&#39;s idempotency key (optional)
     * @return EventTypeOut
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    suspend fun updateEventTypeApiV1EventTypeEventTypeNamePut(eventTypeName: kotlin.String, eventTypeUpdate: EventTypeUpdate, idempotencyKey: kotlin.String? = null) : EventTypeOut = withContext(Dispatchers.IO) {
        val localVarResponse = updateEventTypeApiV1EventTypeEventTypeNamePutWithHttpInfo(eventTypeName = eventTypeName, eventTypeUpdate = eventTypeUpdate, idempotencyKey = idempotencyKey)

        return@withContext when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as EventTypeOut
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
     * Update Event Type
     * Update an event type.
     * @param eventTypeName 
     * @param eventTypeUpdate 
     * @param idempotencyKey The request&#39;s idempotency key (optional)
     * @return ApiResponse<EventTypeOut?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    suspend fun updateEventTypeApiV1EventTypeEventTypeNamePutWithHttpInfo(eventTypeName: kotlin.String, eventTypeUpdate: EventTypeUpdate, idempotencyKey: kotlin.String?) : ApiResponse<EventTypeOut?> = withContext(Dispatchers.IO) {
        val localVariableConfig = updateEventTypeApiV1EventTypeEventTypeNamePutRequestConfig(eventTypeName = eventTypeName, eventTypeUpdate = eventTypeUpdate, idempotencyKey = idempotencyKey)

        return@withContext request<EventTypeUpdate, EventTypeOut>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation updateEventTypeApiV1EventTypeEventTypeNamePut
     *
     * @param eventTypeName 
     * @param eventTypeUpdate 
     * @param idempotencyKey The request&#39;s idempotency key (optional)
     * @return RequestConfig
     */
    fun updateEventTypeApiV1EventTypeEventTypeNamePutRequestConfig(eventTypeName: kotlin.String, eventTypeUpdate: EventTypeUpdate, idempotencyKey: kotlin.String?) : RequestConfig<EventTypeUpdate> {
        val localVariableBody = eventTypeUpdate
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        idempotencyKey?.apply { localVariableHeaders["idempotency-key"] = this.toString() }
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.PUT,
            path = "/api/v1/event-type/{event_type_name}/".replace("{"+"event_type_name"+"}", encodeURIComponent(eventTypeName.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }


    private fun encodeURIComponent(uriComponent: kotlin.String): kotlin.String =
        HttpUrl.Builder().scheme("http").host("localhost").addPathSegment(uriComponent).build().encodedPathSegments[0]
}