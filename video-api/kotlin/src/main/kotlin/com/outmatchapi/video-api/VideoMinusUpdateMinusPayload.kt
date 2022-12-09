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

import com.outmatchapi.video-api.Metadata

import com.squareup.moshi.Json

/**
 * 
 *
 * @param description A brief description of the video.
 * @param metadata A list (array) of dictionaries where each dictionary contains a key value pair that describes the video. As with tags, you must send the complete list of metadata you want as whatever you send here will overwrite the existing metadata for the video. [Dynamic Metadata](https://api.video/blog/endpoints/dynamic-metadata) allows you to define a key that allows any value pair.
 * @param mp4Support Whether the player supports the mp4 format.
 * @param panoramic Whether the video is a 360 degree or immersive video.
 * @param playerId The unique ID for the player you want to associate with your video.
 * @param `public` Whether the video is publicly available or not. False means it is set to private. Default is true. Tutorials on [private videos](https://api.video/blog/endpoints/private-videos).
 * @param tags A list of terms or words you want to tag the video with. Make sure the list includes all the tags you want as whatever you send in this list will overwrite the existing list for the video.
 * @param title The title you want to use for your video.
 */


data class VideoMinusUpdateMinusPayload (

    /* A brief description of the video. */
    @Json(name = "description")
    val description: kotlin.String? = null,

    /* A list (array) of dictionaries where each dictionary contains a key value pair that describes the video. As with tags, you must send the complete list of metadata you want as whatever you send here will overwrite the existing metadata for the video. [Dynamic Metadata](https://api.video/blog/endpoints/dynamic-metadata) allows you to define a key that allows any value pair. */
    @Json(name = "metadata")
    val metadata: kotlin.collections.List<Metadata>? = null,

    /* Whether the player supports the mp4 format. */
    @Json(name = "mp4Support")
    val mp4Support: kotlin.Boolean? = null,

    /* Whether the video is a 360 degree or immersive video. */
    @Json(name = "panoramic")
    val panoramic: kotlin.Boolean? = null,

    /* The unique ID for the player you want to associate with your video. */
    @Json(name = "playerId")
    val playerId: kotlin.String? = null,

    /* Whether the video is publicly available or not. False means it is set to private. Default is true. Tutorials on [private videos](https://api.video/blog/endpoints/private-videos). */
    @Json(name = "public")
    val `public`: kotlin.Boolean? = null,

    /* A list of terms or words you want to tag the video with. Make sure the list includes all the tags you want as whatever you send in this list will overwrite the existing list for the video. */
    @Json(name = "tags")
    val tags: kotlin.collections.List<kotlin.String>? = null,

    /* The title you want to use for your video. */
    @Json(name = "title")
    val title: kotlin.String? = null

)

