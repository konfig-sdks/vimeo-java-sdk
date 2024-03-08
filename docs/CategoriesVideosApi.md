# CategoriesVideosApi

All URIs are relative to *https://api.vimeo.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAllVideoCategories**](CategoriesVideosApi.md#getAllVideoCategories) | **GET** /videos/{video_id}/categories | Get all the categories to which a video belongs |
| [**getVideoInCategory**](CategoriesVideosApi.md#getVideoInCategory) | **GET** /categories/{category}/videos/{video_id} | Get a specific video in a category |
| [**listVideosInCategory**](CategoriesVideosApi.md#listVideosInCategory) | **GET** /categories/{category}/videos | Get all the videos in a category |
| [**setVideoCategories**](CategoriesVideosApi.md#setVideoCategories) | **PUT** /videos/{video_id}/categories | Suggest categories for a video |


<a name="getAllVideoCategories"></a>
# **getAllVideoCategories**
> List&lt;Category&gt; getAllVideoCategories(videoId).page(page).perPage(perPage).execute();

Get all the categories to which a video belongs

This method returns every category that contains the specified video.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CategoriesVideosApi;
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
    Double videoId = 258684937D; // The ID of the video.
    Double page = 1D; // The page number of the results to show.
    Double perPage = 10D; // The number of items to show on each page of results, up to a maximum of 100.
    try {
      List<Category> result = client
              .categoriesVideos
              .getAllVideoCategories(videoId)
              .page(page)
              .perPage(perPage)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CategoriesVideosApi#getAllVideoCategories");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<Category>> response = client
              .categoriesVideos
              .getAllVideoCategories(videoId)
              .page(page)
              .perPage(perPage)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CategoriesVideosApi#getAllVideoCategories");
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
| **videoId** | **Double**| The ID of the video. | |
| **page** | **Double**| The page number of the results to show. | [optional] |
| **perPage** | **Double**| The number of items to show on each page of results, up to a maximum of 100. | [optional] |

### Return type

[**List&lt;Category&gt;**](Category.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.vimeo.category+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The categories were returned. |  -  |

<a name="getVideoInCategory"></a>
# **getVideoInCategory**
> Video getVideoInCategory(category, videoId).execute();

Get a specific video in a category

This method returns a single video in the specified category. You can use this method to determine whether the video belongs to the category.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CategoriesVideosApi;
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
    String category = "animation"; // The name of the category.
    Double videoId = 273576296D; // The ID of the video.
    try {
      Video result = client
              .categoriesVideos
              .getVideoInCategory(category, videoId)
              .execute();
      System.out.println(result);
      System.out.println(result.getTags());
      System.out.println(result.getDescription());
      System.out.println(result.getAllowedPrivacies());
      System.out.println(result.getApp());
      System.out.println(result.getCanMoveToProject());
      System.out.println(result.getCategories());
      System.out.println(result.getContentRating());
      System.out.println(result.getContentRatingClass());
      System.out.println(result.getContext());
      System.out.println(result.getCreatedTime());
      System.out.println(result.getCustomUrl());
      System.out.println(result.getDescriptionHtml());
      System.out.println(result.getDescriptionRich());
      System.out.println(result.getDisabledProperties());
      System.out.println(result.getDownload());
      System.out.println(result.getDuration());
      System.out.println(result.getEditSession());
      System.out.println(result.getEmbed());
      System.out.println(result.getFiles());
      System.out.println(result.getHasAudio());
      System.out.println(result.getHasAudioTracks());
      System.out.println(result.getHasChapters());
      System.out.println(result.getHasInteractive());
      System.out.println(result.getHasTextTracks());
      System.out.println(result.getHeight());
      System.out.println(result.getIsCopyrightRestricted());
      System.out.println(result.getIsFree());
      System.out.println(result.getIsPlayable());
      System.out.println(result.getLanguage());
      System.out.println(result.getLastUserActionEventDate());
      System.out.println(result.getLicense());
      System.out.println(result.getLink());
      System.out.println(result.getManageLink());
      System.out.println(result.getMetadata());
      System.out.println(result.getModifiedTime());
      System.out.println(result.getName());
      System.out.println(result.getOriginVariableFrameResolution());
      System.out.println(result.getParentFolder());
      System.out.println(result.getPassword());
      System.out.println(result.getPictures());
      System.out.println(result.getPlay());
      System.out.println(result.getPlayerEmbedUrl());
      System.out.println(result.getPrivacy());
      System.out.println(result.getRatingModLocked());
      System.out.println(result.getReleaseTime());
      System.out.println(result.getResourceKey());
      System.out.println(result.getShowReviewPage());
      System.out.println(result.getShowSvvFooterBanner());
      System.out.println(result.getShowSvvTimecodedComments());
      System.out.println(result.getSpatial());
      System.out.println(result.getStats());
      System.out.println(result.getStatus());
      System.out.println(result.getTranscode());
      System.out.println(result.getTranscript());
      System.out.println(result.getType());
      System.out.println(result.getUpload());
      System.out.println(result.getUploader());
      System.out.println(result.getUri());
      System.out.println(result.getUser());
      System.out.println(result.getVersionTranscodeStatus());
      System.out.println(result.getVod());
      System.out.println(result.getWidth());
    } catch (ApiException e) {
      System.err.println("Exception when calling CategoriesVideosApi#getVideoInCategory");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Video> response = client
              .categoriesVideos
              .getVideoInCategory(category, videoId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CategoriesVideosApi#getVideoInCategory");
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
| **category** | **String**| The name of the category. | |
| **videoId** | **Double**| The ID of the video. | |

### Return type

[**Video**](Video.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.vimeo.video+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The video was returned. |  -  |

<a name="listVideosInCategory"></a>
# **listVideosInCategory**
> List&lt;Video&gt; listVideosInCategory(category).direction(direction).filter(filter).filterEmbeddable(filterEmbeddable).page(page).perPage(perPage).query(query).sort(sort).execute();

Get all the videos in a category

This method returns every video that belongs to the specified category.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CategoriesVideosApi;
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
    String category = "animation"; // The name of the category.
    String direction = "asc"; // The sort direction of the results.  Option descriptions:  * `asc` - Sort the results in ascending order.  * `desc` - Sort the results in descending order. 
    String filter = "conditional_featured"; // The attribute by which to filter the results.  Option descriptions:  * `conditional_featured` - Return featured videos.  * `embeddable` - Return embeddable videos. 
    Boolean filterEmbeddable = true; // Whether to filter the results by embeddable videos (`true`) or non-embeddable videos (`false`). This parameter is required only when **filter** is `embeddable`.
    Double page = 1D; // The page number of the results to show.
    Double perPage = 10D; // The number of items to show on each page of results, up to a maximum of 100.
    String query = "Stop motion"; // The search query to use to filter the results.
    String sort = "alphabetical"; // The way to sort the results.  Option descriptions:  * `alphabetical` - Sort the results alphabetically.  * `comments` - Sort the results by number of comments.  * `date` - Sort the results by date.  * `duration` - Sort the results by duration.  * `featured` - Sort the results by featured status.  * `likes` - Sort the results by number of likes.  * `plays` - Sort the results by number of plays.  * `relevant` - Sort the results by relevance. 
    try {
      List<Video> result = client
              .categoriesVideos
              .listVideosInCategory(category)
              .direction(direction)
              .filter(filter)
              .filterEmbeddable(filterEmbeddable)
              .page(page)
              .perPage(perPage)
              .query(query)
              .sort(sort)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CategoriesVideosApi#listVideosInCategory");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<Video>> response = client
              .categoriesVideos
              .listVideosInCategory(category)
              .direction(direction)
              .filter(filter)
              .filterEmbeddable(filterEmbeddable)
              .page(page)
              .perPage(perPage)
              .query(query)
              .sort(sort)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CategoriesVideosApi#listVideosInCategory");
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
| **category** | **String**| The name of the category. | |
| **direction** | **String**| The sort direction of the results.  Option descriptions:  * &#x60;asc&#x60; - Sort the results in ascending order.  * &#x60;desc&#x60; - Sort the results in descending order.  | [optional] [enum: asc, desc] |
| **filter** | **String**| The attribute by which to filter the results.  Option descriptions:  * &#x60;conditional_featured&#x60; - Return featured videos.  * &#x60;embeddable&#x60; - Return embeddable videos.  | [optional] [enum: conditional_featured, embeddable] |
| **filterEmbeddable** | **Boolean**| Whether to filter the results by embeddable videos (&#x60;true&#x60;) or non-embeddable videos (&#x60;false&#x60;). This parameter is required only when **filter** is &#x60;embeddable&#x60;. | [optional] |
| **page** | **Double**| The page number of the results to show. | [optional] |
| **perPage** | **Double**| The number of items to show on each page of results, up to a maximum of 100. | [optional] |
| **query** | **String**| The search query to use to filter the results. | [optional] |
| **sort** | **String**| The way to sort the results.  Option descriptions:  * &#x60;alphabetical&#x60; - Sort the results alphabetically.  * &#x60;comments&#x60; - Sort the results by number of comments.  * &#x60;date&#x60; - Sort the results by date.  * &#x60;duration&#x60; - Sort the results by duration.  * &#x60;featured&#x60; - Sort the results by featured status.  * &#x60;likes&#x60; - Sort the results by number of likes.  * &#x60;plays&#x60; - Sort the results by number of plays.  * &#x60;relevant&#x60; - Sort the results by relevance.  | [optional] [enum: alphabetical, comments, date, duration, featured, likes, plays, relevant] |

### Return type

[**List&lt;Video&gt;**](Video.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.vimeo.video+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The videos were returned. |  -  |

<a name="setVideoCategories"></a>
# **setVideoCategories**
> Category setVideoCategories(videoId, categoriesVideosSetVideoCategoriesRequest).execute();

Suggest categories for a video

This method sets multiple categories and subcategories for the specified video. Include the categories as a JSON block in the body of the request using the **category** field, like this: &#x60;[{ \&quot;category\&quot;: \&quot;Tech\&quot; }, { \&quot;category\&quot;: \&quot;Music\&quot; }]&#x60;. The authenticated user must have edit access to the video. For more information on batch requests like this one, see [Using Common Formats and Parameters](https://developer.vimeo.com/api/common-formats#working-with-batch-requests).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CategoriesVideosApi;
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
    List<String> category = Arrays.asList(); // An array of the names of the desired categories.
    Double videoId = 258684937D; // The ID of the video.
    try {
      Category result = client
              .categoriesVideos
              .setVideoCategories(category, videoId)
              .execute();
      System.out.println(result);
      System.out.println(result.getIcon());
      System.out.println(result.getIsDeprecated());
      System.out.println(result.getLastVideoFeaturedTime());
      System.out.println(result.getLink());
      System.out.println(result.getMetadata());
      System.out.println(result.getName());
      System.out.println(result.getParent());
      System.out.println(result.getPictures());
      System.out.println(result.getResourceKey());
      System.out.println(result.getSubcategories());
      System.out.println(result.getTopLevel());
      System.out.println(result.getUri());
    } catch (ApiException e) {
      System.err.println("Exception when calling CategoriesVideosApi#setVideoCategories");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Category> response = client
              .categoriesVideos
              .setVideoCategories(category, videoId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CategoriesVideosApi#setVideoCategories");
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
| **videoId** | **Double**| The ID of the video. | |
| **categoriesVideosSetVideoCategoriesRequest** | [**CategoriesVideosSetVideoCategoriesRequest**](CategoriesVideosSetVideoCategoriesRequest.md)|  | |

### Return type

[**Category**](Category.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/vnd.vimeo.category+json
 - **Accept**: application/vnd.vimeo.category+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The categories were suggested. |  -  |

