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


import com.konfigthis.client.model.Analytics;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class UsersAnalyticsApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public UsersAnalyticsApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public UsersAnalyticsApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
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

    private okhttp3.Call getMetricsCall(Double userId, String dimension, String from, String to, String direction, String filterContent, List<String> filterCountries, List<String> filterDeviceTypes, List<String> filterEmbedDomains, List<String> filterStreamingTypes, Double page, Double perPage, String sort, String timeInterval, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/users/{user_id}/analytics"
            .replace("{" + "user_id" + "}", localVarApiClient.escapeString(userId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (dimension != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("dimension", dimension));
        }

        if (direction != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("direction", direction));
        }

        if (filterContent != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("filter_content", filterContent));
        }

        if (filterCountries != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "filter_countries", filterCountries));
        }

        if (filterDeviceTypes != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "filter_device_types", filterDeviceTypes));
        }

        if (filterEmbedDomains != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "filter_embed_domains", filterEmbedDomains));
        }

        if (filterStreamingTypes != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "filter_streaming_types", filterStreamingTypes));
        }

        if (from != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("from", from));
        }

        if (page != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page", page));
        }

        if (perPage != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("per_page", perPage));
        }

        if (sort != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("sort", sort));
        }

        if (timeInterval != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("time_interval", timeInterval));
        }

        if (to != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("to", to));
        }

        final String[] localVarAccepts = {
            "application/vnd.vimeo.analytics+json"
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
    private okhttp3.Call getMetricsValidateBeforeCall(Double userId, String dimension, String from, String to, String direction, String filterContent, List<String> filterCountries, List<String> filterDeviceTypes, List<String> filterEmbedDomains, List<String> filterStreamingTypes, Double page, Double perPage, String sort, String timeInterval, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling getMetrics(Async)");
        }

        // verify the required parameter 'dimension' is set
        if (dimension == null) {
            throw new ApiException("Missing the required parameter 'dimension' when calling getMetrics(Async)");
        }

        // verify the required parameter 'from' is set
        if (from == null) {
            throw new ApiException("Missing the required parameter 'from' when calling getMetrics(Async)");
        }

        // verify the required parameter 'to' is set
        if (to == null) {
            throw new ApiException("Missing the required parameter 'to' when calling getMetrics(Async)");
        }

        return getMetricsCall(userId, dimension, from, to, direction, filterContent, filterCountries, filterDeviceTypes, filterEmbedDomains, filterStreamingTypes, page, perPage, sort, timeInterval, _callback);

    }


    private ApiResponse<List<Analytics>> getMetricsWithHttpInfo(Double userId, String dimension, String from, String to, String direction, String filterContent, List<String> filterCountries, List<String> filterDeviceTypes, List<String> filterEmbedDomains, List<String> filterStreamingTypes, Double page, Double perPage, String sort, String timeInterval) throws ApiException {
        okhttp3.Call localVarCall = getMetricsValidateBeforeCall(userId, dimension, from, to, direction, filterContent, filterCountries, filterDeviceTypes, filterEmbedDomains, filterStreamingTypes, page, perPage, sort, timeInterval, null);
        Type localVarReturnType = new TypeToken<List<Analytics>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getMetricsAsync(Double userId, String dimension, String from, String to, String direction, String filterContent, List<String> filterCountries, List<String> filterDeviceTypes, List<String> filterEmbedDomains, List<String> filterStreamingTypes, Double page, Double perPage, String sort, String timeInterval, final ApiCallback<List<Analytics>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getMetricsValidateBeforeCall(userId, dimension, from, to, direction, filterContent, filterCountries, filterDeviceTypes, filterEmbedDomains, filterStreamingTypes, page, perPage, sort, timeInterval, _callback);
        Type localVarReturnType = new TypeToken<List<Analytics>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetMetricsRequestBuilder {
        private final Double userId;
        private final String dimension;
        private final String from;
        private final String to;
        private String direction;
        private String filterContent;
        private List<String> filterCountries;
        private List<String> filterDeviceTypes;
        private List<String> filterEmbedDomains;
        private List<String> filterStreamingTypes;
        private Double page;
        private Double perPage;
        private String sort;
        private String timeInterval;

        private GetMetricsRequestBuilder(double userId, String dimension, String from, String to) {
            this.userId = userId;
            this.dimension = dimension;
            this.from = from;
            this.to = to;
        }

        /**
         * Set direction
         * @param direction The sort direction of the results.  Option descriptions:  * &#x60;asc&#x60; - Sort the results in ascending order.  * &#x60;desc&#x60; - Sort the results in descending order.  (optional)
         * @return GetMetricsRequestBuilder
         */
        public GetMetricsRequestBuilder direction(String direction) {
            this.direction = direction;
            return this;
        }
        
        /**
         * Set filterContent
         * @param filterContent A comma-separated list of video, folder, or event URIs to filter. (optional)
         * @return GetMetricsRequestBuilder
         */
        public GetMetricsRequestBuilder filterContent(String filterContent) {
            this.filterContent = filterContent;
            return this;
        }
        
        /**
         * Set filterCountries
         * @param filterCountries A comma-separated list of country codes in ISO-3166 format to filter on. (optional)
         * @return GetMetricsRequestBuilder
         */
        public GetMetricsRequestBuilder filterCountries(List<String> filterCountries) {
            this.filterCountries = filterCountries;
            return this;
        }
        
        /**
         * Set filterDeviceTypes
         * @param filterDeviceTypes A comma-separated list of device types to filter on. (optional)
         * @return GetMetricsRequestBuilder
         */
        public GetMetricsRequestBuilder filterDeviceTypes(List<String> filterDeviceTypes) {
            this.filterDeviceTypes = filterDeviceTypes;
            return this;
        }
        
        /**
         * Set filterEmbedDomains
         * @param filterEmbedDomains A comma-separated list of domain names to filter on. (optional)
         * @return GetMetricsRequestBuilder
         */
        public GetMetricsRequestBuilder filterEmbedDomains(List<String> filterEmbedDomains) {
            this.filterEmbedDomains = filterEmbedDomains;
            return this;
        }
        
        /**
         * Set filterStreamingTypes
         * @param filterStreamingTypes A comma-separated list of streaming types to filter on. (optional)
         * @return GetMetricsRequestBuilder
         */
        public GetMetricsRequestBuilder filterStreamingTypes(List<String> filterStreamingTypes) {
            this.filterStreamingTypes = filterStreamingTypes;
            return this;
        }
        
        /**
         * Set page
         * @param page The page number of the results to show. (optional)
         * @return GetMetricsRequestBuilder
         */
        public GetMetricsRequestBuilder page(Double page) {
            this.page = page;
            return this;
        }
        
        /**
         * Set perPage
         * @param perPage The maximum number of items returned from the request, up to a limit of 1000 items. The default value is &#x60;50&#x60;. (optional)
         * @return GetMetricsRequestBuilder
         */
        public GetMetricsRequestBuilder perPage(Double perPage) {
            this.perPage = perPage;
            return this;
        }
        
        /**
         * Set sort
         * @param sort The way to sort the results.  Option descriptions:  * &#x60;average_percent_watched&#x60; - Sort the results by mean seconds played.  * &#x60;average_time_watched&#x60; - Sort the results by mean percentage played.  * &#x60;comments&#x60; - Sort the results by the number of comments.  * &#x60;country&#x60; - Sort the results by country.  * &#x60;default&#x60; - Sort the results by the values of both the **dimension** and **time_interval** fields.  * &#x60;device_type&#x60; - Sort the results by device type.  * &#x60;downloads&#x60; - Sort the results by the number of downloads.  * &#x60;embed_domain&#x60; - Sort the results by embed domain.  * &#x60;finishes&#x60; - Sort the results by the number of complete plays.  * &#x60;impressions&#x60; - Sort the results by the number of impressions.  * &#x60;like&#x60; - Sort the results by the number of likes.  * &#x60;time&#x60; - Sort the results by the value of the **start_date** field. This option is available only when the value of **time_interval** isn&#39;t &#x60;none&#x60;.  * &#x60;total_time_watched&#x60; - Sort the results by total seconds played.  * &#x60;unique_impressions&#x60; - Sort the results by unique impressions.  * &#x60;unique_viewers&#x60; - Sort the results by unique viewers.  * &#x60;video&#x60; - Sort the results by video ID.  * &#x60;views&#x60; - Sort the results by the number of views.  (optional)
         * @return GetMetricsRequestBuilder
         */
        public GetMetricsRequestBuilder sort(String sort) {
            this.sort = sort;
            return this;
        }
        
        /**
         * Set timeInterval
         * @param timeInterval The interval by which to aggregate the data according to the specified data dimension. The default value is &#x60;none&#x60;.  Option descriptions:  * &#x60;day&#x60; - Aggregate the results by day according to the specified data dimension.  * &#x60;month&#x60; - Aggregate the results by month according to the specified data dimension.  * &#x60;none&#x60; - The results are not aggregated by time interval.  * &#x60;week&#x60; - Aggregate the results by week according to the specified data dimension.  * &#x60;year&#x60; - Aggregate the results by year according to the specified data dimension.  (optional)
         * @return GetMetricsRequestBuilder
         */
        public GetMetricsRequestBuilder timeInterval(String timeInterval) {
            this.timeInterval = timeInterval;
            return this;
        }
        
        /**
         * Build call for getMetrics
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The analytics were returned. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getMetricsCall(userId, dimension, from, to, direction, filterContent, filterCountries, filterDeviceTypes, filterEmbedDomains, filterStreamingTypes, page, perPage, sort, timeInterval, _callback);
        }


        /**
         * Execute getMetrics request
         * @return List&lt;Analytics&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The analytics were returned. </td><td>  -  </td></tr>
         </table>
         */
        public List<Analytics> execute() throws ApiException {
            ApiResponse<List<Analytics>> localVarResp = getMetricsWithHttpInfo(userId, dimension, from, to, direction, filterContent, filterCountries, filterDeviceTypes, filterEmbedDomains, filterStreamingTypes, page, perPage, sort, timeInterval);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getMetrics request with HTTP info returned
         * @return ApiResponse&lt;List&lt;Analytics&gt;&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The analytics were returned. </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<List<Analytics>> executeWithHttpInfo() throws ApiException {
            return getMetricsWithHttpInfo(userId, dimension, from, to, direction, filterContent, filterCountries, filterDeviceTypes, filterEmbedDomains, filterStreamingTypes, page, perPage, sort, timeInterval);
        }

        /**
         * Execute getMetrics request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The analytics were returned. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<List<Analytics>> _callback) throws ApiException {
            return getMetricsAsync(userId, dimension, from, to, direction, filterContent, filterCountries, filterDeviceTypes, filterEmbedDomains, filterStreamingTypes, page, perPage, sort, timeInterval, _callback);
        }
    }

    /**
     * Get analytics for the user
     * This method returns analytic metrics for the authenticated user.
     * @param userId The ID of the user. (required)
     * @param dimension The data dimension by which to group the results.  Option descriptions:  * &#x60;country&#x60; - Group the results by country.  * &#x60;device_type&#x60; - Group the results by device type.  * &#x60;embed_domain&#x60; - Group the results by embed domain.  * &#x60;total&#x60; - Group the results by the time range provided.  * &#x60;video&#x60; - Group the results by video.  (required)
     * @param from The start date of the range of results in ISO 8601 format. (required)
     * @param to The end date of the range of results in ISO 8601 format. (required)
     * @return GetMetricsRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The analytics were returned. </td><td>  -  </td></tr>
     </table>
     */
    public GetMetricsRequestBuilder getMetrics(double userId, String dimension, String from, String to) throws IllegalArgumentException {
        
        if (dimension == null) throw new IllegalArgumentException("\"dimension\" is required but got null");
            

        if (from == null) throw new IllegalArgumentException("\"from\" is required but got null");
            

        if (to == null) throw new IllegalArgumentException("\"to\" is required but got null");
            

        return new GetMetricsRequestBuilder(userId, dimension, from, to);
    }
    private okhttp3.Call getUserMetricsCall(String dimension, String from, String to, String direction, String filterContent, List<String> filterCountries, List<String> filterDeviceTypes, List<String> filterEmbedDomains, List<String> filterStreamingTypes, Double page, Double perPage, String sort, String timeInterval, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/me/analytics";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (dimension != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("dimension", dimension));
        }

        if (direction != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("direction", direction));
        }

        if (filterContent != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("filter_content", filterContent));
        }

        if (filterCountries != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "filter_countries", filterCountries));
        }

        if (filterDeviceTypes != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "filter_device_types", filterDeviceTypes));
        }

        if (filterEmbedDomains != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "filter_embed_domains", filterEmbedDomains));
        }

        if (filterStreamingTypes != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "filter_streaming_types", filterStreamingTypes));
        }

        if (from != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("from", from));
        }

        if (page != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page", page));
        }

        if (perPage != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("per_page", perPage));
        }

        if (sort != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("sort", sort));
        }

        if (timeInterval != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("time_interval", timeInterval));
        }

        if (to != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("to", to));
        }

        final String[] localVarAccepts = {
            "application/vnd.vimeo.analytics+json"
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
    private okhttp3.Call getUserMetricsValidateBeforeCall(String dimension, String from, String to, String direction, String filterContent, List<String> filterCountries, List<String> filterDeviceTypes, List<String> filterEmbedDomains, List<String> filterStreamingTypes, Double page, Double perPage, String sort, String timeInterval, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'dimension' is set
        if (dimension == null) {
            throw new ApiException("Missing the required parameter 'dimension' when calling getUserMetrics(Async)");
        }

        // verify the required parameter 'from' is set
        if (from == null) {
            throw new ApiException("Missing the required parameter 'from' when calling getUserMetrics(Async)");
        }

        // verify the required parameter 'to' is set
        if (to == null) {
            throw new ApiException("Missing the required parameter 'to' when calling getUserMetrics(Async)");
        }

        return getUserMetricsCall(dimension, from, to, direction, filterContent, filterCountries, filterDeviceTypes, filterEmbedDomains, filterStreamingTypes, page, perPage, sort, timeInterval, _callback);

    }


    private ApiResponse<List<Analytics>> getUserMetricsWithHttpInfo(String dimension, String from, String to, String direction, String filterContent, List<String> filterCountries, List<String> filterDeviceTypes, List<String> filterEmbedDomains, List<String> filterStreamingTypes, Double page, Double perPage, String sort, String timeInterval) throws ApiException {
        okhttp3.Call localVarCall = getUserMetricsValidateBeforeCall(dimension, from, to, direction, filterContent, filterCountries, filterDeviceTypes, filterEmbedDomains, filterStreamingTypes, page, perPage, sort, timeInterval, null);
        Type localVarReturnType = new TypeToken<List<Analytics>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getUserMetricsAsync(String dimension, String from, String to, String direction, String filterContent, List<String> filterCountries, List<String> filterDeviceTypes, List<String> filterEmbedDomains, List<String> filterStreamingTypes, Double page, Double perPage, String sort, String timeInterval, final ApiCallback<List<Analytics>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getUserMetricsValidateBeforeCall(dimension, from, to, direction, filterContent, filterCountries, filterDeviceTypes, filterEmbedDomains, filterStreamingTypes, page, perPage, sort, timeInterval, _callback);
        Type localVarReturnType = new TypeToken<List<Analytics>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetUserMetricsRequestBuilder {
        private final String dimension;
        private final String from;
        private final String to;
        private String direction;
        private String filterContent;
        private List<String> filterCountries;
        private List<String> filterDeviceTypes;
        private List<String> filterEmbedDomains;
        private List<String> filterStreamingTypes;
        private Double page;
        private Double perPage;
        private String sort;
        private String timeInterval;

        private GetUserMetricsRequestBuilder(String dimension, String from, String to) {
            this.dimension = dimension;
            this.from = from;
            this.to = to;
        }

        /**
         * Set direction
         * @param direction The sort direction of the results.  Option descriptions:  * &#x60;asc&#x60; - Sort the results in ascending order.  * &#x60;desc&#x60; - Sort the results in descending order.  (optional)
         * @return GetUserMetricsRequestBuilder
         */
        public GetUserMetricsRequestBuilder direction(String direction) {
            this.direction = direction;
            return this;
        }
        
        /**
         * Set filterContent
         * @param filterContent A comma-separated list of video, folder, or event URIs to filter. (optional)
         * @return GetUserMetricsRequestBuilder
         */
        public GetUserMetricsRequestBuilder filterContent(String filterContent) {
            this.filterContent = filterContent;
            return this;
        }
        
        /**
         * Set filterCountries
         * @param filterCountries A comma-separated list of country codes in ISO-3166 format to filter on. (optional)
         * @return GetUserMetricsRequestBuilder
         */
        public GetUserMetricsRequestBuilder filterCountries(List<String> filterCountries) {
            this.filterCountries = filterCountries;
            return this;
        }
        
        /**
         * Set filterDeviceTypes
         * @param filterDeviceTypes A comma-separated list of device types to filter on. (optional)
         * @return GetUserMetricsRequestBuilder
         */
        public GetUserMetricsRequestBuilder filterDeviceTypes(List<String> filterDeviceTypes) {
            this.filterDeviceTypes = filterDeviceTypes;
            return this;
        }
        
        /**
         * Set filterEmbedDomains
         * @param filterEmbedDomains A comma-separated list of domain names to filter on. (optional)
         * @return GetUserMetricsRequestBuilder
         */
        public GetUserMetricsRequestBuilder filterEmbedDomains(List<String> filterEmbedDomains) {
            this.filterEmbedDomains = filterEmbedDomains;
            return this;
        }
        
        /**
         * Set filterStreamingTypes
         * @param filterStreamingTypes A comma-separated list of streaming types to filter on. (optional)
         * @return GetUserMetricsRequestBuilder
         */
        public GetUserMetricsRequestBuilder filterStreamingTypes(List<String> filterStreamingTypes) {
            this.filterStreamingTypes = filterStreamingTypes;
            return this;
        }
        
        /**
         * Set page
         * @param page The page number of the results to show. (optional)
         * @return GetUserMetricsRequestBuilder
         */
        public GetUserMetricsRequestBuilder page(Double page) {
            this.page = page;
            return this;
        }
        
        /**
         * Set perPage
         * @param perPage The maximum number of items returned from the request, up to a limit of 1000 items. The default value is &#x60;50&#x60;. (optional)
         * @return GetUserMetricsRequestBuilder
         */
        public GetUserMetricsRequestBuilder perPage(Double perPage) {
            this.perPage = perPage;
            return this;
        }
        
        /**
         * Set sort
         * @param sort The way to sort the results.  Option descriptions:  * &#x60;average_percent_watched&#x60; - Sort the results by mean seconds played.  * &#x60;average_time_watched&#x60; - Sort the results by mean percentage played.  * &#x60;comments&#x60; - Sort the results by the number of comments.  * &#x60;country&#x60; - Sort the results by country.  * &#x60;default&#x60; - Sort the results by the values of both the **dimension** and **time_interval** fields.  * &#x60;device_type&#x60; - Sort the results by device type.  * &#x60;downloads&#x60; - Sort the results by the number of downloads.  * &#x60;embed_domain&#x60; - Sort the results by embed domain.  * &#x60;finishes&#x60; - Sort the results by the number of complete plays.  * &#x60;impressions&#x60; - Sort the results by the number of impressions.  * &#x60;like&#x60; - Sort the results by the number of likes.  * &#x60;time&#x60; - Sort the results by the value of the **start_date** field. This option is available only when the value of **time_interval** isn&#39;t &#x60;none&#x60;.  * &#x60;total_time_watched&#x60; - Sort the results by total seconds played.  * &#x60;unique_impressions&#x60; - Sort the results by unique impressions.  * &#x60;unique_viewers&#x60; - Sort the results by unique viewers.  * &#x60;video&#x60; - Sort the results by video ID.  * &#x60;views&#x60; - Sort the results by the number of views.  (optional)
         * @return GetUserMetricsRequestBuilder
         */
        public GetUserMetricsRequestBuilder sort(String sort) {
            this.sort = sort;
            return this;
        }
        
        /**
         * Set timeInterval
         * @param timeInterval The interval by which to aggregate the data according to the specified data dimension. The default value is &#x60;none&#x60;.  Option descriptions:  * &#x60;day&#x60; - Aggregate the results by day according to the specified data dimension.  * &#x60;month&#x60; - Aggregate the results by month according to the specified data dimension.  * &#x60;none&#x60; - The results are not aggregated by time interval.  * &#x60;week&#x60; - Aggregate the results by week according to the specified data dimension.  * &#x60;year&#x60; - Aggregate the results by year according to the specified data dimension.  (optional)
         * @return GetUserMetricsRequestBuilder
         */
        public GetUserMetricsRequestBuilder timeInterval(String timeInterval) {
            this.timeInterval = timeInterval;
            return this;
        }
        
        /**
         * Build call for getUserMetrics
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The analytics were returned. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getUserMetricsCall(dimension, from, to, direction, filterContent, filterCountries, filterDeviceTypes, filterEmbedDomains, filterStreamingTypes, page, perPage, sort, timeInterval, _callback);
        }


        /**
         * Execute getUserMetrics request
         * @return List&lt;Analytics&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The analytics were returned. </td><td>  -  </td></tr>
         </table>
         */
        public List<Analytics> execute() throws ApiException {
            ApiResponse<List<Analytics>> localVarResp = getUserMetricsWithHttpInfo(dimension, from, to, direction, filterContent, filterCountries, filterDeviceTypes, filterEmbedDomains, filterStreamingTypes, page, perPage, sort, timeInterval);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getUserMetrics request with HTTP info returned
         * @return ApiResponse&lt;List&lt;Analytics&gt;&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The analytics were returned. </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<List<Analytics>> executeWithHttpInfo() throws ApiException {
            return getUserMetricsWithHttpInfo(dimension, from, to, direction, filterContent, filterCountries, filterDeviceTypes, filterEmbedDomains, filterStreamingTypes, page, perPage, sort, timeInterval);
        }

        /**
         * Execute getUserMetrics request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The analytics were returned. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<List<Analytics>> _callback) throws ApiException {
            return getUserMetricsAsync(dimension, from, to, direction, filterContent, filterCountries, filterDeviceTypes, filterEmbedDomains, filterStreamingTypes, page, perPage, sort, timeInterval, _callback);
        }
    }

    /**
     * Get analytics for the user
     * This method returns analytic metrics for the authenticated user.
     * @param dimension The data dimension by which to group the results.  Option descriptions:  * &#x60;country&#x60; - Group the results by country.  * &#x60;device_type&#x60; - Group the results by device type.  * &#x60;embed_domain&#x60; - Group the results by embed domain.  * &#x60;total&#x60; - Group the results by the time range provided.  * &#x60;video&#x60; - Group the results by video.  (required)
     * @param from The start date of the range of results in ISO 8601 format. (required)
     * @param to The end date of the range of results in ISO 8601 format. (required)
     * @return GetUserMetricsRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The analytics were returned. </td><td>  -  </td></tr>
     </table>
     */
    public GetUserMetricsRequestBuilder getUserMetrics(String dimension, String from, String to) throws IllegalArgumentException {
        if (dimension == null) throw new IllegalArgumentException("\"dimension\" is required but got null");
            

        if (from == null) throw new IllegalArgumentException("\"from\" is required but got null");
            

        if (to == null) throw new IllegalArgumentException("\"to\" is required but got null");
            

        return new GetUserMetricsRequestBuilder(dimension, from, to);
    }
}
