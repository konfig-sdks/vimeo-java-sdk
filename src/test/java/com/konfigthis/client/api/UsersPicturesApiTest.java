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
import com.konfigthis.client.model.EditPictureRequest;
import com.konfigthis.client.model.Picture;
import com.konfigthis.client.model.UsersPicturesEditPortraitImageRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UsersPicturesApi
 */
@Disabled
public class UsersPicturesApiTest {

    private static UsersPicturesApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new UsersPicturesApi(apiClient);
    }

    /**
     * Add a picture to the user&#39;s account
     *
     * This method adds a portrait image to the authenticated user&#39;s Vimeo account. Send the binary data of the image file to the location that you receive from the **link** field in the response. For step-by-step instructions, see [Working with Thumbnail Uploads](https://developer.vimeo.com/api/upload/thumbnails#uploading-a-thumbnail-step-3).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addPortraitImageTest() throws ApiException {
        Picture response = api.addPortraitImage()
                .execute();
        // TODO: test validations
    }

    /**
     * Edit a picture in the user&#39;s account
     *
     * This method edits the specified portrait image belonging to the authenticated user.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void editPortraitImageTest() throws ApiException {
        Double portraitsetId = null;
        Boolean active = null;
        Picture response = api.editPortraitImage(portraitsetId)
                .active(active)
                .execute();
        // TODO: test validations
    }

    /**
     * Get a specific picture that belongs to the user
     *
     * This method returns a single portrait image belonging to the authenticated user.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSpecificPictureBelongingToUserTest() throws ApiException {
        Double portraitsetId = null;
        Picture response = api.getSpecificPictureBelongingToUser(portraitsetId)
                .execute();
        // TODO: test validations
    }

    /**
     * Get all the pictures that belong to the user
     *
     * This method returns every portrait image belonging to the authenticated user.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listTest() throws ApiException {
        Double page = null;
        Double perPage = null;
        List<Picture> response = api.list()
                .page(page)
                .perPage(perPage)
                .execute();
        // TODO: test validations
    }

    /**
     * Add a picture to the user&#39;s account
     *
     * This method adds a portrait image to the authenticated user&#39;s Vimeo account. Send the binary data of the image file to the location that you receive from the **link** field in the response. For step-by-step instructions, see [Working with Thumbnail Uploads](https://developer.vimeo.com/api/upload/thumbnails#uploading-a-thumbnail-step-3).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void pictureTest() throws ApiException {
        Double userId = null;
        Picture response = api.picture(userId)
                .execute();
        // TODO: test validations
    }

    /**
     * Get a specific picture that belongs to the user
     *
     * This method returns a single portrait image belonging to the authenticated user.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void picture_0Test() throws ApiException {
        Double portraitsetId = null;
        Double userId = null;
        Picture response = api.picture_0(portraitsetId, userId)
                .execute();
        // TODO: test validations
    }

    /**
     * Delete a picture from the user&#39;s account
     *
     * This method removes the specified portrait image from the authenticated user&#39;s Vimeo account.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void picture_1Test() throws ApiException {
        Double portraitsetId = null;
        Double userId = null;
        api.picture_1(portraitsetId, userId)
                .execute();
        // TODO: test validations
    }

    /**
     * Edit a picture in the user&#39;s account
     *
     * This method edits the specified portrait image belonging to the authenticated user.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void picture_2Test() throws ApiException {
        Double portraitsetId = null;
        Double userId = null;
        Boolean active = null;
        Picture response = api.picture_2(portraitsetId, userId)
                .active(active)
                .execute();
        // TODO: test validations
    }

    /**
     * Get all the pictures that belong to the user
     *
     * This method returns every portrait image belonging to the authenticated user.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void picturesTest() throws ApiException {
        Double userId = null;
        Double page = null;
        Double perPage = null;
        List<Picture> response = api.pictures(userId)
                .page(page)
                .perPage(perPage)
                .execute();
        // TODO: test validations
    }

    /**
     * Delete a picture from the user&#39;s account
     *
     * This method removes the specified portrait image from the authenticated user&#39;s Vimeo account.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removePortraitImageTest() throws ApiException {
        Double portraitsetId = null;
        api.removePortraitImage(portraitsetId)
                .execute();
        // TODO: test validations
    }

}
