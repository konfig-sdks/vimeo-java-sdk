# VideosVersionsApi

All URIs are relative to *https://api.vimeo.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addVideoVersion**](VideosVersionsApi.md#addVideoVersion) | **POST** /videos/{video_id}/versions | Add a version to a video |
| [**deleteVideoVersion**](VideosVersionsApi.md#deleteVideoVersion) | **DELETE** /videos/{video_id}/versions/{version_id} | Delete a video version |
| [**editVideoVersion**](VideosVersionsApi.md#editVideoVersion) | **PATCH** /videos/{video_id}/versions/{version_id} | Edit a video version |
| [**getAllVideoVersions**](VideosVersionsApi.md#getAllVideoVersions) | **GET** /channels/{channel_id}/videos/{video_id}/versions | Get all the versions of a video |
| [**getAllVideoVersions_0**](VideosVersionsApi.md#getAllVideoVersions_0) | **GET** /videos/{video_id}/versions | Get all the versions of a video |
| [**getSpecificVersion**](VideosVersionsApi.md#getSpecificVersion) | **GET** /videos/{video_id}/versions/{version_id} | Get a specific video version |


<a name="addVideoVersion"></a>
# **addVideoVersion**
> VideoVersion addVideoVersion(videoId, videosVersionsAddVideoVersionRequest).execute();

Add a version to a video

This method adds a version to the specified video. The authenticated user must be the owner of the video.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VideosVersionsApi;
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
    String fileName = "fileName_example"; // The name of the version.
    VideosVersionsAddVideoVersionRequestUpload upload = new VideosVersionsAddVideoVersionRequestUpload();
    Double videoId = 258684937D; // The ID of the video.
    try {
      VideoVersion result = client
              .videosVersions
              .addVideoVersion(fileName, upload, videoId)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getActive());
      System.out.println(result.getApp());
      System.out.println(result.getCanRestoreCreate());
      System.out.println(result.getCreateStoryboardId());
      System.out.println(result.getCreatedTime());
      System.out.println(result.getDownloadConfig());
      System.out.println(result.getDuration());
      System.out.println(result.getFilename());
      System.out.println(result.getFilesize());
      System.out.println(result.getHasInteractive());
      System.out.println(result.getMetadata());
      System.out.println(result.getModifiedTime());
      System.out.println(result.getOriginVariableFrameResolution());
      System.out.println(result.getPlay());
      System.out.println(result.getTranscode());
      System.out.println(result.getUpload());
      System.out.println(result.getUploadDate());
      System.out.println(result.getUri());
      System.out.println(result.getUser());
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosVersionsApi#addVideoVersion");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<VideoVersion> response = client
              .videosVersions
              .addVideoVersion(fileName, upload, videoId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosVersionsApi#addVideoVersion");
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
| **videosVersionsAddVideoVersionRequest** | [**VideosVersionsAddVideoVersionRequest**](VideosVersionsAddVideoVersionRequest.md)|  | |

### Return type

[**VideoVersion**](VideoVersion.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/vnd.vimeo.video.version+json
 - **Accept**: application/vnd.vimeo.video.version+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The version was added. |  -  |

<a name="deleteVideoVersion"></a>
# **deleteVideoVersion**
> deleteVideoVersion(versionId, videoId).execute();

Delete a video version

This method deletes the specified version from a video. The authenticated user must be the owner of the video.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VideosVersionsApi;
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
    Double versionId = 12345D; // The ID of the video version.
    Double videoId = 258684937D; // The ID of the video.
    try {
      client
              .videosVersions
              .deleteVideoVersion(versionId, videoId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosVersionsApi#deleteVideoVersion");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .videosVersions
              .deleteVideoVersion(versionId, videoId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosVersionsApi#deleteVideoVersion");
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
| **versionId** | **Double**| The ID of the video version. | |
| **videoId** | **Double**| The ID of the video. | |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.vimeo.video.version+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | The video version was deleted. |  -  |

<a name="editVideoVersion"></a>
# **editVideoVersion**
> VideoVersion editVideoVersion(versionId, videoId).videosVersionsEditVideoVersionRequest(videosVersionsEditVideoVersionRequest).execute();

Edit a video version

This method edits the specified version of a video. The authenticated user must be the owner of the video.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VideosVersionsApi;
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
    Double versionId = 12345D; // The ID of the video version.
    Double videoId = 258684937D; // The ID of the video.
    String description = "description_example"; // A description of the video version. This description can make use of the full unicode character set.
    Boolean isCurrent = true; // Whether the video version is active.
    try {
      VideoVersion result = client
              .videosVersions
              .editVideoVersion(versionId, videoId)
              .description(description)
              .isCurrent(isCurrent)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getActive());
      System.out.println(result.getApp());
      System.out.println(result.getCanRestoreCreate());
      System.out.println(result.getCreateStoryboardId());
      System.out.println(result.getCreatedTime());
      System.out.println(result.getDownloadConfig());
      System.out.println(result.getDuration());
      System.out.println(result.getFilename());
      System.out.println(result.getFilesize());
      System.out.println(result.getHasInteractive());
      System.out.println(result.getMetadata());
      System.out.println(result.getModifiedTime());
      System.out.println(result.getOriginVariableFrameResolution());
      System.out.println(result.getPlay());
      System.out.println(result.getTranscode());
      System.out.println(result.getUpload());
      System.out.println(result.getUploadDate());
      System.out.println(result.getUri());
      System.out.println(result.getUser());
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosVersionsApi#editVideoVersion");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<VideoVersion> response = client
              .videosVersions
              .editVideoVersion(versionId, videoId)
              .description(description)
              .isCurrent(isCurrent)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosVersionsApi#editVideoVersion");
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
| **versionId** | **Double**| The ID of the video version. | |
| **videoId** | **Double**| The ID of the video. | |
| **videosVersionsEditVideoVersionRequest** | [**VideosVersionsEditVideoVersionRequest**](VideosVersionsEditVideoVersionRequest.md)|  | [optional] |

### Return type

[**VideoVersion**](VideoVersion.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/vnd.vimeo.video.version+json
 - **Accept**: application/vnd.vimeo.video.version+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The version was edited. |  -  |

<a name="getAllVideoVersions"></a>
# **getAllVideoVersions**
> List&lt;VideoVersion&gt; getAllVideoVersions(channelId, videoId).page(page).perPage(perPage).execute();

Get all the versions of a video

This method returns every version of the specified video. The authenticated user must be the owner of the video.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VideosVersionsApi;
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
    Double channelId = 927D; // The ID of the channel.
    Double videoId = 258684937D; // The ID of the video.
    Double page = 1D; // The page number of the results to show.
    Double perPage = 10D; // The number of items to show on each page of results, up to a maximum of 100.
    try {
      List<VideoVersion> result = client
              .videosVersions
              .getAllVideoVersions(channelId, videoId)
              .page(page)
              .perPage(perPage)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosVersionsApi#getAllVideoVersions");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<VideoVersion>> response = client
              .videosVersions
              .getAllVideoVersions(channelId, videoId)
              .page(page)
              .perPage(perPage)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosVersionsApi#getAllVideoVersions");
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
| **channelId** | **Double**| The ID of the channel. | |
| **videoId** | **Double**| The ID of the video. | |
| **page** | **Double**| The page number of the results to show. | [optional] |
| **perPage** | **Double**| The number of items to show on each page of results, up to a maximum of 100. | [optional] |

### Return type

[**List&lt;VideoVersion&gt;**](VideoVersion.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.vimeo.video.version+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The versions were returned. |  -  |

<a name="getAllVideoVersions_0"></a>
# **getAllVideoVersions_0**
> List&lt;VideoVersion&gt; getAllVideoVersions_0(videoId).page(page).perPage(perPage).execute();

Get all the versions of a video

This method returns every version of the specified video. The authenticated user must be the owner of the video.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VideosVersionsApi;
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
      List<VideoVersion> result = client
              .videosVersions
              .getAllVideoVersions_0(videoId)
              .page(page)
              .perPage(perPage)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosVersionsApi#getAllVideoVersions_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<VideoVersion>> response = client
              .videosVersions
              .getAllVideoVersions_0(videoId)
              .page(page)
              .perPage(perPage)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosVersionsApi#getAllVideoVersions_0");
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

[**List&lt;VideoVersion&gt;**](VideoVersion.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.vimeo.video.version+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The versions were returned. |  -  |

<a name="getSpecificVersion"></a>
# **getSpecificVersion**
> VideoVersion getSpecificVersion(versionId, videoId).execute();

Get a specific video version

This method returns a single version of the specified video. The authenticated user must be the owner of the video.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VideosVersionsApi;
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
    Double versionId = 12345D; // The ID of the video version.
    Double videoId = 258684937D; // The ID of the video.
    try {
      VideoVersion result = client
              .videosVersions
              .getSpecificVersion(versionId, videoId)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getActive());
      System.out.println(result.getApp());
      System.out.println(result.getCanRestoreCreate());
      System.out.println(result.getCreateStoryboardId());
      System.out.println(result.getCreatedTime());
      System.out.println(result.getDownloadConfig());
      System.out.println(result.getDuration());
      System.out.println(result.getFilename());
      System.out.println(result.getFilesize());
      System.out.println(result.getHasInteractive());
      System.out.println(result.getMetadata());
      System.out.println(result.getModifiedTime());
      System.out.println(result.getOriginVariableFrameResolution());
      System.out.println(result.getPlay());
      System.out.println(result.getTranscode());
      System.out.println(result.getUpload());
      System.out.println(result.getUploadDate());
      System.out.println(result.getUri());
      System.out.println(result.getUser());
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosVersionsApi#getSpecificVersion");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<VideoVersion> response = client
              .videosVersions
              .getSpecificVersion(versionId, videoId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosVersionsApi#getSpecificVersion");
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
| **versionId** | **Double**| The ID of the video version. | |
| **videoId** | **Double**| The ID of the video. | |

### Return type

[**VideoVersion**](VideoVersion.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.vimeo.video.version+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The video version was returned. |  -  |

