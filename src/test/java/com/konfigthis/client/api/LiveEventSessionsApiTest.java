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
import com.konfigthis.client.model.LiveEventSessionStatus;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for LiveEventSessionsApi
 */
@Disabled
public class LiveEventSessionsApiTest {

    private static LiveEventSessionsApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new LiveEventSessionsApi(apiClient);
    }

    /**
     * Get the ingest status of a one-time live event
     *
     * This method returns the ingest status of the specified event.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getIngestStatusTest() throws ApiException {
        Double videoId = null;
        LiveEventSessionStatus response = api.getIngestStatus(videoId)
                .execute();
        // TODO: test validations
    }

}
