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
import com.konfigthis.client.model.Video;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for GroupsVideosApi
 */
@Disabled
public class GroupsVideosApiTest {

    private static GroupsVideosApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new GroupsVideosApi(apiClient);
    }

    /**
     * Add a video to a group
     *
     * This method adds a video to the specified group. The authenticated user must be the owner of the group.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addToGroupTest() throws ApiException {
        Double groupId = null;
        Double videoId = null;
        Video response = api.addToGroup(groupId, videoId)
                .execute();
        // TODO: test validations
    }

    /**
     * Get all the videos in a group
     *
     * This method returns every video from the specified group.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAllGroupVideosTest() throws ApiException {
        Double groupId = null;
        String direction = null;
        String filter = null;
        Boolean filterEmbeddable = null;
        Double page = null;
        Double perPage = null;
        String query = null;
        String sort = null;
        List<Video> response = api.getAllGroupVideos(groupId)
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
     * Get a specific video in a group
     *
     * This method returns a single video from the specified group. You can use this method to determine whether the video belongs to the group.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSingleVideoTest() throws ApiException {
        Double groupId = null;
        Double videoId = null;
        Video response = api.getSingleVideo(groupId, videoId)
                .execute();
        // TODO: test validations
    }

    /**
     * Remove a video from a group
     *
     * This method removes a video from the specified group. The authenticated user must be the owner of the group.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeFromGroupTest() throws ApiException {
        Double groupId = null;
        Double videoId = null;
        api.removeFromGroup(groupId, videoId)
                .execute();
        // TODO: test validations
    }

}
