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

package com.outmatchapi.apitest

import com.outmatchapi.apitest.EndpointOut

import com.squareup.moshi.Json

/**
 * 
 *
 * @param `data` 
 * @param done 
 * @param iterator 
 */


data class ListResponseEndpointOut (

    @Json(name = "data")
    val `data`: kotlin.collections.List<EndpointOut>,

    @Json(name = "done")
    val done: kotlin.Boolean,

    @Json(name = "iterator")
    val iterator: kotlin.String? = null

)

