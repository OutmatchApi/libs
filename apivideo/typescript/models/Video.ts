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

import { Metadata } from '../models/Metadata';
import { VideoAssets } from '../models/VideoAssets';
import { VideoSource } from '../models/VideoSource';
import { HttpFile } from '../http/http';

export class Video {
    'assets'?: VideoAssets;
    /**
    * A description for the video content. 
    */
    'description'?: string;
    /**
    * Metadata you can use to categorise and filter videos. Metadata is a list of dictionaries, where each dictionary represents a key value pair for categorising a video. [Dynamic Metadata](https://api.video/blog/endpoints/dynamic-metadata) allows you to define a key that allows any value pair. 
    */
    'metadata'?: Array<Metadata>;
    /**
    * This lets you know whether mp4 is supported. If enabled, an mp4 URL will be provided in the response for the video. 
    */
    'mp4Support'?: boolean;
    /**
    * Defines if video is panoramic. 
    */
    'panoramic'?: boolean;
    /**
    * The id of the player that will be applied on the video. 
    */
    'playerId'?: string;
    /**
    * Defines if the content is publicly reachable or if a unique token is needed for each play session. Default is true. Tutorials on [private videos](https://api.video/blog/endpoints/private-videos). 
    */
    '_public'?: boolean;
    /**
    * The date and time the API created the video. Date and time are provided using ISO-8601 UTC format.
    */
    'publishedAt'?: string;
    'source'?: VideoSource;
    /**
    * One array of tags (each tag is a string) in order to categorize a video. Tags may include spaces.  
    */
    'tags'?: Array<any>;
    /**
    * The title of the video content. 
    */
    'title'?: string;
    /**
    * The date and time the video was updated. Date and time are provided using ISO-8601 UTC format.
    */
    'updatedAt'?: Date;
    /**
    * The unique identifier of the video object.
    */
    'videoId'?: string;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "assets",
            "baseName": "assets",
            "type": "VideoAssets",
            "format": ""
        },
        {
            "name": "description",
            "baseName": "description",
            "type": "string",
            "format": ""
        },
        {
            "name": "metadata",
            "baseName": "metadata",
            "type": "Array<Metadata>",
            "format": ""
        },
        {
            "name": "mp4Support",
            "baseName": "mp4Support",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "panoramic",
            "baseName": "panoramic",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "playerId",
            "baseName": "playerId",
            "type": "string",
            "format": ""
        },
        {
            "name": "_public",
            "baseName": "public",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "publishedAt",
            "baseName": "publishedAt",
            "type": "string",
            "format": ""
        },
        {
            "name": "source",
            "baseName": "source",
            "type": "VideoSource",
            "format": ""
        },
        {
            "name": "tags",
            "baseName": "tags",
            "type": "Array<any>",
            "format": ""
        },
        {
            "name": "title",
            "baseName": "title",
            "type": "string",
            "format": ""
        },
        {
            "name": "updatedAt",
            "baseName": "updatedAt",
            "type": "Date",
            "format": "date-time"
        },
        {
            "name": "videoId",
            "baseName": "videoId",
            "type": "string",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Video.attributeTypeMap;
    }

    public constructor() {
    }
}

