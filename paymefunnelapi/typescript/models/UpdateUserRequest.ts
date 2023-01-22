/**
 * Pay Me Funnel API
 * Pay Me Funnel
 *
 * OpenAPI spec version: 0.0.54
 * Contact: team@PayMeFunnel.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { HttpFile } from '../http/http';

export class UpdateUserRequest {
    'firstName': string;
    'lastName': string;
    'instagram': string;
    'tiktok': string;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "firstName",
            "baseName": "firstName",
            "type": "string",
            "format": ""
        },
        {
            "name": "lastName",
            "baseName": "lastName",
            "type": "string",
            "format": ""
        },
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
        }    ];

    static getAttributeTypeMap() {
        return UpdateUserRequest.attributeTypeMap;
    }

    public constructor() {
    }
}

