/**
 * Outmatch API
 * Outmatch API
 *
 * OpenAPI spec version: 0.0.27
 * Contact: internal@outmatchapi.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { Language } from '../models/Language';
import { Status } from '../models/Status';
import { HttpFile } from '../http/http';

export class Sdk {
    'id': string;
    'language': Language;
    'sdkVersion': string;
    'codeUrl': string;
    'packageUrl': string;
    'status': Status;
    'error': string;

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
        },
        {
            "name": "status",
            "baseName": "status",
            "type": "Status",
            "format": ""
        },
        {
            "name": "error",
            "baseName": "error",
            "type": "string",
            "format": "string"
        }    ];

    static getAttributeTypeMap() {
        return Sdk.attributeTypeMap;
    }

    public constructor() {
    }
}

