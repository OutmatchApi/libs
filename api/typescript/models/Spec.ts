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

import { Logo } from '../models/Logo';
import { HttpFile } from '../http/http';

export class Spec {
    'id'?: string;
    'specType'?: string;
    'link'?: string;
    'title'?: string;
    'description'?: string;
    'version'?: string;
    'logo'?: Logo;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "id",
            "baseName": "id",
            "type": "string",
            "format": "string"
        },
        {
            "name": "specType",
            "baseName": "specType",
            "type": "string",
            "format": "string"
        },
        {
            "name": "link",
            "baseName": "link",
            "type": "string",
            "format": "string"
        },
        {
            "name": "title",
            "baseName": "title",
            "type": "string",
            "format": "string"
        },
        {
            "name": "description",
            "baseName": "description",
            "type": "string",
            "format": "string"
        },
        {
            "name": "version",
            "baseName": "version",
            "type": "string",
            "format": "string"
        },
        {
            "name": "logo",
            "baseName": "logo",
            "type": "Logo",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Spec.attributeTypeMap;
    }

    public constructor() {
    }
}

