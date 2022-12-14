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

import com.outmatchapi.slack.ConversationsOpenSuccessSchemaChannelInner
import com.outmatchapi.slack.DefsOkTrue

import com.squareup.moshi.Json

/**
 * Schema for successful response from conversations.open method when opening channels, ims, mpims
 *
 * @param channel 
 * @param ok 
 * @param alreadyOpen 
 * @param noOp 
 */


data class ConversationsOpenSuccessSchema (

    @Json(name = "channel")
    val channel: kotlin.collections.List<ConversationsOpenSuccessSchemaChannelInner>,

    @Json(name = "ok")
    val ok: DefsOkTrue,

    @Json(name = "already_open")
    val alreadyOpen: kotlin.Boolean? = null,

    @Json(name = "no_op")
    val noOp: kotlin.Boolean? = null

)

