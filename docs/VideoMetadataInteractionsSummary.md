

# VideoMetadataInteractionsSummary

Information about whether the current user can create or get a summary for the video.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**disabled** | **Boolean** | Whether the summary method is disabled. |  |
|**options** | **List&lt;String&gt;** | An array of HTTP methods permitted on this URI. |  |
|**reason** | [**ReasonEnum**](#ReasonEnum) | The reason why the summary method is disabled.  Option descriptions:  * &#x60;transcript_ready_but_not_english&#x60; - The transcript is ready, but isn&#39;t in English.  * &#x60;transcript_status_does_not_exist&#x60; - The transcript doesn&#39;t exist.  * &#x60;transcript_status_exceeds_maximum_duration&#x60; - The transcript duration is too long.  * &#x60;transcript_status_failed&#x60; - The transcript job failed.  * &#x60;transcript_status_in_progress&#x60; - The transcript job is in progress.  * &#x60;transcript_status_language_not_supported&#x60; - The transcript&#39;s language isn&#39;t supported.  * &#x60;transcript_status_no_speech&#x60; - There&#39;s no speech detected for the transcript.  * &#x60;transcript_status_not_started&#x60; - The transcript job hasn&#39;t started.  * &#x60;transcript_status_unknown&#x60; - The transcript job status is unknown.  * &#x60;video_not_ready&#x60; - The video isn&#39;t ready.  * &#x60;video_too_short&#x60; - The video is too short.  |  |
|**uri** | **String** | The API URI that resolves to the connection data. |  |



## Enum: ReasonEnum

| Name | Value |
|---- | -----|
| TRANSCRIPT_READY_BUT_NOT_ENGLISH | &quot;transcript_ready_but_not_english&quot; |
| TRANSCRIPT_STATUS_DOES_NOT_EXIST | &quot;transcript_status_does_not_exist&quot; |
| TRANSCRIPT_STATUS_EXCEEDS_MAXIMUM_DURATION | &quot;transcript_status_exceeds_maximum_duration&quot; |
| TRANSCRIPT_STATUS_FAILED | &quot;transcript_status_failed&quot; |
| TRANSCRIPT_STATUS_IN_PROGRESS | &quot;transcript_status_in_progress&quot; |
| TRANSCRIPT_STATUS_LANGUAGE_NOT_SUPPORTED | &quot;transcript_status_language_not_supported&quot; |
| TRANSCRIPT_STATUS_NO_SPEECH | &quot;transcript_status_no_speech&quot; |
| TRANSCRIPT_STATUS_NOT_STARTED | &quot;transcript_status_not_started&quot; |
| TRANSCRIPT_STATUS_UNKNOWN | &quot;transcript_status_unknown&quot; |
| VIDEO_NOT_READY | &quot;video_not_ready&quot; |
| VIDEO_TOO_SHORT | &quot;video_too_short&quot; |



