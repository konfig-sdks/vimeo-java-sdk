

# PresetSettings

The contents of the preset group.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**title** | [**TitleEnum**](#TitleEnum) | How the embeddable player handles the video title.  Option descriptions:  * &#x60;hide&#x60; - The title is hidden.  * &#x60;show&#x60; - The title is shown.  * &#x60;user&#x60; - The title can be toggled to &#x60;show&#x60; or &#x60;hide&#x60; by the user.  |  |
|**airplay** | **Boolean** | Whether AirPlay is enabled in the embeddable player. |  |
|**audioTracks** | **Boolean** | Whether multiple audio tracks can appear in the embeddable player. |  |
|**buttons** | [**PresetSettingsButtons**](PresetSettingsButtons.md) |  |  |
|**byline** | [**BylineEnum**](#BylineEnum) | How the embeddable player handles the video owner&#39;s information.  Option descriptions:  * &#x60;hide&#x60; - The owner&#39;s information is hidden.  * &#x60;show&#x60; - The owner&#39;s information is shown.  * &#x60;user&#x60; - The owner&#39;s information can be toggled to &#x60;show&#x60; or &#x60;hide&#x60; by the user.  |  |
|**chapters** | **Boolean** | Whether chapters are enabled in the embeddable player. |  |
|**chromecast** | **Boolean** | Whether the Chromecast button appears in the embeddable player. |  |
|**closedCaptions** | **Boolean** | Whether closed captions are enabled in the embeddable player. |  |
|**color** | **String** | The first player color, which controls the color of the progress bar, buttons, and more. |  |
|**colors** | [**PresetSettingsColors**](PresetSettingsColors.md) |  |  |
|**logos** | [**PresetSettingsLogos**](PresetSettingsLogos.md) |  |  |
|**outro** | [**PresetSettingsOutro**](PresetSettingsOutro.md) |  |  |
|**pip** | **Boolean** | Whether picture-in-picture is enabled and the button appears in the embeddable player. |  |
|**playButton** | [**PresetSettingsPlayButton**](PresetSettingsPlayButton.md) |  |  |
|**playbar** | **Boolean** | Whether the playbar appears in the embeddable player. |  |
|**portrait** | [**PortraitEnum**](#PortraitEnum) | How the embeddable player handles the video owner&#39;s portrait.  Option descriptions:  * &#x60;hide&#x60; - The owner&#39;s portrait is hidden.  * &#x60;show&#x60; - The owner&#39;s portrait is shown.  * &#x60;user&#x60; - The owner&#39;s portrait can be toggled to &#x60;show&#x60; or &#x60;hide&#x60; by the user.  |  |
|**qualitySelector** | **Boolean** | Whether to show the quality selector in the embeddable player. |  |
|**speed** | **Boolean** | Whether the speed controls appear in the embeddable player. |  |
|**transcript** | **Boolean** | Whether the transcript controls appear in the embeddable player. |  |
|**volume** | **Boolean** | Whether the volume controls appear in the embeddable player. |  |



## Enum: TitleEnum

| Name | Value |
|---- | -----|
| HIDE | &quot;hide&quot; |
| SHOW | &quot;show&quot; |
| USER | &quot;user&quot; |



## Enum: BylineEnum

| Name | Value |
|---- | -----|
| HIDE | &quot;hide&quot; |
| SHOW | &quot;show&quot; |
| USER | &quot;user&quot; |



## Enum: PortraitEnum

| Name | Value |
|---- | -----|
| HIDE | &quot;hide&quot; |
| SHOW | &quot;show&quot; |
| USER | &quot;user&quot; |



