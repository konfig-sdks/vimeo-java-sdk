# LiveEventLowLatencyApi

All URIs are relative to *https://api.vimeo.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**toggleOption**](LiveEventLowLatencyApi.md#toggleOption) | **PATCH** /live_events/{live_event_id}/low_latency | Toggle the low-latency option of a live event |
| [**toggleOption_0**](LiveEventLowLatencyApi.md#toggleOption_0) | **PATCH** /me/live_events/{live_event_id}/low_latency | Toggle the low-latency option of a live event |
| [**toggleOption_1**](LiveEventLowLatencyApi.md#toggleOption_1) | **PATCH** /users/{user_id}/live_events/{live_event_id}/low_latency | Toggle the low-latency option of a live event |


<a name="toggleOption"></a>
# **toggleOption**
> RecurringLiveEventLowLatency toggleOption(liveEventId).liveEventLowLatencyToggleOptionRequest(liveEventLowLatencyToggleOptionRequest).execute();

Toggle the low-latency option of a live event

This method toggles the low-latency option of the specified event.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LiveEventLowLatencyApi;
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
    Boolean lowLatency = true; // Whether the event is low latency.
    try {
      RecurringLiveEventLowLatency result = client
              .liveEventLowLatency
              .toggleOption(liveEventId)
              .lowLatency(lowLatency)
              .execute();
      System.out.println(result);
      System.out.println(result.getLowLatency());
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveEventLowLatencyApi#toggleOption");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<RecurringLiveEventLowLatency> response = client
              .liveEventLowLatency
              .toggleOption(liveEventId)
              .lowLatency(lowLatency)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveEventLowLatencyApi#toggleOption");
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
| **liveEventLowLatencyToggleOptionRequest** | [**LiveEventLowLatencyToggleOptionRequest**](LiveEventLowLatencyToggleOptionRequest.md)|  | [optional] |

### Return type

[**RecurringLiveEventLowLatency**](RecurringLiveEventLowLatency.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/application/vnd.vimeo.live.low_latency+json
 - **Accept**: application/application/vnd.vimeo.live.low_latency+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The low-latency status of the event was returned. |  -  |

<a name="toggleOption_0"></a>
# **toggleOption_0**
> RecurringLiveEventLowLatency toggleOption_0(liveEventId).liveEventLowLatencyToggleOptionRequest1(liveEventLowLatencyToggleOptionRequest1).execute();

Toggle the low-latency option of a live event

This method toggles the low-latency option of the specified event.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LiveEventLowLatencyApi;
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
    Boolean lowLatency = true; // Whether the event is low latency.
    try {
      RecurringLiveEventLowLatency result = client
              .liveEventLowLatency
              .toggleOption_0(liveEventId)
              .lowLatency(lowLatency)
              .execute();
      System.out.println(result);
      System.out.println(result.getLowLatency());
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveEventLowLatencyApi#toggleOption_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<RecurringLiveEventLowLatency> response = client
              .liveEventLowLatency
              .toggleOption_0(liveEventId)
              .lowLatency(lowLatency)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveEventLowLatencyApi#toggleOption_0");
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
| **liveEventLowLatencyToggleOptionRequest1** | [**LiveEventLowLatencyToggleOptionRequest1**](LiveEventLowLatencyToggleOptionRequest1.md)|  | [optional] |

### Return type

[**RecurringLiveEventLowLatency**](RecurringLiveEventLowLatency.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/application/vnd.vimeo.live.low_latency+json
 - **Accept**: application/application/vnd.vimeo.live.low_latency+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The low-latency status of the event was returned. |  -  |

<a name="toggleOption_1"></a>
# **toggleOption_1**
> RecurringLiveEventLowLatency toggleOption_1(liveEventId, userId).liveEventLowLatencyToggleOptionRequest2(liveEventLowLatencyToggleOptionRequest2).execute();

Toggle the low-latency option of a live event

This method toggles the low-latency option of the specified event.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LiveEventLowLatencyApi;
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
    Boolean lowLatency = true; // Whether the event is low latency.
    try {
      RecurringLiveEventLowLatency result = client
              .liveEventLowLatency
              .toggleOption_1(liveEventId, userId)
              .lowLatency(lowLatency)
              .execute();
      System.out.println(result);
      System.out.println(result.getLowLatency());
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveEventLowLatencyApi#toggleOption_1");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<RecurringLiveEventLowLatency> response = client
              .liveEventLowLatency
              .toggleOption_1(liveEventId, userId)
              .lowLatency(lowLatency)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveEventLowLatencyApi#toggleOption_1");
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
| **liveEventLowLatencyToggleOptionRequest2** | [**LiveEventLowLatencyToggleOptionRequest2**](LiveEventLowLatencyToggleOptionRequest2.md)|  | [optional] |

### Return type

[**RecurringLiveEventLowLatency**](RecurringLiveEventLowLatency.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/application/vnd.vimeo.live.low_latency+json
 - **Accept**: application/application/vnd.vimeo.live.low_latency+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The low-latency status of the event was returned. |  -  |

