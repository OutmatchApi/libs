/**
 * Smooth API
 * Smooth API
 *
 * OpenAPI spec version: 0.0.13
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { HttpFile } from '../http/http';

export class Logo {
    'url'?: string;
    'altText'?: string;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "url",
            "baseName": "url",
            "type": "string",
            "format": "string"
        },
        {
            "name": "altText",
            "baseName": "altText",
            "type": "string",
            "format": "string"
        }    ];

    static getAttributeTypeMap() {
        return Logo.attributeTypeMap;
    }

    public constructor() {
    }
}

