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
 * @param medium The type of search that brought the viewer to the live stream. Organic would be they found it on their own, paid would be they found it via an advertisement.
 * @param searchTerm What term they searched for that led them to the live stream.
 * @param source Where the viewer came from to see the live stream (usually where they searched from).
 * @param url The website the viewer of the live stream was referred to in order to view the live stream.
 */


data class LiveStreamSessionReferrer (

    /* The type of search that brought the viewer to the live stream. Organic would be they found it on their own, paid would be they found it via an advertisement. */
    @Json(name = "medium")
    val medium: kotlin.String? = null,

    /* What term they searched for that led them to the live stream. */
    @Json(name = "searchTerm")
    val searchTerm: kotlin.String? = null,

    /* Where the viewer came from to see the live stream (usually where they searched from). */
    @Json(name = "source")
    val source: kotlin.String? = null,

    /* The website the viewer of the live stream was referred to in order to view the live stream. */
    @Json(name = "url")
    val url: kotlin.String? = null

)
