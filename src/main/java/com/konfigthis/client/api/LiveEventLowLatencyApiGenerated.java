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


import com.konfigthis.client.model.LiveEventLowLatencyToggleOptionRequest;
import com.konfigthis.client.model.LiveEventLowLatencyToggleOptionRequest1;
import com.konfigthis.client.model.LiveEventLowLatencyToggleOptionRequest2;
import com.konfigthis.client.model.RecurringLiveEventLowLatency;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class LiveEventLowLatencyApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public LiveEventLowLatencyApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public LiveEventLowLatencyApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
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

    private okhttp3.Call toggleOptionCall(Double liveEventId, LiveEventLowLatencyToggleOptionRequest liveEventLowLatencyToggleOptionRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = liveEventLowLatencyToggleOptionRequest;

        // create path and map variables
        String localVarPath = "/live_events/{live_event_id}/low_latency"
            .replace("{" + "live_event_id" + "}", localVarApiClient.escapeString(liveEventId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/application/vnd.vimeo.live.low_latency+json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/application/vnd.vimeo.live.low_latency+json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "oauth2", "oauth2" };
        return localVarApiClient.buildCall(basePath, localVarPath, "PATCH", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call toggleOptionValidateBeforeCall(Double liveEventId, LiveEventLowLatencyToggleOptionRequest liveEventLowLatencyToggleOptionRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'liveEventId' is set
        if (liveEventId == null) {
            throw new ApiException("Missing the required parameter 'liveEventId' when calling toggleOption(Async)");
        }

        return toggleOptionCall(liveEventId, liveEventLowLatencyToggleOptionRequest, _callback);

    }


    private ApiResponse<RecurringLiveEventLowLatency> toggleOptionWithHttpInfo(Double liveEventId, LiveEventLowLatencyToggleOptionRequest liveEventLowLatencyToggleOptionRequest) throws ApiException {
        okhttp3.Call localVarCall = toggleOptionValidateBeforeCall(liveEventId, liveEventLowLatencyToggleOptionRequest, null);
        Type localVarReturnType = new TypeToken<RecurringLiveEventLowLatency>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call toggleOptionAsync(Double liveEventId, LiveEventLowLatencyToggleOptionRequest liveEventLowLatencyToggleOptionRequest, final ApiCallback<RecurringLiveEventLowLatency> _callback) throws ApiException {

        okhttp3.Call localVarCall = toggleOptionValidateBeforeCall(liveEventId, liveEventLowLatencyToggleOptionRequest, _callback);
        Type localVarReturnType = new TypeToken<RecurringLiveEventLowLatency>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class ToggleOptionRequestBuilder {
        private final Double liveEventId;
        private Boolean lowLatency;

        private ToggleOptionRequestBuilder(double liveEventId) {
            this.liveEventId = liveEventId;
        }

        /**
         * Set lowLatency
         * @param lowLatency Whether the event is low latency. (optional)
         * @return ToggleOptionRequestBuilder
         */
        public ToggleOptionRequestBuilder lowLatency(Boolean lowLatency) {
            this.lowLatency = lowLatency;
            return this;
        }
        
        /**
         * Build call for toggleOption
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The low-latency status of the event was returned. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            LiveEventLowLatencyToggleOptionRequest liveEventLowLatencyToggleOptionRequest = buildBodyParams();
            return toggleOptionCall(liveEventId, liveEventLowLatencyToggleOptionRequest, _callback);
        }

        private LiveEventLowLatencyToggleOptionRequest buildBodyParams() {
            LiveEventLowLatencyToggleOptionRequest liveEventLowLatencyToggleOptionRequest = new LiveEventLowLatencyToggleOptionRequest();
            liveEventLowLatencyToggleOptionRequest.lowLatency(this.lowLatency);
            return liveEventLowLatencyToggleOptionRequest;
        }

        /**
         * Execute toggleOption request
         * @return RecurringLiveEventLowLatency
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The low-latency status of the event was returned. </td><td>  -  </td></tr>
         </table>
         */
        public RecurringLiveEventLowLatency execute() throws ApiException {
            LiveEventLowLatencyToggleOptionRequest liveEventLowLatencyToggleOptionRequest = buildBodyParams();
            ApiResponse<RecurringLiveEventLowLatency> localVarResp = toggleOptionWithHttpInfo(liveEventId, liveEventLowLatencyToggleOptionRequest);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute toggleOption request with HTTP info returned
         * @return ApiResponse&lt;RecurringLiveEventLowLatency&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The low-latency status of the event was returned. </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<RecurringLiveEventLowLatency> executeWithHttpInfo() throws ApiException {
            LiveEventLowLatencyToggleOptionRequest liveEventLowLatencyToggleOptionRequest = buildBodyParams();
            return toggleOptionWithHttpInfo(liveEventId, liveEventLowLatencyToggleOptionRequest);
        }

        /**
         * Execute toggleOption request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The low-latency status of the event was returned. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<RecurringLiveEventLowLatency> _callback) throws ApiException {
            LiveEventLowLatencyToggleOptionRequest liveEventLowLatencyToggleOptionRequest = buildBodyParams();
            return toggleOptionAsync(liveEventId, liveEventLowLatencyToggleOptionRequest, _callback);
        }
    }

    /**
     * Toggle the low-latency option of a live event
     * This method toggles the low-latency option of the specified event.
     * @param liveEventId The ID of the event. (required)
     * @return ToggleOptionRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The low-latency status of the event was returned. </td><td>  -  </td></tr>
     </table>
     */
    public ToggleOptionRequestBuilder toggleOption(double liveEventId) throws IllegalArgumentException {
        
        return new ToggleOptionRequestBuilder(liveEventId);
    }
    private okhttp3.Call toggleOption_0Call(Double liveEventId, LiveEventLowLatencyToggleOptionRequest1 liveEventLowLatencyToggleOptionRequest1, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = liveEventLowLatencyToggleOptionRequest1;

        // create path and map variables
        String localVarPath = "/me/live_events/{live_event_id}/low_latency"
            .replace("{" + "live_event_id" + "}", localVarApiClient.escapeString(liveEventId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/application/vnd.vimeo.live.low_latency+json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/application/vnd.vimeo.live.low_latency+json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "oauth2", "oauth2" };
        return localVarApiClient.buildCall(basePath, localVarPath, "PATCH", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call toggleOption_0ValidateBeforeCall(Double liveEventId, LiveEventLowLatencyToggleOptionRequest1 liveEventLowLatencyToggleOptionRequest1, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'liveEventId' is set
        if (liveEventId == null) {
            throw new ApiException("Missing the required parameter 'liveEventId' when calling toggleOption_0(Async)");
        }

        return toggleOption_0Call(liveEventId, liveEventLowLatencyToggleOptionRequest1, _callback);

    }


    private ApiResponse<RecurringLiveEventLowLatency> toggleOption_0WithHttpInfo(Double liveEventId, LiveEventLowLatencyToggleOptionRequest1 liveEventLowLatencyToggleOptionRequest1) throws ApiException {
        okhttp3.Call localVarCall = toggleOption_0ValidateBeforeCall(liveEventId, liveEventLowLatencyToggleOptionRequest1, null);
        Type localVarReturnType = new TypeToken<RecurringLiveEventLowLatency>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call toggleOption_0Async(Double liveEventId, LiveEventLowLatencyToggleOptionRequest1 liveEventLowLatencyToggleOptionRequest1, final ApiCallback<RecurringLiveEventLowLatency> _callback) throws ApiException {

        okhttp3.Call localVarCall = toggleOption_0ValidateBeforeCall(liveEventId, liveEventLowLatencyToggleOptionRequest1, _callback);
        Type localVarReturnType = new TypeToken<RecurringLiveEventLowLatency>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class ToggleOption0RequestBuilder {
        private final Double liveEventId;
        private Boolean lowLatency;

        private ToggleOption0RequestBuilder(double liveEventId) {
            this.liveEventId = liveEventId;
        }

        /**
         * Set lowLatency
         * @param lowLatency Whether the event is low latency. (optional)
         * @return ToggleOption0RequestBuilder
         */
        public ToggleOption0RequestBuilder lowLatency(Boolean lowLatency) {
            this.lowLatency = lowLatency;
            return this;
        }
        
        /**
         * Build call for toggleOption_0
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The low-latency status of the event was returned. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            LiveEventLowLatencyToggleOptionRequest1 liveEventLowLatencyToggleOptionRequest1 = buildBodyParams();
            return toggleOption_0Call(liveEventId, liveEventLowLatencyToggleOptionRequest1, _callback);
        }

        private LiveEventLowLatencyToggleOptionRequest1 buildBodyParams() {
            LiveEventLowLatencyToggleOptionRequest1 liveEventLowLatencyToggleOptionRequest1 = new LiveEventLowLatencyToggleOptionRequest1();
            liveEventLowLatencyToggleOptionRequest1.lowLatency(this.lowLatency);
            return liveEventLowLatencyToggleOptionRequest1;
        }

        /**
         * Execute toggleOption_0 request
         * @return RecurringLiveEventLowLatency
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The low-latency status of the event was returned. </td><td>  -  </td></tr>
         </table>
         */
        public RecurringLiveEventLowLatency execute() throws ApiException {
            LiveEventLowLatencyToggleOptionRequest1 liveEventLowLatencyToggleOptionRequest1 = buildBodyParams();
            ApiResponse<RecurringLiveEventLowLatency> localVarResp = toggleOption_0WithHttpInfo(liveEventId, liveEventLowLatencyToggleOptionRequest1);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute toggleOption_0 request with HTTP info returned
         * @return ApiResponse&lt;RecurringLiveEventLowLatency&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The low-latency status of the event was returned. </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<RecurringLiveEventLowLatency> executeWithHttpInfo() throws ApiException {
            LiveEventLowLatencyToggleOptionRequest1 liveEventLowLatencyToggleOptionRequest1 = buildBodyParams();
            return toggleOption_0WithHttpInfo(liveEventId, liveEventLowLatencyToggleOptionRequest1);
        }

        /**
         * Execute toggleOption_0 request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The low-latency status of the event was returned. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<RecurringLiveEventLowLatency> _callback) throws ApiException {
            LiveEventLowLatencyToggleOptionRequest1 liveEventLowLatencyToggleOptionRequest1 = buildBodyParams();
            return toggleOption_0Async(liveEventId, liveEventLowLatencyToggleOptionRequest1, _callback);
        }
    }

    /**
     * Toggle the low-latency option of a live event
     * This method toggles the low-latency option of the specified event.
     * @param liveEventId The ID of the event. (required)
     * @return ToggleOption0RequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The low-latency status of the event was returned. </td><td>  -  </td></tr>
     </table>
     */
    public ToggleOption0RequestBuilder toggleOption_0(double liveEventId) throws IllegalArgumentException {
        
        return new ToggleOption0RequestBuilder(liveEventId);
    }
    private okhttp3.Call toggleOption_1Call(Double liveEventId, Double userId, LiveEventLowLatencyToggleOptionRequest2 liveEventLowLatencyToggleOptionRequest2, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = liveEventLowLatencyToggleOptionRequest2;

        // create path and map variables
        String localVarPath = "/users/{user_id}/live_events/{live_event_id}/low_latency"
            .replace("{" + "live_event_id" + "}", localVarApiClient.escapeString(liveEventId.toString()))
            .replace("{" + "user_id" + "}", localVarApiClient.escapeString(userId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/application/vnd.vimeo.live.low_latency+json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/application/vnd.vimeo.live.low_latency+json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "oauth2", "oauth2" };
        return localVarApiClient.buildCall(basePath, localVarPath, "PATCH", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call toggleOption_1ValidateBeforeCall(Double liveEventId, Double userId, LiveEventLowLatencyToggleOptionRequest2 liveEventLowLatencyToggleOptionRequest2, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'liveEventId' is set
        if (liveEventId == null) {
            throw new ApiException("Missing the required parameter 'liveEventId' when calling toggleOption_1(Async)");
        }

        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling toggleOption_1(Async)");
        }

        return toggleOption_1Call(liveEventId, userId, liveEventLowLatencyToggleOptionRequest2, _callback);

    }


    private ApiResponse<RecurringLiveEventLowLatency> toggleOption_1WithHttpInfo(Double liveEventId, Double userId, LiveEventLowLatencyToggleOptionRequest2 liveEventLowLatencyToggleOptionRequest2) throws ApiException {
        okhttp3.Call localVarCall = toggleOption_1ValidateBeforeCall(liveEventId, userId, liveEventLowLatencyToggleOptionRequest2, null);
        Type localVarReturnType = new TypeToken<RecurringLiveEventLowLatency>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call toggleOption_1Async(Double liveEventId, Double userId, LiveEventLowLatencyToggleOptionRequest2 liveEventLowLatencyToggleOptionRequest2, final ApiCallback<RecurringLiveEventLowLatency> _callback) throws ApiException {

        okhttp3.Call localVarCall = toggleOption_1ValidateBeforeCall(liveEventId, userId, liveEventLowLatencyToggleOptionRequest2, _callback);
        Type localVarReturnType = new TypeToken<RecurringLiveEventLowLatency>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class ToggleOption1RequestBuilder {
        private final Double liveEventId;
        private final Double userId;
        private Boolean lowLatency;

        private ToggleOption1RequestBuilder(double liveEventId, double userId) {
            this.liveEventId = liveEventId;
            this.userId = userId;
        }

        /**
         * Set lowLatency
         * @param lowLatency Whether the event is low latency. (optional)
         * @return ToggleOption1RequestBuilder
         */
        public ToggleOption1RequestBuilder lowLatency(Boolean lowLatency) {
            this.lowLatency = lowLatency;
            return this;
        }
        
        /**
         * Build call for toggleOption_1
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The low-latency status of the event was returned. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            LiveEventLowLatencyToggleOptionRequest2 liveEventLowLatencyToggleOptionRequest2 = buildBodyParams();
            return toggleOption_1Call(liveEventId, userId, liveEventLowLatencyToggleOptionRequest2, _callback);
        }

        private LiveEventLowLatencyToggleOptionRequest2 buildBodyParams() {
            LiveEventLowLatencyToggleOptionRequest2 liveEventLowLatencyToggleOptionRequest2 = new LiveEventLowLatencyToggleOptionRequest2();
            liveEventLowLatencyToggleOptionRequest2.lowLatency(this.lowLatency);
            return liveEventLowLatencyToggleOptionRequest2;
        }

        /**
         * Execute toggleOption_1 request
         * @return RecurringLiveEventLowLatency
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The low-latency status of the event was returned. </td><td>  -  </td></tr>
         </table>
         */
        public RecurringLiveEventLowLatency execute() throws ApiException {
            LiveEventLowLatencyToggleOptionRequest2 liveEventLowLatencyToggleOptionRequest2 = buildBodyParams();
            ApiResponse<RecurringLiveEventLowLatency> localVarResp = toggleOption_1WithHttpInfo(liveEventId, userId, liveEventLowLatencyToggleOptionRequest2);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute toggleOption_1 request with HTTP info returned
         * @return ApiResponse&lt;RecurringLiveEventLowLatency&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The low-latency status of the event was returned. </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<RecurringLiveEventLowLatency> executeWithHttpInfo() throws ApiException {
            LiveEventLowLatencyToggleOptionRequest2 liveEventLowLatencyToggleOptionRequest2 = buildBodyParams();
            return toggleOption_1WithHttpInfo(liveEventId, userId, liveEventLowLatencyToggleOptionRequest2);
        }

        /**
         * Execute toggleOption_1 request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The low-latency status of the event was returned. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<RecurringLiveEventLowLatency> _callback) throws ApiException {
            LiveEventLowLatencyToggleOptionRequest2 liveEventLowLatencyToggleOptionRequest2 = buildBodyParams();
            return toggleOption_1Async(liveEventId, userId, liveEventLowLatencyToggleOptionRequest2, _callback);
        }
    }

    /**
     * Toggle the low-latency option of a live event
     * This method toggles the low-latency option of the specified event.
     * @param liveEventId The ID of the event. (required)
     * @param userId The ID of the user. (required)
     * @return ToggleOption1RequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The low-latency status of the event was returned. </td><td>  -  </td></tr>
     </table>
     */
    public ToggleOption1RequestBuilder toggleOption_1(double liveEventId, double userId) throws IllegalArgumentException {
        
        
        return new ToggleOption1RequestBuilder(liveEventId, userId);
    }
}
