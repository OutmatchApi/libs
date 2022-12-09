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


import com.squareup.moshi.Json

/**
 * What type of device the user is on when in the video session.
 *
 * @param model The specific model of the device, if known.
 * @param type What the type is like desktop, laptop, mobile.
 * @param vendor If known, what the brand of the device is, like Apple, Dell, etc.
 */


data class VideoSessionDevice (

    /* The specific model of the device, if known. */
    @Json(name = "model")
    val model: kotlin.String? = null,

    /* What the type is like desktop, laptop, mobile. */
    @Json(name = "type")
    val type: kotlin.String? = null,

    /* If known, what the brand of the device is, like Apple, Dell, etc. */
    @Json(name = "vendor")
    val vendor: kotlin.String? = null

)

