# OnDemandPromotionsApi

All URIs are relative to *https://api.vimeo.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addPromotionToPage**](OnDemandPromotionsApi.md#addPromotionToPage) | **POST** /ondemand/pages/{ondemand_id}/promotions | Add a promotion to an On Demand page |
| [**deletePromotionOnPage**](OnDemandPromotionsApi.md#deletePromotionOnPage) | **DELETE** /ondemand/pages/{ondemand_id}/promotions/{promotion_id} | Delete a promotion on an On Demand page |
| [**getAllPagePromotions**](OnDemandPromotionsApi.md#getAllPagePromotions) | **GET** /ondemand/pages/{ondemand_id}/promotions | Get all the promotions on an On Demand page |
| [**getAllPromotionCodes**](OnDemandPromotionsApi.md#getAllPromotionCodes) | **GET** /ondemand/pages/{ondemand_id}/promotions/{promotion_id}/codes | Get all the codes of a promotion on an On Demand page |
| [**specificPromotionGet**](OnDemandPromotionsApi.md#specificPromotionGet) | **GET** /ondemand/pages/{ondemand_id}/promotions/{promotion_id} | Get a specific promotion on an On Demand page |


<a name="addPromotionToPage"></a>
# **addPromotionToPage**
> OnDemandPromotion addPromotionToPage(ondemandId, onDemandPromotionsAddPromotionToPageRequest).execute();

Add a promotion to an On Demand page

This method adds a promotion to the specified On Demand page. The authenticated user must be the owner of the page.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OnDemandPromotionsApi;
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
    Boolean download = true; // Whether the promotion grants download access to On Demand content. This field is required only when the download access hasn't been defined in the On Demand container, or when **access_type** is `vip` or **product_type** is `buy`.
    String streamPeriod = "1_week"; // The amount of time for which the user can access On Demand content upon redeeming a promotion code. This parameter is required only when the streaming period isn't defined in the On Demand container, or when creating promotions where **access_type** is `vip` or **product_type** is `rent`.  Option descriptions:  * `1_week` - The user can access On Demand content for a maximum of 1 week after redeeming a promotion code.  * `1_year` - The user can access On Demand content for a maximum of 1 year after redeeming a promotion code.  * `24_hour` - The user can access On Demand content for a maximum of 24 hours after redeeming a promotion code.  * `30_day` - The user can access On Demand content for a maximum of 30 days after redeeming a promotion code.  * `3_month` - The user can access On Demand content for a maximum of 3 months after redeeming a promotion code.  * `48_hour` - The user can access On Demand content for a maximum of 48 hours after redeeming a promotion code.  * `6_month` - The user can access On Demand content for a maximum of 6 months after redeeming a promotion code.  * `72_hour` - The user can access On Demand content for a maximum of 72 hours after redeeming a promotion code. 
    Double total = 3.4D; // When **type** is `batch`, the total number of promotions to generate. When **type** is `single`, the total number of uses of the promotion.
    String type = "batch"; // The type of the promotion. When **access_type** is `vip`, the value for this parameter must be `batch`.  Option descriptions:  * `batch` - The promotion type that generates many random codes to use one time each.  * `single` - The promotion type that generates one code to use many times. 
    Double ondemandId = 61326D; // The ID of the On Demand page.
    String accessType = "default"; // The promotion access type, which is a purchase option that isn't available in the On Demand container. Use the **download** and **stream_period** parameters to define additional characteristics for the `vip` type.  Option descriptions:  * `default` - The promotion grants a discount on the existing purchase options for an On Demand container.  * `vip` - The promotion grants free access to On Demand content before it's released. 
    String code = "code_example"; // The promotion code. This parameter is ignored when the promotion type is `batch`.
    String discountType = "free"; // The type of discount offered by the promotion code. When **access_type** is `vip`, the value of this parameter must be `free`.  Option descriptions:  * `free` - The discount reduces the price to zero.  * `percent` - The discount reduces the price by the percentage defined in the **percent_off** parameter. 
    String endTime = "endTime_example"; // The time at which the promotion period ends. If this parameter has no value, the promotion never expires.
    String label = "label_example"; // The description of the promotion when the promotion type is `batch`. This parameter is ignored when the promotion type is `single`.
    Double percentOff = 3.4D; // The percentage of the discount. This parameter is applicable only when **discount_type** is `percent`.
    String productType = "any"; // The type of transaction to which the promotion applies. When **access_type** is `default`, the default value is `any`. When **access_type** is `vip`, the default value is `rent` and the only valid product types are `buy` and `rent`.  Option descriptions:  * `any` - The promotion applies to any transaction.  * `buy` - The promotion applies only to purchased products.  * `buy_episode` - The promotion applies only to purchased episodes.  * `rent` - The promotion applies only to rented products.  * `rent_episode` - The promotion applies only to rented episodes.  * `subscribe` - The promotion applies only to subscriptions. 
    String startTime = "startTime_example"; // The time at which the promotion period starts. If this parameter has no value, the start time defaults to the time at which the promotion was created.
    try {
      OnDemandPromotion result = client
              .onDemandPromotions
              .addPromotionToPage(download, streamPeriod, total, type, ondemandId)
              .accessType(accessType)
              .code(code)
              .discountType(discountType)
              .endTime(endTime)
              .label(label)
              .percentOff(percentOff)
              .productType(productType)
              .startTime(startTime)
              .execute();
      System.out.println(result);
      System.out.println(result.getAccessType());
      System.out.println(result.getDiscountType());
      System.out.println(result.getDownload());
      System.out.println(result.getLabel());
      System.out.println(result.getMetadata());
      System.out.println(result.getPercentOff());
      System.out.println(result.getProductType());
      System.out.println(result.getStreamPeriod());
      System.out.println(result.getTotal());
      System.out.println(result.getType());
      System.out.println(result.getUri());
    } catch (ApiException e) {
      System.err.println("Exception when calling OnDemandPromotionsApi#addPromotionToPage");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<OnDemandPromotion> response = client
              .onDemandPromotions
              .addPromotionToPage(download, streamPeriod, total, type, ondemandId)
              .accessType(accessType)
              .code(code)
              .discountType(discountType)
              .endTime(endTime)
              .label(label)
              .percentOff(percentOff)
              .productType(productType)
              .startTime(startTime)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OnDemandPromotionsApi#addPromotionToPage");
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
| **ondemandId** | **Double**| The ID of the On Demand page. | |
| **onDemandPromotionsAddPromotionToPageRequest** | [**OnDemandPromotionsAddPromotionToPageRequest**](OnDemandPromotionsAddPromotionToPageRequest.md)|  | |

### Return type

[**OnDemandPromotion**](OnDemandPromotion.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/vnd.vimeo.ondemand.promotion+json
 - **Accept**: application/vnd.vimeo.ondemand.promotion+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The promotion was added. |  -  |

<a name="deletePromotionOnPage"></a>
# **deletePromotionOnPage**
> deletePromotionOnPage(ondemandId, promotionId).execute();

Delete a promotion on an On Demand page

This method deletes a promotion on the specified On Demand page. The authenticated user must be the owner of the page.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OnDemandPromotionsApi;
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
    Double ondemandId = 61326D; // The ID of the On Demand page.
    Double promotionId = 12345D; // The ID of the promotion.
    try {
      client
              .onDemandPromotions
              .deletePromotionOnPage(ondemandId, promotionId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling OnDemandPromotionsApi#deletePromotionOnPage");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .onDemandPromotions
              .deletePromotionOnPage(ondemandId, promotionId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling OnDemandPromotionsApi#deletePromotionOnPage");
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
| **ondemandId** | **Double**| The ID of the On Demand page. | |
| **promotionId** | **Double**| The ID of the promotion. | |

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
| **204** | The promotion was deleted. |  -  |

<a name="getAllPagePromotions"></a>
# **getAllPagePromotions**
> OnDemandPromotion getAllPagePromotions(ondemandId, filter).page(page).perPage(perPage).execute();

Get all the promotions on an On Demand page

This method returns every promotion on the specified On Demand page. The authenticated user must be the owner of the page.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OnDemandPromotionsApi;
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
    Double ondemandId = 61326D; // The ID of the On Demand page.
    String filter = "batch"; // The type of filter to apply to the results.  Option descriptions:  * `batch` - Filter the results by the `batch` promotion.  * `default` - Filter the results by the default promotion.  * `single` - Filter the results by the `single` promotion.  * `vip` - Filter the results by the `vip` promotion. 
    Double page = 1D; // The page number of the results to show.
    Double perPage = 10D; // The number of items to show on each page of results, up to a maximum of 100.
    try {
      OnDemandPromotion result = client
              .onDemandPromotions
              .getAllPagePromotions(ondemandId, filter)
              .page(page)
              .perPage(perPage)
              .execute();
      System.out.println(result);
      System.out.println(result.getAccessType());
      System.out.println(result.getDiscountType());
      System.out.println(result.getDownload());
      System.out.println(result.getLabel());
      System.out.println(result.getMetadata());
      System.out.println(result.getPercentOff());
      System.out.println(result.getProductType());
      System.out.println(result.getStreamPeriod());
      System.out.println(result.getTotal());
      System.out.println(result.getType());
      System.out.println(result.getUri());
    } catch (ApiException e) {
      System.err.println("Exception when calling OnDemandPromotionsApi#getAllPagePromotions");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<OnDemandPromotion> response = client
              .onDemandPromotions
              .getAllPagePromotions(ondemandId, filter)
              .page(page)
              .perPage(perPage)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OnDemandPromotionsApi#getAllPagePromotions");
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
| **ondemandId** | **Double**| The ID of the On Demand page. | |
| **filter** | **String**| The type of filter to apply to the results.  Option descriptions:  * &#x60;batch&#x60; - Filter the results by the &#x60;batch&#x60; promotion.  * &#x60;default&#x60; - Filter the results by the default promotion.  * &#x60;single&#x60; - Filter the results by the &#x60;single&#x60; promotion.  * &#x60;vip&#x60; - Filter the results by the &#x60;vip&#x60; promotion.  | [enum: batch, default, single, vip] |
| **page** | **Double**| The page number of the results to show. | [optional] |
| **perPage** | **Double**| The number of items to show on each page of results, up to a maximum of 100. | [optional] |

### Return type

[**OnDemandPromotion**](OnDemandPromotion.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.vimeo.ondemand.promotion+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The promotions were returned. |  -  |

<a name="getAllPromotionCodes"></a>
# **getAllPromotionCodes**
> OnDemandPromotionCode getAllPromotionCodes(ondemandId, promotionId).page(page).perPage(perPage).execute();

Get all the codes of a promotion on an On Demand page

This method returns every code of the specified promotion on an On Demand page. The authenticated user must be the owner of the page.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OnDemandPromotionsApi;
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
    Double ondemandId = 61326D; // The ID of the On Demand page.
    Double promotionId = 12345D; // The ID of the promotion.
    Double page = 1D; // The page number of the results to show.
    Double perPage = 10D; // The number of items to show on each page of results, up to a maximum of 100.
    try {
      OnDemandPromotionCode result = client
              .onDemandPromotions
              .getAllPromotionCodes(ondemandId, promotionId)
              .page(page)
              .perPage(perPage)
              .execute();
      System.out.println(result);
      System.out.println(result.getCode());
      System.out.println(result.getLink());
      System.out.println(result.getMaxUses());
      System.out.println(result.getUses());
    } catch (ApiException e) {
      System.err.println("Exception when calling OnDemandPromotionsApi#getAllPromotionCodes");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<OnDemandPromotionCode> response = client
              .onDemandPromotions
              .getAllPromotionCodes(ondemandId, promotionId)
              .page(page)
              .perPage(perPage)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OnDemandPromotionsApi#getAllPromotionCodes");
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
| **ondemandId** | **Double**| The ID of the On Demand page. | |
| **promotionId** | **Double**| The ID of the promotion. | |
| **page** | **Double**| The page number of the results to show. | [optional] |
| **perPage** | **Double**| The number of items to show on each page of results, up to a maximum of 100. | [optional] |

### Return type

[**OnDemandPromotionCode**](OnDemandPromotionCode.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.vimeo.ondemand.promocode+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The codes were returned. |  -  |

<a name="specificPromotionGet"></a>
# **specificPromotionGet**
> OnDemandPromotion specificPromotionGet(ondemandId, promotionId).execute();

Get a specific promotion on an On Demand page

This method returns a single promotion on the specified On Demand page. The authenticated user must be the owner of the page.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OnDemandPromotionsApi;
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
    Double ondemandId = 61326D; // The ID of the On Demand page.
    Double promotionId = 12345D; // The ID of the promotion.
    try {
      OnDemandPromotion result = client
              .onDemandPromotions
              .specificPromotionGet(ondemandId, promotionId)
              .execute();
      System.out.println(result);
      System.out.println(result.getAccessType());
      System.out.println(result.getDiscountType());
      System.out.println(result.getDownload());
      System.out.println(result.getLabel());
      System.out.println(result.getMetadata());
      System.out.println(result.getPercentOff());
      System.out.println(result.getProductType());
      System.out.println(result.getStreamPeriod());
      System.out.println(result.getTotal());
      System.out.println(result.getType());
      System.out.println(result.getUri());
    } catch (ApiException e) {
      System.err.println("Exception when calling OnDemandPromotionsApi#specificPromotionGet");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<OnDemandPromotion> response = client
              .onDemandPromotions
              .specificPromotionGet(ondemandId, promotionId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OnDemandPromotionsApi#specificPromotionGet");
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
| **ondemandId** | **Double**| The ID of the On Demand page. | |
| **promotionId** | **Double**| The ID of the promotion. | |

### Return type

[**OnDemandPromotion**](OnDemandPromotion.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.vimeo.ondemand.promotion+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The promotion was returned. |  -  |

