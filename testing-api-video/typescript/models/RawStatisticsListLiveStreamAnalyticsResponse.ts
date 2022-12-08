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

import { LiveStreamSession } from '../models/LiveStreamSession';
import { Pagination } from '../models/Pagination';
import { HttpFile } from '../http/http';

export class RawStatisticsListLiveStreamAnalyticsResponse {
    'data'?: Array<LiveStreamSession>;
    'pagination'?: Pagination;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "data",
            "baseName": "data",
            "type": "Array<LiveStreamSession>",
            "format": ""
        },
        {
            "name": "pagination",
            "baseName": "pagination",
            "type": "Pagination",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return RawStatisticsListLiveStreamAnalyticsResponse.attributeTypeMap;
    }

    public constructor() {
    }
}
