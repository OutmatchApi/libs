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

import com.outmatchapi.slack.AppsPermissionsResourcesListSuccessSchemaResourcesInner
import com.outmatchapi.slack.AppsPermissionsResourcesListSuccessSchemaResponseMetadata
import com.outmatchapi.slack.DefsOkTrue

import com.squareup.moshi.Json

/**
 * Schema for successful response apps.permissions.resources.list method
 *
 * @param ok 
 * @param resources 
 * @param responseMetadata 
 */


data class AppsPermissionsResourcesListSuccessSchema (

    @Json(name = "ok")
    val ok: DefsOkTrue,

    @Json(name = "resources")
    val resources: kotlin.collections.List<AppsPermissionsResourcesListSuccessSchemaResourcesInner>,

    @Json(name = "response_metadata")
    val responseMetadata: AppsPermissionsResourcesListSuccessSchemaResponseMetadata? = null

) : kotlin.collections.HashMap<String, kotlin.Any>()
