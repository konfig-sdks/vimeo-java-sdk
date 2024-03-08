

# LiveEventEmbed

The event's embed data.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**title** | **Boolean** | Whether the embedded RLE player should display the video title. |  |
|**airplay** | **Boolean** | Whether AirPlay is enabled in the embeddable player. |  |
|**autoplay** | **Boolean** | Whether the embedded RLE player should autoplay the RLE content. |  |
|**availablePlayerLogos** | **List&lt;String&gt;** | The list of user-uploaded logos for configuration of the embed player. |  |
|**byline** | **Boolean** | Whether the embedded RLE player should display the author&#39;s name. |  |
|**chatEmbedSource** | **String** | The chat&#39;s iFrame source URL. |  |
|**chromecast** | **Boolean** | Whether the Chromecast button appears in the embeddable player. |  |
|**closedCaptions** | **Boolean** | Whether closed captions are enabled in the embeddable player. |  |
|**color** | **String** | The first player color, which controls the color of the progress bar, buttons, and more. |  |
|**colors** | [**LiveEventEmbedColors**](LiveEventEmbedColors.md) |  |  |
|**embedChat** | **String** | The embed code for RLE chat. |  |
|**embedProperties** | [**LiveEventEmbedEmbedProperties**](LiveEventEmbedEmbedProperties.md) |  |  |
|**eventSchedule** | **Boolean** | Whether the embedded RLE player should display the event schedule. |  |
|**fullscreenButton** | **Boolean** | Whether the embedded RLE player should include the fullscreen controls. |  |
|**hideLiveLabel** | **Boolean** | Whether the Live label should be visible over the player. |  |
|**hideViewerCount** | **Boolean** | Whether the embedded RLE player should hide the viewer counter. |  |
|**html** | **String** | The fixed HTML code to embed the event&#39;s playlist on a website. |  |
|**likeButton** | **Boolean** | Whether the embedded RLE player should include the &#x60;like&#x60; button. |  |
|**logos** | [**LiveEventEmbedLogos**](LiveEventEmbedLogos.md) |  |  |
|**loop** | **Boolean** | Whether the embedded RLE player should loop back to the first video once content is exhausted. |  |
|**pip** | **Boolean** | Whether picture-in-picture is enabled and the button appears in the embeddable player. |  |
|**playButtonPosition** | [**PlayButtonPositionEnum**](#PlayButtonPositionEnum) | The position of the player&#39;s play button.  Option descriptions:  * &#x60;0&#x60; - The play button has the default position.  * &#x60;1&#x60; - The play button appears at the bottom of the interface.  * &#x60;2&#x60; - The play button appears in the center of the interface.  |  |
|**playbar** | **Boolean** | Whether the embedded RLE player should include the playbar. |  |
|**playlist** | **Boolean** | Whether the playlist component appears in the embeddable player for this RLE. |  |
|**portrait** | **Boolean** | Whether the embedded RLE player should display the author&#39;s portrait. |  |
|**responsiveHtml** | **String** | The responsive HTML code to embed the event&#39;s playlist on a website. |  |
|**schedule** | **Boolean** | Whether the schedule component appears in the embeddable player for this RLE. |  |
|**showLatestArchivedClip** | **Boolean** | Whether the embedded RLE player should display the latest video placeholder. |  |
|**showTimezone** | **Boolean** | Whether the embedded RLE player should display the schedule timezone. |  |
|**useColor** | **String** | Whether the embedded RLE player should use a custom color or the default Vimeo blue. |  |
|**volume** | **Boolean** | Whether the embedded RLE player should include the volume controls. |  |



## Enum: PlayButtonPositionEnum

| Name | Value |
|---- | -----|
| _0 | &quot;0&quot; |
| _1 | &quot;1&quot; |
| _2 | &quot;2&quot; |



