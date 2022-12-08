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
 * Schema for error response from users.lookupByEmail method
 *
 * @param error 
 * @param ok 
 * @param callstack Note: PHP callstack is only visible in dev/qa
 */


data class UsersLookupByEmailErrorSchema (

    @Json(name = "error")
    val error: UsersLookupByEmailErrorSchema.Error,

    @Json(name = "ok")
    val ok: DefsOkFalse,

    /* Note: PHP callstack is only visible in dev/qa */
    @Json(name = "callstack")
    val callstack: kotlin.String? = null

) {

    /**
     * 
     *
     * Values: usersNotFound,enterpriseIsRestricted,notAuthed,invalidAuth,accountInactive,noPermission,invalidArgName,invalidArrayArg,invalidCharset,invalidFormData,invalidPostType,missingPostType,teamAddedToOrg,invalidJson,jsonNotObject,requestTimeout,upgradeRequired,fatalError
     */
    enum class Error(val value: kotlin.String) {
        @Json(name = "users_not_found") usersNotFound("users_not_found"),
        @Json(name = "enterprise_is_restricted") enterpriseIsRestricted("enterprise_is_restricted"),
        @Json(name = "not_authed") notAuthed("not_authed"),
        @Json(name = "invalid_auth") invalidAuth("invalid_auth"),
        @Json(name = "account_inactive") accountInactive("account_inactive"),
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

