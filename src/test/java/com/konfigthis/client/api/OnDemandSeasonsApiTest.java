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
import com.konfigthis.client.model.OnDemandSeason;
import com.konfigthis.client.model.Video;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for OnDemandSeasonsApi
 */
@Disabled
public class OnDemandSeasonsApiTest {

    private static OnDemandSeasonsApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new OnDemandSeasonsApi(apiClient);
    }

    /**
     * Get all the videos in a season on an On Demand page
     *
     * This method returns every video in the specified season on an On Demand page.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAllVideosInSeasonTest() throws ApiException {
        Double ondemandId = null;
        Double seasonId = null;
        String filter = null;
        Double page = null;
        Double perPage = null;
        String sort = null;
        List<Video> response = api.getAllVideosInSeason(ondemandId, seasonId)
                .filter(filter)
                .page(page)
                .perPage(perPage)
                .sort(sort)
                .execute();
        // TODO: test validations
    }

    /**
     * Get all the seasons on an On Demand page
     *
     * This method returns every season on the specified On Demand page.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listAllTest() throws ApiException {
        Double ondemandId = null;
        String direction = null;
        String filter = null;
        Double page = null;
        Double perPage = null;
        String sort = null;
        List<OnDemandSeason> response = api.listAll(ondemandId)
                .direction(direction)
                .filter(filter)
                .page(page)
                .perPage(perPage)
                .sort(sort)
                .execute();
        // TODO: test validations
    }

    /**
     * Get a specific season on an On Demand page
     *
     * This method returns a single season on the specified On Demand page.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void specificGetTest() throws ApiException {
        Double ondemandId = null;
        Double seasonId = null;
        OnDemandSeason response = api.specificGet(ondemandId, seasonId)
                .execute();
        // TODO: test validations
    }

}
