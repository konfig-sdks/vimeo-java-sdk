# AuthenticationExtrasExchangeApi

All URIs are relative to *https://api.vimeo.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**oAuthCodeExchange**](AuthenticationExtrasExchangeApi.md#oAuthCodeExchange) | **POST** /oauth/access_token | Exchange an authorization code for an access token |


<a name="oAuthCodeExchange"></a>
# **oAuthCodeExchange**
> Auth oAuthCodeExchange(authenticationExtrasExchangeOAuthCodeExchangeRequest).execute();

Exchange an authorization code for an access token

This method exchanges an OAuth authorization code for an OAuth access token.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AuthenticationExtrasExchangeApi;
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
    String code = "code_example"; // The authorization code received from the authorization server.
    String grantType = "authorization_code"; // The grant type. The value of this field must be `authorization_code`.
    String redirectUri = "redirectUri_example"; // The redirect URI. The value of this field must match the URI from `/oauth/authorize`.
    try {
      Auth result = client
              .authenticationExtrasExchange
              .oAuthCodeExchange(code, grantType, redirectUri)
              .execute();
      System.out.println(result);
      System.out.println(result.getAccessToken());
      System.out.println(result.getApp());
      System.out.println(result.getExpiresOn());
      System.out.println(result.getRefreshToken());
      System.out.println(result.getScope());
      System.out.println(result.getTokenType());
      System.out.println(result.getUser());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticationExtrasExchangeApi#oAuthCodeExchange");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Auth> response = client
              .authenticationExtrasExchange
              .oAuthCodeExchange(code, grantType, redirectUri)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticationExtrasExchangeApi#oAuthCodeExchange");
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
| **authenticationExtrasExchangeOAuthCodeExchangeRequest** | [**AuthenticationExtrasExchangeOAuthCodeExchangeRequest**](AuthenticationExtrasExchangeOAuthCodeExchangeRequest.md)|  | |

### Return type

[**Auth**](Auth.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/vnd.vimeo.auth+json
 - **Accept**: application/vnd.vimeo.auth+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The authorization code was exchanged. |  -  |

