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
import com.outmatchapi.slack.ObjsComment
import com.outmatchapi.slack.ObjsFile
import com.outmatchapi.slack.ObjsMessage
import com.outmatchapi.slack.ReactionsGetSuccessSchemaInnerAnyOf
import com.outmatchapi.slack.ReactionsGetSuccessSchemaInnerAnyOf1
import com.outmatchapi.slack.ReactionsGetSuccessSchemaInnerAnyOf2

import com.squareup.moshi.Json

/**
 * 
 *
 * @param channel 
 * @param message 
 * @param ok 
 * @param type 
 * @param file 
 * @param comment 
 */


data class ReactionsGetSuccessSchemaInner (

    @Json(name = "channel")
    val channel: kotlin.String,

    @Json(name = "message")
    val message: ObjsMessage,

    @Json(name = "ok")
    val ok: DefsOkTrue,

    @Json(name = "type")
    val type: ReactionsGetSuccessSchemaInner.Type,

    @Json(name = "file")
    val file: ObjsFile,

    @Json(name = "comment")
    val comment: ObjsComment

) {

    /**
     * 
     *
     * Values: fileComment
     */
    enum class Type(val value: kotlin.String) {
        @Json(name = "file_comment") fileComment("file_comment");
    }
}
