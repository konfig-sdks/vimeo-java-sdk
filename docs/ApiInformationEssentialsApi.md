# ApiInformationEssentialsApi

All URIs are relative to *https://api.vimeo.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**endpoints**](ApiInformationEssentialsApi.md#endpoints) | **GET** / | Get the API specification |


<a name="endpoints"></a>
# **endpoints**
> Endpoint endpoints().openapi(openapi).version(version).execute();

Get the API specification

This method returns the full OpenAPI specification for the Vimeo API.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApiInformationEssentialsApi;
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
    Boolean openapi = true; // Return an OpenAPI specification.
    String version = "3.4"; // Return an OpenAPI specification for the specified API version. This overwrites the **version** field provided in the **Accept** header.
    try {
      Endpoint result = client
              .apiInformationEssentials
              .endpoints()
              .openapi(openapi)
              .version(version)
              .execute();
      System.out.println(result);
      System.out.println(result.getMethods());
      System.out.println(result.getPath());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiInformationEssentialsApi#endpoints");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Endpoint> response = client
              .apiInformationEssentials
              .endpoints()
              .openapi(openapi)
              .version(version)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiInformationEssentialsApi#endpoints");
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
| **openapi** | **Boolean**| Return an OpenAPI specification. | [optional] |
| **version** | **String**| Return an OpenAPI specification for the specified API version. This overwrites the **version** field provided in the **Accept** header. | [optional] |

### Return type

[**Endpoint**](Endpoint.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.vimeo.endpoint+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Standard request. |  -  |

