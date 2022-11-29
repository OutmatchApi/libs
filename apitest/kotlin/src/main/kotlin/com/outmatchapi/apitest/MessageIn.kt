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
 * @param eventId Optional unique identifier for the message
 * @param channels List of free-form identifiers that endpoints can filter by
 * @param payloadRetentionPeriod The retention period for the payload (in days).
 */


data class MessageIn (

    @Json(name = "eventType")
    val eventType: kotlin.String,

    @Json(name = "payload")
    val payload: kotlin.Any,

    /* Optional unique identifier for the message */
    @Json(name = "eventId")
    val eventId: kotlin.String? = null,

    /* List of free-form identifiers that endpoints can filter by */
    @Json(name = "channels")
    val channels: kotlin.collections.Set<kotlin.String>? = null,

    /* The retention period for the payload (in days). */
    @Json(name = "payloadRetentionPeriod")
    val payloadRetentionPeriod: kotlin.Int? = 90

)
