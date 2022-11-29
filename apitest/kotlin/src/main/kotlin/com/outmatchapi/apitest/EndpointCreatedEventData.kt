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


import com.squareup.moshi.Json

/**
 * 
 *
 * @param appId 
 * @param endpointId 
 * @param appUid Optional unique identifier for the application
 * @param endpointUid Optional unique identifier for the endpoint
 */


data class EndpointCreatedEventData (

    @Json(name = "appId")
    val appId: kotlin.String,

    @Json(name = "endpointId")
    val endpointId: kotlin.String,

    /* Optional unique identifier for the application */
    @Json(name = "appUid")
    val appUid: kotlin.String? = null,

    /* Optional unique identifier for the endpoint */
    @Json(name = "endpointUid")
    val endpointUid: kotlin.String? = null

)

