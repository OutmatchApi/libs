import { ResponseContext, RequestContext, HttpFile } from '../http/http';
import { Configuration} from '../configuration'
import { Observable, of, from } from '../rxjsStub';
import {mergeMap, map} from  '../rxjsStub';
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

import { AccountApiRequestFactory, AccountApiResponseProcessor} from "../apis/AccountApi";
export class ObservableAccountApi {
    private requestFactory: AccountApiRequestFactory;
    private responseProcessor: AccountApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: AccountApiRequestFactory,
        responseProcessor?: AccountApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new AccountApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new AccountApiResponseProcessor();
    }

    /**
     * Deprecated. Authenticate and get a token, then you can use the bearer token here to retrieve details about your account.
     * Show account
     */
    public gETAccount(_options?: Configuration): Observable<Account> {
        const requestContextPromise = this.requestFactory.gETAccount(_options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.gETAccount(rsp)));
            }));
    }

}

import { AnalyticsApiRequestFactory, AnalyticsApiResponseProcessor} from "../apis/AnalyticsApi";
export class ObservableAnalyticsApi {
    private requestFactory: AnalyticsApiRequestFactory;
    private responseProcessor: AnalyticsApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: AnalyticsApiRequestFactory,
        responseProcessor?: AnalyticsApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new AnalyticsApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new AnalyticsApiResponseProcessor();
    }

    /**
     * List live stream player sessions
     * @param liveStreamId The unique identifier for the live stream you want to retrieve analytics for.
     * @param period Period must have one of the following formats:  - For a day : \&quot;2018-01-01\&quot;, - For a week: \&quot;2018-W01\&quot;,  - For a month: \&quot;2018-01\&quot; - For a year: \&quot;2018\&quot; For a range period:  -  Date range: \&quot;2018-01-01/2018-01-15\&quot; 
     * @param currentPage Choose the number of search results to return per page. Minimum value: 1
     * @param pageSize Results per page. Allowed values 1-100, default is 25.
     */
    public gETAnalyticsLiveStreamsLiveStreamId(liveStreamId: string, period?: string, currentPage?: number, pageSize?: number, _options?: Configuration): Observable<RawStatisticsListLiveStreamAnalyticsResponse> {
        const requestContextPromise = this.requestFactory.gETAnalyticsLiveStreamsLiveStreamId(liveStreamId, period, currentPage, pageSize, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.gETAnalyticsLiveStreamsLiveStreamId(rsp)));
            }));
    }

    /**
     * Useful to track and measure video's engagement.
     * List player session events
     * @param sessionId A unique identifier you can use to reference and track a session with.
     * @param currentPage Choose the number of search results to return per page. Minimum value: 1
     * @param pageSize Results per page. Allowed values 1-100, default is 25.
     */
    public gETAnalyticsSessionsSessionIdEvents(sessionId: string, currentPage?: number, pageSize?: number, _options?: Configuration): Observable<RawStatisticsListPlayerSessionEventsResponse> {
        const requestContextPromise = this.requestFactory.gETAnalyticsSessionsSessionIdEvents(sessionId, currentPage, pageSize, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.gETAnalyticsSessionsSessionIdEvents(rsp)));
            }));
    }

    /**
     * Retrieve all available user sessions for a specific video. Tutorials that use the [analytics endpoint](https://api.video/blog/endpoints/analytics).
     * List video player sessions
     * @param videoId The unique identifier for the video you want to retrieve session information for.
     * @param period Period must have one of the following formats:  - For a day : 2018-01-01, - For a week: 2018-W01,  - For a month: 2018-01 - For a year: 2018 For a range period:  -  Date range: 2018-01-01/2018-01-15 
     * @param metadata Metadata and [Dynamic Metadata](https://api.video/blog/endpoints/dynamic-metadata) filter. Send an array of key value pairs you want to filter sessios with.
     * @param currentPage Choose the number of search results to return per page. Minimum value: 1
     * @param pageSize Results per page. Allowed values 1-100, default is 25.
     */
    public gETAnalyticsVideosVideoId(videoId: string, period?: string, metadata?: Array<string>, currentPage?: number, pageSize?: number, _options?: Configuration): Observable<RawStatisticsListSessionsResponse> {
        const requestContextPromise = this.requestFactory.gETAnalyticsVideosVideoId(videoId, period, metadata, currentPage, pageSize, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.gETAnalyticsVideosVideoId(rsp)));
            }));
    }

}

import { AuthenticationApiRequestFactory, AuthenticationApiResponseProcessor} from "../apis/AuthenticationApi";
export class ObservableAuthenticationApi {
    private requestFactory: AuthenticationApiRequestFactory;
    private responseProcessor: AuthenticationApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: AuthenticationApiRequestFactory,
        responseProcessor?: AuthenticationApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new AuthenticationApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new AuthenticationApiResponseProcessor();
    }

    /**
     * To get started, submit your API key in the body of your request. api.video returns an access token that is valid for one hour (3600 seconds). A refresh token is also returned. View a [tutorial](https://api.video/blog/tutorials/authentication-tutorial) on authentication. All tutorials using the [authentication endpoint](https://api.video/blog/endpoints/authenticate)
     * Authenticate
     * @param authenticatePayload 
     */
    public pOSTAuthApiKey(authenticatePayload?: AuthenticatePayload, _options?: Configuration): Observable<AccessToken> {
        const requestContextPromise = this.requestFactory.pOSTAuthApiKey(authenticatePayload, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.pOSTAuthApiKey(rsp)));
            }));
    }

    /**
     * Use the refresh endpoint with the refresh token you received when you first authenticated using the api-key endpoint. Send the refresh token in the body of your request. The api.video API returns a new access token that is valid for one hour (3600 seconds) and a new refresh token.  
     * Refresh token
     * @param refreshTokenPayload 
     */
    public pOSTAuthRefresh(refreshTokenPayload?: RefreshTokenPayload, _options?: Configuration): Observable<AccessToken> {
        const requestContextPromise = this.requestFactory.pOSTAuthRefresh(refreshTokenPayload, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.pOSTAuthRefresh(rsp)));
            }));
    }

}

