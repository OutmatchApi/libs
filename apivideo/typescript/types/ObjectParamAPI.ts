import { ResponseContext, RequestContext, HttpFile } from '../http/http';
import { Configuration} from '../configuration'

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
import { Quality } from '../models/Quality';
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
import { VideostatusIngest } from '../models/VideostatusIngest';
import { Webhook } from '../models/Webhook';
import { WebhooksCreatePayload } from '../models/WebhooksCreatePayload';
import { WebhooksListResponse } from '../models/WebhooksListResponse';

import { ObservableAccountApi } from "./ObservableAPI";
import { AccountApiRequestFactory, AccountApiResponseProcessor} from "../apis/AccountApi";

export interface AccountApiGETAccountRequest {
}

export class ObjectAccountApi {
    private api: ObservableAccountApi

    public constructor(configuration: Configuration, requestFactory?: AccountApiRequestFactory, responseProcessor?: AccountApiResponseProcessor) {
        this.api = new ObservableAccountApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Deprecated. Authenticate and get a token, then you can use the bearer token here to retrieve details about your account.
     * Show account
     * @param param the request object
     */
    public gETAccount(param: AccountApiGETAccountRequest = {}, options?: Configuration): Promise<Account> {
        return this.api.gETAccount( options).toPromise();
    }

}

import { ObservableAnalyticsApi } from "./ObservableAPI";
import { AnalyticsApiRequestFactory, AnalyticsApiResponseProcessor} from "../apis/AnalyticsApi";

export interface AnalyticsApiGETAnalyticsLiveStreamsLiveStreamIdRequest {
    /**
     * The unique identifier for the live stream you want to retrieve analytics for.
     * @type string
     * @memberof AnalyticsApigETAnalyticsLiveStreamsLiveStreamId
     */
    liveStreamId: string
    /**
     * Period must have one of the following formats:  - For a day : \&quot;2018-01-01\&quot;, - For a week: \&quot;2018-W01\&quot;,  - For a month: \&quot;2018-01\&quot; - For a year: \&quot;2018\&quot; For a range period:  -  Date range: \&quot;2018-01-01/2018-01-15\&quot; 
     * @type string
     * @memberof AnalyticsApigETAnalyticsLiveStreamsLiveStreamId
     */
    period?: string
    /**
     * Choose the number of search results to return per page. Minimum value: 1
     * @type number
     * @memberof AnalyticsApigETAnalyticsLiveStreamsLiveStreamId
     */
    currentPage?: number
    /**
     * Results per page. Allowed values 1-100, default is 25.
     * @type number
     * @memberof AnalyticsApigETAnalyticsLiveStreamsLiveStreamId
     */
    pageSize?: number
}

export interface AnalyticsApiGETAnalyticsSessionsSessionIdEventsRequest {
    /**
     * A unique identifier you can use to reference and track a session with.
     * @type string
     * @memberof AnalyticsApigETAnalyticsSessionsSessionIdEvents
     */
    sessionId: string
    /**
     * Choose the number of search results to return per page. Minimum value: 1
     * @type number
     * @memberof AnalyticsApigETAnalyticsSessionsSessionIdEvents
     */
    currentPage?: number
    /**
     * Results per page. Allowed values 1-100, default is 25.
     * @type number
     * @memberof AnalyticsApigETAnalyticsSessionsSessionIdEvents
     */
    pageSize?: number
}

export interface AnalyticsApiGETAnalyticsVideosVideoIdRequest {
    /**
     * The unique identifier for the video you want to retrieve session information for.
     * @type string
     * @memberof AnalyticsApigETAnalyticsVideosVideoId
     */
    videoId: string
    /**
     * Period must have one of the following formats:  - For a day : 2018-01-01, - For a week: 2018-W01,  - For a month: 2018-01 - For a year: 2018 For a range period:  -  Date range: 2018-01-01/2018-01-15 
     * @type string
     * @memberof AnalyticsApigETAnalyticsVideosVideoId
     */
    period?: string
    /**
     * Metadata and [Dynamic Metadata](https://api.video/blog/endpoints/dynamic-metadata) filter. Send an array of key value pairs you want to filter sessios with.
     * @type Array&lt;string&gt;
     * @memberof AnalyticsApigETAnalyticsVideosVideoId
     */
    metadata?: Array<string>
    /**
     * Choose the number of search results to return per page. Minimum value: 1
     * @type number
     * @memberof AnalyticsApigETAnalyticsVideosVideoId
     */
    currentPage?: number
    /**
     * Results per page. Allowed values 1-100, default is 25.
     * @type number
     * @memberof AnalyticsApigETAnalyticsVideosVideoId
     */
    pageSize?: number
}

export class ObjectAnalyticsApi {
    private api: ObservableAnalyticsApi

    public constructor(configuration: Configuration, requestFactory?: AnalyticsApiRequestFactory, responseProcessor?: AnalyticsApiResponseProcessor) {
        this.api = new ObservableAnalyticsApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * List live stream player sessions
     * @param param the request object
     */
    public gETAnalyticsLiveStreamsLiveStreamId(param: AnalyticsApiGETAnalyticsLiveStreamsLiveStreamIdRequest, options?: Configuration): Promise<RawStatisticsListLiveStreamAnalyticsResponse> {
        return this.api.gETAnalyticsLiveStreamsLiveStreamId(param.liveStreamId, param.period, param.currentPage, param.pageSize,  options).toPromise();
    }

    /**
     * Useful to track and measure video's engagement.
     * List player session events
     * @param param the request object
     */
    public gETAnalyticsSessionsSessionIdEvents(param: AnalyticsApiGETAnalyticsSessionsSessionIdEventsRequest, options?: Configuration): Promise<RawStatisticsListPlayerSessionEventsResponse> {
        return this.api.gETAnalyticsSessionsSessionIdEvents(param.sessionId, param.currentPage, param.pageSize,  options).toPromise();
    }

    /**
     * Retrieve all available user sessions for a specific video. Tutorials that use the [analytics endpoint](https://api.video/blog/endpoints/analytics).
     * List video player sessions
     * @param param the request object
     */
    public gETAnalyticsVideosVideoId(param: AnalyticsApiGETAnalyticsVideosVideoIdRequest, options?: Configuration): Promise<RawStatisticsListSessionsResponse> {
        return this.api.gETAnalyticsVideosVideoId(param.videoId, param.period, param.metadata, param.currentPage, param.pageSize,  options).toPromise();
    }

}

import { ObservableAuthenticationApi } from "./ObservableAPI";
import { AuthenticationApiRequestFactory, AuthenticationApiResponseProcessor} from "../apis/AuthenticationApi";

export interface AuthenticationApiPOSTAuthApiKeyRequest {
    /**
     * 
     * @type AuthenticatePayload
     * @memberof AuthenticationApipOSTAuthApiKey
     */
    authenticatePayload?: AuthenticatePayload
}

export interface AuthenticationApiPOSTAuthRefreshRequest {
    /**
     * 
     * @type RefreshTokenPayload
     * @memberof AuthenticationApipOSTAuthRefresh
     */
    refreshTokenPayload?: RefreshTokenPayload
}

export class ObjectAuthenticationApi {
    private api: ObservableAuthenticationApi

