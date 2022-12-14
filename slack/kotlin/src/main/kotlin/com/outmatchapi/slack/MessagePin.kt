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

import com.outmatchapi.slack.ObjsMessage

import com.squareup.moshi.Json

/**
 * 
 *
 * @param channel 
 * @param created 
 * @param createdBy 
 * @param message 
 * @param type 
 */


data class MessagePin (

    @Json(name = "channel")
    val channel: kotlin.String? = null,

    @Json(name = "created")
    val created: kotlin.Int? = null,

    @Json(name = "created_by")
    val createdBy: kotlin.String? = null,

    @Json(name = "message")
    val message: ObjsMessage? = null,

    @Json(name = "type")
    val type: MessagePin.Type? = null

) {

    /**
     * 
     *
     * Values: message
     */
    enum class Type(val value: kotlin.String) {
        @Json(name = "message") message("message");
    }
}

