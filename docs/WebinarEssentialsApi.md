# WebinarEssentialsApi

All URIs are relative to *https://api.vimeo.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createWebinar**](WebinarEssentialsApi.md#createWebinar) | **POST** /me/webinars | Create a webinar |
| [**getSpecificWebinar**](WebinarEssentialsApi.md#getSpecificWebinar) | **GET** /me/webinars/{webinar_id} | Get a specific webinar |
| [**getSpecificWebinar_0**](WebinarEssentialsApi.md#getSpecificWebinar_0) | **GET** /webinars/{webinar_id} | Get a specific webinar |
| [**updateWebinarBelongingToAuthenticatedUser**](WebinarEssentialsApi.md#updateWebinarBelongingToAuthenticatedUser) | **PATCH** /me/webinars/{webinar_id} | Update a webinar |
| [**webinar**](WebinarEssentialsApi.md#webinar) | **POST** /users/{user_id}/webinars | Create a webinar |
| [**webinar_0**](WebinarEssentialsApi.md#webinar_0) | **GET** /users/{user_id}/webinars/{webinar_id} | Get a specific webinar |
| [**webinar_1**](WebinarEssentialsApi.md#webinar_1) | **PATCH** /users/{user_id}/webinars/{webinar_id} | Update a webinar |


<a name="createWebinar"></a>
# **createWebinar**
> Webinar createWebinar(webinarEssentialsCreateWebinarRequest).execute();

Create a webinar

This method creates a new webinar for the authenticated user.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WebinarEssentialsApi;
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
    String title = "title_example"; // The title of the webinar.
    String description = "description_example"; // The description of the webinar.
    WebinarEssentialsCreateWebinarRequestEmailSettings emailSettings = new WebinarEssentialsCreateWebinarRequestEmailSettings();
    Double folderUri = 3.4D; // The URI of the webinar's folder.
    String password = "password_example"; // The password when **privacy.view** is `password`. Anyone with the password can view the videos generated by streaming to the webinar event.
    WebinarEssentialsCreateWebinarRequestPrivacy privacy = new WebinarEssentialsCreateWebinarRequestPrivacy();
    WebinarEssentialsCreateWebinarRequestSchedule schedule = new WebinarEssentialsCreateWebinarRequestSchedule();
    String timeZone = "timeZone_example"; // The time zone used in resolving the timestamps that are included in the automatically generated video titles for the webinar.
    try {
      Webinar result = client
              .webinarEssentials
              .createWebinar(title)
              .description(description)
              .emailSettings(emailSettings)
              .folderUri(folderUri)
              .password(password)
              .privacy(privacy)
              .schedule(schedule)
              .timeZone(timeZone)
              .execute();
      System.out.println(result);
      System.out.println(result.getTitle());
      System.out.println(result.getDescription());
      System.out.println(result.getCompletedOn());
      System.out.println(result.getCreatedTime());
      System.out.println(result.getEdit());
      System.out.println(result.getEmailProviderList());
      System.out.println(result.getEmailQuota());
      System.out.println(result.getEmailSettings());
      System.out.println(result.getEvents());
      System.out.println(result.getHasPolls());
      System.out.println(result.getMetadata());
      System.out.println(result.getModifiedOn());
      System.out.println(result.getNextOccurrenceTime());
      System.out.println(result.getPassword());
      System.out.println(result.getPrivacy());
      System.out.println(result.getRegistrationData());
      System.out.println(result.getRegistrationForm());
      System.out.println(result.getSchedule());
      System.out.println(result.getStatus());
      System.out.println(result.getTimeZone());
      System.out.println(result.getUri());
      System.out.println(result.getUser());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebinarEssentialsApi#createWebinar");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Webinar> response = client
              .webinarEssentials
              .createWebinar(title)
              .description(description)
              .emailSettings(emailSettings)
              .folderUri(folderUri)
              .password(password)
              .privacy(privacy)
              .schedule(schedule)
              .timeZone(timeZone)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebinarEssentialsApi#createWebinar");
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
| **webinarEssentialsCreateWebinarRequest** | [**WebinarEssentialsCreateWebinarRequest**](WebinarEssentialsCreateWebinarRequest.md)|  | |

### Return type

[**Webinar**](Webinar.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/vnd.vimeo.webinars+json
 - **Accept**: application/vnd.vimeo.webinars+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The webinar was created. |  -  |

<a name="getSpecificWebinar"></a>
# **getSpecificWebinar**
> Webinar getSpecificWebinar(webinarId).execute();

Get a specific webinar

This method returns a single webinar belonging to the authenticated user.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WebinarEssentialsApi;
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
    String webinarId = "f19bfa08-b266-4f20-bfce-db1d0719b52f"; // The ID of the webinar.
    try {
      Webinar result = client
              .webinarEssentials
              .getSpecificWebinar(webinarId)
              .execute();
      System.out.println(result);
      System.out.println(result.getTitle());
      System.out.println(result.getDescription());
      System.out.println(result.getCompletedOn());
      System.out.println(result.getCreatedTime());
      System.out.println(result.getEdit());
      System.out.println(result.getEmailProviderList());
      System.out.println(result.getEmailQuota());
      System.out.println(result.getEmailSettings());
      System.out.println(result.getEvents());
      System.out.println(result.getHasPolls());
      System.out.println(result.getMetadata());
      System.out.println(result.getModifiedOn());
      System.out.println(result.getNextOccurrenceTime());
      System.out.println(result.getPassword());
      System.out.println(result.getPrivacy());
      System.out.println(result.getRegistrationData());
      System.out.println(result.getRegistrationForm());
      System.out.println(result.getSchedule());
      System.out.println(result.getStatus());
      System.out.println(result.getTimeZone());
      System.out.println(result.getUri());
      System.out.println(result.getUser());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebinarEssentialsApi#getSpecificWebinar");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Webinar> response = client
              .webinarEssentials
              .getSpecificWebinar(webinarId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebinarEssentialsApi#getSpecificWebinar");
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
| **webinarId** | **String**| The ID of the webinar. | |

### Return type

[**Webinar**](Webinar.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.vimeo.webinars+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The webinar was returned. |  -  |

<a name="getSpecificWebinar_0"></a>
# **getSpecificWebinar_0**
> Webinar getSpecificWebinar_0(webinarId).execute();

Get a specific webinar

This method returns a single webinar belonging to the authenticated user.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WebinarEssentialsApi;
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
    String webinarId = "f19bfa08-b266-4f20-bfce-db1d0719b52f"; // The ID of the webinar.
    try {
      Webinar result = client
              .webinarEssentials
              .getSpecificWebinar_0(webinarId)
              .execute();
      System.out.println(result);
      System.out.println(result.getTitle());
      System.out.println(result.getDescription());
      System.out.println(result.getCompletedOn());
      System.out.println(result.getCreatedTime());
      System.out.println(result.getEdit());
      System.out.println(result.getEmailProviderList());
      System.out.println(result.getEmailQuota());
      System.out.println(result.getEmailSettings());
      System.out.println(result.getEvents());
      System.out.println(result.getHasPolls());
      System.out.println(result.getMetadata());
      System.out.println(result.getModifiedOn());
      System.out.println(result.getNextOccurrenceTime());
      System.out.println(result.getPassword());
      System.out.println(result.getPrivacy());
      System.out.println(result.getRegistrationData());
      System.out.println(result.getRegistrationForm());
      System.out.println(result.getSchedule());
      System.out.println(result.getStatus());
      System.out.println(result.getTimeZone());
      System.out.println(result.getUri());
      System.out.println(result.getUser());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebinarEssentialsApi#getSpecificWebinar_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Webinar> response = client
              .webinarEssentials
              .getSpecificWebinar_0(webinarId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebinarEssentialsApi#getSpecificWebinar_0");
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
| **webinarId** | **String**| The ID of the webinar. | |

### Return type

[**Webinar**](Webinar.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.vimeo.webinars+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The webinar was returned. |  -  |

<a name="updateWebinarBelongingToAuthenticatedUser"></a>
# **updateWebinarBelongingToAuthenticatedUser**
> Webinar updateWebinarBelongingToAuthenticatedUser(webinarId).webinarEssentialsUpdateWebinarBelongingToAuthenticatedUserRequest(webinarEssentialsUpdateWebinarBelongingToAuthenticatedUserRequest).execute();

Update a webinar

This method updates a webinar belonging to the authenticated user.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WebinarEssentialsApi;
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
    String webinarId = "f19bfa08-b266-4f20-bfce-db1d0719b52f"; // The ID of the webinar.
    String title = "title_example"; // The title of the webinar.
    String description = "description_example"; // The description of the webinar.
    WebinarEssentialsUpdateWebinarBelongingToAuthenticatedUserRequestEmailSettings emailSettings = new WebinarEssentialsUpdateWebinarBelongingToAuthenticatedUserRequestEmailSettings();
    String password = "password_example"; // The password when **privacy.view** is `password`. Anyone with the password can view the videos generated by streaming to the webinar event.
    WebinarEssentialsUpdateWebinarBelongingToAuthenticatedUserRequestPrivacy privacy = new WebinarEssentialsUpdateWebinarBelongingToAuthenticatedUserRequestPrivacy();
    WebinarEssentialsUpdateWebinarBelongingToAuthenticatedUserRequestSchedule schedule = new WebinarEssentialsUpdateWebinarBelongingToAuthenticatedUserRequestSchedule();
    String status = "ended"; // The status of the webinar.  Option descriptions:  * `ended` - The webinar has ended.  * `started` - The webinar has started. 
    String timeZone = "timeZone_example"; // The time zone used in resolving the timestamps that are included in the automatically generated video titles for the webinar.
    try {
      Webinar result = client
              .webinarEssentials
              .updateWebinarBelongingToAuthenticatedUser(webinarId)
              .title(title)
              .description(description)
              .emailSettings(emailSettings)
              .password(password)
              .privacy(privacy)
              .schedule(schedule)
              .status(status)
              .timeZone(timeZone)
              .execute();
      System.out.println(result);
      System.out.println(result.getTitle());
      System.out.println(result.getDescription());
      System.out.println(result.getCompletedOn());
      System.out.println(result.getCreatedTime());
      System.out.println(result.getEdit());
      System.out.println(result.getEmailProviderList());
      System.out.println(result.getEmailQuota());
      System.out.println(result.getEmailSettings());
      System.out.println(result.getEvents());
      System.out.println(result.getHasPolls());
      System.out.println(result.getMetadata());
      System.out.println(result.getModifiedOn());
      System.out.println(result.getNextOccurrenceTime());
      System.out.println(result.getPassword());
      System.out.println(result.getPrivacy());
      System.out.println(result.getRegistrationData());
      System.out.println(result.getRegistrationForm());
      System.out.println(result.getSchedule());
      System.out.println(result.getStatus());
      System.out.println(result.getTimeZone());
      System.out.println(result.getUri());
      System.out.println(result.getUser());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebinarEssentialsApi#updateWebinarBelongingToAuthenticatedUser");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Webinar> response = client
              .webinarEssentials
              .updateWebinarBelongingToAuthenticatedUser(webinarId)
              .title(title)
              .description(description)
              .emailSettings(emailSettings)
              .password(password)
              .privacy(privacy)
              .schedule(schedule)
              .status(status)
              .timeZone(timeZone)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebinarEssentialsApi#updateWebinarBelongingToAuthenticatedUser");
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
| **webinarId** | **String**| The ID of the webinar. | |
| **webinarEssentialsUpdateWebinarBelongingToAuthenticatedUserRequest** | [**WebinarEssentialsUpdateWebinarBelongingToAuthenticatedUserRequest**](WebinarEssentialsUpdateWebinarBelongingToAuthenticatedUserRequest.md)|  | [optional] |

### Return type

[**Webinar**](Webinar.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/vnd.vimeo.webinars+json
 - **Accept**: application/vnd.vimeo.webinars+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The webinar was updated. |  -  |

<a name="webinar"></a>
# **webinar**
> Webinar webinar(userId, createWebinarRequest).execute();

Create a webinar

This method creates a new webinar for the authenticated user.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WebinarEssentialsApi;
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
    String title = "title_example"; // The title of the webinar.
    Double userId = 152184D; // The ID of the user.
    String description = "description_example"; // The description of the webinar.
    CreateWebinarRequestEmailSettings emailSettings = new CreateWebinarRequestEmailSettings();
    Double folderUri = 3.4D; // The URI of the webinar's folder.
    String password = "password_example"; // The password when **privacy.view** is `password`. Anyone with the password can view the videos generated by streaming to the webinar event.
    CreateWebinarRequestPrivacy privacy = new CreateWebinarRequestPrivacy();
    CreateWebinarRequestSchedule schedule = new CreateWebinarRequestSchedule();
    String timeZone = "timeZone_example"; // The time zone used in resolving the timestamps that are included in the automatically generated video titles for the webinar.
    try {
      Webinar result = client
              .webinarEssentials
              .webinar(title, userId)
              .description(description)
              .emailSettings(emailSettings)
              .folderUri(folderUri)
              .password(password)
              .privacy(privacy)
              .schedule(schedule)
              .timeZone(timeZone)
              .execute();
      System.out.println(result);
      System.out.println(result.getTitle());
      System.out.println(result.getDescription());
      System.out.println(result.getCompletedOn());
      System.out.println(result.getCreatedTime());
      System.out.println(result.getEdit());
      System.out.println(result.getEmailProviderList());
      System.out.println(result.getEmailQuota());
      System.out.println(result.getEmailSettings());
      System.out.println(result.getEvents());
      System.out.println(result.getHasPolls());
      System.out.println(result.getMetadata());
      System.out.println(result.getModifiedOn());
      System.out.println(result.getNextOccurrenceTime());
      System.out.println(result.getPassword());
      System.out.println(result.getPrivacy());
      System.out.println(result.getRegistrationData());
      System.out.println(result.getRegistrationForm());
      System.out.println(result.getSchedule());
      System.out.println(result.getStatus());
      System.out.println(result.getTimeZone());
      System.out.println(result.getUri());
      System.out.println(result.getUser());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebinarEssentialsApi#webinar");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Webinar> response = client
              .webinarEssentials
              .webinar(title, userId)
              .description(description)
              .emailSettings(emailSettings)
              .folderUri(folderUri)
              .password(password)
              .privacy(privacy)
              .schedule(schedule)
              .timeZone(timeZone)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebinarEssentialsApi#webinar");
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
| **createWebinarRequest** | [**CreateWebinarRequest**](CreateWebinarRequest.md)|  | |

### Return type

[**Webinar**](Webinar.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/vnd.vimeo.webinars+json
 - **Accept**: application/vnd.vimeo.webinars+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The webinar was created. |  -  |

<a name="webinar_0"></a>
# **webinar_0**
> Webinar webinar_0(userId, webinarId).execute();

Get a specific webinar

This method returns a single webinar belonging to the authenticated user.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WebinarEssentialsApi;
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
    String webinarId = "f19bfa08-b266-4f20-bfce-db1d0719b52f"; // The ID of the webinar.
    try {
      Webinar result = client
              .webinarEssentials
              .webinar_0(userId, webinarId)
              .execute();
      System.out.println(result);
      System.out.println(result.getTitle());
      System.out.println(result.getDescription());
      System.out.println(result.getCompletedOn());
      System.out.println(result.getCreatedTime());
      System.out.println(result.getEdit());
      System.out.println(result.getEmailProviderList());
      System.out.println(result.getEmailQuota());
      System.out.println(result.getEmailSettings());
      System.out.println(result.getEvents());
      System.out.println(result.getHasPolls());
      System.out.println(result.getMetadata());
      System.out.println(result.getModifiedOn());
      System.out.println(result.getNextOccurrenceTime());
      System.out.println(result.getPassword());
      System.out.println(result.getPrivacy());
      System.out.println(result.getRegistrationData());
      System.out.println(result.getRegistrationForm());
      System.out.println(result.getSchedule());
      System.out.println(result.getStatus());
      System.out.println(result.getTimeZone());
      System.out.println(result.getUri());
      System.out.println(result.getUser());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebinarEssentialsApi#webinar_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Webinar> response = client
              .webinarEssentials
              .webinar_0(userId, webinarId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebinarEssentialsApi#webinar_0");
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
| **webinarId** | **String**| The ID of the webinar. | |

### Return type

[**Webinar**](Webinar.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.vimeo.webinars+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The webinar was returned. |  -  |

<a name="webinar_1"></a>
# **webinar_1**
> Webinar webinar_1(userId, webinarId).updateWebinarRequest(updateWebinarRequest).execute();

Update a webinar

This method updates a webinar belonging to the authenticated user.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WebinarEssentialsApi;
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
    String webinarId = "f19bfa08-b266-4f20-bfce-db1d0719b52f"; // The ID of the webinar.
    String title = "title_example"; // The title of the webinar.
    String description = "description_example"; // The description of the webinar.
    UpdateWebinarRequestEmailSettings emailSettings = new UpdateWebinarRequestEmailSettings();
    String password = "password_example"; // The password when **privacy.view** is `password`. Anyone with the password can view the videos generated by streaming to the webinar event.
    UpdateWebinarRequestPrivacy privacy = new UpdateWebinarRequestPrivacy();
    UpdateWebinarRequestSchedule schedule = new UpdateWebinarRequestSchedule();
    String status = "ended"; // The status of the webinar.  Option descriptions:  * `ended` - The webinar has ended.  * `started` - The webinar has started. 
    String timeZone = "timeZone_example"; // The time zone used in resolving the timestamps that are included in the automatically generated video titles for the webinar.
    try {
      Webinar result = client
              .webinarEssentials
              .webinar_1(userId, webinarId)
              .title(title)
              .description(description)
              .emailSettings(emailSettings)
              .password(password)
              .privacy(privacy)
              .schedule(schedule)
              .status(status)
              .timeZone(timeZone)
              .execute();
      System.out.println(result);
      System.out.println(result.getTitle());
      System.out.println(result.getDescription());
      System.out.println(result.getCompletedOn());
      System.out.println(result.getCreatedTime());
      System.out.println(result.getEdit());
      System.out.println(result.getEmailProviderList());
      System.out.println(result.getEmailQuota());
      System.out.println(result.getEmailSettings());
      System.out.println(result.getEvents());
      System.out.println(result.getHasPolls());
      System.out.println(result.getMetadata());
      System.out.println(result.getModifiedOn());
      System.out.println(result.getNextOccurrenceTime());
      System.out.println(result.getPassword());
      System.out.println(result.getPrivacy());
      System.out.println(result.getRegistrationData());
      System.out.println(result.getRegistrationForm());
      System.out.println(result.getSchedule());
      System.out.println(result.getStatus());
      System.out.println(result.getTimeZone());
      System.out.println(result.getUri());
      System.out.println(result.getUser());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebinarEssentialsApi#webinar_1");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Webinar> response = client
              .webinarEssentials
              .webinar_1(userId, webinarId)
              .title(title)
              .description(description)
              .emailSettings(emailSettings)
              .password(password)
              .privacy(privacy)
              .schedule(schedule)
              .status(status)
              .timeZone(timeZone)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebinarEssentialsApi#webinar_1");
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
| **webinarId** | **String**| The ID of the webinar. | |
| **updateWebinarRequest** | [**UpdateWebinarRequest**](UpdateWebinarRequest.md)|  | [optional] |

### Return type

[**Webinar**](Webinar.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/vnd.vimeo.webinars+json
 - **Accept**: application/vnd.vimeo.webinars+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The webinar was updated. |  -  |

