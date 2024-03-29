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
import com.konfigthis.client.model.LiveEventThumbnailsAddThumbnailRequest;
import com.konfigthis.client.model.LiveEventThumbnailsCreateThumbnailForEventRequest;
import com.konfigthis.client.model.LiveEventThumbnailsCreateThumbnailForEventRequest1;
import com.konfigthis.client.model.LiveEventThumbnailsEditEventThumbnailRequest;
import com.konfigthis.client.model.LiveEventThumbnailsEditLiveEventThumbnailRequest;
import com.konfigthis.client.model.LiveEventThumbnailsUpdateEventThumbnailRequest;
import com.konfigthis.client.model.Picture;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for LiveEventThumbnailsApi
 */
@Disabled
public class LiveEventThumbnailsApiTest {

    private static LiveEventThumbnailsApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new LiveEventThumbnailsApi(apiClient);
    }

    /**
     * Create a live event thumbnail
     *
     * This method creates a thumbnail image for the specified event.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addThumbnailTest() throws ApiException {
        Double liveEventId = null;
        Boolean active = null;
        Picture response = api.addThumbnail(liveEventId)
                .active(active)
                .execute();
        // TODO: test validations
    }

    /**
     * Create a live event thumbnail
     *
     * This method creates a thumbnail image for the specified event.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createThumbnailForEventTest() throws ApiException {
        Double liveEventId = null;
        Boolean active = null;
        Picture response = api.createThumbnailForEvent(liveEventId)
                .active(active)
                .execute();
        // TODO: test validations
    }

    /**
     * Create a live event thumbnail
     *
     * This method creates a thumbnail image for the specified event.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createThumbnailForEvent_0Test() throws ApiException {
        Double liveEventId = null;
        Double userId = null;
        Boolean active = null;
        Picture response = api.createThumbnailForEvent_0(liveEventId, userId)
                .active(active)
                .execute();
        // TODO: test validations
    }

    /**
     * Delete a live event thumbnail
     *
     * This method deletes a thumbnail image for the specified event.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteForEventTest() throws ApiException {
        Double liveEventId = null;
        Double thumbnailId = null;
        api.deleteForEvent(liveEventId, thumbnailId)
                .execute();
        // TODO: test validations
    }

    /**
     * Delete a live event thumbnail
     *
     * This method deletes a thumbnail image for the specified event.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteThumbnailForEventTest() throws ApiException {
        Double liveEventId = null;
        Double thumbnailId = null;
        api.deleteThumbnailForEvent(liveEventId, thumbnailId)
                .execute();
        // TODO: test validations
    }

    /**
     * Delete a live event thumbnail
     *
     * This method deletes a thumbnail image for the specified event.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteThumbnailForEvent_0Test() throws ApiException {
        Double liveEventId = null;
        Double thumbnailId = null;
        Double userId = null;
        api.deleteThumbnailForEvent_0(liveEventId, thumbnailId, userId)
                .execute();
        // TODO: test validations
    }

    /**
     * Edit a live event thumbnail
     *
     * This method edits a thumbnail image for the specified event.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void editEventThumbnailTest() throws ApiException {
        Double liveEventId = null;
        Double thumbnailId = null;
        Double userId = null;
        Boolean active = null;
        Picture response = api.editEventThumbnail(liveEventId, thumbnailId, userId)
                .active(active)
                .execute();
        // TODO: test validations
    }

    /**
     * Edit a live event thumbnail
     *
     * This method edits a thumbnail image for the specified event.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void editLiveEventThumbnailTest() throws ApiException {
        Double liveEventId = null;
        Double thumbnailId = null;
        Boolean active = null;
        Picture response = api.editLiveEventThumbnail(liveEventId, thumbnailId)
                .active(active)
                .execute();
        // TODO: test validations
    }

    /**
     * Get all the thumbnails of a live event
     *
     * This method returns every thumbnail image of the specified event.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAllTest() throws ApiException {
        Double liveEventId = null;
        List<Picture> response = api.getAll(liveEventId)
                .execute();
        // TODO: test validations
    }

    /**
     * Get all the thumbnails of a live event
     *
     * This method returns every thumbnail image of the specified event.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAllThumbnailsTest() throws ApiException {
        Double liveEventId = null;
        List<Picture> response = api.getAllThumbnails(liveEventId)
                .execute();
        // TODO: test validations
    }

    /**
     * Get all the thumbnails of a live event
     *
     * This method returns every thumbnail image of the specified event.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAllThumbsTest() throws ApiException {
        Double liveEventId = null;
        Double userId = null;
        List<Picture> response = api.getAllThumbs(liveEventId, userId)
                .execute();
        // TODO: test validations
    }

    /**
     * Get a specific live event thumbnail
     *
     * This method returns a single thumbnail image of the specified event.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSpecificThumbnailTest() throws ApiException {
        Double liveEventId = null;
        Double thumbnailId = null;
        Picture response = api.getSpecificThumbnail(liveEventId, thumbnailId)
                .execute();
        // TODO: test validations
    }

    /**
     * Get a specific live event thumbnail
     *
     * This method returns a single thumbnail image of the specified event.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSpecificThumbnail_0Test() throws ApiException {
        Double liveEventId = null;
        Double thumbnailId = null;
        Picture response = api.getSpecificThumbnail_0(liveEventId, thumbnailId)
                .execute();
        // TODO: test validations
    }

    /**
     * Get a specific live event thumbnail
     *
     * This method returns a single thumbnail image of the specified event.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSpecificThumbnail_1Test() throws ApiException {
        Double liveEventId = null;
        Double thumbnailId = null;
        Double userId = null;
        Picture response = api.getSpecificThumbnail_1(liveEventId, thumbnailId, userId)
                .execute();
        // TODO: test validations
    }

    /**
     * Edit a live event thumbnail
     *
     * This method edits a thumbnail image for the specified event.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateEventThumbnailTest() throws ApiException {
        Double liveEventId = null;
        Double thumbnailId = null;
        Boolean active = null;
        Picture response = api.updateEventThumbnail(liveEventId, thumbnailId)
                .active(active)
                .execute();
        // TODO: test validations
    }

}
