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

import { VideoSourceLiveStreamLink } from '../models/VideoSourceLiveStreamLink';
import { HttpFile } from '../http/http';

/**
* This appears if the video is from a Live Record.
*/
export class VideoSourceLiveStream {
    'links'?: Array<VideoSourceLiveStreamLink>;
    /**
    * The unique identifier for the live stream.
    */
    'liveStreamId'?: string;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "links",
            "baseName": "links",
            "type": "Array<VideoSourceLiveStreamLink>",
            "format": ""
        },
        {
            "name": "liveStreamId",
            "baseName": "liveStreamId",
            "type": "string",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return VideoSourceLiveStream.attributeTypeMap;
    }

    public constructor() {
    }
}

