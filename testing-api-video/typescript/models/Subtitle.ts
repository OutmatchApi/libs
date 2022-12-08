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

export class Subtitle {
    /**
    * Whether you will have subtitles or not. True for yes you will have subtitles, false for no you will not have subtitles.
    */
    '_default'?: boolean;
    'src'?: string;
    'srclang'?: string;
    'uri'?: string;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "_default",
            "baseName": "default",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "src",
            "baseName": "src",
            "type": "string",
            "format": ""
        },
        {
            "name": "srclang",
            "baseName": "srclang",
            "type": "string",
            "format": ""
        },
        {
            "name": "uri",
            "baseName": "uri",
            "type": "string",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Subtitle.attributeTypeMap;
    }

    public constructor() {
    }
}

