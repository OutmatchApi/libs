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

import com.outmatchapi.slack.DefsOkFalse

import com.squareup.moshi.Json

/**
 * Schema for error response users.getPresence method
 *
 * @param error 
 * @param ok 
 */


data class UsersCountsErrorSchema (

    @Json(name = "error")
    val error: kotlin.String,

    @Json(name = "ok")
    val ok: DefsOkFalse

) : kotlin.collections.HashMap<String, kotlin.Any>()
