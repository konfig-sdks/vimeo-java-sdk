# FoldersEssentialsApi

All URIs are relative to *https://api.vimeo.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createFolder**](FoldersEssentialsApi.md#createFolder) | **POST** /me/projects | Create a folder |
| [**deleteFolder**](FoldersEssentialsApi.md#deleteFolder) | **DELETE** /me/projects/{project_id} | Delete a folder |
| [**editFolder**](FoldersEssentialsApi.md#editFolder) | **PATCH** /me/projects/{project_id} | Edit a folder |
| [**getAllUserFolders**](FoldersEssentialsApi.md#getAllUserFolders) | **GET** /me/projects | Get all the folders that belong to the user |
| [**getSpecificFolder**](FoldersEssentialsApi.md#getSpecificFolder) | **GET** /me/projects/{project_id} | Get a specific folder |
| [**getUserPrivateToMeFolder**](FoldersEssentialsApi.md#getUserPrivateToMeFolder) | **GET** /users/{owner_id}/folders/private_to_me | Get a user&#39;s private-to-me folder |
| [**project**](FoldersEssentialsApi.md#project) | **POST** /users/{user_id}/projects | Create a folder |
| [**project_0**](FoldersEssentialsApi.md#project_0) | **GET** /users/{user_id}/projects/{project_id} | Get a specific folder |
| [**project_1**](FoldersEssentialsApi.md#project_1) | **DELETE** /users/{user_id}/projects/{project_id} | Delete a folder |
| [**project_2**](FoldersEssentialsApi.md#project_2) | **PATCH** /users/{user_id}/projects/{project_id} | Edit a folder |
| [**projects**](FoldersEssentialsApi.md#projects) | **GET** /users/{user_id}/projects | Get all the folders that belong to the user |


<a name="createFolder"></a>
# **createFolder**
> Project createFolder(foldersEssentialsCreateFolderRequest).execute();

Create a folder

This method creates a new folder for the authenticated user. By default, this method creates a top-level folder. To create a subfolder — that is, to place the new folder inside an existing folder — specify the parent folder by URI with the **parent_folder_uri** parameter in the body of the request.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FoldersEssentialsApi;
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
    String name = "name_example"; // The name of the folder.
    String parentFolderUri = "parentFolderUri_example"; // The URI of the parent folder.
    try {
      Project result = client
              .foldersEssentials
              .createFolder(name)
              .parentFolderUri(parentFolderUri)
              .execute();
      System.out.println(result);
      System.out.println(result.getAccessGrant());
      System.out.println(result.getCreatedTime());
      System.out.println(result.getCreatorUri());
      System.out.println(result.getHasSubfolder());
      System.out.println(result.getIsPinned());
      System.out.println(result.getIsPrivateToUser());
      System.out.println(result.getLastUserActionEventDate());
      System.out.println(result.getLink());
      System.out.println(result.getManageLink());
      System.out.println(result.getMetadata());
      System.out.println(result.getModifiedTime());
      System.out.println(result.getName());
      System.out.println(result.getPinnedOn());
      System.out.println(result.getPrivacy());
      System.out.println(result.getResourceKey());
      System.out.println(result.getSettings());
      System.out.println(result.getUri());
      System.out.println(result.getUser());
    } catch (ApiException e) {
      System.err.println("Exception when calling FoldersEssentialsApi#createFolder");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Project> response = client
              .foldersEssentials
              .createFolder(name)
              .parentFolderUri(parentFolderUri)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling FoldersEssentialsApi#createFolder");
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
| **foldersEssentialsCreateFolderRequest** | [**FoldersEssentialsCreateFolderRequest**](FoldersEssentialsCreateFolderRequest.md)|  | |

### Return type

[**Project**](Project.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The folder was created. |  -  |

<a name="deleteFolder"></a>
# **deleteFolder**
> deleteFolder(projectId).shouldDeleteClips(shouldDeleteClips).execute();

Delete a folder

This method deletes the specified folder and optionally also the videos that it contains. The authenticated user must be the owner of the folder.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FoldersEssentialsApi;
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
    Boolean shouldDeleteClips = true; // Whether to delete all the videos in the folder along with the folder itself.
    try {
      client
              .foldersEssentials
              .deleteFolder(projectId)
              .shouldDeleteClips(shouldDeleteClips)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling FoldersEssentialsApi#deleteFolder");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .foldersEssentials
              .deleteFolder(projectId)
              .shouldDeleteClips(shouldDeleteClips)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling FoldersEssentialsApi#deleteFolder");
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
| **shouldDeleteClips** | **Boolean**| Whether to delete all the videos in the folder along with the folder itself. | [optional] |

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
| **204** | The folder was deleted. |  -  |

<a name="editFolder"></a>
# **editFolder**
> Project editFolder(projectId, foldersEssentialsEditFolderRequest).execute();

Edit a folder

This method edits the specified folder. The authenticated user must be the owner of the folder.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FoldersEssentialsApi;
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
    String name = "name_example"; // The name of the folder.
    Double projectId = 12345D; // The ID of the folder.
    try {
      Project result = client
              .foldersEssentials
              .editFolder(name, projectId)
              .execute();
      System.out.println(result);
      System.out.println(result.getAccessGrant());
      System.out.println(result.getCreatedTime());
      System.out.println(result.getCreatorUri());
      System.out.println(result.getHasSubfolder());
      System.out.println(result.getIsPinned());
      System.out.println(result.getIsPrivateToUser());
      System.out.println(result.getLastUserActionEventDate());
      System.out.println(result.getLink());
      System.out.println(result.getManageLink());
      System.out.println(result.getMetadata());
      System.out.println(result.getModifiedTime());
      System.out.println(result.getName());
      System.out.println(result.getPinnedOn());
      System.out.println(result.getPrivacy());
      System.out.println(result.getResourceKey());
      System.out.println(result.getSettings());
      System.out.println(result.getUri());
      System.out.println(result.getUser());
    } catch (ApiException e) {
      System.err.println("Exception when calling FoldersEssentialsApi#editFolder");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Project> response = client
              .foldersEssentials
              .editFolder(name, projectId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling FoldersEssentialsApi#editFolder");
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
| **foldersEssentialsEditFolderRequest** | [**FoldersEssentialsEditFolderRequest**](FoldersEssentialsEditFolderRequest.md)|  | |

### Return type

[**Project**](Project.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The folder was edited. |  -  |

<a name="getAllUserFolders"></a>
# **getAllUserFolders**
> List&lt;Project&gt; getAllUserFolders().direction(direction).page(page).perPage(perPage).query(query).sort(sort).execute();

Get all the folders that belong to the user

This method returns all the folders belonging to the authenticated user.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FoldersEssentialsApi;
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
    String direction = "asc"; // The sort direction of the results.  Option descriptions:  * `asc` - Sort the results in ascending order.  * `desc` - Sort the results in descending order. 
    Double page = 1D; // The page number of the results to show.
    Double perPage = 10D; // The number of items to show on each page of results, up to a maximum of 100.
    String query = "Stop motion"; // The search query to use to filter the results.
    String sort = "date"; // The way to sort the results.  Option descriptions:  * `date` - Sort the results by date.  * `default` - Use the default sort order.  * `modified_time` - Sort the results by last modification.  * `name` - Sort the results by name.  * `pinned_on` - Sort the results by pinned timestamp. 
    try {
      List<Project> result = client
              .foldersEssentials
              .getAllUserFolders()
              .direction(direction)
              .page(page)
              .perPage(perPage)
              .query(query)
              .sort(sort)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FoldersEssentialsApi#getAllUserFolders");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<Project>> response = client
              .foldersEssentials
              .getAllUserFolders()
              .direction(direction)
              .page(page)
              .perPage(perPage)
              .query(query)
              .sort(sort)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling FoldersEssentialsApi#getAllUserFolders");
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
| **direction** | **String**| The sort direction of the results.  Option descriptions:  * &#x60;asc&#x60; - Sort the results in ascending order.  * &#x60;desc&#x60; - Sort the results in descending order.  | [optional] [enum: asc, desc] |
| **page** | **Double**| The page number of the results to show. | [optional] |
| **perPage** | **Double**| The number of items to show on each page of results, up to a maximum of 100. | [optional] |
| **query** | **String**| The search query to use to filter the results. | [optional] |
| **sort** | **String**| The way to sort the results.  Option descriptions:  * &#x60;date&#x60; - Sort the results by date.  * &#x60;default&#x60; - Use the default sort order.  * &#x60;modified_time&#x60; - Sort the results by last modification.  * &#x60;name&#x60; - Sort the results by name.  * &#x60;pinned_on&#x60; - Sort the results by pinned timestamp.  | [optional] [enum: date, default, modified_time, name, pinned_on] |

### Return type

[**List&lt;Project&gt;**](Project.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The folders were returned. |  -  |

<a name="getSpecificFolder"></a>
# **getSpecificFolder**
> Project getSpecificFolder(projectId).execute();

Get a specific folder

This method returns a single folder belonging to the authenticated user.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FoldersEssentialsApi;
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
    try {
      Project result = client
              .foldersEssentials
              .getSpecificFolder(projectId)
              .execute();
      System.out.println(result);
      System.out.println(result.getAccessGrant());
      System.out.println(result.getCreatedTime());
      System.out.println(result.getCreatorUri());
      System.out.println(result.getHasSubfolder());
      System.out.println(result.getIsPinned());
      System.out.println(result.getIsPrivateToUser());
      System.out.println(result.getLastUserActionEventDate());
      System.out.println(result.getLink());
      System.out.println(result.getManageLink());
      System.out.println(result.getMetadata());
      System.out.println(result.getModifiedTime());
      System.out.println(result.getName());
      System.out.println(result.getPinnedOn());
      System.out.println(result.getPrivacy());
      System.out.println(result.getResourceKey());
      System.out.println(result.getSettings());
      System.out.println(result.getUri());
      System.out.println(result.getUser());
    } catch (ApiException e) {
      System.err.println("Exception when calling FoldersEssentialsApi#getSpecificFolder");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Project> response = client
              .foldersEssentials
              .getSpecificFolder(projectId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling FoldersEssentialsApi#getSpecificFolder");
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

### Return type

[**Project**](Project.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The folder was returned. |  -  |

<a name="getUserPrivateToMeFolder"></a>
# **getUserPrivateToMeFolder**
> Project getUserPrivateToMeFolder(ownerId).execute();

Get a user&#39;s private-to-me folder

This method returns the specified private-to-me folder.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FoldersEssentialsApi;
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
    Double ownerId = 152184D; // The ID of the owner.
    try {
      Project result = client
              .foldersEssentials
              .getUserPrivateToMeFolder(ownerId)
              .execute();
      System.out.println(result);
      System.out.println(result.getAccessGrant());
      System.out.println(result.getCreatedTime());
      System.out.println(result.getCreatorUri());
      System.out.println(result.getHasSubfolder());
      System.out.println(result.getIsPinned());
      System.out.println(result.getIsPrivateToUser());
      System.out.println(result.getLastUserActionEventDate());
      System.out.println(result.getLink());
      System.out.println(result.getManageLink());
      System.out.println(result.getMetadata());
      System.out.println(result.getModifiedTime());
      System.out.println(result.getName());
      System.out.println(result.getPinnedOn());
      System.out.println(result.getPrivacy());
      System.out.println(result.getResourceKey());
      System.out.println(result.getSettings());
      System.out.println(result.getUri());
      System.out.println(result.getUser());
    } catch (ApiException e) {
      System.err.println("Exception when calling FoldersEssentialsApi#getUserPrivateToMeFolder");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Project> response = client
              .foldersEssentials
              .getUserPrivateToMeFolder(ownerId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling FoldersEssentialsApi#getUserPrivateToMeFolder");
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
| **ownerId** | **Double**| The ID of the owner. | |

### Return type

[**Project**](Project.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The folder was returned. |  -  |

<a name="project"></a>
# **project**
> Project project(userId, createProjectRequest).execute();

Create a folder

This method creates a new folder for the authenticated user. By default, this method creates a top-level folder. To create a subfolder — that is, to place the new folder inside an existing folder — specify the parent folder by URI with the **parent_folder_uri** parameter in the body of the request.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FoldersEssentialsApi;
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
    String name = "name_example"; // The name of the folder.
    Double userId = 152184D; // The ID of the user.
    String parentFolderUri = "parentFolderUri_example"; // The URI of the parent folder.
    try {
      Project result = client
              .foldersEssentials
              .project(name, userId)
              .parentFolderUri(parentFolderUri)
              .execute();
      System.out.println(result);
      System.out.println(result.getAccessGrant());
      System.out.println(result.getCreatedTime());
      System.out.println(result.getCreatorUri());
      System.out.println(result.getHasSubfolder());
      System.out.println(result.getIsPinned());
      System.out.println(result.getIsPrivateToUser());
      System.out.println(result.getLastUserActionEventDate());
      System.out.println(result.getLink());
      System.out.println(result.getManageLink());
      System.out.println(result.getMetadata());
      System.out.println(result.getModifiedTime());
      System.out.println(result.getName());
      System.out.println(result.getPinnedOn());
      System.out.println(result.getPrivacy());
      System.out.println(result.getResourceKey());
      System.out.println(result.getSettings());
      System.out.println(result.getUri());
      System.out.println(result.getUser());
    } catch (ApiException e) {
      System.err.println("Exception when calling FoldersEssentialsApi#project");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Project> response = client
              .foldersEssentials
              .project(name, userId)
              .parentFolderUri(parentFolderUri)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling FoldersEssentialsApi#project");
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
| **createProjectRequest** | [**CreateProjectRequest**](CreateProjectRequest.md)|  | |

### Return type

[**Project**](Project.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The folder was created. |  -  |

<a name="project_0"></a>
# **project_0**
> Project project_0(projectId, userId).execute();

Get a specific folder

This method returns a single folder belonging to the authenticated user.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FoldersEssentialsApi;
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
    try {
      Project result = client
              .foldersEssentials
              .project_0(projectId, userId)
              .execute();
      System.out.println(result);
      System.out.println(result.getAccessGrant());
      System.out.println(result.getCreatedTime());
      System.out.println(result.getCreatorUri());
      System.out.println(result.getHasSubfolder());
      System.out.println(result.getIsPinned());
      System.out.println(result.getIsPrivateToUser());
      System.out.println(result.getLastUserActionEventDate());
      System.out.println(result.getLink());
      System.out.println(result.getManageLink());
      System.out.println(result.getMetadata());
      System.out.println(result.getModifiedTime());
      System.out.println(result.getName());
      System.out.println(result.getPinnedOn());
      System.out.println(result.getPrivacy());
      System.out.println(result.getResourceKey());
      System.out.println(result.getSettings());
      System.out.println(result.getUri());
      System.out.println(result.getUser());
    } catch (ApiException e) {
      System.err.println("Exception when calling FoldersEssentialsApi#project_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Project> response = client
              .foldersEssentials
              .project_0(projectId, userId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling FoldersEssentialsApi#project_0");
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

### Return type

[**Project**](Project.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The folder was returned. |  -  |

<a name="project_1"></a>
# **project_1**
> project_1(projectId, userId).shouldDeleteClips(shouldDeleteClips).execute();

Delete a folder

This method deletes the specified folder and optionally also the videos that it contains. The authenticated user must be the owner of the folder.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FoldersEssentialsApi;
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
    Boolean shouldDeleteClips = true; // Whether to delete all the videos in the folder along with the folder itself.
    try {
      client
              .foldersEssentials
              .project_1(projectId, userId)
              .shouldDeleteClips(shouldDeleteClips)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling FoldersEssentialsApi#project_1");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .foldersEssentials
              .project_1(projectId, userId)
              .shouldDeleteClips(shouldDeleteClips)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling FoldersEssentialsApi#project_1");
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
| **shouldDeleteClips** | **Boolean**| Whether to delete all the videos in the folder along with the folder itself. | [optional] |

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
| **204** | The folder was deleted. |  -  |

<a name="project_2"></a>
# **project_2**
> Project project_2(projectId, userId, editProjectRequest).execute();

Edit a folder

This method edits the specified folder. The authenticated user must be the owner of the folder.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FoldersEssentialsApi;
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
    String name = "name_example"; // The name of the folder.
    Double projectId = 12345D; // The ID of the folder.
    Double userId = 152184D; // The ID of the user.
    try {
      Project result = client
              .foldersEssentials
              .project_2(name, projectId, userId)
              .execute();
      System.out.println(result);
      System.out.println(result.getAccessGrant());
      System.out.println(result.getCreatedTime());
      System.out.println(result.getCreatorUri());
      System.out.println(result.getHasSubfolder());
      System.out.println(result.getIsPinned());
      System.out.println(result.getIsPrivateToUser());
      System.out.println(result.getLastUserActionEventDate());
      System.out.println(result.getLink());
      System.out.println(result.getManageLink());
      System.out.println(result.getMetadata());
      System.out.println(result.getModifiedTime());
      System.out.println(result.getName());
      System.out.println(result.getPinnedOn());
      System.out.println(result.getPrivacy());
      System.out.println(result.getResourceKey());
      System.out.println(result.getSettings());
      System.out.println(result.getUri());
      System.out.println(result.getUser());
    } catch (ApiException e) {
      System.err.println("Exception when calling FoldersEssentialsApi#project_2");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Project> response = client
              .foldersEssentials
              .project_2(name, projectId, userId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling FoldersEssentialsApi#project_2");
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
| **editProjectRequest** | [**EditProjectRequest**](EditProjectRequest.md)|  | |

### Return type

[**Project**](Project.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The folder was edited. |  -  |

<a name="projects"></a>
# **projects**
> List&lt;Project&gt; projects(userId).direction(direction).page(page).perPage(perPage).query(query).sort(sort).execute();

Get all the folders that belong to the user

This method returns all the folders belonging to the authenticated user.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FoldersEssentialsApi;
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
    String direction = "asc"; // The sort direction of the results.  Option descriptions:  * `asc` - Sort the results in ascending order.  * `desc` - Sort the results in descending order. 
    Double page = 1D; // The page number of the results to show.
    Double perPage = 10D; // The number of items to show on each page of results, up to a maximum of 100.
    String query = "Stop motion"; // The search query to use to filter the results.
    String sort = "date"; // The way to sort the results.  Option descriptions:  * `date` - Sort the results by date.  * `default` - Use the default sort order.  * `modified_time` - Sort the results by last modification.  * `name` - Sort the results by name.  * `pinned_on` - Sort the results by pinned timestamp. 
    try {
      List<Project> result = client
              .foldersEssentials
              .projects(userId)
              .direction(direction)
              .page(page)
              .perPage(perPage)
              .query(query)
              .sort(sort)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FoldersEssentialsApi#projects");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<Project>> response = client
              .foldersEssentials
              .projects(userId)
              .direction(direction)
              .page(page)
              .perPage(perPage)
              .query(query)
              .sort(sort)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling FoldersEssentialsApi#projects");
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
| **direction** | **String**| The sort direction of the results.  Option descriptions:  * &#x60;asc&#x60; - Sort the results in ascending order.  * &#x60;desc&#x60; - Sort the results in descending order.  | [optional] [enum: asc, desc] |
| **page** | **Double**| The page number of the results to show. | [optional] |
| **perPage** | **Double**| The number of items to show on each page of results, up to a maximum of 100. | [optional] |
| **query** | **String**| The search query to use to filter the results. | [optional] |
| **sort** | **String**| The way to sort the results.  Option descriptions:  * &#x60;date&#x60; - Sort the results by date.  * &#x60;default&#x60; - Use the default sort order.  * &#x60;modified_time&#x60; - Sort the results by last modification.  * &#x60;name&#x60; - Sort the results by name.  * &#x60;pinned_on&#x60; - Sort the results by pinned timestamp.  | [optional] [enum: date, default, modified_time, name, pinned_on] |

### Return type

[**List&lt;Project&gt;**](Project.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The folders were returned. |  -  |

