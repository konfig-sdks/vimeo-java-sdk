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
 * API tests for TeamsMembersApi
 */
@Disabled
public class TeamsMembersApiTest {

    private static TeamsMembersApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new TeamsMembersApi(apiClient);
    }

    /**
     * Get membership information about a team
     *
     * This method returns information about the membership of the specified team. Usage is currently limited to the team join forms.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getMembershipInformationTest() throws ApiException {
        String code = null;
        api.getMembershipInformation(code)
                .execute();
        // TODO: test validations
    }

    /**
     * Get membership information about a team
     *
     * This method returns information about the membership of the specified team. Usage is currently limited to the team join forms.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getTeamMembershipInformationTest() throws ApiException {
        Double teamUserId = null;
        Double userId = null;
        api.getTeamMembershipInformation(teamUserId, userId)
                .execute();
        // TODO: test validations
    }

    /**
     * Get information about the user&#39;s role on a team
     *
     * This method returns information about the authenticated user&#39;s role on the specified team owner&#39;s team.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getUserTeamRoleTest() throws ApiException {
        Double userId = null;
        api.getUserTeamRole(userId)
                .execute();
        // TODO: test validations
    }

}
