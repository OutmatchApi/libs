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
 * @param channel 
 * @param dateCreate 
 * @param type 
 */


data class StarsListSchemaItemsInnerInnerAnyOf5 (

    @Json(name = "channel")
    val channel: kotlin.String,

    @Json(name = "date_create")
    val dateCreate: kotlin.Int,

    @Json(name = "type")
    val type: StarsListSchemaItemsInnerInnerAnyOf5.Type

) {

    /**
     * 
     *
     * Values: group
     */
    enum class Type(val value: kotlin.String) {
        @Json(name = "group") group("group");
    }
}
