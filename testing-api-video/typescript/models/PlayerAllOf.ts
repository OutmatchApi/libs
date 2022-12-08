/**
 * api.video
 * api.video is an API that encodes on the go to facilitate immediate playback, enhancing viewer streaming experiences across multiple devices and platforms. You can stream live or on-demand online videos within minutes.
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { PlayerAllOfAssets } from '../models/PlayerAllOfAssets';
import { HttpFile } from '../http/http';

export class PlayerAllOf {
    'assets'?: PlayerAllOfAssets;
    /**
    * When the player was created, presented in ISO-8601 format.
    */
    'createdAt'?: Date;
    /**
    * Deprecated
    */
    'linkActive'?: string;
    'playerId'?: string;
    /**
    * Deprecated
    */
    'shapeAspect'?: string;
    /**
    * Deprecated
    */
    'shapeBackgroundBottom'?: string;
    /**
    * Deprecated
    */
    'shapeBackgroundTop'?: string;
    /**
    * Deprecated
    */
    'shapeMargin'?: number;
    /**
    * Deprecated
    */
    'shapeRadius'?: number;
    /**
    * When the player was last updated, presented in ISO-8601 format.
    */
    'updatedAt'?: Date;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "assets",
            "baseName": "assets",
            "type": "PlayerAllOfAssets",
            "format": ""
        },
        {
            "name": "createdAt",
            "baseName": "createdAt",
            "type": "Date",
            "format": "date-time"
        },
        {
            "name": "linkActive",
            "baseName": "linkActive",
            "type": "string",
            "format": ""
        },
        {
            "name": "playerId",
            "baseName": "playerId",
            "type": "string",
            "format": ""
        },
        {
            "name": "shapeAspect",
            "baseName": "shapeAspect",
            "type": "string",
            "format": ""
        },
        {
            "name": "shapeBackgroundBottom",
            "baseName": "shapeBackgroundBottom",
            "type": "string",
            "format": ""
        },
        {
            "name": "shapeBackgroundTop",
            "baseName": "shapeBackgroundTop",
            "type": "string",
            "format": ""
        },
        {
            "name": "shapeMargin",
            "baseName": "shapeMargin",
            "type": "number",
            "format": ""
        },
        {
            "name": "shapeRadius",
            "baseName": "shapeRadius",
            "type": "number",
            "format": ""
        },
        {
            "name": "updatedAt",
            "baseName": "updatedAt",
            "type": "Date",
            "format": "date-time"
        }    ];

    static getAttributeTypeMap() {
        return PlayerAllOf.attributeTypeMap;
    }

    public constructor() {
    }
}