import { CaptionsApiRequestFactory, CaptionsApiResponseProcessor} from "../apis/CaptionsApi";
export class ObservableCaptionsApi {
    private requestFactory: CaptionsApiRequestFactory;
    private responseProcessor: CaptionsApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: CaptionsApiRequestFactory,
        responseProcessor?: CaptionsApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new CaptionsApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new CaptionsApiResponseProcessor();
    }

    /**
     * Delete a caption in a specific language by providing the video ID for the video you want to delete the caption from and the language the caption is in.
     * Delete a caption
     * @param videoId The unique identifier for the video you want to delete a caption from.
     * @param language A valid [BCP 47](https://github.com/libyal/libfwnt/wiki/Language-Code-identifiers) language representation.
     */
    public dELETEVideosVideoIdCaptionsLanguage(videoId: string, language: string, _options?: Configuration): Observable<void> {
        const requestContextPromise = this.requestFactory.dELETEVideosVideoIdCaptionsLanguage(videoId, language, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.dELETEVideosVideoIdCaptionsLanguage(rsp)));
            }));
    }

    /**
     * Retrieve a list of available captions for the videoId you provide.
     * List video captions
     * @param videoId The unique identifier for the video you want to retrieve a list of captions for.
     * @param currentPage Choose the number of search results to return per page. Minimum value: 1
     * @param pageSize Results per page. Allowed values 1-100, default is 25.
     */
    public gETVideosVideoIdCaptions(videoId: string, currentPage?: number, pageSize?: number, _options?: Configuration): Observable<CaptionsListResponse> {
        const requestContextPromise = this.requestFactory.gETVideosVideoIdCaptions(videoId, currentPage, pageSize, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.gETVideosVideoIdCaptions(rsp)));
            }));
    }

    /**
     * Display a caption for a video in a specific language. If the language is available, the caption is returned. Otherwise, you will get a response indicating the caption was not found. Tutorials that use the [captions endpoint](https://api.video/blog/endpoints/captions).
     * Show a caption
     * @param videoId The unique identifier for the video you want captions for.
     * @param language A valid [BCP 47](https://github.com/libyal/libfwnt/wiki/Language-Code-identifiers) language representation
     */
    public gETVideosVideoIdCaptionsLanguage(videoId: string, language: string, _options?: Configuration): Observable<Subtitle> {
        const requestContextPromise = this.requestFactory.gETVideosVideoIdCaptionsLanguage(videoId, language, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.gETVideosVideoIdCaptionsLanguage(rsp)));
            }));
    }

    /**
     * To have the captions on automatically, use this PATCH to set default: true.
     * Update caption
     * @param videoId The unique identifier for the video you want to have automatic captions for. 
     * @param language A valid [BCP 47](https://github.com/libyal/libfwnt/wiki/Language-Code-identifiers) language representation.
     * @param captionsUpdatePayload 
     */
    public pATCHVideosVideoIdCaptionsLanguage(videoId: string, language: string, captionsUpdatePayload?: CaptionsUpdatePayload, _options?: Configuration): Observable<Subtitle> {
        const requestContextPromise = this.requestFactory.pATCHVideosVideoIdCaptionsLanguage(videoId, language, captionsUpdatePayload, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.pATCHVideosVideoIdCaptionsLanguage(rsp)));
            }));
    }

    /**
     * Upload a VTT file to add captions to your video.  Read our [captioning tutorial](https://api.video/blog/tutorials/adding-captions) for more details.
     * Upload a caption
     * @param videoId The unique identifier for the video you want to add a caption to.
     * @param language A valid BCP 47 language representation.
     * @param file The video text track (VTT) you want to upload.
     */
    public pOSTVideosVideoIdCaptionsLanguage(videoId: string, language: string, file: HttpFile, _options?: Configuration): Observable<Subtitle> {
        const requestContextPromise = this.requestFactory.pOSTVideosVideoIdCaptionsLanguage(videoId, language, file, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.pOSTVideosVideoIdCaptionsLanguage(rsp)));
            }));
    }

}

