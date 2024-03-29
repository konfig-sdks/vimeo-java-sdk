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
import com.konfigthis.client.model.OnDemandPostersUpdatePosterRequest;
import com.konfigthis.client.model.Picture;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for OnDemandPostersApi
 */
@Disabled
public class OnDemandPostersApiTest {

    private static OnDemandPostersApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new OnDemandPostersApi(apiClient);
    }

    /**
     * Add a poster to an On Demand page
     *
     * This method adds a poster image to the specified On Demand page. The authenticated user must be the owner of the page.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addPosterToPageTest() throws ApiException {
        Double ondemandId = null;
        Picture response = api.addPosterToPage(ondemandId)
                .execute();
        // TODO: test validations
    }

    /**
     * Get all the posters on an On Demand page
     *
     * This method returns every poster on the specified On Demand page.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getOnDemandPagePostersTest() throws ApiException {
        Double ondemandId = null;
        Double page = null;
        Double perPage = null;
        List<Picture> response = api.getOnDemandPagePosters(ondemandId)
                .page(page)
                .perPage(perPage)
                .execute();
        // TODO: test validations
    }

    /**
     * Get a specific poster on an On Demand page
     *
     * This method returns a single poster on the specified On Demand page.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSpecificPosterTest() throws ApiException {
        Double ondemandId = null;
        Double posterId = null;
        Picture response = api.getSpecificPoster(ondemandId, posterId)
                .execute();
        // TODO: test validations
    }

    /**
     * Edit a poster on an On Demand page
     *
     * This method edits a poster image on the specified On Demand page. The authenticated user must be the owner of the page.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updatePosterTest() throws ApiException {
        Double ondemandId = null;
        Double posterId = null;
        Boolean active = null;
        Picture response = api.updatePoster(ondemandId, posterId)
                .active(active)
                .execute();
        // TODO: test validations
    }

}
