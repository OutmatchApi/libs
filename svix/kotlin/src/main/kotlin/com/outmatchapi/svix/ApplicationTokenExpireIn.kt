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
 * @param expiry How many seconds until the old key is expired.
 */


data class ApplicationTokenExpireIn (

    /* How many seconds until the old key is expired. */
    @Json(name = "expiry")
    val expiry: kotlin.Int? = null

)

