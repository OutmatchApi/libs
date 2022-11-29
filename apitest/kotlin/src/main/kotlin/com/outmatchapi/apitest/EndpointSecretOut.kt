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
 * @param key The endpoint's verification secret. If `null` is passed, a secret is automatically generated. Format: `base64` encoded random bytes optionally prefixed with `whsec_`. Recommended size: 24.
 */


data class EndpointSecretOut (

    /* The endpoint's verification secret. If `null` is passed, a secret is automatically generated. Format: `base64` encoded random bytes optionally prefixed with `whsec_`. Recommended size: 24. */
    @Json(name = "key")
    val key: kotlin.String

)

