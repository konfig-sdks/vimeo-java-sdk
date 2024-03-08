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
import com.konfigthis.client.model.Fragments;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for VideosFragmentsApi
 */
@Disabled
public class VideosFragmentsApiTest {

    private static VideosFragmentsApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new VideosFragmentsApi(apiClient);
    }

    /**
     * Get all the fragments for a video
     *
     * This method returns all of the fragments associated with the specified video.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void fragmentsTest() throws ApiException {
        Double videoId = null;
        Fragments response = api.fragments(videoId)
                .execute();
        // TODO: test validations
    }

    /**
     * Update a video&#39;s fragments
     *
     * This method updates the specified video with new fragments.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void fragments_0Test() throws ApiException {
        Double videoId = null;
        api.fragments_0(videoId)
                .execute();
        // TODO: test validations
    }

    /**
     * Delete a video&#39;s fragments
     *
     * This method deletes all fragments for the specified video.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void fragments_1Test() throws ApiException {
        Double videoId = null;
        api.fragments_1(videoId)
                .execute();
        // TODO: test validations
    }

}
