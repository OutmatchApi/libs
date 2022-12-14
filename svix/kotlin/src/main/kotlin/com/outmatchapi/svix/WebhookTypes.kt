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

import com.outmatchapi.svix.EndpointCreatedEvent
import com.outmatchapi.svix.EndpointDeletedEvent
import com.outmatchapi.svix.EndpointDisabledEvent
import com.outmatchapi.svix.EndpointUpdatedEvent
import com.outmatchapi.svix.MessageAttemptExhaustedEvent
import com.outmatchapi.svix.MessageAttemptFailingEvent

import com.squareup.moshi.Json

/**
 * All of the webhook types that we support
 *
 * @param a 
 * @param b 
 * @param c 
 * @param d 
 * @param e 
 * @param a1 
 */


data class WebhookTypes (

    @Json(name = "a")
    val a: EndpointDisabledEvent,

    @Json(name = "b")
    val b: EndpointCreatedEvent,

    @Json(name = "c")
    val c: EndpointUpdatedEvent,

    @Json(name = "d")
    val d: EndpointDeletedEvent,

    @Json(name = "e")
    val e: MessageAttemptExhaustedEvent,

    @Json(name = "a1")
    val a1: MessageAttemptFailingEvent

)

