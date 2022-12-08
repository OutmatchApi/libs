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
 * Schema for error response chat.postMessage method
 *
 * @param error 
 * @param ok 
 * @param callstack Note: PHP callstack is only visible in dev/qa
 */


data class ChatPostMessageErrorSchema (

    @Json(name = "error")
    val error: ChatPostMessageErrorSchema.Error,

    @Json(name = "ok")
    val ok: DefsOkFalse,

    /* Note: PHP callstack is only visible in dev/qa */
    @Json(name = "callstack")
    val callstack: kotlin.String? = null

) {

    /**
     * 
     *
     * Values: channelNotFound,notInChannel,isArchived,msgTooLong,noText,tooManyAttachments,rateLimited,notAuthed,invalidAuth,accountInactive,invalidArgName,invalidArrayArg,invalidCharset,invalidFormData,invalidPostType,missingPostType
     */
    enum class Error(val value: kotlin.String) {
        @Json(name = "channel_not_found") channelNotFound("channel_not_found"),
        @Json(name = "not_in_channel") notInChannel("not_in_channel"),
        @Json(name = "is_archived") isArchived("is_archived"),
        @Json(name = "msg_too_long") msgTooLong("msg_too_long"),
        @Json(name = "no_text") noText("no_text"),
        @Json(name = "too_many_attachments") tooManyAttachments("too_many_attachments"),
        @Json(name = "rate_limited") rateLimited("rate_limited"),
        @Json(name = "not_authed") notAuthed("not_authed"),
        @Json(name = "invalid_auth") invalidAuth("invalid_auth"),
        @Json(name = "account_inactive") accountInactive("account_inactive"),
        @Json(name = "invalid_arg_name") invalidArgName("invalid_arg_name"),
        @Json(name = "invalid_array_arg") invalidArrayArg("invalid_array_arg"),
        @Json(name = "invalid_charset") invalidCharset("invalid_charset"),
        @Json(name = "invalid_form_data") invalidFormData("invalid_form_data"),
        @Json(name = "invalid_post_type") invalidPostType("invalid_post_type"),
        @Json(name = "missing_post_type") missingPostType("missing_post_type");
    }
}