    public constructor(configuration: Configuration, requestFactory?: AuthenticationApiRequestFactory, responseProcessor?: AuthenticationApiResponseProcessor) {
        this.api = new ObservableAuthenticationApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * To get started, submit your API key in the body of your request. api.video returns an access token that is valid for one hour (3600 seconds). A refresh token is also returned. View a [tutorial](https://api.video/blog/tutorials/authentication-tutorial) on authentication. All tutorials using the [authentication endpoint](https://api.video/blog/endpoints/authenticate)
     * Authenticate
     * @param param the request object
     */
    public pOSTAuthApiKey(param: AuthenticationApiPOSTAuthApiKeyRequest = {}, options?: Configuration): Promise<AccessToken> {
        return this.api.pOSTAuthApiKey(param.authenticatePayload,  options).toPromise();
    }

    /**
     * Use the refresh endpoint with the refresh token you received when you first authenticated using the api-key endpoint. Send the refresh token in the body of your request. The api.video API returns a new access token that is valid for one hour (3600 seconds) and a new refresh token.  
     * Refresh token
     * @param param the request object
     */
    public pOSTAuthRefresh(param: AuthenticationApiPOSTAuthRefreshRequest = {}, options?: Configuration): Promise<AccessToken> {
        return this.api.pOSTAuthRefresh(param.refreshTokenPayload,  options).toPromise();
    }

}

import { ObservableCaptionsApi } from "./ObservableAPI";
import { CaptionsApiRequestFactory, CaptionsApiResponseProcessor} from "../apis/CaptionsApi";

export interface CaptionsApiDELETEVideosVideoIdCaptionsLanguageRequest {
    /**
     * The unique identifier for the video you want to delete a caption from.
     * @type string
     * @memberof CaptionsApidELETEVideosVideoIdCaptionsLanguage
     */
    videoId: string
    /**
     * A valid [BCP 47](https://github.com/libyal/libfwnt/wiki/Language-Code-identifiers) language representation.
     * @type string
     * @memberof CaptionsApidELETEVideosVideoIdCaptionsLanguage
     */
    language: string
}

export interface CaptionsApiGETVideosVideoIdCaptionsRequest {
    /**
     * The unique identifier for the video you want to retrieve a list of captions for.
     * @type string
     * @memberof CaptionsApigETVideosVideoIdCaptions
     */
    videoId: string
    /**
     * Choose the number of search results to return per page. Minimum value: 1
     * @type number
     * @memberof CaptionsApigETVideosVideoIdCaptions
     */
    currentPage?: number
    /**
     * Results per page. Allowed values 1-100, default is 25.
     * @type number
     * @memberof CaptionsApigETVideosVideoIdCaptions
     */
    pageSize?: number
}

export interface CaptionsApiGETVideosVideoIdCaptionsLanguageRequest {
    /**
     * The unique identifier for the video you want captions for.
     * @type string
     * @memberof CaptionsApigETVideosVideoIdCaptionsLanguage
     */
    videoId: string
    /**
     * A valid [BCP 47](https://github.com/libyal/libfwnt/wiki/Language-Code-identifiers) language representation
     * @type string
     * @memberof CaptionsApigETVideosVideoIdCaptionsLanguage
     */
    language: string
}

export interface CaptionsApiPATCHVideosVideoIdCaptionsLanguageRequest {
    /**
     * The unique identifier for the video you want to have automatic captions for. 
     * @type string
     * @memberof CaptionsApipATCHVideosVideoIdCaptionsLanguage
     */
    videoId: string
    /**
     * A valid [BCP 47](https://github.com/libyal/libfwnt/wiki/Language-Code-identifiers) language representation.
     * @type string
     * @memberof CaptionsApipATCHVideosVideoIdCaptionsLanguage
     */
    language: string
    /**
     * 
     * @type CaptionsUpdatePayload
     * @memberof CaptionsApipATCHVideosVideoIdCaptionsLanguage
     */
    captionsUpdatePayload?: CaptionsUpdatePayload
}

export interface CaptionsApiPOSTVideosVideoIdCaptionsLanguageRequest {
    /**
     * The unique identifier for the video you want to add a caption to.
     * @type string
     * @memberof CaptionsApipOSTVideosVideoIdCaptionsLanguage
     */
    videoId: string
    /**
     * A valid BCP 47 language representation.
     * @type string
     * @memberof CaptionsApipOSTVideosVideoIdCaptionsLanguage
     */
    language: string
    /**
     * The video text track (VTT) you want to upload.
     * @type HttpFile
     * @memberof CaptionsApipOSTVideosVideoIdCaptionsLanguage
     */
    file: HttpFile
}

export class ObjectCaptionsApi {
    private api: ObservableCaptionsApi

    public constructor(configuration: Configuration, requestFactory?: CaptionsApiRequestFactory, responseProcessor?: CaptionsApiResponseProcessor) {
        this.api = new ObservableCaptionsApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Delete a caption in a specific language by providing the video ID for the video you want to delete the caption from and the language the caption is in.
     * Delete a caption
     * @param param the request object
     */
    public dELETEVideosVideoIdCaptionsLanguage(param: CaptionsApiDELETEVideosVideoIdCaptionsLanguageRequest, options?: Configuration): Promise<void> {
        return this.api.dELETEVideosVideoIdCaptionsLanguage(param.videoId, param.language,  options).toPromise();
    }

    /**
     * Retrieve a list of available captions for the videoId you provide.
     * List video captions
     * @param param the request object
     */
    public gETVideosVideoIdCaptions(param: CaptionsApiGETVideosVideoIdCaptionsRequest, options?: Configuration): Promise<CaptionsListResponse> {
        return this.api.gETVideosVideoIdCaptions(param.videoId, param.currentPage, param.pageSize,  options).toPromise();
    }

    /**
     * Display a caption for a video in a specific language. If the language is available, the caption is returned. Otherwise, you will get a response indicating the caption was not found. Tutorials that use the [captions endpoint](https://api.video/blog/endpoints/captions).
     * Show a caption
     * @param param the request object
     */
    public gETVideosVideoIdCaptionsLanguage(param: CaptionsApiGETVideosVideoIdCaptionsLanguageRequest, options?: Configuration): Promise<Subtitle> {
        return this.api.gETVideosVideoIdCaptionsLanguage(param.videoId, param.language,  options).toPromise();
    }

    /**
     * To have the captions on automatically, use this PATCH to set default: true.
     * Update caption
     * @param param the request object
     */
    public pATCHVideosVideoIdCaptionsLanguage(param: CaptionsApiPATCHVideosVideoIdCaptionsLanguageRequest, options?: Configuration): Promise<Subtitle> {
        return this.api.pATCHVideosVideoIdCaptionsLanguage(param.videoId, param.language, param.captionsUpdatePayload,  options).toPromise();
    }

    /**
     * Upload a VTT file to add captions to your video.  Read our [captioning tutorial](https://api.video/blog/tutorials/adding-captions) for more details.
     * Upload a caption
     * @param param the request object
     */
    public pOSTVideosVideoIdCaptionsLanguage(param: CaptionsApiPOSTVideosVideoIdCaptionsLanguageRequest, options?: Configuration): Promise<Subtitle> {
        return this.api.pOSTVideosVideoIdCaptionsLanguage(param.videoId, param.language, param.file,  options).toPromise();
    }

}

import { ObservableChaptersApi } from "./ObservableAPI";
import { ChaptersApiRequestFactory, ChaptersApiResponseProcessor} from "../apis/ChaptersApi";

export interface ChaptersApiDELETEVideosVideoIdChaptersLanguageRequest {
    /**
     * The unique identifier for the video you want to delete a chapter from. 
     * @type string
     * @memberof ChaptersApidELETEVideosVideoIdChaptersLanguage
     */
    videoId: string
    /**
     * A valid [BCP 47](https://github.com/libyal/libfwnt/wiki/Language-Code-identifiers) language representation.
     * @type string
     * @memberof ChaptersApidELETEVideosVideoIdChaptersLanguage
     */
    language: string
}

export interface ChaptersApiGETVideosVideoIdChaptersRequest {
    /**
     * The unique identifier for the video you want to retrieve a list of chapters for.
     * @type string
     * @memberof ChaptersApigETVideosVideoIdChapters
     */
    videoId: string
    /**
     * Choose the number of search results to return per page. Minimum value: 1
     * @type number
     * @memberof ChaptersApigETVideosVideoIdChapters
     */
    currentPage?: number
    /**
     * Results per page. Allowed values 1-100, default is 25.
     * @type number
     * @memberof ChaptersApigETVideosVideoIdChapters
     */
    pageSize?: number
}

export interface ChaptersApiGETVideosVideoIdChaptersLanguageRequest {
    /**
     * The unique identifier for the video you want to show a chapter for.
     * @type string
     * @memberof ChaptersApigETVideosVideoIdChaptersLanguage
     */
    videoId: string
    /**
     * A valid [BCP 47](https://github.com/libyal/libfwnt/wiki/Language-Code-identifiers) language representation.
     * @type string
     * @memberof ChaptersApigETVideosVideoIdChaptersLanguage
     */
    language: string
}

export interface ChaptersApiPOSTVideosVideoIdChaptersLanguageRequest {
    /**
     * The unique identifier for the video you want to upload a chapter for.
     * @type string
     * @memberof ChaptersApipOSTVideosVideoIdChaptersLanguage
     */
    videoId: string
    /**
     * A valid [BCP 47](https://github.com/libyal/libfwnt/wiki/Language-Code-identifiers) language representation.
     * @type string
     * @memberof ChaptersApipOSTVideosVideoIdChaptersLanguage
     */
    language: string
    /**
     * The VTT file describing the chapters you want to upload.
     * @type HttpFile
     * @memberof ChaptersApipOSTVideosVideoIdChaptersLanguage
     */
    file: HttpFile
}

export class ObjectChaptersApi {
    private api: ObservableChaptersApi

    public constructor(configuration: Configuration, requestFactory?: ChaptersApiRequestFactory, responseProcessor?: ChaptersApiResponseProcessor) {
        this.api = new ObservableChaptersApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Delete a chapter
     * @param param the request object
     */
    public dELETEVideosVideoIdChaptersLanguage(param: ChaptersApiDELETEVideosVideoIdChaptersLanguageRequest, options?: Configuration): Promise<void> {
        return this.api.dELETEVideosVideoIdChaptersLanguage(param.videoId, param.language,  options).toPromise();
    }

    /**
     * Retrieve a list of all chapters for a specified video.
     * List video chapters
     * @param param the request object
     */
    public gETVideosVideoIdChapters(param: ChaptersApiGETVideosVideoIdChaptersRequest, options?: Configuration): Promise<ChaptersListResponse> {
        return this.api.gETVideosVideoIdChapters(param.videoId, param.currentPage, param.pageSize,  options).toPromise();
    }

    /**
     * Chapters help your viewers find the sections of the video they are most interested in viewing. Tutorials that use the [chapters endpoint](https://api.video/blog/endpoints/chapters).
     * Show a chapter
     * @param param the request object
     */
    public gETVideosVideoIdChaptersLanguage(param: ChaptersApiGETVideosVideoIdChaptersLanguageRequest, options?: Configuration): Promise<Chapter> {
        return this.api.gETVideosVideoIdChaptersLanguage(param.videoId, param.language,  options).toPromise();
    }

    /**
     * Chapters help break the video into sections. Read our [tutorial](https://api.video/blog/tutorials/adding-chapters-to-your-videos) for more details.
     * Upload a chapter
     * @param param the request object
     */
    public pOSTVideosVideoIdChaptersLanguage(param: ChaptersApiPOSTVideosVideoIdChaptersLanguageRequest, options?: Configuration): Promise<Chapter> {
        return this.api.pOSTVideosVideoIdChaptersLanguage(param.videoId, param.language, param.file,  options).toPromise();
    }

}

import { ObservableLiveApi } from "./ObservableAPI";
import { LiveApiRequestFactory, LiveApiResponseProcessor} from "../apis/LiveApi";

export interface LiveApiDELETELiveStreamsLiveStreamIdRequest {
    /**
     * The unique ID for the live stream that you want to remove.
     * @type string
     * @memberof LiveApidELETELiveStreamsLiveStreamId
     */
    liveStreamId: string
}

export interface LiveApiDELETELiveStreamsLiveStreamIdThumbnailRequest {
    /**
     * The unique identifier for the live stream you want to delete. 
     * @type string
     * @memberof LiveApidELETELiveStreamsLiveStreamIdThumbnail
     */
    liveStreamId: string
}

export interface LiveApiGETLiveStreamsRequest {
    /**
     * The unique stream key that allows you to stream videos.
     * @type string
     * @memberof LiveApigETLiveStreams
     */
    streamKey?: string
    /**
     * You can filter live streams by their name or a part of their name.
     * @type string
     * @memberof LiveApigETLiveStreams
     */
    name?: string
    /**
     * Allowed: createdAt, publishedAt, name. createdAt - the time a livestream was created using the specified streamKey. publishedAt - the time a livestream was published using the specified streamKey. name - the name of the livestream. If you choose one of the time based options, the time is presented in ISO-8601 format.
     * @type string
     * @memberof LiveApigETLiveStreams
     */
    sortBy?: string
    /**
     * Allowed: asc, desc. Ascending for date and time means that earlier values precede later ones. Descending means that later values preced earlier ones. For title, it is 0-9 and A-Z ascending and Z-A, 9-0 descending.
     * @type &#39;asc&#39; | &#39;desc&#39;
     * @memberof LiveApigETLiveStreams
     */
    sortOrder?: 'asc' | 'desc'
    /**
     * Choose the number of search results to return per page. Minimum value: 1
     * @type number
     * @memberof LiveApigETLiveStreams
     */
    currentPage?: number
    /**
     * Results per page. Allowed values 1-100, default is 25.
     * @type number
     * @memberof LiveApigETLiveStreams
     */
    pageSize?: number
}

export interface LiveApiGETLiveStreamsLiveStreamIdRequest {
    /**
     * The unique ID for the live stream you want to watch.
     * @type string
     * @memberof LiveApigETLiveStreamsLiveStreamId
     */
    liveStreamId: string
}

export interface LiveApiPATCHLiveStreamsLiveStreamIdRequest {
    /**
     * The unique ID for the live stream that you want to update information for such as player details, or whether you want the recording on or off.
     * @type string
     * @memberof LiveApipATCHLiveStreamsLiveStreamId
     */
    liveStreamId: string
    /**
     * 
     * @type LiveStreamUpdatePayload
     * @memberof LiveApipATCHLiveStreamsLiveStreamId
     */
    liveStreamUpdatePayload?: LiveStreamUpdatePayload
}

export interface LiveApiPOSTLiveStreamsRequest {
    /**
     * 
     * @type LiveStreamCreatePayload
     * @memberof LiveApipOSTLiveStreams
     */
    liveStreamCreatePayload?: LiveStreamCreatePayload
}

export interface LiveApiPOSTLiveStreamsLiveStreamIdThumbnailRequest {
    /**
     * The unique ID for the live stream you want to upload.
     * @type string
     * @memberof LiveApipOSTLiveStreamsLiveStreamIdThumbnail
     */
    liveStreamId: string
    /**
     * The image to be added as a thumbnail.
     * @type HttpFile
     * @memberof LiveApipOSTLiveStreamsLiveStreamIdThumbnail
     */
    file: HttpFile
}

export class ObjectLiveApi {
    private api: ObservableLiveApi

    public constructor(configuration: Configuration, requestFactory?: LiveApiRequestFactory, responseProcessor?: LiveApiResponseProcessor) {
        this.api = new ObservableLiveApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Delete a live stream
     * @param param the request object
     */
    public dELETELiveStreamsLiveStreamId(param: LiveApiDELETELiveStreamsLiveStreamIdRequest, options?: Configuration): Promise<void> {
        return this.api.dELETELiveStreamsLiveStreamId(param.liveStreamId,  options).toPromise();
    }

    /**
     * Send the unique identifier for a live stream to delete it from the system.
     * Delete a thumbnail
     * @param param the request object
     */
    public dELETELiveStreamsLiveStreamIdThumbnail(param: LiveApiDELETELiveStreamsLiveStreamIdThumbnailRequest, options?: Configuration): Promise<LiveStream> {
        return this.api.dELETELiveStreamsLiveStreamIdThumbnail(param.liveStreamId,  options).toPromise();
    }

    /**
     * With no parameters added to the url, this will return all livestreams. Query by name or key to limit the list.
     * List all live streams
     * @param param the request object
     */
    public gETLiveStreams(param: LiveApiGETLiveStreamsRequest = {}, options?: Configuration): Promise<LiveStreamListResponse> {
        return this.api.gETLiveStreams(param.streamKey, param.name, param.sortBy, param.sortOrder, param.currentPage, param.pageSize,  options).toPromise();
    }

    /**
     * Supply a LivestreamId, and you'll get all the details for streaming into, and watching the livestream. Tutorials that use the [show livestream endpoint](https://api.video/blog/endpoints/live-stream-status).
     * Show live stream
     * @param param the request object
     */
    public gETLiveStreamsLiveStreamId(param: LiveApiGETLiveStreamsLiveStreamIdRequest, options?: Configuration): Promise<LiveStream> {
        return this.api.gETLiveStreamsLiveStreamId(param.liveStreamId,  options).toPromise();
    }

    /**
     * Use this endpoint to update the player, or to turn recording on/off (saving a copy of the livestream). NOTE: If the livestream is actively streaming, changing the recording status will only affect the NEXT stream.    The public=false 'private livestream' is available as a BETA feature, and should be limited to livestreams of 3,000 viewers or fewer.
     * Update a live stream
     * @param param the request object
     */
    public pATCHLiveStreamsLiveStreamId(param: LiveApiPATCHLiveStreamsLiveStreamIdRequest, options?: Configuration): Promise<LiveStream> {
        return this.api.pATCHLiveStreamsLiveStreamId(param.liveStreamId, param.liveStreamUpdatePayload,  options).toPromise();
    }

    /**
     * A live stream will give you the 'connection point' to RTMP your video stream to api.video. It will also give you the details for viewers to watch the same livestream.  The public=false 'private livestream' is available as a BETA feature, and should be limited to livestreams of 3,000 viewers or fewer. See our [Live Stream Tutorial](https://api.video/blog/tutorials/live-stream-tutorial) for a walkthrough of this API with OBS. Your RTMP endpoint for the livestream is rtmp://broadcast.api.video/s/{streamKey} Tutorials that [create live streams](https://api.video/blog/endpoints/live-create).
     * Create live stream
     * @param param the request object
     */
    public pOSTLiveStreams(param: LiveApiPOSTLiveStreamsRequest = {}, options?: Configuration): Promise<LiveStream> {
        return this.api.pOSTLiveStreams(param.liveStreamCreatePayload,  options).toPromise();
    }

    /**
     * Upload an image to use as a backdrop for your livestream. Tutorials that [update live stream thumbnails](https://api.video/blog/endpoints/live-upload-a-thumbnail).
     * Upload a thumbnail
     * @param param the request object
     */
    public pOSTLiveStreamsLiveStreamIdThumbnail(param: LiveApiPOSTLiveStreamsLiveStreamIdThumbnailRequest, options?: Configuration): Promise<LiveStream> {
        return this.api.pOSTLiveStreamsLiveStreamIdThumbnail(param.liveStreamId, param.file,  options).toPromise();
    }

}

import { ObservablePlayersApi } from "./ObservableAPI";
import { PlayersApiRequestFactory, PlayersApiResponseProcessor} from "../apis/PlayersApi";

export interface PlayersApiDELETEPlayersPlayerIdRequest {
    /**
     * The unique identifier for the player you want to delete.
     * @type string
     * @memberof PlayersApidELETEPlayersPlayerId
     */
    playerId: string
}

export interface PlayersApiDELETEPlayersPlayerIdLogoRequest {
    /**
     * The unique identifier for the player.
     * @type string
     * @memberof PlayersApidELETEPlayersPlayerIdLogo
     */
    playerId: string
}

export interface PlayersApiGETPlayersRequest {
    /**
     * createdAt is the time the player was created. updatedAt is the time the player was last updated. The time is presented in ISO-8601 format.
     * @type &#39;createdAt&#39; | &#39;updatedAt&#39;
     * @memberof PlayersApigETPlayers
     */
    sortBy?: 'createdAt' | 'updatedAt'
    /**
     * Allowed: asc, desc. Ascending for date and time means that earlier values precede later ones. Descending means that later values preced earlier ones.
     * @type &#39;asc&#39; | &#39;desc&#39;
     * @memberof PlayersApigETPlayers
     */
    sortOrder?: 'asc' | 'desc'
    /**
     * Choose the number of search results to return per page. Minimum value: 1
     * @type number
     * @memberof PlayersApigETPlayers
     */
    currentPage?: number
    /**
     * Results per page. Allowed values 1-100, default is 25.
     * @type number
     * @memberof PlayersApigETPlayers
     */
    pageSize?: number
}

export interface PlayersApiGETPlayersPlayerIdRequest {
    /**
     * The unique identifier for the player you want to retrieve. 
     * @type string
     * @memberof PlayersApigETPlayersPlayerId
     */
    playerId: string
}

export interface PlayersApiPATCHPlayersPlayerIdRequest {
    /**
     * The unique identifier for the player.
     * @type string
     * @memberof PlayersApipATCHPlayersPlayerId
     */
    playerId: string
    /**
     * 
     * @type PlayerUpdatePayload
     * @memberof PlayersApipATCHPlayersPlayerId
     */
    playerUpdatePayload: PlayerUpdatePayload
}

export interface PlayersApiPOSTPlayersRequest {
    /**
     * 
     * @type PlayerCreationPayload
     * @memberof PlayersApipOSTPlayers
     */
    playerCreationPayload: PlayerCreationPayload
}

export interface PlayersApiPOSTPlayersPlayerIdLogoRequest {
    /**
     * The unique identifier for the player.
     * @type string
     * @memberof PlayersApipOSTPlayersPlayerIdLogo
     */
    playerId: string
    /**
     * The name of the file you want to use for your logo.
     * @type HttpFile
     * @memberof PlayersApipOSTPlayersPlayerIdLogo
     */
    file: HttpFile
    /**
     * The path to the file you want to upload and use as a logo.
     * @type string
     * @memberof PlayersApipOSTPlayersPlayerIdLogo
     */
    link: string
}

export class ObjectPlayersApi {
    private api: ObservablePlayersApi

    public constructor(configuration: Configuration, requestFactory?: PlayersApiRequestFactory, responseProcessor?: PlayersApiResponseProcessor) {
        this.api = new ObservablePlayersApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Delete a player if you no longer need it. You can delete any player that you have the player ID for.
     * Delete a player
     * @param param the request object
     */
    public dELETEPlayersPlayerId(param: PlayersApiDELETEPlayersPlayerIdRequest, options?: Configuration): Promise<void> {
        return this.api.dELETEPlayersPlayerId(param.playerId,  options).toPromise();
    }

    /**
     * Delete logo
     * @param param the request object
     */
    public dELETEPlayersPlayerIdLogo(param: PlayersApiDELETEPlayersPlayerIdLogoRequest, options?: Configuration): Promise<any> {
        return this.api.dELETEPlayersPlayerIdLogo(param.playerId,  options).toPromise();
    }

    /**
     * Retrieve a list of all the players you created, as well as details about each one. Tutorials that use the [player endpoint](https://api.video/blog/endpoints/player).
     * List all players
     * @param param the request object
     */
    public gETPlayers(param: PlayersApiGETPlayersRequest = {}, options?: Configuration): Promise<PlayersListResponse> {
        return this.api.gETPlayers(param.sortBy, param.sortOrder, param.currentPage, param.pageSize,  options).toPromise();
    }

    /**
     * Use a player ID to retrieve details about the player and display it for viewers.
     * Show a player
     * @param param the request object
     */
    public gETPlayersPlayerId(param: PlayersApiGETPlayersPlayerIdRequest, options?: Configuration): Promise<Player> {
        return this.api.gETPlayersPlayerId(param.playerId,  options).toPromise();
    }

    /**
     * Use a player ID to update specific details for a player. NOTE: It may take up to 10 min before the new player configuration is available from our CDN.
     * Update a player
     * @param param the request object
     */
    public pATCHPlayersPlayerId(param: PlayersApiPATCHPlayersPlayerIdRequest, options?: Configuration): Promise<Player> {
        return this.api.pATCHPlayersPlayerId(param.playerId, param.playerUpdatePayload,  options).toPromise();
    }

    /**
     * Create a player for your video, and customise it.
     * Create a player
     * @param param the request object
     */
    public pOSTPlayers(param: PlayersApiPOSTPlayersRequest, options?: Configuration): Promise<Player> {
        return this.api.pOSTPlayers(param.playerCreationPayload,  options).toPromise();
    }

    /**
     * The uploaded image maximum size should be 200x100 and its weight should be 200KB.  It will be scaled down to 30px height and converted to PNG to be displayed in the player.
     * Upload a logo
     * @param param the request object
     */
    public pOSTPlayersPlayerIdLogo(param: PlayersApiPOSTPlayersPlayerIdLogoRequest, options?: Configuration): Promise<Player> {
        return this.api.pOSTPlayersPlayerIdLogo(param.playerId, param.file, param.link,  options).toPromise();
    }

}

import { ObservableVideosApi } from "./ObservableAPI";
import { VideosApiRequestFactory, VideosApiResponseProcessor} from "../apis/VideosApi";

export interface VideosApiDELETEVideoRequest {
    /**
     * The video ID for the video you want to delete.
     * @type string
     * @memberof VideosApidELETEVideo
     */
    videoId: string
}

export interface VideosApiGETVideoRequest {
    /**
     * The unique identifier for the video you want details about.
     * @type string
     * @memberof VideosApigETVideo
     */
    videoId: string
}

export interface VideosApiGETVideoStatusRequest {
    /**
     * The unique identifier for the video you want the status for.
     * @type string
     * @memberof VideosApigETVideoStatus
     */
    videoId: string
}

export interface VideosApiLISTVideosRequest {
    /**
     * The title of a specific video you want to find. The search will match exactly to what term you provide and return any videos that contain the same term as part of their titles.
     * @type string
     * @memberof VideosApilISTVideos
     */
    title?: string
    /**
     * A tag is a category you create and apply to videos. You can search for videos with particular tags by listing one or more here. Only videos that have all the tags you list will be returned.
     * @type Array&lt;string&gt;
     * @memberof VideosApilISTVideos
     */
    tags?: Array<string>
    /**
     * Videos can be tagged with metadata tags in key:value pairs. You can search for videos with specific key value pairs using this parameter. [Dynamic Metadata](https://api.video/blog/endpoints/dynamic-metadata) allows you to define a key that allows any value pair.
     * @type Array&lt;string&gt;
     * @memberof VideosApilISTVideos
     */
    metadata?: Array<string>
    /**
     * If you described a video with a term or sentence, you can add it here to return videos containing this string.
     * @type string
     * @memberof VideosApilISTVideos
     */
    description?: string
    /**
     * If you know the ID for a live stream, you can retrieve the stream by adding the ID for it here.
     * @type string
     * @memberof VideosApilISTVideos
     */
    liveStreamId?: string
    /**
     * Allowed: publishedAt, title. You can search by the time videos were published at, or by title.
     * @type string
     * @memberof VideosApilISTVideos
     */
    sortBy?: string
    /**
     * Allowed: asc, desc. asc is ascending and sorts from A to Z. desc is descending and sorts from Z to A.
     * @type string
     * @memberof VideosApilISTVideos
     */
    sortOrder?: string
    /**
     * Choose the number of search results to return per page. Minimum value: 1
     * @type number
     * @memberof VideosApilISTVideos
     */
    currentPage?: number
    /**
     * Results per page. Allowed values 1-100, default is 25.
     * @type number
     * @memberof VideosApilISTVideos
     */
    pageSize?: number
}

export interface VideosApiPATCHVideoRequest {
    /**
     * The video ID for the video you want to delete.
     * @type string
     * @memberof VideosApipATCHVideo
     */
    videoId: string
    /**
     * 
     * @type VideoUpdatePayload
     * @memberof VideosApipATCHVideo
     */
    videoUpdatePayload?: VideoUpdatePayload
}

export interface VideosApiPATCHVideosVideoIdThumbnailRequest {
    /**
     * Unique identifier of the video you want to add a thumbnail to, where you use a section of your video as the thumbnail.
     * @type string
     * @memberof VideosApipATCHVideosVideoIdThumbnail
     */
    videoId: string
    /**
     * 
     * @type VideoThumbnailPickPayload
     * @memberof VideosApipATCHVideosVideoIdThumbnail
     */
    videoThumbnailPickPayload?: VideoThumbnailPickPayload
}

export interface VideosApiPOSTVideoRequest {
    /**
     * video to create
     * @type VideoCreatePayload
     * @memberof VideosApipOSTVideo
     */
    videoCreatePayload?: VideoCreatePayload
}

export interface VideosApiPOSTVideosVideoIdSourceRequest {
    /**
     * Enter the videoId you want to use to upload your video.
     * @type string
     * @memberof VideosApipOSTVideosVideoIdSource
     */
    videoId: string
    /**
     * The path to the video you would like to upload. The path must be local. If you want to use a video from an online source, you must use the \\\&quot;/videos\\\&quot; endpoint and add the \\\&quot;source\\\&quot; parameter when you create a new video.
     * @type HttpFile
     * @memberof VideosApipOSTVideosVideoIdSource
     */
    file: HttpFile
    /**
     * Content-Range represents the range of bytes that will be returned as a result of the request. Byte ranges are inclusive, meaning that bytes 0-999 represents the first 1000 bytes in a file or object.
     * @type string
     * @memberof VideosApipOSTVideosVideoIdSource
     */
    contentRange?: string
}

export interface VideosApiPOSTVideosVideoIdThumbnailRequest {
    /**
     * Unique identifier of the chosen video 
     * @type string
     * @memberof VideosApipOSTVideosVideoIdThumbnail
     */
    videoId: string
    /**
     * The image to be added as a thumbnail.
     * @type HttpFile
     * @memberof VideosApipOSTVideosVideoIdThumbnail
     */
    file: HttpFile
}

export class ObjectVideosApi {
    private api: ObservableVideosApi

    public constructor(configuration: Configuration, requestFactory?: VideosApiRequestFactory, responseProcessor?: VideosApiResponseProcessor) {
        this.api = new ObservableVideosApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * If you do not need a video any longer, you can send a request to delete it. All you need is the videoId. Tutorials using [video deletion](https://api.video/blog/endpoints/video-delete).
     * Delete a video
     * @param param the request object
     */
    public dELETEVideo(param: VideosApiDELETEVideoRequest, options?: Configuration): Promise<void> {
        return this.api.dELETEVideo(param.videoId,  options).toPromise();
    }

    /**
     * This call provides the same JSON information provided on video creation. For private videos, it will generate a unique token url. Use this to retrieve any details you need about a video, or set up a private viewing URL. Tutorials using [video GET](https://api.video/blog/endpoints/video-get).
     * Show a video
     * @param param the request object
     */
    public gETVideo(param: VideosApiGETVideoRequest, options?: Configuration): Promise<Video> {
        return this.api.gETVideo(param.videoId,  options).toPromise();
    }

    /**
     * This API provides upload status & encoding status to determine when the video is uploaded or ready to playback. Once encoding is completed, the response also lists the available stream qualities. Tutorials using [video status](https://api.video/blog/endpoints/video-status).
     * Show video status
     * @param param the request object
     */
    public gETVideoStatus(param: VideosApiGETVideoStatusRequest, options?: Configuration): Promise<Videostatus> {
        return this.api.gETVideoStatus(param.videoId,  options).toPromise();
    }

    /**
     * Requests to this endpoint return a list of your videos (with all their details). With no parameters added to this query, the API returns all videos. You can filter what videos the API returns using the parameters described below.  We have [several tutorials](https://api.video/blog/endpoints/video-list) that demonstrate this endpoint.
     * List all videos
     * @param param the request object
     */
    public lISTVideos(param: VideosApiLISTVideosRequest = {}, options?: Configuration): Promise<VideosListResponse> {
        return this.api.lISTVideos(param.title, param.tags, param.metadata, param.description, param.liveStreamId, param.sortBy, param.sortOrder, param.currentPage, param.pageSize,  options).toPromise();
    }

    /**
     * Use this endpoint to update the parameters associated with your video. The video you are updating is determined by the video ID you provide in the path. For each parameter you want to update, include the update in the request body. NOTE: If you are updating an array, you must provide the entire array as what you provide here overwrites what is in the system rather than appending to it. Tutorials using [video update](https://api.video/blog/endpoints/video-update).
     * Update a video
     * @param param the request object
     */
    public pATCHVideo(param: VideosApiPATCHVideoRequest, options?: Configuration): Promise<Video> {
        return this.api.pATCHVideo(param.videoId, param.videoUpdatePayload,  options).toPromise();
    }

    /**
     * Pick a thumbnail from the given time code. If you'd like to upload an image for your thumbnail, use the [Upload a Thumbnail](https://docs.api.video/reference#post_videos-videoid-thumbnail) endpoint. There may be a short delay for the thumbnail to update. Tutorials using [Thumbnail picking](https://api.video/blog/endpoints/video-pick-a-thumbnail).
     * Pick a thumbnail
     * @param param the request object
     */
    public pATCHVideosVideoIdThumbnail(param: VideosApiPATCHVideosVideoIdThumbnailRequest, options?: Configuration): Promise<Video> {
        return this.api.pATCHVideosVideoIdThumbnail(param.videoId, param.videoThumbnailPickPayload,  options).toPromise();
    }

    /**
     * To create a video, you create its container&parameters first, before adding the video file (exception - when using an existing HTTP source). * Videos are public by default. [Learn about Private videos](https://api.video/blog/tutorials/tutorial-private-videos) * Up to 6 responsive video streams will be created (from 240p to 4k) * Mp4 encoded versions are created at the highest quality (max 1080p) by default. * Panoramic videos are for videos recorded in 360 degrees.  You can toggle this after your 360 video upload. * Searchable parameters: title, description, tags and metadata   ```shell $ curl https://ws.api.video/videos \\ -H 'Authorization: Bearer {access_token} \\ -d '{\"title\":\"My video\",       \"description\":\"so many details\",      \"mp4Support\":true }' ```    ## add an URL to upload on creation You can also create a video directly from a video hosted on a third-party server by giving its URI in `source` parameter: ```shell $ curl https://ws.api.video/videos \\ -H 'Authorization: Bearer {access_token} \\ -d '{\"source\":\"http://uri/to/video.mp4\", \"title\":\"My video\"}' ```  In this case, the service will respond `202 Accepted` and ingest the video asynchronously. ## Track users with Dynamic Metadata Metadata values can be a key:value where the values are predefined, but Dynamic metadata allows you to enter *any* value for a defined key.  To defined a dynamic metadata pair use: ``` \"metadata\":[{\"dynamicKey\": \"__dynamicKey__\"}] ```  The double underscore on both sides of the value allows any variable to be added for a given video session. Added the the url you might have: ``` <iframe type=\"text/html\" src=\"https://embed.api.video/vod/vi6QvU9dhYCzW3BpPvPsZUa8?metadata[classUserName]=Doug\" width=\"960\" height=\"320\" frameborder=\"0\" scrollling=\"no\"></iframe> ```   This video session will be tagged as watched by Doug - allowing for in-depth analysis on how each viewer interacts with the videos. ### We have tutorials on: * [Creating and uploading videos](https://api.video/blog/tutorials/video-upload-tutorial) * [Uploading large videos](https://api.video/blog/tutorials/video-upload-tutorial-large-videos)   * [Using tags with videos](https://api.video/blog/tutorials/video-tagging-best-practices) * [Private videos](https://api.video/blog/tutorials/tutorial-private-videos) * [Using Dynamic Metadata](https://api.video/blog/tutorials/dynamic-metadata)  * Full list of [tutorials](https://api.video/blog/endpoints/video-create) that demonstrate this endpoint. 
     * Create a video
     * @param param the request object
     */
    public pOSTVideo(param: VideosApiPOSTVideoRequest = {}, options?: Configuration): Promise<Video> {
        return this.api.pOSTVideo(param.videoCreatePayload,  options).toPromise();
    }

    /**
     * To upload a video to the videoId you created. Replace {videoId} with the id you'd like to use, {access_token} with your token, and /path/to/video.mp4 with the path to the video you'd like to upload. You can only upload your video to the videoId once. ```bash curl https://ws.api.video/videos/{videoId}/source \\   -H 'Authorization: Bearer {access_token}' \\   -F file=@/path/to/video.mp4    ``` Tutorials using [video upload](https://api.video/blog/endpoints/video-upload).
     * Upload a video
     * @param param the request object
     */
    public pOSTVideosVideoIdSource(param: VideosApiPOSTVideosVideoIdSourceRequest, options?: Configuration): Promise<Video> {
        return this.api.pOSTVideosVideoIdSource(param.videoId, param.file, param.contentRange,  options).toPromise();
    }

    /**
     * The thumbnail is the poster that appears in the player window before video playback begins. This endpoint allows you to upload an image for the thumbnail. To select a still frame from the video using a time stamp, use [Pick a Thumbnail](https://docs.api.video/reference#patch_videos-videoid-thumbnail) to pick a time in the video.  Note: There may be a short delay before the new thumbnail is delivered to our CDN. Tutorials using [Thumbnail upload](https://api.video/blog/endpoints/videos-upload-a-thumbnail).
     * Upload a thumbnail
     * @param param the request object
     */
    public pOSTVideosVideoIdThumbnail(param: VideosApiPOSTVideosVideoIdThumbnailRequest, options?: Configuration): Promise<Video> {
        return this.api.pOSTVideosVideoIdThumbnail(param.videoId, param.file,  options).toPromise();
    }

}

import { ObservableVideosDelegatedUploadApi } from "./ObservableAPI";
import { VideosDelegatedUploadApiRequestFactory, VideosDelegatedUploadApiResponseProcessor} from "../apis/VideosDelegatedUploadApi";

export interface VideosDelegatedUploadApiDELETEUploadTokensUploadTokenRequest {
    /**
     * The unique identifier for the upload token you want to delete. Deleting a token will make it so the token can no longer be used for authentication.
     * @type string
     * @memberof VideosDelegatedUploadApidELETEUploadTokensUploadToken
     */
    uploadToken: string
}

export interface VideosDelegatedUploadApiGETUploadTokensRequest {
    /**
     * Allowed: createdAt, ttl. You can use these to sort by when a token was created, or how much longer the token will be active (ttl - time to live). Date and time is presented in ISO-8601 format.
     * @type &#39;createdAt&#39; | &#39;ttl&#39;
     * @memberof VideosDelegatedUploadApigETUploadTokens
     */
    sortBy?: 'createdAt' | 'ttl'
    /**
     * Allowed: asc, desc. Ascending is 0-9 or A-Z. Descending is 9-0 or Z-A.
     * @type &#39;asc&#39; | &#39;desc&#39;
     * @memberof VideosDelegatedUploadApigETUploadTokens
     */
    sortOrder?: 'asc' | 'desc'
    /**
     * Choose the number of search results to return per page. Minimum value: 1
     * @type number
     * @memberof VideosDelegatedUploadApigETUploadTokens
     */
    currentPage?: number
    /**
     * Results per page. Allowed values 1-100, default is 25.
     * @type number
     * @memberof VideosDelegatedUploadApigETUploadTokens
     */
    pageSize?: number
}

export interface VideosDelegatedUploadApiGETUploadTokensUploadTokenRequest {
    /**
     * The unique identifier for the token you want information about.
     * @type string
     * @memberof VideosDelegatedUploadApigETUploadTokensUploadToken
     */
    uploadToken: string
}

export interface VideosDelegatedUploadApiPOSTUploadRequest {
    /**
     * The unique identifier for the token you want to use to upload a video.
     * @type string
     * @memberof VideosDelegatedUploadApipOSTUpload
     */
    token: string
    /**
     * The path to the video you want to upload.
     * @type HttpFile
     * @memberof VideosDelegatedUploadApipOSTUpload
     */
    file: HttpFile
    /**
     * Content-Range represents the range of bytes that will be returned as a result of the request. Byte ranges are inclusive, meaning that bytes 0-999 represents the first 1000 bytes in a file or object.
     * @type string
     * @memberof VideosDelegatedUploadApipOSTUpload
     */
    contentRange?: string
    /**
     * The video id returned by the first call to this endpoint in a large video upload scenario.
     * @type string
     * @memberof VideosDelegatedUploadApipOSTUpload
     */
    videoId?: string
}

export interface VideosDelegatedUploadApiPOSTUploadTokensRequest {
    /**
     * 
     * @type TokenCreatePayload
     * @memberof VideosDelegatedUploadApipOSTUploadTokens
     */
    tokenCreatePayload?: TokenCreatePayload
}

export class ObjectVideosDelegatedUploadApi {
    private api: ObservableVideosDelegatedUploadApi

    public constructor(configuration: Configuration, requestFactory?: VideosDelegatedUploadApiRequestFactory, responseProcessor?: VideosDelegatedUploadApiResponseProcessor) {
        this.api = new ObservableVideosDelegatedUploadApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Delete an existing upload token. This is especially useful for tokens you may have created that do not expire.
     * Delete an upload token
     * @param param the request object
     */
    public dELETEUploadTokensUploadToken(param: VideosDelegatedUploadApiDELETEUploadTokensUploadTokenRequest, options?: Configuration): Promise<void> {
        return this.api.dELETEUploadTokensUploadToken(param.uploadToken,  options).toPromise();
    }

    /**
     * A delegated token is used to allow secure uploads without exposing your API key. Use this endpoint to retrieve a list of all currently active delegated tokens. Tutorials using [delegated upload](https://api.video/blog/endpoints/delegated-upload).
     * List all active upload tokens.
     * @param param the request object
     */
    public gETUploadTokens(param: VideosDelegatedUploadApiGETUploadTokensRequest = {}, options?: Configuration): Promise<TokenListResponse> {
        return this.api.gETUploadTokens(param.sortBy, param.sortOrder, param.currentPage, param.pageSize,  options).toPromise();
    }

    /**
     * You can retrieve details about a specific upload token if you have the unique identifier for the upload token. Add it in the path of the endpoint. Details include time-to-live (ttl), when the token was created, and when it will expire.
     * Show upload token
     * @param param the request object
     */
    public gETUploadTokensUploadToken(param: VideosDelegatedUploadApiGETUploadTokensUploadTokenRequest, options?: Configuration): Promise<UploadToken> {
        return this.api.gETUploadTokensUploadToken(param.uploadToken,  options).toPromise();
    }

    /**
     * When given a token, anyone can upload a file to the URI `https://ws.api.video/upload?token=<tokenId>`.  Example with cURL:  ```curl $ curl  --request POST --url 'https://ws.api.video/upload?token=toXXX'  --header 'content-type: multipart/form-data'  -F file=@video.mp4 ```  Or in an HTML form, with a little JavaScript to convert the form into JSON: ```html <!--form for user interaction--> <form name=\"videoUploadForm\" >   <label for=video>Video:</label>   <input type=file name=source/><br/>   <input value=\"Submit\" type=\"submit\"> </form> <div></div> <!--JS takes the form data      uses FormData to turn the response into JSON.     then uses POST to upload the video file.     Update the token parameter in the url to your upload token.     --> <script>    var form = document.forms.namedItem(\"videoUploadForm\");     form.addEventListener('submit', function(ev) {   ev.preventDefault();      var oOutput = document.querySelector(\"div\"),          oData = new FormData(form);      var oReq = new XMLHttpRequest();         oReq.open(\"POST\", \"https://ws.api.video/upload?token=toXXX\", true);      oReq.send(oData);   oReq.onload = function(oEvent) {        if (oReq.status ==201) {          oOutput.innerHTML = \"Your video is uploaded!<br/>\"  + oReq.response;        } else {          oOutput.innerHTML = \"Error \" + oReq.status + \" occurred when trying to upload your file.<br />\";        }      };    }, false);  </script> ```   ### Dealing with large files  We have created a <a href='https://api.video/blog/tutorials/uploading-large-files-with-javascript'>tutorial</a> to walk through the steps required.
     * Upload with an upload token
     * @param param the request object
     */
    public pOSTUpload(param: VideosDelegatedUploadApiPOSTUploadRequest, options?: Configuration): Promise<Video> {
        return this.api.pOSTUpload(param.token, param.file, param.contentRange, param.videoId,  options).toPromise();
    }

    /**
     * Use this endpoint to generate an upload token. You can use this token to authenticate video uploads while keeping your API key safe. Tutorials using [delegated upload](https://api.video/blog/endpoints/delegated-upload).
     * Generate an upload token
     * @param param the request object
     */
    public pOSTUploadTokens(param: VideosDelegatedUploadApiPOSTUploadTokensRequest = {}, options?: Configuration): Promise<UploadToken> {
        return this.api.pOSTUploadTokens(param.tokenCreatePayload,  options).toPromise();
    }

}

import { ObservableWebhooksApi } from "./ObservableAPI";
import { WebhooksApiRequestFactory, WebhooksApiResponseProcessor} from "../apis/WebhooksApi";

export interface WebhooksApiDELETEWebhookRequest {
    /**
     * The webhook you wish to delete.
     * @type string
     * @memberof WebhooksApidELETEWebhook
     */
    webhookId: string
}

export interface WebhooksApiGETWebhookRequest {
    /**
     * The unique webhook you wish to retreive details on.
     * @type string
     * @memberof WebhooksApigETWebhook
     */
    webhookId: string
}

export interface WebhooksApiLISTWebhooksRequest {
    /**
     * The webhook event that you wish to filter on.
     * @type string
     * @memberof WebhooksApilISTWebhooks
     */
    events?: string
    /**
     * Choose the number of search results to return per page. Minimum value: 1
     * @type number
     * @memberof WebhooksApilISTWebhooks
     */
    currentPage?: number
    /**
     * Results per page. Allowed values 1-100, default is 25.
     * @type number
     * @memberof WebhooksApilISTWebhooks
     */
    pageSize?: number
}

export interface WebhooksApiPOSTWebhooksRequest {
    /**
     * 
     * @type WebhooksCreatePayload
     * @memberof WebhooksApipOSTWebhooks
     */
    webhooksCreatePayload?: WebhooksCreatePayload
}

export class ObjectWebhooksApi {
    private api: ObservableWebhooksApi

    public constructor(configuration: Configuration, requestFactory?: WebhooksApiRequestFactory, responseProcessor?: WebhooksApiResponseProcessor) {
        this.api = new ObservableWebhooksApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * This endpoint will delete the indicated webhook.
     * Delete a Webhook
     * @param param the request object
     */
    public dELETEWebhook(param: WebhooksApiDELETEWebhookRequest, options?: Configuration): Promise<void> {
        return this.api.dELETEWebhook(param.webhookId,  options).toPromise();
    }

    /**
     * This call provides the same JSON information provided on Webjhook creation.
     * Show Webhook details
     * @param param the request object
     */
    public gETWebhook(param: WebhooksApiGETWebhookRequest, options?: Configuration): Promise<Webhook> {
        return this.api.gETWebhook(param.webhookId,  options).toPromise();
    }

    /**
     * Requests to this endpoint return a list of your webhooks (with all their details). You can filter what the webhook list that the API returns using the parameters described below.
     * List all webhooks
     * @param param the request object
     */
    public lISTWebhooks(param: WebhooksApiLISTWebhooksRequest = {}, options?: Configuration): Promise<WebhooksListResponse> {
        return this.api.lISTWebhooks(param.events, param.currentPage, param.pageSize,  options).toPromise();
    }

    /**
     * Webhooks can push notifications to your server, rather than polling api.video for changes. We currently offer four events:  * ```video.encoding.quality.completed```  When a new video is uploaded into your account, it will be encoded into several different HLS sizes/bitrates.  When each version is encoded, your webhook will get a notification.  It will look like ```{ \\\"type\\\": \\\"video.encoding.quality.completed\\\", \\\"emittedAt\\\": \\\"2021-01-29T16:46:25.217+01:00\\\", \\\"videoId\\\": \\\"viXXXXXXXX\\\", \\\"encoding\\\": \\\"hls\\\", \\\"quality\\\": \\\"720p\\\"} ```. This request says that the 720p HLS encoding was completed. * ```live-stream.broadcast.started```  When a livestream begins broadcasting, the broadcasting parameter changes from false to true, and this webhook fires. * ```live-stream.broadcast.ended```  This event fores when the livestream has finished broadcasting, and the broadcasting parameter flips from false to true. * ```video.source.recorded```  This event is similar to ```video.encoding.quality.completed```, but tells you if a livestream has been recorded as a VOD.
     * Create Webhook
     * @param param the request object
     */
    public pOSTWebhooks(param: WebhooksApiPOSTWebhooksRequest = {}, options?: Configuration): Promise<Webhook> {
        return this.api.pOSTWebhooks(param.webhooksCreatePayload,  options).toPromise();
    }

}
