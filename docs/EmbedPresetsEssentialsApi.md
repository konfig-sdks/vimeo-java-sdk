# EmbedPresetsEssentialsApi

All URIs are relative to *https://api.vimeo.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createEmbedPreset**](EmbedPresetsEssentialsApi.md#createEmbedPreset) | **POST** /users/{user_id}/presets | Create an embed preset |
| [**createPreset**](EmbedPresetsEssentialsApi.md#createPreset) | **POST** /me/presets | Create an embed preset |
| [**editPreset**](EmbedPresetsEssentialsApi.md#editPreset) | **PATCH** /me/presets/{preset_id} | Edit an embed preset |
| [**editPreset_0**](EmbedPresetsEssentialsApi.md#editPreset_0) | **PATCH** /users/{user_id}/presets/{preset_id} | Edit an embed preset |
| [**getAllUserCreatedEmbedPresets**](EmbedPresetsEssentialsApi.md#getAllUserCreatedEmbedPresets) | **GET** /me/presets | Get all the embed presets that a user has created |
| [**getSpecificEmbedPreset**](EmbedPresetsEssentialsApi.md#getSpecificEmbedPreset) | **GET** /users/{user_id}/presets/{preset_id} | Get a specific embed preset |
| [**getSpecificPreset**](EmbedPresetsEssentialsApi.md#getSpecificPreset) | **GET** /me/presets/{preset_id} | Get a specific embed preset |
| [**getUserEmbedPresets**](EmbedPresetsEssentialsApi.md#getUserEmbedPresets) | **GET** /users/{user_id}/presets | Get all the embed presets that a user has created |


<a name="createEmbedPreset"></a>
# **createEmbedPreset**
> Preset createEmbedPreset(userId).embedPresetsEssentialsCreateEmbedPresetRequest(embedPresetsEssentialsCreateEmbedPresetRequest).execute();

Create an embed preset

This method creates an embed preset.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmbedPresetsEssentialsApi;
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
    EmbedPresetsEssentialsCreateEmbedPresetRequestEmbed embed = new EmbedPresetsEssentialsCreateEmbedPresetRequestEmbed();
    String name = "name_example"; // The name of the embed preset.
    try {
      Preset result = client
              .embedPresetsEssentials
              .createEmbedPreset(userId)
              .embed(embed)
              .name(name)
              .execute();
      System.out.println(result);
      System.out.println(result.getMetadata());
      System.out.println(result.getName());
      System.out.println(result.getSettings());
      System.out.println(result.getUri());
      System.out.println(result.getUser());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmbedPresetsEssentialsApi#createEmbedPreset");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Preset> response = client
              .embedPresetsEssentials
              .createEmbedPreset(userId)
              .embed(embed)
              .name(name)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmbedPresetsEssentialsApi#createEmbedPreset");
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
| **embedPresetsEssentialsCreateEmbedPresetRequest** | [**EmbedPresetsEssentialsCreateEmbedPresetRequest**](EmbedPresetsEssentialsCreateEmbedPresetRequest.md)|  | [optional] |

### Return type

[**Preset**](Preset.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/vnd.vimeo.preset+json
 - **Accept**: application/vnd.vimeo.preset+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The embed preset was created. |  -  |

<a name="createPreset"></a>
# **createPreset**
> Preset createPreset().embedPresetsEssentialsCreatePresetRequest(embedPresetsEssentialsCreatePresetRequest).execute();

Create an embed preset

This method creates an embed preset.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmbedPresetsEssentialsApi;
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
    EmbedPresetsEssentialsCreatePresetRequestEmbed embed = new EmbedPresetsEssentialsCreatePresetRequestEmbed();
    String name = "name_example"; // The name of the embed preset.
    try {
      Preset result = client
              .embedPresetsEssentials
              .createPreset()
              .embed(embed)
              .name(name)
              .execute();
      System.out.println(result);
      System.out.println(result.getMetadata());
      System.out.println(result.getName());
      System.out.println(result.getSettings());
      System.out.println(result.getUri());
      System.out.println(result.getUser());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmbedPresetsEssentialsApi#createPreset");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Preset> response = client
              .embedPresetsEssentials
              .createPreset()
              .embed(embed)
              .name(name)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmbedPresetsEssentialsApi#createPreset");
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
| **embedPresetsEssentialsCreatePresetRequest** | [**EmbedPresetsEssentialsCreatePresetRequest**](EmbedPresetsEssentialsCreatePresetRequest.md)|  | [optional] |

### Return type

[**Preset**](Preset.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/vnd.vimeo.preset+json
 - **Accept**: application/vnd.vimeo.preset+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The embed preset was created. |  -  |

<a name="editPreset"></a>
# **editPreset**
> Preset editPreset(presetId).embedPresetsEssentialsEditPresetRequest(embedPresetsEssentialsEditPresetRequest).execute();

Edit an embed preset

This method edits the specified embed preset. The authenticated user must be the owner of the preset.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmbedPresetsEssentialsApi;
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
    Double presetId = 12345D; // The ID of the preset.
    String outro = "nothing"; // What to do with the outro.  Option descriptions:  * `nothing` - Disable the outro. 
    try {
      Preset result = client
              .embedPresetsEssentials
              .editPreset(presetId)
              .outro(outro)
              .execute();
      System.out.println(result);
      System.out.println(result.getMetadata());
      System.out.println(result.getName());
      System.out.println(result.getSettings());
      System.out.println(result.getUri());
      System.out.println(result.getUser());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmbedPresetsEssentialsApi#editPreset");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Preset> response = client
              .embedPresetsEssentials
              .editPreset(presetId)
              .outro(outro)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmbedPresetsEssentialsApi#editPreset");
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
| **presetId** | **Double**| The ID of the preset. | |
| **embedPresetsEssentialsEditPresetRequest** | [**EmbedPresetsEssentialsEditPresetRequest**](EmbedPresetsEssentialsEditPresetRequest.md)|  | [optional] |

### Return type

[**Preset**](Preset.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/vnd.vimeo.preset+json
 - **Accept**: application/vnd.vimeo.preset+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The embed preset was edited. |  -  |

<a name="editPreset_0"></a>
# **editPreset_0**
> Preset editPreset_0(presetId, userId).embedPresetsEssentialsEditPresetRequest1(embedPresetsEssentialsEditPresetRequest1).execute();

Edit an embed preset

This method edits the specified embed preset. The authenticated user must be the owner of the preset.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmbedPresetsEssentialsApi;
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
    Double presetId = 12345D; // The ID of the preset.
    Double userId = 152184D; // The ID of the user.
    String outro = "nothing"; // What to do with the outro.  Option descriptions:  * `nothing` - Disable the outro. 
    try {
      Preset result = client
              .embedPresetsEssentials
              .editPreset_0(presetId, userId)
              .outro(outro)
              .execute();
      System.out.println(result);
      System.out.println(result.getMetadata());
      System.out.println(result.getName());
      System.out.println(result.getSettings());
      System.out.println(result.getUri());
      System.out.println(result.getUser());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmbedPresetsEssentialsApi#editPreset_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Preset> response = client
              .embedPresetsEssentials
              .editPreset_0(presetId, userId)
              .outro(outro)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmbedPresetsEssentialsApi#editPreset_0");
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
| **presetId** | **Double**| The ID of the preset. | |
| **userId** | **Double**| The ID of the user. | |
| **embedPresetsEssentialsEditPresetRequest1** | [**EmbedPresetsEssentialsEditPresetRequest1**](EmbedPresetsEssentialsEditPresetRequest1.md)|  | [optional] |

### Return type

[**Preset**](Preset.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/vnd.vimeo.preset+json
 - **Accept**: application/vnd.vimeo.preset+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The embed preset was edited. |  -  |

<a name="getAllUserCreatedEmbedPresets"></a>
# **getAllUserCreatedEmbedPresets**
> List&lt;Preset&gt; getAllUserCreatedEmbedPresets().page(page).perPage(perPage).execute();

Get all the embed presets that a user has created

This method returns every embed preset that belongs to the authenticated user.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmbedPresetsEssentialsApi;
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
    Double page = 1D; // The page number of the results to show.
    Double perPage = 10D; // The number of items to show on each page of results, up to a maximum of 100.
    try {
      List<Preset> result = client
              .embedPresetsEssentials
              .getAllUserCreatedEmbedPresets()
              .page(page)
              .perPage(perPage)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmbedPresetsEssentialsApi#getAllUserCreatedEmbedPresets");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<Preset>> response = client
              .embedPresetsEssentials
              .getAllUserCreatedEmbedPresets()
              .page(page)
              .perPage(perPage)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmbedPresetsEssentialsApi#getAllUserCreatedEmbedPresets");
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
| **page** | **Double**| The page number of the results to show. | [optional] |
| **perPage** | **Double**| The number of items to show on each page of results, up to a maximum of 100. | [optional] |

### Return type

[**List&lt;Preset&gt;**](Preset.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.vimeo.preset+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The embed presets were returned. |  -  |

<a name="getSpecificEmbedPreset"></a>
# **getSpecificEmbedPreset**
> Preset getSpecificEmbedPreset(presetId, userId).execute();

Get a specific embed preset

This method returns a single embed preset. The authenticated user must be the owner of the preset.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmbedPresetsEssentialsApi;
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
    Double presetId = 12345D; // The ID of the preset.
    Double userId = 152184D; // The ID of the user.
    try {
      Preset result = client
              .embedPresetsEssentials
              .getSpecificEmbedPreset(presetId, userId)
              .execute();
      System.out.println(result);
      System.out.println(result.getMetadata());
      System.out.println(result.getName());
      System.out.println(result.getSettings());
      System.out.println(result.getUri());
      System.out.println(result.getUser());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmbedPresetsEssentialsApi#getSpecificEmbedPreset");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Preset> response = client
              .embedPresetsEssentials
              .getSpecificEmbedPreset(presetId, userId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmbedPresetsEssentialsApi#getSpecificEmbedPreset");
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
| **presetId** | **Double**| The ID of the preset. | |
| **userId** | **Double**| The ID of the user. | |

### Return type

[**Preset**](Preset.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.vimeo.preset+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The embed preset was returned. |  -  |

<a name="getSpecificPreset"></a>
# **getSpecificPreset**
> Preset getSpecificPreset(presetId).execute();

Get a specific embed preset

This method returns a single embed preset. The authenticated user must be the owner of the preset.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmbedPresetsEssentialsApi;
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
    Double presetId = 12345D; // The ID of the preset.
    try {
      Preset result = client
              .embedPresetsEssentials
              .getSpecificPreset(presetId)
              .execute();
      System.out.println(result);
      System.out.println(result.getMetadata());
      System.out.println(result.getName());
      System.out.println(result.getSettings());
      System.out.println(result.getUri());
      System.out.println(result.getUser());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmbedPresetsEssentialsApi#getSpecificPreset");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Preset> response = client
              .embedPresetsEssentials
              .getSpecificPreset(presetId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmbedPresetsEssentialsApi#getSpecificPreset");
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
| **presetId** | **Double**| The ID of the preset. | |

### Return type

[**Preset**](Preset.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.vimeo.preset+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The embed preset was returned. |  -  |

<a name="getUserEmbedPresets"></a>
# **getUserEmbedPresets**
> List&lt;Preset&gt; getUserEmbedPresets(userId).page(page).perPage(perPage).execute();

Get all the embed presets that a user has created

This method returns every embed preset that belongs to the authenticated user.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmbedPresetsEssentialsApi;
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
    Double page = 1D; // The page number of the results to show.
    Double perPage = 10D; // The number of items to show on each page of results, up to a maximum of 100.
    try {
      List<Preset> result = client
              .embedPresetsEssentials
              .getUserEmbedPresets(userId)
              .page(page)
              .perPage(perPage)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmbedPresetsEssentialsApi#getUserEmbedPresets");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<Preset>> response = client
              .embedPresetsEssentials
              .getUserEmbedPresets(userId)
              .page(page)
              .perPage(perPage)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmbedPresetsEssentialsApi#getUserEmbedPresets");
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
| **page** | **Double**| The page number of the results to show. | [optional] |
| **perPage** | **Double**| The number of items to show on each page of results, up to a maximum of 100. | [optional] |

### Return type

[**List&lt;Preset&gt;**](Preset.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.vimeo.preset+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The embed presets were returned. |  -  |

