# UsersFeedsApi

All URIs are relative to *https://api.vimeo.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**feed**](UsersFeedsApi.md#feed) | **GET** /users/{user_id}/feed | Get all the videos in the user&#39;s feed |
| [**getUserFeedVideos**](UsersFeedsApi.md#getUserFeedVideos) | **GET** /me/feed | Get all the videos in the user&#39;s feed |


<a name="feed"></a>
# **feed**
> List&lt;Activity31&gt; feed(userId).offset(offset).page(page).perPage(perPage).type(type).execute();

Get all the videos in the user&#39;s feed

This method returns every video in the authenticated user&#39;s feed.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UsersFeedsApi;
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
    String offset = "280"; // The pagination offset. We recommend that you use the pagination links in the feed response instead of working with this value directly. For more details, see our [pagination documentation](https://developer.vimeo.com/api/common-formats#using-the-pagination-parameter).
    Double page = 1D; // The page number of the results to show.
    Double perPage = 10D; // The number of items to show on each page of results, up to a maximum of 100.
    String type = "appears"; // The feed type.  Option descriptions:  * `appears` - Videos in which the user appears.  * `category_featured` - Featured videos.  * `channel` - Channel videos.  * `facebook_feed` - Videos from the user's Facebook feed.  * `following` - Videos from accounts that the user follows.  * `group` - Group videos.  * `likes` - Liked videos.  * `ondemand_publish` - On Demand videos.  * `share` - Shared videos.  * `tagged_with` - Tagged videos.  * `twitter_timeline` - Videos from the user's Twitter timeline.  * `uploads` - Uploaded videos. 
    try {
      List<Activity31> result = client
              .usersFeeds
              .feed(userId)
              .offset(offset)
              .page(page)
              .perPage(perPage)
              .type(type)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersFeedsApi#feed");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<Activity31>> response = client
              .usersFeeds
              .feed(userId)
              .offset(offset)
              .page(page)
              .perPage(perPage)
              .type(type)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersFeedsApi#feed");
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
| **offset** | **String**| The pagination offset. We recommend that you use the pagination links in the feed response instead of working with this value directly. For more details, see our [pagination documentation](https://developer.vimeo.com/api/common-formats#using-the-pagination-parameter). | [optional] |
| **page** | **Double**| The page number of the results to show. | [optional] |
| **perPage** | **Double**| The number of items to show on each page of results, up to a maximum of 100. | [optional] |
| **type** | **String**| The feed type.  Option descriptions:  * &#x60;appears&#x60; - Videos in which the user appears.  * &#x60;category_featured&#x60; - Featured videos.  * &#x60;channel&#x60; - Channel videos.  * &#x60;facebook_feed&#x60; - Videos from the user&#39;s Facebook feed.  * &#x60;following&#x60; - Videos from accounts that the user follows.  * &#x60;group&#x60; - Group videos.  * &#x60;likes&#x60; - Liked videos.  * &#x60;ondemand_publish&#x60; - On Demand videos.  * &#x60;share&#x60; - Shared videos.  * &#x60;tagged_with&#x60; - Tagged videos.  * &#x60;twitter_timeline&#x60; - Videos from the user&#39;s Twitter timeline.  * &#x60;uploads&#x60; - Uploaded videos.  | [optional] [enum: appears, category_featured, channel, facebook_feed, following, group, likes, ondemand_publish, share, tagged_with, twitter_timeline, uploads] |

### Return type

[**List&lt;Activity31&gt;**](Activity31.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.vimeo.activity+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The videos were returned. |  -  |

<a name="getUserFeedVideos"></a>
# **getUserFeedVideos**
> List&lt;Activity31&gt; getUserFeedVideos().offset(offset).page(page).perPage(perPage).type(type).execute();

Get all the videos in the user&#39;s feed

This method returns every video in the authenticated user&#39;s feed.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UsersFeedsApi;
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
    String offset = "280"; // The pagination offset. We recommend that you use the pagination links in the feed response instead of working with this value directly. For more details, see our [pagination documentation](https://developer.vimeo.com/api/common-formats#using-the-pagination-parameter).
    Double page = 1D; // The page number of the results to show.
    Double perPage = 10D; // The number of items to show on each page of results, up to a maximum of 100.
    String type = "appears"; // The feed type.  Option descriptions:  * `appears` - Videos in which the user appears.  * `category_featured` - Featured videos.  * `channel` - Channel videos.  * `facebook_feed` - Videos from the user's Facebook feed.  * `following` - Videos from accounts that the user follows.  * `group` - Group videos.  * `likes` - Liked videos.  * `ondemand_publish` - On Demand videos.  * `share` - Shared videos.  * `tagged_with` - Tagged videos.  * `twitter_timeline` - Videos from the user's Twitter timeline.  * `uploads` - Uploaded videos. 
    try {
      List<Activity31> result = client
              .usersFeeds
              .getUserFeedVideos()
              .offset(offset)
              .page(page)
              .perPage(perPage)
              .type(type)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersFeedsApi#getUserFeedVideos");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<Activity31>> response = client
              .usersFeeds
              .getUserFeedVideos()
              .offset(offset)
              .page(page)
              .perPage(perPage)
              .type(type)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersFeedsApi#getUserFeedVideos");
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
| **offset** | **String**| The pagination offset. We recommend that you use the pagination links in the feed response instead of working with this value directly. For more details, see our [pagination documentation](https://developer.vimeo.com/api/common-formats#using-the-pagination-parameter). | [optional] |
| **page** | **Double**| The page number of the results to show. | [optional] |
| **perPage** | **Double**| The number of items to show on each page of results, up to a maximum of 100. | [optional] |
| **type** | **String**| The feed type.  Option descriptions:  * &#x60;appears&#x60; - Videos in which the user appears.  * &#x60;category_featured&#x60; - Featured videos.  * &#x60;channel&#x60; - Channel videos.  * &#x60;facebook_feed&#x60; - Videos from the user&#39;s Facebook feed.  * &#x60;following&#x60; - Videos from accounts that the user follows.  * &#x60;group&#x60; - Group videos.  * &#x60;likes&#x60; - Liked videos.  * &#x60;ondemand_publish&#x60; - On Demand videos.  * &#x60;share&#x60; - Shared videos.  * &#x60;tagged_with&#x60; - Tagged videos.  * &#x60;twitter_timeline&#x60; - Videos from the user&#39;s Twitter timeline.  * &#x60;uploads&#x60; - Uploaded videos.  | [optional] [enum: appears, category_featured, channel, facebook_feed, following, group, likes, ondemand_publish, share, tagged_with, twitter_timeline, uploads] |

### Return type

[**List&lt;Activity31&gt;**](Activity31.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.vimeo.activity+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The videos were returned. |  -  |

