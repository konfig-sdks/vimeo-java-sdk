# LiveEventM3U8PlaybackApi

All URIs are relative to *https://api.vimeo.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getUrl**](LiveEventM3U8PlaybackApi.md#getUrl) | **GET** /me/live_events/{live_event_id}/m3u8_playback | Get an M3U8 playback URL for a live event |
| [**getUrlForEventStream**](LiveEventM3U8PlaybackApi.md#getUrlForEventStream) | **GET** /users/{user_id}/live_events/{live_event_id}/m3u8_playback | Get an M3U8 playback URL for a live event |


<a name="getUrl"></a>
# **getUrl**
> getUrl(liveEventId).maxFpsFhd(maxFpsFhd).execute();

Get an M3U8 playback URL for a live event

This method returns an M3U8 playback URL for the specified event stream. You should use this endpoint only in conjunction with our recommended procedure for playing events via HLS. For more information, see our [HLS guide](https://developer.vimeo.com/api/live/playback).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LiveEventM3U8PlaybackApi;
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
    Double liveEventId = 12345D; // The ID of the event.
    Double maxFpsFhd = 30D; // The requested maximum frames per second.
    try {
      client
              .liveEventM3U8Playback
              .getUrl(liveEventId)
              .maxFpsFhd(maxFpsFhd)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveEventM3U8PlaybackApi#getUrl");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .liveEventM3U8Playback
              .getUrl(liveEventId)
              .maxFpsFhd(maxFpsFhd)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveEventM3U8PlaybackApi#getUrl");
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
| **liveEventId** | **Double**| The ID of the event. | |
| **maxFpsFhd** | **Double**| The requested maximum frames per second. | [optional] |

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
| **200** | The M3U8 playback URL was returned. |  -  |

<a name="getUrlForEventStream"></a>
# **getUrlForEventStream**
> getUrlForEventStream(liveEventId, userId).maxFpsFhd(maxFpsFhd).execute();

Get an M3U8 playback URL for a live event

This method returns an M3U8 playback URL for the specified event stream. You should use this endpoint only in conjunction with our recommended procedure for playing events via HLS. For more information, see our [HLS guide](https://developer.vimeo.com/api/live/playback).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LiveEventM3U8PlaybackApi;
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
    Double liveEventId = 12345D; // The ID of the event.
    Double userId = 152184D; // The ID of the user.
    Double maxFpsFhd = 30D; // The requested maximum frames per second.
    try {
      client
              .liveEventM3U8Playback
              .getUrlForEventStream(liveEventId, userId)
              .maxFpsFhd(maxFpsFhd)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveEventM3U8PlaybackApi#getUrlForEventStream");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .liveEventM3U8Playback
              .getUrlForEventStream(liveEventId, userId)
              .maxFpsFhd(maxFpsFhd)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveEventM3U8PlaybackApi#getUrlForEventStream");
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
| **liveEventId** | **Double**| The ID of the event. | |
| **userId** | **Double**| The ID of the user. | |
| **maxFpsFhd** | **Double**| The requested maximum frames per second. | [optional] |

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
| **200** | The M3U8 playback URL was returned. |  -  |

