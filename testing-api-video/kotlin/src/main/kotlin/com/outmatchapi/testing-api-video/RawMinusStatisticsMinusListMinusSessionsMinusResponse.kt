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

import com.outmatchapi.testing-api-video.Pagination
import com.outmatchapi.testing-api-video.VideoMinusSession

import com.squareup.moshi.Json

/**
 * 
 *
 * @param `data` 
 * @param pagination 
 */


data class RawMinusStatisticsMinusListMinusSessionsMinusResponse (

    @Json(name = "data")
    val `data`: kotlin.collections.List<VideoMinusSession>? = null,

    @Json(name = "pagination")
    val pagination: Pagination? = null

)

