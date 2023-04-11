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

export class ProcessPodcastRequest {
    'podcastName': string;
    'youtubeVideoId': string;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "podcastName",
            "baseName": "podcastName",
            "type": "string",
            "format": ""
        },
        {
            "name": "youtubeVideoId",
            "baseName": "youtubeVideoId",
            "type": "string",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return ProcessPodcastRequest.attributeTypeMap;
    }

    public constructor() {
    }
}

