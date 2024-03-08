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


import com.konfigthis.client.model.Group;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class CategoriesGroupsApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public CategoriesGroupsApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public CategoriesGroupsApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
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

    private okhttp3.Call getAllGroupsCall(String category, String direction, Double page, Double perPage, String query, String sort, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/categories/{category}/groups"
            .replace("{" + "category" + "}", localVarApiClient.escapeString(category.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (direction != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("direction", direction));
        }

        if (page != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page", page));
        }

        if (perPage != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("per_page", perPage));
        }

        if (query != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("query", query));
        }

        if (sort != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("sort", sort));
        }

        final String[] localVarAccepts = {
            "application/vnd.vimeo.group+json"
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
    private okhttp3.Call getAllGroupsValidateBeforeCall(String category, String direction, Double page, Double perPage, String query, String sort, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'category' is set
        if (category == null) {
            throw new ApiException("Missing the required parameter 'category' when calling getAllGroups(Async)");
        }

        return getAllGroupsCall(category, direction, page, perPage, query, sort, _callback);

    }


    private ApiResponse<List<Group>> getAllGroupsWithHttpInfo(String category, String direction, Double page, Double perPage, String query, String sort) throws ApiException {
        okhttp3.Call localVarCall = getAllGroupsValidateBeforeCall(category, direction, page, perPage, query, sort, null);
        Type localVarReturnType = new TypeToken<List<Group>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getAllGroupsAsync(String category, String direction, Double page, Double perPage, String query, String sort, final ApiCallback<List<Group>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getAllGroupsValidateBeforeCall(category, direction, page, perPage, query, sort, _callback);
        Type localVarReturnType = new TypeToken<List<Group>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetAllGroupsRequestBuilder {
        private final String category;
        private String direction;
        private Double page;
        private Double perPage;
        private String query;
        private String sort;

        private GetAllGroupsRequestBuilder(String category) {
            this.category = category;
        }

        /**
         * Set direction
         * @param direction The sort direction of the results.  Option descriptions:  * &#x60;asc&#x60; - Sort the results in ascending order.  * &#x60;desc&#x60; - Sort the results in descending order.  (optional)
         * @return GetAllGroupsRequestBuilder
         */
        public GetAllGroupsRequestBuilder direction(String direction) {
            this.direction = direction;
            return this;
        }
        
        /**
         * Set page
         * @param page The page number of the results to show. (optional)
         * @return GetAllGroupsRequestBuilder
         */
        public GetAllGroupsRequestBuilder page(Double page) {
            this.page = page;
            return this;
        }
        
        /**
         * Set perPage
         * @param perPage The number of items to show on each page of results, up to a maximum of 100. (optional)
         * @return GetAllGroupsRequestBuilder
         */
        public GetAllGroupsRequestBuilder perPage(Double perPage) {
            this.perPage = perPage;
            return this;
        }
        
        /**
         * Set query
         * @param query The search query to use to filter the results. (optional)
         * @return GetAllGroupsRequestBuilder
         */
        public GetAllGroupsRequestBuilder query(String query) {
            this.query = query;
            return this;
        }
        
        /**
         * Set sort
         * @param sort The way to sort the results.  Option descriptions:  * &#x60;alphabetical&#x60; - Sort the results alphabetically.  * &#x60;date&#x60; - Sort the results by date.  * &#x60;members&#x60; - Sort the results by number of members.  * &#x60;videos&#x60; - Sort the results by number of videos.  (optional)
         * @return GetAllGroupsRequestBuilder
         */
        public GetAllGroupsRequestBuilder sort(String sort) {
            this.sort = sort;
            return this;
        }
        
        /**
         * Build call for getAllGroups
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The groups were returned. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getAllGroupsCall(category, direction, page, perPage, query, sort, _callback);
        }


        /**
         * Execute getAllGroups request
         * @return List&lt;Group&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The groups were returned. </td><td>  -  </td></tr>
         </table>
         */
        public List<Group> execute() throws ApiException {
            ApiResponse<List<Group>> localVarResp = getAllGroupsWithHttpInfo(category, direction, page, perPage, query, sort);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getAllGroups request with HTTP info returned
         * @return ApiResponse&lt;List&lt;Group&gt;&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The groups were returned. </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<List<Group>> executeWithHttpInfo() throws ApiException {
            return getAllGroupsWithHttpInfo(category, direction, page, perPage, query, sort);
        }

        /**
         * Execute getAllGroups request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The groups were returned. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<List<Group>> _callback) throws ApiException {
            return getAllGroupsAsync(category, direction, page, perPage, query, sort, _callback);
        }
    }

    /**
     * Get all the groups in a category
     * This method returns every group that belongs to the specified category.
     * @param category The name of the category. (required)
     * @return GetAllGroupsRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The groups were returned. </td><td>  -  </td></tr>
     </table>
     */
    public GetAllGroupsRequestBuilder getAllGroups(String category) throws IllegalArgumentException {
        if (category == null) throw new IllegalArgumentException("\"category\" is required but got null");
            

        return new GetAllGroupsRequestBuilder(category);
    }
}
