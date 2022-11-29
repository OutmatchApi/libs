export * from '../models/ApplicationIn';
export * from '../models/ApplicationOut';
export * from '../models/ApplicationTokenExpireIn';
export * from '../models/DashboardAccessOut';
export * from '../models/EndpointCreatedEvent';
export * from '../models/EndpointCreatedEventData';
export * from '../models/EndpointDeletedEvent';
export * from '../models/EndpointDeletedEventData';
export * from '../models/EndpointDisabledEvent';
export * from '../models/EndpointDisabledEventData';
export * from '../models/EndpointHeadersIn';
export * from '../models/EndpointHeadersOut';
export * from '../models/EndpointHeadersPatchIn';
export * from '../models/EndpointIn';
export * from '../models/EndpointMessageOut';
export * from '../models/EndpointOut';
export * from '../models/EndpointSecretOut';
export * from '../models/EndpointSecretRotateIn';
export * from '../models/EndpointStats';
export * from '../models/EndpointUpdate';
export * from '../models/EndpointUpdatedEvent';
export * from '../models/EndpointUpdatedEventData';
export * from '../models/EventTypeIn';
export * from '../models/EventTypeOut';
export * from '../models/EventTypeUpdate';
export * from '../models/HTTPValidationError';
export * from '../models/HttpErrorOut';
export * from '../models/IntegrationIn';
export * from '../models/IntegrationKeyOut';
export * from '../models/IntegrationOut';
export * from '../models/IntegrationUpdate';
export * from '../models/ListResponseApplicationOut';
export * from '../models/ListResponseEndpointMessageOut';
export * from '../models/ListResponseEndpointOut';
export * from '../models/ListResponseEventTypeOut';
export * from '../models/ListResponseIntegrationOut';
export * from '../models/ListResponseMessageAttemptEndpointOut';
export * from '../models/ListResponseMessageAttemptOut';
export * from '../models/ListResponseMessageEndpointOut';
export * from '../models/ListResponseMessageOut';
export * from '../models/MessageAttemptEndpointOut';
export * from '../models/MessageAttemptExhaustedEvent';
export * from '../models/MessageAttemptExhaustedEventData';
export * from '../models/MessageAttemptFailedData';
export * from '../models/MessageAttemptFailingEvent';
export * from '../models/MessageAttemptFailingEventData';
export * from '../models/MessageAttemptOut';
export * from '../models/MessageAttemptTriggerType';
export * from '../models/MessageEndpointOut';
export * from '../models/MessageIn';
export * from '../models/MessageOut';
export * from '../models/MessageStatus';
export * from '../models/RecoverIn';
export * from '../models/ReplayIn';
export * from '../models/StatusCodeClass';
export * from '../models/ValidationError';
export * from '../models/WebhookTypes';

