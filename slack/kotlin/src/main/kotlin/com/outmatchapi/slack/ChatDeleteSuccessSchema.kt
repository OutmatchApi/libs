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
 * Schema for successful response of chat.delete method
 *
 * @param channel 
 * @param ok 
 * @param ts 
 */


data class ChatDeleteSuccessSchema (

    @Json(name = "channel")
    val channel: kotlin.String,

    @Json(name = "ok")
    val ok: DefsOkTrue,

    @Json(name = "ts")
    val ts: kotlin.String

)
