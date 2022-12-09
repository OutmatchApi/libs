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


package video_api;

import invalidPackageName.ApiException;
import com.outmatchapi.video_api.BadRequest;
import java.io.File;
import com.outmatchapi.video_api.LiveStream;
import com.outmatchapi.video_api.LiveStreamCreatePayload;
import com.outmatchapi.video_api.LiveStreamListResponse;
import com.outmatchapi.video_api.LiveStreamUpdatePayload;
import com.outmatchapi.video_api.NotFound;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for LiveApi
 */
@Disabled
public class LiveApiTest {

    private final LiveApi api = new LiveApi();

    /**
     * Delete a live stream
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void dELETELiveStreamsLiveStreamIdTest() throws ApiException {
        String liveStreamId = null;
        api.dELETELiveStreamsLiveStreamId(liveStreamId);
        // TODO: test validations
    }

    /**
     * Delete a thumbnail
     *
     * Send the unique identifier for a live stream to delete it from the system.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void dELETELiveStreamsLiveStreamIdThumbnailTest() throws ApiException {
        String liveStreamId = null;
        LiveStream response = api.dELETELiveStreamsLiveStreamIdThumbnail(liveStreamId);
        // TODO: test validations
    }

    /**
     * List all live streams
     *
     * With no parameters added to the url, this will return all livestreams. Query by name or key to limit the list.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void gETLiveStreamsTest() throws ApiException {
        String streamKey = null;
        String name = null;
        String sortBy = null;
        String sortOrder = null;
        Integer currentPage = null;
        Integer pageSize = null;
        LiveStreamListResponse response = api.gETLiveStreams()
                .streamKey(streamKey)
                .name(name)
                .sortBy(sortBy)
                .sortOrder(sortOrder)
                .currentPage(currentPage)
                .pageSize(pageSize)
                .execute();
        // TODO: test validations
    }

    /**
     * Show live stream
     *
     * Supply a LivestreamId, and you&#39;ll get all the details for streaming into, and watching the livestream. Tutorials that use the [show livestream endpoint](https://api.video/blog/endpoints/live-stream-status).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void gETLiveStreamsLiveStreamIdTest() throws ApiException {
        String liveStreamId = null;
        LiveStream response = api.gETLiveStreamsLiveStreamId(liveStreamId);
        // TODO: test validations
    }

    /**
     * Update a live stream
     *
     * Use this endpoint to update the player, or to turn recording on/off (saving a copy of the livestream). NOTE: If the livestream is actively streaming, changing the recording status will only affect the NEXT stream.    The public&#x3D;false &#39;private livestream&#39; is available as a BETA feature, and should be limited to livestreams of 3,000 viewers or fewer.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void pATCHLiveStreamsLiveStreamIdTest() throws ApiException {
        String liveStreamId = null;
        LiveStreamUpdatePayload liveStreamUpdatePayload = null;
        LiveStream response = api.pATCHLiveStreamsLiveStreamId(liveStreamId, liveStreamUpdatePayload);
        // TODO: test validations
    }

    /**
     * Create live stream
     *
     * A live stream will give you the &#39;connection point&#39; to RTMP your video stream to api.video. It will also give you the details for viewers to watch the same livestream.  The public&#x3D;false &#39;private livestream&#39; is available as a BETA feature, and should be limited to livestreams of 3,000 viewers or fewer. See our [Live Stream Tutorial](https://api.video/blog/tutorials/live-stream-tutorial) for a walkthrough of this API with OBS. Your RTMP endpoint for the livestream is rtmp://broadcast.api.video/s/{streamKey} Tutorials that [create live streams](https://api.video/blog/endpoints/live-create).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void pOSTLiveStreamsTest() throws ApiException {
        LiveStreamCreatePayload liveStreamCreatePayload = null;
        LiveStream response = api.pOSTLiveStreams(liveStreamCreatePayload);
        // TODO: test validations
    }

    /**
     * Upload a thumbnail
     *
     * Upload an image to use as a backdrop for your livestream. Tutorials that [update live stream thumbnails](https://api.video/blog/endpoints/live-upload-a-thumbnail).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void pOSTLiveStreamsLiveStreamIdThumbnailTest() throws ApiException {
        String liveStreamId = null;
        File _file = null;
        LiveStream response = api.pOSTLiveStreamsLiveStreamIdThumbnail(liveStreamId, _file);
        // TODO: test validations
    }

}
