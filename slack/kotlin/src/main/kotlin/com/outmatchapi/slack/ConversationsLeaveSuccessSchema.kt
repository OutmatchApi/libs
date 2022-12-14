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

import com.outmatchapi.slack.DefsOkTrue

import com.squareup.moshi.Json

/**
 * Schema for successful response from conversations.leave method
 *
 * @param ok 
 * @param notInChannel 
 */


data class ConversationsLeaveSuccessSchema (

    @Json(name = "ok")
    val ok: DefsOkTrue,

    @Json(name = "not_in_channel")
    val notInChannel: ConversationsLeaveSuccessSchema.NotInChannel? = null

) {

    /**
     * 
     *
     * Values: `true`
     */
    enum class NotInChannel(val value: kotlin.Boolean) {
        @Json(name = ""true"") `true`("true");
    }
}

