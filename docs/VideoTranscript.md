

# VideoTranscript

The transcript information of the video. This data requires a bearer token with the `private` scope.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**language** | **String** | The video transcript&#39;s language. This data requires a bearer token with the &#x60;private&#x60; scope. |  |
|**status** | [**StatusEnum**](#StatusEnum) | The video transcript&#39;s availability status. This data requires a bearer token with the &#x60;private&#x60; scope.  Option descriptions:  * &#x60;completed&#x60; - Transcription is completed. The transcript is available.  * &#x60;failed&#x60; - There was a transcription error. The transcript isn&#39;t available.  * &#x60;in_progress&#x60; - Transcription is currently underway. The transcript isn&#39;t available yet.  * &#x60;language_not_supported&#x60; - We currently don&#39;t support transcribing audio for this video&#39;s language.  * &#x60;no_speech&#x60; - Transcription was completed, but there were no words in the audio to transcribe.  * &#x60;not_started&#x60; - The transcript job hasn&#39;t started.  * &#x60;unknown&#x60; - There isn&#39;t a record of this video&#39;s transcription job.  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| COMPLETED | &quot;completed&quot; |
| FAILED | &quot;failed&quot; |
| IN_PROGRESS | &quot;in_progress&quot; |
| LANGUAGE_NOT_SUPPORTED | &quot;language_not_supported&quot; |
| NO_SPEECH | &quot;no_speech&quot; |
| NOT_STARTED | &quot;not_started&quot; |
| UNKNOWN | &quot;unknown&quot; |



