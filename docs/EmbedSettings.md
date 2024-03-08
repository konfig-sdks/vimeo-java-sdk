

# EmbedSettings


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**title** | [**EmbedSettingsTitle**](EmbedSettingsTitle.md) |  |  |
|**airplay** | **Boolean** | Whether AirPlay is enabled in the embeddable player. |  |
|**audioTracks** | **Boolean** | Whether multiple audio tracks can appear in the embeddable player. |  |
|**autopip** | **Boolean** | Whether automatic picture-in-picture is enabled. |  |
|**badges** | [**EmbedSettingsBadges**](EmbedSettingsBadges.md) |  |  |
|**buttons** | [**EmbedSettingsButtons**](EmbedSettingsButtons.md) |  |  |
|**cards** | [**List&lt;EmbedSettingsCardsInner&gt;**](EmbedSettingsCardsInner.md) | A collection of cards associated with the selected video. |  |
|**chapters** | **Boolean** | Whether chapters are enabled in the embeddable player. |  |
|**chromecast** | **Boolean** | Whether the Chromecast button appears in the embeddable player. |  |
|**closedCaptions** | **Boolean** | Whether closed captions are enabled in the embeddable player. |  |
|**color** | **String** | The first player color, which controls the color of the progress bar, buttons, and more. |  |
|**colors** | [**EmbedSettingsColors**](EmbedSettingsColors.md) |  |  |
|**emailCaptureForm** | [**EmailCaptureForm**](EmailCaptureForm.md) | The email capture form settings associated with the video. |  |
|**endScreen** | [**EmbedSettingsEndScreen**](EmbedSettingsEndScreen.md) |  |  |
|**eventSchedule** | **Boolean** | Whether the embedded player should display the event schedule. |  |
|**hasCards** | **Boolean** | Whether the video has cards. |  |
|**html** | **String** | The HTML code for embedding the video on a web page. |  [optional] |
|**interactive** | **Boolean** | Whether the video is an interactive video. |  |
|**logos** | [**EmbedSettingsLogos**](EmbedSettingsLogos.md) |  |  |
|**outroType** | [**OutroTypeEnum**](#OutroTypeEnum) | The type of the video outro.  Option descriptions:  * &#x60;beginning&#x60; - The outro is a thumbnail.  * &#x60;custom&#x60; - The outro is custom.  * &#x60;email&#x60; - The outro is an email form.  * &#x60;image&#x60; - The outro is an image.  * &#x60;link&#x60; - The outro is a link.  * &#x60;loop&#x60; - The outro is a loop.  * &#x60;nothing&#x60; - There is no outro.  * &#x60;share&#x60; - The outro is a share button.  * &#x60;text&#x60; - The outro is text.  * &#x60;threevideos&#x60; - The outro is three video suggestions.  * &#x60;videos&#x60; - The outro is video suggestions.  |  |
|**pip** | **Boolean** | Whether picture-in-picture is enabled and the button appears in the embeddable player. |  |
|**playButton** | [**EmbedSettingsPlayButton**](EmbedSettingsPlayButton.md) |  |  |
|**playbar** | **Boolean** | Whether the playbar appears in the embeddable player. |  |
|**qualitySelector** | **Boolean** | Whether the quality selector appears in the embeddable player. |  |
|**showTimezone** | **Boolean** | Whether the embedded player should display the schedule timezone. |  |
|**speed** | **Boolean** | Whether the speed controls appear in the embeddable player. |  |
|**transcript** | **Boolean** | Whether the transcript controls appear in the embeddable player. |  |
|**uri** | **String** | The URI of the embed preset. |  [optional] |
|**volume** | **Boolean** | Whether the volume controls appear in the embeddable player. |  |



## Enum: OutroTypeEnum

| Name | Value |
|---- | -----|
| BEGINNING | &quot;beginning&quot; |
| CUSTOM | &quot;custom&quot; |
| EMAIL | &quot;email&quot; |
| IMAGE | &quot;image&quot; |
| LINK | &quot;link&quot; |
| LOOP | &quot;loop&quot; |
| NOTHING | &quot;nothing&quot; |
| SHARE | &quot;share&quot; |
| TEXT | &quot;text&quot; |
| THREEVIDEOS | &quot;threevideos&quot; |
| VIDEOS | &quot;videos&quot; |



