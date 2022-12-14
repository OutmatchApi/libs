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

package com.outmatchapi.slack

import com.outmatchapi.slack.ObjsBotProfile

import com.squareup.moshi.Json

/**
 * 
 *
 * @param botId 
 * @param team 
 * @param text 
 * @param type 
 * @param user 
 * @param botProfile 
 * @param username 
 */


data class ChatScheduleMessageSuccessSchemaMessage (

    @Json(name = "bot_id")
    val botId: kotlin.String,

    @Json(name = "team")
    val team: kotlin.String,

    @Json(name = "text")
    val text: kotlin.String,

    @Json(name = "type")
    val type: kotlin.String,

    @Json(name = "user")
    val user: kotlin.String,

    @Json(name = "bot_profile")
    val botProfile: ObjsBotProfile? = null,

    @Json(name = "username")
    val username: kotlin.String? = null

)

