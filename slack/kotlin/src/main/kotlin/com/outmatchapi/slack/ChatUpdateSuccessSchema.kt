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
import com.outmatchapi.slack.MessageObject

import com.squareup.moshi.Json

/**
 * Schema for successful response of chat.update method
 *
 * @param channel 
 * @param message 
 * @param ok 
 * @param text 
 * @param ts 
 */


data class ChatUpdateSuccessSchema (

    @Json(name = "channel")
    val channel: kotlin.String,

    @Json(name = "message")
    val message: MessageObject,

    @Json(name = "ok")
    val ok: DefsOkTrue,

    @Json(name = "text")
    val text: kotlin.String,

    @Json(name = "ts")
    val ts: kotlin.String

)

