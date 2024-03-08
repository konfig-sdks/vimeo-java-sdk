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



import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class VideosLiveM3U8PlaybackApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public VideosLiveM3U8PlaybackApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public VideosLiveM3U8PlaybackApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
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

    private okhttp3.Call getPlaybackUrlCall(Double videoId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/me/videos/{video_id}/m3u8_playback"
            .replace("{" + "video_id" + "}", localVarApiClient.escapeString(videoId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
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
    private okhttp3.Call getPlaybackUrlValidateBeforeCall(Double videoId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'videoId' is set
        if (videoId == null) {
            throw new ApiException("Missing the required parameter 'videoId' when calling getPlaybackUrl(Async)");
        }

        return getPlaybackUrlCall(videoId, _callback);

    }


    private ApiResponse<Void> getPlaybackUrlWithHttpInfo(Double videoId) throws ApiException {
        okhttp3.Call localVarCall = getPlaybackUrlValidateBeforeCall(videoId, null);
        return localVarApiClient.execute(localVarCall);
    }

    private okhttp3.Call getPlaybackUrlAsync(Double videoId, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = getPlaybackUrlValidateBeforeCall(videoId, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }

    public class GetPlaybackUrlRequestBuilder {
        private final Double videoId;

        private GetPlaybackUrlRequestBuilder(double videoId) {
            this.videoId = videoId;
        }

        /**
         * Build call for getPlaybackUrl
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The M3U8 playback URL was returned. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getPlaybackUrlCall(videoId, _callback);
        }


        /**
         * Execute getPlaybackUrl request
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The M3U8 playback URL was returned. </td><td>  -  </td></tr>
         </table>
         */
        public void execute() throws ApiException {
            getPlaybackUrlWithHttpInfo(videoId);
        }

        /**
         * Execute getPlaybackUrl request with HTTP info returned
         * @return ApiResponse&lt;Void&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The M3U8 playback URL was returned. </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Void> executeWithHttpInfo() throws ApiException {
            return getPlaybackUrlWithHttpInfo(videoId);
        }

        /**
         * Execute getPlaybackUrl request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The M3U8 playback URL was returned. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Void> _callback) throws ApiException {
            return getPlaybackUrlAsync(videoId, _callback);
        }
    }

    /**
     * Get an M3U8 playback URL for a one-time live event
     * This method returns an M3U8 playback URL for the specified event stream. You should use this endpoint only in conjunction with our recommended procedure for playing events via HLS. For more information, see our [HLS guide](https://developer.vimeo.com/api/live/playback).
     * @param videoId The ID of the video. (required)
     * @return GetPlaybackUrlRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The M3U8 playback URL was returned. </td><td>  -  </td></tr>
     </table>
     */
    public GetPlaybackUrlRequestBuilder getPlaybackUrl(double videoId) throws IllegalArgumentException {
        
        return new GetPlaybackUrlRequestBuilder(videoId);
    }
    private okhttp3.Call getPlaybackUrlForEventStreamCall(Double userId, Double videoId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/users/{user_id}/videos/{video_id}/m3u8_playback"
            .replace("{" + "user_id" + "}", localVarApiClient.escapeString(userId.toString()))
            .replace("{" + "video_id" + "}", localVarApiClient.escapeString(videoId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
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
    private okhttp3.Call getPlaybackUrlForEventStreamValidateBeforeCall(Double userId, Double videoId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling getPlaybackUrlForEventStream(Async)");
        }

        // verify the required parameter 'videoId' is set
        if (videoId == null) {
            throw new ApiException("Missing the required parameter 'videoId' when calling getPlaybackUrlForEventStream(Async)");
        }

        return getPlaybackUrlForEventStreamCall(userId, videoId, _callback);

    }


    private ApiResponse<Void> getPlaybackUrlForEventStreamWithHttpInfo(Double userId, Double videoId) throws ApiException {
        okhttp3.Call localVarCall = getPlaybackUrlForEventStreamValidateBeforeCall(userId, videoId, null);
        return localVarApiClient.execute(localVarCall);
    }

    private okhttp3.Call getPlaybackUrlForEventStreamAsync(Double userId, Double videoId, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = getPlaybackUrlForEventStreamValidateBeforeCall(userId, videoId, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }

    public class GetPlaybackUrlForEventStreamRequestBuilder {
        private final Double userId;
        private final Double videoId;

        private GetPlaybackUrlForEventStreamRequestBuilder(double userId, double videoId) {
            this.userId = userId;
            this.videoId = videoId;
        }

        /**
         * Build call for getPlaybackUrlForEventStream
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The M3U8 playback URL was returned. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getPlaybackUrlForEventStreamCall(userId, videoId, _callback);
        }


        /**
         * Execute getPlaybackUrlForEventStream request
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The M3U8 playback URL was returned. </td><td>  -  </td></tr>
         </table>
         */
        public void execute() throws ApiException {
            getPlaybackUrlForEventStreamWithHttpInfo(userId, videoId);
        }

        /**
         * Execute getPlaybackUrlForEventStream request with HTTP info returned
         * @return ApiResponse&lt;Void&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The M3U8 playback URL was returned. </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Void> executeWithHttpInfo() throws ApiException {
            return getPlaybackUrlForEventStreamWithHttpInfo(userId, videoId);
        }

        /**
         * Execute getPlaybackUrlForEventStream request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The M3U8 playback URL was returned. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Void> _callback) throws ApiException {
            return getPlaybackUrlForEventStreamAsync(userId, videoId, _callback);
        }
    }

    /**
     * Get an M3U8 playback URL for a one-time live event
     * This method returns an M3U8 playback URL for the specified event stream. You should use this endpoint only in conjunction with our recommended procedure for playing events via HLS. For more information, see our [HLS guide](https://developer.vimeo.com/api/live/playback).
     * @param userId The ID of the user. (required)
     * @param videoId The ID of the video. (required)
     * @return GetPlaybackUrlForEventStreamRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The M3U8 playback URL was returned. </td><td>  -  </td></tr>
     </table>
     */
    public GetPlaybackUrlForEventStreamRequestBuilder getPlaybackUrlForEventStream(double userId, double videoId) throws IllegalArgumentException {
        
        
        return new GetPlaybackUrlForEventStreamRequestBuilder(userId, videoId);
    }
}
