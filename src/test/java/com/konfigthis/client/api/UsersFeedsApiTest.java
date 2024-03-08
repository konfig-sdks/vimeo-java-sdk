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
import com.konfigthis.client.model.Activity31;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UsersFeedsApi
 */
@Disabled
public class UsersFeedsApiTest {

    private static UsersFeedsApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new UsersFeedsApi(apiClient);
    }

    /**
     * Get all the videos in the user&#39;s feed
     *
     * This method returns every video in the authenticated user&#39;s feed.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void feedTest() throws ApiException {
        Double userId = null;
        String offset = null;
        Double page = null;
        Double perPage = null;
        String type = null;
        List<Activity31> response = api.feed(userId)
                .offset(offset)
                .page(page)
                .perPage(perPage)
                .type(type)
                .execute();
        // TODO: test validations
    }

    /**
     * Get all the videos in the user&#39;s feed
     *
     * This method returns every video in the authenticated user&#39;s feed.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getUserFeedVideosTest() throws ApiException {
        String offset = null;
        Double page = null;
        Double perPage = null;
        String type = null;
        List<Activity31> response = api.getUserFeedVideos()
                .offset(offset)
                .page(page)
                .perPage(perPage)
                .type(type)
                .execute();
        // TODO: test validations
    }

}
