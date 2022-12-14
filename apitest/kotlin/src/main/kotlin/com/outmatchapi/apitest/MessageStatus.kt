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
 * The sending status of the message: - Success = 0 - Pending = 1 - Fail = 2 - Sending = 3
 *
 * Values: Success,Pending,Fail,Sending
 */

enum class MessageStatus(val value: kotlin.Int) {

    @Json(name = "0")
    Success(0),

    @Json(name = "1")
    Pending(1),

    @Json(name = "2")
    Fail(2),

    @Json(name = "3")
    Sending(3);

    /**
     * Override toString() to avoid using the enum variable name as the value, and instead use
     * the actual value defined in the API spec file.
     *
     * This solves a problem when the variable name and its value are different, and ensures that
     * the client sends the correct enum values to the server always.
     */
    override fun toString(): String = value.toString()

    companion object {
        /**
         * Converts the provided [data] to a [String] on success, null otherwise.
         */
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is MessageStatus) "$data" else null

        /**
         * Returns a valid [MessageStatus] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): MessageStatus? = data?.let {
          val normalizedData = "$it".lowercase()
          values().firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}

