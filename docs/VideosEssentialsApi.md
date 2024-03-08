# VideosEssentialsApi

All URIs are relative to *https://api.vimeo.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**appearances**](VideosEssentialsApi.md#appearances) | **GET** /users/{user_id}/appearances | Get all the videos in which the user appears |
| [**checkUserOwnership**](VideosEssentialsApi.md#checkUserOwnership) | **GET** /users/{user_id}/videos/{video_id} | Check if the user owns a video |
| [**checkUserOwnsVideo**](VideosEssentialsApi.md#checkUserOwnsVideo) | **GET** /me/videos/{video_id} | Check if the user owns a video |
| [**deleteUserVideos**](VideosEssentialsApi.md#deleteUserVideos) | **DELETE** /me/videos | Delete a user&#39;s videos |
| [**getAllUserVideos**](VideosEssentialsApi.md#getAllUserVideos) | **GET** /me/videos | Get all the videos that the user has uploaded |
| [**getUserAppearances**](VideosEssentialsApi.md#getUserAppearances) | **GET** /me/appearances | Get all the videos in which the user appears |
| [**video**](VideosEssentialsApi.md#video) | **GET** /videos/{video_id} | Get a specific video |
| [**video_0**](VideosEssentialsApi.md#video_0) | **DELETE** /videos/{video_id} | Delete a video |
| [**video_1**](VideosEssentialsApi.md#video_1) | **PATCH** /videos/{video_id} | Edit a video |
| [**videos**](VideosEssentialsApi.md#videos) | **GET** /users/{user_id}/videos | Get all the videos that the user has uploaded |
| [**videos_0**](VideosEssentialsApi.md#videos_0) | **DELETE** /users/{user_id}/videos | Delete a user&#39;s videos |
| [**videos_1**](VideosEssentialsApi.md#videos_1) | **GET** /videos | Search for videos |


<a name="appearances"></a>
# **appearances**
> List&lt;Video&gt; appearances(userId).direction(direction).filter(filter).filterEmbeddable(filterEmbeddable).page(page).perPage(perPage).query(query).sort(sort).execute();

Get all the videos in which the user appears

This method returns all the videos in which the authenticated user has a credited appearance.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VideosEssentialsApi;
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
    Double userId = 152184D; // The ID of the user.
    String direction = "asc"; // The sort direction of the results.  Option descriptions:  * `asc` - Sort the results in ascending order.  * `desc` - Sort the results in descending order. 
    String filter = "embeddable"; // The attribute by which to filter the results.  Option descriptions:  * `embeddable` - Return embeddable videos. 
    Boolean filterEmbeddable = true; // Whether to filter the results by embeddable videos (`true`) or non-embeddable videos (`false`). This parameter is required only when **filter** is `embeddable`.
    Double page = 1D; // The page number of the results to show.
    Double perPage = 10D; // The number of items to show on each page of results, up to a maximum of 100.
    String query = "Stop motion"; // The search query to use to filter the results.
    String sort = "alphabetical"; // The way to sort the results.  Option descriptions:  * `alphabetical` - Sort the results alphabetically.  * `comments` - Sort the results by number of comments.  * `date` - Sort the results by date.  * `duration` - Sort the results by duration.  * `likes` - Sort the results by number of likes.  * `plays` - Sort the results by number of plays. 
    try {
      List<Video> result = client
              .videosEssentials
              .appearances(userId)
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
      System.err.println("Exception when calling VideosEssentialsApi#appearances");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<Video>> response = client
              .videosEssentials
              .appearances(userId)
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
      System.err.println("Exception when calling VideosEssentialsApi#appearances");
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
| **userId** | **Double**| The ID of the user. | |
| **direction** | **String**| The sort direction of the results.  Option descriptions:  * &#x60;asc&#x60; - Sort the results in ascending order.  * &#x60;desc&#x60; - Sort the results in descending order.  | [optional] [enum: asc, desc] |
| **filter** | **String**| The attribute by which to filter the results.  Option descriptions:  * &#x60;embeddable&#x60; - Return embeddable videos.  | [optional] [enum: embeddable] |
| **filterEmbeddable** | **Boolean**| Whether to filter the results by embeddable videos (&#x60;true&#x60;) or non-embeddable videos (&#x60;false&#x60;). This parameter is required only when **filter** is &#x60;embeddable&#x60;. | [optional] |
| **page** | **Double**| The page number of the results to show. | [optional] |
| **perPage** | **Double**| The number of items to show on each page of results, up to a maximum of 100. | [optional] |
| **query** | **String**| The search query to use to filter the results. | [optional] |
| **sort** | **String**| The way to sort the results.  Option descriptions:  * &#x60;alphabetical&#x60; - Sort the results alphabetically.  * &#x60;comments&#x60; - Sort the results by number of comments.  * &#x60;date&#x60; - Sort the results by date.  * &#x60;duration&#x60; - Sort the results by duration.  * &#x60;likes&#x60; - Sort the results by number of likes.  * &#x60;plays&#x60; - Sort the results by number of plays.  | [optional] [enum: alphabetical, comments, date, duration, likes, plays] |

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

<a name="checkUserOwnership"></a>
# **checkUserOwnership**
> Video checkUserOwnership(userId, videoId).execute();

Check if the user owns a video

This method determines whether the authenticated user is the owner of the specified video.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VideosEssentialsApi;
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
    Double userId = 152184D; // The ID of the user.
    Double videoId = 258684937D; // The ID of the video.
    try {
      Video result = client
              .videosEssentials
              .checkUserOwnership(userId, videoId)
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
      System.err.println("Exception when calling VideosEssentialsApi#checkUserOwnership");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Video> response = client
              .videosEssentials
              .checkUserOwnership(userId, videoId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosEssentialsApi#checkUserOwnership");
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
| **userId** | **Double**| The ID of the user. | |
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
| **200** | The authenticated user owns the video. |  -  |

<a name="checkUserOwnsVideo"></a>
# **checkUserOwnsVideo**
> Video checkUserOwnsVideo(videoId).execute();

Check if the user owns a video

This method determines whether the authenticated user is the owner of the specified video.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VideosEssentialsApi;
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
    try {
      Video result = client
              .videosEssentials
              .checkUserOwnsVideo(videoId)
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
      System.err.println("Exception when calling VideosEssentialsApi#checkUserOwnsVideo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Video> response = client
              .videosEssentials
              .checkUserOwnsVideo(videoId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosEssentialsApi#checkUserOwnsVideo");
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
| **200** | The authenticated user owns the video. |  -  |

<a name="deleteUserVideos"></a>
# **deleteUserVideos**
> deleteUserVideos(uris).execute();

Delete a user&#39;s videos

This method deletes one or more videos belonging to the specified user. The authenticated user must have permission to delete the videos.  Specify the videos to delete in a comma-separated list by URI using the **uris** query parameter.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VideosEssentialsApi;
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
    String uris = "/videos/258684937,/videos/258684546"; // A comma-separated list of the video URIs to delete.
    try {
      client
              .videosEssentials
              .deleteUserVideos(uris)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosEssentialsApi#deleteUserVideos");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .videosEssentials
              .deleteUserVideos(uris)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosEssentialsApi#deleteUserVideos");
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
| **uris** | **String**| A comma-separated list of the video URIs to delete. | |

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
| **204** | The videos were deleted. |  -  |

<a name="getAllUserVideos"></a>
# **getAllUserVideos**
> List&lt;Video&gt; getAllUserVideos().containingUri(containingUri).direction(direction).filter(filter).filterEmbeddable(filterEmbeddable).filterPlayable(filterPlayable).filterScreenRecorded(filterScreenRecorded).filterTag(filterTag).filterTagAllOf(filterTagAllOf).filterTagExclude(filterTagExclude).includeTeamContent(includeTeamContent).page(page).perPage(perPage).query(query).queryFields(queryFields).sort(sort).execute();

Get all the videos that the user has uploaded

This method returns all the videos that the authenticated user has uploaded.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VideosEssentialsApi;
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
    String containingUri = "/videos/258684937"; // The page that contains the video URI. The field is available only when not paired with **query**.
    String direction = "asc"; // The sort direction of the results.  Option descriptions:  * `asc` - Sort the results in ascending order.  * `desc` - Sort the results in descending order. 
    String filter = "app_only"; // The attribute by which to filter the results.  Option descriptions:  * `app_only` - Return app-only videos.  * `embeddable` - Return embeddable videos.  * `featured` - Return featured videos.  * `live` - Return only live videos.  * `no_placeholder` - Return no placeholder videos.  * `nolive` - Return no live videos.  * `playable` - Return playable videos.  * `screen_recorded` - Return screen-recorded videos. 
    Boolean filterEmbeddable = true; // Whether to filter the results by embeddable videos (`true`) or non-embeddable videos (`false`). This parameter is required only when **filter** is `embeddable`.
    Boolean filterPlayable = true; // Whether to filter the results by playable videos (`true`) or non-playable videos (`false`).
    Boolean filterScreenRecorded = true; // Whether to filter the results by screen-recorded videos (`true`) or non-screen-recorded videos (`false`).
    String filterTag = "abc,xyz"; // A comma-separated list of tags to filter on. All results must include at least one of these tags.
    String filterTagAllOf = "abc,xyz"; // A comma-separated list of tags to filter on. All results must include all of these tags.
    String filterTagExclude = "abc,xyz"; // A comma-separated list of tags to exclude. All results must exclude all of these tags.
    String includeTeamContent = "true"; // Whether to include content from the user's teams when searching. _This field is deprecated._
    Double page = 1D; // The page number of the results to show.
    Double perPage = 10D; // The number of items to show on each page of results, up to a maximum of 100.
    String query = "Stop motion"; // The search query to use to filter the results.
    List<String> queryFields = Arrays.asList(); // A comma-separated list of fields to query over. The default value is `title,description,chapters,tags`.  Option descriptions:  * `chapters` - Query by chapter titles that have been added to the video.  * `description` - Query by the description of the video.  * `tags` - Query by tag names that have been added to the video.  * `title` - Query by the title of the video. 
    String sort = "alphabetical"; // The way to sort the results.  Option descriptions:  * `alphabetical` - Sort the results alphabetically by title.  * `date` - Sort the results by date.  * `default` - Use the default sorting method.  * `duration` - Sort the results by duration.  * `last_user_action_event_date` - Sort the results by last user interaction. If a result hasn't had an interaction, the upload date is used instead.  * `likes` - Sort the results by number of likes. To use this option, **direction** must be `desc`.  * `modified_time` - Sort the results by last modification.  * `plays` - Sort the results by number of plays. To use this option, **direction** must be `desc`. 
    try {
      List<Video> result = client
              .videosEssentials
              .getAllUserVideos()
              .containingUri(containingUri)
              .direction(direction)
              .filter(filter)
              .filterEmbeddable(filterEmbeddable)
              .filterPlayable(filterPlayable)
              .filterScreenRecorded(filterScreenRecorded)
              .filterTag(filterTag)
              .filterTagAllOf(filterTagAllOf)
              .filterTagExclude(filterTagExclude)
              .includeTeamContent(includeTeamContent)
              .page(page)
              .perPage(perPage)
              .query(query)
              .queryFields(queryFields)
              .sort(sort)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosEssentialsApi#getAllUserVideos");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<Video>> response = client
              .videosEssentials
              .getAllUserVideos()
              .containingUri(containingUri)
              .direction(direction)
              .filter(filter)
              .filterEmbeddable(filterEmbeddable)
              .filterPlayable(filterPlayable)
              .filterScreenRecorded(filterScreenRecorded)
              .filterTag(filterTag)
              .filterTagAllOf(filterTagAllOf)
              .filterTagExclude(filterTagExclude)
              .includeTeamContent(includeTeamContent)
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
      System.err.println("Exception when calling VideosEssentialsApi#getAllUserVideos");
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
| **containingUri** | **String**| The page that contains the video URI. The field is available only when not paired with **query**. | [optional] |
| **direction** | **String**| The sort direction of the results.  Option descriptions:  * &#x60;asc&#x60; - Sort the results in ascending order.  * &#x60;desc&#x60; - Sort the results in descending order.  | [optional] [enum: asc, desc] |
| **filter** | **String**| The attribute by which to filter the results.  Option descriptions:  * &#x60;app_only&#x60; - Return app-only videos.  * &#x60;embeddable&#x60; - Return embeddable videos.  * &#x60;featured&#x60; - Return featured videos.  * &#x60;live&#x60; - Return only live videos.  * &#x60;no_placeholder&#x60; - Return no placeholder videos.  * &#x60;nolive&#x60; - Return no live videos.  * &#x60;playable&#x60; - Return playable videos.  * &#x60;screen_recorded&#x60; - Return screen-recorded videos.  | [optional] [enum: app_only, embeddable, featured, live, no_placeholder, nolive, playable, screen_recorded] |
| **filterEmbeddable** | **Boolean**| Whether to filter the results by embeddable videos (&#x60;true&#x60;) or non-embeddable videos (&#x60;false&#x60;). This parameter is required only when **filter** is &#x60;embeddable&#x60;. | [optional] |
| **filterPlayable** | **Boolean**| Whether to filter the results by playable videos (&#x60;true&#x60;) or non-playable videos (&#x60;false&#x60;). | [optional] |
| **filterScreenRecorded** | **Boolean**| Whether to filter the results by screen-recorded videos (&#x60;true&#x60;) or non-screen-recorded videos (&#x60;false&#x60;). | [optional] |
| **filterTag** | **String**| A comma-separated list of tags to filter on. All results must include at least one of these tags. | [optional] |
| **filterTagAllOf** | **String**| A comma-separated list of tags to filter on. All results must include all of these tags. | [optional] |
| **filterTagExclude** | **String**| A comma-separated list of tags to exclude. All results must exclude all of these tags. | [optional] |
| **includeTeamContent** | **String**| Whether to include content from the user&#39;s teams when searching. _This field is deprecated._ | [optional] |
| **page** | **Double**| The page number of the results to show. | [optional] |
| **perPage** | **Double**| The number of items to show on each page of results, up to a maximum of 100. | [optional] |
| **query** | **String**| The search query to use to filter the results. | [optional] |
| **queryFields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to query over. The default value is &#x60;title,description,chapters,tags&#x60;.  Option descriptions:  * &#x60;chapters&#x60; - Query by chapter titles that have been added to the video.  * &#x60;description&#x60; - Query by the description of the video.  * &#x60;tags&#x60; - Query by tag names that have been added to the video.  * &#x60;title&#x60; - Query by the title of the video.  | [optional] [enum: chapters, description, tags, title] |
| **sort** | **String**| The way to sort the results.  Option descriptions:  * &#x60;alphabetical&#x60; - Sort the results alphabetically by title.  * &#x60;date&#x60; - Sort the results by date.  * &#x60;default&#x60; - Use the default sorting method.  * &#x60;duration&#x60; - Sort the results by duration.  * &#x60;last_user_action_event_date&#x60; - Sort the results by last user interaction. If a result hasn&#39;t had an interaction, the upload date is used instead.  * &#x60;likes&#x60; - Sort the results by number of likes. To use this option, **direction** must be &#x60;desc&#x60;.  * &#x60;modified_time&#x60; - Sort the results by last modification.  * &#x60;plays&#x60; - Sort the results by number of plays. To use this option, **direction** must be &#x60;desc&#x60;.  | [optional] [enum: alphabetical, date, default, duration, last_user_action_event_date, likes, modified_time, plays] |

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
| **304** | The authenticated user hasn&#39;t uploaded any videos since the given **If-Modified-Since** header. |  -  |

<a name="getUserAppearances"></a>
# **getUserAppearances**
> List&lt;Video&gt; getUserAppearances().direction(direction).filter(filter).filterEmbeddable(filterEmbeddable).page(page).perPage(perPage).query(query).sort(sort).execute();

Get all the videos in which the user appears

This method returns all the videos in which the authenticated user has a credited appearance.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VideosEssentialsApi;
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
    String direction = "asc"; // The sort direction of the results.  Option descriptions:  * `asc` - Sort the results in ascending order.  * `desc` - Sort the results in descending order. 
    String filter = "embeddable"; // The attribute by which to filter the results.  Option descriptions:  * `embeddable` - Return embeddable videos. 
    Boolean filterEmbeddable = true; // Whether to filter the results by embeddable videos (`true`) or non-embeddable videos (`false`). This parameter is required only when **filter** is `embeddable`.
    Double page = 1D; // The page number of the results to show.
    Double perPage = 10D; // The number of items to show on each page of results, up to a maximum of 100.
    String query = "Stop motion"; // The search query to use to filter the results.
    String sort = "alphabetical"; // The way to sort the results.  Option descriptions:  * `alphabetical` - Sort the results alphabetically.  * `comments` - Sort the results by number of comments.  * `date` - Sort the results by date.  * `duration` - Sort the results by duration.  * `likes` - Sort the results by number of likes.  * `plays` - Sort the results by number of plays. 
    try {
      List<Video> result = client
              .videosEssentials
              .getUserAppearances()
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
      System.err.println("Exception when calling VideosEssentialsApi#getUserAppearances");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<Video>> response = client
              .videosEssentials
              .getUserAppearances()
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
      System.err.println("Exception when calling VideosEssentialsApi#getUserAppearances");
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
| **direction** | **String**| The sort direction of the results.  Option descriptions:  * &#x60;asc&#x60; - Sort the results in ascending order.  * &#x60;desc&#x60; - Sort the results in descending order.  | [optional] [enum: asc, desc] |
| **filter** | **String**| The attribute by which to filter the results.  Option descriptions:  * &#x60;embeddable&#x60; - Return embeddable videos.  | [optional] [enum: embeddable] |
| **filterEmbeddable** | **Boolean**| Whether to filter the results by embeddable videos (&#x60;true&#x60;) or non-embeddable videos (&#x60;false&#x60;). This parameter is required only when **filter** is &#x60;embeddable&#x60;. | [optional] |
| **page** | **Double**| The page number of the results to show. | [optional] |
| **perPage** | **Double**| The number of items to show on each page of results, up to a maximum of 100. | [optional] |
| **query** | **String**| The search query to use to filter the results. | [optional] |
| **sort** | **String**| The way to sort the results.  Option descriptions:  * &#x60;alphabetical&#x60; - Sort the results alphabetically.  * &#x60;comments&#x60; - Sort the results by number of comments.  * &#x60;date&#x60; - Sort the results by date.  * &#x60;duration&#x60; - Sort the results by duration.  * &#x60;likes&#x60; - Sort the results by number of likes.  * &#x60;plays&#x60; - Sort the results by number of plays.  | [optional] [enum: alphabetical, comments, date, duration, likes, plays] |

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

<a name="video"></a>
# **video**
> Video video(videoId).execute();

Get a specific video

This method returns a single video.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VideosEssentialsApi;
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
    try {
      Video result = client
              .videosEssentials
              .video(videoId)
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
      System.err.println("Exception when calling VideosEssentialsApi#video");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Video> response = client
              .videosEssentials
              .video(videoId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosEssentialsApi#video");
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

<a name="video_0"></a>
# **video_0**
> video_0(videoId).execute();

Delete a video

This method deletes the specified video. The authenticated user must be the owner of the video.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VideosEssentialsApi;
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
    try {
      client
              .videosEssentials
              .video_0(videoId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosEssentialsApi#video_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .videosEssentials
              .video_0(videoId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosEssentialsApi#video_0");
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
| **204** | The video was deleted. |  -  |

<a name="video_1"></a>
# **video_1**
> Video video_1(videoId, editVideoRequest).execute();

Edit a video

This method edits the specified video.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VideosEssentialsApi;
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
    String description = "description_example"; // The description of the video. This field can hold a maximum of 5000 characters.
    List<String> contentRating = Arrays.asList(); // A list of values describing the content in this video. For a full list of values, use the [`/contentratings`](https://developer.vimeo.com/api/reference/videos#get_content_ratings) endpoint.
    String customUrl = "customUrl_example"; // The custom link of the video. This link doesn't include the base URL and the username or user ID of the video's owner.
    EditVideoRequestEmbed embed = new EditVideoRequestEmbed();
    List<String> embedDomains = Arrays.asList(); // The complete list of domains the video can be embedded on. This field overwrites existing domains and requires that **privacy_embed** have the value `whitelist`.
    List<String> embedDomainsAdd = Arrays.asList(); // A list of domains intended to be added to an existing set of domains. This field requires that **privacy_embed** have the value `whitelist`.
    List<String> embedDomainsDelete = Arrays.asList(); // A list of domains intended to be removed from an existing set of domains. This field requires that **privacy_embed** have the value `whitelist`.
    Boolean hideFromVimeo = true; // Whether to hide the video from everyone except the video's owner. When the value is `true`, unlisted video links work only for the video's owner.
    String license = "by"; // The Creative Commons license under which the video is offered.  Option descriptions:  * `by` - The video is offered under CC BY, or the attibution-only license.  * `by-nc` - The video is offered under CC BY-NC, or the Attribution-NonCommercial license.  * `by-nc-nd` - The video is offered under CC BY-NC-ND, or the Attribution-NonCommercian-NoDerivs license.  * `by-nc-sa` - The video is offered under CC BY-NC-SA, or the Attribution-NonCommercial-ShareAlike licence.  * `by-nd` - The video is offered under CC BY-ND, or the Attribution-NoDerivs license.  * `by-sa` - The video is offered under CC BY-SA, or the Attribution-ShareAlike license.  * `cc0` - The video is offered under CC0, or public domain, videos. 
    String locale = "locale_example"; // The video's default language. For a full list of supported languages, use the [`/languages?filter=texttracks`](https://developer.vimeo.com/api/reference/videos#get_languages) endpoint.
    String name = "name_example"; // The title of the video. This field can hold a maximum of 128 characters.
    String password = "password_example"; // The password. When you set **privacy.view** to `password`, you must provide the password as an additional parameter. This field can hold a maximum of 32 characters.
    EditVideoRequestPrivacy privacy = new EditVideoRequestPrivacy();
    EditVideoRequestReviewPage reviewPage = new EditVideoRequestReviewPage();
    EditVideoRequestSpatial spatial = new EditVideoRequestSpatial();
    try {
      Video result = client
              .videosEssentials
              .video_1(videoId)
              .description(description)
              .contentRating(contentRating)
              .customUrl(customUrl)
              .embed(embed)
              .embedDomains(embedDomains)
              .embedDomainsAdd(embedDomainsAdd)
              .embedDomainsDelete(embedDomainsDelete)
              .hideFromVimeo(hideFromVimeo)
              .license(license)
              .locale(locale)
              .name(name)
              .password(password)
              .privacy(privacy)
              .reviewPage(reviewPage)
              .spatial(spatial)
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
      System.err.println("Exception when calling VideosEssentialsApi#video_1");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Video> response = client
              .videosEssentials
              .video_1(videoId)
              .description(description)
              .contentRating(contentRating)
              .customUrl(customUrl)
              .embed(embed)
              .embedDomains(embedDomains)
              .embedDomainsAdd(embedDomainsAdd)
              .embedDomainsDelete(embedDomainsDelete)
              .hideFromVimeo(hideFromVimeo)
              .license(license)
              .locale(locale)
              .name(name)
              .password(password)
              .privacy(privacy)
              .reviewPage(reviewPage)
              .spatial(spatial)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosEssentialsApi#video_1");
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
| **editVideoRequest** | [**EditVideoRequest**](EditVideoRequest.md)|  | |

### Return type

[**Video**](Video.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/vnd.vimeo.video+json
 - **Accept**: application/vnd.vimeo.video+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The video was edited. |  -  |

<a name="videos"></a>
# **videos**
> List&lt;Video&gt; videos(userId).containingUri(containingUri).direction(direction).filter(filter).filterEmbeddable(filterEmbeddable).filterPlayable(filterPlayable).filterScreenRecorded(filterScreenRecorded).filterTag(filterTag).filterTagAllOf(filterTagAllOf).filterTagExclude(filterTagExclude).includeTeamContent(includeTeamContent).page(page).perPage(perPage).query(query).queryFields(queryFields).sort(sort).execute();

Get all the videos that the user has uploaded

This method returns all the videos that the authenticated user has uploaded.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VideosEssentialsApi;
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
    Double userId = 152184D; // The ID of the user.
    String containingUri = "/videos/258684937"; // The page that contains the video URI. The field is available only when not paired with **query**.
    String direction = "asc"; // The sort direction of the results.  Option descriptions:  * `asc` - Sort the results in ascending order.  * `desc` - Sort the results in descending order. 
    String filter = "app_only"; // The attribute by which to filter the results.  Option descriptions:  * `app_only` - Return app-only videos.  * `embeddable` - Return embeddable videos.  * `featured` - Return featured videos.  * `live` - Return only live videos.  * `no_placeholder` - Return no placeholder videos.  * `nolive` - Return no live videos.  * `playable` - Return playable videos.  * `screen_recorded` - Return screen-recorded videos. 
    Boolean filterEmbeddable = true; // Whether to filter the results by embeddable videos (`true`) or non-embeddable videos (`false`). This parameter is required only when **filter** is `embeddable`.
    Boolean filterPlayable = true; // Whether to filter the results by playable videos (`true`) or non-playable videos (`false`).
    Boolean filterScreenRecorded = true; // Whether to filter the results by screen-recorded videos (`true`) or non-screen-recorded videos (`false`).
    String filterTag = "abc,xyz"; // A comma-separated list of tags to filter on. All results must include at least one of these tags.
    String filterTagAllOf = "abc,xyz"; // A comma-separated list of tags to filter on. All results must include all of these tags.
    String filterTagExclude = "abc,xyz"; // A comma-separated list of tags to exclude. All results must exclude all of these tags.
    String includeTeamContent = "true"; // Whether to include content from the user's teams when searching. _This field is deprecated._
    Double page = 1D; // The page number of the results to show.
    Double perPage = 10D; // The number of items to show on each page of results, up to a maximum of 100.
    String query = "Stop motion"; // The search query to use to filter the results.
    List<String> queryFields = Arrays.asList(); // A comma-separated list of fields to query over. The default value is `title,description,chapters,tags`.  Option descriptions:  * `chapters` - Query by chapter titles that have been added to the video.  * `description` - Query by the description of the video.  * `tags` - Query by tag names that have been added to the video.  * `title` - Query by the title of the video. 
    String sort = "alphabetical"; // The way to sort the results.  Option descriptions:  * `alphabetical` - Sort the results alphabetically by title.  * `date` - Sort the results by date.  * `default` - Use the default sorting method.  * `duration` - Sort the results by duration.  * `last_user_action_event_date` - Sort the results by last user interaction. If a result hasn't had an interaction, the upload date is used instead.  * `likes` - Sort the results by number of likes. To use this option, **direction** must be `desc`.  * `modified_time` - Sort the results by last modification.  * `plays` - Sort the results by number of plays. To use this option, **direction** must be `desc`. 
    try {
      List<Video> result = client
              .videosEssentials
              .videos(userId)
              .containingUri(containingUri)
              .direction(direction)
              .filter(filter)
              .filterEmbeddable(filterEmbeddable)
              .filterPlayable(filterPlayable)
              .filterScreenRecorded(filterScreenRecorded)
              .filterTag(filterTag)
              .filterTagAllOf(filterTagAllOf)
              .filterTagExclude(filterTagExclude)
              .includeTeamContent(includeTeamContent)
              .page(page)
              .perPage(perPage)
              .query(query)
              .queryFields(queryFields)
              .sort(sort)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosEssentialsApi#videos");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<Video>> response = client
              .videosEssentials
              .videos(userId)
              .containingUri(containingUri)
              .direction(direction)
              .filter(filter)
              .filterEmbeddable(filterEmbeddable)
              .filterPlayable(filterPlayable)
              .filterScreenRecorded(filterScreenRecorded)
              .filterTag(filterTag)
              .filterTagAllOf(filterTagAllOf)
              .filterTagExclude(filterTagExclude)
              .includeTeamContent(includeTeamContent)
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
      System.err.println("Exception when calling VideosEssentialsApi#videos");
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
| **userId** | **Double**| The ID of the user. | |
| **containingUri** | **String**| The page that contains the video URI. The field is available only when not paired with **query**. | [optional] |
| **direction** | **String**| The sort direction of the results.  Option descriptions:  * &#x60;asc&#x60; - Sort the results in ascending order.  * &#x60;desc&#x60; - Sort the results in descending order.  | [optional] [enum: asc, desc] |
| **filter** | **String**| The attribute by which to filter the results.  Option descriptions:  * &#x60;app_only&#x60; - Return app-only videos.  * &#x60;embeddable&#x60; - Return embeddable videos.  * &#x60;featured&#x60; - Return featured videos.  * &#x60;live&#x60; - Return only live videos.  * &#x60;no_placeholder&#x60; - Return no placeholder videos.  * &#x60;nolive&#x60; - Return no live videos.  * &#x60;playable&#x60; - Return playable videos.  * &#x60;screen_recorded&#x60; - Return screen-recorded videos.  | [optional] [enum: app_only, embeddable, featured, live, no_placeholder, nolive, playable, screen_recorded] |
| **filterEmbeddable** | **Boolean**| Whether to filter the results by embeddable videos (&#x60;true&#x60;) or non-embeddable videos (&#x60;false&#x60;). This parameter is required only when **filter** is &#x60;embeddable&#x60;. | [optional] |
| **filterPlayable** | **Boolean**| Whether to filter the results by playable videos (&#x60;true&#x60;) or non-playable videos (&#x60;false&#x60;). | [optional] |
| **filterScreenRecorded** | **Boolean**| Whether to filter the results by screen-recorded videos (&#x60;true&#x60;) or non-screen-recorded videos (&#x60;false&#x60;). | [optional] |
| **filterTag** | **String**| A comma-separated list of tags to filter on. All results must include at least one of these tags. | [optional] |
| **filterTagAllOf** | **String**| A comma-separated list of tags to filter on. All results must include all of these tags. | [optional] |
| **filterTagExclude** | **String**| A comma-separated list of tags to exclude. All results must exclude all of these tags. | [optional] |
| **includeTeamContent** | **String**| Whether to include content from the user&#39;s teams when searching. _This field is deprecated._ | [optional] |
| **page** | **Double**| The page number of the results to show. | [optional] |
| **perPage** | **Double**| The number of items to show on each page of results, up to a maximum of 100. | [optional] |
| **query** | **String**| The search query to use to filter the results. | [optional] |
| **queryFields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to query over. The default value is &#x60;title,description,chapters,tags&#x60;.  Option descriptions:  * &#x60;chapters&#x60; - Query by chapter titles that have been added to the video.  * &#x60;description&#x60; - Query by the description of the video.  * &#x60;tags&#x60; - Query by tag names that have been added to the video.  * &#x60;title&#x60; - Query by the title of the video.  | [optional] [enum: chapters, description, tags, title] |
| **sort** | **String**| The way to sort the results.  Option descriptions:  * &#x60;alphabetical&#x60; - Sort the results alphabetically by title.  * &#x60;date&#x60; - Sort the results by date.  * &#x60;default&#x60; - Use the default sorting method.  * &#x60;duration&#x60; - Sort the results by duration.  * &#x60;last_user_action_event_date&#x60; - Sort the results by last user interaction. If a result hasn&#39;t had an interaction, the upload date is used instead.  * &#x60;likes&#x60; - Sort the results by number of likes. To use this option, **direction** must be &#x60;desc&#x60;.  * &#x60;modified_time&#x60; - Sort the results by last modification.  * &#x60;plays&#x60; - Sort the results by number of plays. To use this option, **direction** must be &#x60;desc&#x60;.  | [optional] [enum: alphabetical, date, default, duration, last_user_action_event_date, likes, modified_time, plays] |

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
| **304** | The authenticated user hasn&#39;t uploaded any videos since the given **If-Modified-Since** header. |  -  |

<a name="videos_0"></a>
# **videos_0**
> videos_0(userId, uris).execute();

Delete a user&#39;s videos

This method deletes one or more videos belonging to the specified user. The authenticated user must have permission to delete the videos.  Specify the videos to delete in a comma-separated list by URI using the **uris** query parameter.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VideosEssentialsApi;
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
    Double userId = 152184D; // The ID of the user.
    String uris = "/videos/258684937,/videos/258684546"; // A comma-separated list of the video URIs to delete.
    try {
      client
              .videosEssentials
              .videos_0(userId, uris)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosEssentialsApi#videos_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .videosEssentials
              .videos_0(userId, uris)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosEssentialsApi#videos_0");
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
| **userId** | **Double**| The ID of the user. | |
| **uris** | **String**| A comma-separated list of the video URIs to delete. | |

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
| **204** | The videos were deleted. |  -  |

<a name="videos_1"></a>
# **videos_1**
> List&lt;Video&gt; videos_1(query).direction(direction).filter(filter).links(links).page(page).perPage(perPage).sort(sort).uris(uris).execute();

Search for videos

This method returns all the videos that match custom search criteria.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VideosEssentialsApi;
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
    String query = "staff picks"; // The search query.
    String direction = "asc"; // The sort direction of the results.  Option descriptions:  * `asc` - Sort the results in ascending order.  * `desc` - Sort the results in descending order. 
    String filter = "CC"; // The attribute by which to filter the results. `CC` and related filters target videos with the corresponding Creative Commons licenses. For more information, see our [Creative Commons](https://vimeo.com/creativecommons) page.  Option descriptions:  * `CC` - Return videos under any Creative Commons license.  * `CC-BY` - Return CC BY, or attribution-only, videos.  * `CC-BY-NC` - Return CC BY-NC, or Attribution-NonCommercial, videos.  * `CC-BY-NC-ND` - Return CC BY-NC-ND, or Attribution-NonCommercial-NoDerivs, videos.  * `CC-BY-NC-SA` - Return CC BY-NC-SA, or Attribution-NonCommercial-ShareAlike, videos.  * `CC-BY-ND` - Return CC BY-ND, or Attribution-NoDerivs, videos.  * `CC-BY-SA` - Return CC BY-SA, or Attribution-ShareAlike, videos.  * `CC0` - Return CC0, or public domain, videos.  * `categories` - Filter by categories.  * `duration` - Filter by duration.  * `in-progress` - Return in-progress videos.  * `minimum_likes` - Filter by minimum likes.  * `trending` - Return trending videos.  * `upload_date` - Filter by upload date. 
    String links = "https://vimeo.com/122375452,https://vimeo.com/273576296"; // A comma-separated list of video URLs to find. Querying, filtering, and sorting aren't supported when using this field.
    Double page = 1D; // The page number of the results to show.
    Double perPage = 10D; // The number of items to show on each page of results, up to a maximum of 100.
    String sort = "alphabetical"; // The way to sort the results.  Option descriptions:  * `alphabetical` - Sort the results alphabetically.  * `comments` - Sort the results by number of comments.  * `date` - Sort the results by date.  * `duration` - Sort the results by duration.  * `likes` - Sort the results by number of likes.  * `plays` - Sort the results by number of plays.  * `relevant` - Sort the results by relevance. 
    String uris = "/videos/122375452,/videos/273576296"; // A comma-separated list of video URIs to find. Querying, filtering, and sorting aren't supported when using this field.
    try {
      List<Video> result = client
              .videosEssentials
              .videos_1(query)
              .direction(direction)
              .filter(filter)
              .links(links)
              .page(page)
              .perPage(perPage)
              .sort(sort)
              .uris(uris)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosEssentialsApi#videos_1");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<Video>> response = client
              .videosEssentials
              .videos_1(query)
              .direction(direction)
              .filter(filter)
              .links(links)
              .page(page)
              .perPage(perPage)
              .sort(sort)
              .uris(uris)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosEssentialsApi#videos_1");
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
| **query** | **String**| The search query. | |
| **direction** | **String**| The sort direction of the results.  Option descriptions:  * &#x60;asc&#x60; - Sort the results in ascending order.  * &#x60;desc&#x60; - Sort the results in descending order.  | [optional] [enum: asc, desc] |
| **filter** | **String**| The attribute by which to filter the results. &#x60;CC&#x60; and related filters target videos with the corresponding Creative Commons licenses. For more information, see our [Creative Commons](https://vimeo.com/creativecommons) page.  Option descriptions:  * &#x60;CC&#x60; - Return videos under any Creative Commons license.  * &#x60;CC-BY&#x60; - Return CC BY, or attribution-only, videos.  * &#x60;CC-BY-NC&#x60; - Return CC BY-NC, or Attribution-NonCommercial, videos.  * &#x60;CC-BY-NC-ND&#x60; - Return CC BY-NC-ND, or Attribution-NonCommercial-NoDerivs, videos.  * &#x60;CC-BY-NC-SA&#x60; - Return CC BY-NC-SA, or Attribution-NonCommercial-ShareAlike, videos.  * &#x60;CC-BY-ND&#x60; - Return CC BY-ND, or Attribution-NoDerivs, videos.  * &#x60;CC-BY-SA&#x60; - Return CC BY-SA, or Attribution-ShareAlike, videos.  * &#x60;CC0&#x60; - Return CC0, or public domain, videos.  * &#x60;categories&#x60; - Filter by categories.  * &#x60;duration&#x60; - Filter by duration.  * &#x60;in-progress&#x60; - Return in-progress videos.  * &#x60;minimum_likes&#x60; - Filter by minimum likes.  * &#x60;trending&#x60; - Return trending videos.  * &#x60;upload_date&#x60; - Filter by upload date.  | [optional] [enum: CC, CC-BY, CC-BY-NC, CC-BY-NC-ND, CC-BY-NC-SA, CC-BY-ND, CC-BY-SA, CC0, categories, duration, in-progress, minimum_likes, trending, upload_date] |
| **links** | **String**| A comma-separated list of video URLs to find. Querying, filtering, and sorting aren&#39;t supported when using this field. | [optional] |
| **page** | **Double**| The page number of the results to show. | [optional] |
| **perPage** | **Double**| The number of items to show on each page of results, up to a maximum of 100. | [optional] |
| **sort** | **String**| The way to sort the results.  Option descriptions:  * &#x60;alphabetical&#x60; - Sort the results alphabetically.  * &#x60;comments&#x60; - Sort the results by number of comments.  * &#x60;date&#x60; - Sort the results by date.  * &#x60;duration&#x60; - Sort the results by duration.  * &#x60;likes&#x60; - Sort the results by number of likes.  * &#x60;plays&#x60; - Sort the results by number of plays.  * &#x60;relevant&#x60; - Sort the results by relevance.  | [optional] [enum: alphabetical, comments, date, duration, likes, plays, relevant] |
| **uris** | **String**| A comma-separated list of video URIs to find. Querying, filtering, and sorting aren&#39;t supported when using this field. | [optional] |

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
| **200** | The search results were returned. |  -  |

