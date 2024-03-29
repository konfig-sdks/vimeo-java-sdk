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
import com.konfigthis.client.model.Album;
import com.konfigthis.client.model.VideosShowcasesAddToMultipleShowcasesRequest;
import com.konfigthis.client.model.VideosShowcasesAddToMultipleShowcasesRequestAddInner;
import com.konfigthis.client.model.VideosShowcasesAddToMultipleShowcasesRequestRemoveInner;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for VideosShowcasesApi
 */
@Disabled
public class VideosShowcasesApiTest {

    private static VideosShowcasesApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new VideosShowcasesApi(apiClient);
    }

    /**
     * Add or remove a video from a list of showcases
     *
     * This method adds or removes the specified video to or from multiple showcases.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addToMultipleShowcasesTest() throws ApiException {
        Double videoId = null;
        List<VideosShowcasesAddToMultipleShowcasesRequestAddInner> add = null;
        List<VideosShowcasesAddToMultipleShowcasesRequestRemoveInner> remove = null;
        List<Album> response = api.addToMultipleShowcases(videoId)
                .add(add)
                .remove(remove)
                .execute();
        // TODO: test validations
    }

    /**
     * Get all the showcases that contain a video
     *
     * This method returns all the showcases that contain the specified video.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAllContShowcasesTest() throws ApiException {
        Double videoId = null;
        Double page = null;
        Double perPage = null;
        List<Album> response = api.getAllContShowcases(videoId)
                .page(page)
                .perPage(perPage)
                .execute();
        // TODO: test validations
    }

}
