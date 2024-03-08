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
import com.konfigthis.client.model.CreateChannelRequest;
import com.konfigthis.client.model.EditChannelRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ChannelsEssentialsApi
 */
@Disabled
public class ChannelsEssentialsApiTest {

    private static ChannelsEssentialsApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new ChannelsEssentialsApi(apiClient);
    }

    /**
     * Create a channel
     *
     * This method creates a new channel.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void channelTest() throws ApiException {
        String name = null;
        String privacy = null;
        String description = null;
        String link = null;
        Channel response = api.channel(name, privacy)
                .description(description)
                .link(link)
                .execute();
        // TODO: test validations
    }

    /**
     * Get a specific channel
     *
     * This method returns a single channel.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void channel_0Test() throws ApiException {
        Double channelId = null;
        Channel response = api.channel_0(channelId)
                .execute();
        // TODO: test validations
    }

    /**
     * Delete a channel
     *
     * This method deletes the specified channel.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void channel_1Test() throws ApiException {
        Double channelId = null;
        api.channel_1(channelId)
                .execute();
        // TODO: test validations
    }

    /**
     * Edit a channel
     *
     * This method edits the specified channel.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void channel_2Test() throws ApiException {
        Double channelId = null;
        String description = null;
        String link = null;
        String name = null;
        String privacy = null;
        Channel response = api.channel_2(channelId)
                .description(description)
                .link(link)
                .name(name)
                .privacy(privacy)
                .execute();
        // TODO: test validations
    }

    /**
     * Get all channels
     *
     * This method returns all available channels.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void channelsTest() throws ApiException {
        String direction = null;
        String filter = null;
        Double page = null;
        Double perPage = null;
        String query = null;
        String sort = null;
        List<Channel> response = api.channels()
                .direction(direction)
                .filter(filter)
                .page(page)
                .perPage(perPage)
                .query(query)
                .sort(sort)
                .execute();
        // TODO: test validations
    }

    /**
     * Get all the channels to which a user subscribes
     *
     * This method returns all the channels to which the specified user subscribes.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getUserSubscriptionsTest() throws ApiException {
        String direction = null;
        String filter = null;
        Double page = null;
        Double perPage = null;
        String query = null;
        String sort = null;
        List<Channel> response = api.getUserSubscriptions()
                .direction(direction)
                .filter(filter)
                .page(page)
                .perPage(perPage)
                .query(query)
                .sort(sort)
                .execute();
        // TODO: test validations
    }

    /**
     * Get all the channels to which a user subscribes
     *
     * This method returns all the channels to which the specified user subscribes.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getUserSubscriptions_0Test() throws ApiException {
        Double userId = null;
        String direction = null;
        String filter = null;
        Double page = null;
        Double perPage = null;
        String query = null;
        String sort = null;
        List<Channel> response = api.getUserSubscriptions_0(userId)
                .direction(direction)
                .filter(filter)
                .page(page)
                .perPage(perPage)
                .query(query)
                .sort(sort)
                .execute();
        // TODO: test validations
    }

}
