# FoldersVideosApi

All URIs are relative to *https://api.vimeo.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addMultipleToFolder**](FoldersVideosApi.md#addMultipleToFolder) | **PUT** /me/projects/{project_id}/videos | Add a list of videos to a folder |
| [**addSingleFolderVideo**](FoldersVideosApi.md#addSingleFolderVideo) | **PUT** /users/{user_id}/projects/{project_id}/videos/{video_id} | Add a video to a folder |
| [**addToFolder**](FoldersVideosApi.md#addToFolder) | **PUT** /me/projects/{project_id}/videos/{video_id} | Add a video to a folder |
| [**addToFolderVideos**](FoldersVideosApi.md#addToFolderVideos) | **PUT** /users/{user_id}/projects/{project_id}/videos | Add a list of videos to a folder |
| [**getAllFolderVideos**](FoldersVideosApi.md#getAllFolderVideos) | **GET** /users/{user_id}/projects/{project_id}/videos | Get all the videos in a folder |
| [**getVideosInFolder**](FoldersVideosApi.md#getVideosInFolder) | **GET** /me/projects/{project_id}/videos | Get all the videos in a folder |
| [**removeFromFolderVideo**](FoldersVideosApi.md#removeFromFolderVideo) | **DELETE** /users/{user_id}/projects/{project_id}/videos/{video_id} | Remove a video from a folder |
| [**removeMultipleFromFolder**](FoldersVideosApi.md#removeMultipleFromFolder) | **DELETE** /me/projects/{project_id}/videos | Remove a list of videos from a folder |
| [**removeMultipleVideosFromFolder**](FoldersVideosApi.md#removeMultipleVideosFromFolder) | **DELETE** /users/{user_id}/projects/{project_id}/videos | Remove a list of videos from a folder |
| [**removeSingleVideo**](FoldersVideosApi.md#removeSingleVideo) | **DELETE** /me/projects/{project_id}/videos/{video_id} | Remove a video from a folder |


<a name="addMultipleToFolder"></a>
# **addMultipleToFolder**
> addMultipleToFolder(projectId, uris).execute();

Add a list of videos to a folder

This method adds multiple videos to the specified folder. The authenticated user must be the owner of the folder.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FoldersVideosApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.vimeo.com";
    // Configure OAuth2 client credentials for "application" OAuth flow
    String clientId = System.getenv("CLIENT_ID");
    String clientSecret = System.getenv("CLIENT_SECRET");
    configuration.clientId = "clientId";
    configuration.clientSecret = "clientSecret";
    
    
    // Configure OAuth2 access token for authorization: oauth2
    configuration.accessToken = "YOUR ACCESS TOKEN";
    Vimeo client = new Vimeo(configuration);
    Double projectId = 12345D; // The ID of the folder.
    String uris = "/videos/258684937,/videos/273576296"; // A comma-separated list of video URIs to add.
    try {
      client
              .foldersVideos
              .addMultipleToFolder(projectId, uris)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling FoldersVideosApi#addMultipleToFolder");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .foldersVideos
              .addMultipleToFolder(projectId, uris)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling FoldersVideosApi#addMultipleToFolder");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **projectId** | **Double**| The ID of the folder. | |
| **uris** | **String**| A comma-separated list of video URIs to add. | |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | The videos were added. |  -  |

<a name="addSingleFolderVideo"></a>
# **addSingleFolderVideo**
> addSingleFolderVideo(projectId, userId, videoId).execute();

Add a video to a folder

This method adds a single video to the specified folder. The authenticated user must be the owner of the folder.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FoldersVideosApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.vimeo.com";
    // Configure OAuth2 client credentials for "application" OAuth flow
    String clientId = System.getenv("CLIENT_ID");
    String clientSecret = System.getenv("CLIENT_SECRET");
    configuration.clientId = "clientId";
    configuration.clientSecret = "clientSecret";
    
    
    // Configure OAuth2 access token for authorization: oauth2
    configuration.accessToken = "YOUR ACCESS TOKEN";
    Vimeo client = new Vimeo(configuration);
    Double projectId = 12345D; // The ID of the folder.
    Double userId = 152184D; // The ID of the user.
    Double videoId = 258684937D; // The ID of the video.
    try {
      client
              .foldersVideos
              .addSingleFolderVideo(projectId, userId, videoId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling FoldersVideosApi#addSingleFolderVideo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .foldersVideos
              .addSingleFolderVideo(projectId, userId, videoId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling FoldersVideosApi#addSingleFolderVideo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **projectId** | **Double**| The ID of the folder. | |
| **userId** | **Double**| The ID of the user. | |
| **videoId** | **Double**| The ID of the video. | |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | The video was added. |  -  |

<a name="addToFolder"></a>
# **addToFolder**
> addToFolder(projectId, videoId).execute();

Add a video to a folder

This method adds a single video to the specified folder. The authenticated user must be the owner of the folder.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FoldersVideosApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.vimeo.com";
    // Configure OAuth2 client credentials for "application" OAuth flow
    String clientId = System.getenv("CLIENT_ID");
    String clientSecret = System.getenv("CLIENT_SECRET");
    configuration.clientId = "clientId";
    configuration.clientSecret = "clientSecret";
    
    
    // Configure OAuth2 access token for authorization: oauth2
    configuration.accessToken = "YOUR ACCESS TOKEN";
    Vimeo client = new Vimeo(configuration);
    Double projectId = 12345D; // The ID of the folder.
    Double videoId = 258684937D; // The ID of the video.
    try {
      client
              .foldersVideos
              .addToFolder(projectId, videoId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling FoldersVideosApi#addToFolder");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .foldersVideos
              .addToFolder(projectId, videoId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling FoldersVideosApi#addToFolder");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **projectId** | **Double**| The ID of the folder. | |
| **videoId** | **Double**| The ID of the video. | |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | The video was added. |  -  |

<a name="addToFolderVideos"></a>
# **addToFolderVideos**
> addToFolderVideos(projectId, userId, uris).execute();

Add a list of videos to a folder

This method adds multiple videos to the specified folder. The authenticated user must be the owner of the folder.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FoldersVideosApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.vimeo.com";
    // Configure OAuth2 client credentials for "application" OAuth flow
    String clientId = System.getenv("CLIENT_ID");
    String clientSecret = System.getenv("CLIENT_SECRET");
    configuration.clientId = "clientId";
    configuration.clientSecret = "clientSecret";
    
    
    // Configure OAuth2 access token for authorization: oauth2
    configuration.accessToken = "YOUR ACCESS TOKEN";
    Vimeo client = new Vimeo(configuration);
    Double projectId = 12345D; // The ID of the folder.
    Double userId = 152184D; // The ID of the user.
    String uris = "/videos/258684937,/videos/273576296"; // A comma-separated list of video URIs to add.
    try {
      client
              .foldersVideos
              .addToFolderVideos(projectId, userId, uris)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling FoldersVideosApi#addToFolderVideos");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .foldersVideos
              .addToFolderVideos(projectId, userId, uris)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling FoldersVideosApi#addToFolderVideos");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **projectId** | **Double**| The ID of the folder. | |
| **userId** | **Double**| The ID of the user. | |
| **uris** | **String**| A comma-separated list of video URIs to add. | |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | The videos were added. |  -  |

<a name="getAllFolderVideos"></a>
# **getAllFolderVideos**
> List&lt;Video&gt; getAllFolderVideos(projectId, userId).direction(direction).filterTag(filterTag).filterTagAllOf(filterTagAllOf).filterTagExclude(filterTagExclude).includeSubfolders(includeSubfolders).page(page).perPage(perPage).query(query).queryFields(queryFields).sort(sort).execute();

Get all the videos in a folder

This method returns all the videos that belong to the specified folder.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FoldersVideosApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.vimeo.com";
    // Configure OAuth2 client credentials for "application" OAuth flow
    String clientId = System.getenv("CLIENT_ID");
    String clientSecret = System.getenv("CLIENT_SECRET");
    configuration.clientId = "clientId";
    configuration.clientSecret = "clientSecret";
    
    
    // Configure OAuth2 access token for authorization: oauth2
    configuration.accessToken = "YOUR ACCESS TOKEN";
    Vimeo client = new Vimeo(configuration);
    Double projectId = 12345D; // The ID of the folder.
    Double userId = 152184D; // The ID of the user.
    String direction = "asc"; // The sort direction of the results.  Option descriptions:  * `asc` - Sort the results in ascending order.  * `desc` - Sort the results in descending order. 
    String filterTag = "abc,xyz"; // A comma-separated list of tags to filter on. All results must include at least one of these tags. The use of this parameter triggers a search.
    String filterTagAllOf = "abc,xyz"; // A comma-separated list of tags to filter on. All results must include all of these tags. The use of this parameter triggers a search.
    String filterTagExclude = "abc,xyz"; // A comma-separated list of tags to exclude. The use of this parameter triggers a search.
    Boolean includeSubfolders = false; // Whether to include subfolders.
    Double page = 1D; // The page number of the results to show.
    Double perPage = 10D; // The number of items to show on each page of results, up to a maximum of 100.
    String query = "Stop motion"; // The search query to use to filter the results.
    String queryFields = "title,description"; // A comma-separated list of fields to query over. The default value is `title,description,chapters,tags`.
    String sort = "alphabetical"; // The way to sort the results.  Option descriptions:  * `alphabetical` - Sort the results alphabetically.  * `date` - Sort the results by date.  * `default` - Use the default sort order.  * `duration` - Sort the results by duration.  * `last_user_action_event_date` - Sort the results by the date of the last user action. 
    try {
      List<Video> result = client
              .foldersVideos
              .getAllFolderVideos(projectId, userId)
              .direction(direction)
              .filterTag(filterTag)
              .filterTagAllOf(filterTagAllOf)
              .filterTagExclude(filterTagExclude)
              .includeSubfolders(includeSubfolders)
              .page(page)
              .perPage(perPage)
              .query(query)
              .queryFields(queryFields)
              .sort(sort)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FoldersVideosApi#getAllFolderVideos");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<Video>> response = client
              .foldersVideos
              .getAllFolderVideos(projectId, userId)
              .direction(direction)
              .filterTag(filterTag)
              .filterTagAllOf(filterTagAllOf)
              .filterTagExclude(filterTagExclude)
              .includeSubfolders(includeSubfolders)
              .page(page)
              .perPage(perPage)
              .query(query)
              .queryFields(queryFields)
              .sort(sort)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling FoldersVideosApi#getAllFolderVideos");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **projectId** | **Double**| The ID of the folder. | |
| **userId** | **Double**| The ID of the user. | |
| **direction** | **String**| The sort direction of the results.  Option descriptions:  * &#x60;asc&#x60; - Sort the results in ascending order.  * &#x60;desc&#x60; - Sort the results in descending order.  | [optional] [enum: asc, desc] |
| **filterTag** | **String**| A comma-separated list of tags to filter on. All results must include at least one of these tags. The use of this parameter triggers a search. | [optional] |
| **filterTagAllOf** | **String**| A comma-separated list of tags to filter on. All results must include all of these tags. The use of this parameter triggers a search. | [optional] |
| **filterTagExclude** | **String**| A comma-separated list of tags to exclude. The use of this parameter triggers a search. | [optional] |
| **includeSubfolders** | **Boolean**| Whether to include subfolders. | [optional] |
| **page** | **Double**| The page number of the results to show. | [optional] |
| **perPage** | **Double**| The number of items to show on each page of results, up to a maximum of 100. | [optional] |
| **query** | **String**| The search query to use to filter the results. | [optional] |
| **queryFields** | **String**| A comma-separated list of fields to query over. The default value is &#x60;title,description,chapters,tags&#x60;. | [optional] |
| **sort** | **String**| The way to sort the results.  Option descriptions:  * &#x60;alphabetical&#x60; - Sort the results alphabetically.  * &#x60;date&#x60; - Sort the results by date.  * &#x60;default&#x60; - Use the default sort order.  * &#x60;duration&#x60; - Sort the results by duration.  * &#x60;last_user_action_event_date&#x60; - Sort the results by the date of the last user action.  | [optional] [enum: alphabetical, date, default, duration, last_user_action_event_date] |

### Return type

[**List&lt;Video&gt;**](Video.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The videos were returned. |  -  |

<a name="getVideosInFolder"></a>
# **getVideosInFolder**
> List&lt;Video&gt; getVideosInFolder(projectId).direction(direction).filterTag(filterTag).filterTagAllOf(filterTagAllOf).filterTagExclude(filterTagExclude).includeSubfolders(includeSubfolders).page(page).perPage(perPage).query(query).queryFields(queryFields).sort(sort).execute();

Get all the videos in a folder

This method returns all the videos that belong to the specified folder.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FoldersVideosApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.vimeo.com";
    // Configure OAuth2 client credentials for "application" OAuth flow
    String clientId = System.getenv("CLIENT_ID");
    String clientSecret = System.getenv("CLIENT_SECRET");
    configuration.clientId = "clientId";
    configuration.clientSecret = "clientSecret";
    
    
    // Configure OAuth2 access token for authorization: oauth2
    configuration.accessToken = "YOUR ACCESS TOKEN";
    Vimeo client = new Vimeo(configuration);
    Double projectId = 12345D; // The ID of the folder.
    String direction = "asc"; // The sort direction of the results.  Option descriptions:  * `asc` - Sort the results in ascending order.  * `desc` - Sort the results in descending order. 
    String filterTag = "abc,xyz"; // A comma-separated list of tags to filter on. All results must include at least one of these tags. The use of this parameter triggers a search.
    String filterTagAllOf = "abc,xyz"; // A comma-separated list of tags to filter on. All results must include all of these tags. The use of this parameter triggers a search.
    String filterTagExclude = "abc,xyz"; // A comma-separated list of tags to exclude. The use of this parameter triggers a search.
    Boolean includeSubfolders = false; // Whether to include subfolders.
    Double page = 1D; // The page number of the results to show.
    Double perPage = 10D; // The number of items to show on each page of results, up to a maximum of 100.
    String query = "Stop motion"; // The search query to use to filter the results.
    String queryFields = "title,description"; // A comma-separated list of fields to query over. The default value is `title,description,chapters,tags`.
    String sort = "alphabetical"; // The way to sort the results.  Option descriptions:  * `alphabetical` - Sort the results alphabetically.  * `date` - Sort the results by date.  * `default` - Use the default sort order.  * `duration` - Sort the results by duration.  * `last_user_action_event_date` - Sort the results by the date of the last user action. 
    try {
      List<Video> result = client
              .foldersVideos
              .getVideosInFolder(projectId)
              .direction(direction)
              .filterTag(filterTag)
              .filterTagAllOf(filterTagAllOf)
              .filterTagExclude(filterTagExclude)
              .includeSubfolders(includeSubfolders)
              .page(page)
              .perPage(perPage)
              .query(query)
              .queryFields(queryFields)
              .sort(sort)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FoldersVideosApi#getVideosInFolder");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<Video>> response = client
              .foldersVideos
              .getVideosInFolder(projectId)
              .direction(direction)
              .filterTag(filterTag)
              .filterTagAllOf(filterTagAllOf)
              .filterTagExclude(filterTagExclude)
              .includeSubfolders(includeSubfolders)
              .page(page)
              .perPage(perPage)
              .query(query)
              .queryFields(queryFields)
              .sort(sort)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling FoldersVideosApi#getVideosInFolder");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **projectId** | **Double**| The ID of the folder. | |
| **direction** | **String**| The sort direction of the results.  Option descriptions:  * &#x60;asc&#x60; - Sort the results in ascending order.  * &#x60;desc&#x60; - Sort the results in descending order.  | [optional] [enum: asc, desc] |
| **filterTag** | **String**| A comma-separated list of tags to filter on. All results must include at least one of these tags. The use of this parameter triggers a search. | [optional] |
| **filterTagAllOf** | **String**| A comma-separated list of tags to filter on. All results must include all of these tags. The use of this parameter triggers a search. | [optional] |
| **filterTagExclude** | **String**| A comma-separated list of tags to exclude. The use of this parameter triggers a search. | [optional] |
| **includeSubfolders** | **Boolean**| Whether to include subfolders. | [optional] |
| **page** | **Double**| The page number of the results to show. | [optional] |
| **perPage** | **Double**| The number of items to show on each page of results, up to a maximum of 100. | [optional] |
| **query** | **String**| The search query to use to filter the results. | [optional] |
| **queryFields** | **String**| A comma-separated list of fields to query over. The default value is &#x60;title,description,chapters,tags&#x60;. | [optional] |
| **sort** | **String**| The way to sort the results.  Option descriptions:  * &#x60;alphabetical&#x60; - Sort the results alphabetically.  * &#x60;date&#x60; - Sort the results by date.  * &#x60;default&#x60; - Use the default sort order.  * &#x60;duration&#x60; - Sort the results by duration.  * &#x60;last_user_action_event_date&#x60; - Sort the results by the date of the last user action.  | [optional] [enum: alphabetical, date, default, duration, last_user_action_event_date] |

### Return type

[**List&lt;Video&gt;**](Video.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The videos were returned. |  -  |

<a name="removeFromFolderVideo"></a>
# **removeFromFolderVideo**
> removeFromFolderVideo(projectId, userId, videoId).execute();

Remove a video from a folder

This method removes a single video from the specified folder. Please note that this doesn&#39;t delete the video itself.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FoldersVideosApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.vimeo.com";
    // Configure OAuth2 client credentials for "application" OAuth flow
    String clientId = System.getenv("CLIENT_ID");
    String clientSecret = System.getenv("CLIENT_SECRET");
    configuration.clientId = "clientId";
    configuration.clientSecret = "clientSecret";
    
    
    // Configure OAuth2 access token for authorization: oauth2
    configuration.accessToken = "YOUR ACCESS TOKEN";
    Vimeo client = new Vimeo(configuration);
    Double projectId = 12345D; // The ID of the folder.
    Double userId = 152184D; // The ID of the user.
    Double videoId = 258684937D; // The ID of the video.
    try {
      client
              .foldersVideos
              .removeFromFolderVideo(projectId, userId, videoId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling FoldersVideosApi#removeFromFolderVideo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .foldersVideos
              .removeFromFolderVideo(projectId, userId, videoId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling FoldersVideosApi#removeFromFolderVideo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **projectId** | **Double**| The ID of the folder. | |
| **userId** | **Double**| The ID of the user. | |
| **videoId** | **Double**| The ID of the video. | |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | The video was removed. |  -  |

<a name="removeMultipleFromFolder"></a>
# **removeMultipleFromFolder**
> removeMultipleFromFolder(projectId, uris).shouldDeleteClips(shouldDeleteClips).execute();

Remove a list of videos from a folder

This method removes multiple videos from the specified folder. The authenticated user must be the owner of the folder.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FoldersVideosApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.vimeo.com";
    // Configure OAuth2 client credentials for "application" OAuth flow
    String clientId = System.getenv("CLIENT_ID");
    String clientSecret = System.getenv("CLIENT_SECRET");
    configuration.clientId = "clientId";
    configuration.clientSecret = "clientSecret";
    
    
    // Configure OAuth2 access token for authorization: oauth2
    configuration.accessToken = "YOUR ACCESS TOKEN";
    Vimeo client = new Vimeo(configuration);
    Double projectId = 12345D; // The ID of the folder.
    String uris = "/videos/258684937,/videos/273576296"; // A comma-separated list of the video URIs to remove.
    Boolean shouldDeleteClips = false; // Whether to delete the videos when removing them from the folder.
    try {
      client
              .foldersVideos
              .removeMultipleFromFolder(projectId, uris)
              .shouldDeleteClips(shouldDeleteClips)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling FoldersVideosApi#removeMultipleFromFolder");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .foldersVideos
              .removeMultipleFromFolder(projectId, uris)
              .shouldDeleteClips(shouldDeleteClips)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling FoldersVideosApi#removeMultipleFromFolder");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **projectId** | **Double**| The ID of the folder. | |
| **uris** | **String**| A comma-separated list of the video URIs to remove. | |
| **shouldDeleteClips** | **Boolean**| Whether to delete the videos when removing them from the folder. | [optional] |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | The videos were removed. |  -  |

<a name="removeMultipleVideosFromFolder"></a>
# **removeMultipleVideosFromFolder**
> removeMultipleVideosFromFolder(projectId, userId, uris).shouldDeleteClips(shouldDeleteClips).execute();

Remove a list of videos from a folder

This method removes multiple videos from the specified folder. The authenticated user must be the owner of the folder.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FoldersVideosApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.vimeo.com";
    // Configure OAuth2 client credentials for "application" OAuth flow
    String clientId = System.getenv("CLIENT_ID");
    String clientSecret = System.getenv("CLIENT_SECRET");
    configuration.clientId = "clientId";
    configuration.clientSecret = "clientSecret";
    
    
    // Configure OAuth2 access token for authorization: oauth2
    configuration.accessToken = "YOUR ACCESS TOKEN";
    Vimeo client = new Vimeo(configuration);
    Double projectId = 12345D; // The ID of the folder.
    Double userId = 152184D; // The ID of the user.
    String uris = "/videos/258684937,/videos/273576296"; // A comma-separated list of the video URIs to remove.
    Boolean shouldDeleteClips = false; // Whether to delete the videos when removing them from the folder.
    try {
      client
              .foldersVideos
              .removeMultipleVideosFromFolder(projectId, userId, uris)
              .shouldDeleteClips(shouldDeleteClips)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling FoldersVideosApi#removeMultipleVideosFromFolder");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .foldersVideos
              .removeMultipleVideosFromFolder(projectId, userId, uris)
              .shouldDeleteClips(shouldDeleteClips)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling FoldersVideosApi#removeMultipleVideosFromFolder");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **projectId** | **Double**| The ID of the folder. | |
| **userId** | **Double**| The ID of the user. | |
| **uris** | **String**| A comma-separated list of the video URIs to remove. | |
| **shouldDeleteClips** | **Boolean**| Whether to delete the videos when removing them from the folder. | [optional] |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | The videos were removed. |  -  |

<a name="removeSingleVideo"></a>
# **removeSingleVideo**
> removeSingleVideo(projectId, videoId).execute();

Remove a video from a folder

This method removes a single video from the specified folder. Please note that this doesn&#39;t delete the video itself.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FoldersVideosApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.vimeo.com";
    // Configure OAuth2 client credentials for "application" OAuth flow
    String clientId = System.getenv("CLIENT_ID");
    String clientSecret = System.getenv("CLIENT_SECRET");
    configuration.clientId = "clientId";
    configuration.clientSecret = "clientSecret";
    
    
    // Configure OAuth2 access token for authorization: oauth2
    configuration.accessToken = "YOUR ACCESS TOKEN";
    Vimeo client = new Vimeo(configuration);
    Double projectId = 12345D; // The ID of the folder.
    Double videoId = 258684937D; // The ID of the video.
    try {
      client
              .foldersVideos
              .removeSingleVideo(projectId, videoId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling FoldersVideosApi#removeSingleVideo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .foldersVideos
              .removeSingleVideo(projectId, videoId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling FoldersVideosApi#removeSingleVideo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **projectId** | **Double**| The ID of the folder. | |
| **videoId** | **Double**| The ID of the video. | |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | The video was removed. |  -  |

