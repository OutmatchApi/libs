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
import com.outmatchapi.slack.RtmConnectSchemaSelf
import com.outmatchapi.slack.UsersIdentitySchemaInnerAnyOf
import com.outmatchapi.slack.UsersIdentitySchemaInnerAnyOf1
import com.outmatchapi.slack.UsersIdentitySchemaInnerAnyOf2
import com.outmatchapi.slack.UsersIdentitySchemaInnerAnyOf3
import com.outmatchapi.slack.UsersIdentitySchemaInnerAnyOf3Team

import com.squareup.moshi.Json

/**
 * 
 *
 * @param ok 
 * @param team 
 * @param user 
 */


data class UsersIdentitySchemaInner (

    @Json(name = "ok")
    val ok: DefsOkTrue,

    @Json(name = "team")
    val team: UsersIdentitySchemaInnerAnyOf3Team,

    @Json(name = "user")
    val user: RtmConnectSchemaSelf

)
