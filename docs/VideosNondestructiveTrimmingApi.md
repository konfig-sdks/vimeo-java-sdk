# VideosNondestructiveTrimmingApi

All URIs are relative to *https://api.vimeo.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**trim**](VideosNondestructiveTrimmingApi.md#trim) | **GET** /videos/{video_id}/trim | Get the status of a video&#39;s trim operation |
| [**trim_0**](VideosNondestructiveTrimmingApi.md#trim_0) | **POST** /videos/{video_id}/trim | Start a trim operation for a video |


<a name="trim"></a>
# **trim**
> TrimmedVideo trim(videoId).execute();

Get the status of a video&#39;s trim operation

This method returns the status of the trim operation for the specified video.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VideosNondestructiveTrimmingApi;
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
      TrimmedVideo result = client
              .videosNondestructiveTrimming
              .trim(videoId)
              .execute();
      System.out.println(result);
      System.out.println(result.getClipId());
      System.out.println(result.getCreatedOn());
      System.out.println(result.getCreatedVersionId());
      System.out.println(result.getEnd());
      System.out.println(result.getIsClipFinishedTranscoding());
      System.out.println(result.getMetadata());
      System.out.println(result.getModifiedOn());
      System.out.println(result.getRootVersionId());
      System.out.println(result.getStart());
      System.out.println(result.getUri());
      System.out.println(result.getVersionQuality());
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosNondestructiveTrimmingApi#trim");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TrimmedVideo> response = client
              .videosNondestructiveTrimming
              .trim(videoId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosNondestructiveTrimmingApi#trim");
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

[**TrimmedVideo**](TrimmedVideo.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The status of the trim operation was returned or updated. |  -  |

<a name="trim_0"></a>
# **trim_0**
> TrimmedVideo trim_0(videoId).clipTrimRequest(clipTrimRequest).execute();

Start a trim operation for a video

This method starts a trim operation for the specified video.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VideosNondestructiveTrimmingApi;
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
    String trimEnd = "trimEnd_example"; // The end position in seconds of the trim in the video.
    String trimStart = "trimStart_example"; // The start position in seconds of the trim in the video.
    try {
      TrimmedVideo result = client
              .videosNondestructiveTrimming
              .trim_0(videoId)
              .trimEnd(trimEnd)
              .trimStart(trimStart)
              .execute();
      System.out.println(result);
      System.out.println(result.getClipId());
      System.out.println(result.getCreatedOn());
      System.out.println(result.getCreatedVersionId());
      System.out.println(result.getEnd());
      System.out.println(result.getIsClipFinishedTranscoding());
      System.out.println(result.getMetadata());
      System.out.println(result.getModifiedOn());
      System.out.println(result.getRootVersionId());
      System.out.println(result.getStart());
      System.out.println(result.getUri());
      System.out.println(result.getVersionQuality());
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosNondestructiveTrimmingApi#trim_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TrimmedVideo> response = client
              .videosNondestructiveTrimming
              .trim_0(videoId)
              .trimEnd(trimEnd)
              .trimStart(trimStart)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosNondestructiveTrimmingApi#trim_0");
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
| **clipTrimRequest** | [**ClipTrimRequest**](ClipTrimRequest.md)|  | [optional] |

### Return type

[**TrimmedVideo**](TrimmedVideo.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The status of the trim operation was returned or updated. |  -  |

