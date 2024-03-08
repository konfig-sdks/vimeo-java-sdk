# OnDemandVideosApi

All URIs are relative to *https://api.vimeo.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addVideoToPage**](OnDemandVideosApi.md#addVideoToPage) | **PUT** /ondemand/pages/{ondemand_id}/videos/{video_id} | Add a video to an On Demand page |
| [**getAllVideos**](OnDemandVideosApi.md#getAllVideos) | **GET** /ondemand/pages/{ondemand_id}/videos | Get all the videos on an On Demand page |
| [**removeFromPage**](OnDemandVideosApi.md#removeFromPage) | **DELETE** /ondemand/pages/{ondemand_id}/videos/{video_id} | Remove a video from an On Demand page |
| [**specificVideoGet**](OnDemandVideosApi.md#specificVideoGet) | **GET** /ondemand/pages/{ondemand_id}/videos/{video_id} | Get a specific video on an On Demand page |


<a name="addVideoToPage"></a>
# **addVideoToPage**
> OnDemandVideo addVideoToPage(ondemandId, videoId, onDemandVideosAddVideoToPageRequest).execute();

Add a video to an On Demand page

This method adds a video to the specified On Demand page. The authenticated user must be the owner of the page.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OnDemandVideosApi;
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
    String type = "extra"; // The type of the video.  Option descriptions:  * `extra` - The video type is extra footage.  * `main` - The video type is the main video.  * `trailer` - The video type is a trailer. 
    Double ondemandId = 61326D; // The ID of the On Demand page.
    Double videoId = 12345D; // The ID of the video.
    OnDemandVideosAddVideoToPageRequestBuy buy = new OnDemandVideosAddVideoToPageRequestBuy();
    Double position = 3.4D; // The position of the video in the On Demand collection.
    Double releaseYear = 3.4D; // The release year of the video.
    OnDemandVideosAddVideoToPageRequestRent rent = new OnDemandVideosAddVideoToPageRequestRent();
    try {
      OnDemandVideo result = client
              .onDemandVideos
              .addVideoToPage(type, ondemandId, videoId)
              .buy(buy)
              .position(position)
              .releaseYear(releaseYear)
              .rent(rent)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getBuy());
      System.out.println(result.getDuration());
      System.out.println(result.getEpisode());
      System.out.println(result.getInteractions());
      System.out.println(result.getLink());
      System.out.println(result.getMetadata());
      System.out.println(result.getName());
      System.out.println(result.getOptions());
      System.out.println(result.getPictures());
      System.out.println(result.getPlayProgress());
      System.out.println(result.getPosition());
      System.out.println(result.getReleaseDate());
      System.out.println(result.getReleaseYear());
      System.out.println(result.getRent());
      System.out.println(result.getType());
      System.out.println(result.getUri());
      System.out.println(result.getUser());
    } catch (ApiException e) {
      System.err.println("Exception when calling OnDemandVideosApi#addVideoToPage");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<OnDemandVideo> response = client
              .onDemandVideos
              .addVideoToPage(type, ondemandId, videoId)
              .buy(buy)
              .position(position)
              .releaseYear(releaseYear)
              .rent(rent)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OnDemandVideosApi#addVideoToPage");
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
| **ondemandId** | **Double**| The ID of the On Demand page. | |
| **videoId** | **Double**| The ID of the video. | |
| **onDemandVideosAddVideoToPageRequest** | [**OnDemandVideosAddVideoToPageRequest**](OnDemandVideosAddVideoToPageRequest.md)|  | |

### Return type

[**OnDemandVideo**](OnDemandVideo.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/vnd.vimeo.ondemand.video+json
 - **Accept**: application/vnd.vimeo.ondemand.video+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The video was added. |  -  |

<a name="getAllVideos"></a>
# **getAllVideos**
> List&lt;OnDemandVideo&gt; getAllVideos(ondemandId).direction(direction).filter(filter).page(page).perPage(perPage).sort(sort).execute();

Get all the videos on an On Demand page

This method returns every video on the specified On Demand page.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OnDemandVideosApi;
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
    Double ondemandId = 61326D; // The ID of the On Demand page.
    String direction = "asc"; // The sort direction of the results.  Option descriptions:  * `asc` - Sort the results in ascending order.  * `desc` - Sort the results in descending order. 
    String filter = "all"; // The attribute by which to filter the results.  Option descriptions:  * `all` - Filter for all videos.  * `buy` - Filter for purchased videos.  * `expiring_soon` - Filter for videos that expire soon.  * `extra` - Filter for extra footage videos.  * `main` - Filter for main videos.  * `main.viewable` - Filter for videos that are both the main video and are viewable.  * `rent` - Filter for rented videos.  * `trailer` - Filter for trailer videos.  * `unwatched` - Filter for unwatched videos.  * `viewable` - Filter for videos that are viewable.  * `watched` - Filter for watched videos. 
    Double page = 1D; // The page number of the results to show.
    Double perPage = 10D; // The number of items to show on each page of results, up to a maximum of 100.
    String sort = "date"; // The way to sort the results.  Option descriptions:  * `date` - Sort the results by date.  * `default` - Use the default sorting method.  * `episode` - Sort the results by episode.  * `manual` - Sort the results manually.  * `name` - Sort the results by name.  * `purchase_time` - Sort the results by time of purchase.  * `release_date` - Sort the results by release date. 
    try {
      List<OnDemandVideo> result = client
              .onDemandVideos
              .getAllVideos(ondemandId)
              .direction(direction)
              .filter(filter)
              .page(page)
              .perPage(perPage)
              .sort(sort)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OnDemandVideosApi#getAllVideos");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<OnDemandVideo>> response = client
              .onDemandVideos
              .getAllVideos(ondemandId)
              .direction(direction)
              .filter(filter)
              .page(page)
              .perPage(perPage)
              .sort(sort)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OnDemandVideosApi#getAllVideos");
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
| **ondemandId** | **Double**| The ID of the On Demand page. | |
| **direction** | **String**| The sort direction of the results.  Option descriptions:  * &#x60;asc&#x60; - Sort the results in ascending order.  * &#x60;desc&#x60; - Sort the results in descending order.  | [optional] [enum: asc, desc] |
| **filter** | **String**| The attribute by which to filter the results.  Option descriptions:  * &#x60;all&#x60; - Filter for all videos.  * &#x60;buy&#x60; - Filter for purchased videos.  * &#x60;expiring_soon&#x60; - Filter for videos that expire soon.  * &#x60;extra&#x60; - Filter for extra footage videos.  * &#x60;main&#x60; - Filter for main videos.  * &#x60;main.viewable&#x60; - Filter for videos that are both the main video and are viewable.  * &#x60;rent&#x60; - Filter for rented videos.  * &#x60;trailer&#x60; - Filter for trailer videos.  * &#x60;unwatched&#x60; - Filter for unwatched videos.  * &#x60;viewable&#x60; - Filter for videos that are viewable.  * &#x60;watched&#x60; - Filter for watched videos.  | [optional] [enum: all, buy, expiring_soon, extra, main, main.viewable, rent, trailer, unwatched, viewable, watched] |
| **page** | **Double**| The page number of the results to show. | [optional] |
| **perPage** | **Double**| The number of items to show on each page of results, up to a maximum of 100. | [optional] |
| **sort** | **String**| The way to sort the results.  Option descriptions:  * &#x60;date&#x60; - Sort the results by date.  * &#x60;default&#x60; - Use the default sorting method.  * &#x60;episode&#x60; - Sort the results by episode.  * &#x60;manual&#x60; - Sort the results manually.  * &#x60;name&#x60; - Sort the results by name.  * &#x60;purchase_time&#x60; - Sort the results by time of purchase.  * &#x60;release_date&#x60; - Sort the results by release date.  | [optional] [enum: date, default, episode, manual, name, purchase_time, release_date] |

### Return type

[**List&lt;OnDemandVideo&gt;**](OnDemandVideo.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.vimeo.ondemand.video+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The videos were returned. |  -  |

<a name="removeFromPage"></a>
# **removeFromPage**
> removeFromPage(ondemandId, videoId).execute();

Remove a video from an On Demand page

This method removes a video from the specified On Demand page. The authenticated user must be the owner of the page.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OnDemandVideosApi;
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
    Double ondemandId = 61326D; // The ID of the On Demand page.
    Double videoId = 12345D; // The ID of the video.
    try {
      client
              .onDemandVideos
              .removeFromPage(ondemandId, videoId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling OnDemandVideosApi#removeFromPage");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .onDemandVideos
              .removeFromPage(ondemandId, videoId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling OnDemandVideosApi#removeFromPage");
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
| **ondemandId** | **Double**| The ID of the On Demand page. | |
| **videoId** | **Double**| The ID of the video. | |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.vimeo.ondemand.video+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | The video was removed. |  -  |

<a name="specificVideoGet"></a>
# **specificVideoGet**
> Video specificVideoGet(ondemandId, videoId).execute();

Get a specific video on an On Demand page

This method returns a single video on the specified On Demand page. Use this method to determine whether the video is on the page.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OnDemandVideosApi;
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
    Double ondemandId = 61326D; // The ID of the On Demand page.
    Double videoId = 12345D; // The ID of the video.
    try {
      Video result = client
              .onDemandVideos
              .specificVideoGet(ondemandId, videoId)
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
      System.err.println("Exception when calling OnDemandVideosApi#specificVideoGet");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Video> response = client
              .onDemandVideos
              .specificVideoGet(ondemandId, videoId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OnDemandVideosApi#specificVideoGet");
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
| **ondemandId** | **Double**| The ID of the On Demand page. | |
| **videoId** | **Double**| The ID of the video. | |

### Return type

[**Video**](Video.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.vimeo.ondemand.video+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The video was returned. |  -  |

