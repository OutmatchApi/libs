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

import com.outmatchapi.video-api.VideostatusEncoding
import com.outmatchapi.video-api.VideostatusIngest

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

