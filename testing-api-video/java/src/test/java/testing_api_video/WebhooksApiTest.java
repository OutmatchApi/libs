/*
 * api.video
 * api.video is an API that encodes on the go to facilitate immediate playback, enhancing viewer streaming experiences across multiple devices and platforms. You can stream live or on-demand online videos within minutes.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package testing_api_video;

import invalidPackageName.ApiException;
import com.outmatchapi.testing_api_video.BadRequest;
import com.outmatchapi.testing_api_video.NotFound;
import com.outmatchapi.testing_api_video.Webhook;
import com.outmatchapi.testing_api_video.WebhooksCreatePayload;
import com.outmatchapi.testing_api_video.WebhooksListResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for WebhooksApi
 */
@Disabled
public class WebhooksApiTest {

    private final WebhooksApi api = new WebhooksApi();

    /**
     * Delete a Webhook
     *
     * This endpoint will delete the indicated webhook.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void dELETEWebhookTest() throws ApiException {
        String webhookId = null;
        api.dELETEWebhook(webhookId);
        // TODO: test validations
    }

    /**
     * Show Webhook details
     *
     * This call provides the same JSON information provided on Webjhook creation.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void gETWebhookTest() throws ApiException {
        String webhookId = null;
        Webhook response = api.gETWebhook(webhookId);
        // TODO: test validations
    }

    /**
     * List all webhooks
     *
     * Requests to this endpoint return a list of your webhooks (with all their details). You can filter what the webhook list that the API returns using the parameters described below.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void lISTWebhooksTest() throws ApiException {
        String events = null;
        Integer currentPage = null;
        Integer pageSize = null;
        WebhooksListResponse response = api.lISTWebhooks()
                .events(events)
                .currentPage(currentPage)
                .pageSize(pageSize)
                .execute();
        // TODO: test validations
    }

    /**
     * Create Webhook
     *
     * Webhooks can push notifications to your server, rather than polling api.video for changes. We currently offer four events:  * &#x60;&#x60;&#x60;video.encoding.quality.completed&#x60;&#x60;&#x60;  When a new video is uploaded into your account, it will be encoded into several different HLS sizes/bitrates.  When each version is encoded, your webhook will get a notification.  It will look like &#x60;&#x60;&#x60;{ \\\&quot;type\\\&quot;: \\\&quot;video.encoding.quality.completed\\\&quot;, \\\&quot;emittedAt\\\&quot;: \\\&quot;2021-01-29T16:46:25.217+01:00\\\&quot;, \\\&quot;videoId\\\&quot;: \\\&quot;viXXXXXXXX\\\&quot;, \\\&quot;encoding\\\&quot;: \\\&quot;hls\\\&quot;, \\\&quot;quality\\\&quot;: \\\&quot;720p\\\&quot;} &#x60;&#x60;&#x60;. This request says that the 720p HLS encoding was completed. * &#x60;&#x60;&#x60;live-stream.broadcast.started&#x60;&#x60;&#x60;  When a livestream begins broadcasting, the broadcasting parameter changes from false to true, and this webhook fires. * &#x60;&#x60;&#x60;live-stream.broadcast.ended&#x60;&#x60;&#x60;  This event fores when the livestream has finished broadcasting, and the broadcasting parameter flips from false to true. * &#x60;&#x60;&#x60;video.source.recorded&#x60;&#x60;&#x60;  This event is similar to &#x60;&#x60;&#x60;video.encoding.quality.completed&#x60;&#x60;&#x60;, but tells you if a livestream has been recorded as a VOD.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void pOSTWebhooksTest() throws ApiException {
        WebhooksCreatePayload webhooksCreatePayload = null;
        Webhook response = api.pOSTWebhooks(webhooksCreatePayload);
        // TODO: test validations
    }

}