import { ChaptersApiRequestFactory, ChaptersApiResponseProcessor} from "../apis/ChaptersApi";
export class ObservableChaptersApi {
    private requestFactory: ChaptersApiRequestFactory;
    private responseProcessor: ChaptersApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: ChaptersApiRequestFactory,
        responseProcessor?: ChaptersApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new ChaptersApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new ChaptersApiResponseProcessor();
    }

    /**
     * Delete a chapter
     * @param videoId The unique identifier for the video you want to delete a chapter from. 
     * @param language A valid [BCP 47](https://github.com/libyal/libfwnt/wiki/Language-Code-identifiers) language representation.
     */
    public dELETEVideosVideoIdChaptersLanguage(videoId: string, language: string, _options?: Configuration): Observable<void> {
        const requestContextPromise = this.requestFactory.dELETEVideosVideoIdChaptersLanguage(videoId, language, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.dELETEVideosVideoIdChaptersLanguage(rsp)));
            }));
    }

    /**
     * Retrieve a list of all chapters for a specified video.
     * List video chapters
     * @param videoId The unique identifier for the video you want to retrieve a list of chapters for.
     * @param currentPage Choose the number of search results to return per page. Minimum value: 1
     * @param pageSize Results per page. Allowed values 1-100, default is 25.
     */
    public gETVideosVideoIdChapters(videoId: string, currentPage?: number, pageSize?: number, _options?: Configuration): Observable<ChaptersListResponse> {
        const requestContextPromise = this.requestFactory.gETVideosVideoIdChapters(videoId, currentPage, pageSize, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.gETVideosVideoIdChapters(rsp)));
            }));
    }

    /**
     * Chapters help your viewers find the sections of the video they are most interested in viewing. Tutorials that use the [chapters endpoint](https://api.video/blog/endpoints/chapters).
     * Show a chapter
     * @param videoId The unique identifier for the video you want to show a chapter for.
     * @param language A valid [BCP 47](https://github.com/libyal/libfwnt/wiki/Language-Code-identifiers) language representation.
     */
    public gETVideosVideoIdChaptersLanguage(videoId: string, language: string, _options?: Configuration): Observable<Chapter> {
        const requestContextPromise = this.requestFactory.gETVideosVideoIdChaptersLanguage(videoId, language, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.gETVideosVideoIdChaptersLanguage(rsp)));
            }));
    }

    /**
     * Chapters help break the video into sections. Read our [tutorial](https://api.video/blog/tutorials/adding-chapters-to-your-videos) for more details.
     * Upload a chapter
     * @param videoId The unique identifier for the video you want to upload a chapter for.
     * @param language A valid [BCP 47](https://github.com/libyal/libfwnt/wiki/Language-Code-identifiers) language representation.
     * @param file The VTT file describing the chapters you want to upload.
     */
    public pOSTVideosVideoIdChaptersLanguage(videoId: string, language: string, file: HttpFile, _options?: Configuration): Observable<Chapter> {
        const requestContextPromise = this.requestFactory.pOSTVideosVideoIdChaptersLanguage(videoId, language, file, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.pOSTVideosVideoIdChaptersLanguage(rsp)));
            }));
    }

}

