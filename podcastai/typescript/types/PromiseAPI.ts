import { ResponseContext, RequestContext, HttpFile } from '../http/http';
import { Configuration} from '../configuration'

import { ModelError } from '../models/ModelError';
import { Podcast } from '../models/Podcast';
import { ProcessPodcastRequest } from '../models/ProcessPodcastRequest';
import { ObservablePodcastApi } from './ObservableAPI';

import { PodcastApiRequestFactory, PodcastApiResponseProcessor} from "../apis/PodcastApi";
export class PromisePodcastApi {
    private api: ObservablePodcastApi

    public constructor(
        configuration: Configuration,
        requestFactory?: PodcastApiRequestFactory,
        responseProcessor?: PodcastApiResponseProcessor
    ) {
        this.api = new ObservablePodcastApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Processing a podcast episode
     * Process Podcast
     * @param processPodcastRequest 
     */
    public processPodcast(processPodcastRequest?: ProcessPodcastRequest, _options?: Configuration): Promise<Podcast> {
        const result = this.api.processPodcast(processPodcastRequest, _options);
        return result.toPromise();
    }


}



import { ObservableStatusApi } from './ObservableAPI';

import { StatusApiRequestFactory, StatusApiResponseProcessor} from "../apis/StatusApi";
export class PromiseStatusApi {
    private api: ObservableStatusApi

    public constructor(
        configuration: Configuration,
        requestFactory?: StatusApiRequestFactory,
        responseProcessor?: StatusApiResponseProcessor
    ) {
        this.api = new ObservableStatusApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Check the API status
     */
    public getStatus(_options?: Configuration): Promise<void> {
        const result = this.api.getStatus(_options);
        return result.toPromise();
    }


}



