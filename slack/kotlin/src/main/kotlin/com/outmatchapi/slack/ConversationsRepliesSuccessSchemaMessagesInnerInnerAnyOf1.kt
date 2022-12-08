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

import com.outmatchapi.slack.ObjsUserProfileShort

import com.squareup.moshi.Json

/**
 * 
 *
 * @param parentUserId 
 * @param text 
 * @param threadTs 
 * @param ts 
 * @param type 
 * @param user 
 * @param isStarred 
 * @param sourceTeam 
 * @param team 
 * @param userProfile 
 * @param userTeam 
 */


data class ConversationsRepliesSuccessSchemaMessagesInnerInnerAnyOf1 (

    @Json(name = "parent_user_id")
    val parentUserId: kotlin.String,

    @Json(name = "text")
    val text: kotlin.String,

    @Json(name = "thread_ts")
    val threadTs: kotlin.String,

    @Json(name = "ts")
    val ts: kotlin.String,

    @Json(name = "type")
    val type: kotlin.String,

    @Json(name = "user")
    val user: kotlin.String,

    @Json(name = "is_starred")
    val isStarred: kotlin.Boolean? = null,

    @Json(name = "source_team")
    val sourceTeam: kotlin.String? = null,

    @Json(name = "team")
    val team: kotlin.String? = null,

    @Json(name = "user_profile")
    val userProfile: ObjsUserProfileShort? = null,

    @Json(name = "user_team")
    val userTeam: kotlin.String? = null

)
