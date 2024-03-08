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
import com.konfigthis.client.model.Auth;
import com.konfigthis.client.model.AuthenticationExtrasExchangeOAuthCodeExchangeRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AuthenticationExtrasExchangeApi
 */
@Disabled
public class AuthenticationExtrasExchangeApiTest {

    private static AuthenticationExtrasExchangeApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new AuthenticationExtrasExchangeApi(apiClient);
    }

    /**
     * Exchange an authorization code for an access token
     *
     * This method exchanges an OAuth authorization code for an OAuth access token.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void oAuthCodeExchangeTest() throws ApiException {
        String code = null;
        String grantType = null;
        String redirectUri = null;
        Auth response = api.oAuthCodeExchange(code, grantType, redirectUri)
                .execute();
        // TODO: test validations
    }

}
