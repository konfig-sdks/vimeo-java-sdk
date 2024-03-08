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
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for GroupsSubscriptionsApi
 */
@Disabled
public class GroupsSubscriptionsApiTest {

    private static GroupsSubscriptionsApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new GroupsSubscriptionsApi(apiClient);
    }

    /**
     * Add the user to a group
     *
     * This method adds the authenticated user to the specified group.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addUserToGroupTest() throws ApiException {
        Double groupId = null;
        api.addUserToGroup(groupId)
                .execute();
        // TODO: test validations
    }

    /**
     * Add the user to a group
     *
     * This method adds the authenticated user to the specified group.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void groupTest() throws ApiException {
        Double groupId = null;
        Double userId = null;
        api.group(groupId, userId)
                .execute();
        // TODO: test validations
    }

    /**
     * Remove the user from a group
     *
     * This method removes the authenticated user from the specified group. The authenticated user can&#39;t be the owner of the group; assign a new owner through a PATCH request first.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void group_0Test() throws ApiException {
        Double groupId = null;
        Double userId = null;
        api.group_0(groupId, userId)
                .execute();
        // TODO: test validations
    }

    /**
     * Remove the user from a group
     *
     * This method removes the authenticated user from the specified group. The authenticated user can&#39;t be the owner of the group; assign a new owner through a PATCH request first.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeUserFromGroupTest() throws ApiException {
        Double groupId = null;
        api.removeUserFromGroup(groupId)
                .execute();
        // TODO: test validations
    }

}