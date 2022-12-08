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

import com.squareup.moshi.Json

/**
 * Schema for successful response from migration.exchange method
 *
 * @param enterpriseId 
 * @param ok 
 * @param teamId 
 * @param invalidUserIds 
 * @param userIdMap 
 */


data class MigrationExchangeSuccessSchema (

    @Json(name = "enterprise_id")
    val enterpriseId: kotlin.String,

    @Json(name = "ok")
    val ok: DefsOkTrue,

    @Json(name = "team_id")
    val teamId: kotlin.String,

    @Json(name = "invalid_user_ids")
    val invalidUserIds: kotlin.collections.List<kotlin.String>? = null,

    @Json(name = "user_id_map")
    val userIdMap: kotlin.collections.Map<kotlin.String, kotlin.Any>? = null

) : kotlin.collections.HashMap<String, kotlin.Any>()

