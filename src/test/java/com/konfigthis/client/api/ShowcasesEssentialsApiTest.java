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
import com.konfigthis.client.model.CreateShowcaseRequest;
import com.konfigthis.client.model.EditShowcaseRequest;
import com.konfigthis.client.model.ShowcasesEssentialsCreateUserShowcaseRequest;
import com.konfigthis.client.model.ShowcasesEssentialsEditShowcaseRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ShowcasesEssentialsApi
 */
@Disabled
public class ShowcasesEssentialsApiTest {

    private static ShowcasesEssentialsApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new ShowcasesEssentialsApi(apiClient);
    }

    /**
     * Create a showcase
     *
     * This method creates a new showcase for the specified user.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createUserShowcaseTest() throws ApiException {
        String name = null;
        String description = null;
        String brandColor = null;
        Boolean hideFromVimeo = null;
        Boolean hideNav = null;
        Boolean hideUpcoming = null;
        String layout = null;
        String password = null;
        String privacy = null;
        Boolean reviewMode = null;
        String sort = null;
        String theme = null;
        Album response = api.createUserShowcase(name)
                .description(description)
                .brandColor(brandColor)
                .hideFromVimeo(hideFromVimeo)
                .hideNav(hideNav)
                .hideUpcoming(hideUpcoming)
                .layout(layout)
                .password(password)
                .privacy(privacy)
                .reviewMode(reviewMode)
                .sort(sort)
                .theme(theme)
                .execute();
        // TODO: test validations
    }

    /**
     * Delete a showcase
     *
     * This method deletes the specified showcase. The authenticated user must be the owner of the showcase.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteShowcaseTest() throws ApiException {
        Double albumId = null;
        api.deleteShowcase(albumId)
                .execute();
        // TODO: test validations
    }

    /**
     * Edit a showcase
     *
     * This method edits the specified showcase. The authenticated user must be the owner of the showcase.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void editShowcaseTest() throws ApiException {
        Double albumId = null;
        String description = null;
        String brandColor = null;
        String domain = null;
        Boolean hideNav = null;
        Boolean hideUpcoming = null;
        String layout = null;
        String name = null;
        String password = null;
        String privacy = null;
        Boolean reviewMode = null;
        String sort = null;
        String theme = null;
        String url = null;
        Boolean useCustomDomain = null;
        Album response = api.editShowcase(albumId)
                .description(description)
                .brandColor(brandColor)
                .domain(domain)
                .hideNav(hideNav)
                .hideUpcoming(hideUpcoming)
                .layout(layout)
                .name(name)
                .password(password)
                .privacy(privacy)
                .reviewMode(reviewMode)
                .sort(sort)
                .theme(theme)
                .url(url)
                .useCustomDomain(useCustomDomain)
                .execute();
        // TODO: test validations
    }

    /**
     * Get all the showcases that belong to the user
     *
     * This method returns every showcase belonging to the authenticated user.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAllUserShowcasesTest() throws ApiException {
        String direction = null;
        Double page = null;
        Double perPage = null;
        String query = null;
        String sort = null;
        List<Album> response = api.getAllUserShowcases()
                .direction(direction)
                .page(page)
                .perPage(perPage)
                .query(query)
                .sort(sort)
                .execute();
        // TODO: test validations
    }

    /**
     * Get a specific showcase
     *
     * This method returns the specified showcase. The authenticated user must be the owner of the showcase.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSpecificShowcaseTest() throws ApiException {
        Double albumId = null;
        Album response = api.getSpecificShowcase(albumId)
                .execute();
        // TODO: test validations
    }

    /**
     * Create a showcase
     *
     * This method creates a new showcase for the specified user.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void showcaseTest() throws ApiException {
        String name = null;
        Double userId = null;
        String description = null;
        String brandColor = null;
        Boolean hideFromVimeo = null;
        Boolean hideNav = null;
        Boolean hideUpcoming = null;
        String layout = null;
        String password = null;
        String privacy = null;
        Boolean reviewMode = null;
        String sort = null;
        String theme = null;
        Album response = api.showcase(name, userId)
                .description(description)
                .brandColor(brandColor)
                .hideFromVimeo(hideFromVimeo)
                .hideNav(hideNav)
                .hideUpcoming(hideUpcoming)
                .layout(layout)
                .password(password)
                .privacy(privacy)
                .reviewMode(reviewMode)
                .sort(sort)
                .theme(theme)
                .execute();
        // TODO: test validations
    }

    /**
     * Get a specific showcase
     *
     * This method returns the specified showcase. The authenticated user must be the owner of the showcase.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void showcase_0Test() throws ApiException {
        Double albumId = null;
        Double userId = null;
        Album response = api.showcase_0(albumId, userId)
                .execute();
        // TODO: test validations
    }

    /**
     * Delete a showcase
     *
     * This method deletes the specified showcase. The authenticated user must be the owner of the showcase.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void showcase_1Test() throws ApiException {
        Double albumId = null;
        Double userId = null;
        api.showcase_1(albumId, userId)
                .execute();
        // TODO: test validations
    }

    /**
     * Edit a showcase
     *
     * This method edits the specified showcase. The authenticated user must be the owner of the showcase.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void showcase_2Test() throws ApiException {
        Double albumId = null;
        Double userId = null;
        String description = null;
        String brandColor = null;
        String domain = null;
        Boolean hideNav = null;
        Boolean hideUpcoming = null;
        String layout = null;
        String name = null;
        String password = null;
        String privacy = null;
        Boolean reviewMode = null;
        String sort = null;
        String theme = null;
        String url = null;
        Boolean useCustomDomain = null;
        Album response = api.showcase_2(albumId, userId)
                .description(description)
                .brandColor(brandColor)
                .domain(domain)
                .hideNav(hideNav)
                .hideUpcoming(hideUpcoming)
                .layout(layout)
                .name(name)
                .password(password)
                .privacy(privacy)
                .reviewMode(reviewMode)
                .sort(sort)
                .theme(theme)
                .url(url)
                .useCustomDomain(useCustomDomain)
                .execute();
        // TODO: test validations
    }

    /**
     * Get all the showcases that belong to the user
     *
     * This method returns every showcase belonging to the authenticated user.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void showcasesTest() throws ApiException {
        Double userId = null;
        String direction = null;
        Double page = null;
        Double perPage = null;
        String query = null;
        String sort = null;
        List<Album> response = api.showcases(userId)
                .direction(direction)
                .page(page)
                .perPage(perPage)
                .query(query)
                .sort(sort)
                .execute();
        // TODO: test validations
    }

    /**
     * Add videos and live events to showcases
     *
     * This method adds videos and events to the specified showcases. The authenticated user must either be the owner of the showcase or have team permissions.  The present setup permits only one event per showcase.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void showcases_0Test() throws ApiException {
        Double userId = null;
        String albumItemUris = null;
        String albumUris = null;
        api.showcases_0(userId, albumItemUris, albumUris)
                .execute();
        // TODO: test validations
    }

}
