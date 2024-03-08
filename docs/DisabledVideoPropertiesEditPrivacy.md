

# DisabledVideoPropertiesEditPrivacy

An object that represents the reason why privacy editing is disabled for the video.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**enableLink** | **String** | The relative link to upgrade to privacy editing. |  |
|**keyPath** | **String** | The path to the edit privacy interaction object in the video response. |  |
|**minTierForCapability** | [**MinTierForCapabilityEnum**](#MinTierForCapabilityEnum) | The capability required to activate privacy editing.  Option descriptions:  * &#x60;basic&#x60; - The user must have at least a Vimeo Basic account.  * &#x60;business&#x60; - The user must have at least a Vimeo Business account.  * &#x60;enterprise&#x60; - The user must have at least a Vimeo Enterprise account.  * &#x60;live_business&#x60; - The user must have at least a Vimeo Business Live account.  * &#x60;live_premium&#x60; - The user must have at least a Vimeo Premium account.  * &#x60;live_pro&#x60; - The user must have at least a Vimeo Pro Live account.  * &#x60;plus&#x60; - The user must have at least a Vimeo Plus account.  * &#x60;pro&#x60; - The user must have at least a Vimeo Pro account.  * &#x60;pro_unlimited&#x60; - The user must have at least a Vimeo Pro Unlimited account.  * &#x60;producer&#x60; - The user must have at least a Vimeo Producer account.  |  |
|**reasons** | [**List&lt;DisabledVideoPropertiesEditPrivacyReasonsInner&gt;**](DisabledVideoPropertiesEditPrivacyReasonsInner.md) | The reasons why privacy editing is disabled for the video. |  |



## Enum: MinTierForCapabilityEnum

| Name | Value |
|---- | -----|
| BASIC | &quot;basic&quot; |
| BUSINESS | &quot;business&quot; |
| ENTERPRISE | &quot;enterprise&quot; |
| LIVE_BUSINESS | &quot;live_business&quot; |
| LIVE_PREMIUM | &quot;live_premium&quot; |
| LIVE_PRO | &quot;live_pro&quot; |
| PLUS | &quot;plus&quot; |
| PRO | &quot;pro&quot; |
| PRO_UNLIMITED | &quot;pro_unlimited&quot; |
| PRODUCER | &quot;producer&quot; |