import { LiveApiRequestFactory, LiveApiResponseProcessor} from "../apis/LiveApi";
export class ObservableLiveApi {
    private requestFactory: LiveApiRequestFactory;
    private responseProcessor: LiveApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: LiveApiRequestFactory,
        responseProcessor?: LiveApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new LiveApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new LiveApiResponseProcessor();
    }

    /**
     * Delete a live stream
     * @param liveStreamId The unique ID for the live stream that you want to remove.
     */
    public dELETELiveStreamsLiveStreamId(liveStreamId: string, _options?: Configuration): Observable<void> {
        const requestContextPromise = this.requestFactory.dELETELiveStreamsLiveStreamId(liveStreamId, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.dELETELiveStreamsLiveStreamId(rsp)));
            }));
    }

    /**
     * Send the unique identifier for a live stream to delete it from the system.
     * Delete a thumbnail
     * @param liveStreamId The unique identifier for the live stream you want to delete. 
     */
    public dELETELiveStreamsLiveStreamIdThumbnail(liveStreamId: string, _options?: Configuration): Observable<LiveStream> {
        const requestContextPromise = this.requestFactory.dELETELiveStreamsLiveStreamIdThumbnail(liveStreamId, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.dELETELiveStreamsLiveStreamIdThumbnail(rsp)));
            }));
    }

    /**
     * With no parameters added to the url, this will return all livestreams. Query by name or key to limit the list.
     * List all live streams
     * @param streamKey The unique stream key that allows you to stream videos.
     * @param name You can filter live streams by their name or a part of their name.
     * @param sortBy Allowed: createdAt, publishedAt, name. createdAt - the time a livestream was created using the specified streamKey. publishedAt - the time a livestream was published using the specified streamKey. name - the name of the livestream. If you choose one of the time based options, the time is presented in ISO-8601 format.
     * @param sortOrder Allowed: asc, desc. Ascending for date and time means that earlier values precede later ones. Descending means that later values preced earlier ones. For title, it is 0-9 and A-Z ascending and Z-A, 9-0 descending.
     * @param currentPage Choose the number of search results to return per page. Minimum value: 1
     * @param pageSize Results per page. Allowed values 1-100, default is 25.
     */
    public gETLiveStreams(streamKey?: string, name?: string, sortBy?: string, sortOrder?: 'asc' | 'desc', currentPage?: number, pageSize?: number, _options?: Configuration): Observable<LiveStreamListResponse> {
        const requestContextPromise = this.requestFactory.gETLiveStreams(streamKey, name, sortBy, sortOrder, currentPage, pageSize, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.gETLiveStreams(rsp)));
            }));
    }

    /**
     * Supply a LivestreamId, and you'll get all the details for streaming into, and watching the livestream. Tutorials that use the [show livestream endpoint](https://api.video/blog/endpoints/live-stream-status).
     * Show live stream
     * @param liveStreamId The unique ID for the live stream you want to watch.
     */
    public gETLiveStreamsLiveStreamId(liveStreamId: string, _options?: Configuration): Observable<LiveStream> {
        const requestContextPromise = this.requestFactory.gETLiveStreamsLiveStreamId(liveStreamId, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.gETLiveStreamsLiveStreamId(rsp)));
            }));
    }

    /**
     * Use this endpoint to update the player, or to turn recording on/off (saving a copy of the livestream). NOTE: If the livestream is actively streaming, changing the recording status will only affect the NEXT stream.    The public=false 'private livestream' is available as a BETA feature, and should be limited to livestreams of 3,000 viewers or fewer.
     * Update a live stream
     * @param liveStreamId The unique ID for the live stream that you want to update information for such as player details, or whether you want the recording on or off.
     * @param liveStreamUpdatePayload 
     */
    public pATCHLiveStreamsLiveStreamId(liveStreamId: string, liveStreamUpdatePayload?: LiveStreamUpdatePayload, _options?: Configuration): Observable<LiveStream> {
        const requestContextPromise = this.requestFactory.pATCHLiveStreamsLiveStreamId(liveStreamId, liveStreamUpdatePayload, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.pATCHLiveStreamsLiveStreamId(rsp)));
            }));
    }

    /**
     * A live stream will give you the 'connection point' to RTMP your video stream to api.video. It will also give you the details for viewers to watch the same livestream.  The public=false 'private livestream' is available as a BETA feature, and should be limited to livestreams of 3,000 viewers or fewer. See our [Live Stream Tutorial](https://api.video/blog/tutorials/live-stream-tutorial) for a walkthrough of this API with OBS. Your RTMP endpoint for the livestream is rtmp://broadcast.api.video/s/{streamKey} Tutorials that [create live streams](https://api.video/blog/endpoints/live-create).
     * Create live stream
     * @param liveStreamCreatePayload 
     */
    public pOSTLiveStreams(liveStreamCreatePayload?: LiveStreamCreatePayload, _options?: Configuration): Observable<LiveStream> {
        const requestContextPromise = this.requestFactory.pOSTLiveStreams(liveStreamCreatePayload, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.pOSTLiveStreams(rsp)));
            }));
    }

    /**
     * Upload an image to use as a backdrop for your livestream. Tutorials that [update live stream thumbnails](https://api.video/blog/endpoints/live-upload-a-thumbnail).
     * Upload a thumbnail
     * @param liveStreamId The unique ID for the live stream you want to upload.
     * @param file The image to be added as a thumbnail.
     */
    public pOSTLiveStreamsLiveStreamIdThumbnail(liveStreamId: string, file: HttpFile, _options?: Configuration): Observable<LiveStream> {
        const requestContextPromise = this.requestFactory.pOSTLiveStreamsLiveStreamIdThumbnail(liveStreamId, file, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.pOSTLiveStreamsLiveStreamIdThumbnail(rsp)));
            }));
    }

}

import { PlayersApiRequestFactory, PlayersApiResponseProcessor} from "../apis/PlayersApi";
export class ObservablePlayersApi {
    private requestFactory: PlayersApiRequestFactory;
    private responseProcessor: PlayersApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: PlayersApiRequestFactory,
        responseProcessor?: PlayersApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new PlayersApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new PlayersApiResponseProcessor();
    }

    /**
     * Delete a player if you no longer need it. You can delete any player that you have the player ID for.
     * Delete a player
     * @param playerId The unique identifier for the player you want to delete.
     */
    public dELETEPlayersPlayerId(playerId: string, _options?: Configuration): Observable<void> {
        const requestContextPromise = this.requestFactory.dELETEPlayersPlayerId(playerId, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.dELETEPlayersPlayerId(rsp)));
            }));
    }

    /**
     * Delete logo
     * @param playerId The unique identifier for the player.
     */
    public dELETEPlayersPlayerIdLogo(playerId: string, _options?: Configuration): Observable<any> {
        const requestContextPromise = this.requestFactory.dELETEPlayersPlayerIdLogo(playerId, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.dELETEPlayersPlayerIdLogo(rsp)));
            }));
    }

    /**
     * Retrieve a list of all the players you created, as well as details about each one. Tutorials that use the [player endpoint](https://api.video/blog/endpoints/player).
     * List all players
     * @param sortBy createdAt is the time the player was created. updatedAt is the time the player was last updated. The time is presented in ISO-8601 format.
     * @param sortOrder Allowed: asc, desc. Ascending for date and time means that earlier values precede later ones. Descending means that later values preced earlier ones.
     * @param currentPage Choose the number of search results to return per page. Minimum value: 1
     * @param pageSize Results per page. Allowed values 1-100, default is 25.
     */
    public gETPlayers(sortBy?: 'createdAt' | 'updatedAt', sortOrder?: 'asc' | 'desc', currentPage?: number, pageSize?: number, _options?: Configuration): Observable<PlayersListResponse> {
        const requestContextPromise = this.requestFactory.gETPlayers(sortBy, sortOrder, currentPage, pageSize, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.gETPlayers(rsp)));
            }));
    }

    /**
     * Use a player ID to retrieve details about the player and display it for viewers.
     * Show a player
     * @param playerId The unique identifier for the player you want to retrieve. 
     */
    public gETPlayersPlayerId(playerId: string, _options?: Configuration): Observable<Player> {
        const requestContextPromise = this.requestFactory.gETPlayersPlayerId(playerId, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.gETPlayersPlayerId(rsp)));
            }));
    }

    /**
     * Use a player ID to update specific details for a player. NOTE: It may take up to 10 min before the new player configuration is available from our CDN.
     * Update a player
     * @param playerId The unique identifier for the player.
     * @param playerUpdatePayload 
     */
    public pATCHPlayersPlayerId(playerId: string, playerUpdatePayload: PlayerUpdatePayload, _options?: Configuration): Observable<Player> {
        const requestContextPromise = this.requestFactory.pATCHPlayersPlayerId(playerId, playerUpdatePayload, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.pATCHPlayersPlayerId(rsp)));
            }));
    }

    /**
     * Create a player for your video, and customise it.
     * Create a player
     * @param playerCreationPayload 
     */
    public pOSTPlayers(playerCreationPayload: PlayerCreationPayload, _options?: Configuration): Observable<Player> {
        const requestContextPromise = this.requestFactory.pOSTPlayers(playerCreationPayload, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.pOSTPlayers(rsp)));
            }));
    }

    /**
     * The uploaded image maximum size should be 200x100 and its weight should be 200KB.  It will be scaled down to 30px height and converted to PNG to be displayed in the player.
     * Upload a logo
     * @param playerId The unique identifier for the player.
     * @param file The name of the file you want to use for your logo.
     * @param link The path to the file you want to upload and use as a logo.
     */
    public pOSTPlayersPlayerIdLogo(playerId: string, file: HttpFile, link: string, _options?: Configuration): Observable<Player> {
        const requestContextPromise = this.requestFactory.pOSTPlayersPlayerIdLogo(playerId, file, link, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.pOSTPlayersPlayerIdLogo(rsp)));
            }));
    }

}

