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

package com.outmatchapi.apivideo

import com.outmatchapi.apivideo.PaginationLink

import com.squareup.moshi.Json

/**
 * 
 *
 * @param links 
 * @param currentPage The current page index.
 * @param currentPageItems The number of items on the current page.
 * @param itemsTotal Total number of items that exist.
 * @param pageSize Maximum number of item per page.
 * @param pagesTotal Number of items listed in the current page.
 */


data class Pagination (

    @Json(name = "links")
    val links: kotlin.collections.List<PaginationLink>,

    /* The current page index. */
    @Json(name = "currentPage")
    val currentPage: kotlin.Int? = null,

    /* The number of items on the current page. */
    @Json(name = "currentPageItems")
    val currentPageItems: kotlin.Int? = null,

    /* Total number of items that exist. */
    @Json(name = "itemsTotal")
    val itemsTotal: kotlin.Int? = null,

    /* Maximum number of item per page. */
    @Json(name = "pageSize")
    val pageSize: kotlin.Int? = null,

    /* Number of items listed in the current page. */
    @Json(name = "pagesTotal")
    val pagesTotal: kotlin.Int? = null

)

