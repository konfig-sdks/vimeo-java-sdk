# VideosShowcasesApi

All URIs are relative to *https://api.vimeo.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addToMultipleShowcases**](VideosShowcasesApi.md#addToMultipleShowcases) | **PATCH** /videos/{video_id}/albums | Add or remove a video from a list of showcases |
| [**getAllContShowcases**](VideosShowcasesApi.md#getAllContShowcases) | **GET** /videos/{video_id}/albums | Get all the showcases that contain a video |


<a name="addToMultipleShowcases"></a>
# **addToMultipleShowcases**
> List&lt;Album&gt; addToMultipleShowcases(videoId).videosShowcasesAddToMultipleShowcasesRequest(videosShowcasesAddToMultipleShowcasesRequest).execute();

Add or remove a video from a list of showcases

This method adds or removes the specified video to or from multiple showcases.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VideosShowcasesApi;
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
    List<VideosShowcasesAddToMultipleShowcasesRequestAddInner> add = Arrays.asList(); // The array of showcases to add the video to. Specify these with a batch request; see our [Using Common Formats and Parameters](https://developer.vimeo.com/api/common-formats#working-with-batch-requests) guide for more information.
    List<VideosShowcasesAddToMultipleShowcasesRequestRemoveInner> remove = Arrays.asList(); // The array of showcases to remove the video from. Specify these with a batch request; see our [Using Common Formats and Parameters](https://developer.vimeo.com/api/common-formats#working-with-batch-requests) guide for more information.
    try {
      List<Album> result = client
              .videosShowcases
              .addToMultipleShowcases(videoId)
              .add(add)
              .remove(remove)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosShowcasesApi#addToMultipleShowcases");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<Album>> response = client
              .videosShowcases
              .addToMultipleShowcases(videoId)
              .add(add)
              .remove(remove)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosShowcasesApi#addToMultipleShowcases");
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
| **videosShowcasesAddToMultipleShowcasesRequest** | [**VideosShowcasesAddToMultipleShowcasesRequest**](VideosShowcasesAddToMultipleShowcasesRequest.md)|  | [optional] |

### Return type

[**List&lt;Album&gt;**](Album.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/vnd.vimeo.album+json
 - **Accept**: application/vnd.vimeo.album+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The videos were added or removed. |  -  |

<a name="getAllContShowcases"></a>
# **getAllContShowcases**
> List&lt;Album&gt; getAllContShowcases(videoId).page(page).perPage(perPage).execute();

Get all the showcases that contain a video

This method returns all the showcases that contain the specified video.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VideosShowcasesApi;
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
              .videosShowcases
              .getAllContShowcases(videoId)
              .page(page)
              .perPage(perPage)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosShowcasesApi#getAllContShowcases");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<Album>> response = client
              .videosShowcases
              .getAllContShowcases(videoId)
              .page(page)
              .perPage(perPage)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosShowcasesApi#getAllContShowcases");
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

