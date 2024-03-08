

# LiveEventDestinationsCreateOneTimeLiveEventDestinationRequest1


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**displayName** | **String** | The title to display for the simulcast. |  |
|**isEnabled** | **Boolean** | Whether the destination is enabled for simulcasting. |  [optional] |
|**privacy** | [**PrivacyEnum**](#PrivacyEnum) | The privacy setting of the destination. Be sure to choose a value that corresponds to your service.  Option descriptions:  * &#x60;CONNECTIONS&#x60; - The privacy setting is &#x60;CONNECTIONS&#x60; for LinkedIn.  * &#x60;PUBLIC&#x60; - The privacy setting is &#x60;PUBLIC&#x60; for LinkedIn.  * &#x60;all_friends&#x60; - The privacy setting is &#x60;all_friends&#x60; for Facebook.  * &#x60;everyone&#x60; - The privacy setting is &#x60;everyone&#x60; for Facebook.  * &#x60;private&#x60; - The privacy setting is &#x60;private&#x60; for YouTube.  * &#x60;public&#x60; - The privacy setting is &#x60;public&#x60; for YouTube.  * &#x60;self&#x60; - The privacy setting is &#x60;self&#x60; for Facebook.  * &#x60;unlisted&#x60; - The privacy setting is &#x60;unlisted&#x60; for YouTube.  |  [optional] |
|**providerDestinationId** | **String** | The ID of the destination on the specified service, such as the YouTube channel ID or the Facebook page ID. |  [optional] |
|**providerVideoId** | **String** | The ID of the scheduled video. |  [optional] |
|**scheduledAt** | **Double** | The time in Unix timestamp format when live streaming is scheduled to start. |  [optional] |
|**serviceName** | [**ServiceNameEnum**](#ServiceNameEnum) | The service to simulcast to.  Option descriptions:  * &#x60;custom_rtmp&#x60; - Simulcast to a custom service.  * &#x60;facebook&#x60; - Simulcast to Facebook Live.  * &#x60;linkedin&#x60; - Simulcast to LinkedIn Live.  * &#x60;youtube&#x60; - Simulcast to YouTube Live.  |  |
|**streamKey** | **String** | The RTMP stream key. |  [optional] |
|**streamUrl** | **String** | The RTMP URL for receiving the video stream. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | The type of the simulcast destination.  Option descriptions:  * &#x60;channel&#x60; - The destination is a YouTube channel.  * &#x60;custom&#x60; - The destination is custom.  * &#x60;organization&#x60; - The destination is a LinkedIn organization.  * &#x60;page&#x60; - The destination is a Facebook page.  * &#x60;profile&#x60; - The destination is a Facebook or LinkedIn profile.  |  |



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



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| CHANNEL | &quot;channel&quot; |
| CUSTOM | &quot;custom&quot; |
| ORGANIZATION | &quot;organization&quot; |
| PAGE | &quot;page&quot; |
| PROFILE | &quot;profile&quot; |



