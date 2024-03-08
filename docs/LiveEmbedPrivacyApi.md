# LiveEmbedPrivacyApi

All URIs are relative to *https://api.vimeo.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**embedEventOnDomains**](LiveEmbedPrivacyApi.md#embedEventOnDomains) | **PUT** /live_events/{live_event_id}/privacy/domains | Embed a live event on one or more domains |
| [**embedEventOnDomains_0**](LiveEmbedPrivacyApi.md#embedEventOnDomains_0) | **PUT** /me/live_events/{live_event_id}/privacy/domains | Embed a live event on one or more domains |
| [**embedEventOnDomains_1**](LiveEmbedPrivacyApi.md#embedEventOnDomains_1) | **PUT** /users/{user_id}/live_events/{live_event_id}/privacy/domains | Embed a live event on one or more domains |
| [**getWhitelistDomains**](LiveEmbedPrivacyApi.md#getWhitelistDomains) | **GET** /live_events/{live_event_id}/privacy/domains | Get all the domains on which a live event can be embedded |
| [**getWhitelistDomains_0**](LiveEmbedPrivacyApi.md#getWhitelistDomains_0) | **GET** /me/live_events/{live_event_id}/privacy/domains | Get all the domains on which a live event can be embedded |
| [**getWhitelistDomains_1**](LiveEmbedPrivacyApi.md#getWhitelistDomains_1) | **GET** /users/{user_id}/live_events/{live_event_id}/privacy/domains | Get all the domains on which a live event can be embedded |


<a name="embedEventOnDomains"></a>
# **embedEventOnDomains**
> embedEventOnDomains(liveEventId).liveEmbedPrivacyEmbedEventOnDomainsRequest(liveEmbedPrivacyEmbedEventOnDomainsRequest).execute();

Embed a live event on one or more domains

This method embeds an event on the specified domains. The embed privacy setting must be &#x60;whitelist&#x60;.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LiveEmbedPrivacyApi;
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
    List<String> allowedDomains = Arrays.asList(); // An array of the domains on which the embedded event can appear.
    try {
      client
              .liveEmbedPrivacy
              .embedEventOnDomains(liveEventId)
              .allowedDomains(allowedDomains)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveEmbedPrivacyApi#embedEventOnDomains");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .liveEmbedPrivacy
              .embedEventOnDomains(liveEventId)
              .allowedDomains(allowedDomains)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveEmbedPrivacyApi#embedEventOnDomains");
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
| **liveEmbedPrivacyEmbedEventOnDomainsRequest** | [**LiveEmbedPrivacyEmbedEventOnDomainsRequest**](LiveEmbedPrivacyEmbedEventOnDomainsRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | The domains were added to the whitelist. |  -  |

<a name="embedEventOnDomains_0"></a>
# **embedEventOnDomains_0**
> embedEventOnDomains_0(liveEventId).liveEmbedPrivacyEmbedEventOnDomainsRequest1(liveEmbedPrivacyEmbedEventOnDomainsRequest1).execute();

Embed a live event on one or more domains

This method embeds an event on the specified domains. The embed privacy setting must be &#x60;whitelist&#x60;.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LiveEmbedPrivacyApi;
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
    List<String> allowedDomains = Arrays.asList(); // An array of the domains on which the embedded event can appear.
    try {
      client
              .liveEmbedPrivacy
              .embedEventOnDomains_0(liveEventId)
              .allowedDomains(allowedDomains)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveEmbedPrivacyApi#embedEventOnDomains_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .liveEmbedPrivacy
              .embedEventOnDomains_0(liveEventId)
              .allowedDomains(allowedDomains)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveEmbedPrivacyApi#embedEventOnDomains_0");
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
| **liveEmbedPrivacyEmbedEventOnDomainsRequest1** | [**LiveEmbedPrivacyEmbedEventOnDomainsRequest1**](LiveEmbedPrivacyEmbedEventOnDomainsRequest1.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | The domains were added to the whitelist. |  -  |

<a name="embedEventOnDomains_1"></a>
# **embedEventOnDomains_1**
> embedEventOnDomains_1(liveEventId, userId).liveEmbedPrivacyEmbedEventOnDomainsRequest2(liveEmbedPrivacyEmbedEventOnDomainsRequest2).execute();

Embed a live event on one or more domains

This method embeds an event on the specified domains. The embed privacy setting must be &#x60;whitelist&#x60;.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LiveEmbedPrivacyApi;
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
    List<String> allowedDomains = Arrays.asList(); // An array of the domains on which the embedded event can appear.
    try {
      client
              .liveEmbedPrivacy
              .embedEventOnDomains_1(liveEventId, userId)
              .allowedDomains(allowedDomains)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveEmbedPrivacyApi#embedEventOnDomains_1");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .liveEmbedPrivacy
              .embedEventOnDomains_1(liveEventId, userId)
              .allowedDomains(allowedDomains)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveEmbedPrivacyApi#embedEventOnDomains_1");
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
| **liveEmbedPrivacyEmbedEventOnDomainsRequest2** | [**LiveEmbedPrivacyEmbedEventOnDomainsRequest2**](LiveEmbedPrivacyEmbedEventOnDomainsRequest2.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | The domains were added to the whitelist. |  -  |

<a name="getWhitelistDomains"></a>
# **getWhitelistDomains**
> List&lt;Domain&gt; getWhitelistDomains(liveEventId).execute();

Get all the domains on which a live event can be embedded

This method returns every whitelisted domain for an event. The embed privacy setting must be &#x60;whitelist&#x60;.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LiveEmbedPrivacyApi;
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
      List<Domain> result = client
              .liveEmbedPrivacy
              .getWhitelistDomains(liveEventId)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveEmbedPrivacyApi#getWhitelistDomains");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<Domain>> response = client
              .liveEmbedPrivacy
              .getWhitelistDomains(liveEventId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveEmbedPrivacyApi#getWhitelistDomains");
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

[**List&lt;Domain&gt;**](Domain.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.vimeo.domain+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The whitelisted domains for the event were returned. |  -  |

<a name="getWhitelistDomains_0"></a>
# **getWhitelistDomains_0**
> List&lt;Domain&gt; getWhitelistDomains_0(liveEventId).execute();

Get all the domains on which a live event can be embedded

This method returns every whitelisted domain for an event. The embed privacy setting must be &#x60;whitelist&#x60;.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LiveEmbedPrivacyApi;
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
      List<Domain> result = client
              .liveEmbedPrivacy
              .getWhitelistDomains_0(liveEventId)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveEmbedPrivacyApi#getWhitelistDomains_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<Domain>> response = client
              .liveEmbedPrivacy
              .getWhitelistDomains_0(liveEventId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveEmbedPrivacyApi#getWhitelistDomains_0");
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

[**List&lt;Domain&gt;**](Domain.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.vimeo.domain+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The whitelisted domains for the event were returned. |  -  |

<a name="getWhitelistDomains_1"></a>
# **getWhitelistDomains_1**
> List&lt;Domain&gt; getWhitelistDomains_1(liveEventId, userId).execute();

Get all the domains on which a live event can be embedded

This method returns every whitelisted domain for an event. The embed privacy setting must be &#x60;whitelist&#x60;.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LiveEmbedPrivacyApi;
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
      List<Domain> result = client
              .liveEmbedPrivacy
              .getWhitelistDomains_1(liveEventId, userId)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveEmbedPrivacyApi#getWhitelistDomains_1");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<Domain>> response = client
              .liveEmbedPrivacy
              .getWhitelistDomains_1(liveEventId, userId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveEmbedPrivacyApi#getWhitelistDomains_1");
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

[**List&lt;Domain&gt;**](Domain.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.vimeo.domain+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The whitelisted domains for the event were returned. |  -  |

