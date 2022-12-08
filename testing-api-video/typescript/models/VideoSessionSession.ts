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

import { HttpFile } from '../http/http';

export class VideoSessionSession {
    /**
    * When the video session ended, presented in ISO-8601 format.
    */
    'endedAt'?: Date;
    /**
    * When the video session started, presented in ISO-8601 format.
    */
    'loadedAt'?: Date;
    /**
    * The unique identifier for the session that you can use to track what happens during it.
    */
    'sessionId'?: string;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "endedAt",
            "baseName": "endedAt",
            "type": "Date",
            "format": "date-time"
        },
        {
            "name": "loadedAt",
            "baseName": "loadedAt",
            "type": "Date",
            "format": "date-time"
        },
        {
            "name": "sessionId",
            "baseName": "sessionId",
            "type": "string",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return VideoSessionSession.attributeTypeMap;
    }

    public constructor() {
    }
}

