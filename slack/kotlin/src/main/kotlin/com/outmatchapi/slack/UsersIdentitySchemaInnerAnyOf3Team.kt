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
 * @param domain 
 * @param id 
 * @param image102 
 * @param image132 
 * @param image230 
 * @param image34 
 * @param image44 
 * @param image68 
 * @param image88 
 * @param imageDefault 
 * @param name 
 */


data class UsersIdentitySchemaInnerAnyOf3Team (

    @Json(name = "domain")
    val domain: kotlin.String,

    @Json(name = "id")
    val id: kotlin.String,

    @Json(name = "image_102")
    val image102: kotlin.String,

    @Json(name = "image_132")
    val image132: kotlin.String,

    @Json(name = "image_230")
    val image230: kotlin.String,

    @Json(name = "image_34")
    val image34: kotlin.String,

    @Json(name = "image_44")
    val image44: kotlin.String,

    @Json(name = "image_68")
    val image68: kotlin.String,

    @Json(name = "image_88")
    val image88: kotlin.String,

    @Json(name = "image_default")
    val imageDefault: kotlin.Boolean,

    @Json(name = "name")
    val name: kotlin.String

)

