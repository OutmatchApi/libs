/**
 * Outmatch API
 * Outmatch API
 *
 * OpenAPI spec version: 0.0.24
 * Contact: internal@outmatchapi.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { Language } from '../models/Language';
import { HttpFile } from '../http/http';

export class CreateApiAppReleaseSdksRequest {
    'languages': Set<Language>;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "languages",
            "baseName": "languages",
            "type": "Set<Language>",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return CreateApiAppReleaseSdksRequest.attributeTypeMap;
    }

    public constructor() {
    }
}

