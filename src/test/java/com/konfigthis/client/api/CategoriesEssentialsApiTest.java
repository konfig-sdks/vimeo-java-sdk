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
import com.konfigthis.client.model.Category;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CategoriesEssentialsApi
 */
@Disabled
public class CategoriesEssentialsApiTest {

    private static CategoriesEssentialsApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new CategoriesEssentialsApi(apiClient);
    }

    /**
     * Get all categories
     *
     * This method returns every available category.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void categoriesTest() throws ApiException {
        String direction = null;
        Double page = null;
        Double perPage = null;
        String sort = null;
        List<Category> response = api.categories()
                .direction(direction)
                .page(page)
                .perPage(perPage)
                .sort(sort)
                .execute();
        // TODO: test validations
    }

    /**
     * Get a specific category
     *
     * This method returns the specified category.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void categoryTest() throws ApiException {
        String category = null;
        Category response = api.category(category)
                .execute();
        // TODO: test validations
    }

}
