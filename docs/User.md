

# User


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**account** | [**AccountEnum**](#AccountEnum) | The authenticated user&#39;s account type.  Option descriptions:  * &#x60;advanced&#x60; - The user has a Vimeo Advanced subscription.  * &#x60;basic&#x60; - The user has a Vimeo Basic subscription.  * &#x60;business&#x60; - The user has a Vimeo Business subscription.  * &#x60;enterprise&#x60; - The user has a Vimeo Enterprise subscription.  * &#x60;free&#x60; - The user has a Vimeo Free subscription.  * &#x60;live_business&#x60; - The user has a Vimeo Business Live subscription.  * &#x60;live_premium&#x60; - The user has a Vimeo Premium subscription.  * &#x60;live_pro&#x60; - The user has a Vimeo PRO Live subscription.  * &#x60;plus&#x60; - The user has a Vimeo Plus subscription.  * &#x60;pro&#x60; - The user has a Vimeo Pro subscription.  * &#x60;pro_unlimited&#x60; - The user has a Vimeo PRO Unlimited subscription.  * &#x60;producer&#x60; - The user has a Vimeo Producer subscription.  * &#x60;standard&#x60; - The user has a Vimeo Standard subscription.  * &#x60;starter&#x60; - The user has a Vimeo Starter subscription.  |  |
|**availableForHire** | **Boolean** | Whether the authenticated user is available for hire. |  |
|**bio** | **String** | The authenticated user&#39;s long bio text. |  |
|**canWorkRemotely** | **Boolean** | Whether the authenticated user can work remotely. |  |
|**capabilities** | **Object** | The users&#39;s capabilities list. |  |
|**clients** | **String** | The comma-separated list of clients. |  |
|**contentFilter** | [**ContentFilterEnum**](#ContentFilterEnum) | The authenticated user&#39;s content filters.  Option descriptions:  * &#x60;drugs&#x60; - The content contains drug or alcohol use.  * &#x60;language&#x60; - The content contains profanity or sexually suggestive language.  * &#x60;nudity&#x60; - The content contains nudity.  * &#x60;safe&#x60; - The content is suitable for all audiences.  * &#x60;unrated&#x60; - The content hasn&#39;t been rated.  * &#x60;violence&#x60; - The content contains violence or is graphic.  |  [optional] |
|**createdTime** | **String** | The time in ISO 8601 format when the user account was created. |  |
|**gender** | **String** | The authenticated user&#39;s gender. |  |
|**hasInvalidEmail** | **Boolean** | Whether the user&#39;s email is invalid. |  |
|**isExpert** | **Boolean** | Whether the creator enrolled in and successfully completed the Vimeo Experts program. |  |
|**link** | **String** | The absolute URL of the authenticated users&#39;s profile page. |  |
|**location** | **String** | The authenticated user&#39;s location. |  |
|**locationDetails** | [**Location**](Location.md) | The authenticated user&#39;s location details. |  |
|**metadata** | [**UserMetadata**](UserMetadata.md) |  |  |
|**name** | **String** | The authenticated user&#39;s display name. |  |
|**pictures** | [**Picture**](Picture.md) | The active portrait of the authenticated user. |  |
|**preferences** | [**UserPreferences**](UserPreferences.md) |  |  |
|**resourceKey** | **String** | The authenticated user&#39;s resource key string. |  |
|**shortBio** | **String** | The authenticated user&#39;s short bio text. |  |
|**skills** | [**List&lt;Skill&gt;**](Skill.md) | A list of the authenticated user&#39;s skills. |  |
|**uploadQuota** | [**UserUploadQuota**](UserUploadQuota.md) |  |  |
|**uri** | **String** | The authenticated user&#39;s canonical relative URI. |  |
|**websites** | [**List&lt;UserWebsitesInner&gt;**](UserWebsitesInner.md) | The authenticated user&#39;s websites. |  |



## Enum: AccountEnum

| Name | Value |
|---- | -----|
| ADVANCED | &quot;advanced&quot; |
| BASIC | &quot;basic&quot; |
| BUSINESS | &quot;business&quot; |
| ENTERPRISE | &quot;enterprise&quot; |
| FREE | &quot;free&quot; |
| LIVE_BUSINESS | &quot;live_business&quot; |
| LIVE_PREMIUM | &quot;live_premium&quot; |
| LIVE_PRO | &quot;live_pro&quot; |
| PLUS | &quot;plus&quot; |
| PRO | &quot;pro&quot; |
| PRO_UNLIMITED | &quot;pro_unlimited&quot; |
| PRODUCER | &quot;producer&quot; |
| STANDARD | &quot;standard&quot; |
| STARTER | &quot;starter&quot; |



## Enum: ContentFilterEnum

| Name | Value |
|---- | -----|



