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

import com.outmatchapi.slack.ObjsExternalOrgMigrations
import com.outmatchapi.slack.ObjsIcon
import com.outmatchapi.slack.ObjsPrimaryOwner
import com.outmatchapi.slack.ObjsTeamDiscoverableInner
import com.outmatchapi.slack.ObjsTeamSsoProvider

import com.squareup.moshi.Json

/**
 * 
 *
 * @param domain 
 * @param emailDomain 
 * @param icon 
 * @param id 
 * @param name 
 * @param archived 
 * @param avatarBaseUrl 
 * @param created 
 * @param dateCreate 
 * @param deleted 
 * @param description 
 * @param discoverable 
 * @param enterpriseId 
 * @param enterpriseName 
 * @param externalOrgMigrations 
 * @param hasComplianceExport 
 * @param isAssigned 
 * @param isEnterprise 
 * @param isOverStorageLimit 
 * @param limitTs 
 * @param locale 
 * @param messagesCount 
 * @param msgEditWindowMins 
 * @param overIntegrationsLimit 
 * @param overStorageLimit 
 * @param payProdCur 
 * @param plan 
 * @param primaryOwner 
 * @param ssoProvider 
 */


data class ObjsTeam (

    @Json(name = "domain")
    val domain: kotlin.String,

    @Json(name = "email_domain")
    val emailDomain: kotlin.String,

    @Json(name = "icon")
    val icon: ObjsIcon,

    @Json(name = "id")
    val id: kotlin.String,

    @Json(name = "name")
    val name: kotlin.String,

    @Json(name = "archived")
    val archived: kotlin.Boolean? = null,

    @Json(name = "avatar_base_url")
    val avatarBaseUrl: java.net.URI? = null,

    @Json(name = "created")
    val created: kotlin.Int? = null,

    @Json(name = "date_create")
    val dateCreate: kotlin.Int? = null,

    @Json(name = "deleted")
    val deleted: kotlin.Boolean? = null,

    @Json(name = "description")
    val description: kotlin.String? = null,

    @Json(name = "discoverable")
    val discoverable: kotlin.collections.List<ObjsTeamDiscoverableInner>? = null,

    @Json(name = "enterprise_id")
    val enterpriseId: kotlin.String? = null,

    @Json(name = "enterprise_name")
    val enterpriseName: kotlin.String? = null,

    @Json(name = "external_org_migrations")
    val externalOrgMigrations: ObjsExternalOrgMigrations? = null,

    @Json(name = "has_compliance_export")
    val hasComplianceExport: kotlin.Boolean? = null,

    @Json(name = "is_assigned")
    val isAssigned: kotlin.Boolean? = null,

    @Json(name = "is_enterprise")
    val isEnterprise: kotlin.Int? = null,

    @Json(name = "is_over_storage_limit")
    val isOverStorageLimit: kotlin.Boolean? = null,

    @Json(name = "limit_ts")
    val limitTs: kotlin.Int? = null,

    @Json(name = "locale")
    val locale: kotlin.String? = null,

    @Json(name = "messages_count")
    val messagesCount: kotlin.Int? = null,

    @Json(name = "msg_edit_window_mins")
    val msgEditWindowMins: kotlin.Int? = null,

    @Json(name = "over_integrations_limit")
    val overIntegrationsLimit: kotlin.Boolean? = null,

    @Json(name = "over_storage_limit")
    val overStorageLimit: kotlin.Boolean? = null,

    @Json(name = "pay_prod_cur")
    val payProdCur: kotlin.String? = null,

    @Json(name = "plan")
    val plan: ObjsTeam.Plan? = null,

    @Json(name = "primary_owner")
    val primaryOwner: ObjsPrimaryOwner? = null,

    @Json(name = "sso_provider")
    val ssoProvider: ObjsTeamSsoProvider? = null

) {

    /**
     * 
     *
     * Values: eMPTY,std,plus,compliance,enterprise
     */
    enum class Plan(val value: kotlin.String) {
        @Json(name = "") eMPTY(""),
        @Json(name = "std") std("std"),
        @Json(name = "plus") plus("plus"),
        @Json(name = "compliance") compliance("compliance"),
        @Json(name = "enterprise") enterprise("enterprise");
    }
}

