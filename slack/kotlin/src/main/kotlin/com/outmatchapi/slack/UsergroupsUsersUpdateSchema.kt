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
import com.outmatchapi.slack.ObjsSubteam

import com.squareup.moshi.Json

/**
 * Schema for successful response from usergroups.users.update method
 *
 * @param ok 
 * @param usergroup 
 */


data class UsergroupsUsersUpdateSchema (

    @Json(name = "ok")
    val ok: DefsOkTrue,

    @Json(name = "usergroup")
    val usergroup: ObjsSubteam

)