import { ApplicationIn } from '../models/ApplicationIn';
import { ApplicationOut } from '../models/ApplicationOut';
import { ApplicationTokenExpireIn } from '../models/ApplicationTokenExpireIn';
import { DashboardAccessOut } from '../models/DashboardAccessOut';
import { EndpointCreatedEvent, EndpointCreatedEventTypeEnum    } from '../models/EndpointCreatedEvent';
import { EndpointCreatedEventData } from '../models/EndpointCreatedEventData';
import { EndpointDeletedEvent, EndpointDeletedEventTypeEnum    } from '../models/EndpointDeletedEvent';
import { EndpointDeletedEventData } from '../models/EndpointDeletedEventData';
import { EndpointDisabledEvent, EndpointDisabledEventTypeEnum    } from '../models/EndpointDisabledEvent';
import { EndpointDisabledEventData } from '../models/EndpointDisabledEventData';
import { EndpointHeadersIn } from '../models/EndpointHeadersIn';
import { EndpointHeadersOut } from '../models/EndpointHeadersOut';
import { EndpointHeadersPatchIn } from '../models/EndpointHeadersPatchIn';
import { EndpointIn } from '../models/EndpointIn';
import { EndpointMessageOut } from '../models/EndpointMessageOut';
import { EndpointOut } from '../models/EndpointOut';
import { EndpointSecretOut } from '../models/EndpointSecretOut';
import { EndpointSecretRotateIn } from '../models/EndpointSecretRotateIn';
import { EndpointStats } from '../models/EndpointStats';
import { EndpointUpdate } from '../models/EndpointUpdate';
import { EndpointUpdatedEvent, EndpointUpdatedEventTypeEnum    } from '../models/EndpointUpdatedEvent';
import { EndpointUpdatedEventData } from '../models/EndpointUpdatedEventData';
import { EventTypeIn } from '../models/EventTypeIn';
import { EventTypeOut } from '../models/EventTypeOut';
import { EventTypeUpdate } from '../models/EventTypeUpdate';
import { HTTPValidationError } from '../models/HTTPValidationError';
import { HttpErrorOut } from '../models/HttpErrorOut';
import { IntegrationIn } from '../models/IntegrationIn';
import { IntegrationKeyOut } from '../models/IntegrationKeyOut';
import { IntegrationOut } from '../models/IntegrationOut';
import { IntegrationUpdate } from '../models/IntegrationUpdate';
import { ListResponseApplicationOut } from '../models/ListResponseApplicationOut';
import { ListResponseEndpointMessageOut } from '../models/ListResponseEndpointMessageOut';
import { ListResponseEndpointOut } from '../models/ListResponseEndpointOut';
import { ListResponseEventTypeOut } from '../models/ListResponseEventTypeOut';
import { ListResponseIntegrationOut } from '../models/ListResponseIntegrationOut';
import { ListResponseMessageAttemptEndpointOut } from '../models/ListResponseMessageAttemptEndpointOut';
import { ListResponseMessageAttemptOut } from '../models/ListResponseMessageAttemptOut';
import { ListResponseMessageEndpointOut } from '../models/ListResponseMessageEndpointOut';
import { ListResponseMessageOut } from '../models/ListResponseMessageOut';
import { MessageAttemptEndpointOut } from '../models/MessageAttemptEndpointOut';
import { MessageAttemptExhaustedEvent, MessageAttemptExhaustedEventTypeEnum    } from '../models/MessageAttemptExhaustedEvent';
import { MessageAttemptExhaustedEventData } from '../models/MessageAttemptExhaustedEventData';
import { MessageAttemptFailedData } from '../models/MessageAttemptFailedData';
import { MessageAttemptFailingEvent, MessageAttemptFailingEventTypeEnum    } from '../models/MessageAttemptFailingEvent';
import { MessageAttemptFailingEventData } from '../models/MessageAttemptFailingEventData';
import { MessageAttemptOut } from '../models/MessageAttemptOut';
import { MessageAttemptTriggerType } from '../models/MessageAttemptTriggerType';
import { MessageEndpointOut } from '../models/MessageEndpointOut';
import { MessageIn } from '../models/MessageIn';
import { MessageOut } from '../models/MessageOut';
import { MessageStatus } from '../models/MessageStatus';
import { RecoverIn } from '../models/RecoverIn';
import { ReplayIn } from '../models/ReplayIn';
import { StatusCodeClass } from '../models/StatusCodeClass';
import { ValidationError } from '../models/ValidationError';
import { WebhookTypes } from '../models/WebhookTypes';

/* tslint:disable:no-unused-variable */
let primitives = [
                    "string",
                    "boolean",
                    "double",
                    "integer",
                    "long",
                    "float",
                    "number",
                    "any"
                 ];

const supportedMediaTypes: { [mediaType: string]: number } = {
  "application/json": Infinity,
  "application/octet-stream": 0,
  "application/x-www-form-urlencoded": 0
}


let enumsMap: Set<string> = new Set<string>([
    "EndpointCreatedEventTypeEnum",
    "EndpointDeletedEventTypeEnum",
    "EndpointDisabledEventTypeEnum",
    "EndpointUpdatedEventTypeEnum",
    "MessageAttemptExhaustedEventTypeEnum",
    "MessageAttemptFailingEventTypeEnum",
    "MessageAttemptTriggerType",
    "MessageStatus",
    "StatusCodeClass",
]);

