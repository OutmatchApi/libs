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

import com.outmatchapi.apivideo.Pagination
import com.outmatchapi.apivideo.UploadMinusToken

import com.squareup.moshi.Json

/**
 * 
 *
 * @param `data` 
 * @param pagination 
 */


data class TokenMinusListMinusResponse (

    @Json(name = "data")
    val `data`: kotlin.collections.List<UploadMinusToken>,

    @Json(name = "pagination")
    val pagination: Pagination

)
