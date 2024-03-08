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
import com.konfigthis.client.model.Channel;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CategoriesChannelsApi
 */
@Disabled
public class CategoriesChannelsApiTest {

    private static CategoriesChannelsApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new CategoriesChannelsApi(apiClient);
    }

    /**
     * Get all the channels in a category
     *
     * This method returns every channel that belongs to the specified category.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listInCategoryTest() throws ApiException {
        String category = null;
        String direction = null;
        Double page = null;
        Double perPage = null;
        String query = null;
        String sort = null;
        List<Channel> response = api.listInCategory(category)
                .direction(direction)
                .page(page)
                .perPage(perPage)
                .query(query)
                .sort(sort)
                .execute();
        // TODO: test validations
    }

}
