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

import { HttpFile } from '../http/http';

/**
* Collection of details about the video object that you can use to work with the video object.
*/
export class VideoAssets {
    /**
    * This is the manifest URL. For HTTP Live Streaming (HLS), when a HLS video stream is initiated, the first file to download is the manifest. This file has the extension M3U8, and provides the video player with information about the various bitrates available for streaming.
    */
    'hls'?: string;
    /**
    * Code to use video from a third party website
    */
    'iframe'?: string;
    /**
    * Available only if mp4Support is enabled. Raw mp4 url.
    */
    'mp4'?: string;
    /**
    * Raw url of the player.
    */
    'player'?: string;
    /**
    * Poster of the video.
    */
    'thumbnail'?: string;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "hls",
            "baseName": "hls",
            "type": "string",
            "format": ""
        },
        {
            "name": "iframe",
            "baseName": "iframe",
            "type": "string",
            "format": ""
        },
        {
            "name": "mp4",
            "baseName": "mp4",
            "type": "string",
            "format": ""
        },
        {
            "name": "player",
            "baseName": "player",
            "type": "string",
            "format": ""
        },
        {
            "name": "thumbnail",
            "baseName": "thumbnail",
            "type": "string",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return VideoAssets.attributeTypeMap;
    }

    public constructor() {
    }
}

