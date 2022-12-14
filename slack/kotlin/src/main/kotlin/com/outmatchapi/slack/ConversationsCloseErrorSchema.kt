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

package com.outmatchapi.slack

import com.outmatchapi.slack.DefsOkFalse

import com.squareup.moshi.Json

/**
 * Schema for error response from conversations.close method
 *
 * @param error 
 * @param ok 
 * @param callstack Note: PHP callstack is only visible in dev/qa
 * @param needed 
 * @param provided 
 */


data class ConversationsCloseErrorSchema (

    @Json(name = "error")
    val error: ConversationsCloseErrorSchema.Error,

    @Json(name = "ok")
    val ok: DefsOkFalse,

    /* Note: PHP callstack is only visible in dev/qa */
    @Json(name = "callstack")
    val callstack: kotlin.String? = null,

    @Json(name = "needed")
    val needed: kotlin.String? = null,

    @Json(name = "provided")
    val provided: kotlin.String? = null

) {

    /**
     * 
     *
     * Values: methodNotSupportedForChannelType,channelNotFound,userDoesNotOwnChannel,missingScope,notAuthed,invalidAuth,accountInactive,invalidArgName,invalidArrayArg,invalidCharset,invalidFormData,invalidPostType,missingPostType,teamAddedToOrg,invalidJson,jsonNotObject,requestTimeout,upgradeRequired
     */
    enum class Error(val value: kotlin.String) {
        @Json(name = "method_not_supported_for_channel_type") methodNotSupportedForChannelType("method_not_supported_for_channel_type"),
        @Json(name = "channel_not_found") channelNotFound("channel_not_found"),
        @Json(name = "user_does_not_own_channel") userDoesNotOwnChannel("user_does_not_own_channel"),
        @Json(name = "missing_scope") missingScope("missing_scope"),
        @Json(name = "not_authed") notAuthed("not_authed"),
        @Json(name = "invalid_auth") invalidAuth("invalid_auth"),
        @Json(name = "account_inactive") accountInactive("account_inactive"),
        @Json(name = "invalid_arg_name") invalidArgName("invalid_arg_name"),
        @Json(name = "invalid_array_arg") invalidArrayArg("invalid_array_arg"),
        @Json(name = "invalid_charset") invalidCharset("invalid_charset"),
        @Json(name = "invalid_form_data") invalidFormData("invalid_form_data"),
        @Json(name = "invalid_post_type") invalidPostType("invalid_post_type"),
        @Json(name = "missing_post_type") missingPostType("missing_post_type"),
        @Json(name = "team_added_to_org") teamAddedToOrg("team_added_to_org"),
        @Json(name = "invalid_json") invalidJson("invalid_json"),
        @Json(name = "json_not_object") jsonNotObject("json_not_object"),
        @Json(name = "request_timeout") requestTimeout("request_timeout"),
        @Json(name = "upgrade_required") upgradeRequired("upgrade_required");
    }
}

