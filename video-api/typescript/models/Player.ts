/**
 * api.video
 * api.video is an API that encodes on the go to facilitate immediate playback, enhancing viewer streaming experiences across multiple devices and platforms. You can stream live or on-demand online videos within minutes.
 *
 * OpenAPI spec version: 1.0.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { PlayerAllOfAssets } from '../models/PlayerAllOfAssets';
import { HttpFile } from '../http/http';

export class Player {
    /**
    * RGBA color: bottom 50% of background. Default: rgba(0, 0, 0, .7)
    */
    'backgroundBottom'?: string;
    /**
    * RGBA color for title text. Default: rgba(255, 255, 255, 1)
    */
    'backgroundText'?: string;
    /**
    * RGBA color: top 50% of background. Default: rgba(0, 0, 0, .7)
    */
    'backgroundTop'?: string;
    /**
    * enable/disable player SDK access. Default: true
    */
    'enableApi'?: boolean;
    /**
    * enable/disable player controls. Default: true
    */
    'enableControls'?: boolean;
    /**
    * enable/disable player autoplay. Default: false
    */
    'forceAutoplay'?: boolean;
    /**
    * enable/disable looping. Default: false
    */
    'forceLoop'?: boolean;
    /**
    * enable/disable title. Default: false
    */
    'hideTitle'?: boolean;
    /**
    * RGBA color for all controls. Default: rgba(255, 255, 255, 1)
    */
    'link'?: string;
    /**
    * RGBA color for all controls when hovered. Default: rgba(255, 255, 255, 1)
    */
    'linkHover'?: string;
    /**
    * RGBA color for timer text. Default: rgba(255, 255, 255, 1)
    */
    'text'?: string;
    /**
    * RGBA color playback bar: background. Default: rgba(255, 255, 255, .2)
    */
    'trackBackground'?: string;
    /**
    * RGBA color playback bar: played content. Default: rgba(88, 131, 255, .95)
    */
    'trackPlayed'?: string;
    /**
    * RGBA color playback bar: downloaded but unplayed (buffered) content. Default: rgba(255, 255, 255, .35)
    */
    'trackUnplayed'?: string;
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
            "name": "backgroundBottom",
            "baseName": "backgroundBottom",
            "type": "string",
            "format": ""
        },
        {
            "name": "backgroundText",
            "baseName": "backgroundText",
            "type": "string",
            "format": ""
        },
        {
            "name": "backgroundTop",
            "baseName": "backgroundTop",
            "type": "string",
            "format": ""
        },
        {
            "name": "enableApi",
            "baseName": "enableApi",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "enableControls",
            "baseName": "enableControls",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "forceAutoplay",
            "baseName": "forceAutoplay",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "forceLoop",
            "baseName": "forceLoop",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "hideTitle",
            "baseName": "hideTitle",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "link",
            "baseName": "link",
            "type": "string",
            "format": ""
        },
        {
            "name": "linkHover",
            "baseName": "linkHover",
            "type": "string",
            "format": ""
        },
        {
            "name": "text",
            "baseName": "text",
            "type": "string",
            "format": ""
        },
        {
            "name": "trackBackground",
            "baseName": "trackBackground",
            "type": "string",
            "format": ""
        },
        {
            "name": "trackPlayed",
            "baseName": "trackPlayed",
            "type": "string",
            "format": ""
        },
        {
            "name": "trackUnplayed",
            "baseName": "trackUnplayed",
            "type": "string",
            "format": ""
        },
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
        return Player.attributeTypeMap;
    }

    public constructor() {
    }
}

