

# UploadVideoRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | The description of the video. |  [optional] |
|**contentRating** | **List&lt;String&gt;** | A list of values describing the content in this video. For a full list of values, use the [&#x60;/contentratings&#x60;](https://developer.vimeo.com/api/reference/videos#get_content_ratings) endpoint. |  [optional] |
|**embed** | [**UploadVideoRequestEmbed**](UploadVideoRequestEmbed.md) |  |  [optional] |
|**embedDomains** | **List&lt;String&gt;** | The complete list of domains the video can be embedded on. This field requires that **privacy_embed** have the value &#x60;whitelist&#x60;. |  [optional] |
|**folderUri** | **String** | The URI of the folder to which the video is uploaded. |  [optional] |
|**hideFromVimeo** | **Boolean** | Whether to hide the video from everyone except the video&#39;s owner. When the value is &#x60;true&#x60;, unlisted video links work only for the video&#39;s owner. |  [optional] |
|**license** | [**LicenseEnum**](#LicenseEnum) | The Creative Commons license under which the video is offered.  Option descriptions:  * &#x60;by&#x60; - The video is offered under CC BY, or the attibution-only license.  * &#x60;by-nc&#x60; - The video is offered under CC BY-NC, or the Attribution-NonCommercial license.  * &#x60;by-nc-nd&#x60; - The video is offered under CC BY-NC-ND, or the Attribution-NonCommercian-NoDerivs license.  * &#x60;by-nc-sa&#x60; - The video is offered under CC BY-NC-SA, or the Attribution-NonCommercial-ShareAlike licence.  * &#x60;by-nd&#x60; - The video is offered under CC BY-ND, or the Attribution-NoDerivs license.  * &#x60;by-sa&#x60; - The video is offered under CC BY-SA, or the Attribution-ShareAlike license.  * &#x60;cc0&#x60; - The video is offered under CC0, or the public domain license.  |  [optional] |
|**locale** | **String** | The video&#39;s default language. For a full list of supported languages, use the [&#x60;/languages?filter&#x3D;texttracks&#x60;](https://developer.vimeo.com/api/reference/videos#get_languages) endpoint. |  [optional] |
|**name** | **String** | The title of the video. |  [optional] |
|**password** | **String** | The password. This field is required when **privacy.view** is &#x60;password&#x60;. |  [optional] |
|**privacy** | [**UploadVideoRequestPrivacy**](UploadVideoRequestPrivacy.md) |  |  [optional] |
|**reviewPage** | [**UploadVideoRequestReviewPage**](UploadVideoRequestReviewPage.md) |  |  [optional] |
|**spatial** | [**UploadVideoRequestSpatial**](UploadVideoRequestSpatial.md) |  |  [optional] |
|**upload** | [**UploadVideoRequestUpload**](UploadVideoRequestUpload.md) |  |  |



## Enum: LicenseEnum

| Name | Value |
|---- | -----|
| BY | &quot;by&quot; |
| BY_NC | &quot;by-nc&quot; |
| BY_NC_ND | &quot;by-nc-nd&quot; |
| BY_NC_SA | &quot;by-nc-sa&quot; |
| BY_ND | &quot;by-nd&quot; |
| BY_SA | &quot;by-sa&quot; |
| CC0 | &quot;cc0&quot; |



