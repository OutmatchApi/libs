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

import com.outmatchapi.slack.DefsOkTrue
import com.outmatchapi.slack.ObjsTeam

import com.squareup.moshi.Json

/**
 * Schema for successful response from team.info method
 *
 * @param ok 
 * @param team 
 */


data class TeamInfoSchema (

    @Json(name = "ok")
    val ok: DefsOkTrue,

    @Json(name = "team")
    val team: ObjsTeam

)
