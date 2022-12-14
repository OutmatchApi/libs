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

import com.outmatchapi.slack.ChatScheduleMessageSuccessSchemaMessage
import com.outmatchapi.slack.DefsOkTrue

import com.squareup.moshi.Json

/**
 * Schema for successful response of chat.scheduleMessage method
 *
 * @param channel 
 * @param message 
 * @param ok 
 * @param postAt 
 * @param scheduledMessageId 
 */


data class ChatScheduleMessageSuccessSchema (

    @Json(name = "channel")
    val channel: kotlin.String,

    @Json(name = "message")
    val message: ChatScheduleMessageSuccessSchemaMessage,

    @Json(name = "ok")
    val ok: DefsOkTrue,

    @Json(name = "post_at")
    val postAt: kotlin.Int,

    @Json(name = "scheduled_message_id")
    val scheduledMessageId: kotlin.String

)

