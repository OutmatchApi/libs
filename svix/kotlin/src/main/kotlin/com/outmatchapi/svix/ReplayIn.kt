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
 * @param since 
 * @param until 
 */


data class ReplayIn (

    @Json(name = "since")
    val since: java.time.OffsetDateTime,

    @Json(name = "until")
    val until: java.time.OffsetDateTime? = null

)

