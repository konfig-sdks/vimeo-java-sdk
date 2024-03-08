# LiveEventSessionsApi

All URIs are relative to *https://api.vimeo.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getIngestStatus**](LiveEventSessionsApi.md#getIngestStatus) | **GET** /videos/{video_id}/sessions/status | Get the ingest status of a one-time live event |


<a name="getIngestStatus"></a>
# **getIngestStatus**
> LiveEventSessionStatus getIngestStatus(videoId).execute();

Get the ingest status of a one-time live event

This method returns the ingest status of the specified event.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LiveEventSessionsApi;
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
    Double videoId = 258684937D; // The ID of the event.
    try {
      LiveEventSessionStatus result = client
              .liveEventSessions
              .getIngestStatus(videoId)
              .execute();
      System.out.println(result);
      System.out.println(result.getArchive());
      System.out.println(result.getCanManage());
      System.out.println(result.getId());
      System.out.println(result.getIngest());
      System.out.println(result.getMetering());
      System.out.println(result.getStatus());
      System.out.println(result.getStreamMode());
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveEventSessionsApi#getIngestStatus");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<LiveEventSessionStatus> response = client
              .liveEventSessions
              .getIngestStatus(videoId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveEventSessionsApi#getIngestStatus");
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
| **videoId** | **Double**| The ID of the event. | |

### Return type

[**LiveEventSessionStatus**](LiveEventSessionStatus.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The ingest status was returned. |  -  |

