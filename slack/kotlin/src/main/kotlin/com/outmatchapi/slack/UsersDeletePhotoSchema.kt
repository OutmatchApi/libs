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
 * Schema for successful response from users.deletePhoto method
 *
 * @param ok 
 */


data class UsersDeletePhotoSchema (

    @Json(name = "ok")
    val ok: DefsOkTrue

)

