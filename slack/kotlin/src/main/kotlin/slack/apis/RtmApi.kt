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

import com.outmatchapi.slack.RtmConnectErrorSchema
import com.outmatchapi.slack.RtmConnectSchema

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

class RtmApi(basePath: kotlin.String = defaultBasePath, client: OkHttpClient = ApiClient.defaultClient) : ApiClient(basePath, client) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "https://slack.com/api")
        }
    }

    /**
     * 
     * Starts a Real Time Messaging session.
     * @param token Authentication token. Requires scope: &#x60;rtm:stream&#x60;
     * @param batchPresenceAware Batch presence deliveries via subscription. Enabling changes the shape of &#x60;presence_change&#x60; events. See [batch presence](/docs/presence-and-status#batching). (optional)
     * @param presenceSub Only deliver presence events when requested by subscription. See [presence subscriptions](/docs/presence-and-status#subscriptions). (optional)
     * @return RtmConnectSchema
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    suspend fun rtmConnect(token: kotlin.String, batchPresenceAware: kotlin.Boolean? = null, presenceSub: kotlin.Boolean? = null) : RtmConnectSchema = withContext(Dispatchers.IO) {
        val localVarResponse = rtmConnectWithHttpInfo(token = token, batchPresenceAware = batchPresenceAware, presenceSub = presenceSub)

        return@withContext when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as RtmConnectSchema
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
     * Starts a Real Time Messaging session.
     * @param token Authentication token. Requires scope: &#x60;rtm:stream&#x60;
     * @param batchPresenceAware Batch presence deliveries via subscription. Enabling changes the shape of &#x60;presence_change&#x60; events. See [batch presence](/docs/presence-and-status#batching). (optional)
     * @param presenceSub Only deliver presence events when requested by subscription. See [presence subscriptions](/docs/presence-and-status#subscriptions). (optional)
     * @return ApiResponse<RtmConnectSchema?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    suspend fun rtmConnectWithHttpInfo(token: kotlin.String, batchPresenceAware: kotlin.Boolean?, presenceSub: kotlin.Boolean?) : ApiResponse<RtmConnectSchema?> = withContext(Dispatchers.IO) {
        val localVariableConfig = rtmConnectRequestConfig(token = token, batchPresenceAware = batchPresenceAware, presenceSub = presenceSub)

        return@withContext request<Unit, RtmConnectSchema>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation rtmConnect
     *
     * @param token Authentication token. Requires scope: &#x60;rtm:stream&#x60;
     * @param batchPresenceAware Batch presence deliveries via subscription. Enabling changes the shape of &#x60;presence_change&#x60; events. See [batch presence](/docs/presence-and-status#batching). (optional)
     * @param presenceSub Only deliver presence events when requested by subscription. See [presence subscriptions](/docs/presence-and-status#subscriptions). (optional)
     * @return RequestConfig
     */
    fun rtmConnectRequestConfig(token: kotlin.String, batchPresenceAware: kotlin.Boolean?, presenceSub: kotlin.Boolean?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, kotlin.collections.List<kotlin.String>>()
            .apply {
                put("token", listOf(token.toString()))
                if (batchPresenceAware != null) {
                    put("batch_presence_aware", listOf(batchPresenceAware.toString()))
                }
                if (presenceSub != null) {
                    put("presence_sub", listOf(presenceSub.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/rtm.connect",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }


    private fun encodeURIComponent(uriComponent: kotlin.String): kotlin.String =
        HttpUrl.Builder().scheme("http").host("localhost").addPathSegment(uriComponent).build().encodedPathSegments[0]
}
