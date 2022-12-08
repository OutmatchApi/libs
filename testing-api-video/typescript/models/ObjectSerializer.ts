export * from '../models/AccessToken';
export * from '../models/Account';
export * from '../models/AccountQuota';
export * from '../models/AuthenticatePayload';
export * from '../models/BadRequest';
export * from '../models/BytesRange';
export * from '../models/CaptionsListResponse';
export * from '../models/CaptionsUpdatePayload';
export * from '../models/Chapter';
export * from '../models/ChaptersListResponse';
export * from '../models/Link';
export * from '../models/LiveStream';
export * from '../models/LiveStreamAssets';
export * from '../models/LiveStreamCreatePayload';
export * from '../models/LiveStreamListResponse';
export * from '../models/LiveStreamSession';
export * from '../models/LiveStreamSessionClient';
export * from '../models/LiveStreamSessionDevice';
export * from '../models/LiveStreamSessionLocation';
export * from '../models/LiveStreamSessionReferrer';
export * from '../models/LiveStreamSessionSession';
export * from '../models/LiveStreamUpdatePayload';
export * from '../models/Metadata';
export * from '../models/NotFound';
export * from '../models/Pagination';
export * from '../models/PaginationLink';
export * from '../models/Player';
export * from '../models/PlayerAllOf';
export * from '../models/PlayerAllOfAssets';
export * from '../models/PlayerCreationPayload';
export * from '../models/PlayerSessionEvent';
export * from '../models/PlayerUpdatePayload';
export * from '../models/Playerinput';
export * from '../models/PlayersListResponse';
export * from '../models/Quality';
export * from '../models/RawStatisticsListLiveStreamAnalyticsResponse';
export * from '../models/RawStatisticsListPlayerSessionEventsResponse';
export * from '../models/RawStatisticsListSessionsResponse';
export * from '../models/RefreshTokenPayload';
export * from '../models/Subtitle';
export * from '../models/TokenCreatePayload';
export * from '../models/TokenListResponse';
export * from '../models/UploadToken';
export * from '../models/Video';
export * from '../models/VideoAssets';
export * from '../models/VideoCreatePayload';
export * from '../models/VideoSession';
export * from '../models/VideoSessionClient';
export * from '../models/VideoSessionDevice';
export * from '../models/VideoSessionLocation';
export * from '../models/VideoSessionOs';
export * from '../models/VideoSessionReferrer';
export * from '../models/VideoSessionSession';
export * from '../models/VideoSource';
export * from '../models/VideoSourceLiveStream';
export * from '../models/VideoSourceLiveStreamLink';
export * from '../models/VideoThumbnailPickPayload';
export * from '../models/VideoUpdatePayload';
export * from '../models/VideosListResponse';
export * from '../models/Videostatus';
export * from '../models/VideostatusEncoding';
export * from '../models/VideostatusEncodingMetadata';
export * from '../models/VideostatusIngest';
export * from '../models/Webhook';
export * from '../models/WebhooksCreatePayload';
export * from '../models/WebhooksListResponse';

import { AccessToken } from '../models/AccessToken';
import { Account } from '../models/Account';
import { AccountQuota } from '../models/AccountQuota';
import { AuthenticatePayload } from '../models/AuthenticatePayload';
import { BadRequest } from '../models/BadRequest';
import { BytesRange } from '../models/BytesRange';
import { CaptionsListResponse } from '../models/CaptionsListResponse';
import { CaptionsUpdatePayload } from '../models/CaptionsUpdatePayload';
import { Chapter } from '../models/Chapter';
import { ChaptersListResponse } from '../models/ChaptersListResponse';
import { Link } from '../models/Link';
import { LiveStream } from '../models/LiveStream';
import { LiveStreamAssets } from '../models/LiveStreamAssets';
import { LiveStreamCreatePayload } from '../models/LiveStreamCreatePayload';
import { LiveStreamListResponse } from '../models/LiveStreamListResponse';
import { LiveStreamSession } from '../models/LiveStreamSession';
import { LiveStreamSessionClient } from '../models/LiveStreamSessionClient';
import { LiveStreamSessionDevice } from '../models/LiveStreamSessionDevice';
import { LiveStreamSessionLocation } from '../models/LiveStreamSessionLocation';
import { LiveStreamSessionReferrer } from '../models/LiveStreamSessionReferrer';
import { LiveStreamSessionSession } from '../models/LiveStreamSessionSession';
import { LiveStreamUpdatePayload } from '../models/LiveStreamUpdatePayload';
import { Metadata } from '../models/Metadata';
import { NotFound } from '../models/NotFound';
import { Pagination } from '../models/Pagination';
import { PaginationLink } from '../models/PaginationLink';
import { Player } from '../models/Player';
import { PlayerAllOf } from '../models/PlayerAllOf';
import { PlayerAllOfAssets } from '../models/PlayerAllOfAssets';
import { PlayerCreationPayload } from '../models/PlayerCreationPayload';
import { PlayerSessionEvent } from '../models/PlayerSessionEvent';
import { PlayerUpdatePayload } from '../models/PlayerUpdatePayload';
import { Playerinput } from '../models/Playerinput';
import { PlayersListResponse } from '../models/PlayersListResponse';
import { Quality, QualityQualityEnum  , QualityStatusEnum   } from '../models/Quality';
import { RawStatisticsListLiveStreamAnalyticsResponse } from '../models/RawStatisticsListLiveStreamAnalyticsResponse';
import { RawStatisticsListPlayerSessionEventsResponse } from '../models/RawStatisticsListPlayerSessionEventsResponse';
import { RawStatisticsListSessionsResponse } from '../models/RawStatisticsListSessionsResponse';
import { RefreshTokenPayload } from '../models/RefreshTokenPayload';
import { Subtitle } from '../models/Subtitle';
import { TokenCreatePayload } from '../models/TokenCreatePayload';
import { TokenListResponse } from '../models/TokenListResponse';
import { UploadToken } from '../models/UploadToken';
import { Video } from '../models/Video';
import { VideoAssets } from '../models/VideoAssets';
import { VideoCreatePayload } from '../models/VideoCreatePayload';
import { VideoSession } from '../models/VideoSession';
import { VideoSessionClient } from '../models/VideoSessionClient';
import { VideoSessionDevice } from '../models/VideoSessionDevice';
import { VideoSessionLocation } from '../models/VideoSessionLocation';
import { VideoSessionOs } from '../models/VideoSessionOs';
import { VideoSessionReferrer } from '../models/VideoSessionReferrer';
import { VideoSessionSession } from '../models/VideoSessionSession';
import { VideoSource } from '../models/VideoSource';
import { VideoSourceLiveStream } from '../models/VideoSourceLiveStream';
import { VideoSourceLiveStreamLink } from '../models/VideoSourceLiveStreamLink';
import { VideoThumbnailPickPayload } from '../models/VideoThumbnailPickPayload';
import { VideoUpdatePayload } from '../models/VideoUpdatePayload';
import { VideosListResponse } from '../models/VideosListResponse';
import { Videostatus } from '../models/Videostatus';
import { VideostatusEncoding } from '../models/VideostatusEncoding';
import { VideostatusEncodingMetadata } from '../models/VideostatusEncodingMetadata';
import { VideostatusIngest  , VideostatusIngestStatusEnum   } from '../models/VideostatusIngest';
import { Webhook } from '../models/Webhook';
import { WebhooksCreatePayload } from '../models/WebhooksCreatePayload';
import { WebhooksListResponse } from '../models/WebhooksListResponse';

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
    "QualityQualityEnum",
    "QualityStatusEnum",
    "VideostatusIngestStatusEnum",
]);

