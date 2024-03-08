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


import com.konfigthis.client.model.EditUserRequest;
import com.konfigthis.client.model.EditUserRequestVideos;
import com.konfigthis.client.model.User;
import com.konfigthis.client.model.UsersEssentialsEditVimeoAccountRequest;
import com.konfigthis.client.model.UsersEssentialsEditVimeoAccountRequestVideos;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class UsersEssentialsApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public UsersEssentialsApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public UsersEssentialsApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
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

    private okhttp3.Call editVimeoAccountCall(UsersEssentialsEditVimeoAccountRequest usersEssentialsEditVimeoAccountRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = usersEssentialsEditVimeoAccountRequest;

        // create path and map variables
        String localVarPath = "/me";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/vnd.vimeo.user+json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/vnd.vimeo.user+json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "oauth2", "oauth2" };
        return localVarApiClient.buildCall(basePath, localVarPath, "PATCH", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call editVimeoAccountValidateBeforeCall(UsersEssentialsEditVimeoAccountRequest usersEssentialsEditVimeoAccountRequest, final ApiCallback _callback) throws ApiException {
        return editVimeoAccountCall(usersEssentialsEditVimeoAccountRequest, _callback);

    }


    private ApiResponse<User> editVimeoAccountWithHttpInfo(UsersEssentialsEditVimeoAccountRequest usersEssentialsEditVimeoAccountRequest) throws ApiException {
        okhttp3.Call localVarCall = editVimeoAccountValidateBeforeCall(usersEssentialsEditVimeoAccountRequest, null);
        Type localVarReturnType = new TypeToken<User>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call editVimeoAccountAsync(UsersEssentialsEditVimeoAccountRequest usersEssentialsEditVimeoAccountRequest, final ApiCallback<User> _callback) throws ApiException {

        okhttp3.Call localVarCall = editVimeoAccountValidateBeforeCall(usersEssentialsEditVimeoAccountRequest, _callback);
        Type localVarReturnType = new TypeToken<User>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class EditVimeoAccountRequestBuilder {
        private String bio;
        private List<String> contentFilter;
        private String gender;
        private String link;
        private String location;
        private String name;
        private String password;
        private UsersEssentialsEditVimeoAccountRequestVideos videos;

        private EditVimeoAccountRequestBuilder() {
        }

        /**
         * Set bio
         * @param bio The user&#39;s bio. (optional)
         * @return EditVimeoAccountRequestBuilder
         */
        public EditVimeoAccountRequestBuilder bio(String bio) {
            this.bio = bio;
            return this;
        }
        
        /**
         * Set contentFilter
         * @param contentFilter A list of values describing the content in the user&#39;s videos. Find the full list in the [/contentratings](https://developer.vimeo.com/api/reference/videos#get_content_ratings) endpoint. You must provide a comma-separated list if you&#39;re using a query string or an array if you&#39;re using JSON. (optional)
         * @return EditVimeoAccountRequestBuilder
         */
        public EditVimeoAccountRequestBuilder contentFilter(List<String> contentFilter) {
            this.contentFilter = contentFilter;
            return this;
        }
        
        /**
         * Set gender
         * @param gender The authenticated user&#39;s gender.  Option descriptions:  * &#x60;f&#x60; - The user&#39;s preferred pronouns are she and her.  * &#x60;m&#x60; - The user&#39;s preferred pronouns are he and him.  * &#x60;n&#x60; - The user would rather not give preferred pronouns.  * &#x60;o&#x60; - The user&#39;s preferred pronouns are they and them.  (optional)
         * @return EditVimeoAccountRequestBuilder
         */
        public EditVimeoAccountRequestBuilder gender(String gender) {
            this.gender = gender;
            return this;
        }
        
        /**
         * Set link
         * @param link The user&#39;s custom Vimeo URL. (optional)
         * @return EditVimeoAccountRequestBuilder
         */
        public EditVimeoAccountRequestBuilder link(String link) {
            this.link = link;
            return this;
        }
        
        /**
         * Set location
         * @param location The user&#39;s location. (optional)
         * @return EditVimeoAccountRequestBuilder
         */
        public EditVimeoAccountRequestBuilder location(String location) {
            this.location = location;
            return this;
        }
        
        /**
         * Set name
         * @param name The user&#39;s display name. (optional)
         * @return EditVimeoAccountRequestBuilder
         */
        public EditVimeoAccountRequestBuilder name(String name) {
            this.name = name;
            return this;
        }
        
        /**
         * Set password
         * @param password The default password for all future videos that this user uploads. To use this field, the **videos.privacy.view** field must be &#x60;password&#x60;. (optional)
         * @return EditVimeoAccountRequestBuilder
         */
        public EditVimeoAccountRequestBuilder password(String password) {
            this.password = password;
            return this;
        }
        
        /**
         * Set videos
         * @param videos  (optional)
         * @return EditVimeoAccountRequestBuilder
         */
        public EditVimeoAccountRequestBuilder videos(UsersEssentialsEditVimeoAccountRequestVideos videos) {
            this.videos = videos;
            return this;
        }
        
        /**
         * Build call for editVimeoAccount
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The user&#39;s Vimeo account was edited. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            UsersEssentialsEditVimeoAccountRequest usersEssentialsEditVimeoAccountRequest = buildBodyParams();
            return editVimeoAccountCall(usersEssentialsEditVimeoAccountRequest, _callback);
        }

        private UsersEssentialsEditVimeoAccountRequest buildBodyParams() {
            UsersEssentialsEditVimeoAccountRequest usersEssentialsEditVimeoAccountRequest = new UsersEssentialsEditVimeoAccountRequest();
            usersEssentialsEditVimeoAccountRequest.bio(this.bio);
            usersEssentialsEditVimeoAccountRequest.contentFilter(this.contentFilter);
            if (this.gender != null)
            usersEssentialsEditVimeoAccountRequest.gender(UsersEssentialsEditVimeoAccountRequest.GenderEnum.fromValue(this.gender));
            usersEssentialsEditVimeoAccountRequest.link(this.link);
            usersEssentialsEditVimeoAccountRequest.location(this.location);
            usersEssentialsEditVimeoAccountRequest.name(this.name);
            usersEssentialsEditVimeoAccountRequest.password(this.password);
            usersEssentialsEditVimeoAccountRequest.videos(this.videos);
            return usersEssentialsEditVimeoAccountRequest;
        }

        /**
         * Execute editVimeoAccount request
         * @return User
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The user&#39;s Vimeo account was edited. </td><td>  -  </td></tr>
         </table>
         */
        public User execute() throws ApiException {
            UsersEssentialsEditVimeoAccountRequest usersEssentialsEditVimeoAccountRequest = buildBodyParams();
            ApiResponse<User> localVarResp = editVimeoAccountWithHttpInfo(usersEssentialsEditVimeoAccountRequest);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute editVimeoAccount request with HTTP info returned
         * @return ApiResponse&lt;User&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The user&#39;s Vimeo account was edited. </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<User> executeWithHttpInfo() throws ApiException {
            UsersEssentialsEditVimeoAccountRequest usersEssentialsEditVimeoAccountRequest = buildBodyParams();
            return editVimeoAccountWithHttpInfo(usersEssentialsEditVimeoAccountRequest);
        }

        /**
         * Execute editVimeoAccount request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The user&#39;s Vimeo account was edited. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<User> _callback) throws ApiException {
            UsersEssentialsEditVimeoAccountRequest usersEssentialsEditVimeoAccountRequest = buildBodyParams();
            return editVimeoAccountAsync(usersEssentialsEditVimeoAccountRequest, _callback);
        }
    }

    /**
     * Edit the user
     * This method edits the Vimeo account of the authenticated user.
     * @return EditVimeoAccountRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The user&#39;s Vimeo account was edited. </td><td>  -  </td></tr>
     </table>
     */
    public EditVimeoAccountRequestBuilder editVimeoAccount() throws IllegalArgumentException {
        return new EditVimeoAccountRequestBuilder();
    }
    private okhttp3.Call getUserCall(final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/me";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/vnd.vimeo.user+json"
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
    private okhttp3.Call getUserValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        return getUserCall(_callback);

    }


    private ApiResponse<User> getUserWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = getUserValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<User>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getUserAsync(final ApiCallback<User> _callback) throws ApiException {

        okhttp3.Call localVarCall = getUserValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<User>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetUserRequestBuilder {

        private GetUserRequestBuilder() {
        }

        /**
         * Build call for getUser
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The user was returned. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getUserCall(_callback);
        }


        /**
         * Execute getUser request
         * @return User
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The user was returned. </td><td>  -  </td></tr>
         </table>
         */
        public User execute() throws ApiException {
            ApiResponse<User> localVarResp = getUserWithHttpInfo();
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getUser request with HTTP info returned
         * @return ApiResponse&lt;User&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The user was returned. </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<User> executeWithHttpInfo() throws ApiException {
            return getUserWithHttpInfo();
        }

        /**
         * Execute getUser request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The user was returned. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<User> _callback) throws ApiException {
            return getUserAsync(_callback);
        }
    }

    /**
     * Get the user
     * This method returns the authenticated user.
     * @return GetUserRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The user was returned. </td><td>  -  </td></tr>
     </table>
     */
    public GetUserRequestBuilder getUser() throws IllegalArgumentException {
        return new GetUserRequestBuilder();
    }
    private okhttp3.Call userCall(Double userId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/users/{user_id}"
            .replace("{" + "user_id" + "}", localVarApiClient.escapeString(userId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/vnd.vimeo.user+json"
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
    private okhttp3.Call userValidateBeforeCall(Double userId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling user(Async)");
        }

        return userCall(userId, _callback);

    }


    private ApiResponse<User> userWithHttpInfo(Double userId) throws ApiException {
        okhttp3.Call localVarCall = userValidateBeforeCall(userId, null);
        Type localVarReturnType = new TypeToken<User>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call userAsync(Double userId, final ApiCallback<User> _callback) throws ApiException {

        okhttp3.Call localVarCall = userValidateBeforeCall(userId, _callback);
        Type localVarReturnType = new TypeToken<User>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class UserRequestBuilder {
        private final Double userId;

        private UserRequestBuilder(double userId) {
            this.userId = userId;
        }

        /**
         * Build call for user
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The user was returned. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return userCall(userId, _callback);
        }


        /**
         * Execute user request
         * @return User
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The user was returned. </td><td>  -  </td></tr>
         </table>
         */
        public User execute() throws ApiException {
            ApiResponse<User> localVarResp = userWithHttpInfo(userId);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute user request with HTTP info returned
         * @return ApiResponse&lt;User&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The user was returned. </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<User> executeWithHttpInfo() throws ApiException {
            return userWithHttpInfo(userId);
        }

        /**
         * Execute user request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The user was returned. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<User> _callback) throws ApiException {
            return userAsync(userId, _callback);
        }
    }

    /**
     * Get the user
     * This method returns the authenticated user.
     * @param userId The ID of the user. (required)
     * @return UserRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The user was returned. </td><td>  -  </td></tr>
     </table>
     */
    public UserRequestBuilder user(double userId) throws IllegalArgumentException {
        
        return new UserRequestBuilder(userId);
    }
    private okhttp3.Call user_0Call(Double userId, EditUserRequest editUserRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = editUserRequest;

        // create path and map variables
        String localVarPath = "/users/{user_id}"
            .replace("{" + "user_id" + "}", localVarApiClient.escapeString(userId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/vnd.vimeo.user+json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/vnd.vimeo.user+json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "oauth2", "oauth2" };
        return localVarApiClient.buildCall(basePath, localVarPath, "PATCH", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call user_0ValidateBeforeCall(Double userId, EditUserRequest editUserRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling user_0(Async)");
        }

        return user_0Call(userId, editUserRequest, _callback);

    }


    private ApiResponse<User> user_0WithHttpInfo(Double userId, EditUserRequest editUserRequest) throws ApiException {
        okhttp3.Call localVarCall = user_0ValidateBeforeCall(userId, editUserRequest, null);
        Type localVarReturnType = new TypeToken<User>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call user_0Async(Double userId, EditUserRequest editUserRequest, final ApiCallback<User> _callback) throws ApiException {

        okhttp3.Call localVarCall = user_0ValidateBeforeCall(userId, editUserRequest, _callback);
        Type localVarReturnType = new TypeToken<User>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class User0RequestBuilder {
        private final Double userId;
        private String bio;
        private List<String> contentFilter;
        private String gender;
        private String link;
        private String location;
        private String name;
        private String password;
        private EditUserRequestVideos videos;

        private User0RequestBuilder(double userId) {
            this.userId = userId;
        }

        /**
         * Set bio
         * @param bio The user&#39;s bio. (optional)
         * @return User0RequestBuilder
         */
        public User0RequestBuilder bio(String bio) {
            this.bio = bio;
            return this;
        }
        
        /**
         * Set contentFilter
         * @param contentFilter A list of values describing the content in the user&#39;s videos. Find the full list in the [/contentratings](https://developer.vimeo.com/api/reference/videos#get_content_ratings) endpoint. You must provide a comma-separated list if you&#39;re using a query string or an array if you&#39;re using JSON. (optional)
         * @return User0RequestBuilder
         */
        public User0RequestBuilder contentFilter(List<String> contentFilter) {
            this.contentFilter = contentFilter;
            return this;
        }
        
        /**
         * Set gender
         * @param gender The authenticated user&#39;s gender.  Option descriptions:  * &#x60;f&#x60; - The user&#39;s preferred pronouns are she and her.  * &#x60;m&#x60; - The user&#39;s preferred pronouns are he and him.  * &#x60;n&#x60; - The user would rather not give preferred pronouns.  * &#x60;o&#x60; - The user&#39;s preferred pronouns are they and them.  (optional)
         * @return User0RequestBuilder
         */
        public User0RequestBuilder gender(String gender) {
            this.gender = gender;
            return this;
        }
        
        /**
         * Set link
         * @param link The user&#39;s custom Vimeo URL. (optional)
         * @return User0RequestBuilder
         */
        public User0RequestBuilder link(String link) {
            this.link = link;
            return this;
        }
        
        /**
         * Set location
         * @param location The user&#39;s location. (optional)
         * @return User0RequestBuilder
         */
        public User0RequestBuilder location(String location) {
            this.location = location;
            return this;
        }
        
        /**
         * Set name
         * @param name The user&#39;s display name. (optional)
         * @return User0RequestBuilder
         */
        public User0RequestBuilder name(String name) {
            this.name = name;
            return this;
        }
        
        /**
         * Set password
         * @param password The default password for all future videos that this user uploads. To use this field, the **videos.privacy.view** field must be &#x60;password&#x60;. (optional)
         * @return User0RequestBuilder
         */
        public User0RequestBuilder password(String password) {
            this.password = password;
            return this;
        }
        
        /**
         * Set videos
         * @param videos  (optional)
         * @return User0RequestBuilder
         */
        public User0RequestBuilder videos(EditUserRequestVideos videos) {
            this.videos = videos;
            return this;
        }
        
        /**
         * Build call for user_0
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The user&#39;s Vimeo account was edited. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            EditUserRequest editUserRequest = buildBodyParams();
            return user_0Call(userId, editUserRequest, _callback);
        }

        private EditUserRequest buildBodyParams() {
            EditUserRequest editUserRequest = new EditUserRequest();
            editUserRequest.bio(this.bio);
            editUserRequest.contentFilter(this.contentFilter);
            if (this.gender != null)
            editUserRequest.gender(EditUserRequest.GenderEnum.fromValue(this.gender));
            editUserRequest.link(this.link);
            editUserRequest.location(this.location);
            editUserRequest.name(this.name);
            editUserRequest.password(this.password);
            editUserRequest.videos(this.videos);
            return editUserRequest;
        }

        /**
         * Execute user_0 request
         * @return User
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The user&#39;s Vimeo account was edited. </td><td>  -  </td></tr>
         </table>
         */
        public User execute() throws ApiException {
            EditUserRequest editUserRequest = buildBodyParams();
            ApiResponse<User> localVarResp = user_0WithHttpInfo(userId, editUserRequest);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute user_0 request with HTTP info returned
         * @return ApiResponse&lt;User&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The user&#39;s Vimeo account was edited. </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<User> executeWithHttpInfo() throws ApiException {
            EditUserRequest editUserRequest = buildBodyParams();
            return user_0WithHttpInfo(userId, editUserRequest);
        }

        /**
         * Execute user_0 request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The user&#39;s Vimeo account was edited. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<User> _callback) throws ApiException {
            EditUserRequest editUserRequest = buildBodyParams();
            return user_0Async(userId, editUserRequest, _callback);
        }
    }

    /**
     * Edit the user
     * This method edits the Vimeo account of the authenticated user.
     * @param userId The ID of the user. (required)
     * @return User0RequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The user&#39;s Vimeo account was edited. </td><td>  -  </td></tr>
     </table>
     */
    public User0RequestBuilder user_0(double userId) throws IllegalArgumentException {
        
        return new User0RequestBuilder(userId);
    }
}
