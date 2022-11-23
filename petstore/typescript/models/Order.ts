/**
 * Swagger Petstore
 * :dog: :cat: :rabbit: This is a sample server Petstore server.  You can find out more about Swagger at [http://swagger.io](http://swagger.io) or on [irc.freenode.net, #swagger](http://swagger.io/irc/).  For this sample, you can use the api key `special-key` to test the authorization filters.
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apiteam@swagger.io
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { HttpFile } from '../http/http';

export class Order {
    'id'?: number;
    'petId'?: number;
    'quantity'?: number;
    'shipDate'?: Date;
    /**
    * Order Status
    */
    'status'?: OrderStatusEnum;
    'complete'?: boolean;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "id",
            "baseName": "id",
            "type": "number",
            "format": "int64"
        },
        {
            "name": "petId",
            "baseName": "petId",
            "type": "number",
            "format": "int64"
        },
        {
            "name": "quantity",
            "baseName": "quantity",
            "type": "number",
            "format": "int32"
        },
        {
            "name": "shipDate",
            "baseName": "shipDate",
            "type": "Date",
            "format": "date-time"
        },
        {
            "name": "status",
            "baseName": "status",
            "type": "OrderStatusEnum",
            "format": ""
        },
        {
            "name": "complete",
            "baseName": "complete",
            "type": "boolean",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Order.attributeTypeMap;
    }

    public constructor() {
    }
}


export type OrderStatusEnum = "placed" | "approved" | "delivered" ;
