# OnDemandEssentialsApi

All URIs are relative to *https://api.vimeo.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createPage**](OnDemandEssentialsApi.md#createPage) | **POST** /me/ondemand/pages | Create an On Demand page |
| [**deleteOnDemandPage**](OnDemandEssentialsApi.md#deleteOnDemandPage) | **DELETE** /ondemand/pages/{ondemand_id} | Delete an On Demand page |
| [**getAllUserPages**](OnDemandEssentialsApi.md#getAllUserPages) | **GET** /me/ondemand/pages | Get all the On Demand pages of the user |
| [**getAllUserPages_0**](OnDemandEssentialsApi.md#getAllUserPages_0) | **GET** /users/{user_id}/ondemand/pages | Get all the On Demand pages of the user |
| [**vod**](OnDemandEssentialsApi.md#vod) | **GET** /ondemand/pages/{ondemand_id} | Get a specific On Demand page |
| [**vod_0**](OnDemandEssentialsApi.md#vod_0) | **PATCH** /ondemand/pages/{ondemand_id} | Edit an On Demand page |
| [**vod_1**](OnDemandEssentialsApi.md#vod_1) | **POST** /users/{user_id}/ondemand/pages | Create an On Demand page |


<a name="createPage"></a>
# **createPage**
> OnDemandPage createPage(onDemandEssentialsCreatePageRequest).execute();

Create an On Demand page

This method creates a new On Demand page for the specified user. To publish the page, use the [edit](https://developer.vimeo.com/api/reference/on-demand#edit_vod) method.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OnDemandEssentialsApi;
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
    String description = "description_example"; // The description of the On Demand page.
    String contentRating = "drugs"; // The content rating of the video, given either as a comma-separated list or as a JSON array, depending on the request format.  Option descriptions:  * `drugs` - The video contains drug or alcohol use.  * `language` - The video contains profanity or sexually suggestive content.  * `nudity` - The video contains nudity.  * `safe` - The video is suitable for all audiences.  * `unrated` - The video hasn't been rated.  * `violence` - The video contains violent or graphic content. 
    String name = "name_example"; // The name of the On Demand page.
    String type = "film"; // The type of the On Demand page.  Option descriptions:  * `film` - The On Demand page is a film.  * `series` - The On Demand page is a series. 
    String acceptedCurrencies = "AUD"; // An array of accepted currencies.  Option descriptions:  * `AUD` - The currency is in Australian dollars.  * `CAD` - The currency is in Canadian dollars.  * `CHF` - The currency is in Swiss francs.  * `DKK` - The currency is in Danish krone.  * `EUR` - The currency is in euros.  * `GBP` - The currency is in British pounds.  * `JPY` - The currency is in Japanese yen.  * `KRW` - The currency is in South Korean won.  * `NOK` - The currency is in Norwegian krone.  * `PLN` - The currency is in Polish zloty.  * `SEK` - The currency is in Swedish krona.  * `USD` - The currency is in United States dollars. 
    OnDemandEssentialsCreatePageRequestBuy buy = new OnDemandEssentialsCreatePageRequestBuy();
    String domainLink = "domainLink_example"; // The custom domain of the On Demand page.
    OnDemandEssentialsCreatePageRequestEpisodes episodes = new OnDemandEssentialsCreatePageRequestEpisodes();
    String link = "link_example"; // The custom string to use in the Vimeo URL of the On Demand page.
    OnDemandEssentialsCreatePageRequestRent rent = new OnDemandEssentialsCreatePageRequestRent();
    OnDemandEssentialsCreatePageRequestSubscription subscription = new OnDemandEssentialsCreatePageRequestSubscription();
    try {
      OnDemandPage result = client
              .onDemandEssentials
              .createPage(description, contentRating, name, type)
              .acceptedCurrencies(acceptedCurrencies)
              .buy(buy)
              .domainLink(domainLink)
              .episodes(episodes)
              .link(link)
              .rent(rent)
              .subscription(subscription)
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
      System.err.println("Exception when calling OnDemandEssentialsApi#createPage");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<OnDemandPage> response = client
              .onDemandEssentials
              .createPage(description, contentRating, name, type)
              .acceptedCurrencies(acceptedCurrencies)
              .buy(buy)
              .domainLink(domainLink)
              .episodes(episodes)
              .link(link)
              .rent(rent)
              .subscription(subscription)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OnDemandEssentialsApi#createPage");
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
| **onDemandEssentialsCreatePageRequest** | [**OnDemandEssentialsCreatePageRequest**](OnDemandEssentialsCreatePageRequest.md)|  | |

### Return type

[**OnDemandPage**](OnDemandPage.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The On Demand page was created. |  -  |

<a name="deleteOnDemandPage"></a>
# **deleteOnDemandPage**
> deleteOnDemandPage(ondemandId).execute();

Delete an On Demand page

This method deletes the specified On Demand page.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OnDemandEssentialsApi;
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
      client
              .onDemandEssentials
              .deleteOnDemandPage(ondemandId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling OnDemandEssentialsApi#deleteOnDemandPage");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .onDemandEssentials
              .deleteOnDemandPage(ondemandId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling OnDemandEssentialsApi#deleteOnDemandPage");
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

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.vimeo.ondemand.page+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | The On Demand page was deleted. |  -  |

<a name="getAllUserPages"></a>
# **getAllUserPages**
> List&lt;OnDemandPage&gt; getAllUserPages().direction(direction).filter(filter).page(page).perPage(perPage).sort(sort).execute();

Get all the On Demand pages of the user

This method returns every On Demand page belonging to the authenticated user.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OnDemandEssentialsApi;
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
    String filter = "film"; // The type of the page to return.  Option descriptions:  * `film` - The page type is a film.  * `series` - The page type is a series. 
    Double page = 1D; // The page number of the results to show.
    Double perPage = 10D; // The number of items to show on each page of results, up to a maximum of 100.
    String sort = "added"; // The way to sort the results.  Option descriptions:  * `added` - Sort the results by most recently added page.  * `alphabetical` - Sort the results alphabetically.  * `date` - Sort the results by date.  * `modified_time` - Sort the results by time of page modification.  * `name` - Sort the results by page name.  * `publish.time` - Sort the results by time of page publishing.  * `rating` - Sort the results by content rating. 
    try {
      List<OnDemandPage> result = client
              .onDemandEssentials
              .getAllUserPages()
              .direction(direction)
              .filter(filter)
              .page(page)
              .perPage(perPage)
              .sort(sort)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OnDemandEssentialsApi#getAllUserPages");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<OnDemandPage>> response = client
              .onDemandEssentials
              .getAllUserPages()
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
      System.err.println("Exception when calling OnDemandEssentialsApi#getAllUserPages");
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
| **filter** | **String**| The type of the page to return.  Option descriptions:  * &#x60;film&#x60; - The page type is a film.  * &#x60;series&#x60; - The page type is a series.  | [optional] [enum: film, series] |
| **page** | **Double**| The page number of the results to show. | [optional] |
| **perPage** | **Double**| The number of items to show on each page of results, up to a maximum of 100. | [optional] |
| **sort** | **String**| The way to sort the results.  Option descriptions:  * &#x60;added&#x60; - Sort the results by most recently added page.  * &#x60;alphabetical&#x60; - Sort the results alphabetically.  * &#x60;date&#x60; - Sort the results by date.  * &#x60;modified_time&#x60; - Sort the results by time of page modification.  * &#x60;name&#x60; - Sort the results by page name.  * &#x60;publish.time&#x60; - Sort the results by time of page publishing.  * &#x60;rating&#x60; - Sort the results by content rating.  | [optional] [enum: added, alphabetical, date, modified_time, name, publish.time, rating] |

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
| **200** | The On Demand pages were returned. |  -  |

<a name="getAllUserPages_0"></a>
# **getAllUserPages_0**
> List&lt;OnDemandPage&gt; getAllUserPages_0(userId).direction(direction).filter(filter).page(page).perPage(perPage).sort(sort).execute();

Get all the On Demand pages of the user

This method returns every On Demand page belonging to the authenticated user.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OnDemandEssentialsApi;
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
    String filter = "film"; // The type of the page to return.  Option descriptions:  * `film` - The page type is a film.  * `series` - The page type is a series. 
    Double page = 1D; // The page number of the results to show.
    Double perPage = 10D; // The number of items to show on each page of results, up to a maximum of 100.
    String sort = "added"; // The way to sort the results.  Option descriptions:  * `added` - Sort the results by most recently added page.  * `alphabetical` - Sort the results alphabetically.  * `date` - Sort the results by date.  * `modified_time` - Sort the results by time of page modification.  * `name` - Sort the results by page name.  * `publish.time` - Sort the results by time of page publishing.  * `rating` - Sort the results by content rating. 
    try {
      List<OnDemandPage> result = client
              .onDemandEssentials
              .getAllUserPages_0(userId)
              .direction(direction)
              .filter(filter)
              .page(page)
              .perPage(perPage)
              .sort(sort)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OnDemandEssentialsApi#getAllUserPages_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<OnDemandPage>> response = client
              .onDemandEssentials
              .getAllUserPages_0(userId)
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
      System.err.println("Exception when calling OnDemandEssentialsApi#getAllUserPages_0");
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
| **filter** | **String**| The type of the page to return.  Option descriptions:  * &#x60;film&#x60; - The page type is a film.  * &#x60;series&#x60; - The page type is a series.  | [optional] [enum: film, series] |
| **page** | **Double**| The page number of the results to show. | [optional] |
| **perPage** | **Double**| The number of items to show on each page of results, up to a maximum of 100. | [optional] |
| **sort** | **String**| The way to sort the results.  Option descriptions:  * &#x60;added&#x60; - Sort the results by most recently added page.  * &#x60;alphabetical&#x60; - Sort the results alphabetically.  * &#x60;date&#x60; - Sort the results by date.  * &#x60;modified_time&#x60; - Sort the results by time of page modification.  * &#x60;name&#x60; - Sort the results by page name.  * &#x60;publish.time&#x60; - Sort the results by time of page publishing.  * &#x60;rating&#x60; - Sort the results by content rating.  | [optional] [enum: added, alphabetical, date, modified_time, name, publish.time, rating] |

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
| **200** | The On Demand pages were returned. |  -  |

<a name="vod"></a>
# **vod**
> OnDemandPage vod(ondemandId).execute();

Get a specific On Demand page

This method returns the specified On Demand page.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OnDemandEssentialsApi;
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
              .onDemandEssentials
              .vod(ondemandId)
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
      System.err.println("Exception when calling OnDemandEssentialsApi#vod");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<OnDemandPage> response = client
              .onDemandEssentials
              .vod(ondemandId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OnDemandEssentialsApi#vod");
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
| **200** | The On Demand page was returned. |  -  |

<a name="vod_0"></a>
# **vod_0**
> OnDemandPage vod_0(ondemandId).editVodRequest(editVodRequest).execute();

Edit an On Demand page

This method edits the specified On Demand page. Use this method to enable preorders on the page or to publish the page.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OnDemandEssentialsApi;
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
    String link = "link_example"; // The custom string to use in the Vimeo URL of the On Demand page.
    EditVodRequestPreorder preorder = new EditVodRequestPreorder();
    EditVodRequestPublish publish = new EditVodRequestPublish();
    Boolean publishWhenReady = true; // Whether to publish the On Demand page automatically after all videos have finished transcoding.
    try {
      OnDemandPage result = client
              .onDemandEssentials
              .vod_0(ondemandId)
              .link(link)
              .preorder(preorder)
              .publish(publish)
              .publishWhenReady(publishWhenReady)
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
      System.err.println("Exception when calling OnDemandEssentialsApi#vod_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<OnDemandPage> response = client
              .onDemandEssentials
              .vod_0(ondemandId)
              .link(link)
              .preorder(preorder)
              .publish(publish)
              .publishWhenReady(publishWhenReady)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OnDemandEssentialsApi#vod_0");
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
| **editVodRequest** | [**EditVodRequest**](EditVodRequest.md)|  | [optional] |

### Return type

[**OnDemandPage**](OnDemandPage.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/vnd.vimeo.ondemand.page+json
 - **Accept**: application/vnd.vimeo.ondemand.page+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The On Demand page was edited. |  -  |

<a name="vod_1"></a>
# **vod_1**
> OnDemandPage vod_1(userId, createVodRequest).execute();

Create an On Demand page

This method creates a new On Demand page for the specified user. To publish the page, use the [edit](https://developer.vimeo.com/api/reference/on-demand#edit_vod) method.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OnDemandEssentialsApi;
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
    String description = "description_example"; // The description of the On Demand page.
    String contentRating = "drugs"; // The content rating of the video, given either as a comma-separated list or as a JSON array, depending on the request format.  Option descriptions:  * `drugs` - The video contains drug or alcohol use.  * `language` - The video contains profanity or sexually suggestive content.  * `nudity` - The video contains nudity.  * `safe` - The video is suitable for all audiences.  * `unrated` - The video hasn't been rated.  * `violence` - The video contains violent or graphic content. 
    String name = "name_example"; // The name of the On Demand page.
    String type = "film"; // The type of the On Demand page.  Option descriptions:  * `film` - The On Demand page is a film.  * `series` - The On Demand page is a series. 
    Double userId = 152184D; // The ID of the user.
    String acceptedCurrencies = "AUD"; // An array of accepted currencies.  Option descriptions:  * `AUD` - The currency is in Australian dollars.  * `CAD` - The currency is in Canadian dollars.  * `CHF` - The currency is in Swiss francs.  * `DKK` - The currency is in Danish krone.  * `EUR` - The currency is in euros.  * `GBP` - The currency is in British pounds.  * `JPY` - The currency is in Japanese yen.  * `KRW` - The currency is in South Korean won.  * `NOK` - The currency is in Norwegian krone.  * `PLN` - The currency is in Polish zloty.  * `SEK` - The currency is in Swedish krona.  * `USD` - The currency is in United States dollars. 
    CreateVodRequestBuy buy = new CreateVodRequestBuy();
    String domainLink = "domainLink_example"; // The custom domain of the On Demand page.
    CreateVodRequestEpisodes episodes = new CreateVodRequestEpisodes();
    String link = "link_example"; // The custom string to use in the Vimeo URL of the On Demand page.
    CreateVodRequestRent rent = new CreateVodRequestRent();
    CreateVodRequestSubscription subscription = new CreateVodRequestSubscription();
    try {
      OnDemandPage result = client
              .onDemandEssentials
              .vod_1(description, contentRating, name, type, userId)
              .acceptedCurrencies(acceptedCurrencies)
              .buy(buy)
              .domainLink(domainLink)
              .episodes(episodes)
              .link(link)
              .rent(rent)
              .subscription(subscription)
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
      System.err.println("Exception when calling OnDemandEssentialsApi#vod_1");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<OnDemandPage> response = client
              .onDemandEssentials
              .vod_1(description, contentRating, name, type, userId)
              .acceptedCurrencies(acceptedCurrencies)
              .buy(buy)
              .domainLink(domainLink)
              .episodes(episodes)
              .link(link)
              .rent(rent)
              .subscription(subscription)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OnDemandEssentialsApi#vod_1");
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
| **createVodRequest** | [**CreateVodRequest**](CreateVodRequest.md)|  | |

### Return type

[**OnDemandPage**](OnDemandPage.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The On Demand page was created. |  -  |

