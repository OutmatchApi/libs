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

package com.outmatchapi.api

import com.outmatchapi.api.Spec

import com.squareup.moshi.Json

/**
 * 
 *
 * @param id 
 * @param spec 
 */


data class Release (

    @Json(name = "id")
    val id: kotlin.String,

    @Json(name = "spec")
    val spec: Spec

)