let typeMap: {[index: string]: any} = {
    "ApplicationIn": ApplicationIn,
    "ApplicationOut": ApplicationOut,
    "ApplicationTokenExpireIn": ApplicationTokenExpireIn,
    "DashboardAccessOut": DashboardAccessOut,
    "EndpointCreatedEvent": EndpointCreatedEvent,
    "EndpointCreatedEventData": EndpointCreatedEventData,
    "EndpointDeletedEvent": EndpointDeletedEvent,
    "EndpointDeletedEventData": EndpointDeletedEventData,
    "EndpointDisabledEvent": EndpointDisabledEvent,
    "EndpointDisabledEventData": EndpointDisabledEventData,
    "EndpointHeadersIn": EndpointHeadersIn,
    "EndpointHeadersOut": EndpointHeadersOut,
    "EndpointHeadersPatchIn": EndpointHeadersPatchIn,
    "EndpointIn": EndpointIn,
    "EndpointMessageOut": EndpointMessageOut,
    "EndpointOut": EndpointOut,
    "EndpointSecretOut": EndpointSecretOut,
    "EndpointSecretRotateIn": EndpointSecretRotateIn,
    "EndpointStats": EndpointStats,
    "EndpointUpdate": EndpointUpdate,
    "EndpointUpdatedEvent": EndpointUpdatedEvent,
    "EndpointUpdatedEventData": EndpointUpdatedEventData,
    "EventTypeIn": EventTypeIn,
    "EventTypeOut": EventTypeOut,
    "EventTypeUpdate": EventTypeUpdate,
    "HTTPValidationError": HTTPValidationError,
    "HttpErrorOut": HttpErrorOut,
    "IntegrationIn": IntegrationIn,
    "IntegrationKeyOut": IntegrationKeyOut,
    "IntegrationOut": IntegrationOut,
    "IntegrationUpdate": IntegrationUpdate,
    "ListResponseApplicationOut": ListResponseApplicationOut,
    "ListResponseEndpointMessageOut": ListResponseEndpointMessageOut,
    "ListResponseEndpointOut": ListResponseEndpointOut,
    "ListResponseEventTypeOut": ListResponseEventTypeOut,
    "ListResponseIntegrationOut": ListResponseIntegrationOut,
    "ListResponseMessageAttemptEndpointOut": ListResponseMessageAttemptEndpointOut,
    "ListResponseMessageAttemptOut": ListResponseMessageAttemptOut,
    "ListResponseMessageEndpointOut": ListResponseMessageEndpointOut,
    "ListResponseMessageOut": ListResponseMessageOut,
    "MessageAttemptEndpointOut": MessageAttemptEndpointOut,
    "MessageAttemptExhaustedEvent": MessageAttemptExhaustedEvent,
    "MessageAttemptExhaustedEventData": MessageAttemptExhaustedEventData,
    "MessageAttemptFailedData": MessageAttemptFailedData,
    "MessageAttemptFailingEvent": MessageAttemptFailingEvent,
    "MessageAttemptFailingEventData": MessageAttemptFailingEventData,
    "MessageAttemptOut": MessageAttemptOut,
    "MessageEndpointOut": MessageEndpointOut,
    "MessageIn": MessageIn,
    "MessageOut": MessageOut,
    "RecoverIn": RecoverIn,
    "ReplayIn": ReplayIn,
    "ValidationError": ValidationError,
    "WebhookTypes": WebhookTypes,
}

export class ObjectSerializer {
    public static findCorrectType(data: any, expectedType: string) {
        if (data == undefined) {
            return expectedType;
        } else if (primitives.indexOf(expectedType.toLowerCase()) !== -1) {
            return expectedType;
        } else if (expectedType === "Date") {
            return expectedType;
        } else {
            if (enumsMap.has(expectedType)) {
                return expectedType;
            }

            if (!typeMap[expectedType]) {
                return expectedType; // w/e we don't know the type
            }

            // Check the discriminator
            let discriminatorProperty = typeMap[expectedType].discriminator;
            if (discriminatorProperty == null) {
                return expectedType; // the type does not have a discriminator. use it.
            } else {
                if (data[discriminatorProperty]) {
                    var discriminatorType = data[discriminatorProperty];
                    if(typeMap[discriminatorType]){
                        return discriminatorType; // use the type given in the discriminator
                    } else {
                        return expectedType; // discriminator did not map to a type
                    }
                } else {
                    return expectedType; // discriminator was not present (or an empty string)
                }
            }
        }
    }

