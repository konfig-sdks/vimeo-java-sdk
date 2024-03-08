# WebinarRegistrationsApi

All URIs are relative to *https://api.vimeo.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**captureUserRegistrationList**](WebinarRegistrationsApi.md#captureUserRegistrationList) | **PUT** /me/webinars/{webinar_id}/registrants | Capture the user registration list associated with a webinar |
| [**captureUserRegistrationList_0**](WebinarRegistrationsApi.md#captureUserRegistrationList_0) | **PUT** /users/{user_id}/webinars/{webinar_id}/registrants | Capture the user registration list associated with a webinar |
| [**deleteRegistrantRecord**](WebinarRegistrationsApi.md#deleteRegistrantRecord) | **DELETE** /me/webinars/{webinar_id}/registrants/{registrant_id} | Delete a registrant record associated with a webinar |
| [**deleteRegistrantRecord_0**](WebinarRegistrationsApi.md#deleteRegistrantRecord_0) | **DELETE** /users/{user_id}/webinars/{webinar_id}/registrants/{registrant_id} | Delete a registrant record associated with a webinar |
| [**getUserRegistrationsByWebinarId**](WebinarRegistrationsApi.md#getUserRegistrationsByWebinarId) | **GET** /me/webinars/{webinar_id}/registrants | Get user registration data associated with a webinar |
| [**getUserRegistrationsByWebinarId_0**](WebinarRegistrationsApi.md#getUserRegistrationsByWebinarId_0) | **GET** /users/{user_id}/webinars/{webinar_id}/registrants | Get user registration data associated with a webinar |
| [**updateUserRegistrationData**](WebinarRegistrationsApi.md#updateUserRegistrationData) | **PATCH** /me/webinars/{webinar_id}/registrants/{registrant_id} | Update user registration data associated with a webinar |
| [**updateUserRegistrationData_0**](WebinarRegistrationsApi.md#updateUserRegistrationData_0) | **PATCH** /users/{user_id}/webinars/{webinar_id}/registrants/{registrant_id} | Update user registration data associated with a webinar |


<a name="captureUserRegistrationList"></a>
# **captureUserRegistrationList**
> captureUserRegistrationList(webinarId).webinarRegistrationsCaptureUserRegistrationListRequest(webinarRegistrationsCaptureUserRegistrationListRequest).execute();

Capture the user registration list associated with a webinar

This method captures the user registration list associated with the specified webinar. A maximum of 50 registrants are permitted as part of the request.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WebinarRegistrationsApi;
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
    List<WebinarRegistrationsCaptureUserRegistrationListRequestRegistrantsInner> registrants = Arrays.asList(); // An array of registration data for the webinar.
    try {
      client
              .webinarRegistrations
              .captureUserRegistrationList(webinarId)
              .registrants(registrants)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling WebinarRegistrationsApi#captureUserRegistrationList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .webinarRegistrations
              .captureUserRegistrationList(webinarId)
              .registrants(registrants)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling WebinarRegistrationsApi#captureUserRegistrationList");
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
| **webinarRegistrationsCaptureUserRegistrationListRequest** | [**WebinarRegistrationsCaptureUserRegistrationListRequest**](WebinarRegistrationsCaptureUserRegistrationListRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The webinar data was captured. |  -  |

<a name="captureUserRegistrationList_0"></a>
# **captureUserRegistrationList_0**
> captureUserRegistrationList_0(userId, webinarId).webinarRegistrationsCaptureUserRegistrationListRequest1(webinarRegistrationsCaptureUserRegistrationListRequest1).execute();

Capture the user registration list associated with a webinar

This method captures the user registration list associated with the specified webinar. A maximum of 50 registrants are permitted as part of the request.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WebinarRegistrationsApi;
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
    List<WebinarRegistrationsCaptureUserRegistrationListRequest1RegistrantsInner> registrants = Arrays.asList(); // An array of registration data for the webinar.
    try {
      client
              .webinarRegistrations
              .captureUserRegistrationList_0(userId, webinarId)
              .registrants(registrants)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling WebinarRegistrationsApi#captureUserRegistrationList_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .webinarRegistrations
              .captureUserRegistrationList_0(userId, webinarId)
              .registrants(registrants)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling WebinarRegistrationsApi#captureUserRegistrationList_0");
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
| **webinarRegistrationsCaptureUserRegistrationListRequest1** | [**WebinarRegistrationsCaptureUserRegistrationListRequest1**](WebinarRegistrationsCaptureUserRegistrationListRequest1.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The webinar data was captured. |  -  |

<a name="deleteRegistrantRecord"></a>
# **deleteRegistrantRecord**
> deleteRegistrantRecord(registrantId, webinarId).execute();

Delete a registrant record associated with a webinar

This method deletes the specified registrant associated with a webinar and originally submitted through a webinar form.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WebinarRegistrationsApi;
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
    String registrantId = "f19bfa08-b266-4f20-bfce-db1d0719b52f"; // The ID of the webinar registrant.
    String webinarId = "f19bfa08-b266-4f20-bfce-db1d0719b52f"; // The ID of the webinar.
    try {
      client
              .webinarRegistrations
              .deleteRegistrantRecord(registrantId, webinarId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling WebinarRegistrationsApi#deleteRegistrantRecord");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .webinarRegistrations
              .deleteRegistrantRecord(registrantId, webinarId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling WebinarRegistrationsApi#deleteRegistrantRecord");
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
| **registrantId** | **String**| The ID of the webinar registrant. | |
| **webinarId** | **String**| The ID of the webinar. | |

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
| **204** | The webinar registrant was deleted. |  -  |

<a name="deleteRegistrantRecord_0"></a>
# **deleteRegistrantRecord_0**
> deleteRegistrantRecord_0(registrantId, userId, webinarId).execute();

Delete a registrant record associated with a webinar

This method deletes the specified registrant associated with a webinar and originally submitted through a webinar form.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WebinarRegistrationsApi;
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
    String registrantId = "f19bfa08-b266-4f20-bfce-db1d0719b52f"; // The ID of the webinar registrant.
    Double userId = 152184D; // The ID of the user.
    String webinarId = "f19bfa08-b266-4f20-bfce-db1d0719b52f"; // The ID of the webinar.
    try {
      client
              .webinarRegistrations
              .deleteRegistrantRecord_0(registrantId, userId, webinarId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling WebinarRegistrationsApi#deleteRegistrantRecord_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .webinarRegistrations
              .deleteRegistrantRecord_0(registrantId, userId, webinarId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling WebinarRegistrationsApi#deleteRegistrantRecord_0");
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
| **registrantId** | **String**| The ID of the webinar registrant. | |
| **userId** | **Double**| The ID of the user. | |
| **webinarId** | **String**| The ID of the webinar. | |

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
| **204** | The webinar registrant was deleted. |  -  |

<a name="getUserRegistrationsByWebinarId"></a>
# **getUserRegistrationsByWebinarId**
> WebinarRegistrant getUserRegistrationsByWebinarId(webinarId).direction(direction).page(page).perPage(perPage).sort(sort).execute();

Get user registration data associated with a webinar

This method returns the list of user registrations that is associated with the specified webinar and was originally submitted through a webinar form.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WebinarRegistrationsApi;
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
    String direction = "asc"; // The sort direction of the results.  Option descriptions:  * `asc` - Sort the results in ascending order.  * `desc` - Sort the results in descending order. 
    Double page = 1D; // The page number of the results to show.
    Double perPage = 10D; // The number of items to show on each page of results, up to a maximum of 100.
    String sort = "registration_date"; // The way to sort the results.  Option descriptions:  * `registration_date` - Sort the results by registration date. 
    try {
      WebinarRegistrant result = client
              .webinarRegistrations
              .getUserRegistrationsByWebinarId(webinarId)
              .direction(direction)
              .page(page)
              .perPage(perPage)
              .sort(sort)
              .execute();
      System.out.println(result);
      System.out.println(result.getAnalytics());
      System.out.println(result.getCreatedOn());
      System.out.println(result.getData());
      System.out.println(result.getEmail());
      System.out.println(result.getFirstName());
      System.out.println(result.getHasAttended());
      System.out.println(result.getIsBlocked());
      System.out.println(result.getLastName());
      System.out.println(result.getReferrer());
      System.out.println(result.getSourceDetails());
      System.out.println(result.getSourceType());
      System.out.println(result.getUri());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebinarRegistrationsApi#getUserRegistrationsByWebinarId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WebinarRegistrant> response = client
              .webinarRegistrations
              .getUserRegistrationsByWebinarId(webinarId)
              .direction(direction)
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
      System.err.println("Exception when calling WebinarRegistrationsApi#getUserRegistrationsByWebinarId");
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
| **direction** | **String**| The sort direction of the results.  Option descriptions:  * &#x60;asc&#x60; - Sort the results in ascending order.  * &#x60;desc&#x60; - Sort the results in descending order.  | [optional] [enum: asc, desc] |
| **page** | **Double**| The page number of the results to show. | [optional] |
| **perPage** | **Double**| The number of items to show on each page of results, up to a maximum of 100. | [optional] |
| **sort** | **String**| The way to sort the results.  Option descriptions:  * &#x60;registration_date&#x60; - Sort the results by registration date.  | [optional] [enum: registration_date] |

### Return type

[**WebinarRegistrant**](WebinarRegistrant.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The user registration data was returned. |  -  |

<a name="getUserRegistrationsByWebinarId_0"></a>
# **getUserRegistrationsByWebinarId_0**
> WebinarRegistrant getUserRegistrationsByWebinarId_0(userId, webinarId).direction(direction).page(page).perPage(perPage).sort(sort).execute();

Get user registration data associated with a webinar

This method returns the list of user registrations that is associated with the specified webinar and was originally submitted through a webinar form.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WebinarRegistrationsApi;
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
    String direction = "asc"; // The sort direction of the results.  Option descriptions:  * `asc` - Sort the results in ascending order.  * `desc` - Sort the results in descending order. 
    Double page = 1D; // The page number of the results to show.
    Double perPage = 10D; // The number of items to show on each page of results, up to a maximum of 100.
    String sort = "registration_date"; // The way to sort the results.  Option descriptions:  * `registration_date` - Sort the results by registration date. 
    try {
      WebinarRegistrant result = client
              .webinarRegistrations
              .getUserRegistrationsByWebinarId_0(userId, webinarId)
              .direction(direction)
              .page(page)
              .perPage(perPage)
              .sort(sort)
              .execute();
      System.out.println(result);
      System.out.println(result.getAnalytics());
      System.out.println(result.getCreatedOn());
      System.out.println(result.getData());
      System.out.println(result.getEmail());
      System.out.println(result.getFirstName());
      System.out.println(result.getHasAttended());
      System.out.println(result.getIsBlocked());
      System.out.println(result.getLastName());
      System.out.println(result.getReferrer());
      System.out.println(result.getSourceDetails());
      System.out.println(result.getSourceType());
      System.out.println(result.getUri());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebinarRegistrationsApi#getUserRegistrationsByWebinarId_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WebinarRegistrant> response = client
              .webinarRegistrations
              .getUserRegistrationsByWebinarId_0(userId, webinarId)
              .direction(direction)
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
      System.err.println("Exception when calling WebinarRegistrationsApi#getUserRegistrationsByWebinarId_0");
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
| **direction** | **String**| The sort direction of the results.  Option descriptions:  * &#x60;asc&#x60; - Sort the results in ascending order.  * &#x60;desc&#x60; - Sort the results in descending order.  | [optional] [enum: asc, desc] |
| **page** | **Double**| The page number of the results to show. | [optional] |
| **perPage** | **Double**| The number of items to show on each page of results, up to a maximum of 100. | [optional] |
| **sort** | **String**| The way to sort the results.  Option descriptions:  * &#x60;registration_date&#x60; - Sort the results by registration date.  | [optional] [enum: registration_date] |

### Return type

[**WebinarRegistrant**](WebinarRegistrant.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The user registration data was returned. |  -  |

<a name="updateUserRegistrationData"></a>
# **updateUserRegistrationData**
> WebinarRegistrant updateUserRegistrationData(registrantId, webinarId).webinarRegistrationsUpdateUserRegistrationDataRequest(webinarRegistrationsUpdateUserRegistrationDataRequest).execute();

Update user registration data associated with a webinar

This method updates the specified user registration data associated with a webinar and originally submitted through a webinar form.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WebinarRegistrationsApi;
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
    String registrantId = "f19bfa08-b266-4f20-bfce-db1d0719b52f"; // The ID of the webinar registrant.
    String webinarId = "f19bfa08-b266-4f20-bfce-db1d0719b52f"; // The ID of the webinar.
    Boolean isBlocked = true; // Whether to block the webinar registrant.
    try {
      WebinarRegistrant result = client
              .webinarRegistrations
              .updateUserRegistrationData(registrantId, webinarId)
              .isBlocked(isBlocked)
              .execute();
      System.out.println(result);
      System.out.println(result.getAnalytics());
      System.out.println(result.getCreatedOn());
      System.out.println(result.getData());
      System.out.println(result.getEmail());
      System.out.println(result.getFirstName());
      System.out.println(result.getHasAttended());
      System.out.println(result.getIsBlocked());
      System.out.println(result.getLastName());
      System.out.println(result.getReferrer());
      System.out.println(result.getSourceDetails());
      System.out.println(result.getSourceType());
      System.out.println(result.getUri());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebinarRegistrationsApi#updateUserRegistrationData");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WebinarRegistrant> response = client
              .webinarRegistrations
              .updateUserRegistrationData(registrantId, webinarId)
              .isBlocked(isBlocked)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebinarRegistrationsApi#updateUserRegistrationData");
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
| **registrantId** | **String**| The ID of the webinar registrant. | |
| **webinarId** | **String**| The ID of the webinar. | |
| **webinarRegistrationsUpdateUserRegistrationDataRequest** | [**WebinarRegistrationsUpdateUserRegistrationDataRequest**](WebinarRegistrationsUpdateUserRegistrationDataRequest.md)|  | [optional] |

### Return type

[**WebinarRegistrant**](WebinarRegistrant.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The webinar registrant data was updated. |  -  |

<a name="updateUserRegistrationData_0"></a>
# **updateUserRegistrationData_0**
> WebinarRegistrant updateUserRegistrationData_0(registrantId, userId, webinarId).webinarRegistrationsUpdateUserRegistrationDataRequest1(webinarRegistrationsUpdateUserRegistrationDataRequest1).execute();

Update user registration data associated with a webinar

This method updates the specified user registration data associated with a webinar and originally submitted through a webinar form.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WebinarRegistrationsApi;
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
    String registrantId = "f19bfa08-b266-4f20-bfce-db1d0719b52f"; // The ID of the webinar registrant.
    Double userId = 152184D; // The ID of the user.
    String webinarId = "f19bfa08-b266-4f20-bfce-db1d0719b52f"; // The ID of the webinar.
    Boolean isBlocked = true; // Whether to block the webinar registrant.
    try {
      WebinarRegistrant result = client
              .webinarRegistrations
              .updateUserRegistrationData_0(registrantId, userId, webinarId)
              .isBlocked(isBlocked)
              .execute();
      System.out.println(result);
      System.out.println(result.getAnalytics());
      System.out.println(result.getCreatedOn());
      System.out.println(result.getData());
      System.out.println(result.getEmail());
      System.out.println(result.getFirstName());
      System.out.println(result.getHasAttended());
      System.out.println(result.getIsBlocked());
      System.out.println(result.getLastName());
      System.out.println(result.getReferrer());
      System.out.println(result.getSourceDetails());
      System.out.println(result.getSourceType());
      System.out.println(result.getUri());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebinarRegistrationsApi#updateUserRegistrationData_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WebinarRegistrant> response = client
              .webinarRegistrations
              .updateUserRegistrationData_0(registrantId, userId, webinarId)
              .isBlocked(isBlocked)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebinarRegistrationsApi#updateUserRegistrationData_0");
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
| **registrantId** | **String**| The ID of the webinar registrant. | |
| **userId** | **Double**| The ID of the user. | |
| **webinarId** | **String**| The ID of the webinar. | |
| **webinarRegistrationsUpdateUserRegistrationDataRequest1** | [**WebinarRegistrationsUpdateUserRegistrationDataRequest1**](WebinarRegistrationsUpdateUserRegistrationDataRequest1.md)|  | [optional] |

### Return type

[**WebinarRegistrant**](WebinarRegistrant.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The webinar registrant data was updated. |  -  |

