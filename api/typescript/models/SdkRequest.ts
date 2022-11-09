/**
 * Smooth API
 * Smooth API
 *
 * OpenAPI spec version: 0.0.10
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { Language } from '../models/Language';
import { HttpFile } from '../http/http';

export class SdkRequest {
    'languages'?: Set<Language>;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "languages",
            "baseName": "languages",
            "type": "Set<Language>",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return SdkRequest.attributeTypeMap;
    }

    public constructor() {
    }
}

