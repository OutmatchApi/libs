/**
 * api.video
 * api.video is an API that encodes on the go to facilitate immediate playback, enhancing viewer streaming experiences across multiple devices and platforms. You can stream live or on-demand online videos within minutes.
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { PaginationLink } from '../models/PaginationLink';
import { HttpFile } from '../http/http';

export class Pagination {
    /**
    * The current page index.
    */
    'currentPage'?: number;
    /**
    * The number of items on the current page.
    */
    'currentPageItems'?: number;
    /**
    * Total number of items that exist.
    */
    'itemsTotal'?: number;
    'links': Array<PaginationLink>;
    /**
    * Maximum number of item per page.
    */
    'pageSize'?: number;
    /**
    * Number of items listed in the current page.
    */
    'pagesTotal'?: number;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "currentPage",
            "baseName": "currentPage",
            "type": "number",
            "format": ""
        },
        {
            "name": "currentPageItems",
            "baseName": "currentPageItems",
            "type": "number",
            "format": ""
        },
        {
            "name": "itemsTotal",
            "baseName": "itemsTotal",
            "type": "number",
            "format": ""
        },
        {
            "name": "links",
            "baseName": "links",
            "type": "Array<PaginationLink>",
            "format": ""
        },
        {
            "name": "pageSize",
            "baseName": "pageSize",
            "type": "number",
            "format": ""
        },
        {
            "name": "pagesTotal",
            "baseName": "pagesTotal",
            "type": "number",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Pagination.attributeTypeMap;
    }

    public constructor() {
    }
}

