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
import com.konfigthis.client.model.AnimatedThumbset;
import com.konfigthis.client.model.VideosAnimatedThumbnailsCreateSetRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for VideosAnimatedThumbnailsApi
 */
@Disabled
public class VideosAnimatedThumbnailsApiTest {

    private static VideosAnimatedThumbnailsApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new VideosAnimatedThumbnailsApi(apiClient);
    }

    /**
     * Create a set of animated thumbnails for a video
     *
     * This method creates a set of animated thumbnails for the specified video. Please note that you can&#39;t create more than four sets of animated thumbnails for the same video.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createSetTest() throws ApiException {
        Double duration = null;
        Double videoId = null;
        Double startTime = null;
        AnimatedThumbset response = api.createSet(duration, videoId)
                .startTime(startTime)
                .execute();
        // TODO: test validations
    }

    /**
     * Delete a set of animated thumbnails for a video
     *
     * This method deletes a set of animated thumbnails for the specified video.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteSetTest() throws ApiException {
        String pictureId = null;
        Double videoId = null;
        api.deleteSet(pictureId, videoId)
                .execute();
        // TODO: test validations
    }

    /**
     * Get all the animated thumbnails of a video
     *
     * This method returns all the sets of animated thumbnails associated with the specified video. The authenticated user must be the owner of the video.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAllSetsTest() throws ApiException {
        Double videoId = null;
        Double page = null;
        Double perPage = null;
        List<AnimatedThumbset> response = api.getAllSets(videoId)
                .page(page)
                .perPage(perPage)
                .execute();
        // TODO: test validations
    }

    /**
     * Get the status of a set of animated thumbnails
     *
     * This method returns the status of a particular set of animated thumbnails associated with the specified video. The status indicates whether the thumbnails are ready to use. The authenticated user must be the owner of the video.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getStatusOfSetTest() throws ApiException {
        String pictureId = null;
        Double videoId = null;
        AnimatedThumbset response = api.getStatusOfSet(pictureId, videoId)
                .execute();
        // TODO: test validations
    }

    /**
     * Get a specific set of animated thumbnails
     *
     * This method returns a particular set of animated thumbnails associated with the specified video. The authenticated user must be the owner of the video.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void specificSetGetTest() throws ApiException {
        String pictureId = null;
        Double videoId = null;
        AnimatedThumbset response = api.specificSetGet(pictureId, videoId)
                .execute();
        // TODO: test validations
    }

}
