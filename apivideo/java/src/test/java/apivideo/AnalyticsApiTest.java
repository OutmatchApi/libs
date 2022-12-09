/*
 * api.video
 * api.video is an API that encodes on the go to facilitate immediate playback, enhancing viewer streaming experiences across multiple devices and platforms. You can stream live or on-demand online videos within minutes.
 *
 * The version of the OpenAPI document: 1.0.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package apivideo;

import invalidPackageName.ApiException;
import com.outmatchapi.apivideo.NotFound;
import com.outmatchapi.apivideo.RawStatisticsListLiveStreamAnalyticsResponse;
import com.outmatchapi.apivideo.RawStatisticsListPlayerSessionEventsResponse;
import com.outmatchapi.apivideo.RawStatisticsListSessionsResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AnalyticsApi
 */
@Disabled
public class AnalyticsApiTest {

    private final AnalyticsApi api = new AnalyticsApi();

    /**
     * List live stream player sessions
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void gETAnalyticsLiveStreamsLiveStreamIdTest() throws ApiException {
        String liveStreamId = null;
        String period = null;
        Integer currentPage = null;
        Integer pageSize = null;
        RawStatisticsListLiveStreamAnalyticsResponse response = api.gETAnalyticsLiveStreamsLiveStreamId(liveStreamId)
                .period(period)
                .currentPage(currentPage)
                .pageSize(pageSize)
                .execute();
        // TODO: test validations
    }

    /**
     * List player session events
     *
     * Useful to track and measure video&#39;s engagement.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void gETAnalyticsSessionsSessionIdEventsTest() throws ApiException {
        String sessionId = null;
        Integer currentPage = null;
        Integer pageSize = null;
        RawStatisticsListPlayerSessionEventsResponse response = api.gETAnalyticsSessionsSessionIdEvents(sessionId)
                .currentPage(currentPage)
                .pageSize(pageSize)
                .execute();
        // TODO: test validations
    }

    /**
     * List video player sessions
     *
     * Retrieve all available user sessions for a specific video. Tutorials that use the [analytics endpoint](https://api.video/blog/endpoints/analytics).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void gETAnalyticsVideosVideoIdTest() throws ApiException {
        String videoId = null;
        String period = null;
        List<String> metadata = null;
        Integer currentPage = null;
        Integer pageSize = null;
        RawStatisticsListSessionsResponse response = api.gETAnalyticsVideosVideoId(videoId)
                .period(period)
                .metadata(metadata)
                .currentPage(currentPage)
                .pageSize(pageSize)
                .execute();
        // TODO: test validations
    }

}
