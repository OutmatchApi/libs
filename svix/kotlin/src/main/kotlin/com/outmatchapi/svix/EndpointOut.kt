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

package com.outmatchapi.svix


import com.squareup.moshi.Json

/**
 * 
 *
 * @param url 
 * @param version 
 * @param id 
 * @param createdAt 
 * @param updatedAt 
 * @param uid Optional unique identifier for the endpoint
 * @param description 
 * @param filterTypes 
 * @param channels List of message channels this endpoint listens to (omit for all)
 * @param disabled 
 * @param rateLimit 
 * @param metadata 
 */


data class EndpointOut (

    @Json(name = "url")
    val url: java.net.URI,

    @Json(name = "version")
    val version: kotlin.Int,

    @Json(name = "id")
    val id: kotlin.String,

    @Json(name = "createdAt")
    val createdAt: java.time.OffsetDateTime,

    @Json(name = "updatedAt")
    val updatedAt: java.time.OffsetDateTime,

    /* Optional unique identifier for the endpoint */
    @Json(name = "uid")
    val uid: kotlin.String? = null,

    @Json(name = "description")
    val description: kotlin.String? = "",

    @Json(name = "filterTypes")
    val filterTypes: kotlin.collections.Set<kotlin.String>? = null,

    /* List of message channels this endpoint listens to (omit for all) */
    @Json(name = "channels")
    val channels: kotlin.collections.Set<kotlin.String>? = null,

    @Json(name = "disabled")
    val disabled: kotlin.Boolean? = false,

    @Json(name = "rateLimit")
    val rateLimit: kotlin.Int? = null,

    @Json(name = "metadata")
    val metadata: kotlin.collections.Map<kotlin.String, kotlin.String>? = null

)

