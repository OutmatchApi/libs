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

import com.outmatchapi.slack.ConversationsRepliesSuccessSchemaMessagesInnerInner
import com.outmatchapi.slack.DefsOkTrue

import com.squareup.moshi.Json

/**
 * Schema for successful response from conversations.replies method
 *
 * @param messages 
 * @param ok 
 * @param hasMore 
 */


data class ConversationsRepliesSuccessSchema (

    @Json(name = "messages")
    val messages: kotlin.collections.List<kotlin.collections.List<ConversationsRepliesSuccessSchemaMessagesInnerInner>>,

    @Json(name = "ok")
    val ok: DefsOkTrue,

    @Json(name = "has_more")
    val hasMore: kotlin.Boolean? = null

)

