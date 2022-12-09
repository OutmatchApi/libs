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

package com.outmatchapi.video-api


import com.squareup.moshi.Json

/**
 * 
 *
 * @param language 
 * @param src The link to your VTT file, which contains your chapters information for the video.
 * @param uri 
 */


data class Chapter (

    @Json(name = "language")
    val language: kotlin.String? = null,

    /* The link to your VTT file, which contains your chapters information for the video. */
    @Json(name = "src")
    val src: kotlin.String? = null,

    @Json(name = "uri")
    val uri: kotlin.String? = null

)

