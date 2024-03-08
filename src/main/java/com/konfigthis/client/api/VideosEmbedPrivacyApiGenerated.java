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


import com.konfigthis.client.model.Domain;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class VideosEmbedPrivacyApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public VideosEmbedPrivacyApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public VideosEmbedPrivacyApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
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

    private okhttp3.Call addDomainToWhitelistCall(String domain, Double videoId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/videos/{video_id}/privacy/domains/{domain}"
            .replace("{" + "domain" + "}", localVarApiClient.escapeString(domain.toString()))
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
        return localVarApiClient.buildCall(basePath, localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call addDomainToWhitelistValidateBeforeCall(String domain, Double videoId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'domain' is set
        if (domain == null) {
            throw new ApiException("Missing the required parameter 'domain' when calling addDomainToWhitelist(Async)");
        }

        // verify the required parameter 'videoId' is set
        if (videoId == null) {
            throw new ApiException("Missing the required parameter 'videoId' when calling addDomainToWhitelist(Async)");
        }

        return addDomainToWhitelistCall(domain, videoId, _callback);

    }


    private ApiResponse<Void> addDomainToWhitelistWithHttpInfo(String domain, Double videoId) throws ApiException {
        okhttp3.Call localVarCall = addDomainToWhitelistValidateBeforeCall(domain, videoId, null);
        return localVarApiClient.execute(localVarCall);
    }

    private okhttp3.Call addDomainToWhitelistAsync(String domain, Double videoId, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = addDomainToWhitelistValidateBeforeCall(domain, videoId, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }

    public class AddDomainToWhitelistRequestBuilder {
        private final String domain;
        private final Double videoId;

        private AddDomainToWhitelistRequestBuilder(String domain, double videoId) {
            this.domain = domain;
            this.videoId = videoId;
        }

        /**
         * Build call for addDomainToWhitelist
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 204 </td><td> The video is embeddable on the domain. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return addDomainToWhitelistCall(domain, videoId, _callback);
        }


        /**
         * Execute addDomainToWhitelist request
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 204 </td><td> The video is embeddable on the domain. </td><td>  -  </td></tr>
         </table>
         */
        public void execute() throws ApiException {
            addDomainToWhitelistWithHttpInfo(domain, videoId);
        }

        /**
         * Execute addDomainToWhitelist request with HTTP info returned
         * @return ApiResponse&lt;Void&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 204 </td><td> The video is embeddable on the domain. </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Void> executeWithHttpInfo() throws ApiException {
            return addDomainToWhitelistWithHttpInfo(domain, videoId);
        }

        /**
         * Execute addDomainToWhitelist request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 204 </td><td> The video is embeddable on the domain. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Void> _callback) throws ApiException {
            return addDomainToWhitelistAsync(domain, videoId, _callback);
        }
    }

    /**
     * Add a domain to a video&#39;s whitelist
     * This method adds the specified domain to a video&#39;s whitelist.
     * @param domain The domain name. (required)
     * @param videoId The ID of the video. (required)
     * @return AddDomainToWhitelistRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> The video is embeddable on the domain. </td><td>  -  </td></tr>
     </table>
     */
    public AddDomainToWhitelistRequestBuilder addDomainToWhitelist(String domain, double videoId) throws IllegalArgumentException {
        if (domain == null) throw new IllegalArgumentException("\"domain\" is required but got null");
            

        
        return new AddDomainToWhitelistRequestBuilder(domain, videoId);
    }
    private okhttp3.Call listWhitelistDomainsCall(Double videoId, Double page, Double perPage, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/videos/{video_id}/privacy/domains"
            .replace("{" + "video_id" + "}", localVarApiClient.escapeString(videoId.toString()));

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
            "application/vnd.vimeo.domain+json"
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
    private okhttp3.Call listWhitelistDomainsValidateBeforeCall(Double videoId, Double page, Double perPage, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'videoId' is set
        if (videoId == null) {
            throw new ApiException("Missing the required parameter 'videoId' when calling listWhitelistDomains(Async)");
        }

        return listWhitelistDomainsCall(videoId, page, perPage, _callback);

    }


    private ApiResponse<List<Domain>> listWhitelistDomainsWithHttpInfo(Double videoId, Double page, Double perPage) throws ApiException {
        okhttp3.Call localVarCall = listWhitelistDomainsValidateBeforeCall(videoId, page, perPage, null);
        Type localVarReturnType = new TypeToken<List<Domain>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call listWhitelistDomainsAsync(Double videoId, Double page, Double perPage, final ApiCallback<List<Domain>> _callback) throws ApiException {

        okhttp3.Call localVarCall = listWhitelistDomainsValidateBeforeCall(videoId, page, perPage, _callback);
        Type localVarReturnType = new TypeToken<List<Domain>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class ListWhitelistDomainsRequestBuilder {
        private final Double videoId;
        private Double page;
        private Double perPage;

        private ListWhitelistDomainsRequestBuilder(double videoId) {
            this.videoId = videoId;
        }

        /**
         * Set page
         * @param page The page number of the results to show. (optional)
         * @return ListWhitelistDomainsRequestBuilder
         */
        public ListWhitelistDomainsRequestBuilder page(Double page) {
            this.page = page;
            return this;
        }
        
        /**
         * Set perPage
         * @param perPage The number of items to show on each page of results, up to a maximum of 100. (optional)
         * @return ListWhitelistDomainsRequestBuilder
         */
        public ListWhitelistDomainsRequestBuilder perPage(Double perPage) {
            this.perPage = perPage;
            return this;
        }
        
        /**
         * Build call for listWhitelistDomains
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The domains were returned. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return listWhitelistDomainsCall(videoId, page, perPage, _callback);
        }


        /**
         * Execute listWhitelistDomains request
         * @return List&lt;Domain&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The domains were returned. </td><td>  -  </td></tr>
         </table>
         */
        public List<Domain> execute() throws ApiException {
            ApiResponse<List<Domain>> localVarResp = listWhitelistDomainsWithHttpInfo(videoId, page, perPage);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute listWhitelistDomains request with HTTP info returned
         * @return ApiResponse&lt;List&lt;Domain&gt;&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The domains were returned. </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<List<Domain>> executeWithHttpInfo() throws ApiException {
            return listWhitelistDomainsWithHttpInfo(videoId, page, perPage);
        }

        /**
         * Execute listWhitelistDomains request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The domains were returned. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<List<Domain>> _callback) throws ApiException {
            return listWhitelistDomainsAsync(videoId, page, perPage, _callback);
        }
    }

    /**
     * Get all the domains on a video&#39;s whitelist
     * This method returns every domain on the specified video&#39;s whitelist.
     * @param videoId The ID of the video. (required)
     * @return ListWhitelistDomainsRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The domains were returned. </td><td>  -  </td></tr>
     </table>
     */
    public ListWhitelistDomainsRequestBuilder listWhitelistDomains(double videoId) throws IllegalArgumentException {
        
        return new ListWhitelistDomainsRequestBuilder(videoId);
    }
    private okhttp3.Call removeDomainFromWhitelistCall(String domain, Double videoId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/videos/{video_id}/privacy/domains/{domain}"
            .replace("{" + "domain" + "}", localVarApiClient.escapeString(domain.toString()))
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
        return localVarApiClient.buildCall(basePath, localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call removeDomainFromWhitelistValidateBeforeCall(String domain, Double videoId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'domain' is set
        if (domain == null) {
            throw new ApiException("Missing the required parameter 'domain' when calling removeDomainFromWhitelist(Async)");
        }

        // verify the required parameter 'videoId' is set
        if (videoId == null) {
            throw new ApiException("Missing the required parameter 'videoId' when calling removeDomainFromWhitelist(Async)");
        }

        return removeDomainFromWhitelistCall(domain, videoId, _callback);

    }


    private ApiResponse<Void> removeDomainFromWhitelistWithHttpInfo(String domain, Double videoId) throws ApiException {
        okhttp3.Call localVarCall = removeDomainFromWhitelistValidateBeforeCall(domain, videoId, null);
        return localVarApiClient.execute(localVarCall);
    }

    private okhttp3.Call removeDomainFromWhitelistAsync(String domain, Double videoId, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = removeDomainFromWhitelistValidateBeforeCall(domain, videoId, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }

    public class RemoveDomainFromWhitelistRequestBuilder {
        private final String domain;
        private final Double videoId;

        private RemoveDomainFromWhitelistRequestBuilder(String domain, double videoId) {
            this.domain = domain;
            this.videoId = videoId;
        }

        /**
         * Build call for removeDomainFromWhitelist
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 204 </td><td> The domain was removed. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return removeDomainFromWhitelistCall(domain, videoId, _callback);
        }


        /**
         * Execute removeDomainFromWhitelist request
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 204 </td><td> The domain was removed. </td><td>  -  </td></tr>
         </table>
         */
        public void execute() throws ApiException {
            removeDomainFromWhitelistWithHttpInfo(domain, videoId);
        }

        /**
         * Execute removeDomainFromWhitelist request with HTTP info returned
         * @return ApiResponse&lt;Void&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 204 </td><td> The domain was removed. </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Void> executeWithHttpInfo() throws ApiException {
            return removeDomainFromWhitelistWithHttpInfo(domain, videoId);
        }

        /**
         * Execute removeDomainFromWhitelist request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 204 </td><td> The domain was removed. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Void> _callback) throws ApiException {
            return removeDomainFromWhitelistAsync(domain, videoId, _callback);
        }
    }

    /**
     * Remove a domain from a video&#39;s whitelist
     * This method removes the specified domain from a video&#39;s whitelist.
     * @param domain The domain name. (required)
     * @param videoId The ID of the video. (required)
     * @return RemoveDomainFromWhitelistRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> The domain was removed. </td><td>  -  </td></tr>
     </table>
     */
    public RemoveDomainFromWhitelistRequestBuilder removeDomainFromWhitelist(String domain, double videoId) throws IllegalArgumentException {
        if (domain == null) throw new IllegalArgumentException("\"domain\" is required but got null");
            

        
        return new RemoveDomainFromWhitelistRequestBuilder(domain, videoId);
    }
}
