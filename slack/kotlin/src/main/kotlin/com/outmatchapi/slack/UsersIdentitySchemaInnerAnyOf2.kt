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
import com.outmatchapi.slack.UsersIdentitySchemaInnerAnyOf2User
import com.outmatchapi.slack.UsersIdentitySchemaInnerAnyOfTeam

import com.squareup.moshi.Json

/**
 * Schema for 'identity.basic,identity.avatar' scopes
 *
 * @param ok 
 * @param team 
 * @param user 
 */


data class UsersIdentitySchemaInnerAnyOf2 (

    @Json(name = "ok")
    val ok: DefsOkTrue,

    @Json(name = "team")
    val team: UsersIdentitySchemaInnerAnyOfTeam,

    @Json(name = "user")
    val user: UsersIdentitySchemaInnerAnyOf2User

)

