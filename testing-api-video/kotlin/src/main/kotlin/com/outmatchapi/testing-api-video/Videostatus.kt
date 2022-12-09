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

import com.outmatchapi.testing-api-video.VideostatusEncoding
import com.outmatchapi.testing-api-video.VideostatusIngest

import com.squareup.moshi.Json

/**
 * 
 *
 * @param encoding 
 * @param ingest 
 */


data class Videostatus (

    @Json(name = "encoding")
    val encoding: VideostatusEncoding? = null,

    @Json(name = "ingest")
    val ingest: VideostatusIngest? = null

)
