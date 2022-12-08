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
 * Schema for error response from users.conversations method
 *
 * @param error 
 * @param ok 
 * @param callstack Note: PHP callstack is only visible in dev/qa
 */


data class UsersConversationsErrorSchema (

    @Json(name = "error")
    val error: UsersConversationsErrorSchema.Error,

    @Json(name = "ok")
    val ok: DefsOkFalse,

    /* Note: PHP callstack is only visible in dev/qa */
    @Json(name = "callstack")
    val callstack: kotlin.String? = null

) {

    /**
     * 
     *
     * Values: methodNotSupportedForChannelType,missingScope,invalidTypes,invalidCursor,invalidLimit,notAuthed,invalidAuth,accountInactive,tokenRevoked,noPermission,invalidArgName,invalidArrayArg,invalidCharset,invalidFormData,invalidPostType,missingPostType,teamAddedToOrg,invalidJson,jsonNotObject,requestTimeout,upgradeRequired,fatalError
     */
    enum class Error(val value: kotlin.String) {
        @Json(name = "method_not_supported_for_channel_type") methodNotSupportedForChannelType("method_not_supported_for_channel_type"),
        @Json(name = "missing_scope") missingScope("missing_scope"),
        @Json(name = "invalid_types") invalidTypes("invalid_types"),
        @Json(name = "invalid_cursor") invalidCursor("invalid_cursor"),
        @Json(name = "invalid_limit") invalidLimit("invalid_limit"),
        @Json(name = "not_authed") notAuthed("not_authed"),
        @Json(name = "invalid_auth") invalidAuth("invalid_auth"),
        @Json(name = "account_inactive") accountInactive("account_inactive"),
        @Json(name = "token_revoked") tokenRevoked("token_revoked"),
        @Json(name = "no_permission") noPermission("no_permission"),
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
        @Json(name = "upgrade_required") upgradeRequired("upgrade_required"),
        @Json(name = "fatal_error") fatalError("fatal_error");
    }
}