    public static serialize(data: any, type: string, format: string) {
        if (data == undefined) {
            return data;
        } else if (primitives.indexOf(type.toLowerCase()) !== -1) {
            return data;
        } else if (type.lastIndexOf("Array<", 0) === 0) { // string.startsWith pre es6
            let subType: string = type.replace("Array<", ""); // Array<Type> => Type>
            subType = subType.substring(0, subType.length - 1); // Type> => Type
            let transformedData: any[] = [];
            for (let index in data) {
                let date = data[index];
                transformedData.push(ObjectSerializer.serialize(date, subType, format));
            }
            return transformedData;
        } else if (type === "Date") {
            if (format == "date") {
                let month = data.getMonth()+1
                month = month < 10 ? "0" + month.toString() : month.toString()
                let day = data.getDate();
                day = day < 10 ? "0" + day.toString() : day.toString();

                return data.getFullYear() + "-" + month + "-" + day;
            } else {
                return data.toISOString();
            }
        } else {
            if (enumsMap.has(type)) {
                return data;
            }
            if (!typeMap[type]) { // in case we dont know the type
                return data;
            }

            // Get the actual type of this object
            type = this.findCorrectType(data, type);

            // get the map for the correct type.
            let attributeTypes = typeMap[type].getAttributeTypeMap();
            let instance: {[index: string]: any} = {};
            for (let index in attributeTypes) {
                let attributeType = attributeTypes[index];
                instance[attributeType.baseName] = ObjectSerializer.serialize(data[attributeType.name], attributeType.type, attributeType.format);
            }
            return instance;
        }
    }

    public static deserialize(data: any, type: string, format: string) {
        // polymorphism may change the actual type.
        type = ObjectSerializer.findCorrectType(data, type);
        if (data == undefined) {
            return data;
        } else if (primitives.indexOf(type.toLowerCase()) !== -1) {
            return data;
        } else if (type.lastIndexOf("Array<", 0) === 0) { // string.startsWith pre es6
            let subType: string = type.replace("Array<", ""); // Array<Type> => Type>
            subType = subType.substring(0, subType.length - 1); // Type> => Type
            let transformedData: any[] = [];
            for (let index in data) {
                let date = data[index];
                transformedData.push(ObjectSerializer.deserialize(date, subType, format));
            }
            return transformedData;
        } else if (type === "Date") {
            return new Date(data);
        } else {
            if (enumsMap.has(type)) {// is Enum
                return data;
            }

            if (!typeMap[type]) { // dont know the type
                return data;
            }
            let instance = new typeMap[type]();
            let attributeTypes = typeMap[type].getAttributeTypeMap();
            for (let index in attributeTypes) {
                let attributeType = attributeTypes[index];
                let value = ObjectSerializer.deserialize(data[attributeType.baseName], attributeType.type, attributeType.format);
                if (value !== undefined) {
                    instance[attributeType.name] = value;
                }
            }
            return instance;
        }
    }


    /**
     * Normalize media type
     *
     * We currently do not handle any media types attributes, i.e. anything
     * after a semicolon. All content is assumed to be UTF-8 compatible.
     */
    public static normalizeMediaType(mediaType: string | undefined): string | undefined {
        if (mediaType === undefined) {
            return undefined;
        }
        return mediaType.split(";")[0].trim().toLowerCase();
    }

    /**
     * From a list of possible media types, choose the one we can handle best.
     *
     * The order of the given media types does not have any impact on the choice
     * made.
     */
    public static getPreferredMediaType(mediaTypes: Array<string>): string {
        /** According to OAS 3 we should default to json */
        if (!mediaTypes) {
            return "application/json";
        }

        const normalMediaTypes = mediaTypes.map(this.normalizeMediaType);
        let selectedMediaType: string | undefined = undefined;
        let selectedRank: number = -Infinity;
        for (const mediaType of normalMediaTypes) {
            if (supportedMediaTypes[mediaType!] > selectedRank) {
                selectedMediaType = mediaType;
                selectedRank = supportedMediaTypes[mediaType!];
            }
        }

        if (selectedMediaType === undefined) {
            throw new Error("None of the given media types are supported: " + mediaTypes.join(", "));
        }

        return selectedMediaType!;
    }

    /**
     * Convert data to a string according the given media type
     */
    public static stringify(data: any, mediaType: string): string {
        if (mediaType === "text/plain") {
            return String(data);
        }

        if (mediaType === "application/json") {
            return JSON.stringify(data);
        }

        throw new Error("The mediaType " + mediaType + " is not supported by ObjectSerializer.stringify.");
    }

    /**
     * Parse data from a string according to the given media type
     */
    public static parse(rawData: string, mediaType: string | undefined) {
        if (mediaType === undefined) {
            throw new Error("Cannot parse content. No Content-Type defined.");
        }

        if (mediaType === "text/plain") {
            return rawData;
        }

        if (mediaType === "application/json") {
            return JSON.parse(rawData);
        }

        if (mediaType === "text/html") {
            return rawData;
        }

        throw new Error("The mediaType " + mediaType + " is not supported by ObjectSerializer.parse.");
    }
}
