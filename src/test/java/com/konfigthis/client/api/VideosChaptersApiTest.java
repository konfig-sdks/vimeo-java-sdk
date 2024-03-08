/*
 * Vimeo API
 * Build something great. Vimeo's API supports flexible, high-quality video integration with your custom apps.
 *
 * The version of the OpenAPI document: 3.4
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.api;

import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.Chapter;
import com.konfigthis.client.model.CreateChapterRequest;
import com.konfigthis.client.model.EditChapterRequest;
import com.konfigthis.client.model.Picture;
import com.konfigthis.client.model.VideosChaptersGenerateChapterThumbnailOrUploadLinkRequest;
import com.konfigthis.client.model.VideosChaptersGenerateChapterThumbnailRequest;
import com.konfigthis.client.model.VideosChaptersSetChapterThumbnailActiveRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for VideosChaptersApi
 */
@Disabled
public class VideosChaptersApiTest {

    private static VideosChaptersApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new VideosChaptersApi(apiClient);
    }

    /**
     * Add a chapter to a video
     *
     * This method adds a chapter to the specified video.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void chapterTest() throws ApiException {
        Double videoId = null;
        String title = null;
        String activeThumbnailUri = null;
        List<String> thumbnailUris = null;
        Double timecode = null;
        Chapter response = api.chapter(videoId)
                .title(title)
                .activeThumbnailUri(activeThumbnailUri)
                .thumbnailUris(thumbnailUris)
                .timecode(timecode)
                .execute();
        // TODO: test validations
    }

    /**
     * Get a specific chapter
     *
     * This method returns a single chapter of the specified video.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void chapter_0Test() throws ApiException {
        Double chapterId = null;
        Double videoId = null;
        Chapter response = api.chapter_0(chapterId, videoId)
                .execute();
        // TODO: test validations
    }

    /**
     * Delete a chapter
     *
     * This method deletes the specified chapter from a video. The authenticated user must be the owner of the video.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void chapter_1Test() throws ApiException {
        Double chapterId = null;
        Double videoId = null;
        api.chapter_1(chapterId, videoId)
                .execute();
        // TODO: test validations
    }

    /**
     * Edit a chapter
     *
     * This method edits the specified chapter of a video. The authenticated user must be the owner of the video.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void chapter_2Test() throws ApiException {
        Double chapterId = null;
        Double videoId = null;
        String title = null;
        String activeThumbnailUri = null;
        Double timecode = null;
        Chapter response = api.chapter_2(chapterId, videoId)
                .title(title)
                .activeThumbnailUri(activeThumbnailUri)
                .timecode(timecode)
                .execute();
        // TODO: test validations
    }

    /**
     * Get all the chapters of a video
     *
     * This method returns every chapter of the specified video.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void chaptersTest() throws ApiException {
        Double videoId = null;
        Double page = null;
        Double perPage = null;
        List<Chapter> response = api.chapters(videoId)
                .page(page)
                .perPage(perPage)
                .execute();
        // TODO: test validations
    }

    /**
     * Delete a chapter thumbnail
     *
     * This method deletes the specified chapter thumbnail from a video.  The authenticated user must be the owner of the video that the chapter belongs to. This method deletes both timecode-generated and custom-uploaded thumbnails.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteChapterThumbnailTest() throws ApiException {
        Double chapterId = null;
        String uid = null;
        Double videoId = null;
        api.deleteChapterThumbnail(chapterId, uid, videoId)
                .execute();
        // TODO: test validations
    }

    /**
     * Generate an upload link or timecode-based thumbnail for an unsaved video chapter
     *
     * This method generates either an upload link or a timecode-based thumbnail for an unsaved video chapter. To generate the upload link, which enables the authenticated user to upload a chapter thumbnail image manually, leave the body of the request empty. To generate an automatic timecode-based thumbnail, specify the **timecode** parameter in the body of the request.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void generateChapterThumbnailTest() throws ApiException {
        Double videoId = null;
        Double timecode = null;
        Picture response = api.generateChapterThumbnail(videoId)
                .timecode(timecode)
                .execute();
        // TODO: test validations
    }

    /**
     * Generate an upload link or timecode-based thumbnail for a saved video chapter
     *
     * This method generates either an upload link or a timecode-based thumbnail for the specified saved video chapter. To generate the upload link, which enables the authenticated user to upload a chapter thumbnail image manually, leave the body of the request empty. To generate an automatic timecode-based thumbnail, include the **timecode** parameter in the body of the request.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void generateChapterThumbnailOrUploadLinkTest() throws ApiException {
        Double chapterId = null;
        Double videoId = null;
        Double timecode = null;
        Picture response = api.generateChapterThumbnailOrUploadLink(chapterId, videoId)
                .timecode(timecode)
                .execute();
        // TODO: test validations
    }

    /**
     * Get all the thumbnails associated with a saved video chapter
     *
     * This method returns every thumbnail associated with the specified saved video chapter.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getChapterThumbnailsTest() throws ApiException {
        Double chapterId = null;
        Double videoId = null;
        Picture response = api.getChapterThumbnails(chapterId, videoId)
                .execute();
        // TODO: test validations
    }

    /**
     * Get a single chapter thumbnail associated with an unsaved video chapter
     *
     * This method returns the specified thumbnail associated with an unsaved video chapter.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSingleChapterThumbnailTest() throws ApiException {
        Double videoId = null;
        Picture response = api.getSingleChapterThumbnail(videoId)
                .execute();
        // TODO: test validations
    }

    /**
     * Get a single chapter thumbnail associated with a saved video chapter
     *
     * This method returns the specified thumbnail associated with a saved video chapter.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSingleChapterThumbnail_0Test() throws ApiException {
        Double chapterId = null;
        Double videoId = null;
        Picture response = api.getSingleChapterThumbnail_0(chapterId, videoId)
                .execute();
        // TODO: test validations
    }

    /**
     * Set a chapter thumbnail as active
     *
     * This method sets the specified chapter thumbnail for a video as active.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void setChapterThumbnailActiveTest() throws ApiException {
        Double chapterId = null;
        Double videoId = null;
        Boolean active = null;
        Picture response = api.setChapterThumbnailActive(chapterId, videoId)
                .active(active)
                .execute();
        // TODO: test validations
    }

}
