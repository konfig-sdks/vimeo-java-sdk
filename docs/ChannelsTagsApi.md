# ChannelsTagsApi

All URIs are relative to *https://api.vimeo.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addMultipleTagsToChannel**](ChannelsTagsApi.md#addMultipleTagsToChannel) | **PUT** /channels/{channel_id}/tags | Add a list of tags to a channel |
| [**addTagToChannel**](ChannelsTagsApi.md#addTagToChannel) | **PUT** /channels/{channel_id}/tags/{word} | Add a specific tag to a channel |
| [**checkIfTagAddedToChannel**](ChannelsTagsApi.md#checkIfTagAddedToChannel) | **GET** /channels/{channel_id}/tags/{word} | Check if a tag has been added to a channel |
| [**getAllChannelTags**](ChannelsTagsApi.md#getAllChannelTags) | **GET** /channels/{channel_id}/tags | Get all the tags that have been added to a channel |
| [**removeTagFromChannel**](ChannelsTagsApi.md#removeTagFromChannel) | **DELETE** /channels/{channel_id}/tags/{word} | Remove a tag from a channel |


<a name="addMultipleTagsToChannel"></a>
# **addMultipleTagsToChannel**
> List&lt;Tag&gt; addMultipleTagsToChannel(channelId, channelsTagsAddMultipleTagsToChannelRequest).execute();

Add a list of tags to a channel

This method adds multiple tags to the specified channel. Include the tags as a JSON array in the body of the request using the **tag** field, like this: &#x60;[{ \&quot;tag\&quot;: \&quot;funny\&quot; }, { \&quot;tag\&quot;: \&quot;concert\&quot; }]&#x60;. The authenticated user must be the owner of the channel. For more information on batch requests like this one, see [Using Common Formats and Parameters](https://developer.vimeo.com/api/common-formats#working-with-batch-requests).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ChannelsTagsApi;
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
    List<String> tag = Arrays.asList(); // An array of tags to assign.
    Double channelId = 927D; // The ID of the channel.
    try {
      List<Tag> result = client
              .channelsTags
              .addMultipleTagsToChannel(tag, channelId)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChannelsTagsApi#addMultipleTagsToChannel");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<Tag>> response = client
              .channelsTags
              .addMultipleTagsToChannel(tag, channelId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ChannelsTagsApi#addMultipleTagsToChannel");
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
| **channelId** | **Double**| The ID of the channel. | |
| **channelsTagsAddMultipleTagsToChannelRequest** | [**ChannelsTagsAddMultipleTagsToChannelRequest**](ChannelsTagsAddMultipleTagsToChannelRequest.md)|  | |

### Return type

[**List&lt;Tag&gt;**](Tag.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/vnd.vimeo.tag+json
 - **Accept**: application/vnd.vimeo.tag+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The tags were added. |  -  |

<a name="addTagToChannel"></a>
# **addTagToChannel**
> addTagToChannel(channelId, word).execute();

Add a specific tag to a channel

This method adds a single tag to the specified channel. The authenticated user must be the owner of the channel.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ChannelsTagsApi;
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
    Double channelId = 927D; // The ID of the channel.
    String word = "awesome"; // The word to use as the tag.
    try {
      client
              .channelsTags
              .addTagToChannel(channelId, word)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ChannelsTagsApi#addTagToChannel");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .channelsTags
              .addTagToChannel(channelId, word)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ChannelsTagsApi#addTagToChannel");
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
| **channelId** | **Double**| The ID of the channel. | |
| **word** | **String**| The word to use as the tag. | |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.vimeo.tag+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | The tag was added. |  -  |

<a name="checkIfTagAddedToChannel"></a>
# **checkIfTagAddedToChannel**
> checkIfTagAddedToChannel(channelId, word).execute();

Check if a tag has been added to a channel

This method determines whether a tag has been added to the specified channel.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ChannelsTagsApi;
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
    Double channelId = 927D; // The ID of the channel.
    String word = "awesome"; // The word to use as the tag.
    try {
      client
              .channelsTags
              .checkIfTagAddedToChannel(channelId, word)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ChannelsTagsApi#checkIfTagAddedToChannel");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .channelsTags
              .checkIfTagAddedToChannel(channelId, word)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ChannelsTagsApi#checkIfTagAddedToChannel");
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
| **channelId** | **Double**| The ID of the channel. | |
| **word** | **String**| The word to use as the tag. | |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.vimeo.tag+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | The tag has been added to the channel. |  -  |

<a name="getAllChannelTags"></a>
# **getAllChannelTags**
> List&lt;Tag&gt; getAllChannelTags(channelId).execute();

Get all the tags that have been added to a channel

This method returns every tag that has been added to the specified channel.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ChannelsTagsApi;
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
    Double channelId = 927D; // The ID of the channel.
    try {
      List<Tag> result = client
              .channelsTags
              .getAllChannelTags(channelId)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChannelsTagsApi#getAllChannelTags");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<Tag>> response = client
              .channelsTags
              .getAllChannelTags(channelId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ChannelsTagsApi#getAllChannelTags");
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
| **channelId** | **Double**| The ID of the channel. | |

### Return type

[**List&lt;Tag&gt;**](Tag.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.vimeo.tag+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The tags were returned. |  -  |

<a name="removeTagFromChannel"></a>
# **removeTagFromChannel**
> removeTagFromChannel(channelId, word).execute();

Remove a tag from a channel

This method removes a single tag from the specified channel. The authenticated user must be the owner of the channel.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ChannelsTagsApi;
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
    Double channelId = 927D; // The ID of the channel.
    String word = "awesome"; // The word to use as the tag.
    try {
      client
              .channelsTags
              .removeTagFromChannel(channelId, word)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ChannelsTagsApi#removeTagFromChannel");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .channelsTags
              .removeTagFromChannel(channelId, word)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ChannelsTagsApi#removeTagFromChannel");
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
| **channelId** | **Double**| The ID of the channel. | |
| **word** | **String**| The word to use as the tag. | |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.vimeo.tag+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | The tag was removed. |  -  |

