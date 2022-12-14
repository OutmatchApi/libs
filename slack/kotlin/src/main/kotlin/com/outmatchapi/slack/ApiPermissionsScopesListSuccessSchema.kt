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

import com.outmatchapi.slack.ApiPermissionsScopesListSuccessSchemaScopes
import com.outmatchapi.slack.DefsOkTrue

import com.squareup.moshi.Json

/**
 * Schema for successful response api.permissions.scopes.list method
 *
 * @param ok 
 * @param scopes 
 */


data class ApiPermissionsScopesListSuccessSchema (

    @Json(name = "ok")
    val ok: DefsOkTrue,

    @Json(name = "scopes")
    val scopes: ApiPermissionsScopesListSuccessSchemaScopes

) : kotlin.collections.HashMap<String, kotlin.Any>()

