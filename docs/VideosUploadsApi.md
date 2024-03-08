# VideosUploadsApi

All URIs are relative to *https://api.vimeo.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**beginVideoUploadProcess**](VideosUploadsApi.md#beginVideoUploadProcess) | **POST** /me/videos | Upload a video |
| [**completeStreamingUpload**](VideosUploadsApi.md#completeStreamingUpload) | **DELETE** /users/{user_id}/uploads/{upload_id} | Complete a streaming upload |
| [**getUploadAttempt**](VideosUploadsApi.md#getUploadAttempt) | **GET** /users/{user_id}/uploads/{upload_id} | Get an upload attempt |
| [**video**](VideosUploadsApi.md#video) | **POST** /users/{user_id}/videos | Upload a video |


<a name="beginVideoUploadProcess"></a>
# **beginVideoUploadProcess**
> Video beginVideoUploadProcess(videosUploadsBeginVideoUploadProcessRequest).execute();

Upload a video

This method begins the video upload process for the authenticated user. For more information, see our [upload documentation](https://developer.vimeo.com/api/upload/videos).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VideosUploadsApi;
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
    VideosUploadsBeginVideoUploadProcessRequestUpload upload = new VideosUploadsBeginVideoUploadProcessRequestUpload();
    String description = "description_example"; // The description of the video.
    List<String> contentRating = Arrays.asList(); // A list of values describing the content in this video. For a full list of values, use the [`/contentratings`](https://developer.vimeo.com/api/reference/videos#get_content_ratings) endpoint.
    VideosUploadsBeginVideoUploadProcessRequestEmbed embed = new VideosUploadsBeginVideoUploadProcessRequestEmbed();
    List<String> embedDomains = Arrays.asList(); // The complete list of domains the video can be embedded on. This field requires that **privacy_embed** have the value `whitelist`.
    String folderUri = "folderUri_example"; // The URI of the folder to which the video is uploaded.
    Boolean hideFromVimeo = true; // Whether to hide the video from everyone except the video's owner. When the value is `true`, unlisted video links work only for the video's owner.
    String license = "by"; // The Creative Commons license under which the video is offered.  Option descriptions:  * `by` - The video is offered under CC BY, or the attibution-only license.  * `by-nc` - The video is offered under CC BY-NC, or the Attribution-NonCommercial license.  * `by-nc-nd` - The video is offered under CC BY-NC-ND, or the Attribution-NonCommercian-NoDerivs license.  * `by-nc-sa` - The video is offered under CC BY-NC-SA, or the Attribution-NonCommercial-ShareAlike licence.  * `by-nd` - The video is offered under CC BY-ND, or the Attribution-NoDerivs license.  * `by-sa` - The video is offered under CC BY-SA, or the Attribution-ShareAlike license.  * `cc0` - The video is offered under CC0, or the public domain license. 
    String locale = "locale_example"; // The video's default language. For a full list of supported languages, use the [`/languages?filter=texttracks`](https://developer.vimeo.com/api/reference/videos#get_languages) endpoint.
    String name = "name_example"; // The title of the video.
    String password = "password_example"; // The password. This field is required when **privacy.view** is `password`.
    VideosUploadsBeginVideoUploadProcessRequestPrivacy privacy = new VideosUploadsBeginVideoUploadProcessRequestPrivacy();
    VideosUploadsBeginVideoUploadProcessRequestReviewPage reviewPage = new VideosUploadsBeginVideoUploadProcessRequestReviewPage();
    VideosUploadsBeginVideoUploadProcessRequestSpatial spatial = new VideosUploadsBeginVideoUploadProcessRequestSpatial();
    try {
      Video result = client
              .videosUploads
              .beginVideoUploadProcess(upload)
              .description(description)
              .contentRating(contentRating)
              .embed(embed)
              .embedDomains(embedDomains)
              .folderUri(folderUri)
              .hideFromVimeo(hideFromVimeo)
              .license(license)
              .locale(locale)
              .name(name)
              .password(password)
              .privacy(privacy)
              .reviewPage(reviewPage)
              .spatial(spatial)
              .execute();
      System.out.println(result);
      System.out.println(result.getTags());
      System.out.println(result.getDescription());
      System.out.println(result.getAllowedPrivacies());
      System.out.println(result.getApp());
      System.out.println(result.getCanMoveToProject());
      System.out.println(result.getCategories());
      System.out.println(result.getContentRating());
      System.out.println(result.getContentRatingClass());
      System.out.println(result.getContext());
      System.out.println(result.getCreatedTime());
      System.out.println(result.getCustomUrl());
      System.out.println(result.getDescriptionHtml());
      System.out.println(result.getDescriptionRich());
      System.out.println(result.getDisabledProperties());
      System.out.println(result.getDownload());
      System.out.println(result.getDuration());
      System.out.println(result.getEditSession());
      System.out.println(result.getEmbed());
      System.out.println(result.getFiles());
      System.out.println(result.getHasAudio());
      System.out.println(result.getHasAudioTracks());
      System.out.println(result.getHasChapters());
      System.out.println(result.getHasInteractive());
      System.out.println(result.getHasTextTracks());
      System.out.println(result.getHeight());
      System.out.println(result.getIsCopyrightRestricted());
      System.out.println(result.getIsFree());
      System.out.println(result.getIsPlayable());
      System.out.println(result.getLanguage());
      System.out.println(result.getLastUserActionEventDate());
      System.out.println(result.getLicense());
      System.out.println(result.getLink());
      System.out.println(result.getManageLink());
      System.out.println(result.getMetadata());
      System.out.println(result.getModifiedTime());
      System.out.println(result.getName());
      System.out.println(result.getOriginVariableFrameResolution());
      System.out.println(result.getParentFolder());
      System.out.println(result.getPassword());
      System.out.println(result.getPictures());
      System.out.println(result.getPlay());
      System.out.println(result.getPlayerEmbedUrl());
      System.out.println(result.getPrivacy());
      System.out.println(result.getRatingModLocked());
      System.out.println(result.getReleaseTime());
      System.out.println(result.getResourceKey());
      System.out.println(result.getShowReviewPage());
      System.out.println(result.getShowSvvFooterBanner());
      System.out.println(result.getShowSvvTimecodedComments());
      System.out.println(result.getSpatial());
      System.out.println(result.getStats());
      System.out.println(result.getStatus());
      System.out.println(result.getTranscode());
      System.out.println(result.getTranscript());
      System.out.println(result.getType());
      System.out.println(result.getUpload());
      System.out.println(result.getUploader());
      System.out.println(result.getUri());
      System.out.println(result.getUser());
      System.out.println(result.getVersionTranscodeStatus());
      System.out.println(result.getVod());
      System.out.println(result.getWidth());
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosUploadsApi#beginVideoUploadProcess");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Video> response = client
              .videosUploads
              .beginVideoUploadProcess(upload)
              .description(description)
              .contentRating(contentRating)
              .embed(embed)
              .embedDomains(embedDomains)
              .folderUri(folderUri)
              .hideFromVimeo(hideFromVimeo)
              .license(license)
              .locale(locale)
              .name(name)
              .password(password)
              .privacy(privacy)
              .reviewPage(reviewPage)
              .spatial(spatial)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosUploadsApi#beginVideoUploadProcess");
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
| **videosUploadsBeginVideoUploadProcessRequest** | [**VideosUploadsBeginVideoUploadProcessRequest**](VideosUploadsBeginVideoUploadProcessRequest.md)|  | |

### Return type

[**Video**](Video.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/vnd.vimeo.video+json
 - **Accept**: application/vnd.vimeo.video+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The upload procedure has begun. |  -  |

<a name="completeStreamingUpload"></a>
# **completeStreamingUpload**
> completeStreamingUpload(uploadId, userId, signature, videoFileId).execute();

Complete a streaming upload

This method completes the specified streaming upload of the authenticated user.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VideosUploadsApi;
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
    Double uploadId = 12345D; // The ID of the streaming upload.
    Double userId = 152184D; // The ID of the user.
    String signature = "cd89a20adde7a608f3331e71c37bdfa087bacbf3"; // The crypto signature of the completed upload.
    Double videoFileId = 1234D; // The ID of the uploaded file.
    try {
      client
              .videosUploads
              .completeStreamingUpload(uploadId, userId, signature, videoFileId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosUploadsApi#completeStreamingUpload");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .videosUploads
              .completeStreamingUpload(uploadId, userId, signature, videoFileId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosUploadsApi#completeStreamingUpload");
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
| **uploadId** | **Double**| The ID of the streaming upload. | |
| **userId** | **Double**| The ID of the user. | |
| **signature** | **String**| The crypto signature of the completed upload. | |
| **videoFileId** | **Double**| The ID of the uploaded file. | |

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
| **201** | The streaming upload has been completed. |  -  |

<a name="getUploadAttempt"></a>
# **getUploadAttempt**
> UploadAttempt getUploadAttempt(uploadId, userId).execute();

Get an upload attempt

This method returns the specified upload attempt of the authenticated user. _This method has been deprecated. For information on our currently supported upload approaches, see our [Working with Video Uploads](https://developer.vimeo.com/api/upload/videos) guide._

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VideosUploadsApi;
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
    Double uploadId = 12345D; // The ID of the upload attempt.
    Double userId = 152184D; // The ID of the user.
    try {
      UploadAttempt result = client
              .videosUploads
              .getUploadAttempt(uploadId, userId)
              .execute();
      System.out.println(result);
      System.out.println(result.getClip());
      System.out.println(result.getForm());
      System.out.println(result.getTicketId());
      System.out.println(result.getUploadLink());
      System.out.println(result.getUri());
      System.out.println(result.getUser());
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosUploadsApi#getUploadAttempt");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UploadAttempt> response = client
              .videosUploads
              .getUploadAttempt(uploadId, userId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosUploadsApi#getUploadAttempt");
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
| **uploadId** | **Double**| The ID of the upload attempt. | |
| **userId** | **Double**| The ID of the user. | |

### Return type

[**UploadAttempt**](UploadAttempt.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.vimeo.uploadattempt+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The upload attempt was returned. |  -  |

<a name="video"></a>
# **video**
> Video video(userId, uploadVideoRequest).execute();

Upload a video

This method begins the video upload process for the authenticated user. For more information, see our [upload documentation](https://developer.vimeo.com/api/upload/videos).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vimeo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VideosUploadsApi;
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
    UploadVideoRequestUpload upload = new UploadVideoRequestUpload();
    Double userId = 152184D; // The ID of the user.
    String description = "description_example"; // The description of the video.
    List<String> contentRating = Arrays.asList(); // A list of values describing the content in this video. For a full list of values, use the [`/contentratings`](https://developer.vimeo.com/api/reference/videos#get_content_ratings) endpoint.
    UploadVideoRequestEmbed embed = new UploadVideoRequestEmbed();
    List<String> embedDomains = Arrays.asList(); // The complete list of domains the video can be embedded on. This field requires that **privacy_embed** have the value `whitelist`.
    String folderUri = "folderUri_example"; // The URI of the folder to which the video is uploaded.
    Boolean hideFromVimeo = true; // Whether to hide the video from everyone except the video's owner. When the value is `true`, unlisted video links work only for the video's owner.
    String license = "by"; // The Creative Commons license under which the video is offered.  Option descriptions:  * `by` - The video is offered under CC BY, or the attibution-only license.  * `by-nc` - The video is offered under CC BY-NC, or the Attribution-NonCommercial license.  * `by-nc-nd` - The video is offered under CC BY-NC-ND, or the Attribution-NonCommercian-NoDerivs license.  * `by-nc-sa` - The video is offered under CC BY-NC-SA, or the Attribution-NonCommercial-ShareAlike licence.  * `by-nd` - The video is offered under CC BY-ND, or the Attribution-NoDerivs license.  * `by-sa` - The video is offered under CC BY-SA, or the Attribution-ShareAlike license.  * `cc0` - The video is offered under CC0, or the public domain license. 
    String locale = "locale_example"; // The video's default language. For a full list of supported languages, use the [`/languages?filter=texttracks`](https://developer.vimeo.com/api/reference/videos#get_languages) endpoint.
    String name = "name_example"; // The title of the video.
    String password = "password_example"; // The password. This field is required when **privacy.view** is `password`.
    UploadVideoRequestPrivacy privacy = new UploadVideoRequestPrivacy();
    UploadVideoRequestReviewPage reviewPage = new UploadVideoRequestReviewPage();
    UploadVideoRequestSpatial spatial = new UploadVideoRequestSpatial();
    try {
      Video result = client
              .videosUploads
              .video(upload, userId)
              .description(description)
              .contentRating(contentRating)
              .embed(embed)
              .embedDomains(embedDomains)
              .folderUri(folderUri)
              .hideFromVimeo(hideFromVimeo)
              .license(license)
              .locale(locale)
              .name(name)
              .password(password)
              .privacy(privacy)
              .reviewPage(reviewPage)
              .spatial(spatial)
              .execute();
      System.out.println(result);
      System.out.println(result.getTags());
      System.out.println(result.getDescription());
      System.out.println(result.getAllowedPrivacies());
      System.out.println(result.getApp());
      System.out.println(result.getCanMoveToProject());
      System.out.println(result.getCategories());
      System.out.println(result.getContentRating());
      System.out.println(result.getContentRatingClass());
      System.out.println(result.getContext());
      System.out.println(result.getCreatedTime());
      System.out.println(result.getCustomUrl());
      System.out.println(result.getDescriptionHtml());
      System.out.println(result.getDescriptionRich());
      System.out.println(result.getDisabledProperties());
      System.out.println(result.getDownload());
      System.out.println(result.getDuration());
      System.out.println(result.getEditSession());
      System.out.println(result.getEmbed());
      System.out.println(result.getFiles());
      System.out.println(result.getHasAudio());
      System.out.println(result.getHasAudioTracks());
      System.out.println(result.getHasChapters());
      System.out.println(result.getHasInteractive());
      System.out.println(result.getHasTextTracks());
      System.out.println(result.getHeight());
      System.out.println(result.getIsCopyrightRestricted());
      System.out.println(result.getIsFree());
      System.out.println(result.getIsPlayable());
      System.out.println(result.getLanguage());
      System.out.println(result.getLastUserActionEventDate());
      System.out.println(result.getLicense());
      System.out.println(result.getLink());
      System.out.println(result.getManageLink());
      System.out.println(result.getMetadata());
      System.out.println(result.getModifiedTime());
      System.out.println(result.getName());
      System.out.println(result.getOriginVariableFrameResolution());
      System.out.println(result.getParentFolder());
      System.out.println(result.getPassword());
      System.out.println(result.getPictures());
      System.out.println(result.getPlay());
      System.out.println(result.getPlayerEmbedUrl());
      System.out.println(result.getPrivacy());
      System.out.println(result.getRatingModLocked());
      System.out.println(result.getReleaseTime());
      System.out.println(result.getResourceKey());
      System.out.println(result.getShowReviewPage());
      System.out.println(result.getShowSvvFooterBanner());
      System.out.println(result.getShowSvvTimecodedComments());
      System.out.println(result.getSpatial());
      System.out.println(result.getStats());
      System.out.println(result.getStatus());
      System.out.println(result.getTranscode());
      System.out.println(result.getTranscript());
      System.out.println(result.getType());
      System.out.println(result.getUpload());
      System.out.println(result.getUploader());
      System.out.println(result.getUri());
      System.out.println(result.getUser());
      System.out.println(result.getVersionTranscodeStatus());
      System.out.println(result.getVod());
      System.out.println(result.getWidth());
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosUploadsApi#video");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Video> response = client
              .videosUploads
              .video(upload, userId)
              .description(description)
              .contentRating(contentRating)
              .embed(embed)
              .embedDomains(embedDomains)
              .folderUri(folderUri)
              .hideFromVimeo(hideFromVimeo)
              .license(license)
              .locale(locale)
              .name(name)
              .password(password)
              .privacy(privacy)
              .reviewPage(reviewPage)
              .spatial(spatial)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosUploadsApi#video");
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
| **uploadVideoRequest** | [**UploadVideoRequest**](UploadVideoRequest.md)|  | |

### Return type

[**Video**](Video.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/vnd.vimeo.video+json
 - **Accept**: application/vnd.vimeo.video+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The upload procedure has begun. |  -  |

