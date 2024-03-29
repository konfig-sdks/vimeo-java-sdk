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
import com.konfigthis.client.model.Video;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UsersWatchHistoryApi
 */
@Disabled
public class UsersWatchHistoryApiTest {

    private static UsersWatchHistoryApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new UsersWatchHistoryApi(apiClient);
    }

    /**
     * Delete the user&#39;s watch history
     *
     * This method deletes the entire watch history of the authenticated user.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteEntireWatchHistoryTest() throws ApiException {
        api.deleteEntireWatchHistory()
                .execute();
        // TODO: test validations
    }

    /**
     * Delete a specific video from the user&#39;s watch history
     *
     * This method deletes the specified video from the authenticated user&#39;s watch history.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteSpecificVideoTest() throws ApiException {
        Double videoId = null;
        api.deleteSpecificVideo(videoId)
                .execute();
        // TODO: test validations
    }

    /**
     * Get all the videos that a user has watched
     *
     * This method returns every video on the authenticated user&#39;s watch history. _This endpoint is deprecated. Any request to it returns empty data with HTTP status code 200._
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getWatchedVideosTest() throws ApiException {
        Double page = null;
        Double perPage = null;
        List<Video> response = api.getWatchedVideos()
                .page(page)
                .perPage(perPage)
                .execute();
        // TODO: test validations
    }

}
