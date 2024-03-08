

# Video


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**tags** | [**List&lt;Tag&gt;**](Tag.md) | An array of all tags assigned to the video. |  |
|**description** | **String** | A brief explanation of the video&#39;s content. |  |
|**allowedPrivacies** | **List&lt;String&gt;** | An array of privacy settings supported for this video and the requesting user. |  |
|**app** | [**ApiApp**](ApiApp.md) | The API application associated with the video owner&#39;s token. |  |
|**canMoveToProject** | **Boolean** | Whether the video can be moved to a folder. This data requires a bearer token with the &#x60;private&#x60; scope. |  |
|**categories** | [**List&lt;Category&gt;**](Category.md) | The categories that the video belongs to. |  |
|**contentRating** | [**ContentRatingEnum**](#ContentRatingEnum) | The video&#39;s granular content rating.  Option descriptions:  * &#x60;advertisement&#x60; - The video contains advertisements.  * &#x60;drugs&#x60; - The video contains drug or alcohol use.  * &#x60;language&#x60; - The video contains profanity or sexually suggestive content.  * &#x60;nudity&#x60; - The video contains nudity.  * &#x60;safe&#x60; - The video is safe for all audiences.  * &#x60;unrated&#x60; - The video hasn&#39;t been rated.  * &#x60;violence&#x60; - The video contains violence.  |  |
|**contentRatingClass** | [**ContentRatingClassEnum**](#ContentRatingClassEnum) | The video&#39;s high-level content rating class.  Option descriptions:  * &#x60;explicit&#x60; - The video contains one or more explicit content rating types.  * &#x60;safe&#x60; - The video contains no explicit content rating types.  * &#x60;unrated&#x60; - The video doesn&#39;t belong to a content rating class.  |  |
|**context** | [**VideoContext**](VideoContext.md) |  |  |
|**createdTime** | **String** | The time in ISO 8601 format when the video was created. |  |
|**customUrl** | **String** | The custom URL of the video. |  |
|**descriptionHtml** | **String** | A brief explanation of the video&#39;s content, formatted with HTML entities. |  |
|**descriptionRich** | **String** | A JSON representation of the description. |  [optional] |
|**disabledProperties** | [**DisabledVideoProperties**](DisabledVideoProperties.md) | Information about what features may be disabled on the video. |  [optional] |
|**download** | [**List&lt;VideoFile&gt;**](VideoFile.md) | The list of downloadable files for the video. This data requires a bearer token with the &#x60;private&#x60; scope. |  |
|**duration** | **Double** | The video&#39;s duration in seconds. A value of &#x60;0&#x60; indicates the duration hasn&#39;t been calculated yet. |  |
|**editSession** | [**EditingSession**](EditingSession.md) | Information about the video&#39;s Vimeo Create editing session. This data requires a bearer token with the &#x60;private&#x60; scope. |  [optional] |
|**embed** | [**EmbedSettings**](EmbedSettings.md) | Information about embedding the video. |  |
|**files** | [**List&lt;VideoFile&gt;**](VideoFile.md) | The list of files for the video. This data requires a bearer token with the &#x60;private&#x60; scope. |  |
|**hasAudio** | **Boolean** | Whether the video has audio. |  |
|**hasAudioTracks** | **Boolean** | Whether the video has alternate audio tracks. |  |
|**hasChapters** | **Boolean** | Whether the video has chapters. |  |
|**hasInteractive** | **Boolean** | Whether the video has interactive capability. |  |
|**hasTextTracks** | **Boolean** | Whether the video has text tracks. |  |
|**height** | **Double** | The video&#39;s height in pixels. |  |
|**isCopyrightRestricted** | **Boolean** | Whether the video is privacy restricted due to a copyright infringement. This data requires a bearer token with the &#x60;private&#x60; scope. |  |
|**isFree** | **Boolean** | Whether the video is a free Vimeo Stock video. |  [optional] |
|**isPlayable** | **Boolean** | Whether the video is playable. |  |
|**language** | **String** | The video&#39;s primary language. |  |
|**lastUserActionEventDate** | **String** | The time in ISO 8601 format when the user last modified the video. |  [optional] |
|**license** | [**LicenseEnum**](#LicenseEnum) | The [Creative Commons](http://creativecommons.org/licenses/) license that the video is given under.  Option descriptions:  * &#x60;by&#x60; - The video is given under the Attribution license.  * &#x60;by-nc&#x60; - The video is given under the Attribution Non-Commercial license.  * &#x60;by-nc-nd&#x60; - The video is given under the Attribution Non-Commercial No Derivatives license.  * &#x60;by-nc-sa&#x60; - The video is given under the Attribution Non-Commercial Share Alike license.  * &#x60;by-nd&#x60; - The video is given under the Attribution No Derivatives license.  * &#x60;by-sa&#x60; - The video is given under the Attribution Share Alike license.  * &#x60;cc0&#x60; - The video is given under the Public Domain Dedication license.  |  |
|**link** | **String** | The link to the video. |  |
|**manageLink** | **String** | The link to the video management page. This data requires a bearer token with the &#x60;private&#x60; scope. |  [optional] |
|**metadata** | [**VideoMetadata**](VideoMetadata.md) |  |  |
|**modifiedTime** | **String** | The time in ISO 8601 format when the video metadata was last modified. |  |
|**name** | **String** | The video&#39;s title. |  |
|**originVariableFrameResolution** | **Boolean** | Whether the video has unified resolution. If the value of this field is &#x60;false&#x60;, the video requires transcoding. |  |
|**parentFolder** | [**Project**](Project.md) | Information about the folder that contains the video. |  [optional] |
|**password** | **String** | The privacy-enabled password to watch the video. Only the video&#39;s owner and team members with permission can access the video&#39;s password. This data requires a bearer token with the &#x60;private&#x60; scope. |  [optional] |
|**pictures** | [**Picture**](Picture.md) | The video&#39;s active picture. |  |
|**play** | [**Play**](Play.md) | The &#x60;Play&#x60; representation. |  [optional] |
|**playerEmbedUrl** | **String** | The video&#39;s player embed URL. |  |
|**privacy** | [**VideoPrivacy**](VideoPrivacy.md) |  |  |
|**ratingModLocked** | **Boolean** | Whether the video&#39;s content rating is locked by a mod. |  |
|**releaseTime** | **String** | The time in ISO 8601 format when the video was released. |  |
|**resourceKey** | **String** | The resource key string of the video. |  |
|**showReviewPage** | **Boolean** | Whether to show the &#x60;Review&#x60; button on single video view recipient pages. This data requires a bearer token with the &#x60;private&#x60; scope. |  |
|**showSvvFooterBanner** | **Boolean** | Whether to show the single video view footer banner on recipient pages. This data requires a bearer token with the &#x60;private&#x60; scope. |  |
|**showSvvTimecodedComments** | **Boolean** | Whether to enable timecoded comments on the single video view recipient page. This data requires a bearer token with the &#x60;private&#x60; scope. |  |
|**spatial** | [**VideoSpatial**](VideoSpatial.md) |  |  |
|**stats** | [**VideoStats**](VideoStats.md) |  |  |
|**status** | [**StatusEnum**](#StatusEnum) | The status code for the availability of the video.  Option descriptions:  * &#x60;available&#x60; - The video is available.  * &#x60;quota_exceeded&#x60; - The user&#39;s weekly upload quota is exceeded with this video.  * &#x60;total_cap_exceeded&#x60; - The user&#39;s total storage limit is exceeded with this video.  * &#x60;transcode_starting&#x60; - Transcoding is starting for the video.  * &#x60;transcoding&#x60; - Transcoding has started and is currently underway for the video.  * &#x60;transcoding_error&#x60; - There was an error in transcoding the video.  * &#x60;unavailable&#x60; - The video is unavailable.  * &#x60;uploading&#x60; - The video is being uploaded.  * &#x60;uploading_error&#x60; - There was an error in uploading the video.  |  |
|**transcode** | [**VideoTranscode**](VideoTranscode.md) |  |  |
|**transcript** | [**VideoTranscript**](VideoTranscript.md) |  |  |
|**type** | [**TypeEnum**](#TypeEnum) | The type of the video.  Option descriptions:  * &#x60;live&#x60; - The video is or was an event.  * &#x60;stock&#x60; - The video is a Vimeo Stock video.  * &#x60;video&#x60; - The video is a standard Vimeo video.  |  |
|**upload** | [**VideoUpload**](VideoUpload.md) |  |  |
|**uploader** | [**VideoUploader**](VideoUploader.md) |  |  |
|**uri** | **String** | The video&#39;s canonical relative URI. |  |
|**user** | [**User**](User.md) | The video&#39;s owner. |  |
|**versionTranscodeStatus** | [**VersionTranscodeStatus**](VersionTranscodeStatus.md) | Detailed transcode status information for the current version of the video upload. |  |
|**vod** | [**VideoVod**](VideoVod.md) |  |  |
|**width** | **Double** | The video&#39;s width in pixels. |  |



## Enum: ContentRatingEnum

| Name | Value |
|---- | -----|



## Enum: ContentRatingClassEnum

| Name | Value |
|---- | -----|
| EXPLICIT | &quot;explicit&quot; |
| SAFE | &quot;safe&quot; |
| UNRATED | &quot;unrated&quot; |



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



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| AVAILABLE | &quot;available&quot; |
| QUOTA_EXCEEDED | &quot;quota_exceeded&quot; |
| TOTAL_CAP_EXCEEDED | &quot;total_cap_exceeded&quot; |
| TRANSCODE_STARTING | &quot;transcode_starting&quot; |
| TRANSCODING | &quot;transcoding&quot; |
| TRANSCODING_ERROR | &quot;transcoding_error&quot; |
| UNAVAILABLE | &quot;unavailable&quot; |
| UPLOADING | &quot;uploading&quot; |
| UPLOADING_ERROR | &quot;uploading_error&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| LIVE | &quot;live&quot; |
| STOCK | &quot;stock&quot; |
| VIDEO | &quot;video&quot; |



