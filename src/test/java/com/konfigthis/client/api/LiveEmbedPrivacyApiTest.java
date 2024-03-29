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
import com.konfigthis.client.model.Domain;
import com.konfigthis.client.model.LiveEmbedPrivacyEmbedEventOnDomainsRequest;
import com.konfigthis.client.model.LiveEmbedPrivacyEmbedEventOnDomainsRequest1;
import com.konfigthis.client.model.LiveEmbedPrivacyEmbedEventOnDomainsRequest2;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for LiveEmbedPrivacyApi
 */
@Disabled
public class LiveEmbedPrivacyApiTest {

    private static LiveEmbedPrivacyApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new LiveEmbedPrivacyApi(apiClient);
    }

    /**
     * Embed a live event on one or more domains
     *
     * This method embeds an event on the specified domains. The embed privacy setting must be &#x60;whitelist&#x60;.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void embedEventOnDomainsTest() throws ApiException {
        Double liveEventId = null;
        List<String> allowedDomains = null;
        api.embedEventOnDomains(liveEventId)
                .allowedDomains(allowedDomains)
                .execute();
        // TODO: test validations
    }

    /**
     * Embed a live event on one or more domains
     *
     * This method embeds an event on the specified domains. The embed privacy setting must be &#x60;whitelist&#x60;.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void embedEventOnDomains_0Test() throws ApiException {
        Double liveEventId = null;
        List<String> allowedDomains = null;
        api.embedEventOnDomains_0(liveEventId)
                .allowedDomains(allowedDomains)
                .execute();
        // TODO: test validations
    }

    /**
     * Embed a live event on one or more domains
     *
     * This method embeds an event on the specified domains. The embed privacy setting must be &#x60;whitelist&#x60;.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void embedEventOnDomains_1Test() throws ApiException {
        Double liveEventId = null;
        Double userId = null;
        List<String> allowedDomains = null;
        api.embedEventOnDomains_1(liveEventId, userId)
                .allowedDomains(allowedDomains)
                .execute();
        // TODO: test validations
    }

    /**
     * Get all the domains on which a live event can be embedded
     *
     * This method returns every whitelisted domain for an event. The embed privacy setting must be &#x60;whitelist&#x60;.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getWhitelistDomainsTest() throws ApiException {
        Double liveEventId = null;
        List<Domain> response = api.getWhitelistDomains(liveEventId)
                .execute();
        // TODO: test validations
    }

    /**
     * Get all the domains on which a live event can be embedded
     *
     * This method returns every whitelisted domain for an event. The embed privacy setting must be &#x60;whitelist&#x60;.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getWhitelistDomains_0Test() throws ApiException {
        Double liveEventId = null;
        List<Domain> response = api.getWhitelistDomains_0(liveEventId)
                .execute();
        // TODO: test validations
    }

    /**
     * Get all the domains on which a live event can be embedded
     *
     * This method returns every whitelisted domain for an event. The embed privacy setting must be &#x60;whitelist&#x60;.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getWhitelistDomains_1Test() throws ApiException {
        Double liveEventId = null;
        Double userId = null;
        List<Domain> response = api.getWhitelistDomains_1(liveEventId, userId)
                .execute();
        // TODO: test validations
    }

}
