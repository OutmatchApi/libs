/**
 * Pay Me Funnel API
 * Pay Me Funnel
 *
 * OpenAPI spec version: 0.0.56
 * Contact: team@PayMeFunnel.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { HttpFile } from '../http/http';

export class StripeAccount {
    'id'?: string;
    'payoutsEnabled'?: boolean;
    'created'?: number;
    'chargesEnabled'?: boolean;
    'email'?: string;
    'detailsSubmitted'?: boolean;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "id",
            "baseName": "id",
            "type": "string",
            "format": ""
        },
        {
            "name": "payoutsEnabled",
            "baseName": "payouts_enabled",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "created",
            "baseName": "created",
            "type": "number",
            "format": ""
        },
        {
            "name": "chargesEnabled",
            "baseName": "charges_enabled",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "email",
            "baseName": "email",
            "type": "string",
            "format": ""
        },
        {
            "name": "detailsSubmitted",
            "baseName": "details_submitted",
            "type": "boolean",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return StripeAccount.attributeTypeMap;
    }

    public constructor() {
    }
}