import { VideosApiRequestFactory, VideosApiResponseProcessor} from "../apis/VideosApi";
export class ObservableVideosApi {
    private requestFactory: VideosApiRequestFactory;
    private responseProcessor: VideosApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: VideosApiRequestFactory,
        responseProcessor?: VideosApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new VideosApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new VideosApiResponseProcessor();
    }

    /**
     * If you do not need a video any longer, you can send a request to delete it. All you need is the videoId. Tutorials using [video deletion](https://api.video/blog/endpoints/video-delete).
     * Delete a video
     * @param videoId The video ID for the video you want to delete.
     */
    public dELETEVideo(videoId: string, _options?: Configuration): Observable<void> {
        const requestContextPromise = this.requestFactory.dELETEVideo(videoId, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.dELETEVideo(rsp)));
            }));
    }

    /**
     * This call provides the same JSON information provided on video creation. For private videos, it will generate a unique token url. Use this to retrieve any details you need about a video, or set up a private viewing URL. Tutorials using [video GET](https://api.video/blog/endpoints/video-get).
     * Show a video
     * @param videoId The unique identifier for the video you want details about.
     */
    public gETVideo(videoId: string, _options?: Configuration): Observable<Video> {
        const requestContextPromise = this.requestFactory.gETVideo(videoId, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.gETVideo(rsp)));
            }));
    }

    /**
     * This API provides upload status & encoding status to determine when the video is uploaded or ready to playback. Once encoding is completed, the response also lists the available stream qualities. Tutorials using [video status](https://api.video/blog/endpoints/video-status).
     * Show video status
     * @param videoId The unique identifier for the video you want the status for.
     */
    public gETVideoStatus(videoId: string, _options?: Configuration): Observable<Videostatus> {
        const requestContextPromise = this.requestFactory.gETVideoStatus(videoId, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.gETVideoStatus(rsp)));
            }));
    }

    /**
     * Requests to this endpoint return a list of your videos (with all their details). With no parameters added to this query, the API returns all videos. You can filter what videos the API returns using the parameters described below.  We have [several tutorials](https://api.video/blog/endpoints/video-list) that demonstrate this endpoint.
     * List all videos
     * @param title The title of a specific video you want to find. The search will match exactly to what term you provide and return any videos that contain the same term as part of their titles.
     * @param tags A tag is a category you create and apply to videos. You can search for videos with particular tags by listing one or more here. Only videos that have all the tags you list will be returned.
     * @param metadata Videos can be tagged with metadata tags in key:value pairs. You can search for videos with specific key value pairs using this parameter. [Dynamic Metadata](https://api.video/blog/endpoints/dynamic-metadata) allows you to define a key that allows any value pair.
     * @param description If you described a video with a term or sentence, you can add it here to return videos containing this string.
     * @param liveStreamId If you know the ID for a live stream, you can retrieve the stream by adding the ID for it here.
     * @param sortBy Allowed: publishedAt, title. You can search by the time videos were published at, or by title.
     * @param sortOrder Allowed: asc, desc. asc is ascending and sorts from A to Z. desc is descending and sorts from Z to A.
     * @param currentPage Choose the number of search results to return per page. Minimum value: 1
     * @param pageSize Results per page. Allowed values 1-100, default is 25.
     */
    public lISTVideos(title?: string, tags?: Array<string>, metadata?: Array<string>, description?: string, liveStreamId?: string, sortBy?: string, sortOrder?: string, currentPage?: number, pageSize?: number, _options?: Configuration): Observable<VideosListResponse> {
        const requestContextPromise = this.requestFactory.lISTVideos(title, tags, metadata, description, liveStreamId, sortBy, sortOrder, currentPage, pageSize, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.lISTVideos(rsp)));
            }));
    }

    /**
     * Use this endpoint to update the parameters associated with your video. The video you are updating is determined by the video ID you provide in the path. For each parameter you want to update, include the update in the request body. NOTE: If you are updating an array, you must provide the entire array as what you provide here overwrites what is in the system rather than appending to it. Tutorials using [video update](https://api.video/blog/endpoints/video-update).
     * Update a video
     * @param videoId The video ID for the video you want to delete.
     * @param videoUpdatePayload 
     */
    public pATCHVideo(videoId: string, videoUpdatePayload?: VideoUpdatePayload, _options?: Configuration): Observable<Video> {
        const requestContextPromise = this.requestFactory.pATCHVideo(videoId, videoUpdatePayload, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.pATCHVideo(rsp)));
            }));
    }

    /**
     * Pick a thumbnail from the given time code. If you'd like to upload an image for your thumbnail, use the [Upload a Thumbnail](https://docs.api.video/reference#post_videos-videoid-thumbnail) endpoint. There may be a short delay for the thumbnail to update. Tutorials using [Thumbnail picking](https://api.video/blog/endpoints/video-pick-a-thumbnail).
     * Pick a thumbnail
     * @param videoId Unique identifier of the video you want to add a thumbnail to, where you use a section of your video as the thumbnail.
     * @param videoThumbnailPickPayload 
     */
    public pATCHVideosVideoIdThumbnail(videoId: string, videoThumbnailPickPayload?: VideoThumbnailPickPayload, _options?: Configuration): Observable<Video> {
        const requestContextPromise = this.requestFactory.pATCHVideosVideoIdThumbnail(videoId, videoThumbnailPickPayload, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.pATCHVideosVideoIdThumbnail(rsp)));
            }));
    }

    /**
     * To create a video, you create its container&parameters first, before adding the video file (exception - when using an existing HTTP source). * Videos are public by default. [Learn about Private videos](https://api.video/blog/tutorials/tutorial-private-videos) * Up to 6 responsive video streams will be created (from 240p to 4k) * Mp4 encoded versions are created at the highest quality (max 1080p) by default. * Panoramic videos are for videos recorded in 360 degrees.  You can toggle this after your 360 video upload. * Searchable parameters: title, description, tags and metadata   ```shell $ curl https://ws.api.video/videos \\ -H 'Authorization: Bearer {access_token} \\ -d '{\"title\":\"My video\",       \"description\":\"so many details\",      \"mp4Support\":true }' ```    ## add an URL to upload on creation You can also create a video directly from a video hosted on a third-party server by giving its URI in `source` parameter: ```shell $ curl https://ws.api.video/videos \\ -H 'Authorization: Bearer {access_token} \\ -d '{\"source\":\"http://uri/to/video.mp4\", \"title\":\"My video\"}' ```  In this case, the service will respond `202 Accepted` and ingest the video asynchronously. ## Track users with Dynamic Metadata Metadata values can be a key:value where the values are predefined, but Dynamic metadata allows you to enter *any* value for a defined key.  To defined a dynamic metadata pair use: ``` \"metadata\":[{\"dynamicKey\": \"__dynamicKey__\"}] ```  The double underscore on both sides of the value allows any variable to be added for a given video session. Added the the url you might have: ``` <iframe type=\"text/html\" src=\"https://embed.api.video/vod/vi6QvU9dhYCzW3BpPvPsZUa8?metadata[classUserName]=Doug\" width=\"960\" height=\"320\" frameborder=\"0\" scrollling=\"no\"></iframe> ```   This video session will be tagged as watched by Doug - allowing for in-depth analysis on how each viewer interacts with the videos. ### We have tutorials on: * [Creating and uploading videos](https://api.video/blog/tutorials/video-upload-tutorial) * [Uploading large videos](https://api.video/blog/tutorials/video-upload-tutorial-large-videos)   * [Using tags with videos](https://api.video/blog/tutorials/video-tagging-best-practices) * [Private videos](https://api.video/blog/tutorials/tutorial-private-videos) * [Using Dynamic Metadata](https://api.video/blog/tutorials/dynamic-metadata)  * Full list of [tutorials](https://api.video/blog/endpoints/video-create) that demonstrate this endpoint. 
     * Create a video
     * @param videoCreatePayload video to create
     */
    public pOSTVideo(videoCreatePayload?: VideoCreatePayload, _options?: Configuration): Observable<Video> {
        const requestContextPromise = this.requestFactory.pOSTVideo(videoCreatePayload, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.pOSTVideo(rsp)));
            }));
    }

    /**
     * To upload a video to the videoId you created. Replace {videoId} with the id you'd like to use, {access_token} with your token, and /path/to/video.mp4 with the path to the video you'd like to upload. You can only upload your video to the videoId once. ```bash curl https://ws.api.video/videos/{videoId}/source \\   -H 'Authorization: Bearer {access_token}' \\   -F file=@/path/to/video.mp4    ``` Tutorials using [video upload](https://api.video/blog/endpoints/video-upload).
     * Upload a video
     * @param videoId Enter the videoId you want to use to upload your video.
     * @param file The path to the video you would like to upload. The path must be local. If you want to use a video from an online source, you must use the \\\&quot;/videos\\\&quot; endpoint and add the \\\&quot;source\\\&quot; parameter when you create a new video.
     * @param contentRange Content-Range represents the range of bytes that will be returned as a result of the request. Byte ranges are inclusive, meaning that bytes 0-999 represents the first 1000 bytes in a file or object.
     */
    public pOSTVideosVideoIdSource(videoId: string, file: HttpFile, contentRange?: string, _options?: Configuration): Observable<Video> {
        const requestContextPromise = this.requestFactory.pOSTVideosVideoIdSource(videoId, file, contentRange, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.pOSTVideosVideoIdSource(rsp)));
            }));
    }

    /**
     * The thumbnail is the poster that appears in the player window before video playback begins. This endpoint allows you to upload an image for the thumbnail. To select a still frame from the video using a time stamp, use [Pick a Thumbnail](https://docs.api.video/reference#patch_videos-videoid-thumbnail) to pick a time in the video.  Note: There may be a short delay before the new thumbnail is delivered to our CDN. Tutorials using [Thumbnail upload](https://api.video/blog/endpoints/videos-upload-a-thumbnail).
     * Upload a thumbnail
     * @param videoId Unique identifier of the chosen video 
     * @param file The image to be added as a thumbnail.
     */
    public pOSTVideosVideoIdThumbnail(videoId: string, file: HttpFile, _options?: Configuration): Observable<Video> {
        const requestContextPromise = this.requestFactory.pOSTVideosVideoIdThumbnail(videoId, file, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.pOSTVideosVideoIdThumbnail(rsp)));
            }));
    }

}

