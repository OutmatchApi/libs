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
 * 
 *
 * @param name The name you want to use for your live stream.
 * @param playerId The unique ID for the player associated with a live stream that you want to update.
 * @param `public` BETA FEATURE Please limit all public = false (\"private\") livestreams to 3,000 users. Whether your video can be viewed by everyone, or requires authentication to see it. A setting of false will require a unique token for each view.
 * @param record Use this to indicate whether you want the recording on or off. On is true, off is false.
 */


data class LiveMinusStreamMinusUpdateMinusPayload (

    /* The name you want to use for your live stream. */
    @Json(name = "name")
    val name: kotlin.String? = null,

    /* The unique ID for the player associated with a live stream that you want to update. */
    @Json(name = "playerId")
    val playerId: kotlin.String? = null,

    /* BETA FEATURE Please limit all public = false (\"private\") livestreams to 3,000 users. Whether your video can be viewed by everyone, or requires authentication to see it. A setting of false will require a unique token for each view. */
    @Json(name = "public")
    val `public`: kotlin.Boolean? = null,

    /* Use this to indicate whether you want the recording on or off. On is true, off is false. */
    @Json(name = "record")
    val record: kotlin.Boolean? = null

)

