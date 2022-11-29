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

package com.outmatchapi.apitest


import com.squareup.moshi.Json

/**
 * 
 *
 * @param eventType 
 * @param payload 
 * @param id 
 * @param timestamp 
 * @param eventId Optional unique identifier for the message
 * @param channels List of free-form identifiers that endpoints can filter by
 */


data class MessageOut (

    @Json(name = "eventType")
    val eventType: kotlin.String,

    @Json(name = "payload")
    val payload: kotlin.Any,

    @Json(name = "id")
    val id: kotlin.String,

    @Json(name = "timestamp")
    val timestamp: java.time.OffsetDateTime,

    /* Optional unique identifier for the message */
    @Json(name = "eventId")
    val eventId: kotlin.String? = null,

    /* List of free-form identifiers that endpoints can filter by */
    @Json(name = "channels")
    val channels: kotlin.collections.Set<kotlin.String>? = null

)

