# VideosCreditsApi

All URIs are relative to *https://api.vimeo.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addUserCredit**](VideosCreditsApi.md#addUserCredit) | **POST** /videos/{video_id}/credits | Credit a user in a video |
| [**addUserCreditInVideo**](VideosCreditsApi.md#addUserCreditInVideo) | **POST** /channels/{channel_id}/videos/{video_id}/credits | Credit a user in a video |
| [**deleteUserCredit**](VideosCreditsApi.md#deleteUserCredit) | **DELETE** /videos/{video_id}/credits/{credit_id} | Delete the credit for a user in a video |
| [**editUserCreditInVideo**](VideosCreditsApi.md#editUserCreditInVideo) | **PATCH** /videos/{video_id}/credits/{credit_id} | Edit the credit for a user in a video |
| [**getAllCreditedUsersInVideo**](VideosCreditsApi.md#getAllCreditedUsersInVideo) | **GET** /channels/{channel_id}/videos/{video_id}/credits | Get all the credited users in a video |
| [**getAllCreditedUsersInVideo_0**](VideosCreditsApi.md#getAllCreditedUsersInVideo_0) | **GET** /videos/{video_id}/credits | Get all the credited users in a video |
| [**getSpecificCreditedUser**](VideosCreditsApi.md#getSpecificCreditedUser) | **GET** /videos/{video_id}/credits/{credit_id} | Get a specific credited user in a video |
| [**users**](VideosCreditsApi.md#users) | **GET** /videos/{video_id}/credits/available_users | Get users who can be credited on a video |


<a name="addUserCredit"></a>
# **addUserCredit**
> Credit addUserCredit(videoId, videosCreditsAddUserCreditRequest).execute();

Credit a user in a video

This method adds a user credit to the specified video.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VideosCreditsApi;
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
    String email = "email_example"; // The email address of the credited person.
    String name = "name_example"; // The name of the credited person.
    String role = "role_example"; // The role of the credited person.
    String userUri = "userUri_example"; // The Vimeo URI of the credited person.
    Double videoId = 258684937D; // The ID of the video.
    try {
      Credit result = client
              .videosCredits
              .addUserCredit(email, name, role, userUri, videoId)
              .execute();
      System.out.println(result);
      System.out.println(result.getName());
      System.out.println(result.getRole());
      System.out.println(result.getUri());
      System.out.println(result.getUser());
      System.out.println(result.getVideo());
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosCreditsApi#addUserCredit");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Credit> response = client
              .videosCredits
              .addUserCredit(email, name, role, userUri, videoId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosCreditsApi#addUserCredit");
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
| **videoId** | **Double**| The ID of the video. | |
| **videosCreditsAddUserCreditRequest** | [**VideosCreditsAddUserCreditRequest**](VideosCreditsAddUserCreditRequest.md)|  | |

### Return type

[**Credit**](Credit.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/vnd.vimeo.credit+json
 - **Accept**: application/vnd.vimeo.credit+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The credit was added. |  -  |

<a name="addUserCreditInVideo"></a>
# **addUserCreditInVideo**
> Credit addUserCreditInVideo(channelId, videoId, videosCreditsAddUserCreditInVideoRequest).execute();

Credit a user in a video

This method adds a user credit to the specified video.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VideosCreditsApi;
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
    String email = "email_example"; // The email address of the credited person.
    String name = "name_example"; // The name of the credited person.
    String role = "role_example"; // The role of the credited person.
    String userUri = "userUri_example"; // The Vimeo URI of the credited person.
    Double channelId = 927D; // The ID of the channel.
    Double videoId = 258684937D; // The ID of the video.
    try {
      Credit result = client
              .videosCredits
              .addUserCreditInVideo(email, name, role, userUri, channelId, videoId)
              .execute();
      System.out.println(result);
      System.out.println(result.getName());
      System.out.println(result.getRole());
      System.out.println(result.getUri());
      System.out.println(result.getUser());
      System.out.println(result.getVideo());
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosCreditsApi#addUserCreditInVideo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Credit> response = client
              .videosCredits
              .addUserCreditInVideo(email, name, role, userUri, channelId, videoId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosCreditsApi#addUserCreditInVideo");
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
| **videoId** | **Double**| The ID of the video. | |
| **videosCreditsAddUserCreditInVideoRequest** | [**VideosCreditsAddUserCreditInVideoRequest**](VideosCreditsAddUserCreditInVideoRequest.md)|  | |

### Return type

[**Credit**](Credit.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/vnd.vimeo.credit+json
 - **Accept**: application/vnd.vimeo.credit+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The credit was added. |  -  |

<a name="deleteUserCredit"></a>
# **deleteUserCredit**
> deleteUserCredit(creditId, videoId).execute();

Delete the credit for a user in a video

This method deletes the specified user credit from a video. The authenticated user must be the creator of the credit or the credited user.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VideosCreditsApi;
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
    Double creditId = 12345D; // The ID of the credit.
    Double videoId = 258684937D; // The ID of the video.
    try {
      client
              .videosCredits
              .deleteUserCredit(creditId, videoId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosCreditsApi#deleteUserCredit");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .videosCredits
              .deleteUserCredit(creditId, videoId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosCreditsApi#deleteUserCredit");
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
| **creditId** | **Double**| The ID of the credit. | |
| **videoId** | **Double**| The ID of the video. | |

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
| **204** | The credit was deleted. |  -  |

<a name="editUserCreditInVideo"></a>
# **editUserCreditInVideo**
> Credit editUserCreditInVideo(creditId, videoId).videosCreditsEditUserCreditInVideoRequest(videosCreditsEditUserCreditInVideoRequest).execute();

Edit the credit for a user in a video

This method edits the specified user credit in a video.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VideosCreditsApi;
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
    Double creditId = 12345D; // The ID of the credit.
    Double videoId = 258684937D; // The ID of the video.
    String name = "name_example"; // The name of the credited person.
    String role = "role_example"; // The role of the credited person.
    try {
      Credit result = client
              .videosCredits
              .editUserCreditInVideo(creditId, videoId)
              .name(name)
              .role(role)
              .execute();
      System.out.println(result);
      System.out.println(result.getName());
      System.out.println(result.getRole());
      System.out.println(result.getUri());
      System.out.println(result.getUser());
      System.out.println(result.getVideo());
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosCreditsApi#editUserCreditInVideo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Credit> response = client
              .videosCredits
              .editUserCreditInVideo(creditId, videoId)
              .name(name)
              .role(role)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosCreditsApi#editUserCreditInVideo");
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
| **creditId** | **Double**| The ID of the credit. | |
| **videoId** | **Double**| The ID of the video. | |
| **videosCreditsEditUserCreditInVideoRequest** | [**VideosCreditsEditUserCreditInVideoRequest**](VideosCreditsEditUserCreditInVideoRequest.md)|  | [optional] |

### Return type

[**Credit**](Credit.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/vnd.vimeo.credit+json
 - **Accept**: application/vnd.vimeo.credit+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The credit was edited. |  -  |

<a name="getAllCreditedUsersInVideo"></a>
# **getAllCreditedUsersInVideo**
> List&lt;Credit&gt; getAllCreditedUsersInVideo(channelId, videoId).direction(direction).page(page).perPage(perPage).query(query).sort(sort).execute();

Get all the credited users in a video

This method returns every credited user in a video.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VideosCreditsApi;
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
    Double videoId = 258684937D; // The ID of the video.
    String direction = "asc"; // The sort direction of the results.  Option descriptions:  * `asc` - Sort the results in ascending order.  * `desc` - Sort the results in descending order. 
    Double page = 1D; // The page number of the results to show.
    Double perPage = 10D; // The number of items to show on each page of results, up to a maximum of 100.
    String query = "Stop motion"; // The search query to use to filter the results.
    String sort = "alphabetical"; // The way to sort the results.  Option descriptions:  * `alphabetical` - Sort the results alphabetically.  * `date` - Sort the results by date. 
    try {
      List<Credit> result = client
              .videosCredits
              .getAllCreditedUsersInVideo(channelId, videoId)
              .direction(direction)
              .page(page)
              .perPage(perPage)
              .query(query)
              .sort(sort)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosCreditsApi#getAllCreditedUsersInVideo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<Credit>> response = client
              .videosCredits
              .getAllCreditedUsersInVideo(channelId, videoId)
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
      System.err.println("Exception when calling VideosCreditsApi#getAllCreditedUsersInVideo");
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
| **videoId** | **Double**| The ID of the video. | |
| **direction** | **String**| The sort direction of the results.  Option descriptions:  * &#x60;asc&#x60; - Sort the results in ascending order.  * &#x60;desc&#x60; - Sort the results in descending order.  | [optional] [enum: asc, desc] |
| **page** | **Double**| The page number of the results to show. | [optional] |
| **perPage** | **Double**| The number of items to show on each page of results, up to a maximum of 100. | [optional] |
| **query** | **String**| The search query to use to filter the results. | [optional] |
| **sort** | **String**| The way to sort the results.  Option descriptions:  * &#x60;alphabetical&#x60; - Sort the results alphabetically.  * &#x60;date&#x60; - Sort the results by date.  | [optional] [enum: alphabetical, date] |

### Return type

[**List&lt;Credit&gt;**](Credit.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.vimeo.credit+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The credited users were returned. |  -  |

<a name="getAllCreditedUsersInVideo_0"></a>
# **getAllCreditedUsersInVideo_0**
> List&lt;Credit&gt; getAllCreditedUsersInVideo_0(videoId).direction(direction).page(page).perPage(perPage).query(query).sort(sort).execute();

Get all the credited users in a video

This method returns every credited user in a video.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VideosCreditsApi;
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
    Double videoId = 258684937D; // The ID of the video.
    String direction = "asc"; // The sort direction of the results.  Option descriptions:  * `asc` - Sort the results in ascending order.  * `desc` - Sort the results in descending order. 
    Double page = 1D; // The page number of the results to show.
    Double perPage = 10D; // The number of items to show on each page of results, up to a maximum of 100.
    String query = "Stop motion"; // The search query to use to filter the results.
    String sort = "alphabetical"; // The way to sort the results.  Option descriptions:  * `alphabetical` - Sort the results alphabetically.  * `date` - Sort the results by date. 
    try {
      List<Credit> result = client
              .videosCredits
              .getAllCreditedUsersInVideo_0(videoId)
              .direction(direction)
              .page(page)
              .perPage(perPage)
              .query(query)
              .sort(sort)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosCreditsApi#getAllCreditedUsersInVideo_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<Credit>> response = client
              .videosCredits
              .getAllCreditedUsersInVideo_0(videoId)
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
      System.err.println("Exception when calling VideosCreditsApi#getAllCreditedUsersInVideo_0");
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
| **videoId** | **Double**| The ID of the video. | |
| **direction** | **String**| The sort direction of the results.  Option descriptions:  * &#x60;asc&#x60; - Sort the results in ascending order.  * &#x60;desc&#x60; - Sort the results in descending order.  | [optional] [enum: asc, desc] |
| **page** | **Double**| The page number of the results to show. | [optional] |
| **perPage** | **Double**| The number of items to show on each page of results, up to a maximum of 100. | [optional] |
| **query** | **String**| The search query to use to filter the results. | [optional] |
| **sort** | **String**| The way to sort the results.  Option descriptions:  * &#x60;alphabetical&#x60; - Sort the results alphabetically.  * &#x60;date&#x60; - Sort the results by date.  | [optional] [enum: alphabetical, date] |

### Return type

[**List&lt;Credit&gt;**](Credit.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.vimeo.credit+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The credited users were returned. |  -  |

<a name="getSpecificCreditedUser"></a>
# **getSpecificCreditedUser**
> Credit getSpecificCreditedUser(creditId, videoId).execute();

Get a specific credited user in a video

This method returns a single credited user in a video.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VideosCreditsApi;
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
    Double creditId = 12345D; // The ID of the credit.
    Double videoId = 258684937D; // The ID of the video.
    try {
      Credit result = client
              .videosCredits
              .getSpecificCreditedUser(creditId, videoId)
              .execute();
      System.out.println(result);
      System.out.println(result.getName());
      System.out.println(result.getRole());
      System.out.println(result.getUri());
      System.out.println(result.getUser());
      System.out.println(result.getVideo());
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosCreditsApi#getSpecificCreditedUser");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Credit> response = client
              .videosCredits
              .getSpecificCreditedUser(creditId, videoId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosCreditsApi#getSpecificCreditedUser");
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
| **creditId** | **Double**| The ID of the credit. | |
| **videoId** | **Double**| The ID of the video. | |

### Return type

[**Credit**](Credit.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.vimeo.credit+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The credit was returned. |  -  |

<a name="users"></a>
# **users**
> List&lt;User&gt; users(videoId).direction(direction).page(page).perPage(perPage).query(query).sort(sort).execute();

Get users who can be credited on a video

This method returns the users who can be credited on the specified video.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VideosCreditsApi;
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
    Double videoId = 258684937D; // The ID of the video.
    String direction = "asc"; // The sort direction of the results.  Option descriptions:  * `asc` - Sort the results in ascending order.  * `desc` - Sort the results in descending order. 
    Double page = 1D; // The page number of the results to show.
    Double perPage = 10D; // The number of items to show on each page of results, up to a maximum of 100.
    String query = "Stop motion"; // The search query to use to filter the results.
    String sort = "alphabetical"; // The way to sort the results.  Option descriptions:  * `alphabetical` - Sort the results alphabetically.  * `date` - Sort the results by date followed. 
    try {
      List<User> result = client
              .videosCredits
              .users(videoId)
              .direction(direction)
              .page(page)
              .perPage(perPage)
              .query(query)
              .sort(sort)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosCreditsApi#users");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<User>> response = client
              .videosCredits
              .users(videoId)
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
      System.err.println("Exception when calling VideosCreditsApi#users");
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
| **videoId** | **Double**| The ID of the video. | |
| **direction** | **String**| The sort direction of the results.  Option descriptions:  * &#x60;asc&#x60; - Sort the results in ascending order.  * &#x60;desc&#x60; - Sort the results in descending order.  | [optional] [enum: asc, desc] |
| **page** | **Double**| The page number of the results to show. | [optional] |
| **perPage** | **Double**| The number of items to show on each page of results, up to a maximum of 100. | [optional] |
| **query** | **String**| The search query to use to filter the results. | [optional] |
| **sort** | **String**| The way to sort the results.  Option descriptions:  * &#x60;alphabetical&#x60; - Sort the results alphabetically.  * &#x60;date&#x60; - Sort the results by date followed.  | [optional] [enum: alphabetical, date] |

### Return type

[**List&lt;User&gt;**](User.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.vimeo.user+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The users who can be credited were returned. |  -  |

