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

import com.outmatchapi.slack.ObjsTeamProfileField

import com.squareup.moshi.Json

/**
 * 
 *
 * @param fields 
 */


data class ObjsUserInnerAnyOfTeamProfile (

    @Json(name = "fields")
    val fields: kotlin.collections.List<ObjsTeamProfileField>

)

