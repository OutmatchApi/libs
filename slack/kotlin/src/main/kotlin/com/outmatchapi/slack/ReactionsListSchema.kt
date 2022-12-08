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
import com.outmatchapi.slack.ObjsPaging
import com.outmatchapi.slack.ObjsResponseMetadataInner
import com.outmatchapi.slack.ReactionsListSchemaItemsInnerInner

import com.squareup.moshi.Json

/**
 * Schema for successful response from reactions.list method
 *
 * @param items 
 * @param ok 
 * @param paging 
 * @param responseMetadata 
 */


data class ReactionsListSchema (

    @Json(name = "items")
    val items: kotlin.collections.List<kotlin.collections.List<ReactionsListSchemaItemsInnerInner>>,

    @Json(name = "ok")
    val ok: DefsOkTrue,

    @Json(name = "paging")
    val paging: ObjsPaging? = null,

    @Json(name = "response_metadata")
    val responseMetadata: kotlin.collections.List<ObjsResponseMetadataInner>? = null

)

