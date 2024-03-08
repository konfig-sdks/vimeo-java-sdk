# OnDemandPurchasesAndRentalsApi

All URIs are relative to *https://api.vimeo.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**checkUserPurchasesAndRentals**](OnDemandPurchasesAndRentalsApi.md#checkUserPurchasesAndRentals) | **GET** /me/ondemand/purchases/{ondemand_id} | Check if a user has made a purchase or rental from an On Demand page |
| [**getAllUserPurchasesAndRentals**](OnDemandPurchasesAndRentalsApi.md#getAllUserPurchasesAndRentals) | **GET** /me/ondemand/purchases | Get all of the user&#39;s On Demand purchases and rentals |
| [**listUserPurchasesAndRentals**](OnDemandPurchasesAndRentalsApi.md#listUserPurchasesAndRentals) | **GET** /users/{user_id}/ondemand/purchases | Get all of the user&#39;s On Demand purchases and rentals |


<a name="checkUserPurchasesAndRentals"></a>
# **checkUserPurchasesAndRentals**
> OnDemandPage checkUserPurchasesAndRentals(ondemandId).execute();

Check if a user has made a purchase or rental from an On Demand page

This method determines whether the authenticated user has made a purchase or rental from the specified On Demand page.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OnDemandPurchasesAndRentalsApi;
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
    try {
      OnDemandPage result = client
              .onDemandPurchasesAndRentals
              .checkUserPurchasesAndRentals(ondemandId)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getBackground());
      System.out.println(result.getColors());
      System.out.println(result.getContentRating());
      System.out.println(result.getCreatedTime());
      System.out.println(result.getDomainLink());
      System.out.println(result.getEpisodes());
      System.out.println(result.getFilm());
      System.out.println(result.getGenres());
      System.out.println(result.getLink());
      System.out.println(result.getMetadata());
      System.out.println(result.getModifiedTime());
      System.out.println(result.getName());
      System.out.println(result.getPictures());
      System.out.println(result.getPreorder());
      System.out.println(result.getPublished());
      System.out.println(result.getRating());
      System.out.println(result.getResourceKey());
      System.out.println(result.getSku());
      System.out.println(result.getSubscription());
      System.out.println(result.getTheme());
      System.out.println(result.getThumbnail());
      System.out.println(result.getTrailer());
      System.out.println(result.getType());
      System.out.println(result.getUri());
      System.out.println(result.getUser());
    } catch (ApiException e) {
      System.err.println("Exception when calling OnDemandPurchasesAndRentalsApi#checkUserPurchasesAndRentals");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<OnDemandPage> response = client
              .onDemandPurchasesAndRentals
              .checkUserPurchasesAndRentals(ondemandId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OnDemandPurchasesAndRentalsApi#checkUserPurchasesAndRentals");
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

### Return type

[**OnDemandPage**](OnDemandPage.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.vimeo.ondemand.page+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The authenticated user has made this purchase. |  -  |

<a name="getAllUserPurchasesAndRentals"></a>
# **getAllUserPurchasesAndRentals**
> List&lt;OnDemandPage&gt; getAllUserPurchasesAndRentals().direction(direction).filter(filter).page(page).perPage(perPage).sort(sort).execute();

Get all of the user&#39;s On Demand purchases and rentals

This method returns every purchase and rental that the authenticated user has made across all On Demand pages.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OnDemandPurchasesAndRentalsApi;
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
    String filter = "all"; // The type of the On Demand video to filter on.  Option descriptions:  * `all` - Filter by all video types.  * `expiring_soon` - Filter by videos that expire soon.  * `film` - Filter by film.  * `important` - Filter by pages that are about to expire.  * `purchased` - Filter by purchased videos.  * `rented` - Filter by rented videos.  * `series` - Filter by series.  * `subscription` - Filter by video subscription.  * `unwatched` - Filter by unwatched videos.  * `watched` - Filter by watched videos. 
    Double page = 1D; // The page number of the results to show.
    Double perPage = 10D; // The number of items to show on each page of results, up to a maximum of 100.
    String sort = "added"; // The way to sort the results.  Option descriptions:  * `added` - Sort the results by most recently added video.  * `alphabetical` - Sort the results alphabetically.  * `date` - Sort the results by date.  * `name` - Sort the results by video name.  * `purchase_time` - Sort the results by time of video purchase.  * `rating` - Sort the results by content rating.  * `release_date` - Sort the results by video release date. 
    try {
      List<OnDemandPage> result = client
              .onDemandPurchasesAndRentals
              .getAllUserPurchasesAndRentals()
              .direction(direction)
              .filter(filter)
              .page(page)
              .perPage(perPage)
              .sort(sort)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OnDemandPurchasesAndRentalsApi#getAllUserPurchasesAndRentals");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<OnDemandPage>> response = client
              .onDemandPurchasesAndRentals
              .getAllUserPurchasesAndRentals()
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
      System.err.println("Exception when calling OnDemandPurchasesAndRentalsApi#getAllUserPurchasesAndRentals");
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
| **filter** | **String**| The type of the On Demand video to filter on.  Option descriptions:  * &#x60;all&#x60; - Filter by all video types.  * &#x60;expiring_soon&#x60; - Filter by videos that expire soon.  * &#x60;film&#x60; - Filter by film.  * &#x60;important&#x60; - Filter by pages that are about to expire.  * &#x60;purchased&#x60; - Filter by purchased videos.  * &#x60;rented&#x60; - Filter by rented videos.  * &#x60;series&#x60; - Filter by series.  * &#x60;subscription&#x60; - Filter by video subscription.  * &#x60;unwatched&#x60; - Filter by unwatched videos.  * &#x60;watched&#x60; - Filter by watched videos.  | [optional] [enum: all, expiring_soon, film, important, purchased, rented, series, subscription, unwatched, watched] |
| **page** | **Double**| The page number of the results to show. | [optional] |
| **perPage** | **Double**| The number of items to show on each page of results, up to a maximum of 100. | [optional] |
| **sort** | **String**| The way to sort the results.  Option descriptions:  * &#x60;added&#x60; - Sort the results by most recently added video.  * &#x60;alphabetical&#x60; - Sort the results alphabetically.  * &#x60;date&#x60; - Sort the results by date.  * &#x60;name&#x60; - Sort the results by video name.  * &#x60;purchase_time&#x60; - Sort the results by time of video purchase.  * &#x60;rating&#x60; - Sort the results by content rating.  * &#x60;release_date&#x60; - Sort the results by video release date.  | [optional] [enum: added, alphabetical, date, name, purchase_time, rating, release_date] |

### Return type

[**List&lt;OnDemandPage&gt;**](OnDemandPage.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.vimeo.ondemand.page+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The purchases and rentals were returned. |  -  |

<a name="listUserPurchasesAndRentals"></a>
# **listUserPurchasesAndRentals**
> List&lt;OnDemandPage&gt; listUserPurchasesAndRentals(userId).direction(direction).filter(filter).page(page).perPage(perPage).sort(sort).execute();

Get all of the user&#39;s On Demand purchases and rentals

This method returns every purchase and rental that the authenticated user has made across all On Demand pages.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OnDemandPurchasesAndRentalsApi;
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
    String filter = "all"; // The type of the On Demand video to filter on.  Option descriptions:  * `all` - Filter by all video types.  * `expiring_soon` - Filter by videos that expire soon.  * `film` - Filter by film.  * `important` - Filter by pages that are about to expire.  * `purchased` - Filter by purchased videos.  * `rented` - Filter by rented videos.  * `series` - Filter by series.  * `subscription` - Filter by video subscription.  * `unwatched` - Filter by unwatched videos.  * `watched` - Filter by watched videos. 
    Double page = 1D; // The page number of the results to show.
    Double perPage = 10D; // The number of items to show on each page of results, up to a maximum of 100.
    String sort = "added"; // The way to sort the results.  Option descriptions:  * `added` - Sort the results by most recently added video.  * `alphabetical` - Sort the results alphabetically.  * `date` - Sort the results by date.  * `name` - Sort the results by video name.  * `purchase_time` - Sort the results by time of video purchase.  * `rating` - Sort the results by content rating.  * `release_date` - Sort the results by video release date. 
    try {
      List<OnDemandPage> result = client
              .onDemandPurchasesAndRentals
              .listUserPurchasesAndRentals(userId)
              .direction(direction)
              .filter(filter)
              .page(page)
              .perPage(perPage)
              .sort(sort)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OnDemandPurchasesAndRentalsApi#listUserPurchasesAndRentals");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<OnDemandPage>> response = client
              .onDemandPurchasesAndRentals
              .listUserPurchasesAndRentals(userId)
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
      System.err.println("Exception when calling OnDemandPurchasesAndRentalsApi#listUserPurchasesAndRentals");
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
| **filter** | **String**| The type of the On Demand video to filter on.  Option descriptions:  * &#x60;all&#x60; - Filter by all video types.  * &#x60;expiring_soon&#x60; - Filter by videos that expire soon.  * &#x60;film&#x60; - Filter by film.  * &#x60;important&#x60; - Filter by pages that are about to expire.  * &#x60;purchased&#x60; - Filter by purchased videos.  * &#x60;rented&#x60; - Filter by rented videos.  * &#x60;series&#x60; - Filter by series.  * &#x60;subscription&#x60; - Filter by video subscription.  * &#x60;unwatched&#x60; - Filter by unwatched videos.  * &#x60;watched&#x60; - Filter by watched videos.  | [optional] [enum: all, expiring_soon, film, important, purchased, rented, series, subscription, unwatched, watched] |
| **page** | **Double**| The page number of the results to show. | [optional] |
| **perPage** | **Double**| The number of items to show on each page of results, up to a maximum of 100. | [optional] |
| **sort** | **String**| The way to sort the results.  Option descriptions:  * &#x60;added&#x60; - Sort the results by most recently added video.  * &#x60;alphabetical&#x60; - Sort the results alphabetically.  * &#x60;date&#x60; - Sort the results by date.  * &#x60;name&#x60; - Sort the results by video name.  * &#x60;purchase_time&#x60; - Sort the results by time of video purchase.  * &#x60;rating&#x60; - Sort the results by content rating.  * &#x60;release_date&#x60; - Sort the results by video release date.  | [optional] [enum: added, alphabetical, date, name, purchase_time, rating, release_date] |

### Return type

[**List&lt;OnDemandPage&gt;**](OnDemandPage.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.vimeo.ondemand.page+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The purchases and rentals were returned. |  -  |

