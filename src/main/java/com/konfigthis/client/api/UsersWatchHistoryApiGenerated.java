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

import com.konfigthis.client.ApiCallback;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.Pair;
import com.konfigthis.client.ProgressRequestBody;
import com.konfigthis.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.konfigthis.client.model.Video;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class UsersWatchHistoryApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public UsersWatchHistoryApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public UsersWatchHistoryApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    private okhttp3.Call deleteEntireWatchHistoryCall(final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/me/watched/videos";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "oauth2", "oauth2" };
        return localVarApiClient.buildCall(basePath, localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call deleteEntireWatchHistoryValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        return deleteEntireWatchHistoryCall(_callback);

    }


    private ApiResponse<Void> deleteEntireWatchHistoryWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = deleteEntireWatchHistoryValidateBeforeCall(null);
        return localVarApiClient.execute(localVarCall);
    }

    private okhttp3.Call deleteEntireWatchHistoryAsync(final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteEntireWatchHistoryValidateBeforeCall(_callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }

    public class DeleteEntireWatchHistoryRequestBuilder {

        private DeleteEntireWatchHistoryRequestBuilder() {
        }

        /**
         * Build call for deleteEntireWatchHistory
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 204 </td><td> The authenticated user&#39;s watch history was deleted. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return deleteEntireWatchHistoryCall(_callback);
        }


        /**
         * Execute deleteEntireWatchHistory request
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 204 </td><td> The authenticated user&#39;s watch history was deleted. </td><td>  -  </td></tr>
         </table>
         */
        public void execute() throws ApiException {
            deleteEntireWatchHistoryWithHttpInfo();
        }

        /**
         * Execute deleteEntireWatchHistory request with HTTP info returned
         * @return ApiResponse&lt;Void&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 204 </td><td> The authenticated user&#39;s watch history was deleted. </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Void> executeWithHttpInfo() throws ApiException {
            return deleteEntireWatchHistoryWithHttpInfo();
        }

        /**
         * Execute deleteEntireWatchHistory request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 204 </td><td> The authenticated user&#39;s watch history was deleted. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Void> _callback) throws ApiException {
            return deleteEntireWatchHistoryAsync(_callback);
        }
    }

    /**
     * Delete the user&#39;s watch history
     * This method deletes the entire watch history of the authenticated user.
     * @return DeleteEntireWatchHistoryRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> The authenticated user&#39;s watch history was deleted. </td><td>  -  </td></tr>
     </table>
     */
    public DeleteEntireWatchHistoryRequestBuilder deleteEntireWatchHistory() throws IllegalArgumentException {
        return new DeleteEntireWatchHistoryRequestBuilder();
    }
    private okhttp3.Call deleteSpecificVideoCall(Double videoId, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/me/watched/videos/{video_id}"
            .replace("{" + "video_id" + "}", localVarApiClient.escapeString(videoId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "oauth2", "oauth2" };
        return localVarApiClient.buildCall(basePath, localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call deleteSpecificVideoValidateBeforeCall(Double videoId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'videoId' is set
        if (videoId == null) {
            throw new ApiException("Missing the required parameter 'videoId' when calling deleteSpecificVideo(Async)");
        }

        return deleteSpecificVideoCall(videoId, _callback);

    }


    private ApiResponse<Void> deleteSpecificVideoWithHttpInfo(Double videoId) throws ApiException {
        okhttp3.Call localVarCall = deleteSpecificVideoValidateBeforeCall(videoId, null);
        return localVarApiClient.execute(localVarCall);
    }

    private okhttp3.Call deleteSpecificVideoAsync(Double videoId, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteSpecificVideoValidateBeforeCall(videoId, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }

    public class DeleteSpecificVideoRequestBuilder {
        private final Double videoId;

        private DeleteSpecificVideoRequestBuilder(double videoId) {
            this.videoId = videoId;
        }

        /**
         * Build call for deleteSpecificVideo
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 204 </td><td> The video was deleted from the authenticated user&#39;s watch history. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return deleteSpecificVideoCall(videoId, _callback);
        }


        /**
         * Execute deleteSpecificVideo request
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 204 </td><td> The video was deleted from the authenticated user&#39;s watch history. </td><td>  -  </td></tr>
         </table>
         */
        public void execute() throws ApiException {
            deleteSpecificVideoWithHttpInfo(videoId);
        }

        /**
         * Execute deleteSpecificVideo request with HTTP info returned
         * @return ApiResponse&lt;Void&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 204 </td><td> The video was deleted from the authenticated user&#39;s watch history. </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Void> executeWithHttpInfo() throws ApiException {
            return deleteSpecificVideoWithHttpInfo(videoId);
        }

        /**
         * Execute deleteSpecificVideo request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 204 </td><td> The video was deleted from the authenticated user&#39;s watch history. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Void> _callback) throws ApiException {
            return deleteSpecificVideoAsync(videoId, _callback);
        }
    }

    /**
     * Delete a specific video from the user&#39;s watch history
     * This method deletes the specified video from the authenticated user&#39;s watch history.
     * @param videoId The ID of the video. (required)
     * @return DeleteSpecificVideoRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> The video was deleted from the authenticated user&#39;s watch history. </td><td>  -  </td></tr>
     </table>
     */
    public DeleteSpecificVideoRequestBuilder deleteSpecificVideo(double videoId) throws IllegalArgumentException {
        
        return new DeleteSpecificVideoRequestBuilder(videoId);
    }
    private okhttp3.Call getWatchedVideosCall(Double page, Double perPage, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/me/watched/videos";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (page != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page", page));
        }

        if (perPage != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("per_page", perPage));
        }

        final String[] localVarAccepts = {
            "application/vnd.vimeo.video+json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "oauth2", "oauth2" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getWatchedVideosValidateBeforeCall(Double page, Double perPage, final ApiCallback _callback) throws ApiException {
        return getWatchedVideosCall(page, perPage, _callback);

    }


    private ApiResponse<List<Video>> getWatchedVideosWithHttpInfo(Double page, Double perPage) throws ApiException {
        okhttp3.Call localVarCall = getWatchedVideosValidateBeforeCall(page, perPage, null);
        Type localVarReturnType = new TypeToken<List<Video>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getWatchedVideosAsync(Double page, Double perPage, final ApiCallback<List<Video>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getWatchedVideosValidateBeforeCall(page, perPage, _callback);
        Type localVarReturnType = new TypeToken<List<Video>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetWatchedVideosRequestBuilder {
        private Double page;
        private Double perPage;

        private GetWatchedVideosRequestBuilder() {
        }

        /**
         * Set page
         * @param page The page number of the results to show. (optional)
         * @return GetWatchedVideosRequestBuilder
         */
        public GetWatchedVideosRequestBuilder page(Double page) {
            this.page = page;
            return this;
        }
        
        /**
         * Set perPage
         * @param perPage The number of items to show on each page of results, up to a maximum of 100. (optional)
         * @return GetWatchedVideosRequestBuilder
         */
        public GetWatchedVideosRequestBuilder perPage(Double perPage) {
            this.perPage = perPage;
            return this;
        }
        
        /**
         * Build call for getWatchedVideos
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The videos were returned. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getWatchedVideosCall(page, perPage, _callback);
        }


        /**
         * Execute getWatchedVideos request
         * @return List&lt;Video&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The videos were returned. </td><td>  -  </td></tr>
         </table>
         */
        public List<Video> execute() throws ApiException {
            ApiResponse<List<Video>> localVarResp = getWatchedVideosWithHttpInfo(page, perPage);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getWatchedVideos request with HTTP info returned
         * @return ApiResponse&lt;List&lt;Video&gt;&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The videos were returned. </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<List<Video>> executeWithHttpInfo() throws ApiException {
            return getWatchedVideosWithHttpInfo(page, perPage);
        }

        /**
         * Execute getWatchedVideos request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The videos were returned. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<List<Video>> _callback) throws ApiException {
            return getWatchedVideosAsync(page, perPage, _callback);
        }
    }

    /**
     * Get all the videos that a user has watched
     * This method returns every video on the authenticated user&#39;s watch history. _This endpoint is deprecated. Any request to it returns empty data with HTTP status code 200._
     * @return GetWatchedVideosRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The videos were returned. </td><td>  -  </td></tr>
     </table>
     */
    public GetWatchedVideosRequestBuilder getWatchedVideos() throws IllegalArgumentException {
        return new GetWatchedVideosRequestBuilder();
    }
}