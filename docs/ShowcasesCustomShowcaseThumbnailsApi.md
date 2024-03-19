# ShowcasesCustomShowcaseThumbnailsApi

All URIs are relative to *https://api.vimeo.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addCustomThumbnail**](ShowcasesCustomShowcaseThumbnailsApi.md#addCustomThumbnail) | **POST** /users/{user_id}/albums/{album_id}/custom_thumbnails | Add a custom thumbnail to a showcase |
| [**deleteCustomThumbnail**](ShowcasesCustomShowcaseThumbnailsApi.md#deleteCustomThumbnail) | **DELETE** /users/{user_id}/albums/{album_id}/custom_thumbnails/{thumbnail_id} | Delete a custom showcase thumbnail |
| [**getSpecificThumbnail**](ShowcasesCustomShowcaseThumbnailsApi.md#getSpecificThumbnail) | **GET** /users/{user_id}/albums/{album_id}/custom_thumbnails/{thumbnail_id} | Get a specific custom showcase thumbnail |
| [**list**](ShowcasesCustomShowcaseThumbnailsApi.md#list) | **GET** /users/{user_id}/albums/{album_id}/custom_thumbnails | Get all the custom thumbnails of a showcase |
| [**replaceCustomThumbnail**](ShowcasesCustomShowcaseThumbnailsApi.md#replaceCustomThumbnail) | **PATCH** /users/{user_id}/albums/{album_id}/custom_thumbnails/{thumbnail_id} | Replace a custom showcase thumbnail |


<a name="addCustomThumbnail"></a>
# **addCustomThumbnail**
> Picture addCustomThumbnail(albumId, userId).execute();

Add a custom thumbnail to a showcase

This method adds an uploaded image file as a custom thumbnail for the specified showcase. The image doesn&#39;t need to be a still from a showcase video, unlike with the [standard thumbnail method](https://developer.vimeo.com/api/reference/albums#set_video_as_album_thumbnail). The authenticated user must be the owner of the showcase.  For information on how to upload the thumbnail, see our [Working with Thumbnail Uploads](https://developer.vimeo.com/api/upload/thumbnails) guide, and follow the same steps.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ShowcasesCustomShowcaseThumbnailsApi;
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
    Double albumId = 3706071D; // The ID of the showcase.
    Double userId = 152184D; // The ID of the user.
    try {
      Picture result = client
              .showcasesCustomShowcaseThumbnails
              .addCustomThumbnail(albumId, userId)
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
      System.err.println("Exception when calling ShowcasesCustomShowcaseThumbnailsApi#addCustomThumbnail");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Picture> response = client
              .showcasesCustomShowcaseThumbnails
              .addCustomThumbnail(albumId, userId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ShowcasesCustomShowcaseThumbnailsApi#addCustomThumbnail");
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
| **albumId** | **Double**| The ID of the showcase. | |
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
| **201** | The custom thumbnail was added to the showcase. |  -  |

<a name="deleteCustomThumbnail"></a>
# **deleteCustomThumbnail**
> deleteCustomThumbnail(albumId, thumbnailId, userId).execute();

Delete a custom showcase thumbnail

This method deletes the specified custom thumbnail from its showcase. The authenticated user must be the owner of the showcase.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ShowcasesCustomShowcaseThumbnailsApi;
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
    Double albumId = 3706071D; // The ID of the showcase.
    Double thumbnailId = 12345D; // The ID of the custom thumbnail.
    Double userId = 152184D; // The ID of the user.
    try {
      client
              .showcasesCustomShowcaseThumbnails
              .deleteCustomThumbnail(albumId, thumbnailId, userId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ShowcasesCustomShowcaseThumbnailsApi#deleteCustomThumbnail");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .showcasesCustomShowcaseThumbnails
              .deleteCustomThumbnail(albumId, thumbnailId, userId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ShowcasesCustomShowcaseThumbnailsApi#deleteCustomThumbnail");
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
| **albumId** | **Double**| The ID of the showcase. | |
| **thumbnailId** | **Double**| The ID of the custom thumbnail. | |
| **userId** | **Double**| The ID of the user. | |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.vimeo.picture+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | The custom thumbnail was deleted. |  -  |

<a name="getSpecificThumbnail"></a>
# **getSpecificThumbnail**
> Picture getSpecificThumbnail(albumId, thumbnailId, userId).execute();

Get a specific custom showcase thumbnail

This method returns a single custom thumbnail of the specified showcase. The authenticated user must be the owner of the showcase.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ShowcasesCustomShowcaseThumbnailsApi;
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
    Double albumId = 3706071D; // The ID of the showcase.
    Double thumbnailId = 12345D; // The ID of the custom thumbnail.
    Double userId = 152184D; // The ID of the user.
    try {
      Picture result = client
              .showcasesCustomShowcaseThumbnails
              .getSpecificThumbnail(albumId, thumbnailId, userId)
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
      System.err.println("Exception when calling ShowcasesCustomShowcaseThumbnailsApi#getSpecificThumbnail");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Picture> response = client
              .showcasesCustomShowcaseThumbnails
              .getSpecificThumbnail(albumId, thumbnailId, userId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ShowcasesCustomShowcaseThumbnailsApi#getSpecificThumbnail");
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
| **albumId** | **Double**| The ID of the showcase. | |
| **thumbnailId** | **Double**| The ID of the custom thumbnail. | |
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
| **200** | The custom thumbnail was returned. |  -  |

<a name="list"></a>
# **list**
> List&lt;Picture&gt; list(albumId, userId).page(page).perPage(perPage).execute();

Get all the custom thumbnails of a showcase

This method returns every custom thumbnail of the specified showcase.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ShowcasesCustomShowcaseThumbnailsApi;
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
    Double albumId = 3706071D; // The ID of the showcase.
    Double userId = 152184D; // The ID of the user.
    Double page = 1D; // The page number of the results to show.
    Double perPage = 10D; // The number of items to show on each page of results, up to a maximum of 100.
    try {
      List<Picture> result = client
              .showcasesCustomShowcaseThumbnails
              .list(albumId, userId)
              .page(page)
              .perPage(perPage)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShowcasesCustomShowcaseThumbnailsApi#list");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<Picture>> response = client
              .showcasesCustomShowcaseThumbnails
              .list(albumId, userId)
              .page(page)
              .perPage(perPage)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ShowcasesCustomShowcaseThumbnailsApi#list");
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
| **albumId** | **Double**| The ID of the showcase. | |
| **userId** | **Double**| The ID of the user. | |
| **page** | **Double**| The page number of the results to show. | [optional] |
| **perPage** | **Double**| The number of items to show on each page of results, up to a maximum of 100. | [optional] |

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
| **200** | The custom thumbnails were returned. |  -  |

<a name="replaceCustomThumbnail"></a>
# **replaceCustomThumbnail**
> Picture replaceCustomThumbnail(albumId, thumbnailId, userId).showcasesCustomShowcaseThumbnailsReplaceCustomThumbnailRequest(showcasesCustomShowcaseThumbnailsReplaceCustomThumbnailRequest).execute();

Replace a custom showcase thumbnail

This method replaces the specified custom showcase thumbnail with a new image file. The authenticated user must be the owner of the showcase.  For information on how to upload the thumbnail, see our [Working with Thumbnail Uploads](https://developer.vimeo.com/api/upload/thumbnails) guide.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ShowcasesCustomShowcaseThumbnailsApi;
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
    Double albumId = 3706071D; // The ID of the showcase.
    Double thumbnailId = 12345D; // The ID of the custom thumbnail.
    Double userId = 152184D; // The ID of the user.
    Boolean active = true; // Whether to make this image the active custom showcase thumbnail.
    try {
      Picture result = client
              .showcasesCustomShowcaseThumbnails
              .replaceCustomThumbnail(albumId, thumbnailId, userId)
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
      System.err.println("Exception when calling ShowcasesCustomShowcaseThumbnailsApi#replaceCustomThumbnail");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Picture> response = client
              .showcasesCustomShowcaseThumbnails
              .replaceCustomThumbnail(albumId, thumbnailId, userId)
              .active(active)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ShowcasesCustomShowcaseThumbnailsApi#replaceCustomThumbnail");
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
| **albumId** | **Double**| The ID of the showcase. | |
| **thumbnailId** | **Double**| The ID of the custom thumbnail. | |
| **userId** | **Double**| The ID of the user. | |
| **showcasesCustomShowcaseThumbnailsReplaceCustomThumbnailRequest** | [**ShowcasesCustomShowcaseThumbnailsReplaceCustomThumbnailRequest**](ShowcasesCustomShowcaseThumbnailsReplaceCustomThumbnailRequest.md)|  | [optional] |

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
| **200** | The custom thumbnail was replaced. |  -  |

