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
 * Schema for error response from users.info method
 *
 * @param error 
 * @param ok 
 * @param callstack 
 */


data class UsersInfoErrorSchema (

    @Json(name = "error")
    val error: UsersInfoErrorSchema.Error,

    @Json(name = "ok")
    val ok: DefsOkFalse,

    @Json(name = "callstack")
    val callstack: kotlin.String? = null

) {

    /**
     * 
     *
     * Values: userNotFound,userNotVisible,notAuthed,invalidAuth,accountInactive,invalidArgName,invalidArrayArg,invalidCharset,invalidFormData,invalidPostType,missingPostType,teamAddedToOrg,invalidJson,jsonNotObject,requestTimeout,upgradeRequired
     */
    enum class Error(val value: kotlin.String) {
        @Json(name = "user_not_found") userNotFound("user_not_found"),
        @Json(name = "user_not_visible") userNotVisible("user_not_visible"),
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

