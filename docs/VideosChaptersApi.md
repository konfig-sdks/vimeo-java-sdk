# VideosChaptersApi

All URIs are relative to *https://api.vimeo.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**chapter**](VideosChaptersApi.md#chapter) | **POST** /videos/{video_id}/chapters | Add a chapter to a video |
| [**chapter_0**](VideosChaptersApi.md#chapter_0) | **GET** /videos/{video_id}/chapters/{chapter_id} | Get a specific chapter |
| [**chapter_1**](VideosChaptersApi.md#chapter_1) | **DELETE** /videos/{video_id}/chapters/{chapter_id} | Delete a chapter |
| [**chapter_2**](VideosChaptersApi.md#chapter_2) | **PATCH** /videos/{video_id}/chapters/{chapter_id} | Edit a chapter |
| [**chapters**](VideosChaptersApi.md#chapters) | **GET** /videos/{video_id}/chapters | Get all the chapters of a video |
| [**deleteChapterThumbnail**](VideosChaptersApi.md#deleteChapterThumbnail) | **DELETE** /videos/{video_id}/chapters/{chapter_id}/pictures/{uid} | Delete a chapter thumbnail |
| [**generateChapterThumbnail**](VideosChaptersApi.md#generateChapterThumbnail) | **POST** /videos/{video_id}/chapters/temporary/pictures | Generate an upload link or timecode-based thumbnail for an unsaved video chapter |
| [**generateChapterThumbnailOrUploadLink**](VideosChaptersApi.md#generateChapterThumbnailOrUploadLink) | **POST** /videos/{video_id}/chapters/{chapter_id}/pictures | Generate an upload link or timecode-based thumbnail for a saved video chapter |
| [**getChapterThumbnails**](VideosChaptersApi.md#getChapterThumbnails) | **GET** /videos/{video_id}/chapters/{chapter_id}/pictures | Get all the thumbnails associated with a saved video chapter |
| [**getSingleChapterThumbnail**](VideosChaptersApi.md#getSingleChapterThumbnail) | **GET** /videos/{video_id}/chapters/temporary/pictures/{uid} | Get a single chapter thumbnail associated with an unsaved video chapter |
| [**getSingleChapterThumbnail_0**](VideosChaptersApi.md#getSingleChapterThumbnail_0) | **GET** /videos/{video_id}/chapters/{chapter_id}/pictures/{uid} | Get a single chapter thumbnail associated with a saved video chapter |
| [**setChapterThumbnailActive**](VideosChaptersApi.md#setChapterThumbnailActive) | **PATCH** /videos/{video_id}/chapters/{chapter_id}/pictures/{uid} | Set a chapter thumbnail as active |


<a name="chapter"></a>
# **chapter**
> Chapter chapter(videoId).createChapterRequest(createChapterRequest).execute();

Add a chapter to a video

This method adds a chapter to the specified video.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VideosChaptersApi;
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
    String title = "title_example"; // The title of the chapter.
    String activeThumbnailUri = "activeThumbnailUri_example"; // The URI of the chapter's active thumbnail.
    List<String> thumbnailUris = Arrays.asList(); // An array of URIs of the thumbnails associated with the video chapter.
    Double timecode = 3.4D; // The timecode of the chapter in seconds from the start of the video.
    try {
      Chapter result = client
              .videosChapters
              .chapter(videoId)
              .title(title)
              .activeThumbnailUri(activeThumbnailUri)
              .thumbnailUris(thumbnailUris)
              .timecode(timecode)
              .execute();
      System.out.println(result);
      System.out.println(result.getTitle());
      System.out.println(result.getActiveThumbnailUri());
      System.out.println(result.getThumbnails());
      System.out.println(result.getTimecode());
      System.out.println(result.getUri());
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosChaptersApi#chapter");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Chapter> response = client
              .videosChapters
              .chapter(videoId)
              .title(title)
              .activeThumbnailUri(activeThumbnailUri)
              .thumbnailUris(thumbnailUris)
              .timecode(timecode)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosChaptersApi#chapter");
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
| **createChapterRequest** | [**CreateChapterRequest**](CreateChapterRequest.md)|  | [optional] |

### Return type

[**Chapter**](Chapter.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/vnd.vimeo.video.chapter+json
 - **Accept**: application/vnd.vimeo.video.chapter+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The chapter was added. |  -  |

<a name="chapter_0"></a>
# **chapter_0**
> Chapter chapter_0(chapterId, videoId).execute();

Get a specific chapter

This method returns a single chapter of the specified video.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VideosChaptersApi;
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
    Double chapterId = 12345D; // The ID of the chapter.
    Double videoId = 258684937D; // The ID of the video.
    try {
      Chapter result = client
              .videosChapters
              .chapter_0(chapterId, videoId)
              .execute();
      System.out.println(result);
      System.out.println(result.getTitle());
      System.out.println(result.getActiveThumbnailUri());
      System.out.println(result.getThumbnails());
      System.out.println(result.getTimecode());
      System.out.println(result.getUri());
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosChaptersApi#chapter_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Chapter> response = client
              .videosChapters
              .chapter_0(chapterId, videoId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosChaptersApi#chapter_0");
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
| **chapterId** | **Double**| The ID of the chapter. | |
| **videoId** | **Double**| The ID of the video. | |

### Return type

[**Chapter**](Chapter.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.vimeo.video.chapter+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The chapter was returned. |  -  |

<a name="chapter_1"></a>
# **chapter_1**
> chapter_1(chapterId, videoId).execute();

Delete a chapter

This method deletes the specified chapter from a video. The authenticated user must be the owner of the video.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VideosChaptersApi;
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
    Double chapterId = 12345D; // The ID of the chapter.
    Double videoId = 258684937D; // The ID of the video.
    try {
      client
              .videosChapters
              .chapter_1(chapterId, videoId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosChaptersApi#chapter_1");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .videosChapters
              .chapter_1(chapterId, videoId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosChaptersApi#chapter_1");
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
| **chapterId** | **Double**| The ID of the chapter. | |
| **videoId** | **Double**| The ID of the video. | |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.vimeo.video.chapter+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | The chapter was deleted. |  -  |

<a name="chapter_2"></a>
# **chapter_2**
> Chapter chapter_2(chapterId, videoId).editChapterRequest(editChapterRequest).execute();

Edit a chapter

This method edits the specified chapter of a video. The authenticated user must be the owner of the video.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VideosChaptersApi;
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
    Double chapterId = 12345D; // The ID of the chapter.
    Double videoId = 258684937D; // The ID of the video.
    String title = "title_example"; // The title of the chapter.
    String activeThumbnailUri = "activeThumbnailUri_example"; // The URI of the chapter's active thumbnail.
    Double timecode = 3.4D; // The timecode of the chapter in seconds from the start of the video.
    try {
      Chapter result = client
              .videosChapters
              .chapter_2(chapterId, videoId)
              .title(title)
              .activeThumbnailUri(activeThumbnailUri)
              .timecode(timecode)
              .execute();
      System.out.println(result);
      System.out.println(result.getTitle());
      System.out.println(result.getActiveThumbnailUri());
      System.out.println(result.getThumbnails());
      System.out.println(result.getTimecode());
      System.out.println(result.getUri());
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosChaptersApi#chapter_2");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Chapter> response = client
              .videosChapters
              .chapter_2(chapterId, videoId)
              .title(title)
              .activeThumbnailUri(activeThumbnailUri)
              .timecode(timecode)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosChaptersApi#chapter_2");
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
| **chapterId** | **Double**| The ID of the chapter. | |
| **videoId** | **Double**| The ID of the video. | |
| **editChapterRequest** | [**EditChapterRequest**](EditChapterRequest.md)|  | [optional] |

### Return type

[**Chapter**](Chapter.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/vnd.vimeo.video.chapter+json
 - **Accept**: application/vnd.vimeo.video.chapter+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The chapter was edited. |  -  |

<a name="chapters"></a>
# **chapters**
> List&lt;Chapter&gt; chapters(videoId).page(page).perPage(perPage).execute();

Get all the chapters of a video

This method returns every chapter of the specified video.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VideosChaptersApi;
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
      List<Chapter> result = client
              .videosChapters
              .chapters(videoId)
              .page(page)
              .perPage(perPage)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosChaptersApi#chapters");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<Chapter>> response = client
              .videosChapters
              .chapters(videoId)
              .page(page)
              .perPage(perPage)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosChaptersApi#chapters");
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

[**List&lt;Chapter&gt;**](Chapter.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.vimeo.video.chapter+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The chapters were returned. |  -  |

<a name="deleteChapterThumbnail"></a>
# **deleteChapterThumbnail**
> deleteChapterThumbnail(chapterId, uid, videoId).execute();

Delete a chapter thumbnail

This method deletes the specified chapter thumbnail from a video.  The authenticated user must be the owner of the video that the chapter belongs to. This method deletes both timecode-generated and custom-uploaded thumbnails.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VideosChaptersApi;
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
    Double chapterId = 12345D; // The ID of the chapter.
    String uid = "24kjh4h4g38175db9f59fae9f7g9ekhg"; // The unique ID of the thumbnail.
    Double videoId = 258684937D; // The ID of the video.
    try {
      client
              .videosChapters
              .deleteChapterThumbnail(chapterId, uid, videoId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosChaptersApi#deleteChapterThumbnail");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .videosChapters
              .deleteChapterThumbnail(chapterId, uid, videoId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosChaptersApi#deleteChapterThumbnail");
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
| **chapterId** | **Double**| The ID of the chapter. | |
| **uid** | **String**| The unique ID of the thumbnail. | |
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
| **204** | The chapter thumbnail was deleted. |  -  |

<a name="generateChapterThumbnail"></a>
# **generateChapterThumbnail**
> Picture generateChapterThumbnail(videoId).videosChaptersGenerateChapterThumbnailRequest(videosChaptersGenerateChapterThumbnailRequest).execute();

Generate an upload link or timecode-based thumbnail for an unsaved video chapter

This method generates either an upload link or a timecode-based thumbnail for an unsaved video chapter. To generate the upload link, which enables the authenticated user to upload a chapter thumbnail image manually, leave the body of the request empty. To generate an automatic timecode-based thumbnail, specify the **timecode** parameter in the body of the request.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VideosChaptersApi;
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
    Double timecode = 3.4D; // The timecode, given in seconds from the start of the video, indicating when the thumbnail should be generated from the video.
    try {
      Picture result = client
              .videosChapters
              .generateChapterThumbnail(videoId)
              .timecode(timecode)
              .execute();
      System.out.println(result);
      System.out.println(result.getActive());
      System.out.println(result.getBaseLink());
      System.out.println(result.getDefaultPicture());
      System.out.println(result.getLink());
      System.out.println(result.getResourceKey());
      System.out.println(result.getSizes());
      System.out.println(result.getType());
      System.out.println(result.getUri());
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosChaptersApi#generateChapterThumbnail");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Picture> response = client
              .videosChapters
              .generateChapterThumbnail(videoId)
              .timecode(timecode)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosChaptersApi#generateChapterThumbnail");
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
| **videosChaptersGenerateChapterThumbnailRequest** | [**VideosChaptersGenerateChapterThumbnailRequest**](VideosChaptersGenerateChapterThumbnailRequest.md)|  | [optional] |

### Return type

[**Picture**](Picture.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The upload link or chapter thumbnail was generated. |  -  |

<a name="generateChapterThumbnailOrUploadLink"></a>
# **generateChapterThumbnailOrUploadLink**
> Picture generateChapterThumbnailOrUploadLink(chapterId, videoId).videosChaptersGenerateChapterThumbnailOrUploadLinkRequest(videosChaptersGenerateChapterThumbnailOrUploadLinkRequest).execute();

Generate an upload link or timecode-based thumbnail for a saved video chapter

This method generates either an upload link or a timecode-based thumbnail for the specified saved video chapter. To generate the upload link, which enables the authenticated user to upload a chapter thumbnail image manually, leave the body of the request empty. To generate an automatic timecode-based thumbnail, include the **timecode** parameter in the body of the request.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VideosChaptersApi;
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
    Double chapterId = 12345D; // The ID of the chapter.
    Double videoId = 258684937D; // The ID of the video.
    Double timecode = 3.4D; // The timecode, given in seconds from the start of the video, indicating when the thumbnail should be generated from the video.
    try {
      Picture result = client
              .videosChapters
              .generateChapterThumbnailOrUploadLink(chapterId, videoId)
              .timecode(timecode)
              .execute();
      System.out.println(result);
      System.out.println(result.getActive());
      System.out.println(result.getBaseLink());
      System.out.println(result.getDefaultPicture());
      System.out.println(result.getLink());
      System.out.println(result.getResourceKey());
      System.out.println(result.getSizes());
      System.out.println(result.getType());
      System.out.println(result.getUri());
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosChaptersApi#generateChapterThumbnailOrUploadLink");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Picture> response = client
              .videosChapters
              .generateChapterThumbnailOrUploadLink(chapterId, videoId)
              .timecode(timecode)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosChaptersApi#generateChapterThumbnailOrUploadLink");
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
| **chapterId** | **Double**| The ID of the chapter. | |
| **videoId** | **Double**| The ID of the video. | |
| **videosChaptersGenerateChapterThumbnailOrUploadLinkRequest** | [**VideosChaptersGenerateChapterThumbnailOrUploadLinkRequest**](VideosChaptersGenerateChapterThumbnailOrUploadLinkRequest.md)|  | [optional] |

### Return type

[**Picture**](Picture.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The chapter thumbnail or upload link was generated. |  -  |

<a name="getChapterThumbnails"></a>
# **getChapterThumbnails**
> Picture getChapterThumbnails(chapterId, videoId).execute();

Get all the thumbnails associated with a saved video chapter

This method returns every thumbnail associated with the specified saved video chapter.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VideosChaptersApi;
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
    Double chapterId = 12345D; // The ID of the chapter.
    Double videoId = 258684937D; // The ID of the video.
    try {
      Picture result = client
              .videosChapters
              .getChapterThumbnails(chapterId, videoId)
              .execute();
      System.out.println(result);
      System.out.println(result.getActive());
      System.out.println(result.getBaseLink());
      System.out.println(result.getDefaultPicture());
      System.out.println(result.getLink());
      System.out.println(result.getResourceKey());
      System.out.println(result.getSizes());
      System.out.println(result.getType());
      System.out.println(result.getUri());
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosChaptersApi#getChapterThumbnails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Picture> response = client
              .videosChapters
              .getChapterThumbnails(chapterId, videoId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosChaptersApi#getChapterThumbnails");
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
| **chapterId** | **Double**| The ID of the chapter. | |
| **videoId** | **Double**| The ID of the video. | |

### Return type

[**Picture**](Picture.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The chapter thumbnails were returned. |  -  |

<a name="getSingleChapterThumbnail"></a>
# **getSingleChapterThumbnail**
> Picture getSingleChapterThumbnail(videoId).execute();

Get a single chapter thumbnail associated with an unsaved video chapter

This method returns the specified thumbnail associated with an unsaved video chapter.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VideosChaptersApi;
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
      Picture result = client
              .videosChapters
              .getSingleChapterThumbnail(videoId)
              .execute();
      System.out.println(result);
      System.out.println(result.getActive());
      System.out.println(result.getBaseLink());
      System.out.println(result.getDefaultPicture());
      System.out.println(result.getLink());
      System.out.println(result.getResourceKey());
      System.out.println(result.getSizes());
      System.out.println(result.getType());
      System.out.println(result.getUri());
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosChaptersApi#getSingleChapterThumbnail");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Picture> response = client
              .videosChapters
              .getSingleChapterThumbnail(videoId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosChaptersApi#getSingleChapterThumbnail");
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

[**Picture**](Picture.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The chapter thumbnail was returned. |  -  |

<a name="getSingleChapterThumbnail_0"></a>
# **getSingleChapterThumbnail_0**
> Picture getSingleChapterThumbnail_0(chapterId, videoId).execute();

Get a single chapter thumbnail associated with a saved video chapter

This method returns the specified thumbnail associated with a saved video chapter.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VideosChaptersApi;
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
    Double chapterId = 12345D; // The ID of the chapter.
    Double videoId = 258684937D; // The ID of the video.
    try {
      Picture result = client
              .videosChapters
              .getSingleChapterThumbnail_0(chapterId, videoId)
              .execute();
      System.out.println(result);
      System.out.println(result.getActive());
      System.out.println(result.getBaseLink());
      System.out.println(result.getDefaultPicture());
      System.out.println(result.getLink());
      System.out.println(result.getResourceKey());
      System.out.println(result.getSizes());
      System.out.println(result.getType());
      System.out.println(result.getUri());
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosChaptersApi#getSingleChapterThumbnail_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Picture> response = client
              .videosChapters
              .getSingleChapterThumbnail_0(chapterId, videoId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosChaptersApi#getSingleChapterThumbnail_0");
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
| **chapterId** | **Double**| The ID of the chapter. | |
| **videoId** | **Double**| The ID of the video. | |

### Return type

[**Picture**](Picture.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The chapter thumbnail was returned. |  -  |

<a name="setChapterThumbnailActive"></a>
# **setChapterThumbnailActive**
> Picture setChapterThumbnailActive(chapterId, videoId).videosChaptersSetChapterThumbnailActiveRequest(videosChaptersSetChapterThumbnailActiveRequest).execute();

Set a chapter thumbnail as active

This method sets the specified chapter thumbnail for a video as active.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VideosChaptersApi;
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
    Double chapterId = 12345D; // The ID of the chapter.
    Double videoId = 258684937D; // The ID of the video.
    Boolean active = true; // Whether to set the chapter thumbnail as active.
    try {
      Picture result = client
              .videosChapters
              .setChapterThumbnailActive(chapterId, videoId)
              .active(active)
              .execute();
      System.out.println(result);
      System.out.println(result.getActive());
      System.out.println(result.getBaseLink());
      System.out.println(result.getDefaultPicture());
      System.out.println(result.getLink());
      System.out.println(result.getResourceKey());
      System.out.println(result.getSizes());
      System.out.println(result.getType());
      System.out.println(result.getUri());
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosChaptersApi#setChapterThumbnailActive");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Picture> response = client
              .videosChapters
              .setChapterThumbnailActive(chapterId, videoId)
              .active(active)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosChaptersApi#setChapterThumbnailActive");
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
| **chapterId** | **Double**| The ID of the chapter. | |
| **videoId** | **Double**| The ID of the video. | |
| **videosChaptersSetChapterThumbnailActiveRequest** | [**VideosChaptersSetChapterThumbnailActiveRequest**](VideosChaptersSetChapterThumbnailActiveRequest.md)|  | [optional] |

### Return type

[**Picture**](Picture.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The chapter thumbnail was set as active. |  -  |

