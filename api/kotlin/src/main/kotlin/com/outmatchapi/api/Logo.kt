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

package com.outmatchapi.api


import com.squareup.moshi.Json

/**
 * 
 *
 * @param url 
 * @param altText 
 */


data class Logo (

    @Json(name = "url")
    val url: kotlin.String,

    @Json(name = "altText")
    val altText: kotlin.String

)
