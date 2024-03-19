# UsersAnalyticsApi

All URIs are relative to *https://api.vimeo.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getMetrics**](UsersAnalyticsApi.md#getMetrics) | **GET** /users/{user_id}/analytics | Get analytics for the user |
| [**getUserMetrics**](UsersAnalyticsApi.md#getUserMetrics) | **GET** /me/analytics | Get analytics for the user |


<a name="getMetrics"></a>
# **getMetrics**
> List&lt;Analytics&gt; getMetrics(userId, dimension, from, to).direction(direction).filterContent(filterContent).filterCountries(filterCountries).filterDeviceTypes(filterDeviceTypes).filterEmbedDomains(filterEmbedDomains).filterStreamingTypes(filterStreamingTypes).page(page).perPage(perPage).sort(sort).timeInterval(timeInterval).execute();

Get analytics for the user

This method returns analytic metrics for the authenticated user.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UsersAnalyticsApi;
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
    Double userId = 123456D; // The ID of the user.
    String dimension = "country"; // The data dimension by which to group the results.  Option descriptions:  * `country` - Group the results by country.  * `device_type` - Group the results by device type.  * `embed_domain` - Group the results by embed domain.  * `total` - Group the results by the time range provided.  * `video` - Group the results by video. 
    String from = "2021-05-30T00:00:00+00:00"; // The start date of the range of results in ISO 8601 format.
    String to = "2021-06-30T23:59:59+00:00"; // The end date of the range of results in ISO 8601 format.
    String direction = "asc"; // The sort direction of the results.  Option descriptions:  * `asc` - Sort the results in ascending order.  * `desc` - Sort the results in descending order. 
    String filterContent = "/folder/1233456,/video/7890123,/folder/123"; // A comma-separated list of video, folder, or event URIs to filter.
    List<String> filterCountries = Arrays.asList(); // A comma-separated list of country codes in ISO-3166 format to filter on.
    List<String> filterDeviceTypes = Arrays.asList(); // A comma-separated list of device types to filter on.
    List<String> filterEmbedDomains = Arrays.asList(); // A comma-separated list of domain names to filter on.
    List<String> filterStreamingTypes = Arrays.asList(); // A comma-separated list of streaming types to filter on.
    Double page = 1D; // The page number of the results to show.
    Double perPage = 50D; // The maximum number of items returned from the request, up to a limit of 1000 items. The default value is `50`.
    String sort = "average_percent_watched"; // The way to sort the results.  Option descriptions:  * `average_percent_watched` - Sort the results by mean seconds played.  * `average_time_watched` - Sort the results by mean percentage played.  * `comments` - Sort the results by the number of comments.  * `country` - Sort the results by country.  * `default` - Sort the results by the values of both the **dimension** and **time_interval** fields.  * `device_type` - Sort the results by device type.  * `downloads` - Sort the results by the number of downloads.  * `embed_domain` - Sort the results by embed domain.  * `finishes` - Sort the results by the number of complete plays.  * `impressions` - Sort the results by the number of impressions.  * `like` - Sort the results by the number of likes.  * `time` - Sort the results by the value of the **start_date** field. This option is available only when the value of **time_interval** isn't `none`.  * `total_time_watched` - Sort the results by total seconds played.  * `unique_impressions` - Sort the results by unique impressions.  * `unique_viewers` - Sort the results by unique viewers.  * `video` - Sort the results by video ID.  * `views` - Sort the results by the number of views. 
    String timeInterval = "day"; // The interval by which to aggregate the data according to the specified data dimension. The default value is `none`.  Option descriptions:  * `day` - Aggregate the results by day according to the specified data dimension.  * `month` - Aggregate the results by month according to the specified data dimension.  * `none` - The results are not aggregated by time interval.  * `week` - Aggregate the results by week according to the specified data dimension.  * `year` - Aggregate the results by year according to the specified data dimension. 
    try {
      List<Analytics> result = client
              .usersAnalytics
              .getMetrics(userId, dimension, from, to)
              .direction(direction)
              .filterContent(filterContent)
              .filterCountries(filterCountries)
              .filterDeviceTypes(filterDeviceTypes)
              .filterEmbedDomains(filterEmbedDomains)
              .filterStreamingTypes(filterStreamingTypes)
              .page(page)
              .perPage(perPage)
              .sort(sort)
              .timeInterval(timeInterval)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersAnalyticsApi#getMetrics");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<Analytics>> response = client
              .usersAnalytics
              .getMetrics(userId, dimension, from, to)
              .direction(direction)
              .filterContent(filterContent)
              .filterCountries(filterCountries)
              .filterDeviceTypes(filterDeviceTypes)
              .filterEmbedDomains(filterEmbedDomains)
              .filterStreamingTypes(filterStreamingTypes)
              .page(page)
              .perPage(perPage)
              .sort(sort)
              .timeInterval(timeInterval)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersAnalyticsApi#getMetrics");
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
| **dimension** | **String**| The data dimension by which to group the results.  Option descriptions:  * &#x60;country&#x60; - Group the results by country.  * &#x60;device_type&#x60; - Group the results by device type.  * &#x60;embed_domain&#x60; - Group the results by embed domain.  * &#x60;total&#x60; - Group the results by the time range provided.  * &#x60;video&#x60; - Group the results by video.  | [enum: country, device_type, embed_domain, total, video] |
| **from** | **String**| The start date of the range of results in ISO 8601 format. | |
| **to** | **String**| The end date of the range of results in ISO 8601 format. | |
| **direction** | **String**| The sort direction of the results.  Option descriptions:  * &#x60;asc&#x60; - Sort the results in ascending order.  * &#x60;desc&#x60; - Sort the results in descending order.  | [optional] [enum: asc, desc] |
| **filterContent** | **String**| A comma-separated list of video, folder, or event URIs to filter. | [optional] |
| **filterCountries** | [**List&lt;String&gt;**](String.md)| A comma-separated list of country codes in ISO-3166 format to filter on. | [optional] |
| **filterDeviceTypes** | [**List&lt;String&gt;**](String.md)| A comma-separated list of device types to filter on. | [optional] |
| **filterEmbedDomains** | [**List&lt;String&gt;**](String.md)| A comma-separated list of domain names to filter on. | [optional] |
| **filterStreamingTypes** | [**List&lt;String&gt;**](String.md)| A comma-separated list of streaming types to filter on. | [optional] |
| **page** | **Double**| The page number of the results to show. | [optional] |
| **perPage** | **Double**| The maximum number of items returned from the request, up to a limit of 1000 items. The default value is &#x60;50&#x60;. | [optional] |
| **sort** | **String**| The way to sort the results.  Option descriptions:  * &#x60;average_percent_watched&#x60; - Sort the results by mean seconds played.  * &#x60;average_time_watched&#x60; - Sort the results by mean percentage played.  * &#x60;comments&#x60; - Sort the results by the number of comments.  * &#x60;country&#x60; - Sort the results by country.  * &#x60;default&#x60; - Sort the results by the values of both the **dimension** and **time_interval** fields.  * &#x60;device_type&#x60; - Sort the results by device type.  * &#x60;downloads&#x60; - Sort the results by the number of downloads.  * &#x60;embed_domain&#x60; - Sort the results by embed domain.  * &#x60;finishes&#x60; - Sort the results by the number of complete plays.  * &#x60;impressions&#x60; - Sort the results by the number of impressions.  * &#x60;like&#x60; - Sort the results by the number of likes.  * &#x60;time&#x60; - Sort the results by the value of the **start_date** field. This option is available only when the value of **time_interval** isn&#39;t &#x60;none&#x60;.  * &#x60;total_time_watched&#x60; - Sort the results by total seconds played.  * &#x60;unique_impressions&#x60; - Sort the results by unique impressions.  * &#x60;unique_viewers&#x60; - Sort the results by unique viewers.  * &#x60;video&#x60; - Sort the results by video ID.  * &#x60;views&#x60; - Sort the results by the number of views.  | [optional] [enum: average_percent_watched, average_time_watched, comments, country, default, device_type, downloads, embed_domain, finishes, impressions, like, time, total_time_watched, unique_impressions, unique_viewers, video, views] |
| **timeInterval** | **String**| The interval by which to aggregate the data according to the specified data dimension. The default value is &#x60;none&#x60;.  Option descriptions:  * &#x60;day&#x60; - Aggregate the results by day according to the specified data dimension.  * &#x60;month&#x60; - Aggregate the results by month according to the specified data dimension.  * &#x60;none&#x60; - The results are not aggregated by time interval.  * &#x60;week&#x60; - Aggregate the results by week according to the specified data dimension.  * &#x60;year&#x60; - Aggregate the results by year according to the specified data dimension.  | [optional] [enum: day, month, none, week, year] |

### Return type

[**List&lt;Analytics&gt;**](Analytics.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.vimeo.analytics+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The analytics were returned. |  -  |

<a name="getUserMetrics"></a>
# **getUserMetrics**
> List&lt;Analytics&gt; getUserMetrics(dimension, from, to).direction(direction).filterContent(filterContent).filterCountries(filterCountries).filterDeviceTypes(filterDeviceTypes).filterEmbedDomains(filterEmbedDomains).filterStreamingTypes(filterStreamingTypes).page(page).perPage(perPage).sort(sort).timeInterval(timeInterval).execute();

Get analytics for the user

This method returns analytic metrics for the authenticated user.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UsersAnalyticsApi;
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
    String dimension = "country"; // The data dimension by which to group the results.  Option descriptions:  * `country` - Group the results by country.  * `device_type` - Group the results by device type.  * `embed_domain` - Group the results by embed domain.  * `total` - Group the results by the time range provided.  * `video` - Group the results by video. 
    String from = "2021-05-30T00:00:00+00:00"; // The start date of the range of results in ISO 8601 format.
    String to = "2021-06-30T23:59:59+00:00"; // The end date of the range of results in ISO 8601 format.
    String direction = "asc"; // The sort direction of the results.  Option descriptions:  * `asc` - Sort the results in ascending order.  * `desc` - Sort the results in descending order. 
    String filterContent = "/folder/1233456,/video/7890123,/folder/123"; // A comma-separated list of video, folder, or event URIs to filter.
    List<String> filterCountries = Arrays.asList(); // A comma-separated list of country codes in ISO-3166 format to filter on.
    List<String> filterDeviceTypes = Arrays.asList(); // A comma-separated list of device types to filter on.
    List<String> filterEmbedDomains = Arrays.asList(); // A comma-separated list of domain names to filter on.
    List<String> filterStreamingTypes = Arrays.asList(); // A comma-separated list of streaming types to filter on.
    Double page = 1D; // The page number of the results to show.
    Double perPage = 50D; // The maximum number of items returned from the request, up to a limit of 1000 items. The default value is `50`.
    String sort = "average_percent_watched"; // The way to sort the results.  Option descriptions:  * `average_percent_watched` - Sort the results by mean seconds played.  * `average_time_watched` - Sort the results by mean percentage played.  * `comments` - Sort the results by the number of comments.  * `country` - Sort the results by country.  * `default` - Sort the results by the values of both the **dimension** and **time_interval** fields.  * `device_type` - Sort the results by device type.  * `downloads` - Sort the results by the number of downloads.  * `embed_domain` - Sort the results by embed domain.  * `finishes` - Sort the results by the number of complete plays.  * `impressions` - Sort the results by the number of impressions.  * `like` - Sort the results by the number of likes.  * `time` - Sort the results by the value of the **start_date** field. This option is available only when the value of **time_interval** isn't `none`.  * `total_time_watched` - Sort the results by total seconds played.  * `unique_impressions` - Sort the results by unique impressions.  * `unique_viewers` - Sort the results by unique viewers.  * `video` - Sort the results by video ID.  * `views` - Sort the results by the number of views. 
    String timeInterval = "day"; // The interval by which to aggregate the data according to the specified data dimension. The default value is `none`.  Option descriptions:  * `day` - Aggregate the results by day according to the specified data dimension.  * `month` - Aggregate the results by month according to the specified data dimension.  * `none` - The results are not aggregated by time interval.  * `week` - Aggregate the results by week according to the specified data dimension.  * `year` - Aggregate the results by year according to the specified data dimension. 
    try {
      List<Analytics> result = client
              .usersAnalytics
              .getUserMetrics(dimension, from, to)
              .direction(direction)
              .filterContent(filterContent)
              .filterCountries(filterCountries)
              .filterDeviceTypes(filterDeviceTypes)
              .filterEmbedDomains(filterEmbedDomains)
              .filterStreamingTypes(filterStreamingTypes)
              .page(page)
              .perPage(perPage)
              .sort(sort)
              .timeInterval(timeInterval)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersAnalyticsApi#getUserMetrics");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<Analytics>> response = client
              .usersAnalytics
              .getUserMetrics(dimension, from, to)
              .direction(direction)
              .filterContent(filterContent)
              .filterCountries(filterCountries)
              .filterDeviceTypes(filterDeviceTypes)
              .filterEmbedDomains(filterEmbedDomains)
              .filterStreamingTypes(filterStreamingTypes)
              .page(page)
              .perPage(perPage)
              .sort(sort)
              .timeInterval(timeInterval)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersAnalyticsApi#getUserMetrics");
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
| **dimension** | **String**| The data dimension by which to group the results.  Option descriptions:  * &#x60;country&#x60; - Group the results by country.  * &#x60;device_type&#x60; - Group the results by device type.  * &#x60;embed_domain&#x60; - Group the results by embed domain.  * &#x60;total&#x60; - Group the results by the time range provided.  * &#x60;video&#x60; - Group the results by video.  | [enum: country, device_type, embed_domain, total, video] |
| **from** | **String**| The start date of the range of results in ISO 8601 format. | |
| **to** | **String**| The end date of the range of results in ISO 8601 format. | |
| **direction** | **String**| The sort direction of the results.  Option descriptions:  * &#x60;asc&#x60; - Sort the results in ascending order.  * &#x60;desc&#x60; - Sort the results in descending order.  | [optional] [enum: asc, desc] |
| **filterContent** | **String**| A comma-separated list of video, folder, or event URIs to filter. | [optional] |
| **filterCountries** | [**List&lt;String&gt;**](String.md)| A comma-separated list of country codes in ISO-3166 format to filter on. | [optional] |
| **filterDeviceTypes** | [**List&lt;String&gt;**](String.md)| A comma-separated list of device types to filter on. | [optional] |
| **filterEmbedDomains** | [**List&lt;String&gt;**](String.md)| A comma-separated list of domain names to filter on. | [optional] |
| **filterStreamingTypes** | [**List&lt;String&gt;**](String.md)| A comma-separated list of streaming types to filter on. | [optional] |
| **page** | **Double**| The page number of the results to show. | [optional] |
| **perPage** | **Double**| The maximum number of items returned from the request, up to a limit of 1000 items. The default value is &#x60;50&#x60;. | [optional] |
| **sort** | **String**| The way to sort the results.  Option descriptions:  * &#x60;average_percent_watched&#x60; - Sort the results by mean seconds played.  * &#x60;average_time_watched&#x60; - Sort the results by mean percentage played.  * &#x60;comments&#x60; - Sort the results by the number of comments.  * &#x60;country&#x60; - Sort the results by country.  * &#x60;default&#x60; - Sort the results by the values of both the **dimension** and **time_interval** fields.  * &#x60;device_type&#x60; - Sort the results by device type.  * &#x60;downloads&#x60; - Sort the results by the number of downloads.  * &#x60;embed_domain&#x60; - Sort the results by embed domain.  * &#x60;finishes&#x60; - Sort the results by the number of complete plays.  * &#x60;impressions&#x60; - Sort the results by the number of impressions.  * &#x60;like&#x60; - Sort the results by the number of likes.  * &#x60;time&#x60; - Sort the results by the value of the **start_date** field. This option is available only when the value of **time_interval** isn&#39;t &#x60;none&#x60;.  * &#x60;total_time_watched&#x60; - Sort the results by total seconds played.  * &#x60;unique_impressions&#x60; - Sort the results by unique impressions.  * &#x60;unique_viewers&#x60; - Sort the results by unique viewers.  * &#x60;video&#x60; - Sort the results by video ID.  * &#x60;views&#x60; - Sort the results by the number of views.  | [optional] [enum: average_percent_watched, average_time_watched, comments, country, default, device_type, downloads, embed_domain, finishes, impressions, like, time, total_time_watched, unique_impressions, unique_viewers, video, views] |
| **timeInterval** | **String**| The interval by which to aggregate the data according to the specified data dimension. The default value is &#x60;none&#x60;.  Option descriptions:  * &#x60;day&#x60; - Aggregate the results by day according to the specified data dimension.  * &#x60;month&#x60; - Aggregate the results by month according to the specified data dimension.  * &#x60;none&#x60; - The results are not aggregated by time interval.  * &#x60;week&#x60; - Aggregate the results by week according to the specified data dimension.  * &#x60;year&#x60; - Aggregate the results by year according to the specified data dimension.  | [optional] [enum: day, month, none, week, year] |

### Return type

[**List&lt;Analytics&gt;**](Analytics.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.vimeo.analytics+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The analytics were returned. |  -  |

