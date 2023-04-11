import { ResponseContext, RequestContext, HttpFile } from '../http/http';
import { Configuration} from '../configuration'

import { ModelError } from '../models/ModelError';
import { Podcast } from '../models/Podcast';
import { ProcessPodcastRequest } from '../models/ProcessPodcastRequest';

import { ObservablePodcastApi } from "./ObservableAPI";
import { PodcastApiRequestFactory, PodcastApiResponseProcessor} from "../apis/PodcastApi";

export interface PodcastApiProcessPodcastRequest {
    /**
     * 
     * @type ProcessPodcastRequest
     * @memberof PodcastApiprocessPodcast
     */
    processPodcastRequest?: ProcessPodcastRequest
}

export class ObjectPodcastApi {
    private api: ObservablePodcastApi

    public constructor(configuration: Configuration, requestFactory?: PodcastApiRequestFactory, responseProcessor?: PodcastApiResponseProcessor) {
        this.api = new ObservablePodcastApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Processing a podcast episode
     * Process Podcast
     * @param param the request object
     */
    public processPodcast(param: PodcastApiProcessPodcastRequest = {}, options?: Configuration): Promise<Podcast> {
        return this.api.processPodcast(param.processPodcastRequest,  options).toPromise();
    }

}

import { ObservableStatusApi } from "./ObservableAPI";
import { StatusApiRequestFactory, StatusApiResponseProcessor} from "../apis/StatusApi";

export interface StatusApiGetStatusRequest {
}

export class ObjectStatusApi {
    private api: ObservableStatusApi

    public constructor(configuration: Configuration, requestFactory?: StatusApiRequestFactory, responseProcessor?: StatusApiResponseProcessor) {
        this.api = new ObservableStatusApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Check the API status
     * @param param the request object
     */
    public getStatus(param: StatusApiGetStatusRequest = {}, options?: Configuration): Promise<void> {
        return this.api.getStatus( options).toPromise();
    }

}
