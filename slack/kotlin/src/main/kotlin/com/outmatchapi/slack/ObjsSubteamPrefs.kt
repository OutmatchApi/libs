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


import com.squareup.moshi.Json

/**
 * 
 *
 * @param channels 
 * @param groups 
 */


data class ObjsSubteamPrefs (

    @Json(name = "channels")
    val channels: kotlin.collections.List<kotlin.String>,

    @Json(name = "groups")
    val groups: kotlin.collections.List<kotlin.String>

)
