# LiveEssentialsApi

All URIs are relative to *https://api.vimeo.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createEvent**](LiveEssentialsApi.md#createEvent) | **POST** /live_events | Create a live event |
| [**createEventForUser**](LiveEssentialsApi.md#createEventForUser) | **POST** /users/{user_id}/live_events | Create a live event |
| [**createLiveEvent**](LiveEssentialsApi.md#createLiveEvent) | **POST** /me/live_events | Create a live event |
| [**deleteMultipleEvents**](LiveEssentialsApi.md#deleteMultipleEvents) | **DELETE** /live_events | Delete a list of live events |
| [**deleteMultipleEvents_0**](LiveEssentialsApi.md#deleteMultipleEvents_0) | **DELETE** /me/live_events | Delete a list of live events |
| [**deleteMultipleEvents_1**](LiveEssentialsApi.md#deleteMultipleEvents_1) | **DELETE** /users/{user_id}/live_events | Delete a list of live events |
| [**deleteSingleEvent**](LiveEssentialsApi.md#deleteSingleEvent) | **DELETE** /me/live_events/{live_event_id} | Delete a specific live event |
| [**deleteSpecificEvent**](LiveEssentialsApi.md#deleteSpecificEvent) | **DELETE** /users/{user_id}/live_events/{live_event_id} | Delete a specific live event |
| [**deleteSpecificLiveEvent**](LiveEssentialsApi.md#deleteSpecificLiveEvent) | **DELETE** /live_events/{live_event_id} | Delete a specific live event |
| [**getAllUserLiveEvents**](LiveEssentialsApi.md#getAllUserLiveEvents) | **GET** /me/live_events | Get all the live events that belong to the user |
| [**getEventById**](LiveEssentialsApi.md#getEventById) | **GET** /live_events/{live_event_id} | Get a specific live event |
| [**getEventById_0**](LiveEssentialsApi.md#getEventById_0) | **GET** /users/{user_id}/live_events/{live_event_id} | Get a specific live event |
| [**getSpecificLiveEvent**](LiveEssentialsApi.md#getSpecificLiveEvent) | **GET** /me/live_events/{live_event_id} | Get a specific live event |
| [**getUserLiveEvents**](LiveEssentialsApi.md#getUserLiveEvents) | **GET** /live_events | Get all the live events that belong to the user |
| [**getUserLiveEvents_0**](LiveEssentialsApi.md#getUserLiveEvents_0) | **GET** /users/{user_id}/live_events | Get all the live events that belong to the user |
| [**updateEventBelongingToAuthenticatedUser**](LiveEssentialsApi.md#updateEventBelongingToAuthenticatedUser) | **PATCH** /live_events/{live_event_id} | Update a live event |
| [**updateEventBelongingToAuthenticatedUser_0**](LiveEssentialsApi.md#updateEventBelongingToAuthenticatedUser_0) | **PATCH** /me/live_events/{live_event_id} | Update a live event |
| [**updateEventBelongingToAuthenticatedUser_1**](LiveEssentialsApi.md#updateEventBelongingToAuthenticatedUser_1) | **PATCH** /users/{user_id}/live_events/{live_event_id} | Update a live event |


<a name="createEvent"></a>
# **createEvent**
> LiveEventRecurring createEvent(liveEssentialsCreateEventRequest).execute();

Create a live event

This method creates a new event for the authenticated user.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LiveEssentialsApi;
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
    String title = "title_example"; // The title of the event. If **automatically_title_stream** is `true`, this value is the base title for videos created by streaming to this event.
    Boolean allowShareLink = true; // Whether the share link is usable.
    Boolean autoCcEnabled = true; // Whether automated closed captions are enabled for the event.
    String autoCcKeywords = "autoCcKeywords_example"; // A comma-separated list of keywords that improve the quality of the automated closed captions.
    String autoCcLang = "de-DE"; // The language in which the automated closed captions appear.  Option descriptions:  * `de-DE` - The language is German.  * `en-US` - The language is English.  * `es-ES` - The language is Spanish.  * `fr-FR` - The language is French.  * `pt-BR` - The language is Portuguese. 
    Boolean automaticallyTitleStream = true; // Whether the title for the next video in the event is generated based on the time of the stream and the **title** field of the event.
    Boolean chatEnabled = true; // Whether to display the live chat client on the Vimeo event page.
    List<String> contentRating = Arrays.asList(); // A list of values describing the content in this event. To return the list of all possible content rating values, use the [`/contentratings`](https://developer.vimeo.com/api/reference/videos#get_content_ratings) endpoint.
    Boolean dvr = true; // Whether the DVR feature is enabled.
    LiveEssentialsCreateEventRequestEmbed embed = new LiveEssentialsCreateEventRequestEmbed();
    String folderUri = "folderUri_example"; // The URI of the event's folder.
    LiveEssentialsCreateEventRequestInteractionToolsSettings interactionToolsSettings = new LiveEssentialsCreateEventRequestInteractionToolsSettings();
    Boolean lowLatency = true; // Whether the event has low-latency streaming enabled.
    String playlistSort = "added_first"; // The order in which the videos of the event appear within the event's playlist.  Option descriptions:  * `added_first` - The most recently added videos appear first.  * `added_last` - The most recently added videos appear last.  * `alphabetical` - The videos appear in alphabetical order.  * `arranged` - The videos appear in the order in which the user has arranged them.  * `comments` - The videos appear in order of number of comments.  * `duration` - The videos appear in order of duration.  * `likes` - The videos appear in order of number of likes.  * `newest` - The newest videos appear first.  * `oldest` - The oldest videos appear first.  * `plays` - The videos appear in order of number of plays. 
    Boolean rtmpPreview = true; // Whether the event has RTMP preview enabled.
    LiveEssentialsCreateEventRequestSchedule schedule = new LiveEssentialsCreateEventRequestSchedule();
    Boolean scheduledPlayback = true; // Whether the scheduled playback feature is enabled.
    String streamDescription = "streamDescription_example"; // The description of the next video to be streamed to the event.
    LiveEssentialsCreateEventRequestStreamEmbed streamEmbed = new LiveEssentialsCreateEventRequestStreamEmbed();
    String streamPassword = "streamPassword_example"; // The password when **stream_privacy.view** is `password`. Anyone with the password can view the videos generated by streaming to the event.
    LiveEssentialsCreateEventRequestStreamPrivacy streamPrivacy = new LiveEssentialsCreateEventRequestStreamPrivacy();
    String streamTitle = "streamTitle_example"; // The title of the next video to be streamed to the event. This parameter is required when **automatically_title_stream** is `false`.
    String timeZone = "timeZone_example"; // The time zone used in resolving the timestamps that are included in automatically generated video titles.
    try {
      LiveEventRecurring result = client
              .liveEssentials
              .createEvent(title)
              .allowShareLink(allowShareLink)
              .autoCcEnabled(autoCcEnabled)
              .autoCcKeywords(autoCcKeywords)
              .autoCcLang(autoCcLang)
              .automaticallyTitleStream(automaticallyTitleStream)
              .chatEnabled(chatEnabled)
              .contentRating(contentRating)
              .dvr(dvr)
              .embed(embed)
              .folderUri(folderUri)
              .interactionToolsSettings(interactionToolsSettings)
              .lowLatency(lowLatency)
              .playlistSort(playlistSort)
              .rtmpPreview(rtmpPreview)
              .schedule(schedule)
              .scheduledPlayback(scheduledPlayback)
              .streamDescription(streamDescription)
              .streamEmbed(streamEmbed)
              .streamPassword(streamPassword)
              .streamPrivacy(streamPrivacy)
              .streamTitle(streamTitle)
              .timeZone(timeZone)
              .execute();
      System.out.println(result);
      System.out.println(result.getTitle());
      System.out.println(result.getAlbum());
      System.out.println(result.getAllowShareLink());
      System.out.println(result.getAllowedPrivacies());
      System.out.println(result.getAutoCcEnabled());
      System.out.println(result.getAutoCcKeywords());
      System.out.println(result.getAutoCcLanguage());
      System.out.println(result.getAutoCcRemaining());
      System.out.println(result.getAutomaticallyTitleStream());
      System.out.println(result.getChatEnabled());
      System.out.println(result.getCompletedOn());
      System.out.println(result.getContentRating());
      System.out.println(result.getCreatedTime());
      System.out.println(result.getDvr());
      System.out.println(result.getEmailQuota());
      System.out.println(result.getEmbed());
      System.out.println(result.getFromShowcase());
      System.out.println(result.getFromWebinar());
      System.out.println(result.getHeadClip());
      System.out.println(result.getInteractionToolsSettings());
      System.out.println(result.getLatency());
      System.out.println(result.getLeadUuid());
      System.out.println(result.getLink());
      System.out.println(result.getLiveClips());
      System.out.println(result.getLiveDestinations());
      System.out.println(result.getLowLatency());
      System.out.println(result.getMetadata());
      System.out.println(result.getNextOccurrenceTime());
      System.out.println(result.getParentFolder());
      System.out.println(result.getPictures());
      System.out.println(result.getPlaylistSort());
      System.out.println(result.getPreferredStreamMethod());
      System.out.println(result.getRtmpLink());
      System.out.println(result.getRtmpPreview());
      System.out.println(result.getRtmpsLink());
      System.out.println(result.getSchedule());
      System.out.println(result.getScheduledPlayback());
      System.out.println(result.getStatus());
      System.out.println(result.getStreamDescription());
      System.out.println(result.getStreamKey());
      System.out.println(result.getStreamMode());
      System.out.println(result.getStreamPassword());
      System.out.println(result.getStreamPrivacy());
      System.out.println(result.getStreamTitle());
      System.out.println(result.getStreamableClip());
      System.out.println(result.getTimeZone());
      System.out.println(result.getUnlimitedAutoCc());
      System.out.println(result.getUnlimitedDuration());
      System.out.println(result.getUri());
      System.out.println(result.getUser());
      System.out.println(result.getViewLink());
      System.out.println(result.getWebinar());
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveEssentialsApi#createEvent");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<LiveEventRecurring> response = client
              .liveEssentials
              .createEvent(title)
              .allowShareLink(allowShareLink)
              .autoCcEnabled(autoCcEnabled)
              .autoCcKeywords(autoCcKeywords)
              .autoCcLang(autoCcLang)
              .automaticallyTitleStream(automaticallyTitleStream)
              .chatEnabled(chatEnabled)
              .contentRating(contentRating)
              .dvr(dvr)
              .embed(embed)
              .folderUri(folderUri)
              .interactionToolsSettings(interactionToolsSettings)
              .lowLatency(lowLatency)
              .playlistSort(playlistSort)
              .rtmpPreview(rtmpPreview)
              .schedule(schedule)
              .scheduledPlayback(scheduledPlayback)
              .streamDescription(streamDescription)
              .streamEmbed(streamEmbed)
              .streamPassword(streamPassword)
              .streamPrivacy(streamPrivacy)
              .streamTitle(streamTitle)
              .timeZone(timeZone)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveEssentialsApi#createEvent");
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
| **liveEssentialsCreateEventRequest** | [**LiveEssentialsCreateEventRequest**](LiveEssentialsCreateEventRequest.md)|  | |

### Return type

[**LiveEventRecurring**](LiveEventRecurring.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/vnd.vimeo.live.event.recurring+json
 - **Accept**: application/vnd.vimeo.live.event.recurring+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The event was created. |  -  |

<a name="createEventForUser"></a>
# **createEventForUser**
> LiveEventRecurring createEventForUser(userId, liveEssentialsCreateEventForUserRequest).execute();

Create a live event

This method creates a new event for the authenticated user.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LiveEssentialsApi;
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
    String title = "title_example"; // The title of the event. If **automatically_title_stream** is `true`, this value is the base title for videos created by streaming to this event.
    Double userId = 152184D; // The ID of the user.
    Boolean allowShareLink = true; // Whether the share link is usable.
    Boolean autoCcEnabled = true; // Whether automated closed captions are enabled for the event.
    String autoCcKeywords = "autoCcKeywords_example"; // A comma-separated list of keywords that improve the quality of the automated closed captions.
    String autoCcLang = "de-DE"; // The language in which the automated closed captions appear.  Option descriptions:  * `de-DE` - The language is German.  * `en-US` - The language is English.  * `es-ES` - The language is Spanish.  * `fr-FR` - The language is French.  * `pt-BR` - The language is Portuguese. 
    Boolean automaticallyTitleStream = true; // Whether the title for the next video in the event is generated based on the time of the stream and the **title** field of the event.
    Boolean chatEnabled = true; // Whether to display the live chat client on the Vimeo event page.
    List<String> contentRating = Arrays.asList(); // A list of values describing the content in this event. To return the list of all possible content rating values, use the [`/contentratings`](https://developer.vimeo.com/api/reference/videos#get_content_ratings) endpoint.
    Boolean dvr = true; // Whether the DVR feature is enabled.
    LiveEssentialsCreateEventForUserRequestEmbed embed = new LiveEssentialsCreateEventForUserRequestEmbed();
    String folderUri = "folderUri_example"; // The URI of the event's folder.
    LiveEssentialsCreateEventForUserRequestInteractionToolsSettings interactionToolsSettings = new LiveEssentialsCreateEventForUserRequestInteractionToolsSettings();
    Boolean lowLatency = true; // Whether the event has low-latency streaming enabled.
    String playlistSort = "added_first"; // The order in which the videos of the event appear within the event's playlist.  Option descriptions:  * `added_first` - The most recently added videos appear first.  * `added_last` - The most recently added videos appear last.  * `alphabetical` - The videos appear in alphabetical order.  * `arranged` - The videos appear in the order in which the user has arranged them.  * `comments` - The videos appear in order of number of comments.  * `duration` - The videos appear in order of duration.  * `likes` - The videos appear in order of number of likes.  * `newest` - The newest videos appear first.  * `oldest` - The oldest videos appear first.  * `plays` - The videos appear in order of number of plays. 
    Boolean rtmpPreview = true; // Whether the event has RTMP preview enabled.
    LiveEssentialsCreateEventForUserRequestSchedule schedule = new LiveEssentialsCreateEventForUserRequestSchedule();
    Boolean scheduledPlayback = true; // Whether the scheduled playback feature is enabled.
    String streamDescription = "streamDescription_example"; // The description of the next video to be streamed to the event.
    LiveEssentialsCreateEventForUserRequestStreamEmbed streamEmbed = new LiveEssentialsCreateEventForUserRequestStreamEmbed();
    String streamPassword = "streamPassword_example"; // The password when **stream_privacy.view** is `password`. Anyone with the password can view the videos generated by streaming to the event.
    LiveEssentialsCreateEventForUserRequestStreamPrivacy streamPrivacy = new LiveEssentialsCreateEventForUserRequestStreamPrivacy();
    String streamTitle = "streamTitle_example"; // The title of the next video to be streamed to the event. This parameter is required when **automatically_title_stream** is `false`.
    String timeZone = "timeZone_example"; // The time zone used in resolving the timestamps that are included in automatically generated video titles.
    try {
      LiveEventRecurring result = client
              .liveEssentials
              .createEventForUser(title, userId)
              .allowShareLink(allowShareLink)
              .autoCcEnabled(autoCcEnabled)
              .autoCcKeywords(autoCcKeywords)
              .autoCcLang(autoCcLang)
              .automaticallyTitleStream(automaticallyTitleStream)
              .chatEnabled(chatEnabled)
              .contentRating(contentRating)
              .dvr(dvr)
              .embed(embed)
              .folderUri(folderUri)
              .interactionToolsSettings(interactionToolsSettings)
              .lowLatency(lowLatency)
              .playlistSort(playlistSort)
              .rtmpPreview(rtmpPreview)
              .schedule(schedule)
              .scheduledPlayback(scheduledPlayback)
              .streamDescription(streamDescription)
              .streamEmbed(streamEmbed)
              .streamPassword(streamPassword)
              .streamPrivacy(streamPrivacy)
              .streamTitle(streamTitle)
              .timeZone(timeZone)
              .execute();
      System.out.println(result);
      System.out.println(result.getTitle());
      System.out.println(result.getAlbum());
      System.out.println(result.getAllowShareLink());
      System.out.println(result.getAllowedPrivacies());
      System.out.println(result.getAutoCcEnabled());
      System.out.println(result.getAutoCcKeywords());
      System.out.println(result.getAutoCcLanguage());
      System.out.println(result.getAutoCcRemaining());
      System.out.println(result.getAutomaticallyTitleStream());
      System.out.println(result.getChatEnabled());
      System.out.println(result.getCompletedOn());
      System.out.println(result.getContentRating());
      System.out.println(result.getCreatedTime());
      System.out.println(result.getDvr());
      System.out.println(result.getEmailQuota());
      System.out.println(result.getEmbed());
      System.out.println(result.getFromShowcase());
      System.out.println(result.getFromWebinar());
      System.out.println(result.getHeadClip());
      System.out.println(result.getInteractionToolsSettings());
      System.out.println(result.getLatency());
      System.out.println(result.getLeadUuid());
      System.out.println(result.getLink());
      System.out.println(result.getLiveClips());
      System.out.println(result.getLiveDestinations());
      System.out.println(result.getLowLatency());
      System.out.println(result.getMetadata());
      System.out.println(result.getNextOccurrenceTime());
      System.out.println(result.getParentFolder());
      System.out.println(result.getPictures());
      System.out.println(result.getPlaylistSort());
      System.out.println(result.getPreferredStreamMethod());
      System.out.println(result.getRtmpLink());
      System.out.println(result.getRtmpPreview());
      System.out.println(result.getRtmpsLink());
      System.out.println(result.getSchedule());
      System.out.println(result.getScheduledPlayback());
      System.out.println(result.getStatus());
      System.out.println(result.getStreamDescription());
      System.out.println(result.getStreamKey());
      System.out.println(result.getStreamMode());
      System.out.println(result.getStreamPassword());
      System.out.println(result.getStreamPrivacy());
      System.out.println(result.getStreamTitle());
      System.out.println(result.getStreamableClip());
      System.out.println(result.getTimeZone());
      System.out.println(result.getUnlimitedAutoCc());
      System.out.println(result.getUnlimitedDuration());
      System.out.println(result.getUri());
      System.out.println(result.getUser());
      System.out.println(result.getViewLink());
      System.out.println(result.getWebinar());
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveEssentialsApi#createEventForUser");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<LiveEventRecurring> response = client
              .liveEssentials
              .createEventForUser(title, userId)
              .allowShareLink(allowShareLink)
              .autoCcEnabled(autoCcEnabled)
              .autoCcKeywords(autoCcKeywords)
              .autoCcLang(autoCcLang)
              .automaticallyTitleStream(automaticallyTitleStream)
              .chatEnabled(chatEnabled)
              .contentRating(contentRating)
              .dvr(dvr)
              .embed(embed)
              .folderUri(folderUri)
              .interactionToolsSettings(interactionToolsSettings)
              .lowLatency(lowLatency)
              .playlistSort(playlistSort)
              .rtmpPreview(rtmpPreview)
              .schedule(schedule)
              .scheduledPlayback(scheduledPlayback)
              .streamDescription(streamDescription)
              .streamEmbed(streamEmbed)
              .streamPassword(streamPassword)
              .streamPrivacy(streamPrivacy)
              .streamTitle(streamTitle)
              .timeZone(timeZone)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveEssentialsApi#createEventForUser");
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
| **liveEssentialsCreateEventForUserRequest** | [**LiveEssentialsCreateEventForUserRequest**](LiveEssentialsCreateEventForUserRequest.md)|  | |

### Return type

[**LiveEventRecurring**](LiveEventRecurring.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/vnd.vimeo.live.event.recurring+json
 - **Accept**: application/vnd.vimeo.live.event.recurring+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The event was created. |  -  |

<a name="createLiveEvent"></a>
# **createLiveEvent**
> LiveEventRecurring createLiveEvent(liveEssentialsCreateLiveEventRequest).execute();

Create a live event

This method creates a new event for the authenticated user.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LiveEssentialsApi;
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
    String title = "title_example"; // The title of the event. If **automatically_title_stream** is `true`, this value is the base title for videos created by streaming to this event.
    Boolean allowShareLink = true; // Whether the share link is usable.
    Boolean autoCcEnabled = true; // Whether automated closed captions are enabled for the event.
    String autoCcKeywords = "autoCcKeywords_example"; // A comma-separated list of keywords that improve the quality of the automated closed captions.
    String autoCcLang = "de-DE"; // The language in which the automated closed captions appear.  Option descriptions:  * `de-DE` - The language is German.  * `en-US` - The language is English.  * `es-ES` - The language is Spanish.  * `fr-FR` - The language is French.  * `pt-BR` - The language is Portuguese. 
    Boolean automaticallyTitleStream = true; // Whether the title for the next video in the event is generated based on the time of the stream and the **title** field of the event.
    Boolean chatEnabled = true; // Whether to display the live chat client on the Vimeo event page.
    List<String> contentRating = Arrays.asList(); // A list of values describing the content in this event. To return the list of all possible content rating values, use the [`/contentratings`](https://developer.vimeo.com/api/reference/videos#get_content_ratings) endpoint.
    Boolean dvr = true; // Whether the DVR feature is enabled.
    LiveEssentialsCreateLiveEventRequestEmbed embed = new LiveEssentialsCreateLiveEventRequestEmbed();
    String folderUri = "folderUri_example"; // The URI of the event's folder.
    LiveEssentialsCreateLiveEventRequestInteractionToolsSettings interactionToolsSettings = new LiveEssentialsCreateLiveEventRequestInteractionToolsSettings();
    Boolean lowLatency = true; // Whether the event has low-latency streaming enabled.
    String playlistSort = "added_first"; // The order in which the videos of the event appear within the event's playlist.  Option descriptions:  * `added_first` - The most recently added videos appear first.  * `added_last` - The most recently added videos appear last.  * `alphabetical` - The videos appear in alphabetical order.  * `arranged` - The videos appear in the order in which the user has arranged them.  * `comments` - The videos appear in order of number of comments.  * `duration` - The videos appear in order of duration.  * `likes` - The videos appear in order of number of likes.  * `newest` - The newest videos appear first.  * `oldest` - The oldest videos appear first.  * `plays` - The videos appear in order of number of plays. 
    Boolean rtmpPreview = true; // Whether the event has RTMP preview enabled.
    LiveEssentialsCreateLiveEventRequestSchedule schedule = new LiveEssentialsCreateLiveEventRequestSchedule();
    Boolean scheduledPlayback = true; // Whether the scheduled playback feature is enabled.
    String streamDescription = "streamDescription_example"; // The description of the next video to be streamed to the event.
    LiveEssentialsCreateLiveEventRequestStreamEmbed streamEmbed = new LiveEssentialsCreateLiveEventRequestStreamEmbed();
    String streamPassword = "streamPassword_example"; // The password when **stream_privacy.view** is `password`. Anyone with the password can view the videos generated by streaming to the event.
    LiveEssentialsCreateLiveEventRequestStreamPrivacy streamPrivacy = new LiveEssentialsCreateLiveEventRequestStreamPrivacy();
    String streamTitle = "streamTitle_example"; // The title of the next video to be streamed to the event. This parameter is required when **automatically_title_stream** is `false`.
    String timeZone = "timeZone_example"; // The time zone used in resolving the timestamps that are included in automatically generated video titles.
    try {
      LiveEventRecurring result = client
              .liveEssentials
              .createLiveEvent(title)
              .allowShareLink(allowShareLink)
              .autoCcEnabled(autoCcEnabled)
              .autoCcKeywords(autoCcKeywords)
              .autoCcLang(autoCcLang)
              .automaticallyTitleStream(automaticallyTitleStream)
              .chatEnabled(chatEnabled)
              .contentRating(contentRating)
              .dvr(dvr)
              .embed(embed)
              .folderUri(folderUri)
              .interactionToolsSettings(interactionToolsSettings)
              .lowLatency(lowLatency)
              .playlistSort(playlistSort)
              .rtmpPreview(rtmpPreview)
              .schedule(schedule)
              .scheduledPlayback(scheduledPlayback)
              .streamDescription(streamDescription)
              .streamEmbed(streamEmbed)
              .streamPassword(streamPassword)
              .streamPrivacy(streamPrivacy)
              .streamTitle(streamTitle)
              .timeZone(timeZone)
              .execute();
      System.out.println(result);
      System.out.println(result.getTitle());
      System.out.println(result.getAlbum());
      System.out.println(result.getAllowShareLink());
      System.out.println(result.getAllowedPrivacies());
      System.out.println(result.getAutoCcEnabled());
      System.out.println(result.getAutoCcKeywords());
      System.out.println(result.getAutoCcLanguage());
      System.out.println(result.getAutoCcRemaining());
      System.out.println(result.getAutomaticallyTitleStream());
      System.out.println(result.getChatEnabled());
      System.out.println(result.getCompletedOn());
      System.out.println(result.getContentRating());
      System.out.println(result.getCreatedTime());
      System.out.println(result.getDvr());
      System.out.println(result.getEmailQuota());
      System.out.println(result.getEmbed());
      System.out.println(result.getFromShowcase());
      System.out.println(result.getFromWebinar());
      System.out.println(result.getHeadClip());
      System.out.println(result.getInteractionToolsSettings());
      System.out.println(result.getLatency());
      System.out.println(result.getLeadUuid());
      System.out.println(result.getLink());
      System.out.println(result.getLiveClips());
      System.out.println(result.getLiveDestinations());
      System.out.println(result.getLowLatency());
      System.out.println(result.getMetadata());
      System.out.println(result.getNextOccurrenceTime());
      System.out.println(result.getParentFolder());
      System.out.println(result.getPictures());
      System.out.println(result.getPlaylistSort());
      System.out.println(result.getPreferredStreamMethod());
      System.out.println(result.getRtmpLink());
      System.out.println(result.getRtmpPreview());
      System.out.println(result.getRtmpsLink());
      System.out.println(result.getSchedule());
      System.out.println(result.getScheduledPlayback());
      System.out.println(result.getStatus());
      System.out.println(result.getStreamDescription());
      System.out.println(result.getStreamKey());
      System.out.println(result.getStreamMode());
      System.out.println(result.getStreamPassword());
      System.out.println(result.getStreamPrivacy());
      System.out.println(result.getStreamTitle());
      System.out.println(result.getStreamableClip());
      System.out.println(result.getTimeZone());
      System.out.println(result.getUnlimitedAutoCc());
      System.out.println(result.getUnlimitedDuration());
      System.out.println(result.getUri());
      System.out.println(result.getUser());
      System.out.println(result.getViewLink());
      System.out.println(result.getWebinar());
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveEssentialsApi#createLiveEvent");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<LiveEventRecurring> response = client
              .liveEssentials
              .createLiveEvent(title)
              .allowShareLink(allowShareLink)
              .autoCcEnabled(autoCcEnabled)
              .autoCcKeywords(autoCcKeywords)
              .autoCcLang(autoCcLang)
              .automaticallyTitleStream(automaticallyTitleStream)
              .chatEnabled(chatEnabled)
              .contentRating(contentRating)
              .dvr(dvr)
              .embed(embed)
              .folderUri(folderUri)
              .interactionToolsSettings(interactionToolsSettings)
              .lowLatency(lowLatency)
              .playlistSort(playlistSort)
              .rtmpPreview(rtmpPreview)
              .schedule(schedule)
              .scheduledPlayback(scheduledPlayback)
              .streamDescription(streamDescription)
              .streamEmbed(streamEmbed)
              .streamPassword(streamPassword)
              .streamPrivacy(streamPrivacy)
              .streamTitle(streamTitle)
              .timeZone(timeZone)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveEssentialsApi#createLiveEvent");
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
| **liveEssentialsCreateLiveEventRequest** | [**LiveEssentialsCreateLiveEventRequest**](LiveEssentialsCreateLiveEventRequest.md)|  | |

### Return type

[**LiveEventRecurring**](LiveEventRecurring.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/vnd.vimeo.live.event.recurring+json
 - **Accept**: application/vnd.vimeo.live.event.recurring+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The event was created. |  -  |

<a name="deleteMultipleEvents"></a>
# **deleteMultipleEvents**
> deleteMultipleEvents(liveEssentialsDeleteMultipleEventsRequest).execute();

Delete a list of live events

This method deletes multiple events belonging to the authenticated user.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LiveEssentialsApi;
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
    String password = "password_example"; // The user’s password.
    try {
      client
              .liveEssentials
              .deleteMultipleEvents(password)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveEssentialsApi#deleteMultipleEvents");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .liveEssentials
              .deleteMultipleEvents(password)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveEssentialsApi#deleteMultipleEvents");
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
| **liveEssentialsDeleteMultipleEventsRequest** | [**LiveEssentialsDeleteMultipleEventsRequest**](LiveEssentialsDeleteMultipleEventsRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/vnd.vimeo.live.event.recurring+json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="deleteMultipleEvents_0"></a>
# **deleteMultipleEvents_0**
> deleteMultipleEvents_0(liveEssentialsDeleteMultipleEventsRequest1).execute();

Delete a list of live events

This method deletes multiple events belonging to the authenticated user.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LiveEssentialsApi;
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
    String password = "password_example"; // The user’s password.
    try {
      client
              .liveEssentials
              .deleteMultipleEvents_0(password)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveEssentialsApi#deleteMultipleEvents_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .liveEssentials
              .deleteMultipleEvents_0(password)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveEssentialsApi#deleteMultipleEvents_0");
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
| **liveEssentialsDeleteMultipleEventsRequest1** | [**LiveEssentialsDeleteMultipleEventsRequest1**](LiveEssentialsDeleteMultipleEventsRequest1.md)|  | |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/vnd.vimeo.live.event.recurring+json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="deleteMultipleEvents_1"></a>
# **deleteMultipleEvents_1**
> deleteMultipleEvents_1(userId, liveEssentialsDeleteMultipleEventsRequest2).execute();

Delete a list of live events

This method deletes multiple events belonging to the authenticated user.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LiveEssentialsApi;
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
    String password = "password_example"; // The user’s password.
    Double userId = 152184D; // The ID of the user.
    try {
      client
              .liveEssentials
              .deleteMultipleEvents_1(password, userId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveEssentialsApi#deleteMultipleEvents_1");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .liveEssentials
              .deleteMultipleEvents_1(password, userId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveEssentialsApi#deleteMultipleEvents_1");
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
| **liveEssentialsDeleteMultipleEventsRequest2** | [**LiveEssentialsDeleteMultipleEventsRequest2**](LiveEssentialsDeleteMultipleEventsRequest2.md)|  | |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/vnd.vimeo.live.event.recurring+json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="deleteSingleEvent"></a>
# **deleteSingleEvent**
> deleteSingleEvent(liveEventId).execute();

Delete a specific live event

This method deletes a single event belonging to the authenticated user.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LiveEssentialsApi;
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
    Double liveEventId = 3.4D; // The ID of the event.
    try {
      client
              .liveEssentials
              .deleteSingleEvent(liveEventId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveEssentialsApi#deleteSingleEvent");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .liveEssentials
              .deleteSingleEvent(liveEventId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveEssentialsApi#deleteSingleEvent");
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

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | The event was deleted. |  -  |

<a name="deleteSpecificEvent"></a>
# **deleteSpecificEvent**
> deleteSpecificEvent(liveEventId, userId).execute();

Delete a specific live event

This method deletes a single event belonging to the authenticated user.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LiveEssentialsApi;
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
    Double liveEventId = 3.4D; // The ID of the event.
    Double userId = 3.4D; // The ID of the user.
    try {
      client
              .liveEssentials
              .deleteSpecificEvent(liveEventId, userId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveEssentialsApi#deleteSpecificEvent");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .liveEssentials
              .deleteSpecificEvent(liveEventId, userId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveEssentialsApi#deleteSpecificEvent");
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
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | The event was deleted. |  -  |

<a name="deleteSpecificLiveEvent"></a>
# **deleteSpecificLiveEvent**
> deleteSpecificLiveEvent(liveEventId).execute();

Delete a specific live event

This method deletes a single event belonging to the authenticated user.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LiveEssentialsApi;
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
    Double liveEventId = 3.4D; // The ID of the event.
    try {
      client
              .liveEssentials
              .deleteSpecificLiveEvent(liveEventId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveEssentialsApi#deleteSpecificLiveEvent");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .liveEssentials
              .deleteSpecificLiveEvent(liveEventId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveEssentialsApi#deleteSpecificLiveEvent");
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

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | The event was deleted. |  -  |

<a name="getAllUserLiveEvents"></a>
# **getAllUserLiveEvents**
> List&lt;LiveEvent&gt; getAllUserLiveEvents().direction(direction).filter(filter).page(page).perPage(perPage).query(query).sort(sort).type(type).execute();

Get all the live events that belong to the user

The method returns every event belonging to the authenticated user.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LiveEssentialsApi;
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
    String direction = "asc"; // The sort direction of the results.  Option descriptions:  * `asc` - Sort the results in ascending order.  * `desc` - Sort the results in descending order. 
    String filter = "not_in_folder"; // The attribute by which to filter the results.  Option descriptions:  * `not_in_folder` - Show only events that aren't in a folder.  * `not_in_showcase` - Show only events that aren't in a showcase.  * `not_in_webinar` - Show only events that aren't in a webinar. 
    Double page = 1D; // The page number of the results to show.
    Double perPage = 10D; // The number of items to show on each page of results, up to a maximum of 100.
    String query = "Stop motion"; // The search query to use to filter the results.
    String sort = "alphabetical"; // The way to sort the results.  Option descriptions:  * `alphabetical` - Sort the results alphabetically.  * `date` - Sort the results by creation date. 
    String type = "all"; // The type of event to return.  Option descriptions:  * `all` - Return all events.  * `one_time` - Return one-time events only.  * `recurring` - Return recurring events only. 
    try {
      List<LiveEvent> result = client
              .liveEssentials
              .getAllUserLiveEvents()
              .direction(direction)
              .filter(filter)
              .page(page)
              .perPage(perPage)
              .query(query)
              .sort(sort)
              .type(type)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveEssentialsApi#getAllUserLiveEvents");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<LiveEvent>> response = client
              .liveEssentials
              .getAllUserLiveEvents()
              .direction(direction)
              .filter(filter)
              .page(page)
              .perPage(perPage)
              .query(query)
              .sort(sort)
              .type(type)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveEssentialsApi#getAllUserLiveEvents");
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
| **direction** | **String**| The sort direction of the results.  Option descriptions:  * &#x60;asc&#x60; - Sort the results in ascending order.  * &#x60;desc&#x60; - Sort the results in descending order.  | [optional] [enum: asc, desc] |
| **filter** | **String**| The attribute by which to filter the results.  Option descriptions:  * &#x60;not_in_folder&#x60; - Show only events that aren&#39;t in a folder.  * &#x60;not_in_showcase&#x60; - Show only events that aren&#39;t in a showcase.  * &#x60;not_in_webinar&#x60; - Show only events that aren&#39;t in a webinar.  | [optional] [enum: not_in_folder, not_in_showcase, not_in_webinar] |
| **page** | **Double**| The page number of the results to show. | [optional] |
| **perPage** | **Double**| The number of items to show on each page of results, up to a maximum of 100. | [optional] |
| **query** | **String**| The search query to use to filter the results. | [optional] |
| **sort** | **String**| The way to sort the results.  Option descriptions:  * &#x60;alphabetical&#x60; - Sort the results alphabetically.  * &#x60;date&#x60; - Sort the results by creation date.  | [optional] [enum: alphabetical, date] |
| **type** | **String**| The type of event to return.  Option descriptions:  * &#x60;all&#x60; - Return all events.  * &#x60;one_time&#x60; - Return one-time events only.  * &#x60;recurring&#x60; - Return recurring events only.  | [optional] [enum: all, one_time, recurring] |

### Return type

[**List&lt;LiveEvent&gt;**](LiveEvent.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.vimeo.live.event+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The events were returned. |  -  |

<a name="getEventById"></a>
# **getEventById**
> LiveEventRecurring getEventById(liveEventId).password(password).execute();

Get a specific live event

This method returns a single event belonging to the authenticated user.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LiveEssentialsApi;
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
    String password = "password_example"; // The password of the event when the privacy is set to `password`.
    try {
      LiveEventRecurring result = client
              .liveEssentials
              .getEventById(liveEventId)
              .password(password)
              .execute();
      System.out.println(result);
      System.out.println(result.getTitle());
      System.out.println(result.getAlbum());
      System.out.println(result.getAllowShareLink());
      System.out.println(result.getAllowedPrivacies());
      System.out.println(result.getAutoCcEnabled());
      System.out.println(result.getAutoCcKeywords());
      System.out.println(result.getAutoCcLanguage());
      System.out.println(result.getAutoCcRemaining());
      System.out.println(result.getAutomaticallyTitleStream());
      System.out.println(result.getChatEnabled());
      System.out.println(result.getCompletedOn());
      System.out.println(result.getContentRating());
      System.out.println(result.getCreatedTime());
      System.out.println(result.getDvr());
      System.out.println(result.getEmailQuota());
      System.out.println(result.getEmbed());
      System.out.println(result.getFromShowcase());
      System.out.println(result.getFromWebinar());
      System.out.println(result.getHeadClip());
      System.out.println(result.getInteractionToolsSettings());
      System.out.println(result.getLatency());
      System.out.println(result.getLeadUuid());
      System.out.println(result.getLink());
      System.out.println(result.getLiveClips());
      System.out.println(result.getLiveDestinations());
      System.out.println(result.getLowLatency());
      System.out.println(result.getMetadata());
      System.out.println(result.getNextOccurrenceTime());
      System.out.println(result.getParentFolder());
      System.out.println(result.getPictures());
      System.out.println(result.getPlaylistSort());
      System.out.println(result.getPreferredStreamMethod());
      System.out.println(result.getRtmpLink());
      System.out.println(result.getRtmpPreview());
      System.out.println(result.getRtmpsLink());
      System.out.println(result.getSchedule());
      System.out.println(result.getScheduledPlayback());
      System.out.println(result.getStatus());
      System.out.println(result.getStreamDescription());
      System.out.println(result.getStreamKey());
      System.out.println(result.getStreamMode());
      System.out.println(result.getStreamPassword());
      System.out.println(result.getStreamPrivacy());
      System.out.println(result.getStreamTitle());
      System.out.println(result.getStreamableClip());
      System.out.println(result.getTimeZone());
      System.out.println(result.getUnlimitedAutoCc());
      System.out.println(result.getUnlimitedDuration());
      System.out.println(result.getUri());
      System.out.println(result.getUser());
      System.out.println(result.getViewLink());
      System.out.println(result.getWebinar());
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveEssentialsApi#getEventById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<LiveEventRecurring> response = client
              .liveEssentials
              .getEventById(liveEventId)
              .password(password)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveEssentialsApi#getEventById");
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
| **password** | **String**| The password of the event when the privacy is set to &#x60;password&#x60;. | [optional] |

### Return type

[**LiveEventRecurring**](LiveEventRecurring.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.vimeo.live.event.recurring+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The event was returned. |  -  |

<a name="getEventById_0"></a>
# **getEventById_0**
> LiveEventRecurring getEventById_0(liveEventId, userId).password(password).execute();

Get a specific live event

This method returns a single event belonging to the authenticated user.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LiveEssentialsApi;
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
    String password = "password_example"; // The password of the event when the privacy is set to `password`.
    try {
      LiveEventRecurring result = client
              .liveEssentials
              .getEventById_0(liveEventId, userId)
              .password(password)
              .execute();
      System.out.println(result);
      System.out.println(result.getTitle());
      System.out.println(result.getAlbum());
      System.out.println(result.getAllowShareLink());
      System.out.println(result.getAllowedPrivacies());
      System.out.println(result.getAutoCcEnabled());
      System.out.println(result.getAutoCcKeywords());
      System.out.println(result.getAutoCcLanguage());
      System.out.println(result.getAutoCcRemaining());
      System.out.println(result.getAutomaticallyTitleStream());
      System.out.println(result.getChatEnabled());
      System.out.println(result.getCompletedOn());
      System.out.println(result.getContentRating());
      System.out.println(result.getCreatedTime());
      System.out.println(result.getDvr());
      System.out.println(result.getEmailQuota());
      System.out.println(result.getEmbed());
      System.out.println(result.getFromShowcase());
      System.out.println(result.getFromWebinar());
      System.out.println(result.getHeadClip());
      System.out.println(result.getInteractionToolsSettings());
      System.out.println(result.getLatency());
      System.out.println(result.getLeadUuid());
      System.out.println(result.getLink());
      System.out.println(result.getLiveClips());
      System.out.println(result.getLiveDestinations());
      System.out.println(result.getLowLatency());
      System.out.println(result.getMetadata());
      System.out.println(result.getNextOccurrenceTime());
      System.out.println(result.getParentFolder());
      System.out.println(result.getPictures());
      System.out.println(result.getPlaylistSort());
      System.out.println(result.getPreferredStreamMethod());
      System.out.println(result.getRtmpLink());
      System.out.println(result.getRtmpPreview());
      System.out.println(result.getRtmpsLink());
      System.out.println(result.getSchedule());
      System.out.println(result.getScheduledPlayback());
      System.out.println(result.getStatus());
      System.out.println(result.getStreamDescription());
      System.out.println(result.getStreamKey());
      System.out.println(result.getStreamMode());
      System.out.println(result.getStreamPassword());
      System.out.println(result.getStreamPrivacy());
      System.out.println(result.getStreamTitle());
      System.out.println(result.getStreamableClip());
      System.out.println(result.getTimeZone());
      System.out.println(result.getUnlimitedAutoCc());
      System.out.println(result.getUnlimitedDuration());
      System.out.println(result.getUri());
      System.out.println(result.getUser());
      System.out.println(result.getViewLink());
      System.out.println(result.getWebinar());
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveEssentialsApi#getEventById_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<LiveEventRecurring> response = client
              .liveEssentials
              .getEventById_0(liveEventId, userId)
              .password(password)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveEssentialsApi#getEventById_0");
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
| **password** | **String**| The password of the event when the privacy is set to &#x60;password&#x60;. | [optional] |

### Return type

[**LiveEventRecurring**](LiveEventRecurring.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.vimeo.live.event.recurring+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The event was returned. |  -  |

<a name="getSpecificLiveEvent"></a>
# **getSpecificLiveEvent**
> LiveEventRecurring getSpecificLiveEvent(liveEventId).password(password).execute();

Get a specific live event

This method returns a single event belonging to the authenticated user.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LiveEssentialsApi;
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
    String password = "password_example"; // The password of the event when the privacy is set to `password`.
    try {
      LiveEventRecurring result = client
              .liveEssentials
              .getSpecificLiveEvent(liveEventId)
              .password(password)
              .execute();
      System.out.println(result);
      System.out.println(result.getTitle());
      System.out.println(result.getAlbum());
      System.out.println(result.getAllowShareLink());
      System.out.println(result.getAllowedPrivacies());
      System.out.println(result.getAutoCcEnabled());
      System.out.println(result.getAutoCcKeywords());
      System.out.println(result.getAutoCcLanguage());
      System.out.println(result.getAutoCcRemaining());
      System.out.println(result.getAutomaticallyTitleStream());
      System.out.println(result.getChatEnabled());
      System.out.println(result.getCompletedOn());
      System.out.println(result.getContentRating());
      System.out.println(result.getCreatedTime());
      System.out.println(result.getDvr());
      System.out.println(result.getEmailQuota());
      System.out.println(result.getEmbed());
      System.out.println(result.getFromShowcase());
      System.out.println(result.getFromWebinar());
      System.out.println(result.getHeadClip());
      System.out.println(result.getInteractionToolsSettings());
      System.out.println(result.getLatency());
      System.out.println(result.getLeadUuid());
      System.out.println(result.getLink());
      System.out.println(result.getLiveClips());
      System.out.println(result.getLiveDestinations());
      System.out.println(result.getLowLatency());
      System.out.println(result.getMetadata());
      System.out.println(result.getNextOccurrenceTime());
      System.out.println(result.getParentFolder());
      System.out.println(result.getPictures());
      System.out.println(result.getPlaylistSort());
      System.out.println(result.getPreferredStreamMethod());
      System.out.println(result.getRtmpLink());
      System.out.println(result.getRtmpPreview());
      System.out.println(result.getRtmpsLink());
      System.out.println(result.getSchedule());
      System.out.println(result.getScheduledPlayback());
      System.out.println(result.getStatus());
      System.out.println(result.getStreamDescription());
      System.out.println(result.getStreamKey());
      System.out.println(result.getStreamMode());
      System.out.println(result.getStreamPassword());
      System.out.println(result.getStreamPrivacy());
      System.out.println(result.getStreamTitle());
      System.out.println(result.getStreamableClip());
      System.out.println(result.getTimeZone());
      System.out.println(result.getUnlimitedAutoCc());
      System.out.println(result.getUnlimitedDuration());
      System.out.println(result.getUri());
      System.out.println(result.getUser());
      System.out.println(result.getViewLink());
      System.out.println(result.getWebinar());
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveEssentialsApi#getSpecificLiveEvent");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<LiveEventRecurring> response = client
              .liveEssentials
              .getSpecificLiveEvent(liveEventId)
              .password(password)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveEssentialsApi#getSpecificLiveEvent");
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
| **password** | **String**| The password of the event when the privacy is set to &#x60;password&#x60;. | [optional] |

### Return type

[**LiveEventRecurring**](LiveEventRecurring.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.vimeo.live.event.recurring+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The event was returned. |  -  |

<a name="getUserLiveEvents"></a>
# **getUserLiveEvents**
> List&lt;LiveEvent&gt; getUserLiveEvents().direction(direction).filter(filter).page(page).perPage(perPage).query(query).sort(sort).type(type).execute();

Get all the live events that belong to the user

The method returns every event belonging to the authenticated user.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LiveEssentialsApi;
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
    String direction = "asc"; // The sort direction of the results.  Option descriptions:  * `asc` - Sort the results in ascending order.  * `desc` - Sort the results in descending order. 
    String filter = "not_in_folder"; // The attribute by which to filter the results.  Option descriptions:  * `not_in_folder` - Show only events that aren't in a folder.  * `not_in_showcase` - Show only events that aren't in a showcase.  * `not_in_webinar` - Show only events that aren't in a webinar. 
    Double page = 1D; // The page number of the results to show.
    Double perPage = 10D; // The number of items to show on each page of results, up to a maximum of 100.
    String query = "Stop motion"; // The search query to use to filter the results.
    String sort = "alphabetical"; // The way to sort the results.  Option descriptions:  * `alphabetical` - Sort the results alphabetically.  * `date` - Sort the results by creation date. 
    String type = "all"; // The type of event to return.  Option descriptions:  * `all` - Return all events.  * `one_time` - Return one-time events only.  * `recurring` - Return recurring events only. 
    try {
      List<LiveEvent> result = client
              .liveEssentials
              .getUserLiveEvents()
              .direction(direction)
              .filter(filter)
              .page(page)
              .perPage(perPage)
              .query(query)
              .sort(sort)
              .type(type)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveEssentialsApi#getUserLiveEvents");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<LiveEvent>> response = client
              .liveEssentials
              .getUserLiveEvents()
              .direction(direction)
              .filter(filter)
              .page(page)
              .perPage(perPage)
              .query(query)
              .sort(sort)
              .type(type)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveEssentialsApi#getUserLiveEvents");
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
| **direction** | **String**| The sort direction of the results.  Option descriptions:  * &#x60;asc&#x60; - Sort the results in ascending order.  * &#x60;desc&#x60; - Sort the results in descending order.  | [optional] [enum: asc, desc] |
| **filter** | **String**| The attribute by which to filter the results.  Option descriptions:  * &#x60;not_in_folder&#x60; - Show only events that aren&#39;t in a folder.  * &#x60;not_in_showcase&#x60; - Show only events that aren&#39;t in a showcase.  * &#x60;not_in_webinar&#x60; - Show only events that aren&#39;t in a webinar.  | [optional] [enum: not_in_folder, not_in_showcase, not_in_webinar] |
| **page** | **Double**| The page number of the results to show. | [optional] |
| **perPage** | **Double**| The number of items to show on each page of results, up to a maximum of 100. | [optional] |
| **query** | **String**| The search query to use to filter the results. | [optional] |
| **sort** | **String**| The way to sort the results.  Option descriptions:  * &#x60;alphabetical&#x60; - Sort the results alphabetically.  * &#x60;date&#x60; - Sort the results by creation date.  | [optional] [enum: alphabetical, date] |
| **type** | **String**| The type of event to return.  Option descriptions:  * &#x60;all&#x60; - Return all events.  * &#x60;one_time&#x60; - Return one-time events only.  * &#x60;recurring&#x60; - Return recurring events only.  | [optional] [enum: all, one_time, recurring] |

### Return type

[**List&lt;LiveEvent&gt;**](LiveEvent.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.vimeo.live.event+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The events were returned. |  -  |

<a name="getUserLiveEvents_0"></a>
# **getUserLiveEvents_0**
> List&lt;LiveEvent&gt; getUserLiveEvents_0(userId).direction(direction).filter(filter).page(page).perPage(perPage).query(query).sort(sort).type(type).execute();

Get all the live events that belong to the user

The method returns every event belonging to the authenticated user.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LiveEssentialsApi;
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
    String direction = "asc"; // The sort direction of the results.  Option descriptions:  * `asc` - Sort the results in ascending order.  * `desc` - Sort the results in descending order. 
    String filter = "not_in_folder"; // The attribute by which to filter the results.  Option descriptions:  * `not_in_folder` - Show only events that aren't in a folder.  * `not_in_showcase` - Show only events that aren't in a showcase.  * `not_in_webinar` - Show only events that aren't in a webinar. 
    Double page = 1D; // The page number of the results to show.
    Double perPage = 10D; // The number of items to show on each page of results, up to a maximum of 100.
    String query = "Stop motion"; // The search query to use to filter the results.
    String sort = "alphabetical"; // The way to sort the results.  Option descriptions:  * `alphabetical` - Sort the results alphabetically.  * `date` - Sort the results by creation date. 
    String type = "all"; // The type of event to return.  Option descriptions:  * `all` - Return all events.  * `one_time` - Return one-time events only.  * `recurring` - Return recurring events only. 
    try {
      List<LiveEvent> result = client
              .liveEssentials
              .getUserLiveEvents_0(userId)
              .direction(direction)
              .filter(filter)
              .page(page)
              .perPage(perPage)
              .query(query)
              .sort(sort)
              .type(type)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveEssentialsApi#getUserLiveEvents_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<LiveEvent>> response = client
              .liveEssentials
              .getUserLiveEvents_0(userId)
              .direction(direction)
              .filter(filter)
              .page(page)
              .perPage(perPage)
              .query(query)
              .sort(sort)
              .type(type)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveEssentialsApi#getUserLiveEvents_0");
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
| **direction** | **String**| The sort direction of the results.  Option descriptions:  * &#x60;asc&#x60; - Sort the results in ascending order.  * &#x60;desc&#x60; - Sort the results in descending order.  | [optional] [enum: asc, desc] |
| **filter** | **String**| The attribute by which to filter the results.  Option descriptions:  * &#x60;not_in_folder&#x60; - Show only events that aren&#39;t in a folder.  * &#x60;not_in_showcase&#x60; - Show only events that aren&#39;t in a showcase.  * &#x60;not_in_webinar&#x60; - Show only events that aren&#39;t in a webinar.  | [optional] [enum: not_in_folder, not_in_showcase, not_in_webinar] |
| **page** | **Double**| The page number of the results to show. | [optional] |
| **perPage** | **Double**| The number of items to show on each page of results, up to a maximum of 100. | [optional] |
| **query** | **String**| The search query to use to filter the results. | [optional] |
| **sort** | **String**| The way to sort the results.  Option descriptions:  * &#x60;alphabetical&#x60; - Sort the results alphabetically.  * &#x60;date&#x60; - Sort the results by creation date.  | [optional] [enum: alphabetical, date] |
| **type** | **String**| The type of event to return.  Option descriptions:  * &#x60;all&#x60; - Return all events.  * &#x60;one_time&#x60; - Return one-time events only.  * &#x60;recurring&#x60; - Return recurring events only.  | [optional] [enum: all, one_time, recurring] |

### Return type

[**List&lt;LiveEvent&gt;**](LiveEvent.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.vimeo.live.event+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The events were returned. |  -  |

<a name="updateEventBelongingToAuthenticatedUser"></a>
# **updateEventBelongingToAuthenticatedUser**
> LiveEventRecurring updateEventBelongingToAuthenticatedUser(liveEventId).liveEssentialsUpdateEventBelongingToAuthenticatedUserRequest(liveEssentialsUpdateEventBelongingToAuthenticatedUserRequest).execute();

Update a live event

This method updates an event belonging to the authenticated user.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LiveEssentialsApi;
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
    String title = "title_example"; // The title of the event. If **automatically_title_stream** is `true`, this value is the base title for videos created by streaming to this event.
    Boolean autoCcEnabled = true; // Whether automated closed captions are enabled for the event.
    String autoCcKeywords = "autoCcKeywords_example"; // A comma-separated list of keywords for enhancing the speech detection of automated closed captions.
    String autoCcLanguage = "de-DE"; // The language of the automated closed captions.  Option descriptions:  * `de-DE` - The language is German.  * `en-US` - The language is English.  * `es-ES` - The language is Spanish.  * `fr-FR` - The language is French.  * `pt-BR` - The language is Portuguese. 
    Boolean automaticallyTitleStream = true; // Whether the title for the next video in the event is generated based on the time of the stream and the **title** field of the event.
    Boolean chatEnabled = true; // Whether to display the live chat client on the Vimeo event page.
    List<String> contentRating = Arrays.asList(); // A list of values describing the content in this event. To return the list of all possible content rating values, use the [`/contentratings`](https://developer.vimeo.com/api/reference/videos#get_content_ratings) endpoint.
    Boolean dvr = true; // Whether the DVR feature is enabled.
    LiveEssentialsUpdateEventBelongingToAuthenticatedUserRequestEmbed embed = new LiveEssentialsUpdateEventBelongingToAuthenticatedUserRequestEmbed();
    LiveEssentialsUpdateEventBelongingToAuthenticatedUserRequestInteractionToolsSettings interactionToolsSettings = new LiveEssentialsUpdateEventBelongingToAuthenticatedUserRequestInteractionToolsSettings();
    String playlistSort = "added_first"; // The order in which the videos of the event appear within the event's playlist.  Option descriptions:  * `added_first` - The most recently added videos appear first.  * `added_last` - The most recently added videos appear last.  * `alphabetical` - The videos appear in alphabetical order.  * `arranged` - The videos appear in the order in which the user has arranged them.  * `comments` - The videos appear in order of number of comments.  * `duration` - The videos appear in order of duration.  * `likes` - The videos appear in order of number of likes.  * `newest` - The newest videos appear first.  * `oldest` - The oldest videos appear first.  * `plays` - The videos appear in order of number of plays. 
    LiveEssentialsUpdateEventBelongingToAuthenticatedUserRequestSchedule schedule = new LiveEssentialsUpdateEventBelongingToAuthenticatedUserRequestSchedule();
    Boolean scheduledPlayback = true; // Whether the scheduled playback feature is enabled.
    String streamDescription = "streamDescription_example"; // The description of the next video to be streamed to the event.
    LiveEssentialsUpdateEventBelongingToAuthenticatedUserRequestStreamEmbed streamEmbed = new LiveEssentialsUpdateEventBelongingToAuthenticatedUserRequestStreamEmbed();
    String streamMode = "live"; // The stream mode of the event.  Option descriptions:  * `live` - The stream is live playback.  * `record` - The stream is in record mode.  * `simulive` - The stream is scheduled media playback. 
    String streamPassword = "streamPassword_example"; // The password when **stream_privacy.view** is `password`. Anyone with the password can view the videos generated by streaming to the event.
    LiveEssentialsUpdateEventBelongingToAuthenticatedUserRequestStreamPrivacy streamPrivacy = new LiveEssentialsUpdateEventBelongingToAuthenticatedUserRequestStreamPrivacy();
    String streamTitle = "streamTitle_example"; // The title of the next video to be streamed to the event. This parameter is required when **automatically_title_stream** is `false`.
    String timeZone = "timeZone_example"; // The time zone used in resolving the timestamps that are included in automatically generated video titles.
    try {
      LiveEventRecurring result = client
              .liveEssentials
              .updateEventBelongingToAuthenticatedUser(liveEventId)
              .title(title)
              .autoCcEnabled(autoCcEnabled)
              .autoCcKeywords(autoCcKeywords)
              .autoCcLanguage(autoCcLanguage)
              .automaticallyTitleStream(automaticallyTitleStream)
              .chatEnabled(chatEnabled)
              .contentRating(contentRating)
              .dvr(dvr)
              .embed(embed)
              .interactionToolsSettings(interactionToolsSettings)
              .playlistSort(playlistSort)
              .schedule(schedule)
              .scheduledPlayback(scheduledPlayback)
              .streamDescription(streamDescription)
              .streamEmbed(streamEmbed)
              .streamMode(streamMode)
              .streamPassword(streamPassword)
              .streamPrivacy(streamPrivacy)
              .streamTitle(streamTitle)
              .timeZone(timeZone)
              .execute();
      System.out.println(result);
      System.out.println(result.getTitle());
      System.out.println(result.getAlbum());
      System.out.println(result.getAllowShareLink());
      System.out.println(result.getAllowedPrivacies());
      System.out.println(result.getAutoCcEnabled());
      System.out.println(result.getAutoCcKeywords());
      System.out.println(result.getAutoCcLanguage());
      System.out.println(result.getAutoCcRemaining());
      System.out.println(result.getAutomaticallyTitleStream());
      System.out.println(result.getChatEnabled());
      System.out.println(result.getCompletedOn());
      System.out.println(result.getContentRating());
      System.out.println(result.getCreatedTime());
      System.out.println(result.getDvr());
      System.out.println(result.getEmailQuota());
      System.out.println(result.getEmbed());
      System.out.println(result.getFromShowcase());
      System.out.println(result.getFromWebinar());
      System.out.println(result.getHeadClip());
      System.out.println(result.getInteractionToolsSettings());
      System.out.println(result.getLatency());
      System.out.println(result.getLeadUuid());
      System.out.println(result.getLink());
      System.out.println(result.getLiveClips());
      System.out.println(result.getLiveDestinations());
      System.out.println(result.getLowLatency());
      System.out.println(result.getMetadata());
      System.out.println(result.getNextOccurrenceTime());
      System.out.println(result.getParentFolder());
      System.out.println(result.getPictures());
      System.out.println(result.getPlaylistSort());
      System.out.println(result.getPreferredStreamMethod());
      System.out.println(result.getRtmpLink());
      System.out.println(result.getRtmpPreview());
      System.out.println(result.getRtmpsLink());
      System.out.println(result.getSchedule());
      System.out.println(result.getScheduledPlayback());
      System.out.println(result.getStatus());
      System.out.println(result.getStreamDescription());
      System.out.println(result.getStreamKey());
      System.out.println(result.getStreamMode());
      System.out.println(result.getStreamPassword());
      System.out.println(result.getStreamPrivacy());
      System.out.println(result.getStreamTitle());
      System.out.println(result.getStreamableClip());
      System.out.println(result.getTimeZone());
      System.out.println(result.getUnlimitedAutoCc());
      System.out.println(result.getUnlimitedDuration());
      System.out.println(result.getUri());
      System.out.println(result.getUser());
      System.out.println(result.getViewLink());
      System.out.println(result.getWebinar());
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveEssentialsApi#updateEventBelongingToAuthenticatedUser");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<LiveEventRecurring> response = client
              .liveEssentials
              .updateEventBelongingToAuthenticatedUser(liveEventId)
              .title(title)
              .autoCcEnabled(autoCcEnabled)
              .autoCcKeywords(autoCcKeywords)
              .autoCcLanguage(autoCcLanguage)
              .automaticallyTitleStream(automaticallyTitleStream)
              .chatEnabled(chatEnabled)
              .contentRating(contentRating)
              .dvr(dvr)
              .embed(embed)
              .interactionToolsSettings(interactionToolsSettings)
              .playlistSort(playlistSort)
              .schedule(schedule)
              .scheduledPlayback(scheduledPlayback)
              .streamDescription(streamDescription)
              .streamEmbed(streamEmbed)
              .streamMode(streamMode)
              .streamPassword(streamPassword)
              .streamPrivacy(streamPrivacy)
              .streamTitle(streamTitle)
              .timeZone(timeZone)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveEssentialsApi#updateEventBelongingToAuthenticatedUser");
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
| **liveEssentialsUpdateEventBelongingToAuthenticatedUserRequest** | [**LiveEssentialsUpdateEventBelongingToAuthenticatedUserRequest**](LiveEssentialsUpdateEventBelongingToAuthenticatedUserRequest.md)|  | [optional] |

### Return type

[**LiveEventRecurring**](LiveEventRecurring.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/vnd.vimeo.live.event.recurring+json
 - **Accept**: application/vnd.vimeo.live.event.recurring+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The event was updated. |  -  |

<a name="updateEventBelongingToAuthenticatedUser_0"></a>
# **updateEventBelongingToAuthenticatedUser_0**
> LiveEventRecurring updateEventBelongingToAuthenticatedUser_0(liveEventId).liveEssentialsUpdateEventBelongingToAuthenticatedUserRequest1(liveEssentialsUpdateEventBelongingToAuthenticatedUserRequest1).execute();

Update a live event

This method updates an event belonging to the authenticated user.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LiveEssentialsApi;
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
    String title = "title_example"; // The title of the event. If **automatically_title_stream** is `true`, this value is the base title for videos created by streaming to this event.
    Boolean autoCcEnabled = true; // Whether automated closed captions are enabled for the event.
    String autoCcKeywords = "autoCcKeywords_example"; // A comma-separated list of keywords for enhancing the speech detection of automated closed captions.
    String autoCcLanguage = "de-DE"; // The language of the automated closed captions.  Option descriptions:  * `de-DE` - The language is German.  * `en-US` - The language is English.  * `es-ES` - The language is Spanish.  * `fr-FR` - The language is French.  * `pt-BR` - The language is Portuguese. 
    Boolean automaticallyTitleStream = true; // Whether the title for the next video in the event is generated based on the time of the stream and the **title** field of the event.
    Boolean chatEnabled = true; // Whether to display the live chat client on the Vimeo event page.
    List<String> contentRating = Arrays.asList(); // A list of values describing the content in this event. To return the list of all possible content rating values, use the [`/contentratings`](https://developer.vimeo.com/api/reference/videos#get_content_ratings) endpoint.
    Boolean dvr = true; // Whether the DVR feature is enabled.
    LiveEssentialsUpdateEventBelongingToAuthenticatedUserRequest1Embed embed = new LiveEssentialsUpdateEventBelongingToAuthenticatedUserRequest1Embed();
    LiveEssentialsUpdateEventBelongingToAuthenticatedUserRequest1InteractionToolsSettings interactionToolsSettings = new LiveEssentialsUpdateEventBelongingToAuthenticatedUserRequest1InteractionToolsSettings();
    String playlistSort = "added_first"; // The order in which the videos of the event appear within the event's playlist.  Option descriptions:  * `added_first` - The most recently added videos appear first.  * `added_last` - The most recently added videos appear last.  * `alphabetical` - The videos appear in alphabetical order.  * `arranged` - The videos appear in the order in which the user has arranged them.  * `comments` - The videos appear in order of number of comments.  * `duration` - The videos appear in order of duration.  * `likes` - The videos appear in order of number of likes.  * `newest` - The newest videos appear first.  * `oldest` - The oldest videos appear first.  * `plays` - The videos appear in order of number of plays. 
    LiveEssentialsUpdateEventBelongingToAuthenticatedUserRequest1Schedule schedule = new LiveEssentialsUpdateEventBelongingToAuthenticatedUserRequest1Schedule();
    Boolean scheduledPlayback = true; // Whether the scheduled playback feature is enabled.
    String streamDescription = "streamDescription_example"; // The description of the next video to be streamed to the event.
    LiveEssentialsUpdateEventBelongingToAuthenticatedUserRequest1StreamEmbed streamEmbed = new LiveEssentialsUpdateEventBelongingToAuthenticatedUserRequest1StreamEmbed();
    String streamMode = "live"; // The stream mode of the event.  Option descriptions:  * `live` - The stream is live playback.  * `record` - The stream is in record mode.  * `simulive` - The stream is scheduled media playback. 
    String streamPassword = "streamPassword_example"; // The password when **stream_privacy.view** is `password`. Anyone with the password can view the videos generated by streaming to the event.
    LiveEssentialsUpdateEventBelongingToAuthenticatedUserRequest1StreamPrivacy streamPrivacy = new LiveEssentialsUpdateEventBelongingToAuthenticatedUserRequest1StreamPrivacy();
    String streamTitle = "streamTitle_example"; // The title of the next video to be streamed to the event. This parameter is required when **automatically_title_stream** is `false`.
    String timeZone = "timeZone_example"; // The time zone used in resolving the timestamps that are included in automatically generated video titles.
    try {
      LiveEventRecurring result = client
              .liveEssentials
              .updateEventBelongingToAuthenticatedUser_0(liveEventId)
              .title(title)
              .autoCcEnabled(autoCcEnabled)
              .autoCcKeywords(autoCcKeywords)
              .autoCcLanguage(autoCcLanguage)
              .automaticallyTitleStream(automaticallyTitleStream)
              .chatEnabled(chatEnabled)
              .contentRating(contentRating)
              .dvr(dvr)
              .embed(embed)
              .interactionToolsSettings(interactionToolsSettings)
              .playlistSort(playlistSort)
              .schedule(schedule)
              .scheduledPlayback(scheduledPlayback)
              .streamDescription(streamDescription)
              .streamEmbed(streamEmbed)
              .streamMode(streamMode)
              .streamPassword(streamPassword)
              .streamPrivacy(streamPrivacy)
              .streamTitle(streamTitle)
              .timeZone(timeZone)
              .execute();
      System.out.println(result);
      System.out.println(result.getTitle());
      System.out.println(result.getAlbum());
      System.out.println(result.getAllowShareLink());
      System.out.println(result.getAllowedPrivacies());
      System.out.println(result.getAutoCcEnabled());
      System.out.println(result.getAutoCcKeywords());
      System.out.println(result.getAutoCcLanguage());
      System.out.println(result.getAutoCcRemaining());
      System.out.println(result.getAutomaticallyTitleStream());
      System.out.println(result.getChatEnabled());
      System.out.println(result.getCompletedOn());
      System.out.println(result.getContentRating());
      System.out.println(result.getCreatedTime());
      System.out.println(result.getDvr());
      System.out.println(result.getEmailQuota());
      System.out.println(result.getEmbed());
      System.out.println(result.getFromShowcase());
      System.out.println(result.getFromWebinar());
      System.out.println(result.getHeadClip());
      System.out.println(result.getInteractionToolsSettings());
      System.out.println(result.getLatency());
      System.out.println(result.getLeadUuid());
      System.out.println(result.getLink());
      System.out.println(result.getLiveClips());
      System.out.println(result.getLiveDestinations());
      System.out.println(result.getLowLatency());
      System.out.println(result.getMetadata());
      System.out.println(result.getNextOccurrenceTime());
      System.out.println(result.getParentFolder());
      System.out.println(result.getPictures());
      System.out.println(result.getPlaylistSort());
      System.out.println(result.getPreferredStreamMethod());
      System.out.println(result.getRtmpLink());
      System.out.println(result.getRtmpPreview());
      System.out.println(result.getRtmpsLink());
      System.out.println(result.getSchedule());
      System.out.println(result.getScheduledPlayback());
      System.out.println(result.getStatus());
      System.out.println(result.getStreamDescription());
      System.out.println(result.getStreamKey());
      System.out.println(result.getStreamMode());
      System.out.println(result.getStreamPassword());
      System.out.println(result.getStreamPrivacy());
      System.out.println(result.getStreamTitle());
      System.out.println(result.getStreamableClip());
      System.out.println(result.getTimeZone());
      System.out.println(result.getUnlimitedAutoCc());
      System.out.println(result.getUnlimitedDuration());
      System.out.println(result.getUri());
      System.out.println(result.getUser());
      System.out.println(result.getViewLink());
      System.out.println(result.getWebinar());
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveEssentialsApi#updateEventBelongingToAuthenticatedUser_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<LiveEventRecurring> response = client
              .liveEssentials
              .updateEventBelongingToAuthenticatedUser_0(liveEventId)
              .title(title)
              .autoCcEnabled(autoCcEnabled)
              .autoCcKeywords(autoCcKeywords)
              .autoCcLanguage(autoCcLanguage)
              .automaticallyTitleStream(automaticallyTitleStream)
              .chatEnabled(chatEnabled)
              .contentRating(contentRating)
              .dvr(dvr)
              .embed(embed)
              .interactionToolsSettings(interactionToolsSettings)
              .playlistSort(playlistSort)
              .schedule(schedule)
              .scheduledPlayback(scheduledPlayback)
              .streamDescription(streamDescription)
              .streamEmbed(streamEmbed)
              .streamMode(streamMode)
              .streamPassword(streamPassword)
              .streamPrivacy(streamPrivacy)
              .streamTitle(streamTitle)
              .timeZone(timeZone)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveEssentialsApi#updateEventBelongingToAuthenticatedUser_0");
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
| **liveEssentialsUpdateEventBelongingToAuthenticatedUserRequest1** | [**LiveEssentialsUpdateEventBelongingToAuthenticatedUserRequest1**](LiveEssentialsUpdateEventBelongingToAuthenticatedUserRequest1.md)|  | [optional] |

### Return type

[**LiveEventRecurring**](LiveEventRecurring.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/vnd.vimeo.live.event.recurring+json
 - **Accept**: application/vnd.vimeo.live.event.recurring+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The event was updated. |  -  |

<a name="updateEventBelongingToAuthenticatedUser_1"></a>
# **updateEventBelongingToAuthenticatedUser_1**
> LiveEventRecurring updateEventBelongingToAuthenticatedUser_1(liveEventId, userId).liveEssentialsUpdateEventBelongingToAuthenticatedUserRequest2(liveEssentialsUpdateEventBelongingToAuthenticatedUserRequest2).execute();

Update a live event

This method updates an event belonging to the authenticated user.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LiveEssentialsApi;
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
    String title = "title_example"; // The title of the event. If **automatically_title_stream** is `true`, this value is the base title for videos created by streaming to this event.
    Boolean autoCcEnabled = true; // Whether automated closed captions are enabled for the event.
    String autoCcKeywords = "autoCcKeywords_example"; // A comma-separated list of keywords for enhancing the speech detection of automated closed captions.
    String autoCcLanguage = "de-DE"; // The language of the automated closed captions.  Option descriptions:  * `de-DE` - The language is German.  * `en-US` - The language is English.  * `es-ES` - The language is Spanish.  * `fr-FR` - The language is French.  * `pt-BR` - The language is Portuguese. 
    Boolean automaticallyTitleStream = true; // Whether the title for the next video in the event is generated based on the time of the stream and the **title** field of the event.
    Boolean chatEnabled = true; // Whether to display the live chat client on the Vimeo event page.
    List<String> contentRating = Arrays.asList(); // A list of values describing the content in this event. To return the list of all possible content rating values, use the [`/contentratings`](https://developer.vimeo.com/api/reference/videos#get_content_ratings) endpoint.
    Boolean dvr = true; // Whether the DVR feature is enabled.
    LiveEssentialsUpdateEventBelongingToAuthenticatedUserRequest2Embed embed = new LiveEssentialsUpdateEventBelongingToAuthenticatedUserRequest2Embed();
    LiveEssentialsUpdateEventBelongingToAuthenticatedUserRequest2InteractionToolsSettings interactionToolsSettings = new LiveEssentialsUpdateEventBelongingToAuthenticatedUserRequest2InteractionToolsSettings();
    String playlistSort = "added_first"; // The order in which the videos of the event appear within the event's playlist.  Option descriptions:  * `added_first` - The most recently added videos appear first.  * `added_last` - The most recently added videos appear last.  * `alphabetical` - The videos appear in alphabetical order.  * `arranged` - The videos appear in the order in which the user has arranged them.  * `comments` - The videos appear in order of number of comments.  * `duration` - The videos appear in order of duration.  * `likes` - The videos appear in order of number of likes.  * `newest` - The newest videos appear first.  * `oldest` - The oldest videos appear first.  * `plays` - The videos appear in order of number of plays. 
    LiveEssentialsUpdateEventBelongingToAuthenticatedUserRequest2Schedule schedule = new LiveEssentialsUpdateEventBelongingToAuthenticatedUserRequest2Schedule();
    Boolean scheduledPlayback = true; // Whether the scheduled playback feature is enabled.
    String streamDescription = "streamDescription_example"; // The description of the next video to be streamed to the event.
    LiveEssentialsUpdateEventBelongingToAuthenticatedUserRequest2StreamEmbed streamEmbed = new LiveEssentialsUpdateEventBelongingToAuthenticatedUserRequest2StreamEmbed();
    String streamMode = "live"; // The stream mode of the event.  Option descriptions:  * `live` - The stream is live playback.  * `record` - The stream is in record mode.  * `simulive` - The stream is scheduled media playback. 
    String streamPassword = "streamPassword_example"; // The password when **stream_privacy.view** is `password`. Anyone with the password can view the videos generated by streaming to the event.
    LiveEssentialsUpdateEventBelongingToAuthenticatedUserRequest2StreamPrivacy streamPrivacy = new LiveEssentialsUpdateEventBelongingToAuthenticatedUserRequest2StreamPrivacy();
    String streamTitle = "streamTitle_example"; // The title of the next video to be streamed to the event. This parameter is required when **automatically_title_stream** is `false`.
    String timeZone = "timeZone_example"; // The time zone used in resolving the timestamps that are included in automatically generated video titles.
    try {
      LiveEventRecurring result = client
              .liveEssentials
              .updateEventBelongingToAuthenticatedUser_1(liveEventId, userId)
              .title(title)
              .autoCcEnabled(autoCcEnabled)
              .autoCcKeywords(autoCcKeywords)
              .autoCcLanguage(autoCcLanguage)
              .automaticallyTitleStream(automaticallyTitleStream)
              .chatEnabled(chatEnabled)
              .contentRating(contentRating)
              .dvr(dvr)
              .embed(embed)
              .interactionToolsSettings(interactionToolsSettings)
              .playlistSort(playlistSort)
              .schedule(schedule)
              .scheduledPlayback(scheduledPlayback)
              .streamDescription(streamDescription)
              .streamEmbed(streamEmbed)
              .streamMode(streamMode)
              .streamPassword(streamPassword)
              .streamPrivacy(streamPrivacy)
              .streamTitle(streamTitle)
              .timeZone(timeZone)
              .execute();
      System.out.println(result);
      System.out.println(result.getTitle());
      System.out.println(result.getAlbum());
      System.out.println(result.getAllowShareLink());
      System.out.println(result.getAllowedPrivacies());
      System.out.println(result.getAutoCcEnabled());
      System.out.println(result.getAutoCcKeywords());
      System.out.println(result.getAutoCcLanguage());
      System.out.println(result.getAutoCcRemaining());
      System.out.println(result.getAutomaticallyTitleStream());
      System.out.println(result.getChatEnabled());
      System.out.println(result.getCompletedOn());
      System.out.println(result.getContentRating());
      System.out.println(result.getCreatedTime());
      System.out.println(result.getDvr());
      System.out.println(result.getEmailQuota());
      System.out.println(result.getEmbed());
      System.out.println(result.getFromShowcase());
      System.out.println(result.getFromWebinar());
      System.out.println(result.getHeadClip());
      System.out.println(result.getInteractionToolsSettings());
      System.out.println(result.getLatency());
      System.out.println(result.getLeadUuid());
      System.out.println(result.getLink());
      System.out.println(result.getLiveClips());
      System.out.println(result.getLiveDestinations());
      System.out.println(result.getLowLatency());
      System.out.println(result.getMetadata());
      System.out.println(result.getNextOccurrenceTime());
      System.out.println(result.getParentFolder());
      System.out.println(result.getPictures());
      System.out.println(result.getPlaylistSort());
      System.out.println(result.getPreferredStreamMethod());
      System.out.println(result.getRtmpLink());
      System.out.println(result.getRtmpPreview());
      System.out.println(result.getRtmpsLink());
      System.out.println(result.getSchedule());
      System.out.println(result.getScheduledPlayback());
      System.out.println(result.getStatus());
      System.out.println(result.getStreamDescription());
      System.out.println(result.getStreamKey());
      System.out.println(result.getStreamMode());
      System.out.println(result.getStreamPassword());
      System.out.println(result.getStreamPrivacy());
      System.out.println(result.getStreamTitle());
      System.out.println(result.getStreamableClip());
      System.out.println(result.getTimeZone());
      System.out.println(result.getUnlimitedAutoCc());
      System.out.println(result.getUnlimitedDuration());
      System.out.println(result.getUri());
      System.out.println(result.getUser());
      System.out.println(result.getViewLink());
      System.out.println(result.getWebinar());
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveEssentialsApi#updateEventBelongingToAuthenticatedUser_1");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<LiveEventRecurring> response = client
              .liveEssentials
              .updateEventBelongingToAuthenticatedUser_1(liveEventId, userId)
              .title(title)
              .autoCcEnabled(autoCcEnabled)
              .autoCcKeywords(autoCcKeywords)
              .autoCcLanguage(autoCcLanguage)
              .automaticallyTitleStream(automaticallyTitleStream)
              .chatEnabled(chatEnabled)
              .contentRating(contentRating)
              .dvr(dvr)
              .embed(embed)
              .interactionToolsSettings(interactionToolsSettings)
              .playlistSort(playlistSort)
              .schedule(schedule)
              .scheduledPlayback(scheduledPlayback)
              .streamDescription(streamDescription)
              .streamEmbed(streamEmbed)
              .streamMode(streamMode)
              .streamPassword(streamPassword)
              .streamPrivacy(streamPrivacy)
              .streamTitle(streamTitle)
              .timeZone(timeZone)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveEssentialsApi#updateEventBelongingToAuthenticatedUser_1");
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
| **liveEssentialsUpdateEventBelongingToAuthenticatedUserRequest2** | [**LiveEssentialsUpdateEventBelongingToAuthenticatedUserRequest2**](LiveEssentialsUpdateEventBelongingToAuthenticatedUserRequest2.md)|  | [optional] |

### Return type

[**LiveEventRecurring**](LiveEventRecurring.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/vnd.vimeo.live.event.recurring+json
 - **Accept**: application/vnd.vimeo.live.event.recurring+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The event was updated. |  -  |

