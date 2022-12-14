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
import com.outmatchapi.slack.ObjsUserProfile

import com.squareup.moshi.Json

/**
 * Schema for successful response from users.profile.set method
 *
 * @param ok 
 * @param profile 
 * @param username 
 * @param emailPending 
 */


data class UsersProfileSetSchema (

    @Json(name = "ok")
    val ok: DefsOkTrue,

    @Json(name = "profile")
    val profile: ObjsUserProfile,

    @Json(name = "username")
    val username: kotlin.String,

    @Json(name = "email_pending")
    val emailPending: kotlin.String? = null

)

