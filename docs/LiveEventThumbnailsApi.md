# LiveEventThumbnailsApi

All URIs are relative to *https://api.vimeo.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addThumbnail**](LiveEventThumbnailsApi.md#addThumbnail) | **POST** /me/live_events/{live_event_id}/pictures | Create a live event thumbnail |
| [**createThumbnailForEvent**](LiveEventThumbnailsApi.md#createThumbnailForEvent) | **POST** /live_events/{live_event_id}/pictures | Create a live event thumbnail |
| [**createThumbnailForEvent_0**](LiveEventThumbnailsApi.md#createThumbnailForEvent_0) | **POST** /users/{user_id}/live_events/{live_event_id}/pictures | Create a live event thumbnail |
| [**deleteForEvent**](LiveEventThumbnailsApi.md#deleteForEvent) | **DELETE** /me/live_events/{live_event_id}/pictures/{thumbnail_id} | Delete a live event thumbnail |
| [**deleteThumbnailForEvent**](LiveEventThumbnailsApi.md#deleteThumbnailForEvent) | **DELETE** /live_events/{live_event_id}/pictures/{thumbnail_id} | Delete a live event thumbnail |
| [**deleteThumbnailForEvent_0**](LiveEventThumbnailsApi.md#deleteThumbnailForEvent_0) | **DELETE** /users/{user_id}/live_events/{live_event_id}/pictures/{thumbnail_id} | Delete a live event thumbnail |
| [**editEventThumbnail**](LiveEventThumbnailsApi.md#editEventThumbnail) | **PATCH** /users/{user_id}/live_events/{live_event_id}/pictures/{thumbnail_id} | Edit a live event thumbnail |
| [**editLiveEventThumbnail**](LiveEventThumbnailsApi.md#editLiveEventThumbnail) | **PATCH** /live_events/{live_event_id}/pictures/{thumbnail_id} | Edit a live event thumbnail |
| [**getAll**](LiveEventThumbnailsApi.md#getAll) | **GET** /me/live_events/{live_event_id}/pictures | Get all the thumbnails of a live event |
| [**getAllThumbnails**](LiveEventThumbnailsApi.md#getAllThumbnails) | **GET** /live_events/{live_event_id}/pictures | Get all the thumbnails of a live event |
| [**getAllThumbs**](LiveEventThumbnailsApi.md#getAllThumbs) | **GET** /users/{user_id}/live_events/{live_event_id}/pictures | Get all the thumbnails of a live event |
| [**getSpecificThumbnail**](LiveEventThumbnailsApi.md#getSpecificThumbnail) | **GET** /live_events/{live_event_id}/pictures/{thumbnail_id} | Get a specific live event thumbnail |
| [**getSpecificThumbnail_0**](LiveEventThumbnailsApi.md#getSpecificThumbnail_0) | **GET** /me/live_events/{live_event_id}/pictures/{thumbnail_id} | Get a specific live event thumbnail |
| [**getSpecificThumbnail_1**](LiveEventThumbnailsApi.md#getSpecificThumbnail_1) | **GET** /users/{user_id}/live_events/{live_event_id}/pictures/{thumbnail_id} | Get a specific live event thumbnail |
| [**updateEventThumbnail**](LiveEventThumbnailsApi.md#updateEventThumbnail) | **PATCH** /me/live_events/{live_event_id}/pictures/{thumbnail_id} | Edit a live event thumbnail |


<a name="addThumbnail"></a>
# **addThumbnail**
> Picture addThumbnail(liveEventId).liveEventThumbnailsAddThumbnailRequest(liveEventThumbnailsAddThumbnailRequest).execute();

Create a live event thumbnail

This method creates a thumbnail image for the specified event.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LiveEventThumbnailsApi;
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
    Boolean active = true; // Whether the thumbnail is the event's active thumbnail.
    try {
      Picture result = client
              .liveEventThumbnails
              .addThumbnail(liveEventId)
              .active(active)
              .execute();
      System.out.println(result);
      System.out.println(result.getActive());
      System.out.println(result.getBaseLink());
      System.out.println(result.getDefaultPicture());
      System.out.println(result.getLink());
      System.out.println(result.getResourceKey());
      System.out.println(result.getSizes());
      System.out.println(result.getType());
      System.out.println(result.getUri());
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveEventThumbnailsApi#addThumbnail");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Picture> response = client
              .liveEventThumbnails
              .addThumbnail(liveEventId)
              .active(active)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveEventThumbnailsApi#addThumbnail");
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
| **liveEventThumbnailsAddThumbnailRequest** | [**LiveEventThumbnailsAddThumbnailRequest**](LiveEventThumbnailsAddThumbnailRequest.md)|  | [optional] |

### Return type

[**Picture**](Picture.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/vnd.vimeo.picture+json
 - **Accept**: application/vnd.vimeo.picture+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The thumbnail was created. |  -  |

<a name="createThumbnailForEvent"></a>
# **createThumbnailForEvent**
> Picture createThumbnailForEvent(liveEventId).liveEventThumbnailsCreateThumbnailForEventRequest(liveEventThumbnailsCreateThumbnailForEventRequest).execute();

Create a live event thumbnail

This method creates a thumbnail image for the specified event.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LiveEventThumbnailsApi;
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
    Boolean active = true; // Whether the thumbnail is the event's active thumbnail.
    try {
      Picture result = client
              .liveEventThumbnails
              .createThumbnailForEvent(liveEventId)
              .active(active)
              .execute();
      System.out.println(result);
      System.out.println(result.getActive());
      System.out.println(result.getBaseLink());
      System.out.println(result.getDefaultPicture());
      System.out.println(result.getLink());
      System.out.println(result.getResourceKey());
      System.out.println(result.getSizes());
      System.out.println(result.getType());
      System.out.println(result.getUri());
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveEventThumbnailsApi#createThumbnailForEvent");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Picture> response = client
              .liveEventThumbnails
              .createThumbnailForEvent(liveEventId)
              .active(active)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveEventThumbnailsApi#createThumbnailForEvent");
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
| **liveEventThumbnailsCreateThumbnailForEventRequest** | [**LiveEventThumbnailsCreateThumbnailForEventRequest**](LiveEventThumbnailsCreateThumbnailForEventRequest.md)|  | [optional] |

### Return type

[**Picture**](Picture.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/vnd.vimeo.picture+json
 - **Accept**: application/vnd.vimeo.picture+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The thumbnail was created. |  -  |

<a name="createThumbnailForEvent_0"></a>
# **createThumbnailForEvent_0**
> Picture createThumbnailForEvent_0(liveEventId, userId).liveEventThumbnailsCreateThumbnailForEventRequest1(liveEventThumbnailsCreateThumbnailForEventRequest1).execute();

Create a live event thumbnail

This method creates a thumbnail image for the specified event.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LiveEventThumbnailsApi;
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
    Boolean active = true; // Whether the thumbnail is the event's active thumbnail.
    try {
      Picture result = client
              .liveEventThumbnails
              .createThumbnailForEvent_0(liveEventId, userId)
              .active(active)
              .execute();
      System.out.println(result);
      System.out.println(result.getActive());
      System.out.println(result.getBaseLink());
      System.out.println(result.getDefaultPicture());
      System.out.println(result.getLink());
      System.out.println(result.getResourceKey());
      System.out.println(result.getSizes());
      System.out.println(result.getType());
      System.out.println(result.getUri());
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveEventThumbnailsApi#createThumbnailForEvent_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Picture> response = client
              .liveEventThumbnails
              .createThumbnailForEvent_0(liveEventId, userId)
              .active(active)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveEventThumbnailsApi#createThumbnailForEvent_0");
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
| **liveEventThumbnailsCreateThumbnailForEventRequest1** | [**LiveEventThumbnailsCreateThumbnailForEventRequest1**](LiveEventThumbnailsCreateThumbnailForEventRequest1.md)|  | [optional] |

### Return type

[**Picture**](Picture.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/vnd.vimeo.picture+json
 - **Accept**: application/vnd.vimeo.picture+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The thumbnail was created. |  -  |

<a name="deleteForEvent"></a>
# **deleteForEvent**
> deleteForEvent(liveEventId, thumbnailId).execute();

Delete a live event thumbnail

This method deletes a thumbnail image for the specified event.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LiveEventThumbnailsApi;
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
    Double thumbnailId = 12345D; // The ID of the thumbnail.
    try {
      client
              .liveEventThumbnails
              .deleteForEvent(liveEventId, thumbnailId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveEventThumbnailsApi#deleteForEvent");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .liveEventThumbnails
              .deleteForEvent(liveEventId, thumbnailId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveEventThumbnailsApi#deleteForEvent");
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
| **thumbnailId** | **Double**| The ID of the thumbnail. | |

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
| **204** | The thumbnail was deleted. |  -  |

<a name="deleteThumbnailForEvent"></a>
# **deleteThumbnailForEvent**
> deleteThumbnailForEvent(liveEventId, thumbnailId).execute();

Delete a live event thumbnail

This method deletes a thumbnail image for the specified event.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LiveEventThumbnailsApi;
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
    Double thumbnailId = 12345D; // The ID of the thumbnail.
    try {
      client
              .liveEventThumbnails
              .deleteThumbnailForEvent(liveEventId, thumbnailId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveEventThumbnailsApi#deleteThumbnailForEvent");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .liveEventThumbnails
              .deleteThumbnailForEvent(liveEventId, thumbnailId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveEventThumbnailsApi#deleteThumbnailForEvent");
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
| **thumbnailId** | **Double**| The ID of the thumbnail. | |

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
| **204** | The thumbnail was deleted. |  -  |

<a name="deleteThumbnailForEvent_0"></a>
# **deleteThumbnailForEvent_0**
> deleteThumbnailForEvent_0(liveEventId, thumbnailId, userId).execute();

Delete a live event thumbnail

This method deletes a thumbnail image for the specified event.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LiveEventThumbnailsApi;
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
    Double thumbnailId = 12345D; // The ID of the thumbnail.
    Double userId = 152184D; // The ID of the user.
    try {
      client
              .liveEventThumbnails
              .deleteThumbnailForEvent_0(liveEventId, thumbnailId, userId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveEventThumbnailsApi#deleteThumbnailForEvent_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .liveEventThumbnails
              .deleteThumbnailForEvent_0(liveEventId, thumbnailId, userId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveEventThumbnailsApi#deleteThumbnailForEvent_0");
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
| **thumbnailId** | **Double**| The ID of the thumbnail. | |
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
| **204** | The thumbnail was deleted. |  -  |

<a name="editEventThumbnail"></a>
# **editEventThumbnail**
> Picture editEventThumbnail(liveEventId, thumbnailId, userId).liveEventThumbnailsEditEventThumbnailRequest(liveEventThumbnailsEditEventThumbnailRequest).execute();

Edit a live event thumbnail

This method edits a thumbnail image for the specified event.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LiveEventThumbnailsApi;
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
    Double thumbnailId = 12345D; // The ID of the thumbnail.
    Double userId = 152184D; // The ID of the user.
    Boolean active = true; // Whether the thumbnail is the event's active thumbnail.
    try {
      Picture result = client
              .liveEventThumbnails
              .editEventThumbnail(liveEventId, thumbnailId, userId)
              .active(active)
              .execute();
      System.out.println(result);
      System.out.println(result.getActive());
      System.out.println(result.getBaseLink());
      System.out.println(result.getDefaultPicture());
      System.out.println(result.getLink());
      System.out.println(result.getResourceKey());
      System.out.println(result.getSizes());
      System.out.println(result.getType());
      System.out.println(result.getUri());
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveEventThumbnailsApi#editEventThumbnail");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Picture> response = client
              .liveEventThumbnails
              .editEventThumbnail(liveEventId, thumbnailId, userId)
              .active(active)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveEventThumbnailsApi#editEventThumbnail");
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
| **thumbnailId** | **Double**| The ID of the thumbnail. | |
| **userId** | **Double**| The ID of the user. | |
| **liveEventThumbnailsEditEventThumbnailRequest** | [**LiveEventThumbnailsEditEventThumbnailRequest**](LiveEventThumbnailsEditEventThumbnailRequest.md)|  | [optional] |

### Return type

[**Picture**](Picture.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/vnd.vimeo.picture+json
 - **Accept**: application/vnd.vimeo.picture+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The thumbnail was edited. |  -  |

<a name="editLiveEventThumbnail"></a>
# **editLiveEventThumbnail**
> Picture editLiveEventThumbnail(liveEventId, thumbnailId).liveEventThumbnailsEditLiveEventThumbnailRequest(liveEventThumbnailsEditLiveEventThumbnailRequest).execute();

Edit a live event thumbnail

This method edits a thumbnail image for the specified event.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LiveEventThumbnailsApi;
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
    Double thumbnailId = 12345D; // The ID of the thumbnail.
    Boolean active = true; // Whether the thumbnail is the event's active thumbnail.
    try {
      Picture result = client
              .liveEventThumbnails
              .editLiveEventThumbnail(liveEventId, thumbnailId)
              .active(active)
              .execute();
      System.out.println(result);
      System.out.println(result.getActive());
      System.out.println(result.getBaseLink());
      System.out.println(result.getDefaultPicture());
      System.out.println(result.getLink());
      System.out.println(result.getResourceKey());
      System.out.println(result.getSizes());
      System.out.println(result.getType());
      System.out.println(result.getUri());
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveEventThumbnailsApi#editLiveEventThumbnail");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Picture> response = client
              .liveEventThumbnails
              .editLiveEventThumbnail(liveEventId, thumbnailId)
              .active(active)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveEventThumbnailsApi#editLiveEventThumbnail");
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
| **thumbnailId** | **Double**| The ID of the thumbnail. | |
| **liveEventThumbnailsEditLiveEventThumbnailRequest** | [**LiveEventThumbnailsEditLiveEventThumbnailRequest**](LiveEventThumbnailsEditLiveEventThumbnailRequest.md)|  | [optional] |

### Return type

[**Picture**](Picture.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/vnd.vimeo.picture+json
 - **Accept**: application/vnd.vimeo.picture+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The thumbnail was edited. |  -  |

<a name="getAll"></a>
# **getAll**
> List&lt;Picture&gt; getAll(liveEventId).execute();

Get all the thumbnails of a live event

This method returns every thumbnail image of the specified event.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LiveEventThumbnailsApi;
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
      List<Picture> result = client
              .liveEventThumbnails
              .getAll(liveEventId)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveEventThumbnailsApi#getAll");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<Picture>> response = client
              .liveEventThumbnails
              .getAll(liveEventId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveEventThumbnailsApi#getAll");
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

[**List&lt;Picture&gt;**](Picture.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.vimeo.picture+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The thumbnails were returned. |  -  |

<a name="getAllThumbnails"></a>
# **getAllThumbnails**
> List&lt;Picture&gt; getAllThumbnails(liveEventId).execute();

Get all the thumbnails of a live event

This method returns every thumbnail image of the specified event.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LiveEventThumbnailsApi;
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
      List<Picture> result = client
              .liveEventThumbnails
              .getAllThumbnails(liveEventId)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveEventThumbnailsApi#getAllThumbnails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<Picture>> response = client
              .liveEventThumbnails
              .getAllThumbnails(liveEventId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveEventThumbnailsApi#getAllThumbnails");
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

[**List&lt;Picture&gt;**](Picture.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.vimeo.picture+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The thumbnails were returned. |  -  |

<a name="getAllThumbs"></a>
# **getAllThumbs**
> List&lt;Picture&gt; getAllThumbs(liveEventId, userId).execute();

Get all the thumbnails of a live event

This method returns every thumbnail image of the specified event.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LiveEventThumbnailsApi;
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
      List<Picture> result = client
              .liveEventThumbnails
              .getAllThumbs(liveEventId, userId)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveEventThumbnailsApi#getAllThumbs");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<Picture>> response = client
              .liveEventThumbnails
              .getAllThumbs(liveEventId, userId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveEventThumbnailsApi#getAllThumbs");
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

[**List&lt;Picture&gt;**](Picture.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.vimeo.picture+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The thumbnails were returned. |  -  |

<a name="getSpecificThumbnail"></a>
# **getSpecificThumbnail**
> Picture getSpecificThumbnail(liveEventId, thumbnailId).execute();

Get a specific live event thumbnail

This method returns a single thumbnail image of the specified event.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LiveEventThumbnailsApi;
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
    Double thumbnailId = 12345D; // The ID of the thumbnail.
    try {
      Picture result = client
              .liveEventThumbnails
              .getSpecificThumbnail(liveEventId, thumbnailId)
              .execute();
      System.out.println(result);
      System.out.println(result.getActive());
      System.out.println(result.getBaseLink());
      System.out.println(result.getDefaultPicture());
      System.out.println(result.getLink());
      System.out.println(result.getResourceKey());
      System.out.println(result.getSizes());
      System.out.println(result.getType());
      System.out.println(result.getUri());
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveEventThumbnailsApi#getSpecificThumbnail");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Picture> response = client
              .liveEventThumbnails
              .getSpecificThumbnail(liveEventId, thumbnailId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveEventThumbnailsApi#getSpecificThumbnail");
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
| **thumbnailId** | **Double**| The ID of the thumbnail. | |

### Return type

[**Picture**](Picture.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.vimeo.picture+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The thumbnail was returned. |  -  |

<a name="getSpecificThumbnail_0"></a>
# **getSpecificThumbnail_0**
> Picture getSpecificThumbnail_0(liveEventId, thumbnailId).execute();

Get a specific live event thumbnail

This method returns a single thumbnail image of the specified event.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LiveEventThumbnailsApi;
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
    Double thumbnailId = 12345D; // The ID of the thumbnail.
    try {
      Picture result = client
              .liveEventThumbnails
              .getSpecificThumbnail_0(liveEventId, thumbnailId)
              .execute();
      System.out.println(result);
      System.out.println(result.getActive());
      System.out.println(result.getBaseLink());
      System.out.println(result.getDefaultPicture());
      System.out.println(result.getLink());
      System.out.println(result.getResourceKey());
      System.out.println(result.getSizes());
      System.out.println(result.getType());
      System.out.println(result.getUri());
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveEventThumbnailsApi#getSpecificThumbnail_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Picture> response = client
              .liveEventThumbnails
              .getSpecificThumbnail_0(liveEventId, thumbnailId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveEventThumbnailsApi#getSpecificThumbnail_0");
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
| **thumbnailId** | **Double**| The ID of the thumbnail. | |

### Return type

[**Picture**](Picture.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.vimeo.picture+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The thumbnail was returned. |  -  |

<a name="getSpecificThumbnail_1"></a>
# **getSpecificThumbnail_1**
> Picture getSpecificThumbnail_1(liveEventId, thumbnailId, userId).execute();

Get a specific live event thumbnail

This method returns a single thumbnail image of the specified event.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LiveEventThumbnailsApi;
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
    Double thumbnailId = 12345D; // The ID of the thumbnail.
    Double userId = 152184D; // The ID of the user.
    try {
      Picture result = client
              .liveEventThumbnails
              .getSpecificThumbnail_1(liveEventId, thumbnailId, userId)
              .execute();
      System.out.println(result);
      System.out.println(result.getActive());
      System.out.println(result.getBaseLink());
      System.out.println(result.getDefaultPicture());
      System.out.println(result.getLink());
      System.out.println(result.getResourceKey());
      System.out.println(result.getSizes());
      System.out.println(result.getType());
      System.out.println(result.getUri());
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveEventThumbnailsApi#getSpecificThumbnail_1");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Picture> response = client
              .liveEventThumbnails
              .getSpecificThumbnail_1(liveEventId, thumbnailId, userId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveEventThumbnailsApi#getSpecificThumbnail_1");
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
| **thumbnailId** | **Double**| The ID of the thumbnail. | |
| **userId** | **Double**| The ID of the user. | |

### Return type

[**Picture**](Picture.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.vimeo.picture+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The thumbnail was returned. |  -  |

<a name="updateEventThumbnail"></a>
# **updateEventThumbnail**
> Picture updateEventThumbnail(liveEventId, thumbnailId).liveEventThumbnailsUpdateEventThumbnailRequest(liveEventThumbnailsUpdateEventThumbnailRequest).execute();

Edit a live event thumbnail

This method edits a thumbnail image for the specified event.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LiveEventThumbnailsApi;
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
    Double thumbnailId = 12345D; // The ID of the thumbnail.
    Boolean active = true; // Whether the thumbnail is the event's active thumbnail.
    try {
      Picture result = client
              .liveEventThumbnails
              .updateEventThumbnail(liveEventId, thumbnailId)
              .active(active)
              .execute();
      System.out.println(result);
      System.out.println(result.getActive());
      System.out.println(result.getBaseLink());
      System.out.println(result.getDefaultPicture());
      System.out.println(result.getLink());
      System.out.println(result.getResourceKey());
      System.out.println(result.getSizes());
      System.out.println(result.getType());
      System.out.println(result.getUri());
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveEventThumbnailsApi#updateEventThumbnail");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Picture> response = client
              .liveEventThumbnails
              .updateEventThumbnail(liveEventId, thumbnailId)
              .active(active)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LiveEventThumbnailsApi#updateEventThumbnail");
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
| **thumbnailId** | **Double**| The ID of the thumbnail. | |
| **liveEventThumbnailsUpdateEventThumbnailRequest** | [**LiveEventThumbnailsUpdateEventThumbnailRequest**](LiveEventThumbnailsUpdateEventThumbnailRequest.md)|  | [optional] |

### Return type

[**Picture**](Picture.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/vnd.vimeo.picture+json
 - **Accept**: application/vnd.vimeo.picture+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The thumbnail was edited. |  -  |

