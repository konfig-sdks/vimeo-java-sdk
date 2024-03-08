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
import com.konfigthis.client.model.Analytics;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UsersAnalyticsApi
 */
@Disabled
public class UsersAnalyticsApiTest {

    private static UsersAnalyticsApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new UsersAnalyticsApi(apiClient);
    }

    /**
     * Get analytics for the user
     *
     * This method returns analytic metrics for the authenticated user.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getMetricsTest() throws ApiException {
        Double userId = null;
        String dimension = null;
        String from = null;
        String to = null;
        String direction = null;
        String filterContent = null;
        List<String> filterCountries = null;
        List<String> filterDeviceTypes = null;
        List<String> filterEmbedDomains = null;
        List<String> filterStreamingTypes = null;
        Double page = null;
        Double perPage = null;
        String sort = null;
        String timeInterval = null;
        List<Analytics> response = api.getMetrics(userId, dimension, from, to)
                .direction(direction)
                .filterContent(filterContent)
                .filterCountries(filterCountries)
                .filterDeviceTypes(filterDeviceTypes)
                .filterEmbedDomains(filterEmbedDomains)
                .filterStreamingTypes(filterStreamingTypes)
                .page(page)
                .perPage(perPage)
                .sort(sort)
                .timeInterval(timeInterval)
                .execute();
        // TODO: test validations
    }

    /**
     * Get analytics for the user
     *
     * This method returns analytic metrics for the authenticated user.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getUserMetricsTest() throws ApiException {
        String dimension = null;
        String from = null;
        String to = null;
        String direction = null;
        String filterContent = null;
        List<String> filterCountries = null;
        List<String> filterDeviceTypes = null;
        List<String> filterEmbedDomains = null;
        List<String> filterStreamingTypes = null;
        Double page = null;
        Double perPage = null;
        String sort = null;
        String timeInterval = null;
        List<Analytics> response = api.getUserMetrics(dimension, from, to)
                .direction(direction)
                .filterContent(filterContent)
                .filterCountries(filterCountries)
                .filterDeviceTypes(filterDeviceTypes)
                .filterEmbedDomains(filterEmbedDomains)
                .filterStreamingTypes(filterStreamingTypes)
                .page(page)
                .perPage(perPage)
                .sort(sort)
                .timeInterval(timeInterval)
                .execute();
        // TODO: test validations
    }

}
