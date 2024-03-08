# ShowcasesShowcaseVideosApi

All URIs are relative to *https://api.vimeo.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addToShowcase**](ShowcasesShowcaseVideosApi.md#addToShowcase) | **PUT** /me/albums/{album_id}/videos/{video_id} | Add a specific video to a showcase |
| [**addToShowcase_0**](ShowcasesShowcaseVideosApi.md#addToShowcase_0) | **PUT** /users/{user_id}/albums/{album_id}/videos/{video_id} | Add a specific video to a showcase |
| [**createShowcaseThumbnail**](ShowcasesShowcaseVideosApi.md#createShowcaseThumbnail) | **POST** /me/albums/{album_id}/videos/{video_id}/set_album_thumbnail | Create a thumbnail for a showcase from a showcase video |
| [**createShowcaseThumbnail_0**](ShowcasesShowcaseVideosApi.md#createShowcaseThumbnail_0) | **POST** /users/{user_id}/albums/{album_id}/videos/{video_id}/set_album_thumbnail | Create a thumbnail for a showcase from a showcase video |
| [**getShowcaseVideos**](ShowcasesShowcaseVideosApi.md#getShowcaseVideos) | **GET** /users/{user_id}/albums/{album_id}/videos | Get all the videos in a showcase |
| [**getSpecificVideoInShowcase**](ShowcasesShowcaseVideosApi.md#getSpecificVideoInShowcase) | **GET** /me/albums/{album_id}/videos/{video_id} | Get a specific video in a showcase |
| [**getSpecificVideoInShowcase_0**](ShowcasesShowcaseVideosApi.md#getSpecificVideoInShowcase_0) | **GET** /users/{user_id}/albums/{album_id}/videos/{video_id} | Get a specific video in a showcase |
| [**listAvailableShowcases**](ShowcasesShowcaseVideosApi.md#listAvailableShowcases) | **GET** /videos/{video_id}/available_albums | Get all the showcases to which the user can add or remove a specific video |
| [**listInShowcase**](ShowcasesShowcaseVideosApi.md#listInShowcase) | **GET** /albums/{album_id}/available_videos | Get all the user&#39;s videos that can be added to or removed from a showcase |
| [**listInShowcase_0**](ShowcasesShowcaseVideosApi.md#listInShowcase_0) | **GET** /me/albums/{album_id}/videos | Get all the videos in a showcase |
| [**removeFromShowcase**](ShowcasesShowcaseVideosApi.md#removeFromShowcase) | **DELETE** /me/albums/{album_id}/videos/{video_id} | Remove a video from a showcase |
| [**removeVideoFromShowcase**](ShowcasesShowcaseVideosApi.md#removeVideoFromShowcase) | **DELETE** /users/{user_id}/albums/{album_id}/videos/{video_id} | Remove a video from a showcase |
| [**replaceShowcaseVideos**](ShowcasesShowcaseVideosApi.md#replaceShowcaseVideos) | **PUT** /users/{user_id}/albums/{album_id}/videos | Replace all the videos in a showcase |
| [**replaceVideos**](ShowcasesShowcaseVideosApi.md#replaceVideos) | **PUT** /me/albums/{album_id}/videos | Replace all the videos in a showcase |
| [**setFeaturedVideo**](ShowcasesShowcaseVideosApi.md#setFeaturedVideo) | **PATCH** /me/albums/{album_id}/videos/{video_id}/set_featured_video | Set the featured video of a showcase |
| [**setFeaturedVideo_0**](ShowcasesShowcaseVideosApi.md#setFeaturedVideo_0) | **PATCH** /users/{user_id}/albums/{album_id}/videos/{video_id}/set_featured_video | Set the featured video of a showcase |


<a name="addToShowcase"></a>
# **addToShowcase**
> addToShowcase(albumId, videoId).execute();

Add a specific video to a showcase

This method adds a single video to the specified showcase. The authenticated user must be the owner of the showcase.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ShowcasesShowcaseVideosApi;
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
    Double albumId = 12345D; // The ID of the showcase.
    Double videoId = 196367152D; // The ID of the video.
    try {
      client
              .showcasesShowcaseVideos
              .addToShowcase(albumId, videoId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ShowcasesShowcaseVideosApi#addToShowcase");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .showcasesShowcaseVideos
              .addToShowcase(albumId, videoId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ShowcasesShowcaseVideosApi#addToShowcase");
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
| **albumId** | **Double**| The ID of the showcase. | |
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

<a name="addToShowcase_0"></a>
# **addToShowcase_0**
> addToShowcase_0(albumId, userId, videoId).execute();

Add a specific video to a showcase

This method adds a single video to the specified showcase. The authenticated user must be the owner of the showcase.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ShowcasesShowcaseVideosApi;
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
    Double albumId = 12345D; // The ID of the showcase.
    Double userId = 152184D; // The ID of the user.
    Double videoId = 196367152D; // The ID of the video.
    try {
      client
              .showcasesShowcaseVideos
              .addToShowcase_0(albumId, userId, videoId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ShowcasesShowcaseVideosApi#addToShowcase_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .showcasesShowcaseVideos
              .addToShowcase_0(albumId, userId, videoId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ShowcasesShowcaseVideosApi#addToShowcase_0");
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
| **albumId** | **Double**| The ID of the showcase. | |
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

<a name="createShowcaseThumbnail"></a>
# **createShowcaseThumbnail**
> Album createShowcaseThumbnail(albumId, videoId).showcasesShowcaseVideosCreateShowcaseThumbnailRequest(showcasesShowcaseVideosCreateShowcaseThumbnailRequest).execute();

Create a thumbnail for a showcase from a showcase video

This method creates a thumbnail image for a showcase from the specified frame of a showcase video. The authenticated user must be the owner of the showcase.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ShowcasesShowcaseVideosApi;
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
    Double albumId = 12345D; // The ID of the showcase.
    Double videoId = 196367152D; // The ID of the video.
    Double timeCode = 3.4D; // The time in seconds of the video frame to use as the thumbnail image.
    try {
      Album result = client
              .showcasesShowcaseVideos
              .createShowcaseThumbnail(albumId, videoId)
              .timeCode(timeCode)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getAllowContinuousPlay());
      System.out.println(result.getAllowDownloads());
      System.out.println(result.getAllowShare());
      System.out.println(result.getAutoplay());
      System.out.println(result.getBrandColor());
      System.out.println(result.getCreatedTime());
      System.out.println(result.getCustomLogo());
      System.out.println(result.getDomain());
      System.out.println(result.getDomainCertificateState());
      System.out.println(result.getDuration());
      System.out.println(result.getEmbed());
      System.out.println(result.getEmbedBrandColor());
      System.out.println(result.getEmbedCustomLogo());
      System.out.println(result.getHasChosenThumbnail());
      System.out.println(result.getHideFromVimeo());
      System.out.println(result.getHideNav());
      System.out.println(result.getHideUpcoming());
      System.out.println(result.getHideVimeoLogo());
      System.out.println(result.getLayout());
      System.out.println(result.getLink());
      System.out.println(result.getLoop());
      System.out.println(result.getMetadata());
      System.out.println(result.getModifiedTime());
      System.out.println(result.getName());
      System.out.println(result.getPictures());
      System.out.println(result.getPrivacy());
      System.out.println(result.getResourceKey());
      System.out.println(result.getReviewMode());
      System.out.println(result.getSeoAllowIndexed());
      System.out.println(result.getSeoDescription());
      System.out.println(result.getSeoKeywords());
      System.out.println(result.getSeoTitle());
      System.out.println(result.getShareLink());
      System.out.println(result.getSort());
      System.out.println(result.getTheme());
      System.out.println(result.getUnlistedHash());
      System.out.println(result.getUri());
      System.out.println(result.getUrl());
      System.out.println(result.getUseCustomDomain());
      System.out.println(result.getUser());
      System.out.println(result.getWebBrandColor());
      System.out.println(result.getWebCustomLogo());
    } catch (ApiException e) {
      System.err.println("Exception when calling ShowcasesShowcaseVideosApi#createShowcaseThumbnail");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Album> response = client
              .showcasesShowcaseVideos
              .createShowcaseThumbnail(albumId, videoId)
              .timeCode(timeCode)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ShowcasesShowcaseVideosApi#createShowcaseThumbnail");
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
| **albumId** | **Double**| The ID of the showcase. | |
| **videoId** | **Double**| The ID of the video. | |
| **showcasesShowcaseVideosCreateShowcaseThumbnailRequest** | [**ShowcasesShowcaseVideosCreateShowcaseThumbnailRequest**](ShowcasesShowcaseVideosCreateShowcaseThumbnailRequest.md)|  | [optional] |

### Return type

[**Album**](Album.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The showcase thumbnail was created. |  -  |

<a name="createShowcaseThumbnail_0"></a>
# **createShowcaseThumbnail_0**
> Album createShowcaseThumbnail_0(albumId, userId, videoId).showcasesShowcaseVideosCreateShowcaseThumbnailRequest1(showcasesShowcaseVideosCreateShowcaseThumbnailRequest1).execute();

Create a thumbnail for a showcase from a showcase video

This method creates a thumbnail image for a showcase from the specified frame of a showcase video. The authenticated user must be the owner of the showcase.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ShowcasesShowcaseVideosApi;
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
    Double albumId = 12345D; // The ID of the showcase.
    Double userId = 152184D; // The ID of the user.
    Double videoId = 196367152D; // The ID of the video.
    Double timeCode = 3.4D; // The time in seconds of the video frame to use as the thumbnail image.
    try {
      Album result = client
              .showcasesShowcaseVideos
              .createShowcaseThumbnail_0(albumId, userId, videoId)
              .timeCode(timeCode)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getAllowContinuousPlay());
      System.out.println(result.getAllowDownloads());
      System.out.println(result.getAllowShare());
      System.out.println(result.getAutoplay());
      System.out.println(result.getBrandColor());
      System.out.println(result.getCreatedTime());
      System.out.println(result.getCustomLogo());
      System.out.println(result.getDomain());
      System.out.println(result.getDomainCertificateState());
      System.out.println(result.getDuration());
      System.out.println(result.getEmbed());
      System.out.println(result.getEmbedBrandColor());
      System.out.println(result.getEmbedCustomLogo());
      System.out.println(result.getHasChosenThumbnail());
      System.out.println(result.getHideFromVimeo());
      System.out.println(result.getHideNav());
      System.out.println(result.getHideUpcoming());
      System.out.println(result.getHideVimeoLogo());
      System.out.println(result.getLayout());
      System.out.println(result.getLink());
      System.out.println(result.getLoop());
      System.out.println(result.getMetadata());
      System.out.println(result.getModifiedTime());
      System.out.println(result.getName());
      System.out.println(result.getPictures());
      System.out.println(result.getPrivacy());
      System.out.println(result.getResourceKey());
      System.out.println(result.getReviewMode());
      System.out.println(result.getSeoAllowIndexed());
      System.out.println(result.getSeoDescription());
      System.out.println(result.getSeoKeywords());
      System.out.println(result.getSeoTitle());
      System.out.println(result.getShareLink());
      System.out.println(result.getSort());
      System.out.println(result.getTheme());
      System.out.println(result.getUnlistedHash());
      System.out.println(result.getUri());
      System.out.println(result.getUrl());
      System.out.println(result.getUseCustomDomain());
      System.out.println(result.getUser());
      System.out.println(result.getWebBrandColor());
      System.out.println(result.getWebCustomLogo());
    } catch (ApiException e) {
      System.err.println("Exception when calling ShowcasesShowcaseVideosApi#createShowcaseThumbnail_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Album> response = client
              .showcasesShowcaseVideos
              .createShowcaseThumbnail_0(albumId, userId, videoId)
              .timeCode(timeCode)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ShowcasesShowcaseVideosApi#createShowcaseThumbnail_0");
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
| **albumId** | **Double**| The ID of the showcase. | |
| **userId** | **Double**| The ID of the user. | |
| **videoId** | **Double**| The ID of the video. | |
| **showcasesShowcaseVideosCreateShowcaseThumbnailRequest1** | [**ShowcasesShowcaseVideosCreateShowcaseThumbnailRequest1**](ShowcasesShowcaseVideosCreateShowcaseThumbnailRequest1.md)|  | [optional] |

### Return type

[**Album**](Album.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The showcase thumbnail was created. |  -  |

<a name="getShowcaseVideos"></a>
# **getShowcaseVideos**
> List&lt;Video&gt; getShowcaseVideos(albumId, userId).containingUri(containingUri).direction(direction).filter(filter).filterEmbeddable(filterEmbeddable).page(page).password(password).perPage(perPage).query(query).sort(sort).weakSearch(weakSearch).execute();

Get all the videos in a showcase

This method returns every video in the specified showcase. The authenticated user must be the owner of the showcase.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ShowcasesShowcaseVideosApi;
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
    Double albumId = 3706071D; // The ID of the showcase.
    Double userId = 152184D; // The ID of the user.
    String containingUri = "/videos/258684937"; // The page containing the video URI.
    String direction = "asc"; // The sort direction of the results.  Option descriptions:  * `asc` - Sort the results in ascending order.  * `desc` - Sort the results in descending order. 
    String filter = "embeddable"; // The attribute by which to filter the results.  Option descriptions:  * `embeddable` - Filter the results by the **embeddable** attribute. 
    Boolean filterEmbeddable = true; // Whether to filter the results by embeddable videos (`true`) or non-embeddable videos (`false`). This parameter is required only when **filter** is `embeddable`.
    Double page = 1D; // The page number of the results to show.
    String password = "hunter1"; // The password of the showcase.
    Double perPage = 10D; // The number of items to show on each page of results, up to a maximum of 100.
    String query = "Stop motion"; // The search query to use to filter the results.
    String sort = "alphabetical"; // The way to sort the results.  Option descriptions:  * `alphabetical` - Sort the results alphabetically.  * `comments` - Sort the results by number of comments.  * `date` - Sort the results by date.  * `default` - Sort the results by the default method.  * `duration` - Sort the results by duration.  * `likes` - Sort the results by number of likes.  * `manual` - Sort the results by their manual order.  * `modified_time` - Sort the results by last modification.  * `plays` - Sort the results by number of plays. 
    Boolean weakSearch = false; // Whether to include private videos in the search. Please note that a separate search service provides this functionality. The service performs a partial text search on the video's name.
    try {
      List<Video> result = client
              .showcasesShowcaseVideos
              .getShowcaseVideos(albumId, userId)
              .containingUri(containingUri)
              .direction(direction)
              .filter(filter)
              .filterEmbeddable(filterEmbeddable)
              .page(page)
              .password(password)
              .perPage(perPage)
              .query(query)
              .sort(sort)
              .weakSearch(weakSearch)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShowcasesShowcaseVideosApi#getShowcaseVideos");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<Video>> response = client
              .showcasesShowcaseVideos
              .getShowcaseVideos(albumId, userId)
              .containingUri(containingUri)
              .direction(direction)
              .filter(filter)
              .filterEmbeddable(filterEmbeddable)
              .page(page)
              .password(password)
              .perPage(perPage)
              .query(query)
              .sort(sort)
              .weakSearch(weakSearch)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ShowcasesShowcaseVideosApi#getShowcaseVideos");
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
| **albumId** | **Double**| The ID of the showcase. | |
| **userId** | **Double**| The ID of the user. | |
| **containingUri** | **String**| The page containing the video URI. | [optional] |
| **direction** | **String**| The sort direction of the results.  Option descriptions:  * &#x60;asc&#x60; - Sort the results in ascending order.  * &#x60;desc&#x60; - Sort the results in descending order.  | [optional] [enum: asc, desc] |
| **filter** | **String**| The attribute by which to filter the results.  Option descriptions:  * &#x60;embeddable&#x60; - Filter the results by the **embeddable** attribute.  | [optional] [enum: embeddable] |
| **filterEmbeddable** | **Boolean**| Whether to filter the results by embeddable videos (&#x60;true&#x60;) or non-embeddable videos (&#x60;false&#x60;). This parameter is required only when **filter** is &#x60;embeddable&#x60;. | [optional] |
| **page** | **Double**| The page number of the results to show. | [optional] |
| **password** | **String**| The password of the showcase. | [optional] |
| **perPage** | **Double**| The number of items to show on each page of results, up to a maximum of 100. | [optional] |
| **query** | **String**| The search query to use to filter the results. | [optional] |
| **sort** | **String**| The way to sort the results.  Option descriptions:  * &#x60;alphabetical&#x60; - Sort the results alphabetically.  * &#x60;comments&#x60; - Sort the results by number of comments.  * &#x60;date&#x60; - Sort the results by date.  * &#x60;default&#x60; - Sort the results by the default method.  * &#x60;duration&#x60; - Sort the results by duration.  * &#x60;likes&#x60; - Sort the results by number of likes.  * &#x60;manual&#x60; - Sort the results by their manual order.  * &#x60;modified_time&#x60; - Sort the results by last modification.  * &#x60;plays&#x60; - Sort the results by number of plays.  | [optional] [enum: alphabetical, comments, date, default, duration, likes, manual, modified_time, plays] |
| **weakSearch** | **Boolean**| Whether to include private videos in the search. Please note that a separate search service provides this functionality. The service performs a partial text search on the video&#39;s name. | [optional] |

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

<a name="getSpecificVideoInShowcase"></a>
# **getSpecificVideoInShowcase**
> Video getSpecificVideoInShowcase(albumId, videoId).password(password).execute();

Get a specific video in a showcase

This method returns a single video belonging to the specified showcase. The authenticated user must be the owner of the showcase.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ShowcasesShowcaseVideosApi;
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
    Double albumId = 3706071D; // The ID of the showcase.
    Double videoId = 196367152D; // The ID of the video.
    String password = "hunter1"; // The password of the showcase.
    try {
      Video result = client
              .showcasesShowcaseVideos
              .getSpecificVideoInShowcase(albumId, videoId)
              .password(password)
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
      System.err.println("Exception when calling ShowcasesShowcaseVideosApi#getSpecificVideoInShowcase");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Video> response = client
              .showcasesShowcaseVideos
              .getSpecificVideoInShowcase(albumId, videoId)
              .password(password)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ShowcasesShowcaseVideosApi#getSpecificVideoInShowcase");
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
| **albumId** | **Double**| The ID of the showcase. | |
| **videoId** | **Double**| The ID of the video. | |
| **password** | **String**| The password of the showcase. | [optional] |

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

<a name="getSpecificVideoInShowcase_0"></a>
# **getSpecificVideoInShowcase_0**
> Video getSpecificVideoInShowcase_0(albumId, userId, videoId).password(password).execute();

Get a specific video in a showcase

This method returns a single video belonging to the specified showcase. The authenticated user must be the owner of the showcase.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ShowcasesShowcaseVideosApi;
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
    Double albumId = 3706071D; // The ID of the showcase.
    Double userId = 152184D; // The ID of the user.
    Double videoId = 196367152D; // The ID of the video.
    String password = "hunter1"; // The password of the showcase.
    try {
      Video result = client
              .showcasesShowcaseVideos
              .getSpecificVideoInShowcase_0(albumId, userId, videoId)
              .password(password)
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
      System.err.println("Exception when calling ShowcasesShowcaseVideosApi#getSpecificVideoInShowcase_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Video> response = client
              .showcasesShowcaseVideos
              .getSpecificVideoInShowcase_0(albumId, userId, videoId)
              .password(password)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ShowcasesShowcaseVideosApi#getSpecificVideoInShowcase_0");
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
| **albumId** | **Double**| The ID of the showcase. | |
| **userId** | **Double**| The ID of the user. | |
| **videoId** | **Double**| The ID of the video. | |
| **password** | **String**| The password of the showcase. | [optional] |

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

<a name="listAvailableShowcases"></a>
# **listAvailableShowcases**
> List&lt;Album&gt; listAvailableShowcases(videoId).page(page).perPage(perPage).execute();

Get all the showcases to which the user can add or remove a specific video

This endpoint returns every showcase to which the authenticated user can add or remove the specified video. The user must be the owner of the showcase.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ShowcasesShowcaseVideosApi;
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
      List<Album> result = client
              .showcasesShowcaseVideos
              .listAvailableShowcases(videoId)
              .page(page)
              .perPage(perPage)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShowcasesShowcaseVideosApi#listAvailableShowcases");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<Album>> response = client
              .showcasesShowcaseVideos
              .listAvailableShowcases(videoId)
              .page(page)
              .perPage(perPage)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ShowcasesShowcaseVideosApi#listAvailableShowcases");
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

[**List&lt;Album&gt;**](Album.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.vimeo.album+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The showcases were returned. |  -  |

<a name="listInShowcase"></a>
# **listInShowcase**
> List&lt;Video&gt; listInShowcase(albumId).direction(direction).page(page).perPage(perPage).sort(sort).execute();

Get all the user&#39;s videos that can be added to or removed from a showcase

This endpoint returns every video belonging to the authenticated user that can be added to or removed from the specified showcase. The user must be the owner of the showcase.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ShowcasesShowcaseVideosApi;
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
    Double albumId = 3706071D; // The ID of the showcase.
    String direction = "asc"; // The sort direction of the results.  Option descriptions:  * `asc` - Sort the results in ascending order.  * `desc` - Sort the results in descending order. 
    Double page = 1D; // The page number of the results to show.
    Double perPage = 10D; // The number of items to show on each page of results, up to a maximum of 100.
    String sort = "alphabetical"; // The way to sort the results.  Option descriptions:  * `alphabetical` - Sort the results alphabetically.  * `comments` - Sort the results by number of comments.  * `date` - Sort the results by date.  * `default` - Sort the results by the default method.  * `duration` - Sort the results by duration.  * `last_user_action_event_date` - Sort the results by most recent user interaction.  * `likes` - Sort the results by number of likes.  * `modified_time` - Sort the results by last modification.  * `plays` - Sort the results by number of plays. 
    try {
      List<Video> result = client
              .showcasesShowcaseVideos
              .listInShowcase(albumId)
              .direction(direction)
              .page(page)
              .perPage(perPage)
              .sort(sort)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShowcasesShowcaseVideosApi#listInShowcase");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<Video>> response = client
              .showcasesShowcaseVideos
              .listInShowcase(albumId)
              .direction(direction)
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
      System.err.println("Exception when calling ShowcasesShowcaseVideosApi#listInShowcase");
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
| **albumId** | **Double**| The ID of the showcase. | |
| **direction** | **String**| The sort direction of the results.  Option descriptions:  * &#x60;asc&#x60; - Sort the results in ascending order.  * &#x60;desc&#x60; - Sort the results in descending order.  | [optional] [enum: asc, desc] |
| **page** | **Double**| The page number of the results to show. | [optional] |
| **perPage** | **Double**| The number of items to show on each page of results, up to a maximum of 100. | [optional] |
| **sort** | **String**| The way to sort the results.  Option descriptions:  * &#x60;alphabetical&#x60; - Sort the results alphabetically.  * &#x60;comments&#x60; - Sort the results by number of comments.  * &#x60;date&#x60; - Sort the results by date.  * &#x60;default&#x60; - Sort the results by the default method.  * &#x60;duration&#x60; - Sort the results by duration.  * &#x60;last_user_action_event_date&#x60; - Sort the results by most recent user interaction.  * &#x60;likes&#x60; - Sort the results by number of likes.  * &#x60;modified_time&#x60; - Sort the results by last modification.  * &#x60;plays&#x60; - Sort the results by number of plays.  | [optional] [enum: alphabetical, comments, date, default, duration, last_user_action_event_date, likes, modified_time, plays] |

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

<a name="listInShowcase_0"></a>
# **listInShowcase_0**
> List&lt;Video&gt; listInShowcase_0(albumId).containingUri(containingUri).direction(direction).filter(filter).filterEmbeddable(filterEmbeddable).page(page).password(password).perPage(perPage).query(query).sort(sort).weakSearch(weakSearch).execute();

Get all the videos in a showcase

This method returns every video in the specified showcase. The authenticated user must be the owner of the showcase.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ShowcasesShowcaseVideosApi;
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
    Double albumId = 3706071D; // The ID of the showcase.
    String containingUri = "/videos/258684937"; // The page containing the video URI.
    String direction = "asc"; // The sort direction of the results.  Option descriptions:  * `asc` - Sort the results in ascending order.  * `desc` - Sort the results in descending order. 
    String filter = "embeddable"; // The attribute by which to filter the results.  Option descriptions:  * `embeddable` - Filter the results by the **embeddable** attribute. 
    Boolean filterEmbeddable = true; // Whether to filter the results by embeddable videos (`true`) or non-embeddable videos (`false`). This parameter is required only when **filter** is `embeddable`.
    Double page = 1D; // The page number of the results to show.
    String password = "hunter1"; // The password of the showcase.
    Double perPage = 10D; // The number of items to show on each page of results, up to a maximum of 100.
    String query = "Stop motion"; // The search query to use to filter the results.
    String sort = "alphabetical"; // The way to sort the results.  Option descriptions:  * `alphabetical` - Sort the results alphabetically.  * `comments` - Sort the results by number of comments.  * `date` - Sort the results by date.  * `default` - Sort the results by the default method.  * `duration` - Sort the results by duration.  * `likes` - Sort the results by number of likes.  * `manual` - Sort the results by their manual order.  * `modified_time` - Sort the results by last modification.  * `plays` - Sort the results by number of plays. 
    Boolean weakSearch = false; // Whether to include private videos in the search. Please note that a separate search service provides this functionality. The service performs a partial text search on the video's name.
    try {
      List<Video> result = client
              .showcasesShowcaseVideos
              .listInShowcase_0(albumId)
              .containingUri(containingUri)
              .direction(direction)
              .filter(filter)
              .filterEmbeddable(filterEmbeddable)
              .page(page)
              .password(password)
              .perPage(perPage)
              .query(query)
              .sort(sort)
              .weakSearch(weakSearch)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShowcasesShowcaseVideosApi#listInShowcase_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<Video>> response = client
              .showcasesShowcaseVideos
              .listInShowcase_0(albumId)
              .containingUri(containingUri)
              .direction(direction)
              .filter(filter)
              .filterEmbeddable(filterEmbeddable)
              .page(page)
              .password(password)
              .perPage(perPage)
              .query(query)
              .sort(sort)
              .weakSearch(weakSearch)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ShowcasesShowcaseVideosApi#listInShowcase_0");
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
| **albumId** | **Double**| The ID of the showcase. | |
| **containingUri** | **String**| The page containing the video URI. | [optional] |
| **direction** | **String**| The sort direction of the results.  Option descriptions:  * &#x60;asc&#x60; - Sort the results in ascending order.  * &#x60;desc&#x60; - Sort the results in descending order.  | [optional] [enum: asc, desc] |
| **filter** | **String**| The attribute by which to filter the results.  Option descriptions:  * &#x60;embeddable&#x60; - Filter the results by the **embeddable** attribute.  | [optional] [enum: embeddable] |
| **filterEmbeddable** | **Boolean**| Whether to filter the results by embeddable videos (&#x60;true&#x60;) or non-embeddable videos (&#x60;false&#x60;). This parameter is required only when **filter** is &#x60;embeddable&#x60;. | [optional] |
| **page** | **Double**| The page number of the results to show. | [optional] |
| **password** | **String**| The password of the showcase. | [optional] |
| **perPage** | **Double**| The number of items to show on each page of results, up to a maximum of 100. | [optional] |
| **query** | **String**| The search query to use to filter the results. | [optional] |
| **sort** | **String**| The way to sort the results.  Option descriptions:  * &#x60;alphabetical&#x60; - Sort the results alphabetically.  * &#x60;comments&#x60; - Sort the results by number of comments.  * &#x60;date&#x60; - Sort the results by date.  * &#x60;default&#x60; - Sort the results by the default method.  * &#x60;duration&#x60; - Sort the results by duration.  * &#x60;likes&#x60; - Sort the results by number of likes.  * &#x60;manual&#x60; - Sort the results by their manual order.  * &#x60;modified_time&#x60; - Sort the results by last modification.  * &#x60;plays&#x60; - Sort the results by number of plays.  | [optional] [enum: alphabetical, comments, date, default, duration, likes, manual, modified_time, plays] |
| **weakSearch** | **Boolean**| Whether to include private videos in the search. Please note that a separate search service provides this functionality. The service performs a partial text search on the video&#39;s name. | [optional] |

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

<a name="removeFromShowcase"></a>
# **removeFromShowcase**
> removeFromShowcase(albumId, videoId).execute();

Remove a video from a showcase

This method removes the specified video from its showcase. The authenticated user must be the owner of the showcase.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ShowcasesShowcaseVideosApi;
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
    Double albumId = 12345D; // The ID of the showcase.
    Double videoId = 196367152D; // The ID of the video.
    try {
      client
              .showcasesShowcaseVideos
              .removeFromShowcase(albumId, videoId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ShowcasesShowcaseVideosApi#removeFromShowcase");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .showcasesShowcaseVideos
              .removeFromShowcase(albumId, videoId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ShowcasesShowcaseVideosApi#removeFromShowcase");
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
| **albumId** | **Double**| The ID of the showcase. | |
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

<a name="removeVideoFromShowcase"></a>
# **removeVideoFromShowcase**
> removeVideoFromShowcase(albumId, userId, videoId).execute();

Remove a video from a showcase

This method removes the specified video from its showcase. The authenticated user must be the owner of the showcase.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ShowcasesShowcaseVideosApi;
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
    Double albumId = 12345D; // The ID of the showcase.
    Double userId = 152184D; // The ID of the user.
    Double videoId = 196367152D; // The ID of the video.
    try {
      client
              .showcasesShowcaseVideos
              .removeVideoFromShowcase(albumId, userId, videoId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ShowcasesShowcaseVideosApi#removeVideoFromShowcase");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .showcasesShowcaseVideos
              .removeVideoFromShowcase(albumId, userId, videoId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ShowcasesShowcaseVideosApi#removeVideoFromShowcase");
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
| **albumId** | **Double**| The ID of the showcase. | |
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

<a name="replaceShowcaseVideos"></a>
# **replaceShowcaseVideos**
> replaceShowcaseVideos(albumId, userId, showcasesShowcaseVideosReplaceShowcaseVideosRequest).execute();

Replace all the videos in a showcase

This method replaces all the videos in the specified showcase with a new set of one or more videos. The authenticated user must be the owner of the showcase.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ShowcasesShowcaseVideosApi;
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
    String videos = "videos_example"; // A comma-separated list of video URIs corresponding to the videos to add.
    Double albumId = 3706071D; // The ID of the showcase.
    Double userId = 152184D; // The ID of the user.
    try {
      client
              .showcasesShowcaseVideos
              .replaceShowcaseVideos(videos, albumId, userId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ShowcasesShowcaseVideosApi#replaceShowcaseVideos");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .showcasesShowcaseVideos
              .replaceShowcaseVideos(videos, albumId, userId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ShowcasesShowcaseVideosApi#replaceShowcaseVideos");
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
| **albumId** | **Double**| The ID of the showcase. | |
| **userId** | **Double**| The ID of the user. | |
| **showcasesShowcaseVideosReplaceShowcaseVideosRequest** | [**ShowcasesShowcaseVideosReplaceShowcaseVideosRequest**](ShowcasesShowcaseVideosReplaceShowcaseVideosRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The videos were added. |  -  |

<a name="replaceVideos"></a>
# **replaceVideos**
> replaceVideos(albumId, showcasesShowcaseVideosReplaceVideosRequest).execute();

Replace all the videos in a showcase

This method replaces all the videos in the specified showcase with a new set of one or more videos. The authenticated user must be the owner of the showcase.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ShowcasesShowcaseVideosApi;
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
    String videos = "videos_example"; // A comma-separated list of video URIs corresponding to the videos to add.
    Double albumId = 3706071D; // The ID of the showcase.
    try {
      client
              .showcasesShowcaseVideos
              .replaceVideos(videos, albumId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ShowcasesShowcaseVideosApi#replaceVideos");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .showcasesShowcaseVideos
              .replaceVideos(videos, albumId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ShowcasesShowcaseVideosApi#replaceVideos");
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
| **albumId** | **Double**| The ID of the showcase. | |
| **showcasesShowcaseVideosReplaceVideosRequest** | [**ShowcasesShowcaseVideosReplaceVideosRequest**](ShowcasesShowcaseVideosReplaceVideosRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The videos were added. |  -  |

<a name="setFeaturedVideo"></a>
# **setFeaturedVideo**
> Album setFeaturedVideo(albumId, videoId).execute();

Set the featured video of a showcase

This method sets the featured video of the specified showcase. The authenticated user must be the owner of the showcase, and the featured video must belong to it.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ShowcasesShowcaseVideosApi;
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
    Double albumId = 12345D; // The ID of the showcase.
    Double videoId = 196367152D; // The ID of the video.
    try {
      Album result = client
              .showcasesShowcaseVideos
              .setFeaturedVideo(albumId, videoId)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getAllowContinuousPlay());
      System.out.println(result.getAllowDownloads());
      System.out.println(result.getAllowShare());
      System.out.println(result.getAutoplay());
      System.out.println(result.getBrandColor());
      System.out.println(result.getCreatedTime());
      System.out.println(result.getCustomLogo());
      System.out.println(result.getDomain());
      System.out.println(result.getDomainCertificateState());
      System.out.println(result.getDuration());
      System.out.println(result.getEmbed());
      System.out.println(result.getEmbedBrandColor());
      System.out.println(result.getEmbedCustomLogo());
      System.out.println(result.getHasChosenThumbnail());
      System.out.println(result.getHideFromVimeo());
      System.out.println(result.getHideNav());
      System.out.println(result.getHideUpcoming());
      System.out.println(result.getHideVimeoLogo());
      System.out.println(result.getLayout());
      System.out.println(result.getLink());
      System.out.println(result.getLoop());
      System.out.println(result.getMetadata());
      System.out.println(result.getModifiedTime());
      System.out.println(result.getName());
      System.out.println(result.getPictures());
      System.out.println(result.getPrivacy());
      System.out.println(result.getResourceKey());
      System.out.println(result.getReviewMode());
      System.out.println(result.getSeoAllowIndexed());
      System.out.println(result.getSeoDescription());
      System.out.println(result.getSeoKeywords());
      System.out.println(result.getSeoTitle());
      System.out.println(result.getShareLink());
      System.out.println(result.getSort());
      System.out.println(result.getTheme());
      System.out.println(result.getUnlistedHash());
      System.out.println(result.getUri());
      System.out.println(result.getUrl());
      System.out.println(result.getUseCustomDomain());
      System.out.println(result.getUser());
      System.out.println(result.getWebBrandColor());
      System.out.println(result.getWebCustomLogo());
    } catch (ApiException e) {
      System.err.println("Exception when calling ShowcasesShowcaseVideosApi#setFeaturedVideo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Album> response = client
              .showcasesShowcaseVideos
              .setFeaturedVideo(albumId, videoId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ShowcasesShowcaseVideosApi#setFeaturedVideo");
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
| **albumId** | **Double**| The ID of the showcase. | |
| **videoId** | **Double**| The ID of the video. | |

### Return type

[**Album**](Album.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The video is now the featured video of the showcase. |  -  |

<a name="setFeaturedVideo_0"></a>
# **setFeaturedVideo_0**
> Album setFeaturedVideo_0(albumId, userId, videoId).execute();

Set the featured video of a showcase

This method sets the featured video of the specified showcase. The authenticated user must be the owner of the showcase, and the featured video must belong to it.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ShowcasesShowcaseVideosApi;
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
    Double albumId = 12345D; // The ID of the showcase.
    Double userId = 152184D; // The ID of the user.
    Double videoId = 196367152D; // The ID of the video.
    try {
      Album result = client
              .showcasesShowcaseVideos
              .setFeaturedVideo_0(albumId, userId, videoId)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getAllowContinuousPlay());
      System.out.println(result.getAllowDownloads());
      System.out.println(result.getAllowShare());
      System.out.println(result.getAutoplay());
      System.out.println(result.getBrandColor());
      System.out.println(result.getCreatedTime());
      System.out.println(result.getCustomLogo());
      System.out.println(result.getDomain());
      System.out.println(result.getDomainCertificateState());
      System.out.println(result.getDuration());
      System.out.println(result.getEmbed());
      System.out.println(result.getEmbedBrandColor());
      System.out.println(result.getEmbedCustomLogo());
      System.out.println(result.getHasChosenThumbnail());
      System.out.println(result.getHideFromVimeo());
      System.out.println(result.getHideNav());
      System.out.println(result.getHideUpcoming());
      System.out.println(result.getHideVimeoLogo());
      System.out.println(result.getLayout());
      System.out.println(result.getLink());
      System.out.println(result.getLoop());
      System.out.println(result.getMetadata());
      System.out.println(result.getModifiedTime());
      System.out.println(result.getName());
      System.out.println(result.getPictures());
      System.out.println(result.getPrivacy());
      System.out.println(result.getResourceKey());
      System.out.println(result.getReviewMode());
      System.out.println(result.getSeoAllowIndexed());
      System.out.println(result.getSeoDescription());
      System.out.println(result.getSeoKeywords());
      System.out.println(result.getSeoTitle());
      System.out.println(result.getShareLink());
      System.out.println(result.getSort());
      System.out.println(result.getTheme());
      System.out.println(result.getUnlistedHash());
      System.out.println(result.getUri());
      System.out.println(result.getUrl());
      System.out.println(result.getUseCustomDomain());
      System.out.println(result.getUser());
      System.out.println(result.getWebBrandColor());
      System.out.println(result.getWebCustomLogo());
    } catch (ApiException e) {
      System.err.println("Exception when calling ShowcasesShowcaseVideosApi#setFeaturedVideo_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Album> response = client
              .showcasesShowcaseVideos
              .setFeaturedVideo_0(albumId, userId, videoId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ShowcasesShowcaseVideosApi#setFeaturedVideo_0");
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
| **albumId** | **Double**| The ID of the showcase. | |
| **userId** | **Double**| The ID of the user. | |
| **videoId** | **Double**| The ID of the video. | |

### Return type

[**Album**](Album.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The video is now the featured video of the showcase. |  -  |

