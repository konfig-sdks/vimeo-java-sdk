# PaymentsEssentialsApi

All URIs are relative to *https://api.vimeo.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getPaymentMethodInfo**](PaymentsEssentialsApi.md#getPaymentMethodInfo) | **GET** /me/payment_methods/{payment_method_id} | Get information about a payments service payment method |
| [**listPaymentMethods**](PaymentsEssentialsApi.md#listPaymentMethods) | **GET** /me/payment_methods | Get a list of all payments service payment methods |


<a name="getPaymentMethodInfo"></a>
# **getPaymentMethodInfo**
> PaymentMethod getPaymentMethodInfo(paymentMethodId).execute();

Get information about a payments service payment method

This method returns information about the specified Vimeo payments service payment method.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PaymentsEssentialsApi;
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
    String paymentMethodId = "abc12345"; // The ID of the payment method.
    try {
      PaymentMethod result = client
              .paymentsEssentials
              .getPaymentMethodInfo(paymentMethodId)
              .execute();
      System.out.println(result);
      System.out.println(result.getAccountId());
      System.out.println(result.getCard());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getDisabledAt());
      System.out.println(result.getId());
      System.out.println(result.getIsDefault());
      System.out.println(result.getType());
      System.out.println(result.getUpdatedAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentsEssentialsApi#getPaymentMethodInfo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PaymentMethod> response = client
              .paymentsEssentials
              .getPaymentMethodInfo(paymentMethodId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentsEssentialsApi#getPaymentMethodInfo");
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
| **paymentMethodId** | **String**| The ID of the payment method. | |

### Return type

[**PaymentMethod**](PaymentMethod.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The payments service payment method information was returned. |  -  |

<a name="listPaymentMethods"></a>
# **listPaymentMethods**
> List&lt;PaymentMethod&gt; listPaymentMethods(userId).cardmemberName(cardmemberName).page(page).perPage(perPage).showDisabled(showDisabled).paymentsEssentialsListPaymentMethodsRequest(paymentsEssentialsListPaymentMethodsRequest).execute();

Get a list of all payments service payment methods

This method returns a list of all Vimeo payments service payment methods that are available to the authenticated user.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PaymentsEssentialsApi;
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
    Double userId = 12345D; // The ID of the user.
    String type = "applepay"; // The type of payment method.  Option descriptions:  * `applepay` - The payment method is Apple Pay.  * `bank_account` - The payment method is a bank account.  * `card` - The payment method is a credit or debit card.  * `googlepay` - The payment method is Google Pay.  * `paypal` - The payment method is a PayPal account. 
    String cardmemberName = "John Doe"; // The name of the card member.
    Double page = 1D; // The page number of the results to show.
    Double perPage = 10D; // The number of items to show on each page of results, up to a maximum of 100.
    Boolean showDisabled = false; // Whether to return disabled payment methods.
    try {
      List<PaymentMethod> result = client
              .paymentsEssentials
              .listPaymentMethods(userId)
              .type(type)
              .cardmemberName(cardmemberName)
              .page(page)
              .perPage(perPage)
              .showDisabled(showDisabled)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentsEssentialsApi#listPaymentMethods");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<PaymentMethod>> response = client
              .paymentsEssentials
              .listPaymentMethods(userId)
              .type(type)
              .cardmemberName(cardmemberName)
              .page(page)
              .perPage(perPage)
              .showDisabled(showDisabled)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentsEssentialsApi#listPaymentMethods");
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
| **cardmemberName** | **String**| The name of the card member. | [optional] |
| **page** | **Double**| The page number of the results to show. | [optional] |
| **perPage** | **Double**| The number of items to show on each page of results, up to a maximum of 100. | [optional] |
| **showDisabled** | **Boolean**| Whether to return disabled payment methods. | [optional] |
| **paymentsEssentialsListPaymentMethodsRequest** | [**PaymentsEssentialsListPaymentMethodsRequest**](PaymentsEssentialsListPaymentMethodsRequest.md)|  | [optional] |

### Return type

[**List&lt;PaymentMethod&gt;**](PaymentMethod.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The list of payments service payment methods was returned. |  -  |

