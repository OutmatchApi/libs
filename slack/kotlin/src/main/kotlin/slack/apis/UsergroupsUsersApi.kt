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

import com.outmatchapi.slack.UsergroupsUsersListErrorSchema
import com.outmatchapi.slack.UsergroupsUsersListSchema
import com.outmatchapi.slack.UsergroupsUsersUpdateErrorSchema
import com.outmatchapi.slack.UsergroupsUsersUpdateSchema

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

class UsergroupsUsersApi(basePath: kotlin.String = defaultBasePath, client: OkHttpClient = ApiClient.defaultClient) : ApiClient(basePath, client) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "https://slack.com/api")
        }
    }

    /**
     * 
     * List all users in a User Group
     * @param token Authentication token. Requires scope: &#x60;usergroups:read&#x60;
     * @param usergroup The encoded ID of the User Group to update.
     * @param includeDisabled Allow results that involve disabled User Groups. (optional)
     * @return UsergroupsUsersListSchema
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    suspend fun usergroupsUsersList(token: kotlin.String, usergroup: kotlin.String, includeDisabled: kotlin.Boolean? = null) : UsergroupsUsersListSchema = withContext(Dispatchers.IO) {
        val localVarResponse = usergroupsUsersListWithHttpInfo(token = token, usergroup = usergroup, includeDisabled = includeDisabled)

        return@withContext when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as UsergroupsUsersListSchema
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
     * List all users in a User Group
     * @param token Authentication token. Requires scope: &#x60;usergroups:read&#x60;
     * @param usergroup The encoded ID of the User Group to update.
     * @param includeDisabled Allow results that involve disabled User Groups. (optional)
     * @return ApiResponse<UsergroupsUsersListSchema?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    suspend fun usergroupsUsersListWithHttpInfo(token: kotlin.String, usergroup: kotlin.String, includeDisabled: kotlin.Boolean?) : ApiResponse<UsergroupsUsersListSchema?> = withContext(Dispatchers.IO) {
        val localVariableConfig = usergroupsUsersListRequestConfig(token = token, usergroup = usergroup, includeDisabled = includeDisabled)

        return@withContext request<Unit, UsergroupsUsersListSchema>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation usergroupsUsersList
     *
     * @param token Authentication token. Requires scope: &#x60;usergroups:read&#x60;
     * @param usergroup The encoded ID of the User Group to update.
     * @param includeDisabled Allow results that involve disabled User Groups. (optional)
     * @return RequestConfig
     */
    fun usergroupsUsersListRequestConfig(token: kotlin.String, usergroup: kotlin.String, includeDisabled: kotlin.Boolean?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, kotlin.collections.List<kotlin.String>>()
            .apply {
                put("token", listOf(token.toString()))
                if (includeDisabled != null) {
                    put("include_disabled", listOf(includeDisabled.toString()))
                }
                put("usergroup", listOf(usergroup.toString()))
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/usergroups.users.list",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
     * 
     * Update the list of users for a User Group
     * @param token Authentication token. Requires scope: &#x60;usergroups:write&#x60;
     * @param usergroup The encoded ID of the User Group to update.
     * @param users A comma separated string of encoded user IDs that represent the entire list of users for the User Group.
     * @param includeCount Include the number of users in the User Group. (optional)
     * @return UsergroupsUsersUpdateSchema
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    suspend fun usergroupsUsersUpdate(token: kotlin.String, usergroup: kotlin.String, users: kotlin.String, includeCount: kotlin.Boolean? = null) : UsergroupsUsersUpdateSchema = withContext(Dispatchers.IO) {
        val localVarResponse = usergroupsUsersUpdateWithHttpInfo(token = token, usergroup = usergroup, users = users, includeCount = includeCount)

        return@withContext when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as UsergroupsUsersUpdateSchema
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
     * Update the list of users for a User Group
     * @param token Authentication token. Requires scope: &#x60;usergroups:write&#x60;
     * @param usergroup The encoded ID of the User Group to update.
     * @param users A comma separated string of encoded user IDs that represent the entire list of users for the User Group.
     * @param includeCount Include the number of users in the User Group. (optional)
     * @return ApiResponse<UsergroupsUsersUpdateSchema?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    suspend fun usergroupsUsersUpdateWithHttpInfo(token: kotlin.String, usergroup: kotlin.String, users: kotlin.String, includeCount: kotlin.Boolean?) : ApiResponse<UsergroupsUsersUpdateSchema?> = withContext(Dispatchers.IO) {
        val localVariableConfig = usergroupsUsersUpdateRequestConfig(token = token, usergroup = usergroup, users = users, includeCount = includeCount)

        return@withContext request<Map<String, PartConfig<*>>, UsergroupsUsersUpdateSchema>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation usergroupsUsersUpdate
     *
     * @param token Authentication token. Requires scope: &#x60;usergroups:write&#x60;
     * @param usergroup The encoded ID of the User Group to update.
     * @param users A comma separated string of encoded user IDs that represent the entire list of users for the User Group.
     * @param includeCount Include the number of users in the User Group. (optional)
     * @return RequestConfig
     */
    fun usergroupsUsersUpdateRequestConfig(token: kotlin.String, usergroup: kotlin.String, users: kotlin.String, includeCount: kotlin.Boolean?) : RequestConfig<Map<String, PartConfig<*>>> {
        val localVariableBody = mapOf(
            "include_count" to PartConfig(body = includeCount, headers = mutableMapOf()),
            "usergroup" to PartConfig(body = usergroup, headers = mutableMapOf()),
            "users" to PartConfig(body = users, headers = mutableMapOf()),)
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf("Content-Type" to "application/x-www-form-urlencoded")
        token.apply { localVariableHeaders["token"] = this.toString() }
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/usergroups.users.update",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }


    private fun encodeURIComponent(uriComponent: kotlin.String): kotlin.String =
        HttpUrl.Builder().scheme("http").host("localhost").addPathSegment(uriComponent).build().encodedPathSegments[0]
}