let typeMap: {[index: string]: any} = {
    "AccessToken": AccessToken,
    "Account": Account,
    "AccountQuota": AccountQuota,
    "AuthenticatePayload": AuthenticatePayload,
    "BadRequest": BadRequest,
    "BytesRange": BytesRange,
    "CaptionsListResponse": CaptionsListResponse,
    "CaptionsUpdatePayload": CaptionsUpdatePayload,
    "Chapter": Chapter,
    "ChaptersListResponse": ChaptersListResponse,
    "Link": Link,
    "LiveStream": LiveStream,
    "LiveStreamAssets": LiveStreamAssets,
    "LiveStreamCreatePayload": LiveStreamCreatePayload,
    "LiveStreamListResponse": LiveStreamListResponse,
    "LiveStreamSession": LiveStreamSession,
    "LiveStreamSessionClient": LiveStreamSessionClient,
    "LiveStreamSessionDevice": LiveStreamSessionDevice,
    "LiveStreamSessionLocation": LiveStreamSessionLocation,
    "LiveStreamSessionReferrer": LiveStreamSessionReferrer,
    "LiveStreamSessionSession": LiveStreamSessionSession,
    "LiveStreamUpdatePayload": LiveStreamUpdatePayload,
    "Metadata": Metadata,
    "NotFound": NotFound,
    "Pagination": Pagination,
    "PaginationLink": PaginationLink,
    "Player": Player,
    "PlayerAllOf": PlayerAllOf,
    "PlayerAllOfAssets": PlayerAllOfAssets,
    "PlayerCreationPayload": PlayerCreationPayload,
    "PlayerSessionEvent": PlayerSessionEvent,
    "PlayerUpdatePayload": PlayerUpdatePayload,
    "Playerinput": Playerinput,
    "PlayersListResponse": PlayersListResponse,
    "Quality": Quality,
    "RawStatisticsListLiveStreamAnalyticsResponse": RawStatisticsListLiveStreamAnalyticsResponse,
    "RawStatisticsListPlayerSessionEventsResponse": RawStatisticsListPlayerSessionEventsResponse,
    "RawStatisticsListSessionsResponse": RawStatisticsListSessionsResponse,
    "RefreshTokenPayload": RefreshTokenPayload,
    "Subtitle": Subtitle,
    "TokenCreatePayload": TokenCreatePayload,
    "TokenListResponse": TokenListResponse,
    "UploadToken": UploadToken,
    "Video": Video,
    "VideoAssets": VideoAssets,
    "VideoCreatePayload": VideoCreatePayload,
    "VideoSession": VideoSession,
    "VideoSessionClient": VideoSessionClient,
    "VideoSessionDevice": VideoSessionDevice,
    "VideoSessionLocation": VideoSessionLocation,
    "VideoSessionOs": VideoSessionOs,
    "VideoSessionReferrer": VideoSessionReferrer,
    "VideoSessionSession": VideoSessionSession,
    "VideoSource": VideoSource,
    "VideoSourceLiveStream": VideoSourceLiveStream,
    "VideoSourceLiveStreamLink": VideoSourceLiveStreamLink,
    "VideoThumbnailPickPayload": VideoThumbnailPickPayload,
    "VideoUpdatePayload": VideoUpdatePayload,
    "VideosListResponse": VideosListResponse,
    "Videostatus": Videostatus,
    "VideostatusEncoding": VideostatusEncoding,
    "VideostatusEncodingMetadata": VideostatusEncodingMetadata,
    "VideostatusIngest": VideostatusIngest,
    "Webhook": Webhook,
    "WebhooksCreatePayload": WebhooksCreatePayload,
    "WebhooksListResponse": WebhooksListResponse,
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
