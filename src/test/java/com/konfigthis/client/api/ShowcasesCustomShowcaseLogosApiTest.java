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
import com.konfigthis.client.model.Picture;
import com.konfigthis.client.model.ShowcasesCustomShowcaseLogosReplaceLogoRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ShowcasesCustomShowcaseLogosApi
 */
@Disabled
public class ShowcasesCustomShowcaseLogosApiTest {

    private static ShowcasesCustomShowcaseLogosApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new ShowcasesCustomShowcaseLogosApi(apiClient);
    }

    /**
     * Add a custom logo to a showcase
     *
     * This method adds an image file as a custom logo to the specified showcase. The authenticated user must be the owner of the showcase.  For information on how to upload the logo, see our [Working with Thumbnail Uploads](https://developer.vimeo.com/api/upload/thumbnails) guide.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addCustomLogoTest() throws ApiException {
        Double albumId = null;
        Double userId = null;
        Picture response = api.addCustomLogo(albumId, userId)
                .execute();
        // TODO: test validations
    }

    /**
     * Delete a custom showcase logo
     *
     * This method deletes the specified custom logo from its showcase. The authenticated user must be the owner of the showcase.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteCustomLogoTest() throws ApiException {
        Double albumId = null;
        Double logoId = null;
        Double userId = null;
        api.deleteCustomLogo(albumId, logoId, userId)
                .execute();
        // TODO: test validations
    }

    /**
     * Get a specific custom showcase logo
     *
     * This method returns a single custom logo of the specified showcase. The authenticated user must be the owner of the showcase.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSpecificLogoTest() throws ApiException {
        Double albumId = null;
        Double logoId = null;
        Double userId = null;
        Picture response = api.getSpecificLogo(albumId, logoId, userId)
                .execute();
        // TODO: test validations
    }

    /**
     * Get all the custom logos of a showcase
     *
     * This method returns every custom logo of the specified showcase. The authenticated user must be the owner of the showcase.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listAllCustomLogosTest() throws ApiException {
        Double albumId = null;
        Double userId = null;
        Double page = null;
        Double perPage = null;
        List<Picture> response = api.listAllCustomLogos(albumId, userId)
                .page(page)
                .perPage(perPage)
                .execute();
        // TODO: test validations
    }

    /**
     * Replace a custom showcase logo
     *
     * This method replaces the specified custom showcase logo with a new image file. The authenticated user must be the owner of the showcase.  For information on how to upload the logo, see our [Working with Thumbnail Uploads](https://developer.vimeo.com/api/upload/thumbnails) guide.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void replaceLogoTest() throws ApiException {
        Double albumId = null;
        Double logoId = null;
        Double userId = null;
        Boolean active = null;
        Picture response = api.replaceLogo(albumId, logoId, userId)
                .active(active)
                .execute();
        // TODO: test validations
    }

}