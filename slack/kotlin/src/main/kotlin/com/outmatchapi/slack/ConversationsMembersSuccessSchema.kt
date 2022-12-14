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
import com.outmatchapi.slack.DefsOkTrue

import com.squareup.moshi.Json

/**
 * Schema for successful response conversations.members method
 *
 * @param members 
 * @param ok 
 * @param responseMetadata 
 */


data class ConversationsMembersSuccessSchema (

    @Json(name = "members")
    val members: kotlin.collections.List<kotlin.String>,

    @Json(name = "ok")
    val ok: DefsOkTrue,

    @Json(name = "response_metadata")
    val responseMetadata: AdminConversationsGetTeamsSchemaResponseMetadata

)

