# LiveEventActivationApi

All URIs are relative to *https://api.vimeo.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createRtmpLinks**](LiveEventActivationApi.md#createRtmpLinks) | **POST** /live_events/{live_event_id}/activate | Activate a live event |
| [**createRtmpLinks_0**](LiveEventActivationApi.md#createRtmpLinks_0) | **POST** /me/live_events/{live_event_id}/activate | Activate a live event |
| [**createRtmpLinks_1**](LiveEventActivationApi.md#createRtmpLinks_1) | **POST** /users/{user_id}/live_events/{live_event_id}/activate | Activate a live event |


<a name="createRtmpLinks"></a>
# **createRtmpLinks**
> Video createRtmpLinks(liveEventId).liveEventActivationCreateRtmpLinksRequest(liveEventActivationCreateRtmpLinksRequest).execute();

Activate a live event

This method creates the necessary RTMP links for the specified event. Begin streaming to these links to trigger the event on Vimeo. The authenticated user must be the owner of the event.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LiveEventActivationApi;
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
    Boolean cloudComposingStreaming = true; // Whether the stream activates from the cloud composer. _This field is deprecated._
    Boolean streamingStartRequested = true; // Whether the stream activates from the cloud composer.
    try {
      Video result = client
              .liveEventActivation
              .createRtmpLinks(liveEventId)
              .cloudComposingStreaming(cloudComposingStreaming)
              .streamingStartRequested(streamingStartRequested)
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
      System.err.println("Exception when calling LiveEventActivationApi#createRtmpLinks");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Video> response = client
              .liveEventActivation
              .createRtmpLinks(liveEventId)
              .cloudComposingStreaming(cloudComposingStreaming)
              .streamingStartRequested(streamingStartRequested)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveEventActivationApi#createRtmpLinks");
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
| **liveEventActivationCreateRtmpLinksRequest** | [**LiveEventActivationCreateRtmpLinksRequest**](LiveEventActivationCreateRtmpLinksRequest.md)|  | [optional] |

### Return type

[**Video**](Video.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/vnd.vimeo.video+json
 - **Accept**: application/vnd.vimeo.video+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The event was activated. |  -  |

<a name="createRtmpLinks_0"></a>
# **createRtmpLinks_0**
> Video createRtmpLinks_0(liveEventId).liveEventActivationCreateRtmpLinksRequest1(liveEventActivationCreateRtmpLinksRequest1).execute();

Activate a live event

This method creates the necessary RTMP links for the specified event. Begin streaming to these links to trigger the event on Vimeo. The authenticated user must be the owner of the event.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LiveEventActivationApi;
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
    Boolean cloudComposingStreaming = true; // Whether the stream activates from the cloud composer. _This field is deprecated._
    Boolean streamingStartRequested = true; // Whether the stream activates from the cloud composer.
    try {
      Video result = client
              .liveEventActivation
              .createRtmpLinks_0(liveEventId)
              .cloudComposingStreaming(cloudComposingStreaming)
              .streamingStartRequested(streamingStartRequested)
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
      System.err.println("Exception when calling LiveEventActivationApi#createRtmpLinks_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Video> response = client
              .liveEventActivation
              .createRtmpLinks_0(liveEventId)
              .cloudComposingStreaming(cloudComposingStreaming)
              .streamingStartRequested(streamingStartRequested)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveEventActivationApi#createRtmpLinks_0");
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
| **liveEventActivationCreateRtmpLinksRequest1** | [**LiveEventActivationCreateRtmpLinksRequest1**](LiveEventActivationCreateRtmpLinksRequest1.md)|  | [optional] |

### Return type

[**Video**](Video.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/vnd.vimeo.video+json
 - **Accept**: application/vnd.vimeo.video+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The event was activated. |  -  |

<a name="createRtmpLinks_1"></a>
# **createRtmpLinks_1**
> Video createRtmpLinks_1(liveEventId, userId).liveEventActivationCreateRtmpLinksRequest2(liveEventActivationCreateRtmpLinksRequest2).execute();

Activate a live event

This method creates the necessary RTMP links for the specified event. Begin streaming to these links to trigger the event on Vimeo. The authenticated user must be the owner of the event.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LiveEventActivationApi;
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
    Boolean cloudComposingStreaming = true; // Whether the stream activates from the cloud composer. _This field is deprecated._
    Boolean streamingStartRequested = true; // Whether the stream activates from the cloud composer.
    try {
      Video result = client
              .liveEventActivation
              .createRtmpLinks_1(liveEventId, userId)
              .cloudComposingStreaming(cloudComposingStreaming)
              .streamingStartRequested(streamingStartRequested)
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
      System.err.println("Exception when calling LiveEventActivationApi#createRtmpLinks_1");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Video> response = client
              .liveEventActivation
              .createRtmpLinks_1(liveEventId, userId)
              .cloudComposingStreaming(cloudComposingStreaming)
              .streamingStartRequested(streamingStartRequested)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveEventActivationApi#createRtmpLinks_1");
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
| **liveEventActivationCreateRtmpLinksRequest2** | [**LiveEventActivationCreateRtmpLinksRequest2**](LiveEventActivationCreateRtmpLinksRequest2.md)|  | [optional] |

### Return type

[**Video**](Video.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/vnd.vimeo.video+json
 - **Accept**: application/vnd.vimeo.video+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The event was activated. |  -  |

