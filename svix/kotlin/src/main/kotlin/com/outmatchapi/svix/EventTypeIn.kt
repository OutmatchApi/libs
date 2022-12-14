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

package com.outmatchapi.svix


import com.squareup.moshi.Json

/**
 * 
 *
 * @param description 
 * @param name 
 * @param schemas The schema for the event type for a specific version as a JSON schema.
 * @param archived 
 */


data class EventTypeIn (

    @Json(name = "description")
    val description: kotlin.String,

    @Json(name = "name")
    val name: kotlin.String,

    /* The schema for the event type for a specific version as a JSON schema. */
    @Json(name = "schemas")
    val schemas: kotlin.collections.Map<kotlin.String, kotlin.Any>? = null,

    @Json(name = "archived")
    val archived: kotlin.Boolean? = false

)

