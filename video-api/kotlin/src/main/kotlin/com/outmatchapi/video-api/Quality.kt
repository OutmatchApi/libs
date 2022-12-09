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


import com.squareup.moshi.Json

/**
 * 
 *
 * @param quality The quality of the video you have, in pixels. Choices include 360p, 480p, 720p, 1080p, and 2160p.
 * @param status The status of your video. Statuses include waiting - the video is waiting to be encoded. encoding - the video is in the process of being encoded. encoded - the video was successfully encoded. failed - the video failed to be encoded.
 */


data class Quality (

    /* The quality of the video you have, in pixels. Choices include 360p, 480p, 720p, 1080p, and 2160p. */
    @Json(name = "quality")
    val quality: Quality.Quality? = null,

    /* The status of your video. Statuses include waiting - the video is waiting to be encoded. encoding - the video is in the process of being encoded. encoded - the video was successfully encoded. failed - the video failed to be encoded. */
    @Json(name = "status")
    val status: Quality.Status? = null

) {

    /**
     * The quality of the video you have, in pixels. Choices include 360p, 480p, 720p, 1080p, and 2160p.
     *
     * Values: _240p,_360p,_480p,_720p,_1080p,_2160p
     */
    enum class Quality(val value: kotlin.String) {
        @Json(name = "240p") _240p("240p"),
        @Json(name = "360p") _360p("360p"),
        @Json(name = "480p") _480p("480p"),
        @Json(name = "720p") _720p("720p"),
        @Json(name = "1080p") _1080p("1080p"),
        @Json(name = "2160p") _2160p("2160p");
    }
    /**
     * The status of your video. Statuses include waiting - the video is waiting to be encoded. encoding - the video is in the process of being encoded. encoded - the video was successfully encoded. failed - the video failed to be encoded.
     *
     * Values: waiting,encoding,encoded,failed
     */
    enum class Status(val value: kotlin.String) {
        @Json(name = "waiting") waiting("waiting"),
        @Json(name = "encoding") encoding("encoding"),
        @Json(name = "encoded") encoded("encoded"),
        @Json(name = "failed") failed("failed");
    }
}

