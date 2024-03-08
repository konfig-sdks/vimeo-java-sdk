# FoldersItemsApi

All URIs are relative to *https://api.vimeo.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getFolderContents**](FoldersItemsApi.md#getFolderContents) | **GET** /users/{user_id}/projects/{project_id}/items | Get all the items in a folder |
| [**getFolderItems**](FoldersItemsApi.md#getFolderItems) | **GET** /me/projects/{project_id}/items | Get all the items in a folder |
| [**removeFromFolder**](FoldersItemsApi.md#removeFromFolder) | **DELETE** /me/projects/{project_id}/items | Remove items from a folder |


<a name="getFolderContents"></a>
# **getFolderContents**
> getFolderContents(projectId, userId).direction(direction).filter(filter).page(page).perPage(perPage).sort(sort).execute();

Get all the items in a folder

This method returns every item that belongs to the specified folder.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FoldersItemsApi;
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
    Double projectId = 12345D; // The ID of the folder.
    Double userId = 152184D; // The ID of the user.
    String direction = "asc"; // The sort direction of the results.  Option descriptions:  * `asc` - Sort the results in ascending order.  * `desc` - Sort the results in descending order. 
    String filter = "folder"; // The attribute by which to filter the results.  Option descriptions:  * `folder` - Filter the results by folder.  * `live_event` - Filter the results by event.  * `video` - Filter the results by video. 
    Double page = 1D; // The page number of the results to show.
    Double perPage = 10D; // The number of items to show on each page of results, up to a maximum of 100.
    String sort = "alphabetical"; // The way to sort the results.  Option descriptions:  * `alphabetical` - Sort the results alphabetically.  * `date` - Sort the results by date.  * `default` - Use the default sort order.  * `duration` - Sort the results by duration. Items without a duration, namely events and folders, are grouped by type in ascending alphabetical order, with events first.  * `last_user_action_event_date` - Sort the results by the date of the last user action. 
    try {
      client
              .foldersItems
              .getFolderContents(projectId, userId)
              .direction(direction)
              .filter(filter)
              .page(page)
              .perPage(perPage)
              .sort(sort)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling FoldersItemsApi#getFolderContents");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .foldersItems
              .getFolderContents(projectId, userId)
              .direction(direction)
              .filter(filter)
              .page(page)
              .perPage(perPage)
              .sort(sort)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling FoldersItemsApi#getFolderContents");
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
| **projectId** | **Double**| The ID of the folder. | |
| **userId** | **Double**| The ID of the user. | |
| **direction** | **String**| The sort direction of the results.  Option descriptions:  * &#x60;asc&#x60; - Sort the results in ascending order.  * &#x60;desc&#x60; - Sort the results in descending order.  | [optional] [enum: asc, desc] |
| **filter** | **String**| The attribute by which to filter the results.  Option descriptions:  * &#x60;folder&#x60; - Filter the results by folder.  * &#x60;live_event&#x60; - Filter the results by event.  * &#x60;video&#x60; - Filter the results by video.  | [optional] [enum: folder, live_event, video] |
| **page** | **Double**| The page number of the results to show. | [optional] |
| **perPage** | **Double**| The number of items to show on each page of results, up to a maximum of 100. | [optional] |
| **sort** | **String**| The way to sort the results.  Option descriptions:  * &#x60;alphabetical&#x60; - Sort the results alphabetically.  * &#x60;date&#x60; - Sort the results by date.  * &#x60;default&#x60; - Use the default sort order.  * &#x60;duration&#x60; - Sort the results by duration. Items without a duration, namely events and folders, are grouped by type in ascending alphabetical order, with events first.  * &#x60;last_user_action_event_date&#x60; - Sort the results by the date of the last user action.  | [optional] [enum: alphabetical, date, default, duration, last_user_action_event_date] |

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

<a name="getFolderItems"></a>
# **getFolderItems**
> getFolderItems(projectId).direction(direction).filter(filter).page(page).perPage(perPage).sort(sort).execute();

Get all the items in a folder

This method returns every item that belongs to the specified folder.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FoldersItemsApi;
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
    Double projectId = 12345D; // The ID of the folder.
    String direction = "asc"; // The sort direction of the results.  Option descriptions:  * `asc` - Sort the results in ascending order.  * `desc` - Sort the results in descending order. 
    String filter = "folder"; // The attribute by which to filter the results.  Option descriptions:  * `folder` - Filter the results by folder.  * `live_event` - Filter the results by event.  * `video` - Filter the results by video. 
    Double page = 1D; // The page number of the results to show.
    Double perPage = 10D; // The number of items to show on each page of results, up to a maximum of 100.
    String sort = "alphabetical"; // The way to sort the results.  Option descriptions:  * `alphabetical` - Sort the results alphabetically.  * `date` - Sort the results by date.  * `default` - Use the default sort order.  * `duration` - Sort the results by duration. Items without a duration, namely events and folders, are grouped by type in ascending alphabetical order, with events first.  * `last_user_action_event_date` - Sort the results by the date of the last user action. 
    try {
      client
              .foldersItems
              .getFolderItems(projectId)
              .direction(direction)
              .filter(filter)
              .page(page)
              .perPage(perPage)
              .sort(sort)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling FoldersItemsApi#getFolderItems");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .foldersItems
              .getFolderItems(projectId)
              .direction(direction)
              .filter(filter)
              .page(page)
              .perPage(perPage)
              .sort(sort)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling FoldersItemsApi#getFolderItems");
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
| **projectId** | **Double**| The ID of the folder. | |
| **direction** | **String**| The sort direction of the results.  Option descriptions:  * &#x60;asc&#x60; - Sort the results in ascending order.  * &#x60;desc&#x60; - Sort the results in descending order.  | [optional] [enum: asc, desc] |
| **filter** | **String**| The attribute by which to filter the results.  Option descriptions:  * &#x60;folder&#x60; - Filter the results by folder.  * &#x60;live_event&#x60; - Filter the results by event.  * &#x60;video&#x60; - Filter the results by video.  | [optional] [enum: folder, live_event, video] |
| **page** | **Double**| The page number of the results to show. | [optional] |
| **perPage** | **Double**| The number of items to show on each page of results, up to a maximum of 100. | [optional] |
| **sort** | **String**| The way to sort the results.  Option descriptions:  * &#x60;alphabetical&#x60; - Sort the results alphabetically.  * &#x60;date&#x60; - Sort the results by date.  * &#x60;default&#x60; - Use the default sort order.  * &#x60;duration&#x60; - Sort the results by duration. Items without a duration, namely events and folders, are grouped by type in ascending alphabetical order, with events first.  * &#x60;last_user_action_event_date&#x60; - Sort the results by the date of the last user action.  | [optional] [enum: alphabetical, date, default, duration, last_user_action_event_date] |

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

<a name="removeFromFolder"></a>
# **removeFromFolder**
> removeFromFolder(projectId, uris).shouldDeleteItems(shouldDeleteItems).execute();

Remove items from a folder

This method removes all items from the specified folder.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FoldersItemsApi;
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
    Double projectId = 12345D; // The ID of the folder.
    String uris = "/videos/258684937,/live_events/273576296"; // A comma-separated list of video or event URIs to remove.
    Boolean shouldDeleteItems = false; // Whether to delete the items when removing them from the folder.
    try {
      client
              .foldersItems
              .removeFromFolder(projectId, uris)
              .shouldDeleteItems(shouldDeleteItems)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling FoldersItemsApi#removeFromFolder");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .foldersItems
              .removeFromFolder(projectId, uris)
              .shouldDeleteItems(shouldDeleteItems)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling FoldersItemsApi#removeFromFolder");
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
| **projectId** | **Double**| The ID of the folder. | |
| **uris** | **String**| A comma-separated list of video or event URIs to remove. | |
| **shouldDeleteItems** | **Boolean**| Whether to delete the items when removing them from the folder. | [optional] |

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
| **204** | The items were removed. |  -  |

