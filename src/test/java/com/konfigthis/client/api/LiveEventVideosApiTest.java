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
import com.konfigthis.client.model.LiveEventVideosAddMultipleRequest;
import com.konfigthis.client.model.LiveEventVideosAddMultipleRequestVideosInner;
import com.konfigthis.client.model.LiveEventVideosAddMultipleVideosRequest;
import com.konfigthis.client.model.LiveEventVideosAddMultipleVideosRequestVideosInner;
import com.konfigthis.client.model.LiveEventVideosRemoveMultipleRequest;
import com.konfigthis.client.model.LiveEventVideosRemoveMultipleRequest1;
import com.konfigthis.client.model.LiveEventVideosRemoveMultipleRequest1VideosInner;
import com.konfigthis.client.model.LiveEventVideosRemoveMultipleRequestVideosInner;
import com.konfigthis.client.model.LiveEventVideosRemoveMultipleVideosRequest;
import com.konfigthis.client.model.LiveEventVideosRemoveMultipleVideosRequestVideosInner;
import com.konfigthis.client.model.LiveEventVideosUploadMultipleRequest;
import com.konfigthis.client.model.LiveEventVideosUploadMultipleRequestVideosInner;
import com.konfigthis.client.model.Video;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for LiveEventVideosApi
 */
@Disabled
public class LiveEventVideosApiTest {

    private static LiveEventVideosApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new LiveEventVideosApi(apiClient);
    }

    /**
     * Add a list of videos to a live event
     *
     * This method adds multiple videos to the specified event.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addMultipleTest() throws ApiException {
        Double liveEventId = null;
        List<LiveEventVideosAddMultipleRequestVideosInner> videos = null;
        api.addMultiple(liveEventId)
                .videos(videos)
                .execute();
        // TODO: test validations
    }

    /**
     * Add a list of videos to a live event
     *
     * This method adds multiple videos to the specified event.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addMultipleVideosTest() throws ApiException {
        Double liveEventId = null;
        Double userId = null;
        List<LiveEventVideosAddMultipleVideosRequestVideosInner> videos = null;
        api.addMultipleVideos(liveEventId, userId)
                .videos(videos)
                .execute();
        // TODO: test validations
    }

    /**
     * Get all the videos in a live event
     *
     * This method returns every video in the specified event.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAllTest() throws ApiException {
        Double liveEventId = null;
        String containingUri = null;
        String direction = null;
        String filter = null;
        Boolean filterEmbeddable = null;
        Double page = null;
        Double perPage = null;
        String query = null;
        String sort = null;
        List<Video> response = api.getAll(liveEventId)
                .containingUri(containingUri)
                .direction(direction)
                .filter(filter)
                .filterEmbeddable(filterEmbeddable)
                .page(page)
                .perPage(perPage)
                .query(query)
                .sort(sort)
                .execute();
        // TODO: test validations
    }

    /**
     * Get a specific video in a live event
     *
     * This method returns a single video in the specified event.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSpecificVideoTest() throws ApiException {
        Double liveEventId = null;
        Double userId = null;
        Double videoId = null;
        Video response = api.getSpecificVideo(liveEventId, userId, videoId)
                .execute();
        // TODO: test validations
    }

    /**
     * Get all the videos in a live event
     *
     * This method returns every video in the specified event.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listAllVideosInEventTest() throws ApiException {
        Double liveEventId = null;
        Double userId = null;
        String containingUri = null;
        String direction = null;
        String filter = null;
        Boolean filterEmbeddable = null;
        Double page = null;
        Double perPage = null;
        String query = null;
        String sort = null;
        List<Video> response = api.listAllVideosInEvent(liveEventId, userId)
                .containingUri(containingUri)
                .direction(direction)
                .filter(filter)
                .filterEmbeddable(filterEmbeddable)
                .page(page)
                .perPage(perPage)
                .query(query)
                .sort(sort)
                .execute();
        // TODO: test validations
    }

    /**
     * Get all the videos in a live event
     *
     * This method returns every video in the specified event.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listLiveEventVideosTest() throws ApiException {
        Double liveEventId = null;
        String containingUri = null;
        String direction = null;
        String filter = null;
        Boolean filterEmbeddable = null;
        Double page = null;
        Double perPage = null;
        String query = null;
        String sort = null;
        List<Video> response = api.listLiveEventVideos(liveEventId)
                .containingUri(containingUri)
                .direction(direction)
                .filter(filter)
                .filterEmbeddable(filterEmbeddable)
                .page(page)
                .perPage(perPage)
                .query(query)
                .sort(sort)
                .execute();
        // TODO: test validations
    }

    /**
     * Remove a list of videos from a live event
     *
     * This method removes multiple videos from the specified event.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeMultipleTest() throws ApiException {
        Double liveEventId = null;
        List<LiveEventVideosRemoveMultipleRequestVideosInner> videos = null;
        api.removeMultiple(liveEventId)
                .videos(videos)
                .execute();
        // TODO: test validations
    }

    /**
     * Remove a list of videos from a live event
     *
     * This method removes multiple videos from the specified event.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeMultipleVideosTest() throws ApiException {
        Double liveEventId = null;
        List<LiveEventVideosRemoveMultipleVideosRequestVideosInner> videos = null;
        api.removeMultipleVideos(liveEventId)
                .videos(videos)
                .execute();
        // TODO: test validations
    }

    /**
     * Remove a list of videos from a live event
     *
     * This method removes multiple videos from the specified event.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeMultiple_0Test() throws ApiException {
        Double liveEventId = null;
        Double userId = null;
        List<LiveEventVideosRemoveMultipleRequest1VideosInner> videos = null;
        api.removeMultiple_0(liveEventId, userId)
                .videos(videos)
                .execute();
        // TODO: test validations
    }

    /**
     * Get a specific video in a live event
     *
     * This method returns a single video in the specified event.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void specificEventVideoTest() throws ApiException {
        Double liveEventId = null;
        Double videoId = null;
        Video response = api.specificEventVideo(liveEventId, videoId)
                .execute();
        // TODO: test validations
    }

    /**
     * Get a specific video in a live event
     *
     * This method returns a single video in the specified event.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void specificVideoTest() throws ApiException {
        Double liveEventId = null;
        Double videoId = null;
        Video response = api.specificVideo(liveEventId, videoId)
                .execute();
        // TODO: test validations
    }

    /**
     * Add a list of videos to a live event
     *
     * This method adds multiple videos to the specified event.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void uploadMultipleTest() throws ApiException {
        Double liveEventId = null;
        List<LiveEventVideosUploadMultipleRequestVideosInner> videos = null;
        api.uploadMultiple(liveEventId)
                .videos(videos)
                .execute();
        // TODO: test validations
    }

}