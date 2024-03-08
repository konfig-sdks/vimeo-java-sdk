# WebinarEmailsApi

All URIs are relative to *https://api.vimeo.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**customizePreferences**](WebinarEmailsApi.md#customizePreferences) | **PATCH** /me/webinars/{webinar_id}/email_settings | Customize the email preferences of a webinar |
| [**customizePreferences_0**](WebinarEmailsApi.md#customizePreferences_0) | **PATCH** /users/{user_id}/webinars/{webinar_id}/email_settings | Customize the email preferences of a webinar |
| [**getCustomizationData**](WebinarEmailsApi.md#getCustomizationData) | **GET** /me/webinars/{webinar_id}/email_settings | Get customization email data for a webinar |
| [**getCustomizationData_0**](WebinarEmailsApi.md#getCustomizationData_0) | **GET** /users/{user_id}/webinars/{webinar_id}/email_settings | Get customization email data for a webinar |


<a name="customizePreferences"></a>
# **customizePreferences**
> WebinarEmailSettings customizePreferences(webinarId).webinarEmailsCustomizePreferencesRequest(webinarEmailsCustomizePreferencesRequest).execute();

Customize the email preferences of a webinar

This method causes the authenticated user to customize the email preferences of the specified webinar. The user must have administrative access to the webinar.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WebinarEmailsApi;
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
    String accentColor = "accentColor_example"; // The accent color scheme for emails that are sent about the webinar.
    String customLink = "customLink_example"; // The custom link for emails that are sent about the webinar.
    Object emailEventReminder24Hrs = null; // The email customization details for the webinar reminder email, which goes out 24 hours before the event.
    Object emailPostEventThankYou = null; // The email customization details for the webinar post-event thank-you email.
    WebinarEmailsCustomizePreferencesRequestEmailPreferences emailPreferences = new WebinarEmailsCustomizePreferencesRequestEmailPreferences();
    Object emailRegistrationConfirmation = null; // The email customization details for the webinar registration confirmation email.
    String from = "from_example"; // The name of the sender for emails that are sent about the webinar.
    String logoUri = "logoUri_example"; // The URI of the logo image to include in emails that are sent about the webinar.
    String replyEmail = "replyEmail_example"; // The sender's reply email address.
    String senderAddress = "senderAddress_example"; // The sender's physical address.
    String senderPolicyUrl = "senderPolicyUrl_example"; // The URL of the sender's privacy policy.
    Boolean useCustomLink = true; // Whether to include a custom link in emails that are sent about the webinar.
    Boolean useReplyEmail = true; // Whether to include a reply link in the footer of emails that are sent about the webinar.
    Boolean useSenderAddress = true; // Whether to include the sender's physical address in the footer of emails that are sent about the webinar.
    Boolean useSenderPolicyUrl = true; // Whether to include the URL of the sender's privacy policy in the footer of emails that are sent about the webinar.
    try {
      WebinarEmailSettings result = client
              .webinarEmails
              .customizePreferences(webinarId)
              .accentColor(accentColor)
              .customLink(customLink)
              .emailEventReminder24Hrs(emailEventReminder24Hrs)
              .emailPostEventThankYou(emailPostEventThankYou)
              .emailPreferences(emailPreferences)
              .emailRegistrationConfirmation(emailRegistrationConfirmation)
              .from(from)
              .logoUri(logoUri)
              .replyEmail(replyEmail)
              .senderAddress(senderAddress)
              .senderPolicyUrl(senderPolicyUrl)
              .useCustomLink(useCustomLink)
              .useReplyEmail(useReplyEmail)
              .useSenderAddress(useSenderAddress)
              .useSenderPolicyUrl(useSenderPolicyUrl)
              .execute();
      System.out.println(result);
      System.out.println(result.getAccentColor());
      System.out.println(result.getCustomLink());
      System.out.println(result.getEmailEventReminder24Hrs());
      System.out.println(result.getEmailPostEventThankYou());
      System.out.println(result.getEmailPreferences());
      System.out.println(result.getEmailRegistrationConfirmation());
      System.out.println(result.getFollowUpSendOn());
      System.out.println(result.getFollowUpSender());
      System.out.println(result.getFrom());
      System.out.println(result.getLogoUri());
      System.out.println(result.getPictures());
      System.out.println(result.getReplyEmail());
      System.out.println(result.getSenderAddress());
      System.out.println(result.getSenderPolicyUrl());
      System.out.println(result.getUseCustomLink());
      System.out.println(result.getUseReplyEmail());
      System.out.println(result.getUseSenderAddress());
      System.out.println(result.getUseSenderPolicyUrl());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebinarEmailsApi#customizePreferences");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WebinarEmailSettings> response = client
              .webinarEmails
              .customizePreferences(webinarId)
              .accentColor(accentColor)
              .customLink(customLink)
              .emailEventReminder24Hrs(emailEventReminder24Hrs)
              .emailPostEventThankYou(emailPostEventThankYou)
              .emailPreferences(emailPreferences)
              .emailRegistrationConfirmation(emailRegistrationConfirmation)
              .from(from)
              .logoUri(logoUri)
              .replyEmail(replyEmail)
              .senderAddress(senderAddress)
              .senderPolicyUrl(senderPolicyUrl)
              .useCustomLink(useCustomLink)
              .useReplyEmail(useReplyEmail)
              .useSenderAddress(useSenderAddress)
              .useSenderPolicyUrl(useSenderPolicyUrl)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebinarEmailsApi#customizePreferences");
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
| **webinarEmailsCustomizePreferencesRequest** | [**WebinarEmailsCustomizePreferencesRequest**](WebinarEmailsCustomizePreferencesRequest.md)|  | [optional] |

### Return type

[**WebinarEmailSettings**](WebinarEmailSettings.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/vnd.vimeo.webinar.email.settings+json
 - **Accept**: application/vnd.vimeo.webinar.email.settings+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The email preferences were customized for the webinar. |  -  |

<a name="customizePreferences_0"></a>
# **customizePreferences_0**
> WebinarEmailSettings customizePreferences_0(userId, webinarId).webinarEmailsCustomizePreferencesRequest1(webinarEmailsCustomizePreferencesRequest1).execute();

Customize the email preferences of a webinar

This method causes the authenticated user to customize the email preferences of the specified webinar. The user must have administrative access to the webinar.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WebinarEmailsApi;
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
    String accentColor = "accentColor_example"; // The accent color scheme for emails that are sent about the webinar.
    String customLink = "customLink_example"; // The custom link for emails that are sent about the webinar.
    Object emailEventReminder24Hrs = null; // The email customization details for the webinar reminder email, which goes out 24 hours before the event.
    Object emailPostEventThankYou = null; // The email customization details for the webinar post-event thank-you email.
    WebinarEmailsCustomizePreferencesRequestEmailPreferences emailPreferences = new WebinarEmailsCustomizePreferencesRequestEmailPreferences();
    Object emailRegistrationConfirmation = null; // The email customization details for the webinar registration confirmation email.
    String from = "from_example"; // The name of the sender for emails that are sent about the webinar.
    String logoUri = "logoUri_example"; // The URI of the logo image to include in emails that are sent about the webinar.
    String replyEmail = "replyEmail_example"; // The sender's reply email address.
    String senderAddress = "senderAddress_example"; // The sender's physical address.
    String senderPolicyUrl = "senderPolicyUrl_example"; // The URL of the sender's privacy policy.
    Boolean useCustomLink = true; // Whether to include a custom link in emails that are sent about the webinar.
    Boolean useReplyEmail = true; // Whether to include a reply link in the footer of emails that are sent about the webinar.
    Boolean useSenderAddress = true; // Whether to include the sender's physical address in the footer of emails that are sent about the webinar.
    Boolean useSenderPolicyUrl = true; // Whether to include the URL of the sender's privacy policy in the footer of emails that are sent about the webinar.
    try {
      WebinarEmailSettings result = client
              .webinarEmails
              .customizePreferences_0(userId, webinarId)
              .accentColor(accentColor)
              .customLink(customLink)
              .emailEventReminder24Hrs(emailEventReminder24Hrs)
              .emailPostEventThankYou(emailPostEventThankYou)
              .emailPreferences(emailPreferences)
              .emailRegistrationConfirmation(emailRegistrationConfirmation)
              .from(from)
              .logoUri(logoUri)
              .replyEmail(replyEmail)
              .senderAddress(senderAddress)
              .senderPolicyUrl(senderPolicyUrl)
              .useCustomLink(useCustomLink)
              .useReplyEmail(useReplyEmail)
              .useSenderAddress(useSenderAddress)
              .useSenderPolicyUrl(useSenderPolicyUrl)
              .execute();
      System.out.println(result);
      System.out.println(result.getAccentColor());
      System.out.println(result.getCustomLink());
      System.out.println(result.getEmailEventReminder24Hrs());
      System.out.println(result.getEmailPostEventThankYou());
      System.out.println(result.getEmailPreferences());
      System.out.println(result.getEmailRegistrationConfirmation());
      System.out.println(result.getFollowUpSendOn());
      System.out.println(result.getFollowUpSender());
      System.out.println(result.getFrom());
      System.out.println(result.getLogoUri());
      System.out.println(result.getPictures());
      System.out.println(result.getReplyEmail());
      System.out.println(result.getSenderAddress());
      System.out.println(result.getSenderPolicyUrl());
      System.out.println(result.getUseCustomLink());
      System.out.println(result.getUseReplyEmail());
      System.out.println(result.getUseSenderAddress());
      System.out.println(result.getUseSenderPolicyUrl());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebinarEmailsApi#customizePreferences_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WebinarEmailSettings> response = client
              .webinarEmails
              .customizePreferences_0(userId, webinarId)
              .accentColor(accentColor)
              .customLink(customLink)
              .emailEventReminder24Hrs(emailEventReminder24Hrs)
              .emailPostEventThankYou(emailPostEventThankYou)
              .emailPreferences(emailPreferences)
              .emailRegistrationConfirmation(emailRegistrationConfirmation)
              .from(from)
              .logoUri(logoUri)
              .replyEmail(replyEmail)
              .senderAddress(senderAddress)
              .senderPolicyUrl(senderPolicyUrl)
              .useCustomLink(useCustomLink)
              .useReplyEmail(useReplyEmail)
              .useSenderAddress(useSenderAddress)
              .useSenderPolicyUrl(useSenderPolicyUrl)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebinarEmailsApi#customizePreferences_0");
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
| **webinarEmailsCustomizePreferencesRequest1** | [**WebinarEmailsCustomizePreferencesRequest1**](WebinarEmailsCustomizePreferencesRequest1.md)|  | [optional] |

### Return type

[**WebinarEmailSettings**](WebinarEmailSettings.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/vnd.vimeo.webinar.email.settings+json
 - **Accept**: application/vnd.vimeo.webinar.email.settings+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The email preferences were customized for the webinar. |  -  |

<a name="getCustomizationData"></a>
# **getCustomizationData**
> WebinarEmailSettings getCustomizationData(webinarId).execute();

Get customization email data for a webinar

This method returns customized email data for the specified webinar. The authenticated user must have administrative access to the webinar.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WebinarEmailsApi;
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
      WebinarEmailSettings result = client
              .webinarEmails
              .getCustomizationData(webinarId)
              .execute();
      System.out.println(result);
      System.out.println(result.getAccentColor());
      System.out.println(result.getCustomLink());
      System.out.println(result.getEmailEventReminder24Hrs());
      System.out.println(result.getEmailPostEventThankYou());
      System.out.println(result.getEmailPreferences());
      System.out.println(result.getEmailRegistrationConfirmation());
      System.out.println(result.getFollowUpSendOn());
      System.out.println(result.getFollowUpSender());
      System.out.println(result.getFrom());
      System.out.println(result.getLogoUri());
      System.out.println(result.getPictures());
      System.out.println(result.getReplyEmail());
      System.out.println(result.getSenderAddress());
      System.out.println(result.getSenderPolicyUrl());
      System.out.println(result.getUseCustomLink());
      System.out.println(result.getUseReplyEmail());
      System.out.println(result.getUseSenderAddress());
      System.out.println(result.getUseSenderPolicyUrl());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebinarEmailsApi#getCustomizationData");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WebinarEmailSettings> response = client
              .webinarEmails
              .getCustomizationData(webinarId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebinarEmailsApi#getCustomizationData");
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

[**WebinarEmailSettings**](WebinarEmailSettings.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.vimeo.webinar.email.settings+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The webinar email data was returned. |  -  |

<a name="getCustomizationData_0"></a>
# **getCustomizationData_0**
> WebinarEmailSettings getCustomizationData_0(userId, webinarId).execute();

Get customization email data for a webinar

This method returns customized email data for the specified webinar. The authenticated user must have administrative access to the webinar.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WebinarEmailsApi;
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
      WebinarEmailSettings result = client
              .webinarEmails
              .getCustomizationData_0(userId, webinarId)
              .execute();
      System.out.println(result);
      System.out.println(result.getAccentColor());
      System.out.println(result.getCustomLink());
      System.out.println(result.getEmailEventReminder24Hrs());
      System.out.println(result.getEmailPostEventThankYou());
      System.out.println(result.getEmailPreferences());
      System.out.println(result.getEmailRegistrationConfirmation());
      System.out.println(result.getFollowUpSendOn());
      System.out.println(result.getFollowUpSender());
      System.out.println(result.getFrom());
      System.out.println(result.getLogoUri());
      System.out.println(result.getPictures());
      System.out.println(result.getReplyEmail());
      System.out.println(result.getSenderAddress());
      System.out.println(result.getSenderPolicyUrl());
      System.out.println(result.getUseCustomLink());
      System.out.println(result.getUseReplyEmail());
      System.out.println(result.getUseSenderAddress());
      System.out.println(result.getUseSenderPolicyUrl());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebinarEmailsApi#getCustomizationData_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WebinarEmailSettings> response = client
              .webinarEmails
              .getCustomizationData_0(userId, webinarId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebinarEmailsApi#getCustomizationData_0");
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

[**WebinarEmailSettings**](WebinarEmailSettings.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.vimeo.webinar.email.settings+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The webinar email data was returned. |  -  |

