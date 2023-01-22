/**
 * Pay Me Funnel API
 * Pay Me Funnel
 *
 * OpenAPI spec version: 0.0.57
 * Contact: team@PayMeFunnel.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { FunnelMetadata } from '../models/FunnelMetadata';
import { HttpFile } from '../http/http';

export class Funnel {
    'id': string;
    'name': string;
    'expiry': number;
    'metadata': FunnelMetadata;
    'type': FunnelTypeEnum;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "id",
            "baseName": "id",
            "type": "string",
            "format": ""
        },
        {
            "name": "name",
            "baseName": "name",
            "type": "string",
            "format": ""
        },
        {
            "name": "expiry",
            "baseName": "expiry",
            "type": "number",
            "format": ""
        },
        {
            "name": "metadata",
            "baseName": "metadata",
            "type": "FunnelMetadata",
            "format": ""
        },
        {
            "name": "type",
            "baseName": "type",
            "type": "FunnelTypeEnum",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Funnel.attributeTypeMap;
    }

    public constructor() {
    }
}


export type FunnelTypeEnum = "simple" ;

