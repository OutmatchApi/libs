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

import com.outmatchapi.slack.AdminConversationsGetTeamsSchemaResponseMetadata
import com.outmatchapi.slack.ChatScheduledMessagesListSchemaScheduledMessagesInner
import com.outmatchapi.slack.DefsOkTrue

import com.squareup.moshi.Json

/**
 * Schema for successful response from chat.scheduledMessages.list method
 *
 * @param ok 
 * @param responseMetadata 
 * @param scheduledMessages 
 */


data class ChatScheduledMessagesListSchema (

    @Json(name = "ok")
    val ok: DefsOkTrue,

    @Json(name = "response_metadata")
    val responseMetadata: AdminConversationsGetTeamsSchemaResponseMetadata,

    @Json(name = "scheduled_messages")
    val scheduledMessages: kotlin.collections.List<ChatScheduledMessagesListSchemaScheduledMessagesInner>

)

