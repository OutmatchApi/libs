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

import com.outmatchapi.slack.ObjsTeam

import com.squareup.moshi.Json

/**
 * 
 *
 * @param dateCreate 
 * @param id 
 * @param isActive 
 * @param name 
 * @param team 
 */


data class ConversationIMChannelObjectFromConversationsMethodsSharesInner (

    @Json(name = "date_create")
    val dateCreate: kotlin.Int,

    @Json(name = "id")
    val id: kotlin.String,

    @Json(name = "is_active")
    val isActive: kotlin.Boolean,

    @Json(name = "name")
    val name: kotlin.String,

    @Json(name = "team")
    val team: ObjsTeam

)

