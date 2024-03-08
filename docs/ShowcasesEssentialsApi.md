# ShowcasesEssentialsApi

All URIs are relative to *https://api.vimeo.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createUserShowcase**](ShowcasesEssentialsApi.md#createUserShowcase) | **POST** /me/albums | Create a showcase |
| [**deleteShowcase**](ShowcasesEssentialsApi.md#deleteShowcase) | **DELETE** /me/albums/{album_id} | Delete a showcase |
| [**editShowcase**](ShowcasesEssentialsApi.md#editShowcase) | **PATCH** /me/albums/{album_id} | Edit a showcase |
| [**getAllUserShowcases**](ShowcasesEssentialsApi.md#getAllUserShowcases) | **GET** /me/albums | Get all the showcases that belong to the user |
| [**getSpecificShowcase**](ShowcasesEssentialsApi.md#getSpecificShowcase) | **GET** /me/albums/{album_id} | Get a specific showcase |
| [**showcase**](ShowcasesEssentialsApi.md#showcase) | **POST** /users/{user_id}/albums | Create a showcase |
| [**showcase_0**](ShowcasesEssentialsApi.md#showcase_0) | **GET** /users/{user_id}/albums/{album_id} | Get a specific showcase |
| [**showcase_1**](ShowcasesEssentialsApi.md#showcase_1) | **DELETE** /users/{user_id}/albums/{album_id} | Delete a showcase |
| [**showcase_2**](ShowcasesEssentialsApi.md#showcase_2) | **PATCH** /users/{user_id}/albums/{album_id} | Edit a showcase |
| [**showcases**](ShowcasesEssentialsApi.md#showcases) | **GET** /users/{user_id}/albums | Get all the showcases that belong to the user |
| [**showcases_0**](ShowcasesEssentialsApi.md#showcases_0) | **PATCH** /users/{user_id}/albums | Add videos and live events to showcases |


<a name="createUserShowcase"></a>
# **createUserShowcase**
> Album createUserShowcase(showcasesEssentialsCreateUserShowcaseRequest).execute();

Create a showcase

This method creates a new showcase for the specified user.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ShowcasesEssentialsApi;
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
    String name = "name_example"; // The name of the showcase.
    String description = "description_example"; // The description of the showcase.
    String brandColor = "brandColor_example"; // The hexadecimal code for the color of the player buttons and showcase controls.
    Boolean hideFromVimeo = true; // Whether the showcase should be hidden from Vimeo when unlisted.
    Boolean hideNav = true; // Whether to hide Vimeo navigation when displaying the showcase.
    Boolean hideUpcoming = true; // Whether to include the upcoming event in the showcase.
    String layout = "grid"; // The type of layout for presenting the showcase.  Option descriptions:  * `grid` - The videos appear in a grid.  * `player` - The videos appear in the player. 
    String password = "password_example"; // The showcase's password. This field is required only when **privacy** is `password`.
    String privacy = "anybody"; // The privacy level of the showcase.  Option descriptions:  * `anybody` - Anyone can access the showcase, either on Vimeo or through an embed.  * `embed_only` - The showcase doesn't appear on Vimeo, but it can be embedded on other sites.  * `nobody` - No one can access the showcase, including the authenticated user.  * `password` - Only those with the password can access the showcase.  * `team` - Only members of the authenticated user's team can access the showcase.  * `unlisted` - The showcase can't be accessed if the URL omits its unlisted hash. 
    Boolean reviewMode = true; // Whether showcase videos use the review mode URL.
    String sort = "added_first"; // The default sort order of the videos as they appear in the showcase.  Option descriptions:  * `added_first` - The videos appear according to when they were added to the showcase, with the most recently added first.  * `added_last` - The videos appear according to when they were added to the showcase, with the most recently added last.  * `alphabetical` - The videos appear alphabetically by their title.  * `arranged` - The videos appear as arranged by the owner of the showcase.  * `comments` - The videos appear according to their number of comments.  * `likes` - The videos appear according to their number of likes.  * `newest` - The videos appear in chronological order with the newest first.  * `oldest` - The videos appear in chronological order with the oldest first.  * `plays` - The videos appear according to their number of plays. 
    String theme = "dark"; // The color theme of the showcase.  Option descriptions:  * `dark` - The showcase uses the dark theme.  * `standard` - The showcase uses the standard theme. 
    try {
      Album result = client
              .showcasesEssentials
              .createUserShowcase(name)
              .description(description)
              .brandColor(brandColor)
              .hideFromVimeo(hideFromVimeo)
              .hideNav(hideNav)
              .hideUpcoming(hideUpcoming)
              .layout(layout)
              .password(password)
              .privacy(privacy)
              .reviewMode(reviewMode)
              .sort(sort)
              .theme(theme)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getAllowContinuousPlay());
      System.out.println(result.getAllowDownloads());
      System.out.println(result.getAllowShare());
      System.out.println(result.getAutoplay());
      System.out.println(result.getBrandColor());
      System.out.println(result.getCreatedTime());
      System.out.println(result.getCustomLogo());
      System.out.println(result.getDomain());
      System.out.println(result.getDomainCertificateState());
      System.out.println(result.getDuration());
      System.out.println(result.getEmbed());
      System.out.println(result.getEmbedBrandColor());
      System.out.println(result.getEmbedCustomLogo());
      System.out.println(result.getHasChosenThumbnail());
      System.out.println(result.getHideFromVimeo());
      System.out.println(result.getHideNav());
      System.out.println(result.getHideUpcoming());
      System.out.println(result.getHideVimeoLogo());
      System.out.println(result.getLayout());
      System.out.println(result.getLink());
      System.out.println(result.getLoop());
      System.out.println(result.getMetadata());
      System.out.println(result.getModifiedTime());
      System.out.println(result.getName());
      System.out.println(result.getPictures());
      System.out.println(result.getPrivacy());
      System.out.println(result.getResourceKey());
      System.out.println(result.getReviewMode());
      System.out.println(result.getSeoAllowIndexed());
      System.out.println(result.getSeoDescription());
      System.out.println(result.getSeoKeywords());
      System.out.println(result.getSeoTitle());
      System.out.println(result.getShareLink());
      System.out.println(result.getSort());
      System.out.println(result.getTheme());
      System.out.println(result.getUnlistedHash());
      System.out.println(result.getUri());
      System.out.println(result.getUrl());
      System.out.println(result.getUseCustomDomain());
      System.out.println(result.getUser());
      System.out.println(result.getWebBrandColor());
      System.out.println(result.getWebCustomLogo());
    } catch (ApiException e) {
      System.err.println("Exception when calling ShowcasesEssentialsApi#createUserShowcase");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Album> response = client
              .showcasesEssentials
              .createUserShowcase(name)
              .description(description)
              .brandColor(brandColor)
              .hideFromVimeo(hideFromVimeo)
              .hideNav(hideNav)
              .hideUpcoming(hideUpcoming)
              .layout(layout)
              .password(password)
              .privacy(privacy)
              .reviewMode(reviewMode)
              .sort(sort)
              .theme(theme)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ShowcasesEssentialsApi#createUserShowcase");
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
| **showcasesEssentialsCreateUserShowcaseRequest** | [**ShowcasesEssentialsCreateUserShowcaseRequest**](ShowcasesEssentialsCreateUserShowcaseRequest.md)|  | |

### Return type

[**Album**](Album.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/vnd.vimeo.album+json
 - **Accept**: application/vnd.vimeo.album+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The showcase was created. |  -  |

<a name="deleteShowcase"></a>
# **deleteShowcase**
> deleteShowcase(albumId).execute();

Delete a showcase

This method deletes the specified showcase. The authenticated user must be the owner of the showcase.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ShowcasesEssentialsApi;
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
    try {
      client
              .showcasesEssentials
              .deleteShowcase(albumId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ShowcasesEssentialsApi#deleteShowcase");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .showcasesEssentials
              .deleteShowcase(albumId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ShowcasesEssentialsApi#deleteShowcase");
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
| **204** | The showcase was deleted. |  -  |

<a name="editShowcase"></a>
# **editShowcase**
> Album editShowcase(albumId).showcasesEssentialsEditShowcaseRequest(showcasesEssentialsEditShowcaseRequest).execute();

Edit a showcase

This method edits the specified showcase. The authenticated user must be the owner of the showcase.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ShowcasesEssentialsApi;
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
    String description = "description_example"; // The description of the showcase.
    String brandColor = "brandColor_example"; // The hexadecimal code for the color of the player buttons and showcase controls.
    String domain = "domain_example"; // The custom domain of the showcase.
    Boolean hideNav = true; // Whether to hide Vimeo navigation when displaying the showcase.
    Boolean hideUpcoming = true; // Whether to include the upcoming event in the showcase.
    String layout = "grid"; // The type of layout for presenting the showcase.  Option descriptions:  * `grid` - The videos appear in a grid.  * `player` - The videos appear in the player. 
    String name = "name_example"; // The name of the showcase.
    String password = "password_example"; // The showcase's password. This field is required only when **privacy** is `password`.
    String privacy = "anybody"; // The privacy level of the showcase.  Option descriptions:  * `anybody` - Anyone can access the showcase, either on Vimeo or through an embed.  * `embed_only` - The showcase doesn't appear on Vimeo, but it can be embedded on other sites.  * `nobody` - No one can access the showcase, including the authenticated user.  * `password` - Only people with the password can access the showcase.  * `team` - Only members of the authenticated user's team can access the showcase.  * `unlisted` - The showcase can't be accessed if the URL omits its unlisted hash. 
    Boolean reviewMode = true; // Whether showcase videos use the review mode URL.
    String sort = "added_first"; // The default sort order of the videos as they appear in the showcase.  Option descriptions:  * `added_first` - The videos appear according to when they were added to the showcase, with the most recently added first.  * `added_last` - The videos appear according to when they were added to the showcase, with the most recently added last.  * `alphabetical` - The videos appear alphabetically by their title.  * `arranged` - The videos appear as arranged by the owner of the showcase.  * `comments` - The videos appear according to their number of comments.  * `likes` - The videos appear according to their number of likes.  * `newest` - The videos appear in chronological order with the newest first.  * `oldest` - The videos appear in chronological order with the oldest first.  * `plays` - The videos appear according to their number of plays. 
    String theme = "dark"; // The color theme of the showcase.  Option descriptions:  * `dark` - The showcase uses the dark theme.  * `standard` - The showcase uses the standard theme. 
    String url = "url_example"; // The custom Vimeo URL of the showcase.
    Boolean useCustomDomain = true; // Whether the user has opted for a custom domain for their showcase.
    try {
      Album result = client
              .showcasesEssentials
              .editShowcase(albumId)
              .description(description)
              .brandColor(brandColor)
              .domain(domain)
              .hideNav(hideNav)
              .hideUpcoming(hideUpcoming)
              .layout(layout)
              .name(name)
              .password(password)
              .privacy(privacy)
              .reviewMode(reviewMode)
              .sort(sort)
              .theme(theme)
              .url(url)
              .useCustomDomain(useCustomDomain)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getAllowContinuousPlay());
      System.out.println(result.getAllowDownloads());
      System.out.println(result.getAllowShare());
      System.out.println(result.getAutoplay());
      System.out.println(result.getBrandColor());
      System.out.println(result.getCreatedTime());
      System.out.println(result.getCustomLogo());
      System.out.println(result.getDomain());
      System.out.println(result.getDomainCertificateState());
      System.out.println(result.getDuration());
      System.out.println(result.getEmbed());
      System.out.println(result.getEmbedBrandColor());
      System.out.println(result.getEmbedCustomLogo());
      System.out.println(result.getHasChosenThumbnail());
      System.out.println(result.getHideFromVimeo());
      System.out.println(result.getHideNav());
      System.out.println(result.getHideUpcoming());
      System.out.println(result.getHideVimeoLogo());
      System.out.println(result.getLayout());
      System.out.println(result.getLink());
      System.out.println(result.getLoop());
      System.out.println(result.getMetadata());
      System.out.println(result.getModifiedTime());
      System.out.println(result.getName());
      System.out.println(result.getPictures());
      System.out.println(result.getPrivacy());
      System.out.println(result.getResourceKey());
      System.out.println(result.getReviewMode());
      System.out.println(result.getSeoAllowIndexed());
      System.out.println(result.getSeoDescription());
      System.out.println(result.getSeoKeywords());
      System.out.println(result.getSeoTitle());
      System.out.println(result.getShareLink());
      System.out.println(result.getSort());
      System.out.println(result.getTheme());
      System.out.println(result.getUnlistedHash());
      System.out.println(result.getUri());
      System.out.println(result.getUrl());
      System.out.println(result.getUseCustomDomain());
      System.out.println(result.getUser());
      System.out.println(result.getWebBrandColor());
      System.out.println(result.getWebCustomLogo());
    } catch (ApiException e) {
      System.err.println("Exception when calling ShowcasesEssentialsApi#editShowcase");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Album> response = client
              .showcasesEssentials
              .editShowcase(albumId)
              .description(description)
              .brandColor(brandColor)
              .domain(domain)
              .hideNav(hideNav)
              .hideUpcoming(hideUpcoming)
              .layout(layout)
              .name(name)
              .password(password)
              .privacy(privacy)
              .reviewMode(reviewMode)
              .sort(sort)
              .theme(theme)
              .url(url)
              .useCustomDomain(useCustomDomain)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ShowcasesEssentialsApi#editShowcase");
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
| **showcasesEssentialsEditShowcaseRequest** | [**ShowcasesEssentialsEditShowcaseRequest**](ShowcasesEssentialsEditShowcaseRequest.md)|  | [optional] |

### Return type

[**Album**](Album.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/vnd.vimeo.album+json
 - **Accept**: application/vnd.vimeo.album+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The showcase was edited. |  -  |

<a name="getAllUserShowcases"></a>
# **getAllUserShowcases**
> List&lt;Album&gt; getAllUserShowcases().direction(direction).page(page).perPage(perPage).query(query).sort(sort).execute();

Get all the showcases that belong to the user

This method returns every showcase belonging to the authenticated user.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ShowcasesEssentialsApi;
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
    Double page = 1D; // The page number of the results to show.
    Double perPage = 10D; // The number of items to show on each page of results, up to a maximum of 100.
    String query = "Stop motion"; // The search query to use to filter the results.
    String sort = "alphabetical"; // The way to sort the results.  Option descriptions:  * `alphabetical` - Sort the results alphabetically.  * `date` - Sort the results by date of creation.  * `duration` - Sort the results by duration.  * `videos` - Sort the results by the number of videos. 
    try {
      List<Album> result = client
              .showcasesEssentials
              .getAllUserShowcases()
              .direction(direction)
              .page(page)
              .perPage(perPage)
              .query(query)
              .sort(sort)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShowcasesEssentialsApi#getAllUserShowcases");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<Album>> response = client
              .showcasesEssentials
              .getAllUserShowcases()
              .direction(direction)
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
      System.err.println("Exception when calling ShowcasesEssentialsApi#getAllUserShowcases");
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
| **page** | **Double**| The page number of the results to show. | [optional] |
| **perPage** | **Double**| The number of items to show on each page of results, up to a maximum of 100. | [optional] |
| **query** | **String**| The search query to use to filter the results. | [optional] |
| **sort** | **String**| The way to sort the results.  Option descriptions:  * &#x60;alphabetical&#x60; - Sort the results alphabetically.  * &#x60;date&#x60; - Sort the results by date of creation.  * &#x60;duration&#x60; - Sort the results by duration.  * &#x60;videos&#x60; - Sort the results by the number of videos.  | [optional] [enum: alphabetical, date, duration, videos] |

### Return type

[**List&lt;Album&gt;**](Album.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The showcases were returned. |  -  |

<a name="getSpecificShowcase"></a>
# **getSpecificShowcase**
> Album getSpecificShowcase(albumId).execute();

Get a specific showcase

This method returns the specified showcase. The authenticated user must be the owner of the showcase.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ShowcasesEssentialsApi;
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
    try {
      Album result = client
              .showcasesEssentials
              .getSpecificShowcase(albumId)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getAllowContinuousPlay());
      System.out.println(result.getAllowDownloads());
      System.out.println(result.getAllowShare());
      System.out.println(result.getAutoplay());
      System.out.println(result.getBrandColor());
      System.out.println(result.getCreatedTime());
      System.out.println(result.getCustomLogo());
      System.out.println(result.getDomain());
      System.out.println(result.getDomainCertificateState());
      System.out.println(result.getDuration());
      System.out.println(result.getEmbed());
      System.out.println(result.getEmbedBrandColor());
      System.out.println(result.getEmbedCustomLogo());
      System.out.println(result.getHasChosenThumbnail());
      System.out.println(result.getHideFromVimeo());
      System.out.println(result.getHideNav());
      System.out.println(result.getHideUpcoming());
      System.out.println(result.getHideVimeoLogo());
      System.out.println(result.getLayout());
      System.out.println(result.getLink());
      System.out.println(result.getLoop());
      System.out.println(result.getMetadata());
      System.out.println(result.getModifiedTime());
      System.out.println(result.getName());
      System.out.println(result.getPictures());
      System.out.println(result.getPrivacy());
      System.out.println(result.getResourceKey());
      System.out.println(result.getReviewMode());
      System.out.println(result.getSeoAllowIndexed());
      System.out.println(result.getSeoDescription());
      System.out.println(result.getSeoKeywords());
      System.out.println(result.getSeoTitle());
      System.out.println(result.getShareLink());
      System.out.println(result.getSort());
      System.out.println(result.getTheme());
      System.out.println(result.getUnlistedHash());
      System.out.println(result.getUri());
      System.out.println(result.getUrl());
      System.out.println(result.getUseCustomDomain());
      System.out.println(result.getUser());
      System.out.println(result.getWebBrandColor());
      System.out.println(result.getWebCustomLogo());
    } catch (ApiException e) {
      System.err.println("Exception when calling ShowcasesEssentialsApi#getSpecificShowcase");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Album> response = client
              .showcasesEssentials
              .getSpecificShowcase(albumId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ShowcasesEssentialsApi#getSpecificShowcase");
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

### Return type

[**Album**](Album.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.vimeo.album+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The showcase was returned. |  -  |

<a name="showcase"></a>
# **showcase**
> Album showcase(userId, createShowcaseRequest).execute();

Create a showcase

This method creates a new showcase for the specified user.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ShowcasesEssentialsApi;
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
    String name = "name_example"; // The name of the showcase.
    Double userId = 152184D; // The ID of the user.
    String description = "description_example"; // The description of the showcase.
    String brandColor = "brandColor_example"; // The hexadecimal code for the color of the player buttons and showcase controls.
    Boolean hideFromVimeo = true; // Whether the showcase should be hidden from Vimeo when unlisted.
    Boolean hideNav = true; // Whether to hide Vimeo navigation when displaying the showcase.
    Boolean hideUpcoming = true; // Whether to include the upcoming event in the showcase.
    String layout = "grid"; // The type of layout for presenting the showcase.  Option descriptions:  * `grid` - The videos appear in a grid.  * `player` - The videos appear in the player. 
    String password = "password_example"; // The showcase's password. This field is required only when **privacy** is `password`.
    String privacy = "anybody"; // The privacy level of the showcase.  Option descriptions:  * `anybody` - Anyone can access the showcase, either on Vimeo or through an embed.  * `embed_only` - The showcase doesn't appear on Vimeo, but it can be embedded on other sites.  * `nobody` - No one can access the showcase, including the authenticated user.  * `password` - Only those with the password can access the showcase.  * `team` - Only members of the authenticated user's team can access the showcase.  * `unlisted` - The showcase can't be accessed if the URL omits its unlisted hash. 
    Boolean reviewMode = true; // Whether showcase videos use the review mode URL.
    String sort = "added_first"; // The default sort order of the videos as they appear in the showcase.  Option descriptions:  * `added_first` - The videos appear according to when they were added to the showcase, with the most recently added first.  * `added_last` - The videos appear according to when they were added to the showcase, with the most recently added last.  * `alphabetical` - The videos appear alphabetically by their title.  * `arranged` - The videos appear as arranged by the owner of the showcase.  * `comments` - The videos appear according to their number of comments.  * `likes` - The videos appear according to their number of likes.  * `newest` - The videos appear in chronological order with the newest first.  * `oldest` - The videos appear in chronological order with the oldest first.  * `plays` - The videos appear according to their number of plays. 
    String theme = "dark"; // The color theme of the showcase.  Option descriptions:  * `dark` - The showcase uses the dark theme.  * `standard` - The showcase uses the standard theme. 
    try {
      Album result = client
              .showcasesEssentials
              .showcase(name, userId)
              .description(description)
              .brandColor(brandColor)
              .hideFromVimeo(hideFromVimeo)
              .hideNav(hideNav)
              .hideUpcoming(hideUpcoming)
              .layout(layout)
              .password(password)
              .privacy(privacy)
              .reviewMode(reviewMode)
              .sort(sort)
              .theme(theme)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getAllowContinuousPlay());
      System.out.println(result.getAllowDownloads());
      System.out.println(result.getAllowShare());
      System.out.println(result.getAutoplay());
      System.out.println(result.getBrandColor());
      System.out.println(result.getCreatedTime());
      System.out.println(result.getCustomLogo());
      System.out.println(result.getDomain());
      System.out.println(result.getDomainCertificateState());
      System.out.println(result.getDuration());
      System.out.println(result.getEmbed());
      System.out.println(result.getEmbedBrandColor());
      System.out.println(result.getEmbedCustomLogo());
      System.out.println(result.getHasChosenThumbnail());
      System.out.println(result.getHideFromVimeo());
      System.out.println(result.getHideNav());
      System.out.println(result.getHideUpcoming());
      System.out.println(result.getHideVimeoLogo());
      System.out.println(result.getLayout());
      System.out.println(result.getLink());
      System.out.println(result.getLoop());
      System.out.println(result.getMetadata());
      System.out.println(result.getModifiedTime());
      System.out.println(result.getName());
      System.out.println(result.getPictures());
      System.out.println(result.getPrivacy());
      System.out.println(result.getResourceKey());
      System.out.println(result.getReviewMode());
      System.out.println(result.getSeoAllowIndexed());
      System.out.println(result.getSeoDescription());
      System.out.println(result.getSeoKeywords());
      System.out.println(result.getSeoTitle());
      System.out.println(result.getShareLink());
      System.out.println(result.getSort());
      System.out.println(result.getTheme());
      System.out.println(result.getUnlistedHash());
      System.out.println(result.getUri());
      System.out.println(result.getUrl());
      System.out.println(result.getUseCustomDomain());
      System.out.println(result.getUser());
      System.out.println(result.getWebBrandColor());
      System.out.println(result.getWebCustomLogo());
    } catch (ApiException e) {
      System.err.println("Exception when calling ShowcasesEssentialsApi#showcase");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Album> response = client
              .showcasesEssentials
              .showcase(name, userId)
              .description(description)
              .brandColor(brandColor)
              .hideFromVimeo(hideFromVimeo)
              .hideNav(hideNav)
              .hideUpcoming(hideUpcoming)
              .layout(layout)
              .password(password)
              .privacy(privacy)
              .reviewMode(reviewMode)
              .sort(sort)
              .theme(theme)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ShowcasesEssentialsApi#showcase");
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
| **createShowcaseRequest** | [**CreateShowcaseRequest**](CreateShowcaseRequest.md)|  | |

### Return type

[**Album**](Album.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/vnd.vimeo.album+json
 - **Accept**: application/vnd.vimeo.album+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The showcase was created. |  -  |

<a name="showcase_0"></a>
# **showcase_0**
> Album showcase_0(albumId, userId).execute();

Get a specific showcase

This method returns the specified showcase. The authenticated user must be the owner of the showcase.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ShowcasesEssentialsApi;
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
      Album result = client
              .showcasesEssentials
              .showcase_0(albumId, userId)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getAllowContinuousPlay());
      System.out.println(result.getAllowDownloads());
      System.out.println(result.getAllowShare());
      System.out.println(result.getAutoplay());
      System.out.println(result.getBrandColor());
      System.out.println(result.getCreatedTime());
      System.out.println(result.getCustomLogo());
      System.out.println(result.getDomain());
      System.out.println(result.getDomainCertificateState());
      System.out.println(result.getDuration());
      System.out.println(result.getEmbed());
      System.out.println(result.getEmbedBrandColor());
      System.out.println(result.getEmbedCustomLogo());
      System.out.println(result.getHasChosenThumbnail());
      System.out.println(result.getHideFromVimeo());
      System.out.println(result.getHideNav());
      System.out.println(result.getHideUpcoming());
      System.out.println(result.getHideVimeoLogo());
      System.out.println(result.getLayout());
      System.out.println(result.getLink());
      System.out.println(result.getLoop());
      System.out.println(result.getMetadata());
      System.out.println(result.getModifiedTime());
      System.out.println(result.getName());
      System.out.println(result.getPictures());
      System.out.println(result.getPrivacy());
      System.out.println(result.getResourceKey());
      System.out.println(result.getReviewMode());
      System.out.println(result.getSeoAllowIndexed());
      System.out.println(result.getSeoDescription());
      System.out.println(result.getSeoKeywords());
      System.out.println(result.getSeoTitle());
      System.out.println(result.getShareLink());
      System.out.println(result.getSort());
      System.out.println(result.getTheme());
      System.out.println(result.getUnlistedHash());
      System.out.println(result.getUri());
      System.out.println(result.getUrl());
      System.out.println(result.getUseCustomDomain());
      System.out.println(result.getUser());
      System.out.println(result.getWebBrandColor());
      System.out.println(result.getWebCustomLogo());
    } catch (ApiException e) {
      System.err.println("Exception when calling ShowcasesEssentialsApi#showcase_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Album> response = client
              .showcasesEssentials
              .showcase_0(albumId, userId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ShowcasesEssentialsApi#showcase_0");
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

[**Album**](Album.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.vimeo.album+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The showcase was returned. |  -  |

<a name="showcase_1"></a>
# **showcase_1**
> showcase_1(albumId, userId).execute();

Delete a showcase

This method deletes the specified showcase. The authenticated user must be the owner of the showcase.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ShowcasesEssentialsApi;
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
      client
              .showcasesEssentials
              .showcase_1(albumId, userId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ShowcasesEssentialsApi#showcase_1");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .showcasesEssentials
              .showcase_1(albumId, userId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ShowcasesEssentialsApi#showcase_1");
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

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | The showcase was deleted. |  -  |

<a name="showcase_2"></a>
# **showcase_2**
> Album showcase_2(albumId, userId).editShowcaseRequest(editShowcaseRequest).execute();

Edit a showcase

This method edits the specified showcase. The authenticated user must be the owner of the showcase.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ShowcasesEssentialsApi;
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
    String description = "description_example"; // The description of the showcase.
    String brandColor = "brandColor_example"; // The hexadecimal code for the color of the player buttons and showcase controls.
    String domain = "domain_example"; // The custom domain of the showcase.
    Boolean hideNav = true; // Whether to hide Vimeo navigation when displaying the showcase.
    Boolean hideUpcoming = true; // Whether to include the upcoming event in the showcase.
    String layout = "grid"; // The type of layout for presenting the showcase.  Option descriptions:  * `grid` - The videos appear in a grid.  * `player` - The videos appear in the player. 
    String name = "name_example"; // The name of the showcase.
    String password = "password_example"; // The showcase's password. This field is required only when **privacy** is `password`.
    String privacy = "anybody"; // The privacy level of the showcase.  Option descriptions:  * `anybody` - Anyone can access the showcase, either on Vimeo or through an embed.  * `embed_only` - The showcase doesn't appear on Vimeo, but it can be embedded on other sites.  * `nobody` - No one can access the showcase, including the authenticated user.  * `password` - Only people with the password can access the showcase.  * `team` - Only members of the authenticated user's team can access the showcase.  * `unlisted` - The showcase can't be accessed if the URL omits its unlisted hash. 
    Boolean reviewMode = true; // Whether showcase videos use the review mode URL.
    String sort = "added_first"; // The default sort order of the videos as they appear in the showcase.  Option descriptions:  * `added_first` - The videos appear according to when they were added to the showcase, with the most recently added first.  * `added_last` - The videos appear according to when they were added to the showcase, with the most recently added last.  * `alphabetical` - The videos appear alphabetically by their title.  * `arranged` - The videos appear as arranged by the owner of the showcase.  * `comments` - The videos appear according to their number of comments.  * `likes` - The videos appear according to their number of likes.  * `newest` - The videos appear in chronological order with the newest first.  * `oldest` - The videos appear in chronological order with the oldest first.  * `plays` - The videos appear according to their number of plays. 
    String theme = "dark"; // The color theme of the showcase.  Option descriptions:  * `dark` - The showcase uses the dark theme.  * `standard` - The showcase uses the standard theme. 
    String url = "url_example"; // The custom Vimeo URL of the showcase.
    Boolean useCustomDomain = true; // Whether the user has opted for a custom domain for their showcase.
    try {
      Album result = client
              .showcasesEssentials
              .showcase_2(albumId, userId)
              .description(description)
              .brandColor(brandColor)
              .domain(domain)
              .hideNav(hideNav)
              .hideUpcoming(hideUpcoming)
              .layout(layout)
              .name(name)
              .password(password)
              .privacy(privacy)
              .reviewMode(reviewMode)
              .sort(sort)
              .theme(theme)
              .url(url)
              .useCustomDomain(useCustomDomain)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getAllowContinuousPlay());
      System.out.println(result.getAllowDownloads());
      System.out.println(result.getAllowShare());
      System.out.println(result.getAutoplay());
      System.out.println(result.getBrandColor());
      System.out.println(result.getCreatedTime());
      System.out.println(result.getCustomLogo());
      System.out.println(result.getDomain());
      System.out.println(result.getDomainCertificateState());
      System.out.println(result.getDuration());
      System.out.println(result.getEmbed());
      System.out.println(result.getEmbedBrandColor());
      System.out.println(result.getEmbedCustomLogo());
      System.out.println(result.getHasChosenThumbnail());
      System.out.println(result.getHideFromVimeo());
      System.out.println(result.getHideNav());
      System.out.println(result.getHideUpcoming());
      System.out.println(result.getHideVimeoLogo());
      System.out.println(result.getLayout());
      System.out.println(result.getLink());
      System.out.println(result.getLoop());
      System.out.println(result.getMetadata());
      System.out.println(result.getModifiedTime());
      System.out.println(result.getName());
      System.out.println(result.getPictures());
      System.out.println(result.getPrivacy());
      System.out.println(result.getResourceKey());
      System.out.println(result.getReviewMode());
      System.out.println(result.getSeoAllowIndexed());
      System.out.println(result.getSeoDescription());
      System.out.println(result.getSeoKeywords());
      System.out.println(result.getSeoTitle());
      System.out.println(result.getShareLink());
      System.out.println(result.getSort());
      System.out.println(result.getTheme());
      System.out.println(result.getUnlistedHash());
      System.out.println(result.getUri());
      System.out.println(result.getUrl());
      System.out.println(result.getUseCustomDomain());
      System.out.println(result.getUser());
      System.out.println(result.getWebBrandColor());
      System.out.println(result.getWebCustomLogo());
    } catch (ApiException e) {
      System.err.println("Exception when calling ShowcasesEssentialsApi#showcase_2");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Album> response = client
              .showcasesEssentials
              .showcase_2(albumId, userId)
              .description(description)
              .brandColor(brandColor)
              .domain(domain)
              .hideNav(hideNav)
              .hideUpcoming(hideUpcoming)
              .layout(layout)
              .name(name)
              .password(password)
              .privacy(privacy)
              .reviewMode(reviewMode)
              .sort(sort)
              .theme(theme)
              .url(url)
              .useCustomDomain(useCustomDomain)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ShowcasesEssentialsApi#showcase_2");
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
| **editShowcaseRequest** | [**EditShowcaseRequest**](EditShowcaseRequest.md)|  | [optional] |

### Return type

[**Album**](Album.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/vnd.vimeo.album+json
 - **Accept**: application/vnd.vimeo.album+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The showcase was edited. |  -  |

<a name="showcases"></a>
# **showcases**
> List&lt;Album&gt; showcases(userId).direction(direction).page(page).perPage(perPage).query(query).sort(sort).execute();

Get all the showcases that belong to the user

This method returns every showcase belonging to the authenticated user.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ShowcasesEssentialsApi;
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
    Double page = 1D; // The page number of the results to show.
    Double perPage = 10D; // The number of items to show on each page of results, up to a maximum of 100.
    String query = "Stop motion"; // The search query to use to filter the results.
    String sort = "alphabetical"; // The way to sort the results.  Option descriptions:  * `alphabetical` - Sort the results alphabetically.  * `date` - Sort the results by date of creation.  * `duration` - Sort the results by duration.  * `videos` - Sort the results by the number of videos. 
    try {
      List<Album> result = client
              .showcasesEssentials
              .showcases(userId)
              .direction(direction)
              .page(page)
              .perPage(perPage)
              .query(query)
              .sort(sort)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShowcasesEssentialsApi#showcases");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<Album>> response = client
              .showcasesEssentials
              .showcases(userId)
              .direction(direction)
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
      System.err.println("Exception when calling ShowcasesEssentialsApi#showcases");
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
| **page** | **Double**| The page number of the results to show. | [optional] |
| **perPage** | **Double**| The number of items to show on each page of results, up to a maximum of 100. | [optional] |
| **query** | **String**| The search query to use to filter the results. | [optional] |
| **sort** | **String**| The way to sort the results.  Option descriptions:  * &#x60;alphabetical&#x60; - Sort the results alphabetically.  * &#x60;date&#x60; - Sort the results by date of creation.  * &#x60;duration&#x60; - Sort the results by duration.  * &#x60;videos&#x60; - Sort the results by the number of videos.  | [optional] [enum: alphabetical, date, duration, videos] |

### Return type

[**List&lt;Album&gt;**](Album.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The showcases were returned. |  -  |

<a name="showcases_0"></a>
# **showcases_0**
> showcases_0(userId, albumItemUris, albumUris).execute();

Add videos and live events to showcases

This method adds videos and events to the specified showcases. The authenticated user must either be the owner of the showcase or have team permissions.  The present setup permits only one event per showcase.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ShowcasesEssentialsApi;
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
    String albumItemUris = "/videos/258684937,/live_events/273576296"; // A comma-separated list of video or event URIs.
    String albumUris = "/showcases/258684873, /showcases/356684937"; // A comma-separated list of showcase URIs.
    try {
      client
              .showcasesEssentials
              .showcases_0(userId, albumItemUris, albumUris)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ShowcasesEssentialsApi#showcases_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .showcasesEssentials
              .showcases_0(userId, albumItemUris, albumUris)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ShowcasesEssentialsApi#showcases_0");
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
| **albumItemUris** | **String**| A comma-separated list of video or event URIs. | |
| **albumUris** | **String**| A comma-separated list of showcase URIs. | |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | The videos and events were added to the showcases. |  -  |

