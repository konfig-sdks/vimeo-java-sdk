

# LiveEventDestination


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**displayName** | **String** | The name of the destination target, whether a page, profile name, or the like. |  |
|**id** | **Double** | The ID of the destination. |  |
|**isEnabled** | **Boolean** | Whether the destination is enabled. |  |
|**liveClipId** | **Double** | The ID of the live video. |  |
|**privacy** | [**PrivacyEnum**](#PrivacyEnum) | The privacy setting of the destination.  Option descriptions:  * &#x60;CONNECTIONS&#x60; - The privacy setting is &#x60;CONNECTIONS&#x60; for LinkedIn.  * &#x60;PUBLIC&#x60; - The privacy setting is &#x60;PUBLIC&#x60; for LinkedIn.  * &#x60;all_friends&#x60; - The privacy setting is &#x60;all_friends&#x60; for Facebook.  * &#x60;everyone&#x60; - The privacy setting is &#x60;everyone&#x60; for Facebook.  * &#x60;private&#x60; - The privacy setting is &#x60;private&#x60; for YouTube.  * &#x60;public&#x60; - The privacy setting is &#x60;public&#x60; for YouTube.  * &#x60;self&#x60; - The privacy setting is &#x60;self&#x60; for Facebook.  * &#x60;unlisted&#x60; - The privacy setting is &#x60;unlisted&#x60; for YouTube.  |  |
|**providerBroadcastId** | **String** | The destination ID of the destination service. |  |
|**providerDestinationId** | **String** | The broadcast ID of the destination service. |  |
|**providerUserId** | **String** | The user ID of the destination service. |  |
|**providerVideoId** | **String** | The ID of the scheduled live video. |  |
|**scheduledAt** | **Double** | The time in Unix timestamp format when live streaming is scheduled to start. |  |
|**serviceName** | [**ServiceNameEnum**](#ServiceNameEnum) | The name of the destination service.  Option descriptions:  * &#x60;custom_rtmp&#x60; - The destination service is custom RTMP.  * &#x60;facebook&#x60; - The destination service is Facebook Live.  * &#x60;linkedin&#x60; - The destination service is LinkedIn Live.  * &#x60;youtube&#x60; - The destination service is YouTube Live.  |  |
|**state** | [**StateEnum**](#StateEnum) | The status of the destination.  Option descriptions:  * &#x60;0&#x60; - The status is OK.  * &#x60;1&#x60; - An error occurred. Check the &#x60;state_message&#x60; field for details.  |  |
|**stateMessage** | **String** | The message that describes the state of the destination. |  |
|**streamKey** | **String** | The stream key for the simulcast destination. |  |
|**streamUrl** | **String** | The RTMP URL to stream to. |  |
|**type** | [**TypeEnum**](#TypeEnum) | The type of the simulcast destination.  Option descriptions:  * &#x60;channel&#x60; - The destination is a YouTube channel.  * &#x60;custom&#x60; - The destination is custom.  * &#x60;organization&#x60; - The destination is a LinkedIn organization.  * &#x60;page&#x60; - The destination is a Facebook page.  * &#x60;profile&#x60; - The destination is a Facebook or LinkedIn profile.  |  |
|**userId** | **Double** | The ID of the destination&#39;s owner. |  |



## Enum: PrivacyEnum

| Name | Value |
|---- | -----|
| CONNECTIONS | &quot;CONNECTIONS&quot; |
| PUBLIC | &quot;PUBLIC&quot; |
| ALL_FRIENDS | &quot;all_friends&quot; |
| EVERYONE | &quot;everyone&quot; |
| PRIVATE | &quot;private&quot; |
| PUBLIC | &quot;public&quot; |
| SELF | &quot;self&quot; |
| UNLISTED | &quot;unlisted&quot; |



## Enum: ServiceNameEnum

| Name | Value |
|---- | -----|
| CUSTOM_RTMP | &quot;custom_rtmp&quot; |
| FACEBOOK | &quot;facebook&quot; |
| LINKEDIN | &quot;linkedin&quot; |
| YOUTUBE | &quot;youtube&quot; |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| _0 | &quot;0&quot; |
| _1 | &quot;1&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| CHANNEL | &quot;channel&quot; |
| CUSTOM | &quot;custom&quot; |
| ORGANIZATION | &quot;organization&quot; |
| PAGE | &quot;page&quot; |
| PROFILE | &quot;profile&quot; |



