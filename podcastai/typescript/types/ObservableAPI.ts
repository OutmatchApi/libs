import { ResponseContext, RequestContext, HttpFile } from '../http/http';
import { Configuration} from '../configuration'
import { Observable, of, from } from '../rxjsStub';
import {mergeMap, map} from  '../rxjsStub';
import { ModelError } from '../models/ModelError';
import { Podcast } from '../models/Podcast';
import { ProcessPodcastRequest } from '../models/ProcessPodcastRequest';

import { PodcastApiRequestFactory, PodcastApiResponseProcessor} from "../apis/PodcastApi";
export class ObservablePodcastApi {
    private requestFactory: PodcastApiRequestFactory;
    private responseProcessor: PodcastApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: PodcastApiRequestFactory,
        responseProcessor?: PodcastApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new PodcastApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new PodcastApiResponseProcessor();
    }

    /**
     * Processing a podcast episode
     * Process Podcast
     * @param processPodcastRequest 
     */
    public processPodcast(processPodcastRequest?: ProcessPodcastRequest, _options?: Configuration): Observable<Podcast> {
        const requestContextPromise = this.requestFactory.processPodcast(processPodcastRequest, _options);

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
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.processPodcast(rsp)));
            }));
    }

}

import { StatusApiRequestFactory, StatusApiResponseProcessor} from "../apis/StatusApi";
export class ObservableStatusApi {
    private requestFactory: StatusApiRequestFactory;
    private responseProcessor: StatusApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: StatusApiRequestFactory,
        responseProcessor?: StatusApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new StatusApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new StatusApiResponseProcessor();
    }

    /**
     * Check the API status
     */
    public getStatus(_options?: Configuration): Observable<void> {
        const requestContextPromise = this.requestFactory.getStatus(_options);

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
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.getStatus(rsp)));
            }));
    }

}
