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

package com.outmatchapi.apivideo


import com.squareup.moshi.Json

/**
 * 
 *
 * @param name 
 * @param status 
 * @param title 
 * @param type 
 */


data class NotMinusFound (

    @Json(name = "name")
    val name: kotlin.String? = null,

    @Json(name = "status")
    val status: kotlin.Int? = null,

    @Json(name = "title")
    val title: kotlin.String? = null,

    @Json(name = "type")
    val type: kotlin.String? = null

)
