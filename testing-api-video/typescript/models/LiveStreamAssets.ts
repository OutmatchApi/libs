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

import { URI } from '../models/URI';
import { HttpFile } from '../http/http';

export class LiveStreamAssets {
    /**
    * The http live streaming (HLS) link for your live video stream.
    */
    'hls'?: URI;
    /**
    * The embed code for the iframe containing your live video stream.
    */
    'iframe'?: string;
    /**
    * A link to the video player that is playing your live stream.
    */
    'player'?: URI;
    /**
    * A link to the thumbnail for your video.
    */
    'thumbnail'?: URI;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "hls",
            "baseName": "hls",
            "type": "URI",
            "format": "uri"
        },
        {
            "name": "iframe",
            "baseName": "iframe",
            "type": "string",
            "format": ""
        },
        {
            "name": "player",
            "baseName": "player",
            "type": "URI",
            "format": "uri"
        },
        {
            "name": "thumbnail",
            "baseName": "thumbnail",
            "type": "URI",
            "format": "uri"
        }    ];

    static getAttributeTypeMap() {
        return LiveStreamAssets.attributeTypeMap;
    }

    public constructor() {
    }
}

