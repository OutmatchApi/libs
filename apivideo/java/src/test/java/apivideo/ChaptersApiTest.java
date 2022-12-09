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
import com.outmatchapi.apivideo.BadRequest;
import com.outmatchapi.apivideo.Chapter;
import com.outmatchapi.apivideo.ChaptersListResponse;
import java.io.File;
import com.outmatchapi.apivideo.NotFound;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ChaptersApi
 */
@Disabled
public class ChaptersApiTest {

    private final ChaptersApi api = new ChaptersApi();

    /**
     * Delete a chapter
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void dELETEVideosVideoIdChaptersLanguageTest() throws ApiException {
        String videoId = null;
        String language = null;
        api.dELETEVideosVideoIdChaptersLanguage(videoId, language);
        // TODO: test validations
    }

    /**
     * List video chapters
     *
     * Retrieve a list of all chapters for a specified video.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void gETVideosVideoIdChaptersTest() throws ApiException {
        String videoId = null;
        Integer currentPage = null;
        Integer pageSize = null;
        ChaptersListResponse response = api.gETVideosVideoIdChapters(videoId)
                .currentPage(currentPage)
                .pageSize(pageSize)
                .execute();
        // TODO: test validations
    }

    /**
     * Show a chapter
     *
     * Chapters help your viewers find the sections of the video they are most interested in viewing. Tutorials that use the [chapters endpoint](https://api.video/blog/endpoints/chapters).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void gETVideosVideoIdChaptersLanguageTest() throws ApiException {
        String videoId = null;
        String language = null;
        Chapter response = api.gETVideosVideoIdChaptersLanguage(videoId, language);
        // TODO: test validations
    }

    /**
     * Upload a chapter
     *
     * Chapters help break the video into sections. Read our [tutorial](https://api.video/blog/tutorials/adding-chapters-to-your-videos) for more details.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void pOSTVideosVideoIdChaptersLanguageTest() throws ApiException {
        String videoId = null;
        String language = null;
        File _file = null;
        Chapter response = api.pOSTVideosVideoIdChaptersLanguage(videoId, language, _file);
        // TODO: test validations
    }

}
