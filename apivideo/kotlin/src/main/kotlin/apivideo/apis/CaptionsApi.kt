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

package apivideo.apis

import java.io.IOException
import okhttp3.OkHttpClient
import okhttp3.HttpUrl

import com.outmatchapi.apivideo.BadMinusRequest
import com.outmatchapi.apivideo.CaptionsMinusListMinusResponse
import com.outmatchapi.apivideo.CaptionsMinusUpdateMinusPayload
import com.outmatchapi.apivideo.NotMinusFound
import com.outmatchapi.apivideo.Subtitle

import com.squareup.moshi.Json

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import apivideo.infrastructure.ApiClient
import apivideo.infrastructure.ApiResponse
import apivideo.infrastructure.ClientException
import apivideo.infrastructure.ClientError
import apivideo.infrastructure.ServerException
import apivideo.infrastructure.ServerError
import apivideo.infrastructure.MultiValueMap
import apivideo.infrastructure.PartConfig
import apivideo.infrastructure.RequestConfig
import apivideo.infrastructure.RequestMethod
import apivideo.infrastructure.ResponseType
import apivideo.infrastructure.Success
import apivideo.infrastructure.toMultiValue

class CaptionsApi(basePath: kotlin.String = defaultBasePath, client: OkHttpClient = ApiClient.defaultClient) : ApiClient(basePath, client) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "https://ws.api.video")
        }
    }

    /**
     * Delete a caption
     * Delete a caption in a specific language by providing the video ID for the video you want to delete the caption from and the language the caption is in.
     * @param videoId The unique identifier for the video you want to delete a caption from.
     * @param language A valid [BCP 47](https://github.com/libyal/libfwnt/wiki/Language-Code-identifiers) language representation.
     * @return void
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    suspend fun dELETEVideosVideoIdCaptionsLanguage(videoId: kotlin.String, language: kotlin.String) : Unit = withContext(Dispatchers.IO) {
        val localVarResponse = dELETEVideosVideoIdCaptionsLanguageWithHttpInfo(videoId = videoId, language = language)

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
     * Delete a caption
     * Delete a caption in a specific language by providing the video ID for the video you want to delete the caption from and the language the caption is in.
     * @param videoId The unique identifier for the video you want to delete a caption from.
     * @param language A valid [BCP 47](https://github.com/libyal/libfwnt/wiki/Language-Code-identifiers) language representation.
     * @return ApiResponse<Unit?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Throws(IllegalStateException::class, IOException::class)
    suspend fun dELETEVideosVideoIdCaptionsLanguageWithHttpInfo(videoId: kotlin.String, language: kotlin.String) : ApiResponse<Unit?> = withContext(Dispatchers.IO) {
        val localVariableConfig = dELETEVideosVideoIdCaptionsLanguageRequestConfig(videoId = videoId, language = language)

        return@withContext request<Unit, Unit>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation dELETEVideosVideoIdCaptionsLanguage
     *
     * @param videoId The unique identifier for the video you want to delete a caption from.
     * @param language A valid [BCP 47](https://github.com/libyal/libfwnt/wiki/Language-Code-identifiers) language representation.
     * @return RequestConfig
     */
    fun dELETEVideosVideoIdCaptionsLanguageRequestConfig(videoId: kotlin.String, language: kotlin.String) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.DELETE,
            path = "/videos/{videoId}/captions/{language}".replace("{"+"videoId"+"}", encodeURIComponent(videoId.toString())).replace("{"+"language"+"}", encodeURIComponent(language.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
     * List video captions
     * Retrieve a list of available captions for the videoId you provide.
     * @param videoId The unique identifier for the video you want to retrieve a list of captions for.
     * @param currentPage Choose the number of search results to return per page. Minimum value: 1 (optional, default to 1)
     * @param pageSize Results per page. Allowed values 1-100, default is 25. (optional, default to 25)
     * @return CaptionsMinusListMinusResponse
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    suspend fun gETVideosVideoIdCaptions(videoId: kotlin.String, currentPage: kotlin.Int? = 1, pageSize: kotlin.Int? = 25) : CaptionsMinusListMinusResponse = withContext(Dispatchers.IO) {
        val localVarResponse = gETVideosVideoIdCaptionsWithHttpInfo(videoId = videoId, currentPage = currentPage, pageSize = pageSize)

        return@withContext when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as CaptionsMinusListMinusResponse
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
     * List video captions
     * Retrieve a list of available captions for the videoId you provide.
     * @param videoId The unique identifier for the video you want to retrieve a list of captions for.
     * @param currentPage Choose the number of search results to return per page. Minimum value: 1 (optional, default to 1)
     * @param pageSize Results per page. Allowed values 1-100, default is 25. (optional, default to 25)
     * @return ApiResponse<CaptionsMinusListMinusResponse?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    suspend fun gETVideosVideoIdCaptionsWithHttpInfo(videoId: kotlin.String, currentPage: kotlin.Int?, pageSize: kotlin.Int?) : ApiResponse<CaptionsMinusListMinusResponse?> = withContext(Dispatchers.IO) {
        val localVariableConfig = gETVideosVideoIdCaptionsRequestConfig(videoId = videoId, currentPage = currentPage, pageSize = pageSize)

        return@withContext request<Unit, CaptionsMinusListMinusResponse>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation gETVideosVideoIdCaptions
     *
     * @param videoId The unique identifier for the video you want to retrieve a list of captions for.
     * @param currentPage Choose the number of search results to return per page. Minimum value: 1 (optional, default to 1)
     * @param pageSize Results per page. Allowed values 1-100, default is 25. (optional, default to 25)
     * @return RequestConfig
     */
    fun gETVideosVideoIdCaptionsRequestConfig(videoId: kotlin.String, currentPage: kotlin.Int?, pageSize: kotlin.Int?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, kotlin.collections.List<kotlin.String>>()
            .apply {
                if (currentPage != null) {
                    put("currentPage", listOf(currentPage.toString()))
                }
                if (pageSize != null) {
                    put("pageSize", listOf(pageSize.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/videos/{videoId}/captions".replace("{"+"videoId"+"}", encodeURIComponent(videoId.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
     * Show a caption
     * Display a caption for a video in a specific language. If the language is available, the caption is returned. Otherwise, you will get a response indicating the caption was not found. Tutorials that use the [captions endpoint](https://api.video/blog/endpoints/captions).
     * @param videoId The unique identifier for the video you want captions for.
     * @param language A valid [BCP 47](https://github.com/libyal/libfwnt/wiki/Language-Code-identifiers) language representation
     * @return Subtitle
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    suspend fun gETVideosVideoIdCaptionsLanguage(videoId: kotlin.String, language: kotlin.String) : Subtitle = withContext(Dispatchers.IO) {
        val localVarResponse = gETVideosVideoIdCaptionsLanguageWithHttpInfo(videoId = videoId, language = language)

        return@withContext when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as Subtitle
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
     * Show a caption
     * Display a caption for a video in a specific language. If the language is available, the caption is returned. Otherwise, you will get a response indicating the caption was not found. Tutorials that use the [captions endpoint](https://api.video/blog/endpoints/captions).
     * @param videoId The unique identifier for the video you want captions for.
     * @param language A valid [BCP 47](https://github.com/libyal/libfwnt/wiki/Language-Code-identifiers) language representation
     * @return ApiResponse<Subtitle?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    suspend fun gETVideosVideoIdCaptionsLanguageWithHttpInfo(videoId: kotlin.String, language: kotlin.String) : ApiResponse<Subtitle?> = withContext(Dispatchers.IO) {
        val localVariableConfig = gETVideosVideoIdCaptionsLanguageRequestConfig(videoId = videoId, language = language)

        return@withContext request<Unit, Subtitle>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation gETVideosVideoIdCaptionsLanguage
     *
     * @param videoId The unique identifier for the video you want captions for.
     * @param language A valid [BCP 47](https://github.com/libyal/libfwnt/wiki/Language-Code-identifiers) language representation
     * @return RequestConfig
     */
    fun gETVideosVideoIdCaptionsLanguageRequestConfig(videoId: kotlin.String, language: kotlin.String) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/videos/{videoId}/captions/{language}".replace("{"+"videoId"+"}", encodeURIComponent(videoId.toString())).replace("{"+"language"+"}", encodeURIComponent(language.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
     * Update caption
     * To have the captions on automatically, use this PATCH to set default: true.
     * @param videoId The unique identifier for the video you want to have automatic captions for. 
     * @param language A valid [BCP 47](https://github.com/libyal/libfwnt/wiki/Language-Code-identifiers) language representation.
     * @param captionsMinusUpdateMinusPayload  (optional)
     * @return Subtitle
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    suspend fun pATCHVideosVideoIdCaptionsLanguage(videoId: kotlin.String, language: kotlin.String, captionsMinusUpdateMinusPayload: CaptionsMinusUpdateMinusPayload? = null) : Subtitle = withContext(Dispatchers.IO) {
        val localVarResponse = pATCHVideosVideoIdCaptionsLanguageWithHttpInfo(videoId = videoId, language = language, captionsMinusUpdateMinusPayload = captionsMinusUpdateMinusPayload)

        return@withContext when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as Subtitle
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
     * Update caption
     * To have the captions on automatically, use this PATCH to set default: true.
     * @param videoId The unique identifier for the video you want to have automatic captions for. 
     * @param language A valid [BCP 47](https://github.com/libyal/libfwnt/wiki/Language-Code-identifiers) language representation.
     * @param captionsMinusUpdateMinusPayload  (optional)
     * @return ApiResponse<Subtitle?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    suspend fun pATCHVideosVideoIdCaptionsLanguageWithHttpInfo(videoId: kotlin.String, language: kotlin.String, captionsMinusUpdateMinusPayload: CaptionsMinusUpdateMinusPayload?) : ApiResponse<Subtitle?> = withContext(Dispatchers.IO) {
        val localVariableConfig = pATCHVideosVideoIdCaptionsLanguageRequestConfig(videoId = videoId, language = language, captionsMinusUpdateMinusPayload = captionsMinusUpdateMinusPayload)

        return@withContext request<CaptionsMinusUpdateMinusPayload, Subtitle>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation pATCHVideosVideoIdCaptionsLanguage
     *
     * @param videoId The unique identifier for the video you want to have automatic captions for. 
     * @param language A valid [BCP 47](https://github.com/libyal/libfwnt/wiki/Language-Code-identifiers) language representation.
     * @param captionsMinusUpdateMinusPayload  (optional)
     * @return RequestConfig
     */
    fun pATCHVideosVideoIdCaptionsLanguageRequestConfig(videoId: kotlin.String, language: kotlin.String, captionsMinusUpdateMinusPayload: CaptionsMinusUpdateMinusPayload?) : RequestConfig<CaptionsMinusUpdateMinusPayload> {
        val localVariableBody = captionsMinusUpdateMinusPayload
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.PATCH,
            path = "/videos/{videoId}/captions/{language}".replace("{"+"videoId"+"}", encodeURIComponent(videoId.toString())).replace("{"+"language"+"}", encodeURIComponent(language.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
     * Upload a caption
     * Upload a VTT file to add captions to your video.  Read our [captioning tutorial](https://api.video/blog/tutorials/adding-captions) for more details.
     * @param videoId The unique identifier for the video you want to add a caption to.
     * @param language A valid BCP 47 language representation.
     * @param file The video text track (VTT) you want to upload.
     * @return Subtitle
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    suspend fun pOSTVideosVideoIdCaptionsLanguage(videoId: kotlin.String, language: kotlin.String, file: java.io.File) : Subtitle = withContext(Dispatchers.IO) {
        val localVarResponse = pOSTVideosVideoIdCaptionsLanguageWithHttpInfo(videoId = videoId, language = language, file = file)

        return@withContext when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as Subtitle
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
     * Upload a caption
     * Upload a VTT file to add captions to your video.  Read our [captioning tutorial](https://api.video/blog/tutorials/adding-captions) for more details.
     * @param videoId The unique identifier for the video you want to add a caption to.
     * @param language A valid BCP 47 language representation.
     * @param file The video text track (VTT) you want to upload.
     * @return ApiResponse<Subtitle?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    suspend fun pOSTVideosVideoIdCaptionsLanguageWithHttpInfo(videoId: kotlin.String, language: kotlin.String, file: java.io.File) : ApiResponse<Subtitle?> = withContext(Dispatchers.IO) {
        val localVariableConfig = pOSTVideosVideoIdCaptionsLanguageRequestConfig(videoId = videoId, language = language, file = file)

        return@withContext request<Map<String, PartConfig<*>>, Subtitle>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation pOSTVideosVideoIdCaptionsLanguage
     *
     * @param videoId The unique identifier for the video you want to add a caption to.
     * @param language A valid BCP 47 language representation.
     * @param file The video text track (VTT) you want to upload.
     * @return RequestConfig
     */
    fun pOSTVideosVideoIdCaptionsLanguageRequestConfig(videoId: kotlin.String, language: kotlin.String, file: java.io.File) : RequestConfig<Map<String, PartConfig<*>>> {
        val localVariableBody = mapOf(
            "file" to PartConfig(body = file, headers = mutableMapOf()),)
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf("Content-Type" to "multipart/form-data")
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/videos/{videoId}/captions/{language}".replace("{"+"videoId"+"}", encodeURIComponent(videoId.toString())).replace("{"+"language"+"}", encodeURIComponent(language.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }


    private fun encodeURIComponent(uriComponent: kotlin.String): kotlin.String =
        HttpUrl.Builder().scheme("http").host("localhost").addPathSegment(uriComponent).build().encodedPathSegments[0]
}
