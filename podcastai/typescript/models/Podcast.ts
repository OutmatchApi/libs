/**
 * Podcast AI
 * Podcast AI
 *
 * OpenAPI spec version: 0.0.1
 * Contact: team@podcastxxxxxxx.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { HttpFile } from '../http/http';

export class Podcast {
    'id': string;
    'url': string;
    'podcastName': string;
    'episodeName': string;
    'youtubeUrl': string;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "id",
            "baseName": "id",
            "type": "string",
            "format": "string"
        },
        {
            "name": "url",
            "baseName": "url",
            "type": "string",
            "format": ""
        },
        {
            "name": "podcastName",
            "baseName": "podcastName",
            "type": "string",
            "format": ""
        },
        {
            "name": "episodeName",
            "baseName": "episodeName",
            "type": "string",
            "format": ""
        },
        {
            "name": "youtubeUrl",
            "baseName": "youtubeUrl",
            "type": "string",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Podcast.attributeTypeMap;
    }

    public constructor() {
    }
}

