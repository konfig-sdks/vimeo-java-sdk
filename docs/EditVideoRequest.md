

# EditVideoRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | The description of the video. This field can hold a maximum of 5000 characters. |  [optional] |
|**contentRating** | **List&lt;String&gt;** | A list of values describing the content in this video. For a full list of values, use the [&#x60;/contentratings&#x60;](https://developer.vimeo.com/api/reference/videos#get_content_ratings) endpoint. |  [optional] |
|**customUrl** | **String** | The custom link of the video. This link doesn&#39;t include the base URL and the username or user ID of the video&#39;s owner. |  [optional] |
|**embed** | [**EditVideoRequestEmbed**](EditVideoRequestEmbed.md) |  |  [optional] |
|**embedDomains** | **List&lt;String&gt;** | The complete list of domains the video can be embedded on. This field overwrites existing domains and requires that **privacy_embed** have the value &#x60;whitelist&#x60;. |  [optional] |
|**embedDomainsAdd** | **List&lt;String&gt;** | A list of domains intended to be added to an existing set of domains. This field requires that **privacy_embed** have the value &#x60;whitelist&#x60;. |  [optional] |
|**embedDomainsDelete** | **List&lt;String&gt;** | A list of domains intended to be removed from an existing set of domains. This field requires that **privacy_embed** have the value &#x60;whitelist&#x60;. |  [optional] |
|**hideFromVimeo** | **Boolean** | Whether to hide the video from everyone except the video&#39;s owner. When the value is &#x60;true&#x60;, unlisted video links work only for the video&#39;s owner. |  [optional] |
|**license** | [**LicenseEnum**](#LicenseEnum) | The Creative Commons license under which the video is offered.  Option descriptions:  * &#x60;by&#x60; - The video is offered under CC BY, or the attibution-only license.  * &#x60;by-nc&#x60; - The video is offered under CC BY-NC, or the Attribution-NonCommercial license.  * &#x60;by-nc-nd&#x60; - The video is offered under CC BY-NC-ND, or the Attribution-NonCommercian-NoDerivs license.  * &#x60;by-nc-sa&#x60; - The video is offered under CC BY-NC-SA, or the Attribution-NonCommercial-ShareAlike licence.  * &#x60;by-nd&#x60; - The video is offered under CC BY-ND, or the Attribution-NoDerivs license.  * &#x60;by-sa&#x60; - The video is offered under CC BY-SA, or the Attribution-ShareAlike license.  * &#x60;cc0&#x60; - The video is offered under CC0, or public domain, videos.  |  [optional] |
|**locale** | **String** | The video&#39;s default language. For a full list of supported languages, use the [&#x60;/languages?filter&#x3D;texttracks&#x60;](https://developer.vimeo.com/api/reference/videos#get_languages) endpoint. |  [optional] |
|**name** | **String** | The title of the video. This field can hold a maximum of 128 characters. |  [optional] |
|**password** | **String** | The password. When you set **privacy.view** to &#x60;password&#x60;, you must provide the password as an additional parameter. This field can hold a maximum of 32 characters. |  [optional] |
|**privacy** | [**EditVideoRequestPrivacy**](EditVideoRequestPrivacy.md) |  |  [optional] |
|**reviewPage** | [**EditVideoRequestReviewPage**](EditVideoRequestReviewPage.md) |  |  [optional] |
|**spatial** | [**EditVideoRequestSpatial**](EditVideoRequestSpatial.md) |  |  [optional] |



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



