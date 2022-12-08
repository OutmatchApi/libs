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
import com.outmatchapi.slack.ObjsResponseMetadataInner
import com.outmatchapi.slack.ObjsUserInner

import com.squareup.moshi.Json

/**
 * Schema for successful response from users.list method
 *
 * @param cacheTs 
 * @param members 
 * @param ok 
 * @param responseMetadata 
 */


data class UsersListSchema (

    @Json(name = "cache_ts")
    val cacheTs: kotlin.Int,

    @Json(name = "members")
    val members: kotlin.collections.List<kotlin.collections.List<ObjsUserInner>>,

    @Json(name = "ok")
    val ok: DefsOkTrue,

    @Json(name = "response_metadata")
    val responseMetadata: kotlin.collections.List<ObjsResponseMetadataInner>? = null

)

