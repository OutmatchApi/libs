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

import { Spec } from '../models/Spec';
import { HttpFile } from '../http/http';

export class Release {
    'id'?: string;
    'spec'?: Spec;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "id",
            "baseName": "id",
            "type": "string",
            "format": "string"
        },
        {
            "name": "spec",
            "baseName": "spec",
            "type": "Spec",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Release.attributeTypeMap;
    }

    public constructor() {
    }
}

