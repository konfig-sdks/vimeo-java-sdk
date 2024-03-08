# VideosAnimatedThumbnailsApi

All URIs are relative to *https://api.vimeo.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createSet**](VideosAnimatedThumbnailsApi.md#createSet) | **POST** /videos/{video_id}/animated_thumbsets | Create a set of animated thumbnails for a video |
| [**deleteSet**](VideosAnimatedThumbnailsApi.md#deleteSet) | **DELETE** /videos/{video_id}/animated_thumbsets/{picture_id} | Delete a set of animated thumbnails for a video |
| [**getAllSets**](VideosAnimatedThumbnailsApi.md#getAllSets) | **GET** /videos/{video_id}/animated_thumbsets | Get all the animated thumbnails of a video |
| [**getStatusOfSet**](VideosAnimatedThumbnailsApi.md#getStatusOfSet) | **GET** /videos/{video_id}/animated_thumbsets/{picture_id}/status | Get the status of a set of animated thumbnails |
| [**specificSetGet**](VideosAnimatedThumbnailsApi.md#specificSetGet) | **GET** /videos/{video_id}/animated_thumbsets/{picture_id} | Get a specific set of animated thumbnails |


<a name="createSet"></a>
# **createSet**
> AnimatedThumbset createSet(videoId, videosAnimatedThumbnailsCreateSetRequest).execute();

Create a set of animated thumbnails for a video

This method creates a set of animated thumbnails for the specified video. Please note that you can&#39;t create more than four sets of animated thumbnails for the same video.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VideosAnimatedThumbnailsApi;
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
    Double duration = 3.4D; // The duration of the animation in seconds. The maximum value is 6.
    Double videoId = 258684937D; // The ID of the video.
    Double startTime = 3.4D; // The time in seconds corresponding to the start of the animation in the video. The default value is 0.
    try {
      AnimatedThumbset result = client
              .videosAnimatedThumbnails
              .createSet(duration, videoId)
              .startTime(startTime)
              .execute();
      System.out.println(result);
      System.out.println(result.getClipUri());
      System.out.println(result.getCreatedOn());
      System.out.println(result.getSizes());
      System.out.println(result.getStatus());
      System.out.println(result.getUri());
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosAnimatedThumbnailsApi#createSet");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AnimatedThumbset> response = client
              .videosAnimatedThumbnails
              .createSet(duration, videoId)
              .startTime(startTime)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosAnimatedThumbnailsApi#createSet");
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
| **videosAnimatedThumbnailsCreateSetRequest** | [**VideosAnimatedThumbnailsCreateSetRequest**](VideosAnimatedThumbnailsCreateSetRequest.md)|  | |

### Return type

[**AnimatedThumbset**](AnimatedThumbset.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/vnd.vimeo.animatedthumbnails+json
 - **Accept**: application/vnd.vimeo.animatedthumbnails+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The set of animated thumbnails was created. |  -  |

<a name="deleteSet"></a>
# **deleteSet**
> deleteSet(pictureId, videoId).execute();

Delete a set of animated thumbnails for a video

This method deletes a set of animated thumbnails for the specified video.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VideosAnimatedThumbnailsApi;
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
    String pictureId = "23f34-b34h4-34hb3"; // The UUID of the set of animated thumbnails.
    Double videoId = 258684937D; // The ID of the video.
    try {
      client
              .videosAnimatedThumbnails
              .deleteSet(pictureId, videoId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosAnimatedThumbnailsApi#deleteSet");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .videosAnimatedThumbnails
              .deleteSet(pictureId, videoId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosAnimatedThumbnailsApi#deleteSet");
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
| **pictureId** | **String**| The UUID of the set of animated thumbnails. | |
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
| **204** | The set of animated thumbnails was deleted. |  -  |

<a name="getAllSets"></a>
# **getAllSets**
> List&lt;AnimatedThumbset&gt; getAllSets(videoId).page(page).perPage(perPage).execute();

Get all the animated thumbnails of a video

This method returns all the sets of animated thumbnails associated with the specified video. The authenticated user must be the owner of the video.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VideosAnimatedThumbnailsApi;
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
      List<AnimatedThumbset> result = client
              .videosAnimatedThumbnails
              .getAllSets(videoId)
              .page(page)
              .perPage(perPage)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosAnimatedThumbnailsApi#getAllSets");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<AnimatedThumbset>> response = client
              .videosAnimatedThumbnails
              .getAllSets(videoId)
              .page(page)
              .perPage(perPage)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosAnimatedThumbnailsApi#getAllSets");
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

[**List&lt;AnimatedThumbset&gt;**](AnimatedThumbset.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.vimeo.animatedthumbnails+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The sets of animated thumbnails were returned. |  -  |

<a name="getStatusOfSet"></a>
# **getStatusOfSet**
> AnimatedThumbset getStatusOfSet(pictureId, videoId).execute();

Get the status of a set of animated thumbnails

This method returns the status of a particular set of animated thumbnails associated with the specified video. The status indicates whether the thumbnails are ready to use. The authenticated user must be the owner of the video.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VideosAnimatedThumbnailsApi;
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
    String pictureId = "23few-h4hw4t-45j5"; // The UUID of the set of animated thumbnails.
    Double videoId = 258684937D; // The ID of the video.
    try {
      AnimatedThumbset result = client
              .videosAnimatedThumbnails
              .getStatusOfSet(pictureId, videoId)
              .execute();
      System.out.println(result);
      System.out.println(result.getClipUri());
      System.out.println(result.getCreatedOn());
      System.out.println(result.getSizes());
      System.out.println(result.getStatus());
      System.out.println(result.getUri());
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosAnimatedThumbnailsApi#getStatusOfSet");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AnimatedThumbset> response = client
              .videosAnimatedThumbnails
              .getStatusOfSet(pictureId, videoId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosAnimatedThumbnailsApi#getStatusOfSet");
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
| **pictureId** | **String**| The UUID of the set of animated thumbnails. | |
| **videoId** | **Double**| The ID of the video. | |

### Return type

[**AnimatedThumbset**](AnimatedThumbset.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.vimeo.animatedthumbnails+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The status of the set of animated thumbnails was returned. |  -  |

<a name="specificSetGet"></a>
# **specificSetGet**
> AnimatedThumbset specificSetGet(pictureId, videoId).execute();

Get a specific set of animated thumbnails

This method returns a particular set of animated thumbnails associated with the specified video. The authenticated user must be the owner of the video.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VideosAnimatedThumbnailsApi;
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
    String pictureId = "23few-h4hw4t-45j5"; // The UUID of the set of animated thumbnails.
    Double videoId = 258684937D; // The ID of the video.
    try {
      AnimatedThumbset result = client
              .videosAnimatedThumbnails
              .specificSetGet(pictureId, videoId)
              .execute();
      System.out.println(result);
      System.out.println(result.getClipUri());
      System.out.println(result.getCreatedOn());
      System.out.println(result.getSizes());
      System.out.println(result.getStatus());
      System.out.println(result.getUri());
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosAnimatedThumbnailsApi#specificSetGet");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AnimatedThumbset> response = client
              .videosAnimatedThumbnails
              .specificSetGet(pictureId, videoId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosAnimatedThumbnailsApi#specificSetGet");
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
| **pictureId** | **String**| The UUID of the set of animated thumbnails. | |
| **videoId** | **Double**| The ID of the video. | |

### Return type

[**AnimatedThumbset**](AnimatedThumbset.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.vimeo.animatedthumbnails+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The set of animated thumbnails was returned. |  -  |

