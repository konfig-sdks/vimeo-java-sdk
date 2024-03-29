

# LiveEventRecurring


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**title** | **String** | The title of the event. This field is also optionally used as the base title for videos created by streaming to the event. |  |
|**album** | **List&lt;String&gt;** | Information about the associated showcase. |  |
|**allowShareLink** | **Boolean** | Whether the share link for the videos generated by streaming to the event is usable. |  |
|**allowedPrivacies** | **List&lt;String&gt;** | An array of privacy settings supported for this event and the requesting user. |  |
|**autoCcEnabled** | **Boolean** | Whether the automated closed captions feature is enabled. |  |
|**autoCcKeywords** | **String** | A comma-separated list of keywords for enhancing the speech detection of automated closed captions. |  |
|**autoCcLanguage** | [**AutoCcLanguageEnum**](#AutoCcLanguageEnum) | The language of the automated closed captions.  Option descriptions:  * &#x60;de-DE&#x60; - The language is German.  * &#x60;en-US&#x60; - The language is English.  * &#x60;es-ES&#x60; - The language is Spanish.  * &#x60;fr-FR&#x60; - The language is French.  * &#x60;pt-BR&#x60; - The language is Portuguese.  |  |
|**autoCcRemaining** | **Double** | The amount of time remaining to the user to access the automated closed captions feature. |  |
|**automaticallyTitleStream** | **Boolean** | When the value of this field is &#x60;true&#x60;, the title for the next video in the event is generated based on the time of the stream and the **title** field of the event. |  |
|**chatEnabled** | **Boolean** | Whether to display live chat on the event page on Vimeo. |  |
|**completedOn** | **String** | The time in ISO 8601 format when the event was completed. |  |
|**contentRating** | [**ContentRatingEnum**](#ContentRatingEnum) | The event&#39;s granular content ratings.  Option descriptions:  * &#x60;advertisement&#x60; - The event contains advertisements.  * &#x60;drugs&#x60; - The event contains drug or alcohol use.  * &#x60;language&#x60; - The event contains profanity or sexually suggestive content.  * &#x60;nudity&#x60; - The event contains nudity.  * &#x60;safe&#x60; - The event is safe for all audiences.  * &#x60;unrated&#x60; - The event hasn&#39;t been rated.  * &#x60;violence&#x60; - The event contains violence.  |  |
|**createdTime** | **String** | The time in ISO 8601 format when the event was created. |  |
|**dvr** | **Boolean** | Whether the DVR feature is enabled. |  |
|**emailQuota** | [**LiveEventRecurringEmailQuota**](LiveEventRecurringEmailQuota.md) |  |  |
|**embed** | [**LiveEventRecurringEmbed**](LiveEventRecurringEmbed.md) |  |  |
|**fromShowcase** | **Boolean** | Whether the event was created from a showcase. |  |
|**fromWebinar** | **Boolean** | Whether the event was created from a webinar. |  [optional] |
|**headClip** | **Object** | The first video to be played in the playlist. |  |
|**interactionToolsSettings** | [**List&lt;LiveEventInteractionToolsSettingsInner&gt;**](LiveEventInteractionToolsSettingsInner.md) | The settings for the interaction tools. |  |
|**latency** | [**LatencyEnum**](#LatencyEnum) | The type of latency.  Option descriptions:  * &#x60;fail-safe&#x60; - The latency is in the failsafe range, with a delay of 60-75 seconds.  * &#x60;low&#x60; - The latency is low, with a delay of 5-7 seconds.  * &#x60;standard&#x60; - The latency is standard, with a delay of 15-20 seconds.  |  |
|**leadUuid** | **String** | The unique ID for the registered viewer. |  |
|**link** | **String** | The URI to access the event on Vimeo. |  |
|**liveClips** | **List&lt;String&gt;** | A list of videos belonging to the event, including their video IDs and dates streamed. |  |
|**liveDestinations** | **List&lt;String&gt;** | _This field is deprecated in favor of the following method:_ [Get all the destinations of a one-time live event](https://developer.vimeo.com/api/reference/live#get_one_time_event_destinations). |  |
|**lowLatency** | **Boolean** | Whether the low-latency feature is enabled. |  |
|**metadata** | [**LiveEventRecurringMetadata**](LiveEventRecurringMetadata.md) |  |  |
|**nextOccurrenceTime** | **String** | The date in ISO 8601 format on which the next occurrence of the event is expected to be live. |  |
|**parentFolder** | [**Project**](Project.md) | Information about the folder that contains the event. |  |
|**pictures** | [**Picture**](Picture.md) | The active thumbnail image of the event. |  |
|**playlistSort** | [**PlaylistSortEnum**](#PlaylistSortEnum) | The order in which the videos inside the event appear in the playlist.  Option descriptions:  * &#x60;added_first&#x60; - The videos appear according to when they were added to the event, with the most recently added first.  * &#x60;added_last&#x60; - The videos appear according to when they were added to the event, with the most recently added last.  * &#x60;alphabetical&#x60; - The videos appear alphabetically by their title.  * &#x60;arranged&#x60; - The videos appear as arranged by the owner of the event.  * &#x60;comments&#x60; - The videos appear according to their number of comments.  * &#x60;duration&#x60; - The videos appear in order of duration.  * &#x60;likes&#x60; - The videos appear according to their number of likes.  * &#x60;newest&#x60; - The videos appear in chronological order, with the newest first.  * &#x60;oldest&#x60; - The videos appear in chronological order, with the oldest first.  * &#x60;plays&#x60; - The videos appear according to their number of plays.  |  |
|**preferredStreamMethod** | [**PreferredStreamMethodEnum**](#PreferredStreamMethodEnum) | The preferred streaming method.  Option descriptions:  * &#x60;browser&#x60; - Stream in the browser.  * &#x60;encoder&#x60; - Stream by the encoder.  |  |
|**rtmpLink** | **String** | The upstream RTMP link. Send your live content to this link to create a live video on the event. |  |
|**rtmpPreview** | **Boolean** | Whether to preview the RTMP stream before the event goes live. |  |
|**rtmpsLink** | **String** | The upstream RTMPS link. Send your live content to this link to create a live video on the event. |  |
|**schedule** | [**LiveEventSchedule**](LiveEventSchedule.md) | The description of the time or times that the event is expected to be live. |  |
|**scheduledPlayback** | **Boolean** | Whether the scheduled playback feature is enabled. |  |
|**status** | [**StatusEnum**](#StatusEnum) | The status of the event.  Option descriptions:  * &#x60;ended&#x60; - The user ended the event.  * &#x60;started&#x60; - The user started the event.  |  |
|**streamDescription** | **String** | The description of the next video streamed to the event. |  |
|**streamKey** | **String** | The stream key used in conjunction with the RTMP and RTMPS links. |  |
|**streamMode** | [**StreamModeEnum**](#StreamModeEnum) | The stream mode of the event.  Option descriptions:  * &#x60;live&#x60; - The stream is live playback.  * &#x60;record&#x60; - The stream is in record mode.  * &#x60;simulive&#x60; - The stream is scheduled media playback.  |  |
|**streamPassword** | **String** | The password that anyone can use to access the videos generated by streaming to the event. |  |
|**streamPrivacy** | [**LiveEventRecurringStreamPrivacy**](LiveEventRecurringStreamPrivacy.md) |  |  |
|**streamTitle** | **String** | The title of the next video streamed to the event. This field applies only when **automatically_title_stream** is &#x60;false&#x60;. |  |
|**streamableClip** | **Object** | The event&#39;s video. An event always has a video, which is either in a pre-live state (ready to be streamed to) or in a live state (which is currently being streamed to). |  |
|**timeZone** | **String** | The time zone used in resolving the timestamps included in auto-generated video titles. |  |
|**unlimitedAutoCc** | **Boolean** | Whether to ignore the time limit of the automated closed captions feature. |  |
|**unlimitedDuration** | **Boolean** | Whether 24/7 streaming is enabled for the event. |  |
|**uri** | **String** | The event&#39;s canonical relative URI. |  |
|**user** | [**User**](User.md) | The owner of the event. |  |
|**viewLink** | **String** | The URI to access the event on Vimeo with or without an unlisted hash. |  |
|**webinar** | **List&lt;String&gt;** | Information about the associated webinar. |  |



## Enum: AutoCcLanguageEnum

| Name | Value |
|---- | -----|
| DE_DE | &quot;de-DE&quot; |
| EN_US | &quot;en-US&quot; |
| ES_ES | &quot;es-ES&quot; |
| FR_FR | &quot;fr-FR&quot; |
| PT_BR | &quot;pt-BR&quot; |



## Enum: ContentRatingEnum

| Name | Value |
|---- | -----|



## Enum: LatencyEnum

| Name | Value |
|---- | -----|
| FAIL_SAFE | &quot;fail-safe&quot; |
| LOW | &quot;low&quot; |
| STANDARD | &quot;standard&quot; |



## Enum: PlaylistSortEnum

| Name | Value |
|---- | -----|
| ADDED_FIRST | &quot;added_first&quot; |
| ADDED_LAST | &quot;added_last&quot; |
| ALPHABETICAL | &quot;alphabetical&quot; |
| ARRANGED | &quot;arranged&quot; |
| COMMENTS | &quot;comments&quot; |
| DURATION | &quot;duration&quot; |
| LIKES | &quot;likes&quot; |
| NEWEST | &quot;newest&quot; |
| OLDEST | &quot;oldest&quot; |
| PLAYS | &quot;plays&quot; |



## Enum: PreferredStreamMethodEnum

| Name | Value |
|---- | -----|
| BROWSER | &quot;browser&quot; |
| ENCODER | &quot;encoder&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ENDED | &quot;ended&quot; |
| STARTED | &quot;started&quot; |



## Enum: StreamModeEnum

| Name | Value |
|---- | -----|
| LIVE | &quot;live&quot; |
| RECORD | &quot;record&quot; |
| SIMULIVE | &quot;simulive&quot; |