import { VideosDelegatedUploadApiRequestFactory, VideosDelegatedUploadApiResponseProcessor} from "../apis/VideosDelegatedUploadApi";
export class ObservableVideosDelegatedUploadApi {
    private requestFactory: VideosDelegatedUploadApiRequestFactory;
    private responseProcessor: VideosDelegatedUploadApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: VideosDelegatedUploadApiRequestFactory,
        responseProcessor?: VideosDelegatedUploadApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new VideosDelegatedUploadApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new VideosDelegatedUploadApiResponseProcessor();
    }

    /**
     * Delete an existing upload token. This is especially useful for tokens you may have created that do not expire.
     * Delete an upload token
     * @param uploadToken The unique identifier for the upload token you want to delete. Deleting a token will make it so the token can no longer be used for authentication.
     */
    public dELETEUploadTokensUploadToken(uploadToken: string, _options?: Configuration): Observable<void> {
        const requestContextPromise = this.requestFactory.dELETEUploadTokensUploadToken(uploadToken, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.dELETEUploadTokensUploadToken(rsp)));
            }));
    }

    /**
     * A delegated token is used to allow secure uploads without exposing your API key. Use this endpoint to retrieve a list of all currently active delegated tokens. Tutorials using [delegated upload](https://api.video/blog/endpoints/delegated-upload).
     * List all active upload tokens.
     * @param sortBy Allowed: createdAt, ttl. You can use these to sort by when a token was created, or how much longer the token will be active (ttl - time to live). Date and time is presented in ISO-8601 format.
     * @param sortOrder Allowed: asc, desc. Ascending is 0-9 or A-Z. Descending is 9-0 or Z-A.
     * @param currentPage Choose the number of search results to return per page. Minimum value: 1
     * @param pageSize Results per page. Allowed values 1-100, default is 25.
     */
    public gETUploadTokens(sortBy?: 'createdAt' | 'ttl', sortOrder?: 'asc' | 'desc', currentPage?: number, pageSize?: number, _options?: Configuration): Observable<TokenListResponse> {
        const requestContextPromise = this.requestFactory.gETUploadTokens(sortBy, sortOrder, currentPage, pageSize, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.gETUploadTokens(rsp)));
            }));
    }

    /**
     * You can retrieve details about a specific upload token if you have the unique identifier for the upload token. Add it in the path of the endpoint. Details include time-to-live (ttl), when the token was created, and when it will expire.
     * Show upload token
     * @param uploadToken The unique identifier for the token you want information about.
     */
    public gETUploadTokensUploadToken(uploadToken: string, _options?: Configuration): Observable<UploadToken> {
        const requestContextPromise = this.requestFactory.gETUploadTokensUploadToken(uploadToken, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.gETUploadTokensUploadToken(rsp)));
            }));
    }

    /**
     * When given a token, anyone can upload a file to the URI `https://ws.api.video/upload?token=<tokenId>`.  Example with cURL:  ```curl $ curl  --request POST --url 'https://ws.api.video/upload?token=toXXX'  --header 'content-type: multipart/form-data'  -F file=@video.mp4 ```  Or in an HTML form, with a little JavaScript to convert the form into JSON: ```html <!--form for user interaction--> <form name=\"videoUploadForm\" >   <label for=video>Video:</label>   <input type=file name=source/><br/>   <input value=\"Submit\" type=\"submit\"> </form> <div></div> <!--JS takes the form data      uses FormData to turn the response into JSON.     then uses POST to upload the video file.     Update the token parameter in the url to your upload token.     --> <script>    var form = document.forms.namedItem(\"videoUploadForm\");     form.addEventListener('submit', function(ev) {   ev.preventDefault();      var oOutput = document.querySelector(\"div\"),          oData = new FormData(form);      var oReq = new XMLHttpRequest();         oReq.open(\"POST\", \"https://ws.api.video/upload?token=toXXX\", true);      oReq.send(oData);   oReq.onload = function(oEvent) {        if (oReq.status ==201) {          oOutput.innerHTML = \"Your video is uploaded!<br/>\"  + oReq.response;        } else {          oOutput.innerHTML = \"Error \" + oReq.status + \" occurred when trying to upload your file.<br />\";        }      };    }, false);  </script> ```   ### Dealing with large files  We have created a <a href='https://api.video/blog/tutorials/uploading-large-files-with-javascript'>tutorial</a> to walk through the steps required.
     * Upload with an upload token
     * @param token The unique identifier for the token you want to use to upload a video.
     * @param file The path to the video you want to upload.
     * @param contentRange Content-Range represents the range of bytes that will be returned as a result of the request. Byte ranges are inclusive, meaning that bytes 0-999 represents the first 1000 bytes in a file or object.
     * @param videoId The video id returned by the first call to this endpoint in a large video upload scenario.
     */
    public pOSTUpload(token: string, file: HttpFile, contentRange?: string, videoId?: string, _options?: Configuration): Observable<Video> {
        const requestContextPromise = this.requestFactory.pOSTUpload(token, file, contentRange, videoId, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.pOSTUpload(rsp)));
            }));
    }

    /**
     * Use this endpoint to generate an upload token. You can use this token to authenticate video uploads while keeping your API key safe. Tutorials using [delegated upload](https://api.video/blog/endpoints/delegated-upload).
     * Generate an upload token
     * @param tokenCreatePayload 
     */
    public pOSTUploadTokens(tokenCreatePayload?: TokenCreatePayload, _options?: Configuration): Observable<UploadToken> {
        const requestContextPromise = this.requestFactory.pOSTUploadTokens(tokenCreatePayload, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.pOSTUploadTokens(rsp)));
            }));
    }

}

