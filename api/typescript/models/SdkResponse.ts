/**
 * Smooth API
 * Smooth API
 *
 * OpenAPI spec version: 0.0.9
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { Sdk } from '../models/Sdk';
import { HttpFile } from '../http/http';

export class SdkResponse {
    'sdks'?: Array<Sdk>;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "sdks",
            "baseName": "sdks",
            "type": "Array<Sdk>",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return SdkResponse.attributeTypeMap;
    }

    public constructor() {
    }
}

