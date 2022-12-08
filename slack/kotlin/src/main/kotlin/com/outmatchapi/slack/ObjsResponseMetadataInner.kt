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

import com.outmatchapi.slack.DeprecationWarning
import com.outmatchapi.slack.DeprecationWarningAndPagingStyleTogether
import com.outmatchapi.slack.NewPagingStyle

import com.squareup.moshi.Json

/**
 * 
 *
 * @param nextCursor 
 * @param messages 
 * @param warnings 
 */


data class ObjsResponseMetadataInner (

    @Json(name = "next_cursor")
    val nextCursor: kotlin.String,

    @Json(name = "messages")
    val messages: kotlin.collections.List<kotlin.String>,

    @Json(name = "warnings")
    val warnings: kotlin.collections.List<ObjsResponseMetadataInner.Warnings>

) {

    /**
     * 
     *
     * Values: methodDeprecated
     */
    enum class Warnings(val value: kotlin.String) {
        @Json(name = "method_deprecated") methodDeprecated("method_deprecated");
    }
}

