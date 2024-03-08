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
import com.konfigthis.client.model.Language;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for VideosLanguagesApi
 */
@Disabled
public class VideosLanguagesApiTest {

    private static VideosLanguagesApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new VideosLanguagesApi(apiClient);
    }

    /**
     * Get all languages
     *
     * This method returns all available video languages.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void languagesTest() throws ApiException {
        String filter = null;
        Double page = null;
        Double perPage = null;
        List<Language> response = api.languages()
                .filter(filter)
                .page(page)
                .perPage(perPage)
                .execute();
        // TODO: test validations
    }

}