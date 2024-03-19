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
import com.konfigthis.client.model.EditVideoRequest;
import com.konfigthis.client.model.EditVideoRequestEmbed;
import com.konfigthis.client.model.EditVideoRequestPrivacy;
import com.konfigthis.client.model.EditVideoRequestReviewPage;
import com.konfigthis.client.model.EditVideoRequestSpatial;
import com.konfigthis.client.model.Video;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for VideosEssentialsApi
 */
@Disabled
public class VideosEssentialsApiTest {

    private static VideosEssentialsApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new VideosEssentialsApi(apiClient);
    }

    /**
     * Get all the videos in which the user appears
     *
     * This method returns all the videos in which the authenticated user has a credited appearance.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void appearancesTest() throws ApiException {
        Double userId = null;
        String direction = null;
        String filter = null;
        Boolean filterEmbeddable = null;
        Double page = null;
        Double perPage = null;
        String query = null;
        String sort = null;
        List<Video> response = api.appearances(userId)
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
     * Check if the user owns a video
     *
     * This method determines whether the authenticated user is the owner of the specified video.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void checkUserOwnershipTest() throws ApiException {
        Double userId = null;
        Double videoId = null;
        Video response = api.checkUserOwnership(userId, videoId)
                .execute();
        // TODO: test validations
    }

    /**
     * Check if the user owns a video
     *
     * This method determines whether the authenticated user is the owner of the specified video.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void checkUserOwnsVideoTest() throws ApiException {
        Double videoId = null;
        Video response = api.checkUserOwnsVideo(videoId)
                .execute();
        // TODO: test validations
    }

    /**
     * Delete a user&#39;s videos
     *
     * This method deletes one or more videos belonging to the specified user. The authenticated user must have permission to delete the videos.  Specify the videos to delete in a comma-separated list by URI using the **uris** query parameter.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteUserVideosTest() throws ApiException {
        String uris = null;
        api.deleteUserVideos(uris)
                .execute();
        // TODO: test validations
    }

    /**
     * Get all the videos that the user has uploaded
     *
     * This method returns all the videos that the authenticated user has uploaded.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAllUserVideosTest() throws ApiException {
        String containingUri = null;
        String direction = null;
        String filter = null;
        Boolean filterEmbeddable = null;
        Boolean filterPlayable = null;
        Boolean filterScreenRecorded = null;
        String filterTag = null;
        String filterTagAllOf = null;
        String filterTagExclude = null;
        String includeTeamContent = null;
        Double page = null;
        Double perPage = null;
        String query = null;
        List<String> queryFields = null;
        String sort = null;
        List<Video> response = api.getAllUserVideos()
                .containingUri(containingUri)
                .direction(direction)
                .filter(filter)
                .filterEmbeddable(filterEmbeddable)
                .filterPlayable(filterPlayable)
                .filterScreenRecorded(filterScreenRecorded)
                .filterTag(filterTag)
                .filterTagAllOf(filterTagAllOf)
                .filterTagExclude(filterTagExclude)
                .includeTeamContent(includeTeamContent)
                .page(page)
                .perPage(perPage)
                .query(query)
                .queryFields(queryFields)
                .sort(sort)
                .execute();
        // TODO: test validations
    }

    /**
     * Get all the videos in which the user appears
     *
     * This method returns all the videos in which the authenticated user has a credited appearance.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getUserAppearancesTest() throws ApiException {
        String direction = null;
        String filter = null;
        Boolean filterEmbeddable = null;
        Double page = null;
        Double perPage = null;
        String query = null;
        String sort = null;
        List<Video> response = api.getUserAppearances()
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
     * Get a specific video
     *
     * This method returns a single video.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void videoTest() throws ApiException {
        Double videoId = null;
        Video response = api.video(videoId)
                .execute();
        // TODO: test validations
    }

    /**
     * Delete a video
     *
     * This method deletes the specified video. The authenticated user must be the owner of the video.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void video_0Test() throws ApiException {
        Double videoId = null;
        api.video_0(videoId)
                .execute();
        // TODO: test validations
    }

    /**
     * Edit a video
     *
     * This method edits the specified video.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void video_1Test() throws ApiException {
        Double videoId = null;
        String description = null;
        List<String> contentRating = null;
        String customUrl = null;
        EditVideoRequestEmbed embed = null;
        List<String> embedDomains = null;
        List<String> embedDomainsAdd = null;
        List<String> embedDomainsDelete = null;
        Boolean hideFromVimeo = null;
        String license = null;
        String locale = null;
        String name = null;
        String password = null;
        EditVideoRequestPrivacy privacy = null;
        EditVideoRequestReviewPage reviewPage = null;
        EditVideoRequestSpatial spatial = null;
        Video response = api.video_1(videoId)
                .description(description)
                .contentRating(contentRating)
                .customUrl(customUrl)
                .embed(embed)
                .embedDomains(embedDomains)
                .embedDomainsAdd(embedDomainsAdd)
                .embedDomainsDelete(embedDomainsDelete)
                .hideFromVimeo(hideFromVimeo)
                .license(license)
                .locale(locale)
                .name(name)
                .password(password)
                .privacy(privacy)
                .reviewPage(reviewPage)
                .spatial(spatial)
                .execute();
        // TODO: test validations
    }

    /**
     * Get all the videos that the user has uploaded
     *
     * This method returns all the videos that the authenticated user has uploaded.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void videosTest() throws ApiException {
        Double userId = null;
        String containingUri = null;
        String direction = null;
        String filter = null;
        Boolean filterEmbeddable = null;
        Boolean filterPlayable = null;
        Boolean filterScreenRecorded = null;
        String filterTag = null;
        String filterTagAllOf = null;
        String filterTagExclude = null;
        String includeTeamContent = null;
        Double page = null;
        Double perPage = null;
        String query = null;
        List<String> queryFields = null;
        String sort = null;
        List<Video> response = api.videos(userId)
                .containingUri(containingUri)
                .direction(direction)
                .filter(filter)
                .filterEmbeddable(filterEmbeddable)
                .filterPlayable(filterPlayable)
                .filterScreenRecorded(filterScreenRecorded)
                .filterTag(filterTag)
                .filterTagAllOf(filterTagAllOf)
                .filterTagExclude(filterTagExclude)
                .includeTeamContent(includeTeamContent)
                .page(page)
                .perPage(perPage)
                .query(query)
                .queryFields(queryFields)
                .sort(sort)
                .execute();
        // TODO: test validations
    }

    /**
     * Delete a user&#39;s videos
     *
     * This method deletes one or more videos belonging to the specified user. The authenticated user must have permission to delete the videos.  Specify the videos to delete in a comma-separated list by URI using the **uris** query parameter.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void videos_0Test() throws ApiException {
        Double userId = null;
        String uris = null;
        api.videos_0(userId, uris)
                .execute();
        // TODO: test validations
    }

    /**
     * Search for videos
     *
     * This method returns all the videos that match custom search criteria.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void videos_1Test() throws ApiException {
        String direction = null;
        String filter = null;
        String links = null;
        Double page = null;
        Double perPage = null;
        String query = null;
        String sort = null;
        String uris = null;
        List<Video> response = api.videos_1()
                .direction(direction)
                .filter(filter)
                .links(links)
                .page(page)
                .perPage(perPage)
                .query(query)
                .sort(sort)
                .uris(uris)
                .execute();
        // TODO: test validations
    }

}
