# SubscriptionPlansEssentialsApi

All URIs are relative to *https://api.vimeo.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**plan**](SubscriptionPlansEssentialsApi.md#plan) | **GET** /subscription_plans/{tier} | Get a single subscription plan |


<a name="plan"></a>
# **plan**
> plan(tier).execute();

Get a single subscription plan

This method returns the specified subscription plan.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SubscriptionPlansEssentialsApi;
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
    String tier = "advanced"; // The type of subscription plan.  Option descriptions:  * `advanced` - The plan type is Vimeo Advanced.  * `business` - The plan type is Vimeo Business.  * `free` - The plan type is Vimeo Free.  * `live_premium` - The plan type is Vimeo Premium.  * `plus` - The plan type is Vimeo Plus.  * `pro` - The plan type is Vimeo Pro.  * `pro_unlimited` - The plan type is Vimeo Pro Unlimited.  * `standard` - The plan type is Vimeo Standard.  * `starter` - The plan type is Vimeo Starter. 
    try {
      client
              .subscriptionPlansEssentials
              .plan(tier)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionPlansEssentialsApi#plan");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .subscriptionPlansEssentials
              .plan(tier)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionPlansEssentialsApi#plan");
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
| **tier** | **String**| The type of subscription plan.  Option descriptions:  * &#x60;advanced&#x60; - The plan type is Vimeo Advanced.  * &#x60;business&#x60; - The plan type is Vimeo Business.  * &#x60;free&#x60; - The plan type is Vimeo Free.  * &#x60;live_premium&#x60; - The plan type is Vimeo Premium.  * &#x60;plus&#x60; - The plan type is Vimeo Plus.  * &#x60;pro&#x60; - The plan type is Vimeo Pro.  * &#x60;pro_unlimited&#x60; - The plan type is Vimeo Pro Unlimited.  * &#x60;standard&#x60; - The plan type is Vimeo Standard.  * &#x60;starter&#x60; - The plan type is Vimeo Starter.  | [enum: advanced, business, free, live_premium, plus, pro, pro_unlimited, standard, starter] |

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
| **200** | OK |  -  |

