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

import com.outmatchapi.video-api.Pagination
import com.outmatchapi.video-api.PlayerMinusSessionMinusEvent

import com.squareup.moshi.Json

/**
 * 
 *
 * @param `data` 
 * @param pagination 
 */


data class RawMinusStatisticsMinusListMinusPlayerMinusSessionMinusEventsMinusResponse (

    @Json(name = "data")
    val `data`: kotlin.collections.List<PlayerMinusSessionMinusEvent>? = null,

    @Json(name = "pagination")
    val pagination: Pagination? = null

)

