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

import com.outmatchapi.slack.ObjsExternalOrgMigrationsCurrentInner

import com.squareup.moshi.Json

/**
 * 
 *
 * @param current 
 * @param dateUpdated 
 */


data class ObjsExternalOrgMigrations (

    @Json(name = "current")
    val current: kotlin.collections.List<ObjsExternalOrgMigrationsCurrentInner>,

    @Json(name = "date_updated")
    val dateUpdated: kotlin.Int

)

