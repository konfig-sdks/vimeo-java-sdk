# UsersEssentialsApi

All URIs are relative to *https://api.vimeo.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**editVimeoAccount**](UsersEssentialsApi.md#editVimeoAccount) | **PATCH** /me | Edit the user |
| [**getUser**](UsersEssentialsApi.md#getUser) | **GET** /me | Get the user |
| [**user**](UsersEssentialsApi.md#user) | **GET** /users/{user_id} | Get the user |
| [**user_0**](UsersEssentialsApi.md#user_0) | **PATCH** /users/{user_id} | Edit the user |


<a name="editVimeoAccount"></a>
# **editVimeoAccount**
> User editVimeoAccount().usersEssentialsEditVimeoAccountRequest(usersEssentialsEditVimeoAccountRequest).execute();

Edit the user

This method edits the Vimeo account of the authenticated user.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UsersEssentialsApi;
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
    String bio = "bio_example"; // The user's bio.
    List<String> contentFilter = Arrays.asList(); // A list of values describing the content in the user's videos. Find the full list in the [/contentratings](https://developer.vimeo.com/api/reference/videos#get_content_ratings) endpoint. You must provide a comma-separated list if you're using a query string or an array if you're using JSON.
    String gender = "f"; // The authenticated user's gender.  Option descriptions:  * `f` - The user's preferred pronouns are she and her.  * `m` - The user's preferred pronouns are he and him.  * `n` - The user would rather not give preferred pronouns.  * `o` - The user's preferred pronouns are they and them. 
    String link = "link_example"; // The user's custom Vimeo URL.
    String location = "location_example"; // The user's location.
    String name = "name_example"; // The user's display name.
    String password = "password_example"; // The default password for all future videos that this user uploads. To use this field, the **videos.privacy.view** field must be `password`.
    UsersEssentialsEditVimeoAccountRequestVideos videos = new UsersEssentialsEditVimeoAccountRequestVideos();
    try {
      User result = client
              .usersEssentials
              .editVimeoAccount()
              .bio(bio)
              .contentFilter(contentFilter)
              .gender(gender)
              .link(link)
              .location(location)
              .name(name)
              .password(password)
              .videos(videos)
              .execute();
      System.out.println(result);
      System.out.println(result.getAccount());
      System.out.println(result.getAvailableForHire());
      System.out.println(result.getBio());
      System.out.println(result.getCanWorkRemotely());
      System.out.println(result.getCapabilities());
      System.out.println(result.getClients());
      System.out.println(result.getContentFilter());
      System.out.println(result.getCreatedTime());
      System.out.println(result.getGender());
      System.out.println(result.getHasInvalidEmail());
      System.out.println(result.getIsExpert());
      System.out.println(result.getLink());
      System.out.println(result.getLocation());
      System.out.println(result.getLocationDetails());
      System.out.println(result.getMetadata());
      System.out.println(result.getName());
      System.out.println(result.getPictures());
      System.out.println(result.getPreferences());
      System.out.println(result.getResourceKey());
      System.out.println(result.getShortBio());
      System.out.println(result.getSkills());
      System.out.println(result.getUploadQuota());
      System.out.println(result.getUri());
      System.out.println(result.getWebsites());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersEssentialsApi#editVimeoAccount");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<User> response = client
              .usersEssentials
              .editVimeoAccount()
              .bio(bio)
              .contentFilter(contentFilter)
              .gender(gender)
              .link(link)
              .location(location)
              .name(name)
              .password(password)
              .videos(videos)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersEssentialsApi#editVimeoAccount");
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
| **usersEssentialsEditVimeoAccountRequest** | [**UsersEssentialsEditVimeoAccountRequest**](UsersEssentialsEditVimeoAccountRequest.md)|  | [optional] |

### Return type

[**User**](User.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/vnd.vimeo.user+json
 - **Accept**: application/vnd.vimeo.user+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The user&#39;s Vimeo account was edited. |  -  |

<a name="getUser"></a>
# **getUser**
> User getUser().execute();

Get the user

This method returns the authenticated user.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UsersEssentialsApi;
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
      User result = client
              .usersEssentials
              .getUser()
              .execute();
      System.out.println(result);
      System.out.println(result.getAccount());
      System.out.println(result.getAvailableForHire());
      System.out.println(result.getBio());
      System.out.println(result.getCanWorkRemotely());
      System.out.println(result.getCapabilities());
      System.out.println(result.getClients());
      System.out.println(result.getContentFilter());
      System.out.println(result.getCreatedTime());
      System.out.println(result.getGender());
      System.out.println(result.getHasInvalidEmail());
      System.out.println(result.getIsExpert());
      System.out.println(result.getLink());
      System.out.println(result.getLocation());
      System.out.println(result.getLocationDetails());
      System.out.println(result.getMetadata());
      System.out.println(result.getName());
      System.out.println(result.getPictures());
      System.out.println(result.getPreferences());
      System.out.println(result.getResourceKey());
      System.out.println(result.getShortBio());
      System.out.println(result.getSkills());
      System.out.println(result.getUploadQuota());
      System.out.println(result.getUri());
      System.out.println(result.getWebsites());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersEssentialsApi#getUser");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<User> response = client
              .usersEssentials
              .getUser()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersEssentialsApi#getUser");
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

[**User**](User.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.vimeo.user+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The user was returned. |  -  |

<a name="user"></a>
# **user**
> User user(userId).execute();

Get the user

This method returns the authenticated user.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UsersEssentialsApi;
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
    try {
      User result = client
              .usersEssentials
              .user(userId)
              .execute();
      System.out.println(result);
      System.out.println(result.getAccount());
      System.out.println(result.getAvailableForHire());
      System.out.println(result.getBio());
      System.out.println(result.getCanWorkRemotely());
      System.out.println(result.getCapabilities());
      System.out.println(result.getClients());
      System.out.println(result.getContentFilter());
      System.out.println(result.getCreatedTime());
      System.out.println(result.getGender());
      System.out.println(result.getHasInvalidEmail());
      System.out.println(result.getIsExpert());
      System.out.println(result.getLink());
      System.out.println(result.getLocation());
      System.out.println(result.getLocationDetails());
      System.out.println(result.getMetadata());
      System.out.println(result.getName());
      System.out.println(result.getPictures());
      System.out.println(result.getPreferences());
      System.out.println(result.getResourceKey());
      System.out.println(result.getShortBio());
      System.out.println(result.getSkills());
      System.out.println(result.getUploadQuota());
      System.out.println(result.getUri());
      System.out.println(result.getWebsites());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersEssentialsApi#user");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<User> response = client
              .usersEssentials
              .user(userId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersEssentialsApi#user");
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

### Return type

[**User**](User.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.vimeo.user+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The user was returned. |  -  |

<a name="user_0"></a>
# **user_0**
> User user_0(userId).editUserRequest(editUserRequest).execute();

Edit the user

This method edits the Vimeo account of the authenticated user.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UsersEssentialsApi;
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
    String bio = "bio_example"; // The user's bio.
    List<String> contentFilter = Arrays.asList(); // A list of values describing the content in the user's videos. Find the full list in the [/contentratings](https://developer.vimeo.com/api/reference/videos#get_content_ratings) endpoint. You must provide a comma-separated list if you're using a query string or an array if you're using JSON.
    String gender = "f"; // The authenticated user's gender.  Option descriptions:  * `f` - The user's preferred pronouns are she and her.  * `m` - The user's preferred pronouns are he and him.  * `n` - The user would rather not give preferred pronouns.  * `o` - The user's preferred pronouns are they and them. 
    String link = "link_example"; // The user's custom Vimeo URL.
    String location = "location_example"; // The user's location.
    String name = "name_example"; // The user's display name.
    String password = "password_example"; // The default password for all future videos that this user uploads. To use this field, the **videos.privacy.view** field must be `password`.
    EditUserRequestVideos videos = new EditUserRequestVideos();
    try {
      User result = client
              .usersEssentials
              .user_0(userId)
              .bio(bio)
              .contentFilter(contentFilter)
              .gender(gender)
              .link(link)
              .location(location)
              .name(name)
              .password(password)
              .videos(videos)
              .execute();
      System.out.println(result);
      System.out.println(result.getAccount());
      System.out.println(result.getAvailableForHire());
      System.out.println(result.getBio());
      System.out.println(result.getCanWorkRemotely());
      System.out.println(result.getCapabilities());
      System.out.println(result.getClients());
      System.out.println(result.getContentFilter());
      System.out.println(result.getCreatedTime());
      System.out.println(result.getGender());
      System.out.println(result.getHasInvalidEmail());
      System.out.println(result.getIsExpert());
      System.out.println(result.getLink());
      System.out.println(result.getLocation());
      System.out.println(result.getLocationDetails());
      System.out.println(result.getMetadata());
      System.out.println(result.getName());
      System.out.println(result.getPictures());
      System.out.println(result.getPreferences());
      System.out.println(result.getResourceKey());
      System.out.println(result.getShortBio());
      System.out.println(result.getSkills());
      System.out.println(result.getUploadQuota());
      System.out.println(result.getUri());
      System.out.println(result.getWebsites());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersEssentialsApi#user_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<User> response = client
              .usersEssentials
              .user_0(userId)
              .bio(bio)
              .contentFilter(contentFilter)
              .gender(gender)
              .link(link)
              .location(location)
              .name(name)
              .password(password)
              .videos(videos)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersEssentialsApi#user_0");
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
| **editUserRequest** | [**EditUserRequest**](EditUserRequest.md)|  | [optional] |

### Return type

[**User**](User.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/vnd.vimeo.user+json
 - **Accept**: application/vnd.vimeo.user+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The user&#39;s Vimeo account was edited. |  -  |

