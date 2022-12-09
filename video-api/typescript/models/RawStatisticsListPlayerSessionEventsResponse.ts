/**
 * api.video
 * api.video is an API that encodes on the go to facilitate immediate playback, enhancing viewer streaming experiences across multiple devices and platforms. You can stream live or on-demand online videos within minutes.
 *
 * OpenAPI spec version: 1.0.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { Pagination } from '../models/Pagination';
import { PlayerSessionEvent } from '../models/PlayerSessionEvent';
import { HttpFile } from '../http/http';

export class RawStatisticsListPlayerSessionEventsResponse {
    'data'?: Array<PlayerSessionEvent>;
    'pagination'?: Pagination;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "data",
            "baseName": "data",
            "type": "Array<PlayerSessionEvent>",
            "format": ""
        },
        {
            "name": "pagination",
            "baseName": "pagination",
            "type": "Pagination",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return RawStatisticsListPlayerSessionEventsResponse.attributeTypeMap;
    }

    public constructor() {
    }
}

