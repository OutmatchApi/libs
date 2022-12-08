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
import com.outmatchapi.slack.ObjsMessage

import com.squareup.moshi.Json

/**
 * 
 *
 * @param channel 
 * @param message 
 * @param ok 
 * @param type 
 */


data class ReactionsGetSuccessSchemaInnerAnyOf (

    @Json(name = "channel")
    val channel: kotlin.String,

    @Json(name = "message")
    val message: ObjsMessage,

    @Json(name = "ok")
    val ok: DefsOkTrue,

    @Json(name = "type")
    val type: ReactionsGetSuccessSchemaInnerAnyOf.Type

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

