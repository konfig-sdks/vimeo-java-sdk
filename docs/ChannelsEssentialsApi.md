# ChannelsEssentialsApi

All URIs are relative to *https://api.vimeo.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**channel**](ChannelsEssentialsApi.md#channel) | **POST** /channels | Create a channel |
| [**channel_0**](ChannelsEssentialsApi.md#channel_0) | **GET** /channels/{channel_id} | Get a specific channel |
| [**channel_1**](ChannelsEssentialsApi.md#channel_1) | **DELETE** /channels/{channel_id} | Delete a channel |
| [**channel_2**](ChannelsEssentialsApi.md#channel_2) | **PATCH** /channels/{channel_id} | Edit a channel |
| [**channels**](ChannelsEssentialsApi.md#channels) | **GET** /channels | Get all channels |
| [**getUserSubscriptions**](ChannelsEssentialsApi.md#getUserSubscriptions) | **GET** /me/channels | Get all the channels to which a user subscribes |
| [**getUserSubscriptions_0**](ChannelsEssentialsApi.md#getUserSubscriptions_0) | **GET** /users/{user_id}/channels | Get all the channels to which a user subscribes |


<a name="channel"></a>
# **channel**
> Channel channel(createChannelRequest).execute();

Create a channel

This method creates a new channel.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ChannelsEssentialsApi;
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
    String name = "name_example"; // The name of the channel.
    String privacy = "anybody"; // The privacy level of the channel.  Option descriptions:  * `anybody` - Anyone can access the channel.  * `moderators` - Only moderators can access the channel.  * `user` - Only moderators and designated users can access the channel. 
    String description = "description_example"; // The description of the channel.
    String link = "link_example"; // The link to access the channel. You can use a custom name in the URL in place of a numeric channel ID, as in `/channels/{url_custom}`.
    try {
      Channel result = client
              .channelsEssentials
              .channel(name, privacy)
              .description(description)
              .link(link)
              .execute();
      System.out.println(result);
      System.out.println(result.getTags());
      System.out.println(result.getDescription());
      System.out.println(result.getCategories());
      System.out.println(result.getCreatedTime());
      System.out.println(result.getHeader());
      System.out.println(result.getLink());
      System.out.println(result.getMetadata());
      System.out.println(result.getModifiedTime());
      System.out.println(result.getName());
      System.out.println(result.getPictures());
      System.out.println(result.getPrivacy());
      System.out.println(result.getResourceKey());
      System.out.println(result.getUri());
      System.out.println(result.getUser());
    } catch (ApiException e) {
      System.err.println("Exception when calling ChannelsEssentialsApi#channel");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Channel> response = client
              .channelsEssentials
              .channel(name, privacy)
              .description(description)
              .link(link)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ChannelsEssentialsApi#channel");
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
| **createChannelRequest** | [**CreateChannelRequest**](CreateChannelRequest.md)|  | |

### Return type

[**Channel**](Channel.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/vnd.vimeo.channel+json
 - **Accept**: application/vnd.vimeo.channel+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The channel was created. |  -  |

<a name="channel_0"></a>
# **channel_0**
> Channel channel_0(channelId).execute();

Get a specific channel

This method returns a single channel.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ChannelsEssentialsApi;
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
      Channel result = client
              .channelsEssentials
              .channel_0(channelId)
              .execute();
      System.out.println(result);
      System.out.println(result.getTags());
      System.out.println(result.getDescription());
      System.out.println(result.getCategories());
      System.out.println(result.getCreatedTime());
      System.out.println(result.getHeader());
      System.out.println(result.getLink());
      System.out.println(result.getMetadata());
      System.out.println(result.getModifiedTime());
      System.out.println(result.getName());
      System.out.println(result.getPictures());
      System.out.println(result.getPrivacy());
      System.out.println(result.getResourceKey());
      System.out.println(result.getUri());
      System.out.println(result.getUser());
    } catch (ApiException e) {
      System.err.println("Exception when calling ChannelsEssentialsApi#channel_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Channel> response = client
              .channelsEssentials
              .channel_0(channelId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ChannelsEssentialsApi#channel_0");
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

[**Channel**](Channel.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.vimeo.channel+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The channel was returned. |  -  |

<a name="channel_1"></a>
# **channel_1**
> channel_1(channelId).execute();

Delete a channel

This method deletes the specified channel.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ChannelsEssentialsApi;
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
      client
              .channelsEssentials
              .channel_1(channelId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ChannelsEssentialsApi#channel_1");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .channelsEssentials
              .channel_1(channelId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ChannelsEssentialsApi#channel_1");
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

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | The channel was deleted. |  -  |

<a name="channel_2"></a>
# **channel_2**
> Channel channel_2(channelId).editChannelRequest(editChannelRequest).execute();

Edit a channel

This method edits the specified channel.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ChannelsEssentialsApi;
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
    String description = "description_example"; // The description of the channel.
    String link = "link_example"; // The link to access the channel. You can use a custom name in the URL in place of a numeric channel ID, as in `/channels/{url_custom}`. Submitting `\\\"\\\"` for this field removes the link alias.
    String name = "name_example"; // The name of the channel.
    String privacy = "anybody"; // The privacy level of the channel.  Option descriptions:  * `anybody` - Anyone can access the channel.  * `moderators` - Only moderators can access the channel.  * `users` - Only moderators and designated users can access the channel. 
    try {
      Channel result = client
              .channelsEssentials
              .channel_2(channelId)
              .description(description)
              .link(link)
              .name(name)
              .privacy(privacy)
              .execute();
      System.out.println(result);
      System.out.println(result.getTags());
      System.out.println(result.getDescription());
      System.out.println(result.getCategories());
      System.out.println(result.getCreatedTime());
      System.out.println(result.getHeader());
      System.out.println(result.getLink());
      System.out.println(result.getMetadata());
      System.out.println(result.getModifiedTime());
      System.out.println(result.getName());
      System.out.println(result.getPictures());
      System.out.println(result.getPrivacy());
      System.out.println(result.getResourceKey());
      System.out.println(result.getUri());
      System.out.println(result.getUser());
    } catch (ApiException e) {
      System.err.println("Exception when calling ChannelsEssentialsApi#channel_2");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Channel> response = client
              .channelsEssentials
              .channel_2(channelId)
              .description(description)
              .link(link)
              .name(name)
              .privacy(privacy)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ChannelsEssentialsApi#channel_2");
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
| **editChannelRequest** | [**EditChannelRequest**](EditChannelRequest.md)|  | [optional] |

### Return type

[**Channel**](Channel.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/vnd.vimeo.channel+json
 - **Accept**: application/vnd.vimeo.channel+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The channel was edited. |  -  |

<a name="channels"></a>
# **channels**
> List&lt;Channel&gt; channels().direction(direction).filter(filter).page(page).perPage(perPage).query(query).sort(sort).execute();

Get all channels

This method returns all available channels.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ChannelsEssentialsApi;
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
    String filter = "featured"; // The attribute by which to filter the results.  Option descriptions:  * `featured` - Return featured channels. 
    Double page = 1D; // The page number of the results to show.
    Double perPage = 10D; // The number of items to show on each page of results, up to a maximum of 100.
    String query = "Stop motion"; // The search query to use to filter the results.
    String sort = "alphabetical"; // The way to sort the results.  Option descriptions:  * `alphabetical` - Sort the results alphabetically.  * `date` - Sort the results by creation date.  * `default` - Sort the results by creation date.  * `followers` - Sort the results by number of followers.  * `relevant` - Sort the results by relevance. This option is available for search queries only.  * `videos` - Sort the results by number of videos. 
    try {
      List<Channel> result = client
              .channelsEssentials
              .channels()
              .direction(direction)
              .filter(filter)
              .page(page)
              .perPage(perPage)
              .query(query)
              .sort(sort)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChannelsEssentialsApi#channels");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<Channel>> response = client
              .channelsEssentials
              .channels()
              .direction(direction)
              .filter(filter)
              .page(page)
              .perPage(perPage)
              .query(query)
              .sort(sort)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ChannelsEssentialsApi#channels");
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
| **filter** | **String**| The attribute by which to filter the results.  Option descriptions:  * &#x60;featured&#x60; - Return featured channels.  | [optional] [enum: featured] |
| **page** | **Double**| The page number of the results to show. | [optional] |
| **perPage** | **Double**| The number of items to show on each page of results, up to a maximum of 100. | [optional] |
| **query** | **String**| The search query to use to filter the results. | [optional] |
| **sort** | **String**| The way to sort the results.  Option descriptions:  * &#x60;alphabetical&#x60; - Sort the results alphabetically.  * &#x60;date&#x60; - Sort the results by creation date.  * &#x60;default&#x60; - Sort the results by creation date.  * &#x60;followers&#x60; - Sort the results by number of followers.  * &#x60;relevant&#x60; - Sort the results by relevance. This option is available for search queries only.  * &#x60;videos&#x60; - Sort the results by number of videos.  | [optional] [enum: alphabetical, date, default, followers, relevant, videos] |

### Return type

[**List&lt;Channel&gt;**](Channel.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.vimeo.channel+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The channels were returned. |  -  |

<a name="getUserSubscriptions"></a>
# **getUserSubscriptions**
> List&lt;Channel&gt; getUserSubscriptions().direction(direction).filter(filter).page(page).perPage(perPage).query(query).sort(sort).execute();

Get all the channels to which a user subscribes

This method returns all the channels to which the specified user subscribes.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ChannelsEssentialsApi;
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
    String filter = "moderated"; // The attribute by which to filter the results.  Option descriptions:  * `moderated` - Return moderated channels. 
    Double page = 1D; // The page number of the results to show.
    Double perPage = 10D; // The number of items to show on each page of results, up to a maximum of 100.
    String query = "Stop motion"; // The search query to use to filter the results.
    String sort = "alphabetical"; // The way to sort the results.  Option descriptions:  * `alphabetical` - Sort the results alphabetically.  * `date` - Sort the results by creation date.  * `followers` - Sort the results by number of followers.  * `videos` - Sort the results by number of videos. 
    try {
      List<Channel> result = client
              .channelsEssentials
              .getUserSubscriptions()
              .direction(direction)
              .filter(filter)
              .page(page)
              .perPage(perPage)
              .query(query)
              .sort(sort)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChannelsEssentialsApi#getUserSubscriptions");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<Channel>> response = client
              .channelsEssentials
              .getUserSubscriptions()
              .direction(direction)
              .filter(filter)
              .page(page)
              .perPage(perPage)
              .query(query)
              .sort(sort)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ChannelsEssentialsApi#getUserSubscriptions");
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
| **filter** | **String**| The attribute by which to filter the results.  Option descriptions:  * &#x60;moderated&#x60; - Return moderated channels.  | [optional] [enum: moderated] |
| **page** | **Double**| The page number of the results to show. | [optional] |
| **perPage** | **Double**| The number of items to show on each page of results, up to a maximum of 100. | [optional] |
| **query** | **String**| The search query to use to filter the results. | [optional] |
| **sort** | **String**| The way to sort the results.  Option descriptions:  * &#x60;alphabetical&#x60; - Sort the results alphabetically.  * &#x60;date&#x60; - Sort the results by creation date.  * &#x60;followers&#x60; - Sort the results by number of followers.  * &#x60;videos&#x60; - Sort the results by number of videos.  | [optional] [enum: alphabetical, date, followers, videos] |

### Return type

[**List&lt;Channel&gt;**](Channel.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.vimeo.channel+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The channels were returned. |  -  |
| **304** | No channel has been followed since the given &#x60;If-Modified-Since&#x60; header. |  -  |

<a name="getUserSubscriptions_0"></a>
# **getUserSubscriptions_0**
> List&lt;Channel&gt; getUserSubscriptions_0(userId).direction(direction).filter(filter).page(page).perPage(perPage).query(query).sort(sort).execute();

Get all the channels to which a user subscribes

This method returns all the channels to which the specified user subscribes.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ChannelsEssentialsApi;
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
    String filter = "moderated"; // The attribute by which to filter the results.  Option descriptions:  * `moderated` - Return moderated channels. 
    Double page = 1D; // The page number of the results to show.
    Double perPage = 10D; // The number of items to show on each page of results, up to a maximum of 100.
    String query = "Stop motion"; // The search query to use to filter the results.
    String sort = "alphabetical"; // The way to sort the results.  Option descriptions:  * `alphabetical` - Sort the results alphabetically.  * `date` - Sort the results by creation date.  * `followers` - Sort the results by number of followers.  * `videos` - Sort the results by number of videos. 
    try {
      List<Channel> result = client
              .channelsEssentials
              .getUserSubscriptions_0(userId)
              .direction(direction)
              .filter(filter)
              .page(page)
              .perPage(perPage)
              .query(query)
              .sort(sort)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChannelsEssentialsApi#getUserSubscriptions_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<Channel>> response = client
              .channelsEssentials
              .getUserSubscriptions_0(userId)
              .direction(direction)
              .filter(filter)
              .page(page)
              .perPage(perPage)
              .query(query)
              .sort(sort)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ChannelsEssentialsApi#getUserSubscriptions_0");
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
| **filter** | **String**| The attribute by which to filter the results.  Option descriptions:  * &#x60;moderated&#x60; - Return moderated channels.  | [optional] [enum: moderated] |
| **page** | **Double**| The page number of the results to show. | [optional] |
| **perPage** | **Double**| The number of items to show on each page of results, up to a maximum of 100. | [optional] |
| **query** | **String**| The search query to use to filter the results. | [optional] |
| **sort** | **String**| The way to sort the results.  Option descriptions:  * &#x60;alphabetical&#x60; - Sort the results alphabetically.  * &#x60;date&#x60; - Sort the results by creation date.  * &#x60;followers&#x60; - Sort the results by number of followers.  * &#x60;videos&#x60; - Sort the results by number of videos.  | [optional] [enum: alphabetical, date, followers, videos] |

### Return type

[**List&lt;Channel&gt;**](Channel.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.vimeo.channel+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The channels were returned. |  -  |
| **304** | No channel has been followed since the given &#x60;If-Modified-Since&#x60; header. |  -  |

