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

import com.outmatchapi.slack.ObjsEnterpriseUser
import com.outmatchapi.slack.ObjsTeamDiscoverableInner
import com.outmatchapi.slack.ObjsUserInnerAnyOf
import com.outmatchapi.slack.ObjsUserInnerAnyOf1
import com.outmatchapi.slack.ObjsUserInnerAnyOfTeamProfile
import com.outmatchapi.slack.ObjsUserProfile

import com.squareup.moshi.Json

/**
 * 
 *
 * @param id 
 * @param isAppUser 
 * @param isBot 
 * @param name 
 * @param profile 
 * @param updated 
 * @param color refercing to bug: https://jira.tinyspeck.com/browse/EVALUE-1559
 * @param deleted 
 * @param enterpriseUser 
 * @param has2fa 
 * @param isAdmin 
 * @param isExternal 
 * @param isForgotten 
 * @param isInvitedUser 
 * @param isOwner 
 * @param isPrimaryOwner 
 * @param isRestricted 
 * @param isStranger 
 * @param isUltraRestricted 
 * @param locale 
 * @param presence 
 * @param realName 
 * @param team 
 * @param teamId 
 * @param teamProfile 
 * @param twoFactorType 
 * @param tz 
 * @param tzLabel 
 * @param tzOffset 
 * @param teams 
 */


data class ObjsUserInner (

    @Json(name = "id")
    val id: kotlin.String,

    @Json(name = "is_app_user")
    val isAppUser: kotlin.Boolean,

    @Json(name = "is_bot")
    val isBot: kotlin.Boolean,

    @Json(name = "name")
    val name: kotlin.String,

    @Json(name = "profile")
    val profile: ObjsUserProfile,

    @Json(name = "updated")
    val updated: java.math.BigDecimal,

    /* refercing to bug: https://jira.tinyspeck.com/browse/EVALUE-1559 */
    @Json(name = "color")
    val color: kotlin.String? = null,

    @Json(name = "deleted")
    val deleted: kotlin.Boolean? = null,

    @Json(name = "enterprise_user")
    val enterpriseUser: ObjsEnterpriseUser? = null,

    @Json(name = "has_2fa")
    val has2fa: kotlin.Boolean? = null,

    @Json(name = "is_admin")
    val isAdmin: kotlin.Boolean? = null,

    @Json(name = "is_external")
    val isExternal: kotlin.Boolean? = null,

    @Json(name = "is_forgotten")
    val isForgotten: kotlin.Boolean? = null,

    @Json(name = "is_invited_user")
    val isInvitedUser: kotlin.Boolean? = null,

    @Json(name = "is_owner")
    val isOwner: kotlin.Boolean? = null,

    @Json(name = "is_primary_owner")
    val isPrimaryOwner: kotlin.Boolean? = null,

    @Json(name = "is_restricted")
    val isRestricted: kotlin.Boolean? = null,

    @Json(name = "is_stranger")
    val isStranger: kotlin.Boolean? = null,

    @Json(name = "is_ultra_restricted")
    val isUltraRestricted: kotlin.Boolean? = null,

    @Json(name = "locale")
    val locale: kotlin.String? = null,

    @Json(name = "presence")
    val presence: kotlin.String? = null,

    @Json(name = "real_name")
    val realName: kotlin.String? = null,

    @Json(name = "team")
    val team: kotlin.String? = null,

    @Json(name = "team_id")
    val teamId: kotlin.String? = null,

    @Json(name = "team_profile")
    val teamProfile: ObjsUserInnerAnyOfTeamProfile? = null,

    @Json(name = "two_factor_type")
    val twoFactorType: kotlin.String? = null,

    @Json(name = "tz")
    val tz: kotlin.collections.List<ObjsTeamDiscoverableInner>? = null,

    @Json(name = "tz_label")
    val tzLabel: kotlin.String? = null,

    @Json(name = "tz_offset")
    val tzOffset: java.math.BigDecimal? = null,

    @Json(name = "teams")
    val teams: kotlin.collections.Set<kotlin.String>? = null

)