import { WebhooksApiRequestFactory, WebhooksApiResponseProcessor} from "../apis/WebhooksApi";
export class ObservableWebhooksApi {
    private requestFactory: WebhooksApiRequestFactory;
    private responseProcessor: WebhooksApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: WebhooksApiRequestFactory,
        responseProcessor?: WebhooksApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new WebhooksApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new WebhooksApiResponseProcessor();
    }

    /**
     * This endpoint will delete the indicated webhook.
     * Delete a Webhook
     * @param webhookId The webhook you wish to delete.
     */
    public dELETEWebhook(webhookId: string, _options?: Configuration): Observable<void> {
        const requestContextPromise = this.requestFactory.dELETEWebhook(webhookId, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.dELETEWebhook(rsp)));
            }));
    }

    /**
     * This call provides the same JSON information provided on Webjhook creation.
     * Show Webhook details
     * @param webhookId The unique webhook you wish to retreive details on.
     */
    public gETWebhook(webhookId: string, _options?: Configuration): Observable<Webhook> {
        const requestContextPromise = this.requestFactory.gETWebhook(webhookId, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.gETWebhook(rsp)));
            }));
    }

    /**
     * Requests to this endpoint return a list of your webhooks (with all their details). You can filter what the webhook list that the API returns using the parameters described below.
     * List all webhooks
     * @param events The webhook event that you wish to filter on.
     * @param currentPage Choose the number of search results to return per page. Minimum value: 1
     * @param pageSize Results per page. Allowed values 1-100, default is 25.
     */
    public lISTWebhooks(events?: string, currentPage?: number, pageSize?: number, _options?: Configuration): Observable<WebhooksListResponse> {
        const requestContextPromise = this.requestFactory.lISTWebhooks(events, currentPage, pageSize, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.lISTWebhooks(rsp)));
            }));
    }

    /**
     * Webhooks can push notifications to your server, rather than polling api.video for changes. We currently offer four events:  * ```video.encoding.quality.completed```  When a new video is uploaded into your account, it will be encoded into several different HLS sizes/bitrates.  When each version is encoded, your webhook will get a notification.  It will look like ```{ \\\"type\\\": \\\"video.encoding.quality.completed\\\", \\\"emittedAt\\\": \\\"2021-01-29T16:46:25.217+01:00\\\", \\\"videoId\\\": \\\"viXXXXXXXX\\\", \\\"encoding\\\": \\\"hls\\\", \\\"quality\\\": \\\"720p\\\"} ```. This request says that the 720p HLS encoding was completed. * ```live-stream.broadcast.started```  When a livestream begins broadcasting, the broadcasting parameter changes from false to true, and this webhook fires. * ```live-stream.broadcast.ended```  This event fores when the livestream has finished broadcasting, and the broadcasting parameter flips from false to true. * ```video.source.recorded```  This event is similar to ```video.encoding.quality.completed```, but tells you if a livestream has been recorded as a VOD.
     * Create Webhook
     * @param webhooksCreatePayload 
     */
    public pOSTWebhooks(webhooksCreatePayload?: WebhooksCreatePayload, _options?: Configuration): Observable<Webhook> {
        const requestContextPromise = this.requestFactory.pOSTWebhooks(webhooksCreatePayload, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.pOSTWebhooks(rsp)));
            }));
    }

}
