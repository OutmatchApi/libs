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

package com.outmatchapi.svix

import com.outmatchapi.svix.EndpointDisabledEventData

import com.squareup.moshi.Json

/**
 * Sent when an endpoint has been automatically disabled after continuous failures.
 *
 * @param `data` 
 * @param type 
 */


data class EndpointDisabledEvent (

    @Json(name = "data")
    val `data`: EndpointDisabledEventData,

    @Json(name = "type")
    val type: EndpointDisabledEvent.Type? = Type.endpointPeriodDisabled

) {

    /**
     * 
     *
     * Values: endpointPeriodDisabled
     */
    enum class Type(val value: kotlin.String) {
        @Json(name = "endpoint.disabled") endpointPeriodDisabled("endpoint.disabled");
    }
}
