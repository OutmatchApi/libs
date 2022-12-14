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
import com.outmatchapi.slack.ErrorsIsReturnedWhenAnErrorAssociatesAnUserInner

import com.squareup.moshi.Json

/**
 * Schema for error response from conversations.invite method
 *
 * @param ok 
 * @param callstack Note: PHP callstack is only visible in dev/qa
 * @param error 
 * @param errors 
 * @param needed 
 * @param provided 
 */


data class ConversationsInviteErrorSchema1 (

    @Json(name = "ok")
    val ok: DefsOkFalse,

    /* Note: PHP callstack is only visible in dev/qa */
    @Json(name = "callstack")
    val callstack: kotlin.String? = null,

    @Json(name = "error")
    val error: ConversationsInviteErrorSchema1.Error? = null,

    @Json(name = "errors")
    val errors: kotlin.collections.Set<ErrorsIsReturnedWhenAnErrorAssociatesAnUserInner>? = null,

    @Json(name = "needed")
    val needed: kotlin.String? = null,

    @Json(name = "provided")
    val provided: kotlin.String? = null

) {

    /**
     * 
     *
     * Values: methodNotSupportedForChannelType,missingScope,channelNotFound,userNotFound,noUser,cantInviteSelf,notInChannel,alreadyInChannel,isArchived,cantInvite,tooManyUsers,uraMaxChannels,notAuthed,invalidAuth,accountInactive,userIsBot,userIsRestricted,userIsUltraRestricted,invalidArgName,invalidArrayArg,invalidCharset,invalidFormData,invalidPostType,missingPostType,invalidJson,jsonNotObject,requestTimeout,upgradeRequired,teamAddedToOrg,missingCharset,superfluousCharset
     */
    enum class Error(val value: kotlin.String) {
        @Json(name = "method_not_supported_for_channel_type") methodNotSupportedForChannelType("method_not_supported_for_channel_type"),
        @Json(name = "missing_scope") missingScope("missing_scope"),
        @Json(name = "channel_not_found") channelNotFound("channel_not_found"),
        @Json(name = "user_not_found") userNotFound("user_not_found"),
        @Json(name = "no_user") noUser("no_user"),
        @Json(name = "cant_invite_self") cantInviteSelf("cant_invite_self"),
        @Json(name = "not_in_channel") notInChannel("not_in_channel"),
        @Json(name = "already_in_channel") alreadyInChannel("already_in_channel"),
        @Json(name = "is_archived") isArchived("is_archived"),
        @Json(name = "cant_invite") cantInvite("cant_invite"),
        @Json(name = "too_many_users") tooManyUsers("too_many_users"),
        @Json(name = "ura_max_channels") uraMaxChannels("ura_max_channels"),
        @Json(name = "not_authed") notAuthed("not_authed"),
        @Json(name = "invalid_auth") invalidAuth("invalid_auth"),
        @Json(name = "account_inactive") accountInactive("account_inactive"),
        @Json(name = "user_is_bot") userIsBot("user_is_bot"),
        @Json(name = "user_is_restricted") userIsRestricted("user_is_restricted"),
        @Json(name = "user_is_ultra_restricted") userIsUltraRestricted("user_is_ultra_restricted"),
        @Json(name = "invalid_arg_name") invalidArgName("invalid_arg_name"),
        @Json(name = "invalid_array_arg") invalidArrayArg("invalid_array_arg"),
        @Json(name = "invalid_charset") invalidCharset("invalid_charset"),
        @Json(name = "invalid_form_data") invalidFormData("invalid_form_data"),
        @Json(name = "invalid_post_type") invalidPostType("invalid_post_type"),
        @Json(name = "missing_post_type") missingPostType("missing_post_type"),
        @Json(name = "invalid_json") invalidJson("invalid_json"),
        @Json(name = "json_not_object") jsonNotObject("json_not_object"),
        @Json(name = "request_timeout") requestTimeout("request_timeout"),
        @Json(name = "upgrade_required") upgradeRequired("upgrade_required"),
        @Json(name = "team_added_to_org") teamAddedToOrg("team_added_to_org"),
        @Json(name = "missing_charset") missingCharset("missing_charset"),
        @Json(name = "superfluous_charset") superfluousCharset("superfluous_charset");
    }
}

