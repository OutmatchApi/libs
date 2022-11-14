/**
 * Smooth API
 * Smooth API
 *
 * OpenAPI spec version: 0.0.18
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { Language } from '../models/Language';
import { HttpFile } from '../http/http';

export class Sdk {
    'id'?: string;
    'language'?: Language;
    'sdkVersion'?: string;
    'codeUrl'?: string;
    'packageUrl'?: string;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "id",
            "baseName": "id",
            "type": "string",
            "format": "string"
        },
        {
            "name": "language",
            "baseName": "language",
            "type": "Language",
            "format": ""
        },
        {
            "name": "sdkVersion",
            "baseName": "sdkVersion",
            "type": "string",
            "format": "string"
        },
        {
            "name": "codeUrl",
            "baseName": "codeUrl",
            "type": "string",
            "format": "string"
        },
        {
            "name": "packageUrl",
            "baseName": "packageUrl",
            "type": "string",
            "format": "string"
        }    ];

    static getAttributeTypeMap() {
        return Sdk.attributeTypeMap;
    }

    public constructor() {
    }
}

