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

package com.outmatchapi.testing-api-video


import com.squareup.moshi.Json

/**
 * 
 *
 * @param default Whether you will have subtitles or not. True for yes you will have subtitles, false for no you will not have subtitles.
 * @param src 
 * @param srclang 
 * @param uri 
 */


data class Subtitle (

    /* Whether you will have subtitles or not. True for yes you will have subtitles, false for no you will not have subtitles. */
    @Json(name = "default")
    val default: kotlin.Boolean? = false,

    @Json(name = "src")
    val src: kotlin.String? = null,

    @Json(name = "srclang")
    val srclang: kotlin.String? = null,

    @Json(name = "uri")
    val uri: kotlin.String? = null

)

