# AuthenticationExtrasConvertApi

All URIs are relative to *https://api.vimeo.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**oAuth1ToOAuth2**](AuthenticationExtrasConvertApi.md#oAuth1ToOAuth2) | **POST** /oauth/authorize/vimeo_oauth1 | Convert an OAuth 1 access token to an OAuth 2 access token |


<a name="oAuth1ToOAuth2"></a>
# **oAuth1ToOAuth2**
> Auth oAuth1ToOAuth2(authenticationExtrasConvertOAuth1ToOAuth2Request).execute();

Convert an OAuth 1 access token to an OAuth 2 access token

This method exchanges a legacy Advanced API OAuth 1 token for an API v3 OAuth 2 token.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AuthenticationExtrasConvertApi;
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
    String grantType = "vimeo_oauth1"; // The grant type. The value of this field must be `vimeo_oauth1`.
    String token = "token_example"; // The OAuth 1 token.
    String tokenSecret = "tokenSecret_example"; // The OAuth 1 token secret.
    try {
      Auth result = client
              .authenticationExtrasConvert
              .oAuth1ToOAuth2(grantType, token, tokenSecret)
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
      System.err.println("Exception when calling AuthenticationExtrasConvertApi#oAuth1ToOAuth2");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Auth> response = client
              .authenticationExtrasConvert
              .oAuth1ToOAuth2(grantType, token, tokenSecret)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticationExtrasConvertApi#oAuth1ToOAuth2");
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
| **authenticationExtrasConvertOAuth1ToOAuth2Request** | [**AuthenticationExtrasConvertOAuth1ToOAuth2Request**](AuthenticationExtrasConvertOAuth1ToOAuth2Request.md)|  | |

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
| **200** | The token was converted. |  -  |

