# LiveEventAutomatedClosedCaptionsApi

All URIs are relative to *https://api.vimeo.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**editPreference**](LiveEventAutomatedClosedCaptionsApi.md#editPreference) | **PATCH** /live_events/{live_event_id}/auto_cc | Edit the automated closed captions preference of a live event |
| [**editPreferenceForEvent**](LiveEventAutomatedClosedCaptionsApi.md#editPreferenceForEvent) | **PATCH** /me/live_events/{live_event_id}/auto_cc | Edit the automated closed captions preference of a live event |
| [**editPreferenceForEvent_0**](LiveEventAutomatedClosedCaptionsApi.md#editPreferenceForEvent_0) | **PATCH** /users/{user_id}/live_events/{live_event_id}/auto_cc | Edit the automated closed captions preference of a live event |


<a name="editPreference"></a>
# **editPreference**
> LiveEventAutomatedClosedCaptions editPreference(liveEventId, liveEventAutomatedClosedCaptionsEditPreferenceRequest).execute();

Edit the automated closed captions preference of a live event

This method edits the automated closed captions preference for the specified event.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LiveEventAutomatedClosedCaptionsApi;
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
    Boolean autoCcEnabled = true; // Whether automated closed captions are enabled for the event.
    Double liveEventId = 12345D; // The ID of the event.
    String autoCcKeywords = "autoCcKeywords_example"; // A comma-separated list of keywords that improve the quality of the automated closed captions.
    String autoCcLang = "de-DE"; // The language in which the automated closed captions appear.  Option descriptions:  * `de-DE` - The language is German.  * `en-US` - The language is English.  * `es-ES` - The language is Spanish.  * `fr-FR` - The language is French.  * `pt-BR` - The language is Portuguese. 
    try {
      LiveEventAutomatedClosedCaptions result = client
              .liveEventAutomatedClosedCaptions
              .editPreference(autoCcEnabled, liveEventId)
              .autoCcKeywords(autoCcKeywords)
              .autoCcLang(autoCcLang)
              .execute();
      System.out.println(result);
      System.out.println(result.getAutoCcCanBeEnabled());
      System.out.println(result.getAutoCcEnabled());
      System.out.println(result.getAutoCcIsUnlimited());
      System.out.println(result.getAutoCcKeywords());
      System.out.println(result.getAutoCcLanguage());
      System.out.println(result.getAutoCcRemaining());
      System.out.println(result.getEventId());
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveEventAutomatedClosedCaptionsApi#editPreference");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<LiveEventAutomatedClosedCaptions> response = client
              .liveEventAutomatedClosedCaptions
              .editPreference(autoCcEnabled, liveEventId)
              .autoCcKeywords(autoCcKeywords)
              .autoCcLang(autoCcLang)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveEventAutomatedClosedCaptionsApi#editPreference");
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
| **liveEventAutomatedClosedCaptionsEditPreferenceRequest** | [**LiveEventAutomatedClosedCaptionsEditPreferenceRequest**](LiveEventAutomatedClosedCaptionsEditPreferenceRequest.md)|  | |

### Return type

[**LiveEventAutomatedClosedCaptions**](LiveEventAutomatedClosedCaptions.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/application/vnd.vimeo.live.auto_cc+json
 - **Accept**: application/application/vnd.vimeo.live.auto_cc+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The automated closed captions preference was edited. |  -  |

<a name="editPreferenceForEvent"></a>
# **editPreferenceForEvent**
> LiveEventAutomatedClosedCaptions editPreferenceForEvent(liveEventId, liveEventAutomatedClosedCaptionsEditPreferenceForEventRequest).execute();

Edit the automated closed captions preference of a live event

This method edits the automated closed captions preference for the specified event.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LiveEventAutomatedClosedCaptionsApi;
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
    Boolean autoCcEnabled = true; // Whether automated closed captions are enabled for the event.
    Double liveEventId = 12345D; // The ID of the event.
    String autoCcKeywords = "autoCcKeywords_example"; // A comma-separated list of keywords that improve the quality of the automated closed captions.
    String autoCcLang = "de-DE"; // The language in which the automated closed captions appear.  Option descriptions:  * `de-DE` - The language is German.  * `en-US` - The language is English.  * `es-ES` - The language is Spanish.  * `fr-FR` - The language is French.  * `pt-BR` - The language is Portuguese. 
    try {
      LiveEventAutomatedClosedCaptions result = client
              .liveEventAutomatedClosedCaptions
              .editPreferenceForEvent(autoCcEnabled, liveEventId)
              .autoCcKeywords(autoCcKeywords)
              .autoCcLang(autoCcLang)
              .execute();
      System.out.println(result);
      System.out.println(result.getAutoCcCanBeEnabled());
      System.out.println(result.getAutoCcEnabled());
      System.out.println(result.getAutoCcIsUnlimited());
      System.out.println(result.getAutoCcKeywords());
      System.out.println(result.getAutoCcLanguage());
      System.out.println(result.getAutoCcRemaining());
      System.out.println(result.getEventId());
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveEventAutomatedClosedCaptionsApi#editPreferenceForEvent");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<LiveEventAutomatedClosedCaptions> response = client
              .liveEventAutomatedClosedCaptions
              .editPreferenceForEvent(autoCcEnabled, liveEventId)
              .autoCcKeywords(autoCcKeywords)
              .autoCcLang(autoCcLang)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveEventAutomatedClosedCaptionsApi#editPreferenceForEvent");
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
| **liveEventAutomatedClosedCaptionsEditPreferenceForEventRequest** | [**LiveEventAutomatedClosedCaptionsEditPreferenceForEventRequest**](LiveEventAutomatedClosedCaptionsEditPreferenceForEventRequest.md)|  | |

### Return type

[**LiveEventAutomatedClosedCaptions**](LiveEventAutomatedClosedCaptions.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/application/vnd.vimeo.live.auto_cc+json
 - **Accept**: application/application/vnd.vimeo.live.auto_cc+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The automated closed captions preference was edited. |  -  |

<a name="editPreferenceForEvent_0"></a>
# **editPreferenceForEvent_0**
> LiveEventAutomatedClosedCaptions editPreferenceForEvent_0(liveEventId, userId, liveEventAutomatedClosedCaptionsEditPreferenceForEventRequest1).execute();

Edit the automated closed captions preference of a live event

This method edits the automated closed captions preference for the specified event.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LiveEventAutomatedClosedCaptionsApi;
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
    Boolean autoCcEnabled = true; // Whether automated closed captions are enabled for the event.
    Double liveEventId = 12345D; // The ID of the event.
    Double userId = 152184D; // The ID of the user.
    String autoCcKeywords = "autoCcKeywords_example"; // A comma-separated list of keywords that improve the quality of the automated closed captions.
    String autoCcLang = "de-DE"; // The language in which the automated closed captions appear.  Option descriptions:  * `de-DE` - The language is German.  * `en-US` - The language is English.  * `es-ES` - The language is Spanish.  * `fr-FR` - The language is French.  * `pt-BR` - The language is Portuguese. 
    try {
      LiveEventAutomatedClosedCaptions result = client
              .liveEventAutomatedClosedCaptions
              .editPreferenceForEvent_0(autoCcEnabled, liveEventId, userId)
              .autoCcKeywords(autoCcKeywords)
              .autoCcLang(autoCcLang)
              .execute();
      System.out.println(result);
      System.out.println(result.getAutoCcCanBeEnabled());
      System.out.println(result.getAutoCcEnabled());
      System.out.println(result.getAutoCcIsUnlimited());
      System.out.println(result.getAutoCcKeywords());
      System.out.println(result.getAutoCcLanguage());
      System.out.println(result.getAutoCcRemaining());
      System.out.println(result.getEventId());
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveEventAutomatedClosedCaptionsApi#editPreferenceForEvent_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<LiveEventAutomatedClosedCaptions> response = client
              .liveEventAutomatedClosedCaptions
              .editPreferenceForEvent_0(autoCcEnabled, liveEventId, userId)
              .autoCcKeywords(autoCcKeywords)
              .autoCcLang(autoCcLang)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveEventAutomatedClosedCaptionsApi#editPreferenceForEvent_0");
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
| **liveEventAutomatedClosedCaptionsEditPreferenceForEventRequest1** | [**LiveEventAutomatedClosedCaptionsEditPreferenceForEventRequest1**](LiveEventAutomatedClosedCaptionsEditPreferenceForEventRequest1.md)|  | |

### Return type

[**LiveEventAutomatedClosedCaptions**](LiveEventAutomatedClosedCaptions.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/application/vnd.vimeo.live.auto_cc+json
 - **Accept**: application/application/vnd.vimeo.live.auto_cc+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The automated closed captions preference was edited. |  -  |

