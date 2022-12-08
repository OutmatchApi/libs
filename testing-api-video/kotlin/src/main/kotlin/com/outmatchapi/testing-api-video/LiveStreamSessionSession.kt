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
 * @param endedAt When the session ended, with the date and time presented in ISO-8601 format.
 * @param loadedAt When the session started, with the date and time presented in ISO-8601 format.
 * @param sessionId A unique identifier for your session. You can use this to track what happens during a specific session.
 */


data class LiveStreamSessionSession (

    /* When the session ended, with the date and time presented in ISO-8601 format. */
    @Json(name = "endedAt")
    val endedAt: java.time.OffsetDateTime? = null,

    /* When the session started, with the date and time presented in ISO-8601 format. */
    @Json(name = "loadedAt")
    val loadedAt: java.time.OffsetDateTime? = null,

    /* A unique identifier for your session. You can use this to track what happens during a specific session. */
    @Json(name = "sessionId")
    val sessionId: kotlin.String? = null

)

