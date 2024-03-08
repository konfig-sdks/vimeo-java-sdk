# OnDemandGenresApi

All URIs are relative to *https://api.vimeo.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addGenreToPage**](OnDemandGenresApi.md#addGenreToPage) | **PUT** /ondemand/pages/{ondemand_id}/genres/{genre_id} | Add a genre to an On Demand page |
| [**checkGenreAssociation**](OnDemandGenresApi.md#checkGenreAssociation) | **GET** /ondemand/pages/{ondemand_id}/genres/{genre_id} | Check whether an On Demand page belongs to a specific genre |
| [**getAllGenres**](OnDemandGenresApi.md#getAllGenres) | **GET** /ondemand/genres | Get all On Demand genres |
| [**getAllPagesInGenre**](OnDemandGenresApi.md#getAllPagesInGenre) | **GET** /ondemand/genres/{genre_id}/pages | Get all the On Demand pages in a genre |
| [**getGenres**](OnDemandGenresApi.md#getGenres) | **GET** /ondemand/pages/{ondemand_id}/genres | Get all the genres of an On Demand page |
| [**getSpecificPageInGenre**](OnDemandGenresApi.md#getSpecificPageInGenre) | **GET** /ondemand/genres/{genre_id}/pages/{ondemand_id} | Get a specific On Demand page in a genre |
| [**removeGenreFromPage**](OnDemandGenresApi.md#removeGenreFromPage) | **DELETE** /ondemand/pages/{ondemand_id}/genres/{genre_id} | Remove a genre from an On Demand page |
| [**specificGenreGet**](OnDemandGenresApi.md#specificGenreGet) | **GET** /ondemand/genres/{genre_id} | Get a specific On Demand genre |


<a name="addGenreToPage"></a>
# **addGenreToPage**
> OnDemandGenre addGenreToPage(genreId, ondemandId).execute();

Add a genre to an On Demand page

This method adds the specified genre designation to an On Demand page. A page can be associated with a maximum of two genres. The authenticated user must be the owner of the page.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OnDemandGenresApi;
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
    String genreId = "animation"; // The ID of the genre.
    Double ondemandId = 61326D; // The ID of the On Demand page.
    try {
      OnDemandGenre result = client
              .onDemandGenres
              .addGenreToPage(genreId, ondemandId)
              .execute();
      System.out.println(result);
      System.out.println(result.getCanonical());
      System.out.println(result.getInteractions());
      System.out.println(result.getLink());
      System.out.println(result.getMetadata());
      System.out.println(result.getName());
      System.out.println(result.getUri());
    } catch (ApiException e) {
      System.err.println("Exception when calling OnDemandGenresApi#addGenreToPage");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<OnDemandGenre> response = client
              .onDemandGenres
              .addGenreToPage(genreId, ondemandId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OnDemandGenresApi#addGenreToPage");
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
| **genreId** | **String**| The ID of the genre. | |
| **ondemandId** | **Double**| The ID of the On Demand page. | |

### Return type

[**OnDemandGenre**](OnDemandGenre.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.vimeo.ondemand.genre+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The genre was added. |  -  |

<a name="checkGenreAssociation"></a>
# **checkGenreAssociation**
> OnDemandGenre checkGenreAssociation(genreId, ondemandId).execute();

Check whether an On Demand page belongs to a specific genre

This method determines whether an On Demand page is associated with the specified genre.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OnDemandGenresApi;
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
    String genreId = "animation"; // The ID of the genre.
    Double ondemandId = 61326D; // The ID of the On Demand page.
    try {
      OnDemandGenre result = client
              .onDemandGenres
              .checkGenreAssociation(genreId, ondemandId)
              .execute();
      System.out.println(result);
      System.out.println(result.getCanonical());
      System.out.println(result.getInteractions());
      System.out.println(result.getLink());
      System.out.println(result.getMetadata());
      System.out.println(result.getName());
      System.out.println(result.getUri());
    } catch (ApiException e) {
      System.err.println("Exception when calling OnDemandGenresApi#checkGenreAssociation");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<OnDemandGenre> response = client
              .onDemandGenres
              .checkGenreAssociation(genreId, ondemandId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OnDemandGenresApi#checkGenreAssociation");
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
| **genreId** | **String**| The ID of the genre. | |
| **ondemandId** | **Double**| The ID of the On Demand page. | |

### Return type

[**OnDemandGenre**](OnDemandGenre.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.vimeo.ondemand.genre+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The On Demand page is in this genre. |  -  |

<a name="getAllGenres"></a>
# **getAllGenres**
> List&lt;OnDemandGenre&gt; getAllGenres().execute();

Get all On Demand genres

This method returns every existing On Demand genre.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OnDemandGenresApi;
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
    try {
      List<OnDemandGenre> result = client
              .onDemandGenres
              .getAllGenres()
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OnDemandGenresApi#getAllGenres");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<OnDemandGenre>> response = client
              .onDemandGenres
              .getAllGenres()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OnDemandGenresApi#getAllGenres");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;OnDemandGenre&gt;**](OnDemandGenre.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.vimeo.ondemand.genre+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The genres were returned. |  -  |

<a name="getAllPagesInGenre"></a>
# **getAllPagesInGenre**
> List&lt;OnDemandPage&gt; getAllPagesInGenre(genreId).direction(direction).filter(filter).page(page).perPage(perPage).query(query).sort(sort).execute();

Get all the On Demand pages in a genre

This method returns every On Demand page that belongs to the specified genre.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OnDemandGenresApi;
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
    String genreId = "animation"; // The ID of the genre.
    String direction = "asc"; // The sort direction of the results.  Option descriptions:  * `asc` - Sort the results in ascending order.  * `desc` - Sort the results in descending order. 
    String filter = "country"; // The attribute by which to filter the results.  Option descriptions:  * `country` - Sort the results by country.  * `my_region` - Sort the results by user's region. 
    Double page = 1D; // The page number of the results to show.
    Double perPage = 10D; // The number of items to show on each page of results, up to a maximum of 100.
    String query = "Stop motion"; // The search query to use to filter the results.
    String sort = "alphabetical"; // The way to sort the results.  Option descriptions:  * `alphabetical` - Sort the results alphabetically.  * `date` - Sort the results by date.  * `name` - Sort the results by name.  * `publish.time` - Sort the results by time of publishing.  * `videos` - Sort the results by video. 
    try {
      List<OnDemandPage> result = client
              .onDemandGenres
              .getAllPagesInGenre(genreId)
              .direction(direction)
              .filter(filter)
              .page(page)
              .perPage(perPage)
              .query(query)
              .sort(sort)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OnDemandGenresApi#getAllPagesInGenre");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<OnDemandPage>> response = client
              .onDemandGenres
              .getAllPagesInGenre(genreId)
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
      System.err.println("Exception when calling OnDemandGenresApi#getAllPagesInGenre");
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
| **genreId** | **String**| The ID of the genre. | |
| **direction** | **String**| The sort direction of the results.  Option descriptions:  * &#x60;asc&#x60; - Sort the results in ascending order.  * &#x60;desc&#x60; - Sort the results in descending order.  | [optional] [enum: asc, desc] |
| **filter** | **String**| The attribute by which to filter the results.  Option descriptions:  * &#x60;country&#x60; - Sort the results by country.  * &#x60;my_region&#x60; - Sort the results by user&#39;s region.  | [optional] [enum: country, my_region] |
| **page** | **Double**| The page number of the results to show. | [optional] |
| **perPage** | **Double**| The number of items to show on each page of results, up to a maximum of 100. | [optional] |
| **query** | **String**| The search query to use to filter the results. | [optional] |
| **sort** | **String**| The way to sort the results.  Option descriptions:  * &#x60;alphabetical&#x60; - Sort the results alphabetically.  * &#x60;date&#x60; - Sort the results by date.  * &#x60;name&#x60; - Sort the results by name.  * &#x60;publish.time&#x60; - Sort the results by time of publishing.  * &#x60;videos&#x60; - Sort the results by video.  | [optional] [enum: alphabetical, date, name, publish.time, videos] |

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
| **200** | The On Demand pages in the genre were returned. |  -  |

<a name="getGenres"></a>
# **getGenres**
> List&lt;OnDemandGenre&gt; getGenres(ondemandId).execute();

Get all the genres of an On Demand page

This method returns every genre associated with the specified On Demand page.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OnDemandGenresApi;
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
      List<OnDemandGenre> result = client
              .onDemandGenres
              .getGenres(ondemandId)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OnDemandGenresApi#getGenres");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<OnDemandGenre>> response = client
              .onDemandGenres
              .getGenres(ondemandId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OnDemandGenresApi#getGenres");
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

[**List&lt;OnDemandGenre&gt;**](OnDemandGenre.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.vimeo.ondemand.genre+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The genres were returned. |  -  |

<a name="getSpecificPageInGenre"></a>
# **getSpecificPageInGenre**
> OnDemandPage getSpecificPageInGenre(genreId, ondemandId).execute();

Get a specific On Demand page in a genre

This method returns a single On Demand page that belongs to the specified genre.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OnDemandGenresApi;
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
    String genreId = "animation"; // The ID of the genre.
    Double ondemandId = 61326D; // The ID of the On Demand page.
    try {
      OnDemandPage result = client
              .onDemandGenres
              .getSpecificPageInGenre(genreId, ondemandId)
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
      System.err.println("Exception when calling OnDemandGenresApi#getSpecificPageInGenre");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<OnDemandPage> response = client
              .onDemandGenres
              .getSpecificPageInGenre(genreId, ondemandId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OnDemandGenresApi#getSpecificPageInGenre");
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
| **genreId** | **String**| The ID of the genre. | |
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
| **200** | The On Demand page in the genre was returned. |  -  |

<a name="removeGenreFromPage"></a>
# **removeGenreFromPage**
> removeGenreFromPage(genreId, ondemandId).execute();

Remove a genre from an On Demand page

This method removes a genre association from the specified On Demand page. The authenticated user must be the owner of the page.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OnDemandGenresApi;
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
    String genreId = "animation"; // The ID of the genre.
    Double ondemandId = 61326D; // The ID of the On Demand page.
    try {
      client
              .onDemandGenres
              .removeGenreFromPage(genreId, ondemandId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling OnDemandGenresApi#removeGenreFromPage");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .onDemandGenres
              .removeGenreFromPage(genreId, ondemandId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling OnDemandGenresApi#removeGenreFromPage");
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
| **genreId** | **String**| The ID of the genre. | |
| **ondemandId** | **Double**| The ID of the On Demand page. | |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.vimeo.ondemand.genre+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | The genre was removed. |  -  |

<a name="specificGenreGet"></a>
# **specificGenreGet**
> OnDemandGenre specificGenreGet(genreId).execute();

Get a specific On Demand genre

This method returns a single On Demand genre.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OnDemandGenresApi;
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
    String genreId = "animation"; // The ID of the genre.
    try {
      OnDemandGenre result = client
              .onDemandGenres
              .specificGenreGet(genreId)
              .execute();
      System.out.println(result);
      System.out.println(result.getCanonical());
      System.out.println(result.getInteractions());
      System.out.println(result.getLink());
      System.out.println(result.getMetadata());
      System.out.println(result.getName());
      System.out.println(result.getUri());
    } catch (ApiException e) {
      System.err.println("Exception when calling OnDemandGenresApi#specificGenreGet");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<OnDemandGenre> response = client
              .onDemandGenres
              .specificGenreGet(genreId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OnDemandGenresApi#specificGenreGet");
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
| **genreId** | **String**| The ID of the genre. | |

### Return type

[**OnDemandGenre**](OnDemandGenre.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.vimeo.ondemand.genre+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The genre was returned. |  -  |

