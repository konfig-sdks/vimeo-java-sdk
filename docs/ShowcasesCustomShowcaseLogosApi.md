# ShowcasesCustomShowcaseLogosApi

All URIs are relative to *https://api.vimeo.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addCustomLogo**](ShowcasesCustomShowcaseLogosApi.md#addCustomLogo) | **POST** /users/{user_id}/albums/{album_id}/logos | Add a custom logo to a showcase |
| [**deleteCustomLogo**](ShowcasesCustomShowcaseLogosApi.md#deleteCustomLogo) | **DELETE** /users/{user_id}/albums/{album_id}/logos/{logo_id} | Delete a custom showcase logo |
| [**getSpecificLogo**](ShowcasesCustomShowcaseLogosApi.md#getSpecificLogo) | **GET** /users/{user_id}/albums/{album_id}/logos/{logo_id} | Get a specific custom showcase logo |
| [**listAllCustomLogos**](ShowcasesCustomShowcaseLogosApi.md#listAllCustomLogos) | **GET** /users/{user_id}/albums/{album_id}/logos | Get all the custom logos of a showcase |
| [**replaceLogo**](ShowcasesCustomShowcaseLogosApi.md#replaceLogo) | **PATCH** /users/{user_id}/albums/{album_id}/logos/{logo_id} | Replace a custom showcase logo |


<a name="addCustomLogo"></a>
# **addCustomLogo**
> Picture addCustomLogo(albumId, userId).execute();

Add a custom logo to a showcase

This method adds an image file as a custom logo to the specified showcase. The authenticated user must be the owner of the showcase.  For information on how to upload the logo, see our [Working with Thumbnail Uploads](https://developer.vimeo.com/api/upload/thumbnails) guide.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ShowcasesCustomShowcaseLogosApi;
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
              .showcasesCustomShowcaseLogos
              .addCustomLogo(albumId, userId)
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
      System.err.println("Exception when calling ShowcasesCustomShowcaseLogosApi#addCustomLogo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Picture> response = client
              .showcasesCustomShowcaseLogos
              .addCustomLogo(albumId, userId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ShowcasesCustomShowcaseLogosApi#addCustomLogo");
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
| **201** | The logo was added to the showcase. |  -  |

<a name="deleteCustomLogo"></a>
# **deleteCustomLogo**
> deleteCustomLogo(albumId, logoId, userId).execute();

Delete a custom showcase logo

This method deletes the specified custom logo from its showcase. The authenticated user must be the owner of the showcase.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ShowcasesCustomShowcaseLogosApi;
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
    Double logoId = 12345D; // The ID of the custom logo.
    Double userId = 152184D; // The ID of the user.
    try {
      client
              .showcasesCustomShowcaseLogos
              .deleteCustomLogo(albumId, logoId, userId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ShowcasesCustomShowcaseLogosApi#deleteCustomLogo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .showcasesCustomShowcaseLogos
              .deleteCustomLogo(albumId, logoId, userId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ShowcasesCustomShowcaseLogosApi#deleteCustomLogo");
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
| **logoId** | **Double**| The ID of the custom logo. | |
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
| **204** | The custom logo was deleted. |  -  |

<a name="getSpecificLogo"></a>
# **getSpecificLogo**
> Picture getSpecificLogo(albumId, logoId, userId).execute();

Get a specific custom showcase logo

This method returns a single custom logo of the specified showcase. The authenticated user must be the owner of the showcase.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ShowcasesCustomShowcaseLogosApi;
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
    Double logoId = 12345D; // The ID of the custom logo.
    Double userId = 152184D; // The ID of the user.
    try {
      Picture result = client
              .showcasesCustomShowcaseLogos
              .getSpecificLogo(albumId, logoId, userId)
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
      System.err.println("Exception when calling ShowcasesCustomShowcaseLogosApi#getSpecificLogo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Picture> response = client
              .showcasesCustomShowcaseLogos
              .getSpecificLogo(albumId, logoId, userId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ShowcasesCustomShowcaseLogosApi#getSpecificLogo");
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
| **logoId** | **Double**| The ID of the custom logo. | |
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
| **200** | The custom logo was returned. |  -  |

<a name="listAllCustomLogos"></a>
# **listAllCustomLogos**
> List&lt;Picture&gt; listAllCustomLogos(albumId, userId).page(page).perPage(perPage).execute();

Get all the custom logos of a showcase

This method returns every custom logo of the specified showcase. The authenticated user must be the owner of the showcase.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ShowcasesCustomShowcaseLogosApi;
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
              .showcasesCustomShowcaseLogos
              .listAllCustomLogos(albumId, userId)
              .page(page)
              .perPage(perPage)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShowcasesCustomShowcaseLogosApi#listAllCustomLogos");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<Picture>> response = client
              .showcasesCustomShowcaseLogos
              .listAllCustomLogos(albumId, userId)
              .page(page)
              .perPage(perPage)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ShowcasesCustomShowcaseLogosApi#listAllCustomLogos");
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
| **200** | The custom logos were returned. |  -  |

<a name="replaceLogo"></a>
# **replaceLogo**
> Picture replaceLogo(albumId, logoId, userId).showcasesCustomShowcaseLogosReplaceLogoRequest(showcasesCustomShowcaseLogosReplaceLogoRequest).execute();

Replace a custom showcase logo

This method replaces the specified custom showcase logo with a new image file. The authenticated user must be the owner of the showcase.  For information on how to upload the logo, see our [Working with Thumbnail Uploads](https://developer.vimeo.com/api/upload/thumbnails) guide.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ShowcasesCustomShowcaseLogosApi;
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
    Double logoId = 12345D; // The ID of the custom logo.
    Double userId = 152184D; // The ID of the user.
    Boolean active = true; // Whether to make this image the active showcase logo.
    try {
      Picture result = client
              .showcasesCustomShowcaseLogos
              .replaceLogo(albumId, logoId, userId)
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
      System.err.println("Exception when calling ShowcasesCustomShowcaseLogosApi#replaceLogo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Picture> response = client
              .showcasesCustomShowcaseLogos
              .replaceLogo(albumId, logoId, userId)
              .active(active)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ShowcasesCustomShowcaseLogosApi#replaceLogo");
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
| **logoId** | **Double**| The ID of the custom logo. | |
| **userId** | **Double**| The ID of the user. | |
| **showcasesCustomShowcaseLogosReplaceLogoRequest** | [**ShowcasesCustomShowcaseLogosReplaceLogoRequest**](ShowcasesCustomShowcaseLogosReplaceLogoRequest.md)|  | [optional] |

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
| **200** | The custom logo was replaced. |  -  |

