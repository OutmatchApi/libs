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

import com.outmatchapi.svix.MessageAttemptExhaustedEventData

import com.squareup.moshi.Json

/**
 * Sent when a message delivery has failed (all of the retry attempts have been exhausted).
 *
 * @param `data` 
 * @param type 
 */


data class MessageAttemptExhaustedEvent (

    @Json(name = "data")
    val `data`: MessageAttemptExhaustedEventData,

    @Json(name = "type")
    val type: MessageAttemptExhaustedEvent.Type? = Type.messagePeriodAttemptPeriodExhausted

) {

    /**
     * 
     *
     * Values: messagePeriodAttemptPeriodExhausted
     */
    enum class Type(val value: kotlin.String) {
        @Json(name = "message.attempt.exhausted") messagePeriodAttemptPeriodExhausted("message.attempt.exhausted");
    }
}

