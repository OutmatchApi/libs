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
 * @param backgroundBottom RGBA color: bottom 50% of background. Default: rgba(0, 0, 0, .7)
 * @param backgroundText RGBA color for title text. Default: rgba(255, 255, 255, 1)
 * @param backgroundTop RGBA color: top 50% of background. Default: rgba(0, 0, 0, .7)
 * @param enableApi enable/disable player SDK access. Default: true
 * @param enableControls enable/disable player controls. Default: true
 * @param forceAutoplay enable/disable player autoplay. Default: false
 * @param forceLoop enable/disable looping. Default: false
 * @param hideTitle enable/disable title. Default: false
 * @param link RGBA color for all controls. Default: rgba(255, 255, 255, 1)
 * @param linkHover RGBA color for all controls when hovered. Default: rgba(255, 255, 255, 1)
 * @param text RGBA color for timer text. Default: rgba(255, 255, 255, 1)
 * @param trackBackground RGBA color playback bar: background. Default: rgba(255, 255, 255, .2)
 * @param trackPlayed RGBA color playback bar: played content. Default: rgba(88, 131, 255, .95)
 * @param trackUnplayed RGBA color playback bar: downloaded but unplayed (buffered) content. Default: rgba(255, 255, 255, .35)
 */


data class Playerinput (

    /* RGBA color: bottom 50% of background. Default: rgba(0, 0, 0, .7) */
    @Json(name = "backgroundBottom")
    val backgroundBottom: kotlin.String? = null,

    /* RGBA color for title text. Default: rgba(255, 255, 255, 1) */
    @Json(name = "backgroundText")
    val backgroundText: kotlin.String? = null,

    /* RGBA color: top 50% of background. Default: rgba(0, 0, 0, .7) */
    @Json(name = "backgroundTop")
    val backgroundTop: kotlin.String? = null,

    /* enable/disable player SDK access. Default: true */
    @Json(name = "enableApi")
    val enableApi: kotlin.Boolean? = true,

    /* enable/disable player controls. Default: true */
    @Json(name = "enableControls")
    val enableControls: kotlin.Boolean? = true,

    /* enable/disable player autoplay. Default: false */
    @Json(name = "forceAutoplay")
    val forceAutoplay: kotlin.Boolean? = false,

    /* enable/disable looping. Default: false */
    @Json(name = "forceLoop")
    val forceLoop: kotlin.Boolean? = false,

    /* enable/disable title. Default: false */
    @Json(name = "hideTitle")
    val hideTitle: kotlin.Boolean? = false,

    /* RGBA color for all controls. Default: rgba(255, 255, 255, 1) */
    @Json(name = "link")
    val link: kotlin.String? = null,

    /* RGBA color for all controls when hovered. Default: rgba(255, 255, 255, 1) */
    @Json(name = "linkHover")
    val linkHover: kotlin.String? = null,

    /* RGBA color for timer text. Default: rgba(255, 255, 255, 1) */
    @Json(name = "text")
    val text: kotlin.String? = null,

    /* RGBA color playback bar: background. Default: rgba(255, 255, 255, .2) */
    @Json(name = "trackBackground")
    val trackBackground: kotlin.String? = null,

    /* RGBA color playback bar: played content. Default: rgba(88, 131, 255, .95) */
    @Json(name = "trackPlayed")
    val trackPlayed: kotlin.String? = null,

    /* RGBA color playback bar: downloaded but unplayed (buffered) content. Default: rgba(255, 255, 255, .35) */
    @Json(name = "trackUnplayed")
    val trackUnplayed: kotlin.String? = null

)

