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

export class ReleaseRequest {
    'specString'?: string;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "specString",
            "baseName": "specString",
            "type": "string",
            "format": "string"
        }    ];

    static getAttributeTypeMap() {
        return ReleaseRequest.attributeTypeMap;
    }

    public constructor() {
    }
}

