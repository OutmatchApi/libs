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
 * Schema for error response from admin.conversations.delete
 *
 * @param error 
 * @param ok 
 */


data class AdminConversationsDeleteErrorSchema (

    @Json(name = "error")
    val error: AdminConversationsDeleteErrorSchema.Error,

    @Json(name = "ok")
    val ok: DefsOkFalse

) {

    /**
     * 
     *
     * Values: featureNotEnabled,notAnAdmin,channelNotFound,channelTypeNotSupported,defaultOrgWideChannel,restrictedAction,couldNotDeleteChannel,missingScope
     */
    enum class Error(val value: kotlin.String) {
        @Json(name = "feature_not_enabled") featureNotEnabled("feature_not_enabled"),
        @Json(name = "not_an_admin") notAnAdmin("not_an_admin"),
        @Json(name = "channel_not_found") channelNotFound("channel_not_found"),
        @Json(name = "channel_type_not_supported") channelTypeNotSupported("channel_type_not_supported"),
        @Json(name = "default_org_wide_channel") defaultOrgWideChannel("default_org_wide_channel"),
        @Json(name = "restricted_action") restrictedAction("restricted_action"),
        @Json(name = "could_not_delete_channel") couldNotDeleteChannel("could_not_delete_channel"),
        @Json(name = "missing_scope") missingScope("missing_scope");
    }
}

