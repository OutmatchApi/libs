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

import com.outmatchapi.apitest.ApplicationIn
import com.outmatchapi.apitest.ApplicationOut
import com.outmatchapi.apitest.HTTPValidationError
import com.outmatchapi.apitest.HttpErrorOut
import com.outmatchapi.apitest.ListResponseApplicationOut

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

class ApplicationApi(basePath: kotlin.String = defaultBasePath, client: OkHttpClient = ApiClient.defaultClient) : ApiClient(basePath, client) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "http://localhost")
        }
    }

    /**
     * Create Application
     * Create a new application.
     * @param applicationIn 
     * @param getIfExists Get an existing application, or create a new one if doesn&#39;t exist. It&#39;s two separate functions in the libs. (optional, default to false)
     * @param idempotencyKey The request&#39;s idempotency key (optional)
     * @return ApplicationOut
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    suspend fun createApplicationApiV1AppPost(applicationIn: ApplicationIn, getIfExists: kotlin.Boolean? = false, idempotencyKey: kotlin.String? = null) : ApplicationOut = withContext(Dispatchers.IO) {
        val localVarResponse = createApplicationApiV1AppPostWithHttpInfo(applicationIn = applicationIn, getIfExists = getIfExists, idempotencyKey = idempotencyKey)

        return@withContext when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as ApplicationOut
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
     * Create Application
     * Create a new application.
     * @param applicationIn 
     * @param getIfExists Get an existing application, or create a new one if doesn&#39;t exist. It&#39;s two separate functions in the libs. (optional, default to false)
     * @param idempotencyKey The request&#39;s idempotency key (optional)
     * @return ApiResponse<ApplicationOut?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    suspend fun createApplicationApiV1AppPostWithHttpInfo(applicationIn: ApplicationIn, getIfExists: kotlin.Boolean?, idempotencyKey: kotlin.String?) : ApiResponse<ApplicationOut?> = withContext(Dispatchers.IO) {
        val localVariableConfig = createApplicationApiV1AppPostRequestConfig(applicationIn = applicationIn, getIfExists = getIfExists, idempotencyKey = idempotencyKey)

        return@withContext request<ApplicationIn, ApplicationOut>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation createApplicationApiV1AppPost
     *
     * @param applicationIn 
     * @param getIfExists Get an existing application, or create a new one if doesn&#39;t exist. It&#39;s two separate functions in the libs. (optional, default to false)
     * @param idempotencyKey The request&#39;s idempotency key (optional)
     * @return RequestConfig
     */
    fun createApplicationApiV1AppPostRequestConfig(applicationIn: ApplicationIn, getIfExists: kotlin.Boolean?, idempotencyKey: kotlin.String?) : RequestConfig<ApplicationIn> {
        val localVariableBody = applicationIn
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, kotlin.collections.List<kotlin.String>>()
            .apply {
                if (getIfExists != null) {
                    put("get_if_exists", listOf(getIfExists.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        idempotencyKey?.apply { localVariableHeaders["idempotency-key"] = this.toString() }
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/api/v1/app/",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
     * Delete Application
     * Delete an application.
     * @param appId 
     * @param idempotencyKey The request&#39;s idempotency key (optional)
     * @return void
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    suspend fun deleteApplicationApiV1AppAppIdDelete(appId: kotlin.String, idempotencyKey: kotlin.String? = null) : Unit = withContext(Dispatchers.IO) {
        val localVarResponse = deleteApplicationApiV1AppAppIdDeleteWithHttpInfo(appId = appId, idempotencyKey = idempotencyKey)

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
     * Delete Application
     * Delete an application.
     * @param appId 
     * @param idempotencyKey The request&#39;s idempotency key (optional)
     * @return ApiResponse<Unit?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Throws(IllegalStateException::class, IOException::class)
    suspend fun deleteApplicationApiV1AppAppIdDeleteWithHttpInfo(appId: kotlin.String, idempotencyKey: kotlin.String?) : ApiResponse<Unit?> = withContext(Dispatchers.IO) {
        val localVariableConfig = deleteApplicationApiV1AppAppIdDeleteRequestConfig(appId = appId, idempotencyKey = idempotencyKey)

        return@withContext request<Unit, Unit>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation deleteApplicationApiV1AppAppIdDelete
     *
     * @param appId 
     * @param idempotencyKey The request&#39;s idempotency key (optional)
     * @return RequestConfig
     */
    fun deleteApplicationApiV1AppAppIdDeleteRequestConfig(appId: kotlin.String, idempotencyKey: kotlin.String?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        idempotencyKey?.apply { localVariableHeaders["idempotency-key"] = this.toString() }
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.DELETE,
            path = "/api/v1/app/{app_id}/".replace("{"+"app_id"+"}", encodeURIComponent(appId.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
     * Get Application
     * Get an application.
     * @param appId 
     * @param idempotencyKey The request&#39;s idempotency key (optional)
     * @return ApplicationOut
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    suspend fun getApplicationApiV1AppAppIdGet(appId: kotlin.String, idempotencyKey: kotlin.String? = null) : ApplicationOut = withContext(Dispatchers.IO) {
        val localVarResponse = getApplicationApiV1AppAppIdGetWithHttpInfo(appId = appId, idempotencyKey = idempotencyKey)

        return@withContext when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as ApplicationOut
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
     * Get Application
     * Get an application.
     * @param appId 
     * @param idempotencyKey The request&#39;s idempotency key (optional)
     * @return ApiResponse<ApplicationOut?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    suspend fun getApplicationApiV1AppAppIdGetWithHttpInfo(appId: kotlin.String, idempotencyKey: kotlin.String?) : ApiResponse<ApplicationOut?> = withContext(Dispatchers.IO) {
        val localVariableConfig = getApplicationApiV1AppAppIdGetRequestConfig(appId = appId, idempotencyKey = idempotencyKey)

        return@withContext request<Unit, ApplicationOut>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation getApplicationApiV1AppAppIdGet
     *
     * @param appId 
     * @param idempotencyKey The request&#39;s idempotency key (optional)
     * @return RequestConfig
     */
    fun getApplicationApiV1AppAppIdGetRequestConfig(appId: kotlin.String, idempotencyKey: kotlin.String?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        idempotencyKey?.apply { localVariableHeaders["idempotency-key"] = this.toString() }
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/api/v1/app/{app_id}/".replace("{"+"app_id"+"}", encodeURIComponent(appId.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
     * List Applications
     * List of all the organization&#39;s applications.
     * @param iterator  (optional)
     * @param limit  (optional, default to 50)
     * @param idempotencyKey The request&#39;s idempotency key (optional)
     * @return ListResponseApplicationOut
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    suspend fun listApplicationsApiV1AppGet(iterator: kotlin.String? = null, limit: kotlin.Int? = 50, idempotencyKey: kotlin.String? = null) : ListResponseApplicationOut = withContext(Dispatchers.IO) {
        val localVarResponse = listApplicationsApiV1AppGetWithHttpInfo(iterator = iterator, limit = limit, idempotencyKey = idempotencyKey)

        return@withContext when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as ListResponseApplicationOut
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
     * List Applications
     * List of all the organization&#39;s applications.
     * @param iterator  (optional)
     * @param limit  (optional, default to 50)
     * @param idempotencyKey The request&#39;s idempotency key (optional)
     * @return ApiResponse<ListResponseApplicationOut?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    suspend fun listApplicationsApiV1AppGetWithHttpInfo(iterator: kotlin.String?, limit: kotlin.Int?, idempotencyKey: kotlin.String?) : ApiResponse<ListResponseApplicationOut?> = withContext(Dispatchers.IO) {
        val localVariableConfig = listApplicationsApiV1AppGetRequestConfig(iterator = iterator, limit = limit, idempotencyKey = idempotencyKey)

        return@withContext request<Unit, ListResponseApplicationOut>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation listApplicationsApiV1AppGet
     *
     * @param iterator  (optional)
     * @param limit  (optional, default to 50)
     * @param idempotencyKey The request&#39;s idempotency key (optional)
     * @return RequestConfig
     */
    fun listApplicationsApiV1AppGetRequestConfig(iterator: kotlin.String?, limit: kotlin.Int?, idempotencyKey: kotlin.String?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, kotlin.collections.List<kotlin.String>>()
            .apply {
                if (iterator != null) {
                    put("iterator", listOf(iterator.toString()))
                }
                if (limit != null) {
                    put("limit", listOf(limit.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        idempotencyKey?.apply { localVariableHeaders["idempotency-key"] = this.toString() }
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/api/v1/app/",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
     * Update Application
     * Update an application.
     * @param appId 
     * @param applicationIn 
     * @param idempotencyKey The request&#39;s idempotency key (optional)
     * @return ApplicationOut
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    suspend fun updateApplicationApiV1AppAppIdPut(appId: kotlin.String, applicationIn: ApplicationIn, idempotencyKey: kotlin.String? = null) : ApplicationOut = withContext(Dispatchers.IO) {
        val localVarResponse = updateApplicationApiV1AppAppIdPutWithHttpInfo(appId = appId, applicationIn = applicationIn, idempotencyKey = idempotencyKey)

        return@withContext when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as ApplicationOut
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
     * Update Application
     * Update an application.
     * @param appId 
     * @param applicationIn 
     * @param idempotencyKey The request&#39;s idempotency key (optional)
     * @return ApiResponse<ApplicationOut?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    suspend fun updateApplicationApiV1AppAppIdPutWithHttpInfo(appId: kotlin.String, applicationIn: ApplicationIn, idempotencyKey: kotlin.String?) : ApiResponse<ApplicationOut?> = withContext(Dispatchers.IO) {
        val localVariableConfig = updateApplicationApiV1AppAppIdPutRequestConfig(appId = appId, applicationIn = applicationIn, idempotencyKey = idempotencyKey)

        return@withContext request<ApplicationIn, ApplicationOut>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation updateApplicationApiV1AppAppIdPut
     *
     * @param appId 
     * @param applicationIn 
     * @param idempotencyKey The request&#39;s idempotency key (optional)
     * @return RequestConfig
     */
    fun updateApplicationApiV1AppAppIdPutRequestConfig(appId: kotlin.String, applicationIn: ApplicationIn, idempotencyKey: kotlin.String?) : RequestConfig<ApplicationIn> {
        val localVariableBody = applicationIn
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        idempotencyKey?.apply { localVariableHeaders["idempotency-key"] = this.toString() }
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.PUT,
            path = "/api/v1/app/{app_id}/".replace("{"+"app_id"+"}", encodeURIComponent(appId.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }


    private fun encodeURIComponent(uriComponent: kotlin.String): kotlin.String =
        HttpUrl.Builder().scheme("http").host("localhost").addPathSegment(uriComponent).build().encodedPathSegments[0]
}
