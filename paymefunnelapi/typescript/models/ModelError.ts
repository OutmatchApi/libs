/**
 * Pay Me Funnel API
 * Pay Me Funnel
 *
 * OpenAPI spec version: 0.0.50
 * Contact: team@PayMeFunnel.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { HttpFile } from '../http/http';

export class ModelError {
    'statusCode': number;
    'description': string;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "statusCode",
            "baseName": "statusCode",
            "type": "number",
            "format": ""
        },
        {
            "name": "description",
            "baseName": "description",
            "type": "string",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return ModelError.attributeTypeMap;
    }

    public constructor() {
    }
}

