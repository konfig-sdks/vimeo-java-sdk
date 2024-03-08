# OnDemandSeasonsApi

All URIs are relative to *https://api.vimeo.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAllVideosInSeason**](OnDemandSeasonsApi.md#getAllVideosInSeason) | **GET** /ondemand/pages/{ondemand_id}/seasons/{season_id}/videos | Get all the videos in a season on an On Demand page |
| [**listAll**](OnDemandSeasonsApi.md#listAll) | **GET** /ondemand/pages/{ondemand_id}/seasons | Get all the seasons on an On Demand page |
| [**specificGet**](OnDemandSeasonsApi.md#specificGet) | **GET** /ondemand/pages/{ondemand_id}/seasons/{season_id} | Get a specific season on an On Demand page |


<a name="getAllVideosInSeason"></a>
# **getAllVideosInSeason**
> List&lt;Video&gt; getAllVideosInSeason(ondemandId, seasonId).filter(filter).page(page).perPage(perPage).sort(sort).execute();

Get all the videos in a season on an On Demand page

This method returns every video in the specified season on an On Demand page.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OnDemandSeasonsApi;
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
    Double ondemandId = 61326D; // The ID of the On Demand page.
    Double seasonId = 12345D; // The ID of the season.
    String filter = "viewable"; // The attribute by which to filter the results.  Option descriptions:  * `viewable` - Filter by viewable videos. 
    Double page = 1D; // The page number of the results to show.
    Double perPage = 10D; // The number of items to show on each page of results, up to a maximum of 100.
    String sort = "date"; // The way to sort the results.  Option descriptions:  * `date` - Sort the results by date.  * `default` - Use the default sorting method.  * `manual` - Sort the results manually.  * `name` - Sort the results by name.  * `purchase_time` - Sort the results by time of purchase.  * `release_date` - Sort the results by release date. 
    try {
      List<Video> result = client
              .onDemandSeasons
              .getAllVideosInSeason(ondemandId, seasonId)
              .filter(filter)
              .page(page)
              .perPage(perPage)
              .sort(sort)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OnDemandSeasonsApi#getAllVideosInSeason");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<Video>> response = client
              .onDemandSeasons
              .getAllVideosInSeason(ondemandId, seasonId)
              .filter(filter)
              .page(page)
              .perPage(perPage)
              .sort(sort)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OnDemandSeasonsApi#getAllVideosInSeason");
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
| **ondemandId** | **Double**| The ID of the On Demand page. | |
| **seasonId** | **Double**| The ID of the season. | |
| **filter** | **String**| The attribute by which to filter the results.  Option descriptions:  * &#x60;viewable&#x60; - Filter by viewable videos.  | [optional] [enum: viewable] |
| **page** | **Double**| The page number of the results to show. | [optional] |
| **perPage** | **Double**| The number of items to show on each page of results, up to a maximum of 100. | [optional] |
| **sort** | **String**| The way to sort the results.  Option descriptions:  * &#x60;date&#x60; - Sort the results by date.  * &#x60;default&#x60; - Use the default sorting method.  * &#x60;manual&#x60; - Sort the results manually.  * &#x60;name&#x60; - Sort the results by name.  * &#x60;purchase_time&#x60; - Sort the results by time of purchase.  * &#x60;release_date&#x60; - Sort the results by release date.  | [optional] [enum: date, default, manual, name, purchase_time, release_date] |

### Return type

[**List&lt;Video&gt;**](Video.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.vimeo.video+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The videos were returned. |  -  |

<a name="listAll"></a>
# **listAll**
> List&lt;OnDemandSeason&gt; listAll(ondemandId).direction(direction).filter(filter).page(page).perPage(perPage).sort(sort).execute();

Get all the seasons on an On Demand page

This method returns every season on the specified On Demand page.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OnDemandSeasonsApi;
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
    Double ondemandId = 61326D; // The ID of the On Demand page.
    String direction = "asc"; // The sort direction of the results.  Option descriptions:  * `asc` - Sort the results in ascending order.  * `desc` - Sort the results in descending order. 
    String filter = "viewable"; // The attribute by which to filter the results.  Option descriptions:  * `viewable` - Filter by viewable seasons. 
    Double page = 1D; // The page number of the results to show.
    Double perPage = 10D; // The number of items to show on each page of results, up to a maximum of 100.
    String sort = "date"; // The way to sort the results.  Option descriptions:  * `date` - Sort the results by date.  * `manual` - Sort the results manually. 
    try {
      List<OnDemandSeason> result = client
              .onDemandSeasons
              .listAll(ondemandId)
              .direction(direction)
              .filter(filter)
              .page(page)
              .perPage(perPage)
              .sort(sort)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OnDemandSeasonsApi#listAll");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<OnDemandSeason>> response = client
              .onDemandSeasons
              .listAll(ondemandId)
              .direction(direction)
              .filter(filter)
              .page(page)
              .perPage(perPage)
              .sort(sort)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OnDemandSeasonsApi#listAll");
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
| **ondemandId** | **Double**| The ID of the On Demand page. | |
| **direction** | **String**| The sort direction of the results.  Option descriptions:  * &#x60;asc&#x60; - Sort the results in ascending order.  * &#x60;desc&#x60; - Sort the results in descending order.  | [optional] [enum: asc, desc] |
| **filter** | **String**| The attribute by which to filter the results.  Option descriptions:  * &#x60;viewable&#x60; - Filter by viewable seasons.  | [optional] [enum: viewable] |
| **page** | **Double**| The page number of the results to show. | [optional] |
| **perPage** | **Double**| The number of items to show on each page of results, up to a maximum of 100. | [optional] |
| **sort** | **String**| The way to sort the results.  Option descriptions:  * &#x60;date&#x60; - Sort the results by date.  * &#x60;manual&#x60; - Sort the results manually.  | [optional] [enum: date, manual] |

### Return type

[**List&lt;OnDemandSeason&gt;**](OnDemandSeason.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.vimeo.ondemand.season+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The seasons were returned. |  -  |

<a name="specificGet"></a>
# **specificGet**
> OnDemandSeason specificGet(ondemandId, seasonId).execute();

Get a specific season on an On Demand page

This method returns a single season on the specified On Demand page.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OnDemandSeasonsApi;
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
    Double ondemandId = 61326D; // The ID of the On Demand page.
    Double seasonId = 12345D; // The ID of the season.
    try {
      OnDemandSeason result = client
              .onDemandSeasons
              .specificGet(ondemandId, seasonId)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getMetadata());
      System.out.println(result.getName());
      System.out.println(result.getPosition());
      System.out.println(result.getResourceKey());
      System.out.println(result.getType());
      System.out.println(result.getUri());
      System.out.println(result.getUser());
    } catch (ApiException e) {
      System.err.println("Exception when calling OnDemandSeasonsApi#specificGet");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<OnDemandSeason> response = client
              .onDemandSeasons
              .specificGet(ondemandId, seasonId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OnDemandSeasonsApi#specificGet");
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
| **ondemandId** | **Double**| The ID of the On Demand page. | |
| **seasonId** | **Double**| The ID of the season. | |

### Return type

[**OnDemandSeason**](OnDemandSeason.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.vimeo.ondemand.season+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The season was returned. |  -  |

