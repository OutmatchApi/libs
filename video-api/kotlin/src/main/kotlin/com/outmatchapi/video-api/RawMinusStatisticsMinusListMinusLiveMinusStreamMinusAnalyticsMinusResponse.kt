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

import com.outmatchapi.video-api.LiveMinusStreamMinusSession
import com.outmatchapi.video-api.Pagination

import com.squareup.moshi.Json

/**
 * 
 *
 * @param `data` 
 * @param pagination 
 */


data class RawMinusStatisticsMinusListMinusLiveMinusStreamMinusAnalyticsMinusResponse (

    @Json(name = "data")
    val `data`: kotlin.collections.List<LiveMinusStreamMinusSession>? = null,

    @Json(name = "pagination")
    val pagination: Pagination? = null

)

