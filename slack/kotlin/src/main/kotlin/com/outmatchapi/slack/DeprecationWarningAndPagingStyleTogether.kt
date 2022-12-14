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


import com.squareup.moshi.Json

/**
 * 
 *
 * @param messages 
 * @param nextCursor 
 * @param warnings 
 */


data class DeprecationWarningAndPagingStyleTogether (

    @Json(name = "messages")
    val messages: kotlin.collections.List<kotlin.String>,

    @Json(name = "next_cursor")
    val nextCursor: kotlin.String,

    @Json(name = "warnings")
    val warnings: kotlin.collections.List<DeprecationWarningAndPagingStyleTogether.Warnings>

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

