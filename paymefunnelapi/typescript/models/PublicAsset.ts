/**
 * Pay Me Funnel API
 * Pay Me Funnel
 *
 * OpenAPI spec version: 0.0.59
 * Contact: team@PayMeFunnel.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { HttpFile } from '../http/http';

/**
* an asset that is publicly visible (to show funnel)
*/
export class PublicAsset {
    'url': string;
    'expiry': number;
    'previewUrl'?: string;
    'blurredUrl'?: string;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "url",
            "baseName": "url",
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
            "name": "previewUrl",
            "baseName": "previewUrl",
            "type": "string",
            "format": ""
        },
        {
            "name": "blurredUrl",
            "baseName": "blurredUrl",
            "type": "string",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return PublicAsset.attributeTypeMap;
    }

    public constructor() {
    }
}

