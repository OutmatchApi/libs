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


import com.squareup.moshi.Json

/**
 * 
 *
 * @param hls The http live streaming (HLS) link for your live video stream.
 * @param iframe The embed code for the iframe containing your live video stream.
 * @param player A link to the video player that is playing your live stream.
 * @param thumbnail A link to the thumbnail for your video.
 */


data class LiveStreamAssets (

    /* The http live streaming (HLS) link for your live video stream. */
    @Json(name = "hls")
    val hls: java.net.URI? = null,

    /* The embed code for the iframe containing your live video stream. */
    @Json(name = "iframe")
    val iframe: kotlin.String? = null,

    /* A link to the video player that is playing your live stream. */
    @Json(name = "player")
    val player: java.net.URI? = null,

    /* A link to the thumbnail for your video. */
    @Json(name = "thumbnail")
    val thumbnail: java.net.URI? = null

)

