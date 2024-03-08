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
import com.konfigthis.client.model.LiveEventAutomatedClosedCaptions;
import com.konfigthis.client.model.LiveEventAutomatedClosedCaptionsEditPreferenceForEventRequest;
import com.konfigthis.client.model.LiveEventAutomatedClosedCaptionsEditPreferenceForEventRequest1;
import com.konfigthis.client.model.LiveEventAutomatedClosedCaptionsEditPreferenceRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for LiveEventAutomatedClosedCaptionsApi
 */
@Disabled
public class LiveEventAutomatedClosedCaptionsApiTest {

    private static LiveEventAutomatedClosedCaptionsApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new LiveEventAutomatedClosedCaptionsApi(apiClient);
    }

    /**
     * Edit the automated closed captions preference of a live event
     *
     * This method edits the automated closed captions preference for the specified event.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void editPreferenceTest() throws ApiException {
        Boolean autoCcEnabled = null;
        Double liveEventId = null;
        String autoCcKeywords = null;
        String autoCcLang = null;
        LiveEventAutomatedClosedCaptions response = api.editPreference(autoCcEnabled, liveEventId)
                .autoCcKeywords(autoCcKeywords)
                .autoCcLang(autoCcLang)
                .execute();
        // TODO: test validations
    }

    /**
     * Edit the automated closed captions preference of a live event
     *
     * This method edits the automated closed captions preference for the specified event.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void editPreferenceForEventTest() throws ApiException {
        Boolean autoCcEnabled = null;
        Double liveEventId = null;
        String autoCcKeywords = null;
        String autoCcLang = null;
        LiveEventAutomatedClosedCaptions response = api.editPreferenceForEvent(autoCcEnabled, liveEventId)
                .autoCcKeywords(autoCcKeywords)
                .autoCcLang(autoCcLang)
                .execute();
        // TODO: test validations
    }

    /**
     * Edit the automated closed captions preference of a live event
     *
     * This method edits the automated closed captions preference for the specified event.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void editPreferenceForEvent_0Test() throws ApiException {
        Boolean autoCcEnabled = null;
        Double liveEventId = null;
        Double userId = null;
        String autoCcKeywords = null;
        String autoCcLang = null;
        LiveEventAutomatedClosedCaptions response = api.editPreferenceForEvent_0(autoCcEnabled, liveEventId, userId)
                .autoCcKeywords(autoCcKeywords)
                .autoCcLang(autoCcLang)
                .execute();
        // TODO: test validations
    }

}
