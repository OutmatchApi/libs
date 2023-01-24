/**
 * Pay Me Funnel API
 * Pay Me Funnel
 *
 * OpenAPI spec version: 0.0.59
 * Contact: team@PayMeFunnel.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { HttpFile } from '../http/http';

export class UserPublic {
    'instagram'?: string;
    'tiktok'?: string;
    'publicName'?: string;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "instagram",
            "baseName": "instagram",
            "type": "string",
            "format": ""
        },
        {
            "name": "tiktok",
            "baseName": "tiktok",
            "type": "string",
            "format": ""
        },
        {
            "name": "publicName",
            "baseName": "publicName",
            "type": "string",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return UserPublic.attributeTypeMap;
    }

    public constructor() {
    }
}

