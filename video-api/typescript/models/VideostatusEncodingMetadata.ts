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

export class VideostatusEncodingMetadata {
    'aspectRatio'?: string;
    /**
    * The method used to compress and decompress digital audio for your video.
    */
    'audioCodec'?: string;
    /**
    * The number of bits processed per second.
    */
    'bitrate'?: number;
    /**
    * The length of the video.
    */
    'duration'?: number;
    /**
    * The frequency with which consecutive images or frames appear on a display. Shown in this API as frames per second (fps).
    */
    'framerate'?: number;
    /**
    * The height of the video in pixels.
    */
    'height'?: number;
    /**
    * How many samples per second a digital audio system uses to record an audio signal. The higher the rate, the higher the frequencies that can be recorded. They are presented in this API using hertz.
    */
    'samplerate'?: number;
    /**
    * The method used to compress and decompress digital video. API Video supports all codecs in the libavcodec library. 
    */
    'videoCodec'?: string;
    /**
    * The width of the video in pixels.
    */
    'width'?: number;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "aspectRatio",
            "baseName": "aspectRatio",
            "type": "string",
            "format": ""
        },
        {
            "name": "audioCodec",
            "baseName": "audioCodec",
            "type": "string",
            "format": ""
        },
        {
            "name": "bitrate",
            "baseName": "bitrate",
            "type": "number",
            "format": ""
        },
        {
            "name": "duration",
            "baseName": "duration",
            "type": "number",
            "format": ""
        },
        {
            "name": "framerate",
            "baseName": "framerate",
            "type": "number",
            "format": ""
        },
        {
            "name": "height",
            "baseName": "height",
            "type": "number",
            "format": ""
        },
        {
            "name": "samplerate",
            "baseName": "samplerate",
            "type": "number",
            "format": ""
        },
        {
            "name": "videoCodec",
            "baseName": "videoCodec",
            "type": "string",
            "format": ""
        },
        {
            "name": "width",
            "baseName": "width",
            "type": "number",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return VideostatusEncodingMetadata.attributeTypeMap;
    }

    public constructor() {
    }
}

