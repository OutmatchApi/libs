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

import { HttpFile } from '../http/http';

export class Webhook {
    /**
    * When an webhook was created, presented in ISO-8601 format.
    */
    'createdAt'?: Date;
    /**
    * A list of events that will trigger the webhook.
    */
    'events'?: Array<string>;
    /**
    * URL of the webhook
    */
    'url'?: string;
    /**
    * Unique identifier of the webhook
    */
    'webhookId'?: string;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "createdAt",
            "baseName": "createdAt",
            "type": "Date",
            "format": "date-time"
        },
        {
            "name": "events",
            "baseName": "events",
            "type": "Array<string>",
            "format": ""
        },
        {
            "name": "url",
            "baseName": "url",
            "type": "string",
            "format": ""
        },
        {
            "name": "webhookId",
            "baseName": "webhookId",
            "type": "string",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Webhook.attributeTypeMap;
    }

    public constructor() {
    }
}
