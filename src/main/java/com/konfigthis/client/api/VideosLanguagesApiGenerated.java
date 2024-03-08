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


import com.konfigthis.client.model.Language;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class VideosLanguagesApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public VideosLanguagesApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public VideosLanguagesApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
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

    private okhttp3.Call languagesCall(String filter, Double page, Double perPage, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/languages";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (filter != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("filter", filter));
        }

        if (page != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page", page));
        }

        if (perPage != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("per_page", perPage));
        }

        final String[] localVarAccepts = {
            "application/vnd.vimeo.language+json"
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
    private okhttp3.Call languagesValidateBeforeCall(String filter, Double page, Double perPage, final ApiCallback _callback) throws ApiException {
        return languagesCall(filter, page, perPage, _callback);

    }


    private ApiResponse<List<Language>> languagesWithHttpInfo(String filter, Double page, Double perPage) throws ApiException {
        okhttp3.Call localVarCall = languagesValidateBeforeCall(filter, page, perPage, null);
        Type localVarReturnType = new TypeToken<List<Language>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call languagesAsync(String filter, Double page, Double perPage, final ApiCallback<List<Language>> _callback) throws ApiException {

        okhttp3.Call localVarCall = languagesValidateBeforeCall(filter, page, perPage, _callback);
        Type localVarReturnType = new TypeToken<List<Language>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class LanguagesRequestBuilder {
        private String filter;
        private Double page;
        private Double perPage;

        private LanguagesRequestBuilder() {
        }

        /**
         * Set filter
         * @param filter The attribute by which to filter the results.  Option descriptions:  * &#x60;audiotracks&#x60; - Return languages that can be used for audio tracks.  * &#x60;texttracks&#x60; - Return languages that can be used for text tracks.  (optional)
         * @return LanguagesRequestBuilder
         */
        public LanguagesRequestBuilder filter(String filter) {
            this.filter = filter;
            return this;
        }
        
        /**
         * Set page
         * @param page The page number of the results to show. (optional)
         * @return LanguagesRequestBuilder
         */
        public LanguagesRequestBuilder page(Double page) {
            this.page = page;
            return this;
        }
        
        /**
         * Set perPage
         * @param perPage The number of items to show on each page of results, up to a maximum of 100. (optional)
         * @return LanguagesRequestBuilder
         */
        public LanguagesRequestBuilder perPage(Double perPage) {
            this.perPage = perPage;
            return this;
        }
        
        /**
         * Build call for languages
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The languages were returned. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return languagesCall(filter, page, perPage, _callback);
        }


        /**
         * Execute languages request
         * @return List&lt;Language&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The languages were returned. </td><td>  -  </td></tr>
         </table>
         */
        public List<Language> execute() throws ApiException {
            ApiResponse<List<Language>> localVarResp = languagesWithHttpInfo(filter, page, perPage);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute languages request with HTTP info returned
         * @return ApiResponse&lt;List&lt;Language&gt;&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The languages were returned. </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<List<Language>> executeWithHttpInfo() throws ApiException {
            return languagesWithHttpInfo(filter, page, perPage);
        }

        /**
         * Execute languages request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The languages were returned. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<List<Language>> _callback) throws ApiException {
            return languagesAsync(filter, page, perPage, _callback);
        }
    }

    /**
     * Get all languages
     * This method returns all available video languages.
     * @return LanguagesRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The languages were returned. </td><td>  -  </td></tr>
     </table>
     */
    public LanguagesRequestBuilder languages() throws IllegalArgumentException {
        return new LanguagesRequestBuilder();
    }
}