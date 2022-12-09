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

import { VideostatusEncoding } from '../models/VideostatusEncoding';
import { VideostatusIngest } from '../models/VideostatusIngest';
import { HttpFile } from '../http/http';

export class Videostatus {
    'encoding'?: VideostatusEncoding;
    'ingest'?: VideostatusIngest;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "encoding",
            "baseName": "encoding",
            "type": "VideostatusEncoding",
            "format": ""
        },
        {
            "name": "ingest",
            "baseName": "ingest",
            "type": "VideostatusIngest",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Videostatus.attributeTypeMap;
    }

    public constructor() {
    }
}
