# LiveEventDestinationsApi

All URIs are relative to *https://api.vimeo.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createDestination**](LiveEventDestinationsApi.md#createDestination) | **POST** /me/live_events/{live_event_id}/destinations | Create a live event destination |
| [**createEventDestination**](LiveEventDestinationsApi.md#createEventDestination) | **POST** /users/{user_id}/live_events/{live_event_id}/destinations | Create a live event destination |
| [**createOneTimeLiveEventDestination**](LiveEventDestinationsApi.md#createOneTimeLiveEventDestination) | **POST** /me/videos/{video_id}/destinations | Create a one-time live event destination |
| [**createOneTimeLiveEventDestination_0**](LiveEventDestinationsApi.md#createOneTimeLiveEventDestination_0) | **POST** /users/{user_id}/videos/{video_id}/destinations | Create a one-time live event destination |
| [**createOttDestination**](LiveEventDestinationsApi.md#createOttDestination) | **POST** /users/{user_id}/live_events/{live_event_id}/ott_destinations | Create a live event OTT destination |
| [**deleteDestination**](LiveEventDestinationsApi.md#deleteDestination) | **DELETE** /destination/{destination_id} | Delete a live event destination |
| [**deleteOttDestination**](LiveEventDestinationsApi.md#deleteOttDestination) | **DELETE** /users/{user_id}/live_events/{live_event_id}/ott_destination/{destination_id} | Delete a live event OTT destination |
| [**getAllAvailableDestinations**](LiveEventDestinationsApi.md#getAllAvailableDestinations) | **GET** /me/destinations | Get all available live event destinations for the user to stream to |
| [**getAllAvailableDestinations_0**](LiveEventDestinationsApi.md#getAllAvailableDestinations_0) | **GET** /users/{user_id}/live_events/{live_event_id}/destinations | Get all the destinations of a recurring live event |
| [**getAllAvailableDestinations_1**](LiveEventDestinationsApi.md#getAllAvailableDestinations_1) | **GET** /users/{user_id}/videos/{video_id}/destinations | Get all the destinations of a one-time live event |
| [**getAllDestinations**](LiveEventDestinationsApi.md#getAllDestinations) | **GET** /me/videos/{video_id}/destinations | Get all the destinations of a one-time live event |
| [**getAllOttDestinations**](LiveEventDestinationsApi.md#getAllOttDestinations) | **GET** /users/{user_id}/live_events/{live_event_id}/ott_destinations | Get all the OTT destinations of a recurring live event |
| [**getDestination**](LiveEventDestinationsApi.md#getDestination) | **GET** /destination/{destination_id} | Get a live event destination |
| [**listAllAvailableDestinations**](LiveEventDestinationsApi.md#listAllAvailableDestinations) | **GET** /me/live_events/{live_event_id}/destinations | Get all the destinations of a recurring live event |
| [**listAvailableDestinations**](LiveEventDestinationsApi.md#listAvailableDestinations) | **GET** /users/{user_id}/destinations | Get all available live event destinations for the user to stream to |
| [**updateDestination**](LiveEventDestinationsApi.md#updateDestination) | **PATCH** /destination/{destination_id} | Update a live event destination |


<a name="createDestination"></a>
# **createDestination**
> LiveEventDestination createDestination(liveEventId, liveEventDestinationsCreateDestinationRequest).execute();

Create a live event destination

This method creates a destination for the specified event. The authenticated user must be the owner of the event.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LiveEventDestinationsApi;
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
    String displayName = "displayName_example"; // The title to display for the simulcast.
    String serviceName = "custom_rtmp"; // The service to simulcast to.  Option descriptions:  * `custom_rtmp` - Simulcast to a custom service.  * `facebook` - Simulcast to Facebook Live.  * `linkedin` - Simulcast to LinkedIn Live.  * `youtube` - Simulcast to YouTube Live. 
    String type = "channel"; // The type of the simulcast destination.  Option descriptions:  * `channel` - The destination is a YouTube channel.  * `custom` - The destination is custom.  * `organization` - The destination is a LinkedIn organization.  * `page` - The destination is a Facebook page.  * `profile` - The destination is a Facebook or LinkedIn profile. 
    Double liveEventId = 12345D; // The ID of the event.
    Boolean isEnabled = true; // Whether the destination is enabled for simulcasting.
    String privacy = "CONNECTIONS"; // The privacy setting of the destination. Be sure to choose a value that corresponds to your service.  Option descriptions:  * `CONNECTIONS` - The privacy setting is `CONNECTIONS` for LinkedIn.  * `PUBLIC` - The privacy setting is `PUBLIC` for LinkedIn.  * `all_friends` - The privacy setting is `all_friends` for Facebook.  * `everyone` - The privacy setting is `everyone` for Facebook.  * `private` - The privacy setting is `private` for YouTube.  * `public` - The privacy setting is `public` for YouTube.  * `self` - The privacy setting is `self` for Facebook.  * `unlisted` - The privacy setting is `unlisted` for YouTube. 
    String providerDestinationId = "providerDestinationId_example"; // The ID of the destination on the specified service, such as the YouTube channel ID or the Facebook page ID.
    String providerVideoId = "providerVideoId_example"; // The ID of the scheduled video.
    Double scheduledAt = 3.4D; // The time in Unix timestamp format when live streaming is scheduled to start.
    String streamKey = "streamKey_example"; // The RTMP stream key.
    String streamUrl = "streamUrl_example"; // The RTMP URL for receiving the video stream.
    try {
      LiveEventDestination result = client
              .liveEventDestinations
              .createDestination(displayName, serviceName, type, liveEventId)
              .isEnabled(isEnabled)
              .privacy(privacy)
              .providerDestinationId(providerDestinationId)
              .providerVideoId(providerVideoId)
              .scheduledAt(scheduledAt)
              .streamKey(streamKey)
              .streamUrl(streamUrl)
              .execute();
      System.out.println(result);
      System.out.println(result.getDisplayName());
      System.out.println(result.getId());
      System.out.println(result.getIsEnabled());
      System.out.println(result.getLiveClipId());
      System.out.println(result.getPrivacy());
      System.out.println(result.getProviderBroadcastId());
      System.out.println(result.getProviderDestinationId());
      System.out.println(result.getProviderUserId());
      System.out.println(result.getProviderVideoId());
      System.out.println(result.getScheduledAt());
      System.out.println(result.getServiceName());
      System.out.println(result.getState());
      System.out.println(result.getStateMessage());
      System.out.println(result.getStreamKey());
      System.out.println(result.getStreamUrl());
      System.out.println(result.getType());
      System.out.println(result.getUserId());
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveEventDestinationsApi#createDestination");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<LiveEventDestination> response = client
              .liveEventDestinations
              .createDestination(displayName, serviceName, type, liveEventId)
              .isEnabled(isEnabled)
              .privacy(privacy)
              .providerDestinationId(providerDestinationId)
              .providerVideoId(providerVideoId)
              .scheduledAt(scheduledAt)
              .streamKey(streamKey)
              .streamUrl(streamUrl)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveEventDestinationsApi#createDestination");
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
| **liveEventDestinationsCreateDestinationRequest** | [**LiveEventDestinationsCreateDestinationRequest**](LiveEventDestinationsCreateDestinationRequest.md)|  | |

### Return type

[**LiveEventDestination**](LiveEventDestination.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/vnd.vimeo.live.simulcast.destination+json
 - **Accept**: application/vnd.vimeo.live.simulcast.destination+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The event destination was created. |  -  |

<a name="createEventDestination"></a>
# **createEventDestination**
> LiveEventDestination createEventDestination(liveEventId, userId, liveEventDestinationsCreateEventDestinationRequest).execute();

Create a live event destination

This method creates a destination for the specified event. The authenticated user must be the owner of the event.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LiveEventDestinationsApi;
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
    String displayName = "displayName_example"; // The title to display for the simulcast.
    String serviceName = "custom_rtmp"; // The service to simulcast to.  Option descriptions:  * `custom_rtmp` - Simulcast to a custom service.  * `facebook` - Simulcast to Facebook Live.  * `linkedin` - Simulcast to LinkedIn Live.  * `youtube` - Simulcast to YouTube Live. 
    String type = "channel"; // The type of the simulcast destination.  Option descriptions:  * `channel` - The destination is a YouTube channel.  * `custom` - The destination is custom.  * `organization` - The destination is a LinkedIn organization.  * `page` - The destination is a Facebook page.  * `profile` - The destination is a Facebook or LinkedIn profile. 
    Double liveEventId = 12345D; // The ID of the event.
    Double userId = 152184D; // The ID of the user.
    Boolean isEnabled = true; // Whether the destination is enabled for simulcasting.
    String privacy = "CONNECTIONS"; // The privacy setting of the destination. Be sure to choose a value that corresponds to your service.  Option descriptions:  * `CONNECTIONS` - The privacy setting is `CONNECTIONS` for LinkedIn.  * `PUBLIC` - The privacy setting is `PUBLIC` for LinkedIn.  * `all_friends` - The privacy setting is `all_friends` for Facebook.  * `everyone` - The privacy setting is `everyone` for Facebook.  * `private` - The privacy setting is `private` for YouTube.  * `public` - The privacy setting is `public` for YouTube.  * `self` - The privacy setting is `self` for Facebook.  * `unlisted` - The privacy setting is `unlisted` for YouTube. 
    String providerDestinationId = "providerDestinationId_example"; // The ID of the destination on the specified service, such as the YouTube channel ID or the Facebook page ID.
    String providerVideoId = "providerVideoId_example"; // The ID of the scheduled video.
    Double scheduledAt = 3.4D; // The time in Unix timestamp format when live streaming is scheduled to start.
    String streamKey = "streamKey_example"; // The RTMP stream key.
    String streamUrl = "streamUrl_example"; // The RTMP URL for receiving the video stream.
    try {
      LiveEventDestination result = client
              .liveEventDestinations
              .createEventDestination(displayName, serviceName, type, liveEventId, userId)
              .isEnabled(isEnabled)
              .privacy(privacy)
              .providerDestinationId(providerDestinationId)
              .providerVideoId(providerVideoId)
              .scheduledAt(scheduledAt)
              .streamKey(streamKey)
              .streamUrl(streamUrl)
              .execute();
      System.out.println(result);
      System.out.println(result.getDisplayName());
      System.out.println(result.getId());
      System.out.println(result.getIsEnabled());
      System.out.println(result.getLiveClipId());
      System.out.println(result.getPrivacy());
      System.out.println(result.getProviderBroadcastId());
      System.out.println(result.getProviderDestinationId());
      System.out.println(result.getProviderUserId());
      System.out.println(result.getProviderVideoId());
      System.out.println(result.getScheduledAt());
      System.out.println(result.getServiceName());
      System.out.println(result.getState());
      System.out.println(result.getStateMessage());
      System.out.println(result.getStreamKey());
      System.out.println(result.getStreamUrl());
      System.out.println(result.getType());
      System.out.println(result.getUserId());
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveEventDestinationsApi#createEventDestination");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<LiveEventDestination> response = client
              .liveEventDestinations
              .createEventDestination(displayName, serviceName, type, liveEventId, userId)
              .isEnabled(isEnabled)
              .privacy(privacy)
              .providerDestinationId(providerDestinationId)
              .providerVideoId(providerVideoId)
              .scheduledAt(scheduledAt)
              .streamKey(streamKey)
              .streamUrl(streamUrl)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveEventDestinationsApi#createEventDestination");
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
| **liveEventDestinationsCreateEventDestinationRequest** | [**LiveEventDestinationsCreateEventDestinationRequest**](LiveEventDestinationsCreateEventDestinationRequest.md)|  | |

### Return type

[**LiveEventDestination**](LiveEventDestination.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/vnd.vimeo.live.simulcast.destination+json
 - **Accept**: application/vnd.vimeo.live.simulcast.destination+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The event destination was created. |  -  |

<a name="createOneTimeLiveEventDestination"></a>
# **createOneTimeLiveEventDestination**
> createOneTimeLiveEventDestination(videoId, liveEventDestinationsCreateOneTimeLiveEventDestinationRequest).execute();

Create a one-time live event destination

This method creates a destination for the specified event. The authenticated user must be the owner of the event.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LiveEventDestinationsApi;
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
    String displayName = "displayName_example"; // The title to display for the simulcast.
    String serviceName = "custom_rtmp"; // The service to simulcast to.  Option descriptions:  * `custom_rtmp` - Simulcast to a custom service.  * `facebook` - Simulcast to Facebook Live.  * `linkedin` - Simulcast to LinkedIn Live.  * `youtube` - Simulcast to YouTube Live. 
    String type = "channel"; // The type of the simulcast destination.  Option descriptions:  * `channel` - The destination is a YouTube channel.  * `custom` - The destination is custom.  * `organization` - The destination is a LinkedIn organization.  * `page` - The destination is a Facebook page.  * `profile` - The destination is a Facebook or LinkedIn profile. 
    Double videoId = 12345D; // The ID of the video.
    Boolean isEnabled = true; // Whether the destination is enabled for simulcasting.
    String privacy = "CONNECTIONS"; // The privacy setting of the destination. Be sure to choose a value that corresponds to your service.  Option descriptions:  * `CONNECTIONS` - The privacy setting is `CONNECTIONS` for LinkedIn.  * `PUBLIC` - The privacy setting is `PUBLIC` for LinkedIn.  * `all_friends` - The privacy setting is `all_friends` for Facebook.  * `everyone` - The privacy setting is `everyone` for Facebook.  * `private` - The privacy setting is `private` for YouTube.  * `public` - The privacy setting is `public` for YouTube.  * `self` - The privacy setting is `self` for Facebook.  * `unlisted` - The privacy setting is `unlisted` for YouTube. 
    String providerDestinationId = "providerDestinationId_example"; // The ID of the destination on the specified service, such as the YouTube channel ID or the Facebook page ID.
    String providerVideoId = "providerVideoId_example"; // The ID of the scheduled video.
    Double scheduledAt = 3.4D; // The time in Unix timestamp format when live streaming is scheduled to start.
    String streamKey = "streamKey_example"; // The RTMP stream key.
    String streamUrl = "streamUrl_example"; // The RTMP URL for receiving the video stream.
    try {
      client
              .liveEventDestinations
              .createOneTimeLiveEventDestination(displayName, serviceName, type, videoId)
              .isEnabled(isEnabled)
              .privacy(privacy)
              .providerDestinationId(providerDestinationId)
              .providerVideoId(providerVideoId)
              .scheduledAt(scheduledAt)
              .streamKey(streamKey)
              .streamUrl(streamUrl)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveEventDestinationsApi#createOneTimeLiveEventDestination");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .liveEventDestinations
              .createOneTimeLiveEventDestination(displayName, serviceName, type, videoId)
              .isEnabled(isEnabled)
              .privacy(privacy)
              .providerDestinationId(providerDestinationId)
              .providerVideoId(providerVideoId)
              .scheduledAt(scheduledAt)
              .streamKey(streamKey)
              .streamUrl(streamUrl)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveEventDestinationsApi#createOneTimeLiveEventDestination");
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
| **liveEventDestinationsCreateOneTimeLiveEventDestinationRequest** | [**LiveEventDestinationsCreateOneTimeLiveEventDestinationRequest**](LiveEventDestinationsCreateOneTimeLiveEventDestinationRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/vnd.vimeo.live.simulcast.destination+json
 - **Accept**: application/vnd.vimeo.live.simulcast.destination+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="createOneTimeLiveEventDestination_0"></a>
# **createOneTimeLiveEventDestination_0**
> createOneTimeLiveEventDestination_0(userId, videoId, liveEventDestinationsCreateOneTimeLiveEventDestinationRequest1).execute();

Create a one-time live event destination

This method creates a destination for the specified event. The authenticated user must be the owner of the event.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LiveEventDestinationsApi;
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
    String displayName = "displayName_example"; // The title to display for the simulcast.
    String serviceName = "custom_rtmp"; // The service to simulcast to.  Option descriptions:  * `custom_rtmp` - Simulcast to a custom service.  * `facebook` - Simulcast to Facebook Live.  * `linkedin` - Simulcast to LinkedIn Live.  * `youtube` - Simulcast to YouTube Live. 
    String type = "channel"; // The type of the simulcast destination.  Option descriptions:  * `channel` - The destination is a YouTube channel.  * `custom` - The destination is custom.  * `organization` - The destination is a LinkedIn organization.  * `page` - The destination is a Facebook page.  * `profile` - The destination is a Facebook or LinkedIn profile. 
    Double userId = 152184D; // The ID of the user.
    Double videoId = 12345D; // The ID of the video.
    Boolean isEnabled = true; // Whether the destination is enabled for simulcasting.
    String privacy = "CONNECTIONS"; // The privacy setting of the destination. Be sure to choose a value that corresponds to your service.  Option descriptions:  * `CONNECTIONS` - The privacy setting is `CONNECTIONS` for LinkedIn.  * `PUBLIC` - The privacy setting is `PUBLIC` for LinkedIn.  * `all_friends` - The privacy setting is `all_friends` for Facebook.  * `everyone` - The privacy setting is `everyone` for Facebook.  * `private` - The privacy setting is `private` for YouTube.  * `public` - The privacy setting is `public` for YouTube.  * `self` - The privacy setting is `self` for Facebook.  * `unlisted` - The privacy setting is `unlisted` for YouTube. 
    String providerDestinationId = "providerDestinationId_example"; // The ID of the destination on the specified service, such as the YouTube channel ID or the Facebook page ID.
    String providerVideoId = "providerVideoId_example"; // The ID of the scheduled video.
    Double scheduledAt = 3.4D; // The time in Unix timestamp format when live streaming is scheduled to start.
    String streamKey = "streamKey_example"; // The RTMP stream key.
    String streamUrl = "streamUrl_example"; // The RTMP URL for receiving the video stream.
    try {
      client
              .liveEventDestinations
              .createOneTimeLiveEventDestination_0(displayName, serviceName, type, userId, videoId)
              .isEnabled(isEnabled)
              .privacy(privacy)
              .providerDestinationId(providerDestinationId)
              .providerVideoId(providerVideoId)
              .scheduledAt(scheduledAt)
              .streamKey(streamKey)
              .streamUrl(streamUrl)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveEventDestinationsApi#createOneTimeLiveEventDestination_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .liveEventDestinations
              .createOneTimeLiveEventDestination_0(displayName, serviceName, type, userId, videoId)
              .isEnabled(isEnabled)
              .privacy(privacy)
              .providerDestinationId(providerDestinationId)
              .providerVideoId(providerVideoId)
              .scheduledAt(scheduledAt)
              .streamKey(streamKey)
              .streamUrl(streamUrl)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveEventDestinationsApi#createOneTimeLiveEventDestination_0");
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
| **liveEventDestinationsCreateOneTimeLiveEventDestinationRequest1** | [**LiveEventDestinationsCreateOneTimeLiveEventDestinationRequest1**](LiveEventDestinationsCreateOneTimeLiveEventDestinationRequest1.md)|  | |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/vnd.vimeo.live.simulcast.destination+json
 - **Accept**: application/vnd.vimeo.live.simulcast.destination+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="createOttDestination"></a>
# **createOttDestination**
> OttDestination createOttDestination(liveEventId, userId).execute();

Create a live event OTT destination

This method creates an OTT channel as the destination of the specified event. The authenticated user must be the owner of the event.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LiveEventDestinationsApi;
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
    try {
      OttDestination result = client
              .liveEventDestinations
              .createOttDestination(liveEventId, userId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getOttChannelId());
      System.out.println(result.getOttChannelName());
      System.out.println(result.getOttChannelSubdomain());
      System.out.println(result.getOttEventId());
      System.out.println(result.getRecurringLiveEventId());
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveEventDestinationsApi#createOttDestination");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<OttDestination> response = client
              .liveEventDestinations
              .createOttDestination(liveEventId, userId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveEventDestinationsApi#createOttDestination");
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

### Return type

[**OttDestination**](OttDestination.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.vimeo.live.ott.destination+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The new OTT destination was created. |  -  |

<a name="deleteDestination"></a>
# **deleteDestination**
> deleteDestination(destinationId).execute();

Delete a live event destination

This method deletes the specified event destination belonging to the authenticated user.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LiveEventDestinationsApi;
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
    Double destinationId = 152184D; // The ID of the event destination.
    try {
      client
              .liveEventDestinations
              .deleteDestination(destinationId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveEventDestinationsApi#deleteDestination");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .liveEventDestinations
              .deleteDestination(destinationId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveEventDestinationsApi#deleteDestination");
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
| **destinationId** | **Double**| The ID of the event destination. | |

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
| **204** | The event destination was deleted. |  -  |

<a name="deleteOttDestination"></a>
# **deleteOttDestination**
> deleteOttDestination(liveEventId, userId).execute();

Delete a live event OTT destination

This method deletes an OTT channel as the destination of the specified event. The authenticated user must be the owner of the event.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LiveEventDestinationsApi;
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
    try {
      client
              .liveEventDestinations
              .deleteOttDestination(liveEventId, userId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveEventDestinationsApi#deleteOttDestination");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .liveEventDestinations
              .deleteOttDestination(liveEventId, userId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveEventDestinationsApi#deleteOttDestination");
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

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.vimeo.live.ott.destination+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | The OTT destination was deleted. |  -  |

<a name="getAllAvailableDestinations"></a>
# **getAllAvailableDestinations**
> getAllAvailableDestinations().execute();

Get all available live event destinations for the user to stream to

This method returns every available event destination for the authenticated user to stream to.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LiveEventDestinationsApi;
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
    try {
      client
              .liveEventDestinations
              .getAllAvailableDestinations()
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveEventDestinationsApi#getAllAvailableDestinations");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .liveEventDestinations
              .getAllAvailableDestinations()
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveEventDestinationsApi#getAllAvailableDestinations");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.vimeo.live.simulcast.destination+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The event destinations were returned. |  -  |

<a name="getAllAvailableDestinations_0"></a>
# **getAllAvailableDestinations_0**
> List&lt;LiveEventDestination&gt; getAllAvailableDestinations_0(liveEventId, userId).execute();

Get all the destinations of a recurring live event

This method returns every destination of the specified event. The authenticated user must be the owner of the event.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LiveEventDestinationsApi;
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
    try {
      List<LiveEventDestination> result = client
              .liveEventDestinations
              .getAllAvailableDestinations_0(liveEventId, userId)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveEventDestinationsApi#getAllAvailableDestinations_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<LiveEventDestination>> response = client
              .liveEventDestinations
              .getAllAvailableDestinations_0(liveEventId, userId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveEventDestinationsApi#getAllAvailableDestinations_0");
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

### Return type

[**List&lt;LiveEventDestination&gt;**](LiveEventDestination.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.vimeo.live.simulcast.destination+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The event destinations were returned. |  -  |

<a name="getAllAvailableDestinations_1"></a>
# **getAllAvailableDestinations_1**
> List&lt;LiveEventDestination&gt; getAllAvailableDestinations_1(userId, videoId).execute();

Get all the destinations of a one-time live event

This method returns every destination of the specified event. The authenticated user must be the owner of the event.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LiveEventDestinationsApi;
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
    Double videoId = 12345D; // The ID of the video.
    try {
      List<LiveEventDestination> result = client
              .liveEventDestinations
              .getAllAvailableDestinations_1(userId, videoId)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveEventDestinationsApi#getAllAvailableDestinations_1");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<LiveEventDestination>> response = client
              .liveEventDestinations
              .getAllAvailableDestinations_1(userId, videoId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveEventDestinationsApi#getAllAvailableDestinations_1");
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

[**List&lt;LiveEventDestination&gt;**](LiveEventDestination.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.vimeo.live.simulcast.destination+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The event destinations were returned. |  -  |

<a name="getAllDestinations"></a>
# **getAllDestinations**
> List&lt;LiveEventDestination&gt; getAllDestinations(videoId).execute();

Get all the destinations of a one-time live event

This method returns every destination of the specified event. The authenticated user must be the owner of the event.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LiveEventDestinationsApi;
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
    Double videoId = 12345D; // The ID of the video.
    try {
      List<LiveEventDestination> result = client
              .liveEventDestinations
              .getAllDestinations(videoId)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveEventDestinationsApi#getAllDestinations");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<LiveEventDestination>> response = client
              .liveEventDestinations
              .getAllDestinations(videoId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveEventDestinationsApi#getAllDestinations");
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

[**List&lt;LiveEventDestination&gt;**](LiveEventDestination.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.vimeo.live.simulcast.destination+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The event destinations were returned. |  -  |

<a name="getAllOttDestinations"></a>
# **getAllOttDestinations**
> List&lt;OttDestination&gt; getAllOttDestinations(liveEventId, userId).execute();

Get all the OTT destinations of a recurring live event

This method returns every OTT destination of the specified event. The authenticated user must be the owner of the event.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LiveEventDestinationsApi;
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
    try {
      List<OttDestination> result = client
              .liveEventDestinations
              .getAllOttDestinations(liveEventId, userId)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveEventDestinationsApi#getAllOttDestinations");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<OttDestination>> response = client
              .liveEventDestinations
              .getAllOttDestinations(liveEventId, userId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveEventDestinationsApi#getAllOttDestinations");
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

### Return type

[**List&lt;OttDestination&gt;**](OttDestination.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.vimeo.live.ott.destination+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The OTT destinations were returned. |  -  |

<a name="getDestination"></a>
# **getDestination**
> LiveEventDestination getDestination(destinationId).execute();

Get a live event destination

This method returns the specified event destination belonging to the authenticated user.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LiveEventDestinationsApi;
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
    Double destinationId = 152184D; // The ID of the event destination.
    try {
      LiveEventDestination result = client
              .liveEventDestinations
              .getDestination(destinationId)
              .execute();
      System.out.println(result);
      System.out.println(result.getDisplayName());
      System.out.println(result.getId());
      System.out.println(result.getIsEnabled());
      System.out.println(result.getLiveClipId());
      System.out.println(result.getPrivacy());
      System.out.println(result.getProviderBroadcastId());
      System.out.println(result.getProviderDestinationId());
      System.out.println(result.getProviderUserId());
      System.out.println(result.getProviderVideoId());
      System.out.println(result.getScheduledAt());
      System.out.println(result.getServiceName());
      System.out.println(result.getState());
      System.out.println(result.getStateMessage());
      System.out.println(result.getStreamKey());
      System.out.println(result.getStreamUrl());
      System.out.println(result.getType());
      System.out.println(result.getUserId());
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveEventDestinationsApi#getDestination");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<LiveEventDestination> response = client
              .liveEventDestinations
              .getDestination(destinationId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveEventDestinationsApi#getDestination");
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
| **destinationId** | **Double**| The ID of the event destination. | |

### Return type

[**LiveEventDestination**](LiveEventDestination.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.vimeo.live.simulcast.destination+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The event destination was returned. |  -  |

<a name="listAllAvailableDestinations"></a>
# **listAllAvailableDestinations**
> List&lt;LiveEventDestination&gt; listAllAvailableDestinations(liveEventId).execute();

Get all the destinations of a recurring live event

This method returns every destination of the specified event. The authenticated user must be the owner of the event.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LiveEventDestinationsApi;
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
    try {
      List<LiveEventDestination> result = client
              .liveEventDestinations
              .listAllAvailableDestinations(liveEventId)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveEventDestinationsApi#listAllAvailableDestinations");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<LiveEventDestination>> response = client
              .liveEventDestinations
              .listAllAvailableDestinations(liveEventId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveEventDestinationsApi#listAllAvailableDestinations");
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

### Return type

[**List&lt;LiveEventDestination&gt;**](LiveEventDestination.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.vimeo.live.simulcast.destination+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The event destinations were returned. |  -  |

<a name="listAvailableDestinations"></a>
# **listAvailableDestinations**
> listAvailableDestinations(userId).execute();

Get all available live event destinations for the user to stream to

This method returns every available event destination for the authenticated user to stream to.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LiveEventDestinationsApi;
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
    try {
      client
              .liveEventDestinations
              .listAvailableDestinations(userId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveEventDestinationsApi#listAvailableDestinations");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .liveEventDestinations
              .listAvailableDestinations(userId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveEventDestinationsApi#listAvailableDestinations");
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

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.vimeo.live.simulcast.destination+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The event destinations were returned. |  -  |

<a name="updateDestination"></a>
# **updateDestination**
> LiveEventDestination updateDestination(destinationId).liveEventDestinationsUpdateDestinationRequest(liveEventDestinationsUpdateDestinationRequest).execute();

Update a live event destination

This method updates the specified event destination belonging to the authenticated user.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LiveEventDestinationsApi;
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
    Double destinationId = 152184D; // The ID of the event destination.
    String displayName = "displayName_example"; // The title to display for the simulcast.
    Boolean isEnabled = true; // Whether the destination is enabled for simulcasting.
    String privacy = "CONNECTIONS"; // The privacy setting of the destination. Be sure to choose a value that corresponds to your service.  Option descriptions:  * `CONNECTIONS` - The privacy setting is `CONNECTIONS` for LinkedIn.  * `PUBLIC` - The privacy setting is `PUBLIC` for LinkedIn.  * `all_friends` - The privacy setting is `all_friends` for Facebook.  * `everyone` - The privacy setting is `everyone` for Facebook.  * `private` - The privacy setting is `private` for YouTube.  * `public` - The privacy setting is `public` for YouTube.  * `self` - The privacy setting is `self` for Facebook.  * `unlisted` - The privacy setting is `unlisted` for YouTube. 
    String providerDestinationId = "providerDestinationId_example"; // The ID of the destination on the specified service, such as the YouTube channel ID or the Facebook page ID.
    String serviceName = "custom_rtmp"; // The service to simulcast to.  Option descriptions:  * `custom_rtmp` - Simulcast to a custom service.  * `facebook` - Simulcast to Facebook Live.  * `linkedin` - Simulcast to LinkedIn Live.  * `youtube` - Simulcast to YouTube Live. 
    String streamKey = "streamKey_example"; // The RTMP stream key.
    String streamUrl = "streamUrl_example"; // The RTMP URL for receiving the video stream.
    String type = "channel"; // The type of the simulcast destination.  Option descriptions:  * `channel` - The destination is a YouTube channel.  * `custom` - The destination is custom.  * `organization` - The destination is a LinkedIn organization.  * `page` - The destination is a Facebook page.  * `profile` - The destination is a Facebook or LinkedIn profile. 
    try {
      LiveEventDestination result = client
              .liveEventDestinations
              .updateDestination(destinationId)
              .displayName(displayName)
              .isEnabled(isEnabled)
              .privacy(privacy)
              .providerDestinationId(providerDestinationId)
              .serviceName(serviceName)
              .streamKey(streamKey)
              .streamUrl(streamUrl)
              .type(type)
              .execute();
      System.out.println(result);
      System.out.println(result.getDisplayName());
      System.out.println(result.getId());
      System.out.println(result.getIsEnabled());
      System.out.println(result.getLiveClipId());
      System.out.println(result.getPrivacy());
      System.out.println(result.getProviderBroadcastId());
      System.out.println(result.getProviderDestinationId());
      System.out.println(result.getProviderUserId());
      System.out.println(result.getProviderVideoId());
      System.out.println(result.getScheduledAt());
      System.out.println(result.getServiceName());
      System.out.println(result.getState());
      System.out.println(result.getStateMessage());
      System.out.println(result.getStreamKey());
      System.out.println(result.getStreamUrl());
      System.out.println(result.getType());
      System.out.println(result.getUserId());
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveEventDestinationsApi#updateDestination");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<LiveEventDestination> response = client
              .liveEventDestinations
              .updateDestination(destinationId)
              .displayName(displayName)
              .isEnabled(isEnabled)
              .privacy(privacy)
              .providerDestinationId(providerDestinationId)
              .serviceName(serviceName)
              .streamKey(streamKey)
              .streamUrl(streamUrl)
              .type(type)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveEventDestinationsApi#updateDestination");
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
| **destinationId** | **Double**| The ID of the event destination. | |
| **liveEventDestinationsUpdateDestinationRequest** | [**LiveEventDestinationsUpdateDestinationRequest**](LiveEventDestinationsUpdateDestinationRequest.md)|  | [optional] |

### Return type

[**LiveEventDestination**](LiveEventDestination.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/vnd.vimeo.live.simulcast.destination+json
 - **Accept**: application/vnd.vimeo.live.simulcast.destination+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The event destination was updated. |  -  |

