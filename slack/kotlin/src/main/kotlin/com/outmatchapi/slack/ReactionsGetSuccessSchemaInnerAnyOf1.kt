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
import com.outmatchapi.slack.ObjsFile

import com.squareup.moshi.Json

/**
 * 
 *
 * @param file 
 * @param ok 
 * @param type 
 */


data class ReactionsGetSuccessSchemaInnerAnyOf1 (

    @Json(name = "file")
    val file: ObjsFile,

    @Json(name = "ok")
    val ok: DefsOkTrue,

    @Json(name = "type")
    val type: ReactionsGetSuccessSchemaInnerAnyOf1.Type

) {

    /**
     * 
     *
     * Values: file
     */
    enum class Type(val value: kotlin.String) {
        @Json(name = "file") file("file");
    }
}
