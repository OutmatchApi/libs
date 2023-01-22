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

import { HttpFile } from '../http/http';

export class Asset {
    'id': string;
    'name': string;
    'expiry': number;
    'type': AssetTypeEnum;
    'storageRef': string;
    'bucketName': string;
    'hideFromUser': boolean;

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
            "name": "type",
            "baseName": "type",
            "type": "AssetTypeEnum",
            "format": ""
        },
        {
            "name": "storageRef",
            "baseName": "storageRef",
            "type": "string",
            "format": ""
        },
        {
            "name": "bucketName",
            "baseName": "bucketName",
            "type": "string",
            "format": ""
        },
        {
            "name": "hideFromUser",
            "baseName": "hideFromUser",
            "type": "boolean",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Asset.attributeTypeMap;
    }

    public constructor() {
    }
}


export type AssetTypeEnum = "IMAGE" | "VIDEO" | "PDF" ;

